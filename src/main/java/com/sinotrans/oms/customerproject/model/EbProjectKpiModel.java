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
 * Model class for EbProjectKpi
 */
@Entity
@Table(name = "EB_PROJECT_KPI")
public class EbProjectKpiModel extends BaseModel implements OperationLog {

	//ebkpId
	private Long ebkpId;
	//ebkpEscoId
	private Long ebkpEscoId;
	//ebkpEbpjId
	private Long ebkpEbpjId;
	//ebkpType
	private String ebkpType;
	//ebkpName
	private String ebkpName;
	//ebkpFunction
	private String ebkpFunction;
	//ebkpRequirement
	private String ebkpRequirement;
	//ebkpDesc
	private String ebkpDesc;
	//ebkpKpiEbpdId
	private Long ebkpKpiEbpdId;
	//ebkpKpiEbpdCode
	private String ebkpKpiEbpdCode;
	//ebkpSubstr1
	private String ebkpSubstr1;
	//ebkpSubstr2
	private String ebkpSubstr2;
	//ebkpSubstr3
	private String ebkpSubstr3;
	//ebkpSubstr4
	private String ebkpSubstr4;
	//ebkpSubstr5
	private String ebkpSubstr5;
	//ebkpSubstr6
	private String ebkpSubstr6;
	//ebkpSubstr7
	private String ebkpSubstr7;
	//ebkpSubstr8
	private String ebkpSubstr8;
	//ebkpSubdate1
	private Date ebkpSubdate1;
	//ebkpSubdate2
	private Date ebkpSubdate2;
	//ebkpSubdate3
	private Date ebkpSubdate3;
	//ebkpSubdate4
	private Date ebkpSubdate4;
	//ebkpSubnum1
	private Long ebkpSubnum1;
	//ebkpSubnum2
	private Long ebkpSubnum2;
	//ebkpSubnum3
	private Long ebkpSubnum3;
	//ebkpSubnum4
	private Long ebkpSubnum4;
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
	 * Get ebkpId
	 */
	@Column(name = "EBKP_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbkpId() {
		return ebkpId;
	}

	/**
	 * Set ebkpId
	 */
	public void setEbkpId(Long ebkpId) {
		this.ebkpId = ebkpId;
		addValidField("ebkpId");
	}

	/**
	 * Get ebkpEscoId
	 */
	@Column(name = "EBKP_ESCO_ID")
	public Long getEbkpEscoId() {
		return ebkpEscoId;
	}

	/**
	 * Set ebkpEscoId
	 */
	public void setEbkpEscoId(Long ebkpEscoId) {
		this.ebkpEscoId = ebkpEscoId;
		addValidField("ebkpEscoId");
	}

	/**
	 * Get ebkpEbpjId
	 */
	@Column(name = "EBKP_EBPJ_ID")
	public Long getEbkpEbpjId() {
		return ebkpEbpjId;
	}

	/**
	 * Set ebkpEbpjId
	 */
	public void setEbkpEbpjId(Long ebkpEbpjId) {
		this.ebkpEbpjId = ebkpEbpjId;
		addValidField("ebkpEbpjId");
	}

	/**
	 * Get ebkpType
	 */
	@Column(name = "EBKP_TYPE")
	public String getEbkpType() {
		return ebkpType;
	}

	/**
	 * Set ebkpType
	 */
	public void setEbkpType(String ebkpType) {
		this.ebkpType = ebkpType;
		addValidField("ebkpType");
	}

	/**
	 * Get ebkpName
	 */
	@Column(name = "EBKP_NAME")
	public String getEbkpName() {
		return ebkpName;
	}

	/**
	 * Set ebkpName
	 */
	public void setEbkpName(String ebkpName) {
		this.ebkpName = ebkpName;
		addValidField("ebkpName");
	}

	/**
	 * Get ebkpFunction
	 */
	@Column(name = "EBKP_FUNCTION")
	public String getEbkpFunction() {
		return ebkpFunction;
	}

	/**
	 * Set ebkpFunction
	 */
	public void setEbkpFunction(String ebkpFunction) {
		this.ebkpFunction = ebkpFunction;
		addValidField("ebkpFunction");
	}

	/**
	 * Get ebkpRequirement
	 */
	@Column(name = "EBKP_REQUIREMENT")
	public String getEbkpRequirement() {
		return ebkpRequirement;
	}

	/**
	 * Set ebkpRequirement
	 */
	public void setEbkpRequirement(String ebkpRequirement) {
		this.ebkpRequirement = ebkpRequirement;
		addValidField("ebkpRequirement");
	}

	/**
	 * Get ebkpDesc
	 */
	@Column(name = "EBKP_DESC")
	public String getEbkpDesc() {
		return ebkpDesc;
	}

	/**
	 * Set ebkpDesc
	 */
	public void setEbkpDesc(String ebkpDesc) {
		this.ebkpDesc = ebkpDesc;
		addValidField("ebkpDesc");
	}

	/**
	 * Get ebkpKpiEbpdId
	 */
	@Column(name = "EBKP_KPI_EBPD_ID")
	public Long getEbkpKpiEbpdId() {
		return ebkpKpiEbpdId;
	}

	/**
	 * Set ebkpKpiEbpdId
	 */
	public void setEbkpKpiEbpdId(Long ebkpKpiEbpdId) {
		this.ebkpKpiEbpdId = ebkpKpiEbpdId;
		addValidField("ebkpKpiEbpdId");
	}

	/**
	 * Get ebkpKpiEbpdCode
	 */
	@Column(name = "EBKP_KPI_EBPD_CODE")
	public String getEbkpKpiEbpdCode() {
		return ebkpKpiEbpdCode;
	}

	/**
	 * Set ebkpKpiEbpdCode
	 */
	public void setEbkpKpiEbpdCode(String ebkpKpiEbpdCode) {
		this.ebkpKpiEbpdCode = ebkpKpiEbpdCode;
		addValidField("ebkpKpiEbpdCode");
	}

	/**
	 * Get ebkpSubstr1
	 */
	@Column(name = "EBKP_SUBSTR1")
	public String getEbkpSubstr1() {
		return ebkpSubstr1;
	}

	/**
	 * Set ebkpSubstr1
	 */
	public void setEbkpSubstr1(String ebkpSubstr1) {
		this.ebkpSubstr1 = ebkpSubstr1;
		addValidField("ebkpSubstr1");
	}

	/**
	 * Get ebkpSubstr2
	 */
	@Column(name = "EBKP_SUBSTR2")
	public String getEbkpSubstr2() {
		return ebkpSubstr2;
	}

	/**
	 * Set ebkpSubstr2
	 */
	public void setEbkpSubstr2(String ebkpSubstr2) {
		this.ebkpSubstr2 = ebkpSubstr2;
		addValidField("ebkpSubstr2");
	}

	/**
	 * Get ebkpSubstr3
	 */
	@Column(name = "EBKP_SUBSTR3")
	public String getEbkpSubstr3() {
		return ebkpSubstr3;
	}

	/**
	 * Set ebkpSubstr3
	 */
	public void setEbkpSubstr3(String ebkpSubstr3) {
		this.ebkpSubstr3 = ebkpSubstr3;
		addValidField("ebkpSubstr3");
	}

	/**
	 * Get ebkpSubstr4
	 */
	@Column(name = "EBKP_SUBSTR4")
	public String getEbkpSubstr4() {
		return ebkpSubstr4;
	}

	/**
	 * Set ebkpSubstr4
	 */
	public void setEbkpSubstr4(String ebkpSubstr4) {
		this.ebkpSubstr4 = ebkpSubstr4;
		addValidField("ebkpSubstr4");
	}

	/**
	 * Get ebkpSubstr5
	 */
	@Column(name = "EBKP_SUBSTR5")
	public String getEbkpSubstr5() {
		return ebkpSubstr5;
	}

	/**
	 * Set ebkpSubstr5
	 */
	public void setEbkpSubstr5(String ebkpSubstr5) {
		this.ebkpSubstr5 = ebkpSubstr5;
		addValidField("ebkpSubstr5");
	}

	/**
	 * Get ebkpSubstr6
	 */
	@Column(name = "EBKP_SUBSTR6")
	public String getEbkpSubstr6() {
		return ebkpSubstr6;
	}

	/**
	 * Set ebkpSubstr6
	 */
	public void setEbkpSubstr6(String ebkpSubstr6) {
		this.ebkpSubstr6 = ebkpSubstr6;
		addValidField("ebkpSubstr6");
	}

	/**
	 * Get ebkpSubstr7
	 */
	@Column(name = "EBKP_SUBSTR7")
	public String getEbkpSubstr7() {
		return ebkpSubstr7;
	}

	/**
	 * Set ebkpSubstr7
	 */
	public void setEbkpSubstr7(String ebkpSubstr7) {
		this.ebkpSubstr7 = ebkpSubstr7;
		addValidField("ebkpSubstr7");
	}

	/**
	 * Get ebkpSubstr8
	 */
	@Column(name = "EBKP_SUBSTR8")
	public String getEbkpSubstr8() {
		return ebkpSubstr8;
	}

	/**
	 * Set ebkpSubstr8
	 */
	public void setEbkpSubstr8(String ebkpSubstr8) {
		this.ebkpSubstr8 = ebkpSubstr8;
		addValidField("ebkpSubstr8");
	}

	/**
	 * Get ebkpSubdate1
	 */
	@Column(name = "EBKP_SUBDATE1")
	public Date getEbkpSubdate1() {
		return ebkpSubdate1;
	}

	/**
	 * Set ebkpSubdate1
	 */
	public void setEbkpSubdate1(Date ebkpSubdate1) {
		this.ebkpSubdate1 = ebkpSubdate1;
		addValidField("ebkpSubdate1");
	}

	/**
	 * Get ebkpSubdate2
	 */
	@Column(name = "EBKP_SUBDATE2")
	public Date getEbkpSubdate2() {
		return ebkpSubdate2;
	}

	/**
	 * Set ebkpSubdate2
	 */
	public void setEbkpSubdate2(Date ebkpSubdate2) {
		this.ebkpSubdate2 = ebkpSubdate2;
		addValidField("ebkpSubdate2");
	}

	/**
	 * Get ebkpSubdate3
	 */
	@Column(name = "EBKP_SUBDATE3")
	public Date getEbkpSubdate3() {
		return ebkpSubdate3;
	}

	/**
	 * Set ebkpSubdate3
	 */
	public void setEbkpSubdate3(Date ebkpSubdate3) {
		this.ebkpSubdate3 = ebkpSubdate3;
		addValidField("ebkpSubdate3");
	}

	/**
	 * Get ebkpSubdate4
	 */
	@Column(name = "EBKP_SUBDATE4")
	public Date getEbkpSubdate4() {
		return ebkpSubdate4;
	}

	/**
	 * Set ebkpSubdate4
	 */
	public void setEbkpSubdate4(Date ebkpSubdate4) {
		this.ebkpSubdate4 = ebkpSubdate4;
		addValidField("ebkpSubdate4");
	}

	/**
	 * Get ebkpSubnum1
	 */
	@Column(name = "EBKP_SUBNUM1")
	public Long getEbkpSubnum1() {
		return ebkpSubnum1;
	}

	/**
	 * Set ebkpSubnum1
	 */
	public void setEbkpSubnum1(Long ebkpSubnum1) {
		this.ebkpSubnum1 = ebkpSubnum1;
		addValidField("ebkpSubnum1");
	}

	/**
	 * Get ebkpSubnum2
	 */
	@Column(name = "EBKP_SUBNUM2")
	public Long getEbkpSubnum2() {
		return ebkpSubnum2;
	}

	/**
	 * Set ebkpSubnum2
	 */
	public void setEbkpSubnum2(Long ebkpSubnum2) {
		this.ebkpSubnum2 = ebkpSubnum2;
		addValidField("ebkpSubnum2");
	}

	/**
	 * Get ebkpSubnum3
	 */
	@Column(name = "EBKP_SUBNUM3")
	public Long getEbkpSubnum3() {
		return ebkpSubnum3;
	}

	/**
	 * Set ebkpSubnum3
	 */
	public void setEbkpSubnum3(Long ebkpSubnum3) {
		this.ebkpSubnum3 = ebkpSubnum3;
		addValidField("ebkpSubnum3");
	}

	/**
	 * Get ebkpSubnum4
	 */
	@Column(name = "EBKP_SUBNUM4")
	public Long getEbkpSubnum4() {
		return ebkpSubnum4;
	}

	/**
	 * Set ebkpSubnum4
	 */
	public void setEbkpSubnum4(Long ebkpSubnum4) {
		this.ebkpSubnum4 = ebkpSubnum4;
		addValidField("ebkpSubnum4");
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
