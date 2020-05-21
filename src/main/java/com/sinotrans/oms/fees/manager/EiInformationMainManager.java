package com.sinotrans.oms.fees.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.fees.model.EiInformationMainModel;

public interface EiInformationMainManager extends MybatisManager{

	EiInformationMainModel get(Long id);

	List<EiInformationMainModel> findByCondition(List<FilterCondition> conditions);

	EiInformationMainModel save(EiInformationMainModel model);

	List<EiInformationMainModel> saveAll(List<EiInformationMainModel> models);

	void delete(EiInformationMainModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
