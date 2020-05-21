package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.DpInTrackModel;

public interface DpInTrackManager extends MybatisManager{
	
	DpInTrackModel get(Long id);

	List<DpInTrackModel> findByCondition(List<FilterCondition> conditions);
	List<DpInTrackModel> findByCondition(List<FilterCondition> conditions,String orderBy);

	DpInTrackModel save(DpInTrackModel model);

	List<DpInTrackModel> saveAll(List<DpInTrackModel> models);

	void delete(DpInTrackModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
