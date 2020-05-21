package com.sinotrans.oms.eoor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import com.sinotrans.framework.orm.model.BaseModel;
import com.sinotrans.framework.orm.model.OperationLog;

/**
 * Model class for EiShiporderUnits
 */
@Entity
@Table(name = "EI_SHIPORDER_UNITS")
public class EiShiporderUnitsModel extends BaseModel implements OperationLog {

	//eisuId
	private Integer eisuId;
	//eisuEscoId
	private Integer eisuEscoId;
	//eisuEoorId
	private Integer eisuEoorId;
	//eisuEotaId
	private Integer eisuEotaId;
	//eisuCmtdyid
	private String eisuCmtdyid;
	//eisuWeight
	private Double eisuWeight;
	//eisuVolume
	private Double eisuVolume;
	//eisuCases
	private Integer eisuCases;
	//eisuHdFilename
	private String eisuHdFilename;
	//eisuHdBatchnumber
	private String eisuHdBatchnumber;
	//eisuHdSymbol
	private String eisuHdSymbol;
	//eisuHdInformation
	private String eisuHdInformation;
	//recVer
	private Integer recVer;
	//creator
	private String creator;
	//createTime
	private Date createTime;
	//modifier
	private String modifier;
	//modifyTime
	private Date modifyTime;

	/**
	 * Get eisuId
	 */
	@Column(name = "EISU_ID")
	@SequenceGenerator(name="SEQ_EI_SHIPORDER_UNITS", sequenceName="SEQ_EI_SHIPORDER_UNITS" ,allocationSize=1)
	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_EI_SHIPORDER_UNITS")
	public Integer getEisuId() {
		return eisuId;
	}

	/**
	 * Set eisuId
	 */
	public void setEisuId(Integer eisuId) {
		this.eisuId = eisuId;
		addValidField("eisuId");
	}

	/**
	 * Get eisuEscoId
	 */
	@Column(name = "EISU_ESCO_ID")
	public Integer getEisuEscoId() {
		return eisuEscoId;
	}

	/**
	 * Set eisuEscoId
	 */
	public void setEisuEscoId(Integer eisuEscoId) {
		this.eisuEscoId = eisuEscoId;
		addValidField("eisuEscoId");
	}

	/**
	 * Get eisuEoorId
	 */
	@Column(name = "EISU_EOOR_ID")
	public Integer getEisuEoorId() {
		return eisuEoorId;
	}

	/**
	 * Set eisuEoorId
	 */
	public void setEisuEoorId(Integer eisuEoorId) {
		this.eisuEoorId = eisuEoorId;
		addValidField("eisuEoorId");
	}

	/**
	 * Get eisuEotaId
	 */
	@Column(name = "EISU_EOTA_ID")
	public Integer getEisuEotaId() {
		return eisuEotaId;
	}

	/**
	 * Set eisuEotaId
	 */
	public void setEisuEotaId(Integer eisuEotaId) {
		this.eisuEotaId = eisuEotaId;
		addValidField("eisuEotaId");
	}

	/**
	 * Get eisuCmtdyid
	 */
	@Column(name = "EISU_CMTDYID")
	public String getEisuCmtdyid() {
		return eisuCmtdyid;
	}

	/**
	 * Set eisuCmtdyid
	 */
	public void setEisuCmtdyid(String eisuCmtdyid) {
		this.eisuCmtdyid = eisuCmtdyid;
		addValidField("eisuCmtdyid");
	}

	/**
	 * Get eisuWeight
	 */
	@Column(name = "EISU_WEIGHT")
	public Double getEisuWeight() {
		return eisuWeight;
	}

	/**
	 * Set eisuWeight
	 */
	public void setEisuWeight(Double eisuWeight) {
		this.eisuWeight = eisuWeight;
		addValidField("eisuWeight");
	}

	/**
	 * Get eisuVolume
	 */
	@Column(name = "EISU_VOLUME")
	public Double getEisuVolume() {
		return eisuVolume;
	}

	/**
	 * Set eisuVolume
	 */
	public void setEisuVolume(Double eisuVolume) {
		this.eisuVolume = eisuVolume;
		addValidField("eisuVolume");
	}

	/**
	 * Get eisuCases
	 */
	@Column(name = "EISU_CASES")
	public Integer getEisuCases() {
		return eisuCases;
	}

	/**
	 * Set eisuCases
	 */
	public void setEisuCases(Integer eisuCases) {
		this.eisuCases = eisuCases;
		addValidField("eisuCases");
	}

	/**
	 * Get eisuHdFilename
	 */
	@Column(name = "EISU_HD_FILENAME")
	public String getEisuHdFilename() {
		return eisuHdFilename;
	}

	/**
	 * Set eisuHdFilename
	 */
	public void setEisuHdFilename(String eisuHdFilename) {
		this.eisuHdFilename = eisuHdFilename;
		addValidField("eisuHdFilename");
	}

	/**
	 * Get eisuHdBatchnumber
	 */
	@Column(name = "EISU_HD_BATCHNUMBER")
	public String getEisuHdBatchnumber() {
		return eisuHdBatchnumber;
	}

	/**
	 * Set eisuHdBatchnumber
	 */
	public void setEisuHdBatchnumber(String eisuHdBatchnumber) {
		this.eisuHdBatchnumber = eisuHdBatchnumber;
		addValidField("eisuHdBatchnumber");
	}

	/**
	 * Get eisuHdSymbol
	 */
	@Column(name = "EISU_HD_SYMBOL")
	public String getEisuHdSymbol() {
		return eisuHdSymbol;
	}

	/**
	 * Set eisuHdSymbol
	 */
	public void setEisuHdSymbol(String eisuHdSymbol) {
		this.eisuHdSymbol = eisuHdSymbol;
		addValidField("eisuHdSymbol");
	}

	/**
	 * Get eisuHdInformation
	 */
	@Column(name = "EISU_HD_INFORMATION")
	public String getEisuHdInformation() {
		return eisuHdInformation;
	}

	/**
	 * Set eisuHdInformation
	 */
	public void setEisuHdInformation(String eisuHdInformation) {
		this.eisuHdInformation = eisuHdInformation;
		addValidField("eisuHdInformation");
	}

	/**
	 * Get recVer
	 */
	@Column(name = "REC_VER")
	@Version
	public Integer getRecVer() {
		return recVer;
	}

	/**
	 * Set recVer
	 */
	public void setRecVer(Integer recVer) {
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
