package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EodmModel;

public interface EoEoom2EodmManager extends MybatisManager{
	
	EoEoom2EodmModel get(Long id);

	List<EoEoom2EodmModel> findByCondition(List<FilterCondition> conditions);

	EoEoom2EodmModel save(EoEoom2EodmModel model);

	List<EoEoom2EodmModel> saveAll(List<EoEoom2EodmModel> models);

	void delete(EoEoom2EodmModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
