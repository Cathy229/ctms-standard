package com.sinotrans.oms.common.aop;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.context.SecurityContextImpl;

import com.sinotrans.oms.security.util.UserDetails;

/**
 * <p>Description:工具类，是否允许跳过AOP</p>
 *
 * @author simon.yu
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本      修改人   	    修改日期   	修改内容
 * 20100623.1    俞孟新       	20100623    创建
 * </pre>
 */
public class IgnoreLoginController {
private static final ThreadLocal<Boolean> ignoreLogginCache = new ThreadLocal<Boolean>();
	
	private static final ThreadLocal<SecurityContext> userDetailCache = new ThreadLocal<SecurityContext>();
	/**
	 * 是否忽略登录校验
	 * @return
	 */
	public static boolean isIgnore() {
		Boolean ignore = ignoreLogginCache.get();
		if (ignore == null) {
			return false;
		} else {
			return ignore;
		}
	}
	
	/**
	 * 忽略登录校验
	 * @date 2010-6-23
	 */
	public static void ignoreLogin(){
		ignoreLogginCache.set(new Boolean(true));
		UserDetails userDetails = new UserDetails();
		userDetails.setUserId("150");
		userDetails.setUsername("admin");
		userDetails.setOrgId("100");
		userDetails.setOwnOrgId("101");
		userDetails.setPassword("123456");
		virtualLogin(userDetails);
	}
	
	/**
	 * 取消忽略登录校验，
	 * 这个方法放在finally块
	 * @date 2010-6-23
	 */
	public static void cancelIgnore(){
		ignoreLogginCache.set(null);
		virtualLogout();
	}
	
	/**
	 * 20111125.1   Simon 虚拟登录
	 * @param userDetail
	 */
	public static void virtualLogin(UserDetails userDetail){
		SecurityContext context = new SecurityContextImpl();
		// 构造用户信息
		Authentication authentication = new UsernamePasswordAuthenticationToken(userDetail, userDetail.getPassword(), userDetail.getAuthorities());
		// 设置线程的token用户信息
		SecurityContextHolder.getContext().setAuthentication(authentication);
		userDetailCache.set(context);
	}
	/**
	 * 20111125.1   Simon 虚拟退出登录
	 * @param userDetail
	 */
	public static void virtualLogout(){
		userDetailCache.set(null);
		SecurityContextHolder.getContext().setAuthentication(null);
	}	
}
