package com.sinotrans.oms.businessrequest.model;

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
 * Model class for EoEoom2Eoet
 */
@Entity
@Table(name = "EO_EOOM_2_EOET")
public class EoEoom2EoetModel extends BaseModel implements OperationLog {

	//eomtId
	private Long eomtId;
	//eomtEoetId
	private Long eomtEoetId;
	//eomtEoomId
	private Long eomtEoomId;
	//eomtToMrId
	private Long eomtToMrId;
	//eomtLineno
	private String eomtLineno;
	//eomtMaterialNo
	private String eomtMaterialNo;
	//eomtEbmaNameCn
	private String eomtEbmaNameCn;
	//eomtEbtpId
	private Long eomtEbtpId;
	//eomtModel
	private String eomtModel;
	//eomtPackage
	private String eomtPackage;
	//eomtPackageType
	private String eomtPackageType;
	//eomtHsCode
	private String eomtHsCode;
	//eomtTypeCode
	private String eomtTypeCode;
	//eomtMaterialStatus
	private String eomtMaterialStatus;
	//eomtDgClass
	private String eomtDgClass;
	//eomtEbmaUnNo
	private String eomtEbmaUnNo;
	//eomtDangerousCode
	private String eomtDangerousCode;
	//eomtEbmaIsTemperature
	private String eomtEbmaIsTemperature;
	//eomtTemperatureRange
	private String eomtTemperatureRange;
	//eomtProductDesc
	private String eomtProductDesc;
	//eomtBatchNo
	private String eomtBatchNo;
	//eomtTNumber
	private Long eomtTNumber;
	//eomtTNumberUnit
	private String eomtTNumberUnit;
	//eomtQuantity
	private Long eomtQuantity;
	//eomtQuantityUnit
	private String eomtQuantityUnit;
	//eomtWeight
	private Double eomtWeight;
	//eomtNetWeight
	private Double eomtNetWeight;
	//eomtVolume
	private Double eomtVolume;
	//eomtPrice
	private Long eomtPrice;
	//eomtRemark
	private String eomtRemark;
	//eomtSubstr1
	private String eomtSubstr1;
	//eomtSubstr2
	private String eomtSubstr2;
	//eomtSubstr3
	private String eomtSubstr3;
	//eomtSubstr4
	private String eomtSubstr4;
	//eomtSubstr5
	private String eomtSubstr5;
	//eomtSubstr6
	private String eomtSubstr6;
	//eomtSubstr7
	private String eomtSubstr7;
	//eomtSubstr8
	private String eomtSubstr8;
	//eomtSubdate1
	private Date eomtSubdate1;
	//eomtSubdate2
	private Date eomtSubdate2;
	//eomtSubdate3
	private Date eomtSubdate3;
	//eomtSubdate4
	private Date eomtSubdate4;
	//eomtSubnum1
	private Long eomtSubnum1;
	//eomtSubnum2
	private Long eomtSubnum2;
	//eomtSubnum3
	private Long eomtSubnum3;
	//eomtSubnum4
	private Long eomtSubnum4;
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
	//eomtEbmaId
	private Long eomtEbmaId;

	/**
	 * Get eomtId
	 */
	@Column(name = "EOMT_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEomtId() {
		return eomtId;
	}

	/**
	 * Set eomtId
	 */
	public void setEomtId(Long eomtId) {
		this.eomtId = eomtId;
		addValidField("eomtId");
	}

	/**
	 * Get eomtEoetId
	 */
	@Column(name = "EOMT_EOET_ID")
	public Long getEomtEoetId() {
		return eomtEoetId;
	}

	/**
	 * Set eomtEoetId
	 */
	public void setEomtEoetId(Long eomtEoetId) {
		this.eomtEoetId = eomtEoetId;
		addValidField("eomtEoetId");
	}

	/**
	 * Get eomtEoomId
	 */
	@Column(name = "EOMT_EOOM_ID")
	public Long getEomtEoomId() {
		return eomtEoomId;
	}

	/**
	 * Set eomtEoomId
	 */
	public void setEomtEoomId(Long eomtEoomId) {
		this.eomtEoomId = eomtEoomId;
		addValidField("eomtEoomId");
	}

	/**
	 * Get eomtToMrId
	 */
	@Column(name = "EOMT_TO_MR_ID")
	public Long getEomtToMrId() {
		return eomtToMrId;
	}

	/**
	 * Set eomtToMrId
	 */
	public void setEomtToMrId(Long eomtToMrId) {
		this.eomtToMrId = eomtToMrId;
		addValidField("eomtToMrId");
	}

	/**
	 * Get eomtLineno
	 */
	@Column(name = "EOMT_LINENO")
	public String getEomtLineno() {
		return eomtLineno;
	}

	/**
	 * Set eomtLineno
	 */
	public void setEomtLineno(String eomtLineno) {
		this.eomtLineno = eomtLineno;
		addValidField("eomtLineno");
	}

	/**
	 * Get eomtMaterialNo
	 */
	@Column(name = "EOMT_MATERIAL_NO")
	public String getEomtMaterialNo() {
		return eomtMaterialNo;
	}

	/**
	 * Set eomtMaterialNo
	 */
	public void setEomtMaterialNo(String eomtMaterialNo) {
		this.eomtMaterialNo = eomtMaterialNo;
		addValidField("eomtMaterialNo");
	}

	/**
	 * Get eomtEbmaNameCn
	 */
	@Column(name = "EOMT_EBMA_NAME_CN")
	public String getEomtEbmaNameCn() {
		return eomtEbmaNameCn;
	}

	/**
	 * Set eomtEbmaNameCn
	 */
	public void setEomtEbmaNameCn(String eomtEbmaNameCn) {
		this.eomtEbmaNameCn = eomtEbmaNameCn;
		addValidField("eomtEbmaNameCn");
	}

	/**
	 * Get eomtEbtpId
	 */
	@Column(name = "EOMT_EBTP_ID")
	public Long getEomtEbtpId() {
		return eomtEbtpId;
	}

	/**
	 * Set eomtEbtpId
	 */
	public void setEomtEbtpId(Long eomtEbtpId) {
		this.eomtEbtpId = eomtEbtpId;
		addValidField("eomtEbtpId");
	}

	/**
	 * Get eomtModel
	 */
	@Column(name = "EOMT_MODEL")
	public String getEomtModel() {
		return eomtModel;
	}

	/**
	 * Set eomtModel
	 */
	public void setEomtModel(String eomtModel) {
		this.eomtModel = eomtModel;
		addValidField("eomtModel");
	}

	/**
	 * Get eomtPackage
	 */
	@Column(name = "EOMT_PACKAGE")
	public String getEomtPackage() {
		return eomtPackage;
	}

	/**
	 * Set eomtPackage
	 */
	public void setEomtPackage(String eomtPackage) {
		this.eomtPackage = eomtPackage;
		addValidField("eomtPackage");
	}

	/**
	 * Get eomtPackageType
	 */
	@Column(name = "EOMT_PACKAGE_TYPE")
	public String getEomtPackageType() {
		return eomtPackageType;
	}

	/**
	 * Set eomtPackageType
	 */
	public void setEomtPackageType(String eomtPackageType) {
		this.eomtPackageType = eomtPackageType;
		addValidField("eomtPackageType");
	}

	/**
	 * Get eomtHsCode
	 */
	@Column(name = "EOMT_HS_CODE")
	public String getEomtHsCode() {
		return eomtHsCode;
	}

	/**
	 * Set eomtHsCode
	 */
	public void setEomtHsCode(String eomtHsCode) {
		this.eomtHsCode = eomtHsCode;
		addValidField("eomtHsCode");
	}

	/**
	 * Get eomtTypeCode
	 */
	@Column(name = "EOMT_TYPE_CODE")
	public String getEomtTypeCode() {
		return eomtTypeCode;
	}

	/**
	 * Set eomtTypeCode
	 */
	public void setEomtTypeCode(String eomtTypeCode) {
		this.eomtTypeCode = eomtTypeCode;
		addValidField("eomtTypeCode");
	}

	/**
	 * Get eomtMaterialStatus
	 */
	@Column(name = "EOMT_MATERIAL_STATUS")
	public String getEomtMaterialStatus() {
		return eomtMaterialStatus;
	}

	/**
	 * Set eomtMaterialStatus
	 */
	public void setEomtMaterialStatus(String eomtMaterialStatus) {
		this.eomtMaterialStatus = eomtMaterialStatus;
		addValidField("eomtMaterialStatus");
	}

	/**
	 * Get eomtDgClass
	 */
	@Column(name = "EOMT_DG_CLASS")
	public String getEomtDgClass() {
		return eomtDgClass;
	}

	/**
	 * Set eomtDgClass
	 */
	public void setEomtDgClass(String eomtDgClass) {
		this.eomtDgClass = eomtDgClass;
		addValidField("eomtDgClass");
	}

	/**
	 * Get eomtEbmaUnNo
	 */
	@Column(name = "EOMT_EBMA_UN_NO")
	public String getEomtEbmaUnNo() {
		return eomtEbmaUnNo;
	}

	/**
	 * Set eomtEbmaUnNo
	 */
	public void setEomtEbmaUnNo(String eomtEbmaUnNo) {
		this.eomtEbmaUnNo = eomtEbmaUnNo;
		addValidField("eomtEbmaUnNo");
	}

	/**
	 * Get eomtDangerousCode
	 */
	@Column(name = "EOMT_DANGEROUS_CODE")
	public String getEomtDangerousCode() {
		return eomtDangerousCode;
	}

	/**
	 * Set eomtDangerousCode
	 */
	public void setEomtDangerousCode(String eomtDangerousCode) {
		this.eomtDangerousCode = eomtDangerousCode;
		addValidField("eomtDangerousCode");
	}

	/**
	 * Get eomtEbmaIsTemperature
	 */
	@Column(name = "EOMT_EBMA_IS_TEMPERATURE")
	public String getEomtEbmaIsTemperature() {
		return eomtEbmaIsTemperature;
	}

	/**
	 * Set eomtEbmaIsTemperature
	 */
	public void setEomtEbmaIsTemperature(String eomtEbmaIsTemperature) {
		this.eomtEbmaIsTemperature = eomtEbmaIsTemperature;
		addValidField("eomtEbmaIsTemperature");
	}

	/**
	 * Get eomtTemperatureRange
	 */
	@Column(name = "EOMT_TEMPERATURE_RANGE")
	public String getEomtTemperatureRange() {
		return eomtTemperatureRange;
	}

	/**
	 * Set eomtTemperatureRange
	 */
	public void setEomtTemperatureRange(String eomtTemperatureRange) {
		this.eomtTemperatureRange = eomtTemperatureRange;
		addValidField("eomtTemperatureRange");
	}

	/**
	 * Get eomtProductDesc
	 */
	@Column(name = "EOMT_PRODUCT_DESC")
	public String getEomtProductDesc() {
		return eomtProductDesc;
	}

	/**
	 * Set eomtProductDesc
	 */
	public void setEomtProductDesc(String eomtProductDesc) {
		this.eomtProductDesc = eomtProductDesc;
		addValidField("eomtProductDesc");
	}

	/**
	 * Get eomtBatchNo
	 */
	@Column(name = "EOMT_BATCH_NO")
	public String getEomtBatchNo() {
		return eomtBatchNo;
	}

	/**
	 * Set eomtBatchNo
	 */
	public void setEomtBatchNo(String eomtBatchNo) {
		this.eomtBatchNo = eomtBatchNo;
		addValidField("eomtBatchNo");
	}

	/**
	 * Get eomtTNumber
	 */
	@Column(name = "EOMT_T_NUMBER")
	public Long getEomtTNumber() {
		return eomtTNumber;
	}

	/**
	 * Set eomtTNumber
	 */
	public void setEomtTNumber(Long eomtTNumber) {
		this.eomtTNumber = eomtTNumber;
		addValidField("eomtTNumber");
	}

	/**
	 * Get eomtTNumberUnit
	 */
	@Column(name = "EOMT_T_NUMBER_UNIT")
	public String getEomtTNumberUnit() {
		return eomtTNumberUnit;
	}

	/**
	 * Set eomtTNumberUnit
	 */
	public void setEomtTNumberUnit(String eomtTNumberUnit) {
		this.eomtTNumberUnit = eomtTNumberUnit;
		addValidField("eomtTNumberUnit");
	}

	/**
	 * Get eomtQuantity
	 */
	@Column(name = "EOMT_QUANTITY")
	public Long getEomtQuantity() {
		return eomtQuantity;
	}

	/**
	 * Set eomtQuantity
	 */
	public void setEomtQuantity(Long eomtQuantity) {
		this.eomtQuantity = eomtQuantity;
		addValidField("eomtQuantity");
	}

	/**
	 * Get eomtQuantityUnit
	 */
	@Column(name = "EOMT_QUANTITY_UNIT")
	public String getEomtQuantityUnit() {
		return eomtQuantityUnit;
	}

	/**
	 * Set eomtQuantityUnit
	 */
	public void setEomtQuantityUnit(String eomtQuantityUnit) {
		this.eomtQuantityUnit = eomtQuantityUnit;
		addValidField("eomtQuantityUnit");
	}

	/**
	 * Get eomtWeight
	 */
	@Column(name = "EOMT_WEIGHT")
	public Double getEomtWeight() {
		return eomtWeight;
	}

	/**
	 * Set eomtWeight
	 */
	public void setEomtWeight(Double eomtWeight) {
		this.eomtWeight = eomtWeight;
		addValidField("eomtWeight");
	}

	/**
	 * Get eomtNetWeight
	 */
	@Column(name = "EOMT_NET_WEIGHT")
	public Double getEomtNetWeight() {
		return eomtNetWeight;
	}

	/**
	 * Set eomtNetWeight
	 */
	public void setEomtNetWeight(Double eomtNetWeight) {
		this.eomtNetWeight = eomtNetWeight;
		addValidField("eomtNetWeight");
	}

	/**
	 * Get eomtVolume
	 */
	@Column(name = "EOMT_VOLUME")
	public Double getEomtVolume() {
		return eomtVolume;
	}

	/**
	 * Set eomtVolume
	 */
	public void setEomtVolume(Double eomtVolume) {
		this.eomtVolume = eomtVolume;
		addValidField("eomtVolume");
	}

	/**
	 * Get eomtPrice
	 */
	@Column(name = "EOMT_PRICE")
	public Long getEomtPrice() {
		return eomtPrice;
	}

	/**
	 * Set eomtPrice
	 */
	public void setEomtPrice(Long eomtPrice) {
		this.eomtPrice = eomtPrice;
		addValidField("eomtPrice");
	}

	/**
	 * Get eomtRemark
	 */
	@Column(name = "EOMT_REMARK")
	public String getEomtRemark() {
		return eomtRemark;
	}

	/**
	 * Set eomtRemark
	 */
	public void setEomtRemark(String eomtRemark) {
		this.eomtRemark = eomtRemark;
		addValidField("eomtRemark");
	}

	/**
	 * Get eomtSubstr1
	 */
	@Column(name = "EOMT_SUBSTR1")
	public String getEomtSubstr1() {
		return eomtSubstr1;
	}

	/**
	 * Set eomtSubstr1
	 */
	public void setEomtSubstr1(String eomtSubstr1) {
		this.eomtSubstr1 = eomtSubstr1;
		addValidField("eomtSubstr1");
	}

	/**
	 * Get eomtSubstr2
	 */
	@Column(name = "EOMT_SUBSTR2")
	public String getEomtSubstr2() {
		return eomtSubstr2;
	}

	/**
	 * Set eomtSubstr2
	 */
	public void setEomtSubstr2(String eomtSubstr2) {
		this.eomtSubstr2 = eomtSubstr2;
		addValidField("eomtSubstr2");
	}

	/**
	 * Get eomtSubstr3
	 */
	@Column(name = "EOMT_SUBSTR3")
	public String getEomtSubstr3() {
		return eomtSubstr3;
	}

	/**
	 * Set eomtSubstr3
	 */
	public void setEomtSubstr3(String eomtSubstr3) {
		this.eomtSubstr3 = eomtSubstr3;
		addValidField("eomtSubstr3");
	}

	/**
	 * Get eomtSubstr4
	 */
	@Column(name = "EOMT_SUBSTR4")
	public String getEomtSubstr4() {
		return eomtSubstr4;
	}

	/**
	 * Set eomtSubstr4
	 */
	public void setEomtSubstr4(String eomtSubstr4) {
		this.eomtSubstr4 = eomtSubstr4;
		addValidField("eomtSubstr4");
	}

	/**
	 * Get eomtSubstr5
	 */
	@Column(name = "EOMT_SUBSTR5")
	public String getEomtSubstr5() {
		return eomtSubstr5;
	}

	/**
	 * Set eomtSubstr5
	 */
	public void setEomtSubstr5(String eomtSubstr5) {
		this.eomtSubstr5 = eomtSubstr5;
		addValidField("eomtSubstr5");
	}

	/**
	 * Get eomtSubstr6
	 */
	@Column(name = "EOMT_SUBSTR6")
	public String getEomtSubstr6() {
		return eomtSubstr6;
	}

	/**
	 * Set eomtSubstr6
	 */
	public void setEomtSubstr6(String eomtSubstr6) {
		this.eomtSubstr6 = eomtSubstr6;
		addValidField("eomtSubstr6");
	}

	/**
	 * Get eomtSubstr7
	 */
	@Column(name = "EOMT_SUBSTR7")
	public String getEomtSubstr7() {
		return eomtSubstr7;
	}

	/**
	 * Set eomtSubstr7
	 */
	public void setEomtSubstr7(String eomtSubstr7) {
		this.eomtSubstr7 = eomtSubstr7;
		addValidField("eomtSubstr7");
	}

	/**
	 * Get eomtSubstr8
	 */
	@Column(name = "EOMT_SUBSTR8")
	public String getEomtSubstr8() {
		return eomtSubstr8;
	}

	/**
	 * Set eomtSubstr8
	 */
	public void setEomtSubstr8(String eomtSubstr8) {
		this.eomtSubstr8 = eomtSubstr8;
		addValidField("eomtSubstr8");
	}

	/**
	 * Get eomtSubdate1
	 */
	@Column(name = "EOMT_SUBDATE1")
	public Date getEomtSubdate1() {
		return eomtSubdate1;
	}

	/**
	 * Set eomtSubdate1
	 */
	public void setEomtSubdate1(Date eomtSubdate1) {
		this.eomtSubdate1 = eomtSubdate1;
		addValidField("eomtSubdate1");
	}

	/**
	 * Get eomtSubdate2
	 */
	@Column(name = "EOMT_SUBDATE2")
	public Date getEomtSubdate2() {
		return eomtSubdate2;
	}

	/**
	 * Set eomtSubdate2
	 */
	public void setEomtSubdate2(Date eomtSubdate2) {
		this.eomtSubdate2 = eomtSubdate2;
		addValidField("eomtSubdate2");
	}

	/**
	 * Get eomtSubdate3
	 */
	@Column(name = "EOMT_SUBDATE3")
	public Date getEomtSubdate3() {
		return eomtSubdate3;
	}

	/**
	 * Set eomtSubdate3
	 */
	public void setEomtSubdate3(Date eomtSubdate3) {
		this.eomtSubdate3 = eomtSubdate3;
		addValidField("eomtSubdate3");
	}

	/**
	 * Get eomtSubdate4
	 */
	@Column(name = "EOMT_SUBDATE4")
	public Date getEomtSubdate4() {
		return eomtSubdate4;
	}

	/**
	 * Set eomtSubdate4
	 */
	public void setEomtSubdate4(Date eomtSubdate4) {
		this.eomtSubdate4 = eomtSubdate4;
		addValidField("eomtSubdate4");
	}

	/**
	 * Get eomtSubnum1
	 */
	@Column(name = "EOMT_SUBNUM1")
	public Long getEomtSubnum1() {
		return eomtSubnum1;
	}

	/**
	 * Set eomtSubnum1
	 */
	public void setEomtSubnum1(Long eomtSubnum1) {
		this.eomtSubnum1 = eomtSubnum1;
		addValidField("eomtSubnum1");
	}

	/**
	 * Get eomtSubnum2
	 */
	@Column(name = "EOMT_SUBNUM2")
	public Long getEomtSubnum2() {
		return eomtSubnum2;
	}

	/**
	 * Set eomtSubnum2
	 */
	public void setEomtSubnum2(Long eomtSubnum2) {
		this.eomtSubnum2 = eomtSubnum2;
		addValidField("eomtSubnum2");
	}

	/**
	 * Get eomtSubnum3
	 */
	@Column(name = "EOMT_SUBNUM3")
	public Long getEomtSubnum3() {
		return eomtSubnum3;
	}

	/**
	 * Set eomtSubnum3
	 */
	public void setEomtSubnum3(Long eomtSubnum3) {
		this.eomtSubnum3 = eomtSubnum3;
		addValidField("eomtSubnum3");
	}

	/**
	 * Get eomtSubnum4
	 */
	@Column(name = "EOMT_SUBNUM4")
	public Long getEomtSubnum4() {
		return eomtSubnum4;
	}

	/**
	 * Set eomtSubnum4
	 */
	public void setEomtSubnum4(Long eomtSubnum4) {
		this.eomtSubnum4 = eomtSubnum4;
		addValidField("eomtSubnum4");
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
	 * Get eomtEbmaId
	 */
	@Column(name = "EOMT_EBMA_ID")
	public Long getEomtEbmaId() {
		return eomtEbmaId;
	}

	/**
	 * Set eomtEbmaId
	 */
	public void setEomtEbmaId(Long eomtEbmaId) {
		this.eomtEbmaId = eomtEbmaId;
		addValidField("eomtEbmaId");
	}

}
