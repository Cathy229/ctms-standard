package com.sinotrans.oms.eoorder.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sinotrans.framework.orm.model.BaseModel;
import com.sinotrans.framework.orm.model.OperationLog;

/**
 * Model class for EoOrder
 */
@Entity
@Table(name = "EO_ORDER")
@JsonInclude(JsonInclude.Include.NON_NULL)//20180906 harley jackson转换时忽略空属性不在set。请根据更新逻辑酌情使用
public class EoOrderModel extends BaseModel implements OperationLog {

	//eoorId
	private Long eoorId;
	//eoorEocsId
	private Long eoorEocsId;
	//eoorEscoId
	private Long eoorEscoId;
	//eoorEbpjId
	private Long eoorEbpjId;
	//eoorEbpjName
	private String eoorEbpjName;
	//eoorOrderNo
	private String eoorOrderNo;
	//eoorLoEbppId
	private Long eoorLoEbppId;
	//eoorLoIsAutomatic
	private String eoorLoIsAutomatic;
	//eoorLoPlanStatus
	private String eoorLoPlanStatus;
	//eoorMilestoneStatus
	private String eoorMilestoneStatus;
	//eoorMilestoneTime
	private Date eoorMilestoneTime;
	//eoorParentsOrderId
	private Long eoorParentsOrderId;
	//eoorInnerOrderId
	private Long eoorInnerOrderId;
	//eoorSource
	private String eoorSource;
	//eoorSoNo
	private String eoorSoNo;
	//eoorDoNo
	private String eoorDoNo;
	//eoorOrderFudeji
	private String eoorOrderFudeji;
	//eoorContractNo
	private String eoorContractNo;
	//eoorLevel
	private String eoorLevel;
	//eoorOrderBarcode
	private String eoorOrderBarcode;
	//eoorConsignorEbcuId
	private Long eoorConsignorEbcuId;
	//eoorConsignorEbcuCode
	private String eoorConsignorEbcuCode;
	//eoorConsignorEbcuName
	private String eoorConsignorEbcuName;
	//eoorCustomEbcuId
	private Long eoorCustomEbcuId;
	//eoorCustomEbcuCode
	private String eoorCustomEbcuCode;
	//eoorCustomEbcuName
	private String eoorCustomEbcuName;
	//eoorSupplierEbcuId
	private Long eoorSupplierEbcuId;
	//eoorSupplierEbcuCode
	private String eoorSupplierEbcuCode;
	//eoorSupplierEbcuName
	private String eoorSupplierEbcuName;
	//eoorEbbuId
	private Long eoorEbbuId;
	//eoorEbbuBuName
	private String eoorEbbuBuName;
	//eoorEbpeId
	private Long eoorEbpeId;
	//eoorEbccName
	private String eoorEbccName;
	//eoorOrderDate
	private Date eoorOrderDate;
	//eoorStartEbrgId
	private Long eoorStartEbrgId;
	//eoorStartEbrgNameCn
	private String eoorStartEbrgNameCn;
	//eoorEndEbrgId
	private Long eoorEndEbrgId;
	//eoorEndEbrgNameCn
	private String eoorEndEbrgNameCn;
	//eoorDoubleOrder
	private String eoorDoubleOrder;
	//eoorEsdeId
	private Long eoorEsdeId;
	//eoorEsdeName
	private String eoorEsdeName;
	//eoorSaleEsstId
	private Long eoorSaleEsstId;
	//eoorSaleEsstName
	private String eoorSaleEsstName;
	//eoorOperateEsstId
	private Long eoorOperateEsstId;
	//eoorOperateEsstName
	private String eoorOperateEsstName;
	//eoorSpecialOrder
	private String eoorSpecialOrder;
	//eoorTranType
	private String eoorTranType;
	//eoorOutDate
	private Date eoorOutDate;
	//eoorStatus
	private String eoorStatus;
	//eoorWeight
	private Double eoorWeight;
	//eoorVolume
	private Double eoorVolume;
	//eoorQuantity
	private Double eoorQuantity;
	//eoorQuantityUnit
	private String eoorQuantityUnit;
	//eoorNetWeight
	private Double eoorNetWeight;
	//eoorReqDeliveryDate
	private Date eoorReqDeliveryDate;
	//eoorReqArrivalDate
	private Date eoorReqArrivalDate;
	//eoorDeliveryPeriod
	private String eoorDeliveryPeriod;
	//eoorArrivalPeriod
	private String eoorArrivalPeriod;
	//eoorShipperEbspId
	private Long eoorShipperEbspId;
	//eoorShipperEbspNameCn
	private String eoorShipperEbspNameCn;
	//eoorShipperEbsaPost
	private String eoorShipperEbsaPost;
	//eoorShipperEbsaContact
	private String eoorShipperEbsaContact;
	//eoorShipperEbsaTel
	private String eoorShipperEbsaTel;
	//eoorShipperEbsaId
	private Long eoorShipperEbsaId;
	//eoorShipperEbsaAddress
	private String eoorShipperEbsaAddress;
	//eoorShipperEbrgId
	private Long eoorShipperEbrgId;
	//eoorShipperEbrgNameCn
	private String eoorShipperEbrgNameCn;
	//eoorShipperEbplId
	private Long eoorShipperEbplId;
	//eoorShipperEbplNameCn
	private String eoorShipperEbplNameCn;
	//eoorConsigneeEbspId
	private Long eoorConsigneeEbspId;
	//eoorConsigneeEbspNameCn
	private String eoorConsigneeEbspNameCn;
	//eoorConsigneeEbsaPost
	private String eoorConsigneeEbsaPost;
	//eoorConsigneeEbsaContact
	private String eoorConsigneeEbsaContact;
	//eoorConsigneeEbsaTel
	private String eoorConsigneeEbsaTel;
	//eoorConsigneeEbsaId
	private Long eoorConsigneeEbsaId;
	//eoorConsigneeEbsaAddress
	private String eoorConsigneeEbsaAddress;
	//eoorConsigneeEbrgId
	private Long eoorConsigneeEbrgId;
	//eoorConsigneeEbrgNameCn
	private String eoorConsigneeEbrgNameCn;
	//eoorConsigneeEbplId
	private Long eoorConsigneeEbplId;
	//eoorConsigneeEbplNameCn
	private String eoorConsigneeEbplNameCn;
	//eoorTransReq
	private String eoorTransReq;
	//eoorConsigneeReq
	private String eoorConsigneeReq;
	//eoorDocReq
	private String eoorDocReq;
	//eoorRemark
	private String eoorRemark;
	//eoorVoidDesc
	private String eoorVoidDesc;
	//eoorVoider
	private String eoorVoider;
	//eoorVoiderTime
	private Date eoorVoiderTime;
	//eoorScheduleId
	private Long eoorScheduleId;
	//eoorScheduleName
	private String eoorScheduleName;
	//eoorRalationId
	private Long eoorRalationId;
	//eoorRalationSoNo
	private String eoorRalationSoNo;
	//eoorTheirPlate
	private String eoorTheirPlate;
	//eoorTotalIncome
	private Long eoorTotalIncome;
	//eoorDataSource
	private String eoorDataSource;
	//eoorMessageName
	private String eoorMessageName;
	//eoorOriSingleNo
	private String eoorOriSingleNo;
	//eoorCreatorName
	private String eoorCreatorName;
	//eoorCreatorEmail
	private String eoorCreatorEmail;
	//eoorCreatorTel
	private String eoorCreatorTel;
	//eoorSubstr1
	private String eoorSubstr1;
	//eoorSubstr2
	private String eoorSubstr2;
	//eoorSubstr3
	private String eoorSubstr3;
	//eoorSubstr4
	private String eoorSubstr4;
	//eoorSubstr5
	private String eoorSubstr5;
	//eoorSubstr6
	private String eoorSubstr6;
	//eoorSubstr7
	private String eoorSubstr7;
	//eoorSubstr8
	private String eoorSubstr8;
	//eoorSubdate1
	private Date eoorSubdate1;
	//eoorSubdate2
	private Date eoorSubdate2;
	//eoorSubdate3
	private Date eoorSubdate3;
	//eoorSubdate4
	private Date eoorSubdate4;
	//eoorSubnum1
	private Long eoorSubnum1;
	//eoorSubnum2
	private Long eoorSubnum2;
	//eoorSubnum3
	private Long eoorSubnum3;
	//eoorSubnum4
	private Long eoorSubnum4;
	//recVer
	private Long recVer;
	//creator
	private String creator;
	//createTime
	private Date createTime;
	//modifier
	private String modifier;
	//modifyTime
	private Date modifyTime;
	//eoorSubstr9
	private String eoorSubstr9;
	//eoorSubstr10
	private String eoorSubstr10;
	//eoorSubstr11
	private String eoorSubstr11;
	//eoorSubstr12
	private String eoorSubstr12;
	//eoorSubstr13
	private String eoorSubstr13;
	//eoorSubstr14
	private String eoorSubstr14;
	//eoorSubstr15
	private String eoorSubstr15;
	//eoorSubstr16
	private String eoorSubstr16;
	//eoorSubstr17
	private String eoorSubstr17;
	//eoorSubstr18
	private String eoorSubstr18;
	//eoorSubstr19
	private String eoorSubstr19;
	//eoorSubstr20
	private String eoorSubstr20;
	//eoorSubstr21
	private String eoorSubstr21;
	//eoorSubstr22
	private String eoorSubstr22;
	//eoorSubstr23
	private String eoorSubstr23;
	//eoorSubstr24
	private String eoorSubstr24;
	//eoorSubstr25
	private String eoorSubstr25;
	//eoorSubdate5
	private Date eoorSubdate5;
	//eoorSubdate6
	private Date eoorSubdate6;
	//eoorSubnum5
	private Long eoorSubnum5;
	//eoorSubnum6
	private Long eoorSubnum6;
	//eoorType
	private String eoorType;
	//eoorPrevStatus
	private String eoorPrevStatus;
	//eoorShipperEbspCode
	private String eoorShipperEbspCode;
	//eoorConsigneeEbspCode
	private String eoorConsigneeEbspCode;
	//eoorPrevPlanStatus
	private String eoorPrevPlanStatus;
	//eoorConsigneeEbrgNo
	private String eoorConsigneeEbrgNo;
	//eoorShipperEbrgNo
	private String eoorShipperEbrgNo;
	//eoorShipperEbsaFax
	private String eoorShipperEbsaFax;
	//eoorShipperEbsaEmail
	private String eoorShipperEbsaEmail;
	//eoorConsigneeEbsaFax
	private String eoorConsigneeEbsaFax;
	//eoorConsigneeEbsaEmail
	private String eoorConsigneeEbsaEmail;
	//eoorFCode
	private String eoorFCode;
	//eoorBmsEbbtCode
	private String eoorBmsEbbtCode;
	//eoorBmsEbotCode
	private String eoorBmsEbotCode;
	//eoorBmsEsdeDepartmentCode
	private String eoorBmsEsdeDepartmentCode;
	//eoorBmsEbsmCode
	private String eoorBmsEbsmCode;
	//eoorBmsBusinessClass
	private String eoorBmsBusinessClass;
	//eoorBmsAEbcuCustomerNo
	private String eoorBmsAEbcuCustomerNo;
	//eoorBmsSEbcuCustomerNo
	private String eoorBmsSEbcuCustomerNo;
	//eoorBmsCargoType
	private String eoorBmsCargoType;
	//eoorCommerceType
	private String eoorCommerceType;
	//eoorBmsMonitorType
	private String eoorBmsMonitorType;
	//eoorBmsCountType
	private String eoorBmsCountType;
	//eoorBmsAcmpTime
	private Date eoorBmsAcmpTime;
	//eoorEbbuCode
	private String eoorEbbuCode;
	//eoorAmtReceivable
	private Long eoorAmtReceivable;
	//eoorAmtPayable
	private Long eoorAmtPayable;
	//eoorChargeoff
	private String eoorChargeoff;
	//eoorPaymentMode
	private String eoorPaymentMode;
	//eoorReceiptReturntype
	private Long eoorReceiptReturntype;
	//eoorFrozenfessTimelimit
	private Date eoorFrozenfessTimelimit;
	//eoorContainerCount
	private Long eoorContainerCount;
	//eoorCargoSource
	private Long eoorCargoSource;
	//eoorIEoseNum
	private Long eoorIEoseNum;
	//eoorEEoseNum
	private Long eoorEEoseNum;
	//eoorIEoetNum
	private Long eoorIEoetNum;
	//eoorEEoetNum
	private Long eoorEEoetNum;
	//eoorEoddNum
	private Long eoorEoddNum;
	//eoorIsDutyfree
	private Long eoorIsDutyfree;
	//eoorLoEbppType
	private Long eoorLoEbppType;
	//eoorIsAugment
	private Long eoorIsAugment;
	//eoorSinoNo
	private String eoorSinoNo;
	//eoorBilling
	private Long eoorBilling;
	//eoorIsSettlementUpload
	private String eoorIsSettlementUpload;
	//BMS业务票据统计值类型
	private String eoorBusinessType;
	private String eoorLoEbppName;
	
	public String getEoorLoEbppName() {
		return eoorLoEbppName;
	}

	public void setEoorLoEbppName(String eoorLoEbppName) {
		this.eoorLoEbppName = eoorLoEbppName;
	}
	/**
	 * Get eoorId
	 */
	@Column(name = "EOOR_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoorId() {
		return eoorId;
	}

	/**
	 * Set eoorId
	 */
	public void setEoorId(Long eoorId) {
		this.eoorId = eoorId;
		addValidField("eoorId");
	}

	/**
	 * Get eoorEocsId
	 */
	@Column(name = "EOOR_EOCS_ID")
	public Long getEoorEocsId() {
		return eoorEocsId;
	}

	/**
	 * Set eoorEocsId
	 */
	public void setEoorEocsId(Long eoorEocsId) {
		this.eoorEocsId = eoorEocsId;
		addValidField("eoorEocsId");
	}

	/**
	 * Get eoorEscoId
	 */
	@Column(name = "EOOR_ESCO_ID")
	public Long getEoorEscoId() {
		return eoorEscoId;
	}

	/**
	 * Set eoorEscoId
	 */
	public void setEoorEscoId(Long eoorEscoId) {
		this.eoorEscoId = eoorEscoId;
		addValidField("eoorEscoId");
	}

	/**
	 * Get eoorEbpjId
	 */
	@Column(name = "EOOR_EBPJ_ID")
	public Long getEoorEbpjId() {
		return eoorEbpjId;
	}

	/**
	 * Set eoorEbpjId
	 */
	public void setEoorEbpjId(Long eoorEbpjId) {
		this.eoorEbpjId = eoorEbpjId;
		addValidField("eoorEbpjId");
	}

	/**
	 * Get eoorEbpjName
	 */
	@Column(name = "EOOR_EBPJ_NAME")
	public String getEoorEbpjName() {
		return eoorEbpjName;
	}

	/**
	 * Set eoorEbpjName
	 */
	public void setEoorEbpjName(String eoorEbpjName) {
		this.eoorEbpjName = eoorEbpjName;
		addValidField("eoorEbpjName");
	}

	/**
	 * Get eoorOrderNo
	 */
	@Column(name = "EOOR_ORDER_NO")
	public String getEoorOrderNo() {
		return eoorOrderNo;
	}

	/**
	 * Set eoorOrderNo
	 */
	public void setEoorOrderNo(String eoorOrderNo) {
		this.eoorOrderNo = eoorOrderNo;
		addValidField("eoorOrderNo");
	}

	/**
	 * Get eoorLoEbppId
	 */
	@Column(name = "EOOR_LO_EBPP_ID")
	public Long getEoorLoEbppId() {
		return eoorLoEbppId;
	}

	/**
	 * Set eoorLoEbppId
	 */
	public void setEoorLoEbppId(Long eoorLoEbppId) {
		this.eoorLoEbppId = eoorLoEbppId;
		addValidField("eoorLoEbppId");
	}

	/**
	 * Get eoorLoIsAutomatic
	 */
	@Column(name = "EOOR_LO_IS_AUTOMATIC")
	public String getEoorLoIsAutomatic() {
		return eoorLoIsAutomatic;
	}

	/**
	 * Set eoorLoIsAutomatic
	 */
	public void setEoorLoIsAutomatic(String eoorLoIsAutomatic) {
		this.eoorLoIsAutomatic = eoorLoIsAutomatic;
		addValidField("eoorLoIsAutomatic");
	}

	/**
	 * Get eoorLoPlanStatus
	 */
	@Column(name = "EOOR_LO_PLAN_STATUS")
	public String getEoorLoPlanStatus() {
		return eoorLoPlanStatus;
	}

	/**
	 * Set eoorLoPlanStatus
	 */
	public void setEoorLoPlanStatus(String eoorLoPlanStatus) {
		this.eoorLoPlanStatus = eoorLoPlanStatus;
		addValidField("eoorLoPlanStatus");
	}

	/**
	 * Get eoorMilestoneStatus
	 */
	@Column(name = "EOOR_MILESTONE_STATUS")
	public String getEoorMilestoneStatus() {
		return eoorMilestoneStatus;
	}

	/**
	 * Set eoorMilestoneStatus
	 */
	public void setEoorMilestoneStatus(String eoorMilestoneStatus) {
		this.eoorMilestoneStatus = eoorMilestoneStatus;
		addValidField("eoorMilestoneStatus");
	}

	/**
	 * Get eoorMilestoneTime
	 */
	@Column(name = "EOOR_MILESTONE_TIME")
	public Date getEoorMilestoneTime() {
		return eoorMilestoneTime;
	}

	/**
	 * Set eoorMilestoneTime
	 */
	public void setEoorMilestoneTime(Date eoorMilestoneTime) {
		this.eoorMilestoneTime = eoorMilestoneTime;
		addValidField("eoorMilestoneTime");
	}

	/**
	 * Get eoorParentsOrderId
	 */
	@Column(name = "EOOR_PARENTS_ORDER_ID")
	public Long getEoorParentsOrderId() {
		return eoorParentsOrderId;
	}

	/**
	 * Set eoorParentsOrderId
	 */
	public void setEoorParentsOrderId(Long eoorParentsOrderId) {
		this.eoorParentsOrderId = eoorParentsOrderId;
		addValidField("eoorParentsOrderId");
	}

	/**
	 * Get eoorInnerOrderId
	 */
	@Column(name = "EOOR_INNER_ORDER_ID")
	public Long getEoorInnerOrderId() {
		return eoorInnerOrderId;
	}

	/**
	 * Set eoorInnerOrderId
	 */
	public void setEoorInnerOrderId(Long eoorInnerOrderId) {
		this.eoorInnerOrderId = eoorInnerOrderId;
		addValidField("eoorInnerOrderId");
	}

	/**
	 * Get eoorSource
	 */
	@Column(name = "EOOR_SOURCE")
	public String getEoorSource() {
		return eoorSource;
	}

	/**
	 * Set eoorSource
	 */
	public void setEoorSource(String eoorSource) {
		this.eoorSource = eoorSource;
		addValidField("eoorSource");
	}

	/**
	 * Get eoorSoNo
	 */
	@Column(name = "EOOR_SO_NO")
	public String getEoorSoNo() {
		return eoorSoNo;
	}

	/**
	 * Set eoorSoNo
	 */
	public void setEoorSoNo(String eoorSoNo) {
		this.eoorSoNo = eoorSoNo;
		addValidField("eoorSoNo");
	}

	/**
	 * Get eoorDoNo
	 */
	@Column(name = "EOOR_DO_NO")
	public String getEoorDoNo() {
		return eoorDoNo;
	}

	/**
	 * Set eoorDoNo
	 */
	public void setEoorDoNo(String eoorDoNo) {
		this.eoorDoNo = eoorDoNo;
		addValidField("eoorDoNo");
	}

	/**
	 * Get eoorOrderFudeji
	 */
	@Column(name = "EOOR_ORDER_FUDEJI")
	public String getEoorOrderFudeji() {
		return eoorOrderFudeji;
	}

	/**
	 * Set eoorOrderFudeji
	 */
	public void setEoorOrderFudeji(String eoorOrderFudeji) {
		this.eoorOrderFudeji = eoorOrderFudeji;
		addValidField("eoorOrderFudeji");
	}

	/**
	 * Get eoorContractNo
	 */
	@Column(name = "EOOR_CONTRACT_NO")
	public String getEoorContractNo() {
		return eoorContractNo;
	}

	/**
	 * Set eoorContractNo
	 */
	public void setEoorContractNo(String eoorContractNo) {
		this.eoorContractNo = eoorContractNo;
		addValidField("eoorContractNo");
	}

	/**
	 * Get eoorLevel
	 */
	@Column(name = "EOOR_LEVEL")
	public String getEoorLevel() {
		return eoorLevel;
	}

	/**
	 * Set eoorLevel
	 */
	public void setEoorLevel(String eoorLevel) {
		this.eoorLevel = eoorLevel;
		addValidField("eoorLevel");
	}

	/**
	 * Get eoorOrderBarcode
	 */
	@Column(name = "EOOR_ORDER_BARCODE")
	public String getEoorOrderBarcode() {
		return eoorOrderBarcode;
	}

	/**
	 * Set eoorOrderBarcode
	 */
	public void setEoorOrderBarcode(String eoorOrderBarcode) {
		this.eoorOrderBarcode = eoorOrderBarcode;
		addValidField("eoorOrderBarcode");
	}

	/**
	 * Get eoorConsignorEbcuId
	 */
	@Column(name = "EOOR_CONSIGNOR_EBCU_ID")
	public Long getEoorConsignorEbcuId() {
		return eoorConsignorEbcuId;
	}

	/**
	 * Set eoorConsignorEbcuId
	 */
	public void setEoorConsignorEbcuId(Long eoorConsignorEbcuId) {
		this.eoorConsignorEbcuId = eoorConsignorEbcuId;
		addValidField("eoorConsignorEbcuId");
	}

	/**
	 * Get eoorConsignorEbcuCode
	 */
	@Column(name = "EOOR_CONSIGNOR_EBCU_CODE")
	public String getEoorConsignorEbcuCode() {
		return eoorConsignorEbcuCode;
	}

	/**
	 * Set eoorConsignorEbcuCode
	 */
	public void setEoorConsignorEbcuCode(String eoorConsignorEbcuCode) {
		this.eoorConsignorEbcuCode = eoorConsignorEbcuCode;
		addValidField("eoorConsignorEbcuCode");
	}

	/**
	 * Get eoorConsignorEbcuName
	 */
	@Column(name = "EOOR_CONSIGNOR_EBCU_NAME")
	public String getEoorConsignorEbcuName() {
		return eoorConsignorEbcuName;
	}

	/**
	 * Set eoorConsignorEbcuName
	 */
	public void setEoorConsignorEbcuName(String eoorConsignorEbcuName) {
		this.eoorConsignorEbcuName = eoorConsignorEbcuName;
		addValidField("eoorConsignorEbcuName");
	}

	/**
	 * Get eoorCustomEbcuId
	 */
	@Column(name = "EOOR_CUSTOM_EBCU_ID")
	public Long getEoorCustomEbcuId() {
		return eoorCustomEbcuId;
	}

	/**
	 * Set eoorCustomEbcuId
	 */
	public void setEoorCustomEbcuId(Long eoorCustomEbcuId) {
		this.eoorCustomEbcuId = eoorCustomEbcuId;
		addValidField("eoorCustomEbcuId");
	}

	/**
	 * Get eoorCustomEbcuCode
	 */
	@Column(name = "EOOR_CUSTOM_EBCU_CODE")
	public String getEoorCustomEbcuCode() {
		return eoorCustomEbcuCode;
	}

	/**
	 * Set eoorCustomEbcuCode
	 */
	public void setEoorCustomEbcuCode(String eoorCustomEbcuCode) {
		this.eoorCustomEbcuCode = eoorCustomEbcuCode;
		addValidField("eoorCustomEbcuCode");
	}

	/**
	 * Get eoorCustomEbcuName
	 */
	@Column(name = "EOOR_CUSTOM_EBCU_NAME")
	public String getEoorCustomEbcuName() {
		return eoorCustomEbcuName;
	}

	/**
	 * Set eoorCustomEbcuName
	 */
	public void setEoorCustomEbcuName(String eoorCustomEbcuName) {
		this.eoorCustomEbcuName = eoorCustomEbcuName;
		addValidField("eoorCustomEbcuName");
	}

	/**
	 * Get eoorSupplierEbcuId
	 */
	@Column(name = "EOOR_SUPPLIER_EBCU_ID")
	public Long getEoorSupplierEbcuId() {
		return eoorSupplierEbcuId;
	}

	/**
	 * Set eoorSupplierEbcuId
	 */
	public void setEoorSupplierEbcuId(Long eoorSupplierEbcuId) {
		this.eoorSupplierEbcuId = eoorSupplierEbcuId;
		addValidField("eoorSupplierEbcuId");
	}

	/**
	 * Get eoorSupplierEbcuCode
	 */
	@Column(name = "EOOR_SUPPLIER_EBCU_CODE")
	public String getEoorSupplierEbcuCode() {
		return eoorSupplierEbcuCode;
	}

	/**
	 * Set eoorSupplierEbcuCode
	 */
	public void setEoorSupplierEbcuCode(String eoorSupplierEbcuCode) {
		this.eoorSupplierEbcuCode = eoorSupplierEbcuCode;
		addValidField("eoorSupplierEbcuCode");
	}

	/**
	 * Get eoorSupplierEbcuName
	 */
	@Column(name = "EOOR_SUPPLIER_EBCU_NAME")
	public String getEoorSupplierEbcuName() {
		return eoorSupplierEbcuName;
	}

	/**
	 * Set eoorSupplierEbcuName
	 */
	public void setEoorSupplierEbcuName(String eoorSupplierEbcuName) {
		this.eoorSupplierEbcuName = eoorSupplierEbcuName;
		addValidField("eoorSupplierEbcuName");
	}

	/**
	 * Get eoorEbbuId
	 */
	@Column(name = "EOOR_EBBU_ID")
	public Long getEoorEbbuId() {
		return eoorEbbuId;
	}

	/**
	 * Set eoorEbbuId
	 */
	public void setEoorEbbuId(Long eoorEbbuId) {
		this.eoorEbbuId = eoorEbbuId;
		addValidField("eoorEbbuId");
	}

	/**
	 * Get eoorEbbuBuName
	 */
	@Column(name = "EOOR_EBBU_BU_NAME")
	public String getEoorEbbuBuName() {
		return eoorEbbuBuName;
	}

	/**
	 * Set eoorEbbuBuName
	 */
	public void setEoorEbbuBuName(String eoorEbbuBuName) {
		this.eoorEbbuBuName = eoorEbbuBuName;
		addValidField("eoorEbbuBuName");
	}

	/**
	 * Get eoorEbpeId
	 */
	@Column(name = "EOOR_EBPE_ID")
	public Long getEoorEbpeId() {
		return eoorEbpeId;
	}

	/**
	 * Set eoorEbpeId
	 */
	public void setEoorEbpeId(Long eoorEbpeId) {
		this.eoorEbpeId = eoorEbpeId;
		addValidField("eoorEbpeId");
	}

	/**
	 * Get eoorEbccName
	 */
	@Column(name = "EOOR_EBCC_NAME")
	public String getEoorEbccName() {
		return eoorEbccName;
	}

	/**
	 * Set eoorEbccName
	 */
	public void setEoorEbccName(String eoorEbccName) {
		this.eoorEbccName = eoorEbccName;
		addValidField("eoorEbccName");
	}

	/**
	 * Get eoorOrderDate
	 */
	@Column(name = "EOOR_ORDER_DATE")
	public Date getEoorOrderDate() {
		return eoorOrderDate;
	}

	/**
	 * Set eoorOrderDate
	 */
	public void setEoorOrderDate(Date eoorOrderDate) {
		this.eoorOrderDate = eoorOrderDate;
		addValidField("eoorOrderDate");
	}

	/**
	 * Get eoorStartEbrgId
	 */
	@Column(name = "EOOR_START_EBRG_ID")
	public Long getEoorStartEbrgId() {
		return eoorStartEbrgId;
	}

	/**
	 * Set eoorStartEbrgId
	 */
	public void setEoorStartEbrgId(Long eoorStartEbrgId) {
		this.eoorStartEbrgId = eoorStartEbrgId;
		addValidField("eoorStartEbrgId");
	}

	/**
	 * Get eoorStartEbrgNameCn
	 */
	@Column(name = "EOOR_START_EBRG_NAME_CN")
	public String getEoorStartEbrgNameCn() {
		return eoorStartEbrgNameCn;
	}

	/**
	 * Set eoorStartEbrgNameCn
	 */
	public void setEoorStartEbrgNameCn(String eoorStartEbrgNameCn) {
		this.eoorStartEbrgNameCn = eoorStartEbrgNameCn;
		addValidField("eoorStartEbrgNameCn");
	}

	/**
	 * Get eoorEndEbrgId
	 */
	@Column(name = "EOOR_END_EBRG_ID")
	public Long getEoorEndEbrgId() {
		return eoorEndEbrgId;
	}

	/**
	 * Set eoorEndEbrgId
	 */
	public void setEoorEndEbrgId(Long eoorEndEbrgId) {
		this.eoorEndEbrgId = eoorEndEbrgId;
		addValidField("eoorEndEbrgId");
	}

	/**
	 * Get eoorEndEbrgNameCn
	 */
	@Column(name = "EOOR_END_EBRG_NAME_CN")
	public String getEoorEndEbrgNameCn() {
		return eoorEndEbrgNameCn;
	}

	/**
	 * Set eoorEndEbrgNameCn
	 */
	public void setEoorEndEbrgNameCn(String eoorEndEbrgNameCn) {
		this.eoorEndEbrgNameCn = eoorEndEbrgNameCn;
		addValidField("eoorEndEbrgNameCn");
	}

	/**
	 * Get eoorDoubleOrder
	 */
	@Column(name = "EOOR_DOUBLE_ORDER")
	public String getEoorDoubleOrder() {
		return eoorDoubleOrder;
	}

	/**
	 * Set eoorDoubleOrder
	 */
	public void setEoorDoubleOrder(String eoorDoubleOrder) {
		this.eoorDoubleOrder = eoorDoubleOrder;
		addValidField("eoorDoubleOrder");
	}

	/**
	 * Get eoorEsdeId
	 */
	@Column(name = "EOOR_ESDE_ID")
	public Long getEoorEsdeId() {
		return eoorEsdeId;
	}

	/**
	 * Set eoorEsdeId
	 */
	public void setEoorEsdeId(Long eoorEsdeId) {
		this.eoorEsdeId = eoorEsdeId;
		addValidField("eoorEsdeId");
	}

	/**
	 * Get eoorEsdeName
	 */
	@Column(name = "EOOR_ESDE_NAME")
	public String getEoorEsdeName() {
		return eoorEsdeName;
	}

	/**
	 * Set eoorEsdeName
	 */
	public void setEoorEsdeName(String eoorEsdeName) {
		this.eoorEsdeName = eoorEsdeName;
		addValidField("eoorEsdeName");
	}

	/**
	 * Get eoorSaleEsstId
	 */
	@Column(name = "EOOR_SALE_ESST_ID")
	public Long getEoorSaleEsstId() {
		return eoorSaleEsstId;
	}

	/**
	 * Set eoorSaleEsstId
	 */
	public void setEoorSaleEsstId(Long eoorSaleEsstId) {
		this.eoorSaleEsstId = eoorSaleEsstId;
		addValidField("eoorSaleEsstId");
	}

	/**
	 * Get eoorSaleEsstName
	 */
	@Column(name = "EOOR_SALE_ESST_NAME")
	public String getEoorSaleEsstName() {
		return eoorSaleEsstName;
	}

	/**
	 * Set eoorSaleEsstName
	 */
	public void setEoorSaleEsstName(String eoorSaleEsstName) {
		this.eoorSaleEsstName = eoorSaleEsstName;
		addValidField("eoorSaleEsstName");
	}

	/**
	 * Get eoorOperateEsstId
	 */
	@Column(name = "EOOR_OPERATE_ESST_ID")
	public Long getEoorOperateEsstId() {
		return eoorOperateEsstId;
	}

	/**
	 * Set eoorOperateEsstId
	 */
	public void setEoorOperateEsstId(Long eoorOperateEsstId) {
		this.eoorOperateEsstId = eoorOperateEsstId;
		addValidField("eoorOperateEsstId");
	}

	/**
	 * Get eoorOperateEsstName
	 */
	@Column(name = "EOOR_OPERATE_ESST_NAME")
	public String getEoorOperateEsstName() {
		return eoorOperateEsstName;
	}

	/**
	 * Set eoorOperateEsstName
	 */
	public void setEoorOperateEsstName(String eoorOperateEsstName) {
		this.eoorOperateEsstName = eoorOperateEsstName;
		addValidField("eoorOperateEsstName");
	}

	/**
	 * Get eoorSpecialOrder
	 */
	@Column(name = "EOOR_SPECIAL_ORDER")
	public String getEoorSpecialOrder() {
		return eoorSpecialOrder;
	}

	/**
	 * Set eoorSpecialOrder
	 */
	public void setEoorSpecialOrder(String eoorSpecialOrder) {
		this.eoorSpecialOrder = eoorSpecialOrder;
		addValidField("eoorSpecialOrder");
	}

	/**
	 * Get eoorTranType
	 */
	@Column(name = "EOOR_TRAN_TYPE")
	public String getEoorTranType() {
		return eoorTranType;
	}

	/**
	 * Set eoorTranType
	 */
	public void setEoorTranType(String eoorTranType) {
		this.eoorTranType = eoorTranType;
		addValidField("eoorTranType");
	}

	/**
	 * Get eoorOutDate
	 */
	@Column(name = "EOOR_OUT_DATE")
	public Date getEoorOutDate() {
		return eoorOutDate;
	}

	/**
	 * Set eoorOutDate
	 */
	public void setEoorOutDate(Date eoorOutDate) {
		this.eoorOutDate = eoorOutDate;
		addValidField("eoorOutDate");
	}

	/**
	 * Get eoorStatus
	 */
	@Column(name = "EOOR_STATUS")
	public String getEoorStatus() {
		return eoorStatus;
	}

	/**
	 * Set eoorStatus
	 */
	public void setEoorStatus(String eoorStatus) {
		this.eoorStatus = eoorStatus;
		addValidField("eoorStatus");
	}

	/**
	 * Get eoorWeight
	 */
	@Column(name = "EOOR_WEIGHT")
	public Double getEoorWeight() {
		return eoorWeight;
	}

	/**
	 * Set eoorWeight
	 */
	public void setEoorWeight(Double eoorWeight) {
		this.eoorWeight = eoorWeight;
		addValidField("eoorWeight");
	}

	/**
	 * Get eoorVolume
	 */
	@Column(name = "EOOR_VOLUME")
	public Double getEoorVolume() {
		return eoorVolume;
	}

	/**
	 * Set eoorVolume
	 */
	public void setEoorVolume(Double eoorVolume) {
		this.eoorVolume = eoorVolume;
		addValidField("eoorVolume");
	}

	/**
	 * Get eoorQuantity
	 */
	@Column(name = "EOOR_QUANTITY")
	public Double getEoorQuantity() {
		return eoorQuantity;
	}

	/**
	 * Set eoorQuantity
	 */
	public void setEoorQuantity(Double eoorQuantity) {
		this.eoorQuantity = eoorQuantity;
		addValidField("eoorQuantity");
	}

	/**
	 * Get eoorQuantityUnit
	 */
	@Column(name = "EOOR_QUANTITY_UNIT")
	public String getEoorQuantityUnit() {
		return eoorQuantityUnit;
	}

	/**
	 * Set eoorQuantityUnit
	 */
	public void setEoorQuantityUnit(String eoorQuantityUnit) {
		this.eoorQuantityUnit = eoorQuantityUnit;
		addValidField("eoorQuantityUnit");
	}

	/**
	 * Get eoorNetWeight
	 */
	@Column(name = "EOOR_NET_WEIGHT")
	public Double getEoorNetWeight() {
		return eoorNetWeight;
	}

	/**
	 * Set eoorNetWeight
	 */
	public void setEoorNetWeight(Double eoorNetWeight) {
		this.eoorNetWeight = eoorNetWeight;
		addValidField("eoorNetWeight");
	}

	/**
	 * Get eoorReqDeliveryDate
	 */
	@Column(name = "EOOR_REQ_DELIVERY_DATE")
	public Date getEoorReqDeliveryDate() {
		return eoorReqDeliveryDate;
	}

	/**
	 * Set eoorReqDeliveryDate
	 */
	public void setEoorReqDeliveryDate(Date eoorReqDeliveryDate) {
		this.eoorReqDeliveryDate = eoorReqDeliveryDate;
		addValidField("eoorReqDeliveryDate");
	}

	/**
	 * Get eoorReqArrivalDate
	 */
	@Column(name = "EOOR_REQ_ARRIVAL_DATE")
	public Date getEoorReqArrivalDate() {
		return eoorReqArrivalDate;
	}

	/**
	 * Set eoorReqArrivalDate
	 */
	public void setEoorReqArrivalDate(Date eoorReqArrivalDate) {
		this.eoorReqArrivalDate = eoorReqArrivalDate;
		addValidField("eoorReqArrivalDate");
	}

	/**
	 * Get eoorDeliveryPeriod
	 */
	@Column(name = "EOOR_DELIVERY_PERIOD")
	public String getEoorDeliveryPeriod() {
		return eoorDeliveryPeriod;
	}

	/**
	 * Set eoorDeliveryPeriod
	 */
	public void setEoorDeliveryPeriod(String eoorDeliveryPeriod) {
		this.eoorDeliveryPeriod = eoorDeliveryPeriod;
		addValidField("eoorDeliveryPeriod");
	}

	/**
	 * Get eoorArrivalPeriod
	 */
	@Column(name = "EOOR_ARRIVAL_PERIOD")
	public String getEoorArrivalPeriod() {
		return eoorArrivalPeriod;
	}

	/**
	 * Set eoorArrivalPeriod
	 */
	public void setEoorArrivalPeriod(String eoorArrivalPeriod) {
		this.eoorArrivalPeriod = eoorArrivalPeriod;
		addValidField("eoorArrivalPeriod");
	}

	/**
	 * Get eoorShipperEbspId
	 */
	@Column(name = "EOOR_SHIPPER_EBSP_ID")
	public Long getEoorShipperEbspId() {
		return eoorShipperEbspId;
	}

	/**
	 * Set eoorShipperEbspId
	 */
	public void setEoorShipperEbspId(Long eoorShipperEbspId) {
		this.eoorShipperEbspId = eoorShipperEbspId;
		addValidField("eoorShipperEbspId");
	}

	/**
	 * Get eoorShipperEbspNameCn
	 */
	@Column(name = "EOOR_SHIPPER_EBSP_NAME_CN")
	public String getEoorShipperEbspNameCn() {
		return eoorShipperEbspNameCn;
	}

	/**
	 * Set eoorShipperEbspNameCn
	 */
	public void setEoorShipperEbspNameCn(String eoorShipperEbspNameCn) {
		this.eoorShipperEbspNameCn = eoorShipperEbspNameCn;
		addValidField("eoorShipperEbspNameCn");
	}

	/**
	 * Get eoorShipperEbsaPost
	 */
	@Column(name = "EOOR_SHIPPER_EBSA_POST")
	public String getEoorShipperEbsaPost() {
		return eoorShipperEbsaPost;
	}

	/**
	 * Set eoorShipperEbsaPost
	 */
	public void setEoorShipperEbsaPost(String eoorShipperEbsaPost) {
		this.eoorShipperEbsaPost = eoorShipperEbsaPost;
		addValidField("eoorShipperEbsaPost");
	}

	/**
	 * Get eoorShipperEbsaContact
	 */
	@Column(name = "EOOR_SHIPPER_EBSA_CONTACT")
	public String getEoorShipperEbsaContact() {
		return eoorShipperEbsaContact;
	}

	/**
	 * Set eoorShipperEbsaContact
	 */
	public void setEoorShipperEbsaContact(String eoorShipperEbsaContact) {
		this.eoorShipperEbsaContact = eoorShipperEbsaContact;
		addValidField("eoorShipperEbsaContact");
	}

	/**
	 * Get eoorShipperEbsaTel
	 */
	@Column(name = "EOOR_SHIPPER_EBSA_TEL")
	public String getEoorShipperEbsaTel() {
		return eoorShipperEbsaTel;
	}

	/**
	 * Set eoorShipperEbsaTel
	 */
	public void setEoorShipperEbsaTel(String eoorShipperEbsaTel) {
		this.eoorShipperEbsaTel = eoorShipperEbsaTel;
		addValidField("eoorShipperEbsaTel");
	}

	/**
	 * Get eoorShipperEbsaId
	 */
	@Column(name = "EOOR_SHIPPER_EBSA_ID")
	public Long getEoorShipperEbsaId() {
		return eoorShipperEbsaId;
	}

	/**
	 * Set eoorShipperEbsaId
	 */
	public void setEoorShipperEbsaId(Long eoorShipperEbsaId) {
		this.eoorShipperEbsaId = eoorShipperEbsaId;
		addValidField("eoorShipperEbsaId");
	}

	/**
	 * Get eoorShipperEbsaAddress
	 */
	@Column(name = "EOOR_SHIPPER_EBSA_ADDRESS")
	public String getEoorShipperEbsaAddress() {
		return eoorShipperEbsaAddress;
	}

	/**
	 * Set eoorShipperEbsaAddress
	 */
	public void setEoorShipperEbsaAddress(String eoorShipperEbsaAddress) {
		this.eoorShipperEbsaAddress = eoorShipperEbsaAddress;
		addValidField("eoorShipperEbsaAddress");
	}

	/**
	 * Get eoorShipperEbrgId
	 */
	@Column(name = "EOOR_SHIPPER_EBRG_ID")
	public Long getEoorShipperEbrgId() {
		return eoorShipperEbrgId;
	}

	/**
	 * Set eoorShipperEbrgId
	 */
	public void setEoorShipperEbrgId(Long eoorShipperEbrgId) {
		this.eoorShipperEbrgId = eoorShipperEbrgId;
		addValidField("eoorShipperEbrgId");
	}

	/**
	 * Get eoorShipperEbrgNameCn
	 */
	@Column(name = "EOOR_SHIPPER_EBRG_NAME_CN")
	public String getEoorShipperEbrgNameCn() {
		return eoorShipperEbrgNameCn;
	}

	/**
	 * Set eoorShipperEbrgNameCn
	 */
	public void setEoorShipperEbrgNameCn(String eoorShipperEbrgNameCn) {
		this.eoorShipperEbrgNameCn = eoorShipperEbrgNameCn;
		addValidField("eoorShipperEbrgNameCn");
	}

	/**
	 * Get eoorShipperEbplId
	 */
	@Column(name = "EOOR_SHIPPER_EBPL_ID")
	public Long getEoorShipperEbplId() {
		return eoorShipperEbplId;
	}

	/**
	 * Set eoorShipperEbplId
	 */
	public void setEoorShipperEbplId(Long eoorShipperEbplId) {
		this.eoorShipperEbplId = eoorShipperEbplId;
		addValidField("eoorShipperEbplId");
	}

	/**
	 * Get eoorShipperEbplNameCn
	 */
	@Column(name = "EOOR_SHIPPER_EBPL_NAME_CN")
	public String getEoorShipperEbplNameCn() {
		return eoorShipperEbplNameCn;
	}

	/**
	 * Set eoorShipperEbplNameCn
	 */
	public void setEoorShipperEbplNameCn(String eoorShipperEbplNameCn) {
		this.eoorShipperEbplNameCn = eoorShipperEbplNameCn;
		addValidField("eoorShipperEbplNameCn");
	}

	/**
	 * Get eoorConsigneeEbspId
	 */
	@Column(name = "EOOR_CONSIGNEE_EBSP_ID")
	public Long getEoorConsigneeEbspId() {
		return eoorConsigneeEbspId;
	}

	/**
	 * Set eoorConsigneeEbspId
	 */
	public void setEoorConsigneeEbspId(Long eoorConsigneeEbspId) {
		this.eoorConsigneeEbspId = eoorConsigneeEbspId;
		addValidField("eoorConsigneeEbspId");
	}

	/**
	 * Get eoorConsigneeEbspNameCn
	 */
	@Column(name = "EOOR_CONSIGNEE_EBSP_NAME_CN")
	public String getEoorConsigneeEbspNameCn() {
		return eoorConsigneeEbspNameCn;
	}

	/**
	 * Set eoorConsigneeEbspNameCn
	 */
	public void setEoorConsigneeEbspNameCn(String eoorConsigneeEbspNameCn) {
		this.eoorConsigneeEbspNameCn = eoorConsigneeEbspNameCn;
		addValidField("eoorConsigneeEbspNameCn");
	}

	/**
	 * Get eoorConsigneeEbsaPost
	 */
	@Column(name = "EOOR_CONSIGNEE_EBSA_POST")
	public String getEoorConsigneeEbsaPost() {
		return eoorConsigneeEbsaPost;
	}

	/**
	 * Set eoorConsigneeEbsaPost
	 */
	public void setEoorConsigneeEbsaPost(String eoorConsigneeEbsaPost) {
		this.eoorConsigneeEbsaPost = eoorConsigneeEbsaPost;
		addValidField("eoorConsigneeEbsaPost");
	}

	/**
	 * Get eoorConsigneeEbsaContact
	 */
	@Column(name = "EOOR_CONSIGNEE_EBSA_CONTACT")
	public String getEoorConsigneeEbsaContact() {
		return eoorConsigneeEbsaContact;
	}

	/**
	 * Set eoorConsigneeEbsaContact
	 */
	public void setEoorConsigneeEbsaContact(String eoorConsigneeEbsaContact) {
		this.eoorConsigneeEbsaContact = eoorConsigneeEbsaContact;
		addValidField("eoorConsigneeEbsaContact");
	}

	/**
	 * Get eoorConsigneeEbsaTel
	 */
	@Column(name = "EOOR_CONSIGNEE_EBSA_TEL")
	public String getEoorConsigneeEbsaTel() {
		return eoorConsigneeEbsaTel;
	}

	/**
	 * Set eoorConsigneeEbsaTel
	 */
	public void setEoorConsigneeEbsaTel(String eoorConsigneeEbsaTel) {
		this.eoorConsigneeEbsaTel = eoorConsigneeEbsaTel;
		addValidField("eoorConsigneeEbsaTel");
	}

	/**
	 * Get eoorConsigneeEbsaId
	 */
	@Column(name = "EOOR_CONSIGNEE_EBSA_ID")
	public Long getEoorConsigneeEbsaId() {
		return eoorConsigneeEbsaId;
	}

	/**
	 * Set eoorConsigneeEbsaId
	 */
	public void setEoorConsigneeEbsaId(Long eoorConsigneeEbsaId) {
		this.eoorConsigneeEbsaId = eoorConsigneeEbsaId;
		addValidField("eoorConsigneeEbsaId");
	}

	/**
	 * Get eoorConsigneeEbsaAddress
	 */
	@Column(name = "EOOR_CONSIGNEE_EBSA_ADDRESS")
	public String getEoorConsigneeEbsaAddress() {
		return eoorConsigneeEbsaAddress;
	}

	/**
	 * Set eoorConsigneeEbsaAddress
	 */
	public void setEoorConsigneeEbsaAddress(String eoorConsigneeEbsaAddress) {
		this.eoorConsigneeEbsaAddress = eoorConsigneeEbsaAddress;
		addValidField("eoorConsigneeEbsaAddress");
	}

	/**
	 * Get eoorConsigneeEbrgId
	 */
	@Column(name = "EOOR_CONSIGNEE_EBRG_ID")
	public Long getEoorConsigneeEbrgId() {
		return eoorConsigneeEbrgId;
	}

	/**
	 * Set eoorConsigneeEbrgId
	 */
	public void setEoorConsigneeEbrgId(Long eoorConsigneeEbrgId) {
		this.eoorConsigneeEbrgId = eoorConsigneeEbrgId;
		addValidField("eoorConsigneeEbrgId");
	}

	/**
	 * Get eoorConsigneeEbrgNameCn
	 */
	@Column(name = "EOOR_CONSIGNEE_EBRG_NAME_CN")
	public String getEoorConsigneeEbrgNameCn() {
		return eoorConsigneeEbrgNameCn;
	}

	/**
	 * Set eoorConsigneeEbrgNameCn
	 */
	public void setEoorConsigneeEbrgNameCn(String eoorConsigneeEbrgNameCn) {
		this.eoorConsigneeEbrgNameCn = eoorConsigneeEbrgNameCn;
		addValidField("eoorConsigneeEbrgNameCn");
	}

	/**
	 * Get eoorConsigneeEbplId
	 */
	@Column(name = "EOOR_CONSIGNEE_EBPL_ID")
	public Long getEoorConsigneeEbplId() {
		return eoorConsigneeEbplId;
	}

	/**
	 * Set eoorConsigneeEbplId
	 */
	public void setEoorConsigneeEbplId(Long eoorConsigneeEbplId) {
		this.eoorConsigneeEbplId = eoorConsigneeEbplId;
		addValidField("eoorConsigneeEbplId");
	}

	/**
	 * Get eoorConsigneeEbplNameCn
	 */
	@Column(name = "EOOR_CONSIGNEE_EBPL_NAME_CN")
	public String getEoorConsigneeEbplNameCn() {
		return eoorConsigneeEbplNameCn;
	}

	/**
	 * Set eoorConsigneeEbplNameCn
	 */
	public void setEoorConsigneeEbplNameCn(String eoorConsigneeEbplNameCn) {
		this.eoorConsigneeEbplNameCn = eoorConsigneeEbplNameCn;
		addValidField("eoorConsigneeEbplNameCn");
	}

	/**
	 * Get eoorTransReq
	 */
	@Column(name = "EOOR_TRANS_REQ")
	public String getEoorTransReq() {
		return eoorTransReq;
	}

	/**
	 * Set eoorTransReq
	 */
	public void setEoorTransReq(String eoorTransReq) {
		this.eoorTransReq = eoorTransReq;
		addValidField("eoorTransReq");
	}

	/**
	 * Get eoorConsigneeReq
	 */
	@Column(name = "EOOR_CONSIGNEE_REQ")
	public String getEoorConsigneeReq() {
		return eoorConsigneeReq;
	}

	/**
	 * Set eoorConsigneeReq
	 */
	public void setEoorConsigneeReq(String eoorConsigneeReq) {
		this.eoorConsigneeReq = eoorConsigneeReq;
		addValidField("eoorConsigneeReq");
	}

	/**
	 * Get eoorDocReq
	 */
	@Column(name = "EOOR_DOC_REQ")
	public String getEoorDocReq() {
		return eoorDocReq;
	}

	/**
	 * Set eoorDocReq
	 */
	public void setEoorDocReq(String eoorDocReq) {
		this.eoorDocReq = eoorDocReq;
		addValidField("eoorDocReq");
	}

	/**
	 * Get eoorRemark
	 */
	@Column(name = "EOOR_REMARK")
	public String getEoorRemark() {
		return eoorRemark;
	}

	/**
	 * Set eoorRemark
	 */
	public void setEoorRemark(String eoorRemark) {
		this.eoorRemark = eoorRemark;
		addValidField("eoorRemark");
	}

	/**
	 * Get eoorVoidDesc
	 */
	@Column(name = "EOOR_VOID_DESC")
	public String getEoorVoidDesc() {
		return eoorVoidDesc;
	}

	/**
	 * Set eoorVoidDesc
	 */
	public void setEoorVoidDesc(String eoorVoidDesc) {
		this.eoorVoidDesc = eoorVoidDesc;
		addValidField("eoorVoidDesc");
	}

	/**
	 * Get eoorVoider
	 */
	@Column(name = "EOOR_VOIDER")
	public String getEoorVoider() {
		return eoorVoider;
	}

	/**
	 * Set eoorVoider
	 */
	public void setEoorVoider(String eoorVoider) {
		this.eoorVoider = eoorVoider;
		addValidField("eoorVoider");
	}

	/**
	 * Get eoorVoiderTime
	 */
	@Column(name = "EOOR_VOIDER_TIME")
	public Date getEoorVoiderTime() {
		return eoorVoiderTime;
	}

	/**
	 * Set eoorVoiderTime
	 */
	public void setEoorVoiderTime(Date eoorVoiderTime) {
		this.eoorVoiderTime = eoorVoiderTime;
		addValidField("eoorVoiderTime");
	}

	/**
	 * Get eoorScheduleId
	 */
	@Column(name = "EOOR_SCHEDULE_ID")
	public Long getEoorScheduleId() {
		return eoorScheduleId;
	}

	/**
	 * Set eoorScheduleId
	 */
	public void setEoorScheduleId(Long eoorScheduleId) {
		this.eoorScheduleId = eoorScheduleId;
		addValidField("eoorScheduleId");
	}

	/**
	 * Get eoorScheduleName
	 */
	@Column(name = "EOOR_SCHEDULE_NAME")
	public String getEoorScheduleName() {
		return eoorScheduleName;
	}

	/**
	 * Set eoorScheduleName
	 */
	public void setEoorScheduleName(String eoorScheduleName) {
		this.eoorScheduleName = eoorScheduleName;
		addValidField("eoorScheduleName");
	}

	/**
	 * Get eoorRalationId
	 */
	@Column(name = "EOOR_RALATION_ID")
	public Long getEoorRalationId() {
		return eoorRalationId;
	}

	/**
	 * Set eoorRalationId
	 */
	public void setEoorRalationId(Long eoorRalationId) {
		this.eoorRalationId = eoorRalationId;
		addValidField("eoorRalationId");
	}

	/**
	 * Get eoorRalationSoNo
	 */
	@Column(name = "EOOR_RALATION_SO_NO")
	public String getEoorRalationSoNo() {
		return eoorRalationSoNo;
	}

	/**
	 * Set eoorRalationSoNo
	 */
	public void setEoorRalationSoNo(String eoorRalationSoNo) {
		this.eoorRalationSoNo = eoorRalationSoNo;
		addValidField("eoorRalationSoNo");
	}

	/**
	 * Get eoorTheirPlate
	 */
	@Column(name = "EOOR_THEIR_PLATE")
	public String getEoorTheirPlate() {
		return eoorTheirPlate;
	}

	/**
	 * Set eoorTheirPlate
	 */
	public void setEoorTheirPlate(String eoorTheirPlate) {
		this.eoorTheirPlate = eoorTheirPlate;
		addValidField("eoorTheirPlate");
	}

	/**
	 * Get eoorTotalIncome
	 */
	@Column(name = "EOOR_TOTAL_INCOME")
	public Long getEoorTotalIncome() {
		return eoorTotalIncome;
	}

	/**
	 * Set eoorTotalIncome
	 */
	public void setEoorTotalIncome(Long eoorTotalIncome) {
		this.eoorTotalIncome = eoorTotalIncome;
		addValidField("eoorTotalIncome");
	}

	/**
	 * Get eoorDataSource
	 */
	@Column(name = "EOOR_DATA_SOURCE")
	public String getEoorDataSource() {
		return eoorDataSource;
	}

	/**
	 * Set eoorDataSource
	 */
	public void setEoorDataSource(String eoorDataSource) {
		this.eoorDataSource = eoorDataSource;
		addValidField("eoorDataSource");
	}

	/**
	 * Get eoorMessageName
	 */
	@Column(name = "EOOR_MESSAGE_NAME")
	public String getEoorMessageName() {
		return eoorMessageName;
	}

	/**
	 * Set eoorMessageName
	 */
	public void setEoorMessageName(String eoorMessageName) {
		this.eoorMessageName = eoorMessageName;
		addValidField("eoorMessageName");
	}

	/**
	 * Get eoorOriSingleNo
	 */
	@Column(name = "EOOR_ORI_SINGLE_NO")
	public String getEoorOriSingleNo() {
		return eoorOriSingleNo;
	}

	/**
	 * Set eoorOriSingleNo
	 */
	public void setEoorOriSingleNo(String eoorOriSingleNo) {
		this.eoorOriSingleNo = eoorOriSingleNo;
		addValidField("eoorOriSingleNo");
	}

	/**
	 * Get eoorCreatorName
	 */
	@Column(name = "EOOR_CREATOR_NAME")
	public String getEoorCreatorName() {
		return eoorCreatorName;
	}

	/**
	 * Set eoorCreatorName
	 */
	public void setEoorCreatorName(String eoorCreatorName) {
		this.eoorCreatorName = eoorCreatorName;
		addValidField("eoorCreatorName");
	}

	/**
	 * Get eoorCreatorEmail
	 */
	@Column(name = "EOOR_CREATOR_EMAIL")
	public String getEoorCreatorEmail() {
		return eoorCreatorEmail;
	}

	/**
	 * Set eoorCreatorEmail
	 */
	public void setEoorCreatorEmail(String eoorCreatorEmail) {
		this.eoorCreatorEmail = eoorCreatorEmail;
		addValidField("eoorCreatorEmail");
	}

	/**
	 * Get eoorCreatorTel
	 */
	@Column(name = "EOOR_CREATOR_TEL")
	public String getEoorCreatorTel() {
		return eoorCreatorTel;
	}

	/**
	 * Set eoorCreatorTel
	 */
	public void setEoorCreatorTel(String eoorCreatorTel) {
		this.eoorCreatorTel = eoorCreatorTel;
		addValidField("eoorCreatorTel");
	}

	/**
	 * Get eoorSubstr1
	 */
	@Column(name = "EOOR_SUBSTR1")
	public String getEoorSubstr1() {
		return eoorSubstr1;
	}

	/**
	 * Set eoorSubstr1
	 */
	public void setEoorSubstr1(String eoorSubstr1) {
		this.eoorSubstr1 = eoorSubstr1;
		addValidField("eoorSubstr1");
	}

	/**
	 * Get eoorSubstr2
	 */
	@Column(name = "EOOR_SUBSTR2")
	public String getEoorSubstr2() {
		return eoorSubstr2;
	}

	/**
	 * Set eoorSubstr2
	 */
	public void setEoorSubstr2(String eoorSubstr2) {
		this.eoorSubstr2 = eoorSubstr2;
		addValidField("eoorSubstr2");
	}

	/**
	 * Get eoorSubstr3
	 */
	@Column(name = "EOOR_SUBSTR3")
	public String getEoorSubstr3() {
		return eoorSubstr3;
	}

	/**
	 * Set eoorSubstr3
	 */
	public void setEoorSubstr3(String eoorSubstr3) {
		this.eoorSubstr3 = eoorSubstr3;
		addValidField("eoorSubstr3");
	}

	/**
	 * Get eoorSubstr4
	 */
	@Column(name = "EOOR_SUBSTR4")
	public String getEoorSubstr4() {
		return eoorSubstr4;
	}

	/**
	 * Set eoorSubstr4
	 */
	public void setEoorSubstr4(String eoorSubstr4) {
		this.eoorSubstr4 = eoorSubstr4;
		addValidField("eoorSubstr4");
	}

	/**
	 * Get eoorSubstr5
	 */
	@Column(name = "EOOR_SUBSTR5")
	public String getEoorSubstr5() {
		return eoorSubstr5;
	}

	/**
	 * Set eoorSubstr5
	 */
	public void setEoorSubstr5(String eoorSubstr5) {
		this.eoorSubstr5 = eoorSubstr5;
		addValidField("eoorSubstr5");
	}

	/**
	 * Get eoorSubstr6
	 */
	@Column(name = "EOOR_SUBSTR6")
	public String getEoorSubstr6() {
		return eoorSubstr6;
	}

	/**
	 * Set eoorSubstr6
	 */
	public void setEoorSubstr6(String eoorSubstr6) {
		this.eoorSubstr6 = eoorSubstr6;
		addValidField("eoorSubstr6");
	}

	/**
	 * Get eoorSubstr7
	 */
	@Column(name = "EOOR_SUBSTR7")
	public String getEoorSubstr7() {
		return eoorSubstr7;
	}

	/**
	 * Set eoorSubstr7
	 */
	public void setEoorSubstr7(String eoorSubstr7) {
		this.eoorSubstr7 = eoorSubstr7;
		addValidField("eoorSubstr7");
	}

	/**
	 * Get eoorSubstr8
	 */
	@Column(name = "EOOR_SUBSTR8")
	public String getEoorSubstr8() {
		return eoorSubstr8;
	}

	/**
	 * Set eoorSubstr8
	 */
	public void setEoorSubstr8(String eoorSubstr8) {
		this.eoorSubstr8 = eoorSubstr8;
		addValidField("eoorSubstr8");
	}

	/**
	 * Get eoorSubdate1
	 */
	@Column(name = "EOOR_SUBDATE1")
	public Date getEoorSubdate1() {
		return eoorSubdate1;
	}

	/**
	 * Set eoorSubdate1
	 */
	public void setEoorSubdate1(Date eoorSubdate1) {
		this.eoorSubdate1 = eoorSubdate1;
		addValidField("eoorSubdate1");
	}

	/**
	 * Get eoorSubdate2
	 */
	@Column(name = "EOOR_SUBDATE2")
	public Date getEoorSubdate2() {
		return eoorSubdate2;
	}

	/**
	 * Set eoorSubdate2
	 */
	public void setEoorSubdate2(Date eoorSubdate2) {
		this.eoorSubdate2 = eoorSubdate2;
		addValidField("eoorSubdate2");
	}

	/**
	 * Get eoorSubdate3
	 */
	@Column(name = "EOOR_SUBDATE3")
	public Date getEoorSubdate3() {
		return eoorSubdate3;
	}

	/**
	 * Set eoorSubdate3
	 */
	public void setEoorSubdate3(Date eoorSubdate3) {
		this.eoorSubdate3 = eoorSubdate3;
		addValidField("eoorSubdate3");
	}

	/**
	 * Get eoorSubdate4
	 */
	@Column(name = "EOOR_SUBDATE4")
	public Date getEoorSubdate4() {
		return eoorSubdate4;
	}

	/**
	 * Set eoorSubdate4
	 */
	public void setEoorSubdate4(Date eoorSubdate4) {
		this.eoorSubdate4 = eoorSubdate4;
		addValidField("eoorSubdate4");
	}

	/**
	 * Get eoorSubnum1
	 */
	@Column(name = "EOOR_SUBNUM1")
	public Long getEoorSubnum1() {
		return eoorSubnum1;
	}

	/**
	 * Set eoorSubnum1
	 */
	public void setEoorSubnum1(Long eoorSubnum1) {
		this.eoorSubnum1 = eoorSubnum1;
		addValidField("eoorSubnum1");
	}

	/**
	 * Get eoorSubnum2
	 */
	@Column(name = "EOOR_SUBNUM2")
	public Long getEoorSubnum2() {
		return eoorSubnum2;
	}

	/**
	 * Set eoorSubnum2
	 */
	public void setEoorSubnum2(Long eoorSubnum2) {
		this.eoorSubnum2 = eoorSubnum2;
		addValidField("eoorSubnum2");
	}

	/**
	 * Get eoorSubnum3
	 */
	@Column(name = "EOOR_SUBNUM3")
	public Long getEoorSubnum3() {
		return eoorSubnum3;
	}

	/**
	 * Set eoorSubnum3
	 */
	public void setEoorSubnum3(Long eoorSubnum3) {
		this.eoorSubnum3 = eoorSubnum3;
		addValidField("eoorSubnum3");
	}

	/**
	 * Get eoorSubnum4
	 */
	@Column(name = "EOOR_SUBNUM4")
	public Long getEoorSubnum4() {
		return eoorSubnum4;
	}

	/**
	 * Set eoorSubnum4
	 */
	public void setEoorSubnum4(Long eoorSubnum4) {
		this.eoorSubnum4 = eoorSubnum4;
		addValidField("eoorSubnum4");
	}

	/**
	 * Get recVer
	 */
	@Column(name = "REC_VER")
	@Version
	public Long getRecVer() {
		return recVer;
	}

	/**
	 * Set recVer
	 */
	public void setRecVer(Long recVer) {
		this.recVer = recVer;
		addValidField("recVer");
	}

	/**
	 * Get creator
	 */
	@Column(name = "CREATOR")
	public String getCreator() {
		return creator;
	}

	/**
	 * Set creator
	 */
	public void setCreator(String creator) {
		this.creator = creator;
		addValidField("creator");
	}

	/**
	 * Get createTime
	 */
	@Column(name = "CREATE_TIME")
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * Set createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
		addValidField("createTime");
	}

	/**
	 * Get modifier
	 */
	@Column(name = "MODIFIER")
	public String getModifier() {
		return modifier;
	}

	/**
	 * Set modifier
	 */
	public void setModifier(String modifier) {
		this.modifier = modifier;
		addValidField("modifier");
	}

	/**
	 * Get modifyTime
	 */
	@Column(name = "MODIFY_TIME")
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * Set modifyTime
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
		addValidField("modifyTime");
	}

	/**
	 * Get eoorSubstr9
	 */
	@Column(name = "EOOR_SUBSTR9")
	public String getEoorSubstr9() {
		return eoorSubstr9;
	}

	/**
	 * Set eoorSubstr9
	 */
	public void setEoorSubstr9(String eoorSubstr9) {
		this.eoorSubstr9 = eoorSubstr9;
		addValidField("eoorSubstr9");
	}

	/**
	 * Get eoorSubstr10
	 */
	@Column(name = "EOOR_SUBSTR10")
	public String getEoorSubstr10() {
		return eoorSubstr10;
	}

	/**
	 * Set eoorSubstr10
	 */
	public void setEoorSubstr10(String eoorSubstr10) {
		this.eoorSubstr10 = eoorSubstr10;
		addValidField("eoorSubstr10");
	}

	/**
	 * Get eoorSubstr11
	 */
	@Column(name = "EOOR_SUBSTR11")
	public String getEoorSubstr11() {
		return eoorSubstr11;
	}

	/**
	 * Set eoorSubstr11
	 */
	public void setEoorSubstr11(String eoorSubstr11) {
		this.eoorSubstr11 = eoorSubstr11;
		addValidField("eoorSubstr11");
	}

	/**
	 * Get eoorSubstr12
	 */
	@Column(name = "EOOR_SUBSTR12")
	public String getEoorSubstr12() {
		return eoorSubstr12;
	}

	/**
	 * Set eoorSubstr12
	 */
	public void setEoorSubstr12(String eoorSubstr12) {
		this.eoorSubstr12 = eoorSubstr12;
		addValidField("eoorSubstr12");
	}

	/**
	 * Get eoorSubstr13
	 */
	@Column(name = "EOOR_SUBSTR13")
	public String getEoorSubstr13() {
		return eoorSubstr13;
	}

	/**
	 * Set eoorSubstr13
	 */
	public void setEoorSubstr13(String eoorSubstr13) {
		this.eoorSubstr13 = eoorSubstr13;
		addValidField("eoorSubstr13");
	}

	/**
	 * Get eoorSubstr14
	 */
	@Column(name = "EOOR_SUBSTR14")
	public String getEoorSubstr14() {
		return eoorSubstr14;
	}

	/**
	 * Set eoorSubstr14
	 */
	public void setEoorSubstr14(String eoorSubstr14) {
		this.eoorSubstr14 = eoorSubstr14;
		addValidField("eoorSubstr14");
	}

	/**
	 * Get eoorSubstr15
	 */
	@Column(name = "EOOR_SUBSTR15")
	public String getEoorSubstr15() {
		return eoorSubstr15;
	}

	/**
	 * Set eoorSubstr15
	 */
	public void setEoorSubstr15(String eoorSubstr15) {
		this.eoorSubstr15 = eoorSubstr15;
		addValidField("eoorSubstr15");
	}

	/**
	 * Get eoorSubstr16
	 */
	@Column(name = "EOOR_SUBSTR16")
	public String getEoorSubstr16() {
		return eoorSubstr16;
	}

	/**
	 * Set eoorSubstr16
	 */
	public void setEoorSubstr16(String eoorSubstr16) {
		this.eoorSubstr16 = eoorSubstr16;
		addValidField("eoorSubstr16");
	}

	/**
	 * Get eoorSubstr17
	 */
	@Column(name = "EOOR_SUBSTR17")
	public String getEoorSubstr17() {
		return eoorSubstr17;
	}

	/**
	 * Set eoorSubstr17
	 */
	public void setEoorSubstr17(String eoorSubstr17) {
		this.eoorSubstr17 = eoorSubstr17;
		addValidField("eoorSubstr17");
	}

	/**
	 * Get eoorSubstr18
	 */
	@Column(name = "EOOR_SUBSTR18")
	public String getEoorSubstr18() {
		return eoorSubstr18;
	}

	/**
	 * Set eoorSubstr18
	 */
	public void setEoorSubstr18(String eoorSubstr18) {
		this.eoorSubstr18 = eoorSubstr18;
		addValidField("eoorSubstr18");
	}

	/**
	 * Get eoorSubstr19
	 */
	@Column(name = "EOOR_SUBSTR19")
	public String getEoorSubstr19() {
		return eoorSubstr19;
	}

	/**
	 * Set eoorSubstr19
	 */
	public void setEoorSubstr19(String eoorSubstr19) {
		this.eoorSubstr19 = eoorSubstr19;
		addValidField("eoorSubstr19");
	}

	/**
	 * Get eoorSubstr20
	 */
	@Column(name = "EOOR_SUBSTR20")
	public String getEoorSubstr20() {
		return eoorSubstr20;
	}

	/**
	 * Set eoorSubstr20
	 */
	public void setEoorSubstr20(String eoorSubstr20) {
		this.eoorSubstr20 = eoorSubstr20;
		addValidField("eoorSubstr20");
	}

	/**
	 * Get eoorSubstr21
	 */
	@Column(name = "EOOR_SUBSTR21")
	public String getEoorSubstr21() {
		return eoorSubstr21;
	}

	/**
	 * Set eoorSubstr21
	 */
	public void setEoorSubstr21(String eoorSubstr21) {
		this.eoorSubstr21 = eoorSubstr21;
		addValidField("eoorSubstr21");
	}

	/**
	 * Get eoorSubstr22
	 */
	@Column(name = "EOOR_SUBSTR22")
	public String getEoorSubstr22() {
		return eoorSubstr22;
	}

	/**
	 * Set eoorSubstr22
	 */
	public void setEoorSubstr22(String eoorSubstr22) {
		this.eoorSubstr22 = eoorSubstr22;
		addValidField("eoorSubstr22");
	}

	/**
	 * Get eoorSubstr23
	 */
	@Column(name = "EOOR_SUBSTR23")
	public String getEoorSubstr23() {
		return eoorSubstr23;
	}

	/**
	 * Set eoorSubstr23
	 */
	public void setEoorSubstr23(String eoorSubstr23) {
		this.eoorSubstr23 = eoorSubstr23;
		addValidField("eoorSubstr23");
	}

	/**
	 * Get eoorSubstr24
	 */
	@Column(name = "EOOR_SUBSTR24")
	public String getEoorSubstr24() {
		return eoorSubstr24;
	}

	/**
	 * Set eoorSubstr24
	 */
	public void setEoorSubstr24(String eoorSubstr24) {
		this.eoorSubstr24 = eoorSubstr24;
		addValidField("eoorSubstr24");
	}

	/**
	 * Get eoorSubstr25
	 */
	@Column(name = "EOOR_SUBSTR25")
	public String getEoorSubstr25() {
		return eoorSubstr25;
	}

	/**
	 * Set eoorSubstr25
	 */
	public void setEoorSubstr25(String eoorSubstr25) {
		this.eoorSubstr25 = eoorSubstr25;
		addValidField("eoorSubstr25");
	}

	/**
	 * Get eoorSubdate5
	 */
	@Column(name = "EOOR_SUBDATE5")
	public Date getEoorSubdate5() {
		return eoorSubdate5;
	}

	/**
	 * Set eoorSubdate5
	 */
	public void setEoorSubdate5(Date eoorSubdate5) {
		this.eoorSubdate5 = eoorSubdate5;
		addValidField("eoorSubdate5");
	}

	/**
	 * Get eoorSubdate6
	 */
	@Column(name = "EOOR_SUBDATE6")
	public Date getEoorSubdate6() {
		return eoorSubdate6;
	}

	/**
	 * Set eoorSubdate6
	 */
	public void setEoorSubdate6(Date eoorSubdate6) {
		this.eoorSubdate6 = eoorSubdate6;
		addValidField("eoorSubdate6");
	}

	/**
	 * Get eoorSubnum5
	 */
	@Column(name = "EOOR_SUBNUM5")
	public Long getEoorSubnum5() {
		return eoorSubnum5;
	}

	/**
	 * Set eoorSubnum5
	 */
	public void setEoorSubnum5(Long eoorSubnum5) {
		this.eoorSubnum5 = eoorSubnum5;
		addValidField("eoorSubnum5");
	}

	/**
	 * Get eoorSubnum6
	 */
	@Column(name = "EOOR_SUBNUM6")
	public Long getEoorSubnum6() {
		return eoorSubnum6;
	}

	/**
	 * Set eoorSubnum6
	 */
	public void setEoorSubnum6(Long eoorSubnum6) {
		this.eoorSubnum6 = eoorSubnum6;
		addValidField("eoorSubnum6");
	}

	/**
	 * Get eoorType
	 */
	@Column(name = "EOOR_TYPE")
	public String getEoorType() {
		return eoorType;
	}

	/**
	 * Set eoorType
	 */
	public void setEoorType(String eoorType) {
		this.eoorType = eoorType;
		addValidField("eoorType");
	}

	/**
	 * Get eoorPrevStatus
	 */
	@Column(name = "EOOR_PREV_STATUS")
	public String getEoorPrevStatus() {
		return eoorPrevStatus;
	}

	/**
	 * Set eoorPrevStatus
	 */
	public void setEoorPrevStatus(String eoorPrevStatus) {
		this.eoorPrevStatus = eoorPrevStatus;
		addValidField("eoorPrevStatus");
	}

	/**
	 * Get eoorShipperEbspCode
	 */
	@Column(name = "EOOR_SHIPPER_EBSP_CODE")
	public String getEoorShipperEbspCode() {
		return eoorShipperEbspCode;
	}

	/**
	 * Set eoorShipperEbspCode
	 */
	public void setEoorShipperEbspCode(String eoorShipperEbspCode) {
		this.eoorShipperEbspCode = eoorShipperEbspCode;
		addValidField("eoorShipperEbspCode");
	}

	/**
	 * Get eoorConsigneeEbspCode
	 */
	@Column(name = "EOOR_CONSIGNEE_EBSP_CODE")
	public String getEoorConsigneeEbspCode() {
		return eoorConsigneeEbspCode;
	}

	/**
	 * Set eoorConsigneeEbspCode
	 */
	public void setEoorConsigneeEbspCode(String eoorConsigneeEbspCode) {
		this.eoorConsigneeEbspCode = eoorConsigneeEbspCode;
		addValidField("eoorConsigneeEbspCode");
	}

	/**
	 * Get eoorPrevPlanStatus
	 */
	@Column(name = "EOOR_PREV_PLAN_STATUS")
	public String getEoorPrevPlanStatus() {
		return eoorPrevPlanStatus;
	}

	/**
	 * Set eoorPrevPlanStatus
	 */
	public void setEoorPrevPlanStatus(String eoorPrevPlanStatus) {
		this.eoorPrevPlanStatus = eoorPrevPlanStatus;
		addValidField("eoorPrevPlanStatus");
	}

	/**
	 * Get eoorConsigneeEbrgNo
	 */
	@Column(name = "EOOR_CONSIGNEE_EBRG_NO")
	public String getEoorConsigneeEbrgNo() {
		return eoorConsigneeEbrgNo;
	}

	/**
	 * Set eoorConsigneeEbrgNo
	 */
	public void setEoorConsigneeEbrgNo(String eoorConsigneeEbrgNo) {
		this.eoorConsigneeEbrgNo = eoorConsigneeEbrgNo;
		addValidField("eoorConsigneeEbrgNo");
	}

	/**
	 * Get eoorShipperEbrgNo
	 */
	@Column(name = "EOOR_SHIPPER_EBRG_NO")
	public String getEoorShipperEbrgNo() {
		return eoorShipperEbrgNo;
	}

	/**
	 * Set eoorShipperEbrgNo
	 */
	public void setEoorShipperEbrgNo(String eoorShipperEbrgNo) {
		this.eoorShipperEbrgNo = eoorShipperEbrgNo;
		addValidField("eoorShipperEbrgNo");
	}

	/**
	 * Get eoorShipperEbsaFax
	 */
	@Column(name = "EOOR_SHIPPER_EBSA_FAX")
	public String getEoorShipperEbsaFax() {
		return eoorShipperEbsaFax;
	}

	/**
	 * Set eoorShipperEbsaFax
	 */
	public void setEoorShipperEbsaFax(String eoorShipperEbsaFax) {
		this.eoorShipperEbsaFax = eoorShipperEbsaFax;
		addValidField("eoorShipperEbsaFax");
	}

	/**
	 * Get eoorShipperEbsaEmail
	 */
	@Column(name = "EOOR_SHIPPER_EBSA_EMAIL")
	public String getEoorShipperEbsaEmail() {
		return eoorShipperEbsaEmail;
	}

	/**
	 * Set eoorShipperEbsaEmail
	 */
	public void setEoorShipperEbsaEmail(String eoorShipperEbsaEmail) {
		this.eoorShipperEbsaEmail = eoorShipperEbsaEmail;
		addValidField("eoorShipperEbsaEmail");
	}

	/**
	 * Get eoorConsigneeEbsaFax
	 */
	@Column(name = "EOOR_CONSIGNEE_EBSA_FAX")
	public String getEoorConsigneeEbsaFax() {
		return eoorConsigneeEbsaFax;
	}

	/**
	 * Set eoorConsigneeEbsaFax
	 */
	public void setEoorConsigneeEbsaFax(String eoorConsigneeEbsaFax) {
		this.eoorConsigneeEbsaFax = eoorConsigneeEbsaFax;
		addValidField("eoorConsigneeEbsaFax");
	}

	/**
	 * Get eoorConsigneeEbsaEmail
	 */
	@Column(name = "EOOR_CONSIGNEE_EBSA_EMAIL")
	public String getEoorConsigneeEbsaEmail() {
		return eoorConsigneeEbsaEmail;
	}

	/**
	 * Set eoorConsigneeEbsaEmail
	 */
	public void setEoorConsigneeEbsaEmail(String eoorConsigneeEbsaEmail) {
		this.eoorConsigneeEbsaEmail = eoorConsigneeEbsaEmail;
		addValidField("eoorConsigneeEbsaEmail");
	}

	/**
	 * Get eoorFCode
	 */
	@Column(name = "EOOR_F_CODE")
	public String getEoorFCode() {
		return eoorFCode;
	}

	/**
	 * Set eoorFCode
	 */
	public void setEoorFCode(String eoorFCode) {
		this.eoorFCode = eoorFCode;
		addValidField("eoorFCode");
	}

	/**
	 * Get eoorBmsEbbtCode
	 */
	@Column(name = "EOOR_BMS_EBBT_CODE")
	public String getEoorBmsEbbtCode() {
		return eoorBmsEbbtCode;
	}

	/**
	 * Set eoorBmsEbbtCode
	 */
	public void setEoorBmsEbbtCode(String eoorBmsEbbtCode) {
		this.eoorBmsEbbtCode = eoorBmsEbbtCode;
		addValidField("eoorBmsEbbtCode");
	}

	/**
	 * Get eoorBmsEbotCode
	 */
	@Column(name = "EOOR_BMS_EBOT_CODE")
	public String getEoorBmsEbotCode() {
		return eoorBmsEbotCode;
	}

	/**
	 * Set eoorBmsEbotCode
	 */
	public void setEoorBmsEbotCode(String eoorBmsEbotCode) {
		this.eoorBmsEbotCode = eoorBmsEbotCode;
		addValidField("eoorBmsEbotCode");
	}

	/**
	 * Get eoorBmsEsdeDepartmentCode
	 */
	@Column(name = "EOOR_BMS_ESDE_DEPARTMENT_CODE")
	public String getEoorBmsEsdeDepartmentCode() {
		return eoorBmsEsdeDepartmentCode;
	}

	/**
	 * Set eoorBmsEsdeDepartmentCode
	 */
	public void setEoorBmsEsdeDepartmentCode(String eoorBmsEsdeDepartmentCode) {
		this.eoorBmsEsdeDepartmentCode = eoorBmsEsdeDepartmentCode;
		addValidField("eoorBmsEsdeDepartmentCode");
	}

	/**
	 * Get eoorBmsEbsmCode
	 */
	@Column(name = "EOOR_BMS_EBSM_CODE")
	public String getEoorBmsEbsmCode() {
		return eoorBmsEbsmCode;
	}

	/**
	 * Set eoorBmsEbsmCode
	 */
	public void setEoorBmsEbsmCode(String eoorBmsEbsmCode) {
		this.eoorBmsEbsmCode = eoorBmsEbsmCode;
		addValidField("eoorBmsEbsmCode");
	}

	/**
	 * Get eoorBmsBusinessClass
	 */
	@Column(name = "EOOR_BMS_BUSINESS_CLASS")
	public String getEoorBmsBusinessClass() {
		return eoorBmsBusinessClass;
	}

	/**
	 * Set eoorBmsBusinessClass
	 */
	public void setEoorBmsBusinessClass(String eoorBmsBusinessClass) {
		this.eoorBmsBusinessClass = eoorBmsBusinessClass;
		addValidField("eoorBmsBusinessClass");
	}

	/**
	 * Get eoorBmsAEbcuCustomerNo
	 */
	@Column(name = "EOOR_BMS_A_EBCU_CUSTOMER_NO")
	public String getEoorBmsAEbcuCustomerNo() {
		return eoorBmsAEbcuCustomerNo;
	}

	/**
	 * Set eoorBmsAEbcuCustomerNo
	 */
	public void setEoorBmsAEbcuCustomerNo(String eoorBmsAEbcuCustomerNo) {
		this.eoorBmsAEbcuCustomerNo = eoorBmsAEbcuCustomerNo;
		addValidField("eoorBmsAEbcuCustomerNo");
	}

	/**
	 * Get eoorBmsSEbcuCustomerNo
	 */
	@Column(name = "EOOR_BMS_S_EBCU_CUSTOMER_NO")
	public String getEoorBmsSEbcuCustomerNo() {
		return eoorBmsSEbcuCustomerNo;
	}

	/**
	 * Set eoorBmsSEbcuCustomerNo
	 */
	public void setEoorBmsSEbcuCustomerNo(String eoorBmsSEbcuCustomerNo) {
		this.eoorBmsSEbcuCustomerNo = eoorBmsSEbcuCustomerNo;
		addValidField("eoorBmsSEbcuCustomerNo");
	}

	/**
	 * Get eoorBmsCargoType
	 */
	@Column(name = "EOOR_BMS_CARGO_TYPE")
	public String getEoorBmsCargoType() {
		return eoorBmsCargoType;
	}

	/**
	 * Set eoorBmsCargoType
	 */
	public void setEoorBmsCargoType(String eoorBmsCargoType) {
		this.eoorBmsCargoType = eoorBmsCargoType;
		addValidField("eoorBmsCargoType");
	}

	/**
	 * Get eoorCommerceType
	 */
	@Column(name = "EOOR_COMMERCE_TYPE")
	public String getEoorCommerceType() {
		return eoorCommerceType;
	}

	/**
	 * Set eoorCommerceType
	 */
	public void setEoorCommerceType(String eoorCommerceType) {
		this.eoorCommerceType = eoorCommerceType;
		addValidField("eoorCommerceType");
	}

	/**
	 * Get eoorBmsMonitorType
	 */
	@Column(name = "EOOR_BMS_MONITOR_TYPE")
	public String getEoorBmsMonitorType() {
		return eoorBmsMonitorType;
	}

	/**
	 * Set eoorBmsMonitorType
	 */
	public void setEoorBmsMonitorType(String eoorBmsMonitorType) {
		this.eoorBmsMonitorType = eoorBmsMonitorType;
		addValidField("eoorBmsMonitorType");
	}

	/**
	 * Get eoorBmsCountType
	 */
	@Column(name = "EOOR_BMS_COUNT_TYPE")
	public String getEoorBmsCountType() {
		return eoorBmsCountType;
	}

	/**
	 * Set eoorBmsCountType
	 */
	public void setEoorBmsCountType(String eoorBmsCountType) {
		this.eoorBmsCountType = eoorBmsCountType;
		addValidField("eoorBmsCountType");
	}

	/**
	 * Get eoorBmsAcmpTime
	 */
	@Column(name = "EOOR_BMS_ACMP_TIME")
	public Date getEoorBmsAcmpTime() {
		return eoorBmsAcmpTime;
	}

	/**
	 * Set eoorBmsAcmpTime
	 */
	public void setEoorBmsAcmpTime(Date eoorBmsAcmpTime) {
		this.eoorBmsAcmpTime = eoorBmsAcmpTime;
		addValidField("eoorBmsAcmpTime");
	}

	/**
	 * Get eoorEbbuCode
	 */
	@Column(name = "EOOR_EBBU_CODE")
	public String getEoorEbbuCode() {
		return eoorEbbuCode;
	}

	/**
	 * Set eoorEbbuCode
	 */
	public void setEoorEbbuCode(String eoorEbbuCode) {
		this.eoorEbbuCode = eoorEbbuCode;
		addValidField("eoorEbbuCode");
	}

	/**
	 * Get eoorAmtReceivable
	 */
	@Column(name = "EOOR_AMT_RECEIVABLE")
	public Long getEoorAmtReceivable() {
		return eoorAmtReceivable;
	}

	/**
	 * Set eoorAmtReceivable
	 */
	public void setEoorAmtReceivable(Long eoorAmtReceivable) {
		this.eoorAmtReceivable = eoorAmtReceivable;
		addValidField("eoorAmtReceivable");
	}

	/**
	 * Get eoorAmtPayable
	 */
	@Column(name = "EOOR_AMT_PAYABLE")
	public Long getEoorAmtPayable() {
		return eoorAmtPayable;
	}

	/**
	 * Set eoorAmtPayable
	 */
	public void setEoorAmtPayable(Long eoorAmtPayable) {
		this.eoorAmtPayable = eoorAmtPayable;
		addValidField("eoorAmtPayable");
	}

	/**
	 * Get eoorChargeoff
	 */
	@Column(name = "EOOR_CHARGEOFF")
	public String getEoorChargeoff() {
		return eoorChargeoff;
	}

	/**
	 * Set eoorChargeoff
	 */
	public void setEoorChargeoff(String eoorChargeoff) {
		this.eoorChargeoff = eoorChargeoff;
		addValidField("eoorChargeoff");
	}

	/**
	 * Get eoorPaymentMode
	 */
	@Column(name = "EOOR_PAYMENT_MODE")
	public String getEoorPaymentMode() {
		return eoorPaymentMode;
	}

	/**
	 * Set eoorPaymentMode
	 */
	public void setEoorPaymentMode(String eoorPaymentMode) {
		this.eoorPaymentMode = eoorPaymentMode;
		addValidField("eoorPaymentMode");
	}

	/**
	 * Get eoorReceiptReturntype
	 */
	@Column(name = "EOOR_RECEIPT_RETURNTYPE")
	public Long getEoorReceiptReturntype() {
		return eoorReceiptReturntype;
	}

	/**
	 * Set eoorReceiptReturntype
	 */
	public void setEoorReceiptReturntype(Long eoorReceiptReturntype) {
		this.eoorReceiptReturntype = eoorReceiptReturntype;
		addValidField("eoorReceiptReturntype");
	}

	/**
	 * Get eoorFrozenfessTimelimit
	 */
	@Column(name = "EOOR_FROZENFESS_TIMELIMIT")
	public Date getEoorFrozenfessTimelimit() {
		return eoorFrozenfessTimelimit;
	}

	/**
	 * Set eoorFrozenfessTimelimit
	 */
	public void setEoorFrozenfessTimelimit(Date eoorFrozenfessTimelimit) {
		this.eoorFrozenfessTimelimit = eoorFrozenfessTimelimit;
		addValidField("eoorFrozenfessTimelimit");
	}

	/**
	 * Get eoorContainerCount
	 */
	@Column(name = "EOOR_CONTAINER_COUNT")
	public Long getEoorContainerCount() {
		return eoorContainerCount;
	}

	/**
	 * Set eoorContainerCount
	 */
	public void setEoorContainerCount(Long eoorContainerCount) {
		this.eoorContainerCount = eoorContainerCount;
		addValidField("eoorContainerCount");
	}

	/**
	 * Get eoorCargoSource
	 */
	@Column(name = "EOOR_CARGO_SOURCE")
	public Long getEoorCargoSource() {
		return eoorCargoSource;
	}

	/**
	 * Set eoorCargoSource
	 */
	public void setEoorCargoSource(Long eoorCargoSource) {
		this.eoorCargoSource = eoorCargoSource;
		addValidField("eoorCargoSource");
	}

	/**
	 * Get eoorIEoseNum
	 */
	@Column(name = "EOOR_I_EOSE_NUM")
	public Long getEoorIEoseNum() {
		return eoorIEoseNum;
	}

	/**
	 * Set eoorIEoseNum
	 */
	public void setEoorIEoseNum(Long eoorIEoseNum) {
		this.eoorIEoseNum = eoorIEoseNum;
		addValidField("eoorIEoseNum");
	}

	/**
	 * Get eoorEEoseNum
	 */
	@Column(name = "EOOR_E_EOSE_NUM")
	public Long getEoorEEoseNum() {
		return eoorEEoseNum;
	}

	/**
	 * Set eoorEEoseNum
	 */
	public void setEoorEEoseNum(Long eoorEEoseNum) {
		this.eoorEEoseNum = eoorEEoseNum;
		addValidField("eoorEEoseNum");
	}

	/**
	 * Get eoorIEoetNum
	 */
	@Column(name = "EOOR_I_EOET_NUM")
	public Long getEoorIEoetNum() {
		return eoorIEoetNum;
	}

	/**
	 * Set eoorIEoetNum
	 */
	public void setEoorIEoetNum(Long eoorIEoetNum) {
		this.eoorIEoetNum = eoorIEoetNum;
		addValidField("eoorIEoetNum");
	}

	/**
	 * Get eoorEEoetNum
	 */
	@Column(name = "EOOR_E_EOET_NUM")
	public Long getEoorEEoetNum() {
		return eoorEEoetNum;
	}

	/**
	 * Set eoorEEoetNum
	 */
	public void setEoorEEoetNum(Long eoorEEoetNum) {
		this.eoorEEoetNum = eoorEEoetNum;
		addValidField("eoorEEoetNum");
	}

	/**
	 * Get eoorEoddNum
	 */
	@Column(name = "EOOR_EODD_NUM")
	public Long getEoorEoddNum() {
		return eoorEoddNum;
	}

	/**
	 * Set eoorEoddNum
	 */
	public void setEoorEoddNum(Long eoorEoddNum) {
		this.eoorEoddNum = eoorEoddNum;
		addValidField("eoorEoddNum");
	}

	/**
	 * Get eoorIsDutyfree
	 */
	@Column(name = "EOOR_IS_DUTYFREE")
	public Long getEoorIsDutyfree() {
		return eoorIsDutyfree;
	}

	/**
	 * Set eoorIsDutyfree
	 */
	public void setEoorIsDutyfree(Long eoorIsDutyfree) {
		this.eoorIsDutyfree = eoorIsDutyfree;
		addValidField("eoorIsDutyfree");
	}

	/**
	 * Get eoorLoEbppType
	 */
	@Column(name = "EOOR_LO_EBPP_TYPE")
	public Long getEoorLoEbppType() {
		return eoorLoEbppType;
	}

	/**
	 * Set eoorLoEbppType
	 */
	public void setEoorLoEbppType(Long eoorLoEbppType) {
		this.eoorLoEbppType = eoorLoEbppType;
		addValidField("eoorLoEbppType");
	}

	/**
	 * Get eoorIsAugment
	 */
	@Column(name = "EOOR_IS_AUGMENT")
	public Long getEoorIsAugment() {
		return eoorIsAugment;
	}

	/**
	 * Set eoorIsAugment
	 */
	public void setEoorIsAugment(Long eoorIsAugment) {
		this.eoorIsAugment = eoorIsAugment;
		addValidField("eoorIsAugment");
	}

	/**
	 * Get eoorSinoNo
	 */
	@Column(name = "EOOR_SINO_NO")
	public String getEoorSinoNo() {
		return eoorSinoNo;
	}

	/**
	 * Set eoorSinoNo
	 */
	public void setEoorSinoNo(String eoorSinoNo) {
		this.eoorSinoNo = eoorSinoNo;
		addValidField("eoorSinoNo");
	}

	/**
	 * Get eoorBilling
	 */
	@Column(name = "EOOR_BILLING")
	public Long getEoorBilling() {
		return eoorBilling;
	}

	/**
	 * Set eoorBilling
	 */
	public void setEoorBilling(Long eoorBilling) {
		this.eoorBilling = eoorBilling;
		addValidField("eoorBilling");
	}

	/**
	 * Get eoorIsSettlementUpload
	 */
	@Column(name = "EOOR_IS_SETTLEMENT_UPLOAD")
	public String getEoorIsSettlementUpload() {
		return eoorIsSettlementUpload;
	}

	/**
	 * Set eoorIsSettlementUpload
	 */
	public void setEoorIsSettlementUpload(String eoorIsSettlementUpload) {
		this.eoorIsSettlementUpload = eoorIsSettlementUpload;
		addValidField("eoorIsSettlementUpload");
	}

	@Column(name = "EOOR_BUSINESS_TYPE")
	public String getEoorBusinessType() {
		return eoorBusinessType;
	}

	public void setEoorBusinessType(String eoorBusinessType) {
		this.eoorBusinessType = eoorBusinessType;
		addValidField("eoorBusinessType");
	}

}
