package com.sinotrans.oms.test.service;

import com.sinotrans.oms.common.base.Response;

/**
 * 标准服务：相当于无事物的业务逻辑处理层
 */
public interface HelloService {

	//业务逻辑处理
	public Response doSomeing(String param);
	
	/**
	 * 线程池测试
	 * @author Shoven.Jiang  
	 * @date 2018年10月19日
	 * @param testNo
	 */
	void testThread(String testNo);
}
