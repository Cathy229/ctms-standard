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
 * Model class for EbCustomer
 */
@Entity
@Table(name = "EB_CUSTOMER")
public class EbCustomerModel extends BaseModel implements OperationLog {

	//ebcuId
	private Long ebcuId;
	//ebcuEscoId
	private Long ebcuEscoId;
	//ebcuEbpjId
	private Long ebcuEbpjId;
	//ebcuIsOwner
	private String ebcuIsOwner;
	//ebcuIsSupplier
	private String ebcuIsSupplier;
	//ebcuIsSubcontractor
	private String ebcuIsSubcontractor;
	//ebcuEbflId
	private Long ebcuEbflId;
	//ebcuQuickCode
	private String ebcuQuickCode;
	//ebcuCustomerNo
	private String ebcuCustomerNo;
	//ebcuIndustryType
	private String ebcuIndustryType;
	//ebcuPlatformNature
	private String ebcuPlatformNature;
	//ebcuNameCn
	private String ebcuNameCn;
	//ebcuShortName
	private String ebcuShortName;
	//ebcuNameEn
	private String ebcuNameEn;
	//ebcuTel
	private String ebcuTel;
	//ebcuFax
	private String ebcuFax;
	//ebcuUrl
	private String ebcuUrl;
	//ebcuCountry
	private Long ebcuCountry;
	//ebcuProvince
	private Long ebcuProvince;
	//ebcuCity
	private Long ebcuCity;
	//ebcuAddress
	private String ebcuAddress;
	//ebcuFinanceCode
	private String ebcuFinanceCode;
	//ebcuTaxRegistNo
	private String ebcuTaxRegistNo;
	//ebcuBusinessNo
	private String ebcuBusinessNo;
	//ebcuCustomerStatus
	private String ebcuCustomerStatus;
	//ebcuRegistrationDate
	private Date ebcuRegistrationDate;
	//ebcuMaxGuaranteeAmount
	private Long ebcuMaxGuaranteeAmount;
	//ebcuMainBusiness
	private String ebcuMainBusiness;
	//ebcuCdhCode
	private String ebcuCdhCode;
	//ebcuCdhStatus
	private String ebcuCdhStatus;
	//ebcuRemark
	private String ebcuRemark;
	//ebcuSubstr1
	private String ebcuSubstr1;
	//ebcuSubstr2
	private String ebcuSubstr2;
	//ebcuSubstr3
	private String ebcuSubstr3;
	//ebcuSubstr4
	private String ebcuSubstr4;
	//ebcuSubstr5
	private String ebcuSubstr5;
	//ebcuSubstr6
	private String ebcuSubstr6;
	//ebcuSubstr7
	private String ebcuSubstr7;
	//ebcuSubstr8
	private String ebcuSubstr8;
	//ebcuSubdate1
	private Date ebcuSubdate1;
	//ebcuSubdate2
	private Date ebcuSubdate2;
	//ebcuSubdate3
	private Date ebcuSubdate3;
	//ebcuSubdate4
	private Date ebcuSubdate4;
	//ebcuSubnum1
	private Long ebcuSubnum1;
	//ebcuSubnum2
	private Long ebcuSubnum2;
	//ebcuSubnum3
	private Long ebcuSubnum3;
	//ebcuSubnum4
	private Long ebcuSubnum4;
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
	//ebcuHdFilename
	private String ebcuHdFilename;
	//ebcuHdBatchnumber
	private String ebcuHdBatchnumber;
	//ebcuHdSymbol
	private Long ebcuHdSymbol;
	//ebcuHdBeginprocessingtime
	private Date ebcuHdBeginprocessingtime;
	//ebcuHdLastmodifiedtime
	private Date ebcuHdLastmodifiedtime;
	//ebcuHdInformation
	private String ebcuHdInformation;
	//ebcuUploadUserId
	private Long ebcuUploadUserId;
	//ebcuUploadUser
	private String ebcuUploadUser;
	//ebcuUploadTime
	private Date ebcuUploadTime;
	//ebcuTaxrate
	private Long ebcuTaxrate;
	//ebcuEcmseccuId
	private String ebcuEcmseccuId;
	//ebcuEbbuCode
	private String ebcuEbbuCode;
	//ebcuEcmseccmId
	private String ebcuEcmseccmId;
	//ebcuRetoEscoId
	private Long ebcuRetoEscoId;
	//ebcuRetoEscoCompanyNo
	private String ebcuRetoEscoCompanyNo;
	//ebcuRetoEscoCompanyNameCn
	private String ebcuRetoEscoCompanyNameCn;
	//ebcuRetoEsdeId
	private Long ebcuRetoEsdeId;
	//ebcuRetoEsdeDepartmentCode
	private String ebcuRetoEsdeDepartmentCode;
	//ebcuRetoEsdeDepartmentName
	private String ebcuRetoEsdeDepartmentName;
	//ebcuRetoType
	private Long ebcuRetoType;
	//ebcuCountryCode
	private String ebcuCountryCode;
	//ebcuProvinceCode
	private String ebcuProvinceCode;
	//ebcuCityCode
	private String ebcuCityCode;
	//ebcuCdhVendorNumber
	private String ebcuCdhVendorNumber;
	//ebcuOrgNo
	private String ebcuOrgNo;
	//ebcuCdhPartyNumber
	private String ebcuCdhPartyNumber;
	//ebcuBank
	private String ebcuBank;
	//ebcuAccount
	private String ebcuAccount;
	//ebcuSocietyCreditCode
	private String ebcuSocietyCreditCode;
	//ebcuHscode
	private String ebcuHscode;
	//ebcuPrincipalName
	private String ebcuPrincipalName;
	//ebcuRegisteredCapital
	private Long ebcuRegisteredCapital;

	/**
	 * Get ebcuId
	 */
	@Column(name = "EBCU_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbcuId() {
		return ebcuId;
	}

	/**
	 * Set ebcuId
	 */
	public void setEbcuId(Long ebcuId) {
		this.ebcuId = ebcuId;
		addValidField("ebcuId");
	}

	/**
	 * Get ebcuEscoId
	 */
	@Column(name = "EBCU_ESCO_ID")
	public Long getEbcuEscoId() {
		return ebcuEscoId;
	}

	/**
	 * Set ebcuEscoId
	 */
	public void setEbcuEscoId(Long ebcuEscoId) {
		this.ebcuEscoId = ebcuEscoId;
		addValidField("ebcuEscoId");
	}

	/**
	 * Get ebcuEbpjId
	 */
	@Column(name = "EBCU_EBPJ_ID")
	public Long getEbcuEbpjId() {
		return ebcuEbpjId;
	}

	/**
	 * Set ebcuEbpjId
	 */
	public void setEbcuEbpjId(Long ebcuEbpjId) {
		this.ebcuEbpjId = ebcuEbpjId;
		addValidField("ebcuEbpjId");
	}

	/**
	 * Get ebcuIsOwner
	 */
	@Column(name = "EBCU_IS_OWNER")
	public String getEbcuIsOwner() {
		return ebcuIsOwner;
	}

	/**
	 * Set ebcuIsOwner
	 */
	public void setEbcuIsOwner(String ebcuIsOwner) {
		this.ebcuIsOwner = ebcuIsOwner;
		addValidField("ebcuIsOwner");
	}

	/**
	 * Get ebcuIsSupplier
	 */
	@Column(name = "EBCU_IS_SUPPLIER")
	public String getEbcuIsSupplier() {
		return ebcuIsSupplier;
	}

	/**
	 * Set ebcuIsSupplier
	 */
	public void setEbcuIsSupplier(String ebcuIsSupplier) {
		this.ebcuIsSupplier = ebcuIsSupplier;
		addValidField("ebcuIsSupplier");
	}

	/**
	 * Get ebcuIsSubcontractor
	 */
	@Column(name = "EBCU_IS_SUBCONTRACTOR")
	public String getEbcuIsSubcontractor() {
		return ebcuIsSubcontractor;
	}

	/**
	 * Set ebcuIsSubcontractor
	 */
	public void setEbcuIsSubcontractor(String ebcuIsSubcontractor) {
		this.ebcuIsSubcontractor = ebcuIsSubcontractor;
		addValidField("ebcuIsSubcontractor");
	}

	/**
	 * Get ebcuEbflId
	 */
	@Column(name = "EBCU_EBFL_ID")
	public Long getEbcuEbflId() {
		return ebcuEbflId;
	}

	/**
	 * Set ebcuEbflId
	 */
	public void setEbcuEbflId(Long ebcuEbflId) {
		this.ebcuEbflId = ebcuEbflId;
		addValidField("ebcuEbflId");
	}

	/**
	 * Get ebcuQuickCode
	 */
	@Column(name = "EBCU_QUICK_CODE")
	public String getEbcuQuickCode() {
		return ebcuQuickCode;
	}

	/**
	 * Set ebcuQuickCode
	 */
	public void setEbcuQuickCode(String ebcuQuickCode) {
		this.ebcuQuickCode = ebcuQuickCode;
		addValidField("ebcuQuickCode");
	}

	/**
	 * Get ebcuCustomerNo
	 */
	@Column(name = "EBCU_CUSTOMER_NO")
	public String getEbcuCustomerNo() {
		return ebcuCustomerNo;
	}

	/**
	 * Set ebcuCustomerNo
	 */
	public void setEbcuCustomerNo(String ebcuCustomerNo) {
		this.ebcuCustomerNo = ebcuCustomerNo;
		addValidField("ebcuCustomerNo");
	}

	/**
	 * Get ebcuIndustryType
	 */
	@Column(name = "EBCU_INDUSTRY_TYPE")
	public String getEbcuIndustryType() {
		return ebcuIndustryType;
	}

	/**
	 * Set ebcuIndustryType
	 */
	public void setEbcuIndustryType(String ebcuIndustryType) {
		this.ebcuIndustryType = ebcuIndustryType;
		addValidField("ebcuIndustryType");
	}

	/**
	 * Get ebcuPlatformNature
	 */
	@Column(name = "EBCU_PLATFORM_NATURE")
	public String getEbcuPlatformNature() {
		return ebcuPlatformNature;
	}

	/**
	 * Set ebcuPlatformNature
	 */
	public void setEbcuPlatformNature(String ebcuPlatformNature) {
		this.ebcuPlatformNature = ebcuPlatformNature;
		addValidField("ebcuPlatformNature");
	}

	/**
	 * Get ebcuNameCn
	 */
	@Column(name = "EBCU_NAME_CN")
	public String getEbcuNameCn() {
		return ebcuNameCn;
	}

	/**
	 * Set ebcuNameCn
	 */
	public void setEbcuNameCn(String ebcuNameCn) {
		this.ebcuNameCn = ebcuNameCn;
		addValidField("ebcuNameCn");
	}

	/**
	 * Get ebcuShortName
	 */
	@Column(name = "EBCU_SHORT_NAME")
	public String getEbcuShortName() {
		return ebcuShortName;
	}

	/**
	 * Set ebcuShortName
	 */
	public void setEbcuShortName(String ebcuShortName) {
		this.ebcuShortName = ebcuShortName;
		addValidField("ebcuShortName");
	}

	/**
	 * Get ebcuNameEn
	 */
	@Column(name = "EBCU_NAME_EN")
	public String getEbcuNameEn() {
		return ebcuNameEn;
	}

	/**
	 * Set ebcuNameEn
	 */
	public void setEbcuNameEn(String ebcuNameEn) {
		this.ebcuNameEn = ebcuNameEn;
		addValidField("ebcuNameEn");
	}

	/**
	 * Get ebcuTel
	 */
	@Column(name = "EBCU_TEL")
	public String getEbcuTel() {
		return ebcuTel;
	}

	/**
	 * Set ebcuTel
	 */
	public void setEbcuTel(String ebcuTel) {
		this.ebcuTel = ebcuTel;
		addValidField("ebcuTel");
	}

	/**
	 * Get ebcuFax
	 */
	@Column(name = "EBCU_FAX")
	public String getEbcuFax() {
		return ebcuFax;
	}

	/**
	 * Set ebcuFax
	 */
	public void setEbcuFax(String ebcuFax) {
		this.ebcuFax = ebcuFax;
		addValidField("ebcuFax");
	}

	/**
	 * Get ebcuUrl
	 */
	@Column(name = "EBCU_URL")
	public String getEbcuUrl() {
		return ebcuUrl;
	}

	/**
	 * Set ebcuUrl
	 */
	public void setEbcuUrl(String ebcuUrl) {
		this.ebcuUrl = ebcuUrl;
		addValidField("ebcuUrl");
	}

	/**
	 * Get ebcuCountry
	 */
	@Column(name = "EBCU_COUNTRY")
	public Long getEbcuCountry() {
		return ebcuCountry;
	}

	/**
	 * Set ebcuCountry
	 */
	public void setEbcuCountry(Long ebcuCountry) {
		this.ebcuCountry = ebcuCountry;
		addValidField("ebcuCountry");
	}

	/**
	 * Get ebcuProvince
	 */
	@Column(name = "EBCU_PROVINCE")
	public Long getEbcuProvince() {
		return ebcuProvince;
	}

	/**
	 * Set ebcuProvince
	 */
	public void setEbcuProvince(Long ebcuProvince) {
		this.ebcuProvince = ebcuProvince;
		addValidField("ebcuProvince");
	}

	/**
	 * Get ebcuCity
	 */
	@Column(name = "EBCU_CITY")
	public Long getEbcuCity() {
		return ebcuCity;
	}

	/**
	 * Set ebcuCity
	 */
	public void setEbcuCity(Long ebcuCity) {
		this.ebcuCity = ebcuCity;
		addValidField("ebcuCity");
	}

	/**
	 * Get ebcuAddress
	 */
	@Column(name = "EBCU_ADDRESS")
	public String getEbcuAddress() {
		return ebcuAddress;
	}

	/**
	 * Set ebcuAddress
	 */
	public void setEbcuAddress(String ebcuAddress) {
		this.ebcuAddress = ebcuAddress;
		addValidField("ebcuAddress");
	}

	/**
	 * Get ebcuFinanceCode
	 */
	@Column(name = "EBCU_FINANCE_CODE")
	public String getEbcuFinanceCode() {
		return ebcuFinanceCode;
	}

	/**
	 * Set ebcuFinanceCode
	 */
	public void setEbcuFinanceCode(String ebcuFinanceCode) {
		this.ebcuFinanceCode = ebcuFinanceCode;
		addValidField("ebcuFinanceCode");
	}

	/**
	 * Get ebcuTaxRegistNo
	 */
	@Column(name = "EBCU_TAX_REGIST_NO")
	public String getEbcuTaxRegistNo() {
		return ebcuTaxRegistNo;
	}

	/**
	 * Set ebcuTaxRegistNo
	 */
	public void setEbcuTaxRegistNo(String ebcuTaxRegistNo) {
		this.ebcuTaxRegistNo = ebcuTaxRegistNo;
		addValidField("ebcuTaxRegistNo");
	}

	/**
	 * Get ebcuBusinessNo
	 */
	@Column(name = "EBCU_BUSINESS_NO")
	public String getEbcuBusinessNo() {
		return ebcuBusinessNo;
	}

	/**
	 * Set ebcuBusinessNo
	 */
	public void setEbcuBusinessNo(String ebcuBusinessNo) {
		this.ebcuBusinessNo = ebcuBusinessNo;
		addValidField("ebcuBusinessNo");
	}

	/**
	 * Get ebcuCustomerStatus
	 */
	@Column(name = "EBCU_CUSTOMER_STATUS")
	public String getEbcuCustomerStatus() {
		return ebcuCustomerStatus;
	}

	/**
	 * Set ebcuCustomerStatus
	 */
	public void setEbcuCustomerStatus(String ebcuCustomerStatus) {
		this.ebcuCustomerStatus = ebcuCustomerStatus;
		addValidField("ebcuCustomerStatus");
	}

	/**
	 * Get ebcuRegistrationDate
	 */
	@Column(name = "EBCU_REGISTRATION_DATE")
	public Date getEbcuRegistrationDate() {
		return ebcuRegistrationDate;
	}

	/**
	 * Set ebcuRegistrationDate
	 */
	public void setEbcuRegistrationDate(Date ebcuRegistrationDate) {
		this.ebcuRegistrationDate = ebcuRegistrationDate;
		addValidField("ebcuRegistrationDate");
	}

	/**
	 * Get ebcuMaxGuaranteeAmount
	 */
	@Column(name = "EBCU_MAX_GUARANTEE_AMOUNT")
	public Long getEbcuMaxGuaranteeAmount() {
		return ebcuMaxGuaranteeAmount;
	}

	/**
	 * Set ebcuMaxGuaranteeAmount
	 */
	public void setEbcuMaxGuaranteeAmount(Long ebcuMaxGuaranteeAmount) {
		this.ebcuMaxGuaranteeAmount = ebcuMaxGuaranteeAmount;
		addValidField("ebcuMaxGuaranteeAmount");
	}

	/**
	 * Get ebcuMainBusiness
	 */
	@Column(name = "EBCU_MAIN_BUSINESS")
	public String getEbcuMainBusiness() {
		return ebcuMainBusiness;
	}

	/**
	 * Set ebcuMainBusiness
	 */
	public void setEbcuMainBusiness(String ebcuMainBusiness) {
		this.ebcuMainBusiness = ebcuMainBusiness;
		addValidField("ebcuMainBusiness");
	}

	/**
	 * Get ebcuCdhCode
	 */
	@Column(name = "EBCU_CDH_CODE")
	public String getEbcuCdhCode() {
		return ebcuCdhCode;
	}

	/**
	 * Set ebcuCdhCode
	 */
	public void setEbcuCdhCode(String ebcuCdhCode) {
		this.ebcuCdhCode = ebcuCdhCode;
		addValidField("ebcuCdhCode");
	}

	/**
	 * Get ebcuCdhStatus
	 */
	@Column(name = "EBCU_CDH_STATUS")
	public String getEbcuCdhStatus() {
		return ebcuCdhStatus;
	}

	/**
	 * Set ebcuCdhStatus
	 */
	public void setEbcuCdhStatus(String ebcuCdhStatus) {
		this.ebcuCdhStatus = ebcuCdhStatus;
		addValidField("ebcuCdhStatus");
	}

	/**
	 * Get ebcuRemark
	 */
	@Column(name = "EBCU_REMARK")
	public String getEbcuRemark() {
		return ebcuRemark;
	}

	/**
	 * Set ebcuRemark
	 */
	public void setEbcuRemark(String ebcuRemark) {
		this.ebcuRemark = ebcuRemark;
		addValidField("ebcuRemark");
	}

	/**
	 * Get ebcuSubstr1
	 */
	@Column(name = "EBCU_SUBSTR1")
	public String getEbcuSubstr1() {
		return ebcuSubstr1;
	}

	/**
	 * Set ebcuSubstr1
	 */
	public void setEbcuSubstr1(String ebcuSubstr1) {
		this.ebcuSubstr1 = ebcuSubstr1;
		addValidField("ebcuSubstr1");
	}

	/**
	 * Get ebcuSubstr2
	 */
	@Column(name = "EBCU_SUBSTR2")
	public String getEbcuSubstr2() {
		return ebcuSubstr2;
	}

	/**
	 * Set ebcuSubstr2
	 */
	public void setEbcuSubstr2(String ebcuSubstr2) {
		this.ebcuSubstr2 = ebcuSubstr2;
		addValidField("ebcuSubstr2");
	}

	/**
	 * Get ebcuSubstr3
	 */
	@Column(name = "EBCU_SUBSTR3")
	public String getEbcuSubstr3() {
		return ebcuSubstr3;
	}

	/**
	 * Set ebcuSubstr3
	 */
	public void setEbcuSubstr3(String ebcuSubstr3) {
		this.ebcuSubstr3 = ebcuSubstr3;
		addValidField("ebcuSubstr3");
	}

	/**
	 * Get ebcuSubstr4
	 */
	@Column(name = "EBCU_SUBSTR4")
	public String getEbcuSubstr4() {
		return ebcuSubstr4;
	}

	/**
	 * Set ebcuSubstr4
	 */
	public void setEbcuSubstr4(String ebcuSubstr4) {
		this.ebcuSubstr4 = ebcuSubstr4;
		addValidField("ebcuSubstr4");
	}

	/**
	 * Get ebcuSubstr5
	 */
	@Column(name = "EBCU_SUBSTR5")
	public String getEbcuSubstr5() {
		return ebcuSubstr5;
	}

	/**
	 * Set ebcuSubstr5
	 */
	public void setEbcuSubstr5(String ebcuSubstr5) {
		this.ebcuSubstr5 = ebcuSubstr5;
		addValidField("ebcuSubstr5");
	}

	/**
	 * Get ebcuSubstr6
	 */
	@Column(name = "EBCU_SUBSTR6")
	public String getEbcuSubstr6() {
		return ebcuSubstr6;
	}

	/**
	 * Set ebcuSubstr6
	 */
	public void setEbcuSubstr6(String ebcuSubstr6) {
		this.ebcuSubstr6 = ebcuSubstr6;
		addValidField("ebcuSubstr6");
	}

	/**
	 * Get ebcuSubstr7
	 */
	@Column(name = "EBCU_SUBSTR7")
	public String getEbcuSubstr7() {
		return ebcuSubstr7;
	}

	/**
	 * Set ebcuSubstr7
	 */
	public void setEbcuSubstr7(String ebcuSubstr7) {
		this.ebcuSubstr7 = ebcuSubstr7;
		addValidField("ebcuSubstr7");
	}

	/**
	 * Get ebcuSubstr8
	 */
	@Column(name = "EBCU_SUBSTR8")
	public String getEbcuSubstr8() {
		return ebcuSubstr8;
	}

	/**
	 * Set ebcuSubstr8
	 */
	public void setEbcuSubstr8(String ebcuSubstr8) {
		this.ebcuSubstr8 = ebcuSubstr8;
		addValidField("ebcuSubstr8");
	}

	/**
	 * Get ebcuSubdate1
	 */
	@Column(name = "EBCU_SUBDATE1")
	public Date getEbcuSubdate1() {
		return ebcuSubdate1;
	}

	/**
	 * Set ebcuSubdate1
	 */
	public void setEbcuSubdate1(Date ebcuSubdate1) {
		this.ebcuSubdate1 = ebcuSubdate1;
		addValidField("ebcuSubdate1");
	}

	/**
	 * Get ebcuSubdate2
	 */
	@Column(name = "EBCU_SUBDATE2")
	public Date getEbcuSubdate2() {
		return ebcuSubdate2;
	}

	/**
	 * Set ebcuSubdate2
	 */
	public void setEbcuSubdate2(Date ebcuSubdate2) {
		this.ebcuSubdate2 = ebcuSubdate2;
		addValidField("ebcuSubdate2");
	}

	/**
	 * Get ebcuSubdate3
	 */
	@Column(name = "EBCU_SUBDATE3")
	public Date getEbcuSubdate3() {
		return ebcuSubdate3;
	}

	/**
	 * Set ebcuSubdate3
	 */
	public void setEbcuSubdate3(Date ebcuSubdate3) {
		this.ebcuSubdate3 = ebcuSubdate3;
		addValidField("ebcuSubdate3");
	}

	/**
	 * Get ebcuSubdate4
	 */
	@Column(name = "EBCU_SUBDATE4")
	public Date getEbcuSubdate4() {
		return ebcuSubdate4;
	}

	/**
	 * Set ebcuSubdate4
	 */
	public void setEbcuSubdate4(Date ebcuSubdate4) {
		this.ebcuSubdate4 = ebcuSubdate4;
		addValidField("ebcuSubdate4");
	}

	/**
	 * Get ebcuSubnum1
	 */
	@Column(name = "EBCU_SUBNUM1")
	public Long getEbcuSubnum1() {
		return ebcuSubnum1;
	}

	/**
	 * Set ebcuSubnum1
	 */
	public void setEbcuSubnum1(Long ebcuSubnum1) {
		this.ebcuSubnum1 = ebcuSubnum1;
		addValidField("ebcuSubnum1");
	}

	/**
	 * Get ebcuSubnum2
	 */
	@Column(name = "EBCU_SUBNUM2")
	public Long getEbcuSubnum2() {
		return ebcuSubnum2;
	}

	/**
	 * Set ebcuSubnum2
	 */
	public void setEbcuSubnum2(Long ebcuSubnum2) {
		this.ebcuSubnum2 = ebcuSubnum2;
		addValidField("ebcuSubnum2");
	}

	/**
	 * Get ebcuSubnum3
	 */
	@Column(name = "EBCU_SUBNUM3")
	public Long getEbcuSubnum3() {
		return ebcuSubnum3;
	}

	/**
	 * Set ebcuSubnum3
	 */
	public void setEbcuSubnum3(Long ebcuSubnum3) {
		this.ebcuSubnum3 = ebcuSubnum3;
		addValidField("ebcuSubnum3");
	}

	/**
	 * Get ebcuSubnum4
	 */
	@Column(name = "EBCU_SUBNUM4")
	public Long getEbcuSubnum4() {
		return ebcuSubnum4;
	}

	/**
	 * Set ebcuSubnum4
	 */
	public void setEbcuSubnum4(Long ebcuSubnum4) {
		this.ebcuSubnum4 = ebcuSubnum4;
		addValidField("ebcuSubnum4");
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
	 * Get ebcuHdFilename
	 */
	@Column(name = "EBCU_HD_FILENAME")
	public String getEbcuHdFilename() {
		return ebcuHdFilename;
	}

	/**
	 * Set ebcuHdFilename
	 */
	public void setEbcuHdFilename(String ebcuHdFilename) {
		this.ebcuHdFilename = ebcuHdFilename;
		addValidField("ebcuHdFilename");
	}

	/**
	 * Get ebcuHdBatchnumber
	 */
	@Column(name = "EBCU_HD_BATCHNUMBER")
	public String getEbcuHdBatchnumber() {
		return ebcuHdBatchnumber;
	}

	/**
	 * Set ebcuHdBatchnumber
	 */
	public void setEbcuHdBatchnumber(String ebcuHdBatchnumber) {
		this.ebcuHdBatchnumber = ebcuHdBatchnumber;
		addValidField("ebcuHdBatchnumber");
	}

	/**
	 * Get ebcuHdSymbol
	 */
	@Column(name = "EBCU_HD_SYMBOL")
	public Long getEbcuHdSymbol() {
		return ebcuHdSymbol;
	}

	/**
	 * Set ebcuHdSymbol
	 */
	public void setEbcuHdSymbol(Long ebcuHdSymbol) {
		this.ebcuHdSymbol = ebcuHdSymbol;
		addValidField("ebcuHdSymbol");
	}

	/**
	 * Get ebcuHdBeginprocessingtime
	 */
	@Column(name = "EBCU_HD_BEGINPROCESSINGTIME")
	public Date getEbcuHdBeginprocessingtime() {
		return ebcuHdBeginprocessingtime;
	}

	/**
	 * Set ebcuHdBeginprocessingtime
	 */
	public void setEbcuHdBeginprocessingtime(Date ebcuHdBeginprocessingtime) {
		this.ebcuHdBeginprocessingtime = ebcuHdBeginprocessingtime;
		addValidField("ebcuHdBeginprocessingtime");
	}

	/**
	 * Get ebcuHdLastmodifiedtime
	 */
	@Column(name = "EBCU_HD_LASTMODIFIEDTIME")
	public Date getEbcuHdLastmodifiedtime() {
		return ebcuHdLastmodifiedtime;
	}

	/**
	 * Set ebcuHdLastmodifiedtime
	 */
	public void setEbcuHdLastmodifiedtime(Date ebcuHdLastmodifiedtime) {
		this.ebcuHdLastmodifiedtime = ebcuHdLastmodifiedtime;
		addValidField("ebcuHdLastmodifiedtime");
	}

	/**
	 * Get ebcuHdInformation
	 */
	@Column(name = "EBCU_HD_INFORMATION")
	public String getEbcuHdInformation() {
		return ebcuHdInformation;
	}

	/**
	 * Set ebcuHdInformation
	 */
	public void setEbcuHdInformation(String ebcuHdInformation) {
		this.ebcuHdInformation = ebcuHdInformation;
		addValidField("ebcuHdInformation");
	}

	/**
	 * Get ebcuUploadUserId
	 */
	@Column(name = "EBCU_UPLOAD_USER_ID")
	public Long getEbcuUploadUserId() {
		return ebcuUploadUserId;
	}

	/**
	 * Set ebcuUploadUserId
	 */
	public void setEbcuUploadUserId(Long ebcuUploadUserId) {
		this.ebcuUploadUserId = ebcuUploadUserId;
		addValidField("ebcuUploadUserId");
	}

	/**
	 * Get ebcuUploadUser
	 */
	@Column(name = "EBCU_UPLOAD_USER")
	public String getEbcuUploadUser() {
		return ebcuUploadUser;
	}

	/**
	 * Set ebcuUploadUser
	 */
	public void setEbcuUploadUser(String ebcuUploadUser) {
		this.ebcuUploadUser = ebcuUploadUser;
		addValidField("ebcuUploadUser");
	}

	/**
	 * Get ebcuUploadTime
	 */
	@Column(name = "EBCU_UPLOAD_TIME")
	public Date getEbcuUploadTime() {
		return ebcuUploadTime;
	}

	/**
	 * Set ebcuUploadTime
	 */
	public void setEbcuUploadTime(Date ebcuUploadTime) {
		this.ebcuUploadTime = ebcuUploadTime;
		addValidField("ebcuUploadTime");
	}

	/**
	 * Get ebcuTaxrate
	 */
	@Column(name = "EBCU_TAXRATE")
	public Long getEbcuTaxrate() {
		return ebcuTaxrate;
	}

	/**
	 * Set ebcuTaxrate
	 */
	public void setEbcuTaxrate(Long ebcuTaxrate) {
		this.ebcuTaxrate = ebcuTaxrate;
		addValidField("ebcuTaxrate");
	}

	/**
	 * Get ebcuEcmseccuId
	 */
	@Column(name = "EBCU_ECMSECCU_ID")
	public String getEbcuEcmseccuId() {
		return ebcuEcmseccuId;
	}

	/**
	 * Set ebcuEcmseccuId
	 */
	public void setEbcuEcmseccuId(String ebcuEcmseccuId) {
		this.ebcuEcmseccuId = ebcuEcmseccuId;
		addValidField("ebcuEcmseccuId");
	}

	/**
	 * Get ebcuEbbuCode
	 */
	@Column(name = "EBCU_EBBU_CODE")
	public String getEbcuEbbuCode() {
		return ebcuEbbuCode;
	}

	/**
	 * Set ebcuEbbuCode
	 */
	public void setEbcuEbbuCode(String ebcuEbbuCode) {
		this.ebcuEbbuCode = ebcuEbbuCode;
		addValidField("ebcuEbbuCode");
	}

	/**
	 * Get ebcuEcmseccmId
	 */
	@Column(name = "EBCU_ECMSECCM_ID")
	public String getEbcuEcmseccmId() {
		return ebcuEcmseccmId;
	}

	/**
	 * Set ebcuEcmseccmId
	 */
	public void setEbcuEcmseccmId(String ebcuEcmseccmId) {
		this.ebcuEcmseccmId = ebcuEcmseccmId;
		addValidField("ebcuEcmseccmId");
	}

	/**
	 * Get ebcuRetoEscoId
	 */
	@Column(name = "EBCU_RETO_ESCO_ID")
	public Long getEbcuRetoEscoId() {
		return ebcuRetoEscoId;
	}

	/**
	 * Set ebcuRetoEscoId
	 */
	public void setEbcuRetoEscoId(Long ebcuRetoEscoId) {
		this.ebcuRetoEscoId = ebcuRetoEscoId;
		addValidField("ebcuRetoEscoId");
	}

	/**
	 * Get ebcuRetoEscoCompanyNo
	 */
	@Column(name = "EBCU_RETO_ESCO_COMPANY_NO")
	public String getEbcuRetoEscoCompanyNo() {
		return ebcuRetoEscoCompanyNo;
	}

	/**
	 * Set ebcuRetoEscoCompanyNo
	 */
	public void setEbcuRetoEscoCompanyNo(String ebcuRetoEscoCompanyNo) {
		this.ebcuRetoEscoCompanyNo = ebcuRetoEscoCompanyNo;
		addValidField("ebcuRetoEscoCompanyNo");
	}

	/**
	 * Get ebcuRetoEscoCompanyNameCn
	 */
	@Column(name = "EBCU_RETO_ESCO_COMPANY_NAME_CN")
	public String getEbcuRetoEscoCompanyNameCn() {
		return ebcuRetoEscoCompanyNameCn;
	}

	/**
	 * Set ebcuRetoEscoCompanyNameCn
	 */
	public void setEbcuRetoEscoCompanyNameCn(String ebcuRetoEscoCompanyNameCn) {
		this.ebcuRetoEscoCompanyNameCn = ebcuRetoEscoCompanyNameCn;
		addValidField("ebcuRetoEscoCompanyNameCn");
	}

	/**
	 * Get ebcuRetoEsdeId
	 */
	@Column(name = "EBCU_RETO_ESDE_ID")
	public Long getEbcuRetoEsdeId() {
		return ebcuRetoEsdeId;
	}

	/**
	 * Set ebcuRetoEsdeId
	 */
	public void setEbcuRetoEsdeId(Long ebcuRetoEsdeId) {
		this.ebcuRetoEsdeId = ebcuRetoEsdeId;
		addValidField("ebcuRetoEsdeId");
	}

	/**
	 * Get ebcuRetoEsdeDepartmentCode
	 */
	@Column(name = "EBCU_RETO_ESDE_DEPARTMENT_CODE")
	public String getEbcuRetoEsdeDepartmentCode() {
		return ebcuRetoEsdeDepartmentCode;
	}

	/**
	 * Set ebcuRetoEsdeDepartmentCode
	 */
	public void setEbcuRetoEsdeDepartmentCode(String ebcuRetoEsdeDepartmentCode) {
		this.ebcuRetoEsdeDepartmentCode = ebcuRetoEsdeDepartmentCode;
		addValidField("ebcuRetoEsdeDepartmentCode");
	}

	/**
	 * Get ebcuRetoEsdeDepartmentName
	 */
	@Column(name = "EBCU_RETO_ESDE_DEPARTMENT_NAME")
	public String getEbcuRetoEsdeDepartmentName() {
		return ebcuRetoEsdeDepartmentName;
	}

	/**
	 * Set ebcuRetoEsdeDepartmentName
	 */
	public void setEbcuRetoEsdeDepartmentName(String ebcuRetoEsdeDepartmentName) {
		this.ebcuRetoEsdeDepartmentName = ebcuRetoEsdeDepartmentName;
		addValidField("ebcuRetoEsdeDepartmentName");
	}

	/**
	 * Get ebcuRetoType
	 */
	@Column(name = "EBCU_RETO_TYPE")
	public Long getEbcuRetoType() {
		return ebcuRetoType;
	}

	/**
	 * Set ebcuRetoType
	 */
	public void setEbcuRetoType(Long ebcuRetoType) {
		this.ebcuRetoType = ebcuRetoType;
		addValidField("ebcuRetoType");
	}

	/**
	 * Get ebcuCountryCode
	 */
	@Column(name = "EBCU_COUNTRY_CODE")
	public String getEbcuCountryCode() {
		return ebcuCountryCode;
	}

	/**
	 * Set ebcuCountryCode
	 */
	public void setEbcuCountryCode(String ebcuCountryCode) {
		this.ebcuCountryCode = ebcuCountryCode;
		addValidField("ebcuCountryCode");
	}

	/**
	 * Get ebcuProvinceCode
	 */
	@Column(name = "EBCU_PROVINCE_CODE")
	public String getEbcuProvinceCode() {
		return ebcuProvinceCode;
	}

	/**
	 * Set ebcuProvinceCode
	 */
	public void setEbcuProvinceCode(String ebcuProvinceCode) {
		this.ebcuProvinceCode = ebcuProvinceCode;
		addValidField("ebcuProvinceCode");
	}

	/**
	 * Get ebcuCityCode
	 */
	@Column(name = "EBCU_CITY_CODE")
	public String getEbcuCityCode() {
		return ebcuCityCode;
	}

	/**
	 * Set ebcuCityCode
	 */
	public void setEbcuCityCode(String ebcuCityCode) {
		this.ebcuCityCode = ebcuCityCode;
		addValidField("ebcuCityCode");
	}

	/**
	 * Get ebcuCdhVendorNumber
	 */
	@Column(name = "EBCU_CDH_VENDOR_NUMBER")
	public String getEbcuCdhVendorNumber() {
		return ebcuCdhVendorNumber;
	}

	/**
	 * Set ebcuCdhVendorNumber
	 */
	public void setEbcuCdhVendorNumber(String ebcuCdhVendorNumber) {
		this.ebcuCdhVendorNumber = ebcuCdhVendorNumber;
		addValidField("ebcuCdhVendorNumber");
	}

	/**
	 * Get ebcuOrgNo
	 */
	@Column(name = "EBCU_ORG_NO")
	public String getEbcuOrgNo() {
		return ebcuOrgNo;
	}

	/**
	 * Set ebcuOrgNo
	 */
	public void setEbcuOrgNo(String ebcuOrgNo) {
		this.ebcuOrgNo = ebcuOrgNo;
		addValidField("ebcuOrgNo");
	}

	/**
	 * Get ebcuCdhPartyNumber
	 */
	@Column(name = "EBCU_CDH_PARTY_NUMBER")
	public String getEbcuCdhPartyNumber() {
		return ebcuCdhPartyNumber;
	}

	/**
	 * Set ebcuCdhPartyNumber
	 */
	public void setEbcuCdhPartyNumber(String ebcuCdhPartyNumber) {
		this.ebcuCdhPartyNumber = ebcuCdhPartyNumber;
		addValidField("ebcuCdhPartyNumber");
	}

	/**
	 * Get ebcuBank
	 */
	@Column(name = "EBCU_BANK")
	public String getEbcuBank() {
		return ebcuBank;
	}

	/**
	 * Set ebcuBank
	 */
	public void setEbcuBank(String ebcuBank) {
		this.ebcuBank = ebcuBank;
		addValidField("ebcuBank");
	}

	/**
	 * Get ebcuAccount
	 */
	@Column(name = "EBCU_ACCOUNT")
	public String getEbcuAccount() {
		return ebcuAccount;
	}

	/**
	 * Set ebcuAccount
	 */
	public void setEbcuAccount(String ebcuAccount) {
		this.ebcuAccount = ebcuAccount;
		addValidField("ebcuAccount");
	}

	/**
	 * Get ebcuSocietyCreditCode
	 */
	@Column(name = "EBCU_SOCIETY_CREDIT_CODE")
	public String getEbcuSocietyCreditCode() {
		return ebcuSocietyCreditCode;
	}

	/**
	 * Set ebcuSocietyCreditCode
	 */
	public void setEbcuSocietyCreditCode(String ebcuSocietyCreditCode) {
		this.ebcuSocietyCreditCode = ebcuSocietyCreditCode;
		addValidField("ebcuSocietyCreditCode");
	}

	/**
	 * Get ebcuHscode
	 */
	@Column(name = "EBCU_HSCODE")
	public String getEbcuHscode() {
		return ebcuHscode;
	}

	/**
	 * Set ebcuHscode
	 */
	public void setEbcuHscode(String ebcuHscode) {
		this.ebcuHscode = ebcuHscode;
		addValidField("ebcuHscode");
	}

	/**
	 * Get ebcuPrincipalName
	 */
	@Column(name = "EBCU_PRINCIPAL_NAME")
	public String getEbcuPrincipalName() {
		return ebcuPrincipalName;
	}

	/**
	 * Set ebcuPrincipalName
	 */
	public void setEbcuPrincipalName(String ebcuPrincipalName) {
		this.ebcuPrincipalName = ebcuPrincipalName;
		addValidField("ebcuPrincipalName");
	}

	/**
	 * Get ebcuRegisteredCapital
	 */
	@Column(name = "EBCU_REGISTERED_CAPITAL")
	public Long getEbcuRegisteredCapital() {
		return ebcuRegisteredCapital;
	}

	/**
	 * Set ebcuRegisteredCapital
	 */
	public void setEbcuRegisteredCapital(Long ebcuRegisteredCapital) {
		this.ebcuRegisteredCapital = ebcuRegisteredCapital;
		addValidField("ebcuRegisteredCapital");
	}

}
