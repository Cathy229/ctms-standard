package com.sinotrans.oms.fees.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.fees.model.EfBmsImModel;

public interface EfBmsImManager extends MybatisManager{

	EfBmsImModel get(Long id);

	List<EfBmsImModel> findByCondition(List<FilterCondition> conditions);

	EfBmsImModel save(EfBmsImModel model);

	List<EfBmsImModel> saveAll(List<EfBmsImModel> models);

	void delete(EfBmsImModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
