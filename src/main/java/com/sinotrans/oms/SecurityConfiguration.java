package com.sinotrans.oms;

import java.io.IOException;
import java.io.PrintWriter;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.ObjectPostProcessor;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.security.web.authentication.LoginUrlAuthenticationEntryPoint;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.alibaba.fastjson.JSONObject;
import com.sinotrans.boot.security.DefaultWebSecurityConfigurerAdapter;
import com.sinotrans.framework.security.filter.LoginAuthenticationFilter;
import com.sinotrans.oms.common.cache.redis.RedisTemplateUtil;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.security.util.jwt.AccessToken;
import com.sinotrans.oms.security.util.jwt.JwtInfo;
import com.sinotrans.oms.security.util.jwt.JwtUtil;

@Configuration
@EnableWebSecurity
public class SecurityConfiguration extends DefaultWebSecurityConfigurerAdapter {
	@Resource
	private FilterInvocationSecurityMetadataSource resourceSecurityMetadataSource;
	@Autowired
    private AuthenticationProvider securityProvider;
	@Autowired
	private JwtInfo jwtInfo;
	@Autowired
	private RedisTemplateUtil redisTemplateUtil;
	
	@Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        //自定义AuthenticationProvider  
        auth.authenticationProvider(securityProvider);
    }
	
	protected void configure(HttpSecurity http) throws Exception {
		http
		//取消安全报文头 默认开启  可配置部分开启或全关
//		.headers().disable()
		//关闭csrf
		.csrf().disable()
		//登录页面url 配置登录成功后调用的方法
		.formLogin()
//		.loginPage("/login")
		 //登陆成功回调
		.successHandler(new AuthenticationSuccessHandler() {
			@Override
			public void onAuthenticationSuccess(HttpServletRequest httpServletRequest,
					HttpServletResponse httpServletResponse, Authentication paramAuthentication)
					throws IOException, ServletException {
				httpServletResponse.setCharacterEncoding("UTF-8");
            	httpServletResponse.setContentType("application/json; charset=utf-8");
            	//给客户端一个200的反馈让客户端在success中处理反馈信息
            	httpServletResponse.setStatus(HttpServletResponse.SC_OK);
            	/*
            	 * harley 20180726 以下代码解决服务端跨域，如果有js绕过了zuul直接访问服务端就放开
           	     * httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
           	     * httpServletResponse.setHeader("Access-Control-Allow-Methods", "*");
           	     * httpServletResponse.addHeader("Access-Control-Allow-Credentials","true");
           	     * httpServletResponse.setHeader("Access-Control-Max-Age", "3600");// Access-Control-Max-Age 用于 CORS 相关配置的缓存
            	 * httpServletResponse.setHeader("Access-Control-Allow-Headers","*");
                 */
				UserDetails use = (UserDetails) paramAuthentication.getPrincipal();
				//拼装accessToken
				String accessToken = JwtUtil.createJWT(use.getUsername(), use.getUserId(),
						"ROLE_111", jwtInfo.getClientId(), jwtInfo.getName(),
						jwtInfo.getExpiresSecond() * 1000, jwtInfo.getBase64Secret());
				use.setAccessToken(accessToken);//将token值塞入到userDetail的AccessToken中
				// 存入redis
				try {
					redisTemplateUtil.setJSON(accessToken, use, 60 * 60);
				} catch (Exception e) {
					e.printStackTrace();
				}
				//返回accessToken
				AccessToken accessTokenEntity = new AccessToken();
				accessTokenEntity.setAccess_token(accessToken);
				accessTokenEntity.setExpires_in(jwtInfo.getExpiresSecond());
				accessTokenEntity.setToken_type("bearer");
				
				httpServletResponse.setHeader("token", JSONObject.toJSONString(accessTokenEntity));//设置token信息
				httpServletResponse.setHeader("Access-Control-Expose-Headers", "token");//允许获取头上的某些属性如token属性
	            PrintWriter out = httpServletResponse.getWriter();
	            out.write("{\"status\":\"Y\",\"msg\":\"login success\"}");
	            out.flush();
	            out.close();
			}
		 })
		//登陆失败回调
		.failureHandler(new AuthenticationFailureHandler() {
            @Override
			public void onAuthenticationFailure(HttpServletRequest httpServletRequest,
					HttpServletResponse httpServletResponse, AuthenticationException e)
					throws IOException, ServletException {
            	httpServletResponse.setCharacterEncoding("UTF-8");
            	httpServletResponse.setContentType("application/json; charset=utf-8");
            	//给客户端一个200的反馈让客户端在success中处理反馈信息
            	httpServletResponse.setStatus(HttpServletResponse.SC_OK);
            	/*
	           	 * harley 20180726 以下代码解决服务端跨域，如果有js绕过了zuul直接访问服务端就放开
	       	     * httpServletResponse.setHeader("Access-Control-Allow-Origin", "*");
	       	     * httpServletResponse.setHeader("Access-Control-Allow-Methods", "*");
	       	     * httpServletResponse.addHeader("Access-Control-Allow-Credentials","true");
	       	     * httpServletResponse.setHeader("Access-Control-Max-Age", "3600");// Access-Control-Max-Age 用于 CORS 相关配置的缓存
	        	 * httpServletResponse.setHeader("Access-Control-Allow-Headers","*");
	             */
				PrintWriter out = httpServletResponse.getWriter();
				out.write("{\"status\":\"N\",\"msg\":\""+e.getMessage()+"\"}");
				out.flush();
				out.close();
			}
         })
//		.and().csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
		.loginProcessingUrl("/login.action").permitAll().and()
		// 基于token，所以不需要session
        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS).and()
		.authorizeRequests()
		//配置这些链接无需验证
//		.antMatchers("/regist","/toregist").permitAll()
		//其他的路径都是登录后即可访问
		.anyRequest().authenticated().withObjectPostProcessor(new ObjectPostProcessor<FilterSecurityInterceptor>() {
			public <O extends FilterSecurityInterceptor> O postProcess(O fsi) {
				fsi.setAccessDecisionManager(getAccessDecisionManager());
				try {
					fsi.setAuthenticationManager(authenticationManagerBean());
				} catch (Exception e) {
					e.printStackTrace();
				}
				fsi.setSecurityMetadataSource(resourceSecurityMetadataSource);
				return fsi;
			}
		})
		//路径角色验证
		//.antMatchers("/admin/**").hasRole("ADMIN")
		//排除该路径角色认证  注意顺序自上而下
		//.antMatchers("/**").hasRole("USER")
		//注销登录  默认支持 销毁session并且清空配置的rememberMe()认证 跳转登录页 或配置的注销成功页面
		.and().logout().deleteCookies("remove")
		.invalidateHttpSession(false)
		.logoutUrl("/logout")
		.logoutSuccessUrl("/logoutsuccess")
		.and()
		//http参数中包含一个名为“remember-me”的参数，不管session是否过期，用户记录将会被记保存下来
		.rememberMe()
		//.and()
		//http映射https
		//.portMapper()
		//.http(8080).mapsTo(9443)
		.and()
		//配置http认证
		.httpBasic()
		.and()
		//当用户进行重复登录时  强制销毁前一个登录用户  配置此应用必须添加Listener  HttpSessionEventPublisher
		.sessionManagement().maximumSessions(1).expiredUrl("/login?expired");
		LoginAuthenticationFilter filter = new LoginAuthenticationFilter();
		filter.setAuthenticationManager(this.authenticationManager());
		http.addFilterBefore(filter, BasicAuthenticationFilter.class).exceptionHandling()
				.authenticationEntryPoint(new LoginUrlAuthenticationEntryPoint("/login"));
	}
}