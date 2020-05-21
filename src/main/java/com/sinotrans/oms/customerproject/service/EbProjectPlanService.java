package com.sinotrans.oms.customerproject.service;
/**  
* <p>Title: EbProjectPlanService</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月10日  
* @version 1.0  
*/
public interface EbProjectPlanService {

	/**
	 * 通过订单ID获取项目执行计划中的业务类型
	 * @author Shoven.Jiang  
	 * @date 2018年9月9日
	 * @param eoorId
	 * @return
	 */
	public String getBusinessTypeByEoorId(Long eoorId);
}
