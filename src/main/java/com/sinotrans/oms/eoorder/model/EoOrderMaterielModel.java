package com.sinotrans.oms.eoorder.model;

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
 * Model class for EoOrderMateriel
 */
@Entity
@Table(name = "EO_ORDER_MATERIEL")
public class EoOrderMaterielModel extends BaseModel implements OperationLog {

	//eoomId
	private Long eoomId;
	//eoomEocmId
	private Long eoomEocmId;
	//eoomEoorId
	private Long eoomEoorId;
	//eoomEbmaId
	private Long eoomEbmaId;
	//eoomMaterialNo
	private String eoomMaterialNo;
	//eoomEbmaNameCn
	private String eoomEbmaNameCn;
	//eoomEbtpId
	private Long eoomEbtpId;
	//eoomEbtpModel
	private String eoomEbtpModel;
	//eoomEbtpPackage
	private String eoomEbtpPackage;
	//eoomEbtpPackageType
	private String eoomEbtpPackageType;
	//eoomType
	private String eoomType;
	//eoomEbmaIsTemperature
	private String eoomEbmaIsTemperature;
	//eoomEbmaFeatures
	private String eoomEbmaFeatures;
	//eoomEbmaDgClass
	private String eoomEbmaDgClass;
	//eoomStatus
	private String eoomStatus;
	//eoomNumber
	private Long eoomNumber;
	//eoomNumberUnit
	private String eoomNumberUnit;
	//eoomQuantity
	private Double eoomQuantity;
	//eoomQuantityUnit
	private String eoomQuantityUnit;
	//eoomBatch
	private String eoomBatch;
	//eoomEbmaDgCode
	private String eoomEbmaDgCode;
	//eoomEbmaUnNo
	private String eoomEbmaUnNo;
	//eoomGrossWeight
	private Double eoomGrossWeight;
	//eoomNetWeight
	private Double eoomNetWeight;
	//eoomVolume
	private Double eoomVolume;
	//eoomPrice
	private Long eoomPrice;
	//eoomSubstr1
	private String eoomSubstr1;
	//eoomSubstr2
	private String eoomSubstr2;
	//eoomSubstr3
	private String eoomSubstr3;
	//eoomSubstr4
	private String eoomSubstr4;
	//eoomSubstr5
	private String eoomSubstr5;
	//eoomSubstr6
	private String eoomSubstr6;
	//eoomSubstr8
	private String eoomSubstr8;
	//eoomSubstr7
	private String eoomSubstr7;
	//eoomSubdate1
	private Date eoomSubdate1;
	//eoomSubdate2
	private Date eoomSubdate2;
	//eoomSubdate5
	private Date eoomSubdate5;
	//eoomSubdate4
	private Date eoomSubdate4;
	//eoomSubdate3
	private Date eoomSubdate3;
	//eoomSubnum3
	private Long eoomSubnum3;
	//eoomSubnum2
	private Long eoomSubnum2;
	//eoomSubnum1
	private Long eoomSubnum1;
	//creator
	private String creator;
	//createTime
	private Date createTime;
	//modifier
	private String modifier;
	//modifyTime
	private Date modifyTime;
	//recVer
	private Long recVer;
	//eoomLineno
	private String eoomLineno;
	//eoomSubstr9
	private String eoomSubstr9;
	//eoomSubstr10
	private String eoomSubstr10;
	//eoomSubstr11
	private String eoomSubstr11;
	//eoomSubstr12
	private String eoomSubstr12;
	//eoomSubstr13
	private String eoomSubstr13;
	//eoomSubstr14
	private String eoomSubstr14;
	//eoomSubstr15
	private String eoomSubstr15;
	//eoomSubstr16
	private String eoomSubstr16;
	//eoomSubstr17
	private String eoomSubstr17;
	//eoomSubstr18
	private String eoomSubstr18;
	//eoomSubstr19
	private String eoomSubstr19;
	//eoomSubstr20
	private String eoomSubstr20;
	//eoomSubstr21
	private String eoomSubstr21;
	//eoomSubstr22
	private String eoomSubstr22;
	//eoomSubstr23
	private String eoomSubstr23;
	//eoomSubstr24
	private String eoomSubstr24;
	//eoomSubstr25
	private String eoomSubstr25;
	//eomiSubdate5
	private Date eomiSubdate5;
	//eoomSubdate6
	private Date eoomSubdate6;
	//eoomSubdate7
	private Date eoomSubdate7;
	//eoomSubdate8
	private Date eoomSubdate8;
	//eoomSubdate9
	private Date eoomSubdate9;
	//eoomSubdate10
	private Date eoomSubdate10;
	//eoomSubnum5
	private Long eoomSubnum5;
	//eoomSubnum6
	private Long eoomSubnum6;
	//eoomSubnum4
	private Long eoomSubnum4;
	//eoomTEbtpId
	private Long eoomTEbtpId;
	//eoomTEbtpModel
	private String eoomTEbtpModel;
	//eoomTEbtpPackage
	private String eoomTEbtpPackage;
	//eoomTEbtpPackageType
	private String eoomTEbtpPackageType;
	//eoomTNumberUnit
	private String eoomTNumberUnit;
	//eoomTNumber
	private Long eoomTNumber;
	//eoomTNumberBulk
	private Long eoomTNumberBulk;
	//eoomHscode
	private String eoomHscode;
	//eoomMaterialDesc
	private String eoomMaterialDesc;
	//eoomMark
	private String eoomMark;
	//eoomTemperatureUnit
	private String eoomTemperatureUnit;
	//eoomEbmaTemperatureSetting
	private Double eoomEbmaTemperatureSetting;
	//eoomEbmaMinTemperature
	private Double eoomEbmaMinTemperature;
	//eoomEbmaMaxTemperature
	private Double eoomEbmaMaxTemperature;
	//eoomVent
	private String eoomVent;
	//eoomHumidity
	private String eoomHumidity;
	//eoomIsDangerousFlag
	private String eoomIsDangerousFlag;
	//eoomEbmaDgSubclass
	private String eoomEbmaDgSubclass;
	//eoomDangerProperty
	private String eoomDangerProperty;
	//eoomDangerPackage
	private String eoomDangerPackage;
	//eoomDangerousPage
	private String eoomDangerousPage;
	//eoomDangerousLabel
	private String eoomDangerousLabel;
	//eoomDangerousFlashPoint
	private String eoomDangerousFlashPoint;
	//eoomDangerousEmsNo
	private String eoomDangerousEmsNo;
	//eoomMfagNo
	private String eoomMfagNo;
	//eoomMarinePollutantFlag
	private String eoomMarinePollutantFlag;
	//eoomIsBig
	private String eoomIsBig;
	//eoomLength
	private Double eoomLength;
	//eoomWidth
	private Double eoomWidth;
	//eoomHigh
	private Double eoomHigh;
	//eoomOverLengthFront
	private Double eoomOverLengthFront;
	//eoomOverLengthBack
	private Double eoomOverLengthBack;
	//eoomOverWidthLeft
	private Double eoomOverWidthLeft;
	//eoomOverWidthRight
	private Double eoomOverWidthRight;
	//eoomOverHeight
	private Double eoomOverHeight;
	//eoomEbmaNameEn
	private String eoomEbmaNameEn;
	//eoomLong
	private String eoomLong;
	//eoomWide
	private String eoomWide;
	//eoomTall
	private String eoomTall;

	/**
	 * Get eoomId
	 */
	@Column(name = "EOOM_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoomId() {
		return eoomId;
	}

	/**
	 * Set eoomId
	 */
	public void setEoomId(Long eoomId) {
		this.eoomId = eoomId;
		addValidField("eoomId");
	}

	/**
	 * Get eoomEocmId
	 */
	@Column(name = "EOOM_EOCM_ID")
	public Long getEoomEocmId() {
		return eoomEocmId;
	}

	/**
	 * Set eoomEocmId
	 */
	public void setEoomEocmId(Long eoomEocmId) {
		this.eoomEocmId = eoomEocmId;
		addValidField("eoomEocmId");
	}

	/**
	 * Get eoomEoorId
	 */
	@Column(name = "EOOM_EOOR_ID")
	public Long getEoomEoorId() {
		return eoomEoorId;
	}

	/**
	 * Set eoomEoorId
	 */
	public void setEoomEoorId(Long eoomEoorId) {
		this.eoomEoorId = eoomEoorId;
		addValidField("eoomEoorId");
	}

	/**
	 * Get eoomEbmaId
	 */
	@Column(name = "EOOM_EBMA_ID")
	public Long getEoomEbmaId() {
		return eoomEbmaId;
	}

	/**
	 * Set eoomEbmaId
	 */
	public void setEoomEbmaId(Long eoomEbmaId) {
		this.eoomEbmaId = eoomEbmaId;
		addValidField("eoomEbmaId");
	}

	/**
	 * Get eoomMaterialNo
	 */
	@Column(name = "EOOM_MATERIAL_NO")
	public String getEoomMaterialNo() {
		return eoomMaterialNo;
	}

	/**
	 * Set eoomMaterialNo
	 */
	public void setEoomMaterialNo(String eoomMaterialNo) {
		this.eoomMaterialNo = eoomMaterialNo;
		addValidField("eoomMaterialNo");
	}

	/**
	 * Get eoomEbmaNameCn
	 */
	@Column(name = "EOOM_EBMA_NAME_CN")
	public String getEoomEbmaNameCn() {
		return eoomEbmaNameCn;
	}

	/**
	 * Set eoomEbmaNameCn
	 */
	public void setEoomEbmaNameCn(String eoomEbmaNameCn) {
		this.eoomEbmaNameCn = eoomEbmaNameCn;
		addValidField("eoomEbmaNameCn");
	}

	/**
	 * Get eoomEbtpId
	 */
	@Column(name = "EOOM_EBTP_ID")
	public Long getEoomEbtpId() {
		return eoomEbtpId;
	}

	/**
	 * Set eoomEbtpId
	 */
	public void setEoomEbtpId(Long eoomEbtpId) {
		this.eoomEbtpId = eoomEbtpId;
		addValidField("eoomEbtpId");
	}

	/**
	 * Get eoomEbtpModel
	 */
	@Column(name = "EOOM_EBTP_MODEL")
	public String getEoomEbtpModel() {
		return eoomEbtpModel;
	}

	/**
	 * Set eoomEbtpModel
	 */
	public void setEoomEbtpModel(String eoomEbtpModel) {
		this.eoomEbtpModel = eoomEbtpModel;
		addValidField("eoomEbtpModel");
	}

	/**
	 * Get eoomEbtpPackage
	 */
	@Column(name = "EOOM_EBTP_PACKAGE")
	public String getEoomEbtpPackage() {
		return eoomEbtpPackage;
	}

	/**
	 * Set eoomEbtpPackage
	 */
	public void setEoomEbtpPackage(String eoomEbtpPackage) {
		this.eoomEbtpPackage = eoomEbtpPackage;
		addValidField("eoomEbtpPackage");
	}

	/**
	 * Get eoomEbtpPackageType
	 */
	@Column(name = "EOOM_EBTP_PACKAGE_TYPE")
	public String getEoomEbtpPackageType() {
		return eoomEbtpPackageType;
	}

	/**
	 * Set eoomEbtpPackageType
	 */
	public void setEoomEbtpPackageType(String eoomEbtpPackageType) {
		this.eoomEbtpPackageType = eoomEbtpPackageType;
		addValidField("eoomEbtpPackageType");
	}

	/**
	 * Get eoomType
	 */
	@Column(name = "EOOM_TYPE")
	public String getEoomType() {
		return eoomType;
	}

	/**
	 * Set eoomType
	 */
	public void setEoomType(String eoomType) {
		this.eoomType = eoomType;
		addValidField("eoomType");
	}

	/**
	 * Get eoomEbmaIsTemperature
	 */
	@Column(name = "EOOM_EBMA_IS_TEMPERATURE")
	public String getEoomEbmaIsTemperature() {
		return eoomEbmaIsTemperature;
	}

	/**
	 * Set eoomEbmaIsTemperature
	 */
	public void setEoomEbmaIsTemperature(String eoomEbmaIsTemperature) {
		this.eoomEbmaIsTemperature = eoomEbmaIsTemperature;
		addValidField("eoomEbmaIsTemperature");
	}

	/**
	 * Get eoomEbmaFeatures
	 */
	@Column(name = "EOOM_EBMA_FEATURES")
	public String getEoomEbmaFeatures() {
		return eoomEbmaFeatures;
	}

	/**
	 * Set eoomEbmaFeatures
	 */
	public void setEoomEbmaFeatures(String eoomEbmaFeatures) {
		this.eoomEbmaFeatures = eoomEbmaFeatures;
		addValidField("eoomEbmaFeatures");
	}

	/**
	 * Get eoomEbmaDgClass
	 */
	@Column(name = "EOOM_EBMA_DG_CLASS")
	public String getEoomEbmaDgClass() {
		return eoomEbmaDgClass;
	}

	/**
	 * Set eoomEbmaDgClass
	 */
	public void setEoomEbmaDgClass(String eoomEbmaDgClass) {
		this.eoomEbmaDgClass = eoomEbmaDgClass;
		addValidField("eoomEbmaDgClass");
	}

	/**
	 * Get eoomStatus
	 */
	@Column(name = "EOOM_STATUS")
	public String getEoomStatus() {
		return eoomStatus;
	}

	/**
	 * Set eoomStatus
	 */
	public void setEoomStatus(String eoomStatus) {
		this.eoomStatus = eoomStatus;
		addValidField("eoomStatus");
	}

	/**
	 * Get eoomNumber
	 */
	@Column(name = "EOOM_NUMBER")
	public Long getEoomNumber() {
		return eoomNumber;
	}

	/**
	 * Set eoomNumber
	 */
	public void setEoomNumber(Long eoomNumber) {
		this.eoomNumber = eoomNumber;
		addValidField("eoomNumber");
	}

	/**
	 * Get eoomNumberUnit
	 */
	@Column(name = "EOOM_NUMBER_UNIT")
	public String getEoomNumberUnit() {
		return eoomNumberUnit;
	}

	/**
	 * Set eoomNumberUnit
	 */
	public void setEoomNumberUnit(String eoomNumberUnit) {
		this.eoomNumberUnit = eoomNumberUnit;
		addValidField("eoomNumberUnit");
	}

	/**
	 * Get eoomQuantity
	 */
	@Column(name = "EOOM_QUANTITY")
	public Double getEoomQuantity() {
		return eoomQuantity;
	}

	/**
	 * Set eoomQuantity
	 */
	public void setEoomQuantity(Double eoomQuantity) {
		this.eoomQuantity = eoomQuantity;
		addValidField("eoomQuantity");
	}

	/**
	 * Get eoomQuantityUnit
	 */
	@Column(name = "EOOM_QUANTITY_UNIT")
	public String getEoomQuantityUnit() {
		return eoomQuantityUnit;
	}

	/**
	 * Set eoomQuantityUnit
	 */
	public void setEoomQuantityUnit(String eoomQuantityUnit) {
		this.eoomQuantityUnit = eoomQuantityUnit;
		addValidField("eoomQuantityUnit");
	}

	/**
	 * Get eoomBatch
	 */
	@Column(name = "EOOM_BATCH")
	public String getEoomBatch() {
		return eoomBatch;
	}

	/**
	 * Set eoomBatch
	 */
	public void setEoomBatch(String eoomBatch) {
		this.eoomBatch = eoomBatch;
		addValidField("eoomBatch");
	}

	/**
	 * Get eoomEbmaDgCode
	 */
	@Column(name = "EOOM_EBMA_DG_CODE")
	public String getEoomEbmaDgCode() {
		return eoomEbmaDgCode;
	}

	/**
	 * Set eoomEbmaDgCode
	 */
	public void setEoomEbmaDgCode(String eoomEbmaDgCode) {
		this.eoomEbmaDgCode = eoomEbmaDgCode;
		addValidField("eoomEbmaDgCode");
	}

	/**
	 * Get eoomEbmaUnNo
	 */
	@Column(name = "EOOM_EBMA_UN_NO")
	public String getEoomEbmaUnNo() {
		return eoomEbmaUnNo;
	}

	/**
	 * Set eoomEbmaUnNo
	 */
	public void setEoomEbmaUnNo(String eoomEbmaUnNo) {
		this.eoomEbmaUnNo = eoomEbmaUnNo;
		addValidField("eoomEbmaUnNo");
	}

	/**
	 * Get eoomGrossWeight
	 */
	@Column(name = "EOOM_GROSS_WEIGHT")
	public Double getEoomGrossWeight() {
		return eoomGrossWeight;
	}

	/**
	 * Set eoomGrossWeight
	 */
	public void setEoomGrossWeight(Double eoomGrossWeight) {
		this.eoomGrossWeight = eoomGrossWeight;
		addValidField("eoomGrossWeight");
	}

	/**
	 * Get eoomNetWeight
	 */
	@Column(name = "EOOM_NET_WEIGHT")
	public Double getEoomNetWeight() {
		return eoomNetWeight;
	}

	/**
	 * Set eoomNetWeight
	 */
	public void setEoomNetWeight(Double eoomNetWeight) {
		this.eoomNetWeight = eoomNetWeight;
		addValidField("eoomNetWeight");
	}

	/**
	 * Get eoomVolume
	 */
	@Column(name = "EOOM_VOLUME")
	public Double getEoomVolume() {
		return eoomVolume;
	}

	/**
	 * Set eoomVolume
	 */
	public void setEoomVolume(Double eoomVolume) {
		this.eoomVolume = eoomVolume;
		addValidField("eoomVolume");
	}

	/**
	 * Get eoomPrice
	 */
	@Column(name = "EOOM_PRICE")
	public Long getEoomPrice() {
		return eoomPrice;
	}

	/**
	 * Set eoomPrice
	 */
	public void setEoomPrice(Long eoomPrice) {
		this.eoomPrice = eoomPrice;
		addValidField("eoomPrice");
	}

	/**
	 * Get eoomSubstr1
	 */
	@Column(name = "EOOM_SUBSTR1")
	public String getEoomSubstr1() {
		return eoomSubstr1;
	}

	/**
	 * Set eoomSubstr1
	 */
	public void setEoomSubstr1(String eoomSubstr1) {
		this.eoomSubstr1 = eoomSubstr1;
		addValidField("eoomSubstr1");
	}

	/**
	 * Get eoomSubstr2
	 */
	@Column(name = "EOOM_SUBSTR2")
	public String getEoomSubstr2() {
		return eoomSubstr2;
	}

	/**
	 * Set eoomSubstr2
	 */
	public void setEoomSubstr2(String eoomSubstr2) {
		this.eoomSubstr2 = eoomSubstr2;
		addValidField("eoomSubstr2");
	}

	/**
	 * Get eoomSubstr3
	 */
	@Column(name = "EOOM_SUBSTR3")
	public String getEoomSubstr3() {
		return eoomSubstr3;
	}

	/**
	 * Set eoomSubstr3
	 */
	public void setEoomSubstr3(String eoomSubstr3) {
		this.eoomSubstr3 = eoomSubstr3;
		addValidField("eoomSubstr3");
	}

	/**
	 * Get eoomSubstr4
	 */
	@Column(name = "EOOM_SUBSTR4")
	public String getEoomSubstr4() {
		return eoomSubstr4;
	}

	/**
	 * Set eoomSubstr4
	 */
	public void setEoomSubstr4(String eoomSubstr4) {
		this.eoomSubstr4 = eoomSubstr4;
		addValidField("eoomSubstr4");
	}

	/**
	 * Get eoomSubstr5
	 */
	@Column(name = "EOOM_SUBSTR5")
	public String getEoomSubstr5() {
		return eoomSubstr5;
	}

	/**
	 * Set eoomSubstr5
	 */
	public void setEoomSubstr5(String eoomSubstr5) {
		this.eoomSubstr5 = eoomSubstr5;
		addValidField("eoomSubstr5");
	}

	/**
	 * Get eoomSubstr6
	 */
	@Column(name = "EOOM_SUBSTR6")
	public String getEoomSubstr6() {
		return eoomSubstr6;
	}

	/**
	 * Set eoomSubstr6
	 */
	public void setEoomSubstr6(String eoomSubstr6) {
		this.eoomSubstr6 = eoomSubstr6;
		addValidField("eoomSubstr6");
	}

	/**
	 * Get eoomSubstr8
	 */
	@Column(name = "EOOM_SUBSTR8")
	public String getEoomSubstr8() {
		return eoomSubstr8;
	}

	/**
	 * Set eoomSubstr8
	 */
	public void setEoomSubstr8(String eoomSubstr8) {
		this.eoomSubstr8 = eoomSubstr8;
		addValidField("eoomSubstr8");
	}

	/**
	 * Get eoomSubstr7
	 */
	@Column(name = "EOOM_SUBSTR7")
	public String getEoomSubstr7() {
		return eoomSubstr7;
	}

	/**
	 * Set eoomSubstr7
	 */
	public void setEoomSubstr7(String eoomSubstr7) {
		this.eoomSubstr7 = eoomSubstr7;
		addValidField("eoomSubstr7");
	}

	/**
	 * Get eoomSubdate1
	 */
	@Column(name = "EOOM_SUBDATE1")
	public Date getEoomSubdate1() {
		return eoomSubdate1;
	}

	/**
	 * Set eoomSubdate1
	 */
	public void setEoomSubdate1(Date eoomSubdate1) {
		this.eoomSubdate1 = eoomSubdate1;
		addValidField("eoomSubdate1");
	}

	/**
	 * Get eoomSubdate2
	 */
	@Column(name = "EOOM_SUBDATE2")
	public Date getEoomSubdate2() {
		return eoomSubdate2;
	}

	/**
	 * Set eoomSubdate2
	 */
	public void setEoomSubdate2(Date eoomSubdate2) {
		this.eoomSubdate2 = eoomSubdate2;
		addValidField("eoomSubdate2");
	}

	/**
	 * Get eoomSubdate5
	 */
	@Column(name = "EOOM_SUBDATE5")
	public Date getEoomSubdate5() {
		return eoomSubdate5;
	}

	/**
	 * Set eoomSubdate5
	 */
	public void setEoomSubdate5(Date eoomSubdate5) {
		this.eoomSubdate5 = eoomSubdate5;
		addValidField("eoomSubdate5");
	}

	/**
	 * Get eoomSubdate4
	 */
	@Column(name = "EOOM_SUBDATE4")
	public Date getEoomSubdate4() {
		return eoomSubdate4;
	}

	/**
	 * Set eoomSubdate4
	 */
	public void setEoomSubdate4(Date eoomSubdate4) {
		this.eoomSubdate4 = eoomSubdate4;
		addValidField("eoomSubdate4");
	}

	/**
	 * Get eoomSubdate3
	 */
	@Column(name = "EOOM_SUBDATE3")
	public Date getEoomSubdate3() {
		return eoomSubdate3;
	}

	/**
	 * Set eoomSubdate3
	 */
	public void setEoomSubdate3(Date eoomSubdate3) {
		this.eoomSubdate3 = eoomSubdate3;
		addValidField("eoomSubdate3");
	}

	/**
	 * Get eoomSubnum3
	 */
	@Column(name = "EOOM_SUBNUM3")
	public Long getEoomSubnum3() {
		return eoomSubnum3;
	}

	/**
	 * Set eoomSubnum3
	 */
	public void setEoomSubnum3(Long eoomSubnum3) {
		this.eoomSubnum3 = eoomSubnum3;
		addValidField("eoomSubnum3");
	}

	/**
	 * Get eoomSubnum2
	 */
	@Column(name = "EOOM_SUBNUM2")
	public Long getEoomSubnum2() {
		return eoomSubnum2;
	}

	/**
	 * Set eoomSubnum2
	 */
	public void setEoomSubnum2(Long eoomSubnum2) {
		this.eoomSubnum2 = eoomSubnum2;
		addValidField("eoomSubnum2");
	}

	/**
	 * Get eoomSubnum1
	 */
	@Column(name = "EOOM_SUBNUM1")
	public Long getEoomSubnum1() {
		return eoomSubnum1;
	}

	/**
	 * Set eoomSubnum1
	 */
	public void setEoomSubnum1(Long eoomSubnum1) {
		this.eoomSubnum1 = eoomSubnum1;
		addValidField("eoomSubnum1");
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
	 * Get eoomLineno
	 */
	@Column(name = "EOOM_LINENO")
	public String getEoomLineno() {
		return eoomLineno;
	}

	/**
	 * Set eoomLineno
	 */
	public void setEoomLineno(String eoomLineno) {
		this.eoomLineno = eoomLineno;
		addValidField("eoomLineno");
	}

	/**
	 * Get eoomSubstr9
	 */
	@Column(name = "EOOM_SUBSTR9")
	public String getEoomSubstr9() {
		return eoomSubstr9;
	}

	/**
	 * Set eoomSubstr9
	 */
	public void setEoomSubstr9(String eoomSubstr9) {
		this.eoomSubstr9 = eoomSubstr9;
		addValidField("eoomSubstr9");
	}

	/**
	 * Get eoomSubstr10
	 */
	@Column(name = "EOOM_SUBSTR10")
	public String getEoomSubstr10() {
		return eoomSubstr10;
	}

	/**
	 * Set eoomSubstr10
	 */
	public void setEoomSubstr10(String eoomSubstr10) {
		this.eoomSubstr10 = eoomSubstr10;
		addValidField("eoomSubstr10");
	}

	/**
	 * Get eoomSubstr11
	 */
	@Column(name = "EOOM_SUBSTR11")
	public String getEoomSubstr11() {
		return eoomSubstr11;
	}

	/**
	 * Set eoomSubstr11
	 */
	public void setEoomSubstr11(String eoomSubstr11) {
		this.eoomSubstr11 = eoomSubstr11;
		addValidField("eoomSubstr11");
	}

	/**
	 * Get eoomSubstr12
	 */
	@Column(name = "EOOM_SUBSTR12")
	public String getEoomSubstr12() {
		return eoomSubstr12;
	}

	/**
	 * Set eoomSubstr12
	 */
	public void setEoomSubstr12(String eoomSubstr12) {
		this.eoomSubstr12 = eoomSubstr12;
		addValidField("eoomSubstr12");
	}

	/**
	 * Get eoomSubstr13
	 */
	@Column(name = "EOOM_SUBSTR13")
	public String getEoomSubstr13() {
		return eoomSubstr13;
	}

	/**
	 * Set eoomSubstr13
	 */
	public void setEoomSubstr13(String eoomSubstr13) {
		this.eoomSubstr13 = eoomSubstr13;
		addValidField("eoomSubstr13");
	}

	/**
	 * Get eoomSubstr14
	 */
	@Column(name = "EOOM_SUBSTR14")
	public String getEoomSubstr14() {
		return eoomSubstr14;
	}

	/**
	 * Set eoomSubstr14
	 */
	public void setEoomSubstr14(String eoomSubstr14) {
		this.eoomSubstr14 = eoomSubstr14;
		addValidField("eoomSubstr14");
	}

	/**
	 * Get eoomSubstr15
	 */
	@Column(name = "EOOM_SUBSTR15")
	public String getEoomSubstr15() {
		return eoomSubstr15;
	}

	/**
	 * Set eoomSubstr15
	 */
	public void setEoomSubstr15(String eoomSubstr15) {
		this.eoomSubstr15 = eoomSubstr15;
		addValidField("eoomSubstr15");
	}

	/**
	 * Get eoomSubstr16
	 */
	@Column(name = "EOOM_SUBSTR16")
	public String getEoomSubstr16() {
		return eoomSubstr16;
	}

	/**
	 * Set eoomSubstr16
	 */
	public void setEoomSubstr16(String eoomSubstr16) {
		this.eoomSubstr16 = eoomSubstr16;
		addValidField("eoomSubstr16");
	}

	/**
	 * Get eoomSubstr17
	 */
	@Column(name = "EOOM_SUBSTR17")
	public String getEoomSubstr17() {
		return eoomSubstr17;
	}

	/**
	 * Set eoomSubstr17
	 */
	public void setEoomSubstr17(String eoomSubstr17) {
		this.eoomSubstr17 = eoomSubstr17;
		addValidField("eoomSubstr17");
	}

	/**
	 * Get eoomSubstr18
	 */
	@Column(name = "EOOM_SUBSTR18")
	public String getEoomSubstr18() {
		return eoomSubstr18;
	}

	/**
	 * Set eoomSubstr18
	 */
	public void setEoomSubstr18(String eoomSubstr18) {
		this.eoomSubstr18 = eoomSubstr18;
		addValidField("eoomSubstr18");
	}

	/**
	 * Get eoomSubstr19
	 */
	@Column(name = "EOOM_SUBSTR19")
	public String getEoomSubstr19() {
		return eoomSubstr19;
	}

	/**
	 * Set eoomSubstr19
	 */
	public void setEoomSubstr19(String eoomSubstr19) {
		this.eoomSubstr19 = eoomSubstr19;
		addValidField("eoomSubstr19");
	}

	/**
	 * Get eoomSubstr20
	 */
	@Column(name = "EOOM_SUBSTR20")
	public String getEoomSubstr20() {
		return eoomSubstr20;
	}

	/**
	 * Set eoomSubstr20
	 */
	public void setEoomSubstr20(String eoomSubstr20) {
		this.eoomSubstr20 = eoomSubstr20;
		addValidField("eoomSubstr20");
	}

	/**
	 * Get eoomSubstr21
	 */
	@Column(name = "EOOM_SUBSTR21")
	public String getEoomSubstr21() {
		return eoomSubstr21;
	}

	/**
	 * Set eoomSubstr21
	 */
	public void setEoomSubstr21(String eoomSubstr21) {
		this.eoomSubstr21 = eoomSubstr21;
		addValidField("eoomSubstr21");
	}

	/**
	 * Get eoomSubstr22
	 */
	@Column(name = "EOOM_SUBSTR22")
	public String getEoomSubstr22() {
		return eoomSubstr22;
	}

	/**
	 * Set eoomSubstr22
	 */
	public void setEoomSubstr22(String eoomSubstr22) {
		this.eoomSubstr22 = eoomSubstr22;
		addValidField("eoomSubstr22");
	}

	/**
	 * Get eoomSubstr23
	 */
	@Column(name = "EOOM_SUBSTR23")
	public String getEoomSubstr23() {
		return eoomSubstr23;
	}

	/**
	 * Set eoomSubstr23
	 */
	public void setEoomSubstr23(String eoomSubstr23) {
		this.eoomSubstr23 = eoomSubstr23;
		addValidField("eoomSubstr23");
	}

	/**
	 * Get eoomSubstr24
	 */
	@Column(name = "EOOM_SUBSTR24")
	public String getEoomSubstr24() {
		return eoomSubstr24;
	}

	/**
	 * Set eoomSubstr24
	 */
	public void setEoomSubstr24(String eoomSubstr24) {
		this.eoomSubstr24 = eoomSubstr24;
		addValidField("eoomSubstr24");
	}

	/**
	 * Get eoomSubstr25
	 */
	@Column(name = "EOOM_SUBSTR25")
	public String getEoomSubstr25() {
		return eoomSubstr25;
	}

	/**
	 * Set eoomSubstr25
	 */
	public void setEoomSubstr25(String eoomSubstr25) {
		this.eoomSubstr25 = eoomSubstr25;
		addValidField("eoomSubstr25");
	}

	/**
	 * Get eomiSubdate5
	 */
	@Column(name = "EOMI_SUBDATE5")
	public Date getEomiSubdate5() {
		return eomiSubdate5;
	}

	/**
	 * Set eomiSubdate5
	 */
	public void setEomiSubdate5(Date eomiSubdate5) {
		this.eomiSubdate5 = eomiSubdate5;
		addValidField("eomiSubdate5");
	}

	/**
	 * Get eoomSubdate6
	 */
	@Column(name = "EOOM_SUBDATE6")
	public Date getEoomSubdate6() {
		return eoomSubdate6;
	}

	/**
	 * Set eoomSubdate6
	 */
	public void setEoomSubdate6(Date eoomSubdate6) {
		this.eoomSubdate6 = eoomSubdate6;
		addValidField("eoomSubdate6");
	}

	/**
	 * Get eoomSubdate7
	 */
	@Column(name = "EOOM_SUBDATE7")
	public Date getEoomSubdate7() {
		return eoomSubdate7;
	}

	/**
	 * Set eoomSubdate7
	 */
	public void setEoomSubdate7(Date eoomSubdate7) {
		this.eoomSubdate7 = eoomSubdate7;
		addValidField("eoomSubdate7");
	}

	/**
	 * Get eoomSubdate8
	 */
	@Column(name = "EOOM_SUBDATE8")
	public Date getEoomSubdate8() {
		return eoomSubdate8;
	}

	/**
	 * Set eoomSubdate8
	 */
	public void setEoomSubdate8(Date eoomSubdate8) {
		this.eoomSubdate8 = eoomSubdate8;
		addValidField("eoomSubdate8");
	}

	/**
	 * Get eoomSubdate9
	 */
	@Column(name = "EOOM_SUBDATE9")
	public Date getEoomSubdate9() {
		return eoomSubdate9;
	}

	/**
	 * Set eoomSubdate9
	 */
	public void setEoomSubdate9(Date eoomSubdate9) {
		this.eoomSubdate9 = eoomSubdate9;
		addValidField("eoomSubdate9");
	}

	/**
	 * Get eoomSubdate10
	 */
	@Column(name = "EOOM_SUBDATE10")
	public Date getEoomSubdate10() {
		return eoomSubdate10;
	}

	/**
	 * Set eoomSubdate10
	 */
	public void setEoomSubdate10(Date eoomSubdate10) {
		this.eoomSubdate10 = eoomSubdate10;
		addValidField("eoomSubdate10");
	}

	/**
	 * Get eoomSubnum5
	 */
	@Column(name = "EOOM_SUBNUM5")
	public Long getEoomSubnum5() {
		return eoomSubnum5;
	}

	/**
	 * Set eoomSubnum5
	 */
	public void setEoomSubnum5(Long eoomSubnum5) {
		this.eoomSubnum5 = eoomSubnum5;
		addValidField("eoomSubnum5");
	}

	/**
	 * Get eoomSubnum6
	 */
	@Column(name = "EOOM_SUBNUM6")
	public Long getEoomSubnum6() {
		return eoomSubnum6;
	}

	/**
	 * Set eoomSubnum6
	 */
	public void setEoomSubnum6(Long eoomSubnum6) {
		this.eoomSubnum6 = eoomSubnum6;
		addValidField("eoomSubnum6");
	}

	/**
	 * Get eoomSubnum4
	 */
	@Column(name = "EOOM_SUBNUM4")
	public Long getEoomSubnum4() {
		return eoomSubnum4;
	}

	/**
	 * Set eoomSubnum4
	 */
	public void setEoomSubnum4(Long eoomSubnum4) {
		this.eoomSubnum4 = eoomSubnum4;
		addValidField("eoomSubnum4");
	}

	/**
	 * Get eoomTEbtpId
	 */
	@Column(name = "EOOM_T_EBTP_ID")
	public Long getEoomTEbtpId() {
		return eoomTEbtpId;
	}

	/**
	 * Set eoomTEbtpId
	 */
	public void setEoomTEbtpId(Long eoomTEbtpId) {
		this.eoomTEbtpId = eoomTEbtpId;
		addValidField("eoomTEbtpId");
	}

	/**
	 * Get eoomTEbtpModel
	 */
	@Column(name = "EOOM_T_EBTP_MODEL")
	public String getEoomTEbtpModel() {
		return eoomTEbtpModel;
	}

	/**
	 * Set eoomTEbtpModel
	 */
	public void setEoomTEbtpModel(String eoomTEbtpModel) {
		this.eoomTEbtpModel = eoomTEbtpModel;
		addValidField("eoomTEbtpModel");
	}

	/**
	 * Get eoomTEbtpPackage
	 */
	@Column(name = "EOOM_T_EBTP_PACKAGE")
	public String getEoomTEbtpPackage() {
		return eoomTEbtpPackage;
	}

	/**
	 * Set eoomTEbtpPackage
	 */
	public void setEoomTEbtpPackage(String eoomTEbtpPackage) {
		this.eoomTEbtpPackage = eoomTEbtpPackage;
		addValidField("eoomTEbtpPackage");
	}

	/**
	 * Get eoomTEbtpPackageType
	 */
	@Column(name = "EOOM_T_EBTP_PACKAGE_TYPE")
	public String getEoomTEbtpPackageType() {
		return eoomTEbtpPackageType;
	}

	/**
	 * Set eoomTEbtpPackageType
	 */
	public void setEoomTEbtpPackageType(String eoomTEbtpPackageType) {
		this.eoomTEbtpPackageType = eoomTEbtpPackageType;
		addValidField("eoomTEbtpPackageType");
	}

	/**
	 * Get eoomTNumberUnit
	 */
	@Column(name = "EOOM_T_NUMBER_UNIT")
	public String getEoomTNumberUnit() {
		return eoomTNumberUnit;
	}

	/**
	 * Set eoomTNumberUnit
	 */
	public void setEoomTNumberUnit(String eoomTNumberUnit) {
		this.eoomTNumberUnit = eoomTNumberUnit;
		addValidField("eoomTNumberUnit");
	}

	/**
	 * Get eoomTNumber
	 */
	@Column(name = "EOOM_T_NUMBER")
	public Long getEoomTNumber() {
		return eoomTNumber;
	}

	/**
	 * Set eoomTNumber
	 */
	public void setEoomTNumber(Long eoomTNumber) {
		this.eoomTNumber = eoomTNumber;
		addValidField("eoomTNumber");
	}

	/**
	 * Get eoomTNumberBulk
	 */
	@Column(name = "EOOM_T_NUMBER_BULK")
	public Long getEoomTNumberBulk() {
		return eoomTNumberBulk;
	}

	/**
	 * Set eoomTNumberBulk
	 */
	public void setEoomTNumberBulk(Long eoomTNumberBulk) {
		this.eoomTNumberBulk = eoomTNumberBulk;
		addValidField("eoomTNumberBulk");
	}

	/**
	 * Get eoomHscode
	 */
	@Column(name = "EOOM_HSCODE")
	public String getEoomHscode() {
		return eoomHscode;
	}

	/**
	 * Set eoomHscode
	 */
	public void setEoomHscode(String eoomHscode) {
		this.eoomHscode = eoomHscode;
		addValidField("eoomHscode");
	}

	/**
	 * Get eoomMaterialDesc
	 */
	@Column(name = "EOOM_MATERIAL_DESC")
	public String getEoomMaterialDesc() {
		return eoomMaterialDesc;
	}

	/**
	 * Set eoomMaterialDesc
	 */
	public void setEoomMaterialDesc(String eoomMaterialDesc) {
		this.eoomMaterialDesc = eoomMaterialDesc;
		addValidField("eoomMaterialDesc");
	}

	/**
	 * Get eoomMark
	 */
	@Column(name = "EOOM_MARK")
	public String getEoomMark() {
		return eoomMark;
	}

	/**
	 * Set eoomMark
	 */
	public void setEoomMark(String eoomMark) {
		this.eoomMark = eoomMark;
		addValidField("eoomMark");
	}

	/**
	 * Get eoomTemperatureUnit
	 */
	@Column(name = "EOOM_TEMPERATURE_UNIT")
	public String getEoomTemperatureUnit() {
		return eoomTemperatureUnit;
	}

	/**
	 * Set eoomTemperatureUnit
	 */
	public void setEoomTemperatureUnit(String eoomTemperatureUnit) {
		this.eoomTemperatureUnit = eoomTemperatureUnit;
		addValidField("eoomTemperatureUnit");
	}

	/**
	 * Get eoomEbmaTemperatureSetting
	 */
	@Column(name = "EOOM_EBMA_TEMPERATURE_SETTING")
	public Double getEoomEbmaTemperatureSetting() {
		return eoomEbmaTemperatureSetting;
	}

	/**
	 * Set eoomEbmaTemperatureSetting
	 */
	public void setEoomEbmaTemperatureSetting(Double eoomEbmaTemperatureSetting) {
		this.eoomEbmaTemperatureSetting = eoomEbmaTemperatureSetting;
		addValidField("eoomEbmaTemperatureSetting");
	}

	/**
	 * Get eoomEbmaMinTemperature
	 */
	@Column(name = "EOOM_EBMA_MIN_TEMPERATURE")
	public Double getEoomEbmaMinTemperature() {
		return eoomEbmaMinTemperature;
	}

	/**
	 * Set eoomEbmaMinTemperature
	 */
	public void setEoomEbmaMinTemperature(Double eoomEbmaMinTemperature) {
		this.eoomEbmaMinTemperature = eoomEbmaMinTemperature;
		addValidField("eoomEbmaMinTemperature");
	}

	/**
	 * Get eoomEbmaMaxTemperature
	 */
	@Column(name = "EOOM_EBMA_MAX_TEMPERATURE")
	public Double getEoomEbmaMaxTemperature() {
		return eoomEbmaMaxTemperature;
	}

	/**
	 * Set eoomEbmaMaxTemperature
	 */
	public void setEoomEbmaMaxTemperature(Double eoomEbmaMaxTemperature) {
		this.eoomEbmaMaxTemperature = eoomEbmaMaxTemperature;
		addValidField("eoomEbmaMaxTemperature");
	}

	/**
	 * Get eoomVent
	 */
	@Column(name = "EOOM_VENT")
	public String getEoomVent() {
		return eoomVent;
	}

	/**
	 * Set eoomVent
	 */
	public void setEoomVent(String eoomVent) {
		this.eoomVent = eoomVent;
		addValidField("eoomVent");
	}

	/**
	 * Get eoomHumidity
	 */
	@Column(name = "EOOM_HUMIDITY")
	public String getEoomHumidity() {
		return eoomHumidity;
	}

	/**
	 * Set eoomHumidity
	 */
	public void setEoomHumidity(String eoomHumidity) {
		this.eoomHumidity = eoomHumidity;
		addValidField("eoomHumidity");
	}

	/**
	 * Get eoomIsDangerousFlag
	 */
	@Column(name = "EOOM_IS_DANGEROUS_FLAG")
	public String getEoomIsDangerousFlag() {
		return eoomIsDangerousFlag;
	}

	/**
	 * Set eoomIsDangerousFlag
	 */
	public void setEoomIsDangerousFlag(String eoomIsDangerousFlag) {
		this.eoomIsDangerousFlag = eoomIsDangerousFlag;
		addValidField("eoomIsDangerousFlag");
	}

	/**
	 * Get eoomEbmaDgSubclass
	 */
	@Column(name = "EOOM_EBMA_DG_SUBCLASS")
	public String getEoomEbmaDgSubclass() {
		return eoomEbmaDgSubclass;
	}

	/**
	 * Set eoomEbmaDgSubclass
	 */
	public void setEoomEbmaDgSubclass(String eoomEbmaDgSubclass) {
		this.eoomEbmaDgSubclass = eoomEbmaDgSubclass;
		addValidField("eoomEbmaDgSubclass");
	}

	/**
	 * Get eoomDangerProperty
	 */
	@Column(name = "EOOM_DANGER_PROPERTY")
	public String getEoomDangerProperty() {
		return eoomDangerProperty;
	}

	/**
	 * Set eoomDangerProperty
	 */
	public void setEoomDangerProperty(String eoomDangerProperty) {
		this.eoomDangerProperty = eoomDangerProperty;
		addValidField("eoomDangerProperty");
	}

	/**
	 * Get eoomDangerPackage
	 */
	@Column(name = "EOOM_DANGER_PACKAGE")
	public String getEoomDangerPackage() {
		return eoomDangerPackage;
	}

	/**
	 * Set eoomDangerPackage
	 */
	public void setEoomDangerPackage(String eoomDangerPackage) {
		this.eoomDangerPackage = eoomDangerPackage;
		addValidField("eoomDangerPackage");
	}

	/**
	 * Get eoomDangerousPage
	 */
	@Column(name = "EOOM_DANGEROUS_PAGE")
	public String getEoomDangerousPage() {
		return eoomDangerousPage;
	}

	/**
	 * Set eoomDangerousPage
	 */
	public void setEoomDangerousPage(String eoomDangerousPage) {
		this.eoomDangerousPage = eoomDangerousPage;
		addValidField("eoomDangerousPage");
	}

	/**
	 * Get eoomDangerousLabel
	 */
	@Column(name = "EOOM_DANGEROUS_LABEL")
	public String getEoomDangerousLabel() {
		return eoomDangerousLabel;
	}

	/**
	 * Set eoomDangerousLabel
	 */
	public void setEoomDangerousLabel(String eoomDangerousLabel) {
		this.eoomDangerousLabel = eoomDangerousLabel;
		addValidField("eoomDangerousLabel");
	}

	/**
	 * Get eoomDangerousFlashPoint
	 */
	@Column(name = "EOOM_DANGEROUS_FLASH_POINT")
	public String getEoomDangerousFlashPoint() {
		return eoomDangerousFlashPoint;
	}

	/**
	 * Set eoomDangerousFlashPoint
	 */
	public void setEoomDangerousFlashPoint(String eoomDangerousFlashPoint) {
		this.eoomDangerousFlashPoint = eoomDangerousFlashPoint;
		addValidField("eoomDangerousFlashPoint");
	}

	/**
	 * Get eoomDangerousEmsNo
	 */
	@Column(name = "EOOM_DANGEROUS_EMS_NO")
	public String getEoomDangerousEmsNo() {
		return eoomDangerousEmsNo;
	}

	/**
	 * Set eoomDangerousEmsNo
	 */
	public void setEoomDangerousEmsNo(String eoomDangerousEmsNo) {
		this.eoomDangerousEmsNo = eoomDangerousEmsNo;
		addValidField("eoomDangerousEmsNo");
	}

	/**
	 * Get eoomMfagNo
	 */
	@Column(name = "EOOM_MFAG_NO")
	public String getEoomMfagNo() {
		return eoomMfagNo;
	}

	/**
	 * Set eoomMfagNo
	 */
	public void setEoomMfagNo(String eoomMfagNo) {
		this.eoomMfagNo = eoomMfagNo;
		addValidField("eoomMfagNo");
	}

	/**
	 * Get eoomMarinePollutantFlag
	 */
	@Column(name = "EOOM_MARINE_POLLUTANT_FLAG")
	public String getEoomMarinePollutantFlag() {
		return eoomMarinePollutantFlag;
	}

	/**
	 * Set eoomMarinePollutantFlag
	 */
	public void setEoomMarinePollutantFlag(String eoomMarinePollutantFlag) {
		this.eoomMarinePollutantFlag = eoomMarinePollutantFlag;
		addValidField("eoomMarinePollutantFlag");
	}

	/**
	 * Get eoomIsBig
	 */
	@Column(name = "EOOM_IS_BIG")
	public String getEoomIsBig() {
		return eoomIsBig;
	}

	/**
	 * Set eoomIsBig
	 */
	public void setEoomIsBig(String eoomIsBig) {
		this.eoomIsBig = eoomIsBig;
		addValidField("eoomIsBig");
	}

	/**
	 * Get eoomLength
	 */
	@Column(name = "EOOM_LENGTH")
	public Double getEoomLength() {
		return eoomLength;
	}

	/**
	 * Set eoomLength
	 */
	public void setEoomLength(Double eoomLength) {
		this.eoomLength = eoomLength;
		addValidField("eoomLength");
	}

	/**
	 * Get eoomWidth
	 */
	@Column(name = "EOOM_WIDTH")
	public Double getEoomWidth() {
		return eoomWidth;
	}

	/**
	 * Set eoomWidth
	 */
	public void setEoomWidth(Double eoomWidth) {
		this.eoomWidth = eoomWidth;
		addValidField("eoomWidth");
	}

	/**
	 * Get eoomHigh
	 */
	@Column(name = "EOOM_HIGH")
	public Double getEoomHigh() {
		return eoomHigh;
	}

	/**
	 * Set eoomHigh
	 */
	public void setEoomHigh(Double eoomHigh) {
		this.eoomHigh = eoomHigh;
		addValidField("eoomHigh");
	}

	/**
	 * Get eoomOverLengthFront
	 */
	@Column(name = "EOOM_OVER_LENGTH_FRONT")
	public Double getEoomOverLengthFront() {
		return eoomOverLengthFront;
	}

	/**
	 * Set eoomOverLengthFront
	 */
	public void setEoomOverLengthFront(Double eoomOverLengthFront) {
		this.eoomOverLengthFront = eoomOverLengthFront;
		addValidField("eoomOverLengthFront");
	}

	/**
	 * Get eoomOverLengthBack
	 */
	@Column(name = "EOOM_OVER_LENGTH_BACK")
	public Double getEoomOverLengthBack() {
		return eoomOverLengthBack;
	}

	/**
	 * Set eoomOverLengthBack
	 */
	public void setEoomOverLengthBack(Double eoomOverLengthBack) {
		this.eoomOverLengthBack = eoomOverLengthBack;
		addValidField("eoomOverLengthBack");
	}

	/**
	 * Get eoomOverWidthLeft
	 */
	@Column(name = "EOOM_OVER_WIDTH_LEFT")
	public Double getEoomOverWidthLeft() {
		return eoomOverWidthLeft;
	}

	/**
	 * Set eoomOverWidthLeft
	 */
	public void setEoomOverWidthLeft(Double eoomOverWidthLeft) {
		this.eoomOverWidthLeft = eoomOverWidthLeft;
		addValidField("eoomOverWidthLeft");
	}

	/**
	 * Get eoomOverWidthRight
	 */
	@Column(name = "EOOM_OVER_WIDTH_RIGHT")
	public Double getEoomOverWidthRight() {
		return eoomOverWidthRight;
	}

	/**
	 * Set eoomOverWidthRight
	 */
	public void setEoomOverWidthRight(Double eoomOverWidthRight) {
		this.eoomOverWidthRight = eoomOverWidthRight;
		addValidField("eoomOverWidthRight");
	}

	/**
	 * Get eoomOverHeight
	 */
	@Column(name = "EOOM_OVER_HEIGHT")
	public Double getEoomOverHeight() {
		return eoomOverHeight;
	}

	/**
	 * Set eoomOverHeight
	 */
	public void setEoomOverHeight(Double eoomOverHeight) {
		this.eoomOverHeight = eoomOverHeight;
		addValidField("eoomOverHeight");
	}

	/**
	 * Get eoomEbmaNameEn
	 */
	@Column(name = "EOOM_EBMA_NAME_EN")
	public String getEoomEbmaNameEn() {
		return eoomEbmaNameEn;
	}

	/**
	 * Set eoomEbmaNameEn
	 */
	public void setEoomEbmaNameEn(String eoomEbmaNameEn) {
		this.eoomEbmaNameEn = eoomEbmaNameEn;
		addValidField("eoomEbmaNameEn");
	}

	/**
	 * Get eoomLong
	 */
	@Column(name = "EOOM_LONG")
	public String getEoomLong() {
		return eoomLong;
	}

	/**
	 * Set eoomLong
	 */
	public void setEoomLong(String eoomLong) {
		this.eoomLong = eoomLong;
		addValidField("eoomLong");
	}

	/**
	 * Get eoomWide
	 */
	@Column(name = "EOOM_WIDE")
	public String getEoomWide() {
		return eoomWide;
	}

	/**
	 * Set eoomWide
	 */
	public void setEoomWide(String eoomWide) {
		this.eoomWide = eoomWide;
		addValidField("eoomWide");
	}

	/**
	 * Get eoomTall
	 */
	@Column(name = "EOOM_TALL")
	public String getEoomTall() {
		return eoomTall;
	}

	/**
	 * Set eoomTall
	 */
	public void setEoomTall(String eoomTall) {
		this.eoomTall = eoomTall;
		addValidField("eoomTall");
	}

}
