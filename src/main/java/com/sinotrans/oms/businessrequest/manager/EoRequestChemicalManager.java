package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.businessrequest.model.EoRequestChemicalModel;

public interface EoRequestChemicalManager {

	EoRequestChemicalModel get(Long id);

	List<EoRequestChemicalModel> findByCondition(List<FilterCondition> conditions);

	EoRequestChemicalModel save(EoRequestChemicalModel model);

	List<EoRequestChemicalModel> saveAll(List<EoRequestChemicalModel> models);

	void delete(EoRequestChemicalModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
