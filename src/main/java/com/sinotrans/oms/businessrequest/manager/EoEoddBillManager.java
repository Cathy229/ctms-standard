package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;

public interface EoEoddBillManager extends MybatisManager{
	
	EoEoddBillModel get(Long id);

	List<EoEoddBillModel> findByCondition(List<FilterCondition> conditions);

	EoEoddBillModel save(EoEoddBillModel model);

	List<EoEoddBillModel> saveAll(List<EoEoddBillModel> models);

	void delete(EoEoddBillModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
