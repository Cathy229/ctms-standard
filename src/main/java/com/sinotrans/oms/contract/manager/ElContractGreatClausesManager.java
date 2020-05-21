package com.sinotrans.oms.contract.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.contract.model.ElContractGreatClausesModel;

public interface ElContractGreatClausesManager {

	ElContractGreatClausesModel get(Long id);

	List<ElContractGreatClausesModel> findByCondition(List<FilterCondition> conditions);

	ElContractGreatClausesModel save(ElContractGreatClausesModel model);

	List<ElContractGreatClausesModel> saveAll(List<ElContractGreatClausesModel> models);

	void delete(ElContractGreatClausesModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);

}
