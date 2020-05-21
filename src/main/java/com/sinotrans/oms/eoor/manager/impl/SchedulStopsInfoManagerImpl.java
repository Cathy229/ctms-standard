package com.sinotrans.oms.eoor.manager.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.eoor.dto.CheckEoorInfoQueryItem;
import com.sinotrans.oms.eoor.dto.GetStationAndVehicleTrackQueryItem;
import com.sinotrans.oms.eoor.manager.SchedulStopsInfoManager;
import com.sinotrans.oms.eoor.model.SchedulStopsInfoModel;
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class SchedulStopsInfoManagerImpl extends MybatisManagerImpl implements SchedulStopsInfoManager{
    @Autowired
	private CommonQueryManager commonQueryManager;

	@Override
	public SchedulStopsInfoModel get(Integer id) {
		return this.myBatisDao.get(SchedulStopsInfoModel.class, id);
	}

	@Override
	public List<SchedulStopsInfoModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(SchedulStopsInfoModel.class, null, null, conditions);
	}

	@Override
	public SchedulStopsInfoModel save(SchedulStopsInfoModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<SchedulStopsInfoModel> saveAll(List<SchedulStopsInfoModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(SchedulStopsInfoModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(SchedulStopsInfoModel.class, conditions);
	}

	@Override
	public void deleteByPk(Integer id) {
		this.myBatisDao.deleteByPk(SchedulStopsInfoModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Integer> ids) {
		 this.myBatisDao.deleteByPks(SchedulStopsInfoModel.class, ids);
	}

	@Override
	public SchedulStopsInfoModel saveOrder(SchedulStopsInfoModel schedulStopsInfoModel) {
		return this.myBatisDao.save(schedulStopsInfoModel);
	}

	@Override
	public QueryData queryStationAndVehicleTracksCondition(QueryInfo queryInfo) {
		queryInfo.setQueryType("com.sinotrans.oms.eoor.mapper.GetStationAndVehicleTrackListQuery");
		return commonQueryManager.query(queryInfo);
	}

	@Override
	public String getStationJWD(Integer[] etspIds) {
		Map<String, Object> conditions = new HashMap<String, Object>();
		conditions.put("etspIds", StringUtils.join(etspIds, ","));
		List<Map<String, Object>> stationAndVehicleTrackList = this.myBatisDao.queryByCondition("GetStationAndVehicleTrackQuery", conditions, null, null, null);
		if (EmptyUtils.isEmpty(stationAndVehicleTrackList)) {
            return null;
        }
		StringBuffer strBuf = new StringBuffer();
		strBuf.append("[");
		for (Map<String, Object> map : stationAndVehicleTrackList) {
			GetStationAndVehicleTrackQueryItem item = (GetStationAndVehicleTrackQueryItem) BlukInsertUtils.parseMapToObject(map, new GetStationAndVehicleTrackQueryItem());
            if(item.getScslSequenceNumber()==1){
            	strBuf.append("{lng:0,lat:0},");
			}
			strBuf.append("{lng:"+item.getScslLongitude()+",lat:"+item.getScslLatitude()+"},");
        }
		strBuf.deleteCharAt(strBuf.length() - 1);
		strBuf.append("]");
		return strBuf.toString();
	}
}
