package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.businessrequest.model.EoEorb2EosrModel;

public interface EoEorb2EosrManager {
	EoEorb2EosrModel get(Long id);

	List<EoEorb2EosrModel> findByCondition(List<FilterCondition> conditions);

	EoEorb2EosrModel save(EoEorb2EosrModel model);

	List<EoEorb2EosrModel> saveAll(List<EoEorb2EosrModel> models);

	void delete(EoEorb2EosrModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
