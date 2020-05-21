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
 * Model class for EbCustomerContact
 */
@Entity
@Table(name = "EB_CUSTOMER_CONTACT")
public class EbCustomerContactModel extends BaseModel implements OperationLog {

	//ebccId
	private Long ebccId;
	//ebccEbcuId
	private Long ebccEbcuId;
	//ebccContactName
	private String ebccContactName;
	//ebccViscountship
	private String ebccViscountship;
	//ebccIsDefault
	private String ebccIsDefault;
	//ebccMobile
	private String ebccMobile;
	//ebccTel
	private String ebccTel;
	//ebccFax
	private String ebccFax;
	//ebccEmail
	private String ebccEmail;
	//ebccRemark
	private String ebccRemark;
	//ebccSubstr1
	private String ebccSubstr1;
	//ebccSubstr2
	private String ebccSubstr2;
	//ebccSubstr3
	private String ebccSubstr3;
	//ebccSubstr4
	private String ebccSubstr4;
	//ebccSubstr5
	private String ebccSubstr5;
	//ebccSubstr6
	private String ebccSubstr6;
	//ebccSubstr7
	private String ebccSubstr7;
	//ebccSubstr8
	private String ebccSubstr8;
	//ebccSubdate1
	private Date ebccSubdate1;
	//ebccSubdate2
	private Date ebccSubdate2;
	//ebccSubdate3
	private Date ebccSubdate3;
	//ebccSubdate4
	private Date ebccSubdate4;
	//ebccSubnum1
	private Long ebccSubnum1;
	//ebccSubnum2
	private Long ebccSubnum2;
	//ebccSubnum3
	private Long ebccSubnum3;
	//ebccSubnum4
	private Long ebccSubnum4;
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
	 * Get ebccId
	 */
	@Column(name = "EBCC_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbccId() {
		return ebccId;
	}

	/**
	 * Set ebccId
	 */
	public void setEbccId(Long ebccId) {
		this.ebccId = ebccId;
		addValidField("ebccId");
	}

	/**
	 * Get ebccEbcuId
	 */
	@Column(name = "EBCC_EBCU_ID")
	public Long getEbccEbcuId() {
		return ebccEbcuId;
	}

	/**
	 * Set ebccEbcuId
	 */
	public void setEbccEbcuId(Long ebccEbcuId) {
		this.ebccEbcuId = ebccEbcuId;
		addValidField("ebccEbcuId");
	}

	/**
	 * Get ebccContactName
	 */
	@Column(name = "EBCC_CONTACT_NAME")
	public String getEbccContactName() {
		return ebccContactName;
	}

	/**
	 * Set ebccContactName
	 */
	public void setEbccContactName(String ebccContactName) {
		this.ebccContactName = ebccContactName;
		addValidField("ebccContactName");
	}

	/**
	 * Get ebccViscountship
	 */
	@Column(name = "EBCC_VISCOUNTSHIP")
	public String getEbccViscountship() {
		return ebccViscountship;
	}

	/**
	 * Set ebccViscountship
	 */
	public void setEbccViscountship(String ebccViscountship) {
		this.ebccViscountship = ebccViscountship;
		addValidField("ebccViscountship");
	}

	/**
	 * Get ebccIsDefault
	 */
	@Column(name = "EBCC_IS_DEFAULT")
	public String getEbccIsDefault() {
		return ebccIsDefault;
	}

	/**
	 * Set ebccIsDefault
	 */
	public void setEbccIsDefault(String ebccIsDefault) {
		this.ebccIsDefault = ebccIsDefault;
		addValidField("ebccIsDefault");
	}

	/**
	 * Get ebccMobile
	 */
	@Column(name = "EBCC_MOBILE")
	public String getEbccMobile() {
		return ebccMobile;
	}

	/**
	 * Set ebccMobile
	 */
	public void setEbccMobile(String ebccMobile) {
		this.ebccMobile = ebccMobile;
		addValidField("ebccMobile");
	}

	/**
	 * Get ebccTel
	 */
	@Column(name = "EBCC_TEL")
	public String getEbccTel() {
		return ebccTel;
	}

	/**
	 * Set ebccTel
	 */
	public void setEbccTel(String ebccTel) {
		this.ebccTel = ebccTel;
		addValidField("ebccTel");
	}

	/**
	 * Get ebccFax
	 */
	@Column(name = "EBCC_FAX")
	public String getEbccFax() {
		return ebccFax;
	}

	/**
	 * Set ebccFax
	 */
	public void setEbccFax(String ebccFax) {
		this.ebccFax = ebccFax;
		addValidField("ebccFax");
	}

	/**
	 * Get ebccEmail
	 */
	@Column(name = "EBCC_EMAIL")
	public String getEbccEmail() {
		return ebccEmail;
	}

	/**
	 * Set ebccEmail
	 */
	public void setEbccEmail(String ebccEmail) {
		this.ebccEmail = ebccEmail;
		addValidField("ebccEmail");
	}

	/**
	 * Get ebccRemark
	 */
	@Column(name = "EBCC_REMARK")
	public String getEbccRemark() {
		return ebccRemark;
	}

	/**
	 * Set ebccRemark
	 */
	public void setEbccRemark(String ebccRemark) {
		this.ebccRemark = ebccRemark;
		addValidField("ebccRemark");
	}

	/**
	 * Get ebccSubstr1
	 */
	@Column(name = "EBCC_SUBSTR1")
	public String getEbccSubstr1() {
		return ebccSubstr1;
	}

	/**
	 * Set ebccSubstr1
	 */
	public void setEbccSubstr1(String ebccSubstr1) {
		this.ebccSubstr1 = ebccSubstr1;
		addValidField("ebccSubstr1");
	}

	/**
	 * Get ebccSubstr2
	 */
	@Column(name = "EBCC_SUBSTR2")
	public String getEbccSubstr2() {
		return ebccSubstr2;
	}

	/**
	 * Set ebccSubstr2
	 */
	public void setEbccSubstr2(String ebccSubstr2) {
		this.ebccSubstr2 = ebccSubstr2;
		addValidField("ebccSubstr2");
	}

	/**
	 * Get ebccSubstr3
	 */
	@Column(name = "EBCC_SUBSTR3")
	public String getEbccSubstr3() {
		return ebccSubstr3;
	}

	/**
	 * Set ebccSubstr3
	 */
	public void setEbccSubstr3(String ebccSubstr3) {
		this.ebccSubstr3 = ebccSubstr3;
		addValidField("ebccSubstr3");
	}

	/**
	 * Get ebccSubstr4
	 */
	@Column(name = "EBCC_SUBSTR4")
	public String getEbccSubstr4() {
		return ebccSubstr4;
	}

	/**
	 * Set ebccSubstr4
	 */
	public void setEbccSubstr4(String ebccSubstr4) {
		this.ebccSubstr4 = ebccSubstr4;
		addValidField("ebccSubstr4");
	}

	/**
	 * Get ebccSubstr5
	 */
	@Column(name = "EBCC_SUBSTR5")
	public String getEbccSubstr5() {
		return ebccSubstr5;
	}

	/**
	 * Set ebccSubstr5
	 */
	public void setEbccSubstr5(String ebccSubstr5) {
		this.ebccSubstr5 = ebccSubstr5;
		addValidField("ebccSubstr5");
	}

	/**
	 * Get ebccSubstr6
	 */
	@Column(name = "EBCC_SUBSTR6")
	public String getEbccSubstr6() {
		return ebccSubstr6;
	}

	/**
	 * Set ebccSubstr6
	 */
	public void setEbccSubstr6(String ebccSubstr6) {
		this.ebccSubstr6 = ebccSubstr6;
		addValidField("ebccSubstr6");
	}

	/**
	 * Get ebccSubstr7
	 */
	@Column(name = "EBCC_SUBSTR7")
	public String getEbccSubstr7() {
		return ebccSubstr7;
	}

	/**
	 * Set ebccSubstr7
	 */
	public void setEbccSubstr7(String ebccSubstr7) {
		this.ebccSubstr7 = ebccSubstr7;
		addValidField("ebccSubstr7");
	}

	/**
	 * Get ebccSubstr8
	 */
	@Column(name = "EBCC_SUBSTR8")
	public String getEbccSubstr8() {
		return ebccSubstr8;
	}

	/**
	 * Set ebccSubstr8
	 */
	public void setEbccSubstr8(String ebccSubstr8) {
		this.ebccSubstr8 = ebccSubstr8;
		addValidField("ebccSubstr8");
	}

	/**
	 * Get ebccSubdate1
	 */
	@Column(name = "EBCC_SUBDATE1")
	public Date getEbccSubdate1() {
		return ebccSubdate1;
	}

	/**
	 * Set ebccSubdate1
	 */
	public void setEbccSubdate1(Date ebccSubdate1) {
		this.ebccSubdate1 = ebccSubdate1;
		addValidField("ebccSubdate1");
	}

	/**
	 * Get ebccSubdate2
	 */
	@Column(name = "EBCC_SUBDATE2")
	public Date getEbccSubdate2() {
		return ebccSubdate2;
	}

	/**
	 * Set ebccSubdate2
	 */
	public void setEbccSubdate2(Date ebccSubdate2) {
		this.ebccSubdate2 = ebccSubdate2;
		addValidField("ebccSubdate2");
	}

	/**
	 * Get ebccSubdate3
	 */
	@Column(name = "EBCC_SUBDATE3")
	public Date getEbccSubdate3() {
		return ebccSubdate3;
	}

	/**
	 * Set ebccSubdate3
	 */
	public void setEbccSubdate3(Date ebccSubdate3) {
		this.ebccSubdate3 = ebccSubdate3;
		addValidField("ebccSubdate3");
	}

	/**
	 * Get ebccSubdate4
	 */
	@Column(name = "EBCC_SUBDATE4")
	public Date getEbccSubdate4() {
		return ebccSubdate4;
	}

	/**
	 * Set ebccSubdate4
	 */
	public void setEbccSubdate4(Date ebccSubdate4) {
		this.ebccSubdate4 = ebccSubdate4;
		addValidField("ebccSubdate4");
	}

	/**
	 * Get ebccSubnum1
	 */
	@Column(name = "EBCC_SUBNUM1")
	public Long getEbccSubnum1() {
		return ebccSubnum1;
	}

	/**
	 * Set ebccSubnum1
	 */
	public void setEbccSubnum1(Long ebccSubnum1) {
		this.ebccSubnum1 = ebccSubnum1;
		addValidField("ebccSubnum1");
	}

	/**
	 * Get ebccSubnum2
	 */
	@Column(name = "EBCC_SUBNUM2")
	public Long getEbccSubnum2() {
		return ebccSubnum2;
	}

	/**
	 * Set ebccSubnum2
	 */
	public void setEbccSubnum2(Long ebccSubnum2) {
		this.ebccSubnum2 = ebccSubnum2;
		addValidField("ebccSubnum2");
	}

	/**
	 * Get ebccSubnum3
	 */
	@Column(name = "EBCC_SUBNUM3")
	public Long getEbccSubnum3() {
		return ebccSubnum3;
	}

	/**
	 * Set ebccSubnum3
	 */
	public void setEbccSubnum3(Long ebccSubnum3) {
		this.ebccSubnum3 = ebccSubnum3;
		addValidField("ebccSubnum3");
	}

	/**
	 * Get ebccSubnum4
	 */
	@Column(name = "EBCC_SUBNUM4")
	public Long getEbccSubnum4() {
		return ebccSubnum4;
	}

	/**
	 * Set ebccSubnum4
	 */
	public void setEbccSubnum4(Long ebccSubnum4) {
		this.ebccSubnum4 = ebccSubnum4;
		addValidField("ebccSubnum4");
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
