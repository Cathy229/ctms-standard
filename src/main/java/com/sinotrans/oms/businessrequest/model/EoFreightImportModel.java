package com.sinotrans.oms.businessrequest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sinotrans.framework.orm.model.BaseModel;
import com.sinotrans.framework.orm.model.OperationLog;

/**
 * Model class for EoFreightImport
 */
@Entity
@Table(name = "EO_FREIGHT_IMPORT")
public class EoFreightImportModel extends BaseModel implements OperationLog {

	//eofiId
	private Long eofiId;
	//eofiEscoId
	private Long eofiEscoId;
	//eofiEoorId
	private Long eofiEoorId;
	//eofiEbpjId
	private Long eofiEbpjId;
	//eofiLoEbppId
	private Long eofiLoEbppId;
	//eofiEbtkId
	private Long eofiEbtkId;
	//eofiTaskStatus
	private String eofiTaskStatus;
	//eofiIsAutomatic
	private String eofiIsAutomatic;
	//eofiTaskFeedback
	private String eofiTaskFeedback;
	//eofiSysCode
	private String eofiSysCode;
	//eofiEbbuId
	private Long eofiEbbuId;
	//eofiEbbuNameCn
	private String eofiEbbuNameCn;
	//eofiEbbuCode
	private String eofiEbbuCode;
	//eofiEbbuDist1
	private String eofiEbbuDist1;
	//eofiEbbuDist2
	private String eofiEbbuDist2;
	//eofiEbbuDist3
	private String eofiEbbuDist3;
	//eofiEbbuDist4
	private String eofiEbbuDist4;
	//eofiEbbuDist5
	private String eofiEbbuDist5;
	//eofiEscoCode
	private String eofiEscoCode;
	//eofiEsdeDepartmentCode
	private String eofiEsdeDepartmentCode;
	//eofiEscoNameCn
	private String eofiEscoNameCn;
	//eofiEsdeDepartmentName
	private String eofiEsdeDepartmentName;
	//eofiEsusUserNameCn
	private String eofiEsusUserNameCn;
	//eofiRetoType
	private Long eofiRetoType;
	//eofiToId
	private String eofiToId;
	//eofiNo
	private String eofiNo;
	//eofiType
	private String eofiType;
	//eofiStatus
	private String eofiStatus;
	//eofiOrder
	private Long eofiOrder;
	//eofiSoNo
	private String eofiSoNo;
	//eofiDoNo
	private String eofiDoNo;
	//eofiReceivingParty
	private String eofiReceivingParty;
	//eofiBulkBillNo
	private String eofiBulkBillNo;
	//eofiHblNo
	private String eofiHblNo;
	//eofiIsDutyfree
	private Long eofiIsDutyfree;
	//eofiIsSingle
	private Long eofiIsSingle;
	//eofiSingleEbcuId
	private Long eofiSingleEbcuId;
	//eofiSingleEbcuName
	private String eofiSingleEbcuName;
	//eofiEbccContactName
	private String eofiEbccContactName;
	//eofiEbccMobile
	private String eofiEbccMobile;
	//eofiEta
	private Date eofiEta;
	//eofiAta
	private Date eofiAta;
	//eofiSingleUser
	private String eofiSingleUser;
	//eofiSingleDate
	private Date eofiSingleDate;
	//eofiIsContainerDetentio
	private Long eofiIsContainerDetentio;
	//eofiEbrgId
	private Long eofiEbrgId;
	//eofiEbrgNo
	private String eofiEbrgNo;
	//eofiEbrgNameCn
	private String eofiEbrgNameCn;
	//eofiPaymentMethod
	private String eofiPaymentMethod;
	//eofiContainerChequeNo
	private String eofiContainerChequeNo;
	//eofiContainerAmt
	private Long eofiContainerAmt;
	//eofiContainerBank
	private String eofiContainerBank;
	//eofiContainerAccount
	private String eofiContainerAccount;
	//eofiReceiptAllDate
	private Date eofiReceiptAllDate;
	//eofiWayPayment
	private String eofiWayPayment;
	//eofiSignDate
	private Date eofiSignDate;
	//eofiIsPayment
	private Long eofiIsPayment;
	//eofiPaymentDate
	private Date eofiPaymentDate;
	//eofiPaymentBank
	private String eofiPaymentBank;
	//eofiPaymentAccount
	private String eofiPaymentAccount;
	//eofiIsCheck
	private Long eofiIsCheck;
	//eofiDeclarationNo
	private String eofiDeclarationNo;
	//eofiCheckEbrgId
	private Long eofiCheckEbrgId;
	//eofiCheckEbrgName
	private String eofiCheckEbrgName;
	//eofiIsSendCar
	private Long eofiIsSendCar;
	//eofiCheckType
	private String eofiCheckType;
	//eofiCheckSendCarDate
	private Date eofiCheckSendCarDate;
	//eofiCheckOpenCtnDate
	private Date eofiCheckOpenCtnDate;
	//eofiCheckAllTime
	private Date eofiCheckAllTime;
	//eofiCustomsCheckUser
	private String eofiCustomsCheckUser;
	//eofiInspectionNo
	private String eofiInspectionNo;
	//eofiInspectionEbrgId
	private Long eofiInspectionEbrgId;
	//eofiInspectionEbrgName
	private String eofiInspectionEbrgName;
	//eofiPlanInspectionDate
	private Date eofiPlanInspectionDate;
	//eofiVehicle
	private String eofiVehicle;
	//eofiInspectionType
	private String eofiInspectionType;
	//eofiInspectionSendCar
	private Date eofiInspectionSendCar;
	//eofiInspectionOpenCtnDate
	private Date eofiInspectionOpenCtnDate;
	//eofiInspectionAllDate
	private Date eofiInspectionAllDate;
	//eofiInspectionUser
	private String eofiInspectionUser;
	//eofiRemark
	private String eofiRemark;
	//eofiSubstr1
	private String eofiSubstr1;
	//eofiSubstr2
	private String eofiSubstr2;
	//eofiSubstr3
	private String eofiSubstr3;
	//eofiSubstr4
	private String eofiSubstr4;
	//eofiSubstr5
	private String eofiSubstr5;
	//eofiSubstr6
	private String eofiSubstr6;
	//eofiSubstr7
	private String eofiSubstr7;
	//eofiSubstr8
	private String eofiSubstr8;
	//eofiSubdate1
	private Date eofiSubdate1;
	//eofiSubdate2
	private Date eofiSubdate2;
	//eofiSubdate3
	private Date eofiSubdate3;
	//eofiSubdate4
	private Date eofiSubdate4;
	//eofiSubnum1
	private Long eofiSubnum1;
	//eofiSubnum2
	private Long eofiSubnum2;
	//eofiSubnum3
	private Long eofiSubnum3;
	//eofiSubnum4
	private Long eofiSubnum4;
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
	//eofiHbl
	private String eofiHbl;
	//eofiHblSingleUser
	private String eofiHblSingleUser;
	//eofiHblSingleDate
	private Date eofiHblSingleDate;
	//eofiMbl
	private String eofiMbl;
	//eofiMblSingleUser
	private String eofiMblSingleUser;
	//eofiMblSingleDate
	private Date eofiMblSingleDate;
	//eofiContainerUser
	private String eofiContainerUser;
	//eofiContainerDate
	private Date eofiContainerDate;
	//eofiSingleSettleTime
	private Date eofiSingleSettleTime;
	//eofiContainerSettleTime
	private Date eofiContainerSettleTime;
	//eofiPaymentSettleTime
	private Date eofiPaymentSettleTime;
	//eofiCheckSettleTime
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date eofiCheckSettleTime;
	//eofiCheckIssuetype
	private Long eofiCheckIssuetype;
	//eofiWharf
	private String eofiWharf;
	//eofiContainerDay
	private String eofiContainerDay;
	//eofiHSingleEbcuId
	private Long eofiHSingleEbcuId;
	//eofiHSingleEbcuName
	private String eofiHSingleEbcuName;
	
	
	/**
	 * Get eofiId
	 */
	@Column(name = "EOFI_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEofiId() {
		return eofiId;
	}

	/**
	 * Set eofiId
	 */
	public void setEofiId(Long eofiId) {
		this.eofiId = eofiId;
		addValidField("eofiId");
	}

	/**
	 * Get eofiEscoId
	 */
	@Column(name = "EOFI_ESCO_ID")
	public Long getEofiEscoId() {
		return eofiEscoId;
	}

	/**
	 * Set eofiEscoId
	 */
	public void setEofiEscoId(Long eofiEscoId) {
		this.eofiEscoId = eofiEscoId;
		addValidField("eofiEscoId");
	}

	/**
	 * Get eofiEoorId
	 */
	@Column(name = "EOFI_EOOR_ID")
	public Long getEofiEoorId() {
		return eofiEoorId;
	}

	/**
	 * Set eofiEoorId
	 */
	public void setEofiEoorId(Long eofiEoorId) {
		this.eofiEoorId = eofiEoorId;
		addValidField("eofiEoorId");
	}

	/**
	 * Get eofiEbpjId
	 */
	@Column(name = "EOFI_EBPJ_ID")
	public Long getEofiEbpjId() {
		return eofiEbpjId;
	}

	/**
	 * Set eofiEbpjId
	 */
	public void setEofiEbpjId(Long eofiEbpjId) {
		this.eofiEbpjId = eofiEbpjId;
		addValidField("eofiEbpjId");
	}

	/**
	 * Get eofiLoEbppId
	 */
	@Column(name = "EOFI_LO_EBPP_ID")
	public Long getEofiLoEbppId() {
		return eofiLoEbppId;
	}

	/**
	 * Set eofiLoEbppId
	 */
	public void setEofiLoEbppId(Long eofiLoEbppId) {
		this.eofiLoEbppId = eofiLoEbppId;
		addValidField("eofiLoEbppId");
	}

	/**
	 * Get eofiEbtkId
	 */
	@Column(name = "EOFI_EBTK_ID")
	public Long getEofiEbtkId() {
		return eofiEbtkId;
	}

	/**
	 * Set eofiEbtkId
	 */
	public void setEofiEbtkId(Long eofiEbtkId) {
		this.eofiEbtkId = eofiEbtkId;
		addValidField("eofiEbtkId");
	}

	/**
	 * Get eofiTaskStatus
	 */
	@Column(name = "EOFI_TASK_STATUS")
	public String getEofiTaskStatus() {
		return eofiTaskStatus;
	}

	/**
	 * Set eofiTaskStatus
	 */
	public void setEofiTaskStatus(String eofiTaskStatus) {
		this.eofiTaskStatus = eofiTaskStatus;
		addValidField("eofiTaskStatus");
	}

	/**
	 * Get eofiIsAutomatic
	 */
	@Column(name = "EOFI_IS_AUTOMATIC")
	public String getEofiIsAutomatic() {
		return eofiIsAutomatic;
	}

	/**
	 * Set eofiIsAutomatic
	 */
	public void setEofiIsAutomatic(String eofiIsAutomatic) {
		this.eofiIsAutomatic = eofiIsAutomatic;
		addValidField("eofiIsAutomatic");
	}

	/**
	 * Get eofiTaskFeedback
	 */
	@Column(name = "EOFI_TASK_FEEDBACK")
	public String getEofiTaskFeedback() {
		return eofiTaskFeedback;
	}

	/**
	 * Set eofiTaskFeedback
	 */
	public void setEofiTaskFeedback(String eofiTaskFeedback) {
		this.eofiTaskFeedback = eofiTaskFeedback;
		addValidField("eofiTaskFeedback");
	}

	/**
	 * Get eofiSysCode
	 */
	@Column(name = "EOFI_SYS_CODE")
	public String getEofiSysCode() {
		return eofiSysCode;
	}

	/**
	 * Set eofiSysCode
	 */
	public void setEofiSysCode(String eofiSysCode) {
		this.eofiSysCode = eofiSysCode;
		addValidField("eofiSysCode");
	}

	/**
	 * Get eofiEbbuId
	 */
	@Column(name = "EOFI_EBBU_ID")
	public Long getEofiEbbuId() {
		return eofiEbbuId;
	}

	/**
	 * Set eofiEbbuId
	 */
	public void setEofiEbbuId(Long eofiEbbuId) {
		this.eofiEbbuId = eofiEbbuId;
		addValidField("eofiEbbuId");
	}

	/**
	 * Get eofiEbbuNameCn
	 */
	@Column(name = "EOFI_EBBU_NAME_CN")
	public String getEofiEbbuNameCn() {
		return eofiEbbuNameCn;
	}

	/**
	 * Set eofiEbbuNameCn
	 */
	public void setEofiEbbuNameCn(String eofiEbbuNameCn) {
		this.eofiEbbuNameCn = eofiEbbuNameCn;
		addValidField("eofiEbbuNameCn");
	}

	/**
	 * Get eofiEbbuCode
	 */
	@Column(name = "EOFI_EBBU_CODE")
	public String getEofiEbbuCode() {
		return eofiEbbuCode;
	}

	/**
	 * Set eofiEbbuCode
	 */
	public void setEofiEbbuCode(String eofiEbbuCode) {
		this.eofiEbbuCode = eofiEbbuCode;
		addValidField("eofiEbbuCode");
	}

	/**
	 * Get eofiEbbuDist1
	 */
	@Column(name = "EOFI_EBBU_DIST_1")
	public String getEofiEbbuDist1() {
		return eofiEbbuDist1;
	}

	/**
	 * Set eofiEbbuDist1
	 */
	public void setEofiEbbuDist1(String eofiEbbuDist1) {
		this.eofiEbbuDist1 = eofiEbbuDist1;
		addValidField("eofiEbbuDist1");
	}

	/**
	 * Get eofiEbbuDist2
	 */
	@Column(name = "EOFI_EBBU_DIST_2")
	public String getEofiEbbuDist2() {
		return eofiEbbuDist2;
	}

	/**
	 * Set eofiEbbuDist2
	 */
	public void setEofiEbbuDist2(String eofiEbbuDist2) {
		this.eofiEbbuDist2 = eofiEbbuDist2;
		addValidField("eofiEbbuDist2");
	}

	/**
	 * Get eofiEbbuDist3
	 */
	@Column(name = "EOFI_EBBU_DIST_3")
	public String getEofiEbbuDist3() {
		return eofiEbbuDist3;
	}

	/**
	 * Set eofiEbbuDist3
	 */
	public void setEofiEbbuDist3(String eofiEbbuDist3) {
		this.eofiEbbuDist3 = eofiEbbuDist3;
		addValidField("eofiEbbuDist3");
	}

	/**
	 * Get eofiEbbuDist4
	 */
	@Column(name = "EOFI_EBBU_DIST_4")
	public String getEofiEbbuDist4() {
		return eofiEbbuDist4;
	}

	/**
	 * Set eofiEbbuDist4
	 */
	public void setEofiEbbuDist4(String eofiEbbuDist4) {
		this.eofiEbbuDist4 = eofiEbbuDist4;
		addValidField("eofiEbbuDist4");
	}

	/**
	 * Get eofiEbbuDist5
	 */
	@Column(name = "EOFI_EBBU_DIST_5")
	public String getEofiEbbuDist5() {
		return eofiEbbuDist5;
	}

	/**
	 * Set eofiEbbuDist5
	 */
	public void setEofiEbbuDist5(String eofiEbbuDist5) {
		this.eofiEbbuDist5 = eofiEbbuDist5;
		addValidField("eofiEbbuDist5");
	}

	/**
	 * Get eofiEscoCode
	 */
	@Column(name = "EOFI_ESCO_CODE")
	public String getEofiEscoCode() {
		return eofiEscoCode;
	}

	/**
	 * Set eofiEscoCode
	 */
	public void setEofiEscoCode(String eofiEscoCode) {
		this.eofiEscoCode = eofiEscoCode;
		addValidField("eofiEscoCode");
	}

	/**
	 * Get eofiEsdeDepartmentCode
	 */
	@Column(name = "EOFI_ESDE_DEPARTMENT_CODE")
	public String getEofiEsdeDepartmentCode() {
		return eofiEsdeDepartmentCode;
	}

	/**
	 * Set eofiEsdeDepartmentCode
	 */
	public void setEofiEsdeDepartmentCode(String eofiEsdeDepartmentCode) {
		this.eofiEsdeDepartmentCode = eofiEsdeDepartmentCode;
		addValidField("eofiEsdeDepartmentCode");
	}

	/**
	 * Get eofiEscoNameCn
	 */
	@Column(name = "EOFI_ESCO_NAME_CN")
	public String getEofiEscoNameCn() {
		return eofiEscoNameCn;
	}

	/**
	 * Set eofiEscoNameCn
	 */
	public void setEofiEscoNameCn(String eofiEscoNameCn) {
		this.eofiEscoNameCn = eofiEscoNameCn;
		addValidField("eofiEscoNameCn");
	}

	/**
	 * Get eofiEsdeDepartmentName
	 */
	@Column(name = "EOFI_ESDE_DEPARTMENT_NAME")
	public String getEofiEsdeDepartmentName() {
		return eofiEsdeDepartmentName;
	}

	/**
	 * Set eofiEsdeDepartmentName
	 */
	public void setEofiEsdeDepartmentName(String eofiEsdeDepartmentName) {
		this.eofiEsdeDepartmentName = eofiEsdeDepartmentName;
		addValidField("eofiEsdeDepartmentName");
	}

	/**
	 * Get eofiEsusUserNameCn
	 */
	@Column(name = "EOFI_ESUS_USER_NAME_CN")
	public String getEofiEsusUserNameCn() {
		return eofiEsusUserNameCn;
	}

	/**
	 * Set eofiEsusUserNameCn
	 */
	public void setEofiEsusUserNameCn(String eofiEsusUserNameCn) {
		this.eofiEsusUserNameCn = eofiEsusUserNameCn;
		addValidField("eofiEsusUserNameCn");
	}

	/**
	 * Get eofiRetoType
	 */
	@Column(name = "EOFI_RETO_TYPE")
	public Long getEofiRetoType() {
		return eofiRetoType;
	}

	/**
	 * Set eofiRetoType
	 */
	public void setEofiRetoType(Long eofiRetoType) {
		this.eofiRetoType = eofiRetoType;
		addValidField("eofiRetoType");
	}

	/**
	 * Get eofiToId
	 */
	@Column(name = "EOFI_TO_ID")
	public String getEofiToId() {
		return eofiToId;
	}

	/**
	 * Set eofiToId
	 */
	public void setEofiToId(String eofiToId) {
		this.eofiToId = eofiToId;
		addValidField("eofiToId");
	}

	/**
	 * Get eofiNo
	 */
	@Column(name = "EOFI_NO")
	public String getEofiNo() {
		return eofiNo;
	}

	/**
	 * Set eofiNo
	 */
	public void setEofiNo(String eofiNo) {
		this.eofiNo = eofiNo;
		addValidField("eofiNo");
	}

	/**
	 * Get eofiType
	 */
	@Column(name = "EOFI_TYPE")
	public String getEofiType() {
		return eofiType;
	}

	/**
	 * Set eofiType
	 */
	public void setEofiType(String eofiType) {
		this.eofiType = eofiType;
		addValidField("eofiType");
	}

	/**
	 * Get eofiStatus
	 */
	@Column(name = "EOFI_STATUS")
	public String getEofiStatus() {
		return eofiStatus;
	}

	/**
	 * Set eofiStatus
	 */
	public void setEofiStatus(String eofiStatus) {
		this.eofiStatus = eofiStatus;
		addValidField("eofiStatus");
	}

	/**
	 * Get eofiOrder
	 */
	@Column(name = "EOFI_ORDER")
	public Long getEofiOrder() {
		return eofiOrder;
	}

	/**
	 * Set eofiOrder
	 */
	public void setEofiOrder(Long eofiOrder) {
		this.eofiOrder = eofiOrder;
		addValidField("eofiOrder");
	}

	/**
	 * Get eofiSoNo
	 */
	@Column(name = "EOFI_SO_NO")
	public String getEofiSoNo() {
		return eofiSoNo;
	}

	/**
	 * Set eofiSoNo
	 */
	public void setEofiSoNo(String eofiSoNo) {
		this.eofiSoNo = eofiSoNo;
		addValidField("eofiSoNo");
	}

	/**
	 * Get eofiDoNo
	 */
	@Column(name = "EOFI_DO_NO")
	public String getEofiDoNo() {
		return eofiDoNo;
	}

	/**
	 * Set eofiDoNo
	 */
	public void setEofiDoNo(String eofiDoNo) {
		this.eofiDoNo = eofiDoNo;
		addValidField("eofiDoNo");
	}

	/**
	 * Get eofiReceivingParty
	 */
	@Column(name = "EOFI_RECEIVING_PARTY")
	public String getEofiReceivingParty() {
		return eofiReceivingParty;
	}

	/**
	 * Set eofiReceivingParty
	 */
	public void setEofiReceivingParty(String eofiReceivingParty) {
		this.eofiReceivingParty = eofiReceivingParty;
		addValidField("eofiReceivingParty");
	}

	/**
	 * Get eofiBulkBillNo
	 */
	@Column(name = "EOFI_BULK_BILL_NO")
	public String getEofiBulkBillNo() {
		return eofiBulkBillNo;
	}

	/**
	 * Set eofiBulkBillNo
	 */
	public void setEofiBulkBillNo(String eofiBulkBillNo) {
		this.eofiBulkBillNo = eofiBulkBillNo;
		addValidField("eofiBulkBillNo");
	}

	/**
	 * Get eofiHblNo
	 */
	@Column(name = "EOFI_HBL_NO")
	public String getEofiHblNo() {
		return eofiHblNo;
	}

	/**
	 * Set eofiHblNo
	 */
	public void setEofiHblNo(String eofiHblNo) {
		this.eofiHblNo = eofiHblNo;
		addValidField("eofiHblNo");
	}

	/**
	 * Get eofiIsDutyfree
	 */
	@Column(name = "EOFI_IS_DUTYFREE")
	public Long getEofiIsDutyfree() {
		return eofiIsDutyfree;
	}

	/**
	 * Set eofiIsDutyfree
	 */
	public void setEofiIsDutyfree(Long eofiIsDutyfree) {
		this.eofiIsDutyfree = eofiIsDutyfree;
		addValidField("eofiIsDutyfree");
	}

	/**
	 * Get eofiIsSingle
	 */
	@Column(name = "EOFI_IS_SINGLE")
	public Long getEofiIsSingle() {
		return eofiIsSingle;
	}

	/**
	 * Set eofiIsSingle
	 */
	public void setEofiIsSingle(Long eofiIsSingle) {
		this.eofiIsSingle = eofiIsSingle;
		addValidField("eofiIsSingle");
	}

	/**
	 * Get eofiSingleEbcuId
	 */
	@Column(name = "EOFI_SINGLE_EBCU_ID")
	public Long getEofiSingleEbcuId() {
		return eofiSingleEbcuId;
	}

	/**
	 * Set eofiSingleEbcuId
	 */
	public void setEofiSingleEbcuId(Long eofiSingleEbcuId) {
		this.eofiSingleEbcuId = eofiSingleEbcuId;
		addValidField("eofiSingleEbcuId");
	}

	/**
	 * Get eofiSingleEbcuName
	 */
	@Column(name = "EOFI_SINGLE_EBCU_NAME")
	public String getEofiSingleEbcuName() {
		return eofiSingleEbcuName;
	}

	/**
	 * Set eofiSingleEbcuName
	 */
	public void setEofiSingleEbcuName(String eofiSingleEbcuName) {
		this.eofiSingleEbcuName = eofiSingleEbcuName;
		addValidField("eofiSingleEbcuName");
	}

	/**
	 * Get eofiEbccContactName
	 */
	@Column(name = "EOFI_EBCC_CONTACT_NAME")
	public String getEofiEbccContactName() {
		return eofiEbccContactName;
	}

	/**
	 * Set eofiEbccContactName
	 */
	public void setEofiEbccContactName(String eofiEbccContactName) {
		this.eofiEbccContactName = eofiEbccContactName;
		addValidField("eofiEbccContactName");
	}

	/**
	 * Get eofiEbccMobile
	 */
	@Column(name = "EOFI_EBCC_MOBILE")
	public String getEofiEbccMobile() {
		return eofiEbccMobile;
	}

	/**
	 * Set eofiEbccMobile
	 */
	public void setEofiEbccMobile(String eofiEbccMobile) {
		this.eofiEbccMobile = eofiEbccMobile;
		addValidField("eofiEbccMobile");
	}

	/**
	 * Get eofiEta
	 */
	@Column(name = "EOFI_ETA")
	public Date getEofiEta() {
		return eofiEta;
	}

	/**
	 * Set eofiEta
	 */
	public void setEofiEta(Date eofiEta) {
		this.eofiEta = eofiEta;
		addValidField("eofiEta");
	}

	/**
	 * Get eofiAta
	 */
	@Column(name = "EOFI_ATA")
	public Date getEofiAta() {
		return eofiAta;
	}

	/**
	 * Set eofiAta
	 */
	public void setEofiAta(Date eofiAta) {
		this.eofiAta = eofiAta;
		addValidField("eofiAta");
	}

	/**
	 * Get eofiSingleUser
	 */
	@Column(name = "EOFI_SINGLE_USER")
	public String getEofiSingleUser() {
		return eofiSingleUser;
	}

	/**
	 * Set eofiSingleUser
	 */
	public void setEofiSingleUser(String eofiSingleUser) {
		this.eofiSingleUser = eofiSingleUser;
		addValidField("eofiSingleUser");
	}

	/**
	 * Get eofiSingleDate
	 */
	@Column(name = "EOFI_SINGLE_DATE")
	public Date getEofiSingleDate() {
		return eofiSingleDate;
	}

	/**
	 * Set eofiSingleDate
	 */
	public void setEofiSingleDate(Date eofiSingleDate) {
		this.eofiSingleDate = eofiSingleDate;
		addValidField("eofiSingleDate");
	}

	/**
	 * Get eofiIsContainerDetentio
	 */
	@Column(name = "EOFI_IS_CONTAINER_DETENTIO")
	public Long getEofiIsContainerDetentio() {
		return eofiIsContainerDetentio;
	}

	/**
	 * Set eofiIsContainerDetentio
	 */
	public void setEofiIsContainerDetentio(Long eofiIsContainerDetentio) {
		this.eofiIsContainerDetentio = eofiIsContainerDetentio;
		addValidField("eofiIsContainerDetentio");
	}

	/**
	 * Get eofiEbrgId
	 */
	@Column(name = "EOFI_EBRG_ID")
	public Long getEofiEbrgId() {
		return eofiEbrgId;
	}

	/**
	 * Set eofiEbrgId
	 */
	public void setEofiEbrgId(Long eofiEbrgId) {
		this.eofiEbrgId = eofiEbrgId;
		addValidField("eofiEbrgId");
	}

	/**
	 * Get eofiEbrgNo
	 */
	@Column(name = "EOFI_EBRG_NO")
	public String getEofiEbrgNo() {
		return eofiEbrgNo;
	}

	/**
	 * Set eofiEbrgNo
	 */
	public void setEofiEbrgNo(String eofiEbrgNo) {
		this.eofiEbrgNo = eofiEbrgNo;
		addValidField("eofiEbrgNo");
	}

	/**
	 * Get eofiEbrgNameCn
	 */
	@Column(name = "EOFI_EBRG_NAME_CN")
	public String getEofiEbrgNameCn() {
		return eofiEbrgNameCn;
	}

	/**
	 * Set eofiEbrgNameCn
	 */
	public void setEofiEbrgNameCn(String eofiEbrgNameCn) {
		this.eofiEbrgNameCn = eofiEbrgNameCn;
		addValidField("eofiEbrgNameCn");
	}

	/**
	 * Get eofiPaymentMethod
	 */
	@Column(name = "EOFI_PAYMENT_METHOD")
	public String getEofiPaymentMethod() {
		return eofiPaymentMethod;
	}

	/**
	 * Set eofiPaymentMethod
	 */
	public void setEofiPaymentMethod(String eofiPaymentMethod) {
		this.eofiPaymentMethod = eofiPaymentMethod;
		addValidField("eofiPaymentMethod");
	}

	/**
	 * Get eofiContainerChequeNo
	 */
	@Column(name = "EOFI_CONTAINER_CHEQUE_NO")
	public String getEofiContainerChequeNo() {
		return eofiContainerChequeNo;
	}

	/**
	 * Set eofiContainerChequeNo
	 */
	public void setEofiContainerChequeNo(String eofiContainerChequeNo) {
		this.eofiContainerChequeNo = eofiContainerChequeNo;
		addValidField("eofiContainerChequeNo");
	}

	/**
	 * Get eofiContainerAmt
	 */
	@Column(name = "EOFI_CONTAINER_AMT")
	public Long getEofiContainerAmt() {
		return eofiContainerAmt;
	}

	/**
	 * Set eofiContainerAmt
	 */
	public void setEofiContainerAmt(Long eofiContainerAmt) {
		this.eofiContainerAmt = eofiContainerAmt;
		addValidField("eofiContainerAmt");
	}

	/**
	 * Get eofiContainerBank
	 */
	@Column(name = "EOFI_CONTAINER_BANK")
	public String getEofiContainerBank() {
		return eofiContainerBank;
	}

	/**
	 * Set eofiContainerBank
	 */
	public void setEofiContainerBank(String eofiContainerBank) {
		this.eofiContainerBank = eofiContainerBank;
		addValidField("eofiContainerBank");
	}

	/**
	 * Get eofiContainerAccount
	 */
	@Column(name = "EOFI_CONTAINER_ACCOUNT")
	public String getEofiContainerAccount() {
		return eofiContainerAccount;
	}

	/**
	 * Set eofiContainerAccount
	 */
	public void setEofiContainerAccount(String eofiContainerAccount) {
		this.eofiContainerAccount = eofiContainerAccount;
		addValidField("eofiContainerAccount");
	}

	/**
	 * Get eofiReceiptAllDate
	 */
	@Column(name = "EOFI_RECEIPT_ALL_DATE")
	public Date getEofiReceiptAllDate() {
		return eofiReceiptAllDate;
	}

	/**
	 * Set eofiReceiptAllDate
	 */
	public void setEofiReceiptAllDate(Date eofiReceiptAllDate) {
		this.eofiReceiptAllDate = eofiReceiptAllDate;
		addValidField("eofiReceiptAllDate");
	}

	/**
	 * Get eofiWayPayment
	 */
	@Column(name = "EOFI_WAY_PAYMENT")
	public String getEofiWayPayment() {
		return eofiWayPayment;
	}

	/**
	 * Set eofiWayPayment
	 */
	public void setEofiWayPayment(String eofiWayPayment) {
		this.eofiWayPayment = eofiWayPayment;
		addValidField("eofiWayPayment");
	}

	/**
	 * Get eofiSignDate
	 */
	@Column(name = "EOFI_SIGN_DATE")
	public Date getEofiSignDate() {
		return eofiSignDate;
	}

	/**
	 * Set eofiSignDate
	 */
	public void setEofiSignDate(Date eofiSignDate) {
		this.eofiSignDate = eofiSignDate;
		addValidField("eofiSignDate");
	}

	/**
	 * Get eofiIsPayment
	 */
	@Column(name = "EOFI_IS_PAYMENT")
	public Long getEofiIsPayment() {
		return eofiIsPayment;
	}

	/**
	 * Set eofiIsPayment
	 */
	public void setEofiIsPayment(Long eofiIsPayment) {
		this.eofiIsPayment = eofiIsPayment;
		addValidField("eofiIsPayment");
	}

	/**
	 * Get eofiPaymentDate
	 */
	@Column(name = "EOFI_PAYMENT_DATE")
	public Date getEofiPaymentDate() {
		return eofiPaymentDate;
	}

	/**
	 * Set eofiPaymentDate
	 */
	public void setEofiPaymentDate(Date eofiPaymentDate) {
		this.eofiPaymentDate = eofiPaymentDate;
		addValidField("eofiPaymentDate");
	}

	/**
	 * Get eofiPaymentBank
	 */
	@Column(name = "EOFI_PAYMENT_BANK")
	public String getEofiPaymentBank() {
		return eofiPaymentBank;
	}

	/**
	 * Set eofiPaymentBank
	 */
	public void setEofiPaymentBank(String eofiPaymentBank) {
		this.eofiPaymentBank = eofiPaymentBank;
		addValidField("eofiPaymentBank");
	}

	/**
	 * Get eofiPaymentAccount
	 */
	@Column(name = "EOFI_PAYMENT_ACCOUNT")
	public String getEofiPaymentAccount() {
		return eofiPaymentAccount;
	}

	/**
	 * Set eofiPaymentAccount
	 */
	public void setEofiPaymentAccount(String eofiPaymentAccount) {
		this.eofiPaymentAccount = eofiPaymentAccount;
		addValidField("eofiPaymentAccount");
	}

	/**
	 * Get eofiIsCheck
	 */
	@Column(name = "EOFI_IS_CHECK")
	public Long getEofiIsCheck() {
		return eofiIsCheck;
	}

	/**
	 * Set eofiIsCheck
	 */
	public void setEofiIsCheck(Long eofiIsCheck) {
		this.eofiIsCheck = eofiIsCheck;
		addValidField("eofiIsCheck");
	}

	/**
	 * Get eofiDeclarationNo
	 */
	@Column(name = "EOFI_DECLARATION_NO")
	public String getEofiDeclarationNo() {
		return eofiDeclarationNo;
	}

	/**
	 * Set eofiDeclarationNo
	 */
	public void setEofiDeclarationNo(String eofiDeclarationNo) {
		this.eofiDeclarationNo = eofiDeclarationNo;
		addValidField("eofiDeclarationNo");
	}

	/**
	 * Get eofiCheckEbrgId
	 */
	@Column(name = "EOFI_CHECK_EBRG_ID")
	public Long getEofiCheckEbrgId() {
		return eofiCheckEbrgId;
	}

	/**
	 * Set eofiCheckEbrgId
	 */
	public void setEofiCheckEbrgId(Long eofiCheckEbrgId) {
		this.eofiCheckEbrgId = eofiCheckEbrgId;
		addValidField("eofiCheckEbrgId");
	}

	/**
	 * Get eofiCheckEbrgName
	 */
	@Column(name = "EOFI_CHECK_EBRG_NAME")
	public String getEofiCheckEbrgName() {
		return eofiCheckEbrgName;
	}

	/**
	 * Set eofiCheckEbrgName
	 */
	public void setEofiCheckEbrgName(String eofiCheckEbrgName) {
		this.eofiCheckEbrgName = eofiCheckEbrgName;
		addValidField("eofiCheckEbrgName");
	}

	/**
	 * Get eofiIsSendCar
	 */
	@Column(name = "EOFI_IS_SEND_CAR")
	public Long getEofiIsSendCar() {
		return eofiIsSendCar;
	}

	/**
	 * Set eofiIsSendCar
	 */
	public void setEofiIsSendCar(Long eofiIsSendCar) {
		this.eofiIsSendCar = eofiIsSendCar;
		addValidField("eofiIsSendCar");
	}

	/**
	 * Get eofiCheckType
	 */
	@Column(name = "EOFI_CHECK_TYPE")
	public String getEofiCheckType() {
		return eofiCheckType;
	}

	/**
	 * Set eofiCheckType
	 */
	public void setEofiCheckType(String eofiCheckType) {
		this.eofiCheckType = eofiCheckType;
		addValidField("eofiCheckType");
	}

	/**
	 * Get eofiCheckSendCarDate
	 */
	@Column(name = "EOFI_CHECK_SEND_CAR_DATE")
	public Date getEofiCheckSendCarDate() {
		return eofiCheckSendCarDate;
	}

	/**
	 * Set eofiCheckSendCarDate
	 */
	public void setEofiCheckSendCarDate(Date eofiCheckSendCarDate) {
		this.eofiCheckSendCarDate = eofiCheckSendCarDate;
		addValidField("eofiCheckSendCarDate");
	}

	/**
	 * Get eofiCheckOpenCtnDate
	 */
	@Column(name = "EOFI_CHECK_OPEN_CTN_DATE")
	public Date getEofiCheckOpenCtnDate() {
		return eofiCheckOpenCtnDate;
	}

	/**
	 * Set eofiCheckOpenCtnDate
	 */
	public void setEofiCheckOpenCtnDate(Date eofiCheckOpenCtnDate) {
		this.eofiCheckOpenCtnDate = eofiCheckOpenCtnDate;
		addValidField("eofiCheckOpenCtnDate");
	}

	/**
	 * Get eofiCheckAllTime
	 */
	@Column(name = "EOFI_CHECK_ALL_TIME")
	public Date getEofiCheckAllTime() {
		return eofiCheckAllTime;
	}

	/**
	 * Set eofiCheckAllTime
	 */
	public void setEofiCheckAllTime(Date eofiCheckAllTime) {
		this.eofiCheckAllTime = eofiCheckAllTime;
		addValidField("eofiCheckAllTime");
	}

	/**
	 * Get eofiCustomsCheckUser
	 */
	@Column(name = "EOFI_CUSTOMS_CHECK_USER")
	public String getEofiCustomsCheckUser() {
		return eofiCustomsCheckUser;
	}

	/**
	 * Set eofiCustomsCheckUser
	 */
	public void setEofiCustomsCheckUser(String eofiCustomsCheckUser) {
		this.eofiCustomsCheckUser = eofiCustomsCheckUser;
		addValidField("eofiCustomsCheckUser");
	}

	/**
	 * Get eofiInspectionNo
	 */
	@Column(name = "EOFI_INSPECTION_NO")
	public String getEofiInspectionNo() {
		return eofiInspectionNo;
	}

	/**
	 * Set eofiInspectionNo
	 */
	public void setEofiInspectionNo(String eofiInspectionNo) {
		this.eofiInspectionNo = eofiInspectionNo;
		addValidField("eofiInspectionNo");
	}

	/**
	 * Get eofiInspectionEbrgId
	 */
	@Column(name = "EOFI_INSPECTION_EBRG_ID")
	public Long getEofiInspectionEbrgId() {
		return eofiInspectionEbrgId;
	}

	/**
	 * Set eofiInspectionEbrgId
	 */
	public void setEofiInspectionEbrgId(Long eofiInspectionEbrgId) {
		this.eofiInspectionEbrgId = eofiInspectionEbrgId;
		addValidField("eofiInspectionEbrgId");
	}

	/**
	 * Get eofiInspectionEbrgName
	 */
	@Column(name = "EOFI_INSPECTION_EBRG_NAME")
	public String getEofiInspectionEbrgName() {
		return eofiInspectionEbrgName;
	}

	/**
	 * Set eofiInspectionEbrgName
	 */
	public void setEofiInspectionEbrgName(String eofiInspectionEbrgName) {
		this.eofiInspectionEbrgName = eofiInspectionEbrgName;
		addValidField("eofiInspectionEbrgName");
	}

	/**
	 * Get eofiPlanInspectionDate
	 */
	@Column(name = "EOFI_PLAN_INSPECTION_DATE")
	public Date getEofiPlanInspectionDate() {
		return eofiPlanInspectionDate;
	}

	/**
	 * Set eofiPlanInspectionDate
	 */
	public void setEofiPlanInspectionDate(Date eofiPlanInspectionDate) {
		this.eofiPlanInspectionDate = eofiPlanInspectionDate;
		addValidField("eofiPlanInspectionDate");
	}

	/**
	 * Get eofiVehicle
	 */
	@Column(name = "EOFI_VEHICLE")
	public String getEofiVehicle() {
		return eofiVehicle;
	}

	/**
	 * Set eofiVehicle
	 */
	public void setEofiVehicle(String eofiVehicle) {
		this.eofiVehicle = eofiVehicle;
		addValidField("eofiVehicle");
	}

	/**
	 * Get eofiInspectionType
	 */
	@Column(name = "EOFI_INSPECTION_TYPE")
	public String getEofiInspectionType() {
		return eofiInspectionType;
	}

	/**
	 * Set eofiInspectionType
	 */
	public void setEofiInspectionType(String eofiInspectionType) {
		this.eofiInspectionType = eofiInspectionType;
		addValidField("eofiInspectionType");
	}

	/**
	 * Get eofiInspectionSendCar
	 */
	@Column(name = "EOFI_INSPECTION_SEND_CAR")
	public Date getEofiInspectionSendCar() {
		return eofiInspectionSendCar;
	}

	/**
	 * Set eofiInspectionSendCar
	 */
	public void setEofiInspectionSendCar(Date eofiInspectionSendCar) {
		this.eofiInspectionSendCar = eofiInspectionSendCar;
		addValidField("eofiInspectionSendCar");
	}

	/**
	 * Get eofiInspectionOpenCtnDate
	 */
	@Column(name = "EOFI_INSPECTION_OPEN_CTN_DATE")
	public Date getEofiInspectionOpenCtnDate() {
		return eofiInspectionOpenCtnDate;
	}

	/**
	 * Set eofiInspectionOpenCtnDate
	 */
	public void setEofiInspectionOpenCtnDate(Date eofiInspectionOpenCtnDate) {
		this.eofiInspectionOpenCtnDate = eofiInspectionOpenCtnDate;
		addValidField("eofiInspectionOpenCtnDate");
	}

	/**
	 * Get eofiInspectionAllDate
	 */
	@Column(name = "EOFI_INSPECTION_ALL_DATE")
	public Date getEofiInspectionAllDate() {
		return eofiInspectionAllDate;
	}

	/**
	 * Set eofiInspectionAllDate
	 */
	public void setEofiInspectionAllDate(Date eofiInspectionAllDate) {
		this.eofiInspectionAllDate = eofiInspectionAllDate;
		addValidField("eofiInspectionAllDate");
	}

	/**
	 * Get eofiInspectionUser
	 */
	@Column(name = "EOFI_INSPECTION_USER")
	public String getEofiInspectionUser() {
		return eofiInspectionUser;
	}

	/**
	 * Set eofiInspectionUser
	 */
	public void setEofiInspectionUser(String eofiInspectionUser) {
		this.eofiInspectionUser = eofiInspectionUser;
		addValidField("eofiInspectionUser");
	}

	/**
	 * Get eofiRemark
	 */
	@Column(name = "EOFI_REMARK")
	public String getEofiRemark() {
		return eofiRemark;
	}

	/**
	 * Set eofiRemark
	 */
	public void setEofiRemark(String eofiRemark) {
		this.eofiRemark = eofiRemark;
		addValidField("eofiRemark");
	}

	/**
	 * Get eofiSubstr1
	 */
	@Column(name = "EOFI_SUBSTR1")
	public String getEofiSubstr1() {
		return eofiSubstr1;
	}

	/**
	 * Set eofiSubstr1
	 */
	public void setEofiSubstr1(String eofiSubstr1) {
		this.eofiSubstr1 = eofiSubstr1;
		addValidField("eofiSubstr1");
	}

	/**
	 * Get eofiSubstr2
	 */
	@Column(name = "EOFI_SUBSTR2")
	public String getEofiSubstr2() {
		return eofiSubstr2;
	}

	/**
	 * Set eofiSubstr2
	 */
	public void setEofiSubstr2(String eofiSubstr2) {
		this.eofiSubstr2 = eofiSubstr2;
		addValidField("eofiSubstr2");
	}

	/**
	 * Get eofiSubstr3
	 */
	@Column(name = "EOFI_SUBSTR3")
	public String getEofiSubstr3() {
		return eofiSubstr3;
	}

	/**
	 * Set eofiSubstr3
	 */
	public void setEofiSubstr3(String eofiSubstr3) {
		this.eofiSubstr3 = eofiSubstr3;
		addValidField("eofiSubstr3");
	}

	/**
	 * Get eofiSubstr4
	 */
	@Column(name = "EOFI_SUBSTR4")
	public String getEofiSubstr4() {
		return eofiSubstr4;
	}

	/**
	 * Set eofiSubstr4
	 */
	public void setEofiSubstr4(String eofiSubstr4) {
		this.eofiSubstr4 = eofiSubstr4;
		addValidField("eofiSubstr4");
	}

	/**
	 * Get eofiSubstr5
	 */
	@Column(name = "EOFI_SUBSTR5")
	public String getEofiSubstr5() {
		return eofiSubstr5;
	}

	/**
	 * Set eofiSubstr5
	 */
	public void setEofiSubstr5(String eofiSubstr5) {
		this.eofiSubstr5 = eofiSubstr5;
		addValidField("eofiSubstr5");
	}

	/**
	 * Get eofiSubstr6
	 */
	@Column(name = "EOFI_SUBSTR6")
	public String getEofiSubstr6() {
		return eofiSubstr6;
	}

	/**
	 * Set eofiSubstr6
	 */
	public void setEofiSubstr6(String eofiSubstr6) {
		this.eofiSubstr6 = eofiSubstr6;
		addValidField("eofiSubstr6");
	}

	/**
	 * Get eofiSubstr7
	 */
	@Column(name = "EOFI_SUBSTR7")
	public String getEofiSubstr7() {
		return eofiSubstr7;
	}

	/**
	 * Set eofiSubstr7
	 */
	public void setEofiSubstr7(String eofiSubstr7) {
		this.eofiSubstr7 = eofiSubstr7;
		addValidField("eofiSubstr7");
	}

	/**
	 * Get eofiSubstr8
	 */
	@Column(name = "EOFI_SUBSTR8")
	public String getEofiSubstr8() {
		return eofiSubstr8;
	}

	/**
	 * Set eofiSubstr8
	 */
	public void setEofiSubstr8(String eofiSubstr8) {
		this.eofiSubstr8 = eofiSubstr8;
		addValidField("eofiSubstr8");
	}

	/**
	 * Get eofiSubdate1
	 */
	@Column(name = "EOFI_SUBDATE1")
	public Date getEofiSubdate1() {
		return eofiSubdate1;
	}

	/**
	 * Set eofiSubdate1
	 */
	public void setEofiSubdate1(Date eofiSubdate1) {
		this.eofiSubdate1 = eofiSubdate1;
		addValidField("eofiSubdate1");
	}

	/**
	 * Get eofiSubdate2
	 */
	@Column(name = "EOFI_SUBDATE2")
	public Date getEofiSubdate2() {
		return eofiSubdate2;
	}

	/**
	 * Set eofiSubdate2
	 */
	public void setEofiSubdate2(Date eofiSubdate2) {
		this.eofiSubdate2 = eofiSubdate2;
		addValidField("eofiSubdate2");
	}

	/**
	 * Get eofiSubdate3
	 */
	@Column(name = "EOFI_SUBDATE3")
	public Date getEofiSubdate3() {
		return eofiSubdate3;
	}

	/**
	 * Set eofiSubdate3
	 */
	public void setEofiSubdate3(Date eofiSubdate3) {
		this.eofiSubdate3 = eofiSubdate3;
		addValidField("eofiSubdate3");
	}

	/**
	 * Get eofiSubdate4
	 */
	@Column(name = "EOFI_SUBDATE4")
	public Date getEofiSubdate4() {
		return eofiSubdate4;
	}

	/**
	 * Set eofiSubdate4
	 */
	public void setEofiSubdate4(Date eofiSubdate4) {
		this.eofiSubdate4 = eofiSubdate4;
		addValidField("eofiSubdate4");
	}

	/**
	 * Get eofiSubnum1
	 */
	@Column(name = "EOFI_SUBNUM1")
	public Long getEofiSubnum1() {
		return eofiSubnum1;
	}

	/**
	 * Set eofiSubnum1
	 */
	public void setEofiSubnum1(Long eofiSubnum1) {
		this.eofiSubnum1 = eofiSubnum1;
		addValidField("eofiSubnum1");
	}

	/**
	 * Get eofiSubnum2
	 */
	@Column(name = "EOFI_SUBNUM2")
	public Long getEofiSubnum2() {
		return eofiSubnum2;
	}

	/**
	 * Set eofiSubnum2
	 */
	public void setEofiSubnum2(Long eofiSubnum2) {
		this.eofiSubnum2 = eofiSubnum2;
		addValidField("eofiSubnum2");
	}

	/**
	 * Get eofiSubnum3
	 */
	@Column(name = "EOFI_SUBNUM3")
	public Long getEofiSubnum3() {
		return eofiSubnum3;
	}

	/**
	 * Set eofiSubnum3
	 */
	public void setEofiSubnum3(Long eofiSubnum3) {
		this.eofiSubnum3 = eofiSubnum3;
		addValidField("eofiSubnum3");
	}

	/**
	 * Get eofiSubnum4
	 */
	@Column(name = "EOFI_SUBNUM4")
	public Long getEofiSubnum4() {
		return eofiSubnum4;
	}

	/**
	 * Set eofiSubnum4
	 */
	public void setEofiSubnum4(Long eofiSubnum4) {
		this.eofiSubnum4 = eofiSubnum4;
		addValidField("eofiSubnum4");
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
	 * Get eofiHbl
	 */
	@Column(name = "EOFI_HBL")
	public String getEofiHbl() {
		return eofiHbl;
	}

	/**
	 * Set eofiHbl
	 */
	public void setEofiHbl(String eofiHbl) {
		this.eofiHbl = eofiHbl;
		addValidField("eofiHbl");
	}

	/**
	 * Get eofiHblSingleUser
	 */
	@Column(name = "EOFI_HBL_SINGLE_USER")
	public String getEofiHblSingleUser() {
		return eofiHblSingleUser;
	}

	/**
	 * Set eofiHblSingleUser
	 */
	public void setEofiHblSingleUser(String eofiHblSingleUser) {
		this.eofiHblSingleUser = eofiHblSingleUser;
		addValidField("eofiHblSingleUser");
	}

	/**
	 * Get eofiHblSingleDate
	 */
	@Column(name = "EOFI_HBL_SINGLE_DATE")
	public Date getEofiHblSingleDate() {
		return eofiHblSingleDate;
	}

	/**
	 * Set eofiHblSingleDate
	 */
	public void setEofiHblSingleDate(Date eofiHblSingleDate) {
		this.eofiHblSingleDate = eofiHblSingleDate;
		addValidField("eofiHblSingleDate");
	}

	/**
	 * Get eofiMbl
	 */
	@Column(name = "EOFI_MBL")
	public String getEofiMbl() {
		return eofiMbl;
	}

	/**
	 * Set eofiMbl
	 */
	public void setEofiMbl(String eofiMbl) {
		this.eofiMbl = eofiMbl;
		addValidField("eofiMbl");
	}

	/**
	 * Get eofiMblSingleUser
	 */
	@Column(name = "EOFI_MBL_SINGLE_USER")
	public String getEofiMblSingleUser() {
		return eofiMblSingleUser;
	}

	/**
	 * Set eofiMblSingleUser
	 */
	public void setEofiMblSingleUser(String eofiMblSingleUser) {
		this.eofiMblSingleUser = eofiMblSingleUser;
		addValidField("eofiMblSingleUser");
	}

	/**
	 * Get eofiMblSingleDate
	 */
	@Column(name = "EOFI_MBL_SINGLE_DATE")
	public Date getEofiMblSingleDate() {
		return eofiMblSingleDate;
	}

	/**
	 * Set eofiMblSingleDate
	 */
	public void setEofiMblSingleDate(Date eofiMblSingleDate) {
		this.eofiMblSingleDate = eofiMblSingleDate;
		addValidField("eofiMblSingleDate");
	}

	/**
	 * Get eofiContainerUser
	 */
	@Column(name = "EOFI_CONTAINER_USER")
	public String getEofiContainerUser() {
		return eofiContainerUser;
	}

	/**
	 * Set eofiContainerUser
	 */
	public void setEofiContainerUser(String eofiContainerUser) {
		this.eofiContainerUser = eofiContainerUser;
		addValidField("eofiContainerUser");
	}

	/**
	 * Get eofiContainerDate
	 */
	@Column(name = "EOFI_CONTAINER_DATE")
	public Date getEofiContainerDate() {
		return eofiContainerDate;
	}

	/**
	 * Set eofiContainerDate
	 */
	public void setEofiContainerDate(Date eofiContainerDate) {
		this.eofiContainerDate = eofiContainerDate;
		addValidField("eofiContainerDate");
	}

	/**
	 * Get eofiSingleSettleTime
	 */
	@Column(name = "EOFI_SINGLE_SETTLE_TIME")
	public Date getEofiSingleSettleTime() {
		return eofiSingleSettleTime;
	}

	/**
	 * Set eofiSingleSettleTime
	 */
	public void setEofiSingleSettleTime(Date eofiSingleSettleTime) {
		this.eofiSingleSettleTime = eofiSingleSettleTime;
		addValidField("eofiSingleSettleTime");
	}

	/**
	 * Get eofiContainerSettleTime
	 */
	@Column(name = "EOFI_CONTAINER_SETTLE_TIME")
	public Date getEofiContainerSettleTime() {
		return eofiContainerSettleTime;
	}

	/**
	 * Set eofiContainerSettleTime
	 */
	public void setEofiContainerSettleTime(Date eofiContainerSettleTime) {
		this.eofiContainerSettleTime = eofiContainerSettleTime;
		addValidField("eofiContainerSettleTime");
	}

	/**
	 * Get eofiPaymentSettleTime
	 */
	@Column(name = "EOFI_PAYMENT_SETTLE_TIME")
	public Date getEofiPaymentSettleTime() {
		return eofiPaymentSettleTime;
	}

	/**
	 * Set eofiPaymentSettleTime
	 */
	public void setEofiPaymentSettleTime(Date eofiPaymentSettleTime) {
		this.eofiPaymentSettleTime = eofiPaymentSettleTime;
		addValidField("eofiPaymentSettleTime");
	}

	/**
	 * Get eofiCheckSettleTime
	 */
	@Column(name = "EOFI_CHECK_SETTLE_TIME")
	public Date getEofiCheckSettleTime() {
		return eofiCheckSettleTime;
	}

	/**
	 * Set eofiCheckSettleTime
	 */
	public void setEofiCheckSettleTime(Date eofiCheckSettleTime) {
		this.eofiCheckSettleTime = eofiCheckSettleTime;
		addValidField("eofiCheckSettleTime");
	}

	/**
	 * Get eofiCheckIssuetype
	 */
	@Column(name = "EOFI_CHECK_ISSUETYPE")
	public Long getEofiCheckIssuetype() {
		return eofiCheckIssuetype;
	}

	/**
	 * Set eofiCheckIssuetype
	 */
	public void setEofiCheckIssuetype(Long eofiCheckIssuetype) {
		this.eofiCheckIssuetype = eofiCheckIssuetype;
		addValidField("eofiCheckIssuetype");
	}

	/**
	 * Get eofiWharf
	 */
	@Column(name = "EOFI_WHARF")
	public String getEofiWharf() {
		return eofiWharf;
	}

	/**
	 * Set eofiWharf
	 */
	public void setEofiWharf(String eofiWharf) {
		this.eofiWharf = eofiWharf;
		addValidField("eofiWharf");
	}

	/**
	 * Get eofiContainerDay
	 */
	@Column(name = "EOFI_CONTAINER_DAY")
	public String getEofiContainerDay() {
		return eofiContainerDay;
	}

	/**
	 * Set eofiContainerDay
	 */
	public void setEofiContainerDay(String eofiContainerDay) {
		this.eofiContainerDay = eofiContainerDay;
		addValidField("eofiContainerDay");
	}

	/**
	 * Get eofiContainerDay
	 */
	@Column(name = "EOFI_H_SINGLE_EBCU_ID")
	public Long getEofiHSingleEbcuId() {
		return eofiHSingleEbcuId;
	}

	/**
	 * Set eofiHSingleEbcuId
	 */
	public void setEofiHSingleEbcuId(Long eofiHSingleEbcuId) {
		this.eofiHSingleEbcuId = eofiHSingleEbcuId;
		addValidField("eofiHSingleEbcuId");
	}

	/**
	 * Get eofiContainerDay
	 */
	@Column(name = "EOFI_H_SINGLE_EBCU_NAME")
	public String getEofiHSingleEbcuName() {
		return eofiHSingleEbcuName;
	}

	/**
	 * Set eofiHSingleEbcuName
	 */
	public void setEofiHSingleEbcuName(String eofiHSingleEbcuName) {
		this.eofiHSingleEbcuName = eofiHSingleEbcuName;
		addValidField("eofiHSingleEbcuName");
	}

	
}
