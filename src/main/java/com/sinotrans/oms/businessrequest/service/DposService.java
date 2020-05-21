package com.sinotrans.oms.businessrequest.service;

import com.sinotrans.oms.common.base.ResponseData;

/**  
* Title: DposService  
* Description:  状态池订阅服务
* @author Shoven.Jiang  
* @date 2018年12月11日  
* @version 1.0  
*/
public interface DposService {

	/**
	 * 根据类型订阅状态池服务
	 * @author Shoven.Jiang  
	 * @date 2018年12月11日
	 * @param Url 需要订阅的地址
	 * @param charset  编码格式
	 * @param postStr  传输的json内容
	 * @param keyId  服务对应的keyid
	 * @param businessCode 业务系统代码
	 * @return responseData
	 */
	ResponseData<Object> subscribeDposByType(String Url, String charset, String postStr, String keyId, String businessCode) throws Exception ;
	
	/**
	 * 状态池下发业务
	 * @author Shoven.Jiang  
	 * @date 2018年12月13日
	 * @param brids  业务请求主键数组
	 * @param type   业务请求类型  如果type为空则执行订单的存储过程
	 * @param excuteCode 具体执行的存储过程名称
	 * @param ebtkId 业务请求中保绑定的项目执行计划作业步骤id  ....EbtkId
	 * @return
	 */
	ResponseData issuedStautsPoolService(Long [] brids, String type, Long ebtkId);
}
