package com.sinotrans.oms.system.dto;

import com.sinotrans.framework.orm.model.BaseModel;

public class EsProjectNameByUserIdQueryItem extends BaseModel {

	private Long ebpjId;
	private String ebpjProjectName;
	private Long esusDefaultProjectId;

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

	public Long getEsusDefaultProjectId() {
		return esusDefaultProjectId;
	}

	public void setEsusDefaultProjectId(Long esusDefaultProjectId) {
		this.esusDefaultProjectId = esusDefaultProjectId;
	}

}
