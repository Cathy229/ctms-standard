package com.sinotrans.oms.contract.service;

import java.util.List;

import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.contract.model.ElContractGreatClausesModel;

public interface ElContractGreatClausesService {

	/**
	 * @deprecated:合同重要条款基本信息保存
	 * @author Colley.Bai  
	 * @date 2019年03月19日
	 * @param elContractGreatClausesModelList
	 * @return
	 */
	public ResponseData<List<ElContractGreatClausesModel>> batchSaveContractGreatClauses(List<ElContractGreatClausesModel> elContractGreatClausesModelList);

	/**
	 * @deprecated:批量删除重要条款
	 * @author Colley.Bai  
	 * @date 2019年03月19日
	 * @param ecgcIds
	 * @return
	 */
	public ResponseData<List<ElContractGreatClausesModel>> batchDeleteContractGreatClauses(List<Long> ecgcIds);
}
