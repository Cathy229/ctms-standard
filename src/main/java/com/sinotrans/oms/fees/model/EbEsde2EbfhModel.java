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
 * Model class for EbEsde2Ebfh
 */
@Entity
@Table(name = "EB_ESDE_2_EBFH")
public class EbEsde2EbfhModel extends BaseModel implements OperationLog {

	//ebdhId
	private Long ebdhId;
	//ebdhEsdeId
	private Long ebdhEsdeId;
	//ebdhEbfhId
	private Long ebdhEbfhId;
	//ebdhSubstr1
	private String ebdhSubstr1;
	//ebdhSubstr2
	private String ebdhSubstr2;
	//ebdhSubdate1
	private Date ebdhSubdate1;
	//ebdhSubnum1
	private Long ebdhSubnum1;
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
	 * Get ebdhId
	 */
	@Column(name = "EBDH_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbdhId() {
		return ebdhId;
	}

	/**
	 * Set ebdhId
	 */
	public void setEbdhId(Long ebdhId) {
		this.ebdhId = ebdhId;
		addValidField("ebdhId");
	}

	/**
	 * Get ebdhEsdeId
	 */
	@Column(name = "EBDH_ESDE_ID")
	public Long getEbdhEsdeId() {
		return ebdhEsdeId;
	}

	/**
	 * Set ebdhEsdeId
	 */
	public void setEbdhEsdeId(Long ebdhEsdeId) {
		this.ebdhEsdeId = ebdhEsdeId;
		addValidField("ebdhEsdeId");
	}

	/**
	 * Get ebdhEbfhId
	 */
	@Column(name = "EBDH_EBFH_ID")
	public Long getEbdhEbfhId() {
		return ebdhEbfhId;
	}

	/**
	 * Set ebdhEbfhId
	 */
	public void setEbdhEbfhId(Long ebdhEbfhId) {
		this.ebdhEbfhId = ebdhEbfhId;
		addValidField("ebdhEbfhId");
	}

	/**
	 * Get ebdhSubstr1
	 */
	@Column(name = "EBDH_SUBSTR1")
	public String getEbdhSubstr1() {
		return ebdhSubstr1;
	}

	/**
	 * Set ebdhSubstr1
	 */
	public void setEbdhSubstr1(String ebdhSubstr1) {
		this.ebdhSubstr1 = ebdhSubstr1;
		addValidField("ebdhSubstr1");
	}

	/**
	 * Get ebdhSubstr2
	 */
	@Column(name = "EBDH_SUBSTR2")
	public String getEbdhSubstr2() {
		return ebdhSubstr2;
	}

	/**
	 * Set ebdhSubstr2
	 */
	public void setEbdhSubstr2(String ebdhSubstr2) {
		this.ebdhSubstr2 = ebdhSubstr2;
		addValidField("ebdhSubstr2");
	}

	/**
	 * Get ebdhSubdate1
	 */
	@Column(name = "EBDH_SUBDATE1")
	public Date getEbdhSubdate1() {
		return ebdhSubdate1;
	}

	/**
	 * Set ebdhSubdate1
	 */
	public void setEbdhSubdate1(Date ebdhSubdate1) {
		this.ebdhSubdate1 = ebdhSubdate1;
		addValidField("ebdhSubdate1");
	}

	/**
	 * Get ebdhSubnum1
	 */
	@Column(name = "EBDH_SUBNUM1")
	public Long getEbdhSubnum1() {
		return ebdhSubnum1;
	}

	/**
	 * Set ebdhSubnum1
	 */
	public void setEbdhSubnum1(Long ebdhSubnum1) {
		this.ebdhSubnum1 = ebdhSubnum1;
		addValidField("ebdhSubnum1");
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
