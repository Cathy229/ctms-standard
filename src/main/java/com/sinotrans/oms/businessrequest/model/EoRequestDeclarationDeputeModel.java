package com.sinotrans.oms.businessrequest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;
import javax.persistence.SequenceGenerator;
import com.sinotrans.framework.orm.model.BaseModel;
import com.sinotrans.framework.orm.model.OperationLog;

/**
 * Model class for EoRequestDeclarationDepute
 */
@Entity
@Table(name = "EO_REQUEST_DECLARATION_DEPUTE")
public class EoRequestDeclarationDeputeModel extends BaseModel implements OperationLog {

	//eoddId
	private Long eoddId;
	//eoddEscoId
	private Long eoddEscoId;
	//eoddEbpjId
	private Long eoddEbpjId;
	//eoddLoEbppId
	private Long eoddLoEbppId;
	//eoddEbtkId
	private Long eoddEbtkId;
	//eoddIsAutomatic
	private String eoddIsAutomatic;
	//eoddTaskStatus
	private String eoddTaskStatus;
	//eoddTaskFeedback
	private String eoddTaskFeedback;
	//eoddSysCode
	private String eoddSysCode;
	//eoddEbbuId
	private Long eoddEbbuId;
	//eoddEbbuNameCn
	private String eoddEbbuNameCn;
	//eoddEbbuCode
	private String eoddEbbuCode;
	//eoddEbbuDist1
	private String eoddEbbuDist1;
	//eoddEbbuDist2
	private String eoddEbbuDist2;
	//eoddEbbuDist3
	private String eoddEbbuDist3;
	//eoddEbbuDist4
	private String eoddEbbuDist4;
	//eoddEbbuDist5
	private String eoddEbbuDist5;
	//eoddToId
	private String eoddToId;
	//eoddEoorId
	private Long eoddEoorId;
	//eoddNo
	private String eoddNo;
	//eoddType
	private String eoddType;
	//eoddStatus
	private String eoddStatus;
	//eoddOrder
	private Long eoddOrder;
	//eoddSoNo
	private String eoddSoNo;
	//eoddDoNo
	private String eoddDoNo;
	//eoddConsignorEbcuId
	private Long eoddConsignorEbcuId;
	//eoddConsignorEbcuCode
	private String eoddConsignorEbcuCode;
	//eoddConsignorEbcuName
	private String eoddConsignorEbcuName;
	//eoddOwnerEbcuId
	private Long eoddOwnerEbcuId;
	//eoddOwnerEbcuCode
	private String eoddOwnerEbcuCode;
	//eoddOwnerEbcuName
	private String eoddOwnerEbcuName;
	//eoddShipperConsignNo
	private String eoddShipperConsignNo;
	//eoddIeFlag
	private String eoddIeFlag;
	//eoddPortCode
	private String eoddPortCode;
	//eoddIeDate
	private Date eoddIeDate;
	//eoddTradeTerms
	private String eoddTradeTerms;
	//eoddTransactionMode
	private String eoddTransactionMode;
	//eoddTransportType
	private String eoddTransportType;
	//eoddTransportName
	private String eoddTransportName;
	//eoddLoadPortId
	private Long eoddLoadPortId;
	//eoddLoadPortCode
	private String eoddLoadPortCode;
	//eoddLoadPortName
	private String eoddLoadPortName;
	//eoddFinalDestinationId
	private Long eoddFinalDestinationId;
	//eoddFinalDestinationCode
	private String eoddFinalDestinationCode;
	//eoddFinalDestinationName
	private String eoddFinalDestinationName;
	//eoddBlNo
	private String eoddBlNo;
	//eoddCargoName
	private String eoddCargoName;
	//eoddDeclarationType
	private String eoddDeclarationType;
	//eoddCustomsBrokerId
	private Long eoddCustomsBrokerId;
	//eoddCustomsBrokerCode
	private String eoddCustomsBrokerCode;
	//eoddCustomsBroker
	private String eoddCustomsBroker;
	//eoddCustomsBrokerContact
	private String eoddCustomsBrokerContact;
	//eoddCustomsBrokerTel
	private String eoddCustomsBrokerTel;
	//eoddDocumentCollectDate
	private Date eoddDocumentCollectDate;
	//eoddDocumentRecoveryDate
	private Date eoddDocumentRecoveryDate;
	//eoddReceiptReturnDate
	private Date eoddReceiptReturnDate;
	//eoddTaxDate
	private Date eoddTaxDate;
	//eoddSendSingleDate
	private Date eoddSendSingleDate;
	//eoddSigningDate
	private Date eoddSigningDate;
	//eoddDgdFinishDate
	private Date eoddDgdFinishDate;
	//eoddCustomsDeclarationNum
	private Long eoddCustomsDeclarationNum;
	//eoddCauseDelay
	private String eoddCauseDelay;
	//eoddGrossWeight
	private Double eoddGrossWeight;
	//eoddNetWeight
	private Double eoddNetWeight;
	//eoddQuantity
	private Long eoddQuantity;
	//eoddVolume
	private Long eoddVolume;
	//eoddRemark
	private String eoddRemark;
	//eoddSubstr1
	private String eoddSubstr1;
	//eoddSubstr2
	private String eoddSubstr2;
	//eoddSubstr3
	private String eoddSubstr3;
	//eoddSubstr4
	private String eoddSubstr4;
	//eoddSubstr5
	private String eoddSubstr5;
	//eoddSubstr6
	private String eoddSubstr6;
	//eoddSubstr7
	private String eoddSubstr7;
	//eoddSubstr8
	private String eoddSubstr8;
	//eoddSubstr9
	private String eoddSubstr9;
	//eoddSubstr10
	private String eoddSubstr10;
	//eoddSubstr11
	private String eoddSubstr11;
	//eoddSubstr12
	private String eoddSubstr12;
	//eoddSubstr13
	private String eoddSubstr13;
	//eoddSubstr14
	private String eoddSubstr14;
	//eoddSubstr15
	private String eoddSubstr15;
	//eoddSubstr16
	private String eoddSubstr16;
	//eoddSubstr17
	private String eoddSubstr17;
	//eoddSubstr18
	private String eoddSubstr18;
	//eoddSubstr19
	private String eoddSubstr19;
	//eoddSubstr20
	private String eoddSubstr20;
	//eoddSubstr21
	private String eoddSubstr21;
	//eoddSubstr22
	private String eoddSubstr22;
	//eoddSubstr23
	private String eoddSubstr23;
	//eoddSubstr24
	private String eoddSubstr24;
	//eoddSubstr25
	private String eoddSubstr25;
	//eoddSubdate1
	private Date eoddSubdate1;
	//eoddSubdate2
	private Date eoddSubdate2;
	//eoddSubdate3
	private Date eoddSubdate3;
	//eoddSubdate4
	private Date eoddSubdate4;
	//eoddSubdate5
	private Date eoddSubdate5;
	//eoddSubdate6
	private Date eoddSubdate6;
	//eoddSubdate7
	private Date eoddSubdate7;
	//eoddSubdate8
	private Date eoddSubdate8;
	//eoddSubdate9
	private Date eoddSubdate9;
	//eoddSubdate10
	private Date eoddSubdate10;
	//eoddSubnum1
	private Long eoddSubnum1;
	//eoddSubnum2
	private Long eoddSubnum2;
	//eoddSubnum3
	private Long eoddSubnum3;
	//eoddSubnum4
	private Long eoddSubnum4;
	//eoddSubnum5
	private Long eoddSubnum5;
	//eoddSubnum6
	private Long eoddSubnum6;
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
	//eoddExchangeType
	private String eoddExchangeType;
	//eoddTradeCountry
	private String eoddTradeCountry;
	//eoddTradeCountryName
	private String eoddTradeCountryName;
	//eoddArriveCode
	private String eoddArriveCode;
	//eoddArriveName
	private String eoddArriveName;
	//eoddContractNo
	private String eoddContractNo;
	//eoddDeclarationNo
	private String eoddDeclarationNo;
	//eoddSailingDate
	private Date eoddSailingDate;
	//eoddVessel
	private String eoddVessel;
	//eoddVoyage
	private String eoddVoyage;
	//eoddCountryOfDestination
	private String eoddCountryOfDestination;
	//eoddPreManifesState
	private String eoddPreManifesState;
	//eoddNoticeTaxDate
	private Date eoddNoticeTaxDate;
	//eoddInspectionDate
	private Date eoddInspectionDate;
	//eoddSingleDeliveryDate
	private Date eoddSingleDeliveryDate;
	//eoddFilingDate
	private Date eoddFilingDate;
	//eoddReleaseDate
	private Date eoddReleaseDate;
	//eoddRecordNumber
	private String eoddRecordNumber;
	//eoddBusinessUnitName
	private String eoddBusinessUnitName;
	//eoddBusinessUnitsCode
	private String eoddBusinessUnitsCode;
	//eoddShipperUnitName
	private String eoddShipperUnitName;
	//eoddShipperUnitCode
	private String eoddShipperUnitCode;
	//eoddEscoCode
	private String eoddEscoCode;
	//eoddEscoNameCn
	private String eoddEscoNameCn;
	//eoddEsdeDepartmentCode
	private String eoddEsdeDepartmentCode;
	//eoddEsdeDepartmentName
	private String eoddEsdeDepartmentName;
	//eoddEsusUserNameCn
	private String eoddEsusUserNameCn;
	//eoddRetoType
	private Long eoddRetoType;
	//eoddIsDutyfree
	private Long eoddIsDutyfree;
	//eoddDeclareCustom
	private String eoddDeclareCustom;
	//eoddLicenseNo
	private String eoddLicenseNo;
	//eoddCutMode
	private String eoddCutMode;
	//eoddApprNo
	private Long eoddApprNo;
	//eoddFee
	private Double eoddFee;
	//eoddInsurFee
	private Double eoddInsurFee;
	//eoddOtherFee
	private Double eoddOtherFee;
	//eoddAssBillNo
	private String eoddAssBillNo;
	//eoddAssEmsNo
	private String eoddAssEmsNo;
	//eoddEnterpriseNo
	private String eoddEnterpriseNo;
	//eoddWorkNo
	private String eoddWorkNo;
	//eoddMark
	private String eoddMark;
	//eoddContainerNo
	private String eoddContainerNo;
	//eoddFileNo
	private String eoddFileNo;
	//eoddPackageType
	private String eoddPackageType;
	//eoddBusinessUnitEbcuId
	private Long eoddBusinessUnitEbcuId;
	//eoddShipperUnitEbcuId
	private Long eoddShipperUnitEbcuId;
	//eodmEbmaNameEn
	private String eodmEbmaNameEn;
	//eoddTaskConfirm
	private Long eoddTaskConfirm;
	//eoddTaskConfirmUser
	private String eoddTaskConfirmUser;
	//eoddTaskConfirmDate
	private Date eoddTaskConfirmDate;
	//eoddApproveDate
	private Date eoddApproveDate;
	//eoddShippingArriveDate
	private Date eoddShippingArriveDate;
	//eoddShippingBillDate
	private Date eoddShippingBillDate;
	//eoddConcludeDate
	private Date eoddConcludeDate;
	//eoddCheckingstrDate
	private Date eoddCheckingstrDate;
	//eoddCheckingendDate
	private Date eoddCheckingendDate;
	//eoddTallyDate
	private Date eoddTallyDate;
	//eoddTaskRefuseUser
	private String eoddTaskRefuseUser;
	//eoddTaskRefuseDate
	private Date eoddTaskRefuseDate;
	//eoddFeeType
	private String eoddFeeType;
	//eoddFeeCurrencySystem
	private String eoddFeeCurrencySystem;
	//eoddInsurFeeType
	private String eoddInsurFeeType;
	//eoddInsurCurrencySystem
	private String eoddInsurCurrencySystem;
	//eoddOtherFeeType
	private String eoddOtherFeeType;
	//eoddOtherCurrencySystem
	private String eoddOtherCurrencySystem;
	//eoddDepartureProt
	private String eoddDepartureProt;
	//eoddOverseasConsigneeCode
	private String eoddOverseasConsigneeCode;
	//eoddOverseasConsigneeName
	private String eoddOverseasConsigneeName;
	//eoddMarkNo
	private String eoddMarkNo;
	//eoddRequiredTime
	private Date eoddRequiredTime;

	/**
	 * Get eoddId
	 */
	@Column(name = "EODD_ID")
	@SequenceGenerator(name="SEQ_EO_REQUEST_DECLARA_DEPUTE")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoddId() {
		return eoddId;
	}

	/**
	 * Set eoddId
	 */
	public void setEoddId(Long eoddId) {
		this.eoddId = eoddId;
		addValidField("eoddId");
	}

	/**
	 * Get eoddEscoId
	 */
	@Column(name = "EODD_ESCO_ID")
	public Long getEoddEscoId() {
		return eoddEscoId;
	}

	/**
	 * Set eoddEscoId
	 */
	public void setEoddEscoId(Long eoddEscoId) {
		this.eoddEscoId = eoddEscoId;
		addValidField("eoddEscoId");
	}

	/**
	 * Get eoddEbpjId
	 */
	@Column(name = "EODD_EBPJ_ID")
	public Long getEoddEbpjId() {
		return eoddEbpjId;
	}

	/**
	 * Set eoddEbpjId
	 */
	public void setEoddEbpjId(Long eoddEbpjId) {
		this.eoddEbpjId = eoddEbpjId;
		addValidField("eoddEbpjId");
	}

	/**
	 * Get eoddLoEbppId
	 */
	@Column(name = "EODD_LO_EBPP_ID")
	public Long getEoddLoEbppId() {
		return eoddLoEbppId;
	}

	/**
	 * Set eoddLoEbppId
	 */
	public void setEoddLoEbppId(Long eoddLoEbppId) {
		this.eoddLoEbppId = eoddLoEbppId;
		addValidField("eoddLoEbppId");
	}

	/**
	 * Get eoddEbtkId
	 */
	@Column(name = "EODD_EBTK_ID")
	public Long getEoddEbtkId() {
		return eoddEbtkId;
	}

	/**
	 * Set eoddEbtkId
	 */
	public void setEoddEbtkId(Long eoddEbtkId) {
		this.eoddEbtkId = eoddEbtkId;
		addValidField("eoddEbtkId");
	}

	/**
	 * Get eoddIsAutomatic
	 */
	@Column(name = "EODD_IS_AUTOMATIC")
	public String getEoddIsAutomatic() {
		return eoddIsAutomatic;
	}

	/**
	 * Set eoddIsAutomatic
	 */
	public void setEoddIsAutomatic(String eoddIsAutomatic) {
		this.eoddIsAutomatic = eoddIsAutomatic;
		addValidField("eoddIsAutomatic");
	}

	/**
	 * Get eoddTaskStatus
	 */
	@Column(name = "EODD_TASK_STATUS")
	public String getEoddTaskStatus() {
		return eoddTaskStatus;
	}

	/**
	 * Set eoddTaskStatus
	 */
	public void setEoddTaskStatus(String eoddTaskStatus) {
		this.eoddTaskStatus = eoddTaskStatus;
		addValidField("eoddTaskStatus");
	}

	/**
	 * Get eoddTaskFeedback
	 */
	@Column(name = "EODD_TASK_FEEDBACK")
	public String getEoddTaskFeedback() {
		return eoddTaskFeedback;
	}

	/**
	 * Set eoddTaskFeedback
	 */
	public void setEoddTaskFeedback(String eoddTaskFeedback) {
		this.eoddTaskFeedback = eoddTaskFeedback;
		addValidField("eoddTaskFeedback");
	}

	/**
	 * Get eoddSysCode
	 */
	@Column(name = "EODD_SYS_CODE")
	public String getEoddSysCode() {
		return eoddSysCode;
	}

	/**
	 * Set eoddSysCode
	 */
	public void setEoddSysCode(String eoddSysCode) {
		this.eoddSysCode = eoddSysCode;
		addValidField("eoddSysCode");
	}

	/**
	 * Get eoddEbbuId
	 */
	@Column(name = "EODD_EBBU_ID")
	public Long getEoddEbbuId() {
		return eoddEbbuId;
	}

	/**
	 * Set eoddEbbuId
	 */
	public void setEoddEbbuId(Long eoddEbbuId) {
		this.eoddEbbuId = eoddEbbuId;
		addValidField("eoddEbbuId");
	}

	/**
	 * Get eoddEbbuNameCn
	 */
	@Column(name = "EODD_EBBU_NAME_CN")
	public String getEoddEbbuNameCn() {
		return eoddEbbuNameCn;
	}

	/**
	 * Set eoddEbbuNameCn
	 */
	public void setEoddEbbuNameCn(String eoddEbbuNameCn) {
		this.eoddEbbuNameCn = eoddEbbuNameCn;
		addValidField("eoddEbbuNameCn");
	}

	/**
	 * Get eoddEbbuCode
	 */
	@Column(name = "EODD_EBBU_CODE")
	public String getEoddEbbuCode() {
		return eoddEbbuCode;
	}

	/**
	 * Set eoddEbbuCode
	 */
	public void setEoddEbbuCode(String eoddEbbuCode) {
		this.eoddEbbuCode = eoddEbbuCode;
		addValidField("eoddEbbuCode");
	}

	/**
	 * Get eoddEbbuDist1
	 */
	@Column(name = "EODD_EBBU_DIST_1")
	public String getEoddEbbuDist1() {
		return eoddEbbuDist1;
	}

	/**
	 * Set eoddEbbuDist1
	 */
	public void setEoddEbbuDist1(String eoddEbbuDist1) {
		this.eoddEbbuDist1 = eoddEbbuDist1;
		addValidField("eoddEbbuDist1");
	}

	/**
	 * Get eoddEbbuDist2
	 */
	@Column(name = "EODD_EBBU_DIST_2")
	public String getEoddEbbuDist2() {
		return eoddEbbuDist2;
	}

	/**
	 * Set eoddEbbuDist2
	 */
	public void setEoddEbbuDist2(String eoddEbbuDist2) {
		this.eoddEbbuDist2 = eoddEbbuDist2;
		addValidField("eoddEbbuDist2");
	}

	/**
	 * Get eoddEbbuDist3
	 */
	@Column(name = "EODD_EBBU_DIST_3")
	public String getEoddEbbuDist3() {
		return eoddEbbuDist3;
	}

	/**
	 * Set eoddEbbuDist3
	 */
	public void setEoddEbbuDist3(String eoddEbbuDist3) {
		this.eoddEbbuDist3 = eoddEbbuDist3;
		addValidField("eoddEbbuDist3");
	}

	/**
	 * Get eoddEbbuDist4
	 */
	@Column(name = "EODD_EBBU_DIST_4")
	public String getEoddEbbuDist4() {
		return eoddEbbuDist4;
	}

	/**
	 * Set eoddEbbuDist4
	 */
	public void setEoddEbbuDist4(String eoddEbbuDist4) {
		this.eoddEbbuDist4 = eoddEbbuDist4;
		addValidField("eoddEbbuDist4");
	}

	/**
	 * Get eoddEbbuDist5
	 */
	@Column(name = "EODD_EBBU_DIST_5")
	public String getEoddEbbuDist5() {
		return eoddEbbuDist5;
	}

	/**
	 * Set eoddEbbuDist5
	 */
	public void setEoddEbbuDist5(String eoddEbbuDist5) {
		this.eoddEbbuDist5 = eoddEbbuDist5;
		addValidField("eoddEbbuDist5");
	}

	/**
	 * Get eoddToId
	 */
	@Column(name = "EODD_TO_ID")
	public String getEoddToId() {
		return eoddToId;
	}

	/**
	 * Set eoddToId
	 */
	public void setEoddToId(String eoddToId) {
		this.eoddToId = eoddToId;
		addValidField("eoddToId");
	}

	/**
	 * Get eoddEoorId
	 */
	@Column(name = "EODD_EOOR_ID")
	public Long getEoddEoorId() {
		return eoddEoorId;
	}

	/**
	 * Set eoddEoorId
	 */
	public void setEoddEoorId(Long eoddEoorId) {
		this.eoddEoorId = eoddEoorId;
		addValidField("eoddEoorId");
	}

	/**
	 * Get eoddNo
	 */
	@Column(name = "EODD_NO")
	public String getEoddNo() {
		return eoddNo;
	}

	/**
	 * Set eoddNo
	 */
	public void setEoddNo(String eoddNo) {
		this.eoddNo = eoddNo;
		addValidField("eoddNo");
	}

	/**
	 * Get eoddType
	 */
	@Column(name = "EODD_TYPE")
	public String getEoddType() {
		return eoddType;
	}

	/**
	 * Set eoddType
	 */
	public void setEoddType(String eoddType) {
		this.eoddType = eoddType;
		addValidField("eoddType");
	}

	/**
	 * Get eoddStatus
	 */
	@Column(name = "EODD_STATUS")
	public String getEoddStatus() {
		return eoddStatus;
	}

	/**
	 * Set eoddStatus
	 */
	public void setEoddStatus(String eoddStatus) {
		this.eoddStatus = eoddStatus;
		addValidField("eoddStatus");
	}

	/**
	 * Get eoddOrder
	 */
	@Column(name = "EODD_ORDER")
	public Long getEoddOrder() {
		return eoddOrder;
	}

	/**
	 * Set eoddOrder
	 */
	public void setEoddOrder(Long eoddOrder) {
		this.eoddOrder = eoddOrder;
		addValidField("eoddOrder");
	}

	/**
	 * Get eoddSoNo
	 */
	@Column(name = "EODD_SO_NO")
	public String getEoddSoNo() {
		return eoddSoNo;
	}

	/**
	 * Set eoddSoNo
	 */
	public void setEoddSoNo(String eoddSoNo) {
		this.eoddSoNo = eoddSoNo;
		addValidField("eoddSoNo");
	}

	/**
	 * Get eoddDoNo
	 */
	@Column(name = "EODD_DO_NO")
	public String getEoddDoNo() {
		return eoddDoNo;
	}

	/**
	 * Set eoddDoNo
	 */
	public void setEoddDoNo(String eoddDoNo) {
		this.eoddDoNo = eoddDoNo;
		addValidField("eoddDoNo");
	}

	/**
	 * Get eoddConsignorEbcuId
	 */
	@Column(name = "EODD_CONSIGNOR_EBCU_ID")
	public Long getEoddConsignorEbcuId() {
		return eoddConsignorEbcuId;
	}

	/**
	 * Set eoddConsignorEbcuId
	 */
	public void setEoddConsignorEbcuId(Long eoddConsignorEbcuId) {
		this.eoddConsignorEbcuId = eoddConsignorEbcuId;
		addValidField("eoddConsignorEbcuId");
	}

	/**
	 * Get eoddConsignorEbcuCode
	 */
	@Column(name = "EODD_CONSIGNOR_EBCU_CODE")
	public String getEoddConsignorEbcuCode() {
		return eoddConsignorEbcuCode;
	}

	/**
	 * Set eoddConsignorEbcuCode
	 */
	public void setEoddConsignorEbcuCode(String eoddConsignorEbcuCode) {
		this.eoddConsignorEbcuCode = eoddConsignorEbcuCode;
		addValidField("eoddConsignorEbcuCode");
	}

	/**
	 * Get eoddConsignorEbcuName
	 */
	@Column(name = "EODD_CONSIGNOR_EBCU_NAME")
	public String getEoddConsignorEbcuName() {
		return eoddConsignorEbcuName;
	}

	/**
	 * Set eoddConsignorEbcuName
	 */
	public void setEoddConsignorEbcuName(String eoddConsignorEbcuName) {
		this.eoddConsignorEbcuName = eoddConsignorEbcuName;
		addValidField("eoddConsignorEbcuName");
	}

	/**
	 * Get eoddOwnerEbcuId
	 */
	@Column(name = "EODD_OWNER_EBCU_ID")
	public Long getEoddOwnerEbcuId() {
		return eoddOwnerEbcuId;
	}

	/**
	 * Set eoddOwnerEbcuId
	 */
	public void setEoddOwnerEbcuId(Long eoddOwnerEbcuId) {
		this.eoddOwnerEbcuId = eoddOwnerEbcuId;
		addValidField("eoddOwnerEbcuId");
	}

	/**
	 * Get eoddOwnerEbcuCode
	 */
	@Column(name = "EODD_OWNER_EBCU_CODE")
	public String getEoddOwnerEbcuCode() {
		return eoddOwnerEbcuCode;
	}

	/**
	 * Set eoddOwnerEbcuCode
	 */
	public void setEoddOwnerEbcuCode(String eoddOwnerEbcuCode) {
		this.eoddOwnerEbcuCode = eoddOwnerEbcuCode;
		addValidField("eoddOwnerEbcuCode");
	}

	/**
	 * Get eoddOwnerEbcuName
	 */
	@Column(name = "EODD_OWNER_EBCU_NAME")
	public String getEoddOwnerEbcuName() {
		return eoddOwnerEbcuName;
	}

	/**
	 * Set eoddOwnerEbcuName
	 */
	public void setEoddOwnerEbcuName(String eoddOwnerEbcuName) {
		this.eoddOwnerEbcuName = eoddOwnerEbcuName;
		addValidField("eoddOwnerEbcuName");
	}

	/**
	 * Get eoddShipperConsignNo
	 */
	@Column(name = "EODD_SHIPPER_CONSIGN_NO")
	public String getEoddShipperConsignNo() {
		return eoddShipperConsignNo;
	}

	/**
	 * Set eoddShipperConsignNo
	 */
	public void setEoddShipperConsignNo(String eoddShipperConsignNo) {
		this.eoddShipperConsignNo = eoddShipperConsignNo;
		addValidField("eoddShipperConsignNo");
	}

	/**
	 * Get eoddIeFlag
	 */
	@Column(name = "EODD_IE_FLAG")
	public String getEoddIeFlag() {
		return eoddIeFlag;
	}

	/**
	 * Set eoddIeFlag
	 */
	public void setEoddIeFlag(String eoddIeFlag) {
		this.eoddIeFlag = eoddIeFlag;
		addValidField("eoddIeFlag");
	}

	/**
	 * Get eoddPortCode
	 */
	@Column(name = "EODD_PORT_CODE")
	public String getEoddPortCode() {
		return eoddPortCode;
	}

	/**
	 * Set eoddPortCode
	 */
	public void setEoddPortCode(String eoddPortCode) {
		this.eoddPortCode = eoddPortCode;
		addValidField("eoddPortCode");
	}

	/**
	 * Get eoddIeDate
	 */
	@Column(name = "EODD_IE_DATE")
	public Date getEoddIeDate() {
		return eoddIeDate;
	}

	/**
	 * Set eoddIeDate
	 */
	public void setEoddIeDate(Date eoddIeDate) {
		this.eoddIeDate = eoddIeDate;
		addValidField("eoddIeDate");
	}

	/**
	 * Get eoddTradeTerms
	 */
	@Column(name = "EODD_TRADE_TERMS")
	public String getEoddTradeTerms() {
		return eoddTradeTerms;
	}

	/**
	 * Set eoddTradeTerms
	 */
	public void setEoddTradeTerms(String eoddTradeTerms) {
		this.eoddTradeTerms = eoddTradeTerms;
		addValidField("eoddTradeTerms");
	}

	/**
	 * Get eoddTransactionMode
	 */
	@Column(name = "EODD_TRANSACTION_MODE")
	public String getEoddTransactionMode() {
		return eoddTransactionMode;
	}

	/**
	 * Set eoddTransactionMode
	 */
	public void setEoddTransactionMode(String eoddTransactionMode) {
		this.eoddTransactionMode = eoddTransactionMode;
		addValidField("eoddTransactionMode");
	}

	/**
	 * Get eoddTransportType
	 */
	@Column(name = "EODD_TRANSPORT_TYPE")
	public String getEoddTransportType() {
		return eoddTransportType;
	}

	/**
	 * Set eoddTransportType
	 */
	public void setEoddTransportType(String eoddTransportType) {
		this.eoddTransportType = eoddTransportType;
		addValidField("eoddTransportType");
	}

	/**
	 * Get eoddTransportName
	 */
	@Column(name = "EODD_TRANSPORT_NAME")
	public String getEoddTransportName() {
		return eoddTransportName;
	}

	/**
	 * Set eoddTransportName
	 */
	public void setEoddTransportName(String eoddTransportName) {
		this.eoddTransportName = eoddTransportName;
		addValidField("eoddTransportName");
	}

	/**
	 * Get eoddLoadPortId
	 */
	@Column(name = "EODD_LOAD_PORT_ID")
	public Long getEoddLoadPortId() {
		return eoddLoadPortId;
	}

	/**
	 * Set eoddLoadPortId
	 */
	public void setEoddLoadPortId(Long eoddLoadPortId) {
		this.eoddLoadPortId = eoddLoadPortId;
		addValidField("eoddLoadPortId");
	}

	/**
	 * Get eoddLoadPortCode
	 */
	@Column(name = "EODD_LOAD_PORT_CODE")
	public String getEoddLoadPortCode() {
		return eoddLoadPortCode;
	}

	/**
	 * Set eoddLoadPortCode
	 */
	public void setEoddLoadPortCode(String eoddLoadPortCode) {
		this.eoddLoadPortCode = eoddLoadPortCode;
		addValidField("eoddLoadPortCode");
	}

	/**
	 * Get eoddLoadPortName
	 */
	@Column(name = "EODD_LOAD_PORT_NAME")
	public String getEoddLoadPortName() {
		return eoddLoadPortName;
	}

	/**
	 * Set eoddLoadPortName
	 */
	public void setEoddLoadPortName(String eoddLoadPortName) {
		this.eoddLoadPortName = eoddLoadPortName;
		addValidField("eoddLoadPortName");
	}

	/**
	 * Get eoddFinalDestinationId
	 */
	@Column(name = "EODD_FINAL_DESTINATION_ID")
	public Long getEoddFinalDestinationId() {
		return eoddFinalDestinationId;
	}

	/**
	 * Set eoddFinalDestinationId
	 */
	public void setEoddFinalDestinationId(Long eoddFinalDestinationId) {
		this.eoddFinalDestinationId = eoddFinalDestinationId;
		addValidField("eoddFinalDestinationId");
	}

	/**
	 * Get eoddFinalDestinationCode
	 */
	@Column(name = "EODD_FINAL_DESTINATION_CODE")
	public String getEoddFinalDestinationCode() {
		return eoddFinalDestinationCode;
	}

	/**
	 * Set eoddFinalDestinationCode
	 */
	public void setEoddFinalDestinationCode(String eoddFinalDestinationCode) {
		this.eoddFinalDestinationCode = eoddFinalDestinationCode;
		addValidField("eoddFinalDestinationCode");
	}

	/**
	 * Get eoddFinalDestinationName
	 */
	@Column(name = "EODD_FINAL_DESTINATION_NAME")
	public String getEoddFinalDestinationName() {
		return eoddFinalDestinationName;
	}

	/**
	 * Set eoddFinalDestinationName
	 */
	public void setEoddFinalDestinationName(String eoddFinalDestinationName) {
		this.eoddFinalDestinationName = eoddFinalDestinationName;
		addValidField("eoddFinalDestinationName");
	}

	/**
	 * Get eoddBlNo
	 */
	@Column(name = "EODD_BL_NO")
	public String getEoddBlNo() {
		return eoddBlNo;
	}

	/**
	 * Set eoddBlNo
	 */
	public void setEoddBlNo(String eoddBlNo) {
		this.eoddBlNo = eoddBlNo;
		addValidField("eoddBlNo");
	}

	/**
	 * Get eoddCargoName
	 */
	@Column(name = "EODD_CARGO_NAME")
	public String getEoddCargoName() {
		return eoddCargoName;
	}

	/**
	 * Set eoddCargoName
	 */
	public void setEoddCargoName(String eoddCargoName) {
		this.eoddCargoName = eoddCargoName;
		addValidField("eoddCargoName");
	}

	/**
	 * Get eoddDeclarationType
	 */
	@Column(name = "EODD_DECLARATION_TYPE")
	public String getEoddDeclarationType() {
		return eoddDeclarationType;
	}

	/**
	 * Set eoddDeclarationType
	 */
	public void setEoddDeclarationType(String eoddDeclarationType) {
		this.eoddDeclarationType = eoddDeclarationType;
		addValidField("eoddDeclarationType");
	}

	/**
	 * Get eoddCustomsBrokerId
	 */
	@Column(name = "EODD_CUSTOMS_BROKER_ID")
	public Long getEoddCustomsBrokerId() {
		return eoddCustomsBrokerId;
	}

	/**
	 * Set eoddCustomsBrokerId
	 */
	public void setEoddCustomsBrokerId(Long eoddCustomsBrokerId) {
		this.eoddCustomsBrokerId = eoddCustomsBrokerId;
		addValidField("eoddCustomsBrokerId");
	}

	/**
	 * Get eoddCustomsBrokerCode
	 */
	@Column(name = "EODD_CUSTOMS_BROKER_CODE")
	public String getEoddCustomsBrokerCode() {
		return eoddCustomsBrokerCode;
	}

	/**
	 * Set eoddCustomsBrokerCode
	 */
	public void setEoddCustomsBrokerCode(String eoddCustomsBrokerCode) {
		this.eoddCustomsBrokerCode = eoddCustomsBrokerCode;
		addValidField("eoddCustomsBrokerCode");
	}

	/**
	 * Get eoddCustomsBroker
	 */
	@Column(name = "EODD_CUSTOMS_BROKER")
	public String getEoddCustomsBroker() {
		return eoddCustomsBroker;
	}

	/**
	 * Set eoddCustomsBroker
	 */
	public void setEoddCustomsBroker(String eoddCustomsBroker) {
		this.eoddCustomsBroker = eoddCustomsBroker;
		addValidField("eoddCustomsBroker");
	}

	/**
	 * Get eoddCustomsBrokerContact
	 */
	@Column(name = "EODD_CUSTOMS_BROKER_CONTACT")
	public String getEoddCustomsBrokerContact() {
		return eoddCustomsBrokerContact;
	}

	/**
	 * Set eoddCustomsBrokerContact
	 */
	public void setEoddCustomsBrokerContact(String eoddCustomsBrokerContact) {
		this.eoddCustomsBrokerContact = eoddCustomsBrokerContact;
		addValidField("eoddCustomsBrokerContact");
	}

	/**
	 * Get eoddCustomsBrokerTel
	 */
	@Column(name = "EODD_CUSTOMS_BROKER_TEL")
	public String getEoddCustomsBrokerTel() {
		return eoddCustomsBrokerTel;
	}

	/**
	 * Set eoddCustomsBrokerTel
	 */
	public void setEoddCustomsBrokerTel(String eoddCustomsBrokerTel) {
		this.eoddCustomsBrokerTel = eoddCustomsBrokerTel;
		addValidField("eoddCustomsBrokerTel");
	}

	/**
	 * Get eoddDocumentCollectDate
	 */
	@Column(name = "EODD_DOCUMENT_COLLECT_DATE")
	public Date getEoddDocumentCollectDate() {
		return eoddDocumentCollectDate;
	}

	/**
	 * Set eoddDocumentCollectDate
	 */
	public void setEoddDocumentCollectDate(Date eoddDocumentCollectDate) {
		this.eoddDocumentCollectDate = eoddDocumentCollectDate;
		addValidField("eoddDocumentCollectDate");
	}

	/**
	 * Get eoddDocumentRecoveryDate
	 */
	@Column(name = "EODD_DOCUMENT_RECOVERY_DATE")
	public Date getEoddDocumentRecoveryDate() {
		return eoddDocumentRecoveryDate;
	}

	/**
	 * Set eoddDocumentRecoveryDate
	 */
	public void setEoddDocumentRecoveryDate(Date eoddDocumentRecoveryDate) {
		this.eoddDocumentRecoveryDate = eoddDocumentRecoveryDate;
		addValidField("eoddDocumentRecoveryDate");
	}

	/**
	 * Get eoddReceiptReturnDate
	 */
	@Column(name = "EODD_RECEIPT_RETURN_DATE")
	public Date getEoddReceiptReturnDate() {
		return eoddReceiptReturnDate;
	}

	/**
	 * Set eoddReceiptReturnDate
	 */
	public void setEoddReceiptReturnDate(Date eoddReceiptReturnDate) {
		this.eoddReceiptReturnDate = eoddReceiptReturnDate;
		addValidField("eoddReceiptReturnDate");
	}

	/**
	 * Get eoddTaxDate
	 */
	@Column(name = "EODD_TAX_DATE")
	public Date getEoddTaxDate() {
		return eoddTaxDate;
	}

	/**
	 * Set eoddTaxDate
	 */
	public void setEoddTaxDate(Date eoddTaxDate) {
		this.eoddTaxDate = eoddTaxDate;
		addValidField("eoddTaxDate");
	}

	/**
	 * Get eoddSendSingleDate
	 */
	@Column(name = "EODD_SEND_SINGLE_DATE")
	public Date getEoddSendSingleDate() {
		return eoddSendSingleDate;
	}

	/**
	 * Set eoddSendSingleDate
	 */
	public void setEoddSendSingleDate(Date eoddSendSingleDate) {
		this.eoddSendSingleDate = eoddSendSingleDate;
		addValidField("eoddSendSingleDate");
	}

	/**
	 * Get eoddSigningDate
	 */
	@Column(name = "EODD_SIGNING_DATE")
	public Date getEoddSigningDate() {
		return eoddSigningDate;
	}

	/**
	 * Set eoddSigningDate
	 */
	public void setEoddSigningDate(Date eoddSigningDate) {
		this.eoddSigningDate = eoddSigningDate;
		addValidField("eoddSigningDate");
	}

	/**
	 * Get eoddDgdFinishDate
	 */
	@Column(name = "EODD_DGD_FINISH_DATE")
	public Date getEoddDgdFinishDate() {
		return eoddDgdFinishDate;
	}

	/**
	 * Set eoddDgdFinishDate
	 */
	public void setEoddDgdFinishDate(Date eoddDgdFinishDate) {
		this.eoddDgdFinishDate = eoddDgdFinishDate;
		addValidField("eoddDgdFinishDate");
	}

	/**
	 * Get eoddCustomsDeclarationNum
	 */
	@Column(name = "EODD_CUSTOMS_DECLARATION_NUM")
	public Long getEoddCustomsDeclarationNum() {
		return eoddCustomsDeclarationNum;
	}

	/**
	 * Set eoddCustomsDeclarationNum
	 */
	public void setEoddCustomsDeclarationNum(Long eoddCustomsDeclarationNum) {
		this.eoddCustomsDeclarationNum = eoddCustomsDeclarationNum;
		addValidField("eoddCustomsDeclarationNum");
	}

	/**
	 * Get eoddCauseDelay
	 */
	@Column(name = "EODD_CAUSE_DELAY")
	public String getEoddCauseDelay() {
		return eoddCauseDelay;
	}

	/**
	 * Set eoddCauseDelay
	 */
	public void setEoddCauseDelay(String eoddCauseDelay) {
		this.eoddCauseDelay = eoddCauseDelay;
		addValidField("eoddCauseDelay");
	}

	/**
	 * Get eoddGrossWeight
	 */
	@Column(name = "EODD_GROSS_WEIGHT")
	public Double getEoddGrossWeight() {
		return eoddGrossWeight;
	}

	/**
	 * Set eoddGrossWeight
	 */
	public void setEoddGrossWeight(Double eoddGrossWeight) {
		this.eoddGrossWeight = eoddGrossWeight;
		addValidField("eoddGrossWeight");
	}

	/**
	 * Get eoddNetWeight
	 */
	@Column(name = "EODD_NET_WEIGHT")
	public Double getEoddNetWeight() {
		return eoddNetWeight;
	}

	/**
	 * Set eoddNetWeight
	 */
	public void setEoddNetWeight(Double eoddNetWeight) {
		this.eoddNetWeight = eoddNetWeight;
		addValidField("eoddNetWeight");
	}

	/**
	 * Get eoddQuantity
	 */
	@Column(name = "EODD_QUANTITY")
	public Long getEoddQuantity() {
		return eoddQuantity;
	}

	/**
	 * Set eoddQuantity
	 */
	public void setEoddQuantity(Long eoddQuantity) {
		this.eoddQuantity = eoddQuantity;
		addValidField("eoddQuantity");
	}

	/**
	 * Get eoddVolume
	 */
	@Column(name = "EODD_VOLUME")
	public Long getEoddVolume() {
		return eoddVolume;
	}

	/**
	 * Set eoddVolume
	 */
	public void setEoddVolume(Long eoddVolume) {
		this.eoddVolume = eoddVolume;
		addValidField("eoddVolume");
	}

	/**
	 * Get eoddRemark
	 */
	@Column(name = "EODD_REMARK")
	public String getEoddRemark() {
		return eoddRemark;
	}

	/**
	 * Set eoddRemark
	 */
	public void setEoddRemark(String eoddRemark) {
		this.eoddRemark = eoddRemark;
		addValidField("eoddRemark");
	}

	/**
	 * Get eoddSubstr1
	 */
	@Column(name = "EODD_SUBSTR1")
	public String getEoddSubstr1() {
		return eoddSubstr1;
	}

	/**
	 * Set eoddSubstr1
	 */
	public void setEoddSubstr1(String eoddSubstr1) {
		this.eoddSubstr1 = eoddSubstr1;
		addValidField("eoddSubstr1");
	}

	/**
	 * Get eoddSubstr2
	 */
	@Column(name = "EODD_SUBSTR2")
	public String getEoddSubstr2() {
		return eoddSubstr2;
	}

	/**
	 * Set eoddSubstr2
	 */
	public void setEoddSubstr2(String eoddSubstr2) {
		this.eoddSubstr2 = eoddSubstr2;
		addValidField("eoddSubstr2");
	}

	/**
	 * Get eoddSubstr3
	 */
	@Column(name = "EODD_SUBSTR3")
	public String getEoddSubstr3() {
		return eoddSubstr3;
	}

	/**
	 * Set eoddSubstr3
	 */
	public void setEoddSubstr3(String eoddSubstr3) {
		this.eoddSubstr3 = eoddSubstr3;
		addValidField("eoddSubstr3");
	}

	/**
	 * Get eoddSubstr4
	 */
	@Column(name = "EODD_SUBSTR4")
	public String getEoddSubstr4() {
		return eoddSubstr4;
	}

	/**
	 * Set eoddSubstr4
	 */
	public void setEoddSubstr4(String eoddSubstr4) {
		this.eoddSubstr4 = eoddSubstr4;
		addValidField("eoddSubstr4");
	}

	/**
	 * Get eoddSubstr5
	 */
	@Column(name = "EODD_SUBSTR5")
	public String getEoddSubstr5() {
		return eoddSubstr5;
	}

	/**
	 * Set eoddSubstr5
	 */
	public void setEoddSubstr5(String eoddSubstr5) {
		this.eoddSubstr5 = eoddSubstr5;
		addValidField("eoddSubstr5");
	}

	/**
	 * Get eoddSubstr6
	 */
	@Column(name = "EODD_SUBSTR6")
	public String getEoddSubstr6() {
		return eoddSubstr6;
	}

	/**
	 * Set eoddSubstr6
	 */
	public void setEoddSubstr6(String eoddSubstr6) {
		this.eoddSubstr6 = eoddSubstr6;
		addValidField("eoddSubstr6");
	}

	/**
	 * Get eoddSubstr7
	 */
	@Column(name = "EODD_SUBSTR7")
	public String getEoddSubstr7() {
		return eoddSubstr7;
	}

	/**
	 * Set eoddSubstr7
	 */
	public void setEoddSubstr7(String eoddSubstr7) {
		this.eoddSubstr7 = eoddSubstr7;
		addValidField("eoddSubstr7");
	}

	/**
	 * Get eoddSubstr8
	 */
	@Column(name = "EODD_SUBSTR8")
	public String getEoddSubstr8() {
		return eoddSubstr8;
	}

	/**
	 * Set eoddSubstr8
	 */
	public void setEoddSubstr8(String eoddSubstr8) {
		this.eoddSubstr8 = eoddSubstr8;
		addValidField("eoddSubstr8");
	}

	/**
	 * Get eoddSubstr9
	 */
	@Column(name = "EODD_SUBSTR9")
	public String getEoddSubstr9() {
		return eoddSubstr9;
	}

	/**
	 * Set eoddSubstr9
	 */
	public void setEoddSubstr9(String eoddSubstr9) {
		this.eoddSubstr9 = eoddSubstr9;
		addValidField("eoddSubstr9");
	}

	/**
	 * Get eoddSubstr10
	 */
	@Column(name = "EODD_SUBSTR10")
	public String getEoddSubstr10() {
		return eoddSubstr10;
	}

	/**
	 * Set eoddSubstr10
	 */
	public void setEoddSubstr10(String eoddSubstr10) {
		this.eoddSubstr10 = eoddSubstr10;
		addValidField("eoddSubstr10");
	}

	/**
	 * Get eoddSubstr11
	 */
	@Column(name = "EODD_SUBSTR11")
	public String getEoddSubstr11() {
		return eoddSubstr11;
	}

	/**
	 * Set eoddSubstr11
	 */
	public void setEoddSubstr11(String eoddSubstr11) {
		this.eoddSubstr11 = eoddSubstr11;
		addValidField("eoddSubstr11");
	}

	/**
	 * Get eoddSubstr12
	 */
	@Column(name = "EODD_SUBSTR12")
	public String getEoddSubstr12() {
		return eoddSubstr12;
	}

	/**
	 * Set eoddSubstr12
	 */
	public void setEoddSubstr12(String eoddSubstr12) {
		this.eoddSubstr12 = eoddSubstr12;
		addValidField("eoddSubstr12");
	}

	/**
	 * Get eoddSubstr13
	 */
	@Column(name = "EODD_SUBSTR13")
	public String getEoddSubstr13() {
		return eoddSubstr13;
	}

	/**
	 * Set eoddSubstr13
	 */
	public void setEoddSubstr13(String eoddSubstr13) {
		this.eoddSubstr13 = eoddSubstr13;
		addValidField("eoddSubstr13");
	}

	/**
	 * Get eoddSubstr14
	 */
	@Column(name = "EODD_SUBSTR14")
	public String getEoddSubstr14() {
		return eoddSubstr14;
	}

	/**
	 * Set eoddSubstr14
	 */
	public void setEoddSubstr14(String eoddSubstr14) {
		this.eoddSubstr14 = eoddSubstr14;
		addValidField("eoddSubstr14");
	}

	/**
	 * Get eoddSubstr15
	 */
	@Column(name = "EODD_SUBSTR15")
	public String getEoddSubstr15() {
		return eoddSubstr15;
	}

	/**
	 * Set eoddSubstr15
	 */
	public void setEoddSubstr15(String eoddSubstr15) {
		this.eoddSubstr15 = eoddSubstr15;
		addValidField("eoddSubstr15");
	}

	/**
	 * Get eoddSubstr16
	 */
	@Column(name = "EODD_SUBSTR16")
	public String getEoddSubstr16() {
		return eoddSubstr16;
	}

	/**
	 * Set eoddSubstr16
	 */
	public void setEoddSubstr16(String eoddSubstr16) {
		this.eoddSubstr16 = eoddSubstr16;
		addValidField("eoddSubstr16");
	}

	/**
	 * Get eoddSubstr17
	 */
	@Column(name = "EODD_SUBSTR17")
	public String getEoddSubstr17() {
		return eoddSubstr17;
	}

	/**
	 * Set eoddSubstr17
	 */
	public void setEoddSubstr17(String eoddSubstr17) {
		this.eoddSubstr17 = eoddSubstr17;
		addValidField("eoddSubstr17");
	}

	/**
	 * Get eoddSubstr18
	 */
	@Column(name = "EODD_SUBSTR18")
	public String getEoddSubstr18() {
		return eoddSubstr18;
	}

	/**
	 * Set eoddSubstr18
	 */
	public void setEoddSubstr18(String eoddSubstr18) {
		this.eoddSubstr18 = eoddSubstr18;
		addValidField("eoddSubstr18");
	}

	/**
	 * Get eoddSubstr19
	 */
	@Column(name = "EODD_SUBSTR19")
	public String getEoddSubstr19() {
		return eoddSubstr19;
	}

	/**
	 * Set eoddSubstr19
	 */
	public void setEoddSubstr19(String eoddSubstr19) {
		this.eoddSubstr19 = eoddSubstr19;
		addValidField("eoddSubstr19");
	}

	/**
	 * Get eoddSubstr20
	 */
	@Column(name = "EODD_SUBSTR20")
	public String getEoddSubstr20() {
		return eoddSubstr20;
	}

	/**
	 * Set eoddSubstr20
	 */
	public void setEoddSubstr20(String eoddSubstr20) {
		this.eoddSubstr20 = eoddSubstr20;
		addValidField("eoddSubstr20");
	}

	/**
	 * Get eoddSubstr21
	 */
	@Column(name = "EODD_SUBSTR21")
	public String getEoddSubstr21() {
		return eoddSubstr21;
	}

	/**
	 * Set eoddSubstr21
	 */
	public void setEoddSubstr21(String eoddSubstr21) {
		this.eoddSubstr21 = eoddSubstr21;
		addValidField("eoddSubstr21");
	}

	/**
	 * Get eoddSubstr22
	 */
	@Column(name = "EODD_SUBSTR22")
	public String getEoddSubstr22() {
		return eoddSubstr22;
	}

	/**
	 * Set eoddSubstr22
	 */
	public void setEoddSubstr22(String eoddSubstr22) {
		this.eoddSubstr22 = eoddSubstr22;
		addValidField("eoddSubstr22");
	}

	/**
	 * Get eoddSubstr23
	 */
	@Column(name = "EODD_SUBSTR23")
	public String getEoddSubstr23() {
		return eoddSubstr23;
	}

	/**
	 * Set eoddSubstr23
	 */
	public void setEoddSubstr23(String eoddSubstr23) {
		this.eoddSubstr23 = eoddSubstr23;
		addValidField("eoddSubstr23");
	}

	/**
	 * Get eoddSubstr24
	 */
	@Column(name = "EODD_SUBSTR24")
	public String getEoddSubstr24() {
		return eoddSubstr24;
	}

	/**
	 * Set eoddSubstr24
	 */
	public void setEoddSubstr24(String eoddSubstr24) {
		this.eoddSubstr24 = eoddSubstr24;
		addValidField("eoddSubstr24");
	}

	/**
	 * Get eoddSubstr25
	 */
	@Column(name = "EODD_SUBSTR25")
	public String getEoddSubstr25() {
		return eoddSubstr25;
	}

	/**
	 * Set eoddSubstr25
	 */
	public void setEoddSubstr25(String eoddSubstr25) {
		this.eoddSubstr25 = eoddSubstr25;
		addValidField("eoddSubstr25");
	}

	/**
	 * Get eoddSubdate1
	 */
	@Column(name = "EODD_SUBDATE1")
	public Date getEoddSubdate1() {
		return eoddSubdate1;
	}

	/**
	 * Set eoddSubdate1
	 */
	public void setEoddSubdate1(Date eoddSubdate1) {
		this.eoddSubdate1 = eoddSubdate1;
		addValidField("eoddSubdate1");
	}

	/**
	 * Get eoddSubdate2
	 */
	@Column(name = "EODD_SUBDATE2")
	public Date getEoddSubdate2() {
		return eoddSubdate2;
	}

	/**
	 * Set eoddSubdate2
	 */
	public void setEoddSubdate2(Date eoddSubdate2) {
		this.eoddSubdate2 = eoddSubdate2;
		addValidField("eoddSubdate2");
	}

	/**
	 * Get eoddSubdate3
	 */
	@Column(name = "EODD_SUBDATE3")
	public Date getEoddSubdate3() {
		return eoddSubdate3;
	}

	/**
	 * Set eoddSubdate3
	 */
	public void setEoddSubdate3(Date eoddSubdate3) {
		this.eoddSubdate3 = eoddSubdate3;
		addValidField("eoddSubdate3");
	}

	/**
	 * Get eoddSubdate4
	 */
	@Column(name = "EODD_SUBDATE4")
	public Date getEoddSubdate4() {
		return eoddSubdate4;
	}

	/**
	 * Set eoddSubdate4
	 */
	public void setEoddSubdate4(Date eoddSubdate4) {
		this.eoddSubdate4 = eoddSubdate4;
		addValidField("eoddSubdate4");
	}

	/**
	 * Get eoddSubdate5
	 */
	@Column(name = "EODD_SUBDATE5")
	public Date getEoddSubdate5() {
		return eoddSubdate5;
	}

	/**
	 * Set eoddSubdate5
	 */
	public void setEoddSubdate5(Date eoddSubdate5) {
		this.eoddSubdate5 = eoddSubdate5;
		addValidField("eoddSubdate5");
	}

	/**
	 * Get eoddSubdate6
	 */
	@Column(name = "EODD_SUBDATE6")
	public Date getEoddSubdate6() {
		return eoddSubdate6;
	}

	/**
	 * Set eoddSubdate6
	 */
	public void setEoddSubdate6(Date eoddSubdate6) {
		this.eoddSubdate6 = eoddSubdate6;
		addValidField("eoddSubdate6");
	}

	/**
	 * Get eoddSubdate7
	 */
	@Column(name = "EODD_SUBDATE7")
	public Date getEoddSubdate7() {
		return eoddSubdate7;
	}

	/**
	 * Set eoddSubdate7
	 */
	public void setEoddSubdate7(Date eoddSubdate7) {
		this.eoddSubdate7 = eoddSubdate7;
		addValidField("eoddSubdate7");
	}

	/**
	 * Get eoddSubdate8
	 */
	@Column(name = "EODD_SUBDATE8")
	public Date getEoddSubdate8() {
		return eoddSubdate8;
	}

	/**
	 * Set eoddSubdate8
	 */
	public void setEoddSubdate8(Date eoddSubdate8) {
		this.eoddSubdate8 = eoddSubdate8;
		addValidField("eoddSubdate8");
	}

	/**
	 * Get eoddSubdate9
	 */
	@Column(name = "EODD_SUBDATE9")
	public Date getEoddSubdate9() {
		return eoddSubdate9;
	}

	/**
	 * Set eoddSubdate9
	 */
	public void setEoddSubdate9(Date eoddSubdate9) {
		this.eoddSubdate9 = eoddSubdate9;
		addValidField("eoddSubdate9");
	}

	/**
	 * Get eoddSubdate10
	 */
	@Column(name = "EODD_SUBDATE10")
	public Date getEoddSubdate10() {
		return eoddSubdate10;
	}

	/**
	 * Set eoddSubdate10
	 */
	public void setEoddSubdate10(Date eoddSubdate10) {
		this.eoddSubdate10 = eoddSubdate10;
		addValidField("eoddSubdate10");
	}

	/**
	 * Get eoddSubnum1
	 */
	@Column(name = "EODD_SUBNUM1")
	public Long getEoddSubnum1() {
		return eoddSubnum1;
	}

	/**
	 * Set eoddSubnum1
	 */
	public void setEoddSubnum1(Long eoddSubnum1) {
		this.eoddSubnum1 = eoddSubnum1;
		addValidField("eoddSubnum1");
	}

	/**
	 * Get eoddSubnum2
	 */
	@Column(name = "EODD_SUBNUM2")
	public Long getEoddSubnum2() {
		return eoddSubnum2;
	}

	/**
	 * Set eoddSubnum2
	 */
	public void setEoddSubnum2(Long eoddSubnum2) {
		this.eoddSubnum2 = eoddSubnum2;
		addValidField("eoddSubnum2");
	}

	/**
	 * Get eoddSubnum3
	 */
	@Column(name = "EODD_SUBNUM3")
	public Long getEoddSubnum3() {
		return eoddSubnum3;
	}

	/**
	 * Set eoddSubnum3
	 */
	public void setEoddSubnum3(Long eoddSubnum3) {
		this.eoddSubnum3 = eoddSubnum3;
		addValidField("eoddSubnum3");
	}

	/**
	 * Get eoddSubnum4
	 */
	@Column(name = "EODD_SUBNUM4")
	public Long getEoddSubnum4() {
		return eoddSubnum4;
	}

	/**
	 * Set eoddSubnum4
	 */
	public void setEoddSubnum4(Long eoddSubnum4) {
		this.eoddSubnum4 = eoddSubnum4;
		addValidField("eoddSubnum4");
	}

	/**
	 * Get eoddSubnum5
	 */
	@Column(name = "EODD_SUBNUM5")
	public Long getEoddSubnum5() {
		return eoddSubnum5;
	}

	/**
	 * Set eoddSubnum5
	 */
	public void setEoddSubnum5(Long eoddSubnum5) {
		this.eoddSubnum5 = eoddSubnum5;
		addValidField("eoddSubnum5");
	}

	/**
	 * Get eoddSubnum6
	 */
	@Column(name = "EODD_SUBNUM6")
	public Long getEoddSubnum6() {
		return eoddSubnum6;
	}

	/**
	 * Set eoddSubnum6
	 */
	public void setEoddSubnum6(Long eoddSubnum6) {
		this.eoddSubnum6 = eoddSubnum6;
		addValidField("eoddSubnum6");
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
	 * Get eoddExchangeType
	 */
	@Column(name = "EODD_EXCHANGE_TYPE")
	public String getEoddExchangeType() {
		return eoddExchangeType;
	}

	/**
	 * Set eoddExchangeType
	 */
	public void setEoddExchangeType(String eoddExchangeType) {
		this.eoddExchangeType = eoddExchangeType;
		addValidField("eoddExchangeType");
	}

	/**
	 * Get eoddTradeCountry
	 */
	@Column(name = "EODD_TRADE_COUNTRY")
	public String getEoddTradeCountry() {
		return eoddTradeCountry;
	}

	/**
	 * Set eoddTradeCountry
	 */
	public void setEoddTradeCountry(String eoddTradeCountry) {
		this.eoddTradeCountry = eoddTradeCountry;
		addValidField("eoddTradeCountry");
	}

	/**
	 * Get eoddTradeCountryName
	 */
	@Column(name = "EODD_TRADE_COUNTRY_NAME")
	public String getEoddTradeCountryName() {
		return eoddTradeCountryName;
	}

	/**
	 * Set eoddTradeCountryName
	 */
	public void setEoddTradeCountryName(String eoddTradeCountryName) {
		this.eoddTradeCountryName = eoddTradeCountryName;
		addValidField("eoddTradeCountryName");
	}

	/**
	 * Get eoddArriveCode
	 */
	@Column(name = "EODD_ARRIVE_CODE")
	public String getEoddArriveCode() {
		return eoddArriveCode;
	}

	/**
	 * Set eoddArriveCode
	 */
	public void setEoddArriveCode(String eoddArriveCode) {
		this.eoddArriveCode = eoddArriveCode;
		addValidField("eoddArriveCode");
	}

	/**
	 * Get eoddArriveName
	 */
	@Column(name = "EODD_ARRIVE_NAME")
	public String getEoddArriveName() {
		return eoddArriveName;
	}

	/**
	 * Set eoddArriveName
	 */
	public void setEoddArriveName(String eoddArriveName) {
		this.eoddArriveName = eoddArriveName;
		addValidField("eoddArriveName");
	}

	/**
	 * Get eoddContractNo
	 */
	@Column(name = "EODD_CONTRACT_NO")
	public String getEoddContractNo() {
		return eoddContractNo;
	}

	/**
	 * Set eoddContractNo
	 */
	public void setEoddContractNo(String eoddContractNo) {
		this.eoddContractNo = eoddContractNo;
		addValidField("eoddContractNo");
	}

	/**
	 * Get eoddDeclarationNo
	 */
	@Column(name = "EODD_DECLARATION_NO")
	public String getEoddDeclarationNo() {
		return eoddDeclarationNo;
	}

	/**
	 * Set eoddDeclarationNo
	 */
	public void setEoddDeclarationNo(String eoddDeclarationNo) {
		this.eoddDeclarationNo = eoddDeclarationNo;
		addValidField("eoddDeclarationNo");
	}

	/**
	 * Get eoddSailingDate
	 */
	@Column(name = "EODD_SAILING_DATE")
	public Date getEoddSailingDate() {
		return eoddSailingDate;
	}

	/**
	 * Set eoddSailingDate
	 */
	public void setEoddSailingDate(Date eoddSailingDate) {
		this.eoddSailingDate = eoddSailingDate;
		addValidField("eoddSailingDate");
	}

	/**
	 * Get eoddVessel
	 */
	@Column(name = "EODD_VESSEL")
	public String getEoddVessel() {
		return eoddVessel;
	}

	/**
	 * Set eoddVessel
	 */
	public void setEoddVessel(String eoddVessel) {
		this.eoddVessel = eoddVessel;
		addValidField("eoddVessel");
	}

	/**
	 * Get eoddVoyage
	 */
	@Column(name = "EODD_VOYAGE")
	public String getEoddVoyage() {
		return eoddVoyage;
	}

	/**
	 * Set eoddVoyage
	 */
	public void setEoddVoyage(String eoddVoyage) {
		this.eoddVoyage = eoddVoyage;
		addValidField("eoddVoyage");
	}

	/**
	 * Get eoddCountryOfDestination
	 */
	@Column(name = "EODD_COUNTRY_OF_DESTINATION")
	public String getEoddCountryOfDestination() {
		return eoddCountryOfDestination;
	}

	/**
	 * Set eoddCountryOfDestination
	 */
	public void setEoddCountryOfDestination(String eoddCountryOfDestination) {
		this.eoddCountryOfDestination = eoddCountryOfDestination;
		addValidField("eoddCountryOfDestination");
	}

	/**
	 * Get eoddPreManifesState
	 */
	@Column(name = "EODD_PRE_MANIFES_STATE")
	public String getEoddPreManifesState() {
		return eoddPreManifesState;
	}

	/**
	 * Set eoddPreManifesState
	 */
	public void setEoddPreManifesState(String eoddPreManifesState) {
		this.eoddPreManifesState = eoddPreManifesState;
		addValidField("eoddPreManifesState");
	}

	/**
	 * Get eoddNoticeTaxDate
	 */
	@Column(name = "EODD_NOTICE_TAX_DATE")
	public Date getEoddNoticeTaxDate() {
		return eoddNoticeTaxDate;
	}

	/**
	 * Set eoddNoticeTaxDate
	 */
	public void setEoddNoticeTaxDate(Date eoddNoticeTaxDate) {
		this.eoddNoticeTaxDate = eoddNoticeTaxDate;
		addValidField("eoddNoticeTaxDate");
	}

	/**
	 * Get eoddInspectionDate
	 */
	@Column(name = "EODD_INSPECTION_DATE")
	public Date getEoddInspectionDate() {
		return eoddInspectionDate;
	}

	/**
	 * Set eoddInspectionDate
	 */
	public void setEoddInspectionDate(Date eoddInspectionDate) {
		this.eoddInspectionDate = eoddInspectionDate;
		addValidField("eoddInspectionDate");
	}

	/**
	 * Get eoddSingleDeliveryDate
	 */
	@Column(name = "EODD_SINGLE_DELIVERY_DATE")
	public Date getEoddSingleDeliveryDate() {
		return eoddSingleDeliveryDate;
	}

	/**
	 * Set eoddSingleDeliveryDate
	 */
	public void setEoddSingleDeliveryDate(Date eoddSingleDeliveryDate) {
		this.eoddSingleDeliveryDate = eoddSingleDeliveryDate;
		addValidField("eoddSingleDeliveryDate");
	}

	/**
	 * Get eoddFilingDate
	 */
	@Column(name = "EODD_FILING_DATE")
	public Date getEoddFilingDate() {
		return eoddFilingDate;
	}

	/**
	 * Set eoddFilingDate
	 */
	public void setEoddFilingDate(Date eoddFilingDate) {
		this.eoddFilingDate = eoddFilingDate;
		addValidField("eoddFilingDate");
	}

	/**
	 * Get eoddReleaseDate
	 */
	@Column(name = "EODD_RELEASE_DATE")
	public Date getEoddReleaseDate() {
		return eoddReleaseDate;
	}

	/**
	 * Set eoddReleaseDate
	 */
	public void setEoddReleaseDate(Date eoddReleaseDate) {
		this.eoddReleaseDate = eoddReleaseDate;
		addValidField("eoddReleaseDate");
	}

	/**
	 * Get eoddRecordNumber
	 */
	@Column(name = "EODD_RECORD_NUMBER")
	public String getEoddRecordNumber() {
		return eoddRecordNumber;
	}

	/**
	 * Set eoddRecordNumber
	 */
	public void setEoddRecordNumber(String eoddRecordNumber) {
		this.eoddRecordNumber = eoddRecordNumber;
		addValidField("eoddRecordNumber");
	}

	/**
	 * Get eoddBusinessUnitName
	 */
	@Column(name = "EODD_BUSINESS_UNIT_NAME")
	public String getEoddBusinessUnitName() {
		return eoddBusinessUnitName;
	}

	/**
	 * Set eoddBusinessUnitName
	 */
	public void setEoddBusinessUnitName(String eoddBusinessUnitName) {
		this.eoddBusinessUnitName = eoddBusinessUnitName;
		addValidField("eoddBusinessUnitName");
	}

	/**
	 * Get eoddBusinessUnitsCode
	 */
	@Column(name = "EODD_BUSINESS_UNITS_CODE")
	public String getEoddBusinessUnitsCode() {
		return eoddBusinessUnitsCode;
	}

	/**
	 * Set eoddBusinessUnitsCode
	 */
	public void setEoddBusinessUnitsCode(String eoddBusinessUnitsCode) {
		this.eoddBusinessUnitsCode = eoddBusinessUnitsCode;
		addValidField("eoddBusinessUnitsCode");
	}

	/**
	 * Get eoddShipperUnitName
	 */
	@Column(name = "EODD_SHIPPER_UNIT_NAME")
	public String getEoddShipperUnitName() {
		return eoddShipperUnitName;
	}

	/**
	 * Set eoddShipperUnitName
	 */
	public void setEoddShipperUnitName(String eoddShipperUnitName) {
		this.eoddShipperUnitName = eoddShipperUnitName;
		addValidField("eoddShipperUnitName");
	}

	/**
	 * Get eoddShipperUnitCode
	 */
	@Column(name = "EODD_SHIPPER_UNIT_CODE")
	public String getEoddShipperUnitCode() {
		return eoddShipperUnitCode;
	}

	/**
	 * Set eoddShipperUnitCode
	 */
	public void setEoddShipperUnitCode(String eoddShipperUnitCode) {
		this.eoddShipperUnitCode = eoddShipperUnitCode;
		addValidField("eoddShipperUnitCode");
	}

	/**
	 * Get eoddEscoCode
	 */
	@Column(name = "EODD_ESCO_CODE")
	public String getEoddEscoCode() {
		return eoddEscoCode;
	}

	/**
	 * Set eoddEscoCode
	 */
	public void setEoddEscoCode(String eoddEscoCode) {
		this.eoddEscoCode = eoddEscoCode;
		addValidField("eoddEscoCode");
	}

	/**
	 * Get eoddEscoNameCn
	 */
	@Column(name = "EODD_ESCO_NAME_CN")
	public String getEoddEscoNameCn() {
		return eoddEscoNameCn;
	}

	/**
	 * Set eoddEscoNameCn
	 */
	public void setEoddEscoNameCn(String eoddEscoNameCn) {
		this.eoddEscoNameCn = eoddEscoNameCn;
		addValidField("eoddEscoNameCn");
	}

	/**
	 * Get eoddEsdeDepartmentCode
	 */
	@Column(name = "EODD_ESDE_DEPARTMENT_CODE")
	public String getEoddEsdeDepartmentCode() {
		return eoddEsdeDepartmentCode;
	}

	/**
	 * Set eoddEsdeDepartmentCode
	 */
	public void setEoddEsdeDepartmentCode(String eoddEsdeDepartmentCode) {
		this.eoddEsdeDepartmentCode = eoddEsdeDepartmentCode;
		addValidField("eoddEsdeDepartmentCode");
	}

	/**
	 * Get eoddEsdeDepartmentName
	 */
	@Column(name = "EODD_ESDE_DEPARTMENT_NAME")
	public String getEoddEsdeDepartmentName() {
		return eoddEsdeDepartmentName;
	}

	/**
	 * Set eoddEsdeDepartmentName
	 */
	public void setEoddEsdeDepartmentName(String eoddEsdeDepartmentName) {
		this.eoddEsdeDepartmentName = eoddEsdeDepartmentName;
		addValidField("eoddEsdeDepartmentName");
	}

	/**
	 * Get eoddEsusUserNameCn
	 */
	@Column(name = "EODD_ESUS_USER_NAME_CN")
	public String getEoddEsusUserNameCn() {
		return eoddEsusUserNameCn;
	}

	/**
	 * Set eoddEsusUserNameCn
	 */
	public void setEoddEsusUserNameCn(String eoddEsusUserNameCn) {
		this.eoddEsusUserNameCn = eoddEsusUserNameCn;
		addValidField("eoddEsusUserNameCn");
	}

	/**
	 * Get eoddRetoType
	 */
	@Column(name = "EODD_RETO_TYPE")
	public Long getEoddRetoType() {
		return eoddRetoType;
	}

	/**
	 * Set eoddRetoType
	 */
	public void setEoddRetoType(Long eoddRetoType) {
		this.eoddRetoType = eoddRetoType;
		addValidField("eoddRetoType");
	}

	/**
	 * Get eoddIsDutyfree
	 */
	@Column(name = "EODD_IS_DUTYFREE")
	public Long getEoddIsDutyfree() {
		return eoddIsDutyfree;
	}

	/**
	 * Set eoddIsDutyfree
	 */
	public void setEoddIsDutyfree(Long eoddIsDutyfree) {
		this.eoddIsDutyfree = eoddIsDutyfree;
		addValidField("eoddIsDutyfree");
	}

	/**
	 * Get eoddDeclareCustom
	 */
	@Column(name = "EODD_DECLARE_CUSTOM")
	public String getEoddDeclareCustom() {
		return eoddDeclareCustom;
	}

	/**
	 * Set eoddDeclareCustom
	 */
	public void setEoddDeclareCustom(String eoddDeclareCustom) {
		this.eoddDeclareCustom = eoddDeclareCustom;
		addValidField("eoddDeclareCustom");
	}

	/**
	 * Get eoddLicenseNo
	 */
	@Column(name = "EODD_LICENSE_NO")
	public String getEoddLicenseNo() {
		return eoddLicenseNo;
	}

	/**
	 * Set eoddLicenseNo
	 */
	public void setEoddLicenseNo(String eoddLicenseNo) {
		this.eoddLicenseNo = eoddLicenseNo;
		addValidField("eoddLicenseNo");
	}

	/**
	 * Get eoddCutMode
	 */
	@Column(name = "EODD_CUT_MODE")
	public String getEoddCutMode() {
		return eoddCutMode;
	}

	/**
	 * Set eoddCutMode
	 */
	public void setEoddCutMode(String eoddCutMode) {
		this.eoddCutMode = eoddCutMode;
		addValidField("eoddCutMode");
	}

	/**
	 * Get eoddApprNo
	 */
	@Column(name = "EODD_APPR_NO")
	public Long getEoddApprNo() {
		return eoddApprNo;
	}

	/**
	 * Set eoddApprNo
	 */
	public void setEoddApprNo(Long eoddApprNo) {
		this.eoddApprNo = eoddApprNo;
		addValidField("eoddApprNo");
	}

	/**
	 * Get eoddFee
	 */
	@Column(name = "EODD_FEE")
	public Double getEoddFee() {
		return eoddFee;
	}

	/**
	 * Set eoddFee
	 */
	public void setEoddFee(Double eoddFee) {
		this.eoddFee = eoddFee;
		addValidField("eoddFee");
	}

	/**
	 * Get eoddInsurFee
	 */
	@Column(name = "EODD_INSUR_FEE")
	public Double getEoddInsurFee() {
		return eoddInsurFee;
	}

	/**
	 * Set eoddInsurFee
	 */
	public void setEoddInsurFee(Double eoddInsurFee) {
		this.eoddInsurFee = eoddInsurFee;
		addValidField("eoddInsurFee");
	}

	/**
	 * Get eoddOtherFee
	 */
	@Column(name = "EODD_OTHER_FEE")
	public Double getEoddOtherFee() {
		return eoddOtherFee;
	}

	/**
	 * Set eoddOtherFee
	 */
	public void setEoddOtherFee(Double eoddOtherFee) {
		this.eoddOtherFee = eoddOtherFee;
		addValidField("eoddOtherFee");
	}

	/**
	 * Get eoddAssBillNo
	 */
	@Column(name = "EODD_ASS_BILL_NO")
	public String getEoddAssBillNo() {
		return eoddAssBillNo;
	}

	/**
	 * Set eoddAssBillNo
	 */
	public void setEoddAssBillNo(String eoddAssBillNo) {
		this.eoddAssBillNo = eoddAssBillNo;
		addValidField("eoddAssBillNo");
	}

	/**
	 * Get eoddAssEmsNo
	 */
	@Column(name = "EODD_ASS_EMS_NO")
	public String getEoddAssEmsNo() {
		return eoddAssEmsNo;
	}

	/**
	 * Set eoddAssEmsNo
	 */
	public void setEoddAssEmsNo(String eoddAssEmsNo) {
		this.eoddAssEmsNo = eoddAssEmsNo;
		addValidField("eoddAssEmsNo");
	}

	/**
	 * Get eoddEnterpriseNo
	 */
	@Column(name = "EODD_ENTERPRISE_NO")
	public String getEoddEnterpriseNo() {
		return eoddEnterpriseNo;
	}

	/**
	 * Set eoddEnterpriseNo
	 */
	public void setEoddEnterpriseNo(String eoddEnterpriseNo) {
		this.eoddEnterpriseNo = eoddEnterpriseNo;
		addValidField("eoddEnterpriseNo");
	}

	/**
	 * Get eoddWorkNo
	 */
	@Column(name = "EODD_WORK_NO")
	public String getEoddWorkNo() {
		return eoddWorkNo;
	}

	/**
	 * Set eoddWorkNo
	 */
	public void setEoddWorkNo(String eoddWorkNo) {
		this.eoddWorkNo = eoddWorkNo;
		addValidField("eoddWorkNo");
	}

	/**
	 * Get eoddMark
	 */
	@Column(name = "EODD_MARK")
	public String getEoddMark() {
		return eoddMark;
	}

	/**
	 * Set eoddMark
	 */
	public void setEoddMark(String eoddMark) {
		this.eoddMark = eoddMark;
		addValidField("eoddMark");
	}

	/**
	 * Get eoddContainerNo
	 */
	@Column(name = "EODD_CONTAINER_NO")
	public String getEoddContainerNo() {
		return eoddContainerNo;
	}

	/**
	 * Set eoddContainerNo
	 */
	public void setEoddContainerNo(String eoddContainerNo) {
		this.eoddContainerNo = eoddContainerNo;
		addValidField("eoddContainerNo");
	}

	/**
	 * Get eoddFileNo
	 */
	@Column(name = "EODD_FILE_NO")
	public String getEoddFileNo() {
		return eoddFileNo;
	}

	/**
	 * Set eoddFileNo
	 */
	public void setEoddFileNo(String eoddFileNo) {
		this.eoddFileNo = eoddFileNo;
		addValidField("eoddFileNo");
	}

	/**
	 * Get eoddPackageType
	 */
	@Column(name = "EODD_PACKAGE_TYPE")
	public String getEoddPackageType() {
		return eoddPackageType;
	}

	/**
	 * Set eoddPackageType
	 */
	public void setEoddPackageType(String eoddPackageType) {
		this.eoddPackageType = eoddPackageType;
		addValidField("eoddPackageType");
	}

	/**
	 * Get eoddBusinessUnitEbcuId
	 */
	@Column(name = "EODD_BUSINESS_UNIT_EBCU_ID")
	public Long getEoddBusinessUnitEbcuId() {
		return eoddBusinessUnitEbcuId;
	}

	/**
	 * Set eoddBusinessUnitEbcuId
	 */
	public void setEoddBusinessUnitEbcuId(Long eoddBusinessUnitEbcuId) {
		this.eoddBusinessUnitEbcuId = eoddBusinessUnitEbcuId;
		addValidField("eoddBusinessUnitEbcuId");
	}

	/**
	 * Get eoddShipperUnitEbcuId
	 */
	@Column(name = "EODD_SHIPPER_UNIT_EBCU_ID")
	public Long getEoddShipperUnitEbcuId() {
		return eoddShipperUnitEbcuId;
	}

	/**
	 * Set eoddShipperUnitEbcuId
	 */
	public void setEoddShipperUnitEbcuId(Long eoddShipperUnitEbcuId) {
		this.eoddShipperUnitEbcuId = eoddShipperUnitEbcuId;
		addValidField("eoddShipperUnitEbcuId");
	}

	/**
	 * Get eodmEbmaNameEn
	 */
	@Column(name = "EODM_EBMA_NAME_EN")
	public String getEodmEbmaNameEn() {
		return eodmEbmaNameEn;
	}

	/**
	 * Set eodmEbmaNameEn
	 */
	public void setEodmEbmaNameEn(String eodmEbmaNameEn) {
		this.eodmEbmaNameEn = eodmEbmaNameEn;
		addValidField("eodmEbmaNameEn");
	}

	/**
	 * Get eoddTaskConfirm
	 */
	@Column(name = "EODD_TASK_CONFIRM")
	public Long getEoddTaskConfirm() {
		return eoddTaskConfirm;
	}

	/**
	 * Set eoddTaskConfirm
	 */
	public void setEoddTaskConfirm(Long eoddTaskConfirm) {
		this.eoddTaskConfirm = eoddTaskConfirm;
		addValidField("eoddTaskConfirm");
	}

	/**
	 * Get eoddTaskConfirmUser
	 */
	@Column(name = "EODD_TASK_CONFIRM_USER")
	public String getEoddTaskConfirmUser() {
		return eoddTaskConfirmUser;
	}

	/**
	 * Set eoddTaskConfirmUser
	 */
	public void setEoddTaskConfirmUser(String eoddTaskConfirmUser) {
		this.eoddTaskConfirmUser = eoddTaskConfirmUser;
		addValidField("eoddTaskConfirmUser");
	}

	/**
	 * Get eoddTaskConfirmDate
	 */
	@Column(name = "EODD_TASK_CONFIRM_DATE")
	public Date getEoddTaskConfirmDate() {
		return eoddTaskConfirmDate;
	}

	/**
	 * Set eoddTaskConfirmDate
	 */
	public void setEoddTaskConfirmDate(Date eoddTaskConfirmDate) {
		this.eoddTaskConfirmDate = eoddTaskConfirmDate;
		addValidField("eoddTaskConfirmDate");
	}

	/**
	 * Get eoddApproveDate
	 */
	@Column(name = "EODD_APPROVE_DATE")
	public Date getEoddApproveDate() {
		return eoddApproveDate;
	}

	/**
	 * Set eoddApproveDate
	 */
	public void setEoddApproveDate(Date eoddApproveDate) {
		this.eoddApproveDate = eoddApproveDate;
		addValidField("eoddApproveDate");
	}

	/**
	 * Get eoddShippingArriveDate
	 */
	@Column(name = "EODD_SHIPPING_ARRIVE_DATE")
	public Date getEoddShippingArriveDate() {
		return eoddShippingArriveDate;
	}

	/**
	 * Set eoddShippingArriveDate
	 */
	public void setEoddShippingArriveDate(Date eoddShippingArriveDate) {
		this.eoddShippingArriveDate = eoddShippingArriveDate;
		addValidField("eoddShippingArriveDate");
	}

	/**
	 * Get eoddShippingBillDate
	 */
	@Column(name = "EODD_SHIPPING_BILL_DATE")
	public Date getEoddShippingBillDate() {
		return eoddShippingBillDate;
	}

	/**
	 * Set eoddShippingBillDate
	 */
	public void setEoddShippingBillDate(Date eoddShippingBillDate) {
		this.eoddShippingBillDate = eoddShippingBillDate;
		addValidField("eoddShippingBillDate");
	}

	/**
	 * Get eoddConcludeDate
	 */
	@Column(name = "EODD_CONCLUDE_DATE")
	public Date getEoddConcludeDate() {
		return eoddConcludeDate;
	}

	/**
	 * Set eoddConcludeDate
	 */
	public void setEoddConcludeDate(Date eoddConcludeDate) {
		this.eoddConcludeDate = eoddConcludeDate;
		addValidField("eoddConcludeDate");
	}

	/**
	 * Get eoddCheckingstrDate
	 */
	@Column(name = "EODD_CHECKINGSTR_DATE")
	public Date getEoddCheckingstrDate() {
		return eoddCheckingstrDate;
	}

	/**
	 * Set eoddCheckingstrDate
	 */
	public void setEoddCheckingstrDate(Date eoddCheckingstrDate) {
		this.eoddCheckingstrDate = eoddCheckingstrDate;
		addValidField("eoddCheckingstrDate");
	}

	/**
	 * Get eoddCheckingendDate
	 */
	@Column(name = "EODD_CHECKINGEND_DATE")
	public Date getEoddCheckingendDate() {
		return eoddCheckingendDate;
	}

	/**
	 * Set eoddCheckingendDate
	 */
	public void setEoddCheckingendDate(Date eoddCheckingendDate) {
		this.eoddCheckingendDate = eoddCheckingendDate;
		addValidField("eoddCheckingendDate");
	}

	/**
	 * Get eoddTallyDate
	 */
	@Column(name = "EODD_TALLY_DATE")
	public Date getEoddTallyDate() {
		return eoddTallyDate;
	}

	/**
	 * Set eoddTallyDate
	 */
	public void setEoddTallyDate(Date eoddTallyDate) {
		this.eoddTallyDate = eoddTallyDate;
		addValidField("eoddTallyDate");
	}

	/**
	 * Get eoddTaskRefuseUser
	 */
	@Column(name = "EODD_TASK_REFUSE_USER")
	public String getEoddTaskRefuseUser() {
		return eoddTaskRefuseUser;
	}

	/**
	 * Set eoddTaskRefuseUser
	 */
	public void setEoddTaskRefuseUser(String eoddTaskRefuseUser) {
		this.eoddTaskRefuseUser = eoddTaskRefuseUser;
		addValidField("eoddTaskRefuseUser");
	}

	/**
	 * Get eoddTaskRefuseDate
	 */
	@Column(name = "EODD_TASK_REFUSE_DATE")
	public Date getEoddTaskRefuseDate() {
		return eoddTaskRefuseDate;
	}

	/**
	 * Set eoddTaskRefuseDate
	 */
	public void setEoddTaskRefuseDate(Date eoddTaskRefuseDate) {
		this.eoddTaskRefuseDate = eoddTaskRefuseDate;
		addValidField("eoddTaskRefuseDate");
	}

	/**
	 * Get eoddFeeType
	 */
	@Column(name = "EODD_FEE_TYPE")
	public String getEoddFeeType() {
		return eoddFeeType;
	}

	/**
	 * Set eoddFeeType
	 */
	public void setEoddFeeType(String eoddFeeType) {
		this.eoddFeeType = eoddFeeType;
		addValidField("eoddFeeType");
	}

	/**
	 * Get eoddFeeCurrencySystem
	 */
	@Column(name = "EODD_FEE_CURRENCY_SYSTEM")
	public String getEoddFeeCurrencySystem() {
		return eoddFeeCurrencySystem;
	}

	/**
	 * Set eoddFeeCurrencySystem
	 */
	public void setEoddFeeCurrencySystem(String eoddFeeCurrencySystem) {
		this.eoddFeeCurrencySystem = eoddFeeCurrencySystem;
		addValidField("eoddFeeCurrencySystem");
	}

	/**
	 * Get eoddInsurFeeType
	 */
	@Column(name = "EODD_INSUR_FEE_TYPE")
	public String getEoddInsurFeeType() {
		return eoddInsurFeeType;
	}

	/**
	 * Set eoddInsurFeeType
	 */
	public void setEoddInsurFeeType(String eoddInsurFeeType) {
		this.eoddInsurFeeType = eoddInsurFeeType;
		addValidField("eoddInsurFeeType");
	}

	/**
	 * Get eoddInsurCurrencySystem
	 */
	@Column(name = "EODD_INSUR_CURRENCY_SYSTEM")
	public String getEoddInsurCurrencySystem() {
		return eoddInsurCurrencySystem;
	}

	/**
	 * Set eoddInsurCurrencySystem
	 */
	public void setEoddInsurCurrencySystem(String eoddInsurCurrencySystem) {
		this.eoddInsurCurrencySystem = eoddInsurCurrencySystem;
		addValidField("eoddInsurCurrencySystem");
	}

	/**
	 * Get eoddOtherFeeType
	 */
	@Column(name = "EODD_OTHER_FEE_TYPE")
	public String getEoddOtherFeeType() {
		return eoddOtherFeeType;
	}

	/**
	 * Set eoddOtherFeeType
	 */
	public void setEoddOtherFeeType(String eoddOtherFeeType) {
		this.eoddOtherFeeType = eoddOtherFeeType;
		addValidField("eoddOtherFeeType");
	}

	/**
	 * Get eoddOtherCurrencySystem
	 */
	@Column(name = "EODD_OTHER_CURRENCY_SYSTEM")
	public String getEoddOtherCurrencySystem() {
		return eoddOtherCurrencySystem;
	}

	/**
	 * Set eoddOtherCurrencySystem
	 */
	public void setEoddOtherCurrencySystem(String eoddOtherCurrencySystem) {
		this.eoddOtherCurrencySystem = eoddOtherCurrencySystem;
		addValidField("eoddOtherCurrencySystem");
	}

	/**
	 * Get eoddDepartureProt
	 */
	@Column(name = "EODD_DEPARTURE_PROT")
	public String getEoddDepartureProt() {
		return eoddDepartureProt;
	}

	/**
	 * Set eoddDepartureProt
	 */
	public void setEoddDepartureProt(String eoddDepartureProt) {
		this.eoddDepartureProt = eoddDepartureProt;
		addValidField("eoddDepartureProt");
	}

	/**
	 * Get eoddOverseasConsigneeCode
	 */
	@Column(name = "EODD_OVERSEAS_CONSIGNEE_CODE")
	public String getEoddOverseasConsigneeCode() {
		return eoddOverseasConsigneeCode;
	}

	/**
	 * Set eoddOverseasConsigneeCode
	 */
	public void setEoddOverseasConsigneeCode(String eoddOverseasConsigneeCode) {
		this.eoddOverseasConsigneeCode = eoddOverseasConsigneeCode;
		addValidField("eoddOverseasConsigneeCode");
	}

	/**
	 * Get eoddOverseasConsigneeName
	 */
	@Column(name = "EODD_OVERSEAS_CONSIGNEE_NAME")
	public String getEoddOverseasConsigneeName() {
		return eoddOverseasConsigneeName;
	}

	/**
	 * Set eoddOverseasConsigneeName
	 */
	public void setEoddOverseasConsigneeName(String eoddOverseasConsigneeName) {
		this.eoddOverseasConsigneeName = eoddOverseasConsigneeName;
		addValidField("eoddOverseasConsigneeName");
	}

	/**
	 * Get eoddMarkNo
	 */
	@Column(name = "EODD_MARK_NO")
	public String getEoddMarkNo() {
		return eoddMarkNo;
	}

	/**
	 * Set eoddMarkNo
	 */
	public void setEoddMarkNo(String eoddMarkNo) {
		this.eoddMarkNo = eoddMarkNo;
		addValidField("eoddMarkNo");
	}

	/**
	 * Get eoddRequiredTime
	 */
	@Column(name = "EODD_REQUIRED_TIME")
	public Date getEoddRequiredTime() {
		return eoddRequiredTime;
	}

	/**
	 * Set eoddRequiredTime
	 */
	public void setEoddRequiredTime(Date eoddRequiredTime) {
		this.eoddRequiredTime = eoddRequiredTime;
		addValidField("eoddRequiredTime");
	}

	
}
