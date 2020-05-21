package com.sinotrans.oms.businessrequest.service;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoFreightImportModelDto;
import com.sinotrans.oms.common.base.ResponseData;

public interface EoFreightImportService {

	/**
	 * @deprecated:保存查验基本信息
	 * @author Colley.Bai  
	 * @date 2019年2月26日
	 * @param eoFreightImportModel
	 * @return
	 */
	public ResponseData<EoFreightImportModelDto> saveEoFreightImportModel(EoFreightImportModelDto eoFreightImportModelDto);

	/**
	 * @deprecated:根据订单id查询查验信+出口箱信息
	 * @author Colley.Bai  
	 * @date 2019年2月26日
	 * @param eoorId
	 * @return
	 */
	public ResponseData<EoFreightImportModelDto> getEoFreightImportByEoordId(Long eoorId);

	/**
	 * @deprecated:进口箱信息（分页）
	 * @author Colley.Bai  
	 * @date 2019年2月26日
	 * @param queryInfo
	 * @return
	 */
	public ResponseData<QueryData> queryImportJoabBoxByCondition(QueryInfo queryInfo);
	
	/**
	 * @deprecated:查询查验列表
	 * @author Colley.Bai  
	 * @date 2019年2月28日
	 * @param queryInfo
	 * @return
	 */
	public ResponseData<QueryData> queryFreightImportByCondition(QueryInfo queryInfo);

	/**
	 * @deprecated:保存换单基本信息+缴费基本信息+押箱基本信息
	 * @author Colley.Bai  
	 * @date 2019年3月2日
	 * @param eoFreightImportModelDto
	 * @return
	 */
	public ResponseData<EoFreightImportModelDto> saveEoFreightImportSingleAndPaymentAndContainer(
			EoFreightImportModelDto eoFreightImportModelDto);

	/**
	 * @deprecated:站内跟踪列表
	 * @author Colley.Bai  
	 * @date 2019年3月7日
	 * @param queryInfo
	 * @return
	 */
	public ResponseData<QueryData> queryFreightImportTrackByCondition(QueryInfo queryInfo);
}
