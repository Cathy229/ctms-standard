package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.businessrequest.model.EoEoom2EobrModel;

public interface EoEoom2EobrManager {
	EoEoom2EobrModel get(Long id);

	List<EoEoom2EobrModel> findByCondition(List<FilterCondition> conditions);

	EoEoom2EobrModel save(EoEoom2EobrModel model);

	List<EoEoom2EobrModel> saveAll(List<EoEoom2EobrModel> models);

	void delete(EoEoom2EobrModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
