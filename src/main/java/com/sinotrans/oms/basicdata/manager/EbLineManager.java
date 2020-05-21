package com.sinotrans.oms.basicdata.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.basicdata.model.EbLineModel;

public interface EbLineManager extends MybatisManager{

	EbLineModel get(Long id);

	List<EbLineModel> findByCondition(List<FilterCondition> conditions);

	EbLineModel save(EbLineModel model);

	List<EbLineModel> saveAll(List<EbLineModel> models);

	void delete(EbLineModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
