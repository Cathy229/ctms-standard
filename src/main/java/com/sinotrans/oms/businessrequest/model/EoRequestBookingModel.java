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
 * Model class for EoRequestBooking
 */
@Entity
@Table(name = "EO_REQUEST_BOOKING")
public class EoRequestBookingModel extends BaseModel implements OperationLog {

	//eorbId
	private Long eorbId;
	//eorbEoorId
	private Long eorbEoorId;
	//eorbEscoId
	private Long eorbEscoId;
	//eorbEbpjId
	private Long eorbEbpjId;
	//eorbLoEbppId
	private Long eorbLoEbppId;
	//eorbEbtkId
	private Long eorbEbtkId;
	//eorbIsAutomatic
	private String eorbIsAutomatic;
	//eorbTaskStatus
	private String eorbTaskStatus;
	//eorbTaskFeedback
	private String eorbTaskFeedback;
	//eorbSysCode
	private String eorbSysCode;
	//eorbEbbuId
	private Long eorbEbbuId;
	//eorbEbbuNameCn
	private String eorbEbbuNameCn;
	//eorbEbbuCode
	private String eorbEbbuCode;
	//eorbEbbuDist1
	private String eorbEbbuDist1;
	//eorbEbbuDist2
	private String eorbEbbuDist2;
	//eorbEbbuDist3
	private String eorbEbbuDist3;
	//eorbEbbuDist4
	private String eorbEbbuDist4;
	//eorbEbbuDist5
	private String eorbEbbuDist5;
	//eorbEscoCode
	private String eorbEscoCode;
	//eorbEscoNameCn
	private String eorbEscoNameCn;
	//eorbEsdeDepartmentCode
	private String eorbEsdeDepartmentCode;
	//eorbEsdeDepartmentName
	private String eorbEsdeDepartmentName;
	//eorbEsusUserNameCn
	private String eorbEsusUserNameCn;
	//eorbRetoType
	private Long eorbRetoType;
	//eorbToId
	private String eorbToId;
	//eorbNo
	private String eorbNo;
	//eorbType
	private String eorbType;
	//eorbStatus
	private String eorbStatus;
	//eorbOrder
	private Long eorbOrder;
	//eorbSoNo
	private String eorbSoNo;
	//eorbDoNo
	private String eorbDoNo;
	//eorbIeFlag
	private String eorbIeFlag;
	//eorbReleaseDate
	private Date eorbReleaseDate;
	//eorbDeclarationDate
	private Date eorbDeclarationDate;
	//eorbConsignorEbcuId
	private Long eorbConsignorEbcuId;
	//eorbConsignorEbcuCode
	private String eorbConsignorEbcuCode;
	//eorbConsignorEbcuName
	private String eorbConsignorEbcuName;
	//eorbOwnerEbcuId
	private Long eorbOwnerEbcuId;
	//eorbOwnerEbcuCode
	private String eorbOwnerEbcuCode;
	//eorbOwnerEbcuName
	private String eorbOwnerEbcuName;
	//eorbShipperConsignNo
	private String eorbShipperConsignNo;
	//eorbBulkBillNo
	private String eorbBulkBillNo;
	//eorbHblNo
	private String eorbHblNo;
	//eorbCarrierId
	private Long eorbCarrierId;
	//eorbCarrierCode
	private String eorbCarrierCode;
	//eorbCarrierName
	private String eorbCarrierName;
	//eorbVesselName
	private String eorbVesselName;
	//eorbVoyage
	private String eorbVoyage;
	//eorbEtd
	private Date eorbEtd;
	//eorbBookingAgentId
	private Long eorbBookingAgentId;
	//eorbBookingAgentCode
	private String eorbBookingAgentCode;
	//eorbBookingAgentName
	private String eorbBookingAgentName;
	//eorbBookingContractNo
	private String eorbBookingContractNo;
	//eorbLoadPortId
	private Long eorbLoadPortId;
	//eorbLoadPortCode
	private String eorbLoadPortCode;
	//eorbLoadPortName
	private String eorbLoadPortName;
	//eorbBlLoadPortId
	private Long eorbBlLoadPortId;
	//eorbBlLoadPortCode
	private String eorbBlLoadPortCode;
	//eorbBlLoadPortName
	private String eorbBlLoadPortName;
	//eorbTransferPortId
	private Long eorbTransferPortId;
	//eorbTransferPortCode
	private String eorbTransferPortCode;
	//eorbTransferPortName
	private String eorbTransferPortName;
	//eorbDischargePortId
	private Long eorbDischargePortId;
	//eorbDischargePortCode
	private String eorbDischargePortCode;
	//eorbDischargePortName
	private String eorbDischargePortName;
	//eorbBlDischargePortId
	private Long eorbBlDischargePortId;
	//eorbBlDischargePortCode
	private String eorbBlDischargePortCode;
	//eorbBlDischargePortName
	private String eorbBlDischargePortName;
	//eorbDeliveryPlaceId
	private Long eorbDeliveryPlaceId;
	//eorbDeliveryPlaceCode
	private String eorbDeliveryPlaceCode;
	//eorbDeliveryPlaceName
	private String eorbDeliveryPlaceName;
	//eorbBlDeliveryPlace
	private String eorbBlDeliveryPlace;
	//eorbReceiptPlaceId
	private Long eorbReceiptPlaceId;
	//eorbReceiptPlaceCode
	private String eorbReceiptPlaceCode;
	//eorbReceiptPlaceName
	private String eorbReceiptPlaceName;
	//eorbBlReceiptPlaceId
	private Long eorbBlReceiptPlaceId;
	//eorbBlReceiptPlaceCode
	private String eorbBlReceiptPlaceCode;
	//eorbBlReceiptPlaceName
	private String eorbBlReceiptPlaceName;
	//eorbFinalDestinationId
	private Long eorbFinalDestinationId;
	//eorbFinalDestination
	private String eorbFinalDestination;
	//eorbFinalDestinationCode
	private String eorbFinalDestinationCode;
	//eorbShipperId
	private Long eorbShipperId;
	//eorbShipperCode
	private String eorbShipperCode;
	//eorbShipper
	private String eorbShipper;
	//eorbShipperDetail
	private String eorbShipperDetail;
	//eorbShipperContactName
	private String eorbShipperContactName;
	//eorbShipperEbsaId
	private Long eorbShipperEbsaId;
	//eorbStreetNoPoboxSh
	private String eorbStreetNoPoboxSh;
	//eorbConsigneeId
	private Long eorbConsigneeId;
	//eorbConsigneeCode
	private String eorbConsigneeCode;
	//eorbConsignee
	private String eorbConsignee;
	//eorbConsigneeDetail
	private String eorbConsigneeDetail;
	//eorbConsigneeContactName
	private String eorbConsigneeContactName;
	//eorbConsigneeEbsaId
	private Long eorbConsigneeEbsaId;
	//eorbStreetNoPoboxCn
	private String eorbStreetNoPoboxCn;
	//eorbNotifyId
	private Long eorbNotifyId;
	//eorbNotifyCode
	private String eorbNotifyCode;
	//eorbNotify
	private String eorbNotify;
	//eorbNotifierDetail
	private String eorbNotifierDetail;
	//eorbSecondNotifyId
	private Long eorbSecondNotifyId;
	//eorbSecondNotify
	private String eorbSecondNotify;
	//eorbSecondNotifyCode
	private String eorbSecondNotifyCode;
	//eorbSecondNotifyName
	private String eorbSecondNotifyName;
	//eorbCarrierBookingNo
	private String eorbCarrierBookingNo;
	//eorbBookingRequestDate
	private Date eorbBookingRequestDate;
	//eorbBookingCompletedDate
	private Date eorbBookingCompletedDate;
	//eorbSectionalReleaseDate
	private Date eorbSectionalReleaseDate;
	//eorbDepotId
	private Long eorbDepotId;
	//eorbDepotCode
	private String eorbDepotCode;
	//eorbDepotName
	private String eorbDepotName;
	//eorbLmName
	private String eorbLmName;
	//eorbBlIssueModeCode
	private String eorbBlIssueModeCode;
	//eorbBlIssueModeName
	private String eorbBlIssueModeName;
	//eorbPaymentMethod
	private String eorbPaymentMethod;
	//eorbPaymentPlaceId
	private Long eorbPaymentPlaceId;
	//eorbPaymentPlaceCode
	private String eorbPaymentPlaceCode;
	//eorbPaymentPlaceName
	private String eorbPaymentPlaceName;
	//eorbFreightClauseId
	private Long eorbFreightClauseId;
	//eorbFreightClauseCode
	private String eorbFreightClauseCode;
	//eorbFreightClauseName
	private String eorbFreightClauseName;
	//eorbFreightClauseDetail
	private String eorbFreightClauseDetail;
	//eorbBerthCode
	private String eorbBerthCode;
	//eorbBerthName
	private String eorbBerthName;
	//eorbBlBody
	private String eorbBlBody;
	//eorbBlHead
	private String eorbBlHead;
	//eorbBlCopyNum
	private Integer eorbBlCopyNum;
	//eorbStowageId
	private Long eorbStowageId;
	//eorbStowageCode
	private String eorbStowageCode;
	//eorbStowageName
	private String eorbStowageName;
	//eorbContactorFax
	private String eorbContactorFax;
	//eorbContactorTelephone
	private String eorbContactorTelephone;
	//eorbContactorEmail
	private String eorbContactorEmail;
	//eorbBookingRemark
	private String eorbBookingRemark;
	//eorbInnerRemark
	private String eorbInnerRemark;
	//eorbSacCode
	private String eorbSacCode;
	//eorbInFactShipperId
	private Long eorbInFactShipperId;
	//eorbInFactShipperCode
	private String eorbInFactShipperCode;
	//eorbInFactShipperName
	private String eorbInFactShipperName;
	//eorbInFactShipperDetail
	private String eorbInFactShipperDetail;
	//eorbInFactConsigneeId
	private Long eorbInFactConsigneeId;
	//eorbInFactConsigneeCode
	private String eorbInFactConsigneeCode;
	//eorbInFactConsigneeName
	private String eorbInFactConsigneeName;
	//eorbInFactConsigneeDetail
	private String eorbInFactConsigneeDetail;
	//eorbInFactNotifierId
	private Long eorbInFactNotifierId;
	//eorbInFactNotifierCode
	private String eorbInFactNotifierCode;
	//eorbInFactNotifierName
	private String eorbInFactNotifierName;
	//eorbInFactNotifierDetail
	private String eorbInFactNotifierDetail;
	//eorbIsDutyfree
	private Long eorbIsDutyfree;
	//eorbSubstr1
	private String eorbSubstr1;
	//eorbSubstr2
	private String eorbSubstr2;
	//eorbSubstr3
	private String eorbSubstr3;
	//eorbSubstr4
	private String eorbSubstr4;
	//eorbSubstr5
	private String eorbSubstr5;
	//eorbSubstr6
	private String eorbSubstr6;
	//eorbSubstr7
	private String eorbSubstr7;
	//eorbSubstr8
	private String eorbSubstr8;
	//eorbSubstr9
	private String eorbSubstr9;
	//eorbSubstr10
	private String eorbSubstr10;
	//eorbSubstr11
	private String eorbSubstr11;
	//eorbSubstr12
	private String eorbSubstr12;
	//eorbSubstr13
	private String eorbSubstr13;
	//eorbSubstr14
	private String eorbSubstr14;
	//eorbSubstr15
	private String eorbSubstr15;
	//eorbSubstr16
	private String eorbSubstr16;
	//eorbSubstr17
	private String eorbSubstr17;
	//eorbSubstr18
	private String eorbSubstr18;
	//eorbSubstr19
	private String eorbSubstr19;
	//eorbSubstr20
	private String eorbSubstr20;
	//eorbSubstr21
	private String eorbSubstr21;
	//eorbSubstr22
	private String eorbSubstr22;
	//eorbSubstr23
	private String eorbSubstr23;
	//eorbSubstr24
	private String eorbSubstr24;
	//eorbSubstr25
	private String eorbSubstr25;
	//eorbSubdate1
	private Date eorbSubdate1;
	//eorbSubdate2
	private Date eorbSubdate2;
	//eorbSubdate3
	private Date eorbSubdate3;
	//eorbSubdate4
	private Date eorbSubdate4;
	//eorbSubdate5
	private Date eorbSubdate5;
	//eorbSubdate6
	private Date eorbSubdate6;
	//eorbSubnum1
	private Long eorbSubnum1;
	//eorbSubnum2
	private Long eorbSubnum2;
	//eorbSubnum3
	private Long eorbSubnum3;
	//eorbSubnum4
	private Long eorbSubnum4;
	//eorbSubnum5
	private Long eorbSubnum5;
	//eorbSubnum6
	private Long eorbSubnum6;
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
	//eorbAgentId
	private Long eorbAgentId;
	//eorbAgentCode
	private String eorbAgentCode;
	//eorbAgentName
	private String eorbAgentName;
	//eorbGateCloseTime
	private Date eorbGateCloseTime;
	//eorbEsiDeadline
	private Date eorbEsiDeadline;
	//eorbTaskConfirmUser
	private String eorbTaskConfirmUser;
	//eorbTaskConfirmDate
	private Date eorbTaskConfirmDate;
	//eorbBlStatus
	private String eorbBlStatus;
	//eorbDepotContact
	private String eorbDepotContact;
	//eorbDepotTel
	private String eorbDepotTel;
	//eorbBlFreightClauseName
	private String eorbBlFreightClauseName;
	//eorbRouteId
	private Long eorbEbrtId;
	//eorbRouteName
	private String eorbEbrtName;
	//eorbRouteCode
	private String eorbEbrtCode;
	//eorbSailingDate
	private Date eorbSailingDate;
	//eorbAta
	private Date eorbAta;
	//eorbReceivedBlDate
	private Date eorbReceivedBlDate;
	//eorbAgreementTyep
	private String eorbAgreementTyep;
	

	/**
	 * Get eorbId
	 */
	@Column(name = "EORB_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEorbId() {
		return eorbId;
	}

	/**
	 * Set eorbId
	 */
	public void setEorbId(Long eorbId) {
		this.eorbId = eorbId;
		addValidField("eorbId");
	}

	/**
	 * Get eorbEoorId
	 */
	@Column(name = "EORB_EOOR_ID")
	public Long getEorbEoorId() {
		return eorbEoorId;
	}

	/**
	 * Set eorbEoorId
	 */
	public void setEorbEoorId(Long eorbEoorId) {
		this.eorbEoorId = eorbEoorId;
		addValidField("eorbEoorId");
	}

	/**
	 * Get eorbEscoId
	 */
	@Column(name = "EORB_ESCO_ID")
	public Long getEorbEscoId() {
		return eorbEscoId;
	}

	/**
	 * Set eorbEscoId
	 */
	public void setEorbEscoId(Long eorbEscoId) {
		this.eorbEscoId = eorbEscoId;
		addValidField("eorbEscoId");
	}

	/**
	 * Get eorbEbpjId
	 */
	@Column(name = "EORB_EBPJ_ID")
	public Long getEorbEbpjId() {
		return eorbEbpjId;
	}

	/**
	 * Set eorbEbpjId
	 */
	public void setEorbEbpjId(Long eorbEbpjId) {
		this.eorbEbpjId = eorbEbpjId;
		addValidField("eorbEbpjId");
	}

	/**
	 * Get eorbLoEbppId
	 */
	@Column(name = "EORB_LO_EBPP_ID")
	public Long getEorbLoEbppId() {
		return eorbLoEbppId;
	}

	/**
	 * Set eorbLoEbppId
	 */
	public void setEorbLoEbppId(Long eorbLoEbppId) {
		this.eorbLoEbppId = eorbLoEbppId;
		addValidField("eorbLoEbppId");
	}

	/**
	 * Get eorbEbtkId
	 */
	@Column(name = "EORB_EBTK_ID")
	public Long getEorbEbtkId() {
		return eorbEbtkId;
	}

	/**
	 * Set eorbEbtkId
	 */
	public void setEorbEbtkId(Long eorbEbtkId) {
		this.eorbEbtkId = eorbEbtkId;
		addValidField("eorbEbtkId");
	}

	/**
	 * Get eorbIsAutomatic
	 */
	@Column(name = "EORB_IS_AUTOMATIC")
	public String getEorbIsAutomatic() {
		return eorbIsAutomatic;
	}

	/**
	 * Set eorbIsAutomatic
	 */
	public void setEorbIsAutomatic(String eorbIsAutomatic) {
		this.eorbIsAutomatic = eorbIsAutomatic;
		addValidField("eorbIsAutomatic");
	}

	/**
	 * Get eorbTaskStatus
	 */
	@Column(name = "EORB_TASK_STATUS")
	public String getEorbTaskStatus() {
		return eorbTaskStatus;
	}

	/**
	 * Set eorbTaskStatus
	 */
	public void setEorbTaskStatus(String eorbTaskStatus) {
		this.eorbTaskStatus = eorbTaskStatus;
		addValidField("eorbTaskStatus");
	}

	/**
	 * Get eorbTaskFeedback
	 */
	@Column(name = "EORB_TASK_FEEDBACK")
	public String getEorbTaskFeedback() {
		return eorbTaskFeedback;
	}

	/**
	 * Set eorbTaskFeedback
	 */
	public void setEorbTaskFeedback(String eorbTaskFeedback) {
		this.eorbTaskFeedback = eorbTaskFeedback;
		addValidField("eorbTaskFeedback");
	}

	/**
	 * Get eorbSysCode
	 */
	@Column(name = "EORB_SYS_CODE")
	public String getEorbSysCode() {
		return eorbSysCode;
	}

	/**
	 * Set eorbSysCode
	 */
	public void setEorbSysCode(String eorbSysCode) {
		this.eorbSysCode = eorbSysCode;
		addValidField("eorbSysCode");
	}

	/**
	 * Get eorbEbbuId
	 */
	@Column(name = "EORB_EBBU_ID")
	public Long getEorbEbbuId() {
		return eorbEbbuId;
	}

	/**
	 * Set eorbEbbuId
	 */
	public void setEorbEbbuId(Long eorbEbbuId) {
		this.eorbEbbuId = eorbEbbuId;
		addValidField("eorbEbbuId");
	}

	/**
	 * Get eorbEbbuNameCn
	 */
	@Column(name = "EORB_EBBU_NAME_CN")
	public String getEorbEbbuNameCn() {
		return eorbEbbuNameCn;
	}

	/**
	 * Set eorbEbbuNameCn
	 */
	public void setEorbEbbuNameCn(String eorbEbbuNameCn) {
		this.eorbEbbuNameCn = eorbEbbuNameCn;
		addValidField("eorbEbbuNameCn");
	}

	/**
	 * Get eorbEbbuCode
	 */
	@Column(name = "EORB_EBBU_CODE")
	public String getEorbEbbuCode() {
		return eorbEbbuCode;
	}

	/**
	 * Set eorbEbbuCode
	 */
	public void setEorbEbbuCode(String eorbEbbuCode) {
		this.eorbEbbuCode = eorbEbbuCode;
		addValidField("eorbEbbuCode");
	}

	/**
	 * Get eorbEbbuDist1
	 */
	@Column(name = "EORB_EBBU_DIST_1")
	public String getEorbEbbuDist1() {
		return eorbEbbuDist1;
	}

	/**
	 * Set eorbEbbuDist1
	 */
	public void setEorbEbbuDist1(String eorbEbbuDist1) {
		this.eorbEbbuDist1 = eorbEbbuDist1;
		addValidField("eorbEbbuDist1");
	}

	/**
	 * Get eorbEbbuDist2
	 */
	@Column(name = "EORB_EBBU_DIST_2")
	public String getEorbEbbuDist2() {
		return eorbEbbuDist2;
	}

	/**
	 * Set eorbEbbuDist2
	 */
	public void setEorbEbbuDist2(String eorbEbbuDist2) {
		this.eorbEbbuDist2 = eorbEbbuDist2;
		addValidField("eorbEbbuDist2");
	}

	/**
	 * Get eorbEbbuDist3
	 */
	@Column(name = "EORB_EBBU_DIST_3")
	public String getEorbEbbuDist3() {
		return eorbEbbuDist3;
	}

	/**
	 * Set eorbEbbuDist3
	 */
	public void setEorbEbbuDist3(String eorbEbbuDist3) {
		this.eorbEbbuDist3 = eorbEbbuDist3;
		addValidField("eorbEbbuDist3");
	}

	/**
	 * Get eorbEbbuDist4
	 */
	@Column(name = "EORB_EBBU_DIST_4")
	public String getEorbEbbuDist4() {
		return eorbEbbuDist4;
	}

	/**
	 * Set eorbEbbuDist4
	 */
	public void setEorbEbbuDist4(String eorbEbbuDist4) {
		this.eorbEbbuDist4 = eorbEbbuDist4;
		addValidField("eorbEbbuDist4");
	}

	/**
	 * Get eorbEbbuDist5
	 */
	@Column(name = "EORB_EBBU_DIST_5")
	public String getEorbEbbuDist5() {
		return eorbEbbuDist5;
	}

	/**
	 * Set eorbEbbuDist5
	 */
	public void setEorbEbbuDist5(String eorbEbbuDist5) {
		this.eorbEbbuDist5 = eorbEbbuDist5;
		addValidField("eorbEbbuDist5");
	}

	/**
	 * Get eorbEscoCode
	 */
	@Column(name = "EORB_ESCO_CODE")
	public String getEorbEscoCode() {
		return eorbEscoCode;
	}

	/**
	 * Set eorbEscoCode
	 */
	public void setEorbEscoCode(String eorbEscoCode) {
		this.eorbEscoCode = eorbEscoCode;
		addValidField("eorbEscoCode");
	}

	/**
	 * Get eorbEscoNameCn
	 */
	@Column(name = "EORB_ESCO_NAME_CN")
	public String getEorbEscoNameCn() {
		return eorbEscoNameCn;
	}

	/**
	 * Set eorbEscoNameCn
	 */
	public void setEorbEscoNameCn(String eorbEscoNameCn) {
		this.eorbEscoNameCn = eorbEscoNameCn;
		addValidField("eorbEscoNameCn");
	}

	/**
	 * Get eorbEsdeDepartmentCode
	 */
	@Column(name = "EORB_ESDE_DEPARTMENT_CODE")
	public String getEorbEsdeDepartmentCode() {
		return eorbEsdeDepartmentCode;
	}

	/**
	 * Set eorbEsdeDepartmentCode
	 */
	public void setEorbEsdeDepartmentCode(String eorbEsdeDepartmentCode) {
		this.eorbEsdeDepartmentCode = eorbEsdeDepartmentCode;
		addValidField("eorbEsdeDepartmentCode");
	}

	/**
	 * Get eorbEsdeDepartmentName
	 */
	@Column(name = "EORB_ESDE_DEPARTMENT_NAME")
	public String getEorbEsdeDepartmentName() {
		return eorbEsdeDepartmentName;
	}

	/**
	 * Set eorbEsdeDepartmentName
	 */
	public void setEorbEsdeDepartmentName(String eorbEsdeDepartmentName) {
		this.eorbEsdeDepartmentName = eorbEsdeDepartmentName;
		addValidField("eorbEsdeDepartmentName");
	}

	/**
	 * Get eorbEsusUserNameCn
	 */
	@Column(name = "EORB_ESUS_USER_NAME_CN")
	public String getEorbEsusUserNameCn() {
		return eorbEsusUserNameCn;
	}

	/**
	 * Set eorbEsusUserNameCn
	 */
	public void setEorbEsusUserNameCn(String eorbEsusUserNameCn) {
		this.eorbEsusUserNameCn = eorbEsusUserNameCn;
		addValidField("eorbEsusUserNameCn");
	}

	/**
	 * Get eorbRetoType
	 */
	@Column(name = "EORB_RETO_TYPE")
	public Long getEorbRetoType() {
		return eorbRetoType;
	}

	/**
	 * Set eorbRetoType
	 */
	public void setEorbRetoType(Long eorbRetoType) {
		this.eorbRetoType = eorbRetoType;
		addValidField("eorbRetoType");
	}

	/**
	 * Get eorbToId
	 */
	@Column(name = "EORB_TO_ID")
	public String getEorbToId() {
		return eorbToId;
	}

	/**
	 * Set eorbToId
	 */
	public void setEorbToId(String eorbToId) {
		this.eorbToId = eorbToId;
		addValidField("eorbToId");
	}

	/**
	 * Get eorbNo
	 */
	@Column(name = "EORB_NO")
	public String getEorbNo() {
		return eorbNo;
	}

	/**
	 * Set eorbNo
	 */
	public void setEorbNo(String eorbNo) {
		this.eorbNo = eorbNo;
		addValidField("eorbNo");
	}

	/**
	 * Get eorbType
	 */
	@Column(name = "EORB_TYPE")
	public String getEorbType() {
		return eorbType;
	}

	/**
	 * Set eorbType
	 */
	public void setEorbType(String eorbType) {
		this.eorbType = eorbType;
		addValidField("eorbType");
	}

	/**
	 * Get eorbStatus
	 */
	@Column(name = "EORB_STATUS")
	public String getEorbStatus() {
		return eorbStatus;
	}

	/**
	 * Set eorbStatus
	 */
	public void setEorbStatus(String eorbStatus) {
		this.eorbStatus = eorbStatus;
		addValidField("eorbStatus");
	}

	/**
	 * Get eorbOrder
	 */
	@Column(name = "EORB_ORDER")
	public Long getEorbOrder() {
		return eorbOrder;
	}

	/**
	 * Set eorbOrder
	 */
	public void setEorbOrder(Long eorbOrder) {
		this.eorbOrder = eorbOrder;
		addValidField("eorbOrder");
	}

	/**
	 * Get eorbSoNo
	 */
	@Column(name = "EORB_SO_NO")
	public String getEorbSoNo() {
		return eorbSoNo;
	}

	/**
	 * Set eorbSoNo
	 */
	public void setEorbSoNo(String eorbSoNo) {
		this.eorbSoNo = eorbSoNo;
		addValidField("eorbSoNo");
	}

	/**
	 * Get eorbDoNo
	 */
	@Column(name = "EORB_DO_NO")
	public String getEorbDoNo() {
		return eorbDoNo;
	}

	/**
	 * Set eorbDoNo
	 */
	public void setEorbDoNo(String eorbDoNo) {
		this.eorbDoNo = eorbDoNo;
		addValidField("eorbDoNo");
	}

	/**
	 * Get eorbIeFlag
	 */
	@Column(name = "EORB_IE_FLAG")
	public String getEorbIeFlag() {
		return eorbIeFlag;
	}

	/**
	 * Set eorbIeFlag
	 */
	public void setEorbIeFlag(String eorbIeFlag) {
		this.eorbIeFlag = eorbIeFlag;
		addValidField("eorbIeFlag");
	}

	/**
	 * Get eorbReleaseDate
	 */
	@Column(name = "EORB_RELEASE_DATE")
	public Date getEorbReleaseDate() {
		return eorbReleaseDate;
	}

	/**
	 * Set eorbReleaseDate
	 */
	public void setEorbReleaseDate(Date eorbReleaseDate) {
		this.eorbReleaseDate = eorbReleaseDate;
		addValidField("eorbReleaseDate");
	}

	/**
	 * Get eorbDeclarationDate
	 */
	@Column(name = "EORB_DECLARATION_DATE")
	public Date getEorbDeclarationDate() {
		return eorbDeclarationDate;
	}

	/**
	 * Set eorbDeclarationDate
	 */
	public void setEorbDeclarationDate(Date eorbDeclarationDate) {
		this.eorbDeclarationDate = eorbDeclarationDate;
		addValidField("eorbDeclarationDate");
	}

	/**
	 * Get eorbConsignorEbcuId
	 */
	@Column(name = "EORB_CONSIGNOR_EBCU_ID")
	public Long getEorbConsignorEbcuId() {
		return eorbConsignorEbcuId;
	}

	/**
	 * Set eorbConsignorEbcuId
	 */
	public void setEorbConsignorEbcuId(Long eorbConsignorEbcuId) {
		this.eorbConsignorEbcuId = eorbConsignorEbcuId;
		addValidField("eorbConsignorEbcuId");
	}

	/**
	 * Get eorbConsignorEbcuCode
	 */
	@Column(name = "EORB_CONSIGNOR_EBCU_CODE")
	public String getEorbConsignorEbcuCode() {
		return eorbConsignorEbcuCode;
	}

	/**
	 * Set eorbConsignorEbcuCode
	 */
	public void setEorbConsignorEbcuCode(String eorbConsignorEbcuCode) {
		this.eorbConsignorEbcuCode = eorbConsignorEbcuCode;
		addValidField("eorbConsignorEbcuCode");
	}

	/**
	 * Get eorbConsignorEbcuName
	 */
	@Column(name = "EORB_CONSIGNOR_EBCU_NAME")
	public String getEorbConsignorEbcuName() {
		return eorbConsignorEbcuName;
	}

	/**
	 * Set eorbConsignorEbcuName
	 */
	public void setEorbConsignorEbcuName(String eorbConsignorEbcuName) {
		this.eorbConsignorEbcuName = eorbConsignorEbcuName;
		addValidField("eorbConsignorEbcuName");
	}

	/**
	 * Get eorbOwnerEbcuId
	 */
	@Column(name = "EORB_OWNER_EBCU_ID")
	public Long getEorbOwnerEbcuId() {
		return eorbOwnerEbcuId;
	}

	/**
	 * Set eorbOwnerEbcuId
	 */
	public void setEorbOwnerEbcuId(Long eorbOwnerEbcuId) {
		this.eorbOwnerEbcuId = eorbOwnerEbcuId;
		addValidField("eorbOwnerEbcuId");
	}

	/**
	 * Get eorbOwnerEbcuCode
	 */
	@Column(name = "EORB_OWNER_EBCU_CODE")
	public String getEorbOwnerEbcuCode() {
		return eorbOwnerEbcuCode;
	}

	/**
	 * Set eorbOwnerEbcuCode
	 */
	public void setEorbOwnerEbcuCode(String eorbOwnerEbcuCode) {
		this.eorbOwnerEbcuCode = eorbOwnerEbcuCode;
		addValidField("eorbOwnerEbcuCode");
	}

	/**
	 * Get eorbOwnerEbcuName
	 */
	@Column(name = "EORB_OWNER_EBCU_NAME")
	public String getEorbOwnerEbcuName() {
		return eorbOwnerEbcuName;
	}

	/**
	 * Set eorbOwnerEbcuName
	 */
	public void setEorbOwnerEbcuName(String eorbOwnerEbcuName) {
		this.eorbOwnerEbcuName = eorbOwnerEbcuName;
		addValidField("eorbOwnerEbcuName");
	}

	/**
	 * Get eorbShipperConsignNo
	 */
	@Column(name = "EORB_SHIPPER_CONSIGN_NO")
	public String getEorbShipperConsignNo() {
		return eorbShipperConsignNo;
	}

	/**
	 * Set eorbShipperConsignNo
	 */
	public void setEorbShipperConsignNo(String eorbShipperConsignNo) {
		this.eorbShipperConsignNo = eorbShipperConsignNo;
		addValidField("eorbShipperConsignNo");
	}

	/**
	 * Get eorbBulkBillNo
	 */
	@Column(name = "EORB_BULK_BILL_NO")
	public String getEorbBulkBillNo() {
		return eorbBulkBillNo;
	}

	/**
	 * Set eorbBulkBillNo
	 */
	public void setEorbBulkBillNo(String eorbBulkBillNo) {
		this.eorbBulkBillNo = eorbBulkBillNo;
		addValidField("eorbBulkBillNo");
	}

	/**
	 * Get eorbHblNo
	 */
	@Column(name = "EORB_HBL_NO")
	public String getEorbHblNo() {
		return eorbHblNo;
	}

	/**
	 * Set eorbHblNo
	 */
	public void setEorbHblNo(String eorbHblNo) {
		this.eorbHblNo = eorbHblNo;
		addValidField("eorbHblNo");
	}

	/**
	 * Get eorbCarrierId
	 */
	@Column(name = "EORB_CARRIER_ID")
	public Long getEorbCarrierId() {
		return eorbCarrierId;
	}

	/**
	 * Set eorbCarrierId
	 */
	public void setEorbCarrierId(Long eorbCarrierId) {
		this.eorbCarrierId = eorbCarrierId;
		addValidField("eorbCarrierId");
	}

	/**
	 * Get eorbCarrierCode
	 */
	@Column(name = "EORB_CARRIER_CODE")
	public String getEorbCarrierCode() {
		return eorbCarrierCode;
	}

	/**
	 * Set eorbCarrierCode
	 */
	public void setEorbCarrierCode(String eorbCarrierCode) {
		this.eorbCarrierCode = eorbCarrierCode;
		addValidField("eorbCarrierCode");
	}

	/**
	 * Get eorbCarrierName
	 */
	@Column(name = "EORB_CARRIER_NAME")
	public String getEorbCarrierName() {
		return eorbCarrierName;
	}

	/**
	 * Set eorbCarrierName
	 */
	public void setEorbCarrierName(String eorbCarrierName) {
		this.eorbCarrierName = eorbCarrierName;
		addValidField("eorbCarrierName");
	}

	/**
	 * Get eorbVesselName
	 */
	@Column(name = "EORB_VESSEL_NAME")
	public String getEorbVesselName() {
		return eorbVesselName;
	}

	/**
	 * Set eorbVesselName
	 */
	public void setEorbVesselName(String eorbVesselName) {
		this.eorbVesselName = eorbVesselName;
		addValidField("eorbVesselName");
	}

	/**
	 * Get eorbVoyage
	 */
	@Column(name = "EORB_VOYAGE")
	public String getEorbVoyage() {
		return eorbVoyage;
	}

	/**
	 * Set eorbVoyage
	 */
	public void setEorbVoyage(String eorbVoyage) {
		this.eorbVoyage = eorbVoyage;
		addValidField("eorbVoyage");
	}

	/**
	 * Get eorbEtd
	 */
	@Column(name = "EORB_ETD")
	public Date getEorbEtd() {
		return eorbEtd;
	}

	/**
	 * Set eorbEtd
	 */
	public void setEorbEtd(Date eorbEtd) {
		this.eorbEtd = eorbEtd;
		addValidField("eorbEtd");
	}

	/**
	 * Get eorbBookingAgentId
	 */
	@Column(name = "EORB_BOOKING_AGENT_ID")
	public Long getEorbBookingAgentId() {
		return eorbBookingAgentId;
	}

	/**
	 * Set eorbBookingAgentId
	 */
	public void setEorbBookingAgentId(Long eorbBookingAgentId) {
		this.eorbBookingAgentId = eorbBookingAgentId;
		addValidField("eorbBookingAgentId");
	}

	/**
	 * Get eorbBookingAgentCode
	 */
	@Column(name = "EORB_BOOKING_AGENT_CODE")
	public String getEorbBookingAgentCode() {
		return eorbBookingAgentCode;
	}

	/**
	 * Set eorbBookingAgentCode
	 */
	public void setEorbBookingAgentCode(String eorbBookingAgentCode) {
		this.eorbBookingAgentCode = eorbBookingAgentCode;
		addValidField("eorbBookingAgentCode");
	}

	/**
	 * Get eorbBookingAgentName
	 */
	@Column(name = "EORB_BOOKING_AGENT_NAME")
	public String getEorbBookingAgentName() {
		return eorbBookingAgentName;
	}

	/**
	 * Set eorbBookingAgentName
	 */
	public void setEorbBookingAgentName(String eorbBookingAgentName) {
		this.eorbBookingAgentName = eorbBookingAgentName;
		addValidField("eorbBookingAgentName");
	}

	/**
	 * Get eorbBookingContractNo
	 */
	@Column(name = "EORB_BOOKING_CONTRACT_NO")
	public String getEorbBookingContractNo() {
		return eorbBookingContractNo;
	}

	/**
	 * Set eorbBookingContractNo
	 */
	public void setEorbBookingContractNo(String eorbBookingContractNo) {
		this.eorbBookingContractNo = eorbBookingContractNo;
		addValidField("eorbBookingContractNo");
	}

	/**
	 * Get eorbLoadPortId
	 */
	@Column(name = "EORB_LOAD_PORT_ID")
	public Long getEorbLoadPortId() {
		return eorbLoadPortId;
	}

	/**
	 * Set eorbLoadPortId
	 */
	public void setEorbLoadPortId(Long eorbLoadPortId) {
		this.eorbLoadPortId = eorbLoadPortId;
		addValidField("eorbLoadPortId");
	}

	/**
	 * Get eorbLoadPortCode
	 */
	@Column(name = "EORB_LOAD_PORT_CODE")
	public String getEorbLoadPortCode() {
		return eorbLoadPortCode;
	}

	/**
	 * Set eorbLoadPortCode
	 */
	public void setEorbLoadPortCode(String eorbLoadPortCode) {
		this.eorbLoadPortCode = eorbLoadPortCode;
		addValidField("eorbLoadPortCode");
	}

	/**
	 * Get eorbLoadPortName
	 */
	@Column(name = "EORB_LOAD_PORT_NAME")
	public String getEorbLoadPortName() {
		return eorbLoadPortName;
	}

	/**
	 * Set eorbLoadPortName
	 */
	public void setEorbLoadPortName(String eorbLoadPortName) {
		this.eorbLoadPortName = eorbLoadPortName;
		addValidField("eorbLoadPortName");
	}

	/**
	 * Get eorbBlLoadPortId
	 */
	@Column(name = "EORB_BL_LOAD_PORT_ID")
	public Long getEorbBlLoadPortId() {
		return eorbBlLoadPortId;
	}

	/**
	 * Set eorbBlLoadPortId
	 */
	public void setEorbBlLoadPortId(Long eorbBlLoadPortId) {
		this.eorbBlLoadPortId = eorbBlLoadPortId;
		addValidField("eorbBlLoadPortId");
	}

	/**
	 * Get eorbBlLoadPortCode
	 */
	@Column(name = "EORB_BL_LOAD_PORT_CODE")
	public String getEorbBlLoadPortCode() {
		return eorbBlLoadPortCode;
	}

	/**
	 * Set eorbBlLoadPortCode
	 */
	public void setEorbBlLoadPortCode(String eorbBlLoadPortCode) {
		this.eorbBlLoadPortCode = eorbBlLoadPortCode;
		addValidField("eorbBlLoadPortCode");
	}

	/**
	 * Get eorbBlLoadPortName
	 */
	@Column(name = "EORB_BL_LOAD_PORT_NAME")
	public String getEorbBlLoadPortName() {
		return eorbBlLoadPortName;
	}

	/**
	 * Set eorbBlLoadPortName
	 */
	public void setEorbBlLoadPortName(String eorbBlLoadPortName) {
		this.eorbBlLoadPortName = eorbBlLoadPortName;
		addValidField("eorbBlLoadPortName");
	}

	/**
	 * Get eorbTransferPortId
	 */
	@Column(name = "EORB_TRANSFER_PORT_ID")
	public Long getEorbTransferPortId() {
		return eorbTransferPortId;
	}

	/**
	 * Set eorbTransferPortId
	 */
	public void setEorbTransferPortId(Long eorbTransferPortId) {
		this.eorbTransferPortId = eorbTransferPortId;
		addValidField("eorbTransferPortId");
	}

	/**
	 * Get eorbTransferPortCode
	 */
	@Column(name = "EORB_TRANSFER_PORT_CODE")
	public String getEorbTransferPortCode() {
		return eorbTransferPortCode;
	}

	/**
	 * Set eorbTransferPortCode
	 */
	public void setEorbTransferPortCode(String eorbTransferPortCode) {
		this.eorbTransferPortCode = eorbTransferPortCode;
		addValidField("eorbTransferPortCode");
	}

	/**
	 * Get eorbTransferPortName
	 */
	@Column(name = "EORB_TRANSFER_PORT_NAME")
	public String getEorbTransferPortName() {
		return eorbTransferPortName;
	}

	/**
	 * Set eorbTransferPortName
	 */
	public void setEorbTransferPortName(String eorbTransferPortName) {
		this.eorbTransferPortName = eorbTransferPortName;
		addValidField("eorbTransferPortName");
	}

	/**
	 * Get eorbDischargePortId
	 */
	@Column(name = "EORB_DISCHARGE_PORT_ID")
	public Long getEorbDischargePortId() {
		return eorbDischargePortId;
	}

	/**
	 * Set eorbDischargePortId
	 */
	public void setEorbDischargePortId(Long eorbDischargePortId) {
		this.eorbDischargePortId = eorbDischargePortId;
		addValidField("eorbDischargePortId");
	}

	/**
	 * Get eorbDischargePortCode
	 */
	@Column(name = "EORB_DISCHARGE_PORT_CODE")
	public String getEorbDischargePortCode() {
		return eorbDischargePortCode;
	}

	/**
	 * Set eorbDischargePortCode
	 */
	public void setEorbDischargePortCode(String eorbDischargePortCode) {
		this.eorbDischargePortCode = eorbDischargePortCode;
		addValidField("eorbDischargePortCode");
	}

	/**
	 * Get eorbDischargePortName
	 */
	@Column(name = "EORB_DISCHARGE_PORT_NAME")
	public String getEorbDischargePortName() {
		return eorbDischargePortName;
	}

	/**
	 * Set eorbDischargePortName
	 */
	public void setEorbDischargePortName(String eorbDischargePortName) {
		this.eorbDischargePortName = eorbDischargePortName;
		addValidField("eorbDischargePortName");
	}

	/**
	 * Get eorbBlDischargePortId
	 */
	@Column(name = "EORB_BL_DISCHARGE_PORT_ID")
	public Long getEorbBlDischargePortId() {
		return eorbBlDischargePortId;
	}

	/**
	 * Set eorbBlDischargePortId
	 */
	public void setEorbBlDischargePortId(Long eorbBlDischargePortId) {
		this.eorbBlDischargePortId = eorbBlDischargePortId;
		addValidField("eorbBlDischargePortId");
	}

	/**
	 * Get eorbBlDischargePortCode
	 */
	@Column(name = "EORB_BL_DISCHARGE_PORT_CODE")
	public String getEorbBlDischargePortCode() {
		return eorbBlDischargePortCode;
	}

	/**
	 * Set eorbBlDischargePortCode
	 */
	public void setEorbBlDischargePortCode(String eorbBlDischargePortCode) {
		this.eorbBlDischargePortCode = eorbBlDischargePortCode;
		addValidField("eorbBlDischargePortCode");
	}

	/**
	 * Get eorbBlDischargePortName
	 */
	@Column(name = "EORB_BL_DISCHARGE_PORT_NAME")
	public String getEorbBlDischargePortName() {
		return eorbBlDischargePortName;
	}

	/**
	 * Set eorbBlDischargePortName
	 */
	public void setEorbBlDischargePortName(String eorbBlDischargePortName) {
		this.eorbBlDischargePortName = eorbBlDischargePortName;
		addValidField("eorbBlDischargePortName");
	}

	/**
	 * Get eorbDeliveryPlaceId
	 */
	@Column(name = "EORB_DELIVERY_PLACE_ID")
	public Long getEorbDeliveryPlaceId() {
		return eorbDeliveryPlaceId;
	}

	/**
	 * Set eorbDeliveryPlaceId
	 */
	public void setEorbDeliveryPlaceId(Long eorbDeliveryPlaceId) {
		this.eorbDeliveryPlaceId = eorbDeliveryPlaceId;
		addValidField("eorbDeliveryPlaceId");
	}

	/**
	 * Get eorbDeliveryPlaceCode
	 */
	@Column(name = "EORB_DELIVERY_PLACE_CODE")
	public String getEorbDeliveryPlaceCode() {
		return eorbDeliveryPlaceCode;
	}

	/**
	 * Set eorbDeliveryPlaceCode
	 */
	public void setEorbDeliveryPlaceCode(String eorbDeliveryPlaceCode) {
		this.eorbDeliveryPlaceCode = eorbDeliveryPlaceCode;
		addValidField("eorbDeliveryPlaceCode");
	}

	/**
	 * Get eorbDeliveryPlaceName
	 */
	@Column(name = "EORB_DELIVERY_PLACE_NAME")
	public String getEorbDeliveryPlaceName() {
		return eorbDeliveryPlaceName;
	}

	/**
	 * Set eorbDeliveryPlaceName
	 */
	public void setEorbDeliveryPlaceName(String eorbDeliveryPlaceName) {
		this.eorbDeliveryPlaceName = eorbDeliveryPlaceName;
		addValidField("eorbDeliveryPlaceName");
	}

	/**
	 * Get eorbBlDeliveryPlace
	 */
	@Column(name = "EORB_BL_DELIVERY_PLACE")
	public String getEorbBlDeliveryPlace() {
		return eorbBlDeliveryPlace;
	}

	/**
	 * Set eorbBlDeliveryPlace
	 */
	public void setEorbBlDeliveryPlace(String eorbBlDeliveryPlace) {
		this.eorbBlDeliveryPlace = eorbBlDeliveryPlace;
		addValidField("eorbBlDeliveryPlace");
	}

	/**
	 * Get eorbReceiptPlaceId
	 */
	@Column(name = "EORB_RECEIPT_PLACE_ID")
	public Long getEorbReceiptPlaceId() {
		return eorbReceiptPlaceId;
	}

	/**
	 * Set eorbReceiptPlaceId
	 */
	public void setEorbReceiptPlaceId(Long eorbReceiptPlaceId) {
		this.eorbReceiptPlaceId = eorbReceiptPlaceId;
		addValidField("eorbReceiptPlaceId");
	}

	/**
	 * Get eorbReceiptPlaceCode
	 */
	@Column(name = "EORB_RECEIPT_PLACE_CODE")
	public String getEorbReceiptPlaceCode() {
		return eorbReceiptPlaceCode;
	}

	/**
	 * Set eorbReceiptPlaceCode
	 */
	public void setEorbReceiptPlaceCode(String eorbReceiptPlaceCode) {
		this.eorbReceiptPlaceCode = eorbReceiptPlaceCode;
		addValidField("eorbReceiptPlaceCode");
	}

	/**
	 * Get eorbReceiptPlaceName
	 */
	@Column(name = "EORB_RECEIPT_PLACE_NAME")
	public String getEorbReceiptPlaceName() {
		return eorbReceiptPlaceName;
	}

	/**
	 * Set eorbReceiptPlaceName
	 */
	public void setEorbReceiptPlaceName(String eorbReceiptPlaceName) {
		this.eorbReceiptPlaceName = eorbReceiptPlaceName;
		addValidField("eorbReceiptPlaceName");
	}

	/**
	 * Get eorbBlReceiptPlaceId
	 */
	@Column(name = "EORB_BL_RECEIPT_PLACE_ID")
	public Long getEorbBlReceiptPlaceId() {
		return eorbBlReceiptPlaceId;
	}

	/**
	 * Set eorbBlReceiptPlaceId
	 */
	public void setEorbBlReceiptPlaceId(Long eorbBlReceiptPlaceId) {
		this.eorbBlReceiptPlaceId = eorbBlReceiptPlaceId;
		addValidField("eorbBlReceiptPlaceId");
	}

	/**
	 * Get eorbBlReceiptPlaceCode
	 */
	@Column(name = "EORB_BL_RECEIPT_PLACE_CODE")
	public String getEorbBlReceiptPlaceCode() {
		return eorbBlReceiptPlaceCode;
	}

	/**
	 * Set eorbBlReceiptPlaceCode
	 */
	public void setEorbBlReceiptPlaceCode(String eorbBlReceiptPlaceCode) {
		this.eorbBlReceiptPlaceCode = eorbBlReceiptPlaceCode;
		addValidField("eorbBlReceiptPlaceCode");
	}

	/**
	 * Get eorbBlReceiptPlaceName
	 */
	@Column(name = "EORB_BL_RECEIPT_PLACE_NAME")
	public String getEorbBlReceiptPlaceName() {
		return eorbBlReceiptPlaceName;
	}

	/**
	 * Set eorbBlReceiptPlaceName
	 */
	public void setEorbBlReceiptPlaceName(String eorbBlReceiptPlaceName) {
		this.eorbBlReceiptPlaceName = eorbBlReceiptPlaceName;
		addValidField("eorbBlReceiptPlaceName");
	}

	/**
	 * Get eorbFinalDestinationId
	 */
	@Column(name = "EORB_FINAL_DESTINATION_ID")
	public Long getEorbFinalDestinationId() {
		return eorbFinalDestinationId;
	}

	/**
	 * Set eorbFinalDestinationId
	 */
	public void setEorbFinalDestinationId(Long eorbFinalDestinationId) {
		this.eorbFinalDestinationId = eorbFinalDestinationId;
		addValidField("eorbFinalDestinationId");
	}

	/**
	 * Get eorbFinalDestination
	 */
	@Column(name = "EORB_FINAL_DESTINATION")
	public String getEorbFinalDestination() {
		return eorbFinalDestination;
	}

	/**
	 * Set eorbFinalDestination
	 */
	public void setEorbFinalDestination(String eorbFinalDestination) {
		this.eorbFinalDestination = eorbFinalDestination;
		addValidField("eorbFinalDestination");
	}

	/**
	 * Get eorbFinalDestinationCode
	 */
	@Column(name = "EORB_FINAL_DESTINATION_CODE")
	public String getEorbFinalDestinationCode() {
		return eorbFinalDestinationCode;
	}

	/**
	 * Set eorbFinalDestinationCode
	 */
	public void setEorbFinalDestinationCode(String eorbFinalDestinationCode) {
		this.eorbFinalDestinationCode = eorbFinalDestinationCode;
		addValidField("eorbFinalDestinationCode");
	}

	/**
	 * Get eorbShipperId
	 */
	@Column(name = "EORB_SHIPPER_ID")
	public Long getEorbShipperId() {
		return eorbShipperId;
	}

	/**
	 * Set eorbShipperId
	 */
	public void setEorbShipperId(Long eorbShipperId) {
		this.eorbShipperId = eorbShipperId;
		addValidField("eorbShipperId");
	}

	/**
	 * Get eorbShipperCode
	 */
	@Column(name = "EORB_SHIPPER_CODE")
	public String getEorbShipperCode() {
		return eorbShipperCode;
	}

	/**
	 * Set eorbShipperCode
	 */
	public void setEorbShipperCode(String eorbShipperCode) {
		this.eorbShipperCode = eorbShipperCode;
		addValidField("eorbShipperCode");
	}

	/**
	 * Get eorbShipper
	 */
	@Column(name = "EORB_SHIPPER")
	public String getEorbShipper() {
		return eorbShipper;
	}

	/**
	 * Set eorbShipper
	 */
	public void setEorbShipper(String eorbShipper) {
		this.eorbShipper = eorbShipper;
		addValidField("eorbShipper");
	}

	/**
	 * Get eorbShipperDetail
	 */
	@Column(name = "EORB_SHIPPER_DETAIL")
	public String getEorbShipperDetail() {
		return eorbShipperDetail;
	}

	/**
	 * Set eorbShipperDetail
	 */
	public void setEorbShipperDetail(String eorbShipperDetail) {
		this.eorbShipperDetail = eorbShipperDetail;
		addValidField("eorbShipperDetail");
	}

	/**
	 * Get eorbShipperContactName
	 */
	@Column(name = "EORB_SHIPPER_CONTACT_NAME")
	public String getEorbShipperContactName() {
		return eorbShipperContactName;
	}

	/**
	 * Set eorbShipperContactName
	 */
	public void setEorbShipperContactName(String eorbShipperContactName) {
		this.eorbShipperContactName = eorbShipperContactName;
		addValidField("eorbShipperContactName");
	}

	/**
	 * Get eorbShipperEbsaId
	 */
	@Column(name = "EORB_SHIPPER_EBSA_ID")
	public Long getEorbShipperEbsaId() {
		return eorbShipperEbsaId;
	}

	/**
	 * Set eorbShipperEbsaId
	 */
	public void setEorbShipperEbsaId(Long eorbShipperEbsaId) {
		this.eorbShipperEbsaId = eorbShipperEbsaId;
		addValidField("eorbShipperEbsaId");
	}

	/**
	 * Get eorbStreetNoPoboxSh
	 */
	@Column(name = "EORB_STREET_NO_POBOX_SH")
	public String getEorbStreetNoPoboxSh() {
		return eorbStreetNoPoboxSh;
	}

	/**
	 * Set eorbStreetNoPoboxSh
	 */
	public void setEorbStreetNoPoboxSh(String eorbStreetNoPoboxSh) {
		this.eorbStreetNoPoboxSh = eorbStreetNoPoboxSh;
		addValidField("eorbStreetNoPoboxSh");
	}

	/**
	 * Get eorbConsigneeId
	 */
	@Column(name = "EORB_CONSIGNEE_ID")
	public Long getEorbConsigneeId() {
		return eorbConsigneeId;
	}

	/**
	 * Set eorbConsigneeId
	 */
	public void setEorbConsigneeId(Long eorbConsigneeId) {
		this.eorbConsigneeId = eorbConsigneeId;
		addValidField("eorbConsigneeId");
	}

	/**
	 * Get eorbConsigneeCode
	 */
	@Column(name = "EORB_CONSIGNEE_CODE")
	public String getEorbConsigneeCode() {
		return eorbConsigneeCode;
	}

	/**
	 * Set eorbConsigneeCode
	 */
	public void setEorbConsigneeCode(String eorbConsigneeCode) {
		this.eorbConsigneeCode = eorbConsigneeCode;
		addValidField("eorbConsigneeCode");
	}

	/**
	 * Get eorbConsignee
	 */
	@Column(name = "EORB_CONSIGNEE")
	public String getEorbConsignee() {
		return eorbConsignee;
	}

	/**
	 * Set eorbConsignee
	 */
	public void setEorbConsignee(String eorbConsignee) {
		this.eorbConsignee = eorbConsignee;
		addValidField("eorbConsignee");
	}

	/**
	 * Get eorbConsigneeDetail
	 */
	@Column(name = "EORB_CONSIGNEE_DETAIL")
	public String getEorbConsigneeDetail() {
		return eorbConsigneeDetail;
	}

	/**
	 * Set eorbConsigneeDetail
	 */
	public void setEorbConsigneeDetail(String eorbConsigneeDetail) {
		this.eorbConsigneeDetail = eorbConsigneeDetail;
		addValidField("eorbConsigneeDetail");
	}

	/**
	 * Get eorbConsigneeContactName
	 */
	@Column(name = "EORB_CONSIGNEE_CONTACT_NAME")
	public String getEorbConsigneeContactName() {
		return eorbConsigneeContactName;
	}

	/**
	 * Set eorbConsigneeContactName
	 */
	public void setEorbConsigneeContactName(String eorbConsigneeContactName) {
		this.eorbConsigneeContactName = eorbConsigneeContactName;
		addValidField("eorbConsigneeContactName");
	}

	/**
	 * Get eorbConsigneeEbsaId
	 */
	@Column(name = "EORB_CONSIGNEE_EBSA_ID")
	public Long getEorbConsigneeEbsaId() {
		return eorbConsigneeEbsaId;
	}

	/**
	 * Set eorbConsigneeEbsaId
	 */
	public void setEorbConsigneeEbsaId(Long eorbConsigneeEbsaId) {
		this.eorbConsigneeEbsaId = eorbConsigneeEbsaId;
		addValidField("eorbConsigneeEbsaId");
	}

	/**
	 * Get eorbStreetNoPoboxCn
	 */
	@Column(name = "EORB_STREET_NO_POBOX_CN")
	public String getEorbStreetNoPoboxCn() {
		return eorbStreetNoPoboxCn;
	}

	/**
	 * Set eorbStreetNoPoboxCn
	 */
	public void setEorbStreetNoPoboxCn(String eorbStreetNoPoboxCn) {
		this.eorbStreetNoPoboxCn = eorbStreetNoPoboxCn;
		addValidField("eorbStreetNoPoboxCn");
	}

	/**
	 * Get eorbNotifyId
	 */
	@Column(name = "EORB_NOTIFY_ID")
	public Long getEorbNotifyId() {
		return eorbNotifyId;
	}

	/**
	 * Set eorbNotifyId
	 */
	public void setEorbNotifyId(Long eorbNotifyId) {
		this.eorbNotifyId = eorbNotifyId;
		addValidField("eorbNotifyId");
	}

	/**
	 * Get eorbNotifyCode
	 */
	@Column(name = "EORB_NOTIFY_CODE")
	public String getEorbNotifyCode() {
		return eorbNotifyCode;
	}

	/**
	 * Set eorbNotifyCode
	 */
	public void setEorbNotifyCode(String eorbNotifyCode) {
		this.eorbNotifyCode = eorbNotifyCode;
		addValidField("eorbNotifyCode");
	}

	/**
	 * Get eorbNotify
	 */
	@Column(name = "EORB_NOTIFY")
	public String getEorbNotify() {
		return eorbNotify;
	}

	/**
	 * Set eorbNotify
	 */
	public void setEorbNotify(String eorbNotify) {
		this.eorbNotify = eorbNotify;
		addValidField("eorbNotify");
	}

	/**
	 * Get eorbNotifierDetail
	 */
	@Column(name = "EORB_NOTIFIER_DETAIL")
	public String getEorbNotifierDetail() {
		return eorbNotifierDetail;
	}

	/**
	 * Set eorbNotifierDetail
	 */
	public void setEorbNotifierDetail(String eorbNotifierDetail) {
		this.eorbNotifierDetail = eorbNotifierDetail;
		addValidField("eorbNotifierDetail");
	}

	/**
	 * Get eorbSecondNotifyId
	 */
	@Column(name = "EORB_SECOND_NOTIFY_ID")
	public Long getEorbSecondNotifyId() {
		return eorbSecondNotifyId;
	}

	/**
	 * Set eorbSecondNotifyId
	 */
	public void setEorbSecondNotifyId(Long eorbSecondNotifyId) {
		this.eorbSecondNotifyId = eorbSecondNotifyId;
		addValidField("eorbSecondNotifyId");
	}

	/**
	 * Get eorbSecondNotify
	 */
	@Column(name = "EORB_SECOND_NOTIFY")
	public String getEorbSecondNotify() {
		return eorbSecondNotify;
	}

	/**
	 * Set eorbSecondNotify
	 */
	public void setEorbSecondNotify(String eorbSecondNotify) {
		this.eorbSecondNotify = eorbSecondNotify;
		addValidField("eorbSecondNotify");
	}

	/**
	 * Get eorbSecondNotifyCode
	 */
	@Column(name = "EORB_SECOND_NOTIFY_CODE")
	public String getEorbSecondNotifyCode() {
		return eorbSecondNotifyCode;
	}

	/**
	 * Set eorbSecondNotifyCode
	 */
	public void setEorbSecondNotifyCode(String eorbSecondNotifyCode) {
		this.eorbSecondNotifyCode = eorbSecondNotifyCode;
		addValidField("eorbSecondNotifyCode");
	}

	/**
	 * Get eorbSecondNotifyName
	 */
	@Column(name = "EORB_SECOND_NOTIFY_NAME")
	public String getEorbSecondNotifyName() {
		return eorbSecondNotifyName;
	}

	/**
	 * Set eorbSecondNotifyName
	 */
	public void setEorbSecondNotifyName(String eorbSecondNotifyName) {
		this.eorbSecondNotifyName = eorbSecondNotifyName;
		addValidField("eorbSecondNotifyName");
	}

	/**
	 * Get eorbCarrierBookingNo
	 */
	@Column(name = "EORB_CARRIER_BOOKING_NO")
	public String getEorbCarrierBookingNo() {
		return eorbCarrierBookingNo;
	}

	/**
	 * Set eorbCarrierBookingNo
	 */
	public void setEorbCarrierBookingNo(String eorbCarrierBookingNo) {
		this.eorbCarrierBookingNo = eorbCarrierBookingNo;
		addValidField("eorbCarrierBookingNo");
	}

	/**
	 * Get eorbBookingRequestDate
	 */
	@Column(name = "EORB_BOOKING_REQUEST_DATE")
	public Date getEorbBookingRequestDate() {
		return eorbBookingRequestDate;
	}

	/**
	 * Set eorbBookingRequestDate
	 */
	public void setEorbBookingRequestDate(Date eorbBookingRequestDate) {
		this.eorbBookingRequestDate = eorbBookingRequestDate;
		addValidField("eorbBookingRequestDate");
	}

	/**
	 * Get eorbBookingCompletedDate
	 */
	@Column(name = "EORB_BOOKING_COMPLETED_DATE")
	public Date getEorbBookingCompletedDate() {
		return eorbBookingCompletedDate;
	}

	/**
	 * Set eorbBookingCompletedDate
	 */
	public void setEorbBookingCompletedDate(Date eorbBookingCompletedDate) {
		this.eorbBookingCompletedDate = eorbBookingCompletedDate;
		addValidField("eorbBookingCompletedDate");
	}

	/**
	 * Get eorbSectionalReleaseDate
	 */
	@Column(name = "EORB_SECTIONAL_RELEASE_DATE")
	public Date getEorbSectionalReleaseDate() {
		return eorbSectionalReleaseDate;
	}

	/**
	 * Set eorbSectionalReleaseDate
	 */
	public void setEorbSectionalReleaseDate(Date eorbSectionalReleaseDate) {
		this.eorbSectionalReleaseDate = eorbSectionalReleaseDate;
		addValidField("eorbSectionalReleaseDate");
	}

	/**
	 * Get eorbDepotId
	 */
	@Column(name = "EORB_DEPOT_ID")
	public Long getEorbDepotId() {
		return eorbDepotId;
	}

	/**
	 * Set eorbDepotId
	 */
	public void setEorbDepotId(Long eorbDepotId) {
		this.eorbDepotId = eorbDepotId;
		addValidField("eorbDepotId");
	}

	/**
	 * Get eorbDepotCode
	 */
	@Column(name = "EORB_DEPOT_CODE")
	public String getEorbDepotCode() {
		return eorbDepotCode;
	}

	/**
	 * Set eorbDepotCode
	 */
	public void setEorbDepotCode(String eorbDepotCode) {
		this.eorbDepotCode = eorbDepotCode;
		addValidField("eorbDepotCode");
	}

	/**
	 * Get eorbDepotName
	 */
	@Column(name = "EORB_DEPOT_NAME")
	public String getEorbDepotName() {
		return eorbDepotName;
	}

	/**
	 * Set eorbDepotName
	 */
	public void setEorbDepotName(String eorbDepotName) {
		this.eorbDepotName = eorbDepotName;
		addValidField("eorbDepotName");
	}

	/**
	 * Get eorbLmName
	 */
	@Column(name = "EORB_LM_NAME")
	public String getEorbLmName() {
		return eorbLmName;
	}

	/**
	 * Set eorbLmName
	 */
	public void setEorbLmName(String eorbLmName) {
		this.eorbLmName = eorbLmName;
		addValidField("eorbLmName");
	}

	/**
	 * Get eorbBlIssueModeCode
	 */
	@Column(name = "EORB_BL_ISSUE_MODE_CODE")
	public String getEorbBlIssueModeCode() {
		return eorbBlIssueModeCode;
	}

	/**
	 * Set eorbBlIssueModeCode
	 */
	public void setEorbBlIssueModeCode(String eorbBlIssueModeCode) {
		this.eorbBlIssueModeCode = eorbBlIssueModeCode;
		addValidField("eorbBlIssueModeCode");
	}

	/**
	 * Get eorbBlIssueModeName
	 */
	@Column(name = "EORB_BL_ISSUE_MODE_NAME")
	public String getEorbBlIssueModeName() {
		return eorbBlIssueModeName;
	}

	/**
	 * Set eorbBlIssueModeName
	 */
	public void setEorbBlIssueModeName(String eorbBlIssueModeName) {
		this.eorbBlIssueModeName = eorbBlIssueModeName;
		addValidField("eorbBlIssueModeName");
	}

	/**
	 * Get eorbPaymentMethod
	 */
	@Column(name = "EORB_PAYMENT_METHOD")
	public String getEorbPaymentMethod() {
		return eorbPaymentMethod;
	}

	/**
	 * Set eorbPaymentMethod
	 */
	public void setEorbPaymentMethod(String eorbPaymentMethod) {
		this.eorbPaymentMethod = eorbPaymentMethod;
		addValidField("eorbPaymentMethod");
	}

	/**
	 * Get eorbPaymentPlaceId
	 */
	@Column(name = "EORB_PAYMENT_PLACE_ID")
	public Long getEorbPaymentPlaceId() {
		return eorbPaymentPlaceId;
	}

	/**
	 * Set eorbPaymentPlaceId
	 */
	public void setEorbPaymentPlaceId(Long eorbPaymentPlaceId) {
		this.eorbPaymentPlaceId = eorbPaymentPlaceId;
		addValidField("eorbPaymentPlaceId");
	}

	/**
	 * Get eorbPaymentPlaceCode
	 */
	@Column(name = "EORB_PAYMENT_PLACE_CODE")
	public String getEorbPaymentPlaceCode() {
		return eorbPaymentPlaceCode;
	}

	/**
	 * Set eorbPaymentPlaceCode
	 */
	public void setEorbPaymentPlaceCode(String eorbPaymentPlaceCode) {
		this.eorbPaymentPlaceCode = eorbPaymentPlaceCode;
		addValidField("eorbPaymentPlaceCode");
	}

	/**
	 * Get eorbPaymentPlaceName
	 */
	@Column(name = "EORB_PAYMENT_PLACE_NAME")
	public String getEorbPaymentPlaceName() {
		return eorbPaymentPlaceName;
	}

	/**
	 * Set eorbPaymentPlaceName
	 */
	public void setEorbPaymentPlaceName(String eorbPaymentPlaceName) {
		this.eorbPaymentPlaceName = eorbPaymentPlaceName;
		addValidField("eorbPaymentPlaceName");
	}

	/**
	 * Get eorbFreightClauseId
	 */
	@Column(name = "EORB_FREIGHT_CLAUSE_ID")
	public Long getEorbFreightClauseId() {
		return eorbFreightClauseId;
	}

	/**
	 * Set eorbFreightClauseId
	 */
	public void setEorbFreightClauseId(Long eorbFreightClauseId) {
		this.eorbFreightClauseId = eorbFreightClauseId;
		addValidField("eorbFreightClauseId");
	}

	/**
	 * Get eorbFreightClauseCode
	 */
	@Column(name = "EORB_FREIGHT_CLAUSE_CODE")
	public String getEorbFreightClauseCode() {
		return eorbFreightClauseCode;
	}

	/**
	 * Set eorbFreightClauseCode
	 */
	public void setEorbFreightClauseCode(String eorbFreightClauseCode) {
		this.eorbFreightClauseCode = eorbFreightClauseCode;
		addValidField("eorbFreightClauseCode");
	}

	/**
	 * Get eorbFreightClauseName
	 */
	@Column(name = "EORB_FREIGHT_CLAUSE_NAME")
	public String getEorbFreightClauseName() {
		return eorbFreightClauseName;
	}

	/**
	 * Set eorbFreightClauseName
	 */
	public void setEorbFreightClauseName(String eorbFreightClauseName) {
		this.eorbFreightClauseName = eorbFreightClauseName;
		addValidField("eorbFreightClauseName");
	}

	/**
	 * Get eorbFreightClauseDetail
	 */
	@Column(name = "EORB_FREIGHT_CLAUSE_DETAIL")
	public String getEorbFreightClauseDetail() {
		return eorbFreightClauseDetail;
	}

	/**
	 * Set eorbFreightClauseDetail
	 */
	public void setEorbFreightClauseDetail(String eorbFreightClauseDetail) {
		this.eorbFreightClauseDetail = eorbFreightClauseDetail;
		addValidField("eorbFreightClauseDetail");
	}

	/**
	 * Get eorbBerthCode
	 */
	@Column(name = "EORB_BERTH_CODE")
	public String getEorbBerthCode() {
		return eorbBerthCode;
	}

	/**
	 * Set eorbBerthCode
	 */
	public void setEorbBerthCode(String eorbBerthCode) {
		this.eorbBerthCode = eorbBerthCode;
		addValidField("eorbBerthCode");
	}

	/**
	 * Get eorbBerthName
	 */
	@Column(name = "EORB_BERTH_NAME")
	public String getEorbBerthName() {
		return eorbBerthName;
	}

	/**
	 * Set eorbBerthName
	 */
	public void setEorbBerthName(String eorbBerthName) {
		this.eorbBerthName = eorbBerthName;
		addValidField("eorbBerthName");
	}

	/**
	 * Get eorbBlBody
	 */
	@Column(name = "EORB_BL_BODY")
	public String getEorbBlBody() {
		return eorbBlBody;
	}

	/**
	 * Set eorbBlBody
	 */
	public void setEorbBlBody(String eorbBlBody) {
		this.eorbBlBody = eorbBlBody;
		addValidField("eorbBlBody");
	}

	/**
	 * Get eorbBlHead
	 */
	@Column(name = "EORB_BL_HEAD")
	public String getEorbBlHead() {
		return eorbBlHead;
	}

	/**
	 * Set eorbBlHead
	 */
	public void setEorbBlHead(String eorbBlHead) {
		this.eorbBlHead = eorbBlHead;
		addValidField("eorbBlHead");
	}

	/**
	 * Get eorbBlCopyNum
	 */
	@Column(name = "EORB_BL_COPY_NUM")
	public Integer getEorbBlCopyNum() {
		return eorbBlCopyNum;
	}

	/**
	 * Set eorbBlCopyNum
	 */
	public void setEorbBlCopyNum(Integer eorbBlCopyNum) {
		this.eorbBlCopyNum = eorbBlCopyNum;
		addValidField("eorbBlCopyNum");
	}

	/**
	 * Get eorbStowageId
	 */
	@Column(name = "EORB_STOWAGE_ID")
	public Long getEorbStowageId() {
		return eorbStowageId;
	}

	/**
	 * Set eorbStowageId
	 */
	public void setEorbStowageId(Long eorbStowageId) {
		this.eorbStowageId = eorbStowageId;
		addValidField("eorbStowageId");
	}

	/**
	 * Get eorbStowageCode
	 */
	@Column(name = "EORB_STOWAGE_CODE")
	public String getEorbStowageCode() {
		return eorbStowageCode;
	}

	/**
	 * Set eorbStowageCode
	 */
	public void setEorbStowageCode(String eorbStowageCode) {
		this.eorbStowageCode = eorbStowageCode;
		addValidField("eorbStowageCode");
	}

	/**
	 * Get eorbStowageName
	 */
	@Column(name = "EORB_STOWAGE_NAME")
	public String getEorbStowageName() {
		return eorbStowageName;
	}

	/**
	 * Set eorbStowageName
	 */
	public void setEorbStowageName(String eorbStowageName) {
		this.eorbStowageName = eorbStowageName;
		addValidField("eorbStowageName");
	}

	/**
	 * Get eorbContactorFax
	 */
	@Column(name = "EORB_CONTACTOR_FAX")
	public String getEorbContactorFax() {
		return eorbContactorFax;
	}

	/**
	 * Set eorbContactorFax
	 */
	public void setEorbContactorFax(String eorbContactorFax) {
		this.eorbContactorFax = eorbContactorFax;
		addValidField("eorbContactorFax");
	}

	/**
	 * Get eorbContactorTelephone
	 */
	@Column(name = "EORB_CONTACTOR_TELEPHONE")
	public String getEorbContactorTelephone() {
		return eorbContactorTelephone;
	}

	/**
	 * Set eorbContactorTelephone
	 */
	public void setEorbContactorTelephone(String eorbContactorTelephone) {
		this.eorbContactorTelephone = eorbContactorTelephone;
		addValidField("eorbContactorTelephone");
	}

	/**
	 * Get eorbContactorEmail
	 */
	@Column(name = "EORB_CONTACTOR_EMAIL")
	public String getEorbContactorEmail() {
		return eorbContactorEmail;
	}

	/**
	 * Set eorbContactorEmail
	 */
	public void setEorbContactorEmail(String eorbContactorEmail) {
		this.eorbContactorEmail = eorbContactorEmail;
		addValidField("eorbContactorEmail");
	}

	/**
	 * Get eorbBookingRemark
	 */
	@Column(name = "EORB_BOOKING_REMARK")
	public String getEorbBookingRemark() {
		return eorbBookingRemark;
	}

	/**
	 * Set eorbBookingRemark
	 */
	public void setEorbBookingRemark(String eorbBookingRemark) {
		this.eorbBookingRemark = eorbBookingRemark;
		addValidField("eorbBookingRemark");
	}

	/**
	 * Get eorbInnerRemark
	 */
	@Column(name = "EORB_INNER_REMARK")
	public String getEorbInnerRemark() {
		return eorbInnerRemark;
	}

	/**
	 * Set eorbInnerRemark
	 */
	public void setEorbInnerRemark(String eorbInnerRemark) {
		this.eorbInnerRemark = eorbInnerRemark;
		addValidField("eorbInnerRemark");
	}

	/**
	 * Get eorbSacCode
	 */
	@Column(name = "EORB_SAC_CODE")
	public String getEorbSacCode() {
		return eorbSacCode;
	}

	/**
	 * Set eorbSacCode
	 */
	public void setEorbSacCode(String eorbSacCode) {
		this.eorbSacCode = eorbSacCode;
		addValidField("eorbSacCode");
	}

	/**
	 * Get eorbInFactShipperId
	 */
	@Column(name = "EORB_IN_FACT_SHIPPER_ID")
	public Long getEorbInFactShipperId() {
		return eorbInFactShipperId;
	}

	/**
	 * Set eorbInFactShipperId
	 */
	public void setEorbInFactShipperId(Long eorbInFactShipperId) {
		this.eorbInFactShipperId = eorbInFactShipperId;
		addValidField("eorbInFactShipperId");
	}

	/**
	 * Get eorbInFactShipperCode
	 */
	@Column(name = "EORB_IN_FACT_SHIPPER_CODE")
	public String getEorbInFactShipperCode() {
		return eorbInFactShipperCode;
	}

	/**
	 * Set eorbInFactShipperCode
	 */
	public void setEorbInFactShipperCode(String eorbInFactShipperCode) {
		this.eorbInFactShipperCode = eorbInFactShipperCode;
		addValidField("eorbInFactShipperCode");
	}

	/**
	 * Get eorbInFactShipperName
	 */
	@Column(name = "EORB_IN_FACT_SHIPPER_NAME")
	public String getEorbInFactShipperName() {
		return eorbInFactShipperName;
	}

	/**
	 * Set eorbInFactShipperName
	 */
	public void setEorbInFactShipperName(String eorbInFactShipperName) {
		this.eorbInFactShipperName = eorbInFactShipperName;
		addValidField("eorbInFactShipperName");
	}

	/**
	 * Get eorbInFactShipperDetail
	 */
	@Column(name = "EORB_IN_FACT_SHIPPER_DETAIL")
	public String getEorbInFactShipperDetail() {
		return eorbInFactShipperDetail;
	}

	/**
	 * Set eorbInFactShipperDetail
	 */
	public void setEorbInFactShipperDetail(String eorbInFactShipperDetail) {
		this.eorbInFactShipperDetail = eorbInFactShipperDetail;
		addValidField("eorbInFactShipperDetail");
	}

	/**
	 * Get eorbInFactConsigneeId
	 */
	@Column(name = "EORB_IN_FACT_CONSIGNEE_ID")
	public Long getEorbInFactConsigneeId() {
		return eorbInFactConsigneeId;
	}

	/**
	 * Set eorbInFactConsigneeId
	 */
	public void setEorbInFactConsigneeId(Long eorbInFactConsigneeId) {
		this.eorbInFactConsigneeId = eorbInFactConsigneeId;
		addValidField("eorbInFactConsigneeId");
	}

	/**
	 * Get eorbInFactConsigneeCode
	 */
	@Column(name = "EORB_IN_FACT_CONSIGNEE_CODE")
	public String getEorbInFactConsigneeCode() {
		return eorbInFactConsigneeCode;
	}

	/**
	 * Set eorbInFactConsigneeCode
	 */
	public void setEorbInFactConsigneeCode(String eorbInFactConsigneeCode) {
		this.eorbInFactConsigneeCode = eorbInFactConsigneeCode;
		addValidField("eorbInFactConsigneeCode");
	}

	/**
	 * Get eorbInFactConsigneeName
	 */
	@Column(name = "EORB_IN_FACT_CONSIGNEE_NAME")
	public String getEorbInFactConsigneeName() {
		return eorbInFactConsigneeName;
	}

	/**
	 * Set eorbInFactConsigneeName
	 */
	public void setEorbInFactConsigneeName(String eorbInFactConsigneeName) {
		this.eorbInFactConsigneeName = eorbInFactConsigneeName;
		addValidField("eorbInFactConsigneeName");
	}

	/**
	 * Get eorbInFactConsigneeDetail
	 */
	@Column(name = "EORB_IN_FACT_CONSIGNEE_DETAIL")
	public String getEorbInFactConsigneeDetail() {
		return eorbInFactConsigneeDetail;
	}

	/**
	 * Set eorbInFactConsigneeDetail
	 */
	public void setEorbInFactConsigneeDetail(String eorbInFactConsigneeDetail) {
		this.eorbInFactConsigneeDetail = eorbInFactConsigneeDetail;
		addValidField("eorbInFactConsigneeDetail");
	}

	/**
	 * Get eorbInFactNotifierId
	 */
	@Column(name = "EORB_IN_FACT_NOTIFIER_ID")
	public Long getEorbInFactNotifierId() {
		return eorbInFactNotifierId;
	}

	/**
	 * Set eorbInFactNotifierId
	 */
	public void setEorbInFactNotifierId(Long eorbInFactNotifierId) {
		this.eorbInFactNotifierId = eorbInFactNotifierId;
		addValidField("eorbInFactNotifierId");
	}

	/**
	 * Get eorbInFactNotifierCode
	 */
	@Column(name = "EORB_IN_FACT_NOTIFIER_CODE")
	public String getEorbInFactNotifierCode() {
		return eorbInFactNotifierCode;
	}

	/**
	 * Set eorbInFactNotifierCode
	 */
	public void setEorbInFactNotifierCode(String eorbInFactNotifierCode) {
		this.eorbInFactNotifierCode = eorbInFactNotifierCode;
		addValidField("eorbInFactNotifierCode");
	}

	/**
	 * Get eorbInFactNotifierName
	 */
	@Column(name = "EORB_IN_FACT_NOTIFIER_NAME")
	public String getEorbInFactNotifierName() {
		return eorbInFactNotifierName;
	}

	/**
	 * Set eorbInFactNotifierName
	 */
	public void setEorbInFactNotifierName(String eorbInFactNotifierName) {
		this.eorbInFactNotifierName = eorbInFactNotifierName;
		addValidField("eorbInFactNotifierName");
	}

	/**
	 * Get eorbInFactNotifierDetail
	 */
	@Column(name = "EORB_IN_FACT_NOTIFIER_DETAIL")
	public String getEorbInFactNotifierDetail() {
		return eorbInFactNotifierDetail;
	}

	/**
	 * Set eorbInFactNotifierDetail
	 */
	public void setEorbInFactNotifierDetail(String eorbInFactNotifierDetail) {
		this.eorbInFactNotifierDetail = eorbInFactNotifierDetail;
		addValidField("eorbInFactNotifierDetail");
	}

	/**
	 * Get eorbIsDutyfree
	 */
	@Column(name = "EORB_IS_DUTYFREE")
	public Long getEorbIsDutyfree() {
		return eorbIsDutyfree;
	}

	/**
	 * Set eorbIsDutyfree
	 */
	public void setEorbIsDutyfree(Long eorbIsDutyfree) {
		this.eorbIsDutyfree = eorbIsDutyfree;
		addValidField("eorbIsDutyfree");
	}

	/**
	 * Get eorbSubstr1
	 */
	@Column(name = "EORB_SUBSTR1")
	public String getEorbSubstr1() {
		return eorbSubstr1;
	}

	/**
	 * Set eorbSubstr1
	 */
	public void setEorbSubstr1(String eorbSubstr1) {
		this.eorbSubstr1 = eorbSubstr1;
		addValidField("eorbSubstr1");
	}

	/**
	 * Get eorbSubstr2
	 */
	@Column(name = "EORB_SUBSTR2")
	public String getEorbSubstr2() {
		return eorbSubstr2;
	}

	/**
	 * Set eorbSubstr2
	 */
	public void setEorbSubstr2(String eorbSubstr2) {
		this.eorbSubstr2 = eorbSubstr2;
		addValidField("eorbSubstr2");
	}

	/**
	 * Get eorbSubstr3
	 */
	@Column(name = "EORB_SUBSTR3")
	public String getEorbSubstr3() {
		return eorbSubstr3;
	}

	/**
	 * Set eorbSubstr3
	 */
	public void setEorbSubstr3(String eorbSubstr3) {
		this.eorbSubstr3 = eorbSubstr3;
		addValidField("eorbSubstr3");
	}

	/**
	 * Get eorbSubstr4
	 */
	@Column(name = "EORB_SUBSTR4")
	public String getEorbSubstr4() {
		return eorbSubstr4;
	}

	/**
	 * Set eorbSubstr4
	 */
	public void setEorbSubstr4(String eorbSubstr4) {
		this.eorbSubstr4 = eorbSubstr4;
		addValidField("eorbSubstr4");
	}

	/**
	 * Get eorbSubstr5
	 */
	@Column(name = "EORB_SUBSTR5")
	public String getEorbSubstr5() {
		return eorbSubstr5;
	}

	/**
	 * Set eorbSubstr5
	 */
	public void setEorbSubstr5(String eorbSubstr5) {
		this.eorbSubstr5 = eorbSubstr5;
		addValidField("eorbSubstr5");
	}

	/**
	 * Get eorbSubstr6
	 */
	@Column(name = "EORB_SUBSTR6")
	public String getEorbSubstr6() {
		return eorbSubstr6;
	}

	/**
	 * Set eorbSubstr6
	 */
	public void setEorbSubstr6(String eorbSubstr6) {
		this.eorbSubstr6 = eorbSubstr6;
		addValidField("eorbSubstr6");
	}

	/**
	 * Get eorbSubstr7
	 */
	@Column(name = "EORB_SUBSTR7")
	public String getEorbSubstr7() {
		return eorbSubstr7;
	}

	/**
	 * Set eorbSubstr7
	 */
	public void setEorbSubstr7(String eorbSubstr7) {
		this.eorbSubstr7 = eorbSubstr7;
		addValidField("eorbSubstr7");
	}

	/**
	 * Get eorbSubstr8
	 */
	@Column(name = "EORB_SUBSTR8")
	public String getEorbSubstr8() {
		return eorbSubstr8;
	}

	/**
	 * Set eorbSubstr8
	 */
	public void setEorbSubstr8(String eorbSubstr8) {
		this.eorbSubstr8 = eorbSubstr8;
		addValidField("eorbSubstr8");
	}

	/**
	 * Get eorbSubstr9
	 */
	@Column(name = "EORB_SUBSTR9")
	public String getEorbSubstr9() {
		return eorbSubstr9;
	}

	/**
	 * Set eorbSubstr9
	 */
	public void setEorbSubstr9(String eorbSubstr9) {
		this.eorbSubstr9 = eorbSubstr9;
		addValidField("eorbSubstr9");
	}

	/**
	 * Get eorbSubstr10
	 */
	@Column(name = "EORB_SUBSTR10")
	public String getEorbSubstr10() {
		return eorbSubstr10;
	}

	/**
	 * Set eorbSubstr10
	 */
	public void setEorbSubstr10(String eorbSubstr10) {
		this.eorbSubstr10 = eorbSubstr10;
		addValidField("eorbSubstr10");
	}

	/**
	 * Get eorbSubstr11
	 */
	@Column(name = "EORB_SUBSTR11")
	public String getEorbSubstr11() {
		return eorbSubstr11;
	}

	/**
	 * Set eorbSubstr11
	 */
	public void setEorbSubstr11(String eorbSubstr11) {
		this.eorbSubstr11 = eorbSubstr11;
		addValidField("eorbSubstr11");
	}

	/**
	 * Get eorbSubstr12
	 */
	@Column(name = "EORB_SUBSTR12")
	public String getEorbSubstr12() {
		return eorbSubstr12;
	}

	/**
	 * Set eorbSubstr12
	 */
	public void setEorbSubstr12(String eorbSubstr12) {
		this.eorbSubstr12 = eorbSubstr12;
		addValidField("eorbSubstr12");
	}

	/**
	 * Get eorbSubstr13
	 */
	@Column(name = "EORB_SUBSTR13")
	public String getEorbSubstr13() {
		return eorbSubstr13;
	}

	/**
	 * Set eorbSubstr13
	 */
	public void setEorbSubstr13(String eorbSubstr13) {
		this.eorbSubstr13 = eorbSubstr13;
		addValidField("eorbSubstr13");
	}

	/**
	 * Get eorbSubstr14
	 */
	@Column(name = "EORB_SUBSTR14")
	public String getEorbSubstr14() {
		return eorbSubstr14;
	}

	/**
	 * Set eorbSubstr14
	 */
	public void setEorbSubstr14(String eorbSubstr14) {
		this.eorbSubstr14 = eorbSubstr14;
		addValidField("eorbSubstr14");
	}

	/**
	 * Get eorbSubstr15
	 */
	@Column(name = "EORB_SUBSTR15")
	public String getEorbSubstr15() {
		return eorbSubstr15;
	}

	/**
	 * Set eorbSubstr15
	 */
	public void setEorbSubstr15(String eorbSubstr15) {
		this.eorbSubstr15 = eorbSubstr15;
		addValidField("eorbSubstr15");
	}

	/**
	 * Get eorbSubstr16
	 */
	@Column(name = "EORB_SUBSTR16")
	public String getEorbSubstr16() {
		return eorbSubstr16;
	}

	/**
	 * Set eorbSubstr16
	 */
	public void setEorbSubstr16(String eorbSubstr16) {
		this.eorbSubstr16 = eorbSubstr16;
		addValidField("eorbSubstr16");
	}

	/**
	 * Get eorbSubstr17
	 */
	@Column(name = "EORB_SUBSTR17")
	public String getEorbSubstr17() {
		return eorbSubstr17;
	}

	/**
	 * Set eorbSubstr17
	 */
	public void setEorbSubstr17(String eorbSubstr17) {
		this.eorbSubstr17 = eorbSubstr17;
		addValidField("eorbSubstr17");
	}

	/**
	 * Get eorbSubstr18
	 */
	@Column(name = "EORB_SUBSTR18")
	public String getEorbSubstr18() {
		return eorbSubstr18;
	}

	/**
	 * Set eorbSubstr18
	 */
	public void setEorbSubstr18(String eorbSubstr18) {
		this.eorbSubstr18 = eorbSubstr18;
		addValidField("eorbSubstr18");
	}

	/**
	 * Get eorbSubstr19
	 */
	@Column(name = "EORB_SUBSTR19")
	public String getEorbSubstr19() {
		return eorbSubstr19;
	}

	/**
	 * Set eorbSubstr19
	 */
	public void setEorbSubstr19(String eorbSubstr19) {
		this.eorbSubstr19 = eorbSubstr19;
		addValidField("eorbSubstr19");
	}

	/**
	 * Get eorbSubstr20
	 */
	@Column(name = "EORB_SUBSTR20")
	public String getEorbSubstr20() {
		return eorbSubstr20;
	}

	/**
	 * Set eorbSubstr20
	 */
	public void setEorbSubstr20(String eorbSubstr20) {
		this.eorbSubstr20 = eorbSubstr20;
		addValidField("eorbSubstr20");
	}

	/**
	 * Get eorbSubstr21
	 */
	@Column(name = "EORB_SUBSTR21")
	public String getEorbSubstr21() {
		return eorbSubstr21;
	}

	/**
	 * Set eorbSubstr21
	 */
	public void setEorbSubstr21(String eorbSubstr21) {
		this.eorbSubstr21 = eorbSubstr21;
		addValidField("eorbSubstr21");
	}

	/**
	 * Get eorbSubstr22
	 */
	@Column(name = "EORB_SUBSTR22")
	public String getEorbSubstr22() {
		return eorbSubstr22;
	}

	/**
	 * Set eorbSubstr22
	 */
	public void setEorbSubstr22(String eorbSubstr22) {
		this.eorbSubstr22 = eorbSubstr22;
		addValidField("eorbSubstr22");
	}

	/**
	 * Get eorbSubstr23
	 */
	@Column(name = "EORB_SUBSTR23")
	public String getEorbSubstr23() {
		return eorbSubstr23;
	}

	/**
	 * Set eorbSubstr23
	 */
	public void setEorbSubstr23(String eorbSubstr23) {
		this.eorbSubstr23 = eorbSubstr23;
		addValidField("eorbSubstr23");
	}

	/**
	 * Get eorbSubstr24
	 */
	@Column(name = "EORB_SUBSTR24")
	public String getEorbSubstr24() {
		return eorbSubstr24;
	}

	/**
	 * Set eorbSubstr24
	 */
	public void setEorbSubstr24(String eorbSubstr24) {
		this.eorbSubstr24 = eorbSubstr24;
		addValidField("eorbSubstr24");
	}

	/**
	 * Get eorbSubstr25
	 */
	@Column(name = "EORB_SUBSTR25")
	public String getEorbSubstr25() {
		return eorbSubstr25;
	}

	/**
	 * Set eorbSubstr25
	 */
	public void setEorbSubstr25(String eorbSubstr25) {
		this.eorbSubstr25 = eorbSubstr25;
		addValidField("eorbSubstr25");
	}

	/**
	 * Get eorbSubdate1
	 */
	@Column(name = "EORB_SUBDATE1")
	public Date getEorbSubdate1() {
		return eorbSubdate1;
	}

	/**
	 * Set eorbSubdate1
	 */
	public void setEorbSubdate1(Date eorbSubdate1) {
		this.eorbSubdate1 = eorbSubdate1;
		addValidField("eorbSubdate1");
	}

	/**
	 * Get eorbSubdate2
	 */
	@Column(name = "EORB_SUBDATE2")
	public Date getEorbSubdate2() {
		return eorbSubdate2;
	}

	/**
	 * Set eorbSubdate2
	 */
	public void setEorbSubdate2(Date eorbSubdate2) {
		this.eorbSubdate2 = eorbSubdate2;
		addValidField("eorbSubdate2");
	}

	/**
	 * Get eorbSubdate3
	 */
	@Column(name = "EORB_SUBDATE3")
	public Date getEorbSubdate3() {
		return eorbSubdate3;
	}

	/**
	 * Set eorbSubdate3
	 */
	public void setEorbSubdate3(Date eorbSubdate3) {
		this.eorbSubdate3 = eorbSubdate3;
		addValidField("eorbSubdate3");
	}

	/**
	 * Get eorbSubdate4
	 */
	@Column(name = "EORB_SUBDATE4")
	public Date getEorbSubdate4() {
		return eorbSubdate4;
	}

	/**
	 * Set eorbSubdate4
	 */
	public void setEorbSubdate4(Date eorbSubdate4) {
		this.eorbSubdate4 = eorbSubdate4;
		addValidField("eorbSubdate4");
	}

	/**
	 * Get eorbSubdate5
	 */
	@Column(name = "EORB_SUBDATE5")
	public Date getEorbSubdate5() {
		return eorbSubdate5;
	}

	/**
	 * Set eorbSubdate5
	 */
	public void setEorbSubdate5(Date eorbSubdate5) {
		this.eorbSubdate5 = eorbSubdate5;
		addValidField("eorbSubdate5");
	}

	/**
	 * Get eorbSubdate6
	 */
	@Column(name = "EORB_SUBDATE6")
	public Date getEorbSubdate6() {
		return eorbSubdate6;
	}

	/**
	 * Set eorbSubdate6
	 */
	public void setEorbSubdate6(Date eorbSubdate6) {
		this.eorbSubdate6 = eorbSubdate6;
		addValidField("eorbSubdate6");
	}

	/**
	 * Get eorbSubnum1
	 */
	@Column(name = "EORB_SUBNUM1")
	public Long getEorbSubnum1() {
		return eorbSubnum1;
	}

	/**
	 * Set eorbSubnum1
	 */
	public void setEorbSubnum1(Long eorbSubnum1) {
		this.eorbSubnum1 = eorbSubnum1;
		addValidField("eorbSubnum1");
	}

	/**
	 * Get eorbSubnum2
	 */
	@Column(name = "EORB_SUBNUM2")
	public Long getEorbSubnum2() {
		return eorbSubnum2;
	}

	/**
	 * Set eorbSubnum2
	 */
	public void setEorbSubnum2(Long eorbSubnum2) {
		this.eorbSubnum2 = eorbSubnum2;
		addValidField("eorbSubnum2");
	}

	/**
	 * Get eorbSubnum3
	 */
	@Column(name = "EORB_SUBNUM3")
	public Long getEorbSubnum3() {
		return eorbSubnum3;
	}

	/**
	 * Set eorbSubnum3
	 */
	public void setEorbSubnum3(Long eorbSubnum3) {
		this.eorbSubnum3 = eorbSubnum3;
		addValidField("eorbSubnum3");
	}

	/**
	 * Get eorbSubnum4
	 */
	@Column(name = "EORB_SUBNUM4")
	public Long getEorbSubnum4() {
		return eorbSubnum4;
	}

	/**
	 * Set eorbSubnum4
	 */
	public void setEorbSubnum4(Long eorbSubnum4) {
		this.eorbSubnum4 = eorbSubnum4;
		addValidField("eorbSubnum4");
	}

	/**
	 * Get eorbSubnum5
	 */
	@Column(name = "EORB_SUBNUM5")
	public Long getEorbSubnum5() {
		return eorbSubnum5;
	}

	/**
	 * Set eorbSubnum5
	 */
	public void setEorbSubnum5(Long eorbSubnum5) {
		this.eorbSubnum5 = eorbSubnum5;
		addValidField("eorbSubnum5");
	}

	/**
	 * Get eorbSubnum6
	 */
	@Column(name = "EORB_SUBNUM6")
	public Long getEorbSubnum6() {
		return eorbSubnum6;
	}

	/**
	 * Set eorbSubnum6
	 */
	public void setEorbSubnum6(Long eorbSubnum6) {
		this.eorbSubnum6 = eorbSubnum6;
		addValidField("eorbSubnum6");
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
	 * Get eorbAgentId
	 */
	@Column(name = "EORB_AGENT_ID")
	public Long getEorbAgentId() {
		return eorbAgentId;
	}

	/**
	 * Set eorbAgentId
	 */
	public void setEorbAgentId(Long eorbAgentId) {
		this.eorbAgentId = eorbAgentId;
		addValidField("eorbAgentId");
	}

	/**
	 * Get eorbAgentCode
	 */
	@Column(name = "EORB_AGENT_CODE")
	public String getEorbAgentCode() {
		return eorbAgentCode;
	}

	/**
	 * Set eorbAgentCode
	 */
	public void setEorbAgentCode(String eorbAgentCode) {
		this.eorbAgentCode = eorbAgentCode;
		addValidField("eorbAgentCode");
	}

	/**
	 * Get eorbAgentName
	 */
	@Column(name = "EORB_AGENT_NAME")
	public String getEorbAgentName() {
		return eorbAgentName;
	}

	/**
	 * Set eorbAgentName
	 */
	public void setEorbAgentName(String eorbAgentName) {
		this.eorbAgentName = eorbAgentName;
		addValidField("eorbAgentName");
	}

	/**
	 * Get eorbGateCloseTime
	 */
	@Column(name = "EORB_GATE_CLOSE_TIME")
	public Date getEorbGateCloseTime() {
		return eorbGateCloseTime;
	}

	/**
	 * Set eorbGateCloseTime
	 */
	public void setEorbGateCloseTime(Date eorbGateCloseTime) {
		this.eorbGateCloseTime = eorbGateCloseTime;
		addValidField("eorbGateCloseTime");
	}

	/**
	 * Get eorbEsiDeadline
	 */
	@Column(name = "EORB_ESI_DEADLINE")
	public Date getEorbEsiDeadline() {
		return eorbEsiDeadline;
	}

	/**
	 * Set eorbEsiDeadline
	 */
	public void setEorbEsiDeadline(Date eorbEsiDeadline) {
		this.eorbEsiDeadline = eorbEsiDeadline;
		addValidField("eorbEsiDeadline");
	}

	/**
	 * Get eorbTaskConfirmUser
	 */
	@Column(name = "EORB_TASK_CONFIRM_USER")
	public String getEorbTaskConfirmUser() {
		return eorbTaskConfirmUser;
	}

	/**
	 * Set eorbTaskConfirmUser
	 */
	public void setEorbTaskConfirmUser(String eorbTaskConfirmUser) {
		this.eorbTaskConfirmUser = eorbTaskConfirmUser;
		addValidField("eorbTaskConfirmUser");
	}

	/**
	 * Get eorbTaskConfirmDate
	 */
	@Column(name = "EORB_TASK_CONFIRM_DATE")
	public Date getEorbTaskConfirmDate() {
		return eorbTaskConfirmDate;
	}

	/**
	 * Set eorbTaskConfirmDate
	 */
	public void setEorbTaskConfirmDate(Date eorbTaskConfirmDate) {
		this.eorbTaskConfirmDate = eorbTaskConfirmDate;
		addValidField("eorbTaskConfirmDate");
	}

	/**
	 * Get eorbBlStatus
	 */
	@Column(name = "EORB_BL_STATUS")
	public String getEorbBlStatus() {
		return eorbBlStatus;
	}

	/**
	 * Set eorbBlStatus
	 */
	public void setEorbBlStatus(String eorbBlStatus) {
		this.eorbBlStatus = eorbBlStatus;
		addValidField("eorbBlStatus");
	}

	/**
	 * Get eorbDepotContact
	 */
	@Column(name = "EORB_DEPOT_CONTACT")
	public String getEorbDepotContact() {
		return eorbDepotContact;
	}

	/**
	 * Set eorbDepotContact
	 */
	public void setEorbDepotContact(String eorbDepotContact) {
		this.eorbDepotContact = eorbDepotContact;
		addValidField("eorbDepotContact");
	}

	/**
	 * Get eorbDepotTel
	 */
	@Column(name = "EORB_DEPOT_TEL")
	public String getEorbDepotTel() {
		return eorbDepotTel;
	}

	/**
	 * Set eorbDepotTel
	 */
	public void setEorbDepotTel(String eorbDepotTel) {
		this.eorbDepotTel = eorbDepotTel;
		addValidField("eorbDepotTel");
	}

	/**
	 * Get eorbBlFreightClauseName
	 */
	@Column(name = "EORB_BL_FREIGHT_CLAUSE_NAME")
	public String getEorbBlFreightClauseName() {
		return eorbBlFreightClauseName;
	}

	/**
	 * Set eorbBlFreightClauseName
	 */
	public void setEorbBlFreightClauseName(String eorbBlFreightClauseName) {
		this.eorbBlFreightClauseName = eorbBlFreightClauseName;
		addValidField("eorbBlFreightClauseName");
	}
	
	/**
	 * Get eorbEbrtId
	 */
	@Column(name = "EORB_EBRT_ID")
	public Long getEorbEbrtId() {
		return eorbEbrtId;
	}

	/**
	 * Set eorbEbrtId
	 */
	public void setEorbEbrtId(Long eorbEbrtId) {
		this.eorbEbrtId = eorbEbrtId;
		addValidField("eorbEbrtId");
	}

	/**
	 * Get eorbEbrtName
	 */
	@Column(name = "EORB_EBRT_NAME")
	public String getEorbEbrtName() {
		return eorbEbrtName;
	}

	/**
	 * Set eorbEbrtName
	 */
	public void setEorbEbrtName(String eorbEbrtName) {
		this.eorbEbrtName = eorbEbrtName;
		addValidField("eorbEbrtName");
	}

	/**
	 * Get eorbEbrtCode
	 */
	@Column(name = "EORB_EBRT_CODE")
	public String getEorbEbrtCode() {
		return eorbEbrtCode;
	}

	/**
	 * Set eorbEbrtCode
	 */
	public void setEorbEbrtCode(String eorbEbrtCode) {
		this.eorbEbrtCode = eorbEbrtCode;
		addValidField("eorbEbrtCode");
	}

	/**
	 * Get eorbSailingDate
	 */
	@Column(name = "EORB_SAILING_DATE")
	public Date getEorbSailingDate() {
		return eorbSailingDate;
	}

	/**
	 * Set eorbSailingDate
	 */
	public void setEorbSailingDate(Date eorbSailingDate) {
		this.eorbSailingDate = eorbSailingDate;
		addValidField("eorbSailingDate");
	}

	/**
	 * Get eorbAta
	 */
	@Column(name = "EORB_ATA")
	public Date getEorbAta() {
		return eorbAta;
	}

	/**
	 * Set eorbAta
	 */
	public void setEorbAta(Date eorbAta) {
		this.eorbAta = eorbAta;
		addValidField("eorbAta");
	}

	/**
	 * Get eorbReceivedBlDate
	 */
	@Column(name = "EORB_RECEIVED_BL_DATE")
	public Date getEorbReceivedBlDate() {
		return eorbReceivedBlDate;
	}

	/**
	 * Set eorbReceivedBlDate
	 */
	public void setEorbReceivedBlDate(Date eorbReceivedBlDate) {
		this.eorbReceivedBlDate = eorbReceivedBlDate;
		addValidField("eorbReceivedBlDate");
	}
	
	/**
	 * Get eorbAgreementTyep
	 */
	@Column(name = "EORB_AGREEMENT_TYEP")
	public String getEorbAgreementTyep() {
		return eorbAgreementTyep;
	}
	
	/**
	 * Set eorbAgreementTyep
	 */
	public void setEorbAgreementTyep(String eorbAgreementTyep) {
		this.eorbAgreementTyep = eorbAgreementTyep;
		addValidField("eorbAgreementTyep");
	}

	
}
