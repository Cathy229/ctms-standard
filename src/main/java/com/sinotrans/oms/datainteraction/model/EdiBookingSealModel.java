package com.sinotrans.oms.datainteraction.model;

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
 * Model class for EdiBookingSeal
 */
@Entity
@Table(name = "EDI_BOOKING_SEAL")
public class EdiBookingSealModel extends BaseModel implements OperationLog {

	//edbsId
	private Long edbsId;
	//edbsEdbcId
	private Long edbsEdbcId;
	//edbsSealKind
	private String edbsSealKind;
	//edbsSealAgencyCode
	private String edbsSealAgencyCode;
	//edbsSealAgencyName
	private String edbsSealAgencyName;
	//edbsSealNo
	private String edbsSealNo;
	//edbsSubstr1
	private String edbsSubstr1;
	//edbsSubstr2
	private String edbsSubstr2;
	//edbsSubstr3
	private String edbsSubstr3;
	//edbsSubstr4
	private String edbsSubstr4;
	//edbsSubstr5
	private String edbsSubstr5;
	//edbsSubstr6
	private String edbsSubstr6;
	//edbsSubstr7
	private String edbsSubstr7;
	//edbsSubstr8
	private String edbsSubstr8;
	//edbsSubdate1
	private Date edbsSubdate1;
	//edbsSubdate2
	private Date edbsSubdate2;
	//edbsSubdate3
	private Date edbsSubdate3;
	//edbsSubdate4
	private Date edbsSubdate4;
	//edbsSubnum1
	private Long edbsSubnum1;
	//edbsSubnum2
	private Long edbsSubnum2;
	//edbsSubnum3
	private Long edbsSubnum3;
	//edbsSubnum4
	private Long edbsSubnum4;
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
	 * Get edbsId
	 */
	@Column(name = "EDBS_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEdbsId() {
		return edbsId;
	}

	/**
	 * Set edbsId
	 */
	public void setEdbsId(Long edbsId) {
		this.edbsId = edbsId;
		addValidField("edbsId");
	}

	/**
	 * Get edbsEdbcId
	 */
	@Column(name = "EDBS_EDBC_ID")
	public Long getEdbsEdbcId() {
		return edbsEdbcId;
	}

	/**
	 * Set edbsEdbcId
	 */
	public void setEdbsEdbcId(Long edbsEdbcId) {
		this.edbsEdbcId = edbsEdbcId;
		addValidField("edbsEdbcId");
	}

	/**
	 * Get edbsSealKind
	 */
	@Column(name = "EDBS_SEAL_KIND")
	public String getEdbsSealKind() {
		return edbsSealKind;
	}

	/**
	 * Set edbsSealKind
	 */
	public void setEdbsSealKind(String edbsSealKind) {
		this.edbsSealKind = edbsSealKind;
		addValidField("edbsSealKind");
	}

	/**
	 * Get edbsSealAgencyCode
	 */
	@Column(name = "EDBS_SEAL_AGENCY_CODE")
	public String getEdbsSealAgencyCode() {
		return edbsSealAgencyCode;
	}

	/**
	 * Set edbsSealAgencyCode
	 */
	public void setEdbsSealAgencyCode(String edbsSealAgencyCode) {
		this.edbsSealAgencyCode = edbsSealAgencyCode;
		addValidField("edbsSealAgencyCode");
	}

	/**
	 * Get edbsSealAgencyName
	 */
	@Column(name = "EDBS_SEAL_AGENCY_NAME")
	public String getEdbsSealAgencyName() {
		return edbsSealAgencyName;
	}

	/**
	 * Set edbsSealAgencyName
	 */
	public void setEdbsSealAgencyName(String edbsSealAgencyName) {
		this.edbsSealAgencyName = edbsSealAgencyName;
		addValidField("edbsSealAgencyName");
	}

	/**
	 * Get edbsSealNo
	 */
	@Column(name = "EDBS_SEAL_NO")
	public String getEdbsSealNo() {
		return edbsSealNo;
	}

	/**
	 * Set edbsSealNo
	 */
	public void setEdbsSealNo(String edbsSealNo) {
		this.edbsSealNo = edbsSealNo;
		addValidField("edbsSealNo");
	}

	/**
	 * Get edbsSubstr1
	 */
	@Column(name = "EDBS_SUBSTR1")
	public String getEdbsSubstr1() {
		return edbsSubstr1;
	}

	/**
	 * Set edbsSubstr1
	 */
	public void setEdbsSubstr1(String edbsSubstr1) {
		this.edbsSubstr1 = edbsSubstr1;
		addValidField("edbsSubstr1");
	}

	/**
	 * Get edbsSubstr2
	 */
	@Column(name = "EDBS_SUBSTR2")
	public String getEdbsSubstr2() {
		return edbsSubstr2;
	}

	/**
	 * Set edbsSubstr2
	 */
	public void setEdbsSubstr2(String edbsSubstr2) {
		this.edbsSubstr2 = edbsSubstr2;
		addValidField("edbsSubstr2");
	}

	/**
	 * Get edbsSubstr3
	 */
	@Column(name = "EDBS_SUBSTR3")
	public String getEdbsSubstr3() {
		return edbsSubstr3;
	}

	/**
	 * Set edbsSubstr3
	 */
	public void setEdbsSubstr3(String edbsSubstr3) {
		this.edbsSubstr3 = edbsSubstr3;
		addValidField("edbsSubstr3");
	}

	/**
	 * Get edbsSubstr4
	 */
	@Column(name = "EDBS_SUBSTR4")
	public String getEdbsSubstr4() {
		return edbsSubstr4;
	}

	/**
	 * Set edbsSubstr4
	 */
	public void setEdbsSubstr4(String edbsSubstr4) {
		this.edbsSubstr4 = edbsSubstr4;
		addValidField("edbsSubstr4");
	}

	/**
	 * Get edbsSubstr5
	 */
	@Column(name = "EDBS_SUBSTR5")
	public String getEdbsSubstr5() {
		return edbsSubstr5;
	}

	/**
	 * Set edbsSubstr5
	 */
	public void setEdbsSubstr5(String edbsSubstr5) {
		this.edbsSubstr5 = edbsSubstr5;
		addValidField("edbsSubstr5");
	}

	/**
	 * Get edbsSubstr6
	 */
	@Column(name = "EDBS_SUBSTR6")
	public String getEdbsSubstr6() {
		return edbsSubstr6;
	}

	/**
	 * Set edbsSubstr6
	 */
	public void setEdbsSubstr6(String edbsSubstr6) {
		this.edbsSubstr6 = edbsSubstr6;
		addValidField("edbsSubstr6");
	}

	/**
	 * Get edbsSubstr7
	 */
	@Column(name = "EDBS_SUBSTR7")
	public String getEdbsSubstr7() {
		return edbsSubstr7;
	}

	/**
	 * Set edbsSubstr7
	 */
	public void setEdbsSubstr7(String edbsSubstr7) {
		this.edbsSubstr7 = edbsSubstr7;
		addValidField("edbsSubstr7");
	}

	/**
	 * Get edbsSubstr8
	 */
	@Column(name = "EDBS_SUBSTR8")
	public String getEdbsSubstr8() {
		return edbsSubstr8;
	}

	/**
	 * Set edbsSubstr8
	 */
	public void setEdbsSubstr8(String edbsSubstr8) {
		this.edbsSubstr8 = edbsSubstr8;
		addValidField("edbsSubstr8");
	}

	/**
	 * Get edbsSubdate1
	 */
	@Column(name = "EDBS_SUBDATE1")
	public Date getEdbsSubdate1() {
		return edbsSubdate1;
	}

	/**
	 * Set edbsSubdate1
	 */
	public void setEdbsSubdate1(Date edbsSubdate1) {
		this.edbsSubdate1 = edbsSubdate1;
		addValidField("edbsSubdate1");
	}

	/**
	 * Get edbsSubdate2
	 */
	@Column(name = "EDBS_SUBDATE2")
	public Date getEdbsSubdate2() {
		return edbsSubdate2;
	}

	/**
	 * Set edbsSubdate2
	 */
	public void setEdbsSubdate2(Date edbsSubdate2) {
		this.edbsSubdate2 = edbsSubdate2;
		addValidField("edbsSubdate2");
	}

	/**
	 * Get edbsSubdate3
	 */
	@Column(name = "EDBS_SUBDATE3")
	public Date getEdbsSubdate3() {
		return edbsSubdate3;
	}

	/**
	 * Set edbsSubdate3
	 */
	public void setEdbsSubdate3(Date edbsSubdate3) {
		this.edbsSubdate3 = edbsSubdate3;
		addValidField("edbsSubdate3");
	}

	/**
	 * Get edbsSubdate4
	 */
	@Column(name = "EDBS_SUBDATE4")
	public Date getEdbsSubdate4() {
		return edbsSubdate4;
	}

	/**
	 * Set edbsSubdate4
	 */
	public void setEdbsSubdate4(Date edbsSubdate4) {
		this.edbsSubdate4 = edbsSubdate4;
		addValidField("edbsSubdate4");
	}

	/**
	 * Get edbsSubnum1
	 */
	@Column(name = "EDBS_SUBNUM1")
	public Long getEdbsSubnum1() {
		return edbsSubnum1;
	}

	/**
	 * Set edbsSubnum1
	 */
	public void setEdbsSubnum1(Long edbsSubnum1) {
		this.edbsSubnum1 = edbsSubnum1;
		addValidField("edbsSubnum1");
	}

	/**
	 * Get edbsSubnum2
	 */
	@Column(name = "EDBS_SUBNUM2")
	public Long getEdbsSubnum2() {
		return edbsSubnum2;
	}

	/**
	 * Set edbsSubnum2
	 */
	public void setEdbsSubnum2(Long edbsSubnum2) {
		this.edbsSubnum2 = edbsSubnum2;
		addValidField("edbsSubnum2");
	}

	/**
	 * Get edbsSubnum3
	 */
	@Column(name = "EDBS_SUBNUM3")
	public Long getEdbsSubnum3() {
		return edbsSubnum3;
	}

	/**
	 * Set edbsSubnum3
	 */
	public void setEdbsSubnum3(Long edbsSubnum3) {
		this.edbsSubnum3 = edbsSubnum3;
		addValidField("edbsSubnum3");
	}

	/**
	 * Get edbsSubnum4
	 */
	@Column(name = "EDBS_SUBNUM4")
	public Long getEdbsSubnum4() {
		return edbsSubnum4;
	}

	/**
	 * Set edbsSubnum4
	 */
	public void setEdbsSubnum4(Long edbsSubnum4) {
		this.edbsSubnum4 = edbsSubnum4;
		addValidField("edbsSubnum4");
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
