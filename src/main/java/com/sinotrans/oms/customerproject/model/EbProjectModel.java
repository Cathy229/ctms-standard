package com.sinotrans.oms.customerproject.model;

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
 * Model class for EbProject
 */
@Entity
@Table(name = "EB_PROJECT")
public class EbProjectModel extends BaseModel implements OperationLog {

	//ebpjId
	private Long ebpjId;
	//ebpjEscoId
	private Long ebpjEscoId;
	//ebpjQuickCode
	private String ebpjQuickCode;
	//ebpjProjectCode
	private String ebpjProjectCode;
	//ebpjProjectName
	private String ebpjProjectName;
	//ebpjProjectStatus
	private String ebpjProjectStatus;
	//ebpjProjectDesc
	private String ebpjProjectDesc;
	//ebpjSubstr1
	private String ebpjSubstr1;
	//ebpjSubstr2
	private String ebpjSubstr2;
	//ebpjSubstr3
	private String ebpjSubstr3;
	//ebpjSubstr4
	private String ebpjSubstr4;
	//ebpjSubstr5
	private String ebpjSubstr5;
	//ebpjSubstr6
	private String ebpjSubstr6;
	//ebpjSubstr7
	private String ebpjSubstr7;
	//ebpjSubstr8
	private String ebpjSubstr8;
	//ebpjSubdate1
	private Date ebpjSubdate1;
	//ebpjSubdate2
	private Date ebpjSubdate2;
	//ebpjSubdate3
	private Date ebpjSubdate3;
	//ebpjSubdate4
	private Date ebpjSubdate4;
	//ebpjSubnum1
	private Long ebpjSubnum1;
	//ebpjSubnum2
	private Long ebpjSubnum2;
	//ebpjSubnum3
	private Long ebpjSubnum3;
	//ebpjSubnum4
	private Long ebpjSubnum4;
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
	//ebpjFCode
	private String ebpjFCode;
	//ebpjBmsEbbtCode
	private String ebpjBmsEbbtCode;
	//ebpjBmsEbotCode
	private String ebpjBmsEbotCode;
	//ebpjBmsEsdeDepartmentCode
	private String ebpjBmsEsdeDepartmentCode;
	//ebpjBmsEbsmCode
	private String ebpjBmsEbsmCode;
	//ebpjBmsBusinessClass
	private String ebpjBmsBusinessClass;
	//ebpjBmsAEbcuCustomerNo
	private String ebpjBmsAEbcuCustomerNo;
	//ebpjBmsSEbcuCustomerNo
	private String ebpjBmsSEbcuCustomerNo;
	//ebpjBmsCargoType
	private Long ebpjBmsCargoType;
	//ebpjCommerceType
	private String ebpjCommerceType;
	//ebpjBmsMonitorType
	private Long ebpjBmsMonitorType;
	//ebpjBmsCountType
	private Long ebpjBmsCountType;
	//ebpjNature
	private String ebpjNature;
	//ebpjIndustry0
	private String ebpjIndustry0;
	//ebpjIndustry1
	private String ebpjIndustry1;
	//ebpjIndustry2
	private String ebpjIndustry2;
	//ebpjIndustry3
	private String ebpjIndustry3;
	//ebpjType
	private String ebpjType;
	//ebpjDateReqStart
	private Date ebpjDateReqStart;
	//ebpjDateReqEnd
	private Date ebpjDateReqEnd;
	//ebpjDateStart
	private Date ebpjDateStart;
	//ebpjDateEnd
	private Date ebpjDateEnd;
	//ebpjContracts
	private String ebpjContracts;
	//ebpjPmEsusId
	private Long ebpjPmEsusId;
	//ebpjPmEsusUserNameCn
	private String ebpjPmEsusUserNameCn;
	//ebpjAuditEsusId
	private Long ebpjAuditEsusId;
	//ebpjAuditEsusUserNameCn
	private String ebpjAuditEsusUserNameCn;
	//ebpjAuditDate
	private Date ebpjAuditDate;
	//ebpjAuditDesc
	private String ebpjAuditDesc;
	//ebpjEbplId
	private Long ebpjEbplId;
	//ebpjEbplNameCn
	private String ebpjEbplNameCn;
	//ebpjEbplCode
	private String ebpjEbplCode;
	//ebpjEstimateIncome
	private Long ebpjEstimateIncome;
	//ebpjEstimateQuantity
	private Long ebpjEstimateQuantity;
	//ebpjEstimateOrder
	private String ebpjEstimateOrder;
	//ebpjDefaultEbppId
	private Long ebpjDefaultEbppId;
	//ebpjDefaultEbppCode
	private String ebpjDefaultEbppCode;
	//ebpjDefaultEbppName
	private String ebpjDefaultEbppName;
	//ebpjBusinessType
	private String ebpjBusinessType;
	//ebpjCompanyCode
	private String ebpjCompanyCode;

	/**
	 * Get ebpjId
	 */
	@Column(name = "EBPJ_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbpjId() {
		return ebpjId;
	}

	/**
	 * Set ebpjId
	 */
	public void setEbpjId(Long ebpjId) {
		this.ebpjId = ebpjId;
		addValidField("ebpjId");
	}

	/**
	 * Get ebpjEscoId
	 */
	@Column(name = "EBPJ_ESCO_ID")
	public Long getEbpjEscoId() {
		return ebpjEscoId;
	}

	/**
	 * Set ebpjEscoId
	 */
	public void setEbpjEscoId(Long ebpjEscoId) {
		this.ebpjEscoId = ebpjEscoId;
		addValidField("ebpjEscoId");
	}

	/**
	 * Get ebpjQuickCode
	 */
	@Column(name = "EBPJ_QUICK_CODE")
	public String getEbpjQuickCode() {
		return ebpjQuickCode;
	}

	/**
	 * Set ebpjQuickCode
	 */
	public void setEbpjQuickCode(String ebpjQuickCode) {
		this.ebpjQuickCode = ebpjQuickCode;
		addValidField("ebpjQuickCode");
	}

	/**
	 * Get ebpjProjectCode
	 */
	@Column(name = "EBPJ_PROJECT_CODE")
	public String getEbpjProjectCode() {
		return ebpjProjectCode;
	}

	/**
	 * Set ebpjProjectCode
	 */
	public void setEbpjProjectCode(String ebpjProjectCode) {
		this.ebpjProjectCode = ebpjProjectCode;
		addValidField("ebpjProjectCode");
	}

	/**
	 * Get ebpjProjectName
	 */
	@Column(name = "EBPJ_PROJECT_NAME")
	public String getEbpjProjectName() {
		return ebpjProjectName;
	}

	/**
	 * Set ebpjProjectName
	 */
	public void setEbpjProjectName(String ebpjProjectName) {
		this.ebpjProjectName = ebpjProjectName;
		addValidField("ebpjProjectName");
	}

	/**
	 * Get ebpjProjectStatus
	 */
	@Column(name = "EBPJ_PROJECT_STATUS")
	public String getEbpjProjectStatus() {
		return ebpjProjectStatus;
	}

	/**
	 * Set ebpjProjectStatus
	 */
	public void setEbpjProjectStatus(String ebpjProjectStatus) {
		this.ebpjProjectStatus = ebpjProjectStatus;
		addValidField("ebpjProjectStatus");
	}

	/**
	 * Get ebpjProjectDesc
	 */
	@Column(name = "EBPJ_PROJECT_DESC")
	public String getEbpjProjectDesc() {
		return ebpjProjectDesc;
	}

	/**
	 * Set ebpjProjectDesc
	 */
	public void setEbpjProjectDesc(String ebpjProjectDesc) {
		this.ebpjProjectDesc = ebpjProjectDesc;
		addValidField("ebpjProjectDesc");
	}

	/**
	 * Get ebpjSubstr1
	 */
	@Column(name = "EBPJ_SUBSTR1")
	public String getEbpjSubstr1() {
		return ebpjSubstr1;
	}

	/**
	 * Set ebpjSubstr1
	 */
	public void setEbpjSubstr1(String ebpjSubstr1) {
		this.ebpjSubstr1 = ebpjSubstr1;
		addValidField("ebpjSubstr1");
	}

	/**
	 * Get ebpjSubstr2
	 */
	@Column(name = "EBPJ_SUBSTR2")
	public String getEbpjSubstr2() {
		return ebpjSubstr2;
	}

	/**
	 * Set ebpjSubstr2
	 */
	public void setEbpjSubstr2(String ebpjSubstr2) {
		this.ebpjSubstr2 = ebpjSubstr2;
		addValidField("ebpjSubstr2");
	}

	/**
	 * Get ebpjSubstr3
	 */
	@Column(name = "EBPJ_SUBSTR3")
	public String getEbpjSubstr3() {
		return ebpjSubstr3;
	}

	/**
	 * Set ebpjSubstr3
	 */
	public void setEbpjSubstr3(String ebpjSubstr3) {
		this.ebpjSubstr3 = ebpjSubstr3;
		addValidField("ebpjSubstr3");
	}

	/**
	 * Get ebpjSubstr4
	 */
	@Column(name = "EBPJ_SUBSTR4")
	public String getEbpjSubstr4() {
		return ebpjSubstr4;
	}

	/**
	 * Set ebpjSubstr4
	 */
	public void setEbpjSubstr4(String ebpjSubstr4) {
		this.ebpjSubstr4 = ebpjSubstr4;
		addValidField("ebpjSubstr4");
	}

	/**
	 * Get ebpjSubstr5
	 */
	@Column(name = "EBPJ_SUBSTR5")
	public String getEbpjSubstr5() {
		return ebpjSubstr5;
	}

	/**
	 * Set ebpjSubstr5
	 */
	public void setEbpjSubstr5(String ebpjSubstr5) {
		this.ebpjSubstr5 = ebpjSubstr5;
		addValidField("ebpjSubstr5");
	}

	/**
	 * Get ebpjSubstr6
	 */
	@Column(name = "EBPJ_SUBSTR6")
	public String getEbpjSubstr6() {
		return ebpjSubstr6;
	}

	/**
	 * Set ebpjSubstr6
	 */
	public void setEbpjSubstr6(String ebpjSubstr6) {
		this.ebpjSubstr6 = ebpjSubstr6;
		addValidField("ebpjSubstr6");
	}

	/**
	 * Get ebpjSubstr7
	 */
	@Column(name = "EBPJ_SUBSTR7")
	public String getEbpjSubstr7() {
		return ebpjSubstr7;
	}

	/**
	 * Set ebpjSubstr7
	 */
	public void setEbpjSubstr7(String ebpjSubstr7) {
		this.ebpjSubstr7 = ebpjSubstr7;
		addValidField("ebpjSubstr7");
	}

	/**
	 * Get ebpjSubstr8
	 */
	@Column(name = "EBPJ_SUBSTR8")
	public String getEbpjSubstr8() {
		return ebpjSubstr8;
	}

	/**
	 * Set ebpjSubstr8
	 */
	public void setEbpjSubstr8(String ebpjSubstr8) {
		this.ebpjSubstr8 = ebpjSubstr8;
		addValidField("ebpjSubstr8");
	}

	/**
	 * Get ebpjSubdate1
	 */
	@Column(name = "EBPJ_SUBDATE1")
	public Date getEbpjSubdate1() {
		return ebpjSubdate1;
	}

	/**
	 * Set ebpjSubdate1
	 */
	public void setEbpjSubdate1(Date ebpjSubdate1) {
		this.ebpjSubdate1 = ebpjSubdate1;
		addValidField("ebpjSubdate1");
	}

	/**
	 * Get ebpjSubdate2
	 */
	@Column(name = "EBPJ_SUBDATE2")
	public Date getEbpjSubdate2() {
		return ebpjSubdate2;
	}

	/**
	 * Set ebpjSubdate2
	 */
	public void setEbpjSubdate2(Date ebpjSubdate2) {
		this.ebpjSubdate2 = ebpjSubdate2;
		addValidField("ebpjSubdate2");
	}

	/**
	 * Get ebpjSubdate3
	 */
	@Column(name = "EBPJ_SUBDATE3")
	public Date getEbpjSubdate3() {
		return ebpjSubdate3;
	}

	/**
	 * Set ebpjSubdate3
	 */
	public void setEbpjSubdate3(Date ebpjSubdate3) {
		this.ebpjSubdate3 = ebpjSubdate3;
		addValidField("ebpjSubdate3");
	}

	/**
	 * Get ebpjSubdate4
	 */
	@Column(name = "EBPJ_SUBDATE4")
	public Date getEbpjSubdate4() {
		return ebpjSubdate4;
	}

	/**
	 * Set ebpjSubdate4
	 */
	public void setEbpjSubdate4(Date ebpjSubdate4) {
		this.ebpjSubdate4 = ebpjSubdate4;
		addValidField("ebpjSubdate4");
	}

	/**
	 * Get ebpjSubnum1
	 */
	@Column(name = "EBPJ_SUBNUM1")
	public Long getEbpjSubnum1() {
		return ebpjSubnum1;
	}

	/**
	 * Set ebpjSubnum1
	 */
	public void setEbpjSubnum1(Long ebpjSubnum1) {
		this.ebpjSubnum1 = ebpjSubnum1;
		addValidField("ebpjSubnum1");
	}

	/**
	 * Get ebpjSubnum2
	 */
	@Column(name = "EBPJ_SUBNUM2")
	public Long getEbpjSubnum2() {
		return ebpjSubnum2;
	}

	/**
	 * Set ebpjSubnum2
	 */
	public void setEbpjSubnum2(Long ebpjSubnum2) {
		this.ebpjSubnum2 = ebpjSubnum2;
		addValidField("ebpjSubnum2");
	}

	/**
	 * Get ebpjSubnum3
	 */
	@Column(name = "EBPJ_SUBNUM3")
	public Long getEbpjSubnum3() {
		return ebpjSubnum3;
	}

	/**
	 * Set ebpjSubnum3
	 */
	public void setEbpjSubnum3(Long ebpjSubnum3) {
		this.ebpjSubnum3 = ebpjSubnum3;
		addValidField("ebpjSubnum3");
	}

	/**
	 * Get ebpjSubnum4
	 */
	@Column(name = "EBPJ_SUBNUM4")
	public Long getEbpjSubnum4() {
		return ebpjSubnum4;
	}

	/**
	 * Set ebpjSubnum4
	 */
	public void setEbpjSubnum4(Long ebpjSubnum4) {
		this.ebpjSubnum4 = ebpjSubnum4;
		addValidField("ebpjSubnum4");
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
	 * Get ebpjFCode
	 */
	@Column(name = "EBPJ_F_CODE")
	public String getEbpjFCode() {
		return ebpjFCode;
	}

	/**
	 * Set ebpjFCode
	 */
	public void setEbpjFCode(String ebpjFCode) {
		this.ebpjFCode = ebpjFCode;
		addValidField("ebpjFCode");
	}

	/**
	 * Get ebpjBmsEbbtCode
	 */
	@Column(name = "EBPJ_BMS_EBBT_CODE")
	public String getEbpjBmsEbbtCode() {
		return ebpjBmsEbbtCode;
	}

	/**
	 * Set ebpjBmsEbbtCode
	 */
	public void setEbpjBmsEbbtCode(String ebpjBmsEbbtCode) {
		this.ebpjBmsEbbtCode = ebpjBmsEbbtCode;
		addValidField("ebpjBmsEbbtCode");
	}

	/**
	 * Get ebpjBmsEbotCode
	 */
	@Column(name = "EBPJ_BMS_EBOT_CODE")
	public String getEbpjBmsEbotCode() {
		return ebpjBmsEbotCode;
	}

	/**
	 * Set ebpjBmsEbotCode
	 */
	public void setEbpjBmsEbotCode(String ebpjBmsEbotCode) {
		this.ebpjBmsEbotCode = ebpjBmsEbotCode;
		addValidField("ebpjBmsEbotCode");
	}

	/**
	 * Get ebpjBmsEsdeDepartmentCode
	 */
	@Column(name = "EBPJ_BMS_ESDE_DEPARTMENT_CODE")
	public String getEbpjBmsEsdeDepartmentCode() {
		return ebpjBmsEsdeDepartmentCode;
	}

	/**
	 * Set ebpjBmsEsdeDepartmentCode
	 */
	public void setEbpjBmsEsdeDepartmentCode(String ebpjBmsEsdeDepartmentCode) {
		this.ebpjBmsEsdeDepartmentCode = ebpjBmsEsdeDepartmentCode;
		addValidField("ebpjBmsEsdeDepartmentCode");
	}

	/**
	 * Get ebpjBmsEbsmCode
	 */
	@Column(name = "EBPJ_BMS_EBSM_CODE")
	public String getEbpjBmsEbsmCode() {
		return ebpjBmsEbsmCode;
	}

	/**
	 * Set ebpjBmsEbsmCode
	 */
	public void setEbpjBmsEbsmCode(String ebpjBmsEbsmCode) {
		this.ebpjBmsEbsmCode = ebpjBmsEbsmCode;
		addValidField("ebpjBmsEbsmCode");
	}

	/**
	 * Get ebpjBmsBusinessClass
	 */
	@Column(name = "EBPJ_BMS_BUSINESS_CLASS")
	public String getEbpjBmsBusinessClass() {
		return ebpjBmsBusinessClass;
	}

	/**
	 * Set ebpjBmsBusinessClass
	 */
	public void setEbpjBmsBusinessClass(String ebpjBmsBusinessClass) {
		this.ebpjBmsBusinessClass = ebpjBmsBusinessClass;
		addValidField("ebpjBmsBusinessClass");
	}

	/**
	 * Get ebpjBmsAEbcuCustomerNo
	 */
	@Column(name = "EBPJ_BMS_A_EBCU_CUSTOMER_NO")
	public String getEbpjBmsAEbcuCustomerNo() {
		return ebpjBmsAEbcuCustomerNo;
	}

	/**
	 * Set ebpjBmsAEbcuCustomerNo
	 */
	public void setEbpjBmsAEbcuCustomerNo(String ebpjBmsAEbcuCustomerNo) {
		this.ebpjBmsAEbcuCustomerNo = ebpjBmsAEbcuCustomerNo;
		addValidField("ebpjBmsAEbcuCustomerNo");
	}

	/**
	 * Get ebpjBmsSEbcuCustomerNo
	 */
	@Column(name = "EBPJ_BMS_S_EBCU_CUSTOMER_NO")
	public String getEbpjBmsSEbcuCustomerNo() {
		return ebpjBmsSEbcuCustomerNo;
	}

	/**
	 * Set ebpjBmsSEbcuCustomerNo
	 */
	public void setEbpjBmsSEbcuCustomerNo(String ebpjBmsSEbcuCustomerNo) {
		this.ebpjBmsSEbcuCustomerNo = ebpjBmsSEbcuCustomerNo;
		addValidField("ebpjBmsSEbcuCustomerNo");
	}

	/**
	 * Get ebpjBmsCargoType
	 */
	@Column(name = "EBPJ_BMS_CARGO_TYPE")
	public Long getEbpjBmsCargoType() {
		return ebpjBmsCargoType;
	}

	/**
	 * Set ebpjBmsCargoType
	 */
	public void setEbpjBmsCargoType(Long ebpjBmsCargoType) {
		this.ebpjBmsCargoType = ebpjBmsCargoType;
		addValidField("ebpjBmsCargoType");
	}

	/**
	 * Get ebpjCommerceType
	 */
	@Column(name = "EBPJ_COMMERCE_TYPE")
	public String getEbpjCommerceType() {
		return ebpjCommerceType;
	}

	/**
	 * Set ebpjCommerceType
	 */
	public void setEbpjCommerceType(String ebpjCommerceType) {
		this.ebpjCommerceType = ebpjCommerceType;
		addValidField("ebpjCommerceType");
	}

	/**
	 * Get ebpjBmsMonitorType
	 */
	@Column(name = "EBPJ_BMS_MONITOR_TYPE")
	public Long getEbpjBmsMonitorType() {
		return ebpjBmsMonitorType;
	}

	/**
	 * Set ebpjBmsMonitorType
	 */
	public void setEbpjBmsMonitorType(Long ebpjBmsMonitorType) {
		this.ebpjBmsMonitorType = ebpjBmsMonitorType;
		addValidField("ebpjBmsMonitorType");
	}

	/**
	 * Get ebpjBmsCountType
	 */
	@Column(name = "EBPJ_BMS_COUNT_TYPE")
	public Long getEbpjBmsCountType() {
		return ebpjBmsCountType;
	}

	/**
	 * Set ebpjBmsCountType
	 */
	public void setEbpjBmsCountType(Long ebpjBmsCountType) {
		this.ebpjBmsCountType = ebpjBmsCountType;
		addValidField("ebpjBmsCountType");
	}

	/**
	 * Get ebpjNature
	 */
	@Column(name = "EBPJ_NATURE")
	public String getEbpjNature() {
		return ebpjNature;
	}

	/**
	 * Set ebpjNature
	 */
	public void setEbpjNature(String ebpjNature) {
		this.ebpjNature = ebpjNature;
		addValidField("ebpjNature");
	}

	/**
	 * Get ebpjIndustry0
	 */
	@Column(name = "EBPJ_INDUSTRY_0")
	public String getEbpjIndustry0() {
		return ebpjIndustry0;
	}

	/**
	 * Set ebpjIndustry0
	 */
	public void setEbpjIndustry0(String ebpjIndustry0) {
		this.ebpjIndustry0 = ebpjIndustry0;
		addValidField("ebpjIndustry0");
	}

	/**
	 * Get ebpjIndustry1
	 */
	@Column(name = "EBPJ_INDUSTRY_1")
	public String getEbpjIndustry1() {
		return ebpjIndustry1;
	}

	/**
	 * Set ebpjIndustry1
	 */
	public void setEbpjIndustry1(String ebpjIndustry1) {
		this.ebpjIndustry1 = ebpjIndustry1;
		addValidField("ebpjIndustry1");
	}

	/**
	 * Get ebpjIndustry2
	 */
	@Column(name = "EBPJ_INDUSTRY_2")
	public String getEbpjIndustry2() {
		return ebpjIndustry2;
	}

	/**
	 * Set ebpjIndustry2
	 */
	public void setEbpjIndustry2(String ebpjIndustry2) {
		this.ebpjIndustry2 = ebpjIndustry2;
		addValidField("ebpjIndustry2");
	}

	/**
	 * Get ebpjIndustry3
	 */
	@Column(name = "EBPJ_INDUSTRY_3")
	public String getEbpjIndustry3() {
		return ebpjIndustry3;
	}

	/**
	 * Set ebpjIndustry3
	 */
	public void setEbpjIndustry3(String ebpjIndustry3) {
		this.ebpjIndustry3 = ebpjIndustry3;
		addValidField("ebpjIndustry3");
	}

	/**
	 * Get ebpjType
	 */
	@Column(name = "EBPJ_TYPE")
	public String getEbpjType() {
		return ebpjType;
	}

	/**
	 * Set ebpjType
	 */
	public void setEbpjType(String ebpjType) {
		this.ebpjType = ebpjType;
		addValidField("ebpjType");
	}

	/**
	 * Get ebpjDateReqStart
	 */
	@Column(name = "EBPJ_DATE_REQ_START")
	public Date getEbpjDateReqStart() {
		return ebpjDateReqStart;
	}

	/**
	 * Set ebpjDateReqStart
	 */
	public void setEbpjDateReqStart(Date ebpjDateReqStart) {
		this.ebpjDateReqStart = ebpjDateReqStart;
		addValidField("ebpjDateReqStart");
	}

	/**
	 * Get ebpjDateReqEnd
	 */
	@Column(name = "EBPJ_DATE_REQ_END")
	public Date getEbpjDateReqEnd() {
		return ebpjDateReqEnd;
	}

	/**
	 * Set ebpjDateReqEnd
	 */
	public void setEbpjDateReqEnd(Date ebpjDateReqEnd) {
		this.ebpjDateReqEnd = ebpjDateReqEnd;
		addValidField("ebpjDateReqEnd");
	}

	/**
	 * Get ebpjDateStart
	 */
	@Column(name = "EBPJ_DATE_START")
	public Date getEbpjDateStart() {
		return ebpjDateStart;
	}

	/**
	 * Set ebpjDateStart
	 */
	public void setEbpjDateStart(Date ebpjDateStart) {
		this.ebpjDateStart = ebpjDateStart;
		addValidField("ebpjDateStart");
	}

	/**
	 * Get ebpjDateEnd
	 */
	@Column(name = "EBPJ_DATE_END")
	public Date getEbpjDateEnd() {
		return ebpjDateEnd;
	}

	/**
	 * Set ebpjDateEnd
	 */
	public void setEbpjDateEnd(Date ebpjDateEnd) {
		this.ebpjDateEnd = ebpjDateEnd;
		addValidField("ebpjDateEnd");
	}

	/**
	 * Get ebpjContracts
	 */
	@Column(name = "EBPJ_CONTRACTS")
	public String getEbpjContracts() {
		return ebpjContracts;
	}

	/**
	 * Set ebpjContracts
	 */
	public void setEbpjContracts(String ebpjContracts) {
		this.ebpjContracts = ebpjContracts;
		addValidField("ebpjContracts");
	}

	/**
	 * Get ebpjPmEsusId
	 */
	@Column(name = "EBPJ_PM_ESUS_ID")
	public Long getEbpjPmEsusId() {
		return ebpjPmEsusId;
	}

	/**
	 * Set ebpjPmEsusId
	 */
	public void setEbpjPmEsusId(Long ebpjPmEsusId) {
		this.ebpjPmEsusId = ebpjPmEsusId;
		addValidField("ebpjPmEsusId");
	}

	/**
	 * Get ebpjPmEsusUserNameCn
	 */
	@Column(name = "EBPJ_PM_ESUS_USER_NAME_CN")
	public String getEbpjPmEsusUserNameCn() {
		return ebpjPmEsusUserNameCn;
	}

	/**
	 * Set ebpjPmEsusUserNameCn
	 */
	public void setEbpjPmEsusUserNameCn(String ebpjPmEsusUserNameCn) {
		this.ebpjPmEsusUserNameCn = ebpjPmEsusUserNameCn;
		addValidField("ebpjPmEsusUserNameCn");
	}

	/**
	 * Get ebpjAuditEsusId
	 */
	@Column(name = "EBPJ_AUDIT_ESUS_ID")
	public Long getEbpjAuditEsusId() {
		return ebpjAuditEsusId;
	}

	/**
	 * Set ebpjAuditEsusId
	 */
	public void setEbpjAuditEsusId(Long ebpjAuditEsusId) {
		this.ebpjAuditEsusId = ebpjAuditEsusId;
		addValidField("ebpjAuditEsusId");
	}

	/**
	 * Get ebpjAuditEsusUserNameCn
	 */
	@Column(name = "EBPJ_AUDIT_ESUS_USER_NAME_CN")
	public String getEbpjAuditEsusUserNameCn() {
		return ebpjAuditEsusUserNameCn;
	}

	/**
	 * Set ebpjAuditEsusUserNameCn
	 */
	public void setEbpjAuditEsusUserNameCn(String ebpjAuditEsusUserNameCn) {
		this.ebpjAuditEsusUserNameCn = ebpjAuditEsusUserNameCn;
		addValidField("ebpjAuditEsusUserNameCn");
	}

	/**
	 * Get ebpjAuditDate
	 */
	@Column(name = "EBPJ_AUDIT_DATE")
	public Date getEbpjAuditDate() {
		return ebpjAuditDate;
	}

	/**
	 * Set ebpjAuditDate
	 */
	public void setEbpjAuditDate(Date ebpjAuditDate) {
		this.ebpjAuditDate = ebpjAuditDate;
		addValidField("ebpjAuditDate");
	}

	/**
	 * Get ebpjAuditDesc
	 */
	@Column(name = "EBPJ_AUDIT_DESC")
	public String getEbpjAuditDesc() {
		return ebpjAuditDesc;
	}

	/**
	 * Set ebpjAuditDesc
	 */
	public void setEbpjAuditDesc(String ebpjAuditDesc) {
		this.ebpjAuditDesc = ebpjAuditDesc;
		addValidField("ebpjAuditDesc");
	}

	/**
	 * Get ebpjEbplId
	 */
	@Column(name = "EBPJ_EBPL_ID")
	public Long getEbpjEbplId() {
		return ebpjEbplId;
	}

	/**
	 * Set ebpjEbplId
	 */
	public void setEbpjEbplId(Long ebpjEbplId) {
		this.ebpjEbplId = ebpjEbplId;
		addValidField("ebpjEbplId");
	}

	/**
	 * Get ebpjEbplNameCn
	 */
	@Column(name = "EBPJ_EBPL_NAME_CN")
	public String getEbpjEbplNameCn() {
		return ebpjEbplNameCn;
	}

	/**
	 * Set ebpjEbplNameCn
	 */
	public void setEbpjEbplNameCn(String ebpjEbplNameCn) {
		this.ebpjEbplNameCn = ebpjEbplNameCn;
		addValidField("ebpjEbplNameCn");
	}

	/**
	 * Get ebpjEbplCode
	 */
	@Column(name = "EBPJ_EBPL_CODE")
	public String getEbpjEbplCode() {
		return ebpjEbplCode;
	}

	/**
	 * Set ebpjEbplCode
	 */
	public void setEbpjEbplCode(String ebpjEbplCode) {
		this.ebpjEbplCode = ebpjEbplCode;
		addValidField("ebpjEbplCode");
	}

	/**
	 * Get ebpjEstimateIncome
	 */
	@Column(name = "EBPJ_ESTIMATE_INCOME")
	public Long getEbpjEstimateIncome() {
		return ebpjEstimateIncome;
	}

	/**
	 * Set ebpjEstimateIncome
	 */
	public void setEbpjEstimateIncome(Long ebpjEstimateIncome) {
		this.ebpjEstimateIncome = ebpjEstimateIncome;
		addValidField("ebpjEstimateIncome");
	}

	/**
	 * Get ebpjEstimateQuantity
	 */
	@Column(name = "EBPJ_ESTIMATE_QUANTITY")
	public Long getEbpjEstimateQuantity() {
		return ebpjEstimateQuantity;
	}

	/**
	 * Set ebpjEstimateQuantity
	 */
	public void setEbpjEstimateQuantity(Long ebpjEstimateQuantity) {
		this.ebpjEstimateQuantity = ebpjEstimateQuantity;
		addValidField("ebpjEstimateQuantity");
	}

	/**
	 * Get ebpjEstimateOrder
	 */
	@Column(name = "EBPJ_ESTIMATE_ORDER")
	public String getEbpjEstimateOrder() {
		return ebpjEstimateOrder;
	}

	/**
	 * Set ebpjEstimateOrder
	 */
	public void setEbpjEstimateOrder(String ebpjEstimateOrder) {
		this.ebpjEstimateOrder = ebpjEstimateOrder;
		addValidField("ebpjEstimateOrder");
	}

	/**
	 * Get ebpjDefaultEbppId
	 */
	@Column(name = "EBPJ_DEFAULT_EBPP_ID")
	public Long getEbpjDefaultEbppId() {
		return ebpjDefaultEbppId;
	}

	/**
	 * Set ebpjDefaultEbppId
	 */
	public void setEbpjDefaultEbppId(Long ebpjDefaultEbppId) {
		this.ebpjDefaultEbppId = ebpjDefaultEbppId;
		addValidField("ebpjDefaultEbppId");
	}

	/**
	 * Get ebpjDefaultEbppCode
	 */
	@Column(name = "EBPJ_DEFAULT_EBPP_CODE")
	public String getEbpjDefaultEbppCode() {
		return ebpjDefaultEbppCode;
	}

	/**
	 * Set ebpjDefaultEbppCode
	 */
	public void setEbpjDefaultEbppCode(String ebpjDefaultEbppCode) {
		this.ebpjDefaultEbppCode = ebpjDefaultEbppCode;
		addValidField("ebpjDefaultEbppCode");
	}

	/**
	 * Get ebpjDefaultEbppName
	 */
	@Column(name = "EBPJ_DEFAULT_EBPP_NAME")
	public String getEbpjDefaultEbppName() {
		return ebpjDefaultEbppName;
	}

	/**
	 * Set ebpjDefaultEbppName
	 */
	public void setEbpjDefaultEbppName(String ebpjDefaultEbppName) {
		this.ebpjDefaultEbppName = ebpjDefaultEbppName;
		addValidField("ebpjDefaultEbppName");
	}

	/**
	 * Get ebpjBusinessType
	 */
	@Column(name = "EBPJ_BUSINESS_TYPE")
	public String getEbpjBusinessType() {
		return ebpjBusinessType;
	}

	/**
	 * Set ebpjBusinessType
	 */
	public void setEbpjBusinessType(String ebpjBusinessType) {
		this.ebpjBusinessType = ebpjBusinessType;
		addValidField("ebpjBusinessType");
	}

	/**
	 * Get ebpjCompanyCode
	 */
	@Column(name = "EBPJ_COMPANY_CODE")
	public String getEbpjCompanyCode() {
		return ebpjCompanyCode;
	}

	/**
	 * Set ebpjCompanyCode
	 */
	public void setEbpjCompanyCode(String ebpjCompanyCode) {
		this.ebpjCompanyCode = ebpjCompanyCode;
		addValidField("ebpjCompanyCode");
	}

}
