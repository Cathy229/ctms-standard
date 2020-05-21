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
 * Model class for EoEooc2Eoet
 */
@Entity
@Table(name = "EO_EOOC_2_EOET")
public class EoEooc2EoetModel extends BaseModel implements OperationLog {

	//eootId
	private Long eootId;
	//eootEoetId
	private Long eootEoetId;
	//eootEoocId
	private Long eootEoocId;
	//eootContainerNo
	private String eootContainerNo;
	//eootSize
	private String eootSize;
	//eootStandard
	private String eootStandard;
	//eootSealsNo
	private String eootSealsNo;
	//eootSoc
	private String eootSoc;
	//eootContainerOperateId
	private Long eootContainerOperateId;
	//eootContainerOperateCode
	private String eootContainerOperateCode;
	//eootContainerOperateName
	private String eootContainerOperateName;
	//eootSuitcasePlaceId
	private Long eootSuitcasePlaceId;
	//eootSuitcasePlaceCode
	private String eootSuitcasePlaceCode;
	//eootSuitcasePlaceName
	private String eootSuitcasePlaceName;
	//eootDeliveryPlaceId
	private Long eootDeliveryPlaceId;
	//eootDeliveryPlaceCode
	private String eootDeliveryPlaceCode;
	//eootDeliveryPlaceName
	private String eootDeliveryPlaceName;
	//eootShipperEbsaId
	private Long eootShipperEbsaId;
	//eootDeliveryPlaceAddress
	private String eootDeliveryPlaceAddress;
	//eootEbsaContact
	private String eootEbsaContact;
	//eootEbsaTel
	private String eootEbsaTel;
	//eootCollectPortId
	private Long eootCollectPortId;
	//eootCollectPortCode
	private String eootCollectPortCode;
	//eootCollectPortName
	private String eootCollectPortName;
	//eootIsWithin
	private String eootIsWithin;
	//eootCarrierEbcuId
	private Long eootCarrierEbcuId;
	//eootCarrierEbcuCode
	private String eootCarrierEbcuCode;
	//eootCarrierEbcuNameCn
	private String eootCarrierEbcuNameCn;
	//eootEbmaId
	private Long eootEbmaId;
	//eootEbmaCode
	private String eootEbmaCode;
	//eootEbmaName
	private String eootEbmaName;
	//eootContainerTime
	private Date eootContainerTime;
	//eootReqArrivalDate
	private Date eootReqArrivalDate;
	//eootSetPostTime
	private Date eootSetPostTime;
	//eootTractorEtveCard
	private String eootTractorEtveCard;
	//eootTrailerEtveCard
	private String eootTrailerEtveCard;
	//eootMainEttpName
	private String eootMainEttpName;
	//eootMainCardNo
	private String eootMainCardNo;
	//eootRemark
	private String eootRemark;
	//eootSubstr1
	private String eootSubstr1;
	//eootSubstr2
	private String eootSubstr2;
	//eootSubstr3
	private String eootSubstr3;
	//eootSubstr4
	private String eootSubstr4;
	//eootSubdate1
	private Date eootSubdate1;
	//eootSubdate2
	private Date eootSubdate2;
	//eootSubnum1
	private Long eootSubnum1;
	//eootSubnum2
	private Long eootSubnum2;
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
	//eootToMrId
	private Long eootToMrId;
	//eootYetEbrgId
	private Long eootYetEbrgId;
	//eootYetEbrgNo
	private String eootYetEbrgNo;
	//eootYetNameCn
	private String eootYetNameCn;
	//eootOutSationDate
	private Date eootOutSationDate;
	//eootPlanFactoryDate
	private Date eootPlanFactoryDate;
	//eootTrainsArriveDate
	private Date eootTrainsArriveDate;
	//eootHeavyBoxApproachDate
	private Date eootHeavyBoxApproachDate;
	//eootTrainsDepartureDate
	private Date eootTrainsDepartureDate;
	//eootActualToFactoryDate
	private Date eootActualToFactoryDate;
	//eootSubdate3
	private Date eootSubdate3;
	//eootSubdate4
	private Date eootSubdate4;
	//eootCntWeight
	private Double eootCntWeight;
	//eootVgmGrossWeight
	private Double eootVgmGrossWeight;
	//eootSealsNo3
	private String eootSealsNo3;
	//eootSealsNo2
	private String eootSealsNo2;
	//eootQuantity
	private Long eootQuantity;
	//eootWeight
	private Double eootWeight;
	//eootVolume
	private Double eootVolume;
	//eootIsLcl
	private String eootIsLcl;

	/**
	 * Get eootId
	 */
	@Column(name = "EOOT_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEootId() {
		return eootId;
	}

	/**
	 * Set eootId
	 */
	public void setEootId(Long eootId) {
		this.eootId = eootId;
		addValidField("eootId");
	}

	/**
	 * Get eootEoetId
	 */
	@Column(name = "EOOT_EOET_ID")
	public Long getEootEoetId() {
		return eootEoetId;
	}

	/**
	 * Set eootEoetId
	 */
	public void setEootEoetId(Long eootEoetId) {
		this.eootEoetId = eootEoetId;
		addValidField("eootEoetId");
	}

	/**
	 * Get eootEoocId
	 */
	@Column(name = "EOOT_EOOC_ID")
	public Long getEootEoocId() {
		return eootEoocId;
	}

	/**
	 * Set eootEoocId
	 */
	public void setEootEoocId(Long eootEoocId) {
		this.eootEoocId = eootEoocId;
		addValidField("eootEoocId");
	}

	/**
	 * Get eootContainerNo
	 */
	@Column(name = "EOOT_CONTAINER_NO")
	public String getEootContainerNo() {
		return eootContainerNo;
	}

	/**
	 * Set eootContainerNo
	 */
	public void setEootContainerNo(String eootContainerNo) {
		this.eootContainerNo = eootContainerNo;
		addValidField("eootContainerNo");
	}

	/**
	 * Get eootSize
	 */
	@Column(name = "EOOT_SIZE")
	public String getEootSize() {
		return eootSize;
	}

	/**
	 * Set eootSize
	 */
	public void setEootSize(String eootSize) {
		this.eootSize = eootSize;
		addValidField("eootSize");
	}

	/**
	 * Get eootStandard
	 */
	@Column(name = "EOOT_STANDARD")
	public String getEootStandard() {
		return eootStandard;
	}

	/**
	 * Set eootStandard
	 */
	public void setEootStandard(String eootStandard) {
		this.eootStandard = eootStandard;
		addValidField("eootStandard");
	}

	/**
	 * Get eootSealsNo
	 */
	@Column(name = "EOOT_SEALS_NO")
	public String getEootSealsNo() {
		return eootSealsNo;
	}

	/**
	 * Set eootSealsNo
	 */
	public void setEootSealsNo(String eootSealsNo) {
		this.eootSealsNo = eootSealsNo;
		addValidField("eootSealsNo");
	}

	/**
	 * Get eootSoc
	 */
	@Column(name = "EOOT_SOC")
	public String getEootSoc() {
		return eootSoc;
	}

	/**
	 * Set eootSoc
	 */
	public void setEootSoc(String eootSoc) {
		this.eootSoc = eootSoc;
		addValidField("eootSoc");
	}

	/**
	 * Get eootContainerOperateId
	 */
	@Column(name = "EOOT_CONTAINER_OPERATE_ID")
	public Long getEootContainerOperateId() {
		return eootContainerOperateId;
	}

	/**
	 * Set eootContainerOperateId
	 */
	public void setEootContainerOperateId(Long eootContainerOperateId) {
		this.eootContainerOperateId = eootContainerOperateId;
		addValidField("eootContainerOperateId");
	}

	/**
	 * Get eootContainerOperateCode
	 */
	@Column(name = "EOOT_CONTAINER_OPERATE_CODE")
	public String getEootContainerOperateCode() {
		return eootContainerOperateCode;
	}

	/**
	 * Set eootContainerOperateCode
	 */
	public void setEootContainerOperateCode(String eootContainerOperateCode) {
		this.eootContainerOperateCode = eootContainerOperateCode;
		addValidField("eootContainerOperateCode");
	}

	/**
	 * Get eootContainerOperateName
	 */
	@Column(name = "EOOT_CONTAINER_OPERATE_NAME")
	public String getEootContainerOperateName() {
		return eootContainerOperateName;
	}

	/**
	 * Set eootContainerOperateName
	 */
	public void setEootContainerOperateName(String eootContainerOperateName) {
		this.eootContainerOperateName = eootContainerOperateName;
		addValidField("eootContainerOperateName");
	}

	/**
	 * Get eootSuitcasePlaceId
	 */
	@Column(name = "EOOT_SUITCASE_PLACE_ID")
	public Long getEootSuitcasePlaceId() {
		return eootSuitcasePlaceId;
	}

	/**
	 * Set eootSuitcasePlaceId
	 */
	public void setEootSuitcasePlaceId(Long eootSuitcasePlaceId) {
		this.eootSuitcasePlaceId = eootSuitcasePlaceId;
		addValidField("eootSuitcasePlaceId");
	}

	/**
	 * Get eootSuitcasePlaceCode
	 */
	@Column(name = "EOOT_SUITCASE_PLACE_CODE")
	public String getEootSuitcasePlaceCode() {
		return eootSuitcasePlaceCode;
	}

	/**
	 * Set eootSuitcasePlaceCode
	 */
	public void setEootSuitcasePlaceCode(String eootSuitcasePlaceCode) {
		this.eootSuitcasePlaceCode = eootSuitcasePlaceCode;
		addValidField("eootSuitcasePlaceCode");
	}

	/**
	 * Get eootSuitcasePlaceName
	 */
	@Column(name = "EOOT_SUITCASE_PLACE_NAME")
	public String getEootSuitcasePlaceName() {
		return eootSuitcasePlaceName;
	}

	/**
	 * Set eootSuitcasePlaceName
	 */
	public void setEootSuitcasePlaceName(String eootSuitcasePlaceName) {
		this.eootSuitcasePlaceName = eootSuitcasePlaceName;
		addValidField("eootSuitcasePlaceName");
	}

	/**
	 * Get eootDeliveryPlaceId
	 */
	@Column(name = "EOOT_DELIVERY_PLACE_ID")
	public Long getEootDeliveryPlaceId() {
		return eootDeliveryPlaceId;
	}

	/**
	 * Set eootDeliveryPlaceId
	 */
	public void setEootDeliveryPlaceId(Long eootDeliveryPlaceId) {
		this.eootDeliveryPlaceId = eootDeliveryPlaceId;
		addValidField("eootDeliveryPlaceId");
	}

	/**
	 * Get eootDeliveryPlaceCode
	 */
	@Column(name = "EOOT_DELIVERY_PLACE_CODE")
	public String getEootDeliveryPlaceCode() {
		return eootDeliveryPlaceCode;
	}

	/**
	 * Set eootDeliveryPlaceCode
	 */
	public void setEootDeliveryPlaceCode(String eootDeliveryPlaceCode) {
		this.eootDeliveryPlaceCode = eootDeliveryPlaceCode;
		addValidField("eootDeliveryPlaceCode");
	}

	/**
	 * Get eootDeliveryPlaceName
	 */
	@Column(name = "EOOT_DELIVERY_PLACE_NAME")
	public String getEootDeliveryPlaceName() {
		return eootDeliveryPlaceName;
	}

	/**
	 * Set eootDeliveryPlaceName
	 */
	public void setEootDeliveryPlaceName(String eootDeliveryPlaceName) {
		this.eootDeliveryPlaceName = eootDeliveryPlaceName;
		addValidField("eootDeliveryPlaceName");
	}

	/**
	 * Get eootShipperEbsaId
	 */
	@Column(name = "EOOT_SHIPPER_EBSA_ID")
	public Long getEootShipperEbsaId() {
		return eootShipperEbsaId;
	}

	/**
	 * Set eootShipperEbsaId
	 */
	public void setEootShipperEbsaId(Long eootShipperEbsaId) {
		this.eootShipperEbsaId = eootShipperEbsaId;
		addValidField("eootShipperEbsaId");
	}

	/**
	 * Get eootDeliveryPlaceAddress
	 */
	@Column(name = "EOOT_DELIVERY_PLACE_ADDRESS")
	public String getEootDeliveryPlaceAddress() {
		return eootDeliveryPlaceAddress;
	}

	/**
	 * Set eootDeliveryPlaceAddress
	 */
	public void setEootDeliveryPlaceAddress(String eootDeliveryPlaceAddress) {
		this.eootDeliveryPlaceAddress = eootDeliveryPlaceAddress;
		addValidField("eootDeliveryPlaceAddress");
	}

	/**
	 * Get eootEbsaContact
	 */
	@Column(name = "EOOT_EBSA_CONTACT")
	public String getEootEbsaContact() {
		return eootEbsaContact;
	}

	/**
	 * Set eootEbsaContact
	 */
	public void setEootEbsaContact(String eootEbsaContact) {
		this.eootEbsaContact = eootEbsaContact;
		addValidField("eootEbsaContact");
	}

	/**
	 * Get eootEbsaTel
	 */
	@Column(name = "EOOT_EBSA_TEL")
	public String getEootEbsaTel() {
		return eootEbsaTel;
	}

	/**
	 * Set eootEbsaTel
	 */
	public void setEootEbsaTel(String eootEbsaTel) {
		this.eootEbsaTel = eootEbsaTel;
		addValidField("eootEbsaTel");
	}

	/**
	 * Get eootCollectPortId
	 */
	@Column(name = "EOOT_COLLECT_PORT_ID")
	public Long getEootCollectPortId() {
		return eootCollectPortId;
	}

	/**
	 * Set eootCollectPortId
	 */
	public void setEootCollectPortId(Long eootCollectPortId) {
		this.eootCollectPortId = eootCollectPortId;
		addValidField("eootCollectPortId");
	}

	/**
	 * Get eootCollectPortCode
	 */
	@Column(name = "EOOT_COLLECT_PORT_CODE")
	public String getEootCollectPortCode() {
		return eootCollectPortCode;
	}

	/**
	 * Set eootCollectPortCode
	 */
	public void setEootCollectPortCode(String eootCollectPortCode) {
		this.eootCollectPortCode = eootCollectPortCode;
		addValidField("eootCollectPortCode");
	}

	/**
	 * Get eootCollectPortName
	 */
	@Column(name = "EOOT_COLLECT_PORT_NAME")
	public String getEootCollectPortName() {
		return eootCollectPortName;
	}

	/**
	 * Set eootCollectPortName
	 */
	public void setEootCollectPortName(String eootCollectPortName) {
		this.eootCollectPortName = eootCollectPortName;
		addValidField("eootCollectPortName");
	}

	/**
	 * Get eootIsWithin
	 */
	@Column(name = "EOOT_IS_WITHIN")
	public String getEootIsWithin() {
		return eootIsWithin;
	}

	/**
	 * Set eootIsWithin
	 */
	public void setEootIsWithin(String eootIsWithin) {
		this.eootIsWithin = eootIsWithin;
		addValidField("eootIsWithin");
	}

	/**
	 * Get eootCarrierEbcuId
	 */
	@Column(name = "EOOT_CARRIER_EBCU_ID")
	public Long getEootCarrierEbcuId() {
		return eootCarrierEbcuId;
	}

	/**
	 * Set eootCarrierEbcuId
	 */
	public void setEootCarrierEbcuId(Long eootCarrierEbcuId) {
		this.eootCarrierEbcuId = eootCarrierEbcuId;
		addValidField("eootCarrierEbcuId");
	}

	/**
	 * Get eootCarrierEbcuCode
	 */
	@Column(name = "EOOT_CARRIER_EBCU_CODE")
	public String getEootCarrierEbcuCode() {
		return eootCarrierEbcuCode;
	}

	/**
	 * Set eootCarrierEbcuCode
	 */
	public void setEootCarrierEbcuCode(String eootCarrierEbcuCode) {
		this.eootCarrierEbcuCode = eootCarrierEbcuCode;
		addValidField("eootCarrierEbcuCode");
	}

	/**
	 * Get eootCarrierEbcuNameCn
	 */
	@Column(name = "EOOT_CARRIER_EBCU_NAME_CN")
	public String getEootCarrierEbcuNameCn() {
		return eootCarrierEbcuNameCn;
	}

	/**
	 * Set eootCarrierEbcuNameCn
	 */
	public void setEootCarrierEbcuNameCn(String eootCarrierEbcuNameCn) {
		this.eootCarrierEbcuNameCn = eootCarrierEbcuNameCn;
		addValidField("eootCarrierEbcuNameCn");
	}

	/**
	 * Get eootEbmaId
	 */
	@Column(name = "EOOT_EBMA_ID")
	public Long getEootEbmaId() {
		return eootEbmaId;
	}

	/**
	 * Set eootEbmaId
	 */
	public void setEootEbmaId(Long eootEbmaId) {
		this.eootEbmaId = eootEbmaId;
		addValidField("eootEbmaId");
	}

	/**
	 * Get eootEbmaCode
	 */
	@Column(name = "EOOT_EBMA_CODE")
	public String getEootEbmaCode() {
		return eootEbmaCode;
	}

	/**
	 * Set eootEbmaCode
	 */
	public void setEootEbmaCode(String eootEbmaCode) {
		this.eootEbmaCode = eootEbmaCode;
		addValidField("eootEbmaCode");
	}

	/**
	 * Get eootEbmaName
	 */
	@Column(name = "EOOT_EBMA_NAME")
	public String getEootEbmaName() {
		return eootEbmaName;
	}

	/**
	 * Set eootEbmaName
	 */
	public void setEootEbmaName(String eootEbmaName) {
		this.eootEbmaName = eootEbmaName;
		addValidField("eootEbmaName");
	}

	/**
	 * Get eootContainerTime
	 */
	@Column(name = "EOOT_CONTAINER_TIME")
	public Date getEootContainerTime() {
		return eootContainerTime;
	}

	/**
	 * Set eootContainerTime
	 */
	public void setEootContainerTime(Date eootContainerTime) {
		this.eootContainerTime = eootContainerTime;
		addValidField("eootContainerTime");
	}

	/**
	 * Get eootReqArrivalDate
	 */
	@Column(name = "EOOT_REQ_ARRIVAL_DATE")
	public Date getEootReqArrivalDate() {
		return eootReqArrivalDate;
	}

	/**
	 * Set eootReqArrivalDate
	 */
	public void setEootReqArrivalDate(Date eootReqArrivalDate) {
		this.eootReqArrivalDate = eootReqArrivalDate;
		addValidField("eootReqArrivalDate");
	}

	/**
	 * Get eootSetPostTime
	 */
	@Column(name = "EOOT_SET_POST_TIME")
	public Date getEootSetPostTime() {
		return eootSetPostTime;
	}

	/**
	 * Set eootSetPostTime
	 */
	public void setEootSetPostTime(Date eootSetPostTime) {
		this.eootSetPostTime = eootSetPostTime;
		addValidField("eootSetPostTime");
	}

	/**
	 * Get eootTractorEtveCard
	 */
	@Column(name = "EOOT_TRACTOR_ETVE_CARD")
	public String getEootTractorEtveCard() {
		return eootTractorEtveCard;
	}

	/**
	 * Set eootTractorEtveCard
	 */
	public void setEootTractorEtveCard(String eootTractorEtveCard) {
		this.eootTractorEtveCard = eootTractorEtveCard;
		addValidField("eootTractorEtveCard");
	}

	/**
	 * Get eootTrailerEtveCard
	 */
	@Column(name = "EOOT_TRAILER_ETVE_CARD")
	public String getEootTrailerEtveCard() {
		return eootTrailerEtveCard;
	}

	/**
	 * Set eootTrailerEtveCard
	 */
	public void setEootTrailerEtveCard(String eootTrailerEtveCard) {
		this.eootTrailerEtveCard = eootTrailerEtveCard;
		addValidField("eootTrailerEtveCard");
	}

	/**
	 * Get eootMainEttpName
	 */
	@Column(name = "EOOT_MAIN_ETTP_NAME")
	public String getEootMainEttpName() {
		return eootMainEttpName;
	}

	/**
	 * Set eootMainEttpName
	 */
	public void setEootMainEttpName(String eootMainEttpName) {
		this.eootMainEttpName = eootMainEttpName;
		addValidField("eootMainEttpName");
	}

	/**
	 * Get eootMainCardNo
	 */
	@Column(name = "EOOT_MAIN_CARD_NO")
	public String getEootMainCardNo() {
		return eootMainCardNo;
	}

	/**
	 * Set eootMainCardNo
	 */
	public void setEootMainCardNo(String eootMainCardNo) {
		this.eootMainCardNo = eootMainCardNo;
		addValidField("eootMainCardNo");
	}

	/**
	 * Get eootRemark
	 */
	@Column(name = "EOOT_REMARK")
	public String getEootRemark() {
		return eootRemark;
	}

	/**
	 * Set eootRemark
	 */
	public void setEootRemark(String eootRemark) {
		this.eootRemark = eootRemark;
		addValidField("eootRemark");
	}

	/**
	 * Get eootSubstr1
	 */
	@Column(name = "EOOT_SUBSTR1")
	public String getEootSubstr1() {
		return eootSubstr1;
	}

	/**
	 * Set eootSubstr1
	 */
	public void setEootSubstr1(String eootSubstr1) {
		this.eootSubstr1 = eootSubstr1;
		addValidField("eootSubstr1");
	}

	/**
	 * Get eootSubstr2
	 */
	@Column(name = "EOOT_SUBSTR2")
	public String getEootSubstr2() {
		return eootSubstr2;
	}

	/**
	 * Set eootSubstr2
	 */
	public void setEootSubstr2(String eootSubstr2) {
		this.eootSubstr2 = eootSubstr2;
		addValidField("eootSubstr2");
	}

	/**
	 * Get eootSubstr3
	 */
	@Column(name = "EOOT_SUBSTR3")
	public String getEootSubstr3() {
		return eootSubstr3;
	}

	/**
	 * Set eootSubstr3
	 */
	public void setEootSubstr3(String eootSubstr3) {
		this.eootSubstr3 = eootSubstr3;
		addValidField("eootSubstr3");
	}

	/**
	 * Get eootSubstr4
	 */
	@Column(name = "EOOT_SUBSTR4")
	public String getEootSubstr4() {
		return eootSubstr4;
	}

	/**
	 * Set eootSubstr4
	 */
	public void setEootSubstr4(String eootSubstr4) {
		this.eootSubstr4 = eootSubstr4;
		addValidField("eootSubstr4");
	}

	/**
	 * Get eootSubdate1
	 */
	@Column(name = "EOOT_SUBDATE1")
	public Date getEootSubdate1() {
		return eootSubdate1;
	}

	/**
	 * Set eootSubdate1
	 */
	public void setEootSubdate1(Date eootSubdate1) {
		this.eootSubdate1 = eootSubdate1;
		addValidField("eootSubdate1");
	}

	/**
	 * Get eootSubdate2
	 */
	@Column(name = "EOOT_SUBDATE2")
	public Date getEootSubdate2() {
		return eootSubdate2;
	}

	/**
	 * Set eootSubdate2
	 */
	public void setEootSubdate2(Date eootSubdate2) {
		this.eootSubdate2 = eootSubdate2;
		addValidField("eootSubdate2");
	}

	/**
	 * Get eootSubnum1
	 */
	@Column(name = "EOOT_SUBNUM1")
	public Long getEootSubnum1() {
		return eootSubnum1;
	}

	/**
	 * Set eootSubnum1
	 */
	public void setEootSubnum1(Long eootSubnum1) {
		this.eootSubnum1 = eootSubnum1;
		addValidField("eootSubnum1");
	}

	/**
	 * Get eootSubnum2
	 */
	@Column(name = "EOOT_SUBNUM2")
	public Long getEootSubnum2() {
		return eootSubnum2;
	}

	/**
	 * Set eootSubnum2
	 */
	public void setEootSubnum2(Long eootSubnum2) {
		this.eootSubnum2 = eootSubnum2;
		addValidField("eootSubnum2");
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
	 * Get eootToMrId
	 */
	@Column(name = "EOOT_TO_MR_ID")
	public Long getEootToMrId() {
		return eootToMrId;
	}

	/**
	 * Set eootToMrId
	 */
	public void setEootToMrId(Long eootToMrId) {
		this.eootToMrId = eootToMrId;
		addValidField("eootToMrId");
	}

	/**
	 * Get eootYetEbrgId
	 */
	@Column(name = "EOOT_YET_EBRG_ID")
	public Long getEootYetEbrgId() {
		return eootYetEbrgId;
	}

	/**
	 * Set eootYetEbrgId
	 */
	public void setEootYetEbrgId(Long eootYetEbrgId) {
		this.eootYetEbrgId = eootYetEbrgId;
		addValidField("eootYetEbrgId");
	}

	/**
	 * Get eootYetEbrgNo
	 */
	@Column(name = "EOOT_YET_EBRG_NO")
	public String getEootYetEbrgNo() {
		return eootYetEbrgNo;
	}

	/**
	 * Set eootYetEbrgNo
	 */
	public void setEootYetEbrgNo(String eootYetEbrgNo) {
		this.eootYetEbrgNo = eootYetEbrgNo;
		addValidField("eootYetEbrgNo");
	}

	/**
	 * Get eootYetNameCn
	 */
	@Column(name = "EOOT_YET_NAME_CN")
	public String getEootYetNameCn() {
		return eootYetNameCn;
	}

	/**
	 * Set eootYetNameCn
	 */
	public void setEootYetNameCn(String eootYetNameCn) {
		this.eootYetNameCn = eootYetNameCn;
		addValidField("eootYetNameCn");
	}

	/**
	 * Get eootOutSationDate
	 */
	@Column(name = "EOOT_OUT_SATION_DATE")
	public Date getEootOutSationDate() {
		return eootOutSationDate;
	}

	/**
	 * Set eootOutSationDate
	 */
	public void setEootOutSationDate(Date eootOutSationDate) {
		this.eootOutSationDate = eootOutSationDate;
		addValidField("eootOutSationDate");
	}

	/**
	 * Get eootPlanFactoryDate
	 */
	@Column(name = "EOOT_PLAN_FACTORY_DATE")
	public Date getEootPlanFactoryDate() {
		return eootPlanFactoryDate;
	}

	/**
	 * Set eootPlanFactoryDate
	 */
	public void setEootPlanFactoryDate(Date eootPlanFactoryDate) {
		this.eootPlanFactoryDate = eootPlanFactoryDate;
		addValidField("eootPlanFactoryDate");
	}

	/**
	 * Get eootTrainsArriveDate
	 */
	@Column(name = "EOOT_TRAINS_ARRIVE_DATE")
	public Date getEootTrainsArriveDate() {
		return eootTrainsArriveDate;
	}

	/**
	 * Set eootTrainsArriveDate
	 */
	public void setEootTrainsArriveDate(Date eootTrainsArriveDate) {
		this.eootTrainsArriveDate = eootTrainsArriveDate;
		addValidField("eootTrainsArriveDate");
	}

	/**
	 * Get eootHeavyBoxApproachDate
	 */
	@Column(name = "EOOT_HEAVY_BOX_APPROACH_DATE")
	public Date getEootHeavyBoxApproachDate() {
		return eootHeavyBoxApproachDate;
	}

	/**
	 * Set eootHeavyBoxApproachDate
	 */
	public void setEootHeavyBoxApproachDate(Date eootHeavyBoxApproachDate) {
		this.eootHeavyBoxApproachDate = eootHeavyBoxApproachDate;
		addValidField("eootHeavyBoxApproachDate");
	}

	/**
	 * Get eootTrainsDepartureDate
	 */
	@Column(name = "EOOT_TRAINS_DEPARTURE_DATE")
	public Date getEootTrainsDepartureDate() {
		return eootTrainsDepartureDate;
	}

	/**
	 * Set eootTrainsDepartureDate
	 */
	public void setEootTrainsDepartureDate(Date eootTrainsDepartureDate) {
		this.eootTrainsDepartureDate = eootTrainsDepartureDate;
		addValidField("eootTrainsDepartureDate");
	}

	/**
	 * Get eootActualToFactoryDate
	 */
	@Column(name = "EOOT_ACTUAL_TO_FACTORY_DATE")
	public Date getEootActualToFactoryDate() {
		return eootActualToFactoryDate;
	}

	/**
	 * Set eootActualToFactoryDate
	 */
	public void setEootActualToFactoryDate(Date eootActualToFactoryDate) {
		this.eootActualToFactoryDate = eootActualToFactoryDate;
		addValidField("eootActualToFactoryDate");
	}

	/**
	 * Get eootSubdate3
	 */
	@Column(name = "EOOT_SUBDATE3")
	public Date getEootSubdate3() {
		return eootSubdate3;
	}

	/**
	 * Set eootSubdate3
	 */
	public void setEootSubdate3(Date eootSubdate3) {
		this.eootSubdate3 = eootSubdate3;
		addValidField("eootSubdate3");
	}

	/**
	 * Get eootSubdate4
	 */
	@Column(name = "EOOT_SUBDATE4")
	public Date getEootSubdate4() {
		return eootSubdate4;
	}

	/**
	 * Set eootSubdate4
	 */
	public void setEootSubdate4(Date eootSubdate4) {
		this.eootSubdate4 = eootSubdate4;
		addValidField("eootSubdate4");
	}

	/**
	 * Get eootCntWeight
	 */
	@Column(name = "EOOT_CNT_WEIGHT")
	public Double getEootCntWeight() {
		return eootCntWeight;
	}

	/**
	 * Set eootCntWeight
	 */
	public void setEootCntWeight(Double eootCntWeight) {
		this.eootCntWeight = eootCntWeight;
		addValidField("eootCntWeight");
	}

	/**
	 * Get eootVgmGrossWeight
	 */
	@Column(name = "EOOT_VGM_GROSS_WEIGHT")
	public Double getEootVgmGrossWeight() {
		return eootVgmGrossWeight;
	}

	/**
	 * Set eootVgmGrossWeight
	 */
	public void setEootVgmGrossWeight(Double eootVgmGrossWeight) {
		this.eootVgmGrossWeight = eootVgmGrossWeight;
		addValidField("eootVgmGrossWeight");
	}

	/**
	 * Get eootSealsNo3
	 */
	@Column(name = "EOOT_SEALS_NO3")
	public String getEootSealsNo3() {
		return eootSealsNo3;
	}

	/**
	 * Set eootSealsNo3
	 */
	public void setEootSealsNo3(String eootSealsNo3) {
		this.eootSealsNo3 = eootSealsNo3;
		addValidField("eootSealsNo3");
	}

	/**
	 * Get eootSealsNo2
	 */
	@Column(name = "EOOT_SEALS_NO2")
	public String getEootSealsNo2() {
		return eootSealsNo2;
	}

	/**
	 * Set eootSealsNo2
	 */
	public void setEootSealsNo2(String eootSealsNo2) {
		this.eootSealsNo2 = eootSealsNo2;
		addValidField("eootSealsNo2");
	}

	/**
	 * Get eootQuantity
	 */
	@Column(name = "EOOT_QUANTITY")
	public Long getEootQuantity() {
		return eootQuantity;
	}

	/**
	 * Set eootQuantity
	 */
	public void setEootQuantity(Long eootQuantity) {
		this.eootQuantity = eootQuantity;
		addValidField("eootQuantity");
	}

	/**
	 * Get eootWeight
	 */
	@Column(name = "EOOT_WEIGHT")
	public Double getEootWeight() {
		return eootWeight;
	}

	/**
	 * Set eootWeight
	 */
	public void setEootWeight(Double eootWeight) {
		this.eootWeight = eootWeight;
		addValidField("eootWeight");
	}

	/**
	 * Get eootVolume
	 */
	@Column(name = "EOOT_VOLUME")
	public Double getEootVolume() {
		return eootVolume;
	}

	/**
	 * Set eootVolume
	 */
	public void setEootVolume(Double eootVolume) {
		this.eootVolume = eootVolume;
		addValidField("eootVolume");
	}
	
	/**
	 * Get eootIsLcl
	 */
	@Column(name = "EOOT_IS_LCL")
	public String getEootIsLcl() {
		return eootIsLcl;
	}

	/**
	 * Set eootIsLcl
	 */
	public void setEootIsLcl(String eootIsLcl) {
		this.eootIsLcl = eootIsLcl;
		addValidField("eootIsLcl");
	}

	
}
