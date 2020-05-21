package com.sinotrans.oms.eoor.dto;

import java.io.Serializable;
import java.util.Date;

public class EoorNoScheduleQueryItem implements Serializable {
	
	private Integer eoorId;
	private Integer eotaId;
	private String eoorEbpjName;
	private String eoorSoNo;
	private String eoorDoNo;
	private Date createTime;
	private Date eoorReqDeliveryDate;
	private Date eoorReqArrivalDate;
	private Double eoorWeight;
	private String eoorStartEbrgNameCn;
	private String eoorEndEbrgNameCn;
	private Integer eoorCustomEbcuId;
	private String eoorCustomEbcuNameCn;
	private String eoorLevel;
	private String eoorShipperEbsaAddress;
	private String eoorConsigneeEbsaAddress;
	private String eoorScheduleName;
	private String eoorRemark;
	private String eoorTransReq;
	private String eoorConsigneeReq;
	private String eotaEblnLineName;
	private String eoomType;
	public Integer getEoorId() {
		return eoorId;
	}
	public void setEoorId(Integer eoorId) {
		this.eoorId = eoorId;
	}
	public Integer getEotaId() {
		return eotaId;
	}
	public void setEotaId(Integer eotaId) {
		this.eotaId = eotaId;
	}
	public String getEoorEbpjName() {
		return eoorEbpjName;
	}
	public void setEoorEbpjName(String eoorEbpjName) {
		this.eoorEbpjName = eoorEbpjName;
	}
	public String getEoorSoNo() {
		return eoorSoNo;
	}
	public void setEoorSoNo(String eoorSoNo) {
		this.eoorSoNo = eoorSoNo;
	}
	public String getEoorDoNo() {
		return eoorDoNo;
	}
	public void setEoorDoNo(String eoorDoNo) {
		this.eoorDoNo = eoorDoNo;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getEoorReqDeliveryDate() {
		return eoorReqDeliveryDate;
	}
	public void setEoorReqDeliveryDate(Date eoorReqDeliveryDate) {
		this.eoorReqDeliveryDate = eoorReqDeliveryDate;
	}
	public Date getEoorReqArrivalDate() {
		return eoorReqArrivalDate;
	}
	public void setEoorReqArrivalDate(Date eoorReqArrivalDate) {
		this.eoorReqArrivalDate = eoorReqArrivalDate;
	}
	public Double getEoorWeight() {
		return eoorWeight;
	}
	public void setEoorWeight(Double eoorWeight) {
		this.eoorWeight = eoorWeight;
	}
	public String getEoorStartEbrgNameCn() {
		return eoorStartEbrgNameCn;
	}
	public void setEoorStartEbrgNameCn(String eoorStartEbrgNameCn) {
		this.eoorStartEbrgNameCn = eoorStartEbrgNameCn;
	}
	public String getEoorEndEbrgNameCn() {
		return eoorEndEbrgNameCn;
	}
	public void setEoorEndEbrgNameCn(String eoorEndEbrgNameCn) {
		this.eoorEndEbrgNameCn = eoorEndEbrgNameCn;
	}
	public Integer getEoorCustomEbcuId() {
		return eoorCustomEbcuId;
	}
	public void setEoorCustomEbcuId(Integer eoorCustomEbcuId) {
		this.eoorCustomEbcuId = eoorCustomEbcuId;
	}
	public String getEoorCustomEbcuNameCn() {
		return eoorCustomEbcuNameCn;
	}
	public void setEoorCustomEbcuNameCn(String eoorCustomEbcuNameCn) {
		this.eoorCustomEbcuNameCn = eoorCustomEbcuNameCn;
	}
	public String getEoorLevel() {
		return eoorLevel;
	}
	public void setEoorLevel(String eoorLevel) {
		this.eoorLevel = eoorLevel;
	}
	public String getEoorShipperEbsaAddress() {
		return eoorShipperEbsaAddress;
	}
	public void setEoorShipperEbsaAddress(String eoorShipperEbsaAddress) {
		this.eoorShipperEbsaAddress = eoorShipperEbsaAddress;
	}
	public String getEoorConsigneeEbsaAddress() {
		return eoorConsigneeEbsaAddress;
	}
	public void setEoorConsigneeEbsaAddress(String eoorConsigneeEbsaAddress) {
		this.eoorConsigneeEbsaAddress = eoorConsigneeEbsaAddress;
	}
	public String getEoorScheduleName() {
		return eoorScheduleName;
	}
	public void setEoorScheduleName(String eoorScheduleName) {
		this.eoorScheduleName = eoorScheduleName;
	}
	public String getEoorRemark() {
		return eoorRemark;
	}
	public void setEoorRemark(String eoorRemark) {
		this.eoorRemark = eoorRemark;
	}
	public String getEoorTransReq() {
		return eoorTransReq;
	}
	public void setEoorTransReq(String eoorTransReq) {
		this.eoorTransReq = eoorTransReq;
	}
	public String getEoorConsigneeReq() {
		return eoorConsigneeReq;
	}
	public void setEoorConsigneeReq(String eoorConsigneeReq) {
		this.eoorConsigneeReq = eoorConsigneeReq;
	}
	public String getEotaEblnLineName() {
		return eotaEblnLineName;
	}
	public void setEotaEblnLineName(String eotaEblnLineName) {
		this.eotaEblnLineName = eotaEblnLineName;
	}
	public String getEoomType() {
		return eoomType;
	}
	public void setEoomType(String eoomType) {
		this.eoomType = eoomType;
	}
	
	
}
