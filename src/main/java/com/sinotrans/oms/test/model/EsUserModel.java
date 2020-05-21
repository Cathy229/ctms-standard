package com.sinotrans.oms.test.model;

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
 * Model class for EsUser
 */
@Entity
@Table(name = "ES_USER")
public class EsUserModel extends BaseModel implements OperationLog {

	//esusId
	private Long esusId;
	//esusEscoId
	private Long esusEscoId;
	//esusIsSuperuser
	private String esusIsSuperuser;
	//esusEsdeId
	private Long esusEsdeId;
	//esusTemplateId
	private Long esusTemplateId;
	//esusDefaultEsstId
	private Long esusDefaultEsstId;
	//esusDefaultProjectId
	private Long esusDefaultProjectId;
	//esusLoginName
	private String esusLoginName;
	//esusLoginPwd
	private String esusLoginPwd;
	//esusUserNameCn
	private String esusUserNameCn;
	//esusUserNameEn
	private String esusUserNameEn;
	//esusEmail
	private String esusEmail;
	//esusTel
	private String esusTel;
	//esusExtPhone
	private String esusExtPhone;
	//esusMobile
	private String esusMobile;
	//esusFax
	private String esusFax;
	//esusIsenable
	private String esusIsenable;
	//esusRemark
	private String esusRemark;
	//esusSubstr1
	private String esusSubstr1;
	//esusSubstr2
	private String esusSubstr2;
	//esusSubstr3
	private String esusSubstr3;
	//esusSubstr4
	private String esusSubstr4;
	//esusSubstr5
	private String esusSubstr5;
	//esusSubstr6
	private String esusSubstr6;
	//esusSubstr7
	private String esusSubstr7;
	//esusSubstr8
	private String esusSubstr8;
	//esusSubdate1
	private Date esusSubdate1;
	//esusSubdate2
	private Date esusSubdate2;
	//esusSubdate3
	private Date esusSubdate3;
	//esusSubdate4
	private Date esusSubdate4;
	//esusSubnum1
	private Long esusSubnum1;
	//esusSubnum2
	private Long esusSubnum2;
	//esusSubnum3
	private Long esusSubnum3;
	//esusSubnum4
	private Long esusSubnum4;
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
	//esusIsSalesman
	private String esusIsSalesman;
	//esusBmsEbsmCode
	private String esusBmsEbsmCode;
	//esusBmsEbsmCode2
	private String esusBmsEbsmCode2;

	/**
	 * Get esusId
	 */
	@Column(name = "ESUS_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEsusId() {
		return esusId;
	}

	/**
	 * Set esusId
	 */
	public void setEsusId(Long esusId) {
		this.esusId = esusId;
		addValidField("esusId");
	}

	/**
	 * Get esusEscoId
	 */
	@Column(name = "ESUS_ESCO_ID")
	public Long getEsusEscoId() {
		return esusEscoId;
	}

	/**
	 * Set esusEscoId
	 */
	public void setEsusEscoId(Long esusEscoId) {
		this.esusEscoId = esusEscoId;
		addValidField("esusEscoId");
	}

	/**
	 * Get esusIsSuperuser
	 */
	@Column(name = "ESUS_IS_SUPERUSER")
	public String getEsusIsSuperuser() {
		return esusIsSuperuser;
	}

	/**
	 * Set esusIsSuperuser
	 */
	public void setEsusIsSuperuser(String esusIsSuperuser) {
		this.esusIsSuperuser = esusIsSuperuser;
		addValidField("esusIsSuperuser");
	}

	/**
	 * Get esusEsdeId
	 */
	@Column(name = "ESUS_ESDE_ID")
	public Long getEsusEsdeId() {
		return esusEsdeId;
	}

	/**
	 * Set esusEsdeId
	 */
	public void setEsusEsdeId(Long esusEsdeId) {
		this.esusEsdeId = esusEsdeId;
		addValidField("esusEsdeId");
	}

	/**
	 * Get esusTemplateId
	 */
	@Column(name = "ESUS_TEMPLATE_ID")
	public Long getEsusTemplateId() {
		return esusTemplateId;
	}

	/**
	 * Set esusTemplateId
	 */
	public void setEsusTemplateId(Long esusTemplateId) {
		this.esusTemplateId = esusTemplateId;
		addValidField("esusTemplateId");
	}

	/**
	 * Get esusDefaultEsstId
	 */
	@Column(name = "ESUS_DEFAULT_ESST_ID")
	public Long getEsusDefaultEsstId() {
		return esusDefaultEsstId;
	}

	/**
	 * Set esusDefaultEsstId
	 */
	public void setEsusDefaultEsstId(Long esusDefaultEsstId) {
		this.esusDefaultEsstId = esusDefaultEsstId;
		addValidField("esusDefaultEsstId");
	}

	/**
	 * Get esusDefaultProjectId
	 */
	@Column(name = "ESUS_DEFAULT_PROJECT_ID")
	public Long getEsusDefaultProjectId() {
		return esusDefaultProjectId;
	}

	/**
	 * Set esusDefaultProjectId
	 */
	public void setEsusDefaultProjectId(Long esusDefaultProjectId) {
		this.esusDefaultProjectId = esusDefaultProjectId;
		addValidField("esusDefaultProjectId");
	}

	/**
	 * Get esusLoginName
	 */
	@Column(name = "ESUS_LOGIN_NAME")
	public String getEsusLoginName() {
		return esusLoginName;
	}

	/**
	 * Set esusLoginName
	 */
	public void setEsusLoginName(String esusLoginName) {
		this.esusLoginName = esusLoginName;
		addValidField("esusLoginName");
	}

	/**
	 * Get esusLoginPwd
	 */
	@Column(name = "ESUS_LOGIN_PWD")
	public String getEsusLoginPwd() {
		return esusLoginPwd;
	}

	/**
	 * Set esusLoginPwd
	 */
	public void setEsusLoginPwd(String esusLoginPwd) {
		this.esusLoginPwd = esusLoginPwd;
		addValidField("esusLoginPwd");
	}

	/**
	 * Get esusUserNameCn
	 */
	@Column(name = "ESUS_USER_NAME_CN")
	public String getEsusUserNameCn() {
		return esusUserNameCn;
	}

	/**
	 * Set esusUserNameCn
	 */
	public void setEsusUserNameCn(String esusUserNameCn) {
		this.esusUserNameCn = esusUserNameCn;
		addValidField("esusUserNameCn");
	}

	/**
	 * Get esusUserNameEn
	 */
	@Column(name = "ESUS_USER_NAME_EN")
	public String getEsusUserNameEn() {
		return esusUserNameEn;
	}

	/**
	 * Set esusUserNameEn
	 */
	public void setEsusUserNameEn(String esusUserNameEn) {
		this.esusUserNameEn = esusUserNameEn;
		addValidField("esusUserNameEn");
	}

	/**
	 * Get esusEmail
	 */
	@Column(name = "ESUS_EMAIL")
	public String getEsusEmail() {
		return esusEmail;
	}

	/**
	 * Set esusEmail
	 */
	public void setEsusEmail(String esusEmail) {
		this.esusEmail = esusEmail;
		addValidField("esusEmail");
	}

	/**
	 * Get esusTel
	 */
	@Column(name = "ESUS_TEL")
	public String getEsusTel() {
		return esusTel;
	}

	/**
	 * Set esusTel
	 */
	public void setEsusTel(String esusTel) {
		this.esusTel = esusTel;
		addValidField("esusTel");
	}

	/**
	 * Get esusExtPhone
	 */
	@Column(name = "ESUS_EXT_PHONE")
	public String getEsusExtPhone() {
		return esusExtPhone;
	}

	/**
	 * Set esusExtPhone
	 */
	public void setEsusExtPhone(String esusExtPhone) {
		this.esusExtPhone = esusExtPhone;
		addValidField("esusExtPhone");
	}

	/**
	 * Get esusMobile
	 */
	@Column(name = "ESUS_MOBILE")
	public String getEsusMobile() {
		return esusMobile;
	}

	/**
	 * Set esusMobile
	 */
	public void setEsusMobile(String esusMobile) {
		this.esusMobile = esusMobile;
		addValidField("esusMobile");
	}

	/**
	 * Get esusFax
	 */
	@Column(name = "ESUS_FAX")
	public String getEsusFax() {
		return esusFax;
	}

	/**
	 * Set esusFax
	 */
	public void setEsusFax(String esusFax) {
		this.esusFax = esusFax;
		addValidField("esusFax");
	}

	/**
	 * Get esusIsenable
	 */
	@Column(name = "ESUS_ISENABLE")
	public String getEsusIsenable() {
		return esusIsenable;
	}

	/**
	 * Set esusIsenable
	 */
	public void setEsusIsenable(String esusIsenable) {
		this.esusIsenable = esusIsenable;
		addValidField("esusIsenable");
	}

	/**
	 * Get esusRemark
	 */
	@Column(name = "ESUS_REMARK")
	public String getEsusRemark() {
		return esusRemark;
	}

	/**
	 * Set esusRemark
	 */
	public void setEsusRemark(String esusRemark) {
		this.esusRemark = esusRemark;
		addValidField("esusRemark");
	}

	/**
	 * Get esusSubstr1
	 */
	@Column(name = "ESUS_SUBSTR1")
	public String getEsusSubstr1() {
		return esusSubstr1;
	}

	/**
	 * Set esusSubstr1
	 */
	public void setEsusSubstr1(String esusSubstr1) {
		this.esusSubstr1 = esusSubstr1;
		addValidField("esusSubstr1");
	}

	/**
	 * Get esusSubstr2
	 */
	@Column(name = "ESUS_SUBSTR2")
	public String getEsusSubstr2() {
		return esusSubstr2;
	}

	/**
	 * Set esusSubstr2
	 */
	public void setEsusSubstr2(String esusSubstr2) {
		this.esusSubstr2 = esusSubstr2;
		addValidField("esusSubstr2");
	}

	/**
	 * Get esusSubstr3
	 */
	@Column(name = "ESUS_SUBSTR3")
	public String getEsusSubstr3() {
		return esusSubstr3;
	}

	/**
	 * Set esusSubstr3
	 */
	public void setEsusSubstr3(String esusSubstr3) {
		this.esusSubstr3 = esusSubstr3;
		addValidField("esusSubstr3");
	}

	/**
	 * Get esusSubstr4
	 */
	@Column(name = "ESUS_SUBSTR4")
	public String getEsusSubstr4() {
		return esusSubstr4;
	}

	/**
	 * Set esusSubstr4
	 */
	public void setEsusSubstr4(String esusSubstr4) {
		this.esusSubstr4 = esusSubstr4;
		addValidField("esusSubstr4");
	}

	/**
	 * Get esusSubstr5
	 */
	@Column(name = "ESUS_SUBSTR5")
	public String getEsusSubstr5() {
		return esusSubstr5;
	}

	/**
	 * Set esusSubstr5
	 */
	public void setEsusSubstr5(String esusSubstr5) {
		this.esusSubstr5 = esusSubstr5;
		addValidField("esusSubstr5");
	}

	/**
	 * Get esusSubstr6
	 */
	@Column(name = "ESUS_SUBSTR6")
	public String getEsusSubstr6() {
		return esusSubstr6;
	}

	/**
	 * Set esusSubstr6
	 */
	public void setEsusSubstr6(String esusSubstr6) {
		this.esusSubstr6 = esusSubstr6;
		addValidField("esusSubstr6");
	}

	/**
	 * Get esusSubstr7
	 */
	@Column(name = "ESUS_SUBSTR7")
	public String getEsusSubstr7() {
		return esusSubstr7;
	}

	/**
	 * Set esusSubstr7
	 */
	public void setEsusSubstr7(String esusSubstr7) {
		this.esusSubstr7 = esusSubstr7;
		addValidField("esusSubstr7");
	}

	/**
	 * Get esusSubstr8
	 */
	@Column(name = "ESUS_SUBSTR8")
	public String getEsusSubstr8() {
		return esusSubstr8;
	}

	/**
	 * Set esusSubstr8
	 */
	public void setEsusSubstr8(String esusSubstr8) {
		this.esusSubstr8 = esusSubstr8;
		addValidField("esusSubstr8");
	}

	/**
	 * Get esusSubdate1
	 */
	@Column(name = "ESUS_SUBDATE1")
	public Date getEsusSubdate1() {
		return esusSubdate1;
	}

	/**
	 * Set esusSubdate1
	 */
	public void setEsusSubdate1(Date esusSubdate1) {
		this.esusSubdate1 = esusSubdate1;
		addValidField("esusSubdate1");
	}

	/**
	 * Get esusSubdate2
	 */
	@Column(name = "ESUS_SUBDATE2")
	public Date getEsusSubdate2() {
		return esusSubdate2;
	}

	/**
	 * Set esusSubdate2
	 */
	public void setEsusSubdate2(Date esusSubdate2) {
		this.esusSubdate2 = esusSubdate2;
		addValidField("esusSubdate2");
	}

	/**
	 * Get esusSubdate3
	 */
	@Column(name = "ESUS_SUBDATE3")
	public Date getEsusSubdate3() {
		return esusSubdate3;
	}

	/**
	 * Set esusSubdate3
	 */
	public void setEsusSubdate3(Date esusSubdate3) {
		this.esusSubdate3 = esusSubdate3;
		addValidField("esusSubdate3");
	}

	/**
	 * Get esusSubdate4
	 */
	@Column(name = "ESUS_SUBDATE4")
	public Date getEsusSubdate4() {
		return esusSubdate4;
	}

	/**
	 * Set esusSubdate4
	 */
	public void setEsusSubdate4(Date esusSubdate4) {
		this.esusSubdate4 = esusSubdate4;
		addValidField("esusSubdate4");
	}

	/**
	 * Get esusSubnum1
	 */
	@Column(name = "ESUS_SUBNUM1")
	public Long getEsusSubnum1() {
		return esusSubnum1;
	}

	/**
	 * Set esusSubnum1
	 */
	public void setEsusSubnum1(Long esusSubnum1) {
		this.esusSubnum1 = esusSubnum1;
		addValidField("esusSubnum1");
	}

	/**
	 * Get esusSubnum2
	 */
	@Column(name = "ESUS_SUBNUM2")
	public Long getEsusSubnum2() {
		return esusSubnum2;
	}

	/**
	 * Set esusSubnum2
	 */
	public void setEsusSubnum2(Long esusSubnum2) {
		this.esusSubnum2 = esusSubnum2;
		addValidField("esusSubnum2");
	}

	/**
	 * Get esusSubnum3
	 */
	@Column(name = "ESUS_SUBNUM3")
	public Long getEsusSubnum3() {
		return esusSubnum3;
	}

	/**
	 * Set esusSubnum3
	 */
	public void setEsusSubnum3(Long esusSubnum3) {
		this.esusSubnum3 = esusSubnum3;
		addValidField("esusSubnum3");
	}

	/**
	 * Get esusSubnum4
	 */
	@Column(name = "ESUS_SUBNUM4")
	public Long getEsusSubnum4() {
		return esusSubnum4;
	}

	/**
	 * Set esusSubnum4
	 */
	public void setEsusSubnum4(Long esusSubnum4) {
		this.esusSubnum4 = esusSubnum4;
		addValidField("esusSubnum4");
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
	 * Get esusIsSalesman
	 */
	@Column(name = "ESUS_IS_SALESMAN")
	public String getEsusIsSalesman() {
		return esusIsSalesman;
	}

	/**
	 * Set esusIsSalesman
	 */
	public void setEsusIsSalesman(String esusIsSalesman) {
		this.esusIsSalesman = esusIsSalesman;
		addValidField("esusIsSalesman");
	}

	/**
	 * Get esusBmsEbsmCode
	 */
	@Column(name = "ESUS_BMS_EBSM_CODE")
	public String getEsusBmsEbsmCode() {
		return esusBmsEbsmCode;
	}

	/**
	 * Set esusBmsEbsmCode
	 */
	public void setEsusBmsEbsmCode(String esusBmsEbsmCode) {
		this.esusBmsEbsmCode = esusBmsEbsmCode;
		addValidField("esusBmsEbsmCode");
	}

	/**
	 * Get esusBmsEbsmCode2
	 */
	@Column(name = "ESUS_BMS_EBSM_CODE2")
	public String getEsusBmsEbsmCode2() {
		return esusBmsEbsmCode2;
	}

	/**
	 * Set esusBmsEbsmCode2
	 */
	public void setEsusBmsEbsmCode2(String esusBmsEbsmCode2) {
		this.esusBmsEbsmCode2 = esusBmsEbsmCode2;
		addValidField("esusBmsEbsmCode2");
	}

}