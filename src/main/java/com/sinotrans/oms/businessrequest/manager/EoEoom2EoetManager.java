package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoEoom2EoetModel;

public interface EoEoom2EoetManager extends MybatisManager{
	
	EoEoom2EoetModel get(Long id);

	List<EoEoom2EoetModel> findByCondition(List<FilterCondition> conditions);

	EoEoom2EoetModel save(EoEoom2EoetModel model);

	List<EoEoom2EoetModel> saveAll(List<EoEoom2EoetModel> models);

	void delete(EoEoom2EoetModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
