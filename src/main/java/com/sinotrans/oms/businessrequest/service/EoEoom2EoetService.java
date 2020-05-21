package com.sinotrans.oms.businessrequest.service;

import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoEoom2EoetModel;
import com.sinotrans.oms.common.base.ResponseData;


public interface EoEoom2EoetService {
	
	/**
	 * 拖车货物保存
	 * @param eoRequestTrailerModel
	 * @return
	 */
	public ResponseData<List<EoEoom2EoetModel>> saveTrailerMaterial(List<EoEoom2EoetModel> eoEoom2EoetModelList);

	/**
	 * @deprecated:根据拖车eootId删除拖车预配箱信息
	 * @author Colley.Bai  
	 * @date 2018年10月13日 上午9:41:23
	 * @param eootId
	 * @return
	 */
	public ResponseData<EoEoom2EoetModel> deleteById(Long eomtId);
	
	/**
	 * @deprecated:根据eootIds删除预配箱信息
	 * @author Colley.Bai  
	 * @date 2018年10月13日 上午9:50:13
	 * @param eootIds
	 * @return
	 */
	public ResponseData<List<EoEoom2EoetModel>> deleteByIds(List<Long> eomtIds);
	
	
}
