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
 * Model class for EoInspCertificate
 */
@Entity
@Table(name = "EO_INSP_CERTIFICATE")
public class EoInspCertificateModel extends BaseModel implements OperationLog {

	//eoncId
	private Long eoncId;
	//eoncEornId
	private Long eoncEornId;
	//eoncDocuCode
	private String eoncDocuCode;
	//eoncCertCode
	private String eoncCertCode;
	//eoncSubstr1
	private String eoncSubstr1;
	//eoncSubstr2
	private String eoncSubstr2;
	//eoncSubstr3
	private String eoncSubstr3;
	//eoncSubstr4
	private String eoncSubstr4;
	//eoncSubnum1
	private Long eoncSubnum1;
	//eoncSubnum2
	private Long eoncSubnum2;
	//eoncSubdate1
	private Date eoncSubdate1;
	//eoncSubdate2
	private Date eoncSubdate2;
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
	//eoncDocuName
	private String eoncDocuName;
	//eoncOriginalCopy
	private Long eoncOriginalCopy;

	/**
	 * Get eoncId
	 */
	@Column(name = "EONC_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoncId() {
		return eoncId;
	}

	/**
	 * Set eoncId
	 */
	public void setEoncId(Long eoncId) {
		this.eoncId = eoncId;
		addValidField("eoncId");
	}

	/**
	 * Get eoncEornId
	 */
	@Column(name = "EONC_EORN_ID")
	public Long getEoncEornId() {
		return eoncEornId;
	}

	/**
	 * Set eoncEornId
	 */
	public void setEoncEornId(Long eoncEornId) {
		this.eoncEornId = eoncEornId;
		addValidField("eoncEornId");
	}

	/**
	 * Get eoncDocuCode
	 */
	@Column(name = "EONC_DOCU_CODE")
	public String getEoncDocuCode() {
		return eoncDocuCode;
	}

	/**
	 * Set eoncDocuCode
	 */
	public void setEoncDocuCode(String eoncDocuCode) {
		this.eoncDocuCode = eoncDocuCode;
		addValidField("eoncDocuCode");
	}

	/**
	 * Get eoncCertCode
	 */
	@Column(name = "EONC_CERT_CODE")
	public String getEoncCertCode() {
		return eoncCertCode;
	}

	/**
	 * Set eoncCertCode
	 */
	public void setEoncCertCode(String eoncCertCode) {
		this.eoncCertCode = eoncCertCode;
		addValidField("eoncCertCode");
	}

	/**
	 * Get eoncSubstr1
	 */
	@Column(name = "EONC_SUBSTR1")
	public String getEoncSubstr1() {
		return eoncSubstr1;
	}

	/**
	 * Set eoncSubstr1
	 */
	public void setEoncSubstr1(String eoncSubstr1) {
		this.eoncSubstr1 = eoncSubstr1;
		addValidField("eoncSubstr1");
	}

	/**
	 * Get eoncSubstr2
	 */
	@Column(name = "EONC_SUBSTR2")
	public String getEoncSubstr2() {
		return eoncSubstr2;
	}

	/**
	 * Set eoncSubstr2
	 */
	public void setEoncSubstr2(String eoncSubstr2) {
		this.eoncSubstr2 = eoncSubstr2;
		addValidField("eoncSubstr2");
	}

	/**
	 * Get eoncSubstr3
	 */
	@Column(name = "EONC_SUBSTR3")
	public String getEoncSubstr3() {
		return eoncSubstr3;
	}

	/**
	 * Set eoncSubstr3
	 */
	public void setEoncSubstr3(String eoncSubstr3) {
		this.eoncSubstr3 = eoncSubstr3;
		addValidField("eoncSubstr3");
	}

	/**
	 * Get eoncSubstr4
	 */
	@Column(name = "EONC_SUBSTR4")
	public String getEoncSubstr4() {
		return eoncSubstr4;
	}

	/**
	 * Set eoncSubstr4
	 */
	public void setEoncSubstr4(String eoncSubstr4) {
		this.eoncSubstr4 = eoncSubstr4;
		addValidField("eoncSubstr4");
	}

	/**
	 * Get eoncSubnum1
	 */
	@Column(name = "EONC_SUBNUM1")
	public Long getEoncSubnum1() {
		return eoncSubnum1;
	}

	/**
	 * Set eoncSubnum1
	 */
	public void setEoncSubnum1(Long eoncSubnum1) {
		this.eoncSubnum1 = eoncSubnum1;
		addValidField("eoncSubnum1");
	}

	/**
	 * Get eoncSubnum2
	 */
	@Column(name = "EONC_SUBNUM2")
	public Long getEoncSubnum2() {
		return eoncSubnum2;
	}

	/**
	 * Set eoncSubnum2
	 */
	public void setEoncSubnum2(Long eoncSubnum2) {
		this.eoncSubnum2 = eoncSubnum2;
		addValidField("eoncSubnum2");
	}

	/**
	 * Get eoncSubdate1
	 */
	@Column(name = "EONC_SUBDATE1")
	public Date getEoncSubdate1() {
		return eoncSubdate1;
	}

	/**
	 * Set eoncSubdate1
	 */
	public void setEoncSubdate1(Date eoncSubdate1) {
		this.eoncSubdate1 = eoncSubdate1;
		addValidField("eoncSubdate1");
	}

	/**
	 * Get eoncSubdate2
	 */
	@Column(name = "EONC_SUBDATE2")
	public Date getEoncSubdate2() {
		return eoncSubdate2;
	}

	/**
	 * Set eoncSubdate2
	 */
	public void setEoncSubdate2(Date eoncSubdate2) {
		this.eoncSubdate2 = eoncSubdate2;
		addValidField("eoncSubdate2");
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
	 * Get eoncDocuName
	 */
	@Column(name = "EONC_DOCU_NAME")
	public String getEoncDocuName() {
		return eoncDocuName;
	}

	/**
	 * Set eoncDocuName
	 */
	public void setEoncDocuName(String eoncDocuName) {
		this.eoncDocuName = eoncDocuName;
		addValidField("eoncDocuName");
	}

	/**
	 * Get eoncOriginalCopy
	 */
	@Column(name = "EONC_ORIGINAL_COPY")
	public Long getEoncOriginalCopy() {
		return eoncOriginalCopy;
	}

	/**
	 * Set eoncOriginalCopy
	 */
	public void setEoncOriginalCopy(Long eoncOriginalCopy) {
		this.eoncOriginalCopy = eoncOriginalCopy;
		addValidField("eoncOriginalCopy");
	}

}
