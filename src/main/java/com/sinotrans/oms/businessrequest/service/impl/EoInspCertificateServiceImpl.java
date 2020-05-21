package com.sinotrans.oms.businessrequest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.businessrequest.manager.EoInspCertificateManager;
import com.sinotrans.oms.businessrequest.model.EoInspCertificateModel;
import com.sinotrans.oms.businessrequest.service.EoInspCertificateService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.EmptyUtils;
/**  
* Title: EoInspCertificateServiceImpl  
* Description:  单据service
* @author Colley.Bai  
* @date 2019年02月21日  
* @version 1.0  
*/
@Service
public class EoInspCertificateServiceImpl implements EoInspCertificateService {

	@Autowired
	private EoInspCertificateManager eoInspCertificateManager;
	
	@Override
	public ResponseData<EoInspCertificateModel> saveInspCertificate(EoInspCertificateModel eoInspCertificateModel) {
		ResponseData<EoInspCertificateModel> responseData = new ResponseData<>();
		EoInspCertificateModel afterEoInspCertificateModel = eoInspCertificateManager.save(eoInspCertificateModel);
		if (null != afterEoInspCertificateModel) {
			responseData.setMsg("保存成功");
			responseData.setCode(Constants.YES);
			responseData.setData(afterEoInspCertificateModel);
		} else {
			responseData.setMsg("保存失败");
			responseData.setCode(Constants.NO);
			responseData.setData(afterEoInspCertificateModel);
		}
		return responseData;
	}

	@Override
	public ResponseData<List<EoInspCertificateModel>> batchDeleteInspCertificate(List<Long> eoncIds) {
		ResponseData<List<EoInspCertificateModel>> responseData = new ResponseData<List<EoInspCertificateModel>>();
		if (EmptyUtils.isNotEmpty(eoncIds)) {
			eoInspCertificateManager.deleteByPks(eoncIds);
			responseData.setCode(Constants.YES);
			responseData.setMsg("删除成功");
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("ID为空，不允许删除，请重试");
		}
		return responseData;
	}

	@Override
	public ResponseData<List<EoInspCertificateModel>> batchSaveInspCertificate(
			List<EoInspCertificateModel> eoInspCertificateModelList) {
		ResponseData<List<EoInspCertificateModel>> responseData = new ResponseData<>();
		if (EmptyUtils.isNotEmpty(eoInspCertificateModelList)) {
			List<EoInspCertificateModel> afterEoInspCertificateModelList = eoInspCertificateManager.saveAll(eoInspCertificateModelList);
			responseData.setMsg("保存成功");
			responseData.setCode(Constants.YES);
			responseData.setData(afterEoInspCertificateModelList);
		} else {
			responseData.setMsg("保存失败");
			responseData.setCode(Constants.NO);
			responseData.setData(eoInspCertificateModelList);
		}
		return responseData;
	}

}
