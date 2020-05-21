package com.sinotrans.oms.businessrequest.service;

import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoEorb2EosrModel;
import com.sinotrans.oms.common.base.ResponseData;

public interface EoEorb2EosrService {
	/**
	 * 
	 * @date 2018年8月15日 下午12:05:13  
	 * @author simon 
	 * Description:订舱箱信息保存
	 * @param eoRequestBookingModel
	 * @return
	 */
	ResponseData<List<EoEorb2EosrModel>> saveBookingEoet(List<EoEorb2EosrModel> eoEorb2EosrModels);
	/**
	 * 
	 * @DATE 2018年8月27日 下午4:48:40
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据id删除订舱箱信息
	 * @param eobtId
	 * @return
	 */
	ResponseData<EoEorb2EosrModel> deleteById(Long eobtId);
	/**
	 * 
	 * @DATE 2018年8月27日 下午4:08:50
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据ids批量删除订舱箱信息
	 * @param eobmId
	 * @return
	 */
	ResponseData<List<EoEorb2EosrModel>> deleteByIds(List<Long> eobtIds);

}
