package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;

public interface EoEooc2EoetManager extends MybatisManager{
	
	EoEooc2EoetModel get(Long id);

	List<EoEooc2EoetModel> findByCondition(List<FilterCondition> conditions);

	EoEooc2EoetModel save(EoEooc2EoetModel model);

	List<EoEooc2EoetModel> saveAll(List<EoEooc2EoetModel> models);

	void delete(EoEooc2EoetModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
