package com.sinotrans.oms.contract.model;

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
 * Model class for ElContract
 */
@Entity
@Table(name = "EL_CONTRACT")
public class ElContractModel extends BaseModel implements OperationLog {

	//elctId
	private Long elctId;
	//elctContractNumber
	private String elctContractNumber;
	//elctContractNo
	private String elctContractNo;
	//elctContractUnit
	private String elctContractUnit;
	//elctContractDate
	private Date elctContractDate;
	//elctOperatorEbcuName
	private String elctOperatorEbcuName;
	//elctContractName
	private String elctContractName;
	//elctTermDateFrom
	private Date elctTermDateFrom;
	//elctTermDateTo
	private Date elctTermDateTo;
	//elctEbpjId
	private Long elctEbpjId;
	//elctEbpjName
	private String elctEbpjName;
	//elctCustomEbcuId
	private Long elctCustomEbcuId;
	//elctCustomEbcuName
	private String elctCustomEbcuName;
	//elctRemarks
	private String elctRemarks;
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
	//elctSubstr1
	private String elctSubstr1;
	//elctSubstr2
	private String elctSubstr2;
	//elctSubdate1
	private Date elctSubdate1;
	//elctSubdate2
	private Date elctSubdate2;
	//elctSubnum1
	private Long elctSubnum1;
	//elctSubnum2
	private Long elctSubnum2;
	//elctEbpjCode
	private String elctEbpjCode;
	//elctCustomEbcuCode
	private String elctCustomEbcuCode;
	//elctEscoId
	private Long elctEscoId;
	//elctEscoName
	private String elctEscoName;
	//elctStatus
	private String elctStatus;
	//elctConsignorEbcuId
	private Long elctConsignorEbcuId;
	//elctConsignorEbcuName
	private String elctConsignorEbcuName;
	//elctConsignorEbcuCode
	private String elctConsignorEbcuCode;
	//elctPaymentMode
	private String elctPaymentMode;
	//elctSettlementMode
	private String elctSettlementMode;
	//elctCustomerAgentEbcuName
	private String elctCustomerAgentEbcuName;

	/**
	 * Get elctId
	 */
	@Column(name = "ELCT_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getElctId() {
		return elctId;
	}

	/**
	 * Set elctId
	 */
	public void setElctId(Long elctId) {
		this.elctId = elctId;
		addValidField("elctId");
	}

	/**
	 * Get elctContractNumber
	 */
	@Column(name = "ELCT_CONTRACT_NUMBER")
	public String getElctContractNumber() {
		return elctContractNumber;
	}

	/**
	 * Set elctContractNumber
	 */
	public void setElctContractNumber(String elctContractNumber) {
		this.elctContractNumber = elctContractNumber;
		addValidField("elctContractNumber");
	}

	/**
	 * Get elctContractNo
	 */
	@Column(name = "ELCT_CONTRACT_NO")
	public String getElctContractNo() {
		return elctContractNo;
	}

	/**
	 * Set elctContractNo
	 */
	public void setElctContractNo(String elctContractNo) {
		this.elctContractNo = elctContractNo;
		addValidField("elctContractNo");
	}

	/**
	 * Get elctContractUnit
	 */
	@Column(name = "ELCT_CONTRACT_UNIT")
	public String getElctContractUnit() {
		return elctContractUnit;
	}

	/**
	 * Set elctContractUnit
	 */
	public void setElctContractUnit(String elctContractUnit) {
		this.elctContractUnit = elctContractUnit;
		addValidField("elctContractUnit");
	}

	/**
	 * Get elctContractDate
	 */
	@Column(name = "ELCT_CONTRACT_DATE")
	public Date getElctContractDate() {
		return elctContractDate;
	}

	/**
	 * Set elctContractDate
	 */
	public void setElctContractDate(Date elctContractDate) {
		this.elctContractDate = elctContractDate;
		addValidField("elctContractDate");
	}

	/**
	 * Get elctOperatorEbcuName
	 */
	@Column(name = "ELCT_OPERATOR_EBCU_NAME")
	public String getElctOperatorEbcuName() {
		return elctOperatorEbcuName;
	}

	/**
	 * Set elctOperatorEbcuName
	 */
	public void setElctOperatorEbcuName(String elctOperatorEbcuName) {
		this.elctOperatorEbcuName = elctOperatorEbcuName;
		addValidField("elctOperatorEbcuName");
	}

	/**
	 * Get elctContractName
	 */
	@Column(name = "ELCT_CONTRACT_NAME")
	public String getElctContractName() {
		return elctContractName;
	}

	/**
	 * Set elctContractName
	 */
	public void setElctContractName(String elctContractName) {
		this.elctContractName = elctContractName;
		addValidField("elctContractName");
	}

	/**
	 * Get elctTermDateFrom
	 */
	@Column(name = "ELCT_TERM_DATE_FROM")
	public Date getElctTermDateFrom() {
		return elctTermDateFrom;
	}

	/**
	 * Set elctTermDateFrom
	 */
	public void setElctTermDateFrom(Date elctTermDateFrom) {
		this.elctTermDateFrom = elctTermDateFrom;
		addValidField("elctTermDateFrom");
	}

	/**
	 * Get elctTermDateTo
	 */
	@Column(name = "ELCT_TERM_DATE_TO")
	public Date getElctTermDateTo() {
		return elctTermDateTo;
	}

	/**
	 * Set elctTermDateTo
	 */
	public void setElctTermDateTo(Date elctTermDateTo) {
		this.elctTermDateTo = elctTermDateTo;
		addValidField("elctTermDateTo");
	}

	/**
	 * Get elctEbpjId
	 */
	@Column(name = "ELCT_EBPJ_ID")
	public Long getElctEbpjId() {
		return elctEbpjId;
	}

	/**
	 * Set elctEbpjId
	 */
	public void setElctEbpjId(Long elctEbpjId) {
		this.elctEbpjId = elctEbpjId;
		addValidField("elctEbpjId");
	}

	/**
	 * Get elctEbpjName
	 */
	@Column(name = "ELCT_EBPJ_NAME")
	public String getElctEbpjName() {
		return elctEbpjName;
	}

	/**
	 * Set elctEbpjName
	 */
	public void setElctEbpjName(String elctEbpjName) {
		this.elctEbpjName = elctEbpjName;
		addValidField("elctEbpjName");
	}

	/**
	 * Get elctCustomEbcuId
	 */
	@Column(name = "ELCT_CUSTOM_EBCU_ID")
	public Long getElctCustomEbcuId() {
		return elctCustomEbcuId;
	}

	/**
	 * Set elctCustomEbcuId
	 */
	public void setElctCustomEbcuId(Long elctCustomEbcuId) {
		this.elctCustomEbcuId = elctCustomEbcuId;
		addValidField("elctCustomEbcuId");
	}

	/**
	 * Get elctCustomEbcuName
	 */
	@Column(name = "ELCT_CUSTOM_EBCU_NAME")
	public String getElctCustomEbcuName() {
		return elctCustomEbcuName;
	}

	/**
	 * Set elctCustomEbcuName
	 */
	public void setElctCustomEbcuName(String elctCustomEbcuName) {
		this.elctCustomEbcuName = elctCustomEbcuName;
		addValidField("elctCustomEbcuName");
	}

	/**
	 * Get elctRemarks
	 */
	@Column(name = "ELCT_REMARKS")
	public String getElctRemarks() {
		return elctRemarks;
	}

	/**
	 * Set elctRemarks
	 */
	public void setElctRemarks(String elctRemarks) {
		this.elctRemarks = elctRemarks;
		addValidField("elctRemarks");
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
	 * Get elctSubstr1
	 */
	@Column(name = "ELCT_SUBSTR1")
	public String getElctSubstr1() {
		return elctSubstr1;
	}

	/**
	 * Set elctSubstr1
	 */
	public void setElctSubstr1(String elctSubstr1) {
		this.elctSubstr1 = elctSubstr1;
		addValidField("elctSubstr1");
	}

	/**
	 * Get elctSubstr2
	 */
	@Column(name = "ELCT_SUBSTR2")
	public String getElctSubstr2() {
		return elctSubstr2;
	}

	/**
	 * Set elctSubstr2
	 */
	public void setElctSubstr2(String elctSubstr2) {
		this.elctSubstr2 = elctSubstr2;
		addValidField("elctSubstr2");
	}

	/**
	 * Get elctSubdate1
	 */
	@Column(name = "ELCT_SUBDATE1")
	public Date getElctSubdate1() {
		return elctSubdate1;
	}

	/**
	 * Set elctSubdate1
	 */
	public void setElctSubdate1(Date elctSubdate1) {
		this.elctSubdate1 = elctSubdate1;
		addValidField("elctSubdate1");
	}

	/**
	 * Get elctSubdate2
	 */
	@Column(name = "ELCT_SUBDATE2")
	public Date getElctSubdate2() {
		return elctSubdate2;
	}

	/**
	 * Set elctSubdate2
	 */
	public void setElctSubdate2(Date elctSubdate2) {
		this.elctSubdate2 = elctSubdate2;
		addValidField("elctSubdate2");
	}

	/**
	 * Get elctSubnum1
	 */
	@Column(name = "ELCT_SUBNUM1")
	public Long getElctSubnum1() {
		return elctSubnum1;
	}

	/**
	 * Set elctSubnum1
	 */
	public void setElctSubnum1(Long elctSubnum1) {
		this.elctSubnum1 = elctSubnum1;
		addValidField("elctSubnum1");
	}

	/**
	 * Get elctSubnum2
	 */
	@Column(name = "ELCT_SUBNUM2")
	public Long getElctSubnum2() {
		return elctSubnum2;
	}

	/**
	 * Set elctSubnum2
	 */
	public void setElctSubnum2(Long elctSubnum2) {
		this.elctSubnum2 = elctSubnum2;
		addValidField("elctSubnum2");
	}

	/**
	 * Get elctEbpjCode
	 */
	@Column(name = "ELCT_EBPJ_CODE")
	public String getElctEbpjCode() {
		return elctEbpjCode;
	}

	/**
	 * Set elctEbpjCode
	 */
	public void setElctEbpjCode(String elctEbpjCode) {
		this.elctEbpjCode = elctEbpjCode;
		addValidField("elctEbpjCode");
	}

	/**
	 * Get elctCustomEbcuCode
	 */
	@Column(name = "ELCT_CUSTOM_EBCU_CODE")
	public String getElctCustomEbcuCode() {
		return elctCustomEbcuCode;
	}

	/**
	 * Set elctCustomEbcuCode
	 */
	public void setElctCustomEbcuCode(String elctCustomEbcuCode) {
		this.elctCustomEbcuCode = elctCustomEbcuCode;
		addValidField("elctCustomEbcuCode");
	}

	/**
	 * Get elctEscoId
	 */
	@Column(name = "ELCT_ESCO_ID")
	public Long getElctEscoId() {
		return elctEscoId;
	}

	/**
	 * Set elctEscoId
	 */
	public void setElctEscoId(Long elctEscoId) {
		this.elctEscoId = elctEscoId;
		addValidField("elctEscoId");
	}

	/**
	 * Get elctEscoName
	 */
	@Column(name = "ELCT_ESCO_NAME")
	public String getElctEscoName() {
		return elctEscoName;
	}

	/**
	 * Set elctEscoName
	 */
	public void setElctEscoName(String elctEscoName) {
		this.elctEscoName = elctEscoName;
		addValidField("elctEscoName");
	}

	/**
	 * Get elctStatus
	 */
	@Column(name = "ELCT_STATUS")
	public String getElctStatus() {
		return elctStatus;
	}

	/**
	 * Set elctStatus
	 */
	public void setElctStatus(String elctStatus) {
		this.elctStatus = elctStatus;
		addValidField("elctStatus");
	}

	/**
	 * Get elctConsignorEbcuId
	 */
	@Column(name = "ELCT_CONSIGNOR_EBCU_ID")
	public Long getElctConsignorEbcuId() {
		return elctConsignorEbcuId;
	}

	/**
	 * Set elctConsignorEbcuId
	 */
	public void setElctConsignorEbcuId(Long elctConsignorEbcuId) {
		this.elctConsignorEbcuId = elctConsignorEbcuId;
		addValidField("elctConsignorEbcuId");
	}

	/**
	 * Get elctConsignorEbcuName
	 */
	@Column(name = "ELCT_CONSIGNOR_EBCU_NAME")
	public String getElctConsignorEbcuName() {
		return elctConsignorEbcuName;
	}

	/**
	 * Set elctConsignorEbcuName
	 */
	public void setElctConsignorEbcuName(String elctConsignorEbcuName) {
		this.elctConsignorEbcuName = elctConsignorEbcuName;
		addValidField("elctConsignorEbcuName");
	}

	/**
	 * Get elctConsignorEbcuCode
	 */
	@Column(name = "ELCT_CONSIGNOR_EBCU_CODE")
	public String getElctConsignorEbcuCode() {
		return elctConsignorEbcuCode;
	}

	/**
	 * Set elctConsignorEbcuCode
	 */
	public void setElctConsignorEbcuCode(String elctConsignorEbcuCode) {
		this.elctConsignorEbcuCode = elctConsignorEbcuCode;
		addValidField("elctConsignorEbcuCode");
	}

	/**
	 * Get elctPaymentMode
	 */
	@Column(name = "ELCT_PAYMENT_MODE")
	public String getElctPaymentMode() {
		return elctPaymentMode;
	}

	/**
	 * Set elctPaymentMode
	 */
	public void setElctPaymentMode(String elctPaymentMode) {
		this.elctPaymentMode = elctPaymentMode;
		addValidField("elctPaymentMode");
	}

	/**
	 * Get elctSettlementMode
	 */
	@Column(name = "ELCT_SETTLEMENT_MODE")
	public String getElctSettlementMode() {
		return elctSettlementMode;
	}

	/**
	 * Set elctSettlementMode
	 */
	public void setElctSettlementMode(String elctSettlementMode) {
		this.elctSettlementMode = elctSettlementMode;
		addValidField("elctSettlementMode");
	}

	/**
	 * Get elctCustomerAgentEbcuName
	 */
	@Column(name = "ELCT_CUSTOMER_AGENT_EBCU_NAME")
	public String getElctCustomerAgentEbcuName() {
		return elctCustomerAgentEbcuName;
	}

	/**
	 * Set elctCustomerAgentEbcuName
	 */
	public void setElctCustomerAgentEbcuName(String elctCustomerAgentEbcuName) {
		this.elctCustomerAgentEbcuName = elctCustomerAgentEbcuName;
		addValidField("elctCustomerAgentEbcuName");
	}

}
