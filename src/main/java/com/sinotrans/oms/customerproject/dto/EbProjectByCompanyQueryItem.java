package com.sinotrans.oms.customerproject.dto;

import java.io.Serializable;

public class EbProjectByCompanyQueryItem implements Serializable{

	private Long ebpjId;
	private String ebpjProjectName;

	public Long getEbpjId() {
		return ebpjId;
	}

	public void setEbpjId(Long ebpjId) {
		this.ebpjId = ebpjId;
	}

	public String getEbpjProjectName() {
		return ebpjProjectName;
	}

	public void setEbpjProjectName(String ebpjProjectName) {
		this.ebpjProjectName = ebpjProjectName;
	}

}
