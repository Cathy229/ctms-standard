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
 * Model class for EoEoom2Eose
 */
@Entity
@Table(name = "EO_EOOM_2_EOSE")
public class EoEoom2EoseModel extends BaseModel implements OperationLog {

	//eomeId
	private Long eomeId;
	//eomeEoseId
	private Long eomeEoseId;
	//eomeEoomId
	private Long eomeEoomId;
	//eomeBatchNo
	private String eomeBatchNo;
	//eomeEbmaId
	private Long eomeEbmaId;
	//eomeLineno
	private String eomeLineno;
	//eomeMaterialNo
	private String eomeMaterialNo;
	//eomeEbmaNameCn
	private String eomeEbmaNameCn;
	//eomeEbtpId
	private Long eomeEbtpId;
	//eomeEbtpModel
	private String eomeEbtpModel;
	//eomeEbtpPackage
	private String eomeEbtpPackage;
	//eomeEbtpPackageType
	private String eomeEbtpPackageType;
	//eomeHscode
	private String eomeHscode;
	//eomeGoodsCode
	private String eomeGoodsCode;
	//eomeCustomsProcedureCode
	private String eomeCustomsProcedureCode;
	//eomeCountryOfOriginCode
	private String eomeCountryOfOriginCode;
	//eomeUniConsignmentRefNo
	private String eomeUniConsignmentRefNo;
	//eomeQuarantineCode
	private String eomeQuarantineCode;
	//eomeQuarantineName
	private String eomeQuarantineName;
	//eomeType
	private String eomeType;
	//eomeStatus
	private String eomeStatus;
	//eomeEbmaDgClass
	private String eomeEbmaDgClass;
	//eomeEbmaDgCode
	private String eomeEbmaDgCode;
	//eomeDangerProperty
	private String eomeDangerProperty;
	//eomeIsDangerousFlag
	private String eomeIsDangerousFlag;
	//eomeDangerPackage
	private String eomeDangerPackage;
	//eomeDangerousPage
	private String eomeDangerousPage;
	//eomeDangerousLabel
	private String eomeDangerousLabel;
	//eomeDangerousFlashPoint
	private String eomeDangerousFlashPoint;
	//eomeDangerousEmsNo
	private String eomeDangerousEmsNo;
	//eomeMfagNo
	private String eomeMfagNo;
	//eomeMarinePollutantFlag
	private String eomeMarinePollutantFlag;
	//eomeEmergencyContact
	private String eomeEmergencyContact;
	//eomeDangeroseContactEm
	private String eomeDangeroseContactEm;
	//eomeDangeroseContactFax
	private String eomeDangeroseContactFax;
	//eomeDangeroseContactName
	private String eomeDangeroseContactName;
	//eomeEbmaIsTemperature
	private String eomeEbmaIsTemperature;
	//eomeEbmaFeatures
	private String eomeEbmaFeatures;
	//eomeIsFreezeFlag
	private String eomeIsFreezeFlag;
	//eomeTemperatureUnit
	private String eomeTemperatureUnit;
	//eomeTemperatureUnitName
	private String eomeTemperatureUnitName;
	//eomeEbmaTemperatureSetting
	private Double eomeEbmaTemperatureSetting;
	//eomeEbmaMinTemperature
	private Double eomeEbmaMinTemperature;
	//eomeEbmaMaxTemperature
	private Double eomeEbmaMaxTemperature;
	//eomeReeferVentilationFlux
	private String eomeReeferVentilationFlux;
	//eomeMark
	private String eomeMark;
	//eomeCntBulkFlag
	private String eomeCntBulkFlag;
	//eomeDescription
	private String eomeDescription;
	//eomeFreeTextDesc
	private String eomeFreeTextDesc;
	//eomeMaterialDescCn
	private String eomeMaterialDescCn;
	//eomeBatch
	private String eomeBatch;
	//eomeQuantity
	private Long eomeQuantity;
	//eomeQuantityUnit
	private String eomeQuantityUnit;
	//eomeGrossWeight
	private Long eomeGrossWeight;
	//eomeNetWeight
	private Long eomeNetWeight;
	//eomeVolume
	private Long eomeVolume;
	//eomeOverLengthFront
	private Double eomeOverLengthFront;
	//eomeOverLengthBack
	private Double eomeOverLengthBack;
	//eomeOverWidthLeft
	private Double eomeOverWidthLeft;
	//eomeOverWidthRight
	private Double eomeOverWidthRight;
	//eomeOverHeight
	private Double eomeOverHeight;
	//eomeMaterialTypeCode
	private String eomeMaterialTypeCode;
	//eomeMaterialTypeName
	private String eomeMaterialTypeName;
	//eomeIsBig
	private String eomeIsBig;
	//eomeLength
	private Double eomeLength;
	//eomeWidth
	private Double eomeWidth;
	//eomeHigh
	private Double eomeHigh;
	//eomePkgVolume
	private Double eomePkgVolume;
	//eomePkgTareWeight
	private Double eomePkgTareWeight;
	//eomePkgVolumeS
	private Double eomePkgVolumeS;
	//eomePkgTareWeightS
	private Double eomePkgTareWeightS;
	//eomePkgsCodeS
	private String eomePkgsCodeS;
	//eomePkgsNameS
	private String eomePkgsNameS;
	//eomeMaterialPackageNumberS
	private Integer eomeMaterialPackageNumberS;
	//eomeCtnStatus
	private String eomeCtnStatus;
	//eomeIsNormalFreeze
	private String eomeIsNormalFreeze;
	//eomeRemark
	private String eomeRemark;
	//eomeSubstr1
	private String eomeSubstr1;
	//eomeSubstr2
	private String eomeSubstr2;
	//eomeSubstr3
	private String eomeSubstr3;
	//eomeSubstr4
	private String eomeSubstr4;
	//eomeSubdate1
	private Date eomeSubdate1;
	//eomeSubdate2
	private Date eomeSubdate2;
	//eomeSubnum1
	private Long eomeSubnum1;
	//eomeSubnum2
	private Long eomeSubnum2;
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
	//eomeEbmaUnNo
	private String eomeEbmaUnNo;
	//eomeEdmfId
	private Long eomeEdmfId;
	//eomeEbmaNameEn
	private String eomeEbmaNameEn;
	//eomeEbmaDgSubclass
	private String eomeEbmaDgSubclass;
	//eomeVent
	private String eomeVent;
	//eomeHumidity
	private String eomeHumidity;

	/**
	 * Get eomeId
	 */
	@Column(name = "EOME_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEomeId() {
		return eomeId;
	}

	/**
	 * Set eomeId
	 */
	public void setEomeId(Long eomeId) {
		this.eomeId = eomeId;
		addValidField("eomeId");
	}

	/**
	 * Get eomeEoseId
	 */
	@Column(name = "EOME_EOSE_ID")
	public Long getEomeEoseId() {
		return eomeEoseId;
	}

	/**
	 * Set eomeEoseId
	 */
	public void setEomeEoseId(Long eomeEoseId) {
		this.eomeEoseId = eomeEoseId;
		addValidField("eomeEoseId");
	}

	/**
	 * Get eomeEoomId
	 */
	@Column(name = "EOME_EOOM_ID")
	public Long getEomeEoomId() {
		return eomeEoomId;
	}

	/**
	 * Set eomeEoomId
	 */
	public void setEomeEoomId(Long eomeEoomId) {
		this.eomeEoomId = eomeEoomId;
		addValidField("eomeEoomId");
	}

	/**
	 * Get eomeBatchNo
	 */
	@Column(name = "EOME_BATCH_NO")
	public String getEomeBatchNo() {
		return eomeBatchNo;
	}

	/**
	 * Set eomeBatchNo
	 */
	public void setEomeBatchNo(String eomeBatchNo) {
		this.eomeBatchNo = eomeBatchNo;
		addValidField("eomeBatchNo");
	}

	/**
	 * Get eomeEbmaId
	 */
	@Column(name = "EOME_EBMA_ID")
	public Long getEomeEbmaId() {
		return eomeEbmaId;
	}

	/**
	 * Set eomeEbmaId
	 */
	public void setEomeEbmaId(Long eomeEbmaId) {
		this.eomeEbmaId = eomeEbmaId;
		addValidField("eomeEbmaId");
	}

	/**
	 * Get eomeLineno
	 */
	@Column(name = "EOME_LINENO")
	public String getEomeLineno() {
		return eomeLineno;
	}

	/**
	 * Set eomeLineno
	 */
	public void setEomeLineno(String eomeLineno) {
		this.eomeLineno = eomeLineno;
		addValidField("eomeLineno");
	}

	/**
	 * Get eomeMaterialNo
	 */
	@Column(name = "EOME_MATERIAL_NO")
	public String getEomeMaterialNo() {
		return eomeMaterialNo;
	}

	/**
	 * Set eomeMaterialNo
	 */
	public void setEomeMaterialNo(String eomeMaterialNo) {
		this.eomeMaterialNo = eomeMaterialNo;
		addValidField("eomeMaterialNo");
	}

	/**
	 * Get eomeEbmaNameCn
	 */
	@Column(name = "EOME_EBMA_NAME_CN")
	public String getEomeEbmaNameCn() {
		return eomeEbmaNameCn;
	}

	/**
	 * Set eomeEbmaNameCn
	 */
	public void setEomeEbmaNameCn(String eomeEbmaNameCn) {
		this.eomeEbmaNameCn = eomeEbmaNameCn;
		addValidField("eomeEbmaNameCn");
	}

	/**
	 * Get eomeEbtpId
	 */
	@Column(name = "EOME_EBTP_ID")
	public Long getEomeEbtpId() {
		return eomeEbtpId;
	}

	/**
	 * Set eomeEbtpId
	 */
	public void setEomeEbtpId(Long eomeEbtpId) {
		this.eomeEbtpId = eomeEbtpId;
		addValidField("eomeEbtpId");
	}

	/**
	 * Get eomeEbtpModel
	 */
	@Column(name = "EOME_EBTP_MODEL")
	public String getEomeEbtpModel() {
		return eomeEbtpModel;
	}

	/**
	 * Set eomeEbtpModel
	 */
	public void setEomeEbtpModel(String eomeEbtpModel) {
		this.eomeEbtpModel = eomeEbtpModel;
		addValidField("eomeEbtpModel");
	}

	/**
	 * Get eomeEbtpPackage
	 */
	@Column(name = "EOME_EBTP_PACKAGE")
	public String getEomeEbtpPackage() {
		return eomeEbtpPackage;
	}

	/**
	 * Set eomeEbtpPackage
	 */
	public void setEomeEbtpPackage(String eomeEbtpPackage) {
		this.eomeEbtpPackage = eomeEbtpPackage;
		addValidField("eomeEbtpPackage");
	}

	/**
	 * Get eomeEbtpPackageType
	 */
	@Column(name = "EOME_EBTP_PACKAGE_TYPE")
	public String getEomeEbtpPackageType() {
		return eomeEbtpPackageType;
	}

	/**
	 * Set eomeEbtpPackageType
	 */
	public void setEomeEbtpPackageType(String eomeEbtpPackageType) {
		this.eomeEbtpPackageType = eomeEbtpPackageType;
		addValidField("eomeEbtpPackageType");
	}

	/**
	 * Get eomeHscode
	 */
	@Column(name = "EOME_HSCODE")
	public String getEomeHscode() {
		return eomeHscode;
	}

	/**
	 * Set eomeHscode
	 */
	public void setEomeHscode(String eomeHscode) {
		this.eomeHscode = eomeHscode;
		addValidField("eomeHscode");
	}

	/**
	 * Get eomeGoodsCode
	 */
	@Column(name = "EOME_GOODS_CODE")
	public String getEomeGoodsCode() {
		return eomeGoodsCode;
	}

	/**
	 * Set eomeGoodsCode
	 */
	public void setEomeGoodsCode(String eomeGoodsCode) {
		this.eomeGoodsCode = eomeGoodsCode;
		addValidField("eomeGoodsCode");
	}

	/**
	 * Get eomeCustomsProcedureCode
	 */
	@Column(name = "EOME_CUSTOMS_PROCEDURE_CODE")
	public String getEomeCustomsProcedureCode() {
		return eomeCustomsProcedureCode;
	}

	/**
	 * Set eomeCustomsProcedureCode
	 */
	public void setEomeCustomsProcedureCode(String eomeCustomsProcedureCode) {
		this.eomeCustomsProcedureCode = eomeCustomsProcedureCode;
		addValidField("eomeCustomsProcedureCode");
	}

	/**
	 * Get eomeCountryOfOriginCode
	 */
	@Column(name = "EOME_COUNTRY_OF_ORIGIN_CODE")
	public String getEomeCountryOfOriginCode() {
		return eomeCountryOfOriginCode;
	}

	/**
	 * Set eomeCountryOfOriginCode
	 */
	public void setEomeCountryOfOriginCode(String eomeCountryOfOriginCode) {
		this.eomeCountryOfOriginCode = eomeCountryOfOriginCode;
		addValidField("eomeCountryOfOriginCode");
	}

	/**
	 * Get eomeUniConsignmentRefNo
	 */
	@Column(name = "EOME_UNI_CONSIGNMENT_REF_NO")
	public String getEomeUniConsignmentRefNo() {
		return eomeUniConsignmentRefNo;
	}

	/**
	 * Set eomeUniConsignmentRefNo
	 */
	public void setEomeUniConsignmentRefNo(String eomeUniConsignmentRefNo) {
		this.eomeUniConsignmentRefNo = eomeUniConsignmentRefNo;
		addValidField("eomeUniConsignmentRefNo");
	}

	/**
	 * Get eomeQuarantineCode
	 */
	@Column(name = "EOME_QUARANTINE_CODE")
	public String getEomeQuarantineCode() {
		return eomeQuarantineCode;
	}

	/**
	 * Set eomeQuarantineCode
	 */
	public void setEomeQuarantineCode(String eomeQuarantineCode) {
		this.eomeQuarantineCode = eomeQuarantineCode;
		addValidField("eomeQuarantineCode");
	}

	/**
	 * Get eomeQuarantineName
	 */
	@Column(name = "EOME_QUARANTINE_NAME")
	public String getEomeQuarantineName() {
		return eomeQuarantineName;
	}

	/**
	 * Set eomeQuarantineName
	 */
	public void setEomeQuarantineName(String eomeQuarantineName) {
		this.eomeQuarantineName = eomeQuarantineName;
		addValidField("eomeQuarantineName");
	}

	/**
	 * Get eomeType
	 */
	@Column(name = "EOME_TYPE")
	public String getEomeType() {
		return eomeType;
	}

	/**
	 * Set eomeType
	 */
	public void setEomeType(String eomeType) {
		this.eomeType = eomeType;
		addValidField("eomeType");
	}

	/**
	 * Get eomeStatus
	 */
	@Column(name = "EOME_STATUS")
	public String getEomeStatus() {
		return eomeStatus;
	}

	/**
	 * Set eomeStatus
	 */
	public void setEomeStatus(String eomeStatus) {
		this.eomeStatus = eomeStatus;
		addValidField("eomeStatus");
	}

	/**
	 * Get eomeEbmaDgClass
	 */
	@Column(name = "EOME_EBMA_DG_CLASS")
	public String getEomeEbmaDgClass() {
		return eomeEbmaDgClass;
	}

	/**
	 * Set eomeEbmaDgClass
	 */
	public void setEomeEbmaDgClass(String eomeEbmaDgClass) {
		this.eomeEbmaDgClass = eomeEbmaDgClass;
		addValidField("eomeEbmaDgClass");
	}

	/**
	 * Get eomeEbmaDgCode
	 */
	@Column(name = "EOME_EBMA_DG_CODE")
	public String getEomeEbmaDgCode() {
		return eomeEbmaDgCode;
	}

	/**
	 * Set eomeEbmaDgCode
	 */
	public void setEomeEbmaDgCode(String eomeEbmaDgCode) {
		this.eomeEbmaDgCode = eomeEbmaDgCode;
		addValidField("eomeEbmaDgCode");
	}

	/**
	 * Get eomeDangerProperty
	 */
	@Column(name = "EOME_DANGER_PROPERTY")
	public String getEomeDangerProperty() {
		return eomeDangerProperty;
	}

	/**
	 * Set eomeDangerProperty
	 */
	public void setEomeDangerProperty(String eomeDangerProperty) {
		this.eomeDangerProperty = eomeDangerProperty;
		addValidField("eomeDangerProperty");
	}

	/**
	 * Get eomeIsDangerousFlag
	 */
	@Column(name = "EOME_IS_DANGEROUS_FLAG")
	public String getEomeIsDangerousFlag() {
		return eomeIsDangerousFlag;
	}

	/**
	 * Set eomeIsDangerousFlag
	 */
	public void setEomeIsDangerousFlag(String eomeIsDangerousFlag) {
		this.eomeIsDangerousFlag = eomeIsDangerousFlag;
		addValidField("eomeIsDangerousFlag");
	}

	/**
	 * Get eomeDangerPackage
	 */
	@Column(name = "EOME_DANGER_PACKAGE")
	public String getEomeDangerPackage() {
		return eomeDangerPackage;
	}

	/**
	 * Set eomeDangerPackage
	 */
	public void setEomeDangerPackage(String eomeDangerPackage) {
		this.eomeDangerPackage = eomeDangerPackage;
		addValidField("eomeDangerPackage");
	}

	/**
	 * Get eomeDangerousPage
	 */
	@Column(name = "EOME_DANGEROUS_PAGE")
	public String getEomeDangerousPage() {
		return eomeDangerousPage;
	}

	/**
	 * Set eomeDangerousPage
	 */
	public void setEomeDangerousPage(String eomeDangerousPage) {
		this.eomeDangerousPage = eomeDangerousPage;
		addValidField("eomeDangerousPage");
	}

	/**
	 * Get eomeDangerousLabel
	 */
	@Column(name = "EOME_DANGEROUS_LABEL")
	public String getEomeDangerousLabel() {
		return eomeDangerousLabel;
	}

	/**
	 * Set eomeDangerousLabel
	 */
	public void setEomeDangerousLabel(String eomeDangerousLabel) {
		this.eomeDangerousLabel = eomeDangerousLabel;
		addValidField("eomeDangerousLabel");
	}

	/**
	 * Get eomeDangerousFlashPoint
	 */
	@Column(name = "EOME_DANGEROUS_FLASH_POINT")
	public String getEomeDangerousFlashPoint() {
		return eomeDangerousFlashPoint;
	}

	/**
	 * Set eomeDangerousFlashPoint
	 */
	public void setEomeDangerousFlashPoint(String eomeDangerousFlashPoint) {
		this.eomeDangerousFlashPoint = eomeDangerousFlashPoint;
		addValidField("eomeDangerousFlashPoint");
	}

	/**
	 * Get eomeDangerousEmsNo
	 */
	@Column(name = "EOME_DANGEROUS_EMS_NO")
	public String getEomeDangerousEmsNo() {
		return eomeDangerousEmsNo;
	}

	/**
	 * Set eomeDangerousEmsNo
	 */
	public void setEomeDangerousEmsNo(String eomeDangerousEmsNo) {
		this.eomeDangerousEmsNo = eomeDangerousEmsNo;
		addValidField("eomeDangerousEmsNo");
	}

	/**
	 * Get eomeMfagNo
	 */
	@Column(name = "EOME_MFAG_NO")
	public String getEomeMfagNo() {
		return eomeMfagNo;
	}

	/**
	 * Set eomeMfagNo
	 */
	public void setEomeMfagNo(String eomeMfagNo) {
		this.eomeMfagNo = eomeMfagNo;
		addValidField("eomeMfagNo");
	}

	/**
	 * Get eomeMarinePollutantFlag
	 */
	@Column(name = "EOME_MARINE_POLLUTANT_FLAG")
	public String getEomeMarinePollutantFlag() {
		return eomeMarinePollutantFlag;
	}

	/**
	 * Set eomeMarinePollutantFlag
	 */
	public void setEomeMarinePollutantFlag(String eomeMarinePollutantFlag) {
		this.eomeMarinePollutantFlag = eomeMarinePollutantFlag;
		addValidField("eomeMarinePollutantFlag");
	}

	/**
	 * Get eomeEmergencyContact
	 */
	@Column(name = "EOME_EMERGENCY_CONTACT")
	public String getEomeEmergencyContact() {
		return eomeEmergencyContact;
	}

	/**
	 * Set eomeEmergencyContact
	 */
	public void setEomeEmergencyContact(String eomeEmergencyContact) {
		this.eomeEmergencyContact = eomeEmergencyContact;
		addValidField("eomeEmergencyContact");
	}

	/**
	 * Get eomeDangeroseContactEm
	 */
	@Column(name = "EOME_DANGEROSE_CONTACT_EM")
	public String getEomeDangeroseContactEm() {
		return eomeDangeroseContactEm;
	}

	/**
	 * Set eomeDangeroseContactEm
	 */
	public void setEomeDangeroseContactEm(String eomeDangeroseContactEm) {
		this.eomeDangeroseContactEm = eomeDangeroseContactEm;
		addValidField("eomeDangeroseContactEm");
	}

	/**
	 * Get eomeDangeroseContactFax
	 */
	@Column(name = "EOME_DANGEROSE_CONTACT_FAX")
	public String getEomeDangeroseContactFax() {
		return eomeDangeroseContactFax;
	}

	/**
	 * Set eomeDangeroseContactFax
	 */
	public void setEomeDangeroseContactFax(String eomeDangeroseContactFax) {
		this.eomeDangeroseContactFax = eomeDangeroseContactFax;
		addValidField("eomeDangeroseContactFax");
	}

	/**
	 * Get eomeDangeroseContactName
	 */
	@Column(name = "EOME_DANGEROSE_CONTACT_NAME")
	public String getEomeDangeroseContactName() {
		return eomeDangeroseContactName;
	}

	/**
	 * Set eomeDangeroseContactName
	 */
	public void setEomeDangeroseContactName(String eomeDangeroseContactName) {
		this.eomeDangeroseContactName = eomeDangeroseContactName;
		addValidField("eomeDangeroseContactName");
	}

	/**
	 * Get eomeEbmaIsTemperature
	 */
	@Column(name = "EOME_EBMA_IS_TEMPERATURE")
	public String getEomeEbmaIsTemperature() {
		return eomeEbmaIsTemperature;
	}

	/**
	 * Set eomeEbmaIsTemperature
	 */
	public void setEomeEbmaIsTemperature(String eomeEbmaIsTemperature) {
		this.eomeEbmaIsTemperature = eomeEbmaIsTemperature;
		addValidField("eomeEbmaIsTemperature");
	}

	/**
	 * Get eomeEbmaFeatures
	 */
	@Column(name = "EOME_EBMA_FEATURES")
	public String getEomeEbmaFeatures() {
		return eomeEbmaFeatures;
	}

	/**
	 * Set eomeEbmaFeatures
	 */
	public void setEomeEbmaFeatures(String eomeEbmaFeatures) {
		this.eomeEbmaFeatures = eomeEbmaFeatures;
		addValidField("eomeEbmaFeatures");
	}

	/**
	 * Get eomeIsFreezeFlag
	 */
	@Column(name = "EOME_IS_FREEZE_FLAG")
	public String getEomeIsFreezeFlag() {
		return eomeIsFreezeFlag;
	}

	/**
	 * Set eomeIsFreezeFlag
	 */
	public void setEomeIsFreezeFlag(String eomeIsFreezeFlag) {
		this.eomeIsFreezeFlag = eomeIsFreezeFlag;
		addValidField("eomeIsFreezeFlag");
	}

	/**
	 * Get eomeTemperatureUnit
	 */
	@Column(name = "EOME_TEMPERATURE_UNIT")
	public String getEomeTemperatureUnit() {
		return eomeTemperatureUnit;
	}

	/**
	 * Set eomeTemperatureUnit
	 */
	public void setEomeTemperatureUnit(String eomeTemperatureUnit) {
		this.eomeTemperatureUnit = eomeTemperatureUnit;
		addValidField("eomeTemperatureUnit");
	}

	/**
	 * Get eomeTemperatureUnitName
	 */
	@Column(name = "EOME_TEMPERATURE_UNIT_NAME")
	public String getEomeTemperatureUnitName() {
		return eomeTemperatureUnitName;
	}

	/**
	 * Set eomeTemperatureUnitName
	 */
	public void setEomeTemperatureUnitName(String eomeTemperatureUnitName) {
		this.eomeTemperatureUnitName = eomeTemperatureUnitName;
		addValidField("eomeTemperatureUnitName");
	}

	/**
	 * Get eomeEbmaTemperatureSetting
	 */
	@Column(name = "EOME_EBMA_TEMPERATURE_SETTING")
	public Double getEomeEbmaTemperatureSetting() {
		return eomeEbmaTemperatureSetting;
	}

	/**
	 * Set eomeEbmaTemperatureSetting
	 */
	public void setEomeEbmaTemperatureSetting(Double eomeEbmaTemperatureSetting) {
		this.eomeEbmaTemperatureSetting = eomeEbmaTemperatureSetting;
		addValidField("eomeEbmaTemperatureSetting");
	}

	/**
	 * Get eomeEbmaMinTemperature
	 */
	@Column(name = "EOME_EBMA_MIN_TEMPERATURE")
	public Double getEomeEbmaMinTemperature() {
		return eomeEbmaMinTemperature;
	}

	/**
	 * Set eomeEbmaMinTemperature
	 */
	public void setEomeEbmaMinTemperature(Double eomeEbmaMinTemperature) {
		this.eomeEbmaMinTemperature = eomeEbmaMinTemperature;
		addValidField("eomeEbmaMinTemperature");
	}

	/**
	 * Get eomeEbmaMaxTemperature
	 */
	@Column(name = "EOME_EBMA_MAX_TEMPERATURE")
	public Double getEomeEbmaMaxTemperature() {
		return eomeEbmaMaxTemperature;
	}

	/**
	 * Set eomeEbmaMaxTemperature
	 */
	public void setEomeEbmaMaxTemperature(Double eomeEbmaMaxTemperature) {
		this.eomeEbmaMaxTemperature = eomeEbmaMaxTemperature;
		addValidField("eomeEbmaMaxTemperature");
	}

	/**
	 * Get eomeReeferVentilationFlux
	 */
	@Column(name = "EOME_REEFER_VENTILATION_FLUX")
	public String getEomeReeferVentilationFlux() {
		return eomeReeferVentilationFlux;
	}

	/**
	 * Set eomeReeferVentilationFlux
	 */
	public void setEomeReeferVentilationFlux(String eomeReeferVentilationFlux) {
		this.eomeReeferVentilationFlux = eomeReeferVentilationFlux;
		addValidField("eomeReeferVentilationFlux");
	}

	/**
	 * Get eomeMark
	 */
	@Column(name = "EOME_MARK")
	public String getEomeMark() {
		return eomeMark;
	}

	/**
	 * Set eomeMark
	 */
	public void setEomeMark(String eomeMark) {
		this.eomeMark = eomeMark;
		addValidField("eomeMark");
	}

	/**
	 * Get eomeCntBulkFlag
	 */
	@Column(name = "EOME_CNT_BULK_FLAG")
	public String getEomeCntBulkFlag() {
		return eomeCntBulkFlag;
	}

	/**
	 * Set eomeCntBulkFlag
	 */
	public void setEomeCntBulkFlag(String eomeCntBulkFlag) {
		this.eomeCntBulkFlag = eomeCntBulkFlag;
		addValidField("eomeCntBulkFlag");
	}

	/**
	 * Get eomeDescription
	 */
	@Column(name = "EOME_DESCRIPTION")
	public String getEomeDescription() {
		return eomeDescription;
	}

	/**
	 * Set eomeDescription
	 */
	public void setEomeDescription(String eomeDescription) {
		this.eomeDescription = eomeDescription;
		addValidField("eomeDescription");
	}

	/**
	 * Get eomeFreeTextDesc
	 */
	@Column(name = "EOME_FREE_TEXT_DESC")
	public String getEomeFreeTextDesc() {
		return eomeFreeTextDesc;
	}

	/**
	 * Set eomeFreeTextDesc
	 */
	public void setEomeFreeTextDesc(String eomeFreeTextDesc) {
		this.eomeFreeTextDesc = eomeFreeTextDesc;
		addValidField("eomeFreeTextDesc");
	}

	/**
	 * Get eomeMaterialDescCn
	 */
	@Column(name = "EOME_MATERIAL_DESC_CN")
	public String getEomeMaterialDescCn() {
		return eomeMaterialDescCn;
	}

	/**
	 * Set eomeMaterialDescCn
	 */
	public void setEomeMaterialDescCn(String eomeMaterialDescCn) {
		this.eomeMaterialDescCn = eomeMaterialDescCn;
		addValidField("eomeMaterialDescCn");
	}

	/**
	 * Get eomeBatch
	 */
	@Column(name = "EOME_BATCH")
	public String getEomeBatch() {
		return eomeBatch;
	}

	/**
	 * Set eomeBatch
	 */
	public void setEomeBatch(String eomeBatch) {
		this.eomeBatch = eomeBatch;
		addValidField("eomeBatch");
	}

	/**
	 * Get eomeQuantity
	 */
	@Column(name = "EOME_QUANTITY")
	public Long getEomeQuantity() {
		return eomeQuantity;
	}

	/**
	 * Set eomeQuantity
	 */
	public void setEomeQuantity(Long eomeQuantity) {
		this.eomeQuantity = eomeQuantity;
		addValidField("eomeQuantity");
	}

	/**
	 * Get eomeQuantityUnit
	 */
	@Column(name = "EOME_QUANTITY_UNIT")
	public String getEomeQuantityUnit() {
		return eomeQuantityUnit;
	}

	/**
	 * Set eomeQuantityUnit
	 */
	public void setEomeQuantityUnit(String eomeQuantityUnit) {
		this.eomeQuantityUnit = eomeQuantityUnit;
		addValidField("eomeQuantityUnit");
	}

	/**
	 * Get eomeGrossWeight
	 */
	@Column(name = "EOME_GROSS_WEIGHT")
	public Long getEomeGrossWeight() {
		return eomeGrossWeight;
	}

	/**
	 * Set eomeGrossWeight
	 */
	public void setEomeGrossWeight(Long eomeGrossWeight) {
		this.eomeGrossWeight = eomeGrossWeight;
		addValidField("eomeGrossWeight");
	}

	/**
	 * Get eomeNetWeight
	 */
	@Column(name = "EOME_NET_WEIGHT")
	public Long getEomeNetWeight() {
		return eomeNetWeight;
	}

	/**
	 * Set eomeNetWeight
	 */
	public void setEomeNetWeight(Long eomeNetWeight) {
		this.eomeNetWeight = eomeNetWeight;
		addValidField("eomeNetWeight");
	}

	/**
	 * Get eomeVolume
	 */
	@Column(name = "EOME_VOLUME")
	public Long getEomeVolume() {
		return eomeVolume;
	}

	/**
	 * Set eomeVolume
	 */
	public void setEomeVolume(Long eomeVolume) {
		this.eomeVolume = eomeVolume;
		addValidField("eomeVolume");
	}

	/**
	 * Get eomeOverLengthFront
	 */
	@Column(name = "EOME_OVER_LENGTH_FRONT")
	public Double getEomeOverLengthFront() {
		return eomeOverLengthFront;
	}

	/**
	 * Set eomeOverLengthFront
	 */
	public void setEomeOverLengthFront(Double eomeOverLengthFront) {
		this.eomeOverLengthFront = eomeOverLengthFront;
		addValidField("eomeOverLengthFront");
	}

	/**
	 * Get eomeOverLengthBack
	 */
	@Column(name = "EOME_OVER_LENGTH_BACK")
	public Double getEomeOverLengthBack() {
		return eomeOverLengthBack;
	}

	/**
	 * Set eomeOverLengthBack
	 */
	public void setEomeOverLengthBack(Double eomeOverLengthBack) {
		this.eomeOverLengthBack = eomeOverLengthBack;
		addValidField("eomeOverLengthBack");
	}

	/**
	 * Get eomeOverWidthLeft
	 */
	@Column(name = "EOME_OVER_WIDTH_LEFT")
	public Double getEomeOverWidthLeft() {
		return eomeOverWidthLeft;
	}

	/**
	 * Set eomeOverWidthLeft
	 */
	public void setEomeOverWidthLeft(Double eomeOverWidthLeft) {
		this.eomeOverWidthLeft = eomeOverWidthLeft;
		addValidField("eomeOverWidthLeft");
	}

	/**
	 * Get eomeOverWidthRight
	 */
	@Column(name = "EOME_OVER_WIDTH_RIGHT")
	public Double getEomeOverWidthRight() {
		return eomeOverWidthRight;
	}

	/**
	 * Set eomeOverWidthRight
	 */
	public void setEomeOverWidthRight(Double eomeOverWidthRight) {
		this.eomeOverWidthRight = eomeOverWidthRight;
		addValidField("eomeOverWidthRight");
	}

	/**
	 * Get eomeOverHeight
	 */
	@Column(name = "EOME_OVER_HEIGHT")
	public Double getEomeOverHeight() {
		return eomeOverHeight;
	}

	/**
	 * Set eomeOverHeight
	 */
	public void setEomeOverHeight(Double eomeOverHeight) {
		this.eomeOverHeight = eomeOverHeight;
		addValidField("eomeOverHeight");
	}

	/**
	 * Get eomeMaterialTypeCode
	 */
	@Column(name = "EOME_MATERIAL_TYPE_CODE")
	public String getEomeMaterialTypeCode() {
		return eomeMaterialTypeCode;
	}

	/**
	 * Set eomeMaterialTypeCode
	 */
	public void setEomeMaterialTypeCode(String eomeMaterialTypeCode) {
		this.eomeMaterialTypeCode = eomeMaterialTypeCode;
		addValidField("eomeMaterialTypeCode");
	}

	/**
	 * Get eomeMaterialTypeName
	 */
	@Column(name = "EOME_MATERIAL_TYPE_NAME")
	public String getEomeMaterialTypeName() {
		return eomeMaterialTypeName;
	}

	/**
	 * Set eomeMaterialTypeName
	 */
	public void setEomeMaterialTypeName(String eomeMaterialTypeName) {
		this.eomeMaterialTypeName = eomeMaterialTypeName;
		addValidField("eomeMaterialTypeName");
	}

	/**
	 * Get eomeIsBig
	 */
	@Column(name = "EOME_IS_BIG")
	public String getEomeIsBig() {
		return eomeIsBig;
	}

	/**
	 * Set eomeIsBig
	 */
	public void setEomeIsBig(String eomeIsBig) {
		this.eomeIsBig = eomeIsBig;
		addValidField("eomeIsBig");
	}

	/**
	 * Get eomeLength
	 */
	@Column(name = "EOME_LENGTH")
	public Double getEomeLength() {
		return eomeLength;
	}

	/**
	 * Set eomeLength
	 */
	public void setEomeLength(Double eomeLength) {
		this.eomeLength = eomeLength;
		addValidField("eomeLength");
	}

	/**
	 * Get eomeWidth
	 */
	@Column(name = "EOME_WIDTH")
	public Double getEomeWidth() {
		return eomeWidth;
	}

	/**
	 * Set eomeWidth
	 */
	public void setEomeWidth(Double eomeWidth) {
		this.eomeWidth = eomeWidth;
		addValidField("eomeWidth");
	}

	/**
	 * Get eomeHigh
	 */
	@Column(name = "EOME_HIGH")
	public Double getEomeHigh() {
		return eomeHigh;
	}

	/**
	 * Set eomeHigh
	 */
	public void setEomeHigh(Double eomeHigh) {
		this.eomeHigh = eomeHigh;
		addValidField("eomeHigh");
	}

	/**
	 * Get eomePkgVolume
	 */
	@Column(name = "EOME_PKG_VOLUME")
	public Double getEomePkgVolume() {
		return eomePkgVolume;
	}

	/**
	 * Set eomePkgVolume
	 */
	public void setEomePkgVolume(Double eomePkgVolume) {
		this.eomePkgVolume = eomePkgVolume;
		addValidField("eomePkgVolume");
	}

	/**
	 * Get eomePkgTareWeight
	 */
	@Column(name = "EOME_PKG_TARE_WEIGHT")
	public Double getEomePkgTareWeight() {
		return eomePkgTareWeight;
	}

	/**
	 * Set eomePkgTareWeight
	 */
	public void setEomePkgTareWeight(Double eomePkgTareWeight) {
		this.eomePkgTareWeight = eomePkgTareWeight;
		addValidField("eomePkgTareWeight");
	}

	/**
	 * Get eomePkgVolumeS
	 */
	@Column(name = "EOME_PKG_VOLUME_S")
	public Double getEomePkgVolumeS() {
		return eomePkgVolumeS;
	}

	/**
	 * Set eomePkgVolumeS
	 */
	public void setEomePkgVolumeS(Double eomePkgVolumeS) {
		this.eomePkgVolumeS = eomePkgVolumeS;
		addValidField("eomePkgVolumeS");
	}

	/**
	 * Get eomePkgTareWeightS
	 */
	@Column(name = "EOME_PKG_TARE_WEIGHT_S")
	public Double getEomePkgTareWeightS() {
		return eomePkgTareWeightS;
	}

	/**
	 * Set eomePkgTareWeightS
	 */
	public void setEomePkgTareWeightS(Double eomePkgTareWeightS) {
		this.eomePkgTareWeightS = eomePkgTareWeightS;
		addValidField("eomePkgTareWeightS");
	}

	/**
	 * Get eomePkgsCodeS
	 */
	@Column(name = "EOME_PKGS_CODE_S")
	public String getEomePkgsCodeS() {
		return eomePkgsCodeS;
	}

	/**
	 * Set eomePkgsCodeS
	 */
	public void setEomePkgsCodeS(String eomePkgsCodeS) {
		this.eomePkgsCodeS = eomePkgsCodeS;
		addValidField("eomePkgsCodeS");
	}

	/**
	 * Get eomePkgsNameS
	 */
	@Column(name = "EOME_PKGS_NAME_S")
	public String getEomePkgsNameS() {
		return eomePkgsNameS;
	}

	/**
	 * Set eomePkgsNameS
	 */
	public void setEomePkgsNameS(String eomePkgsNameS) {
		this.eomePkgsNameS = eomePkgsNameS;
		addValidField("eomePkgsNameS");
	}

	/**
	 * Get eomeMaterialPackageNumberS
	 */
	@Column(name = "EOME_MATERIAL_PACKAGE_NUMBER_S")
	public Integer getEomeMaterialPackageNumberS() {
		return eomeMaterialPackageNumberS;
	}

	/**
	 * Set eomeMaterialPackageNumberS
	 */
	public void setEomeMaterialPackageNumberS(Integer eomeMaterialPackageNumberS) {
		this.eomeMaterialPackageNumberS = eomeMaterialPackageNumberS;
		addValidField("eomeMaterialPackageNumberS");
	}

	/**
	 * Get eomeCtnStatus
	 */
	@Column(name = "EOME_CTN_STATUS")
	public String getEomeCtnStatus() {
		return eomeCtnStatus;
	}

	/**
	 * Set eomeCtnStatus
	 */
	public void setEomeCtnStatus(String eomeCtnStatus) {
		this.eomeCtnStatus = eomeCtnStatus;
		addValidField("eomeCtnStatus");
	}

	/**
	 * Get eomeIsNormalFreeze
	 */
	@Column(name = "EOME_IS_NORMAL_FREEZE")
	public String getEomeIsNormalFreeze() {
		return eomeIsNormalFreeze;
	}

	/**
	 * Set eomeIsNormalFreeze
	 */
	public void setEomeIsNormalFreeze(String eomeIsNormalFreeze) {
		this.eomeIsNormalFreeze = eomeIsNormalFreeze;
		addValidField("eomeIsNormalFreeze");
	}

	/**
	 * Get eomeRemark
	 */
	@Column(name = "EOME_REMARK")
	public String getEomeRemark() {
		return eomeRemark;
	}

	/**
	 * Set eomeRemark
	 */
	public void setEomeRemark(String eomeRemark) {
		this.eomeRemark = eomeRemark;
		addValidField("eomeRemark");
	}

	/**
	 * Get eomeSubstr1
	 */
	@Column(name = "EOME_SUBSTR1")
	public String getEomeSubstr1() {
		return eomeSubstr1;
	}

	/**
	 * Set eomeSubstr1
	 */
	public void setEomeSubstr1(String eomeSubstr1) {
		this.eomeSubstr1 = eomeSubstr1;
		addValidField("eomeSubstr1");
	}

	/**
	 * Get eomeSubstr2
	 */
	@Column(name = "EOME_SUBSTR2")
	public String getEomeSubstr2() {
		return eomeSubstr2;
	}

	/**
	 * Set eomeSubstr2
	 */
	public void setEomeSubstr2(String eomeSubstr2) {
		this.eomeSubstr2 = eomeSubstr2;
		addValidField("eomeSubstr2");
	}

	/**
	 * Get eomeSubstr3
	 */
	@Column(name = "EOME_SUBSTR3")
	public String getEomeSubstr3() {
		return eomeSubstr3;
	}

	/**
	 * Set eomeSubstr3
	 */
	public void setEomeSubstr3(String eomeSubstr3) {
		this.eomeSubstr3 = eomeSubstr3;
		addValidField("eomeSubstr3");
	}

	/**
	 * Get eomeSubstr4
	 */
	@Column(name = "EOME_SUBSTR4")
	public String getEomeSubstr4() {
		return eomeSubstr4;
	}

	/**
	 * Set eomeSubstr4
	 */
	public void setEomeSubstr4(String eomeSubstr4) {
		this.eomeSubstr4 = eomeSubstr4;
		addValidField("eomeSubstr4");
	}

	/**
	 * Get eomeSubdate1
	 */
	@Column(name = "EOME_SUBDATE1")
	public Date getEomeSubdate1() {
		return eomeSubdate1;
	}

	/**
	 * Set eomeSubdate1
	 */
	public void setEomeSubdate1(Date eomeSubdate1) {
		this.eomeSubdate1 = eomeSubdate1;
		addValidField("eomeSubdate1");
	}

	/**
	 * Get eomeSubdate2
	 */
	@Column(name = "EOME_SUBDATE2")
	public Date getEomeSubdate2() {
		return eomeSubdate2;
	}

	/**
	 * Set eomeSubdate2
	 */
	public void setEomeSubdate2(Date eomeSubdate2) {
		this.eomeSubdate2 = eomeSubdate2;
		addValidField("eomeSubdate2");
	}

	/**
	 * Get eomeSubnum1
	 */
	@Column(name = "EOME_SUBNUM1")
	public Long getEomeSubnum1() {
		return eomeSubnum1;
	}

	/**
	 * Set eomeSubnum1
	 */
	public void setEomeSubnum1(Long eomeSubnum1) {
		this.eomeSubnum1 = eomeSubnum1;
		addValidField("eomeSubnum1");
	}

	/**
	 * Get eomeSubnum2
	 */
	@Column(name = "EOME_SUBNUM2")
	public Long getEomeSubnum2() {
		return eomeSubnum2;
	}

	/**
	 * Set eomeSubnum2
	 */
	public void setEomeSubnum2(Long eomeSubnum2) {
		this.eomeSubnum2 = eomeSubnum2;
		addValidField("eomeSubnum2");
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
	 * Get eomeEbmaUnNo
	 */
	@Column(name = "EOME_EBMA_UN_NO")
	public String getEomeEbmaUnNo() {
		return eomeEbmaUnNo;
	}

	/**
	 * Set eomeEbmaUnNo
	 */
	public void setEomeEbmaUnNo(String eomeEbmaUnNo) {
		this.eomeEbmaUnNo = eomeEbmaUnNo;
		addValidField("eomeEbmaUnNo");
	}

	/**
	 * Get eomeEdmfId
	 */
	@Column(name = "EOME_EDMF_ID")
	public Long getEomeEdmfId() {
		return eomeEdmfId;
	}

	/**
	 * Set eomeEdmfId
	 */
	public void setEomeEdmfId(Long eomeEdmfId) {
		this.eomeEdmfId = eomeEdmfId;
		addValidField("eomeEdmfId");
	}

	/**
	 * Get eomeEbmaNameEn
	 */
	@Column(name = "EOME_EBMA_NAME_EN")
	public String getEomeEbmaNameEn() {
		return eomeEbmaNameEn;
	}

	/**
	 * Set eomeEbmaNameEn
	 */
	public void setEomeEbmaNameEn(String eomeEbmaNameEn) {
		this.eomeEbmaNameEn = eomeEbmaNameEn;
		addValidField("eomeEbmaNameEn");
	}

	/**
	 * Get eomeEbmaDgSubclass
	 */
	@Column(name = "EOME_EBMA_DG_SUBCLASS")
	public String getEomeEbmaDgSubclass() {
		return eomeEbmaDgSubclass;
	}

	/**
	 * Set eomeEbmaDgSubclass
	 */
	public void setEomeEbmaDgSubclass(String eomeEbmaDgSubclass) {
		this.eomeEbmaDgSubclass = eomeEbmaDgSubclass;
		addValidField("eomeEbmaDgSubclass");
	}

	/**
	 * Get eomeVent
	 */
	@Column(name = "EOME_VENT")
	public String getEomeVent() {
		return eomeVent;
	}

	/**
	 * Set eomeVent
	 */
	public void setEomeVent(String eomeVent) {
		this.eomeVent = eomeVent;
		addValidField("eomeVent");
	}

	/**
	 * Get eomeHumidity
	 */
	@Column(name = "EOME_HUMIDITY")
	public String getEomeHumidity() {
		return eomeHumidity;
	}

	/**
	 * Set eomeHumidity
	 */
	public void setEomeHumidity(String eomeHumidity) {
		this.eomeHumidity = eomeHumidity;
		addValidField("eomeHumidity");
	}

}
