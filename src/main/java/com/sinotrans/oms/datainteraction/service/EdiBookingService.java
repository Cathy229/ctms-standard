package com.sinotrans.oms.datainteraction.service;
/**  
* <p>Title: EdiBookingService</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月4日  
* @version 1.0  
*/
public interface EdiBookingService {
	/**
	 * 订舱下达组装报文，对接海运系统，将报文上传到FTP文件
	 * @author Shoven.Jiang  
	 * @date 2018年9月4日
	 * @param edboId
	 */
	public void sendBookingBRToEAI(Long eorbId);

}
