package com.sinotrans.oms.schedule.service.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.sinotrans.framework.core.aop.BaseAspect;
import com.sinotrans.oms.businessrequest.manager.EoRequestBookingManager;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.common.util.ReceiveEmail;

/**  
* Title: EoRequestBookingScheduleImpl  
* Description:  
* @author Shoven.Jiang  
* @date 2019年1月17日  
* @version 1.0  
*/
@Component
public class EoRequestBookingScheduleImpl extends BaseAspect{

	@Autowired
	private ReceiveEmail receiveEmail;
	@Autowired
	private EoRequestBookingManager eoRequestBookingManager;
	/**
	 * 华东订舱网针对订舱下达的反馈，回传的是邮件，oms需要解析邮件中的内容填充到订舱表
	 * 邮件主题包含： 订单已接收
	 * @author Shoven.Jiang  
	 * @date 2019年1月17日
	 */
//	@Scheduled(fixedRate = 1000 * 60 * 1)
	public void feedBackToEorbByAccept() {
//		this.receiveEmail.setPropertiesMsg("imap", "110", "owa.sinotrans.com", false);//服务器不识别域名的方式访问邮件服务器
		this.receiveEmail.setPropertiesMsg("imap", "110", "172.30.11.10", false);
    	try {
			Map<String, Object> map = this.receiveEmail.parseMessage(true, "订单已接收");
			if (EmptyUtils.isNotEmpty(map)) {
				this.eoRequestBookingManager.feedBackToEorb(map);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error("订舱反馈异常" + e.getMessage());
		}
	}
	
	/**
	 * 华东订舱网针对订舱下达的反馈，回传的是邮件，oms需要解析邮件中的内容填充到订舱表
	 * 邮件主题包含： 订单已被拒绝
	 * @author Shoven.Jiang  
	 * @date 2019年4月2日
	 */
//	@Scheduled(fixedRate = 1000 * 60 * 1)
	public void feedBackToEorbByRefuse() {
//		this.receiveEmail.setPropertiesMsg("imap", "110", "owa.sinotrans.com", false);//服务器不识别域名的方式访问邮件服务器
		this.receiveEmail.setPropertiesMsg("imap", "110", "172.30.11.10", false);
    	try {
			Map<String, Object> map = this.receiveEmail.parseMessage(true, "订单已被拒绝");
			if (EmptyUtils.isNotEmpty(map)) {
				this.eoRequestBookingManager.feedBackToEorbByrefuse(map);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error("订舱反馈异常" + e.getMessage());
		}
	}
}
