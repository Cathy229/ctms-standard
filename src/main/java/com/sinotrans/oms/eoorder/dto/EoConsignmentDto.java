package com.sinotrans.oms.eoorder.dto;

import java.io.Serializable;
import java.util.List;

import com.sinotrans.oms.eoorder.model.EoConsignmentMaterielModel;
import com.sinotrans.oms.eoorder.model.EoConsignmentModel;

public class EoConsignmentDto implements Serializable {

	private EoConsignmentModel eoConsignmentModel;
	
	private List<EoConsignmentMaterielModel> eoConsignmentMaterielModelList;

	public EoConsignmentModel getEoConsignmentModel() {
		return eoConsignmentModel;
	}

	public void setEoConsignmentModel(EoConsignmentModel eoConsignmentModel) {
		this.eoConsignmentModel = eoConsignmentModel;
	}

	public List<EoConsignmentMaterielModel> getEoConsignmentMaterielModelList() {
		return eoConsignmentMaterielModelList;
	}

	public void setEoConsignmentMaterielModelList(List<EoConsignmentMaterielModel> eoConsignmentMaterielModelList) {
		this.eoConsignmentMaterielModelList = eoConsignmentMaterielModelList;
	}
}
