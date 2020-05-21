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
 * Model class for EoEoom2Eobr
 */
@Entity
@Table(name = "EO_EOOM_2_EOBR")
public class EoEoom2EobrModel extends BaseModel implements OperationLog {

	//eobmId
	private Long eobmId;
	//eobmEoomId
	private Long eobmEoomId;
	//eobmEorbId
	private Long eobmEorbId;
	//eobmBatchNo
	private String eobmBatchNo;
	//eobmEbmaId
	private Long eobmEbmaId;
	//eobmLineno
	private String eobmLineno;
	//eobmMaterialNo
	private String eobmMaterialNo;
	//eobmEbmaNameEn
	private String eobmEbmaNameEn;
	//eobmEbmaNameCn
	private String eobmEbmaNameCn;
	//eobmEbtpId
	private Long eobmEbtpId;
	//eobmEbtpModel
	private String eobmEbtpModel;
	//eobmEbtpPackage
	private String eobmEbtpPackage;
	//eobmEbtpPackageType
	private String eobmEbtpPackageType;
	//eobmHscode
	private String eobmHscode;
	//eobmGoodsCode
	private String eobmGoodsCode;
	//eobmCustomsProcedureCode
	private String eobmCustomsProcedureCode;
	//eobmCountryOfOriginCode
	private String eobmCountryOfOriginCode;
	//eobmUniConsignmentRefNo
	private String eobmUniConsignmentRefNo;
	//eobmQuarantineCode
	private String eobmQuarantineCode;
	//eobmQuarantineName
	private String eobmQuarantineName;
	//eobmType
	private String eobmType;
	//eobmStatus
	private String eobmStatus;
	//eobmEbmaDgClass
	private String eobmEbmaDgClass;
	//eobmEbmaUnNo
	private String eobmEbmaUnNo;
	//eobmEbmaDgSubclass
	private String eobmEbmaDgSubclass;
	//eobmEbmaDgCode
	private String eobmEbmaDgCode;
	//eobmDangerProperty
	private String eobmDangerProperty;
	//eobmIsDangerousFlag
	private String eobmIsDangerousFlag;
	//eobmDangerPackage
	private String eobmDangerPackage;
	//eobmDangerousPage
	private String eobmDangerousPage;
	//eobmDangerousLabel
	private String eobmDangerousLabel;
	//eobmDangerousFlashPoint
	private String eobmDangerousFlashPoint;
	//eobmDangerousEmsNo
	private String eobmDangerousEmsNo;
	//eobmMfagNo
	private String eobmMfagNo;
	//eobmMarinePollutantFlag
	private String eobmMarinePollutantFlag;
	//eobmEmergencyContact
	private String eobmEmergencyContact;
	//eobmDangeroseContactEm
	private String eobmDangeroseContactEm;
	//eobmDangeroseContactFax
	private String eobmDangeroseContactFax;
	//eobmDangeroseContactName
	private String eobmDangeroseContactName;
	//eobmEbmaIsTemperature
	private String eobmEbmaIsTemperature;
	//eobmEbmaFeatures
	private String eobmEbmaFeatures;
	//eobmIsFreezeFlag
	private String eobmIsFreezeFlag;
	//eobmTemperatureUnit
	private String eobmTemperatureUnit;
	//eobmTemperatureUnitName
	private String eobmTemperatureUnitName;
	//eobmEbmaTemperatureSetting
	private Double eobmEbmaTemperatureSetting;
	//eobmEbmaMinTemperature
	private Double eobmEbmaMinTemperature;
	//eobmEbmaMaxTemperature
	private Double eobmEbmaMaxTemperature;
	//eobmReeferVentilationFlux
	private String eobmReeferVentilationFlux;
	//eobmVent
	private String eobmVent;
	//eobmHumidity
	private String eobmHumidity;
	//eobmMark
	private String eobmMark;
	//eobmCntBulkFlag
	private String eobmCntBulkFlag;
	//eobmDescription
	private String eobmDescription;
	//eobmFreeTextDesc
	private String eobmFreeTextDesc;
	//eobmMaterialDescCn
	private String eobmMaterialDescCn;
	//eobmBatch
	private String eobmBatch;
	//eobmQuantity
	private Long eobmQuantity;
	//eobmQuantityUnit
	private String eobmQuantityUnit;
	//eobmGrossWeight
	private Double eobmGrossWeight;
	//eobmNetWeight
	private Double eobmNetWeight;
	//eobmVolume
	private Double eobmVolume;
	//eobmOverLengthFront
	private Double eobmOverLengthFront;
	//eobmOverLengthBack
	private Double eobmOverLengthBack;
	//eobmOverWidthLeft
	private Double eobmOverWidthLeft;
	//eobmOverWidthRight
	private Double eobmOverWidthRight;
	//eobmOverHeight
	private Double eobmOverHeight;
	//eobmMaterialTypeCode
	private String eobmMaterialTypeCode;
	//eobmMaterialTypeName
	private String eobmMaterialTypeName;
	//eobmIsBig
	private String eobmIsBig;
	//eobmLength
	private Double eobmLength;
	//eobmWidth
	private Double eobmWidth;
	//eobmHigh
	private Double eobmHigh;
	//eobmPkgVolume
	private Double eobmPkgVolume;
	//eobmPkgTareWeight
	private Double eobmPkgTareWeight;
	//eobmPkgVolumeS
	private Double eobmPkgVolumeS;
	//eobmPkgTareWeightS
	private Double eobmPkgTareWeightS;
	//eobmPkgsCodeS
	private String eobmPkgsCodeS;
	//eobmPkgsNameS
	private String eobmPkgsNameS;
	//eobmMaterialPackageNumberS
	private Integer eobmMaterialPackageNumberS;
	//eobmCtnStatus
	private String eobmCtnStatus;
	//eobmIsNormalFreeze
	private String eobmIsNormalFreeze;
	//eobmRemark
	private String eobmRemark;
	//eobmSubstr1
	private String eobmSubstr1;
	//eobmSubstr2
	private String eobmSubstr2;
	//eobmSubstr3
	private String eobmSubstr3;
	//eobmSubstr4
	private String eobmSubstr4;
	//eobmSubdate1
	private Date eobmSubdate1;
	//eobmSubdate2
	private Date eobmSubdate2;
	//eobmSubnum1
	private Long eobmSubnum1;
	//eobmSubnum2
	private Long eobmSubnum2;
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
	//eobmBlEbtpPackageType
	private String eobmBlEbtpPackageType;
	//eobmDangeroseContactTel
	private String eobmDangeroseContactTel;

	/**
	 * Get eobmId
	 */
	@Column(name = "EOBM_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEobmId() {
		return eobmId;
	}

	/**
	 * Set eobmId
	 */
	public void setEobmId(Long eobmId) {
		this.eobmId = eobmId;
		addValidField("eobmId");
	}

	/**
	 * Get eobmEoomId
	 */
	@Column(name = "EOBM_EOOM_ID")
	public Long getEobmEoomId() {
		return eobmEoomId;
	}

	/**
	 * Set eobmEoomId
	 */
	public void setEobmEoomId(Long eobmEoomId) {
		this.eobmEoomId = eobmEoomId;
		addValidField("eobmEoomId");
	}

	/**
	 * Get eobmEorbId
	 */
	@Column(name = "EOBM_EORB_ID")
	public Long getEobmEorbId() {
		return eobmEorbId;
	}

	/**
	 * Set eobmEorbId
	 */
	public void setEobmEorbId(Long eobmEorbId) {
		this.eobmEorbId = eobmEorbId;
		addValidField("eobmEorbId");
	}

	/**
	 * Get eobmBatchNo
	 */
	@Column(name = "EOBM_BATCH_NO")
	public String getEobmBatchNo() {
		return eobmBatchNo;
	}

	/**
	 * Set eobmBatchNo
	 */
	public void setEobmBatchNo(String eobmBatchNo) {
		this.eobmBatchNo = eobmBatchNo;
		addValidField("eobmBatchNo");
	}

	/**
	 * Get eobmEbmaId
	 */
	@Column(name = "EOBM_EBMA_ID")
	public Long getEobmEbmaId() {
		return eobmEbmaId;
	}

	/**
	 * Set eobmEbmaId
	 */
	public void setEobmEbmaId(Long eobmEbmaId) {
		this.eobmEbmaId = eobmEbmaId;
		addValidField("eobmEbmaId");
	}

	/**
	 * Get eobmLineno
	 */
	@Column(name = "EOBM_LINENO")
	public String getEobmLineno() {
		return eobmLineno;
	}

	/**
	 * Set eobmLineno
	 */
	public void setEobmLineno(String eobmLineno) {
		this.eobmLineno = eobmLineno;
		addValidField("eobmLineno");
	}

	/**
	 * Get eobmMaterialNo
	 */
	@Column(name = "EOBM_MATERIAL_NO")
	public String getEobmMaterialNo() {
		return eobmMaterialNo;
	}

	/**
	 * Set eobmMaterialNo
	 */
	public void setEobmMaterialNo(String eobmMaterialNo) {
		this.eobmMaterialNo = eobmMaterialNo;
		addValidField("eobmMaterialNo");
	}

	/**
	 * Get eobmEbmaNameEn
	 */
	@Column(name = "EOBM_EBMA_NAME_EN")
	public String getEobmEbmaNameEn() {
		return eobmEbmaNameEn;
	}

	/**
	 * Set eobmEbmaNameEn
	 */
	public void setEobmEbmaNameEn(String eobmEbmaNameEn) {
		this.eobmEbmaNameEn = eobmEbmaNameEn;
		addValidField("eobmEbmaNameEn");
	}

	/**
	 * Get eobmEbmaNameCn
	 */
	@Column(name = "EOBM_EBMA_NAME_CN")
	public String getEobmEbmaNameCn() {
		return eobmEbmaNameCn;
	}

	/**
	 * Set eobmEbmaNameCn
	 */
	public void setEobmEbmaNameCn(String eobmEbmaNameCn) {
		this.eobmEbmaNameCn = eobmEbmaNameCn;
		addValidField("eobmEbmaNameCn");
	}

	/**
	 * Get eobmEbtpId
	 */
	@Column(name = "EOBM_EBTP_ID")
	public Long getEobmEbtpId() {
		return eobmEbtpId;
	}

	/**
	 * Set eobmEbtpId
	 */
	public void setEobmEbtpId(Long eobmEbtpId) {
		this.eobmEbtpId = eobmEbtpId;
		addValidField("eobmEbtpId");
	}

	/**
	 * Get eobmEbtpModel
	 */
	@Column(name = "EOBM_EBTP_MODEL")
	public String getEobmEbtpModel() {
		return eobmEbtpModel;
	}

	/**
	 * Set eobmEbtpModel
	 */
	public void setEobmEbtpModel(String eobmEbtpModel) {
		this.eobmEbtpModel = eobmEbtpModel;
		addValidField("eobmEbtpModel");
	}

	/**
	 * Get eobmEbtpPackage
	 */
	@Column(name = "EOBM_EBTP_PACKAGE")
	public String getEobmEbtpPackage() {
		return eobmEbtpPackage;
	}

	/**
	 * Set eobmEbtpPackage
	 */
	public void setEobmEbtpPackage(String eobmEbtpPackage) {
		this.eobmEbtpPackage = eobmEbtpPackage;
		addValidField("eobmEbtpPackage");
	}

	/**
	 * Get eobmEbtpPackageType
	 */
	@Column(name = "EOBM_EBTP_PACKAGE_TYPE")
	public String getEobmEbtpPackageType() {
		return eobmEbtpPackageType;
	}

	/**
	 * Set eobmEbtpPackageType
	 */
	public void setEobmEbtpPackageType(String eobmEbtpPackageType) {
		this.eobmEbtpPackageType = eobmEbtpPackageType;
		addValidField("eobmEbtpPackageType");
	}

	/**
	 * Get eobmHscode
	 */
	@Column(name = "EOBM_HSCODE")
	public String getEobmHscode() {
		return eobmHscode;
	}

	/**
	 * Set eobmHscode
	 */
	public void setEobmHscode(String eobmHscode) {
		this.eobmHscode = eobmHscode;
		addValidField("eobmHscode");
	}

	/**
	 * Get eobmGoodsCode
	 */
	@Column(name = "EOBM_GOODS_CODE")
	public String getEobmGoodsCode() {
		return eobmGoodsCode;
	}

	/**
	 * Set eobmGoodsCode
	 */
	public void setEobmGoodsCode(String eobmGoodsCode) {
		this.eobmGoodsCode = eobmGoodsCode;
		addValidField("eobmGoodsCode");
	}

	/**
	 * Get eobmCustomsProcedureCode
	 */
	@Column(name = "EOBM_CUSTOMS_PROCEDURE_CODE")
	public String getEobmCustomsProcedureCode() {
		return eobmCustomsProcedureCode;
	}

	/**
	 * Set eobmCustomsProcedureCode
	 */
	public void setEobmCustomsProcedureCode(String eobmCustomsProcedureCode) {
		this.eobmCustomsProcedureCode = eobmCustomsProcedureCode;
		addValidField("eobmCustomsProcedureCode");
	}

	/**
	 * Get eobmCountryOfOriginCode
	 */
	@Column(name = "EOBM_COUNTRY_OF_ORIGIN_CODE")
	public String getEobmCountryOfOriginCode() {
		return eobmCountryOfOriginCode;
	}

	/**
	 * Set eobmCountryOfOriginCode
	 */
	public void setEobmCountryOfOriginCode(String eobmCountryOfOriginCode) {
		this.eobmCountryOfOriginCode = eobmCountryOfOriginCode;
		addValidField("eobmCountryOfOriginCode");
	}

	/**
	 * Get eobmUniConsignmentRefNo
	 */
	@Column(name = "EOBM_UNI_CONSIGNMENT_REF_NO")
	public String getEobmUniConsignmentRefNo() {
		return eobmUniConsignmentRefNo;
	}

	/**
	 * Set eobmUniConsignmentRefNo
	 */
	public void setEobmUniConsignmentRefNo(String eobmUniConsignmentRefNo) {
		this.eobmUniConsignmentRefNo = eobmUniConsignmentRefNo;
		addValidField("eobmUniConsignmentRefNo");
	}

	/**
	 * Get eobmQuarantineCode
	 */
	@Column(name = "EOBM_QUARANTINE_CODE")
	public String getEobmQuarantineCode() {
		return eobmQuarantineCode;
	}

	/**
	 * Set eobmQuarantineCode
	 */
	public void setEobmQuarantineCode(String eobmQuarantineCode) {
		this.eobmQuarantineCode = eobmQuarantineCode;
		addValidField("eobmQuarantineCode");
	}

	/**
	 * Get eobmQuarantineName
	 */
	@Column(name = "EOBM_QUARANTINE_NAME")
	public String getEobmQuarantineName() {
		return eobmQuarantineName;
	}

	/**
	 * Set eobmQuarantineName
	 */
	public void setEobmQuarantineName(String eobmQuarantineName) {
		this.eobmQuarantineName = eobmQuarantineName;
		addValidField("eobmQuarantineName");
	}

	/**
	 * Get eobmType
	 */
	@Column(name = "EOBM_TYPE")
	public String getEobmType() {
		return eobmType;
	}

	/**
	 * Set eobmType
	 */
	public void setEobmType(String eobmType) {
		this.eobmType = eobmType;
		addValidField("eobmType");
	}

	/**
	 * Get eobmStatus
	 */
	@Column(name = "EOBM_STATUS")
	public String getEobmStatus() {
		return eobmStatus;
	}

	/**
	 * Set eobmStatus
	 */
	public void setEobmStatus(String eobmStatus) {
		this.eobmStatus = eobmStatus;
		addValidField("eobmStatus");
	}

	/**
	 * Get eobmEbmaDgClass
	 */
	@Column(name = "EOBM_EBMA_DG_CLASS")
	public String getEobmEbmaDgClass() {
		return eobmEbmaDgClass;
	}

	/**
	 * Set eobmEbmaDgClass
	 */
	public void setEobmEbmaDgClass(String eobmEbmaDgClass) {
		this.eobmEbmaDgClass = eobmEbmaDgClass;
		addValidField("eobmEbmaDgClass");
	}

	/**
	 * Get eobmEbmaUnNo
	 */
	@Column(name = "EOBM_EBMA_UN_NO")
	public String getEobmEbmaUnNo() {
		return eobmEbmaUnNo;
	}

	/**
	 * Set eobmEbmaUnNo
	 */
	public void setEobmEbmaUnNo(String eobmEbmaUnNo) {
		this.eobmEbmaUnNo = eobmEbmaUnNo;
		addValidField("eobmEbmaUnNo");
	}

	/**
	 * Get eobmEbmaDgSubclass
	 */
	@Column(name = "EOBM_EBMA_DG_SUBCLASS")
	public String getEobmEbmaDgSubclass() {
		return eobmEbmaDgSubclass;
	}

	/**
	 * Set eobmEbmaDgSubclass
	 */
	public void setEobmEbmaDgSubclass(String eobmEbmaDgSubclass) {
		this.eobmEbmaDgSubclass = eobmEbmaDgSubclass;
		addValidField("eobmEbmaDgSubclass");
	}

	/**
	 * Get eobmEbmaDgCode
	 */
	@Column(name = "EOBM_EBMA_DG_CODE")
	public String getEobmEbmaDgCode() {
		return eobmEbmaDgCode;
	}

	/**
	 * Set eobmEbmaDgCode
	 */
	public void setEobmEbmaDgCode(String eobmEbmaDgCode) {
		this.eobmEbmaDgCode = eobmEbmaDgCode;
		addValidField("eobmEbmaDgCode");
	}

	/**
	 * Get eobmDangerProperty
	 */
	@Column(name = "EOBM_DANGER_PROPERTY")
	public String getEobmDangerProperty() {
		return eobmDangerProperty;
	}

	/**
	 * Set eobmDangerProperty
	 */
	public void setEobmDangerProperty(String eobmDangerProperty) {
		this.eobmDangerProperty = eobmDangerProperty;
		addValidField("eobmDangerProperty");
	}

	/**
	 * Get eobmIsDangerousFlag
	 */
	@Column(name = "EOBM_IS_DANGEROUS_FLAG")
	public String getEobmIsDangerousFlag() {
		return eobmIsDangerousFlag;
	}

	/**
	 * Set eobmIsDangerousFlag
	 */
	public void setEobmIsDangerousFlag(String eobmIsDangerousFlag) {
		this.eobmIsDangerousFlag = eobmIsDangerousFlag;
		addValidField("eobmIsDangerousFlag");
	}

	/**
	 * Get eobmDangerPackage
	 */
	@Column(name = "EOBM_DANGER_PACKAGE")
	public String getEobmDangerPackage() {
		return eobmDangerPackage;
	}

	/**
	 * Set eobmDangerPackage
	 */
	public void setEobmDangerPackage(String eobmDangerPackage) {
		this.eobmDangerPackage = eobmDangerPackage;
		addValidField("eobmDangerPackage");
	}

	/**
	 * Get eobmDangerousPage
	 */
	@Column(name = "EOBM_DANGEROUS_PAGE")
	public String getEobmDangerousPage() {
		return eobmDangerousPage;
	}

	/**
	 * Set eobmDangerousPage
	 */
	public void setEobmDangerousPage(String eobmDangerousPage) {
		this.eobmDangerousPage = eobmDangerousPage;
		addValidField("eobmDangerousPage");
	}

	/**
	 * Get eobmDangerousLabel
	 */
	@Column(name = "EOBM_DANGEROUS_LABEL")
	public String getEobmDangerousLabel() {
		return eobmDangerousLabel;
	}

	/**
	 * Set eobmDangerousLabel
	 */
	public void setEobmDangerousLabel(String eobmDangerousLabel) {
		this.eobmDangerousLabel = eobmDangerousLabel;
		addValidField("eobmDangerousLabel");
	}

	/**
	 * Get eobmDangerousFlashPoint
	 */
	@Column(name = "EOBM_DANGEROUS_FLASH_POINT")
	public String getEobmDangerousFlashPoint() {
		return eobmDangerousFlashPoint;
	}

	/**
	 * Set eobmDangerousFlashPoint
	 */
	public void setEobmDangerousFlashPoint(String eobmDangerousFlashPoint) {
		this.eobmDangerousFlashPoint = eobmDangerousFlashPoint;
		addValidField("eobmDangerousFlashPoint");
	}

	/**
	 * Get eobmDangerousEmsNo
	 */
	@Column(name = "EOBM_DANGEROUS_EMS_NO")
	public String getEobmDangerousEmsNo() {
		return eobmDangerousEmsNo;
	}

	/**
	 * Set eobmDangerousEmsNo
	 */
	public void setEobmDangerousEmsNo(String eobmDangerousEmsNo) {
		this.eobmDangerousEmsNo = eobmDangerousEmsNo;
		addValidField("eobmDangerousEmsNo");
	}

	/**
	 * Get eobmMfagNo
	 */
	@Column(name = "EOBM_MFAG_NO")
	public String getEobmMfagNo() {
		return eobmMfagNo;
	}

	/**
	 * Set eobmMfagNo
	 */
	public void setEobmMfagNo(String eobmMfagNo) {
		this.eobmMfagNo = eobmMfagNo;
		addValidField("eobmMfagNo");
	}

	/**
	 * Get eobmMarinePollutantFlag
	 */
	@Column(name = "EOBM_MARINE_POLLUTANT_FLAG")
	public String getEobmMarinePollutantFlag() {
		return eobmMarinePollutantFlag;
	}

	/**
	 * Set eobmMarinePollutantFlag
	 */
	public void setEobmMarinePollutantFlag(String eobmMarinePollutantFlag) {
		this.eobmMarinePollutantFlag = eobmMarinePollutantFlag;
		addValidField("eobmMarinePollutantFlag");
	}

	/**
	 * Get eobmEmergencyContact
	 */
	@Column(name = "EOBM_EMERGENCY_CONTACT")
	public String getEobmEmergencyContact() {
		return eobmEmergencyContact;
	}

	/**
	 * Set eobmEmergencyContact
	 */
	public void setEobmEmergencyContact(String eobmEmergencyContact) {
		this.eobmEmergencyContact = eobmEmergencyContact;
		addValidField("eobmEmergencyContact");
	}

	/**
	 * Get eobmDangeroseContactEm
	 */
	@Column(name = "EOBM_DANGEROSE_CONTACT_EM")
	public String getEobmDangeroseContactEm() {
		return eobmDangeroseContactEm;
	}

	/**
	 * Set eobmDangeroseContactEm
	 */
	public void setEobmDangeroseContactEm(String eobmDangeroseContactEm) {
		this.eobmDangeroseContactEm = eobmDangeroseContactEm;
		addValidField("eobmDangeroseContactEm");
	}

	/**
	 * Get eobmDangeroseContactFax
	 */
	@Column(name = "EOBM_DANGEROSE_CONTACT_FAX")
	public String getEobmDangeroseContactFax() {
		return eobmDangeroseContactFax;
	}

	/**
	 * Set eobmDangeroseContactFax
	 */
	public void setEobmDangeroseContactFax(String eobmDangeroseContactFax) {
		this.eobmDangeroseContactFax = eobmDangeroseContactFax;
		addValidField("eobmDangeroseContactFax");
	}

	/**
	 * Get eobmDangeroseContactName
	 */
	@Column(name = "EOBM_DANGEROSE_CONTACT_NAME")
	public String getEobmDangeroseContactName() {
		return eobmDangeroseContactName;
	}

	/**
	 * Set eobmDangeroseContactName
	 */
	public void setEobmDangeroseContactName(String eobmDangeroseContactName) {
		this.eobmDangeroseContactName = eobmDangeroseContactName;
		addValidField("eobmDangeroseContactName");
	}

	/**
	 * Get eobmEbmaIsTemperature
	 */
	@Column(name = "EOBM_EBMA_IS_TEMPERATURE")
	public String getEobmEbmaIsTemperature() {
		return eobmEbmaIsTemperature;
	}

	/**
	 * Set eobmEbmaIsTemperature
	 */
	public void setEobmEbmaIsTemperature(String eobmEbmaIsTemperature) {
		this.eobmEbmaIsTemperature = eobmEbmaIsTemperature;
		addValidField("eobmEbmaIsTemperature");
	}

	/**
	 * Get eobmEbmaFeatures
	 */
	@Column(name = "EOBM_EBMA_FEATURES")
	public String getEobmEbmaFeatures() {
		return eobmEbmaFeatures;
	}

	/**
	 * Set eobmEbmaFeatures
	 */
	public void setEobmEbmaFeatures(String eobmEbmaFeatures) {
		this.eobmEbmaFeatures = eobmEbmaFeatures;
		addValidField("eobmEbmaFeatures");
	}

	/**
	 * Get eobmIsFreezeFlag
	 */
	@Column(name = "EOBM_IS_FREEZE_FLAG")
	public String getEobmIsFreezeFlag() {
		return eobmIsFreezeFlag;
	}

	/**
	 * Set eobmIsFreezeFlag
	 */
	public void setEobmIsFreezeFlag(String eobmIsFreezeFlag) {
		this.eobmIsFreezeFlag = eobmIsFreezeFlag;
		addValidField("eobmIsFreezeFlag");
	}

	/**
	 * Get eobmTemperatureUnit
	 */
	@Column(name = "EOBM_TEMPERATURE_UNIT")
	public String getEobmTemperatureUnit() {
		return eobmTemperatureUnit;
	}

	/**
	 * Set eobmTemperatureUnit
	 */
	public void setEobmTemperatureUnit(String eobmTemperatureUnit) {
		this.eobmTemperatureUnit = eobmTemperatureUnit;
		addValidField("eobmTemperatureUnit");
	}

	/**
	 * Get eobmTemperatureUnitName
	 */
	@Column(name = "EOBM_TEMPERATURE_UNIT_NAME")
	public String getEobmTemperatureUnitName() {
		return eobmTemperatureUnitName;
	}

	/**
	 * Set eobmTemperatureUnitName
	 */
	public void setEobmTemperatureUnitName(String eobmTemperatureUnitName) {
		this.eobmTemperatureUnitName = eobmTemperatureUnitName;
		addValidField("eobmTemperatureUnitName");
	}

	/**
	 * Get eobmEbmaTemperatureSetting
	 */
	@Column(name = "EOBM_EBMA_TEMPERATURE_SETTING")
	public Double getEobmEbmaTemperatureSetting() {
		return eobmEbmaTemperatureSetting;
	}

	/**
	 * Set eobmEbmaTemperatureSetting
	 */
	public void setEobmEbmaTemperatureSetting(Double eobmEbmaTemperatureSetting) {
		this.eobmEbmaTemperatureSetting = eobmEbmaTemperatureSetting;
		addValidField("eobmEbmaTemperatureSetting");
	}

	/**
	 * Get eobmEbmaMinTemperature
	 */
	@Column(name = "EOBM_EBMA_MIN_TEMPERATURE")
	public Double getEobmEbmaMinTemperature() {
		return eobmEbmaMinTemperature;
	}

	/**
	 * Set eobmEbmaMinTemperature
	 */
	public void setEobmEbmaMinTemperature(Double eobmEbmaMinTemperature) {
		this.eobmEbmaMinTemperature = eobmEbmaMinTemperature;
		addValidField("eobmEbmaMinTemperature");
	}

	/**
	 * Get eobmEbmaMaxTemperature
	 */
	@Column(name = "EOBM_EBMA_MAX_TEMPERATURE")
	public Double getEobmEbmaMaxTemperature() {
		return eobmEbmaMaxTemperature;
	}

	/**
	 * Set eobmEbmaMaxTemperature
	 */
	public void setEobmEbmaMaxTemperature(Double eobmEbmaMaxTemperature) {
		this.eobmEbmaMaxTemperature = eobmEbmaMaxTemperature;
		addValidField("eobmEbmaMaxTemperature");
	}

	/**
	 * Get eobmReeferVentilationFlux
	 */
	@Column(name = "EOBM_REEFER_VENTILATION_FLUX")
	public String getEobmReeferVentilationFlux() {
		return eobmReeferVentilationFlux;
	}

	/**
	 * Set eobmReeferVentilationFlux
	 */
	public void setEobmReeferVentilationFlux(String eobmReeferVentilationFlux) {
		this.eobmReeferVentilationFlux = eobmReeferVentilationFlux;
		addValidField("eobmReeferVentilationFlux");
	}

	/**
	 * Get eobmVent
	 */
	@Column(name = "EOBM_VENT")
	public String getEobmVent() {
		return eobmVent;
	}

	/**
	 * Set eobmVent
	 */
	public void setEobmVent(String eobmVent) {
		this.eobmVent = eobmVent;
		addValidField("eobmVent");
	}

	/**
	 * Get eobmHumidity
	 */
	@Column(name = "EOBM_HUMIDITY")
	public String getEobmHumidity() {
		return eobmHumidity;
	}

	/**
	 * Set eobmHumidity
	 */
	public void setEobmHumidity(String eobmHumidity) {
		this.eobmHumidity = eobmHumidity;
		addValidField("eobmHumidity");
	}

	/**
	 * Get eobmMark
	 */
	@Column(name = "EOBM_MARK")
	public String getEobmMark() {
		return eobmMark;
	}

	/**
	 * Set eobmMark
	 */
	public void setEobmMark(String eobmMark) {
		this.eobmMark = eobmMark;
		addValidField("eobmMark");
	}

	/**
	 * Get eobmCntBulkFlag
	 */
	@Column(name = "EOBM_CNT_BULK_FLAG")
	public String getEobmCntBulkFlag() {
		return eobmCntBulkFlag;
	}

	/**
	 * Set eobmCntBulkFlag
	 */
	public void setEobmCntBulkFlag(String eobmCntBulkFlag) {
		this.eobmCntBulkFlag = eobmCntBulkFlag;
		addValidField("eobmCntBulkFlag");
	}

	/**
	 * Get eobmDescription
	 */
	@Column(name = "EOBM_DESCRIPTION")
	public String getEobmDescription() {
		return eobmDescription;
	}

	/**
	 * Set eobmDescription
	 */
	public void setEobmDescription(String eobmDescription) {
		this.eobmDescription = eobmDescription;
		addValidField("eobmDescription");
	}

	/**
	 * Get eobmFreeTextDesc
	 */
	@Column(name = "EOBM_FREE_TEXT_DESC")
	public String getEobmFreeTextDesc() {
		return eobmFreeTextDesc;
	}

	/**
	 * Set eobmFreeTextDesc
	 */
	public void setEobmFreeTextDesc(String eobmFreeTextDesc) {
		this.eobmFreeTextDesc = eobmFreeTextDesc;
		addValidField("eobmFreeTextDesc");
	}

	/**
	 * Get eobmMaterialDescCn
	 */
	@Column(name = "EOBM_MATERIAL_DESC_CN")
	public String getEobmMaterialDescCn() {
		return eobmMaterialDescCn;
	}

	/**
	 * Set eobmMaterialDescCn
	 */
	public void setEobmMaterialDescCn(String eobmMaterialDescCn) {
		this.eobmMaterialDescCn = eobmMaterialDescCn;
		addValidField("eobmMaterialDescCn");
	}

	/**
	 * Get eobmBatch
	 */
	@Column(name = "EOBM_BATCH")
	public String getEobmBatch() {
		return eobmBatch;
	}

	/**
	 * Set eobmBatch
	 */
	public void setEobmBatch(String eobmBatch) {
		this.eobmBatch = eobmBatch;
		addValidField("eobmBatch");
	}

	/**
	 * Get eobmQuantity
	 */
	@Column(name = "EOBM_QUANTITY")
	public Long getEobmQuantity() {
		return eobmQuantity;
	}

	/**
	 * Set eobmQuantity
	 */
	public void setEobmQuantity(Long eobmQuantity) {
		this.eobmQuantity = eobmQuantity;
		addValidField("eobmQuantity");
	}

	/**
	 * Get eobmQuantityUnit
	 */
	@Column(name = "EOBM_QUANTITY_UNIT")
	public String getEobmQuantityUnit() {
		return eobmQuantityUnit;
	}

	/**
	 * Set eobmQuantityUnit
	 */
	public void setEobmQuantityUnit(String eobmQuantityUnit) {
		this.eobmQuantityUnit = eobmQuantityUnit;
		addValidField("eobmQuantityUnit");
	}

	/**
	 * Get eobmGrossWeight
	 */
	@Column(name = "EOBM_GROSS_WEIGHT")
	public Double getEobmGrossWeight() {
		return eobmGrossWeight;
	}

	/**
	 * Set eobmGrossWeight
	 */
	public void setEobmGrossWeight(Double eobmGrossWeight) {
		this.eobmGrossWeight = eobmGrossWeight;
		addValidField("eobmGrossWeight");
	}

	/**
	 * Get eobmNetWeight
	 */
	@Column(name = "EOBM_NET_WEIGHT")
	public Double getEobmNetWeight() {
		return eobmNetWeight;
	}

	/**
	 * Set eobmNetWeight
	 */
	public void setEobmNetWeight(Double eobmNetWeight) {
		this.eobmNetWeight = eobmNetWeight;
		addValidField("eobmNetWeight");
	}

	/**
	 * Get eobmVolume
	 */
	@Column(name = "EOBM_VOLUME")
	public Double getEobmVolume() {
		return eobmVolume;
	}

	/**
	 * Set eobmVolume
	 */
	public void setEobmVolume(Double eobmVolume) {
		this.eobmVolume = eobmVolume;
		addValidField("eobmVolume");
	}

	/**
	 * Get eobmOverLengthFront
	 */
	@Column(name = "EOBM_OVER_LENGTH_FRONT")
	public Double getEobmOverLengthFront() {
		return eobmOverLengthFront;
	}

	/**
	 * Set eobmOverLengthFront
	 */
	public void setEobmOverLengthFront(Double eobmOverLengthFront) {
		this.eobmOverLengthFront = eobmOverLengthFront;
		addValidField("eobmOverLengthFront");
	}

	/**
	 * Get eobmOverLengthBack
	 */
	@Column(name = "EOBM_OVER_LENGTH_BACK")
	public Double getEobmOverLengthBack() {
		return eobmOverLengthBack;
	}

	/**
	 * Set eobmOverLengthBack
	 */
	public void setEobmOverLengthBack(Double eobmOverLengthBack) {
		this.eobmOverLengthBack = eobmOverLengthBack;
		addValidField("eobmOverLengthBack");
	}

	/**
	 * Get eobmOverWidthLeft
	 */
	@Column(name = "EOBM_OVER_WIDTH_LEFT")
	public Double getEobmOverWidthLeft() {
		return eobmOverWidthLeft;
	}

	/**
	 * Set eobmOverWidthLeft
	 */
	public void setEobmOverWidthLeft(Double eobmOverWidthLeft) {
		this.eobmOverWidthLeft = eobmOverWidthLeft;
		addValidField("eobmOverWidthLeft");
	}

	/**
	 * Get eobmOverWidthRight
	 */
	@Column(name = "EOBM_OVER_WIDTH_RIGHT")
	public Double getEobmOverWidthRight() {
		return eobmOverWidthRight;
	}

	/**
	 * Set eobmOverWidthRight
	 */
	public void setEobmOverWidthRight(Double eobmOverWidthRight) {
		this.eobmOverWidthRight = eobmOverWidthRight;
		addValidField("eobmOverWidthRight");
	}

	/**
	 * Get eobmOverHeight
	 */
	@Column(name = "EOBM_OVER_HEIGHT")
	public Double getEobmOverHeight() {
		return eobmOverHeight;
	}

	/**
	 * Set eobmOverHeight
	 */
	public void setEobmOverHeight(Double eobmOverHeight) {
		this.eobmOverHeight = eobmOverHeight;
		addValidField("eobmOverHeight");
	}

	/**
	 * Get eobmMaterialTypeCode
	 */
	@Column(name = "EOBM_MATERIAL_TYPE_CODE")
	public String getEobmMaterialTypeCode() {
		return eobmMaterialTypeCode;
	}

	/**
	 * Set eobmMaterialTypeCode
	 */
	public void setEobmMaterialTypeCode(String eobmMaterialTypeCode) {
		this.eobmMaterialTypeCode = eobmMaterialTypeCode;
		addValidField("eobmMaterialTypeCode");
	}

	/**
	 * Get eobmMaterialTypeName
	 */
	@Column(name = "EOBM_MATERIAL_TYPE_NAME")
	public String getEobmMaterialTypeName() {
		return eobmMaterialTypeName;
	}

	/**
	 * Set eobmMaterialTypeName
	 */
	public void setEobmMaterialTypeName(String eobmMaterialTypeName) {
		this.eobmMaterialTypeName = eobmMaterialTypeName;
		addValidField("eobmMaterialTypeName");
	}

	/**
	 * Get eobmIsBig
	 */
	@Column(name = "EOBM_IS_BIG")
	public String getEobmIsBig() {
		return eobmIsBig;
	}

	/**
	 * Set eobmIsBig
	 */
	public void setEobmIsBig(String eobmIsBig) {
		this.eobmIsBig = eobmIsBig;
		addValidField("eobmIsBig");
	}

	/**
	 * Get eobmLength
	 */
	@Column(name = "EOBM_LENGTH")
	public Double getEobmLength() {
		return eobmLength;
	}

	/**
	 * Set eobmLength
	 */
	public void setEobmLength(Double eobmLength) {
		this.eobmLength = eobmLength;
		addValidField("eobmLength");
	}

	/**
	 * Get eobmWidth
	 */
	@Column(name = "EOBM_WIDTH")
	public Double getEobmWidth() {
		return eobmWidth;
	}

	/**
	 * Set eobmWidth
	 */
	public void setEobmWidth(Double eobmWidth) {
		this.eobmWidth = eobmWidth;
		addValidField("eobmWidth");
	}

	/**
	 * Get eobmHigh
	 */
	@Column(name = "EOBM_HIGH")
	public Double getEobmHigh() {
		return eobmHigh;
	}

	/**
	 * Set eobmHigh
	 */
	public void setEobmHigh(Double eobmHigh) {
		this.eobmHigh = eobmHigh;
		addValidField("eobmHigh");
	}

	/**
	 * Get eobmPkgVolume
	 */
	@Column(name = "EOBM_PKG_VOLUME")
	public Double getEobmPkgVolume() {
		return eobmPkgVolume;
	}

	/**
	 * Set eobmPkgVolume
	 */
	public void setEobmPkgVolume(Double eobmPkgVolume) {
		this.eobmPkgVolume = eobmPkgVolume;
		addValidField("eobmPkgVolume");
	}

	/**
	 * Get eobmPkgTareWeight
	 */
	@Column(name = "EOBM_PKG_TARE_WEIGHT")
	public Double getEobmPkgTareWeight() {
		return eobmPkgTareWeight;
	}

	/**
	 * Set eobmPkgTareWeight
	 */
	public void setEobmPkgTareWeight(Double eobmPkgTareWeight) {
		this.eobmPkgTareWeight = eobmPkgTareWeight;
		addValidField("eobmPkgTareWeight");
	}

	/**
	 * Get eobmPkgVolumeS
	 */
	@Column(name = "EOBM_PKG_VOLUME_S")
	public Double getEobmPkgVolumeS() {
		return eobmPkgVolumeS;
	}

	/**
	 * Set eobmPkgVolumeS
	 */
	public void setEobmPkgVolumeS(Double eobmPkgVolumeS) {
		this.eobmPkgVolumeS = eobmPkgVolumeS;
		addValidField("eobmPkgVolumeS");
	}

	/**
	 * Get eobmPkgTareWeightS
	 */
	@Column(name = "EOBM_PKG_TARE_WEIGHT_S")
	public Double getEobmPkgTareWeightS() {
		return eobmPkgTareWeightS;
	}

	/**
	 * Set eobmPkgTareWeightS
	 */
	public void setEobmPkgTareWeightS(Double eobmPkgTareWeightS) {
		this.eobmPkgTareWeightS = eobmPkgTareWeightS;
		addValidField("eobmPkgTareWeightS");
	}

	/**
	 * Get eobmPkgsCodeS
	 */
	@Column(name = "EOBM_PKGS_CODE_S")
	public String getEobmPkgsCodeS() {
		return eobmPkgsCodeS;
	}

	/**
	 * Set eobmPkgsCodeS
	 */
	public void setEobmPkgsCodeS(String eobmPkgsCodeS) {
		this.eobmPkgsCodeS = eobmPkgsCodeS;
		addValidField("eobmPkgsCodeS");
	}

	/**
	 * Get eobmPkgsNameS
	 */
	@Column(name = "EOBM_PKGS_NAME_S")
	public String getEobmPkgsNameS() {
		return eobmPkgsNameS;
	}

	/**
	 * Set eobmPkgsNameS
	 */
	public void setEobmPkgsNameS(String eobmPkgsNameS) {
		this.eobmPkgsNameS = eobmPkgsNameS;
		addValidField("eobmPkgsNameS");
	}

	/**
	 * Get eobmMaterialPackageNumberS
	 */
	@Column(name = "EOBM_MATERIAL_PACKAGE_NUMBER_S")
	public Integer getEobmMaterialPackageNumberS() {
		return eobmMaterialPackageNumberS;
	}

	/**
	 * Set eobmMaterialPackageNumberS
	 */
	public void setEobmMaterialPackageNumberS(Integer eobmMaterialPackageNumberS) {
		this.eobmMaterialPackageNumberS = eobmMaterialPackageNumberS;
		addValidField("eobmMaterialPackageNumberS");
	}

	/**
	 * Get eobmCtnStatus
	 */
	@Column(name = "EOBM_CTN_STATUS")
	public String getEobmCtnStatus() {
		return eobmCtnStatus;
	}

	/**
	 * Set eobmCtnStatus
	 */
	public void setEobmCtnStatus(String eobmCtnStatus) {
		this.eobmCtnStatus = eobmCtnStatus;
		addValidField("eobmCtnStatus");
	}

	/**
	 * Get eobmIsNormalFreeze
	 */
	@Column(name = "EOBM_IS_NORMAL_FREEZE")
	public String getEobmIsNormalFreeze() {
		return eobmIsNormalFreeze;
	}

	/**
	 * Set eobmIsNormalFreeze
	 */
	public void setEobmIsNormalFreeze(String eobmIsNormalFreeze) {
		this.eobmIsNormalFreeze = eobmIsNormalFreeze;
		addValidField("eobmIsNormalFreeze");
	}

	/**
	 * Get eobmRemark
	 */
	@Column(name = "EOBM_REMARK")
	public String getEobmRemark() {
		return eobmRemark;
	}

	/**
	 * Set eobmRemark
	 */
	public void setEobmRemark(String eobmRemark) {
		this.eobmRemark = eobmRemark;
		addValidField("eobmRemark");
	}

	/**
	 * Get eobmSubstr1
	 */
	@Column(name = "EOBM_SUBSTR1")
	public String getEobmSubstr1() {
		return eobmSubstr1;
	}

	/**
	 * Set eobmSubstr1
	 */
	public void setEobmSubstr1(String eobmSubstr1) {
		this.eobmSubstr1 = eobmSubstr1;
		addValidField("eobmSubstr1");
	}

	/**
	 * Get eobmSubstr2
	 */
	@Column(name = "EOBM_SUBSTR2")
	public String getEobmSubstr2() {
		return eobmSubstr2;
	}

	/**
	 * Set eobmSubstr2
	 */
	public void setEobmSubstr2(String eobmSubstr2) {
		this.eobmSubstr2 = eobmSubstr2;
		addValidField("eobmSubstr2");
	}

	/**
	 * Get eobmSubstr3
	 */
	@Column(name = "EOBM_SUBSTR3")
	public String getEobmSubstr3() {
		return eobmSubstr3;
	}

	/**
	 * Set eobmSubstr3
	 */
	public void setEobmSubstr3(String eobmSubstr3) {
		this.eobmSubstr3 = eobmSubstr3;
		addValidField("eobmSubstr3");
	}

	/**
	 * Get eobmSubstr4
	 */
	@Column(name = "EOBM_SUBSTR4")
	public String getEobmSubstr4() {
		return eobmSubstr4;
	}

	/**
	 * Set eobmSubstr4
	 */
	public void setEobmSubstr4(String eobmSubstr4) {
		this.eobmSubstr4 = eobmSubstr4;
		addValidField("eobmSubstr4");
	}

	/**
	 * Get eobmSubdate1
	 */
	@Column(name = "EOBM_SUBDATE1")
	public Date getEobmSubdate1() {
		return eobmSubdate1;
	}

	/**
	 * Set eobmSubdate1
	 */
	public void setEobmSubdate1(Date eobmSubdate1) {
		this.eobmSubdate1 = eobmSubdate1;
		addValidField("eobmSubdate1");
	}

	/**
	 * Get eobmSubdate2
	 */
	@Column(name = "EOBM_SUBDATE2")
	public Date getEobmSubdate2() {
		return eobmSubdate2;
	}

	/**
	 * Set eobmSubdate2
	 */
	public void setEobmSubdate2(Date eobmSubdate2) {
		this.eobmSubdate2 = eobmSubdate2;
		addValidField("eobmSubdate2");
	}

	/**
	 * Get eobmSubnum1
	 */
	@Column(name = "EOBM_SUBNUM1")
	public Long getEobmSubnum1() {
		return eobmSubnum1;
	}

	/**
	 * Set eobmSubnum1
	 */
	public void setEobmSubnum1(Long eobmSubnum1) {
		this.eobmSubnum1 = eobmSubnum1;
		addValidField("eobmSubnum1");
	}

	/**
	 * Get eobmSubnum2
	 */
	@Column(name = "EOBM_SUBNUM2")
	public Long getEobmSubnum2() {
		return eobmSubnum2;
	}

	/**
	 * Set eobmSubnum2
	 */
	public void setEobmSubnum2(Long eobmSubnum2) {
		this.eobmSubnum2 = eobmSubnum2;
		addValidField("eobmSubnum2");
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
	 * Get eobmBlEbtpPackageType
	 */
	@Column(name = "EOBM_BL_EBTP_PACKAGE_TYPE")
	public String getEobmBlEbtpPackageType() {
		return eobmBlEbtpPackageType;
	}

	/**
	 * Set eobmBlEbtpPackageType
	 */
	public void setEobmBlEbtpPackageType(String eobmBlEbtpPackageType) {
		this.eobmBlEbtpPackageType = eobmBlEbtpPackageType;
		addValidField("eobmBlEbtpPackageType");
	}

	/**
	 * Get eobmDangeroseContactTel
	 */
	@Column(name = "EOBM_DANGEROSE_CONTACT_TEL")
	public String getEobmDangeroseContactTel() {
		return eobmDangeroseContactTel;
	}
	
	/**
	 * Set eobmDangeroseContactTel
	 */
	public void setEobmDangeroseContactTel(String eobmDangeroseContactTel) {
		this.eobmDangeroseContactTel = eobmDangeroseContactTel;
		addValidField("eobmDangeroseContactTel");
	}
}
