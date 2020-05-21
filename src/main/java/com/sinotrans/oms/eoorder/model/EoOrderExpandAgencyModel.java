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
 * Model class for EoOrderExpandAgency
 */
@Entity
@Table(name = "EO_ORDER_EXPAND_AGENCY")
public class EoOrderExpandAgencyModel extends BaseModel implements OperationLog {

	//eoeaId
	private Long eoeaId;
	//eoeaEscoId
	private Long eoeaEscoId;
	//eoeaEbpjId
	private Long eoeaEbpjId;
	//eoeaEoorId
	private Long eoeaEoorId;
	//eoeaAgencyType
	private String eoeaAgencyType;
	//eoeaIsBooking
	private Long eoeaIsBooking;
	//eoeaIsSingle
	private Long eoeaIsSingle;
	//eoeaIsContainerDetentio
	private Long eoeaIsContainerDetentio;
	//eoeaIsPayment
	private Long eoeaIsPayment;
	//eoeaIsCheck
	private Long eoeaIsCheck;
	//eoeaIsTrailer
	private Long eoeaIsTrailer;
	//eoeaIsCustoms
	private Long eoeaIsCustoms;
	//eoeaIsInspection
	private Long eoeaIsInspection;
	//eoeaIsInsurance
	private Long eoeaIsInsurance;
	//eoeaShipperConsignNo
	private String eoeaShipperConsignNo;
	//eoeaBulkBillNo
	private String eoeaBulkBillNo;
	//eoeaHblNo
	private String eoeaHblNo;
	//eoeaVesselName
	private String eoeaVesselName;
	//eoeaVoyage
	private String eoeaVoyage;
	//eoeaCarrierId
	private Long eoeaCarrierId;
	//eoeaCarrierCode
	private String eoeaCarrierCode;
	//eoeaCarrierName
	private String eoeaCarrierName;
	//eoeaBookingAgentId
	private Long eoeaBookingAgentId;
	//eoeaBookingAgentCode
	private String eoeaBookingAgentCode;
	//eoeaBookingAgentName
	private String eoeaBookingAgentName;
	//eoeaAgentId
	private Long eoeaAgentId;
	//eoeaAgentCode
	private String eoeaAgentCode;
	//eoeaAgentName
	private String eoeaAgentName;
	//eoeaLoadPortId
	private Long eoeaLoadPortId;
	//eoeaLoadPortCode
	private String eoeaLoadPortCode;
	//eoeaLoadPortName
	private String eoeaLoadPortName;
	//eoeaReceiptPlaceName
	private String eoeaReceiptPlaceName;
	//eoeaTransferPortId
	private Long eoeaTransferPortId;
	//eoeaTransferPortCode
	private String eoeaTransferPortCode;
	//eoeaTransferPortName
	private String eoeaTransferPortName;
	//eoeaDischargePortId
	private Long eoeaDischargePortId;
	//eoeaDischargePortCode
	private String eoeaDischargePortCode;
	//eoeaDischargePortName
	private String eoeaDischargePortName;
	//eoeaDeliveryPlace
	private String eoeaDeliveryPlace;
	//eoeaCargoSource
	private String eoeaCargoSource;
	//eoeaBookingContractNo
	private String eoeaBookingContractNo;
	//eoeaBlIssueModeCode
	private String eoeaBlIssueModeCode;
	//eoeaDepotCode
	private String eoeaDepotCode;
	//eoeaDepotName
	private String eoeaDepotName;
	//eoeaFreightClauseCode
	private String eoeaFreightClauseCode;
	//eoeaLmId
	private String eoeaLmId;
	//eoeaPayTypeCode
	private String eoeaPayTypeCode;
	//eoeaCargoType
	private String eoeaCargoType;
	//eoeaTradeTerms
	private String eoeaTradeTerms;
	//eoeaFirstContainerTime
	private Date eoeaFirstContainerTime;
	//eoeaIsTransit
	private Long eoeaIsTransit;
	//eoeaShipperDetail
	private String eoeaShipperDetail;
	//eoeaConsigneeDetail
	private String eoeaConsigneeDetail;
	//eoeaNotifierDetail
	private String eoeaNotifierDetail;
	//eoeaSecondNotify
	private String eoeaSecondNotify;
	//eoeaSubstr1
	private String eoeaSubstr1;
	//eoeaSubstr2
	private String eoeaSubstr2;
	//eoeaSubstr3
	private String eoeaSubstr3;
	//eoeaSubstr4
	private String eoeaSubstr4;
	//eoeaSubstr5
	private String eoeaSubstr5;
	//eoeaSubstr6
	private String eoeaSubstr6;
	//eoeaSubstr7
	private String eoeaSubstr7;
	//eoeaSubstr8
	private String eoeaSubstr8;
	//eoeaSubdate1
	private Date eoeaSubdate1;
	//eoeaSubdate2
	private Date eoeaSubdate2;
	//eoeaSubdate3
	private Date eoeaSubdate3;
	//eoeaSubdate4
	private Date eoeaSubdate4;
	//eoeaSubnum1
	private Long eoeaSubnum1;
	//eoeaSubnum2
	private Long eoeaSubnum2;
	//eoeaSubnum3
	private Long eoeaSubnum3;
	//eoeaSubnum4
	private Long eoeaSubnum4;
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
	//eoeaEtd
	private Date eoeaEtd;
	//eoeaEta
	private Date eoeaEta;
	//eoeaCanvassingWay
	private String eoeaCanvassingWay;
	//eoeaServiceCategory
	private String eoeaServiceCategory;
	//eoeaFreightService
	private String eoeaFreightService;
	//eoeaFreightType
	private String eoeaFreightType;
	//eoeaShipmentDate
	private Date eoeaShipmentDate;
	//eoeaReleaseDate
	private Date eoeaReleaseDate;
	//eoeaDeliveryDate
	private Date eoeaDeliveryDate;
	//eoeaIsStorage
	private Long eoeaIsStorage;
	//eoeaReceiptPlaceCode
	private String eoeaReceiptPlaceCode;
	//eoeaReceiptPlaceId
	private Long eoeaReceiptPlaceId;
	//eoeaNotifierId
	private Long eoeaNotifierId;
	//eoeaNotifierName
	private String eoeaNotifierName;
	//eoeaNotifierCode
	private String eoeaNotifierCode;
	//eoeaSecondNotifyName
	private String eoeaSecondNotifyName;

	/**
	 * Get eoeaId
	 */
	@Column(name = "EOEA_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoeaId() {
		return eoeaId;
	}

	/**
	 * Set eoeaId
	 */
	public void setEoeaId(Long eoeaId) {
		this.eoeaId = eoeaId;
		addValidField("eoeaId");
	}

	/**
	 * Get eoeaEscoId
	 */
	@Column(name = "EOEA_ESCO_ID")
	public Long getEoeaEscoId() {
		return eoeaEscoId;
	}

	/**
	 * Set eoeaEscoId
	 */
	public void setEoeaEscoId(Long eoeaEscoId) {
		this.eoeaEscoId = eoeaEscoId;
		addValidField("eoeaEscoId");
	}

	/**
	 * Get eoeaEbpjId
	 */
	@Column(name = "EOEA_EBPJ_ID")
	public Long getEoeaEbpjId() {
		return eoeaEbpjId;
	}

	/**
	 * Set eoeaEbpjId
	 */
	public void setEoeaEbpjId(Long eoeaEbpjId) {
		this.eoeaEbpjId = eoeaEbpjId;
		addValidField("eoeaEbpjId");
	}

	/**
	 * Get eoeaEoorId
	 */
	@Column(name = "EOEA_EOOR_ID")
	public Long getEoeaEoorId() {
		return eoeaEoorId;
	}

	/**
	 * Set eoeaEoorId
	 */
	public void setEoeaEoorId(Long eoeaEoorId) {
		this.eoeaEoorId = eoeaEoorId;
		addValidField("eoeaEoorId");
	}

	/**
	 * Get eoeaAgencyType
	 */
	@Column(name = "EOEA_AGENCY_TYPE")
	public String getEoeaAgencyType() {
		return eoeaAgencyType;
	}

	/**
	 * Set eoeaAgencyType
	 */
	public void setEoeaAgencyType(String eoeaAgencyType) {
		this.eoeaAgencyType = eoeaAgencyType;
		addValidField("eoeaAgencyType");
	}

	/**
	 * Get eoeaIsBooking
	 */
	@Column(name = "EOEA_IS_BOOKING")
	public Long getEoeaIsBooking() {
		return eoeaIsBooking;
	}

	/**
	 * Set eoeaIsBooking
	 */
	public void setEoeaIsBooking(Long eoeaIsBooking) {
		this.eoeaIsBooking = eoeaIsBooking;
		addValidField("eoeaIsBooking");
	}

	/**
	 * Get eoeaIsSingle
	 */
	@Column(name = "EOEA_IS_SINGLE")
	public Long getEoeaIsSingle() {
		return eoeaIsSingle;
	}

	/**
	 * Set eoeaIsSingle
	 */
	public void setEoeaIsSingle(Long eoeaIsSingle) {
		this.eoeaIsSingle = eoeaIsSingle;
		addValidField("eoeaIsSingle");
	}

	/**
	 * Get eoeaIsContainerDetentio
	 */
	@Column(name = "EOEA_IS_CONTAINER_DETENTIO")
	public Long getEoeaIsContainerDetentio() {
		return eoeaIsContainerDetentio;
	}

	/**
	 * Set eoeaIsContainerDetentio
	 */
	public void setEoeaIsContainerDetentio(Long eoeaIsContainerDetentio) {
		this.eoeaIsContainerDetentio = eoeaIsContainerDetentio;
		addValidField("eoeaIsContainerDetentio");
	}

	/**
	 * Get eoeaIsPayment
	 */
	@Column(name = "EOEA_IS_PAYMENT")
	public Long getEoeaIsPayment() {
		return eoeaIsPayment;
	}

	/**
	 * Set eoeaIsPayment
	 */
	public void setEoeaIsPayment(Long eoeaIsPayment) {
		this.eoeaIsPayment = eoeaIsPayment;
		addValidField("eoeaIsPayment");
	}

	/**
	 * Get eoeaIsCheck
	 */
	@Column(name = "EOEA_IS_CHECK")
	public Long getEoeaIsCheck() {
		return eoeaIsCheck;
	}

	/**
	 * Set eoeaIsCheck
	 */
	public void setEoeaIsCheck(Long eoeaIsCheck) {
		this.eoeaIsCheck = eoeaIsCheck;
		addValidField("eoeaIsCheck");
	}

	/**
	 * Get eoeaIsTrailer
	 */
	@Column(name = "EOEA_IS_TRAILER")
	public Long getEoeaIsTrailer() {
		return eoeaIsTrailer;
	}

	/**
	 * Set eoeaIsTrailer
	 */
	public void setEoeaIsTrailer(Long eoeaIsTrailer) {
		this.eoeaIsTrailer = eoeaIsTrailer;
		addValidField("eoeaIsTrailer");
	}

	/**
	 * Get eoeaIsCustoms
	 */
	@Column(name = "EOEA_IS_CUSTOMS")
	public Long getEoeaIsCustoms() {
		return eoeaIsCustoms;
	}

	/**
	 * Set eoeaIsCustoms
	 */
	public void setEoeaIsCustoms(Long eoeaIsCustoms) {
		this.eoeaIsCustoms = eoeaIsCustoms;
		addValidField("eoeaIsCustoms");
	}

	/**
	 * Get eoeaIsInspection
	 */
	@Column(name = "EOEA_IS_INSPECTION")
	public Long getEoeaIsInspection() {
		return eoeaIsInspection;
	}

	/**
	 * Set eoeaIsInspection
	 */
	public void setEoeaIsInspection(Long eoeaIsInspection) {
		this.eoeaIsInspection = eoeaIsInspection;
		addValidField("eoeaIsInspection");
	}

	/**
	 * Get eoeaIsInsurance
	 */
	@Column(name = "EOEA_IS_INSURANCE")
	public Long getEoeaIsInsurance() {
		return eoeaIsInsurance;
	}

	/**
	 * Set eoeaIsInsurance
	 */
	public void setEoeaIsInsurance(Long eoeaIsInsurance) {
		this.eoeaIsInsurance = eoeaIsInsurance;
		addValidField("eoeaIsInsurance");
	}

	/**
	 * Get eoeaShipperConsignNo
	 */
	@Column(name = "EOEA_SHIPPER_CONSIGN_NO")
	public String getEoeaShipperConsignNo() {
		return eoeaShipperConsignNo;
	}

	/**
	 * Set eoeaShipperConsignNo
	 */
	public void setEoeaShipperConsignNo(String eoeaShipperConsignNo) {
		this.eoeaShipperConsignNo = eoeaShipperConsignNo;
		addValidField("eoeaShipperConsignNo");
	}

	/**
	 * Get eoeaBulkBillNo
	 */
	@Column(name = "EOEA_BULK_BILL_NO")
	public String getEoeaBulkBillNo() {
		return eoeaBulkBillNo;
	}

	/**
	 * Set eoeaBulkBillNo
	 */
	public void setEoeaBulkBillNo(String eoeaBulkBillNo) {
		this.eoeaBulkBillNo = eoeaBulkBillNo;
		addValidField("eoeaBulkBillNo");
	}

	/**
	 * Get eoeaHblNo
	 */
	@Column(name = "EOEA_HBL_NO")
	public String getEoeaHblNo() {
		return eoeaHblNo;
	}

	/**
	 * Set eoeaHblNo
	 */
	public void setEoeaHblNo(String eoeaHblNo) {
		this.eoeaHblNo = eoeaHblNo;
		addValidField("eoeaHblNo");
	}

	/**
	 * Get eoeaVesselName
	 */
	@Column(name = "EOEA_VESSEL_NAME")
	public String getEoeaVesselName() {
		return eoeaVesselName;
	}

	/**
	 * Set eoeaVesselName
	 */
	public void setEoeaVesselName(String eoeaVesselName) {
		this.eoeaVesselName = eoeaVesselName;
		addValidField("eoeaVesselName");
	}

	/**
	 * Get eoeaVoyage
	 */
	@Column(name = "EOEA_VOYAGE")
	public String getEoeaVoyage() {
		return eoeaVoyage;
	}

	/**
	 * Set eoeaVoyage
	 */
	public void setEoeaVoyage(String eoeaVoyage) {
		this.eoeaVoyage = eoeaVoyage;
		addValidField("eoeaVoyage");
	}

	/**
	 * Get eoeaCarrierId
	 */
	@Column(name = "EOEA_CARRIER_ID")
	public Long getEoeaCarrierId() {
		return eoeaCarrierId;
	}

	/**
	 * Set eoeaCarrierId
	 */
	public void setEoeaCarrierId(Long eoeaCarrierId) {
		this.eoeaCarrierId = eoeaCarrierId;
		addValidField("eoeaCarrierId");
	}

	/**
	 * Get eoeaCarrierCode
	 */
	@Column(name = "EOEA_CARRIER_CODE")
	public String getEoeaCarrierCode() {
		return eoeaCarrierCode;
	}

	/**
	 * Set eoeaCarrierCode
	 */
	public void setEoeaCarrierCode(String eoeaCarrierCode) {
		this.eoeaCarrierCode = eoeaCarrierCode;
		addValidField("eoeaCarrierCode");
	}

	/**
	 * Get eoeaCarrierName
	 */
	@Column(name = "EOEA_CARRIER_NAME")
	public String getEoeaCarrierName() {
		return eoeaCarrierName;
	}

	/**
	 * Set eoeaCarrierName
	 */
	public void setEoeaCarrierName(String eoeaCarrierName) {
		this.eoeaCarrierName = eoeaCarrierName;
		addValidField("eoeaCarrierName");
	}

	/**
	 * Get eoeaBookingAgentId
	 */
	@Column(name = "EOEA_BOOKING_AGENT_ID")
	public Long getEoeaBookingAgentId() {
		return eoeaBookingAgentId;
	}

	/**
	 * Set eoeaBookingAgentId
	 */
	public void setEoeaBookingAgentId(Long eoeaBookingAgentId) {
		this.eoeaBookingAgentId = eoeaBookingAgentId;
		addValidField("eoeaBookingAgentId");
	}

	/**
	 * Get eoeaBookingAgentCode
	 */
	@Column(name = "EOEA_BOOKING_AGENT_CODE")
	public String getEoeaBookingAgentCode() {
		return eoeaBookingAgentCode;
	}

	/**
	 * Set eoeaBookingAgentCode
	 */
	public void setEoeaBookingAgentCode(String eoeaBookingAgentCode) {
		this.eoeaBookingAgentCode = eoeaBookingAgentCode;
		addValidField("eoeaBookingAgentCode");
	}

	/**
	 * Get eoeaBookingAgentName
	 */
	@Column(name = "EOEA_BOOKING_AGENT_NAME")
	public String getEoeaBookingAgentName() {
		return eoeaBookingAgentName;
	}

	/**
	 * Set eoeaBookingAgentName
	 */
	public void setEoeaBookingAgentName(String eoeaBookingAgentName) {
		this.eoeaBookingAgentName = eoeaBookingAgentName;
		addValidField("eoeaBookingAgentName");
	}

	/**
	 * Get eoeaAgentId
	 */
	@Column(name = "EOEA_AGENT_ID")
	public Long getEoeaAgentId() {
		return eoeaAgentId;
	}

	/**
	 * Set eoeaAgentId
	 */
	public void setEoeaAgentId(Long eoeaAgentId) {
		this.eoeaAgentId = eoeaAgentId;
		addValidField("eoeaAgentId");
	}

	/**
	 * Get eoeaAgentCode
	 */
	@Column(name = "EOEA_AGENT_CODE")
	public String getEoeaAgentCode() {
		return eoeaAgentCode;
	}

	/**
	 * Set eoeaAgentCode
	 */
	public void setEoeaAgentCode(String eoeaAgentCode) {
		this.eoeaAgentCode = eoeaAgentCode;
		addValidField("eoeaAgentCode");
	}

	/**
	 * Get eoeaAgentName
	 */
	@Column(name = "EOEA_AGENT_NAME")
	public String getEoeaAgentName() {
		return eoeaAgentName;
	}

	/**
	 * Set eoeaAgentName
	 */
	public void setEoeaAgentName(String eoeaAgentName) {
		this.eoeaAgentName = eoeaAgentName;
		addValidField("eoeaAgentName");
	}

	/**
	 * Get eoeaLoadPortId
	 */
	@Column(name = "EOEA_LOAD_PORT_ID")
	public Long getEoeaLoadPortId() {
		return eoeaLoadPortId;
	}

	/**
	 * Set eoeaLoadPortId
	 */
	public void setEoeaLoadPortId(Long eoeaLoadPortId) {
		this.eoeaLoadPortId = eoeaLoadPortId;
		addValidField("eoeaLoadPortId");
	}

	/**
	 * Get eoeaLoadPortCode
	 */
	@Column(name = "EOEA_LOAD_PORT_CODE")
	public String getEoeaLoadPortCode() {
		return eoeaLoadPortCode;
	}

	/**
	 * Set eoeaLoadPortCode
	 */
	public void setEoeaLoadPortCode(String eoeaLoadPortCode) {
		this.eoeaLoadPortCode = eoeaLoadPortCode;
		addValidField("eoeaLoadPortCode");
	}

	/**
	 * Get eoeaLoadPortName
	 */
	@Column(name = "EOEA_LOAD_PORT_NAME")
	public String getEoeaLoadPortName() {
		return eoeaLoadPortName;
	}

	/**
	 * Set eoeaLoadPortName
	 */
	public void setEoeaLoadPortName(String eoeaLoadPortName) {
		this.eoeaLoadPortName = eoeaLoadPortName;
		addValidField("eoeaLoadPortName");
	}

	/**
	 * Get eoeaReceiptPlaceName
	 */
	@Column(name = "EOEA_RECEIPT_PLACE_NAME")
	public String getEoeaReceiptPlaceName() {
		return eoeaReceiptPlaceName;
	}

	/**
	 * Set eoeaReceiptPlaceName
	 */
	public void setEoeaReceiptPlaceName(String eoeaReceiptPlaceName) {
		this.eoeaReceiptPlaceName = eoeaReceiptPlaceName;
		addValidField("eoeaReceiptPlaceName");
	}

	/**
	 * Get eoeaTransferPortId
	 */
	@Column(name = "EOEA_TRANSFER_PORT_ID")
	public Long getEoeaTransferPortId() {
		return eoeaTransferPortId;
	}

	/**
	 * Set eoeaTransferPortId
	 */
	public void setEoeaTransferPortId(Long eoeaTransferPortId) {
		this.eoeaTransferPortId = eoeaTransferPortId;
		addValidField("eoeaTransferPortId");
	}

	/**
	 * Get eoeaTransferPortCode
	 */
	@Column(name = "EOEA_TRANSFER_PORT_CODE")
	public String getEoeaTransferPortCode() {
		return eoeaTransferPortCode;
	}

	/**
	 * Set eoeaTransferPortCode
	 */
	public void setEoeaTransferPortCode(String eoeaTransferPortCode) {
		this.eoeaTransferPortCode = eoeaTransferPortCode;
		addValidField("eoeaTransferPortCode");
	}

	/**
	 * Get eoeaTransferPortName
	 */
	@Column(name = "EOEA_TRANSFER_PORT_NAME")
	public String getEoeaTransferPortName() {
		return eoeaTransferPortName;
	}

	/**
	 * Set eoeaTransferPortName
	 */
	public void setEoeaTransferPortName(String eoeaTransferPortName) {
		this.eoeaTransferPortName = eoeaTransferPortName;
		addValidField("eoeaTransferPortName");
	}

	/**
	 * Get eoeaDischargePortId
	 */
	@Column(name = "EOEA_DISCHARGE_PORT_ID")
	public Long getEoeaDischargePortId() {
		return eoeaDischargePortId;
	}

	/**
	 * Set eoeaDischargePortId
	 */
	public void setEoeaDischargePortId(Long eoeaDischargePortId) {
		this.eoeaDischargePortId = eoeaDischargePortId;
		addValidField("eoeaDischargePortId");
	}

	/**
	 * Get eoeaDischargePortCode
	 */
	@Column(name = "EOEA_DISCHARGE_PORT_CODE")
	public String getEoeaDischargePortCode() {
		return eoeaDischargePortCode;
	}

	/**
	 * Set eoeaDischargePortCode
	 */
	public void setEoeaDischargePortCode(String eoeaDischargePortCode) {
		this.eoeaDischargePortCode = eoeaDischargePortCode;
		addValidField("eoeaDischargePortCode");
	}

	/**
	 * Get eoeaDischargePortName
	 */
	@Column(name = "EOEA_DISCHARGE_PORT_NAME")
	public String getEoeaDischargePortName() {
		return eoeaDischargePortName;
	}

	/**
	 * Set eoeaDischargePortName
	 */
	public void setEoeaDischargePortName(String eoeaDischargePortName) {
		this.eoeaDischargePortName = eoeaDischargePortName;
		addValidField("eoeaDischargePortName");
	}

	/**
	 * Get eoeaDeliveryPlace
	 */
	@Column(name = "EOEA_DELIVERY_PLACE")
	public String getEoeaDeliveryPlace() {
		return eoeaDeliveryPlace;
	}

	/**
	 * Set eoeaDeliveryPlace
	 */
	public void setEoeaDeliveryPlace(String eoeaDeliveryPlace) {
		this.eoeaDeliveryPlace = eoeaDeliveryPlace;
		addValidField("eoeaDeliveryPlace");
	}

	/**
	 * Get eoeaCargoSource
	 */
	@Column(name = "EOEA_CARGO_SOURCE")
	public String getEoeaCargoSource() {
		return eoeaCargoSource;
	}

	/**
	 * Set eoeaCargoSource
	 */
	public void setEoeaCargoSource(String eoeaCargoSource) {
		this.eoeaCargoSource = eoeaCargoSource;
		addValidField("eoeaCargoSource");
	}

	/**
	 * Get eoeaBookingContractNo
	 */
	@Column(name = "EOEA_BOOKING_CONTRACT_NO")
	public String getEoeaBookingContractNo() {
		return eoeaBookingContractNo;
	}

	/**
	 * Set eoeaBookingContractNo
	 */
	public void setEoeaBookingContractNo(String eoeaBookingContractNo) {
		this.eoeaBookingContractNo = eoeaBookingContractNo;
		addValidField("eoeaBookingContractNo");
	}

	/**
	 * Get eoeaBlIssueModeCode
	 */
	@Column(name = "EOEA_BL_ISSUE_MODE_CODE")
	public String getEoeaBlIssueModeCode() {
		return eoeaBlIssueModeCode;
	}

	/**
	 * Set eoeaBlIssueModeCode
	 */
	public void setEoeaBlIssueModeCode(String eoeaBlIssueModeCode) {
		this.eoeaBlIssueModeCode = eoeaBlIssueModeCode;
		addValidField("eoeaBlIssueModeCode");
	}

	/**
	 * Get eoeaDepotCode
	 */
	@Column(name = "EOEA_DEPOT_CODE")
	public String getEoeaDepotCode() {
		return eoeaDepotCode;
	}

	/**
	 * Set eoeaDepotCode
	 */
	public void setEoeaDepotCode(String eoeaDepotCode) {
		this.eoeaDepotCode = eoeaDepotCode;
		addValidField("eoeaDepotCode");
	}

	/**
	 * Get eoeaDepotName
	 */
	@Column(name = "EOEA_DEPOT_NAME")
	public String getEoeaDepotName() {
		return eoeaDepotName;
	}

	/**
	 * Set eoeaDepotName
	 */
	public void setEoeaDepotName(String eoeaDepotName) {
		this.eoeaDepotName = eoeaDepotName;
		addValidField("eoeaDepotName");
	}

	/**
	 * Get eoeaFreightClauseCode
	 */
	@Column(name = "EOEA_FREIGHT_CLAUSE_CODE")
	public String getEoeaFreightClauseCode() {
		return eoeaFreightClauseCode;
	}

	/**
	 * Set eoeaFreightClauseCode
	 */
	public void setEoeaFreightClauseCode(String eoeaFreightClauseCode) {
		this.eoeaFreightClauseCode = eoeaFreightClauseCode;
		addValidField("eoeaFreightClauseCode");
	}

	/**
	 * Get eoeaLmId
	 */
	@Column(name = "EOEA_LM_ID")
	public String getEoeaLmId() {
		return eoeaLmId;
	}

	/**
	 * Set eoeaLmId
	 */
	public void setEoeaLmId(String eoeaLmId) {
		this.eoeaLmId = eoeaLmId;
		addValidField("eoeaLmId");
	}

	/**
	 * Get eoeaPayTypeCode
	 */
	@Column(name = "EOEA_PAY_TYPE_CODE")
	public String getEoeaPayTypeCode() {
		return eoeaPayTypeCode;
	}

	/**
	 * Set eoeaPayTypeCode
	 */
	public void setEoeaPayTypeCode(String eoeaPayTypeCode) {
		this.eoeaPayTypeCode = eoeaPayTypeCode;
		addValidField("eoeaPayTypeCode");
	}

	/**
	 * Get eoeaCargoType
	 */
	@Column(name = "EOEA_CARGO_TYPE")
	public String getEoeaCargoType() {
		return eoeaCargoType;
	}

	/**
	 * Set eoeaCargoType
	 */
	public void setEoeaCargoType(String eoeaCargoType) {
		this.eoeaCargoType = eoeaCargoType;
		addValidField("eoeaCargoType");
	}

	/**
	 * Get eoeaTradeTerms
	 */
	@Column(name = "EOEA_TRADE_TERMS")
	public String getEoeaTradeTerms() {
		return eoeaTradeTerms;
	}

	/**
	 * Set eoeaTradeTerms
	 */
	public void setEoeaTradeTerms(String eoeaTradeTerms) {
		this.eoeaTradeTerms = eoeaTradeTerms;
		addValidField("eoeaTradeTerms");
	}

	/**
	 * Get eoeaFirstContainerTime
	 */
	@Column(name = "EOEA_FIRST_CONTAINER_TIME")
	public Date getEoeaFirstContainerTime() {
		return eoeaFirstContainerTime;
	}

	/**
	 * Set eoeaFirstContainerTime
	 */
	public void setEoeaFirstContainerTime(Date eoeaFirstContainerTime) {
		this.eoeaFirstContainerTime = eoeaFirstContainerTime;
		addValidField("eoeaFirstContainerTime");
	}

	/**
	 * Get eoeaIsTransit
	 */
	@Column(name = "EOEA_IS_TRANSIT")
	public Long getEoeaIsTransit() {
		return eoeaIsTransit;
	}

	/**
	 * Set eoeaIsTransit
	 */
	public void setEoeaIsTransit(Long eoeaIsTransit) {
		this.eoeaIsTransit = eoeaIsTransit;
		addValidField("eoeaIsTransit");
	}

	/**
	 * Get eoeaShipperDetail
	 */
	@Column(name = "EOEA_SHIPPER_DETAIL")
	public String getEoeaShipperDetail() {
		return eoeaShipperDetail;
	}

	/**
	 * Set eoeaShipperDetail
	 */
	public void setEoeaShipperDetail(String eoeaShipperDetail) {
		this.eoeaShipperDetail = eoeaShipperDetail;
		addValidField("eoeaShipperDetail");
	}

	/**
	 * Get eoeaConsigneeDetail
	 */
	@Column(name = "EOEA_CONSIGNEE_DETAIL")
	public String getEoeaConsigneeDetail() {
		return eoeaConsigneeDetail;
	}

	/**
	 * Set eoeaConsigneeDetail
	 */
	public void setEoeaConsigneeDetail(String eoeaConsigneeDetail) {
		this.eoeaConsigneeDetail = eoeaConsigneeDetail;
		addValidField("eoeaConsigneeDetail");
	}

	/**
	 * Get eoeaNotifierDetail
	 */
	@Column(name = "EOEA_NOTIFIER_DETAIL")
	public String getEoeaNotifierDetail() {
		return eoeaNotifierDetail;
	}

	/**
	 * Set eoeaNotifierDetail
	 */
	public void setEoeaNotifierDetail(String eoeaNotifierDetail) {
		this.eoeaNotifierDetail = eoeaNotifierDetail;
		addValidField("eoeaNotifierDetail");
	}

	/**
	 * Get eoeaSecondNotify
	 */
	@Column(name = "EOEA_SECOND_NOTIFY")
	public String getEoeaSecondNotify() {
		return eoeaSecondNotify;
	}

	/**
	 * Set eoeaSecondNotify
	 */
	public void setEoeaSecondNotify(String eoeaSecondNotify) {
		this.eoeaSecondNotify = eoeaSecondNotify;
		addValidField("eoeaSecondNotify");
	}

	/**
	 * Get eoeaSubstr1
	 */
	@Column(name = "EOEA_SUBSTR1")
	public String getEoeaSubstr1() {
		return eoeaSubstr1;
	}

	/**
	 * Set eoeaSubstr1
	 */
	public void setEoeaSubstr1(String eoeaSubstr1) {
		this.eoeaSubstr1 = eoeaSubstr1;
		addValidField("eoeaSubstr1");
	}

	/**
	 * Get eoeaSubstr2
	 */
	@Column(name = "EOEA_SUBSTR2")
	public String getEoeaSubstr2() {
		return eoeaSubstr2;
	}

	/**
	 * Set eoeaSubstr2
	 */
	public void setEoeaSubstr2(String eoeaSubstr2) {
		this.eoeaSubstr2 = eoeaSubstr2;
		addValidField("eoeaSubstr2");
	}

	/**
	 * Get eoeaSubstr3
	 */
	@Column(name = "EOEA_SUBSTR3")
	public String getEoeaSubstr3() {
		return eoeaSubstr3;
	}

	/**
	 * Set eoeaSubstr3
	 */
	public void setEoeaSubstr3(String eoeaSubstr3) {
		this.eoeaSubstr3 = eoeaSubstr3;
		addValidField("eoeaSubstr3");
	}

	/**
	 * Get eoeaSubstr4
	 */
	@Column(name = "EOEA_SUBSTR4")
	public String getEoeaSubstr4() {
		return eoeaSubstr4;
	}

	/**
	 * Set eoeaSubstr4
	 */
	public void setEoeaSubstr4(String eoeaSubstr4) {
		this.eoeaSubstr4 = eoeaSubstr4;
		addValidField("eoeaSubstr4");
	}

	/**
	 * Get eoeaSubstr5
	 */
	@Column(name = "EOEA_SUBSTR5")
	public String getEoeaSubstr5() {
		return eoeaSubstr5;
	}

	/**
	 * Set eoeaSubstr5
	 */
	public void setEoeaSubstr5(String eoeaSubstr5) {
		this.eoeaSubstr5 = eoeaSubstr5;
		addValidField("eoeaSubstr5");
	}

	/**
	 * Get eoeaSubstr6
	 */
	@Column(name = "EOEA_SUBSTR6")
	public String getEoeaSubstr6() {
		return eoeaSubstr6;
	}

	/**
	 * Set eoeaSubstr6
	 */
	public void setEoeaSubstr6(String eoeaSubstr6) {
		this.eoeaSubstr6 = eoeaSubstr6;
		addValidField("eoeaSubstr6");
	}

	/**
	 * Get eoeaSubstr7
	 */
	@Column(name = "EOEA_SUBSTR7")
	public String getEoeaSubstr7() {
		return eoeaSubstr7;
	}

	/**
	 * Set eoeaSubstr7
	 */
	public void setEoeaSubstr7(String eoeaSubstr7) {
		this.eoeaSubstr7 = eoeaSubstr7;
		addValidField("eoeaSubstr7");
	}

	/**
	 * Get eoeaSubstr8
	 */
	@Column(name = "EOEA_SUBSTR8")
	public String getEoeaSubstr8() {
		return eoeaSubstr8;
	}

	/**
	 * Set eoeaSubstr8
	 */
	public void setEoeaSubstr8(String eoeaSubstr8) {
		this.eoeaSubstr8 = eoeaSubstr8;
		addValidField("eoeaSubstr8");
	}

	/**
	 * Get eoeaSubdate1
	 */
	@Column(name = "EOEA_SUBDATE1")
	public Date getEoeaSubdate1() {
		return eoeaSubdate1;
	}

	/**
	 * Set eoeaSubdate1
	 */
	public void setEoeaSubdate1(Date eoeaSubdate1) {
		this.eoeaSubdate1 = eoeaSubdate1;
		addValidField("eoeaSubdate1");
	}

	/**
	 * Get eoeaSubdate2
	 */
	@Column(name = "EOEA_SUBDATE2")
	public Date getEoeaSubdate2() {
		return eoeaSubdate2;
	}

	/**
	 * Set eoeaSubdate2
	 */
	public void setEoeaSubdate2(Date eoeaSubdate2) {
		this.eoeaSubdate2 = eoeaSubdate2;
		addValidField("eoeaSubdate2");
	}

	/**
	 * Get eoeaSubdate3
	 */
	@Column(name = "EOEA_SUBDATE3")
	public Date getEoeaSubdate3() {
		return eoeaSubdate3;
	}

	/**
	 * Set eoeaSubdate3
	 */
	public void setEoeaSubdate3(Date eoeaSubdate3) {
		this.eoeaSubdate3 = eoeaSubdate3;
		addValidField("eoeaSubdate3");
	}

	/**
	 * Get eoeaSubdate4
	 */
	@Column(name = "EOEA_SUBDATE4")
	public Date getEoeaSubdate4() {
		return eoeaSubdate4;
	}

	/**
	 * Set eoeaSubdate4
	 */
	public void setEoeaSubdate4(Date eoeaSubdate4) {
		this.eoeaSubdate4 = eoeaSubdate4;
		addValidField("eoeaSubdate4");
	}

	/**
	 * Get eoeaSubnum1
	 */
	@Column(name = "EOEA_SUBNUM1")
	public Long getEoeaSubnum1() {
		return eoeaSubnum1;
	}

	/**
	 * Set eoeaSubnum1
	 */
	public void setEoeaSubnum1(Long eoeaSubnum1) {
		this.eoeaSubnum1 = eoeaSubnum1;
		addValidField("eoeaSubnum1");
	}

	/**
	 * Get eoeaSubnum2
	 */
	@Column(name = "EOEA_SUBNUM2")
	public Long getEoeaSubnum2() {
		return eoeaSubnum2;
	}

	/**
	 * Set eoeaSubnum2
	 */
	public void setEoeaSubnum2(Long eoeaSubnum2) {
		this.eoeaSubnum2 = eoeaSubnum2;
		addValidField("eoeaSubnum2");
	}

	/**
	 * Get eoeaSubnum3
	 */
	@Column(name = "EOEA_SUBNUM3")
	public Long getEoeaSubnum3() {
		return eoeaSubnum3;
	}

	/**
	 * Set eoeaSubnum3
	 */
	public void setEoeaSubnum3(Long eoeaSubnum3) {
		this.eoeaSubnum3 = eoeaSubnum3;
		addValidField("eoeaSubnum3");
	}

	/**
	 * Get eoeaSubnum4
	 */
	@Column(name = "EOEA_SUBNUM4")
	public Long getEoeaSubnum4() {
		return eoeaSubnum4;
	}

	/**
	 * Set eoeaSubnum4
	 */
	public void setEoeaSubnum4(Long eoeaSubnum4) {
		this.eoeaSubnum4 = eoeaSubnum4;
		addValidField("eoeaSubnum4");
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
	 * Get eoeaEtd
	 */
	@Column(name = "EOEA_ETD")
	public Date getEoeaEtd() {
		return eoeaEtd;
	}

	/**
	 * Set eoeaEtd
	 */
	public void setEoeaEtd(Date eoeaEtd) {
		this.eoeaEtd = eoeaEtd;
		addValidField("eoeaEtd");
	}

	/**
	 * Get eoeaEta
	 */
	@Column(name = "EOEA_ETA")
	public Date getEoeaEta() {
		return eoeaEta;
	}

	/**
	 * Set eoeaEta
	 */
	public void setEoeaEta(Date eoeaEta) {
		this.eoeaEta = eoeaEta;
		addValidField("eoeaEta");
	}

	/**
	 * Get eoeaCanvassingWay
	 */
	@Column(name = "EOEA_CANVASSING_WAY")
	public String getEoeaCanvassingWay() {
		return eoeaCanvassingWay;
	}

	/**
	 * Set eoeaCanvassingWay
	 */
	public void setEoeaCanvassingWay(String eoeaCanvassingWay) {
		this.eoeaCanvassingWay = eoeaCanvassingWay;
		addValidField("eoeaCanvassingWay");
	}

	/**
	 * Get eoeaServiceCategory
	 */
	@Column(name = "EOEA_SERVICE_CATEGORY")
	public String getEoeaServiceCategory() {
		return eoeaServiceCategory;
	}

	/**
	 * Set eoeaServiceCategory
	 */
	public void setEoeaServiceCategory(String eoeaServiceCategory) {
		this.eoeaServiceCategory = eoeaServiceCategory;
		addValidField("eoeaServiceCategory");
	}

	/**
	 * Get eoeaFreightService
	 */
	@Column(name = "EOEA_FREIGHT_SERVICE")
	public String getEoeaFreightService() {
		return eoeaFreightService;
	}

	/**
	 * Set eoeaFreightService
	 */
	public void setEoeaFreightService(String eoeaFreightService) {
		this.eoeaFreightService = eoeaFreightService;
		addValidField("eoeaFreightService");
	}

	/**
	 * Get eoeaFreightType
	 */
	@Column(name = "EOEA_FREIGHT_TYPE")
	public String getEoeaFreightType() {
		return eoeaFreightType;
	}

	/**
	 * Set eoeaFreightType
	 */
	public void setEoeaFreightType(String eoeaFreightType) {
		this.eoeaFreightType = eoeaFreightType;
		addValidField("eoeaFreightType");
	}

	/**
	 * Get eoeaShipmentDate
	 */
	@Column(name = "EOEA_SHIPMENT_DATE")
	public Date getEoeaShipmentDate() {
		return eoeaShipmentDate;
	}

	/**
	 * Set eoeaShipmentDate
	 */
	public void setEoeaShipmentDate(Date eoeaShipmentDate) {
		this.eoeaShipmentDate = eoeaShipmentDate;
		addValidField("eoeaShipmentDate");
	}

	/**
	 * Get eoeaReleaseDate
	 */
	@Column(name = "EOEA_RELEASE_DATE")
	public Date getEoeaReleaseDate() {
		return eoeaReleaseDate;
	}

	/**
	 * Set eoeaReleaseDate
	 */
	public void setEoeaReleaseDate(Date eoeaReleaseDate) {
		this.eoeaReleaseDate = eoeaReleaseDate;
		addValidField("eoeaReleaseDate");
	}

	/**
	 * Get eoeaDeliveryDate
	 */
	@Column(name = "EOEA_DELIVERY_DATE")
	public Date getEoeaDeliveryDate() {
		return eoeaDeliveryDate;
	}

	/**
	 * Set eoeaDeliveryDate
	 */
	public void setEoeaDeliveryDate(Date eoeaDeliveryDate) {
		this.eoeaDeliveryDate = eoeaDeliveryDate;
		addValidField("eoeaDeliveryDate");
	}

	/**
	 * Get eoeaIsStorage
	 */
	@Column(name = "EOEA_IS_STORAGE")
	public Long getEoeaIsStorage() {
		return eoeaIsStorage;
	}

	/**
	 * Set eoeaIsStorage
	 */
	public void setEoeaIsStorage(Long eoeaIsStorage) {
		this.eoeaIsStorage = eoeaIsStorage;
		addValidField("eoeaIsStorage");
	}

	/**
	 * Get eoeaReceiptPlaceCode
	 */
	@Column(name = "EOEA_RECEIPT_PLACE_CODE")
	public String getEoeaReceiptPlaceCode() {
		return eoeaReceiptPlaceCode;
	}

	/**
	 * Set eoeaReceiptPlaceCode
	 */
	public void setEoeaReceiptPlaceCode(String eoeaReceiptPlaceCode) {
		this.eoeaReceiptPlaceCode = eoeaReceiptPlaceCode;
		addValidField("eoeaReceiptPlaceCode");
	}

	/**
	 * Get eoeaReceiptPlaceId
	 */
	@Column(name = "EOEA_RECEIPT_PLACE_ID")
	public Long getEoeaReceiptPlaceId() {
		return eoeaReceiptPlaceId;
	}

	/**
	 * Set eoeaReceiptPlaceId
	 */
	public void setEoeaReceiptPlaceId(Long eoeaReceiptPlaceId) {
		this.eoeaReceiptPlaceId = eoeaReceiptPlaceId;
		addValidField("eoeaReceiptPlaceId");
	}

	/**
	 * Get eoeaNotifierId
	 */
	@Column(name = "EOEA_NOTIFIER_ID")
	public Long getEoeaNotifierId() {
		return eoeaNotifierId;
	}

	/**
	 * Set eoeaNotifierId
	 */
	public void setEoeaNotifierId(Long eoeaNotifierId) {
		this.eoeaNotifierId = eoeaNotifierId;
		addValidField("eoeaNotifierId");
	}

	/**
	 * Get eoeaNotifierName
	 */
	@Column(name = "EOEA_NOTIFIER_NAME")
	public String getEoeaNotifierName() {
		return eoeaNotifierName;
	}

	/**
	 * Set eoeaNotifierName
	 */
	public void setEoeaNotifierName(String eoeaNotifierName) {
		this.eoeaNotifierName = eoeaNotifierName;
		addValidField("eoeaNotifierName");
	}

	/**
	 * Get eoeaNotifierCode
	 */
	@Column(name = "EOEA_NOTIFIER_CODE")
	public String getEoeaNotifierCode() {
		return eoeaNotifierCode;
	}

	/**
	 * Set eoeaNotifierCode
	 */
	public void setEoeaNotifierCode(String eoeaNotifierCode) {
		this.eoeaNotifierCode = eoeaNotifierCode;
		addValidField("eoeaNotifierCode");
	}

	/**
	 * Get eoeaSecondNotifyName
	 */
	@Column(name = "EOEA_SECOND_NOTIFY_NAME")
	public String getEoeaSecondNotifyName() {
		return eoeaSecondNotifyName;
	}

	/**
	 * Set eoeaSecondNotifyName
	 */
	public void setEoeaSecondNotifyName(String eoeaSecondNotifyName) {
		this.eoeaSecondNotifyName = eoeaSecondNotifyName;
		addValidField("eoeaSecondNotifyName");
	}

}
