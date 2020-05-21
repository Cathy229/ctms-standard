package com.sinotrans.oms.webservice.service;

import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.service.BaseService;

/**  
* <p>Title: SendToEAIServices</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月15日  
* @version 1.0  
*/
public interface SendToEAIServices extends BaseService {
	
	/**
	 * harley 20180920 调用ws服务的统一方法,固定访问InnerSendToEAIService中的方法
	 * @param urlType 数据库配置的url类型  如： Constants.WEBSERVICES_REDIRECT
	 * @param serviceName 需要调用的方法名 如：settlementSendFeesBMSToEAI
	 * @param param 需要调用方法的参数 如：[eiimId,userId]
	 */
	public ResponseData<Object> commonInvokeWebservice(String urlType, String serviceName, Object... param);
}
