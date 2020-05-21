package com.sinotrans.oms.businessrequest.service;

import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoInspCertificateModel;
import com.sinotrans.oms.common.base.ResponseData;

public interface EoInspCertificateService {
	
	/**
	 * @deprecated:保存单据信息
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eoInspCertificateModel
	 * @return
	 */
	public ResponseData<EoInspCertificateModel> saveInspCertificate(EoInspCertificateModel eoInspCertificateModel);

	/**
	 * @deprecated:批量保存单据信息
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eoInspCertificateModel
	 * @return
	 */
	public ResponseData<List<EoInspCertificateModel>> batchSaveInspCertificate(List<EoInspCertificateModel> eoInspCertificateModelList);
	
	/**
	 * @deprecated:批量删除单据信息
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eoncIds
	 * @return
	 */
	public ResponseData<List<EoInspCertificateModel>> batchDeleteInspCertificate(List<Long> eoncIds);

}
