package com.sinotrans.oms.businessrequest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.businessrequest.manager.EoEorb2EosrManager;
import com.sinotrans.oms.businessrequest.model.EoEorb2EosrModel;
import com.sinotrans.oms.businessrequest.service.EoEorb2EosrService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.EmptyUtils;
@Service
public class EoEorb2EosrServiceImpl implements EoEorb2EosrService {
	
	@Autowired
	private EoEorb2EosrManager eoEorb2EosrManager;
	
	@Override
	public ResponseData<List<EoEorb2EosrModel>> saveBookingEoet(List<EoEorb2EosrModel> eoEorb2EosrModels) {
		for (int i = 0; i < eoEorb2EosrModels.size(); i++) {
			if (EmptyUtils.isNotEmpty(eoEorb2EosrModels.get(i).getEobtFclLcl())) {
				eoEorb2EosrModels.get(i).setEobtFclLcl(Constants.SYS_MESSAGE_SEND_WAY_FAX);
			}
		}
		List<EoEorb2EosrModel> afterEoEorb2EosrModelList = eoEorb2EosrManager.saveAll(eoEorb2EosrModels);
		ResponseData<List<EoEorb2EosrModel>> responseData = new ResponseData<>();
		responseData.setData(afterEoEorb2EosrModelList);
		return responseData;
	}

	@Override
	public ResponseData<EoEorb2EosrModel> deleteById(Long eobtId) {
		if (eobtId != null) {
			eoEorb2EosrManager.deleteByPk(eobtId);
			ResponseData<EoEorb2EosrModel> responseData = new ResponseData<>();
			responseData.setData(null);
			return responseData;
		}
		return null;
	}

	@Override
	public ResponseData<List<EoEorb2EosrModel>> deleteByIds(List<Long> eobtIds) {
		if (eobtIds != null && eobtIds.size() > 0) {
			eoEorb2EosrManager.deleteByPks(eobtIds);
			ResponseData<List<EoEorb2EosrModel>> responseData = new ResponseData<>();
			responseData.setData(null);
			return responseData;
		}
		return null;
	}

}
