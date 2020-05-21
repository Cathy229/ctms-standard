package com.sinotrans.oms.contract.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.contract.manager.ElContractGreatClausesManager;
import com.sinotrans.oms.contract.model.ElContractGreatClausesModel;
import com.sinotrans.oms.contract.service.ElContractGreatClausesService;

/**
 * <p>Description: 合同重要条款Manage </p>
 * @author Colley.Bai
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 20190319              Colley.Bai       	                    创建
 * </pre>
 */
@Service
public class ElContractGreatClausesServiceImpl implements ElContractGreatClausesService {

	@Autowired
	private ElContractGreatClausesManager elContractGreatClausesManager;
	
	@Override
	public ResponseData<List<ElContractGreatClausesModel>> batchSaveContractGreatClauses(
			List<ElContractGreatClausesModel> elContractGreatClausesModelList) {
		ResponseData<List<ElContractGreatClausesModel>> responseData = new ResponseData<>();
		List<ElContractGreatClausesModel> afterElContractGreatClausesModelList = new ArrayList<>();
		if (EmptyUtils.isNotEmpty(elContractGreatClausesModelList)) {
			afterElContractGreatClausesModelList = elContractGreatClausesManager.saveAll(elContractGreatClausesModelList);
			if (EmptyUtils.isNotEmpty(afterElContractGreatClausesModelList)) {
				responseData.setMsg("保存成功");
				responseData.setCode(Constants.YES);
				responseData.setData(afterElContractGreatClausesModelList);
			} else {
				responseData.setMsg("保存失败");
				responseData.setCode(Constants.NO);
				responseData.setData(afterElContractGreatClausesModelList);
			}
		} else {
			responseData.setMsg("保存失败");
			responseData.setCode(Constants.NO);
			responseData.setData(afterElContractGreatClausesModelList);
		}
		return responseData;
	}

	@Override
	public ResponseData<List<ElContractGreatClausesModel>> batchDeleteContractGreatClauses(List<Long> ecgcIds) {
		ResponseData<List<ElContractGreatClausesModel>> responseData = new ResponseData<List<ElContractGreatClausesModel>>();
		
		if (EmptyUtils.isNotEmpty(ecgcIds)) {
			elContractGreatClausesManager.deleteByPks(ecgcIds);
			responseData.setCode(Constants.YES);
			responseData.setMsg("删除成功");
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("ID为空，不允许删除，请重试");
		}
		
		return responseData;
	}

}
