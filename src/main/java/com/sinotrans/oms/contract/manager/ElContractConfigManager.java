package com.sinotrans.oms.contract.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.contract.model.ElContractConfigModel;

public interface ElContractConfigManager {

	ElContractConfigModel get(Long id);

	List<ElContractConfigModel> findByCondition(List<FilterCondition> conditions);

	ElContractConfigModel save(ElContractConfigModel model);

	List<ElContractConfigModel> saveAll(List<ElContractConfigModel> models);

	void delete(ElContractConfigModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
