package com.sinotrans.oms.businessrequest.service;

import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.common.base.ResponseData;
/**
 * 
 * @Date 2018年8月27日 下午4:04:43
 * @Title: EoEoom2EobrService.java
 * @Author Simon Guo
 * @Description: 订舱随附单据信息Service
 */
public interface EoEoddBillService {
	/**
	 * 
	 * @DATE 2018年8月27日 下午4:08:50
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据id删除订舱随附单据信息
	 * @param eobmId
	 * @return
	 */
	ResponseData<EoEoddBillModel> deleteById(Long eoebId);
	/**
	 * 
	 * @DATE 2018年8月27日 下午4:08:50
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据ids批量删除订舱随附单据信息
	 * @param eobmId
	 * @return
	 */
	ResponseData<List<EoEoddBillModel>> deleteByIds(List<Long> eoebIds);
	
}
