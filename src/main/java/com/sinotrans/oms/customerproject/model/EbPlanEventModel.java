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
 * Model class for EbPlanEvent
 */
@Entity
@Table(name = "EB_PLAN_EVENT")
public class EbPlanEventModel extends BaseModel implements OperationLog {

	//ebevId
	private Long ebevId;
	//ebevEbppId
	private Long ebevEbppId;
	//ebevEbtkId
	private Long ebevEbtkId;
	//ebevEscoId
	private Long ebevEscoId;
	//ebevEbpjId
	private Long ebevEbpjId;
	//ebevName
	private String ebevName;
	//ebevType
	private String ebevType;
	//ebevDesc
	private String ebevDesc;
	//ebevEvtEbpdId
	private Long ebevEvtEbpdId;
	//ebevEvtEbpdCode
	private String ebevEvtEbpdCode;
	//ebevSubstr1
	private String ebevSubstr1;
	//ebevSubstr2
	private String ebevSubstr2;
	//ebevSubstr3
	private String ebevSubstr3;
	//ebevSubstr4
	private String ebevSubstr4;
	//ebevSubstr5
	private String ebevSubstr5;
	//ebevSubstr6
	private String ebevSubstr6;
	//ebevSubstr7
	private String ebevSubstr7;
	//ebevSubstr8
	private String ebevSubstr8;
	//ebevSubdate1
	private Date ebevSubdate1;
	//ebevSubdate2
	private Date ebevSubdate2;
	//ebevSubdate3
	private Date ebevSubdate3;
	//ebevSubdate4
	private Date ebevSubdate4;
	//ebevSubnum1
	private Long ebevSubnum1;
	//ebevSubnum2
	private Long ebevSubnum2;
	//ebevSubnum3
	private Long ebevSubnum3;
	//ebevSubnum4
	private Long ebevSubnum4;
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
	 * Get ebevId
	 */
	@Column(name = "EBEV_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbevId() {
		return ebevId;
	}

	/**
	 * Set ebevId
	 */
	public void setEbevId(Long ebevId) {
		this.ebevId = ebevId;
		addValidField("ebevId");
	}

	/**
	 * Get ebevEbppId
	 */
	@Column(name = "EBEV_EBPP_ID")
	public Long getEbevEbppId() {
		return ebevEbppId;
	}

	/**
	 * Set ebevEbppId
	 */
	public void setEbevEbppId(Long ebevEbppId) {
		this.ebevEbppId = ebevEbppId;
		addValidField("ebevEbppId");
	}

	/**
	 * Get ebevEbtkId
	 */
	@Column(name = "EBEV_EBTK_ID")
	public Long getEbevEbtkId() {
		return ebevEbtkId;
	}

	/**
	 * Set ebevEbtkId
	 */
	public void setEbevEbtkId(Long ebevEbtkId) {
		this.ebevEbtkId = ebevEbtkId;
		addValidField("ebevEbtkId");
	}

	/**
	 * Get ebevEscoId
	 */
	@Column(name = "EBEV_ESCO_ID")
	public Long getEbevEscoId() {
		return ebevEscoId;
	}

	/**
	 * Set ebevEscoId
	 */
	public void setEbevEscoId(Long ebevEscoId) {
		this.ebevEscoId = ebevEscoId;
		addValidField("ebevEscoId");
	}

	/**
	 * Get ebevEbpjId
	 */
	@Column(name = "EBEV_EBPJ_ID")
	public Long getEbevEbpjId() {
		return ebevEbpjId;
	}

	/**
	 * Set ebevEbpjId
	 */
	public void setEbevEbpjId(Long ebevEbpjId) {
		this.ebevEbpjId = ebevEbpjId;
		addValidField("ebevEbpjId");
	}

	/**
	 * Get ebevName
	 */
	@Column(name = "EBEV_NAME")
	public String getEbevName() {
		return ebevName;
	}

	/**
	 * Set ebevName
	 */
	public void setEbevName(String ebevName) {
		this.ebevName = ebevName;
		addValidField("ebevName");
	}

	/**
	 * Get ebevType
	 */
	@Column(name = "EBEV_TYPE")
	public String getEbevType() {
		return ebevType;
	}

	/**
	 * Set ebevType
	 */
	public void setEbevType(String ebevType) {
		this.ebevType = ebevType;
		addValidField("ebevType");
	}

	/**
	 * Get ebevDesc
	 */
	@Column(name = "EBEV_DESC")
	public String getEbevDesc() {
		return ebevDesc;
	}

	/**
	 * Set ebevDesc
	 */
	public void setEbevDesc(String ebevDesc) {
		this.ebevDesc = ebevDesc;
		addValidField("ebevDesc");
	}

	/**
	 * Get ebevEvtEbpdId
	 */
	@Column(name = "EBEV_EVT_EBPD_ID")
	public Long getEbevEvtEbpdId() {
		return ebevEvtEbpdId;
	}

	/**
	 * Set ebevEvtEbpdId
	 */
	public void setEbevEvtEbpdId(Long ebevEvtEbpdId) {
		this.ebevEvtEbpdId = ebevEvtEbpdId;
		addValidField("ebevEvtEbpdId");
	}

	/**
	 * Get ebevEvtEbpdCode
	 */
	@Column(name = "EBEV_EVT_EBPD_CODE")
	public String getEbevEvtEbpdCode() {
		return ebevEvtEbpdCode;
	}

	/**
	 * Set ebevEvtEbpdCode
	 */
	public void setEbevEvtEbpdCode(String ebevEvtEbpdCode) {
		this.ebevEvtEbpdCode = ebevEvtEbpdCode;
		addValidField("ebevEvtEbpdCode");
	}

	/**
	 * Get ebevSubstr1
	 */
	@Column(name = "EBEV_SUBSTR1")
	public String getEbevSubstr1() {
		return ebevSubstr1;
	}

	/**
	 * Set ebevSubstr1
	 */
	public void setEbevSubstr1(String ebevSubstr1) {
		this.ebevSubstr1 = ebevSubstr1;
		addValidField("ebevSubstr1");
	}

	/**
	 * Get ebevSubstr2
	 */
	@Column(name = "EBEV_SUBSTR2")
	public String getEbevSubstr2() {
		return ebevSubstr2;
	}

	/**
	 * Set ebevSubstr2
	 */
	public void setEbevSubstr2(String ebevSubstr2) {
		this.ebevSubstr2 = ebevSubstr2;
		addValidField("ebevSubstr2");
	}

	/**
	 * Get ebevSubstr3
	 */
	@Column(name = "EBEV_SUBSTR3")
	public String getEbevSubstr3() {
		return ebevSubstr3;
	}

	/**
	 * Set ebevSubstr3
	 */
	public void setEbevSubstr3(String ebevSubstr3) {
		this.ebevSubstr3 = ebevSubstr3;
		addValidField("ebevSubstr3");
	}

	/**
	 * Get ebevSubstr4
	 */
	@Column(name = "EBEV_SUBSTR4")
	public String getEbevSubstr4() {
		return ebevSubstr4;
	}

	/**
	 * Set ebevSubstr4
	 */
	public void setEbevSubstr4(String ebevSubstr4) {
		this.ebevSubstr4 = ebevSubstr4;
		addValidField("ebevSubstr4");
	}

	/**
	 * Get ebevSubstr5
	 */
	@Column(name = "EBEV_SUBSTR5")
	public String getEbevSubstr5() {
		return ebevSubstr5;
	}

	/**
	 * Set ebevSubstr5
	 */
	public void setEbevSubstr5(String ebevSubstr5) {
		this.ebevSubstr5 = ebevSubstr5;
		addValidField("ebevSubstr5");
	}

	/**
	 * Get ebevSubstr6
	 */
	@Column(name = "EBEV_SUBSTR6")
	public String getEbevSubstr6() {
		return ebevSubstr6;
	}

	/**
	 * Set ebevSubstr6
	 */
	public void setEbevSubstr6(String ebevSubstr6) {
		this.ebevSubstr6 = ebevSubstr6;
		addValidField("ebevSubstr6");
	}

	/**
	 * Get ebevSubstr7
	 */
	@Column(name = "EBEV_SUBSTR7")
	public String getEbevSubstr7() {
		return ebevSubstr7;
	}

	/**
	 * Set ebevSubstr7
	 */
	public void setEbevSubstr7(String ebevSubstr7) {
		this.ebevSubstr7 = ebevSubstr7;
		addValidField("ebevSubstr7");
	}

	/**
	 * Get ebevSubstr8
	 */
	@Column(name = "EBEV_SUBSTR8")
	public String getEbevSubstr8() {
		return ebevSubstr8;
	}

	/**
	 * Set ebevSubstr8
	 */
	public void setEbevSubstr8(String ebevSubstr8) {
		this.ebevSubstr8 = ebevSubstr8;
		addValidField("ebevSubstr8");
	}

	/**
	 * Get ebevSubdate1
	 */
	@Column(name = "EBEV_SUBDATE1")
	public Date getEbevSubdate1() {
		return ebevSubdate1;
	}

	/**
	 * Set ebevSubdate1
	 */
	public void setEbevSubdate1(Date ebevSubdate1) {
		this.ebevSubdate1 = ebevSubdate1;
		addValidField("ebevSubdate1");
	}

	/**
	 * Get ebevSubdate2
	 */
	@Column(name = "EBEV_SUBDATE2")
	public Date getEbevSubdate2() {
		return ebevSubdate2;
	}

	/**
	 * Set ebevSubdate2
	 */
	public void setEbevSubdate2(Date ebevSubdate2) {
		this.ebevSubdate2 = ebevSubdate2;
		addValidField("ebevSubdate2");
	}

	/**
	 * Get ebevSubdate3
	 */
	@Column(name = "EBEV_SUBDATE3")
	public Date getEbevSubdate3() {
		return ebevSubdate3;
	}

	/**
	 * Set ebevSubdate3
	 */
	public void setEbevSubdate3(Date ebevSubdate3) {
		this.ebevSubdate3 = ebevSubdate3;
		addValidField("ebevSubdate3");
	}

	/**
	 * Get ebevSubdate4
	 */
	@Column(name = "EBEV_SUBDATE4")
	public Date getEbevSubdate4() {
		return ebevSubdate4;
	}

	/**
	 * Set ebevSubdate4
	 */
	public void setEbevSubdate4(Date ebevSubdate4) {
		this.ebevSubdate4 = ebevSubdate4;
		addValidField("ebevSubdate4");
	}

	/**
	 * Get ebevSubnum1
	 */
	@Column(name = "EBEV_SUBNUM1")
	public Long getEbevSubnum1() {
		return ebevSubnum1;
	}

	/**
	 * Set ebevSubnum1
	 */
	public void setEbevSubnum1(Long ebevSubnum1) {
		this.ebevSubnum1 = ebevSubnum1;
		addValidField("ebevSubnum1");
	}

	/**
	 * Get ebevSubnum2
	 */
	@Column(name = "EBEV_SUBNUM2")
	public Long getEbevSubnum2() {
		return ebevSubnum2;
	}

	/**
	 * Set ebevSubnum2
	 */
	public void setEbevSubnum2(Long ebevSubnum2) {
		this.ebevSubnum2 = ebevSubnum2;
		addValidField("ebevSubnum2");
	}

	/**
	 * Get ebevSubnum3
	 */
	@Column(name = "EBEV_SUBNUM3")
	public Long getEbevSubnum3() {
		return ebevSubnum3;
	}

	/**
	 * Set ebevSubnum3
	 */
	public void setEbevSubnum3(Long ebevSubnum3) {
		this.ebevSubnum3 = ebevSubnum3;
		addValidField("ebevSubnum3");
	}

	/**
	 * Get ebevSubnum4
	 */
	@Column(name = "EBEV_SUBNUM4")
	public Long getEbevSubnum4() {
		return ebevSubnum4;
	}

	/**
	 * Set ebevSubnum4
	 */
	public void setEbevSubnum4(Long ebevSubnum4) {
		this.ebevSubnum4 = ebevSubnum4;
		addValidField("ebevSubnum4");
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
