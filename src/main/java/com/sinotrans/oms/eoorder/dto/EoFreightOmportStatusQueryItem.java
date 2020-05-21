package com.sinotrans.oms.eoorder.dto;

import java.io.Serializable;
import java.util.Date;

public class EoFreightOmportStatusQueryItem implements Serializable {

	private Long eoeaId;
	private Long eoorId;
	private Long eoraId;
	private Long eoorRecVer;
	private String eoorOrderFudeji;
	private String eoorContractNo;
	private String eoorLevel;
	private String eoorOrderBarcode;
	private Long eoorConsignorEbcuId;
	private String eoorConsignorEbcuCode;
	private String eoorConsignorEbcuName;
	private Long eoorCustomEbcuId;
	private String eoorCustomEbcuCode;
	private String eoorCustomEbcuName;
	private Long eoorSupplierEbcuId;
	private String eoorSupplierEbcuCode;
	private String eoorSupplierEbcuName;
	private Long eoorEbbuId;
	private String eoorEbbuBuName;
	private Long eoorEbpeId;
	private String eoorEbccName;
	private Date eoorOrderDate;
	private Long eoorStartEbrgId;
	private String eoorStartEbrgNameCn;
	private Long eoorEndEbrgId;
	private String eoorEndEbrgNameCn;
	private String eoorDoubleOrder;
	private Long eoorEsdeId;
	private String eoorEsdeName;
	private Long eoorSaleEsstId;
	private String eoorSaleEsstName;
	private Long eoorOperateEsstId;
	private String eoorOperateEsstName;
	private String eoorSpecialOrder;
	private String eoorTranType;
	private Date eoorOutDate;
	private String eoorStatus;
	private Double eoorWeight;
	private Double eoorVolume;
	private Double eoorQuantity;
	private String eoorQuantityUnit;
	private Double eoorNetWeight;
	private Date eoorReqDeliveryDate;
	private Date eoorReqArrivalDate;
	private String eoorDeliveryPeriod;
	private String eoorArrivalPeriod;
	private Long eoorShipperEbspId;
	private String eoorShipperEbspNameCn;
	private String eoorShipperEbsaPost;
	private String eoorShipperEbsaContact;
	private String eoorShipperEbsaTel;
	private Long eoorShipperEbsaId;
	private String eoorShipperEbsaAddress;
	private Long eoorShipperEbrgId;
	private String eoorShipperEbrgNameCn;
	private Long eoorShipperEbplId;
	private String eoorShipperEbplNameCn;
	private Long eoorConsigneeEbspId;
	private String eoorConsigneeEbspNameCn;
	private String eoorConsigneeEbsaPost;
	private String eoorConsigneeEbsaContact;
	private String eoorConsigneeEbsaTel;
	private Long eoorConsigneeEbsaId;
	private String eoorConsigneeEbsaAddress;
	private Long eoorConsigneeEbrgId;
	private String eoorConsigneeEbrgNameCn;
	private Long eoorConsigneeEbplId;
	private String eoorConsigneeEbplNameCn;
	private String eoorTransReq;
	private String eoorConsigneeReq;
	private String eoorDocReq;
	private String eoorRemark;
	private String eoorVoidDesc;
	private String eoorVoider;
	private Date eoorVoiderTime;
	private Long eoorScheduleId;
	private String eoorScheduleName;
	private Long eoorRalationId;
	private String eoorRalationSoNo;
	private String eoorTheirPlate;
	private Double eoorTotalIncome;
	private String eoorDataSource;
	private String eoorMessageName;
	private String eoorOriSingleNo;
	private String eoorCreatorName;
	private String eoorCreatorEmail;
	private String eoorCreatorTel;
	private String eoorType;
	private String eoorPrevStatus;
	private String eoorPrevPlanStatus;
	private String eoorConsigneeEbrgNo;
	private String eoorShipperEbrgNo;
	private String eoorShipperEbsaFax;
	private String eoorShipperEbsaEmail;
	private String eoorConsigneeEbsaFax;
	private String eoorConsigneeEbsaEmail;
	private String eoorFCode;
	private String eoorBmsEbbtCode;
	private String eoorBmsEbotCode;
	private String eoorBmsEsdeDepartmentCode;
	private String eoorBmsEbsmCode;
	private String eoorBmsBusinessClass;
	private String eoorBmsAEbcuCustomerNo;
	private String eoorBmsSEbcuCustomerNo;
	private String eoorBmsCargoType;
	private String eoorCommerceType;
	private String eoorBmsMonitorType;
	private String eoorBmsCountType;
	private String eoorEbbuCode;
	private Double eoorAmtReceivable;
	private Double eoorAmtPayable;
	private String eoorChargeoff;
	private String eoorPaymentMode;
	private Long eoorReceiptReturntype;
	private Long eoorContainerCount;
	private Long eoorCargoSource;
	private Long eoorLoEbppId;
	private Long eoorEbpjId;
	private Double eoomCount;
	private String eoetstatus;
	private String eoddstatus;
	private String ischeck;
	public Long getEoeaId() {
		return eoeaId;
	}
	public void setEoeaId(Long eoeaId) {
		this.eoeaId = eoeaId;
	}
	public Long getEoorId() {
		return eoorId;
	}
	public void setEoorId(Long eoorId) {
		this.eoorId = eoorId;
	}
	public Long getEoraId() {
		return eoraId;
	}
	public void setEoraId(Long eoraId) {
		this.eoraId = eoraId;
	}
	public Long getEoorRecVer() {
		return eoorRecVer;
	}
	public void setEoorRecVer(Long eoorRecVer) {
		this.eoorRecVer = eoorRecVer;
	}
	public String getEoorOrderFudeji() {
		return eoorOrderFudeji;
	}
	public void setEoorOrderFudeji(String eoorOrderFudeji) {
		this.eoorOrderFudeji = eoorOrderFudeji;
	}
	public String getEoorContractNo() {
		return eoorContractNo;
	}
	public void setEoorContractNo(String eoorContractNo) {
		this.eoorContractNo = eoorContractNo;
	}
	public String getEoorLevel() {
		return eoorLevel;
	}
	public void setEoorLevel(String eoorLevel) {
		this.eoorLevel = eoorLevel;
	}
	public String getEoorOrderBarcode() {
		return eoorOrderBarcode;
	}
	public void setEoorOrderBarcode(String eoorOrderBarcode) {
		this.eoorOrderBarcode = eoorOrderBarcode;
	}
	public Long getEoorConsignorEbcuId() {
		return eoorConsignorEbcuId;
	}
	public void setEoorConsignorEbcuId(Long eoorConsignorEbcuId) {
		this.eoorConsignorEbcuId = eoorConsignorEbcuId;
	}
	public String getEoorConsignorEbcuCode() {
		return eoorConsignorEbcuCode;
	}
	public void setEoorConsignorEbcuCode(String eoorConsignorEbcuCode) {
		this.eoorConsignorEbcuCode = eoorConsignorEbcuCode;
	}
	public String getEoorConsignorEbcuName() {
		return eoorConsignorEbcuName;
	}
	public void setEoorConsignorEbcuName(String eoorConsignorEbcuName) {
		this.eoorConsignorEbcuName = eoorConsignorEbcuName;
	}
	public Long getEoorCustomEbcuId() {
		return eoorCustomEbcuId;
	}
	public void setEoorCustomEbcuId(Long eoorCustomEbcuId) {
		this.eoorCustomEbcuId = eoorCustomEbcuId;
	}
	public String getEoorCustomEbcuCode() {
		return eoorCustomEbcuCode;
	}
	public void setEoorCustomEbcuCode(String eoorCustomEbcuCode) {
		this.eoorCustomEbcuCode = eoorCustomEbcuCode;
	}
	public String getEoorCustomEbcuName() {
		return eoorCustomEbcuName;
	}
	public void setEoorCustomEbcuName(String eoorCustomEbcuName) {
		this.eoorCustomEbcuName = eoorCustomEbcuName;
	}
	public Long getEoorSupplierEbcuId() {
		return eoorSupplierEbcuId;
	}
	public void setEoorSupplierEbcuId(Long eoorSupplierEbcuId) {
		this.eoorSupplierEbcuId = eoorSupplierEbcuId;
	}
	public String getEoorSupplierEbcuCode() {
		return eoorSupplierEbcuCode;
	}
	public void setEoorSupplierEbcuCode(String eoorSupplierEbcuCode) {
		this.eoorSupplierEbcuCode = eoorSupplierEbcuCode;
	}
	public String getEoorSupplierEbcuName() {
		return eoorSupplierEbcuName;
	}
	public void setEoorSupplierEbcuName(String eoorSupplierEbcuName) {
		this.eoorSupplierEbcuName = eoorSupplierEbcuName;
	}
	public Long getEoorEbbuId() {
		return eoorEbbuId;
	}
	public void setEoorEbbuId(Long eoorEbbuId) {
		this.eoorEbbuId = eoorEbbuId;
	}
	public String getEoorEbbuBuName() {
		return eoorEbbuBuName;
	}
	public void setEoorEbbuBuName(String eoorEbbuBuName) {
		this.eoorEbbuBuName = eoorEbbuBuName;
	}
	public Long getEoorEbpeId() {
		return eoorEbpeId;
	}
	public void setEoorEbpeId(Long eoorEbpeId) {
		this.eoorEbpeId = eoorEbpeId;
	}
	public String getEoorEbccName() {
		return eoorEbccName;
	}
	public void setEoorEbccName(String eoorEbccName) {
		this.eoorEbccName = eoorEbccName;
	}
	public Date getEoorOrderDate() {
		return eoorOrderDate;
	}
	public void setEoorOrderDate(Date eoorOrderDate) {
		this.eoorOrderDate = eoorOrderDate;
	}
	public Long getEoorStartEbrgId() {
		return eoorStartEbrgId;
	}
	public void setEoorStartEbrgId(Long eoorStartEbrgId) {
		this.eoorStartEbrgId = eoorStartEbrgId;
	}
	public String getEoorStartEbrgNameCn() {
		return eoorStartEbrgNameCn;
	}
	public void setEoorStartEbrgNameCn(String eoorStartEbrgNameCn) {
		this.eoorStartEbrgNameCn = eoorStartEbrgNameCn;
	}
	public Long getEoorEndEbrgId() {
		return eoorEndEbrgId;
	}
	public void setEoorEndEbrgId(Long eoorEndEbrgId) {
		this.eoorEndEbrgId = eoorEndEbrgId;
	}
	public String getEoorEndEbrgNameCn() {
		return eoorEndEbrgNameCn;
	}
	public void setEoorEndEbrgNameCn(String eoorEndEbrgNameCn) {
		this.eoorEndEbrgNameCn = eoorEndEbrgNameCn;
	}
	public String getEoorDoubleOrder() {
		return eoorDoubleOrder;
	}
	public void setEoorDoubleOrder(String eoorDoubleOrder) {
		this.eoorDoubleOrder = eoorDoubleOrder;
	}
	public Long getEoorEsdeId() {
		return eoorEsdeId;
	}
	public void setEoorEsdeId(Long eoorEsdeId) {
		this.eoorEsdeId = eoorEsdeId;
	}
	public String getEoorEsdeName() {
		return eoorEsdeName;
	}
	public void setEoorEsdeName(String eoorEsdeName) {
		this.eoorEsdeName = eoorEsdeName;
	}
	public Long getEoorSaleEsstId() {
		return eoorSaleEsstId;
	}
	public void setEoorSaleEsstId(Long eoorSaleEsstId) {
		this.eoorSaleEsstId = eoorSaleEsstId;
	}
	public String getEoorSaleEsstName() {
		return eoorSaleEsstName;
	}
	public void setEoorSaleEsstName(String eoorSaleEsstName) {
		this.eoorSaleEsstName = eoorSaleEsstName;
	}
	public Long getEoorOperateEsstId() {
		return eoorOperateEsstId;
	}
	public void setEoorOperateEsstId(Long eoorOperateEsstId) {
		this.eoorOperateEsstId = eoorOperateEsstId;
	}
	public String getEoorOperateEsstName() {
		return eoorOperateEsstName;
	}
	public void setEoorOperateEsstName(String eoorOperateEsstName) {
		this.eoorOperateEsstName = eoorOperateEsstName;
	}
	public String getEoorSpecialOrder() {
		return eoorSpecialOrder;
	}
	public void setEoorSpecialOrder(String eoorSpecialOrder) {
		this.eoorSpecialOrder = eoorSpecialOrder;
	}
	public String getEoorTranType() {
		return eoorTranType;
	}
	public void setEoorTranType(String eoorTranType) {
		this.eoorTranType = eoorTranType;
	}
	public Date getEoorOutDate() {
		return eoorOutDate;
	}
	public void setEoorOutDate(Date eoorOutDate) {
		this.eoorOutDate = eoorOutDate;
	}
	public String getEoorStatus() {
		return eoorStatus;
	}
	public void setEoorStatus(String eoorStatus) {
		this.eoorStatus = eoorStatus;
	}
	public Double getEoorWeight() {
		return eoorWeight;
	}
	public void setEoorWeight(Double eoorWeight) {
		this.eoorWeight = eoorWeight;
	}
	public Double getEoorVolume() {
		return eoorVolume;
	}
	public void setEoorVolume(Double eoorVolume) {
		this.eoorVolume = eoorVolume;
	}
	public Double getEoorQuantity() {
		return eoorQuantity;
	}
	public void setEoorQuantity(Double eoorQuantity) {
		this.eoorQuantity = eoorQuantity;
	}
	public String getEoorQuantityUnit() {
		return eoorQuantityUnit;
	}
	public void setEoorQuantityUnit(String eoorQuantityUnit) {
		this.eoorQuantityUnit = eoorQuantityUnit;
	}
	public Double getEoorNetWeight() {
		return eoorNetWeight;
	}
	public void setEoorNetWeight(Double eoorNetWeight) {
		this.eoorNetWeight = eoorNetWeight;
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
	public String getEoorDeliveryPeriod() {
		return eoorDeliveryPeriod;
	}
	public void setEoorDeliveryPeriod(String eoorDeliveryPeriod) {
		this.eoorDeliveryPeriod = eoorDeliveryPeriod;
	}
	public String getEoorArrivalPeriod() {
		return eoorArrivalPeriod;
	}
	public void setEoorArrivalPeriod(String eoorArrivalPeriod) {
		this.eoorArrivalPeriod = eoorArrivalPeriod;
	}
	public Long getEoorShipperEbspId() {
		return eoorShipperEbspId;
	}
	public void setEoorShipperEbspId(Long eoorShipperEbspId) {
		this.eoorShipperEbspId = eoorShipperEbspId;
	}
	public String getEoorShipperEbspNameCn() {
		return eoorShipperEbspNameCn;
	}
	public void setEoorShipperEbspNameCn(String eoorShipperEbspNameCn) {
		this.eoorShipperEbspNameCn = eoorShipperEbspNameCn;
	}
	public String getEoorShipperEbsaPost() {
		return eoorShipperEbsaPost;
	}
	public void setEoorShipperEbsaPost(String eoorShipperEbsaPost) {
		this.eoorShipperEbsaPost = eoorShipperEbsaPost;
	}
	public String getEoorShipperEbsaContact() {
		return eoorShipperEbsaContact;
	}
	public void setEoorShipperEbsaContact(String eoorShipperEbsaContact) {
		this.eoorShipperEbsaContact = eoorShipperEbsaContact;
	}
	public String getEoorShipperEbsaTel() {
		return eoorShipperEbsaTel;
	}
	public void setEoorShipperEbsaTel(String eoorShipperEbsaTel) {
		this.eoorShipperEbsaTel = eoorShipperEbsaTel;
	}
	public Long getEoorShipperEbsaId() {
		return eoorShipperEbsaId;
	}
	public void setEoorShipperEbsaId(Long eoorShipperEbsaId) {
		this.eoorShipperEbsaId = eoorShipperEbsaId;
	}
	public String getEoorShipperEbsaAddress() {
		return eoorShipperEbsaAddress;
	}
	public void setEoorShipperEbsaAddress(String eoorShipperEbsaAddress) {
		this.eoorShipperEbsaAddress = eoorShipperEbsaAddress;
	}
	public Long getEoorShipperEbrgId() {
		return eoorShipperEbrgId;
	}
	public void setEoorShipperEbrgId(Long eoorShipperEbrgId) {
		this.eoorShipperEbrgId = eoorShipperEbrgId;
	}
	public String getEoorShipperEbrgNameCn() {
		return eoorShipperEbrgNameCn;
	}
	public void setEoorShipperEbrgNameCn(String eoorShipperEbrgNameCn) {
		this.eoorShipperEbrgNameCn = eoorShipperEbrgNameCn;
	}
	public Long getEoorShipperEbplId() {
		return eoorShipperEbplId;
	}
	public void setEoorShipperEbplId(Long eoorShipperEbplId) {
		this.eoorShipperEbplId = eoorShipperEbplId;
	}
	public String getEoorShipperEbplNameCn() {
		return eoorShipperEbplNameCn;
	}
	public void setEoorShipperEbplNameCn(String eoorShipperEbplNameCn) {
		this.eoorShipperEbplNameCn = eoorShipperEbplNameCn;
	}
	public Long getEoorConsigneeEbspId() {
		return eoorConsigneeEbspId;
	}
	public void setEoorConsigneeEbspId(Long eoorConsigneeEbspId) {
		this.eoorConsigneeEbspId = eoorConsigneeEbspId;
	}
	public String getEoorConsigneeEbspNameCn() {
		return eoorConsigneeEbspNameCn;
	}
	public void setEoorConsigneeEbspNameCn(String eoorConsigneeEbspNameCn) {
		this.eoorConsigneeEbspNameCn = eoorConsigneeEbspNameCn;
	}
	public String getEoorConsigneeEbsaPost() {
		return eoorConsigneeEbsaPost;
	}
	public void setEoorConsigneeEbsaPost(String eoorConsigneeEbsaPost) {
		this.eoorConsigneeEbsaPost = eoorConsigneeEbsaPost;
	}
	public String getEoorConsigneeEbsaContact() {
		return eoorConsigneeEbsaContact;
	}
	public void setEoorConsigneeEbsaContact(String eoorConsigneeEbsaContact) {
		this.eoorConsigneeEbsaContact = eoorConsigneeEbsaContact;
	}
	public String getEoorConsigneeEbsaTel() {
		return eoorConsigneeEbsaTel;
	}
	public void setEoorConsigneeEbsaTel(String eoorConsigneeEbsaTel) {
		this.eoorConsigneeEbsaTel = eoorConsigneeEbsaTel;
	}
	public Long getEoorConsigneeEbsaId() {
		return eoorConsigneeEbsaId;
	}
	public void setEoorConsigneeEbsaId(Long eoorConsigneeEbsaId) {
		this.eoorConsigneeEbsaId = eoorConsigneeEbsaId;
	}
	public String getEoorConsigneeEbsaAddress() {
		return eoorConsigneeEbsaAddress;
	}
	public void setEoorConsigneeEbsaAddress(String eoorConsigneeEbsaAddress) {
		this.eoorConsigneeEbsaAddress = eoorConsigneeEbsaAddress;
	}
	public Long getEoorConsigneeEbrgId() {
		return eoorConsigneeEbrgId;
	}
	public void setEoorConsigneeEbrgId(Long eoorConsigneeEbrgId) {
		this.eoorConsigneeEbrgId = eoorConsigneeEbrgId;
	}
	public String getEoorConsigneeEbrgNameCn() {
		return eoorConsigneeEbrgNameCn;
	}
	public void setEoorConsigneeEbrgNameCn(String eoorConsigneeEbrgNameCn) {
		this.eoorConsigneeEbrgNameCn = eoorConsigneeEbrgNameCn;
	}
	public Long getEoorConsigneeEbplId() {
		return eoorConsigneeEbplId;
	}
	public void setEoorConsigneeEbplId(Long eoorConsigneeEbplId) {
		this.eoorConsigneeEbplId = eoorConsigneeEbplId;
	}
	public String getEoorConsigneeEbplNameCn() {
		return eoorConsigneeEbplNameCn;
	}
	public void setEoorConsigneeEbplNameCn(String eoorConsigneeEbplNameCn) {
		this.eoorConsigneeEbplNameCn = eoorConsigneeEbplNameCn;
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
	public String getEoorDocReq() {
		return eoorDocReq;
	}
	public void setEoorDocReq(String eoorDocReq) {
		this.eoorDocReq = eoorDocReq;
	}
	public String getEoorRemark() {
		return eoorRemark;
	}
	public void setEoorRemark(String eoorRemark) {
		this.eoorRemark = eoorRemark;
	}
	public String getEoorVoidDesc() {
		return eoorVoidDesc;
	}
	public void setEoorVoidDesc(String eoorVoidDesc) {
		this.eoorVoidDesc = eoorVoidDesc;
	}
	public String getEoorVoider() {
		return eoorVoider;
	}
	public void setEoorVoider(String eoorVoider) {
		this.eoorVoider = eoorVoider;
	}
	public Date getEoorVoiderTime() {
		return eoorVoiderTime;
	}
	public void setEoorVoiderTime(Date eoorVoiderTime) {
		this.eoorVoiderTime = eoorVoiderTime;
	}
	public Long getEoorScheduleId() {
		return eoorScheduleId;
	}
	public void setEoorScheduleId(Long eoorScheduleId) {
		this.eoorScheduleId = eoorScheduleId;
	}
	public String getEoorScheduleName() {
		return eoorScheduleName;
	}
	public void setEoorScheduleName(String eoorScheduleName) {
		this.eoorScheduleName = eoorScheduleName;
	}
	public Long getEoorRalationId() {
		return eoorRalationId;
	}
	public void setEoorRalationId(Long eoorRalationId) {
		this.eoorRalationId = eoorRalationId;
	}
	public String getEoorRalationSoNo() {
		return eoorRalationSoNo;
	}
	public void setEoorRalationSoNo(String eoorRalationSoNo) {
		this.eoorRalationSoNo = eoorRalationSoNo;
	}
	public String getEoorTheirPlate() {
		return eoorTheirPlate;
	}
	public void setEoorTheirPlate(String eoorTheirPlate) {
		this.eoorTheirPlate = eoorTheirPlate;
	}
	public Double getEoorTotalIncome() {
		return eoorTotalIncome;
	}
	public void setEoorTotalIncome(Double eoorTotalIncome) {
		this.eoorTotalIncome = eoorTotalIncome;
	}
	public String getEoorDataSource() {
		return eoorDataSource;
	}
	public void setEoorDataSource(String eoorDataSource) {
		this.eoorDataSource = eoorDataSource;
	}
	public String getEoorMessageName() {
		return eoorMessageName;
	}
	public void setEoorMessageName(String eoorMessageName) {
		this.eoorMessageName = eoorMessageName;
	}
	public String getEoorOriSingleNo() {
		return eoorOriSingleNo;
	}
	public void setEoorOriSingleNo(String eoorOriSingleNo) {
		this.eoorOriSingleNo = eoorOriSingleNo;
	}
	public String getEoorCreatorName() {
		return eoorCreatorName;
	}
	public void setEoorCreatorName(String eoorCreatorName) {
		this.eoorCreatorName = eoorCreatorName;
	}
	public String getEoorCreatorEmail() {
		return eoorCreatorEmail;
	}
	public void setEoorCreatorEmail(String eoorCreatorEmail) {
		this.eoorCreatorEmail = eoorCreatorEmail;
	}
	public String getEoorCreatorTel() {
		return eoorCreatorTel;
	}
	public void setEoorCreatorTel(String eoorCreatorTel) {
		this.eoorCreatorTel = eoorCreatorTel;
	}
	public String getEoorType() {
		return eoorType;
	}
	public void setEoorType(String eoorType) {
		this.eoorType = eoorType;
	}
	public String getEoorPrevStatus() {
		return eoorPrevStatus;
	}
	public void setEoorPrevStatus(String eoorPrevStatus) {
		this.eoorPrevStatus = eoorPrevStatus;
	}
	public String getEoorPrevPlanStatus() {
		return eoorPrevPlanStatus;
	}
	public void setEoorPrevPlanStatus(String eoorPrevPlanStatus) {
		this.eoorPrevPlanStatus = eoorPrevPlanStatus;
	}
	public String getEoorConsigneeEbrgNo() {
		return eoorConsigneeEbrgNo;
	}
	public void setEoorConsigneeEbrgNo(String eoorConsigneeEbrgNo) {
		this.eoorConsigneeEbrgNo = eoorConsigneeEbrgNo;
	}
	public String getEoorShipperEbrgNo() {
		return eoorShipperEbrgNo;
	}
	public void setEoorShipperEbrgNo(String eoorShipperEbrgNo) {
		this.eoorShipperEbrgNo = eoorShipperEbrgNo;
	}
	public String getEoorShipperEbsaFax() {
		return eoorShipperEbsaFax;
	}
	public void setEoorShipperEbsaFax(String eoorShipperEbsaFax) {
		this.eoorShipperEbsaFax = eoorShipperEbsaFax;
	}
	public String getEoorShipperEbsaEmail() {
		return eoorShipperEbsaEmail;
	}
	public void setEoorShipperEbsaEmail(String eoorShipperEbsaEmail) {
		this.eoorShipperEbsaEmail = eoorShipperEbsaEmail;
	}
	public String getEoorConsigneeEbsaFax() {
		return eoorConsigneeEbsaFax;
	}
	public void setEoorConsigneeEbsaFax(String eoorConsigneeEbsaFax) {
		this.eoorConsigneeEbsaFax = eoorConsigneeEbsaFax;
	}
	public String getEoorConsigneeEbsaEmail() {
		return eoorConsigneeEbsaEmail;
	}
	public void setEoorConsigneeEbsaEmail(String eoorConsigneeEbsaEmail) {
		this.eoorConsigneeEbsaEmail = eoorConsigneeEbsaEmail;
	}
	public String getEoorFCode() {
		return eoorFCode;
	}
	public void setEoorFCode(String eoorFCode) {
		this.eoorFCode = eoorFCode;
	}
	public String getEoorBmsEbbtCode() {
		return eoorBmsEbbtCode;
	}
	public void setEoorBmsEbbtCode(String eoorBmsEbbtCode) {
		this.eoorBmsEbbtCode = eoorBmsEbbtCode;
	}
	public String getEoorBmsEbotCode() {
		return eoorBmsEbotCode;
	}
	public void setEoorBmsEbotCode(String eoorBmsEbotCode) {
		this.eoorBmsEbotCode = eoorBmsEbotCode;
	}
	public String getEoorBmsEsdeDepartmentCode() {
		return eoorBmsEsdeDepartmentCode;
	}
	public void setEoorBmsEsdeDepartmentCode(String eoorBmsEsdeDepartmentCode) {
		this.eoorBmsEsdeDepartmentCode = eoorBmsEsdeDepartmentCode;
	}
	public String getEoorBmsEbsmCode() {
		return eoorBmsEbsmCode;
	}
	public void setEoorBmsEbsmCode(String eoorBmsEbsmCode) {
		this.eoorBmsEbsmCode = eoorBmsEbsmCode;
	}
	public String getEoorBmsBusinessClass() {
		return eoorBmsBusinessClass;
	}
	public void setEoorBmsBusinessClass(String eoorBmsBusinessClass) {
		this.eoorBmsBusinessClass = eoorBmsBusinessClass;
	}
	public String getEoorBmsAEbcuCustomerNo() {
		return eoorBmsAEbcuCustomerNo;
	}
	public void setEoorBmsAEbcuCustomerNo(String eoorBmsAEbcuCustomerNo) {
		this.eoorBmsAEbcuCustomerNo = eoorBmsAEbcuCustomerNo;
	}
	public String getEoorBmsSEbcuCustomerNo() {
		return eoorBmsSEbcuCustomerNo;
	}
	public void setEoorBmsSEbcuCustomerNo(String eoorBmsSEbcuCustomerNo) {
		this.eoorBmsSEbcuCustomerNo = eoorBmsSEbcuCustomerNo;
	}
	public String getEoorBmsCargoType() {
		return eoorBmsCargoType;
	}
	public void setEoorBmsCargoType(String eoorBmsCargoType) {
		this.eoorBmsCargoType = eoorBmsCargoType;
	}
	public String getEoorCommerceType() {
		return eoorCommerceType;
	}
	public void setEoorCommerceType(String eoorCommerceType) {
		this.eoorCommerceType = eoorCommerceType;
	}
	public String getEoorBmsMonitorType() {
		return eoorBmsMonitorType;
	}
	public void setEoorBmsMonitorType(String eoorBmsMonitorType) {
		this.eoorBmsMonitorType = eoorBmsMonitorType;
	}
	public String getEoorBmsCountType() {
		return eoorBmsCountType;
	}
	public void setEoorBmsCountType(String eoorBmsCountType) {
		this.eoorBmsCountType = eoorBmsCountType;
	}
	public String getEoorEbbuCode() {
		return eoorEbbuCode;
	}
	public void setEoorEbbuCode(String eoorEbbuCode) {
		this.eoorEbbuCode = eoorEbbuCode;
	}
	public Double getEoorAmtReceivable() {
		return eoorAmtReceivable;
	}
	public void setEoorAmtReceivable(Double eoorAmtReceivable) {
		this.eoorAmtReceivable = eoorAmtReceivable;
	}
	public Double getEoorAmtPayable() {
		return eoorAmtPayable;
	}
	public void setEoorAmtPayable(Double eoorAmtPayable) {
		this.eoorAmtPayable = eoorAmtPayable;
	}
	public String getEoorChargeoff() {
		return eoorChargeoff;
	}
	public void setEoorChargeoff(String eoorChargeoff) {
		this.eoorChargeoff = eoorChargeoff;
	}
	public String getEoorPaymentMode() {
		return eoorPaymentMode;
	}
	public void setEoorPaymentMode(String eoorPaymentMode) {
		this.eoorPaymentMode = eoorPaymentMode;
	}
	public Long getEoorReceiptReturntype() {
		return eoorReceiptReturntype;
	}
	public void setEoorReceiptReturntype(Long eoorReceiptReturntype) {
		this.eoorReceiptReturntype = eoorReceiptReturntype;
	}
	public Long getEoorContainerCount() {
		return eoorContainerCount;
	}
	public void setEoorContainerCount(Long eoorContainerCount) {
		this.eoorContainerCount = eoorContainerCount;
	}
	public Long getEoorCargoSource() {
		return eoorCargoSource;
	}
	public void setEoorCargoSource(Long eoorCargoSource) {
		this.eoorCargoSource = eoorCargoSource;
	}
	public Long getEoorLoEbppId() {
		return eoorLoEbppId;
	}
	public void setEoorLoEbppId(Long eoorLoEbppId) {
		this.eoorLoEbppId = eoorLoEbppId;
	}
	public Long getEoorEbpjId() {
		return eoorEbpjId;
	}
	public void setEoorEbpjId(Long eoorEbpjId) {
		this.eoorEbpjId = eoorEbpjId;
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

	
	
	
	
	
}
