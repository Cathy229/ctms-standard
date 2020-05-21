package com.sinotrans.oms.contract.service;

import java.util.List;

import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.contract.model.ElContractConfigModel;

public interface ElContractConfigService {

	/**
	 * @deprecated:接单设置基本信息保存
	 * @author Colley.Bai  
	 * @date 2018年11月20日
	 * @param elContractConfigModelDto
	 * @return
	 */
	public ResponseData<List<ElContractConfigModel>> saveContractConfig(List<ElContractConfigModel> elContractConfigModelList);

	/**
	 * @deprecated:批量删除接单设置
	 * @author Colley.Bai  
	 * @date 2018年11月20日
	 * @param elccIds
	 * @return
	 */
	public ResponseData<List<ElContractConfigModel>> batchDeleteContractConfig(List<Long> elccIds);

}
