package com.sinotrans.oms.fees.model;

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
 * Model class for EbExchangeRate
 */
@Entity
@Table(name = "EB_EXCHANGE_RATE")
public class EbExchangeRateModel extends BaseModel implements OperationLog {

	//eberId
	private Long eberId;
	//eberEscoId
	private Long eberEscoId;
	//eberFromEbcyId
	private String eberFromEbcyId;
	//eberFromCurrency
	private String eberFromCurrency;
	//eberToEbcyId
	private String eberToEbcyId;
	//eberToCurrency
	private String eberToCurrency;
	//eberConversionDate
	private Date eberConversionDate;
	//eberDec
	private String eberDec;
	//eberConversionRate
	private Double eberConversionRate;
	//eberSubstr1
	private String eberSubstr1;
	//eberSubstr2
	private String eberSubstr2;
	//eberSubdate1
	private Date eberSubdate1;
	//eberSubnum1
	private Long eberSubnum1;
	//recVer
	private Long recVer;
	//modifier
	private String modifier;
	//modifyTime
	private Date modifyTime;
	//creator
	private String creator;
	//createTime
	private Date createTime;

	/**
	 * Get eberId
	 */
	@Column(name = "EBER_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEberId() {
		return eberId;
	}

	/**
	 * Set eberId
	 */
	public void setEberId(Long eberId) {
		this.eberId = eberId;
		addValidField("eberId");
	}

	/**
	 * Get eberEscoId
	 */
	@Column(name = "EBER_ESCO_ID")
	public Long getEberEscoId() {
		return eberEscoId;
	}

	/**
	 * Set eberEscoId
	 */
	public void setEberEscoId(Long eberEscoId) {
		this.eberEscoId = eberEscoId;
		addValidField("eberEscoId");
	}

	/**
	 * Get eberFromEbcyId
	 */
	@Column(name = "EBER_FROM_EBCY_ID")
	public String getEberFromEbcyId() {
		return eberFromEbcyId;
	}

	/**
	 * Set eberFromEbcyId
	 */
	public void setEberFromEbcyId(String eberFromEbcyId) {
		this.eberFromEbcyId = eberFromEbcyId;
		addValidField("eberFromEbcyId");
	}

	/**
	 * Get eberFromCurrency
	 */
	@Column(name = "EBER_FROM_CURRENCY")
	public String getEberFromCurrency() {
		return eberFromCurrency;
	}

	/**
	 * Set eberFromCurrency
	 */
	public void setEberFromCurrency(String eberFromCurrency) {
		this.eberFromCurrency = eberFromCurrency;
		addValidField("eberFromCurrency");
	}

	/**
	 * Get eberToEbcyId
	 */
	@Column(name = "EBER_TO_EBCY_ID")
	public String getEberToEbcyId() {
		return eberToEbcyId;
	}

	/**
	 * Set eberToEbcyId
	 */
	public void setEberToEbcyId(String eberToEbcyId) {
		this.eberToEbcyId = eberToEbcyId;
		addValidField("eberToEbcyId");
	}

	/**
	 * Get eberToCurrency
	 */
	@Column(name = "EBER_TO_CURRENCY")
	public String getEberToCurrency() {
		return eberToCurrency;
	}

	/**
	 * Set eberToCurrency
	 */
	public void setEberToCurrency(String eberToCurrency) {
		this.eberToCurrency = eberToCurrency;
		addValidField("eberToCurrency");
	}

	/**
	 * Get eberConversionDate
	 */
	@Column(name = "EBER_CONVERSION_DATE")
	public Date getEberConversionDate() {
		return eberConversionDate;
	}

	/**
	 * Set eberConversionDate
	 */
	public void setEberConversionDate(Date eberConversionDate) {
		this.eberConversionDate = eberConversionDate;
		addValidField("eberConversionDate");
	}

	/**
	 * Get eberDec
	 */
	@Column(name = "EBER_DEC")
	public String getEberDec() {
		return eberDec;
	}

	/**
	 * Set eberDec
	 */
	public void setEberDec(String eberDec) {
		this.eberDec = eberDec;
		addValidField("eberDec");
	}

	/**
	 * Get eberConversionRate
	 */
	@Column(name = "EBER_CONVERSION_RATE")
	public Double getEberConversionRate() {
		return eberConversionRate;
	}

	/**
	 * Set eberConversionRate
	 */
	public void setEberConversionRate(Double eberConversionRate) {
		this.eberConversionRate = eberConversionRate;
		addValidField("eberConversionRate");
	}

	/**
	 * Get eberSubstr1
	 */
	@Column(name = "EBER_SUBSTR1")
	public String getEberSubstr1() {
		return eberSubstr1;
	}

	/**
	 * Set eberSubstr1
	 */
	public void setEberSubstr1(String eberSubstr1) {
		this.eberSubstr1 = eberSubstr1;
		addValidField("eberSubstr1");
	}

	/**
	 * Get eberSubstr2
	 */
	@Column(name = "EBER_SUBSTR2")
	public String getEberSubstr2() {
		return eberSubstr2;
	}

	/**
	 * Set eberSubstr2
	 */
	public void setEberSubstr2(String eberSubstr2) {
		this.eberSubstr2 = eberSubstr2;
		addValidField("eberSubstr2");
	}

	/**
	 * Get eberSubdate1
	 */
	@Column(name = "EBER_SUBDATE1")
	public Date getEberSubdate1() {
		return eberSubdate1;
	}

	/**
	 * Set eberSubdate1
	 */
	public void setEberSubdate1(Date eberSubdate1) {
		this.eberSubdate1 = eberSubdate1;
		addValidField("eberSubdate1");
	}

	/**
	 * Get eberSubnum1
	 */
	@Column(name = "EBER_SUBNUM1")
	public Long getEberSubnum1() {
		return eberSubnum1;
	}

	/**
	 * Set eberSubnum1
	 */
	public void setEberSubnum1(Long eberSubnum1) {
		this.eberSubnum1 = eberSubnum1;
		addValidField("eberSubnum1");
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

}
