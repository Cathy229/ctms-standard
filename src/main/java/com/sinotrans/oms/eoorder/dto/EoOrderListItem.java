package com.sinotrans.oms.eoorder.dto;

import java.io.Serializable;

public class EoOrderListItem implements Serializable{
	
	private String eoorId;
	private String eoorSinoNo;
	private String eoorOrderNo;
	private Long eoorCustomEbcuId;
	private Long eoeaLoadPortId;
	private Long eoeaDischargePortId;
	private Long eoorConsignorEbcuId;
	private String eoeaReceiptPlaceName;
	private String eoeaDeliveryPlace;
	private String creator;
	private Long eoorEsdeId;
	private String eoorBmsEbsmCode;
	private String eoorStatus;
	private String viewType;//页面类型   1:待确认订单列表  2：待执行订单列表
	
	public String getEoorId() {
		return eoorId;
	}
	public void setEoorId(String eoorId) {
		this.eoorId = eoorId;
	}
	public String getViewType() {
		return viewType;
	}
	public void setViewType(String viewType) {
		this.viewType = viewType;
	}
	public String getEoorSinoNo() {
		return eoorSinoNo;
	}
	public void setEoorSinoNo(String eoorSinoNo) {
		this.eoorSinoNo = eoorSinoNo;
	}
	public String getEoorOrderNo() {
		return eoorOrderNo;
	}
	public void setEoorOrderNo(String eoorOrderNo) {
		this.eoorOrderNo = eoorOrderNo;
	}
	public Long getEoorCustomEbcuId() {
		return eoorCustomEbcuId;
	}
	public void setEoorCustomEbcuId(Long eoorCustomEbcuId) {
		this.eoorCustomEbcuId = eoorCustomEbcuId;
	}
	public Long getEoeaLoadPortId() {
		return eoeaLoadPortId;
	}
	public void setEoeaLoadPortId(Long eoeaLoadPortId) {
		this.eoeaLoadPortId = eoeaLoadPortId;
	}
	public Long getEoeaDischargePortId() {
		return eoeaDischargePortId;
	}
	public void setEoeaDischargePortId(Long eoeaDischargePortId) {
		this.eoeaDischargePortId = eoeaDischargePortId;
	}
	public Long getEoorConsignorEbcuId() {
		return eoorConsignorEbcuId;
	}
	public void setEoorConsignorEbcuId(Long eoorConsignorEbcuId) {
		this.eoorConsignorEbcuId = eoorConsignorEbcuId;
	}
	public String getEoeaReceiptPlaceName() {
		return eoeaReceiptPlaceName;
	}
	public void setEoeaReceiptPlaceName(String eoeaReceiptPlaceName) {
		this.eoeaReceiptPlaceName = eoeaReceiptPlaceName;
	}
	public String getEoeaDeliveryPlace() {
		return eoeaDeliveryPlace;
	}
	public void setEoeaDeliveryPlace(String eoeaDeliveryPlace) {
		this.eoeaDeliveryPlace = eoeaDeliveryPlace;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Long getEoorEsdeId() {
		return eoorEsdeId;
	}
	public void setEoorEsdeId(Long eoorEsdeId) {
		this.eoorEsdeId = eoorEsdeId;
	}
	public String getEoorBmsEbsmCode() {
		return eoorBmsEbsmCode;
	}
	public void setEoorBmsEbsmCode(String eoorBmsEbsmCode) {
		this.eoorBmsEbsmCode = eoorBmsEbsmCode;
	}
	public String getEoorStatus() {
		return eoorStatus;
	}
	public void setEoorStatus(String eoorStatus) {
		this.eoorStatus = eoorStatus;
	}

}
