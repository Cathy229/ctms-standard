package com.sinotrans.oms.eoor.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.eoor.model.EtOrderModel;

public interface EtorManager extends MybatisManager{
	
	EtOrderModel get(Integer integer);

	List<EtOrderModel> findByCondition(List<FilterCondition> conditions);

	EtOrderModel save(EtOrderModel model);

	List<EtOrderModel> saveAll(List<EtOrderModel> models);

	void delete(EtOrderModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Integer id);

	void deleteByPks(Collection<Integer> ids);

	EtOrderModel saveOrder(EtOrderModel etOrdrModel) ;

	
}