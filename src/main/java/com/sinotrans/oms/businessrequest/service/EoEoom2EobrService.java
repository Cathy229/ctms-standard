package com.sinotrans.oms.businessrequest.service;

import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoEoom2EobrModel;
import com.sinotrans.oms.common.base.ResponseData;
/**
 * 
 * @Date 2018年8月27日 下午4:04:43
 * @Title: EoEoom2EobrService.java
 * @Author Simon Guo
 * @Description: 订舱物料信息
 */
public interface EoEoom2EobrService {
	/**
	 * 
	 * @date 2018年8月15日 下午12:05:53  
	 * @author simon 
	 * Description:订舱物料信息保存
	 * @param eoRequestBookingModel
	 * @return
	 */
	ResponseData<List<EoEoom2EobrModel>> saveBookingMaterial(List<EoEoom2EobrModel> eoEoom2EobrModels);
	/**
	 * 
	 * @DATE 2018年8月27日 下午4:08:50
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据id删除订舱物料信息
	 * @param eobmId
	 * @return
	 */
	ResponseData<EoEoom2EobrModel> deleteById(Long eobmId);
	/**
	 * 
	 * @DATE 2018年8月27日 下午4:08:50
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据ids批量删除订舱物料信息
	 * @param eobmId
	 * @return
	 */
	ResponseData<List<EoEoom2EobrModel>> deleteByIds(List<Long> eobmIds);
	
}
