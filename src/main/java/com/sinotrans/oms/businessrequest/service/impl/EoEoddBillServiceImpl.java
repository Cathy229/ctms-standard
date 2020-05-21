package com.sinotrans.oms.businessrequest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.businessrequest.manager.EoEoddBillManager;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoddManager;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EodmManager;
import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoddModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EodmModel;
import com.sinotrans.oms.businessrequest.service.EoEoddBillService;
import com.sinotrans.oms.businessrequest.service.EoEooc2EoddService;
import com.sinotrans.oms.businessrequest.service.EoEoom2EodmService;
import com.sinotrans.oms.common.base.ResponseData;
/**
 * 
 * @Date 2018年8月27日 下午5:06:49
 * @Title: EoEoom2EodmServiceImpl.java
 * @Author Simon Guo
 * @Description: 报关随附单据信息service
 */
@Service
public class EoEoddBillServiceImpl implements EoEoddBillService {
	
	@Autowired
	public EoEoddBillManager eoEoddBillManager;

	@Override
	public ResponseData<EoEoddBillModel> deleteById(Long eoebId) {
		if (eoebId != null) {
			eoEoddBillManager.deleteByPk(eoebId);
			ResponseData<EoEoddBillModel> responseData = new ResponseData<>();
			responseData.setData(null);
			return responseData;
		}
		return null;
	}

	@Override
	public ResponseData<List<EoEoddBillModel>> deleteByIds(List<Long> eoebIds) {
		if (eoebIds != null && eoebIds.size() > 0) {
			eoEoddBillManager.deleteByPks(eoebIds);
			ResponseData<List<EoEoddBillModel>> responseData = new ResponseData<>();
			responseData.setData(null);
			return responseData;
		}
		return null;
	}

}
