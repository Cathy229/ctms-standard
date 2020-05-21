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
 * Model class for EbProjectPlan
 */
@Entity
@Table(name = "EB_PROJECT_PLAN")
public class EbProjectPlanModel extends BaseModel implements OperationLog {

	//ebppId
	private Long ebppId;
	//ebppEscoId
	private Long ebppEscoId;
	//ebppEbpjId
	private Long ebppEbpjId;
	//ebppQuickCode
	private String ebppQuickCode;
	//ebppPlanName
	private String ebppPlanName;
	//ebppStatus
	private String ebppStatus;
	//ebppDesc
	private String ebppDesc;
	//ebppCcEbpdId
	private Long ebppCcEbpdId;
	//ebppCcEbpdCode
	private String ebppCcEbpdCode;
	//ebppCcAutomatic
	private String ebppCcAutomatic;
	//ebppLoEbpdId
	private Long ebppLoEbpdId;
	//ebppLoEbpdCode
	private String ebppLoEbpdCode;
	//ebppLoAutomatic
	private String ebppLoAutomatic;
	//ebppSubstr1
	private String ebppSubstr1;
	//ebppSubstr2
	private String ebppSubstr2;
	//ebppSubstr3
	private String ebppSubstr3;
	//ebppSubstr4
	private String ebppSubstr4;
	//ebppSubstr5
	private String ebppSubstr5;
	//ebppSubstr6
	private String ebppSubstr6;
	//ebppSubstr7
	private String ebppSubstr7;
	//ebppSubstr8
	private String ebppSubstr8;
	//ebppSubdate1
	private Date ebppSubdate1;
	//ebppSubdate2
	private Date ebppSubdate2;
	//ebppSubdate3
	private Date ebppSubdate3;
	//ebppSubdate4
	private Date ebppSubdate4;
	//ebppSubnum1
	private Long ebppSubnum1;
	//ebppSubnum2
	private Long ebppSubnum2;
	//ebppSubnum3
	private Long ebppSubnum3;
	//ebppSubnum4
	private Long ebppSubnum4;
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
	//ebppType
	private String ebppType;
	//ebppOccEbpdId
	private Long ebppOccEbpdId;
	//ebppOccEbpdCode
	private String ebppOccEbpdCode;
	//ebppOccAutomatic
	private String ebppOccAutomatic;
	//ebppCtEbpdId
	private Long ebppCtEbpdId;
	//ebppCtEbpdCode
	private String ebppCtEbpdCode;
	//ebppCtAutomatic
	private String ebppCtAutomatic;
	//ebppBbdEbpdId
	private Long ebppBbdEbpdId;
	//ebppBbdEbpdCode
	private String ebppBbdEbpdCode;
	//ebppBbdType
	private Long ebppBbdType;
	//ebppStatusTemplate
	private String ebppStatusTemplate;
	//ebppBmsEbbtCode
	private String ebppBmsEbbtCode;
	//ebppBmsEbotCode
	private String ebppBmsEbotCode;
	//ebppBmsBusinessClass
	private String ebppBmsBusinessClass;
	//ebppBusinessType
	private String ebppBusinessType;

	/**
	 * Get ebppId
	 */
	@Column(name = "EBPP_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbppId() {
		return ebppId;
	}

	/**
	 * Set ebppId
	 */
	public void setEbppId(Long ebppId) {
		this.ebppId = ebppId;
		addValidField("ebppId");
	}

	/**
	 * Get ebppEscoId
	 */
	@Column(name = "EBPP_ESCO_ID")
	public Long getEbppEscoId() {
		return ebppEscoId;
	}

	/**
	 * Set ebppEscoId
	 */
	public void setEbppEscoId(Long ebppEscoId) {
		this.ebppEscoId = ebppEscoId;
		addValidField("ebppEscoId");
	}

	/**
	 * Get ebppEbpjId
	 */
	@Column(name = "EBPP_EBPJ_ID")
	public Long getEbppEbpjId() {
		return ebppEbpjId;
	}

	/**
	 * Set ebppEbpjId
	 */
	public void setEbppEbpjId(Long ebppEbpjId) {
		this.ebppEbpjId = ebppEbpjId;
		addValidField("ebppEbpjId");
	}

	/**
	 * Get ebppQuickCode
	 */
	@Column(name = "EBPP_QUICK_CODE")
	public String getEbppQuickCode() {
		return ebppQuickCode;
	}

	/**
	 * Set ebppQuickCode
	 */
	public void setEbppQuickCode(String ebppQuickCode) {
		this.ebppQuickCode = ebppQuickCode;
		addValidField("ebppQuickCode");
	}

	/**
	 * Get ebppPlanName
	 */
	@Column(name = "EBPP_PLAN_NAME")
	public String getEbppPlanName() {
		return ebppPlanName;
	}

	/**
	 * Set ebppPlanName
	 */
	public void setEbppPlanName(String ebppPlanName) {
		this.ebppPlanName = ebppPlanName;
		addValidField("ebppPlanName");
	}

	/**
	 * Get ebppStatus
	 */
	@Column(name = "EBPP_STATUS")
	public String getEbppStatus() {
		return ebppStatus;
	}

	/**
	 * Set ebppStatus
	 */
	public void setEbppStatus(String ebppStatus) {
		this.ebppStatus = ebppStatus;
		addValidField("ebppStatus");
	}

	/**
	 * Get ebppDesc
	 */
	@Column(name = "EBPP_DESC")
	public String getEbppDesc() {
		return ebppDesc;
	}

	/**
	 * Set ebppDesc
	 */
	public void setEbppDesc(String ebppDesc) {
		this.ebppDesc = ebppDesc;
		addValidField("ebppDesc");
	}

	/**
	 * Get ebppCcEbpdId
	 */
	@Column(name = "EBPP_CC_EBPD_ID")
	public Long getEbppCcEbpdId() {
		return ebppCcEbpdId;
	}

	/**
	 * Set ebppCcEbpdId
	 */
	public void setEbppCcEbpdId(Long ebppCcEbpdId) {
		this.ebppCcEbpdId = ebppCcEbpdId;
		addValidField("ebppCcEbpdId");
	}

	/**
	 * Get ebppCcEbpdCode
	 */
	@Column(name = "EBPP_CC_EBPD_CODE")
	public String getEbppCcEbpdCode() {
		return ebppCcEbpdCode;
	}

	/**
	 * Set ebppCcEbpdCode
	 */
	public void setEbppCcEbpdCode(String ebppCcEbpdCode) {
		this.ebppCcEbpdCode = ebppCcEbpdCode;
		addValidField("ebppCcEbpdCode");
	}

	/**
	 * Get ebppCcAutomatic
	 */
	@Column(name = "EBPP_CC_AUTOMATIC")
	public String getEbppCcAutomatic() {
		return ebppCcAutomatic;
	}

	/**
	 * Set ebppCcAutomatic
	 */
	public void setEbppCcAutomatic(String ebppCcAutomatic) {
		this.ebppCcAutomatic = ebppCcAutomatic;
		addValidField("ebppCcAutomatic");
	}

	/**
	 * Get ebppLoEbpdId
	 */
	@Column(name = "EBPP_LO_EBPD_ID")
	public Long getEbppLoEbpdId() {
		return ebppLoEbpdId;
	}

	/**
	 * Set ebppLoEbpdId
	 */
	public void setEbppLoEbpdId(Long ebppLoEbpdId) {
		this.ebppLoEbpdId = ebppLoEbpdId;
		addValidField("ebppLoEbpdId");
	}

	/**
	 * Get ebppLoEbpdCode
	 */
	@Column(name = "EBPP_LO_EBPD_CODE")
	public String getEbppLoEbpdCode() {
		return ebppLoEbpdCode;
	}

	/**
	 * Set ebppLoEbpdCode
	 */
	public void setEbppLoEbpdCode(String ebppLoEbpdCode) {
		this.ebppLoEbpdCode = ebppLoEbpdCode;
		addValidField("ebppLoEbpdCode");
	}

	/**
	 * Get ebppLoAutomatic
	 */
	@Column(name = "EBPP_LO_AUTOMATIC")
	public String getEbppLoAutomatic() {
		return ebppLoAutomatic;
	}

	/**
	 * Set ebppLoAutomatic
	 */
	public void setEbppLoAutomatic(String ebppLoAutomatic) {
		this.ebppLoAutomatic = ebppLoAutomatic;
		addValidField("ebppLoAutomatic");
	}

	/**
	 * Get ebppSubstr1
	 */
	@Column(name = "EBPP_SUBSTR1")
	public String getEbppSubstr1() {
		return ebppSubstr1;
	}

	/**
	 * Set ebppSubstr1
	 */
	public void setEbppSubstr1(String ebppSubstr1) {
		this.ebppSubstr1 = ebppSubstr1;
		addValidField("ebppSubstr1");
	}

	/**
	 * Get ebppSubstr2
	 */
	@Column(name = "EBPP_SUBSTR2")
	public String getEbppSubstr2() {
		return ebppSubstr2;
	}

	/**
	 * Set ebppSubstr2
	 */
	public void setEbppSubstr2(String ebppSubstr2) {
		this.ebppSubstr2 = ebppSubstr2;
		addValidField("ebppSubstr2");
	}

	/**
	 * Get ebppSubstr3
	 */
	@Column(name = "EBPP_SUBSTR3")
	public String getEbppSubstr3() {
		return ebppSubstr3;
	}

	/**
	 * Set ebppSubstr3
	 */
	public void setEbppSubstr3(String ebppSubstr3) {
		this.ebppSubstr3 = ebppSubstr3;
		addValidField("ebppSubstr3");
	}

	/**
	 * Get ebppSubstr4
	 */
	@Column(name = "EBPP_SUBSTR4")
	public String getEbppSubstr4() {
		return ebppSubstr4;
	}

	/**
	 * Set ebppSubstr4
	 */
	public void setEbppSubstr4(String ebppSubstr4) {
		this.ebppSubstr4 = ebppSubstr4;
		addValidField("ebppSubstr4");
	}

	/**
	 * Get ebppSubstr5
	 */
	@Column(name = "EBPP_SUBSTR5")
	public String getEbppSubstr5() {
		return ebppSubstr5;
	}

	/**
	 * Set ebppSubstr5
	 */
	public void setEbppSubstr5(String ebppSubstr5) {
		this.ebppSubstr5 = ebppSubstr5;
		addValidField("ebppSubstr5");
	}

	/**
	 * Get ebppSubstr6
	 */
	@Column(name = "EBPP_SUBSTR6")
	public String getEbppSubstr6() {
		return ebppSubstr6;
	}

	/**
	 * Set ebppSubstr6
	 */
	public void setEbppSubstr6(String ebppSubstr6) {
		this.ebppSubstr6 = ebppSubstr6;
		addValidField("ebppSubstr6");
	}

	/**
	 * Get ebppSubstr7
	 */
	@Column(name = "EBPP_SUBSTR7")
	public String getEbppSubstr7() {
		return ebppSubstr7;
	}

	/**
	 * Set ebppSubstr7
	 */
	public void setEbppSubstr7(String ebppSubstr7) {
		this.ebppSubstr7 = ebppSubstr7;
		addValidField("ebppSubstr7");
	}

	/**
	 * Get ebppSubstr8
	 */
	@Column(name = "EBPP_SUBSTR8")
	public String getEbppSubstr8() {
		return ebppSubstr8;
	}

	/**
	 * Set ebppSubstr8
	 */
	public void setEbppSubstr8(String ebppSubstr8) {
		this.ebppSubstr8 = ebppSubstr8;
		addValidField("ebppSubstr8");
	}

	/**
	 * Get ebppSubdate1
	 */
	@Column(name = "EBPP_SUBDATE1")
	public Date getEbppSubdate1() {
		return ebppSubdate1;
	}

	/**
	 * Set ebppSubdate1
	 */
	public void setEbppSubdate1(Date ebppSubdate1) {
		this.ebppSubdate1 = ebppSubdate1;
		addValidField("ebppSubdate1");
	}

	/**
	 * Get ebppSubdate2
	 */
	@Column(name = "EBPP_SUBDATE2")
	public Date getEbppSubdate2() {
		return ebppSubdate2;
	}

	/**
	 * Set ebppSubdate2
	 */
	public void setEbppSubdate2(Date ebppSubdate2) {
		this.ebppSubdate2 = ebppSubdate2;
		addValidField("ebppSubdate2");
	}

	/**
	 * Get ebppSubdate3
	 */
	@Column(name = "EBPP_SUBDATE3")
	public Date getEbppSubdate3() {
		return ebppSubdate3;
	}

	/**
	 * Set ebppSubdate3
	 */
	public void setEbppSubdate3(Date ebppSubdate3) {
		this.ebppSubdate3 = ebppSubdate3;
		addValidField("ebppSubdate3");
	}

	/**
	 * Get ebppSubdate4
	 */
	@Column(name = "EBPP_SUBDATE4")
	public Date getEbppSubdate4() {
		return ebppSubdate4;
	}

	/**
	 * Set ebppSubdate4
	 */
	public void setEbppSubdate4(Date ebppSubdate4) {
		this.ebppSubdate4 = ebppSubdate4;
		addValidField("ebppSubdate4");
	}

	/**
	 * Get ebppSubnum1
	 */
	@Column(name = "EBPP_SUBNUM1")
	public Long getEbppSubnum1() {
		return ebppSubnum1;
	}

	/**
	 * Set ebppSubnum1
	 */
	public void setEbppSubnum1(Long ebppSubnum1) {
		this.ebppSubnum1 = ebppSubnum1;
		addValidField("ebppSubnum1");
	}

	/**
	 * Get ebppSubnum2
	 */
	@Column(name = "EBPP_SUBNUM2")
	public Long getEbppSubnum2() {
		return ebppSubnum2;
	}

	/**
	 * Set ebppSubnum2
	 */
	public void setEbppSubnum2(Long ebppSubnum2) {
		this.ebppSubnum2 = ebppSubnum2;
		addValidField("ebppSubnum2");
	}

	/**
	 * Get ebppSubnum3
	 */
	@Column(name = "EBPP_SUBNUM3")
	public Long getEbppSubnum3() {
		return ebppSubnum3;
	}

	/**
	 * Set ebppSubnum3
	 */
	public void setEbppSubnum3(Long ebppSubnum3) {
		this.ebppSubnum3 = ebppSubnum3;
		addValidField("ebppSubnum3");
	}

	/**
	 * Get ebppSubnum4
	 */
	@Column(name = "EBPP_SUBNUM4")
	public Long getEbppSubnum4() {
		return ebppSubnum4;
	}

	/**
	 * Set ebppSubnum4
	 */
	public void setEbppSubnum4(Long ebppSubnum4) {
		this.ebppSubnum4 = ebppSubnum4;
		addValidField("ebppSubnum4");
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
	 * Get ebppType
	 */
	@Column(name = "EBPP_TYPE")
	public String getEbppType() {
		return ebppType;
	}

	/**
	 * Set ebppType
	 */
	public void setEbppType(String ebppType) {
		this.ebppType = ebppType;
		addValidField("ebppType");
	}

	/**
	 * Get ebppOccEbpdId
	 */
	@Column(name = "EBPP_OCC_EBPD_ID")
	public Long getEbppOccEbpdId() {
		return ebppOccEbpdId;
	}

	/**
	 * Set ebppOccEbpdId
	 */
	public void setEbppOccEbpdId(Long ebppOccEbpdId) {
		this.ebppOccEbpdId = ebppOccEbpdId;
		addValidField("ebppOccEbpdId");
	}

	/**
	 * Get ebppOccEbpdCode
	 */
	@Column(name = "EBPP_OCC_EBPD_CODE")
	public String getEbppOccEbpdCode() {
		return ebppOccEbpdCode;
	}

	/**
	 * Set ebppOccEbpdCode
	 */
	public void setEbppOccEbpdCode(String ebppOccEbpdCode) {
		this.ebppOccEbpdCode = ebppOccEbpdCode;
		addValidField("ebppOccEbpdCode");
	}

	/**
	 * Get ebppOccAutomatic
	 */
	@Column(name = "EBPP_OCC_AUTOMATIC")
	public String getEbppOccAutomatic() {
		return ebppOccAutomatic;
	}

	/**
	 * Set ebppOccAutomatic
	 */
	public void setEbppOccAutomatic(String ebppOccAutomatic) {
		this.ebppOccAutomatic = ebppOccAutomatic;
		addValidField("ebppOccAutomatic");
	}

	/**
	 * Get ebppCtEbpdId
	 */
	@Column(name = "EBPP_CT_EBPD_ID")
	public Long getEbppCtEbpdId() {
		return ebppCtEbpdId;
	}

	/**
	 * Set ebppCtEbpdId
	 */
	public void setEbppCtEbpdId(Long ebppCtEbpdId) {
		this.ebppCtEbpdId = ebppCtEbpdId;
		addValidField("ebppCtEbpdId");
	}

	/**
	 * Get ebppCtEbpdCode
	 */
	@Column(name = "EBPP_CT_EBPD_CODE")
	public String getEbppCtEbpdCode() {
		return ebppCtEbpdCode;
	}

	/**
	 * Set ebppCtEbpdCode
	 */
	public void setEbppCtEbpdCode(String ebppCtEbpdCode) {
		this.ebppCtEbpdCode = ebppCtEbpdCode;
		addValidField("ebppCtEbpdCode");
	}

	/**
	 * Get ebppCtAutomatic
	 */
	@Column(name = "EBPP_CT_AUTOMATIC")
	public String getEbppCtAutomatic() {
		return ebppCtAutomatic;
	}

	/**
	 * Set ebppCtAutomatic
	 */
	public void setEbppCtAutomatic(String ebppCtAutomatic) {
		this.ebppCtAutomatic = ebppCtAutomatic;
		addValidField("ebppCtAutomatic");
	}

	/**
	 * Get ebppBbdEbpdId
	 */
	@Column(name = "EBPP_BBD_EBPD_ID")
	public Long getEbppBbdEbpdId() {
		return ebppBbdEbpdId;
	}

	/**
	 * Set ebppBbdEbpdId
	 */
	public void setEbppBbdEbpdId(Long ebppBbdEbpdId) {
		this.ebppBbdEbpdId = ebppBbdEbpdId;
		addValidField("ebppBbdEbpdId");
	}

	/**
	 * Get ebppBbdEbpdCode
	 */
	@Column(name = "EBPP_BBD_EBPD_CODE")
	public String getEbppBbdEbpdCode() {
		return ebppBbdEbpdCode;
	}

	/**
	 * Set ebppBbdEbpdCode
	 */
	public void setEbppBbdEbpdCode(String ebppBbdEbpdCode) {
		this.ebppBbdEbpdCode = ebppBbdEbpdCode;
		addValidField("ebppBbdEbpdCode");
	}

	/**
	 * Get ebppBbdType
	 */
	@Column(name = "EBPP_BBD_TYPE")
	public Long getEbppBbdType() {
		return ebppBbdType;
	}

	/**
	 * Set ebppBbdType
	 */
	public void setEbppBbdType(Long ebppBbdType) {
		this.ebppBbdType = ebppBbdType;
		addValidField("ebppBbdType");
	}

	/**
	 * Get ebppStatusTemplate
	 */
	@Column(name = "EBPP_STATUS_TEMPLATE")
	public String getEbppStatusTemplate() {
		return ebppStatusTemplate;
	}

	/**
	 * Set ebppStatusTemplate
	 */
	public void setEbppStatusTemplate(String ebppStatusTemplate) {
		this.ebppStatusTemplate = ebppStatusTemplate;
		addValidField("ebppStatusTemplate");
	}

	/**
	 * Get ebppBmsEbbtCode
	 */
	@Column(name = "EBPP_BMS_EBBT_CODE")
	public String getEbppBmsEbbtCode() {
		return ebppBmsEbbtCode;
	}

	/**
	 * Set ebppBmsEbbtCode
	 */
	public void setEbppBmsEbbtCode(String ebppBmsEbbtCode) {
		this.ebppBmsEbbtCode = ebppBmsEbbtCode;
		addValidField("ebppBmsEbbtCode");
	}

	/**
	 * Get ebppBmsEbotCode
	 */
	@Column(name = "EBPP_BMS_EBOT_CODE")
	public String getEbppBmsEbotCode() {
		return ebppBmsEbotCode;
	}

	/**
	 * Set ebppBmsEbotCode
	 */
	public void setEbppBmsEbotCode(String ebppBmsEbotCode) {
		this.ebppBmsEbotCode = ebppBmsEbotCode;
		addValidField("ebppBmsEbotCode");
	}

	/**
	 * Get ebppBmsBusinessClass
	 */
	@Column(name = "EBPP_BMS_BUSINESS_CLASS")
	public String getEbppBmsBusinessClass() {
		return ebppBmsBusinessClass;
	}

	/**
	 * Set ebppBmsBusinessClass
	 */
	public void setEbppBmsBusinessClass(String ebppBmsBusinessClass) {
		this.ebppBmsBusinessClass = ebppBmsBusinessClass;
		addValidField("ebppBmsBusinessClass");
	}

	/**
	 * Get ebppBusinessType
	 */
	@Column(name = "EBPP_BUSINESS_TYPE")
	public String getEbppBusinessType() {
		return ebppBusinessType;
	}

	/**
	 * Set ebppBusinessType
	 */
	public void setEbppBusinessType(String ebppBusinessType) {
		this.ebppBusinessType = ebppBusinessType;
		addValidField("ebppBusinessType");
	}

}
