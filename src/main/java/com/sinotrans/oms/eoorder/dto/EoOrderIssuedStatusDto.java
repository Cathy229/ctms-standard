package com.sinotrans.oms.eoorder.dto;

public class EoOrderIssuedStatusDto {
	private String eoorId;
	private String eoorStatus;//	--订单状态
	
	private String eoorEorbStatus;// --订单订舱状态 
	
	private String eoorEoddUnissued;// --订单报关状态  
	private String eoorEoddIssued;// --订单报关状态  
	private String eoorEoddSuccess;// --订单报关状态  
	
	private String eoorEoetUnissued;// --订单拖车状态  
	private String eoorEoetIssued;// --订单拖车状态  
	private String eoorEoetSuccess;// --订单拖车状态
	
	private String eoorFeeStatus;// --订单费用状态
	public String getEoorId() {
		return eoorId;
	}
	public void setEoorId(String eoorId) {
		this.eoorId = eoorId;
	}
	public String getEoorEoddUnissued() {
		return eoorEoddUnissued;
	}
	public void setEoorEoddUnissued(String eoorEoddUnissued) {
		this.eoorEoddUnissued = eoorEoddUnissued;
	}
	public String getEoorEoddIssued() {
		return eoorEoddIssued;
	}
	public void setEoorEoddIssued(String eoorEoddIssued) {
		this.eoorEoddIssued = eoorEoddIssued;
	}
	public String getEoorEoddSuccess() {
		return eoorEoddSuccess;
	}
	public void setEoorEoddSuccess(String eoorEoddSuccess) {
		this.eoorEoddSuccess = eoorEoddSuccess;
	}
	public String getEoorStatus() {
		return eoorStatus;
	}
	public void setEoorStatus(String eoorStatus) {
		this.eoorStatus = eoorStatus;
	}
	public String getEoorEorbStatus() {
		return eoorEorbStatus;
	}
	public void setEoorEorbStatus(String eoorEorbStatus) {
		this.eoorEorbStatus = eoorEorbStatus;
	}
	public String getEoorEoetUnissued() {
		return eoorEoetUnissued;
	}
	public void setEoorEoetUnissued(String eoorEoetUnissued) {
		this.eoorEoetUnissued = eoorEoetUnissued;
	}
	public String getEoorEoetIssued() {
		return eoorEoetIssued;
	}
	public void setEoorEoetIssued(String eoorEoetIssued) {
		this.eoorEoetIssued = eoorEoetIssued;
	}
	public String getEoorEoetSuccess() {
		return eoorEoetSuccess;
	}
	public void setEoorEoetSuccess(String eoorEoetSuccess) {
		this.eoorEoetSuccess = eoorEoetSuccess;
	}
	public String getEoorFeeStatus() {
		return eoorFeeStatus;
	}
	public void setEoorFeeStatus(String eoorFeeStatus) {
		this.eoorFeeStatus = eoorFeeStatus;
	}
	
}
