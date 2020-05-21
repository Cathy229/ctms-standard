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
 * Model class for EdiBookingFeedback
 */
@Entity
@Table(name = "EDI_BOOKING_FEEDBACK")
public class EdiBookingFeedbackModel extends BaseModel implements OperationLog {

	//edbbId
	private Long edbbId;
	//edbbEorbId
	private Long edbbEorbId;
	//edbbEoorSinoNo
	private String edbbEoorSinoNo;
	//edbbOrgCode
	private String edbbOrgCode;
	//edbbScCode
	private String edbbScCode;
	//edbbRcCode
	private String edbbRcCode;
	//edbbFilename
	private String edbbFilename;
	//edbbFileType
	private String edbbFileType;
	//edbbFlag
	private String edbbFlag;
	//edbbDisposeTime
	private Date edbbDisposeTime;
	//edbbEbpjFCode
	private Long edbbEbpjFCode;
	//edbbBookingNo
	private String edbbBookingNo;
	//edbbBulkBillNo
	private String edbbBulkBillNo;
	//edbbFreightClauseCode
	private String edbbFreightClauseCode;
	//edbbFreightClauseName
	private String edbbFreightClauseName;
	//edbbBookingPartyCode
	private String edbbBookingPartyCode;
	//edbbBookingPartyName
	private String edbbBookingPartyName;
	//edbbIssuePartyCode
	private String edbbIssuePartyCode;
	//edbbIssueParty
	private String edbbIssueParty;
	//edbbApplicantId
	private String edbbApplicantId;
	//edbbApplicant
	private String edbbApplicant;
	//edbbFobBkPartyId
	private String edbbFobBkPartyId;
	//edbbFobBkParty
	private String edbbFobBkParty;
	//edbbTranshipmentFlag
	private String edbbTranshipmentFlag;
	//edbbBatchFlag
	private String edbbBatchFlag;
	//edbbShipmentDate
	private Date edbbShipmentDate;
	//edbbExpiryDate
	private Date edbbExpiryDate;
	//edbbQuotationNo
	private String edbbQuotationNo;
	//edbbChargeType
	private String edbbChargeType;
	//edbbServiceContractNo
	private String edbbServiceContractNo;
	//edbbBondNo
	private String edbbBondNo;
	//edbbSlotCharterFlag
	private String edbbSlotCharterFlag;
	//edbbAmsCode
	private String edbbAmsCode;
	//edbbMainBlNo
	private String edbbMainBlNo;
	//edbbBlViseType
	private String edbbBlViseType;
	//edbbBlIssuePlaceCode
	private String edbbBlIssuePlaceCode;
	//edbbBlIssuePlace
	private String edbbBlIssuePlace;
	//edbbBlIssueDate
	private Date edbbBlIssueDate;
	//edbbBlCopyNum
	private Integer edbbBlCopyNum;
	//edbbPrepaidPlaceCode
	private String edbbPrepaidPlaceCode;
	//edbbPrepaidPlaceName
	private String edbbPrepaidPlaceName;
	//edbbPayPlaceCode
	private String edbbPayPlaceCode;
	//edbbPayPlaceName
	private String edbbPayPlaceName;
	//edbbVesselCall
	private String edbbVesselCall;
	//edbbVesselName
	private String edbbVesselName;
	//edbbVoyage
	private String edbbVoyage;
	//edbbCarrierCode
	private String edbbCarrierCode;
	//edbbCarrierName
	private String edbbCarrierName;
	//edbbBlCarrierCode
	private String edbbBlCarrierCode;
	//edbbBlCarrierName
	private String edbbBlCarrierName;
	//edbbRequestEtd
	private Date edbbRequestEtd;
	//edbbTradeId
	private String edbbTradeId;
	//edbbTrade
	private String edbbTrade;
	//edbbPreVesselCode
	private String edbbPreVesselCode;
	//edbbPreVesselName
	private String edbbPreVesselName;
	//edbbPreVoyage
	private String edbbPreVoyage;
	//edbbNextVesselCode
	private String edbbNextVesselCode;
	//edbbNextVessel
	private String edbbNextVessel;
	//edbbNextVoyage
	private String edbbNextVoyage;
	//edbbNextEtd
	private Date edbbNextEtd;
	//edbbNextAtd
	private Date edbbNextAtd;
	//edbbNextTransCode
	private String edbbNextTransCode;
	//edbbNextArea
	private String edbbNextArea;
	//edbbNextTransEtd
	private Date edbbNextTransEtd;
	//edbbNextTransAtd
	private Date edbbNextTransAtd;
	//edbbNextDestiEtd
	private Date edbbNextDestiEtd;
	//edbbNextDestiAtd
	private Date edbbNextDestiAtd;
	//edbbReceiptPlaceCode
	private String edbbReceiptPlaceCode;
	//edbbReceiptPlaceName
	private String edbbReceiptPlaceName;
	//edbbLoadPortCode
	private String edbbLoadPortCode;
	//edbbLoadPortName
	private String edbbLoadPortName;
	//edbbDischargePortCode
	private String edbbDischargePortCode;
	//edbbDischargePortName
	private String edbbDischargePortName;
	//edbbTransferPortCode
	private String edbbTransferPortCode;
	//edbbTransferPortName
	private String edbbTransferPortName;
	//edbbDeliveryPlaceCode
	private String edbbDeliveryPlaceCode;
	//edbbDeliveryPlaceName
	private String edbbDeliveryPlaceName;
	//edbbFinalDestinationCode
	private String edbbFinalDestinationCode;
	//edbbFinalDestination
	private String edbbFinalDestination;
	//edbbDepotCode
	private String edbbDepotCode;
	//edbbTransferPlaceCode
	private String edbbTransferPlaceCode;
	//edbbTransferPlaceName
	private String edbbTransferPlaceName;
	//edbbOptDischargePortCode1
	private String edbbOptDischargePortCode1;
	//edbbOptDischargePort1
	private String edbbOptDischargePort1;
	//edbbOptDeliveryPlaceCode
	private String edbbOptDeliveryPlaceCode;
	//edbbOptDeliveryPlace
	private String edbbOptDeliveryPlace;
	//edbbSurchargeCode
	private String edbbSurchargeCode;
	//edbbSurchargeRemark
	private String edbbSurchargeRemark;
	//edbbRemark
	private String edbbRemark;
	//edbbCurrency
	private String edbbCurrency;
	//edbbAmount
	private Double edbbAmount;
	//edbbShipperCode
	private String edbbShipperCode;
	//edbbShipper
	private String edbbShipper;
	//edbbConsigneeCode
	private String edbbConsigneeCode;
	//edbbConsignee
	private String edbbConsignee;
	//edbbNotifyCode
	private String edbbNotifyCode;
	//edbbNotify
	private String edbbNotify;
	//edbbSecondNotifyCode
	private String edbbSecondNotifyCode;
	//edbbSecondNotify
	private String edbbSecondNotify;
	//edbbThirdNotifyCode
	private String edbbThirdNotifyCode;
	//edbbThirdNotify
	private String edbbThirdNotify;
	//edbbIntermediateCarrgier
	private String edbbIntermediateCarrgier;
	//edbbTelInterCarrgier
	private String edbbTelInterCarrgier;
	//edbbEmailInterCarrgier
	private String edbbEmailInterCarrgier;
	//edbbFaxInterCarrgier
	private String edbbFaxInterCarrgier;
	//edbbStreetNumberPoboxDc
	private String edbbStreetNumberPoboxDc;
	//edbbCityNameDc
	private String edbbCityNameDc;
	//edbbCountrySubEntityDc
	private String edbbCountrySubEntityDc;
	//edbbCountrySubEntityNmDc
	private String edbbCountrySubEntityNmDc;
	//edbbPostcodeDc
	private String edbbPostcodeDc;
	//edbbCountryCodeDc
	private String edbbCountryCodeDc;
	//edbbCountryNameDc
	private String edbbCountryNameDc;
	//edbbSubstr1
	private String edbbSubstr1;
	//edbbSubstr2
	private String edbbSubstr2;
	//edbbSubstr3
	private String edbbSubstr3;
	//edbbSubstr4
	private String edbbSubstr4;
	//edbbSubstr5
	private String edbbSubstr5;
	//edbbSubstr6
	private String edbbSubstr6;
	//edbbSubstr7
	private String edbbSubstr7;
	//edbbSubstr8
	private String edbbSubstr8;
	//edbbSubdate1
	private Date edbbSubdate1;
	//edbbSubdate2
	private Date edbbSubdate2;
	//edbbSubdate3
	private Date edbbSubdate3;
	//edbbSubdate4
	private Date edbbSubdate4;
	//edbbSubnum1
	private Long edbbSubnum1;
	//edbbSubnum2
	private Long edbbSubnum2;
	//edbbSubnum3
	private Long edbbSubnum3;
	//edbbSubnum4
	private Long edbbSubnum4;
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
	//edbbEsiDeadline
	private Date edbbEsiDeadline;
	//edbbGateCloseTime
	private Date edbbGateCloseTime;

	/**
	 * Get edbbId
	 */
	@Column(name = "EDBB_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEdbbId() {
		return edbbId;
	}

	/**
	 * Set edbbId
	 */
	public void setEdbbId(Long edbbId) {
		this.edbbId = edbbId;
		addValidField("edbbId");
	}

	/**
	 * Get edbbEorbId
	 */
	@Column(name = "EDBB_EORB_ID")
	public Long getEdbbEorbId() {
		return edbbEorbId;
	}

	/**
	 * Set edbbEorbId
	 */
	public void setEdbbEorbId(Long edbbEorbId) {
		this.edbbEorbId = edbbEorbId;
		addValidField("edbbEorbId");
	}

	/**
	 * Get edbbEoorSinoNo
	 */
	@Column(name = "EDBB_EOOR_SINO_NO")
	public String getEdbbEoorSinoNo() {
		return edbbEoorSinoNo;
	}

	/**
	 * Set edbbEoorSinoNo
	 */
	public void setEdbbEoorSinoNo(String edbbEoorSinoNo) {
		this.edbbEoorSinoNo = edbbEoorSinoNo;
		addValidField("edbbEoorSinoNo");
	}

	/**
	 * Get edbbOrgCode
	 */
	@Column(name = "EDBB_ORG_CODE")
	public String getEdbbOrgCode() {
		return edbbOrgCode;
	}

	/**
	 * Set edbbOrgCode
	 */
	public void setEdbbOrgCode(String edbbOrgCode) {
		this.edbbOrgCode = edbbOrgCode;
		addValidField("edbbOrgCode");
	}

	/**
	 * Get edbbScCode
	 */
	@Column(name = "EDBB_SC_CODE")
	public String getEdbbScCode() {
		return edbbScCode;
	}

	/**
	 * Set edbbScCode
	 */
	public void setEdbbScCode(String edbbScCode) {
		this.edbbScCode = edbbScCode;
		addValidField("edbbScCode");
	}

	/**
	 * Get edbbRcCode
	 */
	@Column(name = "EDBB_RC_CODE")
	public String getEdbbRcCode() {
		return edbbRcCode;
	}

	/**
	 * Set edbbRcCode
	 */
	public void setEdbbRcCode(String edbbRcCode) {
		this.edbbRcCode = edbbRcCode;
		addValidField("edbbRcCode");
	}

	/**
	 * Get edbbFilename
	 */
	@Column(name = "EDBB_FILENAME")
	public String getEdbbFilename() {
		return edbbFilename;
	}

	/**
	 * Set edbbFilename
	 */
	public void setEdbbFilename(String edbbFilename) {
		this.edbbFilename = edbbFilename;
		addValidField("edbbFilename");
	}

	/**
	 * Get edbbFileType
	 */
	@Column(name = "EDBB_FILE_TYPE")
	public String getEdbbFileType() {
		return edbbFileType;
	}

	/**
	 * Set edbbFileType
	 */
	public void setEdbbFileType(String edbbFileType) {
		this.edbbFileType = edbbFileType;
		addValidField("edbbFileType");
	}

	/**
	 * Get edbbFlag
	 */
	@Column(name = "EDBB_FLAG")
	public String getEdbbFlag() {
		return edbbFlag;
	}

	/**
	 * Set edbbFlag
	 */
	public void setEdbbFlag(String edbbFlag) {
		this.edbbFlag = edbbFlag;
		addValidField("edbbFlag");
	}

	/**
	 * Get edbbDisposeTime
	 */
	@Column(name = "EDBB_DISPOSE_TIME")
	public Date getEdbbDisposeTime() {
		return edbbDisposeTime;
	}

	/**
	 * Set edbbDisposeTime
	 */
	public void setEdbbDisposeTime(Date edbbDisposeTime) {
		this.edbbDisposeTime = edbbDisposeTime;
		addValidField("edbbDisposeTime");
	}

	/**
	 * Get edbbEbpjFCode
	 */
	@Column(name = "EDBB_EBPJ_F_CODE")
	public Long getEdbbEbpjFCode() {
		return edbbEbpjFCode;
	}

	/**
	 * Set edbbEbpjFCode
	 */
	public void setEdbbEbpjFCode(Long edbbEbpjFCode) {
		this.edbbEbpjFCode = edbbEbpjFCode;
		addValidField("edbbEbpjFCode");
	}

	/**
	 * Get edbbBookingNo
	 */
	@Column(name = "EDBB_BOOKING_NO")
	public String getEdbbBookingNo() {
		return edbbBookingNo;
	}

	/**
	 * Set edbbBookingNo
	 */
	public void setEdbbBookingNo(String edbbBookingNo) {
		this.edbbBookingNo = edbbBookingNo;
		addValidField("edbbBookingNo");
	}

	/**
	 * Get edbbBulkBillNo
	 */
	@Column(name = "EDBB_BULK_BILL_NO")
	public String getEdbbBulkBillNo() {
		return edbbBulkBillNo;
	}

	/**
	 * Set edbbBulkBillNo
	 */
	public void setEdbbBulkBillNo(String edbbBulkBillNo) {
		this.edbbBulkBillNo = edbbBulkBillNo;
		addValidField("edbbBulkBillNo");
	}

	/**
	 * Get edbbFreightClauseCode
	 */
	@Column(name = "EDBB_FREIGHT_CLAUSE_CODE")
	public String getEdbbFreightClauseCode() {
		return edbbFreightClauseCode;
	}

	/**
	 * Set edbbFreightClauseCode
	 */
	public void setEdbbFreightClauseCode(String edbbFreightClauseCode) {
		this.edbbFreightClauseCode = edbbFreightClauseCode;
		addValidField("edbbFreightClauseCode");
	}

	/**
	 * Get edbbFreightClauseName
	 */
	@Column(name = "EDBB_FREIGHT_CLAUSE_NAME")
	public String getEdbbFreightClauseName() {
		return edbbFreightClauseName;
	}

	/**
	 * Set edbbFreightClauseName
	 */
	public void setEdbbFreightClauseName(String edbbFreightClauseName) {
		this.edbbFreightClauseName = edbbFreightClauseName;
		addValidField("edbbFreightClauseName");
	}

	/**
	 * Get edbbBookingPartyCode
	 */
	@Column(name = "EDBB_BOOKING_PARTY_CODE")
	public String getEdbbBookingPartyCode() {
		return edbbBookingPartyCode;
	}

	/**
	 * Set edbbBookingPartyCode
	 */
	public void setEdbbBookingPartyCode(String edbbBookingPartyCode) {
		this.edbbBookingPartyCode = edbbBookingPartyCode;
		addValidField("edbbBookingPartyCode");
	}

	/**
	 * Get edbbBookingPartyName
	 */
	@Column(name = "EDBB_BOOKING_PARTY_NAME")
	public String getEdbbBookingPartyName() {
		return edbbBookingPartyName;
	}

	/**
	 * Set edbbBookingPartyName
	 */
	public void setEdbbBookingPartyName(String edbbBookingPartyName) {
		this.edbbBookingPartyName = edbbBookingPartyName;
		addValidField("edbbBookingPartyName");
	}

	/**
	 * Get edbbIssuePartyCode
	 */
	@Column(name = "EDBB_ISSUE_PARTY_CODE")
	public String getEdbbIssuePartyCode() {
		return edbbIssuePartyCode;
	}

	/**
	 * Set edbbIssuePartyCode
	 */
	public void setEdbbIssuePartyCode(String edbbIssuePartyCode) {
		this.edbbIssuePartyCode = edbbIssuePartyCode;
		addValidField("edbbIssuePartyCode");
	}

	/**
	 * Get edbbIssueParty
	 */
	@Column(name = "EDBB_ISSUE_PARTY")
	public String getEdbbIssueParty() {
		return edbbIssueParty;
	}

	/**
	 * Set edbbIssueParty
	 */
	public void setEdbbIssueParty(String edbbIssueParty) {
		this.edbbIssueParty = edbbIssueParty;
		addValidField("edbbIssueParty");
	}

	/**
	 * Get edbbApplicantId
	 */
	@Column(name = "EDBB_APPLICANT_ID")
	public String getEdbbApplicantId() {
		return edbbApplicantId;
	}

	/**
	 * Set edbbApplicantId
	 */
	public void setEdbbApplicantId(String edbbApplicantId) {
		this.edbbApplicantId = edbbApplicantId;
		addValidField("edbbApplicantId");
	}

	/**
	 * Get edbbApplicant
	 */
	@Column(name = "EDBB_APPLICANT")
	public String getEdbbApplicant() {
		return edbbApplicant;
	}

	/**
	 * Set edbbApplicant
	 */
	public void setEdbbApplicant(String edbbApplicant) {
		this.edbbApplicant = edbbApplicant;
		addValidField("edbbApplicant");
	}

	/**
	 * Get edbbFobBkPartyId
	 */
	@Column(name = "EDBB_FOB_BK_PARTY_ID")
	public String getEdbbFobBkPartyId() {
		return edbbFobBkPartyId;
	}

	/**
	 * Set edbbFobBkPartyId
	 */
	public void setEdbbFobBkPartyId(String edbbFobBkPartyId) {
		this.edbbFobBkPartyId = edbbFobBkPartyId;
		addValidField("edbbFobBkPartyId");
	}

	/**
	 * Get edbbFobBkParty
	 */
	@Column(name = "EDBB_FOB_BK_PARTY")
	public String getEdbbFobBkParty() {
		return edbbFobBkParty;
	}

	/**
	 * Set edbbFobBkParty
	 */
	public void setEdbbFobBkParty(String edbbFobBkParty) {
		this.edbbFobBkParty = edbbFobBkParty;
		addValidField("edbbFobBkParty");
	}

	/**
	 * Get edbbTranshipmentFlag
	 */
	@Column(name = "EDBB_TRANSHIPMENT_FLAG")
	public String getEdbbTranshipmentFlag() {
		return edbbTranshipmentFlag;
	}

	/**
	 * Set edbbTranshipmentFlag
	 */
	public void setEdbbTranshipmentFlag(String edbbTranshipmentFlag) {
		this.edbbTranshipmentFlag = edbbTranshipmentFlag;
		addValidField("edbbTranshipmentFlag");
	}

	/**
	 * Get edbbBatchFlag
	 */
	@Column(name = "EDBB_BATCH_FLAG")
	public String getEdbbBatchFlag() {
		return edbbBatchFlag;
	}

	/**
	 * Set edbbBatchFlag
	 */
	public void setEdbbBatchFlag(String edbbBatchFlag) {
		this.edbbBatchFlag = edbbBatchFlag;
		addValidField("edbbBatchFlag");
	}

	/**
	 * Get edbbShipmentDate
	 */
	@Column(name = "EDBB_SHIPMENT_DATE")
	public Date getEdbbShipmentDate() {
		return edbbShipmentDate;
	}

	/**
	 * Set edbbShipmentDate
	 */
	public void setEdbbShipmentDate(Date edbbShipmentDate) {
		this.edbbShipmentDate = edbbShipmentDate;
		addValidField("edbbShipmentDate");
	}

	/**
	 * Get edbbExpiryDate
	 */
	@Column(name = "EDBB_EXPIRY_DATE")
	public Date getEdbbExpiryDate() {
		return edbbExpiryDate;
	}

	/**
	 * Set edbbExpiryDate
	 */
	public void setEdbbExpiryDate(Date edbbExpiryDate) {
		this.edbbExpiryDate = edbbExpiryDate;
		addValidField("edbbExpiryDate");
	}

	/**
	 * Get edbbQuotationNo
	 */
	@Column(name = "EDBB_QUOTATION_NO")
	public String getEdbbQuotationNo() {
		return edbbQuotationNo;
	}

	/**
	 * Set edbbQuotationNo
	 */
	public void setEdbbQuotationNo(String edbbQuotationNo) {
		this.edbbQuotationNo = edbbQuotationNo;
		addValidField("edbbQuotationNo");
	}

	/**
	 * Get edbbChargeType
	 */
	@Column(name = "EDBB_CHARGE_TYPE")
	public String getEdbbChargeType() {
		return edbbChargeType;
	}

	/**
	 * Set edbbChargeType
	 */
	public void setEdbbChargeType(String edbbChargeType) {
		this.edbbChargeType = edbbChargeType;
		addValidField("edbbChargeType");
	}

	/**
	 * Get edbbServiceContractNo
	 */
	@Column(name = "EDBB_SERVICE_CONTRACT_NO")
	public String getEdbbServiceContractNo() {
		return edbbServiceContractNo;
	}

	/**
	 * Set edbbServiceContractNo
	 */
	public void setEdbbServiceContractNo(String edbbServiceContractNo) {
		this.edbbServiceContractNo = edbbServiceContractNo;
		addValidField("edbbServiceContractNo");
	}

	/**
	 * Get edbbBondNo
	 */
	@Column(name = "EDBB_BOND_NO")
	public String getEdbbBondNo() {
		return edbbBondNo;
	}

	/**
	 * Set edbbBondNo
	 */
	public void setEdbbBondNo(String edbbBondNo) {
		this.edbbBondNo = edbbBondNo;
		addValidField("edbbBondNo");
	}

	/**
	 * Get edbbSlotCharterFlag
	 */
	@Column(name = "EDBB_SLOT_CHARTER_FLAG")
	public String getEdbbSlotCharterFlag() {
		return edbbSlotCharterFlag;
	}

	/**
	 * Set edbbSlotCharterFlag
	 */
	public void setEdbbSlotCharterFlag(String edbbSlotCharterFlag) {
		this.edbbSlotCharterFlag = edbbSlotCharterFlag;
		addValidField("edbbSlotCharterFlag");
	}

	/**
	 * Get edbbAmsCode
	 */
	@Column(name = "EDBB_AMS_CODE")
	public String getEdbbAmsCode() {
		return edbbAmsCode;
	}

	/**
	 * Set edbbAmsCode
	 */
	public void setEdbbAmsCode(String edbbAmsCode) {
		this.edbbAmsCode = edbbAmsCode;
		addValidField("edbbAmsCode");
	}

	/**
	 * Get edbbMainBlNo
	 */
	@Column(name = "EDBB_MAIN_BL_NO")
	public String getEdbbMainBlNo() {
		return edbbMainBlNo;
	}

	/**
	 * Set edbbMainBlNo
	 */
	public void setEdbbMainBlNo(String edbbMainBlNo) {
		this.edbbMainBlNo = edbbMainBlNo;
		addValidField("edbbMainBlNo");
	}

	/**
	 * Get edbbBlViseType
	 */
	@Column(name = "EDBB_BL_VISE_TYPE")
	public String getEdbbBlViseType() {
		return edbbBlViseType;
	}

	/**
	 * Set edbbBlViseType
	 */
	public void setEdbbBlViseType(String edbbBlViseType) {
		this.edbbBlViseType = edbbBlViseType;
		addValidField("edbbBlViseType");
	}

	/**
	 * Get edbbBlIssuePlaceCode
	 */
	@Column(name = "EDBB_BL_ISSUE_PLACE_CODE")
	public String getEdbbBlIssuePlaceCode() {
		return edbbBlIssuePlaceCode;
	}

	/**
	 * Set edbbBlIssuePlaceCode
	 */
	public void setEdbbBlIssuePlaceCode(String edbbBlIssuePlaceCode) {
		this.edbbBlIssuePlaceCode = edbbBlIssuePlaceCode;
		addValidField("edbbBlIssuePlaceCode");
	}

	/**
	 * Get edbbBlIssuePlace
	 */
	@Column(name = "EDBB_BL_ISSUE_PLACE")
	public String getEdbbBlIssuePlace() {
		return edbbBlIssuePlace;
	}

	/**
	 * Set edbbBlIssuePlace
	 */
	public void setEdbbBlIssuePlace(String edbbBlIssuePlace) {
		this.edbbBlIssuePlace = edbbBlIssuePlace;
		addValidField("edbbBlIssuePlace");
	}

	/**
	 * Get edbbBlIssueDate
	 */
	@Column(name = "EDBB_BL_ISSUE_DATE")
	public Date getEdbbBlIssueDate() {
		return edbbBlIssueDate;
	}

	/**
	 * Set edbbBlIssueDate
	 */
	public void setEdbbBlIssueDate(Date edbbBlIssueDate) {
		this.edbbBlIssueDate = edbbBlIssueDate;
		addValidField("edbbBlIssueDate");
	}

	/**
	 * Get edbbBlCopyNum
	 */
	@Column(name = "EDBB_BL_COPY_NUM")
	public Integer getEdbbBlCopyNum() {
		return edbbBlCopyNum;
	}

	/**
	 * Set edbbBlCopyNum
	 */
	public void setEdbbBlCopyNum(Integer edbbBlCopyNum) {
		this.edbbBlCopyNum = edbbBlCopyNum;
		addValidField("edbbBlCopyNum");
	}

	/**
	 * Get edbbPrepaidPlaceCode
	 */
	@Column(name = "EDBB_PREPAID_PLACE_CODE")
	public String getEdbbPrepaidPlaceCode() {
		return edbbPrepaidPlaceCode;
	}

	/**
	 * Set edbbPrepaidPlaceCode
	 */
	public void setEdbbPrepaidPlaceCode(String edbbPrepaidPlaceCode) {
		this.edbbPrepaidPlaceCode = edbbPrepaidPlaceCode;
		addValidField("edbbPrepaidPlaceCode");
	}

	/**
	 * Get edbbPrepaidPlaceName
	 */
	@Column(name = "EDBB_PREPAID_PLACE_NAME")
	public String getEdbbPrepaidPlaceName() {
		return edbbPrepaidPlaceName;
	}

	/**
	 * Set edbbPrepaidPlaceName
	 */
	public void setEdbbPrepaidPlaceName(String edbbPrepaidPlaceName) {
		this.edbbPrepaidPlaceName = edbbPrepaidPlaceName;
		addValidField("edbbPrepaidPlaceName");
	}

	/**
	 * Get edbbPayPlaceCode
	 */
	@Column(name = "EDBB_PAY_PLACE_CODE")
	public String getEdbbPayPlaceCode() {
		return edbbPayPlaceCode;
	}

	/**
	 * Set edbbPayPlaceCode
	 */
	public void setEdbbPayPlaceCode(String edbbPayPlaceCode) {
		this.edbbPayPlaceCode = edbbPayPlaceCode;
		addValidField("edbbPayPlaceCode");
	}

	/**
	 * Get edbbPayPlaceName
	 */
	@Column(name = "EDBB_PAY_PLACE_NAME")
	public String getEdbbPayPlaceName() {
		return edbbPayPlaceName;
	}

	/**
	 * Set edbbPayPlaceName
	 */
	public void setEdbbPayPlaceName(String edbbPayPlaceName) {
		this.edbbPayPlaceName = edbbPayPlaceName;
		addValidField("edbbPayPlaceName");
	}

	/**
	 * Get edbbVesselCall
	 */
	@Column(name = "EDBB_VESSEL_CALL")
	public String getEdbbVesselCall() {
		return edbbVesselCall;
	}

	/**
	 * Set edbbVesselCall
	 */
	public void setEdbbVesselCall(String edbbVesselCall) {
		this.edbbVesselCall = edbbVesselCall;
		addValidField("edbbVesselCall");
	}

	/**
	 * Get edbbVesselName
	 */
	@Column(name = "EDBB_VESSEL_NAME")
	public String getEdbbVesselName() {
		return edbbVesselName;
	}

	/**
	 * Set edbbVesselName
	 */
	public void setEdbbVesselName(String edbbVesselName) {
		this.edbbVesselName = edbbVesselName;
		addValidField("edbbVesselName");
	}

	/**
	 * Get edbbVoyage
	 */
	@Column(name = "EDBB_VOYAGE")
	public String getEdbbVoyage() {
		return edbbVoyage;
	}

	/**
	 * Set edbbVoyage
	 */
	public void setEdbbVoyage(String edbbVoyage) {
		this.edbbVoyage = edbbVoyage;
		addValidField("edbbVoyage");
	}

	/**
	 * Get edbbCarrierCode
	 */
	@Column(name = "EDBB_CARRIER_CODE")
	public String getEdbbCarrierCode() {
		return edbbCarrierCode;
	}

	/**
	 * Set edbbCarrierCode
	 */
	public void setEdbbCarrierCode(String edbbCarrierCode) {
		this.edbbCarrierCode = edbbCarrierCode;
		addValidField("edbbCarrierCode");
	}

	/**
	 * Get edbbCarrierName
	 */
	@Column(name = "EDBB_CARRIER_NAME")
	public String getEdbbCarrierName() {
		return edbbCarrierName;
	}

	/**
	 * Set edbbCarrierName
	 */
	public void setEdbbCarrierName(String edbbCarrierName) {
		this.edbbCarrierName = edbbCarrierName;
		addValidField("edbbCarrierName");
	}

	/**
	 * Get edbbBlCarrierCode
	 */
	@Column(name = "EDBB_BL_CARRIER_CODE")
	public String getEdbbBlCarrierCode() {
		return edbbBlCarrierCode;
	}

	/**
	 * Set edbbBlCarrierCode
	 */
	public void setEdbbBlCarrierCode(String edbbBlCarrierCode) {
		this.edbbBlCarrierCode = edbbBlCarrierCode;
		addValidField("edbbBlCarrierCode");
	}

	/**
	 * Get edbbBlCarrierName
	 */
	@Column(name = "EDBB_BL_CARRIER_NAME")
	public String getEdbbBlCarrierName() {
		return edbbBlCarrierName;
	}

	/**
	 * Set edbbBlCarrierName
	 */
	public void setEdbbBlCarrierName(String edbbBlCarrierName) {
		this.edbbBlCarrierName = edbbBlCarrierName;
		addValidField("edbbBlCarrierName");
	}

	/**
	 * Get edbbRequestEtd
	 */
	@Column(name = "EDBB_REQUEST_ETD")
	public Date getEdbbRequestEtd() {
		return edbbRequestEtd;
	}

	/**
	 * Set edbbRequestEtd
	 */
	public void setEdbbRequestEtd(Date edbbRequestEtd) {
		this.edbbRequestEtd = edbbRequestEtd;
		addValidField("edbbRequestEtd");
	}

	/**
	 * Get edbbTradeId
	 */
	@Column(name = "EDBB_TRADE_ID")
	public String getEdbbTradeId() {
		return edbbTradeId;
	}

	/**
	 * Set edbbTradeId
	 */
	public void setEdbbTradeId(String edbbTradeId) {
		this.edbbTradeId = edbbTradeId;
		addValidField("edbbTradeId");
	}

	/**
	 * Get edbbTrade
	 */
	@Column(name = "EDBB_TRADE")
	public String getEdbbTrade() {
		return edbbTrade;
	}

	/**
	 * Set edbbTrade
	 */
	public void setEdbbTrade(String edbbTrade) {
		this.edbbTrade = edbbTrade;
		addValidField("edbbTrade");
	}

	/**
	 * Get edbbPreVesselCode
	 */
	@Column(name = "EDBB_PRE_VESSEL_CODE")
	public String getEdbbPreVesselCode() {
		return edbbPreVesselCode;
	}

	/**
	 * Set edbbPreVesselCode
	 */
	public void setEdbbPreVesselCode(String edbbPreVesselCode) {
		this.edbbPreVesselCode = edbbPreVesselCode;
		addValidField("edbbPreVesselCode");
	}

	/**
	 * Get edbbPreVesselName
	 */
	@Column(name = "EDBB_PRE_VESSEL_NAME")
	public String getEdbbPreVesselName() {
		return edbbPreVesselName;
	}

	/**
	 * Set edbbPreVesselName
	 */
	public void setEdbbPreVesselName(String edbbPreVesselName) {
		this.edbbPreVesselName = edbbPreVesselName;
		addValidField("edbbPreVesselName");
	}

	/**
	 * Get edbbPreVoyage
	 */
	@Column(name = "EDBB_PRE_VOYAGE")
	public String getEdbbPreVoyage() {
		return edbbPreVoyage;
	}

	/**
	 * Set edbbPreVoyage
	 */
	public void setEdbbPreVoyage(String edbbPreVoyage) {
		this.edbbPreVoyage = edbbPreVoyage;
		addValidField("edbbPreVoyage");
	}

	/**
	 * Get edbbNextVesselCode
	 */
	@Column(name = "EDBB_NEXT_VESSEL_CODE")
	public String getEdbbNextVesselCode() {
		return edbbNextVesselCode;
	}

	/**
	 * Set edbbNextVesselCode
	 */
	public void setEdbbNextVesselCode(String edbbNextVesselCode) {
		this.edbbNextVesselCode = edbbNextVesselCode;
		addValidField("edbbNextVesselCode");
	}

	/**
	 * Get edbbNextVessel
	 */
	@Column(name = "EDBB_NEXT_VESSEL")
	public String getEdbbNextVessel() {
		return edbbNextVessel;
	}

	/**
	 * Set edbbNextVessel
	 */
	public void setEdbbNextVessel(String edbbNextVessel) {
		this.edbbNextVessel = edbbNextVessel;
		addValidField("edbbNextVessel");
	}

	/**
	 * Get edbbNextVoyage
	 */
	@Column(name = "EDBB_NEXT_VOYAGE")
	public String getEdbbNextVoyage() {
		return edbbNextVoyage;
	}

	/**
	 * Set edbbNextVoyage
	 */
	public void setEdbbNextVoyage(String edbbNextVoyage) {
		this.edbbNextVoyage = edbbNextVoyage;
		addValidField("edbbNextVoyage");
	}

	/**
	 * Get edbbNextEtd
	 */
	@Column(name = "EDBB_NEXT_ETD")
	public Date getEdbbNextEtd() {
		return edbbNextEtd;
	}

	/**
	 * Set edbbNextEtd
	 */
	public void setEdbbNextEtd(Date edbbNextEtd) {
		this.edbbNextEtd = edbbNextEtd;
		addValidField("edbbNextEtd");
	}

	/**
	 * Get edbbNextAtd
	 */
	@Column(name = "EDBB_NEXT_ATD")
	public Date getEdbbNextAtd() {
		return edbbNextAtd;
	}

	/**
	 * Set edbbNextAtd
	 */
	public void setEdbbNextAtd(Date edbbNextAtd) {
		this.edbbNextAtd = edbbNextAtd;
		addValidField("edbbNextAtd");
	}

	/**
	 * Get edbbNextTransCode
	 */
	@Column(name = "EDBB_NEXT_TRANS_CODE")
	public String getEdbbNextTransCode() {
		return edbbNextTransCode;
	}

	/**
	 * Set edbbNextTransCode
	 */
	public void setEdbbNextTransCode(String edbbNextTransCode) {
		this.edbbNextTransCode = edbbNextTransCode;
		addValidField("edbbNextTransCode");
	}

	/**
	 * Get edbbNextArea
	 */
	@Column(name = "EDBB_NEXT_AREA")
	public String getEdbbNextArea() {
		return edbbNextArea;
	}

	/**
	 * Set edbbNextArea
	 */
	public void setEdbbNextArea(String edbbNextArea) {
		this.edbbNextArea = edbbNextArea;
		addValidField("edbbNextArea");
	}

	/**
	 * Get edbbNextTransEtd
	 */
	@Column(name = "EDBB_NEXT_TRANS_ETD")
	public Date getEdbbNextTransEtd() {
		return edbbNextTransEtd;
	}

	/**
	 * Set edbbNextTransEtd
	 */
	public void setEdbbNextTransEtd(Date edbbNextTransEtd) {
		this.edbbNextTransEtd = edbbNextTransEtd;
		addValidField("edbbNextTransEtd");
	}

	/**
	 * Get edbbNextTransAtd
	 */
	@Column(name = "EDBB_NEXT_TRANS_ATD")
	public Date getEdbbNextTransAtd() {
		return edbbNextTransAtd;
	}

	/**
	 * Set edbbNextTransAtd
	 */
	public void setEdbbNextTransAtd(Date edbbNextTransAtd) {
		this.edbbNextTransAtd = edbbNextTransAtd;
		addValidField("edbbNextTransAtd");
	}

	/**
	 * Get edbbNextDestiEtd
	 */
	@Column(name = "EDBB_NEXT_DESTI_ETD")
	public Date getEdbbNextDestiEtd() {
		return edbbNextDestiEtd;
	}

	/**
	 * Set edbbNextDestiEtd
	 */
	public void setEdbbNextDestiEtd(Date edbbNextDestiEtd) {
		this.edbbNextDestiEtd = edbbNextDestiEtd;
		addValidField("edbbNextDestiEtd");
	}

	/**
	 * Get edbbNextDestiAtd
	 */
	@Column(name = "EDBB_NEXT_DESTI_ATD")
	public Date getEdbbNextDestiAtd() {
		return edbbNextDestiAtd;
	}

	/**
	 * Set edbbNextDestiAtd
	 */
	public void setEdbbNextDestiAtd(Date edbbNextDestiAtd) {
		this.edbbNextDestiAtd = edbbNextDestiAtd;
		addValidField("edbbNextDestiAtd");
	}

	/**
	 * Get edbbReceiptPlaceCode
	 */
	@Column(name = "EDBB_RECEIPT_PLACE_CODE")
	public String getEdbbReceiptPlaceCode() {
		return edbbReceiptPlaceCode;
	}

	/**
	 * Set edbbReceiptPlaceCode
	 */
	public void setEdbbReceiptPlaceCode(String edbbReceiptPlaceCode) {
		this.edbbReceiptPlaceCode = edbbReceiptPlaceCode;
		addValidField("edbbReceiptPlaceCode");
	}

	/**
	 * Get edbbReceiptPlaceName
	 */
	@Column(name = "EDBB_RECEIPT_PLACE_NAME")
	public String getEdbbReceiptPlaceName() {
		return edbbReceiptPlaceName;
	}

	/**
	 * Set edbbReceiptPlaceName
	 */
	public void setEdbbReceiptPlaceName(String edbbReceiptPlaceName) {
		this.edbbReceiptPlaceName = edbbReceiptPlaceName;
		addValidField("edbbReceiptPlaceName");
	}

	/**
	 * Get edbbLoadPortCode
	 */
	@Column(name = "EDBB_LOAD_PORT_CODE")
	public String getEdbbLoadPortCode() {
		return edbbLoadPortCode;
	}

	/**
	 * Set edbbLoadPortCode
	 */
	public void setEdbbLoadPortCode(String edbbLoadPortCode) {
		this.edbbLoadPortCode = edbbLoadPortCode;
		addValidField("edbbLoadPortCode");
	}

	/**
	 * Get edbbLoadPortName
	 */
	@Column(name = "EDBB_LOAD_PORT_NAME")
	public String getEdbbLoadPortName() {
		return edbbLoadPortName;
	}

	/**
	 * Set edbbLoadPortName
	 */
	public void setEdbbLoadPortName(String edbbLoadPortName) {
		this.edbbLoadPortName = edbbLoadPortName;
		addValidField("edbbLoadPortName");
	}

	/**
	 * Get edbbDischargePortCode
	 */
	@Column(name = "EDBB_DISCHARGE_PORT_CODE")
	public String getEdbbDischargePortCode() {
		return edbbDischargePortCode;
	}

	/**
	 * Set edbbDischargePortCode
	 */
	public void setEdbbDischargePortCode(String edbbDischargePortCode) {
		this.edbbDischargePortCode = edbbDischargePortCode;
		addValidField("edbbDischargePortCode");
	}

	/**
	 * Get edbbDischargePortName
	 */
	@Column(name = "EDBB_DISCHARGE_PORT_NAME")
	public String getEdbbDischargePortName() {
		return edbbDischargePortName;
	}

	/**
	 * Set edbbDischargePortName
	 */
	public void setEdbbDischargePortName(String edbbDischargePortName) {
		this.edbbDischargePortName = edbbDischargePortName;
		addValidField("edbbDischargePortName");
	}

	/**
	 * Get edbbTransferPortCode
	 */
	@Column(name = "EDBB_TRANSFER_PORT_CODE")
	public String getEdbbTransferPortCode() {
		return edbbTransferPortCode;
	}

	/**
	 * Set edbbTransferPortCode
	 */
	public void setEdbbTransferPortCode(String edbbTransferPortCode) {
		this.edbbTransferPortCode = edbbTransferPortCode;
		addValidField("edbbTransferPortCode");
	}

	/**
	 * Get edbbTransferPortName
	 */
	@Column(name = "EDBB_TRANSFER_PORT_NAME")
	public String getEdbbTransferPortName() {
		return edbbTransferPortName;
	}

	/**
	 * Set edbbTransferPortName
	 */
	public void setEdbbTransferPortName(String edbbTransferPortName) {
		this.edbbTransferPortName = edbbTransferPortName;
		addValidField("edbbTransferPortName");
	}

	/**
	 * Get edbbDeliveryPlaceCode
	 */
	@Column(name = "EDBB_DELIVERY_PLACE_CODE")
	public String getEdbbDeliveryPlaceCode() {
		return edbbDeliveryPlaceCode;
	}

	/**
	 * Set edbbDeliveryPlaceCode
	 */
	public void setEdbbDeliveryPlaceCode(String edbbDeliveryPlaceCode) {
		this.edbbDeliveryPlaceCode = edbbDeliveryPlaceCode;
		addValidField("edbbDeliveryPlaceCode");
	}

	/**
	 * Get edbbDeliveryPlaceName
	 */
	@Column(name = "EDBB_DELIVERY_PLACE_NAME")
	public String getEdbbDeliveryPlaceName() {
		return edbbDeliveryPlaceName;
	}

	/**
	 * Set edbbDeliveryPlaceName
	 */
	public void setEdbbDeliveryPlaceName(String edbbDeliveryPlaceName) {
		this.edbbDeliveryPlaceName = edbbDeliveryPlaceName;
		addValidField("edbbDeliveryPlaceName");
	}

	/**
	 * Get edbbFinalDestinationCode
	 */
	@Column(name = "EDBB_FINAL_DESTINATION_CODE")
	public String getEdbbFinalDestinationCode() {
		return edbbFinalDestinationCode;
	}

	/**
	 * Set edbbFinalDestinationCode
	 */
	public void setEdbbFinalDestinationCode(String edbbFinalDestinationCode) {
		this.edbbFinalDestinationCode = edbbFinalDestinationCode;
		addValidField("edbbFinalDestinationCode");
	}

	/**
	 * Get edbbFinalDestination
	 */
	@Column(name = "EDBB_FINAL_DESTINATION")
	public String getEdbbFinalDestination() {
		return edbbFinalDestination;
	}

	/**
	 * Set edbbFinalDestination
	 */
	public void setEdbbFinalDestination(String edbbFinalDestination) {
		this.edbbFinalDestination = edbbFinalDestination;
		addValidField("edbbFinalDestination");
	}

	/**
	 * Get edbbDepotCode
	 */
	@Column(name = "EDBB_DEPOT_CODE")
	public String getEdbbDepotCode() {
		return edbbDepotCode;
	}

	/**
	 * Set edbbDepotCode
	 */
	public void setEdbbDepotCode(String edbbDepotCode) {
		this.edbbDepotCode = edbbDepotCode;
		addValidField("edbbDepotCode");
	}

	/**
	 * Get edbbTransferPlaceCode
	 */
	@Column(name = "EDBB_TRANSFER_PLACE_CODE")
	public String getEdbbTransferPlaceCode() {
		return edbbTransferPlaceCode;
	}

	/**
	 * Set edbbTransferPlaceCode
	 */
	public void setEdbbTransferPlaceCode(String edbbTransferPlaceCode) {
		this.edbbTransferPlaceCode = edbbTransferPlaceCode;
		addValidField("edbbTransferPlaceCode");
	}

	/**
	 * Get edbbTransferPlaceName
	 */
	@Column(name = "EDBB_TRANSFER_PLACE_NAME")
	public String getEdbbTransferPlaceName() {
		return edbbTransferPlaceName;
	}

	/**
	 * Set edbbTransferPlaceName
	 */
	public void setEdbbTransferPlaceName(String edbbTransferPlaceName) {
		this.edbbTransferPlaceName = edbbTransferPlaceName;
		addValidField("edbbTransferPlaceName");
	}

	/**
	 * Get edbbOptDischargePortCode1
	 */
	@Column(name = "EDBB_OPT_DISCHARGE_PORT_CODE1")
	public String getEdbbOptDischargePortCode1() {
		return edbbOptDischargePortCode1;
	}

	/**
	 * Set edbbOptDischargePortCode1
	 */
	public void setEdbbOptDischargePortCode1(String edbbOptDischargePortCode1) {
		this.edbbOptDischargePortCode1 = edbbOptDischargePortCode1;
		addValidField("edbbOptDischargePortCode1");
	}

	/**
	 * Get edbbOptDischargePort1
	 */
	@Column(name = "EDBB_OPT_DISCHARGE_PORT1")
	public String getEdbbOptDischargePort1() {
		return edbbOptDischargePort1;
	}

	/**
	 * Set edbbOptDischargePort1
	 */
	public void setEdbbOptDischargePort1(String edbbOptDischargePort1) {
		this.edbbOptDischargePort1 = edbbOptDischargePort1;
		addValidField("edbbOptDischargePort1");
	}

	/**
	 * Get edbbOptDeliveryPlaceCode
	 */
	@Column(name = "EDBB_OPT_DELIVERY_PLACE_CODE")
	public String getEdbbOptDeliveryPlaceCode() {
		return edbbOptDeliveryPlaceCode;
	}

	/**
	 * Set edbbOptDeliveryPlaceCode
	 */
	public void setEdbbOptDeliveryPlaceCode(String edbbOptDeliveryPlaceCode) {
		this.edbbOptDeliveryPlaceCode = edbbOptDeliveryPlaceCode;
		addValidField("edbbOptDeliveryPlaceCode");
	}

	/**
	 * Get edbbOptDeliveryPlace
	 */
	@Column(name = "EDBB_OPT_DELIVERY_PLACE")
	public String getEdbbOptDeliveryPlace() {
		return edbbOptDeliveryPlace;
	}

	/**
	 * Set edbbOptDeliveryPlace
	 */
	public void setEdbbOptDeliveryPlace(String edbbOptDeliveryPlace) {
		this.edbbOptDeliveryPlace = edbbOptDeliveryPlace;
		addValidField("edbbOptDeliveryPlace");
	}

	/**
	 * Get edbbSurchargeCode
	 */
	@Column(name = "EDBB_SURCHARGE_CODE")
	public String getEdbbSurchargeCode() {
		return edbbSurchargeCode;
	}

	/**
	 * Set edbbSurchargeCode
	 */
	public void setEdbbSurchargeCode(String edbbSurchargeCode) {
		this.edbbSurchargeCode = edbbSurchargeCode;
		addValidField("edbbSurchargeCode");
	}

	/**
	 * Get edbbSurchargeRemark
	 */
	@Column(name = "EDBB_SURCHARGE_REMARK")
	public String getEdbbSurchargeRemark() {
		return edbbSurchargeRemark;
	}

	/**
	 * Set edbbSurchargeRemark
	 */
	public void setEdbbSurchargeRemark(String edbbSurchargeRemark) {
		this.edbbSurchargeRemark = edbbSurchargeRemark;
		addValidField("edbbSurchargeRemark");
	}

	/**
	 * Get edbbRemark
	 */
	@Column(name = "EDBB_REMARK")
	public String getEdbbRemark() {
		return edbbRemark;
	}

	/**
	 * Set edbbRemark
	 */
	public void setEdbbRemark(String edbbRemark) {
		this.edbbRemark = edbbRemark;
		addValidField("edbbRemark");
	}

	/**
	 * Get edbbCurrency
	 */
	@Column(name = "EDBB_CURRENCY")
	public String getEdbbCurrency() {
		return edbbCurrency;
	}

	/**
	 * Set edbbCurrency
	 */
	public void setEdbbCurrency(String edbbCurrency) {
		this.edbbCurrency = edbbCurrency;
		addValidField("edbbCurrency");
	}

	/**
	 * Get edbbAmount
	 */
	@Column(name = "EDBB_AMOUNT")
	public Double getEdbbAmount() {
		return edbbAmount;
	}

	/**
	 * Set edbbAmount
	 */
	public void setEdbbAmount(Double edbbAmount) {
		this.edbbAmount = edbbAmount;
		addValidField("edbbAmount");
	}

	/**
	 * Get edbbShipperCode
	 */
	@Column(name = "EDBB_SHIPPER_CODE")
	public String getEdbbShipperCode() {
		return edbbShipperCode;
	}

	/**
	 * Set edbbShipperCode
	 */
	public void setEdbbShipperCode(String edbbShipperCode) {
		this.edbbShipperCode = edbbShipperCode;
		addValidField("edbbShipperCode");
	}

	/**
	 * Get edbbShipper
	 */
	@Column(name = "EDBB_SHIPPER")
	public String getEdbbShipper() {
		return edbbShipper;
	}

	/**
	 * Set edbbShipper
	 */
	public void setEdbbShipper(String edbbShipper) {
		this.edbbShipper = edbbShipper;
		addValidField("edbbShipper");
	}

	/**
	 * Get edbbConsigneeCode
	 */
	@Column(name = "EDBB_CONSIGNEE_CODE")
	public String getEdbbConsigneeCode() {
		return edbbConsigneeCode;
	}

	/**
	 * Set edbbConsigneeCode
	 */
	public void setEdbbConsigneeCode(String edbbConsigneeCode) {
		this.edbbConsigneeCode = edbbConsigneeCode;
		addValidField("edbbConsigneeCode");
	}

	/**
	 * Get edbbConsignee
	 */
	@Column(name = "EDBB_CONSIGNEE")
	public String getEdbbConsignee() {
		return edbbConsignee;
	}

	/**
	 * Set edbbConsignee
	 */
	public void setEdbbConsignee(String edbbConsignee) {
		this.edbbConsignee = edbbConsignee;
		addValidField("edbbConsignee");
	}

	/**
	 * Get edbbNotifyCode
	 */
	@Column(name = "EDBB_NOTIFY_CODE")
	public String getEdbbNotifyCode() {
		return edbbNotifyCode;
	}

	/**
	 * Set edbbNotifyCode
	 */
	public void setEdbbNotifyCode(String edbbNotifyCode) {
		this.edbbNotifyCode = edbbNotifyCode;
		addValidField("edbbNotifyCode");
	}

	/**
	 * Get edbbNotify
	 */
	@Column(name = "EDBB_NOTIFY")
	public String getEdbbNotify() {
		return edbbNotify;
	}

	/**
	 * Set edbbNotify
	 */
	public void setEdbbNotify(String edbbNotify) {
		this.edbbNotify = edbbNotify;
		addValidField("edbbNotify");
	}

	/**
	 * Get edbbSecondNotifyCode
	 */
	@Column(name = "EDBB_SECOND_NOTIFY_CODE")
	public String getEdbbSecondNotifyCode() {
		return edbbSecondNotifyCode;
	}

	/**
	 * Set edbbSecondNotifyCode
	 */
	public void setEdbbSecondNotifyCode(String edbbSecondNotifyCode) {
		this.edbbSecondNotifyCode = edbbSecondNotifyCode;
		addValidField("edbbSecondNotifyCode");
	}

	/**
	 * Get edbbSecondNotify
	 */
	@Column(name = "EDBB_SECOND_NOTIFY")
	public String getEdbbSecondNotify() {
		return edbbSecondNotify;
	}

	/**
	 * Set edbbSecondNotify
	 */
	public void setEdbbSecondNotify(String edbbSecondNotify) {
		this.edbbSecondNotify = edbbSecondNotify;
		addValidField("edbbSecondNotify");
	}

	/**
	 * Get edbbThirdNotifyCode
	 */
	@Column(name = "EDBB_THIRD_NOTIFY_CODE")
	public String getEdbbThirdNotifyCode() {
		return edbbThirdNotifyCode;
	}

	/**
	 * Set edbbThirdNotifyCode
	 */
	public void setEdbbThirdNotifyCode(String edbbThirdNotifyCode) {
		this.edbbThirdNotifyCode = edbbThirdNotifyCode;
		addValidField("edbbThirdNotifyCode");
	}

	/**
	 * Get edbbThirdNotify
	 */
	@Column(name = "EDBB_THIRD_NOTIFY")
	public String getEdbbThirdNotify() {
		return edbbThirdNotify;
	}

	/**
	 * Set edbbThirdNotify
	 */
	public void setEdbbThirdNotify(String edbbThirdNotify) {
		this.edbbThirdNotify = edbbThirdNotify;
		addValidField("edbbThirdNotify");
	}

	/**
	 * Get edbbIntermediateCarrgier
	 */
	@Column(name = "EDBB_INTERMEDIATE_CARRGIER")
	public String getEdbbIntermediateCarrgier() {
		return edbbIntermediateCarrgier;
	}

	/**
	 * Set edbbIntermediateCarrgier
	 */
	public void setEdbbIntermediateCarrgier(String edbbIntermediateCarrgier) {
		this.edbbIntermediateCarrgier = edbbIntermediateCarrgier;
		addValidField("edbbIntermediateCarrgier");
	}

	/**
	 * Get edbbTelInterCarrgier
	 */
	@Column(name = "EDBB_TEL_INTER_CARRGIER")
	public String getEdbbTelInterCarrgier() {
		return edbbTelInterCarrgier;
	}

	/**
	 * Set edbbTelInterCarrgier
	 */
	public void setEdbbTelInterCarrgier(String edbbTelInterCarrgier) {
		this.edbbTelInterCarrgier = edbbTelInterCarrgier;
		addValidField("edbbTelInterCarrgier");
	}

	/**
	 * Get edbbEmailInterCarrgier
	 */
	@Column(name = "EDBB_EMAIL_INTER_CARRGIER")
	public String getEdbbEmailInterCarrgier() {
		return edbbEmailInterCarrgier;
	}

	/**
	 * Set edbbEmailInterCarrgier
	 */
	public void setEdbbEmailInterCarrgier(String edbbEmailInterCarrgier) {
		this.edbbEmailInterCarrgier = edbbEmailInterCarrgier;
		addValidField("edbbEmailInterCarrgier");
	}

	/**
	 * Get edbbFaxInterCarrgier
	 */
	@Column(name = "EDBB_FAX_INTER_CARRGIER")
	public String getEdbbFaxInterCarrgier() {
		return edbbFaxInterCarrgier;
	}

	/**
	 * Set edbbFaxInterCarrgier
	 */
	public void setEdbbFaxInterCarrgier(String edbbFaxInterCarrgier) {
		this.edbbFaxInterCarrgier = edbbFaxInterCarrgier;
		addValidField("edbbFaxInterCarrgier");
	}

	/**
	 * Get edbbStreetNumberPoboxDc
	 */
	@Column(name = "EDBB_STREET_NUMBER_POBOX_DC")
	public String getEdbbStreetNumberPoboxDc() {
		return edbbStreetNumberPoboxDc;
	}

	/**
	 * Set edbbStreetNumberPoboxDc
	 */
	public void setEdbbStreetNumberPoboxDc(String edbbStreetNumberPoboxDc) {
		this.edbbStreetNumberPoboxDc = edbbStreetNumberPoboxDc;
		addValidField("edbbStreetNumberPoboxDc");
	}

	/**
	 * Get edbbCityNameDc
	 */
	@Column(name = "EDBB_CITY_NAME_DC")
	public String getEdbbCityNameDc() {
		return edbbCityNameDc;
	}

	/**
	 * Set edbbCityNameDc
	 */
	public void setEdbbCityNameDc(String edbbCityNameDc) {
		this.edbbCityNameDc = edbbCityNameDc;
		addValidField("edbbCityNameDc");
	}

	/**
	 * Get edbbCountrySubEntityDc
	 */
	@Column(name = "EDBB_COUNTRY_SUB_ENTITY_DC")
	public String getEdbbCountrySubEntityDc() {
		return edbbCountrySubEntityDc;
	}

	/**
	 * Set edbbCountrySubEntityDc
	 */
	public void setEdbbCountrySubEntityDc(String edbbCountrySubEntityDc) {
		this.edbbCountrySubEntityDc = edbbCountrySubEntityDc;
		addValidField("edbbCountrySubEntityDc");
	}

	/**
	 * Get edbbCountrySubEntityNmDc
	 */
	@Column(name = "EDBB_COUNTRY_SUB_ENTITY_NM_DC")
	public String getEdbbCountrySubEntityNmDc() {
		return edbbCountrySubEntityNmDc;
	}

	/**
	 * Set edbbCountrySubEntityNmDc
	 */
	public void setEdbbCountrySubEntityNmDc(String edbbCountrySubEntityNmDc) {
		this.edbbCountrySubEntityNmDc = edbbCountrySubEntityNmDc;
		addValidField("edbbCountrySubEntityNmDc");
	}

	/**
	 * Get edbbPostcodeDc
	 */
	@Column(name = "EDBB_POSTCODE_DC")
	public String getEdbbPostcodeDc() {
		return edbbPostcodeDc;
	}

	/**
	 * Set edbbPostcodeDc
	 */
	public void setEdbbPostcodeDc(String edbbPostcodeDc) {
		this.edbbPostcodeDc = edbbPostcodeDc;
		addValidField("edbbPostcodeDc");
	}

	/**
	 * Get edbbCountryCodeDc
	 */
	@Column(name = "EDBB_COUNTRY_CODE_DC")
	public String getEdbbCountryCodeDc() {
		return edbbCountryCodeDc;
	}

	/**
	 * Set edbbCountryCodeDc
	 */
	public void setEdbbCountryCodeDc(String edbbCountryCodeDc) {
		this.edbbCountryCodeDc = edbbCountryCodeDc;
		addValidField("edbbCountryCodeDc");
	}

	/**
	 * Get edbbCountryNameDc
	 */
	@Column(name = "EDBB_COUNTRY_NAME_DC")
	public String getEdbbCountryNameDc() {
		return edbbCountryNameDc;
	}

	/**
	 * Set edbbCountryNameDc
	 */
	public void setEdbbCountryNameDc(String edbbCountryNameDc) {
		this.edbbCountryNameDc = edbbCountryNameDc;
		addValidField("edbbCountryNameDc");
	}

	/**
	 * Get edbbSubstr1
	 */
	@Column(name = "EDBB_SUBSTR1")
	public String getEdbbSubstr1() {
		return edbbSubstr1;
	}

	/**
	 * Set edbbSubstr1
	 */
	public void setEdbbSubstr1(String edbbSubstr1) {
		this.edbbSubstr1 = edbbSubstr1;
		addValidField("edbbSubstr1");
	}

	/**
	 * Get edbbSubstr2
	 */
	@Column(name = "EDBB_SUBSTR2")
	public String getEdbbSubstr2() {
		return edbbSubstr2;
	}

	/**
	 * Set edbbSubstr2
	 */
	public void setEdbbSubstr2(String edbbSubstr2) {
		this.edbbSubstr2 = edbbSubstr2;
		addValidField("edbbSubstr2");
	}

	/**
	 * Get edbbSubstr3
	 */
	@Column(name = "EDBB_SUBSTR3")
	public String getEdbbSubstr3() {
		return edbbSubstr3;
	}

	/**
	 * Set edbbSubstr3
	 */
	public void setEdbbSubstr3(String edbbSubstr3) {
		this.edbbSubstr3 = edbbSubstr3;
		addValidField("edbbSubstr3");
	}

	/**
	 * Get edbbSubstr4
	 */
	@Column(name = "EDBB_SUBSTR4")
	public String getEdbbSubstr4() {
		return edbbSubstr4;
	}

	/**
	 * Set edbbSubstr4
	 */
	public void setEdbbSubstr4(String edbbSubstr4) {
		this.edbbSubstr4 = edbbSubstr4;
		addValidField("edbbSubstr4");
	}

	/**
	 * Get edbbSubstr5
	 */
	@Column(name = "EDBB_SUBSTR5")
	public String getEdbbSubstr5() {
		return edbbSubstr5;
	}

	/**
	 * Set edbbSubstr5
	 */
	public void setEdbbSubstr5(String edbbSubstr5) {
		this.edbbSubstr5 = edbbSubstr5;
		addValidField("edbbSubstr5");
	}

	/**
	 * Get edbbSubstr6
	 */
	@Column(name = "EDBB_SUBSTR6")
	public String getEdbbSubstr6() {
		return edbbSubstr6;
	}

	/**
	 * Set edbbSubstr6
	 */
	public void setEdbbSubstr6(String edbbSubstr6) {
		this.edbbSubstr6 = edbbSubstr6;
		addValidField("edbbSubstr6");
	}

	/**
	 * Get edbbSubstr7
	 */
	@Column(name = "EDBB_SUBSTR7")
	public String getEdbbSubstr7() {
		return edbbSubstr7;
	}

	/**
	 * Set edbbSubstr7
	 */
	public void setEdbbSubstr7(String edbbSubstr7) {
		this.edbbSubstr7 = edbbSubstr7;
		addValidField("edbbSubstr7");
	}

	/**
	 * Get edbbSubstr8
	 */
	@Column(name = "EDBB_SUBSTR8")
	public String getEdbbSubstr8() {
		return edbbSubstr8;
	}

	/**
	 * Set edbbSubstr8
	 */
	public void setEdbbSubstr8(String edbbSubstr8) {
		this.edbbSubstr8 = edbbSubstr8;
		addValidField("edbbSubstr8");
	}

	/**
	 * Get edbbSubdate1
	 */
	@Column(name = "EDBB_SUBDATE1")
	public Date getEdbbSubdate1() {
		return edbbSubdate1;
	}

	/**
	 * Set edbbSubdate1
	 */
	public void setEdbbSubdate1(Date edbbSubdate1) {
		this.edbbSubdate1 = edbbSubdate1;
		addValidField("edbbSubdate1");
	}

	/**
	 * Get edbbSubdate2
	 */
	@Column(name = "EDBB_SUBDATE2")
	public Date getEdbbSubdate2() {
		return edbbSubdate2;
	}

	/**
	 * Set edbbSubdate2
	 */
	public void setEdbbSubdate2(Date edbbSubdate2) {
		this.edbbSubdate2 = edbbSubdate2;
		addValidField("edbbSubdate2");
	}

	/**
	 * Get edbbSubdate3
	 */
	@Column(name = "EDBB_SUBDATE3")
	public Date getEdbbSubdate3() {
		return edbbSubdate3;
	}

	/**
	 * Set edbbSubdate3
	 */
	public void setEdbbSubdate3(Date edbbSubdate3) {
		this.edbbSubdate3 = edbbSubdate3;
		addValidField("edbbSubdate3");
	}

	/**
	 * Get edbbSubdate4
	 */
	@Column(name = "EDBB_SUBDATE4")
	public Date getEdbbSubdate4() {
		return edbbSubdate4;
	}

	/**
	 * Set edbbSubdate4
	 */
	public void setEdbbSubdate4(Date edbbSubdate4) {
		this.edbbSubdate4 = edbbSubdate4;
		addValidField("edbbSubdate4");
	}

	/**
	 * Get edbbSubnum1
	 */
	@Column(name = "EDBB_SUBNUM1")
	public Long getEdbbSubnum1() {
		return edbbSubnum1;
	}

	/**
	 * Set edbbSubnum1
	 */
	public void setEdbbSubnum1(Long edbbSubnum1) {
		this.edbbSubnum1 = edbbSubnum1;
		addValidField("edbbSubnum1");
	}

	/**
	 * Get edbbSubnum2
	 */
	@Column(name = "EDBB_SUBNUM2")
	public Long getEdbbSubnum2() {
		return edbbSubnum2;
	}

	/**
	 * Set edbbSubnum2
	 */
	public void setEdbbSubnum2(Long edbbSubnum2) {
		this.edbbSubnum2 = edbbSubnum2;
		addValidField("edbbSubnum2");
	}

	/**
	 * Get edbbSubnum3
	 */
	@Column(name = "EDBB_SUBNUM3")
	public Long getEdbbSubnum3() {
		return edbbSubnum3;
	}

	/**
	 * Set edbbSubnum3
	 */
	public void setEdbbSubnum3(Long edbbSubnum3) {
		this.edbbSubnum3 = edbbSubnum3;
		addValidField("edbbSubnum3");
	}

	/**
	 * Get edbbSubnum4
	 */
	@Column(name = "EDBB_SUBNUM4")
	public Long getEdbbSubnum4() {
		return edbbSubnum4;
	}

	/**
	 * Set edbbSubnum4
	 */
	public void setEdbbSubnum4(Long edbbSubnum4) {
		this.edbbSubnum4 = edbbSubnum4;
		addValidField("edbbSubnum4");
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
	 * Get edbbEsiDeadline
	 */
	@Column(name = "EDBB_ESI_DEADLINE")
	public Date getEdbbEsiDeadline() {
		return edbbEsiDeadline;
	}

	/**
	 * Set edbbEsiDeadline
	 */
	public void setEdbbEsiDeadline(Date edbbEsiDeadline) {
		this.edbbEsiDeadline = edbbEsiDeadline;
		addValidField("edbbEsiDeadline");
	}

	/**
	 * Get edbbGateCloseTime
	 */
	@Column(name = "EDBB_GATE_CLOSE_TIME")
	public Date getEdbbGateCloseTime() {
		return edbbGateCloseTime;
	}

	/**
	 * Set edbbGateCloseTime
	 */
	public void setEdbbGateCloseTime(Date edbbGateCloseTime) {
		this.edbbGateCloseTime = edbbGateCloseTime;
		addValidField("edbbGateCloseTime");
	}

}
