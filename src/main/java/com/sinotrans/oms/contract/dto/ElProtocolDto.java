package com.sinotrans.oms.contract.dto;

import java.util.List;

import com.sinotrans.oms.contract.model.ElProtocolCostConModel;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;
import com.sinotrans.oms.contract.model.ElProtocolCostModel;
import com.sinotrans.oms.contract.model.ElProtocolModel;

public class ElProtocolDto {
	
	private ElProtocolModel elProtocolModel;//协议
	
	private List<ElProtocolCostModel> elProtocolCostModelList;//协议明细表
	
	private List<ElProtocolCostFeelModel> elProtocolCostFeelModelList;//协议条件分类表
	
	private List<ElProtocolCostConModel> ElProtocolCostConModelList;//协议费用计算表

	public ElProtocolModel getElProtocolModel() {
		return elProtocolModel;
	}

	public void setElProtocolModel(ElProtocolModel elProtocolModel) {
		this.elProtocolModel = elProtocolModel;
	}

	public List<ElProtocolCostModel> getElProtocolCostModelList() {
		return elProtocolCostModelList;
	}

	public void setElProtocolCostModelList(List<ElProtocolCostModel> elProtocolCostModelList) {
		this.elProtocolCostModelList = elProtocolCostModelList;
	}

	public List<ElProtocolCostFeelModel> getElProtocolCostFeelModelList() {
		return elProtocolCostFeelModelList;
	}

	public void setElProtocolCostFeelModelList(List<ElProtocolCostFeelModel> elProtocolCostFeelModelList) {
		this.elProtocolCostFeelModelList = elProtocolCostFeelModelList;
	}

	public List<ElProtocolCostConModel> getElProtocolCostConModelList() {
		return ElProtocolCostConModelList;
	}

	public void setElProtocolCostConModelList(List<ElProtocolCostConModel> elProtocolCostConModelList) {
		ElProtocolCostConModelList = elProtocolCostConModelList;
	}
	
	
	
	

}
