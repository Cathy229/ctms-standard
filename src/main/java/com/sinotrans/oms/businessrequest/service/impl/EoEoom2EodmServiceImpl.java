package com.sinotrans.oms.businessrequest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.businessrequest.manager.EoEoom2EodmManager;
import com.sinotrans.oms.businessrequest.model.EoEoom2EodmModel;
import com.sinotrans.oms.businessrequest.service.EoEoom2EodmService;
import com.sinotrans.oms.common.base.ResponseData;
/**
 * 
 * @Date 2018年8月27日 下午5:06:49
 * @Title: EoEoom2EodmServiceImpl.java
 * @Author Simon Guo
 * @Description: 报关物料信息service
 */
@Service
public class EoEoom2EodmServiceImpl implements EoEoom2EodmService {
	
	@Autowired
	public EoEoom2EodmManager eoEoom2EodmManager;

	@Override
	public ResponseData<EoEoom2EodmModel> deleteById(Long eodmId) {
		if (eodmId != null) {
			eoEoom2EodmManager.deleteByPk(eodmId);
			ResponseData<EoEoom2EodmModel> responseData = new ResponseData<>();
			responseData.setData(null);
			return responseData;
		}
		return null;
	}

	@Override
	public ResponseData<List<EoEoom2EodmModel>> deleteByIds(List<Long> eodmIds) {
		if (eodmIds != null && eodmIds.size() > 0) {
			eoEoom2EodmManager.deleteByPks(eodmIds);
			ResponseData<List<EoEoom2EodmModel>> responseData = new ResponseData<>();
			responseData.setData(null);
			return responseData;
		}
		return null;
	}

}
