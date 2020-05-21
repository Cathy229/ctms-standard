package com.sinotrans.oms.common.dto;

import java.util.Collection;

public class RequestBodyDto {
	private Long eoorId;
	private Long[] eoorIds;
	private String efbfType;
	private Long[] efbfIds;
	private Collection<Long> efbfId;
	private String eoorStatus;
	private String businessType;

	//业务请求下发状态池服务参数
	private Long [] brids;
	private String type;
	private Long ebtkId;



	public Long[] getBrids() {
		return brids;
	}

	public void setBrids(Long[] brids) {
		this.brids = brids;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Long getEbtkId() {
		return ebtkId;
	}

	public void setEbtkId(Long ebtkId) {
		this.ebtkId = ebtkId;
	}

	public String getEoorStatus() {
		return eoorStatus;
	}

	public void setEoorStatus(String eoorStatus) {
		this.eoorStatus = eoorStatus;
	}

	public Long[] getEoorIds() {
		return eoorIds;
	}

	public void setEoorIds(Long[] eoorIds) {
		this.eoorIds = eoorIds;
	}

	public Collection<Long> getEfbfId() {
		return efbfId;
	}

	public void setEfbfId(Collection<Long> efbfId) {
		this.efbfId = efbfId;
	}

	public Long getEoorId() {
		return eoorId;
	}

	public Long[] getEfbfIds() {
		return efbfIds;
	}

	public void setEfbfIds(Long[] efbfIds) {
		this.efbfIds = efbfIds;
	}

	public void setEoorId(Long eoorId) {
		this.eoorId = eoorId;
	}

	public String getEfbfType() {
		return efbfType;
	}

	public void setEfbfType(String efbfType) {
		this.efbfType = efbfType;
	}
	
	public String getBusinessType() {
		return businessType;
	}

	public void setBusinessType(String businessType) {
		this.businessType = businessType;
	}
}
