package com.sinotrans.oms.businessrequest.service;

import java.io.IOException;
import java.util.Map;

import javax.servlet.http.HttpSession;

import jxl.write.WriteException;

/**  
* Title: EoRequestBookingSendEmailService  
* Description:  业务请求下达时，发送委托书给联系人，异步线程处理
* @author Colley.Bai 
* @date 2018年10月30日  
* @version 1.0  
*/
public interface EoRequestBookingSendEmailService {
	
	/**
	 * @deprecated:组装订舱委托书，用于订舱下达发送邮件的内容
	 * @author Colley.Bai  
	 * @date 2018年10月29日
	 * @param eorbIds
	 * @param userId
	 */
	void assembleIssuedBookingEntrust(Long[] eorbIds, Long userId,String accessToken) throws WriteException, IOException;
	
	/**
	 * @deprecated:订舱下达之后同步给拖车公司中的联系人发送邮件
	 * @author Colley.Bai  
	 * @date 2018年10月29日 下午04:18:12
	 * @param entrustBookingMap
	 * @throws WriteException
	 * @throws IOException
	 */
	void sendEmailAfterIssuedBooking(Map<String, Object> entrustBookingMap) throws WriteException, IOException;
}
