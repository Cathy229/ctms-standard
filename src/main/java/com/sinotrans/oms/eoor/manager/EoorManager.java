package com.sinotrans.oms.eoor.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.eoor.model.EoOrderModel;
import com.sinotrans.oms.eoor.model.EoTaskModel;
/**
 * <p>Title: 订单表</p>
 * <p>Description: 
 *    
 * </p>
 *<pre>
 * 修改记录:
 * 修改后版本            修改人       	 	修改日期   	      修改内容
 * 2018073101  Shoven Jiang 2018073101 	创建
 * 
 * 
 * </pre>
 */
public interface EoorManager  extends MybatisManager{
	
	EoOrderModel get(Integer integer);

	List<EoOrderModel> findByCondition(List<FilterCondition> conditions);

	EoOrderModel save(EoOrderModel model);

	List<EoOrderModel> saveAll(List<EoOrderModel> models);

	void delete(EoOrderModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Integer id);

	void deleteByPks(Collection<Integer> ids);

	EoOrderModel saveOrder(EoOrderModel eoOrdrModel) ;
		
	

	
	/**
	 * 通过固定的查询条件来获取订单的查询结果
	 * @param conditionMap
	 * add by shoven 2018年8月8日14:33:21
	 * @return
	 */
	QueryData queryOrderByCondition(QueryInfo queryInfo);
	/**
	 * 通过固定的查询条件来获取订单的查询结果
	 * @param conditionMap
	 * add by shoven 2018年8月8日14:33:21
	 * @return
	 */
	QueryData queryOrderFeeByCondition(QueryInfo queryInfo);

	QueryData querySchedulOrdeCondition(QueryInfo queryInfo);

	QueryData queryEotaInfoCondition(QueryInfo queryInfo);

	EoTaskModel getEotaModel(Integer eotaId);

	
}
