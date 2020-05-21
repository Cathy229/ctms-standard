package com.sinotrans.oms.eoor.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.eoor.model.SchedulStopsInfoModel;

public interface SchedulStopsInfoManager extends MybatisManager{
	
	SchedulStopsInfoModel get(Integer id);

	List<SchedulStopsInfoModel> findByCondition(List<FilterCondition> conditions);

	SchedulStopsInfoModel save(SchedulStopsInfoModel model);

	List<SchedulStopsInfoModel> saveAll(List<SchedulStopsInfoModel> models);

	void delete(SchedulStopsInfoModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Integer id);

	void deleteByPks(Collection<Integer> ids);

	SchedulStopsInfoModel saveOrder(SchedulStopsInfoModel schedulStopsInfoModel) ;

	QueryData queryStationAndVehicleTracksCondition(QueryInfo queryInfo);

	String getStationJWD(Integer[] etspIds);
	
}
