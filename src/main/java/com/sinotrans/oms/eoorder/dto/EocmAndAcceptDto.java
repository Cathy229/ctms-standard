package com.sinotrans.oms.eoorder.dto;

import com.sinotrans.oms.eoorder.model.EoConsignmentMaterielModel;

public class EocmAndAcceptDto extends EoConsignmentMaterielModel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String acceptQuantity;
	private String acceptGrossWeight;
	private String acceptNetWeight;
	private String acceptVolume;
	public String getAcceptQuantity() {
		return acceptQuantity;
	}
	public void setAcceptQuantity(String acceptQuantity) {
		this.acceptQuantity = acceptQuantity;
	}
	public String getAcceptGrossWeight() {
		return acceptGrossWeight;
	}
	public void setAcceptGrossWeight(String acceptGrossWeight) {
		this.acceptGrossWeight = acceptGrossWeight;
	}
	public String getAcceptNetWeight() {
		return acceptNetWeight;
	}
	public void setAcceptNetWeight(String acceptNetWeight) {
		this.acceptNetWeight = acceptNetWeight;
	}
	public String getAcceptVolume() {
		return acceptVolume;
	}
	public void setAcceptVolume(String acceptVolume) {
		this.acceptVolume = acceptVolume;
	}
	
}
