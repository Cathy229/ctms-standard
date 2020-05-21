package com.sinotrans.oms.test.service;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.test.model.FjWorklogitemModel;

public interface FjWorklogitemManager extends MybatisManager {

	FjWorklogitemModel get(String id);

	FjWorklogitemModel save(FjWorklogitemModel model);

	List<FjWorklogitemModel> saveAll(Collection<FjWorklogitemModel> models);

	void remove(FjWorklogitemModel model);

	void removeByPk(String id);

	void removeAllByPks(Collection<String> ids);

}
