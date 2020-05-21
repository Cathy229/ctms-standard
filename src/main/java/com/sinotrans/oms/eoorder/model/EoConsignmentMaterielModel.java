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
 * Model class for EoConsignmentMateriel
 */
@Entity
@Table(name = "EO_CONSIGNMENT_MATERIEL")
public class EoConsignmentMaterielModel extends BaseModel implements OperationLog {

	//eocmId
	private Long eocmId;
	//eocmEocsId
	private Long eocmEocsId;
	//eocmEbmaId
	private Long eocmEbmaId;
	//eocmMaterialNo
	private String eocmMaterialNo;
	//eocmEbmaNameCn
	private String eocmEbmaNameCn;
	//eocmEbtpId
	private Long eocmEbtpId;
	//eocmEbtpModel
	private String eocmEbtpModel;
	//eocmEbtpPackage
	private String eocmEbtpPackage;
	//eocmEbtpPackageType
	private String eocmEbtpPackageType;
	//eocmType
	private String eocmType;
	//eocmEbmaIsTemperature
	private String eocmEbmaIsTemperature;
	//eocmEbmaFeatures
	private String eocmEbmaFeatures;
	//eocmEbmaDgClass
	private String eocmEbmaDgClass;
	//eocmStatus
	private String eocmStatus;
	//eocmNumber
	private Long eocmNumber;
	//eocmNumberUnit
	private String eocmNumberUnit;
	//eocmQuantity
	private Double eocmQuantity;
	//eocmQuantityUnit
	private String eocmQuantityUnit;
	//eocmBatch
	private String eocmBatch;
	//eocmEbmaDgCode
	private String eocmEbmaDgCode;
	//eocmEbmaUnNo
	private String eocmEbmaUnNo;
	//eocmGrossWeight
	private Double eocmGrossWeight;
	//eocmNetWeight
	private Double eocmNetWeight;
	//eocmVolume
	private Double eocmVolume;
	//eocmPrice
	private Long eocmPrice;
	//eocmSubstr1
	private String eocmSubstr1;
	//eocmSubstr2
	private String eocmSubstr2;
	//eocmSubstr3
	private String eocmSubstr3;
	//eocmSubstr4
	private String eocmSubstr4;
	//eocmSubstr5
	private String eocmSubstr5;
	//eocmSubstr6
	private String eocmSubstr6;
	//eocmSubstr7
	private String eocmSubstr7;
	//eocmSubstr8
	private String eocmSubstr8;
	//eocmSubdate1
	private Date eocmSubdate1;
	//eocmSubdate2
	private Date eocmSubdate2;
	//eocmSubdate3
	private Date eocmSubdate3;
	//eocmSubdate4
	private Date eocmSubdate4;
	//eocmSubnum1
	private Long eocmSubnum1;
	//eocmSubnum2
	private Long eocmSubnum2;
	//eocmSubnum3
	private Long eocmSubnum3;
	//eocmSubnum4
	private Long eocmSubnum4;
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
	//eocmSubstr9
	private String eocmSubstr9;
	//eocmSubstr10
	private String eocmSubstr10;
	//eocmSubstr11
	private String eocmSubstr11;
	//eocmSubstr12
	private String eocmSubstr12;
	//eocmSubstr13
	private String eocmSubstr13;
	//eocmSubstr14
	private String eocmSubstr14;
	//eocmSubstr15
	private String eocmSubstr15;
	//eocmSubstr16
	private String eocmSubstr16;
	//eocmSubstr17
	private String eocmSubstr17;
	//eocmSubstr18
	private String eocmSubstr18;
	//eocmSubstr19
	private String eocmSubstr19;
	//eocmSubstr20
	private String eocmSubstr20;
	//eocmSubstr21
	private String eocmSubstr21;
	//eocmSubstr22
	private String eocmSubstr22;
	//eocmSubstr23
	private String eocmSubstr23;
	//eocmSubstr24
	private String eocmSubstr24;
	//eocmSubstr25
	private String eocmSubstr25;
	//eocmSubdate5
	private Date eocmSubdate5;
	//eocmSubdate6
	private Date eocmSubdate6;
	//eocmSubdate7
	private Date eocmSubdate7;
	//eocmSubdate8
	private Date eocmSubdate8;
	//eocmSubdate9
	private Date eocmSubdate9;
	//eocmSubdate10
	private Date eocmSubdate10;
	//eocmSubnum5
	private Long eocmSubnum5;
	//eocmSubnum6
	private Long eocmSubnum6;
	//eocmLineno
	private String eocmLineno;
	//eocmTEbtpId
	private Long eocmTEbtpId;
	//eocmTEbtpModel
	private String eocmTEbtpModel;
	//eocmTEbtpPackage
	private String eocmTEbtpPackage;
	//eocmTEbtpPackageType
	private String eocmTEbtpPackageType;
	//eocmTNumberUnit
	private String eocmTNumberUnit;
	//eocmTNumber
	private Long eocmTNumber;
	//eocmTNumberBulk
	private Long eocmTNumberBulk;
	//eocmHscode
	private String eocmHscode;
	//eocmMaterialDesc
	private String eocmMaterialDesc;
	//eocmAcceptQuantity
	private Double eocmAcceptQuantity;
	//eocmAcceptGrossWeight
	private Double eocmAcceptGrossWeight;
	//eocmAcceptNetWeight
	private Double eocmAcceptNetWeight;
	//eocmAcceptVolume
	private Double eocmAcceptVolume;

	/**
	 * Get eocmId
	 */
	@Column(name = "EOCM_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEocmId() {
		return eocmId;
	}

	/**
	 * Set eocmId
	 */
	public void setEocmId(Long eocmId) {
		this.eocmId = eocmId;
		addValidField("eocmId");
	}

	/**
	 * Get eocmEocsId
	 */
	@Column(name = "EOCM_EOCS_ID")
	public Long getEocmEocsId() {
		return eocmEocsId;
	}

	/**
	 * Set eocmEocsId
	 */
	public void setEocmEocsId(Long eocmEocsId) {
		this.eocmEocsId = eocmEocsId;
		addValidField("eocmEocsId");
	}

	/**
	 * Get eocmEbmaId
	 */
	@Column(name = "EOCM_EBMA_ID")
	public Long getEocmEbmaId() {
		return eocmEbmaId;
	}

	/**
	 * Set eocmEbmaId
	 */
	public void setEocmEbmaId(Long eocmEbmaId) {
		this.eocmEbmaId = eocmEbmaId;
		addValidField("eocmEbmaId");
	}

	/**
	 * Get eocmMaterialNo
	 */
	@Column(name = "EOCM_MATERIAL_NO")
	public String getEocmMaterialNo() {
		return eocmMaterialNo;
	}

	/**
	 * Set eocmMaterialNo
	 */
	public void setEocmMaterialNo(String eocmMaterialNo) {
		this.eocmMaterialNo = eocmMaterialNo;
		addValidField("eocmMaterialNo");
	}

	/**
	 * Get eocmEbmaNameCn
	 */
	@Column(name = "EOCM_EBMA_NAME_CN")
	public String getEocmEbmaNameCn() {
		return eocmEbmaNameCn;
	}

	/**
	 * Set eocmEbmaNameCn
	 */
	public void setEocmEbmaNameCn(String eocmEbmaNameCn) {
		this.eocmEbmaNameCn = eocmEbmaNameCn;
		addValidField("eocmEbmaNameCn");
	}

	/**
	 * Get eocmEbtpId
	 */
	@Column(name = "EOCM_EBTP_ID")
	public Long getEocmEbtpId() {
		return eocmEbtpId;
	}

	/**
	 * Set eocmEbtpId
	 */
	public void setEocmEbtpId(Long eocmEbtpId) {
		this.eocmEbtpId = eocmEbtpId;
		addValidField("eocmEbtpId");
	}

	/**
	 * Get eocmEbtpModel
	 */
	@Column(name = "EOCM_EBTP_MODEL")
	public String getEocmEbtpModel() {
		return eocmEbtpModel;
	}

	/**
	 * Set eocmEbtpModel
	 */
	public void setEocmEbtpModel(String eocmEbtpModel) {
		this.eocmEbtpModel = eocmEbtpModel;
		addValidField("eocmEbtpModel");
	}

	/**
	 * Get eocmEbtpPackage
	 */
	@Column(name = "EOCM_EBTP_PACKAGE")
	public String getEocmEbtpPackage() {
		return eocmEbtpPackage;
	}

	/**
	 * Set eocmEbtpPackage
	 */
	public void setEocmEbtpPackage(String eocmEbtpPackage) {
		this.eocmEbtpPackage = eocmEbtpPackage;
		addValidField("eocmEbtpPackage");
	}

	/**
	 * Get eocmEbtpPackageType
	 */
	@Column(name = "EOCM_EBTP_PACKAGE_TYPE")
	public String getEocmEbtpPackageType() {
		return eocmEbtpPackageType;
	}

	/**
	 * Set eocmEbtpPackageType
	 */
	public void setEocmEbtpPackageType(String eocmEbtpPackageType) {
		this.eocmEbtpPackageType = eocmEbtpPackageType;
		addValidField("eocmEbtpPackageType");
	}

	/**
	 * Get eocmType
	 */
	@Column(name = "EOCM_TYPE")
	public String getEocmType() {
		return eocmType;
	}

	/**
	 * Set eocmType
	 */
	public void setEocmType(String eocmType) {
		this.eocmType = eocmType;
		addValidField("eocmType");
	}

	/**
	 * Get eocmEbmaIsTemperature
	 */
	@Column(name = "EOCM_EBMA_IS_TEMPERATURE")
	public String getEocmEbmaIsTemperature() {
		return eocmEbmaIsTemperature;
	}

	/**
	 * Set eocmEbmaIsTemperature
	 */
	public void setEocmEbmaIsTemperature(String eocmEbmaIsTemperature) {
		this.eocmEbmaIsTemperature = eocmEbmaIsTemperature;
		addValidField("eocmEbmaIsTemperature");
	}

	/**
	 * Get eocmEbmaFeatures
	 */
	@Column(name = "EOCM_EBMA_FEATURES")
	public String getEocmEbmaFeatures() {
		return eocmEbmaFeatures;
	}

	/**
	 * Set eocmEbmaFeatures
	 */
	public void setEocmEbmaFeatures(String eocmEbmaFeatures) {
		this.eocmEbmaFeatures = eocmEbmaFeatures;
		addValidField("eocmEbmaFeatures");
	}

	/**
	 * Get eocmEbmaDgClass
	 */
	@Column(name = "EOCM_EBMA_DG_CLASS")
	public String getEocmEbmaDgClass() {
		return eocmEbmaDgClass;
	}

	/**
	 * Set eocmEbmaDgClass
	 */
	public void setEocmEbmaDgClass(String eocmEbmaDgClass) {
		this.eocmEbmaDgClass = eocmEbmaDgClass;
		addValidField("eocmEbmaDgClass");
	}

	/**
	 * Get eocmStatus
	 */
	@Column(name = "EOCM_STATUS")
	public String getEocmStatus() {
		return eocmStatus;
	}

	/**
	 * Set eocmStatus
	 */
	public void setEocmStatus(String eocmStatus) {
		this.eocmStatus = eocmStatus;
		addValidField("eocmStatus");
	}

	/**
	 * Get eocmNumber
	 */
	@Column(name = "EOCM_NUMBER")
	public Long getEocmNumber() {
		return eocmNumber;
	}

	/**
	 * Set eocmNumber
	 */
	public void setEocmNumber(Long eocmNumber) {
		this.eocmNumber = eocmNumber;
		addValidField("eocmNumber");
	}

	/**
	 * Get eocmNumberUnit
	 */
	@Column(name = "EOCM_NUMBER_UNIT")
	public String getEocmNumberUnit() {
		return eocmNumberUnit;
	}

	/**
	 * Set eocmNumberUnit
	 */
	public void setEocmNumberUnit(String eocmNumberUnit) {
		this.eocmNumberUnit = eocmNumberUnit;
		addValidField("eocmNumberUnit");
	}

	/**
	 * Get eocmQuantity
	 */
	@Column(name = "EOCM_QUANTITY")
	public Double getEocmQuantity() {
		return eocmQuantity;
	}

	/**
	 * Set eocmQuantity
	 */
	public void setEocmQuantity(Double eocmQuantity) {
		this.eocmQuantity = eocmQuantity;
		addValidField("eocmQuantity");
	}

	/**
	 * Get eocmQuantityUnit
	 */
	@Column(name = "EOCM_QUANTITY_UNIT")
	public String getEocmQuantityUnit() {
		return eocmQuantityUnit;
	}

	/**
	 * Set eocmQuantityUnit
	 */
	public void setEocmQuantityUnit(String eocmQuantityUnit) {
		this.eocmQuantityUnit = eocmQuantityUnit;
		addValidField("eocmQuantityUnit");
	}

	/**
	 * Get eocmBatch
	 */
	@Column(name = "EOCM_BATCH")
	public String getEocmBatch() {
		return eocmBatch;
	}

	/**
	 * Set eocmBatch
	 */
	public void setEocmBatch(String eocmBatch) {
		this.eocmBatch = eocmBatch;
		addValidField("eocmBatch");
	}

	/**
	 * Get eocmEbmaDgCode
	 */
	@Column(name = "EOCM_EBMA_DG_CODE")
	public String getEocmEbmaDgCode() {
		return eocmEbmaDgCode;
	}

	/**
	 * Set eocmEbmaDgCode
	 */
	public void setEocmEbmaDgCode(String eocmEbmaDgCode) {
		this.eocmEbmaDgCode = eocmEbmaDgCode;
		addValidField("eocmEbmaDgCode");
	}

	/**
	 * Get eocmEbmaUnNo
	 */
	@Column(name = "EOCM_EBMA_UN_NO")
	public String getEocmEbmaUnNo() {
		return eocmEbmaUnNo;
	}

	/**
	 * Set eocmEbmaUnNo
	 */
	public void setEocmEbmaUnNo(String eocmEbmaUnNo) {
		this.eocmEbmaUnNo = eocmEbmaUnNo;
		addValidField("eocmEbmaUnNo");
	}

	/**
	 * Get eocmGrossWeight
	 */
	@Column(name = "EOCM_GROSS_WEIGHT")
	public Double getEocmGrossWeight() {
		return eocmGrossWeight;
	}

	/**
	 * Set eocmGrossWeight
	 */
	public void setEocmGrossWeight(Double eocmGrossWeight) {
		this.eocmGrossWeight = eocmGrossWeight;
		addValidField("eocmGrossWeight");
	}

	/**
	 * Get eocmNetWeight
	 */
	@Column(name = "EOCM_NET_WEIGHT")
	public Double getEocmNetWeight() {
		return eocmNetWeight;
	}

	/**
	 * Set eocmNetWeight
	 */
	public void setEocmNetWeight(Double eocmNetWeight) {
		this.eocmNetWeight = eocmNetWeight;
		addValidField("eocmNetWeight");
	}

	/**
	 * Get eocmVolume
	 */
	@Column(name = "EOCM_VOLUME")
	public Double getEocmVolume() {
		return eocmVolume;
	}

	/**
	 * Set eocmVolume
	 */
	public void setEocmVolume(Double eocmVolume) {
		this.eocmVolume = eocmVolume;
		addValidField("eocmVolume");
	}

	/**
	 * Get eocmPrice
	 */
	@Column(name = "EOCM_PRICE")
	public Long getEocmPrice() {
		return eocmPrice;
	}

	/**
	 * Set eocmPrice
	 */
	public void setEocmPrice(Long eocmPrice) {
		this.eocmPrice = eocmPrice;
		addValidField("eocmPrice");
	}

	/**
	 * Get eocmSubstr1
	 */
	@Column(name = "EOCM_SUBSTR1")
	public String getEocmSubstr1() {
		return eocmSubstr1;
	}

	/**
	 * Set eocmSubstr1
	 */
	public void setEocmSubstr1(String eocmSubstr1) {
		this.eocmSubstr1 = eocmSubstr1;
		addValidField("eocmSubstr1");
	}

	/**
	 * Get eocmSubstr2
	 */
	@Column(name = "EOCM_SUBSTR2")
	public String getEocmSubstr2() {
		return eocmSubstr2;
	}

	/**
	 * Set eocmSubstr2
	 */
	public void setEocmSubstr2(String eocmSubstr2) {
		this.eocmSubstr2 = eocmSubstr2;
		addValidField("eocmSubstr2");
	}

	/**
	 * Get eocmSubstr3
	 */
	@Column(name = "EOCM_SUBSTR3")
	public String getEocmSubstr3() {
		return eocmSubstr3;
	}

	/**
	 * Set eocmSubstr3
	 */
	public void setEocmSubstr3(String eocmSubstr3) {
		this.eocmSubstr3 = eocmSubstr3;
		addValidField("eocmSubstr3");
	}

	/**
	 * Get eocmSubstr4
	 */
	@Column(name = "EOCM_SUBSTR4")
	public String getEocmSubstr4() {
		return eocmSubstr4;
	}

	/**
	 * Set eocmSubstr4
	 */
	public void setEocmSubstr4(String eocmSubstr4) {
		this.eocmSubstr4 = eocmSubstr4;
		addValidField("eocmSubstr4");
	}

	/**
	 * Get eocmSubstr5
	 */
	@Column(name = "EOCM_SUBSTR5")
	public String getEocmSubstr5() {
		return eocmSubstr5;
	}

	/**
	 * Set eocmSubstr5
	 */
	public void setEocmSubstr5(String eocmSubstr5) {
		this.eocmSubstr5 = eocmSubstr5;
		addValidField("eocmSubstr5");
	}

	/**
	 * Get eocmSubstr6
	 */
	@Column(name = "EOCM_SUBSTR6")
	public String getEocmSubstr6() {
		return eocmSubstr6;
	}

	/**
	 * Set eocmSubstr6
	 */
	public void setEocmSubstr6(String eocmSubstr6) {
		this.eocmSubstr6 = eocmSubstr6;
		addValidField("eocmSubstr6");
	}

	/**
	 * Get eocmSubstr7
	 */
	@Column(name = "EOCM_SUBSTR7")
	public String getEocmSubstr7() {
		return eocmSubstr7;
	}

	/**
	 * Set eocmSubstr7
	 */
	public void setEocmSubstr7(String eocmSubstr7) {
		this.eocmSubstr7 = eocmSubstr7;
		addValidField("eocmSubstr7");
	}

	/**
	 * Get eocmSubstr8
	 */
	@Column(name = "EOCM_SUBSTR8")
	public String getEocmSubstr8() {
		return eocmSubstr8;
	}

	/**
	 * Set eocmSubstr8
	 */
	public void setEocmSubstr8(String eocmSubstr8) {
		this.eocmSubstr8 = eocmSubstr8;
		addValidField("eocmSubstr8");
	}

	/**
	 * Get eocmSubdate1
	 */
	@Column(name = "EOCM_SUBDATE1")
	public Date getEocmSubdate1() {
		return eocmSubdate1;
	}

	/**
	 * Set eocmSubdate1
	 */
	public void setEocmSubdate1(Date eocmSubdate1) {
		this.eocmSubdate1 = eocmSubdate1;
		addValidField("eocmSubdate1");
	}

	/**
	 * Get eocmSubdate2
	 */
	@Column(name = "EOCM_SUBDATE2")
	public Date getEocmSubdate2() {
		return eocmSubdate2;
	}

	/**
	 * Set eocmSubdate2
	 */
	public void setEocmSubdate2(Date eocmSubdate2) {
		this.eocmSubdate2 = eocmSubdate2;
		addValidField("eocmSubdate2");
	}

	/**
	 * Get eocmSubdate3
	 */
	@Column(name = "EOCM_SUBDATE3")
	public Date getEocmSubdate3() {
		return eocmSubdate3;
	}

	/**
	 * Set eocmSubdate3
	 */
	public void setEocmSubdate3(Date eocmSubdate3) {
		this.eocmSubdate3 = eocmSubdate3;
		addValidField("eocmSubdate3");
	}

	/**
	 * Get eocmSubdate4
	 */
	@Column(name = "EOCM_SUBDATE4")
	public Date getEocmSubdate4() {
		return eocmSubdate4;
	}

	/**
	 * Set eocmSubdate4
	 */
	public void setEocmSubdate4(Date eocmSubdate4) {
		this.eocmSubdate4 = eocmSubdate4;
		addValidField("eocmSubdate4");
	}

	/**
	 * Get eocmSubnum1
	 */
	@Column(name = "EOCM_SUBNUM1")
	public Long getEocmSubnum1() {
		return eocmSubnum1;
	}

	/**
	 * Set eocmSubnum1
	 */
	public void setEocmSubnum1(Long eocmSubnum1) {
		this.eocmSubnum1 = eocmSubnum1;
		addValidField("eocmSubnum1");
	}

	/**
	 * Get eocmSubnum2
	 */
	@Column(name = "EOCM_SUBNUM2")
	public Long getEocmSubnum2() {
		return eocmSubnum2;
	}

	/**
	 * Set eocmSubnum2
	 */
	public void setEocmSubnum2(Long eocmSubnum2) {
		this.eocmSubnum2 = eocmSubnum2;
		addValidField("eocmSubnum2");
	}

	/**
	 * Get eocmSubnum3
	 */
	@Column(name = "EOCM_SUBNUM3")
	public Long getEocmSubnum3() {
		return eocmSubnum3;
	}

	/**
	 * Set eocmSubnum3
	 */
	public void setEocmSubnum3(Long eocmSubnum3) {
		this.eocmSubnum3 = eocmSubnum3;
		addValidField("eocmSubnum3");
	}

	/**
	 * Get eocmSubnum4
	 */
	@Column(name = "EOCM_SUBNUM4")
	public Long getEocmSubnum4() {
		return eocmSubnum4;
	}

	/**
	 * Set eocmSubnum4
	 */
	public void setEocmSubnum4(Long eocmSubnum4) {
		this.eocmSubnum4 = eocmSubnum4;
		addValidField("eocmSubnum4");
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
	 * Get eocmSubstr9
	 */
	@Column(name = "EOCM_SUBSTR9")
	public String getEocmSubstr9() {
		return eocmSubstr9;
	}

	/**
	 * Set eocmSubstr9
	 */
	public void setEocmSubstr9(String eocmSubstr9) {
		this.eocmSubstr9 = eocmSubstr9;
		addValidField("eocmSubstr9");
	}

	/**
	 * Get eocmSubstr10
	 */
	@Column(name = "EOCM_SUBSTR10")
	public String getEocmSubstr10() {
		return eocmSubstr10;
	}

	/**
	 * Set eocmSubstr10
	 */
	public void setEocmSubstr10(String eocmSubstr10) {
		this.eocmSubstr10 = eocmSubstr10;
		addValidField("eocmSubstr10");
	}

	/**
	 * Get eocmSubstr11
	 */
	@Column(name = "EOCM_SUBSTR11")
	public String getEocmSubstr11() {
		return eocmSubstr11;
	}

	/**
	 * Set eocmSubstr11
	 */
	public void setEocmSubstr11(String eocmSubstr11) {
		this.eocmSubstr11 = eocmSubstr11;
		addValidField("eocmSubstr11");
	}

	/**
	 * Get eocmSubstr12
	 */
	@Column(name = "EOCM_SUBSTR12")
	public String getEocmSubstr12() {
		return eocmSubstr12;
	}

	/**
	 * Set eocmSubstr12
	 */
	public void setEocmSubstr12(String eocmSubstr12) {
		this.eocmSubstr12 = eocmSubstr12;
		addValidField("eocmSubstr12");
	}

	/**
	 * Get eocmSubstr13
	 */
	@Column(name = "EOCM_SUBSTR13")
	public String getEocmSubstr13() {
		return eocmSubstr13;
	}

	/**
	 * Set eocmSubstr13
	 */
	public void setEocmSubstr13(String eocmSubstr13) {
		this.eocmSubstr13 = eocmSubstr13;
		addValidField("eocmSubstr13");
	}

	/**
	 * Get eocmSubstr14
	 */
	@Column(name = "EOCM_SUBSTR14")
	public String getEocmSubstr14() {
		return eocmSubstr14;
	}

	/**
	 * Set eocmSubstr14
	 */
	public void setEocmSubstr14(String eocmSubstr14) {
		this.eocmSubstr14 = eocmSubstr14;
		addValidField("eocmSubstr14");
	}

	/**
	 * Get eocmSubstr15
	 */
	@Column(name = "EOCM_SUBSTR15")
	public String getEocmSubstr15() {
		return eocmSubstr15;
	}

	/**
	 * Set eocmSubstr15
	 */
	public void setEocmSubstr15(String eocmSubstr15) {
		this.eocmSubstr15 = eocmSubstr15;
		addValidField("eocmSubstr15");
	}

	/**
	 * Get eocmSubstr16
	 */
	@Column(name = "EOCM_SUBSTR16")
	public String getEocmSubstr16() {
		return eocmSubstr16;
	}

	/**
	 * Set eocmSubstr16
	 */
	public void setEocmSubstr16(String eocmSubstr16) {
		this.eocmSubstr16 = eocmSubstr16;
		addValidField("eocmSubstr16");
	}

	/**
	 * Get eocmSubstr17
	 */
	@Column(name = "EOCM_SUBSTR17")
	public String getEocmSubstr17() {
		return eocmSubstr17;
	}

	/**
	 * Set eocmSubstr17
	 */
	public void setEocmSubstr17(String eocmSubstr17) {
		this.eocmSubstr17 = eocmSubstr17;
		addValidField("eocmSubstr17");
	}

	/**
	 * Get eocmSubstr18
	 */
	@Column(name = "EOCM_SUBSTR18")
	public String getEocmSubstr18() {
		return eocmSubstr18;
	}

	/**
	 * Set eocmSubstr18
	 */
	public void setEocmSubstr18(String eocmSubstr18) {
		this.eocmSubstr18 = eocmSubstr18;
		addValidField("eocmSubstr18");
	}

	/**
	 * Get eocmSubstr19
	 */
	@Column(name = "EOCM_SUBSTR19")
	public String getEocmSubstr19() {
		return eocmSubstr19;
	}

	/**
	 * Set eocmSubstr19
	 */
	public void setEocmSubstr19(String eocmSubstr19) {
		this.eocmSubstr19 = eocmSubstr19;
		addValidField("eocmSubstr19");
	}

	/**
	 * Get eocmSubstr20
	 */
	@Column(name = "EOCM_SUBSTR20")
	public String getEocmSubstr20() {
		return eocmSubstr20;
	}

	/**
	 * Set eocmSubstr20
	 */
	public void setEocmSubstr20(String eocmSubstr20) {
		this.eocmSubstr20 = eocmSubstr20;
		addValidField("eocmSubstr20");
	}

	/**
	 * Get eocmSubstr21
	 */
	@Column(name = "EOCM_SUBSTR21")
	public String getEocmSubstr21() {
		return eocmSubstr21;
	}

	/**
	 * Set eocmSubstr21
	 */
	public void setEocmSubstr21(String eocmSubstr21) {
		this.eocmSubstr21 = eocmSubstr21;
		addValidField("eocmSubstr21");
	}

	/**
	 * Get eocmSubstr22
	 */
	@Column(name = "EOCM_SUBSTR22")
	public String getEocmSubstr22() {
		return eocmSubstr22;
	}

	/**
	 * Set eocmSubstr22
	 */
	public void setEocmSubstr22(String eocmSubstr22) {
		this.eocmSubstr22 = eocmSubstr22;
		addValidField("eocmSubstr22");
	}

	/**
	 * Get eocmSubstr23
	 */
	@Column(name = "EOCM_SUBSTR23")
	public String getEocmSubstr23() {
		return eocmSubstr23;
	}

	/**
	 * Set eocmSubstr23
	 */
	public void setEocmSubstr23(String eocmSubstr23) {
		this.eocmSubstr23 = eocmSubstr23;
		addValidField("eocmSubstr23");
	}

	/**
	 * Get eocmSubstr24
	 */
	@Column(name = "EOCM_SUBSTR24")
	public String getEocmSubstr24() {
		return eocmSubstr24;
	}

	/**
	 * Set eocmSubstr24
	 */
	public void setEocmSubstr24(String eocmSubstr24) {
		this.eocmSubstr24 = eocmSubstr24;
		addValidField("eocmSubstr24");
	}

	/**
	 * Get eocmSubstr25
	 */
	@Column(name = "EOCM_SUBSTR25")
	public String getEocmSubstr25() {
		return eocmSubstr25;
	}

	/**
	 * Set eocmSubstr25
	 */
	public void setEocmSubstr25(String eocmSubstr25) {
		this.eocmSubstr25 = eocmSubstr25;
		addValidField("eocmSubstr25");
	}

	/**
	 * Get eocmSubdate5
	 */
	@Column(name = "EOCM_SUBDATE5")
	public Date getEocmSubdate5() {
		return eocmSubdate5;
	}

	/**
	 * Set eocmSubdate5
	 */
	public void setEocmSubdate5(Date eocmSubdate5) {
		this.eocmSubdate5 = eocmSubdate5;
		addValidField("eocmSubdate5");
	}

	/**
	 * Get eocmSubdate6
	 */
	@Column(name = "EOCM_SUBDATE6")
	public Date getEocmSubdate6() {
		return eocmSubdate6;
	}

	/**
	 * Set eocmSubdate6
	 */
	public void setEocmSubdate6(Date eocmSubdate6) {
		this.eocmSubdate6 = eocmSubdate6;
		addValidField("eocmSubdate6");
	}

	/**
	 * Get eocmSubdate7
	 */
	@Column(name = "EOCM_SUBDATE7")
	public Date getEocmSubdate7() {
		return eocmSubdate7;
	}

	/**
	 * Set eocmSubdate7
	 */
	public void setEocmSubdate7(Date eocmSubdate7) {
		this.eocmSubdate7 = eocmSubdate7;
		addValidField("eocmSubdate7");
	}

	/**
	 * Get eocmSubdate8
	 */
	@Column(name = "EOCM_SUBDATE8")
	public Date getEocmSubdate8() {
		return eocmSubdate8;
	}

	/**
	 * Set eocmSubdate8
	 */
	public void setEocmSubdate8(Date eocmSubdate8) {
		this.eocmSubdate8 = eocmSubdate8;
		addValidField("eocmSubdate8");
	}

	/**
	 * Get eocmSubdate9
	 */
	@Column(name = "EOCM_SUBDATE9")
	public Date getEocmSubdate9() {
		return eocmSubdate9;
	}

	/**
	 * Set eocmSubdate9
	 */
	public void setEocmSubdate9(Date eocmSubdate9) {
		this.eocmSubdate9 = eocmSubdate9;
		addValidField("eocmSubdate9");
	}

	/**
	 * Get eocmSubdate10
	 */
	@Column(name = "EOCM_SUBDATE10")
	public Date getEocmSubdate10() {
		return eocmSubdate10;
	}

	/**
	 * Set eocmSubdate10
	 */
	public void setEocmSubdate10(Date eocmSubdate10) {
		this.eocmSubdate10 = eocmSubdate10;
		addValidField("eocmSubdate10");
	}

	/**
	 * Get eocmSubnum5
	 */
	@Column(name = "EOCM_SUBNUM5")
	public Long getEocmSubnum5() {
		return eocmSubnum5;
	}

	/**
	 * Set eocmSubnum5
	 */
	public void setEocmSubnum5(Long eocmSubnum5) {
		this.eocmSubnum5 = eocmSubnum5;
		addValidField("eocmSubnum5");
	}

	/**
	 * Get eocmSubnum6
	 */
	@Column(name = "EOCM_SUBNUM6")
	public Long getEocmSubnum6() {
		return eocmSubnum6;
	}

	/**
	 * Set eocmSubnum6
	 */
	public void setEocmSubnum6(Long eocmSubnum6) {
		this.eocmSubnum6 = eocmSubnum6;
		addValidField("eocmSubnum6");
	}

	/**
	 * Get eocmLineno
	 */
	@Column(name = "EOCM_LINENO")
	public String getEocmLineno() {
		return eocmLineno;
	}

	/**
	 * Set eocmLineno
	 */
	public void setEocmLineno(String eocmLineno) {
		this.eocmLineno = eocmLineno;
		addValidField("eocmLineno");
	}

	/**
	 * Get eocmTEbtpId
	 */
	@Column(name = "EOCM_T_EBTP_ID")
	public Long getEocmTEbtpId() {
		return eocmTEbtpId;
	}

	/**
	 * Set eocmTEbtpId
	 */
	public void setEocmTEbtpId(Long eocmTEbtpId) {
		this.eocmTEbtpId = eocmTEbtpId;
		addValidField("eocmTEbtpId");
	}

	/**
	 * Get eocmTEbtpModel
	 */
	@Column(name = "EOCM_T_EBTP_MODEL")
	public String getEocmTEbtpModel() {
		return eocmTEbtpModel;
	}

	/**
	 * Set eocmTEbtpModel
	 */
	public void setEocmTEbtpModel(String eocmTEbtpModel) {
		this.eocmTEbtpModel = eocmTEbtpModel;
		addValidField("eocmTEbtpModel");
	}

	/**
	 * Get eocmTEbtpPackage
	 */
	@Column(name = "EOCM_T_EBTP_PACKAGE")
	public String getEocmTEbtpPackage() {
		return eocmTEbtpPackage;
	}

	/**
	 * Set eocmTEbtpPackage
	 */
	public void setEocmTEbtpPackage(String eocmTEbtpPackage) {
		this.eocmTEbtpPackage = eocmTEbtpPackage;
		addValidField("eocmTEbtpPackage");
	}

	/**
	 * Get eocmTEbtpPackageType
	 */
	@Column(name = "EOCM_T_EBTP_PACKAGE_TYPE")
	public String getEocmTEbtpPackageType() {
		return eocmTEbtpPackageType;
	}

	/**
	 * Set eocmTEbtpPackageType
	 */
	public void setEocmTEbtpPackageType(String eocmTEbtpPackageType) {
		this.eocmTEbtpPackageType = eocmTEbtpPackageType;
		addValidField("eocmTEbtpPackageType");
	}

	/**
	 * Get eocmTNumberUnit
	 */
	@Column(name = "EOCM_T_NUMBER_UNIT")
	public String getEocmTNumberUnit() {
		return eocmTNumberUnit;
	}

	/**
	 * Set eocmTNumberUnit
	 */
	public void setEocmTNumberUnit(String eocmTNumberUnit) {
		this.eocmTNumberUnit = eocmTNumberUnit;
		addValidField("eocmTNumberUnit");
	}

	/**
	 * Get eocmTNumber
	 */
	@Column(name = "EOCM_T_NUMBER")
	public Long getEocmTNumber() {
		return eocmTNumber;
	}

	/**
	 * Set eocmTNumber
	 */
	public void setEocmTNumber(Long eocmTNumber) {
		this.eocmTNumber = eocmTNumber;
		addValidField("eocmTNumber");
	}

	/**
	 * Get eocmTNumberBulk
	 */
	@Column(name = "EOCM_T_NUMBER_BULK")
	public Long getEocmTNumberBulk() {
		return eocmTNumberBulk;
	}

	/**
	 * Set eocmTNumberBulk
	 */
	public void setEocmTNumberBulk(Long eocmTNumberBulk) {
		this.eocmTNumberBulk = eocmTNumberBulk;
		addValidField("eocmTNumberBulk");
	}

	/**
	 * Get eocmHscode
	 */
	@Column(name = "EOCM_HSCODE")
	public String getEocmHscode() {
		return eocmHscode;
	}

	/**
	 * Set eocmHscode
	 */
	public void setEocmHscode(String eocmHscode) {
		this.eocmHscode = eocmHscode;
		addValidField("eocmHscode");
	}

	/**
	 * Get eocmMaterialDesc
	 */
	@Column(name = "EOCM_MATERIAL_DESC")
	public String getEocmMaterialDesc() {
		return eocmMaterialDesc;
	}

	/**
	 * Set eocmMaterialDesc
	 */
	public void setEocmMaterialDesc(String eocmMaterialDesc) {
		this.eocmMaterialDesc = eocmMaterialDesc;
		addValidField("eocmMaterialDesc");
	}

	/**
	 * Get eocmAcceptQuantity
	 */
	@Column(name = "EOCM_ACCEPT_QUANTITY")
	public Double getEocmAcceptQuantity() {
		return eocmAcceptQuantity;
	}

	/**
	 * Set eocmAcceptQuantity
	 */
	public void setEocmAcceptQuantity(Double eocmAcceptQuantity) {
		this.eocmAcceptQuantity = eocmAcceptQuantity;
		addValidField("eocmAcceptQuantity");
	}

	/**
	 * Get eocmAcceptGrossWeight
	 */
	@Column(name = "EOCM_ACCEPT_GROSS_WEIGHT")
	public Double getEocmAcceptGrossWeight() {
		return eocmAcceptGrossWeight;
	}

	/**
	 * Set eocmAcceptGrossWeight
	 */
	public void setEocmAcceptGrossWeight(Double eocmAcceptGrossWeight) {
		this.eocmAcceptGrossWeight = eocmAcceptGrossWeight;
		addValidField("eocmAcceptGrossWeight");
	}

	/**
	 * Get eocmAcceptNetWeight
	 */
	@Column(name = "EOCM_ACCEPT_NET_WEIGHT")
	public Double getEocmAcceptNetWeight() {
		return eocmAcceptNetWeight;
	}

	/**
	 * Set eocmAcceptNetWeight
	 */
	public void setEocmAcceptNetWeight(Double eocmAcceptNetWeight) {
		this.eocmAcceptNetWeight = eocmAcceptNetWeight;
		addValidField("eocmAcceptNetWeight");
	}

	/**
	 * Get eocmAcceptVolume
	 */
	@Column(name = "EOCM_ACCEPT_VOLUME")
	public Double getEocmAcceptVolume() {
		return eocmAcceptVolume;
	}

	/**
	 * Set eocmAcceptVolume
	 */
	public void setEocmAcceptVolume(Double eocmAcceptVolume) {
		this.eocmAcceptVolume = eocmAcceptVolume;
		addValidField("eocmAcceptVolume");
	}

}
