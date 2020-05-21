package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoInspCertificateModel;

public interface EoInspCertificateManager extends MybatisManager{
	
	EoInspCertificateModel get(Long id);

	List<EoInspCertificateModel> findByCondition(List<FilterCondition> conditions);

	EoInspCertificateModel save(EoInspCertificateModel model);

	List<EoInspCertificateModel> saveAll(List<EoInspCertificateModel> models);

	void delete(EoInspCertificateModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
