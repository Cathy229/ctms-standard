package com.sinotrans.oms.eoorder.model;

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
 * Model class for EsReportTemplate
 */
@Entity
@Table(name = "ES_REPORT_TEMPLATE")
public class EsReportTemplateModel extends BaseModel implements OperationLog {

	//esrtId
	private Long esrtId;
	//esrtEscoId
	private Long esrtEscoId;
	//esrtNameCn
	private String esrtNameCn;
	//esrtNameEn
	private String esrtNameEn;
	//esrtCode
	private String esrtCode;
	//esrtType
	private String esrtType;
	//esrtUrl
	private String esrtUrl;
	//esrtRsrtid
	private String esrtRsrtid;
	//esrtParameters
	private String esrtParameters;
	//esrtDesc
	private String esrtDesc;
	//esrtSubstr1
	private String esrtSubstr1;
	//esrtSubstr2
	private String esrtSubstr2;
	//esrtSubstr3
	private String esrtSubstr3;
	//esrtSubstr4
	private String esrtSubstr4;
	//esrtSubstr5
	private String esrtSubstr5;
	//esrtSubstr6
	private String esrtSubstr6;
	//esrtSubstr7
	private String esrtSubstr7;
	//esrtSubstr8
	private String esrtSubstr8;
	//esrtSubdate1
	private Date esrtSubdate1;
	//esrtSubdate2
	private Date esrtSubdate2;
	//esrtSubdate3
	private Date esrtSubdate3;
	//esrtSubdate4
	private Date esrtSubdate4;
	//esrtSubnum1
	private Long esrtSubnum1;
	//esrtSubnum2
	private Long esrtSubnum2;
	//esrtSubnum3
	private Long esrtSubnum3;
	//esrtSubnum4
	private Long esrtSubnum4;
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
	 * Get esrtId
	 */
	@Column(name = "ESRT_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEsrtId() {
		return esrtId;
	}

	/**
	 * Set esrtId
	 */
	public void setEsrtId(Long esrtId) {
		this.esrtId = esrtId;
		addValidField("esrtId");
	}

	/**
	 * Get esrtEscoId
	 */
	@Column(name = "ESRT_ESCO_ID")
	public Long getEsrtEscoId() {
		return esrtEscoId;
	}

	/**
	 * Set esrtEscoId
	 */
	public void setEsrtEscoId(Long esrtEscoId) {
		this.esrtEscoId = esrtEscoId;
		addValidField("esrtEscoId");
	}

	/**
	 * Get esrtNameCn
	 */
	@Column(name = "ESRT_NAME_CN")
	public String getEsrtNameCn() {
		return esrtNameCn;
	}

	/**
	 * Set esrtNameCn
	 */
	public void setEsrtNameCn(String esrtNameCn) {
		this.esrtNameCn = esrtNameCn;
		addValidField("esrtNameCn");
	}

	/**
	 * Get esrtNameEn
	 */
	@Column(name = "ESRT_NAME_EN")
	public String getEsrtNameEn() {
		return esrtNameEn;
	}

	/**
	 * Set esrtNameEn
	 */
	public void setEsrtNameEn(String esrtNameEn) {
		this.esrtNameEn = esrtNameEn;
		addValidField("esrtNameEn");
	}

	/**
	 * Get esrtCode
	 */
	@Column(name = "ESRT_CODE")
	public String getEsrtCode() {
		return esrtCode;
	}

	/**
	 * Set esrtCode
	 */
	public void setEsrtCode(String esrtCode) {
		this.esrtCode = esrtCode;
		addValidField("esrtCode");
	}

	/**
	 * Get esrtType
	 */
	@Column(name = "ESRT_TYPE")
	public String getEsrtType() {
		return esrtType;
	}

	/**
	 * Set esrtType
	 */
	public void setEsrtType(String esrtType) {
		this.esrtType = esrtType;
		addValidField("esrtType");
	}

	/**
	 * Get esrtUrl
	 */
	@Column(name = "ESRT_URL")
	public String getEsrtUrl() {
		return esrtUrl;
	}

	/**
	 * Set esrtUrl
	 */
	public void setEsrtUrl(String esrtUrl) {
		this.esrtUrl = esrtUrl;
		addValidField("esrtUrl");
	}

	/**
	 * Get esrtRsrtid
	 */
	@Column(name = "ESRT_RSRTID")
	public String getEsrtRsrtid() {
		return esrtRsrtid;
	}

	/**
	 * Set esrtRsrtid
	 */
	public void setEsrtRsrtid(String esrtRsrtid) {
		this.esrtRsrtid = esrtRsrtid;
		addValidField("esrtRsrtid");
	}

	/**
	 * Get esrtParameters
	 */
	@Column(name = "ESRT_PARAMETERS")
	public String getEsrtParameters() {
		return esrtParameters;
	}

	/**
	 * Set esrtParameters
	 */
	public void setEsrtParameters(String esrtParameters) {
		this.esrtParameters = esrtParameters;
		addValidField("esrtParameters");
	}

	/**
	 * Get esrtDesc
	 */
	@Column(name = "ESRT_DESC")
	public String getEsrtDesc() {
		return esrtDesc;
	}

	/**
	 * Set esrtDesc
	 */
	public void setEsrtDesc(String esrtDesc) {
		this.esrtDesc = esrtDesc;
		addValidField("esrtDesc");
	}

	/**
	 * Get esrtSubstr1
	 */
	@Column(name = "ESRT_SUBSTR1")
	public String getEsrtSubstr1() {
		return esrtSubstr1;
	}

	/**
	 * Set esrtSubstr1
	 */
	public void setEsrtSubstr1(String esrtSubstr1) {
		this.esrtSubstr1 = esrtSubstr1;
		addValidField("esrtSubstr1");
	}

	/**
	 * Get esrtSubstr2
	 */
	@Column(name = "ESRT_SUBSTR2")
	public String getEsrtSubstr2() {
		return esrtSubstr2;
	}

	/**
	 * Set esrtSubstr2
	 */
	public void setEsrtSubstr2(String esrtSubstr2) {
		this.esrtSubstr2 = esrtSubstr2;
		addValidField("esrtSubstr2");
	}

	/**
	 * Get esrtSubstr3
	 */
	@Column(name = "ESRT_SUBSTR3")
	public String getEsrtSubstr3() {
		return esrtSubstr3;
	}

	/**
	 * Set esrtSubstr3
	 */
	public void setEsrtSubstr3(String esrtSubstr3) {
		this.esrtSubstr3 = esrtSubstr3;
		addValidField("esrtSubstr3");
	}

	/**
	 * Get esrtSubstr4
	 */
	@Column(name = "ESRT_SUBSTR4")
	public String getEsrtSubstr4() {
		return esrtSubstr4;
	}

	/**
	 * Set esrtSubstr4
	 */
	public void setEsrtSubstr4(String esrtSubstr4) {
		this.esrtSubstr4 = esrtSubstr4;
		addValidField("esrtSubstr4");
	}

	/**
	 * Get esrtSubstr5
	 */
	@Column(name = "ESRT_SUBSTR5")
	public String getEsrtSubstr5() {
		return esrtSubstr5;
	}

	/**
	 * Set esrtSubstr5
	 */
	public void setEsrtSubstr5(String esrtSubstr5) {
		this.esrtSubstr5 = esrtSubstr5;
		addValidField("esrtSubstr5");
	}

	/**
	 * Get esrtSubstr6
	 */
	@Column(name = "ESRT_SUBSTR6")
	public String getEsrtSubstr6() {
		return esrtSubstr6;
	}

	/**
	 * Set esrtSubstr6
	 */
	public void setEsrtSubstr6(String esrtSubstr6) {
		this.esrtSubstr6 = esrtSubstr6;
		addValidField("esrtSubstr6");
	}

	/**
	 * Get esrtSubstr7
	 */
	@Column(name = "ESRT_SUBSTR7")
	public String getEsrtSubstr7() {
		return esrtSubstr7;
	}

	/**
	 * Set esrtSubstr7
	 */
	public void setEsrtSubstr7(String esrtSubstr7) {
		this.esrtSubstr7 = esrtSubstr7;
		addValidField("esrtSubstr7");
	}

	/**
	 * Get esrtSubstr8
	 */
	@Column(name = "ESRT_SUBSTR8")
	public String getEsrtSubstr8() {
		return esrtSubstr8;
	}

	/**
	 * Set esrtSubstr8
	 */
	public void setEsrtSubstr8(String esrtSubstr8) {
		this.esrtSubstr8 = esrtSubstr8;
		addValidField("esrtSubstr8");
	}

	/**
	 * Get esrtSubdate1
	 */
	@Column(name = "ESRT_SUBDATE1")
	public Date getEsrtSubdate1() {
		return esrtSubdate1;
	}

	/**
	 * Set esrtSubdate1
	 */
	public void setEsrtSubdate1(Date esrtSubdate1) {
		this.esrtSubdate1 = esrtSubdate1;
		addValidField("esrtSubdate1");
	}

	/**
	 * Get esrtSubdate2
	 */
	@Column(name = "ESRT_SUBDATE2")
	public Date getEsrtSubdate2() {
		return esrtSubdate2;
	}

	/**
	 * Set esrtSubdate2
	 */
	public void setEsrtSubdate2(Date esrtSubdate2) {
		this.esrtSubdate2 = esrtSubdate2;
		addValidField("esrtSubdate2");
	}

	/**
	 * Get esrtSubdate3
	 */
	@Column(name = "ESRT_SUBDATE3")
	public Date getEsrtSubdate3() {
		return esrtSubdate3;
	}

	/**
	 * Set esrtSubdate3
	 */
	public void setEsrtSubdate3(Date esrtSubdate3) {
		this.esrtSubdate3 = esrtSubdate3;
		addValidField("esrtSubdate3");
	}

	/**
	 * Get esrtSubdate4
	 */
	@Column(name = "ESRT_SUBDATE4")
	public Date getEsrtSubdate4() {
		return esrtSubdate4;
	}

	/**
	 * Set esrtSubdate4
	 */
	public void setEsrtSubdate4(Date esrtSubdate4) {
		this.esrtSubdate4 = esrtSubdate4;
		addValidField("esrtSubdate4");
	}

	/**
	 * Get esrtSubnum1
	 */
	@Column(name = "ESRT_SUBNUM1")
	public Long getEsrtSubnum1() {
		return esrtSubnum1;
	}

	/**
	 * Set esrtSubnum1
	 */
	public void setEsrtSubnum1(Long esrtSubnum1) {
		this.esrtSubnum1 = esrtSubnum1;
		addValidField("esrtSubnum1");
	}

	/**
	 * Get esrtSubnum2
	 */
	@Column(name = "ESRT_SUBNUM2")
	public Long getEsrtSubnum2() {
		return esrtSubnum2;
	}

	/**
	 * Set esrtSubnum2
	 */
	public void setEsrtSubnum2(Long esrtSubnum2) {
		this.esrtSubnum2 = esrtSubnum2;
		addValidField("esrtSubnum2");
	}

	/**
	 * Get esrtSubnum3
	 */
	@Column(name = "ESRT_SUBNUM3")
	public Long getEsrtSubnum3() {
		return esrtSubnum3;
	}

	/**
	 * Set esrtSubnum3
	 */
	public void setEsrtSubnum3(Long esrtSubnum3) {
		this.esrtSubnum3 = esrtSubnum3;
		addValidField("esrtSubnum3");
	}

	/**
	 * Get esrtSubnum4
	 */
	@Column(name = "ESRT_SUBNUM4")
	public Long getEsrtSubnum4() {
		return esrtSubnum4;
	}

	/**
	 * Set esrtSubnum4
	 */
	public void setEsrtSubnum4(Long esrtSubnum4) {
		this.esrtSubnum4 = esrtSubnum4;
		addValidField("esrtSubnum4");
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
