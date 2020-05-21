package com.sinotrans.oms.businessrequest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.businessrequest.manager.EoEorn2EonmManager;
import com.sinotrans.oms.businessrequest.model.EoEorn2EonmModel;
import com.sinotrans.oms.businessrequest.service.EoEorn2EonmService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.EmptyUtils;
/**  
* Title: EoEorn2EonmServiceImpl  
* Description:  货物service
* @author Colley.Bai  
* @date 2019年02月21日  
* @version 1.0  
*/
@Service
public class EoEorn2EonmServiceImpl implements EoEorn2EonmService {

	@Autowired
	private EoEorn2EonmManager eoEorn2EonmManager;
	
	@Override
	public ResponseData<EoEorn2EonmModel> saveEoEorn2Eonm(EoEorn2EonmModel eoEorn2EonmModel) {
		ResponseData<EoEorn2EonmModel> responseData = new ResponseData<>();
		EoEorn2EonmModel afterEoEorn2EonmModel = eoEorn2EonmManager.save(eoEorn2EonmModel);
		if (null != afterEoEorn2EonmModel) {
			responseData.setMsg("保存成功");
			responseData.setCode(Constants.YES);
			responseData.setData(afterEoEorn2EonmModel);
		} else {
			responseData.setMsg("保存失败");
			responseData.setCode(Constants.NO);
			responseData.setData(afterEoEorn2EonmModel);
		}
		return responseData;
	}

	@Override
	public ResponseData<List<EoEorn2EonmModel>> batchSaveEoEorn2Eonm(List<EoEorn2EonmModel> eoEorn2EonmModelList) {
		ResponseData<List<EoEorn2EonmModel>> responseData = new ResponseData<>();
		if (EmptyUtils.isNotEmpty(eoEorn2EonmModelList)) {
			List<EoEorn2EonmModel> afterEoInspCertificateModelList = eoEorn2EonmManager.saveAll(eoEorn2EonmModelList);
			responseData.setMsg("保存成功");
			responseData.setCode(Constants.YES);
			responseData.setData(afterEoInspCertificateModelList);
		} else {
			responseData.setMsg("保存失败");
			responseData.setCode(Constants.NO);
		}
		return responseData;
	}

	@Override
	public ResponseData<List<EoEorn2EonmModel>> batchDeleteEoEorn2Eonm(List<Long> eonmIds) {
		ResponseData<List<EoEorn2EonmModel>> responseData = new ResponseData<List<EoEorn2EonmModel>>();
		if (EmptyUtils.isNotEmpty(eonmIds)) {
			eoEorn2EonmManager.deleteByPks(eonmIds);
			responseData.setCode(Constants.YES);
			responseData.setMsg("删除成功");
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("ID为空，不允许删除，请重试");
		}
		return responseData;
	}

}
