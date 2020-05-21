package com.sinotrans.oms.businessrule.manager;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrule.model.EbRegionModel;

public interface EbRegionManager extends MybatisManager{
	
	EbRegionModel get(Integer integer);

	List<EbRegionModel> findByCondition(List<FilterCondition> conditions);

	EbRegionModel save(EbRegionModel model);

	List<EbRegionModel> saveAll(List<EbRegionModel> models);

	void delete(EbRegionModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Integer id);

	void deleteByPks(Collection<Long> ids);
}
