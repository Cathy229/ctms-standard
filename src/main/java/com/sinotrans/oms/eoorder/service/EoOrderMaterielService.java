package com.sinotrans.oms.eoorder.service;

import java.util.Collection;
import java.util.Map;

import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.base.ResponseData;

public interface EoOrderMaterielService {
	
	/**
	 * 订单基本信息中物料的删除:根据物料主键ID进行删除
	 * add by shoven 2018年8月27日10:11:17
	 * @param eoomId
	 * @return
	 */
	ResponseData deleteOrderMaterial(Long eoomId);
	
	/**
	 * 订单基本信息中物料的删除：根据物料主键ID数组进行删除
	 * add by shoven 2018年8月27日10:11:17
	 * @param eoomIds
	 * @return
	 */
	ResponseData batchDeleteOrderMaterial(Collection<Long> eoomIds);
	/**
	 * 
	 * @description 根据物料主键查询
	 * @author Simon.Guo  
	 * @date 2018年10月22日下午2:55:05
	 * @param eoomId
	 * @return
	 */
	ResponseData getOrderMaterialById(Long eoomId);
	/**
	 * 
	 * @description 根据条件查询
	 * @author Simon.Guo  
	 * @date 2018年10月22日下午3:06:39
	 * @param condition
	 * @return
	 */
	ResponseData queryOrderMaterialByModel(QueryInfo queryInfo);

}
