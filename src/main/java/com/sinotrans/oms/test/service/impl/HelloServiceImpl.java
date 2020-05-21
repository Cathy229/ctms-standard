package com.sinotrans.oms.test.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.common.base.Response;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.test.service.HelloService;

/**
 * 标准服务：相当于无事物的业务逻辑处理层,制作业务逻辑处理
 */
@Service
public class HelloServiceImpl implements HelloService {
	
	@Autowired
	private EoOrderManager eoOrderManager;
	
	// 业务逻辑处理
	@Override
	public Response doSomeing(String param) {
		EoOrderModel model = new EoOrderModel();
		model.setEoorBmsEbbtCode("测试");
		model = eoOrderManager.save(model);
		//....业务处理
		Response msg = new Response();
		msg.setMsg("调用标准服务成功");
		return msg;
	}

	@Override
	@Async("threadPoolBean")
	public void testThread(String testNo) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("线程创建成功" + "已执行" + testNo);
	}

}
