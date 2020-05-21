package com.sinotrans.oms.eoorder.dto;

import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoRequestSeaborneModel;
import com.sinotrans.oms.customerproject.model.EbProjectModel;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.eoorder.model.EoOrderMaterielModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.eoorder.model.EoOrderPrecontainerModel;
import com.sinotrans.oms.fees.model.EfBmsImModel;

public class EoOrderFreightDto {

	private EoOrderModel eoOrderModel;

	private EoRequestSeaborneModel eoRequestSeaborneModel; 
	
	private EoOrderMaterielModel eoomModel;

	private List<EoOrderPrecontainerModel> eosrList;
	private List<EoOrderPrecontainerModel> eosrLists;
	
	private EbProjectModel ebProjectModel;
	
	private EoOrderExpandAgencyModel eoeaModel;
	
	private String eoetstatus;
	
	private String eoddstatus;
	
	private Long eorbStatues;
	
	private String ischeck;
	
	private Double eoomCount;//海运物料数量
	
	private Long eoraId;
	
	private String ebppPlanName;
	
//	private Long ebppBbdType;
	
	private String eoorBmsAEbcuCustomerName;
	private EfBmsImModel efbmModel;
	
	public Boolean isEoOrderFeesValue;//是否复制费用
	public Boolean isEoOrderTaskValue;//是否复制任务
	public Long eoorIdOld;//订单复制中需要的原订单id主键
	
//	public Long getEbppBbdType() {
//		return ebppBbdType;
//	}
//
//	public void setEbppBbdType(Long ebppBbdType) {
//		this.ebppBbdType = ebppBbdType;
//	}
	
	public String getEbppPlanName() {
		return ebppPlanName;
	}

	public void setEbppPlanName(String ebppPlanName) {
		this.ebppPlanName = ebppPlanName;
	}

	public Long getEoraId() {
		return eoraId;
	}

	public void setEoraId(Long eoraId) {
		this.eoraId = eoraId;
	}

	public Double getEoomCount() {
		return eoomCount;
	}

	public void setEoomCount(Double eoomCount) {
		this.eoomCount = eoomCount;
	}

	public String getEoetstatus() {
		return eoetstatus;
	}

	public void setEoetstatus(String eoetstatus) {
		this.eoetstatus = eoetstatus;
	}

	public String getEoddstatus() {
		return eoddstatus;
	}

	public void setEoddstatus(String eoddstatus) {
		this.eoddstatus = eoddstatus;
	}

	public String getIscheck() {
		return ischeck;
	}

	public void setIscheck(String ischeck) {
		this.ischeck = ischeck;
	}

	public EoOrderExpandAgencyModel getEoeaModel() {
		return eoeaModel;
	}

	public void setEoeaModel(EoOrderExpandAgencyModel eoeaModel) {
		this.eoeaModel = eoeaModel;
	}

	public EoOrderModel getEoOrderModel() {
		return eoOrderModel;
	}

	public void setEoOrderModel(EoOrderModel eoOrderModel) {
		this.eoOrderModel = eoOrderModel;
	}

	public List<EoOrderPrecontainerModel> getEosrList() {
		return eosrList;
	}

	public void setEosrList(List<EoOrderPrecontainerModel> eosrList) {
		this.eosrList = eosrList;
	}

	public EbProjectModel getEbProjectModel() {
		return ebProjectModel;
	}

	public void setEbProjectModel(EbProjectModel ebProjectModel) {
		this.ebProjectModel = ebProjectModel;
	}

	public EoRequestSeaborneModel getEoRequestSeaborneModel() {
		return eoRequestSeaborneModel;
	}

	public void setEoRequestSeaborneModel(
			EoRequestSeaborneModel eoRequestSeaborneModel) {
		this.eoRequestSeaborneModel = eoRequestSeaborneModel;
	}

	public EoOrderMaterielModel getEoomModel() {
		return eoomModel;
	}

	public void setEoomModel(EoOrderMaterielModel eoomModel) {
		this.eoomModel = eoomModel;
	}

	public Long getEorbStatues() {
		return eorbStatues;
	}

	public void setEorbStatues(Long eorbStatues) {
		this.eorbStatues = eorbStatues;
	}

	public List<EoOrderPrecontainerModel> getEosrLists() {
		return eosrLists;
	}

	public void setEosrLists(List<EoOrderPrecontainerModel> eosrLists) {
		this.eosrLists = eosrLists;
	}

	public String getEoorBmsAEbcuCustomerName() {
		return eoorBmsAEbcuCustomerName;
	}

	public void setEoorBmsAEbcuCustomerName(String eoorBmsAEbcuCustomerName) {
		this.eoorBmsAEbcuCustomerName = eoorBmsAEbcuCustomerName;
	}

	public EfBmsImModel getEfbmModel() {
		return efbmModel;
	}

	public void setEfbmModel(EfBmsImModel efbmModel) {
		this.efbmModel = efbmModel;
	}

	public Boolean getIsEoOrderFeesValue() {
		return isEoOrderFeesValue;
	}

	public void setIsEoOrderFeesValue(Boolean isEoOrderFeesValue) {
		this.isEoOrderFeesValue = isEoOrderFeesValue;
	}

	public Boolean getIsEoOrderTaskValue() {
		return isEoOrderTaskValue;
	}

	public void setIsEoOrderTaskValue(Boolean isEoOrderTaskValue) {
		this.isEoOrderTaskValue = isEoOrderTaskValue;
	}

	public Long getEoorIdOld() {
		return eoorIdOld;
	}

	public void setEoorIdOld(Long eoorIdOld) {
		this.eoorIdOld = eoorIdOld;
	}

	
}
