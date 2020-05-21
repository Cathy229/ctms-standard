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
 * Model class for EoRequestAirborne
 */
@Entity
@Table(name = "EO_REQUEST_AIRBORNE")
public class EoRequestAirborneModel extends BaseModel implements OperationLog {

	//eoaiId
	private Long eoaiId;
	//eoaiEscoId
	private Long eoaiEscoId;
	//eoaiEbpjId
	private Long eoaiEbpjId;
	//eoaiLoEbppId
	private Long eoaiLoEbppId;
	//eoaiEbtkId
	private Long eoaiEbtkId;
	//eoaiIsAutomatic
	private String eoaiIsAutomatic;
	//eoaiTaskStatus
	private String eoaiTaskStatus;
	//eoaiTaskFeedback
	private String eoaiTaskFeedback;
	//eoaiSysCode
	private String eoaiSysCode;
	//eoaiEbbuId
	private Long eoaiEbbuId;
	//eoaiEbbuNameCn
	private String eoaiEbbuNameCn;
	//eoaiEbbuCode
	private String eoaiEbbuCode;
	//eoaiEbbuDist1
	private String eoaiEbbuDist1;
	//eoaiEbbuDist2
	private String eoaiEbbuDist2;
	//eoaiEbbuDist3
	private String eoaiEbbuDist3;
	//eoaiEbbuDist4
	private String eoaiEbbuDist4;
	//eoaiEbbuDist5
	private String eoaiEbbuDist5;
	//eoaiToId
	private String eoaiToId;
	//eoaiEoorId
	private Long eoaiEoorId;
	//eoaiNo
	private String eoaiNo;
	//eoaiType
	private String eoaiType;
	//eoaiStatus
	private String eoaiStatus;
	//eoaiOrder
	private Long eoaiOrder;
	//eoaiSoNo
	private String eoaiSoNo;
	//eoaiDoNo
	private String eoaiDoNo;
	//eoaiIeFlag
	private String eoaiIeFlag;
	//eoaiConsignorEbcuId
	private Long eoaiConsignorEbcuId;
	//eoaiConsignorEbcuCode
	private String eoaiConsignorEbcuCode;
	//eoaiConsignorEbcuName
	private String eoaiConsignorEbcuName;
	//eoaiOwnerEbcuId
	private Long eoaiOwnerEbcuId;
	//eoaiOwnerEbcuCode
	private String eoaiOwnerEbcuCode;
	//eoaiOwnerEbcuName
	private String eoaiOwnerEbcuName;
	//eoaiBatchNo
	private String eoaiBatchNo;
	//eoaiShipperConsignNo
	private String eoaiShipperConsignNo;
	//eoaiMabwNo
	private String eoaiMabwNo;
	//eoaiHabwNo
	private String eoaiHabwNo;
	//eoaiTradeTerms
	private String eoaiTradeTerms;
	//eoaiCarrierBookingNo
	private String eoaiCarrierBookingNo;
	//eoaiBookingAgentId
	private Long eoaiBookingAgentId;
	//eoaiBookingAgentCode
	private String eoaiBookingAgentCode;
	//eoaiBookingAgentName
	private String eoaiBookingAgentName;
	//eoaiBookingRequestDate
	private Date eoaiBookingRequestDate;
	//eoaiBookingCompletedDate
	private Date eoaiBookingCompletedDate;
	//eoaiAirlinesId
	private Long eoaiAirlinesId;
	//eoaiAirlinesCode
	private String eoaiAirlinesCode;
	//eoaiAirlinesName
	private String eoaiAirlinesName;
	//eoaiFlightNo
	private String eoaiFlightNo;
	//eoaiEtd
	private Date eoaiEtd;
	//eoaiAtd
	private Date eoaiAtd;
	//eoaiDepartureStationId
	private Long eoaiDepartureStationId;
	//eoaiDepartureStationCode
	private String eoaiDepartureStationCode;
	//eoaiDepartureStation
	private String eoaiDepartureStation;
	//eoaiTransferStationId
	private Long eoaiTransferStationId;
	//eoaiTransferStationCode
	private String eoaiTransferStationCode;
	//eoaiTransferStation
	private String eoaiTransferStation;
	//eoaiDestinationId
	private Long eoaiDestinationId;
	//eoaiDestinationCode
	private String eoaiDestinationCode;
	//eoaiDestination
	private String eoaiDestination;
	//eoaiEta
	private Date eoaiEta;
	//eoaiAta
	private Date eoaiAta;
	//eoaiShipperEbspId
	private Long eoaiShipperEbspId;
	//eoaiShipperEbspNameCn
	private String eoaiShipperEbspNameCn;
	//eoaiShipperEbspCode
	private String eoaiShipperEbspCode;
	//eoaiShipperDetail
	private String eoaiShipperDetail;
	//eoaiShipperEbsaTel
	private String eoaiShipperEbsaTel;
	//eoaiShipperEbsaId
	private Long eoaiShipperEbsaId;
	//eoaiShipperEbsaAddress
	private String eoaiShipperEbsaAddress;
	//eoaiConsigneeEbspId
	private Long eoaiConsigneeEbspId;
	//eoaiConsigneeEbspNameCn
	private String eoaiConsigneeEbspNameCn;
	//eoaiConsigneeEbspCode
	private String eoaiConsigneeEbspCode;
	//eoaiConsigneeDetail
	private String eoaiConsigneeDetail;
	//eoaiConsigneeEbsaTel
	private String eoaiConsigneeEbsaTel;
	//eoaiConsigneeEbsaId
	private Long eoaiConsigneeEbsaId;
	//eoaiConsigneeEbsaAddress
	private String eoaiConsigneeEbsaAddress;
	//eoaiNotifyId
	private Long eoaiNotifyId;
	//eoaiNotifyCode
	private String eoaiNotifyCode;
	//eoaiNotify
	private String eoaiNotify;
	//eoaiNotifierDetail
	private String eoaiNotifierDetail;
	//eoaiReqStationDate
	private Date eoaiReqStationDate;
	//eoaiAirfreightStation
	private String eoaiAirfreightStation;
	//eoaiDelayReason
	private String eoaiDelayReason;
	//eoaiReceivedBlDate
	private Date eoaiReceivedBlDate;
	//eoaiExternalOrderNo
	private String eoaiExternalOrderNo;
	//eoaiQuantity
	private Long eoaiQuantity;
	//eoaiGrossWeight
	private Long eoaiGrossWeight;
	//eoaiNetWeight
	private Long eoaiNetWeight;
	//eoaiVolume
	private Long eoaiVolume;
	//eoaiVolumeWeight
	private Long eoaiVolumeWeight;
	//eoaiChargedWeight
	private Long eoaiChargedWeight;
	//eoaiRemark
	private String eoaiRemark;
	//eoaiSubstr1
	private String eoaiSubstr1;
	//eoaiSubstr2
	private String eoaiSubstr2;
	//eoaiSubstr3
	private String eoaiSubstr3;
	//eoaiSubstr4
	private String eoaiSubstr4;
	//eoaiSubstr5
	private String eoaiSubstr5;
	//eoaiSubstr6
	private String eoaiSubstr6;
	//eoaiSubstr7
	private String eoaiSubstr7;
	//eoaiSubstr8
	private String eoaiSubstr8;
	//eoaiSubstr9
	private String eoaiSubstr9;
	//eoaiSubstr10
	private String eoaiSubstr10;
	//eoaiSubstr11
	private String eoaiSubstr11;
	//eoaiSubstr12
	private String eoaiSubstr12;
	//eoaiSubstr13
	private String eoaiSubstr13;
	//eoaiSubstr14
	private String eoaiSubstr14;
	//eoaiSubstr15
	private String eoaiSubstr15;
	//eoaiSubstr16
	private String eoaiSubstr16;
	//eoaiSubstr17
	private String eoaiSubstr17;
	//eoaiSubstr18
	private String eoaiSubstr18;
	//eoaiSubstr19
	private String eoaiSubstr19;
	//eoaiSubstr20
	private String eoaiSubstr20;
	//eoaiSubstr21
	private String eoaiSubstr21;
	//eoaiSubstr22
	private String eoaiSubstr22;
	//eoaiSubstr23
	private String eoaiSubstr23;
	//eoaiSubstr24
	private String eoaiSubstr24;
	//eoaiSubstr25
	private String eoaiSubstr25;
	//eoaiSubdate1
	private Date eoaiSubdate1;
	//eoaiSubdate2
	private Date eoaiSubdate2;
	//eoaiSubdate3
	private Date eoaiSubdate3;
	//eoaiSubdate4
	private Date eoaiSubdate4;
	//eoaiSubdate5
	private Date eoaiSubdate5;
	//eoaiSubdate6
	private Date eoaiSubdate6;
	//eoaiSubdate7
	private Date eoaiSubdate7;
	//eoaiSubdate8
	private Date eoaiSubdate8;
	//eoaiSubdate9
	private Date eoaiSubdate9;
	//eoaiSubdate10
	private Date eoaiSubdate10;
	//eoaiSubnum1
	private Long eoaiSubnum1;
	//eoaiSubnum2
	private Long eoaiSubnum2;
	//eoaiSubnum3
	private Long eoaiSubnum3;
	//eoaiSubnum4
	private Long eoaiSubnum4;
	//eoaiSubnum5
	private Long eoaiSubnum5;
	//eoaiSubnum6
	private Long eoaiSubnum6;
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
	//eoaiDeclarationTime
	private Date eoaiDeclarationTime;
	//eoaiReplaceTime
	private Date eoaiReplaceTime;
	//eoaiIsDutyfree
	private Long eoaiIsDutyfree;
	//eoaiPayTime
	private Date eoaiPayTime;
	//eoaiIsCharteredAirplane
	private String eoaiIsCharteredAirplane;
	//eoaiIsImportCargo
	private String eoaiIsImportCargo;
	//eoaiIsSingleTransfer
	private String eoaiIsSingleTransfer;

	/**
	 * Get eoaiId
	 */
	@Column(name = "EOAI_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoaiId() {
		return eoaiId;
	}

	/**
	 * Set eoaiId
	 */
	public void setEoaiId(Long eoaiId) {
		this.eoaiId = eoaiId;
		addValidField("eoaiId");
	}

	/**
	 * Get eoaiEscoId
	 */
	@Column(name = "EOAI_ESCO_ID")
	public Long getEoaiEscoId() {
		return eoaiEscoId;
	}

	/**
	 * Set eoaiEscoId
	 */
	public void setEoaiEscoId(Long eoaiEscoId) {
		this.eoaiEscoId = eoaiEscoId;
		addValidField("eoaiEscoId");
	}

	/**
	 * Get eoaiEbpjId
	 */
	@Column(name = "EOAI_EBPJ_ID")
	public Long getEoaiEbpjId() {
		return eoaiEbpjId;
	}

	/**
	 * Set eoaiEbpjId
	 */
	public void setEoaiEbpjId(Long eoaiEbpjId) {
		this.eoaiEbpjId = eoaiEbpjId;
		addValidField("eoaiEbpjId");
	}

	/**
	 * Get eoaiLoEbppId
	 */
	@Column(name = "EOAI_LO_EBPP_ID")
	public Long getEoaiLoEbppId() {
		return eoaiLoEbppId;
	}

	/**
	 * Set eoaiLoEbppId
	 */
	public void setEoaiLoEbppId(Long eoaiLoEbppId) {
		this.eoaiLoEbppId = eoaiLoEbppId;
		addValidField("eoaiLoEbppId");
	}

	/**
	 * Get eoaiEbtkId
	 */
	@Column(name = "EOAI_EBTK_ID")
	public Long getEoaiEbtkId() {
		return eoaiEbtkId;
	}

	/**
	 * Set eoaiEbtkId
	 */
	public void setEoaiEbtkId(Long eoaiEbtkId) {
		this.eoaiEbtkId = eoaiEbtkId;
		addValidField("eoaiEbtkId");
	}

	/**
	 * Get eoaiIsAutomatic
	 */
	@Column(name = "EOAI_IS_AUTOMATIC")
	public String getEoaiIsAutomatic() {
		return eoaiIsAutomatic;
	}

	/**
	 * Set eoaiIsAutomatic
	 */
	public void setEoaiIsAutomatic(String eoaiIsAutomatic) {
		this.eoaiIsAutomatic = eoaiIsAutomatic;
		addValidField("eoaiIsAutomatic");
	}

	/**
	 * Get eoaiTaskStatus
	 */
	@Column(name = "EOAI_TASK_STATUS")
	public String getEoaiTaskStatus() {
		return eoaiTaskStatus;
	}

	/**
	 * Set eoaiTaskStatus
	 */
	public void setEoaiTaskStatus(String eoaiTaskStatus) {
		this.eoaiTaskStatus = eoaiTaskStatus;
		addValidField("eoaiTaskStatus");
	}

	/**
	 * Get eoaiTaskFeedback
	 */
	@Column(name = "EOAI_TASK_FEEDBACK")
	public String getEoaiTaskFeedback() {
		return eoaiTaskFeedback;
	}

	/**
	 * Set eoaiTaskFeedback
	 */
	public void setEoaiTaskFeedback(String eoaiTaskFeedback) {
		this.eoaiTaskFeedback = eoaiTaskFeedback;
		addValidField("eoaiTaskFeedback");
	}

	/**
	 * Get eoaiSysCode
	 */
	@Column(name = "EOAI_SYS_CODE")
	public String getEoaiSysCode() {
		return eoaiSysCode;
	}

	/**
	 * Set eoaiSysCode
	 */
	public void setEoaiSysCode(String eoaiSysCode) {
		this.eoaiSysCode = eoaiSysCode;
		addValidField("eoaiSysCode");
	}

	/**
	 * Get eoaiEbbuId
	 */
	@Column(name = "EOAI_EBBU_ID")
	public Long getEoaiEbbuId() {
		return eoaiEbbuId;
	}

	/**
	 * Set eoaiEbbuId
	 */
	public void setEoaiEbbuId(Long eoaiEbbuId) {
		this.eoaiEbbuId = eoaiEbbuId;
		addValidField("eoaiEbbuId");
	}

	/**
	 * Get eoaiEbbuNameCn
	 */
	@Column(name = "EOAI_EBBU_NAME_CN")
	public String getEoaiEbbuNameCn() {
		return eoaiEbbuNameCn;
	}

	/**
	 * Set eoaiEbbuNameCn
	 */
	public void setEoaiEbbuNameCn(String eoaiEbbuNameCn) {
		this.eoaiEbbuNameCn = eoaiEbbuNameCn;
		addValidField("eoaiEbbuNameCn");
	}

	/**
	 * Get eoaiEbbuCode
	 */
	@Column(name = "EOAI_EBBU_CODE")
	public String getEoaiEbbuCode() {
		return eoaiEbbuCode;
	}

	/**
	 * Set eoaiEbbuCode
	 */
	public void setEoaiEbbuCode(String eoaiEbbuCode) {
		this.eoaiEbbuCode = eoaiEbbuCode;
		addValidField("eoaiEbbuCode");
	}

	/**
	 * Get eoaiEbbuDist1
	 */
	@Column(name = "EOAI_EBBU_DIST_1")
	public String getEoaiEbbuDist1() {
		return eoaiEbbuDist1;
	}

	/**
	 * Set eoaiEbbuDist1
	 */
	public void setEoaiEbbuDist1(String eoaiEbbuDist1) {
		this.eoaiEbbuDist1 = eoaiEbbuDist1;
		addValidField("eoaiEbbuDist1");
	}

	/**
	 * Get eoaiEbbuDist2
	 */
	@Column(name = "EOAI_EBBU_DIST_2")
	public String getEoaiEbbuDist2() {
		return eoaiEbbuDist2;
	}

	/**
	 * Set eoaiEbbuDist2
	 */
	public void setEoaiEbbuDist2(String eoaiEbbuDist2) {
		this.eoaiEbbuDist2 = eoaiEbbuDist2;
		addValidField("eoaiEbbuDist2");
	}

	/**
	 * Get eoaiEbbuDist3
	 */
	@Column(name = "EOAI_EBBU_DIST_3")
	public String getEoaiEbbuDist3() {
		return eoaiEbbuDist3;
	}

	/**
	 * Set eoaiEbbuDist3
	 */
	public void setEoaiEbbuDist3(String eoaiEbbuDist3) {
		this.eoaiEbbuDist3 = eoaiEbbuDist3;
		addValidField("eoaiEbbuDist3");
	}

	/**
	 * Get eoaiEbbuDist4
	 */
	@Column(name = "EOAI_EBBU_DIST_4")
	public String getEoaiEbbuDist4() {
		return eoaiEbbuDist4;
	}

	/**
	 * Set eoaiEbbuDist4
	 */
	public void setEoaiEbbuDist4(String eoaiEbbuDist4) {
		this.eoaiEbbuDist4 = eoaiEbbuDist4;
		addValidField("eoaiEbbuDist4");
	}

	/**
	 * Get eoaiEbbuDist5
	 */
	@Column(name = "EOAI_EBBU_DIST_5")
	public String getEoaiEbbuDist5() {
		return eoaiEbbuDist5;
	}

	/**
	 * Set eoaiEbbuDist5
	 */
	public void setEoaiEbbuDist5(String eoaiEbbuDist5) {
		this.eoaiEbbuDist5 = eoaiEbbuDist5;
		addValidField("eoaiEbbuDist5");
	}

	/**
	 * Get eoaiToId
	 */
	@Column(name = "EOAI_TO_ID")
	public String getEoaiToId() {
		return eoaiToId;
	}

	/**
	 * Set eoaiToId
	 */
	public void setEoaiToId(String eoaiToId) {
		this.eoaiToId = eoaiToId;
		addValidField("eoaiToId");
	}

	/**
	 * Get eoaiEoorId
	 */
	@Column(name = "EOAI_EOOR_ID")
	public Long getEoaiEoorId() {
		return eoaiEoorId;
	}

	/**
	 * Set eoaiEoorId
	 */
	public void setEoaiEoorId(Long eoaiEoorId) {
		this.eoaiEoorId = eoaiEoorId;
		addValidField("eoaiEoorId");
	}

	/**
	 * Get eoaiNo
	 */
	@Column(name = "EOAI_NO")
	public String getEoaiNo() {
		return eoaiNo;
	}

	/**
	 * Set eoaiNo
	 */
	public void setEoaiNo(String eoaiNo) {
		this.eoaiNo = eoaiNo;
		addValidField("eoaiNo");
	}

	/**
	 * Get eoaiType
	 */
	@Column(name = "EOAI_TYPE")
	public String getEoaiType() {
		return eoaiType;
	}

	/**
	 * Set eoaiType
	 */
	public void setEoaiType(String eoaiType) {
		this.eoaiType = eoaiType;
		addValidField("eoaiType");
	}

	/**
	 * Get eoaiStatus
	 */
	@Column(name = "EOAI_STATUS")
	public String getEoaiStatus() {
		return eoaiStatus;
	}

	/**
	 * Set eoaiStatus
	 */
	public void setEoaiStatus(String eoaiStatus) {
		this.eoaiStatus = eoaiStatus;
		addValidField("eoaiStatus");
	}

	/**
	 * Get eoaiOrder
	 */
	@Column(name = "EOAI_ORDER")
	public Long getEoaiOrder() {
		return eoaiOrder;
	}

	/**
	 * Set eoaiOrder
	 */
	public void setEoaiOrder(Long eoaiOrder) {
		this.eoaiOrder = eoaiOrder;
		addValidField("eoaiOrder");
	}

	/**
	 * Get eoaiSoNo
	 */
	@Column(name = "EOAI_SO_NO")
	public String getEoaiSoNo() {
		return eoaiSoNo;
	}

	/**
	 * Set eoaiSoNo
	 */
	public void setEoaiSoNo(String eoaiSoNo) {
		this.eoaiSoNo = eoaiSoNo;
		addValidField("eoaiSoNo");
	}

	/**
	 * Get eoaiDoNo
	 */
	@Column(name = "EOAI_DO_NO")
	public String getEoaiDoNo() {
		return eoaiDoNo;
	}

	/**
	 * Set eoaiDoNo
	 */
	public void setEoaiDoNo(String eoaiDoNo) {
		this.eoaiDoNo = eoaiDoNo;
		addValidField("eoaiDoNo");
	}

	/**
	 * Get eoaiIeFlag
	 */
	@Column(name = "EOAI_IE_FLAG")
	public String getEoaiIeFlag() {
		return eoaiIeFlag;
	}

	/**
	 * Set eoaiIeFlag
	 */
	public void setEoaiIeFlag(String eoaiIeFlag) {
		this.eoaiIeFlag = eoaiIeFlag;
		addValidField("eoaiIeFlag");
	}

	/**
	 * Get eoaiConsignorEbcuId
	 */
	@Column(name = "EOAI_CONSIGNOR_EBCU_ID")
	public Long getEoaiConsignorEbcuId() {
		return eoaiConsignorEbcuId;
	}

	/**
	 * Set eoaiConsignorEbcuId
	 */
	public void setEoaiConsignorEbcuId(Long eoaiConsignorEbcuId) {
		this.eoaiConsignorEbcuId = eoaiConsignorEbcuId;
		addValidField("eoaiConsignorEbcuId");
	}

	/**
	 * Get eoaiConsignorEbcuCode
	 */
	@Column(name = "EOAI_CONSIGNOR_EBCU_CODE")
	public String getEoaiConsignorEbcuCode() {
		return eoaiConsignorEbcuCode;
	}

	/**
	 * Set eoaiConsignorEbcuCode
	 */
	public void setEoaiConsignorEbcuCode(String eoaiConsignorEbcuCode) {
		this.eoaiConsignorEbcuCode = eoaiConsignorEbcuCode;
		addValidField("eoaiConsignorEbcuCode");
	}

	/**
	 * Get eoaiConsignorEbcuName
	 */
	@Column(name = "EOAI_CONSIGNOR_EBCU_NAME")
	public String getEoaiConsignorEbcuName() {
		return eoaiConsignorEbcuName;
	}

	/**
	 * Set eoaiConsignorEbcuName
	 */
	public void setEoaiConsignorEbcuName(String eoaiConsignorEbcuName) {
		this.eoaiConsignorEbcuName = eoaiConsignorEbcuName;
		addValidField("eoaiConsignorEbcuName");
	}

	/**
	 * Get eoaiOwnerEbcuId
	 */
	@Column(name = "EOAI_OWNER_EBCU_ID")
	public Long getEoaiOwnerEbcuId() {
		return eoaiOwnerEbcuId;
	}

	/**
	 * Set eoaiOwnerEbcuId
	 */
	public void setEoaiOwnerEbcuId(Long eoaiOwnerEbcuId) {
		this.eoaiOwnerEbcuId = eoaiOwnerEbcuId;
		addValidField("eoaiOwnerEbcuId");
	}

	/**
	 * Get eoaiOwnerEbcuCode
	 */
	@Column(name = "EOAI_OWNER_EBCU_CODE")
	public String getEoaiOwnerEbcuCode() {
		return eoaiOwnerEbcuCode;
	}

	/**
	 * Set eoaiOwnerEbcuCode
	 */
	public void setEoaiOwnerEbcuCode(String eoaiOwnerEbcuCode) {
		this.eoaiOwnerEbcuCode = eoaiOwnerEbcuCode;
		addValidField("eoaiOwnerEbcuCode");
	}

	/**
	 * Get eoaiOwnerEbcuName
	 */
	@Column(name = "EOAI_OWNER_EBCU_NAME")
	public String getEoaiOwnerEbcuName() {
		return eoaiOwnerEbcuName;
	}

	/**
	 * Set eoaiOwnerEbcuName
	 */
	public void setEoaiOwnerEbcuName(String eoaiOwnerEbcuName) {
		this.eoaiOwnerEbcuName = eoaiOwnerEbcuName;
		addValidField("eoaiOwnerEbcuName");
	}

	/**
	 * Get eoaiBatchNo
	 */
	@Column(name = "EOAI_BATCH_NO")
	public String getEoaiBatchNo() {
		return eoaiBatchNo;
	}

	/**
	 * Set eoaiBatchNo
	 */
	public void setEoaiBatchNo(String eoaiBatchNo) {
		this.eoaiBatchNo = eoaiBatchNo;
		addValidField("eoaiBatchNo");
	}

	/**
	 * Get eoaiShipperConsignNo
	 */
	@Column(name = "EOAI_SHIPPER_CONSIGN_NO")
	public String getEoaiShipperConsignNo() {
		return eoaiShipperConsignNo;
	}

	/**
	 * Set eoaiShipperConsignNo
	 */
	public void setEoaiShipperConsignNo(String eoaiShipperConsignNo) {
		this.eoaiShipperConsignNo = eoaiShipperConsignNo;
		addValidField("eoaiShipperConsignNo");
	}

	/**
	 * Get eoaiMabwNo
	 */
	@Column(name = "EOAI_MABW_NO")
	public String getEoaiMabwNo() {
		return eoaiMabwNo;
	}

	/**
	 * Set eoaiMabwNo
	 */
	public void setEoaiMabwNo(String eoaiMabwNo) {
		this.eoaiMabwNo = eoaiMabwNo;
		addValidField("eoaiMabwNo");
	}

	/**
	 * Get eoaiHabwNo
	 */
	@Column(name = "EOAI_HABW_NO")
	public String getEoaiHabwNo() {
		return eoaiHabwNo;
	}

	/**
	 * Set eoaiHabwNo
	 */
	public void setEoaiHabwNo(String eoaiHabwNo) {
		this.eoaiHabwNo = eoaiHabwNo;
		addValidField("eoaiHabwNo");
	}

	/**
	 * Get eoaiTradeTerms
	 */
	@Column(name = "EOAI_TRADE_TERMS")
	public String getEoaiTradeTerms() {
		return eoaiTradeTerms;
	}

	/**
	 * Set eoaiTradeTerms
	 */
	public void setEoaiTradeTerms(String eoaiTradeTerms) {
		this.eoaiTradeTerms = eoaiTradeTerms;
		addValidField("eoaiTradeTerms");
	}

	/**
	 * Get eoaiCarrierBookingNo
	 */
	@Column(name = "EOAI_CARRIER_BOOKING_NO")
	public String getEoaiCarrierBookingNo() {
		return eoaiCarrierBookingNo;
	}

	/**
	 * Set eoaiCarrierBookingNo
	 */
	public void setEoaiCarrierBookingNo(String eoaiCarrierBookingNo) {
		this.eoaiCarrierBookingNo = eoaiCarrierBookingNo;
		addValidField("eoaiCarrierBookingNo");
	}

	/**
	 * Get eoaiBookingAgentId
	 */
	@Column(name = "EOAI_BOOKING_AGENT_ID")
	public Long getEoaiBookingAgentId() {
		return eoaiBookingAgentId;
	}

	/**
	 * Set eoaiBookingAgentId
	 */
	public void setEoaiBookingAgentId(Long eoaiBookingAgentId) {
		this.eoaiBookingAgentId = eoaiBookingAgentId;
		addValidField("eoaiBookingAgentId");
	}

	/**
	 * Get eoaiBookingAgentCode
	 */
	@Column(name = "EOAI_BOOKING_AGENT_CODE")
	public String getEoaiBookingAgentCode() {
		return eoaiBookingAgentCode;
	}

	/**
	 * Set eoaiBookingAgentCode
	 */
	public void setEoaiBookingAgentCode(String eoaiBookingAgentCode) {
		this.eoaiBookingAgentCode = eoaiBookingAgentCode;
		addValidField("eoaiBookingAgentCode");
	}

	/**
	 * Get eoaiBookingAgentName
	 */
	@Column(name = "EOAI_BOOKING_AGENT_NAME")
	public String getEoaiBookingAgentName() {
		return eoaiBookingAgentName;
	}

	/**
	 * Set eoaiBookingAgentName
	 */
	public void setEoaiBookingAgentName(String eoaiBookingAgentName) {
		this.eoaiBookingAgentName = eoaiBookingAgentName;
		addValidField("eoaiBookingAgentName");
	}

	/**
	 * Get eoaiBookingRequestDate
	 */
	@Column(name = "EOAI_BOOKING_REQUEST_DATE")
	public Date getEoaiBookingRequestDate() {
		return eoaiBookingRequestDate;
	}

	/**
	 * Set eoaiBookingRequestDate
	 */
	public void setEoaiBookingRequestDate(Date eoaiBookingRequestDate) {
		this.eoaiBookingRequestDate = eoaiBookingRequestDate;
		addValidField("eoaiBookingRequestDate");
	}

	/**
	 * Get eoaiBookingCompletedDate
	 */
	@Column(name = "EOAI_BOOKING_COMPLETED_DATE")
	public Date getEoaiBookingCompletedDate() {
		return eoaiBookingCompletedDate;
	}

	/**
	 * Set eoaiBookingCompletedDate
	 */
	public void setEoaiBookingCompletedDate(Date eoaiBookingCompletedDate) {
		this.eoaiBookingCompletedDate = eoaiBookingCompletedDate;
		addValidField("eoaiBookingCompletedDate");
	}

	/**
	 * Get eoaiAirlinesId
	 */
	@Column(name = "EOAI_AIRLINES_ID")
	public Long getEoaiAirlinesId() {
		return eoaiAirlinesId;
	}

	/**
	 * Set eoaiAirlinesId
	 */
	public void setEoaiAirlinesId(Long eoaiAirlinesId) {
		this.eoaiAirlinesId = eoaiAirlinesId;
		addValidField("eoaiAirlinesId");
	}

	/**
	 * Get eoaiAirlinesCode
	 */
	@Column(name = "EOAI_AIRLINES_CODE")
	public String getEoaiAirlinesCode() {
		return eoaiAirlinesCode;
	}

	/**
	 * Set eoaiAirlinesCode
	 */
	public void setEoaiAirlinesCode(String eoaiAirlinesCode) {
		this.eoaiAirlinesCode = eoaiAirlinesCode;
		addValidField("eoaiAirlinesCode");
	}

	/**
	 * Get eoaiAirlinesName
	 */
	@Column(name = "EOAI_AIRLINES_NAME")
	public String getEoaiAirlinesName() {
		return eoaiAirlinesName;
	}

	/**
	 * Set eoaiAirlinesName
	 */
	public void setEoaiAirlinesName(String eoaiAirlinesName) {
		this.eoaiAirlinesName = eoaiAirlinesName;
		addValidField("eoaiAirlinesName");
	}

	/**
	 * Get eoaiFlightNo
	 */
	@Column(name = "EOAI_FLIGHT_NO")
	public String getEoaiFlightNo() {
		return eoaiFlightNo;
	}

	/**
	 * Set eoaiFlightNo
	 */
	public void setEoaiFlightNo(String eoaiFlightNo) {
		this.eoaiFlightNo = eoaiFlightNo;
		addValidField("eoaiFlightNo");
	}

	/**
	 * Get eoaiEtd
	 */
	@Column(name = "EOAI_ETD")
	public Date getEoaiEtd() {
		return eoaiEtd;
	}

	/**
	 * Set eoaiEtd
	 */
	public void setEoaiEtd(Date eoaiEtd) {
		this.eoaiEtd = eoaiEtd;
		addValidField("eoaiEtd");
	}

	/**
	 * Get eoaiAtd
	 */
	@Column(name = "EOAI_ATD")
	public Date getEoaiAtd() {
		return eoaiAtd;
	}

	/**
	 * Set eoaiAtd
	 */
	public void setEoaiAtd(Date eoaiAtd) {
		this.eoaiAtd = eoaiAtd;
		addValidField("eoaiAtd");
	}

	/**
	 * Get eoaiDepartureStationId
	 */
	@Column(name = "EOAI_DEPARTURE_STATION_ID")
	public Long getEoaiDepartureStationId() {
		return eoaiDepartureStationId;
	}

	/**
	 * Set eoaiDepartureStationId
	 */
	public void setEoaiDepartureStationId(Long eoaiDepartureStationId) {
		this.eoaiDepartureStationId = eoaiDepartureStationId;
		addValidField("eoaiDepartureStationId");
	}

	/**
	 * Get eoaiDepartureStationCode
	 */
	@Column(name = "EOAI_DEPARTURE_STATION_CODE")
	public String getEoaiDepartureStationCode() {
		return eoaiDepartureStationCode;
	}

	/**
	 * Set eoaiDepartureStationCode
	 */
	public void setEoaiDepartureStationCode(String eoaiDepartureStationCode) {
		this.eoaiDepartureStationCode = eoaiDepartureStationCode;
		addValidField("eoaiDepartureStationCode");
	}

	/**
	 * Get eoaiDepartureStation
	 */
	@Column(name = "EOAI_DEPARTURE_STATION")
	public String getEoaiDepartureStation() {
		return eoaiDepartureStation;
	}

	/**
	 * Set eoaiDepartureStation
	 */
	public void setEoaiDepartureStation(String eoaiDepartureStation) {
		this.eoaiDepartureStation = eoaiDepartureStation;
		addValidField("eoaiDepartureStation");
	}

	/**
	 * Get eoaiTransferStationId
	 */
	@Column(name = "EOAI_TRANSFER_STATION_ID")
	public Long getEoaiTransferStationId() {
		return eoaiTransferStationId;
	}

	/**
	 * Set eoaiTransferStationId
	 */
	public void setEoaiTransferStationId(Long eoaiTransferStationId) {
		this.eoaiTransferStationId = eoaiTransferStationId;
		addValidField("eoaiTransferStationId");
	}

	/**
	 * Get eoaiTransferStationCode
	 */
	@Column(name = "EOAI_TRANSFER_STATION_CODE")
	public String getEoaiTransferStationCode() {
		return eoaiTransferStationCode;
	}

	/**
	 * Set eoaiTransferStationCode
	 */
	public void setEoaiTransferStationCode(String eoaiTransferStationCode) {
		this.eoaiTransferStationCode = eoaiTransferStationCode;
		addValidField("eoaiTransferStationCode");
	}

	/**
	 * Get eoaiTransferStation
	 */
	@Column(name = "EOAI_TRANSFER_STATION")
	public String getEoaiTransferStation() {
		return eoaiTransferStation;
	}

	/**
	 * Set eoaiTransferStation
	 */
	public void setEoaiTransferStation(String eoaiTransferStation) {
		this.eoaiTransferStation = eoaiTransferStation;
		addValidField("eoaiTransferStation");
	}

	/**
	 * Get eoaiDestinationId
	 */
	@Column(name = "EOAI_DESTINATION_ID")
	public Long getEoaiDestinationId() {
		return eoaiDestinationId;
	}

	/**
	 * Set eoaiDestinationId
	 */
	public void setEoaiDestinationId(Long eoaiDestinationId) {
		this.eoaiDestinationId = eoaiDestinationId;
		addValidField("eoaiDestinationId");
	}

	/**
	 * Get eoaiDestinationCode
	 */
	@Column(name = "EOAI_DESTINATION_CODE")
	public String getEoaiDestinationCode() {
		return eoaiDestinationCode;
	}

	/**
	 * Set eoaiDestinationCode
	 */
	public void setEoaiDestinationCode(String eoaiDestinationCode) {
		this.eoaiDestinationCode = eoaiDestinationCode;
		addValidField("eoaiDestinationCode");
	}

	/**
	 * Get eoaiDestination
	 */
	@Column(name = "EOAI_DESTINATION")
	public String getEoaiDestination() {
		return eoaiDestination;
	}

	/**
	 * Set eoaiDestination
	 */
	public void setEoaiDestination(String eoaiDestination) {
		this.eoaiDestination = eoaiDestination;
		addValidField("eoaiDestination");
	}

	/**
	 * Get eoaiEta
	 */
	@Column(name = "EOAI_ETA")
	public Date getEoaiEta() {
		return eoaiEta;
	}

	/**
	 * Set eoaiEta
	 */
	public void setEoaiEta(Date eoaiEta) {
		this.eoaiEta = eoaiEta;
		addValidField("eoaiEta");
	}

	/**
	 * Get eoaiAta
	 */
	@Column(name = "EOAI_ATA")
	public Date getEoaiAta() {
		return eoaiAta;
	}

	/**
	 * Set eoaiAta
	 */
	public void setEoaiAta(Date eoaiAta) {
		this.eoaiAta = eoaiAta;
		addValidField("eoaiAta");
	}

	/**
	 * Get eoaiShipperEbspId
	 */
	@Column(name = "EOAI_SHIPPER_EBSP_ID")
	public Long getEoaiShipperEbspId() {
		return eoaiShipperEbspId;
	}

	/**
	 * Set eoaiShipperEbspId
	 */
	public void setEoaiShipperEbspId(Long eoaiShipperEbspId) {
		this.eoaiShipperEbspId = eoaiShipperEbspId;
		addValidField("eoaiShipperEbspId");
	}

	/**
	 * Get eoaiShipperEbspNameCn
	 */
	@Column(name = "EOAI_SHIPPER_EBSP_NAME_CN")
	public String getEoaiShipperEbspNameCn() {
		return eoaiShipperEbspNameCn;
	}

	/**
	 * Set eoaiShipperEbspNameCn
	 */
	public void setEoaiShipperEbspNameCn(String eoaiShipperEbspNameCn) {
		this.eoaiShipperEbspNameCn = eoaiShipperEbspNameCn;
		addValidField("eoaiShipperEbspNameCn");
	}

	/**
	 * Get eoaiShipperEbspCode
	 */
	@Column(name = "EOAI_SHIPPER_EBSP_CODE")
	public String getEoaiShipperEbspCode() {
		return eoaiShipperEbspCode;
	}

	/**
	 * Set eoaiShipperEbspCode
	 */
	public void setEoaiShipperEbspCode(String eoaiShipperEbspCode) {
		this.eoaiShipperEbspCode = eoaiShipperEbspCode;
		addValidField("eoaiShipperEbspCode");
	}

	/**
	 * Get eoaiShipperDetail
	 */
	@Column(name = "EOAI_SHIPPER_DETAIL")
	public String getEoaiShipperDetail() {
		return eoaiShipperDetail;
	}

	/**
	 * Set eoaiShipperDetail
	 */
	public void setEoaiShipperDetail(String eoaiShipperDetail) {
		this.eoaiShipperDetail = eoaiShipperDetail;
		addValidField("eoaiShipperDetail");
	}

	/**
	 * Get eoaiShipperEbsaTel
	 */
	@Column(name = "EOAI_SHIPPER_EBSA_TEL")
	public String getEoaiShipperEbsaTel() {
		return eoaiShipperEbsaTel;
	}

	/**
	 * Set eoaiShipperEbsaTel
	 */
	public void setEoaiShipperEbsaTel(String eoaiShipperEbsaTel) {
		this.eoaiShipperEbsaTel = eoaiShipperEbsaTel;
		addValidField("eoaiShipperEbsaTel");
	}

	/**
	 * Get eoaiShipperEbsaId
	 */
	@Column(name = "EOAI_SHIPPER_EBSA_ID")
	public Long getEoaiShipperEbsaId() {
		return eoaiShipperEbsaId;
	}

	/**
	 * Set eoaiShipperEbsaId
	 */
	public void setEoaiShipperEbsaId(Long eoaiShipperEbsaId) {
		this.eoaiShipperEbsaId = eoaiShipperEbsaId;
		addValidField("eoaiShipperEbsaId");
	}

	/**
	 * Get eoaiShipperEbsaAddress
	 */
	@Column(name = "EOAI_SHIPPER_EBSA_ADDRESS")
	public String getEoaiShipperEbsaAddress() {
		return eoaiShipperEbsaAddress;
	}

	/**
	 * Set eoaiShipperEbsaAddress
	 */
	public void setEoaiShipperEbsaAddress(String eoaiShipperEbsaAddress) {
		this.eoaiShipperEbsaAddress = eoaiShipperEbsaAddress;
		addValidField("eoaiShipperEbsaAddress");
	}

	/**
	 * Get eoaiConsigneeEbspId
	 */
	@Column(name = "EOAI_CONSIGNEE_EBSP_ID")
	public Long getEoaiConsigneeEbspId() {
		return eoaiConsigneeEbspId;
	}

	/**
	 * Set eoaiConsigneeEbspId
	 */
	public void setEoaiConsigneeEbspId(Long eoaiConsigneeEbspId) {
		this.eoaiConsigneeEbspId = eoaiConsigneeEbspId;
		addValidField("eoaiConsigneeEbspId");
	}

	/**
	 * Get eoaiConsigneeEbspNameCn
	 */
	@Column(name = "EOAI_CONSIGNEE_EBSP_NAME_CN")
	public String getEoaiConsigneeEbspNameCn() {
		return eoaiConsigneeEbspNameCn;
	}

	/**
	 * Set eoaiConsigneeEbspNameCn
	 */
	public void setEoaiConsigneeEbspNameCn(String eoaiConsigneeEbspNameCn) {
		this.eoaiConsigneeEbspNameCn = eoaiConsigneeEbspNameCn;
		addValidField("eoaiConsigneeEbspNameCn");
	}

	/**
	 * Get eoaiConsigneeEbspCode
	 */
	@Column(name = "EOAI_CONSIGNEE_EBSP_CODE")
	public String getEoaiConsigneeEbspCode() {
		return eoaiConsigneeEbspCode;
	}

	/**
	 * Set eoaiConsigneeEbspCode
	 */
	public void setEoaiConsigneeEbspCode(String eoaiConsigneeEbspCode) {
		this.eoaiConsigneeEbspCode = eoaiConsigneeEbspCode;
		addValidField("eoaiConsigneeEbspCode");
	}

	/**
	 * Get eoaiConsigneeDetail
	 */
	@Column(name = "EOAI_CONSIGNEE_DETAIL")
	public String getEoaiConsigneeDetail() {
		return eoaiConsigneeDetail;
	}

	/**
	 * Set eoaiConsigneeDetail
	 */
	public void setEoaiConsigneeDetail(String eoaiConsigneeDetail) {
		this.eoaiConsigneeDetail = eoaiConsigneeDetail;
		addValidField("eoaiConsigneeDetail");
	}

	/**
	 * Get eoaiConsigneeEbsaTel
	 */
	@Column(name = "EOAI_CONSIGNEE_EBSA_TEL")
	public String getEoaiConsigneeEbsaTel() {
		return eoaiConsigneeEbsaTel;
	}

	/**
	 * Set eoaiConsigneeEbsaTel
	 */
	public void setEoaiConsigneeEbsaTel(String eoaiConsigneeEbsaTel) {
		this.eoaiConsigneeEbsaTel = eoaiConsigneeEbsaTel;
		addValidField("eoaiConsigneeEbsaTel");
	}

	/**
	 * Get eoaiConsigneeEbsaId
	 */
	@Column(name = "EOAI_CONSIGNEE_EBSA_ID")
	public Long getEoaiConsigneeEbsaId() {
		return eoaiConsigneeEbsaId;
	}

	/**
	 * Set eoaiConsigneeEbsaId
	 */
	public void setEoaiConsigneeEbsaId(Long eoaiConsigneeEbsaId) {
		this.eoaiConsigneeEbsaId = eoaiConsigneeEbsaId;
		addValidField("eoaiConsigneeEbsaId");
	}

	/**
	 * Get eoaiConsigneeEbsaAddress
	 */
	@Column(name = "EOAI_CONSIGNEE_EBSA_ADDRESS")
	public String getEoaiConsigneeEbsaAddress() {
		return eoaiConsigneeEbsaAddress;
	}

	/**
	 * Set eoaiConsigneeEbsaAddress
	 */
	public void setEoaiConsigneeEbsaAddress(String eoaiConsigneeEbsaAddress) {
		this.eoaiConsigneeEbsaAddress = eoaiConsigneeEbsaAddress;
		addValidField("eoaiConsigneeEbsaAddress");
	}

	/**
	 * Get eoaiNotifyId
	 */
	@Column(name = "EOAI_NOTIFY_ID")
	public Long getEoaiNotifyId() {
		return eoaiNotifyId;
	}

	/**
	 * Set eoaiNotifyId
	 */
	public void setEoaiNotifyId(Long eoaiNotifyId) {
		this.eoaiNotifyId = eoaiNotifyId;
		addValidField("eoaiNotifyId");
	}

	/**
	 * Get eoaiNotifyCode
	 */
	@Column(name = "EOAI_NOTIFY_CODE")
	public String getEoaiNotifyCode() {
		return eoaiNotifyCode;
	}

	/**
	 * Set eoaiNotifyCode
	 */
	public void setEoaiNotifyCode(String eoaiNotifyCode) {
		this.eoaiNotifyCode = eoaiNotifyCode;
		addValidField("eoaiNotifyCode");
	}

	/**
	 * Get eoaiNotify
	 */
	@Column(name = "EOAI_NOTIFY")
	public String getEoaiNotify() {
		return eoaiNotify;
	}

	/**
	 * Set eoaiNotify
	 */
	public void setEoaiNotify(String eoaiNotify) {
		this.eoaiNotify = eoaiNotify;
		addValidField("eoaiNotify");
	}

	/**
	 * Get eoaiNotifierDetail
	 */
	@Column(name = "EOAI_NOTIFIER_DETAIL")
	public String getEoaiNotifierDetail() {
		return eoaiNotifierDetail;
	}

	/**
	 * Set eoaiNotifierDetail
	 */
	public void setEoaiNotifierDetail(String eoaiNotifierDetail) {
		this.eoaiNotifierDetail = eoaiNotifierDetail;
		addValidField("eoaiNotifierDetail");
	}

	/**
	 * Get eoaiReqStationDate
	 */
	@Column(name = "EOAI_REQ_STATION_DATE")
	public Date getEoaiReqStationDate() {
		return eoaiReqStationDate;
	}

	/**
	 * Set eoaiReqStationDate
	 */
	public void setEoaiReqStationDate(Date eoaiReqStationDate) {
		this.eoaiReqStationDate = eoaiReqStationDate;
		addValidField("eoaiReqStationDate");
	}

	/**
	 * Get eoaiAirfreightStation
	 */
	@Column(name = "EOAI_AIRFREIGHT_STATION")
	public String getEoaiAirfreightStation() {
		return eoaiAirfreightStation;
	}

	/**
	 * Set eoaiAirfreightStation
	 */
	public void setEoaiAirfreightStation(String eoaiAirfreightStation) {
		this.eoaiAirfreightStation = eoaiAirfreightStation;
		addValidField("eoaiAirfreightStation");
	}

	/**
	 * Get eoaiDelayReason
	 */
	@Column(name = "EOAI_DELAY_REASON")
	public String getEoaiDelayReason() {
		return eoaiDelayReason;
	}

	/**
	 * Set eoaiDelayReason
	 */
	public void setEoaiDelayReason(String eoaiDelayReason) {
		this.eoaiDelayReason = eoaiDelayReason;
		addValidField("eoaiDelayReason");
	}

	/**
	 * Get eoaiReceivedBlDate
	 */
	@Column(name = "EOAI_RECEIVED_BL_DATE")
	public Date getEoaiReceivedBlDate() {
		return eoaiReceivedBlDate;
	}

	/**
	 * Set eoaiReceivedBlDate
	 */
	public void setEoaiReceivedBlDate(Date eoaiReceivedBlDate) {
		this.eoaiReceivedBlDate = eoaiReceivedBlDate;
		addValidField("eoaiReceivedBlDate");
	}

	/**
	 * Get eoaiExternalOrderNo
	 */
	@Column(name = "EOAI_EXTERNAL_ORDER_NO")
	public String getEoaiExternalOrderNo() {
		return eoaiExternalOrderNo;
	}

	/**
	 * Set eoaiExternalOrderNo
	 */
	public void setEoaiExternalOrderNo(String eoaiExternalOrderNo) {
		this.eoaiExternalOrderNo = eoaiExternalOrderNo;
		addValidField("eoaiExternalOrderNo");
	}

	/**
	 * Get eoaiQuantity
	 */
	@Column(name = "EOAI_QUANTITY")
	public Long getEoaiQuantity() {
		return eoaiQuantity;
	}

	/**
	 * Set eoaiQuantity
	 */
	public void setEoaiQuantity(Long eoaiQuantity) {
		this.eoaiQuantity = eoaiQuantity;
		addValidField("eoaiQuantity");
	}

	/**
	 * Get eoaiGrossWeight
	 */
	@Column(name = "EOAI_GROSS_WEIGHT")
	public Long getEoaiGrossWeight() {
		return eoaiGrossWeight;
	}

	/**
	 * Set eoaiGrossWeight
	 */
	public void setEoaiGrossWeight(Long eoaiGrossWeight) {
		this.eoaiGrossWeight = eoaiGrossWeight;
		addValidField("eoaiGrossWeight");
	}

	/**
	 * Get eoaiNetWeight
	 */
	@Column(name = "EOAI_NET_WEIGHT")
	public Long getEoaiNetWeight() {
		return eoaiNetWeight;
	}

	/**
	 * Set eoaiNetWeight
	 */
	public void setEoaiNetWeight(Long eoaiNetWeight) {
		this.eoaiNetWeight = eoaiNetWeight;
		addValidField("eoaiNetWeight");
	}

	/**
	 * Get eoaiVolume
	 */
	@Column(name = "EOAI_VOLUME")
	public Long getEoaiVolume() {
		return eoaiVolume;
	}

	/**
	 * Set eoaiVolume
	 */
	public void setEoaiVolume(Long eoaiVolume) {
		this.eoaiVolume = eoaiVolume;
		addValidField("eoaiVolume");
	}

	/**
	 * Get eoaiVolumeWeight
	 */
	@Column(name = "EOAI_VOLUME_WEIGHT")
	public Long getEoaiVolumeWeight() {
		return eoaiVolumeWeight;
	}

	/**
	 * Set eoaiVolumeWeight
	 */
	public void setEoaiVolumeWeight(Long eoaiVolumeWeight) {
		this.eoaiVolumeWeight = eoaiVolumeWeight;
		addValidField("eoaiVolumeWeight");
	}

	/**
	 * Get eoaiChargedWeight
	 */
	@Column(name = "EOAI_CHARGED_WEIGHT")
	public Long getEoaiChargedWeight() {
		return eoaiChargedWeight;
	}

	/**
	 * Set eoaiChargedWeight
	 */
	public void setEoaiChargedWeight(Long eoaiChargedWeight) {
		this.eoaiChargedWeight = eoaiChargedWeight;
		addValidField("eoaiChargedWeight");
	}

	/**
	 * Get eoaiRemark
	 */
	@Column(name = "EOAI_REMARK")
	public String getEoaiRemark() {
		return eoaiRemark;
	}

	/**
	 * Set eoaiRemark
	 */
	public void setEoaiRemark(String eoaiRemark) {
		this.eoaiRemark = eoaiRemark;
		addValidField("eoaiRemark");
	}

	/**
	 * Get eoaiSubstr1
	 */
	@Column(name = "EOAI_SUBSTR1")
	public String getEoaiSubstr1() {
		return eoaiSubstr1;
	}

	/**
	 * Set eoaiSubstr1
	 */
	public void setEoaiSubstr1(String eoaiSubstr1) {
		this.eoaiSubstr1 = eoaiSubstr1;
		addValidField("eoaiSubstr1");
	}

	/**
	 * Get eoaiSubstr2
	 */
	@Column(name = "EOAI_SUBSTR2")
	public String getEoaiSubstr2() {
		return eoaiSubstr2;
	}

	/**
	 * Set eoaiSubstr2
	 */
	public void setEoaiSubstr2(String eoaiSubstr2) {
		this.eoaiSubstr2 = eoaiSubstr2;
		addValidField("eoaiSubstr2");
	}

	/**
	 * Get eoaiSubstr3
	 */
	@Column(name = "EOAI_SUBSTR3")
	public String getEoaiSubstr3() {
		return eoaiSubstr3;
	}

	/**
	 * Set eoaiSubstr3
	 */
	public void setEoaiSubstr3(String eoaiSubstr3) {
		this.eoaiSubstr3 = eoaiSubstr3;
		addValidField("eoaiSubstr3");
	}

	/**
	 * Get eoaiSubstr4
	 */
	@Column(name = "EOAI_SUBSTR4")
	public String getEoaiSubstr4() {
		return eoaiSubstr4;
	}

	/**
	 * Set eoaiSubstr4
	 */
	public void setEoaiSubstr4(String eoaiSubstr4) {
		this.eoaiSubstr4 = eoaiSubstr4;
		addValidField("eoaiSubstr4");
	}

	/**
	 * Get eoaiSubstr5
	 */
	@Column(name = "EOAI_SUBSTR5")
	public String getEoaiSubstr5() {
		return eoaiSubstr5;
	}

	/**
	 * Set eoaiSubstr5
	 */
	public void setEoaiSubstr5(String eoaiSubstr5) {
		this.eoaiSubstr5 = eoaiSubstr5;
		addValidField("eoaiSubstr5");
	}

	/**
	 * Get eoaiSubstr6
	 */
	@Column(name = "EOAI_SUBSTR6")
	public String getEoaiSubstr6() {
		return eoaiSubstr6;
	}

	/**
	 * Set eoaiSubstr6
	 */
	public void setEoaiSubstr6(String eoaiSubstr6) {
		this.eoaiSubstr6 = eoaiSubstr6;
		addValidField("eoaiSubstr6");
	}

	/**
	 * Get eoaiSubstr7
	 */
	@Column(name = "EOAI_SUBSTR7")
	public String getEoaiSubstr7() {
		return eoaiSubstr7;
	}

	/**
	 * Set eoaiSubstr7
	 */
	public void setEoaiSubstr7(String eoaiSubstr7) {
		this.eoaiSubstr7 = eoaiSubstr7;
		addValidField("eoaiSubstr7");
	}

	/**
	 * Get eoaiSubstr8
	 */
	@Column(name = "EOAI_SUBSTR8")
	public String getEoaiSubstr8() {
		return eoaiSubstr8;
	}

	/**
	 * Set eoaiSubstr8
	 */
	public void setEoaiSubstr8(String eoaiSubstr8) {
		this.eoaiSubstr8 = eoaiSubstr8;
		addValidField("eoaiSubstr8");
	}

	/**
	 * Get eoaiSubstr9
	 */
	@Column(name = "EOAI_SUBSTR9")
	public String getEoaiSubstr9() {
		return eoaiSubstr9;
	}

	/**
	 * Set eoaiSubstr9
	 */
	public void setEoaiSubstr9(String eoaiSubstr9) {
		this.eoaiSubstr9 = eoaiSubstr9;
		addValidField("eoaiSubstr9");
	}

	/**
	 * Get eoaiSubstr10
	 */
	@Column(name = "EOAI_SUBSTR10")
	public String getEoaiSubstr10() {
		return eoaiSubstr10;
	}

	/**
	 * Set eoaiSubstr10
	 */
	public void setEoaiSubstr10(String eoaiSubstr10) {
		this.eoaiSubstr10 = eoaiSubstr10;
		addValidField("eoaiSubstr10");
	}

	/**
	 * Get eoaiSubstr11
	 */
	@Column(name = "EOAI_SUBSTR11")
	public String getEoaiSubstr11() {
		return eoaiSubstr11;
	}

	/**
	 * Set eoaiSubstr11
	 */
	public void setEoaiSubstr11(String eoaiSubstr11) {
		this.eoaiSubstr11 = eoaiSubstr11;
		addValidField("eoaiSubstr11");
	}

	/**
	 * Get eoaiSubstr12
	 */
	@Column(name = "EOAI_SUBSTR12")
	public String getEoaiSubstr12() {
		return eoaiSubstr12;
	}

	/**
	 * Set eoaiSubstr12
	 */
	public void setEoaiSubstr12(String eoaiSubstr12) {
		this.eoaiSubstr12 = eoaiSubstr12;
		addValidField("eoaiSubstr12");
	}

	/**
	 * Get eoaiSubstr13
	 */
	@Column(name = "EOAI_SUBSTR13")
	public String getEoaiSubstr13() {
		return eoaiSubstr13;
	}

	/**
	 * Set eoaiSubstr13
	 */
	public void setEoaiSubstr13(String eoaiSubstr13) {
		this.eoaiSubstr13 = eoaiSubstr13;
		addValidField("eoaiSubstr13");
	}

	/**
	 * Get eoaiSubstr14
	 */
	@Column(name = "EOAI_SUBSTR14")
	public String getEoaiSubstr14() {
		return eoaiSubstr14;
	}

	/**
	 * Set eoaiSubstr14
	 */
	public void setEoaiSubstr14(String eoaiSubstr14) {
		this.eoaiSubstr14 = eoaiSubstr14;
		addValidField("eoaiSubstr14");
	}

	/**
	 * Get eoaiSubstr15
	 */
	@Column(name = "EOAI_SUBSTR15")
	public String getEoaiSubstr15() {
		return eoaiSubstr15;
	}

	/**
	 * Set eoaiSubstr15
	 */
	public void setEoaiSubstr15(String eoaiSubstr15) {
		this.eoaiSubstr15 = eoaiSubstr15;
		addValidField("eoaiSubstr15");
	}

	/**
	 * Get eoaiSubstr16
	 */
	@Column(name = "EOAI_SUBSTR16")
	public String getEoaiSubstr16() {
		return eoaiSubstr16;
	}

	/**
	 * Set eoaiSubstr16
	 */
	public void setEoaiSubstr16(String eoaiSubstr16) {
		this.eoaiSubstr16 = eoaiSubstr16;
		addValidField("eoaiSubstr16");
	}

	/**
	 * Get eoaiSubstr17
	 */
	@Column(name = "EOAI_SUBSTR17")
	public String getEoaiSubstr17() {
		return eoaiSubstr17;
	}

	/**
	 * Set eoaiSubstr17
	 */
	public void setEoaiSubstr17(String eoaiSubstr17) {
		this.eoaiSubstr17 = eoaiSubstr17;
		addValidField("eoaiSubstr17");
	}

	/**
	 * Get eoaiSubstr18
	 */
	@Column(name = "EOAI_SUBSTR18")
	public String getEoaiSubstr18() {
		return eoaiSubstr18;
	}

	/**
	 * Set eoaiSubstr18
	 */
	public void setEoaiSubstr18(String eoaiSubstr18) {
		this.eoaiSubstr18 = eoaiSubstr18;
		addValidField("eoaiSubstr18");
	}

	/**
	 * Get eoaiSubstr19
	 */
	@Column(name = "EOAI_SUBSTR19")
	public String getEoaiSubstr19() {
		return eoaiSubstr19;
	}

	/**
	 * Set eoaiSubstr19
	 */
	public void setEoaiSubstr19(String eoaiSubstr19) {
		this.eoaiSubstr19 = eoaiSubstr19;
		addValidField("eoaiSubstr19");
	}

	/**
	 * Get eoaiSubstr20
	 */
	@Column(name = "EOAI_SUBSTR20")
	public String getEoaiSubstr20() {
		return eoaiSubstr20;
	}

	/**
	 * Set eoaiSubstr20
	 */
	public void setEoaiSubstr20(String eoaiSubstr20) {
		this.eoaiSubstr20 = eoaiSubstr20;
		addValidField("eoaiSubstr20");
	}

	/**
	 * Get eoaiSubstr21
	 */
	@Column(name = "EOAI_SUBSTR21")
	public String getEoaiSubstr21() {
		return eoaiSubstr21;
	}

	/**
	 * Set eoaiSubstr21
	 */
	public void setEoaiSubstr21(String eoaiSubstr21) {
		this.eoaiSubstr21 = eoaiSubstr21;
		addValidField("eoaiSubstr21");
	}

	/**
	 * Get eoaiSubstr22
	 */
	@Column(name = "EOAI_SUBSTR22")
	public String getEoaiSubstr22() {
		return eoaiSubstr22;
	}

	/**
	 * Set eoaiSubstr22
	 */
	public void setEoaiSubstr22(String eoaiSubstr22) {
		this.eoaiSubstr22 = eoaiSubstr22;
		addValidField("eoaiSubstr22");
	}

	/**
	 * Get eoaiSubstr23
	 */
	@Column(name = "EOAI_SUBSTR23")
	public String getEoaiSubstr23() {
		return eoaiSubstr23;
	}

	/**
	 * Set eoaiSubstr23
	 */
	public void setEoaiSubstr23(String eoaiSubstr23) {
		this.eoaiSubstr23 = eoaiSubstr23;
		addValidField("eoaiSubstr23");
	}

	/**
	 * Get eoaiSubstr24
	 */
	@Column(name = "EOAI_SUBSTR24")
	public String getEoaiSubstr24() {
		return eoaiSubstr24;
	}

	/**
	 * Set eoaiSubstr24
	 */
	public void setEoaiSubstr24(String eoaiSubstr24) {
		this.eoaiSubstr24 = eoaiSubstr24;
		addValidField("eoaiSubstr24");
	}

	/**
	 * Get eoaiSubstr25
	 */
	@Column(name = "EOAI_SUBSTR25")
	public String getEoaiSubstr25() {
		return eoaiSubstr25;
	}

	/**
	 * Set eoaiSubstr25
	 */
	public void setEoaiSubstr25(String eoaiSubstr25) {
		this.eoaiSubstr25 = eoaiSubstr25;
		addValidField("eoaiSubstr25");
	}

	/**
	 * Get eoaiSubdate1
	 */
	@Column(name = "EOAI_SUBDATE1")
	public Date getEoaiSubdate1() {
		return eoaiSubdate1;
	}

	/**
	 * Set eoaiSubdate1
	 */
	public void setEoaiSubdate1(Date eoaiSubdate1) {
		this.eoaiSubdate1 = eoaiSubdate1;
		addValidField("eoaiSubdate1");
	}

	/**
	 * Get eoaiSubdate2
	 */
	@Column(name = "EOAI_SUBDATE2")
	public Date getEoaiSubdate2() {
		return eoaiSubdate2;
	}

	/**
	 * Set eoaiSubdate2
	 */
	public void setEoaiSubdate2(Date eoaiSubdate2) {
		this.eoaiSubdate2 = eoaiSubdate2;
		addValidField("eoaiSubdate2");
	}

	/**
	 * Get eoaiSubdate3
	 */
	@Column(name = "EOAI_SUBDATE3")
	public Date getEoaiSubdate3() {
		return eoaiSubdate3;
	}

	/**
	 * Set eoaiSubdate3
	 */
	public void setEoaiSubdate3(Date eoaiSubdate3) {
		this.eoaiSubdate3 = eoaiSubdate3;
		addValidField("eoaiSubdate3");
	}

	/**
	 * Get eoaiSubdate4
	 */
	@Column(name = "EOAI_SUBDATE4")
	public Date getEoaiSubdate4() {
		return eoaiSubdate4;
	}

	/**
	 * Set eoaiSubdate4
	 */
	public void setEoaiSubdate4(Date eoaiSubdate4) {
		this.eoaiSubdate4 = eoaiSubdate4;
		addValidField("eoaiSubdate4");
	}

	/**
	 * Get eoaiSubdate5
	 */
	@Column(name = "EOAI_SUBDATE5")
	public Date getEoaiSubdate5() {
		return eoaiSubdate5;
	}

	/**
	 * Set eoaiSubdate5
	 */
	public void setEoaiSubdate5(Date eoaiSubdate5) {
		this.eoaiSubdate5 = eoaiSubdate5;
		addValidField("eoaiSubdate5");
	}

	/**
	 * Get eoaiSubdate6
	 */
	@Column(name = "EOAI_SUBDATE6")
	public Date getEoaiSubdate6() {
		return eoaiSubdate6;
	}

	/**
	 * Set eoaiSubdate6
	 */
	public void setEoaiSubdate6(Date eoaiSubdate6) {
		this.eoaiSubdate6 = eoaiSubdate6;
		addValidField("eoaiSubdate6");
	}

	/**
	 * Get eoaiSubdate7
	 */
	@Column(name = "EOAI_SUBDATE7")
	public Date getEoaiSubdate7() {
		return eoaiSubdate7;
	}

	/**
	 * Set eoaiSubdate7
	 */
	public void setEoaiSubdate7(Date eoaiSubdate7) {
		this.eoaiSubdate7 = eoaiSubdate7;
		addValidField("eoaiSubdate7");
	}

	/**
	 * Get eoaiSubdate8
	 */
	@Column(name = "EOAI_SUBDATE8")
	public Date getEoaiSubdate8() {
		return eoaiSubdate8;
	}

	/**
	 * Set eoaiSubdate8
	 */
	public void setEoaiSubdate8(Date eoaiSubdate8) {
		this.eoaiSubdate8 = eoaiSubdate8;
		addValidField("eoaiSubdate8");
	}

	/**
	 * Get eoaiSubdate9
	 */
	@Column(name = "EOAI_SUBDATE9")
	public Date getEoaiSubdate9() {
		return eoaiSubdate9;
	}

	/**
	 * Set eoaiSubdate9
	 */
	public void setEoaiSubdate9(Date eoaiSubdate9) {
		this.eoaiSubdate9 = eoaiSubdate9;
		addValidField("eoaiSubdate9");
	}

	/**
	 * Get eoaiSubdate10
	 */
	@Column(name = "EOAI_SUBDATE10")
	public Date getEoaiSubdate10() {
		return eoaiSubdate10;
	}

	/**
	 * Set eoaiSubdate10
	 */
	public void setEoaiSubdate10(Date eoaiSubdate10) {
		this.eoaiSubdate10 = eoaiSubdate10;
		addValidField("eoaiSubdate10");
	}

	/**
	 * Get eoaiSubnum1
	 */
	@Column(name = "EOAI_SUBNUM1")
	public Long getEoaiSubnum1() {
		return eoaiSubnum1;
	}

	/**
	 * Set eoaiSubnum1
	 */
	public void setEoaiSubnum1(Long eoaiSubnum1) {
		this.eoaiSubnum1 = eoaiSubnum1;
		addValidField("eoaiSubnum1");
	}

	/**
	 * Get eoaiSubnum2
	 */
	@Column(name = "EOAI_SUBNUM2")
	public Long getEoaiSubnum2() {
		return eoaiSubnum2;
	}

	/**
	 * Set eoaiSubnum2
	 */
	public void setEoaiSubnum2(Long eoaiSubnum2) {
		this.eoaiSubnum2 = eoaiSubnum2;
		addValidField("eoaiSubnum2");
	}

	/**
	 * Get eoaiSubnum3
	 */
	@Column(name = "EOAI_SUBNUM3")
	public Long getEoaiSubnum3() {
		return eoaiSubnum3;
	}

	/**
	 * Set eoaiSubnum3
	 */
	public void setEoaiSubnum3(Long eoaiSubnum3) {
		this.eoaiSubnum3 = eoaiSubnum3;
		addValidField("eoaiSubnum3");
	}

	/**
	 * Get eoaiSubnum4
	 */
	@Column(name = "EOAI_SUBNUM4")
	public Long getEoaiSubnum4() {
		return eoaiSubnum4;
	}

	/**
	 * Set eoaiSubnum4
	 */
	public void setEoaiSubnum4(Long eoaiSubnum4) {
		this.eoaiSubnum4 = eoaiSubnum4;
		addValidField("eoaiSubnum4");
	}

	/**
	 * Get eoaiSubnum5
	 */
	@Column(name = "EOAI_SUBNUM5")
	public Long getEoaiSubnum5() {
		return eoaiSubnum5;
	}

	/**
	 * Set eoaiSubnum5
	 */
	public void setEoaiSubnum5(Long eoaiSubnum5) {
		this.eoaiSubnum5 = eoaiSubnum5;
		addValidField("eoaiSubnum5");
	}

	/**
	 * Get eoaiSubnum6
	 */
	@Column(name = "EOAI_SUBNUM6")
	public Long getEoaiSubnum6() {
		return eoaiSubnum6;
	}

	/**
	 * Set eoaiSubnum6
	 */
	public void setEoaiSubnum6(Long eoaiSubnum6) {
		this.eoaiSubnum6 = eoaiSubnum6;
		addValidField("eoaiSubnum6");
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
	 * Get eoaiDeclarationTime
	 */
	@Column(name = "EOAI_DECLARATION_TIME")
	public Date getEoaiDeclarationTime() {
		return eoaiDeclarationTime;
	}

	/**
	 * Set eoaiDeclarationTime
	 */
	public void setEoaiDeclarationTime(Date eoaiDeclarationTime) {
		this.eoaiDeclarationTime = eoaiDeclarationTime;
		addValidField("eoaiDeclarationTime");
	}

	/**
	 * Get eoaiReplaceTime
	 */
	@Column(name = "EOAI_REPLACE_TIME")
	public Date getEoaiReplaceTime() {
		return eoaiReplaceTime;
	}

	/**
	 * Set eoaiReplaceTime
	 */
	public void setEoaiReplaceTime(Date eoaiReplaceTime) {
		this.eoaiReplaceTime = eoaiReplaceTime;
		addValidField("eoaiReplaceTime");
	}

	/**
	 * Get eoaiIsDutyfree
	 */
	@Column(name = "EOAI_IS_DUTYFREE")
	public Long getEoaiIsDutyfree() {
		return eoaiIsDutyfree;
	}

	/**
	 * Set eoaiIsDutyfree
	 */
	public void setEoaiIsDutyfree(Long eoaiIsDutyfree) {
		this.eoaiIsDutyfree = eoaiIsDutyfree;
		addValidField("eoaiIsDutyfree");
	}

	/**
	 * Get eoaiPayTime
	 */
	@Column(name = "EOAI_PAY_TIME")
	public Date getEoaiPayTime() {
		return eoaiPayTime;
	}

	/**
	 * Set eoaiPayTime
	 */
	public void setEoaiPayTime(Date eoaiPayTime) {
		this.eoaiPayTime = eoaiPayTime;
		addValidField("eoaiPayTime");
	}

	/**
	 * Get eoaiIsCharteredAirplane
	 */
	@Column(name = "EOAI_IS_CHARTERED_AIRPLANE")
	public String getEoaiIsCharteredAirplane() {
		return eoaiIsCharteredAirplane;
	}

	/**
	 * Set eoaiIsCharteredAirplane
	 */
	public void setEoaiIsCharteredAirplane(String eoaiIsCharteredAirplane) {
		this.eoaiIsCharteredAirplane = eoaiIsCharteredAirplane;
		addValidField("eoaiIsCharteredAirplane");
	}

	/**
	 * Get eoaiIsImportCargo
	 */
	@Column(name = "EOAI_IS_IMPORT_CARGO")
	public String getEoaiIsImportCargo() {
		return eoaiIsImportCargo;
	}

	/**
	 * Set eoaiIsImportCargo
	 */
	public void setEoaiIsImportCargo(String eoaiIsImportCargo) {
		this.eoaiIsImportCargo = eoaiIsImportCargo;
		addValidField("eoaiIsImportCargo");
	}

	/**
	 * Get eoaiIsSingleTransfer
	 */
	@Column(name = "EOAI_IS_SINGLE_TRANSFER")
	public String getEoaiIsSingleTransfer() {
		return eoaiIsSingleTransfer;
	}

	/**
	 * Set eoaiIsSingleTransfer
	 */
	public void setEoaiIsSingleTransfer(String eoaiIsSingleTransfer) {
		this.eoaiIsSingleTransfer = eoaiIsSingleTransfer;
		addValidField("eoaiIsSingleTransfer");
	}

}
