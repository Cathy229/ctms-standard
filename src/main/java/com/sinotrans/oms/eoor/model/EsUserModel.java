package com.sinotrans.oms.eoor.model;

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

@Entity
@Table(name = "ES_USER")
public class EsUserModel extends BaseModel implements OperationLog {

	//用户表主键
	private Integer esusId;
	//公司表主键
	private Integer esusEscoId;
	//所属部门
	private Integer esusEsdeId;
	//用户登录名
	private String esusLoginName;
	//用户登录密码
	private String esusLoginPwd;
	//姓名
	private String esusUserNameCn;
	//英文名
	private String esusUserNameEn;
	//邮箱
	private String esusEmail;
	//电话
	private String esusTel;
	//分机号
	private String esusExtPhone;
	//手机
	private String esusMobile;
	//传真
	private String esusFax;
	//是否激活
	private String esusIsenable;
	//备注
	private String esusRemark;
	//默认模板ID
	private Integer esusTemplateId;
	//预留字段
	private String esusSubstr1;
	//预留字段
	private String esusSubstr2;
	//预留字段
	private String esusSubstr3;
	//预留字段
	private String esusSubstr4;
	//预留字段
	private String esusSubstr5;
	//预留字段
	private String esusSubstr6;
	//预留字段
	private Date esusSubdate1;
	//预留字段
	private Date esusSubdate2;
	//预留字段
	private Date esusSubdate3;
	//时间戳
	private Integer recVer;
	//创建时间
	private Date createTime;
	//创建人
	private String creator;
	//修改时间
	private Date modifyTime;
	//修改人
	private String modifier;
	//默认基地
	private Integer esusDefaultEsstId;
	//默认项目
	private Integer esusDefaultProjectId;
	
	//是否销售人员ESUS_IS_SALESMAN
	private String esusIsSalesman;
	//销售人员代码ESUS_BMS_EBSM_CODE
	private String esusBmsEbsmCode;


	/**
	 * Get 用户表主键
	 */
	@Column(name = "ESUS_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getEsusId() {
		return esusId;
	}

	/**
	 * Set 用户表主键
	 */
	public void setEsusId(Integer esusId) {
		this.esusId = esusId;
		addValidField("esusId");
	}

	/**
	 * Get 公司表主键
	 */
	@Column(name = "ESUS_ESCO_ID")
	public Integer getEsusEscoId() {
		return esusEscoId;
	}

	/**
	 * Set 公司表主键
	 */
	public void setEsusEscoId(Integer esusEscoId) {
		this.esusEscoId = esusEscoId;
		addValidField("esusEscoId");
	}

	/**
	 * Get 所属部门
	 */
	@Column(name = "ESUS_ESDE_ID")
	public Integer getEsusEsdeId() {
		return esusEsdeId;
	}

	/**
	 * Set 所属部门
	 */
	public void setEsusEsdeId(Integer esusEsdeId) {
		this.esusEsdeId = esusEsdeId;
		addValidField("esusEsdeId");
	}

	/**
	 * Get 用户登录名
	 */
	@Column(name = "ESUS_LOGIN_NAME")
	public String getEsusLoginName() {
		return esusLoginName;
	}

	/**
	 * Set 用户登录名
	 */
	public void setEsusLoginName(String esusLoginName) {
		this.esusLoginName = esusLoginName;
		addValidField("esusLoginName");
	}

	/**
	 * Get 用户登录密码
	 */
	@Column(name = "ESUS_LOGIN_PWD")
	public String getEsusLoginPwd() {
		return esusLoginPwd;
	}

	/**
	 * Set 用户登录密码
	 */
	public void setEsusLoginPwd(String esusLoginPwd) {
		this.esusLoginPwd = esusLoginPwd;
		addValidField("esusLoginPwd");
	}

	/**
	 * Get 姓名
	 */
	@Column(name = "ESUS_USER_NAME_CN")
	public String getEsusUserNameCn() {
		return esusUserNameCn;
	}

	/**
	 * Set 姓名
	 */
	public void setEsusUserNameCn(String esusUserNameCn) {
		this.esusUserNameCn = esusUserNameCn;
		addValidField("esusUserNameCn");
	}

	/**
	 * Get 英文名
	 */
	@Column(name = "ESUS_USER_NAME_EN")
	public String getEsusUserNameEn() {
		return esusUserNameEn;
	}

	/**
	 * Set 英文名
	 */
	public void setEsusUserNameEn(String esusUserNameEn) {
		this.esusUserNameEn = esusUserNameEn;
		addValidField("esusUserNameEn");
	}

	/**
	 * Get 邮箱
	 */
	@Column(name = "ESUS_EMAIL")
	public String getEsusEmail() {
		return esusEmail;
	}

	/**
	 * Set 邮箱
	 */
	public void setEsusEmail(String esusEmail) {
		this.esusEmail = esusEmail;
		addValidField("esusEmail");
	}

	/**
	 * Get 电话
	 */
	@Column(name = "ESUS_TEL")
	public String getEsusTel() {
		return esusTel;
	}

	/**
	 * Set 电话
	 */
	public void setEsusTel(String esusTel) {
		this.esusTel = esusTel;
		addValidField("esusTel");
	}

	/**
	 * Get 分机号
	 */
	@Column(name = "ESUS_EXT_PHONE")
	public String getEsusExtPhone() {
		return esusExtPhone;
	}

	/**
	 * Set 分机号
	 */
	public void setEsusExtPhone(String esusExtPhone) {
		this.esusExtPhone = esusExtPhone;
		addValidField("esusExtPhone");
	}

	/**
	 * Get 手机
	 */
	@Column(name = "ESUS_MOBILE")
	public String getEsusMobile() {
		return esusMobile;
	}

	/**
	 * Set 手机
	 */
	public void setEsusMobile(String esusMobile) {
		this.esusMobile = esusMobile;
		addValidField("esusMobile");
	}

	/**
	 * Get 传真
	 */
	@Column(name = "ESUS_FAX")
	public String getEsusFax() {
		return esusFax;
	}

	/**
	 * Set 传真
	 */
	public void setEsusFax(String esusFax) {
		this.esusFax = esusFax;
		addValidField("esusFax");
	}

	/**
	 * Get 是否激活
	 * Y:是
	 * N:否
	 */
	@Column(name = "ESUS_ISENABLE")
	public String getEsusIsenable() {
		return esusIsenable;
	}

	/**
	 * Set 是否激活
	 * Y:是
	 * N:否
	 */
	public void setEsusIsenable(String esusIsenable) {
		this.esusIsenable = esusIsenable;
		addValidField("esusIsenable");
	}

	/**
	 * Get 备注
	 */
	@Column(name = "ESUS_REMARK")
	public String getEsusRemark() {
		return esusRemark;
	}

	/**
	 * Set 备注
	 */
	public void setEsusRemark(String esusRemark) {
		this.esusRemark = esusRemark;
		addValidField("esusRemark");
	}

	/**
	 * Get 默认模板ID
	 */
	@Column(name = "ESUS_TEMPLATE_ID")
	public Integer getEsusTemplateId() {
		return esusTemplateId;
	}

	/**
	 * Set 默认模板ID
	 */
	public void setEsusTemplateId(Integer esusTemplateId) {
		this.esusTemplateId = esusTemplateId;
		addValidField("esusTemplateId");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESUS_SUBSTR1")
	public String getEsusSubstr1() {
		return esusSubstr1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsusSubstr1(String esusSubstr1) {
		this.esusSubstr1 = esusSubstr1;
		addValidField("esusSubstr1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESUS_SUBSTR2")
	public String getEsusSubstr2() {
		return esusSubstr2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsusSubstr2(String esusSubstr2) {
		this.esusSubstr2 = esusSubstr2;
		addValidField("esusSubstr2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESUS_SUBSTR3")
	public String getEsusSubstr3() {
		return esusSubstr3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsusSubstr3(String esusSubstr3) {
		this.esusSubstr3 = esusSubstr3;
		addValidField("esusSubstr3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESUS_SUBSTR4")
	public String getEsusSubstr4() {
		return esusSubstr4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsusSubstr4(String esusSubstr4) {
		this.esusSubstr4 = esusSubstr4;
		addValidField("esusSubstr4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESUS_SUBSTR5")
	public String getEsusSubstr5() {
		return esusSubstr5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsusSubstr5(String esusSubstr5) {
		this.esusSubstr5 = esusSubstr5;
		addValidField("esusSubstr5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESUS_SUBSTR6")
	public String getEsusSubstr6() {
		return esusSubstr6;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsusSubstr6(String esusSubstr6) {
		this.esusSubstr6 = esusSubstr6;
		addValidField("esusSubstr6");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESUS_SUBDATE1")
	public Date getEsusSubdate1() {
		return esusSubdate1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsusSubdate1(Date esusSubdate1) {
		this.esusSubdate1 = esusSubdate1;
		addValidField("esusSubdate1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESUS_SUBDATE2")
	public Date getEsusSubdate2() {
		return esusSubdate2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsusSubdate2(Date esusSubdate2) {
		this.esusSubdate2 = esusSubdate2;
		addValidField("esusSubdate2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESUS_SUBDATE3")
	public Date getEsusSubdate3() {
		return esusSubdate3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsusSubdate3(Date esusSubdate3) {
		this.esusSubdate3 = esusSubdate3;
		addValidField("esusSubdate3");
	}

	/**
	 * Get 时间戳
	 */
	@Column(name = "REC_VER")
	@Version
	public Integer getRecVer() {
		return recVer;
	}

	/**
	 * Set 时间戳
	 */
	public void setRecVer(Integer recVer) {
		this.recVer = recVer;
		addValidField("recVer");
	}

	/**
	 * Get 创建时间
	 */
	@Column(name = "CREATE_TIME")
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * Set 创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
		addValidField("createTime");
	}

	/**
	 * Get 创建人
	 */
	@Column(name = "CREATOR")
	public String getCreator() {
		return creator;
	}

	/**
	 * Set 创建人
	 */
	public void setCreator(String creator) {
		this.creator = creator;
		addValidField("creator");
	}

	/**
	 * Get 修改时间
	 */
	@Column(name = "MODIFY_TIME")
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * Set 修改时间
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
		addValidField("modifyTime");
	}

	/**
	 * Get 修改人
	 */
	@Column(name = "MODIFIER")
	public String getModifier() {
		return modifier;
	}

	/**
	 * Set 修改人
	 */
	public void setModifier(String modifier) {
		this.modifier = modifier;
		addValidField("modifier");
	}
	/**
	 * Get 默认基地
	 */
	@Column(name = "ESUS_DEFAULT_ESST_ID")
	public Integer getEsusDefaultEsstId() {
		return esusDefaultEsstId;
	}
	/**
	 * Set 默认基地
	 */
	public void setEsusDefaultEsstId(Integer esusDefaultEsstId) {
		this.esusDefaultEsstId = esusDefaultEsstId;
		addValidField("esusDefaultEsstId");
	}
	/**
	 * Get 默认项目
	 */
	@Column(name = "ESUS_DEFAULT_PROJECT_ID")
	public Integer getEsusDefaultProjectId() {
		return esusDefaultProjectId;
	}

	/**
	 * Set 默认项目
	 */
	public void setEsusDefaultProjectId(Integer esusDefaultProjectId) {
		this.esusDefaultProjectId = esusDefaultProjectId;
		addValidField("esusDefaultProjectId");
	}
	@Column(name = "ESUS_IS_SALESMAN")
	public String getEsusIsSalesman() {
		return esusIsSalesman;
	}

	public void setEsusIsSalesman(String esusIsSalesman) {
		this.esusIsSalesman = esusIsSalesman;
		addValidField("esusIsSalesman");
	}
	@Column(name = "ESUS_BMS_EBSM_CODE")
	public String getEsusBmsEbsmCode() {
		return esusBmsEbsmCode;
	}

	public void setEsusBmsEbsmCode(String esusBmsEbsmCode) {
		this.esusBmsEbsmCode = esusBmsEbsmCode;
		addValidField("esusBmsEbsmCode");
	}
}