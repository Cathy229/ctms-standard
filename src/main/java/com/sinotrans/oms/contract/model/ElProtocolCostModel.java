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
 * Model class for ElProtocolCost
 */
@Entity
@Table(name = "EL_PROTOCOL_COST")
public class ElProtocolCostModel extends BaseModel implements OperationLog {

	//epctId
	private Long epctId;
	//epctElplId
	private Long epctElplId;
	//epctEbfhId
	private Long epctEbfhId;
	//epctEbfhName
	private String epctEbfhName;
	//epctCurrencyType
	private String epctCurrencyType;
	//epctEfbfType
	private String epctEfbfType;
	//epctSettlementEbcuId
	private Long epctSettlementEbcuId;
	//epctSettlementSource
	private String epctSettlementSource;
	//epctIsDutyfree
	private String epctIsDutyfree;
	//epctTaxRate
	private Double epctTaxRate;
	//epctMinSum
	private Long epctMinSum;
	//epctMaxSum
	private Long epctMaxSum;
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
	//epctSettlementEbcuCdh
	private String epctSettlementEbcuCdh;
	//epctSettlementEbcuName
	private String epctSettlementEbcuName;
	//epctSubstr1
	private String epctSubstr1;
	//epctSubstr2
	private String epctSubstr2;
	//epctSubdate1
	private Date epctSubdate1;
	//epctSubdate2
	private Date epctSubdate2;
	//epctSubnum1
	private Long epctSubnum1;
	//epctSubnum2
	private Long epctSubnum2;
	//epctSettlementEbcuCode
	private String epctSettlementEbcuCode;
	//epctEscoId
	private Long epctEscoId;
	//epctEbpjId
	private Long epctEbpjId;
	//epctStatus
	private String epctStatus;

	/**
	 * Get epctId
	 */
	@Column(name = "EPCT_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEpctId() {
		return epctId;
	}

	/**
	 * Set epctId
	 */
	public void setEpctId(Long epctId) {
		this.epctId = epctId;
		addValidField("epctId");
	}

	/**
	 * Get epctElplId
	 */
	@Column(name = "EPCT_ELPL_ID")
	public Long getEpctElplId() {
		return epctElplId;
	}

	/**
	 * Set epctElplId
	 */
	public void setEpctElplId(Long epctElplId) {
		this.epctElplId = epctElplId;
		addValidField("epctElplId");
	}

	/**
	 * Get epctEbfhId
	 */
	@Column(name = "EPCT_EBFH_ID")
	public Long getEpctEbfhId() {
		return epctEbfhId;
	}

	/**
	 * Set epctEbfhId
	 */
	public void setEpctEbfhId(Long epctEbfhId) {
		this.epctEbfhId = epctEbfhId;
		addValidField("epctEbfhId");
	}

	/**
	 * Get epctEbfhName
	 */
	@Column(name = "EPCT_EBFH_NAME")
	public String getEpctEbfhName() {
		return epctEbfhName;
	}

	/**
	 * Set epctEbfhName
	 */
	public void setEpctEbfhName(String epctEbfhName) {
		this.epctEbfhName = epctEbfhName;
		addValidField("epctEbfhName");
	}

	/**
	 * Get epctCurrencyType
	 */
	@Column(name = "EPCT_CURRENCY_TYPE")
	public String getEpctCurrencyType() {
		return epctCurrencyType;
	}

	/**
	 * Set epctCurrencyType
	 */
	public void setEpctCurrencyType(String epctCurrencyType) {
		this.epctCurrencyType = epctCurrencyType;
		addValidField("epctCurrencyType");
	}

	/**
	 * Get epctEfbfType
	 */
	@Column(name = "EPCT_EFBF_TYPE")
	public String getEpctEfbfType() {
		return epctEfbfType;
	}

	/**
	 * Set epctEfbfType
	 */
	public void setEpctEfbfType(String epctEfbfType) {
		this.epctEfbfType = epctEfbfType;
		addValidField("epctEfbfType");
	}

	/**
	 * Get epctSettlementEbcuId
	 */
	@Column(name = "EPCT_SETTLEMENT_EBCU_ID")
	public Long getEpctSettlementEbcuId() {
		return epctSettlementEbcuId;
	}

	/**
	 * Set epctSettlementEbcuId
	 */
	public void setEpctSettlementEbcuId(Long epctSettlementEbcuId) {
		this.epctSettlementEbcuId = epctSettlementEbcuId;
		addValidField("epctSettlementEbcuId");
	}

	/**
	 * Get epctSettlementSource
	 */
	@Column(name = "EPCT_SETTLEMENT_SOURCE")
	public String getEpctSettlementSource() {
		return epctSettlementSource;
	}

	/**
	 * Set epctSettlementSource
	 */
	public void setEpctSettlementSource(String epctSettlementSource) {
		this.epctSettlementSource = epctSettlementSource;
		addValidField("epctSettlementSource");
	}

	/**
	 * Get epctIsDutyfree
	 */
	@Column(name = "EPCT_IS_DUTYFREE")
	public String getEpctIsDutyfree() {
		return epctIsDutyfree;
	}

	/**
	 * Set epctIsDutyfree
	 */
	public void setEpctIsDutyfree(String epctIsDutyfree) {
		this.epctIsDutyfree = epctIsDutyfree;
		addValidField("epctIsDutyfree");
	}

	/**
	 * Get epctTaxRate
	 */
	@Column(name = "EPCT_TAX_RATE")
	public Double getEpctTaxRate() {
		return epctTaxRate;
	}

	/**
	 * Set epctTaxRate
	 */
	public void setEpctTaxRate(Double epctTaxRate) {
		this.epctTaxRate = epctTaxRate;
		addValidField("epctTaxRate");
	}

	/**
	 * Get epctMinSum
	 */
	@Column(name = "EPCT_MIN_SUM")
	public Long getEpctMinSum() {
		return epctMinSum;
	}

	/**
	 * Set epctMinSum
	 */
	public void setEpctMinSum(Long epctMinSum) {
		this.epctMinSum = epctMinSum;
		addValidField("epctMinSum");
	}

	/**
	 * Get epctMaxSum
	 */
	@Column(name = "EPCT_MAX_SUM")
	public Long getEpctMaxSum() {
		return epctMaxSum;
	}

	/**
	 * Set epctMaxSum
	 */
	public void setEpctMaxSum(Long epctMaxSum) {
		this.epctMaxSum = epctMaxSum;
		addValidField("epctMaxSum");
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
	 * Get epctSettlementEbcuCdh
	 */
	@Column(name = "EPCT_SETTLEMENT_EBCU_CDH")
	public String getEpctSettlementEbcuCdh() {
		return epctSettlementEbcuCdh;
	}

	/**
	 * Set epctSettlementEbcuCdh
	 */
	public void setEpctSettlementEbcuCdh(String epctSettlementEbcuCdh) {
		this.epctSettlementEbcuCdh = epctSettlementEbcuCdh;
		addValidField("epctSettlementEbcuCdh");
	}

	/**
	 * Get epctSettlementEbcuName
	 */
	@Column(name = "EPCT_SETTLEMENT_EBCU_NAME")
	public String getEpctSettlementEbcuName() {
		return epctSettlementEbcuName;
	}

	/**
	 * Set epctSettlementEbcuName
	 */
	public void setEpctSettlementEbcuName(String epctSettlementEbcuName) {
		this.epctSettlementEbcuName = epctSettlementEbcuName;
		addValidField("epctSettlementEbcuName");
	}

	/**
	 * Get epctSubstr1
	 */
	@Column(name = "EPCT_SUBSTR1")
	public String getEpctSubstr1() {
		return epctSubstr1;
	}

	/**
	 * Set epctSubstr1
	 */
	public void setEpctSubstr1(String epctSubstr1) {
		this.epctSubstr1 = epctSubstr1;
		addValidField("epctSubstr1");
	}

	/**
	 * Get epctSubstr2
	 */
	@Column(name = "EPCT_SUBSTR2")
	public String getEpctSubstr2() {
		return epctSubstr2;
	}

	/**
	 * Set epctSubstr2
	 */
	public void setEpctSubstr2(String epctSubstr2) {
		this.epctSubstr2 = epctSubstr2;
		addValidField("epctSubstr2");
	}

	/**
	 * Get epctSubdate1
	 */
	@Column(name = "EPCT_SUBDATE1")
	public Date getEpctSubdate1() {
		return epctSubdate1;
	}

	/**
	 * Set epctSubdate1
	 */
	public void setEpctSubdate1(Date epctSubdate1) {
		this.epctSubdate1 = epctSubdate1;
		addValidField("epctSubdate1");
	}

	/**
	 * Get epctSubdate2
	 */
	@Column(name = "EPCT_SUBDATE2")
	public Date getEpctSubdate2() {
		return epctSubdate2;
	}

	/**
	 * Set epctSubdate2
	 */
	public void setEpctSubdate2(Date epctSubdate2) {
		this.epctSubdate2 = epctSubdate2;
		addValidField("epctSubdate2");
	}

	/**
	 * Get epctSubnum1
	 */
	@Column(name = "EPCT_SUBNUM1")
	public Long getEpctSubnum1() {
		return epctSubnum1;
	}

	/**
	 * Set epctSubnum1
	 */
	public void setEpctSubnum1(Long epctSubnum1) {
		this.epctSubnum1 = epctSubnum1;
		addValidField("epctSubnum1");
	}

	/**
	 * Get epctSubnum2
	 */
	@Column(name = "EPCT_SUBNUM2")
	public Long getEpctSubnum2() {
		return epctSubnum2;
	}

	/**
	 * Set epctSubnum2
	 */
	public void setEpctSubnum2(Long epctSubnum2) {
		this.epctSubnum2 = epctSubnum2;
		addValidField("epctSubnum2");
	}

	/**
	 * Get epctSettlementEbcuCode
	 */
	@Column(name = "EPCT_SETTLEMENT_EBCU_CODE")
	public String getEpctSettlementEbcuCode() {
		return epctSettlementEbcuCode;
	}

	/**
	 * Set epctSettlementEbcuCode
	 */
	public void setEpctSettlementEbcuCode(String epctSettlementEbcuCode) {
		this.epctSettlementEbcuCode = epctSettlementEbcuCode;
		addValidField("epctSettlementEbcuCode");
	}

	/**
	 * Get epctEscoId
	 */
	@Column(name = "EPCT_ESCO_ID")
	public Long getEpctEscoId() {
		return epctEscoId;
	}

	/**
	 * Set epctEscoId
	 */
	public void setEpctEscoId(Long epctEscoId) {
		this.epctEscoId = epctEscoId;
		addValidField("epctEscoId");
	}

	/**
	 * Get epctEbpjId
	 */
	@Column(name = "EPCT_EBPJ_ID")
	public Long getEpctEbpjId() {
		return epctEbpjId;
	}

	/**
	 * Set epctEbpjId
	 */
	public void setEpctEbpjId(Long epctEbpjId) {
		this.epctEbpjId = epctEbpjId;
		addValidField("epctEbpjId");
	}
	
	/**
	 * Get epctStatus
	 */
	@Column(name = "EPCT_STATUS")
	public String getEpctStatus() {
		return epctStatus;
	}
	
	/**
	 * Set epctStatus
	 */
	public void setEpctStatus(String epctStatus) {
		this.epctStatus = epctStatus;
		addValidField("epctStatus");
	}

}
