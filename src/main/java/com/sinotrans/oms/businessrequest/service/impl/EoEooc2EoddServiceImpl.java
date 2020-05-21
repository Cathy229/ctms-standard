package com.sinotrans.oms.businessrequest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.businessrequest.manager.EoEooc2EoddManager;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoddModel;
import com.sinotrans.oms.businessrequest.service.EoEooc2EoddService;
import com.sinotrans.oms.common.base.ResponseData;
/**
 * 
 * @Date 2018年8月27日 下午5:06:49
 * @Title: EoEoom2EodmServiceImpl.java
 * @Author Simon Guo
 * @Description: 报关集装箱service
 */
@Service
public class EoEooc2EoddServiceImpl implements EoEooc2EoddService {
	
	@Autowired
	public EoEooc2EoddManager eoEooc2EoddManager;

	@Override
	public ResponseData<EoEooc2EoddModel> deleteById(Long eocdId) {
		if (eocdId != null) {
			eoEooc2EoddManager.deleteByPk(eocdId);
			ResponseData<EoEooc2EoddModel> responseData = new ResponseData<>();
			responseData.setData(null);
			return responseData;
		}
		return null;
	}

	@Override
	public ResponseData<List<EoEooc2EoddModel>> deleteByIds(List<Long> eocdIds) {
		if (eocdIds != null && eocdIds.size() > 0) {
			eoEooc2EoddManager.deleteByPks(eocdIds);
			ResponseData<List<EoEooc2EoddModel>> responseData = new ResponseData<>();
			responseData.setData(null);
			return responseData;
		}
		return null;
	}

}
