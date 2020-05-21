package com.sinotrans.oms.contract.service;

import java.util.List;

import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.contract.model.ElProtocolCostModel;

public interface ElProtocolCostService {
	
	/**
	 * @deprecated:批量保存协议明细
	 * @author Colley.Bai  
	 * @date 2018年11月21日
	 * @param elProtocolCostModelList
	 * @return
	 */
	public ResponseData<List<ElProtocolCostModel>> batchSaveProtocolCost(List<ElProtocolCostModel> elProtocolCostModelList);

	/**
	 * @deprecated:批量删除协议明细
	 * @author Colley.Bai  
	 * @date 2018年11月22日
	 * @param epctIds
	 * @return
	 */
	public ResponseData<List<ElProtocolCostModel>> batchDeleteProtocolCost(List<Long> epctIds);
}
