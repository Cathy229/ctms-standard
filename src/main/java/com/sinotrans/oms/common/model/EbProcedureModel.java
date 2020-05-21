package com.sinotrans.oms.common.model;

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
 * Model class for EbProcedure
 */
@Entity
@Table(name = "EB_PROCEDURE")
public class EbProcedureModel extends BaseModel implements OperationLog {

	//ebpdId
	private Long ebpdId;
	//ebpdEscoId
	private Long ebpdEscoId;
	//ebpdEbpjId
	private Long ebpdEbpjId;
	//ebpdName
	private String ebpdName;
	//ebpdType
	private String ebpdType;
	//ebpdStage
	private String ebpdStage;
	//ebpdCode
	private String ebpdCode;
	//ebpdDesc
	private String ebpdDesc;
	//ebpdIsAble
	private String ebpdIsAble;
	//ebpdStartTime
	private Date ebpdStartTime;
	//ebpdEndTime
	private Date ebpdEndTime;
	//ebpdSubstr1
	private String ebpdSubstr1;
	//ebpdSubstr2
	private String ebpdSubstr2;
	//ebpdSubstr3
	private String ebpdSubstr3;
	//ebpdSubstr4
	private String ebpdSubstr4;
	//ebpdSubstr5
	private String ebpdSubstr5;
	//ebpdSubstr6
	private String ebpdSubstr6;
	//ebpdSubstr7
	private String ebpdSubstr7;
	//ebpdSubstr8
	private String ebpdSubstr8;
	//ebpdSubdate1
	private Date ebpdSubdate1;
	//ebpdSubdate2
	private Date ebpdSubdate2;
	//ebpdSubdate3
	private Date ebpdSubdate3;
	//ebpdSubdate4
	private Date ebpdSubdate4;
	//ebpdSubnum1
	private Long ebpdSubnum1;
	//ebpdSubnum2
	private Long ebpdSubnum2;
	//ebpdSubnum3
	private Long ebpdSubnum3;
	//ebpdSubnum4
	private Long ebpdSubnum4;
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
	 * Get ebpdId
	 */
	@Column(name = "EBPD_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbpdId() {
		return ebpdId;
	}

	/**
	 * Set ebpdId
	 */
	public void setEbpdId(Long ebpdId) {
		this.ebpdId = ebpdId;
		addValidField("ebpdId");
	}

	/**
	 * Get ebpdEscoId
	 */
	@Column(name = "EBPD_ESCO_ID")
	public Long getEbpdEscoId() {
		return ebpdEscoId;
	}

	/**
	 * Set ebpdEscoId
	 */
	public void setEbpdEscoId(Long ebpdEscoId) {
		this.ebpdEscoId = ebpdEscoId;
		addValidField("ebpdEscoId");
	}

	/**
	 * Get ebpdEbpjId
	 */
	@Column(name = "EBPD_EBPJ_ID")
	public Long getEbpdEbpjId() {
		return ebpdEbpjId;
	}

	/**
	 * Set ebpdEbpjId
	 */
	public void setEbpdEbpjId(Long ebpdEbpjId) {
		this.ebpdEbpjId = ebpdEbpjId;
		addValidField("ebpdEbpjId");
	}

	/**
	 * Get ebpdName
	 */
	@Column(name = "EBPD_NAME")
	public String getEbpdName() {
		return ebpdName;
	}

	/**
	 * Set ebpdName
	 */
	public void setEbpdName(String ebpdName) {
		this.ebpdName = ebpdName;
		addValidField("ebpdName");
	}

	/**
	 * Get ebpdType
	 */
	@Column(name = "EBPD_TYPE")
	public String getEbpdType() {
		return ebpdType;
	}

	/**
	 * Set ebpdType
	 */
	public void setEbpdType(String ebpdType) {
		this.ebpdType = ebpdType;
		addValidField("ebpdType");
	}

	/**
	 * Get ebpdStage
	 */
	@Column(name = "EBPD_STAGE")
	public String getEbpdStage() {
		return ebpdStage;
	}

	/**
	 * Set ebpdStage
	 */
	public void setEbpdStage(String ebpdStage) {
		this.ebpdStage = ebpdStage;
		addValidField("ebpdStage");
	}

	/**
	 * Get ebpdCode
	 */
	@Column(name = "EBPD_CODE")
	public String getEbpdCode() {
		return ebpdCode;
	}

	/**
	 * Set ebpdCode
	 */
	public void setEbpdCode(String ebpdCode) {
		this.ebpdCode = ebpdCode;
		addValidField("ebpdCode");
	}

	/**
	 * Get ebpdDesc
	 */
	@Column(name = "EBPD_DESC")
	public String getEbpdDesc() {
		return ebpdDesc;
	}

	/**
	 * Set ebpdDesc
	 */
	public void setEbpdDesc(String ebpdDesc) {
		this.ebpdDesc = ebpdDesc;
		addValidField("ebpdDesc");
	}

	/**
	 * Get ebpdIsAble
	 */
	@Column(name = "EBPD_IS_ABLE")
	public String getEbpdIsAble() {
		return ebpdIsAble;
	}

	/**
	 * Set ebpdIsAble
	 */
	public void setEbpdIsAble(String ebpdIsAble) {
		this.ebpdIsAble = ebpdIsAble;
		addValidField("ebpdIsAble");
	}

	/**
	 * Get ebpdStartTime
	 */
	@Column(name = "EBPD_START_TIME")
	public Date getEbpdStartTime() {
		return ebpdStartTime;
	}

	/**
	 * Set ebpdStartTime
	 */
	public void setEbpdStartTime(Date ebpdStartTime) {
		this.ebpdStartTime = ebpdStartTime;
		addValidField("ebpdStartTime");
	}

	/**
	 * Get ebpdEndTime
	 */
	@Column(name = "EBPD_END_TIME")
	public Date getEbpdEndTime() {
		return ebpdEndTime;
	}

	/**
	 * Set ebpdEndTime
	 */
	public void setEbpdEndTime(Date ebpdEndTime) {
		this.ebpdEndTime = ebpdEndTime;
		addValidField("ebpdEndTime");
	}

	/**
	 * Get ebpdSubstr1
	 */
	@Column(name = "EBPD_SUBSTR1")
	public String getEbpdSubstr1() {
		return ebpdSubstr1;
	}

	/**
	 * Set ebpdSubstr1
	 */
	public void setEbpdSubstr1(String ebpdSubstr1) {
		this.ebpdSubstr1 = ebpdSubstr1;
		addValidField("ebpdSubstr1");
	}

	/**
	 * Get ebpdSubstr2
	 */
	@Column(name = "EBPD_SUBSTR2")
	public String getEbpdSubstr2() {
		return ebpdSubstr2;
	}

	/**
	 * Set ebpdSubstr2
	 */
	public void setEbpdSubstr2(String ebpdSubstr2) {
		this.ebpdSubstr2 = ebpdSubstr2;
		addValidField("ebpdSubstr2");
	}

	/**
	 * Get ebpdSubstr3
	 */
	@Column(name = "EBPD_SUBSTR3")
	public String getEbpdSubstr3() {
		return ebpdSubstr3;
	}

	/**
	 * Set ebpdSubstr3
	 */
	public void setEbpdSubstr3(String ebpdSubstr3) {
		this.ebpdSubstr3 = ebpdSubstr3;
		addValidField("ebpdSubstr3");
	}

	/**
	 * Get ebpdSubstr4
	 */
	@Column(name = "EBPD_SUBSTR4")
	public String getEbpdSubstr4() {
		return ebpdSubstr4;
	}

	/**
	 * Set ebpdSubstr4
	 */
	public void setEbpdSubstr4(String ebpdSubstr4) {
		this.ebpdSubstr4 = ebpdSubstr4;
		addValidField("ebpdSubstr4");
	}

	/**
	 * Get ebpdSubstr5
	 */
	@Column(name = "EBPD_SUBSTR5")
	public String getEbpdSubstr5() {
		return ebpdSubstr5;
	}

	/**
	 * Set ebpdSubstr5
	 */
	public void setEbpdSubstr5(String ebpdSubstr5) {
		this.ebpdSubstr5 = ebpdSubstr5;
		addValidField("ebpdSubstr5");
	}

	/**
	 * Get ebpdSubstr6
	 */
	@Column(name = "EBPD_SUBSTR6")
	public String getEbpdSubstr6() {
		return ebpdSubstr6;
	}

	/**
	 * Set ebpdSubstr6
	 */
	public void setEbpdSubstr6(String ebpdSubstr6) {
		this.ebpdSubstr6 = ebpdSubstr6;
		addValidField("ebpdSubstr6");
	}

	/**
	 * Get ebpdSubstr7
	 */
	@Column(name = "EBPD_SUBSTR7")
	public String getEbpdSubstr7() {
		return ebpdSubstr7;
	}

	/**
	 * Set ebpdSubstr7
	 */
	public void setEbpdSubstr7(String ebpdSubstr7) {
		this.ebpdSubstr7 = ebpdSubstr7;
		addValidField("ebpdSubstr7");
	}

	/**
	 * Get ebpdSubstr8
	 */
	@Column(name = "EBPD_SUBSTR8")
	public String getEbpdSubstr8() {
		return ebpdSubstr8;
	}

	/**
	 * Set ebpdSubstr8
	 */
	public void setEbpdSubstr8(String ebpdSubstr8) {
		this.ebpdSubstr8 = ebpdSubstr8;
		addValidField("ebpdSubstr8");
	}

	/**
	 * Get ebpdSubdate1
	 */
	@Column(name = "EBPD_SUBDATE1")
	public Date getEbpdSubdate1() {
		return ebpdSubdate1;
	}

	/**
	 * Set ebpdSubdate1
	 */
	public void setEbpdSubdate1(Date ebpdSubdate1) {
		this.ebpdSubdate1 = ebpdSubdate1;
		addValidField("ebpdSubdate1");
	}

	/**
	 * Get ebpdSubdate2
	 */
	@Column(name = "EBPD_SUBDATE2")
	public Date getEbpdSubdate2() {
		return ebpdSubdate2;
	}

	/**
	 * Set ebpdSubdate2
	 */
	public void setEbpdSubdate2(Date ebpdSubdate2) {
		this.ebpdSubdate2 = ebpdSubdate2;
		addValidField("ebpdSubdate2");
	}

	/**
	 * Get ebpdSubdate3
	 */
	@Column(name = "EBPD_SUBDATE3")
	public Date getEbpdSubdate3() {
		return ebpdSubdate3;
	}

	/**
	 * Set ebpdSubdate3
	 */
	public void setEbpdSubdate3(Date ebpdSubdate3) {
		this.ebpdSubdate3 = ebpdSubdate3;
		addValidField("ebpdSubdate3");
	}

	/**
	 * Get ebpdSubdate4
	 */
	@Column(name = "EBPD_SUBDATE4")
	public Date getEbpdSubdate4() {
		return ebpdSubdate4;
	}

	/**
	 * Set ebpdSubdate4
	 */
	public void setEbpdSubdate4(Date ebpdSubdate4) {
		this.ebpdSubdate4 = ebpdSubdate4;
		addValidField("ebpdSubdate4");
	}

	/**
	 * Get ebpdSubnum1
	 */
	@Column(name = "EBPD_SUBNUM1")
	public Long getEbpdSubnum1() {
		return ebpdSubnum1;
	}

	/**
	 * Set ebpdSubnum1
	 */
	public void setEbpdSubnum1(Long ebpdSubnum1) {
		this.ebpdSubnum1 = ebpdSubnum1;
		addValidField("ebpdSubnum1");
	}

	/**
	 * Get ebpdSubnum2
	 */
	@Column(name = "EBPD_SUBNUM2")
	public Long getEbpdSubnum2() {
		return ebpdSubnum2;
	}

	/**
	 * Set ebpdSubnum2
	 */
	public void setEbpdSubnum2(Long ebpdSubnum2) {
		this.ebpdSubnum2 = ebpdSubnum2;
		addValidField("ebpdSubnum2");
	}

	/**
	 * Get ebpdSubnum3
	 */
	@Column(name = "EBPD_SUBNUM3")
	public Long getEbpdSubnum3() {
		return ebpdSubnum3;
	}

	/**
	 * Set ebpdSubnum3
	 */
	public void setEbpdSubnum3(Long ebpdSubnum3) {
		this.ebpdSubnum3 = ebpdSubnum3;
		addValidField("ebpdSubnum3");
	}

	/**
	 * Get ebpdSubnum4
	 */
	@Column(name = "EBPD_SUBNUM4")
	public Long getEbpdSubnum4() {
		return ebpdSubnum4;
	}

	/**
	 * Set ebpdSubnum4
	 */
	public void setEbpdSubnum4(Long ebpdSubnum4) {
		this.ebpdSubnum4 = ebpdSubnum4;
		addValidField("ebpdSubnum4");
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
