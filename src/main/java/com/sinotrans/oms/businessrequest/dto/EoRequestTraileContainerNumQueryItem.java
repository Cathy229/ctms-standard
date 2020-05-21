package com.sinotrans.oms.businessrequest.dto;

import java.io.Serializable;

import javax.persistence.Column;

public class EoRequestTraileContainerNumQueryItem implements Serializable {

	private Long ct;
	private Long issued;

	public Long getCt() {
		return ct;
	}

	public void setCt(Long ct) {
		this.ct = ct;
	}

	public Long getIssued() {
		return issued;
	}

	public void setIssued(Long issued) {
		this.issued = issued;
	}

}
