package com.sinotrans.oms.eoorder.dto;

import java.util.List;

import com.sinotrans.oms.eoorder.model.EoConsignmentMaterielModel;
import com.sinotrans.oms.eoorder.model.EoConsignmentModel;

public class EoConsignmentQueryDto {

	private EoConsignmentModel formModel;
	
	private List<EoConsignmentMaterielModel> gridList;
	
	public EoConsignmentModel getFormModel() {
		return formModel;
	}
	public void setFormModel(EoConsignmentModel formModel) {
		this.formModel = formModel;
	}
	public List<EoConsignmentMaterielModel> getGridList() {
		return gridList;
	}
	public void setGridList(List<EoConsignmentMaterielModel> gridList) {
		this.gridList = gridList;
	}
}
