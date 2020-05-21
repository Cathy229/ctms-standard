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
 * Model class for EoRequestRoad
 */
@Entity
@Table(name = "EO_REQUEST_ROAD")
public class EoRequestRoadModel extends BaseModel implements OperationLog {

	//eortId
	private Long eortId;
	//eortEscoId
	private Long eortEscoId;
	//eortEbpjId
	private Long eortEbpjId;
	//eortLoEbppId
	private Long eortLoEbppId;
	//eortEbtkId
	private Long eortEbtkId;
	//eortIsAutomatic
	private String eortIsAutomatic;
	//eortTaskStatus
	private String eortTaskStatus;
	//eortTaskFeedback
	private String eortTaskFeedback;
	//eortSysCode
	private String eortSysCode;
	//eortEbbuId
	private Long eortEbbuId;
	//eortEbbuNameCn
	private String eortEbbuNameCn;
	//eortEbbuCode
	private String eortEbbuCode;
	//eortEbbuDist1
	private String eortEbbuDist1;
	//eortEbbuDist2
	private String eortEbbuDist2;
	//eortEbbuDist3
	private String eortEbbuDist3;
	//eortEbbuDist4
	private String eortEbbuDist4;
	//eortEbbuDist5
	private String eortEbbuDist5;
	//eortToId
	private String eortToId;
	//eortEoorId
	private Long eortEoorId;
	//eortNo
	private String eortNo;
	//eortType
	private String eortType;
	//eortStatus
	private String eortStatus;
	//eortOrder
	private Long eortOrder;
	//eortSoNo
	private String eortSoNo;
	//eortDoNo
	private String eortDoNo;
	//eortOwnerEbcuId
	private Long eortOwnerEbcuId;
	//eortOwnerEbcuCode
	private String eortOwnerEbcuCode;
	//eortOwnerEbcuName
	private String eortOwnerEbcuName;
	//eortSupplierEbcuId
	private Long eortSupplierEbcuId;
	//eortSupplierEbcuCode
	private String eortSupplierEbcuCode;
	//eortSupplierEbcuName
	private String eortSupplierEbcuName;
	//eortUrgency
	private String eortUrgency;
	//eortRemark
	private String eortRemark;
	//eortShippingNo
	private String eortShippingNo;
	//eortOrderDate
	private Date eortOrderDate;
	//eortReqDeliveryDate
	private Date eortReqDeliveryDate;
	//eortReqArrivalDate
	private Date eortReqArrivalDate;
	//eortTaskScheduleTime
	private Date eortTaskScheduleTime;
	//eortMentionTime
	private Date eortMentionTime;
	//eortDeliveryTime
	private Date eortDeliveryTime;
	//eortArrivalTime
	private Date eortArrivalTime;
	//eortBackTime
	private Date eortBackTime;
	//eortReturnTime
	private Date eortReturnTime;
	//eortTransportNumberBulk
	private Long eortTransportNumberBulk;
	//eortTransportNumber
	private Long eortTransportNumber;
	//eortTransportQuantity
	private Long eortTransportQuantity;
	//eortTransportVolume
	private Long eortTransportVolume;
	//eortTransportGw
	private Long eortTransportGw;
	//eortTransportNw
	private Long eortTransportNw;
	//eortSupplierEbspId
	private Long eortSupplierEbspId;
	//eortSupplierEbspNameCn
	private String eortSupplierEbspNameCn;
	//eortSupplierEbspNo
	private String eortSupplierEbspNo;
	//eortShipperEbsaPost
	private String eortShipperEbsaPost;
	//eortShipperEbsaContact
	private String eortShipperEbsaContact;
	//eortShipperEbsaTel
	private String eortShipperEbsaTel;
	//eortShipperEbsaFax
	private String eortShipperEbsaFax;
	//eortShipperEbsaEmail
	private String eortShipperEbsaEmail;
	//eortShipperEbsaId
	private Long eortShipperEbsaId;
	//eortShipperEbsaAddress
	private String eortShipperEbsaAddress;
	//eortShipperEbrgId
	private Long eortShipperEbrgId;
	//eortShipperEbrgNo
	private String eortShipperEbrgNo;
	//eortShipperEbrgNameCn
	private String eortShipperEbrgNameCn;
	//eortShipperEbplId
	private Long eortShipperEbplId;
	//eortShipperEbplNameCn
	private String eortShipperEbplNameCn;
	//eortConsigneeEbspId
	private Long eortConsigneeEbspId;
	//eortConsigneeEbspNameCn
	private String eortConsigneeEbspNameCn;
	//eortConsigneeEbspCode
	private String eortConsigneeEbspCode;
	//eortConsigneeEbsaPost
	private String eortConsigneeEbsaPost;
	//eortConsigneeEbsaContact
	private String eortConsigneeEbsaContact;
	//eortConsigneeEbsaTel
	private String eortConsigneeEbsaTel;
	//eortConsigneeEbsaFax
	private String eortConsigneeEbsaFax;
	//eortConsigneeEbsaEmail
	private String eortConsigneeEbsaEmail;
	//eortConsigneeEbsaId
	private Long eortConsigneeEbsaId;
	//eortConsigneeEbsaAddress
	private String eortConsigneeEbsaAddress;
	//eortConsigneeEbrgId
	private Long eortConsigneeEbrgId;
	//eortConsigneeEbrgNo
	private String eortConsigneeEbrgNo;
	//eortConsigneeEbrgNameCn
	private String eortConsigneeEbrgNameCn;
	//eortConsigneeEbplId
	private Long eortConsigneeEbplId;
	//eortConsigneeEbplNameCn
	private String eortConsigneeEbplNameCn;
	//eortSubstr1
	private String eortSubstr1;
	//eortSubstr2
	private String eortSubstr2;
	//eortSubstr3
	private String eortSubstr3;
	//eortSubstr4
	private String eortSubstr4;
	//eortSubstr5
	private String eortSubstr5;
	//eortSubstr6
	private String eortSubstr6;
	//eortSubstr7
	private String eortSubstr7;
	//eortSubstr8
	private String eortSubstr8;
	//eortSubstr9
	private String eortSubstr9;
	//eortSubstr10
	private String eortSubstr10;
	//eortSubstr11
	private String eortSubstr11;
	//eortSubstr12
	private String eortSubstr12;
	//eortSubstr13
	private String eortSubstr13;
	//eortSubstr14
	private String eortSubstr14;
	//eortSubstr15
	private String eortSubstr15;
	//eortSubstr16
	private String eortSubstr16;
	//eortSubstr17
	private String eortSubstr17;
	//eortSubstr18
	private String eortSubstr18;
	//eortSubstr19
	private String eortSubstr19;
	//eortSubstr20
	private String eortSubstr20;
	//eortSubstr21
	private String eortSubstr21;
	//eortSubstr22
	private String eortSubstr22;
	//eortSubstr23
	private String eortSubstr23;
	//eortSubstr24
	private String eortSubstr24;
	//eortSubstr25
	private String eortSubstr25;
	//eortSubdate1
	private Date eortSubdate1;
	//eortSubdate2
	private Date eortSubdate2;
	//eortSubdate3
	private Date eortSubdate3;
	//eortSubdate4
	private Date eortSubdate4;
	//eortSubdate5
	private Date eortSubdate5;
	//eortSubdate6
	private Date eortSubdate6;
	//eortSubnum1
	private Long eortSubnum1;
	//eortSubnum2
	private Long eortSubnum2;
	//eortSubnum3
	private Long eortSubnum3;
	//eortSubnum4
	private Long eortSubnum4;
	//eortSubnum5
	private Long eortSubnum5;
	//eortSubnum6
	private Long eortSubnum6;
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
	//eortEscoCode
	private String eortEscoCode;
	//eortEscoNameCn
	private String eortEscoNameCn;
	//eortEsdeDepartmentCode
	private String eortEsdeDepartmentCode;
	//eortEsdeDepartmentName
	private String eortEsdeDepartmentName;
	//eortEsusUserNameCn
	private String eortEsusUserNameCn;
	//eortRetoType
	private Long eortRetoType;

	/**
	 * Get eortId
	 */
	@Column(name = "EORT_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEortId() {
		return eortId;
	}

	/**
	 * Set eortId
	 */
	public void setEortId(Long eortId) {
		this.eortId = eortId;
		addValidField("eortId");
	}

	/**
	 * Get eortEscoId
	 */
	@Column(name = "EORT_ESCO_ID")
	public Long getEortEscoId() {
		return eortEscoId;
	}

	/**
	 * Set eortEscoId
	 */
	public void setEortEscoId(Long eortEscoId) {
		this.eortEscoId = eortEscoId;
		addValidField("eortEscoId");
	}

	/**
	 * Get eortEbpjId
	 */
	@Column(name = "EORT_EBPJ_ID")
	public Long getEortEbpjId() {
		return eortEbpjId;
	}

	/**
	 * Set eortEbpjId
	 */
	public void setEortEbpjId(Long eortEbpjId) {
		this.eortEbpjId = eortEbpjId;
		addValidField("eortEbpjId");
	}

	/**
	 * Get eortLoEbppId
	 */
	@Column(name = "EORT_LO_EBPP_ID")
	public Long getEortLoEbppId() {
		return eortLoEbppId;
	}

	/**
	 * Set eortLoEbppId
	 */
	public void setEortLoEbppId(Long eortLoEbppId) {
		this.eortLoEbppId = eortLoEbppId;
		addValidField("eortLoEbppId");
	}

	/**
	 * Get eortEbtkId
	 */
	@Column(name = "EORT_EBTK_ID")
	public Long getEortEbtkId() {
		return eortEbtkId;
	}

	/**
	 * Set eortEbtkId
	 */
	public void setEortEbtkId(Long eortEbtkId) {
		this.eortEbtkId = eortEbtkId;
		addValidField("eortEbtkId");
	}

	/**
	 * Get eortIsAutomatic
	 */
	@Column(name = "EORT_IS_AUTOMATIC")
	public String getEortIsAutomatic() {
		return eortIsAutomatic;
	}

	/**
	 * Set eortIsAutomatic
	 */
	public void setEortIsAutomatic(String eortIsAutomatic) {
		this.eortIsAutomatic = eortIsAutomatic;
		addValidField("eortIsAutomatic");
	}

	/**
	 * Get eortTaskStatus
	 */
	@Column(name = "EORT_TASK_STATUS")
	public String getEortTaskStatus() {
		return eortTaskStatus;
	}

	/**
	 * Set eortTaskStatus
	 */
	public void setEortTaskStatus(String eortTaskStatus) {
		this.eortTaskStatus = eortTaskStatus;
		addValidField("eortTaskStatus");
	}

	/**
	 * Get eortTaskFeedback
	 */
	@Column(name = "EORT_TASK_FEEDBACK")
	public String getEortTaskFeedback() {
		return eortTaskFeedback;
	}

	/**
	 * Set eortTaskFeedback
	 */
	public void setEortTaskFeedback(String eortTaskFeedback) {
		this.eortTaskFeedback = eortTaskFeedback;
		addValidField("eortTaskFeedback");
	}

	/**
	 * Get eortSysCode
	 */
	@Column(name = "EORT_SYS_CODE")
	public String getEortSysCode() {
		return eortSysCode;
	}

	/**
	 * Set eortSysCode
	 */
	public void setEortSysCode(String eortSysCode) {
		this.eortSysCode = eortSysCode;
		addValidField("eortSysCode");
	}

	/**
	 * Get eortEbbuId
	 */
	@Column(name = "EORT_EBBU_ID")
	public Long getEortEbbuId() {
		return eortEbbuId;
	}

	/**
	 * Set eortEbbuId
	 */
	public void setEortEbbuId(Long eortEbbuId) {
		this.eortEbbuId = eortEbbuId;
		addValidField("eortEbbuId");
	}

	/**
	 * Get eortEbbuNameCn
	 */
	@Column(name = "EORT_EBBU_NAME_CN")
	public String getEortEbbuNameCn() {
		return eortEbbuNameCn;
	}

	/**
	 * Set eortEbbuNameCn
	 */
	public void setEortEbbuNameCn(String eortEbbuNameCn) {
		this.eortEbbuNameCn = eortEbbuNameCn;
		addValidField("eortEbbuNameCn");
	}

	/**
	 * Get eortEbbuCode
	 */
	@Column(name = "EORT_EBBU_CODE")
	public String getEortEbbuCode() {
		return eortEbbuCode;
	}

	/**
	 * Set eortEbbuCode
	 */
	public void setEortEbbuCode(String eortEbbuCode) {
		this.eortEbbuCode = eortEbbuCode;
		addValidField("eortEbbuCode");
	}

	/**
	 * Get eortEbbuDist1
	 */
	@Column(name = "EORT_EBBU_DIST_1")
	public String getEortEbbuDist1() {
		return eortEbbuDist1;
	}

	/**
	 * Set eortEbbuDist1
	 */
	public void setEortEbbuDist1(String eortEbbuDist1) {
		this.eortEbbuDist1 = eortEbbuDist1;
		addValidField("eortEbbuDist1");
	}

	/**
	 * Get eortEbbuDist2
	 */
	@Column(name = "EORT_EBBU_DIST_2")
	public String getEortEbbuDist2() {
		return eortEbbuDist2;
	}

	/**
	 * Set eortEbbuDist2
	 */
	public void setEortEbbuDist2(String eortEbbuDist2) {
		this.eortEbbuDist2 = eortEbbuDist2;
		addValidField("eortEbbuDist2");
	}

	/**
	 * Get eortEbbuDist3
	 */
	@Column(name = "EORT_EBBU_DIST_3")
	public String getEortEbbuDist3() {
		return eortEbbuDist3;
	}

	/**
	 * Set eortEbbuDist3
	 */
	public void setEortEbbuDist3(String eortEbbuDist3) {
		this.eortEbbuDist3 = eortEbbuDist3;
		addValidField("eortEbbuDist3");
	}

	/**
	 * Get eortEbbuDist4
	 */
	@Column(name = "EORT_EBBU_DIST_4")
	public String getEortEbbuDist4() {
		return eortEbbuDist4;
	}

	/**
	 * Set eortEbbuDist4
	 */
	public void setEortEbbuDist4(String eortEbbuDist4) {
		this.eortEbbuDist4 = eortEbbuDist4;
		addValidField("eortEbbuDist4");
	}

	/**
	 * Get eortEbbuDist5
	 */
	@Column(name = "EORT_EBBU_DIST_5")
	public String getEortEbbuDist5() {
		return eortEbbuDist5;
	}

	/**
	 * Set eortEbbuDist5
	 */
	public void setEortEbbuDist5(String eortEbbuDist5) {
		this.eortEbbuDist5 = eortEbbuDist5;
		addValidField("eortEbbuDist5");
	}

	/**
	 * Get eortToId
	 */
	@Column(name = "EORT_TO_ID")
	public String getEortToId() {
		return eortToId;
	}

	/**
	 * Set eortToId
	 */
	public void setEortToId(String eortToId) {
		this.eortToId = eortToId;
		addValidField("eortToId");
	}

	/**
	 * Get eortEoorId
	 */
	@Column(name = "EORT_EOOR_ID")
	public Long getEortEoorId() {
		return eortEoorId;
	}

	/**
	 * Set eortEoorId
	 */
	public void setEortEoorId(Long eortEoorId) {
		this.eortEoorId = eortEoorId;
		addValidField("eortEoorId");
	}

	/**
	 * Get eortNo
	 */
	@Column(name = "EORT_NO")
	public String getEortNo() {
		return eortNo;
	}

	/**
	 * Set eortNo
	 */
	public void setEortNo(String eortNo) {
		this.eortNo = eortNo;
		addValidField("eortNo");
	}

	/**
	 * Get eortType
	 */
	@Column(name = "EORT_TYPE")
	public String getEortType() {
		return eortType;
	}

	/**
	 * Set eortType
	 */
	public void setEortType(String eortType) {
		this.eortType = eortType;
		addValidField("eortType");
	}

	/**
	 * Get eortStatus
	 */
	@Column(name = "EORT_STATUS")
	public String getEortStatus() {
		return eortStatus;
	}

	/**
	 * Set eortStatus
	 */
	public void setEortStatus(String eortStatus) {
		this.eortStatus = eortStatus;
		addValidField("eortStatus");
	}

	/**
	 * Get eortOrder
	 */
	@Column(name = "EORT_ORDER")
	public Long getEortOrder() {
		return eortOrder;
	}

	/**
	 * Set eortOrder
	 */
	public void setEortOrder(Long eortOrder) {
		this.eortOrder = eortOrder;
		addValidField("eortOrder");
	}

	/**
	 * Get eortSoNo
	 */
	@Column(name = "EORT_SO_NO")
	public String getEortSoNo() {
		return eortSoNo;
	}

	/**
	 * Set eortSoNo
	 */
	public void setEortSoNo(String eortSoNo) {
		this.eortSoNo = eortSoNo;
		addValidField("eortSoNo");
	}

	/**
	 * Get eortDoNo
	 */
	@Column(name = "EORT_DO_NO")
	public String getEortDoNo() {
		return eortDoNo;
	}

	/**
	 * Set eortDoNo
	 */
	public void setEortDoNo(String eortDoNo) {
		this.eortDoNo = eortDoNo;
		addValidField("eortDoNo");
	}

	/**
	 * Get eortOwnerEbcuId
	 */
	@Column(name = "EORT_OWNER_EBCU_ID")
	public Long getEortOwnerEbcuId() {
		return eortOwnerEbcuId;
	}

	/**
	 * Set eortOwnerEbcuId
	 */
	public void setEortOwnerEbcuId(Long eortOwnerEbcuId) {
		this.eortOwnerEbcuId = eortOwnerEbcuId;
		addValidField("eortOwnerEbcuId");
	}

	/**
	 * Get eortOwnerEbcuCode
	 */
	@Column(name = "EORT_OWNER_EBCU_CODE")
	public String getEortOwnerEbcuCode() {
		return eortOwnerEbcuCode;
	}

	/**
	 * Set eortOwnerEbcuCode
	 */
	public void setEortOwnerEbcuCode(String eortOwnerEbcuCode) {
		this.eortOwnerEbcuCode = eortOwnerEbcuCode;
		addValidField("eortOwnerEbcuCode");
	}

	/**
	 * Get eortOwnerEbcuName
	 */
	@Column(name = "EORT_OWNER_EBCU_NAME")
	public String getEortOwnerEbcuName() {
		return eortOwnerEbcuName;
	}

	/**
	 * Set eortOwnerEbcuName
	 */
	public void setEortOwnerEbcuName(String eortOwnerEbcuName) {
		this.eortOwnerEbcuName = eortOwnerEbcuName;
		addValidField("eortOwnerEbcuName");
	}

	/**
	 * Get eortSupplierEbcuId
	 */
	@Column(name = "EORT_SUPPLIER_EBCU_ID")
	public Long getEortSupplierEbcuId() {
		return eortSupplierEbcuId;
	}

	/**
	 * Set eortSupplierEbcuId
	 */
	public void setEortSupplierEbcuId(Long eortSupplierEbcuId) {
		this.eortSupplierEbcuId = eortSupplierEbcuId;
		addValidField("eortSupplierEbcuId");
	}

	/**
	 * Get eortSupplierEbcuCode
	 */
	@Column(name = "EORT_SUPPLIER_EBCU_CODE")
	public String getEortSupplierEbcuCode() {
		return eortSupplierEbcuCode;
	}

	/**
	 * Set eortSupplierEbcuCode
	 */
	public void setEortSupplierEbcuCode(String eortSupplierEbcuCode) {
		this.eortSupplierEbcuCode = eortSupplierEbcuCode;
		addValidField("eortSupplierEbcuCode");
	}

	/**
	 * Get eortSupplierEbcuName
	 */
	@Column(name = "EORT_SUPPLIER_EBCU_NAME")
	public String getEortSupplierEbcuName() {
		return eortSupplierEbcuName;
	}

	/**
	 * Set eortSupplierEbcuName
	 */
	public void setEortSupplierEbcuName(String eortSupplierEbcuName) {
		this.eortSupplierEbcuName = eortSupplierEbcuName;
		addValidField("eortSupplierEbcuName");
	}

	/**
	 * Get eortUrgency
	 */
	@Column(name = "EORT_URGENCY")
	public String getEortUrgency() {
		return eortUrgency;
	}

	/**
	 * Set eortUrgency
	 */
	public void setEortUrgency(String eortUrgency) {
		this.eortUrgency = eortUrgency;
		addValidField("eortUrgency");
	}

	/**
	 * Get eortRemark
	 */
	@Column(name = "EORT_REMARK")
	public String getEortRemark() {
		return eortRemark;
	}

	/**
	 * Set eortRemark
	 */
	public void setEortRemark(String eortRemark) {
		this.eortRemark = eortRemark;
		addValidField("eortRemark");
	}

	/**
	 * Get eortShippingNo
	 */
	@Column(name = "EORT_SHIPPING_NO")
	public String getEortShippingNo() {
		return eortShippingNo;
	}

	/**
	 * Set eortShippingNo
	 */
	public void setEortShippingNo(String eortShippingNo) {
		this.eortShippingNo = eortShippingNo;
		addValidField("eortShippingNo");
	}

	/**
	 * Get eortOrderDate
	 */
	@Column(name = "EORT_ORDER_DATE")
	public Date getEortOrderDate() {
		return eortOrderDate;
	}

	/**
	 * Set eortOrderDate
	 */
	public void setEortOrderDate(Date eortOrderDate) {
		this.eortOrderDate = eortOrderDate;
		addValidField("eortOrderDate");
	}

	/**
	 * Get eortReqDeliveryDate
	 */
	@Column(name = "EORT_REQ_DELIVERY_DATE")
	public Date getEortReqDeliveryDate() {
		return eortReqDeliveryDate;
	}

	/**
	 * Set eortReqDeliveryDate
	 */
	public void setEortReqDeliveryDate(Date eortReqDeliveryDate) {
		this.eortReqDeliveryDate = eortReqDeliveryDate;
		addValidField("eortReqDeliveryDate");
	}

	/**
	 * Get eortReqArrivalDate
	 */
	@Column(name = "EORT_REQ_ARRIVAL_DATE")
	public Date getEortReqArrivalDate() {
		return eortReqArrivalDate;
	}

	/**
	 * Set eortReqArrivalDate
	 */
	public void setEortReqArrivalDate(Date eortReqArrivalDate) {
		this.eortReqArrivalDate = eortReqArrivalDate;
		addValidField("eortReqArrivalDate");
	}

	/**
	 * Get eortTaskScheduleTime
	 */
	@Column(name = "EORT_TASK_SCHEDULE_TIME")
	public Date getEortTaskScheduleTime() {
		return eortTaskScheduleTime;
	}

	/**
	 * Set eortTaskScheduleTime
	 */
	public void setEortTaskScheduleTime(Date eortTaskScheduleTime) {
		this.eortTaskScheduleTime = eortTaskScheduleTime;
		addValidField("eortTaskScheduleTime");
	}

	/**
	 * Get eortMentionTime
	 */
	@Column(name = "EORT_MENTION_TIME")
	public Date getEortMentionTime() {
		return eortMentionTime;
	}

	/**
	 * Set eortMentionTime
	 */
	public void setEortMentionTime(Date eortMentionTime) {
		this.eortMentionTime = eortMentionTime;
		addValidField("eortMentionTime");
	}

	/**
	 * Get eortDeliveryTime
	 */
	@Column(name = "EORT_DELIVERY_TIME")
	public Date getEortDeliveryTime() {
		return eortDeliveryTime;
	}

	/**
	 * Set eortDeliveryTime
	 */
	public void setEortDeliveryTime(Date eortDeliveryTime) {
		this.eortDeliveryTime = eortDeliveryTime;
		addValidField("eortDeliveryTime");
	}

	/**
	 * Get eortArrivalTime
	 */
	@Column(name = "EORT_ARRIVAL_TIME")
	public Date getEortArrivalTime() {
		return eortArrivalTime;
	}

	/**
	 * Set eortArrivalTime
	 */
	public void setEortArrivalTime(Date eortArrivalTime) {
		this.eortArrivalTime = eortArrivalTime;
		addValidField("eortArrivalTime");
	}

	/**
	 * Get eortBackTime
	 */
	@Column(name = "EORT_BACK_TIME")
	public Date getEortBackTime() {
		return eortBackTime;
	}

	/**
	 * Set eortBackTime
	 */
	public void setEortBackTime(Date eortBackTime) {
		this.eortBackTime = eortBackTime;
		addValidField("eortBackTime");
	}

	/**
	 * Get eortReturnTime
	 */
	@Column(name = "EORT_RETURN_TIME")
	public Date getEortReturnTime() {
		return eortReturnTime;
	}

	/**
	 * Set eortReturnTime
	 */
	public void setEortReturnTime(Date eortReturnTime) {
		this.eortReturnTime = eortReturnTime;
		addValidField("eortReturnTime");
	}

	/**
	 * Get eortTransportNumberBulk
	 */
	@Column(name = "EORT_TRANSPORT_NUMBER_BULK")
	public Long getEortTransportNumberBulk() {
		return eortTransportNumberBulk;
	}

	/**
	 * Set eortTransportNumberBulk
	 */
	public void setEortTransportNumberBulk(Long eortTransportNumberBulk) {
		this.eortTransportNumberBulk = eortTransportNumberBulk;
		addValidField("eortTransportNumberBulk");
	}

	/**
	 * Get eortTransportNumber
	 */
	@Column(name = "EORT_TRANSPORT_NUMBER")
	public Long getEortTransportNumber() {
		return eortTransportNumber;
	}

	/**
	 * Set eortTransportNumber
	 */
	public void setEortTransportNumber(Long eortTransportNumber) {
		this.eortTransportNumber = eortTransportNumber;
		addValidField("eortTransportNumber");
	}

	/**
	 * Get eortTransportQuantity
	 */
	@Column(name = "EORT_TRANSPORT_QUANTITY")
	public Long getEortTransportQuantity() {
		return eortTransportQuantity;
	}

	/**
	 * Set eortTransportQuantity
	 */
	public void setEortTransportQuantity(Long eortTransportQuantity) {
		this.eortTransportQuantity = eortTransportQuantity;
		addValidField("eortTransportQuantity");
	}

	/**
	 * Get eortTransportVolume
	 */
	@Column(name = "EORT_TRANSPORT_VOLUME")
	public Long getEortTransportVolume() {
		return eortTransportVolume;
	}

	/**
	 * Set eortTransportVolume
	 */
	public void setEortTransportVolume(Long eortTransportVolume) {
		this.eortTransportVolume = eortTransportVolume;
		addValidField("eortTransportVolume");
	}

	/**
	 * Get eortTransportGw
	 */
	@Column(name = "EORT_TRANSPORT_GW")
	public Long getEortTransportGw() {
		return eortTransportGw;
	}

	/**
	 * Set eortTransportGw
	 */
	public void setEortTransportGw(Long eortTransportGw) {
		this.eortTransportGw = eortTransportGw;
		addValidField("eortTransportGw");
	}

	/**
	 * Get eortTransportNw
	 */
	@Column(name = "EORT_TRANSPORT_NW")
	public Long getEortTransportNw() {
		return eortTransportNw;
	}

	/**
	 * Set eortTransportNw
	 */
	public void setEortTransportNw(Long eortTransportNw) {
		this.eortTransportNw = eortTransportNw;
		addValidField("eortTransportNw");
	}

	/**
	 * Get eortSupplierEbspId
	 */
	@Column(name = "EORT_SUPPLIER_EBSP_ID")
	public Long getEortSupplierEbspId() {
		return eortSupplierEbspId;
	}

	/**
	 * Set eortSupplierEbspId
	 */
	public void setEortSupplierEbspId(Long eortSupplierEbspId) {
		this.eortSupplierEbspId = eortSupplierEbspId;
		addValidField("eortSupplierEbspId");
	}

	/**
	 * Get eortSupplierEbspNameCn
	 */
	@Column(name = "EORT_SUPPLIER_EBSP_NAME_CN")
	public String getEortSupplierEbspNameCn() {
		return eortSupplierEbspNameCn;
	}

	/**
	 * Set eortSupplierEbspNameCn
	 */
	public void setEortSupplierEbspNameCn(String eortSupplierEbspNameCn) {
		this.eortSupplierEbspNameCn = eortSupplierEbspNameCn;
		addValidField("eortSupplierEbspNameCn");
	}

	/**
	 * Get eortSupplierEbspNo
	 */
	@Column(name = "EORT_SUPPLIER_EBSP_NO")
	public String getEortSupplierEbspNo() {
		return eortSupplierEbspNo;
	}

	/**
	 * Set eortSupplierEbspNo
	 */
	public void setEortSupplierEbspNo(String eortSupplierEbspNo) {
		this.eortSupplierEbspNo = eortSupplierEbspNo;
		addValidField("eortSupplierEbspNo");
	}

	/**
	 * Get eortShipperEbsaPost
	 */
	@Column(name = "EORT_SHIPPER_EBSA_POST")
	public String getEortShipperEbsaPost() {
		return eortShipperEbsaPost;
	}

	/**
	 * Set eortShipperEbsaPost
	 */
	public void setEortShipperEbsaPost(String eortShipperEbsaPost) {
		this.eortShipperEbsaPost = eortShipperEbsaPost;
		addValidField("eortShipperEbsaPost");
	}

	/**
	 * Get eortShipperEbsaContact
	 */
	@Column(name = "EORT_SHIPPER_EBSA_CONTACT")
	public String getEortShipperEbsaContact() {
		return eortShipperEbsaContact;
	}

	/**
	 * Set eortShipperEbsaContact
	 */
	public void setEortShipperEbsaContact(String eortShipperEbsaContact) {
		this.eortShipperEbsaContact = eortShipperEbsaContact;
		addValidField("eortShipperEbsaContact");
	}

	/**
	 * Get eortShipperEbsaTel
	 */
	@Column(name = "EORT_SHIPPER_EBSA_TEL")
	public String getEortShipperEbsaTel() {
		return eortShipperEbsaTel;
	}

	/**
	 * Set eortShipperEbsaTel
	 */
	public void setEortShipperEbsaTel(String eortShipperEbsaTel) {
		this.eortShipperEbsaTel = eortShipperEbsaTel;
		addValidField("eortShipperEbsaTel");
	}

	/**
	 * Get eortShipperEbsaFax
	 */
	@Column(name = "EORT_SHIPPER_EBSA_FAX")
	public String getEortShipperEbsaFax() {
		return eortShipperEbsaFax;
	}

	/**
	 * Set eortShipperEbsaFax
	 */
	public void setEortShipperEbsaFax(String eortShipperEbsaFax) {
		this.eortShipperEbsaFax = eortShipperEbsaFax;
		addValidField("eortShipperEbsaFax");
	}

	/**
	 * Get eortShipperEbsaEmail
	 */
	@Column(name = "EORT_SHIPPER_EBSA_EMAIL")
	public String getEortShipperEbsaEmail() {
		return eortShipperEbsaEmail;
	}

	/**
	 * Set eortShipperEbsaEmail
	 */
	public void setEortShipperEbsaEmail(String eortShipperEbsaEmail) {
		this.eortShipperEbsaEmail = eortShipperEbsaEmail;
		addValidField("eortShipperEbsaEmail");
	}

	/**
	 * Get eortShipperEbsaId
	 */
	@Column(name = "EORT_SHIPPER_EBSA_ID")
	public Long getEortShipperEbsaId() {
		return eortShipperEbsaId;
	}

	/**
	 * Set eortShipperEbsaId
	 */
	public void setEortShipperEbsaId(Long eortShipperEbsaId) {
		this.eortShipperEbsaId = eortShipperEbsaId;
		addValidField("eortShipperEbsaId");
	}

	/**
	 * Get eortShipperEbsaAddress
	 */
	@Column(name = "EORT_SHIPPER_EBSA_ADDRESS")
	public String getEortShipperEbsaAddress() {
		return eortShipperEbsaAddress;
	}

	/**
	 * Set eortShipperEbsaAddress
	 */
	public void setEortShipperEbsaAddress(String eortShipperEbsaAddress) {
		this.eortShipperEbsaAddress = eortShipperEbsaAddress;
		addValidField("eortShipperEbsaAddress");
	}

	/**
	 * Get eortShipperEbrgId
	 */
	@Column(name = "EORT_SHIPPER_EBRG_ID")
	public Long getEortShipperEbrgId() {
		return eortShipperEbrgId;
	}

	/**
	 * Set eortShipperEbrgId
	 */
	public void setEortShipperEbrgId(Long eortShipperEbrgId) {
		this.eortShipperEbrgId = eortShipperEbrgId;
		addValidField("eortShipperEbrgId");
	}

	/**
	 * Get eortShipperEbrgNo
	 */
	@Column(name = "EORT_SHIPPER_EBRG_NO")
	public String getEortShipperEbrgNo() {
		return eortShipperEbrgNo;
	}

	/**
	 * Set eortShipperEbrgNo
	 */
	public void setEortShipperEbrgNo(String eortShipperEbrgNo) {
		this.eortShipperEbrgNo = eortShipperEbrgNo;
		addValidField("eortShipperEbrgNo");
	}

	/**
	 * Get eortShipperEbrgNameCn
	 */
	@Column(name = "EORT_SHIPPER_EBRG_NAME_CN")
	public String getEortShipperEbrgNameCn() {
		return eortShipperEbrgNameCn;
	}

	/**
	 * Set eortShipperEbrgNameCn
	 */
	public void setEortShipperEbrgNameCn(String eortShipperEbrgNameCn) {
		this.eortShipperEbrgNameCn = eortShipperEbrgNameCn;
		addValidField("eortShipperEbrgNameCn");
	}

	/**
	 * Get eortShipperEbplId
	 */
	@Column(name = "EORT_SHIPPER_EBPL_ID")
	public Long getEortShipperEbplId() {
		return eortShipperEbplId;
	}

	/**
	 * Set eortShipperEbplId
	 */
	public void setEortShipperEbplId(Long eortShipperEbplId) {
		this.eortShipperEbplId = eortShipperEbplId;
		addValidField("eortShipperEbplId");
	}

	/**
	 * Get eortShipperEbplNameCn
	 */
	@Column(name = "EORT_SHIPPER_EBPL_NAME_CN")
	public String getEortShipperEbplNameCn() {
		return eortShipperEbplNameCn;
	}

	/**
	 * Set eortShipperEbplNameCn
	 */
	public void setEortShipperEbplNameCn(String eortShipperEbplNameCn) {
		this.eortShipperEbplNameCn = eortShipperEbplNameCn;
		addValidField("eortShipperEbplNameCn");
	}

	/**
	 * Get eortConsigneeEbspId
	 */
	@Column(name = "EORT_CONSIGNEE_EBSP_ID")
	public Long getEortConsigneeEbspId() {
		return eortConsigneeEbspId;
	}

	/**
	 * Set eortConsigneeEbspId
	 */
	public void setEortConsigneeEbspId(Long eortConsigneeEbspId) {
		this.eortConsigneeEbspId = eortConsigneeEbspId;
		addValidField("eortConsigneeEbspId");
	}

	/**
	 * Get eortConsigneeEbspNameCn
	 */
	@Column(name = "EORT_CONSIGNEE_EBSP_NAME_CN")
	public String getEortConsigneeEbspNameCn() {
		return eortConsigneeEbspNameCn;
	}

	/**
	 * Set eortConsigneeEbspNameCn
	 */
	public void setEortConsigneeEbspNameCn(String eortConsigneeEbspNameCn) {
		this.eortConsigneeEbspNameCn = eortConsigneeEbspNameCn;
		addValidField("eortConsigneeEbspNameCn");
	}

	/**
	 * Get eortConsigneeEbspCode
	 */
	@Column(name = "EORT_CONSIGNEE_EBSP_CODE")
	public String getEortConsigneeEbspCode() {
		return eortConsigneeEbspCode;
	}

	/**
	 * Set eortConsigneeEbspCode
	 */
	public void setEortConsigneeEbspCode(String eortConsigneeEbspCode) {
		this.eortConsigneeEbspCode = eortConsigneeEbspCode;
		addValidField("eortConsigneeEbspCode");
	}

	/**
	 * Get eortConsigneeEbsaPost
	 */
	@Column(name = "EORT_CONSIGNEE_EBSA_POST")
	public String getEortConsigneeEbsaPost() {
		return eortConsigneeEbsaPost;
	}

	/**
	 * Set eortConsigneeEbsaPost
	 */
	public void setEortConsigneeEbsaPost(String eortConsigneeEbsaPost) {
		this.eortConsigneeEbsaPost = eortConsigneeEbsaPost;
		addValidField("eortConsigneeEbsaPost");
	}

	/**
	 * Get eortConsigneeEbsaContact
	 */
	@Column(name = "EORT_CONSIGNEE_EBSA_CONTACT")
	public String getEortConsigneeEbsaContact() {
		return eortConsigneeEbsaContact;
	}

	/**
	 * Set eortConsigneeEbsaContact
	 */
	public void setEortConsigneeEbsaContact(String eortConsigneeEbsaContact) {
		this.eortConsigneeEbsaContact = eortConsigneeEbsaContact;
		addValidField("eortConsigneeEbsaContact");
	}

	/**
	 * Get eortConsigneeEbsaTel
	 */
	@Column(name = "EORT_CONSIGNEE_EBSA_TEL")
	public String getEortConsigneeEbsaTel() {
		return eortConsigneeEbsaTel;
	}

	/**
	 * Set eortConsigneeEbsaTel
	 */
	public void setEortConsigneeEbsaTel(String eortConsigneeEbsaTel) {
		this.eortConsigneeEbsaTel = eortConsigneeEbsaTel;
		addValidField("eortConsigneeEbsaTel");
	}

	/**
	 * Get eortConsigneeEbsaFax
	 */
	@Column(name = "EORT_CONSIGNEE_EBSA_FAX")
	public String getEortConsigneeEbsaFax() {
		return eortConsigneeEbsaFax;
	}

	/**
	 * Set eortConsigneeEbsaFax
	 */
	public void setEortConsigneeEbsaFax(String eortConsigneeEbsaFax) {
		this.eortConsigneeEbsaFax = eortConsigneeEbsaFax;
		addValidField("eortConsigneeEbsaFax");
	}

	/**
	 * Get eortConsigneeEbsaEmail
	 */
	@Column(name = "EORT_CONSIGNEE_EBSA_EMAIL")
	public String getEortConsigneeEbsaEmail() {
		return eortConsigneeEbsaEmail;
	}

	/**
	 * Set eortConsigneeEbsaEmail
	 */
	public void setEortConsigneeEbsaEmail(String eortConsigneeEbsaEmail) {
		this.eortConsigneeEbsaEmail = eortConsigneeEbsaEmail;
		addValidField("eortConsigneeEbsaEmail");
	}

	/**
	 * Get eortConsigneeEbsaId
	 */
	@Column(name = "EORT_CONSIGNEE_EBSA_ID")
	public Long getEortConsigneeEbsaId() {
		return eortConsigneeEbsaId;
	}

	/**
	 * Set eortConsigneeEbsaId
	 */
	public void setEortConsigneeEbsaId(Long eortConsigneeEbsaId) {
		this.eortConsigneeEbsaId = eortConsigneeEbsaId;
		addValidField("eortConsigneeEbsaId");
	}

	/**
	 * Get eortConsigneeEbsaAddress
	 */
	@Column(name = "EORT_CONSIGNEE_EBSA_ADDRESS")
	public String getEortConsigneeEbsaAddress() {
		return eortConsigneeEbsaAddress;
	}

	/**
	 * Set eortConsigneeEbsaAddress
	 */
	public void setEortConsigneeEbsaAddress(String eortConsigneeEbsaAddress) {
		this.eortConsigneeEbsaAddress = eortConsigneeEbsaAddress;
		addValidField("eortConsigneeEbsaAddress");
	}

	/**
	 * Get eortConsigneeEbrgId
	 */
	@Column(name = "EORT_CONSIGNEE_EBRG_ID")
	public Long getEortConsigneeEbrgId() {
		return eortConsigneeEbrgId;
	}

	/**
	 * Set eortConsigneeEbrgId
	 */
	public void setEortConsigneeEbrgId(Long eortConsigneeEbrgId) {
		this.eortConsigneeEbrgId = eortConsigneeEbrgId;
		addValidField("eortConsigneeEbrgId");
	}

	/**
	 * Get eortConsigneeEbrgNo
	 */
	@Column(name = "EORT_CONSIGNEE_EBRG_NO")
	public String getEortConsigneeEbrgNo() {
		return eortConsigneeEbrgNo;
	}

	/**
	 * Set eortConsigneeEbrgNo
	 */
	public void setEortConsigneeEbrgNo(String eortConsigneeEbrgNo) {
		this.eortConsigneeEbrgNo = eortConsigneeEbrgNo;
		addValidField("eortConsigneeEbrgNo");
	}

	/**
	 * Get eortConsigneeEbrgNameCn
	 */
	@Column(name = "EORT_CONSIGNEE_EBRG_NAME_CN")
	public String getEortConsigneeEbrgNameCn() {
		return eortConsigneeEbrgNameCn;
	}

	/**
	 * Set eortConsigneeEbrgNameCn
	 */
	public void setEortConsigneeEbrgNameCn(String eortConsigneeEbrgNameCn) {
		this.eortConsigneeEbrgNameCn = eortConsigneeEbrgNameCn;
		addValidField("eortConsigneeEbrgNameCn");
	}

	/**
	 * Get eortConsigneeEbplId
	 */
	@Column(name = "EORT_CONSIGNEE_EBPL_ID")
	public Long getEortConsigneeEbplId() {
		return eortConsigneeEbplId;
	}

	/**
	 * Set eortConsigneeEbplId
	 */
	public void setEortConsigneeEbplId(Long eortConsigneeEbplId) {
		this.eortConsigneeEbplId = eortConsigneeEbplId;
		addValidField("eortConsigneeEbplId");
	}

	/**
	 * Get eortConsigneeEbplNameCn
	 */
	@Column(name = "EORT_CONSIGNEE_EBPL_NAME_CN")
	public String getEortConsigneeEbplNameCn() {
		return eortConsigneeEbplNameCn;
	}

	/**
	 * Set eortConsigneeEbplNameCn
	 */
	public void setEortConsigneeEbplNameCn(String eortConsigneeEbplNameCn) {
		this.eortConsigneeEbplNameCn = eortConsigneeEbplNameCn;
		addValidField("eortConsigneeEbplNameCn");
	}

	/**
	 * Get eortSubstr1
	 */
	@Column(name = "EORT_SUBSTR1")
	public String getEortSubstr1() {
		return eortSubstr1;
	}

	/**
	 * Set eortSubstr1
	 */
	public void setEortSubstr1(String eortSubstr1) {
		this.eortSubstr1 = eortSubstr1;
		addValidField("eortSubstr1");
	}

	/**
	 * Get eortSubstr2
	 */
	@Column(name = "EORT_SUBSTR2")
	public String getEortSubstr2() {
		return eortSubstr2;
	}

	/**
	 * Set eortSubstr2
	 */
	public void setEortSubstr2(String eortSubstr2) {
		this.eortSubstr2 = eortSubstr2;
		addValidField("eortSubstr2");
	}

	/**
	 * Get eortSubstr3
	 */
	@Column(name = "EORT_SUBSTR3")
	public String getEortSubstr3() {
		return eortSubstr3;
	}

	/**
	 * Set eortSubstr3
	 */
	public void setEortSubstr3(String eortSubstr3) {
		this.eortSubstr3 = eortSubstr3;
		addValidField("eortSubstr3");
	}

	/**
	 * Get eortSubstr4
	 */
	@Column(name = "EORT_SUBSTR4")
	public String getEortSubstr4() {
		return eortSubstr4;
	}

	/**
	 * Set eortSubstr4
	 */
	public void setEortSubstr4(String eortSubstr4) {
		this.eortSubstr4 = eortSubstr4;
		addValidField("eortSubstr4");
	}

	/**
	 * Get eortSubstr5
	 */
	@Column(name = "EORT_SUBSTR5")
	public String getEortSubstr5() {
		return eortSubstr5;
	}

	/**
	 * Set eortSubstr5
	 */
	public void setEortSubstr5(String eortSubstr5) {
		this.eortSubstr5 = eortSubstr5;
		addValidField("eortSubstr5");
	}

	/**
	 * Get eortSubstr6
	 */
	@Column(name = "EORT_SUBSTR6")
	public String getEortSubstr6() {
		return eortSubstr6;
	}

	/**
	 * Set eortSubstr6
	 */
	public void setEortSubstr6(String eortSubstr6) {
		this.eortSubstr6 = eortSubstr6;
		addValidField("eortSubstr6");
	}

	/**
	 * Get eortSubstr7
	 */
	@Column(name = "EORT_SUBSTR7")
	public String getEortSubstr7() {
		return eortSubstr7;
	}

	/**
	 * Set eortSubstr7
	 */
	public void setEortSubstr7(String eortSubstr7) {
		this.eortSubstr7 = eortSubstr7;
		addValidField("eortSubstr7");
	}

	/**
	 * Get eortSubstr8
	 */
	@Column(name = "EORT_SUBSTR8")
	public String getEortSubstr8() {
		return eortSubstr8;
	}

	/**
	 * Set eortSubstr8
	 */
	public void setEortSubstr8(String eortSubstr8) {
		this.eortSubstr8 = eortSubstr8;
		addValidField("eortSubstr8");
	}

	/**
	 * Get eortSubstr9
	 */
	@Column(name = "EORT_SUBSTR9")
	public String getEortSubstr9() {
		return eortSubstr9;
	}

	/**
	 * Set eortSubstr9
	 */
	public void setEortSubstr9(String eortSubstr9) {
		this.eortSubstr9 = eortSubstr9;
		addValidField("eortSubstr9");
	}

	/**
	 * Get eortSubstr10
	 */
	@Column(name = "EORT_SUBSTR10")
	public String getEortSubstr10() {
		return eortSubstr10;
	}

	/**
	 * Set eortSubstr10
	 */
	public void setEortSubstr10(String eortSubstr10) {
		this.eortSubstr10 = eortSubstr10;
		addValidField("eortSubstr10");
	}

	/**
	 * Get eortSubstr11
	 */
	@Column(name = "EORT_SUBSTR11")
	public String getEortSubstr11() {
		return eortSubstr11;
	}

	/**
	 * Set eortSubstr11
	 */
	public void setEortSubstr11(String eortSubstr11) {
		this.eortSubstr11 = eortSubstr11;
		addValidField("eortSubstr11");
	}

	/**
	 * Get eortSubstr12
	 */
	@Column(name = "EORT_SUBSTR12")
	public String getEortSubstr12() {
		return eortSubstr12;
	}

	/**
	 * Set eortSubstr12
	 */
	public void setEortSubstr12(String eortSubstr12) {
		this.eortSubstr12 = eortSubstr12;
		addValidField("eortSubstr12");
	}

	/**
	 * Get eortSubstr13
	 */
	@Column(name = "EORT_SUBSTR13")
	public String getEortSubstr13() {
		return eortSubstr13;
	}

	/**
	 * Set eortSubstr13
	 */
	public void setEortSubstr13(String eortSubstr13) {
		this.eortSubstr13 = eortSubstr13;
		addValidField("eortSubstr13");
	}

	/**
	 * Get eortSubstr14
	 */
	@Column(name = "EORT_SUBSTR14")
	public String getEortSubstr14() {
		return eortSubstr14;
	}

	/**
	 * Set eortSubstr14
	 */
	public void setEortSubstr14(String eortSubstr14) {
		this.eortSubstr14 = eortSubstr14;
		addValidField("eortSubstr14");
	}

	/**
	 * Get eortSubstr15
	 */
	@Column(name = "EORT_SUBSTR15")
	public String getEortSubstr15() {
		return eortSubstr15;
	}

	/**
	 * Set eortSubstr15
	 */
	public void setEortSubstr15(String eortSubstr15) {
		this.eortSubstr15 = eortSubstr15;
		addValidField("eortSubstr15");
	}

	/**
	 * Get eortSubstr16
	 */
	@Column(name = "EORT_SUBSTR16")
	public String getEortSubstr16() {
		return eortSubstr16;
	}

	/**
	 * Set eortSubstr16
	 */
	public void setEortSubstr16(String eortSubstr16) {
		this.eortSubstr16 = eortSubstr16;
		addValidField("eortSubstr16");
	}

	/**
	 * Get eortSubstr17
	 */
	@Column(name = "EORT_SUBSTR17")
	public String getEortSubstr17() {
		return eortSubstr17;
	}

	/**
	 * Set eortSubstr17
	 */
	public void setEortSubstr17(String eortSubstr17) {
		this.eortSubstr17 = eortSubstr17;
		addValidField("eortSubstr17");
	}

	/**
	 * Get eortSubstr18
	 */
	@Column(name = "EORT_SUBSTR18")
	public String getEortSubstr18() {
		return eortSubstr18;
	}

	/**
	 * Set eortSubstr18
	 */
	public void setEortSubstr18(String eortSubstr18) {
		this.eortSubstr18 = eortSubstr18;
		addValidField("eortSubstr18");
	}

	/**
	 * Get eortSubstr19
	 */
	@Column(name = "EORT_SUBSTR19")
	public String getEortSubstr19() {
		return eortSubstr19;
	}

	/**
	 * Set eortSubstr19
	 */
	public void setEortSubstr19(String eortSubstr19) {
		this.eortSubstr19 = eortSubstr19;
		addValidField("eortSubstr19");
	}

	/**
	 * Get eortSubstr20
	 */
	@Column(name = "EORT_SUBSTR20")
	public String getEortSubstr20() {
		return eortSubstr20;
	}

	/**
	 * Set eortSubstr20
	 */
	public void setEortSubstr20(String eortSubstr20) {
		this.eortSubstr20 = eortSubstr20;
		addValidField("eortSubstr20");
	}

	/**
	 * Get eortSubstr21
	 */
	@Column(name = "EORT_SUBSTR21")
	public String getEortSubstr21() {
		return eortSubstr21;
	}

	/**
	 * Set eortSubstr21
	 */
	public void setEortSubstr21(String eortSubstr21) {
		this.eortSubstr21 = eortSubstr21;
		addValidField("eortSubstr21");
	}

	/**
	 * Get eortSubstr22
	 */
	@Column(name = "EORT_SUBSTR22")
	public String getEortSubstr22() {
		return eortSubstr22;
	}

	/**
	 * Set eortSubstr22
	 */
	public void setEortSubstr22(String eortSubstr22) {
		this.eortSubstr22 = eortSubstr22;
		addValidField("eortSubstr22");
	}

	/**
	 * Get eortSubstr23
	 */
	@Column(name = "EORT_SUBSTR23")
	public String getEortSubstr23() {
		return eortSubstr23;
	}

	/**
	 * Set eortSubstr23
	 */
	public void setEortSubstr23(String eortSubstr23) {
		this.eortSubstr23 = eortSubstr23;
		addValidField("eortSubstr23");
	}

	/**
	 * Get eortSubstr24
	 */
	@Column(name = "EORT_SUBSTR24")
	public String getEortSubstr24() {
		return eortSubstr24;
	}

	/**
	 * Set eortSubstr24
	 */
	public void setEortSubstr24(String eortSubstr24) {
		this.eortSubstr24 = eortSubstr24;
		addValidField("eortSubstr24");
	}

	/**
	 * Get eortSubstr25
	 */
	@Column(name = "EORT_SUBSTR25")
	public String getEortSubstr25() {
		return eortSubstr25;
	}

	/**
	 * Set eortSubstr25
	 */
	public void setEortSubstr25(String eortSubstr25) {
		this.eortSubstr25 = eortSubstr25;
		addValidField("eortSubstr25");
	}

	/**
	 * Get eortSubdate1
	 */
	@Column(name = "EORT_SUBDATE1")
	public Date getEortSubdate1() {
		return eortSubdate1;
	}

	/**
	 * Set eortSubdate1
	 */
	public void setEortSubdate1(Date eortSubdate1) {
		this.eortSubdate1 = eortSubdate1;
		addValidField("eortSubdate1");
	}

	/**
	 * Get eortSubdate2
	 */
	@Column(name = "EORT_SUBDATE2")
	public Date getEortSubdate2() {
		return eortSubdate2;
	}

	/**
	 * Set eortSubdate2
	 */
	public void setEortSubdate2(Date eortSubdate2) {
		this.eortSubdate2 = eortSubdate2;
		addValidField("eortSubdate2");
	}

	/**
	 * Get eortSubdate3
	 */
	@Column(name = "EORT_SUBDATE3")
	public Date getEortSubdate3() {
		return eortSubdate3;
	}

	/**
	 * Set eortSubdate3
	 */
	public void setEortSubdate3(Date eortSubdate3) {
		this.eortSubdate3 = eortSubdate3;
		addValidField("eortSubdate3");
	}

	/**
	 * Get eortSubdate4
	 */
	@Column(name = "EORT_SUBDATE4")
	public Date getEortSubdate4() {
		return eortSubdate4;
	}

	/**
	 * Set eortSubdate4
	 */
	public void setEortSubdate4(Date eortSubdate4) {
		this.eortSubdate4 = eortSubdate4;
		addValidField("eortSubdate4");
	}

	/**
	 * Get eortSubdate5
	 */
	@Column(name = "EORT_SUBDATE5")
	public Date getEortSubdate5() {
		return eortSubdate5;
	}

	/**
	 * Set eortSubdate5
	 */
	public void setEortSubdate5(Date eortSubdate5) {
		this.eortSubdate5 = eortSubdate5;
		addValidField("eortSubdate5");
	}

	/**
	 * Get eortSubdate6
	 */
	@Column(name = "EORT_SUBDATE6")
	public Date getEortSubdate6() {
		return eortSubdate6;
	}

	/**
	 * Set eortSubdate6
	 */
	public void setEortSubdate6(Date eortSubdate6) {
		this.eortSubdate6 = eortSubdate6;
		addValidField("eortSubdate6");
	}

	/**
	 * Get eortSubnum1
	 */
	@Column(name = "EORT_SUBNUM1")
	public Long getEortSubnum1() {
		return eortSubnum1;
	}

	/**
	 * Set eortSubnum1
	 */
	public void setEortSubnum1(Long eortSubnum1) {
		this.eortSubnum1 = eortSubnum1;
		addValidField("eortSubnum1");
	}

	/**
	 * Get eortSubnum2
	 */
	@Column(name = "EORT_SUBNUM2")
	public Long getEortSubnum2() {
		return eortSubnum2;
	}

	/**
	 * Set eortSubnum2
	 */
	public void setEortSubnum2(Long eortSubnum2) {
		this.eortSubnum2 = eortSubnum2;
		addValidField("eortSubnum2");
	}

	/**
	 * Get eortSubnum3
	 */
	@Column(name = "EORT_SUBNUM3")
	public Long getEortSubnum3() {
		return eortSubnum3;
	}

	/**
	 * Set eortSubnum3
	 */
	public void setEortSubnum3(Long eortSubnum3) {
		this.eortSubnum3 = eortSubnum3;
		addValidField("eortSubnum3");
	}

	/**
	 * Get eortSubnum4
	 */
	@Column(name = "EORT_SUBNUM4")
	public Long getEortSubnum4() {
		return eortSubnum4;
	}

	/**
	 * Set eortSubnum4
	 */
	public void setEortSubnum4(Long eortSubnum4) {
		this.eortSubnum4 = eortSubnum4;
		addValidField("eortSubnum4");
	}

	/**
	 * Get eortSubnum5
	 */
	@Column(name = "EORT_SUBNUM5")
	public Long getEortSubnum5() {
		return eortSubnum5;
	}

	/**
	 * Set eortSubnum5
	 */
	public void setEortSubnum5(Long eortSubnum5) {
		this.eortSubnum5 = eortSubnum5;
		addValidField("eortSubnum5");
	}

	/**
	 * Get eortSubnum6
	 */
	@Column(name = "EORT_SUBNUM6")
	public Long getEortSubnum6() {
		return eortSubnum6;
	}

	/**
	 * Set eortSubnum6
	 */
	public void setEortSubnum6(Long eortSubnum6) {
		this.eortSubnum6 = eortSubnum6;
		addValidField("eortSubnum6");
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
	 * Get eortEscoCode
	 */
	@Column(name = "EORT_ESCO_CODE")
	public String getEortEscoCode() {
		return eortEscoCode;
	}

	/**
	 * Set eortEscoCode
	 */
	public void setEortEscoCode(String eortEscoCode) {
		this.eortEscoCode = eortEscoCode;
		addValidField("eortEscoCode");
	}

	/**
	 * Get eortEscoNameCn
	 */
	@Column(name = "EORT_ESCO_NAME_CN")
	public String getEortEscoNameCn() {
		return eortEscoNameCn;
	}

	/**
	 * Set eortEscoNameCn
	 */
	public void setEortEscoNameCn(String eortEscoNameCn) {
		this.eortEscoNameCn = eortEscoNameCn;
		addValidField("eortEscoNameCn");
	}

	/**
	 * Get eortEsdeDepartmentCode
	 */
	@Column(name = "EORT_ESDE_DEPARTMENT_CODE")
	public String getEortEsdeDepartmentCode() {
		return eortEsdeDepartmentCode;
	}

	/**
	 * Set eortEsdeDepartmentCode
	 */
	public void setEortEsdeDepartmentCode(String eortEsdeDepartmentCode) {
		this.eortEsdeDepartmentCode = eortEsdeDepartmentCode;
		addValidField("eortEsdeDepartmentCode");
	}

	/**
	 * Get eortEsdeDepartmentName
	 */
	@Column(name = "EORT_ESDE_DEPARTMENT_NAME")
	public String getEortEsdeDepartmentName() {
		return eortEsdeDepartmentName;
	}

	/**
	 * Set eortEsdeDepartmentName
	 */
	public void setEortEsdeDepartmentName(String eortEsdeDepartmentName) {
		this.eortEsdeDepartmentName = eortEsdeDepartmentName;
		addValidField("eortEsdeDepartmentName");
	}

	/**
	 * Get eortEsusUserNameCn
	 */
	@Column(name = "EORT_ESUS_USER_NAME_CN")
	public String getEortEsusUserNameCn() {
		return eortEsusUserNameCn;
	}

	/**
	 * Set eortEsusUserNameCn
	 */
	public void setEortEsusUserNameCn(String eortEsusUserNameCn) {
		this.eortEsusUserNameCn = eortEsusUserNameCn;
		addValidField("eortEsusUserNameCn");
	}

	/**
	 * Get eortRetoType
	 */
	@Column(name = "EORT_RETO_TYPE")
	public Long getEortRetoType() {
		return eortRetoType;
	}

	/**
	 * Set eortRetoType
	 */
	public void setEortRetoType(Long eortRetoType) {
		this.eortRetoType = eortRetoType;
		addValidField("eortRetoType");
	}

}
