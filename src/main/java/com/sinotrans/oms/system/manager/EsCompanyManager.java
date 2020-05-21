package com.sinotrans.oms.system.manager;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.system.model.EsCompanyModel;

public interface EsCompanyManager extends MybatisManager{

	EsCompanyModel get(Long escoId);

	List<EsCompanyModel> findByCondition(List<FilterCondition> conditions);

	EsCompanyModel save(EsCompanyModel model);

	List<EsCompanyModel> saveAll(List<EsCompanyModel> models);

	void delete(EsCompanyModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);

	List<Map<String, Object>> querySQL1(Map<String, Object> conditions);

	List<EsCompanyModel> querySQL2(Map<String, Object> conditions);
}
