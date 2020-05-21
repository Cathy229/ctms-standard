package com.sinotrans.oms.system.model;

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
 * Model class for EsCompany
 */
@Entity
@Table(name = "ES_COMPANY")
public class EsCompanyModel extends BaseModel implements OperationLog {

	//escoId
	private Long escoId;
	//escoParentEscoId
	private Long escoParentEscoId;
	//escoEbplCityId
	private Long escoEbplCityId;
	//escoCompanyNo
	private String escoCompanyNo;
	//escoCompanyNameCn
	private String escoCompanyNameCn;
	//escoCompanyNameEn
	private String escoCompanyNameEn;
	//escoSendCode
	private String escoSendCode;
	//escoAddressCn
	private String escoAddressCn;
	//escoAddressEn
	private String escoAddressEn;
	//escoPostalcode
	private String escoPostalcode;
	//escoFax
	private String escoFax;
	//escoUrl
	private String escoUrl;
	//escoBusinessNo
	private String escoBusinessNo;
	//escoPhone
	private String escoPhone;
	//escoTaxNo
	private String escoTaxNo;
	//escoCurrency
	private String escoCurrency;
	//escoFinanceCode
	private String escoFinanceCode;
	//escoStatus
	private String escoStatus;
	//escoCdhCode
	private String escoCdhCode;
	//escoPath
	private String escoPath;
	//escoSubstr1
	private String escoSubstr1;
	//escoSubstr2
	private String escoSubstr2;
	//escoSubstr3
	private String escoSubstr3;
	//escoSubstr4
	private String escoSubstr4;
	//escoSubstr5
	private String escoSubstr5;
	//escoSubstr6
	private String escoSubstr6;
	//escoSubstr7
	private String escoSubstr7;
	//escoSubstr8
	private String escoSubstr8;
	//escoSubdate1
	private Date escoSubdate1;
	//escoSubdate2
	private Date escoSubdate2;
	//escoSubdate3
	private Date escoSubdate3;
	//escoSubdate4
	private Date escoSubdate4;
	//escoSubnum1
	private Long escoSubnum1;
	//escoSubnum2
	private Long escoSubnum2;
	//escoSubnum3
	private Long escoSubnum3;
	//escoSubnum4
	private Long escoSubnum4;
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
	//escoCdhOStatus
	private Long escoCdhOStatus;
	//escoCdhPStatus
	private Long escoCdhPStatus;
	//escoHscode
	private String escoHscode;

	/**
	 * Get escoId
	 */
	@Column(name = "ESCO_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEscoId() {
		return escoId;
	}

	/**
	 * Set escoId
	 */
	public void setEscoId(Long escoId) {
		this.escoId = escoId;
		addValidField("escoId");
	}

	/**
	 * Get escoParentEscoId
	 */
	@Column(name = "ESCO_PARENT_ESCO_ID")
	public Long getEscoParentEscoId() {
		return escoParentEscoId;
	}

	/**
	 * Set escoParentEscoId
	 */
	public void setEscoParentEscoId(Long escoParentEscoId) {
		this.escoParentEscoId = escoParentEscoId;
		addValidField("escoParentEscoId");
	}

	/**
	 * Get escoEbplCityId
	 */
	@Column(name = "ESCO_EBPL_CITY_ID")
	public Long getEscoEbplCityId() {
		return escoEbplCityId;
	}

	/**
	 * Set escoEbplCityId
	 */
	public void setEscoEbplCityId(Long escoEbplCityId) {
		this.escoEbplCityId = escoEbplCityId;
		addValidField("escoEbplCityId");
	}

	/**
	 * Get escoCompanyNo
	 */
	@Column(name = "ESCO_COMPANY_NO")
	public String getEscoCompanyNo() {
		return escoCompanyNo;
	}

	/**
	 * Set escoCompanyNo
	 */
	public void setEscoCompanyNo(String escoCompanyNo) {
		this.escoCompanyNo = escoCompanyNo;
		addValidField("escoCompanyNo");
	}

	/**
	 * Get escoCompanyNameCn
	 */
	@Column(name = "ESCO_COMPANY_NAME_CN")
	public String getEscoCompanyNameCn() {
		return escoCompanyNameCn;
	}

	/**
	 * Set escoCompanyNameCn
	 */
	public void setEscoCompanyNameCn(String escoCompanyNameCn) {
		this.escoCompanyNameCn = escoCompanyNameCn;
		addValidField("escoCompanyNameCn");
	}

	/**
	 * Get escoCompanyNameEn
	 */
	@Column(name = "ESCO_COMPANY_NAME_EN")
	public String getEscoCompanyNameEn() {
		return escoCompanyNameEn;
	}

	/**
	 * Set escoCompanyNameEn
	 */
	public void setEscoCompanyNameEn(String escoCompanyNameEn) {
		this.escoCompanyNameEn = escoCompanyNameEn;
		addValidField("escoCompanyNameEn");
	}

	/**
	 * Get escoSendCode
	 */
	@Column(name = "ESCO_SEND_CODE")
	public String getEscoSendCode() {
		return escoSendCode;
	}

	/**
	 * Set escoSendCode
	 */
	public void setEscoSendCode(String escoSendCode) {
		this.escoSendCode = escoSendCode;
		addValidField("escoSendCode");
	}

	/**
	 * Get escoAddressCn
	 */
	@Column(name = "ESCO_ADDRESS_CN")
	public String getEscoAddressCn() {
		return escoAddressCn;
	}

	/**
	 * Set escoAddressCn
	 */
	public void setEscoAddressCn(String escoAddressCn) {
		this.escoAddressCn = escoAddressCn;
		addValidField("escoAddressCn");
	}

	/**
	 * Get escoAddressEn
	 */
	@Column(name = "ESCO_ADDRESS_EN")
	public String getEscoAddressEn() {
		return escoAddressEn;
	}

	/**
	 * Set escoAddressEn
	 */
	public void setEscoAddressEn(String escoAddressEn) {
		this.escoAddressEn = escoAddressEn;
		addValidField("escoAddressEn");
	}

	/**
	 * Get escoPostalcode
	 */
	@Column(name = "ESCO_POSTALCODE")
	public String getEscoPostalcode() {
		return escoPostalcode;
	}

	/**
	 * Set escoPostalcode
	 */
	public void setEscoPostalcode(String escoPostalcode) {
		this.escoPostalcode = escoPostalcode;
		addValidField("escoPostalcode");
	}

	/**
	 * Get escoFax
	 */
	@Column(name = "ESCO_FAX")
	public String getEscoFax() {
		return escoFax;
	}

	/**
	 * Set escoFax
	 */
	public void setEscoFax(String escoFax) {
		this.escoFax = escoFax;
		addValidField("escoFax");
	}

	/**
	 * Get escoUrl
	 */
	@Column(name = "ESCO_URL")
	public String getEscoUrl() {
		return escoUrl;
	}

	/**
	 * Set escoUrl
	 */
	public void setEscoUrl(String escoUrl) {
		this.escoUrl = escoUrl;
		addValidField("escoUrl");
	}

	/**
	 * Get escoBusinessNo
	 */
	@Column(name = "ESCO_BUSINESS_NO")
	public String getEscoBusinessNo() {
		return escoBusinessNo;
	}

	/**
	 * Set escoBusinessNo
	 */
	public void setEscoBusinessNo(String escoBusinessNo) {
		this.escoBusinessNo = escoBusinessNo;
		addValidField("escoBusinessNo");
	}

	/**
	 * Get escoPhone
	 */
	@Column(name = "ESCO_PHONE")
	public String getEscoPhone() {
		return escoPhone;
	}

	/**
	 * Set escoPhone
	 */
	public void setEscoPhone(String escoPhone) {
		this.escoPhone = escoPhone;
		addValidField("escoPhone");
	}

	/**
	 * Get escoTaxNo
	 */
	@Column(name = "ESCO_TAX_NO")
	public String getEscoTaxNo() {
		return escoTaxNo;
	}

	/**
	 * Set escoTaxNo
	 */
	public void setEscoTaxNo(String escoTaxNo) {
		this.escoTaxNo = escoTaxNo;
		addValidField("escoTaxNo");
	}

	/**
	 * Get escoCurrency
	 */
	@Column(name = "ESCO_CURRENCY")
	public String getEscoCurrency() {
		return escoCurrency;
	}

	/**
	 * Set escoCurrency
	 */
	public void setEscoCurrency(String escoCurrency) {
		this.escoCurrency = escoCurrency;
		addValidField("escoCurrency");
	}

	/**
	 * Get escoFinanceCode
	 */
	@Column(name = "ESCO_FINANCE_CODE")
	public String getEscoFinanceCode() {
		return escoFinanceCode;
	}

	/**
	 * Set escoFinanceCode
	 */
	public void setEscoFinanceCode(String escoFinanceCode) {
		this.escoFinanceCode = escoFinanceCode;
		addValidField("escoFinanceCode");
	}

	/**
	 * Get escoStatus
	 */
	@Column(name = "ESCO_STATUS")
	public String getEscoStatus() {
		return escoStatus;
	}

	/**
	 * Set escoStatus
	 */
	public void setEscoStatus(String escoStatus) {
		this.escoStatus = escoStatus;
		addValidField("escoStatus");
	}

	/**
	 * Get escoCdhCode
	 */
	@Column(name = "ESCO_CDH_CODE")
	public String getEscoCdhCode() {
		return escoCdhCode;
	}

	/**
	 * Set escoCdhCode
	 */
	public void setEscoCdhCode(String escoCdhCode) {
		this.escoCdhCode = escoCdhCode;
		addValidField("escoCdhCode");
	}

	/**
	 * Get escoPath
	 */
	@Column(name = "ESCO_PATH")
	public String getEscoPath() {
		return escoPath;
	}

	/**
	 * Set escoPath
	 */
	public void setEscoPath(String escoPath) {
		this.escoPath = escoPath;
		addValidField("escoPath");
	}

	/**
	 * Get escoSubstr1
	 */
	@Column(name = "ESCO_SUBSTR1")
	public String getEscoSubstr1() {
		return escoSubstr1;
	}

	/**
	 * Set escoSubstr1
	 */
	public void setEscoSubstr1(String escoSubstr1) {
		this.escoSubstr1 = escoSubstr1;
		addValidField("escoSubstr1");
	}

	/**
	 * Get escoSubstr2
	 */
	@Column(name = "ESCO_SUBSTR2")
	public String getEscoSubstr2() {
		return escoSubstr2;
	}

	/**
	 * Set escoSubstr2
	 */
	public void setEscoSubstr2(String escoSubstr2) {
		this.escoSubstr2 = escoSubstr2;
		addValidField("escoSubstr2");
	}

	/**
	 * Get escoSubstr3
	 */
	@Column(name = "ESCO_SUBSTR3")
	public String getEscoSubstr3() {
		return escoSubstr3;
	}

	/**
	 * Set escoSubstr3
	 */
	public void setEscoSubstr3(String escoSubstr3) {
		this.escoSubstr3 = escoSubstr3;
		addValidField("escoSubstr3");
	}

	/**
	 * Get escoSubstr4
	 */
	@Column(name = "ESCO_SUBSTR4")
	public String getEscoSubstr4() {
		return escoSubstr4;
	}

	/**
	 * Set escoSubstr4
	 */
	public void setEscoSubstr4(String escoSubstr4) {
		this.escoSubstr4 = escoSubstr4;
		addValidField("escoSubstr4");
	}

	/**
	 * Get escoSubstr5
	 */
	@Column(name = "ESCO_SUBSTR5")
	public String getEscoSubstr5() {
		return escoSubstr5;
	}

	/**
	 * Set escoSubstr5
	 */
	public void setEscoSubstr5(String escoSubstr5) {
		this.escoSubstr5 = escoSubstr5;
		addValidField("escoSubstr5");
	}

	/**
	 * Get escoSubstr6
	 */
	@Column(name = "ESCO_SUBSTR6")
	public String getEscoSubstr6() {
		return escoSubstr6;
	}

	/**
	 * Set escoSubstr6
	 */
	public void setEscoSubstr6(String escoSubstr6) {
		this.escoSubstr6 = escoSubstr6;
		addValidField("escoSubstr6");
	}

	/**
	 * Get escoSubstr7
	 */
	@Column(name = "ESCO_SUBSTR7")
	public String getEscoSubstr7() {
		return escoSubstr7;
	}

	/**
	 * Set escoSubstr7
	 */
	public void setEscoSubstr7(String escoSubstr7) {
		this.escoSubstr7 = escoSubstr7;
		addValidField("escoSubstr7");
	}

	/**
	 * Get escoSubstr8
	 */
	@Column(name = "ESCO_SUBSTR8")
	public String getEscoSubstr8() {
		return escoSubstr8;
	}

	/**
	 * Set escoSubstr8
	 */
	public void setEscoSubstr8(String escoSubstr8) {
		this.escoSubstr8 = escoSubstr8;
		addValidField("escoSubstr8");
	}

	/**
	 * Get escoSubdate1
	 */
	@Column(name = "ESCO_SUBDATE1")
	public Date getEscoSubdate1() {
		return escoSubdate1;
	}

	/**
	 * Set escoSubdate1
	 */
	public void setEscoSubdate1(Date escoSubdate1) {
		this.escoSubdate1 = escoSubdate1;
		addValidField("escoSubdate1");
	}

	/**
	 * Get escoSubdate2
	 */
	@Column(name = "ESCO_SUBDATE2")
	public Date getEscoSubdate2() {
		return escoSubdate2;
	}

	/**
	 * Set escoSubdate2
	 */
	public void setEscoSubdate2(Date escoSubdate2) {
		this.escoSubdate2 = escoSubdate2;
		addValidField("escoSubdate2");
	}

	/**
	 * Get escoSubdate3
	 */
	@Column(name = "ESCO_SUBDATE3")
	public Date getEscoSubdate3() {
		return escoSubdate3;
	}

	/**
	 * Set escoSubdate3
	 */
	public void setEscoSubdate3(Date escoSubdate3) {
		this.escoSubdate3 = escoSubdate3;
		addValidField("escoSubdate3");
	}

	/**
	 * Get escoSubdate4
	 */
	@Column(name = "ESCO_SUBDATE4")
	public Date getEscoSubdate4() {
		return escoSubdate4;
	}

	/**
	 * Set escoSubdate4
	 */
	public void setEscoSubdate4(Date escoSubdate4) {
		this.escoSubdate4 = escoSubdate4;
		addValidField("escoSubdate4");
	}

	/**
	 * Get escoSubnum1
	 */
	@Column(name = "ESCO_SUBNUM1")
	public Long getEscoSubnum1() {
		return escoSubnum1;
	}

	/**
	 * Set escoSubnum1
	 */
	public void setEscoSubnum1(Long escoSubnum1) {
		this.escoSubnum1 = escoSubnum1;
		addValidField("escoSubnum1");
	}

	/**
	 * Get escoSubnum2
	 */
	@Column(name = "ESCO_SUBNUM2")
	public Long getEscoSubnum2() {
		return escoSubnum2;
	}

	/**
	 * Set escoSubnum2
	 */
	public void setEscoSubnum2(Long escoSubnum2) {
		this.escoSubnum2 = escoSubnum2;
		addValidField("escoSubnum2");
	}

	/**
	 * Get escoSubnum3
	 */
	@Column(name = "ESCO_SUBNUM3")
	public Long getEscoSubnum3() {
		return escoSubnum3;
	}

	/**
	 * Set escoSubnum3
	 */
	public void setEscoSubnum3(Long escoSubnum3) {
		this.escoSubnum3 = escoSubnum3;
		addValidField("escoSubnum3");
	}

	/**
	 * Get escoSubnum4
	 */
	@Column(name = "ESCO_SUBNUM4")
	public Long getEscoSubnum4() {
		return escoSubnum4;
	}

	/**
	 * Set escoSubnum4
	 */
	public void setEscoSubnum4(Long escoSubnum4) {
		this.escoSubnum4 = escoSubnum4;
		addValidField("escoSubnum4");
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
	 * Get escoCdhOStatus
	 */
	@Column(name = "ESCO_CDH_O_STATUS")
	public Long getEscoCdhOStatus() {
		return escoCdhOStatus;
	}

	/**
	 * Set escoCdhOStatus
	 */
	public void setEscoCdhOStatus(Long escoCdhOStatus) {
		this.escoCdhOStatus = escoCdhOStatus;
		addValidField("escoCdhOStatus");
	}

	/**
	 * Get escoCdhPStatus
	 */
	@Column(name = "ESCO_CDH_P_STATUS")
	public Long getEscoCdhPStatus() {
		return escoCdhPStatus;
	}

	/**
	 * Set escoCdhPStatus
	 */
	public void setEscoCdhPStatus(Long escoCdhPStatus) {
		this.escoCdhPStatus = escoCdhPStatus;
		addValidField("escoCdhPStatus");
	}

	/**
	 * Get escoHscode
	 */
	@Column(name = "ESCO_HSCODE")
	public String getEscoHscode() {
		return escoHscode;
	}

	/**
	 * Set escoHscode
	 */
	public void setEscoHscode(String escoHscode) {
		this.escoHscode = escoHscode;
		addValidField("escoHscode");
	}

}
