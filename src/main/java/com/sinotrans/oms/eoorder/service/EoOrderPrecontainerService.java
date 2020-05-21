package com.sinotrans.oms.eoorder.service;

import java.util.Collection;
import java.util.Map;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.base.ResponseData;

public interface EoOrderPrecontainerService {
	
	/**
	 * 根据订单预配箱主键删除数据
	 * add by shoven 2018年8月27日10:36:58
	 * @param eosrId
	 * @return
	 */
	ResponseData deleteOrderPrecontainer(Long eosrId);

	/**
	 * 根据订单预配箱主键集合删除数据
	 * add by shoven 2018年8月27日10:36:58 
	 * @param eosrIds
	 * @return
	 */
	ResponseData batchDeleteOrderPrecontainer(Collection<Long> eosrIds);
	/**
	 * 
	 * @description 根据主键查询
	 * @author Simon.Guo  
	 * @date 2018年10月22日下午3:19:25
	 * @param eosrId
	 * @return
	 */
	ResponseData getOrderPrecontainerById(Long eosrId);
	/**
	 * 
	 * @description 根据条件查询
	 * @author Simon.Guo  
	 * @date 2018年10月22日下午3:23:28
	 * @param condition
	 * @return
	 */
	ResponseData<QueryData> queryOrderPrecontainerByCondition(QueryInfo queryInfo);

	/**
	 * 订单预配箱删除判断是否已经生成了拖车任务，如果已经生成拖车任务需做校验，判断是否符合删除条件
	 * @author Shoven.Jiang  
	 * @date 2018年11月13日
	 * @param eosrIds
	 * @return
	 */
	ResponseData batchDeleteOrderPrecontainerRelationEoetTask(Collection<Long> eosrIds);
}
