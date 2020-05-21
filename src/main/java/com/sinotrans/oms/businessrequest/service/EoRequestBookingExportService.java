package com.sinotrans.oms.businessrequest.service;

import java.io.IOException;
import java.util.Map;

import jxl.write.WriteException;

/**  
* Title: EoRequestBookingExportService  
* Description:  导出功能，下载委托书，发送邮件
* @author Colley.Bai 
* @date 2018年12月28日  
* @version 1.0  
*/
public interface EoRequestBookingExportService {
	
	/**
	 * @deprecated:组装订舱委托书，用于订舱下达发送邮件的内容和导出委托书
	 * @author Colley.Bai  
	 * @date 2018年12月28日
	 * @param eorbIds
	 * @param userId
	 */
	Map<String,String> assembleExportBookingEntrust(Long[] eorbIds, Long userId) throws WriteException, IOException;
	
	/**
	 * @deprecated:订舱下达之后同步给订舱代理中的联系人发送邮件
	 * @author Colley.Bai  
	 * @date 2018年12月28日
	 * @param entrustBookingMap
	 * @throws WriteException
	 * @throws IOException
	 */
	Map<String,String> sendEmailAfterExportBooking(Map<String, Object> entrustBookingMap) throws WriteException, IOException;
}
