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
 * Model class for EdiBooking
 */
@Entity
@Table(name = "EDI_BOOKING")
public class EdiBookingModel extends BaseModel implements OperationLog {

	//edboId
	private Long edboId;
	//edboEorbId
	private Long edboEorbId;
	//edboEoorSinoNo
	private String edboEoorSinoNo;
	//edboOrgCode
	private String edboOrgCode;
	//edboScCode
	private String edboScCode;
	//edboRcCode
	private String edboRcCode;
	//edboFilename
	private String edboFilename;
	//edboFileType
	private String edboFileType;
	//edboFlag
	private String edboFlag;
	//edboDisposeTime
	private Date edboDisposeTime;
	//edboEbpjFCode
	private Long edboEbpjFCode;
	//edboEscoCode
	private String edboEscoCode;
	//edboEscoNameCn
	private String edboEscoNameCn;
	//edboEsdeDepartmentCode
	private String edboEsdeDepartmentCode;
	//edboEsdeDepartmentName
	private String edboEsdeDepartmentName;
	//edboEsusUserNameCn
	private String edboEsusUserNameCn;
	//edboRetoType
	private Long edboRetoType;
	//edboOpDepartmentCode
	private String edboOpDepartmentCode;
	//edboOpDepartmentName
	private String edboOpDepartmentName;
	//edboOpUserNameCn
	private String edboOpUserNameCn;
	//edboBookingNo
	private String edboBookingNo;
	//edboBulkBillNo
	private String edboBulkBillNo;
	//edboFreightClauseCode
	private String edboFreightClauseCode;
	//edboFreightClauseName
	private String edboFreightClauseName;
	//edboBookingPartyCode
	private String edboBookingPartyCode;
	//edboBookingPartyName
	private String edboBookingPartyName;
	//edboIssuePartyCode
	private String edboIssuePartyCode;
	//edboIssueParty
	private String edboIssueParty;
	//edboApplicantId
	private String edboApplicantId;
	//edboApplicant
	private String edboApplicant;
	//edboFobBkPartyId
	private String edboFobBkPartyId;
	//edboFobBkParty
	private String edboFobBkParty;
	//edboTranshipmentFlag
	private String edboTranshipmentFlag;
	//edboBatchFlag
	private String edboBatchFlag;
	//edboShipmentDate
	private Date edboShipmentDate;
	//edboExpiryDate
	private Date edboExpiryDate;
	//edboQuotationNo
	private String edboQuotationNo;
	//edboChargeType
	private String edboChargeType;
	//edboServiceContractNo
	private String edboServiceContractNo;
	//edboBondNo
	private String edboBondNo;
	//edboSlotCharterFlag
	private String edboSlotCharterFlag;
	//edboAmsCode
	private String edboAmsCode;
	//edboMainBlNo
	private String edboMainBlNo;
	//edboBlViseType
	private String edboBlViseType;
	//edboBlIssuePlaceCode
	private String edboBlIssuePlaceCode;
	//edboBlIssuePlace
	private String edboBlIssuePlace;
	//edboBlIssueDate
	private Date edboBlIssueDate;
	//edboBlCopyNum
	private Integer edboBlCopyNum;
	//edboPrepaidPlaceCode
	private String edboPrepaidPlaceCode;
	//edboPrepaidPlaceName
	private String edboPrepaidPlaceName;
	//edboPayPlaceCode
	private String edboPayPlaceCode;
	//edboPayPlaceName
	private String edboPayPlaceName;
	//edboVesselCall
	private String edboVesselCall;
	//edboVesselName
	private String edboVesselName;
	//edboVoyage
	private String edboVoyage;
	//edboCarrierCode
	private String edboCarrierCode;
	//edboCarrierName
	private String edboCarrierName;
	//edboBlCarrierCode
	private String edboBlCarrierCode;
	//edboBlCarrierName
	private String edboBlCarrierName;
	//edboRequestEtd
	private Date edboRequestEtd;
	//edboTradeId
	private String edboTradeId;
	//edboTrade
	private String edboTrade;
	//edboPreVesselCode
	private String edboPreVesselCode;
	//edboPreVesselName
	private String edboPreVesselName;
	//edboPreVoyage
	private String edboPreVoyage;
	//edboReceiptPlaceCode
	private String edboReceiptPlaceCode;
	//edboReceiptPlaceName
	private String edboReceiptPlaceName;
	//edboLoadPortCode
	private String edboLoadPortCode;
	//edboLoadPortName
	private String edboLoadPortName;
	//edboDischargePortCode
	private String edboDischargePortCode;
	//edboDischargePortName
	private String edboDischargePortName;
	//edboTransferPortCode
	private String edboTransferPortCode;
	//edboTransferPortName
	private String edboTransferPortName;
	//edboDeliveryPlaceCode
	private String edboDeliveryPlaceCode;
	//edboDeliveryPlaceName
	private String edboDeliveryPlaceName;
	//edboFinalDestinationCode
	private String edboFinalDestinationCode;
	//edboFinalDestination
	private String edboFinalDestination;
	//edboDepotCode
	private String edboDepotCode;
	//edboTransferPlaceCode
	private String edboTransferPlaceCode;
	//edboTransferPlaceName
	private String edboTransferPlaceName;
	//edboOptDischargePortCode1
	private String edboOptDischargePortCode1;
	//edboOptDischargePort1
	private String edboOptDischargePort1;
	//edboOptDeliveryPlaceCode
	private String edboOptDeliveryPlaceCode;
	//edboOptDeliveryPlace
	private String edboOptDeliveryPlace;
	//edboSurchargeCode
	private String edboSurchargeCode;
	//edboSurchargeRemark
	private String edboSurchargeRemark;
	//edboRemark
	private String edboRemark;
	//edboCurrency
	private String edboCurrency;
	//edboAmount
	private Double edboAmount;
	//edboShipperCode
	private String edboShipperCode;
	//edboShipper
	private String edboShipper;
	//edboConsigneeCode
	private String edboConsigneeCode;
	//edboConsignee
	private String edboConsignee;
	//edboNotifyCode
	private String edboNotifyCode;
	//edboNotify
	private String edboNotify;
	//edboSecondNotifyCode
	private String edboSecondNotifyCode;
	//edboSecondNotify
	private String edboSecondNotify;
	//edboThirdNotifyCode
	private String edboThirdNotifyCode;
	//edboThirdNotify
	private String edboThirdNotify;
	//edboIntermediateCarrgier
	private String edboIntermediateCarrgier;
	//edboTelInterCarrgier
	private String edboTelInterCarrgier;
	//edboEmailInterCarrgier
	private String edboEmailInterCarrgier;
	//edboFaxInterCarrgier
	private String edboFaxInterCarrgier;
	//edboStreetNumberPoboxDc
	private String edboStreetNumberPoboxDc;
	//edboCityNameDc
	private String edboCityNameDc;
	//edboCountrySubEntityDc
	private String edboCountrySubEntityDc;
	//edboCountrySubEntityNmDc
	private String edboCountrySubEntityNmDc;
	//edboPostcodeDc
	private String edboPostcodeDc;
	//edboCountryCodeDc
	private String edboCountryCodeDc;
	//edboCountryNameDc
	private String edboCountryNameDc;
	//edboSubstr1
	private String edboSubstr1;
	//edboSubstr2
	private String edboSubstr2;
	//edboSubstr3
	private String edboSubstr3;
	//edboSubstr4
	private String edboSubstr4;
	//edboSubstr5
	private String edboSubstr5;
	//edboSubstr6
	private String edboSubstr6;
	//edboSubstr7
	private String edboSubstr7;
	//edboSubstr8
	private String edboSubstr8;
	//edboSubdate1
	private Date edboSubdate1;
	//edboSubdate2
	private Date edboSubdate2;
	//edboSubdate3
	private Date edboSubdate3;
	//edboSubdate4
	private Date edboSubdate4;
	//edboSubnum1
	private Long edboSubnum1;
	//edboSubnum2
	private Long edboSubnum2;
	//edboSubnum3
	private Long edboSubnum3;
	//edboSubnum4
	private Long edboSubnum4;
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
	//edboType
	private String edboType;

	/**
	 * Get edboId
	 */
	@Column(name = "EDBO_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEdboId() {
		return edboId;
	}

	/**
	 * Set edboId
	 */
	public void setEdboId(Long edboId) {
		this.edboId = edboId;
		addValidField("edboId");
	}

	/**
	 * Get edboEorbId
	 */
	@Column(name = "EDBO_EORB_ID")
	public Long getEdboEorbId() {
		return edboEorbId;
	}

	/**
	 * Set edboEorbId
	 */
	public void setEdboEorbId(Long edboEorbId) {
		this.edboEorbId = edboEorbId;
		addValidField("edboEorbId");
	}

	/**
	 * Get edboEoorSinoNo
	 */
	@Column(name = "EDBO_EOOR_SINO_NO")
	public String getEdboEoorSinoNo() {
		return edboEoorSinoNo;
	}

	/**
	 * Set edboEoorSinoNo
	 */
	public void setEdboEoorSinoNo(String edboEoorSinoNo) {
		this.edboEoorSinoNo = edboEoorSinoNo;
		addValidField("edboEoorSinoNo");
	}

	/**
	 * Get edboOrgCode
	 */
	@Column(name = "EDBO_ORG_CODE")
	public String getEdboOrgCode() {
		return edboOrgCode;
	}

	/**
	 * Set edboOrgCode
	 */
	public void setEdboOrgCode(String edboOrgCode) {
		this.edboOrgCode = edboOrgCode;
		addValidField("edboOrgCode");
	}

	/**
	 * Get edboScCode
	 */
	@Column(name = "EDBO_SC_CODE")
	public String getEdboScCode() {
		return edboScCode;
	}

	/**
	 * Set edboScCode
	 */
	public void setEdboScCode(String edboScCode) {
		this.edboScCode = edboScCode;
		addValidField("edboScCode");
	}

	/**
	 * Get edboRcCode
	 */
	@Column(name = "EDBO_RC_CODE")
	public String getEdboRcCode() {
		return edboRcCode;
	}

	/**
	 * Set edboRcCode
	 */
	public void setEdboRcCode(String edboRcCode) {
		this.edboRcCode = edboRcCode;
		addValidField("edboRcCode");
	}

	/**
	 * Get edboFilename
	 */
	@Column(name = "EDBO_FILENAME")
	public String getEdboFilename() {
		return edboFilename;
	}

	/**
	 * Set edboFilename
	 */
	public void setEdboFilename(String edboFilename) {
		this.edboFilename = edboFilename;
		addValidField("edboFilename");
	}

	/**
	 * Get edboFileType
	 */
	@Column(name = "EDBO_FILE_TYPE")
	public String getEdboFileType() {
		return edboFileType;
	}

	/**
	 * Set edboFileType
	 */
	public void setEdboFileType(String edboFileType) {
		this.edboFileType = edboFileType;
		addValidField("edboFileType");
	}

	/**
	 * Get edboFlag
	 */
	@Column(name = "EDBO_FLAG")
	public String getEdboFlag() {
		return edboFlag;
	}

	/**
	 * Set edboFlag
	 */
	public void setEdboFlag(String edboFlag) {
		this.edboFlag = edboFlag;
		addValidField("edboFlag");
	}

	/**
	 * Get edboDisposeTime
	 */
	@Column(name = "EDBO_DISPOSE_TIME")
	public Date getEdboDisposeTime() {
		return edboDisposeTime;
	}

	/**
	 * Set edboDisposeTime
	 */
	public void setEdboDisposeTime(Date edboDisposeTime) {
		this.edboDisposeTime = edboDisposeTime;
		addValidField("edboDisposeTime");
	}

	/**
	 * Get edboEbpjFCode
	 */
	@Column(name = "EDBO_EBPJ_F_CODE")
	public Long getEdboEbpjFCode() {
		return edboEbpjFCode;
	}

	/**
	 * Set edboEbpjFCode
	 */
	public void setEdboEbpjFCode(Long edboEbpjFCode) {
		this.edboEbpjFCode = edboEbpjFCode;
		addValidField("edboEbpjFCode");
	}

	/**
	 * Get edboEscoCode
	 */
	@Column(name = "EDBO_ESCO_CODE")
	public String getEdboEscoCode() {
		return edboEscoCode;
	}

	/**
	 * Set edboEscoCode
	 */
	public void setEdboEscoCode(String edboEscoCode) {
		this.edboEscoCode = edboEscoCode;
		addValidField("edboEscoCode");
	}

	/**
	 * Get edboEscoNameCn
	 */
	@Column(name = "EDBO_ESCO_NAME_CN")
	public String getEdboEscoNameCn() {
		return edboEscoNameCn;
	}

	/**
	 * Set edboEscoNameCn
	 */
	public void setEdboEscoNameCn(String edboEscoNameCn) {
		this.edboEscoNameCn = edboEscoNameCn;
		addValidField("edboEscoNameCn");
	}

	/**
	 * Get edboEsdeDepartmentCode
	 */
	@Column(name = "EDBO_ESDE_DEPARTMENT_CODE")
	public String getEdboEsdeDepartmentCode() {
		return edboEsdeDepartmentCode;
	}

	/**
	 * Set edboEsdeDepartmentCode
	 */
	public void setEdboEsdeDepartmentCode(String edboEsdeDepartmentCode) {
		this.edboEsdeDepartmentCode = edboEsdeDepartmentCode;
		addValidField("edboEsdeDepartmentCode");
	}

	/**
	 * Get edboEsdeDepartmentName
	 */
	@Column(name = "EDBO_ESDE_DEPARTMENT_NAME")
	public String getEdboEsdeDepartmentName() {
		return edboEsdeDepartmentName;
	}

	/**
	 * Set edboEsdeDepartmentName
	 */
	public void setEdboEsdeDepartmentName(String edboEsdeDepartmentName) {
		this.edboEsdeDepartmentName = edboEsdeDepartmentName;
		addValidField("edboEsdeDepartmentName");
	}

	/**
	 * Get edboEsusUserNameCn
	 */
	@Column(name = "EDBO_ESUS_USER_NAME_CN")
	public String getEdboEsusUserNameCn() {
		return edboEsusUserNameCn;
	}

	/**
	 * Set edboEsusUserNameCn
	 */
	public void setEdboEsusUserNameCn(String edboEsusUserNameCn) {
		this.edboEsusUserNameCn = edboEsusUserNameCn;
		addValidField("edboEsusUserNameCn");
	}

	/**
	 * Get edboRetoType
	 */
	@Column(name = "EDBO_RETO_TYPE")
	public Long getEdboRetoType() {
		return edboRetoType;
	}

	/**
	 * Set edboRetoType
	 */
	public void setEdboRetoType(Long edboRetoType) {
		this.edboRetoType = edboRetoType;
		addValidField("edboRetoType");
	}

	/**
	 * Get edboOpDepartmentCode
	 */
	@Column(name = "EDBO_OP_DEPARTMENT_CODE")
	public String getEdboOpDepartmentCode() {
		return edboOpDepartmentCode;
	}

	/**
	 * Set edboOpDepartmentCode
	 */
	public void setEdboOpDepartmentCode(String edboOpDepartmentCode) {
		this.edboOpDepartmentCode = edboOpDepartmentCode;
		addValidField("edboOpDepartmentCode");
	}

	/**
	 * Get edboOpDepartmentName
	 */
	@Column(name = "EDBO_OP_DEPARTMENT_NAME")
	public String getEdboOpDepartmentName() {
		return edboOpDepartmentName;
	}

	/**
	 * Set edboOpDepartmentName
	 */
	public void setEdboOpDepartmentName(String edboOpDepartmentName) {
		this.edboOpDepartmentName = edboOpDepartmentName;
		addValidField("edboOpDepartmentName");
	}

	/**
	 * Get edboOpUserNameCn
	 */
	@Column(name = "EDBO_OP_USER_NAME_CN")
	public String getEdboOpUserNameCn() {
		return edboOpUserNameCn;
	}

	/**
	 * Set edboOpUserNameCn
	 */
	public void setEdboOpUserNameCn(String edboOpUserNameCn) {
		this.edboOpUserNameCn = edboOpUserNameCn;
		addValidField("edboOpUserNameCn");
	}

	/**
	 * Get edboBookingNo
	 */
	@Column(name = "EDBO_BOOKING_NO")
	public String getEdboBookingNo() {
		return edboBookingNo;
	}

	/**
	 * Set edboBookingNo
	 */
	public void setEdboBookingNo(String edboBookingNo) {
		this.edboBookingNo = edboBookingNo;
		addValidField("edboBookingNo");
	}

	/**
	 * Get edboBulkBillNo
	 */
	@Column(name = "EDBO_BULK_BILL_NO")
	public String getEdboBulkBillNo() {
		return edboBulkBillNo;
	}

	/**
	 * Set edboBulkBillNo
	 */
	public void setEdboBulkBillNo(String edboBulkBillNo) {
		this.edboBulkBillNo = edboBulkBillNo;
		addValidField("edboBulkBillNo");
	}

	/**
	 * Get edboFreightClauseCode
	 */
	@Column(name = "EDBO_FREIGHT_CLAUSE_CODE")
	public String getEdboFreightClauseCode() {
		return edboFreightClauseCode;
	}

	/**
	 * Set edboFreightClauseCode
	 */
	public void setEdboFreightClauseCode(String edboFreightClauseCode) {
		this.edboFreightClauseCode = edboFreightClauseCode;
		addValidField("edboFreightClauseCode");
	}

	/**
	 * Get edboFreightClauseName
	 */
	@Column(name = "EDBO_FREIGHT_CLAUSE_NAME")
	public String getEdboFreightClauseName() {
		return edboFreightClauseName;
	}

	/**
	 * Set edboFreightClauseName
	 */
	public void setEdboFreightClauseName(String edboFreightClauseName) {
		this.edboFreightClauseName = edboFreightClauseName;
		addValidField("edboFreightClauseName");
	}

	/**
	 * Get edboBookingPartyCode
	 */
	@Column(name = "EDBO_BOOKING_PARTY_CODE")
	public String getEdboBookingPartyCode() {
		return edboBookingPartyCode;
	}

	/**
	 * Set edboBookingPartyCode
	 */
	public void setEdboBookingPartyCode(String edboBookingPartyCode) {
		this.edboBookingPartyCode = edboBookingPartyCode;
		addValidField("edboBookingPartyCode");
	}

	/**
	 * Get edboBookingPartyName
	 */
	@Column(name = "EDBO_BOOKING_PARTY_NAME")
	public String getEdboBookingPartyName() {
		return edboBookingPartyName;
	}

	/**
	 * Set edboBookingPartyName
	 */
	public void setEdboBookingPartyName(String edboBookingPartyName) {
		this.edboBookingPartyName = edboBookingPartyName;
		addValidField("edboBookingPartyName");
	}

	/**
	 * Get edboIssuePartyCode
	 */
	@Column(name = "EDBO_ISSUE_PARTY_CODE")
	public String getEdboIssuePartyCode() {
		return edboIssuePartyCode;
	}

	/**
	 * Set edboIssuePartyCode
	 */
	public void setEdboIssuePartyCode(String edboIssuePartyCode) {
		this.edboIssuePartyCode = edboIssuePartyCode;
		addValidField("edboIssuePartyCode");
	}

	/**
	 * Get edboIssueParty
	 */
	@Column(name = "EDBO_ISSUE_PARTY")
	public String getEdboIssueParty() {
		return edboIssueParty;
	}

	/**
	 * Set edboIssueParty
	 */
	public void setEdboIssueParty(String edboIssueParty) {
		this.edboIssueParty = edboIssueParty;
		addValidField("edboIssueParty");
	}

	/**
	 * Get edboApplicantId
	 */
	@Column(name = "EDBO_APPLICANT_ID")
	public String getEdboApplicantId() {
		return edboApplicantId;
	}

	/**
	 * Set edboApplicantId
	 */
	public void setEdboApplicantId(String edboApplicantId) {
		this.edboApplicantId = edboApplicantId;
		addValidField("edboApplicantId");
	}

	/**
	 * Get edboApplicant
	 */
	@Column(name = "EDBO_APPLICANT")
	public String getEdboApplicant() {
		return edboApplicant;
	}

	/**
	 * Set edboApplicant
	 */
	public void setEdboApplicant(String edboApplicant) {
		this.edboApplicant = edboApplicant;
		addValidField("edboApplicant");
	}

	/**
	 * Get edboFobBkPartyId
	 */
	@Column(name = "EDBO_FOB_BK_PARTY_ID")
	public String getEdboFobBkPartyId() {
		return edboFobBkPartyId;
	}

	/**
	 * Set edboFobBkPartyId
	 */
	public void setEdboFobBkPartyId(String edboFobBkPartyId) {
		this.edboFobBkPartyId = edboFobBkPartyId;
		addValidField("edboFobBkPartyId");
	}

	/**
	 * Get edboFobBkParty
	 */
	@Column(name = "EDBO_FOB_BK_PARTY")
	public String getEdboFobBkParty() {
		return edboFobBkParty;
	}

	/**
	 * Set edboFobBkParty
	 */
	public void setEdboFobBkParty(String edboFobBkParty) {
		this.edboFobBkParty = edboFobBkParty;
		addValidField("edboFobBkParty");
	}

	/**
	 * Get edboTranshipmentFlag
	 */
	@Column(name = "EDBO_TRANSHIPMENT_FLAG")
	public String getEdboTranshipmentFlag() {
		return edboTranshipmentFlag;
	}

	/**
	 * Set edboTranshipmentFlag
	 */
	public void setEdboTranshipmentFlag(String edboTranshipmentFlag) {
		this.edboTranshipmentFlag = edboTranshipmentFlag;
		addValidField("edboTranshipmentFlag");
	}

	/**
	 * Get edboBatchFlag
	 */
	@Column(name = "EDBO_BATCH_FLAG")
	public String getEdboBatchFlag() {
		return edboBatchFlag;
	}

	/**
	 * Set edboBatchFlag
	 */
	public void setEdboBatchFlag(String edboBatchFlag) {
		this.edboBatchFlag = edboBatchFlag;
		addValidField("edboBatchFlag");
	}

	/**
	 * Get edboShipmentDate
	 */
	@Column(name = "EDBO_SHIPMENT_DATE")
	public Date getEdboShipmentDate() {
		return edboShipmentDate;
	}

	/**
	 * Set edboShipmentDate
	 */
	public void setEdboShipmentDate(Date edboShipmentDate) {
		this.edboShipmentDate = edboShipmentDate;
		addValidField("edboShipmentDate");
	}

	/**
	 * Get edboExpiryDate
	 */
	@Column(name = "EDBO_EXPIRY_DATE")
	public Date getEdboExpiryDate() {
		return edboExpiryDate;
	}

	/**
	 * Set edboExpiryDate
	 */
	public void setEdboExpiryDate(Date edboExpiryDate) {
		this.edboExpiryDate = edboExpiryDate;
		addValidField("edboExpiryDate");
	}

	/**
	 * Get edboQuotationNo
	 */
	@Column(name = "EDBO_QUOTATION_NO")
	public String getEdboQuotationNo() {
		return edboQuotationNo;
	}

	/**
	 * Set edboQuotationNo
	 */
	public void setEdboQuotationNo(String edboQuotationNo) {
		this.edboQuotationNo = edboQuotationNo;
		addValidField("edboQuotationNo");
	}

	/**
	 * Get edboChargeType
	 */
	@Column(name = "EDBO_CHARGE_TYPE")
	public String getEdboChargeType() {
		return edboChargeType;
	}

	/**
	 * Set edboChargeType
	 */
	public void setEdboChargeType(String edboChargeType) {
		this.edboChargeType = edboChargeType;
		addValidField("edboChargeType");
	}

	/**
	 * Get edboServiceContractNo
	 */
	@Column(name = "EDBO_SERVICE_CONTRACT_NO")
	public String getEdboServiceContractNo() {
		return edboServiceContractNo;
	}

	/**
	 * Set edboServiceContractNo
	 */
	public void setEdboServiceContractNo(String edboServiceContractNo) {
		this.edboServiceContractNo = edboServiceContractNo;
		addValidField("edboServiceContractNo");
	}

	/**
	 * Get edboBondNo
	 */
	@Column(name = "EDBO_BOND_NO")
	public String getEdboBondNo() {
		return edboBondNo;
	}

	/**
	 * Set edboBondNo
	 */
	public void setEdboBondNo(String edboBondNo) {
		this.edboBondNo = edboBondNo;
		addValidField("edboBondNo");
	}

	/**
	 * Get edboSlotCharterFlag
	 */
	@Column(name = "EDBO_SLOT_CHARTER_FLAG")
	public String getEdboSlotCharterFlag() {
		return edboSlotCharterFlag;
	}

	/**
	 * Set edboSlotCharterFlag
	 */
	public void setEdboSlotCharterFlag(String edboSlotCharterFlag) {
		this.edboSlotCharterFlag = edboSlotCharterFlag;
		addValidField("edboSlotCharterFlag");
	}

	/**
	 * Get edboAmsCode
	 */
	@Column(name = "EDBO_AMS_CODE")
	public String getEdboAmsCode() {
		return edboAmsCode;
	}

	/**
	 * Set edboAmsCode
	 */
	public void setEdboAmsCode(String edboAmsCode) {
		this.edboAmsCode = edboAmsCode;
		addValidField("edboAmsCode");
	}

	/**
	 * Get edboMainBlNo
	 */
	@Column(name = "EDBO_MAIN_BL_NO")
	public String getEdboMainBlNo() {
		return edboMainBlNo;
	}

	/**
	 * Set edboMainBlNo
	 */
	public void setEdboMainBlNo(String edboMainBlNo) {
		this.edboMainBlNo = edboMainBlNo;
		addValidField("edboMainBlNo");
	}

	/**
	 * Get edboBlViseType
	 */
	@Column(name = "EDBO_BL_VISE_TYPE")
	public String getEdboBlViseType() {
		return edboBlViseType;
	}

	/**
	 * Set edboBlViseType
	 */
	public void setEdboBlViseType(String edboBlViseType) {
		this.edboBlViseType = edboBlViseType;
		addValidField("edboBlViseType");
	}

	/**
	 * Get edboBlIssuePlaceCode
	 */
	@Column(name = "EDBO_BL_ISSUE_PLACE_CODE")
	public String getEdboBlIssuePlaceCode() {
		return edboBlIssuePlaceCode;
	}

	/**
	 * Set edboBlIssuePlaceCode
	 */
	public void setEdboBlIssuePlaceCode(String edboBlIssuePlaceCode) {
		this.edboBlIssuePlaceCode = edboBlIssuePlaceCode;
		addValidField("edboBlIssuePlaceCode");
	}

	/**
	 * Get edboBlIssuePlace
	 */
	@Column(name = "EDBO_BL_ISSUE_PLACE")
	public String getEdboBlIssuePlace() {
		return edboBlIssuePlace;
	}

	/**
	 * Set edboBlIssuePlace
	 */
	public void setEdboBlIssuePlace(String edboBlIssuePlace) {
		this.edboBlIssuePlace = edboBlIssuePlace;
		addValidField("edboBlIssuePlace");
	}

	/**
	 * Get edboBlIssueDate
	 */
	@Column(name = "EDBO_BL_ISSUE_DATE")
	public Date getEdboBlIssueDate() {
		return edboBlIssueDate;
	}

	/**
	 * Set edboBlIssueDate
	 */
	public void setEdboBlIssueDate(Date edboBlIssueDate) {
		this.edboBlIssueDate = edboBlIssueDate;
		addValidField("edboBlIssueDate");
	}

	/**
	 * Get edboBlCopyNum
	 */
	@Column(name = "EDBO_BL_COPY_NUM")
	public Integer getEdboBlCopyNum() {
		return edboBlCopyNum;
	}

	/**
	 * Set edboBlCopyNum
	 */
	public void setEdboBlCopyNum(Integer edboBlCopyNum) {
		this.edboBlCopyNum = edboBlCopyNum;
		addValidField("edboBlCopyNum");
	}

	/**
	 * Get edboPrepaidPlaceCode
	 */
	@Column(name = "EDBO_PREPAID_PLACE_CODE")
	public String getEdboPrepaidPlaceCode() {
		return edboPrepaidPlaceCode;
	}

	/**
	 * Set edboPrepaidPlaceCode
	 */
	public void setEdboPrepaidPlaceCode(String edboPrepaidPlaceCode) {
		this.edboPrepaidPlaceCode = edboPrepaidPlaceCode;
		addValidField("edboPrepaidPlaceCode");
	}

	/**
	 * Get edboPrepaidPlaceName
	 */
	@Column(name = "EDBO_PREPAID_PLACE_NAME")
	public String getEdboPrepaidPlaceName() {
		return edboPrepaidPlaceName;
	}

	/**
	 * Set edboPrepaidPlaceName
	 */
	public void setEdboPrepaidPlaceName(String edboPrepaidPlaceName) {
		this.edboPrepaidPlaceName = edboPrepaidPlaceName;
		addValidField("edboPrepaidPlaceName");
	}

	/**
	 * Get edboPayPlaceCode
	 */
	@Column(name = "EDBO_PAY_PLACE_CODE")
	public String getEdboPayPlaceCode() {
		return edboPayPlaceCode;
	}

	/**
	 * Set edboPayPlaceCode
	 */
	public void setEdboPayPlaceCode(String edboPayPlaceCode) {
		this.edboPayPlaceCode = edboPayPlaceCode;
		addValidField("edboPayPlaceCode");
	}

	/**
	 * Get edboPayPlaceName
	 */
	@Column(name = "EDBO_PAY_PLACE_NAME")
	public String getEdboPayPlaceName() {
		return edboPayPlaceName;
	}

	/**
	 * Set edboPayPlaceName
	 */
	public void setEdboPayPlaceName(String edboPayPlaceName) {
		this.edboPayPlaceName = edboPayPlaceName;
		addValidField("edboPayPlaceName");
	}

	/**
	 * Get edboVesselCall
	 */
	@Column(name = "EDBO_VESSEL_CALL")
	public String getEdboVesselCall() {
		return edboVesselCall;
	}

	/**
	 * Set edboVesselCall
	 */
	public void setEdboVesselCall(String edboVesselCall) {
		this.edboVesselCall = edboVesselCall;
		addValidField("edboVesselCall");
	}

	/**
	 * Get edboVesselName
	 */
	@Column(name = "EDBO_VESSEL_NAME")
	public String getEdboVesselName() {
		return edboVesselName;
	}

	/**
	 * Set edboVesselName
	 */
	public void setEdboVesselName(String edboVesselName) {
		this.edboVesselName = edboVesselName;
		addValidField("edboVesselName");
	}

	/**
	 * Get edboVoyage
	 */
	@Column(name = "EDBO_VOYAGE")
	public String getEdboVoyage() {
		return edboVoyage;
	}

	/**
	 * Set edboVoyage
	 */
	public void setEdboVoyage(String edboVoyage) {
		this.edboVoyage = edboVoyage;
		addValidField("edboVoyage");
	}

	/**
	 * Get edboCarrierCode
	 */
	@Column(name = "EDBO_CARRIER_CODE")
	public String getEdboCarrierCode() {
		return edboCarrierCode;
	}

	/**
	 * Set edboCarrierCode
	 */
	public void setEdboCarrierCode(String edboCarrierCode) {
		this.edboCarrierCode = edboCarrierCode;
		addValidField("edboCarrierCode");
	}

	/**
	 * Get edboCarrierName
	 */
	@Column(name = "EDBO_CARRIER_NAME")
	public String getEdboCarrierName() {
		return edboCarrierName;
	}

	/**
	 * Set edboCarrierName
	 */
	public void setEdboCarrierName(String edboCarrierName) {
		this.edboCarrierName = edboCarrierName;
		addValidField("edboCarrierName");
	}

	/**
	 * Get edboBlCarrierCode
	 */
	@Column(name = "EDBO_BL_CARRIER_CODE")
	public String getEdboBlCarrierCode() {
		return edboBlCarrierCode;
	}

	/**
	 * Set edboBlCarrierCode
	 */
	public void setEdboBlCarrierCode(String edboBlCarrierCode) {
		this.edboBlCarrierCode = edboBlCarrierCode;
		addValidField("edboBlCarrierCode");
	}

	/**
	 * Get edboBlCarrierName
	 */
	@Column(name = "EDBO_BL_CARRIER_NAME")
	public String getEdboBlCarrierName() {
		return edboBlCarrierName;
	}

	/**
	 * Set edboBlCarrierName
	 */
	public void setEdboBlCarrierName(String edboBlCarrierName) {
		this.edboBlCarrierName = edboBlCarrierName;
		addValidField("edboBlCarrierName");
	}

	/**
	 * Get edboRequestEtd
	 */
	@Column(name = "EDBO_REQUEST_ETD")
	public Date getEdboRequestEtd() {
		return edboRequestEtd;
	}

	/**
	 * Set edboRequestEtd
	 */
	public void setEdboRequestEtd(Date edboRequestEtd) {
		this.edboRequestEtd = edboRequestEtd;
		addValidField("edboRequestEtd");
	}

	/**
	 * Get edboTradeId
	 */
	@Column(name = "EDBO_TRADE_ID")
	public String getEdboTradeId() {
		return edboTradeId;
	}

	/**
	 * Set edboTradeId
	 */
	public void setEdboTradeId(String edboTradeId) {
		this.edboTradeId = edboTradeId;
		addValidField("edboTradeId");
	}

	/**
	 * Get edboTrade
	 */
	@Column(name = "EDBO_TRADE")
	public String getEdboTrade() {
		return edboTrade;
	}

	/**
	 * Set edboTrade
	 */
	public void setEdboTrade(String edboTrade) {
		this.edboTrade = edboTrade;
		addValidField("edboTrade");
	}

	/**
	 * Get edboPreVesselCode
	 */
	@Column(name = "EDBO_PRE_VESSEL_CODE")
	public String getEdboPreVesselCode() {
		return edboPreVesselCode;
	}

	/**
	 * Set edboPreVesselCode
	 */
	public void setEdboPreVesselCode(String edboPreVesselCode) {
		this.edboPreVesselCode = edboPreVesselCode;
		addValidField("edboPreVesselCode");
	}

	/**
	 * Get edboPreVesselName
	 */
	@Column(name = "EDBO_PRE_VESSEL_NAME")
	public String getEdboPreVesselName() {
		return edboPreVesselName;
	}

	/**
	 * Set edboPreVesselName
	 */
	public void setEdboPreVesselName(String edboPreVesselName) {
		this.edboPreVesselName = edboPreVesselName;
		addValidField("edboPreVesselName");
	}

	/**
	 * Get edboPreVoyage
	 */
	@Column(name = "EDBO_PRE_VOYAGE")
	public String getEdboPreVoyage() {
		return edboPreVoyage;
	}

	/**
	 * Set edboPreVoyage
	 */
	public void setEdboPreVoyage(String edboPreVoyage) {
		this.edboPreVoyage = edboPreVoyage;
		addValidField("edboPreVoyage");
	}

	/**
	 * Get edboReceiptPlaceCode
	 */
	@Column(name = "EDBO_RECEIPT_PLACE_CODE")
	public String getEdboReceiptPlaceCode() {
		return edboReceiptPlaceCode;
	}

	/**
	 * Set edboReceiptPlaceCode
	 */
	public void setEdboReceiptPlaceCode(String edboReceiptPlaceCode) {
		this.edboReceiptPlaceCode = edboReceiptPlaceCode;
		addValidField("edboReceiptPlaceCode");
	}

	/**
	 * Get edboReceiptPlaceName
	 */
	@Column(name = "EDBO_RECEIPT_PLACE_NAME")
	public String getEdboReceiptPlaceName() {
		return edboReceiptPlaceName;
	}

	/**
	 * Set edboReceiptPlaceName
	 */
	public void setEdboReceiptPlaceName(String edboReceiptPlaceName) {
		this.edboReceiptPlaceName = edboReceiptPlaceName;
		addValidField("edboReceiptPlaceName");
	}

	/**
	 * Get edboLoadPortCode
	 */
	@Column(name = "EDBO_LOAD_PORT_CODE")
	public String getEdboLoadPortCode() {
		return edboLoadPortCode;
	}

	/**
	 * Set edboLoadPortCode
	 */
	public void setEdboLoadPortCode(String edboLoadPortCode) {
		this.edboLoadPortCode = edboLoadPortCode;
		addValidField("edboLoadPortCode");
	}

	/**
	 * Get edboLoadPortName
	 */
	@Column(name = "EDBO_LOAD_PORT_NAME")
	public String getEdboLoadPortName() {
		return edboLoadPortName;
	}

	/**
	 * Set edboLoadPortName
	 */
	public void setEdboLoadPortName(String edboLoadPortName) {
		this.edboLoadPortName = edboLoadPortName;
		addValidField("edboLoadPortName");
	}

	/**
	 * Get edboDischargePortCode
	 */
	@Column(name = "EDBO_DISCHARGE_PORT_CODE")
	public String getEdboDischargePortCode() {
		return edboDischargePortCode;
	}

	/**
	 * Set edboDischargePortCode
	 */
	public void setEdboDischargePortCode(String edboDischargePortCode) {
		this.edboDischargePortCode = edboDischargePortCode;
		addValidField("edboDischargePortCode");
	}

	/**
	 * Get edboDischargePortName
	 */
	@Column(name = "EDBO_DISCHARGE_PORT_NAME")
	public String getEdboDischargePortName() {
		return edboDischargePortName;
	}

	/**
	 * Set edboDischargePortName
	 */
	public void setEdboDischargePortName(String edboDischargePortName) {
		this.edboDischargePortName = edboDischargePortName;
		addValidField("edboDischargePortName");
	}

	/**
	 * Get edboTransferPortCode
	 */
	@Column(name = "EDBO_TRANSFER_PORT_CODE")
	public String getEdboTransferPortCode() {
		return edboTransferPortCode;
	}

	/**
	 * Set edboTransferPortCode
	 */
	public void setEdboTransferPortCode(String edboTransferPortCode) {
		this.edboTransferPortCode = edboTransferPortCode;
		addValidField("edboTransferPortCode");
	}

	/**
	 * Get edboTransferPortName
	 */
	@Column(name = "EDBO_TRANSFER_PORT_NAME")
	public String getEdboTransferPortName() {
		return edboTransferPortName;
	}

	/**
	 * Set edboTransferPortName
	 */
	public void setEdboTransferPortName(String edboTransferPortName) {
		this.edboTransferPortName = edboTransferPortName;
		addValidField("edboTransferPortName");
	}

	/**
	 * Get edboDeliveryPlaceCode
	 */
	@Column(name = "EDBO_DELIVERY_PLACE_CODE")
	public String getEdboDeliveryPlaceCode() {
		return edboDeliveryPlaceCode;
	}

	/**
	 * Set edboDeliveryPlaceCode
	 */
	public void setEdboDeliveryPlaceCode(String edboDeliveryPlaceCode) {
		this.edboDeliveryPlaceCode = edboDeliveryPlaceCode;
		addValidField("edboDeliveryPlaceCode");
	}

	/**
	 * Get edboDeliveryPlaceName
	 */
	@Column(name = "EDBO_DELIVERY_PLACE_NAME")
	public String getEdboDeliveryPlaceName() {
		return edboDeliveryPlaceName;
	}

	/**
	 * Set edboDeliveryPlaceName
	 */
	public void setEdboDeliveryPlaceName(String edboDeliveryPlaceName) {
		this.edboDeliveryPlaceName = edboDeliveryPlaceName;
		addValidField("edboDeliveryPlaceName");
	}

	/**
	 * Get edboFinalDestinationCode
	 */
	@Column(name = "EDBO_FINAL_DESTINATION_CODE")
	public String getEdboFinalDestinationCode() {
		return edboFinalDestinationCode;
	}

	/**
	 * Set edboFinalDestinationCode
	 */
	public void setEdboFinalDestinationCode(String edboFinalDestinationCode) {
		this.edboFinalDestinationCode = edboFinalDestinationCode;
		addValidField("edboFinalDestinationCode");
	}

	/**
	 * Get edboFinalDestination
	 */
	@Column(name = "EDBO_FINAL_DESTINATION")
	public String getEdboFinalDestination() {
		return edboFinalDestination;
	}

	/**
	 * Set edboFinalDestination
	 */
	public void setEdboFinalDestination(String edboFinalDestination) {
		this.edboFinalDestination = edboFinalDestination;
		addValidField("edboFinalDestination");
	}

	/**
	 * Get edboDepotCode
	 */
	@Column(name = "EDBO_DEPOT_CODE")
	public String getEdboDepotCode() {
		return edboDepotCode;
	}

	/**
	 * Set edboDepotCode
	 */
	public void setEdboDepotCode(String edboDepotCode) {
		this.edboDepotCode = edboDepotCode;
		addValidField("edboDepotCode");
	}

	/**
	 * Get edboTransferPlaceCode
	 */
	@Column(name = "EDBO_TRANSFER_PLACE_CODE")
	public String getEdboTransferPlaceCode() {
		return edboTransferPlaceCode;
	}

	/**
	 * Set edboTransferPlaceCode
	 */
	public void setEdboTransferPlaceCode(String edboTransferPlaceCode) {
		this.edboTransferPlaceCode = edboTransferPlaceCode;
		addValidField("edboTransferPlaceCode");
	}

	/**
	 * Get edboTransferPlaceName
	 */
	@Column(name = "EDBO_TRANSFER_PLACE_NAME")
	public String getEdboTransferPlaceName() {
		return edboTransferPlaceName;
	}

	/**
	 * Set edboTransferPlaceName
	 */
	public void setEdboTransferPlaceName(String edboTransferPlaceName) {
		this.edboTransferPlaceName = edboTransferPlaceName;
		addValidField("edboTransferPlaceName");
	}

	/**
	 * Get edboOptDischargePortCode1
	 */
	@Column(name = "EDBO_OPT_DISCHARGE_PORT_CODE1")
	public String getEdboOptDischargePortCode1() {
		return edboOptDischargePortCode1;
	}

	/**
	 * Set edboOptDischargePortCode1
	 */
	public void setEdboOptDischargePortCode1(String edboOptDischargePortCode1) {
		this.edboOptDischargePortCode1 = edboOptDischargePortCode1;
		addValidField("edboOptDischargePortCode1");
	}

	/**
	 * Get edboOptDischargePort1
	 */
	@Column(name = "EDBO_OPT_DISCHARGE_PORT1")
	public String getEdboOptDischargePort1() {
		return edboOptDischargePort1;
	}

	/**
	 * Set edboOptDischargePort1
	 */
	public void setEdboOptDischargePort1(String edboOptDischargePort1) {
		this.edboOptDischargePort1 = edboOptDischargePort1;
		addValidField("edboOptDischargePort1");
	}

	/**
	 * Get edboOptDeliveryPlaceCode
	 */
	@Column(name = "EDBO_OPT_DELIVERY_PLACE_CODE")
	public String getEdboOptDeliveryPlaceCode() {
		return edboOptDeliveryPlaceCode;
	}

	/**
	 * Set edboOptDeliveryPlaceCode
	 */
	public void setEdboOptDeliveryPlaceCode(String edboOptDeliveryPlaceCode) {
		this.edboOptDeliveryPlaceCode = edboOptDeliveryPlaceCode;
		addValidField("edboOptDeliveryPlaceCode");
	}

	/**
	 * Get edboOptDeliveryPlace
	 */
	@Column(name = "EDBO_OPT_DELIVERY_PLACE")
	public String getEdboOptDeliveryPlace() {
		return edboOptDeliveryPlace;
	}

	/**
	 * Set edboOptDeliveryPlace
	 */
	public void setEdboOptDeliveryPlace(String edboOptDeliveryPlace) {
		this.edboOptDeliveryPlace = edboOptDeliveryPlace;
		addValidField("edboOptDeliveryPlace");
	}

	/**
	 * Get edboSurchargeCode
	 */
	@Column(name = "EDBO_SURCHARGE_CODE")
	public String getEdboSurchargeCode() {
		return edboSurchargeCode;
	}

	/**
	 * Set edboSurchargeCode
	 */
	public void setEdboSurchargeCode(String edboSurchargeCode) {
		this.edboSurchargeCode = edboSurchargeCode;
		addValidField("edboSurchargeCode");
	}

	/**
	 * Get edboSurchargeRemark
	 */
	@Column(name = "EDBO_SURCHARGE_REMARK")
	public String getEdboSurchargeRemark() {
		return edboSurchargeRemark;
	}

	/**
	 * Set edboSurchargeRemark
	 */
	public void setEdboSurchargeRemark(String edboSurchargeRemark) {
		this.edboSurchargeRemark = edboSurchargeRemark;
		addValidField("edboSurchargeRemark");
	}

	/**
	 * Get edboRemark
	 */
	@Column(name = "EDBO_REMARK")
	public String getEdboRemark() {
		return edboRemark;
	}

	/**
	 * Set edboRemark
	 */
	public void setEdboRemark(String edboRemark) {
		this.edboRemark = edboRemark;
		addValidField("edboRemark");
	}

	/**
	 * Get edboCurrency
	 */
	@Column(name = "EDBO_CURRENCY")
	public String getEdboCurrency() {
		return edboCurrency;
	}

	/**
	 * Set edboCurrency
	 */
	public void setEdboCurrency(String edboCurrency) {
		this.edboCurrency = edboCurrency;
		addValidField("edboCurrency");
	}

	/**
	 * Get edboAmount
	 */
	@Column(name = "EDBO_AMOUNT")
	public Double getEdboAmount() {
		return edboAmount;
	}

	/**
	 * Set edboAmount
	 */
	public void setEdboAmount(Double edboAmount) {
		this.edboAmount = edboAmount;
		addValidField("edboAmount");
	}

	/**
	 * Get edboShipperCode
	 */
	@Column(name = "EDBO_SHIPPER_CODE")
	public String getEdboShipperCode() {
		return edboShipperCode;
	}

	/**
	 * Set edboShipperCode
	 */
	public void setEdboShipperCode(String edboShipperCode) {
		this.edboShipperCode = edboShipperCode;
		addValidField("edboShipperCode");
	}

	/**
	 * Get edboShipper
	 */
	@Column(name = "EDBO_SHIPPER")
	public String getEdboShipper() {
		return edboShipper;
	}

	/**
	 * Set edboShipper
	 */
	public void setEdboShipper(String edboShipper) {
		this.edboShipper = edboShipper;
		addValidField("edboShipper");
	}

	/**
	 * Get edboConsigneeCode
	 */
	@Column(name = "EDBO_CONSIGNEE_CODE")
	public String getEdboConsigneeCode() {
		return edboConsigneeCode;
	}

	/**
	 * Set edboConsigneeCode
	 */
	public void setEdboConsigneeCode(String edboConsigneeCode) {
		this.edboConsigneeCode = edboConsigneeCode;
		addValidField("edboConsigneeCode");
	}

	/**
	 * Get edboConsignee
	 */
	@Column(name = "EDBO_CONSIGNEE")
	public String getEdboConsignee() {
		return edboConsignee;
	}

	/**
	 * Set edboConsignee
	 */
	public void setEdboConsignee(String edboConsignee) {
		this.edboConsignee = edboConsignee;
		addValidField("edboConsignee");
	}

	/**
	 * Get edboNotifyCode
	 */
	@Column(name = "EDBO_NOTIFY_CODE")
	public String getEdboNotifyCode() {
		return edboNotifyCode;
	}

	/**
	 * Set edboNotifyCode
	 */
	public void setEdboNotifyCode(String edboNotifyCode) {
		this.edboNotifyCode = edboNotifyCode;
		addValidField("edboNotifyCode");
	}

	/**
	 * Get edboNotify
	 */
	@Column(name = "EDBO_NOTIFY")
	public String getEdboNotify() {
		return edboNotify;
	}

	/**
	 * Set edboNotify
	 */
	public void setEdboNotify(String edboNotify) {
		this.edboNotify = edboNotify;
		addValidField("edboNotify");
	}

	/**
	 * Get edboSecondNotifyCode
	 */
	@Column(name = "EDBO_SECOND_NOTIFY_CODE")
	public String getEdboSecondNotifyCode() {
		return edboSecondNotifyCode;
	}

	/**
	 * Set edboSecondNotifyCode
	 */
	public void setEdboSecondNotifyCode(String edboSecondNotifyCode) {
		this.edboSecondNotifyCode = edboSecondNotifyCode;
		addValidField("edboSecondNotifyCode");
	}

	/**
	 * Get edboSecondNotify
	 */
	@Column(name = "EDBO_SECOND_NOTIFY")
	public String getEdboSecondNotify() {
		return edboSecondNotify;
	}

	/**
	 * Set edboSecondNotify
	 */
	public void setEdboSecondNotify(String edboSecondNotify) {
		this.edboSecondNotify = edboSecondNotify;
		addValidField("edboSecondNotify");
	}

	/**
	 * Get edboThirdNotifyCode
	 */
	@Column(name = "EDBO_THIRD_NOTIFY_CODE")
	public String getEdboThirdNotifyCode() {
		return edboThirdNotifyCode;
	}

	/**
	 * Set edboThirdNotifyCode
	 */
	public void setEdboThirdNotifyCode(String edboThirdNotifyCode) {
		this.edboThirdNotifyCode = edboThirdNotifyCode;
		addValidField("edboThirdNotifyCode");
	}

	/**
	 * Get edboThirdNotify
	 */
	@Column(name = "EDBO_THIRD_NOTIFY")
	public String getEdboThirdNotify() {
		return edboThirdNotify;
	}

	/**
	 * Set edboThirdNotify
	 */
	public void setEdboThirdNotify(String edboThirdNotify) {
		this.edboThirdNotify = edboThirdNotify;
		addValidField("edboThirdNotify");
	}

	/**
	 * Get edboIntermediateCarrgier
	 */
	@Column(name = "EDBO_INTERMEDIATE_CARRGIER")
	public String getEdboIntermediateCarrgier() {
		return edboIntermediateCarrgier;
	}

	/**
	 * Set edboIntermediateCarrgier
	 */
	public void setEdboIntermediateCarrgier(String edboIntermediateCarrgier) {
		this.edboIntermediateCarrgier = edboIntermediateCarrgier;
		addValidField("edboIntermediateCarrgier");
	}

	/**
	 * Get edboTelInterCarrgier
	 */
	@Column(name = "EDBO_TEL_INTER_CARRGIER")
	public String getEdboTelInterCarrgier() {
		return edboTelInterCarrgier;
	}

	/**
	 * Set edboTelInterCarrgier
	 */
	public void setEdboTelInterCarrgier(String edboTelInterCarrgier) {
		this.edboTelInterCarrgier = edboTelInterCarrgier;
		addValidField("edboTelInterCarrgier");
	}

	/**
	 * Get edboEmailInterCarrgier
	 */
	@Column(name = "EDBO_EMAIL_INTER_CARRGIER")
	public String getEdboEmailInterCarrgier() {
		return edboEmailInterCarrgier;
	}

	/**
	 * Set edboEmailInterCarrgier
	 */
	public void setEdboEmailInterCarrgier(String edboEmailInterCarrgier) {
		this.edboEmailInterCarrgier = edboEmailInterCarrgier;
		addValidField("edboEmailInterCarrgier");
	}

	/**
	 * Get edboFaxInterCarrgier
	 */
	@Column(name = "EDBO_FAX_INTER_CARRGIER")
	public String getEdboFaxInterCarrgier() {
		return edboFaxInterCarrgier;
	}

	/**
	 * Set edboFaxInterCarrgier
	 */
	public void setEdboFaxInterCarrgier(String edboFaxInterCarrgier) {
		this.edboFaxInterCarrgier = edboFaxInterCarrgier;
		addValidField("edboFaxInterCarrgier");
	}

	/**
	 * Get edboStreetNumberPoboxDc
	 */
	@Column(name = "EDBO_STREET_NUMBER_POBOX_DC")
	public String getEdboStreetNumberPoboxDc() {
		return edboStreetNumberPoboxDc;
	}

	/**
	 * Set edboStreetNumberPoboxDc
	 */
	public void setEdboStreetNumberPoboxDc(String edboStreetNumberPoboxDc) {
		this.edboStreetNumberPoboxDc = edboStreetNumberPoboxDc;
		addValidField("edboStreetNumberPoboxDc");
	}

	/**
	 * Get edboCityNameDc
	 */
	@Column(name = "EDBO_CITY_NAME_DC")
	public String getEdboCityNameDc() {
		return edboCityNameDc;
	}

	/**
	 * Set edboCityNameDc
	 */
	public void setEdboCityNameDc(String edboCityNameDc) {
		this.edboCityNameDc = edboCityNameDc;
		addValidField("edboCityNameDc");
	}

	/**
	 * Get edboCountrySubEntityDc
	 */
	@Column(name = "EDBO_COUNTRY_SUB_ENTITY_DC")
	public String getEdboCountrySubEntityDc() {
		return edboCountrySubEntityDc;
	}

	/**
	 * Set edboCountrySubEntityDc
	 */
	public void setEdboCountrySubEntityDc(String edboCountrySubEntityDc) {
		this.edboCountrySubEntityDc = edboCountrySubEntityDc;
		addValidField("edboCountrySubEntityDc");
	}

	/**
	 * Get edboCountrySubEntityNmDc
	 */
	@Column(name = "EDBO_COUNTRY_SUB_ENTITY_NM_DC")
	public String getEdboCountrySubEntityNmDc() {
		return edboCountrySubEntityNmDc;
	}

	/**
	 * Set edboCountrySubEntityNmDc
	 */
	public void setEdboCountrySubEntityNmDc(String edboCountrySubEntityNmDc) {
		this.edboCountrySubEntityNmDc = edboCountrySubEntityNmDc;
		addValidField("edboCountrySubEntityNmDc");
	}

	/**
	 * Get edboPostcodeDc
	 */
	@Column(name = "EDBO_POSTCODE_DC")
	public String getEdboPostcodeDc() {
		return edboPostcodeDc;
	}

	/**
	 * Set edboPostcodeDc
	 */
	public void setEdboPostcodeDc(String edboPostcodeDc) {
		this.edboPostcodeDc = edboPostcodeDc;
		addValidField("edboPostcodeDc");
	}

	/**
	 * Get edboCountryCodeDc
	 */
	@Column(name = "EDBO_COUNTRY_CODE_DC")
	public String getEdboCountryCodeDc() {
		return edboCountryCodeDc;
	}

	/**
	 * Set edboCountryCodeDc
	 */
	public void setEdboCountryCodeDc(String edboCountryCodeDc) {
		this.edboCountryCodeDc = edboCountryCodeDc;
		addValidField("edboCountryCodeDc");
	}

	/**
	 * Get edboCountryNameDc
	 */
	@Column(name = "EDBO_COUNTRY_NAME_DC")
	public String getEdboCountryNameDc() {
		return edboCountryNameDc;
	}

	/**
	 * Set edboCountryNameDc
	 */
	public void setEdboCountryNameDc(String edboCountryNameDc) {
		this.edboCountryNameDc = edboCountryNameDc;
		addValidField("edboCountryNameDc");
	}

	/**
	 * Get edboSubstr1
	 */
	@Column(name = "EDBO_SUBSTR1")
	public String getEdboSubstr1() {
		return edboSubstr1;
	}

	/**
	 * Set edboSubstr1
	 */
	public void setEdboSubstr1(String edboSubstr1) {
		this.edboSubstr1 = edboSubstr1;
		addValidField("edboSubstr1");
	}

	/**
	 * Get edboSubstr2
	 */
	@Column(name = "EDBO_SUBSTR2")
	public String getEdboSubstr2() {
		return edboSubstr2;
	}

	/**
	 * Set edboSubstr2
	 */
	public void setEdboSubstr2(String edboSubstr2) {
		this.edboSubstr2 = edboSubstr2;
		addValidField("edboSubstr2");
	}

	/**
	 * Get edboSubstr3
	 */
	@Column(name = "EDBO_SUBSTR3")
	public String getEdboSubstr3() {
		return edboSubstr3;
	}

	/**
	 * Set edboSubstr3
	 */
	public void setEdboSubstr3(String edboSubstr3) {
		this.edboSubstr3 = edboSubstr3;
		addValidField("edboSubstr3");
	}

	/**
	 * Get edboSubstr4
	 */
	@Column(name = "EDBO_SUBSTR4")
	public String getEdboSubstr4() {
		return edboSubstr4;
	}

	/**
	 * Set edboSubstr4
	 */
	public void setEdboSubstr4(String edboSubstr4) {
		this.edboSubstr4 = edboSubstr4;
		addValidField("edboSubstr4");
	}

	/**
	 * Get edboSubstr5
	 */
	@Column(name = "EDBO_SUBSTR5")
	public String getEdboSubstr5() {
		return edboSubstr5;
	}

	/**
	 * Set edboSubstr5
	 */
	public void setEdboSubstr5(String edboSubstr5) {
		this.edboSubstr5 = edboSubstr5;
		addValidField("edboSubstr5");
	}

	/**
	 * Get edboSubstr6
	 */
	@Column(name = "EDBO_SUBSTR6")
	public String getEdboSubstr6() {
		return edboSubstr6;
	}

	/**
	 * Set edboSubstr6
	 */
	public void setEdboSubstr6(String edboSubstr6) {
		this.edboSubstr6 = edboSubstr6;
		addValidField("edboSubstr6");
	}

	/**
	 * Get edboSubstr7
	 */
	@Column(name = "EDBO_SUBSTR7")
	public String getEdboSubstr7() {
		return edboSubstr7;
	}

	/**
	 * Set edboSubstr7
	 */
	public void setEdboSubstr7(String edboSubstr7) {
		this.edboSubstr7 = edboSubstr7;
		addValidField("edboSubstr7");
	}

	/**
	 * Get edboSubstr8
	 */
	@Column(name = "EDBO_SUBSTR8")
	public String getEdboSubstr8() {
		return edboSubstr8;
	}

	/**
	 * Set edboSubstr8
	 */
	public void setEdboSubstr8(String edboSubstr8) {
		this.edboSubstr8 = edboSubstr8;
		addValidField("edboSubstr8");
	}

	/**
	 * Get edboSubdate1
	 */
	@Column(name = "EDBO_SUBDATE1")
	public Date getEdboSubdate1() {
		return edboSubdate1;
	}

	/**
	 * Set edboSubdate1
	 */
	public void setEdboSubdate1(Date edboSubdate1) {
		this.edboSubdate1 = edboSubdate1;
		addValidField("edboSubdate1");
	}

	/**
	 * Get edboSubdate2
	 */
	@Column(name = "EDBO_SUBDATE2")
	public Date getEdboSubdate2() {
		return edboSubdate2;
	}

	/**
	 * Set edboSubdate2
	 */
	public void setEdboSubdate2(Date edboSubdate2) {
		this.edboSubdate2 = edboSubdate2;
		addValidField("edboSubdate2");
	}

	/**
	 * Get edboSubdate3
	 */
	@Column(name = "EDBO_SUBDATE3")
	public Date getEdboSubdate3() {
		return edboSubdate3;
	}

	/**
	 * Set edboSubdate3
	 */
	public void setEdboSubdate3(Date edboSubdate3) {
		this.edboSubdate3 = edboSubdate3;
		addValidField("edboSubdate3");
	}

	/**
	 * Get edboSubdate4
	 */
	@Column(name = "EDBO_SUBDATE4")
	public Date getEdboSubdate4() {
		return edboSubdate4;
	}

	/**
	 * Set edboSubdate4
	 */
	public void setEdboSubdate4(Date edboSubdate4) {
		this.edboSubdate4 = edboSubdate4;
		addValidField("edboSubdate4");
	}

	/**
	 * Get edboSubnum1
	 */
	@Column(name = "EDBO_SUBNUM1")
	public Long getEdboSubnum1() {
		return edboSubnum1;
	}

	/**
	 * Set edboSubnum1
	 */
	public void setEdboSubnum1(Long edboSubnum1) {
		this.edboSubnum1 = edboSubnum1;
		addValidField("edboSubnum1");
	}

	/**
	 * Get edboSubnum2
	 */
	@Column(name = "EDBO_SUBNUM2")
	public Long getEdboSubnum2() {
		return edboSubnum2;
	}

	/**
	 * Set edboSubnum2
	 */
	public void setEdboSubnum2(Long edboSubnum2) {
		this.edboSubnum2 = edboSubnum2;
		addValidField("edboSubnum2");
	}

	/**
	 * Get edboSubnum3
	 */
	@Column(name = "EDBO_SUBNUM3")
	public Long getEdboSubnum3() {
		return edboSubnum3;
	}

	/**
	 * Set edboSubnum3
	 */
	public void setEdboSubnum3(Long edboSubnum3) {
		this.edboSubnum3 = edboSubnum3;
		addValidField("edboSubnum3");
	}

	/**
	 * Get edboSubnum4
	 */
	@Column(name = "EDBO_SUBNUM4")
	public Long getEdboSubnum4() {
		return edboSubnum4;
	}

	/**
	 * Set edboSubnum4
	 */
	public void setEdboSubnum4(Long edboSubnum4) {
		this.edboSubnum4 = edboSubnum4;
		addValidField("edboSubnum4");
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
	 * Get edboType
	 */
	@Column(name = "EDBO_TYPE")
	public String getEdboType() {
		return edboType;
	}

	/**
	 * Set edboType
	 */
	public void setEdboType(String edboType) {
		this.edboType = edboType;
		addValidField("edboType");
	}

}
