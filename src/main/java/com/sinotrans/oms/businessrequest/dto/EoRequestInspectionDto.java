package com.sinotrans.oms.businessrequest.dto;

import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoEorn2EonmModel;
import com.sinotrans.oms.businessrequest.model.EoInspCertificateModel;
import com.sinotrans.oms.businessrequest.model.EoRequestInspectionModel;

public class EoRequestInspectionDto {
	
	private EoRequestInspectionModel eoRequestInspectionModel;//报检基本信息
	
	private List<EoEorn2EonmModel> eoEorn2EonmModelList;//货物信息
	
	private List<EoInspCertificateModel> eoInspCertificateModelList;//随附单据
	
	private List<EoInspCertificateModel> afterEoInspCertificateModelList;//需要单据名称
	
	private List<EoRequestInspectionModel> eoRequestInspectionModelList;//报检基本信息（多）

	public EoRequestInspectionModel getEoRequestInspectionModel() {
		return eoRequestInspectionModel;
	}

	public void setEoRequestInspectionModel(EoRequestInspectionModel eoRequestInspectionModel) {
		this.eoRequestInspectionModel = eoRequestInspectionModel;
	}

	public List<EoEorn2EonmModel> getEoEorn2EonmModelList() {
		return eoEorn2EonmModelList;
	}

	public void setEoEorn2EonmModelList(List<EoEorn2EonmModel> eoEorn2EonmModelList) {
		this.eoEorn2EonmModelList = eoEorn2EonmModelList;
	}

	public List<EoInspCertificateModel> getEoInspCertificateModelList() {
		return eoInspCertificateModelList;
	}

	public void setEoInspCertificateModelList(List<EoInspCertificateModel> eoInspCertificateModelList) {
		this.eoInspCertificateModelList = eoInspCertificateModelList;
	}

	public List<EoInspCertificateModel> getAfterEoInspCertificateModelList() {
		return afterEoInspCertificateModelList;
	}

	public void setAfterEoInspCertificateModelList(List<EoInspCertificateModel> afterEoInspCertificateModelList) {
		this.afterEoInspCertificateModelList = afterEoInspCertificateModelList;
	}

	public List<EoRequestInspectionModel> getEoRequestInspectionModelList() {
		return eoRequestInspectionModelList;
	}

	public void setEoRequestInspectionModelList(List<EoRequestInspectionModel> eoRequestInspectionModelList) {
		this.eoRequestInspectionModelList = eoRequestInspectionModelList;
	}
	

}

