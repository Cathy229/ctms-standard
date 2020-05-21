package com.sinotrans.oms.eoor.dto;


import java.util.Date;


public class EtSchedduleModelDto {
	private Integer ettaId;
	private String etspName;
	private String isIntelligent;
	private Date etspDefaultOutStopTime;
	public Integer getEttaId() {
		return ettaId;
	}
	public void setEttaId(Integer ettaId) {
		this.ettaId = ettaId;
	}
	public String getEtspName() {
		return etspName;
	}
	public void setEtspName(String etspName) {
		this.etspName = etspName;
	}
	
	public String getIsIntelligent() {
		return isIntelligent;
	}
	public void setIsIntelligent(String isIntelligent) {
		this.isIntelligent = isIntelligent;
	}
	public Date getEtspDefaultOutStopTime() {
		return etspDefaultOutStopTime;
	}
	public void setEtspDefaultOutStopTime(Date etspDefaultOutStopTime) {
		this.etspDefaultOutStopTime = etspDefaultOutStopTime;
	}

}