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
 * Model class for ElContractGreatClauses
 */
@Entity
@Table(name = "EL_CONTRACT_GREAT_CLAUSES")
public class ElContractGreatClausesModel extends BaseModel implements OperationLog {

	//ecgcId
	private Long ecgcId;
	//ecgcElctId
	private Long ecgcElctId;
	//ecgcEscoId
	private Long ecgcEscoId;
	//ecgcEbpjId
	private Long ecgcEbpjId;
	//ecgcClausesName
	private String ecgcClausesName;
	//ecgcClausesDetailed
	private String ecgcClausesDetailed;
	//ecgcStatus
	private String ecgcStatus;
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
	//ecgcSubstr1
	private String ecgcSubstr1;
	//ecgcSubstr2
	private String ecgcSubstr2;
	//ecgcSubdate1
	private Date ecgcSubdate1;
	//ecgcSubdate2
	private Date ecgcSubdate2;
	//ecgcSubnum1
	private Long ecgcSubnum1;
	//ecgcSubnum2
	private Long ecgcSubnum2;

	/**
	 * Get ecgcId
	 */
	@Column(name = "ECGC_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEcgcId() {
		return ecgcId;
	}

	/**
	 * Set ecgcId
	 */
	public void setEcgcId(Long ecgcId) {
		this.ecgcId = ecgcId;
		addValidField("ecgcId");
	}

	/**
	 * Get ecgcElctId
	 */
	@Column(name = "ECGC_ELCT_ID")
	public Long getEcgcElctId() {
		return ecgcElctId;
	}

	/**
	 * Set ecgcElctId
	 */
	public void setEcgcElctId(Long ecgcElctId) {
		this.ecgcElctId = ecgcElctId;
		addValidField("ecgcElctId");
	}

	/**
	 * Get ecgcEscoId
	 */
	@Column(name = "ECGC_ESCO_ID")
	public Long getEcgcEscoId() {
		return ecgcEscoId;
	}

	/**
	 * Set ecgcEscoId
	 */
	public void setEcgcEscoId(Long ecgcEscoId) {
		this.ecgcEscoId = ecgcEscoId;
		addValidField("ecgcEscoId");
	}

	/**
	 * Get ecgcEbpjId
	 */
	@Column(name = "ECGC_EBPJ_ID")
	public Long getEcgcEbpjId() {
		return ecgcEbpjId;
	}

	/**
	 * Set ecgcEbpjId
	 */
	public void setEcgcEbpjId(Long ecgcEbpjId) {
		this.ecgcEbpjId = ecgcEbpjId;
		addValidField("ecgcEbpjId");
	}

	/**
	 * Get ecgcClausesName
	 */
	@Column(name = "ECGC_CLAUSES_NAME")
	public String getEcgcClausesName() {
		return ecgcClausesName;
	}

	/**
	 * Set ecgcClausesName
	 */
	public void setEcgcClausesName(String ecgcClausesName) {
		this.ecgcClausesName = ecgcClausesName;
		addValidField("ecgcClausesName");
	}

	/**
	 * Get ecgcClausesDetailed
	 */
	@Column(name = "ECGC_CLAUSES_DETAILED")
	public String getEcgcClausesDetailed() {
		return ecgcClausesDetailed;
	}

	/**
	 * Set ecgcClausesDetailed
	 */
	public void setEcgcClausesDetailed(String ecgcClausesDetailed) {
		this.ecgcClausesDetailed = ecgcClausesDetailed;
		addValidField("ecgcClausesDetailed");
	}

	/**
	 * Get ecgcStatus
	 */
	@Column(name = "ECGC_STATUS")
	public String getEcgcStatus() {
		return ecgcStatus;
	}

	/**
	 * Set ecgcStatus
	 */
	public void setEcgcStatus(String ecgcStatus) {
		this.ecgcStatus = ecgcStatus;
		addValidField("ecgcStatus");
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
	 * Get ecgcSubstr1
	 */
	@Column(name = "ECGC_SUBSTR1")
	public String getEcgcSubstr1() {
		return ecgcSubstr1;
	}

	/**
	 * Set ecgcSubstr1
	 */
	public void setEcgcSubstr1(String ecgcSubstr1) {
		this.ecgcSubstr1 = ecgcSubstr1;
		addValidField("ecgcSubstr1");
	}

	/**
	 * Get ecgcSubstr2
	 */
	@Column(name = "ECGC_SUBSTR2")
	public String getEcgcSubstr2() {
		return ecgcSubstr2;
	}

	/**
	 * Set ecgcSubstr2
	 */
	public void setEcgcSubstr2(String ecgcSubstr2) {
		this.ecgcSubstr2 = ecgcSubstr2;
		addValidField("ecgcSubstr2");
	}

	/**
	 * Get ecgcSubdate1
	 */
	@Column(name = "ECGC_SUBDATE1")
	public Date getEcgcSubdate1() {
		return ecgcSubdate1;
	}

	/**
	 * Set ecgcSubdate1
	 */
	public void setEcgcSubdate1(Date ecgcSubdate1) {
		this.ecgcSubdate1 = ecgcSubdate1;
		addValidField("ecgcSubdate1");
	}

	/**
	 * Get ecgcSubdate2
	 */
	@Column(name = "ECGC_SUBDATE2")
	public Date getEcgcSubdate2() {
		return ecgcSubdate2;
	}

	/**
	 * Set ecgcSubdate2
	 */
	public void setEcgcSubdate2(Date ecgcSubdate2) {
		this.ecgcSubdate2 = ecgcSubdate2;
		addValidField("ecgcSubdate2");
	}

	/**
	 * Get ecgcSubnum1
	 */
	@Column(name = "ECGC_SUBNUM1")
	public Long getEcgcSubnum1() {
		return ecgcSubnum1;
	}

	/**
	 * Set ecgcSubnum1
	 */
	public void setEcgcSubnum1(Long ecgcSubnum1) {
		this.ecgcSubnum1 = ecgcSubnum1;
		addValidField("ecgcSubnum1");
	}

	/**
	 * Get ecgcSubnum2
	 */
	@Column(name = "ECGC_SUBNUM2")
	public Long getEcgcSubnum2() {
		return ecgcSubnum2;
	}

	/**
	 * Set ecgcSubnum2
	 */
	public void setEcgcSubnum2(Long ecgcSubnum2) {
		this.ecgcSubnum2 = ecgcSubnum2;
		addValidField("ecgcSubnum2");
	}

}
