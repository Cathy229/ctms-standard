package com.sinotrans.oms.fees.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.fees.model.EiCommonLoadBackModel;

public interface EiCommonLoadBackManager extends MybatisManager{

	EiCommonLoadBackModel get(Long id);

	List<EiCommonLoadBackModel> findByCondition(List<FilterCondition> conditions);

	EiCommonLoadBackModel save(EiCommonLoadBackModel model);

	List<EiCommonLoadBackModel> saveAll(List<EiCommonLoadBackModel> models);

	void delete(EiCommonLoadBackModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
