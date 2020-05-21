package com.sinotrans.oms.fees.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.fees.model.EiEoimAuditBackModel;

public interface EiEoimAuditBackManager extends MybatisManager{

	EiEoimAuditBackModel get(Long id);

	List<EiEoimAuditBackModel> findByCondition(List<FilterCondition> conditions);

	EiEoimAuditBackModel save(EiEoimAuditBackModel model);

	List<EiEoimAuditBackModel> saveAll(List<EiEoimAuditBackModel> models);

	void delete(EiEoimAuditBackModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
