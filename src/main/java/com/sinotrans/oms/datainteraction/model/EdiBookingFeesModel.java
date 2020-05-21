package com.sinotrans.oms.datainteraction.model;

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
 * Model class for EdiBookingFees
 */
@Entity
@Table(name = "EDI_BOOKING_FEES")
public class EdiBookingFeesModel extends BaseModel implements OperationLog {

	//edbfId
	private Long edbfId;
	//edbfEdboId
	private Long edbfEdboId;
	//edbfFeeCode
	private String edbfFeeCode;
	//edbfFreightChargeDesp
	private String edbfFreightChargeDesp;
	//edbfPayTypeCode
	private String edbfPayTypeCode;
	//edbfPayableAtCode
	private String edbfPayableAtCode;
	//edbfPayableAt
	private String edbfPayableAt;
	//edbfPayeeCode
	private String edbfPayeeCode;
	//edbfPayeeName
	private String edbfPayeeName;
	//edbfQuantity
	private Double edbfQuantity;
	//edbfCurrency
	private String edbfCurrency;
	//edbfRate
	private Double edbfRate;
	//edbfQuantityUnit
	private String edbfQuantityUnit;
	//edbfQuantityUnitName
	private String edbfQuantityUnitName;
	//edbfAmount
	private Double edbfAmount;
	//edbfSubstr1
	private String edbfSubstr1;
	//edbfSubstr2
	private String edbfSubstr2;
	//edbfSubstr3
	private String edbfSubstr3;
	//edbfSubstr4
	private String edbfSubstr4;
	//edbfSubstr5
	private String edbfSubstr5;
	//edbfSubstr6
	private String edbfSubstr6;
	//edbfSubstr7
	private String edbfSubstr7;
	//edbfSubstr8
	private String edbfSubstr8;
	//edbfSubdate1
	private Date edbfSubdate1;
	//edbfSubdate2
	private Date edbfSubdate2;
	//edbfSubdate3
	private Date edbfSubdate3;
	//edbfSubdate4
	private Date edbfSubdate4;
	//edbfSubnum1
	private Long edbfSubnum1;
	//edbfSubnum2
	private Long edbfSubnum2;
	//edbfSubnum3
	private Long edbfSubnum3;
	//edbfSubnum4
	private Long edbfSubnum4;
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
	 * Get edbfId
	 */
	@Column(name = "EDBF_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEdbfId() {
		return edbfId;
	}

	/**
	 * Set edbfId
	 */
	public void setEdbfId(Long edbfId) {
		this.edbfId = edbfId;
		addValidField("edbfId");
	}

	/**
	 * Get edbfEdboId
	 */
	@Column(name = "EDBF_EDBO_ID")
	public Long getEdbfEdboId() {
		return edbfEdboId;
	}

	/**
	 * Set edbfEdboId
	 */
	public void setEdbfEdboId(Long edbfEdboId) {
		this.edbfEdboId = edbfEdboId;
		addValidField("edbfEdboId");
	}

	/**
	 * Get edbfFeeCode
	 */
	@Column(name = "EDBF_FEE_CODE")
	public String getEdbfFeeCode() {
		return edbfFeeCode;
	}

	/**
	 * Set edbfFeeCode
	 */
	public void setEdbfFeeCode(String edbfFeeCode) {
		this.edbfFeeCode = edbfFeeCode;
		addValidField("edbfFeeCode");
	}

	/**
	 * Get edbfFreightChargeDesp
	 */
	@Column(name = "EDBF_FREIGHT_CHARGE_DESP")
	public String getEdbfFreightChargeDesp() {
		return edbfFreightChargeDesp;
	}

	/**
	 * Set edbfFreightChargeDesp
	 */
	public void setEdbfFreightChargeDesp(String edbfFreightChargeDesp) {
		this.edbfFreightChargeDesp = edbfFreightChargeDesp;
		addValidField("edbfFreightChargeDesp");
	}

	/**
	 * Get edbfPayTypeCode
	 */
	@Column(name = "EDBF_PAY_TYPE_CODE")
	public String getEdbfPayTypeCode() {
		return edbfPayTypeCode;
	}

	/**
	 * Set edbfPayTypeCode
	 */
	public void setEdbfPayTypeCode(String edbfPayTypeCode) {
		this.edbfPayTypeCode = edbfPayTypeCode;
		addValidField("edbfPayTypeCode");
	}

	/**
	 * Get edbfPayableAtCode
	 */
	@Column(name = "EDBF_PAYABLE_AT_CODE")
	public String getEdbfPayableAtCode() {
		return edbfPayableAtCode;
	}

	/**
	 * Set edbfPayableAtCode
	 */
	public void setEdbfPayableAtCode(String edbfPayableAtCode) {
		this.edbfPayableAtCode = edbfPayableAtCode;
		addValidField("edbfPayableAtCode");
	}

	/**
	 * Get edbfPayableAt
	 */
	@Column(name = "EDBF_PAYABLE_AT")
	public String getEdbfPayableAt() {
		return edbfPayableAt;
	}

	/**
	 * Set edbfPayableAt
	 */
	public void setEdbfPayableAt(String edbfPayableAt) {
		this.edbfPayableAt = edbfPayableAt;
		addValidField("edbfPayableAt");
	}

	/**
	 * Get edbfPayeeCode
	 */
	@Column(name = "EDBF_PAYEE_CODE")
	public String getEdbfPayeeCode() {
		return edbfPayeeCode;
	}

	/**
	 * Set edbfPayeeCode
	 */
	public void setEdbfPayeeCode(String edbfPayeeCode) {
		this.edbfPayeeCode = edbfPayeeCode;
		addValidField("edbfPayeeCode");
	}

	/**
	 * Get edbfPayeeName
	 */
	@Column(name = "EDBF_PAYEE_NAME")
	public String getEdbfPayeeName() {
		return edbfPayeeName;
	}

	/**
	 * Set edbfPayeeName
	 */
	public void setEdbfPayeeName(String edbfPayeeName) {
		this.edbfPayeeName = edbfPayeeName;
		addValidField("edbfPayeeName");
	}

	/**
	 * Get edbfQuantity
	 */
	@Column(name = "EDBF_QUANTITY")
	public Double getEdbfQuantity() {
		return edbfQuantity;
	}

	/**
	 * Set edbfQuantity
	 */
	public void setEdbfQuantity(Double edbfQuantity) {
		this.edbfQuantity = edbfQuantity;
		addValidField("edbfQuantity");
	}

	/**
	 * Get edbfCurrency
	 */
	@Column(name = "EDBF_CURRENCY")
	public String getEdbfCurrency() {
		return edbfCurrency;
	}

	/**
	 * Set edbfCurrency
	 */
	public void setEdbfCurrency(String edbfCurrency) {
		this.edbfCurrency = edbfCurrency;
		addValidField("edbfCurrency");
	}

	/**
	 * Get edbfRate
	 */
	@Column(name = "EDBF_RATE")
	public Double getEdbfRate() {
		return edbfRate;
	}

	/**
	 * Set edbfRate
	 */
	public void setEdbfRate(Double edbfRate) {
		this.edbfRate = edbfRate;
		addValidField("edbfRate");
	}

	/**
	 * Get edbfQuantityUnit
	 */
	@Column(name = "EDBF_QUANTITY_UNIT")
	public String getEdbfQuantityUnit() {
		return edbfQuantityUnit;
	}

	/**
	 * Set edbfQuantityUnit
	 */
	public void setEdbfQuantityUnit(String edbfQuantityUnit) {
		this.edbfQuantityUnit = edbfQuantityUnit;
		addValidField("edbfQuantityUnit");
	}

	/**
	 * Get edbfQuantityUnitName
	 */
	@Column(name = "EDBF_QUANTITY_UNIT_NAME")
	public String getEdbfQuantityUnitName() {
		return edbfQuantityUnitName;
	}

	/**
	 * Set edbfQuantityUnitName
	 */
	public void setEdbfQuantityUnitName(String edbfQuantityUnitName) {
		this.edbfQuantityUnitName = edbfQuantityUnitName;
		addValidField("edbfQuantityUnitName");
	}

	/**
	 * Get edbfAmount
	 */
	@Column(name = "EDBF_AMOUNT")
	public Double getEdbfAmount() {
		return edbfAmount;
	}

	/**
	 * Set edbfAmount
	 */
	public void setEdbfAmount(Double edbfAmount) {
		this.edbfAmount = edbfAmount;
		addValidField("edbfAmount");
	}

	/**
	 * Get edbfSubstr1
	 */
	@Column(name = "EDBF_SUBSTR1")
	public String getEdbfSubstr1() {
		return edbfSubstr1;
	}

	/**
	 * Set edbfSubstr1
	 */
	public void setEdbfSubstr1(String edbfSubstr1) {
		this.edbfSubstr1 = edbfSubstr1;
		addValidField("edbfSubstr1");
	}

	/**
	 * Get edbfSubstr2
	 */
	@Column(name = "EDBF_SUBSTR2")
	public String getEdbfSubstr2() {
		return edbfSubstr2;
	}

	/**
	 * Set edbfSubstr2
	 */
	public void setEdbfSubstr2(String edbfSubstr2) {
		this.edbfSubstr2 = edbfSubstr2;
		addValidField("edbfSubstr2");
	}

	/**
	 * Get edbfSubstr3
	 */
	@Column(name = "EDBF_SUBSTR3")
	public String getEdbfSubstr3() {
		return edbfSubstr3;
	}

	/**
	 * Set edbfSubstr3
	 */
	public void setEdbfSubstr3(String edbfSubstr3) {
		this.edbfSubstr3 = edbfSubstr3;
		addValidField("edbfSubstr3");
	}

	/**
	 * Get edbfSubstr4
	 */
	@Column(name = "EDBF_SUBSTR4")
	public String getEdbfSubstr4() {
		return edbfSubstr4;
	}

	/**
	 * Set edbfSubstr4
	 */
	public void setEdbfSubstr4(String edbfSubstr4) {
		this.edbfSubstr4 = edbfSubstr4;
		addValidField("edbfSubstr4");
	}

	/**
	 * Get edbfSubstr5
	 */
	@Column(name = "EDBF_SUBSTR5")
	public String getEdbfSubstr5() {
		return edbfSubstr5;
	}

	/**
	 * Set edbfSubstr5
	 */
	public void setEdbfSubstr5(String edbfSubstr5) {
		this.edbfSubstr5 = edbfSubstr5;
		addValidField("edbfSubstr5");
	}

	/**
	 * Get edbfSubstr6
	 */
	@Column(name = "EDBF_SUBSTR6")
	public String getEdbfSubstr6() {
		return edbfSubstr6;
	}

	/**
	 * Set edbfSubstr6
	 */
	public void setEdbfSubstr6(String edbfSubstr6) {
		this.edbfSubstr6 = edbfSubstr6;
		addValidField("edbfSubstr6");
	}

	/**
	 * Get edbfSubstr7
	 */
	@Column(name = "EDBF_SUBSTR7")
	public String getEdbfSubstr7() {
		return edbfSubstr7;
	}

	/**
	 * Set edbfSubstr7
	 */
	public void setEdbfSubstr7(String edbfSubstr7) {
		this.edbfSubstr7 = edbfSubstr7;
		addValidField("edbfSubstr7");
	}

	/**
	 * Get edbfSubstr8
	 */
	@Column(name = "EDBF_SUBSTR8")
	public String getEdbfSubstr8() {
		return edbfSubstr8;
	}

	/**
	 * Set edbfSubstr8
	 */
	public void setEdbfSubstr8(String edbfSubstr8) {
		this.edbfSubstr8 = edbfSubstr8;
		addValidField("edbfSubstr8");
	}

	/**
	 * Get edbfSubdate1
	 */
	@Column(name = "EDBF_SUBDATE1")
	public Date getEdbfSubdate1() {
		return edbfSubdate1;
	}

	/**
	 * Set edbfSubdate1
	 */
	public void setEdbfSubdate1(Date edbfSubdate1) {
		this.edbfSubdate1 = edbfSubdate1;
		addValidField("edbfSubdate1");
	}

	/**
	 * Get edbfSubdate2
	 */
	@Column(name = "EDBF_SUBDATE2")
	public Date getEdbfSubdate2() {
		return edbfSubdate2;
	}

	/**
	 * Set edbfSubdate2
	 */
	public void setEdbfSubdate2(Date edbfSubdate2) {
		this.edbfSubdate2 = edbfSubdate2;
		addValidField("edbfSubdate2");
	}

	/**
	 * Get edbfSubdate3
	 */
	@Column(name = "EDBF_SUBDATE3")
	public Date getEdbfSubdate3() {
		return edbfSubdate3;
	}

	/**
	 * Set edbfSubdate3
	 */
	public void setEdbfSubdate3(Date edbfSubdate3) {
		this.edbfSubdate3 = edbfSubdate3;
		addValidField("edbfSubdate3");
	}

	/**
	 * Get edbfSubdate4
	 */
	@Column(name = "EDBF_SUBDATE4")
	public Date getEdbfSubdate4() {
		return edbfSubdate4;
	}

	/**
	 * Set edbfSubdate4
	 */
	public void setEdbfSubdate4(Date edbfSubdate4) {
		this.edbfSubdate4 = edbfSubdate4;
		addValidField("edbfSubdate4");
	}

	/**
	 * Get edbfSubnum1
	 */
	@Column(name = "EDBF_SUBNUM1")
	public Long getEdbfSubnum1() {
		return edbfSubnum1;
	}

	/**
	 * Set edbfSubnum1
	 */
	public void setEdbfSubnum1(Long edbfSubnum1) {
		this.edbfSubnum1 = edbfSubnum1;
		addValidField("edbfSubnum1");
	}

	/**
	 * Get edbfSubnum2
	 */
	@Column(name = "EDBF_SUBNUM2")
	public Long getEdbfSubnum2() {
		return edbfSubnum2;
	}

	/**
	 * Set edbfSubnum2
	 */
	public void setEdbfSubnum2(Long edbfSubnum2) {
		this.edbfSubnum2 = edbfSubnum2;
		addValidField("edbfSubnum2");
	}

	/**
	 * Get edbfSubnum3
	 */
	@Column(name = "EDBF_SUBNUM3")
	public Long getEdbfSubnum3() {
		return edbfSubnum3;
	}

	/**
	 * Set edbfSubnum3
	 */
	public void setEdbfSubnum3(Long edbfSubnum3) {
		this.edbfSubnum3 = edbfSubnum3;
		addValidField("edbfSubnum3");
	}

	/**
	 * Get edbfSubnum4
	 */
	@Column(name = "EDBF_SUBNUM4")
	public Long getEdbfSubnum4() {
		return edbfSubnum4;
	}

	/**
	 * Set edbfSubnum4
	 */
	public void setEdbfSubnum4(Long edbfSubnum4) {
		this.edbfSubnum4 = edbfSubnum4;
		addValidField("edbfSubnum4");
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
