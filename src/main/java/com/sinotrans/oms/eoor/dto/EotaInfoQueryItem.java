package com.sinotrans.oms.eoor.dto;

import java.io.Serializable;

public class EotaInfoQueryItem implements Serializable {
	private Integer eotaId;
	private Integer eotaEoorId;
	private Integer eotaEtspId;
	private Integer eoorOperateEsstId;
	public Integer getEotaId() {
		return eotaId;
	}
	public void setEotaId(Integer eotaId) {
		this.eotaId = eotaId;
	}
	public Integer getEotaEoorId() {
		return eotaEoorId;
	}
	public void setEotaEoorId(Integer eotaEoorId) {
		this.eotaEoorId = eotaEoorId;
	}
	public Integer getEotaEtspId() {
		return eotaEtspId;
	}
	public void setEotaEtspId(Integer eotaEtspId) {
		this.eotaEtspId = eotaEtspId;
	}
	public Integer getEoorOperateEsstId() {
		return eoorOperateEsstId;
	}
	public void setEoorOperateEsstId(Integer eoorOperateEsstId) {
		this.eoorOperateEsstId = eoorOperateEsstId;
	}
	
	

}
