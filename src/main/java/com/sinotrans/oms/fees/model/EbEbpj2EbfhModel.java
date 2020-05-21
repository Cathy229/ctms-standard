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
 * Model class for EbEbpj2Ebfh
 */
@Entity
@Table(name = "EB_EBPJ_2_EBFH")
public class EbEbpj2EbfhModel extends BaseModel implements OperationLog {

	//ebphId
	private Long ebphId;
	//ebphEbpjId
	private Long ebphEbpjId;
	//ebphEbfhId
	private Long ebphEbfhId;
	//ebphSubstr1
	private String ebphSubstr1;
	//ebphSubstr2
	private String ebphSubstr2;
	//ebphSubdate1
	private Date ebphSubdate1;
	//ebphSubnum1
	private Long ebphSubnum1;
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
	 * Get ebphId
	 */
	@Column(name = "EBPH_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbphId() {
		return ebphId;
	}

	/**
	 * Set ebphId
	 */
	public void setEbphId(Long ebphId) {
		this.ebphId = ebphId;
		addValidField("ebphId");
	}

	/**
	 * Get ebphEbpjId
	 */
	@Column(name = "EBPH_EBPJ_ID")
	public Long getEbphEbpjId() {
		return ebphEbpjId;
	}

	/**
	 * Set ebphEbpjId
	 */
	public void setEbphEbpjId(Long ebphEbpjId) {
		this.ebphEbpjId = ebphEbpjId;
		addValidField("ebphEbpjId");
	}

	/**
	 * Get ebphEbfhId
	 */
	@Column(name = "EBPH_EBFH_ID")
	public Long getEbphEbfhId() {
		return ebphEbfhId;
	}

	/**
	 * Set ebphEbfhId
	 */
	public void setEbphEbfhId(Long ebphEbfhId) {
		this.ebphEbfhId = ebphEbfhId;
		addValidField("ebphEbfhId");
	}

	/**
	 * Get ebphSubstr1
	 */
	@Column(name = "EBPH_SUBSTR1")
	public String getEbphSubstr1() {
		return ebphSubstr1;
	}

	/**
	 * Set ebphSubstr1
	 */
	public void setEbphSubstr1(String ebphSubstr1) {
		this.ebphSubstr1 = ebphSubstr1;
		addValidField("ebphSubstr1");
	}

	/**
	 * Get ebphSubstr2
	 */
	@Column(name = "EBPH_SUBSTR2")
	public String getEbphSubstr2() {
		return ebphSubstr2;
	}

	/**
	 * Set ebphSubstr2
	 */
	public void setEbphSubstr2(String ebphSubstr2) {
		this.ebphSubstr2 = ebphSubstr2;
		addValidField("ebphSubstr2");
	}

	/**
	 * Get ebphSubdate1
	 */
	@Column(name = "EBPH_SUBDATE1")
	public Date getEbphSubdate1() {
		return ebphSubdate1;
	}

	/**
	 * Set ebphSubdate1
	 */
	public void setEbphSubdate1(Date ebphSubdate1) {
		this.ebphSubdate1 = ebphSubdate1;
		addValidField("ebphSubdate1");
	}

	/**
	 * Get ebphSubnum1
	 */
	@Column(name = "EBPH_SUBNUM1")
	public Long getEbphSubnum1() {
		return ebphSubnum1;
	}

	/**
	 * Set ebphSubnum1
	 */
	public void setEbphSubnum1(Long ebphSubnum1) {
		this.ebphSubnum1 = ebphSubnum1;
		addValidField("ebphSubnum1");
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
