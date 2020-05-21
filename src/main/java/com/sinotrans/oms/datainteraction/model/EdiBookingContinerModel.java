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
 * Model class for EdiBookingContiner
 */
@Entity
@Table(name = "EDI_BOOKING_CONTINER")
public class EdiBookingContinerModel extends BaseModel implements OperationLog {

	//edbcId
	private Long edbcId;
	//edbcEdboId
	private Long edbcEdboId;
	//edbcContainerNo
	private String edbcContainerNo;
	//edbcCntCustomized
	private String edbcCntCustomized;
	//edbcCntCustomizedSize
	private String edbcCntCustomizedSize;
	//edbcSealNo
	private String edbcSealNo;
	//edbcSealKind
	private String edbcSealKind;
	//edbcSealAgencyCode
	private String edbcSealAgencyCode;
	//edbcSealAgencyName
	private String edbcSealAgencyName;
	//edbcCtnStatus
	private String edbcCtnStatus;
	//edbcCtnPackageNumber
	private Integer edbcCtnPackageNumber;
	//edbcCargoNetWeight
	private Double edbcCargoNetWeight;
	//edbcTareWeight
	private Double edbcTareWeight;
	//edbcCargoMeasurement
	private Double edbcCargoMeasurement;
	//edbcCntSupplierType
	private Integer edbcCntSupplierType;
	//edbcSubstr1
	private String edbcSubstr1;
	//edbcSubstr2
	private String edbcSubstr2;
	//edbcSubstr3
	private String edbcSubstr3;
	//edbcSubstr4
	private String edbcSubstr4;
	//edbcSubstr5
	private String edbcSubstr5;
	//edbcSubstr6
	private String edbcSubstr6;
	//edbcSubstr7
	private String edbcSubstr7;
	//edbcSubstr8
	private String edbcSubstr8;
	//edbcSubdate1
	private Date edbcSubdate1;
	//edbcSubdate2
	private Date edbcSubdate2;
	//edbcSubdate3
	private Date edbcSubdate3;
	//edbcSubdate4
	private Date edbcSubdate4;
	//edbcSubnum1
	private Long edbcSubnum1;
	//edbcSubnum2
	private Long edbcSubnum2;
	//edbcSubnum3
	private Long edbcSubnum3;
	//edbcSubnum4
	private Long edbcSubnum4;
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
	//edbcVgmGrossWeight
	private Long edbcVgmGrossWeight;
	//edbcVgmDate
	private Date edbcVgmDate;
	//edbcVgmMethod
	private String edbcVgmMethod;
	//edbcLocationCode
	private String edbcLocationCode;
	//edbcLocationName
	private String edbcLocationName;
	//edbcVgmCertificateRef
	private String edbcVgmCertificateRef;
	//edbcShipperName
	private String edbcShipperName;
	//edbcShipperAddress
	private String edbcShipperAddress;
	//edbcShipperVgmName
	private String edbcShipperVgmName;
	//edbcShipperVgmEmail
	private String edbcShipperVgmEmail;
	//edbcShipperVgmTelephone
	private String edbcShipperVgmTelephone;
	//edbcShipperVgmPerson
	private String edbcShipperVgmPerson;
	//edbcShipperVgmPersonSig
	private String edbcShipperVgmPersonSig;
	//edbcCompanyName
	private String edbcCompanyName;
	//edbcCompanyAddress
	private String edbcCompanyAddress;
	//edbcCompanyContactName
	private String edbcCompanyContactName;
	//edbcCompanyContactEmail
	private String edbcCompanyContactEmail;
	//edbcCompanyContactTelephone
	private String edbcCompanyContactTelephone;
	//edbcCompanyContactPerson
	private String edbcCompanyContactPerson;
	//edbcCompanyContactSig
	private String edbcCompanyContactSig;

	/**
	 * Get edbcId
	 */
	@Column(name = "EDBC_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEdbcId() {
		return edbcId;
	}

	/**
	 * Set edbcId
	 */
	public void setEdbcId(Long edbcId) {
		this.edbcId = edbcId;
		addValidField("edbcId");
	}

	/**
	 * Get edbcEdboId
	 */
	@Column(name = "EDBC_EDBO_ID")
	public Long getEdbcEdboId() {
		return edbcEdboId;
	}

	/**
	 * Set edbcEdboId
	 */
	public void setEdbcEdboId(Long edbcEdboId) {
		this.edbcEdboId = edbcEdboId;
		addValidField("edbcEdboId");
	}

	/**
	 * Get edbcContainerNo
	 */
	@Column(name = "EDBC_CONTAINER_NO")
	public String getEdbcContainerNo() {
		return edbcContainerNo;
	}

	/**
	 * Set edbcContainerNo
	 */
	public void setEdbcContainerNo(String edbcContainerNo) {
		this.edbcContainerNo = edbcContainerNo;
		addValidField("edbcContainerNo");
	}

	/**
	 * Get edbcCntCustomized
	 */
	@Column(name = "EDBC_CNT_CUSTOMIZED")
	public String getEdbcCntCustomized() {
		return edbcCntCustomized;
	}

	/**
	 * Set edbcCntCustomized
	 */
	public void setEdbcCntCustomized(String edbcCntCustomized) {
		this.edbcCntCustomized = edbcCntCustomized;
		addValidField("edbcCntCustomized");
	}

	/**
	 * Get edbcCntCustomizedSize
	 */
	@Column(name = "EDBC_CNT_CUSTOMIZED_SIZE")
	public String getEdbcCntCustomizedSize() {
		return edbcCntCustomizedSize;
	}

	/**
	 * Set edbcCntCustomizedSize
	 */
	public void setEdbcCntCustomizedSize(String edbcCntCustomizedSize) {
		this.edbcCntCustomizedSize = edbcCntCustomizedSize;
		addValidField("edbcCntCustomizedSize");
	}

	/**
	 * Get edbcSealNo
	 */
	@Column(name = "EDBC_SEAL_NO")
	public String getEdbcSealNo() {
		return edbcSealNo;
	}

	/**
	 * Set edbcSealNo
	 */
	public void setEdbcSealNo(String edbcSealNo) {
		this.edbcSealNo = edbcSealNo;
		addValidField("edbcSealNo");
	}

	/**
	 * Get edbcSealKind
	 */
	@Column(name = "EDBC_SEAL_KIND")
	public String getEdbcSealKind() {
		return edbcSealKind;
	}

	/**
	 * Set edbcSealKind
	 */
	public void setEdbcSealKind(String edbcSealKind) {
		this.edbcSealKind = edbcSealKind;
		addValidField("edbcSealKind");
	}

	/**
	 * Get edbcSealAgencyCode
	 */
	@Column(name = "EDBC_SEAL_AGENCY_CODE")
	public String getEdbcSealAgencyCode() {
		return edbcSealAgencyCode;
	}

	/**
	 * Set edbcSealAgencyCode
	 */
	public void setEdbcSealAgencyCode(String edbcSealAgencyCode) {
		this.edbcSealAgencyCode = edbcSealAgencyCode;
		addValidField("edbcSealAgencyCode");
	}

	/**
	 * Get edbcSealAgencyName
	 */
	@Column(name = "EDBC_SEAL_AGENCY_NAME")
	public String getEdbcSealAgencyName() {
		return edbcSealAgencyName;
	}

	/**
	 * Set edbcSealAgencyName
	 */
	public void setEdbcSealAgencyName(String edbcSealAgencyName) {
		this.edbcSealAgencyName = edbcSealAgencyName;
		addValidField("edbcSealAgencyName");
	}

	/**
	 * Get edbcCtnStatus
	 */
	@Column(name = "EDBC_CTN_STATUS")
	public String getEdbcCtnStatus() {
		return edbcCtnStatus;
	}

	/**
	 * Set edbcCtnStatus
	 */
	public void setEdbcCtnStatus(String edbcCtnStatus) {
		this.edbcCtnStatus = edbcCtnStatus;
		addValidField("edbcCtnStatus");
	}

	/**
	 * Get edbcCtnPackageNumber
	 */
	@Column(name = "EDBC_CTN_PACKAGE_NUMBER")
	public Integer getEdbcCtnPackageNumber() {
		return edbcCtnPackageNumber;
	}

	/**
	 * Set edbcCtnPackageNumber
	 */
	public void setEdbcCtnPackageNumber(Integer edbcCtnPackageNumber) {
		this.edbcCtnPackageNumber = edbcCtnPackageNumber;
		addValidField("edbcCtnPackageNumber");
	}

	/**
	 * Get edbcCargoNetWeight
	 */
	@Column(name = "EDBC_CARGO_NET_WEIGHT")
	public Double getEdbcCargoNetWeight() {
		return edbcCargoNetWeight;
	}

	/**
	 * Set edbcCargoNetWeight
	 */
	public void setEdbcCargoNetWeight(Double edbcCargoNetWeight) {
		this.edbcCargoNetWeight = edbcCargoNetWeight;
		addValidField("edbcCargoNetWeight");
	}

	/**
	 * Get edbcTareWeight
	 */
	@Column(name = "EDBC_TARE_WEIGHT")
	public Double getEdbcTareWeight() {
		return edbcTareWeight;
	}

	/**
	 * Set edbcTareWeight
	 */
	public void setEdbcTareWeight(Double edbcTareWeight) {
		this.edbcTareWeight = edbcTareWeight;
		addValidField("edbcTareWeight");
	}

	/**
	 * Get edbcCargoMeasurement
	 */
	@Column(name = "EDBC_CARGO_MEASUREMENT")
	public Double getEdbcCargoMeasurement() {
		return edbcCargoMeasurement;
	}

	/**
	 * Set edbcCargoMeasurement
	 */
	public void setEdbcCargoMeasurement(Double edbcCargoMeasurement) {
		this.edbcCargoMeasurement = edbcCargoMeasurement;
		addValidField("edbcCargoMeasurement");
	}

	/**
	 * Get edbcCntSupplierType
	 */
	@Column(name = "EDBC_CNT_SUPPLIER_TYPE")
	public Integer getEdbcCntSupplierType() {
		return edbcCntSupplierType;
	}

	/**
	 * Set edbcCntSupplierType
	 */
	public void setEdbcCntSupplierType(Integer edbcCntSupplierType) {
		this.edbcCntSupplierType = edbcCntSupplierType;
		addValidField("edbcCntSupplierType");
	}

	/**
	 * Get edbcSubstr1
	 */
	@Column(name = "EDBC_SUBSTR1")
	public String getEdbcSubstr1() {
		return edbcSubstr1;
	}

	/**
	 * Set edbcSubstr1
	 */
	public void setEdbcSubstr1(String edbcSubstr1) {
		this.edbcSubstr1 = edbcSubstr1;
		addValidField("edbcSubstr1");
	}

	/**
	 * Get edbcSubstr2
	 */
	@Column(name = "EDBC_SUBSTR2")
	public String getEdbcSubstr2() {
		return edbcSubstr2;
	}

	/**
	 * Set edbcSubstr2
	 */
	public void setEdbcSubstr2(String edbcSubstr2) {
		this.edbcSubstr2 = edbcSubstr2;
		addValidField("edbcSubstr2");
	}

	/**
	 * Get edbcSubstr3
	 */
	@Column(name = "EDBC_SUBSTR3")
	public String getEdbcSubstr3() {
		return edbcSubstr3;
	}

	/**
	 * Set edbcSubstr3
	 */
	public void setEdbcSubstr3(String edbcSubstr3) {
		this.edbcSubstr3 = edbcSubstr3;
		addValidField("edbcSubstr3");
	}

	/**
	 * Get edbcSubstr4
	 */
	@Column(name = "EDBC_SUBSTR4")
	public String getEdbcSubstr4() {
		return edbcSubstr4;
	}

	/**
	 * Set edbcSubstr4
	 */
	public void setEdbcSubstr4(String edbcSubstr4) {
		this.edbcSubstr4 = edbcSubstr4;
		addValidField("edbcSubstr4");
	}

	/**
	 * Get edbcSubstr5
	 */
	@Column(name = "EDBC_SUBSTR5")
	public String getEdbcSubstr5() {
		return edbcSubstr5;
	}

	/**
	 * Set edbcSubstr5
	 */
	public void setEdbcSubstr5(String edbcSubstr5) {
		this.edbcSubstr5 = edbcSubstr5;
		addValidField("edbcSubstr5");
	}

	/**
	 * Get edbcSubstr6
	 */
	@Column(name = "EDBC_SUBSTR6")
	public String getEdbcSubstr6() {
		return edbcSubstr6;
	}

	/**
	 * Set edbcSubstr6
	 */
	public void setEdbcSubstr6(String edbcSubstr6) {
		this.edbcSubstr6 = edbcSubstr6;
		addValidField("edbcSubstr6");
	}

	/**
	 * Get edbcSubstr7
	 */
	@Column(name = "EDBC_SUBSTR7")
	public String getEdbcSubstr7() {
		return edbcSubstr7;
	}

	/**
	 * Set edbcSubstr7
	 */
	public void setEdbcSubstr7(String edbcSubstr7) {
		this.edbcSubstr7 = edbcSubstr7;
		addValidField("edbcSubstr7");
	}

	/**
	 * Get edbcSubstr8
	 */
	@Column(name = "EDBC_SUBSTR8")
	public String getEdbcSubstr8() {
		return edbcSubstr8;
	}

	/**
	 * Set edbcSubstr8
	 */
	public void setEdbcSubstr8(String edbcSubstr8) {
		this.edbcSubstr8 = edbcSubstr8;
		addValidField("edbcSubstr8");
	}

	/**
	 * Get edbcSubdate1
	 */
	@Column(name = "EDBC_SUBDATE1")
	public Date getEdbcSubdate1() {
		return edbcSubdate1;
	}

	/**
	 * Set edbcSubdate1
	 */
	public void setEdbcSubdate1(Date edbcSubdate1) {
		this.edbcSubdate1 = edbcSubdate1;
		addValidField("edbcSubdate1");
	}

	/**
	 * Get edbcSubdate2
	 */
	@Column(name = "EDBC_SUBDATE2")
	public Date getEdbcSubdate2() {
		return edbcSubdate2;
	}

	/**
	 * Set edbcSubdate2
	 */
	public void setEdbcSubdate2(Date edbcSubdate2) {
		this.edbcSubdate2 = edbcSubdate2;
		addValidField("edbcSubdate2");
	}

	/**
	 * Get edbcSubdate3
	 */
	@Column(name = "EDBC_SUBDATE3")
	public Date getEdbcSubdate3() {
		return edbcSubdate3;
	}

	/**
	 * Set edbcSubdate3
	 */
	public void setEdbcSubdate3(Date edbcSubdate3) {
		this.edbcSubdate3 = edbcSubdate3;
		addValidField("edbcSubdate3");
	}

	/**
	 * Get edbcSubdate4
	 */
	@Column(name = "EDBC_SUBDATE4")
	public Date getEdbcSubdate4() {
		return edbcSubdate4;
	}

	/**
	 * Set edbcSubdate4
	 */
	public void setEdbcSubdate4(Date edbcSubdate4) {
		this.edbcSubdate4 = edbcSubdate4;
		addValidField("edbcSubdate4");
	}

	/**
	 * Get edbcSubnum1
	 */
	@Column(name = "EDBC_SUBNUM1")
	public Long getEdbcSubnum1() {
		return edbcSubnum1;
	}

	/**
	 * Set edbcSubnum1
	 */
	public void setEdbcSubnum1(Long edbcSubnum1) {
		this.edbcSubnum1 = edbcSubnum1;
		addValidField("edbcSubnum1");
	}

	/**
	 * Get edbcSubnum2
	 */
	@Column(name = "EDBC_SUBNUM2")
	public Long getEdbcSubnum2() {
		return edbcSubnum2;
	}

	/**
	 * Set edbcSubnum2
	 */
	public void setEdbcSubnum2(Long edbcSubnum2) {
		this.edbcSubnum2 = edbcSubnum2;
		addValidField("edbcSubnum2");
	}

	/**
	 * Get edbcSubnum3
	 */
	@Column(name = "EDBC_SUBNUM3")
	public Long getEdbcSubnum3() {
		return edbcSubnum3;
	}

	/**
	 * Set edbcSubnum3
	 */
	public void setEdbcSubnum3(Long edbcSubnum3) {
		this.edbcSubnum3 = edbcSubnum3;
		addValidField("edbcSubnum3");
	}

	/**
	 * Get edbcSubnum4
	 */
	@Column(name = "EDBC_SUBNUM4")
	public Long getEdbcSubnum4() {
		return edbcSubnum4;
	}

	/**
	 * Set edbcSubnum4
	 */
	public void setEdbcSubnum4(Long edbcSubnum4) {
		this.edbcSubnum4 = edbcSubnum4;
		addValidField("edbcSubnum4");
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
	 * Get edbcVgmGrossWeight
	 */
	@Column(name = "EDBC_VGM_GROSS_WEIGHT")
	public Long getEdbcVgmGrossWeight() {
		return edbcVgmGrossWeight;
	}

	/**
	 * Set edbcVgmGrossWeight
	 */
	public void setEdbcVgmGrossWeight(Long edbcVgmGrossWeight) {
		this.edbcVgmGrossWeight = edbcVgmGrossWeight;
		addValidField("edbcVgmGrossWeight");
	}

	/**
	 * Get edbcVgmDate
	 */
	@Column(name = "EDBC_VGM_DATE")
	public Date getEdbcVgmDate() {
		return edbcVgmDate;
	}

	/**
	 * Set edbcVgmDate
	 */
	public void setEdbcVgmDate(Date edbcVgmDate) {
		this.edbcVgmDate = edbcVgmDate;
		addValidField("edbcVgmDate");
	}

	/**
	 * Get edbcVgmMethod
	 */
	@Column(name = "EDBC_VGM_METHOD")
	public String getEdbcVgmMethod() {
		return edbcVgmMethod;
	}

	/**
	 * Set edbcVgmMethod
	 */
	public void setEdbcVgmMethod(String edbcVgmMethod) {
		this.edbcVgmMethod = edbcVgmMethod;
		addValidField("edbcVgmMethod");
	}

	/**
	 * Get edbcLocationCode
	 */
	@Column(name = "EDBC_LOCATION_CODE")
	public String getEdbcLocationCode() {
		return edbcLocationCode;
	}

	/**
	 * Set edbcLocationCode
	 */
	public void setEdbcLocationCode(String edbcLocationCode) {
		this.edbcLocationCode = edbcLocationCode;
		addValidField("edbcLocationCode");
	}

	/**
	 * Get edbcLocationName
	 */
	@Column(name = "EDBC_LOCATION_NAME")
	public String getEdbcLocationName() {
		return edbcLocationName;
	}

	/**
	 * Set edbcLocationName
	 */
	public void setEdbcLocationName(String edbcLocationName) {
		this.edbcLocationName = edbcLocationName;
		addValidField("edbcLocationName");
	}

	/**
	 * Get edbcVgmCertificateRef
	 */
	@Column(name = "EDBC_VGM_CERTIFICATE_REF")
	public String getEdbcVgmCertificateRef() {
		return edbcVgmCertificateRef;
	}

	/**
	 * Set edbcVgmCertificateRef
	 */
	public void setEdbcVgmCertificateRef(String edbcVgmCertificateRef) {
		this.edbcVgmCertificateRef = edbcVgmCertificateRef;
		addValidField("edbcVgmCertificateRef");
	}

	/**
	 * Get edbcShipperName
	 */
	@Column(name = "EDBC_SHIPPER_NAME")
	public String getEdbcShipperName() {
		return edbcShipperName;
	}

	/**
	 * Set edbcShipperName
	 */
	public void setEdbcShipperName(String edbcShipperName) {
		this.edbcShipperName = edbcShipperName;
		addValidField("edbcShipperName");
	}

	/**
	 * Get edbcShipperAddress
	 */
	@Column(name = "EDBC_SHIPPER_ADDRESS")
	public String getEdbcShipperAddress() {
		return edbcShipperAddress;
	}

	/**
	 * Set edbcShipperAddress
	 */
	public void setEdbcShipperAddress(String edbcShipperAddress) {
		this.edbcShipperAddress = edbcShipperAddress;
		addValidField("edbcShipperAddress");
	}

	/**
	 * Get edbcShipperVgmName
	 */
	@Column(name = "EDBC_SHIPPER_VGM_NAME")
	public String getEdbcShipperVgmName() {
		return edbcShipperVgmName;
	}

	/**
	 * Set edbcShipperVgmName
	 */
	public void setEdbcShipperVgmName(String edbcShipperVgmName) {
		this.edbcShipperVgmName = edbcShipperVgmName;
		addValidField("edbcShipperVgmName");
	}

	/**
	 * Get edbcShipperVgmEmail
	 */
	@Column(name = "EDBC_SHIPPER_VGM_EMAIL")
	public String getEdbcShipperVgmEmail() {
		return edbcShipperVgmEmail;
	}

	/**
	 * Set edbcShipperVgmEmail
	 */
	public void setEdbcShipperVgmEmail(String edbcShipperVgmEmail) {
		this.edbcShipperVgmEmail = edbcShipperVgmEmail;
		addValidField("edbcShipperVgmEmail");
	}

	/**
	 * Get edbcShipperVgmTelephone
	 */
	@Column(name = "EDBC_SHIPPER_VGM_TELEPHONE")
	public String getEdbcShipperVgmTelephone() {
		return edbcShipperVgmTelephone;
	}

	/**
	 * Set edbcShipperVgmTelephone
	 */
	public void setEdbcShipperVgmTelephone(String edbcShipperVgmTelephone) {
		this.edbcShipperVgmTelephone = edbcShipperVgmTelephone;
		addValidField("edbcShipperVgmTelephone");
	}

	/**
	 * Get edbcShipperVgmPerson
	 */
	@Column(name = "EDBC_SHIPPER_VGM_PERSON")
	public String getEdbcShipperVgmPerson() {
		return edbcShipperVgmPerson;
	}

	/**
	 * Set edbcShipperVgmPerson
	 */
	public void setEdbcShipperVgmPerson(String edbcShipperVgmPerson) {
		this.edbcShipperVgmPerson = edbcShipperVgmPerson;
		addValidField("edbcShipperVgmPerson");
	}

	/**
	 * Get edbcShipperVgmPersonSig
	 */
	@Column(name = "EDBC_SHIPPER_VGM_PERSON_SIG")
	public String getEdbcShipperVgmPersonSig() {
		return edbcShipperVgmPersonSig;
	}

	/**
	 * Set edbcShipperVgmPersonSig
	 */
	public void setEdbcShipperVgmPersonSig(String edbcShipperVgmPersonSig) {
		this.edbcShipperVgmPersonSig = edbcShipperVgmPersonSig;
		addValidField("edbcShipperVgmPersonSig");
	}

	/**
	 * Get edbcCompanyName
	 */
	@Column(name = "EDBC_COMPANY_NAME")
	public String getEdbcCompanyName() {
		return edbcCompanyName;
	}

	/**
	 * Set edbcCompanyName
	 */
	public void setEdbcCompanyName(String edbcCompanyName) {
		this.edbcCompanyName = edbcCompanyName;
		addValidField("edbcCompanyName");
	}

	/**
	 * Get edbcCompanyAddress
	 */
	@Column(name = "EDBC_COMPANY_ADDRESS")
	public String getEdbcCompanyAddress() {
		return edbcCompanyAddress;
	}

	/**
	 * Set edbcCompanyAddress
	 */
	public void setEdbcCompanyAddress(String edbcCompanyAddress) {
		this.edbcCompanyAddress = edbcCompanyAddress;
		addValidField("edbcCompanyAddress");
	}

	/**
	 * Get edbcCompanyContactName
	 */
	@Column(name = "EDBC_COMPANY_CONTACT_NAME")
	public String getEdbcCompanyContactName() {
		return edbcCompanyContactName;
	}

	/**
	 * Set edbcCompanyContactName
	 */
	public void setEdbcCompanyContactName(String edbcCompanyContactName) {
		this.edbcCompanyContactName = edbcCompanyContactName;
		addValidField("edbcCompanyContactName");
	}

	/**
	 * Get edbcCompanyContactEmail
	 */
	@Column(name = "EDBC_COMPANY_CONTACT_EMAIL")
	public String getEdbcCompanyContactEmail() {
		return edbcCompanyContactEmail;
	}

	/**
	 * Set edbcCompanyContactEmail
	 */
	public void setEdbcCompanyContactEmail(String edbcCompanyContactEmail) {
		this.edbcCompanyContactEmail = edbcCompanyContactEmail;
		addValidField("edbcCompanyContactEmail");
	}

	/**
	 * Get edbcCompanyContactTelephone
	 */
	@Column(name = "EDBC_COMPANY_CONTACT_TELEPHONE")
	public String getEdbcCompanyContactTelephone() {
		return edbcCompanyContactTelephone;
	}

	/**
	 * Set edbcCompanyContactTelephone
	 */
	public void setEdbcCompanyContactTelephone(String edbcCompanyContactTelephone) {
		this.edbcCompanyContactTelephone = edbcCompanyContactTelephone;
		addValidField("edbcCompanyContactTelephone");
	}

	/**
	 * Get edbcCompanyContactPerson
	 */
	@Column(name = "EDBC_COMPANY_CONTACT_PERSON")
	public String getEdbcCompanyContactPerson() {
		return edbcCompanyContactPerson;
	}

	/**
	 * Set edbcCompanyContactPerson
	 */
	public void setEdbcCompanyContactPerson(String edbcCompanyContactPerson) {
		this.edbcCompanyContactPerson = edbcCompanyContactPerson;
		addValidField("edbcCompanyContactPerson");
	}

	/**
	 * Get edbcCompanyContactSig
	 */
	@Column(name = "EDBC_COMPANY_CONTACT_SIG")
	public String getEdbcCompanyContactSig() {
		return edbcCompanyContactSig;
	}

	/**
	 * Set edbcCompanyContactSig
	 */
	public void setEdbcCompanyContactSig(String edbcCompanyContactSig) {
		this.edbcCompanyContactSig = edbcCompanyContactSig;
		addValidField("edbcCompanyContactSig");
	}

}
