package com.sinotrans.oms.businessrequest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import com.sinotrans.framework.orm.model.BaseModel;
import com.sinotrans.framework.orm.model.OperationLog;

/**
 * Model class for EoRequestTrailer
 */
@Entity
@Table(name = "EO_REQUEST_TRAILER")
public class EoRequestTrailerModel extends BaseModel implements OperationLog {

	//eoetId
	private Long eoetId;
	//eoetEscoId
	private Long eoetEscoId;
	//eoetEbpjId
	private Long eoetEbpjId;
	//eoetLoEbppId
	private Long eoetLoEbppId;
	//eoetEbtkId
	private Long eoetEbtkId;
	//eoetIsAutomatic
	private String eoetIsAutomatic;
	//eoetTaskStatus
	private String eoetTaskStatus;
	//eoetTaskFeedback
	private String eoetTaskFeedback;
	//eoetSysCode
	private String eoetSysCode;
	//eoetEbbuId
	private Long eoetEbbuId;
	//eoetEbbuNameCn
	private String eoetEbbuNameCn;
	//eoetEbbuCode
	private String eoetEbbuCode;
	//eoetEbbuDist1
	private String eoetEbbuDist1;
	//eoetEbbuDist2
	private String eoetEbbuDist2;
	//eoetEbbuDist3
	private String eoetEbbuDist3;
	//eoetEbbuDist4
	private String eoetEbbuDist4;
	//eoetEbbuDist5
	private String eoetEbbuDist5;
	//eoetToId
	private String eoetToId;
	//eoetEoorId
	private Long eoetEoorId;
	//eoetNo
	private String eoetNo;
	//eoetType
	private String eoetType;
	//eoetStatus
	private String eoetStatus;
	//eoetOrder
	private Long eoetOrder;
	//eoetSoNo
	private String eoetSoNo;
	//eoetDoNo
	private String eoetDoNo;
	//eoetOrderFudeji
	private String eoetOrderFudeji;
	//eoetContractNo
	private String eoetContractNo;
	//eoetBuId
	private Long eoetBuId;
	//eoetBuName
	private String eoetBuName;
	//eoetEbpeId
	private Long eoetEbpeId;
	//eoetEbccName
	private String eoetEbccName;
	//eoetOrderDate
	private Date eoetOrderDate;
	//eoetConsignorEbcuId
	private Long eoetConsignorEbcuId;
	//eoetConsignorEbcuCode
	private String eoetConsignorEbcuCode;
	//eoetConsignorEbcuName
	private String eoetConsignorEbcuName;
	//eoetOwnerEbcuId
	private Long eoetOwnerEbcuId;
	//eoetOwnerEbcuCode
	private String eoetOwnerEbcuCode;
	//eoetOwnerEbcuName
	private String eoetOwnerEbcuName;
	//eoetEsdeId
	private Long eoetEsdeId;
	//eoetEsdeCode
	private String eoetEsdeCode;
	//eoetEsdeName
	private String eoetEsdeName;
	//eoetSaleEsstId
	private Long eoetSaleEsstId;
	//eoetSaleEsstCode
	private String eoetSaleEsstCode;
	//eoetSaleEsstName
	private String eoetSaleEsstName;
	//eoetOperateEsstId
	private Long eoetOperateEsstId;
	//eoetOperateEsstCode
	private String eoetOperateEsstCode;
	//eoetOperateEsstName
	private String eoetOperateEsstName;
	//eoetVessel
	private String eoetVessel;
	//eoetVoyage
	private String eoetVoyage;
	//eoetStartEbptId
	private Long eoetStartEbptId;
	//eoetStartEbptNo
	private String eoetStartEbptNo;
	//eoetStartEbptNameCn
	private String eoetStartEbptNameCn;
	//eoetEndEbptId
	private Long eoetEndEbptId;
	//eoetEndEbptNo
	private String eoetEndEbptNo;
	//eoetEndEbptNameCn
	private String eoetEndEbptNameCn;
	//eoetShipperConsignNo
	private String eoetShipperConsignNo;
	//eoetOrderType
	private String eoetOrderType;
	//eoetLevel
	private String eoetLevel;
	//eoetCutBoxTime
	private Date eoetCutBoxTime;
	//eoetReqDeliveryDate
	private Date eoetReqDeliveryDate;
	//eoetDeliveryPeriod
	private String eoetDeliveryPeriod;
	//eoetSuitcasePlaceId
	private Long eoetSuitcasePlaceId;
	//eoetSuitcasePlaceCode
	private String eoetSuitcasePlaceCode;
	//eoetSuitcasePlaceName
	private String eoetSuitcasePlaceName;
	//eoetDeliveryPlaceId
	private Long eoetDeliveryPlaceId;
	//eoetDeliveryPlaceCode
	private String eoetDeliveryPlaceCode;
	//eoetDeliveryPlaceName
	private String eoetDeliveryPlaceName;
	//eoetShipperEbsaId
	private Long eoetShipperEbsaId;
	//eoetDeliveryPlaceAddress
	private String eoetDeliveryPlaceAddress;
	//eoetEbsaContact
	private String eoetEbsaContact;
	//eoetEbsaTel
	private String eoetEbsaTel;
	//eoetCollectPortId
	private Long eoetCollectPortId;
	//eoetCollectPortCode
	private String eoetCollectPortCode;
	//eoetCollectPortName
	private String eoetCollectPortName;
	//eoetTrailerCompanyId
	private Long eoetTrailerCompanyId;
	//eoetTrailerCompanyNo
	private String eoetTrailerCompanyNo;
	//eoetTrailerCompanyName
	private String eoetTrailerCompanyName;
	//eoetOwnContainerId
	private Long eoetOwnContainerId;
	//eoetOwnContainerName
	private String eoetOwnContainerName;
	//eoetContainerTime
	private Date eoetContainerTime;
	//eoetDeliveryTime
	private Date eoetDeliveryTime;
	//eoetSetPostTime
	private Date eoetSetPostTime;
	//eoetExternalOrderNo
	private String eoetExternalOrderNo;
	//eoetContainerTypeWeight
	private String eoetContainerTypeWeight;
	//eoetWeight
	private Long eoetWeight;
	//eoetNetWeight
	private Long eoetNetWeight;
	//eoetQuantity
	private Long eoetQuantity;
	//eoetVolume
	private Long eoetVolume;
	//eoetCauseDelay
	private String eoetCauseDelay;
	//eoetTransReq
	private String eoetTransReq;
	//eoetConsigneeReq
	private String eoetConsigneeReq;
	//eoetDocReq
	private String eoetDocReq;
	//eoetRemark
	private String eoetRemark;
	//eoetSubstr1
	private String eoetSubstr1;
	//eoetSubstr2
	private String eoetSubstr2;
	//eoetSubstr3
	private String eoetSubstr3;
	//eoetSubstr4
	private String eoetSubstr4;
	//eoetSubstr5
	private String eoetSubstr5;
	//eoetSubstr6
	private String eoetSubstr6;
	//eoetSubstr7
	private String eoetSubstr7;
	//eoetSubstr8
	private String eoetSubstr8;
	//eoetSubstr9
	private String eoetSubstr9;
	//eoetSubstr10
	private String eoetSubstr10;
	//eoetSubstr11
	private String eoetSubstr11;
	//eoetSubstr12
	private String eoetSubstr12;
	//eoetSubstr13
	private String eoetSubstr13;
	//eoetSubstr14
	private String eoetSubstr14;
	//eoetSubstr15
	private String eoetSubstr15;
	//eoetSubstr16
	private String eoetSubstr16;
	//eoetSubstr17
	private String eoetSubstr17;
	//eoetSubstr18
	private String eoetSubstr18;
	//eoetSubstr19
	private String eoetSubstr19;
	//eoetSubstr20
	private String eoetSubstr20;
	//eoetSubstr21
	private String eoetSubstr21;
	//eoetSubstr22
	private String eoetSubstr22;
	//eoetSubstr23
	private String eoetSubstr23;
	//eoetSubstr24
	private String eoetSubstr24;
	//eoetSubstr25
	private String eoetSubstr25;
	//eoetSubdate1
	private Date eoetSubdate1;
	//eoetSubdate2
	private Date eoetSubdate2;
	//eoetSubdate3
	private Date eoetSubdate3;
	//eoetSubdate4
	private Date eoetSubdate4;
	//eoetSubdate5
	private Date eoetSubdate5;
	//eoetSubdate6
	private Date eoetSubdate6;
	//eoetSubdate7
	private Date eoetSubdate7;
	//eoetSubdate8
	private Date eoetSubdate8;
	//eoetSubdate9
	private Date eoetSubdate9;
	//eoetSubdate10
	private Date eoetSubdate10;
	//eoetSubnum1
	private Long eoetSubnum1;
	//eoetSubnum2
	private Long eoetSubnum2;
	//eoetSubnum3
	private Long eoetSubnum3;
	//eoetSubnum4
	private Long eoetSubnum4;
	//eoetSubnum5
	private Long eoetSubnum5;
	//eoetSubnum6
	private Long eoetSubnum6;
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
	//eoetIeFlag
	private String eoetIeFlag;
	//eoetDischargeTime
	private Date eoetDischargeTime;
	//eoetReturnTime
	private Date eoetReturnTime;
	//eoetReturnEbrgId
	private Long eoetReturnEbrgId;
	//eoetReturnEbrgCode
	private String eoetReturnEbrgCode;
	//eoetReturnEbrgName
	private String eoetReturnEbrgName;
	//eoetReqArrivalDate
	private Date eoetReqArrivalDate;
	//eoetArrivalPeriod
	private String eoetArrivalPeriod;
	//eoetShipperEbspId
	private Long eoetShipperEbspId;
	//eoetShipperEbspCode
	private String eoetShipperEbspCode;
	//eoetShipperEbspNameCn
	private String eoetShipperEbspNameCn;
	//eoetShipperEbplId
	private Long eoetShipperEbplId;
	//eoetShipperEbplNameCn
	private String eoetShipperEbplNameCn;
	//eoetShipperEbsaPost
	private String eoetShipperEbsaPost;
	//eoetShipperEbsaFax
	private String eoetShipperEbsaFax;
	//eoetShipperEbsaEmail
	private String eoetShipperEbsaEmail;
	//eoetContainerTimeAsk
	private Date eoetContainerTimeAsk;
	//eoetSetPostTimeAsk
	private Date eoetSetPostTimeAsk;
	//eoetBlNo
	private String eoetBlNo;
	//eoetCarrierEbcuId
	private Long eoetCarrierEbcuId;
	//eoetCarrierEbcuCustomerNo
	private String eoetCarrierEbcuCustomerNo;
	//eoetCarrierEbcuNameCn
	private String eoetCarrierEbcuNameCn;
	//eoetEbrgId
	private Long eoetEbrgId;
	//eoetEbrgNo
	private String eoetEbrgNo;
	//eoetEbrgNameCn
	private String eoetEbrgNameCn;
	//eoetSailingDate
	private Date eoetSailingDate;
	//eoetTotalSize
	private String eoetTotalSize;
	//eoetMainBookingNo
	private String eoetMainBookingNo;
	//eoetTaskConfirmUser
	private String eoetTaskConfirmUser;
	//eoetTaskConfirmDate
	private Date eoetTaskConfirmDate;
	//eoetEscoCode
	private String eoetEscoCode;
	//eoetEscoNameCn
	private String eoetEscoNameCn;
	//eoetEsdeDepartmentCode
	private String eoetEsdeDepartmentCode;
	//eoetEsdeDepartmentName
	private String eoetEsdeDepartmentName;
	//eoetEsusUserNameCn
	private String eoetEsusUserNameCn;
	//eoetRetoType
	private Long eoetRetoType;
	//eoetTaskRefuseDate
	private Date eoetTaskRefuseDate;
	//eoetTranType
	private String eoetTranType;
	//eoetIsDutyfree
	private Long eoetIsDutyfree;
	//eoetBoxsealBackTime
	private Date eoetBoxsealBackTime;
	//eoetCyInCode
	private String eoetCyInCode;
	//eoetTransportNo
	private String eoetTransportNo;

	/**
	 * Get eoetId
	 */
	@Column(name = "EOET_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoetId() {
		return eoetId;
	}

	/**
	 * Set eoetId
	 */
	public void setEoetId(Long eoetId) {
		this.eoetId = eoetId;
		addValidField("eoetId");
	}

	/**
	 * Get eoetEscoId
	 */
	@Column(name = "EOET_ESCO_ID")
	public Long getEoetEscoId() {
		return eoetEscoId;
	}

	/**
	 * Set eoetEscoId
	 */
	public void setEoetEscoId(Long eoetEscoId) {
		this.eoetEscoId = eoetEscoId;
		addValidField("eoetEscoId");
	}

	/**
	 * Get eoetEbpjId
	 */
	@Column(name = "EOET_EBPJ_ID")
	public Long getEoetEbpjId() {
		return eoetEbpjId;
	}

	/**
	 * Set eoetEbpjId
	 */
	public void setEoetEbpjId(Long eoetEbpjId) {
		this.eoetEbpjId = eoetEbpjId;
		addValidField("eoetEbpjId");
	}

	/**
	 * Get eoetLoEbppId
	 */
	@Column(name = "EOET_LO_EBPP_ID")
	public Long getEoetLoEbppId() {
		return eoetLoEbppId;
	}

	/**
	 * Set eoetLoEbppId
	 */
	public void setEoetLoEbppId(Long eoetLoEbppId) {
		this.eoetLoEbppId = eoetLoEbppId;
		addValidField("eoetLoEbppId");
	}

	/**
	 * Get eoetEbtkId
	 */
	@Column(name = "EOET_EBTK_ID")
	public Long getEoetEbtkId() {
		return eoetEbtkId;
	}

	/**
	 * Set eoetEbtkId
	 */
	public void setEoetEbtkId(Long eoetEbtkId) {
		this.eoetEbtkId = eoetEbtkId;
		addValidField("eoetEbtkId");
	}

	/**
	 * Get eoetIsAutomatic
	 */
	@Column(name = "EOET_IS_AUTOMATIC")
	public String getEoetIsAutomatic() {
		return eoetIsAutomatic;
	}

	/**
	 * Set eoetIsAutomatic
	 */
	public void setEoetIsAutomatic(String eoetIsAutomatic) {
		this.eoetIsAutomatic = eoetIsAutomatic;
		addValidField("eoetIsAutomatic");
	}

	/**
	 * Get eoetTaskStatus
	 */
	@Column(name = "EOET_TASK_STATUS")
	public String getEoetTaskStatus() {
		return eoetTaskStatus;
	}

	/**
	 * Set eoetTaskStatus
	 */
	public void setEoetTaskStatus(String eoetTaskStatus) {
		this.eoetTaskStatus = eoetTaskStatus;
		addValidField("eoetTaskStatus");
	}

	/**
	 * Get eoetTaskFeedback
	 */
	@Column(name = "EOET_TASK_FEEDBACK")
	public String getEoetTaskFeedback() {
		return eoetTaskFeedback;
	}

	/**
	 * Set eoetTaskFeedback
	 */
	public void setEoetTaskFeedback(String eoetTaskFeedback) {
		this.eoetTaskFeedback = eoetTaskFeedback;
		addValidField("eoetTaskFeedback");
	}

	/**
	 * Get eoetSysCode
	 */
	@Column(name = "EOET_SYS_CODE")
	public String getEoetSysCode() {
		return eoetSysCode;
	}

	/**
	 * Set eoetSysCode
	 */
	public void setEoetSysCode(String eoetSysCode) {
		this.eoetSysCode = eoetSysCode;
		addValidField("eoetSysCode");
	}

	/**
	 * Get eoetEbbuId
	 */
	@Column(name = "EOET_EBBU_ID")
	public Long getEoetEbbuId() {
		return eoetEbbuId;
	}

	/**
	 * Set eoetEbbuId
	 */
	public void setEoetEbbuId(Long eoetEbbuId) {
		this.eoetEbbuId = eoetEbbuId;
		addValidField("eoetEbbuId");
	}

	/**
	 * Get eoetEbbuNameCn
	 */
	@Column(name = "EOET_EBBU_NAME_CN")
	public String getEoetEbbuNameCn() {
		return eoetEbbuNameCn;
	}

	/**
	 * Set eoetEbbuNameCn
	 */
	public void setEoetEbbuNameCn(String eoetEbbuNameCn) {
		this.eoetEbbuNameCn = eoetEbbuNameCn;
		addValidField("eoetEbbuNameCn");
	}

	/**
	 * Get eoetEbbuCode
	 */
	@Column(name = "EOET_EBBU_CODE")
	public String getEoetEbbuCode() {
		return eoetEbbuCode;
	}

	/**
	 * Set eoetEbbuCode
	 */
	public void setEoetEbbuCode(String eoetEbbuCode) {
		this.eoetEbbuCode = eoetEbbuCode;
		addValidField("eoetEbbuCode");
	}

	/**
	 * Get eoetEbbuDist1
	 */
	@Column(name = "EOET_EBBU_DIST_1")
	public String getEoetEbbuDist1() {
		return eoetEbbuDist1;
	}

	/**
	 * Set eoetEbbuDist1
	 */
	public void setEoetEbbuDist1(String eoetEbbuDist1) {
		this.eoetEbbuDist1 = eoetEbbuDist1;
		addValidField("eoetEbbuDist1");
	}

	/**
	 * Get eoetEbbuDist2
	 */
	@Column(name = "EOET_EBBU_DIST_2")
	public String getEoetEbbuDist2() {
		return eoetEbbuDist2;
	}

	/**
	 * Set eoetEbbuDist2
	 */
	public void setEoetEbbuDist2(String eoetEbbuDist2) {
		this.eoetEbbuDist2 = eoetEbbuDist2;
		addValidField("eoetEbbuDist2");
	}

	/**
	 * Get eoetEbbuDist3
	 */
	@Column(name = "EOET_EBBU_DIST_3")
	public String getEoetEbbuDist3() {
		return eoetEbbuDist3;
	}

	/**
	 * Set eoetEbbuDist3
	 */
	public void setEoetEbbuDist3(String eoetEbbuDist3) {
		this.eoetEbbuDist3 = eoetEbbuDist3;
		addValidField("eoetEbbuDist3");
	}

	/**
	 * Get eoetEbbuDist4
	 */
	@Column(name = "EOET_EBBU_DIST_4")
	public String getEoetEbbuDist4() {
		return eoetEbbuDist4;
	}

	/**
	 * Set eoetEbbuDist4
	 */
	public void setEoetEbbuDist4(String eoetEbbuDist4) {
		this.eoetEbbuDist4 = eoetEbbuDist4;
		addValidField("eoetEbbuDist4");
	}

	/**
	 * Get eoetEbbuDist5
	 */
	@Column(name = "EOET_EBBU_DIST_5")
	public String getEoetEbbuDist5() {
		return eoetEbbuDist5;
	}

	/**
	 * Set eoetEbbuDist5
	 */
	public void setEoetEbbuDist5(String eoetEbbuDist5) {
		this.eoetEbbuDist5 = eoetEbbuDist5;
		addValidField("eoetEbbuDist5");
	}

	/**
	 * Get eoetToId
	 */
	@Column(name = "EOET_TO_ID")
	public String getEoetToId() {
		return eoetToId;
	}

	/**
	 * Set eoetToId
	 */
	public void setEoetToId(String eoetToId) {
		this.eoetToId = eoetToId;
		addValidField("eoetToId");
	}

	/**
	 * Get eoetEoorId
	 */
	@Column(name = "EOET_EOOR_ID")
	public Long getEoetEoorId() {
		return eoetEoorId;
	}

	/**
	 * Set eoetEoorId
	 */
	public void setEoetEoorId(Long eoetEoorId) {
		this.eoetEoorId = eoetEoorId;
		addValidField("eoetEoorId");
	}

	/**
	 * Get eoetNo
	 */
	@Column(name = "EOET_NO")
	public String getEoetNo() {
		return eoetNo;
	}

	/**
	 * Set eoetNo
	 */
	public void setEoetNo(String eoetNo) {
		this.eoetNo = eoetNo;
		addValidField("eoetNo");
	}

	/**
	 * Get eoetType
	 */
	@Column(name = "EOET_TYPE")
	public String getEoetType() {
		return eoetType;
	}

	/**
	 * Set eoetType
	 */
	public void setEoetType(String eoetType) {
		this.eoetType = eoetType;
		addValidField("eoetType");
	}

	/**
	 * Get eoetStatus
	 */
	@Column(name = "EOET_STATUS")
	public String getEoetStatus() {
		return eoetStatus;
	}

	/**
	 * Set eoetStatus
	 */
	public void setEoetStatus(String eoetStatus) {
		this.eoetStatus = eoetStatus;
		addValidField("eoetStatus");
	}

	/**
	 * Get eoetOrder
	 */
	@Column(name = "EOET_ORDER")
	public Long getEoetOrder() {
		return eoetOrder;
	}

	/**
	 * Set eoetOrder
	 */
	public void setEoetOrder(Long eoetOrder) {
		this.eoetOrder = eoetOrder;
		addValidField("eoetOrder");
	}

	/**
	 * Get eoetSoNo
	 */
	@Column(name = "EOET_SO_NO")
	public String getEoetSoNo() {
		return eoetSoNo;
	}

	/**
	 * Set eoetSoNo
	 */
	public void setEoetSoNo(String eoetSoNo) {
		this.eoetSoNo = eoetSoNo;
		addValidField("eoetSoNo");
	}

	/**
	 * Get eoetDoNo
	 */
	@Column(name = "EOET_DO_NO")
	public String getEoetDoNo() {
		return eoetDoNo;
	}

	/**
	 * Set eoetDoNo
	 */
	public void setEoetDoNo(String eoetDoNo) {
		this.eoetDoNo = eoetDoNo;
		addValidField("eoetDoNo");
	}

	/**
	 * Get eoetOrderFudeji
	 */
	@Column(name = "EOET_ORDER_FUDEJI")
	public String getEoetOrderFudeji() {
		return eoetOrderFudeji;
	}

	/**
	 * Set eoetOrderFudeji
	 */
	public void setEoetOrderFudeji(String eoetOrderFudeji) {
		this.eoetOrderFudeji = eoetOrderFudeji;
		addValidField("eoetOrderFudeji");
	}

	/**
	 * Get eoetContractNo
	 */
	@Column(name = "EOET_CONTRACT_NO")
	public String getEoetContractNo() {
		return eoetContractNo;
	}

	/**
	 * Set eoetContractNo
	 */
	public void setEoetContractNo(String eoetContractNo) {
		this.eoetContractNo = eoetContractNo;
		addValidField("eoetContractNo");
	}

	/**
	 * Get eoetBuId
	 */
	@Column(name = "EOET_BU_ID")
	public Long getEoetBuId() {
		return eoetBuId;
	}

	/**
	 * Set eoetBuId
	 */
	public void setEoetBuId(Long eoetBuId) {
		this.eoetBuId = eoetBuId;
		addValidField("eoetBuId");
	}

	/**
	 * Get eoetBuName
	 */
	@Column(name = "EOET_BU_NAME")
	public String getEoetBuName() {
		return eoetBuName;
	}

	/**
	 * Set eoetBuName
	 */
	public void setEoetBuName(String eoetBuName) {
		this.eoetBuName = eoetBuName;
		addValidField("eoetBuName");
	}

	/**
	 * Get eoetEbpeId
	 */
	@Column(name = "EOET_EBPE_ID")
	public Long getEoetEbpeId() {
		return eoetEbpeId;
	}

	/**
	 * Set eoetEbpeId
	 */
	public void setEoetEbpeId(Long eoetEbpeId) {
		this.eoetEbpeId = eoetEbpeId;
		addValidField("eoetEbpeId");
	}

	/**
	 * Get eoetEbccName
	 */
	@Column(name = "EOET_EBCC_NAME")
	public String getEoetEbccName() {
		return eoetEbccName;
	}

	/**
	 * Set eoetEbccName
	 */
	public void setEoetEbccName(String eoetEbccName) {
		this.eoetEbccName = eoetEbccName;
		addValidField("eoetEbccName");
	}

	/**
	 * Get eoetOrderDate
	 */
	@Column(name = "EOET_ORDER_DATE")
	public Date getEoetOrderDate() {
		return eoetOrderDate;
	}

	/**
	 * Set eoetOrderDate
	 */
	public void setEoetOrderDate(Date eoetOrderDate) {
		this.eoetOrderDate = eoetOrderDate;
		addValidField("eoetOrderDate");
	}

	/**
	 * Get eoetConsignorEbcuId
	 */
	@Column(name = "EOET_CONSIGNOR_EBCU_ID")
	public Long getEoetConsignorEbcuId() {
		return eoetConsignorEbcuId;
	}

	/**
	 * Set eoetConsignorEbcuId
	 */
	public void setEoetConsignorEbcuId(Long eoetConsignorEbcuId) {
		this.eoetConsignorEbcuId = eoetConsignorEbcuId;
		addValidField("eoetConsignorEbcuId");
	}

	/**
	 * Get eoetConsignorEbcuCode
	 */
	@Column(name = "EOET_CONSIGNOR_EBCU_CODE")
	public String getEoetConsignorEbcuCode() {
		return eoetConsignorEbcuCode;
	}

	/**
	 * Set eoetConsignorEbcuCode
	 */
	public void setEoetConsignorEbcuCode(String eoetConsignorEbcuCode) {
		this.eoetConsignorEbcuCode = eoetConsignorEbcuCode;
		addValidField("eoetConsignorEbcuCode");
	}

	/**
	 * Get eoetConsignorEbcuName
	 */
	@Column(name = "EOET_CONSIGNOR_EBCU_NAME")
	public String getEoetConsignorEbcuName() {
		return eoetConsignorEbcuName;
	}

	/**
	 * Set eoetConsignorEbcuName
	 */
	public void setEoetConsignorEbcuName(String eoetConsignorEbcuName) {
		this.eoetConsignorEbcuName = eoetConsignorEbcuName;
		addValidField("eoetConsignorEbcuName");
	}

	/**
	 * Get eoetOwnerEbcuId
	 */
	@Column(name = "EOET_OWNER_EBCU_ID")
	public Long getEoetOwnerEbcuId() {
		return eoetOwnerEbcuId;
	}

	/**
	 * Set eoetOwnerEbcuId
	 */
	public void setEoetOwnerEbcuId(Long eoetOwnerEbcuId) {
		this.eoetOwnerEbcuId = eoetOwnerEbcuId;
		addValidField("eoetOwnerEbcuId");
	}

	/**
	 * Get eoetOwnerEbcuCode
	 */
	@Column(name = "EOET_OWNER_EBCU_CODE")
	public String getEoetOwnerEbcuCode() {
		return eoetOwnerEbcuCode;
	}

	/**
	 * Set eoetOwnerEbcuCode
	 */
	public void setEoetOwnerEbcuCode(String eoetOwnerEbcuCode) {
		this.eoetOwnerEbcuCode = eoetOwnerEbcuCode;
		addValidField("eoetOwnerEbcuCode");
	}

	/**
	 * Get eoetOwnerEbcuName
	 */
	@Column(name = "EOET_OWNER_EBCU_NAME")
	public String getEoetOwnerEbcuName() {
		return eoetOwnerEbcuName;
	}

	/**
	 * Set eoetOwnerEbcuName
	 */
	public void setEoetOwnerEbcuName(String eoetOwnerEbcuName) {
		this.eoetOwnerEbcuName = eoetOwnerEbcuName;
		addValidField("eoetOwnerEbcuName");
	}

	/**
	 * Get eoetEsdeId
	 */
	@Column(name = "EOET_ESDE_ID")
	public Long getEoetEsdeId() {
		return eoetEsdeId;
	}

	/**
	 * Set eoetEsdeId
	 */
	public void setEoetEsdeId(Long eoetEsdeId) {
		this.eoetEsdeId = eoetEsdeId;
		addValidField("eoetEsdeId");
	}

	/**
	 * Get eoetEsdeCode
	 */
	@Column(name = "EOET_ESDE_CODE")
	public String getEoetEsdeCode() {
		return eoetEsdeCode;
	}

	/**
	 * Set eoetEsdeCode
	 */
	public void setEoetEsdeCode(String eoetEsdeCode) {
		this.eoetEsdeCode = eoetEsdeCode;
		addValidField("eoetEsdeCode");
	}

	/**
	 * Get eoetEsdeName
	 */
	@Column(name = "EOET_ESDE_NAME")
	public String getEoetEsdeName() {
		return eoetEsdeName;
	}

	/**
	 * Set eoetEsdeName
	 */
	public void setEoetEsdeName(String eoetEsdeName) {
		this.eoetEsdeName = eoetEsdeName;
		addValidField("eoetEsdeName");
	}

	/**
	 * Get eoetSaleEsstId
	 */
	@Column(name = "EOET_SALE_ESST_ID")
	public Long getEoetSaleEsstId() {
		return eoetSaleEsstId;
	}

	/**
	 * Set eoetSaleEsstId
	 */
	public void setEoetSaleEsstId(Long eoetSaleEsstId) {
		this.eoetSaleEsstId = eoetSaleEsstId;
		addValidField("eoetSaleEsstId");
	}

	/**
	 * Get eoetSaleEsstCode
	 */
	@Column(name = "EOET_SALE_ESST_CODE")
	public String getEoetSaleEsstCode() {
		return eoetSaleEsstCode;
	}

	/**
	 * Set eoetSaleEsstCode
	 */
	public void setEoetSaleEsstCode(String eoetSaleEsstCode) {
		this.eoetSaleEsstCode = eoetSaleEsstCode;
		addValidField("eoetSaleEsstCode");
	}

	/**
	 * Get eoetSaleEsstName
	 */
	@Column(name = "EOET_SALE_ESST_NAME")
	public String getEoetSaleEsstName() {
		return eoetSaleEsstName;
	}

	/**
	 * Set eoetSaleEsstName
	 */
	public void setEoetSaleEsstName(String eoetSaleEsstName) {
		this.eoetSaleEsstName = eoetSaleEsstName;
		addValidField("eoetSaleEsstName");
	}

	/**
	 * Get eoetOperateEsstId
	 */
	@Column(name = "EOET_OPERATE_ESST_ID")
	public Long getEoetOperateEsstId() {
		return eoetOperateEsstId;
	}

	/**
	 * Set eoetOperateEsstId
	 */
	public void setEoetOperateEsstId(Long eoetOperateEsstId) {
		this.eoetOperateEsstId = eoetOperateEsstId;
		addValidField("eoetOperateEsstId");
	}

	/**
	 * Get eoetOperateEsstCode
	 */
	@Column(name = "EOET_OPERATE_ESST_CODE")
	public String getEoetOperateEsstCode() {
		return eoetOperateEsstCode;
	}

	/**
	 * Set eoetOperateEsstCode
	 */
	public void setEoetOperateEsstCode(String eoetOperateEsstCode) {
		this.eoetOperateEsstCode = eoetOperateEsstCode;
		addValidField("eoetOperateEsstCode");
	}

	/**
	 * Get eoetOperateEsstName
	 */
	@Column(name = "EOET_OPERATE_ESST_NAME")
	public String getEoetOperateEsstName() {
		return eoetOperateEsstName;
	}

	/**
	 * Set eoetOperateEsstName
	 */
	public void setEoetOperateEsstName(String eoetOperateEsstName) {
		this.eoetOperateEsstName = eoetOperateEsstName;
		addValidField("eoetOperateEsstName");
	}

	/**
	 * Get eoetVessel
	 */
	@Column(name = "EOET_VESSEL")
	public String getEoetVessel() {
		return eoetVessel;
	}

	/**
	 * Set eoetVessel
	 */
	public void setEoetVessel(String eoetVessel) {
		this.eoetVessel = eoetVessel;
		addValidField("eoetVessel");
	}

	/**
	 * Get eoetVoyage
	 */
	@Column(name = "EOET_VOYAGE")
	public String getEoetVoyage() {
		return eoetVoyage;
	}

	/**
	 * Set eoetVoyage
	 */
	public void setEoetVoyage(String eoetVoyage) {
		this.eoetVoyage = eoetVoyage;
		addValidField("eoetVoyage");
	}

	/**
	 * Get eoetStartEbptId
	 */
	@Column(name = "EOET_START_EBPT_ID")
	public Long getEoetStartEbptId() {
		return eoetStartEbptId;
	}

	/**
	 * Set eoetStartEbptId
	 */
	public void setEoetStartEbptId(Long eoetStartEbptId) {
		this.eoetStartEbptId = eoetStartEbptId;
		addValidField("eoetStartEbptId");
	}

	/**
	 * Get eoetStartEbptNo
	 */
	@Column(name = "EOET_START_EBPT_NO")
	public String getEoetStartEbptNo() {
		return eoetStartEbptNo;
	}

	/**
	 * Set eoetStartEbptNo
	 */
	public void setEoetStartEbptNo(String eoetStartEbptNo) {
		this.eoetStartEbptNo = eoetStartEbptNo;
		addValidField("eoetStartEbptNo");
	}

	/**
	 * Get eoetStartEbptNameCn
	 */
	@Column(name = "EOET_START_EBPT_NAME_CN")
	public String getEoetStartEbptNameCn() {
		return eoetStartEbptNameCn;
	}

	/**
	 * Set eoetStartEbptNameCn
	 */
	public void setEoetStartEbptNameCn(String eoetStartEbptNameCn) {
		this.eoetStartEbptNameCn = eoetStartEbptNameCn;
		addValidField("eoetStartEbptNameCn");
	}

	/**
	 * Get eoetEndEbptId
	 */
	@Column(name = "EOET_END_EBPT_ID")
	public Long getEoetEndEbptId() {
		return eoetEndEbptId;
	}

	/**
	 * Set eoetEndEbptId
	 */
	public void setEoetEndEbptId(Long eoetEndEbptId) {
		this.eoetEndEbptId = eoetEndEbptId;
		addValidField("eoetEndEbptId");
	}

	/**
	 * Get eoetEndEbptNo
	 */
	@Column(name = "EOET_END_EBPT_NO")
	public String getEoetEndEbptNo() {
		return eoetEndEbptNo;
	}

	/**
	 * Set eoetEndEbptNo
	 */
	public void setEoetEndEbptNo(String eoetEndEbptNo) {
		this.eoetEndEbptNo = eoetEndEbptNo;
		addValidField("eoetEndEbptNo");
	}

	/**
	 * Get eoetEndEbptNameCn
	 */
	@Column(name = "EOET_END_EBPT_NAME_CN")
	public String getEoetEndEbptNameCn() {
		return eoetEndEbptNameCn;
	}

	/**
	 * Set eoetEndEbptNameCn
	 */
	public void setEoetEndEbptNameCn(String eoetEndEbptNameCn) {
		this.eoetEndEbptNameCn = eoetEndEbptNameCn;
		addValidField("eoetEndEbptNameCn");
	}

	/**
	 * Get eoetShipperConsignNo
	 */
	@Column(name = "EOET_SHIPPER_CONSIGN_NO")
	public String getEoetShipperConsignNo() {
		return eoetShipperConsignNo;
	}

	/**
	 * Set eoetShipperConsignNo
	 */
	public void setEoetShipperConsignNo(String eoetShipperConsignNo) {
		this.eoetShipperConsignNo = eoetShipperConsignNo;
		addValidField("eoetShipperConsignNo");
	}

	/**
	 * Get eoetOrderType
	 */
	@Column(name = "EOET_ORDER_TYPE")
	public String getEoetOrderType() {
		return eoetOrderType;
	}

	/**
	 * Set eoetOrderType
	 */
	public void setEoetOrderType(String eoetOrderType) {
		this.eoetOrderType = eoetOrderType;
		addValidField("eoetOrderType");
	}

	/**
	 * Get eoetLevel
	 */
	@Column(name = "EOET_LEVEL")
	public String getEoetLevel() {
		return eoetLevel;
	}

	/**
	 * Set eoetLevel
	 */
	public void setEoetLevel(String eoetLevel) {
		this.eoetLevel = eoetLevel;
		addValidField("eoetLevel");
	}

	/**
	 * Get eoetCutBoxTime
	 */
	@Column(name = "EOET_CUT_BOX_TIME")
	public Date getEoetCutBoxTime() {
		return eoetCutBoxTime;
	}

	/**
	 * Set eoetCutBoxTime
	 */
	public void setEoetCutBoxTime(Date eoetCutBoxTime) {
		this.eoetCutBoxTime = eoetCutBoxTime;
		addValidField("eoetCutBoxTime");
	}

	/**
	 * Get eoetReqDeliveryDate
	 */
	@Column(name = "EOET_REQ_DELIVERY_DATE")
	public Date getEoetReqDeliveryDate() {
		return eoetReqDeliveryDate;
	}

	/**
	 * Set eoetReqDeliveryDate
	 */
	public void setEoetReqDeliveryDate(Date eoetReqDeliveryDate) {
		this.eoetReqDeliveryDate = eoetReqDeliveryDate;
		addValidField("eoetReqDeliveryDate");
	}

	/**
	 * Get eoetDeliveryPeriod
	 */
	@Column(name = "EOET_DELIVERY_PERIOD")
	public String getEoetDeliveryPeriod() {
		return eoetDeliveryPeriod;
	}

	/**
	 * Set eoetDeliveryPeriod
	 */
	public void setEoetDeliveryPeriod(String eoetDeliveryPeriod) {
		this.eoetDeliveryPeriod = eoetDeliveryPeriod;
		addValidField("eoetDeliveryPeriod");
	}

	/**
	 * Get eoetSuitcasePlaceId
	 */
	@Column(name = "EOET_SUITCASE_PLACE_ID")
	public Long getEoetSuitcasePlaceId() {
		return eoetSuitcasePlaceId;
	}

	/**
	 * Set eoetSuitcasePlaceId
	 */
	public void setEoetSuitcasePlaceId(Long eoetSuitcasePlaceId) {
		this.eoetSuitcasePlaceId = eoetSuitcasePlaceId;
		addValidField("eoetSuitcasePlaceId");
	}

	/**
	 * Get eoetSuitcasePlaceCode
	 */
	@Column(name = "EOET_SUITCASE_PLACE_CODE")
	public String getEoetSuitcasePlaceCode() {
		return eoetSuitcasePlaceCode;
	}

	/**
	 * Set eoetSuitcasePlaceCode
	 */
	public void setEoetSuitcasePlaceCode(String eoetSuitcasePlaceCode) {
		this.eoetSuitcasePlaceCode = eoetSuitcasePlaceCode;
		addValidField("eoetSuitcasePlaceCode");
	}

	/**
	 * Get eoetSuitcasePlaceName
	 */
	@Column(name = "EOET_SUITCASE_PLACE_NAME")
	public String getEoetSuitcasePlaceName() {
		return eoetSuitcasePlaceName;
	}

	/**
	 * Set eoetSuitcasePlaceName
	 */
	public void setEoetSuitcasePlaceName(String eoetSuitcasePlaceName) {
		this.eoetSuitcasePlaceName = eoetSuitcasePlaceName;
		addValidField("eoetSuitcasePlaceName");
	}

	/**
	 * Get eoetDeliveryPlaceId
	 */
	@Column(name = "EOET_DELIVERY_PLACE_ID")
	public Long getEoetDeliveryPlaceId() {
		return eoetDeliveryPlaceId;
	}

	/**
	 * Set eoetDeliveryPlaceId
	 */
	public void setEoetDeliveryPlaceId(Long eoetDeliveryPlaceId) {
		this.eoetDeliveryPlaceId = eoetDeliveryPlaceId;
		addValidField("eoetDeliveryPlaceId");
	}

	/**
	 * Get eoetDeliveryPlaceCode
	 */
	@Column(name = "EOET_DELIVERY_PLACE_CODE")
	public String getEoetDeliveryPlaceCode() {
		return eoetDeliveryPlaceCode;
	}

	/**
	 * Set eoetDeliveryPlaceCode
	 */
	public void setEoetDeliveryPlaceCode(String eoetDeliveryPlaceCode) {
		this.eoetDeliveryPlaceCode = eoetDeliveryPlaceCode;
		addValidField("eoetDeliveryPlaceCode");
	}

	/**
	 * Get eoetDeliveryPlaceName
	 */
	@Column(name = "EOET_DELIVERY_PLACE_NAME")
	public String getEoetDeliveryPlaceName() {
		return eoetDeliveryPlaceName;
	}

	/**
	 * Set eoetDeliveryPlaceName
	 */
	public void setEoetDeliveryPlaceName(String eoetDeliveryPlaceName) {
		this.eoetDeliveryPlaceName = eoetDeliveryPlaceName;
		addValidField("eoetDeliveryPlaceName");
	}

	/**
	 * Get eoetShipperEbsaId
	 */
	@Column(name = "EOET_SHIPPER_EBSA_ID")
	public Long getEoetShipperEbsaId() {
		return eoetShipperEbsaId;
	}

	/**
	 * Set eoetShipperEbsaId
	 */
	public void setEoetShipperEbsaId(Long eoetShipperEbsaId) {
		this.eoetShipperEbsaId = eoetShipperEbsaId;
		addValidField("eoetShipperEbsaId");
	}

	/**
	 * Get eoetDeliveryPlaceAddress
	 */
	@Column(name = "EOET_DELIVERY_PLACE_ADDRESS")
	public String getEoetDeliveryPlaceAddress() {
		return eoetDeliveryPlaceAddress;
	}

	/**
	 * Set eoetDeliveryPlaceAddress
	 */
	public void setEoetDeliveryPlaceAddress(String eoetDeliveryPlaceAddress) {
		this.eoetDeliveryPlaceAddress = eoetDeliveryPlaceAddress;
		addValidField("eoetDeliveryPlaceAddress");
	}

	/**
	 * Get eoetEbsaContact
	 */
	@Column(name = "EOET_EBSA_CONTACT")
	public String getEoetEbsaContact() {
		return eoetEbsaContact;
	}

	/**
	 * Set eoetEbsaContact
	 */
	public void setEoetEbsaContact(String eoetEbsaContact) {
		this.eoetEbsaContact = eoetEbsaContact;
		addValidField("eoetEbsaContact");
	}

	/**
	 * Get eoetEbsaTel
	 */
	@Column(name = "EOET_EBSA_TEL")
	public String getEoetEbsaTel() {
		return eoetEbsaTel;
	}

	/**
	 * Set eoetEbsaTel
	 */
	public void setEoetEbsaTel(String eoetEbsaTel) {
		this.eoetEbsaTel = eoetEbsaTel;
		addValidField("eoetEbsaTel");
	}

	/**
	 * Get eoetCollectPortId
	 */
	@Column(name = "EOET_COLLECT_PORT_ID")
	public Long getEoetCollectPortId() {
		return eoetCollectPortId;
	}

	/**
	 * Set eoetCollectPortId
	 */
	public void setEoetCollectPortId(Long eoetCollectPortId) {
		this.eoetCollectPortId = eoetCollectPortId;
		addValidField("eoetCollectPortId");
	}

	/**
	 * Get eoetCollectPortCode
	 */
	@Column(name = "EOET_COLLECT_PORT_CODE")
	public String getEoetCollectPortCode() {
		return eoetCollectPortCode;
	}

	/**
	 * Set eoetCollectPortCode
	 */
	public void setEoetCollectPortCode(String eoetCollectPortCode) {
		this.eoetCollectPortCode = eoetCollectPortCode;
		addValidField("eoetCollectPortCode");
	}

	/**
	 * Get eoetCollectPortName
	 */
	@Column(name = "EOET_COLLECT_PORT_NAME")
	public String getEoetCollectPortName() {
		return eoetCollectPortName;
	}

	/**
	 * Set eoetCollectPortName
	 */
	public void setEoetCollectPortName(String eoetCollectPortName) {
		this.eoetCollectPortName = eoetCollectPortName;
		addValidField("eoetCollectPortName");
	}

	/**
	 * Get eoetTrailerCompanyId
	 */
	@Column(name = "EOET_TRAILER_COMPANY_ID")
	public Long getEoetTrailerCompanyId() {
		return eoetTrailerCompanyId;
	}

	/**
	 * Set eoetTrailerCompanyId
	 */
	public void setEoetTrailerCompanyId(Long eoetTrailerCompanyId) {
		this.eoetTrailerCompanyId = eoetTrailerCompanyId;
		addValidField("eoetTrailerCompanyId");
	}

	/**
	 * Get eoetTrailerCompanyNo
	 */
	@Column(name = "EOET_TRAILER_COMPANY_NO")
	public String getEoetTrailerCompanyNo() {
		return eoetTrailerCompanyNo;
	}

	/**
	 * Set eoetTrailerCompanyNo
	 */
	public void setEoetTrailerCompanyNo(String eoetTrailerCompanyNo) {
		this.eoetTrailerCompanyNo = eoetTrailerCompanyNo;
		addValidField("eoetTrailerCompanyNo");
	}

	/**
	 * Get eoetTrailerCompanyName
	 */
	@Column(name = "EOET_TRAILER_COMPANY_NAME")
	public String getEoetTrailerCompanyName() {
		return eoetTrailerCompanyName;
	}

	/**
	 * Set eoetTrailerCompanyName
	 */
	public void setEoetTrailerCompanyName(String eoetTrailerCompanyName) {
		this.eoetTrailerCompanyName = eoetTrailerCompanyName;
		addValidField("eoetTrailerCompanyName");
	}

	/**
	 * Get eoetOwnContainerId
	 */
	@Column(name = "EOET_OWN_CONTAINER_ID")
	public Long getEoetOwnContainerId() {
		return eoetOwnContainerId;
	}

	/**
	 * Set eoetOwnContainerId
	 */
	public void setEoetOwnContainerId(Long eoetOwnContainerId) {
		this.eoetOwnContainerId = eoetOwnContainerId;
		addValidField("eoetOwnContainerId");
	}

	/**
	 * Get eoetOwnContainerName
	 */
	@Column(name = "EOET_OWN_CONTAINER_NAME")
	public String getEoetOwnContainerName() {
		return eoetOwnContainerName;
	}

	/**
	 * Set eoetOwnContainerName
	 */
	public void setEoetOwnContainerName(String eoetOwnContainerName) {
		this.eoetOwnContainerName = eoetOwnContainerName;
		addValidField("eoetOwnContainerName");
	}

	/**
	 * Get eoetContainerTime
	 */
	@Column(name = "EOET_CONTAINER_TIME")
	public Date getEoetContainerTime() {
		return eoetContainerTime;
	}

	/**
	 * Set eoetContainerTime
	 */
	public void setEoetContainerTime(Date eoetContainerTime) {
		this.eoetContainerTime = eoetContainerTime;
		addValidField("eoetContainerTime");
	}

	/**
	 * Get eoetDeliveryTime
	 */
	@Column(name = "EOET_DELIVERY_TIME")
	public Date getEoetDeliveryTime() {
		return eoetDeliveryTime;
	}

	/**
	 * Set eoetDeliveryTime
	 */
	public void setEoetDeliveryTime(Date eoetDeliveryTime) {
		this.eoetDeliveryTime = eoetDeliveryTime;
		addValidField("eoetDeliveryTime");
	}

	/**
	 * Get eoetSetPostTime
	 */
	@Column(name = "EOET_SET_POST_TIME")
	public Date getEoetSetPostTime() {
		return eoetSetPostTime;
	}

	/**
	 * Set eoetSetPostTime
	 */
	public void setEoetSetPostTime(Date eoetSetPostTime) {
		this.eoetSetPostTime = eoetSetPostTime;
		addValidField("eoetSetPostTime");
	}

	/**
	 * Get eoetExternalOrderNo
	 */
	@Column(name = "EOET_EXTERNAL_ORDER_NO")
	public String getEoetExternalOrderNo() {
		return eoetExternalOrderNo;
	}

	/**
	 * Set eoetExternalOrderNo
	 */
	public void setEoetExternalOrderNo(String eoetExternalOrderNo) {
		this.eoetExternalOrderNo = eoetExternalOrderNo;
		addValidField("eoetExternalOrderNo");
	}

	/**
	 * Get eoetContainerTypeWeight
	 */
	@Column(name = "EOET_CONTAINER_TYPE_WEIGHT")
	public String getEoetContainerTypeWeight() {
		return eoetContainerTypeWeight;
	}

	/**
	 * Set eoetContainerTypeWeight
	 */
	public void setEoetContainerTypeWeight(String eoetContainerTypeWeight) {
		this.eoetContainerTypeWeight = eoetContainerTypeWeight;
		addValidField("eoetContainerTypeWeight");
	}

	/**
	 * Get eoetWeight
	 */
	@Column(name = "EOET_WEIGHT")
	public Long getEoetWeight() {
		return eoetWeight;
	}

	/**
	 * Set eoetWeight
	 */
	public void setEoetWeight(Long eoetWeight) {
		this.eoetWeight = eoetWeight;
		addValidField("eoetWeight");
	}

	/**
	 * Get eoetNetWeight
	 */
	@Column(name = "EOET_NET_WEIGHT")
	public Long getEoetNetWeight() {
		return eoetNetWeight;
	}

	/**
	 * Set eoetNetWeight
	 */
	public void setEoetNetWeight(Long eoetNetWeight) {
		this.eoetNetWeight = eoetNetWeight;
		addValidField("eoetNetWeight");
	}

	/**
	 * Get eoetQuantity
	 */
	@Column(name = "EOET_QUANTITY")
	public Long getEoetQuantity() {
		return eoetQuantity;
	}

	/**
	 * Set eoetQuantity
	 */
	public void setEoetQuantity(Long eoetQuantity) {
		this.eoetQuantity = eoetQuantity;
		addValidField("eoetQuantity");
	}

	/**
	 * Get eoetVolume
	 */
	@Column(name = "EOET_VOLUME")
	public Long getEoetVolume() {
		return eoetVolume;
	}

	/**
	 * Set eoetVolume
	 */
	public void setEoetVolume(Long eoetVolume) {
		this.eoetVolume = eoetVolume;
		addValidField("eoetVolume");
	}

	/**
	 * Get eoetCauseDelay
	 */
	@Column(name = "EOET_CAUSE_DELAY")
	public String getEoetCauseDelay() {
		return eoetCauseDelay;
	}

	/**
	 * Set eoetCauseDelay
	 */
	public void setEoetCauseDelay(String eoetCauseDelay) {
		this.eoetCauseDelay = eoetCauseDelay;
		addValidField("eoetCauseDelay");
	}

	/**
	 * Get eoetTransReq
	 */
	@Column(name = "EOET_TRANS_REQ")
	public String getEoetTransReq() {
		return eoetTransReq;
	}

	/**
	 * Set eoetTransReq
	 */
	public void setEoetTransReq(String eoetTransReq) {
		this.eoetTransReq = eoetTransReq;
		addValidField("eoetTransReq");
	}

	/**
	 * Get eoetConsigneeReq
	 */
	@Column(name = "EOET_CONSIGNEE_REQ")
	public String getEoetConsigneeReq() {
		return eoetConsigneeReq;
	}

	/**
	 * Set eoetConsigneeReq
	 */
	public void setEoetConsigneeReq(String eoetConsigneeReq) {
		this.eoetConsigneeReq = eoetConsigneeReq;
		addValidField("eoetConsigneeReq");
	}

	/**
	 * Get eoetDocReq
	 */
	@Column(name = "EOET_DOC_REQ")
	public String getEoetDocReq() {
		return eoetDocReq;
	}

	/**
	 * Set eoetDocReq
	 */
	public void setEoetDocReq(String eoetDocReq) {
		this.eoetDocReq = eoetDocReq;
		addValidField("eoetDocReq");
	}

	/**
	 * Get eoetRemark
	 */
	@Column(name = "EOET_REMARK")
	public String getEoetRemark() {
		return eoetRemark;
	}

	/**
	 * Set eoetRemark
	 */
	public void setEoetRemark(String eoetRemark) {
		this.eoetRemark = eoetRemark;
		addValidField("eoetRemark");
	}

	/**
	 * Get eoetSubstr1
	 */
	@Column(name = "EOET_SUBSTR1")
	public String getEoetSubstr1() {
		return eoetSubstr1;
	}

	/**
	 * Set eoetSubstr1
	 */
	public void setEoetSubstr1(String eoetSubstr1) {
		this.eoetSubstr1 = eoetSubstr1;
		addValidField("eoetSubstr1");
	}

	/**
	 * Get eoetSubstr2
	 */
	@Column(name = "EOET_SUBSTR2")
	public String getEoetSubstr2() {
		return eoetSubstr2;
	}

	/**
	 * Set eoetSubstr2
	 */
	public void setEoetSubstr2(String eoetSubstr2) {
		this.eoetSubstr2 = eoetSubstr2;
		addValidField("eoetSubstr2");
	}

	/**
	 * Get eoetSubstr3
	 */
	@Column(name = "EOET_SUBSTR3")
	public String getEoetSubstr3() {
		return eoetSubstr3;
	}

	/**
	 * Set eoetSubstr3
	 */
	public void setEoetSubstr3(String eoetSubstr3) {
		this.eoetSubstr3 = eoetSubstr3;
		addValidField("eoetSubstr3");
	}

	/**
	 * Get eoetSubstr4
	 */
	@Column(name = "EOET_SUBSTR4")
	public String getEoetSubstr4() {
		return eoetSubstr4;
	}

	/**
	 * Set eoetSubstr4
	 */
	public void setEoetSubstr4(String eoetSubstr4) {
		this.eoetSubstr4 = eoetSubstr4;
		addValidField("eoetSubstr4");
	}

	/**
	 * Get eoetSubstr5
	 */
	@Column(name = "EOET_SUBSTR5")
	public String getEoetSubstr5() {
		return eoetSubstr5;
	}

	/**
	 * Set eoetSubstr5
	 */
	public void setEoetSubstr5(String eoetSubstr5) {
		this.eoetSubstr5 = eoetSubstr5;
		addValidField("eoetSubstr5");
	}

	/**
	 * Get eoetSubstr6
	 */
	@Column(name = "EOET_SUBSTR6")
	public String getEoetSubstr6() {
		return eoetSubstr6;
	}

	/**
	 * Set eoetSubstr6
	 */
	public void setEoetSubstr6(String eoetSubstr6) {
		this.eoetSubstr6 = eoetSubstr6;
		addValidField("eoetSubstr6");
	}

	/**
	 * Get eoetSubstr7
	 */
	@Column(name = "EOET_SUBSTR7")
	public String getEoetSubstr7() {
		return eoetSubstr7;
	}

	/**
	 * Set eoetSubstr7
	 */
	public void setEoetSubstr7(String eoetSubstr7) {
		this.eoetSubstr7 = eoetSubstr7;
		addValidField("eoetSubstr7");
	}

	/**
	 * Get eoetSubstr8
	 */
	@Column(name = "EOET_SUBSTR8")
	public String getEoetSubstr8() {
		return eoetSubstr8;
	}

	/**
	 * Set eoetSubstr8
	 */
	public void setEoetSubstr8(String eoetSubstr8) {
		this.eoetSubstr8 = eoetSubstr8;
		addValidField("eoetSubstr8");
	}

	/**
	 * Get eoetSubstr9
	 */
	@Column(name = "EOET_SUBSTR9")
	public String getEoetSubstr9() {
		return eoetSubstr9;
	}

	/**
	 * Set eoetSubstr9
	 */
	public void setEoetSubstr9(String eoetSubstr9) {
		this.eoetSubstr9 = eoetSubstr9;
		addValidField("eoetSubstr9");
	}

	/**
	 * Get eoetSubstr10
	 */
	@Column(name = "EOET_SUBSTR10")
	public String getEoetSubstr10() {
		return eoetSubstr10;
	}

	/**
	 * Set eoetSubstr10
	 */
	public void setEoetSubstr10(String eoetSubstr10) {
		this.eoetSubstr10 = eoetSubstr10;
		addValidField("eoetSubstr10");
	}

	/**
	 * Get eoetSubstr11
	 */
	@Column(name = "EOET_SUBSTR11")
	public String getEoetSubstr11() {
		return eoetSubstr11;
	}

	/**
	 * Set eoetSubstr11
	 */
	public void setEoetSubstr11(String eoetSubstr11) {
		this.eoetSubstr11 = eoetSubstr11;
		addValidField("eoetSubstr11");
	}

	/**
	 * Get eoetSubstr12
	 */
	@Column(name = "EOET_SUBSTR12")
	public String getEoetSubstr12() {
		return eoetSubstr12;
	}

	/**
	 * Set eoetSubstr12
	 */
	public void setEoetSubstr12(String eoetSubstr12) {
		this.eoetSubstr12 = eoetSubstr12;
		addValidField("eoetSubstr12");
	}

	/**
	 * Get eoetSubstr13
	 */
	@Column(name = "EOET_SUBSTR13")
	public String getEoetSubstr13() {
		return eoetSubstr13;
	}

	/**
	 * Set eoetSubstr13
	 */
	public void setEoetSubstr13(String eoetSubstr13) {
		this.eoetSubstr13 = eoetSubstr13;
		addValidField("eoetSubstr13");
	}

	/**
	 * Get eoetSubstr14
	 */
	@Column(name = "EOET_SUBSTR14")
	public String getEoetSubstr14() {
		return eoetSubstr14;
	}

	/**
	 * Set eoetSubstr14
	 */
	public void setEoetSubstr14(String eoetSubstr14) {
		this.eoetSubstr14 = eoetSubstr14;
		addValidField("eoetSubstr14");
	}

	/**
	 * Get eoetSubstr15
	 */
	@Column(name = "EOET_SUBSTR15")
	public String getEoetSubstr15() {
		return eoetSubstr15;
	}

	/**
	 * Set eoetSubstr15
	 */
	public void setEoetSubstr15(String eoetSubstr15) {
		this.eoetSubstr15 = eoetSubstr15;
		addValidField("eoetSubstr15");
	}

	/**
	 * Get eoetSubstr16
	 */
	@Column(name = "EOET_SUBSTR16")
	public String getEoetSubstr16() {
		return eoetSubstr16;
	}

	/**
	 * Set eoetSubstr16
	 */
	public void setEoetSubstr16(String eoetSubstr16) {
		this.eoetSubstr16 = eoetSubstr16;
		addValidField("eoetSubstr16");
	}

	/**
	 * Get eoetSubstr17
	 */
	@Column(name = "EOET_SUBSTR17")
	public String getEoetSubstr17() {
		return eoetSubstr17;
	}

	/**
	 * Set eoetSubstr17
	 */
	public void setEoetSubstr17(String eoetSubstr17) {
		this.eoetSubstr17 = eoetSubstr17;
		addValidField("eoetSubstr17");
	}

	/**
	 * Get eoetSubstr18
	 */
	@Column(name = "EOET_SUBSTR18")
	public String getEoetSubstr18() {
		return eoetSubstr18;
	}

	/**
	 * Set eoetSubstr18
	 */
	public void setEoetSubstr18(String eoetSubstr18) {
		this.eoetSubstr18 = eoetSubstr18;
		addValidField("eoetSubstr18");
	}

	/**
	 * Get eoetSubstr19
	 */
	@Column(name = "EOET_SUBSTR19")
	public String getEoetSubstr19() {
		return eoetSubstr19;
	}

	/**
	 * Set eoetSubstr19
	 */
	public void setEoetSubstr19(String eoetSubstr19) {
		this.eoetSubstr19 = eoetSubstr19;
		addValidField("eoetSubstr19");
	}

	/**
	 * Get eoetSubstr20
	 */
	@Column(name = "EOET_SUBSTR20")
	public String getEoetSubstr20() {
		return eoetSubstr20;
	}

	/**
	 * Set eoetSubstr20
	 */
	public void setEoetSubstr20(String eoetSubstr20) {
		this.eoetSubstr20 = eoetSubstr20;
		addValidField("eoetSubstr20");
	}

	/**
	 * Get eoetSubstr21
	 */
	@Column(name = "EOET_SUBSTR21")
	public String getEoetSubstr21() {
		return eoetSubstr21;
	}

	/**
	 * Set eoetSubstr21
	 */
	public void setEoetSubstr21(String eoetSubstr21) {
		this.eoetSubstr21 = eoetSubstr21;
		addValidField("eoetSubstr21");
	}

	/**
	 * Get eoetSubstr22
	 */
	@Column(name = "EOET_SUBSTR22")
	public String getEoetSubstr22() {
		return eoetSubstr22;
	}

	/**
	 * Set eoetSubstr22
	 */
	public void setEoetSubstr22(String eoetSubstr22) {
		this.eoetSubstr22 = eoetSubstr22;
		addValidField("eoetSubstr22");
	}

	/**
	 * Get eoetSubstr23
	 */
	@Column(name = "EOET_SUBSTR23")
	public String getEoetSubstr23() {
		return eoetSubstr23;
	}

	/**
	 * Set eoetSubstr23
	 */
	public void setEoetSubstr23(String eoetSubstr23) {
		this.eoetSubstr23 = eoetSubstr23;
		addValidField("eoetSubstr23");
	}

	/**
	 * Get eoetSubstr24
	 */
	@Column(name = "EOET_SUBSTR24")
	public String getEoetSubstr24() {
		return eoetSubstr24;
	}

	/**
	 * Set eoetSubstr24
	 */
	public void setEoetSubstr24(String eoetSubstr24) {
		this.eoetSubstr24 = eoetSubstr24;
		addValidField("eoetSubstr24");
	}

	/**
	 * Get eoetSubstr25
	 */
	@Column(name = "EOET_SUBSTR25")
	public String getEoetSubstr25() {
		return eoetSubstr25;
	}

	/**
	 * Set eoetSubstr25
	 */
	public void setEoetSubstr25(String eoetSubstr25) {
		this.eoetSubstr25 = eoetSubstr25;
		addValidField("eoetSubstr25");
	}

	/**
	 * Get eoetSubdate1
	 */
	@Column(name = "EOET_SUBDATE1")
	public Date getEoetSubdate1() {
		return eoetSubdate1;
	}

	/**
	 * Set eoetSubdate1
	 */
	public void setEoetSubdate1(Date eoetSubdate1) {
		this.eoetSubdate1 = eoetSubdate1;
		addValidField("eoetSubdate1");
	}

	/**
	 * Get eoetSubdate2
	 */
	@Column(name = "EOET_SUBDATE2")
	public Date getEoetSubdate2() {
		return eoetSubdate2;
	}

	/**
	 * Set eoetSubdate2
	 */
	public void setEoetSubdate2(Date eoetSubdate2) {
		this.eoetSubdate2 = eoetSubdate2;
		addValidField("eoetSubdate2");
	}

	/**
	 * Get eoetSubdate3
	 */
	@Column(name = "EOET_SUBDATE3")
	public Date getEoetSubdate3() {
		return eoetSubdate3;
	}

	/**
	 * Set eoetSubdate3
	 */
	public void setEoetSubdate3(Date eoetSubdate3) {
		this.eoetSubdate3 = eoetSubdate3;
		addValidField("eoetSubdate3");
	}

	/**
	 * Get eoetSubdate4
	 */
	@Column(name = "EOET_SUBDATE4")
	public Date getEoetSubdate4() {
		return eoetSubdate4;
	}

	/**
	 * Set eoetSubdate4
	 */
	public void setEoetSubdate4(Date eoetSubdate4) {
		this.eoetSubdate4 = eoetSubdate4;
		addValidField("eoetSubdate4");
	}

	/**
	 * Get eoetSubdate5
	 */
	@Column(name = "EOET_SUBDATE5")
	public Date getEoetSubdate5() {
		return eoetSubdate5;
	}

	/**
	 * Set eoetSubdate5
	 */
	public void setEoetSubdate5(Date eoetSubdate5) {
		this.eoetSubdate5 = eoetSubdate5;
		addValidField("eoetSubdate5");
	}

	/**
	 * Get eoetSubdate6
	 */
	@Column(name = "EOET_SUBDATE6")
	public Date getEoetSubdate6() {
		return eoetSubdate6;
	}

	/**
	 * Set eoetSubdate6
	 */
	public void setEoetSubdate6(Date eoetSubdate6) {
		this.eoetSubdate6 = eoetSubdate6;
		addValidField("eoetSubdate6");
	}

	/**
	 * Get eoetSubdate7
	 */
	@Column(name = "EOET_SUBDATE7")
	public Date getEoetSubdate7() {
		return eoetSubdate7;
	}

	/**
	 * Set eoetSubdate7
	 */
	public void setEoetSubdate7(Date eoetSubdate7) {
		this.eoetSubdate7 = eoetSubdate7;
		addValidField("eoetSubdate7");
	}

	/**
	 * Get eoetSubdate8
	 */
	@Column(name = "EOET_SUBDATE8")
	public Date getEoetSubdate8() {
		return eoetSubdate8;
	}

	/**
	 * Set eoetSubdate8
	 */
	public void setEoetSubdate8(Date eoetSubdate8) {
		this.eoetSubdate8 = eoetSubdate8;
		addValidField("eoetSubdate8");
	}

	/**
	 * Get eoetSubdate9
	 */
	@Column(name = "EOET_SUBDATE9")
	public Date getEoetSubdate9() {
		return eoetSubdate9;
	}

	/**
	 * Set eoetSubdate9
	 */
	public void setEoetSubdate9(Date eoetSubdate9) {
		this.eoetSubdate9 = eoetSubdate9;
		addValidField("eoetSubdate9");
	}

	/**
	 * Get eoetSubdate10
	 */
	@Column(name = "EOET_SUBDATE10")
	public Date getEoetSubdate10() {
		return eoetSubdate10;
	}

	/**
	 * Set eoetSubdate10
	 */
	public void setEoetSubdate10(Date eoetSubdate10) {
		this.eoetSubdate10 = eoetSubdate10;
		addValidField("eoetSubdate10");
	}

	/**
	 * Get eoetSubnum1
	 */
	@Column(name = "EOET_SUBNUM1")
	public Long getEoetSubnum1() {
		return eoetSubnum1;
	}

	/**
	 * Set eoetSubnum1
	 */
	public void setEoetSubnum1(Long eoetSubnum1) {
		this.eoetSubnum1 = eoetSubnum1;
		addValidField("eoetSubnum1");
	}

	/**
	 * Get eoetSubnum2
	 */
	@Column(name = "EOET_SUBNUM2")
	public Long getEoetSubnum2() {
		return eoetSubnum2;
	}

	/**
	 * Set eoetSubnum2
	 */
	public void setEoetSubnum2(Long eoetSubnum2) {
		this.eoetSubnum2 = eoetSubnum2;
		addValidField("eoetSubnum2");
	}

	/**
	 * Get eoetSubnum3
	 */
	@Column(name = "EOET_SUBNUM3")
	public Long getEoetSubnum3() {
		return eoetSubnum3;
	}

	/**
	 * Set eoetSubnum3
	 */
	public void setEoetSubnum3(Long eoetSubnum3) {
		this.eoetSubnum3 = eoetSubnum3;
		addValidField("eoetSubnum3");
	}

	/**
	 * Get eoetSubnum4
	 */
	@Column(name = "EOET_SUBNUM4")
	public Long getEoetSubnum4() {
		return eoetSubnum4;
	}

	/**
	 * Set eoetSubnum4
	 */
	public void setEoetSubnum4(Long eoetSubnum4) {
		this.eoetSubnum4 = eoetSubnum4;
		addValidField("eoetSubnum4");
	}

	/**
	 * Get eoetSubnum5
	 */
	@Column(name = "EOET_SUBNUM5")
	public Long getEoetSubnum5() {
		return eoetSubnum5;
	}

	/**
	 * Set eoetSubnum5
	 */
	public void setEoetSubnum5(Long eoetSubnum5) {
		this.eoetSubnum5 = eoetSubnum5;
		addValidField("eoetSubnum5");
	}

	/**
	 * Get eoetSubnum6
	 */
	@Column(name = "EOET_SUBNUM6")
	public Long getEoetSubnum6() {
		return eoetSubnum6;
	}

	/**
	 * Set eoetSubnum6
	 */
	public void setEoetSubnum6(Long eoetSubnum6) {
		this.eoetSubnum6 = eoetSubnum6;
		addValidField("eoetSubnum6");
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
	 * Get eoetIeFlag
	 */
	@Column(name = "EOET_IE_FLAG")
	public String getEoetIeFlag() {
		return eoetIeFlag;
	}

	/**
	 * Set eoetIeFlag
	 */
	public void setEoetIeFlag(String eoetIeFlag) {
		this.eoetIeFlag = eoetIeFlag;
		addValidField("eoetIeFlag");
	}

	/**
	 * Get eoetDischargeTime
	 */
	@Column(name = "EOET_DISCHARGE_TIME")
	public Date getEoetDischargeTime() {
		return eoetDischargeTime;
	}

	/**
	 * Set eoetDischargeTime
	 */
	public void setEoetDischargeTime(Date eoetDischargeTime) {
		this.eoetDischargeTime = eoetDischargeTime;
		addValidField("eoetDischargeTime");
	}

	/**
	 * Get eoetReturnTime
	 */
	@Column(name = "EOET_RETURN_TIME")
	public Date getEoetReturnTime() {
		return eoetReturnTime;
	}

	/**
	 * Set eoetReturnTime
	 */
	public void setEoetReturnTime(Date eoetReturnTime) {
		this.eoetReturnTime = eoetReturnTime;
		addValidField("eoetReturnTime");
	}

	/**
	 * Get eoetReturnEbrgId
	 */
	@Column(name = "EOET_RETURN_EBRG_ID")
	public Long getEoetReturnEbrgId() {
		return eoetReturnEbrgId;
	}

	/**
	 * Set eoetReturnEbrgId
	 */
	public void setEoetReturnEbrgId(Long eoetReturnEbrgId) {
		this.eoetReturnEbrgId = eoetReturnEbrgId;
		addValidField("eoetReturnEbrgId");
	}

	/**
	 * Get eoetReturnEbrgCode
	 */
	@Column(name = "EOET_RETURN_EBRG_CODE")
	public String getEoetReturnEbrgCode() {
		return eoetReturnEbrgCode;
	}

	/**
	 * Set eoetReturnEbrgCode
	 */
	public void setEoetReturnEbrgCode(String eoetReturnEbrgCode) {
		this.eoetReturnEbrgCode = eoetReturnEbrgCode;
		addValidField("eoetReturnEbrgCode");
	}

	/**
	 * Get eoetReturnEbrgName
	 */
	@Column(name = "EOET_RETURN_EBRG_NAME")
	public String getEoetReturnEbrgName() {
		return eoetReturnEbrgName;
	}

	/**
	 * Set eoetReturnEbrgName
	 */
	public void setEoetReturnEbrgName(String eoetReturnEbrgName) {
		this.eoetReturnEbrgName = eoetReturnEbrgName;
		addValidField("eoetReturnEbrgName");
	}

	/**
	 * Get eoetReqArrivalDate
	 */
	@Column(name = "EOET_REQ_ARRIVAL_DATE")
	public Date getEoetReqArrivalDate() {
		return eoetReqArrivalDate;
	}

	/**
	 * Set eoetReqArrivalDate
	 */
	public void setEoetReqArrivalDate(Date eoetReqArrivalDate) {
		this.eoetReqArrivalDate = eoetReqArrivalDate;
		addValidField("eoetReqArrivalDate");
	}

	/**
	 * Get eoetArrivalPeriod
	 */
	@Column(name = "EOET_ARRIVAL_PERIOD")
	public String getEoetArrivalPeriod() {
		return eoetArrivalPeriod;
	}

	/**
	 * Set eoetArrivalPeriod
	 */
	public void setEoetArrivalPeriod(String eoetArrivalPeriod) {
		this.eoetArrivalPeriod = eoetArrivalPeriod;
		addValidField("eoetArrivalPeriod");
	}

	/**
	 * Get eoetShipperEbspId
	 */
	@Column(name = "EOET_SHIPPER_EBSP_ID")
	public Long getEoetShipperEbspId() {
		return eoetShipperEbspId;
	}

	/**
	 * Set eoetShipperEbspId
	 */
	public void setEoetShipperEbspId(Long eoetShipperEbspId) {
		this.eoetShipperEbspId = eoetShipperEbspId;
		addValidField("eoetShipperEbspId");
	}

	/**
	 * Get eoetShipperEbspCode
	 */
	@Column(name = "EOET_SHIPPER_EBSP_CODE")
	public String getEoetShipperEbspCode() {
		return eoetShipperEbspCode;
	}

	/**
	 * Set eoetShipperEbspCode
	 */
	public void setEoetShipperEbspCode(String eoetShipperEbspCode) {
		this.eoetShipperEbspCode = eoetShipperEbspCode;
		addValidField("eoetShipperEbspCode");
	}

	/**
	 * Get eoetShipperEbspNameCn
	 */
	@Column(name = "EOET_SHIPPER_EBSP_NAME_CN")
	public String getEoetShipperEbspNameCn() {
		return eoetShipperEbspNameCn;
	}

	/**
	 * Set eoetShipperEbspNameCn
	 */
	public void setEoetShipperEbspNameCn(String eoetShipperEbspNameCn) {
		this.eoetShipperEbspNameCn = eoetShipperEbspNameCn;
		addValidField("eoetShipperEbspNameCn");
	}

	/**
	 * Get eoetShipperEbplId
	 */
	@Column(name = "EOET_SHIPPER_EBPL_ID")
	public Long getEoetShipperEbplId() {
		return eoetShipperEbplId;
	}

	/**
	 * Set eoetShipperEbplId
	 */
	public void setEoetShipperEbplId(Long eoetShipperEbplId) {
		this.eoetShipperEbplId = eoetShipperEbplId;
		addValidField("eoetShipperEbplId");
	}

	/**
	 * Get eoetShipperEbplNameCn
	 */
	@Column(name = "EOET_SHIPPER_EBPL_NAME_CN")
	public String getEoetShipperEbplNameCn() {
		return eoetShipperEbplNameCn;
	}

	/**
	 * Set eoetShipperEbplNameCn
	 */
	public void setEoetShipperEbplNameCn(String eoetShipperEbplNameCn) {
		this.eoetShipperEbplNameCn = eoetShipperEbplNameCn;
		addValidField("eoetShipperEbplNameCn");
	}

	/**
	 * Get eoetShipperEbsaPost
	 */
	@Column(name = "EOET_SHIPPER_EBSA_POST")
	public String getEoetShipperEbsaPost() {
		return eoetShipperEbsaPost;
	}

	/**
	 * Set eoetShipperEbsaPost
	 */
	public void setEoetShipperEbsaPost(String eoetShipperEbsaPost) {
		this.eoetShipperEbsaPost = eoetShipperEbsaPost;
		addValidField("eoetShipperEbsaPost");
	}

	/**
	 * Get eoetShipperEbsaFax
	 */
	@Column(name = "EOET_SHIPPER_EBSA_FAX")
	public String getEoetShipperEbsaFax() {
		return eoetShipperEbsaFax;
	}

	/**
	 * Set eoetShipperEbsaFax
	 */
	public void setEoetShipperEbsaFax(String eoetShipperEbsaFax) {
		this.eoetShipperEbsaFax = eoetShipperEbsaFax;
		addValidField("eoetShipperEbsaFax");
	}

	/**
	 * Get eoetShipperEbsaEmail
	 */
	@Column(name = "EOET_SHIPPER_EBSA_EMAIL")
	public String getEoetShipperEbsaEmail() {
		return eoetShipperEbsaEmail;
	}

	/**
	 * Set eoetShipperEbsaEmail
	 */
	public void setEoetShipperEbsaEmail(String eoetShipperEbsaEmail) {
		this.eoetShipperEbsaEmail = eoetShipperEbsaEmail;
		addValidField("eoetShipperEbsaEmail");
	}

	/**
	 * Get eoetContainerTimeAsk
	 */
	@Column(name = "EOET_CONTAINER_TIME_ASK")
	public Date getEoetContainerTimeAsk() {
		return eoetContainerTimeAsk;
	}

	/**
	 * Set eoetContainerTimeAsk
	 */
	public void setEoetContainerTimeAsk(Date eoetContainerTimeAsk) {
		this.eoetContainerTimeAsk = eoetContainerTimeAsk;
		addValidField("eoetContainerTimeAsk");
	}

	/**
	 * Get eoetSetPostTimeAsk
	 */
	@Column(name = "EOET_SET_POST_TIME_ASK")
	public Date getEoetSetPostTimeAsk() {
		return eoetSetPostTimeAsk;
	}

	/**
	 * Set eoetSetPostTimeAsk
	 */
	public void setEoetSetPostTimeAsk(Date eoetSetPostTimeAsk) {
		this.eoetSetPostTimeAsk = eoetSetPostTimeAsk;
		addValidField("eoetSetPostTimeAsk");
	}

	/**
	 * Get eoetBlNo
	 */
	@Column(name = "EOET_BL_NO")
	public String getEoetBlNo() {
		return eoetBlNo;
	}

	/**
	 * Set eoetBlNo
	 */
	public void setEoetBlNo(String eoetBlNo) {
		this.eoetBlNo = eoetBlNo;
		addValidField("eoetBlNo");
	}

	/**
	 * Get eoetCarrierEbcuId
	 */
	@Column(name = "EOET_CARRIER_EBCU_ID")
	public Long getEoetCarrierEbcuId() {
		return eoetCarrierEbcuId;
	}

	/**
	 * Set eoetCarrierEbcuId
	 */
	public void setEoetCarrierEbcuId(Long eoetCarrierEbcuId) {
		this.eoetCarrierEbcuId = eoetCarrierEbcuId;
		addValidField("eoetCarrierEbcuId");
	}

	/**
	 * Get eoetCarrierEbcuCustomerNo
	 */
	@Column(name = "EOET_CARRIER_EBCU_CUSTOMER_NO")
	public String getEoetCarrierEbcuCustomerNo() {
		return eoetCarrierEbcuCustomerNo;
	}

	/**
	 * Set eoetCarrierEbcuCustomerNo
	 */
	public void setEoetCarrierEbcuCustomerNo(String eoetCarrierEbcuCustomerNo) {
		this.eoetCarrierEbcuCustomerNo = eoetCarrierEbcuCustomerNo;
		addValidField("eoetCarrierEbcuCustomerNo");
	}

	/**
	 * Get eoetCarrierEbcuNameCn
	 */
	@Column(name = "EOET_CARRIER_EBCU_NAME_CN")
	public String getEoetCarrierEbcuNameCn() {
		return eoetCarrierEbcuNameCn;
	}

	/**
	 * Set eoetCarrierEbcuNameCn
	 */
	public void setEoetCarrierEbcuNameCn(String eoetCarrierEbcuNameCn) {
		this.eoetCarrierEbcuNameCn = eoetCarrierEbcuNameCn;
		addValidField("eoetCarrierEbcuNameCn");
	}

	/**
	 * Get eoetEbrgId
	 */
	@Column(name = "EOET_EBRG_ID")
	public Long getEoetEbrgId() {
		return eoetEbrgId;
	}

	/**
	 * Set eoetEbrgId
	 */
	public void setEoetEbrgId(Long eoetEbrgId) {
		this.eoetEbrgId = eoetEbrgId;
		addValidField("eoetEbrgId");
	}

	/**
	 * Get eoetEbrgNo
	 */
	@Column(name = "EOET_EBRG_NO")
	public String getEoetEbrgNo() {
		return eoetEbrgNo;
	}

	/**
	 * Set eoetEbrgNo
	 */
	public void setEoetEbrgNo(String eoetEbrgNo) {
		this.eoetEbrgNo = eoetEbrgNo;
		addValidField("eoetEbrgNo");
	}

	/**
	 * Get eoetEbrgNameCn
	 */
	@Column(name = "EOET_EBRG_NAME_CN")
	public String getEoetEbrgNameCn() {
		return eoetEbrgNameCn;
	}

	/**
	 * Set eoetEbrgNameCn
	 */
	public void setEoetEbrgNameCn(String eoetEbrgNameCn) {
		this.eoetEbrgNameCn = eoetEbrgNameCn;
		addValidField("eoetEbrgNameCn");
	}

	/**
	 * Get eoetSailingDate
	 */
	@Column(name = "EOET_SAILING_DATE")
	public Date getEoetSailingDate() {
		return eoetSailingDate;
	}

	/**
	 * Set eoetSailingDate
	 */
	public void setEoetSailingDate(Date eoetSailingDate) {
		this.eoetSailingDate = eoetSailingDate;
		addValidField("eoetSailingDate");
	}

	/**
	 * Get eoetTotalSize
	 */
	@Column(name = "EOET_TOTAL_SIZE")
	public String getEoetTotalSize() {
		return eoetTotalSize;
	}

	/**
	 * Set eoetTotalSize
	 */
	public void setEoetTotalSize(String eoetTotalSize) {
		this.eoetTotalSize = eoetTotalSize;
		addValidField("eoetTotalSize");
	}

	/**
	 * Get eoetMainBookingNo
	 */
	@Column(name = "EOET_MAIN_BOOKING_NO")
	public String getEoetMainBookingNo() {
		return eoetMainBookingNo;
	}

	/**
	 * Set eoetMainBookingNo
	 */
	public void setEoetMainBookingNo(String eoetMainBookingNo) {
		this.eoetMainBookingNo = eoetMainBookingNo;
		addValidField("eoetMainBookingNo");
	}

	/**
	 * Get eoetTaskConfirmUser
	 */
	@Column(name = "EOET_TASK_CONFIRM_USER")
	public String getEoetTaskConfirmUser() {
		return eoetTaskConfirmUser;
	}

	/**
	 * Set eoetTaskConfirmUser
	 */
	public void setEoetTaskConfirmUser(String eoetTaskConfirmUser) {
		this.eoetTaskConfirmUser = eoetTaskConfirmUser;
		addValidField("eoetTaskConfirmUser");
	}

	/**
	 * Get eoetTaskConfirmDate
	 */
	@Column(name = "EOET_TASK_CONFIRM_DATE")
	public Date getEoetTaskConfirmDate() {
		return eoetTaskConfirmDate;
	}

	/**
	 * Set eoetTaskConfirmDate
	 */
	public void setEoetTaskConfirmDate(Date eoetTaskConfirmDate) {
		this.eoetTaskConfirmDate = eoetTaskConfirmDate;
		addValidField("eoetTaskConfirmDate");
	}

	/**
	 * Get eoetEscoCode
	 */
	@Column(name = "EOET_ESCO_CODE")
	public String getEoetEscoCode() {
		return eoetEscoCode;
	}

	/**
	 * Set eoetEscoCode
	 */
	public void setEoetEscoCode(String eoetEscoCode) {
		this.eoetEscoCode = eoetEscoCode;
		addValidField("eoetEscoCode");
	}

	/**
	 * Get eoetEscoNameCn
	 */
	@Column(name = "EOET_ESCO_NAME_CN")
	public String getEoetEscoNameCn() {
		return eoetEscoNameCn;
	}

	/**
	 * Set eoetEscoNameCn
	 */
	public void setEoetEscoNameCn(String eoetEscoNameCn) {
		this.eoetEscoNameCn = eoetEscoNameCn;
		addValidField("eoetEscoNameCn");
	}

	/**
	 * Get eoetEsdeDepartmentCode
	 */
	@Column(name = "EOET_ESDE_DEPARTMENT_CODE")
	public String getEoetEsdeDepartmentCode() {
		return eoetEsdeDepartmentCode;
	}

	/**
	 * Set eoetEsdeDepartmentCode
	 */
	public void setEoetEsdeDepartmentCode(String eoetEsdeDepartmentCode) {
		this.eoetEsdeDepartmentCode = eoetEsdeDepartmentCode;
		addValidField("eoetEsdeDepartmentCode");
	}

	/**
	 * Get eoetEsdeDepartmentName
	 */
	@Column(name = "EOET_ESDE_DEPARTMENT_NAME")
	public String getEoetEsdeDepartmentName() {
		return eoetEsdeDepartmentName;
	}

	/**
	 * Set eoetEsdeDepartmentName
	 */
	public void setEoetEsdeDepartmentName(String eoetEsdeDepartmentName) {
		this.eoetEsdeDepartmentName = eoetEsdeDepartmentName;
		addValidField("eoetEsdeDepartmentName");
	}

	/**
	 * Get eoetEsusUserNameCn
	 */
	@Column(name = "EOET_ESUS_USER_NAME_CN")
	public String getEoetEsusUserNameCn() {
		return eoetEsusUserNameCn;
	}

	/**
	 * Set eoetEsusUserNameCn
	 */
	public void setEoetEsusUserNameCn(String eoetEsusUserNameCn) {
		this.eoetEsusUserNameCn = eoetEsusUserNameCn;
		addValidField("eoetEsusUserNameCn");
	}

	/**
	 * Get eoetRetoType
	 */
	@Column(name = "EOET_RETO_TYPE")
	public Long getEoetRetoType() {
		return eoetRetoType;
	}

	/**
	 * Set eoetRetoType
	 */
	public void setEoetRetoType(Long eoetRetoType) {
		this.eoetRetoType = eoetRetoType;
		addValidField("eoetRetoType");
	}

	/**
	 * Get eoetTaskRefuseDate
	 */
	@Column(name = "EOET_TASK_REFUSE_DATE")
	public Date getEoetTaskRefuseDate() {
		return eoetTaskRefuseDate;
	}

	/**
	 * Set eoetTaskRefuseDate
	 */
	public void setEoetTaskRefuseDate(Date eoetTaskRefuseDate) {
		this.eoetTaskRefuseDate = eoetTaskRefuseDate;
		addValidField("eoetTaskRefuseDate");
	}

	/**
	 * Get eoetTranType
	 */
	@Column(name = "EOET_TRAN_TYPE")
	public String getEoetTranType() {
		return eoetTranType;
	}

	/**
	 * Set eoetTranType
	 */
	public void setEoetTranType(String eoetTranType) {
		this.eoetTranType = eoetTranType;
		addValidField("eoetTranType");
	}

	/**
	 * Get eoetIsDutyfree
	 */
	@Column(name = "EOET_IS_DUTYFREE")
	public Long getEoetIsDutyfree() {
		return eoetIsDutyfree;
	}

	/**
	 * Set eoetIsDutyfree
	 */
	public void setEoetIsDutyfree(Long eoetIsDutyfree) {
		this.eoetIsDutyfree = eoetIsDutyfree;
		addValidField("eoetIsDutyfree");
	}

	/**
	 * Get eoetBoxsealBackTime
	 */
	@Column(name = "EOET_BOXSEAL_BACK_TIME")
	public Date getEoetBoxsealBackTime() {
		return eoetBoxsealBackTime;
	}

	/**
	 * Set eoetBoxsealBackTime
	 */
	public void setEoetBoxsealBackTime(Date eoetBoxsealBackTime) {
		this.eoetBoxsealBackTime = eoetBoxsealBackTime;
		addValidField("eoetBoxsealBackTime");
	}

	/**
	 * Get eoetCyInCode
	 */
	@Column(name = "EOET_CY_IN_CODE")
	public String getEoetCyInCode() {
		return eoetCyInCode;
	}

	/**
	 * Set eoetCyInCode
	 */
	public void setEoetCyInCode(String eoetCyInCode) {
		this.eoetCyInCode = eoetCyInCode;
		addValidField("eoetCyInCode");
	}

	/**
	 * Get eoetTransportNo
	 */
	@Column(name = "EOET_TRANSPORT_NO")
	public String getEoetTransportNo() {
		return eoetTransportNo;
	}

	/**
	 * Set eoetTransportNo
	 */
	public void setEoetTransportNo(String eoetTransportNo) {
		this.eoetTransportNo = eoetTransportNo;
		addValidField("eoetTransportNo");
	}

}
