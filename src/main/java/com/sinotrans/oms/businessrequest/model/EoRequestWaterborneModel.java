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
 * Model class for EoRequestWaterborne
 */
@Entity
@Table(name = "EO_REQUEST_WATERBORNE")
public class EoRequestWaterborneModel extends BaseModel implements OperationLog {

	//eorwId
	private Long eorwId;
	//eorwEoorId
	private Long eorwEoorId;
	//eorwEscoId
	private Long eorwEscoId;
	//eorwEbpjId
	private Long eorwEbpjId;
	//eorwLoEbppId
	private Long eorwLoEbppId;
	//eorwEbtkId
	private Long eorwEbtkId;
	//eorwIsAutomatic
	private String eorwIsAutomatic;
	//eorwTaskStatus
	private String eorwTaskStatus;
	//eorwTaskFeedback
	private String eorwTaskFeedback;
	//eorwSysCode
	private String eorwSysCode;
	//eorwEbbuId
	private Long eorwEbbuId;
	//eorwEbbuNameCn
	private String eorwEbbuNameCn;
	//eorwEbbuCode
	private String eorwEbbuCode;
	//eorwEbbuDist1
	private String eorwEbbuDist1;
	//eorwEbbuDist2
	private String eorwEbbuDist2;
	//eorwEbbuDist3
	private String eorwEbbuDist3;
	//eorwEbbuDist4
	private String eorwEbbuDist4;
	//eorwEbbuDist5
	private String eorwEbbuDist5;
	//eorwToId
	private String eorwToId;
	//eorwExternalOrderNo
	private String eorwExternalOrderNo;
	//eorwNo
	private String eorwNo;
	//eorwType
	private String eorwType;
	//eorwStatus
	private String eorwStatus;
	//eorwOrder
	private Long eorwOrder;
	//eorwSoNo
	private String eorwSoNo;
	//eorwDoNo
	private String eorwDoNo;
	//eorwConsignorEbcuId
	private Long eorwConsignorEbcuId;
	//eorwConsignorEbcuCode
	private String eorwConsignorEbcuCode;
	//eorwConsignorEbcuName
	private String eorwConsignorEbcuName;
	//eorwOwnerEbcuId
	private Long eorwOwnerEbcuId;
	//eorwOwnerEbcuCode
	private String eorwOwnerEbcuCode;
	//eorwOwnerEbcuName
	private String eorwOwnerEbcuName;
	//eorwShipperConsignNo
	private String eorwShipperConsignNo;
	//eorwBillNo
	private String eorwBillNo;
	//eorwPayTypeCode
	private String eorwPayTypeCode;
	//eorwTransitClause
	private String eorwTransitClause;
	//eorwBookingEbcuId
	private Long eorwBookingEbcuId;
	//eorwBookingEbcuCode
	private String eorwBookingEbcuCode;
	//eorwBookingEbcuName
	private String eorwBookingEbcuName;
	//eorwBookingRequestDate
	private Date eorwBookingRequestDate;
	//eorwBookingCompletedDate
	private Date eorwBookingCompletedDate;
	//eorwCarrierEbcuId
	private Long eorwCarrierEbcuId;
	//eorwCarrierEbcuCode
	private String eorwCarrierEbcuCode;
	//eorwCarrierEbcuName
	private String eorwCarrierEbcuName;
	//eorwCarrierBookingNo
	private String eorwCarrierBookingNo;
	//eorwVesselName
	private String eorwVesselName;
	//eorwVoyage
	private String eorwVoyage;
	//eorwTrade
	private String eorwTrade;
	//eorwEtd
	private Date eorwEtd;
	//eorwEta
	private Date eorwEta;
	//eorwLoadEbptId
	private Long eorwLoadEbptId;
	//eorwLoadEbptCode
	private String eorwLoadEbptCode;
	//eorwLoadEbptNameCn
	private String eorwLoadEbptNameCn;
	//eorwLoadEbrgId
	private Long eorwLoadEbrgId;
	//eorwLoadEbrgCode
	private String eorwLoadEbrgCode;
	//eorwLoadEbrgName
	private String eorwLoadEbrgName;
	//eorwFinalEbptId
	private Long eorwFinalEbptId;
	//eorwFinalEbptCode
	private String eorwFinalEbptCode;
	//eorwFinalEbptNameCn
	private String eorwFinalEbptNameCn;
	//eorwFinalDestEbrgId
	private Long eorwFinalDestEbrgId;
	//eorwFinalDestEbrgCode
	private String eorwFinalDestEbrgCode;
	//eorwFinalDestEbrgName
	private String eorwFinalDestEbrgName;
	//eorwAtd
	private Date eorwAtd;
	//eorwAta
	private Date eorwAta;
	//eorwTrunkLoadEbptId
	private Long eorwTrunkLoadEbptId;
	//eorwTrunkLoadEbptCode
	private String eorwTrunkLoadEbptCode;
	//eorwTrunkLoadEbptNameCn
	private String eorwTrunkLoadEbptNameCn;
	//eorwTrunkDispEbptId
	private Long eorwTrunkDispEbptId;
	//eorwTrunkDispEbptCode
	private String eorwTrunkDispEbptCode;
	//eorwTrunkDispEbptNameCn
	private String eorwTrunkDispEbptNameCn;
	//eorwShipperEbspId
	private Long eorwShipperEbspId;
	//eorwShipperEbspCode
	private String eorwShipperEbspCode;
	//eorwShipperEbspNameCn
	private String eorwShipperEbspNameCn;
	//eorwShipperEbsaContact
	private String eorwShipperEbsaContact;
	//eorwShipperEbsaTel
	private String eorwShipperEbsaTel;
	//eorwShipperDetail
	private String eorwShipperDetail;
	//eorwConsigneeEbspId
	private Long eorwConsigneeEbspId;
	//eorwConsigneeEbspCode
	private String eorwConsigneeEbspCode;
	//eorwConsigneeEbspNameCn
	private String eorwConsigneeEbspNameCn;
	//eorwConsigneeEbsaContact
	private String eorwConsigneeEbsaContact;
	//eorwConsigneeEbsaTel
	private String eorwConsigneeEbsaTel;
	//eorwConsigneeDetail
	private String eorwConsigneeDetail;
	//eorwContainerVolume
	private String eorwContainerVolume;
	//eorwQuantity
	private Long eorwQuantity;
	//eorwWeight
	private Long eorwWeight;
	//eorwNetWeight
	private Long eorwNetWeight;
	//eorwVolume
	private Long eorwVolume;
	//eorwDelayReason
	private String eorwDelayReason;
	//eorwMergeStatus
	private String eorwMergeStatus;
	//eorwRelationId
	private Long eorwRelationId;
	//eorwContainerNo
	private String eorwContainerNo;
	//eorwRemark
	private String eorwRemark;
	//eorwSubstr1
	private String eorwSubstr1;
	//eorwSubstr2
	private String eorwSubstr2;
	//eorwSubstr3
	private String eorwSubstr3;
	//eorwSubstr4
	private String eorwSubstr4;
	//eorwSubstr5
	private String eorwSubstr5;
	//eorwSubstr6
	private String eorwSubstr6;
	//eorwSubstr7
	private String eorwSubstr7;
	//eorwSubstr8
	private String eorwSubstr8;
	//eorwSubstr9
	private String eorwSubstr9;
	//eorwSubstr10
	private String eorwSubstr10;
	//eorwSubstr11
	private String eorwSubstr11;
	//eorwSubstr12
	private String eorwSubstr12;
	//eorwSubstr13
	private String eorwSubstr13;
	//eorwSubstr14
	private String eorwSubstr14;
	//eorwSubstr15
	private String eorwSubstr15;
	//eorwSubstr16
	private String eorwSubstr16;
	//eorwSubstr17
	private String eorwSubstr17;
	//eorwSubstr18
	private String eorwSubstr18;
	//eorwSubstr19
	private String eorwSubstr19;
	//eorwSubstr20
	private String eorwSubstr20;
	//eorwSubstr21
	private String eorwSubstr21;
	//eorwSubstr22
	private String eorwSubstr22;
	//eorwSubstr23
	private String eorwSubstr23;
	//eorwSubstr24
	private String eorwSubstr24;
	//eorwSubstr25
	private String eorwSubstr25;
	//eorwSubdate1
	private Date eorwSubdate1;
	//eorwSubdate2
	private Date eorwSubdate2;
	//eorwSubdate3
	private Date eorwSubdate3;
	//eorwSubdate4
	private Date eorwSubdate4;
	//eorwSubdate5
	private Date eorwSubdate5;
	//eorwSubdate6
	private Date eorwSubdate6;
	//eorwSubdate7
	private Date eorwSubdate7;
	//eorwSubdate8
	private Date eorwSubdate8;
	//eorwSubdate9
	private Date eorwSubdate9;
	//eorwSubdate10
	private Date eorwSubdate10;
	//eorwSubnum1
	private Long eorwSubnum1;
	//eorwSubnum2
	private Long eorwSubnum2;
	//eorwSubnum3
	private Long eorwSubnum3;
	//eorwSubnum4
	private Long eorwSubnum4;
	//eorwSubnum5
	private Long eorwSubnum5;
	//eorwSubnum6
	private Long eorwSubnum6;
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
	//eorwEscoCode
	private String eorwEscoCode;
	//eorwEscoNameCn
	private String eorwEscoNameCn;
	//eorwEsdeDepartmentCode
	private String eorwEsdeDepartmentCode;
	//eorwEsdeDepartmentName
	private String eorwEsdeDepartmentName;
	//eorwEsusUserNameCn
	private String eorwEsusUserNameCn;
	//eorwRetoType
	private Long eorwRetoType;

	/**
	 * Get eorwId
	 */
	@Column(name = "EORW_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEorwId() {
		return eorwId;
	}

	/**
	 * Set eorwId
	 */
	public void setEorwId(Long eorwId) {
		this.eorwId = eorwId;
		addValidField("eorwId");
	}

	/**
	 * Get eorwEoorId
	 */
	@Column(name = "EORW_EOOR_ID")
	public Long getEorwEoorId() {
		return eorwEoorId;
	}

	/**
	 * Set eorwEoorId
	 */
	public void setEorwEoorId(Long eorwEoorId) {
		this.eorwEoorId = eorwEoorId;
		addValidField("eorwEoorId");
	}

	/**
	 * Get eorwEscoId
	 */
	@Column(name = "EORW_ESCO_ID")
	public Long getEorwEscoId() {
		return eorwEscoId;
	}

	/**
	 * Set eorwEscoId
	 */
	public void setEorwEscoId(Long eorwEscoId) {
		this.eorwEscoId = eorwEscoId;
		addValidField("eorwEscoId");
	}

	/**
	 * Get eorwEbpjId
	 */
	@Column(name = "EORW_EBPJ_ID")
	public Long getEorwEbpjId() {
		return eorwEbpjId;
	}

	/**
	 * Set eorwEbpjId
	 */
	public void setEorwEbpjId(Long eorwEbpjId) {
		this.eorwEbpjId = eorwEbpjId;
		addValidField("eorwEbpjId");
	}

	/**
	 * Get eorwLoEbppId
	 */
	@Column(name = "EORW_LO_EBPP_ID")
	public Long getEorwLoEbppId() {
		return eorwLoEbppId;
	}

	/**
	 * Set eorwLoEbppId
	 */
	public void setEorwLoEbppId(Long eorwLoEbppId) {
		this.eorwLoEbppId = eorwLoEbppId;
		addValidField("eorwLoEbppId");
	}

	/**
	 * Get eorwEbtkId
	 */
	@Column(name = "EORW_EBTK_ID")
	public Long getEorwEbtkId() {
		return eorwEbtkId;
	}

	/**
	 * Set eorwEbtkId
	 */
	public void setEorwEbtkId(Long eorwEbtkId) {
		this.eorwEbtkId = eorwEbtkId;
		addValidField("eorwEbtkId");
	}

	/**
	 * Get eorwIsAutomatic
	 */
	@Column(name = "EORW_IS_AUTOMATIC")
	public String getEorwIsAutomatic() {
		return eorwIsAutomatic;
	}

	/**
	 * Set eorwIsAutomatic
	 */
	public void setEorwIsAutomatic(String eorwIsAutomatic) {
		this.eorwIsAutomatic = eorwIsAutomatic;
		addValidField("eorwIsAutomatic");
	}

	/**
	 * Get eorwTaskStatus
	 */
	@Column(name = "EORW_TASK_STATUS")
	public String getEorwTaskStatus() {
		return eorwTaskStatus;
	}

	/**
	 * Set eorwTaskStatus
	 */
	public void setEorwTaskStatus(String eorwTaskStatus) {
		this.eorwTaskStatus = eorwTaskStatus;
		addValidField("eorwTaskStatus");
	}

	/**
	 * Get eorwTaskFeedback
	 */
	@Column(name = "EORW_TASK_FEEDBACK")
	public String getEorwTaskFeedback() {
		return eorwTaskFeedback;
	}

	/**
	 * Set eorwTaskFeedback
	 */
	public void setEorwTaskFeedback(String eorwTaskFeedback) {
		this.eorwTaskFeedback = eorwTaskFeedback;
		addValidField("eorwTaskFeedback");
	}

	/**
	 * Get eorwSysCode
	 */
	@Column(name = "EORW_SYS_CODE")
	public String getEorwSysCode() {
		return eorwSysCode;
	}

	/**
	 * Set eorwSysCode
	 */
	public void setEorwSysCode(String eorwSysCode) {
		this.eorwSysCode = eorwSysCode;
		addValidField("eorwSysCode");
	}

	/**
	 * Get eorwEbbuId
	 */
	@Column(name = "EORW_EBBU_ID")
	public Long getEorwEbbuId() {
		return eorwEbbuId;
	}

	/**
	 * Set eorwEbbuId
	 */
	public void setEorwEbbuId(Long eorwEbbuId) {
		this.eorwEbbuId = eorwEbbuId;
		addValidField("eorwEbbuId");
	}

	/**
	 * Get eorwEbbuNameCn
	 */
	@Column(name = "EORW_EBBU_NAME_CN")
	public String getEorwEbbuNameCn() {
		return eorwEbbuNameCn;
	}

	/**
	 * Set eorwEbbuNameCn
	 */
	public void setEorwEbbuNameCn(String eorwEbbuNameCn) {
		this.eorwEbbuNameCn = eorwEbbuNameCn;
		addValidField("eorwEbbuNameCn");
	}

	/**
	 * Get eorwEbbuCode
	 */
	@Column(name = "EORW_EBBU_CODE")
	public String getEorwEbbuCode() {
		return eorwEbbuCode;
	}

	/**
	 * Set eorwEbbuCode
	 */
	public void setEorwEbbuCode(String eorwEbbuCode) {
		this.eorwEbbuCode = eorwEbbuCode;
		addValidField("eorwEbbuCode");
	}

	/**
	 * Get eorwEbbuDist1
	 */
	@Column(name = "EORW_EBBU_DIST_1")
	public String getEorwEbbuDist1() {
		return eorwEbbuDist1;
	}

	/**
	 * Set eorwEbbuDist1
	 */
	public void setEorwEbbuDist1(String eorwEbbuDist1) {
		this.eorwEbbuDist1 = eorwEbbuDist1;
		addValidField("eorwEbbuDist1");
	}

	/**
	 * Get eorwEbbuDist2
	 */
	@Column(name = "EORW_EBBU_DIST_2")
	public String getEorwEbbuDist2() {
		return eorwEbbuDist2;
	}

	/**
	 * Set eorwEbbuDist2
	 */
	public void setEorwEbbuDist2(String eorwEbbuDist2) {
		this.eorwEbbuDist2 = eorwEbbuDist2;
		addValidField("eorwEbbuDist2");
	}

	/**
	 * Get eorwEbbuDist3
	 */
	@Column(name = "EORW_EBBU_DIST_3")
	public String getEorwEbbuDist3() {
		return eorwEbbuDist3;
	}

	/**
	 * Set eorwEbbuDist3
	 */
	public void setEorwEbbuDist3(String eorwEbbuDist3) {
		this.eorwEbbuDist3 = eorwEbbuDist3;
		addValidField("eorwEbbuDist3");
	}

	/**
	 * Get eorwEbbuDist4
	 */
	@Column(name = "EORW_EBBU_DIST_4")
	public String getEorwEbbuDist4() {
		return eorwEbbuDist4;
	}

	/**
	 * Set eorwEbbuDist4
	 */
	public void setEorwEbbuDist4(String eorwEbbuDist4) {
		this.eorwEbbuDist4 = eorwEbbuDist4;
		addValidField("eorwEbbuDist4");
	}

	/**
	 * Get eorwEbbuDist5
	 */
	@Column(name = "EORW_EBBU_DIST_5")
	public String getEorwEbbuDist5() {
		return eorwEbbuDist5;
	}

	/**
	 * Set eorwEbbuDist5
	 */
	public void setEorwEbbuDist5(String eorwEbbuDist5) {
		this.eorwEbbuDist5 = eorwEbbuDist5;
		addValidField("eorwEbbuDist5");
	}

	/**
	 * Get eorwToId
	 */
	@Column(name = "EORW_TO_ID")
	public String getEorwToId() {
		return eorwToId;
	}

	/**
	 * Set eorwToId
	 */
	public void setEorwToId(String eorwToId) {
		this.eorwToId = eorwToId;
		addValidField("eorwToId");
	}

	/**
	 * Get eorwExternalOrderNo
	 */
	@Column(name = "EORW_EXTERNAL_ORDER_NO")
	public String getEorwExternalOrderNo() {
		return eorwExternalOrderNo;
	}

	/**
	 * Set eorwExternalOrderNo
	 */
	public void setEorwExternalOrderNo(String eorwExternalOrderNo) {
		this.eorwExternalOrderNo = eorwExternalOrderNo;
		addValidField("eorwExternalOrderNo");
	}

	/**
	 * Get eorwNo
	 */
	@Column(name = "EORW_NO")
	public String getEorwNo() {
		return eorwNo;
	}

	/**
	 * Set eorwNo
	 */
	public void setEorwNo(String eorwNo) {
		this.eorwNo = eorwNo;
		addValidField("eorwNo");
	}

	/**
	 * Get eorwType
	 */
	@Column(name = "EORW_TYPE")
	public String getEorwType() {
		return eorwType;
	}

	/**
	 * Set eorwType
	 */
	public void setEorwType(String eorwType) {
		this.eorwType = eorwType;
		addValidField("eorwType");
	}

	/**
	 * Get eorwStatus
	 */
	@Column(name = "EORW_STATUS")
	public String getEorwStatus() {
		return eorwStatus;
	}

	/**
	 * Set eorwStatus
	 */
	public void setEorwStatus(String eorwStatus) {
		this.eorwStatus = eorwStatus;
		addValidField("eorwStatus");
	}

	/**
	 * Get eorwOrder
	 */
	@Column(name = "EORW_ORDER")
	public Long getEorwOrder() {
		return eorwOrder;
	}

	/**
	 * Set eorwOrder
	 */
	public void setEorwOrder(Long eorwOrder) {
		this.eorwOrder = eorwOrder;
		addValidField("eorwOrder");
	}

	/**
	 * Get eorwSoNo
	 */
	@Column(name = "EORW_SO_NO")
	public String getEorwSoNo() {
		return eorwSoNo;
	}

	/**
	 * Set eorwSoNo
	 */
	public void setEorwSoNo(String eorwSoNo) {
		this.eorwSoNo = eorwSoNo;
		addValidField("eorwSoNo");
	}

	/**
	 * Get eorwDoNo
	 */
	@Column(name = "EORW_DO_NO")
	public String getEorwDoNo() {
		return eorwDoNo;
	}

	/**
	 * Set eorwDoNo
	 */
	public void setEorwDoNo(String eorwDoNo) {
		this.eorwDoNo = eorwDoNo;
		addValidField("eorwDoNo");
	}

	/**
	 * Get eorwConsignorEbcuId
	 */
	@Column(name = "EORW_CONSIGNOR_EBCU_ID")
	public Long getEorwConsignorEbcuId() {
		return eorwConsignorEbcuId;
	}

	/**
	 * Set eorwConsignorEbcuId
	 */
	public void setEorwConsignorEbcuId(Long eorwConsignorEbcuId) {
		this.eorwConsignorEbcuId = eorwConsignorEbcuId;
		addValidField("eorwConsignorEbcuId");
	}

	/**
	 * Get eorwConsignorEbcuCode
	 */
	@Column(name = "EORW_CONSIGNOR_EBCU_CODE")
	public String getEorwConsignorEbcuCode() {
		return eorwConsignorEbcuCode;
	}

	/**
	 * Set eorwConsignorEbcuCode
	 */
	public void setEorwConsignorEbcuCode(String eorwConsignorEbcuCode) {
		this.eorwConsignorEbcuCode = eorwConsignorEbcuCode;
		addValidField("eorwConsignorEbcuCode");
	}

	/**
	 * Get eorwConsignorEbcuName
	 */
	@Column(name = "EORW_CONSIGNOR_EBCU_NAME")
	public String getEorwConsignorEbcuName() {
		return eorwConsignorEbcuName;
	}

	/**
	 * Set eorwConsignorEbcuName
	 */
	public void setEorwConsignorEbcuName(String eorwConsignorEbcuName) {
		this.eorwConsignorEbcuName = eorwConsignorEbcuName;
		addValidField("eorwConsignorEbcuName");
	}

	/**
	 * Get eorwOwnerEbcuId
	 */
	@Column(name = "EORW_OWNER_EBCU_ID")
	public Long getEorwOwnerEbcuId() {
		return eorwOwnerEbcuId;
	}

	/**
	 * Set eorwOwnerEbcuId
	 */
	public void setEorwOwnerEbcuId(Long eorwOwnerEbcuId) {
		this.eorwOwnerEbcuId = eorwOwnerEbcuId;
		addValidField("eorwOwnerEbcuId");
	}

	/**
	 * Get eorwOwnerEbcuCode
	 */
	@Column(name = "EORW_OWNER_EBCU_CODE")
	public String getEorwOwnerEbcuCode() {
		return eorwOwnerEbcuCode;
	}

	/**
	 * Set eorwOwnerEbcuCode
	 */
	public void setEorwOwnerEbcuCode(String eorwOwnerEbcuCode) {
		this.eorwOwnerEbcuCode = eorwOwnerEbcuCode;
		addValidField("eorwOwnerEbcuCode");
	}

	/**
	 * Get eorwOwnerEbcuName
	 */
	@Column(name = "EORW_OWNER_EBCU_NAME")
	public String getEorwOwnerEbcuName() {
		return eorwOwnerEbcuName;
	}

	/**
	 * Set eorwOwnerEbcuName
	 */
	public void setEorwOwnerEbcuName(String eorwOwnerEbcuName) {
		this.eorwOwnerEbcuName = eorwOwnerEbcuName;
		addValidField("eorwOwnerEbcuName");
	}

	/**
	 * Get eorwShipperConsignNo
	 */
	@Column(name = "EORW_SHIPPER_CONSIGN_NO")
	public String getEorwShipperConsignNo() {
		return eorwShipperConsignNo;
	}

	/**
	 * Set eorwShipperConsignNo
	 */
	public void setEorwShipperConsignNo(String eorwShipperConsignNo) {
		this.eorwShipperConsignNo = eorwShipperConsignNo;
		addValidField("eorwShipperConsignNo");
	}

	/**
	 * Get eorwBillNo
	 */
	@Column(name = "EORW_BILL_NO")
	public String getEorwBillNo() {
		return eorwBillNo;
	}

	/**
	 * Set eorwBillNo
	 */
	public void setEorwBillNo(String eorwBillNo) {
		this.eorwBillNo = eorwBillNo;
		addValidField("eorwBillNo");
	}

	/**
	 * Get eorwPayTypeCode
	 */
	@Column(name = "EORW_PAY_TYPE_CODE")
	public String getEorwPayTypeCode() {
		return eorwPayTypeCode;
	}

	/**
	 * Set eorwPayTypeCode
	 */
	public void setEorwPayTypeCode(String eorwPayTypeCode) {
		this.eorwPayTypeCode = eorwPayTypeCode;
		addValidField("eorwPayTypeCode");
	}

	/**
	 * Get eorwTransitClause
	 */
	@Column(name = "EORW_TRANSIT_CLAUSE")
	public String getEorwTransitClause() {
		return eorwTransitClause;
	}

	/**
	 * Set eorwTransitClause
	 */
	public void setEorwTransitClause(String eorwTransitClause) {
		this.eorwTransitClause = eorwTransitClause;
		addValidField("eorwTransitClause");
	}

	/**
	 * Get eorwBookingEbcuId
	 */
	@Column(name = "EORW_BOOKING_EBCU_ID")
	public Long getEorwBookingEbcuId() {
		return eorwBookingEbcuId;
	}

	/**
	 * Set eorwBookingEbcuId
	 */
	public void setEorwBookingEbcuId(Long eorwBookingEbcuId) {
		this.eorwBookingEbcuId = eorwBookingEbcuId;
		addValidField("eorwBookingEbcuId");
	}

	/**
	 * Get eorwBookingEbcuCode
	 */
	@Column(name = "EORW_BOOKING_EBCU_CODE")
	public String getEorwBookingEbcuCode() {
		return eorwBookingEbcuCode;
	}

	/**
	 * Set eorwBookingEbcuCode
	 */
	public void setEorwBookingEbcuCode(String eorwBookingEbcuCode) {
		this.eorwBookingEbcuCode = eorwBookingEbcuCode;
		addValidField("eorwBookingEbcuCode");
	}

	/**
	 * Get eorwBookingEbcuName
	 */
	@Column(name = "EORW_BOOKING_EBCU_NAME")
	public String getEorwBookingEbcuName() {
		return eorwBookingEbcuName;
	}

	/**
	 * Set eorwBookingEbcuName
	 */
	public void setEorwBookingEbcuName(String eorwBookingEbcuName) {
		this.eorwBookingEbcuName = eorwBookingEbcuName;
		addValidField("eorwBookingEbcuName");
	}

	/**
	 * Get eorwBookingRequestDate
	 */
	@Column(name = "EORW_BOOKING_REQUEST_DATE")
	public Date getEorwBookingRequestDate() {
		return eorwBookingRequestDate;
	}

	/**
	 * Set eorwBookingRequestDate
	 */
	public void setEorwBookingRequestDate(Date eorwBookingRequestDate) {
		this.eorwBookingRequestDate = eorwBookingRequestDate;
		addValidField("eorwBookingRequestDate");
	}

	/**
	 * Get eorwBookingCompletedDate
	 */
	@Column(name = "EORW_BOOKING_COMPLETED_DATE")
	public Date getEorwBookingCompletedDate() {
		return eorwBookingCompletedDate;
	}

	/**
	 * Set eorwBookingCompletedDate
	 */
	public void setEorwBookingCompletedDate(Date eorwBookingCompletedDate) {
		this.eorwBookingCompletedDate = eorwBookingCompletedDate;
		addValidField("eorwBookingCompletedDate");
	}

	/**
	 * Get eorwCarrierEbcuId
	 */
	@Column(name = "EORW_CARRIER_EBCU_ID")
	public Long getEorwCarrierEbcuId() {
		return eorwCarrierEbcuId;
	}

	/**
	 * Set eorwCarrierEbcuId
	 */
	public void setEorwCarrierEbcuId(Long eorwCarrierEbcuId) {
		this.eorwCarrierEbcuId = eorwCarrierEbcuId;
		addValidField("eorwCarrierEbcuId");
	}

	/**
	 * Get eorwCarrierEbcuCode
	 */
	@Column(name = "EORW_CARRIER_EBCU_CODE")
	public String getEorwCarrierEbcuCode() {
		return eorwCarrierEbcuCode;
	}

	/**
	 * Set eorwCarrierEbcuCode
	 */
	public void setEorwCarrierEbcuCode(String eorwCarrierEbcuCode) {
		this.eorwCarrierEbcuCode = eorwCarrierEbcuCode;
		addValidField("eorwCarrierEbcuCode");
	}

	/**
	 * Get eorwCarrierEbcuName
	 */
	@Column(name = "EORW_CARRIER_EBCU_NAME")
	public String getEorwCarrierEbcuName() {
		return eorwCarrierEbcuName;
	}

	/**
	 * Set eorwCarrierEbcuName
	 */
	public void setEorwCarrierEbcuName(String eorwCarrierEbcuName) {
		this.eorwCarrierEbcuName = eorwCarrierEbcuName;
		addValidField("eorwCarrierEbcuName");
	}

	/**
	 * Get eorwCarrierBookingNo
	 */
	@Column(name = "EORW_CARRIER_BOOKING_NO")
	public String getEorwCarrierBookingNo() {
		return eorwCarrierBookingNo;
	}

	/**
	 * Set eorwCarrierBookingNo
	 */
	public void setEorwCarrierBookingNo(String eorwCarrierBookingNo) {
		this.eorwCarrierBookingNo = eorwCarrierBookingNo;
		addValidField("eorwCarrierBookingNo");
	}

	/**
	 * Get eorwVesselName
	 */
	@Column(name = "EORW_VESSEL_NAME")
	public String getEorwVesselName() {
		return eorwVesselName;
	}

	/**
	 * Set eorwVesselName
	 */
	public void setEorwVesselName(String eorwVesselName) {
		this.eorwVesselName = eorwVesselName;
		addValidField("eorwVesselName");
	}

	/**
	 * Get eorwVoyage
	 */
	@Column(name = "EORW_VOYAGE")
	public String getEorwVoyage() {
		return eorwVoyage;
	}

	/**
	 * Set eorwVoyage
	 */
	public void setEorwVoyage(String eorwVoyage) {
		this.eorwVoyage = eorwVoyage;
		addValidField("eorwVoyage");
	}

	/**
	 * Get eorwTrade
	 */
	@Column(name = "EORW_TRADE")
	public String getEorwTrade() {
		return eorwTrade;
	}

	/**
	 * Set eorwTrade
	 */
	public void setEorwTrade(String eorwTrade) {
		this.eorwTrade = eorwTrade;
		addValidField("eorwTrade");
	}

	/**
	 * Get eorwEtd
	 */
	@Column(name = "EORW_ETD")
	public Date getEorwEtd() {
		return eorwEtd;
	}

	/**
	 * Set eorwEtd
	 */
	public void setEorwEtd(Date eorwEtd) {
		this.eorwEtd = eorwEtd;
		addValidField("eorwEtd");
	}

	/**
	 * Get eorwEta
	 */
	@Column(name = "EORW_ETA")
	public Date getEorwEta() {
		return eorwEta;
	}

	/**
	 * Set eorwEta
	 */
	public void setEorwEta(Date eorwEta) {
		this.eorwEta = eorwEta;
		addValidField("eorwEta");
	}

	/**
	 * Get eorwLoadEbptId
	 */
	@Column(name = "EORW_LOAD_EBPT_ID")
	public Long getEorwLoadEbptId() {
		return eorwLoadEbptId;
	}

	/**
	 * Set eorwLoadEbptId
	 */
	public void setEorwLoadEbptId(Long eorwLoadEbptId) {
		this.eorwLoadEbptId = eorwLoadEbptId;
		addValidField("eorwLoadEbptId");
	}

	/**
	 * Get eorwLoadEbptCode
	 */
	@Column(name = "EORW_LOAD_EBPT_CODE")
	public String getEorwLoadEbptCode() {
		return eorwLoadEbptCode;
	}

	/**
	 * Set eorwLoadEbptCode
	 */
	public void setEorwLoadEbptCode(String eorwLoadEbptCode) {
		this.eorwLoadEbptCode = eorwLoadEbptCode;
		addValidField("eorwLoadEbptCode");
	}

	/**
	 * Get eorwLoadEbptNameCn
	 */
	@Column(name = "EORW_LOAD_EBPT_NAME_CN")
	public String getEorwLoadEbptNameCn() {
		return eorwLoadEbptNameCn;
	}

	/**
	 * Set eorwLoadEbptNameCn
	 */
	public void setEorwLoadEbptNameCn(String eorwLoadEbptNameCn) {
		this.eorwLoadEbptNameCn = eorwLoadEbptNameCn;
		addValidField("eorwLoadEbptNameCn");
	}

	/**
	 * Get eorwLoadEbrgId
	 */
	@Column(name = "EORW_LOAD_EBRG_ID")
	public Long getEorwLoadEbrgId() {
		return eorwLoadEbrgId;
	}

	/**
	 * Set eorwLoadEbrgId
	 */
	public void setEorwLoadEbrgId(Long eorwLoadEbrgId) {
		this.eorwLoadEbrgId = eorwLoadEbrgId;
		addValidField("eorwLoadEbrgId");
	}

	/**
	 * Get eorwLoadEbrgCode
	 */
	@Column(name = "EORW_LOAD_EBRG_CODE")
	public String getEorwLoadEbrgCode() {
		return eorwLoadEbrgCode;
	}

	/**
	 * Set eorwLoadEbrgCode
	 */
	public void setEorwLoadEbrgCode(String eorwLoadEbrgCode) {
		this.eorwLoadEbrgCode = eorwLoadEbrgCode;
		addValidField("eorwLoadEbrgCode");
	}

	/**
	 * Get eorwLoadEbrgName
	 */
	@Column(name = "EORW_LOAD_EBRG_NAME")
	public String getEorwLoadEbrgName() {
		return eorwLoadEbrgName;
	}

	/**
	 * Set eorwLoadEbrgName
	 */
	public void setEorwLoadEbrgName(String eorwLoadEbrgName) {
		this.eorwLoadEbrgName = eorwLoadEbrgName;
		addValidField("eorwLoadEbrgName");
	}

	/**
	 * Get eorwFinalEbptId
	 */
	@Column(name = "EORW_FINAL_EBPT_ID")
	public Long getEorwFinalEbptId() {
		return eorwFinalEbptId;
	}

	/**
	 * Set eorwFinalEbptId
	 */
	public void setEorwFinalEbptId(Long eorwFinalEbptId) {
		this.eorwFinalEbptId = eorwFinalEbptId;
		addValidField("eorwFinalEbptId");
	}

	/**
	 * Get eorwFinalEbptCode
	 */
	@Column(name = "EORW_FINAL_EBPT_CODE")
	public String getEorwFinalEbptCode() {
		return eorwFinalEbptCode;
	}

	/**
	 * Set eorwFinalEbptCode
	 */
	public void setEorwFinalEbptCode(String eorwFinalEbptCode) {
		this.eorwFinalEbptCode = eorwFinalEbptCode;
		addValidField("eorwFinalEbptCode");
	}

	/**
	 * Get eorwFinalEbptNameCn
	 */
	@Column(name = "EORW_FINAL_EBPT_NAME_CN")
	public String getEorwFinalEbptNameCn() {
		return eorwFinalEbptNameCn;
	}

	/**
	 * Set eorwFinalEbptNameCn
	 */
	public void setEorwFinalEbptNameCn(String eorwFinalEbptNameCn) {
		this.eorwFinalEbptNameCn = eorwFinalEbptNameCn;
		addValidField("eorwFinalEbptNameCn");
	}

	/**
	 * Get eorwFinalDestEbrgId
	 */
	@Column(name = "EORW_FINAL_DEST_EBRG_ID")
	public Long getEorwFinalDestEbrgId() {
		return eorwFinalDestEbrgId;
	}

	/**
	 * Set eorwFinalDestEbrgId
	 */
	public void setEorwFinalDestEbrgId(Long eorwFinalDestEbrgId) {
		this.eorwFinalDestEbrgId = eorwFinalDestEbrgId;
		addValidField("eorwFinalDestEbrgId");
	}

	/**
	 * Get eorwFinalDestEbrgCode
	 */
	@Column(name = "EORW_FINAL_DEST_EBRG_CODE")
	public String getEorwFinalDestEbrgCode() {
		return eorwFinalDestEbrgCode;
	}

	/**
	 * Set eorwFinalDestEbrgCode
	 */
	public void setEorwFinalDestEbrgCode(String eorwFinalDestEbrgCode) {
		this.eorwFinalDestEbrgCode = eorwFinalDestEbrgCode;
		addValidField("eorwFinalDestEbrgCode");
	}

	/**
	 * Get eorwFinalDestEbrgName
	 */
	@Column(name = "EORW_FINAL_DEST_EBRG_NAME")
	public String getEorwFinalDestEbrgName() {
		return eorwFinalDestEbrgName;
	}

	/**
	 * Set eorwFinalDestEbrgName
	 */
	public void setEorwFinalDestEbrgName(String eorwFinalDestEbrgName) {
		this.eorwFinalDestEbrgName = eorwFinalDestEbrgName;
		addValidField("eorwFinalDestEbrgName");
	}

	/**
	 * Get eorwAtd
	 */
	@Column(name = "EORW_ATD")
	public Date getEorwAtd() {
		return eorwAtd;
	}

	/**
	 * Set eorwAtd
	 */
	public void setEorwAtd(Date eorwAtd) {
		this.eorwAtd = eorwAtd;
		addValidField("eorwAtd");
	}

	/**
	 * Get eorwAta
	 */
	@Column(name = "EORW_ATA")
	public Date getEorwAta() {
		return eorwAta;
	}

	/**
	 * Set eorwAta
	 */
	public void setEorwAta(Date eorwAta) {
		this.eorwAta = eorwAta;
		addValidField("eorwAta");
	}

	/**
	 * Get eorwTrunkLoadEbptId
	 */
	@Column(name = "EORW_TRUNK_LOAD_EBPT_ID")
	public Long getEorwTrunkLoadEbptId() {
		return eorwTrunkLoadEbptId;
	}

	/**
	 * Set eorwTrunkLoadEbptId
	 */
	public void setEorwTrunkLoadEbptId(Long eorwTrunkLoadEbptId) {
		this.eorwTrunkLoadEbptId = eorwTrunkLoadEbptId;
		addValidField("eorwTrunkLoadEbptId");
	}

	/**
	 * Get eorwTrunkLoadEbptCode
	 */
	@Column(name = "EORW_TRUNK_LOAD_EBPT_CODE")
	public String getEorwTrunkLoadEbptCode() {
		return eorwTrunkLoadEbptCode;
	}

	/**
	 * Set eorwTrunkLoadEbptCode
	 */
	public void setEorwTrunkLoadEbptCode(String eorwTrunkLoadEbptCode) {
		this.eorwTrunkLoadEbptCode = eorwTrunkLoadEbptCode;
		addValidField("eorwTrunkLoadEbptCode");
	}

	/**
	 * Get eorwTrunkLoadEbptNameCn
	 */
	@Column(name = "EORW_TRUNK_LOAD_EBPT_NAME_CN")
	public String getEorwTrunkLoadEbptNameCn() {
		return eorwTrunkLoadEbptNameCn;
	}

	/**
	 * Set eorwTrunkLoadEbptNameCn
	 */
	public void setEorwTrunkLoadEbptNameCn(String eorwTrunkLoadEbptNameCn) {
		this.eorwTrunkLoadEbptNameCn = eorwTrunkLoadEbptNameCn;
		addValidField("eorwTrunkLoadEbptNameCn");
	}

	/**
	 * Get eorwTrunkDispEbptId
	 */
	@Column(name = "EORW_TRUNK_DISP_EBPT_ID")
	public Long getEorwTrunkDispEbptId() {
		return eorwTrunkDispEbptId;
	}

	/**
	 * Set eorwTrunkDispEbptId
	 */
	public void setEorwTrunkDispEbptId(Long eorwTrunkDispEbptId) {
		this.eorwTrunkDispEbptId = eorwTrunkDispEbptId;
		addValidField("eorwTrunkDispEbptId");
	}

	/**
	 * Get eorwTrunkDispEbptCode
	 */
	@Column(name = "EORW_TRUNK_DISP_EBPT_CODE")
	public String getEorwTrunkDispEbptCode() {
		return eorwTrunkDispEbptCode;
	}

	/**
	 * Set eorwTrunkDispEbptCode
	 */
	public void setEorwTrunkDispEbptCode(String eorwTrunkDispEbptCode) {
		this.eorwTrunkDispEbptCode = eorwTrunkDispEbptCode;
		addValidField("eorwTrunkDispEbptCode");
	}

	/**
	 * Get eorwTrunkDispEbptNameCn
	 */
	@Column(name = "EORW_TRUNK_DISP_EBPT_NAME_CN")
	public String getEorwTrunkDispEbptNameCn() {
		return eorwTrunkDispEbptNameCn;
	}

	/**
	 * Set eorwTrunkDispEbptNameCn
	 */
	public void setEorwTrunkDispEbptNameCn(String eorwTrunkDispEbptNameCn) {
		this.eorwTrunkDispEbptNameCn = eorwTrunkDispEbptNameCn;
		addValidField("eorwTrunkDispEbptNameCn");
	}

	/**
	 * Get eorwShipperEbspId
	 */
	@Column(name = "EORW_SHIPPER_EBSP_ID")
	public Long getEorwShipperEbspId() {
		return eorwShipperEbspId;
	}

	/**
	 * Set eorwShipperEbspId
	 */
	public void setEorwShipperEbspId(Long eorwShipperEbspId) {
		this.eorwShipperEbspId = eorwShipperEbspId;
		addValidField("eorwShipperEbspId");
	}

	/**
	 * Get eorwShipperEbspCode
	 */
	@Column(name = "EORW_SHIPPER_EBSP_CODE")
	public String getEorwShipperEbspCode() {
		return eorwShipperEbspCode;
	}

	/**
	 * Set eorwShipperEbspCode
	 */
	public void setEorwShipperEbspCode(String eorwShipperEbspCode) {
		this.eorwShipperEbspCode = eorwShipperEbspCode;
		addValidField("eorwShipperEbspCode");
	}

	/**
	 * Get eorwShipperEbspNameCn
	 */
	@Column(name = "EORW_SHIPPER_EBSP_NAME_CN")
	public String getEorwShipperEbspNameCn() {
		return eorwShipperEbspNameCn;
	}

	/**
	 * Set eorwShipperEbspNameCn
	 */
	public void setEorwShipperEbspNameCn(String eorwShipperEbspNameCn) {
		this.eorwShipperEbspNameCn = eorwShipperEbspNameCn;
		addValidField("eorwShipperEbspNameCn");
	}

	/**
	 * Get eorwShipperEbsaContact
	 */
	@Column(name = "EORW_SHIPPER_EBSA_CONTACT")
	public String getEorwShipperEbsaContact() {
		return eorwShipperEbsaContact;
	}

	/**
	 * Set eorwShipperEbsaContact
	 */
	public void setEorwShipperEbsaContact(String eorwShipperEbsaContact) {
		this.eorwShipperEbsaContact = eorwShipperEbsaContact;
		addValidField("eorwShipperEbsaContact");
	}

	/**
	 * Get eorwShipperEbsaTel
	 */
	@Column(name = "EORW_SHIPPER_EBSA_TEL")
	public String getEorwShipperEbsaTel() {
		return eorwShipperEbsaTel;
	}

	/**
	 * Set eorwShipperEbsaTel
	 */
	public void setEorwShipperEbsaTel(String eorwShipperEbsaTel) {
		this.eorwShipperEbsaTel = eorwShipperEbsaTel;
		addValidField("eorwShipperEbsaTel");
	}

	/**
	 * Get eorwShipperDetail
	 */
	@Column(name = "EORW_SHIPPER_DETAIL")
	public String getEorwShipperDetail() {
		return eorwShipperDetail;
	}

	/**
	 * Set eorwShipperDetail
	 */
	public void setEorwShipperDetail(String eorwShipperDetail) {
		this.eorwShipperDetail = eorwShipperDetail;
		addValidField("eorwShipperDetail");
	}

	/**
	 * Get eorwConsigneeEbspId
	 */
	@Column(name = "EORW_CONSIGNEE_EBSP_ID")
	public Long getEorwConsigneeEbspId() {
		return eorwConsigneeEbspId;
	}

	/**
	 * Set eorwConsigneeEbspId
	 */
	public void setEorwConsigneeEbspId(Long eorwConsigneeEbspId) {
		this.eorwConsigneeEbspId = eorwConsigneeEbspId;
		addValidField("eorwConsigneeEbspId");
	}

	/**
	 * Get eorwConsigneeEbspCode
	 */
	@Column(name = "EORW_CONSIGNEE_EBSP_CODE")
	public String getEorwConsigneeEbspCode() {
		return eorwConsigneeEbspCode;
	}

	/**
	 * Set eorwConsigneeEbspCode
	 */
	public void setEorwConsigneeEbspCode(String eorwConsigneeEbspCode) {
		this.eorwConsigneeEbspCode = eorwConsigneeEbspCode;
		addValidField("eorwConsigneeEbspCode");
	}

	/**
	 * Get eorwConsigneeEbspNameCn
	 */
	@Column(name = "EORW_CONSIGNEE_EBSP_NAME_CN")
	public String getEorwConsigneeEbspNameCn() {
		return eorwConsigneeEbspNameCn;
	}

	/**
	 * Set eorwConsigneeEbspNameCn
	 */
	public void setEorwConsigneeEbspNameCn(String eorwConsigneeEbspNameCn) {
		this.eorwConsigneeEbspNameCn = eorwConsigneeEbspNameCn;
		addValidField("eorwConsigneeEbspNameCn");
	}

	/**
	 * Get eorwConsigneeEbsaContact
	 */
	@Column(name = "EORW_CONSIGNEE_EBSA_CONTACT")
	public String getEorwConsigneeEbsaContact() {
		return eorwConsigneeEbsaContact;
	}

	/**
	 * Set eorwConsigneeEbsaContact
	 */
	public void setEorwConsigneeEbsaContact(String eorwConsigneeEbsaContact) {
		this.eorwConsigneeEbsaContact = eorwConsigneeEbsaContact;
		addValidField("eorwConsigneeEbsaContact");
	}

	/**
	 * Get eorwConsigneeEbsaTel
	 */
	@Column(name = "EORW_CONSIGNEE_EBSA_TEL")
	public String getEorwConsigneeEbsaTel() {
		return eorwConsigneeEbsaTel;
	}

	/**
	 * Set eorwConsigneeEbsaTel
	 */
	public void setEorwConsigneeEbsaTel(String eorwConsigneeEbsaTel) {
		this.eorwConsigneeEbsaTel = eorwConsigneeEbsaTel;
		addValidField("eorwConsigneeEbsaTel");
	}

	/**
	 * Get eorwConsigneeDetail
	 */
	@Column(name = "EORW_CONSIGNEE_DETAIL")
	public String getEorwConsigneeDetail() {
		return eorwConsigneeDetail;
	}

	/**
	 * Set eorwConsigneeDetail
	 */
	public void setEorwConsigneeDetail(String eorwConsigneeDetail) {
		this.eorwConsigneeDetail = eorwConsigneeDetail;
		addValidField("eorwConsigneeDetail");
	}

	/**
	 * Get eorwContainerVolume
	 */
	@Column(name = "EORW_CONTAINER_VOLUME")
	public String getEorwContainerVolume() {
		return eorwContainerVolume;
	}

	/**
	 * Set eorwContainerVolume
	 */
	public void setEorwContainerVolume(String eorwContainerVolume) {
		this.eorwContainerVolume = eorwContainerVolume;
		addValidField("eorwContainerVolume");
	}

	/**
	 * Get eorwQuantity
	 */
	@Column(name = "EORW_QUANTITY")
	public Long getEorwQuantity() {
		return eorwQuantity;
	}

	/**
	 * Set eorwQuantity
	 */
	public void setEorwQuantity(Long eorwQuantity) {
		this.eorwQuantity = eorwQuantity;
		addValidField("eorwQuantity");
	}

	/**
	 * Get eorwWeight
	 */
	@Column(name = "EORW_WEIGHT")
	public Long getEorwWeight() {
		return eorwWeight;
	}

	/**
	 * Set eorwWeight
	 */
	public void setEorwWeight(Long eorwWeight) {
		this.eorwWeight = eorwWeight;
		addValidField("eorwWeight");
	}

	/**
	 * Get eorwNetWeight
	 */
	@Column(name = "EORW_NET_WEIGHT")
	public Long getEorwNetWeight() {
		return eorwNetWeight;
	}

	/**
	 * Set eorwNetWeight
	 */
	public void setEorwNetWeight(Long eorwNetWeight) {
		this.eorwNetWeight = eorwNetWeight;
		addValidField("eorwNetWeight");
	}

	/**
	 * Get eorwVolume
	 */
	@Column(name = "EORW_VOLUME")
	public Long getEorwVolume() {
		return eorwVolume;
	}

	/**
	 * Set eorwVolume
	 */
	public void setEorwVolume(Long eorwVolume) {
		this.eorwVolume = eorwVolume;
		addValidField("eorwVolume");
	}

	/**
	 * Get eorwDelayReason
	 */
	@Column(name = "EORW_DELAY_REASON")
	public String getEorwDelayReason() {
		return eorwDelayReason;
	}

	/**
	 * Set eorwDelayReason
	 */
	public void setEorwDelayReason(String eorwDelayReason) {
		this.eorwDelayReason = eorwDelayReason;
		addValidField("eorwDelayReason");
	}

	/**
	 * Get eorwMergeStatus
	 */
	@Column(name = "EORW_MERGE_STATUS")
	public String getEorwMergeStatus() {
		return eorwMergeStatus;
	}

	/**
	 * Set eorwMergeStatus
	 */
	public void setEorwMergeStatus(String eorwMergeStatus) {
		this.eorwMergeStatus = eorwMergeStatus;
		addValidField("eorwMergeStatus");
	}

	/**
	 * Get eorwRelationId
	 */
	@Column(name = "EORW_RELATION_ID")
	public Long getEorwRelationId() {
		return eorwRelationId;
	}

	/**
	 * Set eorwRelationId
	 */
	public void setEorwRelationId(Long eorwRelationId) {
		this.eorwRelationId = eorwRelationId;
		addValidField("eorwRelationId");
	}

	/**
	 * Get eorwContainerNo
	 */
	@Column(name = "EORW_CONTAINER_NO")
	public String getEorwContainerNo() {
		return eorwContainerNo;
	}

	/**
	 * Set eorwContainerNo
	 */
	public void setEorwContainerNo(String eorwContainerNo) {
		this.eorwContainerNo = eorwContainerNo;
		addValidField("eorwContainerNo");
	}

	/**
	 * Get eorwRemark
	 */
	@Column(name = "EORW_REMARK")
	public String getEorwRemark() {
		return eorwRemark;
	}

	/**
	 * Set eorwRemark
	 */
	public void setEorwRemark(String eorwRemark) {
		this.eorwRemark = eorwRemark;
		addValidField("eorwRemark");
	}

	/**
	 * Get eorwSubstr1
	 */
	@Column(name = "EORW_SUBSTR1")
	public String getEorwSubstr1() {
		return eorwSubstr1;
	}

	/**
	 * Set eorwSubstr1
	 */
	public void setEorwSubstr1(String eorwSubstr1) {
		this.eorwSubstr1 = eorwSubstr1;
		addValidField("eorwSubstr1");
	}

	/**
	 * Get eorwSubstr2
	 */
	@Column(name = "EORW_SUBSTR2")
	public String getEorwSubstr2() {
		return eorwSubstr2;
	}

	/**
	 * Set eorwSubstr2
	 */
	public void setEorwSubstr2(String eorwSubstr2) {
		this.eorwSubstr2 = eorwSubstr2;
		addValidField("eorwSubstr2");
	}

	/**
	 * Get eorwSubstr3
	 */
	@Column(name = "EORW_SUBSTR3")
	public String getEorwSubstr3() {
		return eorwSubstr3;
	}

	/**
	 * Set eorwSubstr3
	 */
	public void setEorwSubstr3(String eorwSubstr3) {
		this.eorwSubstr3 = eorwSubstr3;
		addValidField("eorwSubstr3");
	}

	/**
	 * Get eorwSubstr4
	 */
	@Column(name = "EORW_SUBSTR4")
	public String getEorwSubstr4() {
		return eorwSubstr4;
	}

	/**
	 * Set eorwSubstr4
	 */
	public void setEorwSubstr4(String eorwSubstr4) {
		this.eorwSubstr4 = eorwSubstr4;
		addValidField("eorwSubstr4");
	}

	/**
	 * Get eorwSubstr5
	 */
	@Column(name = "EORW_SUBSTR5")
	public String getEorwSubstr5() {
		return eorwSubstr5;
	}

	/**
	 * Set eorwSubstr5
	 */
	public void setEorwSubstr5(String eorwSubstr5) {
		this.eorwSubstr5 = eorwSubstr5;
		addValidField("eorwSubstr5");
	}

	/**
	 * Get eorwSubstr6
	 */
	@Column(name = "EORW_SUBSTR6")
	public String getEorwSubstr6() {
		return eorwSubstr6;
	}

	/**
	 * Set eorwSubstr6
	 */
	public void setEorwSubstr6(String eorwSubstr6) {
		this.eorwSubstr6 = eorwSubstr6;
		addValidField("eorwSubstr6");
	}

	/**
	 * Get eorwSubstr7
	 */
	@Column(name = "EORW_SUBSTR7")
	public String getEorwSubstr7() {
		return eorwSubstr7;
	}

	/**
	 * Set eorwSubstr7
	 */
	public void setEorwSubstr7(String eorwSubstr7) {
		this.eorwSubstr7 = eorwSubstr7;
		addValidField("eorwSubstr7");
	}

	/**
	 * Get eorwSubstr8
	 */
	@Column(name = "EORW_SUBSTR8")
	public String getEorwSubstr8() {
		return eorwSubstr8;
	}

	/**
	 * Set eorwSubstr8
	 */
	public void setEorwSubstr8(String eorwSubstr8) {
		this.eorwSubstr8 = eorwSubstr8;
		addValidField("eorwSubstr8");
	}

	/**
	 * Get eorwSubstr9
	 */
	@Column(name = "EORW_SUBSTR9")
	public String getEorwSubstr9() {
		return eorwSubstr9;
	}

	/**
	 * Set eorwSubstr9
	 */
	public void setEorwSubstr9(String eorwSubstr9) {
		this.eorwSubstr9 = eorwSubstr9;
		addValidField("eorwSubstr9");
	}

	/**
	 * Get eorwSubstr10
	 */
	@Column(name = "EORW_SUBSTR10")
	public String getEorwSubstr10() {
		return eorwSubstr10;
	}

	/**
	 * Set eorwSubstr10
	 */
	public void setEorwSubstr10(String eorwSubstr10) {
		this.eorwSubstr10 = eorwSubstr10;
		addValidField("eorwSubstr10");
	}

	/**
	 * Get eorwSubstr11
	 */
	@Column(name = "EORW_SUBSTR11")
	public String getEorwSubstr11() {
		return eorwSubstr11;
	}

	/**
	 * Set eorwSubstr11
	 */
	public void setEorwSubstr11(String eorwSubstr11) {
		this.eorwSubstr11 = eorwSubstr11;
		addValidField("eorwSubstr11");
	}

	/**
	 * Get eorwSubstr12
	 */
	@Column(name = "EORW_SUBSTR12")
	public String getEorwSubstr12() {
		return eorwSubstr12;
	}

	/**
	 * Set eorwSubstr12
	 */
	public void setEorwSubstr12(String eorwSubstr12) {
		this.eorwSubstr12 = eorwSubstr12;
		addValidField("eorwSubstr12");
	}

	/**
	 * Get eorwSubstr13
	 */
	@Column(name = "EORW_SUBSTR13")
	public String getEorwSubstr13() {
		return eorwSubstr13;
	}

	/**
	 * Set eorwSubstr13
	 */
	public void setEorwSubstr13(String eorwSubstr13) {
		this.eorwSubstr13 = eorwSubstr13;
		addValidField("eorwSubstr13");
	}

	/**
	 * Get eorwSubstr14
	 */
	@Column(name = "EORW_SUBSTR14")
	public String getEorwSubstr14() {
		return eorwSubstr14;
	}

	/**
	 * Set eorwSubstr14
	 */
	public void setEorwSubstr14(String eorwSubstr14) {
		this.eorwSubstr14 = eorwSubstr14;
		addValidField("eorwSubstr14");
	}

	/**
	 * Get eorwSubstr15
	 */
	@Column(name = "EORW_SUBSTR15")
	public String getEorwSubstr15() {
		return eorwSubstr15;
	}

	/**
	 * Set eorwSubstr15
	 */
	public void setEorwSubstr15(String eorwSubstr15) {
		this.eorwSubstr15 = eorwSubstr15;
		addValidField("eorwSubstr15");
	}

	/**
	 * Get eorwSubstr16
	 */
	@Column(name = "EORW_SUBSTR16")
	public String getEorwSubstr16() {
		return eorwSubstr16;
	}

	/**
	 * Set eorwSubstr16
	 */
	public void setEorwSubstr16(String eorwSubstr16) {
		this.eorwSubstr16 = eorwSubstr16;
		addValidField("eorwSubstr16");
	}

	/**
	 * Get eorwSubstr17
	 */
	@Column(name = "EORW_SUBSTR17")
	public String getEorwSubstr17() {
		return eorwSubstr17;
	}

	/**
	 * Set eorwSubstr17
	 */
	public void setEorwSubstr17(String eorwSubstr17) {
		this.eorwSubstr17 = eorwSubstr17;
		addValidField("eorwSubstr17");
	}

	/**
	 * Get eorwSubstr18
	 */
	@Column(name = "EORW_SUBSTR18")
	public String getEorwSubstr18() {
		return eorwSubstr18;
	}

	/**
	 * Set eorwSubstr18
	 */
	public void setEorwSubstr18(String eorwSubstr18) {
		this.eorwSubstr18 = eorwSubstr18;
		addValidField("eorwSubstr18");
	}

	/**
	 * Get eorwSubstr19
	 */
	@Column(name = "EORW_SUBSTR19")
	public String getEorwSubstr19() {
		return eorwSubstr19;
	}

	/**
	 * Set eorwSubstr19
	 */
	public void setEorwSubstr19(String eorwSubstr19) {
		this.eorwSubstr19 = eorwSubstr19;
		addValidField("eorwSubstr19");
	}

	/**
	 * Get eorwSubstr20
	 */
	@Column(name = "EORW_SUBSTR20")
	public String getEorwSubstr20() {
		return eorwSubstr20;
	}

	/**
	 * Set eorwSubstr20
	 */
	public void setEorwSubstr20(String eorwSubstr20) {
		this.eorwSubstr20 = eorwSubstr20;
		addValidField("eorwSubstr20");
	}

	/**
	 * Get eorwSubstr21
	 */
	@Column(name = "EORW_SUBSTR21")
	public String getEorwSubstr21() {
		return eorwSubstr21;
	}

	/**
	 * Set eorwSubstr21
	 */
	public void setEorwSubstr21(String eorwSubstr21) {
		this.eorwSubstr21 = eorwSubstr21;
		addValidField("eorwSubstr21");
	}

	/**
	 * Get eorwSubstr22
	 */
	@Column(name = "EORW_SUBSTR22")
	public String getEorwSubstr22() {
		return eorwSubstr22;
	}

	/**
	 * Set eorwSubstr22
	 */
	public void setEorwSubstr22(String eorwSubstr22) {
		this.eorwSubstr22 = eorwSubstr22;
		addValidField("eorwSubstr22");
	}

	/**
	 * Get eorwSubstr23
	 */
	@Column(name = "EORW_SUBSTR23")
	public String getEorwSubstr23() {
		return eorwSubstr23;
	}

	/**
	 * Set eorwSubstr23
	 */
	public void setEorwSubstr23(String eorwSubstr23) {
		this.eorwSubstr23 = eorwSubstr23;
		addValidField("eorwSubstr23");
	}

	/**
	 * Get eorwSubstr24
	 */
	@Column(name = "EORW_SUBSTR24")
	public String getEorwSubstr24() {
		return eorwSubstr24;
	}

	/**
	 * Set eorwSubstr24
	 */
	public void setEorwSubstr24(String eorwSubstr24) {
		this.eorwSubstr24 = eorwSubstr24;
		addValidField("eorwSubstr24");
	}

	/**
	 * Get eorwSubstr25
	 */
	@Column(name = "EORW_SUBSTR25")
	public String getEorwSubstr25() {
		return eorwSubstr25;
	}

	/**
	 * Set eorwSubstr25
	 */
	public void setEorwSubstr25(String eorwSubstr25) {
		this.eorwSubstr25 = eorwSubstr25;
		addValidField("eorwSubstr25");
	}

	/**
	 * Get eorwSubdate1
	 */
	@Column(name = "EORW_SUBDATE1")
	public Date getEorwSubdate1() {
		return eorwSubdate1;
	}

	/**
	 * Set eorwSubdate1
	 */
	public void setEorwSubdate1(Date eorwSubdate1) {
		this.eorwSubdate1 = eorwSubdate1;
		addValidField("eorwSubdate1");
	}

	/**
	 * Get eorwSubdate2
	 */
	@Column(name = "EORW_SUBDATE2")
	public Date getEorwSubdate2() {
		return eorwSubdate2;
	}

	/**
	 * Set eorwSubdate2
	 */
	public void setEorwSubdate2(Date eorwSubdate2) {
		this.eorwSubdate2 = eorwSubdate2;
		addValidField("eorwSubdate2");
	}

	/**
	 * Get eorwSubdate3
	 */
	@Column(name = "EORW_SUBDATE3")
	public Date getEorwSubdate3() {
		return eorwSubdate3;
	}

	/**
	 * Set eorwSubdate3
	 */
	public void setEorwSubdate3(Date eorwSubdate3) {
		this.eorwSubdate3 = eorwSubdate3;
		addValidField("eorwSubdate3");
	}

	/**
	 * Get eorwSubdate4
	 */
	@Column(name = "EORW_SUBDATE4")
	public Date getEorwSubdate4() {
		return eorwSubdate4;
	}

	/**
	 * Set eorwSubdate4
	 */
	public void setEorwSubdate4(Date eorwSubdate4) {
		this.eorwSubdate4 = eorwSubdate4;
		addValidField("eorwSubdate4");
	}

	/**
	 * Get eorwSubdate5
	 */
	@Column(name = "EORW_SUBDATE5")
	public Date getEorwSubdate5() {
		return eorwSubdate5;
	}

	/**
	 * Set eorwSubdate5
	 */
	public void setEorwSubdate5(Date eorwSubdate5) {
		this.eorwSubdate5 = eorwSubdate5;
		addValidField("eorwSubdate5");
	}

	/**
	 * Get eorwSubdate6
	 */
	@Column(name = "EORW_SUBDATE6")
	public Date getEorwSubdate6() {
		return eorwSubdate6;
	}

	/**
	 * Set eorwSubdate6
	 */
	public void setEorwSubdate6(Date eorwSubdate6) {
		this.eorwSubdate6 = eorwSubdate6;
		addValidField("eorwSubdate6");
	}

	/**
	 * Get eorwSubdate7
	 */
	@Column(name = "EORW_SUBDATE7")
	public Date getEorwSubdate7() {
		return eorwSubdate7;
	}

	/**
	 * Set eorwSubdate7
	 */
	public void setEorwSubdate7(Date eorwSubdate7) {
		this.eorwSubdate7 = eorwSubdate7;
		addValidField("eorwSubdate7");
	}

	/**
	 * Get eorwSubdate8
	 */
	@Column(name = "EORW_SUBDATE8")
	public Date getEorwSubdate8() {
		return eorwSubdate8;
	}

	/**
	 * Set eorwSubdate8
	 */
	public void setEorwSubdate8(Date eorwSubdate8) {
		this.eorwSubdate8 = eorwSubdate8;
		addValidField("eorwSubdate8");
	}

	/**
	 * Get eorwSubdate9
	 */
	@Column(name = "EORW_SUBDATE9")
	public Date getEorwSubdate9() {
		return eorwSubdate9;
	}

	/**
	 * Set eorwSubdate9
	 */
	public void setEorwSubdate9(Date eorwSubdate9) {
		this.eorwSubdate9 = eorwSubdate9;
		addValidField("eorwSubdate9");
	}

	/**
	 * Get eorwSubdate10
	 */
	@Column(name = "EORW_SUBDATE10")
	public Date getEorwSubdate10() {
		return eorwSubdate10;
	}

	/**
	 * Set eorwSubdate10
	 */
	public void setEorwSubdate10(Date eorwSubdate10) {
		this.eorwSubdate10 = eorwSubdate10;
		addValidField("eorwSubdate10");
	}

	/**
	 * Get eorwSubnum1
	 */
	@Column(name = "EORW_SUBNUM1")
	public Long getEorwSubnum1() {
		return eorwSubnum1;
	}

	/**
	 * Set eorwSubnum1
	 */
	public void setEorwSubnum1(Long eorwSubnum1) {
		this.eorwSubnum1 = eorwSubnum1;
		addValidField("eorwSubnum1");
	}

	/**
	 * Get eorwSubnum2
	 */
	@Column(name = "EORW_SUBNUM2")
	public Long getEorwSubnum2() {
		return eorwSubnum2;
	}

	/**
	 * Set eorwSubnum2
	 */
	public void setEorwSubnum2(Long eorwSubnum2) {
		this.eorwSubnum2 = eorwSubnum2;
		addValidField("eorwSubnum2");
	}

	/**
	 * Get eorwSubnum3
	 */
	@Column(name = "EORW_SUBNUM3")
	public Long getEorwSubnum3() {
		return eorwSubnum3;
	}

	/**
	 * Set eorwSubnum3
	 */
	public void setEorwSubnum3(Long eorwSubnum3) {
		this.eorwSubnum3 = eorwSubnum3;
		addValidField("eorwSubnum3");
	}

	/**
	 * Get eorwSubnum4
	 */
	@Column(name = "EORW_SUBNUM4")
	public Long getEorwSubnum4() {
		return eorwSubnum4;
	}

	/**
	 * Set eorwSubnum4
	 */
	public void setEorwSubnum4(Long eorwSubnum4) {
		this.eorwSubnum4 = eorwSubnum4;
		addValidField("eorwSubnum4");
	}

	/**
	 * Get eorwSubnum5
	 */
	@Column(name = "EORW_SUBNUM5")
	public Long getEorwSubnum5() {
		return eorwSubnum5;
	}

	/**
	 * Set eorwSubnum5
	 */
	public void setEorwSubnum5(Long eorwSubnum5) {
		this.eorwSubnum5 = eorwSubnum5;
		addValidField("eorwSubnum5");
	}

	/**
	 * Get eorwSubnum6
	 */
	@Column(name = "EORW_SUBNUM6")
	public Long getEorwSubnum6() {
		return eorwSubnum6;
	}

	/**
	 * Set eorwSubnum6
	 */
	public void setEorwSubnum6(Long eorwSubnum6) {
		this.eorwSubnum6 = eorwSubnum6;
		addValidField("eorwSubnum6");
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
	 * Get eorwEscoCode
	 */
	@Column(name = "EORW_ESCO_CODE")
	public String getEorwEscoCode() {
		return eorwEscoCode;
	}

	/**
	 * Set eorwEscoCode
	 */
	public void setEorwEscoCode(String eorwEscoCode) {
		this.eorwEscoCode = eorwEscoCode;
		addValidField("eorwEscoCode");
	}

	/**
	 * Get eorwEscoNameCn
	 */
	@Column(name = "EORW_ESCO_NAME_CN")
	public String getEorwEscoNameCn() {
		return eorwEscoNameCn;
	}

	/**
	 * Set eorwEscoNameCn
	 */
	public void setEorwEscoNameCn(String eorwEscoNameCn) {
		this.eorwEscoNameCn = eorwEscoNameCn;
		addValidField("eorwEscoNameCn");
	}

	/**
	 * Get eorwEsdeDepartmentCode
	 */
	@Column(name = "EORW_ESDE_DEPARTMENT_CODE")
	public String getEorwEsdeDepartmentCode() {
		return eorwEsdeDepartmentCode;
	}

	/**
	 * Set eorwEsdeDepartmentCode
	 */
	public void setEorwEsdeDepartmentCode(String eorwEsdeDepartmentCode) {
		this.eorwEsdeDepartmentCode = eorwEsdeDepartmentCode;
		addValidField("eorwEsdeDepartmentCode");
	}

	/**
	 * Get eorwEsdeDepartmentName
	 */
	@Column(name = "EORW_ESDE_DEPARTMENT_NAME")
	public String getEorwEsdeDepartmentName() {
		return eorwEsdeDepartmentName;
	}

	/**
	 * Set eorwEsdeDepartmentName
	 */
	public void setEorwEsdeDepartmentName(String eorwEsdeDepartmentName) {
		this.eorwEsdeDepartmentName = eorwEsdeDepartmentName;
		addValidField("eorwEsdeDepartmentName");
	}

	/**
	 * Get eorwEsusUserNameCn
	 */
	@Column(name = "EORW_ESUS_USER_NAME_CN")
	public String getEorwEsusUserNameCn() {
		return eorwEsusUserNameCn;
	}

	/**
	 * Set eorwEsusUserNameCn
	 */
	public void setEorwEsusUserNameCn(String eorwEsusUserNameCn) {
		this.eorwEsusUserNameCn = eorwEsusUserNameCn;
		addValidField("eorwEsusUserNameCn");
	}

	/**
	 * Get eorwRetoType
	 */
	@Column(name = "EORW_RETO_TYPE")
	public Long getEorwRetoType() {
		return eorwRetoType;
	}

	/**
	 * Set eorwRetoType
	 */
	public void setEorwRetoType(Long eorwRetoType) {
		this.eorwRetoType = eorwRetoType;
		addValidField("eorwRetoType");
	}

}
