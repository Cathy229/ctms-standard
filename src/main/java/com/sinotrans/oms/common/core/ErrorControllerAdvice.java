package com.sinotrans.oms.common.core;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sinotrans.oms.common.base.Response;

/**
 * controller 增强器
 * @author Harley 20180816
 * 此类用于捕获异常反馈Response给调用者
 */
@ControllerAdvice
public class ErrorControllerAdvice {
	/**
	 * 全局异常捕捉处理
	 * 
	 * @param ex
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public Response errorHandler(Exception ex) {
		Response response = new Response();
		response.setCode("ERROR");
		response.setMsg("Error Msg: " + ex.getMessage());
		return response;
	}

	/**
	 * 拦截捕捉自定义异常 MyException.class
	 * 
	 * @param ex
	 * @return
	 */
//	@ResponseBody
//	@ExceptionHandler(value = MyException.class)
//	public Map myErrorHandler(MyException ex) {
//		Map map = new HashMap();
//		map.put("code", ex.getCode());
//		map.put("msg", ex.getMsg());
//		return map;
//	}
}
