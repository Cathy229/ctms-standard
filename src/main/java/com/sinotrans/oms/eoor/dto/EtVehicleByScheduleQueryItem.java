package com.sinotrans.oms.eoor.dto;

import java.io.Serializable;

public class EtVehicleByScheduleQueryItem implements Serializable {
	private Integer eotaId;
	private String etspTractorEtveCard;

	public Integer getEotaId() {
		return eotaId;
	}

	public void setEotaId(Integer eotaId) {
		this.eotaId = eotaId;
	}

	public String getEtspTractorEtveCard() {
		return etspTractorEtveCard;
	}

	public void setEtspTractorEtveCard(String etspTractorEtveCard) {
		this.etspTractorEtveCard = etspTractorEtveCard;
	}
	
}
