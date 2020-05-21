package com.sinotrans.oms.customerproject.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.customerproject.manager.EbProjectManager;
import com.sinotrans.oms.customerproject.manager.EbProjectPlanManager;
import com.sinotrans.oms.customerproject.model.EbProjectModel;
import com.sinotrans.oms.customerproject.model.EbProjectPlanModel;
import com.sinotrans.oms.customerproject.service.EbProjectPlanService;
import com.sinotrans.oms.customerproject.service.EbProjectService;
@Service
public class EbProjectServiceImpl implements EbProjectService {
	
	@Autowired
	private EbProjectManager ebProjectManager;
	@Autowired
	private EbProjectPlanService ebProjectPlanService;
	@Autowired
	private EbProjectPlanManager ebProjectPlanManager;
	@Override
	public ResponseData<List> getProjectItem() {
		List currentProjects = ebProjectManager.getCurrentProject();
		ResponseData<List> responseData = new ResponseData<>();
		responseData.setData(currentProjects);
		responseData.setCode(Constants.YES);
		responseData.setMsg("查询项目列表成功");
		return responseData;
	}
	
	@Override
	public String getBusinessTypeByEoorId(Long eoorId) {
		String businessType = "";//业务类型的取值：首先从项目执行计划上取值，取不到再从项目上取值 add by shoven
		businessType = this.ebProjectPlanService.getBusinessTypeByEoorId(eoorId);
		if (EmptyUtils.isEmpty(businessType)) {
			businessType = this.getBusinessTypeByEoorId(eoorId);
		}
		return businessType;
	}

	@Override
	public String getBusinessTypeByEbppIdOrEbpjId(Long eoorLoEbppId, Long eoorEbpjId) {
		EbProjectPlanModel ebProjectPlanModel = new EbProjectPlanModel();
		String businessType = "";//统计值类型
		if (null != eoorLoEbppId) {
			ebProjectPlanModel = this.ebProjectPlanManager.get(eoorLoEbppId);
			if (null != ebProjectPlanModel) {
				businessType = ebProjectPlanModel.getEbppBusinessType();
			}
		}
		EbProjectModel ebProjectModel = new EbProjectModel();
		if (null != eoorEbpjId && EmptyUtils.isEmpty(businessType)) {
			ebProjectModel = this.ebProjectManager.get(eoorEbpjId);
			if (null != ebProjectModel) {
				businessType = ebProjectModel.getEbpjBusinessType();
			}
		}
		return businessType;
	}

}
