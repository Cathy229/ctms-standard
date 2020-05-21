package com.sinotrans.oms.businessrequest.service;

import java.io.IOException;
import java.util.Map;

import jxl.write.WriteException;

/**  
* Title: EoRequestDeclarationDeputeSendEmailService  
* Description:  报关业务请求下达时，发送委托书给联系人，异步线程处理
* @author Colley.Bai 
* @date 2018年10月30日  
* @version 1.0  
*/
public interface EoRequestDeclarationDeputeSendEmailService {
	
	/**
	 * @deprecated:组装报关委托书，用于报关下达发送邮件的内容
	 * @author Colley.Bai  
	 * @date 2018年10月20日 下午03:54:23
	 * @param eorbIds
	 * @param userId
	 */
	void assembleIssuedDeclarationDeputeEntrust(Long[] eoddIds, Long userId) throws WriteException, IOException;
	
	/**
	 * @deprecated:报关下达之后同步给拖车公司中的联系人发送邮件
	 * @author Colley.Bai  
	 * @date 2018年10月29日 下午03:55:12
	 * @param entrustBookingMap
	 * @throws WriteException
	 * @throws IOException
	 */
	void sendEmailAfterIssuedDeclarationDepute(Map<String, Object> entrustDeclarationDeputeMap ,String email) throws WriteException, IOException;
}
