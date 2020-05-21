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
 * Model class for EoFreightOmport
 */
@Entity
@Table(name = "EO_FREIGHT_OMPORT")
public class EoFreightOmportModel extends BaseModel implements OperationLog {

	//eofoId
	private Long eofoId;
	//eofoEscoId
	private Long eofoEscoId;
	//eofoEoorId
	private Long eofoEoorId;
	//eofoEbpjId
	private Long eofoEbpjId;
	//eofoLoEbppId
	private Long eofoLoEbppId;
	//eofoEbtkId
	private Long eofoEbtkId;
	//eofoTaskStatus
	private String eofoTaskStatus;
	//eofoIsAutomatic
	private String eofoIsAutomatic;
	//eofoTaskFeedback
	private String eofoTaskFeedback;
	//eofoSysCode
	private String eofoSysCode;
	//eofoEbbuId
	private Long eofoEbbuId;
	//eofoEbbuNameCn
	private String eofoEbbuNameCn;
	//eofoEbbuCode
	private String eofoEbbuCode;
	//eofoEbbuDist1
	private String eofoEbbuDist1;
	//eofoEbbuDist2
	private String eofoEbbuDist2;
	//eofoEbbuDist3
	private String eofoEbbuDist3;
	//eofoEbbuDist4
	private String eofoEbbuDist4;
	//eofoEbbuDist5
	private String eofoEbbuDist5;
	//eofoEscoCode
	private String eofoEscoCode;
	//eofoEsdeDepartmentCode
	private String eofoEsdeDepartmentCode;
	//eofoEscoNameCn
	private String eofoEscoNameCn;
	//eofoEsdeDepartmentName
	private String eofoEsdeDepartmentName;
	//eofoEsusUserNameCn
	private String eofoEsusUserNameCn;
	//eofoRetoType
	private Long eofoRetoType;
	//eofoToId
	private String eofoToId;
	//eofoNo
	private String eofoNo;
	//eofoType
	private String eofoType;
	//eofoStatus
	private String eofoStatus;
	//eofoOrder
	private Long eofoOrder;
	//eofoSoNo
	private String eofoSoNo;
	//eofoDoNo
	private String eofoDoNo;
	//eofoReceivingParty
	private String eofoReceivingParty;
	//eofoBulkBillNo
	private String eofoBulkBillNo;
	//eofoHblNo
	private String eofoHblNo;
	//eofoIsDutyfree
	private Long eofoIsDutyfree;
	//eofoIsCheck
	private Long eofoIsCheck;
	//eofoDeclarationNo
	private String eofoDeclarationNo;
	//eofoCheckEbrgId
	private Long eofoCheckEbrgId;
	//eofoCheckEbrgName
	private String eofoCheckEbrgName;
	//eofoIsSendCar
	private Long eofoIsSendCar;
	//eofoCheckType
	private String eofoCheckType;
	//eofoCheckSendCarDate
	private Date eofoCheckSendCarDate;
	//eofoCheckOpenCtnDate
	private Date eofoCheckOpenCtnDate;
	//eofoCheckAllTime
	private Date eofoCheckAllTime;
	//eofoCustomsCheckUser
	private String eofoCustomsCheckUser;
	//eofoInspectionNo
	private String eofoInspectionNo;
	//eofoInspectionEbrgId
	private Long eofoInspectionEbrgId;
	//eofoInspectionEbrgName
	private String eofoInspectionEbrgName;
	//eofoPlanInspectionDate
	private Date eofoPlanInspectionDate;
	//eofoVehicle
	private String eofoVehicle;
	//eofoInspectionType
	private String eofoInspectionType;
	//eofoInspectionSendCar
	private Date eofoInspectionSendCar;
	//eofoInspectionOpenCtnDate
	private Date eofoInspectionOpenCtnDate;
	//eofoInspectionAllDate
	private Date eofoInspectionAllDate;
	//eofoInspectionUser
	private String eofoInspectionUser;
	//eofoRemark
	private String eofoRemark;
	//eofoSubstr1
	private String eofoSubstr1;
	//eofoSubstr2
	private String eofoSubstr2;
	//eofoSubstr3
	private String eofoSubstr3;
	//eofoSubstr4
	private String eofoSubstr4;
	//eofoSubstr5
	private String eofoSubstr5;
	//eofoSubstr6
	private String eofoSubstr6;
	//eofoSubstr7
	private String eofoSubstr7;
	//eofoSubstr8
	private String eofoSubstr8;
	//eofoSubdate1
	private Date eofoSubdate1;
	//eofoSubdate2
	private Date eofoSubdate2;
	//eofoSubdate3
	private Date eofoSubdate3;
	//eofoSubdate4
	private Date eofoSubdate4;
	//eofoSubnum1
	private Long eofoSubnum1;
	//eofoSubnum2
	private Long eofoSubnum2;
	//eofoSubnum3
	private Long eofoSubnum3;
	//eofoSubnum4
	private Long eofoSubnum4;
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

	/**
	 * Get eofoId
	 */
	@Column(name = "EOFO_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEofoId() {
		return eofoId;
	}

	/**
	 * Set eofoId
	 */
	public void setEofoId(Long eofoId) {
		this.eofoId = eofoId;
		addValidField("eofoId");
	}

	/**
	 * Get eofoEscoId
	 */
	@Column(name = "EOFO_ESCO_ID")
	public Long getEofoEscoId() {
		return eofoEscoId;
	}

	/**
	 * Set eofoEscoId
	 */
	public void setEofoEscoId(Long eofoEscoId) {
		this.eofoEscoId = eofoEscoId;
		addValidField("eofoEscoId");
	}

	/**
	 * Get eofoEoorId
	 */
	@Column(name = "EOFO_EOOR_ID")
	public Long getEofoEoorId() {
		return eofoEoorId;
	}

	/**
	 * Set eofoEoorId
	 */
	public void setEofoEoorId(Long eofoEoorId) {
		this.eofoEoorId = eofoEoorId;
		addValidField("eofoEoorId");
	}

	/**
	 * Get eofoEbpjId
	 */
	@Column(name = "EOFO_EBPJ_ID")
	public Long getEofoEbpjId() {
		return eofoEbpjId;
	}

	/**
	 * Set eofoEbpjId
	 */
	public void setEofoEbpjId(Long eofoEbpjId) {
		this.eofoEbpjId = eofoEbpjId;
		addValidField("eofoEbpjId");
	}

	/**
	 * Get eofoLoEbppId
	 */
	@Column(name = "EOFO_LO_EBPP_ID")
	public Long getEofoLoEbppId() {
		return eofoLoEbppId;
	}

	/**
	 * Set eofoLoEbppId
	 */
	public void setEofoLoEbppId(Long eofoLoEbppId) {
		this.eofoLoEbppId = eofoLoEbppId;
		addValidField("eofoLoEbppId");
	}

	/**
	 * Get eofoEbtkId
	 */
	@Column(name = "EOFO_EBTK_ID")
	public Long getEofoEbtkId() {
		return eofoEbtkId;
	}

	/**
	 * Set eofoEbtkId
	 */
	public void setEofoEbtkId(Long eofoEbtkId) {
		this.eofoEbtkId = eofoEbtkId;
		addValidField("eofoEbtkId");
	}

	/**
	 * Get eofoTaskStatus
	 */
	@Column(name = "EOFO_TASK_STATUS")
	public String getEofoTaskStatus() {
		return eofoTaskStatus;
	}

	/**
	 * Set eofoTaskStatus
	 */
	public void setEofoTaskStatus(String eofoTaskStatus) {
		this.eofoTaskStatus = eofoTaskStatus;
		addValidField("eofoTaskStatus");
	}

	/**
	 * Get eofoIsAutomatic
	 */
	@Column(name = "EOFO_IS_AUTOMATIC")
	public String getEofoIsAutomatic() {
		return eofoIsAutomatic;
	}

	/**
	 * Set eofoIsAutomatic
	 */
	public void setEofoIsAutomatic(String eofoIsAutomatic) {
		this.eofoIsAutomatic = eofoIsAutomatic;
		addValidField("eofoIsAutomatic");
	}

	/**
	 * Get eofoTaskFeedback
	 */
	@Column(name = "EOFO_TASK_FEEDBACK")
	public String getEofoTaskFeedback() {
		return eofoTaskFeedback;
	}

	/**
	 * Set eofoTaskFeedback
	 */
	public void setEofoTaskFeedback(String eofoTaskFeedback) {
		this.eofoTaskFeedback = eofoTaskFeedback;
		addValidField("eofoTaskFeedback");
	}

	/**
	 * Get eofoSysCode
	 */
	@Column(name = "EOFO_SYS_CODE")
	public String getEofoSysCode() {
		return eofoSysCode;
	}

	/**
	 * Set eofoSysCode
	 */
	public void setEofoSysCode(String eofoSysCode) {
		this.eofoSysCode = eofoSysCode;
		addValidField("eofoSysCode");
	}

	/**
	 * Get eofoEbbuId
	 */
	@Column(name = "EOFO_EBBU_ID")
	public Long getEofoEbbuId() {
		return eofoEbbuId;
	}

	/**
	 * Set eofoEbbuId
	 */
	public void setEofoEbbuId(Long eofoEbbuId) {
		this.eofoEbbuId = eofoEbbuId;
		addValidField("eofoEbbuId");
	}

	/**
	 * Get eofoEbbuNameCn
	 */
	@Column(name = "EOFO_EBBU_NAME_CN")
	public String getEofoEbbuNameCn() {
		return eofoEbbuNameCn;
	}

	/**
	 * Set eofoEbbuNameCn
	 */
	public void setEofoEbbuNameCn(String eofoEbbuNameCn) {
		this.eofoEbbuNameCn = eofoEbbuNameCn;
		addValidField("eofoEbbuNameCn");
	}

	/**
	 * Get eofoEbbuCode
	 */
	@Column(name = "EOFO_EBBU_CODE")
	public String getEofoEbbuCode() {
		return eofoEbbuCode;
	}

	/**
	 * Set eofoEbbuCode
	 */
	public void setEofoEbbuCode(String eofoEbbuCode) {
		this.eofoEbbuCode = eofoEbbuCode;
		addValidField("eofoEbbuCode");
	}

	/**
	 * Get eofoEbbuDist1
	 */
	@Column(name = "EOFO_EBBU_DIST_1")
	public String getEofoEbbuDist1() {
		return eofoEbbuDist1;
	}

	/**
	 * Set eofoEbbuDist1
	 */
	public void setEofoEbbuDist1(String eofoEbbuDist1) {
		this.eofoEbbuDist1 = eofoEbbuDist1;
		addValidField("eofoEbbuDist1");
	}

	/**
	 * Get eofoEbbuDist2
	 */
	@Column(name = "EOFO_EBBU_DIST_2")
	public String getEofoEbbuDist2() {
		return eofoEbbuDist2;
	}

	/**
	 * Set eofoEbbuDist2
	 */
	public void setEofoEbbuDist2(String eofoEbbuDist2) {
		this.eofoEbbuDist2 = eofoEbbuDist2;
		addValidField("eofoEbbuDist2");
	}

	/**
	 * Get eofoEbbuDist3
	 */
	@Column(name = "EOFO_EBBU_DIST_3")
	public String getEofoEbbuDist3() {
		return eofoEbbuDist3;
	}

	/**
	 * Set eofoEbbuDist3
	 */
	public void setEofoEbbuDist3(String eofoEbbuDist3) {
		this.eofoEbbuDist3 = eofoEbbuDist3;
		addValidField("eofoEbbuDist3");
	}

	/**
	 * Get eofoEbbuDist4
	 */
	@Column(name = "EOFO_EBBU_DIST_4")
	public String getEofoEbbuDist4() {
		return eofoEbbuDist4;
	}

	/**
	 * Set eofoEbbuDist4
	 */
	public void setEofoEbbuDist4(String eofoEbbuDist4) {
		this.eofoEbbuDist4 = eofoEbbuDist4;
		addValidField("eofoEbbuDist4");
	}

	/**
	 * Get eofoEbbuDist5
	 */
	@Column(name = "EOFO_EBBU_DIST_5")
	public String getEofoEbbuDist5() {
		return eofoEbbuDist5;
	}

	/**
	 * Set eofoEbbuDist5
	 */
	public void setEofoEbbuDist5(String eofoEbbuDist5) {
		this.eofoEbbuDist5 = eofoEbbuDist5;
		addValidField("eofoEbbuDist5");
	}

	/**
	 * Get eofoEscoCode
	 */
	@Column(name = "EOFO_ESCO_CODE")
	public String getEofoEscoCode() {
		return eofoEscoCode;
	}

	/**
	 * Set eofoEscoCode
	 */
	public void setEofoEscoCode(String eofoEscoCode) {
		this.eofoEscoCode = eofoEscoCode;
		addValidField("eofoEscoCode");
	}

	/**
	 * Get eofoEsdeDepartmentCode
	 */
	@Column(name = "EOFO_ESDE_DEPARTMENT_CODE")
	public String getEofoEsdeDepartmentCode() {
		return eofoEsdeDepartmentCode;
	}

	/**
	 * Set eofoEsdeDepartmentCode
	 */
	public void setEofoEsdeDepartmentCode(String eofoEsdeDepartmentCode) {
		this.eofoEsdeDepartmentCode = eofoEsdeDepartmentCode;
		addValidField("eofoEsdeDepartmentCode");
	}

	/**
	 * Get eofoEscoNameCn
	 */
	@Column(name = "EOFO_ESCO_NAME_CN")
	public String getEofoEscoNameCn() {
		return eofoEscoNameCn;
	}

	/**
	 * Set eofoEscoNameCn
	 */
	public void setEofoEscoNameCn(String eofoEscoNameCn) {
		this.eofoEscoNameCn = eofoEscoNameCn;
		addValidField("eofoEscoNameCn");
	}

	/**
	 * Get eofoEsdeDepartmentName
	 */
	@Column(name = "EOFO_ESDE_DEPARTMENT_NAME")
	public String getEofoEsdeDepartmentName() {
		return eofoEsdeDepartmentName;
	}

	/**
	 * Set eofoEsdeDepartmentName
	 */
	public void setEofoEsdeDepartmentName(String eofoEsdeDepartmentName) {
		this.eofoEsdeDepartmentName = eofoEsdeDepartmentName;
		addValidField("eofoEsdeDepartmentName");
	}

	/**
	 * Get eofoEsusUserNameCn
	 */
	@Column(name = "EOFO_ESUS_USER_NAME_CN")
	public String getEofoEsusUserNameCn() {
		return eofoEsusUserNameCn;
	}

	/**
	 * Set eofoEsusUserNameCn
	 */
	public void setEofoEsusUserNameCn(String eofoEsusUserNameCn) {
		this.eofoEsusUserNameCn = eofoEsusUserNameCn;
		addValidField("eofoEsusUserNameCn");
	}

	/**
	 * Get eofoRetoType
	 */
	@Column(name = "EOFO_RETO_TYPE")
	public Long getEofoRetoType() {
		return eofoRetoType;
	}

	/**
	 * Set eofoRetoType
	 */
	public void setEofoRetoType(Long eofoRetoType) {
		this.eofoRetoType = eofoRetoType;
		addValidField("eofoRetoType");
	}

	/**
	 * Get eofoToId
	 */
	@Column(name = "EOFO_TO_ID")
	public String getEofoToId() {
		return eofoToId;
	}

	/**
	 * Set eofoToId
	 */
	public void setEofoToId(String eofoToId) {
		this.eofoToId = eofoToId;
		addValidField("eofoToId");
	}

	/**
	 * Get eofoNo
	 */
	@Column(name = "EOFO_NO")
	public String getEofoNo() {
		return eofoNo;
	}

	/**
	 * Set eofoNo
	 */
	public void setEofoNo(String eofoNo) {
		this.eofoNo = eofoNo;
		addValidField("eofoNo");
	}

	/**
	 * Get eofoType
	 */
	@Column(name = "EOFO_TYPE")
	public String getEofoType() {
		return eofoType;
	}

	/**
	 * Set eofoType
	 */
	public void setEofoType(String eofoType) {
		this.eofoType = eofoType;
		addValidField("eofoType");
	}

	/**
	 * Get eofoStatus
	 */
	@Column(name = "EOFO_STATUS")
	public String getEofoStatus() {
		return eofoStatus;
	}

	/**
	 * Set eofoStatus
	 */
	public void setEofoStatus(String eofoStatus) {
		this.eofoStatus = eofoStatus;
		addValidField("eofoStatus");
	}

	/**
	 * Get eofoOrder
	 */
	@Column(name = "EOFO_ORDER")
	public Long getEofoOrder() {
		return eofoOrder;
	}

	/**
	 * Set eofoOrder
	 */
	public void setEofoOrder(Long eofoOrder) {
		this.eofoOrder = eofoOrder;
		addValidField("eofoOrder");
	}

	/**
	 * Get eofoSoNo
	 */
	@Column(name = "EOFO_SO_NO")
	public String getEofoSoNo() {
		return eofoSoNo;
	}

	/**
	 * Set eofoSoNo
	 */
	public void setEofoSoNo(String eofoSoNo) {
		this.eofoSoNo = eofoSoNo;
		addValidField("eofoSoNo");
	}

	/**
	 * Get eofoDoNo
	 */
	@Column(name = "EOFO_DO_NO")
	public String getEofoDoNo() {
		return eofoDoNo;
	}

	/**
	 * Set eofoDoNo
	 */
	public void setEofoDoNo(String eofoDoNo) {
		this.eofoDoNo = eofoDoNo;
		addValidField("eofoDoNo");
	}

	/**
	 * Get eofoReceivingParty
	 */
	@Column(name = "EOFO_RECEIVING_PARTY")
	public String getEofoReceivingParty() {
		return eofoReceivingParty;
	}

	/**
	 * Set eofoReceivingParty
	 */
	public void setEofoReceivingParty(String eofoReceivingParty) {
		this.eofoReceivingParty = eofoReceivingParty;
		addValidField("eofoReceivingParty");
	}

	/**
	 * Get eofoBulkBillNo
	 */
	@Column(name = "EOFO_BULK_BILL_NO")
	public String getEofoBulkBillNo() {
		return eofoBulkBillNo;
	}

	/**
	 * Set eofoBulkBillNo
	 */
	public void setEofoBulkBillNo(String eofoBulkBillNo) {
		this.eofoBulkBillNo = eofoBulkBillNo;
		addValidField("eofoBulkBillNo");
	}

	/**
	 * Get eofoHblNo
	 */
	@Column(name = "EOFO_HBL_NO")
	public String getEofoHblNo() {
		return eofoHblNo;
	}

	/**
	 * Set eofoHblNo
	 */
	public void setEofoHblNo(String eofoHblNo) {
		this.eofoHblNo = eofoHblNo;
		addValidField("eofoHblNo");
	}

	/**
	 * Get eofoIsDutyfree
	 */
	@Column(name = "EOFO_IS_DUTYFREE")
	public Long getEofoIsDutyfree() {
		return eofoIsDutyfree;
	}

	/**
	 * Set eofoIsDutyfree
	 */
	public void setEofoIsDutyfree(Long eofoIsDutyfree) {
		this.eofoIsDutyfree = eofoIsDutyfree;
		addValidField("eofoIsDutyfree");
	}

	/**
	 * Get eofoIsCheck
	 */
	@Column(name = "EOFO_IS_CHECK")
	public Long getEofoIsCheck() {
		return eofoIsCheck;
	}

	/**
	 * Set eofoIsCheck
	 */
	public void setEofoIsCheck(Long eofoIsCheck) {
		this.eofoIsCheck = eofoIsCheck;
		addValidField("eofoIsCheck");
	}

	/**
	 * Get eofoDeclarationNo
	 */
	@Column(name = "EOFO_DECLARATION_NO")
	public String getEofoDeclarationNo() {
		return eofoDeclarationNo;
	}

	/**
	 * Set eofoDeclarationNo
	 */
	public void setEofoDeclarationNo(String eofoDeclarationNo) {
		this.eofoDeclarationNo = eofoDeclarationNo;
		addValidField("eofoDeclarationNo");
	}

	/**
	 * Get eofoCheckEbrgId
	 */
	@Column(name = "EOFO_CHECK_EBRG_ID")
	public Long getEofoCheckEbrgId() {
		return eofoCheckEbrgId;
	}

	/**
	 * Set eofoCheckEbrgId
	 */
	public void setEofoCheckEbrgId(Long eofoCheckEbrgId) {
		this.eofoCheckEbrgId = eofoCheckEbrgId;
		addValidField("eofoCheckEbrgId");
	}

	/**
	 * Get eofoCheckEbrgName
	 */
	@Column(name = "EOFO_CHECK_EBRG_NAME")
	public String getEofoCheckEbrgName() {
		return eofoCheckEbrgName;
	}

	/**
	 * Set eofoCheckEbrgName
	 */
	public void setEofoCheckEbrgName(String eofoCheckEbrgName) {
		this.eofoCheckEbrgName = eofoCheckEbrgName;
		addValidField("eofoCheckEbrgName");
	}

	/**
	 * Get eofoIsSendCar
	 */
	@Column(name = "EOFO_IS_SEND_CAR")
	public Long getEofoIsSendCar() {
		return eofoIsSendCar;
	}

	/**
	 * Set eofoIsSendCar
	 */
	public void setEofoIsSendCar(Long eofoIsSendCar) {
		this.eofoIsSendCar = eofoIsSendCar;
		addValidField("eofoIsSendCar");
	}

	/**
	 * Get eofoCheckType
	 */
	@Column(name = "EOFO_CHECK_TYPE")
	public String getEofoCheckType() {
		return eofoCheckType;
	}

	/**
	 * Set eofoCheckType
	 */
	public void setEofoCheckType(String eofoCheckType) {
		this.eofoCheckType = eofoCheckType;
		addValidField("eofoCheckType");
	}

	/**
	 * Get eofoCheckSendCarDate
	 */
	@Column(name = "EOFO_CHECK_SEND_CAR_DATE")
	public Date getEofoCheckSendCarDate() {
		return eofoCheckSendCarDate;
	}

	/**
	 * Set eofoCheckSendCarDate
	 */
	public void setEofoCheckSendCarDate(Date eofoCheckSendCarDate) {
		this.eofoCheckSendCarDate = eofoCheckSendCarDate;
		addValidField("eofoCheckSendCarDate");
	}

	/**
	 * Get eofoCheckOpenCtnDate
	 */
	@Column(name = "EOFO_CHECK_OPEN_CTN_DATE")
	public Date getEofoCheckOpenCtnDate() {
		return eofoCheckOpenCtnDate;
	}

	/**
	 * Set eofoCheckOpenCtnDate
	 */
	public void setEofoCheckOpenCtnDate(Date eofoCheckOpenCtnDate) {
		this.eofoCheckOpenCtnDate = eofoCheckOpenCtnDate;
		addValidField("eofoCheckOpenCtnDate");
	}

	/**
	 * Get eofoCheckAllTime
	 */
	@Column(name = "EOFO_CHECK_ALL_TIME")
	public Date getEofoCheckAllTime() {
		return eofoCheckAllTime;
	}

	/**
	 * Set eofoCheckAllTime
	 */
	public void setEofoCheckAllTime(Date eofoCheckAllTime) {
		this.eofoCheckAllTime = eofoCheckAllTime;
		addValidField("eofoCheckAllTime");
	}

	/**
	 * Get eofoCustomsCheckUser
	 */
	@Column(name = "EOFO_CUSTOMS_CHECK_USER")
	public String getEofoCustomsCheckUser() {
		return eofoCustomsCheckUser;
	}

	/**
	 * Set eofoCustomsCheckUser
	 */
	public void setEofoCustomsCheckUser(String eofoCustomsCheckUser) {
		this.eofoCustomsCheckUser = eofoCustomsCheckUser;
		addValidField("eofoCustomsCheckUser");
	}

	/**
	 * Get eofoInspectionNo
	 */
	@Column(name = "EOFO_INSPECTION_NO")
	public String getEofoInspectionNo() {
		return eofoInspectionNo;
	}

	/**
	 * Set eofoInspectionNo
	 */
	public void setEofoInspectionNo(String eofoInspectionNo) {
		this.eofoInspectionNo = eofoInspectionNo;
		addValidField("eofoInspectionNo");
	}

	/**
	 * Get eofoInspectionEbrgId
	 */
	@Column(name = "EOFO_INSPECTION_EBRG_ID")
	public Long getEofoInspectionEbrgId() {
		return eofoInspectionEbrgId;
	}

	/**
	 * Set eofoInspectionEbrgId
	 */
	public void setEofoInspectionEbrgId(Long eofoInspectionEbrgId) {
		this.eofoInspectionEbrgId = eofoInspectionEbrgId;
		addValidField("eofoInspectionEbrgId");
	}

	/**
	 * Get eofoInspectionEbrgName
	 */
	@Column(name = "EOFO_INSPECTION_EBRG_NAME")
	public String getEofoInspectionEbrgName() {
		return eofoInspectionEbrgName;
	}

	/**
	 * Set eofoInspectionEbrgName
	 */
	public void setEofoInspectionEbrgName(String eofoInspectionEbrgName) {
		this.eofoInspectionEbrgName = eofoInspectionEbrgName;
		addValidField("eofoInspectionEbrgName");
	}

	/**
	 * Get eofoPlanInspectionDate
	 */
	@Column(name = "EOFO_PLAN_INSPECTION_DATE")
	public Date getEofoPlanInspectionDate() {
		return eofoPlanInspectionDate;
	}

	/**
	 * Set eofoPlanInspectionDate
	 */
	public void setEofoPlanInspectionDate(Date eofoPlanInspectionDate) {
		this.eofoPlanInspectionDate = eofoPlanInspectionDate;
		addValidField("eofoPlanInspectionDate");
	}

	/**
	 * Get eofoVehicle
	 */
	@Column(name = "EOFO_VEHICLE")
	public String getEofoVehicle() {
		return eofoVehicle;
	}

	/**
	 * Set eofoVehicle
	 */
	public void setEofoVehicle(String eofoVehicle) {
		this.eofoVehicle = eofoVehicle;
		addValidField("eofoVehicle");
	}

	/**
	 * Get eofoInspectionType
	 */
	@Column(name = "EOFO_INSPECTION_TYPE")
	public String getEofoInspectionType() {
		return eofoInspectionType;
	}

	/**
	 * Set eofoInspectionType
	 */
	public void setEofoInspectionType(String eofoInspectionType) {
		this.eofoInspectionType = eofoInspectionType;
		addValidField("eofoInspectionType");
	}

	/**
	 * Get eofoInspectionSendCar
	 */
	@Column(name = "EOFO_INSPECTION_SEND_CAR")
	public Date getEofoInspectionSendCar() {
		return eofoInspectionSendCar;
	}

	/**
	 * Set eofoInspectionSendCar
	 */
	public void setEofoInspectionSendCar(Date eofoInspectionSendCar) {
		this.eofoInspectionSendCar = eofoInspectionSendCar;
		addValidField("eofoInspectionSendCar");
	}

	/**
	 * Get eofoInspectionOpenCtnDate
	 */
	@Column(name = "EOFO_INSPECTION_OPEN_CTN_DATE")
	public Date getEofoInspectionOpenCtnDate() {
		return eofoInspectionOpenCtnDate;
	}

	/**
	 * Set eofoInspectionOpenCtnDate
	 */
	public void setEofoInspectionOpenCtnDate(Date eofoInspectionOpenCtnDate) {
		this.eofoInspectionOpenCtnDate = eofoInspectionOpenCtnDate;
		addValidField("eofoInspectionOpenCtnDate");
	}

	/**
	 * Get eofoInspectionAllDate
	 */
	@Column(name = "EOFO_INSPECTION_ALL_DATE")
	public Date getEofoInspectionAllDate() {
		return eofoInspectionAllDate;
	}

	/**
	 * Set eofoInspectionAllDate
	 */
	public void setEofoInspectionAllDate(Date eofoInspectionAllDate) {
		this.eofoInspectionAllDate = eofoInspectionAllDate;
		addValidField("eofoInspectionAllDate");
	}

	/**
	 * Get eofoInspectionUser
	 */
	@Column(name = "EOFO_INSPECTION_USER")
	public String getEofoInspectionUser() {
		return eofoInspectionUser;
	}

	/**
	 * Set eofoInspectionUser
	 */
	public void setEofoInspectionUser(String eofoInspectionUser) {
		this.eofoInspectionUser = eofoInspectionUser;
		addValidField("eofoInspectionUser");
	}

	/**
	 * Get eofoRemark
	 */
	@Column(name = "EOFO_REMARK")
	public String getEofoRemark() {
		return eofoRemark;
	}

	/**
	 * Set eofoRemark
	 */
	public void setEofoRemark(String eofoRemark) {
		this.eofoRemark = eofoRemark;
		addValidField("eofoRemark");
	}

	/**
	 * Get eofoSubstr1
	 */
	@Column(name = "EOFO_SUBSTR1")
	public String getEofoSubstr1() {
		return eofoSubstr1;
	}

	/**
	 * Set eofoSubstr1
	 */
	public void setEofoSubstr1(String eofoSubstr1) {
		this.eofoSubstr1 = eofoSubstr1;
		addValidField("eofoSubstr1");
	}

	/**
	 * Get eofoSubstr2
	 */
	@Column(name = "EOFO_SUBSTR2")
	public String getEofoSubstr2() {
		return eofoSubstr2;
	}

	/**
	 * Set eofoSubstr2
	 */
	public void setEofoSubstr2(String eofoSubstr2) {
		this.eofoSubstr2 = eofoSubstr2;
		addValidField("eofoSubstr2");
	}

	/**
	 * Get eofoSubstr3
	 */
	@Column(name = "EOFO_SUBSTR3")
	public String getEofoSubstr3() {
		return eofoSubstr3;
	}

	/**
	 * Set eofoSubstr3
	 */
	public void setEofoSubstr3(String eofoSubstr3) {
		this.eofoSubstr3 = eofoSubstr3;
		addValidField("eofoSubstr3");
	}

	/**
	 * Get eofoSubstr4
	 */
	@Column(name = "EOFO_SUBSTR4")
	public String getEofoSubstr4() {
		return eofoSubstr4;
	}

	/**
	 * Set eofoSubstr4
	 */
	public void setEofoSubstr4(String eofoSubstr4) {
		this.eofoSubstr4 = eofoSubstr4;
		addValidField("eofoSubstr4");
	}

	/**
	 * Get eofoSubstr5
	 */
	@Column(name = "EOFO_SUBSTR5")
	public String getEofoSubstr5() {
		return eofoSubstr5;
	}

	/**
	 * Set eofoSubstr5
	 */
	public void setEofoSubstr5(String eofoSubstr5) {
		this.eofoSubstr5 = eofoSubstr5;
		addValidField("eofoSubstr5");
	}

	/**
	 * Get eofoSubstr6
	 */
	@Column(name = "EOFO_SUBSTR6")
	public String getEofoSubstr6() {
		return eofoSubstr6;
	}

	/**
	 * Set eofoSubstr6
	 */
	public void setEofoSubstr6(String eofoSubstr6) {
		this.eofoSubstr6 = eofoSubstr6;
		addValidField("eofoSubstr6");
	}

	/**
	 * Get eofoSubstr7
	 */
	@Column(name = "EOFO_SUBSTR7")
	public String getEofoSubstr7() {
		return eofoSubstr7;
	}

	/**
	 * Set eofoSubstr7
	 */
	public void setEofoSubstr7(String eofoSubstr7) {
		this.eofoSubstr7 = eofoSubstr7;
		addValidField("eofoSubstr7");
	}

	/**
	 * Get eofoSubstr8
	 */
	@Column(name = "EOFO_SUBSTR8")
	public String getEofoSubstr8() {
		return eofoSubstr8;
	}

	/**
	 * Set eofoSubstr8
	 */
	public void setEofoSubstr8(String eofoSubstr8) {
		this.eofoSubstr8 = eofoSubstr8;
		addValidField("eofoSubstr8");
	}

	/**
	 * Get eofoSubdate1
	 */
	@Column(name = "EOFO_SUBDATE1")
	public Date getEofoSubdate1() {
		return eofoSubdate1;
	}

	/**
	 * Set eofoSubdate1
	 */
	public void setEofoSubdate1(Date eofoSubdate1) {
		this.eofoSubdate1 = eofoSubdate1;
		addValidField("eofoSubdate1");
	}

	/**
	 * Get eofoSubdate2
	 */
	@Column(name = "EOFO_SUBDATE2")
	public Date getEofoSubdate2() {
		return eofoSubdate2;
	}

	/**
	 * Set eofoSubdate2
	 */
	public void setEofoSubdate2(Date eofoSubdate2) {
		this.eofoSubdate2 = eofoSubdate2;
		addValidField("eofoSubdate2");
	}

	/**
	 * Get eofoSubdate3
	 */
	@Column(name = "EOFO_SUBDATE3")
	public Date getEofoSubdate3() {
		return eofoSubdate3;
	}

	/**
	 * Set eofoSubdate3
	 */
	public void setEofoSubdate3(Date eofoSubdate3) {
		this.eofoSubdate3 = eofoSubdate3;
		addValidField("eofoSubdate3");
	}

	/**
	 * Get eofoSubdate4
	 */
	@Column(name = "EOFO_SUBDATE4")
	public Date getEofoSubdate4() {
		return eofoSubdate4;
	}

	/**
	 * Set eofoSubdate4
	 */
	public void setEofoSubdate4(Date eofoSubdate4) {
		this.eofoSubdate4 = eofoSubdate4;
		addValidField("eofoSubdate4");
	}

	/**
	 * Get eofoSubnum1
	 */
	@Column(name = "EOFO_SUBNUM1")
	public Long getEofoSubnum1() {
		return eofoSubnum1;
	}

	/**
	 * Set eofoSubnum1
	 */
	public void setEofoSubnum1(Long eofoSubnum1) {
		this.eofoSubnum1 = eofoSubnum1;
		addValidField("eofoSubnum1");
	}

	/**
	 * Get eofoSubnum2
	 */
	@Column(name = "EOFO_SUBNUM2")
	public Long getEofoSubnum2() {
		return eofoSubnum2;
	}

	/**
	 * Set eofoSubnum2
	 */
	public void setEofoSubnum2(Long eofoSubnum2) {
		this.eofoSubnum2 = eofoSubnum2;
		addValidField("eofoSubnum2");
	}

	/**
	 * Get eofoSubnum3
	 */
	@Column(name = "EOFO_SUBNUM3")
	public Long getEofoSubnum3() {
		return eofoSubnum3;
	}

	/**
	 * Set eofoSubnum3
	 */
	public void setEofoSubnum3(Long eofoSubnum3) {
		this.eofoSubnum3 = eofoSubnum3;
		addValidField("eofoSubnum3");
	}

	/**
	 * Get eofoSubnum4
	 */
	@Column(name = "EOFO_SUBNUM4")
	public Long getEofoSubnum4() {
		return eofoSubnum4;
	}

	/**
	 * Set eofoSubnum4
	 */
	public void setEofoSubnum4(Long eofoSubnum4) {
		this.eofoSubnum4 = eofoSubnum4;
		addValidField("eofoSubnum4");
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

}
