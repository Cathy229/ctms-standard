package com.sinotrans.oms.businessrequest.dto;

import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoFreightImportModel;
import com.sinotrans.oms.businessrequest.model.EoImportJoabBoxModel;
import com.sinotrans.oms.eoorder.model.EoOrderMaterielModel;

public class EoFreightImportModelDto {

	private EoFreightImportModel eoFreightImportModel;//查验
	
	private List<EoImportJoabBoxModel> cEoImportJoabBoxModelList;//海关
	
	private List<EoImportJoabBoxModel> qEoImportJoabBoxModelList;//商检
	
	private List<EoImportJoabBoxModel> eoImportJoabBoxModelList;//押箱集装箱
	
	private EoFreightImportModel singleEoFreightImportModel;//换单
	
	private EoFreightImportModel paymentEoFreightImportModel;//缴费
	
	private EoFreightImportModel containerDetentioEoFreightImportModel;//押箱
	
	private EoFreightImportModel checkEoFreightImportModel;
	
	private List<EoOrderMaterielModel> eoOrderMaterielModelList; 

	public EoFreightImportModel getEoFreightImportModel() {
		return eoFreightImportModel;
	}

	public void setEoFreightImportModel(EoFreightImportModel eoFreightImportModel) {
		this.eoFreightImportModel = eoFreightImportModel;
	}

	public List<EoImportJoabBoxModel> getcEoImportJoabBoxModelList() {
		return cEoImportJoabBoxModelList;
	}

	public void setcEoImportJoabBoxModelList(List<EoImportJoabBoxModel> cEoImportJoabBoxModelList) {
		this.cEoImportJoabBoxModelList = cEoImportJoabBoxModelList;
	}

	public List<EoImportJoabBoxModel> getqEoImportJoabBoxModelList() {
		return qEoImportJoabBoxModelList;
	}

	public void setqEoImportJoabBoxModelList(List<EoImportJoabBoxModel> qEoImportJoabBoxModelList) {
		this.qEoImportJoabBoxModelList = qEoImportJoabBoxModelList;
	}

	public EoFreightImportModel getSingleEoFreightImportModel() {
		return singleEoFreightImportModel;
	}

	public void setSingleEoFreightImportModel(EoFreightImportModel singleEoFreightImportModel) {
		this.singleEoFreightImportModel = singleEoFreightImportModel;
	}

	public EoFreightImportModel getPaymentEoFreightImportModel() {
		return paymentEoFreightImportModel;
	}

	public void setPaymentEoFreightImportModel(EoFreightImportModel paymentEoFreightImportModel) {
		this.paymentEoFreightImportModel = paymentEoFreightImportModel;
	}

	public EoFreightImportModel getContainerDetentioEoFreightImportModel() {
		return containerDetentioEoFreightImportModel;
	}

	public void setContainerDetentioEoFreightImportModel(EoFreightImportModel containerDetentioEoFreightImportModel) {
		this.containerDetentioEoFreightImportModel = containerDetentioEoFreightImportModel;
	}

	public EoFreightImportModel getCheckEoFreightImportModel() {
		return checkEoFreightImportModel;
	}

	public void setCheckEoFreightImportModel(EoFreightImportModel checkEoFreightImportModel) {
		this.checkEoFreightImportModel = checkEoFreightImportModel;
	}

	public List<EoImportJoabBoxModel> getEoImportJoabBoxModelList() {
		return eoImportJoabBoxModelList;
	}

	public void setEoImportJoabBoxModelList(List<EoImportJoabBoxModel> eoImportJoabBoxModelList) {
		this.eoImportJoabBoxModelList = eoImportJoabBoxModelList;
	}

	public List<EoOrderMaterielModel> getEoOrderMaterielModelList() {
		return eoOrderMaterielModelList;
	}

	public void setEoOrderMaterielModelList(List<EoOrderMaterielModel> eoOrderMaterielModelList) {
		this.eoOrderMaterielModelList = eoOrderMaterielModelList;
	}

	
}
