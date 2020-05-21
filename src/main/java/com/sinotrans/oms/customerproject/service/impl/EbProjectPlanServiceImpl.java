package com.sinotrans.oms.customerproject.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.customerproject.manager.EbProjectPlanManager;
import com.sinotrans.oms.customerproject.model.EbProjectPlanModel;
import com.sinotrans.oms.customerproject.service.EbProjectPlanService;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.model.EoOrderModel;

/**  
* <p>Title: EbProjectPlanServiceImpl</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月10日  
* @version 1.0  
*/
@Service
public class EbProjectPlanServiceImpl implements EbProjectPlanService{

	@Autowired
	private EbProjectPlanManager ebProjectPlanManager;
	@Autowired
	private EoOrderManager eoOrderManage;
	
	@Override
	public String getBusinessTypeByEoorId(Long eoorId) {
		String businessType = "";//项目执行计划中的业务类型
		if (null != eoorId) {
			EoOrderModel eoOrderModel = new EoOrderModel();
			eoOrderModel = this.eoOrderManage.get(eoorId);
			if (null != eoOrderModel) {
				Long eoorLoEbppId = eoOrderModel.getEoorLoEbppId();
				if (null != eoorLoEbppId) {
					EbProjectPlanModel ebProjectPlanModel = this.ebProjectPlanManager.get(eoorLoEbppId);
					if (null != ebProjectPlanModel) {
						businessType = ebProjectPlanModel.getEbppBusinessType();
					}
				}
			}
		}
		return businessType;
	}
}
