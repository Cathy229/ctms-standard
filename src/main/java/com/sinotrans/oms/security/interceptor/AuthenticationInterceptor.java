package com.sinotrans.oms.security.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.sinotrans.oms.common.cache.redis.RedisTemplateUtil;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.security.util.UserDetails;

/**
 * Harley 20180812 TODO:拦截会话，给绑定线程级用户信息，其目的：
 * 1.可以在service层中直接获取会话中的用户信息，sessionContext
 * 2.可以自定义注解，拦截访问service层的方法，并判断用户信息是否有效
 * 3.拦截访问参数，如果有accessToken(所有项目都定义为此名称)，就从redis获取用户信息
 */
public class AuthenticationInterceptor implements HandlerInterceptor {
	private static final Logger logger = LoggerFactory.getLogger(AuthenticationInterceptor.class);
	
	@Autowired
	private RedisTemplateUtil redisTemplateUtil;

	/**
	 * controller 执行之前调用
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		String accessToken = request.getParameter(com.sinotrans.oms.common.Constants.ACCESSTOKEN_PARAMETER_NAME);
		if (EmptyUtils.isNotEmpty(accessToken)) {
			UserDetails userDetails = redisTemplateUtil.getJSON(accessToken, UserDetails.class);
			if (null != userDetails) {
				Authentication authentication = new UsernamePasswordAuthenticationToken(userDetails, userDetails.getPassword(), userDetails.getAuthorities());
				// 设置线程的token用户信息
				SecurityContextHolder.getContext().setAuthentication(authentication);
				logger.info("set userDetail:" + userDetails.toString());
			} else {
				throw new RuntimeException("you must login first.");
			}
		}
		return true;
	}

	/**
	 * controller 执行之后，且页面渲染之前调用
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		SecurityContextHolder.getContext().setAuthentication(null);
	}

	/**
	 * 页面渲染之后调用，一般用于资源清理操作
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {

	}

}
