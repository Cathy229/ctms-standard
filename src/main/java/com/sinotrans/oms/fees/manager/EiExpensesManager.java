package com.sinotrans.oms.fees.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.fees.model.EiExpensesModel;

public interface EiExpensesManager extends MybatisManager{

	EiExpensesModel get(Long id);

	List<EiExpensesModel> findByCondition(List<FilterCondition> conditions);

	EiExpensesModel save(EiExpensesModel model);

	List<EiExpensesModel> saveAll(List<EiExpensesModel> models);

	void delete(EiExpensesModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
