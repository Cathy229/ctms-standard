package com.sinotrans.oms.eoor.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.eoor.model.SchedulBatchLockModel;

public interface SchedulBatchLockManager extends MybatisManager{
	
	SchedulBatchLockModel get(Integer id);

	List<SchedulBatchLockModel> findByCondition(List<FilterCondition> conditions);

	SchedulBatchLockModel save(SchedulBatchLockModel model);

	List<SchedulBatchLockModel> saveAll(List<SchedulBatchLockModel> models);

	void delete(SchedulBatchLockModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Integer id);

	void deleteByPks(Collection<Integer> ids);

	SchedulBatchLockModel saveOrder(SchedulBatchLockModel SchedulBatchLockModel) ;
	
}
