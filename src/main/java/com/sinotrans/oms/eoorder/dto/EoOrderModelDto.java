package com.sinotrans.oms.eoorder.dto;

import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoImportJoabBoxModel;
import com.sinotrans.oms.eoorder.model.EoEoib2EoimModel;
import com.sinotrans.oms.eoorder.model.EoImportJoabMaterielModel;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;
import com.sinotrans.oms.eoorder.model.EoOrderMaterielModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;

public class EoOrderModelDto {

	private EoOrderModel eoOrderModel;
	
	private EoOrderContainerModel eoOrderContainerModel;
	
	private EoOrderMaterielModel eoOrderMaterielModel;
	
	private EoImportJoabBoxModel eoImportJoabBoxModel;
	
	private EoImportJoabMaterielModel eoImportJoabMaterielModel;
	
	private List<EoEoib2EoimModel> eoEoib2EoimModels;
	
	private List<EoOrderContainerModel> eoOrderContainerModels;
	
	private List<EoOrderMaterielModel> eoOrderMaterielModels;

	public EoOrderModel getEoOrderModel() {
		return eoOrderModel;
	}

	public void setEoOrderModel(EoOrderModel eoOrderModel) {
		this.eoOrderModel = eoOrderModel;
	}

	public EoOrderContainerModel getEoOrderContainerModel() {
		return eoOrderContainerModel;
	}

	public void setEoOrderContainerModel(EoOrderContainerModel eoOrderContainerModel) {
		this.eoOrderContainerModel = eoOrderContainerModel;
	}

	public EoOrderMaterielModel getEoOrderMaterielModel() {
		return eoOrderMaterielModel;
	}

	public void setEoOrderMaterielModel(EoOrderMaterielModel eoOrderMaterielModel) {
		this.eoOrderMaterielModel = eoOrderMaterielModel;
	}

	public EoImportJoabBoxModel getEoImportJoabBoxModel() {
		return eoImportJoabBoxModel;
	}

	public void setEoImportJoabBoxModel(EoImportJoabBoxModel eoImportJoabBoxModel) {
		this.eoImportJoabBoxModel = eoImportJoabBoxModel;
	}

	public List<EoEoib2EoimModel> getEoEoib2EoimModels() {
		return eoEoib2EoimModels;
	}

	public void setEoEoib2EoimModels(List<EoEoib2EoimModel> eoEoib2EoimModels) {
		this.eoEoib2EoimModels = eoEoib2EoimModels;
	}

	public EoImportJoabMaterielModel getEoImportJoabMaterielModel() {
		return eoImportJoabMaterielModel;
	}

	public void setEoImportJoabMaterielModel(EoImportJoabMaterielModel eoImportJoabMaterielModel) {
		this.eoImportJoabMaterielModel = eoImportJoabMaterielModel;
	}

	public List<EoOrderContainerModel> getEoOrderContainerModels() {
		return eoOrderContainerModels;
	}

	public void setEoOrderContainerModels(List<EoOrderContainerModel> eoOrderContainerModels) {
		this.eoOrderContainerModels = eoOrderContainerModels;
	}

	public List<EoOrderMaterielModel> getEoOrderMaterielModels() {
		return eoOrderMaterielModels;
	}

	public void setEoOrderMaterielModels(List<EoOrderMaterielModel> eoOrderMaterielModels) {
		this.eoOrderMaterielModels = eoOrderMaterielModels;
	}
	
	
	
}
