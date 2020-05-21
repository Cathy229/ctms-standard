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
 * Model class for EbPlanTask
 */
@Entity
@Table(name = "EB_PLAN_TASK")
public class EbPlanTaskModel extends BaseModel implements OperationLog {

	//ebtkId
	private Long ebtkId;
	//ebtkEbppId
	private Long ebtkEbppId;
	//ebtkEscoId
	private Long ebtkEscoId;
	//ebtkEbpjId
	private Long ebtkEbpjId;
	//ebtkEbbuId
	private Long ebtkEbbuId;
	//ebtkNameCn
	private String ebtkNameCn;
	//ebtkCode
	private String ebtkCode;
	//ebtkEbbuDist1
	private String ebtkEbbuDist1;
	//ebtkEbbuDist2
	private String ebtkEbbuDist2;
	//ebtkEbbuDist3
	private String ebtkEbbuDist3;
	//ebtkEbbuDist4
	private String ebtkEbbuDist4;
	//ebtkEbbuDist5
	private String ebtkEbbuDist5;
	//ebtkType
	private String ebtkType;
	//ebtkName
	private String ebtkName;
	//ebtkDesc
	private String ebtkDesc;
	//ebtkSequence
	private Long ebtkSequence;
	//ebtkBrEbpdId
	private Long ebtkBrEbpdId;
	//ebtkBrEbpdCode
	private String ebtkBrEbpdCode;
	//ebtkBrAutomatic
	private String ebtkBrAutomatic;
	//ebtkSubstr1
	private String ebtkSubstr1;
	//ebtkSubstr2
	private String ebtkSubstr2;
	//ebtkSubstr3
	private String ebtkSubstr3;
	//ebtkSubstr4
	private String ebtkSubstr4;
	//ebtkSubstr5
	private String ebtkSubstr5;
	//ebtkSubstr6
	private String ebtkSubstr6;
	//ebtkSubstr7
	private String ebtkSubstr7;
	//ebtkSubstr8
	private String ebtkSubstr8;
	//ebtkSubdate1
	private Date ebtkSubdate1;
	//ebtkSubdate2
	private Date ebtkSubdate2;
	//ebtkSubdate3
	private Date ebtkSubdate3;
	//ebtkSubdate4
	private Date ebtkSubdate4;
	//ebtkSubnum1
	private Long ebtkSubnum1;
	//ebtkSubnum2
	private Long ebtkSubnum2;
	//ebtkSubnum3
	private Long ebtkSubnum3;
	//ebtkSubnum4
	private Long ebtkSubnum4;
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
	//ebtkRccEbpdId
	private Long ebtkRccEbpdId;
	//ebtkRccEbpdCode
	private String ebtkRccEbpdCode;
	//ebtkRccAutomatic
	private String ebtkRccAutomatic;
	//ebtkRetoType
	private Long ebtkRetoType;
	//ebtkBbdEbpdId
	private Long ebtkBbdEbpdId;
	//ebtkBbdEbpdCode
	private String ebtkBbdEbpdCode;
	//ebtkBbdIsdefault
	private Long ebtkBbdIsdefault;
	//ebtkBmsEbbtCode
	private String ebtkBmsEbbtCode;
	//ebtkBmsEbotCode
	private String ebtkBmsEbotCode;
	//ebtkBmsEsdeDepartmentCode
	private String ebtkBmsEsdeDepartmentCode;
	//ebtkBmsEbsmCode
	private String ebtkBmsEbsmCode;

	/**
	 * Get ebtkId
	 */
	@Column(name = "EBTK_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbtkId() {
		return ebtkId;
	}

	/**
	 * Set ebtkId
	 */
	public void setEbtkId(Long ebtkId) {
		this.ebtkId = ebtkId;
		addValidField("ebtkId");
	}

	/**
	 * Get ebtkEbppId
	 */
	@Column(name = "EBTK_EBPP_ID")
	public Long getEbtkEbppId() {
		return ebtkEbppId;
	}

	/**
	 * Set ebtkEbppId
	 */
	public void setEbtkEbppId(Long ebtkEbppId) {
		this.ebtkEbppId = ebtkEbppId;
		addValidField("ebtkEbppId");
	}

	/**
	 * Get ebtkEscoId
	 */
	@Column(name = "EBTK_ESCO_ID")
	public Long getEbtkEscoId() {
		return ebtkEscoId;
	}

	/**
	 * Set ebtkEscoId
	 */
	public void setEbtkEscoId(Long ebtkEscoId) {
		this.ebtkEscoId = ebtkEscoId;
		addValidField("ebtkEscoId");
	}

	/**
	 * Get ebtkEbpjId
	 */
	@Column(name = "EBTK_EBPJ_ID")
	public Long getEbtkEbpjId() {
		return ebtkEbpjId;
	}

	/**
	 * Set ebtkEbpjId
	 */
	public void setEbtkEbpjId(Long ebtkEbpjId) {
		this.ebtkEbpjId = ebtkEbpjId;
		addValidField("ebtkEbpjId");
	}

	/**
	 * Get ebtkEbbuId
	 */
	@Column(name = "EBTK_EBBU_ID")
	public Long getEbtkEbbuId() {
		return ebtkEbbuId;
	}

	/**
	 * Set ebtkEbbuId
	 */
	public void setEbtkEbbuId(Long ebtkEbbuId) {
		this.ebtkEbbuId = ebtkEbbuId;
		addValidField("ebtkEbbuId");
	}

	/**
	 * Get ebtkNameCn
	 */
	@Column(name = "EBTK_NAME_CN")
	public String getEbtkNameCn() {
		return ebtkNameCn;
	}

	/**
	 * Set ebtkNameCn
	 */
	public void setEbtkNameCn(String ebtkNameCn) {
		this.ebtkNameCn = ebtkNameCn;
		addValidField("ebtkNameCn");
	}

	/**
	 * Get ebtkCode
	 */
	@Column(name = "EBTK_CODE")
	public String getEbtkCode() {
		return ebtkCode;
	}

	/**
	 * Set ebtkCode
	 */
	public void setEbtkCode(String ebtkCode) {
		this.ebtkCode = ebtkCode;
		addValidField("ebtkCode");
	}

	/**
	 * Get ebtkEbbuDist1
	 */
	@Column(name = "EBTK_EBBU_DIST_1")
	public String getEbtkEbbuDist1() {
		return ebtkEbbuDist1;
	}

	/**
	 * Set ebtkEbbuDist1
	 */
	public void setEbtkEbbuDist1(String ebtkEbbuDist1) {
		this.ebtkEbbuDist1 = ebtkEbbuDist1;
		addValidField("ebtkEbbuDist1");
	}

	/**
	 * Get ebtkEbbuDist2
	 */
	@Column(name = "EBTK_EBBU_DIST_2")
	public String getEbtkEbbuDist2() {
		return ebtkEbbuDist2;
	}

	/**
	 * Set ebtkEbbuDist2
	 */
	public void setEbtkEbbuDist2(String ebtkEbbuDist2) {
		this.ebtkEbbuDist2 = ebtkEbbuDist2;
		addValidField("ebtkEbbuDist2");
	}

	/**
	 * Get ebtkEbbuDist3
	 */
	@Column(name = "EBTK_EBBU_DIST_3")
	public String getEbtkEbbuDist3() {
		return ebtkEbbuDist3;
	}

	/**
	 * Set ebtkEbbuDist3
	 */
	public void setEbtkEbbuDist3(String ebtkEbbuDist3) {
		this.ebtkEbbuDist3 = ebtkEbbuDist3;
		addValidField("ebtkEbbuDist3");
	}

	/**
	 * Get ebtkEbbuDist4
	 */
	@Column(name = "EBTK_EBBU_DIST_4")
	public String getEbtkEbbuDist4() {
		return ebtkEbbuDist4;
	}

	/**
	 * Set ebtkEbbuDist4
	 */
	public void setEbtkEbbuDist4(String ebtkEbbuDist4) {
		this.ebtkEbbuDist4 = ebtkEbbuDist4;
		addValidField("ebtkEbbuDist4");
	}

	/**
	 * Get ebtkEbbuDist5
	 */
	@Column(name = "EBTK_EBBU_DIST_5")
	public String getEbtkEbbuDist5() {
		return ebtkEbbuDist5;
	}

	/**
	 * Set ebtkEbbuDist5
	 */
	public void setEbtkEbbuDist5(String ebtkEbbuDist5) {
		this.ebtkEbbuDist5 = ebtkEbbuDist5;
		addValidField("ebtkEbbuDist5");
	}

	/**
	 * Get ebtkType
	 */
	@Column(name = "EBTK_TYPE")
	public String getEbtkType() {
		return ebtkType;
	}

	/**
	 * Set ebtkType
	 */
	public void setEbtkType(String ebtkType) {
		this.ebtkType = ebtkType;
		addValidField("ebtkType");
	}

	/**
	 * Get ebtkName
	 */
	@Column(name = "EBTK_NAME")
	public String getEbtkName() {
		return ebtkName;
	}

	/**
	 * Set ebtkName
	 */
	public void setEbtkName(String ebtkName) {
		this.ebtkName = ebtkName;
		addValidField("ebtkName");
	}

	/**
	 * Get ebtkDesc
	 */
	@Column(name = "EBTK_DESC")
	public String getEbtkDesc() {
		return ebtkDesc;
	}

	/**
	 * Set ebtkDesc
	 */
	public void setEbtkDesc(String ebtkDesc) {
		this.ebtkDesc = ebtkDesc;
		addValidField("ebtkDesc");
	}

	/**
	 * Get ebtkSequence
	 */
	@Column(name = "EBTK_SEQUENCE")
	public Long getEbtkSequence() {
		return ebtkSequence;
	}

	/**
	 * Set ebtkSequence
	 */
	public void setEbtkSequence(Long ebtkSequence) {
		this.ebtkSequence = ebtkSequence;
		addValidField("ebtkSequence");
	}

	/**
	 * Get ebtkBrEbpdId
	 */
	@Column(name = "EBTK_BR_EBPD_ID")
	public Long getEbtkBrEbpdId() {
		return ebtkBrEbpdId;
	}

	/**
	 * Set ebtkBrEbpdId
	 */
	public void setEbtkBrEbpdId(Long ebtkBrEbpdId) {
		this.ebtkBrEbpdId = ebtkBrEbpdId;
		addValidField("ebtkBrEbpdId");
	}

	/**
	 * Get ebtkBrEbpdCode
	 */
	@Column(name = "EBTK_BR_EBPD_CODE")
	public String getEbtkBrEbpdCode() {
		return ebtkBrEbpdCode;
	}

	/**
	 * Set ebtkBrEbpdCode
	 */
	public void setEbtkBrEbpdCode(String ebtkBrEbpdCode) {
		this.ebtkBrEbpdCode = ebtkBrEbpdCode;
		addValidField("ebtkBrEbpdCode");
	}

	/**
	 * Get ebtkBrAutomatic
	 */
	@Column(name = "EBTK_BR_AUTOMATIC")
	public String getEbtkBrAutomatic() {
		return ebtkBrAutomatic;
	}

	/**
	 * Set ebtkBrAutomatic
	 */
	public void setEbtkBrAutomatic(String ebtkBrAutomatic) {
		this.ebtkBrAutomatic = ebtkBrAutomatic;
		addValidField("ebtkBrAutomatic");
	}

	/**
	 * Get ebtkSubstr1
	 */
	@Column(name = "EBTK_SUBSTR1")
	public String getEbtkSubstr1() {
		return ebtkSubstr1;
	}

	/**
	 * Set ebtkSubstr1
	 */
	public void setEbtkSubstr1(String ebtkSubstr1) {
		this.ebtkSubstr1 = ebtkSubstr1;
		addValidField("ebtkSubstr1");
	}

	/**
	 * Get ebtkSubstr2
	 */
	@Column(name = "EBTK_SUBSTR2")
	public String getEbtkSubstr2() {
		return ebtkSubstr2;
	}

	/**
	 * Set ebtkSubstr2
	 */
	public void setEbtkSubstr2(String ebtkSubstr2) {
		this.ebtkSubstr2 = ebtkSubstr2;
		addValidField("ebtkSubstr2");
	}

	/**
	 * Get ebtkSubstr3
	 */
	@Column(name = "EBTK_SUBSTR3")
	public String getEbtkSubstr3() {
		return ebtkSubstr3;
	}

	/**
	 * Set ebtkSubstr3
	 */
	public void setEbtkSubstr3(String ebtkSubstr3) {
		this.ebtkSubstr3 = ebtkSubstr3;
		addValidField("ebtkSubstr3");
	}

	/**
	 * Get ebtkSubstr4
	 */
	@Column(name = "EBTK_SUBSTR4")
	public String getEbtkSubstr4() {
		return ebtkSubstr4;
	}

	/**
	 * Set ebtkSubstr4
	 */
	public void setEbtkSubstr4(String ebtkSubstr4) {
		this.ebtkSubstr4 = ebtkSubstr4;
		addValidField("ebtkSubstr4");
	}

	/**
	 * Get ebtkSubstr5
	 */
	@Column(name = "EBTK_SUBSTR5")
	public String getEbtkSubstr5() {
		return ebtkSubstr5;
	}

	/**
	 * Set ebtkSubstr5
	 */
	public void setEbtkSubstr5(String ebtkSubstr5) {
		this.ebtkSubstr5 = ebtkSubstr5;
		addValidField("ebtkSubstr5");
	}

	/**
	 * Get ebtkSubstr6
	 */
	@Column(name = "EBTK_SUBSTR6")
	public String getEbtkSubstr6() {
		return ebtkSubstr6;
	}

	/**
	 * Set ebtkSubstr6
	 */
	public void setEbtkSubstr6(String ebtkSubstr6) {
		this.ebtkSubstr6 = ebtkSubstr6;
		addValidField("ebtkSubstr6");
	}

	/**
	 * Get ebtkSubstr7
	 */
	@Column(name = "EBTK_SUBSTR7")
	public String getEbtkSubstr7() {
		return ebtkSubstr7;
	}

	/**
	 * Set ebtkSubstr7
	 */
	public void setEbtkSubstr7(String ebtkSubstr7) {
		this.ebtkSubstr7 = ebtkSubstr7;
		addValidField("ebtkSubstr7");
	}

	/**
	 * Get ebtkSubstr8
	 */
	@Column(name = "EBTK_SUBSTR8")
	public String getEbtkSubstr8() {
		return ebtkSubstr8;
	}

	/**
	 * Set ebtkSubstr8
	 */
	public void setEbtkSubstr8(String ebtkSubstr8) {
		this.ebtkSubstr8 = ebtkSubstr8;
		addValidField("ebtkSubstr8");
	}

	/**
	 * Get ebtkSubdate1
	 */
	@Column(name = "EBTK_SUBDATE1")
	public Date getEbtkSubdate1() {
		return ebtkSubdate1;
	}

	/**
	 * Set ebtkSubdate1
	 */
	public void setEbtkSubdate1(Date ebtkSubdate1) {
		this.ebtkSubdate1 = ebtkSubdate1;
		addValidField("ebtkSubdate1");
	}

	/**
	 * Get ebtkSubdate2
	 */
	@Column(name = "EBTK_SUBDATE2")
	public Date getEbtkSubdate2() {
		return ebtkSubdate2;
	}

	/**
	 * Set ebtkSubdate2
	 */
	public void setEbtkSubdate2(Date ebtkSubdate2) {
		this.ebtkSubdate2 = ebtkSubdate2;
		addValidField("ebtkSubdate2");
	}

	/**
	 * Get ebtkSubdate3
	 */
	@Column(name = "EBTK_SUBDATE3")
	public Date getEbtkSubdate3() {
		return ebtkSubdate3;
	}

	/**
	 * Set ebtkSubdate3
	 */
	public void setEbtkSubdate3(Date ebtkSubdate3) {
		this.ebtkSubdate3 = ebtkSubdate3;
		addValidField("ebtkSubdate3");
	}

	/**
	 * Get ebtkSubdate4
	 */
	@Column(name = "EBTK_SUBDATE4")
	public Date getEbtkSubdate4() {
		return ebtkSubdate4;
	}

	/**
	 * Set ebtkSubdate4
	 */
	public void setEbtkSubdate4(Date ebtkSubdate4) {
		this.ebtkSubdate4 = ebtkSubdate4;
		addValidField("ebtkSubdate4");
	}

	/**
	 * Get ebtkSubnum1
	 */
	@Column(name = "EBTK_SUBNUM1")
	public Long getEbtkSubnum1() {
		return ebtkSubnum1;
	}

	/**
	 * Set ebtkSubnum1
	 */
	public void setEbtkSubnum1(Long ebtkSubnum1) {
		this.ebtkSubnum1 = ebtkSubnum1;
		addValidField("ebtkSubnum1");
	}

	/**
	 * Get ebtkSubnum2
	 */
	@Column(name = "EBTK_SUBNUM2")
	public Long getEbtkSubnum2() {
		return ebtkSubnum2;
	}

	/**
	 * Set ebtkSubnum2
	 */
	public void setEbtkSubnum2(Long ebtkSubnum2) {
		this.ebtkSubnum2 = ebtkSubnum2;
		addValidField("ebtkSubnum2");
	}

	/**
	 * Get ebtkSubnum3
	 */
	@Column(name = "EBTK_SUBNUM3")
	public Long getEbtkSubnum3() {
		return ebtkSubnum3;
	}

	/**
	 * Set ebtkSubnum3
	 */
	public void setEbtkSubnum3(Long ebtkSubnum3) {
		this.ebtkSubnum3 = ebtkSubnum3;
		addValidField("ebtkSubnum3");
	}

	/**
	 * Get ebtkSubnum4
	 */
	@Column(name = "EBTK_SUBNUM4")
	public Long getEbtkSubnum4() {
		return ebtkSubnum4;
	}

	/**
	 * Set ebtkSubnum4
	 */
	public void setEbtkSubnum4(Long ebtkSubnum4) {
		this.ebtkSubnum4 = ebtkSubnum4;
		addValidField("ebtkSubnum4");
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
	 * Get ebtkRccEbpdId
	 */
	@Column(name = "EBTK_RCC_EBPD_ID")
	public Long getEbtkRccEbpdId() {
		return ebtkRccEbpdId;
	}

	/**
	 * Set ebtkRccEbpdId
	 */
	public void setEbtkRccEbpdId(Long ebtkRccEbpdId) {
		this.ebtkRccEbpdId = ebtkRccEbpdId;
		addValidField("ebtkRccEbpdId");
	}

	/**
	 * Get ebtkRccEbpdCode
	 */
	@Column(name = "EBTK_RCC_EBPD_CODE")
	public String getEbtkRccEbpdCode() {
		return ebtkRccEbpdCode;
	}

	/**
	 * Set ebtkRccEbpdCode
	 */
	public void setEbtkRccEbpdCode(String ebtkRccEbpdCode) {
		this.ebtkRccEbpdCode = ebtkRccEbpdCode;
		addValidField("ebtkRccEbpdCode");
	}

	/**
	 * Get ebtkRccAutomatic
	 */
	@Column(name = "EBTK_RCC_AUTOMATIC")
	public String getEbtkRccAutomatic() {
		return ebtkRccAutomatic;
	}

	/**
	 * Set ebtkRccAutomatic
	 */
	public void setEbtkRccAutomatic(String ebtkRccAutomatic) {
		this.ebtkRccAutomatic = ebtkRccAutomatic;
		addValidField("ebtkRccAutomatic");
	}

	/**
	 * Get ebtkRetoType
	 */
	@Column(name = "EBTK_RETO_TYPE")
	public Long getEbtkRetoType() {
		return ebtkRetoType;
	}

	/**
	 * Set ebtkRetoType
	 */
	public void setEbtkRetoType(Long ebtkRetoType) {
		this.ebtkRetoType = ebtkRetoType;
		addValidField("ebtkRetoType");
	}

	/**
	 * Get ebtkBbdEbpdId
	 */
	@Column(name = "EBTK_BBD_EBPD_ID")
	public Long getEbtkBbdEbpdId() {
		return ebtkBbdEbpdId;
	}

	/**
	 * Set ebtkBbdEbpdId
	 */
	public void setEbtkBbdEbpdId(Long ebtkBbdEbpdId) {
		this.ebtkBbdEbpdId = ebtkBbdEbpdId;
		addValidField("ebtkBbdEbpdId");
	}

	/**
	 * Get ebtkBbdEbpdCode
	 */
	@Column(name = "EBTK_BBD_EBPD_CODE")
	public String getEbtkBbdEbpdCode() {
		return ebtkBbdEbpdCode;
	}

	/**
	 * Set ebtkBbdEbpdCode
	 */
	public void setEbtkBbdEbpdCode(String ebtkBbdEbpdCode) {
		this.ebtkBbdEbpdCode = ebtkBbdEbpdCode;
		addValidField("ebtkBbdEbpdCode");
	}

	/**
	 * Get ebtkBbdIsdefault
	 */
	@Column(name = "EBTK_BBD_ISDEFAULT")
	public Long getEbtkBbdIsdefault() {
		return ebtkBbdIsdefault;
	}

	/**
	 * Set ebtkBbdIsdefault
	 */
	public void setEbtkBbdIsdefault(Long ebtkBbdIsdefault) {
		this.ebtkBbdIsdefault = ebtkBbdIsdefault;
		addValidField("ebtkBbdIsdefault");
	}

	/**
	 * Get ebtkBmsEbbtCode
	 */
	@Column(name = "EBTK_BMS_EBBT_CODE")
	public String getEbtkBmsEbbtCode() {
		return ebtkBmsEbbtCode;
	}

	/**
	 * Set ebtkBmsEbbtCode
	 */
	public void setEbtkBmsEbbtCode(String ebtkBmsEbbtCode) {
		this.ebtkBmsEbbtCode = ebtkBmsEbbtCode;
		addValidField("ebtkBmsEbbtCode");
	}

	/**
	 * Get ebtkBmsEbotCode
	 */
	@Column(name = "EBTK_BMS_EBOT_CODE")
	public String getEbtkBmsEbotCode() {
		return ebtkBmsEbotCode;
	}

	/**
	 * Set ebtkBmsEbotCode
	 */
	public void setEbtkBmsEbotCode(String ebtkBmsEbotCode) {
		this.ebtkBmsEbotCode = ebtkBmsEbotCode;
		addValidField("ebtkBmsEbotCode");
	}

	/**
	 * Get ebtkBmsEsdeDepartmentCode
	 */
	@Column(name = "EBTK_BMS_ESDE_DEPARTMENT_CODE")
	public String getEbtkBmsEsdeDepartmentCode() {
		return ebtkBmsEsdeDepartmentCode;
	}

	/**
	 * Set ebtkBmsEsdeDepartmentCode
	 */
	public void setEbtkBmsEsdeDepartmentCode(String ebtkBmsEsdeDepartmentCode) {
		this.ebtkBmsEsdeDepartmentCode = ebtkBmsEsdeDepartmentCode;
		addValidField("ebtkBmsEsdeDepartmentCode");
	}

	/**
	 * Get ebtkBmsEbsmCode
	 */
	@Column(name = "EBTK_BMS_EBSM_CODE")
	public String getEbtkBmsEbsmCode() {
		return ebtkBmsEbsmCode;
	}

	/**
	 * Set ebtkBmsEbsmCode
	 */
	public void setEbtkBmsEbsmCode(String ebtkBmsEbsmCode) {
		this.ebtkBmsEbsmCode = ebtkBmsEbsmCode;
		addValidField("ebtkBmsEbsmCode");
	}

}
