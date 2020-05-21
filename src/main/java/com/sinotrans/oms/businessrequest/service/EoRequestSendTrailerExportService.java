package com.sinotrans.oms.businessrequest.service;

import java.io.IOException;
import java.util.Map;

import jxl.write.WriteException;

/**  
* Title: EoRequestSendTrailerExportService  
* Description:  导出时，发送委托书给联系人，导出委托书
* @author Colley.Bai
* @date 2018年12月29日  
* @version 1.0  
*/
public interface EoRequestSendTrailerExportService {

	/**
	 * @deprecated:组装拖车委托书，用于拖车下达发送邮件的内容
	 * @author Colley.Bai  
	 * @date 2018年12月29日
	 * @param eoetIds
	 * @return
	 * @throws IOException 
	 * @throws WriteException 
	 */
	Map<String,String> assembleExportTrailerEntrust(Long[] eoetIds, Long userId) throws WriteException, IOException;
	
	/**
	 * @deprecated:拖车下达之后同步给拖车公司中的联系人发送邮件
	 * @author Colley.Bai 
	 * @date 2018年12月29日
	 * @param entrustTrailerMap
	 * @throws IOException 
	 * @throws WriteException 
	 */
	Map<String,String> sendEmailAfterExportTrailer(Map entrustTrailerMap) throws WriteException, IOException;
	
}
