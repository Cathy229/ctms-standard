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
 * Model class for EdiBookingMaterialFeedback
 */
@Entity
@Table(name = "EDI_BOOKING_MATERIAL_FEEDBACK")
public class EdiBookingMaterialFeedbackModel extends BaseModel implements OperationLog {

	//edbtId
	private Long edbtId;
	//edbtEdbbId
	private Long edbtEdbbId;
	//edbtCargoSequenceNo
	private Integer edbtCargoSequenceNo;
	//edbtCargoCode
	private String edbtCargoCode;
	//edbtCargoFlag
	private String edbtCargoFlag;
	//edbtCargoPackageNumber
	private Integer edbtCargoPackageNumber;
	//edbtCargoPackageType
	private String edbtCargoPackageType;
	//edbtCargoPackageDesc
	private String edbtCargoPackageDesc;
	//edbtCargoPackageGrossWt
	private Double edbtCargoPackageGrossWt;
	//edbtCargoPackageMeasurement
	private Double edbtCargoPackageMeasurement;
	//edbtSecCargoPackageNumber
	private Integer edbtSecCargoPackageNumber;
	//edbtSecCargoPackageType
	private String edbtSecCargoPackageType;
	//edbtSecCargoPackageDesc
	private String edbtSecCargoPackageDesc;
	//edbtSecCargoPkgGrossWt
	private Double edbtSecCargoPkgGrossWt;
	//edbtSecCargoPackageMeasu
	private Double edbtSecCargoPackageMeasu;
	//edbtCargoGrossWeight
	private Double edbtCargoGrossWeight;
	//edbtCargoNetWeight
	private Double edbtCargoNetWeight;
	//edbtCargoMeasurement
	private Double edbtCargoMeasurement;
	//edbtQuarantineCode
	private String edbtQuarantineCode;
	//edbtQuarantineName
	private String edbtQuarantineName;
	//edbtConsignCargoCost
	private Double edbtConsignCargoCost;
	//edbtCustomsProcedureCode
	private String edbtCustomsProcedureCode;
	//edbtCountryOfOriginCode
	private String edbtCountryOfOriginCode;
	//edbtUniConsignmentRefNo
	private String edbtUniConsignmentRefNo;
	//edbtDangerousClass
	private String edbtDangerousClass;
	//edbtDangerousPage
	private String edbtDangerousPage;
	//edbtDangerousUndgNo
	private String edbtDangerousUndgNo;
	//edbtDangerousLabel
	private String edbtDangerousLabel;
	//edbtDangerousFlashPoint
	private String edbtDangerousFlashPoint;
	//edbtDangerousEmsNo
	private String edbtDangerousEmsNo;
	//edbtMfagNo
	private String edbtMfagNo;
	//edbtMarinePollutantFlag
	private String edbtMarinePollutantFlag;
	//edbtEmergencyContact
	private String edbtEmergencyContact;
	//edbtReeferVentilationFlux
	private String edbtReeferVentilationFlux;
	//edbtTemperatureUnit
	private String edbtTemperatureUnit;
	//edbtTemperatureUnitName
	private String edbtTemperatureUnitName;
	//edbtTemperatureSetting
	private Double edbtTemperatureSetting;
	//edbtMinTemperature
	private Double edbtMinTemperature;
	//edbtMaxTemperature
	private Double edbtMaxTemperature;
	//edbtOverLengthFront
	private Double edbtOverLengthFront;
	//edbtOverLengthBack
	private Double edbtOverLengthBack;
	//edbtOverWidthLeft
	private Double edbtOverWidthLeft;
	//edbtOverWidthRight
	private Double edbtOverWidthRight;
	//edbtOverHeight
	private Double edbtOverHeight;
	//edbtDangeroseContactName
	private String edbtDangeroseContactName;
	//edbtDangeroseContactTel
	private String edbtDangeroseContactTel;
	//edbtDangeroseContactEm
	private String edbtDangeroseContactEm;
	//edbtDangeroseContactFax
	private String edbtDangeroseContactFax;
	//edbtDangerosePackage
	private String edbtDangerosePackage;
	//edbtMark
	private String edbtMark;
	//edbtCargoDescription
	private String edbtCargoDescription;
	//edbtSubstr1
	private String edbtSubstr1;
	//edbtSubstr2
	private String edbtSubstr2;
	//edbtSubstr3
	private String edbtSubstr3;
	//edbtSubstr4
	private String edbtSubstr4;
	//edbtSubstr5
	private String edbtSubstr5;
	//edbtSubstr6
	private String edbtSubstr6;
	//edbtSubstr7
	private String edbtSubstr7;
	//edbtSubstr8
	private String edbtSubstr8;
	//edbtSubdate1
	private Date edbtSubdate1;
	//edbtSubdate2
	private Date edbtSubdate2;
	//edbtSubdate3
	private Date edbtSubdate3;
	//edbtSubdate4
	private Date edbtSubdate4;
	//edbtSubnum1
	private Long edbtSubnum1;
	//edbtSubnum2
	private Long edbtSubnum2;
	//edbtSubnum3
	private Long edbtSubnum3;
	//edbtSubnum4
	private Long edbtSubnum4;
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
	 * Get edbtId
	 */
	@Column(name = "EDBT_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEdbtId() {
		return edbtId;
	}

	/**
	 * Set edbtId
	 */
	public void setEdbtId(Long edbtId) {
		this.edbtId = edbtId;
		addValidField("edbtId");
	}

	/**
	 * Get edbtEdbbId
	 */
	@Column(name = "EDBT_EDBB_ID")
	public Long getEdbtEdbbId() {
		return edbtEdbbId;
	}

	/**
	 * Set edbtEdbbId
	 */
	public void setEdbtEdbbId(Long edbtEdbbId) {
		this.edbtEdbbId = edbtEdbbId;
		addValidField("edbtEdbbId");
	}

	/**
	 * Get edbtCargoSequenceNo
	 */
	@Column(name = "EDBT_CARGO_SEQUENCE_NO")
	public Integer getEdbtCargoSequenceNo() {
		return edbtCargoSequenceNo;
	}

	/**
	 * Set edbtCargoSequenceNo
	 */
	public void setEdbtCargoSequenceNo(Integer edbtCargoSequenceNo) {
		this.edbtCargoSequenceNo = edbtCargoSequenceNo;
		addValidField("edbtCargoSequenceNo");
	}

	/**
	 * Get edbtCargoCode
	 */
	@Column(name = "EDBT_CARGO_CODE")
	public String getEdbtCargoCode() {
		return edbtCargoCode;
	}

	/**
	 * Set edbtCargoCode
	 */
	public void setEdbtCargoCode(String edbtCargoCode) {
		this.edbtCargoCode = edbtCargoCode;
		addValidField("edbtCargoCode");
	}

	/**
	 * Get edbtCargoFlag
	 */
	@Column(name = "EDBT_CARGO_FLAG")
	public String getEdbtCargoFlag() {
		return edbtCargoFlag;
	}

	/**
	 * Set edbtCargoFlag
	 */
	public void setEdbtCargoFlag(String edbtCargoFlag) {
		this.edbtCargoFlag = edbtCargoFlag;
		addValidField("edbtCargoFlag");
	}

	/**
	 * Get edbtCargoPackageNumber
	 */
	@Column(name = "EDBT_CARGO_PACKAGE_NUMBER")
	public Integer getEdbtCargoPackageNumber() {
		return edbtCargoPackageNumber;
	}

	/**
	 * Set edbtCargoPackageNumber
	 */
	public void setEdbtCargoPackageNumber(Integer edbtCargoPackageNumber) {
		this.edbtCargoPackageNumber = edbtCargoPackageNumber;
		addValidField("edbtCargoPackageNumber");
	}

	/**
	 * Get edbtCargoPackageType
	 */
	@Column(name = "EDBT_CARGO_PACKAGE_TYPE")
	public String getEdbtCargoPackageType() {
		return edbtCargoPackageType;
	}

	/**
	 * Set edbtCargoPackageType
	 */
	public void setEdbtCargoPackageType(String edbtCargoPackageType) {
		this.edbtCargoPackageType = edbtCargoPackageType;
		addValidField("edbtCargoPackageType");
	}

	/**
	 * Get edbtCargoPackageDesc
	 */
	@Column(name = "EDBT_CARGO_PACKAGE_DESC")
	public String getEdbtCargoPackageDesc() {
		return edbtCargoPackageDesc;
	}

	/**
	 * Set edbtCargoPackageDesc
	 */
	public void setEdbtCargoPackageDesc(String edbtCargoPackageDesc) {
		this.edbtCargoPackageDesc = edbtCargoPackageDesc;
		addValidField("edbtCargoPackageDesc");
	}

	/**
	 * Get edbtCargoPackageGrossWt
	 */
	@Column(name = "EDBT_CARGO_PACKAGE_GROSS_WT")
	public Double getEdbtCargoPackageGrossWt() {
		return edbtCargoPackageGrossWt;
	}

	/**
	 * Set edbtCargoPackageGrossWt
	 */
	public void setEdbtCargoPackageGrossWt(Double edbtCargoPackageGrossWt) {
		this.edbtCargoPackageGrossWt = edbtCargoPackageGrossWt;
		addValidField("edbtCargoPackageGrossWt");
	}

	/**
	 * Get edbtCargoPackageMeasurement
	 */
	@Column(name = "EDBT_CARGO_PACKAGE_MEASUREMENT")
	public Double getEdbtCargoPackageMeasurement() {
		return edbtCargoPackageMeasurement;
	}

	/**
	 * Set edbtCargoPackageMeasurement
	 */
	public void setEdbtCargoPackageMeasurement(Double edbtCargoPackageMeasurement) {
		this.edbtCargoPackageMeasurement = edbtCargoPackageMeasurement;
		addValidField("edbtCargoPackageMeasurement");
	}

	/**
	 * Get edbtSecCargoPackageNumber
	 */
	@Column(name = "EDBT_SEC_CARGO_PACKAGE_NUMBER")
	public Integer getEdbtSecCargoPackageNumber() {
		return edbtSecCargoPackageNumber;
	}

	/**
	 * Set edbtSecCargoPackageNumber
	 */
	public void setEdbtSecCargoPackageNumber(Integer edbtSecCargoPackageNumber) {
		this.edbtSecCargoPackageNumber = edbtSecCargoPackageNumber;
		addValidField("edbtSecCargoPackageNumber");
	}

	/**
	 * Get edbtSecCargoPackageType
	 */
	@Column(name = "EDBT_SEC_CARGO_PACKAGE_TYPE")
	public String getEdbtSecCargoPackageType() {
		return edbtSecCargoPackageType;
	}

	/**
	 * Set edbtSecCargoPackageType
	 */
	public void setEdbtSecCargoPackageType(String edbtSecCargoPackageType) {
		this.edbtSecCargoPackageType = edbtSecCargoPackageType;
		addValidField("edbtSecCargoPackageType");
	}

	/**
	 * Get edbtSecCargoPackageDesc
	 */
	@Column(name = "EDBT_SEC_CARGO_PACKAGE_DESC")
	public String getEdbtSecCargoPackageDesc() {
		return edbtSecCargoPackageDesc;
	}

	/**
	 * Set edbtSecCargoPackageDesc
	 */
	public void setEdbtSecCargoPackageDesc(String edbtSecCargoPackageDesc) {
		this.edbtSecCargoPackageDesc = edbtSecCargoPackageDesc;
		addValidField("edbtSecCargoPackageDesc");
	}

	/**
	 * Get edbtSecCargoPkgGrossWt
	 */
	@Column(name = "EDBT_SEC_CARGO_PKG_GROSS_WT")
	public Double getEdbtSecCargoPkgGrossWt() {
		return edbtSecCargoPkgGrossWt;
	}

	/**
	 * Set edbtSecCargoPkgGrossWt
	 */
	public void setEdbtSecCargoPkgGrossWt(Double edbtSecCargoPkgGrossWt) {
		this.edbtSecCargoPkgGrossWt = edbtSecCargoPkgGrossWt;
		addValidField("edbtSecCargoPkgGrossWt");
	}

	/**
	 * Get edbtSecCargoPackageMeasu
	 */
	@Column(name = "EDBT_SEC_CARGO_PACKAGE_MEASU")
	public Double getEdbtSecCargoPackageMeasu() {
		return edbtSecCargoPackageMeasu;
	}

	/**
	 * Set edbtSecCargoPackageMeasu
	 */
	public void setEdbtSecCargoPackageMeasu(Double edbtSecCargoPackageMeasu) {
		this.edbtSecCargoPackageMeasu = edbtSecCargoPackageMeasu;
		addValidField("edbtSecCargoPackageMeasu");
	}

	/**
	 * Get edbtCargoGrossWeight
	 */
	@Column(name = "EDBT_CARGO_GROSS_WEIGHT")
	public Double getEdbtCargoGrossWeight() {
		return edbtCargoGrossWeight;
	}

	/**
	 * Set edbtCargoGrossWeight
	 */
	public void setEdbtCargoGrossWeight(Double edbtCargoGrossWeight) {
		this.edbtCargoGrossWeight = edbtCargoGrossWeight;
		addValidField("edbtCargoGrossWeight");
	}

	/**
	 * Get edbtCargoNetWeight
	 */
	@Column(name = "EDBT_CARGO_NET_WEIGHT")
	public Double getEdbtCargoNetWeight() {
		return edbtCargoNetWeight;
	}

	/**
	 * Set edbtCargoNetWeight
	 */
	public void setEdbtCargoNetWeight(Double edbtCargoNetWeight) {
		this.edbtCargoNetWeight = edbtCargoNetWeight;
		addValidField("edbtCargoNetWeight");
	}

	/**
	 * Get edbtCargoMeasurement
	 */
	@Column(name = "EDBT_CARGO_MEASUREMENT")
	public Double getEdbtCargoMeasurement() {
		return edbtCargoMeasurement;
	}

	/**
	 * Set edbtCargoMeasurement
	 */
	public void setEdbtCargoMeasurement(Double edbtCargoMeasurement) {
		this.edbtCargoMeasurement = edbtCargoMeasurement;
		addValidField("edbtCargoMeasurement");
	}

	/**
	 * Get edbtQuarantineCode
	 */
	@Column(name = "EDBT_QUARANTINE_CODE")
	public String getEdbtQuarantineCode() {
		return edbtQuarantineCode;
	}

	/**
	 * Set edbtQuarantineCode
	 */
	public void setEdbtQuarantineCode(String edbtQuarantineCode) {
		this.edbtQuarantineCode = edbtQuarantineCode;
		addValidField("edbtQuarantineCode");
	}

	/**
	 * Get edbtQuarantineName
	 */
	@Column(name = "EDBT_QUARANTINE_NAME")
	public String getEdbtQuarantineName() {
		return edbtQuarantineName;
	}

	/**
	 * Set edbtQuarantineName
	 */
	public void setEdbtQuarantineName(String edbtQuarantineName) {
		this.edbtQuarantineName = edbtQuarantineName;
		addValidField("edbtQuarantineName");
	}

	/**
	 * Get edbtConsignCargoCost
	 */
	@Column(name = "EDBT_CONSIGN_CARGO_COST")
	public Double getEdbtConsignCargoCost() {
		return edbtConsignCargoCost;
	}

	/**
	 * Set edbtConsignCargoCost
	 */
	public void setEdbtConsignCargoCost(Double edbtConsignCargoCost) {
		this.edbtConsignCargoCost = edbtConsignCargoCost;
		addValidField("edbtConsignCargoCost");
	}

	/**
	 * Get edbtCustomsProcedureCode
	 */
	@Column(name = "EDBT_CUSTOMS_PROCEDURE_CODE")
	public String getEdbtCustomsProcedureCode() {
		return edbtCustomsProcedureCode;
	}

	/**
	 * Set edbtCustomsProcedureCode
	 */
	public void setEdbtCustomsProcedureCode(String edbtCustomsProcedureCode) {
		this.edbtCustomsProcedureCode = edbtCustomsProcedureCode;
		addValidField("edbtCustomsProcedureCode");
	}

	/**
	 * Get edbtCountryOfOriginCode
	 */
	@Column(name = "EDBT_COUNTRY_OF_ORIGIN_CODE")
	public String getEdbtCountryOfOriginCode() {
		return edbtCountryOfOriginCode;
	}

	/**
	 * Set edbtCountryOfOriginCode
	 */
	public void setEdbtCountryOfOriginCode(String edbtCountryOfOriginCode) {
		this.edbtCountryOfOriginCode = edbtCountryOfOriginCode;
		addValidField("edbtCountryOfOriginCode");
	}

	/**
	 * Get edbtUniConsignmentRefNo
	 */
	@Column(name = "EDBT_UNI_CONSIGNMENT_REF_NO")
	public String getEdbtUniConsignmentRefNo() {
		return edbtUniConsignmentRefNo;
	}

	/**
	 * Set edbtUniConsignmentRefNo
	 */
	public void setEdbtUniConsignmentRefNo(String edbtUniConsignmentRefNo) {
		this.edbtUniConsignmentRefNo = edbtUniConsignmentRefNo;
		addValidField("edbtUniConsignmentRefNo");
	}

	/**
	 * Get edbtDangerousClass
	 */
	@Column(name = "EDBT_DANGEROUS_CLASS")
	public String getEdbtDangerousClass() {
		return edbtDangerousClass;
	}

	/**
	 * Set edbtDangerousClass
	 */
	public void setEdbtDangerousClass(String edbtDangerousClass) {
		this.edbtDangerousClass = edbtDangerousClass;
		addValidField("edbtDangerousClass");
	}

	/**
	 * Get edbtDangerousPage
	 */
	@Column(name = "EDBT_DANGEROUS_PAGE")
	public String getEdbtDangerousPage() {
		return edbtDangerousPage;
	}

	/**
	 * Set edbtDangerousPage
	 */
	public void setEdbtDangerousPage(String edbtDangerousPage) {
		this.edbtDangerousPage = edbtDangerousPage;
		addValidField("edbtDangerousPage");
	}

	/**
	 * Get edbtDangerousUndgNo
	 */
	@Column(name = "EDBT_DANGEROUS_UNDG_NO")
	public String getEdbtDangerousUndgNo() {
		return edbtDangerousUndgNo;
	}

	/**
	 * Set edbtDangerousUndgNo
	 */
	public void setEdbtDangerousUndgNo(String edbtDangerousUndgNo) {
		this.edbtDangerousUndgNo = edbtDangerousUndgNo;
		addValidField("edbtDangerousUndgNo");
	}

	/**
	 * Get edbtDangerousLabel
	 */
	@Column(name = "EDBT_DANGEROUS_LABEL")
	public String getEdbtDangerousLabel() {
		return edbtDangerousLabel;
	}

	/**
	 * Set edbtDangerousLabel
	 */
	public void setEdbtDangerousLabel(String edbtDangerousLabel) {
		this.edbtDangerousLabel = edbtDangerousLabel;
		addValidField("edbtDangerousLabel");
	}

	/**
	 * Get edbtDangerousFlashPoint
	 */
	@Column(name = "EDBT_DANGEROUS_FLASH_POINT")
	public String getEdbtDangerousFlashPoint() {
		return edbtDangerousFlashPoint;
	}

	/**
	 * Set edbtDangerousFlashPoint
	 */
	public void setEdbtDangerousFlashPoint(String edbtDangerousFlashPoint) {
		this.edbtDangerousFlashPoint = edbtDangerousFlashPoint;
		addValidField("edbtDangerousFlashPoint");
	}

	/**
	 * Get edbtDangerousEmsNo
	 */
	@Column(name = "EDBT_DANGEROUS_EMS_NO")
	public String getEdbtDangerousEmsNo() {
		return edbtDangerousEmsNo;
	}

	/**
	 * Set edbtDangerousEmsNo
	 */
	public void setEdbtDangerousEmsNo(String edbtDangerousEmsNo) {
		this.edbtDangerousEmsNo = edbtDangerousEmsNo;
		addValidField("edbtDangerousEmsNo");
	}

	/**
	 * Get edbtMfagNo
	 */
	@Column(name = "EDBT_MFAG_NO")
	public String getEdbtMfagNo() {
		return edbtMfagNo;
	}

	/**
	 * Set edbtMfagNo
	 */
	public void setEdbtMfagNo(String edbtMfagNo) {
		this.edbtMfagNo = edbtMfagNo;
		addValidField("edbtMfagNo");
	}

	/**
	 * Get edbtMarinePollutantFlag
	 */
	@Column(name = "EDBT_MARINE_POLLUTANT_FLAG")
	public String getEdbtMarinePollutantFlag() {
		return edbtMarinePollutantFlag;
	}

	/**
	 * Set edbtMarinePollutantFlag
	 */
	public void setEdbtMarinePollutantFlag(String edbtMarinePollutantFlag) {
		this.edbtMarinePollutantFlag = edbtMarinePollutantFlag;
		addValidField("edbtMarinePollutantFlag");
	}

	/**
	 * Get edbtEmergencyContact
	 */
	@Column(name = "EDBT_EMERGENCY_CONTACT")
	public String getEdbtEmergencyContact() {
		return edbtEmergencyContact;
	}

	/**
	 * Set edbtEmergencyContact
	 */
	public void setEdbtEmergencyContact(String edbtEmergencyContact) {
		this.edbtEmergencyContact = edbtEmergencyContact;
		addValidField("edbtEmergencyContact");
	}

	/**
	 * Get edbtReeferVentilationFlux
	 */
	@Column(name = "EDBT_REEFER_VENTILATION_FLUX")
	public String getEdbtReeferVentilationFlux() {
		return edbtReeferVentilationFlux;
	}

	/**
	 * Set edbtReeferVentilationFlux
	 */
	public void setEdbtReeferVentilationFlux(String edbtReeferVentilationFlux) {
		this.edbtReeferVentilationFlux = edbtReeferVentilationFlux;
		addValidField("edbtReeferVentilationFlux");
	}

	/**
	 * Get edbtTemperatureUnit
	 */
	@Column(name = "EDBT_TEMPERATURE_UNIT")
	public String getEdbtTemperatureUnit() {
		return edbtTemperatureUnit;
	}

	/**
	 * Set edbtTemperatureUnit
	 */
	public void setEdbtTemperatureUnit(String edbtTemperatureUnit) {
		this.edbtTemperatureUnit = edbtTemperatureUnit;
		addValidField("edbtTemperatureUnit");
	}

	/**
	 * Get edbtTemperatureUnitName
	 */
	@Column(name = "EDBT_TEMPERATURE_UNIT_NAME")
	public String getEdbtTemperatureUnitName() {
		return edbtTemperatureUnitName;
	}

	/**
	 * Set edbtTemperatureUnitName
	 */
	public void setEdbtTemperatureUnitName(String edbtTemperatureUnitName) {
		this.edbtTemperatureUnitName = edbtTemperatureUnitName;
		addValidField("edbtTemperatureUnitName");
	}

	/**
	 * Get edbtTemperatureSetting
	 */
	@Column(name = "EDBT_TEMPERATURE_SETTING")
	public Double getEdbtTemperatureSetting() {
		return edbtTemperatureSetting;
	}

	/**
	 * Set edbtTemperatureSetting
	 */
	public void setEdbtTemperatureSetting(Double edbtTemperatureSetting) {
		this.edbtTemperatureSetting = edbtTemperatureSetting;
		addValidField("edbtTemperatureSetting");
	}

	/**
	 * Get edbtMinTemperature
	 */
	@Column(name = "EDBT_MIN_TEMPERATURE")
	public Double getEdbtMinTemperature() {
		return edbtMinTemperature;
	}

	/**
	 * Set edbtMinTemperature
	 */
	public void setEdbtMinTemperature(Double edbtMinTemperature) {
		this.edbtMinTemperature = edbtMinTemperature;
		addValidField("edbtMinTemperature");
	}

	/**
	 * Get edbtMaxTemperature
	 */
	@Column(name = "EDBT_MAX_TEMPERATURE")
	public Double getEdbtMaxTemperature() {
		return edbtMaxTemperature;
	}

	/**
	 * Set edbtMaxTemperature
	 */
	public void setEdbtMaxTemperature(Double edbtMaxTemperature) {
		this.edbtMaxTemperature = edbtMaxTemperature;
		addValidField("edbtMaxTemperature");
	}

	/**
	 * Get edbtOverLengthFront
	 */
	@Column(name = "EDBT_OVER_LENGTH_FRONT")
	public Double getEdbtOverLengthFront() {
		return edbtOverLengthFront;
	}

	/**
	 * Set edbtOverLengthFront
	 */
	public void setEdbtOverLengthFront(Double edbtOverLengthFront) {
		this.edbtOverLengthFront = edbtOverLengthFront;
		addValidField("edbtOverLengthFront");
	}

	/**
	 * Get edbtOverLengthBack
	 */
	@Column(name = "EDBT_OVER_LENGTH_BACK")
	public Double getEdbtOverLengthBack() {
		return edbtOverLengthBack;
	}

	/**
	 * Set edbtOverLengthBack
	 */
	public void setEdbtOverLengthBack(Double edbtOverLengthBack) {
		this.edbtOverLengthBack = edbtOverLengthBack;
		addValidField("edbtOverLengthBack");
	}

	/**
	 * Get edbtOverWidthLeft
	 */
	@Column(name = "EDBT_OVER_WIDTH_LEFT")
	public Double getEdbtOverWidthLeft() {
		return edbtOverWidthLeft;
	}

	/**
	 * Set edbtOverWidthLeft
	 */
	public void setEdbtOverWidthLeft(Double edbtOverWidthLeft) {
		this.edbtOverWidthLeft = edbtOverWidthLeft;
		addValidField("edbtOverWidthLeft");
	}

	/**
	 * Get edbtOverWidthRight
	 */
	@Column(name = "EDBT_OVER_WIDTH_RIGHT")
	public Double getEdbtOverWidthRight() {
		return edbtOverWidthRight;
	}

	/**
	 * Set edbtOverWidthRight
	 */
	public void setEdbtOverWidthRight(Double edbtOverWidthRight) {
		this.edbtOverWidthRight = edbtOverWidthRight;
		addValidField("edbtOverWidthRight");
	}

	/**
	 * Get edbtOverHeight
	 */
	@Column(name = "EDBT_OVER_HEIGHT")
	public Double getEdbtOverHeight() {
		return edbtOverHeight;
	}

	/**
	 * Set edbtOverHeight
	 */
	public void setEdbtOverHeight(Double edbtOverHeight) {
		this.edbtOverHeight = edbtOverHeight;
		addValidField("edbtOverHeight");
	}

	/**
	 * Get edbtDangeroseContactName
	 */
	@Column(name = "EDBT_DANGEROSE_CONTACT_NAME")
	public String getEdbtDangeroseContactName() {
		return edbtDangeroseContactName;
	}

	/**
	 * Set edbtDangeroseContactName
	 */
	public void setEdbtDangeroseContactName(String edbtDangeroseContactName) {
		this.edbtDangeroseContactName = edbtDangeroseContactName;
		addValidField("edbtDangeroseContactName");
	}

	/**
	 * Get edbtDangeroseContactTel
	 */
	@Column(name = "EDBT_DANGEROSE_CONTACT_TEL")
	public String getEdbtDangeroseContactTel() {
		return edbtDangeroseContactTel;
	}

	/**
	 * Set edbtDangeroseContactTel
	 */
	public void setEdbtDangeroseContactTel(String edbtDangeroseContactTel) {
		this.edbtDangeroseContactTel = edbtDangeroseContactTel;
		addValidField("edbtDangeroseContactTel");
	}

	/**
	 * Get edbtDangeroseContactEm
	 */
	@Column(name = "EDBT_DANGEROSE_CONTACT_EM")
	public String getEdbtDangeroseContactEm() {
		return edbtDangeroseContactEm;
	}

	/**
	 * Set edbtDangeroseContactEm
	 */
	public void setEdbtDangeroseContactEm(String edbtDangeroseContactEm) {
		this.edbtDangeroseContactEm = edbtDangeroseContactEm;
		addValidField("edbtDangeroseContactEm");
	}

	/**
	 * Get edbtDangeroseContactFax
	 */
	@Column(name = "EDBT_DANGEROSE_CONTACT_FAX")
	public String getEdbtDangeroseContactFax() {
		return edbtDangeroseContactFax;
	}

	/**
	 * Set edbtDangeroseContactFax
	 */
	public void setEdbtDangeroseContactFax(String edbtDangeroseContactFax) {
		this.edbtDangeroseContactFax = edbtDangeroseContactFax;
		addValidField("edbtDangeroseContactFax");
	}

	/**
	 * Get edbtDangerosePackage
	 */
	@Column(name = "EDBT_DANGEROSE_PACKAGE")
	public String getEdbtDangerosePackage() {
		return edbtDangerosePackage;
	}

	/**
	 * Set edbtDangerosePackage
	 */
	public void setEdbtDangerosePackage(String edbtDangerosePackage) {
		this.edbtDangerosePackage = edbtDangerosePackage;
		addValidField("edbtDangerosePackage");
	}

	/**
	 * Get edbtMark
	 */
	@Column(name = "EDBT_MARK")
	public String getEdbtMark() {
		return edbtMark;
	}

	/**
	 * Set edbtMark
	 */
	public void setEdbtMark(String edbtMark) {
		this.edbtMark = edbtMark;
		addValidField("edbtMark");
	}

	/**
	 * Get edbtCargoDescription
	 */
	@Column(name = "EDBT_CARGO_DESCRIPTION")
	public String getEdbtCargoDescription() {
		return edbtCargoDescription;
	}

	/**
	 * Set edbtCargoDescription
	 */
	public void setEdbtCargoDescription(String edbtCargoDescription) {
		this.edbtCargoDescription = edbtCargoDescription;
		addValidField("edbtCargoDescription");
	}

	/**
	 * Get edbtSubstr1
	 */
	@Column(name = "EDBT_SUBSTR1")
	public String getEdbtSubstr1() {
		return edbtSubstr1;
	}

	/**
	 * Set edbtSubstr1
	 */
	public void setEdbtSubstr1(String edbtSubstr1) {
		this.edbtSubstr1 = edbtSubstr1;
		addValidField("edbtSubstr1");
	}

	/**
	 * Get edbtSubstr2
	 */
	@Column(name = "EDBT_SUBSTR2")
	public String getEdbtSubstr2() {
		return edbtSubstr2;
	}

	/**
	 * Set edbtSubstr2
	 */
	public void setEdbtSubstr2(String edbtSubstr2) {
		this.edbtSubstr2 = edbtSubstr2;
		addValidField("edbtSubstr2");
	}

	/**
	 * Get edbtSubstr3
	 */
	@Column(name = "EDBT_SUBSTR3")
	public String getEdbtSubstr3() {
		return edbtSubstr3;
	}

	/**
	 * Set edbtSubstr3
	 */
	public void setEdbtSubstr3(String edbtSubstr3) {
		this.edbtSubstr3 = edbtSubstr3;
		addValidField("edbtSubstr3");
	}

	/**
	 * Get edbtSubstr4
	 */
	@Column(name = "EDBT_SUBSTR4")
	public String getEdbtSubstr4() {
		return edbtSubstr4;
	}

	/**
	 * Set edbtSubstr4
	 */
	public void setEdbtSubstr4(String edbtSubstr4) {
		this.edbtSubstr4 = edbtSubstr4;
		addValidField("edbtSubstr4");
	}

	/**
	 * Get edbtSubstr5
	 */
	@Column(name = "EDBT_SUBSTR5")
	public String getEdbtSubstr5() {
		return edbtSubstr5;
	}

	/**
	 * Set edbtSubstr5
	 */
	public void setEdbtSubstr5(String edbtSubstr5) {
		this.edbtSubstr5 = edbtSubstr5;
		addValidField("edbtSubstr5");
	}

	/**
	 * Get edbtSubstr6
	 */
	@Column(name = "EDBT_SUBSTR6")
	public String getEdbtSubstr6() {
		return edbtSubstr6;
	}

	/**
	 * Set edbtSubstr6
	 */
	public void setEdbtSubstr6(String edbtSubstr6) {
		this.edbtSubstr6 = edbtSubstr6;
		addValidField("edbtSubstr6");
	}

	/**
	 * Get edbtSubstr7
	 */
	@Column(name = "EDBT_SUBSTR7")
	public String getEdbtSubstr7() {
		return edbtSubstr7;
	}

	/**
	 * Set edbtSubstr7
	 */
	public void setEdbtSubstr7(String edbtSubstr7) {
		this.edbtSubstr7 = edbtSubstr7;
		addValidField("edbtSubstr7");
	}

	/**
	 * Get edbtSubstr8
	 */
	@Column(name = "EDBT_SUBSTR8")
	public String getEdbtSubstr8() {
		return edbtSubstr8;
	}

	/**
	 * Set edbtSubstr8
	 */
	public void setEdbtSubstr8(String edbtSubstr8) {
		this.edbtSubstr8 = edbtSubstr8;
		addValidField("edbtSubstr8");
	}

	/**
	 * Get edbtSubdate1
	 */
	@Column(name = "EDBT_SUBDATE1")
	public Date getEdbtSubdate1() {
		return edbtSubdate1;
	}

	/**
	 * Set edbtSubdate1
	 */
	public void setEdbtSubdate1(Date edbtSubdate1) {
		this.edbtSubdate1 = edbtSubdate1;
		addValidField("edbtSubdate1");
	}

	/**
	 * Get edbtSubdate2
	 */
	@Column(name = "EDBT_SUBDATE2")
	public Date getEdbtSubdate2() {
		return edbtSubdate2;
	}

	/**
	 * Set edbtSubdate2
	 */
	public void setEdbtSubdate2(Date edbtSubdate2) {
		this.edbtSubdate2 = edbtSubdate2;
		addValidField("edbtSubdate2");
	}

	/**
	 * Get edbtSubdate3
	 */
	@Column(name = "EDBT_SUBDATE3")
	public Date getEdbtSubdate3() {
		return edbtSubdate3;
	}

	/**
	 * Set edbtSubdate3
	 */
	public void setEdbtSubdate3(Date edbtSubdate3) {
		this.edbtSubdate3 = edbtSubdate3;
		addValidField("edbtSubdate3");
	}

	/**
	 * Get edbtSubdate4
	 */
	@Column(name = "EDBT_SUBDATE4")
	public Date getEdbtSubdate4() {
		return edbtSubdate4;
	}

	/**
	 * Set edbtSubdate4
	 */
	public void setEdbtSubdate4(Date edbtSubdate4) {
		this.edbtSubdate4 = edbtSubdate4;
		addValidField("edbtSubdate4");
	}

	/**
	 * Get edbtSubnum1
	 */
	@Column(name = "EDBT_SUBNUM1")
	public Long getEdbtSubnum1() {
		return edbtSubnum1;
	}

	/**
	 * Set edbtSubnum1
	 */
	public void setEdbtSubnum1(Long edbtSubnum1) {
		this.edbtSubnum1 = edbtSubnum1;
		addValidField("edbtSubnum1");
	}

	/**
	 * Get edbtSubnum2
	 */
	@Column(name = "EDBT_SUBNUM2")
	public Long getEdbtSubnum2() {
		return edbtSubnum2;
	}

	/**
	 * Set edbtSubnum2
	 */
	public void setEdbtSubnum2(Long edbtSubnum2) {
		this.edbtSubnum2 = edbtSubnum2;
		addValidField("edbtSubnum2");
	}

	/**
	 * Get edbtSubnum3
	 */
	@Column(name = "EDBT_SUBNUM3")
	public Long getEdbtSubnum3() {
		return edbtSubnum3;
	}

	/**
	 * Set edbtSubnum3
	 */
	public void setEdbtSubnum3(Long edbtSubnum3) {
		this.edbtSubnum3 = edbtSubnum3;
		addValidField("edbtSubnum3");
	}

	/**
	 * Get edbtSubnum4
	 */
	@Column(name = "EDBT_SUBNUM4")
	public Long getEdbtSubnum4() {
		return edbtSubnum4;
	}

	/**
	 * Set edbtSubnum4
	 */
	public void setEdbtSubnum4(Long edbtSubnum4) {
		this.edbtSubnum4 = edbtSubnum4;
		addValidField("edbtSubnum4");
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
