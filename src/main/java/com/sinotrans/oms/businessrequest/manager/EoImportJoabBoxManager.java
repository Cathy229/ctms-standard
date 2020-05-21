package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.businessrequest.model.EoImportJoabBoxModel;

public interface EoImportJoabBoxManager {

	EoImportJoabBoxModel get(Long id);

	List<EoImportJoabBoxModel> findByCondition(List<FilterCondition> conditions);

	EoImportJoabBoxModel save(EoImportJoabBoxModel model);

	List<EoImportJoabBoxModel> saveAll(List<EoImportJoabBoxModel> models);

	void delete(EoImportJoabBoxModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
