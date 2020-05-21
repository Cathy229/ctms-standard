package com.sinotrans.oms.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.sinotrans.framework.security.authentication.AcegiUserDetails;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.test.service.LoginManage;

@RestController
public class LoginController {

	@Autowired
	private LoginManage loginManage;
	
	@RequestMapping(value = "/loginDemo" ,method = RequestMethod.GET)
    public String loginDemo(@RequestParam String a, @RequestParam String b) {
		System.out.println("用户名" + a + "密码" + b);
		String ss = this.loginManage.checkUser(a, b);
    	return "成功访问到loginDemo方法" + ss;
    }
	
    @GetMapping("/boot/testToken")
    public String loginPage(@RequestParam String json, HttpServletRequest request, HttpServletResponse response) {
    	String token = request.getHeader("token");
    	System.out.println(token);
    	System.out.println(SessionContext.getUser());
        return JSON.toJSONString(SessionContext.getUser());
    }
    @PostMapping("/boot/testToken2")
    public String loginPage2(@RequestBody String body, HttpServletRequest request, HttpServletResponse response) {
    	String token = request.getHeader("token");
    	System.out.println(token);
        return body;
    }
}
