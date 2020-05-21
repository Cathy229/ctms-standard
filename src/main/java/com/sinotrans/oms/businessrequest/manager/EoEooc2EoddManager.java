package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoddModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;

public interface EoEooc2EoddManager extends MybatisManager{
	
	EoEooc2EoddModel get(Long id);

	List<EoEooc2EoddModel> findByCondition(List<FilterCondition> conditions);

	EoEooc2EoddModel save(EoEooc2EoddModel model);

	List<EoEooc2EoddModel> saveAll(List<EoEooc2EoddModel> models);

	void delete(EoEooc2EoddModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
