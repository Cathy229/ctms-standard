package com.sinotrans.oms.businessrequest.service;

import java.util.List;

import com.sinotrans.oms.businessrequest.dto.EoRequestInspectionDto;
import com.sinotrans.oms.businessrequest.model.EoRequestInspectionModel;
import com.sinotrans.oms.common.base.ResponseData;

public interface EoRequestInspectionService {

	/**
	 * @deprecated:保存委托报检基本信息
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eoRequestInspectionModel
	 * @return
	 */
	public ResponseData<EoRequestInspectionModel> saveRequestInspection(EoRequestInspectionModel eoRequestInspectionModel);
	
	/**
	 * @deprecated:批量删除报检
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eornIds
	 * @return
	 */
	public ResponseData<List<EoRequestInspectionModel>> batchDeleteRequestInspection(List<Long> eornIds);

	/**
	 * @deprecated:报检基本信息+随附单据+需要单据名称+货物信息（保存）
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eoRequestInspectionDto
	 * @return
	 */
	public ResponseData<EoRequestInspectionDto> saveRequestInspectionAndCertificateAndEonm(
			EoRequestInspectionDto eoRequestInspectionDto);

	/**
	 * @deprecated:报检基本信息+随附单据+需要单据名称+货物信息（查询订单）
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eoorId
	 * @return
	 */
	public ResponseData<EoRequestInspectionDto> getRequestInspectionAndCertificateAndEonmByEoordId(Long eoorId);

	/**
	 * @deprecated:报检基本信息+随附单据+需要单据名称+货物信息（任务维度）
	 * @author Colley.Bai  
	 * @date 2019年2月22日
	 * @param eornId
	 * @return
	 */
	public ResponseData<EoRequestInspectionDto> getRequestInspectionAndCertificateAndEonmById(Long eornId);

	
	
}
