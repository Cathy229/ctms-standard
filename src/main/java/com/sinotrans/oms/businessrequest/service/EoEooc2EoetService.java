package com.sinotrans.oms.businessrequest.service;

import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;
import com.sinotrans.oms.common.base.ResponseData;
/**
 * @deprecated:拖车预配箱
 * add by @author Colley.Bai
 * @date 2018年10月13日 上午9:38:50
 */
public interface EoEooc2EoetService {
	
	/**
	 * @deprecated:拖车预配箱保存
	 * @author Colley.Bai  
	 * @date 2018年10月13日 上午9:24:42
	 * @param eoEooc2EoetModels
	 * @return
	 */
	public ResponseData<List<EoEooc2EoetModel>> saveTrailerEoot(List<EoEooc2EoetModel> eoEooc2EoetModels);
	/**
	 * @deprecated:根据拖车eootId删除拖车预配箱信息
	 * @author Colley.Bai  
	 * @date 2018年10月13日 上午9:41:23
	 * @param eootId
	 * @return
	 */
	public ResponseData<EoEooc2EoetModel> deleteById(Long eootId);
	
	/**
	 * @deprecated:根据eootIds删除预配箱信息
	 * @author Colley.Bai  
	 * @date 2018年10月13日 上午9:50:13
	 * @param eootIds
	 * @return
	 */
	public ResponseData<List<EoEooc2EoetModel>> deleteByIds(List<Long> eootIds);
	
}
