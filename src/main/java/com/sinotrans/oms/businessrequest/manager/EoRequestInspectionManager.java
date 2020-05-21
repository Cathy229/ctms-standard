package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoRequestInspectionModel;

public interface EoRequestInspectionManager extends MybatisManager{
	
	EoRequestInspectionModel get(Long id);

	List<EoRequestInspectionModel> findByCondition(List<FilterCondition> conditions);

	EoRequestInspectionModel save(EoRequestInspectionModel model);

	List<EoRequestInspectionModel> saveAll(List<EoRequestInspectionModel> models);

	void delete(EoRequestInspectionModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
