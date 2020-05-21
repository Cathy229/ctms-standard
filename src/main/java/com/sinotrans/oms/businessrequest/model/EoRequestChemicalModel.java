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
 * Model class for EoRequestChemical
 */
@Entity
@Table(name = "EO_REQUEST_CHEMICAL")
public class EoRequestChemicalModel extends BaseModel implements OperationLog {

	//eorcId
	private Long eorcId;
	//eorcEoorId
	private Long eorcEoorId;
	//eorcEscoId
	private Long eorcEscoId;
	//eorcEbpjId
	private Long eorcEbpjId;
	//eorcLoEbppId
	private Long eorcLoEbppId;
	//eorcEbtkId
	private Long eorcEbtkId;
	//eorcIsAutomatic
	private String eorcIsAutomatic;
	//eorcTaskStatus
	private String eorcTaskStatus;
	//eorcTaskFeedback
	private String eorcTaskFeedback;
	//eorcSysCode
	private String eorcSysCode;
	//eorcEbbuId
	private Long eorcEbbuId;
	//eorcEbbuNameCn
	private String eorcEbbuNameCn;
	//eorcEbbuCode
	private String eorcEbbuCode;
	//eorcEbbuDist1
	private String eorcEbbuDist1;
	//eorcEbbuDist2
	private String eorcEbbuDist2;
	//eorcEbbuDist3
	private String eorcEbbuDist3;
	//eorcEbbuDist4
	private String eorcEbbuDist4;
	//eorcEbbuDist5
	private String eorcEbbuDist5;
	//eorcToId
	private String eorcToId;
	//eorcNo
	private String eorcNo;
	//eorcType
	private String eorcType;
	//eorcStatus
	private String eorcStatus;
	//eorcSoNo
	private String eorcSoNo;
	//eorcDoNo
	private String eorcDoNo;
	//eorcConsignorEbcuId
	private Long eorcConsignorEbcuId;
	//eorcConsignorEbcuCode
	private String eorcConsignorEbcuCode;
	//eorcConsignorEbcuName
	private String eorcConsignorEbcuName;
	//eorcOwnerEbcuId
	private Long eorcOwnerEbcuId;
	//eorcOwnerEbcuCode
	private String eorcOwnerEbcuCode;
	//eorcOwnerEbcuName
	private String eorcOwnerEbcuName;
	//eorcReqDeliveryDate
	private Date eorcReqDeliveryDate;
	//eorcReqArrivalDate
	private Date eorcReqArrivalDate;
	//eorcLevel
	private String eorcLevel;
	//eorcExternalOrderNo
	private String eorcExternalOrderNo;
	//eorcShipperEbspId
	private Long eorcShipperEbspId;
	//eorcShipperEbspNameCn
	private String eorcShipperEbspNameCn;
	//eorcShipperEbspNo
	private String eorcShipperEbspNo;
	//eorcShipperEbrgId
	private Long eorcShipperEbrgId;
	//eorcShipperEbrgNo
	private String eorcShipperEbrgNo;
	//eorcShipperEbrgNameCn
	private String eorcShipperEbrgNameCn;
	//eorcShipperEbsaId
	private Long eorcShipperEbsaId;
	//eorcShipperEbsaAddress
	private String eorcShipperEbsaAddress;
	//eorcConsigneeEbspId
	private Long eorcConsigneeEbspId;
	//eorcConsigneeEbspNameCn
	private String eorcConsigneeEbspNameCn;
	//eorcConsigneeEbspCode
	private String eorcConsigneeEbspCode;
	//eorcConsigneeEbrgId
	private Long eorcConsigneeEbrgId;
	//eorcConsigneeEbrgNo
	private String eorcConsigneeEbrgNo;
	//eorcConsigneeEbrgNameCn
	private String eorcConsigneeEbrgNameCn;
	//eorcConsigneeEbsaId
	private Long eorcConsigneeEbsaId;
	//eorcConsigneeEbsaAddress
	private String eorcConsigneeEbsaAddress;
	//eorcVehicleThroughTime
	private Date eorcVehicleThroughTime;
	//eorcOutStopTime
	private Date eorcOutStopTime;
	//eorcDeliveryTime
	private Date eorcDeliveryTime;
	//eorcArrivalTime
	private Date eorcArrivalTime;
	//eorcUnloadTime
	private Date eorcUnloadTime;
	//eorcReturnTime
	private Date eorcReturnTime;
	//eorcInStopTime
	private Date eorcInStopTime;
	//eorcBackTime
	private Date eorcBackTime;
	//eorcWeight
	private Long eorcWeight;
	//eorcNetWeight
	private Long eorcNetWeight;
	//eorcQuantity
	private Long eorcQuantity;
	//eorcVolume
	private Long eorcVolume;
	//eorcCauseDelay
	private String eorcCauseDelay;
	//eorcRemark
	private String eorcRemark;
	//eorcSubstr1
	private String eorcSubstr1;
	//eorcSubstr2
	private String eorcSubstr2;
	//eorcSubstr3
	private String eorcSubstr3;
	//eorcSubstr4
	private String eorcSubstr4;
	//eorcSubstr5
	private String eorcSubstr5;
	//eorcSubstr6
	private String eorcSubstr6;
	//eorcSubstr7
	private String eorcSubstr7;
	//eorcSubstr8
	private String eorcSubstr8;
	//eorcSubdate1
	private Date eorcSubdate1;
	//eorcSubdate2
	private Date eorcSubdate2;
	//eorcSubdate3
	private Date eorcSubdate3;
	//eorcSubdate4
	private Date eorcSubdate4;
	//eorcSubnum1
	private Long eorcSubnum1;
	//eorcSubnum2
	private Long eorcSubnum2;
	//eorcSubnum3
	private Long eorcSubnum3;
	//eorcSubnum4
	private Long eorcSubnum4;
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
	//eorcOrder
	private Long eorcOrder;
	//eorcOrderFudeji
	private String eorcOrderFudeji;
	//eorcContractNo
	private String eorcContractNo;
	//eorcBuId
	private Long eorcBuId;
	//eorcBuName
	private String eorcBuName;
	//eorcEbccId
	private Long eorcEbccId;
	//eorcEbccName
	private String eorcEbccName;
	//eorcOrderDate
	private Date eorcOrderDate;
	//eorcStartEbrgId
	private Long eorcStartEbrgId;
	//eorcStartEbrgNo
	private String eorcStartEbrgNo;
	//eorcStartEbrgNameCn
	private String eorcStartEbrgNameCn;
	//eorcEndEbrgId
	private Long eorcEndEbrgId;
	//eorcEndEbrgNo
	private String eorcEndEbrgNo;
	//eorcEndEbrgNameCn
	private String eorcEndEbrgNameCn;
	//eorcEsdeId
	private Long eorcEsdeId;
	//eorcEsdeCode
	private String eorcEsdeCode;
	//eorcEsdeName
	private String eorcEsdeName;
	//eorcSaleEsstId
	private Long eorcSaleEsstId;
	//eorcSaleEsstCode
	private String eorcSaleEsstCode;
	//eorcSaleEsstName
	private String eorcSaleEsstName;
	//eorcOperateEsstId
	private Long eorcOperateEsstId;
	//eorcOperateEsstCode
	private String eorcOperateEsstCode;
	//eorcOperateEsstName
	private String eorcOperateEsstName;
	//eorcDeliveryPeriod
	private String eorcDeliveryPeriod;
	//eorcArrivalPeriod
	private String eorcArrivalPeriod;
	//eorcOrderType
	private String eorcOrderType;
	//eorcShipperEbsaContact
	private String eorcShipperEbsaContact;
	//eorcShipperEbsaTel
	private String eorcShipperEbsaTel;
	//eorcConsigneeEbsaContact
	private String eorcConsigneeEbsaContact;
	//eorcConsigneeEbsaTel
	private String eorcConsigneeEbsaTel;
	//eorcTransReq
	private String eorcTransReq;
	//eorcConsigneeReq
	private String eorcConsigneeReq;
	//eorcDocReq
	private String eorcDocReq;
	//eorcShipperEbsaPost
	private String eorcShipperEbsaPost;
	//eorcShipperEbplNameCn
	private String eorcShipperEbplNameCn;
	//eorcConsigneeEbsaPost
	private String eorcConsigneeEbsaPost;
	//eorcConsigneeEbplNameCn
	private String eorcConsigneeEbplNameCn;
	//eorcInTrust
	private String eorcInTrust;
	//eorcInTrustEscoCode
	private String eorcInTrustEscoCode;
	//eorcInTrustEscoName
	private String eorcInTrustEscoName;
	//eorcInTrustEsstCode
	private String eorcInTrustEsstCode;
	//eorcInTrustEsstName
	private String eorcInTrustEsstName;
	//eorcPaymentMode
	private String eorcPaymentMode;
	//eorcChargeoff
	private String eorcChargeoff;
	//eorcReceiptReturntype
	private Long eorcReceiptReturntype;
	//eorcExternalCarriersId
	private Long eorcExternalCarriersId;
	//eorcExternalCarriersCode
	private String eorcExternalCarriersCode;
	//eorcExternalCarriersName
	private String eorcExternalCarriersName;
	//eorcSubstr9
	private String eorcSubstr9;
	//eorcSubstr10
	private String eorcSubstr10;
	//eorcSubstr11
	private String eorcSubstr11;
	//eorcSubstr12
	private String eorcSubstr12;
	//eorcSubstr13
	private String eorcSubstr13;
	//eorcSubstr14
	private String eorcSubstr14;
	//eorcSubstr15
	private String eorcSubstr15;
	//eorcSubstr16
	private String eorcSubstr16;
	//eorcSubdate5
	private Date eorcSubdate5;
	//eorcSubdate6
	private Date eorcSubdate6;
	//eorcSubnum5
	private Long eorcSubnum5;
	//eorcSubnum6
	private Long eorcSubnum6;
	//eorcEscoCode
	private String eorcEscoCode;
	//eorcEscoNameCn
	private String eorcEscoNameCn;
	//eorcEsdeDepartmentCode
	private String eorcEsdeDepartmentCode;
	//eorcEsdeDepartmentName
	private String eorcEsdeDepartmentName;
	//eorcEsusUserNameCn
	private String eorcEsusUserNameCn;
	//eorcRetoType
	private Long eorcRetoType;
	//eorcIsReceive
	private String eorcIsReceive;

	/**
	 * Get eorcId
	 */
	@Column(name = "EORC_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEorcId() {
		return eorcId;
	}

	/**
	 * Set eorcId
	 */
	public void setEorcId(Long eorcId) {
		this.eorcId = eorcId;
		addValidField("eorcId");
	}

	/**
	 * Get eorcEoorId
	 */
	@Column(name = "EORC_EOOR_ID")
	public Long getEorcEoorId() {
		return eorcEoorId;
	}

	/**
	 * Set eorcEoorId
	 */
	public void setEorcEoorId(Long eorcEoorId) {
		this.eorcEoorId = eorcEoorId;
		addValidField("eorcEoorId");
	}

	/**
	 * Get eorcEscoId
	 */
	@Column(name = "EORC_ESCO_ID")
	public Long getEorcEscoId() {
		return eorcEscoId;
	}

	/**
	 * Set eorcEscoId
	 */
	public void setEorcEscoId(Long eorcEscoId) {
		this.eorcEscoId = eorcEscoId;
		addValidField("eorcEscoId");
	}

	/**
	 * Get eorcEbpjId
	 */
	@Column(name = "EORC_EBPJ_ID")
	public Long getEorcEbpjId() {
		return eorcEbpjId;
	}

	/**
	 * Set eorcEbpjId
	 */
	public void setEorcEbpjId(Long eorcEbpjId) {
		this.eorcEbpjId = eorcEbpjId;
		addValidField("eorcEbpjId");
	}

	/**
	 * Get eorcLoEbppId
	 */
	@Column(name = "EORC_LO_EBPP_ID")
	public Long getEorcLoEbppId() {
		return eorcLoEbppId;
	}

	/**
	 * Set eorcLoEbppId
	 */
	public void setEorcLoEbppId(Long eorcLoEbppId) {
		this.eorcLoEbppId = eorcLoEbppId;
		addValidField("eorcLoEbppId");
	}

	/**
	 * Get eorcEbtkId
	 */
	@Column(name = "EORC_EBTK_ID")
	public Long getEorcEbtkId() {
		return eorcEbtkId;
	}

	/**
	 * Set eorcEbtkId
	 */
	public void setEorcEbtkId(Long eorcEbtkId) {
		this.eorcEbtkId = eorcEbtkId;
		addValidField("eorcEbtkId");
	}

	/**
	 * Get eorcIsAutomatic
	 */
	@Column(name = "EORC_IS_AUTOMATIC")
	public String getEorcIsAutomatic() {
		return eorcIsAutomatic;
	}

	/**
	 * Set eorcIsAutomatic
	 */
	public void setEorcIsAutomatic(String eorcIsAutomatic) {
		this.eorcIsAutomatic = eorcIsAutomatic;
		addValidField("eorcIsAutomatic");
	}

	/**
	 * Get eorcTaskStatus
	 */
	@Column(name = "EORC_TASK_STATUS")
	public String getEorcTaskStatus() {
		return eorcTaskStatus;
	}

	/**
	 * Set eorcTaskStatus
	 */
	public void setEorcTaskStatus(String eorcTaskStatus) {
		this.eorcTaskStatus = eorcTaskStatus;
		addValidField("eorcTaskStatus");
	}

	/**
	 * Get eorcTaskFeedback
	 */
	@Column(name = "EORC_TASK_FEEDBACK")
	public String getEorcTaskFeedback() {
		return eorcTaskFeedback;
	}

	/**
	 * Set eorcTaskFeedback
	 */
	public void setEorcTaskFeedback(String eorcTaskFeedback) {
		this.eorcTaskFeedback = eorcTaskFeedback;
		addValidField("eorcTaskFeedback");
	}

	/**
	 * Get eorcSysCode
	 */
	@Column(name = "EORC_SYS_CODE")
	public String getEorcSysCode() {
		return eorcSysCode;
	}

	/**
	 * Set eorcSysCode
	 */
	public void setEorcSysCode(String eorcSysCode) {
		this.eorcSysCode = eorcSysCode;
		addValidField("eorcSysCode");
	}

	/**
	 * Get eorcEbbuId
	 */
	@Column(name = "EORC_EBBU_ID")
	public Long getEorcEbbuId() {
		return eorcEbbuId;
	}

	/**
	 * Set eorcEbbuId
	 */
	public void setEorcEbbuId(Long eorcEbbuId) {
		this.eorcEbbuId = eorcEbbuId;
		addValidField("eorcEbbuId");
	}

	/**
	 * Get eorcEbbuNameCn
	 */
	@Column(name = "EORC_EBBU_NAME_CN")
	public String getEorcEbbuNameCn() {
		return eorcEbbuNameCn;
	}

	/**
	 * Set eorcEbbuNameCn
	 */
	public void setEorcEbbuNameCn(String eorcEbbuNameCn) {
		this.eorcEbbuNameCn = eorcEbbuNameCn;
		addValidField("eorcEbbuNameCn");
	}

	/**
	 * Get eorcEbbuCode
	 */
	@Column(name = "EORC_EBBU_CODE")
	public String getEorcEbbuCode() {
		return eorcEbbuCode;
	}

	/**
	 * Set eorcEbbuCode
	 */
	public void setEorcEbbuCode(String eorcEbbuCode) {
		this.eorcEbbuCode = eorcEbbuCode;
		addValidField("eorcEbbuCode");
	}

	/**
	 * Get eorcEbbuDist1
	 */
	@Column(name = "EORC_EBBU_DIST_1")
	public String getEorcEbbuDist1() {
		return eorcEbbuDist1;
	}

	/**
	 * Set eorcEbbuDist1
	 */
	public void setEorcEbbuDist1(String eorcEbbuDist1) {
		this.eorcEbbuDist1 = eorcEbbuDist1;
		addValidField("eorcEbbuDist1");
	}

	/**
	 * Get eorcEbbuDist2
	 */
	@Column(name = "EORC_EBBU_DIST_2")
	public String getEorcEbbuDist2() {
		return eorcEbbuDist2;
	}

	/**
	 * Set eorcEbbuDist2
	 */
	public void setEorcEbbuDist2(String eorcEbbuDist2) {
		this.eorcEbbuDist2 = eorcEbbuDist2;
		addValidField("eorcEbbuDist2");
	}

	/**
	 * Get eorcEbbuDist3
	 */
	@Column(name = "EORC_EBBU_DIST_3")
	public String getEorcEbbuDist3() {
		return eorcEbbuDist3;
	}

	/**
	 * Set eorcEbbuDist3
	 */
	public void setEorcEbbuDist3(String eorcEbbuDist3) {
		this.eorcEbbuDist3 = eorcEbbuDist3;
		addValidField("eorcEbbuDist3");
	}

	/**
	 * Get eorcEbbuDist4
	 */
	@Column(name = "EORC_EBBU_DIST_4")
	public String getEorcEbbuDist4() {
		return eorcEbbuDist4;
	}

	/**
	 * Set eorcEbbuDist4
	 */
	public void setEorcEbbuDist4(String eorcEbbuDist4) {
		this.eorcEbbuDist4 = eorcEbbuDist4;
		addValidField("eorcEbbuDist4");
	}

	/**
	 * Get eorcEbbuDist5
	 */
	@Column(name = "EORC_EBBU_DIST_5")
	public String getEorcEbbuDist5() {
		return eorcEbbuDist5;
	}

	/**
	 * Set eorcEbbuDist5
	 */
	public void setEorcEbbuDist5(String eorcEbbuDist5) {
		this.eorcEbbuDist5 = eorcEbbuDist5;
		addValidField("eorcEbbuDist5");
	}

	/**
	 * Get eorcToId
	 */
	@Column(name = "EORC_TO_ID")
	public String getEorcToId() {
		return eorcToId;
	}

	/**
	 * Set eorcToId
	 */
	public void setEorcToId(String eorcToId) {
		this.eorcToId = eorcToId;
		addValidField("eorcToId");
	}

	/**
	 * Get eorcNo
	 */
	@Column(name = "EORC_NO")
	public String getEorcNo() {
		return eorcNo;
	}

	/**
	 * Set eorcNo
	 */
	public void setEorcNo(String eorcNo) {
		this.eorcNo = eorcNo;
		addValidField("eorcNo");
	}

	/**
	 * Get eorcType
	 */
	@Column(name = "EORC_TYPE")
	public String getEorcType() {
		return eorcType;
	}

	/**
	 * Set eorcType
	 */
	public void setEorcType(String eorcType) {
		this.eorcType = eorcType;
		addValidField("eorcType");
	}

	/**
	 * Get eorcStatus
	 */
	@Column(name = "EORC_STATUS")
	public String getEorcStatus() {
		return eorcStatus;
	}

	/**
	 * Set eorcStatus
	 */
	public void setEorcStatus(String eorcStatus) {
		this.eorcStatus = eorcStatus;
		addValidField("eorcStatus");
	}

	/**
	 * Get eorcSoNo
	 */
	@Column(name = "EORC_SO_NO")
	public String getEorcSoNo() {
		return eorcSoNo;
	}

	/**
	 * Set eorcSoNo
	 */
	public void setEorcSoNo(String eorcSoNo) {
		this.eorcSoNo = eorcSoNo;
		addValidField("eorcSoNo");
	}

	/**
	 * Get eorcDoNo
	 */
	@Column(name = "EORC_DO_NO")
	public String getEorcDoNo() {
		return eorcDoNo;
	}

	/**
	 * Set eorcDoNo
	 */
	public void setEorcDoNo(String eorcDoNo) {
		this.eorcDoNo = eorcDoNo;
		addValidField("eorcDoNo");
	}

	/**
	 * Get eorcConsignorEbcuId
	 */
	@Column(name = "EORC_CONSIGNOR_EBCU_ID")
	public Long getEorcConsignorEbcuId() {
		return eorcConsignorEbcuId;
	}

	/**
	 * Set eorcConsignorEbcuId
	 */
	public void setEorcConsignorEbcuId(Long eorcConsignorEbcuId) {
		this.eorcConsignorEbcuId = eorcConsignorEbcuId;
		addValidField("eorcConsignorEbcuId");
	}

	/**
	 * Get eorcConsignorEbcuCode
	 */
	@Column(name = "EORC_CONSIGNOR_EBCU_CODE")
	public String getEorcConsignorEbcuCode() {
		return eorcConsignorEbcuCode;
	}

	/**
	 * Set eorcConsignorEbcuCode
	 */
	public void setEorcConsignorEbcuCode(String eorcConsignorEbcuCode) {
		this.eorcConsignorEbcuCode = eorcConsignorEbcuCode;
		addValidField("eorcConsignorEbcuCode");
	}

	/**
	 * Get eorcConsignorEbcuName
	 */
	@Column(name = "EORC_CONSIGNOR_EBCU_NAME")
	public String getEorcConsignorEbcuName() {
		return eorcConsignorEbcuName;
	}

	/**
	 * Set eorcConsignorEbcuName
	 */
	public void setEorcConsignorEbcuName(String eorcConsignorEbcuName) {
		this.eorcConsignorEbcuName = eorcConsignorEbcuName;
		addValidField("eorcConsignorEbcuName");
	}

	/**
	 * Get eorcOwnerEbcuId
	 */
	@Column(name = "EORC_OWNER_EBCU_ID")
	public Long getEorcOwnerEbcuId() {
		return eorcOwnerEbcuId;
	}

	/**
	 * Set eorcOwnerEbcuId
	 */
	public void setEorcOwnerEbcuId(Long eorcOwnerEbcuId) {
		this.eorcOwnerEbcuId = eorcOwnerEbcuId;
		addValidField("eorcOwnerEbcuId");
	}

	/**
	 * Get eorcOwnerEbcuCode
	 */
	@Column(name = "EORC_OWNER_EBCU_CODE")
	public String getEorcOwnerEbcuCode() {
		return eorcOwnerEbcuCode;
	}

	/**
	 * Set eorcOwnerEbcuCode
	 */
	public void setEorcOwnerEbcuCode(String eorcOwnerEbcuCode) {
		this.eorcOwnerEbcuCode = eorcOwnerEbcuCode;
		addValidField("eorcOwnerEbcuCode");
	}

	/**
	 * Get eorcOwnerEbcuName
	 */
	@Column(name = "EORC_OWNER_EBCU_NAME")
	public String getEorcOwnerEbcuName() {
		return eorcOwnerEbcuName;
	}

	/**
	 * Set eorcOwnerEbcuName
	 */
	public void setEorcOwnerEbcuName(String eorcOwnerEbcuName) {
		this.eorcOwnerEbcuName = eorcOwnerEbcuName;
		addValidField("eorcOwnerEbcuName");
	}

	/**
	 * Get eorcReqDeliveryDate
	 */
	@Column(name = "EORC_REQ_DELIVERY_DATE")
	public Date getEorcReqDeliveryDate() {
		return eorcReqDeliveryDate;
	}

	/**
	 * Set eorcReqDeliveryDate
	 */
	public void setEorcReqDeliveryDate(Date eorcReqDeliveryDate) {
		this.eorcReqDeliveryDate = eorcReqDeliveryDate;
		addValidField("eorcReqDeliveryDate");
	}

	/**
	 * Get eorcReqArrivalDate
	 */
	@Column(name = "EORC_REQ_ARRIVAL_DATE")
	public Date getEorcReqArrivalDate() {
		return eorcReqArrivalDate;
	}

	/**
	 * Set eorcReqArrivalDate
	 */
	public void setEorcReqArrivalDate(Date eorcReqArrivalDate) {
		this.eorcReqArrivalDate = eorcReqArrivalDate;
		addValidField("eorcReqArrivalDate");
	}

	/**
	 * Get eorcLevel
	 */
	@Column(name = "EORC_LEVEL")
	public String getEorcLevel() {
		return eorcLevel;
	}

	/**
	 * Set eorcLevel
	 */
	public void setEorcLevel(String eorcLevel) {
		this.eorcLevel = eorcLevel;
		addValidField("eorcLevel");
	}

	/**
	 * Get eorcExternalOrderNo
	 */
	@Column(name = "EORC_EXTERNAL_ORDER_NO")
	public String getEorcExternalOrderNo() {
		return eorcExternalOrderNo;
	}

	/**
	 * Set eorcExternalOrderNo
	 */
	public void setEorcExternalOrderNo(String eorcExternalOrderNo) {
		this.eorcExternalOrderNo = eorcExternalOrderNo;
		addValidField("eorcExternalOrderNo");
	}

	/**
	 * Get eorcShipperEbspId
	 */
	@Column(name = "EORC_SHIPPER_EBSP_ID")
	public Long getEorcShipperEbspId() {
		return eorcShipperEbspId;
	}

	/**
	 * Set eorcShipperEbspId
	 */
	public void setEorcShipperEbspId(Long eorcShipperEbspId) {
		this.eorcShipperEbspId = eorcShipperEbspId;
		addValidField("eorcShipperEbspId");
	}

	/**
	 * Get eorcShipperEbspNameCn
	 */
	@Column(name = "EORC_SHIPPER_EBSP_NAME_CN")
	public String getEorcShipperEbspNameCn() {
		return eorcShipperEbspNameCn;
	}

	/**
	 * Set eorcShipperEbspNameCn
	 */
	public void setEorcShipperEbspNameCn(String eorcShipperEbspNameCn) {
		this.eorcShipperEbspNameCn = eorcShipperEbspNameCn;
		addValidField("eorcShipperEbspNameCn");
	}

	/**
	 * Get eorcShipperEbspNo
	 */
	@Column(name = "EORC_SHIPPER_EBSP_NO")
	public String getEorcShipperEbspNo() {
		return eorcShipperEbspNo;
	}

	/**
	 * Set eorcShipperEbspNo
	 */
	public void setEorcShipperEbspNo(String eorcShipperEbspNo) {
		this.eorcShipperEbspNo = eorcShipperEbspNo;
		addValidField("eorcShipperEbspNo");
	}

	/**
	 * Get eorcShipperEbrgId
	 */
	@Column(name = "EORC_SHIPPER_EBRG_ID")
	public Long getEorcShipperEbrgId() {
		return eorcShipperEbrgId;
	}

	/**
	 * Set eorcShipperEbrgId
	 */
	public void setEorcShipperEbrgId(Long eorcShipperEbrgId) {
		this.eorcShipperEbrgId = eorcShipperEbrgId;
		addValidField("eorcShipperEbrgId");
	}

	/**
	 * Get eorcShipperEbrgNo
	 */
	@Column(name = "EORC_SHIPPER_EBRG_NO")
	public String getEorcShipperEbrgNo() {
		return eorcShipperEbrgNo;
	}

	/**
	 * Set eorcShipperEbrgNo
	 */
	public void setEorcShipperEbrgNo(String eorcShipperEbrgNo) {
		this.eorcShipperEbrgNo = eorcShipperEbrgNo;
		addValidField("eorcShipperEbrgNo");
	}

	/**
	 * Get eorcShipperEbrgNameCn
	 */
	@Column(name = "EORC_SHIPPER_EBRG_NAME_CN")
	public String getEorcShipperEbrgNameCn() {
		return eorcShipperEbrgNameCn;
	}

	/**
	 * Set eorcShipperEbrgNameCn
	 */
	public void setEorcShipperEbrgNameCn(String eorcShipperEbrgNameCn) {
		this.eorcShipperEbrgNameCn = eorcShipperEbrgNameCn;
		addValidField("eorcShipperEbrgNameCn");
	}

	/**
	 * Get eorcShipperEbsaId
	 */
	@Column(name = "EORC_SHIPPER_EBSA_ID")
	public Long getEorcShipperEbsaId() {
		return eorcShipperEbsaId;
	}

	/**
	 * Set eorcShipperEbsaId
	 */
	public void setEorcShipperEbsaId(Long eorcShipperEbsaId) {
		this.eorcShipperEbsaId = eorcShipperEbsaId;
		addValidField("eorcShipperEbsaId");
	}

	/**
	 * Get eorcShipperEbsaAddress
	 */
	@Column(name = "EORC_SHIPPER_EBSA_ADDRESS")
	public String getEorcShipperEbsaAddress() {
		return eorcShipperEbsaAddress;
	}

	/**
	 * Set eorcShipperEbsaAddress
	 */
	public void setEorcShipperEbsaAddress(String eorcShipperEbsaAddress) {
		this.eorcShipperEbsaAddress = eorcShipperEbsaAddress;
		addValidField("eorcShipperEbsaAddress");
	}

	/**
	 * Get eorcConsigneeEbspId
	 */
	@Column(name = "EORC_CONSIGNEE_EBSP_ID")
	public Long getEorcConsigneeEbspId() {
		return eorcConsigneeEbspId;
	}

	/**
	 * Set eorcConsigneeEbspId
	 */
	public void setEorcConsigneeEbspId(Long eorcConsigneeEbspId) {
		this.eorcConsigneeEbspId = eorcConsigneeEbspId;
		addValidField("eorcConsigneeEbspId");
	}

	/**
	 * Get eorcConsigneeEbspNameCn
	 */
	@Column(name = "EORC_CONSIGNEE_EBSP_NAME_CN")
	public String getEorcConsigneeEbspNameCn() {
		return eorcConsigneeEbspNameCn;
	}

	/**
	 * Set eorcConsigneeEbspNameCn
	 */
	public void setEorcConsigneeEbspNameCn(String eorcConsigneeEbspNameCn) {
		this.eorcConsigneeEbspNameCn = eorcConsigneeEbspNameCn;
		addValidField("eorcConsigneeEbspNameCn");
	}

	/**
	 * Get eorcConsigneeEbspCode
	 */
	@Column(name = "EORC_CONSIGNEE_EBSP_CODE")
	public String getEorcConsigneeEbspCode() {
		return eorcConsigneeEbspCode;
	}

	/**
	 * Set eorcConsigneeEbspCode
	 */
	public void setEorcConsigneeEbspCode(String eorcConsigneeEbspCode) {
		this.eorcConsigneeEbspCode = eorcConsigneeEbspCode;
		addValidField("eorcConsigneeEbspCode");
	}

	/**
	 * Get eorcConsigneeEbrgId
	 */
	@Column(name = "EORC_CONSIGNEE_EBRG_ID")
	public Long getEorcConsigneeEbrgId() {
		return eorcConsigneeEbrgId;
	}

	/**
	 * Set eorcConsigneeEbrgId
	 */
	public void setEorcConsigneeEbrgId(Long eorcConsigneeEbrgId) {
		this.eorcConsigneeEbrgId = eorcConsigneeEbrgId;
		addValidField("eorcConsigneeEbrgId");
	}

	/**
	 * Get eorcConsigneeEbrgNo
	 */
	@Column(name = "EORC_CONSIGNEE_EBRG_NO")
	public String getEorcConsigneeEbrgNo() {
		return eorcConsigneeEbrgNo;
	}

	/**
	 * Set eorcConsigneeEbrgNo
	 */
	public void setEorcConsigneeEbrgNo(String eorcConsigneeEbrgNo) {
		this.eorcConsigneeEbrgNo = eorcConsigneeEbrgNo;
		addValidField("eorcConsigneeEbrgNo");
	}

	/**
	 * Get eorcConsigneeEbrgNameCn
	 */
	@Column(name = "EORC_CONSIGNEE_EBRG_NAME_CN")
	public String getEorcConsigneeEbrgNameCn() {
		return eorcConsigneeEbrgNameCn;
	}

	/**
	 * Set eorcConsigneeEbrgNameCn
	 */
	public void setEorcConsigneeEbrgNameCn(String eorcConsigneeEbrgNameCn) {
		this.eorcConsigneeEbrgNameCn = eorcConsigneeEbrgNameCn;
		addValidField("eorcConsigneeEbrgNameCn");
	}

	/**
	 * Get eorcConsigneeEbsaId
	 */
	@Column(name = "EORC_CONSIGNEE_EBSA_ID")
	public Long getEorcConsigneeEbsaId() {
		return eorcConsigneeEbsaId;
	}

	/**
	 * Set eorcConsigneeEbsaId
	 */
	public void setEorcConsigneeEbsaId(Long eorcConsigneeEbsaId) {
		this.eorcConsigneeEbsaId = eorcConsigneeEbsaId;
		addValidField("eorcConsigneeEbsaId");
	}

	/**
	 * Get eorcConsigneeEbsaAddress
	 */
	@Column(name = "EORC_CONSIGNEE_EBSA_ADDRESS")
	public String getEorcConsigneeEbsaAddress() {
		return eorcConsigneeEbsaAddress;
	}

	/**
	 * Set eorcConsigneeEbsaAddress
	 */
	public void setEorcConsigneeEbsaAddress(String eorcConsigneeEbsaAddress) {
		this.eorcConsigneeEbsaAddress = eorcConsigneeEbsaAddress;
		addValidField("eorcConsigneeEbsaAddress");
	}

	/**
	 * Get eorcVehicleThroughTime
	 */
	@Column(name = "EORC_VEHICLE_THROUGH_TIME")
	public Date getEorcVehicleThroughTime() {
		return eorcVehicleThroughTime;
	}

	/**
	 * Set eorcVehicleThroughTime
	 */
	public void setEorcVehicleThroughTime(Date eorcVehicleThroughTime) {
		this.eorcVehicleThroughTime = eorcVehicleThroughTime;
		addValidField("eorcVehicleThroughTime");
	}

	/**
	 * Get eorcOutStopTime
	 */
	@Column(name = "EORC_OUT_STOP_TIME")
	public Date getEorcOutStopTime() {
		return eorcOutStopTime;
	}

	/**
	 * Set eorcOutStopTime
	 */
	public void setEorcOutStopTime(Date eorcOutStopTime) {
		this.eorcOutStopTime = eorcOutStopTime;
		addValidField("eorcOutStopTime");
	}

	/**
	 * Get eorcDeliveryTime
	 */
	@Column(name = "EORC_DELIVERY_TIME")
	public Date getEorcDeliveryTime() {
		return eorcDeliveryTime;
	}

	/**
	 * Set eorcDeliveryTime
	 */
	public void setEorcDeliveryTime(Date eorcDeliveryTime) {
		this.eorcDeliveryTime = eorcDeliveryTime;
		addValidField("eorcDeliveryTime");
	}

	/**
	 * Get eorcArrivalTime
	 */
	@Column(name = "EORC_ARRIVAL_TIME")
	public Date getEorcArrivalTime() {
		return eorcArrivalTime;
	}

	/**
	 * Set eorcArrivalTime
	 */
	public void setEorcArrivalTime(Date eorcArrivalTime) {
		this.eorcArrivalTime = eorcArrivalTime;
		addValidField("eorcArrivalTime");
	}

	/**
	 * Get eorcUnloadTime
	 */
	@Column(name = "EORC_UNLOAD_TIME")
	public Date getEorcUnloadTime() {
		return eorcUnloadTime;
	}

	/**
	 * Set eorcUnloadTime
	 */
	public void setEorcUnloadTime(Date eorcUnloadTime) {
		this.eorcUnloadTime = eorcUnloadTime;
		addValidField("eorcUnloadTime");
	}

	/**
	 * Get eorcReturnTime
	 */
	@Column(name = "EORC_RETURN_TIME")
	public Date getEorcReturnTime() {
		return eorcReturnTime;
	}

	/**
	 * Set eorcReturnTime
	 */
	public void setEorcReturnTime(Date eorcReturnTime) {
		this.eorcReturnTime = eorcReturnTime;
		addValidField("eorcReturnTime");
	}

	/**
	 * Get eorcInStopTime
	 */
	@Column(name = "EORC_IN_STOP_TIME")
	public Date getEorcInStopTime() {
		return eorcInStopTime;
	}

	/**
	 * Set eorcInStopTime
	 */
	public void setEorcInStopTime(Date eorcInStopTime) {
		this.eorcInStopTime = eorcInStopTime;
		addValidField("eorcInStopTime");
	}

	/**
	 * Get eorcBackTime
	 */
	@Column(name = "EORC_BACK_TIME")
	public Date getEorcBackTime() {
		return eorcBackTime;
	}

	/**
	 * Set eorcBackTime
	 */
	public void setEorcBackTime(Date eorcBackTime) {
		this.eorcBackTime = eorcBackTime;
		addValidField("eorcBackTime");
	}

	/**
	 * Get eorcWeight
	 */
	@Column(name = "EORC_WEIGHT")
	public Long getEorcWeight() {
		return eorcWeight;
	}

	/**
	 * Set eorcWeight
	 */
	public void setEorcWeight(Long eorcWeight) {
		this.eorcWeight = eorcWeight;
		addValidField("eorcWeight");
	}

	/**
	 * Get eorcNetWeight
	 */
	@Column(name = "EORC_NET_WEIGHT")
	public Long getEorcNetWeight() {
		return eorcNetWeight;
	}

	/**
	 * Set eorcNetWeight
	 */
	public void setEorcNetWeight(Long eorcNetWeight) {
		this.eorcNetWeight = eorcNetWeight;
		addValidField("eorcNetWeight");
	}

	/**
	 * Get eorcQuantity
	 */
	@Column(name = "EORC_QUANTITY")
	public Long getEorcQuantity() {
		return eorcQuantity;
	}

	/**
	 * Set eorcQuantity
	 */
	public void setEorcQuantity(Long eorcQuantity) {
		this.eorcQuantity = eorcQuantity;
		addValidField("eorcQuantity");
	}

	/**
	 * Get eorcVolume
	 */
	@Column(name = "EORC_VOLUME")
	public Long getEorcVolume() {
		return eorcVolume;
	}

	/**
	 * Set eorcVolume
	 */
	public void setEorcVolume(Long eorcVolume) {
		this.eorcVolume = eorcVolume;
		addValidField("eorcVolume");
	}

	/**
	 * Get eorcCauseDelay
	 */
	@Column(name = "EORC_CAUSE_DELAY")
	public String getEorcCauseDelay() {
		return eorcCauseDelay;
	}

	/**
	 * Set eorcCauseDelay
	 */
	public void setEorcCauseDelay(String eorcCauseDelay) {
		this.eorcCauseDelay = eorcCauseDelay;
		addValidField("eorcCauseDelay");
	}

	/**
	 * Get eorcRemark
	 */
	@Column(name = "EORC_REMARK")
	public String getEorcRemark() {
		return eorcRemark;
	}

	/**
	 * Set eorcRemark
	 */
	public void setEorcRemark(String eorcRemark) {
		this.eorcRemark = eorcRemark;
		addValidField("eorcRemark");
	}

	/**
	 * Get eorcSubstr1
	 */
	@Column(name = "EORC_SUBSTR1")
	public String getEorcSubstr1() {
		return eorcSubstr1;
	}

	/**
	 * Set eorcSubstr1
	 */
	public void setEorcSubstr1(String eorcSubstr1) {
		this.eorcSubstr1 = eorcSubstr1;
		addValidField("eorcSubstr1");
	}

	/**
	 * Get eorcSubstr2
	 */
	@Column(name = "EORC_SUBSTR2")
	public String getEorcSubstr2() {
		return eorcSubstr2;
	}

	/**
	 * Set eorcSubstr2
	 */
	public void setEorcSubstr2(String eorcSubstr2) {
		this.eorcSubstr2 = eorcSubstr2;
		addValidField("eorcSubstr2");
	}

	/**
	 * Get eorcSubstr3
	 */
	@Column(name = "EORC_SUBSTR3")
	public String getEorcSubstr3() {
		return eorcSubstr3;
	}

	/**
	 * Set eorcSubstr3
	 */
	public void setEorcSubstr3(String eorcSubstr3) {
		this.eorcSubstr3 = eorcSubstr3;
		addValidField("eorcSubstr3");
	}

	/**
	 * Get eorcSubstr4
	 */
	@Column(name = "EORC_SUBSTR4")
	public String getEorcSubstr4() {
		return eorcSubstr4;
	}

	/**
	 * Set eorcSubstr4
	 */
	public void setEorcSubstr4(String eorcSubstr4) {
		this.eorcSubstr4 = eorcSubstr4;
		addValidField("eorcSubstr4");
	}

	/**
	 * Get eorcSubstr5
	 */
	@Column(name = "EORC_SUBSTR5")
	public String getEorcSubstr5() {
		return eorcSubstr5;
	}

	/**
	 * Set eorcSubstr5
	 */
	public void setEorcSubstr5(String eorcSubstr5) {
		this.eorcSubstr5 = eorcSubstr5;
		addValidField("eorcSubstr5");
	}

	/**
	 * Get eorcSubstr6
	 */
	@Column(name = "EORC_SUBSTR6")
	public String getEorcSubstr6() {
		return eorcSubstr6;
	}

	/**
	 * Set eorcSubstr6
	 */
	public void setEorcSubstr6(String eorcSubstr6) {
		this.eorcSubstr6 = eorcSubstr6;
		addValidField("eorcSubstr6");
	}

	/**
	 * Get eorcSubstr7
	 */
	@Column(name = "EORC_SUBSTR7")
	public String getEorcSubstr7() {
		return eorcSubstr7;
	}

	/**
	 * Set eorcSubstr7
	 */
	public void setEorcSubstr7(String eorcSubstr7) {
		this.eorcSubstr7 = eorcSubstr7;
		addValidField("eorcSubstr7");
	}

	/**
	 * Get eorcSubstr8
	 */
	@Column(name = "EORC_SUBSTR8")
	public String getEorcSubstr8() {
		return eorcSubstr8;
	}

	/**
	 * Set eorcSubstr8
	 */
	public void setEorcSubstr8(String eorcSubstr8) {
		this.eorcSubstr8 = eorcSubstr8;
		addValidField("eorcSubstr8");
	}

	/**
	 * Get eorcSubdate1
	 */
	@Column(name = "EORC_SUBDATE1")
	public Date getEorcSubdate1() {
		return eorcSubdate1;
	}

	/**
	 * Set eorcSubdate1
	 */
	public void setEorcSubdate1(Date eorcSubdate1) {
		this.eorcSubdate1 = eorcSubdate1;
		addValidField("eorcSubdate1");
	}

	/**
	 * Get eorcSubdate2
	 */
	@Column(name = "EORC_SUBDATE2")
	public Date getEorcSubdate2() {
		return eorcSubdate2;
	}

	/**
	 * Set eorcSubdate2
	 */
	public void setEorcSubdate2(Date eorcSubdate2) {
		this.eorcSubdate2 = eorcSubdate2;
		addValidField("eorcSubdate2");
	}

	/**
	 * Get eorcSubdate3
	 */
	@Column(name = "EORC_SUBDATE3")
	public Date getEorcSubdate3() {
		return eorcSubdate3;
	}

	/**
	 * Set eorcSubdate3
	 */
	public void setEorcSubdate3(Date eorcSubdate3) {
		this.eorcSubdate3 = eorcSubdate3;
		addValidField("eorcSubdate3");
	}

	/**
	 * Get eorcSubdate4
	 */
	@Column(name = "EORC_SUBDATE4")
	public Date getEorcSubdate4() {
		return eorcSubdate4;
	}

	/**
	 * Set eorcSubdate4
	 */
	public void setEorcSubdate4(Date eorcSubdate4) {
		this.eorcSubdate4 = eorcSubdate4;
		addValidField("eorcSubdate4");
	}

	/**
	 * Get eorcSubnum1
	 */
	@Column(name = "EORC_SUBNUM1")
	public Long getEorcSubnum1() {
		return eorcSubnum1;
	}

	/**
	 * Set eorcSubnum1
	 */
	public void setEorcSubnum1(Long eorcSubnum1) {
		this.eorcSubnum1 = eorcSubnum1;
		addValidField("eorcSubnum1");
	}

	/**
	 * Get eorcSubnum2
	 */
	@Column(name = "EORC_SUBNUM2")
	public Long getEorcSubnum2() {
		return eorcSubnum2;
	}

	/**
	 * Set eorcSubnum2
	 */
	public void setEorcSubnum2(Long eorcSubnum2) {
		this.eorcSubnum2 = eorcSubnum2;
		addValidField("eorcSubnum2");
	}

	/**
	 * Get eorcSubnum3
	 */
	@Column(name = "EORC_SUBNUM3")
	public Long getEorcSubnum3() {
		return eorcSubnum3;
	}

	/**
	 * Set eorcSubnum3
	 */
	public void setEorcSubnum3(Long eorcSubnum3) {
		this.eorcSubnum3 = eorcSubnum3;
		addValidField("eorcSubnum3");
	}

	/**
	 * Get eorcSubnum4
	 */
	@Column(name = "EORC_SUBNUM4")
	public Long getEorcSubnum4() {
		return eorcSubnum4;
	}

	/**
	 * Set eorcSubnum4
	 */
	public void setEorcSubnum4(Long eorcSubnum4) {
		this.eorcSubnum4 = eorcSubnum4;
		addValidField("eorcSubnum4");
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
	 * Get eorcOrder
	 */
	@Column(name = "EORC_ORDER")
	public Long getEorcOrder() {
		return eorcOrder;
	}

	/**
	 * Set eorcOrder
	 */
	public void setEorcOrder(Long eorcOrder) {
		this.eorcOrder = eorcOrder;
		addValidField("eorcOrder");
	}

	/**
	 * Get eorcOrderFudeji
	 */
	@Column(name = "EORC_ORDER_FUDEJI")
	public String getEorcOrderFudeji() {
		return eorcOrderFudeji;
	}

	/**
	 * Set eorcOrderFudeji
	 */
	public void setEorcOrderFudeji(String eorcOrderFudeji) {
		this.eorcOrderFudeji = eorcOrderFudeji;
		addValidField("eorcOrderFudeji");
	}

	/**
	 * Get eorcContractNo
	 */
	@Column(name = "EORC_CONTRACT_NO")
	public String getEorcContractNo() {
		return eorcContractNo;
	}

	/**
	 * Set eorcContractNo
	 */
	public void setEorcContractNo(String eorcContractNo) {
		this.eorcContractNo = eorcContractNo;
		addValidField("eorcContractNo");
	}

	/**
	 * Get eorcBuId
	 */
	@Column(name = "EORC_BU_ID")
	public Long getEorcBuId() {
		return eorcBuId;
	}

	/**
	 * Set eorcBuId
	 */
	public void setEorcBuId(Long eorcBuId) {
		this.eorcBuId = eorcBuId;
		addValidField("eorcBuId");
	}

	/**
	 * Get eorcBuName
	 */
	@Column(name = "EORC_BU_NAME")
	public String getEorcBuName() {
		return eorcBuName;
	}

	/**
	 * Set eorcBuName
	 */
	public void setEorcBuName(String eorcBuName) {
		this.eorcBuName = eorcBuName;
		addValidField("eorcBuName");
	}

	/**
	 * Get eorcEbccId
	 */
	@Column(name = "EORC_EBCC_ID")
	public Long getEorcEbccId() {
		return eorcEbccId;
	}

	/**
	 * Set eorcEbccId
	 */
	public void setEorcEbccId(Long eorcEbccId) {
		this.eorcEbccId = eorcEbccId;
		addValidField("eorcEbccId");
	}

	/**
	 * Get eorcEbccName
	 */
	@Column(name = "EORC_EBCC_NAME")
	public String getEorcEbccName() {
		return eorcEbccName;
	}

	/**
	 * Set eorcEbccName
	 */
	public void setEorcEbccName(String eorcEbccName) {
		this.eorcEbccName = eorcEbccName;
		addValidField("eorcEbccName");
	}

	/**
	 * Get eorcOrderDate
	 */
	@Column(name = "EORC_ORDER_DATE")
	public Date getEorcOrderDate() {
		return eorcOrderDate;
	}

	/**
	 * Set eorcOrderDate
	 */
	public void setEorcOrderDate(Date eorcOrderDate) {
		this.eorcOrderDate = eorcOrderDate;
		addValidField("eorcOrderDate");
	}

	/**
	 * Get eorcStartEbrgId
	 */
	@Column(name = "EORC_START_EBRG_ID")
	public Long getEorcStartEbrgId() {
		return eorcStartEbrgId;
	}

	/**
	 * Set eorcStartEbrgId
	 */
	public void setEorcStartEbrgId(Long eorcStartEbrgId) {
		this.eorcStartEbrgId = eorcStartEbrgId;
		addValidField("eorcStartEbrgId");
	}

	/**
	 * Get eorcStartEbrgNo
	 */
	@Column(name = "EORC_START_EBRG_NO")
	public String getEorcStartEbrgNo() {
		return eorcStartEbrgNo;
	}

	/**
	 * Set eorcStartEbrgNo
	 */
	public void setEorcStartEbrgNo(String eorcStartEbrgNo) {
		this.eorcStartEbrgNo = eorcStartEbrgNo;
		addValidField("eorcStartEbrgNo");
	}

	/**
	 * Get eorcStartEbrgNameCn
	 */
	@Column(name = "EORC_START_EBRG_NAME_CN")
	public String getEorcStartEbrgNameCn() {
		return eorcStartEbrgNameCn;
	}

	/**
	 * Set eorcStartEbrgNameCn
	 */
	public void setEorcStartEbrgNameCn(String eorcStartEbrgNameCn) {
		this.eorcStartEbrgNameCn = eorcStartEbrgNameCn;
		addValidField("eorcStartEbrgNameCn");
	}

	/**
	 * Get eorcEndEbrgId
	 */
	@Column(name = "EORC_END_EBRG_ID")
	public Long getEorcEndEbrgId() {
		return eorcEndEbrgId;
	}

	/**
	 * Set eorcEndEbrgId
	 */
	public void setEorcEndEbrgId(Long eorcEndEbrgId) {
		this.eorcEndEbrgId = eorcEndEbrgId;
		addValidField("eorcEndEbrgId");
	}

	/**
	 * Get eorcEndEbrgNo
	 */
	@Column(name = "EORC_END_EBRG_NO")
	public String getEorcEndEbrgNo() {
		return eorcEndEbrgNo;
	}

	/**
	 * Set eorcEndEbrgNo
	 */
	public void setEorcEndEbrgNo(String eorcEndEbrgNo) {
		this.eorcEndEbrgNo = eorcEndEbrgNo;
		addValidField("eorcEndEbrgNo");
	}

	/**
	 * Get eorcEndEbrgNameCn
	 */
	@Column(name = "EORC_END_EBRG_NAME_CN")
	public String getEorcEndEbrgNameCn() {
		return eorcEndEbrgNameCn;
	}

	/**
	 * Set eorcEndEbrgNameCn
	 */
	public void setEorcEndEbrgNameCn(String eorcEndEbrgNameCn) {
		this.eorcEndEbrgNameCn = eorcEndEbrgNameCn;
		addValidField("eorcEndEbrgNameCn");
	}

	/**
	 * Get eorcEsdeId
	 */
	@Column(name = "EORC_ESDE_ID")
	public Long getEorcEsdeId() {
		return eorcEsdeId;
	}

	/**
	 * Set eorcEsdeId
	 */
	public void setEorcEsdeId(Long eorcEsdeId) {
		this.eorcEsdeId = eorcEsdeId;
		addValidField("eorcEsdeId");
	}

	/**
	 * Get eorcEsdeCode
	 */
	@Column(name = "EORC_ESDE_CODE")
	public String getEorcEsdeCode() {
		return eorcEsdeCode;
	}

	/**
	 * Set eorcEsdeCode
	 */
	public void setEorcEsdeCode(String eorcEsdeCode) {
		this.eorcEsdeCode = eorcEsdeCode;
		addValidField("eorcEsdeCode");
	}

	/**
	 * Get eorcEsdeName
	 */
	@Column(name = "EORC_ESDE_NAME")
	public String getEorcEsdeName() {
		return eorcEsdeName;
	}

	/**
	 * Set eorcEsdeName
	 */
	public void setEorcEsdeName(String eorcEsdeName) {
		this.eorcEsdeName = eorcEsdeName;
		addValidField("eorcEsdeName");
	}

	/**
	 * Get eorcSaleEsstId
	 */
	@Column(name = "EORC_SALE_ESST_ID")
	public Long getEorcSaleEsstId() {
		return eorcSaleEsstId;
	}

	/**
	 * Set eorcSaleEsstId
	 */
	public void setEorcSaleEsstId(Long eorcSaleEsstId) {
		this.eorcSaleEsstId = eorcSaleEsstId;
		addValidField("eorcSaleEsstId");
	}

	/**
	 * Get eorcSaleEsstCode
	 */
	@Column(name = "EORC_SALE_ESST_CODE")
	public String getEorcSaleEsstCode() {
		return eorcSaleEsstCode;
	}

	/**
	 * Set eorcSaleEsstCode
	 */
	public void setEorcSaleEsstCode(String eorcSaleEsstCode) {
		this.eorcSaleEsstCode = eorcSaleEsstCode;
		addValidField("eorcSaleEsstCode");
	}

	/**
	 * Get eorcSaleEsstName
	 */
	@Column(name = "EORC_SALE_ESST_NAME")
	public String getEorcSaleEsstName() {
		return eorcSaleEsstName;
	}

	/**
	 * Set eorcSaleEsstName
	 */
	public void setEorcSaleEsstName(String eorcSaleEsstName) {
		this.eorcSaleEsstName = eorcSaleEsstName;
		addValidField("eorcSaleEsstName");
	}

	/**
	 * Get eorcOperateEsstId
	 */
	@Column(name = "EORC_OPERATE_ESST_ID")
	public Long getEorcOperateEsstId() {
		return eorcOperateEsstId;
	}

	/**
	 * Set eorcOperateEsstId
	 */
	public void setEorcOperateEsstId(Long eorcOperateEsstId) {
		this.eorcOperateEsstId = eorcOperateEsstId;
		addValidField("eorcOperateEsstId");
	}

	/**
	 * Get eorcOperateEsstCode
	 */
	@Column(name = "EORC_OPERATE_ESST_CODE")
	public String getEorcOperateEsstCode() {
		return eorcOperateEsstCode;
	}

	/**
	 * Set eorcOperateEsstCode
	 */
	public void setEorcOperateEsstCode(String eorcOperateEsstCode) {
		this.eorcOperateEsstCode = eorcOperateEsstCode;
		addValidField("eorcOperateEsstCode");
	}

	/**
	 * Get eorcOperateEsstName
	 */
	@Column(name = "EORC_OPERATE_ESST_NAME")
	public String getEorcOperateEsstName() {
		return eorcOperateEsstName;
	}

	/**
	 * Set eorcOperateEsstName
	 */
	public void setEorcOperateEsstName(String eorcOperateEsstName) {
		this.eorcOperateEsstName = eorcOperateEsstName;
		addValidField("eorcOperateEsstName");
	}

	/**
	 * Get eorcDeliveryPeriod
	 */
	@Column(name = "EORC_DELIVERY_PERIOD")
	public String getEorcDeliveryPeriod() {
		return eorcDeliveryPeriod;
	}

	/**
	 * Set eorcDeliveryPeriod
	 */
	public void setEorcDeliveryPeriod(String eorcDeliveryPeriod) {
		this.eorcDeliveryPeriod = eorcDeliveryPeriod;
		addValidField("eorcDeliveryPeriod");
	}

	/**
	 * Get eorcArrivalPeriod
	 */
	@Column(name = "EORC_ARRIVAL_PERIOD")
	public String getEorcArrivalPeriod() {
		return eorcArrivalPeriod;
	}

	/**
	 * Set eorcArrivalPeriod
	 */
	public void setEorcArrivalPeriod(String eorcArrivalPeriod) {
		this.eorcArrivalPeriod = eorcArrivalPeriod;
		addValidField("eorcArrivalPeriod");
	}

	/**
	 * Get eorcOrderType
	 */
	@Column(name = "EORC_ORDER_TYPE")
	public String getEorcOrderType() {
		return eorcOrderType;
	}

	/**
	 * Set eorcOrderType
	 */
	public void setEorcOrderType(String eorcOrderType) {
		this.eorcOrderType = eorcOrderType;
		addValidField("eorcOrderType");
	}

	/**
	 * Get eorcShipperEbsaContact
	 */
	@Column(name = "EORC_SHIPPER_EBSA_CONTACT")
	public String getEorcShipperEbsaContact() {
		return eorcShipperEbsaContact;
	}

	/**
	 * Set eorcShipperEbsaContact
	 */
	public void setEorcShipperEbsaContact(String eorcShipperEbsaContact) {
		this.eorcShipperEbsaContact = eorcShipperEbsaContact;
		addValidField("eorcShipperEbsaContact");
	}

	/**
	 * Get eorcShipperEbsaTel
	 */
	@Column(name = "EORC_SHIPPER_EBSA_TEL")
	public String getEorcShipperEbsaTel() {
		return eorcShipperEbsaTel;
	}

	/**
	 * Set eorcShipperEbsaTel
	 */
	public void setEorcShipperEbsaTel(String eorcShipperEbsaTel) {
		this.eorcShipperEbsaTel = eorcShipperEbsaTel;
		addValidField("eorcShipperEbsaTel");
	}

	/**
	 * Get eorcConsigneeEbsaContact
	 */
	@Column(name = "EORC_CONSIGNEE_EBSA_CONTACT")
	public String getEorcConsigneeEbsaContact() {
		return eorcConsigneeEbsaContact;
	}

	/**
	 * Set eorcConsigneeEbsaContact
	 */
	public void setEorcConsigneeEbsaContact(String eorcConsigneeEbsaContact) {
		this.eorcConsigneeEbsaContact = eorcConsigneeEbsaContact;
		addValidField("eorcConsigneeEbsaContact");
	}

	/**
	 * Get eorcConsigneeEbsaTel
	 */
	@Column(name = "EORC_CONSIGNEE_EBSA_TEL")
	public String getEorcConsigneeEbsaTel() {
		return eorcConsigneeEbsaTel;
	}

	/**
	 * Set eorcConsigneeEbsaTel
	 */
	public void setEorcConsigneeEbsaTel(String eorcConsigneeEbsaTel) {
		this.eorcConsigneeEbsaTel = eorcConsigneeEbsaTel;
		addValidField("eorcConsigneeEbsaTel");
	}

	/**
	 * Get eorcTransReq
	 */
	@Column(name = "EORC_TRANS_REQ")
	public String getEorcTransReq() {
		return eorcTransReq;
	}

	/**
	 * Set eorcTransReq
	 */
	public void setEorcTransReq(String eorcTransReq) {
		this.eorcTransReq = eorcTransReq;
		addValidField("eorcTransReq");
	}

	/**
	 * Get eorcConsigneeReq
	 */
	@Column(name = "EORC_CONSIGNEE_REQ")
	public String getEorcConsigneeReq() {
		return eorcConsigneeReq;
	}

	/**
	 * Set eorcConsigneeReq
	 */
	public void setEorcConsigneeReq(String eorcConsigneeReq) {
		this.eorcConsigneeReq = eorcConsigneeReq;
		addValidField("eorcConsigneeReq");
	}

	/**
	 * Get eorcDocReq
	 */
	@Column(name = "EORC_DOC_REQ")
	public String getEorcDocReq() {
		return eorcDocReq;
	}

	/**
	 * Set eorcDocReq
	 */
	public void setEorcDocReq(String eorcDocReq) {
		this.eorcDocReq = eorcDocReq;
		addValidField("eorcDocReq");
	}

	/**
	 * Get eorcShipperEbsaPost
	 */
	@Column(name = "EORC_SHIPPER_EBSA_POST")
	public String getEorcShipperEbsaPost() {
		return eorcShipperEbsaPost;
	}

	/**
	 * Set eorcShipperEbsaPost
	 */
	public void setEorcShipperEbsaPost(String eorcShipperEbsaPost) {
		this.eorcShipperEbsaPost = eorcShipperEbsaPost;
		addValidField("eorcShipperEbsaPost");
	}

	/**
	 * Get eorcShipperEbplNameCn
	 */
	@Column(name = "EORC_SHIPPER_EBPL_NAME_CN")
	public String getEorcShipperEbplNameCn() {
		return eorcShipperEbplNameCn;
	}

	/**
	 * Set eorcShipperEbplNameCn
	 */
	public void setEorcShipperEbplNameCn(String eorcShipperEbplNameCn) {
		this.eorcShipperEbplNameCn = eorcShipperEbplNameCn;
		addValidField("eorcShipperEbplNameCn");
	}

	/**
	 * Get eorcConsigneeEbsaPost
	 */
	@Column(name = "EORC_CONSIGNEE_EBSA_POST")
	public String getEorcConsigneeEbsaPost() {
		return eorcConsigneeEbsaPost;
	}

	/**
	 * Set eorcConsigneeEbsaPost
	 */
	public void setEorcConsigneeEbsaPost(String eorcConsigneeEbsaPost) {
		this.eorcConsigneeEbsaPost = eorcConsigneeEbsaPost;
		addValidField("eorcConsigneeEbsaPost");
	}

	/**
	 * Get eorcConsigneeEbplNameCn
	 */
	@Column(name = "EORC_CONSIGNEE_EBPL_NAME_CN")
	public String getEorcConsigneeEbplNameCn() {
		return eorcConsigneeEbplNameCn;
	}

	/**
	 * Set eorcConsigneeEbplNameCn
	 */
	public void setEorcConsigneeEbplNameCn(String eorcConsigneeEbplNameCn) {
		this.eorcConsigneeEbplNameCn = eorcConsigneeEbplNameCn;
		addValidField("eorcConsigneeEbplNameCn");
	}

	/**
	 * Get eorcInTrust
	 */
	@Column(name = "EORC_IN_TRUST")
	public String getEorcInTrust() {
		return eorcInTrust;
	}

	/**
	 * Set eorcInTrust
	 */
	public void setEorcInTrust(String eorcInTrust) {
		this.eorcInTrust = eorcInTrust;
		addValidField("eorcInTrust");
	}

	/**
	 * Get eorcInTrustEscoCode
	 */
	@Column(name = "EORC_IN_TRUST_ESCO_CODE")
	public String getEorcInTrustEscoCode() {
		return eorcInTrustEscoCode;
	}

	/**
	 * Set eorcInTrustEscoCode
	 */
	public void setEorcInTrustEscoCode(String eorcInTrustEscoCode) {
		this.eorcInTrustEscoCode = eorcInTrustEscoCode;
		addValidField("eorcInTrustEscoCode");
	}

	/**
	 * Get eorcInTrustEscoName
	 */
	@Column(name = "EORC_IN_TRUST_ESCO_NAME")
	public String getEorcInTrustEscoName() {
		return eorcInTrustEscoName;
	}

	/**
	 * Set eorcInTrustEscoName
	 */
	public void setEorcInTrustEscoName(String eorcInTrustEscoName) {
		this.eorcInTrustEscoName = eorcInTrustEscoName;
		addValidField("eorcInTrustEscoName");
	}

	/**
	 * Get eorcInTrustEsstCode
	 */
	@Column(name = "EORC_IN_TRUST_ESST_CODE")
	public String getEorcInTrustEsstCode() {
		return eorcInTrustEsstCode;
	}

	/**
	 * Set eorcInTrustEsstCode
	 */
	public void setEorcInTrustEsstCode(String eorcInTrustEsstCode) {
		this.eorcInTrustEsstCode = eorcInTrustEsstCode;
		addValidField("eorcInTrustEsstCode");
	}

	/**
	 * Get eorcInTrustEsstName
	 */
	@Column(name = "EORC_IN_TRUST_ESST_NAME")
	public String getEorcInTrustEsstName() {
		return eorcInTrustEsstName;
	}

	/**
	 * Set eorcInTrustEsstName
	 */
	public void setEorcInTrustEsstName(String eorcInTrustEsstName) {
		this.eorcInTrustEsstName = eorcInTrustEsstName;
		addValidField("eorcInTrustEsstName");
	}

	/**
	 * Get eorcPaymentMode
	 */
	@Column(name = "EORC_PAYMENT_MODE")
	public String getEorcPaymentMode() {
		return eorcPaymentMode;
	}

	/**
	 * Set eorcPaymentMode
	 */
	public void setEorcPaymentMode(String eorcPaymentMode) {
		this.eorcPaymentMode = eorcPaymentMode;
		addValidField("eorcPaymentMode");
	}

	/**
	 * Get eorcChargeoff
	 */
	@Column(name = "EORC_CHARGEOFF")
	public String getEorcChargeoff() {
		return eorcChargeoff;
	}

	/**
	 * Set eorcChargeoff
	 */
	public void setEorcChargeoff(String eorcChargeoff) {
		this.eorcChargeoff = eorcChargeoff;
		addValidField("eorcChargeoff");
	}

	/**
	 * Get eorcReceiptReturntype
	 */
	@Column(name = "EORC_RECEIPT_RETURNTYPE")
	public Long getEorcReceiptReturntype() {
		return eorcReceiptReturntype;
	}

	/**
	 * Set eorcReceiptReturntype
	 */
	public void setEorcReceiptReturntype(Long eorcReceiptReturntype) {
		this.eorcReceiptReturntype = eorcReceiptReturntype;
		addValidField("eorcReceiptReturntype");
	}

	/**
	 * Get eorcExternalCarriersId
	 */
	@Column(name = "EORC_EXTERNAL_CARRIERS_ID")
	public Long getEorcExternalCarriersId() {
		return eorcExternalCarriersId;
	}

	/**
	 * Set eorcExternalCarriersId
	 */
	public void setEorcExternalCarriersId(Long eorcExternalCarriersId) {
		this.eorcExternalCarriersId = eorcExternalCarriersId;
		addValidField("eorcExternalCarriersId");
	}

	/**
	 * Get eorcExternalCarriersCode
	 */
	@Column(name = "EORC_EXTERNAL_CARRIERS_CODE")
	public String getEorcExternalCarriersCode() {
		return eorcExternalCarriersCode;
	}

	/**
	 * Set eorcExternalCarriersCode
	 */
	public void setEorcExternalCarriersCode(String eorcExternalCarriersCode) {
		this.eorcExternalCarriersCode = eorcExternalCarriersCode;
		addValidField("eorcExternalCarriersCode");
	}

	/**
	 * Get eorcExternalCarriersName
	 */
	@Column(name = "EORC_EXTERNAL_CARRIERS_NAME")
	public String getEorcExternalCarriersName() {
		return eorcExternalCarriersName;
	}

	/**
	 * Set eorcExternalCarriersName
	 */
	public void setEorcExternalCarriersName(String eorcExternalCarriersName) {
		this.eorcExternalCarriersName = eorcExternalCarriersName;
		addValidField("eorcExternalCarriersName");
	}

	/**
	 * Get eorcSubstr9
	 */
	@Column(name = "EORC_SUBSTR9")
	public String getEorcSubstr9() {
		return eorcSubstr9;
	}

	/**
	 * Set eorcSubstr9
	 */
	public void setEorcSubstr9(String eorcSubstr9) {
		this.eorcSubstr9 = eorcSubstr9;
		addValidField("eorcSubstr9");
	}

	/**
	 * Get eorcSubstr10
	 */
	@Column(name = "EORC_SUBSTR10")
	public String getEorcSubstr10() {
		return eorcSubstr10;
	}

	/**
	 * Set eorcSubstr10
	 */
	public void setEorcSubstr10(String eorcSubstr10) {
		this.eorcSubstr10 = eorcSubstr10;
		addValidField("eorcSubstr10");
	}

	/**
	 * Get eorcSubstr11
	 */
	@Column(name = "EORC_SUBSTR11")
	public String getEorcSubstr11() {
		return eorcSubstr11;
	}

	/**
	 * Set eorcSubstr11
	 */
	public void setEorcSubstr11(String eorcSubstr11) {
		this.eorcSubstr11 = eorcSubstr11;
		addValidField("eorcSubstr11");
	}

	/**
	 * Get eorcSubstr12
	 */
	@Column(name = "EORC_SUBSTR12")
	public String getEorcSubstr12() {
		return eorcSubstr12;
	}

	/**
	 * Set eorcSubstr12
	 */
	public void setEorcSubstr12(String eorcSubstr12) {
		this.eorcSubstr12 = eorcSubstr12;
		addValidField("eorcSubstr12");
	}

	/**
	 * Get eorcSubstr13
	 */
	@Column(name = "EORC_SUBSTR13")
	public String getEorcSubstr13() {
		return eorcSubstr13;
	}

	/**
	 * Set eorcSubstr13
	 */
	public void setEorcSubstr13(String eorcSubstr13) {
		this.eorcSubstr13 = eorcSubstr13;
		addValidField("eorcSubstr13");
	}

	/**
	 * Get eorcSubstr14
	 */
	@Column(name = "EORC_SUBSTR14")
	public String getEorcSubstr14() {
		return eorcSubstr14;
	}

	/**
	 * Set eorcSubstr14
	 */
	public void setEorcSubstr14(String eorcSubstr14) {
		this.eorcSubstr14 = eorcSubstr14;
		addValidField("eorcSubstr14");
	}

	/**
	 * Get eorcSubstr15
	 */
	@Column(name = "EORC_SUBSTR15")
	public String getEorcSubstr15() {
		return eorcSubstr15;
	}

	/**
	 * Set eorcSubstr15
	 */
	public void setEorcSubstr15(String eorcSubstr15) {
		this.eorcSubstr15 = eorcSubstr15;
		addValidField("eorcSubstr15");
	}

	/**
	 * Get eorcSubstr16
	 */
	@Column(name = "EORC_SUBSTR16")
	public String getEorcSubstr16() {
		return eorcSubstr16;
	}

	/**
	 * Set eorcSubstr16
	 */
	public void setEorcSubstr16(String eorcSubstr16) {
		this.eorcSubstr16 = eorcSubstr16;
		addValidField("eorcSubstr16");
	}

	/**
	 * Get eorcSubdate5
	 */
	@Column(name = "EORC_SUBDATE5")
	public Date getEorcSubdate5() {
		return eorcSubdate5;
	}

	/**
	 * Set eorcSubdate5
	 */
	public void setEorcSubdate5(Date eorcSubdate5) {
		this.eorcSubdate5 = eorcSubdate5;
		addValidField("eorcSubdate5");
	}

	/**
	 * Get eorcSubdate6
	 */
	@Column(name = "EORC_SUBDATE6")
	public Date getEorcSubdate6() {
		return eorcSubdate6;
	}

	/**
	 * Set eorcSubdate6
	 */
	public void setEorcSubdate6(Date eorcSubdate6) {
		this.eorcSubdate6 = eorcSubdate6;
		addValidField("eorcSubdate6");
	}

	/**
	 * Get eorcSubnum5
	 */
	@Column(name = "EORC_SUBNUM5")
	public Long getEorcSubnum5() {
		return eorcSubnum5;
	}

	/**
	 * Set eorcSubnum5
	 */
	public void setEorcSubnum5(Long eorcSubnum5) {
		this.eorcSubnum5 = eorcSubnum5;
		addValidField("eorcSubnum5");
	}

	/**
	 * Get eorcSubnum6
	 */
	@Column(name = "EORC_SUBNUM6")
	public Long getEorcSubnum6() {
		return eorcSubnum6;
	}

	/**
	 * Set eorcSubnum6
	 */
	public void setEorcSubnum6(Long eorcSubnum6) {
		this.eorcSubnum6 = eorcSubnum6;
		addValidField("eorcSubnum6");
	}

	/**
	 * Get eorcEscoCode
	 */
	@Column(name = "EORC_ESCO_CODE")
	public String getEorcEscoCode() {
		return eorcEscoCode;
	}

	/**
	 * Set eorcEscoCode
	 */
	public void setEorcEscoCode(String eorcEscoCode) {
		this.eorcEscoCode = eorcEscoCode;
		addValidField("eorcEscoCode");
	}

	/**
	 * Get eorcEscoNameCn
	 */
	@Column(name = "EORC_ESCO_NAME_CN")
	public String getEorcEscoNameCn() {
		return eorcEscoNameCn;
	}

	/**
	 * Set eorcEscoNameCn
	 */
	public void setEorcEscoNameCn(String eorcEscoNameCn) {
		this.eorcEscoNameCn = eorcEscoNameCn;
		addValidField("eorcEscoNameCn");
	}

	/**
	 * Get eorcEsdeDepartmentCode
	 */
	@Column(name = "EORC_ESDE_DEPARTMENT_CODE")
	public String getEorcEsdeDepartmentCode() {
		return eorcEsdeDepartmentCode;
	}

	/**
	 * Set eorcEsdeDepartmentCode
	 */
	public void setEorcEsdeDepartmentCode(String eorcEsdeDepartmentCode) {
		this.eorcEsdeDepartmentCode = eorcEsdeDepartmentCode;
		addValidField("eorcEsdeDepartmentCode");
	}

	/**
	 * Get eorcEsdeDepartmentName
	 */
	@Column(name = "EORC_ESDE_DEPARTMENT_NAME")
	public String getEorcEsdeDepartmentName() {
		return eorcEsdeDepartmentName;
	}

	/**
	 * Set eorcEsdeDepartmentName
	 */
	public void setEorcEsdeDepartmentName(String eorcEsdeDepartmentName) {
		this.eorcEsdeDepartmentName = eorcEsdeDepartmentName;
		addValidField("eorcEsdeDepartmentName");
	}

	/**
	 * Get eorcEsusUserNameCn
	 */
	@Column(name = "EORC_ESUS_USER_NAME_CN")
	public String getEorcEsusUserNameCn() {
		return eorcEsusUserNameCn;
	}

	/**
	 * Set eorcEsusUserNameCn
	 */
	public void setEorcEsusUserNameCn(String eorcEsusUserNameCn) {
		this.eorcEsusUserNameCn = eorcEsusUserNameCn;
		addValidField("eorcEsusUserNameCn");
	}

	/**
	 * Get eorcRetoType
	 */
	@Column(name = "EORC_RETO_TYPE")
	public Long getEorcRetoType() {
		return eorcRetoType;
	}

	/**
	 * Set eorcRetoType
	 */
	public void setEorcRetoType(Long eorcRetoType) {
		this.eorcRetoType = eorcRetoType;
		addValidField("eorcRetoType");
	}

	/**
	 * Get eorcIsReceive
	 */
	@Column(name = "EORC_IS_RECEIVE")
	public String getEorcIsReceive() {
		return eorcIsReceive;
	}

	/**
	 * Set eorcIsReceive
	 */
	public void setEorcIsReceive(String eorcIsReceive) {
		this.eorcIsReceive = eorcIsReceive;
		addValidField("eorcIsReceive");
	}

}
