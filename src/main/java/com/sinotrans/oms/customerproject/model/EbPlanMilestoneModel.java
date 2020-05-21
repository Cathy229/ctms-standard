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
 * Model class for EbPlanMilestone
 */
@Entity
@Table(name = "EB_PLAN_MILESTONE")
public class EbPlanMilestoneModel extends BaseModel implements OperationLog {

	//ebmsId
	private Long ebmsId;
	//ebmsEbppId
	private Long ebmsEbppId;
	//ebmsEbtkId
	private Long ebmsEbtkId;
	//ebmsEscoId
	private Long ebmsEscoId;
	//ebmsEbpjId
	private Long ebmsEbpjId;
	//ebmsName
	private String ebmsName;
	//ebmsType
	private String ebmsType;
	//ebmsDesc
	private String ebmsDesc;
	//ebmsSequence
	private Long ebmsSequence;
	//ebmsMstEbpdId
	private Long ebmsMstEbpdId;
	//ebmsMstEbpdCode
	private String ebmsMstEbpdCode;
	//ebmsSubstr1
	private String ebmsSubstr1;
	//ebmsSubstr2
	private String ebmsSubstr2;
	//ebmsSubstr3
	private String ebmsSubstr3;
	//ebmsSubstr4
	private String ebmsSubstr4;
	//ebmsSubstr5
	private String ebmsSubstr5;
	//ebmsSubstr6
	private String ebmsSubstr6;
	//ebmsSubstr7
	private String ebmsSubstr7;
	//ebmsSubstr8
	private String ebmsSubstr8;
	//ebmsSubdate1
	private Date ebmsSubdate1;
	//ebmsSubdate2
	private Date ebmsSubdate2;
	//ebmsSubdate3
	private Date ebmsSubdate3;
	//ebmsSubdate4
	private Date ebmsSubdate4;
	//ebmsSubnum1
	private Long ebmsSubnum1;
	//ebmsSubnum2
	private Long ebmsSubnum2;
	//ebmsSubnum3
	private Long ebmsSubnum3;
	//ebmsSubnum4
	private Long ebmsSubnum4;
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
	//ebmsCode
	private String ebmsCode;

	/**
	 * Get ebmsId
	 */
	@Column(name = "EBMS_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbmsId() {
		return ebmsId;
	}

	/**
	 * Set ebmsId
	 */
	public void setEbmsId(Long ebmsId) {
		this.ebmsId = ebmsId;
		addValidField("ebmsId");
	}

	/**
	 * Get ebmsEbppId
	 */
	@Column(name = "EBMS_EBPP_ID")
	public Long getEbmsEbppId() {
		return ebmsEbppId;
	}

	/**
	 * Set ebmsEbppId
	 */
	public void setEbmsEbppId(Long ebmsEbppId) {
		this.ebmsEbppId = ebmsEbppId;
		addValidField("ebmsEbppId");
	}

	/**
	 * Get ebmsEbtkId
	 */
	@Column(name = "EBMS_EBTK_ID")
	public Long getEbmsEbtkId() {
		return ebmsEbtkId;
	}

	/**
	 * Set ebmsEbtkId
	 */
	public void setEbmsEbtkId(Long ebmsEbtkId) {
		this.ebmsEbtkId = ebmsEbtkId;
		addValidField("ebmsEbtkId");
	}

	/**
	 * Get ebmsEscoId
	 */
	@Column(name = "EBMS_ESCO_ID")
	public Long getEbmsEscoId() {
		return ebmsEscoId;
	}

	/**
	 * Set ebmsEscoId
	 */
	public void setEbmsEscoId(Long ebmsEscoId) {
		this.ebmsEscoId = ebmsEscoId;
		addValidField("ebmsEscoId");
	}

	/**
	 * Get ebmsEbpjId
	 */
	@Column(name = "EBMS_EBPJ_ID")
	public Long getEbmsEbpjId() {
		return ebmsEbpjId;
	}

	/**
	 * Set ebmsEbpjId
	 */
	public void setEbmsEbpjId(Long ebmsEbpjId) {
		this.ebmsEbpjId = ebmsEbpjId;
		addValidField("ebmsEbpjId");
	}

	/**
	 * Get ebmsName
	 */
	@Column(name = "EBMS_NAME")
	public String getEbmsName() {
		return ebmsName;
	}

	/**
	 * Set ebmsName
	 */
	public void setEbmsName(String ebmsName) {
		this.ebmsName = ebmsName;
		addValidField("ebmsName");
	}

	/**
	 * Get ebmsType
	 */
	@Column(name = "EBMS_TYPE")
	public String getEbmsType() {
		return ebmsType;
	}

	/**
	 * Set ebmsType
	 */
	public void setEbmsType(String ebmsType) {
		this.ebmsType = ebmsType;
		addValidField("ebmsType");
	}

	/**
	 * Get ebmsDesc
	 */
	@Column(name = "EBMS_DESC")
	public String getEbmsDesc() {
		return ebmsDesc;
	}

	/**
	 * Set ebmsDesc
	 */
	public void setEbmsDesc(String ebmsDesc) {
		this.ebmsDesc = ebmsDesc;
		addValidField("ebmsDesc");
	}

	/**
	 * Get ebmsSequence
	 */
	@Column(name = "EBMS_SEQUENCE")
	public Long getEbmsSequence() {
		return ebmsSequence;
	}

	/**
	 * Set ebmsSequence
	 */
	public void setEbmsSequence(Long ebmsSequence) {
		this.ebmsSequence = ebmsSequence;
		addValidField("ebmsSequence");
	}

	/**
	 * Get ebmsMstEbpdId
	 */
	@Column(name = "EBMS_MST_EBPD_ID")
	public Long getEbmsMstEbpdId() {
		return ebmsMstEbpdId;
	}

	/**
	 * Set ebmsMstEbpdId
	 */
	public void setEbmsMstEbpdId(Long ebmsMstEbpdId) {
		this.ebmsMstEbpdId = ebmsMstEbpdId;
		addValidField("ebmsMstEbpdId");
	}

	/**
	 * Get ebmsMstEbpdCode
	 */
	@Column(name = "EBMS_MST_EBPD_CODE")
	public String getEbmsMstEbpdCode() {
		return ebmsMstEbpdCode;
	}

	/**
	 * Set ebmsMstEbpdCode
	 */
	public void setEbmsMstEbpdCode(String ebmsMstEbpdCode) {
		this.ebmsMstEbpdCode = ebmsMstEbpdCode;
		addValidField("ebmsMstEbpdCode");
	}

	/**
	 * Get ebmsSubstr1
	 */
	@Column(name = "EBMS_SUBSTR1")
	public String getEbmsSubstr1() {
		return ebmsSubstr1;
	}

	/**
	 * Set ebmsSubstr1
	 */
	public void setEbmsSubstr1(String ebmsSubstr1) {
		this.ebmsSubstr1 = ebmsSubstr1;
		addValidField("ebmsSubstr1");
	}

	/**
	 * Get ebmsSubstr2
	 */
	@Column(name = "EBMS_SUBSTR2")
	public String getEbmsSubstr2() {
		return ebmsSubstr2;
	}

	/**
	 * Set ebmsSubstr2
	 */
	public void setEbmsSubstr2(String ebmsSubstr2) {
		this.ebmsSubstr2 = ebmsSubstr2;
		addValidField("ebmsSubstr2");
	}

	/**
	 * Get ebmsSubstr3
	 */
	@Column(name = "EBMS_SUBSTR3")
	public String getEbmsSubstr3() {
		return ebmsSubstr3;
	}

	/**
	 * Set ebmsSubstr3
	 */
	public void setEbmsSubstr3(String ebmsSubstr3) {
		this.ebmsSubstr3 = ebmsSubstr3;
		addValidField("ebmsSubstr3");
	}

	/**
	 * Get ebmsSubstr4
	 */
	@Column(name = "EBMS_SUBSTR4")
	public String getEbmsSubstr4() {
		return ebmsSubstr4;
	}

	/**
	 * Set ebmsSubstr4
	 */
	public void setEbmsSubstr4(String ebmsSubstr4) {
		this.ebmsSubstr4 = ebmsSubstr4;
		addValidField("ebmsSubstr4");
	}

	/**
	 * Get ebmsSubstr5
	 */
	@Column(name = "EBMS_SUBSTR5")
	public String getEbmsSubstr5() {
		return ebmsSubstr5;
	}

	/**
	 * Set ebmsSubstr5
	 */
	public void setEbmsSubstr5(String ebmsSubstr5) {
		this.ebmsSubstr5 = ebmsSubstr5;
		addValidField("ebmsSubstr5");
	}

	/**
	 * Get ebmsSubstr6
	 */
	@Column(name = "EBMS_SUBSTR6")
	public String getEbmsSubstr6() {
		return ebmsSubstr6;
	}

	/**
	 * Set ebmsSubstr6
	 */
	public void setEbmsSubstr6(String ebmsSubstr6) {
		this.ebmsSubstr6 = ebmsSubstr6;
		addValidField("ebmsSubstr6");
	}

	/**
	 * Get ebmsSubstr7
	 */
	@Column(name = "EBMS_SUBSTR7")
	public String getEbmsSubstr7() {
		return ebmsSubstr7;
	}

	/**
	 * Set ebmsSubstr7
	 */
	public void setEbmsSubstr7(String ebmsSubstr7) {
		this.ebmsSubstr7 = ebmsSubstr7;
		addValidField("ebmsSubstr7");
	}

	/**
	 * Get ebmsSubstr8
	 */
	@Column(name = "EBMS_SUBSTR8")
	public String getEbmsSubstr8() {
		return ebmsSubstr8;
	}

	/**
	 * Set ebmsSubstr8
	 */
	public void setEbmsSubstr8(String ebmsSubstr8) {
		this.ebmsSubstr8 = ebmsSubstr8;
		addValidField("ebmsSubstr8");
	}

	/**
	 * Get ebmsSubdate1
	 */
	@Column(name = "EBMS_SUBDATE1")
	public Date getEbmsSubdate1() {
		return ebmsSubdate1;
	}

	/**
	 * Set ebmsSubdate1
	 */
	public void setEbmsSubdate1(Date ebmsSubdate1) {
		this.ebmsSubdate1 = ebmsSubdate1;
		addValidField("ebmsSubdate1");
	}

	/**
	 * Get ebmsSubdate2
	 */
	@Column(name = "EBMS_SUBDATE2")
	public Date getEbmsSubdate2() {
		return ebmsSubdate2;
	}

	/**
	 * Set ebmsSubdate2
	 */
	public void setEbmsSubdate2(Date ebmsSubdate2) {
		this.ebmsSubdate2 = ebmsSubdate2;
		addValidField("ebmsSubdate2");
	}

	/**
	 * Get ebmsSubdate3
	 */
	@Column(name = "EBMS_SUBDATE3")
	public Date getEbmsSubdate3() {
		return ebmsSubdate3;
	}

	/**
	 * Set ebmsSubdate3
	 */
	public void setEbmsSubdate3(Date ebmsSubdate3) {
		this.ebmsSubdate3 = ebmsSubdate3;
		addValidField("ebmsSubdate3");
	}

	/**
	 * Get ebmsSubdate4
	 */
	@Column(name = "EBMS_SUBDATE4")
	public Date getEbmsSubdate4() {
		return ebmsSubdate4;
	}

	/**
	 * Set ebmsSubdate4
	 */
	public void setEbmsSubdate4(Date ebmsSubdate4) {
		this.ebmsSubdate4 = ebmsSubdate4;
		addValidField("ebmsSubdate4");
	}

	/**
	 * Get ebmsSubnum1
	 */
	@Column(name = "EBMS_SUBNUM1")
	public Long getEbmsSubnum1() {
		return ebmsSubnum1;
	}

	/**
	 * Set ebmsSubnum1
	 */
	public void setEbmsSubnum1(Long ebmsSubnum1) {
		this.ebmsSubnum1 = ebmsSubnum1;
		addValidField("ebmsSubnum1");
	}

	/**
	 * Get ebmsSubnum2
	 */
	@Column(name = "EBMS_SUBNUM2")
	public Long getEbmsSubnum2() {
		return ebmsSubnum2;
	}

	/**
	 * Set ebmsSubnum2
	 */
	public void setEbmsSubnum2(Long ebmsSubnum2) {
		this.ebmsSubnum2 = ebmsSubnum2;
		addValidField("ebmsSubnum2");
	}

	/**
	 * Get ebmsSubnum3
	 */
	@Column(name = "EBMS_SUBNUM3")
	public Long getEbmsSubnum3() {
		return ebmsSubnum3;
	}

	/**
	 * Set ebmsSubnum3
	 */
	public void setEbmsSubnum3(Long ebmsSubnum3) {
		this.ebmsSubnum3 = ebmsSubnum3;
		addValidField("ebmsSubnum3");
	}

	/**
	 * Get ebmsSubnum4
	 */
	@Column(name = "EBMS_SUBNUM4")
	public Long getEbmsSubnum4() {
		return ebmsSubnum4;
	}

	/**
	 * Set ebmsSubnum4
	 */
	public void setEbmsSubnum4(Long ebmsSubnum4) {
		this.ebmsSubnum4 = ebmsSubnum4;
		addValidField("ebmsSubnum4");
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
	 * Get ebmsCode
	 */
	@Column(name = "EBMS_CODE")
	public String getEbmsCode() {
		return ebmsCode;
	}

	/**
	 * Set ebmsCode
	 */
	public void setEbmsCode(String ebmsCode) {
		this.ebmsCode = ebmsCode;
		addValidField("ebmsCode");
	}

}
