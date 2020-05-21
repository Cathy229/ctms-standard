package com.sinotrans.oms.businessrequest.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoBookingDto;
import com.sinotrans.oms.businessrequest.dto.EoBookingModelDto;
import com.sinotrans.oms.businessrequest.dto.EoTrailerDto;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;

public interface EoBookingService {
	/**
	 * 
	 * @date 2018年8月15日 下午12:03:21  
	 * @author simon 
	 * Description:订舱基本信息保存
	 * @param eoRequestBookingModel
	 * @return
	 */
	ResponseData<EoRequestBookingModel> saveBooking(EoBookingModelDto eoBookingModelDto);
	
	/**
	 * 
	 * @date 2018年8月15日 下午12:06:10  
	 * @author simon 
	 * Description:订舱基本+物料+箱信息保存=DTO
	 * @param eoRequestBookingModel
	 * @return
	 */
	ResponseData<EoBookingDto> saveBookingAndMaterial(EoBookingDto eoBookingDto);
	/**
	 * 
	 * @DATE 2018年8月27日 下午4:19:15
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据ID查询订舱基本+物料+箱信息
	 * @param eorbId
	 * @return
	 */
	ResponseData<EoBookingDto> getBookingAndMaterialById(Long eorbId);

	/**
	 * 通过固定的查询条件来获取订舱的查询结果
	 * add by colley 2018年8月28日18:47:36
	 * @param queryInfo
	 * @return
	 */
	ResponseData<QueryData> queryBookingByCondition(QueryInfo queryInfo);
	
	/**
	 * 订舱管理订舱下达
	 * @author Shoven.Jiang  
	 * @date 2018年8月29日
	 * @param eorbId
	 * @return
	 */
	ResponseData issuedBooking(Long [] eorbIds);
	
	/**
	 * 订舱任务提单下达
	 * @author Shoven.Jiang  
	 * @date 2018年11月21日
	 * @param eorbIds
	 * @return
	 */
	ResponseData ladingIssuedBooking(Long [] eorbIds);

	/**
	 * @deprecated:订舱批量生成费用
	 * @author Colley.Bai  
	 * @date 2018年11月29日
	 * @param eorbIds
	 * @return
	 */
	public ResponseData<List<ElProtocolCostFeelModel>> saveAutomaticChargingByEorbBooking(Long[] eorbIds);
	
	/**
	 * 业务请求-订舱-状态回退
	 * @author Shoven.Jiang  
	 * @date 2018年12月18日
	 * @param eoorIds  订单ids
	 * @return
	 */
	ResponseData eorbStatusBackByEoorIds(Long [] eoorIds);

	/**
	 * @deprecated:导出
	 * @author Colley.Bai  
	 * @date 2018年12月28日
	 * @param eorbIds
	 * @return
	 */
	ResponseData exportBooking(Long[] eorbIds,HttpServletResponse resp);
	
	/**
	 * 海运订舱网订舱信息反馈
	 * @author Shoven.Jiang  
	 * @date 2019年1月17日
	 */
	void feedBackToEorb(Map<String, Object> eorbMap);

	/**
     * 待订舱反馈保存时，判断提单号以及任务状态，并且将提单号赋值给该订单下的拖车以及报关任务
     * @author Shoven.Jiang  
     * @date 2018年9月27日
     * @param eoorId
     */
	void saveEoddAndEoetModelByEoorId(Long eoorId, String eorbBulkBillNo, String eorbVoyage, String eorbVesselName);
}
