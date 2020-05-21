package com.sinotrans.oms.businessrequest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.businessrequest.manager.EoImportJoabBoxManager;
import com.sinotrans.oms.businessrequest.model.EoImportJoabBoxModel;
import com.sinotrans.oms.businessrequest.service.EoImportJoabBoxService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.EmptyUtils;
/**  
* Title: EoImportJoabBoxServiceImpl  
* Description:  进口箱service
* @author Colley.Bai  
* @date 2019年02月26日  
* @version 1.0  
*/
@Service
public class EoImportJoabBoxServiceImpl implements EoImportJoabBoxService {

	@Autowired
	private EoImportJoabBoxManager eoImportJoabBoxManager;
	
	@Override
	public ResponseData<List<EoImportJoabBoxModel>> batchSaveEoImportJoabBox(
			List<EoImportJoabBoxModel> eoImportJoabBoxModelList) {
		ResponseData<List<EoImportJoabBoxModel>> responseData = new ResponseData<>();
		if (EmptyUtils.isNotEmpty(eoImportJoabBoxModelList)) {
			List<EoImportJoabBoxModel> afterEoImportJoabBoxModelList = eoImportJoabBoxManager.saveAll(eoImportJoabBoxModelList);
			if (EmptyUtils.isNotEmpty(afterEoImportJoabBoxModelList)) {
				responseData.setData(afterEoImportJoabBoxModelList);
				responseData.setCode(Constants.YES);
				responseData.setMsg("保存成功");
			} else {
				responseData.setCode(Constants.NO);
				responseData.setMsg("保存失败");
			} 
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("保存失败");
		}
		return responseData;
	}

	@Override
	public ResponseData<List<EoImportJoabBoxModel>> batchDeleteEoImportJoabBox(List<Long> eoidIds) {
		ResponseData<List<EoImportJoabBoxModel>> responseData = new ResponseData<>();
		if (EmptyUtils.isNotEmpty(eoidIds)) {
			eoImportJoabBoxManager.deleteByPks(eoidIds);
			responseData.setCode(Constants.YES);
			responseData.setMsg("删除成功");
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("ID为空，不允许删除，请重试");
		}
		return responseData;
	}

}
