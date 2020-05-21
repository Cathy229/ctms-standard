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
 * Model class for EoRequestContainer
 */
@Entity
@Table(name = "EO_REQUEST_CONTAINER")
public class EoRequestContainerModel extends BaseModel implements OperationLog {

	//eocrId
	private Long eocrId;
	//eocrEoorId
	private Long eocrEoorId;
	//eocrEscoId
	private Long eocrEscoId;
	//eocrEbpjId
	private Long eocrEbpjId;
	//eocrLoEbppId
	private Long eocrLoEbppId;
	//eocrEbtkId
	private Long eocrEbtkId;
	//eocrIsAutomatic
	private String eocrIsAutomatic;
	//eocrTaskStatus
	private String eocrTaskStatus;
	//eocrTaskFeedback
	private String eocrTaskFeedback;
	//eocrSysCode
	private String eocrSysCode;
	//eocrEbbuId
	private Long eocrEbbuId;
	//eocrEbbuNameCn
	private String eocrEbbuNameCn;
	//eocrEbbuCode
	private String eocrEbbuCode;
	//eocrEbbuDist1
	private String eocrEbbuDist1;
	//eocrEbbuDist2
	private String eocrEbbuDist2;
	//eocrEbbuDist3
	private String eocrEbbuDist3;
	//eocrEbbuDist4
	private String eocrEbbuDist4;
	//eocrEbbuDist5
	private String eocrEbbuDist5;
	//eocrToId
	private String eocrToId;
	//eocrNo
	private String eocrNo;
	//eocrType
	private String eocrType;
	//eocrStatus
	private String eocrStatus;
	//eocrOrder
	private Long eocrOrder;
	//eocrSoNo
	private String eocrSoNo;
	//eocrDoNo
	private String eocrDoNo;
	//eocrConsignorEbcuId
	private Long eocrConsignorEbcuId;
	//eocrConsignorEbcuCode
	private String eocrConsignorEbcuCode;
	//eocrConsignorEbcuName
	private String eocrConsignorEbcuName;
	//eocrOwnerEbcuId
	private Long eocrOwnerEbcuId;
	//eocrOwnerEbcuCode
	private String eocrOwnerEbcuCode;
	//eocrOwnerEbcuName
	private String eocrOwnerEbcuName;
	//eocrShipperConsignNo
	private String eocrShipperConsignNo;
	//eocrMblNo
	private String eocrMblNo;
	//eocrHblNo
	private String eocrHblNo;
	//eocrContainerTypeWeight
	private String eocrContainerTypeWeight;
	//eocrQuantity
	private Long eocrQuantity;
	//eocrVolume
	private Long eocrVolume;
	//eocrGw
	private Long eocrGw;
	//eocrNw
	private Long eocrNw;
	//eocrTankType
	private String eocrTankType;
	//eocrCarrierEbcuId
	private Long eocrCarrierEbcuId;
	//eocrCarrierEbcuCode
	private String eocrCarrierEbcuCode;
	//eocrCarrierEbcuName
	private String eocrCarrierEbcuName;
	//eocrVessel
	private String eocrVessel;
	//eocrVoyage
	private String eocrVoyage;
	//eocrMode
	private String eocrMode;
	//eocrStartEbptId
	private Long eocrStartEbptId;
	//eocrStartEbptNo
	private String eocrStartEbptNo;
	//eocrStartEbptNameCn
	private String eocrStartEbptNameCn;
	//eocrEndEbptId
	private Long eocrEndEbptId;
	//eocrEndEbptNo
	private String eocrEndEbptNo;
	//eocrEndEbptNameCn
	private String eocrEndEbptNameCn;
	//eocrAtd
	private Date eocrAtd;
	//eocrAta
	private Date eocrAta;
	//eocrPlanFetchDate
	private Date eocrPlanFetchDate;
	//eocrFetchYardEbcuId
	private Long eocrFetchYardEbcuId;
	//eocrFetchYardEbcuCode
	private String eocrFetchYardEbcuCode;
	//eocrFetchYardEbcuName
	private String eocrFetchYardEbcuName;
	//eocrFetchYardContact
	private String eocrFetchYardContact;
	//eocrFetchYardMobile
	private String eocrFetchYardMobile;
	//eocrFetchYardAddress
	private String eocrFetchYardAddress;
	//eocrFetchTeamEbcuId
	private Long eocrFetchTeamEbcuId;
	//eocrFetchTeamEbcuCode
	private String eocrFetchTeamEbcuCode;
	//eocrFetchTeamContact
	private String eocrFetchTeamContact;
	//eocrFetchTeamMobile
	private String eocrFetchTeamMobile;
	//eocrPlanReturnDate
	private Date eocrPlanReturnDate;
	//eocrReturnYardEbcuId
	private Long eocrReturnYardEbcuId;
	//eocrReturnYardEbcuCode
	private String eocrReturnYardEbcuCode;
	//eocrReturnYardEbcuName
	private String eocrReturnYardEbcuName;
	//eocrReturnYardContact
	private String eocrReturnYardContact;
	//eocrReturnYardMobile
	private String eocrReturnYardMobile;
	//eocrReturnYardAddress
	private String eocrReturnYardAddress;
	//eocrReturnTeamEbcuId
	private Long eocrReturnTeamEbcuId;
	//eocrReturnTeamEbcuCode
	private String eocrReturnTeamEbcuCode;
	//eocrReturnTeamContact
	private String eocrReturnTeamContact;
	//eocrReturnTeamMobile
	private String eocrReturnTeamMobile;
	//eocrAgentEbcuId
	private Long eocrAgentEbcuId;
	//eocrAgentEbcuCode
	private String eocrAgentEbcuCode;
	//eocrExternalOrderNo
	private String eocrExternalOrderNo;
	//eocrCauseDelay
	private String eocrCauseDelay;
	//eocrRemark
	private String eocrRemark;
	//eocrSubstr1
	private String eocrSubstr1;
	//eocrSubstr2
	private String eocrSubstr2;
	//eocrSubstr3
	private String eocrSubstr3;
	//eocrSubstr4
	private String eocrSubstr4;
	//eocrSubstr5
	private String eocrSubstr5;
	//eocrSubstr6
	private String eocrSubstr6;
	//eocrSubstr7
	private String eocrSubstr7;
	//eocrSubstr8
	private String eocrSubstr8;
	//eocrSubstr9
	private String eocrSubstr9;
	//eocrSubstr10
	private String eocrSubstr10;
	//eocrSubstr11
	private String eocrSubstr11;
	//eocrSubstr12
	private String eocrSubstr12;
	//eocrSubstr13
	private String eocrSubstr13;
	//eocrSubstr14
	private String eocrSubstr14;
	//eocrSubstr15
	private String eocrSubstr15;
	//eocrSubstr16
	private String eocrSubstr16;
	//eocrSubstr17
	private String eocrSubstr17;
	//eocrSubstr18
	private String eocrSubstr18;
	//eocrSubstr19
	private String eocrSubstr19;
	//eocrSubstr20
	private String eocrSubstr20;
	//eocrSubstr21
	private String eocrSubstr21;
	//eocrSubstr22
	private String eocrSubstr22;
	//eocrSubstr23
	private String eocrSubstr23;
	//eocrSubstr24
	private String eocrSubstr24;
	//eocrSubstr25
	private String eocrSubstr25;
	//eocrSubdate1
	private Date eocrSubdate1;
	//eocrSubdate2
	private Date eocrSubdate2;
	//eocrSubdate3
	private Date eocrSubdate3;
	//eocrSubdate4
	private Date eocrSubdate4;
	//eocrSubdate5
	private Date eocrSubdate5;
	//eocrSubdate6
	private Date eocrSubdate6;
	//eocrSubdate7
	private Date eocrSubdate7;
	//eocrSubdate8
	private Date eocrSubdate8;
	//eocrSubdate9
	private Date eocrSubdate9;
	//eocrSubdate10
	private Date eocrSubdate10;
	//eocrSubnum1
	private Long eocrSubnum1;
	//eocrSubnum2
	private Long eocrSubnum2;
	//eocrSubnum3
	private Long eocrSubnum3;
	//eocrSubnum4
	private Long eocrSubnum4;
	//eocrSubnum5
	private Long eocrSubnum5;
	//eocrSubnum6
	private Long eocrSubnum6;
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
	//eocrLeaseNo
	private String eocrLeaseNo;
	//eocrAgentEbcuName
	private String eocrAgentEbcuName;
	//eocrWithTime
	private Date eocrWithTime;
	//eocrWither
	private String eocrWither;
	//eocrEscoCode
	private String eocrEscoCode;
	//eocrEscoNameCn
	private String eocrEscoNameCn;
	//eocrScEsdeCode
	private String eocrScEsdeCode;
	//eocrEsdeDepartmentName
	private String eocrEsdeDepartmentName;
	//eocrEsusUserNameCn
	private String eocrEsusUserNameCn;
	//eocrRetoType
	private Long eocrRetoType;
	//eocrStartProvisionsBoxDay
	private Long eocrStartProvisionsBoxDay;
	//eocrEndProvisionsBoxDay
	private Long eocrEndProvisionsBoxDay;
	//eocrProvisionsBoxFees
	private Long eocrProvisionsBoxFees;

	/**
	 * Get eocrId
	 */
	@Column(name = "EOCR_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEocrId() {
		return eocrId;
	}

	/**
	 * Set eocrId
	 */
	public void setEocrId(Long eocrId) {
		this.eocrId = eocrId;
		addValidField("eocrId");
	}

	/**
	 * Get eocrEoorId
	 */
	@Column(name = "EOCR_EOOR_ID")
	public Long getEocrEoorId() {
		return eocrEoorId;
	}

	/**
	 * Set eocrEoorId
	 */
	public void setEocrEoorId(Long eocrEoorId) {
		this.eocrEoorId = eocrEoorId;
		addValidField("eocrEoorId");
	}

	/**
	 * Get eocrEscoId
	 */
	@Column(name = "EOCR_ESCO_ID")
	public Long getEocrEscoId() {
		return eocrEscoId;
	}

	/**
	 * Set eocrEscoId
	 */
	public void setEocrEscoId(Long eocrEscoId) {
		this.eocrEscoId = eocrEscoId;
		addValidField("eocrEscoId");
	}

	/**
	 * Get eocrEbpjId
	 */
	@Column(name = "EOCR_EBPJ_ID")
	public Long getEocrEbpjId() {
		return eocrEbpjId;
	}

	/**
	 * Set eocrEbpjId
	 */
	public void setEocrEbpjId(Long eocrEbpjId) {
		this.eocrEbpjId = eocrEbpjId;
		addValidField("eocrEbpjId");
	}

	/**
	 * Get eocrLoEbppId
	 */
	@Column(name = "EOCR_LO_EBPP_ID")
	public Long getEocrLoEbppId() {
		return eocrLoEbppId;
	}

	/**
	 * Set eocrLoEbppId
	 */
	public void setEocrLoEbppId(Long eocrLoEbppId) {
		this.eocrLoEbppId = eocrLoEbppId;
		addValidField("eocrLoEbppId");
	}

	/**
	 * Get eocrEbtkId
	 */
	@Column(name = "EOCR_EBTK_ID")
	public Long getEocrEbtkId() {
		return eocrEbtkId;
	}

	/**
	 * Set eocrEbtkId
	 */
	public void setEocrEbtkId(Long eocrEbtkId) {
		this.eocrEbtkId = eocrEbtkId;
		addValidField("eocrEbtkId");
	}

	/**
	 * Get eocrIsAutomatic
	 */
	@Column(name = "EOCR_IS_AUTOMATIC")
	public String getEocrIsAutomatic() {
		return eocrIsAutomatic;
	}

	/**
	 * Set eocrIsAutomatic
	 */
	public void setEocrIsAutomatic(String eocrIsAutomatic) {
		this.eocrIsAutomatic = eocrIsAutomatic;
		addValidField("eocrIsAutomatic");
	}

	/**
	 * Get eocrTaskStatus
	 */
	@Column(name = "EOCR_TASK_STATUS")
	public String getEocrTaskStatus() {
		return eocrTaskStatus;
	}

	/**
	 * Set eocrTaskStatus
	 */
	public void setEocrTaskStatus(String eocrTaskStatus) {
		this.eocrTaskStatus = eocrTaskStatus;
		addValidField("eocrTaskStatus");
	}

	/**
	 * Get eocrTaskFeedback
	 */
	@Column(name = "EOCR_TASK_FEEDBACK")
	public String getEocrTaskFeedback() {
		return eocrTaskFeedback;
	}

	/**
	 * Set eocrTaskFeedback
	 */
	public void setEocrTaskFeedback(String eocrTaskFeedback) {
		this.eocrTaskFeedback = eocrTaskFeedback;
		addValidField("eocrTaskFeedback");
	}

	/**
	 * Get eocrSysCode
	 */
	@Column(name = "EOCR_SYS_CODE")
	public String getEocrSysCode() {
		return eocrSysCode;
	}

	/**
	 * Set eocrSysCode
	 */
	public void setEocrSysCode(String eocrSysCode) {
		this.eocrSysCode = eocrSysCode;
		addValidField("eocrSysCode");
	}

	/**
	 * Get eocrEbbuId
	 */
	@Column(name = "EOCR_EBBU_ID")
	public Long getEocrEbbuId() {
		return eocrEbbuId;
	}

	/**
	 * Set eocrEbbuId
	 */
	public void setEocrEbbuId(Long eocrEbbuId) {
		this.eocrEbbuId = eocrEbbuId;
		addValidField("eocrEbbuId");
	}

	/**
	 * Get eocrEbbuNameCn
	 */
	@Column(name = "EOCR_EBBU_NAME_CN")
	public String getEocrEbbuNameCn() {
		return eocrEbbuNameCn;
	}

	/**
	 * Set eocrEbbuNameCn
	 */
	public void setEocrEbbuNameCn(String eocrEbbuNameCn) {
		this.eocrEbbuNameCn = eocrEbbuNameCn;
		addValidField("eocrEbbuNameCn");
	}

	/**
	 * Get eocrEbbuCode
	 */
	@Column(name = "EOCR_EBBU_CODE")
	public String getEocrEbbuCode() {
		return eocrEbbuCode;
	}

	/**
	 * Set eocrEbbuCode
	 */
	public void setEocrEbbuCode(String eocrEbbuCode) {
		this.eocrEbbuCode = eocrEbbuCode;
		addValidField("eocrEbbuCode");
	}

	/**
	 * Get eocrEbbuDist1
	 */
	@Column(name = "EOCR_EBBU_DIST_1")
	public String getEocrEbbuDist1() {
		return eocrEbbuDist1;
	}

	/**
	 * Set eocrEbbuDist1
	 */
	public void setEocrEbbuDist1(String eocrEbbuDist1) {
		this.eocrEbbuDist1 = eocrEbbuDist1;
		addValidField("eocrEbbuDist1");
	}

	/**
	 * Get eocrEbbuDist2
	 */
	@Column(name = "EOCR_EBBU_DIST_2")
	public String getEocrEbbuDist2() {
		return eocrEbbuDist2;
	}

	/**
	 * Set eocrEbbuDist2
	 */
	public void setEocrEbbuDist2(String eocrEbbuDist2) {
		this.eocrEbbuDist2 = eocrEbbuDist2;
		addValidField("eocrEbbuDist2");
	}

	/**
	 * Get eocrEbbuDist3
	 */
	@Column(name = "EOCR_EBBU_DIST_3")
	public String getEocrEbbuDist3() {
		return eocrEbbuDist3;
	}

	/**
	 * Set eocrEbbuDist3
	 */
	public void setEocrEbbuDist3(String eocrEbbuDist3) {
		this.eocrEbbuDist3 = eocrEbbuDist3;
		addValidField("eocrEbbuDist3");
	}

	/**
	 * Get eocrEbbuDist4
	 */
	@Column(name = "EOCR_EBBU_DIST_4")
	public String getEocrEbbuDist4() {
		return eocrEbbuDist4;
	}

	/**
	 * Set eocrEbbuDist4
	 */
	public void setEocrEbbuDist4(String eocrEbbuDist4) {
		this.eocrEbbuDist4 = eocrEbbuDist4;
		addValidField("eocrEbbuDist4");
	}

	/**
	 * Get eocrEbbuDist5
	 */
	@Column(name = "EOCR_EBBU_DIST_5")
	public String getEocrEbbuDist5() {
		return eocrEbbuDist5;
	}

	/**
	 * Set eocrEbbuDist5
	 */
	public void setEocrEbbuDist5(String eocrEbbuDist5) {
		this.eocrEbbuDist5 = eocrEbbuDist5;
		addValidField("eocrEbbuDist5");
	}

	/**
	 * Get eocrToId
	 */
	@Column(name = "EOCR_TO_ID")
	public String getEocrToId() {
		return eocrToId;
	}

	/**
	 * Set eocrToId
	 */
	public void setEocrToId(String eocrToId) {
		this.eocrToId = eocrToId;
		addValidField("eocrToId");
	}

	/**
	 * Get eocrNo
	 */
	@Column(name = "EOCR_NO")
	public String getEocrNo() {
		return eocrNo;
	}

	/**
	 * Set eocrNo
	 */
	public void setEocrNo(String eocrNo) {
		this.eocrNo = eocrNo;
		addValidField("eocrNo");
	}

	/**
	 * Get eocrType
	 */
	@Column(name = "EOCR_TYPE")
	public String getEocrType() {
		return eocrType;
	}

	/**
	 * Set eocrType
	 */
	public void setEocrType(String eocrType) {
		this.eocrType = eocrType;
		addValidField("eocrType");
	}

	/**
	 * Get eocrStatus
	 */
	@Column(name = "EOCR_STATUS")
	public String getEocrStatus() {
		return eocrStatus;
	}

	/**
	 * Set eocrStatus
	 */
	public void setEocrStatus(String eocrStatus) {
		this.eocrStatus = eocrStatus;
		addValidField("eocrStatus");
	}

	/**
	 * Get eocrOrder
	 */
	@Column(name = "EOCR_ORDER")
	public Long getEocrOrder() {
		return eocrOrder;
	}

	/**
	 * Set eocrOrder
	 */
	public void setEocrOrder(Long eocrOrder) {
		this.eocrOrder = eocrOrder;
		addValidField("eocrOrder");
	}

	/**
	 * Get eocrSoNo
	 */
	@Column(name = "EOCR_SO_NO")
	public String getEocrSoNo() {
		return eocrSoNo;
	}

	/**
	 * Set eocrSoNo
	 */
	public void setEocrSoNo(String eocrSoNo) {
		this.eocrSoNo = eocrSoNo;
		addValidField("eocrSoNo");
	}

	/**
	 * Get eocrDoNo
	 */
	@Column(name = "EOCR_DO_NO")
	public String getEocrDoNo() {
		return eocrDoNo;
	}

	/**
	 * Set eocrDoNo
	 */
	public void setEocrDoNo(String eocrDoNo) {
		this.eocrDoNo = eocrDoNo;
		addValidField("eocrDoNo");
	}

	/**
	 * Get eocrConsignorEbcuId
	 */
	@Column(name = "EOCR_CONSIGNOR_EBCU_ID")
	public Long getEocrConsignorEbcuId() {
		return eocrConsignorEbcuId;
	}

	/**
	 * Set eocrConsignorEbcuId
	 */
	public void setEocrConsignorEbcuId(Long eocrConsignorEbcuId) {
		this.eocrConsignorEbcuId = eocrConsignorEbcuId;
		addValidField("eocrConsignorEbcuId");
	}

	/**
	 * Get eocrConsignorEbcuCode
	 */
	@Column(name = "EOCR_CONSIGNOR_EBCU_CODE")
	public String getEocrConsignorEbcuCode() {
		return eocrConsignorEbcuCode;
	}

	/**
	 * Set eocrConsignorEbcuCode
	 */
	public void setEocrConsignorEbcuCode(String eocrConsignorEbcuCode) {
		this.eocrConsignorEbcuCode = eocrConsignorEbcuCode;
		addValidField("eocrConsignorEbcuCode");
	}

	/**
	 * Get eocrConsignorEbcuName
	 */
	@Column(name = "EOCR_CONSIGNOR_EBCU_NAME")
	public String getEocrConsignorEbcuName() {
		return eocrConsignorEbcuName;
	}

	/**
	 * Set eocrConsignorEbcuName
	 */
	public void setEocrConsignorEbcuName(String eocrConsignorEbcuName) {
		this.eocrConsignorEbcuName = eocrConsignorEbcuName;
		addValidField("eocrConsignorEbcuName");
	}

	/**
	 * Get eocrOwnerEbcuId
	 */
	@Column(name = "EOCR_OWNER_EBCU_ID")
	public Long getEocrOwnerEbcuId() {
		return eocrOwnerEbcuId;
	}

	/**
	 * Set eocrOwnerEbcuId
	 */
	public void setEocrOwnerEbcuId(Long eocrOwnerEbcuId) {
		this.eocrOwnerEbcuId = eocrOwnerEbcuId;
		addValidField("eocrOwnerEbcuId");
	}

	/**
	 * Get eocrOwnerEbcuCode
	 */
	@Column(name = "EOCR_OWNER_EBCU_CODE")
	public String getEocrOwnerEbcuCode() {
		return eocrOwnerEbcuCode;
	}

	/**
	 * Set eocrOwnerEbcuCode
	 */
	public void setEocrOwnerEbcuCode(String eocrOwnerEbcuCode) {
		this.eocrOwnerEbcuCode = eocrOwnerEbcuCode;
		addValidField("eocrOwnerEbcuCode");
	}

	/**
	 * Get eocrOwnerEbcuName
	 */
	@Column(name = "EOCR_OWNER_EBCU_NAME")
	public String getEocrOwnerEbcuName() {
		return eocrOwnerEbcuName;
	}

	/**
	 * Set eocrOwnerEbcuName
	 */
	public void setEocrOwnerEbcuName(String eocrOwnerEbcuName) {
		this.eocrOwnerEbcuName = eocrOwnerEbcuName;
		addValidField("eocrOwnerEbcuName");
	}

	/**
	 * Get eocrShipperConsignNo
	 */
	@Column(name = "EOCR_SHIPPER_CONSIGN_NO")
	public String getEocrShipperConsignNo() {
		return eocrShipperConsignNo;
	}

	/**
	 * Set eocrShipperConsignNo
	 */
	public void setEocrShipperConsignNo(String eocrShipperConsignNo) {
		this.eocrShipperConsignNo = eocrShipperConsignNo;
		addValidField("eocrShipperConsignNo");
	}

	/**
	 * Get eocrMblNo
	 */
	@Column(name = "EOCR_MBL_NO")
	public String getEocrMblNo() {
		return eocrMblNo;
	}

	/**
	 * Set eocrMblNo
	 */
	public void setEocrMblNo(String eocrMblNo) {
		this.eocrMblNo = eocrMblNo;
		addValidField("eocrMblNo");
	}

	/**
	 * Get eocrHblNo
	 */
	@Column(name = "EOCR_HBL_NO")
	public String getEocrHblNo() {
		return eocrHblNo;
	}

	/**
	 * Set eocrHblNo
	 */
	public void setEocrHblNo(String eocrHblNo) {
		this.eocrHblNo = eocrHblNo;
		addValidField("eocrHblNo");
	}

	/**
	 * Get eocrContainerTypeWeight
	 */
	@Column(name = "EOCR_CONTAINER_TYPE_WEIGHT")
	public String getEocrContainerTypeWeight() {
		return eocrContainerTypeWeight;
	}

	/**
	 * Set eocrContainerTypeWeight
	 */
	public void setEocrContainerTypeWeight(String eocrContainerTypeWeight) {
		this.eocrContainerTypeWeight = eocrContainerTypeWeight;
		addValidField("eocrContainerTypeWeight");
	}

	/**
	 * Get eocrQuantity
	 */
	@Column(name = "EOCR_QUANTITY")
	public Long getEocrQuantity() {
		return eocrQuantity;
	}

	/**
	 * Set eocrQuantity
	 */
	public void setEocrQuantity(Long eocrQuantity) {
		this.eocrQuantity = eocrQuantity;
		addValidField("eocrQuantity");
	}

	/**
	 * Get eocrVolume
	 */
	@Column(name = "EOCR_VOLUME")
	public Long getEocrVolume() {
		return eocrVolume;
	}

	/**
	 * Set eocrVolume
	 */
	public void setEocrVolume(Long eocrVolume) {
		this.eocrVolume = eocrVolume;
		addValidField("eocrVolume");
	}

	/**
	 * Get eocrGw
	 */
	@Column(name = "EOCR_GW")
	public Long getEocrGw() {
		return eocrGw;
	}

	/**
	 * Set eocrGw
	 */
	public void setEocrGw(Long eocrGw) {
		this.eocrGw = eocrGw;
		addValidField("eocrGw");
	}

	/**
	 * Get eocrNw
	 */
	@Column(name = "EOCR_NW")
	public Long getEocrNw() {
		return eocrNw;
	}

	/**
	 * Set eocrNw
	 */
	public void setEocrNw(Long eocrNw) {
		this.eocrNw = eocrNw;
		addValidField("eocrNw");
	}

	/**
	 * Get eocrTankType
	 */
	@Column(name = "EOCR_TANK_TYPE")
	public String getEocrTankType() {
		return eocrTankType;
	}

	/**
	 * Set eocrTankType
	 */
	public void setEocrTankType(String eocrTankType) {
		this.eocrTankType = eocrTankType;
		addValidField("eocrTankType");
	}

	/**
	 * Get eocrCarrierEbcuId
	 */
	@Column(name = "EOCR_CARRIER_EBCU_ID")
	public Long getEocrCarrierEbcuId() {
		return eocrCarrierEbcuId;
	}

	/**
	 * Set eocrCarrierEbcuId
	 */
	public void setEocrCarrierEbcuId(Long eocrCarrierEbcuId) {
		this.eocrCarrierEbcuId = eocrCarrierEbcuId;
		addValidField("eocrCarrierEbcuId");
	}

	/**
	 * Get eocrCarrierEbcuCode
	 */
	@Column(name = "EOCR_CARRIER_EBCU_CODE")
	public String getEocrCarrierEbcuCode() {
		return eocrCarrierEbcuCode;
	}

	/**
	 * Set eocrCarrierEbcuCode
	 */
	public void setEocrCarrierEbcuCode(String eocrCarrierEbcuCode) {
		this.eocrCarrierEbcuCode = eocrCarrierEbcuCode;
		addValidField("eocrCarrierEbcuCode");
	}

	/**
	 * Get eocrCarrierEbcuName
	 */
	@Column(name = "EOCR_CARRIER_EBCU_NAME")
	public String getEocrCarrierEbcuName() {
		return eocrCarrierEbcuName;
	}

	/**
	 * Set eocrCarrierEbcuName
	 */
	public void setEocrCarrierEbcuName(String eocrCarrierEbcuName) {
		this.eocrCarrierEbcuName = eocrCarrierEbcuName;
		addValidField("eocrCarrierEbcuName");
	}

	/**
	 * Get eocrVessel
	 */
	@Column(name = "EOCR_VESSEL")
	public String getEocrVessel() {
		return eocrVessel;
	}

	/**
	 * Set eocrVessel
	 */
	public void setEocrVessel(String eocrVessel) {
		this.eocrVessel = eocrVessel;
		addValidField("eocrVessel");
	}

	/**
	 * Get eocrVoyage
	 */
	@Column(name = "EOCR_VOYAGE")
	public String getEocrVoyage() {
		return eocrVoyage;
	}

	/**
	 * Set eocrVoyage
	 */
	public void setEocrVoyage(String eocrVoyage) {
		this.eocrVoyage = eocrVoyage;
		addValidField("eocrVoyage");
	}

	/**
	 * Get eocrMode
	 */
	@Column(name = "EOCR_MODE")
	public String getEocrMode() {
		return eocrMode;
	}

	/**
	 * Set eocrMode
	 */
	public void setEocrMode(String eocrMode) {
		this.eocrMode = eocrMode;
		addValidField("eocrMode");
	}

	/**
	 * Get eocrStartEbptId
	 */
	@Column(name = "EOCR_START_EBPT_ID")
	public Long getEocrStartEbptId() {
		return eocrStartEbptId;
	}

	/**
	 * Set eocrStartEbptId
	 */
	public void setEocrStartEbptId(Long eocrStartEbptId) {
		this.eocrStartEbptId = eocrStartEbptId;
		addValidField("eocrStartEbptId");
	}

	/**
	 * Get eocrStartEbptNo
	 */
	@Column(name = "EOCR_START_EBPT_NO")
	public String getEocrStartEbptNo() {
		return eocrStartEbptNo;
	}

	/**
	 * Set eocrStartEbptNo
	 */
	public void setEocrStartEbptNo(String eocrStartEbptNo) {
		this.eocrStartEbptNo = eocrStartEbptNo;
		addValidField("eocrStartEbptNo");
	}

	/**
	 * Get eocrStartEbptNameCn
	 */
	@Column(name = "EOCR_START_EBPT_NAME_CN")
	public String getEocrStartEbptNameCn() {
		return eocrStartEbptNameCn;
	}

	/**
	 * Set eocrStartEbptNameCn
	 */
	public void setEocrStartEbptNameCn(String eocrStartEbptNameCn) {
		this.eocrStartEbptNameCn = eocrStartEbptNameCn;
		addValidField("eocrStartEbptNameCn");
	}

	/**
	 * Get eocrEndEbptId
	 */
	@Column(name = "EOCR_END_EBPT_ID")
	public Long getEocrEndEbptId() {
		return eocrEndEbptId;
	}

	/**
	 * Set eocrEndEbptId
	 */
	public void setEocrEndEbptId(Long eocrEndEbptId) {
		this.eocrEndEbptId = eocrEndEbptId;
		addValidField("eocrEndEbptId");
	}

	/**
	 * Get eocrEndEbptNo
	 */
	@Column(name = "EOCR_END_EBPT_NO")
	public String getEocrEndEbptNo() {
		return eocrEndEbptNo;
	}

	/**
	 * Set eocrEndEbptNo
	 */
	public void setEocrEndEbptNo(String eocrEndEbptNo) {
		this.eocrEndEbptNo = eocrEndEbptNo;
		addValidField("eocrEndEbptNo");
	}

	/**
	 * Get eocrEndEbptNameCn
	 */
	@Column(name = "EOCR_END_EBPT_NAME_CN")
	public String getEocrEndEbptNameCn() {
		return eocrEndEbptNameCn;
	}

	/**
	 * Set eocrEndEbptNameCn
	 */
	public void setEocrEndEbptNameCn(String eocrEndEbptNameCn) {
		this.eocrEndEbptNameCn = eocrEndEbptNameCn;
		addValidField("eocrEndEbptNameCn");
	}

	/**
	 * Get eocrAtd
	 */
	@Column(name = "EOCR_ATD")
	public Date getEocrAtd() {
		return eocrAtd;
	}

	/**
	 * Set eocrAtd
	 */
	public void setEocrAtd(Date eocrAtd) {
		this.eocrAtd = eocrAtd;
		addValidField("eocrAtd");
	}

	/**
	 * Get eocrAta
	 */
	@Column(name = "EOCR_ATA")
	public Date getEocrAta() {
		return eocrAta;
	}

	/**
	 * Set eocrAta
	 */
	public void setEocrAta(Date eocrAta) {
		this.eocrAta = eocrAta;
		addValidField("eocrAta");
	}

	/**
	 * Get eocrPlanFetchDate
	 */
	@Column(name = "EOCR_PLAN_FETCH_DATE")
	public Date getEocrPlanFetchDate() {
		return eocrPlanFetchDate;
	}

	/**
	 * Set eocrPlanFetchDate
	 */
	public void setEocrPlanFetchDate(Date eocrPlanFetchDate) {
		this.eocrPlanFetchDate = eocrPlanFetchDate;
		addValidField("eocrPlanFetchDate");
	}

	/**
	 * Get eocrFetchYardEbcuId
	 */
	@Column(name = "EOCR_FETCH_YARD_EBCU_ID")
	public Long getEocrFetchYardEbcuId() {
		return eocrFetchYardEbcuId;
	}

	/**
	 * Set eocrFetchYardEbcuId
	 */
	public void setEocrFetchYardEbcuId(Long eocrFetchYardEbcuId) {
		this.eocrFetchYardEbcuId = eocrFetchYardEbcuId;
		addValidField("eocrFetchYardEbcuId");
	}

	/**
	 * Get eocrFetchYardEbcuCode
	 */
	@Column(name = "EOCR_FETCH_YARD_EBCU_CODE")
	public String getEocrFetchYardEbcuCode() {
		return eocrFetchYardEbcuCode;
	}

	/**
	 * Set eocrFetchYardEbcuCode
	 */
	public void setEocrFetchYardEbcuCode(String eocrFetchYardEbcuCode) {
		this.eocrFetchYardEbcuCode = eocrFetchYardEbcuCode;
		addValidField("eocrFetchYardEbcuCode");
	}

	/**
	 * Get eocrFetchYardEbcuName
	 */
	@Column(name = "EOCR_FETCH_YARD_EBCU_NAME")
	public String getEocrFetchYardEbcuName() {
		return eocrFetchYardEbcuName;
	}

	/**
	 * Set eocrFetchYardEbcuName
	 */
	public void setEocrFetchYardEbcuName(String eocrFetchYardEbcuName) {
		this.eocrFetchYardEbcuName = eocrFetchYardEbcuName;
		addValidField("eocrFetchYardEbcuName");
	}

	/**
	 * Get eocrFetchYardContact
	 */
	@Column(name = "EOCR_FETCH_YARD_CONTACT")
	public String getEocrFetchYardContact() {
		return eocrFetchYardContact;
	}

	/**
	 * Set eocrFetchYardContact
	 */
	public void setEocrFetchYardContact(String eocrFetchYardContact) {
		this.eocrFetchYardContact = eocrFetchYardContact;
		addValidField("eocrFetchYardContact");
	}

	/**
	 * Get eocrFetchYardMobile
	 */
	@Column(name = "EOCR_FETCH_YARD_MOBILE")
	public String getEocrFetchYardMobile() {
		return eocrFetchYardMobile;
	}

	/**
	 * Set eocrFetchYardMobile
	 */
	public void setEocrFetchYardMobile(String eocrFetchYardMobile) {
		this.eocrFetchYardMobile = eocrFetchYardMobile;
		addValidField("eocrFetchYardMobile");
	}

	/**
	 * Get eocrFetchYardAddress
	 */
	@Column(name = "EOCR_FETCH_YARD_ADDRESS")
	public String getEocrFetchYardAddress() {
		return eocrFetchYardAddress;
	}

	/**
	 * Set eocrFetchYardAddress
	 */
	public void setEocrFetchYardAddress(String eocrFetchYardAddress) {
		this.eocrFetchYardAddress = eocrFetchYardAddress;
		addValidField("eocrFetchYardAddress");
	}

	/**
	 * Get eocrFetchTeamEbcuId
	 */
	@Column(name = "EOCR_FETCH_TEAM_EBCU_ID")
	public Long getEocrFetchTeamEbcuId() {
		return eocrFetchTeamEbcuId;
	}

	/**
	 * Set eocrFetchTeamEbcuId
	 */
	public void setEocrFetchTeamEbcuId(Long eocrFetchTeamEbcuId) {
		this.eocrFetchTeamEbcuId = eocrFetchTeamEbcuId;
		addValidField("eocrFetchTeamEbcuId");
	}

	/**
	 * Get eocrFetchTeamEbcuCode
	 */
	@Column(name = "EOCR_FETCH_TEAM_EBCU_CODE")
	public String getEocrFetchTeamEbcuCode() {
		return eocrFetchTeamEbcuCode;
	}

	/**
	 * Set eocrFetchTeamEbcuCode
	 */
	public void setEocrFetchTeamEbcuCode(String eocrFetchTeamEbcuCode) {
		this.eocrFetchTeamEbcuCode = eocrFetchTeamEbcuCode;
		addValidField("eocrFetchTeamEbcuCode");
	}

	/**
	 * Get eocrFetchTeamContact
	 */
	@Column(name = "EOCR_FETCH_TEAM_CONTACT")
	public String getEocrFetchTeamContact() {
		return eocrFetchTeamContact;
	}

	/**
	 * Set eocrFetchTeamContact
	 */
	public void setEocrFetchTeamContact(String eocrFetchTeamContact) {
		this.eocrFetchTeamContact = eocrFetchTeamContact;
		addValidField("eocrFetchTeamContact");
	}

	/**
	 * Get eocrFetchTeamMobile
	 */
	@Column(name = "EOCR_FETCH_TEAM_MOBILE")
	public String getEocrFetchTeamMobile() {
		return eocrFetchTeamMobile;
	}

	/**
	 * Set eocrFetchTeamMobile
	 */
	public void setEocrFetchTeamMobile(String eocrFetchTeamMobile) {
		this.eocrFetchTeamMobile = eocrFetchTeamMobile;
		addValidField("eocrFetchTeamMobile");
	}

	/**
	 * Get eocrPlanReturnDate
	 */
	@Column(name = "EOCR_PLAN_RETURN_DATE")
	public Date getEocrPlanReturnDate() {
		return eocrPlanReturnDate;
	}

	/**
	 * Set eocrPlanReturnDate
	 */
	public void setEocrPlanReturnDate(Date eocrPlanReturnDate) {
		this.eocrPlanReturnDate = eocrPlanReturnDate;
		addValidField("eocrPlanReturnDate");
	}

	/**
	 * Get eocrReturnYardEbcuId
	 */
	@Column(name = "EOCR_RETURN_YARD_EBCU_ID")
	public Long getEocrReturnYardEbcuId() {
		return eocrReturnYardEbcuId;
	}

	/**
	 * Set eocrReturnYardEbcuId
	 */
	public void setEocrReturnYardEbcuId(Long eocrReturnYardEbcuId) {
		this.eocrReturnYardEbcuId = eocrReturnYardEbcuId;
		addValidField("eocrReturnYardEbcuId");
	}

	/**
	 * Get eocrReturnYardEbcuCode
	 */
	@Column(name = "EOCR_RETURN_YARD_EBCU_CODE")
	public String getEocrReturnYardEbcuCode() {
		return eocrReturnYardEbcuCode;
	}

	/**
	 * Set eocrReturnYardEbcuCode
	 */
	public void setEocrReturnYardEbcuCode(String eocrReturnYardEbcuCode) {
		this.eocrReturnYardEbcuCode = eocrReturnYardEbcuCode;
		addValidField("eocrReturnYardEbcuCode");
	}

	/**
	 * Get eocrReturnYardEbcuName
	 */
	@Column(name = "EOCR_RETURN_YARD_EBCU_NAME")
	public String getEocrReturnYardEbcuName() {
		return eocrReturnYardEbcuName;
	}

	/**
	 * Set eocrReturnYardEbcuName
	 */
	public void setEocrReturnYardEbcuName(String eocrReturnYardEbcuName) {
		this.eocrReturnYardEbcuName = eocrReturnYardEbcuName;
		addValidField("eocrReturnYardEbcuName");
	}

	/**
	 * Get eocrReturnYardContact
	 */
	@Column(name = "EOCR_RETURN_YARD_CONTACT")
	public String getEocrReturnYardContact() {
		return eocrReturnYardContact;
	}

	/**
	 * Set eocrReturnYardContact
	 */
	public void setEocrReturnYardContact(String eocrReturnYardContact) {
		this.eocrReturnYardContact = eocrReturnYardContact;
		addValidField("eocrReturnYardContact");
	}

	/**
	 * Get eocrReturnYardMobile
	 */
	@Column(name = "EOCR_RETURN_YARD_MOBILE")
	public String getEocrReturnYardMobile() {
		return eocrReturnYardMobile;
	}

	/**
	 * Set eocrReturnYardMobile
	 */
	public void setEocrReturnYardMobile(String eocrReturnYardMobile) {
		this.eocrReturnYardMobile = eocrReturnYardMobile;
		addValidField("eocrReturnYardMobile");
	}

	/**
	 * Get eocrReturnYardAddress
	 */
	@Column(name = "EOCR_RETURN_YARD_ADDRESS")
	public String getEocrReturnYardAddress() {
		return eocrReturnYardAddress;
	}

	/**
	 * Set eocrReturnYardAddress
	 */
	public void setEocrReturnYardAddress(String eocrReturnYardAddress) {
		this.eocrReturnYardAddress = eocrReturnYardAddress;
		addValidField("eocrReturnYardAddress");
	}

	/**
	 * Get eocrReturnTeamEbcuId
	 */
	@Column(name = "EOCR_RETURN_TEAM_EBCU_ID")
	public Long getEocrReturnTeamEbcuId() {
		return eocrReturnTeamEbcuId;
	}

	/**
	 * Set eocrReturnTeamEbcuId
	 */
	public void setEocrReturnTeamEbcuId(Long eocrReturnTeamEbcuId) {
		this.eocrReturnTeamEbcuId = eocrReturnTeamEbcuId;
		addValidField("eocrReturnTeamEbcuId");
	}

	/**
	 * Get eocrReturnTeamEbcuCode
	 */
	@Column(name = "EOCR_RETURN_TEAM_EBCU_CODE")
	public String getEocrReturnTeamEbcuCode() {
		return eocrReturnTeamEbcuCode;
	}

	/**
	 * Set eocrReturnTeamEbcuCode
	 */
	public void setEocrReturnTeamEbcuCode(String eocrReturnTeamEbcuCode) {
		this.eocrReturnTeamEbcuCode = eocrReturnTeamEbcuCode;
		addValidField("eocrReturnTeamEbcuCode");
	}

	/**
	 * Get eocrReturnTeamContact
	 */
	@Column(name = "EOCR_RETURN_TEAM_CONTACT")
	public String getEocrReturnTeamContact() {
		return eocrReturnTeamContact;
	}

	/**
	 * Set eocrReturnTeamContact
	 */
	public void setEocrReturnTeamContact(String eocrReturnTeamContact) {
		this.eocrReturnTeamContact = eocrReturnTeamContact;
		addValidField("eocrReturnTeamContact");
	}

	/**
	 * Get eocrReturnTeamMobile
	 */
	@Column(name = "EOCR_RETURN_TEAM_MOBILE")
	public String getEocrReturnTeamMobile() {
		return eocrReturnTeamMobile;
	}

	/**
	 * Set eocrReturnTeamMobile
	 */
	public void setEocrReturnTeamMobile(String eocrReturnTeamMobile) {
		this.eocrReturnTeamMobile = eocrReturnTeamMobile;
		addValidField("eocrReturnTeamMobile");
	}

	/**
	 * Get eocrAgentEbcuId
	 */
	@Column(name = "EOCR_AGENT_EBCU_ID")
	public Long getEocrAgentEbcuId() {
		return eocrAgentEbcuId;
	}

	/**
	 * Set eocrAgentEbcuId
	 */
	public void setEocrAgentEbcuId(Long eocrAgentEbcuId) {
		this.eocrAgentEbcuId = eocrAgentEbcuId;
		addValidField("eocrAgentEbcuId");
	}

	/**
	 * Get eocrAgentEbcuCode
	 */
	@Column(name = "EOCR_AGENT_EBCU_CODE")
	public String getEocrAgentEbcuCode() {
		return eocrAgentEbcuCode;
	}

	/**
	 * Set eocrAgentEbcuCode
	 */
	public void setEocrAgentEbcuCode(String eocrAgentEbcuCode) {
		this.eocrAgentEbcuCode = eocrAgentEbcuCode;
		addValidField("eocrAgentEbcuCode");
	}

	/**
	 * Get eocrExternalOrderNo
	 */
	@Column(name = "EOCR_EXTERNAL_ORDER_NO")
	public String getEocrExternalOrderNo() {
		return eocrExternalOrderNo;
	}

	/**
	 * Set eocrExternalOrderNo
	 */
	public void setEocrExternalOrderNo(String eocrExternalOrderNo) {
		this.eocrExternalOrderNo = eocrExternalOrderNo;
		addValidField("eocrExternalOrderNo");
	}

	/**
	 * Get eocrCauseDelay
	 */
	@Column(name = "EOCR_CAUSE_DELAY")
	public String getEocrCauseDelay() {
		return eocrCauseDelay;
	}

	/**
	 * Set eocrCauseDelay
	 */
	public void setEocrCauseDelay(String eocrCauseDelay) {
		this.eocrCauseDelay = eocrCauseDelay;
		addValidField("eocrCauseDelay");
	}

	/**
	 * Get eocrRemark
	 */
	@Column(name = "EOCR_REMARK")
	public String getEocrRemark() {
		return eocrRemark;
	}

	/**
	 * Set eocrRemark
	 */
	public void setEocrRemark(String eocrRemark) {
		this.eocrRemark = eocrRemark;
		addValidField("eocrRemark");
	}

	/**
	 * Get eocrSubstr1
	 */
	@Column(name = "EOCR_SUBSTR1")
	public String getEocrSubstr1() {
		return eocrSubstr1;
	}

	/**
	 * Set eocrSubstr1
	 */
	public void setEocrSubstr1(String eocrSubstr1) {
		this.eocrSubstr1 = eocrSubstr1;
		addValidField("eocrSubstr1");
	}

	/**
	 * Get eocrSubstr2
	 */
	@Column(name = "EOCR_SUBSTR2")
	public String getEocrSubstr2() {
		return eocrSubstr2;
	}

	/**
	 * Set eocrSubstr2
	 */
	public void setEocrSubstr2(String eocrSubstr2) {
		this.eocrSubstr2 = eocrSubstr2;
		addValidField("eocrSubstr2");
	}

	/**
	 * Get eocrSubstr3
	 */
	@Column(name = "EOCR_SUBSTR3")
	public String getEocrSubstr3() {
		return eocrSubstr3;
	}

	/**
	 * Set eocrSubstr3
	 */
	public void setEocrSubstr3(String eocrSubstr3) {
		this.eocrSubstr3 = eocrSubstr3;
		addValidField("eocrSubstr3");
	}

	/**
	 * Get eocrSubstr4
	 */
	@Column(name = "EOCR_SUBSTR4")
	public String getEocrSubstr4() {
		return eocrSubstr4;
	}

	/**
	 * Set eocrSubstr4
	 */
	public void setEocrSubstr4(String eocrSubstr4) {
		this.eocrSubstr4 = eocrSubstr4;
		addValidField("eocrSubstr4");
	}

	/**
	 * Get eocrSubstr5
	 */
	@Column(name = "EOCR_SUBSTR5")
	public String getEocrSubstr5() {
		return eocrSubstr5;
	}

	/**
	 * Set eocrSubstr5
	 */
	public void setEocrSubstr5(String eocrSubstr5) {
		this.eocrSubstr5 = eocrSubstr5;
		addValidField("eocrSubstr5");
	}

	/**
	 * Get eocrSubstr6
	 */
	@Column(name = "EOCR_SUBSTR6")
	public String getEocrSubstr6() {
		return eocrSubstr6;
	}

	/**
	 * Set eocrSubstr6
	 */
	public void setEocrSubstr6(String eocrSubstr6) {
		this.eocrSubstr6 = eocrSubstr6;
		addValidField("eocrSubstr6");
	}

	/**
	 * Get eocrSubstr7
	 */
	@Column(name = "EOCR_SUBSTR7")
	public String getEocrSubstr7() {
		return eocrSubstr7;
	}

	/**
	 * Set eocrSubstr7
	 */
	public void setEocrSubstr7(String eocrSubstr7) {
		this.eocrSubstr7 = eocrSubstr7;
		addValidField("eocrSubstr7");
	}

	/**
	 * Get eocrSubstr8
	 */
	@Column(name = "EOCR_SUBSTR8")
	public String getEocrSubstr8() {
		return eocrSubstr8;
	}

	/**
	 * Set eocrSubstr8
	 */
	public void setEocrSubstr8(String eocrSubstr8) {
		this.eocrSubstr8 = eocrSubstr8;
		addValidField("eocrSubstr8");
	}

	/**
	 * Get eocrSubstr9
	 */
	@Column(name = "EOCR_SUBSTR9")
	public String getEocrSubstr9() {
		return eocrSubstr9;
	}

	/**
	 * Set eocrSubstr9
	 */
	public void setEocrSubstr9(String eocrSubstr9) {
		this.eocrSubstr9 = eocrSubstr9;
		addValidField("eocrSubstr9");
	}

	/**
	 * Get eocrSubstr10
	 */
	@Column(name = "EOCR_SUBSTR10")
	public String getEocrSubstr10() {
		return eocrSubstr10;
	}

	/**
	 * Set eocrSubstr10
	 */
	public void setEocrSubstr10(String eocrSubstr10) {
		this.eocrSubstr10 = eocrSubstr10;
		addValidField("eocrSubstr10");
	}

	/**
	 * Get eocrSubstr11
	 */
	@Column(name = "EOCR_SUBSTR11")
	public String getEocrSubstr11() {
		return eocrSubstr11;
	}

	/**
	 * Set eocrSubstr11
	 */
	public void setEocrSubstr11(String eocrSubstr11) {
		this.eocrSubstr11 = eocrSubstr11;
		addValidField("eocrSubstr11");
	}

	/**
	 * Get eocrSubstr12
	 */
	@Column(name = "EOCR_SUBSTR12")
	public String getEocrSubstr12() {
		return eocrSubstr12;
	}

	/**
	 * Set eocrSubstr12
	 */
	public void setEocrSubstr12(String eocrSubstr12) {
		this.eocrSubstr12 = eocrSubstr12;
		addValidField("eocrSubstr12");
	}

	/**
	 * Get eocrSubstr13
	 */
	@Column(name = "EOCR_SUBSTR13")
	public String getEocrSubstr13() {
		return eocrSubstr13;
	}

	/**
	 * Set eocrSubstr13
	 */
	public void setEocrSubstr13(String eocrSubstr13) {
		this.eocrSubstr13 = eocrSubstr13;
		addValidField("eocrSubstr13");
	}

	/**
	 * Get eocrSubstr14
	 */
	@Column(name = "EOCR_SUBSTR14")
	public String getEocrSubstr14() {
		return eocrSubstr14;
	}

	/**
	 * Set eocrSubstr14
	 */
	public void setEocrSubstr14(String eocrSubstr14) {
		this.eocrSubstr14 = eocrSubstr14;
		addValidField("eocrSubstr14");
	}

	/**
	 * Get eocrSubstr15
	 */
	@Column(name = "EOCR_SUBSTR15")
	public String getEocrSubstr15() {
		return eocrSubstr15;
	}

	/**
	 * Set eocrSubstr15
	 */
	public void setEocrSubstr15(String eocrSubstr15) {
		this.eocrSubstr15 = eocrSubstr15;
		addValidField("eocrSubstr15");
	}

	/**
	 * Get eocrSubstr16
	 */
	@Column(name = "EOCR_SUBSTR16")
	public String getEocrSubstr16() {
		return eocrSubstr16;
	}

	/**
	 * Set eocrSubstr16
	 */
	public void setEocrSubstr16(String eocrSubstr16) {
		this.eocrSubstr16 = eocrSubstr16;
		addValidField("eocrSubstr16");
	}

	/**
	 * Get eocrSubstr17
	 */
	@Column(name = "EOCR_SUBSTR17")
	public String getEocrSubstr17() {
		return eocrSubstr17;
	}

	/**
	 * Set eocrSubstr17
	 */
	public void setEocrSubstr17(String eocrSubstr17) {
		this.eocrSubstr17 = eocrSubstr17;
		addValidField("eocrSubstr17");
	}

	/**
	 * Get eocrSubstr18
	 */
	@Column(name = "EOCR_SUBSTR18")
	public String getEocrSubstr18() {
		return eocrSubstr18;
	}

	/**
	 * Set eocrSubstr18
	 */
	public void setEocrSubstr18(String eocrSubstr18) {
		this.eocrSubstr18 = eocrSubstr18;
		addValidField("eocrSubstr18");
	}

	/**
	 * Get eocrSubstr19
	 */
	@Column(name = "EOCR_SUBSTR19")
	public String getEocrSubstr19() {
		return eocrSubstr19;
	}

	/**
	 * Set eocrSubstr19
	 */
	public void setEocrSubstr19(String eocrSubstr19) {
		this.eocrSubstr19 = eocrSubstr19;
		addValidField("eocrSubstr19");
	}

	/**
	 * Get eocrSubstr20
	 */
	@Column(name = "EOCR_SUBSTR20")
	public String getEocrSubstr20() {
		return eocrSubstr20;
	}

	/**
	 * Set eocrSubstr20
	 */
	public void setEocrSubstr20(String eocrSubstr20) {
		this.eocrSubstr20 = eocrSubstr20;
		addValidField("eocrSubstr20");
	}

	/**
	 * Get eocrSubstr21
	 */
	@Column(name = "EOCR_SUBSTR21")
	public String getEocrSubstr21() {
		return eocrSubstr21;
	}

	/**
	 * Set eocrSubstr21
	 */
	public void setEocrSubstr21(String eocrSubstr21) {
		this.eocrSubstr21 = eocrSubstr21;
		addValidField("eocrSubstr21");
	}

	/**
	 * Get eocrSubstr22
	 */
	@Column(name = "EOCR_SUBSTR22")
	public String getEocrSubstr22() {
		return eocrSubstr22;
	}

	/**
	 * Set eocrSubstr22
	 */
	public void setEocrSubstr22(String eocrSubstr22) {
		this.eocrSubstr22 = eocrSubstr22;
		addValidField("eocrSubstr22");
	}

	/**
	 * Get eocrSubstr23
	 */
	@Column(name = "EOCR_SUBSTR23")
	public String getEocrSubstr23() {
		return eocrSubstr23;
	}

	/**
	 * Set eocrSubstr23
	 */
	public void setEocrSubstr23(String eocrSubstr23) {
		this.eocrSubstr23 = eocrSubstr23;
		addValidField("eocrSubstr23");
	}

	/**
	 * Get eocrSubstr24
	 */
	@Column(name = "EOCR_SUBSTR24")
	public String getEocrSubstr24() {
		return eocrSubstr24;
	}

	/**
	 * Set eocrSubstr24
	 */
	public void setEocrSubstr24(String eocrSubstr24) {
		this.eocrSubstr24 = eocrSubstr24;
		addValidField("eocrSubstr24");
	}

	/**
	 * Get eocrSubstr25
	 */
	@Column(name = "EOCR_SUBSTR25")
	public String getEocrSubstr25() {
		return eocrSubstr25;
	}

	/**
	 * Set eocrSubstr25
	 */
	public void setEocrSubstr25(String eocrSubstr25) {
		this.eocrSubstr25 = eocrSubstr25;
		addValidField("eocrSubstr25");
	}

	/**
	 * Get eocrSubdate1
	 */
	@Column(name = "EOCR_SUBDATE1")
	public Date getEocrSubdate1() {
		return eocrSubdate1;
	}

	/**
	 * Set eocrSubdate1
	 */
	public void setEocrSubdate1(Date eocrSubdate1) {
		this.eocrSubdate1 = eocrSubdate1;
		addValidField("eocrSubdate1");
	}

	/**
	 * Get eocrSubdate2
	 */
	@Column(name = "EOCR_SUBDATE2")
	public Date getEocrSubdate2() {
		return eocrSubdate2;
	}

	/**
	 * Set eocrSubdate2
	 */
	public void setEocrSubdate2(Date eocrSubdate2) {
		this.eocrSubdate2 = eocrSubdate2;
		addValidField("eocrSubdate2");
	}

	/**
	 * Get eocrSubdate3
	 */
	@Column(name = "EOCR_SUBDATE3")
	public Date getEocrSubdate3() {
		return eocrSubdate3;
	}

	/**
	 * Set eocrSubdate3
	 */
	public void setEocrSubdate3(Date eocrSubdate3) {
		this.eocrSubdate3 = eocrSubdate3;
		addValidField("eocrSubdate3");
	}

	/**
	 * Get eocrSubdate4
	 */
	@Column(name = "EOCR_SUBDATE4")
	public Date getEocrSubdate4() {
		return eocrSubdate4;
	}

	/**
	 * Set eocrSubdate4
	 */
	public void setEocrSubdate4(Date eocrSubdate4) {
		this.eocrSubdate4 = eocrSubdate4;
		addValidField("eocrSubdate4");
	}

	/**
	 * Get eocrSubdate5
	 */
	@Column(name = "EOCR_SUBDATE5")
	public Date getEocrSubdate5() {
		return eocrSubdate5;
	}

	/**
	 * Set eocrSubdate5
	 */
	public void setEocrSubdate5(Date eocrSubdate5) {
		this.eocrSubdate5 = eocrSubdate5;
		addValidField("eocrSubdate5");
	}

	/**
	 * Get eocrSubdate6
	 */
	@Column(name = "EOCR_SUBDATE6")
	public Date getEocrSubdate6() {
		return eocrSubdate6;
	}

	/**
	 * Set eocrSubdate6
	 */
	public void setEocrSubdate6(Date eocrSubdate6) {
		this.eocrSubdate6 = eocrSubdate6;
		addValidField("eocrSubdate6");
	}

	/**
	 * Get eocrSubdate7
	 */
	@Column(name = "EOCR_SUBDATE7")
	public Date getEocrSubdate7() {
		return eocrSubdate7;
	}

	/**
	 * Set eocrSubdate7
	 */
	public void setEocrSubdate7(Date eocrSubdate7) {
		this.eocrSubdate7 = eocrSubdate7;
		addValidField("eocrSubdate7");
	}

	/**
	 * Get eocrSubdate8
	 */
	@Column(name = "EOCR_SUBDATE8")
	public Date getEocrSubdate8() {
		return eocrSubdate8;
	}

	/**
	 * Set eocrSubdate8
	 */
	public void setEocrSubdate8(Date eocrSubdate8) {
		this.eocrSubdate8 = eocrSubdate8;
		addValidField("eocrSubdate8");
	}

	/**
	 * Get eocrSubdate9
	 */
	@Column(name = "EOCR_SUBDATE9")
	public Date getEocrSubdate9() {
		return eocrSubdate9;
	}

	/**
	 * Set eocrSubdate9
	 */
	public void setEocrSubdate9(Date eocrSubdate9) {
		this.eocrSubdate9 = eocrSubdate9;
		addValidField("eocrSubdate9");
	}

	/**
	 * Get eocrSubdate10
	 */
	@Column(name = "EOCR_SUBDATE10")
	public Date getEocrSubdate10() {
		return eocrSubdate10;
	}

	/**
	 * Set eocrSubdate10
	 */
	public void setEocrSubdate10(Date eocrSubdate10) {
		this.eocrSubdate10 = eocrSubdate10;
		addValidField("eocrSubdate10");
	}

	/**
	 * Get eocrSubnum1
	 */
	@Column(name = "EOCR_SUBNUM1")
	public Long getEocrSubnum1() {
		return eocrSubnum1;
	}

	/**
	 * Set eocrSubnum1
	 */
	public void setEocrSubnum1(Long eocrSubnum1) {
		this.eocrSubnum1 = eocrSubnum1;
		addValidField("eocrSubnum1");
	}

	/**
	 * Get eocrSubnum2
	 */
	@Column(name = "EOCR_SUBNUM2")
	public Long getEocrSubnum2() {
		return eocrSubnum2;
	}

	/**
	 * Set eocrSubnum2
	 */
	public void setEocrSubnum2(Long eocrSubnum2) {
		this.eocrSubnum2 = eocrSubnum2;
		addValidField("eocrSubnum2");
	}

	/**
	 * Get eocrSubnum3
	 */
	@Column(name = "EOCR_SUBNUM3")
	public Long getEocrSubnum3() {
		return eocrSubnum3;
	}

	/**
	 * Set eocrSubnum3
	 */
	public void setEocrSubnum3(Long eocrSubnum3) {
		this.eocrSubnum3 = eocrSubnum3;
		addValidField("eocrSubnum3");
	}

	/**
	 * Get eocrSubnum4
	 */
	@Column(name = "EOCR_SUBNUM4")
	public Long getEocrSubnum4() {
		return eocrSubnum4;
	}

	/**
	 * Set eocrSubnum4
	 */
	public void setEocrSubnum4(Long eocrSubnum4) {
		this.eocrSubnum4 = eocrSubnum4;
		addValidField("eocrSubnum4");
	}

	/**
	 * Get eocrSubnum5
	 */
	@Column(name = "EOCR_SUBNUM5")
	public Long getEocrSubnum5() {
		return eocrSubnum5;
	}

	/**
	 * Set eocrSubnum5
	 */
	public void setEocrSubnum5(Long eocrSubnum5) {
		this.eocrSubnum5 = eocrSubnum5;
		addValidField("eocrSubnum5");
	}

	/**
	 * Get eocrSubnum6
	 */
	@Column(name = "EOCR_SUBNUM6")
	public Long getEocrSubnum6() {
		return eocrSubnum6;
	}

	/**
	 * Set eocrSubnum6
	 */
	public void setEocrSubnum6(Long eocrSubnum6) {
		this.eocrSubnum6 = eocrSubnum6;
		addValidField("eocrSubnum6");
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
	 * Get eocrLeaseNo
	 */
	@Column(name = "EOCR_LEASE_NO")
	public String getEocrLeaseNo() {
		return eocrLeaseNo;
	}

	/**
	 * Set eocrLeaseNo
	 */
	public void setEocrLeaseNo(String eocrLeaseNo) {
		this.eocrLeaseNo = eocrLeaseNo;
		addValidField("eocrLeaseNo");
	}

	/**
	 * Get eocrAgentEbcuName
	 */
	@Column(name = "EOCR_AGENT_EBCU_NAME")
	public String getEocrAgentEbcuName() {
		return eocrAgentEbcuName;
	}

	/**
	 * Set eocrAgentEbcuName
	 */
	public void setEocrAgentEbcuName(String eocrAgentEbcuName) {
		this.eocrAgentEbcuName = eocrAgentEbcuName;
		addValidField("eocrAgentEbcuName");
	}

	/**
	 * Get eocrWithTime
	 */
	@Column(name = "EOCR_WITH_TIME")
	public Date getEocrWithTime() {
		return eocrWithTime;
	}

	/**
	 * Set eocrWithTime
	 */
	public void setEocrWithTime(Date eocrWithTime) {
		this.eocrWithTime = eocrWithTime;
		addValidField("eocrWithTime");
	}

	/**
	 * Get eocrWither
	 */
	@Column(name = "EOCR_WITHER")
	public String getEocrWither() {
		return eocrWither;
	}

	/**
	 * Set eocrWither
	 */
	public void setEocrWither(String eocrWither) {
		this.eocrWither = eocrWither;
		addValidField("eocrWither");
	}

	/**
	 * Get eocrEscoCode
	 */
	@Column(name = "EOCR_ESCO_CODE")
	public String getEocrEscoCode() {
		return eocrEscoCode;
	}

	/**
	 * Set eocrEscoCode
	 */
	public void setEocrEscoCode(String eocrEscoCode) {
		this.eocrEscoCode = eocrEscoCode;
		addValidField("eocrEscoCode");
	}

	/**
	 * Get eocrEscoNameCn
	 */
	@Column(name = "EOCR_ESCO_NAME_CN")
	public String getEocrEscoNameCn() {
		return eocrEscoNameCn;
	}

	/**
	 * Set eocrEscoNameCn
	 */
	public void setEocrEscoNameCn(String eocrEscoNameCn) {
		this.eocrEscoNameCn = eocrEscoNameCn;
		addValidField("eocrEscoNameCn");
	}

	/**
	 * Get eocrScEsdeCode
	 */
	@Column(name = "EOCR_SC_ESDE_CODE")
	public String getEocrScEsdeCode() {
		return eocrScEsdeCode;
	}

	/**
	 * Set eocrScEsdeCode
	 */
	public void setEocrScEsdeCode(String eocrScEsdeCode) {
		this.eocrScEsdeCode = eocrScEsdeCode;
		addValidField("eocrScEsdeCode");
	}

	/**
	 * Get eocrEsdeDepartmentName
	 */
	@Column(name = "EOCR_ESDE_DEPARTMENT_NAME")
	public String getEocrEsdeDepartmentName() {
		return eocrEsdeDepartmentName;
	}

	/**
	 * Set eocrEsdeDepartmentName
	 */
	public void setEocrEsdeDepartmentName(String eocrEsdeDepartmentName) {
		this.eocrEsdeDepartmentName = eocrEsdeDepartmentName;
		addValidField("eocrEsdeDepartmentName");
	}

	/**
	 * Get eocrEsusUserNameCn
	 */
	@Column(name = "EOCR_ESUS_USER_NAME_CN")
	public String getEocrEsusUserNameCn() {
		return eocrEsusUserNameCn;
	}

	/**
	 * Set eocrEsusUserNameCn
	 */
	public void setEocrEsusUserNameCn(String eocrEsusUserNameCn) {
		this.eocrEsusUserNameCn = eocrEsusUserNameCn;
		addValidField("eocrEsusUserNameCn");
	}

	/**
	 * Get eocrRetoType
	 */
	@Column(name = "EOCR_RETO_TYPE")
	public Long getEocrRetoType() {
		return eocrRetoType;
	}

	/**
	 * Set eocrRetoType
	 */
	public void setEocrRetoType(Long eocrRetoType) {
		this.eocrRetoType = eocrRetoType;
		addValidField("eocrRetoType");
	}

	/**
	 * Get eocrStartProvisionsBoxDay
	 */
	@Column(name = "EOCR_START_PROVISIONS_BOX_DAY")
	public Long getEocrStartProvisionsBoxDay() {
		return eocrStartProvisionsBoxDay;
	}

	/**
	 * Set eocrStartProvisionsBoxDay
	 */
	public void setEocrStartProvisionsBoxDay(Long eocrStartProvisionsBoxDay) {
		this.eocrStartProvisionsBoxDay = eocrStartProvisionsBoxDay;
		addValidField("eocrStartProvisionsBoxDay");
	}

	/**
	 * Get eocrEndProvisionsBoxDay
	 */
	@Column(name = "EOCR_END_PROVISIONS_BOX_DAY")
	public Long getEocrEndProvisionsBoxDay() {
		return eocrEndProvisionsBoxDay;
	}

	/**
	 * Set eocrEndProvisionsBoxDay
	 */
	public void setEocrEndProvisionsBoxDay(Long eocrEndProvisionsBoxDay) {
		this.eocrEndProvisionsBoxDay = eocrEndProvisionsBoxDay;
		addValidField("eocrEndProvisionsBoxDay");
	}

	/**
	 * Get eocrProvisionsBoxFees
	 */
	@Column(name = "EOCR_PROVISIONS_BOX_FEES")
	public Long getEocrProvisionsBoxFees() {
		return eocrProvisionsBoxFees;
	}

	/**
	 * Set eocrProvisionsBoxFees
	 */
	public void setEocrProvisionsBoxFees(Long eocrProvisionsBoxFees) {
		this.eocrProvisionsBoxFees = eocrProvisionsBoxFees;
		addValidField("eocrProvisionsBoxFees");
	}

}
