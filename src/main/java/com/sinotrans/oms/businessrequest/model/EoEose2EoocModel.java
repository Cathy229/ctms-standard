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
 * Model class for EoEose2Eooc
 */
@Entity
@Table(name = "EO_EOSE_2_EOOC")
public class EoEose2EoocModel extends BaseModel implements OperationLog {

	//eoesId
	private Long eoesId;
	//eoesEoseId
	private Long eoesEoseId;
	//eoesBatchNo
	private String eoesBatchNo;
	//eoesCntCustomized
	private String eoesCntCustomized;
	//eoesCntCustomizedSize
	private String eoesCntCustomizedSize;
	//eoesContainerNo
	private String eoesContainerNo;
	//eoesFclLcl
	private String eoesFclLcl;
	//eoesIsEmpty
	private String eoesIsEmpty;
	//eoesIsSoc
	private String eoesIsSoc;
	//eoesEbmaNameCn
	private String eoesEbmaNameCn;
	//eoesEbmaNameEn
	private String eoesEbmaNameEn;
	//eoesPakgsCode
	private String eoesPakgsCode;
	//eoesCtnPackageNumber
	private Integer eoesCtnPackageNumber;
	//eoesGrossWeight
	private Double eoesGrossWeight;
	//eoesCargoNetWeight
	private Double eoesCargoNetWeight;
	//eoesTareWeight
	private Double eoesTareWeight;
	//eoesCargoMeasurement
	private Double eoesCargoMeasurement;
	//eoesLoadDate
	private Date eoesLoadDate;
	//eoesSealNo1
	private String eoesSealNo1;
	//eoesSealNo2
	private String eoesSealNo2;
	//eoesSealNo3
	private String eoesSealNo3;
	//eoesSealType1
	private String eoesSealType1;
	//eoesSealType2
	private String eoesSealType2;
	//eoesSealType3
	private String eoesSealType3;
	//eoesSealAgencyCode1
	private String eoesSealAgencyCode1;
	//eoesSealAgencyCode2
	private String eoesSealAgencyCode2;
	//eoesSealAgencyCode3
	private String eoesSealAgencyCode3;
	//eoesSealAgencyName1
	private String eoesSealAgencyName1;
	//eoesSealAgencyName2
	private String eoesSealAgencyName2;
	//eoesSealAgencyName3
	private String eoesSealAgencyName3;
	//eoesOverLengthFront
	private Double eoesOverLengthFront;
	//eoesOverLengthBack
	private Double eoesOverLengthBack;
	//eoesOverWidthLeft
	private Double eoesOverWidthLeft;
	//eoesOverWidthRight
	private Double eoesOverWidthRight;
	//eoesOverHeight
	private Double eoesOverHeight;
	//eoesStowageLocation
	private String eoesStowageLocation;
	//eoesSpecialDetail
	private String eoesSpecialDetail;
	//eoesCtnOperatorId
	private Long eoesCtnOperatorId;
	//eoesCtnOperatorCode
	private String eoesCtnOperatorCode;
	//eoesCtnOperatorName
	private String eoesCtnOperatorName;
	//eoesCntSupplierType
	private Integer eoesCntSupplierType;
	//eoesRemark
	private String eoesRemark;
	//eoesSubstr1
	private String eoesSubstr1;
	//eoesSubstr2
	private String eoesSubstr2;
	//eoesSubstr3
	private String eoesSubstr3;
	//eoesSubstr4
	private String eoesSubstr4;
	//eoesSubstr5
	private String eoesSubstr5;
	//eoesSubstr6
	private String eoesSubstr6;
	//eoesSubstr7
	private String eoesSubstr7;
	//eoesSubstr8
	private String eoesSubstr8;
	//eoesSubdate1
	private Date eoesSubdate1;
	//eoesSubdate2
	private Date eoesSubdate2;
	//eoesSubdate3
	private Date eoesSubdate3;
	//eoesSubdate4
	private Date eoesSubdate4;
	//eoesSubnum1
	private Long eoesSubnum1;
	//eoesSubnum2
	private Long eoesSubnum2;
	//eoesSubnum3
	private Long eoesSubnum3;
	//eoesSubnum4
	private Long eoesSubnum4;
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
	//eoesEdfaId
	private Long eoesEdfaId;
	//eoesEoocId
	private Long eoesEoocId;

	/**
	 * Get eoesId
	 */
	@Column(name = "EOES_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoesId() {
		return eoesId;
	}

	/**
	 * Set eoesId
	 */
	public void setEoesId(Long eoesId) {
		this.eoesId = eoesId;
		addValidField("eoesId");
	}

	/**
	 * Get eoesEoseId
	 */
	@Column(name = "EOES_EOSE_ID")
	public Long getEoesEoseId() {
		return eoesEoseId;
	}

	/**
	 * Set eoesEoseId
	 */
	public void setEoesEoseId(Long eoesEoseId) {
		this.eoesEoseId = eoesEoseId;
		addValidField("eoesEoseId");
	}

	/**
	 * Get eoesBatchNo
	 */
	@Column(name = "EOES_BATCH_NO")
	public String getEoesBatchNo() {
		return eoesBatchNo;
	}

	/**
	 * Set eoesBatchNo
	 */
	public void setEoesBatchNo(String eoesBatchNo) {
		this.eoesBatchNo = eoesBatchNo;
		addValidField("eoesBatchNo");
	}

	/**
	 * Get eoesCntCustomized
	 */
	@Column(name = "EOES_CNT_CUSTOMIZED")
	public String getEoesCntCustomized() {
		return eoesCntCustomized;
	}

	/**
	 * Set eoesCntCustomized
	 */
	public void setEoesCntCustomized(String eoesCntCustomized) {
		this.eoesCntCustomized = eoesCntCustomized;
		addValidField("eoesCntCustomized");
	}

	/**
	 * Get eoesCntCustomizedSize
	 */
	@Column(name = "EOES_CNT_CUSTOMIZED_SIZE")
	public String getEoesCntCustomizedSize() {
		return eoesCntCustomizedSize;
	}

	/**
	 * Set eoesCntCustomizedSize
	 */
	public void setEoesCntCustomizedSize(String eoesCntCustomizedSize) {
		this.eoesCntCustomizedSize = eoesCntCustomizedSize;
		addValidField("eoesCntCustomizedSize");
	}

	/**
	 * Get eoesContainerNo
	 */
	@Column(name = "EOES_CONTAINER_NO")
	public String getEoesContainerNo() {
		return eoesContainerNo;
	}

	/**
	 * Set eoesContainerNo
	 */
	public void setEoesContainerNo(String eoesContainerNo) {
		this.eoesContainerNo = eoesContainerNo;
		addValidField("eoesContainerNo");
	}

	/**
	 * Get eoesFclLcl
	 */
	@Column(name = "EOES_FCL_LCL")
	public String getEoesFclLcl() {
		return eoesFclLcl;
	}

	/**
	 * Set eoesFclLcl
	 */
	public void setEoesFclLcl(String eoesFclLcl) {
		this.eoesFclLcl = eoesFclLcl;
		addValidField("eoesFclLcl");
	}

	/**
	 * Get eoesIsEmpty
	 */
	@Column(name = "EOES_IS_EMPTY")
	public String getEoesIsEmpty() {
		return eoesIsEmpty;
	}

	/**
	 * Set eoesIsEmpty
	 */
	public void setEoesIsEmpty(String eoesIsEmpty) {
		this.eoesIsEmpty = eoesIsEmpty;
		addValidField("eoesIsEmpty");
	}

	/**
	 * Get eoesIsSoc
	 */
	@Column(name = "EOES_IS_SOC")
	public String getEoesIsSoc() {
		return eoesIsSoc;
	}

	/**
	 * Set eoesIsSoc
	 */
	public void setEoesIsSoc(String eoesIsSoc) {
		this.eoesIsSoc = eoesIsSoc;
		addValidField("eoesIsSoc");
	}

	/**
	 * Get eoesEbmaNameCn
	 */
	@Column(name = "EOES_EBMA_NAME_CN")
	public String getEoesEbmaNameCn() {
		return eoesEbmaNameCn;
	}

	/**
	 * Set eoesEbmaNameCn
	 */
	public void setEoesEbmaNameCn(String eoesEbmaNameCn) {
		this.eoesEbmaNameCn = eoesEbmaNameCn;
		addValidField("eoesEbmaNameCn");
	}

	/**
	 * Get eoesEbmaNameEn
	 */
	@Column(name = "EOES_EBMA_NAME_EN")
	public String getEoesEbmaNameEn() {
		return eoesEbmaNameEn;
	}

	/**
	 * Set eoesEbmaNameEn
	 */
	public void setEoesEbmaNameEn(String eoesEbmaNameEn) {
		this.eoesEbmaNameEn = eoesEbmaNameEn;
		addValidField("eoesEbmaNameEn");
	}

	/**
	 * Get eoesPakgsCode
	 */
	@Column(name = "EOES_PAKGS_CODE")
	public String getEoesPakgsCode() {
		return eoesPakgsCode;
	}

	/**
	 * Set eoesPakgsCode
	 */
	public void setEoesPakgsCode(String eoesPakgsCode) {
		this.eoesPakgsCode = eoesPakgsCode;
		addValidField("eoesPakgsCode");
	}

	/**
	 * Get eoesCtnPackageNumber
	 */
	@Column(name = "EOES_CTN_PACKAGE_NUMBER")
	public Integer getEoesCtnPackageNumber() {
		return eoesCtnPackageNumber;
	}

	/**
	 * Set eoesCtnPackageNumber
	 */
	public void setEoesCtnPackageNumber(Integer eoesCtnPackageNumber) {
		this.eoesCtnPackageNumber = eoesCtnPackageNumber;
		addValidField("eoesCtnPackageNumber");
	}

	/**
	 * Get eoesGrossWeight
	 */
	@Column(name = "EOES_GROSS_WEIGHT")
	public Double getEoesGrossWeight() {
		return eoesGrossWeight;
	}

	/**
	 * Set eoesGrossWeight
	 */
	public void setEoesGrossWeight(Double eoesGrossWeight) {
		this.eoesGrossWeight = eoesGrossWeight;
		addValidField("eoesGrossWeight");
	}

	/**
	 * Get eoesCargoNetWeight
	 */
	@Column(name = "EOES_CARGO_NET_WEIGHT")
	public Double getEoesCargoNetWeight() {
		return eoesCargoNetWeight;
	}

	/**
	 * Set eoesCargoNetWeight
	 */
	public void setEoesCargoNetWeight(Double eoesCargoNetWeight) {
		this.eoesCargoNetWeight = eoesCargoNetWeight;
		addValidField("eoesCargoNetWeight");
	}

	/**
	 * Get eoesTareWeight
	 */
	@Column(name = "EOES_TARE_WEIGHT")
	public Double getEoesTareWeight() {
		return eoesTareWeight;
	}

	/**
	 * Set eoesTareWeight
	 */
	public void setEoesTareWeight(Double eoesTareWeight) {
		this.eoesTareWeight = eoesTareWeight;
		addValidField("eoesTareWeight");
	}

	/**
	 * Get eoesCargoMeasurement
	 */
	@Column(name = "EOES_CARGO_MEASUREMENT")
	public Double getEoesCargoMeasurement() {
		return eoesCargoMeasurement;
	}

	/**
	 * Set eoesCargoMeasurement
	 */
	public void setEoesCargoMeasurement(Double eoesCargoMeasurement) {
		this.eoesCargoMeasurement = eoesCargoMeasurement;
		addValidField("eoesCargoMeasurement");
	}

	/**
	 * Get eoesLoadDate
	 */
	@Column(name = "EOES_LOAD_DATE")
	public Date getEoesLoadDate() {
		return eoesLoadDate;
	}

	/**
	 * Set eoesLoadDate
	 */
	public void setEoesLoadDate(Date eoesLoadDate) {
		this.eoesLoadDate = eoesLoadDate;
		addValidField("eoesLoadDate");
	}

	/**
	 * Get eoesSealNo1
	 */
	@Column(name = "EOES_SEAL_NO_1")
	public String getEoesSealNo1() {
		return eoesSealNo1;
	}

	/**
	 * Set eoesSealNo1
	 */
	public void setEoesSealNo1(String eoesSealNo1) {
		this.eoesSealNo1 = eoesSealNo1;
		addValidField("eoesSealNo1");
	}

	/**
	 * Get eoesSealNo2
	 */
	@Column(name = "EOES_SEAL_NO_2")
	public String getEoesSealNo2() {
		return eoesSealNo2;
	}

	/**
	 * Set eoesSealNo2
	 */
	public void setEoesSealNo2(String eoesSealNo2) {
		this.eoesSealNo2 = eoesSealNo2;
		addValidField("eoesSealNo2");
	}

	/**
	 * Get eoesSealNo3
	 */
	@Column(name = "EOES_SEAL_NO_3")
	public String getEoesSealNo3() {
		return eoesSealNo3;
	}

	/**
	 * Set eoesSealNo3
	 */
	public void setEoesSealNo3(String eoesSealNo3) {
		this.eoesSealNo3 = eoesSealNo3;
		addValidField("eoesSealNo3");
	}

	/**
	 * Get eoesSealType1
	 */
	@Column(name = "EOES_SEAL_TYPE_1")
	public String getEoesSealType1() {
		return eoesSealType1;
	}

	/**
	 * Set eoesSealType1
	 */
	public void setEoesSealType1(String eoesSealType1) {
		this.eoesSealType1 = eoesSealType1;
		addValidField("eoesSealType1");
	}

	/**
	 * Get eoesSealType2
	 */
	@Column(name = "EOES_SEAL_TYPE_2")
	public String getEoesSealType2() {
		return eoesSealType2;
	}

	/**
	 * Set eoesSealType2
	 */
	public void setEoesSealType2(String eoesSealType2) {
		this.eoesSealType2 = eoesSealType2;
		addValidField("eoesSealType2");
	}

	/**
	 * Get eoesSealType3
	 */
	@Column(name = "EOES_SEAL_TYPE_3")
	public String getEoesSealType3() {
		return eoesSealType3;
	}

	/**
	 * Set eoesSealType3
	 */
	public void setEoesSealType3(String eoesSealType3) {
		this.eoesSealType3 = eoesSealType3;
		addValidField("eoesSealType3");
	}

	/**
	 * Get eoesSealAgencyCode1
	 */
	@Column(name = "EOES_SEAL_AGENCY_CODE_1")
	public String getEoesSealAgencyCode1() {
		return eoesSealAgencyCode1;
	}

	/**
	 * Set eoesSealAgencyCode1
	 */
	public void setEoesSealAgencyCode1(String eoesSealAgencyCode1) {
		this.eoesSealAgencyCode1 = eoesSealAgencyCode1;
		addValidField("eoesSealAgencyCode1");
	}

	/**
	 * Get eoesSealAgencyCode2
	 */
	@Column(name = "EOES_SEAL_AGENCY_CODE_2")
	public String getEoesSealAgencyCode2() {
		return eoesSealAgencyCode2;
	}

	/**
	 * Set eoesSealAgencyCode2
	 */
	public void setEoesSealAgencyCode2(String eoesSealAgencyCode2) {
		this.eoesSealAgencyCode2 = eoesSealAgencyCode2;
		addValidField("eoesSealAgencyCode2");
	}

	/**
	 * Get eoesSealAgencyCode3
	 */
	@Column(name = "EOES_SEAL_AGENCY_CODE_3")
	public String getEoesSealAgencyCode3() {
		return eoesSealAgencyCode3;
	}

	/**
	 * Set eoesSealAgencyCode3
	 */
	public void setEoesSealAgencyCode3(String eoesSealAgencyCode3) {
		this.eoesSealAgencyCode3 = eoesSealAgencyCode3;
		addValidField("eoesSealAgencyCode3");
	}

	/**
	 * Get eoesSealAgencyName1
	 */
	@Column(name = "EOES_SEAL_AGENCY_NAME_1")
	public String getEoesSealAgencyName1() {
		return eoesSealAgencyName1;
	}

	/**
	 * Set eoesSealAgencyName1
	 */
	public void setEoesSealAgencyName1(String eoesSealAgencyName1) {
		this.eoesSealAgencyName1 = eoesSealAgencyName1;
		addValidField("eoesSealAgencyName1");
	}

	/**
	 * Get eoesSealAgencyName2
	 */
	@Column(name = "EOES_SEAL_AGENCY_NAME_2")
	public String getEoesSealAgencyName2() {
		return eoesSealAgencyName2;
	}

	/**
	 * Set eoesSealAgencyName2
	 */
	public void setEoesSealAgencyName2(String eoesSealAgencyName2) {
		this.eoesSealAgencyName2 = eoesSealAgencyName2;
		addValidField("eoesSealAgencyName2");
	}

	/**
	 * Get eoesSealAgencyName3
	 */
	@Column(name = "EOES_SEAL_AGENCY_NAME_3")
	public String getEoesSealAgencyName3() {
		return eoesSealAgencyName3;
	}

	/**
	 * Set eoesSealAgencyName3
	 */
	public void setEoesSealAgencyName3(String eoesSealAgencyName3) {
		this.eoesSealAgencyName3 = eoesSealAgencyName3;
		addValidField("eoesSealAgencyName3");
	}

	/**
	 * Get eoesOverLengthFront
	 */
	@Column(name = "EOES_OVER_LENGTH_FRONT")
	public Double getEoesOverLengthFront() {
		return eoesOverLengthFront;
	}

	/**
	 * Set eoesOverLengthFront
	 */
	public void setEoesOverLengthFront(Double eoesOverLengthFront) {
		this.eoesOverLengthFront = eoesOverLengthFront;
		addValidField("eoesOverLengthFront");
	}

	/**
	 * Get eoesOverLengthBack
	 */
	@Column(name = "EOES_OVER_LENGTH_BACK")
	public Double getEoesOverLengthBack() {
		return eoesOverLengthBack;
	}

	/**
	 * Set eoesOverLengthBack
	 */
	public void setEoesOverLengthBack(Double eoesOverLengthBack) {
		this.eoesOverLengthBack = eoesOverLengthBack;
		addValidField("eoesOverLengthBack");
	}

	/**
	 * Get eoesOverWidthLeft
	 */
	@Column(name = "EOES_OVER_WIDTH_LEFT")
	public Double getEoesOverWidthLeft() {
		return eoesOverWidthLeft;
	}

	/**
	 * Set eoesOverWidthLeft
	 */
	public void setEoesOverWidthLeft(Double eoesOverWidthLeft) {
		this.eoesOverWidthLeft = eoesOverWidthLeft;
		addValidField("eoesOverWidthLeft");
	}

	/**
	 * Get eoesOverWidthRight
	 */
	@Column(name = "EOES_OVER_WIDTH_RIGHT")
	public Double getEoesOverWidthRight() {
		return eoesOverWidthRight;
	}

	/**
	 * Set eoesOverWidthRight
	 */
	public void setEoesOverWidthRight(Double eoesOverWidthRight) {
		this.eoesOverWidthRight = eoesOverWidthRight;
		addValidField("eoesOverWidthRight");
	}

	/**
	 * Get eoesOverHeight
	 */
	@Column(name = "EOES_OVER_HEIGHT")
	public Double getEoesOverHeight() {
		return eoesOverHeight;
	}

	/**
	 * Set eoesOverHeight
	 */
	public void setEoesOverHeight(Double eoesOverHeight) {
		this.eoesOverHeight = eoesOverHeight;
		addValidField("eoesOverHeight");
	}

	/**
	 * Get eoesStowageLocation
	 */
	@Column(name = "EOES_STOWAGE_LOCATION")
	public String getEoesStowageLocation() {
		return eoesStowageLocation;
	}

	/**
	 * Set eoesStowageLocation
	 */
	public void setEoesStowageLocation(String eoesStowageLocation) {
		this.eoesStowageLocation = eoesStowageLocation;
		addValidField("eoesStowageLocation");
	}

	/**
	 * Get eoesSpecialDetail
	 */
	@Column(name = "EOES_SPECIAL_DETAIL")
	public String getEoesSpecialDetail() {
		return eoesSpecialDetail;
	}

	/**
	 * Set eoesSpecialDetail
	 */
	public void setEoesSpecialDetail(String eoesSpecialDetail) {
		this.eoesSpecialDetail = eoesSpecialDetail;
		addValidField("eoesSpecialDetail");
	}

	/**
	 * Get eoesCtnOperatorId
	 */
	@Column(name = "EOES_CTN_OPERATOR_ID")
	public Long getEoesCtnOperatorId() {
		return eoesCtnOperatorId;
	}

	/**
	 * Set eoesCtnOperatorId
	 */
	public void setEoesCtnOperatorId(Long eoesCtnOperatorId) {
		this.eoesCtnOperatorId = eoesCtnOperatorId;
		addValidField("eoesCtnOperatorId");
	}

	/**
	 * Get eoesCtnOperatorCode
	 */
	@Column(name = "EOES_CTN_OPERATOR_CODE")
	public String getEoesCtnOperatorCode() {
		return eoesCtnOperatorCode;
	}

	/**
	 * Set eoesCtnOperatorCode
	 */
	public void setEoesCtnOperatorCode(String eoesCtnOperatorCode) {
		this.eoesCtnOperatorCode = eoesCtnOperatorCode;
		addValidField("eoesCtnOperatorCode");
	}

	/**
	 * Get eoesCtnOperatorName
	 */
	@Column(name = "EOES_CTN_OPERATOR_NAME")
	public String getEoesCtnOperatorName() {
		return eoesCtnOperatorName;
	}

	/**
	 * Set eoesCtnOperatorName
	 */
	public void setEoesCtnOperatorName(String eoesCtnOperatorName) {
		this.eoesCtnOperatorName = eoesCtnOperatorName;
		addValidField("eoesCtnOperatorName");
	}

	/**
	 * Get eoesCntSupplierType
	 */
	@Column(name = "EOES_CNT_SUPPLIER_TYPE")
	public Integer getEoesCntSupplierType() {
		return eoesCntSupplierType;
	}

	/**
	 * Set eoesCntSupplierType
	 */
	public void setEoesCntSupplierType(Integer eoesCntSupplierType) {
		this.eoesCntSupplierType = eoesCntSupplierType;
		addValidField("eoesCntSupplierType");
	}

	/**
	 * Get eoesRemark
	 */
	@Column(name = "EOES_REMARK")
	public String getEoesRemark() {
		return eoesRemark;
	}

	/**
	 * Set eoesRemark
	 */
	public void setEoesRemark(String eoesRemark) {
		this.eoesRemark = eoesRemark;
		addValidField("eoesRemark");
	}

	/**
	 * Get eoesSubstr1
	 */
	@Column(name = "EOES_SUBSTR1")
	public String getEoesSubstr1() {
		return eoesSubstr1;
	}

	/**
	 * Set eoesSubstr1
	 */
	public void setEoesSubstr1(String eoesSubstr1) {
		this.eoesSubstr1 = eoesSubstr1;
		addValidField("eoesSubstr1");
	}

	/**
	 * Get eoesSubstr2
	 */
	@Column(name = "EOES_SUBSTR2")
	public String getEoesSubstr2() {
		return eoesSubstr2;
	}

	/**
	 * Set eoesSubstr2
	 */
	public void setEoesSubstr2(String eoesSubstr2) {
		this.eoesSubstr2 = eoesSubstr2;
		addValidField("eoesSubstr2");
	}

	/**
	 * Get eoesSubstr3
	 */
	@Column(name = "EOES_SUBSTR3")
	public String getEoesSubstr3() {
		return eoesSubstr3;
	}

	/**
	 * Set eoesSubstr3
	 */
	public void setEoesSubstr3(String eoesSubstr3) {
		this.eoesSubstr3 = eoesSubstr3;
		addValidField("eoesSubstr3");
	}

	/**
	 * Get eoesSubstr4
	 */
	@Column(name = "EOES_SUBSTR4")
	public String getEoesSubstr4() {
		return eoesSubstr4;
	}

	/**
	 * Set eoesSubstr4
	 */
	public void setEoesSubstr4(String eoesSubstr4) {
		this.eoesSubstr4 = eoesSubstr4;
		addValidField("eoesSubstr4");
	}

	/**
	 * Get eoesSubstr5
	 */
	@Column(name = "EOES_SUBSTR5")
	public String getEoesSubstr5() {
		return eoesSubstr5;
	}

	/**
	 * Set eoesSubstr5
	 */
	public void setEoesSubstr5(String eoesSubstr5) {
		this.eoesSubstr5 = eoesSubstr5;
		addValidField("eoesSubstr5");
	}

	/**
	 * Get eoesSubstr6
	 */
	@Column(name = "EOES_SUBSTR6")
	public String getEoesSubstr6() {
		return eoesSubstr6;
	}

	/**
	 * Set eoesSubstr6
	 */
	public void setEoesSubstr6(String eoesSubstr6) {
		this.eoesSubstr6 = eoesSubstr6;
		addValidField("eoesSubstr6");
	}

	/**
	 * Get eoesSubstr7
	 */
	@Column(name = "EOES_SUBSTR7")
	public String getEoesSubstr7() {
		return eoesSubstr7;
	}

	/**
	 * Set eoesSubstr7
	 */
	public void setEoesSubstr7(String eoesSubstr7) {
		this.eoesSubstr7 = eoesSubstr7;
		addValidField("eoesSubstr7");
	}

	/**
	 * Get eoesSubstr8
	 */
	@Column(name = "EOES_SUBSTR8")
	public String getEoesSubstr8() {
		return eoesSubstr8;
	}

	/**
	 * Set eoesSubstr8
	 */
	public void setEoesSubstr8(String eoesSubstr8) {
		this.eoesSubstr8 = eoesSubstr8;
		addValidField("eoesSubstr8");
	}

	/**
	 * Get eoesSubdate1
	 */
	@Column(name = "EOES_SUBDATE1")
	public Date getEoesSubdate1() {
		return eoesSubdate1;
	}

	/**
	 * Set eoesSubdate1
	 */
	public void setEoesSubdate1(Date eoesSubdate1) {
		this.eoesSubdate1 = eoesSubdate1;
		addValidField("eoesSubdate1");
	}

	/**
	 * Get eoesSubdate2
	 */
	@Column(name = "EOES_SUBDATE2")
	public Date getEoesSubdate2() {
		return eoesSubdate2;
	}

	/**
	 * Set eoesSubdate2
	 */
	public void setEoesSubdate2(Date eoesSubdate2) {
		this.eoesSubdate2 = eoesSubdate2;
		addValidField("eoesSubdate2");
	}

	/**
	 * Get eoesSubdate3
	 */
	@Column(name = "EOES_SUBDATE3")
	public Date getEoesSubdate3() {
		return eoesSubdate3;
	}

	/**
	 * Set eoesSubdate3
	 */
	public void setEoesSubdate3(Date eoesSubdate3) {
		this.eoesSubdate3 = eoesSubdate3;
		addValidField("eoesSubdate3");
	}

	/**
	 * Get eoesSubdate4
	 */
	@Column(name = "EOES_SUBDATE4")
	public Date getEoesSubdate4() {
		return eoesSubdate4;
	}

	/**
	 * Set eoesSubdate4
	 */
	public void setEoesSubdate4(Date eoesSubdate4) {
		this.eoesSubdate4 = eoesSubdate4;
		addValidField("eoesSubdate4");
	}

	/**
	 * Get eoesSubnum1
	 */
	@Column(name = "EOES_SUBNUM1")
	public Long getEoesSubnum1() {
		return eoesSubnum1;
	}

	/**
	 * Set eoesSubnum1
	 */
	public void setEoesSubnum1(Long eoesSubnum1) {
		this.eoesSubnum1 = eoesSubnum1;
		addValidField("eoesSubnum1");
	}

	/**
	 * Get eoesSubnum2
	 */
	@Column(name = "EOES_SUBNUM2")
	public Long getEoesSubnum2() {
		return eoesSubnum2;
	}

	/**
	 * Set eoesSubnum2
	 */
	public void setEoesSubnum2(Long eoesSubnum2) {
		this.eoesSubnum2 = eoesSubnum2;
		addValidField("eoesSubnum2");
	}

	/**
	 * Get eoesSubnum3
	 */
	@Column(name = "EOES_SUBNUM3")
	public Long getEoesSubnum3() {
		return eoesSubnum3;
	}

	/**
	 * Set eoesSubnum3
	 */
	public void setEoesSubnum3(Long eoesSubnum3) {
		this.eoesSubnum3 = eoesSubnum3;
		addValidField("eoesSubnum3");
	}

	/**
	 * Get eoesSubnum4
	 */
	@Column(name = "EOES_SUBNUM4")
	public Long getEoesSubnum4() {
		return eoesSubnum4;
	}

	/**
	 * Set eoesSubnum4
	 */
	public void setEoesSubnum4(Long eoesSubnum4) {
		this.eoesSubnum4 = eoesSubnum4;
		addValidField("eoesSubnum4");
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
	 * Get eoesEdfaId
	 */
	@Column(name = "EOES_EDFA_ID")
	public Long getEoesEdfaId() {
		return eoesEdfaId;
	}

	/**
	 * Set eoesEdfaId
	 */
	public void setEoesEdfaId(Long eoesEdfaId) {
		this.eoesEdfaId = eoesEdfaId;
		addValidField("eoesEdfaId");
	}

	/**
	 * Get eoesEoocId
	 */
	@Column(name = "EOES_EOOC_ID")
	public Long getEoesEoocId() {
		return eoesEoocId;
	}

	/**
	 * Set eoesEoocId
	 */
	public void setEoesEoocId(Long eoesEoocId) {
		this.eoesEoocId = eoesEoocId;
		addValidField("eoesEoocId");
	}

}
