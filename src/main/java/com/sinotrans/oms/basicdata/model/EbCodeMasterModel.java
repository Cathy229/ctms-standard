package com.sinotrans.oms.basicdata.model;

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
 * Model class for EbCodeMaster
 */
@Entity
@Table(name = "EB_CODE_MASTER")
public class EbCodeMasterModel extends BaseModel implements OperationLog {

	//ebcdId
	private Long ebcdId;
	//ebcdEscoId
	private Long ebcdEscoId;
	//ebcdEbpjId
	private Long ebcdEbpjId;
	//ebcdQuickCode
	private String ebcdQuickCode;
	//ebcdDictionaryType
	private String ebcdDictionaryType;
	//ebcdCode
	private String ebcdCode;
	//ebcdNameEn
	private String ebcdNameEn;
	//ebcdNameCn
	private String ebcdNameCn;
	//ebcdLevelType
	private Long ebcdLevelType;
	//ebcdSquenceNo
	private Long ebcdSquenceNo;
	//ebcdDesc
	private String ebcdDesc;
	//ebcdStatus
	private String ebcdStatus;
	//ebcdSubstr1
	private String ebcdSubstr1;
	//ebcdSubstr2
	private String ebcdSubstr2;
	//ebcdSubstr3
	private String ebcdSubstr3;
	//ebcdSubstr4
	private String ebcdSubstr4;
	//ebcdSubstr5
	private String ebcdSubstr5;
	//ebcdSubstr6
	private String ebcdSubstr6;
	//ebcdSubstr7
	private String ebcdSubstr7;
	//ebcdSubstr8
	private String ebcdSubstr8;
	//ebcdSubdate1
	private Date ebcdSubdate1;
	//ebcdSubdate2
	private Date ebcdSubdate2;
	//ebcdSubdate3
	private Date ebcdSubdate3;
	//ebcdSubdate4
	private Date ebcdSubdate4;
	//ebcdSubnum1
	private Long ebcdSubnum1;
	//ebcdSubnum2
	private Long ebcdSubnum2;
	//ebcdSubnum3
	private Long ebcdSubnum3;
	//ebcdSubnum4
	private Long ebcdSubnum4;
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
	//ebcdSubdate5
	private Date ebcdSubdate5;

	/**
	 * Get ebcdId
	 */
	@Column(name = "EBCD_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbcdId() {
		return ebcdId;
	}

	/**
	 * Set ebcdId
	 */
	public void setEbcdId(Long ebcdId) {
		this.ebcdId = ebcdId;
		addValidField("ebcdId");
	}

	/**
	 * Get ebcdEscoId
	 */
	@Column(name = "EBCD_ESCO_ID")
	public Long getEbcdEscoId() {
		return ebcdEscoId;
	}

	/**
	 * Set ebcdEscoId
	 */
	public void setEbcdEscoId(Long ebcdEscoId) {
		this.ebcdEscoId = ebcdEscoId;
		addValidField("ebcdEscoId");
	}

	/**
	 * Get ebcdEbpjId
	 */
	@Column(name = "EBCD_EBPJ_ID")
	public Long getEbcdEbpjId() {
		return ebcdEbpjId;
	}

	/**
	 * Set ebcdEbpjId
	 */
	public void setEbcdEbpjId(Long ebcdEbpjId) {
		this.ebcdEbpjId = ebcdEbpjId;
		addValidField("ebcdEbpjId");
	}

	/**
	 * Get ebcdQuickCode
	 */
	@Column(name = "EBCD_QUICK_CODE")
	public String getEbcdQuickCode() {
		return ebcdQuickCode;
	}

	/**
	 * Set ebcdQuickCode
	 */
	public void setEbcdQuickCode(String ebcdQuickCode) {
		this.ebcdQuickCode = ebcdQuickCode;
		addValidField("ebcdQuickCode");
	}

	/**
	 * Get ebcdDictionaryType
	 */
	@Column(name = "EBCD_DICTIONARY_TYPE")
	public String getEbcdDictionaryType() {
		return ebcdDictionaryType;
	}

	/**
	 * Set ebcdDictionaryType
	 */
	public void setEbcdDictionaryType(String ebcdDictionaryType) {
		this.ebcdDictionaryType = ebcdDictionaryType;
		addValidField("ebcdDictionaryType");
	}

	/**
	 * Get ebcdCode
	 */
	@Column(name = "EBCD_CODE")
	public String getEbcdCode() {
		return ebcdCode;
	}

	/**
	 * Set ebcdCode
	 */
	public void setEbcdCode(String ebcdCode) {
		this.ebcdCode = ebcdCode;
		addValidField("ebcdCode");
	}

	/**
	 * Get ebcdNameEn
	 */
	@Column(name = "EBCD_NAME_EN")
	public String getEbcdNameEn() {
		return ebcdNameEn;
	}

	/**
	 * Set ebcdNameEn
	 */
	public void setEbcdNameEn(String ebcdNameEn) {
		this.ebcdNameEn = ebcdNameEn;
		addValidField("ebcdNameEn");
	}

	/**
	 * Get ebcdNameCn
	 */
	@Column(name = "EBCD_NAME_CN")
	public String getEbcdNameCn() {
		return ebcdNameCn;
	}

	/**
	 * Set ebcdNameCn
	 */
	public void setEbcdNameCn(String ebcdNameCn) {
		this.ebcdNameCn = ebcdNameCn;
		addValidField("ebcdNameCn");
	}

	/**
	 * Get ebcdLevelType
	 */
	@Column(name = "EBCD_LEVEL_TYPE")
	public Long getEbcdLevelType() {
		return ebcdLevelType;
	}

	/**
	 * Set ebcdLevelType
	 */
	public void setEbcdLevelType(Long ebcdLevelType) {
		this.ebcdLevelType = ebcdLevelType;
		addValidField("ebcdLevelType");
	}

	/**
	 * Get ebcdSquenceNo
	 */
	@Column(name = "EBCD_SQUENCE_NO")
	public Long getEbcdSquenceNo() {
		return ebcdSquenceNo;
	}

	/**
	 * Set ebcdSquenceNo
	 */
	public void setEbcdSquenceNo(Long ebcdSquenceNo) {
		this.ebcdSquenceNo = ebcdSquenceNo;
		addValidField("ebcdSquenceNo");
	}

	/**
	 * Get ebcdDesc
	 */
	@Column(name = "EBCD_DESC")
	public String getEbcdDesc() {
		return ebcdDesc;
	}

	/**
	 * Set ebcdDesc
	 */
	public void setEbcdDesc(String ebcdDesc) {
		this.ebcdDesc = ebcdDesc;
		addValidField("ebcdDesc");
	}

	/**
	 * Get ebcdStatus
	 */
	@Column(name = "EBCD_STATUS")
	public String getEbcdStatus() {
		return ebcdStatus;
	}

	/**
	 * Set ebcdStatus
	 */
	public void setEbcdStatus(String ebcdStatus) {
		this.ebcdStatus = ebcdStatus;
		addValidField("ebcdStatus");
	}

	/**
	 * Get ebcdSubstr1
	 */
	@Column(name = "EBCD_SUBSTR1")
	public String getEbcdSubstr1() {
		return ebcdSubstr1;
	}

	/**
	 * Set ebcdSubstr1
	 */
	public void setEbcdSubstr1(String ebcdSubstr1) {
		this.ebcdSubstr1 = ebcdSubstr1;
		addValidField("ebcdSubstr1");
	}

	/**
	 * Get ebcdSubstr2
	 */
	@Column(name = "EBCD_SUBSTR2")
	public String getEbcdSubstr2() {
		return ebcdSubstr2;
	}

	/**
	 * Set ebcdSubstr2
	 */
	public void setEbcdSubstr2(String ebcdSubstr2) {
		this.ebcdSubstr2 = ebcdSubstr2;
		addValidField("ebcdSubstr2");
	}

	/**
	 * Get ebcdSubstr3
	 */
	@Column(name = "EBCD_SUBSTR3")
	public String getEbcdSubstr3() {
		return ebcdSubstr3;
	}

	/**
	 * Set ebcdSubstr3
	 */
	public void setEbcdSubstr3(String ebcdSubstr3) {
		this.ebcdSubstr3 = ebcdSubstr3;
		addValidField("ebcdSubstr3");
	}

	/**
	 * Get ebcdSubstr4
	 */
	@Column(name = "EBCD_SUBSTR4")
	public String getEbcdSubstr4() {
		return ebcdSubstr4;
	}

	/**
	 * Set ebcdSubstr4
	 */
	public void setEbcdSubstr4(String ebcdSubstr4) {
		this.ebcdSubstr4 = ebcdSubstr4;
		addValidField("ebcdSubstr4");
	}

	/**
	 * Get ebcdSubstr5
	 */
	@Column(name = "EBCD_SUBSTR5")
	public String getEbcdSubstr5() {
		return ebcdSubstr5;
	}

	/**
	 * Set ebcdSubstr5
	 */
	public void setEbcdSubstr5(String ebcdSubstr5) {
		this.ebcdSubstr5 = ebcdSubstr5;
		addValidField("ebcdSubstr5");
	}

	/**
	 * Get ebcdSubstr6
	 */
	@Column(name = "EBCD_SUBSTR6")
	public String getEbcdSubstr6() {
		return ebcdSubstr6;
	}

	/**
	 * Set ebcdSubstr6
	 */
	public void setEbcdSubstr6(String ebcdSubstr6) {
		this.ebcdSubstr6 = ebcdSubstr6;
		addValidField("ebcdSubstr6");
	}

	/**
	 * Get ebcdSubstr7
	 */
	@Column(name = "EBCD_SUBSTR7")
	public String getEbcdSubstr7() {
		return ebcdSubstr7;
	}

	/**
	 * Set ebcdSubstr7
	 */
	public void setEbcdSubstr7(String ebcdSubstr7) {
		this.ebcdSubstr7 = ebcdSubstr7;
		addValidField("ebcdSubstr7");
	}

	/**
	 * Get ebcdSubstr8
	 */
	@Column(name = "EBCD_SUBSTR8")
	public String getEbcdSubstr8() {
		return ebcdSubstr8;
	}

	/**
	 * Set ebcdSubstr8
	 */
	public void setEbcdSubstr8(String ebcdSubstr8) {
		this.ebcdSubstr8 = ebcdSubstr8;
		addValidField("ebcdSubstr8");
	}

	/**
	 * Get ebcdSubdate1
	 */
	@Column(name = "EBCD_SUBDATE1")
	public Date getEbcdSubdate1() {
		return ebcdSubdate1;
	}

	/**
	 * Set ebcdSubdate1
	 */
	public void setEbcdSubdate1(Date ebcdSubdate1) {
		this.ebcdSubdate1 = ebcdSubdate1;
		addValidField("ebcdSubdate1");
	}

	/**
	 * Get ebcdSubdate2
	 */
	@Column(name = "EBCD_SUBDATE2")
	public Date getEbcdSubdate2() {
		return ebcdSubdate2;
	}

	/**
	 * Set ebcdSubdate2
	 */
	public void setEbcdSubdate2(Date ebcdSubdate2) {
		this.ebcdSubdate2 = ebcdSubdate2;
		addValidField("ebcdSubdate2");
	}

	/**
	 * Get ebcdSubdate3
	 */
	@Column(name = "EBCD_SUBDATE3")
	public Date getEbcdSubdate3() {
		return ebcdSubdate3;
	}

	/**
	 * Set ebcdSubdate3
	 */
	public void setEbcdSubdate3(Date ebcdSubdate3) {
		this.ebcdSubdate3 = ebcdSubdate3;
		addValidField("ebcdSubdate3");
	}

	/**
	 * Get ebcdSubdate4
	 */
	@Column(name = "EBCD_SUBDATE4")
	public Date getEbcdSubdate4() {
		return ebcdSubdate4;
	}

	/**
	 * Set ebcdSubdate4
	 */
	public void setEbcdSubdate4(Date ebcdSubdate4) {
		this.ebcdSubdate4 = ebcdSubdate4;
		addValidField("ebcdSubdate4");
	}

	/**
	 * Get ebcdSubnum1
	 */
	@Column(name = "EBCD_SUBNUM1")
	public Long getEbcdSubnum1() {
		return ebcdSubnum1;
	}

	/**
	 * Set ebcdSubnum1
	 */
	public void setEbcdSubnum1(Long ebcdSubnum1) {
		this.ebcdSubnum1 = ebcdSubnum1;
		addValidField("ebcdSubnum1");
	}

	/**
	 * Get ebcdSubnum2
	 */
	@Column(name = "EBCD_SUBNUM2")
	public Long getEbcdSubnum2() {
		return ebcdSubnum2;
	}

	/**
	 * Set ebcdSubnum2
	 */
	public void setEbcdSubnum2(Long ebcdSubnum2) {
		this.ebcdSubnum2 = ebcdSubnum2;
		addValidField("ebcdSubnum2");
	}

	/**
	 * Get ebcdSubnum3
	 */
	@Column(name = "EBCD_SUBNUM3")
	public Long getEbcdSubnum3() {
		return ebcdSubnum3;
	}

	/**
	 * Set ebcdSubnum3
	 */
	public void setEbcdSubnum3(Long ebcdSubnum3) {
		this.ebcdSubnum3 = ebcdSubnum3;
		addValidField("ebcdSubnum3");
	}

	/**
	 * Get ebcdSubnum4
	 */
	@Column(name = "EBCD_SUBNUM4")
	public Long getEbcdSubnum4() {
		return ebcdSubnum4;
	}

	/**
	 * Set ebcdSubnum4
	 */
	public void setEbcdSubnum4(Long ebcdSubnum4) {
		this.ebcdSubnum4 = ebcdSubnum4;
		addValidField("ebcdSubnum4");
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
	 * Get ebcdSubdate5
	 */
	@Column(name = "EBCD_SUBDATE5")
	public Date getEbcdSubdate5() {
		return ebcdSubdate5;
	}

	/**
	 * Set ebcdSubdate5
	 */
	public void setEbcdSubdate5(Date ebcdSubdate5) {
		this.ebcdSubdate5 = ebcdSubdate5;
		addValidField("ebcdSubdate5");
	}

}
