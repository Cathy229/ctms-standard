package com.sinotrans.oms.eoorder.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.eoorder.model.EoImportJoabMaterielModel;

public interface EoImportJoabMaterielManager {

	EoImportJoabMaterielModel get(Long id);

	List<EoImportJoabMaterielModel> findByCondition(List<FilterCondition> conditions);

	EoImportJoabMaterielModel save(EoImportJoabMaterielModel model);

	List<EoImportJoabMaterielModel> saveAll(List<EoImportJoabMaterielModel> models);

	void delete(EoImportJoabMaterielModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
