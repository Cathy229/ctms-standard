package com.sinotrans.oms.businessrequest.service;

import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoImportJoabBoxModel;
import com.sinotrans.oms.common.base.ResponseData;

public interface EoImportJoabBoxService {

	
	/**
	 * @deprecated:批量保存出口箱信息
	 * @author Colley.Bai  
	 * @date 2019年2月26日
	 * @param eoImportJoabBoxModelLis
	 * @return
	 */
	public ResponseData<List<EoImportJoabBoxModel>> batchSaveEoImportJoabBox(List<EoImportJoabBoxModel> eoImportJoabBoxModelLis);

	/**
	 * @deprecated:批量删除出口箱信息
	 * @author Colley.Bai  
	 * @date 2019年2月26日
	 * @param eoidIds
	 * @return
	 */
	public ResponseData<List<EoImportJoabBoxModel>> batchDeleteEoImportJoabBox(List<Long> eoidIds);
}
