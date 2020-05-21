package com.sinotrans.oms.eoor.dto;

public class IotData {
	
	private String estimatedTime;
	private String plateNo;
	private String deviceCode;
	private String distanceMileage;
	private String status;
	public String getEstimatedTime() {
		return estimatedTime;
	}
	public void setEstimatedTime(String estimatedTime) {
		this.estimatedTime = estimatedTime;
	}
	public String getPlateNo() {
		return plateNo;
	}
	public void setPlateNo(String plateNo) {
		this.plateNo = plateNo;
	}
	public String getDeviceCode() {
		return deviceCode;
	}
	public void setDeviceCode(String deviceCode) {
		this.deviceCode = deviceCode;
	}
	public String getDistanceMileage() {
		return distanceMileage;
	}
	public void setDistanceMileage(String distanceMileage) {
		this.distanceMileage = distanceMileage;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

}
