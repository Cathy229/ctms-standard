/**
 * 
 */
package com.sinotrans.oms.test.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.sinotrans.framework.web.mvc.BaseController;

@Controller
@RequestMapping(value = "/*")
public class IndexController extends BaseController {
	@RequestMapping(value = "/main", method = RequestMethod.GET)
	public String main(HttpServletRequest request) {
		return "main";
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String mainlogin(HttpServletRequest request) {
		return "login";
	}

	@RequestMapping(value = "/pages/**", method = RequestMethod.GET) // 统一处理其他页面请求
	public String commonMvc(HttpServletRequest request) {
		String uri = request.getServletPath(); // 不包含工程名和请求参数
		uri = uri.substring(uri.indexOf("pages/") + "pages/".length());
		if (uri.indexOf(".") > 0) {
			uri = uri.substring(0, uri.indexOf("."));
		}
		return uri;
	}
}
