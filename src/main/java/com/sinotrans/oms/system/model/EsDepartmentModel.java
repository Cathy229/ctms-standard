package com.sinotrans.oms.system.model;

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
 * Model class for EsDepartment
 */
@Entity
@Table(name = "ES_DEPARTMENT")
public class EsDepartmentModel extends BaseModel implements OperationLog {

	//esdeId
	private Long esdeId;
	//esdeEscoId
	private Long esdeEscoId;
	//esdeDepartmentCode
	private String esdeDepartmentCode;
	//esdeDepartmentName
	private String esdeDepartmentName;
	//esdeContactName
	private String esdeContactName;
	//esdeContactPhone
	private String esdeContactPhone;
	//esdeOfficeAddress
	private String esdeOfficeAddress;
	//esdeStatus
	private String esdeStatus;
	//esdeSubstr1
	private String esdeSubstr1;
	//esdeSubstr2
	private String esdeSubstr2;
	//esdeSubstr3
	private String esdeSubstr3;
	//esdeSubstr4
	private String esdeSubstr4;
	//esdeSubstr5
	private String esdeSubstr5;
	//esdeSubstr6
	private String esdeSubstr6;
	//esdeSubstr7
	private String esdeSubstr7;
	//esdeSubstr8
	private String esdeSubstr8;
	//esdeSubdate1
	private Date esdeSubdate1;
	//esdeSubdate2
	private Date esdeSubdate2;
	//esdeSubdate3
	private Date esdeSubdate3;
	//esdeSubdate4
	private Date esdeSubdate4;
	//esdeSubnum1
	private Long esdeSubnum1;
	//esdeSubnum2
	private Long esdeSubnum2;
	//esdeSubnum3
	private Long esdeSubnum3;
	//esdeSubnum4
	private Long esdeSubnum4;
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
	//esdeBmsDepartmentCode
	private String esdeBmsDepartmentCode;
	//esdeDefaultBmsEbsmCode
	private String esdeDefaultBmsEbsmCode;

	/**
	 * Get esdeId
	 */
	@Column(name = "ESDE_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEsdeId() {
		return esdeId;
	}

	/**
	 * Set esdeId
	 */
	public void setEsdeId(Long esdeId) {
		this.esdeId = esdeId;
		addValidField("esdeId");
	}

	/**
	 * Get esdeEscoId
	 */
	@Column(name = "ESDE_ESCO_ID")
	public Long getEsdeEscoId() {
		return esdeEscoId;
	}

	/**
	 * Set esdeEscoId
	 */
	public void setEsdeEscoId(Long esdeEscoId) {
		this.esdeEscoId = esdeEscoId;
		addValidField("esdeEscoId");
	}

	/**
	 * Get esdeDepartmentCode
	 */
	@Column(name = "ESDE_DEPARTMENT_CODE")
	public String getEsdeDepartmentCode() {
		return esdeDepartmentCode;
	}

	/**
	 * Set esdeDepartmentCode
	 */
	public void setEsdeDepartmentCode(String esdeDepartmentCode) {
		this.esdeDepartmentCode = esdeDepartmentCode;
		addValidField("esdeDepartmentCode");
	}

	/**
	 * Get esdeDepartmentName
	 */
	@Column(name = "ESDE_DEPARTMENT_NAME")
	public String getEsdeDepartmentName() {
		return esdeDepartmentName;
	}

	/**
	 * Set esdeDepartmentName
	 */
	public void setEsdeDepartmentName(String esdeDepartmentName) {
		this.esdeDepartmentName = esdeDepartmentName;
		addValidField("esdeDepartmentName");
	}

	/**
	 * Get esdeContactName
	 */
	@Column(name = "ESDE_CONTACT_NAME")
	public String getEsdeContactName() {
		return esdeContactName;
	}

	/**
	 * Set esdeContactName
	 */
	public void setEsdeContactName(String esdeContactName) {
		this.esdeContactName = esdeContactName;
		addValidField("esdeContactName");
	}

	/**
	 * Get esdeContactPhone
	 */
	@Column(name = "ESDE_CONTACT_PHONE")
	public String getEsdeContactPhone() {
		return esdeContactPhone;
	}

	/**
	 * Set esdeContactPhone
	 */
	public void setEsdeContactPhone(String esdeContactPhone) {
		this.esdeContactPhone = esdeContactPhone;
		addValidField("esdeContactPhone");
	}

	/**
	 * Get esdeOfficeAddress
	 */
	@Column(name = "ESDE_OFFICE_ADDRESS")
	public String getEsdeOfficeAddress() {
		return esdeOfficeAddress;
	}

	/**
	 * Set esdeOfficeAddress
	 */
	public void setEsdeOfficeAddress(String esdeOfficeAddress) {
		this.esdeOfficeAddress = esdeOfficeAddress;
		addValidField("esdeOfficeAddress");
	}

	/**
	 * Get esdeStatus
	 */
	@Column(name = "ESDE_STATUS")
	public String getEsdeStatus() {
		return esdeStatus;
	}

	/**
	 * Set esdeStatus
	 */
	public void setEsdeStatus(String esdeStatus) {
		this.esdeStatus = esdeStatus;
		addValidField("esdeStatus");
	}

	/**
	 * Get esdeSubstr1
	 */
	@Column(name = "ESDE_SUBSTR1")
	public String getEsdeSubstr1() {
		return esdeSubstr1;
	}

	/**
	 * Set esdeSubstr1
	 */
	public void setEsdeSubstr1(String esdeSubstr1) {
		this.esdeSubstr1 = esdeSubstr1;
		addValidField("esdeSubstr1");
	}

	/**
	 * Get esdeSubstr2
	 */
	@Column(name = "ESDE_SUBSTR2")
	public String getEsdeSubstr2() {
		return esdeSubstr2;
	}

	/**
	 * Set esdeSubstr2
	 */
	public void setEsdeSubstr2(String esdeSubstr2) {
		this.esdeSubstr2 = esdeSubstr2;
		addValidField("esdeSubstr2");
	}

	/**
	 * Get esdeSubstr3
	 */
	@Column(name = "ESDE_SUBSTR3")
	public String getEsdeSubstr3() {
		return esdeSubstr3;
	}

	/**
	 * Set esdeSubstr3
	 */
	public void setEsdeSubstr3(String esdeSubstr3) {
		this.esdeSubstr3 = esdeSubstr3;
		addValidField("esdeSubstr3");
	}

	/**
	 * Get esdeSubstr4
	 */
	@Column(name = "ESDE_SUBSTR4")
	public String getEsdeSubstr4() {
		return esdeSubstr4;
	}

	/**
	 * Set esdeSubstr4
	 */
	public void setEsdeSubstr4(String esdeSubstr4) {
		this.esdeSubstr4 = esdeSubstr4;
		addValidField("esdeSubstr4");
	}

	/**
	 * Get esdeSubstr5
	 */
	@Column(name = "ESDE_SUBSTR5")
	public String getEsdeSubstr5() {
		return esdeSubstr5;
	}

	/**
	 * Set esdeSubstr5
	 */
	public void setEsdeSubstr5(String esdeSubstr5) {
		this.esdeSubstr5 = esdeSubstr5;
		addValidField("esdeSubstr5");
	}

	/**
	 * Get esdeSubstr6
	 */
	@Column(name = "ESDE_SUBSTR6")
	public String getEsdeSubstr6() {
		return esdeSubstr6;
	}

	/**
	 * Set esdeSubstr6
	 */
	public void setEsdeSubstr6(String esdeSubstr6) {
		this.esdeSubstr6 = esdeSubstr6;
		addValidField("esdeSubstr6");
	}

	/**
	 * Get esdeSubstr7
	 */
	@Column(name = "ESDE_SUBSTR7")
	public String getEsdeSubstr7() {
		return esdeSubstr7;
	}

	/**
	 * Set esdeSubstr7
	 */
	public void setEsdeSubstr7(String esdeSubstr7) {
		this.esdeSubstr7 = esdeSubstr7;
		addValidField("esdeSubstr7");
	}

	/**
	 * Get esdeSubstr8
	 */
	@Column(name = "ESDE_SUBSTR8")
	public String getEsdeSubstr8() {
		return esdeSubstr8;
	}

	/**
	 * Set esdeSubstr8
	 */
	public void setEsdeSubstr8(String esdeSubstr8) {
		this.esdeSubstr8 = esdeSubstr8;
		addValidField("esdeSubstr8");
	}

	/**
	 * Get esdeSubdate1
	 */
	@Column(name = "ESDE_SUBDATE1")
	public Date getEsdeSubdate1() {
		return esdeSubdate1;
	}

	/**
	 * Set esdeSubdate1
	 */
	public void setEsdeSubdate1(Date esdeSubdate1) {
		this.esdeSubdate1 = esdeSubdate1;
		addValidField("esdeSubdate1");
	}

	/**
	 * Get esdeSubdate2
	 */
	@Column(name = "ESDE_SUBDATE2")
	public Date getEsdeSubdate2() {
		return esdeSubdate2;
	}

	/**
	 * Set esdeSubdate2
	 */
	public void setEsdeSubdate2(Date esdeSubdate2) {
		this.esdeSubdate2 = esdeSubdate2;
		addValidField("esdeSubdate2");
	}

	/**
	 * Get esdeSubdate3
	 */
	@Column(name = "ESDE_SUBDATE3")
	public Date getEsdeSubdate3() {
		return esdeSubdate3;
	}

	/**
	 * Set esdeSubdate3
	 */
	public void setEsdeSubdate3(Date esdeSubdate3) {
		this.esdeSubdate3 = esdeSubdate3;
		addValidField("esdeSubdate3");
	}

	/**
	 * Get esdeSubdate4
	 */
	@Column(name = "ESDE_SUBDATE4")
	public Date getEsdeSubdate4() {
		return esdeSubdate4;
	}

	/**
	 * Set esdeSubdate4
	 */
	public void setEsdeSubdate4(Date esdeSubdate4) {
		this.esdeSubdate4 = esdeSubdate4;
		addValidField("esdeSubdate4");
	}

	/**
	 * Get esdeSubnum1
	 */
	@Column(name = "ESDE_SUBNUM1")
	public Long getEsdeSubnum1() {
		return esdeSubnum1;
	}

	/**
	 * Set esdeSubnum1
	 */
	public void setEsdeSubnum1(Long esdeSubnum1) {
		this.esdeSubnum1 = esdeSubnum1;
		addValidField("esdeSubnum1");
	}

	/**
	 * Get esdeSubnum2
	 */
	@Column(name = "ESDE_SUBNUM2")
	public Long getEsdeSubnum2() {
		return esdeSubnum2;
	}

	/**
	 * Set esdeSubnum2
	 */
	public void setEsdeSubnum2(Long esdeSubnum2) {
		this.esdeSubnum2 = esdeSubnum2;
		addValidField("esdeSubnum2");
	}

	/**
	 * Get esdeSubnum3
	 */
	@Column(name = "ESDE_SUBNUM3")
	public Long getEsdeSubnum3() {
		return esdeSubnum3;
	}

	/**
	 * Set esdeSubnum3
	 */
	public void setEsdeSubnum3(Long esdeSubnum3) {
		this.esdeSubnum3 = esdeSubnum3;
		addValidField("esdeSubnum3");
	}

	/**
	 * Get esdeSubnum4
	 */
	@Column(name = "ESDE_SUBNUM4")
	public Long getEsdeSubnum4() {
		return esdeSubnum4;
	}

	/**
	 * Set esdeSubnum4
	 */
	public void setEsdeSubnum4(Long esdeSubnum4) {
		this.esdeSubnum4 = esdeSubnum4;
		addValidField("esdeSubnum4");
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
	 * Get esdeBmsDepartmentCode
	 */
	@Column(name = "ESDE_BMS_DEPARTMENT_CODE")
	public String getEsdeBmsDepartmentCode() {
		return esdeBmsDepartmentCode;
	}

	/**
	 * Set esdeBmsDepartmentCode
	 */
	public void setEsdeBmsDepartmentCode(String esdeBmsDepartmentCode) {
		this.esdeBmsDepartmentCode = esdeBmsDepartmentCode;
		addValidField("esdeBmsDepartmentCode");
	}

	/**
	 * Get esdeDefaultBmsEbsmCode
	 */
	@Column(name = "ESDE_DEFAULT_BMS_EBSM_CODE")
	public String getEsdeDefaultBmsEbsmCode() {
		return esdeDefaultBmsEbsmCode;
	}

	/**
	 * Set esdeDefaultBmsEbsmCode
	 */
	public void setEsdeDefaultBmsEbsmCode(String esdeDefaultBmsEbsmCode) {
		this.esdeDefaultBmsEbsmCode = esdeDefaultBmsEbsmCode;
		addValidField("esdeDefaultBmsEbsmCode");
	}

}
