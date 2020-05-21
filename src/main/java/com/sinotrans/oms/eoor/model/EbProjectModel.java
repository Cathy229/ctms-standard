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

/**
 * Model class for 项目表
 */
@Entity
@Table(name = "EB_PROJECT")
public class EbProjectModel extends BaseModel implements OperationLog {

	//项目表主键
	private Integer ebpjId;
	//所属公司
	private Integer ebpjEscoId;
	//快速录入码
	private String ebpjQuickCode;
	//所属客户ID
	private Integer ebpjEbcuId;
	//项目代码
	private String ebpjProjectCode;
	//项目名称
	private String ebpjProjectName;
	//项目状态:1可用
	private String ebpjProjectStatus;
	//项目描述
	private String ebpjProjectDesc;
	//预留字段
	private String ebpjSubstr1;
	//预留字段
	private String ebpjSubstr2;
	//预留字段
	private String ebpjSubstr3;
	//预留字段
	private String ebpjSubstr4;
	//预留字段
	private String ebpjSubstr5;
	//预留字段
	private String ebpjSubstr6;
	//预留字段
	private String ebpjSubstr8;
	//预留字段
	private String ebpjSubstr7;
	//预留字段
	private Date ebpjSubdate1;
	//预留字段
	private Date ebpjSubdate2;
	//预留字段
	private Date ebpjSubdate5;
	//预留字段
	private Date ebpjSubdate4;
	//预留字段
	private Date ebpjSubdate3;
	//预留字段
	private Integer ebpjSubnum3;
	//预留字段
	private Integer ebpjSubnum2;
	//预留字段
	private Integer ebpjSubnum1;
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
	//项目统计组，财务代码
	private String ebpjFCode;
	
	//项目BMS票据代码 
	private String ebpjBmsEbbtCode;
	//项目BMS板块代码 
	private String ebpjBmsEbotCode;
	//项目BMS部门代码 
	private String ebpjBmsEsdeDepartmentCode;
	//项目BMS销售人员代码 
	private String ebpjBmsEbsmCode;
	//项目BMS业务类型代码 
	private String ebpjBmsBusinessClass;
	//项目BMS客户代码 
	private String ebpjBmsAEbcuCustomerNo;
	//项目BMS供应商代码 
	private String ebpjBmsSEbcuCustomerNo;
	//项目BMS货物类型 
	private String ebpjBmsCargoType;
	//项目BMS贸易方式 
	private String ebpjCommerceType;
	//项目BMS监管方式 
	private String ebpjBmsMonitorType;
	//项目BMS计量方式 
	private String ebpjBmsCountType;
	
	// 业务单元隔离字段_1 EBPJ_EBBU_DIST1
	private String ebpjEbbuDist1;
	// 业务单元隔离字段_2 EBPJ_EBBU_DIST2
	private String ebpjEbbuDist2;
	// 业务单元隔离字段_3 EBPJ_EBBU_DIST3
	private String ebpjEbbuDist3;
	// 业务单元隔离字段_4 EBPJ_EBBU_DIST4
	private String ebpjEbbuDist4;
	// 业务单元隔离字段_5 EBPJ_EBBU_DIST5
	private String ebpjEbbuDist5;
	

	@Column(name = "EBPJ_F_CODE")
	public String getEbpjFCode() {
		return ebpjFCode;
	}

	public void setEbpjFCode(String ebpjFCode) {
		this.ebpjFCode = ebpjFCode;
		addValidField("ebpjFCode");
	}

	/**
	 * Get 项目表主键
	 */
	@Column(name = "EBPJ_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getEbpjId() {
		return ebpjId;
	}

	/**
	 * Set 项目表主键
	 */
	public void setEbpjId(Integer ebpjId) {
		this.ebpjId = ebpjId;
		addValidField("ebpjId");
	}

	/**
	 * Get 所属公司
	 */
	@Column(name = "EBPJ_ESCO_ID")
	public Integer getEbpjEscoId() {
		return ebpjEscoId;
	}

	/**
	 * Set 所属公司
	 */
	public void setEbpjEscoId(Integer ebpjEscoId) {
		this.ebpjEscoId = ebpjEscoId;
		addValidField("ebpjEscoId");
	}

	/**
	 * Get 快速录入码
	 */
	@Column(name = "EBPJ_QUICK_CODE")
	public String getEbpjQuickCode() {
		return ebpjQuickCode;
	}

	/**
	 * Set 快速录入码
	 */
	public void setEbpjQuickCode(String ebpjQuickCode) {
		this.ebpjQuickCode = ebpjQuickCode;
		addValidField("ebpjQuickCode");
	}

	/**
	 * Get 所属客户ID
	 * 关联客户表
	 */
	@Column(name = "EBPJ_EBCU_ID")
	public Integer getEbpjEbcuId() {
		return ebpjEbcuId;
	}

	/**
	 * Set 所属客户ID
	 * 关联客户表
	 */
	public void setEbpjEbcuId(Integer ebpjEbcuId) {
		this.ebpjEbcuId = ebpjEbcuId;
		addValidField("ebpjEbcuId");
	}

	/**
	 * Get 项目代码
	 */
	@Column(name = "EBPJ_PROJECT_CODE")
	public String getEbpjProjectCode() {
		return ebpjProjectCode;
	}

	/**
	 * Set 项目代码
	 */
	public void setEbpjProjectCode(String ebpjProjectCode) {
		this.ebpjProjectCode = ebpjProjectCode;
		addValidField("ebpjProjectCode");
	}

	/**
	 * Get 项目名称
	 */
	@Column(name = "EBPJ_PROJECT_NAME")
	public String getEbpjProjectName() {
		return ebpjProjectName;
	}

	/**
	 * Set 项目名称
	 */
	public void setEbpjProjectName(String ebpjProjectName) {
		this.ebpjProjectName = ebpjProjectName;
		addValidField("ebpjProjectName");
	}

	/**
	 * Get 项目状态:1可用
	 * 2不可用
	 */
	@Column(name = "EBPJ_PROJECT_STATUS")
	public String getEbpjProjectStatus() {
		return ebpjProjectStatus;
	}

	/**
	 * Set 项目状态:1可用
	 * 2不可用
	 */
	public void setEbpjProjectStatus(String ebpjProjectStatus) {
		this.ebpjProjectStatus = ebpjProjectStatus;
		addValidField("ebpjProjectStatus");
	}

	/**
	 * Get 项目描述
	 */
	@Column(name = "EBPJ_PROJECT_DESC")
	public String getEbpjProjectDesc() {
		return ebpjProjectDesc;
	}

	/**
	 * Set 项目描述
	 */
	public void setEbpjProjectDesc(String ebpjProjectDesc) {
		this.ebpjProjectDesc = ebpjProjectDesc;
		addValidField("ebpjProjectDesc");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPJ_SUBSTR1")
	public String getEbpjSubstr1() {
		return ebpjSubstr1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpjSubstr1(String ebpjSubstr1) {
		this.ebpjSubstr1 = ebpjSubstr1;
		addValidField("ebpjSubstr1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPJ_SUBSTR2")
	public String getEbpjSubstr2() {
		return ebpjSubstr2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpjSubstr2(String ebpjSubstr2) {
		this.ebpjSubstr2 = ebpjSubstr2;
		addValidField("ebpjSubstr2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPJ_SUBSTR3")
	public String getEbpjSubstr3() {
		return ebpjSubstr3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpjSubstr3(String ebpjSubstr3) {
		this.ebpjSubstr3 = ebpjSubstr3;
		addValidField("ebpjSubstr3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPJ_SUBSTR4")
	public String getEbpjSubstr4() {
		return ebpjSubstr4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpjSubstr4(String ebpjSubstr4) {
		this.ebpjSubstr4 = ebpjSubstr4;
		addValidField("ebpjSubstr4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPJ_SUBSTR5")
	public String getEbpjSubstr5() {
		return ebpjSubstr5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpjSubstr5(String ebpjSubstr5) {
		this.ebpjSubstr5 = ebpjSubstr5;
		addValidField("ebpjSubstr5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPJ_SUBSTR6")
	public String getEbpjSubstr6() {
		return ebpjSubstr6;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpjSubstr6(String ebpjSubstr6) {
		this.ebpjSubstr6 = ebpjSubstr6;
		addValidField("ebpjSubstr6");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPJ_SUBSTR8")
	public String getEbpjSubstr8() {
		return ebpjSubstr8;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpjSubstr8(String ebpjSubstr8) {
		this.ebpjSubstr8 = ebpjSubstr8;
		addValidField("ebpjSubstr8");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPJ_SUBSTR7")
	public String getEbpjSubstr7() {
		return ebpjSubstr7;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpjSubstr7(String ebpjSubstr7) {
		this.ebpjSubstr7 = ebpjSubstr7;
		addValidField("ebpjSubstr7");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPJ_SUBDATE1")
	public Date getEbpjSubdate1() {
		return ebpjSubdate1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpjSubdate1(Date ebpjSubdate1) {
		this.ebpjSubdate1 = ebpjSubdate1;
		addValidField("ebpjSubdate1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPJ_SUBDATE2")
	public Date getEbpjSubdate2() {
		return ebpjSubdate2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpjSubdate2(Date ebpjSubdate2) {
		this.ebpjSubdate2 = ebpjSubdate2;
		addValidField("ebpjSubdate2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPJ_SUBDATE5")
	public Date getEbpjSubdate5() {
		return ebpjSubdate5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpjSubdate5(Date ebpjSubdate5) {
		this.ebpjSubdate5 = ebpjSubdate5;
		addValidField("ebpjSubdate5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPJ_SUBDATE4")
	public Date getEbpjSubdate4() {
		return ebpjSubdate4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpjSubdate4(Date ebpjSubdate4) {
		this.ebpjSubdate4 = ebpjSubdate4;
		addValidField("ebpjSubdate4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPJ_SUBDATE3")
	public Date getEbpjSubdate3() {
		return ebpjSubdate3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpjSubdate3(Date ebpjSubdate3) {
		this.ebpjSubdate3 = ebpjSubdate3;
		addValidField("ebpjSubdate3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPJ_SUBNUM3")
	public Integer getEbpjSubnum3() {
		return ebpjSubnum3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpjSubnum3(Integer ebpjSubnum3) {
		this.ebpjSubnum3 = ebpjSubnum3;
		addValidField("ebpjSubnum3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPJ_SUBNUM2")
	public Integer getEbpjSubnum2() {
		return ebpjSubnum2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpjSubnum2(Integer ebpjSubnum2) {
		this.ebpjSubnum2 = ebpjSubnum2;
		addValidField("ebpjSubnum2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPJ_SUBNUM1")
	public Integer getEbpjSubnum1() {
		return ebpjSubnum1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpjSubnum1(Integer ebpjSubnum1) {
		this.ebpjSubnum1 = ebpjSubnum1;
		addValidField("ebpjSubnum1");
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
	
	@Column(name = "EBPJ_BMS_EBBT_CODE")
	public String getEbpjBmsEbbtCode() {
		return ebpjBmsEbbtCode;
	}

	public void setEbpjBmsEbbtCode(String ebpjBmsEbbtCode) {
		this.ebpjBmsEbbtCode = ebpjBmsEbbtCode;
		addValidField("ebpjBmsEbbtCode");
	}

	@Column(name = "EBPJ_BMS_EBOT_CODE")
	public String getEbpjBmsEbotCode() {
		return ebpjBmsEbotCode;
	}

	public void setEbpjBmsEbotCode(String ebpjBmsEbotCode) {
		this.ebpjBmsEbotCode = ebpjBmsEbotCode;
		addValidField("ebpjBmsEbotCode");
	}
	
	@Column(name = "EBPJ_BMS_ESDE_DEPARTMENT_CODE")
	public String getEbpjBmsEsdeDepartmentCode() {
		return ebpjBmsEsdeDepartmentCode;
	}

	public void setEbpjBmsEsdeDepartmentCode(String ebpjBmsEsdeDepartmentCode) {
		this.ebpjBmsEsdeDepartmentCode = ebpjBmsEsdeDepartmentCode;
		addValidField("ebpjBmsEsdeDepartmentCode");
	}

	@Column(name = "EBPJ_BMS_EBSM_CODE")
	public String getEbpjBmsEbsmCode() {
		return ebpjBmsEbsmCode;
	}

	public void setEbpjBmsEbsmCode(String ebpjBmsEbsmCode) {
		this.ebpjBmsEbsmCode = ebpjBmsEbsmCode;
		addValidField("ebpjBmsEbsmCode");
	}

	@Column(name = "EBPJ_BMS_BUSINESS_CLASS")
	public String getEbpjBmsBusinessClass() {
		return ebpjBmsBusinessClass;
	}

	public void setEbpjBmsBusinessClass(String ebpjBmsBusinessClass) {
		this.ebpjBmsBusinessClass = ebpjBmsBusinessClass;
		addValidField("ebpjBmsBusinessClass");
	}

	@Column(name = "EBPJ_BMS_A_EBCU_CUSTOMER_NO")
	public String getEbpjBmsAEbcuCustomerNo() {
		return ebpjBmsAEbcuCustomerNo;
	}

	public void setEbpjBmsAEbcuCustomerNo(String ebpjBmsAEbcuCustomerNo) {
		this.ebpjBmsAEbcuCustomerNo = ebpjBmsAEbcuCustomerNo;
		addValidField("ebpjBmsAEbcuCustomerNo");
	}

	@Column(name = "EBPJ_BMS_S_EBCU_CUSTOMER_NO")
	public String getEbpjBmsSEbcuCustomerNo() {
		return ebpjBmsSEbcuCustomerNo;
	}

	public void setEbpjBmsSEbcuCustomerNo(String ebpjBmsSEbcuCustomerNo) {
		this.ebpjBmsSEbcuCustomerNo = ebpjBmsSEbcuCustomerNo;
		addValidField("ebpjBmsSEbcuCustomerNo");
	}

	@Column(name = "EBPJ_BMS_CARGO_TYPE")
	public String getEbpjBmsCargoType() {
		return ebpjBmsCargoType;
	}

	public void setEbpjBmsCargoType(String ebpjBmsCargoType) {
		this.ebpjBmsCargoType = ebpjBmsCargoType;
		addValidField("ebpjBmsCargoType");
	}

	@Column(name = "EBPJ_COMMERCE_TYPE")
	public String getEbpjCommerceType() {
		return ebpjCommerceType;
	}

	public void setEbpjCommerceType(String ebpjCommerceType) {
		this.ebpjCommerceType = ebpjCommerceType;
		addValidField("ebpjCommerceType");
	}

	@Column(name = "EBPJ_BMS_MONITOR_TYPE")
	public String getEbpjBmsMonitorType() {
		return ebpjBmsMonitorType;
	}

	public void setEbpjBmsMonitorType(String ebpjBmsMonitorType) {
		this.ebpjBmsMonitorType = ebpjBmsMonitorType;
		addValidField("ebpjBmsMonitorType");
	}

	@Column(name = "EBPJ_BMS_COUNT_TYPE")
	public String getEbpjBmsCountType() {
		return ebpjBmsCountType;
	}

	public void setEbpjBmsCountType(String ebpjBmsCountType) {
		this.ebpjBmsCountType = ebpjBmsCountType;
		addValidField("ebpjBmsCountType");
	}
	

	@Column(name = "EBPJ_EBBU_DIST1")
	public String getEbpjEbbuDist1() {
		return ebpjEbbuDist1;
	}

	public void setEbpjEbbuDist1(String ebpjEbbuDist1) {
		this.ebpjEbbuDist1 = ebpjEbbuDist1;
		addValidField("ebpjEbbuDist1");
	}

	@Column(name = "EBPJ_EBBU_DIST2")
	public String getEbpjEbbuDist2() {
		return ebpjEbbuDist2;
	}

	public void setEbpjEbbuDist2(String ebpjEbbuDist2) {
		this.ebpjEbbuDist2 = ebpjEbbuDist2;
		addValidField("ebpjEbbuDist2");
	}

	@Column(name = "EBPJ_EBBU_DIST3")
	public String getEbpjEbbuDist3() {
		return ebpjEbbuDist3;
	}

	public void setEbpjEbbuDist3(String ebpjEbbuDist3) {
		this.ebpjEbbuDist3 = ebpjEbbuDist3;
		addValidField("ebpjEbbuDist3");
	}

	@Column(name = "EBPJ_EBBU_DIST4")
	public String getEbpjEbbuDist4() {
		return ebpjEbbuDist4;
	}

	public void setEbpjEbbuDist4(String ebpjEbbuDist4) {
		this.ebpjEbbuDist4 = ebpjEbbuDist4;
		addValidField("ebpjEbbuDist4");
	}

	@Column(name = "EBPJ_EBBU_DIST5")
	public String getEbpjEbbuDist5() {
		return ebpjEbbuDist5;
	}

	public void setEbpjEbbuDist5(String ebpjEbbuDist5) {
		this.ebpjEbbuDist5 = ebpjEbbuDist5;
		addValidField("ebpjEbbuDist5");
	}

}
