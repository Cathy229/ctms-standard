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
 * Model class for EoRequestInspection
 */
@Entity
@Table(name = "EO_REQUEST_INSPECTION")
public class EoRequestInspectionModel extends BaseModel implements OperationLog {

	//eornId
	private Long eornId;
	//eornEoorId
	private Long eornEoorId;
	//eornEscoId
	private Long eornEscoId;
	//eornEbpjId
	private Long eornEbpjId;
	//eornLoEbppId
	private Long eornLoEbppId;
	//eornEbtkId
	private Long eornEbtkId;
	//eornIsAutomatic
	private String eornIsAutomatic;
	//eornTaskStatus
	private String eornTaskStatus;
	//eornTaskFeedback
	private String eornTaskFeedback;
	//eornSysCode
	private String eornSysCode;
	//eornEbbuId
	private Long eornEbbuId;
	//eornEbbuNameCn
	private String eornEbbuNameCn;
	//eornEbbuCode
	private String eornEbbuCode;
	//eornEbbuDist1
	private String eornEbbuDist1;
	//eornEbbuDist2
	private String eornEbbuDist2;
	//eornEbbuDist3
	private String eornEbbuDist3;
	//eornEbbuDist4
	private String eornEbbuDist4;
	//eornEbbuDist5
	private String eornEbbuDist5;
	//eornToId
	private String eornToId;
	//eornEscoNameCn
	private String eornEscoNameCn;
	//eornEsdeDepartmentCode
	private String eornEsdeDepartmentCode;
	//eornShipperEbspNameEn
	private String eornShipperEbspNameEn;
	//eornEsdeDepartmentName
	private String eornEsdeDepartmentName;
	//eornEsusUserNameCn
	private String eornEsusUserNameCn;
	//eornRetoType
	private Long eornRetoType;
	//eornNo
	private String eornNo;
	//eornType
	private String eornType;
	//eornStatus
	private String eornStatus;
	//eornOrder
	private Long eornOrder;
	//eornIeFlag
	private String eornIeFlag;
	//eornSoNo
	private String eornSoNo;
	//eornInspectionNo
	private String eornInspectionNo;
	//eornInspectionType
	private String eornInspectionType;
	//eornInspectionBrokerId
	private Long eornInspectionBrokerId;
	//eornInspectionBrokerCode
	private String eornInspectionBrokerCode;
	//eornInspectionBroker
	private String eornInspectionBroker;
	//eornInspectionBrokerContact
	private String eornInspectionBrokerContact;
	//eornInspectionBrokerTel
	private String eornInspectionBrokerTel;
	//eornTransportType
	private String eornTransportType;
	//eornIsDutyfree
	private Long eornIsDutyfree;
	//eornConsigneeEbspNameEn
	private String eornConsigneeEbspNameEn;
	//eornTradeTerms
	private String eornTradeTerms;
	//eornContractNo
	private String eornContractNo;
	//eornCreditNo
	private String eornCreditNo;
	//eornTradeCountry
	private String eornTradeCountry;
	//eornTradeCountryName
	private String eornTradeCountryName;
	//eornLicenseNo
	private String eornLicenseNo;
	//eornApprNo
	private String eornApprNo;
	//eornUse
	private String eornUse;
	//eornLoadPortId
	private Long eornLoadPortId;
	//eornLoadPortCode
	private String eornLoadPortCode;
	//eornLoadPortName
	private String eornLoadPortName;
	//eornFilingDate
	private Date eornFilingDate;
	//eornDocumentDate
	private Date eornDocumentDate;
	//eornRegistrationNo
	private String eornRegistrationNo;
	//eornContainerSpec
	private String eornContainerSpec;
	//eornSpecialItems
	private String eornSpecialItems;
	//eornMarkno
	private String eornMarkno;
	//eornSubstr1
	private String eornSubstr1;
	//eornSubstr2
	private String eornSubstr2;
	//eornSubstr3
	private String eornSubstr3;
	//eornSubstr4
	private String eornSubstr4;
	//eornSubstr5
	private String eornSubstr5;
	//eornSubstr6
	private String eornSubstr6;
	//eornSubstr7
	private String eornSubstr7;
	//eornSubstr8
	private String eornSubstr8;
	//eornSubstr9
	private String eornSubstr9;
	//eornSubstr10
	private String eornSubstr10;
	//eornSubstr11
	private String eornSubstr11;
	//eornSubstr12
	private String eornSubstr12;
	//eornSubstr13
	private String eornSubstr13;
	//eornSubstr14
	private String eornSubstr14;
	//eornSubstr15
	private String eornSubstr15;
	//eornSubstr16
	private String eornSubstr16;
	//eornSubstr17
	private String eornSubstr17;
	//eornSubstr18
	private String eornSubstr18;
	//eornSubstr19
	private String eornSubstr19;
	//eornSubstr20
	private String eornSubstr20;
	//eornSubstr21
	private String eornSubstr21;
	//eornSubstr22
	private String eornSubstr22;
	//eornSubstr23
	private String eornSubstr23;
	//eornSubstr24
	private String eornSubstr24;
	//eornSubstr25
	private String eornSubstr25;
	//eornSubdate1
	private Date eornSubdate1;
	//eornSubdate2
	private Date eornSubdate2;
	//eornSubdate3
	private Date eornSubdate3;
	//eornSubdate4
	private Date eornSubdate4;
	//eornSubdate5
	private Date eornSubdate5;
	//eornSubdate6
	private Date eornSubdate6;
	//eornSubdate7
	private Date eornSubdate7;
	//eornSubdate8
	private Date eornSubdate8;
	//eornSubdate9
	private Date eornSubdate9;
	//eornSubdate10
	private Date eornSubdate10;
	//eornSubnum1
	private Long eornSubnum1;
	//eornSubnum2
	private Long eornSubnum2;
	//eornSubnum3
	private Long eornSubnum3;
	//eornSubnum4
	private Long eornSubnum4;
	//eornSubnum5
	private Long eornSubnum5;
	//eornSubnum6
	private Long eornSubnum6;
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
	//eornRegNumber
	private String eornRegNumber;
	//eornConsigneeEbspNameCn
	private String eornConsigneeEbspNameCn;
	//eornShipperEbspNameCn
	private String eornShipperEbspNameCn;
	//eornTransportName
	private String eornTransportName;

	/**
	 * Get eornId
	 */
	@Column(name = "EORN_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEornId() {
		return eornId;
	}

	/**
	 * Set eornId
	 */
	public void setEornId(Long eornId) {
		this.eornId = eornId;
		addValidField("eornId");
	}

	/**
	 * Get eornEoorId
	 */
	@Column(name = "EORN_EOOR_ID")
	public Long getEornEoorId() {
		return eornEoorId;
	}

	/**
	 * Set eornEoorId
	 */
	public void setEornEoorId(Long eornEoorId) {
		this.eornEoorId = eornEoorId;
		addValidField("eornEoorId");
	}

	/**
	 * Get eornEscoId
	 */
	@Column(name = "EORN_ESCO_ID")
	public Long getEornEscoId() {
		return eornEscoId;
	}

	/**
	 * Set eornEscoId
	 */
	public void setEornEscoId(Long eornEscoId) {
		this.eornEscoId = eornEscoId;
		addValidField("eornEscoId");
	}

	/**
	 * Get eornEbpjId
	 */
	@Column(name = "EORN_EBPJ_ID")
	public Long getEornEbpjId() {
		return eornEbpjId;
	}

	/**
	 * Set eornEbpjId
	 */
	public void setEornEbpjId(Long eornEbpjId) {
		this.eornEbpjId = eornEbpjId;
		addValidField("eornEbpjId");
	}

	/**
	 * Get eornLoEbppId
	 */
	@Column(name = "EORN_LO_EBPP_ID")
	public Long getEornLoEbppId() {
		return eornLoEbppId;
	}

	/**
	 * Set eornLoEbppId
	 */
	public void setEornLoEbppId(Long eornLoEbppId) {
		this.eornLoEbppId = eornLoEbppId;
		addValidField("eornLoEbppId");
	}

	/**
	 * Get eornEbtkId
	 */
	@Column(name = "EORN_EBTK_ID")
	public Long getEornEbtkId() {
		return eornEbtkId;
	}

	/**
	 * Set eornEbtkId
	 */
	public void setEornEbtkId(Long eornEbtkId) {
		this.eornEbtkId = eornEbtkId;
		addValidField("eornEbtkId");
	}

	/**
	 * Get eornIsAutomatic
	 */
	@Column(name = "EORN_IS_AUTOMATIC")
	public String getEornIsAutomatic() {
		return eornIsAutomatic;
	}

	/**
	 * Set eornIsAutomatic
	 */
	public void setEornIsAutomatic(String eornIsAutomatic) {
		this.eornIsAutomatic = eornIsAutomatic;
		addValidField("eornIsAutomatic");
	}

	/**
	 * Get eornTaskStatus
	 */
	@Column(name = "EORN_TASK_STATUS")
	public String getEornTaskStatus() {
		return eornTaskStatus;
	}

	/**
	 * Set eornTaskStatus
	 */
	public void setEornTaskStatus(String eornTaskStatus) {
		this.eornTaskStatus = eornTaskStatus;
		addValidField("eornTaskStatus");
	}

	/**
	 * Get eornTaskFeedback
	 */
	@Column(name = "EORN_TASK_FEEDBACK")
	public String getEornTaskFeedback() {
		return eornTaskFeedback;
	}

	/**
	 * Set eornTaskFeedback
	 */
	public void setEornTaskFeedback(String eornTaskFeedback) {
		this.eornTaskFeedback = eornTaskFeedback;
		addValidField("eornTaskFeedback");
	}

	/**
	 * Get eornSysCode
	 */
	@Column(name = "EORN_SYS_CODE")
	public String getEornSysCode() {
		return eornSysCode;
	}

	/**
	 * Set eornSysCode
	 */
	public void setEornSysCode(String eornSysCode) {
		this.eornSysCode = eornSysCode;
		addValidField("eornSysCode");
	}

	/**
	 * Get eornEbbuId
	 */
	@Column(name = "EORN_EBBU_ID")
	public Long getEornEbbuId() {
		return eornEbbuId;
	}

	/**
	 * Set eornEbbuId
	 */
	public void setEornEbbuId(Long eornEbbuId) {
		this.eornEbbuId = eornEbbuId;
		addValidField("eornEbbuId");
	}

	/**
	 * Get eornEbbuNameCn
	 */
	@Column(name = "EORN_EBBU_NAME_CN")
	public String getEornEbbuNameCn() {
		return eornEbbuNameCn;
	}

	/**
	 * Set eornEbbuNameCn
	 */
	public void setEornEbbuNameCn(String eornEbbuNameCn) {
		this.eornEbbuNameCn = eornEbbuNameCn;
		addValidField("eornEbbuNameCn");
	}

	/**
	 * Get eornEbbuCode
	 */
	@Column(name = "EORN_EBBU_CODE")
	public String getEornEbbuCode() {
		return eornEbbuCode;
	}

	/**
	 * Set eornEbbuCode
	 */
	public void setEornEbbuCode(String eornEbbuCode) {
		this.eornEbbuCode = eornEbbuCode;
		addValidField("eornEbbuCode");
	}

	/**
	 * Get eornEbbuDist1
	 */
	@Column(name = "EORN_EBBU_DIST_1")
	public String getEornEbbuDist1() {
		return eornEbbuDist1;
	}

	/**
	 * Set eornEbbuDist1
	 */
	public void setEornEbbuDist1(String eornEbbuDist1) {
		this.eornEbbuDist1 = eornEbbuDist1;
		addValidField("eornEbbuDist1");
	}

	/**
	 * Get eornEbbuDist2
	 */
	@Column(name = "EORN_EBBU_DIST_2")
	public String getEornEbbuDist2() {
		return eornEbbuDist2;
	}

	/**
	 * Set eornEbbuDist2
	 */
	public void setEornEbbuDist2(String eornEbbuDist2) {
		this.eornEbbuDist2 = eornEbbuDist2;
		addValidField("eornEbbuDist2");
	}

	/**
	 * Get eornEbbuDist3
	 */
	@Column(name = "EORN_EBBU_DIST_3")
	public String getEornEbbuDist3() {
		return eornEbbuDist3;
	}

	/**
	 * Set eornEbbuDist3
	 */
	public void setEornEbbuDist3(String eornEbbuDist3) {
		this.eornEbbuDist3 = eornEbbuDist3;
		addValidField("eornEbbuDist3");
	}

	/**
	 * Get eornEbbuDist4
	 */
	@Column(name = "EORN_EBBU_DIST_4")
	public String getEornEbbuDist4() {
		return eornEbbuDist4;
	}

	/**
	 * Set eornEbbuDist4
	 */
	public void setEornEbbuDist4(String eornEbbuDist4) {
		this.eornEbbuDist4 = eornEbbuDist4;
		addValidField("eornEbbuDist4");
	}

	/**
	 * Get eornEbbuDist5
	 */
	@Column(name = "EORN_EBBU_DIST_5")
	public String getEornEbbuDist5() {
		return eornEbbuDist5;
	}

	/**
	 * Set eornEbbuDist5
	 */
	public void setEornEbbuDist5(String eornEbbuDist5) {
		this.eornEbbuDist5 = eornEbbuDist5;
		addValidField("eornEbbuDist5");
	}

	/**
	 * Get eornToId
	 */
	@Column(name = "EORN_TO_ID")
	public String getEornToId() {
		return eornToId;
	}

	/**
	 * Set eornToId
	 */
	public void setEornToId(String eornToId) {
		this.eornToId = eornToId;
		addValidField("eornToId");
	}

	/**
	 * Get eornEscoNameCn
	 */
	@Column(name = "EORN_ESCO_NAME_CN")
	public String getEornEscoNameCn() {
		return eornEscoNameCn;
	}

	/**
	 * Set eornEscoNameCn
	 */
	public void setEornEscoNameCn(String eornEscoNameCn) {
		this.eornEscoNameCn = eornEscoNameCn;
		addValidField("eornEscoNameCn");
	}

	/**
	 * Get eornEsdeDepartmentCode
	 */
	@Column(name = "EORN_ESDE_DEPARTMENT_CODE")
	public String getEornEsdeDepartmentCode() {
		return eornEsdeDepartmentCode;
	}

	/**
	 * Set eornEsdeDepartmentCode
	 */
	public void setEornEsdeDepartmentCode(String eornEsdeDepartmentCode) {
		this.eornEsdeDepartmentCode = eornEsdeDepartmentCode;
		addValidField("eornEsdeDepartmentCode");
	}

	/**
	 * Get eornShipperEbspNameEn
	 */
	@Column(name = "EORN_SHIPPER_EBSP_NAME_EN")
	public String getEornShipperEbspNameEn() {
		return eornShipperEbspNameEn;
	}

	/**
	 * Set eornShipperEbspNameEn
	 */
	public void setEornShipperEbspNameEn(String eornShipperEbspNameEn) {
		this.eornShipperEbspNameEn = eornShipperEbspNameEn;
		addValidField("eornShipperEbspNameEn");
	}

	/**
	 * Get eornEsdeDepartmentName
	 */
	@Column(name = "EORN_ESDE_DEPARTMENT_NAME")
	public String getEornEsdeDepartmentName() {
		return eornEsdeDepartmentName;
	}

	/**
	 * Set eornEsdeDepartmentName
	 */
	public void setEornEsdeDepartmentName(String eornEsdeDepartmentName) {
		this.eornEsdeDepartmentName = eornEsdeDepartmentName;
		addValidField("eornEsdeDepartmentName");
	}

	/**
	 * Get eornEsusUserNameCn
	 */
	@Column(name = "EORN_ESUS_USER_NAME_CN")
	public String getEornEsusUserNameCn() {
		return eornEsusUserNameCn;
	}

	/**
	 * Set eornEsusUserNameCn
	 */
	public void setEornEsusUserNameCn(String eornEsusUserNameCn) {
		this.eornEsusUserNameCn = eornEsusUserNameCn;
		addValidField("eornEsusUserNameCn");
	}

	/**
	 * Get eornRetoType
	 */
	@Column(name = "EORN_RETO_TYPE")
	public Long getEornRetoType() {
		return eornRetoType;
	}

	/**
	 * Set eornRetoType
	 */
	public void setEornRetoType(Long eornRetoType) {
		this.eornRetoType = eornRetoType;
		addValidField("eornRetoType");
	}

	/**
	 * Get eornNo
	 */
	@Column(name = "EORN_NO")
	public String getEornNo() {
		return eornNo;
	}

	/**
	 * Set eornNo
	 */
	public void setEornNo(String eornNo) {
		this.eornNo = eornNo;
		addValidField("eornNo");
	}

	/**
	 * Get eornType
	 */
	@Column(name = "EORN_TYPE")
	public String getEornType() {
		return eornType;
	}

	/**
	 * Set eornType
	 */
	public void setEornType(String eornType) {
		this.eornType = eornType;
		addValidField("eornType");
	}

	/**
	 * Get eornStatus
	 */
	@Column(name = "EORN_STATUS")
	public String getEornStatus() {
		return eornStatus;
	}

	/**
	 * Set eornStatus
	 */
	public void setEornStatus(String eornStatus) {
		this.eornStatus = eornStatus;
		addValidField("eornStatus");
	}

	/**
	 * Get eornOrder
	 */
	@Column(name = "EORN_ORDER")
	public Long getEornOrder() {
		return eornOrder;
	}

	/**
	 * Set eornOrder
	 */
	public void setEornOrder(Long eornOrder) {
		this.eornOrder = eornOrder;
		addValidField("eornOrder");
	}

	/**
	 * Get eornIeFlag
	 */
	@Column(name = "EORN_IE_FLAG")
	public String getEornIeFlag() {
		return eornIeFlag;
	}

	/**
	 * Set eornIeFlag
	 */
	public void setEornIeFlag(String eornIeFlag) {
		this.eornIeFlag = eornIeFlag;
		addValidField("eornIeFlag");
	}

	/**
	 * Get eornSoNo
	 */
	@Column(name = "EORN_SO_NO")
	public String getEornSoNo() {
		return eornSoNo;
	}

	/**
	 * Set eornSoNo
	 */
	public void setEornSoNo(String eornSoNo) {
		this.eornSoNo = eornSoNo;
		addValidField("eornSoNo");
	}

	/**
	 * Get eornInspectionNo
	 */
	@Column(name = "EORN_INSPECTION_NO")
	public String getEornInspectionNo() {
		return eornInspectionNo;
	}

	/**
	 * Set eornInspectionNo
	 */
	public void setEornInspectionNo(String eornInspectionNo) {
		this.eornInspectionNo = eornInspectionNo;
		addValidField("eornInspectionNo");
	}

	/**
	 * Get eornInspectionType
	 */
	@Column(name = "EORN_INSPECTION_TYPE")
	public String getEornInspectionType() {
		return eornInspectionType;
	}

	/**
	 * Set eornInspectionType
	 */
	public void setEornInspectionType(String eornInspectionType) {
		this.eornInspectionType = eornInspectionType;
		addValidField("eornInspectionType");
	}

	/**
	 * Get eornInspectionBrokerId
	 */
	@Column(name = "EORN_INSPECTION_BROKER_ID")
	public Long getEornInspectionBrokerId() {
		return eornInspectionBrokerId;
	}

	/**
	 * Set eornInspectionBrokerId
	 */
	public void setEornInspectionBrokerId(Long eornInspectionBrokerId) {
		this.eornInspectionBrokerId = eornInspectionBrokerId;
		addValidField("eornInspectionBrokerId");
	}

	/**
	 * Get eornInspectionBrokerCode
	 */
	@Column(name = "EORN_INSPECTION_BROKER_CODE")
	public String getEornInspectionBrokerCode() {
		return eornInspectionBrokerCode;
	}

	/**
	 * Set eornInspectionBrokerCode
	 */
	public void setEornInspectionBrokerCode(String eornInspectionBrokerCode) {
		this.eornInspectionBrokerCode = eornInspectionBrokerCode;
		addValidField("eornInspectionBrokerCode");
	}

	/**
	 * Get eornInspectionBroker
	 */
	@Column(name = "EORN_INSPECTION_BROKER")
	public String getEornInspectionBroker() {
		return eornInspectionBroker;
	}

	/**
	 * Set eornInspectionBroker
	 */
	public void setEornInspectionBroker(String eornInspectionBroker) {
		this.eornInspectionBroker = eornInspectionBroker;
		addValidField("eornInspectionBroker");
	}

	/**
	 * Get eornInspectionBrokerContact
	 */
	@Column(name = "EORN_INSPECTION_BROKER_CONTACT")
	public String getEornInspectionBrokerContact() {
		return eornInspectionBrokerContact;
	}

	/**
	 * Set eornInspectionBrokerContact
	 */
	public void setEornInspectionBrokerContact(String eornInspectionBrokerContact) {
		this.eornInspectionBrokerContact = eornInspectionBrokerContact;
		addValidField("eornInspectionBrokerContact");
	}

	/**
	 * Get eornInspectionBrokerTel
	 */
	@Column(name = "EORN_INSPECTION_BROKER_TEL")
	public String getEornInspectionBrokerTel() {
		return eornInspectionBrokerTel;
	}

	/**
	 * Set eornInspectionBrokerTel
	 */
	public void setEornInspectionBrokerTel(String eornInspectionBrokerTel) {
		this.eornInspectionBrokerTel = eornInspectionBrokerTel;
		addValidField("eornInspectionBrokerTel");
	}

	/**
	 * Get eornTransportType
	 */
	@Column(name = "EORN_TRANSPORT_TYPE")
	public String getEornTransportType() {
		return eornTransportType;
	}

	/**
	 * Set eornTransportType
	 */
	public void setEornTransportType(String eornTransportType) {
		this.eornTransportType = eornTransportType;
		addValidField("eornTransportType");
	}

	/**
	 * Get eornIsDutyfree
	 */
	@Column(name = "EORN_IS_DUTYFREE")
	public Long getEornIsDutyfree() {
		return eornIsDutyfree;
	}

	/**
	 * Set eornIsDutyfree
	 */
	public void setEornIsDutyfree(Long eornIsDutyfree) {
		this.eornIsDutyfree = eornIsDutyfree;
		addValidField("eornIsDutyfree");
	}

	/**
	 * Get eornConsigneeEbspNameEn
	 */
	@Column(name = "EORN_CONSIGNEE_EBSP_NAME_EN")
	public String getEornConsigneeEbspNameEn() {
		return eornConsigneeEbspNameEn;
	}

	/**
	 * Set eornConsigneeEbspNameEn
	 */
	public void setEornConsigneeEbspNameEn(String eornConsigneeEbspNameEn) {
		this.eornConsigneeEbspNameEn = eornConsigneeEbspNameEn;
		addValidField("eornConsigneeEbspNameEn");
	}

	/**
	 * Get eornTradeTerms
	 */
	@Column(name = "EORN_TRADE_TERMS")
	public String getEornTradeTerms() {
		return eornTradeTerms;
	}

	/**
	 * Set eornTradeTerms
	 */
	public void setEornTradeTerms(String eornTradeTerms) {
		this.eornTradeTerms = eornTradeTerms;
		addValidField("eornTradeTerms");
	}

	/**
	 * Get eornContractNo
	 */
	@Column(name = "EORN_CONTRACT_NO")
	public String getEornContractNo() {
		return eornContractNo;
	}

	/**
	 * Set eornContractNo
	 */
	public void setEornContractNo(String eornContractNo) {
		this.eornContractNo = eornContractNo;
		addValidField("eornContractNo");
	}

	/**
	 * Get eornCreditNo
	 */
	@Column(name = "EORN_CREDIT_NO")
	public String getEornCreditNo() {
		return eornCreditNo;
	}

	/**
	 * Set eornCreditNo
	 */
	public void setEornCreditNo(String eornCreditNo) {
		this.eornCreditNo = eornCreditNo;
		addValidField("eornCreditNo");
	}

	/**
	 * Get eornTradeCountry
	 */
	@Column(name = "EORN_TRADE_COUNTRY")
	public String getEornTradeCountry() {
		return eornTradeCountry;
	}

	/**
	 * Set eornTradeCountry
	 */
	public void setEornTradeCountry(String eornTradeCountry) {
		this.eornTradeCountry = eornTradeCountry;
		addValidField("eornTradeCountry");
	}

	/**
	 * Get eornTradeCountryName
	 */
	@Column(name = "EORN_TRADE_COUNTRY_NAME")
	public String getEornTradeCountryName() {
		return eornTradeCountryName;
	}

	/**
	 * Set eornTradeCountryName
	 */
	public void setEornTradeCountryName(String eornTradeCountryName) {
		this.eornTradeCountryName = eornTradeCountryName;
		addValidField("eornTradeCountryName");
	}

	/**
	 * Get eornLicenseNo
	 */
	@Column(name = "EORN_LICENSE_NO")
	public String getEornLicenseNo() {
		return eornLicenseNo;
	}

	/**
	 * Set eornLicenseNo
	 */
	public void setEornLicenseNo(String eornLicenseNo) {
		this.eornLicenseNo = eornLicenseNo;
		addValidField("eornLicenseNo");
	}

	/**
	 * Get eornApprNo
	 */
	@Column(name = "EORN_APPR_NO")
	public String getEornApprNo() {
		return eornApprNo;
	}

	/**
	 * Set eornApprNo
	 */
	public void setEornApprNo(String eornApprNo) {
		this.eornApprNo = eornApprNo;
		addValidField("eornApprNo");
	}

	/**
	 * Get eornUse
	 */
	@Column(name = "EORN_USE")
	public String getEornUse() {
		return eornUse;
	}

	/**
	 * Set eornUse
	 */
	public void setEornUse(String eornUse) {
		this.eornUse = eornUse;
		addValidField("eornUse");
	}

	/**
	 * Get eornLoadPortId
	 */
	@Column(name = "EORN_LOAD_PORT_ID")
	public Long getEornLoadPortId() {
		return eornLoadPortId;
	}

	/**
	 * Set eornLoadPortId
	 */
	public void setEornLoadPortId(Long eornLoadPortId) {
		this.eornLoadPortId = eornLoadPortId;
		addValidField("eornLoadPortId");
	}

	/**
	 * Get eornLoadPortCode
	 */
	@Column(name = "EORN_LOAD_PORT_CODE")
	public String getEornLoadPortCode() {
		return eornLoadPortCode;
	}

	/**
	 * Set eornLoadPortCode
	 */
	public void setEornLoadPortCode(String eornLoadPortCode) {
		this.eornLoadPortCode = eornLoadPortCode;
		addValidField("eornLoadPortCode");
	}

	/**
	 * Get eornLoadPortName
	 */
	@Column(name = "EORN_LOAD_PORT_NAME")
	public String getEornLoadPortName() {
		return eornLoadPortName;
	}

	/**
	 * Set eornLoadPortName
	 */
	public void setEornLoadPortName(String eornLoadPortName) {
		this.eornLoadPortName = eornLoadPortName;
		addValidField("eornLoadPortName");
	}

	/**
	 * Get eornFilingDate
	 */
	@Column(name = "EORN_FILING_DATE")
	public Date getEornFilingDate() {
		return eornFilingDate;
	}

	/**
	 * Set eornFilingDate
	 */
	public void setEornFilingDate(Date eornFilingDate) {
		this.eornFilingDate = eornFilingDate;
		addValidField("eornFilingDate");
	}

	/**
	 * Get eornDocumentDate
	 */
	@Column(name = "EORN_DOCUMENT_DATE")
	public Date getEornDocumentDate() {
		return eornDocumentDate;
	}

	/**
	 * Set eornDocumentDate
	 */
	public void setEornDocumentDate(Date eornDocumentDate) {
		this.eornDocumentDate = eornDocumentDate;
		addValidField("eornDocumentDate");
	}

	/**
	 * Get eornRegistrationNo
	 */
	@Column(name = "EORN_REGISTRATION_NO")
	public String getEornRegistrationNo() {
		return eornRegistrationNo;
	}

	/**
	 * Set eornRegistrationNo
	 */
	public void setEornRegistrationNo(String eornRegistrationNo) {
		this.eornRegistrationNo = eornRegistrationNo;
		addValidField("eornRegistrationNo");
	}

	/**
	 * Get eornContainerSpec
	 */
	@Column(name = "EORN_CONTAINER_SPEC")
	public String getEornContainerSpec() {
		return eornContainerSpec;
	}

	/**
	 * Set eornContainerSpec
	 */
	public void setEornContainerSpec(String eornContainerSpec) {
		this.eornContainerSpec = eornContainerSpec;
		addValidField("eornContainerSpec");
	}

	/**
	 * Get eornSpecialItems
	 */
	@Column(name = "EORN_SPECIAL_ITEMS")
	public String getEornSpecialItems() {
		return eornSpecialItems;
	}

	/**
	 * Set eornSpecialItems
	 */
	public void setEornSpecialItems(String eornSpecialItems) {
		this.eornSpecialItems = eornSpecialItems;
		addValidField("eornSpecialItems");
	}

	/**
	 * Get eornMarkno
	 */
	@Column(name = "EORN_MARKNO")
	public String getEornMarkno() {
		return eornMarkno;
	}

	/**
	 * Set eornMarkno
	 */
	public void setEornMarkno(String eornMarkno) {
		this.eornMarkno = eornMarkno;
		addValidField("eornMarkno");
	}

	/**
	 * Get eornSubstr1
	 */
	@Column(name = "EORN_SUBSTR1")
	public String getEornSubstr1() {
		return eornSubstr1;
	}

	/**
	 * Set eornSubstr1
	 */
	public void setEornSubstr1(String eornSubstr1) {
		this.eornSubstr1 = eornSubstr1;
		addValidField("eornSubstr1");
	}

	/**
	 * Get eornSubstr2
	 */
	@Column(name = "EORN_SUBSTR2")
	public String getEornSubstr2() {
		return eornSubstr2;
	}

	/**
	 * Set eornSubstr2
	 */
	public void setEornSubstr2(String eornSubstr2) {
		this.eornSubstr2 = eornSubstr2;
		addValidField("eornSubstr2");
	}

	/**
	 * Get eornSubstr3
	 */
	@Column(name = "EORN_SUBSTR3")
	public String getEornSubstr3() {
		return eornSubstr3;
	}

	/**
	 * Set eornSubstr3
	 */
	public void setEornSubstr3(String eornSubstr3) {
		this.eornSubstr3 = eornSubstr3;
		addValidField("eornSubstr3");
	}

	/**
	 * Get eornSubstr4
	 */
	@Column(name = "EORN_SUBSTR4")
	public String getEornSubstr4() {
		return eornSubstr4;
	}

	/**
	 * Set eornSubstr4
	 */
	public void setEornSubstr4(String eornSubstr4) {
		this.eornSubstr4 = eornSubstr4;
		addValidField("eornSubstr4");
	}

	/**
	 * Get eornSubstr5
	 */
	@Column(name = "EORN_SUBSTR5")
	public String getEornSubstr5() {
		return eornSubstr5;
	}

	/**
	 * Set eornSubstr5
	 */
	public void setEornSubstr5(String eornSubstr5) {
		this.eornSubstr5 = eornSubstr5;
		addValidField("eornSubstr5");
	}

	/**
	 * Get eornSubstr6
	 */
	@Column(name = "EORN_SUBSTR6")
	public String getEornSubstr6() {
		return eornSubstr6;
	}

	/**
	 * Set eornSubstr6
	 */
	public void setEornSubstr6(String eornSubstr6) {
		this.eornSubstr6 = eornSubstr6;
		addValidField("eornSubstr6");
	}

	/**
	 * Get eornSubstr7
	 */
	@Column(name = "EORN_SUBSTR7")
	public String getEornSubstr7() {
		return eornSubstr7;
	}

	/**
	 * Set eornSubstr7
	 */
	public void setEornSubstr7(String eornSubstr7) {
		this.eornSubstr7 = eornSubstr7;
		addValidField("eornSubstr7");
	}

	/**
	 * Get eornSubstr8
	 */
	@Column(name = "EORN_SUBSTR8")
	public String getEornSubstr8() {
		return eornSubstr8;
	}

	/**
	 * Set eornSubstr8
	 */
	public void setEornSubstr8(String eornSubstr8) {
		this.eornSubstr8 = eornSubstr8;
		addValidField("eornSubstr8");
	}

	/**
	 * Get eornSubstr9
	 */
	@Column(name = "EORN_SUBSTR9")
	public String getEornSubstr9() {
		return eornSubstr9;
	}

	/**
	 * Set eornSubstr9
	 */
	public void setEornSubstr9(String eornSubstr9) {
		this.eornSubstr9 = eornSubstr9;
		addValidField("eornSubstr9");
	}

	/**
	 * Get eornSubstr10
	 */
	@Column(name = "EORN_SUBSTR10")
	public String getEornSubstr10() {
		return eornSubstr10;
	}

	/**
	 * Set eornSubstr10
	 */
	public void setEornSubstr10(String eornSubstr10) {
		this.eornSubstr10 = eornSubstr10;
		addValidField("eornSubstr10");
	}

	/**
	 * Get eornSubstr11
	 */
	@Column(name = "EORN_SUBSTR11")
	public String getEornSubstr11() {
		return eornSubstr11;
	}

	/**
	 * Set eornSubstr11
	 */
	public void setEornSubstr11(String eornSubstr11) {
		this.eornSubstr11 = eornSubstr11;
		addValidField("eornSubstr11");
	}

	/**
	 * Get eornSubstr12
	 */
	@Column(name = "EORN_SUBSTR12")
	public String getEornSubstr12() {
		return eornSubstr12;
	}

	/**
	 * Set eornSubstr12
	 */
	public void setEornSubstr12(String eornSubstr12) {
		this.eornSubstr12 = eornSubstr12;
		addValidField("eornSubstr12");
	}

	/**
	 * Get eornSubstr13
	 */
	@Column(name = "EORN_SUBSTR13")
	public String getEornSubstr13() {
		return eornSubstr13;
	}

	/**
	 * Set eornSubstr13
	 */
	public void setEornSubstr13(String eornSubstr13) {
		this.eornSubstr13 = eornSubstr13;
		addValidField("eornSubstr13");
	}

	/**
	 * Get eornSubstr14
	 */
	@Column(name = "EORN_SUBSTR14")
	public String getEornSubstr14() {
		return eornSubstr14;
	}

	/**
	 * Set eornSubstr14
	 */
	public void setEornSubstr14(String eornSubstr14) {
		this.eornSubstr14 = eornSubstr14;
		addValidField("eornSubstr14");
	}

	/**
	 * Get eornSubstr15
	 */
	@Column(name = "EORN_SUBSTR15")
	public String getEornSubstr15() {
		return eornSubstr15;
	}

	/**
	 * Set eornSubstr15
	 */
	public void setEornSubstr15(String eornSubstr15) {
		this.eornSubstr15 = eornSubstr15;
		addValidField("eornSubstr15");
	}

	/**
	 * Get eornSubstr16
	 */
	@Column(name = "EORN_SUBSTR16")
	public String getEornSubstr16() {
		return eornSubstr16;
	}

	/**
	 * Set eornSubstr16
	 */
	public void setEornSubstr16(String eornSubstr16) {
		this.eornSubstr16 = eornSubstr16;
		addValidField("eornSubstr16");
	}

	/**
	 * Get eornSubstr17
	 */
	@Column(name = "EORN_SUBSTR17")
	public String getEornSubstr17() {
		return eornSubstr17;
	}

	/**
	 * Set eornSubstr17
	 */
	public void setEornSubstr17(String eornSubstr17) {
		this.eornSubstr17 = eornSubstr17;
		addValidField("eornSubstr17");
	}

	/**
	 * Get eornSubstr18
	 */
	@Column(name = "EORN_SUBSTR18")
	public String getEornSubstr18() {
		return eornSubstr18;
	}

	/**
	 * Set eornSubstr18
	 */
	public void setEornSubstr18(String eornSubstr18) {
		this.eornSubstr18 = eornSubstr18;
		addValidField("eornSubstr18");
	}

	/**
	 * Get eornSubstr19
	 */
	@Column(name = "EORN_SUBSTR19")
	public String getEornSubstr19() {
		return eornSubstr19;
	}

	/**
	 * Set eornSubstr19
	 */
	public void setEornSubstr19(String eornSubstr19) {
		this.eornSubstr19 = eornSubstr19;
		addValidField("eornSubstr19");
	}

	/**
	 * Get eornSubstr20
	 */
	@Column(name = "EORN_SUBSTR20")
	public String getEornSubstr20() {
		return eornSubstr20;
	}

	/**
	 * Set eornSubstr20
	 */
	public void setEornSubstr20(String eornSubstr20) {
		this.eornSubstr20 = eornSubstr20;
		addValidField("eornSubstr20");
	}

	/**
	 * Get eornSubstr21
	 */
	@Column(name = "EORN_SUBSTR21")
	public String getEornSubstr21() {
		return eornSubstr21;
	}

	/**
	 * Set eornSubstr21
	 */
	public void setEornSubstr21(String eornSubstr21) {
		this.eornSubstr21 = eornSubstr21;
		addValidField("eornSubstr21");
	}

	/**
	 * Get eornSubstr22
	 */
	@Column(name = "EORN_SUBSTR22")
	public String getEornSubstr22() {
		return eornSubstr22;
	}

	/**
	 * Set eornSubstr22
	 */
	public void setEornSubstr22(String eornSubstr22) {
		this.eornSubstr22 = eornSubstr22;
		addValidField("eornSubstr22");
	}

	/**
	 * Get eornSubstr23
	 */
	@Column(name = "EORN_SUBSTR23")
	public String getEornSubstr23() {
		return eornSubstr23;
	}

	/**
	 * Set eornSubstr23
	 */
	public void setEornSubstr23(String eornSubstr23) {
		this.eornSubstr23 = eornSubstr23;
		addValidField("eornSubstr23");
	}

	/**
	 * Get eornSubstr24
	 */
	@Column(name = "EORN_SUBSTR24")
	public String getEornSubstr24() {
		return eornSubstr24;
	}

	/**
	 * Set eornSubstr24
	 */
	public void setEornSubstr24(String eornSubstr24) {
		this.eornSubstr24 = eornSubstr24;
		addValidField("eornSubstr24");
	}

	/**
	 * Get eornSubstr25
	 */
	@Column(name = "EORN_SUBSTR25")
	public String getEornSubstr25() {
		return eornSubstr25;
	}

	/**
	 * Set eornSubstr25
	 */
	public void setEornSubstr25(String eornSubstr25) {
		this.eornSubstr25 = eornSubstr25;
		addValidField("eornSubstr25");
	}

	/**
	 * Get eornSubdate1
	 */
	@Column(name = "EORN_SUBDATE1")
	public Date getEornSubdate1() {
		return eornSubdate1;
	}

	/**
	 * Set eornSubdate1
	 */
	public void setEornSubdate1(Date eornSubdate1) {
		this.eornSubdate1 = eornSubdate1;
		addValidField("eornSubdate1");
	}

	/**
	 * Get eornSubdate2
	 */
	@Column(name = "EORN_SUBDATE2")
	public Date getEornSubdate2() {
		return eornSubdate2;
	}

	/**
	 * Set eornSubdate2
	 */
	public void setEornSubdate2(Date eornSubdate2) {
		this.eornSubdate2 = eornSubdate2;
		addValidField("eornSubdate2");
	}

	/**
	 * Get eornSubdate3
	 */
	@Column(name = "EORN_SUBDATE3")
	public Date getEornSubdate3() {
		return eornSubdate3;
	}

	/**
	 * Set eornSubdate3
	 */
	public void setEornSubdate3(Date eornSubdate3) {
		this.eornSubdate3 = eornSubdate3;
		addValidField("eornSubdate3");
	}

	/**
	 * Get eornSubdate4
	 */
	@Column(name = "EORN_SUBDATE4")
	public Date getEornSubdate4() {
		return eornSubdate4;
	}

	/**
	 * Set eornSubdate4
	 */
	public void setEornSubdate4(Date eornSubdate4) {
		this.eornSubdate4 = eornSubdate4;
		addValidField("eornSubdate4");
	}

	/**
	 * Get eornSubdate5
	 */
	@Column(name = "EORN_SUBDATE5")
	public Date getEornSubdate5() {
		return eornSubdate5;
	}

	/**
	 * Set eornSubdate5
	 */
	public void setEornSubdate5(Date eornSubdate5) {
		this.eornSubdate5 = eornSubdate5;
		addValidField("eornSubdate5");
	}

	/**
	 * Get eornSubdate6
	 */
	@Column(name = "EORN_SUBDATE6")
	public Date getEornSubdate6() {
		return eornSubdate6;
	}

	/**
	 * Set eornSubdate6
	 */
	public void setEornSubdate6(Date eornSubdate6) {
		this.eornSubdate6 = eornSubdate6;
		addValidField("eornSubdate6");
	}

	/**
	 * Get eornSubdate7
	 */
	@Column(name = "EORN_SUBDATE7")
	public Date getEornSubdate7() {
		return eornSubdate7;
	}

	/**
	 * Set eornSubdate7
	 */
	public void setEornSubdate7(Date eornSubdate7) {
		this.eornSubdate7 = eornSubdate7;
		addValidField("eornSubdate7");
	}

	/**
	 * Get eornSubdate8
	 */
	@Column(name = "EORN_SUBDATE8")
	public Date getEornSubdate8() {
		return eornSubdate8;
	}

	/**
	 * Set eornSubdate8
	 */
	public void setEornSubdate8(Date eornSubdate8) {
		this.eornSubdate8 = eornSubdate8;
		addValidField("eornSubdate8");
	}

	/**
	 * Get eornSubdate9
	 */
	@Column(name = "EORN_SUBDATE9")
	public Date getEornSubdate9() {
		return eornSubdate9;
	}

	/**
	 * Set eornSubdate9
	 */
	public void setEornSubdate9(Date eornSubdate9) {
		this.eornSubdate9 = eornSubdate9;
		addValidField("eornSubdate9");
	}

	/**
	 * Get eornSubdate10
	 */
	@Column(name = "EORN_SUBDATE10")
	public Date getEornSubdate10() {
		return eornSubdate10;
	}

	/**
	 * Set eornSubdate10
	 */
	public void setEornSubdate10(Date eornSubdate10) {
		this.eornSubdate10 = eornSubdate10;
		addValidField("eornSubdate10");
	}

	/**
	 * Get eornSubnum1
	 */
	@Column(name = "EORN_SUBNUM1")
	public Long getEornSubnum1() {
		return eornSubnum1;
	}

	/**
	 * Set eornSubnum1
	 */
	public void setEornSubnum1(Long eornSubnum1) {
		this.eornSubnum1 = eornSubnum1;
		addValidField("eornSubnum1");
	}

	/**
	 * Get eornSubnum2
	 */
	@Column(name = "EORN_SUBNUM2")
	public Long getEornSubnum2() {
		return eornSubnum2;
	}

	/**
	 * Set eornSubnum2
	 */
	public void setEornSubnum2(Long eornSubnum2) {
		this.eornSubnum2 = eornSubnum2;
		addValidField("eornSubnum2");
	}

	/**
	 * Get eornSubnum3
	 */
	@Column(name = "EORN_SUBNUM3")
	public Long getEornSubnum3() {
		return eornSubnum3;
	}

	/**
	 * Set eornSubnum3
	 */
	public void setEornSubnum3(Long eornSubnum3) {
		this.eornSubnum3 = eornSubnum3;
		addValidField("eornSubnum3");
	}

	/**
	 * Get eornSubnum4
	 */
	@Column(name = "EORN_SUBNUM4")
	public Long getEornSubnum4() {
		return eornSubnum4;
	}

	/**
	 * Set eornSubnum4
	 */
	public void setEornSubnum4(Long eornSubnum4) {
		this.eornSubnum4 = eornSubnum4;
		addValidField("eornSubnum4");
	}

	/**
	 * Get eornSubnum5
	 */
	@Column(name = "EORN_SUBNUM5")
	public Long getEornSubnum5() {
		return eornSubnum5;
	}

	/**
	 * Set eornSubnum5
	 */
	public void setEornSubnum5(Long eornSubnum5) {
		this.eornSubnum5 = eornSubnum5;
		addValidField("eornSubnum5");
	}

	/**
	 * Get eornSubnum6
	 */
	@Column(name = "EORN_SUBNUM6")
	public Long getEornSubnum6() {
		return eornSubnum6;
	}

	/**
	 * Set eornSubnum6
	 */
	public void setEornSubnum6(Long eornSubnum6) {
		this.eornSubnum6 = eornSubnum6;
		addValidField("eornSubnum6");
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
	 * Get eornRegNumber
	 */
	@Column(name = "EORN_REG_NUMBER")
	public String getEornRegNumber() {
		return eornRegNumber;
	}

	/**
	 * Set eornRegNumber
	 */
	public void setEornRegNumber(String eornRegNumber) {
		this.eornRegNumber = eornRegNumber;
		addValidField("eornRegNumber");
	}

	/**
	 * Get eornConsigneeEbspNameCn
	 */
	@Column(name = "EORN_CONSIGNEE_EBSP_NAME_CN")
	public String getEornConsigneeEbspNameCn() {
		return eornConsigneeEbspNameCn;
	}

	/**
	 * Set eornConsigneeEbspNameCn
	 */
	public void setEornConsigneeEbspNameCn(String eornConsigneeEbspNameCn) {
		this.eornConsigneeEbspNameCn = eornConsigneeEbspNameCn;
		addValidField("eornConsigneeEbspNameCn");
	}

	/**
	 * Get eornShipperEbspNameCn
	 */
	@Column(name = "EORN_SHIPPER_EBSP_NAME_CN")
	public String getEornShipperEbspNameCn() {
		return eornShipperEbspNameCn;
	}

	/**
	 * Set eornShipperEbspNameCn
	 */
	public void setEornShipperEbspNameCn(String eornShipperEbspNameCn) {
		this.eornShipperEbspNameCn = eornShipperEbspNameCn;
		addValidField("eornShipperEbspNameCn");
	}

	/**
	 * Get eornTransportName
	 */
	@Column(name = "EORN_TRANSPORT_NAME")
	public String getEornTransportName() {
		return eornTransportName;
	}

	/**
	 * Set eornTransportName
	 */
	public void setEornTransportName(String eornTransportName) {
		this.eornTransportName = eornTransportName;
		addValidField("eornTransportName");
	}

}
