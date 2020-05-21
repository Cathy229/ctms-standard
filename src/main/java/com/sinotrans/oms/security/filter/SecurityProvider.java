package com.sinotrans.oms.security.filter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.DisabledException;
import org.springframework.security.authentication.LockedException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.security.authentication.AcegiUserDetails;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.Response;
import com.sinotrans.oms.common.util.MD5;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.system.manager.EsUserManager;

/**
 * 自定义认证服务
 * Harley 20180730
 */
@Service("securityProvider")
public class SecurityProvider implements AuthenticationProvider {
	
	@Autowired
	protected EsUserManager esUserManager;

	private UserDetailsService userDetailsService;

	public SecurityProvider(UserDetailsService userDetailsService) {
		this.userDetailsService = userDetailsService;
	}

	@Override
	public Authentication authenticate(Authentication authenticate) throws AuthenticationException {
		UsernamePasswordAuthenticationToken token = (UsernamePasswordAuthenticationToken) authenticate;
		String username = token.getName();
		AcegiUserDetails userDetails = null;
		if (username != null) {
			userDetails = (AcegiUserDetails) userDetailsService.loadUserByUsername(username);
		}
		System.out.println("$$" + userDetails);
		if (userDetails == null) {
			throw new UsernameNotFoundException("用户名/密码无效");
		} else if (!userDetails.isEnabled()) {
			throw new DisabledException("用户已被禁用");
		} else if (!userDetails.isAccountNonExpired()) {
			throw new LockedException("账号已过期");
		} else if (!userDetails.isAccountNonLocked()) {
			throw new LockedException("账号已被锁定");
		} else if (!userDetails.isCredentialsNonExpired()) {
			throw new LockedException("凭证已过期");
		}
		String password = MD5.encode(String.valueOf(token.getCredentials()));
		// 与authentication里面的credentials相比较
		if (!userDetails.getPassword().equals(password)) {
			throw new BadCredentialsException("密码错误");
		}
		// 系统登录弱密码校验，提示去物流系统修改密码 
		String pwPattern = "^(?![A-Za-z0-9]+$)(?![a-z0-9\\W]+$)(?![A-Za-z\\W]+$)(?![A-Z0-9\\W]+$)[a-zA-Z0-9\\W]{8,}$";//物流系统对于弱密码的正则表达式校验
		Pattern pattern = Pattern.compile(pwPattern);
		Matcher matcher = pattern.matcher(String.valueOf(token.getCredentials()));
		if (!matcher.matches()) {
			throw new BadCredentialsException("账号登录密码弱，请到物流系统修改密码");
		}
		// 执行逻辑校验
		Response msg = esUserManager.checkUserFail(userDetails);
		if (Constants.NO.equals(msg.getCode())) {
			throw new BadCredentialsException(msg.getMsg());
		}
		//构造登录用户信息
		UserDetails userDetail = esUserManager.generateUserInfo(userDetails);
		if (null == userDetail) {
			throw new BadCredentialsException("构造用户信息异常，请联系管理员");
		}
		// 授权
		Authentication authentication = new UsernamePasswordAuthenticationToken(userDetail, password,
				userDetails.getAuthorities());
		return authentication;
	}
	
	@Override
	public boolean supports(Class<?> authentication) {
		// 返回true后才会执行上面的authenticate方法,这步能确保authentication能正确转换类型
		return UsernamePasswordAuthenticationToken.class.equals(authentication);
	}

}
