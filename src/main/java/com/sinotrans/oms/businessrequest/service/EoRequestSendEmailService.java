package com.sinotrans.oms.businessrequest.service;

import java.io.IOException;
import java.util.Map;

import jxl.write.WriteException;

/**  
* Title: EoRequestSendEmailService  
* Description:  业务请求下达时，发送委托书给联系人，异步线程处理
* @author Shoven.Jiang  
* @date 2018年10月26日  
* @version 1.0  
*/
public interface EoRequestSendEmailService {

	/**
	 * 组装拖车委托书，用于拖车下达发送邮件的内容
	 * @author Shoven.Jiang  
	 * @date 2018年10月26日
	 * @param eoetIds
	 * @return
	 * @throws IOException 
	 * @throws WriteException 
	 */
	void assembleIssuedTrailerEntrust(Long[] eoetIds, Long userId) throws WriteException, IOException;
	
	/**
	 * 拖车下达之后同步给拖车公司中的联系人发送邮件
	 * @author Shoven.Jiang  
	 * @date 2018年10月26日
	 * @param entrustTrailerMap
	 * @throws IOException 
	 * @throws WriteException 
	 */
	void sendEmailAfterIssuedTrailer(Map entrustTrailerMap) throws WriteException, IOException;
	
}
