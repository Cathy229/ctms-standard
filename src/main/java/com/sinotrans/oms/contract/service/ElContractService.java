package com.sinotrans.oms.contract.service;

import java.util.List;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.contract.dto.ElContractDto;
import com.sinotrans.oms.contract.dto.ElContractModelDto;
import com.sinotrans.oms.contract.model.ElContractModel;

public interface ElContractService {

	/**
	 * @deprecated:通过固定的查询条件来获取合同信息的查询结果
	 * @author Colley.Bai  
	 * @date 2018年11月20日
	 * @param queryInfo
	 * @return
	 */
	public ResponseData<QueryData> queryContractByCondition(QueryInfo queryInfo);

	/**
	 * @deprecated:合同+接单设置（按照合同主键）
	 * @author Colley.Bai  
	 * @date 2018年11月20日
	 * @param elctId
	 * @return
	 */
	public ResponseData<ElContractDto> getContractAndContractConfigById(Long elctId);

	/**
	 * @deprecated:合同基本信息保存
	 * @author Colley.Bai  
	 * @date 2018年11月20日
	 * @param elContractModelDto
	 * @return
	 */
	public ResponseData<ElContractModel> saveContract(ElContractModelDto elContractModelDto);

	/**
	 * @deprecated:修改合同状态
	 * @author Colley.Bai  
	 * @date 2018年11月26日
	 * @param elContractModelList
	 * @return
	 */
	public ResponseData<List<ElContractModel>> batchSaveElctContract(List<ElContractModel> elContractModelList);

}
