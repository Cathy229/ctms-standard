package com.sinotrans.oms.eoor.service;


import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.eoor.dto.EoLandOrderTrackQueryItem;
import com.sinotrans.oms.eoor.dto.EoorScheduleQueryItem;
import com.sinotrans.oms.eoor.dto.EtSchedduleModelDto;
import com.sinotrans.oms.eoor.model.EtSchedulePlanModel;
import com.sinotrans.oms.eoor.model.EtTaskModel;

public interface EoorService {
	
	/**
	 * 通过固定的查询条件来获取订单的查询结果
	 * add by shoven 2018年8月8日14:33:11
	 * @param conditionMap
	 * @return
	 */
	ResponseData<QueryData> queryOrderFeeByCondition(QueryInfo queryInfo);

	ResponseData<QueryData> querySchedulOrdeCondition(QueryInfo queryInfo);


	ResponseData<QueryData> queryEotaInfoCondition(QueryInfo queryInfo);

	ResponseData<List<EtSchedulePlanModel>> saveSchedulePlan(List<EtSchedduleModelDto> etSchedduleModelDtoList);


	ResponseData queryCancelScheduling(Integer[] etspIds);

	ResponseData querySchedulingConfirmation(Integer[] etspIds);

	ResponseData queryCancelConfirm(Integer[] etspIds);

	ResponseData queryIntelligentScheduling(Integer[] ettaIds);

	ResponseData<QueryData> queryStationAndVehicleTracksCondition(QueryInfo queryInfo);

	ResponseData<List<EtSchedulePlanModel>> querySaveScheduling(List<EoorScheduleQueryItem> eoorScheduleQueryItemList);

	ResponseData queryStationJWDCondition(Integer[] etspIds);

	ResponseData<List<EtTaskModel>> saveEttaCarrier(List<EtTaskModel> etTaskModels);

	ResponseData<QueryData> queryEoLandOrderTrackQuery(QueryInfo queryInfo);

	ResponseData<List<EoLandOrderTrackQueryItem>> querySavePlanDate(List<EoLandOrderTrackQueryItem> eoLandOrderTrackQueryItems);

	ResponseData queryPrintDrivingConfirmation(Integer[] etspIds);

	
	
}
