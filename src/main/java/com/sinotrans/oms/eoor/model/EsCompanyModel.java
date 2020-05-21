package com.sinotrans.oms.eoor.model;

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

@Entity
@Table(name = "ES_COMPANY")
public class EsCompanyModel extends BaseModel implements OperationLog {

	//公司表主键
	private Integer escoId;
	//上级公司ID
	private Integer escoParentEscoId;
	//所在城市
	private Integer escoEbplCityId;
	//公司编码
	private String escoCompanyNo;
	//公司名称
	private String escoCompanyNameCn;
	//公司英文名称
	private String escoCompanyNameEn;
	//发送代码
	private String escoSendCode;
	//公司地址
	private String escoAddressCn;
	//公司英文地址
	private String escoAddressEn;
	//邮编
	private String escoPostalcode;
	//传真号
	private String escoFax;
	//公司URL
	private String escoUrl;
	//工商号
	private String escoBusinessNo;
	//电话号码
	private String escoPhone;
	//税务号
	private String escoTaxNo;
	//本位币
	private String escoCurrency;
	//财务代码
	private String escoFinanceCode;
	//平台状态
	private String escoStatus;
	//CDH接口代码
	private String escoCdhCode;
	//预留字段
	private String escoSubstr1;
	//预留字段
	private String escoSubstr2;
	//预留字段
	private String escoSubstr3;
	//预留字段
	private String escoSubstr4;
	//预留字段
	private String escoSubstr5;
	//预留字段
	private String escoSubstr6;
	//预留字段
	private String escoSubstr7;
	//预留字段
	private String escoSubstr8;
	//预留字段
	private Date escoSubdate1;
	//预留字段
	private Date escoSubdate2;
	//预留字段
	private Date escoSubdate3;
	//预留字段
	private Date escoSubdate4;
	//预留字段
	private Date escoSubdate5;
	//预留字段
	private Integer escoSubnum1;
	//预留字段
	private Integer escoSubnum2;
	//预留字段
	private Integer escoSubnum3;
	//时间戳
	private Integer recVer;
	//创建时间
	private Date createTime;
	//创建人
	private String creator;
	//修改时间
	private Date modifyTime;
	//修改人
	private String modifier;
	//路径
	private String escoPath;

	/**
	 * Get 公司表主键
	 */
	@Column(name = "ESCO_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getEscoId() {
		return escoId;
	}

	/**
	 * Set 公司表主键
	 */
	public void setEscoId(Integer escoId) {
		this.escoId = escoId;
		addValidField("escoId");
	}

	/**
	 * Get 上级公司ID
	 */
	@Column(name = "ESCO_PARENT_ESCO_ID")
	public Integer getEscoParentEscoId() {
		return escoParentEscoId;
	}

	/**
	 * Set 上级公司ID
	 */
	public void setEscoParentEscoId(Integer escoParentEscoId) {
		this.escoParentEscoId = escoParentEscoId;
		addValidField("escoParentEscoId");
	}

	/**
	 * Get 所在城市
	 */
	@Column(name = "ESCO_EBPL_CITY_ID")
	public Integer getEscoEbplCityId() {
		return escoEbplCityId;
	}

	/**
	 * Set 所在城市
	 */
	public void setEscoEbplCityId(Integer escoEbplCityId) {
		this.escoEbplCityId = escoEbplCityId;
		addValidField("escoEbplCityId");
	}

	/**
	 * Get 公司编码
	 */
	@Column(name = "ESCO_COMPANY_NO")
	public String getEscoCompanyNo() {
		return escoCompanyNo;
	}

	/**
	 * Set 公司编码
	 */
	public void setEscoCompanyNo(String escoCompanyNo) {
		this.escoCompanyNo = escoCompanyNo;
		addValidField("escoCompanyNo");
	}

	/**
	 * Get 公司名称
	 */
	@Column(name = "ESCO_COMPANY_NAME_CN")
	public String getEscoCompanyNameCn() {
		return escoCompanyNameCn;
	}

	/**
	 * Set 公司名称
	 */
	public void setEscoCompanyNameCn(String escoCompanyNameCn) {
		this.escoCompanyNameCn = escoCompanyNameCn;
		addValidField("escoCompanyNameCn");
	}

	/**
	 * Get 公司英文名称
	 */
	@Column(name = "ESCO_COMPANY_NAME_EN")
	public String getEscoCompanyNameEn() {
		return escoCompanyNameEn;
	}

	/**
	 * Set 公司英文名称
	 */
	public void setEscoCompanyNameEn(String escoCompanyNameEn) {
		this.escoCompanyNameEn = escoCompanyNameEn;
		addValidField("escoCompanyNameEn");
	}

	/**
	 * Get 发送代码
	 * 为EDI功能预留的字段
	 */
	@Column(name = "ESCO_SEND_CODE")
	public String getEscoSendCode() {
		return escoSendCode;
	}

	/**
	 * Set 发送代码
	 * 为EDI功能预留的字段
	 */
	public void setEscoSendCode(String escoSendCode) {
		this.escoSendCode = escoSendCode;
		addValidField("escoSendCode");
	}

	/**
	 * Get 公司地址
	 */
	@Column(name = "ESCO_ADDRESS_CN")
	public String getEscoAddressCn() {
		return escoAddressCn;
	}

	/**
	 * Set 公司地址
	 */
	public void setEscoAddressCn(String escoAddressCn) {
		this.escoAddressCn = escoAddressCn;
		addValidField("escoAddressCn");
	}

	/**
	 * Get 公司英文地址
	 */
	@Column(name = "ESCO_ADDRESS_EN")
	public String getEscoAddressEn() {
		return escoAddressEn;
	}

	/**
	 * Set 公司英文地址
	 */
	public void setEscoAddressEn(String escoAddressEn) {
		this.escoAddressEn = escoAddressEn;
		addValidField("escoAddressEn");
	}

	/**
	 * Get 邮编
	 */
	@Column(name = "ESCO_POSTALCODE")
	public String getEscoPostalcode() {
		return escoPostalcode;
	}

	/**
	 * Set 邮编
	 */
	public void setEscoPostalcode(String escoPostalcode) {
		this.escoPostalcode = escoPostalcode;
		addValidField("escoPostalcode");
	}

	/**
	 * Get 传真号
	 */
	@Column(name = "ESCO_FAX")
	public String getEscoFax() {
		return escoFax;
	}

	/**
	 * Set 传真号
	 */
	public void setEscoFax(String escoFax) {
		this.escoFax = escoFax;
		addValidField("escoFax");
	}

	/**
	 * Get 公司URL
	 */
	@Column(name = "ESCO_URL")
	public String getEscoUrl() {
		return escoUrl;
	}

	/**
	 * Set 公司URL
	 */
	public void setEscoUrl(String escoUrl) {
		this.escoUrl = escoUrl;
		addValidField("escoUrl");
	}

	/**
	 * Get 工商号
	 */
	@Column(name = "ESCO_BUSINESS_NO")
	public String getEscoBusinessNo() {
		return escoBusinessNo;
	}

	/**
	 * Set 工商号
	 */
	public void setEscoBusinessNo(String escoBusinessNo) {
		this.escoBusinessNo = escoBusinessNo;
		addValidField("escoBusinessNo");
	}

	/**
	 * Get 电话号码
	 */
	@Column(name = "ESCO_PHONE")
	public String getEscoPhone() {
		return escoPhone;
	}

	/**
	 * Set 电话号码
	 */
	public void setEscoPhone(String escoPhone) {
		this.escoPhone = escoPhone;
		addValidField("escoPhone");
	}

	/**
	 * Get 税务号
	 */
	@Column(name = "ESCO_TAX_NO")
	public String getEscoTaxNo() {
		return escoTaxNo;
	}

	/**
	 * Set 税务号
	 */
	public void setEscoTaxNo(String escoTaxNo) {
		this.escoTaxNo = escoTaxNo;
		addValidField("escoTaxNo");
	}

	/**
	 * Get 本位币
	 * 数据字典配置
	 */
	@Column(name = "ESCO_CURRENCY")
	public String getEscoCurrency() {
		return escoCurrency;
	}

	/**
	 * Set 本位币
	 * 数据字典配置
	 */
	public void setEscoCurrency(String escoCurrency) {
		this.escoCurrency = escoCurrency;
		addValidField("escoCurrency");
	}

	/**
	 * Get 财务代码
	 */
	@Column(name = "ESCO_FINANCE_CODE")
	public String getEscoFinanceCode() {
		return escoFinanceCode;
	}

	/**
	 * Set 财务代码
	 */
	public void setEscoFinanceCode(String escoFinanceCode) {
		this.escoFinanceCode = escoFinanceCode;
		addValidField("escoFinanceCode");
	}

	/**
	 * Get 平台状态
	 * 数据字典配置
	 */
	@Column(name = "ESCO_STATUS")
	public String getEscoStatus() {
		return escoStatus;
	}

	/**
	 * Set 平台状态
	 * 数据字典配置
	 */
	public void setEscoStatus(String escoStatus) {
		this.escoStatus = escoStatus;
		addValidField("escoStatus");
	}

	/**
	 * Get CDH接口代码
	 */
	@Column(name = "ESCO_CDH_CODE")
	public String getEscoCdhCode() {
		return escoCdhCode;
	}

	/**
	 * Set CDH接口代码
	 */
	public void setEscoCdhCode(String escoCdhCode) {
		this.escoCdhCode = escoCdhCode;
		addValidField("escoCdhCode");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESCO_SUBSTR1")
	public String getEscoSubstr1() {
		return escoSubstr1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEscoSubstr1(String escoSubstr1) {
		this.escoSubstr1 = escoSubstr1;
		addValidField("escoSubstr1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESCO_SUBSTR2")
	public String getEscoSubstr2() {
		return escoSubstr2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEscoSubstr2(String escoSubstr2) {
		this.escoSubstr2 = escoSubstr2;
		addValidField("escoSubstr2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESCO_SUBSTR3")
	public String getEscoSubstr3() {
		return escoSubstr3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEscoSubstr3(String escoSubstr3) {
		this.escoSubstr3 = escoSubstr3;
		addValidField("escoSubstr3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESCO_SUBSTR4")
	public String getEscoSubstr4() {
		return escoSubstr4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEscoSubstr4(String escoSubstr4) {
		this.escoSubstr4 = escoSubstr4;
		addValidField("escoSubstr4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESCO_SUBSTR5")
	public String getEscoSubstr5() {
		return escoSubstr5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEscoSubstr5(String escoSubstr5) {
		this.escoSubstr5 = escoSubstr5;
		addValidField("escoSubstr5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESCO_SUBSTR6")
	public String getEscoSubstr6() {
		return escoSubstr6;
	}

	/**
	 * Set 预留字段
	 */
	public void setEscoSubstr6(String escoSubstr6) {
		this.escoSubstr6 = escoSubstr6;
		addValidField("escoSubstr6");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESCO_SUBSTR7")
	public String getEscoSubstr7() {
		return escoSubstr7;
	}

	/**
	 * Set 预留字段
	 */
	public void setEscoSubstr7(String escoSubstr7) {
		this.escoSubstr7 = escoSubstr7;
		addValidField("escoSubstr7");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESCO_SUBSTR8")
	public String getEscoSubstr8() {
		return escoSubstr8;
	}

	/**
	 * Set 预留字段
	 */
	public void setEscoSubstr8(String escoSubstr8) {
		this.escoSubstr8 = escoSubstr8;
		addValidField("escoSubstr8");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESCO_SUBDATE1")
	public Date getEscoSubdate1() {
		return escoSubdate1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEscoSubdate1(Date escoSubdate1) {
		this.escoSubdate1 = escoSubdate1;
		addValidField("escoSubdate1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESCO_SUBDATE2")
	public Date getEscoSubdate2() {
		return escoSubdate2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEscoSubdate2(Date escoSubdate2) {
		this.escoSubdate2 = escoSubdate2;
		addValidField("escoSubdate2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESCO_SUBDATE3")
	public Date getEscoSubdate3() {
		return escoSubdate3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEscoSubdate3(Date escoSubdate3) {
		this.escoSubdate3 = escoSubdate3;
		addValidField("escoSubdate3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESCO_SUBDATE4")
	public Date getEscoSubdate4() {
		return escoSubdate4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEscoSubdate4(Date escoSubdate4) {
		this.escoSubdate4 = escoSubdate4;
		addValidField("escoSubdate4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESCO_SUBDATE5")
	public Date getEscoSubdate5() {
		return escoSubdate5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEscoSubdate5(Date escoSubdate5) {
		this.escoSubdate5 = escoSubdate5;
		addValidField("escoSubdate5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESCO_SUBNUM1")
	public Integer getEscoSubnum1() {
		return escoSubnum1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEscoSubnum1(Integer escoSubnum1) {
		this.escoSubnum1 = escoSubnum1;
		addValidField("escoSubnum1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESCO_SUBNUM2")
	public Integer getEscoSubnum2() {
		return escoSubnum2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEscoSubnum2(Integer escoSubnum2) {
		this.escoSubnum2 = escoSubnum2;
		addValidField("escoSubnum2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESCO_SUBNUM3")
	public Integer getEscoSubnum3() {
		return escoSubnum3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEscoSubnum3(Integer escoSubnum3) {
		this.escoSubnum3 = escoSubnum3;
		addValidField("escoSubnum3");
	}

	/**
	 * Get 时间戳
	 */
	@Column(name = "REC_VER")
	@Version
	public Integer getRecVer() {
		return recVer;
	}

	/**
	 * Set 时间戳
	 */
	public void setRecVer(Integer recVer) {
		this.recVer = recVer;
		addValidField("recVer");
	}

	/**
	 * Get 创建时间
	 */
	@Column(name = "CREATE_TIME")
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * Set 创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
		addValidField("createTime");
	}

	/**
	 * Get 创建人
	 */
	@Column(name = "CREATOR")
	public String getCreator() {
		return creator;
	}

	/**
	 * Set 创建人
	 */
	public void setCreator(String creator) {
		this.creator = creator;
		addValidField("creator");
	}

	/**
	 * Get 修改时间
	 */
	@Column(name = "MODIFY_TIME")
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * Set 修改时间
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
		addValidField("modifyTime");
	}

	/**
	 * Get 修改人
	 */
	@Column(name = "MODIFIER")
	public String getModifier() {
		return modifier;
	}

	/**
	 * Set 修改人
	 */
	public void setModifier(String modifier) {
		this.modifier = modifier;
		addValidField("modifier");
	}

	/**
	 * Get 路径
	 */
	@Column(name = "ESCO_PATH")
	public String getEscoPath() {
		return escoPath;
	}

	/**
	 * Set 路径
	 */
	public void setEscoPath(String escoPath) {
		this.escoPath = escoPath;
		addValidField("escoPath");
	}

}