package com.sinotrans.oms.businessrequest.service;


import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoTrailerDto;
import com.sinotrans.oms.businessrequest.dto.EoTrailerModelDto;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;


public interface EoRequestTrailerService {
	
	/**
	 * 拖车请求保存
	 * @param eoRequestTrailerModel
	 * @return
	 */
	public ResponseData<EoRequestTrailerModel> saveTrailer(EoRequestTrailerModel eoRequestTrailerModel);
	
	/**
	 * 拖车请求保存，包含拖车基本信息，拖车货物，拖车集装箱信息
	 * @param eoTrailerDto
	 * @return
	 */
	public ResponseData<EoTrailerDto> saveTrailerAndMaterial(EoTrailerDto eoTrailerDto);
	/**
	 * 拖车请求下达
	 * @param eoetId
	 * @return
	 */
	public ResponseData issuedTrailer(Long[] eoetIds);
	/**
	 * 根据拖车主键查询拖车信息及物料信息，箱信息
	 * @param eoetId
	 * @return
	 */
	public ResponseData<EoTrailerDto> getTrailerAndMaterialById(Long eoetId);
	
	/**
	 * 查询拖车列表信息，根据查询条件
	 * @param condition
	 * @return
	 */
	public ResponseData<QueryData> queryTrailerByCondition(QueryInfo queryInfo);

	/**
	 * @deprecated:拖车基本信息批量保存
	 * @author Colley.Bai  
	 * @date 2018年10月24日 下午03:13:24
	 * @param eoRequestTrailerModelList
	 * @return
	 */
	public ResponseData<List<EoRequestTrailerModel>> batchSaveTrailerAndMaterial(
			List<EoTrailerModelDto> eoRequestTrailerModelList);

	/**
	 * @deprecated:实装箱批量保存信息
	 * @author Colley.Bai  
	 * @date 2018年10月25日 下午02:13:13
	 * @param eoEoom2EoseModelList
	 * @return
	 */
	public ResponseData<List<EoOrderContainerModel>> batchSaveTrailerAndEome(List<EoOrderContainerModel> eoOrderContainerModelList);

	/**
	 * @deprecated:根据eomeIds批量删除事项箱信息
	 * @author Colley.Bai  
	 * @date 2018年10月25日 下午2:50:23
	 * @param eomeIds
	 * @return
	 */
	public ResponseData<List<EoOrderContainerModel>> deleteByIds(List<Long> eoocIds);

	/**
	 * @deprecated:根据eomeId删除实装箱信息
	 * @author Colley.Bai  
	 * @date 2018年10月25日 下午2:50:45
	 * @param eomeId
	 * @return
	 */
	public ResponseData<EoOrderContainerModel> deleteById(Long eoocId);

	/**
	 * @deprecated:根据拖车信息自动计费
	 * @author Colley.Bai  
	 * @date 2018年11月29日
	 * @param eoetIds
	 * @return
	 */
	public ResponseData<List<ElProtocolCostFeelModel>> saveAutomaticChargingByEoetTrailer(Long[] eoetIds);
	
	/**
	 * 业务请求-拖车-状态回退
	 * @author Shoven.Jiang  
	 * @date 2018年12月18日
	 * @param eoetIds 拖车ids
	 * @return
	 */
	ResponseData eoetStatusBackByEoetIds(Long [] eoetIds);

	/**
	 * @deprecated:集装箱保存
	 * @author Colley.Bai  
	 * @date 2018年12月24日
	 * @param mapParam
	 * @return
	 */
	public ResponseData<EoTrailerDto> saveTrailerAndEooc(EoTrailerDto eoTrailerDto);

	/**
	 * @deprecated:拖车委托书导出
	 * @author Colley.Bai  
	 * @date 2018年12月29日
	 * @param eoetIds
	 * @return
	 */
	public ResponseData<Map<String, String>> exportTrailer(Long[] eoetIds);

	/**
	 * @deprecated:根据订单主键查询拖车任务
	 * @author Colley.Bai  
	 * @date 2019年1月8日
	 * @param eoorId
	 * @return
	 */
	public ResponseData<List<EoRequestTrailerModel>> getTrailerAndMaterialByEoorId(Long eoorId);
	
	/**
	 * @deprecated:集装号校验
	 * @author Colley.Bai  
	 * @date 2019年3月1日
	 * @param containerNoStr
	 * @return
	 */
	public String getKeyString(String containerNoStr);

}
