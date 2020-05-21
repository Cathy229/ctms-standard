package com.sinotrans.oms.businessrequest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.businessrequest.manager.EoEoom2EobrManager;
import com.sinotrans.oms.businessrequest.model.EoEoom2EobrModel;
import com.sinotrans.oms.businessrequest.service.EoEoom2EobrService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.EmptyUtils;
@Service
public class EoEoom2EobrServiceImpl implements EoEoom2EobrService {
	
	@Autowired
	private EoEoom2EobrManager eoEoom2EobrManager;
	
	@Override
	public ResponseData<List<EoEoom2EobrModel>> saveBookingMaterial(List<EoEoom2EobrModel> eoEoom2EobrModels) {
		ResponseData<List<EoEoom2EobrModel>> responseData = new ResponseData<>();
		List<EoEoom2EobrModel> afterEoEoom2EobrModelList = eoEoom2EobrManager.saveAll(eoEoom2EobrModels);
		if (EmptyUtils.isEmpty(afterEoEoom2EobrModelList)) {
			responseData.setData(eoEoom2EobrModels);
			responseData.setCode(Constants.NO);
			responseData.setMsg("保存失败，请重试！");
			return responseData;
		}
		responseData.setData(afterEoEoom2EobrModelList);
		return responseData;
	}

	@Override
	public ResponseData<EoEoom2EobrModel> deleteById(Long eobmId) {
		if (eobmId != null) {
			eoEoom2EobrManager.deleteByPk(eobmId);
			ResponseData<EoEoom2EobrModel> responseData = new ResponseData<>();
			responseData.setData(null);
			return responseData;
		}
		return null;
	}

	@Override
	public ResponseData<List<EoEoom2EobrModel>> deleteByIds(List<Long> eobmIds) {
		if (eobmIds != null && eobmIds.size() > 0) {
			eoEoom2EobrManager.deleteByPks(eobmIds);
			ResponseData<List<EoEoom2EobrModel>> responseData = new ResponseData<>();
			responseData.setData(null);
			return responseData;
		}
		return null;
	}

}
