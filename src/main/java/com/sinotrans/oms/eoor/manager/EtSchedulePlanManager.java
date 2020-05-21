package com.sinotrans.oms.eoor.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.eoor.model.EtSchedulePlanModel;

public interface EtSchedulePlanManager extends MybatisManager{
	EtSchedulePlanModel get(Integer id);

	List<EtSchedulePlanModel> findByCondition(List<FilterCondition> conditions);

	EtSchedulePlanModel save(EtSchedulePlanModel model);

	List<EtSchedulePlanModel> saveAll(List<EtSchedulePlanModel> models);

	void delete(EtSchedulePlanModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Integer id);

	void deleteByPks(Collection<Integer> ids);

	EtSchedulePlanModel saveOrder(EtSchedulePlanModel etSchedulePlanModel) ;
}
