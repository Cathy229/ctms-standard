package com.sinotrans.oms.eoorder.service;

import java.util.Collection;
import java.util.Map;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.base.ResponseData;

public interface EoOrderContainerService {

	/**
	 * 根据订单集装箱信息主键删除数据
	 * add by shoven 2018年8月27日11:05:30
	 * @param eoocId
	 * @return
	 */
	ResponseData deleteOrderContainer(Long eoocId);
	
	/**
	 * 根据订单集装箱信息主键集合删除数据
	 * add by shoven 2018年8月27日11:05:30
	 * @param eoocIds
	 * @return
	 */
	ResponseData batchDeleteOrderContainer(Collection<Long> eoocIds);
	/**
	 * 
	 * @description 根据id查询集装箱信息
	 * @author Simon.Guo  
	 * @date 2018年10月22日下午3:29:06
	 * @param eoocId
	 * @return
	 */
	ResponseData getOrderContainerById(Long eoocId);
	/**
	 * 
	 * @description 根据条件查询集装箱信息
	 * @author Simon.Guo  
	 * @date 2018年10月22日下午3:31:44
	 * @param condition
	 * @return
	 */
	ResponseData queryOrderContainerByCondition(QueryInfo queryInfo);

}
