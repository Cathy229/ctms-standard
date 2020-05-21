package com.sinotrans.oms.eoor.dto;

import java.io.Serializable;

public class GetCityNameQueryItem implements Serializable {
	private String ebplNameCn;
	private String ebrgNameCn;

	public String getEbplNameCn() {
		return ebplNameCn;
	}

	public void setEbplNameCn(String ebplNameCn) {
		this.ebplNameCn = ebplNameCn;
	}

	public String getEbrgNameCn() {
		return ebrgNameCn;
	}

	public void setEbrgNameCn(String ebrgNameCn) {
		this.ebrgNameCn = ebrgNameCn;
	}

	
}
