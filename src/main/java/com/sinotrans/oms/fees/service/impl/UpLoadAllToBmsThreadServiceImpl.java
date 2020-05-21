package com.sinotrans.oms.fees.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

import com.sinotrans.framework.core.aop.BaseAspect;
import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.aop.IgnoreLoginController;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.fees.dto.EfBmsImModelDto;
import com.sinotrans.oms.fees.manager.EfBusinessFeesManager;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;
import com.sinotrans.oms.fees.service.EfBusinessFeesContractLogisticSettlementService;
import com.sinotrans.oms.fees.service.UpLoadAllToBmsThreadService;

/**  
* Title: UpLoadAllToBmsThreadServiceImpl  
* Description:  
* @author Shoven.Jiang  
* @date 2018年10月25日  
* @version 1.0  
*/
@Component
public class UpLoadAllToBmsThreadServiceImpl extends BaseAspect implements UpLoadAllToBmsThreadService{

	@Autowired
	private EfBusinessFeesContractLogisticSettlementService efBusinessFeesContractLogisticSettlementService;
	@Autowired
	private EfBusinessFeesManager efBusinessFeesManager;
	
	
	@Override
	@Async("threadPoolBean")
	public void upLoadAllToBms(List<EfBmsImModelDto> efBmsImModelDtos) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		try {
			List<EfBmsImModelDto> afterEfBmsImModelDtos = new ArrayList<>();
			for (EfBmsImModelDto efBmsImModelDto : efBmsImModelDtos) {
				Long eoorId = efBmsImModelDto.getEoorId();
				String businessType = efBmsImModelDto.getEfbmbusinessType();
				ResponseData responseData = this.efBusinessFeesContractLogisticSettlementService.upLoadBmsByContractLogisticTemplete(efBmsImModelDto, eoorId, businessType);
			}
		} catch (Exception e) {
			this.rollBackStatus(efBmsImModelDtos, e);
			log.debug("订单全部结算上传错误异常" + e);
		} finally {
			IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		}
		
	}
	
	/**
	 * (异常捕捉费用状态置位失败并记录异常信息)
	 * @author Shoven.Jiang  
	 * @date 2018年10月25日
	 * @param efBmsImModelDtos
	 * @param e
	 */
	private void rollBackStatus(List<EfBmsImModelDto> efBmsImModelDtos ,Exception e) {
    	List<EfBusinessFeesModel> saveEfBusinessFeesModels = new ArrayList<EfBusinessFeesModel>();
    	for (int i = 0; i < efBmsImModelDtos.size(); i++) {
			Long eoorId = efBmsImModelDtos.get(i).getEoorId();
			if (null != eoorId) {
				List<FilterCondition> efbfConditions = new ArrayList<>();
				efbfConditions.add(new FilterCondition("efbfEoorId", eoorId, "="));
				EfBusinessFeesModel efBusinessFeesModel = new EfBusinessFeesModel();
				List<EfBusinessFeesModel> efBusinessFeesModels = efBusinessFeesManager.findByCondition(efbfConditions);
				if (EmptyUtils.isNotEmpty(efBusinessFeesModels)) {
					for (int j = 0; j < efBusinessFeesModels.size(); j++) {
						efBusinessFeesModel = efBusinessFeesModels.get(j);
						Long efbfStatus = efBusinessFeesModel.getEfbfStatus();
						//将上传中状态置位上传失败状态，并把错误信息记录起来
						if (Constants.EFBF_STATUS_UPLOADING.equals(efbfStatus)) {
							efBusinessFeesModel.setEfbfStatus(Constants.HD_SYMBOL_3_F);
							if(EmptyUtils.isNotEmpty(e.getMessage())){
								if (e.getMessage().length()>120){
									efBusinessFeesModel.setEfbfHdInformation("上传异常:"+e.getMessage().substring(0,119));
								}else{
									efBusinessFeesModel.setEfbfHdInformation("上传异常:"+e.getMessage());
								}
								
							}else{
								efBusinessFeesModel.setEfbfHdInformation("上传异常,请联系管理员");
							}
							saveEfBusinessFeesModels.add(efBusinessFeesModel);
						}
					}
				}
			}
		}
    	this.efBusinessFeesManager.saveAll(saveEfBusinessFeesModels);
    }
}
