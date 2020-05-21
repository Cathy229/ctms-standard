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
 * Model class for EdiBookingFeesFeedback
 */
@Entity
@Table(name = "EDI_BOOKING_FEES_FEEDBACK")
public class EdiBookingFeesFeedbackModel extends BaseModel implements OperationLog {

	//edbeId
	private Long edbeId;
	//edbeEdbbId
	private Long edbeEdbbId;
	//edbeFeeCode
	private String edbeFeeCode;
	//edbeFreightChargeDesp
	private String edbeFreightChargeDesp;
	//edbePayTypeCode
	private String edbePayTypeCode;
	//edbePayableAtCode
	private String edbePayableAtCode;
	//edbePayableAt
	private String edbePayableAt;
	//edbePayeeCode
	private String edbePayeeCode;
	//edbePayeeName
	private String edbePayeeName;
	//edbeQuantity
	private Double edbeQuantity;
	//edbeCurrency
	private String edbeCurrency;
	//edbeRate
	private Double edbeRate;
	//edbeQuantityUnit
	private String edbeQuantityUnit;
	//edbeQuantityUnitName
	private String edbeQuantityUnitName;
	//edbeAmount
	private Double edbeAmount;
	//edbeSubstr1
	private String edbeSubstr1;
	//edbeSubstr2
	private String edbeSubstr2;
	//edbeSubstr3
	private String edbeSubstr3;
	//edbeSubstr4
	private String edbeSubstr4;
	//edbeSubstr5
	private String edbeSubstr5;
	//edbeSubstr6
	private String edbeSubstr6;
	//edbeSubstr7
	private String edbeSubstr7;
	//edbeSubstr8
	private String edbeSubstr8;
	//edbeSubdate1
	private Date edbeSubdate1;
	//edbeSubdate2
	private Date edbeSubdate2;
	//edbeSubdate3
	private Date edbeSubdate3;
	//edbeSubdate4
	private Date edbeSubdate4;
	//edbeSubnum1
	private Long edbeSubnum1;
	//edbeSubnum2
	private Long edbeSubnum2;
	//edbeSubnum3
	private Long edbeSubnum3;
	//edbeSubnum4
	private Long edbeSubnum4;
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
	 * Get edbeId
	 */
	@Column(name = "EDBE_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEdbeId() {
		return edbeId;
	}

	/**
	 * Set edbeId
	 */
	public void setEdbeId(Long edbeId) {
		this.edbeId = edbeId;
		addValidField("edbeId");
	}

	/**
	 * Get edbeEdbbId
	 */
	@Column(name = "EDBE_EDBB_ID")
	public Long getEdbeEdbbId() {
		return edbeEdbbId;
	}

	/**
	 * Set edbeEdbbId
	 */
	public void setEdbeEdbbId(Long edbeEdbbId) {
		this.edbeEdbbId = edbeEdbbId;
		addValidField("edbeEdbbId");
	}

	/**
	 * Get edbeFeeCode
	 */
	@Column(name = "EDBE_FEE_CODE")
	public String getEdbeFeeCode() {
		return edbeFeeCode;
	}

	/**
	 * Set edbeFeeCode
	 */
	public void setEdbeFeeCode(String edbeFeeCode) {
		this.edbeFeeCode = edbeFeeCode;
		addValidField("edbeFeeCode");
	}

	/**
	 * Get edbeFreightChargeDesp
	 */
	@Column(name = "EDBE_FREIGHT_CHARGE_DESP")
	public String getEdbeFreightChargeDesp() {
		return edbeFreightChargeDesp;
	}

	/**
	 * Set edbeFreightChargeDesp
	 */
	public void setEdbeFreightChargeDesp(String edbeFreightChargeDesp) {
		this.edbeFreightChargeDesp = edbeFreightChargeDesp;
		addValidField("edbeFreightChargeDesp");
	}

	/**
	 * Get edbePayTypeCode
	 */
	@Column(name = "EDBE_PAY_TYPE_CODE")
	public String getEdbePayTypeCode() {
		return edbePayTypeCode;
	}

	/**
	 * Set edbePayTypeCode
	 */
	public void setEdbePayTypeCode(String edbePayTypeCode) {
		this.edbePayTypeCode = edbePayTypeCode;
		addValidField("edbePayTypeCode");
	}

	/**
	 * Get edbePayableAtCode
	 */
	@Column(name = "EDBE_PAYABLE_AT_CODE")
	public String getEdbePayableAtCode() {
		return edbePayableAtCode;
	}

	/**
	 * Set edbePayableAtCode
	 */
	public void setEdbePayableAtCode(String edbePayableAtCode) {
		this.edbePayableAtCode = edbePayableAtCode;
		addValidField("edbePayableAtCode");
	}

	/**
	 * Get edbePayableAt
	 */
	@Column(name = "EDBE_PAYABLE_AT")
	public String getEdbePayableAt() {
		return edbePayableAt;
	}

	/**
	 * Set edbePayableAt
	 */
	public void setEdbePayableAt(String edbePayableAt) {
		this.edbePayableAt = edbePayableAt;
		addValidField("edbePayableAt");
	}

	/**
	 * Get edbePayeeCode
	 */
	@Column(name = "EDBE_PAYEE_CODE")
	public String getEdbePayeeCode() {
		return edbePayeeCode;
	}

	/**
	 * Set edbePayeeCode
	 */
	public void setEdbePayeeCode(String edbePayeeCode) {
		this.edbePayeeCode = edbePayeeCode;
		addValidField("edbePayeeCode");
	}

	/**
	 * Get edbePayeeName
	 */
	@Column(name = "EDBE_PAYEE_NAME")
	public String getEdbePayeeName() {
		return edbePayeeName;
	}

	/**
	 * Set edbePayeeName
	 */
	public void setEdbePayeeName(String edbePayeeName) {
		this.edbePayeeName = edbePayeeName;
		addValidField("edbePayeeName");
	}

	/**
	 * Get edbeQuantity
	 */
	@Column(name = "EDBE_QUANTITY")
	public Double getEdbeQuantity() {
		return edbeQuantity;
	}

	/**
	 * Set edbeQuantity
	 */
	public void setEdbeQuantity(Double edbeQuantity) {
		this.edbeQuantity = edbeQuantity;
		addValidField("edbeQuantity");
	}

	/**
	 * Get edbeCurrency
	 */
	@Column(name = "EDBE_CURRENCY")
	public String getEdbeCurrency() {
		return edbeCurrency;
	}

	/**
	 * Set edbeCurrency
	 */
	public void setEdbeCurrency(String edbeCurrency) {
		this.edbeCurrency = edbeCurrency;
		addValidField("edbeCurrency");
	}

	/**
	 * Get edbeRate
	 */
	@Column(name = "EDBE_RATE")
	public Double getEdbeRate() {
		return edbeRate;
	}

	/**
	 * Set edbeRate
	 */
	public void setEdbeRate(Double edbeRate) {
		this.edbeRate = edbeRate;
		addValidField("edbeRate");
	}

	/**
	 * Get edbeQuantityUnit
	 */
	@Column(name = "EDBE_QUANTITY_UNIT")
	public String getEdbeQuantityUnit() {
		return edbeQuantityUnit;
	}

	/**
	 * Set edbeQuantityUnit
	 */
	public void setEdbeQuantityUnit(String edbeQuantityUnit) {
		this.edbeQuantityUnit = edbeQuantityUnit;
		addValidField("edbeQuantityUnit");
	}

	/**
	 * Get edbeQuantityUnitName
	 */
	@Column(name = "EDBE_QUANTITY_UNIT_NAME")
	public String getEdbeQuantityUnitName() {
		return edbeQuantityUnitName;
	}

	/**
	 * Set edbeQuantityUnitName
	 */
	public void setEdbeQuantityUnitName(String edbeQuantityUnitName) {
		this.edbeQuantityUnitName = edbeQuantityUnitName;
		addValidField("edbeQuantityUnitName");
	}

	/**
	 * Get edbeAmount
	 */
	@Column(name = "EDBE_AMOUNT")
	public Double getEdbeAmount() {
		return edbeAmount;
	}

	/**
	 * Set edbeAmount
	 */
	public void setEdbeAmount(Double edbeAmount) {
		this.edbeAmount = edbeAmount;
		addValidField("edbeAmount");
	}

	/**
	 * Get edbeSubstr1
	 */
	@Column(name = "EDBE_SUBSTR1")
	public String getEdbeSubstr1() {
		return edbeSubstr1;
	}

	/**
	 * Set edbeSubstr1
	 */
	public void setEdbeSubstr1(String edbeSubstr1) {
		this.edbeSubstr1 = edbeSubstr1;
		addValidField("edbeSubstr1");
	}

	/**
	 * Get edbeSubstr2
	 */
	@Column(name = "EDBE_SUBSTR2")
	public String getEdbeSubstr2() {
		return edbeSubstr2;
	}

	/**
	 * Set edbeSubstr2
	 */
	public void setEdbeSubstr2(String edbeSubstr2) {
		this.edbeSubstr2 = edbeSubstr2;
		addValidField("edbeSubstr2");
	}

	/**
	 * Get edbeSubstr3
	 */
	@Column(name = "EDBE_SUBSTR3")
	public String getEdbeSubstr3() {
		return edbeSubstr3;
	}

	/**
	 * Set edbeSubstr3
	 */
	public void setEdbeSubstr3(String edbeSubstr3) {
		this.edbeSubstr3 = edbeSubstr3;
		addValidField("edbeSubstr3");
	}

	/**
	 * Get edbeSubstr4
	 */
	@Column(name = "EDBE_SUBSTR4")
	public String getEdbeSubstr4() {
		return edbeSubstr4;
	}

	/**
	 * Set edbeSubstr4
	 */
	public void setEdbeSubstr4(String edbeSubstr4) {
		this.edbeSubstr4 = edbeSubstr4;
		addValidField("edbeSubstr4");
	}

	/**
	 * Get edbeSubstr5
	 */
	@Column(name = "EDBE_SUBSTR5")
	public String getEdbeSubstr5() {
		return edbeSubstr5;
	}

	/**
	 * Set edbeSubstr5
	 */
	public void setEdbeSubstr5(String edbeSubstr5) {
		this.edbeSubstr5 = edbeSubstr5;
		addValidField("edbeSubstr5");
	}

	/**
	 * Get edbeSubstr6
	 */
	@Column(name = "EDBE_SUBSTR6")
	public String getEdbeSubstr6() {
		return edbeSubstr6;
	}

	/**
	 * Set edbeSubstr6
	 */
	public void setEdbeSubstr6(String edbeSubstr6) {
		this.edbeSubstr6 = edbeSubstr6;
		addValidField("edbeSubstr6");
	}

	/**
	 * Get edbeSubstr7
	 */
	@Column(name = "EDBE_SUBSTR7")
	public String getEdbeSubstr7() {
		return edbeSubstr7;
	}

	/**
	 * Set edbeSubstr7
	 */
	public void setEdbeSubstr7(String edbeSubstr7) {
		this.edbeSubstr7 = edbeSubstr7;
		addValidField("edbeSubstr7");
	}

	/**
	 * Get edbeSubstr8
	 */
	@Column(name = "EDBE_SUBSTR8")
	public String getEdbeSubstr8() {
		return edbeSubstr8;
	}

	/**
	 * Set edbeSubstr8
	 */
	public void setEdbeSubstr8(String edbeSubstr8) {
		this.edbeSubstr8 = edbeSubstr8;
		addValidField("edbeSubstr8");
	}

	/**
	 * Get edbeSubdate1
	 */
	@Column(name = "EDBE_SUBDATE1")
	public Date getEdbeSubdate1() {
		return edbeSubdate1;
	}

	/**
	 * Set edbeSubdate1
	 */
	public void setEdbeSubdate1(Date edbeSubdate1) {
		this.edbeSubdate1 = edbeSubdate1;
		addValidField("edbeSubdate1");
	}

	/**
	 * Get edbeSubdate2
	 */
	@Column(name = "EDBE_SUBDATE2")
	public Date getEdbeSubdate2() {
		return edbeSubdate2;
	}

	/**
	 * Set edbeSubdate2
	 */
	public void setEdbeSubdate2(Date edbeSubdate2) {
		this.edbeSubdate2 = edbeSubdate2;
		addValidField("edbeSubdate2");
	}

	/**
	 * Get edbeSubdate3
	 */
	@Column(name = "EDBE_SUBDATE3")
	public Date getEdbeSubdate3() {
		return edbeSubdate3;
	}

	/**
	 * Set edbeSubdate3
	 */
	public void setEdbeSubdate3(Date edbeSubdate3) {
		this.edbeSubdate3 = edbeSubdate3;
		addValidField("edbeSubdate3");
	}

	/**
	 * Get edbeSubdate4
	 */
	@Column(name = "EDBE_SUBDATE4")
	public Date getEdbeSubdate4() {
		return edbeSubdate4;
	}

	/**
	 * Set edbeSubdate4
	 */
	public void setEdbeSubdate4(Date edbeSubdate4) {
		this.edbeSubdate4 = edbeSubdate4;
		addValidField("edbeSubdate4");
	}

	/**
	 * Get edbeSubnum1
	 */
	@Column(name = "EDBE_SUBNUM1")
	public Long getEdbeSubnum1() {
		return edbeSubnum1;
	}

	/**
	 * Set edbeSubnum1
	 */
	public void setEdbeSubnum1(Long edbeSubnum1) {
		this.edbeSubnum1 = edbeSubnum1;
		addValidField("edbeSubnum1");
	}

	/**
	 * Get edbeSubnum2
	 */
	@Column(name = "EDBE_SUBNUM2")
	public Long getEdbeSubnum2() {
		return edbeSubnum2;
	}

	/**
	 * Set edbeSubnum2
	 */
	public void setEdbeSubnum2(Long edbeSubnum2) {
		this.edbeSubnum2 = edbeSubnum2;
		addValidField("edbeSubnum2");
	}

	/**
	 * Get edbeSubnum3
	 */
	@Column(name = "EDBE_SUBNUM3")
	public Long getEdbeSubnum3() {
		return edbeSubnum3;
	}

	/**
	 * Set edbeSubnum3
	 */
	public void setEdbeSubnum3(Long edbeSubnum3) {
		this.edbeSubnum3 = edbeSubnum3;
		addValidField("edbeSubnum3");
	}

	/**
	 * Get edbeSubnum4
	 */
	@Column(name = "EDBE_SUBNUM4")
	public Long getEdbeSubnum4() {
		return edbeSubnum4;
	}

	/**
	 * Set edbeSubnum4
	 */
	public void setEdbeSubnum4(Long edbeSubnum4) {
		this.edbeSubnum4 = edbeSubnum4;
		addValidField("edbeSubnum4");
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
