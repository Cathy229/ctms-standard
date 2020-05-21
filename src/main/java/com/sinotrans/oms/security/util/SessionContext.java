package com.sinotrans.oms.security.util;

import org.springframework.security.core.Authentication;

import com.sinotrans.framework.security.authentication.AcegiUserDetails;



/**
 * <p>
 * Description:当前会话的上下文
 * </p>
 * 
 * @author harley 20180731
 * </pre>
 */
public class SessionContext {
	/**
	 * 得到当前登录用户
	 * @return
	 */
	public static UserDetails getUser() {
		Authentication authentication = org.springframework.security.core.context.SecurityContextHolder.getContext().getAuthentication();
		if (authentication == null) {
			return null;
		}
		Object principal = authentication.getPrincipal();
		if (principal instanceof AcegiUserDetails) {
			return (UserDetails) principal;
		}
		return null;
	}
	
}
