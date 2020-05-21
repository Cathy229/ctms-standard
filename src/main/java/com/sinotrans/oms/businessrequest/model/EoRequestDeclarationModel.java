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
 * Model class for EoRequestDeclaration
 */
@Entity
@Table(name = "EO_REQUEST_DECLARATION")
public class EoRequestDeclarationModel extends BaseModel implements OperationLog {

	//eordId
	private Long eordId;
	//eordEoorId
	private Long eordEoorId;
	//eordEscoId
	private Long eordEscoId;
	//eordEbpjId
	private Long eordEbpjId;
	//eordLoEbppId
	private Long eordLoEbppId;
	//eordEbtkId
	private Long eordEbtkId;
	//eordIsAutomatic
	private String eordIsAutomatic;
	//eordTaskStatus
	private String eordTaskStatus;
	//eordTaskFeedback
	private String eordTaskFeedback;
	//eordSysCode
	private String eordSysCode;
	//eordEbbuId
	private Long eordEbbuId;
	//eordEbbuNameCn
	private String eordEbbuNameCn;
	//eordEbbuCode
	private String eordEbbuCode;
	//eordEbbuDist1
	private String eordEbbuDist1;
	//eordEbbuDist2
	private String eordEbbuDist2;
	//eordEbbuDist3
	private String eordEbbuDist3;
	//eordEbbuDist4
	private String eordEbbuDist4;
	//eordEbbuDist5
	private String eordEbbuDist5;
	//eodlFeedbackState
	private String eodlFeedbackState;
	//eodlFeedbackDate
	private Date eodlFeedbackDate;
	//eodlFeedbackDesc
	private String eodlFeedbackDesc;
	//eordTransportNo
	private String eordTransportNo;
	//eordNo
	private String eordNo;
	//eordType
	private String eordType;
	//eordStatus
	private String eordStatus;
	//eordOrder
	private Long eordOrder;
	//eordSoNo
	private String eordSoNo;
	//eordDoNo
	private String eordDoNo;
	//eordOwnerEbcuId
	private Long eordOwnerEbcuId;
	//eordOwnerEbcuCode
	private String eordOwnerEbcuCode;
	//eordOwnerEbcuName
	private String eordOwnerEbcuName;
	//eordSrEbcuId
	private Long eordSrEbcuId;
	//eordSrEbcuCode
	private String eordSrEbcuCode;
	//eordSrEbcuName
	private String eordSrEbcuName;
	//eordDeclareEbcuId
	private Long eordDeclareEbcuId;
	//eordDeclareEbcuCode
	private String eordDeclareEbcuCode;
	//eordDeclareEbcuName
	private String eordDeclareEbcuName;
	//eordTaxCompanyType
	private String eordTaxCompanyType;
	//eordUrgency
	private String eordUrgency;
	//eordContainerNo
	private String eordContainerNo;
	//eordContainerType
	private String eordContainerType;
	//eordContainerWeight
	private Long eordContainerWeight;
	//eordBillNo
	private String eordBillNo;
	//eordRemark
	private String eordRemark;
	//eordDeclarationType
	private String eordDeclarationType;
	//eordTradeType
	private String eordTradeType;
	//eordPortDate
	private Date eordPortDate;
	//eordDeclarationTime
	private Date eordDeclarationTime;
	//eordRecordNo
	private String eordRecordNo;
	//eordContractNo
	private String eordContractNo;
	//eordLicenseNo
	private String eordLicenseNo;
	//eordApprovalNo
	private String eordApprovalNo;
	//eordTransportType
	private String eordTransportType;
	//eordTransportName
	private String eordTransportName;
	//eordPackageType
	private String eordPackageType;
	//eordSupervisionType
	private String eordSupervisionType;
	//eordExemptionType
	private String eordExemptionType;
	//eordExchangeType
	private String eordExchangeType;
	//eordDealType
	private String eordDealType;
	//eordPortCode
	private String eordPortCode;
	//eordLoadEbptId
	private Long eordLoadEbptId;
	//eordLoadEbptCode
	private String eordLoadEbptCode;
	//eordLoadEbptName
	private String eordLoadEbptName;
	//eordFreightType
	private String eordFreightType;
	//eordFreight
	private Long eordFreight;
	//eordFreightCurrency
	private String eordFreightCurrency;
	//eordInsuranceType
	private String eordInsuranceType;
	//eordInsurance
	private Long eordInsurance;
	//eordIncidentalType
	private String eordIncidentalType;
	//eordInsuranceCurrency
	private String eordInsuranceCurrency;
	//eordIncidental
	private Long eordIncidental;
	//eordQuantity
	private Long eordQuantity;
	//eordVolume
	private Long eordVolume;
	//eordIncidentalCurrency
	private String eordIncidentalCurrency;
	//eordGw
	private Long eordGw;
	//eordNw
	private Long eordNw;
	//eordRegulatoryPositionNo
	private String eordRegulatoryPositionNo;
	//eordFreightYardCode
	private String eordFreightYardCode;
	//eordDeclarationContact
	private String eordDeclarationContact;
	//eordDeclarationNo
	private String eordDeclarationNo;
	//eordAssBillNo
	private String eordAssBillNo;
	//eordAssEmsNo
	private String eordAssEmsNo;
	//eordVoyageNo
	private String eordVoyageNo;
	//eordSubstr1
	private String eordSubstr1;
	//eordSubstr2
	private String eordSubstr2;
	//eordSubstr3
	private String eordSubstr3;
	//eordSubstr4
	private String eordSubstr4;
	//eordSubstr5
	private String eordSubstr5;
	//eordSubstr6
	private String eordSubstr6;
	//eordSubstr7
	private String eordSubstr7;
	//eordSubstr8
	private String eordSubstr8;
	//eordSubstr9
	private String eordSubstr9;
	//eordSubstr10
	private String eordSubstr10;
	//eordSubstr11
	private String eordSubstr11;
	//eordSubstr12
	private String eordSubstr12;
	//eordSubstr13
	private String eordSubstr13;
	//eordSubstr14
	private String eordSubstr14;
	//eordSubstr15
	private String eordSubstr15;
	//eordSubstr16
	private String eordSubstr16;
	//eordSubstr17
	private String eordSubstr17;
	//eordSubstr18
	private String eordSubstr18;
	//eordSubstr19
	private String eordSubstr19;
	//eordSubstr20
	private String eordSubstr20;
	//eordSubstr21
	private String eordSubstr21;
	//eordSubstr22
	private String eordSubstr22;
	//eordSubstr23
	private String eordSubstr23;
	//eordSubstr24
	private String eordSubstr24;
	//eordSubstr25
	private String eordSubstr25;
	//eordSubdate1
	private Date eordSubdate1;
	//eordSubdate2
	private Date eordSubdate2;
	//eordSubdate3
	private Date eordSubdate3;
	//eordSubdate4
	private Date eordSubdate4;
	//eordSubdate5
	private Date eordSubdate5;
	//eordSubdate6
	private Date eordSubdate6;
	//eordSubnum1
	private Long eordSubnum1;
	//eordSubnum2
	private Long eordSubnum2;
	//eordSubnum3
	private Long eordSubnum3;
	//eordSubnum4
	private Long eordSubnum4;
	//eordSubnum5
	private Long eordSubnum5;
	//eordSubnum6
	private Long eordSubnum6;
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
	//eordTradeCountry
	private String eordTradeCountry;
	//eordTradeCountryName
	private String eordTradeCountryName;
	//eordArriveCode
	private String eordArriveCode;
	//eordArriveName
	private String eordArriveName;
	//eordCustomsNo
	private String eordCustomsNo;
	//eordIntegrateNo
	private String eordIntegrateNo;

	/**
	 * Get eordId
	 */
	@Column(name = "EORD_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEordId() {
		return eordId;
	}

	/**
	 * Set eordId
	 */
	public void setEordId(Long eordId) {
		this.eordId = eordId;
		addValidField("eordId");
	}

	/**
	 * Get eordEoorId
	 */
	@Column(name = "EORD_EOOR_ID")
	public Long getEordEoorId() {
		return eordEoorId;
	}

	/**
	 * Set eordEoorId
	 */
	public void setEordEoorId(Long eordEoorId) {
		this.eordEoorId = eordEoorId;
		addValidField("eordEoorId");
	}

	/**
	 * Get eordEscoId
	 */
	@Column(name = "EORD_ESCO_ID")
	public Long getEordEscoId() {
		return eordEscoId;
	}

	/**
	 * Set eordEscoId
	 */
	public void setEordEscoId(Long eordEscoId) {
		this.eordEscoId = eordEscoId;
		addValidField("eordEscoId");
	}

	/**
	 * Get eordEbpjId
	 */
	@Column(name = "EORD_EBPJ_ID")
	public Long getEordEbpjId() {
		return eordEbpjId;
	}

	/**
	 * Set eordEbpjId
	 */
	public void setEordEbpjId(Long eordEbpjId) {
		this.eordEbpjId = eordEbpjId;
		addValidField("eordEbpjId");
	}

	/**
	 * Get eordLoEbppId
	 */
	@Column(name = "EORD_LO_EBPP_ID")
	public Long getEordLoEbppId() {
		return eordLoEbppId;
	}

	/**
	 * Set eordLoEbppId
	 */
	public void setEordLoEbppId(Long eordLoEbppId) {
		this.eordLoEbppId = eordLoEbppId;
		addValidField("eordLoEbppId");
	}

	/**
	 * Get eordEbtkId
	 */
	@Column(name = "EORD_EBTK_ID")
	public Long getEordEbtkId() {
		return eordEbtkId;
	}

	/**
	 * Set eordEbtkId
	 */
	public void setEordEbtkId(Long eordEbtkId) {
		this.eordEbtkId = eordEbtkId;
		addValidField("eordEbtkId");
	}

	/**
	 * Get eordIsAutomatic
	 */
	@Column(name = "EORD_IS_AUTOMATIC")
	public String getEordIsAutomatic() {
		return eordIsAutomatic;
	}

	/**
	 * Set eordIsAutomatic
	 */
	public void setEordIsAutomatic(String eordIsAutomatic) {
		this.eordIsAutomatic = eordIsAutomatic;
		addValidField("eordIsAutomatic");
	}

	/**
	 * Get eordTaskStatus
	 */
	@Column(name = "EORD_TASK_STATUS")
	public String getEordTaskStatus() {
		return eordTaskStatus;
	}

	/**
	 * Set eordTaskStatus
	 */
	public void setEordTaskStatus(String eordTaskStatus) {
		this.eordTaskStatus = eordTaskStatus;
		addValidField("eordTaskStatus");
	}

	/**
	 * Get eordTaskFeedback
	 */
	@Column(name = "EORD_TASK_FEEDBACK")
	public String getEordTaskFeedback() {
		return eordTaskFeedback;
	}

	/**
	 * Set eordTaskFeedback
	 */
	public void setEordTaskFeedback(String eordTaskFeedback) {
		this.eordTaskFeedback = eordTaskFeedback;
		addValidField("eordTaskFeedback");
	}

	/**
	 * Get eordSysCode
	 */
	@Column(name = "EORD_SYS_CODE")
	public String getEordSysCode() {
		return eordSysCode;
	}

	/**
	 * Set eordSysCode
	 */
	public void setEordSysCode(String eordSysCode) {
		this.eordSysCode = eordSysCode;
		addValidField("eordSysCode");
	}

	/**
	 * Get eordEbbuId
	 */
	@Column(name = "EORD_EBBU_ID")
	public Long getEordEbbuId() {
		return eordEbbuId;
	}

	/**
	 * Set eordEbbuId
	 */
	public void setEordEbbuId(Long eordEbbuId) {
		this.eordEbbuId = eordEbbuId;
		addValidField("eordEbbuId");
	}

	/**
	 * Get eordEbbuNameCn
	 */
	@Column(name = "EORD_EBBU_NAME_CN")
	public String getEordEbbuNameCn() {
		return eordEbbuNameCn;
	}

	/**
	 * Set eordEbbuNameCn
	 */
	public void setEordEbbuNameCn(String eordEbbuNameCn) {
		this.eordEbbuNameCn = eordEbbuNameCn;
		addValidField("eordEbbuNameCn");
	}

	/**
	 * Get eordEbbuCode
	 */
	@Column(name = "EORD_EBBU_CODE")
	public String getEordEbbuCode() {
		return eordEbbuCode;
	}

	/**
	 * Set eordEbbuCode
	 */
	public void setEordEbbuCode(String eordEbbuCode) {
		this.eordEbbuCode = eordEbbuCode;
		addValidField("eordEbbuCode");
	}

	/**
	 * Get eordEbbuDist1
	 */
	@Column(name = "EORD_EBBU_DIST_1")
	public String getEordEbbuDist1() {
		return eordEbbuDist1;
	}

	/**
	 * Set eordEbbuDist1
	 */
	public void setEordEbbuDist1(String eordEbbuDist1) {
		this.eordEbbuDist1 = eordEbbuDist1;
		addValidField("eordEbbuDist1");
	}

	/**
	 * Get eordEbbuDist2
	 */
	@Column(name = "EORD_EBBU_DIST_2")
	public String getEordEbbuDist2() {
		return eordEbbuDist2;
	}

	/**
	 * Set eordEbbuDist2
	 */
	public void setEordEbbuDist2(String eordEbbuDist2) {
		this.eordEbbuDist2 = eordEbbuDist2;
		addValidField("eordEbbuDist2");
	}

	/**
	 * Get eordEbbuDist3
	 */
	@Column(name = "EORD_EBBU_DIST_3")
	public String getEordEbbuDist3() {
		return eordEbbuDist3;
	}

	/**
	 * Set eordEbbuDist3
	 */
	public void setEordEbbuDist3(String eordEbbuDist3) {
		this.eordEbbuDist3 = eordEbbuDist3;
		addValidField("eordEbbuDist3");
	}

	/**
	 * Get eordEbbuDist4
	 */
	@Column(name = "EORD_EBBU_DIST_4")
	public String getEordEbbuDist4() {
		return eordEbbuDist4;
	}

	/**
	 * Set eordEbbuDist4
	 */
	public void setEordEbbuDist4(String eordEbbuDist4) {
		this.eordEbbuDist4 = eordEbbuDist4;
		addValidField("eordEbbuDist4");
	}

	/**
	 * Get eordEbbuDist5
	 */
	@Column(name = "EORD_EBBU_DIST_5")
	public String getEordEbbuDist5() {
		return eordEbbuDist5;
	}

	/**
	 * Set eordEbbuDist5
	 */
	public void setEordEbbuDist5(String eordEbbuDist5) {
		this.eordEbbuDist5 = eordEbbuDist5;
		addValidField("eordEbbuDist5");
	}

	/**
	 * Get eodlFeedbackState
	 */
	@Column(name = "EODL_FEEDBACK_STATE")
	public String getEodlFeedbackState() {
		return eodlFeedbackState;
	}

	/**
	 * Set eodlFeedbackState
	 */
	public void setEodlFeedbackState(String eodlFeedbackState) {
		this.eodlFeedbackState = eodlFeedbackState;
		addValidField("eodlFeedbackState");
	}

	/**
	 * Get eodlFeedbackDate
	 */
	@Column(name = "EODL_FEEDBACK_DATE")
	public Date getEodlFeedbackDate() {
		return eodlFeedbackDate;
	}

	/**
	 * Set eodlFeedbackDate
	 */
	public void setEodlFeedbackDate(Date eodlFeedbackDate) {
		this.eodlFeedbackDate = eodlFeedbackDate;
		addValidField("eodlFeedbackDate");
	}

	/**
	 * Get eodlFeedbackDesc
	 */
	@Column(name = "EODL_FEEDBACK_DESC")
	public String getEodlFeedbackDesc() {
		return eodlFeedbackDesc;
	}

	/**
	 * Set eodlFeedbackDesc
	 */
	public void setEodlFeedbackDesc(String eodlFeedbackDesc) {
		this.eodlFeedbackDesc = eodlFeedbackDesc;
		addValidField("eodlFeedbackDesc");
	}

	/**
	 * Get eordTransportNo
	 */
	@Column(name = "EORD_TRANSPORT_NO")
	public String getEordTransportNo() {
		return eordTransportNo;
	}

	/**
	 * Set eordTransportNo
	 */
	public void setEordTransportNo(String eordTransportNo) {
		this.eordTransportNo = eordTransportNo;
		addValidField("eordTransportNo");
	}

	/**
	 * Get eordNo
	 */
	@Column(name = "EORD_NO")
	public String getEordNo() {
		return eordNo;
	}

	/**
	 * Set eordNo
	 */
	public void setEordNo(String eordNo) {
		this.eordNo = eordNo;
		addValidField("eordNo");
	}

	/**
	 * Get eordType
	 */
	@Column(name = "EORD_TYPE")
	public String getEordType() {
		return eordType;
	}

	/**
	 * Set eordType
	 */
	public void setEordType(String eordType) {
		this.eordType = eordType;
		addValidField("eordType");
	}

	/**
	 * Get eordStatus
	 */
	@Column(name = "EORD_STATUS")
	public String getEordStatus() {
		return eordStatus;
	}

	/**
	 * Set eordStatus
	 */
	public void setEordStatus(String eordStatus) {
		this.eordStatus = eordStatus;
		addValidField("eordStatus");
	}

	/**
	 * Get eordOrder
	 */
	@Column(name = "EORD_ORDER")
	public Long getEordOrder() {
		return eordOrder;
	}

	/**
	 * Set eordOrder
	 */
	public void setEordOrder(Long eordOrder) {
		this.eordOrder = eordOrder;
		addValidField("eordOrder");
	}

	/**
	 * Get eordSoNo
	 */
	@Column(name = "EORD_SO_NO")
	public String getEordSoNo() {
		return eordSoNo;
	}

	/**
	 * Set eordSoNo
	 */
	public void setEordSoNo(String eordSoNo) {
		this.eordSoNo = eordSoNo;
		addValidField("eordSoNo");
	}

	/**
	 * Get eordDoNo
	 */
	@Column(name = "EORD_DO_NO")
	public String getEordDoNo() {
		return eordDoNo;
	}

	/**
	 * Set eordDoNo
	 */
	public void setEordDoNo(String eordDoNo) {
		this.eordDoNo = eordDoNo;
		addValidField("eordDoNo");
	}

	/**
	 * Get eordOwnerEbcuId
	 */
	@Column(name = "EORD_OWNER_EBCU_ID")
	public Long getEordOwnerEbcuId() {
		return eordOwnerEbcuId;
	}

	/**
	 * Set eordOwnerEbcuId
	 */
	public void setEordOwnerEbcuId(Long eordOwnerEbcuId) {
		this.eordOwnerEbcuId = eordOwnerEbcuId;
		addValidField("eordOwnerEbcuId");
	}

	/**
	 * Get eordOwnerEbcuCode
	 */
	@Column(name = "EORD_OWNER_EBCU_CODE")
	public String getEordOwnerEbcuCode() {
		return eordOwnerEbcuCode;
	}

	/**
	 * Set eordOwnerEbcuCode
	 */
	public void setEordOwnerEbcuCode(String eordOwnerEbcuCode) {
		this.eordOwnerEbcuCode = eordOwnerEbcuCode;
		addValidField("eordOwnerEbcuCode");
	}

	/**
	 * Get eordOwnerEbcuName
	 */
	@Column(name = "EORD_OWNER_EBCU_NAME")
	public String getEordOwnerEbcuName() {
		return eordOwnerEbcuName;
	}

	/**
	 * Set eordOwnerEbcuName
	 */
	public void setEordOwnerEbcuName(String eordOwnerEbcuName) {
		this.eordOwnerEbcuName = eordOwnerEbcuName;
		addValidField("eordOwnerEbcuName");
	}

	/**
	 * Get eordSrEbcuId
	 */
	@Column(name = "EORD_SR_EBCU_ID")
	public Long getEordSrEbcuId() {
		return eordSrEbcuId;
	}

	/**
	 * Set eordSrEbcuId
	 */
	public void setEordSrEbcuId(Long eordSrEbcuId) {
		this.eordSrEbcuId = eordSrEbcuId;
		addValidField("eordSrEbcuId");
	}

	/**
	 * Get eordSrEbcuCode
	 */
	@Column(name = "EORD_SR_EBCU_CODE")
	public String getEordSrEbcuCode() {
		return eordSrEbcuCode;
	}

	/**
	 * Set eordSrEbcuCode
	 */
	public void setEordSrEbcuCode(String eordSrEbcuCode) {
		this.eordSrEbcuCode = eordSrEbcuCode;
		addValidField("eordSrEbcuCode");
	}

	/**
	 * Get eordSrEbcuName
	 */
	@Column(name = "EORD_SR_EBCU_NAME")
	public String getEordSrEbcuName() {
		return eordSrEbcuName;
	}

	/**
	 * Set eordSrEbcuName
	 */
	public void setEordSrEbcuName(String eordSrEbcuName) {
		this.eordSrEbcuName = eordSrEbcuName;
		addValidField("eordSrEbcuName");
	}

	/**
	 * Get eordDeclareEbcuId
	 */
	@Column(name = "EORD_DECLARE_EBCU_ID")
	public Long getEordDeclareEbcuId() {
		return eordDeclareEbcuId;
	}

	/**
	 * Set eordDeclareEbcuId
	 */
	public void setEordDeclareEbcuId(Long eordDeclareEbcuId) {
		this.eordDeclareEbcuId = eordDeclareEbcuId;
		addValidField("eordDeclareEbcuId");
	}

	/**
	 * Get eordDeclareEbcuCode
	 */
	@Column(name = "EORD_DECLARE_EBCU_CODE")
	public String getEordDeclareEbcuCode() {
		return eordDeclareEbcuCode;
	}

	/**
	 * Set eordDeclareEbcuCode
	 */
	public void setEordDeclareEbcuCode(String eordDeclareEbcuCode) {
		this.eordDeclareEbcuCode = eordDeclareEbcuCode;
		addValidField("eordDeclareEbcuCode");
	}

	/**
	 * Get eordDeclareEbcuName
	 */
	@Column(name = "EORD_DECLARE_EBCU_NAME")
	public String getEordDeclareEbcuName() {
		return eordDeclareEbcuName;
	}

	/**
	 * Set eordDeclareEbcuName
	 */
	public void setEordDeclareEbcuName(String eordDeclareEbcuName) {
		this.eordDeclareEbcuName = eordDeclareEbcuName;
		addValidField("eordDeclareEbcuName");
	}

	/**
	 * Get eordTaxCompanyType
	 */
	@Column(name = "EORD_TAX_COMPANY_TYPE")
	public String getEordTaxCompanyType() {
		return eordTaxCompanyType;
	}

	/**
	 * Set eordTaxCompanyType
	 */
	public void setEordTaxCompanyType(String eordTaxCompanyType) {
		this.eordTaxCompanyType = eordTaxCompanyType;
		addValidField("eordTaxCompanyType");
	}

	/**
	 * Get eordUrgency
	 */
	@Column(name = "EORD_URGENCY")
	public String getEordUrgency() {
		return eordUrgency;
	}

	/**
	 * Set eordUrgency
	 */
	public void setEordUrgency(String eordUrgency) {
		this.eordUrgency = eordUrgency;
		addValidField("eordUrgency");
	}

	/**
	 * Get eordContainerNo
	 */
	@Column(name = "EORD_CONTAINER_NO")
	public String getEordContainerNo() {
		return eordContainerNo;
	}

	/**
	 * Set eordContainerNo
	 */
	public void setEordContainerNo(String eordContainerNo) {
		this.eordContainerNo = eordContainerNo;
		addValidField("eordContainerNo");
	}

	/**
	 * Get eordContainerType
	 */
	@Column(name = "EORD_CONTAINER_TYPE")
	public String getEordContainerType() {
		return eordContainerType;
	}

	/**
	 * Set eordContainerType
	 */
	public void setEordContainerType(String eordContainerType) {
		this.eordContainerType = eordContainerType;
		addValidField("eordContainerType");
	}

	/**
	 * Get eordContainerWeight
	 */
	@Column(name = "EORD_CONTAINER_WEIGHT")
	public Long getEordContainerWeight() {
		return eordContainerWeight;
	}

	/**
	 * Set eordContainerWeight
	 */
	public void setEordContainerWeight(Long eordContainerWeight) {
		this.eordContainerWeight = eordContainerWeight;
		addValidField("eordContainerWeight");
	}

	/**
	 * Get eordBillNo
	 */
	@Column(name = "EORD_BILL_NO")
	public String getEordBillNo() {
		return eordBillNo;
	}

	/**
	 * Set eordBillNo
	 */
	public void setEordBillNo(String eordBillNo) {
		this.eordBillNo = eordBillNo;
		addValidField("eordBillNo");
	}

	/**
	 * Get eordRemark
	 */
	@Column(name = "EORD_REMARK")
	public String getEordRemark() {
		return eordRemark;
	}

	/**
	 * Set eordRemark
	 */
	public void setEordRemark(String eordRemark) {
		this.eordRemark = eordRemark;
		addValidField("eordRemark");
	}

	/**
	 * Get eordDeclarationType
	 */
	@Column(name = "EORD_DECLARATION_TYPE")
	public String getEordDeclarationType() {
		return eordDeclarationType;
	}

	/**
	 * Set eordDeclarationType
	 */
	public void setEordDeclarationType(String eordDeclarationType) {
		this.eordDeclarationType = eordDeclarationType;
		addValidField("eordDeclarationType");
	}

	/**
	 * Get eordTradeType
	 */
	@Column(name = "EORD_TRADE_TYPE")
	public String getEordTradeType() {
		return eordTradeType;
	}

	/**
	 * Set eordTradeType
	 */
	public void setEordTradeType(String eordTradeType) {
		this.eordTradeType = eordTradeType;
		addValidField("eordTradeType");
	}

	/**
	 * Get eordPortDate
	 */
	@Column(name = "EORD_PORT_DATE")
	public Date getEordPortDate() {
		return eordPortDate;
	}

	/**
	 * Set eordPortDate
	 */
	public void setEordPortDate(Date eordPortDate) {
		this.eordPortDate = eordPortDate;
		addValidField("eordPortDate");
	}

	/**
	 * Get eordDeclarationTime
	 */
	@Column(name = "EORD_DECLARATION_TIME")
	public Date getEordDeclarationTime() {
		return eordDeclarationTime;
	}

	/**
	 * Set eordDeclarationTime
	 */
	public void setEordDeclarationTime(Date eordDeclarationTime) {
		this.eordDeclarationTime = eordDeclarationTime;
		addValidField("eordDeclarationTime");
	}

	/**
	 * Get eordRecordNo
	 */
	@Column(name = "EORD_RECORD_NO")
	public String getEordRecordNo() {
		return eordRecordNo;
	}

	/**
	 * Set eordRecordNo
	 */
	public void setEordRecordNo(String eordRecordNo) {
		this.eordRecordNo = eordRecordNo;
		addValidField("eordRecordNo");
	}

	/**
	 * Get eordContractNo
	 */
	@Column(name = "EORD_CONTRACT_NO")
	public String getEordContractNo() {
		return eordContractNo;
	}

	/**
	 * Set eordContractNo
	 */
	public void setEordContractNo(String eordContractNo) {
		this.eordContractNo = eordContractNo;
		addValidField("eordContractNo");
	}

	/**
	 * Get eordLicenseNo
	 */
	@Column(name = "EORD_LICENSE_NO")
	public String getEordLicenseNo() {
		return eordLicenseNo;
	}

	/**
	 * Set eordLicenseNo
	 */
	public void setEordLicenseNo(String eordLicenseNo) {
		this.eordLicenseNo = eordLicenseNo;
		addValidField("eordLicenseNo");
	}

	/**
	 * Get eordApprovalNo
	 */
	@Column(name = "EORD_APPROVAL_NO")
	public String getEordApprovalNo() {
		return eordApprovalNo;
	}

	/**
	 * Set eordApprovalNo
	 */
	public void setEordApprovalNo(String eordApprovalNo) {
		this.eordApprovalNo = eordApprovalNo;
		addValidField("eordApprovalNo");
	}

	/**
	 * Get eordTransportType
	 */
	@Column(name = "EORD_TRANSPORT_TYPE")
	public String getEordTransportType() {
		return eordTransportType;
	}

	/**
	 * Set eordTransportType
	 */
	public void setEordTransportType(String eordTransportType) {
		this.eordTransportType = eordTransportType;
		addValidField("eordTransportType");
	}

	/**
	 * Get eordTransportName
	 */
	@Column(name = "EORD_TRANSPORT_NAME")
	public String getEordTransportName() {
		return eordTransportName;
	}

	/**
	 * Set eordTransportName
	 */
	public void setEordTransportName(String eordTransportName) {
		this.eordTransportName = eordTransportName;
		addValidField("eordTransportName");
	}

	/**
	 * Get eordPackageType
	 */
	@Column(name = "EORD_PACKAGE_TYPE")
	public String getEordPackageType() {
		return eordPackageType;
	}

	/**
	 * Set eordPackageType
	 */
	public void setEordPackageType(String eordPackageType) {
		this.eordPackageType = eordPackageType;
		addValidField("eordPackageType");
	}

	/**
	 * Get eordSupervisionType
	 */
	@Column(name = "EORD_SUPERVISION_TYPE")
	public String getEordSupervisionType() {
		return eordSupervisionType;
	}

	/**
	 * Set eordSupervisionType
	 */
	public void setEordSupervisionType(String eordSupervisionType) {
		this.eordSupervisionType = eordSupervisionType;
		addValidField("eordSupervisionType");
	}

	/**
	 * Get eordExemptionType
	 */
	@Column(name = "EORD_EXEMPTION_TYPE")
	public String getEordExemptionType() {
		return eordExemptionType;
	}

	/**
	 * Set eordExemptionType
	 */
	public void setEordExemptionType(String eordExemptionType) {
		this.eordExemptionType = eordExemptionType;
		addValidField("eordExemptionType");
	}

	/**
	 * Get eordExchangeType
	 */
	@Column(name = "EORD_EXCHANGE_TYPE")
	public String getEordExchangeType() {
		return eordExchangeType;
	}

	/**
	 * Set eordExchangeType
	 */
	public void setEordExchangeType(String eordExchangeType) {
		this.eordExchangeType = eordExchangeType;
		addValidField("eordExchangeType");
	}

	/**
	 * Get eordDealType
	 */
	@Column(name = "EORD_DEAL_TYPE")
	public String getEordDealType() {
		return eordDealType;
	}

	/**
	 * Set eordDealType
	 */
	public void setEordDealType(String eordDealType) {
		this.eordDealType = eordDealType;
		addValidField("eordDealType");
	}

	/**
	 * Get eordPortCode
	 */
	@Column(name = "EORD_PORT_CODE")
	public String getEordPortCode() {
		return eordPortCode;
	}

	/**
	 * Set eordPortCode
	 */
	public void setEordPortCode(String eordPortCode) {
		this.eordPortCode = eordPortCode;
		addValidField("eordPortCode");
	}

	/**
	 * Get eordLoadEbptId
	 */
	@Column(name = "EORD_LOAD_EBPT_ID")
	public Long getEordLoadEbptId() {
		return eordLoadEbptId;
	}

	/**
	 * Set eordLoadEbptId
	 */
	public void setEordLoadEbptId(Long eordLoadEbptId) {
		this.eordLoadEbptId = eordLoadEbptId;
		addValidField("eordLoadEbptId");
	}

	/**
	 * Get eordLoadEbptCode
	 */
	@Column(name = "EORD_LOAD_EBPT_CODE")
	public String getEordLoadEbptCode() {
		return eordLoadEbptCode;
	}

	/**
	 * Set eordLoadEbptCode
	 */
	public void setEordLoadEbptCode(String eordLoadEbptCode) {
		this.eordLoadEbptCode = eordLoadEbptCode;
		addValidField("eordLoadEbptCode");
	}

	/**
	 * Get eordLoadEbptName
	 */
	@Column(name = "EORD_LOAD_EBPT_NAME")
	public String getEordLoadEbptName() {
		return eordLoadEbptName;
	}

	/**
	 * Set eordLoadEbptName
	 */
	public void setEordLoadEbptName(String eordLoadEbptName) {
		this.eordLoadEbptName = eordLoadEbptName;
		addValidField("eordLoadEbptName");
	}

	/**
	 * Get eordFreightType
	 */
	@Column(name = "EORD_FREIGHT_TYPE")
	public String getEordFreightType() {
		return eordFreightType;
	}

	/**
	 * Set eordFreightType
	 */
	public void setEordFreightType(String eordFreightType) {
		this.eordFreightType = eordFreightType;
		addValidField("eordFreightType");
	}

	/**
	 * Get eordFreight
	 */
	@Column(name = "EORD_FREIGHT")
	public Long getEordFreight() {
		return eordFreight;
	}

	/**
	 * Set eordFreight
	 */
	public void setEordFreight(Long eordFreight) {
		this.eordFreight = eordFreight;
		addValidField("eordFreight");
	}

	/**
	 * Get eordFreightCurrency
	 */
	@Column(name = "EORD_FREIGHT_CURRENCY")
	public String getEordFreightCurrency() {
		return eordFreightCurrency;
	}

	/**
	 * Set eordFreightCurrency
	 */
	public void setEordFreightCurrency(String eordFreightCurrency) {
		this.eordFreightCurrency = eordFreightCurrency;
		addValidField("eordFreightCurrency");
	}

	/**
	 * Get eordInsuranceType
	 */
	@Column(name = "EORD_INSURANCE_TYPE")
	public String getEordInsuranceType() {
		return eordInsuranceType;
	}

	/**
	 * Set eordInsuranceType
	 */
	public void setEordInsuranceType(String eordInsuranceType) {
		this.eordInsuranceType = eordInsuranceType;
		addValidField("eordInsuranceType");
	}

	/**
	 * Get eordInsurance
	 */
	@Column(name = "EORD_INSURANCE")
	public Long getEordInsurance() {
		return eordInsurance;
	}

	/**
	 * Set eordInsurance
	 */
	public void setEordInsurance(Long eordInsurance) {
		this.eordInsurance = eordInsurance;
		addValidField("eordInsurance");
	}

	/**
	 * Get eordIncidentalType
	 */
	@Column(name = "EORD_INCIDENTAL_TYPE")
	public String getEordIncidentalType() {
		return eordIncidentalType;
	}

	/**
	 * Set eordIncidentalType
	 */
	public void setEordIncidentalType(String eordIncidentalType) {
		this.eordIncidentalType = eordIncidentalType;
		addValidField("eordIncidentalType");
	}

	/**
	 * Get eordInsuranceCurrency
	 */
	@Column(name = "EORD_INSURANCE_CURRENCY")
	public String getEordInsuranceCurrency() {
		return eordInsuranceCurrency;
	}

	/**
	 * Set eordInsuranceCurrency
	 */
	public void setEordInsuranceCurrency(String eordInsuranceCurrency) {
		this.eordInsuranceCurrency = eordInsuranceCurrency;
		addValidField("eordInsuranceCurrency");
	}

	/**
	 * Get eordIncidental
	 */
	@Column(name = "EORD_INCIDENTAL")
	public Long getEordIncidental() {
		return eordIncidental;
	}

	/**
	 * Set eordIncidental
	 */
	public void setEordIncidental(Long eordIncidental) {
		this.eordIncidental = eordIncidental;
		addValidField("eordIncidental");
	}

	/**
	 * Get eordQuantity
	 */
	@Column(name = "EORD_QUANTITY")
	public Long getEordQuantity() {
		return eordQuantity;
	}

	/**
	 * Set eordQuantity
	 */
	public void setEordQuantity(Long eordQuantity) {
		this.eordQuantity = eordQuantity;
		addValidField("eordQuantity");
	}

	/**
	 * Get eordVolume
	 */
	@Column(name = "EORD_VOLUME")
	public Long getEordVolume() {
		return eordVolume;
	}

	/**
	 * Set eordVolume
	 */
	public void setEordVolume(Long eordVolume) {
		this.eordVolume = eordVolume;
		addValidField("eordVolume");
	}

	/**
	 * Get eordIncidentalCurrency
	 */
	@Column(name = "EORD_INCIDENTAL_CURRENCY")
	public String getEordIncidentalCurrency() {
		return eordIncidentalCurrency;
	}

	/**
	 * Set eordIncidentalCurrency
	 */
	public void setEordIncidentalCurrency(String eordIncidentalCurrency) {
		this.eordIncidentalCurrency = eordIncidentalCurrency;
		addValidField("eordIncidentalCurrency");
	}

	/**
	 * Get eordGw
	 */
	@Column(name = "EORD_GW")
	public Long getEordGw() {
		return eordGw;
	}

	/**
	 * Set eordGw
	 */
	public void setEordGw(Long eordGw) {
		this.eordGw = eordGw;
		addValidField("eordGw");
	}

	/**
	 * Get eordNw
	 */
	@Column(name = "EORD_NW")
	public Long getEordNw() {
		return eordNw;
	}

	/**
	 * Set eordNw
	 */
	public void setEordNw(Long eordNw) {
		this.eordNw = eordNw;
		addValidField("eordNw");
	}

	/**
	 * Get eordRegulatoryPositionNo
	 */
	@Column(name = "EORD_REGULATORY_POSITION_NO")
	public String getEordRegulatoryPositionNo() {
		return eordRegulatoryPositionNo;
	}

	/**
	 * Set eordRegulatoryPositionNo
	 */
	public void setEordRegulatoryPositionNo(String eordRegulatoryPositionNo) {
		this.eordRegulatoryPositionNo = eordRegulatoryPositionNo;
		addValidField("eordRegulatoryPositionNo");
	}

	/**
	 * Get eordFreightYardCode
	 */
	@Column(name = "EORD_FREIGHT_YARD_CODE")
	public String getEordFreightYardCode() {
		return eordFreightYardCode;
	}

	/**
	 * Set eordFreightYardCode
	 */
	public void setEordFreightYardCode(String eordFreightYardCode) {
		this.eordFreightYardCode = eordFreightYardCode;
		addValidField("eordFreightYardCode");
	}

	/**
	 * Get eordDeclarationContact
	 */
	@Column(name = "EORD_DECLARATION_CONTACT")
	public String getEordDeclarationContact() {
		return eordDeclarationContact;
	}

	/**
	 * Set eordDeclarationContact
	 */
	public void setEordDeclarationContact(String eordDeclarationContact) {
		this.eordDeclarationContact = eordDeclarationContact;
		addValidField("eordDeclarationContact");
	}

	/**
	 * Get eordDeclarationNo
	 */
	@Column(name = "EORD_DECLARATION_NO")
	public String getEordDeclarationNo() {
		return eordDeclarationNo;
	}

	/**
	 * Set eordDeclarationNo
	 */
	public void setEordDeclarationNo(String eordDeclarationNo) {
		this.eordDeclarationNo = eordDeclarationNo;
		addValidField("eordDeclarationNo");
	}

	/**
	 * Get eordAssBillNo
	 */
	@Column(name = "EORD_ASS_BILL_NO")
	public String getEordAssBillNo() {
		return eordAssBillNo;
	}

	/**
	 * Set eordAssBillNo
	 */
	public void setEordAssBillNo(String eordAssBillNo) {
		this.eordAssBillNo = eordAssBillNo;
		addValidField("eordAssBillNo");
	}

	/**
	 * Get eordAssEmsNo
	 */
	@Column(name = "EORD_ASS_EMS_NO")
	public String getEordAssEmsNo() {
		return eordAssEmsNo;
	}

	/**
	 * Set eordAssEmsNo
	 */
	public void setEordAssEmsNo(String eordAssEmsNo) {
		this.eordAssEmsNo = eordAssEmsNo;
		addValidField("eordAssEmsNo");
	}

	/**
	 * Get eordVoyageNo
	 */
	@Column(name = "EORD_VOYAGE_NO")
	public String getEordVoyageNo() {
		return eordVoyageNo;
	}

	/**
	 * Set eordVoyageNo
	 */
	public void setEordVoyageNo(String eordVoyageNo) {
		this.eordVoyageNo = eordVoyageNo;
		addValidField("eordVoyageNo");
	}

	/**
	 * Get eordSubstr1
	 */
	@Column(name = "EORD_SUBSTR1")
	public String getEordSubstr1() {
		return eordSubstr1;
	}

	/**
	 * Set eordSubstr1
	 */
	public void setEordSubstr1(String eordSubstr1) {
		this.eordSubstr1 = eordSubstr1;
		addValidField("eordSubstr1");
	}

	/**
	 * Get eordSubstr2
	 */
	@Column(name = "EORD_SUBSTR2")
	public String getEordSubstr2() {
		return eordSubstr2;
	}

	/**
	 * Set eordSubstr2
	 */
	public void setEordSubstr2(String eordSubstr2) {
		this.eordSubstr2 = eordSubstr2;
		addValidField("eordSubstr2");
	}

	/**
	 * Get eordSubstr3
	 */
	@Column(name = "EORD_SUBSTR3")
	public String getEordSubstr3() {
		return eordSubstr3;
	}

	/**
	 * Set eordSubstr3
	 */
	public void setEordSubstr3(String eordSubstr3) {
		this.eordSubstr3 = eordSubstr3;
		addValidField("eordSubstr3");
	}

	/**
	 * Get eordSubstr4
	 */
	@Column(name = "EORD_SUBSTR4")
	public String getEordSubstr4() {
		return eordSubstr4;
	}

	/**
	 * Set eordSubstr4
	 */
	public void setEordSubstr4(String eordSubstr4) {
		this.eordSubstr4 = eordSubstr4;
		addValidField("eordSubstr4");
	}

	/**
	 * Get eordSubstr5
	 */
	@Column(name = "EORD_SUBSTR5")
	public String getEordSubstr5() {
		return eordSubstr5;
	}

	/**
	 * Set eordSubstr5
	 */
	public void setEordSubstr5(String eordSubstr5) {
		this.eordSubstr5 = eordSubstr5;
		addValidField("eordSubstr5");
	}

	/**
	 * Get eordSubstr6
	 */
	@Column(name = "EORD_SUBSTR6")
	public String getEordSubstr6() {
		return eordSubstr6;
	}

	/**
	 * Set eordSubstr6
	 */
	public void setEordSubstr6(String eordSubstr6) {
		this.eordSubstr6 = eordSubstr6;
		addValidField("eordSubstr6");
	}

	/**
	 * Get eordSubstr7
	 */
	@Column(name = "EORD_SUBSTR7")
	public String getEordSubstr7() {
		return eordSubstr7;
	}

	/**
	 * Set eordSubstr7
	 */
	public void setEordSubstr7(String eordSubstr7) {
		this.eordSubstr7 = eordSubstr7;
		addValidField("eordSubstr7");
	}

	/**
	 * Get eordSubstr8
	 */
	@Column(name = "EORD_SUBSTR8")
	public String getEordSubstr8() {
		return eordSubstr8;
	}

	/**
	 * Set eordSubstr8
	 */
	public void setEordSubstr8(String eordSubstr8) {
		this.eordSubstr8 = eordSubstr8;
		addValidField("eordSubstr8");
	}

	/**
	 * Get eordSubstr9
	 */
	@Column(name = "EORD_SUBSTR9")
	public String getEordSubstr9() {
		return eordSubstr9;
	}

	/**
	 * Set eordSubstr9
	 */
	public void setEordSubstr9(String eordSubstr9) {
		this.eordSubstr9 = eordSubstr9;
		addValidField("eordSubstr9");
	}

	/**
	 * Get eordSubstr10
	 */
	@Column(name = "EORD_SUBSTR10")
	public String getEordSubstr10() {
		return eordSubstr10;
	}

	/**
	 * Set eordSubstr10
	 */
	public void setEordSubstr10(String eordSubstr10) {
		this.eordSubstr10 = eordSubstr10;
		addValidField("eordSubstr10");
	}

	/**
	 * Get eordSubstr11
	 */
	@Column(name = "EORD_SUBSTR11")
	public String getEordSubstr11() {
		return eordSubstr11;
	}

	/**
	 * Set eordSubstr11
	 */
	public void setEordSubstr11(String eordSubstr11) {
		this.eordSubstr11 = eordSubstr11;
		addValidField("eordSubstr11");
	}

	/**
	 * Get eordSubstr12
	 */
	@Column(name = "EORD_SUBSTR12")
	public String getEordSubstr12() {
		return eordSubstr12;
	}

	/**
	 * Set eordSubstr12
	 */
	public void setEordSubstr12(String eordSubstr12) {
		this.eordSubstr12 = eordSubstr12;
		addValidField("eordSubstr12");
	}

	/**
	 * Get eordSubstr13
	 */
	@Column(name = "EORD_SUBSTR13")
	public String getEordSubstr13() {
		return eordSubstr13;
	}

	/**
	 * Set eordSubstr13
	 */
	public void setEordSubstr13(String eordSubstr13) {
		this.eordSubstr13 = eordSubstr13;
		addValidField("eordSubstr13");
	}

	/**
	 * Get eordSubstr14
	 */
	@Column(name = "EORD_SUBSTR14")
	public String getEordSubstr14() {
		return eordSubstr14;
	}

	/**
	 * Set eordSubstr14
	 */
	public void setEordSubstr14(String eordSubstr14) {
		this.eordSubstr14 = eordSubstr14;
		addValidField("eordSubstr14");
	}

	/**
	 * Get eordSubstr15
	 */
	@Column(name = "EORD_SUBSTR15")
	public String getEordSubstr15() {
		return eordSubstr15;
	}

	/**
	 * Set eordSubstr15
	 */
	public void setEordSubstr15(String eordSubstr15) {
		this.eordSubstr15 = eordSubstr15;
		addValidField("eordSubstr15");
	}

	/**
	 * Get eordSubstr16
	 */
	@Column(name = "EORD_SUBSTR16")
	public String getEordSubstr16() {
		return eordSubstr16;
	}

	/**
	 * Set eordSubstr16
	 */
	public void setEordSubstr16(String eordSubstr16) {
		this.eordSubstr16 = eordSubstr16;
		addValidField("eordSubstr16");
	}

	/**
	 * Get eordSubstr17
	 */
	@Column(name = "EORD_SUBSTR17")
	public String getEordSubstr17() {
		return eordSubstr17;
	}

	/**
	 * Set eordSubstr17
	 */
	public void setEordSubstr17(String eordSubstr17) {
		this.eordSubstr17 = eordSubstr17;
		addValidField("eordSubstr17");
	}

	/**
	 * Get eordSubstr18
	 */
	@Column(name = "EORD_SUBSTR18")
	public String getEordSubstr18() {
		return eordSubstr18;
	}

	/**
	 * Set eordSubstr18
	 */
	public void setEordSubstr18(String eordSubstr18) {
		this.eordSubstr18 = eordSubstr18;
		addValidField("eordSubstr18");
	}

	/**
	 * Get eordSubstr19
	 */
	@Column(name = "EORD_SUBSTR19")
	public String getEordSubstr19() {
		return eordSubstr19;
	}

	/**
	 * Set eordSubstr19
	 */
	public void setEordSubstr19(String eordSubstr19) {
		this.eordSubstr19 = eordSubstr19;
		addValidField("eordSubstr19");
	}

	/**
	 * Get eordSubstr20
	 */
	@Column(name = "EORD_SUBSTR20")
	public String getEordSubstr20() {
		return eordSubstr20;
	}

	/**
	 * Set eordSubstr20
	 */
	public void setEordSubstr20(String eordSubstr20) {
		this.eordSubstr20 = eordSubstr20;
		addValidField("eordSubstr20");
	}

	/**
	 * Get eordSubstr21
	 */
	@Column(name = "EORD_SUBSTR21")
	public String getEordSubstr21() {
		return eordSubstr21;
	}

	/**
	 * Set eordSubstr21
	 */
	public void setEordSubstr21(String eordSubstr21) {
		this.eordSubstr21 = eordSubstr21;
		addValidField("eordSubstr21");
	}

	/**
	 * Get eordSubstr22
	 */
	@Column(name = "EORD_SUBSTR22")
	public String getEordSubstr22() {
		return eordSubstr22;
	}

	/**
	 * Set eordSubstr22
	 */
	public void setEordSubstr22(String eordSubstr22) {
		this.eordSubstr22 = eordSubstr22;
		addValidField("eordSubstr22");
	}

	/**
	 * Get eordSubstr23
	 */
	@Column(name = "EORD_SUBSTR23")
	public String getEordSubstr23() {
		return eordSubstr23;
	}

	/**
	 * Set eordSubstr23
	 */
	public void setEordSubstr23(String eordSubstr23) {
		this.eordSubstr23 = eordSubstr23;
		addValidField("eordSubstr23");
	}

	/**
	 * Get eordSubstr24
	 */
	@Column(name = "EORD_SUBSTR24")
	public String getEordSubstr24() {
		return eordSubstr24;
	}

	/**
	 * Set eordSubstr24
	 */
	public void setEordSubstr24(String eordSubstr24) {
		this.eordSubstr24 = eordSubstr24;
		addValidField("eordSubstr24");
	}

	/**
	 * Get eordSubstr25
	 */
	@Column(name = "EORD_SUBSTR25")
	public String getEordSubstr25() {
		return eordSubstr25;
	}

	/**
	 * Set eordSubstr25
	 */
	public void setEordSubstr25(String eordSubstr25) {
		this.eordSubstr25 = eordSubstr25;
		addValidField("eordSubstr25");
	}

	/**
	 * Get eordSubdate1
	 */
	@Column(name = "EORD_SUBDATE1")
	public Date getEordSubdate1() {
		return eordSubdate1;
	}

	/**
	 * Set eordSubdate1
	 */
	public void setEordSubdate1(Date eordSubdate1) {
		this.eordSubdate1 = eordSubdate1;
		addValidField("eordSubdate1");
	}

	/**
	 * Get eordSubdate2
	 */
	@Column(name = "EORD_SUBDATE2")
	public Date getEordSubdate2() {
		return eordSubdate2;
	}

	/**
	 * Set eordSubdate2
	 */
	public void setEordSubdate2(Date eordSubdate2) {
		this.eordSubdate2 = eordSubdate2;
		addValidField("eordSubdate2");
	}

	/**
	 * Get eordSubdate3
	 */
	@Column(name = "EORD_SUBDATE3")
	public Date getEordSubdate3() {
		return eordSubdate3;
	}

	/**
	 * Set eordSubdate3
	 */
	public void setEordSubdate3(Date eordSubdate3) {
		this.eordSubdate3 = eordSubdate3;
		addValidField("eordSubdate3");
	}

	/**
	 * Get eordSubdate4
	 */
	@Column(name = "EORD_SUBDATE4")
	public Date getEordSubdate4() {
		return eordSubdate4;
	}

	/**
	 * Set eordSubdate4
	 */
	public void setEordSubdate4(Date eordSubdate4) {
		this.eordSubdate4 = eordSubdate4;
		addValidField("eordSubdate4");
	}

	/**
	 * Get eordSubdate5
	 */
	@Column(name = "EORD_SUBDATE5")
	public Date getEordSubdate5() {
		return eordSubdate5;
	}

	/**
	 * Set eordSubdate5
	 */
	public void setEordSubdate5(Date eordSubdate5) {
		this.eordSubdate5 = eordSubdate5;
		addValidField("eordSubdate5");
	}

	/**
	 * Get eordSubdate6
	 */
	@Column(name = "EORD_SUBDATE6")
	public Date getEordSubdate6() {
		return eordSubdate6;
	}

	/**
	 * Set eordSubdate6
	 */
	public void setEordSubdate6(Date eordSubdate6) {
		this.eordSubdate6 = eordSubdate6;
		addValidField("eordSubdate6");
	}

	/**
	 * Get eordSubnum1
	 */
	@Column(name = "EORD_SUBNUM1")
	public Long getEordSubnum1() {
		return eordSubnum1;
	}

	/**
	 * Set eordSubnum1
	 */
	public void setEordSubnum1(Long eordSubnum1) {
		this.eordSubnum1 = eordSubnum1;
		addValidField("eordSubnum1");
	}

	/**
	 * Get eordSubnum2
	 */
	@Column(name = "EORD_SUBNUM2")
	public Long getEordSubnum2() {
		return eordSubnum2;
	}

	/**
	 * Set eordSubnum2
	 */
	public void setEordSubnum2(Long eordSubnum2) {
		this.eordSubnum2 = eordSubnum2;
		addValidField("eordSubnum2");
	}

	/**
	 * Get eordSubnum3
	 */
	@Column(name = "EORD_SUBNUM3")
	public Long getEordSubnum3() {
		return eordSubnum3;
	}

	/**
	 * Set eordSubnum3
	 */
	public void setEordSubnum3(Long eordSubnum3) {
		this.eordSubnum3 = eordSubnum3;
		addValidField("eordSubnum3");
	}

	/**
	 * Get eordSubnum4
	 */
	@Column(name = "EORD_SUBNUM4")
	public Long getEordSubnum4() {
		return eordSubnum4;
	}

	/**
	 * Set eordSubnum4
	 */
	public void setEordSubnum4(Long eordSubnum4) {
		this.eordSubnum4 = eordSubnum4;
		addValidField("eordSubnum4");
	}

	/**
	 * Get eordSubnum5
	 */
	@Column(name = "EORD_SUBNUM5")
	public Long getEordSubnum5() {
		return eordSubnum5;
	}

	/**
	 * Set eordSubnum5
	 */
	public void setEordSubnum5(Long eordSubnum5) {
		this.eordSubnum5 = eordSubnum5;
		addValidField("eordSubnum5");
	}

	/**
	 * Get eordSubnum6
	 */
	@Column(name = "EORD_SUBNUM6")
	public Long getEordSubnum6() {
		return eordSubnum6;
	}

	/**
	 * Set eordSubnum6
	 */
	public void setEordSubnum6(Long eordSubnum6) {
		this.eordSubnum6 = eordSubnum6;
		addValidField("eordSubnum6");
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
	 * Get eordTradeCountry
	 */
	@Column(name = "EORD_TRADE_COUNTRY")
	public String getEordTradeCountry() {
		return eordTradeCountry;
	}

	/**
	 * Set eordTradeCountry
	 */
	public void setEordTradeCountry(String eordTradeCountry) {
		this.eordTradeCountry = eordTradeCountry;
		addValidField("eordTradeCountry");
	}

	/**
	 * Get eordTradeCountryName
	 */
	@Column(name = "EORD_TRADE_COUNTRY_NAME")
	public String getEordTradeCountryName() {
		return eordTradeCountryName;
	}

	/**
	 * Set eordTradeCountryName
	 */
	public void setEordTradeCountryName(String eordTradeCountryName) {
		this.eordTradeCountryName = eordTradeCountryName;
		addValidField("eordTradeCountryName");
	}

	/**
	 * Get eordArriveCode
	 */
	@Column(name = "EORD_ARRIVE_CODE")
	public String getEordArriveCode() {
		return eordArriveCode;
	}

	/**
	 * Set eordArriveCode
	 */
	public void setEordArriveCode(String eordArriveCode) {
		this.eordArriveCode = eordArriveCode;
		addValidField("eordArriveCode");
	}

	/**
	 * Get eordArriveName
	 */
	@Column(name = "EORD_ARRIVE_NAME")
	public String getEordArriveName() {
		return eordArriveName;
	}

	/**
	 * Set eordArriveName
	 */
	public void setEordArriveName(String eordArriveName) {
		this.eordArriveName = eordArriveName;
		addValidField("eordArriveName");
	}

	/**
	 * Get eordCustomsNo
	 */
	@Column(name = "EORD_CUSTOMS_NO")
	public String getEordCustomsNo() {
		return eordCustomsNo;
	}

	/**
	 * Set eordCustomsNo
	 */
	public void setEordCustomsNo(String eordCustomsNo) {
		this.eordCustomsNo = eordCustomsNo;
		addValidField("eordCustomsNo");
	}

	/**
	 * Get eordIntegrateNo
	 */
	@Column(name = "EORD_INTEGRATE_NO")
	public String getEordIntegrateNo() {
		return eordIntegrateNo;
	}

	/**
	 * Set eordIntegrateNo
	 */
	public void setEordIntegrateNo(String eordIntegrateNo) {
		this.eordIntegrateNo = eordIntegrateNo;
		addValidField("eordIntegrateNo");
	}

}
