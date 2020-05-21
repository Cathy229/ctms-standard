package com.sinotrans.oms.eoorder.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.eoorder.model.EsReportTemplateModel;

public interface EsReportTemplateManager extends MybatisManager{

	EsReportTemplateModel get(Long id);

	List<EsReportTemplateModel> findByCondition(List<FilterCondition> conditions);

	EsReportTemplateModel save(EsReportTemplateModel model);

	List<EsReportTemplateModel> saveAll(List<EsReportTemplateModel> models);

	void delete(EsReportTemplateModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}