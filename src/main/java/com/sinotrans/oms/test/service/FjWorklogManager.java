package com.sinotrans.oms.test.service;

import java.util.Collection;

import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.test.model.FjWorklogExtendModel;
import com.sinotrans.oms.test.model.FjWorklogModel;

public interface FjWorklogManager extends MybatisManager {

	//
	// List<FjWorklogModel> getAll();
	//
	// List<FjWorklogModel> findByExample(FjWorklogModel example);
	//
	// List<FjWorklogModel> saveAll(Collection<FjWorklogModel> models);
	//
	// void remove(FjWorklogModel model);
	//
	// void removeAll(Collection<FjWorklogModel> models);
	//
	// void removeByPk(String id);

	//
	// FjWorklogModel saveErr(FjWorklogModel model);
	//
	// QueryData getByQuery(QueryInfo queryInfo);

	FjWorklogModel get(String id);

	FjWorklogExtendModel getExtendModel(String id);

	void deleteByPks(Collection<String> ids);

	FjWorklogModel save(FjWorklogModel model);

}
