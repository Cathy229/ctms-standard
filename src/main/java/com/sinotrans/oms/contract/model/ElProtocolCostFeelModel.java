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
 * Model class for ElProtocolCostFeel
 */
@Entity
@Table(name = "EL_PROTOCOL_COST_FEEL")
public class ElProtocolCostFeelModel extends BaseModel implements OperationLog {

	//epcfId
	private Long epcfId;
	//epcfEpccId
	private Long epcfEpccId;
	//epcfContainerType
	private String epcfContainerType;
	//epcfContainerSize
	private String epcfContainerSize;
	//epcfCostType
	private String epcfCostType;
	//epcfFormula
	private String epcfFormula;
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
	//epcfSubstr1
	private String epcfSubstr1;
	//epcfSubstr2
	private String epcfSubstr2;
	//epcfSubdate1
	private Date epcfSubdate1;
	//epcfSubdate2
	private Date epcfSubdate2;
	//epcfSubnum1
	private Long epcfSubnum1;
	//epcfSubnum2
	private Long epcfSubnum2;
	//epcfEscoId
	private Long epcfEscoId;
	//epcfEbpjId
	private Long epcfEbpjId;
	//epcfPrice
	private Double epcfPrice;
	//epcfStatus
	private String epcfStatus;

	/**
	 * Get epcfId
	 */
	@Column(name = "EPCF_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEpcfId() {
		return epcfId;
	}

	/**
	 * Set epcfId
	 */
	public void setEpcfId(Long epcfId) {
		this.epcfId = epcfId;
		addValidField("epcfId");
	}

	/**
	 * Get epcfEpccId
	 */
	@Column(name = "EPCF_EPCC_ID")
	public Long getEpcfEpccId() {
		return epcfEpccId;
	}

	/**
	 * Set epcfEpccId
	 */
	public void setEpcfEpccId(Long epcfEpccId) {
		this.epcfEpccId = epcfEpccId;
		addValidField("epcfEpccId");
	}

	/**
	 * Get epcfContainerType
	 */
	@Column(name = "EPCF_CONTAINER_TYPE")
	public String getEpcfContainerType() {
		return epcfContainerType;
	}

	/**
	 * Set epcfContainerType
	 */
	public void setEpcfContainerType(String epcfContainerType) {
		this.epcfContainerType = epcfContainerType;
		addValidField("epcfContainerType");
	}

	/**
	 * Get epcfContainerSize
	 */
	@Column(name = "EPCF_CONTAINER_SIZE")
	public String getEpcfContainerSize() {
		return epcfContainerSize;
	}

	/**
	 * Set epcfContainerSize
	 */
	public void setEpcfContainerSize(String epcfContainerSize) {
		this.epcfContainerSize = epcfContainerSize;
		addValidField("epcfContainerSize");
	}

	/**
	 * Get epcfCostType
	 */
	@Column(name = "EPCF_COST_TYPE")
	public String getEpcfCostType() {
		return epcfCostType;
	}

	/**
	 * Set epcfCostType
	 */
	public void setEpcfCostType(String epcfCostType) {
		this.epcfCostType = epcfCostType;
		addValidField("epcfCostType");
	}

	/**
	 * Get epcfFormula
	 */
	@Column(name = "EPCF_FORMULA")
	public String getEpcfFormula() {
		return epcfFormula;
	}

	/**
	 * Set epcfFormula
	 */
	public void setEpcfFormula(String epcfFormula) {
		this.epcfFormula = epcfFormula;
		addValidField("epcfFormula");
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
	 * Get epcfSubstr1
	 */
	@Column(name = "EPCF_SUBSTR1")
	public String getEpcfSubstr1() {
		return epcfSubstr1;
	}

	/**
	 * Set epcfSubstr1
	 */
	public void setEpcfSubstr1(String epcfSubstr1) {
		this.epcfSubstr1 = epcfSubstr1;
		addValidField("epcfSubstr1");
	}

	/**
	 * Get epcfSubstr2
	 */
	@Column(name = "EPCF_SUBSTR2")
	public String getEpcfSubstr2() {
		return epcfSubstr2;
	}

	/**
	 * Set epcfSubstr2
	 */
	public void setEpcfSubstr2(String epcfSubstr2) {
		this.epcfSubstr2 = epcfSubstr2;
		addValidField("epcfSubstr2");
	}

	/**
	 * Get epcfSubdate1
	 */
	@Column(name = "EPCF_SUBDATE1")
	public Date getEpcfSubdate1() {
		return epcfSubdate1;
	}

	/**
	 * Set epcfSubdate1
	 */
	public void setEpcfSubdate1(Date epcfSubdate1) {
		this.epcfSubdate1 = epcfSubdate1;
		addValidField("epcfSubdate1");
	}

	/**
	 * Get epcfSubdate2
	 */
	@Column(name = "EPCF_SUBDATE2")
	public Date getEpcfSubdate2() {
		return epcfSubdate2;
	}

	/**
	 * Set epcfSubdate2
	 */
	public void setEpcfSubdate2(Date epcfSubdate2) {
		this.epcfSubdate2 = epcfSubdate2;
		addValidField("epcfSubdate2");
	}

	/**
	 * Get epcfSubnum1
	 */
	@Column(name = "EPCF_SUBNUM1")
	public Long getEpcfSubnum1() {
		return epcfSubnum1;
	}

	/**
	 * Set epcfSubnum1
	 */
	public void setEpcfSubnum1(Long epcfSubnum1) {
		this.epcfSubnum1 = epcfSubnum1;
		addValidField("epcfSubnum1");
	}

	/**
	 * Get epcfSubnum2
	 */
	@Column(name = "EPCF_SUBNUM2")
	public Long getEpcfSubnum2() {
		return epcfSubnum2;
	}

	/**
	 * Set epcfSubnum2
	 */
	public void setEpcfSubnum2(Long epcfSubnum2) {
		this.epcfSubnum2 = epcfSubnum2;
		addValidField("epcfSubnum2");
	}

	/**
	 * Get epcfEscoId
	 */
	@Column(name = "EPCF_ESCO_ID")
	public Long getEpcfEscoId() {
		return epcfEscoId;
	}

	/**
	 * Set epcfEscoId
	 */
	public void setEpcfEscoId(Long epcfEscoId) {
		this.epcfEscoId = epcfEscoId;
		addValidField("epcfEscoId");
	}

	/**
	 * Get epcfEbpjId
	 */
	@Column(name = "EPCF_EBPJ_ID")
	public Long getEpcfEbpjId() {
		return epcfEbpjId;
	}

	/**
	 * Set epcfEbpjId
	 */
	public void setEpcfEbpjId(Long epcfEbpjId) {
		this.epcfEbpjId = epcfEbpjId;
		addValidField("epcfEbpjId");
	}

	/**
	 * Get epcfPrice
	 */
	@Column(name = "EPCF_PRICE")
	public Double getEpcfPrice() {
		return epcfPrice;
	}

	/**
	 * Set epcfPrice
	 */
	public void setEpcfPrice(Double epcfPrice) {
		this.epcfPrice = epcfPrice;
		addValidField("epcfPrice");
	}

	/**
	 * Get epcfStatus
	 */
	@Column(name = "EPCF_STATUS")
	public String getEpcfStatus() {
		return epcfStatus;
	}
	
	/**
	 * Set epcfStatus
	 */
	public void setEpcfStatus(String epcfStatus) {
		this.epcfStatus = epcfStatus;
		addValidField("epcfStatus");
	}
	
}
