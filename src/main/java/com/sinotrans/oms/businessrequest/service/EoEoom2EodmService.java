package com.sinotrans.oms.businessrequest.service;

import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoEoom2EodmModel;
import com.sinotrans.oms.common.base.ResponseData;
/**
 * 
 * @Date 2018年8月27日 下午5:04:43
 * @Title: EoEoom2EodmService.java
 * @Author Simon Guo
 * @Description: 报关物料信息
 */
public interface EoEoom2EodmService {
	/**
	 * 
	 * @DATE 2018年8月27日 下午5:08:50
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据id删除报关物料信息
	 * @param eobmId
	 * @return
	 */
	ResponseData<EoEoom2EodmModel> deleteById(Long eodmId);
	/**
	 * 
	 * @DATE 2018年8月27日 下午5:08:50
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据ids批量删除报关物料信息
	 * @param eobmIds
	 * @return
	 */
	ResponseData<List<EoEoom2EodmModel>> deleteByIds(List<Long> eodmIds);
	
}
