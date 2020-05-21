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
 * Model class for EbShipper
 */
@Entity
@Table(name = "EB_SHIPPER")
public class EbShipperModel extends BaseModel implements OperationLog {

	//ebspId
	private Long ebspId;
	//ebspEscoId
	private Long ebspEscoId;
	//ebspQuickCode
	private String ebspQuickCode;
	//ebspShipperNo
	private String ebspShipperNo;
	//ebspNameCn
	private String ebspNameCn;
	//ebspNameEn
	private String ebspNameEn;
	//ebspShortName
	private String ebspShortName;
	//ebspStatus
	private String ebspStatus;
	//ebspType
	private String ebspType;
	//ebspSubstr1
	private String ebspSubstr1;
	//ebspSubstr2
	private String ebspSubstr2;
	//ebspSubstr3
	private String ebspSubstr3;
	//ebspSubstr4
	private String ebspSubstr4;
	//ebspSubstr5
	private String ebspSubstr5;
	//ebspSubstr6
	private String ebspSubstr6;
	//ebspSubstr7
	private String ebspSubstr7;
	//ebspSubstr8
	private String ebspSubstr8;
	//ebspSubdate1
	private Date ebspSubdate1;
	//ebspSubdate2
	private Date ebspSubdate2;
	//ebspSubdate3
	private Date ebspSubdate3;
	//ebspSubdate4
	private Date ebspSubdate4;
	//ebspSubnum1
	private Long ebspSubnum1;
	//ebspSubnum2
	private Long ebspSubnum2;
	//ebspSubnum3
	private Long ebspSubnum3;
	//ebspSubnum4
	private Long ebspSubnum4;
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
	//ebspEcmseccsId
	private String ebspEcmseccsId;
	//ebspEbbuCode
	private String ebspEbbuCode;

	/**
	 * Get ebspId
	 */
	@Column(name = "EBSP_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbspId() {
		return ebspId;
	}

	/**
	 * Set ebspId
	 */
	public void setEbspId(Long ebspId) {
		this.ebspId = ebspId;
		addValidField("ebspId");
	}

	/**
	 * Get ebspEscoId
	 */
	@Column(name = "EBSP_ESCO_ID")
	public Long getEbspEscoId() {
		return ebspEscoId;
	}

	/**
	 * Set ebspEscoId
	 */
	public void setEbspEscoId(Long ebspEscoId) {
		this.ebspEscoId = ebspEscoId;
		addValidField("ebspEscoId");
	}

	/**
	 * Get ebspQuickCode
	 */
	@Column(name = "EBSP_QUICK_CODE")
	public String getEbspQuickCode() {
		return ebspQuickCode;
	}

	/**
	 * Set ebspQuickCode
	 */
	public void setEbspQuickCode(String ebspQuickCode) {
		this.ebspQuickCode = ebspQuickCode;
		addValidField("ebspQuickCode");
	}

	/**
	 * Get ebspShipperNo
	 */
	@Column(name = "EBSP_SHIPPER_NO")
	public String getEbspShipperNo() {
		return ebspShipperNo;
	}

	/**
	 * Set ebspShipperNo
	 */
	public void setEbspShipperNo(String ebspShipperNo) {
		this.ebspShipperNo = ebspShipperNo;
		addValidField("ebspShipperNo");
	}

	/**
	 * Get ebspNameCn
	 */
	@Column(name = "EBSP_NAME_CN")
	public String getEbspNameCn() {
		return ebspNameCn;
	}

	/**
	 * Set ebspNameCn
	 */
	public void setEbspNameCn(String ebspNameCn) {
		this.ebspNameCn = ebspNameCn;
		addValidField("ebspNameCn");
	}

	/**
	 * Get ebspNameEn
	 */
	@Column(name = "EBSP_NAME_EN")
	public String getEbspNameEn() {
		return ebspNameEn;
	}

	/**
	 * Set ebspNameEn
	 */
	public void setEbspNameEn(String ebspNameEn) {
		this.ebspNameEn = ebspNameEn;
		addValidField("ebspNameEn");
	}

	/**
	 * Get ebspShortName
	 */
	@Column(name = "EBSP_SHORT_NAME")
	public String getEbspShortName() {
		return ebspShortName;
	}

	/**
	 * Set ebspShortName
	 */
	public void setEbspShortName(String ebspShortName) {
		this.ebspShortName = ebspShortName;
		addValidField("ebspShortName");
	}

	/**
	 * Get ebspStatus
	 */
	@Column(name = "EBSP_STATUS")
	public String getEbspStatus() {
		return ebspStatus;
	}

	/**
	 * Set ebspStatus
	 */
	public void setEbspStatus(String ebspStatus) {
		this.ebspStatus = ebspStatus;
		addValidField("ebspStatus");
	}

	/**
	 * Get ebspType
	 */
	@Column(name = "EBSP_TYPE")
	public String getEbspType() {
		return ebspType;
	}

	/**
	 * Set ebspType
	 */
	public void setEbspType(String ebspType) {
		this.ebspType = ebspType;
		addValidField("ebspType");
	}

	/**
	 * Get ebspSubstr1
	 */
	@Column(name = "EBSP_SUBSTR1")
	public String getEbspSubstr1() {
		return ebspSubstr1;
	}

	/**
	 * Set ebspSubstr1
	 */
	public void setEbspSubstr1(String ebspSubstr1) {
		this.ebspSubstr1 = ebspSubstr1;
		addValidField("ebspSubstr1");
	}

	/**
	 * Get ebspSubstr2
	 */
	@Column(name = "EBSP_SUBSTR2")
	public String getEbspSubstr2() {
		return ebspSubstr2;
	}

	/**
	 * Set ebspSubstr2
	 */
	public void setEbspSubstr2(String ebspSubstr2) {
		this.ebspSubstr2 = ebspSubstr2;
		addValidField("ebspSubstr2");
	}

	/**
	 * Get ebspSubstr3
	 */
	@Column(name = "EBSP_SUBSTR3")
	public String getEbspSubstr3() {
		return ebspSubstr3;
	}

	/**
	 * Set ebspSubstr3
	 */
	public void setEbspSubstr3(String ebspSubstr3) {
		this.ebspSubstr3 = ebspSubstr3;
		addValidField("ebspSubstr3");
	}

	/**
	 * Get ebspSubstr4
	 */
	@Column(name = "EBSP_SUBSTR4")
	public String getEbspSubstr4() {
		return ebspSubstr4;
	}

	/**
	 * Set ebspSubstr4
	 */
	public void setEbspSubstr4(String ebspSubstr4) {
		this.ebspSubstr4 = ebspSubstr4;
		addValidField("ebspSubstr4");
	}

	/**
	 * Get ebspSubstr5
	 */
	@Column(name = "EBSP_SUBSTR5")
	public String getEbspSubstr5() {
		return ebspSubstr5;
	}

	/**
	 * Set ebspSubstr5
	 */
	public void setEbspSubstr5(String ebspSubstr5) {
		this.ebspSubstr5 = ebspSubstr5;
		addValidField("ebspSubstr5");
	}

	/**
	 * Get ebspSubstr6
	 */
	@Column(name = "EBSP_SUBSTR6")
	public String getEbspSubstr6() {
		return ebspSubstr6;
	}

	/**
	 * Set ebspSubstr6
	 */
	public void setEbspSubstr6(String ebspSubstr6) {
		this.ebspSubstr6 = ebspSubstr6;
		addValidField("ebspSubstr6");
	}

	/**
	 * Get ebspSubstr7
	 */
	@Column(name = "EBSP_SUBSTR7")
	public String getEbspSubstr7() {
		return ebspSubstr7;
	}

	/**
	 * Set ebspSubstr7
	 */
	public void setEbspSubstr7(String ebspSubstr7) {
		this.ebspSubstr7 = ebspSubstr7;
		addValidField("ebspSubstr7");
	}

	/**
	 * Get ebspSubstr8
	 */
	@Column(name = "EBSP_SUBSTR8")
	public String getEbspSubstr8() {
		return ebspSubstr8;
	}

	/**
	 * Set ebspSubstr8
	 */
	public void setEbspSubstr8(String ebspSubstr8) {
		this.ebspSubstr8 = ebspSubstr8;
		addValidField("ebspSubstr8");
	}

	/**
	 * Get ebspSubdate1
	 */
	@Column(name = "EBSP_SUBDATE1")
	public Date getEbspSubdate1() {
		return ebspSubdate1;
	}

	/**
	 * Set ebspSubdate1
	 */
	public void setEbspSubdate1(Date ebspSubdate1) {
		this.ebspSubdate1 = ebspSubdate1;
		addValidField("ebspSubdate1");
	}

	/**
	 * Get ebspSubdate2
	 */
	@Column(name = "EBSP_SUBDATE2")
	public Date getEbspSubdate2() {
		return ebspSubdate2;
	}

	/**
	 * Set ebspSubdate2
	 */
	public void setEbspSubdate2(Date ebspSubdate2) {
		this.ebspSubdate2 = ebspSubdate2;
		addValidField("ebspSubdate2");
	}

	/**
	 * Get ebspSubdate3
	 */
	@Column(name = "EBSP_SUBDATE3")
	public Date getEbspSubdate3() {
		return ebspSubdate3;
	}

	/**
	 * Set ebspSubdate3
	 */
	public void setEbspSubdate3(Date ebspSubdate3) {
		this.ebspSubdate3 = ebspSubdate3;
		addValidField("ebspSubdate3");
	}

	/**
	 * Get ebspSubdate4
	 */
	@Column(name = "EBSP_SUBDATE4")
	public Date getEbspSubdate4() {
		return ebspSubdate4;
	}

	/**
	 * Set ebspSubdate4
	 */
	public void setEbspSubdate4(Date ebspSubdate4) {
		this.ebspSubdate4 = ebspSubdate4;
		addValidField("ebspSubdate4");
	}

	/**
	 * Get ebspSubnum1
	 */
	@Column(name = "EBSP_SUBNUM1")
	public Long getEbspSubnum1() {
		return ebspSubnum1;
	}

	/**
	 * Set ebspSubnum1
	 */
	public void setEbspSubnum1(Long ebspSubnum1) {
		this.ebspSubnum1 = ebspSubnum1;
		addValidField("ebspSubnum1");
	}

	/**
	 * Get ebspSubnum2
	 */
	@Column(name = "EBSP_SUBNUM2")
	public Long getEbspSubnum2() {
		return ebspSubnum2;
	}

	/**
	 * Set ebspSubnum2
	 */
	public void setEbspSubnum2(Long ebspSubnum2) {
		this.ebspSubnum2 = ebspSubnum2;
		addValidField("ebspSubnum2");
	}

	/**
	 * Get ebspSubnum3
	 */
	@Column(name = "EBSP_SUBNUM3")
	public Long getEbspSubnum3() {
		return ebspSubnum3;
	}

	/**
	 * Set ebspSubnum3
	 */
	public void setEbspSubnum3(Long ebspSubnum3) {
		this.ebspSubnum3 = ebspSubnum3;
		addValidField("ebspSubnum3");
	}

	/**
	 * Get ebspSubnum4
	 */
	@Column(name = "EBSP_SUBNUM4")
	public Long getEbspSubnum4() {
		return ebspSubnum4;
	}

	/**
	 * Set ebspSubnum4
	 */
	public void setEbspSubnum4(Long ebspSubnum4) {
		this.ebspSubnum4 = ebspSubnum4;
		addValidField("ebspSubnum4");
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
	 * Get ebspEcmseccsId
	 */
	@Column(name = "EBSP_ECMSECCS_ID")
	public String getEbspEcmseccsId() {
		return ebspEcmseccsId;
	}

	/**
	 * Set ebspEcmseccsId
	 */
	public void setEbspEcmseccsId(String ebspEcmseccsId) {
		this.ebspEcmseccsId = ebspEcmseccsId;
		addValidField("ebspEcmseccsId");
	}

	/**
	 * Get ebspEbbuCode
	 */
	@Column(name = "EBSP_EBBU_CODE")
	public String getEbspEbbuCode() {
		return ebspEbbuCode;
	}

	/**
	 * Set ebspEbbuCode
	 */
	public void setEbspEbbuCode(String ebspEbbuCode) {
		this.ebspEbbuCode = ebspEbbuCode;
		addValidField("ebspEbbuCode");
	}

}
