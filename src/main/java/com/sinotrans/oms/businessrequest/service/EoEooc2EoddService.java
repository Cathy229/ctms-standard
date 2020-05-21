package com.sinotrans.oms.businessrequest.service;

import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoEooc2EoddModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EodmModel;
import com.sinotrans.oms.common.base.ResponseData;
/**
 * 
 * @Date 2018年8月27日 下午5:04:43
 * @Title: EoEooc2EoddService.java
 * @Author Simon Guo
 * @Description: 报关物料信息
 */
public interface EoEooc2EoddService {
	/**
	 * 
	 * @DATE 2018年8月27日 下午5:08:50
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据id删除报关箱信息
	 * @param eocdId
	 * @return
	 */
	ResponseData<EoEooc2EoddModel> deleteById(Long eocdId);
	/**
	 * 
	 * @DATE 2018年8月27日 下午5:08:50
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据ids批量删除报关箱信息
	 * @param eocdIds
	 * @return
	 */
	ResponseData<List<EoEooc2EoddModel>> deleteByIds(List<Long> eocdIds);
	
}
