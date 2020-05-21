package com.sinotrans.oms.security.filter;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.cache.redis.RedisTemplateUtil;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.security.util.jwt.AccessToken;
import com.sinotrans.oms.security.util.jwt.JwtInfo;
import com.sinotrans.oms.security.util.jwt.JwtUtil;

/**
 * harley 20180723
 * 用于JWT生成的token认证的过滤器
 * oms 标准服务暂不启用
 */
public class JwtAuthorizeFilter implements Filter {

	/*
	 * 注入配置文件类
	 */
	@Autowired
	private JwtInfo jwtInfo;
	
	@Autowired
	private RedisTemplateUtil redisTemplateUtil;

	@Override
	public void destroy() {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		ResponseData<Object> resultMsg;
		HttpServletRequest httpRequest = (HttpServletRequest) request;
		String auth = httpRequest.getHeader("token");
		if ((auth != null) && (auth.length() > 7)) {
			AccessToken accessTokenEntity = JSON.parseObject(auth, AccessToken.class);
			if (accessTokenEntity != null) {
				if (JwtUtil.parseJWT(accessTokenEntity.getAccess_token(), jwtInfo.getBase64Secret()) != null) {
					// 判断过期，判断是否属于OMS的token
					if ("bearer".equals(accessTokenEntity.getToken_type())) {
						// 从缓存中拿到用户信息看看是不是有效的
						UserDetails userDetail = null;
						try {
							userDetail = redisTemplateUtil.getJSON(accessTokenEntity.getAccess_token(), UserDetails.class);
						} catch (Exception e) {
							e.printStackTrace();
						}
						if (userDetail == null) {
							// 提示信息
						} else {
							// 刷新缓存的时间,不能让缓存写死1小时，当某个用户一直在使用的时候就不断刷新缓存过期时间，只有闲置1小时才需要登录
							redisTemplateUtil.getRedisTemplate().expire(accessTokenEntity.getAccess_token(), 60 * 60, TimeUnit.SECONDS);
							// 构造用户信息
							Authentication authentication = new UsernamePasswordAuthenticationToken(userDetail, userDetail.getPassword(), userDetail.getAuthorities());
							// 设置线程的token用户信息
							SecurityContextHolder.getContext().setAuthentication(authentication);
							chain.doFilter(request, response);
							return;
						}
					}
				}
			}
		}
		// 验证不通过
		HttpServletResponse httpResponse = (HttpServletResponse) response;
		httpResponse.setCharacterEncoding("UTF-8");
		httpResponse.setContentType("application/json; charset=utf-8");
		httpResponse.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
		String method = httpRequest.getMethod();
		//如果是json浏览器会先发起CORS预检请求，先让第一次Options返回200，然后才有下一次请求
		if ("OPTIONS".equals(method)) {
			httpResponse.setStatus(HttpServletResponse.SC_OK);
			return;
		}
		// 将验证不通过的错误返回
		/*
		 * INVALID_CLIENTID(30003, "Invalid clientid"),
			INVALID_PASSWORD(30004, "User name or password is incorrect"),
			INVALID_CAPTCHA(30005, "Invalid captcha or captcha overdue"),
			INVALID_TOKEN(30006, "Invalid token");
		 */
		ObjectMapper mapper = new ObjectMapper();
		resultMsg = new ResponseData<Object>();
		resultMsg.setCode("N");
		resultMsg.setMsg("Invalid token");
		resultMsg.setData(30006);
		httpResponse.getWriter().write(mapper.writeValueAsString(resultMsg));
		return;
	}

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		SpringBeanAutowiringSupport.processInjectionBasedOnServletContext(this, filterConfig.getServletContext());
	}

}
