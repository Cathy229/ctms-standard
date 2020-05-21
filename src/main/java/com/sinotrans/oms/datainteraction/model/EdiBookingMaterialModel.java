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
 * Model class for EdiBookingMaterial
 */
@Entity
@Table(name = "EDI_BOOKING_MATERIAL")
public class EdiBookingMaterialModel extends BaseModel implements OperationLog {

	//edbmId
	private Long edbmId;
	//edbmEdboId
	private Long edbmEdboId;
	//edbmCargoSequenceNo
	private Integer edbmCargoSequenceNo;
	//edbmCargoCode
	private String edbmCargoCode;
	//edbmCargoFlag
	private String edbmCargoFlag;
	//edbmCargoPackageNumber
	private Integer edbmCargoPackageNumber;
	//edbmCargoPackageType
	private String edbmCargoPackageType;
	//edbmCargoPackageDesc
	private String edbmCargoPackageDesc;
	//edbmCargoPackageGrossWt
	private Double edbmCargoPackageGrossWt;
	//edbmCargoPackageMeasurement
	private Double edbmCargoPackageMeasurement;
	//edbmSecCargoPackageNumber
	private Integer edbmSecCargoPackageNumber;
	//edbmSecCargoPackageType
	private String edbmSecCargoPackageType;
	//edbmSecCargoPackageDesc
	private String edbmSecCargoPackageDesc;
	//edbmSecCargoPckGrossWt
	private Double edbmSecCargoPckGrossWt;
	//edbmSecCargoPackageMeasu
	private Double edbmSecCargoPackageMeasu;
	//edbmCargoGrossWeight
	private Double edbmCargoGrossWeight;
	//edbmCargoNetWeight
	private Double edbmCargoNetWeight;
	//edbmQuarantineCode
	private String edbmQuarantineCode;
	//edbmQuarantineName
	private String edbmQuarantineName;
	//edbmConsignCargoCost
	private Double edbmConsignCargoCost;
	//edbmCustomsProcedureCode
	private String edbmCustomsProcedureCode;
	//edbmCountryOfOriginCode
	private String edbmCountryOfOriginCode;
	//edbmUniConsignmentRefNo
	private String edbmUniConsignmentRefNo;
	//edbmDangerousClass
	private String edbmDangerousClass;
	//edbmDangerousPage
	private String edbmDangerousPage;
	//edbmDangerousUndgNo
	private String edbmDangerousUndgNo;
	//edbmDangerousLabel
	private String edbmDangerousLabel;
	//edbmDangerousFlashPoint
	private String edbmDangerousFlashPoint;
	//edbmDangerousEmsNo
	private String edbmDangerousEmsNo;
	//edbmMfagNo
	private String edbmMfagNo;
	//edbmMarinePollutantFlag
	private String edbmMarinePollutantFlag;
	//edbmEmergencyContact
	private String edbmEmergencyContact;
	//edbmReeferVentilationFlux
	private String edbmReeferVentilationFlux;
	//edbmTemperatureUnit
	private String edbmTemperatureUnit;
	//edbmTemperatureUnitName
	private String edbmTemperatureUnitName;
	//edbmTemperatureSetting
	private Double edbmTemperatureSetting;
	//edbmMinTemperature
	private Double edbmMinTemperature;
	//edbmMaxTemperature
	private Double edbmMaxTemperature;
	//edbmOverLengthFront
	private Double edbmOverLengthFront;
	//edbmOverLengthBack
	private Double edbmOverLengthBack;
	//edbmOverWidthLeft
	private Double edbmOverWidthLeft;
	//edbmOverWidthRight
	private Double edbmOverWidthRight;
	//edbmOverHeight
	private Double edbmOverHeight;
	//edbmDangeroseContactName
	private String edbmDangeroseContactName;
	//edbmDangeroseContactTel
	private String edbmDangeroseContactTel;
	//edbmDangeroseContactEm
	private String edbmDangeroseContactEm;
	//edbmDangeroseContactFax
	private String edbmDangeroseContactFax;
	//edbmMark
	private String edbmMark;
	//edbmCargoDescription
	private String edbmCargoDescription;
	//edbmSubstr1
	private String edbmSubstr1;
	//edbmSubstr2
	private String edbmSubstr2;
	//edbmSubstr3
	private String edbmSubstr3;
	//edbmSubstr4
	private String edbmSubstr4;
	//edbmSubstr5
	private String edbmSubstr5;
	//edbmSubstr6
	private String edbmSubstr6;
	//edbmSubstr7
	private String edbmSubstr7;
	//edbmSubstr8
	private String edbmSubstr8;
	//edbmSubdate1
	private Date edbmSubdate1;
	//edbmSubdate2
	private Date edbmSubdate2;
	//edbmSubdate3
	private Date edbmSubdate3;
	//edbmSubdate4
	private Date edbmSubdate4;
	//edbmSubnum1
	private Long edbmSubnum1;
	//edbmSubnum2
	private Long edbmSubnum2;
	//edbmSubnum3
	private Long edbmSubnum3;
	//edbmSubnum4
	private Long edbmSubnum4;
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
	 * Get edbmId
	 */
	@Column(name = "EDBM_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEdbmId() {
		return edbmId;
	}

	/**
	 * Set edbmId
	 */
	public void setEdbmId(Long edbmId) {
		this.edbmId = edbmId;
		addValidField("edbmId");
	}

	/**
	 * Get edbmEdboId
	 */
	@Column(name = "EDBM_EDBO_ID")
	public Long getEdbmEdboId() {
		return edbmEdboId;
	}

	/**
	 * Set edbmEdboId
	 */
	public void setEdbmEdboId(Long edbmEdboId) {
		this.edbmEdboId = edbmEdboId;
		addValidField("edbmEdboId");
	}

	/**
	 * Get edbmCargoSequenceNo
	 */
	@Column(name = "EDBM_CARGO_SEQUENCE_NO")
	public Integer getEdbmCargoSequenceNo() {
		return edbmCargoSequenceNo;
	}

	/**
	 * Set edbmCargoSequenceNo
	 */
	public void setEdbmCargoSequenceNo(Integer edbmCargoSequenceNo) {
		this.edbmCargoSequenceNo = edbmCargoSequenceNo;
		addValidField("edbmCargoSequenceNo");
	}

	/**
	 * Get edbmCargoCode
	 */
	@Column(name = "EDBM_CARGO_CODE")
	public String getEdbmCargoCode() {
		return edbmCargoCode;
	}

	/**
	 * Set edbmCargoCode
	 */
	public void setEdbmCargoCode(String edbmCargoCode) {
		this.edbmCargoCode = edbmCargoCode;
		addValidField("edbmCargoCode");
	}

	/**
	 * Get edbmCargoFlag
	 */
	@Column(name = "EDBM_CARGO_FLAG")
	public String getEdbmCargoFlag() {
		return edbmCargoFlag;
	}

	/**
	 * Set edbmCargoFlag
	 */
	public void setEdbmCargoFlag(String edbmCargoFlag) {
		this.edbmCargoFlag = edbmCargoFlag;
		addValidField("edbmCargoFlag");
	}

	/**
	 * Get edbmCargoPackageNumber
	 */
	@Column(name = "EDBM_CARGO_PACKAGE_NUMBER")
	public Integer getEdbmCargoPackageNumber() {
		return edbmCargoPackageNumber;
	}

	/**
	 * Set edbmCargoPackageNumber
	 */
	public void setEdbmCargoPackageNumber(Integer edbmCargoPackageNumber) {
		this.edbmCargoPackageNumber = edbmCargoPackageNumber;
		addValidField("edbmCargoPackageNumber");
	}

	/**
	 * Get edbmCargoPackageType
	 */
	@Column(name = "EDBM_CARGO_PACKAGE_TYPE")
	public String getEdbmCargoPackageType() {
		return edbmCargoPackageType;
	}

	/**
	 * Set edbmCargoPackageType
	 */
	public void setEdbmCargoPackageType(String edbmCargoPackageType) {
		this.edbmCargoPackageType = edbmCargoPackageType;
		addValidField("edbmCargoPackageType");
	}

	/**
	 * Get edbmCargoPackageDesc
	 */
	@Column(name = "EDBM_CARGO_PACKAGE_DESC")
	public String getEdbmCargoPackageDesc() {
		return edbmCargoPackageDesc;
	}

	/**
	 * Set edbmCargoPackageDesc
	 */
	public void setEdbmCargoPackageDesc(String edbmCargoPackageDesc) {
		this.edbmCargoPackageDesc = edbmCargoPackageDesc;
		addValidField("edbmCargoPackageDesc");
	}

	/**
	 * Get edbmCargoPackageGrossWt
	 */
	@Column(name = "EDBM_CARGO_PACKAGE_GROSS_WT")
	public Double getEdbmCargoPackageGrossWt() {
		return edbmCargoPackageGrossWt;
	}

	/**
	 * Set edbmCargoPackageGrossWt
	 */
	public void setEdbmCargoPackageGrossWt(Double edbmCargoPackageGrossWt) {
		this.edbmCargoPackageGrossWt = edbmCargoPackageGrossWt;
		addValidField("edbmCargoPackageGrossWt");
	}

	/**
	 * Get edbmCargoPackageMeasurement
	 */
	@Column(name = "EDBM_CARGO_PACKAGE_MEASUREMENT")
	public Double getEdbmCargoPackageMeasurement() {
		return edbmCargoPackageMeasurement;
	}

	/**
	 * Set edbmCargoPackageMeasurement
	 */
	public void setEdbmCargoPackageMeasurement(Double edbmCargoPackageMeasurement) {
		this.edbmCargoPackageMeasurement = edbmCargoPackageMeasurement;
		addValidField("edbmCargoPackageMeasurement");
	}

	/**
	 * Get edbmSecCargoPackageNumber
	 */
	@Column(name = "EDBM_SEC_CARGO_PACKAGE_NUMBER")
	public Integer getEdbmSecCargoPackageNumber() {
		return edbmSecCargoPackageNumber;
	}

	/**
	 * Set edbmSecCargoPackageNumber
	 */
	public void setEdbmSecCargoPackageNumber(Integer edbmSecCargoPackageNumber) {
		this.edbmSecCargoPackageNumber = edbmSecCargoPackageNumber;
		addValidField("edbmSecCargoPackageNumber");
	}

	/**
	 * Get edbmSecCargoPackageType
	 */
	@Column(name = "EDBM_SEC_CARGO_PACKAGE_TYPE")
	public String getEdbmSecCargoPackageType() {
		return edbmSecCargoPackageType;
	}

	/**
	 * Set edbmSecCargoPackageType
	 */
	public void setEdbmSecCargoPackageType(String edbmSecCargoPackageType) {
		this.edbmSecCargoPackageType = edbmSecCargoPackageType;
		addValidField("edbmSecCargoPackageType");
	}

	/**
	 * Get edbmSecCargoPackageDesc
	 */
	@Column(name = "EDBM_SEC_CARGO_PACKAGE_DESC")
	public String getEdbmSecCargoPackageDesc() {
		return edbmSecCargoPackageDesc;
	}

	/**
	 * Set edbmSecCargoPackageDesc
	 */
	public void setEdbmSecCargoPackageDesc(String edbmSecCargoPackageDesc) {
		this.edbmSecCargoPackageDesc = edbmSecCargoPackageDesc;
		addValidField("edbmSecCargoPackageDesc");
	}

	/**
	 * Get edbmSecCargoPckGrossWt
	 */
	@Column(name = "EDBM_SEC_CARGO_PCK_GROSS_WT")
	public Double getEdbmSecCargoPckGrossWt() {
		return edbmSecCargoPckGrossWt;
	}

	/**
	 * Set edbmSecCargoPckGrossWt
	 */
	public void setEdbmSecCargoPckGrossWt(Double edbmSecCargoPckGrossWt) {
		this.edbmSecCargoPckGrossWt = edbmSecCargoPckGrossWt;
		addValidField("edbmSecCargoPckGrossWt");
	}

	/**
	 * Get edbmSecCargoPackageMeasu
	 */
	@Column(name = "EDBM_SEC_CARGO_PACKAGE_MEASU")
	public Double getEdbmSecCargoPackageMeasu() {
		return edbmSecCargoPackageMeasu;
	}

	/**
	 * Set edbmSecCargoPackageMeasu
	 */
	public void setEdbmSecCargoPackageMeasu(Double edbmSecCargoPackageMeasu) {
		this.edbmSecCargoPackageMeasu = edbmSecCargoPackageMeasu;
		addValidField("edbmSecCargoPackageMeasu");
	}

	/**
	 * Get edbmCargoGrossWeight
	 */
	@Column(name = "EDBM_CARGO_GROSS_WEIGHT")
	public Double getEdbmCargoGrossWeight() {
		return edbmCargoGrossWeight;
	}

	/**
	 * Set edbmCargoGrossWeight
	 */
	public void setEdbmCargoGrossWeight(Double edbmCargoGrossWeight) {
		this.edbmCargoGrossWeight = edbmCargoGrossWeight;
		addValidField("edbmCargoGrossWeight");
	}

	/**
	 * Get edbmCargoNetWeight
	 */
	@Column(name = "EDBM_CARGO_NET_WEIGHT")
	public Double getEdbmCargoNetWeight() {
		return edbmCargoNetWeight;
	}

	/**
	 * Set edbmCargoNetWeight
	 */
	public void setEdbmCargoNetWeight(Double edbmCargoNetWeight) {
		this.edbmCargoNetWeight = edbmCargoNetWeight;
		addValidField("edbmCargoNetWeight");
	}

	/**
	 * Get edbmQuarantineCode
	 */
	@Column(name = "EDBM_QUARANTINE_CODE")
	public String getEdbmQuarantineCode() {
		return edbmQuarantineCode;
	}

	/**
	 * Set edbmQuarantineCode
	 */
	public void setEdbmQuarantineCode(String edbmQuarantineCode) {
		this.edbmQuarantineCode = edbmQuarantineCode;
		addValidField("edbmQuarantineCode");
	}

	/**
	 * Get edbmQuarantineName
	 */
	@Column(name = "EDBM_QUARANTINE_NAME")
	public String getEdbmQuarantineName() {
		return edbmQuarantineName;
	}

	/**
	 * Set edbmQuarantineName
	 */
	public void setEdbmQuarantineName(String edbmQuarantineName) {
		this.edbmQuarantineName = edbmQuarantineName;
		addValidField("edbmQuarantineName");
	}

	/**
	 * Get edbmConsignCargoCost
	 */
	@Column(name = "EDBM_CONSIGN_CARGO_COST")
	public Double getEdbmConsignCargoCost() {
		return edbmConsignCargoCost;
	}

	/**
	 * Set edbmConsignCargoCost
	 */
	public void setEdbmConsignCargoCost(Double edbmConsignCargoCost) {
		this.edbmConsignCargoCost = edbmConsignCargoCost;
		addValidField("edbmConsignCargoCost");
	}

	/**
	 * Get edbmCustomsProcedureCode
	 */
	@Column(name = "EDBM_CUSTOMS_PROCEDURE_CODE")
	public String getEdbmCustomsProcedureCode() {
		return edbmCustomsProcedureCode;
	}

	/**
	 * Set edbmCustomsProcedureCode
	 */
	public void setEdbmCustomsProcedureCode(String edbmCustomsProcedureCode) {
		this.edbmCustomsProcedureCode = edbmCustomsProcedureCode;
		addValidField("edbmCustomsProcedureCode");
	}

	/**
	 * Get edbmCountryOfOriginCode
	 */
	@Column(name = "EDBM_COUNTRY_OF_ORIGIN_CODE")
	public String getEdbmCountryOfOriginCode() {
		return edbmCountryOfOriginCode;
	}

	/**
	 * Set edbmCountryOfOriginCode
	 */
	public void setEdbmCountryOfOriginCode(String edbmCountryOfOriginCode) {
		this.edbmCountryOfOriginCode = edbmCountryOfOriginCode;
		addValidField("edbmCountryOfOriginCode");
	}

	/**
	 * Get edbmUniConsignmentRefNo
	 */
	@Column(name = "EDBM_UNI_CONSIGNMENT_REF_NO")
	public String getEdbmUniConsignmentRefNo() {
		return edbmUniConsignmentRefNo;
	}

	/**
	 * Set edbmUniConsignmentRefNo
	 */
	public void setEdbmUniConsignmentRefNo(String edbmUniConsignmentRefNo) {
		this.edbmUniConsignmentRefNo = edbmUniConsignmentRefNo;
		addValidField("edbmUniConsignmentRefNo");
	}

	/**
	 * Get edbmDangerousClass
	 */
	@Column(name = "EDBM_DANGEROUS_CLASS")
	public String getEdbmDangerousClass() {
		return edbmDangerousClass;
	}

	/**
	 * Set edbmDangerousClass
	 */
	public void setEdbmDangerousClass(String edbmDangerousClass) {
		this.edbmDangerousClass = edbmDangerousClass;
		addValidField("edbmDangerousClass");
	}

	/**
	 * Get edbmDangerousPage
	 */
	@Column(name = "EDBM_DANGEROUS_PAGE")
	public String getEdbmDangerousPage() {
		return edbmDangerousPage;
	}

	/**
	 * Set edbmDangerousPage
	 */
	public void setEdbmDangerousPage(String edbmDangerousPage) {
		this.edbmDangerousPage = edbmDangerousPage;
		addValidField("edbmDangerousPage");
	}

	/**
	 * Get edbmDangerousUndgNo
	 */
	@Column(name = "EDBM_DANGEROUS_UNDG_NO")
	public String getEdbmDangerousUndgNo() {
		return edbmDangerousUndgNo;
	}

	/**
	 * Set edbmDangerousUndgNo
	 */
	public void setEdbmDangerousUndgNo(String edbmDangerousUndgNo) {
		this.edbmDangerousUndgNo = edbmDangerousUndgNo;
		addValidField("edbmDangerousUndgNo");
	}

	/**
	 * Get edbmDangerousLabel
	 */
	@Column(name = "EDBM_DANGEROUS_LABEL")
	public String getEdbmDangerousLabel() {
		return edbmDangerousLabel;
	}

	/**
	 * Set edbmDangerousLabel
	 */
	public void setEdbmDangerousLabel(String edbmDangerousLabel) {
		this.edbmDangerousLabel = edbmDangerousLabel;
		addValidField("edbmDangerousLabel");
	}

	/**
	 * Get edbmDangerousFlashPoint
	 */
	@Column(name = "EDBM_DANGEROUS_FLASH_POINT")
	public String getEdbmDangerousFlashPoint() {
		return edbmDangerousFlashPoint;
	}

	/**
	 * Set edbmDangerousFlashPoint
	 */
	public void setEdbmDangerousFlashPoint(String edbmDangerousFlashPoint) {
		this.edbmDangerousFlashPoint = edbmDangerousFlashPoint;
		addValidField("edbmDangerousFlashPoint");
	}

	/**
	 * Get edbmDangerousEmsNo
	 */
	@Column(name = "EDBM_DANGEROUS_EMS_NO")
	public String getEdbmDangerousEmsNo() {
		return edbmDangerousEmsNo;
	}

	/**
	 * Set edbmDangerousEmsNo
	 */
	public void setEdbmDangerousEmsNo(String edbmDangerousEmsNo) {
		this.edbmDangerousEmsNo = edbmDangerousEmsNo;
		addValidField("edbmDangerousEmsNo");
	}

	/**
	 * Get edbmMfagNo
	 */
	@Column(name = "EDBM_MFAG_NO")
	public String getEdbmMfagNo() {
		return edbmMfagNo;
	}

	/**
	 * Set edbmMfagNo
	 */
	public void setEdbmMfagNo(String edbmMfagNo) {
		this.edbmMfagNo = edbmMfagNo;
		addValidField("edbmMfagNo");
	}

	/**
	 * Get edbmMarinePollutantFlag
	 */
	@Column(name = "EDBM_MARINE_POLLUTANT_FLAG")
	public String getEdbmMarinePollutantFlag() {
		return edbmMarinePollutantFlag;
	}

	/**
	 * Set edbmMarinePollutantFlag
	 */
	public void setEdbmMarinePollutantFlag(String edbmMarinePollutantFlag) {
		this.edbmMarinePollutantFlag = edbmMarinePollutantFlag;
		addValidField("edbmMarinePollutantFlag");
	}

	/**
	 * Get edbmEmergencyContact
	 */
	@Column(name = "EDBM_EMERGENCY_CONTACT")
	public String getEdbmEmergencyContact() {
		return edbmEmergencyContact;
	}

	/**
	 * Set edbmEmergencyContact
	 */
	public void setEdbmEmergencyContact(String edbmEmergencyContact) {
		this.edbmEmergencyContact = edbmEmergencyContact;
		addValidField("edbmEmergencyContact");
	}

	/**
	 * Get edbmReeferVentilationFlux
	 */
	@Column(name = "EDBM_REEFER_VENTILATION_FLUX")
	public String getEdbmReeferVentilationFlux() {
		return edbmReeferVentilationFlux;
	}

	/**
	 * Set edbmReeferVentilationFlux
	 */
	public void setEdbmReeferVentilationFlux(String edbmReeferVentilationFlux) {
		this.edbmReeferVentilationFlux = edbmReeferVentilationFlux;
		addValidField("edbmReeferVentilationFlux");
	}

	/**
	 * Get edbmTemperatureUnit
	 */
	@Column(name = "EDBM_TEMPERATURE_UNIT")
	public String getEdbmTemperatureUnit() {
		return edbmTemperatureUnit;
	}

	/**
	 * Set edbmTemperatureUnit
	 */
	public void setEdbmTemperatureUnit(String edbmTemperatureUnit) {
		this.edbmTemperatureUnit = edbmTemperatureUnit;
		addValidField("edbmTemperatureUnit");
	}

	/**
	 * Get edbmTemperatureUnitName
	 */
	@Column(name = "EDBM_TEMPERATURE_UNIT_NAME")
	public String getEdbmTemperatureUnitName() {
		return edbmTemperatureUnitName;
	}

	/**
	 * Set edbmTemperatureUnitName
	 */
	public void setEdbmTemperatureUnitName(String edbmTemperatureUnitName) {
		this.edbmTemperatureUnitName = edbmTemperatureUnitName;
		addValidField("edbmTemperatureUnitName");
	}

	/**
	 * Get edbmTemperatureSetting
	 */
	@Column(name = "EDBM_TEMPERATURE_SETTING")
	public Double getEdbmTemperatureSetting() {
		return edbmTemperatureSetting;
	}

	/**
	 * Set edbmTemperatureSetting
	 */
	public void setEdbmTemperatureSetting(Double edbmTemperatureSetting) {
		this.edbmTemperatureSetting = edbmTemperatureSetting;
		addValidField("edbmTemperatureSetting");
	}

	/**
	 * Get edbmMinTemperature
	 */
	@Column(name = "EDBM_MIN_TEMPERATURE")
	public Double getEdbmMinTemperature() {
		return edbmMinTemperature;
	}

	/**
	 * Set edbmMinTemperature
	 */
	public void setEdbmMinTemperature(Double edbmMinTemperature) {
		this.edbmMinTemperature = edbmMinTemperature;
		addValidField("edbmMinTemperature");
	}

	/**
	 * Get edbmMaxTemperature
	 */
	@Column(name = "EDBM_MAX_TEMPERATURE")
	public Double getEdbmMaxTemperature() {
		return edbmMaxTemperature;
	}

	/**
	 * Set edbmMaxTemperature
	 */
	public void setEdbmMaxTemperature(Double edbmMaxTemperature) {
		this.edbmMaxTemperature = edbmMaxTemperature;
		addValidField("edbmMaxTemperature");
	}

	/**
	 * Get edbmOverLengthFront
	 */
	@Column(name = "EDBM_OVER_LENGTH_FRONT")
	public Double getEdbmOverLengthFront() {
		return edbmOverLengthFront;
	}

	/**
	 * Set edbmOverLengthFront
	 */
	public void setEdbmOverLengthFront(Double edbmOverLengthFront) {
		this.edbmOverLengthFront = edbmOverLengthFront;
		addValidField("edbmOverLengthFront");
	}

	/**
	 * Get edbmOverLengthBack
	 */
	@Column(name = "EDBM_OVER_LENGTH_BACK")
	public Double getEdbmOverLengthBack() {
		return edbmOverLengthBack;
	}

	/**
	 * Set edbmOverLengthBack
	 */
	public void setEdbmOverLengthBack(Double edbmOverLengthBack) {
		this.edbmOverLengthBack = edbmOverLengthBack;
		addValidField("edbmOverLengthBack");
	}

	/**
	 * Get edbmOverWidthLeft
	 */
	@Column(name = "EDBM_OVER_WIDTH_LEFT")
	public Double getEdbmOverWidthLeft() {
		return edbmOverWidthLeft;
	}

	/**
	 * Set edbmOverWidthLeft
	 */
	public void setEdbmOverWidthLeft(Double edbmOverWidthLeft) {
		this.edbmOverWidthLeft = edbmOverWidthLeft;
		addValidField("edbmOverWidthLeft");
	}

	/**
	 * Get edbmOverWidthRight
	 */
	@Column(name = "EDBM_OVER_WIDTH_RIGHT")
	public Double getEdbmOverWidthRight() {
		return edbmOverWidthRight;
	}

	/**
	 * Set edbmOverWidthRight
	 */
	public void setEdbmOverWidthRight(Double edbmOverWidthRight) {
		this.edbmOverWidthRight = edbmOverWidthRight;
		addValidField("edbmOverWidthRight");
	}

	/**
	 * Get edbmOverHeight
	 */
	@Column(name = "EDBM_OVER_HEIGHT")
	public Double getEdbmOverHeight() {
		return edbmOverHeight;
	}

	/**
	 * Set edbmOverHeight
	 */
	public void setEdbmOverHeight(Double edbmOverHeight) {
		this.edbmOverHeight = edbmOverHeight;
		addValidField("edbmOverHeight");
	}

	/**
	 * Get edbmDangeroseContactName
	 */
	@Column(name = "EDBM_DANGEROSE_CONTACT_NAME")
	public String getEdbmDangeroseContactName() {
		return edbmDangeroseContactName;
	}

	/**
	 * Set edbmDangeroseContactName
	 */
	public void setEdbmDangeroseContactName(String edbmDangeroseContactName) {
		this.edbmDangeroseContactName = edbmDangeroseContactName;
		addValidField("edbmDangeroseContactName");
	}

	/**
	 * Get edbmDangeroseContactTel
	 */
	@Column(name = "EDBM_DANGEROSE_CONTACT_TEL")
	public String getEdbmDangeroseContactTel() {
		return edbmDangeroseContactTel;
	}

	/**
	 * Set edbmDangeroseContactTel
	 */
	public void setEdbmDangeroseContactTel(String edbmDangeroseContactTel) {
		this.edbmDangeroseContactTel = edbmDangeroseContactTel;
		addValidField("edbmDangeroseContactTel");
	}

	/**
	 * Get edbmDangeroseContactEm
	 */
	@Column(name = "EDBM_DANGEROSE_CONTACT_EM")
	public String getEdbmDangeroseContactEm() {
		return edbmDangeroseContactEm;
	}

	/**
	 * Set edbmDangeroseContactEm
	 */
	public void setEdbmDangeroseContactEm(String edbmDangeroseContactEm) {
		this.edbmDangeroseContactEm = edbmDangeroseContactEm;
		addValidField("edbmDangeroseContactEm");
	}

	/**
	 * Get edbmDangeroseContactFax
	 */
	@Column(name = "EDBM_DANGEROSE_CONTACT_FAX")
	public String getEdbmDangeroseContactFax() {
		return edbmDangeroseContactFax;
	}

	/**
	 * Set edbmDangeroseContactFax
	 */
	public void setEdbmDangeroseContactFax(String edbmDangeroseContactFax) {
		this.edbmDangeroseContactFax = edbmDangeroseContactFax;
		addValidField("edbmDangeroseContactFax");
	}

	/**
	 * Get edbmMark
	 */
	@Column(name = "EDBM_MARK")
	public String getEdbmMark() {
		return edbmMark;
	}

	/**
	 * Set edbmMark
	 */
	public void setEdbmMark(String edbmMark) {
		this.edbmMark = edbmMark;
		addValidField("edbmMark");
	}

	/**
	 * Get edbmCargoDescription
	 */
	@Column(name = "EDBM_CARGO_DESCRIPTION")
	public String getEdbmCargoDescription() {
		return edbmCargoDescription;
	}

	/**
	 * Set edbmCargoDescription
	 */
	public void setEdbmCargoDescription(String edbmCargoDescription) {
		this.edbmCargoDescription = edbmCargoDescription;
		addValidField("edbmCargoDescription");
	}

	/**
	 * Get edbmSubstr1
	 */
	@Column(name = "EDBM_SUBSTR1")
	public String getEdbmSubstr1() {
		return edbmSubstr1;
	}

	/**
	 * Set edbmSubstr1
	 */
	public void setEdbmSubstr1(String edbmSubstr1) {
		this.edbmSubstr1 = edbmSubstr1;
		addValidField("edbmSubstr1");
	}

	/**
	 * Get edbmSubstr2
	 */
	@Column(name = "EDBM_SUBSTR2")
	public String getEdbmSubstr2() {
		return edbmSubstr2;
	}

	/**
	 * Set edbmSubstr2
	 */
	public void setEdbmSubstr2(String edbmSubstr2) {
		this.edbmSubstr2 = edbmSubstr2;
		addValidField("edbmSubstr2");
	}

	/**
	 * Get edbmSubstr3
	 */
	@Column(name = "EDBM_SUBSTR3")
	public String getEdbmSubstr3() {
		return edbmSubstr3;
	}

	/**
	 * Set edbmSubstr3
	 */
	public void setEdbmSubstr3(String edbmSubstr3) {
		this.edbmSubstr3 = edbmSubstr3;
		addValidField("edbmSubstr3");
	}

	/**
	 * Get edbmSubstr4
	 */
	@Column(name = "EDBM_SUBSTR4")
	public String getEdbmSubstr4() {
		return edbmSubstr4;
	}

	/**
	 * Set edbmSubstr4
	 */
	public void setEdbmSubstr4(String edbmSubstr4) {
		this.edbmSubstr4 = edbmSubstr4;
		addValidField("edbmSubstr4");
	}

	/**
	 * Get edbmSubstr5
	 */
	@Column(name = "EDBM_SUBSTR5")
	public String getEdbmSubstr5() {
		return edbmSubstr5;
	}

	/**
	 * Set edbmSubstr5
	 */
	public void setEdbmSubstr5(String edbmSubstr5) {
		this.edbmSubstr5 = edbmSubstr5;
		addValidField("edbmSubstr5");
	}

	/**
	 * Get edbmSubstr6
	 */
	@Column(name = "EDBM_SUBSTR6")
	public String getEdbmSubstr6() {
		return edbmSubstr6;
	}

	/**
	 * Set edbmSubstr6
	 */
	public void setEdbmSubstr6(String edbmSubstr6) {
		this.edbmSubstr6 = edbmSubstr6;
		addValidField("edbmSubstr6");
	}

	/**
	 * Get edbmSubstr7
	 */
	@Column(name = "EDBM_SUBSTR7")
	public String getEdbmSubstr7() {
		return edbmSubstr7;
	}

	/**
	 * Set edbmSubstr7
	 */
	public void setEdbmSubstr7(String edbmSubstr7) {
		this.edbmSubstr7 = edbmSubstr7;
		addValidField("edbmSubstr7");
	}

	/**
	 * Get edbmSubstr8
	 */
	@Column(name = "EDBM_SUBSTR8")
	public String getEdbmSubstr8() {
		return edbmSubstr8;
	}

	/**
	 * Set edbmSubstr8
	 */
	public void setEdbmSubstr8(String edbmSubstr8) {
		this.edbmSubstr8 = edbmSubstr8;
		addValidField("edbmSubstr8");
	}

	/**
	 * Get edbmSubdate1
	 */
	@Column(name = "EDBM_SUBDATE1")
	public Date getEdbmSubdate1() {
		return edbmSubdate1;
	}

	/**
	 * Set edbmSubdate1
	 */
	public void setEdbmSubdate1(Date edbmSubdate1) {
		this.edbmSubdate1 = edbmSubdate1;
		addValidField("edbmSubdate1");
	}

	/**
	 * Get edbmSubdate2
	 */
	@Column(name = "EDBM_SUBDATE2")
	public Date getEdbmSubdate2() {
		return edbmSubdate2;
	}

	/**
	 * Set edbmSubdate2
	 */
	public void setEdbmSubdate2(Date edbmSubdate2) {
		this.edbmSubdate2 = edbmSubdate2;
		addValidField("edbmSubdate2");
	}

	/**
	 * Get edbmSubdate3
	 */
	@Column(name = "EDBM_SUBDATE3")
	public Date getEdbmSubdate3() {
		return edbmSubdate3;
	}

	/**
	 * Set edbmSubdate3
	 */
	public void setEdbmSubdate3(Date edbmSubdate3) {
		this.edbmSubdate3 = edbmSubdate3;
		addValidField("edbmSubdate3");
	}

	/**
	 * Get edbmSubdate4
	 */
	@Column(name = "EDBM_SUBDATE4")
	public Date getEdbmSubdate4() {
		return edbmSubdate4;
	}

	/**
	 * Set edbmSubdate4
	 */
	public void setEdbmSubdate4(Date edbmSubdate4) {
		this.edbmSubdate4 = edbmSubdate4;
		addValidField("edbmSubdate4");
	}

	/**
	 * Get edbmSubnum1
	 */
	@Column(name = "EDBM_SUBNUM1")
	public Long getEdbmSubnum1() {
		return edbmSubnum1;
	}

	/**
	 * Set edbmSubnum1
	 */
	public void setEdbmSubnum1(Long edbmSubnum1) {
		this.edbmSubnum1 = edbmSubnum1;
		addValidField("edbmSubnum1");
	}

	/**
	 * Get edbmSubnum2
	 */
	@Column(name = "EDBM_SUBNUM2")
	public Long getEdbmSubnum2() {
		return edbmSubnum2;
	}

	/**
	 * Set edbmSubnum2
	 */
	public void setEdbmSubnum2(Long edbmSubnum2) {
		this.edbmSubnum2 = edbmSubnum2;
		addValidField("edbmSubnum2");
	}

	/**
	 * Get edbmSubnum3
	 */
	@Column(name = "EDBM_SUBNUM3")
	public Long getEdbmSubnum3() {
		return edbmSubnum3;
	}

	/**
	 * Set edbmSubnum3
	 */
	public void setEdbmSubnum3(Long edbmSubnum3) {
		this.edbmSubnum3 = edbmSubnum3;
		addValidField("edbmSubnum3");
	}

	/**
	 * Get edbmSubnum4
	 */
	@Column(name = "EDBM_SUBNUM4")
	public Long getEdbmSubnum4() {
		return edbmSubnum4;
	}

	/**
	 * Set edbmSubnum4
	 */
	public void setEdbmSubnum4(Long edbmSubnum4) {
		this.edbmSubnum4 = edbmSubnum4;
		addValidField("edbmSubnum4");
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
