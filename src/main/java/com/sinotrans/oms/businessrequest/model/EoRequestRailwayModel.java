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
 * Model class for EoRequestRailway
 */
@Entity
@Table(name = "EO_REQUEST_RAILWAY")
public class EoRequestRailwayModel extends BaseModel implements OperationLog {

	//eorrId
	private Long eorrId;
	//eorrEoorId
	private Long eorrEoorId;
	//eorrEscoId
	private Long eorrEscoId;
	//eorrEbpjId
	private Long eorrEbpjId;
	//eorrLoEbppId
	private Long eorrLoEbppId;
	//eorrEbtkId
	private Long eorrEbtkId;
	//eorrIsAutomatic
	private String eorrIsAutomatic;
	//eorrTaskStatus
	private String eorrTaskStatus;
	//eorrTaskFeedback
	private String eorrTaskFeedback;
	//eorrSysCode
	private String eorrSysCode;
	//eorrEbbuId
	private Long eorrEbbuId;
	//eorrEbbuNameCn
	private String eorrEbbuNameCn;
	//eorrEbbuCode
	private String eorrEbbuCode;
	//eorrEbbuDist1
	private String eorrEbbuDist1;
	//eorrEbbuDist2
	private String eorrEbbuDist2;
	//eorrEbbuDist3
	private String eorrEbbuDist3;
	//eorrEbbuDist4
	private String eorrEbbuDist4;
	//eorrEbbuDist5
	private String eorrEbbuDist5;
	//eorrToId
	private String eorrToId;
	//eorrExternalOrderNo
	private String eorrExternalOrderNo;
	//eorrNo
	private String eorrNo;
	//eorrType
	private String eorrType;
	//eorrStatus
	private String eorrStatus;
	//eorrOrder
	private Long eorrOrder;
	//eorrSoNo
	private String eorrSoNo;
	//eorrDoNo
	private String eorrDoNo;
	//eorrIeFlag
	private String eorrIeFlag;
	//eorrConsignorEbcuId
	private Long eorrConsignorEbcuId;
	//eorrConsignorEbcuCode
	private String eorrConsignorEbcuCode;
	//eorrConsignorEbcuName
	private String eorrConsignorEbcuName;
	//eorrOwnerEbcuId
	private Long eorrOwnerEbcuId;
	//eorrOwnerEbcuCode
	private String eorrOwnerEbcuCode;
	//eorrOwnerEbcuName
	private String eorrOwnerEbcuName;
	//eorrShipperEbspId
	private Long eorrShipperEbspId;
	//eorrShipperEbspCode
	private String eorrShipperEbspCode;
	//eorrShipperEbspNameCn
	private String eorrShipperEbspNameCn;
	//eorrShipperEbrgId
	private Long eorrShipperEbrgId;
	//eorrShipperEbrgCode
	private String eorrShipperEbrgCode;
	//eorrShipperEbrgNameCn
	private String eorrShipperEbrgNameCn;
	//eorrShipperEbsaContact
	private String eorrShipperEbsaContact;
	//eorrShipperEbsaTel
	private String eorrShipperEbsaTel;
	//eorrShipperEbsaId
	private Long eorrShipperEbsaId;
	//eorrShipperEbsaAddress
	private String eorrShipperEbsaAddress;
	//eorrConsigneeEbspId
	private Long eorrConsigneeEbspId;
	//eorrConsigneeEbspCode
	private String eorrConsigneeEbspCode;
	//eorrConsigneeEbspNameCn
	private String eorrConsigneeEbspNameCn;
	//eorrConsigneeEbrgId
	private Long eorrConsigneeEbrgId;
	//eorrConsigneeEbrgCode
	private String eorrConsigneeEbrgCode;
	//eorrConsigneeEbrgNameCn
	private String eorrConsigneeEbrgNameCn;
	//eorrConsigneeEbsaContact
	private String eorrConsigneeEbsaContact;
	//eorrConsigneeEbsaTel
	private String eorrConsigneeEbsaTel;
	//eorrConsigneeEbsaId
	private Long eorrConsigneeEbsaId;
	//eorrConsigneeEbsaAddress
	private String eorrConsigneeEbsaAddress;
	//eorrBookingNo
	private String eorrBookingNo;
	//eorrTrainNumber
	private String eorrTrainNumber;
	//eorrReqDeliveryDate
	private Date eorrReqDeliveryDate;
	//eorrReqArrivalDate
	private Date eorrReqArrivalDate;
	//eorrPlanDepartureTime
	private Date eorrPlanDepartureTime;
	//eorrDepartureTime
	private Date eorrDepartureTime;
	//eorrPlanArrivalTime
	private Date eorrPlanArrivalTime;
	//eorrArrivalTime
	private Date eorrArrivalTime;
	//eorrDepartureEbrgId
	private Long eorrDepartureEbrgId;
	//eorrDepartureEbrgCode
	private String eorrDepartureEbrgCode;
	//eorrDepartureEbrgName
	private String eorrDepartureEbrgName;
	//eorrArrivalEbrgId
	private Long eorrArrivalEbrgId;
	//eorrArrivalEbrgCode
	private String eorrArrivalEbrgCode;
	//eorrArrivalEbrgName
	private String eorrArrivalEbrgName;
	//eorrDischargeTime
	private Date eorrDischargeTime;
	//eorrQuantity
	private Long eorrQuantity;
	//eorrWeight
	private Long eorrWeight;
	//eorrNetWeight
	private Long eorrNetWeight;
	//eorrVolume
	private Long eorrVolume;
	//eorrDelayReason
	private String eorrDelayReason;
	//eorrRemark
	private String eorrRemark;
	//eorrSubstr1
	private String eorrSubstr1;
	//eorrSubstr2
	private String eorrSubstr2;
	//eorrSubstr3
	private String eorrSubstr3;
	//eorrSubstr4
	private String eorrSubstr4;
	//eorrSubstr5
	private String eorrSubstr5;
	//eorrSubstr6
	private String eorrSubstr6;
	//eorrSubstr7
	private String eorrSubstr7;
	//eorrSubstr8
	private String eorrSubstr8;
	//eorrSubstr9
	private String eorrSubstr9;
	//eorrSubstr10
	private String eorrSubstr10;
	//eorrSubstr11
	private String eorrSubstr11;
	//eorrSubstr12
	private String eorrSubstr12;
	//eorrSubstr13
	private String eorrSubstr13;
	//eorrSubstr14
	private String eorrSubstr14;
	//eorrSubstr15
	private String eorrSubstr15;
	//eorrSubstr16
	private String eorrSubstr16;
	//eorrSubstr17
	private String eorrSubstr17;
	//eorrSubstr18
	private String eorrSubstr18;
	//eorrSubstr19
	private String eorrSubstr19;
	//eorrSubstr20
	private String eorrSubstr20;
	//eorrSubstr21
	private String eorrSubstr21;
	//eorrSubstr22
	private String eorrSubstr22;
	//eorrSubstr23
	private String eorrSubstr23;
	//eorrSubstr24
	private String eorrSubstr24;
	//eorrSubstr25
	private String eorrSubstr25;
	//eorrSubdate1
	private Date eorrSubdate1;
	//eorrSubdate2
	private Date eorrSubdate2;
	//eorrSubdate3
	private Date eorrSubdate3;
	//eorrSubdate4
	private Date eorrSubdate4;
	//eorrSubdate5
	private Date eorrSubdate5;
	//eorrSubdate6
	private Date eorrSubdate6;
	//eorrSubdate7
	private Date eorrSubdate7;
	//eorrSubdate8
	private Date eorrSubdate8;
	//eorrSubdate9
	private Date eorrSubdate9;
	//eorrSubdate10
	private Date eorrSubdate10;
	//eorrSubnum1
	private Long eorrSubnum1;
	//eorrSubnum2
	private Long eorrSubnum2;
	//eorrSubnum3
	private Long eorrSubnum3;
	//eorrSubnum4
	private Long eorrSubnum4;
	//eorrSubnum5
	private Long eorrSubnum5;
	//eorrSubnum6
	private Long eorrSubnum6;
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
	//eorrEscoCode
	private String eorrEscoCode;
	//eorrEscoNameCn
	private String eorrEscoNameCn;
	//eorrEsdeDepartmentCode
	private String eorrEsdeDepartmentCode;
	//eorrEsdeDepartmentName
	private String eorrEsdeDepartmentName;
	//eorrEsusUserNameCn
	private String eorrEsusUserNameCn;
	//eorrRetoType
	private Long eorrRetoType;
	//eorrCustomerClearaceTime
	private Date eorrCustomerClearaceTime;
	//eorrGoddsDelivery
	private Date eorrGoddsDelivery;
	//eorrThroughNumber
	private String eorrThroughNumber;
	//eorrConsignmentBill
	private String eorrConsignmentBill;

	/**
	 * Get eorrId
	 */
	@Column(name = "EORR_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEorrId() {
		return eorrId;
	}

	/**
	 * Set eorrId
	 */
	public void setEorrId(Long eorrId) {
		this.eorrId = eorrId;
		addValidField("eorrId");
	}

	/**
	 * Get eorrEoorId
	 */
	@Column(name = "EORR_EOOR_ID")
	public Long getEorrEoorId() {
		return eorrEoorId;
	}

	/**
	 * Set eorrEoorId
	 */
	public void setEorrEoorId(Long eorrEoorId) {
		this.eorrEoorId = eorrEoorId;
		addValidField("eorrEoorId");
	}

	/**
	 * Get eorrEscoId
	 */
	@Column(name = "EORR_ESCO_ID")
	public Long getEorrEscoId() {
		return eorrEscoId;
	}

	/**
	 * Set eorrEscoId
	 */
	public void setEorrEscoId(Long eorrEscoId) {
		this.eorrEscoId = eorrEscoId;
		addValidField("eorrEscoId");
	}

	/**
	 * Get eorrEbpjId
	 */
	@Column(name = "EORR_EBPJ_ID")
	public Long getEorrEbpjId() {
		return eorrEbpjId;
	}

	/**
	 * Set eorrEbpjId
	 */
	public void setEorrEbpjId(Long eorrEbpjId) {
		this.eorrEbpjId = eorrEbpjId;
		addValidField("eorrEbpjId");
	}

	/**
	 * Get eorrLoEbppId
	 */
	@Column(name = "EORR_LO_EBPP_ID")
	public Long getEorrLoEbppId() {
		return eorrLoEbppId;
	}

	/**
	 * Set eorrLoEbppId
	 */
	public void setEorrLoEbppId(Long eorrLoEbppId) {
		this.eorrLoEbppId = eorrLoEbppId;
		addValidField("eorrLoEbppId");
	}

	/**
	 * Get eorrEbtkId
	 */
	@Column(name = "EORR_EBTK_ID")
	public Long getEorrEbtkId() {
		return eorrEbtkId;
	}

	/**
	 * Set eorrEbtkId
	 */
	public void setEorrEbtkId(Long eorrEbtkId) {
		this.eorrEbtkId = eorrEbtkId;
		addValidField("eorrEbtkId");
	}

	/**
	 * Get eorrIsAutomatic
	 */
	@Column(name = "EORR_IS_AUTOMATIC")
	public String getEorrIsAutomatic() {
		return eorrIsAutomatic;
	}

	/**
	 * Set eorrIsAutomatic
	 */
	public void setEorrIsAutomatic(String eorrIsAutomatic) {
		this.eorrIsAutomatic = eorrIsAutomatic;
		addValidField("eorrIsAutomatic");
	}

	/**
	 * Get eorrTaskStatus
	 */
	@Column(name = "EORR_TASK_STATUS")
	public String getEorrTaskStatus() {
		return eorrTaskStatus;
	}

	/**
	 * Set eorrTaskStatus
	 */
	public void setEorrTaskStatus(String eorrTaskStatus) {
		this.eorrTaskStatus = eorrTaskStatus;
		addValidField("eorrTaskStatus");
	}

	/**
	 * Get eorrTaskFeedback
	 */
	@Column(name = "EORR_TASK_FEEDBACK")
	public String getEorrTaskFeedback() {
		return eorrTaskFeedback;
	}

	/**
	 * Set eorrTaskFeedback
	 */
	public void setEorrTaskFeedback(String eorrTaskFeedback) {
		this.eorrTaskFeedback = eorrTaskFeedback;
		addValidField("eorrTaskFeedback");
	}

	/**
	 * Get eorrSysCode
	 */
	@Column(name = "EORR_SYS_CODE")
	public String getEorrSysCode() {
		return eorrSysCode;
	}

	/**
	 * Set eorrSysCode
	 */
	public void setEorrSysCode(String eorrSysCode) {
		this.eorrSysCode = eorrSysCode;
		addValidField("eorrSysCode");
	}

	/**
	 * Get eorrEbbuId
	 */
	@Column(name = "EORR_EBBU_ID")
	public Long getEorrEbbuId() {
		return eorrEbbuId;
	}

	/**
	 * Set eorrEbbuId
	 */
	public void setEorrEbbuId(Long eorrEbbuId) {
		this.eorrEbbuId = eorrEbbuId;
		addValidField("eorrEbbuId");
	}

	/**
	 * Get eorrEbbuNameCn
	 */
	@Column(name = "EORR_EBBU_NAME_CN")
	public String getEorrEbbuNameCn() {
		return eorrEbbuNameCn;
	}

	/**
	 * Set eorrEbbuNameCn
	 */
	public void setEorrEbbuNameCn(String eorrEbbuNameCn) {
		this.eorrEbbuNameCn = eorrEbbuNameCn;
		addValidField("eorrEbbuNameCn");
	}

	/**
	 * Get eorrEbbuCode
	 */
	@Column(name = "EORR_EBBU_CODE")
	public String getEorrEbbuCode() {
		return eorrEbbuCode;
	}

	/**
	 * Set eorrEbbuCode
	 */
	public void setEorrEbbuCode(String eorrEbbuCode) {
		this.eorrEbbuCode = eorrEbbuCode;
		addValidField("eorrEbbuCode");
	}

	/**
	 * Get eorrEbbuDist1
	 */
	@Column(name = "EORR_EBBU_DIST_1")
	public String getEorrEbbuDist1() {
		return eorrEbbuDist1;
	}

	/**
	 * Set eorrEbbuDist1
	 */
	public void setEorrEbbuDist1(String eorrEbbuDist1) {
		this.eorrEbbuDist1 = eorrEbbuDist1;
		addValidField("eorrEbbuDist1");
	}

	/**
	 * Get eorrEbbuDist2
	 */
	@Column(name = "EORR_EBBU_DIST_2")
	public String getEorrEbbuDist2() {
		return eorrEbbuDist2;
	}

	/**
	 * Set eorrEbbuDist2
	 */
	public void setEorrEbbuDist2(String eorrEbbuDist2) {
		this.eorrEbbuDist2 = eorrEbbuDist2;
		addValidField("eorrEbbuDist2");
	}

	/**
	 * Get eorrEbbuDist3
	 */
	@Column(name = "EORR_EBBU_DIST_3")
	public String getEorrEbbuDist3() {
		return eorrEbbuDist3;
	}

	/**
	 * Set eorrEbbuDist3
	 */
	public void setEorrEbbuDist3(String eorrEbbuDist3) {
		this.eorrEbbuDist3 = eorrEbbuDist3;
		addValidField("eorrEbbuDist3");
	}

	/**
	 * Get eorrEbbuDist4
	 */
	@Column(name = "EORR_EBBU_DIST_4")
	public String getEorrEbbuDist4() {
		return eorrEbbuDist4;
	}

	/**
	 * Set eorrEbbuDist4
	 */
	public void setEorrEbbuDist4(String eorrEbbuDist4) {
		this.eorrEbbuDist4 = eorrEbbuDist4;
		addValidField("eorrEbbuDist4");
	}

	/**
	 * Get eorrEbbuDist5
	 */
	@Column(name = "EORR_EBBU_DIST_5")
	public String getEorrEbbuDist5() {
		return eorrEbbuDist5;
	}

	/**
	 * Set eorrEbbuDist5
	 */
	public void setEorrEbbuDist5(String eorrEbbuDist5) {
		this.eorrEbbuDist5 = eorrEbbuDist5;
		addValidField("eorrEbbuDist5");
	}

	/**
	 * Get eorrToId
	 */
	@Column(name = "EORR_TO_ID")
	public String getEorrToId() {
		return eorrToId;
	}

	/**
	 * Set eorrToId
	 */
	public void setEorrToId(String eorrToId) {
		this.eorrToId = eorrToId;
		addValidField("eorrToId");
	}

	/**
	 * Get eorrExternalOrderNo
	 */
	@Column(name = "EORR_EXTERNAL_ORDER_NO")
	public String getEorrExternalOrderNo() {
		return eorrExternalOrderNo;
	}

	/**
	 * Set eorrExternalOrderNo
	 */
	public void setEorrExternalOrderNo(String eorrExternalOrderNo) {
		this.eorrExternalOrderNo = eorrExternalOrderNo;
		addValidField("eorrExternalOrderNo");
	}

	/**
	 * Get eorrNo
	 */
	@Column(name = "EORR_NO")
	public String getEorrNo() {
		return eorrNo;
	}

	/**
	 * Set eorrNo
	 */
	public void setEorrNo(String eorrNo) {
		this.eorrNo = eorrNo;
		addValidField("eorrNo");
	}

	/**
	 * Get eorrType
	 */
	@Column(name = "EORR_TYPE")
	public String getEorrType() {
		return eorrType;
	}

	/**
	 * Set eorrType
	 */
	public void setEorrType(String eorrType) {
		this.eorrType = eorrType;
		addValidField("eorrType");
	}

	/**
	 * Get eorrStatus
	 */
	@Column(name = "EORR_STATUS")
	public String getEorrStatus() {
		return eorrStatus;
	}

	/**
	 * Set eorrStatus
	 */
	public void setEorrStatus(String eorrStatus) {
		this.eorrStatus = eorrStatus;
		addValidField("eorrStatus");
	}

	/**
	 * Get eorrOrder
	 */
	@Column(name = "EORR_ORDER")
	public Long getEorrOrder() {
		return eorrOrder;
	}

	/**
	 * Set eorrOrder
	 */
	public void setEorrOrder(Long eorrOrder) {
		this.eorrOrder = eorrOrder;
		addValidField("eorrOrder");
	}

	/**
	 * Get eorrSoNo
	 */
	@Column(name = "EORR_SO_NO")
	public String getEorrSoNo() {
		return eorrSoNo;
	}

	/**
	 * Set eorrSoNo
	 */
	public void setEorrSoNo(String eorrSoNo) {
		this.eorrSoNo = eorrSoNo;
		addValidField("eorrSoNo");
	}

	/**
	 * Get eorrDoNo
	 */
	@Column(name = "EORR_DO_NO")
	public String getEorrDoNo() {
		return eorrDoNo;
	}

	/**
	 * Set eorrDoNo
	 */
	public void setEorrDoNo(String eorrDoNo) {
		this.eorrDoNo = eorrDoNo;
		addValidField("eorrDoNo");
	}

	/**
	 * Get eorrIeFlag
	 */
	@Column(name = "EORR_IE_FLAG")
	public String getEorrIeFlag() {
		return eorrIeFlag;
	}

	/**
	 * Set eorrIeFlag
	 */
	public void setEorrIeFlag(String eorrIeFlag) {
		this.eorrIeFlag = eorrIeFlag;
		addValidField("eorrIeFlag");
	}

	/**
	 * Get eorrConsignorEbcuId
	 */
	@Column(name = "EORR_CONSIGNOR_EBCU_ID")
	public Long getEorrConsignorEbcuId() {
		return eorrConsignorEbcuId;
	}

	/**
	 * Set eorrConsignorEbcuId
	 */
	public void setEorrConsignorEbcuId(Long eorrConsignorEbcuId) {
		this.eorrConsignorEbcuId = eorrConsignorEbcuId;
		addValidField("eorrConsignorEbcuId");
	}

	/**
	 * Get eorrConsignorEbcuCode
	 */
	@Column(name = "EORR_CONSIGNOR_EBCU_CODE")
	public String getEorrConsignorEbcuCode() {
		return eorrConsignorEbcuCode;
	}

	/**
	 * Set eorrConsignorEbcuCode
	 */
	public void setEorrConsignorEbcuCode(String eorrConsignorEbcuCode) {
		this.eorrConsignorEbcuCode = eorrConsignorEbcuCode;
		addValidField("eorrConsignorEbcuCode");
	}

	/**
	 * Get eorrConsignorEbcuName
	 */
	@Column(name = "EORR_CONSIGNOR_EBCU_NAME")
	public String getEorrConsignorEbcuName() {
		return eorrConsignorEbcuName;
	}

	/**
	 * Set eorrConsignorEbcuName
	 */
	public void setEorrConsignorEbcuName(String eorrConsignorEbcuName) {
		this.eorrConsignorEbcuName = eorrConsignorEbcuName;
		addValidField("eorrConsignorEbcuName");
	}

	/**
	 * Get eorrOwnerEbcuId
	 */
	@Column(name = "EORR_OWNER_EBCU_ID")
	public Long getEorrOwnerEbcuId() {
		return eorrOwnerEbcuId;
	}

	/**
	 * Set eorrOwnerEbcuId
	 */
	public void setEorrOwnerEbcuId(Long eorrOwnerEbcuId) {
		this.eorrOwnerEbcuId = eorrOwnerEbcuId;
		addValidField("eorrOwnerEbcuId");
	}

	/**
	 * Get eorrOwnerEbcuCode
	 */
	@Column(name = "EORR_OWNER_EBCU_CODE")
	public String getEorrOwnerEbcuCode() {
		return eorrOwnerEbcuCode;
	}

	/**
	 * Set eorrOwnerEbcuCode
	 */
	public void setEorrOwnerEbcuCode(String eorrOwnerEbcuCode) {
		this.eorrOwnerEbcuCode = eorrOwnerEbcuCode;
		addValidField("eorrOwnerEbcuCode");
	}

	/**
	 * Get eorrOwnerEbcuName
	 */
	@Column(name = "EORR_OWNER_EBCU_NAME")
	public String getEorrOwnerEbcuName() {
		return eorrOwnerEbcuName;
	}

	/**
	 * Set eorrOwnerEbcuName
	 */
	public void setEorrOwnerEbcuName(String eorrOwnerEbcuName) {
		this.eorrOwnerEbcuName = eorrOwnerEbcuName;
		addValidField("eorrOwnerEbcuName");
	}

	/**
	 * Get eorrShipperEbspId
	 */
	@Column(name = "EORR_SHIPPER_EBSP_ID")
	public Long getEorrShipperEbspId() {
		return eorrShipperEbspId;
	}

	/**
	 * Set eorrShipperEbspId
	 */
	public void setEorrShipperEbspId(Long eorrShipperEbspId) {
		this.eorrShipperEbspId = eorrShipperEbspId;
		addValidField("eorrShipperEbspId");
	}

	/**
	 * Get eorrShipperEbspCode
	 */
	@Column(name = "EORR_SHIPPER_EBSP_CODE")
	public String getEorrShipperEbspCode() {
		return eorrShipperEbspCode;
	}

	/**
	 * Set eorrShipperEbspCode
	 */
	public void setEorrShipperEbspCode(String eorrShipperEbspCode) {
		this.eorrShipperEbspCode = eorrShipperEbspCode;
		addValidField("eorrShipperEbspCode");
	}

	/**
	 * Get eorrShipperEbspNameCn
	 */
	@Column(name = "EORR_SHIPPER_EBSP_NAME_CN")
	public String getEorrShipperEbspNameCn() {
		return eorrShipperEbspNameCn;
	}

	/**
	 * Set eorrShipperEbspNameCn
	 */
	public void setEorrShipperEbspNameCn(String eorrShipperEbspNameCn) {
		this.eorrShipperEbspNameCn = eorrShipperEbspNameCn;
		addValidField("eorrShipperEbspNameCn");
	}

	/**
	 * Get eorrShipperEbrgId
	 */
	@Column(name = "EORR_SHIPPER_EBRG_ID")
	public Long getEorrShipperEbrgId() {
		return eorrShipperEbrgId;
	}

	/**
	 * Set eorrShipperEbrgId
	 */
	public void setEorrShipperEbrgId(Long eorrShipperEbrgId) {
		this.eorrShipperEbrgId = eorrShipperEbrgId;
		addValidField("eorrShipperEbrgId");
	}

	/**
	 * Get eorrShipperEbrgCode
	 */
	@Column(name = "EORR_SHIPPER_EBRG_CODE")
	public String getEorrShipperEbrgCode() {
		return eorrShipperEbrgCode;
	}

	/**
	 * Set eorrShipperEbrgCode
	 */
	public void setEorrShipperEbrgCode(String eorrShipperEbrgCode) {
		this.eorrShipperEbrgCode = eorrShipperEbrgCode;
		addValidField("eorrShipperEbrgCode");
	}

	/**
	 * Get eorrShipperEbrgNameCn
	 */
	@Column(name = "EORR_SHIPPER_EBRG_NAME_CN")
	public String getEorrShipperEbrgNameCn() {
		return eorrShipperEbrgNameCn;
	}

	/**
	 * Set eorrShipperEbrgNameCn
	 */
	public void setEorrShipperEbrgNameCn(String eorrShipperEbrgNameCn) {
		this.eorrShipperEbrgNameCn = eorrShipperEbrgNameCn;
		addValidField("eorrShipperEbrgNameCn");
	}

	/**
	 * Get eorrShipperEbsaContact
	 */
	@Column(name = "EORR_SHIPPER_EBSA_CONTACT")
	public String getEorrShipperEbsaContact() {
		return eorrShipperEbsaContact;
	}

	/**
	 * Set eorrShipperEbsaContact
	 */
	public void setEorrShipperEbsaContact(String eorrShipperEbsaContact) {
		this.eorrShipperEbsaContact = eorrShipperEbsaContact;
		addValidField("eorrShipperEbsaContact");
	}

	/**
	 * Get eorrShipperEbsaTel
	 */
	@Column(name = "EORR_SHIPPER_EBSA_TEL")
	public String getEorrShipperEbsaTel() {
		return eorrShipperEbsaTel;
	}

	/**
	 * Set eorrShipperEbsaTel
	 */
	public void setEorrShipperEbsaTel(String eorrShipperEbsaTel) {
		this.eorrShipperEbsaTel = eorrShipperEbsaTel;
		addValidField("eorrShipperEbsaTel");
	}

	/**
	 * Get eorrShipperEbsaId
	 */
	@Column(name = "EORR_SHIPPER_EBSA_ID")
	public Long getEorrShipperEbsaId() {
		return eorrShipperEbsaId;
	}

	/**
	 * Set eorrShipperEbsaId
	 */
	public void setEorrShipperEbsaId(Long eorrShipperEbsaId) {
		this.eorrShipperEbsaId = eorrShipperEbsaId;
		addValidField("eorrShipperEbsaId");
	}

	/**
	 * Get eorrShipperEbsaAddress
	 */
	@Column(name = "EORR_SHIPPER_EBSA_ADDRESS")
	public String getEorrShipperEbsaAddress() {
		return eorrShipperEbsaAddress;
	}

	/**
	 * Set eorrShipperEbsaAddress
	 */
	public void setEorrShipperEbsaAddress(String eorrShipperEbsaAddress) {
		this.eorrShipperEbsaAddress = eorrShipperEbsaAddress;
		addValidField("eorrShipperEbsaAddress");
	}

	/**
	 * Get eorrConsigneeEbspId
	 */
	@Column(name = "EORR_CONSIGNEE_EBSP_ID")
	public Long getEorrConsigneeEbspId() {
		return eorrConsigneeEbspId;
	}

	/**
	 * Set eorrConsigneeEbspId
	 */
	public void setEorrConsigneeEbspId(Long eorrConsigneeEbspId) {
		this.eorrConsigneeEbspId = eorrConsigneeEbspId;
		addValidField("eorrConsigneeEbspId");
	}

	/**
	 * Get eorrConsigneeEbspCode
	 */
	@Column(name = "EORR_CONSIGNEE_EBSP_CODE")
	public String getEorrConsigneeEbspCode() {
		return eorrConsigneeEbspCode;
	}

	/**
	 * Set eorrConsigneeEbspCode
	 */
	public void setEorrConsigneeEbspCode(String eorrConsigneeEbspCode) {
		this.eorrConsigneeEbspCode = eorrConsigneeEbspCode;
		addValidField("eorrConsigneeEbspCode");
	}

	/**
	 * Get eorrConsigneeEbspNameCn
	 */
	@Column(name = "EORR_CONSIGNEE_EBSP_NAME_CN")
	public String getEorrConsigneeEbspNameCn() {
		return eorrConsigneeEbspNameCn;
	}

	/**
	 * Set eorrConsigneeEbspNameCn
	 */
	public void setEorrConsigneeEbspNameCn(String eorrConsigneeEbspNameCn) {
		this.eorrConsigneeEbspNameCn = eorrConsigneeEbspNameCn;
		addValidField("eorrConsigneeEbspNameCn");
	}

	/**
	 * Get eorrConsigneeEbrgId
	 */
	@Column(name = "EORR_CONSIGNEE_EBRG_ID")
	public Long getEorrConsigneeEbrgId() {
		return eorrConsigneeEbrgId;
	}

	/**
	 * Set eorrConsigneeEbrgId
	 */
	public void setEorrConsigneeEbrgId(Long eorrConsigneeEbrgId) {
		this.eorrConsigneeEbrgId = eorrConsigneeEbrgId;
		addValidField("eorrConsigneeEbrgId");
	}

	/**
	 * Get eorrConsigneeEbrgCode
	 */
	@Column(name = "EORR_CONSIGNEE_EBRG_CODE")
	public String getEorrConsigneeEbrgCode() {
		return eorrConsigneeEbrgCode;
	}

	/**
	 * Set eorrConsigneeEbrgCode
	 */
	public void setEorrConsigneeEbrgCode(String eorrConsigneeEbrgCode) {
		this.eorrConsigneeEbrgCode = eorrConsigneeEbrgCode;
		addValidField("eorrConsigneeEbrgCode");
	}

	/**
	 * Get eorrConsigneeEbrgNameCn
	 */
	@Column(name = "EORR_CONSIGNEE_EBRG_NAME_CN")
	public String getEorrConsigneeEbrgNameCn() {
		return eorrConsigneeEbrgNameCn;
	}

	/**
	 * Set eorrConsigneeEbrgNameCn
	 */
	public void setEorrConsigneeEbrgNameCn(String eorrConsigneeEbrgNameCn) {
		this.eorrConsigneeEbrgNameCn = eorrConsigneeEbrgNameCn;
		addValidField("eorrConsigneeEbrgNameCn");
	}

	/**
	 * Get eorrConsigneeEbsaContact
	 */
	@Column(name = "EORR_CONSIGNEE_EBSA_CONTACT")
	public String getEorrConsigneeEbsaContact() {
		return eorrConsigneeEbsaContact;
	}

	/**
	 * Set eorrConsigneeEbsaContact
	 */
	public void setEorrConsigneeEbsaContact(String eorrConsigneeEbsaContact) {
		this.eorrConsigneeEbsaContact = eorrConsigneeEbsaContact;
		addValidField("eorrConsigneeEbsaContact");
	}

	/**
	 * Get eorrConsigneeEbsaTel
	 */
	@Column(name = "EORR_CONSIGNEE_EBSA_TEL")
	public String getEorrConsigneeEbsaTel() {
		return eorrConsigneeEbsaTel;
	}

	/**
	 * Set eorrConsigneeEbsaTel
	 */
	public void setEorrConsigneeEbsaTel(String eorrConsigneeEbsaTel) {
		this.eorrConsigneeEbsaTel = eorrConsigneeEbsaTel;
		addValidField("eorrConsigneeEbsaTel");
	}

	/**
	 * Get eorrConsigneeEbsaId
	 */
	@Column(name = "EORR_CONSIGNEE_EBSA_ID")
	public Long getEorrConsigneeEbsaId() {
		return eorrConsigneeEbsaId;
	}

	/**
	 * Set eorrConsigneeEbsaId
	 */
	public void setEorrConsigneeEbsaId(Long eorrConsigneeEbsaId) {
		this.eorrConsigneeEbsaId = eorrConsigneeEbsaId;
		addValidField("eorrConsigneeEbsaId");
	}

	/**
	 * Get eorrConsigneeEbsaAddress
	 */
	@Column(name = "EORR_CONSIGNEE_EBSA_ADDRESS")
	public String getEorrConsigneeEbsaAddress() {
		return eorrConsigneeEbsaAddress;
	}

	/**
	 * Set eorrConsigneeEbsaAddress
	 */
	public void setEorrConsigneeEbsaAddress(String eorrConsigneeEbsaAddress) {
		this.eorrConsigneeEbsaAddress = eorrConsigneeEbsaAddress;
		addValidField("eorrConsigneeEbsaAddress");
	}

	/**
	 * Get eorrBookingNo
	 */
	@Column(name = "EORR_BOOKING_NO")
	public String getEorrBookingNo() {
		return eorrBookingNo;
	}

	/**
	 * Set eorrBookingNo
	 */
	public void setEorrBookingNo(String eorrBookingNo) {
		this.eorrBookingNo = eorrBookingNo;
		addValidField("eorrBookingNo");
	}

	/**
	 * Get eorrTrainNumber
	 */
	@Column(name = "EORR_TRAIN_NUMBER")
	public String getEorrTrainNumber() {
		return eorrTrainNumber;
	}

	/**
	 * Set eorrTrainNumber
	 */
	public void setEorrTrainNumber(String eorrTrainNumber) {
		this.eorrTrainNumber = eorrTrainNumber;
		addValidField("eorrTrainNumber");
	}

	/**
	 * Get eorrReqDeliveryDate
	 */
	@Column(name = "EORR_REQ_DELIVERY_DATE")
	public Date getEorrReqDeliveryDate() {
		return eorrReqDeliveryDate;
	}

	/**
	 * Set eorrReqDeliveryDate
	 */
	public void setEorrReqDeliveryDate(Date eorrReqDeliveryDate) {
		this.eorrReqDeliveryDate = eorrReqDeliveryDate;
		addValidField("eorrReqDeliveryDate");
	}

	/**
	 * Get eorrReqArrivalDate
	 */
	@Column(name = "EORR_REQ_ARRIVAL_DATE")
	public Date getEorrReqArrivalDate() {
		return eorrReqArrivalDate;
	}

	/**
	 * Set eorrReqArrivalDate
	 */
	public void setEorrReqArrivalDate(Date eorrReqArrivalDate) {
		this.eorrReqArrivalDate = eorrReqArrivalDate;
		addValidField("eorrReqArrivalDate");
	}

	/**
	 * Get eorrPlanDepartureTime
	 */
	@Column(name = "EORR_PLAN_DEPARTURE_TIME")
	public Date getEorrPlanDepartureTime() {
		return eorrPlanDepartureTime;
	}

	/**
	 * Set eorrPlanDepartureTime
	 */
	public void setEorrPlanDepartureTime(Date eorrPlanDepartureTime) {
		this.eorrPlanDepartureTime = eorrPlanDepartureTime;
		addValidField("eorrPlanDepartureTime");
	}

	/**
	 * Get eorrDepartureTime
	 */
	@Column(name = "EORR_DEPARTURE_TIME")
	public Date getEorrDepartureTime() {
		return eorrDepartureTime;
	}

	/**
	 * Set eorrDepartureTime
	 */
	public void setEorrDepartureTime(Date eorrDepartureTime) {
		this.eorrDepartureTime = eorrDepartureTime;
		addValidField("eorrDepartureTime");
	}

	/**
	 * Get eorrPlanArrivalTime
	 */
	@Column(name = "EORR_PLAN_ARRIVAL_TIME")
	public Date getEorrPlanArrivalTime() {
		return eorrPlanArrivalTime;
	}

	/**
	 * Set eorrPlanArrivalTime
	 */
	public void setEorrPlanArrivalTime(Date eorrPlanArrivalTime) {
		this.eorrPlanArrivalTime = eorrPlanArrivalTime;
		addValidField("eorrPlanArrivalTime");
	}

	/**
	 * Get eorrArrivalTime
	 */
	@Column(name = "EORR_ARRIVAL_TIME")
	public Date getEorrArrivalTime() {
		return eorrArrivalTime;
	}

	/**
	 * Set eorrArrivalTime
	 */
	public void setEorrArrivalTime(Date eorrArrivalTime) {
		this.eorrArrivalTime = eorrArrivalTime;
		addValidField("eorrArrivalTime");
	}

	/**
	 * Get eorrDepartureEbrgId
	 */
	@Column(name = "EORR_DEPARTURE_EBRG_ID")
	public Long getEorrDepartureEbrgId() {
		return eorrDepartureEbrgId;
	}

	/**
	 * Set eorrDepartureEbrgId
	 */
	public void setEorrDepartureEbrgId(Long eorrDepartureEbrgId) {
		this.eorrDepartureEbrgId = eorrDepartureEbrgId;
		addValidField("eorrDepartureEbrgId");
	}

	/**
	 * Get eorrDepartureEbrgCode
	 */
	@Column(name = "EORR_DEPARTURE_EBRG_CODE")
	public String getEorrDepartureEbrgCode() {
		return eorrDepartureEbrgCode;
	}

	/**
	 * Set eorrDepartureEbrgCode
	 */
	public void setEorrDepartureEbrgCode(String eorrDepartureEbrgCode) {
		this.eorrDepartureEbrgCode = eorrDepartureEbrgCode;
		addValidField("eorrDepartureEbrgCode");
	}

	/**
	 * Get eorrDepartureEbrgName
	 */
	@Column(name = "EORR_DEPARTURE_EBRG_NAME")
	public String getEorrDepartureEbrgName() {
		return eorrDepartureEbrgName;
	}

	/**
	 * Set eorrDepartureEbrgName
	 */
	public void setEorrDepartureEbrgName(String eorrDepartureEbrgName) {
		this.eorrDepartureEbrgName = eorrDepartureEbrgName;
		addValidField("eorrDepartureEbrgName");
	}

	/**
	 * Get eorrArrivalEbrgId
	 */
	@Column(name = "EORR_ARRIVAL_EBRG_ID")
	public Long getEorrArrivalEbrgId() {
		return eorrArrivalEbrgId;
	}

	/**
	 * Set eorrArrivalEbrgId
	 */
	public void setEorrArrivalEbrgId(Long eorrArrivalEbrgId) {
		this.eorrArrivalEbrgId = eorrArrivalEbrgId;
		addValidField("eorrArrivalEbrgId");
	}

	/**
	 * Get eorrArrivalEbrgCode
	 */
	@Column(name = "EORR_ARRIVAL_EBRG_CODE")
	public String getEorrArrivalEbrgCode() {
		return eorrArrivalEbrgCode;
	}

	/**
	 * Set eorrArrivalEbrgCode
	 */
	public void setEorrArrivalEbrgCode(String eorrArrivalEbrgCode) {
		this.eorrArrivalEbrgCode = eorrArrivalEbrgCode;
		addValidField("eorrArrivalEbrgCode");
	}

	/**
	 * Get eorrArrivalEbrgName
	 */
	@Column(name = "EORR_ARRIVAL_EBRG_NAME")
	public String getEorrArrivalEbrgName() {
		return eorrArrivalEbrgName;
	}

	/**
	 * Set eorrArrivalEbrgName
	 */
	public void setEorrArrivalEbrgName(String eorrArrivalEbrgName) {
		this.eorrArrivalEbrgName = eorrArrivalEbrgName;
		addValidField("eorrArrivalEbrgName");
	}

	/**
	 * Get eorrDischargeTime
	 */
	@Column(name = "EORR_DISCHARGE_TIME")
	public Date getEorrDischargeTime() {
		return eorrDischargeTime;
	}

	/**
	 * Set eorrDischargeTime
	 */
	public void setEorrDischargeTime(Date eorrDischargeTime) {
		this.eorrDischargeTime = eorrDischargeTime;
		addValidField("eorrDischargeTime");
	}

	/**
	 * Get eorrQuantity
	 */
	@Column(name = "EORR_QUANTITY")
	public Long getEorrQuantity() {
		return eorrQuantity;
	}

	/**
	 * Set eorrQuantity
	 */
	public void setEorrQuantity(Long eorrQuantity) {
		this.eorrQuantity = eorrQuantity;
		addValidField("eorrQuantity");
	}

	/**
	 * Get eorrWeight
	 */
	@Column(name = "EORR_WEIGHT")
	public Long getEorrWeight() {
		return eorrWeight;
	}

	/**
	 * Set eorrWeight
	 */
	public void setEorrWeight(Long eorrWeight) {
		this.eorrWeight = eorrWeight;
		addValidField("eorrWeight");
	}

	/**
	 * Get eorrNetWeight
	 */
	@Column(name = "EORR_NET_WEIGHT")
	public Long getEorrNetWeight() {
		return eorrNetWeight;
	}

	/**
	 * Set eorrNetWeight
	 */
	public void setEorrNetWeight(Long eorrNetWeight) {
		this.eorrNetWeight = eorrNetWeight;
		addValidField("eorrNetWeight");
	}

	/**
	 * Get eorrVolume
	 */
	@Column(name = "EORR_VOLUME")
	public Long getEorrVolume() {
		return eorrVolume;
	}

	/**
	 * Set eorrVolume
	 */
	public void setEorrVolume(Long eorrVolume) {
		this.eorrVolume = eorrVolume;
		addValidField("eorrVolume");
	}

	/**
	 * Get eorrDelayReason
	 */
	@Column(name = "EORR_DELAY_REASON")
	public String getEorrDelayReason() {
		return eorrDelayReason;
	}

	/**
	 * Set eorrDelayReason
	 */
	public void setEorrDelayReason(String eorrDelayReason) {
		this.eorrDelayReason = eorrDelayReason;
		addValidField("eorrDelayReason");
	}

	/**
	 * Get eorrRemark
	 */
	@Column(name = "EORR_REMARK")
	public String getEorrRemark() {
		return eorrRemark;
	}

	/**
	 * Set eorrRemark
	 */
	public void setEorrRemark(String eorrRemark) {
		this.eorrRemark = eorrRemark;
		addValidField("eorrRemark");
	}

	/**
	 * Get eorrSubstr1
	 */
	@Column(name = "EORR_SUBSTR1")
	public String getEorrSubstr1() {
		return eorrSubstr1;
	}

	/**
	 * Set eorrSubstr1
	 */
	public void setEorrSubstr1(String eorrSubstr1) {
		this.eorrSubstr1 = eorrSubstr1;
		addValidField("eorrSubstr1");
	}

	/**
	 * Get eorrSubstr2
	 */
	@Column(name = "EORR_SUBSTR2")
	public String getEorrSubstr2() {
		return eorrSubstr2;
	}

	/**
	 * Set eorrSubstr2
	 */
	public void setEorrSubstr2(String eorrSubstr2) {
		this.eorrSubstr2 = eorrSubstr2;
		addValidField("eorrSubstr2");
	}

	/**
	 * Get eorrSubstr3
	 */
	@Column(name = "EORR_SUBSTR3")
	public String getEorrSubstr3() {
		return eorrSubstr3;
	}

	/**
	 * Set eorrSubstr3
	 */
	public void setEorrSubstr3(String eorrSubstr3) {
		this.eorrSubstr3 = eorrSubstr3;
		addValidField("eorrSubstr3");
	}

	/**
	 * Get eorrSubstr4
	 */
	@Column(name = "EORR_SUBSTR4")
	public String getEorrSubstr4() {
		return eorrSubstr4;
	}

	/**
	 * Set eorrSubstr4
	 */
	public void setEorrSubstr4(String eorrSubstr4) {
		this.eorrSubstr4 = eorrSubstr4;
		addValidField("eorrSubstr4");
	}

	/**
	 * Get eorrSubstr5
	 */
	@Column(name = "EORR_SUBSTR5")
	public String getEorrSubstr5() {
		return eorrSubstr5;
	}

	/**
	 * Set eorrSubstr5
	 */
	public void setEorrSubstr5(String eorrSubstr5) {
		this.eorrSubstr5 = eorrSubstr5;
		addValidField("eorrSubstr5");
	}

	/**
	 * Get eorrSubstr6
	 */
	@Column(name = "EORR_SUBSTR6")
	public String getEorrSubstr6() {
		return eorrSubstr6;
	}

	/**
	 * Set eorrSubstr6
	 */
	public void setEorrSubstr6(String eorrSubstr6) {
		this.eorrSubstr6 = eorrSubstr6;
		addValidField("eorrSubstr6");
	}

	/**
	 * Get eorrSubstr7
	 */
	@Column(name = "EORR_SUBSTR7")
	public String getEorrSubstr7() {
		return eorrSubstr7;
	}

	/**
	 * Set eorrSubstr7
	 */
	public void setEorrSubstr7(String eorrSubstr7) {
		this.eorrSubstr7 = eorrSubstr7;
		addValidField("eorrSubstr7");
	}

	/**
	 * Get eorrSubstr8
	 */
	@Column(name = "EORR_SUBSTR8")
	public String getEorrSubstr8() {
		return eorrSubstr8;
	}

	/**
	 * Set eorrSubstr8
	 */
	public void setEorrSubstr8(String eorrSubstr8) {
		this.eorrSubstr8 = eorrSubstr8;
		addValidField("eorrSubstr8");
	}

	/**
	 * Get eorrSubstr9
	 */
	@Column(name = "EORR_SUBSTR9")
	public String getEorrSubstr9() {
		return eorrSubstr9;
	}

	/**
	 * Set eorrSubstr9
	 */
	public void setEorrSubstr9(String eorrSubstr9) {
		this.eorrSubstr9 = eorrSubstr9;
		addValidField("eorrSubstr9");
	}

	/**
	 * Get eorrSubstr10
	 */
	@Column(name = "EORR_SUBSTR10")
	public String getEorrSubstr10() {
		return eorrSubstr10;
	}

	/**
	 * Set eorrSubstr10
	 */
	public void setEorrSubstr10(String eorrSubstr10) {
		this.eorrSubstr10 = eorrSubstr10;
		addValidField("eorrSubstr10");
	}

	/**
	 * Get eorrSubstr11
	 */
	@Column(name = "EORR_SUBSTR11")
	public String getEorrSubstr11() {
		return eorrSubstr11;
	}

	/**
	 * Set eorrSubstr11
	 */
	public void setEorrSubstr11(String eorrSubstr11) {
		this.eorrSubstr11 = eorrSubstr11;
		addValidField("eorrSubstr11");
	}

	/**
	 * Get eorrSubstr12
	 */
	@Column(name = "EORR_SUBSTR12")
	public String getEorrSubstr12() {
		return eorrSubstr12;
	}

	/**
	 * Set eorrSubstr12
	 */
	public void setEorrSubstr12(String eorrSubstr12) {
		this.eorrSubstr12 = eorrSubstr12;
		addValidField("eorrSubstr12");
	}

	/**
	 * Get eorrSubstr13
	 */
	@Column(name = "EORR_SUBSTR13")
	public String getEorrSubstr13() {
		return eorrSubstr13;
	}

	/**
	 * Set eorrSubstr13
	 */
	public void setEorrSubstr13(String eorrSubstr13) {
		this.eorrSubstr13 = eorrSubstr13;
		addValidField("eorrSubstr13");
	}

	/**
	 * Get eorrSubstr14
	 */
	@Column(name = "EORR_SUBSTR14")
	public String getEorrSubstr14() {
		return eorrSubstr14;
	}

	/**
	 * Set eorrSubstr14
	 */
	public void setEorrSubstr14(String eorrSubstr14) {
		this.eorrSubstr14 = eorrSubstr14;
		addValidField("eorrSubstr14");
	}

	/**
	 * Get eorrSubstr15
	 */
	@Column(name = "EORR_SUBSTR15")
	public String getEorrSubstr15() {
		return eorrSubstr15;
	}

	/**
	 * Set eorrSubstr15
	 */
	public void setEorrSubstr15(String eorrSubstr15) {
		this.eorrSubstr15 = eorrSubstr15;
		addValidField("eorrSubstr15");
	}

	/**
	 * Get eorrSubstr16
	 */
	@Column(name = "EORR_SUBSTR16")
	public String getEorrSubstr16() {
		return eorrSubstr16;
	}

	/**
	 * Set eorrSubstr16
	 */
	public void setEorrSubstr16(String eorrSubstr16) {
		this.eorrSubstr16 = eorrSubstr16;
		addValidField("eorrSubstr16");
	}

	/**
	 * Get eorrSubstr17
	 */
	@Column(name = "EORR_SUBSTR17")
	public String getEorrSubstr17() {
		return eorrSubstr17;
	}

	/**
	 * Set eorrSubstr17
	 */
	public void setEorrSubstr17(String eorrSubstr17) {
		this.eorrSubstr17 = eorrSubstr17;
		addValidField("eorrSubstr17");
	}

	/**
	 * Get eorrSubstr18
	 */
	@Column(name = "EORR_SUBSTR18")
	public String getEorrSubstr18() {
		return eorrSubstr18;
	}

	/**
	 * Set eorrSubstr18
	 */
	public void setEorrSubstr18(String eorrSubstr18) {
		this.eorrSubstr18 = eorrSubstr18;
		addValidField("eorrSubstr18");
	}

	/**
	 * Get eorrSubstr19
	 */
	@Column(name = "EORR_SUBSTR19")
	public String getEorrSubstr19() {
		return eorrSubstr19;
	}

	/**
	 * Set eorrSubstr19
	 */
	public void setEorrSubstr19(String eorrSubstr19) {
		this.eorrSubstr19 = eorrSubstr19;
		addValidField("eorrSubstr19");
	}

	/**
	 * Get eorrSubstr20
	 */
	@Column(name = "EORR_SUBSTR20")
	public String getEorrSubstr20() {
		return eorrSubstr20;
	}

	/**
	 * Set eorrSubstr20
	 */
	public void setEorrSubstr20(String eorrSubstr20) {
		this.eorrSubstr20 = eorrSubstr20;
		addValidField("eorrSubstr20");
	}

	/**
	 * Get eorrSubstr21
	 */
	@Column(name = "EORR_SUBSTR21")
	public String getEorrSubstr21() {
		return eorrSubstr21;
	}

	/**
	 * Set eorrSubstr21
	 */
	public void setEorrSubstr21(String eorrSubstr21) {
		this.eorrSubstr21 = eorrSubstr21;
		addValidField("eorrSubstr21");
	}

	/**
	 * Get eorrSubstr22
	 */
	@Column(name = "EORR_SUBSTR22")
	public String getEorrSubstr22() {
		return eorrSubstr22;
	}

	/**
	 * Set eorrSubstr22
	 */
	public void setEorrSubstr22(String eorrSubstr22) {
		this.eorrSubstr22 = eorrSubstr22;
		addValidField("eorrSubstr22");
	}

	/**
	 * Get eorrSubstr23
	 */
	@Column(name = "EORR_SUBSTR23")
	public String getEorrSubstr23() {
		return eorrSubstr23;
	}

	/**
	 * Set eorrSubstr23
	 */
	public void setEorrSubstr23(String eorrSubstr23) {
		this.eorrSubstr23 = eorrSubstr23;
		addValidField("eorrSubstr23");
	}

	/**
	 * Get eorrSubstr24
	 */
	@Column(name = "EORR_SUBSTR24")
	public String getEorrSubstr24() {
		return eorrSubstr24;
	}

	/**
	 * Set eorrSubstr24
	 */
	public void setEorrSubstr24(String eorrSubstr24) {
		this.eorrSubstr24 = eorrSubstr24;
		addValidField("eorrSubstr24");
	}

	/**
	 * Get eorrSubstr25
	 */
	@Column(name = "EORR_SUBSTR25")
	public String getEorrSubstr25() {
		return eorrSubstr25;
	}

	/**
	 * Set eorrSubstr25
	 */
	public void setEorrSubstr25(String eorrSubstr25) {
		this.eorrSubstr25 = eorrSubstr25;
		addValidField("eorrSubstr25");
	}

	/**
	 * Get eorrSubdate1
	 */
	@Column(name = "EORR_SUBDATE1")
	public Date getEorrSubdate1() {
		return eorrSubdate1;
	}

	/**
	 * Set eorrSubdate1
	 */
	public void setEorrSubdate1(Date eorrSubdate1) {
		this.eorrSubdate1 = eorrSubdate1;
		addValidField("eorrSubdate1");
	}

	/**
	 * Get eorrSubdate2
	 */
	@Column(name = "EORR_SUBDATE2")
	public Date getEorrSubdate2() {
		return eorrSubdate2;
	}

	/**
	 * Set eorrSubdate2
	 */
	public void setEorrSubdate2(Date eorrSubdate2) {
		this.eorrSubdate2 = eorrSubdate2;
		addValidField("eorrSubdate2");
	}

	/**
	 * Get eorrSubdate3
	 */
	@Column(name = "EORR_SUBDATE3")
	public Date getEorrSubdate3() {
		return eorrSubdate3;
	}

	/**
	 * Set eorrSubdate3
	 */
	public void setEorrSubdate3(Date eorrSubdate3) {
		this.eorrSubdate3 = eorrSubdate3;
		addValidField("eorrSubdate3");
	}

	/**
	 * Get eorrSubdate4
	 */
	@Column(name = "EORR_SUBDATE4")
	public Date getEorrSubdate4() {
		return eorrSubdate4;
	}

	/**
	 * Set eorrSubdate4
	 */
	public void setEorrSubdate4(Date eorrSubdate4) {
		this.eorrSubdate4 = eorrSubdate4;
		addValidField("eorrSubdate4");
	}

	/**
	 * Get eorrSubdate5
	 */
	@Column(name = "EORR_SUBDATE5")
	public Date getEorrSubdate5() {
		return eorrSubdate5;
	}

	/**
	 * Set eorrSubdate5
	 */
	public void setEorrSubdate5(Date eorrSubdate5) {
		this.eorrSubdate5 = eorrSubdate5;
		addValidField("eorrSubdate5");
	}

	/**
	 * Get eorrSubdate6
	 */
	@Column(name = "EORR_SUBDATE6")
	public Date getEorrSubdate6() {
		return eorrSubdate6;
	}

	/**
	 * Set eorrSubdate6
	 */
	public void setEorrSubdate6(Date eorrSubdate6) {
		this.eorrSubdate6 = eorrSubdate6;
		addValidField("eorrSubdate6");
	}

	/**
	 * Get eorrSubdate7
	 */
	@Column(name = "EORR_SUBDATE7")
	public Date getEorrSubdate7() {
		return eorrSubdate7;
	}

	/**
	 * Set eorrSubdate7
	 */
	public void setEorrSubdate7(Date eorrSubdate7) {
		this.eorrSubdate7 = eorrSubdate7;
		addValidField("eorrSubdate7");
	}

	/**
	 * Get eorrSubdate8
	 */
	@Column(name = "EORR_SUBDATE8")
	public Date getEorrSubdate8() {
		return eorrSubdate8;
	}

	/**
	 * Set eorrSubdate8
	 */
	public void setEorrSubdate8(Date eorrSubdate8) {
		this.eorrSubdate8 = eorrSubdate8;
		addValidField("eorrSubdate8");
	}

	/**
	 * Get eorrSubdate9
	 */
	@Column(name = "EORR_SUBDATE9")
	public Date getEorrSubdate9() {
		return eorrSubdate9;
	}

	/**
	 * Set eorrSubdate9
	 */
	public void setEorrSubdate9(Date eorrSubdate9) {
		this.eorrSubdate9 = eorrSubdate9;
		addValidField("eorrSubdate9");
	}

	/**
	 * Get eorrSubdate10
	 */
	@Column(name = "EORR_SUBDATE10")
	public Date getEorrSubdate10() {
		return eorrSubdate10;
	}

	/**
	 * Set eorrSubdate10
	 */
	public void setEorrSubdate10(Date eorrSubdate10) {
		this.eorrSubdate10 = eorrSubdate10;
		addValidField("eorrSubdate10");
	}

	/**
	 * Get eorrSubnum1
	 */
	@Column(name = "EORR_SUBNUM1")
	public Long getEorrSubnum1() {
		return eorrSubnum1;
	}

	/**
	 * Set eorrSubnum1
	 */
	public void setEorrSubnum1(Long eorrSubnum1) {
		this.eorrSubnum1 = eorrSubnum1;
		addValidField("eorrSubnum1");
	}

	/**
	 * Get eorrSubnum2
	 */
	@Column(name = "EORR_SUBNUM2")
	public Long getEorrSubnum2() {
		return eorrSubnum2;
	}

	/**
	 * Set eorrSubnum2
	 */
	public void setEorrSubnum2(Long eorrSubnum2) {
		this.eorrSubnum2 = eorrSubnum2;
		addValidField("eorrSubnum2");
	}

	/**
	 * Get eorrSubnum3
	 */
	@Column(name = "EORR_SUBNUM3")
	public Long getEorrSubnum3() {
		return eorrSubnum3;
	}

	/**
	 * Set eorrSubnum3
	 */
	public void setEorrSubnum3(Long eorrSubnum3) {
		this.eorrSubnum3 = eorrSubnum3;
		addValidField("eorrSubnum3");
	}

	/**
	 * Get eorrSubnum4
	 */
	@Column(name = "EORR_SUBNUM4")
	public Long getEorrSubnum4() {
		return eorrSubnum4;
	}

	/**
	 * Set eorrSubnum4
	 */
	public void setEorrSubnum4(Long eorrSubnum4) {
		this.eorrSubnum4 = eorrSubnum4;
		addValidField("eorrSubnum4");
	}

	/**
	 * Get eorrSubnum5
	 */
	@Column(name = "EORR_SUBNUM5")
	public Long getEorrSubnum5() {
		return eorrSubnum5;
	}

	/**
	 * Set eorrSubnum5
	 */
	public void setEorrSubnum5(Long eorrSubnum5) {
		this.eorrSubnum5 = eorrSubnum5;
		addValidField("eorrSubnum5");
	}

	/**
	 * Get eorrSubnum6
	 */
	@Column(name = "EORR_SUBNUM6")
	public Long getEorrSubnum6() {
		return eorrSubnum6;
	}

	/**
	 * Set eorrSubnum6
	 */
	public void setEorrSubnum6(Long eorrSubnum6) {
		this.eorrSubnum6 = eorrSubnum6;
		addValidField("eorrSubnum6");
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
	 * Get eorrEscoCode
	 */
	@Column(name = "EORR_ESCO_CODE")
	public String getEorrEscoCode() {
		return eorrEscoCode;
	}

	/**
	 * Set eorrEscoCode
	 */
	public void setEorrEscoCode(String eorrEscoCode) {
		this.eorrEscoCode = eorrEscoCode;
		addValidField("eorrEscoCode");
	}

	/**
	 * Get eorrEscoNameCn
	 */
	@Column(name = "EORR_ESCO_NAME_CN")
	public String getEorrEscoNameCn() {
		return eorrEscoNameCn;
	}

	/**
	 * Set eorrEscoNameCn
	 */
	public void setEorrEscoNameCn(String eorrEscoNameCn) {
		this.eorrEscoNameCn = eorrEscoNameCn;
		addValidField("eorrEscoNameCn");
	}

	/**
	 * Get eorrEsdeDepartmentCode
	 */
	@Column(name = "EORR_ESDE_DEPARTMENT_CODE")
	public String getEorrEsdeDepartmentCode() {
		return eorrEsdeDepartmentCode;
	}

	/**
	 * Set eorrEsdeDepartmentCode
	 */
	public void setEorrEsdeDepartmentCode(String eorrEsdeDepartmentCode) {
		this.eorrEsdeDepartmentCode = eorrEsdeDepartmentCode;
		addValidField("eorrEsdeDepartmentCode");
	}

	/**
	 * Get eorrEsdeDepartmentName
	 */
	@Column(name = "EORR_ESDE_DEPARTMENT_NAME")
	public String getEorrEsdeDepartmentName() {
		return eorrEsdeDepartmentName;
	}

	/**
	 * Set eorrEsdeDepartmentName
	 */
	public void setEorrEsdeDepartmentName(String eorrEsdeDepartmentName) {
		this.eorrEsdeDepartmentName = eorrEsdeDepartmentName;
		addValidField("eorrEsdeDepartmentName");
	}

	/**
	 * Get eorrEsusUserNameCn
	 */
	@Column(name = "EORR_ESUS_USER_NAME_CN")
	public String getEorrEsusUserNameCn() {
		return eorrEsusUserNameCn;
	}

	/**
	 * Set eorrEsusUserNameCn
	 */
	public void setEorrEsusUserNameCn(String eorrEsusUserNameCn) {
		this.eorrEsusUserNameCn = eorrEsusUserNameCn;
		addValidField("eorrEsusUserNameCn");
	}

	/**
	 * Get eorrRetoType
	 */
	@Column(name = "EORR_RETO_TYPE")
	public Long getEorrRetoType() {
		return eorrRetoType;
	}

	/**
	 * Set eorrRetoType
	 */
	public void setEorrRetoType(Long eorrRetoType) {
		this.eorrRetoType = eorrRetoType;
		addValidField("eorrRetoType");
	}

	/**
	 * Get eorrCustomerClearaceTime
	 */
	@Column(name = "EORR_CUSTOMER_CLEARACE_TIME")
	public Date getEorrCustomerClearaceTime() {
		return eorrCustomerClearaceTime;
	}

	/**
	 * Set eorrCustomerClearaceTime
	 */
	public void setEorrCustomerClearaceTime(Date eorrCustomerClearaceTime) {
		this.eorrCustomerClearaceTime = eorrCustomerClearaceTime;
		addValidField("eorrCustomerClearaceTime");
	}

	/**
	 * Get eorrGoddsDelivery
	 */
	@Column(name = "EORR_GODDS_DELIVERY")
	public Date getEorrGoddsDelivery() {
		return eorrGoddsDelivery;
	}

	/**
	 * Set eorrGoddsDelivery
	 */
	public void setEorrGoddsDelivery(Date eorrGoddsDelivery) {
		this.eorrGoddsDelivery = eorrGoddsDelivery;
		addValidField("eorrGoddsDelivery");
	}

	/**
	 * Get eorrThroughNumber
	 */
	@Column(name = "EORR_THROUGH_NUMBER")
	public String getEorrThroughNumber() {
		return eorrThroughNumber;
	}

	/**
	 * Set eorrThroughNumber
	 */
	public void setEorrThroughNumber(String eorrThroughNumber) {
		this.eorrThroughNumber = eorrThroughNumber;
		addValidField("eorrThroughNumber");
	}

	/**
	 * Get eorrConsignmentBill
	 */
	@Column(name = "EORR_CONSIGNMENT_BILL")
	public String getEorrConsignmentBill() {
		return eorrConsignmentBill;
	}

	/**
	 * Set eorrConsignmentBill
	 */
	public void setEorrConsignmentBill(String eorrConsignmentBill) {
		this.eorrConsignmentBill = eorrConsignmentBill;
		addValidField("eorrConsignmentBill");
	}

}
