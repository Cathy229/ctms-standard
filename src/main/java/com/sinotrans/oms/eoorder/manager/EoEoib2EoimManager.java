package com.sinotrans.oms.eoorder.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.eoorder.model.EoEoib2EoimModel;

public interface EoEoib2EoimManager {

	EoEoib2EoimModel get(Long id);

	List<EoEoib2EoimModel> findByCondition(List<FilterCondition> conditions);

	EoEoib2EoimModel save(EoEoib2EoimModel model);

	List<EoEoib2EoimModel> saveAll(List<EoEoib2EoimModel> models);

	void delete(EoEoib2EoimModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
