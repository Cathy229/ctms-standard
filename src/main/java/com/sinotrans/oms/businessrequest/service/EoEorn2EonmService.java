package com.sinotrans.oms.businessrequest.service;

import java.util.List;

import com.sinotrans.oms.businessrequest.dto.EoRequestInspectionDto;
import com.sinotrans.oms.businessrequest.model.EoEorn2EonmModel;
import com.sinotrans.oms.common.base.ResponseData;

public interface EoEorn2EonmService {

	/**
	 * @deprecated:保存货物信息
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eoEorn2EonmModel
	 * @return
	 */
	public ResponseData<EoEorn2EonmModel> saveEoEorn2Eonm(EoEorn2EonmModel eoEorn2EonmModel);

	/**
	 * @deprecated:批量保存货物信息
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eoEorn2EonmModelList
	 * @return
	 */
	public ResponseData<List<EoEorn2EonmModel>> batchSaveEoEorn2Eonm(List<EoEorn2EonmModel> eoEorn2EonmModelList);
	
	/**
	 * @deprecated:批量删除货物信息
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eonmIds
	 * @return
	 */
	public ResponseData<List<EoEorn2EonmModel>> batchDeleteEoEorn2Eonm(List<Long> eonmIds);

}
