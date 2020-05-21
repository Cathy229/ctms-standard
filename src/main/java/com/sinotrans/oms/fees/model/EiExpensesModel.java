package com.sinotrans.oms.fees.model;

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
 * Model class for EiExpenses
 */
@Entity
@Table(name = "EI_EXPENSES")
public class EiExpensesModel extends BaseModel implements OperationLog {

	//eiepId
	private Long eiepId;
	//eiepStatus
	private Long eiepStatus;
	//eiepSource
	private Long eiepSource;
	//eiepProperty
	private Long eiepProperty;
	//eiepEscoCompanyNo
	private String eiepEscoCompanyNo;
	//eiepEbbuCode
	private String eiepEbbuCode;
	//eiepEbcuCustomerNo
	private String eiepEbcuCustomerNo;
	//eiepEiimId
	private Long eiepEiimId;
	//eiepEiimSourceId
	private String eiepEiimSourceId;
	//eiepSourceId
	private String eiepSourceId;
	//eiepAosSourceId
	private String eiepAosSourceId;
	//eiepOppositeEfbfId
	private String eiepOppositeEfbfId;
	//eiepIsRp
	private Long eiepIsRp;
	//eiepEbfhSourceId
	private String eiepEbfhSourceId;
	//eiepCurrency
	private String eiepCurrency;
	//eiepExchangeRate
	private Double eiepExchangeRate;
	//eiepAmt
	private Double eiepAmt;
	//eiepSourceAmt
	private Double eiepSourceAmt;
	//eiepTaxrate
	private Double eiepTaxrate;
	//eiepFee
	private Double eiepFee;
	//eiepTax
	private Double eiepTax;
	//eiepSubstr1
	private String eiepSubstr1;
	//eiepSubstr2
	private String eiepSubstr2;
	//eiepSubstr3
	private String eiepSubstr3;
	//eiepSubstr4
	private String eiepSubstr4;
	//eiepSubstr5
	private String eiepSubstr5;
	//eiepSubstr6
	private String eiepSubstr6;
	//eiepSubstr7
	private String eiepSubstr7;
	//eiepSubstr8
	private String eiepSubstr8;
	//eiepSubdate1
	private Date eiepSubdate1;
	//eiepSubdate2
	private Date eiepSubdate2;
	//eiepSubdate3
	private Date eiepSubdate3;
	//eiepSubdate4
	private Date eiepSubdate4;
	//eiepSubnum1
	private Long eiepSubnum1;
	//eiepSubnum2
	private Long eiepSubnum2;
	//eiepSubnum3
	private Long eiepSubnum3;
	//eiepSubnum4
	private Long eiepSubnum4;
	//hdFilename
	private String hdFilename;
	//hdBatchnumber
	private String hdBatchnumber;
	//hdSymbol
	private String hdSymbol;
	//hdBeginprocessingtime
	private Date hdBeginprocessingtime;
	//hdLastmodifiedtime
	private Date hdLastmodifiedtime;
	//hdInformation
	private String hdInformation;
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
	//eiepSubstr9
	private String eiepSubstr9;
	//eiepSubstr10
	private String eiepSubstr10;
	//eiepSubstr11
	private String eiepSubstr11;
	//eiepSubstr12
	private String eiepSubstr12;
	//eiepSubstr13
	private String eiepSubstr13;
	//eiepSubstr14
	private String eiepSubstr14;
	//eiepSubstr15
	private String eiepSubstr15;
	//eiepSubstr16
	private String eiepSubstr16;
	//eiepSubstr17
	private String eiepSubstr17;
	//eiepSubstr18
	private String eiepSubstr18;
	//eiepSubstr19
	private String eiepSubstr19;
	//eiepSubstr20
	private String eiepSubstr20;
	//eiepRpStatus
	private String eiepRpStatus;
	//eiepEsusUserNameCn
	private String eiepEsusUserNameCn;
	//eiepTime
	private String eiepTime;

	/**
	 * Get eiepId
	 */
	@Column(name = "EIEP_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEiepId() {
		return eiepId;
	}

	/**
	 * Set eiepId
	 */
	public void setEiepId(Long eiepId) {
		this.eiepId = eiepId;
		addValidField("eiepId");
	}

	/**
	 * Get eiepStatus
	 */
	@Column(name = "EIEP_STATUS")
	public Long getEiepStatus() {
		return eiepStatus;
	}

	/**
	 * Set eiepStatus
	 */
	public void setEiepStatus(Long eiepStatus) {
		this.eiepStatus = eiepStatus;
		addValidField("eiepStatus");
	}

	/**
	 * Get eiepSource
	 */
	@Column(name = "EIEP_SOURCE")
	public Long getEiepSource() {
		return eiepSource;
	}

	/**
	 * Set eiepSource
	 */
	public void setEiepSource(Long eiepSource) {
		this.eiepSource = eiepSource;
		addValidField("eiepSource");
	}

	/**
	 * Get eiepProperty
	 */
	@Column(name = "EIEP_PROPERTY")
	public Long getEiepProperty() {
		return eiepProperty;
	}

	/**
	 * Set eiepProperty
	 */
	public void setEiepProperty(Long eiepProperty) {
		this.eiepProperty = eiepProperty;
		addValidField("eiepProperty");
	}

	/**
	 * Get eiepEscoCompanyNo
	 */
	@Column(name = "EIEP_ESCO_COMPANY_NO")
	public String getEiepEscoCompanyNo() {
		return eiepEscoCompanyNo;
	}

	/**
	 * Set eiepEscoCompanyNo
	 */
	public void setEiepEscoCompanyNo(String eiepEscoCompanyNo) {
		this.eiepEscoCompanyNo = eiepEscoCompanyNo;
		addValidField("eiepEscoCompanyNo");
	}

	/**
	 * Get eiepEbbuCode
	 */
	@Column(name = "EIEP_EBBU_CODE")
	public String getEiepEbbuCode() {
		return eiepEbbuCode;
	}

	/**
	 * Set eiepEbbuCode
	 */
	public void setEiepEbbuCode(String eiepEbbuCode) {
		this.eiepEbbuCode = eiepEbbuCode;
		addValidField("eiepEbbuCode");
	}

	/**
	 * Get eiepEbcuCustomerNo
	 */
	@Column(name = "EIEP_EBCU_CUSTOMER_NO")
	public String getEiepEbcuCustomerNo() {
		return eiepEbcuCustomerNo;
	}

	/**
	 * Set eiepEbcuCustomerNo
	 */
	public void setEiepEbcuCustomerNo(String eiepEbcuCustomerNo) {
		this.eiepEbcuCustomerNo = eiepEbcuCustomerNo;
		addValidField("eiepEbcuCustomerNo");
	}

	/**
	 * Get eiepEiimId
	 */
	@Column(name = "EIEP_EIIM_ID")
	public Long getEiepEiimId() {
		return eiepEiimId;
	}

	/**
	 * Set eiepEiimId
	 */
	public void setEiepEiimId(Long eiepEiimId) {
		this.eiepEiimId = eiepEiimId;
		addValidField("eiepEiimId");
	}

	/**
	 * Get eiepEiimSourceId
	 */
	@Column(name = "EIEP_EIIM_SOURCE_ID")
	public String getEiepEiimSourceId() {
		return eiepEiimSourceId;
	}

	/**
	 * Set eiepEiimSourceId
	 */
	public void setEiepEiimSourceId(String eiepEiimSourceId) {
		this.eiepEiimSourceId = eiepEiimSourceId;
		addValidField("eiepEiimSourceId");
	}

	/**
	 * Get eiepSourceId
	 */
	@Column(name = "EIEP_SOURCE_ID")
	public String getEiepSourceId() {
		return eiepSourceId;
	}

	/**
	 * Set eiepSourceId
	 */
	public void setEiepSourceId(String eiepSourceId) {
		this.eiepSourceId = eiepSourceId;
		addValidField("eiepSourceId");
	}

	/**
	 * Get eiepAosSourceId
	 */
	@Column(name = "EIEP_AOS_SOURCE_ID")
	public String getEiepAosSourceId() {
		return eiepAosSourceId;
	}

	/**
	 * Set eiepAosSourceId
	 */
	public void setEiepAosSourceId(String eiepAosSourceId) {
		this.eiepAosSourceId = eiepAosSourceId;
		addValidField("eiepAosSourceId");
	}

	/**
	 * Get eiepOppositeEfbfId
	 */
	@Column(name = "EIEP_OPPOSITE_EFBF_ID")
	public String getEiepOppositeEfbfId() {
		return eiepOppositeEfbfId;
	}

	/**
	 * Set eiepOppositeEfbfId
	 */
	public void setEiepOppositeEfbfId(String eiepOppositeEfbfId) {
		this.eiepOppositeEfbfId = eiepOppositeEfbfId;
		addValidField("eiepOppositeEfbfId");
	}

	/**
	 * Get eiepIsRp
	 */
	@Column(name = "EIEP_IS_RP")
	public Long getEiepIsRp() {
		return eiepIsRp;
	}

	/**
	 * Set eiepIsRp
	 */
	public void setEiepIsRp(Long eiepIsRp) {
		this.eiepIsRp = eiepIsRp;
		addValidField("eiepIsRp");
	}

	/**
	 * Get eiepEbfhSourceId
	 */
	@Column(name = "EIEP_EBFH_SOURCE_ID")
	public String getEiepEbfhSourceId() {
		return eiepEbfhSourceId;
	}

	/**
	 * Set eiepEbfhSourceId
	 */
	public void setEiepEbfhSourceId(String eiepEbfhSourceId) {
		this.eiepEbfhSourceId = eiepEbfhSourceId;
		addValidField("eiepEbfhSourceId");
	}

	/**
	 * Get eiepCurrency
	 */
	@Column(name = "EIEP_CURRENCY")
	public String getEiepCurrency() {
		return eiepCurrency;
	}

	/**
	 * Set eiepCurrency
	 */
	public void setEiepCurrency(String eiepCurrency) {
		this.eiepCurrency = eiepCurrency;
		addValidField("eiepCurrency");
	}

	/**
	 * Get eiepExchangeRate
	 */
	@Column(name = "EIEP_EXCHANGE_RATE")
	public Double getEiepExchangeRate() {
		return eiepExchangeRate;
	}

	/**
	 * Set eiepExchangeRate
	 */
	public void setEiepExchangeRate(Double eiepExchangeRate) {
		this.eiepExchangeRate = eiepExchangeRate;
		addValidField("eiepExchangeRate");
	}

	/**
	 * Get eiepAmt
	 */
	@Column(name = "EIEP_AMT")
	public Double getEiepAmt() {
		return eiepAmt;
	}

	/**
	 * Set eiepAmt
	 */
	public void setEiepAmt(Double eiepAmt) {
		this.eiepAmt = eiepAmt;
		addValidField("eiepAmt");
	}

	/**
	 * Get eiepSourceAmt
	 */
	@Column(name = "EIEP_SOURCE_AMT")
	public Double getEiepSourceAmt() {
		return eiepSourceAmt;
	}

	/**
	 * Set eiepSourceAmt
	 */
	public void setEiepSourceAmt(Double eiepSourceAmt) {
		this.eiepSourceAmt = eiepSourceAmt;
		addValidField("eiepSourceAmt");
	}

	/**
	 * Get eiepTaxrate
	 */
	@Column(name = "EIEP_TAXRATE")
	public Double getEiepTaxrate() {
		return eiepTaxrate;
	}

	/**
	 * Set eiepTaxrate
	 */
	public void setEiepTaxrate(Double eiepTaxrate) {
		this.eiepTaxrate = eiepTaxrate;
		addValidField("eiepTaxrate");
	}

	/**
	 * Get eiepFee
	 */
	@Column(name = "EIEP_FEE")
	public Double getEiepFee() {
		return eiepFee;
	}

	/**
	 * Set eiepFee
	 */
	public void setEiepFee(Double eiepFee) {
		this.eiepFee = eiepFee;
		addValidField("eiepFee");
	}

	/**
	 * Get eiepTax
	 */
	@Column(name = "EIEP_TAX")
	public Double getEiepTax() {
		return eiepTax;
	}

	/**
	 * Set eiepTax
	 */
	public void setEiepTax(Double eiepTax) {
		this.eiepTax = eiepTax;
		addValidField("eiepTax");
	}

	/**
	 * Get eiepSubstr1
	 */
	@Column(name = "EIEP_SUBSTR1")
	public String getEiepSubstr1() {
		return eiepSubstr1;
	}

	/**
	 * Set eiepSubstr1
	 */
	public void setEiepSubstr1(String eiepSubstr1) {
		this.eiepSubstr1 = eiepSubstr1;
		addValidField("eiepSubstr1");
	}

	/**
	 * Get eiepSubstr2
	 */
	@Column(name = "EIEP_SUBSTR2")
	public String getEiepSubstr2() {
		return eiepSubstr2;
	}

	/**
	 * Set eiepSubstr2
	 */
	public void setEiepSubstr2(String eiepSubstr2) {
		this.eiepSubstr2 = eiepSubstr2;
		addValidField("eiepSubstr2");
	}

	/**
	 * Get eiepSubstr3
	 */
	@Column(name = "EIEP_SUBSTR3")
	public String getEiepSubstr3() {
		return eiepSubstr3;
	}

	/**
	 * Set eiepSubstr3
	 */
	public void setEiepSubstr3(String eiepSubstr3) {
		this.eiepSubstr3 = eiepSubstr3;
		addValidField("eiepSubstr3");
	}

	/**
	 * Get eiepSubstr4
	 */
	@Column(name = "EIEP_SUBSTR4")
	public String getEiepSubstr4() {
		return eiepSubstr4;
	}

	/**
	 * Set eiepSubstr4
	 */
	public void setEiepSubstr4(String eiepSubstr4) {
		this.eiepSubstr4 = eiepSubstr4;
		addValidField("eiepSubstr4");
	}

	/**
	 * Get eiepSubstr5
	 */
	@Column(name = "EIEP_SUBSTR5")
	public String getEiepSubstr5() {
		return eiepSubstr5;
	}

	/**
	 * Set eiepSubstr5
	 */
	public void setEiepSubstr5(String eiepSubstr5) {
		this.eiepSubstr5 = eiepSubstr5;
		addValidField("eiepSubstr5");
	}

	/**
	 * Get eiepSubstr6
	 */
	@Column(name = "EIEP_SUBSTR6")
	public String getEiepSubstr6() {
		return eiepSubstr6;
	}

	/**
	 * Set eiepSubstr6
	 */
	public void setEiepSubstr6(String eiepSubstr6) {
		this.eiepSubstr6 = eiepSubstr6;
		addValidField("eiepSubstr6");
	}

	/**
	 * Get eiepSubstr7
	 */
	@Column(name = "EIEP_SUBSTR7")
	public String getEiepSubstr7() {
		return eiepSubstr7;
	}

	/**
	 * Set eiepSubstr7
	 */
	public void setEiepSubstr7(String eiepSubstr7) {
		this.eiepSubstr7 = eiepSubstr7;
		addValidField("eiepSubstr7");
	}

	/**
	 * Get eiepSubstr8
	 */
	@Column(name = "EIEP_SUBSTR8")
	public String getEiepSubstr8() {
		return eiepSubstr8;
	}

	/**
	 * Set eiepSubstr8
	 */
	public void setEiepSubstr8(String eiepSubstr8) {
		this.eiepSubstr8 = eiepSubstr8;
		addValidField("eiepSubstr8");
	}

	/**
	 * Get eiepSubdate1
	 */
	@Column(name = "EIEP_SUBDATE1")
	public Date getEiepSubdate1() {
		return eiepSubdate1;
	}

	/**
	 * Set eiepSubdate1
	 */
	public void setEiepSubdate1(Date eiepSubdate1) {
		this.eiepSubdate1 = eiepSubdate1;
		addValidField("eiepSubdate1");
	}

	/**
	 * Get eiepSubdate2
	 */
	@Column(name = "EIEP_SUBDATE2")
	public Date getEiepSubdate2() {
		return eiepSubdate2;
	}

	/**
	 * Set eiepSubdate2
	 */
	public void setEiepSubdate2(Date eiepSubdate2) {
		this.eiepSubdate2 = eiepSubdate2;
		addValidField("eiepSubdate2");
	}

	/**
	 * Get eiepSubdate3
	 */
	@Column(name = "EIEP_SUBDATE3")
	public Date getEiepSubdate3() {
		return eiepSubdate3;
	}

	/**
	 * Set eiepSubdate3
	 */
	public void setEiepSubdate3(Date eiepSubdate3) {
		this.eiepSubdate3 = eiepSubdate3;
		addValidField("eiepSubdate3");
	}

	/**
	 * Get eiepSubdate4
	 */
	@Column(name = "EIEP_SUBDATE4")
	public Date getEiepSubdate4() {
		return eiepSubdate4;
	}

	/**
	 * Set eiepSubdate4
	 */
	public void setEiepSubdate4(Date eiepSubdate4) {
		this.eiepSubdate4 = eiepSubdate4;
		addValidField("eiepSubdate4");
	}

	/**
	 * Get eiepSubnum1
	 */
	@Column(name = "EIEP_SUBNUM1")
	public Long getEiepSubnum1() {
		return eiepSubnum1;
	}

	/**
	 * Set eiepSubnum1
	 */
	public void setEiepSubnum1(Long eiepSubnum1) {
		this.eiepSubnum1 = eiepSubnum1;
		addValidField("eiepSubnum1");
	}

	/**
	 * Get eiepSubnum2
	 */
	@Column(name = "EIEP_SUBNUM2")
	public Long getEiepSubnum2() {
		return eiepSubnum2;
	}

	/**
	 * Set eiepSubnum2
	 */
	public void setEiepSubnum2(Long eiepSubnum2) {
		this.eiepSubnum2 = eiepSubnum2;
		addValidField("eiepSubnum2");
	}

	/**
	 * Get eiepSubnum3
	 */
	@Column(name = "EIEP_SUBNUM3")
	public Long getEiepSubnum3() {
		return eiepSubnum3;
	}

	/**
	 * Set eiepSubnum3
	 */
	public void setEiepSubnum3(Long eiepSubnum3) {
		this.eiepSubnum3 = eiepSubnum3;
		addValidField("eiepSubnum3");
	}

	/**
	 * Get eiepSubnum4
	 */
	@Column(name = "EIEP_SUBNUM4")
	public Long getEiepSubnum4() {
		return eiepSubnum4;
	}

	/**
	 * Set eiepSubnum4
	 */
	public void setEiepSubnum4(Long eiepSubnum4) {
		this.eiepSubnum4 = eiepSubnum4;
		addValidField("eiepSubnum4");
	}

	/**
	 * Get hdFilename
	 */
	@Column(name = "HD_FILENAME")
	public String getHdFilename() {
		return hdFilename;
	}

	/**
	 * Set hdFilename
	 */
	public void setHdFilename(String hdFilename) {
		this.hdFilename = hdFilename;
		addValidField("hdFilename");
	}

	/**
	 * Get hdBatchnumber
	 */
	@Column(name = "HD_BATCHNUMBER")
	public String getHdBatchnumber() {
		return hdBatchnumber;
	}

	/**
	 * Set hdBatchnumber
	 */
	public void setHdBatchnumber(String hdBatchnumber) {
		this.hdBatchnumber = hdBatchnumber;
		addValidField("hdBatchnumber");
	}

	/**
	 * Get hdSymbol
	 */
	@Column(name = "HD_SYMBOL")
	public String getHdSymbol() {
		return hdSymbol;
	}

	/**
	 * Set hdSymbol
	 */
	public void setHdSymbol(String hdSymbol) {
		this.hdSymbol = hdSymbol;
		addValidField("hdSymbol");
	}

	/**
	 * Get hdBeginprocessingtime
	 */
	@Column(name = "HD_BEGINPROCESSINGTIME")
	public Date getHdBeginprocessingtime() {
		return hdBeginprocessingtime;
	}

	/**
	 * Set hdBeginprocessingtime
	 */
	public void setHdBeginprocessingtime(Date hdBeginprocessingtime) {
		this.hdBeginprocessingtime = hdBeginprocessingtime;
		addValidField("hdBeginprocessingtime");
	}

	/**
	 * Get hdLastmodifiedtime
	 */
	@Column(name = "HD_LASTMODIFIEDTIME")
	public Date getHdLastmodifiedtime() {
		return hdLastmodifiedtime;
	}

	/**
	 * Set hdLastmodifiedtime
	 */
	public void setHdLastmodifiedtime(Date hdLastmodifiedtime) {
		this.hdLastmodifiedtime = hdLastmodifiedtime;
		addValidField("hdLastmodifiedtime");
	}

	/**
	 * Get hdInformation
	 */
	@Column(name = "HD_INFORMATION")
	public String getHdInformation() {
		return hdInformation;
	}

	/**
	 * Set hdInformation
	 */
	public void setHdInformation(String hdInformation) {
		this.hdInformation = hdInformation;
		addValidField("hdInformation");
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
	 * Get eiepSubstr9
	 */
	@Column(name = "EIEP_SUBSTR9")
	public String getEiepSubstr9() {
		return eiepSubstr9;
	}

	/**
	 * Set eiepSubstr9
	 */
	public void setEiepSubstr9(String eiepSubstr9) {
		this.eiepSubstr9 = eiepSubstr9;
		addValidField("eiepSubstr9");
	}

	/**
	 * Get eiepSubstr10
	 */
	@Column(name = "EIEP_SUBSTR10")
	public String getEiepSubstr10() {
		return eiepSubstr10;
	}

	/**
	 * Set eiepSubstr10
	 */
	public void setEiepSubstr10(String eiepSubstr10) {
		this.eiepSubstr10 = eiepSubstr10;
		addValidField("eiepSubstr10");
	}

	/**
	 * Get eiepSubstr11
	 */
	@Column(name = "EIEP_SUBSTR11")
	public String getEiepSubstr11() {
		return eiepSubstr11;
	}

	/**
	 * Set eiepSubstr11
	 */
	public void setEiepSubstr11(String eiepSubstr11) {
		this.eiepSubstr11 = eiepSubstr11;
		addValidField("eiepSubstr11");
	}

	/**
	 * Get eiepSubstr12
	 */
	@Column(name = "EIEP_SUBSTR12")
	public String getEiepSubstr12() {
		return eiepSubstr12;
	}

	/**
	 * Set eiepSubstr12
	 */
	public void setEiepSubstr12(String eiepSubstr12) {
		this.eiepSubstr12 = eiepSubstr12;
		addValidField("eiepSubstr12");
	}

	/**
	 * Get eiepSubstr13
	 */
	@Column(name = "EIEP_SUBSTR13")
	public String getEiepSubstr13() {
		return eiepSubstr13;
	}

	/**
	 * Set eiepSubstr13
	 */
	public void setEiepSubstr13(String eiepSubstr13) {
		this.eiepSubstr13 = eiepSubstr13;
		addValidField("eiepSubstr13");
	}

	/**
	 * Get eiepSubstr14
	 */
	@Column(name = "EIEP_SUBSTR14")
	public String getEiepSubstr14() {
		return eiepSubstr14;
	}

	/**
	 * Set eiepSubstr14
	 */
	public void setEiepSubstr14(String eiepSubstr14) {
		this.eiepSubstr14 = eiepSubstr14;
		addValidField("eiepSubstr14");
	}

	/**
	 * Get eiepSubstr15
	 */
	@Column(name = "EIEP_SUBSTR15")
	public String getEiepSubstr15() {
		return eiepSubstr15;
	}

	/**
	 * Set eiepSubstr15
	 */
	public void setEiepSubstr15(String eiepSubstr15) {
		this.eiepSubstr15 = eiepSubstr15;
		addValidField("eiepSubstr15");
	}

	/**
	 * Get eiepSubstr16
	 */
	@Column(name = "EIEP_SUBSTR16")
	public String getEiepSubstr16() {
		return eiepSubstr16;
	}

	/**
	 * Set eiepSubstr16
	 */
	public void setEiepSubstr16(String eiepSubstr16) {
		this.eiepSubstr16 = eiepSubstr16;
		addValidField("eiepSubstr16");
	}

	/**
	 * Get eiepSubstr17
	 */
	@Column(name = "EIEP_SUBSTR17")
	public String getEiepSubstr17() {
		return eiepSubstr17;
	}

	/**
	 * Set eiepSubstr17
	 */
	public void setEiepSubstr17(String eiepSubstr17) {
		this.eiepSubstr17 = eiepSubstr17;
		addValidField("eiepSubstr17");
	}

	/**
	 * Get eiepSubstr18
	 */
	@Column(name = "EIEP_SUBSTR18")
	public String getEiepSubstr18() {
		return eiepSubstr18;
	}

	/**
	 * Set eiepSubstr18
	 */
	public void setEiepSubstr18(String eiepSubstr18) {
		this.eiepSubstr18 = eiepSubstr18;
		addValidField("eiepSubstr18");
	}

	/**
	 * Get eiepSubstr19
	 */
	@Column(name = "EIEP_SUBSTR19")
	public String getEiepSubstr19() {
		return eiepSubstr19;
	}

	/**
	 * Set eiepSubstr19
	 */
	public void setEiepSubstr19(String eiepSubstr19) {
		this.eiepSubstr19 = eiepSubstr19;
		addValidField("eiepSubstr19");
	}

	/**
	 * Get eiepSubstr20
	 */
	@Column(name = "EIEP_SUBSTR20")
	public String getEiepSubstr20() {
		return eiepSubstr20;
	}

	/**
	 * Set eiepSubstr20
	 */
	public void setEiepSubstr20(String eiepSubstr20) {
		this.eiepSubstr20 = eiepSubstr20;
		addValidField("eiepSubstr20");
	}

	/**
	 * Get eiepRpStatus
	 */
	@Column(name = "EIEP_RP_STATUS")
	public String getEiepRpStatus() {
		return eiepRpStatus;
	}

	/**
	 * Set eiepRpStatus
	 */
	public void setEiepRpStatus(String eiepRpStatus) {
		this.eiepRpStatus = eiepRpStatus;
		addValidField("eiepRpStatus");
	}

	/**
	 * Get eiepEsusUserNameCn
	 */
	@Column(name = "EIEP_ESUS_USER_NAME_CN")
	public String getEiepEsusUserNameCn() {
		return eiepEsusUserNameCn;
	}

	/**
	 * Set eiepEsusUserNameCn
	 */
	public void setEiepEsusUserNameCn(String eiepEsusUserNameCn) {
		this.eiepEsusUserNameCn = eiepEsusUserNameCn;
		addValidField("eiepEsusUserNameCn");
	}

	/**
	 * Get eiepTime
	 */
	@Column(name = "EIEP_TIME")
	public String getEiepTime() {
		return eiepTime;
	}

	/**
	 * Set eiepTime
	 */
	public void setEiepTime(String eiepTime) {
		this.eiepTime = eiepTime;
		addValidField("eiepTime");
	}

}
