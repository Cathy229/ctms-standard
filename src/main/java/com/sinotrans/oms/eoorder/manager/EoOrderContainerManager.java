package com.sinotrans.oms.eoorder.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;

public interface EoOrderContainerManager extends MybatisManager{

	EoOrderContainerModel get(Long id);

	List<EoOrderContainerModel> findByCondition(List<FilterCondition> conditions);

	EoOrderContainerModel save(EoOrderContainerModel model);

	List<EoOrderContainerModel> saveAll(List<EoOrderContainerModel> models);

	void delete(EoOrderContainerModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
	
	/**
	 * 订单集装箱查询
	 * @author Shoven.Jiang  
	 * @date 2018年11月21日
	 * @param queryInfo
	 * @return
	 */
	ResponseData<QueryData> queryOrderContainerByCondition(QueryInfo queryInfo);

	/**
	 * 订单集装箱查询
	 * @author Colley.Bai  
	 * @date 2019年2月26日
	 * @param queryInfo
	 * @return
	 */
	QueryData queryBookingByCondition(QueryInfo queryInfo);
}
