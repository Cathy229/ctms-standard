package com.sinotrans.oms.customerproject.service;

import java.util.List;

import com.sinotrans.oms.common.base.ResponseData;

public interface EbProjectService {

	ResponseData<List> getProjectItem();
	
	/**
	 * 通过订单主键查出订单所属项目执行计划中的业务类型 
	 * 务类型的取值：首先从项目执行计划上取值，取不到再从项目上取值
	 * @author Shoven.Jiang  
	 * @date 2018年9月9日
	 * @param eoorId
	 * @return
	 */
	public String getBusinessTypeByEoorId(Long eoorId);

	/**
	 * 业务类型的取值：首先从项目执行计划上取值，取不到再从项目上取值
	 * @author Shoven.Jiang  
	 * @date 2018年9月20日
	 * @param eoorLoEbppId
	 * @param eoorEbpjId
	 * @return
	 */
	String getBusinessTypeByEbppIdOrEbpjId(Long eoorLoEbppId, Long eoorEbpjId);
}
