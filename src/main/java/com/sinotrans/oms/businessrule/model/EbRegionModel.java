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
 * Model class for EbRegion
 */
@Entity
@Table(name = "EB_REGION")
public class EbRegionModel extends BaseModel implements OperationLog {

	//ebrgId
	private Long ebrgId;
	//ebrgEscoId
	private Long ebrgEscoId;
	//ebrgEbplCountryId
	private Long ebrgEbplCountryId;
	//ebrgEbplProvinceId
	private Long ebrgEbplProvinceId;
	//ebrgEbplCityId
	private Long ebrgEbplCityId;
	//ebrgEbplDistrictId
	private Long ebrgEbplDistrictId;
	//ebrgQuickCode
	private String ebrgQuickCode;
	//ebrgNo
	private String ebrgNo;
	//ebrgNameCn
	private String ebrgNameCn;
	//ebrgNameEn
	private String ebrgNameEn;
	//ebrgAddress
	private String ebrgAddress;
	//ebrgFlow
	private String ebrgFlow;
	//ebrgPostCode
	private String ebrgPostCode;
	//ebrgStatus
	private String ebrgStatus;
	//ebrgStatGroup
	private String ebrgStatGroup;
	//ebrgSubstr1
	private String ebrgSubstr1;
	//ebrgSubstr2
	private String ebrgSubstr2;
	//ebrgSubstr3
	private String ebrgSubstr3;
	//ebrgSubstr4
	private String ebrgSubstr4;
	//ebrgSubstr5
	private String ebrgSubstr5;
	//ebrgSubstr6
	private String ebrgSubstr6;
	//ebrgSubstr7
	private String ebrgSubstr7;
	//ebrgSubstr8
	private String ebrgSubstr8;
	//ebrgSubdate1
	private Date ebrgSubdate1;
	//ebrgSubdate2
	private Date ebrgSubdate2;
	//ebrgSubdate3
	private Date ebrgSubdate3;
	//ebrgSubdate4
	private Date ebrgSubdate4;
	//ebrgSubnum1
	private Long ebrgSubnum1;
	//ebrgSubnum2
	private Long ebrgSubnum2;
	//ebrgSubnum3
	private Long ebrgSubnum3;
	//ebrgSubnum4
	private Long ebrgSubnum4;
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
	 * Get ebrgId
	 */
	@Column(name = "EBRG_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbrgId() {
		return ebrgId;
	}

	/**
	 * Set ebrgId
	 */
	public void setEbrgId(Long ebrgId) {
		this.ebrgId = ebrgId;
		addValidField("ebrgId");
	}

	/**
	 * Get ebrgEscoId
	 */
	@Column(name = "EBRG_ESCO_ID")
	public Long getEbrgEscoId() {
		return ebrgEscoId;
	}

	/**
	 * Set ebrgEscoId
	 */
	public void setEbrgEscoId(Long ebrgEscoId) {
		this.ebrgEscoId = ebrgEscoId;
		addValidField("ebrgEscoId");
	}

	/**
	 * Get ebrgEbplCountryId
	 */
	@Column(name = "EBRG_EBPL_COUNTRY_ID")
	public Long getEbrgEbplCountryId() {
		return ebrgEbplCountryId;
	}

	/**
	 * Set ebrgEbplCountryId
	 */
	public void setEbrgEbplCountryId(Long ebrgEbplCountryId) {
		this.ebrgEbplCountryId = ebrgEbplCountryId;
		addValidField("ebrgEbplCountryId");
	}

	/**
	 * Get ebrgEbplProvinceId
	 */
	@Column(name = "EBRG_EBPL_PROVINCE_ID")
	public Long getEbrgEbplProvinceId() {
		return ebrgEbplProvinceId;
	}

	/**
	 * Set ebrgEbplProvinceId
	 */
	public void setEbrgEbplProvinceId(Long ebrgEbplProvinceId) {
		this.ebrgEbplProvinceId = ebrgEbplProvinceId;
		addValidField("ebrgEbplProvinceId");
	}

	/**
	 * Get ebrgEbplCityId
	 */
	@Column(name = "EBRG_EBPL_CITY_ID")
	public Long getEbrgEbplCityId() {
		return ebrgEbplCityId;
	}

	/**
	 * Set ebrgEbplCityId
	 */
	public void setEbrgEbplCityId(Long ebrgEbplCityId) {
		this.ebrgEbplCityId = ebrgEbplCityId;
		addValidField("ebrgEbplCityId");
	}

	/**
	 * Get ebrgEbplDistrictId
	 */
	@Column(name = "EBRG_EBPL_DISTRICT_ID")
	public Long getEbrgEbplDistrictId() {
		return ebrgEbplDistrictId;
	}

	/**
	 * Set ebrgEbplDistrictId
	 */
	public void setEbrgEbplDistrictId(Long ebrgEbplDistrictId) {
		this.ebrgEbplDistrictId = ebrgEbplDistrictId;
		addValidField("ebrgEbplDistrictId");
	}

	/**
	 * Get ebrgQuickCode
	 */
	@Column(name = "EBRG_QUICK_CODE")
	public String getEbrgQuickCode() {
		return ebrgQuickCode;
	}

	/**
	 * Set ebrgQuickCode
	 */
	public void setEbrgQuickCode(String ebrgQuickCode) {
		this.ebrgQuickCode = ebrgQuickCode;
		addValidField("ebrgQuickCode");
	}

	/**
	 * Get ebrgNo
	 */
	@Column(name = "EBRG_NO")
	public String getEbrgNo() {
		return ebrgNo;
	}

	/**
	 * Set ebrgNo
	 */
	public void setEbrgNo(String ebrgNo) {
		this.ebrgNo = ebrgNo;
		addValidField("ebrgNo");
	}

	/**
	 * Get ebrgNameCn
	 */
	@Column(name = "EBRG_NAME_CN")
	public String getEbrgNameCn() {
		return ebrgNameCn;
	}

	/**
	 * Set ebrgNameCn
	 */
	public void setEbrgNameCn(String ebrgNameCn) {
		this.ebrgNameCn = ebrgNameCn;
		addValidField("ebrgNameCn");
	}

	/**
	 * Get ebrgNameEn
	 */
	@Column(name = "EBRG_NAME_EN")
	public String getEbrgNameEn() {
		return ebrgNameEn;
	}

	/**
	 * Set ebrgNameEn
	 */
	public void setEbrgNameEn(String ebrgNameEn) {
		this.ebrgNameEn = ebrgNameEn;
		addValidField("ebrgNameEn");
	}

	/**
	 * Get ebrgAddress
	 */
	@Column(name = "EBRG_ADDRESS")
	public String getEbrgAddress() {
		return ebrgAddress;
	}

	/**
	 * Set ebrgAddress
	 */
	public void setEbrgAddress(String ebrgAddress) {
		this.ebrgAddress = ebrgAddress;
		addValidField("ebrgAddress");
	}

	/**
	 * Get ebrgFlow
	 */
	@Column(name = "EBRG_FLOW")
	public String getEbrgFlow() {
		return ebrgFlow;
	}

	/**
	 * Set ebrgFlow
	 */
	public void setEbrgFlow(String ebrgFlow) {
		this.ebrgFlow = ebrgFlow;
		addValidField("ebrgFlow");
	}

	/**
	 * Get ebrgPostCode
	 */
	@Column(name = "EBRG_POST_CODE")
	public String getEbrgPostCode() {
		return ebrgPostCode;
	}

	/**
	 * Set ebrgPostCode
	 */
	public void setEbrgPostCode(String ebrgPostCode) {
		this.ebrgPostCode = ebrgPostCode;
		addValidField("ebrgPostCode");
	}

	/**
	 * Get ebrgStatus
	 */
	@Column(name = "EBRG_STATUS")
	public String getEbrgStatus() {
		return ebrgStatus;
	}

	/**
	 * Set ebrgStatus
	 */
	public void setEbrgStatus(String ebrgStatus) {
		this.ebrgStatus = ebrgStatus;
		addValidField("ebrgStatus");
	}

	/**
	 * Get ebrgStatGroup
	 */
	@Column(name = "EBRG_STAT_GROUP")
	public String getEbrgStatGroup() {
		return ebrgStatGroup;
	}

	/**
	 * Set ebrgStatGroup
	 */
	public void setEbrgStatGroup(String ebrgStatGroup) {
		this.ebrgStatGroup = ebrgStatGroup;
		addValidField("ebrgStatGroup");
	}

	/**
	 * Get ebrgSubstr1
	 */
	@Column(name = "EBRG_SUBSTR1")
	public String getEbrgSubstr1() {
		return ebrgSubstr1;
	}

	/**
	 * Set ebrgSubstr1
	 */
	public void setEbrgSubstr1(String ebrgSubstr1) {
		this.ebrgSubstr1 = ebrgSubstr1;
		addValidField("ebrgSubstr1");
	}

	/**
	 * Get ebrgSubstr2
	 */
	@Column(name = "EBRG_SUBSTR2")
	public String getEbrgSubstr2() {
		return ebrgSubstr2;
	}

	/**
	 * Set ebrgSubstr2
	 */
	public void setEbrgSubstr2(String ebrgSubstr2) {
		this.ebrgSubstr2 = ebrgSubstr2;
		addValidField("ebrgSubstr2");
	}

	/**
	 * Get ebrgSubstr3
	 */
	@Column(name = "EBRG_SUBSTR3")
	public String getEbrgSubstr3() {
		return ebrgSubstr3;
	}

	/**
	 * Set ebrgSubstr3
	 */
	public void setEbrgSubstr3(String ebrgSubstr3) {
		this.ebrgSubstr3 = ebrgSubstr3;
		addValidField("ebrgSubstr3");
	}

	/**
	 * Get ebrgSubstr4
	 */
	@Column(name = "EBRG_SUBSTR4")
	public String getEbrgSubstr4() {
		return ebrgSubstr4;
	}

	/**
	 * Set ebrgSubstr4
	 */
	public void setEbrgSubstr4(String ebrgSubstr4) {
		this.ebrgSubstr4 = ebrgSubstr4;
		addValidField("ebrgSubstr4");
	}

	/**
	 * Get ebrgSubstr5
	 */
	@Column(name = "EBRG_SUBSTR5")
	public String getEbrgSubstr5() {
		return ebrgSubstr5;
	}

	/**
	 * Set ebrgSubstr5
	 */
	public void setEbrgSubstr5(String ebrgSubstr5) {
		this.ebrgSubstr5 = ebrgSubstr5;
		addValidField("ebrgSubstr5");
	}

	/**
	 * Get ebrgSubstr6
	 */
	@Column(name = "EBRG_SUBSTR6")
	public String getEbrgSubstr6() {
		return ebrgSubstr6;
	}

	/**
	 * Set ebrgSubstr6
	 */
	public void setEbrgSubstr6(String ebrgSubstr6) {
		this.ebrgSubstr6 = ebrgSubstr6;
		addValidField("ebrgSubstr6");
	}

	/**
	 * Get ebrgSubstr7
	 */
	@Column(name = "EBRG_SUBSTR7")
	public String getEbrgSubstr7() {
		return ebrgSubstr7;
	}

	/**
	 * Set ebrgSubstr7
	 */
	public void setEbrgSubstr7(String ebrgSubstr7) {
		this.ebrgSubstr7 = ebrgSubstr7;
		addValidField("ebrgSubstr7");
	}

	/**
	 * Get ebrgSubstr8
	 */
	@Column(name = "EBRG_SUBSTR8")
	public String getEbrgSubstr8() {
		return ebrgSubstr8;
	}

	/**
	 * Set ebrgSubstr8
	 */
	public void setEbrgSubstr8(String ebrgSubstr8) {
		this.ebrgSubstr8 = ebrgSubstr8;
		addValidField("ebrgSubstr8");
	}

	/**
	 * Get ebrgSubdate1
	 */
	@Column(name = "EBRG_SUBDATE1")
	public Date getEbrgSubdate1() {
		return ebrgSubdate1;
	}

	/**
	 * Set ebrgSubdate1
	 */
	public void setEbrgSubdate1(Date ebrgSubdate1) {
		this.ebrgSubdate1 = ebrgSubdate1;
		addValidField("ebrgSubdate1");
	}

	/**
	 * Get ebrgSubdate2
	 */
	@Column(name = "EBRG_SUBDATE2")
	public Date getEbrgSubdate2() {
		return ebrgSubdate2;
	}

	/**
	 * Set ebrgSubdate2
	 */
	public void setEbrgSubdate2(Date ebrgSubdate2) {
		this.ebrgSubdate2 = ebrgSubdate2;
		addValidField("ebrgSubdate2");
	}

	/**
	 * Get ebrgSubdate3
	 */
	@Column(name = "EBRG_SUBDATE3")
	public Date getEbrgSubdate3() {
		return ebrgSubdate3;
	}

	/**
	 * Set ebrgSubdate3
	 */
	public void setEbrgSubdate3(Date ebrgSubdate3) {
		this.ebrgSubdate3 = ebrgSubdate3;
		addValidField("ebrgSubdate3");
	}

	/**
	 * Get ebrgSubdate4
	 */
	@Column(name = "EBRG_SUBDATE4")
	public Date getEbrgSubdate4() {
		return ebrgSubdate4;
	}

	/**
	 * Set ebrgSubdate4
	 */
	public void setEbrgSubdate4(Date ebrgSubdate4) {
		this.ebrgSubdate4 = ebrgSubdate4;
		addValidField("ebrgSubdate4");
	}

	/**
	 * Get ebrgSubnum1
	 */
	@Column(name = "EBRG_SUBNUM1")
	public Long getEbrgSubnum1() {
		return ebrgSubnum1;
	}

	/**
	 * Set ebrgSubnum1
	 */
	public void setEbrgSubnum1(Long ebrgSubnum1) {
		this.ebrgSubnum1 = ebrgSubnum1;
		addValidField("ebrgSubnum1");
	}

	/**
	 * Get ebrgSubnum2
	 */
	@Column(name = "EBRG_SUBNUM2")
	public Long getEbrgSubnum2() {
		return ebrgSubnum2;
	}

	/**
	 * Set ebrgSubnum2
	 */
	public void setEbrgSubnum2(Long ebrgSubnum2) {
		this.ebrgSubnum2 = ebrgSubnum2;
		addValidField("ebrgSubnum2");
	}

	/**
	 * Get ebrgSubnum3
	 */
	@Column(name = "EBRG_SUBNUM3")
	public Long getEbrgSubnum3() {
		return ebrgSubnum3;
	}

	/**
	 * Set ebrgSubnum3
	 */
	public void setEbrgSubnum3(Long ebrgSubnum3) {
		this.ebrgSubnum3 = ebrgSubnum3;
		addValidField("ebrgSubnum3");
	}

	/**
	 * Get ebrgSubnum4
	 */
	@Column(name = "EBRG_SUBNUM4")
	public Long getEbrgSubnum4() {
		return ebrgSubnum4;
	}

	/**
	 * Set ebrgSubnum4
	 */
	public void setEbrgSubnum4(Long ebrgSubnum4) {
		this.ebrgSubnum4 = ebrgSubnum4;
		addValidField("ebrgSubnum4");
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
