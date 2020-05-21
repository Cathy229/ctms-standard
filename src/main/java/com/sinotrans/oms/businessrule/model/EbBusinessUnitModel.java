package com.sinotrans.oms.businessrule.model;

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
 * Model class for EbBusinessUnit
 */
@Entity
@Table(name = "EB_BUSINESS_UNIT")
public class EbBusinessUnitModel extends BaseModel implements OperationLog {

	//ebbuId
	private Long ebbuId;
	//ebbuType
	private String ebbuType;
	//ebbuCode
	private String ebbuCode;
	//ebbuQuickCode
	private String ebbuQuickCode;
	//ebbuNameCn
	private String ebbuNameCn;
	//ebbuNameEn
	private String ebbuNameEn;
	//ebbuIsAble
	private String ebbuIsAble;
	//ebbuIsControl
	private String ebbuIsControl;
	//ebbuSubstr1
	private String ebbuSubstr1;
	//ebbuSubstr2
	private String ebbuSubstr2;
	//ebbuSubstr3
	private String ebbuSubstr3;
	//ebbuSubstr4
	private String ebbuSubstr4;
	//ebbuSubstr5
	private String ebbuSubstr5;
	//ebbuSubstr6
	private String ebbuSubstr6;
	//ebbuSubstr7
	private String ebbuSubstr7;
	//ebbuSubstr8
	private String ebbuSubstr8;
	//ebbuSubdate1
	private Date ebbuSubdate1;
	//ebbuSubdate2
	private Date ebbuSubdate2;
	//ebbuSubdate3
	private Date ebbuSubdate3;
	//ebbuSubdate4
	private Date ebbuSubdate4;
	//ebbuSubnum1
	private Long ebbuSubnum1;
	//ebbuSubnum2
	private Long ebbuSubnum2;
	//ebbuSubnum3
	private Long ebbuSubnum3;
	//ebbuSubnum4
	private Long ebbuSubnum4;
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
	//ebbuSysCode
	private String ebbuSysCode;
	//ebbuBuEbpdId
	private Long ebbuBuEbpdId;
	//ebbuBuEbpdCode
	private String ebbuBuEbpdCode;
	//ebbuBuAutomatic
	private String ebbuBuAutomatic;
	//ebbuDist1Name
	private String ebbuDist1Name;
	//ebbuDist2Name
	private String ebbuDist2Name;
	//ebbuDist3Name
	private String ebbuDist3Name;
	//ebbuDist4Name
	private String ebbuDist4Name;
	//ebbuDist5Name
	private String ebbuDist5Name;

	/**
	 * Get ebbuId
	 */
	@Column(name = "EBBU_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbbuId() {
		return ebbuId;
	}

	/**
	 * Set ebbuId
	 */
	public void setEbbuId(Long ebbuId) {
		this.ebbuId = ebbuId;
		addValidField("ebbuId");
	}

	/**
	 * Get ebbuType
	 */
	@Column(name = "EBBU_TYPE")
	public String getEbbuType() {
		return ebbuType;
	}

	/**
	 * Set ebbuType
	 */
	public void setEbbuType(String ebbuType) {
		this.ebbuType = ebbuType;
		addValidField("ebbuType");
	}

	/**
	 * Get ebbuCode
	 */
	@Column(name = "EBBU_CODE")
	public String getEbbuCode() {
		return ebbuCode;
	}

	/**
	 * Set ebbuCode
	 */
	public void setEbbuCode(String ebbuCode) {
		this.ebbuCode = ebbuCode;
		addValidField("ebbuCode");
	}

	/**
	 * Get ebbuQuickCode
	 */
	@Column(name = "EBBU_QUICK_CODE")
	public String getEbbuQuickCode() {
		return ebbuQuickCode;
	}

	/**
	 * Set ebbuQuickCode
	 */
	public void setEbbuQuickCode(String ebbuQuickCode) {
		this.ebbuQuickCode = ebbuQuickCode;
		addValidField("ebbuQuickCode");
	}

	/**
	 * Get ebbuNameCn
	 */
	@Column(name = "EBBU_NAME_CN")
	public String getEbbuNameCn() {
		return ebbuNameCn;
	}

	/**
	 * Set ebbuNameCn
	 */
	public void setEbbuNameCn(String ebbuNameCn) {
		this.ebbuNameCn = ebbuNameCn;
		addValidField("ebbuNameCn");
	}

	/**
	 * Get ebbuNameEn
	 */
	@Column(name = "EBBU_NAME_EN")
	public String getEbbuNameEn() {
		return ebbuNameEn;
	}

	/**
	 * Set ebbuNameEn
	 */
	public void setEbbuNameEn(String ebbuNameEn) {
		this.ebbuNameEn = ebbuNameEn;
		addValidField("ebbuNameEn");
	}

	/**
	 * Get ebbuIsAble
	 */
	@Column(name = "EBBU_IS_ABLE")
	public String getEbbuIsAble() {
		return ebbuIsAble;
	}

	/**
	 * Set ebbuIsAble
	 */
	public void setEbbuIsAble(String ebbuIsAble) {
		this.ebbuIsAble = ebbuIsAble;
		addValidField("ebbuIsAble");
	}

	/**
	 * Get ebbuIsControl
	 */
	@Column(name = "EBBU_IS_CONTROL")
	public String getEbbuIsControl() {
		return ebbuIsControl;
	}

	/**
	 * Set ebbuIsControl
	 */
	public void setEbbuIsControl(String ebbuIsControl) {
		this.ebbuIsControl = ebbuIsControl;
		addValidField("ebbuIsControl");
	}

	/**
	 * Get ebbuSubstr1
	 */
	@Column(name = "EBBU_SUBSTR1")
	public String getEbbuSubstr1() {
		return ebbuSubstr1;
	}

	/**
	 * Set ebbuSubstr1
	 */
	public void setEbbuSubstr1(String ebbuSubstr1) {
		this.ebbuSubstr1 = ebbuSubstr1;
		addValidField("ebbuSubstr1");
	}

	/**
	 * Get ebbuSubstr2
	 */
	@Column(name = "EBBU_SUBSTR2")
	public String getEbbuSubstr2() {
		return ebbuSubstr2;
	}

	/**
	 * Set ebbuSubstr2
	 */
	public void setEbbuSubstr2(String ebbuSubstr2) {
		this.ebbuSubstr2 = ebbuSubstr2;
		addValidField("ebbuSubstr2");
	}

	/**
	 * Get ebbuSubstr3
	 */
	@Column(name = "EBBU_SUBSTR3")
	public String getEbbuSubstr3() {
		return ebbuSubstr3;
	}

	/**
	 * Set ebbuSubstr3
	 */
	public void setEbbuSubstr3(String ebbuSubstr3) {
		this.ebbuSubstr3 = ebbuSubstr3;
		addValidField("ebbuSubstr3");
	}

	/**
	 * Get ebbuSubstr4
	 */
	@Column(name = "EBBU_SUBSTR4")
	public String getEbbuSubstr4() {
		return ebbuSubstr4;
	}

	/**
	 * Set ebbuSubstr4
	 */
	public void setEbbuSubstr4(String ebbuSubstr4) {
		this.ebbuSubstr4 = ebbuSubstr4;
		addValidField("ebbuSubstr4");
	}

	/**
	 * Get ebbuSubstr5
	 */
	@Column(name = "EBBU_SUBSTR5")
	public String getEbbuSubstr5() {
		return ebbuSubstr5;
	}

	/**
	 * Set ebbuSubstr5
	 */
	public void setEbbuSubstr5(String ebbuSubstr5) {
		this.ebbuSubstr5 = ebbuSubstr5;
		addValidField("ebbuSubstr5");
	}

	/**
	 * Get ebbuSubstr6
	 */
	@Column(name = "EBBU_SUBSTR6")
	public String getEbbuSubstr6() {
		return ebbuSubstr6;
	}

	/**
	 * Set ebbuSubstr6
	 */
	public void setEbbuSubstr6(String ebbuSubstr6) {
		this.ebbuSubstr6 = ebbuSubstr6;
		addValidField("ebbuSubstr6");
	}

	/**
	 * Get ebbuSubstr7
	 */
	@Column(name = "EBBU_SUBSTR7")
	public String getEbbuSubstr7() {
		return ebbuSubstr7;
	}

	/**
	 * Set ebbuSubstr7
	 */
	public void setEbbuSubstr7(String ebbuSubstr7) {
		this.ebbuSubstr7 = ebbuSubstr7;
		addValidField("ebbuSubstr7");
	}

	/**
	 * Get ebbuSubstr8
	 */
	@Column(name = "EBBU_SUBSTR8")
	public String getEbbuSubstr8() {
		return ebbuSubstr8;
	}

	/**
	 * Set ebbuSubstr8
	 */
	public void setEbbuSubstr8(String ebbuSubstr8) {
		this.ebbuSubstr8 = ebbuSubstr8;
		addValidField("ebbuSubstr8");
	}

	/**
	 * Get ebbuSubdate1
	 */
	@Column(name = "EBBU_SUBDATE1")
	public Date getEbbuSubdate1() {
		return ebbuSubdate1;
	}

	/**
	 * Set ebbuSubdate1
	 */
	public void setEbbuSubdate1(Date ebbuSubdate1) {
		this.ebbuSubdate1 = ebbuSubdate1;
		addValidField("ebbuSubdate1");
	}

	/**
	 * Get ebbuSubdate2
	 */
	@Column(name = "EBBU_SUBDATE2")
	public Date getEbbuSubdate2() {
		return ebbuSubdate2;
	}

	/**
	 * Set ebbuSubdate2
	 */
	public void setEbbuSubdate2(Date ebbuSubdate2) {
		this.ebbuSubdate2 = ebbuSubdate2;
		addValidField("ebbuSubdate2");
	}

	/**
	 * Get ebbuSubdate3
	 */
	@Column(name = "EBBU_SUBDATE3")
	public Date getEbbuSubdate3() {
		return ebbuSubdate3;
	}

	/**
	 * Set ebbuSubdate3
	 */
	public void setEbbuSubdate3(Date ebbuSubdate3) {
		this.ebbuSubdate3 = ebbuSubdate3;
		addValidField("ebbuSubdate3");
	}

	/**
	 * Get ebbuSubdate4
	 */
	@Column(name = "EBBU_SUBDATE4")
	public Date getEbbuSubdate4() {
		return ebbuSubdate4;
	}

	/**
	 * Set ebbuSubdate4
	 */
	public void setEbbuSubdate4(Date ebbuSubdate4) {
		this.ebbuSubdate4 = ebbuSubdate4;
		addValidField("ebbuSubdate4");
	}

	/**
	 * Get ebbuSubnum1
	 */
	@Column(name = "EBBU_SUBNUM1")
	public Long getEbbuSubnum1() {
		return ebbuSubnum1;
	}

	/**
	 * Set ebbuSubnum1
	 */
	public void setEbbuSubnum1(Long ebbuSubnum1) {
		this.ebbuSubnum1 = ebbuSubnum1;
		addValidField("ebbuSubnum1");
	}

	/**
	 * Get ebbuSubnum2
	 */
	@Column(name = "EBBU_SUBNUM2")
	public Long getEbbuSubnum2() {
		return ebbuSubnum2;
	}

	/**
	 * Set ebbuSubnum2
	 */
	public void setEbbuSubnum2(Long ebbuSubnum2) {
		this.ebbuSubnum2 = ebbuSubnum2;
		addValidField("ebbuSubnum2");
	}

	/**
	 * Get ebbuSubnum3
	 */
	@Column(name = "EBBU_SUBNUM3")
	public Long getEbbuSubnum3() {
		return ebbuSubnum3;
	}

	/**
	 * Set ebbuSubnum3
	 */
	public void setEbbuSubnum3(Long ebbuSubnum3) {
		this.ebbuSubnum3 = ebbuSubnum3;
		addValidField("ebbuSubnum3");
	}

	/**
	 * Get ebbuSubnum4
	 */
	@Column(name = "EBBU_SUBNUM4")
	public Long getEbbuSubnum4() {
		return ebbuSubnum4;
	}

	/**
	 * Set ebbuSubnum4
	 */
	public void setEbbuSubnum4(Long ebbuSubnum4) {
		this.ebbuSubnum4 = ebbuSubnum4;
		addValidField("ebbuSubnum4");
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
	 * Get ebbuSysCode
	 */
	@Column(name = "EBBU_SYS_CODE")
	public String getEbbuSysCode() {
		return ebbuSysCode;
	}

	/**
	 * Set ebbuSysCode
	 */
	public void setEbbuSysCode(String ebbuSysCode) {
		this.ebbuSysCode = ebbuSysCode;
		addValidField("ebbuSysCode");
	}

	/**
	 * Get ebbuBuEbpdId
	 */
	@Column(name = "EBBU_BU_EBPD_ID")
	public Long getEbbuBuEbpdId() {
		return ebbuBuEbpdId;
	}

	/**
	 * Set ebbuBuEbpdId
	 */
	public void setEbbuBuEbpdId(Long ebbuBuEbpdId) {
		this.ebbuBuEbpdId = ebbuBuEbpdId;
		addValidField("ebbuBuEbpdId");
	}

	/**
	 * Get ebbuBuEbpdCode
	 */
	@Column(name = "EBBU_BU_EBPD_CODE")
	public String getEbbuBuEbpdCode() {
		return ebbuBuEbpdCode;
	}

	/**
	 * Set ebbuBuEbpdCode
	 */
	public void setEbbuBuEbpdCode(String ebbuBuEbpdCode) {
		this.ebbuBuEbpdCode = ebbuBuEbpdCode;
		addValidField("ebbuBuEbpdCode");
	}

	/**
	 * Get ebbuBuAutomatic
	 */
	@Column(name = "EBBU_BU_AUTOMATIC")
	public String getEbbuBuAutomatic() {
		return ebbuBuAutomatic;
	}

	/**
	 * Set ebbuBuAutomatic
	 */
	public void setEbbuBuAutomatic(String ebbuBuAutomatic) {
		this.ebbuBuAutomatic = ebbuBuAutomatic;
		addValidField("ebbuBuAutomatic");
	}

	/**
	 * Get ebbuDist1Name
	 */
	@Column(name = "EBBU_DIST1_NAME")
	public String getEbbuDist1Name() {
		return ebbuDist1Name;
	}

	/**
	 * Set ebbuDist1Name
	 */
	public void setEbbuDist1Name(String ebbuDist1Name) {
		this.ebbuDist1Name = ebbuDist1Name;
		addValidField("ebbuDist1Name");
	}

	/**
	 * Get ebbuDist2Name
	 */
	@Column(name = "EBBU_DIST2_NAME")
	public String getEbbuDist2Name() {
		return ebbuDist2Name;
	}

	/**
	 * Set ebbuDist2Name
	 */
	public void setEbbuDist2Name(String ebbuDist2Name) {
		this.ebbuDist2Name = ebbuDist2Name;
		addValidField("ebbuDist2Name");
	}

	/**
	 * Get ebbuDist3Name
	 */
	@Column(name = "EBBU_DIST3_NAME")
	public String getEbbuDist3Name() {
		return ebbuDist3Name;
	}

	/**
	 * Set ebbuDist3Name
	 */
	public void setEbbuDist3Name(String ebbuDist3Name) {
		this.ebbuDist3Name = ebbuDist3Name;
		addValidField("ebbuDist3Name");
	}

	/**
	 * Get ebbuDist4Name
	 */
	@Column(name = "EBBU_DIST4_NAME")
	public String getEbbuDist4Name() {
		return ebbuDist4Name;
	}

	/**
	 * Set ebbuDist4Name
	 */
	public void setEbbuDist4Name(String ebbuDist4Name) {
		this.ebbuDist4Name = ebbuDist4Name;
		addValidField("ebbuDist4Name");
	}

	/**
	 * Get ebbuDist5Name
	 */
	@Column(name = "EBBU_DIST5_NAME")
	public String getEbbuDist5Name() {
		return ebbuDist5Name;
	}

	/**
	 * Set ebbuDist5Name
	 */
	public void setEbbuDist5Name(String ebbuDist5Name) {
		this.ebbuDist5Name = ebbuDist5Name;
		addValidField("ebbuDist5Name");
	}

}
