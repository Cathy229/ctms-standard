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
 * Model class for EoRequestSeaborne
 */
@Entity
@Table(name = "EO_REQUEST_SEABORNE")
public class EoRequestSeaborneModel extends BaseModel implements OperationLog {

	//eoseId
	private Long eoseId;
	//eoseEoorId
	private Long eoseEoorId;
	//eoseEscoId
	private Long eoseEscoId;
	//eoseEbpjId
	private Long eoseEbpjId;
	//eoseLoEbppId
	private Long eoseLoEbppId;
	//eoseEbtkId
	private Long eoseEbtkId;
	//eoseIsAutomatic
	private String eoseIsAutomatic;
	//eoseTaskStatus
	private String eoseTaskStatus;
	//eoseTaskFeedback
	private String eoseTaskFeedback;
	//eoseSysCode
	private String eoseSysCode;
	//eoseEbbuId
	private Long eoseEbbuId;
	//eoseEbbuNameCn
	private String eoseEbbuNameCn;
	//eoseEbbuCode
	private String eoseEbbuCode;
	//eoseEbbuDist1
	private String eoseEbbuDist1;
	//eoseEbbuDist2
	private String eoseEbbuDist2;
	//eoseEbbuDist3
	private String eoseEbbuDist3;
	//eoseEbbuDist4
	private String eoseEbbuDist4;
	//eoseEbbuDist5
	private String eoseEbbuDist5;
	//eoseToId
	private String eoseToId;
	//eoseNo
	private String eoseNo;
	//eoseType
	private String eoseType;
	//eoseStatus
	private String eoseStatus;
	//eoseSoNo
	private String eoseSoNo;
	//eoseDoNo
	private String eoseDoNo;
	//eoseIeFlag
	private String eoseIeFlag;
	//eoseConsignorEbcuId
	private Long eoseConsignorEbcuId;
	//eoseConsignorEbcuCode
	private String eoseConsignorEbcuCode;
	//eoseConsignorEbcuName
	private String eoseConsignorEbcuName;
	//eoseOwnerEbcuId
	private Long eoseOwnerEbcuId;
	//eoseOwnerEbcuCode
	private String eoseOwnerEbcuCode;
	//eoseOwnerEbcuName
	private String eoseOwnerEbcuName;
	//eoseShipperConsignNo
	private String eoseShipperConsignNo;
	//eoseBulkBillNo
	private String eoseBulkBillNo;
	//eoseHblNo
	private String eoseHblNo;
	//eoseTradeTerms
	private String eoseTradeTerms;
	//eoseCarrierBookingNo
	private String eoseCarrierBookingNo;
	//eoseBookingAgentId
	private Long eoseBookingAgentId;
	//eoseBookingAgentName
	private String eoseBookingAgentName;
	//eoseBookingRequestDate
	private Date eoseBookingRequestDate;
	//eoseBookingCompletedDate
	private Date eoseBookingCompletedDate;
	//eoseSectionalReleaseDate
	private Date eoseSectionalReleaseDate;
	//eoseCarrierId
	private Long eoseCarrierId;
	//eoseCarrierCode
	private String eoseCarrierCode;
	//eoseCarrierName
	private String eoseCarrierName;
	//eoseVesselName
	private String eoseVesselName;
	//eoseVoyage
	private String eoseVoyage;
	//eoseEtd
	private Date eoseEtd;
	//eoseSailingDate
	private Date eoseSailingDate;
	//eoseEta
	private Date eoseEta;
	//eoseAta
	private Date eoseAta;
	//eoseReceivedBlDate
	private Date eoseReceivedBlDate;
	//eoseLoadPortId
	private Long eoseLoadPortId;
	//eoseLoadPortCode
	private String eoseLoadPortCode;
	//eoseLoadPortName
	private String eoseLoadPortName;
	//eoseTransferPortId
	private Long eoseTransferPortId;
	//eoseTransferPortCode
	private String eoseTransferPortCode;
	//eoseTransferPortName
	private String eoseTransferPortName;
	//eoseDischargePortId
	private Long eoseDischargePortId;
	//eoseDischargePortCode
	private String eoseDischargePortCode;
	//eoseDischargePortName
	private String eoseDischargePortName;
	//eoseFinalDestinationId
	private Long eoseFinalDestinationId;
	//eoseFinalDestination
	private String eoseFinalDestination;
	//eoseFinalDestinationCode
	private String eoseFinalDestinationCode;
	//eoseShipperId
	private Long eoseShipperId;
	//eoseShipperCode
	private String eoseShipperCode;
	//eoseShipper
	private String eoseShipper;
	//eoseShipperDetail
	private String eoseShipperDetail;
	//eoseShipperContactName
	private String eoseShipperContactName;
	//eoseShipperEbsaId
	private Long eoseShipperEbsaId;
	//eoseStreetNoPoboxSh
	private String eoseStreetNoPoboxSh;
	//eoseConsigneeId
	private Long eoseConsigneeId;
	//eoseConsigneeCode
	private String eoseConsigneeCode;
	//eoseConsignee
	private String eoseConsignee;
	//eoseConsigneeDetail
	private String eoseConsigneeDetail;
	//eoseSpecificContactName
	private String eoseSpecificContactName;
	//eoseConsigneeEbsaId
	private Long eoseConsigneeEbsaId;
	//eoseStreetNoPoboxCn
	private String eoseStreetNoPoboxCn;
	//eoseNotifyId
	private Long eoseNotifyId;
	//eoseNotifyCode
	private String eoseNotifyCode;
	//eoseNotify
	private String eoseNotify;
	//eoseNotifierDetail
	private String eoseNotifierDetail;
	//eoseSecondNotifyId
	private Long eoseSecondNotifyId;
	//eoseSecondNotify
	private String eoseSecondNotify;
	//eoseSecondNotifyCode
	private String eoseSecondNotifyCode;
	//eoseSecondNotifyName
	private String eoseSecondNotifyName;
	//eoseContainerVolume
	private String eoseContainerVolume;
	//eosePackageNumber
	private Integer eosePackageNumber;
	//eoseGrossWeight
	private Double eoseGrossWeight;
	//eoseVol
	private Double eoseVol;
	//eoseConsignId
	private String eoseConsignId;
	//eosePreVesselName
	private String eosePreVesselName;
	//eosePreVoyage
	private String eosePreVoyage;
	//eosePreBlNo
	private String eosePreBlNo;
	//eosePreDischargePortId
	private Long eosePreDischargePortId;
	//eosePreDischargePortCode
	private String eosePreDischargePortCode;
	//eosePreDischargePortName
	private String eosePreDischargePortName;
	//eosePreEtd
	private Date eosePreEtd;
	//eosePreAta
	private Date eosePreAta;
	//eoseNextVesselName
	private String eoseNextVesselName;
	//eoseNextVoyage
	private String eoseNextVoyage;
	//eoseNextEtd
	private Date eoseNextEtd;
	//eoseSedDischargePortId
	private Long eoseSedDischargePortId;
	//eoseSedDischargePortCode
	private String eoseSedDischargePortCode;
	//eoseSedDischargePortName
	private String eoseSedDischargePortName;
	//eoseDelayReason
	private String eoseDelayReason;
	//eoseEbpjFCode
	private Long eoseEbpjFCode;
	//eoseBatchNo
	private String eoseBatchNo;
	//eoseAciCode
	private String eoseAciCode;
	//eoseBondNo
	private String eoseBondNo;
	//eoseBookingAgentCode
	private String eoseBookingAgentCode;
	//eoseCargoSource
	private String eoseCargoSource;
	//eoseLmId
	private String eoseLmId;
	//eoseHouseBlNo
	private String eoseHouseBlNo;
	//eoseScacCode
	private String eoseScacCode;
	//eoseWrapTypeCode
	private String eoseWrapTypeCode;
	//eoseWrapTypeName
	private String eoseWrapTypeName;
	//eoseDiscAreaCode
	private String eoseDiscAreaCode;
	//eoseDiscAreaName
	private String eoseDiscAreaName;
	//eoseClientPackStyle
	private String eoseClientPackStyle;
	//eoseClientPackStyleName
	private String eoseClientPackStyleName;
	//eoseBargeTradeId
	private String eoseBargeTradeId;
	//eoseRepresentativePerson
	private String eoseRepresentativePerson;
	//eoseSlotCharterFlag
	private String eoseSlotCharterFlag;
	//eoseDeconsolidatorCode
	private String eoseDeconsolidatorCode;
	//eoseDeconsolidatorName
	private String eoseDeconsolidatorName;
	//eoseDepotCode
	private String eoseDepotCode;
	//eoseDepotName
	private String eoseDepotName;
	//eoseBatchFlag
	private String eoseBatchFlag;
	//eoseUnCode
	private String eoseUnCode;
	//eoseVesselCode
	private String eoseVesselCode;
	//eoseDestinationCode
	private String eoseDestinationCode;
	//eoseReachDate
	private Date eoseReachDate;
	//eoseDestinationName
	private String eoseDestinationName;
	//eoseNationalityName
	private String eoseNationalityName;
	//eoseNationalityCode
	private String eoseNationalityCode;
	//eoseVesselCall
	private String eoseVesselCall;
	//eoseShippingLine
	private String eoseShippingLine;
	//eoseShippingLineCode
	private String eoseShippingLineCode;
	//eoseShippingLineId
	private Long eoseShippingLineId;
	//eoseAgentId
	private Long eoseAgentId;
	//eoseAgentCode
	private String eoseAgentCode;
	//eoseAgentName
	private String eoseAgentName;
	//eoseReachDateDischarge
	private Date eoseReachDateDischarge;
	//eoseOptDischargePort1Id
	private Long eoseOptDischargePort1Id;
	//eoseOptDischargePort1
	private String eoseOptDischargePort1;
	//eoseOptDischargePortCode1
	private String eoseOptDischargePortCode1;
	//eoseOptDischargePort2Id
	private Long eoseOptDischargePort2Id;
	//eoseOptDischargePort2
	private String eoseOptDischargePort2;
	//eoseOptDischargePortCode2
	private String eoseOptDischargePortCode2;
	//eoseElsewherePayerCity
	private String eoseElsewherePayerCity;
	//eoseElsewherePayerAddress
	private String eoseElsewherePayerAddress;
	//eoseElsewherePayerFax
	private String eoseElsewherePayerFax;
	//eoseElsewherePayerTel
	private String eoseElsewherePayerTel;
	//eoseElsewherePayer
	private String eoseElsewherePayer;
	//eoseElsewherePayerPost
	private String eoseElsewherePayerPost;
	//eoseOptDischargePort3Id
	private Long eoseOptDischargePort3Id;
	//eoseOptDischargePort3
	private String eoseOptDischargePort3;
	//eoseOptDischargePortCode3
	private String eoseOptDischargePortCode3;
	//eoseThirdNotify
	private String eoseThirdNotify;
	//eoseThirdNotifyCode
	private String eoseThirdNotifyCode;
	//eoseOptDischargePort4Id
	private Long eoseOptDischargePort4Id;
	//eoseOptDischargePort4
	private String eoseOptDischargePort4;
	//eoseOptDischargePortCode4
	private String eoseOptDischargePortCode4;
	//eoseOptDischargePort5Id
	private Long eoseOptDischargePort5Id;
	//eoseOptDischargePort5
	private String eoseOptDischargePort5;
	//eoseOptDischargePortCode5
	private String eoseOptDischargePortCode5;
	//eoseBookingPartyId
	private Long eoseBookingPartyId;
	//eoseBookingPartyCode
	private String eoseBookingPartyCode;
	//eoseBookingPartyName
	private String eoseBookingPartyName;
	//eoseBookingContractNo
	private String eoseBookingContractNo;
	//eoseEmailSh
	private String eoseEmailSh;
	//eoseFaxSh
	private String eoseFaxSh;
	//eoseTelSh
	private String eoseTelSh;
	//eoseCityNameShipper
	private String eoseCityNameShipper;
	//eoseCountryCodeShipper
	private String eoseCountryCodeShipper;
	//eoseShipperType
	private String eoseShipperType;
	//eoseCountrySubEntitySh
	private String eoseCountrySubEntitySh;
	//eoseCountrySubEntityNmSh
	private String eoseCountrySubEntityNmSh;
	//eosePostcodeShipper
	private String eosePostcodeShipper;
	//eoseBlSendModeCode
	private String eoseBlSendModeCode;
	//eoseBlSendModeName
	private String eoseBlSendModeName;
	//eoseReleaseTime
	private Date eoseReleaseTime;
	//eoseChargeType
	private String eoseChargeType;
	//eoseAssociatedBlNo
	private String eoseAssociatedBlNo;
	//eoseServiceContractNo
	private String eoseServiceContractNo;
	//eosePayPlaceCode
	private String eosePayPlaceCode;
	//eosePayPlaceName
	private String eosePayPlaceName;
	//eoseScBeforeAfterFlag
	private Integer eoseScBeforeAfterFlag;
	//eoseAmendmentCode
	private String eoseAmendmentCode;
	//eoseAmendmentName
	private String eoseAmendmentName;
	//eoseFobBkParty
	private String eoseFobBkParty;
	//eoseFobBkPartyId
	private String eoseFobBkPartyId;
	//eoseCustomDisposeFlag
	private String eoseCustomDisposeFlag;
	//eoseCustomShipVoy
	private String eoseCustomShipVoy;
	//eoseCustomsSealNo
	private String eoseCustomsSealNo;
	//eoseTrade
	private String eoseTrade;
	//eoseTradeId
	private String eoseTradeId;
	//eoseNextVesselCode
	private String eoseNextVesselCode;
	//eoseSecondCode
	private String eoseSecondCode;
	//eoseSedOperateAreaCode
	private String eoseSedOperateAreaCode;
	//eoseSedOperateAreaName
	private String eoseSedOperateAreaName;
	//eoseSidoCreator
	private String eoseSidoCreator;
	//eoseExchangeRate
	private Double eoseExchangeRate;
	//eoseExchangeName
	private String eoseExchangeName;
	//eoseBlId
	private String eoseBlId;
	//eoseHdVesselCode
	private String eoseHdVesselCode;
	//eoseHdVesselName
	private String eoseHdVesselName;
	//eoseReceiptTraffic
	private String eoseReceiptTraffic;
	//eoseDestinationTraffic
	private String eoseDestinationTraffic;
	//eoseCargoNature
	private String eoseCargoNature;
	//eoseCusStatusGoodsCode
	private String eoseCusStatusGoodsCode;
	//eoseCusStatusGoodsName
	private String eoseCusStatusGoodsName;
	//eoseCityNameDc
	private String eoseCityNameDc;
	//eoseCountryCodeDc
	private String eoseCountryCodeDc;
	//eoseCountryNameDc
	private String eoseCountryNameDc;
	//eoseStreetNumberPoboxDc
	private String eoseStreetNumberPoboxDc;
	//eoseCountrySubEntityDc
	private String eoseCountrySubEntityDc;
	//eoseCountrySubEntityNmDc
	private String eoseCountrySubEntityNmDc;
	//eosePostcodeDc
	private String eosePostcodeDc;
	//eoseCargoName
	private String eoseCargoName;
	//eoseConsignedPlaceCode
	private String eoseConsignedPlaceCode;
	//eoseShipmentDate
	private Date eoseShipmentDate;
	//eoseContainerFlag
	private String eoseContainerFlag;
	//eoseContainerNumber
	private Long eoseContainerNumber;
	//eoseContainerCount
	private Long eoseContainerCount;
	//eoseLclType
	private String eoseLclType;
	//eoseAgreementType
	private String eoseAgreementType;
	//eoseQuarantineCode
	private String eoseQuarantineCode;
	//eoseDeliveryPlaceId
	private Long eoseDeliveryPlaceId;
	//eoseDeliveryPlace
	private String eoseDeliveryPlace;
	//eoseDeliveryPlaceCode
	private String eoseDeliveryPlaceCode;
	//eoseCurrency
	private String eoseCurrency;
	//eoseCurrencyName
	private String eoseCurrencyName;
	//eoseOptDeliveryPlace
	private String eoseOptDeliveryPlace;
	//eoseOptDeliveryPlaceCode
	private String eoseOptDeliveryPlaceCode;
	//eoseContactPerson
	private String eoseContactPerson;
	//eoseContactorFax
	private String eoseContactorFax;
	//eoseContactorTelephone
	private String eoseContactorTelephone;
	//eoseContactorEmail
	private String eoseContactorEmail;
	//eoseCustCsgNo
	private String eoseCustCsgNo;
	//eoseImo
	private String eoseImo;
	//eoseDeparturePortId
	private Long eoseDeparturePortId;
	//eoseDeparturePort
	private String eoseDeparturePort;
	//eoseDeparturePortCode
	private String eoseDeparturePortCode;
	//eoseTradeType
	private String eoseTradeType;
	//eoseAmsCode
	private String eoseAmsCode;
	//eoseDestinationProperty
	private String eoseDestinationProperty;
	//eoseInnerVoyage
	private String eoseInnerVoyage;
	//eoseConsolidatorCode
	private String eoseConsolidatorCode;
	//eoseConsolidatorName
	private String eoseConsolidatorName;
	//eoseBlIssueModeCode
	private String eoseBlIssueModeCode;
	//eoseBlIssueModeName
	private String eoseBlIssueModeName;
	//eoseIssueParty
	private String eoseIssueParty;
	//eoseIssuePartyCode
	private String eoseIssuePartyCode;
	//eoseBlIssueDate
	private Date eoseBlIssueDate;
	//eosePreLoadPortId
	private Long eosePreLoadPortId;
	//eosePreLoadPortCode
	private String eosePreLoadPortCode;
	//eosePreLoadPortName
	private String eosePreLoadPortName;
	//eosePreDiscAreaId
	private Long eosePreDiscAreaId;
	//eosePreDiscAreaCode
	private String eosePreDiscAreaCode;
	//eosePreDiscAreaName
	private String eosePreDiscAreaName;
	//eosePreVesselCode
	private String eosePreVesselCode;
	//eosePreCustomsDocNumber
	private String eosePreCustomsDocNumber;
	//eosePreCusDocTypeCode
	private String eosePreCusDocTypeCode;
	//eoseCustomClearanceType
	private String eoseCustomClearanceType;
	//eoseIsCombineBl
	private String eoseIsCombineBl;
	//eoseDifferentSignPlaceFlag
	private String eoseDifferentSignPlaceFlag;
	//eoseBlType
	private String eoseBlType;
	//eoseExpiryDate
	private Date eoseExpiryDate;
	//eoseInFactShipperId
	private Long eoseInFactShipperId;
	//eoseInFactShipper
	private String eoseInFactShipper;
	//eoseInFactShipperCity
	private String eoseInFactShipperCity;
	//eoseInFactShipperAddId
	private Long eoseInFactShipperAddId;
	//eoseInFactShipperAddress
	private String eoseInFactShipperAddress;
	//eoseInFactShipperFax
	private String eoseInFactShipperFax;
	//eoseInFactShipperTel
	private String eoseInFactShipperTel;
	//eoseInFactShipperName
	private String eoseInFactShipperName;
	//eoseInFactConsigneeName
	private String eoseInFactConsigneeName;
	//eoseInFactShipperPost
	private String eoseInFactShipperPost;
	//eoseInFactConsigneeId
	private Long eoseInFactConsigneeId;
	//eoseInFactConsignee
	private String eoseInFactConsignee;
	//eoseInFactConsigneeCity
	private String eoseInFactConsigneeCity;
	//eoseInFactConsigneeAddId
	private Long eoseInFactConsigneeAddId;
	//eoseInFactConsigneeAddress
	private String eoseInFactConsigneeAddress;
	//eoseInFactConsigneeFax
	private String eoseInFactConsigneeFax;
	//eoseInFactConsigneeTel
	private String eoseInFactConsigneeTel;
	//eoseInFactConsigneePost
	private String eoseInFactConsigneePost;
	//eoseInFactNotifier
	private String eoseInFactNotifier;
	//eoseInFactNotifierCity
	private String eoseInFactNotifierCity;
	//eoseInFactNotifierAddress
	private String eoseInFactNotifierAddress;
	//eoseInFactNotifierFax
	private String eoseInFactNotifierFax;
	//eoseInFactNotifierTel
	private String eoseInFactNotifierTel;
	//eoseInFactNotifierName
	private String eoseInFactNotifierName;
	//eoseInFactNotifierPost
	private String eoseInFactNotifierPost;
	//eoseFactBookingPartyName
	private String eoseFactBookingPartyName;
	//eoseFactBookingPartyCode
	private String eoseFactBookingPartyCode;
	//eoseActShippingVesselName
	private String eoseActShippingVesselName;
	//eoseActShippingVesselCode
	private String eoseActShippingVesselCode;
	//eoseActShippingVoyage
	private String eoseActShippingVoyage;
	//eoseActDepartureTime
	private Date eoseActDepartureTime;
	//eoseInFactDepartureTime
	private Date eoseInFactDepartureTime;
	//eoseIsBooking
	private String eoseIsBooking;
	//eoseAms
	private String eoseAms;
	//eoseSendCustomFlag
	private Integer eoseSendCustomFlag;
	//eoseCustomsFlag
	private String eoseCustomsFlag;
	//eoseReceiptPlaceCode
	private String eoseReceiptPlaceCode;
	//eoseReceiptPlaceName
	private String eoseReceiptPlaceName;
	//eoseEmailCn
	private String eoseEmailCn;
	//eoseFaxCn
	private String eoseFaxCn;
	//eoseTelCn
	private String eoseTelCn;
	//eoseCityNameConsignee
	private String eoseCityNameConsignee;
	//eoseCountryCodeCn
	private String eoseCountryCodeCn;
	//eoseCountryNameCn
	private String eoseCountryNameCn;
	//eoseSpecificEmailCn
	private String eoseSpecificEmailCn;
	//eoseSpecificFaxCn
	private String eoseSpecificFaxCn;
	//eoseSpecificTelCn
	private String eoseSpecificTelCn;
	//eoseCountrySubEntityCn
	private String eoseCountrySubEntityCn;
	//eoseCountrySubEntityNmCn
	private String eoseCountrySubEntityNmCn;
	//eosePostcodeConsignee
	private String eosePostcodeConsignee;
	//eoseBlMemo
	private String eoseBlMemo;
	//eoseBlSocDesc
	private String eoseBlSocDesc;
	//eoseCopyNumber
	private Integer eoseCopyNumber;
	//eoseBlViseType
	private String eoseBlViseType;
	//eoseBlIssuePlace
	private String eoseBlIssuePlace;
	//eoseBlIssuePlaceCode
	private String eoseBlIssuePlaceCode;
	//eoseBlBody
	private String eoseBlBody;
	//eoseBlHead
	private String eoseBlHead;
	//eoseBlCopyNum
	private Integer eoseBlCopyNum;
	//eoseBlNo
	private String eoseBlNo;
	//eoseEmailN1
	private String eoseEmailN1;
	//eoseEmailN2
	private String eoseEmailN2;
	//eoseEmailN3
	private String eoseEmailN3;
	//eoseFaxN1
	private String eoseFaxN1;
	//eoseFaxN2
	private String eoseFaxN2;
	//eoseFaxN3
	private String eoseFaxN3;
	//eoseTelN1
	private String eoseTelN1;
	//eoseTelN2
	private String eoseTelN2;
	//eoseTelN3
	private String eoseTelN3;
	//eoseCityNameN1
	private String eoseCityNameN1;
	//eoseCityNameN2
	private String eoseCityNameN2;
	//eoseCityNameN3
	private String eoseCityNameN3;
	//eoseStreetNumberPoboxN1
	private String eoseStreetNumberPoboxN1;
	//eoseStreetNumberPoboxN2
	private String eoseStreetNumberPoboxN2;
	//eoseStreetNumberPoboxN3
	private String eoseStreetNumberPoboxN3;
	//eoseCountryCodeN1
	private String eoseCountryCodeN1;
	//eoseCountryCodeN2
	private String eoseCountryCodeN2;
	//eoseCountryCodeN3
	private String eoseCountryCodeN3;
	//eoseCountryNameN1
	private String eoseCountryNameN1;
	//eoseCountryNameN2
	private String eoseCountryNameN2;
	//eoseCountryNameN3
	private String eoseCountryNameN3;
	//eoseCountrySubEntityN1
	private String eoseCountrySubEntityN1;
	//eoseCountrySubEntityN2
	private String eoseCountrySubEntityN2;
	//eoseCountrySubEntityN3
	private String eoseCountrySubEntityN3;
	//eoseCountrySubEntityNmN1
	private String eoseCountrySubEntityNmN1;
	//eoseCountrySubEntityNmN2
	private String eoseCountrySubEntityNmN2;
	//eoseCountrySubEntityNmN3
	private String eoseCountrySubEntityNmN3;
	//eosePostcodeN1
	private String eosePostcodeN1;
	//eosePostcodeN2
	private String eosePostcodeN2;
	//eosePostcodeN3
	private String eosePostcodeN3;
	//eoseDrawbackFlag
	private String eoseDrawbackFlag;
	//eoseConsignmentValue
	private Double eoseConsignmentValue;
	//eoseBlCarryName
	private String eoseBlCarryName;
	//eoseBlCarryId
	private String eoseBlCarryId;
	//eoseBokContactor
	private String eoseBokContactor;
	//eoseBokTel
	private String eoseBokTel;
	//eoseBokEmail
	private String eoseBokEmail;
	//eoseEmailDanger
	private String eoseEmailDanger;
	//eoseFaxDanger
	private String eoseFaxDanger;
	//eoseTelDanger
	private String eoseTelDanger;
	//eoseDangerGoodsContact
	private String eoseDangerGoodsContact;
	//eoseBlRemark
	private String eoseBlRemark;
	//eoseConsignDeptId
	private Long eoseConsignDeptId;
	//eoseConsignDept
	private String eoseConsignDept;
	//eoseConsignDeptName
	private String eoseConsignDeptName;
	//eoseNextCallingId
	private Long eoseNextCallingId;
	//eoseNextCallingPort
	private String eoseNextCallingPort;
	//eoseNextCallingPortCode
	private String eoseNextCallingPortCode;
	//eoseCtnCompanyId
	private Long eoseCtnCompanyId;
	//eoseCtnCompanyCode
	private String eoseCtnCompanyCode;
	//eoseCtnCompany
	private String eoseCtnCompany;
	//eoseContainerInCy
	private String eoseContainerInCy;
	//eoseAgreementNoInfo
	private String eoseAgreementNoInfo;
	//eosePodCustomCode
	private String eosePodCustomCode;
	//eoseDischargePortTerminal
	private String eoseDischargePortTerminal;
	//eoseApplicant
	private String eoseApplicant;
	//eoseApplicantId
	private String eoseApplicantId;
	//eoseRequestEtd
	private Date eoseRequestEtd;
	//eoseFclLclFlag
	private String eoseFclLclFlag;
	//eosePrecontactNo
	private String eosePrecontactNo;
	//eose20Quantity
	private Double eose20Quantity;
	//eose40Quantity
	private Double eose40Quantity;
	//eoseSurchargeRemark
	private String eoseSurchargeRemark;
	//eoseQuotationNo
	private String eoseQuotationNo;
	//eosePayTypeCode
	private String eosePayTypeCode;
	//eosePayTypeName
	private String eosePayTypeName;
	//eoseFreightCharge
	private String eoseFreightCharge;
	//eoseShipAgentCode
	private String eoseShipAgentCode;
	//eoseExitPortCustomCode
	private String eoseExitPortCustomCode;
	//eoseExitCustomCode
	private String eoseExitCustomCode;
	//eoseExitPortCustomName
	private String eoseExitPortCustomName;
	//eoseFreightClauseCode
	private String eoseFreightClauseCode;
	//eoseFreightClauseName
	private String eoseFreightClauseName;
	//eoseEmailInterCarrgier
	private String eoseEmailInterCarrgier;
	//eoseFaxInterCarrgier
	private String eoseFaxInterCarrgier;
	//eoseTelInterCarrgier
	private String eoseTelInterCarrgier;
	//eoseIntermediateCarrgier
	private String eoseIntermediateCarrgier;
	//eoseVesselNameCn
	private String eoseVesselNameCn;
	//eoseTransferFlag
	private Integer eoseTransferFlag;
	//eoseTransferFlagName
	private String eoseTransferFlagName;
	//eoseTransDestiPlaceCode
	private String eoseTransDestiPlaceCode;
	//eoseTransDestiPlaceName
	private String eoseTransDestiPlaceName;
	//eoseLclBlno
	private String eoseLclBlno;
	//eoseMainBlNo
	private String eoseMainBlNo;
	//eoseMainBookingNo
	private String eoseMainBookingNo;
	//eoseTranshipmentFlag
	private String eoseTranshipmentFlag;
	//eosePolCustomCode
	private String eosePolCustomCode;
	//eoseLoadPortTerminalCode
	private String eoseLoadPortTerminalCode;
	//eoseLoadPortTerminal
	private String eoseLoadPortTerminal;
	//eoseSendTel
	private String eoseSendTel;
	//eoseSendContractor
	private String eoseSendContractor;
	//eoseLoadCtnPort
	private String eoseLoadCtnPort;
	//eoseStuffingMode
	private String eoseStuffingMode;
	//eoseLmName
	private String eoseLmName;
	//eoseVesselDwt
	private Double eoseVesselDwt;
	//eoseBerthCode
	private String eoseBerthCode;
	//eoseBerthName
	private String eoseBerthName;
	//eoseBizLinksName
	private String eoseBizLinksName;
	//eoseBizLinksTime
	private Date eoseBizLinksTime;
	//eoseBizLinksValue
	private String eoseBizLinksValue;
	//eosePreMfSendEnable
	private String eosePreMfSendEnable;
	//eoseBizImportType
	private String eoseBizImportType;
	//eoseHandlingInstrucCode
	private String eoseHandlingInstrucCode;
	//eoseHandlingInstrucName
	private String eoseHandlingInstrucName;
	//eoseDisposeUser
	private Integer eoseDisposeUser;
	//eoseErrReason
	private String eoseErrReason;
	//eoseOperationDisposeFlag
	private String eoseOperationDisposeFlag;
	//eoseRecordType
	private Integer eoseRecordType;
	//eoseCsdtId
	private Long eoseCsdtId;
	//eoseCarSiFeedbackStatus
	private String eoseCarSiFeedbackStatus;
	//eoseCarBkFeedbackStatus
	private String eoseCarBkFeedbackStatus;
	//eoseLoadMfSendEnable
	private String eoseLoadMfSendEnable;
	//eoseBookingStatus
	private String eoseBookingStatus;
	//eoseDocHdFlag
	private String eoseDocHdFlag;
	//eoseAutoreferFlag
	private String eoseAutoreferFlag;
	//eoseRemark
	private String eoseRemark;
	//eoseSubstr1
	private String eoseSubstr1;
	//eoseSubstr2
	private String eoseSubstr2;
	//eoseSubstr3
	private String eoseSubstr3;
	//eoseSubstr4
	private String eoseSubstr4;
	//eoseSubstr5
	private String eoseSubstr5;
	//eoseSubstr6
	private String eoseSubstr6;
	//eoseSubstr7
	private String eoseSubstr7;
	//eoseSubstr8
	private String eoseSubstr8;
	//eoseSubstr9
	private String eoseSubstr9;
	//eoseSubstr10
	private String eoseSubstr10;
	//eoseSubstr11
	private String eoseSubstr11;
	//eoseSubstr12
	private String eoseSubstr12;
	//eoseSubdate1
	private Date eoseSubdate1;
	//eoseSubdate2
	private Date eoseSubdate2;
	//eoseSubdate3
	private Date eoseSubdate3;
	//eoseSubdate4
	private Date eoseSubdate4;
	//eoseSubnum1
	private Long eoseSubnum1;
	//eoseSubnum2
	private Long eoseSubnum2;
	//eoseSubnum3
	private Long eoseSubnum3;
	//eoseSubnum4
	private Long eoseSubnum4;
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
	//eoseOrder
	private Long eoseOrder;
	//eoseNetWeight
	private Double eoseNetWeight;
	//eoseReleaseDate
	private Date eoseReleaseDate;
	//eoseDeclarationDate
	private Date eoseDeclarationDate;
	//eosePaymentMethod
	private String eosePaymentMethod;
	//eoseIsNvocc
	private String eoseIsNvocc;
	//eoseTradeContractNo
	private String eoseTradeContractNo;
	//eoseWhomCanvass
	private Long eoseWhomCanvass;
	//eoseLoadCountryCode
	private String eoseLoadCountryCode;
	//eoseLoadCountryNameCn
	private String eoseLoadCountryNameCn;
	//eoseEbkSender
	private String eoseEbkSender;
	//eoseEbkSentTime
	private Date eoseEbkSentTime;
	//eoseEbkComfirmer
	private String eoseEbkComfirmer;
	//eoseEbkConfirmTime
	private Date eoseEbkConfirmTime;
	//eoseHblSigner
	private String eoseHblSigner;
	//eoseHblSignTime
	private Date eoseHblSignTime;
	//eoseMblSigner
	private String eoseMblSigner;
	//eoseMblSignTime
	private Date eoseMblSignTime;
	//eoseBlIssuer
	private String eoseBlIssuer;
	//eoseBlIssueTime
	private Date eoseBlIssueTime;
	//eoseBlDeliveryMethod
	private String eoseBlDeliveryMethod;
	//eoseBlExpressNo
	private String eoseBlExpressNo;
	//eoseBlRecipient
	private String eoseBlRecipient;
	//eoseConcentrationTime
	private Date eoseConcentrationTime;
	//eoseLoadingTime
	private Date eoseLoadingTime;
	//eoseEscoCode
	private String eoseEscoCode;
	//eoseEscoNameCn
	private String eoseEscoNameCn;
	//eoseEsdeDepartmentCode
	private String eoseEsdeDepartmentCode;
	//eoseEsdeDepartmentName
	private String eoseEsdeDepartmentName;
	//eoseEsusUserNameCn
	private String eoseEsusUserNameCn;
	//eoseRetoType
	private Long eoseRetoType;
	//eoseCutBoxTime
	private Date eoseCutBoxTime;
	//eoseCutOffTime
	private Date eoseCutOffTime;
	//eoseIsDutyfree
	private Long eoseIsDutyfree;

	/**
	 * Get eoseId
	 */
	@Column(name = "EOSE_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoseId() {
		return eoseId;
	}

	/**
	 * Set eoseId
	 */
	public void setEoseId(Long eoseId) {
		this.eoseId = eoseId;
		addValidField("eoseId");
	}

	/**
	 * Get eoseEoorId
	 */
	@Column(name = "EOSE_EOOR_ID")
	public Long getEoseEoorId() {
		return eoseEoorId;
	}

	/**
	 * Set eoseEoorId
	 */
	public void setEoseEoorId(Long eoseEoorId) {
		this.eoseEoorId = eoseEoorId;
		addValidField("eoseEoorId");
	}

	/**
	 * Get eoseEscoId
	 */
	@Column(name = "EOSE_ESCO_ID")
	public Long getEoseEscoId() {
		return eoseEscoId;
	}

	/**
	 * Set eoseEscoId
	 */
	public void setEoseEscoId(Long eoseEscoId) {
		this.eoseEscoId = eoseEscoId;
		addValidField("eoseEscoId");
	}

	/**
	 * Get eoseEbpjId
	 */
	@Column(name = "EOSE_EBPJ_ID")
	public Long getEoseEbpjId() {
		return eoseEbpjId;
	}

	/**
	 * Set eoseEbpjId
	 */
	public void setEoseEbpjId(Long eoseEbpjId) {
		this.eoseEbpjId = eoseEbpjId;
		addValidField("eoseEbpjId");
	}

	/**
	 * Get eoseLoEbppId
	 */
	@Column(name = "EOSE_LO_EBPP_ID")
	public Long getEoseLoEbppId() {
		return eoseLoEbppId;
	}

	/**
	 * Set eoseLoEbppId
	 */
	public void setEoseLoEbppId(Long eoseLoEbppId) {
		this.eoseLoEbppId = eoseLoEbppId;
		addValidField("eoseLoEbppId");
	}

	/**
	 * Get eoseEbtkId
	 */
	@Column(name = "EOSE_EBTK_ID")
	public Long getEoseEbtkId() {
		return eoseEbtkId;
	}

	/**
	 * Set eoseEbtkId
	 */
	public void setEoseEbtkId(Long eoseEbtkId) {
		this.eoseEbtkId = eoseEbtkId;
		addValidField("eoseEbtkId");
	}

	/**
	 * Get eoseIsAutomatic
	 */
	@Column(name = "EOSE_IS_AUTOMATIC")
	public String getEoseIsAutomatic() {
		return eoseIsAutomatic;
	}

	/**
	 * Set eoseIsAutomatic
	 */
	public void setEoseIsAutomatic(String eoseIsAutomatic) {
		this.eoseIsAutomatic = eoseIsAutomatic;
		addValidField("eoseIsAutomatic");
	}

	/**
	 * Get eoseTaskStatus
	 */
	@Column(name = "EOSE_TASK_STATUS")
	public String getEoseTaskStatus() {
		return eoseTaskStatus;
	}

	/**
	 * Set eoseTaskStatus
	 */
	public void setEoseTaskStatus(String eoseTaskStatus) {
		this.eoseTaskStatus = eoseTaskStatus;
		addValidField("eoseTaskStatus");
	}

	/**
	 * Get eoseTaskFeedback
	 */
	@Column(name = "EOSE_TASK_FEEDBACK")
	public String getEoseTaskFeedback() {
		return eoseTaskFeedback;
	}

	/**
	 * Set eoseTaskFeedback
	 */
	public void setEoseTaskFeedback(String eoseTaskFeedback) {
		this.eoseTaskFeedback = eoseTaskFeedback;
		addValidField("eoseTaskFeedback");
	}

	/**
	 * Get eoseSysCode
	 */
	@Column(name = "EOSE_SYS_CODE")
	public String getEoseSysCode() {
		return eoseSysCode;
	}

	/**
	 * Set eoseSysCode
	 */
	public void setEoseSysCode(String eoseSysCode) {
		this.eoseSysCode = eoseSysCode;
		addValidField("eoseSysCode");
	}

	/**
	 * Get eoseEbbuId
	 */
	@Column(name = "EOSE_EBBU_ID")
	public Long getEoseEbbuId() {
		return eoseEbbuId;
	}

	/**
	 * Set eoseEbbuId
	 */
	public void setEoseEbbuId(Long eoseEbbuId) {
		this.eoseEbbuId = eoseEbbuId;
		addValidField("eoseEbbuId");
	}

	/**
	 * Get eoseEbbuNameCn
	 */
	@Column(name = "EOSE_EBBU_NAME_CN")
	public String getEoseEbbuNameCn() {
		return eoseEbbuNameCn;
	}

	/**
	 * Set eoseEbbuNameCn
	 */
	public void setEoseEbbuNameCn(String eoseEbbuNameCn) {
		this.eoseEbbuNameCn = eoseEbbuNameCn;
		addValidField("eoseEbbuNameCn");
	}

	/**
	 * Get eoseEbbuCode
	 */
	@Column(name = "EOSE_EBBU_CODE")
	public String getEoseEbbuCode() {
		return eoseEbbuCode;
	}

	/**
	 * Set eoseEbbuCode
	 */
	public void setEoseEbbuCode(String eoseEbbuCode) {
		this.eoseEbbuCode = eoseEbbuCode;
		addValidField("eoseEbbuCode");
	}

	/**
	 * Get eoseEbbuDist1
	 */
	@Column(name = "EOSE_EBBU_DIST_1")
	public String getEoseEbbuDist1() {
		return eoseEbbuDist1;
	}

	/**
	 * Set eoseEbbuDist1
	 */
	public void setEoseEbbuDist1(String eoseEbbuDist1) {
		this.eoseEbbuDist1 = eoseEbbuDist1;
		addValidField("eoseEbbuDist1");
	}

	/**
	 * Get eoseEbbuDist2
	 */
	@Column(name = "EOSE_EBBU_DIST_2")
	public String getEoseEbbuDist2() {
		return eoseEbbuDist2;
	}

	/**
	 * Set eoseEbbuDist2
	 */
	public void setEoseEbbuDist2(String eoseEbbuDist2) {
		this.eoseEbbuDist2 = eoseEbbuDist2;
		addValidField("eoseEbbuDist2");
	}

	/**
	 * Get eoseEbbuDist3
	 */
	@Column(name = "EOSE_EBBU_DIST_3")
	public String getEoseEbbuDist3() {
		return eoseEbbuDist3;
	}

	/**
	 * Set eoseEbbuDist3
	 */
	public void setEoseEbbuDist3(String eoseEbbuDist3) {
		this.eoseEbbuDist3 = eoseEbbuDist3;
		addValidField("eoseEbbuDist3");
	}

	/**
	 * Get eoseEbbuDist4
	 */
	@Column(name = "EOSE_EBBU_DIST_4")
	public String getEoseEbbuDist4() {
		return eoseEbbuDist4;
	}

	/**
	 * Set eoseEbbuDist4
	 */
	public void setEoseEbbuDist4(String eoseEbbuDist4) {
		this.eoseEbbuDist4 = eoseEbbuDist4;
		addValidField("eoseEbbuDist4");
	}

	/**
	 * Get eoseEbbuDist5
	 */
	@Column(name = "EOSE_EBBU_DIST_5")
	public String getEoseEbbuDist5() {
		return eoseEbbuDist5;
	}

	/**
	 * Set eoseEbbuDist5
	 */
	public void setEoseEbbuDist5(String eoseEbbuDist5) {
		this.eoseEbbuDist5 = eoseEbbuDist5;
		addValidField("eoseEbbuDist5");
	}

	/**
	 * Get eoseToId
	 */
	@Column(name = "EOSE_TO_ID")
	public String getEoseToId() {
		return eoseToId;
	}

	/**
	 * Set eoseToId
	 */
	public void setEoseToId(String eoseToId) {
		this.eoseToId = eoseToId;
		addValidField("eoseToId");
	}

	/**
	 * Get eoseNo
	 */
	@Column(name = "EOSE_NO")
	public String getEoseNo() {
		return eoseNo;
	}

	/**
	 * Set eoseNo
	 */
	public void setEoseNo(String eoseNo) {
		this.eoseNo = eoseNo;
		addValidField("eoseNo");
	}

	/**
	 * Get eoseType
	 */
	@Column(name = "EOSE_TYPE")
	public String getEoseType() {
		return eoseType;
	}

	/**
	 * Set eoseType
	 */
	public void setEoseType(String eoseType) {
		this.eoseType = eoseType;
		addValidField("eoseType");
	}

	/**
	 * Get eoseStatus
	 */
	@Column(name = "EOSE_STATUS")
	public String getEoseStatus() {
		return eoseStatus;
	}

	/**
	 * Set eoseStatus
	 */
	public void setEoseStatus(String eoseStatus) {
		this.eoseStatus = eoseStatus;
		addValidField("eoseStatus");
	}

	/**
	 * Get eoseSoNo
	 */
	@Column(name = "EOSE_SO_NO")
	public String getEoseSoNo() {
		return eoseSoNo;
	}

	/**
	 * Set eoseSoNo
	 */
	public void setEoseSoNo(String eoseSoNo) {
		this.eoseSoNo = eoseSoNo;
		addValidField("eoseSoNo");
	}

	/**
	 * Get eoseDoNo
	 */
	@Column(name = "EOSE_DO_NO")
	public String getEoseDoNo() {
		return eoseDoNo;
	}

	/**
	 * Set eoseDoNo
	 */
	public void setEoseDoNo(String eoseDoNo) {
		this.eoseDoNo = eoseDoNo;
		addValidField("eoseDoNo");
	}

	/**
	 * Get eoseIeFlag
	 */
	@Column(name = "EOSE_IE_FLAG")
	public String getEoseIeFlag() {
		return eoseIeFlag;
	}

	/**
	 * Set eoseIeFlag
	 */
	public void setEoseIeFlag(String eoseIeFlag) {
		this.eoseIeFlag = eoseIeFlag;
		addValidField("eoseIeFlag");
	}

	/**
	 * Get eoseConsignorEbcuId
	 */
	@Column(name = "EOSE_CONSIGNOR_EBCU_ID")
	public Long getEoseConsignorEbcuId() {
		return eoseConsignorEbcuId;
	}

	/**
	 * Set eoseConsignorEbcuId
	 */
	public void setEoseConsignorEbcuId(Long eoseConsignorEbcuId) {
		this.eoseConsignorEbcuId = eoseConsignorEbcuId;
		addValidField("eoseConsignorEbcuId");
	}

	/**
	 * Get eoseConsignorEbcuCode
	 */
	@Column(name = "EOSE_CONSIGNOR_EBCU_CODE")
	public String getEoseConsignorEbcuCode() {
		return eoseConsignorEbcuCode;
	}

	/**
	 * Set eoseConsignorEbcuCode
	 */
	public void setEoseConsignorEbcuCode(String eoseConsignorEbcuCode) {
		this.eoseConsignorEbcuCode = eoseConsignorEbcuCode;
		addValidField("eoseConsignorEbcuCode");
	}

	/**
	 * Get eoseConsignorEbcuName
	 */
	@Column(name = "EOSE_CONSIGNOR_EBCU_NAME")
	public String getEoseConsignorEbcuName() {
		return eoseConsignorEbcuName;
	}

	/**
	 * Set eoseConsignorEbcuName
	 */
	public void setEoseConsignorEbcuName(String eoseConsignorEbcuName) {
		this.eoseConsignorEbcuName = eoseConsignorEbcuName;
		addValidField("eoseConsignorEbcuName");
	}

	/**
	 * Get eoseOwnerEbcuId
	 */
	@Column(name = "EOSE_OWNER_EBCU_ID")
	public Long getEoseOwnerEbcuId() {
		return eoseOwnerEbcuId;
	}

	/**
	 * Set eoseOwnerEbcuId
	 */
	public void setEoseOwnerEbcuId(Long eoseOwnerEbcuId) {
		this.eoseOwnerEbcuId = eoseOwnerEbcuId;
		addValidField("eoseOwnerEbcuId");
	}

	/**
	 * Get eoseOwnerEbcuCode
	 */
	@Column(name = "EOSE_OWNER_EBCU_CODE")
	public String getEoseOwnerEbcuCode() {
		return eoseOwnerEbcuCode;
	}

	/**
	 * Set eoseOwnerEbcuCode
	 */
	public void setEoseOwnerEbcuCode(String eoseOwnerEbcuCode) {
		this.eoseOwnerEbcuCode = eoseOwnerEbcuCode;
		addValidField("eoseOwnerEbcuCode");
	}

	/**
	 * Get eoseOwnerEbcuName
	 */
	@Column(name = "EOSE_OWNER_EBCU_NAME")
	public String getEoseOwnerEbcuName() {
		return eoseOwnerEbcuName;
	}

	/**
	 * Set eoseOwnerEbcuName
	 */
	public void setEoseOwnerEbcuName(String eoseOwnerEbcuName) {
		this.eoseOwnerEbcuName = eoseOwnerEbcuName;
		addValidField("eoseOwnerEbcuName");
	}

	/**
	 * Get eoseShipperConsignNo
	 */
	@Column(name = "EOSE_SHIPPER_CONSIGN_NO")
	public String getEoseShipperConsignNo() {
		return eoseShipperConsignNo;
	}

	/**
	 * Set eoseShipperConsignNo
	 */
	public void setEoseShipperConsignNo(String eoseShipperConsignNo) {
		this.eoseShipperConsignNo = eoseShipperConsignNo;
		addValidField("eoseShipperConsignNo");
	}

	/**
	 * Get eoseBulkBillNo
	 */
	@Column(name = "EOSE_BULK_BILL_NO")
	public String getEoseBulkBillNo() {
		return eoseBulkBillNo;
	}

	/**
	 * Set eoseBulkBillNo
	 */
	public void setEoseBulkBillNo(String eoseBulkBillNo) {
		this.eoseBulkBillNo = eoseBulkBillNo;
		addValidField("eoseBulkBillNo");
	}

	/**
	 * Get eoseHblNo
	 */
	@Column(name = "EOSE_HBL_NO")
	public String getEoseHblNo() {
		return eoseHblNo;
	}

	/**
	 * Set eoseHblNo
	 */
	public void setEoseHblNo(String eoseHblNo) {
		this.eoseHblNo = eoseHblNo;
		addValidField("eoseHblNo");
	}

	/**
	 * Get eoseTradeTerms
	 */
	@Column(name = "EOSE_TRADE_TERMS")
	public String getEoseTradeTerms() {
		return eoseTradeTerms;
	}

	/**
	 * Set eoseTradeTerms
	 */
	public void setEoseTradeTerms(String eoseTradeTerms) {
		this.eoseTradeTerms = eoseTradeTerms;
		addValidField("eoseTradeTerms");
	}

	/**
	 * Get eoseCarrierBookingNo
	 */
	@Column(name = "EOSE_CARRIER_BOOKING_NO")
	public String getEoseCarrierBookingNo() {
		return eoseCarrierBookingNo;
	}

	/**
	 * Set eoseCarrierBookingNo
	 */
	public void setEoseCarrierBookingNo(String eoseCarrierBookingNo) {
		this.eoseCarrierBookingNo = eoseCarrierBookingNo;
		addValidField("eoseCarrierBookingNo");
	}

	/**
	 * Get eoseBookingAgentId
	 */
	@Column(name = "EOSE_BOOKING_AGENT_ID")
	public Long getEoseBookingAgentId() {
		return eoseBookingAgentId;
	}

	/**
	 * Set eoseBookingAgentId
	 */
	public void setEoseBookingAgentId(Long eoseBookingAgentId) {
		this.eoseBookingAgentId = eoseBookingAgentId;
		addValidField("eoseBookingAgentId");
	}

	/**
	 * Get eoseBookingAgentName
	 */
	@Column(name = "EOSE_BOOKING_AGENT_NAME")
	public String getEoseBookingAgentName() {
		return eoseBookingAgentName;
	}

	/**
	 * Set eoseBookingAgentName
	 */
	public void setEoseBookingAgentName(String eoseBookingAgentName) {
		this.eoseBookingAgentName = eoseBookingAgentName;
		addValidField("eoseBookingAgentName");
	}

	/**
	 * Get eoseBookingRequestDate
	 */
	@Column(name = "EOSE_BOOKING_REQUEST_DATE")
	public Date getEoseBookingRequestDate() {
		return eoseBookingRequestDate;
	}

	/**
	 * Set eoseBookingRequestDate
	 */
	public void setEoseBookingRequestDate(Date eoseBookingRequestDate) {
		this.eoseBookingRequestDate = eoseBookingRequestDate;
		addValidField("eoseBookingRequestDate");
	}

	/**
	 * Get eoseBookingCompletedDate
	 */
	@Column(name = "EOSE_BOOKING_COMPLETED_DATE")
	public Date getEoseBookingCompletedDate() {
		return eoseBookingCompletedDate;
	}

	/**
	 * Set eoseBookingCompletedDate
	 */
	public void setEoseBookingCompletedDate(Date eoseBookingCompletedDate) {
		this.eoseBookingCompletedDate = eoseBookingCompletedDate;
		addValidField("eoseBookingCompletedDate");
	}

	/**
	 * Get eoseSectionalReleaseDate
	 */
	@Column(name = "EOSE_SECTIONAL_RELEASE_DATE")
	public Date getEoseSectionalReleaseDate() {
		return eoseSectionalReleaseDate;
	}

	/**
	 * Set eoseSectionalReleaseDate
	 */
	public void setEoseSectionalReleaseDate(Date eoseSectionalReleaseDate) {
		this.eoseSectionalReleaseDate = eoseSectionalReleaseDate;
		addValidField("eoseSectionalReleaseDate");
	}

	/**
	 * Get eoseCarrierId
	 */
	@Column(name = "EOSE_CARRIER_ID")
	public Long getEoseCarrierId() {
		return eoseCarrierId;
	}

	/**
	 * Set eoseCarrierId
	 */
	public void setEoseCarrierId(Long eoseCarrierId) {
		this.eoseCarrierId = eoseCarrierId;
		addValidField("eoseCarrierId");
	}

	/**
	 * Get eoseCarrierCode
	 */
	@Column(name = "EOSE_CARRIER_CODE")
	public String getEoseCarrierCode() {
		return eoseCarrierCode;
	}

	/**
	 * Set eoseCarrierCode
	 */
	public void setEoseCarrierCode(String eoseCarrierCode) {
		this.eoseCarrierCode = eoseCarrierCode;
		addValidField("eoseCarrierCode");
	}

	/**
	 * Get eoseCarrierName
	 */
	@Column(name = "EOSE_CARRIER_NAME")
	public String getEoseCarrierName() {
		return eoseCarrierName;
	}

	/**
	 * Set eoseCarrierName
	 */
	public void setEoseCarrierName(String eoseCarrierName) {
		this.eoseCarrierName = eoseCarrierName;
		addValidField("eoseCarrierName");
	}

	/**
	 * Get eoseVesselName
	 */
	@Column(name = "EOSE_VESSEL_NAME")
	public String getEoseVesselName() {
		return eoseVesselName;
	}

	/**
	 * Set eoseVesselName
	 */
	public void setEoseVesselName(String eoseVesselName) {
		this.eoseVesselName = eoseVesselName;
		addValidField("eoseVesselName");
	}

	/**
	 * Get eoseVoyage
	 */
	@Column(name = "EOSE_VOYAGE")
	public String getEoseVoyage() {
		return eoseVoyage;
	}

	/**
	 * Set eoseVoyage
	 */
	public void setEoseVoyage(String eoseVoyage) {
		this.eoseVoyage = eoseVoyage;
		addValidField("eoseVoyage");
	}

	/**
	 * Get eoseEtd
	 */
	@Column(name = "EOSE_ETD")
	public Date getEoseEtd() {
		return eoseEtd;
	}

	/**
	 * Set eoseEtd
	 */
	public void setEoseEtd(Date eoseEtd) {
		this.eoseEtd = eoseEtd;
		addValidField("eoseEtd");
	}

	/**
	 * Get eoseSailingDate
	 */
	@Column(name = "EOSE_SAILING_DATE")
	public Date getEoseSailingDate() {
		return eoseSailingDate;
	}

	/**
	 * Set eoseSailingDate
	 */
	public void setEoseSailingDate(Date eoseSailingDate) {
		this.eoseSailingDate = eoseSailingDate;
		addValidField("eoseSailingDate");
	}

	/**
	 * Get eoseEta
	 */
	@Column(name = "EOSE_ETA")
	public Date getEoseEta() {
		return eoseEta;
	}

	/**
	 * Set eoseEta
	 */
	public void setEoseEta(Date eoseEta) {
		this.eoseEta = eoseEta;
		addValidField("eoseEta");
	}

	/**
	 * Get eoseAta
	 */
	@Column(name = "EOSE_ATA")
	public Date getEoseAta() {
		return eoseAta;
	}

	/**
	 * Set eoseAta
	 */
	public void setEoseAta(Date eoseAta) {
		this.eoseAta = eoseAta;
		addValidField("eoseAta");
	}

	/**
	 * Get eoseReceivedBlDate
	 */
	@Column(name = "EOSE_RECEIVED_BL_DATE")
	public Date getEoseReceivedBlDate() {
		return eoseReceivedBlDate;
	}

	/**
	 * Set eoseReceivedBlDate
	 */
	public void setEoseReceivedBlDate(Date eoseReceivedBlDate) {
		this.eoseReceivedBlDate = eoseReceivedBlDate;
		addValidField("eoseReceivedBlDate");
	}

	/**
	 * Get eoseLoadPortId
	 */
	@Column(name = "EOSE_LOAD_PORT_ID")
	public Long getEoseLoadPortId() {
		return eoseLoadPortId;
	}

	/**
	 * Set eoseLoadPortId
	 */
	public void setEoseLoadPortId(Long eoseLoadPortId) {
		this.eoseLoadPortId = eoseLoadPortId;
		addValidField("eoseLoadPortId");
	}

	/**
	 * Get eoseLoadPortCode
	 */
	@Column(name = "EOSE_LOAD_PORT_CODE")
	public String getEoseLoadPortCode() {
		return eoseLoadPortCode;
	}

	/**
	 * Set eoseLoadPortCode
	 */
	public void setEoseLoadPortCode(String eoseLoadPortCode) {
		this.eoseLoadPortCode = eoseLoadPortCode;
		addValidField("eoseLoadPortCode");
	}

	/**
	 * Get eoseLoadPortName
	 */
	@Column(name = "EOSE_LOAD_PORT_NAME")
	public String getEoseLoadPortName() {
		return eoseLoadPortName;
	}

	/**
	 * Set eoseLoadPortName
	 */
	public void setEoseLoadPortName(String eoseLoadPortName) {
		this.eoseLoadPortName = eoseLoadPortName;
		addValidField("eoseLoadPortName");
	}

	/**
	 * Get eoseTransferPortId
	 */
	@Column(name = "EOSE_TRANSFER_PORT_ID")
	public Long getEoseTransferPortId() {
		return eoseTransferPortId;
	}

	/**
	 * Set eoseTransferPortId
	 */
	public void setEoseTransferPortId(Long eoseTransferPortId) {
		this.eoseTransferPortId = eoseTransferPortId;
		addValidField("eoseTransferPortId");
	}

	/**
	 * Get eoseTransferPortCode
	 */
	@Column(name = "EOSE_TRANSFER_PORT_CODE")
	public String getEoseTransferPortCode() {
		return eoseTransferPortCode;
	}

	/**
	 * Set eoseTransferPortCode
	 */
	public void setEoseTransferPortCode(String eoseTransferPortCode) {
		this.eoseTransferPortCode = eoseTransferPortCode;
		addValidField("eoseTransferPortCode");
	}

	/**
	 * Get eoseTransferPortName
	 */
	@Column(name = "EOSE_TRANSFER_PORT_NAME")
	public String getEoseTransferPortName() {
		return eoseTransferPortName;
	}

	/**
	 * Set eoseTransferPortName
	 */
	public void setEoseTransferPortName(String eoseTransferPortName) {
		this.eoseTransferPortName = eoseTransferPortName;
		addValidField("eoseTransferPortName");
	}

	/**
	 * Get eoseDischargePortId
	 */
	@Column(name = "EOSE_DISCHARGE_PORT_ID")
	public Long getEoseDischargePortId() {
		return eoseDischargePortId;
	}

	/**
	 * Set eoseDischargePortId
	 */
	public void setEoseDischargePortId(Long eoseDischargePortId) {
		this.eoseDischargePortId = eoseDischargePortId;
		addValidField("eoseDischargePortId");
	}

	/**
	 * Get eoseDischargePortCode
	 */
	@Column(name = "EOSE_DISCHARGE_PORT_CODE")
	public String getEoseDischargePortCode() {
		return eoseDischargePortCode;
	}

	/**
	 * Set eoseDischargePortCode
	 */
	public void setEoseDischargePortCode(String eoseDischargePortCode) {
		this.eoseDischargePortCode = eoseDischargePortCode;
		addValidField("eoseDischargePortCode");
	}

	/**
	 * Get eoseDischargePortName
	 */
	@Column(name = "EOSE_DISCHARGE_PORT_NAME")
	public String getEoseDischargePortName() {
		return eoseDischargePortName;
	}

	/**
	 * Set eoseDischargePortName
	 */
	public void setEoseDischargePortName(String eoseDischargePortName) {
		this.eoseDischargePortName = eoseDischargePortName;
		addValidField("eoseDischargePortName");
	}

	/**
	 * Get eoseFinalDestinationId
	 */
	@Column(name = "EOSE_FINAL_DESTINATION_ID")
	public Long getEoseFinalDestinationId() {
		return eoseFinalDestinationId;
	}

	/**
	 * Set eoseFinalDestinationId
	 */
	public void setEoseFinalDestinationId(Long eoseFinalDestinationId) {
		this.eoseFinalDestinationId = eoseFinalDestinationId;
		addValidField("eoseFinalDestinationId");
	}

	/**
	 * Get eoseFinalDestination
	 */
	@Column(name = "EOSE_FINAL_DESTINATION")
	public String getEoseFinalDestination() {
		return eoseFinalDestination;
	}

	/**
	 * Set eoseFinalDestination
	 */
	public void setEoseFinalDestination(String eoseFinalDestination) {
		this.eoseFinalDestination = eoseFinalDestination;
		addValidField("eoseFinalDestination");
	}

	/**
	 * Get eoseFinalDestinationCode
	 */
	@Column(name = "EOSE_FINAL_DESTINATION_CODE")
	public String getEoseFinalDestinationCode() {
		return eoseFinalDestinationCode;
	}

	/**
	 * Set eoseFinalDestinationCode
	 */
	public void setEoseFinalDestinationCode(String eoseFinalDestinationCode) {
		this.eoseFinalDestinationCode = eoseFinalDestinationCode;
		addValidField("eoseFinalDestinationCode");
	}

	/**
	 * Get eoseShipperId
	 */
	@Column(name = "EOSE_SHIPPER_ID")
	public Long getEoseShipperId() {
		return eoseShipperId;
	}

	/**
	 * Set eoseShipperId
	 */
	public void setEoseShipperId(Long eoseShipperId) {
		this.eoseShipperId = eoseShipperId;
		addValidField("eoseShipperId");
	}

	/**
	 * Get eoseShipperCode
	 */
	@Column(name = "EOSE_SHIPPER_CODE")
	public String getEoseShipperCode() {
		return eoseShipperCode;
	}

	/**
	 * Set eoseShipperCode
	 */
	public void setEoseShipperCode(String eoseShipperCode) {
		this.eoseShipperCode = eoseShipperCode;
		addValidField("eoseShipperCode");
	}

	/**
	 * Get eoseShipper
	 */
	@Column(name = "EOSE_SHIPPER")
	public String getEoseShipper() {
		return eoseShipper;
	}

	/**
	 * Set eoseShipper
	 */
	public void setEoseShipper(String eoseShipper) {
		this.eoseShipper = eoseShipper;
		addValidField("eoseShipper");
	}

	/**
	 * Get eoseShipperDetail
	 */
	@Column(name = "EOSE_SHIPPER_DETAIL")
	public String getEoseShipperDetail() {
		return eoseShipperDetail;
	}

	/**
	 * Set eoseShipperDetail
	 */
	public void setEoseShipperDetail(String eoseShipperDetail) {
		this.eoseShipperDetail = eoseShipperDetail;
		addValidField("eoseShipperDetail");
	}

	/**
	 * Get eoseShipperContactName
	 */
	@Column(name = "EOSE_SHIPPER_CONTACT_NAME")
	public String getEoseShipperContactName() {
		return eoseShipperContactName;
	}

	/**
	 * Set eoseShipperContactName
	 */
	public void setEoseShipperContactName(String eoseShipperContactName) {
		this.eoseShipperContactName = eoseShipperContactName;
		addValidField("eoseShipperContactName");
	}

	/**
	 * Get eoseShipperEbsaId
	 */
	@Column(name = "EOSE_SHIPPER_EBSA_ID")
	public Long getEoseShipperEbsaId() {
		return eoseShipperEbsaId;
	}

	/**
	 * Set eoseShipperEbsaId
	 */
	public void setEoseShipperEbsaId(Long eoseShipperEbsaId) {
		this.eoseShipperEbsaId = eoseShipperEbsaId;
		addValidField("eoseShipperEbsaId");
	}

	/**
	 * Get eoseStreetNoPoboxSh
	 */
	@Column(name = "EOSE_STREET_NO_POBOX_SH")
	public String getEoseStreetNoPoboxSh() {
		return eoseStreetNoPoboxSh;
	}

	/**
	 * Set eoseStreetNoPoboxSh
	 */
	public void setEoseStreetNoPoboxSh(String eoseStreetNoPoboxSh) {
		this.eoseStreetNoPoboxSh = eoseStreetNoPoboxSh;
		addValidField("eoseStreetNoPoboxSh");
	}

	/**
	 * Get eoseConsigneeId
	 */
	@Column(name = "EOSE_CONSIGNEE_ID")
	public Long getEoseConsigneeId() {
		return eoseConsigneeId;
	}

	/**
	 * Set eoseConsigneeId
	 */
	public void setEoseConsigneeId(Long eoseConsigneeId) {
		this.eoseConsigneeId = eoseConsigneeId;
		addValidField("eoseConsigneeId");
	}

	/**
	 * Get eoseConsigneeCode
	 */
	@Column(name = "EOSE_CONSIGNEE_CODE")
	public String getEoseConsigneeCode() {
		return eoseConsigneeCode;
	}

	/**
	 * Set eoseConsigneeCode
	 */
	public void setEoseConsigneeCode(String eoseConsigneeCode) {
		this.eoseConsigneeCode = eoseConsigneeCode;
		addValidField("eoseConsigneeCode");
	}

	/**
	 * Get eoseConsignee
	 */
	@Column(name = "EOSE_CONSIGNEE")
	public String getEoseConsignee() {
		return eoseConsignee;
	}

	/**
	 * Set eoseConsignee
	 */
	public void setEoseConsignee(String eoseConsignee) {
		this.eoseConsignee = eoseConsignee;
		addValidField("eoseConsignee");
	}

	/**
	 * Get eoseConsigneeDetail
	 */
	@Column(name = "EOSE_CONSIGNEE_DETAIL")
	public String getEoseConsigneeDetail() {
		return eoseConsigneeDetail;
	}

	/**
	 * Set eoseConsigneeDetail
	 */
	public void setEoseConsigneeDetail(String eoseConsigneeDetail) {
		this.eoseConsigneeDetail = eoseConsigneeDetail;
		addValidField("eoseConsigneeDetail");
	}

	/**
	 * Get eoseSpecificContactName
	 */
	@Column(name = "EOSE_SPECIFIC_CONTACT_NAME")
	public String getEoseSpecificContactName() {
		return eoseSpecificContactName;
	}

	/**
	 * Set eoseSpecificContactName
	 */
	public void setEoseSpecificContactName(String eoseSpecificContactName) {
		this.eoseSpecificContactName = eoseSpecificContactName;
		addValidField("eoseSpecificContactName");
	}

	/**
	 * Get eoseConsigneeEbsaId
	 */
	@Column(name = "EOSE_CONSIGNEE_EBSA_ID")
	public Long getEoseConsigneeEbsaId() {
		return eoseConsigneeEbsaId;
	}

	/**
	 * Set eoseConsigneeEbsaId
	 */
	public void setEoseConsigneeEbsaId(Long eoseConsigneeEbsaId) {
		this.eoseConsigneeEbsaId = eoseConsigneeEbsaId;
		addValidField("eoseConsigneeEbsaId");
	}

	/**
	 * Get eoseStreetNoPoboxCn
	 */
	@Column(name = "EOSE_STREET_NO_POBOX_CN")
	public String getEoseStreetNoPoboxCn() {
		return eoseStreetNoPoboxCn;
	}

	/**
	 * Set eoseStreetNoPoboxCn
	 */
	public void setEoseStreetNoPoboxCn(String eoseStreetNoPoboxCn) {
		this.eoseStreetNoPoboxCn = eoseStreetNoPoboxCn;
		addValidField("eoseStreetNoPoboxCn");
	}

	/**
	 * Get eoseNotifyId
	 */
	@Column(name = "EOSE_NOTIFY_ID")
	public Long getEoseNotifyId() {
		return eoseNotifyId;
	}

	/**
	 * Set eoseNotifyId
	 */
	public void setEoseNotifyId(Long eoseNotifyId) {
		this.eoseNotifyId = eoseNotifyId;
		addValidField("eoseNotifyId");
	}

	/**
	 * Get eoseNotifyCode
	 */
	@Column(name = "EOSE_NOTIFY_CODE")
	public String getEoseNotifyCode() {
		return eoseNotifyCode;
	}

	/**
	 * Set eoseNotifyCode
	 */
	public void setEoseNotifyCode(String eoseNotifyCode) {
		this.eoseNotifyCode = eoseNotifyCode;
		addValidField("eoseNotifyCode");
	}

	/**
	 * Get eoseNotify
	 */
	@Column(name = "EOSE_NOTIFY")
	public String getEoseNotify() {
		return eoseNotify;
	}

	/**
	 * Set eoseNotify
	 */
	public void setEoseNotify(String eoseNotify) {
		this.eoseNotify = eoseNotify;
		addValidField("eoseNotify");
	}

	/**
	 * Get eoseNotifierDetail
	 */
	@Column(name = "EOSE_NOTIFIER_DETAIL")
	public String getEoseNotifierDetail() {
		return eoseNotifierDetail;
	}

	/**
	 * Set eoseNotifierDetail
	 */
	public void setEoseNotifierDetail(String eoseNotifierDetail) {
		this.eoseNotifierDetail = eoseNotifierDetail;
		addValidField("eoseNotifierDetail");
	}

	/**
	 * Get eoseSecondNotifyId
	 */
	@Column(name = "EOSE_SECOND_NOTIFY_ID")
	public Long getEoseSecondNotifyId() {
		return eoseSecondNotifyId;
	}

	/**
	 * Set eoseSecondNotifyId
	 */
	public void setEoseSecondNotifyId(Long eoseSecondNotifyId) {
		this.eoseSecondNotifyId = eoseSecondNotifyId;
		addValidField("eoseSecondNotifyId");
	}

	/**
	 * Get eoseSecondNotify
	 */
	@Column(name = "EOSE_SECOND_NOTIFY")
	public String getEoseSecondNotify() {
		return eoseSecondNotify;
	}

	/**
	 * Set eoseSecondNotify
	 */
	public void setEoseSecondNotify(String eoseSecondNotify) {
		this.eoseSecondNotify = eoseSecondNotify;
		addValidField("eoseSecondNotify");
	}

	/**
	 * Get eoseSecondNotifyCode
	 */
	@Column(name = "EOSE_SECOND_NOTIFY_CODE")
	public String getEoseSecondNotifyCode() {
		return eoseSecondNotifyCode;
	}

	/**
	 * Set eoseSecondNotifyCode
	 */
	public void setEoseSecondNotifyCode(String eoseSecondNotifyCode) {
		this.eoseSecondNotifyCode = eoseSecondNotifyCode;
		addValidField("eoseSecondNotifyCode");
	}

	/**
	 * Get eoseSecondNotifyName
	 */
	@Column(name = "EOSE_SECOND_NOTIFY_NAME")
	public String getEoseSecondNotifyName() {
		return eoseSecondNotifyName;
	}

	/**
	 * Set eoseSecondNotifyName
	 */
	public void setEoseSecondNotifyName(String eoseSecondNotifyName) {
		this.eoseSecondNotifyName = eoseSecondNotifyName;
		addValidField("eoseSecondNotifyName");
	}

	/**
	 * Get eoseContainerVolume
	 */
	@Column(name = "EOSE_CONTAINER_VOLUME")
	public String getEoseContainerVolume() {
		return eoseContainerVolume;
	}

	/**
	 * Set eoseContainerVolume
	 */
	public void setEoseContainerVolume(String eoseContainerVolume) {
		this.eoseContainerVolume = eoseContainerVolume;
		addValidField("eoseContainerVolume");
	}

	/**
	 * Get eosePackageNumber
	 */
	@Column(name = "EOSE_PACKAGE_NUMBER")
	public Integer getEosePackageNumber() {
		return eosePackageNumber;
	}

	/**
	 * Set eosePackageNumber
	 */
	public void setEosePackageNumber(Integer eosePackageNumber) {
		this.eosePackageNumber = eosePackageNumber;
		addValidField("eosePackageNumber");
	}

	/**
	 * Get eoseGrossWeight
	 */
	@Column(name = "EOSE_GROSS_WEIGHT")
	public Double getEoseGrossWeight() {
		return eoseGrossWeight;
	}

	/**
	 * Set eoseGrossWeight
	 */
	public void setEoseGrossWeight(Double eoseGrossWeight) {
		this.eoseGrossWeight = eoseGrossWeight;
		addValidField("eoseGrossWeight");
	}

	/**
	 * Get eoseVol
	 */
	@Column(name = "EOSE_VOL")
	public Double getEoseVol() {
		return eoseVol;
	}

	/**
	 * Set eoseVol
	 */
	public void setEoseVol(Double eoseVol) {
		this.eoseVol = eoseVol;
		addValidField("eoseVol");
	}

	/**
	 * Get eoseConsignId
	 */
	@Column(name = "EOSE_CONSIGN_ID")
	public String getEoseConsignId() {
		return eoseConsignId;
	}

	/**
	 * Set eoseConsignId
	 */
	public void setEoseConsignId(String eoseConsignId) {
		this.eoseConsignId = eoseConsignId;
		addValidField("eoseConsignId");
	}

	/**
	 * Get eosePreVesselName
	 */
	@Column(name = "EOSE_PRE_VESSEL_NAME")
	public String getEosePreVesselName() {
		return eosePreVesselName;
	}

	/**
	 * Set eosePreVesselName
	 */
	public void setEosePreVesselName(String eosePreVesselName) {
		this.eosePreVesselName = eosePreVesselName;
		addValidField("eosePreVesselName");
	}

	/**
	 * Get eosePreVoyage
	 */
	@Column(name = "EOSE_PRE_VOYAGE")
	public String getEosePreVoyage() {
		return eosePreVoyage;
	}

	/**
	 * Set eosePreVoyage
	 */
	public void setEosePreVoyage(String eosePreVoyage) {
		this.eosePreVoyage = eosePreVoyage;
		addValidField("eosePreVoyage");
	}

	/**
	 * Get eosePreBlNo
	 */
	@Column(name = "EOSE_PRE_BL_NO")
	public String getEosePreBlNo() {
		return eosePreBlNo;
	}

	/**
	 * Set eosePreBlNo
	 */
	public void setEosePreBlNo(String eosePreBlNo) {
		this.eosePreBlNo = eosePreBlNo;
		addValidField("eosePreBlNo");
	}

	/**
	 * Get eosePreDischargePortId
	 */
	@Column(name = "EOSE_PRE_DISCHARGE_PORT_ID")
	public Long getEosePreDischargePortId() {
		return eosePreDischargePortId;
	}

	/**
	 * Set eosePreDischargePortId
	 */
	public void setEosePreDischargePortId(Long eosePreDischargePortId) {
		this.eosePreDischargePortId = eosePreDischargePortId;
		addValidField("eosePreDischargePortId");
	}

	/**
	 * Get eosePreDischargePortCode
	 */
	@Column(name = "EOSE_PRE_DISCHARGE_PORT_CODE")
	public String getEosePreDischargePortCode() {
		return eosePreDischargePortCode;
	}

	/**
	 * Set eosePreDischargePortCode
	 */
	public void setEosePreDischargePortCode(String eosePreDischargePortCode) {
		this.eosePreDischargePortCode = eosePreDischargePortCode;
		addValidField("eosePreDischargePortCode");
	}

	/**
	 * Get eosePreDischargePortName
	 */
	@Column(name = "EOSE_PRE_DISCHARGE_PORT_NAME")
	public String getEosePreDischargePortName() {
		return eosePreDischargePortName;
	}

	/**
	 * Set eosePreDischargePortName
	 */
	public void setEosePreDischargePortName(String eosePreDischargePortName) {
		this.eosePreDischargePortName = eosePreDischargePortName;
		addValidField("eosePreDischargePortName");
	}

	/**
	 * Get eosePreEtd
	 */
	@Column(name = "EOSE_PRE_ETD")
	public Date getEosePreEtd() {
		return eosePreEtd;
	}

	/**
	 * Set eosePreEtd
	 */
	public void setEosePreEtd(Date eosePreEtd) {
		this.eosePreEtd = eosePreEtd;
		addValidField("eosePreEtd");
	}

	/**
	 * Get eosePreAta
	 */
	@Column(name = "EOSE_PRE_ATA")
	public Date getEosePreAta() {
		return eosePreAta;
	}

	/**
	 * Set eosePreAta
	 */
	public void setEosePreAta(Date eosePreAta) {
		this.eosePreAta = eosePreAta;
		addValidField("eosePreAta");
	}

	/**
	 * Get eoseNextVesselName
	 */
	@Column(name = "EOSE_NEXT_VESSEL_NAME")
	public String getEoseNextVesselName() {
		return eoseNextVesselName;
	}

	/**
	 * Set eoseNextVesselName
	 */
	public void setEoseNextVesselName(String eoseNextVesselName) {
		this.eoseNextVesselName = eoseNextVesselName;
		addValidField("eoseNextVesselName");
	}

	/**
	 * Get eoseNextVoyage
	 */
	@Column(name = "EOSE_NEXT_VOYAGE")
	public String getEoseNextVoyage() {
		return eoseNextVoyage;
	}

	/**
	 * Set eoseNextVoyage
	 */
	public void setEoseNextVoyage(String eoseNextVoyage) {
		this.eoseNextVoyage = eoseNextVoyage;
		addValidField("eoseNextVoyage");
	}

	/**
	 * Get eoseNextEtd
	 */
	@Column(name = "EOSE_NEXT_ETD")
	public Date getEoseNextEtd() {
		return eoseNextEtd;
	}

	/**
	 * Set eoseNextEtd
	 */
	public void setEoseNextEtd(Date eoseNextEtd) {
		this.eoseNextEtd = eoseNextEtd;
		addValidField("eoseNextEtd");
	}

	/**
	 * Get eoseSedDischargePortId
	 */
	@Column(name = "EOSE_SED_DISCHARGE_PORT_ID")
	public Long getEoseSedDischargePortId() {
		return eoseSedDischargePortId;
	}

	/**
	 * Set eoseSedDischargePortId
	 */
	public void setEoseSedDischargePortId(Long eoseSedDischargePortId) {
		this.eoseSedDischargePortId = eoseSedDischargePortId;
		addValidField("eoseSedDischargePortId");
	}

	/**
	 * Get eoseSedDischargePortCode
	 */
	@Column(name = "EOSE_SED_DISCHARGE_PORT_CODE")
	public String getEoseSedDischargePortCode() {
		return eoseSedDischargePortCode;
	}

	/**
	 * Set eoseSedDischargePortCode
	 */
	public void setEoseSedDischargePortCode(String eoseSedDischargePortCode) {
		this.eoseSedDischargePortCode = eoseSedDischargePortCode;
		addValidField("eoseSedDischargePortCode");
	}

	/**
	 * Get eoseSedDischargePortName
	 */
	@Column(name = "EOSE_SED_DISCHARGE_PORT_NAME")
	public String getEoseSedDischargePortName() {
		return eoseSedDischargePortName;
	}

	/**
	 * Set eoseSedDischargePortName
	 */
	public void setEoseSedDischargePortName(String eoseSedDischargePortName) {
		this.eoseSedDischargePortName = eoseSedDischargePortName;
		addValidField("eoseSedDischargePortName");
	}

	/**
	 * Get eoseDelayReason
	 */
	@Column(name = "EOSE_DELAY_REASON")
	public String getEoseDelayReason() {
		return eoseDelayReason;
	}

	/**
	 * Set eoseDelayReason
	 */
	public void setEoseDelayReason(String eoseDelayReason) {
		this.eoseDelayReason = eoseDelayReason;
		addValidField("eoseDelayReason");
	}

	/**
	 * Get eoseEbpjFCode
	 */
	@Column(name = "EOSE_EBPJ_F_CODE")
	public Long getEoseEbpjFCode() {
		return eoseEbpjFCode;
	}

	/**
	 * Set eoseEbpjFCode
	 */
	public void setEoseEbpjFCode(Long eoseEbpjFCode) {
		this.eoseEbpjFCode = eoseEbpjFCode;
		addValidField("eoseEbpjFCode");
	}

	/**
	 * Get eoseBatchNo
	 */
	@Column(name = "EOSE_BATCH_NO")
	public String getEoseBatchNo() {
		return eoseBatchNo;
	}

	/**
	 * Set eoseBatchNo
	 */
	public void setEoseBatchNo(String eoseBatchNo) {
		this.eoseBatchNo = eoseBatchNo;
		addValidField("eoseBatchNo");
	}

	/**
	 * Get eoseAciCode
	 */
	@Column(name = "EOSE_ACI_CODE")
	public String getEoseAciCode() {
		return eoseAciCode;
	}

	/**
	 * Set eoseAciCode
	 */
	public void setEoseAciCode(String eoseAciCode) {
		this.eoseAciCode = eoseAciCode;
		addValidField("eoseAciCode");
	}

	/**
	 * Get eoseBondNo
	 */
	@Column(name = "EOSE_BOND_NO")
	public String getEoseBondNo() {
		return eoseBondNo;
	}

	/**
	 * Set eoseBondNo
	 */
	public void setEoseBondNo(String eoseBondNo) {
		this.eoseBondNo = eoseBondNo;
		addValidField("eoseBondNo");
	}

	/**
	 * Get eoseBookingAgentCode
	 */
	@Column(name = "EOSE_BOOKING_AGENT_CODE")
	public String getEoseBookingAgentCode() {
		return eoseBookingAgentCode;
	}

	/**
	 * Set eoseBookingAgentCode
	 */
	public void setEoseBookingAgentCode(String eoseBookingAgentCode) {
		this.eoseBookingAgentCode = eoseBookingAgentCode;
		addValidField("eoseBookingAgentCode");
	}

	/**
	 * Get eoseCargoSource
	 */
	@Column(name = "EOSE_CARGO_SOURCE")
	public String getEoseCargoSource() {
		return eoseCargoSource;
	}

	/**
	 * Set eoseCargoSource
	 */
	public void setEoseCargoSource(String eoseCargoSource) {
		this.eoseCargoSource = eoseCargoSource;
		addValidField("eoseCargoSource");
	}

	/**
	 * Get eoseLmId
	 */
	@Column(name = "EOSE_LM_ID")
	public String getEoseLmId() {
		return eoseLmId;
	}

	/**
	 * Set eoseLmId
	 */
	public void setEoseLmId(String eoseLmId) {
		this.eoseLmId = eoseLmId;
		addValidField("eoseLmId");
	}

	/**
	 * Get eoseHouseBlNo
	 */
	@Column(name = "EOSE_HOUSE_BL_NO")
	public String getEoseHouseBlNo() {
		return eoseHouseBlNo;
	}

	/**
	 * Set eoseHouseBlNo
	 */
	public void setEoseHouseBlNo(String eoseHouseBlNo) {
		this.eoseHouseBlNo = eoseHouseBlNo;
		addValidField("eoseHouseBlNo");
	}

	/**
	 * Get eoseScacCode
	 */
	@Column(name = "EOSE_SCAC_CODE")
	public String getEoseScacCode() {
		return eoseScacCode;
	}

	/**
	 * Set eoseScacCode
	 */
	public void setEoseScacCode(String eoseScacCode) {
		this.eoseScacCode = eoseScacCode;
		addValidField("eoseScacCode");
	}

	/**
	 * Get eoseWrapTypeCode
	 */
	@Column(name = "EOSE_WRAP_TYPE_CODE")
	public String getEoseWrapTypeCode() {
		return eoseWrapTypeCode;
	}

	/**
	 * Set eoseWrapTypeCode
	 */
	public void setEoseWrapTypeCode(String eoseWrapTypeCode) {
		this.eoseWrapTypeCode = eoseWrapTypeCode;
		addValidField("eoseWrapTypeCode");
	}

	/**
	 * Get eoseWrapTypeName
	 */
	@Column(name = "EOSE_WRAP_TYPE_NAME")
	public String getEoseWrapTypeName() {
		return eoseWrapTypeName;
	}

	/**
	 * Set eoseWrapTypeName
	 */
	public void setEoseWrapTypeName(String eoseWrapTypeName) {
		this.eoseWrapTypeName = eoseWrapTypeName;
		addValidField("eoseWrapTypeName");
	}

	/**
	 * Get eoseDiscAreaCode
	 */
	@Column(name = "EOSE_DISC_AREA_CODE")
	public String getEoseDiscAreaCode() {
		return eoseDiscAreaCode;
	}

	/**
	 * Set eoseDiscAreaCode
	 */
	public void setEoseDiscAreaCode(String eoseDiscAreaCode) {
		this.eoseDiscAreaCode = eoseDiscAreaCode;
		addValidField("eoseDiscAreaCode");
	}

	/**
	 * Get eoseDiscAreaName
	 */
	@Column(name = "EOSE_DISC_AREA_NAME")
	public String getEoseDiscAreaName() {
		return eoseDiscAreaName;
	}

	/**
	 * Set eoseDiscAreaName
	 */
	public void setEoseDiscAreaName(String eoseDiscAreaName) {
		this.eoseDiscAreaName = eoseDiscAreaName;
		addValidField("eoseDiscAreaName");
	}

	/**
	 * Get eoseClientPackStyle
	 */
	@Column(name = "EOSE_CLIENT_PACK_STYLE")
	public String getEoseClientPackStyle() {
		return eoseClientPackStyle;
	}

	/**
	 * Set eoseClientPackStyle
	 */
	public void setEoseClientPackStyle(String eoseClientPackStyle) {
		this.eoseClientPackStyle = eoseClientPackStyle;
		addValidField("eoseClientPackStyle");
	}

	/**
	 * Get eoseClientPackStyleName
	 */
	@Column(name = "EOSE_CLIENT_PACK_STYLE_NAME")
	public String getEoseClientPackStyleName() {
		return eoseClientPackStyleName;
	}

	/**
	 * Set eoseClientPackStyleName
	 */
	public void setEoseClientPackStyleName(String eoseClientPackStyleName) {
		this.eoseClientPackStyleName = eoseClientPackStyleName;
		addValidField("eoseClientPackStyleName");
	}

	/**
	 * Get eoseBargeTradeId
	 */
	@Column(name = "EOSE_BARGE_TRADE_ID")
	public String getEoseBargeTradeId() {
		return eoseBargeTradeId;
	}

	/**
	 * Set eoseBargeTradeId
	 */
	public void setEoseBargeTradeId(String eoseBargeTradeId) {
		this.eoseBargeTradeId = eoseBargeTradeId;
		addValidField("eoseBargeTradeId");
	}

	/**
	 * Get eoseRepresentativePerson
	 */
	@Column(name = "EOSE_REPRESENTATIVE_PERSON")
	public String getEoseRepresentativePerson() {
		return eoseRepresentativePerson;
	}

	/**
	 * Set eoseRepresentativePerson
	 */
	public void setEoseRepresentativePerson(String eoseRepresentativePerson) {
		this.eoseRepresentativePerson = eoseRepresentativePerson;
		addValidField("eoseRepresentativePerson");
	}

	/**
	 * Get eoseSlotCharterFlag
	 */
	@Column(name = "EOSE_SLOT_CHARTER_FLAG")
	public String getEoseSlotCharterFlag() {
		return eoseSlotCharterFlag;
	}

	/**
	 * Set eoseSlotCharterFlag
	 */
	public void setEoseSlotCharterFlag(String eoseSlotCharterFlag) {
		this.eoseSlotCharterFlag = eoseSlotCharterFlag;
		addValidField("eoseSlotCharterFlag");
	}

	/**
	 * Get eoseDeconsolidatorCode
	 */
	@Column(name = "EOSE_DECONSOLIDATOR_CODE")
	public String getEoseDeconsolidatorCode() {
		return eoseDeconsolidatorCode;
	}

	/**
	 * Set eoseDeconsolidatorCode
	 */
	public void setEoseDeconsolidatorCode(String eoseDeconsolidatorCode) {
		this.eoseDeconsolidatorCode = eoseDeconsolidatorCode;
		addValidField("eoseDeconsolidatorCode");
	}

	/**
	 * Get eoseDeconsolidatorName
	 */
	@Column(name = "EOSE_DECONSOLIDATOR_NAME")
	public String getEoseDeconsolidatorName() {
		return eoseDeconsolidatorName;
	}

	/**
	 * Set eoseDeconsolidatorName
	 */
	public void setEoseDeconsolidatorName(String eoseDeconsolidatorName) {
		this.eoseDeconsolidatorName = eoseDeconsolidatorName;
		addValidField("eoseDeconsolidatorName");
	}

	/**
	 * Get eoseDepotCode
	 */
	@Column(name = "EOSE_DEPOT_CODE")
	public String getEoseDepotCode() {
		return eoseDepotCode;
	}

	/**
	 * Set eoseDepotCode
	 */
	public void setEoseDepotCode(String eoseDepotCode) {
		this.eoseDepotCode = eoseDepotCode;
		addValidField("eoseDepotCode");
	}

	/**
	 * Get eoseDepotName
	 */
	@Column(name = "EOSE_DEPOT_NAME")
	public String getEoseDepotName() {
		return eoseDepotName;
	}

	/**
	 * Set eoseDepotName
	 */
	public void setEoseDepotName(String eoseDepotName) {
		this.eoseDepotName = eoseDepotName;
		addValidField("eoseDepotName");
	}

	/**
	 * Get eoseBatchFlag
	 */
	@Column(name = "EOSE_BATCH_FLAG")
	public String getEoseBatchFlag() {
		return eoseBatchFlag;
	}

	/**
	 * Set eoseBatchFlag
	 */
	public void setEoseBatchFlag(String eoseBatchFlag) {
		this.eoseBatchFlag = eoseBatchFlag;
		addValidField("eoseBatchFlag");
	}

	/**
	 * Get eoseUnCode
	 */
	@Column(name = "EOSE_UN_CODE")
	public String getEoseUnCode() {
		return eoseUnCode;
	}

	/**
	 * Set eoseUnCode
	 */
	public void setEoseUnCode(String eoseUnCode) {
		this.eoseUnCode = eoseUnCode;
		addValidField("eoseUnCode");
	}

	/**
	 * Get eoseVesselCode
	 */
	@Column(name = "EOSE_VESSEL_CODE")
	public String getEoseVesselCode() {
		return eoseVesselCode;
	}

	/**
	 * Set eoseVesselCode
	 */
	public void setEoseVesselCode(String eoseVesselCode) {
		this.eoseVesselCode = eoseVesselCode;
		addValidField("eoseVesselCode");
	}

	/**
	 * Get eoseDestinationCode
	 */
	@Column(name = "EOSE_DESTINATION_CODE")
	public String getEoseDestinationCode() {
		return eoseDestinationCode;
	}

	/**
	 * Set eoseDestinationCode
	 */
	public void setEoseDestinationCode(String eoseDestinationCode) {
		this.eoseDestinationCode = eoseDestinationCode;
		addValidField("eoseDestinationCode");
	}

	/**
	 * Get eoseReachDate
	 */
	@Column(name = "EOSE_REACH_DATE")
	public Date getEoseReachDate() {
		return eoseReachDate;
	}

	/**
	 * Set eoseReachDate
	 */
	public void setEoseReachDate(Date eoseReachDate) {
		this.eoseReachDate = eoseReachDate;
		addValidField("eoseReachDate");
	}

	/**
	 * Get eoseDestinationName
	 */
	@Column(name = "EOSE_DESTINATION_NAME")
	public String getEoseDestinationName() {
		return eoseDestinationName;
	}

	/**
	 * Set eoseDestinationName
	 */
	public void setEoseDestinationName(String eoseDestinationName) {
		this.eoseDestinationName = eoseDestinationName;
		addValidField("eoseDestinationName");
	}

	/**
	 * Get eoseNationalityName
	 */
	@Column(name = "EOSE_NATIONALITY_NAME")
	public String getEoseNationalityName() {
		return eoseNationalityName;
	}

	/**
	 * Set eoseNationalityName
	 */
	public void setEoseNationalityName(String eoseNationalityName) {
		this.eoseNationalityName = eoseNationalityName;
		addValidField("eoseNationalityName");
	}

	/**
	 * Get eoseNationalityCode
	 */
	@Column(name = "EOSE_NATIONALITY_CODE")
	public String getEoseNationalityCode() {
		return eoseNationalityCode;
	}

	/**
	 * Set eoseNationalityCode
	 */
	public void setEoseNationalityCode(String eoseNationalityCode) {
		this.eoseNationalityCode = eoseNationalityCode;
		addValidField("eoseNationalityCode");
	}

	/**
	 * Get eoseVesselCall
	 */
	@Column(name = "EOSE_VESSEL_CALL")
	public String getEoseVesselCall() {
		return eoseVesselCall;
	}

	/**
	 * Set eoseVesselCall
	 */
	public void setEoseVesselCall(String eoseVesselCall) {
		this.eoseVesselCall = eoseVesselCall;
		addValidField("eoseVesselCall");
	}

	/**
	 * Get eoseShippingLine
	 */
	@Column(name = "EOSE_SHIPPING_LINE")
	public String getEoseShippingLine() {
		return eoseShippingLine;
	}

	/**
	 * Set eoseShippingLine
	 */
	public void setEoseShippingLine(String eoseShippingLine) {
		this.eoseShippingLine = eoseShippingLine;
		addValidField("eoseShippingLine");
	}

	/**
	 * Get eoseShippingLineCode
	 */
	@Column(name = "EOSE_SHIPPING_LINE_CODE")
	public String getEoseShippingLineCode() {
		return eoseShippingLineCode;
	}

	/**
	 * Set eoseShippingLineCode
	 */
	public void setEoseShippingLineCode(String eoseShippingLineCode) {
		this.eoseShippingLineCode = eoseShippingLineCode;
		addValidField("eoseShippingLineCode");
	}

	/**
	 * Get eoseShippingLineId
	 */
	@Column(name = "EOSE_SHIPPING_LINE_ID")
	public Long getEoseShippingLineId() {
		return eoseShippingLineId;
	}

	/**
	 * Set eoseShippingLineId
	 */
	public void setEoseShippingLineId(Long eoseShippingLineId) {
		this.eoseShippingLineId = eoseShippingLineId;
		addValidField("eoseShippingLineId");
	}

	/**
	 * Get eoseAgentId
	 */
	@Column(name = "EOSE_AGENT_ID")
	public Long getEoseAgentId() {
		return eoseAgentId;
	}

	/**
	 * Set eoseAgentId
	 */
	public void setEoseAgentId(Long eoseAgentId) {
		this.eoseAgentId = eoseAgentId;
		addValidField("eoseAgentId");
	}

	/**
	 * Get eoseAgentCode
	 */
	@Column(name = "EOSE_AGENT_CODE")
	public String getEoseAgentCode() {
		return eoseAgentCode;
	}

	/**
	 * Set eoseAgentCode
	 */
	public void setEoseAgentCode(String eoseAgentCode) {
		this.eoseAgentCode = eoseAgentCode;
		addValidField("eoseAgentCode");
	}

	/**
	 * Get eoseAgentName
	 */
	@Column(name = "EOSE_AGENT_NAME")
	public String getEoseAgentName() {
		return eoseAgentName;
	}

	/**
	 * Set eoseAgentName
	 */
	public void setEoseAgentName(String eoseAgentName) {
		this.eoseAgentName = eoseAgentName;
		addValidField("eoseAgentName");
	}

	/**
	 * Get eoseReachDateDischarge
	 */
	@Column(name = "EOSE_REACH_DATE_DISCHARGE")
	public Date getEoseReachDateDischarge() {
		return eoseReachDateDischarge;
	}

	/**
	 * Set eoseReachDateDischarge
	 */
	public void setEoseReachDateDischarge(Date eoseReachDateDischarge) {
		this.eoseReachDateDischarge = eoseReachDateDischarge;
		addValidField("eoseReachDateDischarge");
	}

	/**
	 * Get eoseOptDischargePort1Id
	 */
	@Column(name = "EOSE_OPT_DISCHARGE_PORT1_ID")
	public Long getEoseOptDischargePort1Id() {
		return eoseOptDischargePort1Id;
	}

	/**
	 * Set eoseOptDischargePort1Id
	 */
	public void setEoseOptDischargePort1Id(Long eoseOptDischargePort1Id) {
		this.eoseOptDischargePort1Id = eoseOptDischargePort1Id;
		addValidField("eoseOptDischargePort1Id");
	}

	/**
	 * Get eoseOptDischargePort1
	 */
	@Column(name = "EOSE_OPT_DISCHARGE_PORT1")
	public String getEoseOptDischargePort1() {
		return eoseOptDischargePort1;
	}

	/**
	 * Set eoseOptDischargePort1
	 */
	public void setEoseOptDischargePort1(String eoseOptDischargePort1) {
		this.eoseOptDischargePort1 = eoseOptDischargePort1;
		addValidField("eoseOptDischargePort1");
	}

	/**
	 * Get eoseOptDischargePortCode1
	 */
	@Column(name = "EOSE_OPT_DISCHARGE_PORT_CODE1")
	public String getEoseOptDischargePortCode1() {
		return eoseOptDischargePortCode1;
	}

	/**
	 * Set eoseOptDischargePortCode1
	 */
	public void setEoseOptDischargePortCode1(String eoseOptDischargePortCode1) {
		this.eoseOptDischargePortCode1 = eoseOptDischargePortCode1;
		addValidField("eoseOptDischargePortCode1");
	}

	/**
	 * Get eoseOptDischargePort2Id
	 */
	@Column(name = "EOSE_OPT_DISCHARGE_PORT2_ID")
	public Long getEoseOptDischargePort2Id() {
		return eoseOptDischargePort2Id;
	}

	/**
	 * Set eoseOptDischargePort2Id
	 */
	public void setEoseOptDischargePort2Id(Long eoseOptDischargePort2Id) {
		this.eoseOptDischargePort2Id = eoseOptDischargePort2Id;
		addValidField("eoseOptDischargePort2Id");
	}

	/**
	 * Get eoseOptDischargePort2
	 */
	@Column(name = "EOSE_OPT_DISCHARGE_PORT2")
	public String getEoseOptDischargePort2() {
		return eoseOptDischargePort2;
	}

	/**
	 * Set eoseOptDischargePort2
	 */
	public void setEoseOptDischargePort2(String eoseOptDischargePort2) {
		this.eoseOptDischargePort2 = eoseOptDischargePort2;
		addValidField("eoseOptDischargePort2");
	}

	/**
	 * Get eoseOptDischargePortCode2
	 */
	@Column(name = "EOSE_OPT_DISCHARGE_PORT_CODE2")
	public String getEoseOptDischargePortCode2() {
		return eoseOptDischargePortCode2;
	}

	/**
	 * Set eoseOptDischargePortCode2
	 */
	public void setEoseOptDischargePortCode2(String eoseOptDischargePortCode2) {
		this.eoseOptDischargePortCode2 = eoseOptDischargePortCode2;
		addValidField("eoseOptDischargePortCode2");
	}

	/**
	 * Get eoseElsewherePayerCity
	 */
	@Column(name = "EOSE_ELSEWHERE_PAYER_CITY")
	public String getEoseElsewherePayerCity() {
		return eoseElsewherePayerCity;
	}

	/**
	 * Set eoseElsewherePayerCity
	 */
	public void setEoseElsewherePayerCity(String eoseElsewherePayerCity) {
		this.eoseElsewherePayerCity = eoseElsewherePayerCity;
		addValidField("eoseElsewherePayerCity");
	}

	/**
	 * Get eoseElsewherePayerAddress
	 */
	@Column(name = "EOSE_ELSEWHERE_PAYER_ADDRESS")
	public String getEoseElsewherePayerAddress() {
		return eoseElsewherePayerAddress;
	}

	/**
	 * Set eoseElsewherePayerAddress
	 */
	public void setEoseElsewherePayerAddress(String eoseElsewherePayerAddress) {
		this.eoseElsewherePayerAddress = eoseElsewherePayerAddress;
		addValidField("eoseElsewherePayerAddress");
	}

	/**
	 * Get eoseElsewherePayerFax
	 */
	@Column(name = "EOSE_ELSEWHERE_PAYER_FAX")
	public String getEoseElsewherePayerFax() {
		return eoseElsewherePayerFax;
	}

	/**
	 * Set eoseElsewherePayerFax
	 */
	public void setEoseElsewherePayerFax(String eoseElsewherePayerFax) {
		this.eoseElsewherePayerFax = eoseElsewherePayerFax;
		addValidField("eoseElsewherePayerFax");
	}

	/**
	 * Get eoseElsewherePayerTel
	 */
	@Column(name = "EOSE_ELSEWHERE_PAYER_TEL")
	public String getEoseElsewherePayerTel() {
		return eoseElsewherePayerTel;
	}

	/**
	 * Set eoseElsewherePayerTel
	 */
	public void setEoseElsewherePayerTel(String eoseElsewherePayerTel) {
		this.eoseElsewherePayerTel = eoseElsewherePayerTel;
		addValidField("eoseElsewherePayerTel");
	}

	/**
	 * Get eoseElsewherePayer
	 */
	@Column(name = "EOSE_ELSEWHERE_PAYER")
	public String getEoseElsewherePayer() {
		return eoseElsewherePayer;
	}

	/**
	 * Set eoseElsewherePayer
	 */
	public void setEoseElsewherePayer(String eoseElsewherePayer) {
		this.eoseElsewherePayer = eoseElsewherePayer;
		addValidField("eoseElsewherePayer");
	}

	/**
	 * Get eoseElsewherePayerPost
	 */
	@Column(name = "EOSE_ELSEWHERE_PAYER_POST")
	public String getEoseElsewherePayerPost() {
		return eoseElsewherePayerPost;
	}

	/**
	 * Set eoseElsewherePayerPost
	 */
	public void setEoseElsewherePayerPost(String eoseElsewherePayerPost) {
		this.eoseElsewherePayerPost = eoseElsewherePayerPost;
		addValidField("eoseElsewherePayerPost");
	}

	/**
	 * Get eoseOptDischargePort3Id
	 */
	@Column(name = "EOSE_OPT_DISCHARGE_PORT3_ID")
	public Long getEoseOptDischargePort3Id() {
		return eoseOptDischargePort3Id;
	}

	/**
	 * Set eoseOptDischargePort3Id
	 */
	public void setEoseOptDischargePort3Id(Long eoseOptDischargePort3Id) {
		this.eoseOptDischargePort3Id = eoseOptDischargePort3Id;
		addValidField("eoseOptDischargePort3Id");
	}

	/**
	 * Get eoseOptDischargePort3
	 */
	@Column(name = "EOSE_OPT_DISCHARGE_PORT3")
	public String getEoseOptDischargePort3() {
		return eoseOptDischargePort3;
	}

	/**
	 * Set eoseOptDischargePort3
	 */
	public void setEoseOptDischargePort3(String eoseOptDischargePort3) {
		this.eoseOptDischargePort3 = eoseOptDischargePort3;
		addValidField("eoseOptDischargePort3");
	}

	/**
	 * Get eoseOptDischargePortCode3
	 */
	@Column(name = "EOSE_OPT_DISCHARGE_PORT_CODE3")
	public String getEoseOptDischargePortCode3() {
		return eoseOptDischargePortCode3;
	}

	/**
	 * Set eoseOptDischargePortCode3
	 */
	public void setEoseOptDischargePortCode3(String eoseOptDischargePortCode3) {
		this.eoseOptDischargePortCode3 = eoseOptDischargePortCode3;
		addValidField("eoseOptDischargePortCode3");
	}

	/**
	 * Get eoseThirdNotify
	 */
	@Column(name = "EOSE_THIRD_NOTIFY")
	public String getEoseThirdNotify() {
		return eoseThirdNotify;
	}

	/**
	 * Set eoseThirdNotify
	 */
	public void setEoseThirdNotify(String eoseThirdNotify) {
		this.eoseThirdNotify = eoseThirdNotify;
		addValidField("eoseThirdNotify");
	}

	/**
	 * Get eoseThirdNotifyCode
	 */
	@Column(name = "EOSE_THIRD_NOTIFY_CODE")
	public String getEoseThirdNotifyCode() {
		return eoseThirdNotifyCode;
	}

	/**
	 * Set eoseThirdNotifyCode
	 */
	public void setEoseThirdNotifyCode(String eoseThirdNotifyCode) {
		this.eoseThirdNotifyCode = eoseThirdNotifyCode;
		addValidField("eoseThirdNotifyCode");
	}

	/**
	 * Get eoseOptDischargePort4Id
	 */
	@Column(name = "EOSE_OPT_DISCHARGE_PORT4_ID")
	public Long getEoseOptDischargePort4Id() {
		return eoseOptDischargePort4Id;
	}

	/**
	 * Set eoseOptDischargePort4Id
	 */
	public void setEoseOptDischargePort4Id(Long eoseOptDischargePort4Id) {
		this.eoseOptDischargePort4Id = eoseOptDischargePort4Id;
		addValidField("eoseOptDischargePort4Id");
	}

	/**
	 * Get eoseOptDischargePort4
	 */
	@Column(name = "EOSE_OPT_DISCHARGE_PORT4")
	public String getEoseOptDischargePort4() {
		return eoseOptDischargePort4;
	}

	/**
	 * Set eoseOptDischargePort4
	 */
	public void setEoseOptDischargePort4(String eoseOptDischargePort4) {
		this.eoseOptDischargePort4 = eoseOptDischargePort4;
		addValidField("eoseOptDischargePort4");
	}

	/**
	 * Get eoseOptDischargePortCode4
	 */
	@Column(name = "EOSE_OPT_DISCHARGE_PORT_CODE4")
	public String getEoseOptDischargePortCode4() {
		return eoseOptDischargePortCode4;
	}

	/**
	 * Set eoseOptDischargePortCode4
	 */
	public void setEoseOptDischargePortCode4(String eoseOptDischargePortCode4) {
		this.eoseOptDischargePortCode4 = eoseOptDischargePortCode4;
		addValidField("eoseOptDischargePortCode4");
	}

	/**
	 * Get eoseOptDischargePort5Id
	 */
	@Column(name = "EOSE_OPT_DISCHARGE_PORT5_ID")
	public Long getEoseOptDischargePort5Id() {
		return eoseOptDischargePort5Id;
	}

	/**
	 * Set eoseOptDischargePort5Id
	 */
	public void setEoseOptDischargePort5Id(Long eoseOptDischargePort5Id) {
		this.eoseOptDischargePort5Id = eoseOptDischargePort5Id;
		addValidField("eoseOptDischargePort5Id");
	}

	/**
	 * Get eoseOptDischargePort5
	 */
	@Column(name = "EOSE_OPT_DISCHARGE_PORT5")
	public String getEoseOptDischargePort5() {
		return eoseOptDischargePort5;
	}

	/**
	 * Set eoseOptDischargePort5
	 */
	public void setEoseOptDischargePort5(String eoseOptDischargePort5) {
		this.eoseOptDischargePort5 = eoseOptDischargePort5;
		addValidField("eoseOptDischargePort5");
	}

	/**
	 * Get eoseOptDischargePortCode5
	 */
	@Column(name = "EOSE_OPT_DISCHARGE_PORT_CODE5")
	public String getEoseOptDischargePortCode5() {
		return eoseOptDischargePortCode5;
	}

	/**
	 * Set eoseOptDischargePortCode5
	 */
	public void setEoseOptDischargePortCode5(String eoseOptDischargePortCode5) {
		this.eoseOptDischargePortCode5 = eoseOptDischargePortCode5;
		addValidField("eoseOptDischargePortCode5");
	}

	/**
	 * Get eoseBookingPartyId
	 */
	@Column(name = "EOSE_BOOKING_PARTY_ID")
	public Long getEoseBookingPartyId() {
		return eoseBookingPartyId;
	}

	/**
	 * Set eoseBookingPartyId
	 */
	public void setEoseBookingPartyId(Long eoseBookingPartyId) {
		this.eoseBookingPartyId = eoseBookingPartyId;
		addValidField("eoseBookingPartyId");
	}

	/**
	 * Get eoseBookingPartyCode
	 */
	@Column(name = "EOSE_BOOKING_PARTY_CODE")
	public String getEoseBookingPartyCode() {
		return eoseBookingPartyCode;
	}

	/**
	 * Set eoseBookingPartyCode
	 */
	public void setEoseBookingPartyCode(String eoseBookingPartyCode) {
		this.eoseBookingPartyCode = eoseBookingPartyCode;
		addValidField("eoseBookingPartyCode");
	}

	/**
	 * Get eoseBookingPartyName
	 */
	@Column(name = "EOSE_BOOKING_PARTY_NAME")
	public String getEoseBookingPartyName() {
		return eoseBookingPartyName;
	}

	/**
	 * Set eoseBookingPartyName
	 */
	public void setEoseBookingPartyName(String eoseBookingPartyName) {
		this.eoseBookingPartyName = eoseBookingPartyName;
		addValidField("eoseBookingPartyName");
	}

	/**
	 * Get eoseBookingContractNo
	 */
	@Column(name = "EOSE_BOOKING_CONTRACT_NO")
	public String getEoseBookingContractNo() {
		return eoseBookingContractNo;
	}

	/**
	 * Set eoseBookingContractNo
	 */
	public void setEoseBookingContractNo(String eoseBookingContractNo) {
		this.eoseBookingContractNo = eoseBookingContractNo;
		addValidField("eoseBookingContractNo");
	}

	/**
	 * Get eoseEmailSh
	 */
	@Column(name = "EOSE_EMAIL_SH")
	public String getEoseEmailSh() {
		return eoseEmailSh;
	}

	/**
	 * Set eoseEmailSh
	 */
	public void setEoseEmailSh(String eoseEmailSh) {
		this.eoseEmailSh = eoseEmailSh;
		addValidField("eoseEmailSh");
	}

	/**
	 * Get eoseFaxSh
	 */
	@Column(name = "EOSE_FAX_SH")
	public String getEoseFaxSh() {
		return eoseFaxSh;
	}

	/**
	 * Set eoseFaxSh
	 */
	public void setEoseFaxSh(String eoseFaxSh) {
		this.eoseFaxSh = eoseFaxSh;
		addValidField("eoseFaxSh");
	}

	/**
	 * Get eoseTelSh
	 */
	@Column(name = "EOSE_TEL_SH")
	public String getEoseTelSh() {
		return eoseTelSh;
	}

	/**
	 * Set eoseTelSh
	 */
	public void setEoseTelSh(String eoseTelSh) {
		this.eoseTelSh = eoseTelSh;
		addValidField("eoseTelSh");
	}

	/**
	 * Get eoseCityNameShipper
	 */
	@Column(name = "EOSE_CITY_NAME_SHIPPER")
	public String getEoseCityNameShipper() {
		return eoseCityNameShipper;
	}

	/**
	 * Set eoseCityNameShipper
	 */
	public void setEoseCityNameShipper(String eoseCityNameShipper) {
		this.eoseCityNameShipper = eoseCityNameShipper;
		addValidField("eoseCityNameShipper");
	}

	/**
	 * Get eoseCountryCodeShipper
	 */
	@Column(name = "EOSE_COUNTRY_CODE_SHIPPER")
	public String getEoseCountryCodeShipper() {
		return eoseCountryCodeShipper;
	}

	/**
	 * Set eoseCountryCodeShipper
	 */
	public void setEoseCountryCodeShipper(String eoseCountryCodeShipper) {
		this.eoseCountryCodeShipper = eoseCountryCodeShipper;
		addValidField("eoseCountryCodeShipper");
	}

	/**
	 * Get eoseShipperType
	 */
	@Column(name = "EOSE_SHIPPER_TYPE")
	public String getEoseShipperType() {
		return eoseShipperType;
	}

	/**
	 * Set eoseShipperType
	 */
	public void setEoseShipperType(String eoseShipperType) {
		this.eoseShipperType = eoseShipperType;
		addValidField("eoseShipperType");
	}

	/**
	 * Get eoseCountrySubEntitySh
	 */
	@Column(name = "EOSE_COUNTRY_SUB_ENTITY_SH")
	public String getEoseCountrySubEntitySh() {
		return eoseCountrySubEntitySh;
	}

	/**
	 * Set eoseCountrySubEntitySh
	 */
	public void setEoseCountrySubEntitySh(String eoseCountrySubEntitySh) {
		this.eoseCountrySubEntitySh = eoseCountrySubEntitySh;
		addValidField("eoseCountrySubEntitySh");
	}

	/**
	 * Get eoseCountrySubEntityNmSh
	 */
	@Column(name = "EOSE_COUNTRY_SUB_ENTITY_NM_SH")
	public String getEoseCountrySubEntityNmSh() {
		return eoseCountrySubEntityNmSh;
	}

	/**
	 * Set eoseCountrySubEntityNmSh
	 */
	public void setEoseCountrySubEntityNmSh(String eoseCountrySubEntityNmSh) {
		this.eoseCountrySubEntityNmSh = eoseCountrySubEntityNmSh;
		addValidField("eoseCountrySubEntityNmSh");
	}

	/**
	 * Get eosePostcodeShipper
	 */
	@Column(name = "EOSE_POSTCODE_SHIPPER")
	public String getEosePostcodeShipper() {
		return eosePostcodeShipper;
	}

	/**
	 * Set eosePostcodeShipper
	 */
	public void setEosePostcodeShipper(String eosePostcodeShipper) {
		this.eosePostcodeShipper = eosePostcodeShipper;
		addValidField("eosePostcodeShipper");
	}

	/**
	 * Get eoseBlSendModeCode
	 */
	@Column(name = "EOSE_BL_SEND_MODE_CODE")
	public String getEoseBlSendModeCode() {
		return eoseBlSendModeCode;
	}

	/**
	 * Set eoseBlSendModeCode
	 */
	public void setEoseBlSendModeCode(String eoseBlSendModeCode) {
		this.eoseBlSendModeCode = eoseBlSendModeCode;
		addValidField("eoseBlSendModeCode");
	}

	/**
	 * Get eoseBlSendModeName
	 */
	@Column(name = "EOSE_BL_SEND_MODE_NAME")
	public String getEoseBlSendModeName() {
		return eoseBlSendModeName;
	}

	/**
	 * Set eoseBlSendModeName
	 */
	public void setEoseBlSendModeName(String eoseBlSendModeName) {
		this.eoseBlSendModeName = eoseBlSendModeName;
		addValidField("eoseBlSendModeName");
	}

	/**
	 * Get eoseReleaseTime
	 */
	@Column(name = "EOSE_RELEASE_TIME")
	public Date getEoseReleaseTime() {
		return eoseReleaseTime;
	}

	/**
	 * Set eoseReleaseTime
	 */
	public void setEoseReleaseTime(Date eoseReleaseTime) {
		this.eoseReleaseTime = eoseReleaseTime;
		addValidField("eoseReleaseTime");
	}

	/**
	 * Get eoseChargeType
	 */
	@Column(name = "EOSE_CHARGE_TYPE")
	public String getEoseChargeType() {
		return eoseChargeType;
	}

	/**
	 * Set eoseChargeType
	 */
	public void setEoseChargeType(String eoseChargeType) {
		this.eoseChargeType = eoseChargeType;
		addValidField("eoseChargeType");
	}

	/**
	 * Get eoseAssociatedBlNo
	 */
	@Column(name = "EOSE_ASSOCIATED_BL_NO")
	public String getEoseAssociatedBlNo() {
		return eoseAssociatedBlNo;
	}

	/**
	 * Set eoseAssociatedBlNo
	 */
	public void setEoseAssociatedBlNo(String eoseAssociatedBlNo) {
		this.eoseAssociatedBlNo = eoseAssociatedBlNo;
		addValidField("eoseAssociatedBlNo");
	}

	/**
	 * Get eoseServiceContractNo
	 */
	@Column(name = "EOSE_SERVICE_CONTRACT_NO")
	public String getEoseServiceContractNo() {
		return eoseServiceContractNo;
	}

	/**
	 * Set eoseServiceContractNo
	 */
	public void setEoseServiceContractNo(String eoseServiceContractNo) {
		this.eoseServiceContractNo = eoseServiceContractNo;
		addValidField("eoseServiceContractNo");
	}

	/**
	 * Get eosePayPlaceCode
	 */
	@Column(name = "EOSE_PAY_PLACE_CODE")
	public String getEosePayPlaceCode() {
		return eosePayPlaceCode;
	}

	/**
	 * Set eosePayPlaceCode
	 */
	public void setEosePayPlaceCode(String eosePayPlaceCode) {
		this.eosePayPlaceCode = eosePayPlaceCode;
		addValidField("eosePayPlaceCode");
	}

	/**
	 * Get eosePayPlaceName
	 */
	@Column(name = "EOSE_PAY_PLACE_NAME")
	public String getEosePayPlaceName() {
		return eosePayPlaceName;
	}

	/**
	 * Set eosePayPlaceName
	 */
	public void setEosePayPlaceName(String eosePayPlaceName) {
		this.eosePayPlaceName = eosePayPlaceName;
		addValidField("eosePayPlaceName");
	}

	/**
	 * Get eoseScBeforeAfterFlag
	 */
	@Column(name = "EOSE_SC_BEFORE_AFTER_FLAG")
	public Integer getEoseScBeforeAfterFlag() {
		return eoseScBeforeAfterFlag;
	}

	/**
	 * Set eoseScBeforeAfterFlag
	 */
	public void setEoseScBeforeAfterFlag(Integer eoseScBeforeAfterFlag) {
		this.eoseScBeforeAfterFlag = eoseScBeforeAfterFlag;
		addValidField("eoseScBeforeAfterFlag");
	}

	/**
	 * Get eoseAmendmentCode
	 */
	@Column(name = "EOSE_AMENDMENT_CODE")
	public String getEoseAmendmentCode() {
		return eoseAmendmentCode;
	}

	/**
	 * Set eoseAmendmentCode
	 */
	public void setEoseAmendmentCode(String eoseAmendmentCode) {
		this.eoseAmendmentCode = eoseAmendmentCode;
		addValidField("eoseAmendmentCode");
	}

	/**
	 * Get eoseAmendmentName
	 */
	@Column(name = "EOSE_AMENDMENT_NAME")
	public String getEoseAmendmentName() {
		return eoseAmendmentName;
	}

	/**
	 * Set eoseAmendmentName
	 */
	public void setEoseAmendmentName(String eoseAmendmentName) {
		this.eoseAmendmentName = eoseAmendmentName;
		addValidField("eoseAmendmentName");
	}

	/**
	 * Get eoseFobBkParty
	 */
	@Column(name = "EOSE_FOB_BK_PARTY")
	public String getEoseFobBkParty() {
		return eoseFobBkParty;
	}

	/**
	 * Set eoseFobBkParty
	 */
	public void setEoseFobBkParty(String eoseFobBkParty) {
		this.eoseFobBkParty = eoseFobBkParty;
		addValidField("eoseFobBkParty");
	}

	/**
	 * Get eoseFobBkPartyId
	 */
	@Column(name = "EOSE_FOB_BK_PARTY_ID")
	public String getEoseFobBkPartyId() {
		return eoseFobBkPartyId;
	}

	/**
	 * Set eoseFobBkPartyId
	 */
	public void setEoseFobBkPartyId(String eoseFobBkPartyId) {
		this.eoseFobBkPartyId = eoseFobBkPartyId;
		addValidField("eoseFobBkPartyId");
	}

	/**
	 * Get eoseCustomDisposeFlag
	 */
	@Column(name = "EOSE_CUSTOM_DISPOSE_FLAG")
	public String getEoseCustomDisposeFlag() {
		return eoseCustomDisposeFlag;
	}

	/**
	 * Set eoseCustomDisposeFlag
	 */
	public void setEoseCustomDisposeFlag(String eoseCustomDisposeFlag) {
		this.eoseCustomDisposeFlag = eoseCustomDisposeFlag;
		addValidField("eoseCustomDisposeFlag");
	}

	/**
	 * Get eoseCustomShipVoy
	 */
	@Column(name = "EOSE_CUSTOM_SHIP_VOY")
	public String getEoseCustomShipVoy() {
		return eoseCustomShipVoy;
	}

	/**
	 * Set eoseCustomShipVoy
	 */
	public void setEoseCustomShipVoy(String eoseCustomShipVoy) {
		this.eoseCustomShipVoy = eoseCustomShipVoy;
		addValidField("eoseCustomShipVoy");
	}

	/**
	 * Get eoseCustomsSealNo
	 */
	@Column(name = "EOSE_CUSTOMS_SEAL_NO")
	public String getEoseCustomsSealNo() {
		return eoseCustomsSealNo;
	}

	/**
	 * Set eoseCustomsSealNo
	 */
	public void setEoseCustomsSealNo(String eoseCustomsSealNo) {
		this.eoseCustomsSealNo = eoseCustomsSealNo;
		addValidField("eoseCustomsSealNo");
	}

	/**
	 * Get eoseTrade
	 */
	@Column(name = "EOSE_TRADE")
	public String getEoseTrade() {
		return eoseTrade;
	}

	/**
	 * Set eoseTrade
	 */
	public void setEoseTrade(String eoseTrade) {
		this.eoseTrade = eoseTrade;
		addValidField("eoseTrade");
	}

	/**
	 * Get eoseTradeId
	 */
	@Column(name = "EOSE_TRADE_ID")
	public String getEoseTradeId() {
		return eoseTradeId;
	}

	/**
	 * Set eoseTradeId
	 */
	public void setEoseTradeId(String eoseTradeId) {
		this.eoseTradeId = eoseTradeId;
		addValidField("eoseTradeId");
	}

	/**
	 * Get eoseNextVesselCode
	 */
	@Column(name = "EOSE_NEXT_VESSEL_CODE")
	public String getEoseNextVesselCode() {
		return eoseNextVesselCode;
	}

	/**
	 * Set eoseNextVesselCode
	 */
	public void setEoseNextVesselCode(String eoseNextVesselCode) {
		this.eoseNextVesselCode = eoseNextVesselCode;
		addValidField("eoseNextVesselCode");
	}

	/**
	 * Get eoseSecondCode
	 */
	@Column(name = "EOSE_SECOND_CODE")
	public String getEoseSecondCode() {
		return eoseSecondCode;
	}

	/**
	 * Set eoseSecondCode
	 */
	public void setEoseSecondCode(String eoseSecondCode) {
		this.eoseSecondCode = eoseSecondCode;
		addValidField("eoseSecondCode");
	}

	/**
	 * Get eoseSedOperateAreaCode
	 */
	@Column(name = "EOSE_SED_OPERATE_AREA_CODE")
	public String getEoseSedOperateAreaCode() {
		return eoseSedOperateAreaCode;
	}

	/**
	 * Set eoseSedOperateAreaCode
	 */
	public void setEoseSedOperateAreaCode(String eoseSedOperateAreaCode) {
		this.eoseSedOperateAreaCode = eoseSedOperateAreaCode;
		addValidField("eoseSedOperateAreaCode");
	}

	/**
	 * Get eoseSedOperateAreaName
	 */
	@Column(name = "EOSE_SED_OPERATE_AREA_NAME")
	public String getEoseSedOperateAreaName() {
		return eoseSedOperateAreaName;
	}

	/**
	 * Set eoseSedOperateAreaName
	 */
	public void setEoseSedOperateAreaName(String eoseSedOperateAreaName) {
		this.eoseSedOperateAreaName = eoseSedOperateAreaName;
		addValidField("eoseSedOperateAreaName");
	}

	/**
	 * Get eoseSidoCreator
	 */
	@Column(name = "EOSE_SIDO_CREATOR")
	public String getEoseSidoCreator() {
		return eoseSidoCreator;
	}

	/**
	 * Set eoseSidoCreator
	 */
	public void setEoseSidoCreator(String eoseSidoCreator) {
		this.eoseSidoCreator = eoseSidoCreator;
		addValidField("eoseSidoCreator");
	}

	/**
	 * Get eoseExchangeRate
	 */
	@Column(name = "EOSE_EXCHANGE_RATE")
	public Double getEoseExchangeRate() {
		return eoseExchangeRate;
	}

	/**
	 * Set eoseExchangeRate
	 */
	public void setEoseExchangeRate(Double eoseExchangeRate) {
		this.eoseExchangeRate = eoseExchangeRate;
		addValidField("eoseExchangeRate");
	}

	/**
	 * Get eoseExchangeName
	 */
	@Column(name = "EOSE_EXCHANGE_NAME")
	public String getEoseExchangeName() {
		return eoseExchangeName;
	}

	/**
	 * Set eoseExchangeName
	 */
	public void setEoseExchangeName(String eoseExchangeName) {
		this.eoseExchangeName = eoseExchangeName;
		addValidField("eoseExchangeName");
	}

	/**
	 * Get eoseBlId
	 */
	@Column(name = "EOSE_BL_ID")
	public String getEoseBlId() {
		return eoseBlId;
	}

	/**
	 * Set eoseBlId
	 */
	public void setEoseBlId(String eoseBlId) {
		this.eoseBlId = eoseBlId;
		addValidField("eoseBlId");
	}

	/**
	 * Get eoseHdVesselCode
	 */
	@Column(name = "EOSE_HD_VESSEL_CODE")
	public String getEoseHdVesselCode() {
		return eoseHdVesselCode;
	}

	/**
	 * Set eoseHdVesselCode
	 */
	public void setEoseHdVesselCode(String eoseHdVesselCode) {
		this.eoseHdVesselCode = eoseHdVesselCode;
		addValidField("eoseHdVesselCode");
	}

	/**
	 * Get eoseHdVesselName
	 */
	@Column(name = "EOSE_HD_VESSEL_NAME")
	public String getEoseHdVesselName() {
		return eoseHdVesselName;
	}

	/**
	 * Set eoseHdVesselName
	 */
	public void setEoseHdVesselName(String eoseHdVesselName) {
		this.eoseHdVesselName = eoseHdVesselName;
		addValidField("eoseHdVesselName");
	}

	/**
	 * Get eoseReceiptTraffic
	 */
	@Column(name = "EOSE_RECEIPT_TRAFFIC")
	public String getEoseReceiptTraffic() {
		return eoseReceiptTraffic;
	}

	/**
	 * Set eoseReceiptTraffic
	 */
	public void setEoseReceiptTraffic(String eoseReceiptTraffic) {
		this.eoseReceiptTraffic = eoseReceiptTraffic;
		addValidField("eoseReceiptTraffic");
	}

	/**
	 * Get eoseDestinationTraffic
	 */
	@Column(name = "EOSE_DESTINATION_TRAFFIC")
	public String getEoseDestinationTraffic() {
		return eoseDestinationTraffic;
	}

	/**
	 * Set eoseDestinationTraffic
	 */
	public void setEoseDestinationTraffic(String eoseDestinationTraffic) {
		this.eoseDestinationTraffic = eoseDestinationTraffic;
		addValidField("eoseDestinationTraffic");
	}

	/**
	 * Get eoseCargoNature
	 */
	@Column(name = "EOSE_CARGO_NATURE")
	public String getEoseCargoNature() {
		return eoseCargoNature;
	}

	/**
	 * Set eoseCargoNature
	 */
	public void setEoseCargoNature(String eoseCargoNature) {
		this.eoseCargoNature = eoseCargoNature;
		addValidField("eoseCargoNature");
	}

	/**
	 * Get eoseCusStatusGoodsCode
	 */
	@Column(name = "EOSE_CUS_STATUS_GOODS_CODE")
	public String getEoseCusStatusGoodsCode() {
		return eoseCusStatusGoodsCode;
	}

	/**
	 * Set eoseCusStatusGoodsCode
	 */
	public void setEoseCusStatusGoodsCode(String eoseCusStatusGoodsCode) {
		this.eoseCusStatusGoodsCode = eoseCusStatusGoodsCode;
		addValidField("eoseCusStatusGoodsCode");
	}

	/**
	 * Get eoseCusStatusGoodsName
	 */
	@Column(name = "EOSE_CUS_STATUS_GOODS_NAME")
	public String getEoseCusStatusGoodsName() {
		return eoseCusStatusGoodsName;
	}

	/**
	 * Set eoseCusStatusGoodsName
	 */
	public void setEoseCusStatusGoodsName(String eoseCusStatusGoodsName) {
		this.eoseCusStatusGoodsName = eoseCusStatusGoodsName;
		addValidField("eoseCusStatusGoodsName");
	}

	/**
	 * Get eoseCityNameDc
	 */
	@Column(name = "EOSE_CITY_NAME_DC")
	public String getEoseCityNameDc() {
		return eoseCityNameDc;
	}

	/**
	 * Set eoseCityNameDc
	 */
	public void setEoseCityNameDc(String eoseCityNameDc) {
		this.eoseCityNameDc = eoseCityNameDc;
		addValidField("eoseCityNameDc");
	}

	/**
	 * Get eoseCountryCodeDc
	 */
	@Column(name = "EOSE_COUNTRY_CODE_DC")
	public String getEoseCountryCodeDc() {
		return eoseCountryCodeDc;
	}

	/**
	 * Set eoseCountryCodeDc
	 */
	public void setEoseCountryCodeDc(String eoseCountryCodeDc) {
		this.eoseCountryCodeDc = eoseCountryCodeDc;
		addValidField("eoseCountryCodeDc");
	}

	/**
	 * Get eoseCountryNameDc
	 */
	@Column(name = "EOSE_COUNTRY_NAME_DC")
	public String getEoseCountryNameDc() {
		return eoseCountryNameDc;
	}

	/**
	 * Set eoseCountryNameDc
	 */
	public void setEoseCountryNameDc(String eoseCountryNameDc) {
		this.eoseCountryNameDc = eoseCountryNameDc;
		addValidField("eoseCountryNameDc");
	}

	/**
	 * Get eoseStreetNumberPoboxDc
	 */
	@Column(name = "EOSE_STREET_NUMBER_POBOX_DC")
	public String getEoseStreetNumberPoboxDc() {
		return eoseStreetNumberPoboxDc;
	}

	/**
	 * Set eoseStreetNumberPoboxDc
	 */
	public void setEoseStreetNumberPoboxDc(String eoseStreetNumberPoboxDc) {
		this.eoseStreetNumberPoboxDc = eoseStreetNumberPoboxDc;
		addValidField("eoseStreetNumberPoboxDc");
	}

	/**
	 * Get eoseCountrySubEntityDc
	 */
	@Column(name = "EOSE_COUNTRY_SUB_ENTITY_DC")
	public String getEoseCountrySubEntityDc() {
		return eoseCountrySubEntityDc;
	}

	/**
	 * Set eoseCountrySubEntityDc
	 */
	public void setEoseCountrySubEntityDc(String eoseCountrySubEntityDc) {
		this.eoseCountrySubEntityDc = eoseCountrySubEntityDc;
		addValidField("eoseCountrySubEntityDc");
	}

	/**
	 * Get eoseCountrySubEntityNmDc
	 */
	@Column(name = "EOSE_COUNTRY_SUB_ENTITY_NM_DC")
	public String getEoseCountrySubEntityNmDc() {
		return eoseCountrySubEntityNmDc;
	}

	/**
	 * Set eoseCountrySubEntityNmDc
	 */
	public void setEoseCountrySubEntityNmDc(String eoseCountrySubEntityNmDc) {
		this.eoseCountrySubEntityNmDc = eoseCountrySubEntityNmDc;
		addValidField("eoseCountrySubEntityNmDc");
	}

	/**
	 * Get eosePostcodeDc
	 */
	@Column(name = "EOSE_POSTCODE_DC")
	public String getEosePostcodeDc() {
		return eosePostcodeDc;
	}

	/**
	 * Set eosePostcodeDc
	 */
	public void setEosePostcodeDc(String eosePostcodeDc) {
		this.eosePostcodeDc = eosePostcodeDc;
		addValidField("eosePostcodeDc");
	}

	/**
	 * Get eoseCargoName
	 */
	@Column(name = "EOSE_CARGO_NAME")
	public String getEoseCargoName() {
		return eoseCargoName;
	}

	/**
	 * Set eoseCargoName
	 */
	public void setEoseCargoName(String eoseCargoName) {
		this.eoseCargoName = eoseCargoName;
		addValidField("eoseCargoName");
	}

	/**
	 * Get eoseConsignedPlaceCode
	 */
	@Column(name = "EOSE_CONSIGNED_PLACE_CODE")
	public String getEoseConsignedPlaceCode() {
		return eoseConsignedPlaceCode;
	}

	/**
	 * Set eoseConsignedPlaceCode
	 */
	public void setEoseConsignedPlaceCode(String eoseConsignedPlaceCode) {
		this.eoseConsignedPlaceCode = eoseConsignedPlaceCode;
		addValidField("eoseConsignedPlaceCode");
	}

	/**
	 * Get eoseShipmentDate
	 */
	@Column(name = "EOSE_SHIPMENT_DATE")
	public Date getEoseShipmentDate() {
		return eoseShipmentDate;
	}

	/**
	 * Set eoseShipmentDate
	 */
	public void setEoseShipmentDate(Date eoseShipmentDate) {
		this.eoseShipmentDate = eoseShipmentDate;
		addValidField("eoseShipmentDate");
	}

	/**
	 * Get eoseContainerFlag
	 */
	@Column(name = "EOSE_CONTAINER_FLAG")
	public String getEoseContainerFlag() {
		return eoseContainerFlag;
	}

	/**
	 * Set eoseContainerFlag
	 */
	public void setEoseContainerFlag(String eoseContainerFlag) {
		this.eoseContainerFlag = eoseContainerFlag;
		addValidField("eoseContainerFlag");
	}

	/**
	 * Get eoseContainerNumber
	 */
	@Column(name = "EOSE_CONTAINER_NUMBER")
	public Long getEoseContainerNumber() {
		return eoseContainerNumber;
	}

	/**
	 * Set eoseContainerNumber
	 */
	public void setEoseContainerNumber(Long eoseContainerNumber) {
		this.eoseContainerNumber = eoseContainerNumber;
		addValidField("eoseContainerNumber");
	}

	/**
	 * Get eoseContainerCount
	 */
	@Column(name = "EOSE_CONTAINER_COUNT")
	public Long getEoseContainerCount() {
		return eoseContainerCount;
	}

	/**
	 * Set eoseContainerCount
	 */
	public void setEoseContainerCount(Long eoseContainerCount) {
		this.eoseContainerCount = eoseContainerCount;
		addValidField("eoseContainerCount");
	}

	/**
	 * Get eoseLclType
	 */
	@Column(name = "EOSE_LCL_TYPE")
	public String getEoseLclType() {
		return eoseLclType;
	}

	/**
	 * Set eoseLclType
	 */
	public void setEoseLclType(String eoseLclType) {
		this.eoseLclType = eoseLclType;
		addValidField("eoseLclType");
	}

	/**
	 * Get eoseAgreementType
	 */
	@Column(name = "EOSE_AGREEMENT_TYPE")
	public String getEoseAgreementType() {
		return eoseAgreementType;
	}

	/**
	 * Set eoseAgreementType
	 */
	public void setEoseAgreementType(String eoseAgreementType) {
		this.eoseAgreementType = eoseAgreementType;
		addValidField("eoseAgreementType");
	}

	/**
	 * Get eoseQuarantineCode
	 */
	@Column(name = "EOSE_QUARANTINE_CODE")
	public String getEoseQuarantineCode() {
		return eoseQuarantineCode;
	}

	/**
	 * Set eoseQuarantineCode
	 */
	public void setEoseQuarantineCode(String eoseQuarantineCode) {
		this.eoseQuarantineCode = eoseQuarantineCode;
		addValidField("eoseQuarantineCode");
	}

	/**
	 * Get eoseDeliveryPlaceId
	 */
	@Column(name = "EOSE_DELIVERY_PLACE_ID")
	public Long getEoseDeliveryPlaceId() {
		return eoseDeliveryPlaceId;
	}

	/**
	 * Set eoseDeliveryPlaceId
	 */
	public void setEoseDeliveryPlaceId(Long eoseDeliveryPlaceId) {
		this.eoseDeliveryPlaceId = eoseDeliveryPlaceId;
		addValidField("eoseDeliveryPlaceId");
	}

	/**
	 * Get eoseDeliveryPlace
	 */
	@Column(name = "EOSE_DELIVERY_PLACE")
	public String getEoseDeliveryPlace() {
		return eoseDeliveryPlace;
	}

	/**
	 * Set eoseDeliveryPlace
	 */
	public void setEoseDeliveryPlace(String eoseDeliveryPlace) {
		this.eoseDeliveryPlace = eoseDeliveryPlace;
		addValidField("eoseDeliveryPlace");
	}

	/**
	 * Get eoseDeliveryPlaceCode
	 */
	@Column(name = "EOSE_DELIVERY_PLACE_CODE")
	public String getEoseDeliveryPlaceCode() {
		return eoseDeliveryPlaceCode;
	}

	/**
	 * Set eoseDeliveryPlaceCode
	 */
	public void setEoseDeliveryPlaceCode(String eoseDeliveryPlaceCode) {
		this.eoseDeliveryPlaceCode = eoseDeliveryPlaceCode;
		addValidField("eoseDeliveryPlaceCode");
	}

	/**
	 * Get eoseCurrency
	 */
	@Column(name = "EOSE_CURRENCY")
	public String getEoseCurrency() {
		return eoseCurrency;
	}

	/**
	 * Set eoseCurrency
	 */
	public void setEoseCurrency(String eoseCurrency) {
		this.eoseCurrency = eoseCurrency;
		addValidField("eoseCurrency");
	}

	/**
	 * Get eoseCurrencyName
	 */
	@Column(name = "EOSE_CURRENCY_NAME")
	public String getEoseCurrencyName() {
		return eoseCurrencyName;
	}

	/**
	 * Set eoseCurrencyName
	 */
	public void setEoseCurrencyName(String eoseCurrencyName) {
		this.eoseCurrencyName = eoseCurrencyName;
		addValidField("eoseCurrencyName");
	}

	/**
	 * Get eoseOptDeliveryPlace
	 */
	@Column(name = "EOSE_OPT_DELIVERY_PLACE")
	public String getEoseOptDeliveryPlace() {
		return eoseOptDeliveryPlace;
	}

	/**
	 * Set eoseOptDeliveryPlace
	 */
	public void setEoseOptDeliveryPlace(String eoseOptDeliveryPlace) {
		this.eoseOptDeliveryPlace = eoseOptDeliveryPlace;
		addValidField("eoseOptDeliveryPlace");
	}

	/**
	 * Get eoseOptDeliveryPlaceCode
	 */
	@Column(name = "EOSE_OPT_DELIVERY_PLACE_CODE")
	public String getEoseOptDeliveryPlaceCode() {
		return eoseOptDeliveryPlaceCode;
	}

	/**
	 * Set eoseOptDeliveryPlaceCode
	 */
	public void setEoseOptDeliveryPlaceCode(String eoseOptDeliveryPlaceCode) {
		this.eoseOptDeliveryPlaceCode = eoseOptDeliveryPlaceCode;
		addValidField("eoseOptDeliveryPlaceCode");
	}

	/**
	 * Get eoseContactPerson
	 */
	@Column(name = "EOSE_CONTACT_PERSON")
	public String getEoseContactPerson() {
		return eoseContactPerson;
	}

	/**
	 * Set eoseContactPerson
	 */
	public void setEoseContactPerson(String eoseContactPerson) {
		this.eoseContactPerson = eoseContactPerson;
		addValidField("eoseContactPerson");
	}

	/**
	 * Get eoseContactorFax
	 */
	@Column(name = "EOSE_CONTACTOR_FAX")
	public String getEoseContactorFax() {
		return eoseContactorFax;
	}

	/**
	 * Set eoseContactorFax
	 */
	public void setEoseContactorFax(String eoseContactorFax) {
		this.eoseContactorFax = eoseContactorFax;
		addValidField("eoseContactorFax");
	}

	/**
	 * Get eoseContactorTelephone
	 */
	@Column(name = "EOSE_CONTACTOR_TELEPHONE")
	public String getEoseContactorTelephone() {
		return eoseContactorTelephone;
	}

	/**
	 * Set eoseContactorTelephone
	 */
	public void setEoseContactorTelephone(String eoseContactorTelephone) {
		this.eoseContactorTelephone = eoseContactorTelephone;
		addValidField("eoseContactorTelephone");
	}

	/**
	 * Get eoseContactorEmail
	 */
	@Column(name = "EOSE_CONTACTOR_EMAIL")
	public String getEoseContactorEmail() {
		return eoseContactorEmail;
	}

	/**
	 * Set eoseContactorEmail
	 */
	public void setEoseContactorEmail(String eoseContactorEmail) {
		this.eoseContactorEmail = eoseContactorEmail;
		addValidField("eoseContactorEmail");
	}

	/**
	 * Get eoseCustCsgNo
	 */
	@Column(name = "EOSE_CUST_CSG_NO")
	public String getEoseCustCsgNo() {
		return eoseCustCsgNo;
	}

	/**
	 * Set eoseCustCsgNo
	 */
	public void setEoseCustCsgNo(String eoseCustCsgNo) {
		this.eoseCustCsgNo = eoseCustCsgNo;
		addValidField("eoseCustCsgNo");
	}

	/**
	 * Get eoseImo
	 */
	@Column(name = "EOSE_IMO")
	public String getEoseImo() {
		return eoseImo;
	}

	/**
	 * Set eoseImo
	 */
	public void setEoseImo(String eoseImo) {
		this.eoseImo = eoseImo;
		addValidField("eoseImo");
	}

	/**
	 * Get eoseDeparturePortId
	 */
	@Column(name = "EOSE_DEPARTURE_PORT_ID")
	public Long getEoseDeparturePortId() {
		return eoseDeparturePortId;
	}

	/**
	 * Set eoseDeparturePortId
	 */
	public void setEoseDeparturePortId(Long eoseDeparturePortId) {
		this.eoseDeparturePortId = eoseDeparturePortId;
		addValidField("eoseDeparturePortId");
	}

	/**
	 * Get eoseDeparturePort
	 */
	@Column(name = "EOSE_DEPARTURE_PORT")
	public String getEoseDeparturePort() {
		return eoseDeparturePort;
	}

	/**
	 * Set eoseDeparturePort
	 */
	public void setEoseDeparturePort(String eoseDeparturePort) {
		this.eoseDeparturePort = eoseDeparturePort;
		addValidField("eoseDeparturePort");
	}

	/**
	 * Get eoseDeparturePortCode
	 */
	@Column(name = "EOSE_DEPARTURE_PORT_CODE")
	public String getEoseDeparturePortCode() {
		return eoseDeparturePortCode;
	}

	/**
	 * Set eoseDeparturePortCode
	 */
	public void setEoseDeparturePortCode(String eoseDeparturePortCode) {
		this.eoseDeparturePortCode = eoseDeparturePortCode;
		addValidField("eoseDeparturePortCode");
	}

	/**
	 * Get eoseTradeType
	 */
	@Column(name = "EOSE_TRADE_TYPE")
	public String getEoseTradeType() {
		return eoseTradeType;
	}

	/**
	 * Set eoseTradeType
	 */
	public void setEoseTradeType(String eoseTradeType) {
		this.eoseTradeType = eoseTradeType;
		addValidField("eoseTradeType");
	}

	/**
	 * Get eoseAmsCode
	 */
	@Column(name = "EOSE_AMS_CODE")
	public String getEoseAmsCode() {
		return eoseAmsCode;
	}

	/**
	 * Set eoseAmsCode
	 */
	public void setEoseAmsCode(String eoseAmsCode) {
		this.eoseAmsCode = eoseAmsCode;
		addValidField("eoseAmsCode");
	}

	/**
	 * Get eoseDestinationProperty
	 */
	@Column(name = "EOSE_DESTINATION_PROPERTY")
	public String getEoseDestinationProperty() {
		return eoseDestinationProperty;
	}

	/**
	 * Set eoseDestinationProperty
	 */
	public void setEoseDestinationProperty(String eoseDestinationProperty) {
		this.eoseDestinationProperty = eoseDestinationProperty;
		addValidField("eoseDestinationProperty");
	}

	/**
	 * Get eoseInnerVoyage
	 */
	@Column(name = "EOSE_INNER_VOYAGE")
	public String getEoseInnerVoyage() {
		return eoseInnerVoyage;
	}

	/**
	 * Set eoseInnerVoyage
	 */
	public void setEoseInnerVoyage(String eoseInnerVoyage) {
		this.eoseInnerVoyage = eoseInnerVoyage;
		addValidField("eoseInnerVoyage");
	}

	/**
	 * Get eoseConsolidatorCode
	 */
	@Column(name = "EOSE_CONSOLIDATOR_CODE")
	public String getEoseConsolidatorCode() {
		return eoseConsolidatorCode;
	}

	/**
	 * Set eoseConsolidatorCode
	 */
	public void setEoseConsolidatorCode(String eoseConsolidatorCode) {
		this.eoseConsolidatorCode = eoseConsolidatorCode;
		addValidField("eoseConsolidatorCode");
	}

	/**
	 * Get eoseConsolidatorName
	 */
	@Column(name = "EOSE_CONSOLIDATOR_NAME")
	public String getEoseConsolidatorName() {
		return eoseConsolidatorName;
	}

	/**
	 * Set eoseConsolidatorName
	 */
	public void setEoseConsolidatorName(String eoseConsolidatorName) {
		this.eoseConsolidatorName = eoseConsolidatorName;
		addValidField("eoseConsolidatorName");
	}

	/**
	 * Get eoseBlIssueModeCode
	 */
	@Column(name = "EOSE_BL_ISSUE_MODE_CODE")
	public String getEoseBlIssueModeCode() {
		return eoseBlIssueModeCode;
	}

	/**
	 * Set eoseBlIssueModeCode
	 */
	public void setEoseBlIssueModeCode(String eoseBlIssueModeCode) {
		this.eoseBlIssueModeCode = eoseBlIssueModeCode;
		addValidField("eoseBlIssueModeCode");
	}

	/**
	 * Get eoseBlIssueModeName
	 */
	@Column(name = "EOSE_BL_ISSUE_MODE_NAME")
	public String getEoseBlIssueModeName() {
		return eoseBlIssueModeName;
	}

	/**
	 * Set eoseBlIssueModeName
	 */
	public void setEoseBlIssueModeName(String eoseBlIssueModeName) {
		this.eoseBlIssueModeName = eoseBlIssueModeName;
		addValidField("eoseBlIssueModeName");
	}

	/**
	 * Get eoseIssueParty
	 */
	@Column(name = "EOSE_ISSUE_PARTY")
	public String getEoseIssueParty() {
		return eoseIssueParty;
	}

	/**
	 * Set eoseIssueParty
	 */
	public void setEoseIssueParty(String eoseIssueParty) {
		this.eoseIssueParty = eoseIssueParty;
		addValidField("eoseIssueParty");
	}

	/**
	 * Get eoseIssuePartyCode
	 */
	@Column(name = "EOSE_ISSUE_PARTY_CODE")
	public String getEoseIssuePartyCode() {
		return eoseIssuePartyCode;
	}

	/**
	 * Set eoseIssuePartyCode
	 */
	public void setEoseIssuePartyCode(String eoseIssuePartyCode) {
		this.eoseIssuePartyCode = eoseIssuePartyCode;
		addValidField("eoseIssuePartyCode");
	}

	/**
	 * Get eoseBlIssueDate
	 */
	@Column(name = "EOSE_BL_ISSUE_DATE")
	public Date getEoseBlIssueDate() {
		return eoseBlIssueDate;
	}

	/**
	 * Set eoseBlIssueDate
	 */
	public void setEoseBlIssueDate(Date eoseBlIssueDate) {
		this.eoseBlIssueDate = eoseBlIssueDate;
		addValidField("eoseBlIssueDate");
	}

	/**
	 * Get eosePreLoadPortId
	 */
	@Column(name = "EOSE_PRE_LOAD_PORT_ID")
	public Long getEosePreLoadPortId() {
		return eosePreLoadPortId;
	}

	/**
	 * Set eosePreLoadPortId
	 */
	public void setEosePreLoadPortId(Long eosePreLoadPortId) {
		this.eosePreLoadPortId = eosePreLoadPortId;
		addValidField("eosePreLoadPortId");
	}

	/**
	 * Get eosePreLoadPortCode
	 */
	@Column(name = "EOSE_PRE_LOAD_PORT_CODE")
	public String getEosePreLoadPortCode() {
		return eosePreLoadPortCode;
	}

	/**
	 * Set eosePreLoadPortCode
	 */
	public void setEosePreLoadPortCode(String eosePreLoadPortCode) {
		this.eosePreLoadPortCode = eosePreLoadPortCode;
		addValidField("eosePreLoadPortCode");
	}

	/**
	 * Get eosePreLoadPortName
	 */
	@Column(name = "EOSE_PRE_LOAD_PORT_NAME")
	public String getEosePreLoadPortName() {
		return eosePreLoadPortName;
	}

	/**
	 * Set eosePreLoadPortName
	 */
	public void setEosePreLoadPortName(String eosePreLoadPortName) {
		this.eosePreLoadPortName = eosePreLoadPortName;
		addValidField("eosePreLoadPortName");
	}

	/**
	 * Get eosePreDiscAreaId
	 */
	@Column(name = "EOSE_PRE_DISC_AREA_ID")
	public Long getEosePreDiscAreaId() {
		return eosePreDiscAreaId;
	}

	/**
	 * Set eosePreDiscAreaId
	 */
	public void setEosePreDiscAreaId(Long eosePreDiscAreaId) {
		this.eosePreDiscAreaId = eosePreDiscAreaId;
		addValidField("eosePreDiscAreaId");
	}

	/**
	 * Get eosePreDiscAreaCode
	 */
	@Column(name = "EOSE_PRE_DISC_AREA_CODE")
	public String getEosePreDiscAreaCode() {
		return eosePreDiscAreaCode;
	}

	/**
	 * Set eosePreDiscAreaCode
	 */
	public void setEosePreDiscAreaCode(String eosePreDiscAreaCode) {
		this.eosePreDiscAreaCode = eosePreDiscAreaCode;
		addValidField("eosePreDiscAreaCode");
	}

	/**
	 * Get eosePreDiscAreaName
	 */
	@Column(name = "EOSE_PRE_DISC_AREA_NAME")
	public String getEosePreDiscAreaName() {
		return eosePreDiscAreaName;
	}

	/**
	 * Set eosePreDiscAreaName
	 */
	public void setEosePreDiscAreaName(String eosePreDiscAreaName) {
		this.eosePreDiscAreaName = eosePreDiscAreaName;
		addValidField("eosePreDiscAreaName");
	}

	/**
	 * Get eosePreVesselCode
	 */
	@Column(name = "EOSE_PRE_VESSEL_CODE")
	public String getEosePreVesselCode() {
		return eosePreVesselCode;
	}

	/**
	 * Set eosePreVesselCode
	 */
	public void setEosePreVesselCode(String eosePreVesselCode) {
		this.eosePreVesselCode = eosePreVesselCode;
		addValidField("eosePreVesselCode");
	}

	/**
	 * Get eosePreCustomsDocNumber
	 */
	@Column(name = "EOSE_PRE_CUSTOMS_DOC_NUMBER")
	public String getEosePreCustomsDocNumber() {
		return eosePreCustomsDocNumber;
	}

	/**
	 * Set eosePreCustomsDocNumber
	 */
	public void setEosePreCustomsDocNumber(String eosePreCustomsDocNumber) {
		this.eosePreCustomsDocNumber = eosePreCustomsDocNumber;
		addValidField("eosePreCustomsDocNumber");
	}

	/**
	 * Get eosePreCusDocTypeCode
	 */
	@Column(name = "EOSE_PRE_CUS_DOC_TYPE_CODE")
	public String getEosePreCusDocTypeCode() {
		return eosePreCusDocTypeCode;
	}

	/**
	 * Set eosePreCusDocTypeCode
	 */
	public void setEosePreCusDocTypeCode(String eosePreCusDocTypeCode) {
		this.eosePreCusDocTypeCode = eosePreCusDocTypeCode;
		addValidField("eosePreCusDocTypeCode");
	}

	/**
	 * Get eoseCustomClearanceType
	 */
	@Column(name = "EOSE_CUSTOM_CLEARANCE_TYPE")
	public String getEoseCustomClearanceType() {
		return eoseCustomClearanceType;
	}

	/**
	 * Set eoseCustomClearanceType
	 */
	public void setEoseCustomClearanceType(String eoseCustomClearanceType) {
		this.eoseCustomClearanceType = eoseCustomClearanceType;
		addValidField("eoseCustomClearanceType");
	}

	/**
	 * Get eoseIsCombineBl
	 */
	@Column(name = "EOSE_IS_COMBINE_BL")
	public String getEoseIsCombineBl() {
		return eoseIsCombineBl;
	}

	/**
	 * Set eoseIsCombineBl
	 */
	public void setEoseIsCombineBl(String eoseIsCombineBl) {
		this.eoseIsCombineBl = eoseIsCombineBl;
		addValidField("eoseIsCombineBl");
	}

	/**
	 * Get eoseDifferentSignPlaceFlag
	 */
	@Column(name = "EOSE_DIFFERENT_SIGN_PLACE_FLAG")
	public String getEoseDifferentSignPlaceFlag() {
		return eoseDifferentSignPlaceFlag;
	}

	/**
	 * Set eoseDifferentSignPlaceFlag
	 */
	public void setEoseDifferentSignPlaceFlag(String eoseDifferentSignPlaceFlag) {
		this.eoseDifferentSignPlaceFlag = eoseDifferentSignPlaceFlag;
		addValidField("eoseDifferentSignPlaceFlag");
	}

	/**
	 * Get eoseBlType
	 */
	@Column(name = "EOSE_BL_TYPE")
	public String getEoseBlType() {
		return eoseBlType;
	}

	/**
	 * Set eoseBlType
	 */
	public void setEoseBlType(String eoseBlType) {
		this.eoseBlType = eoseBlType;
		addValidField("eoseBlType");
	}

	/**
	 * Get eoseExpiryDate
	 */
	@Column(name = "EOSE_EXPIRY_DATE")
	public Date getEoseExpiryDate() {
		return eoseExpiryDate;
	}

	/**
	 * Set eoseExpiryDate
	 */
	public void setEoseExpiryDate(Date eoseExpiryDate) {
		this.eoseExpiryDate = eoseExpiryDate;
		addValidField("eoseExpiryDate");
	}

	/**
	 * Get eoseInFactShipperId
	 */
	@Column(name = "EOSE_IN_FACT_SHIPPER_ID")
	public Long getEoseInFactShipperId() {
		return eoseInFactShipperId;
	}

	/**
	 * Set eoseInFactShipperId
	 */
	public void setEoseInFactShipperId(Long eoseInFactShipperId) {
		this.eoseInFactShipperId = eoseInFactShipperId;
		addValidField("eoseInFactShipperId");
	}

	/**
	 * Get eoseInFactShipper
	 */
	@Column(name = "EOSE_IN_FACT_SHIPPER")
	public String getEoseInFactShipper() {
		return eoseInFactShipper;
	}

	/**
	 * Set eoseInFactShipper
	 */
	public void setEoseInFactShipper(String eoseInFactShipper) {
		this.eoseInFactShipper = eoseInFactShipper;
		addValidField("eoseInFactShipper");
	}

	/**
	 * Get eoseInFactShipperCity
	 */
	@Column(name = "EOSE_IN_FACT_SHIPPER_CITY")
	public String getEoseInFactShipperCity() {
		return eoseInFactShipperCity;
	}

	/**
	 * Set eoseInFactShipperCity
	 */
	public void setEoseInFactShipperCity(String eoseInFactShipperCity) {
		this.eoseInFactShipperCity = eoseInFactShipperCity;
		addValidField("eoseInFactShipperCity");
	}

	/**
	 * Get eoseInFactShipperAddId
	 */
	@Column(name = "EOSE_IN_FACT_SHIPPER_ADD_ID")
	public Long getEoseInFactShipperAddId() {
		return eoseInFactShipperAddId;
	}

	/**
	 * Set eoseInFactShipperAddId
	 */
	public void setEoseInFactShipperAddId(Long eoseInFactShipperAddId) {
		this.eoseInFactShipperAddId = eoseInFactShipperAddId;
		addValidField("eoseInFactShipperAddId");
	}

	/**
	 * Get eoseInFactShipperAddress
	 */
	@Column(name = "EOSE_IN_FACT_SHIPPER_ADDRESS")
	public String getEoseInFactShipperAddress() {
		return eoseInFactShipperAddress;
	}

	/**
	 * Set eoseInFactShipperAddress
	 */
	public void setEoseInFactShipperAddress(String eoseInFactShipperAddress) {
		this.eoseInFactShipperAddress = eoseInFactShipperAddress;
		addValidField("eoseInFactShipperAddress");
	}

	/**
	 * Get eoseInFactShipperFax
	 */
	@Column(name = "EOSE_IN_FACT_SHIPPER_FAX")
	public String getEoseInFactShipperFax() {
		return eoseInFactShipperFax;
	}

	/**
	 * Set eoseInFactShipperFax
	 */
	public void setEoseInFactShipperFax(String eoseInFactShipperFax) {
		this.eoseInFactShipperFax = eoseInFactShipperFax;
		addValidField("eoseInFactShipperFax");
	}

	/**
	 * Get eoseInFactShipperTel
	 */
	@Column(name = "EOSE_IN_FACT_SHIPPER_TEL")
	public String getEoseInFactShipperTel() {
		return eoseInFactShipperTel;
	}

	/**
	 * Set eoseInFactShipperTel
	 */
	public void setEoseInFactShipperTel(String eoseInFactShipperTel) {
		this.eoseInFactShipperTel = eoseInFactShipperTel;
		addValidField("eoseInFactShipperTel");
	}

	/**
	 * Get eoseInFactShipperName
	 */
	@Column(name = "EOSE_IN_FACT_SHIPPER_NAME")
	public String getEoseInFactShipperName() {
		return eoseInFactShipperName;
	}

	/**
	 * Set eoseInFactShipperName
	 */
	public void setEoseInFactShipperName(String eoseInFactShipperName) {
		this.eoseInFactShipperName = eoseInFactShipperName;
		addValidField("eoseInFactShipperName");
	}

	/**
	 * Get eoseInFactConsigneeName
	 */
	@Column(name = "EOSE_IN_FACT_CONSIGNEE_NAME")
	public String getEoseInFactConsigneeName() {
		return eoseInFactConsigneeName;
	}

	/**
	 * Set eoseInFactConsigneeName
	 */
	public void setEoseInFactConsigneeName(String eoseInFactConsigneeName) {
		this.eoseInFactConsigneeName = eoseInFactConsigneeName;
		addValidField("eoseInFactConsigneeName");
	}

	/**
	 * Get eoseInFactShipperPost
	 */
	@Column(name = "EOSE_IN_FACT_SHIPPER_POST")
	public String getEoseInFactShipperPost() {
		return eoseInFactShipperPost;
	}

	/**
	 * Set eoseInFactShipperPost
	 */
	public void setEoseInFactShipperPost(String eoseInFactShipperPost) {
		this.eoseInFactShipperPost = eoseInFactShipperPost;
		addValidField("eoseInFactShipperPost");
	}

	/**
	 * Get eoseInFactConsigneeId
	 */
	@Column(name = "EOSE_IN_FACT_CONSIGNEE_ID")
	public Long getEoseInFactConsigneeId() {
		return eoseInFactConsigneeId;
	}

	/**
	 * Set eoseInFactConsigneeId
	 */
	public void setEoseInFactConsigneeId(Long eoseInFactConsigneeId) {
		this.eoseInFactConsigneeId = eoseInFactConsigneeId;
		addValidField("eoseInFactConsigneeId");
	}

	/**
	 * Get eoseInFactConsignee
	 */
	@Column(name = "EOSE_IN_FACT_CONSIGNEE")
	public String getEoseInFactConsignee() {
		return eoseInFactConsignee;
	}

	/**
	 * Set eoseInFactConsignee
	 */
	public void setEoseInFactConsignee(String eoseInFactConsignee) {
		this.eoseInFactConsignee = eoseInFactConsignee;
		addValidField("eoseInFactConsignee");
	}

	/**
	 * Get eoseInFactConsigneeCity
	 */
	@Column(name = "EOSE_IN_FACT_CONSIGNEE_CITY")
	public String getEoseInFactConsigneeCity() {
		return eoseInFactConsigneeCity;
	}

	/**
	 * Set eoseInFactConsigneeCity
	 */
	public void setEoseInFactConsigneeCity(String eoseInFactConsigneeCity) {
		this.eoseInFactConsigneeCity = eoseInFactConsigneeCity;
		addValidField("eoseInFactConsigneeCity");
	}

	/**
	 * Get eoseInFactConsigneeAddId
	 */
	@Column(name = "EOSE_IN_FACT_CONSIGNEE_ADD_ID")
	public Long getEoseInFactConsigneeAddId() {
		return eoseInFactConsigneeAddId;
	}

	/**
	 * Set eoseInFactConsigneeAddId
	 */
	public void setEoseInFactConsigneeAddId(Long eoseInFactConsigneeAddId) {
		this.eoseInFactConsigneeAddId = eoseInFactConsigneeAddId;
		addValidField("eoseInFactConsigneeAddId");
	}

	/**
	 * Get eoseInFactConsigneeAddress
	 */
	@Column(name = "EOSE_IN_FACT_CONSIGNEE_ADDRESS")
	public String getEoseInFactConsigneeAddress() {
		return eoseInFactConsigneeAddress;
	}

	/**
	 * Set eoseInFactConsigneeAddress
	 */
	public void setEoseInFactConsigneeAddress(String eoseInFactConsigneeAddress) {
		this.eoseInFactConsigneeAddress = eoseInFactConsigneeAddress;
		addValidField("eoseInFactConsigneeAddress");
	}

	/**
	 * Get eoseInFactConsigneeFax
	 */
	@Column(name = "EOSE_IN_FACT_CONSIGNEE_FAX")
	public String getEoseInFactConsigneeFax() {
		return eoseInFactConsigneeFax;
	}

	/**
	 * Set eoseInFactConsigneeFax
	 */
	public void setEoseInFactConsigneeFax(String eoseInFactConsigneeFax) {
		this.eoseInFactConsigneeFax = eoseInFactConsigneeFax;
		addValidField("eoseInFactConsigneeFax");
	}

	/**
	 * Get eoseInFactConsigneeTel
	 */
	@Column(name = "EOSE_IN_FACT_CONSIGNEE_TEL")
	public String getEoseInFactConsigneeTel() {
		return eoseInFactConsigneeTel;
	}

	/**
	 * Set eoseInFactConsigneeTel
	 */
	public void setEoseInFactConsigneeTel(String eoseInFactConsigneeTel) {
		this.eoseInFactConsigneeTel = eoseInFactConsigneeTel;
		addValidField("eoseInFactConsigneeTel");
	}

	/**
	 * Get eoseInFactConsigneePost
	 */
	@Column(name = "EOSE_IN_FACT_CONSIGNEE_POST")
	public String getEoseInFactConsigneePost() {
		return eoseInFactConsigneePost;
	}

	/**
	 * Set eoseInFactConsigneePost
	 */
	public void setEoseInFactConsigneePost(String eoseInFactConsigneePost) {
		this.eoseInFactConsigneePost = eoseInFactConsigneePost;
		addValidField("eoseInFactConsigneePost");
	}

	/**
	 * Get eoseInFactNotifier
	 */
	@Column(name = "EOSE_IN_FACT_NOTIFIER")
	public String getEoseInFactNotifier() {
		return eoseInFactNotifier;
	}

	/**
	 * Set eoseInFactNotifier
	 */
	public void setEoseInFactNotifier(String eoseInFactNotifier) {
		this.eoseInFactNotifier = eoseInFactNotifier;
		addValidField("eoseInFactNotifier");
	}

	/**
	 * Get eoseInFactNotifierCity
	 */
	@Column(name = "EOSE_IN_FACT_NOTIFIER_CITY")
	public String getEoseInFactNotifierCity() {
		return eoseInFactNotifierCity;
	}

	/**
	 * Set eoseInFactNotifierCity
	 */
	public void setEoseInFactNotifierCity(String eoseInFactNotifierCity) {
		this.eoseInFactNotifierCity = eoseInFactNotifierCity;
		addValidField("eoseInFactNotifierCity");
	}

	/**
	 * Get eoseInFactNotifierAddress
	 */
	@Column(name = "EOSE_IN_FACT_NOTIFIER_ADDRESS")
	public String getEoseInFactNotifierAddress() {
		return eoseInFactNotifierAddress;
	}

	/**
	 * Set eoseInFactNotifierAddress
	 */
	public void setEoseInFactNotifierAddress(String eoseInFactNotifierAddress) {
		this.eoseInFactNotifierAddress = eoseInFactNotifierAddress;
		addValidField("eoseInFactNotifierAddress");
	}

	/**
	 * Get eoseInFactNotifierFax
	 */
	@Column(name = "EOSE_IN_FACT_NOTIFIER_FAX")
	public String getEoseInFactNotifierFax() {
		return eoseInFactNotifierFax;
	}

	/**
	 * Set eoseInFactNotifierFax
	 */
	public void setEoseInFactNotifierFax(String eoseInFactNotifierFax) {
		this.eoseInFactNotifierFax = eoseInFactNotifierFax;
		addValidField("eoseInFactNotifierFax");
	}

	/**
	 * Get eoseInFactNotifierTel
	 */
	@Column(name = "EOSE_IN_FACT_NOTIFIER_TEL")
	public String getEoseInFactNotifierTel() {
		return eoseInFactNotifierTel;
	}

	/**
	 * Set eoseInFactNotifierTel
	 */
	public void setEoseInFactNotifierTel(String eoseInFactNotifierTel) {
		this.eoseInFactNotifierTel = eoseInFactNotifierTel;
		addValidField("eoseInFactNotifierTel");
	}

	/**
	 * Get eoseInFactNotifierName
	 */
	@Column(name = "EOSE_IN_FACT_NOTIFIER_NAME")
	public String getEoseInFactNotifierName() {
		return eoseInFactNotifierName;
	}

	/**
	 * Set eoseInFactNotifierName
	 */
	public void setEoseInFactNotifierName(String eoseInFactNotifierName) {
		this.eoseInFactNotifierName = eoseInFactNotifierName;
		addValidField("eoseInFactNotifierName");
	}

	/**
	 * Get eoseInFactNotifierPost
	 */
	@Column(name = "EOSE_IN_FACT_NOTIFIER_POST")
	public String getEoseInFactNotifierPost() {
		return eoseInFactNotifierPost;
	}

	/**
	 * Set eoseInFactNotifierPost
	 */
	public void setEoseInFactNotifierPost(String eoseInFactNotifierPost) {
		this.eoseInFactNotifierPost = eoseInFactNotifierPost;
		addValidField("eoseInFactNotifierPost");
	}

	/**
	 * Get eoseFactBookingPartyName
	 */
	@Column(name = "EOSE_FACT_BOOKING_PARTY_NAME")
	public String getEoseFactBookingPartyName() {
		return eoseFactBookingPartyName;
	}

	/**
	 * Set eoseFactBookingPartyName
	 */
	public void setEoseFactBookingPartyName(String eoseFactBookingPartyName) {
		this.eoseFactBookingPartyName = eoseFactBookingPartyName;
		addValidField("eoseFactBookingPartyName");
	}

	/**
	 * Get eoseFactBookingPartyCode
	 */
	@Column(name = "EOSE_FACT_BOOKING_PARTY_CODE")
	public String getEoseFactBookingPartyCode() {
		return eoseFactBookingPartyCode;
	}

	/**
	 * Set eoseFactBookingPartyCode
	 */
	public void setEoseFactBookingPartyCode(String eoseFactBookingPartyCode) {
		this.eoseFactBookingPartyCode = eoseFactBookingPartyCode;
		addValidField("eoseFactBookingPartyCode");
	}

	/**
	 * Get eoseActShippingVesselName
	 */
	@Column(name = "EOSE_ACT_SHIPPING_VESSEL_NAME")
	public String getEoseActShippingVesselName() {
		return eoseActShippingVesselName;
	}

	/**
	 * Set eoseActShippingVesselName
	 */
	public void setEoseActShippingVesselName(String eoseActShippingVesselName) {
		this.eoseActShippingVesselName = eoseActShippingVesselName;
		addValidField("eoseActShippingVesselName");
	}

	/**
	 * Get eoseActShippingVesselCode
	 */
	@Column(name = "EOSE_ACT_SHIPPING_VESSEL_CODE")
	public String getEoseActShippingVesselCode() {
		return eoseActShippingVesselCode;
	}

	/**
	 * Set eoseActShippingVesselCode
	 */
	public void setEoseActShippingVesselCode(String eoseActShippingVesselCode) {
		this.eoseActShippingVesselCode = eoseActShippingVesselCode;
		addValidField("eoseActShippingVesselCode");
	}

	/**
	 * Get eoseActShippingVoyage
	 */
	@Column(name = "EOSE_ACT_SHIPPING_VOYAGE")
	public String getEoseActShippingVoyage() {
		return eoseActShippingVoyage;
	}

	/**
	 * Set eoseActShippingVoyage
	 */
	public void setEoseActShippingVoyage(String eoseActShippingVoyage) {
		this.eoseActShippingVoyage = eoseActShippingVoyage;
		addValidField("eoseActShippingVoyage");
	}

	/**
	 * Get eoseActDepartureTime
	 */
	@Column(name = "EOSE_ACT_DEPARTURE_TIME")
	public Date getEoseActDepartureTime() {
		return eoseActDepartureTime;
	}

	/**
	 * Set eoseActDepartureTime
	 */
	public void setEoseActDepartureTime(Date eoseActDepartureTime) {
		this.eoseActDepartureTime = eoseActDepartureTime;
		addValidField("eoseActDepartureTime");
	}

	/**
	 * Get eoseInFactDepartureTime
	 */
	@Column(name = "EOSE_IN_FACT_DEPARTURE_TIME")
	public Date getEoseInFactDepartureTime() {
		return eoseInFactDepartureTime;
	}

	/**
	 * Set eoseInFactDepartureTime
	 */
	public void setEoseInFactDepartureTime(Date eoseInFactDepartureTime) {
		this.eoseInFactDepartureTime = eoseInFactDepartureTime;
		addValidField("eoseInFactDepartureTime");
	}

	/**
	 * Get eoseIsBooking
	 */
	@Column(name = "EOSE_IS_BOOKING")
	public String getEoseIsBooking() {
		return eoseIsBooking;
	}

	/**
	 * Set eoseIsBooking
	 */
	public void setEoseIsBooking(String eoseIsBooking) {
		this.eoseIsBooking = eoseIsBooking;
		addValidField("eoseIsBooking");
	}

	/**
	 * Get eoseAms
	 */
	@Column(name = "EOSE_AMS")
	public String getEoseAms() {
		return eoseAms;
	}

	/**
	 * Set eoseAms
	 */
	public void setEoseAms(String eoseAms) {
		this.eoseAms = eoseAms;
		addValidField("eoseAms");
	}

	/**
	 * Get eoseSendCustomFlag
	 */
	@Column(name = "EOSE_SEND_CUSTOM_FLAG")
	public Integer getEoseSendCustomFlag() {
		return eoseSendCustomFlag;
	}

	/**
	 * Set eoseSendCustomFlag
	 */
	public void setEoseSendCustomFlag(Integer eoseSendCustomFlag) {
		this.eoseSendCustomFlag = eoseSendCustomFlag;
		addValidField("eoseSendCustomFlag");
	}

	/**
	 * Get eoseCustomsFlag
	 */
	@Column(name = "EOSE_CUSTOMS_FLAG")
	public String getEoseCustomsFlag() {
		return eoseCustomsFlag;
	}

	/**
	 * Set eoseCustomsFlag
	 */
	public void setEoseCustomsFlag(String eoseCustomsFlag) {
		this.eoseCustomsFlag = eoseCustomsFlag;
		addValidField("eoseCustomsFlag");
	}

	/**
	 * Get eoseReceiptPlaceCode
	 */
	@Column(name = "EOSE_RECEIPT_PLACE_CODE")
	public String getEoseReceiptPlaceCode() {
		return eoseReceiptPlaceCode;
	}

	/**
	 * Set eoseReceiptPlaceCode
	 */
	public void setEoseReceiptPlaceCode(String eoseReceiptPlaceCode) {
		this.eoseReceiptPlaceCode = eoseReceiptPlaceCode;
		addValidField("eoseReceiptPlaceCode");
	}

	/**
	 * Get eoseReceiptPlaceName
	 */
	@Column(name = "EOSE_RECEIPT_PLACE_NAME")
	public String getEoseReceiptPlaceName() {
		return eoseReceiptPlaceName;
	}

	/**
	 * Set eoseReceiptPlaceName
	 */
	public void setEoseReceiptPlaceName(String eoseReceiptPlaceName) {
		this.eoseReceiptPlaceName = eoseReceiptPlaceName;
		addValidField("eoseReceiptPlaceName");
	}

	/**
	 * Get eoseEmailCn
	 */
	@Column(name = "EOSE_EMAIL_CN")
	public String getEoseEmailCn() {
		return eoseEmailCn;
	}

	/**
	 * Set eoseEmailCn
	 */
	public void setEoseEmailCn(String eoseEmailCn) {
		this.eoseEmailCn = eoseEmailCn;
		addValidField("eoseEmailCn");
	}

	/**
	 * Get eoseFaxCn
	 */
	@Column(name = "EOSE_FAX_CN")
	public String getEoseFaxCn() {
		return eoseFaxCn;
	}

	/**
	 * Set eoseFaxCn
	 */
	public void setEoseFaxCn(String eoseFaxCn) {
		this.eoseFaxCn = eoseFaxCn;
		addValidField("eoseFaxCn");
	}

	/**
	 * Get eoseTelCn
	 */
	@Column(name = "EOSE_TEL_CN")
	public String getEoseTelCn() {
		return eoseTelCn;
	}

	/**
	 * Set eoseTelCn
	 */
	public void setEoseTelCn(String eoseTelCn) {
		this.eoseTelCn = eoseTelCn;
		addValidField("eoseTelCn");
	}

	/**
	 * Get eoseCityNameConsignee
	 */
	@Column(name = "EOSE_CITY_NAME_CONSIGNEE")
	public String getEoseCityNameConsignee() {
		return eoseCityNameConsignee;
	}

	/**
	 * Set eoseCityNameConsignee
	 */
	public void setEoseCityNameConsignee(String eoseCityNameConsignee) {
		this.eoseCityNameConsignee = eoseCityNameConsignee;
		addValidField("eoseCityNameConsignee");
	}

	/**
	 * Get eoseCountryCodeCn
	 */
	@Column(name = "EOSE_COUNTRY_CODE_CN")
	public String getEoseCountryCodeCn() {
		return eoseCountryCodeCn;
	}

	/**
	 * Set eoseCountryCodeCn
	 */
	public void setEoseCountryCodeCn(String eoseCountryCodeCn) {
		this.eoseCountryCodeCn = eoseCountryCodeCn;
		addValidField("eoseCountryCodeCn");
	}

	/**
	 * Get eoseCountryNameCn
	 */
	@Column(name = "EOSE_COUNTRY_NAME_CN")
	public String getEoseCountryNameCn() {
		return eoseCountryNameCn;
	}

	/**
	 * Set eoseCountryNameCn
	 */
	public void setEoseCountryNameCn(String eoseCountryNameCn) {
		this.eoseCountryNameCn = eoseCountryNameCn;
		addValidField("eoseCountryNameCn");
	}

	/**
	 * Get eoseSpecificEmailCn
	 */
	@Column(name = "EOSE_SPECIFIC_EMAIL_CN")
	public String getEoseSpecificEmailCn() {
		return eoseSpecificEmailCn;
	}

	/**
	 * Set eoseSpecificEmailCn
	 */
	public void setEoseSpecificEmailCn(String eoseSpecificEmailCn) {
		this.eoseSpecificEmailCn = eoseSpecificEmailCn;
		addValidField("eoseSpecificEmailCn");
	}

	/**
	 * Get eoseSpecificFaxCn
	 */
	@Column(name = "EOSE_SPECIFIC_FAX_CN")
	public String getEoseSpecificFaxCn() {
		return eoseSpecificFaxCn;
	}

	/**
	 * Set eoseSpecificFaxCn
	 */
	public void setEoseSpecificFaxCn(String eoseSpecificFaxCn) {
		this.eoseSpecificFaxCn = eoseSpecificFaxCn;
		addValidField("eoseSpecificFaxCn");
	}

	/**
	 * Get eoseSpecificTelCn
	 */
	@Column(name = "EOSE_SPECIFIC_TEL_CN")
	public String getEoseSpecificTelCn() {
		return eoseSpecificTelCn;
	}

	/**
	 * Set eoseSpecificTelCn
	 */
	public void setEoseSpecificTelCn(String eoseSpecificTelCn) {
		this.eoseSpecificTelCn = eoseSpecificTelCn;
		addValidField("eoseSpecificTelCn");
	}

	/**
	 * Get eoseCountrySubEntityCn
	 */
	@Column(name = "EOSE_COUNTRY_SUB_ENTITY_CN")
	public String getEoseCountrySubEntityCn() {
		return eoseCountrySubEntityCn;
	}

	/**
	 * Set eoseCountrySubEntityCn
	 */
	public void setEoseCountrySubEntityCn(String eoseCountrySubEntityCn) {
		this.eoseCountrySubEntityCn = eoseCountrySubEntityCn;
		addValidField("eoseCountrySubEntityCn");
	}

	/**
	 * Get eoseCountrySubEntityNmCn
	 */
	@Column(name = "EOSE_COUNTRY_SUB_ENTITY_NM_CN")
	public String getEoseCountrySubEntityNmCn() {
		return eoseCountrySubEntityNmCn;
	}

	/**
	 * Set eoseCountrySubEntityNmCn
	 */
	public void setEoseCountrySubEntityNmCn(String eoseCountrySubEntityNmCn) {
		this.eoseCountrySubEntityNmCn = eoseCountrySubEntityNmCn;
		addValidField("eoseCountrySubEntityNmCn");
	}

	/**
	 * Get eosePostcodeConsignee
	 */
	@Column(name = "EOSE_POSTCODE_CONSIGNEE")
	public String getEosePostcodeConsignee() {
		return eosePostcodeConsignee;
	}

	/**
	 * Set eosePostcodeConsignee
	 */
	public void setEosePostcodeConsignee(String eosePostcodeConsignee) {
		this.eosePostcodeConsignee = eosePostcodeConsignee;
		addValidField("eosePostcodeConsignee");
	}

	/**
	 * Get eoseBlMemo
	 */
	@Column(name = "EOSE_BL_MEMO")
	public String getEoseBlMemo() {
		return eoseBlMemo;
	}

	/**
	 * Set eoseBlMemo
	 */
	public void setEoseBlMemo(String eoseBlMemo) {
		this.eoseBlMemo = eoseBlMemo;
		addValidField("eoseBlMemo");
	}

	/**
	 * Get eoseBlSocDesc
	 */
	@Column(name = "EOSE_BL_SOC_DESC")
	public String getEoseBlSocDesc() {
		return eoseBlSocDesc;
	}

	/**
	 * Set eoseBlSocDesc
	 */
	public void setEoseBlSocDesc(String eoseBlSocDesc) {
		this.eoseBlSocDesc = eoseBlSocDesc;
		addValidField("eoseBlSocDesc");
	}

	/**
	 * Get eoseCopyNumber
	 */
	@Column(name = "EOSE_COPY_NUMBER")
	public Integer getEoseCopyNumber() {
		return eoseCopyNumber;
	}

	/**
	 * Set eoseCopyNumber
	 */
	public void setEoseCopyNumber(Integer eoseCopyNumber) {
		this.eoseCopyNumber = eoseCopyNumber;
		addValidField("eoseCopyNumber");
	}

	/**
	 * Get eoseBlViseType
	 */
	@Column(name = "EOSE_BL_VISE_TYPE")
	public String getEoseBlViseType() {
		return eoseBlViseType;
	}

	/**
	 * Set eoseBlViseType
	 */
	public void setEoseBlViseType(String eoseBlViseType) {
		this.eoseBlViseType = eoseBlViseType;
		addValidField("eoseBlViseType");
	}

	/**
	 * Get eoseBlIssuePlace
	 */
	@Column(name = "EOSE_BL_ISSUE_PLACE")
	public String getEoseBlIssuePlace() {
		return eoseBlIssuePlace;
	}

	/**
	 * Set eoseBlIssuePlace
	 */
	public void setEoseBlIssuePlace(String eoseBlIssuePlace) {
		this.eoseBlIssuePlace = eoseBlIssuePlace;
		addValidField("eoseBlIssuePlace");
	}

	/**
	 * Get eoseBlIssuePlaceCode
	 */
	@Column(name = "EOSE_BL_ISSUE_PLACE_CODE")
	public String getEoseBlIssuePlaceCode() {
		return eoseBlIssuePlaceCode;
	}

	/**
	 * Set eoseBlIssuePlaceCode
	 */
	public void setEoseBlIssuePlaceCode(String eoseBlIssuePlaceCode) {
		this.eoseBlIssuePlaceCode = eoseBlIssuePlaceCode;
		addValidField("eoseBlIssuePlaceCode");
	}

	/**
	 * Get eoseBlBody
	 */
	@Column(name = "EOSE_BL_BODY")
	public String getEoseBlBody() {
		return eoseBlBody;
	}

	/**
	 * Set eoseBlBody
	 */
	public void setEoseBlBody(String eoseBlBody) {
		this.eoseBlBody = eoseBlBody;
		addValidField("eoseBlBody");
	}

	/**
	 * Get eoseBlHead
	 */
	@Column(name = "EOSE_BL_HEAD")
	public String getEoseBlHead() {
		return eoseBlHead;
	}

	/**
	 * Set eoseBlHead
	 */
	public void setEoseBlHead(String eoseBlHead) {
		this.eoseBlHead = eoseBlHead;
		addValidField("eoseBlHead");
	}

	/**
	 * Get eoseBlCopyNum
	 */
	@Column(name = "EOSE_BL_COPY_NUM")
	public Integer getEoseBlCopyNum() {
		return eoseBlCopyNum;
	}

	/**
	 * Set eoseBlCopyNum
	 */
	public void setEoseBlCopyNum(Integer eoseBlCopyNum) {
		this.eoseBlCopyNum = eoseBlCopyNum;
		addValidField("eoseBlCopyNum");
	}

	/**
	 * Get eoseBlNo
	 */
	@Column(name = "EOSE_BL_NO")
	public String getEoseBlNo() {
		return eoseBlNo;
	}

	/**
	 * Set eoseBlNo
	 */
	public void setEoseBlNo(String eoseBlNo) {
		this.eoseBlNo = eoseBlNo;
		addValidField("eoseBlNo");
	}

	/**
	 * Get eoseEmailN1
	 */
	@Column(name = "EOSE_EMAIL_N1")
	public String getEoseEmailN1() {
		return eoseEmailN1;
	}

	/**
	 * Set eoseEmailN1
	 */
	public void setEoseEmailN1(String eoseEmailN1) {
		this.eoseEmailN1 = eoseEmailN1;
		addValidField("eoseEmailN1");
	}

	/**
	 * Get eoseEmailN2
	 */
	@Column(name = "EOSE_EMAIL_N2")
	public String getEoseEmailN2() {
		return eoseEmailN2;
	}

	/**
	 * Set eoseEmailN2
	 */
	public void setEoseEmailN2(String eoseEmailN2) {
		this.eoseEmailN2 = eoseEmailN2;
		addValidField("eoseEmailN2");
	}

	/**
	 * Get eoseEmailN3
	 */
	@Column(name = "EOSE_EMAIL_N3")
	public String getEoseEmailN3() {
		return eoseEmailN3;
	}

	/**
	 * Set eoseEmailN3
	 */
	public void setEoseEmailN3(String eoseEmailN3) {
		this.eoseEmailN3 = eoseEmailN3;
		addValidField("eoseEmailN3");
	}

	/**
	 * Get eoseFaxN1
	 */
	@Column(name = "EOSE_FAX_N1")
	public String getEoseFaxN1() {
		return eoseFaxN1;
	}

	/**
	 * Set eoseFaxN1
	 */
	public void setEoseFaxN1(String eoseFaxN1) {
		this.eoseFaxN1 = eoseFaxN1;
		addValidField("eoseFaxN1");
	}

	/**
	 * Get eoseFaxN2
	 */
	@Column(name = "EOSE_FAX_N2")
	public String getEoseFaxN2() {
		return eoseFaxN2;
	}

	/**
	 * Set eoseFaxN2
	 */
	public void setEoseFaxN2(String eoseFaxN2) {
		this.eoseFaxN2 = eoseFaxN2;
		addValidField("eoseFaxN2");
	}

	/**
	 * Get eoseFaxN3
	 */
	@Column(name = "EOSE_FAX_N3")
	public String getEoseFaxN3() {
		return eoseFaxN3;
	}

	/**
	 * Set eoseFaxN3
	 */
	public void setEoseFaxN3(String eoseFaxN3) {
		this.eoseFaxN3 = eoseFaxN3;
		addValidField("eoseFaxN3");
	}

	/**
	 * Get eoseTelN1
	 */
	@Column(name = "EOSE_TEL_N1")
	public String getEoseTelN1() {
		return eoseTelN1;
	}

	/**
	 * Set eoseTelN1
	 */
	public void setEoseTelN1(String eoseTelN1) {
		this.eoseTelN1 = eoseTelN1;
		addValidField("eoseTelN1");
	}

	/**
	 * Get eoseTelN2
	 */
	@Column(name = "EOSE_TEL_N2")
	public String getEoseTelN2() {
		return eoseTelN2;
	}

	/**
	 * Set eoseTelN2
	 */
	public void setEoseTelN2(String eoseTelN2) {
		this.eoseTelN2 = eoseTelN2;
		addValidField("eoseTelN2");
	}

	/**
	 * Get eoseTelN3
	 */
	@Column(name = "EOSE_TEL_N3")
	public String getEoseTelN3() {
		return eoseTelN3;
	}

	/**
	 * Set eoseTelN3
	 */
	public void setEoseTelN3(String eoseTelN3) {
		this.eoseTelN3 = eoseTelN3;
		addValidField("eoseTelN3");
	}

	/**
	 * Get eoseCityNameN1
	 */
	@Column(name = "EOSE_CITY_NAME_N1")
	public String getEoseCityNameN1() {
		return eoseCityNameN1;
	}

	/**
	 * Set eoseCityNameN1
	 */
	public void setEoseCityNameN1(String eoseCityNameN1) {
		this.eoseCityNameN1 = eoseCityNameN1;
		addValidField("eoseCityNameN1");
	}

	/**
	 * Get eoseCityNameN2
	 */
	@Column(name = "EOSE_CITY_NAME_N2")
	public String getEoseCityNameN2() {
		return eoseCityNameN2;
	}

	/**
	 * Set eoseCityNameN2
	 */
	public void setEoseCityNameN2(String eoseCityNameN2) {
		this.eoseCityNameN2 = eoseCityNameN2;
		addValidField("eoseCityNameN2");
	}

	/**
	 * Get eoseCityNameN3
	 */
	@Column(name = "EOSE_CITY_NAME_N3")
	public String getEoseCityNameN3() {
		return eoseCityNameN3;
	}

	/**
	 * Set eoseCityNameN3
	 */
	public void setEoseCityNameN3(String eoseCityNameN3) {
		this.eoseCityNameN3 = eoseCityNameN3;
		addValidField("eoseCityNameN3");
	}

	/**
	 * Get eoseStreetNumberPoboxN1
	 */
	@Column(name = "EOSE_STREET_NUMBER_POBOX_N1")
	public String getEoseStreetNumberPoboxN1() {
		return eoseStreetNumberPoboxN1;
	}

	/**
	 * Set eoseStreetNumberPoboxN1
	 */
	public void setEoseStreetNumberPoboxN1(String eoseStreetNumberPoboxN1) {
		this.eoseStreetNumberPoboxN1 = eoseStreetNumberPoboxN1;
		addValidField("eoseStreetNumberPoboxN1");
	}

	/**
	 * Get eoseStreetNumberPoboxN2
	 */
	@Column(name = "EOSE_STREET_NUMBER_POBOX_N2")
	public String getEoseStreetNumberPoboxN2() {
		return eoseStreetNumberPoboxN2;
	}

	/**
	 * Set eoseStreetNumberPoboxN2
	 */
	public void setEoseStreetNumberPoboxN2(String eoseStreetNumberPoboxN2) {
		this.eoseStreetNumberPoboxN2 = eoseStreetNumberPoboxN2;
		addValidField("eoseStreetNumberPoboxN2");
	}

	/**
	 * Get eoseStreetNumberPoboxN3
	 */
	@Column(name = "EOSE_STREET_NUMBER_POBOX_N3")
	public String getEoseStreetNumberPoboxN3() {
		return eoseStreetNumberPoboxN3;
	}

	/**
	 * Set eoseStreetNumberPoboxN3
	 */
	public void setEoseStreetNumberPoboxN3(String eoseStreetNumberPoboxN3) {
		this.eoseStreetNumberPoboxN3 = eoseStreetNumberPoboxN3;
		addValidField("eoseStreetNumberPoboxN3");
	}

	/**
	 * Get eoseCountryCodeN1
	 */
	@Column(name = "EOSE_COUNTRY_CODE_N1")
	public String getEoseCountryCodeN1() {
		return eoseCountryCodeN1;
	}

	/**
	 * Set eoseCountryCodeN1
	 */
	public void setEoseCountryCodeN1(String eoseCountryCodeN1) {
		this.eoseCountryCodeN1 = eoseCountryCodeN1;
		addValidField("eoseCountryCodeN1");
	}

	/**
	 * Get eoseCountryCodeN2
	 */
	@Column(name = "EOSE_COUNTRY_CODE_N2")
	public String getEoseCountryCodeN2() {
		return eoseCountryCodeN2;
	}

	/**
	 * Set eoseCountryCodeN2
	 */
	public void setEoseCountryCodeN2(String eoseCountryCodeN2) {
		this.eoseCountryCodeN2 = eoseCountryCodeN2;
		addValidField("eoseCountryCodeN2");
	}

	/**
	 * Get eoseCountryCodeN3
	 */
	@Column(name = "EOSE_COUNTRY_CODE_N3")
	public String getEoseCountryCodeN3() {
		return eoseCountryCodeN3;
	}

	/**
	 * Set eoseCountryCodeN3
	 */
	public void setEoseCountryCodeN3(String eoseCountryCodeN3) {
		this.eoseCountryCodeN3 = eoseCountryCodeN3;
		addValidField("eoseCountryCodeN3");
	}

	/**
	 * Get eoseCountryNameN1
	 */
	@Column(name = "EOSE_COUNTRY_NAME_N1")
	public String getEoseCountryNameN1() {
		return eoseCountryNameN1;
	}

	/**
	 * Set eoseCountryNameN1
	 */
	public void setEoseCountryNameN1(String eoseCountryNameN1) {
		this.eoseCountryNameN1 = eoseCountryNameN1;
		addValidField("eoseCountryNameN1");
	}

	/**
	 * Get eoseCountryNameN2
	 */
	@Column(name = "EOSE_COUNTRY_NAME_N2")
	public String getEoseCountryNameN2() {
		return eoseCountryNameN2;
	}

	/**
	 * Set eoseCountryNameN2
	 */
	public void setEoseCountryNameN2(String eoseCountryNameN2) {
		this.eoseCountryNameN2 = eoseCountryNameN2;
		addValidField("eoseCountryNameN2");
	}

	/**
	 * Get eoseCountryNameN3
	 */
	@Column(name = "EOSE_COUNTRY_NAME_N3")
	public String getEoseCountryNameN3() {
		return eoseCountryNameN3;
	}

	/**
	 * Set eoseCountryNameN3
	 */
	public void setEoseCountryNameN3(String eoseCountryNameN3) {
		this.eoseCountryNameN3 = eoseCountryNameN3;
		addValidField("eoseCountryNameN3");
	}

	/**
	 * Get eoseCountrySubEntityN1
	 */
	@Column(name = "EOSE_COUNTRY_SUB_ENTITY_N1")
	public String getEoseCountrySubEntityN1() {
		return eoseCountrySubEntityN1;
	}

	/**
	 * Set eoseCountrySubEntityN1
	 */
	public void setEoseCountrySubEntityN1(String eoseCountrySubEntityN1) {
		this.eoseCountrySubEntityN1 = eoseCountrySubEntityN1;
		addValidField("eoseCountrySubEntityN1");
	}

	/**
	 * Get eoseCountrySubEntityN2
	 */
	@Column(name = "EOSE_COUNTRY_SUB_ENTITY_N2")
	public String getEoseCountrySubEntityN2() {
		return eoseCountrySubEntityN2;
	}

	/**
	 * Set eoseCountrySubEntityN2
	 */
	public void setEoseCountrySubEntityN2(String eoseCountrySubEntityN2) {
		this.eoseCountrySubEntityN2 = eoseCountrySubEntityN2;
		addValidField("eoseCountrySubEntityN2");
	}

	/**
	 * Get eoseCountrySubEntityN3
	 */
	@Column(name = "EOSE_COUNTRY_SUB_ENTITY_N3")
	public String getEoseCountrySubEntityN3() {
		return eoseCountrySubEntityN3;
	}

	/**
	 * Set eoseCountrySubEntityN3
	 */
	public void setEoseCountrySubEntityN3(String eoseCountrySubEntityN3) {
		this.eoseCountrySubEntityN3 = eoseCountrySubEntityN3;
		addValidField("eoseCountrySubEntityN3");
	}

	/**
	 * Get eoseCountrySubEntityNmN1
	 */
	@Column(name = "EOSE_COUNTRY_SUB_ENTITY_NM_N1")
	public String getEoseCountrySubEntityNmN1() {
		return eoseCountrySubEntityNmN1;
	}

	/**
	 * Set eoseCountrySubEntityNmN1
	 */
	public void setEoseCountrySubEntityNmN1(String eoseCountrySubEntityNmN1) {
		this.eoseCountrySubEntityNmN1 = eoseCountrySubEntityNmN1;
		addValidField("eoseCountrySubEntityNmN1");
	}

	/**
	 * Get eoseCountrySubEntityNmN2
	 */
	@Column(name = "EOSE_COUNTRY_SUB_ENTITY_NM_N2")
	public String getEoseCountrySubEntityNmN2() {
		return eoseCountrySubEntityNmN2;
	}

	/**
	 * Set eoseCountrySubEntityNmN2
	 */
	public void setEoseCountrySubEntityNmN2(String eoseCountrySubEntityNmN2) {
		this.eoseCountrySubEntityNmN2 = eoseCountrySubEntityNmN2;
		addValidField("eoseCountrySubEntityNmN2");
	}

	/**
	 * Get eoseCountrySubEntityNmN3
	 */
	@Column(name = "EOSE_COUNTRY_SUB_ENTITY_NM_N3")
	public String getEoseCountrySubEntityNmN3() {
		return eoseCountrySubEntityNmN3;
	}

	/**
	 * Set eoseCountrySubEntityNmN3
	 */
	public void setEoseCountrySubEntityNmN3(String eoseCountrySubEntityNmN3) {
		this.eoseCountrySubEntityNmN3 = eoseCountrySubEntityNmN3;
		addValidField("eoseCountrySubEntityNmN3");
	}

	/**
	 * Get eosePostcodeN1
	 */
	@Column(name = "EOSE_POSTCODE_N1")
	public String getEosePostcodeN1() {
		return eosePostcodeN1;
	}

	/**
	 * Set eosePostcodeN1
	 */
	public void setEosePostcodeN1(String eosePostcodeN1) {
		this.eosePostcodeN1 = eosePostcodeN1;
		addValidField("eosePostcodeN1");
	}

	/**
	 * Get eosePostcodeN2
	 */
	@Column(name = "EOSE_POSTCODE_N2")
	public String getEosePostcodeN2() {
		return eosePostcodeN2;
	}

	/**
	 * Set eosePostcodeN2
	 */
	public void setEosePostcodeN2(String eosePostcodeN2) {
		this.eosePostcodeN2 = eosePostcodeN2;
		addValidField("eosePostcodeN2");
	}

	/**
	 * Get eosePostcodeN3
	 */
	@Column(name = "EOSE_POSTCODE_N3")
	public String getEosePostcodeN3() {
		return eosePostcodeN3;
	}

	/**
	 * Set eosePostcodeN3
	 */
	public void setEosePostcodeN3(String eosePostcodeN3) {
		this.eosePostcodeN3 = eosePostcodeN3;
		addValidField("eosePostcodeN3");
	}

	/**
	 * Get eoseDrawbackFlag
	 */
	@Column(name = "EOSE_DRAWBACK_FLAG")
	public String getEoseDrawbackFlag() {
		return eoseDrawbackFlag;
	}

	/**
	 * Set eoseDrawbackFlag
	 */
	public void setEoseDrawbackFlag(String eoseDrawbackFlag) {
		this.eoseDrawbackFlag = eoseDrawbackFlag;
		addValidField("eoseDrawbackFlag");
	}

	/**
	 * Get eoseConsignmentValue
	 */
	@Column(name = "EOSE_CONSIGNMENT_VALUE")
	public Double getEoseConsignmentValue() {
		return eoseConsignmentValue;
	}

	/**
	 * Set eoseConsignmentValue
	 */
	public void setEoseConsignmentValue(Double eoseConsignmentValue) {
		this.eoseConsignmentValue = eoseConsignmentValue;
		addValidField("eoseConsignmentValue");
	}

	/**
	 * Get eoseBlCarryName
	 */
	@Column(name = "EOSE_BL_CARRY_NAME")
	public String getEoseBlCarryName() {
		return eoseBlCarryName;
	}

	/**
	 * Set eoseBlCarryName
	 */
	public void setEoseBlCarryName(String eoseBlCarryName) {
		this.eoseBlCarryName = eoseBlCarryName;
		addValidField("eoseBlCarryName");
	}

	/**
	 * Get eoseBlCarryId
	 */
	@Column(name = "EOSE_BL_CARRY_ID")
	public String getEoseBlCarryId() {
		return eoseBlCarryId;
	}

	/**
	 * Set eoseBlCarryId
	 */
	public void setEoseBlCarryId(String eoseBlCarryId) {
		this.eoseBlCarryId = eoseBlCarryId;
		addValidField("eoseBlCarryId");
	}

	/**
	 * Get eoseBokContactor
	 */
	@Column(name = "EOSE_BOK_CONTACTOR")
	public String getEoseBokContactor() {
		return eoseBokContactor;
	}

	/**
	 * Set eoseBokContactor
	 */
	public void setEoseBokContactor(String eoseBokContactor) {
		this.eoseBokContactor = eoseBokContactor;
		addValidField("eoseBokContactor");
	}

	/**
	 * Get eoseBokTel
	 */
	@Column(name = "EOSE_BOK_TEL")
	public String getEoseBokTel() {
		return eoseBokTel;
	}

	/**
	 * Set eoseBokTel
	 */
	public void setEoseBokTel(String eoseBokTel) {
		this.eoseBokTel = eoseBokTel;
		addValidField("eoseBokTel");
	}

	/**
	 * Get eoseBokEmail
	 */
	@Column(name = "EOSE_BOK_EMAIL")
	public String getEoseBokEmail() {
		return eoseBokEmail;
	}

	/**
	 * Set eoseBokEmail
	 */
	public void setEoseBokEmail(String eoseBokEmail) {
		this.eoseBokEmail = eoseBokEmail;
		addValidField("eoseBokEmail");
	}

	/**
	 * Get eoseEmailDanger
	 */
	@Column(name = "EOSE_EMAIL_DANGER")
	public String getEoseEmailDanger() {
		return eoseEmailDanger;
	}

	/**
	 * Set eoseEmailDanger
	 */
	public void setEoseEmailDanger(String eoseEmailDanger) {
		this.eoseEmailDanger = eoseEmailDanger;
		addValidField("eoseEmailDanger");
	}

	/**
	 * Get eoseFaxDanger
	 */
	@Column(name = "EOSE_FAX_DANGER")
	public String getEoseFaxDanger() {
		return eoseFaxDanger;
	}

	/**
	 * Set eoseFaxDanger
	 */
	public void setEoseFaxDanger(String eoseFaxDanger) {
		this.eoseFaxDanger = eoseFaxDanger;
		addValidField("eoseFaxDanger");
	}

	/**
	 * Get eoseTelDanger
	 */
	@Column(name = "EOSE_TEL_DANGER")
	public String getEoseTelDanger() {
		return eoseTelDanger;
	}

	/**
	 * Set eoseTelDanger
	 */
	public void setEoseTelDanger(String eoseTelDanger) {
		this.eoseTelDanger = eoseTelDanger;
		addValidField("eoseTelDanger");
	}

	/**
	 * Get eoseDangerGoodsContact
	 */
	@Column(name = "EOSE_DANGER_GOODS_CONTACT")
	public String getEoseDangerGoodsContact() {
		return eoseDangerGoodsContact;
	}

	/**
	 * Set eoseDangerGoodsContact
	 */
	public void setEoseDangerGoodsContact(String eoseDangerGoodsContact) {
		this.eoseDangerGoodsContact = eoseDangerGoodsContact;
		addValidField("eoseDangerGoodsContact");
	}

	/**
	 * Get eoseBlRemark
	 */
	@Column(name = "EOSE_BL_REMARK")
	public String getEoseBlRemark() {
		return eoseBlRemark;
	}

	/**
	 * Set eoseBlRemark
	 */
	public void setEoseBlRemark(String eoseBlRemark) {
		this.eoseBlRemark = eoseBlRemark;
		addValidField("eoseBlRemark");
	}

	/**
	 * Get eoseConsignDeptId
	 */
	@Column(name = "EOSE_CONSIGN_DEPT_ID")
	public Long getEoseConsignDeptId() {
		return eoseConsignDeptId;
	}

	/**
	 * Set eoseConsignDeptId
	 */
	public void setEoseConsignDeptId(Long eoseConsignDeptId) {
		this.eoseConsignDeptId = eoseConsignDeptId;
		addValidField("eoseConsignDeptId");
	}

	/**
	 * Get eoseConsignDept
	 */
	@Column(name = "EOSE_CONSIGN_DEPT")
	public String getEoseConsignDept() {
		return eoseConsignDept;
	}

	/**
	 * Set eoseConsignDept
	 */
	public void setEoseConsignDept(String eoseConsignDept) {
		this.eoseConsignDept = eoseConsignDept;
		addValidField("eoseConsignDept");
	}

	/**
	 * Get eoseConsignDeptName
	 */
	@Column(name = "EOSE_CONSIGN_DEPT_NAME")
	public String getEoseConsignDeptName() {
		return eoseConsignDeptName;
	}

	/**
	 * Set eoseConsignDeptName
	 */
	public void setEoseConsignDeptName(String eoseConsignDeptName) {
		this.eoseConsignDeptName = eoseConsignDeptName;
		addValidField("eoseConsignDeptName");
	}

	/**
	 * Get eoseNextCallingId
	 */
	@Column(name = "EOSE_NEXT_CALLING_ID")
	public Long getEoseNextCallingId() {
		return eoseNextCallingId;
	}

	/**
	 * Set eoseNextCallingId
	 */
	public void setEoseNextCallingId(Long eoseNextCallingId) {
		this.eoseNextCallingId = eoseNextCallingId;
		addValidField("eoseNextCallingId");
	}

	/**
	 * Get eoseNextCallingPort
	 */
	@Column(name = "EOSE_NEXT_CALLING_PORT")
	public String getEoseNextCallingPort() {
		return eoseNextCallingPort;
	}

	/**
	 * Set eoseNextCallingPort
	 */
	public void setEoseNextCallingPort(String eoseNextCallingPort) {
		this.eoseNextCallingPort = eoseNextCallingPort;
		addValidField("eoseNextCallingPort");
	}

	/**
	 * Get eoseNextCallingPortCode
	 */
	@Column(name = "EOSE_NEXT_CALLING_PORT_CODE")
	public String getEoseNextCallingPortCode() {
		return eoseNextCallingPortCode;
	}

	/**
	 * Set eoseNextCallingPortCode
	 */
	public void setEoseNextCallingPortCode(String eoseNextCallingPortCode) {
		this.eoseNextCallingPortCode = eoseNextCallingPortCode;
		addValidField("eoseNextCallingPortCode");
	}

	/**
	 * Get eoseCtnCompanyId
	 */
	@Column(name = "EOSE_CTN_COMPANY_ID")
	public Long getEoseCtnCompanyId() {
		return eoseCtnCompanyId;
	}

	/**
	 * Set eoseCtnCompanyId
	 */
	public void setEoseCtnCompanyId(Long eoseCtnCompanyId) {
		this.eoseCtnCompanyId = eoseCtnCompanyId;
		addValidField("eoseCtnCompanyId");
	}

	/**
	 * Get eoseCtnCompanyCode
	 */
	@Column(name = "EOSE_CTN_COMPANY_CODE")
	public String getEoseCtnCompanyCode() {
		return eoseCtnCompanyCode;
	}

	/**
	 * Set eoseCtnCompanyCode
	 */
	public void setEoseCtnCompanyCode(String eoseCtnCompanyCode) {
		this.eoseCtnCompanyCode = eoseCtnCompanyCode;
		addValidField("eoseCtnCompanyCode");
	}

	/**
	 * Get eoseCtnCompany
	 */
	@Column(name = "EOSE_CTN_COMPANY")
	public String getEoseCtnCompany() {
		return eoseCtnCompany;
	}

	/**
	 * Set eoseCtnCompany
	 */
	public void setEoseCtnCompany(String eoseCtnCompany) {
		this.eoseCtnCompany = eoseCtnCompany;
		addValidField("eoseCtnCompany");
	}

	/**
	 * Get eoseContainerInCy
	 */
	@Column(name = "EOSE_CONTAINER_IN_CY")
	public String getEoseContainerInCy() {
		return eoseContainerInCy;
	}

	/**
	 * Set eoseContainerInCy
	 */
	public void setEoseContainerInCy(String eoseContainerInCy) {
		this.eoseContainerInCy = eoseContainerInCy;
		addValidField("eoseContainerInCy");
	}

	/**
	 * Get eoseAgreementNoInfo
	 */
	@Column(name = "EOSE_AGREEMENT_NO_INFO")
	public String getEoseAgreementNoInfo() {
		return eoseAgreementNoInfo;
	}

	/**
	 * Set eoseAgreementNoInfo
	 */
	public void setEoseAgreementNoInfo(String eoseAgreementNoInfo) {
		this.eoseAgreementNoInfo = eoseAgreementNoInfo;
		addValidField("eoseAgreementNoInfo");
	}

	/**
	 * Get eosePodCustomCode
	 */
	@Column(name = "EOSE_POD_CUSTOM_CODE")
	public String getEosePodCustomCode() {
		return eosePodCustomCode;
	}

	/**
	 * Set eosePodCustomCode
	 */
	public void setEosePodCustomCode(String eosePodCustomCode) {
		this.eosePodCustomCode = eosePodCustomCode;
		addValidField("eosePodCustomCode");
	}

	/**
	 * Get eoseDischargePortTerminal
	 */
	@Column(name = "EOSE_DISCHARGE_PORT_TERMINAL")
	public String getEoseDischargePortTerminal() {
		return eoseDischargePortTerminal;
	}

	/**
	 * Set eoseDischargePortTerminal
	 */
	public void setEoseDischargePortTerminal(String eoseDischargePortTerminal) {
		this.eoseDischargePortTerminal = eoseDischargePortTerminal;
		addValidField("eoseDischargePortTerminal");
	}

	/**
	 * Get eoseApplicant
	 */
	@Column(name = "EOSE_APPLICANT")
	public String getEoseApplicant() {
		return eoseApplicant;
	}

	/**
	 * Set eoseApplicant
	 */
	public void setEoseApplicant(String eoseApplicant) {
		this.eoseApplicant = eoseApplicant;
		addValidField("eoseApplicant");
	}

	/**
	 * Get eoseApplicantId
	 */
	@Column(name = "EOSE_APPLICANT_ID")
	public String getEoseApplicantId() {
		return eoseApplicantId;
	}

	/**
	 * Set eoseApplicantId
	 */
	public void setEoseApplicantId(String eoseApplicantId) {
		this.eoseApplicantId = eoseApplicantId;
		addValidField("eoseApplicantId");
	}

	/**
	 * Get eoseRequestEtd
	 */
	@Column(name = "EOSE_REQUEST_ETD")
	public Date getEoseRequestEtd() {
		return eoseRequestEtd;
	}

	/**
	 * Set eoseRequestEtd
	 */
	public void setEoseRequestEtd(Date eoseRequestEtd) {
		this.eoseRequestEtd = eoseRequestEtd;
		addValidField("eoseRequestEtd");
	}

	/**
	 * Get eoseFclLclFlag
	 */
	@Column(name = "EOSE_FCL_LCL_FLAG")
	public String getEoseFclLclFlag() {
		return eoseFclLclFlag;
	}

	/**
	 * Set eoseFclLclFlag
	 */
	public void setEoseFclLclFlag(String eoseFclLclFlag) {
		this.eoseFclLclFlag = eoseFclLclFlag;
		addValidField("eoseFclLclFlag");
	}

	/**
	 * Get eosePrecontactNo
	 */
	@Column(name = "EOSE_PRECONTACT_NO")
	public String getEosePrecontactNo() {
		return eosePrecontactNo;
	}

	/**
	 * Set eosePrecontactNo
	 */
	public void setEosePrecontactNo(String eosePrecontactNo) {
		this.eosePrecontactNo = eosePrecontactNo;
		addValidField("eosePrecontactNo");
	}

	/**
	 * Get eose20Quantity
	 */
	@Column(name = "EOSE_20_QUANTITY")
	public Double getEose20Quantity() {
		return eose20Quantity;
	}

	/**
	 * Set eose20Quantity
	 */
	public void setEose20Quantity(Double eose20Quantity) {
		this.eose20Quantity = eose20Quantity;
		addValidField("eose20Quantity");
	}

	/**
	 * Get eose40Quantity
	 */
	@Column(name = "EOSE_40_QUANTITY")
	public Double getEose40Quantity() {
		return eose40Quantity;
	}

	/**
	 * Set eose40Quantity
	 */
	public void setEose40Quantity(Double eose40Quantity) {
		this.eose40Quantity = eose40Quantity;
		addValidField("eose40Quantity");
	}

	/**
	 * Get eoseSurchargeRemark
	 */
	@Column(name = "EOSE_SURCHARGE_REMARK")
	public String getEoseSurchargeRemark() {
		return eoseSurchargeRemark;
	}

	/**
	 * Set eoseSurchargeRemark
	 */
	public void setEoseSurchargeRemark(String eoseSurchargeRemark) {
		this.eoseSurchargeRemark = eoseSurchargeRemark;
		addValidField("eoseSurchargeRemark");
	}

	/**
	 * Get eoseQuotationNo
	 */
	@Column(name = "EOSE_QUOTATION_NO")
	public String getEoseQuotationNo() {
		return eoseQuotationNo;
	}

	/**
	 * Set eoseQuotationNo
	 */
	public void setEoseQuotationNo(String eoseQuotationNo) {
		this.eoseQuotationNo = eoseQuotationNo;
		addValidField("eoseQuotationNo");
	}

	/**
	 * Get eosePayTypeCode
	 */
	@Column(name = "EOSE_PAY_TYPE_CODE")
	public String getEosePayTypeCode() {
		return eosePayTypeCode;
	}

	/**
	 * Set eosePayTypeCode
	 */
	public void setEosePayTypeCode(String eosePayTypeCode) {
		this.eosePayTypeCode = eosePayTypeCode;
		addValidField("eosePayTypeCode");
	}

	/**
	 * Get eosePayTypeName
	 */
	@Column(name = "EOSE_PAY_TYPE_NAME")
	public String getEosePayTypeName() {
		return eosePayTypeName;
	}

	/**
	 * Set eosePayTypeName
	 */
	public void setEosePayTypeName(String eosePayTypeName) {
		this.eosePayTypeName = eosePayTypeName;
		addValidField("eosePayTypeName");
	}

	/**
	 * Get eoseFreightCharge
	 */
	@Column(name = "EOSE_FREIGHT_CHARGE")
	public String getEoseFreightCharge() {
		return eoseFreightCharge;
	}

	/**
	 * Set eoseFreightCharge
	 */
	public void setEoseFreightCharge(String eoseFreightCharge) {
		this.eoseFreightCharge = eoseFreightCharge;
		addValidField("eoseFreightCharge");
	}

	/**
	 * Get eoseShipAgentCode
	 */
	@Column(name = "EOSE_SHIP_AGENT_CODE")
	public String getEoseShipAgentCode() {
		return eoseShipAgentCode;
	}

	/**
	 * Set eoseShipAgentCode
	 */
	public void setEoseShipAgentCode(String eoseShipAgentCode) {
		this.eoseShipAgentCode = eoseShipAgentCode;
		addValidField("eoseShipAgentCode");
	}

	/**
	 * Get eoseExitPortCustomCode
	 */
	@Column(name = "EOSE_EXIT_PORT_CUSTOM_CODE")
	public String getEoseExitPortCustomCode() {
		return eoseExitPortCustomCode;
	}

	/**
	 * Set eoseExitPortCustomCode
	 */
	public void setEoseExitPortCustomCode(String eoseExitPortCustomCode) {
		this.eoseExitPortCustomCode = eoseExitPortCustomCode;
		addValidField("eoseExitPortCustomCode");
	}

	/**
	 * Get eoseExitCustomCode
	 */
	@Column(name = "EOSE_EXIT_CUSTOM_CODE")
	public String getEoseExitCustomCode() {
		return eoseExitCustomCode;
	}

	/**
	 * Set eoseExitCustomCode
	 */
	public void setEoseExitCustomCode(String eoseExitCustomCode) {
		this.eoseExitCustomCode = eoseExitCustomCode;
		addValidField("eoseExitCustomCode");
	}

	/**
	 * Get eoseExitPortCustomName
	 */
	@Column(name = "EOSE_EXIT_PORT_CUSTOM_NAME")
	public String getEoseExitPortCustomName() {
		return eoseExitPortCustomName;
	}

	/**
	 * Set eoseExitPortCustomName
	 */
	public void setEoseExitPortCustomName(String eoseExitPortCustomName) {
		this.eoseExitPortCustomName = eoseExitPortCustomName;
		addValidField("eoseExitPortCustomName");
	}

	/**
	 * Get eoseFreightClauseCode
	 */
	@Column(name = "EOSE_FREIGHT_CLAUSE_CODE")
	public String getEoseFreightClauseCode() {
		return eoseFreightClauseCode;
	}

	/**
	 * Set eoseFreightClauseCode
	 */
	public void setEoseFreightClauseCode(String eoseFreightClauseCode) {
		this.eoseFreightClauseCode = eoseFreightClauseCode;
		addValidField("eoseFreightClauseCode");
	}

	/**
	 * Get eoseFreightClauseName
	 */
	@Column(name = "EOSE_FREIGHT_CLAUSE_NAME")
	public String getEoseFreightClauseName() {
		return eoseFreightClauseName;
	}

	/**
	 * Set eoseFreightClauseName
	 */
	public void setEoseFreightClauseName(String eoseFreightClauseName) {
		this.eoseFreightClauseName = eoseFreightClauseName;
		addValidField("eoseFreightClauseName");
	}

	/**
	 * Get eoseEmailInterCarrgier
	 */
	@Column(name = "EOSE_EMAIL_INTER_CARRGIER")
	public String getEoseEmailInterCarrgier() {
		return eoseEmailInterCarrgier;
	}

	/**
	 * Set eoseEmailInterCarrgier
	 */
	public void setEoseEmailInterCarrgier(String eoseEmailInterCarrgier) {
		this.eoseEmailInterCarrgier = eoseEmailInterCarrgier;
		addValidField("eoseEmailInterCarrgier");
	}

	/**
	 * Get eoseFaxInterCarrgier
	 */
	@Column(name = "EOSE_FAX_INTER_CARRGIER")
	public String getEoseFaxInterCarrgier() {
		return eoseFaxInterCarrgier;
	}

	/**
	 * Set eoseFaxInterCarrgier
	 */
	public void setEoseFaxInterCarrgier(String eoseFaxInterCarrgier) {
		this.eoseFaxInterCarrgier = eoseFaxInterCarrgier;
		addValidField("eoseFaxInterCarrgier");
	}

	/**
	 * Get eoseTelInterCarrgier
	 */
	@Column(name = "EOSE_TEL_INTER_CARRGIER")
	public String getEoseTelInterCarrgier() {
		return eoseTelInterCarrgier;
	}

	/**
	 * Set eoseTelInterCarrgier
	 */
	public void setEoseTelInterCarrgier(String eoseTelInterCarrgier) {
		this.eoseTelInterCarrgier = eoseTelInterCarrgier;
		addValidField("eoseTelInterCarrgier");
	}

	/**
	 * Get eoseIntermediateCarrgier
	 */
	@Column(name = "EOSE_INTERMEDIATE_CARRGIER")
	public String getEoseIntermediateCarrgier() {
		return eoseIntermediateCarrgier;
	}

	/**
	 * Set eoseIntermediateCarrgier
	 */
	public void setEoseIntermediateCarrgier(String eoseIntermediateCarrgier) {
		this.eoseIntermediateCarrgier = eoseIntermediateCarrgier;
		addValidField("eoseIntermediateCarrgier");
	}

	/**
	 * Get eoseVesselNameCn
	 */
	@Column(name = "EOSE_VESSEL_NAME_CN")
	public String getEoseVesselNameCn() {
		return eoseVesselNameCn;
	}

	/**
	 * Set eoseVesselNameCn
	 */
	public void setEoseVesselNameCn(String eoseVesselNameCn) {
		this.eoseVesselNameCn = eoseVesselNameCn;
		addValidField("eoseVesselNameCn");
	}

	/**
	 * Get eoseTransferFlag
	 */
	@Column(name = "EOSE_TRANSFER_FLAG")
	public Integer getEoseTransferFlag() {
		return eoseTransferFlag;
	}

	/**
	 * Set eoseTransferFlag
	 */
	public void setEoseTransferFlag(Integer eoseTransferFlag) {
		this.eoseTransferFlag = eoseTransferFlag;
		addValidField("eoseTransferFlag");
	}

	/**
	 * Get eoseTransferFlagName
	 */
	@Column(name = "EOSE_TRANSFER_FLAG_NAME")
	public String getEoseTransferFlagName() {
		return eoseTransferFlagName;
	}

	/**
	 * Set eoseTransferFlagName
	 */
	public void setEoseTransferFlagName(String eoseTransferFlagName) {
		this.eoseTransferFlagName = eoseTransferFlagName;
		addValidField("eoseTransferFlagName");
	}

	/**
	 * Get eoseTransDestiPlaceCode
	 */
	@Column(name = "EOSE_TRANS_DESTI_PLACE_CODE")
	public String getEoseTransDestiPlaceCode() {
		return eoseTransDestiPlaceCode;
	}

	/**
	 * Set eoseTransDestiPlaceCode
	 */
	public void setEoseTransDestiPlaceCode(String eoseTransDestiPlaceCode) {
		this.eoseTransDestiPlaceCode = eoseTransDestiPlaceCode;
		addValidField("eoseTransDestiPlaceCode");
	}

	/**
	 * Get eoseTransDestiPlaceName
	 */
	@Column(name = "EOSE_TRANS_DESTI_PLACE_NAME")
	public String getEoseTransDestiPlaceName() {
		return eoseTransDestiPlaceName;
	}

	/**
	 * Set eoseTransDestiPlaceName
	 */
	public void setEoseTransDestiPlaceName(String eoseTransDestiPlaceName) {
		this.eoseTransDestiPlaceName = eoseTransDestiPlaceName;
		addValidField("eoseTransDestiPlaceName");
	}

	/**
	 * Get eoseLclBlno
	 */
	@Column(name = "EOSE_LCL_BLNO")
	public String getEoseLclBlno() {
		return eoseLclBlno;
	}

	/**
	 * Set eoseLclBlno
	 */
	public void setEoseLclBlno(String eoseLclBlno) {
		this.eoseLclBlno = eoseLclBlno;
		addValidField("eoseLclBlno");
	}

	/**
	 * Get eoseMainBlNo
	 */
	@Column(name = "EOSE_MAIN_BL_NO")
	public String getEoseMainBlNo() {
		return eoseMainBlNo;
	}

	/**
	 * Set eoseMainBlNo
	 */
	public void setEoseMainBlNo(String eoseMainBlNo) {
		this.eoseMainBlNo = eoseMainBlNo;
		addValidField("eoseMainBlNo");
	}

	/**
	 * Get eoseMainBookingNo
	 */
	@Column(name = "EOSE_MAIN_BOOKING_NO")
	public String getEoseMainBookingNo() {
		return eoseMainBookingNo;
	}

	/**
	 * Set eoseMainBookingNo
	 */
	public void setEoseMainBookingNo(String eoseMainBookingNo) {
		this.eoseMainBookingNo = eoseMainBookingNo;
		addValidField("eoseMainBookingNo");
	}

	/**
	 * Get eoseTranshipmentFlag
	 */
	@Column(name = "EOSE_TRANSHIPMENT_FLAG")
	public String getEoseTranshipmentFlag() {
		return eoseTranshipmentFlag;
	}

	/**
	 * Set eoseTranshipmentFlag
	 */
	public void setEoseTranshipmentFlag(String eoseTranshipmentFlag) {
		this.eoseTranshipmentFlag = eoseTranshipmentFlag;
		addValidField("eoseTranshipmentFlag");
	}

	/**
	 * Get eosePolCustomCode
	 */
	@Column(name = "EOSE_POL_CUSTOM_CODE")
	public String getEosePolCustomCode() {
		return eosePolCustomCode;
	}

	/**
	 * Set eosePolCustomCode
	 */
	public void setEosePolCustomCode(String eosePolCustomCode) {
		this.eosePolCustomCode = eosePolCustomCode;
		addValidField("eosePolCustomCode");
	}

	/**
	 * Get eoseLoadPortTerminalCode
	 */
	@Column(name = "EOSE_LOAD_PORT_TERMINAL_CODE")
	public String getEoseLoadPortTerminalCode() {
		return eoseLoadPortTerminalCode;
	}

	/**
	 * Set eoseLoadPortTerminalCode
	 */
	public void setEoseLoadPortTerminalCode(String eoseLoadPortTerminalCode) {
		this.eoseLoadPortTerminalCode = eoseLoadPortTerminalCode;
		addValidField("eoseLoadPortTerminalCode");
	}

	/**
	 * Get eoseLoadPortTerminal
	 */
	@Column(name = "EOSE_LOAD_PORT_TERMINAL")
	public String getEoseLoadPortTerminal() {
		return eoseLoadPortTerminal;
	}

	/**
	 * Set eoseLoadPortTerminal
	 */
	public void setEoseLoadPortTerminal(String eoseLoadPortTerminal) {
		this.eoseLoadPortTerminal = eoseLoadPortTerminal;
		addValidField("eoseLoadPortTerminal");
	}

	/**
	 * Get eoseSendTel
	 */
	@Column(name = "EOSE_SEND_TEL")
	public String getEoseSendTel() {
		return eoseSendTel;
	}

	/**
	 * Set eoseSendTel
	 */
	public void setEoseSendTel(String eoseSendTel) {
		this.eoseSendTel = eoseSendTel;
		addValidField("eoseSendTel");
	}

	/**
	 * Get eoseSendContractor
	 */
	@Column(name = "EOSE_SEND_CONTRACTOR")
	public String getEoseSendContractor() {
		return eoseSendContractor;
	}

	/**
	 * Set eoseSendContractor
	 */
	public void setEoseSendContractor(String eoseSendContractor) {
		this.eoseSendContractor = eoseSendContractor;
		addValidField("eoseSendContractor");
	}

	/**
	 * Get eoseLoadCtnPort
	 */
	@Column(name = "EOSE_LOAD_CTN_PORT")
	public String getEoseLoadCtnPort() {
		return eoseLoadCtnPort;
	}

	/**
	 * Set eoseLoadCtnPort
	 */
	public void setEoseLoadCtnPort(String eoseLoadCtnPort) {
		this.eoseLoadCtnPort = eoseLoadCtnPort;
		addValidField("eoseLoadCtnPort");
	}

	/**
	 * Get eoseStuffingMode
	 */
	@Column(name = "EOSE_STUFFING_MODE")
	public String getEoseStuffingMode() {
		return eoseStuffingMode;
	}

	/**
	 * Set eoseStuffingMode
	 */
	public void setEoseStuffingMode(String eoseStuffingMode) {
		this.eoseStuffingMode = eoseStuffingMode;
		addValidField("eoseStuffingMode");
	}

	/**
	 * Get eoseLmName
	 */
	@Column(name = "EOSE_LM_NAME")
	public String getEoseLmName() {
		return eoseLmName;
	}

	/**
	 * Set eoseLmName
	 */
	public void setEoseLmName(String eoseLmName) {
		this.eoseLmName = eoseLmName;
		addValidField("eoseLmName");
	}

	/**
	 * Get eoseVesselDwt
	 */
	@Column(name = "EOSE_VESSEL_DWT")
	public Double getEoseVesselDwt() {
		return eoseVesselDwt;
	}

	/**
	 * Set eoseVesselDwt
	 */
	public void setEoseVesselDwt(Double eoseVesselDwt) {
		this.eoseVesselDwt = eoseVesselDwt;
		addValidField("eoseVesselDwt");
	}

	/**
	 * Get eoseBerthCode
	 */
	@Column(name = "EOSE_BERTH_CODE")
	public String getEoseBerthCode() {
		return eoseBerthCode;
	}

	/**
	 * Set eoseBerthCode
	 */
	public void setEoseBerthCode(String eoseBerthCode) {
		this.eoseBerthCode = eoseBerthCode;
		addValidField("eoseBerthCode");
	}

	/**
	 * Get eoseBerthName
	 */
	@Column(name = "EOSE_BERTH_NAME")
	public String getEoseBerthName() {
		return eoseBerthName;
	}

	/**
	 * Set eoseBerthName
	 */
	public void setEoseBerthName(String eoseBerthName) {
		this.eoseBerthName = eoseBerthName;
		addValidField("eoseBerthName");
	}

	/**
	 * Get eoseBizLinksName
	 */
	@Column(name = "EOSE_BIZ_LINKS_NAME")
	public String getEoseBizLinksName() {
		return eoseBizLinksName;
	}

	/**
	 * Set eoseBizLinksName
	 */
	public void setEoseBizLinksName(String eoseBizLinksName) {
		this.eoseBizLinksName = eoseBizLinksName;
		addValidField("eoseBizLinksName");
	}

	/**
	 * Get eoseBizLinksTime
	 */
	@Column(name = "EOSE_BIZ_LINKS_TIME")
	public Date getEoseBizLinksTime() {
		return eoseBizLinksTime;
	}

	/**
	 * Set eoseBizLinksTime
	 */
	public void setEoseBizLinksTime(Date eoseBizLinksTime) {
		this.eoseBizLinksTime = eoseBizLinksTime;
		addValidField("eoseBizLinksTime");
	}

	/**
	 * Get eoseBizLinksValue
	 */
	@Column(name = "EOSE_BIZ_LINKS_VALUE")
	public String getEoseBizLinksValue() {
		return eoseBizLinksValue;
	}

	/**
	 * Set eoseBizLinksValue
	 */
	public void setEoseBizLinksValue(String eoseBizLinksValue) {
		this.eoseBizLinksValue = eoseBizLinksValue;
		addValidField("eoseBizLinksValue");
	}

	/**
	 * Get eosePreMfSendEnable
	 */
	@Column(name = "EOSE_PRE_MF_SEND_ENABLE")
	public String getEosePreMfSendEnable() {
		return eosePreMfSendEnable;
	}

	/**
	 * Set eosePreMfSendEnable
	 */
	public void setEosePreMfSendEnable(String eosePreMfSendEnable) {
		this.eosePreMfSendEnable = eosePreMfSendEnable;
		addValidField("eosePreMfSendEnable");
	}

	/**
	 * Get eoseBizImportType
	 */
	@Column(name = "EOSE_BIZ_IMPORT_TYPE")
	public String getEoseBizImportType() {
		return eoseBizImportType;
	}

	/**
	 * Set eoseBizImportType
	 */
	public void setEoseBizImportType(String eoseBizImportType) {
		this.eoseBizImportType = eoseBizImportType;
		addValidField("eoseBizImportType");
	}

	/**
	 * Get eoseHandlingInstrucCode
	 */
	@Column(name = "EOSE_HANDLING_INSTRUC_CODE")
	public String getEoseHandlingInstrucCode() {
		return eoseHandlingInstrucCode;
	}

	/**
	 * Set eoseHandlingInstrucCode
	 */
	public void setEoseHandlingInstrucCode(String eoseHandlingInstrucCode) {
		this.eoseHandlingInstrucCode = eoseHandlingInstrucCode;
		addValidField("eoseHandlingInstrucCode");
	}

	/**
	 * Get eoseHandlingInstrucName
	 */
	@Column(name = "EOSE_HANDLING_INSTRUC_NAME")
	public String getEoseHandlingInstrucName() {
		return eoseHandlingInstrucName;
	}

	/**
	 * Set eoseHandlingInstrucName
	 */
	public void setEoseHandlingInstrucName(String eoseHandlingInstrucName) {
		this.eoseHandlingInstrucName = eoseHandlingInstrucName;
		addValidField("eoseHandlingInstrucName");
	}

	/**
	 * Get eoseDisposeUser
	 */
	@Column(name = "EOSE_DISPOSE_USER")
	public Integer getEoseDisposeUser() {
		return eoseDisposeUser;
	}

	/**
	 * Set eoseDisposeUser
	 */
	public void setEoseDisposeUser(Integer eoseDisposeUser) {
		this.eoseDisposeUser = eoseDisposeUser;
		addValidField("eoseDisposeUser");
	}

	/**
	 * Get eoseErrReason
	 */
	@Column(name = "EOSE_ERR_REASON")
	public String getEoseErrReason() {
		return eoseErrReason;
	}

	/**
	 * Set eoseErrReason
	 */
	public void setEoseErrReason(String eoseErrReason) {
		this.eoseErrReason = eoseErrReason;
		addValidField("eoseErrReason");
	}

	/**
	 * Get eoseOperationDisposeFlag
	 */
	@Column(name = "EOSE_OPERATION_DISPOSE_FLAG")
	public String getEoseOperationDisposeFlag() {
		return eoseOperationDisposeFlag;
	}

	/**
	 * Set eoseOperationDisposeFlag
	 */
	public void setEoseOperationDisposeFlag(String eoseOperationDisposeFlag) {
		this.eoseOperationDisposeFlag = eoseOperationDisposeFlag;
		addValidField("eoseOperationDisposeFlag");
	}

	/**
	 * Get eoseRecordType
	 */
	@Column(name = "EOSE_RECORD_TYPE")
	public Integer getEoseRecordType() {
		return eoseRecordType;
	}

	/**
	 * Set eoseRecordType
	 */
	public void setEoseRecordType(Integer eoseRecordType) {
		this.eoseRecordType = eoseRecordType;
		addValidField("eoseRecordType");
	}

	/**
	 * Get eoseCsdtId
	 */
	@Column(name = "EOSE_CSDT_ID")
	public Long getEoseCsdtId() {
		return eoseCsdtId;
	}

	/**
	 * Set eoseCsdtId
	 */
	public void setEoseCsdtId(Long eoseCsdtId) {
		this.eoseCsdtId = eoseCsdtId;
		addValidField("eoseCsdtId");
	}

	/**
	 * Get eoseCarSiFeedbackStatus
	 */
	@Column(name = "EOSE_CAR_SI_FEEDBACK_STATUS")
	public String getEoseCarSiFeedbackStatus() {
		return eoseCarSiFeedbackStatus;
	}

	/**
	 * Set eoseCarSiFeedbackStatus
	 */
	public void setEoseCarSiFeedbackStatus(String eoseCarSiFeedbackStatus) {
		this.eoseCarSiFeedbackStatus = eoseCarSiFeedbackStatus;
		addValidField("eoseCarSiFeedbackStatus");
	}

	/**
	 * Get eoseCarBkFeedbackStatus
	 */
	@Column(name = "EOSE_CAR_BK_FEEDBACK_STATUS")
	public String getEoseCarBkFeedbackStatus() {
		return eoseCarBkFeedbackStatus;
	}

	/**
	 * Set eoseCarBkFeedbackStatus
	 */
	public void setEoseCarBkFeedbackStatus(String eoseCarBkFeedbackStatus) {
		this.eoseCarBkFeedbackStatus = eoseCarBkFeedbackStatus;
		addValidField("eoseCarBkFeedbackStatus");
	}

	/**
	 * Get eoseLoadMfSendEnable
	 */
	@Column(name = "EOSE_LOAD_MF_SEND_ENABLE")
	public String getEoseLoadMfSendEnable() {
		return eoseLoadMfSendEnable;
	}

	/**
	 * Set eoseLoadMfSendEnable
	 */
	public void setEoseLoadMfSendEnable(String eoseLoadMfSendEnable) {
		this.eoseLoadMfSendEnable = eoseLoadMfSendEnable;
		addValidField("eoseLoadMfSendEnable");
	}

	/**
	 * Get eoseBookingStatus
	 */
	@Column(name = "EOSE_BOOKING_STATUS")
	public String getEoseBookingStatus() {
		return eoseBookingStatus;
	}

	/**
	 * Set eoseBookingStatus
	 */
	public void setEoseBookingStatus(String eoseBookingStatus) {
		this.eoseBookingStatus = eoseBookingStatus;
		addValidField("eoseBookingStatus");
	}

	/**
	 * Get eoseDocHdFlag
	 */
	@Column(name = "EOSE_DOC_HD_FLAG")
	public String getEoseDocHdFlag() {
		return eoseDocHdFlag;
	}

	/**
	 * Set eoseDocHdFlag
	 */
	public void setEoseDocHdFlag(String eoseDocHdFlag) {
		this.eoseDocHdFlag = eoseDocHdFlag;
		addValidField("eoseDocHdFlag");
	}

	/**
	 * Get eoseAutoreferFlag
	 */
	@Column(name = "EOSE_AUTOREFER_FLAG")
	public String getEoseAutoreferFlag() {
		return eoseAutoreferFlag;
	}

	/**
	 * Set eoseAutoreferFlag
	 */
	public void setEoseAutoreferFlag(String eoseAutoreferFlag) {
		this.eoseAutoreferFlag = eoseAutoreferFlag;
		addValidField("eoseAutoreferFlag");
	}

	/**
	 * Get eoseRemark
	 */
	@Column(name = "EOSE_REMARK")
	public String getEoseRemark() {
		return eoseRemark;
	}

	/**
	 * Set eoseRemark
	 */
	public void setEoseRemark(String eoseRemark) {
		this.eoseRemark = eoseRemark;
		addValidField("eoseRemark");
	}

	/**
	 * Get eoseSubstr1
	 */
	@Column(name = "EOSE_SUBSTR1")
	public String getEoseSubstr1() {
		return eoseSubstr1;
	}

	/**
	 * Set eoseSubstr1
	 */
	public void setEoseSubstr1(String eoseSubstr1) {
		this.eoseSubstr1 = eoseSubstr1;
		addValidField("eoseSubstr1");
	}

	/**
	 * Get eoseSubstr2
	 */
	@Column(name = "EOSE_SUBSTR2")
	public String getEoseSubstr2() {
		return eoseSubstr2;
	}

	/**
	 * Set eoseSubstr2
	 */
	public void setEoseSubstr2(String eoseSubstr2) {
		this.eoseSubstr2 = eoseSubstr2;
		addValidField("eoseSubstr2");
	}

	/**
	 * Get eoseSubstr3
	 */
	@Column(name = "EOSE_SUBSTR3")
	public String getEoseSubstr3() {
		return eoseSubstr3;
	}

	/**
	 * Set eoseSubstr3
	 */
	public void setEoseSubstr3(String eoseSubstr3) {
		this.eoseSubstr3 = eoseSubstr3;
		addValidField("eoseSubstr3");
	}

	/**
	 * Get eoseSubstr4
	 */
	@Column(name = "EOSE_SUBSTR4")
	public String getEoseSubstr4() {
		return eoseSubstr4;
	}

	/**
	 * Set eoseSubstr4
	 */
	public void setEoseSubstr4(String eoseSubstr4) {
		this.eoseSubstr4 = eoseSubstr4;
		addValidField("eoseSubstr4");
	}

	/**
	 * Get eoseSubstr5
	 */
	@Column(name = "EOSE_SUBSTR5")
	public String getEoseSubstr5() {
		return eoseSubstr5;
	}

	/**
	 * Set eoseSubstr5
	 */
	public void setEoseSubstr5(String eoseSubstr5) {
		this.eoseSubstr5 = eoseSubstr5;
		addValidField("eoseSubstr5");
	}

	/**
	 * Get eoseSubstr6
	 */
	@Column(name = "EOSE_SUBSTR6")
	public String getEoseSubstr6() {
		return eoseSubstr6;
	}

	/**
	 * Set eoseSubstr6
	 */
	public void setEoseSubstr6(String eoseSubstr6) {
		this.eoseSubstr6 = eoseSubstr6;
		addValidField("eoseSubstr6");
	}

	/**
	 * Get eoseSubstr7
	 */
	@Column(name = "EOSE_SUBSTR7")
	public String getEoseSubstr7() {
		return eoseSubstr7;
	}

	/**
	 * Set eoseSubstr7
	 */
	public void setEoseSubstr7(String eoseSubstr7) {
		this.eoseSubstr7 = eoseSubstr7;
		addValidField("eoseSubstr7");
	}

	/**
	 * Get eoseSubstr8
	 */
	@Column(name = "EOSE_SUBSTR8")
	public String getEoseSubstr8() {
		return eoseSubstr8;
	}

	/**
	 * Set eoseSubstr8
	 */
	public void setEoseSubstr8(String eoseSubstr8) {
		this.eoseSubstr8 = eoseSubstr8;
		addValidField("eoseSubstr8");
	}

	/**
	 * Get eoseSubstr9
	 */
	@Column(name = "EOSE_SUBSTR9")
	public String getEoseSubstr9() {
		return eoseSubstr9;
	}

	/**
	 * Set eoseSubstr9
	 */
	public void setEoseSubstr9(String eoseSubstr9) {
		this.eoseSubstr9 = eoseSubstr9;
		addValidField("eoseSubstr9");
	}

	/**
	 * Get eoseSubstr10
	 */
	@Column(name = "EOSE_SUBSTR10")
	public String getEoseSubstr10() {
		return eoseSubstr10;
	}

	/**
	 * Set eoseSubstr10
	 */
	public void setEoseSubstr10(String eoseSubstr10) {
		this.eoseSubstr10 = eoseSubstr10;
		addValidField("eoseSubstr10");
	}

	/**
	 * Get eoseSubstr11
	 */
	@Column(name = "EOSE_SUBSTR11")
	public String getEoseSubstr11() {
		return eoseSubstr11;
	}

	/**
	 * Set eoseSubstr11
	 */
	public void setEoseSubstr11(String eoseSubstr11) {
		this.eoseSubstr11 = eoseSubstr11;
		addValidField("eoseSubstr11");
	}

	/**
	 * Get eoseSubstr12
	 */
	@Column(name = "EOSE_SUBSTR12")
	public String getEoseSubstr12() {
		return eoseSubstr12;
	}

	/**
	 * Set eoseSubstr12
	 */
	public void setEoseSubstr12(String eoseSubstr12) {
		this.eoseSubstr12 = eoseSubstr12;
		addValidField("eoseSubstr12");
	}

	/**
	 * Get eoseSubdate1
	 */
	@Column(name = "EOSE_SUBDATE1")
	public Date getEoseSubdate1() {
		return eoseSubdate1;
	}

	/**
	 * Set eoseSubdate1
	 */
	public void setEoseSubdate1(Date eoseSubdate1) {
		this.eoseSubdate1 = eoseSubdate1;
		addValidField("eoseSubdate1");
	}

	/**
	 * Get eoseSubdate2
	 */
	@Column(name = "EOSE_SUBDATE2")
	public Date getEoseSubdate2() {
		return eoseSubdate2;
	}

	/**
	 * Set eoseSubdate2
	 */
	public void setEoseSubdate2(Date eoseSubdate2) {
		this.eoseSubdate2 = eoseSubdate2;
		addValidField("eoseSubdate2");
	}

	/**
	 * Get eoseSubdate3
	 */
	@Column(name = "EOSE_SUBDATE3")
	public Date getEoseSubdate3() {
		return eoseSubdate3;
	}

	/**
	 * Set eoseSubdate3
	 */
	public void setEoseSubdate3(Date eoseSubdate3) {
		this.eoseSubdate3 = eoseSubdate3;
		addValidField("eoseSubdate3");
	}

	/**
	 * Get eoseSubdate4
	 */
	@Column(name = "EOSE_SUBDATE4")
	public Date getEoseSubdate4() {
		return eoseSubdate4;
	}

	/**
	 * Set eoseSubdate4
	 */
	public void setEoseSubdate4(Date eoseSubdate4) {
		this.eoseSubdate4 = eoseSubdate4;
		addValidField("eoseSubdate4");
	}

	/**
	 * Get eoseSubnum1
	 */
	@Column(name = "EOSE_SUBNUM1")
	public Long getEoseSubnum1() {
		return eoseSubnum1;
	}

	/**
	 * Set eoseSubnum1
	 */
	public void setEoseSubnum1(Long eoseSubnum1) {
		this.eoseSubnum1 = eoseSubnum1;
		addValidField("eoseSubnum1");
	}

	/**
	 * Get eoseSubnum2
	 */
	@Column(name = "EOSE_SUBNUM2")
	public Long getEoseSubnum2() {
		return eoseSubnum2;
	}

	/**
	 * Set eoseSubnum2
	 */
	public void setEoseSubnum2(Long eoseSubnum2) {
		this.eoseSubnum2 = eoseSubnum2;
		addValidField("eoseSubnum2");
	}

	/**
	 * Get eoseSubnum3
	 */
	@Column(name = "EOSE_SUBNUM3")
	public Long getEoseSubnum3() {
		return eoseSubnum3;
	}

	/**
	 * Set eoseSubnum3
	 */
	public void setEoseSubnum3(Long eoseSubnum3) {
		this.eoseSubnum3 = eoseSubnum3;
		addValidField("eoseSubnum3");
	}

	/**
	 * Get eoseSubnum4
	 */
	@Column(name = "EOSE_SUBNUM4")
	public Long getEoseSubnum4() {
		return eoseSubnum4;
	}

	/**
	 * Set eoseSubnum4
	 */
	public void setEoseSubnum4(Long eoseSubnum4) {
		this.eoseSubnum4 = eoseSubnum4;
		addValidField("eoseSubnum4");
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
	 * Get eoseOrder
	 */
	@Column(name = "EOSE_ORDER")
	public Long getEoseOrder() {
		return eoseOrder;
	}

	/**
	 * Set eoseOrder
	 */
	public void setEoseOrder(Long eoseOrder) {
		this.eoseOrder = eoseOrder;
		addValidField("eoseOrder");
	}

	/**
	 * Get eoseNetWeight
	 */
	@Column(name = "EOSE_NET_WEIGHT")
	public Double getEoseNetWeight() {
		return eoseNetWeight;
	}

	/**
	 * Set eoseNetWeight
	 */
	public void setEoseNetWeight(Double eoseNetWeight) {
		this.eoseNetWeight = eoseNetWeight;
		addValidField("eoseNetWeight");
	}

	/**
	 * Get eoseReleaseDate
	 */
	@Column(name = "EOSE_RELEASE_DATE")
	public Date getEoseReleaseDate() {
		return eoseReleaseDate;
	}

	/**
	 * Set eoseReleaseDate
	 */
	public void setEoseReleaseDate(Date eoseReleaseDate) {
		this.eoseReleaseDate = eoseReleaseDate;
		addValidField("eoseReleaseDate");
	}

	/**
	 * Get eoseDeclarationDate
	 */
	@Column(name = "EOSE_DECLARATION_DATE")
	public Date getEoseDeclarationDate() {
		return eoseDeclarationDate;
	}

	/**
	 * Set eoseDeclarationDate
	 */
	public void setEoseDeclarationDate(Date eoseDeclarationDate) {
		this.eoseDeclarationDate = eoseDeclarationDate;
		addValidField("eoseDeclarationDate");
	}

	/**
	 * Get eosePaymentMethod
	 */
	@Column(name = "EOSE_PAYMENT_METHOD")
	public String getEosePaymentMethod() {
		return eosePaymentMethod;
	}

	/**
	 * Set eosePaymentMethod
	 */
	public void setEosePaymentMethod(String eosePaymentMethod) {
		this.eosePaymentMethod = eosePaymentMethod;
		addValidField("eosePaymentMethod");
	}

	/**
	 * Get eoseIsNvocc
	 */
	@Column(name = "EOSE_IS_NVOCC")
	public String getEoseIsNvocc() {
		return eoseIsNvocc;
	}

	/**
	 * Set eoseIsNvocc
	 */
	public void setEoseIsNvocc(String eoseIsNvocc) {
		this.eoseIsNvocc = eoseIsNvocc;
		addValidField("eoseIsNvocc");
	}

	/**
	 * Get eoseTradeContractNo
	 */
	@Column(name = "EOSE_TRADE_CONTRACT_NO")
	public String getEoseTradeContractNo() {
		return eoseTradeContractNo;
	}

	/**
	 * Set eoseTradeContractNo
	 */
	public void setEoseTradeContractNo(String eoseTradeContractNo) {
		this.eoseTradeContractNo = eoseTradeContractNo;
		addValidField("eoseTradeContractNo");
	}

	/**
	 * Get eoseWhomCanvass
	 */
	@Column(name = "EOSE_WHOM_CANVASS")
	public Long getEoseWhomCanvass() {
		return eoseWhomCanvass;
	}

	/**
	 * Set eoseWhomCanvass
	 */
	public void setEoseWhomCanvass(Long eoseWhomCanvass) {
		this.eoseWhomCanvass = eoseWhomCanvass;
		addValidField("eoseWhomCanvass");
	}

	/**
	 * Get eoseLoadCountryCode
	 */
	@Column(name = "EOSE_LOAD_COUNTRY_CODE")
	public String getEoseLoadCountryCode() {
		return eoseLoadCountryCode;
	}

	/**
	 * Set eoseLoadCountryCode
	 */
	public void setEoseLoadCountryCode(String eoseLoadCountryCode) {
		this.eoseLoadCountryCode = eoseLoadCountryCode;
		addValidField("eoseLoadCountryCode");
	}

	/**
	 * Get eoseLoadCountryNameCn
	 */
	@Column(name = "EOSE_LOAD_COUNTRY_NAME_CN")
	public String getEoseLoadCountryNameCn() {
		return eoseLoadCountryNameCn;
	}

	/**
	 * Set eoseLoadCountryNameCn
	 */
	public void setEoseLoadCountryNameCn(String eoseLoadCountryNameCn) {
		this.eoseLoadCountryNameCn = eoseLoadCountryNameCn;
		addValidField("eoseLoadCountryNameCn");
	}

	/**
	 * Get eoseEbkSender
	 */
	@Column(name = "EOSE_EBK_SENDER")
	public String getEoseEbkSender() {
		return eoseEbkSender;
	}

	/**
	 * Set eoseEbkSender
	 */
	public void setEoseEbkSender(String eoseEbkSender) {
		this.eoseEbkSender = eoseEbkSender;
		addValidField("eoseEbkSender");
	}

	/**
	 * Get eoseEbkSentTime
	 */
	@Column(name = "EOSE_EBK_SENT_TIME")
	public Date getEoseEbkSentTime() {
		return eoseEbkSentTime;
	}

	/**
	 * Set eoseEbkSentTime
	 */
	public void setEoseEbkSentTime(Date eoseEbkSentTime) {
		this.eoseEbkSentTime = eoseEbkSentTime;
		addValidField("eoseEbkSentTime");
	}

	/**
	 * Get eoseEbkComfirmer
	 */
	@Column(name = "EOSE_EBK_COMFIRMER")
	public String getEoseEbkComfirmer() {
		return eoseEbkComfirmer;
	}

	/**
	 * Set eoseEbkComfirmer
	 */
	public void setEoseEbkComfirmer(String eoseEbkComfirmer) {
		this.eoseEbkComfirmer = eoseEbkComfirmer;
		addValidField("eoseEbkComfirmer");
	}

	/**
	 * Get eoseEbkConfirmTime
	 */
	@Column(name = "EOSE_EBK_CONFIRM_TIME")
	public Date getEoseEbkConfirmTime() {
		return eoseEbkConfirmTime;
	}

	/**
	 * Set eoseEbkConfirmTime
	 */
	public void setEoseEbkConfirmTime(Date eoseEbkConfirmTime) {
		this.eoseEbkConfirmTime = eoseEbkConfirmTime;
		addValidField("eoseEbkConfirmTime");
	}

	/**
	 * Get eoseHblSigner
	 */
	@Column(name = "EOSE_HBL_SIGNER")
	public String getEoseHblSigner() {
		return eoseHblSigner;
	}

	/**
	 * Set eoseHblSigner
	 */
	public void setEoseHblSigner(String eoseHblSigner) {
		this.eoseHblSigner = eoseHblSigner;
		addValidField("eoseHblSigner");
	}

	/**
	 * Get eoseHblSignTime
	 */
	@Column(name = "EOSE_HBL_SIGN_TIME")
	public Date getEoseHblSignTime() {
		return eoseHblSignTime;
	}

	/**
	 * Set eoseHblSignTime
	 */
	public void setEoseHblSignTime(Date eoseHblSignTime) {
		this.eoseHblSignTime = eoseHblSignTime;
		addValidField("eoseHblSignTime");
	}

	/**
	 * Get eoseMblSigner
	 */
	@Column(name = "EOSE_MBL_SIGNER")
	public String getEoseMblSigner() {
		return eoseMblSigner;
	}

	/**
	 * Set eoseMblSigner
	 */
	public void setEoseMblSigner(String eoseMblSigner) {
		this.eoseMblSigner = eoseMblSigner;
		addValidField("eoseMblSigner");
	}

	/**
	 * Get eoseMblSignTime
	 */
	@Column(name = "EOSE_MBL_SIGN_TIME")
	public Date getEoseMblSignTime() {
		return eoseMblSignTime;
	}

	/**
	 * Set eoseMblSignTime
	 */
	public void setEoseMblSignTime(Date eoseMblSignTime) {
		this.eoseMblSignTime = eoseMblSignTime;
		addValidField("eoseMblSignTime");
	}

	/**
	 * Get eoseBlIssuer
	 */
	@Column(name = "EOSE_BL_ISSUER")
	public String getEoseBlIssuer() {
		return eoseBlIssuer;
	}

	/**
	 * Set eoseBlIssuer
	 */
	public void setEoseBlIssuer(String eoseBlIssuer) {
		this.eoseBlIssuer = eoseBlIssuer;
		addValidField("eoseBlIssuer");
	}

	/**
	 * Get eoseBlIssueTime
	 */
	@Column(name = "EOSE_BL_ISSUE_TIME")
	public Date getEoseBlIssueTime() {
		return eoseBlIssueTime;
	}

	/**
	 * Set eoseBlIssueTime
	 */
	public void setEoseBlIssueTime(Date eoseBlIssueTime) {
		this.eoseBlIssueTime = eoseBlIssueTime;
		addValidField("eoseBlIssueTime");
	}

	/**
	 * Get eoseBlDeliveryMethod
	 */
	@Column(name = "EOSE_BL_DELIVERY_METHOD")
	public String getEoseBlDeliveryMethod() {
		return eoseBlDeliveryMethod;
	}

	/**
	 * Set eoseBlDeliveryMethod
	 */
	public void setEoseBlDeliveryMethod(String eoseBlDeliveryMethod) {
		this.eoseBlDeliveryMethod = eoseBlDeliveryMethod;
		addValidField("eoseBlDeliveryMethod");
	}

	/**
	 * Get eoseBlExpressNo
	 */
	@Column(name = "EOSE_BL_EXPRESS_NO")
	public String getEoseBlExpressNo() {
		return eoseBlExpressNo;
	}

	/**
	 * Set eoseBlExpressNo
	 */
	public void setEoseBlExpressNo(String eoseBlExpressNo) {
		this.eoseBlExpressNo = eoseBlExpressNo;
		addValidField("eoseBlExpressNo");
	}

	/**
	 * Get eoseBlRecipient
	 */
	@Column(name = "EOSE_BL_RECIPIENT")
	public String getEoseBlRecipient() {
		return eoseBlRecipient;
	}

	/**
	 * Set eoseBlRecipient
	 */
	public void setEoseBlRecipient(String eoseBlRecipient) {
		this.eoseBlRecipient = eoseBlRecipient;
		addValidField("eoseBlRecipient");
	}

	/**
	 * Get eoseConcentrationTime
	 */
	@Column(name = "EOSE_CONCENTRATION_TIME")
	public Date getEoseConcentrationTime() {
		return eoseConcentrationTime;
	}

	/**
	 * Set eoseConcentrationTime
	 */
	public void setEoseConcentrationTime(Date eoseConcentrationTime) {
		this.eoseConcentrationTime = eoseConcentrationTime;
		addValidField("eoseConcentrationTime");
	}

	/**
	 * Get eoseLoadingTime
	 */
	@Column(name = "EOSE_LOADING_TIME")
	public Date getEoseLoadingTime() {
		return eoseLoadingTime;
	}

	/**
	 * Set eoseLoadingTime
	 */
	public void setEoseLoadingTime(Date eoseLoadingTime) {
		this.eoseLoadingTime = eoseLoadingTime;
		addValidField("eoseLoadingTime");
	}

	/**
	 * Get eoseEscoCode
	 */
	@Column(name = "EOSE_ESCO_CODE")
	public String getEoseEscoCode() {
		return eoseEscoCode;
	}

	/**
	 * Set eoseEscoCode
	 */
	public void setEoseEscoCode(String eoseEscoCode) {
		this.eoseEscoCode = eoseEscoCode;
		addValidField("eoseEscoCode");
	}

	/**
	 * Get eoseEscoNameCn
	 */
	@Column(name = "EOSE_ESCO_NAME_CN")
	public String getEoseEscoNameCn() {
		return eoseEscoNameCn;
	}

	/**
	 * Set eoseEscoNameCn
	 */
	public void setEoseEscoNameCn(String eoseEscoNameCn) {
		this.eoseEscoNameCn = eoseEscoNameCn;
		addValidField("eoseEscoNameCn");
	}

	/**
	 * Get eoseEsdeDepartmentCode
	 */
	@Column(name = "EOSE_ESDE_DEPARTMENT_CODE")
	public String getEoseEsdeDepartmentCode() {
		return eoseEsdeDepartmentCode;
	}

	/**
	 * Set eoseEsdeDepartmentCode
	 */
	public void setEoseEsdeDepartmentCode(String eoseEsdeDepartmentCode) {
		this.eoseEsdeDepartmentCode = eoseEsdeDepartmentCode;
		addValidField("eoseEsdeDepartmentCode");
	}

	/**
	 * Get eoseEsdeDepartmentName
	 */
	@Column(name = "EOSE_ESDE_DEPARTMENT_NAME")
	public String getEoseEsdeDepartmentName() {
		return eoseEsdeDepartmentName;
	}

	/**
	 * Set eoseEsdeDepartmentName
	 */
	public void setEoseEsdeDepartmentName(String eoseEsdeDepartmentName) {
		this.eoseEsdeDepartmentName = eoseEsdeDepartmentName;
		addValidField("eoseEsdeDepartmentName");
	}

	/**
	 * Get eoseEsusUserNameCn
	 */
	@Column(name = "EOSE_ESUS_USER_NAME_CN")
	public String getEoseEsusUserNameCn() {
		return eoseEsusUserNameCn;
	}

	/**
	 * Set eoseEsusUserNameCn
	 */
	public void setEoseEsusUserNameCn(String eoseEsusUserNameCn) {
		this.eoseEsusUserNameCn = eoseEsusUserNameCn;
		addValidField("eoseEsusUserNameCn");
	}

	/**
	 * Get eoseRetoType
	 */
	@Column(name = "EOSE_RETO_TYPE")
	public Long getEoseRetoType() {
		return eoseRetoType;
	}

	/**
	 * Set eoseRetoType
	 */
	public void setEoseRetoType(Long eoseRetoType) {
		this.eoseRetoType = eoseRetoType;
		addValidField("eoseRetoType");
	}

	/**
	 * Get eoseCutBoxTime
	 */
	@Column(name = "EOSE_CUT_BOX_TIME")
	public Date getEoseCutBoxTime() {
		return eoseCutBoxTime;
	}

	/**
	 * Set eoseCutBoxTime
	 */
	public void setEoseCutBoxTime(Date eoseCutBoxTime) {
		this.eoseCutBoxTime = eoseCutBoxTime;
		addValidField("eoseCutBoxTime");
	}

	/**
	 * Get eoseCutOffTime
	 */
	@Column(name = "EOSE_CUT_OFF_TIME")
	public Date getEoseCutOffTime() {
		return eoseCutOffTime;
	}

	/**
	 * Set eoseCutOffTime
	 */
	public void setEoseCutOffTime(Date eoseCutOffTime) {
		this.eoseCutOffTime = eoseCutOffTime;
		addValidField("eoseCutOffTime");
	}

	/**
	 * Get eoseIsDutyfree
	 */
	@Column(name = "EOSE_IS_DUTYFREE")
	public Long getEoseIsDutyfree() {
		return eoseIsDutyfree;
	}

	/**
	 * Set eoseIsDutyfree
	 */
	public void setEoseIsDutyfree(Long eoseIsDutyfree) {
		this.eoseIsDutyfree = eoseIsDutyfree;
		addValidField("eoseIsDutyfree");
	}

}
