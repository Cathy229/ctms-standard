package com.sinotrans.oms.test.controller;

import javax.annotation.Resource;
import javax.imageio.ImageIO;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.code.kaptcha.Producer;
import com.sinotrans.framework.security.support.CaptchaConstants;

@Controller
public class KaptchaController {

	@Resource
	private Producer captchaProducer;

	@RequestMapping(value = "kaptcha.jpg")
	public ModelAndView getKaptchaImage(HttpServletRequest request, HttpServletResponse response) throws Exception {

		response.setDateHeader("Expires", 0);
		response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");
		response.setHeader("Pragma", "no-cache");
		response.setContentType("image/jpeg");

		String capText = captchaProducer.createText();
		request.getSession().setAttribute(CaptchaConstants.CAPTCHA_ENABLED, true);
		request.getSession().setAttribute(CaptchaConstants.KAPTCHA_SESSION_KEY, capText);

		try (ServletOutputStream out = response.getOutputStream()) {
			ImageIO.write(captchaProducer.createImage(capText), "jpg", out);
			out.flush();
		}

		return null;
	}
}