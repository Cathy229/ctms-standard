package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoBookingDto;
import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.businessrequest.model.EoRequestDeclarationDeputeModel;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;

public interface EoBookingManager extends MybatisManager{
	
	EoRequestBookingModel get(Long id);

	List<EoRequestBookingModel> findByCondition(List<FilterCondition> conditions);

	EoRequestBookingModel save(EoRequestBookingModel model);

	List<EoRequestBookingModel> saveAll(List<EoRequestBookingModel> models);

	void delete(EoRequestBookingModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);

	EoBookingDto saveBookingAndMaterial(EoBookingDto eoBookingDto);

	EoBookingDto getBookingAndMaterialById(Long eorbId);

	QueryData queryBookingByCondition(QueryInfo queryInfo);
	
	/**
	 * 订舱任务下达
	 * @author Shoven.Jiang  
	 * @date 2018年8月29日
	 * @param eorbIds
	 * @return
	 */
	String issuedBooking(Long eorbIds);
	
	/**
	 * 订舱待反馈保存时将界面中维护的提单号同步保存到该订单下的拖车任务以及报关任务中
	 * @author Shoven.Jiang  
	 * @date 2018年9月27日
	 * @param eoRequestTrailerModels
	 * @param eoRequestDeclarationDeputeModels
	 * @param eorbBulkBillNo
	 */
	void saveEoddAndEoetModelByEoorId(List<EoRequestTrailerModel> eoRequestTrailerModels, List<EoRequestDeclarationDeputeModel> eoRequestDeclarationDeputeModels, List<EoOrderExpandAgencyModel> eoOrderExpandAgencyModels, String eorbBulkBillNo, String eorbVoyage, String eorbVesselName);
	
	/**
	 * 订舱任务提单下达
	 * @author Shoven.Jiang  
	 * @date 2018年11月21日
	 * @param eorbId
	 * @return
	 */
	String ladingIssuedBooking(Long eorbId);
	
	/**
	 * @deprecated:跟踪订舱状态
	 * @author Colley.Bai  
	 * @date 2018年12月26日
	 * @param eoRequestBookingModel
	 */
	void saveDpInTrack(EoRequestBookingModel eoRequestBookingModel);
}
