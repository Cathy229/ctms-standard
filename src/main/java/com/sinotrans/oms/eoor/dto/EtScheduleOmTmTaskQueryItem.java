package com.sinotrans.oms.eoor.dto;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;

/**
 * 
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本    	修改人   		修改日期   		修改内容
 * 20100525.1	张建伟		20100525		增加调度人ID和调度人姓名
 *20111115		黄军明		行车单双击物料名称没有显示
 */
public class EtScheduleOmTmTaskQueryItem implements Serializable {
	private String ettaIsScheduleInstruction;
	private Integer ettaId;
	private Integer ettaEtorId;
	private Integer ettaEscoId;
	private Integer ettaEtspId;
	private String ettaNo;
	private String ettaSplitStatus;
	private String ettaType;
	private String ettaStatus;
	private Double ettaOrder;
	private Double ettaSelfId;
	private String ettaSoNo;
	private String ettaDoNo;
	private Integer ettaLandEbcuId;
	private String ettaLandEbcuNameCn;
	private Integer ettaCustomerEbcuId;
	private String ettaCustomerEbcuNameCn;
	private String ettaUrgency;
	private Date ettaDeliveryReqTime;
	private Date ettaTaskScheduleTime;
	private Date ettaArrivalReqTime;
	private Date ettaMentionTime;
	private String ettaTransSpeReq;
	private String ettaReceiveSpeReq;
	private String ettaLineDesc;
	private String ettaContainerType;
	private Double ettaContainerWeight;
	private String ettaIsWhiteCard;
	private String ettaIsShortBarge;
	private String ettaIsChartered;
	private String ettaIsToFight;
	private Integer ettaFromEbrgId;
	private String ettaFromEbrgNameCn;
	private Integer ettaToEbrgId;
	private String ettaToEbrgNameCn;
	private Double ettaWeight;
	private Double ettaQuantity;
	private Double ettaVolume;
	private String ettaDeliveryAddress;
	private String ettaReceiveAddress;
	private String ettaRemark;
	private String ettaLibraryNo;
	private Date ettaLibraryTime;
	private Integer ettaEbcuId;
	private String ettaEbcuNameCn;
	private Double ettaLibraryNumber;
	private Double ettaLibraryQuantity;
	private Double ettaLibraryVolume;
	private Double ettaLibraryGw;
	private Double ettaLibraryNw;
	private Integer ettaBookingEbcuId;
	private String ettaBookingEbcuNameCn;
	private String ettaBookingNo;
	private String ettaCustomNo;
	private String ettaVessel;
	private String ettaVoyage;
	private Date ettaDepartureDate;
	private Date ettaPlanDepartureDate;
	private Date ettaPlanArrivalDate;
	private Date ettaArrivalDate;
	private Date ettaPackingTime;
	private Date ettaSetPostTime;
	private Date ettaWeightTime;
	private Date ettaCutTime;
	private Integer ettaStartEbptId;
	private String ettaStartEbptNameCn;
	private Integer ettaEndEbptId;
	private String ettaEndEbptNameCn;
	private String ettaMblNo;
	private String ettaHblNo;
	private Integer ettaEtcaId;
	private String ettaEtcaNo;
	private String ettaTitleNo;
	private String ettaCustomType;
	private String ettaFileNo;
	private String ettaFileType;
	private Date ettaReleaseTime;
	private Date ettaSendTime;
	private Date ettaBackTime;
	private String ettaCustomPlace;
	private Integer ettaPortEbcuId;
	private String ettaPortEbcuNameCn;
	private String ettaPortAddress;
	private String ettaPackingAddress;
	private Date ettaTallyDate;
	private Date ettaCutPostDate;
	private Date ettaSuitcaseTime;
	private String ettaSuitcaseAddress;
	private Date ettaInPostDate;
	private Date ettaUpShippingDate;
	private Date ettaReqArrival;
	private Date ettaActualArrival;
	private String ettaContact;
	private String ettaSentCarInfo;
	private Date ettaLeaveTime;
	private String ettaDepartureRemark;
	private String ettaPackaging;
	private Date ettaPreentryDate;
	private Date ettaPortTime;
	private Date ettaCheckDate;
	private String ettaIsSewageTank;
	private String ettaPerformDesc;
	private String ettaModifier;
	private Date ettaModifyTime;
	private String ettaCreator;
	private Date ettaCreateTime;
	private String ettaPackageRemark;
	private Date ettaInspecteDate;
	private String ettaCheckDesc;
	private String ettaInOut;
	private String ettaReturnTankAddress;
	private Date ettaBackTankTime;
	private Date ettaPlanDeliveryDate;
	private String ettaIsDropTank;
	private Date ettaCollectDate;
	private Date ettaCustomStartDate;
	private Date ettaChangeDate;
	private Date ettaObtainDate;
	private Date ettaInParkTime;
	private Date ettaOutParkTime;
	private String ettaIsPortPlan;
	private Date ettaCustomEndDate;
	private Date ettaInWarehouseDate;
	private Date ettaFinishedDate;
	private Date ettaPayTaxDate;
	private String ettaTrain;
	private Date ettaStopStationTime;
	private Date ettaStationTime;
	private Date ettaRailwayTime;
	private Date ettaReturnDate;
	private Integer ettaTeamEbcuId;
	private String ettaTeamEbcuNameCn;
	private Integer ettaTerminalEbcuId;
	private String ettaTerminalEbcuNameCn;
	private String ettaSuitcase;
	private String ettaCrates;
	private Integer ettaMainEttpId;
	private String ettaTrailerEtveCard;
	private Integer ettaTrailerEtveId;
	private String ettaTractorEtveCard;
	private Integer ettaTractorEtveId;
	private String ettaMainEttpName;
	private Integer ettaCopilorEttpId;
	private String ettaCopilorEttpName;
	private Integer ettaLandEtcaId;
	private String ettaLandEtcaNo;
	private String ettaLandTitleNo;
	private String ettaEttpTel;
	private Integer ettaCarrierEbcuId;
	private String ettaCarrierEbcuNameCn;
	private Integer ettaEblnId;
	private String ettaEblnLineName;
	private String ettaIsWithin;
	private Double ettaRateMileage;
	private Double ettaSubnum1;
	private String ettaSubstr1;
	private String ettaSubstr2;
	private String ettaSubstr3;
	private String ettaSubstr4;
	private String ettaSubstr5;
	private String ettaSubstr6;
	private String ettaSubstr8;
	private String ettaSubstr7;
	private Date ettaSubdate1;
	private Date ettaSubdate2;
	private Date ettaSubdate5;
	private Date ettaSubdate4;
	private Date ettaSubdate3;
	private Double ettaSubnum3;
	private Double ettaSubnum2;
	private String creator;
	private Date createTime;
	private String modifier;
	private Date modifyTime;
	private Integer recVer;
	private Integer ettaTrailerEbcuId;
	private String ettaTrailerNameCn;
	private Integer ettaSuitcaseEbrgId;
	private Integer ettaCratesEbrgId;
	private String ettaQuantityUnit;
	private String ettaNumberUnit;
	private String ettaVoider;
	private Date ettaVoiderTime;
	private String ettaVoidDesc;
	private Date ettaDeliveryTime;
	private Date ettaArrivalTime;
	private String ettaLoadSeq;
	private String ettaUnLoadSeq;
	private String ettaCertificationNameList;
	private Double ettaNetWeight;
	private Integer ettaGroupNum;
	private String ettaTractorReq;
	private String ettaTrailerReq;
	private String ettaTransportReq;
	private String ettaFkSysId;
	private String ettaSourceSysFalg;
	private Integer ettaScheduleId;
	private String ettaScheduleName;
	private Integer etorEbpjId;
	private String etorEbpjName;
	private Integer etorConsigneeEbspId;
	private String etorConsigneeEbspNameCn;
	private Integer etorOperateEsstId;
	private String etorOrderFudeji;
	private String startZip;
	private String endZip;
	private String ebrgFlow;
	private Integer ebrgEbplProvinceId;
	private Integer ebrgEbplCityId;
//	private String etspTractorEtveCard;
//	private String etspTrailerEtveCard;
//	private String etspMainEttpName;
//	private String etspCopilorEttpName;
//	private String etspEtcaNo;
//	private String etspEtcaNo2;
	private String etomEbmaIsTemperature;
	private String etomType;
	
	private String etomEbmaNameCn;
	public String getEttaIsScheduleInstruction() {
		return ettaIsScheduleInstruction;
	}
	public void setEttaIsScheduleInstruction(String ettaIsScheduleInstruction) {
		this.ettaIsScheduleInstruction = ettaIsScheduleInstruction;
	}
	public Integer getEttaId() {
		return ettaId;
	}
	public void setEttaId(Integer ettaId) {
		this.ettaId = ettaId;
	}
	public Integer getEttaEtorId() {
		return ettaEtorId;
	}
	public void setEttaEtorId(Integer ettaEtorId) {
		this.ettaEtorId = ettaEtorId;
	}
	public Integer getEttaEscoId() {
		return ettaEscoId;
	}
	public void setEttaEscoId(Integer ettaEscoId) {
		this.ettaEscoId = ettaEscoId;
	}
	public Integer getEttaEtspId() {
		return ettaEtspId;
	}
	public void setEttaEtspId(Integer ettaEtspId) {
		this.ettaEtspId = ettaEtspId;
	}
	public String getEttaNo() {
		return ettaNo;
	}
	public void setEttaNo(String ettaNo) {
		this.ettaNo = ettaNo;
	}
	public String getEttaSplitStatus() {
		return ettaSplitStatus;
	}
	public void setEttaSplitStatus(String ettaSplitStatus) {
		this.ettaSplitStatus = ettaSplitStatus;
	}
	public String getEttaType() {
		return ettaType;
	}
	public void setEttaType(String ettaType) {
		this.ettaType = ettaType;
	}
	public String getEttaStatus() {
		return ettaStatus;
	}
	public void setEttaStatus(String ettaStatus) {
		this.ettaStatus = ettaStatus;
	}
	public Double getEttaOrder() {
		return ettaOrder;
	}
	public void setEttaOrder(Double ettaOrder) {
		this.ettaOrder = ettaOrder;
	}
	public Double getEttaSelfId() {
		return ettaSelfId;
	}
	public void setEttaSelfId(Double ettaSelfId) {
		this.ettaSelfId = ettaSelfId;
	}
	public String getEttaSoNo() {
		return ettaSoNo;
	}
	public void setEttaSoNo(String ettaSoNo) {
		this.ettaSoNo = ettaSoNo;
	}
	public String getEttaDoNo() {
		return ettaDoNo;
	}
	public void setEttaDoNo(String ettaDoNo) {
		this.ettaDoNo = ettaDoNo;
	}
	public Integer getEttaLandEbcuId() {
		return ettaLandEbcuId;
	}
	public void setEttaLandEbcuId(Integer ettaLandEbcuId) {
		this.ettaLandEbcuId = ettaLandEbcuId;
	}
	public String getEttaLandEbcuNameCn() {
		return ettaLandEbcuNameCn;
	}
	public void setEttaLandEbcuNameCn(String ettaLandEbcuNameCn) {
		this.ettaLandEbcuNameCn = ettaLandEbcuNameCn;
	}
	public Integer getEttaCustomerEbcuId() {
		return ettaCustomerEbcuId;
	}
	public void setEttaCustomerEbcuId(Integer ettaCustomerEbcuId) {
		this.ettaCustomerEbcuId = ettaCustomerEbcuId;
	}
	public String getEttaCustomerEbcuNameCn() {
		return ettaCustomerEbcuNameCn;
	}
	public void setEttaCustomerEbcuNameCn(String ettaCustomerEbcuNameCn) {
		this.ettaCustomerEbcuNameCn = ettaCustomerEbcuNameCn;
	}
	public String getEttaUrgency() {
		return ettaUrgency;
	}
	public void setEttaUrgency(String ettaUrgency) {
		this.ettaUrgency = ettaUrgency;
	}
	public Date getEttaDeliveryReqTime() {
		return ettaDeliveryReqTime;
	}
	public void setEttaDeliveryReqTime(Date ettaDeliveryReqTime) {
		this.ettaDeliveryReqTime = ettaDeliveryReqTime;
	}
	public Date getEttaTaskScheduleTime() {
		return ettaTaskScheduleTime;
	}
	public void setEttaTaskScheduleTime(Date ettaTaskScheduleTime) {
		this.ettaTaskScheduleTime = ettaTaskScheduleTime;
	}
	public Date getEttaArrivalReqTime() {
		return ettaArrivalReqTime;
	}
	public void setEttaArrivalReqTime(Date ettaArrivalReqTime) {
		this.ettaArrivalReqTime = ettaArrivalReqTime;
	}
	public Date getEttaMentionTime() {
		return ettaMentionTime;
	}
	public void setEttaMentionTime(Date ettaMentionTime) {
		this.ettaMentionTime = ettaMentionTime;
	}
	public String getEttaTransSpeReq() {
		return ettaTransSpeReq;
	}
	public void setEttaTransSpeReq(String ettaTransSpeReq) {
		this.ettaTransSpeReq = ettaTransSpeReq;
	}
	public String getEttaReceiveSpeReq() {
		return ettaReceiveSpeReq;
	}
	public void setEttaReceiveSpeReq(String ettaReceiveSpeReq) {
		this.ettaReceiveSpeReq = ettaReceiveSpeReq;
	}
	public String getEttaLineDesc() {
		return ettaLineDesc;
	}
	public void setEttaLineDesc(String ettaLineDesc) {
		this.ettaLineDesc = ettaLineDesc;
	}
	public String getEttaContainerType() {
		return ettaContainerType;
	}
	public void setEttaContainerType(String ettaContainerType) {
		this.ettaContainerType = ettaContainerType;
	}
	public Double getEttaContainerWeight() {
		return ettaContainerWeight;
	}
	public void setEttaContainerWeight(Double ettaContainerWeight) {
		this.ettaContainerWeight = ettaContainerWeight;
	}
	public String getEttaIsWhiteCard() {
		return ettaIsWhiteCard;
	}
	public void setEttaIsWhiteCard(String ettaIsWhiteCard) {
		this.ettaIsWhiteCard = ettaIsWhiteCard;
	}
	public String getEttaIsShortBarge() {
		return ettaIsShortBarge;
	}
	public void setEttaIsShortBarge(String ettaIsShortBarge) {
		this.ettaIsShortBarge = ettaIsShortBarge;
	}
	public String getEttaIsChartered() {
		return ettaIsChartered;
	}
	public void setEttaIsChartered(String ettaIsChartered) {
		this.ettaIsChartered = ettaIsChartered;
	}
	public String getEttaIsToFight() {
		return ettaIsToFight;
	}
	public void setEttaIsToFight(String ettaIsToFight) {
		this.ettaIsToFight = ettaIsToFight;
	}
	public Integer getEttaFromEbrgId() {
		return ettaFromEbrgId;
	}
	public void setEttaFromEbrgId(Integer ettaFromEbrgId) {
		this.ettaFromEbrgId = ettaFromEbrgId;
	}
	public String getEttaFromEbrgNameCn() {
		return ettaFromEbrgNameCn;
	}
	public void setEttaFromEbrgNameCn(String ettaFromEbrgNameCn) {
		this.ettaFromEbrgNameCn = ettaFromEbrgNameCn;
	}
	public Integer getEttaToEbrgId() {
		return ettaToEbrgId;
	}
	public void setEttaToEbrgId(Integer ettaToEbrgId) {
		this.ettaToEbrgId = ettaToEbrgId;
	}
	public String getEttaToEbrgNameCn() {
		return ettaToEbrgNameCn;
	}
	public void setEttaToEbrgNameCn(String ettaToEbrgNameCn) {
		this.ettaToEbrgNameCn = ettaToEbrgNameCn;
	}
	public Double getEttaWeight() {
		return ettaWeight;
	}
	public void setEttaWeight(Double ettaWeight) {
		this.ettaWeight = ettaWeight;
	}
	public Double getEttaQuantity() {
		return ettaQuantity;
	}
	public void setEttaQuantity(Double ettaQuantity) {
		this.ettaQuantity = ettaQuantity;
	}
	public Double getEttaVolume() {
		return ettaVolume;
	}
	public void setEttaVolume(Double ettaVolume) {
		this.ettaVolume = ettaVolume;
	}
	public String getEttaDeliveryAddress() {
		return ettaDeliveryAddress;
	}
	public void setEttaDeliveryAddress(String ettaDeliveryAddress) {
		this.ettaDeliveryAddress = ettaDeliveryAddress;
	}
	public String getEttaReceiveAddress() {
		return ettaReceiveAddress;
	}
	public void setEttaReceiveAddress(String ettaReceiveAddress) {
		this.ettaReceiveAddress = ettaReceiveAddress;
	}
	public String getEttaRemark() {
		return ettaRemark;
	}
	public void setEttaRemark(String ettaRemark) {
		this.ettaRemark = ettaRemark;
	}
	public String getEttaLibraryNo() {
		return ettaLibraryNo;
	}
	public void setEttaLibraryNo(String ettaLibraryNo) {
		this.ettaLibraryNo = ettaLibraryNo;
	}
	public Date getEttaLibraryTime() {
		return ettaLibraryTime;
	}
	public void setEttaLibraryTime(Date ettaLibraryTime) {
		this.ettaLibraryTime = ettaLibraryTime;
	}
	public Integer getEttaEbcuId() {
		return ettaEbcuId;
	}
	public void setEttaEbcuId(Integer ettaEbcuId) {
		this.ettaEbcuId = ettaEbcuId;
	}
	public String getEttaEbcuNameCn() {
		return ettaEbcuNameCn;
	}
	public void setEttaEbcuNameCn(String ettaEbcuNameCn) {
		this.ettaEbcuNameCn = ettaEbcuNameCn;
	}
	public Double getEttaLibraryNumber() {
		return ettaLibraryNumber;
	}
	public void setEttaLibraryNumber(Double ettaLibraryNumber) {
		this.ettaLibraryNumber = ettaLibraryNumber;
	}
	public Double getEttaLibraryQuantity() {
		return ettaLibraryQuantity;
	}
	public void setEttaLibraryQuantity(Double ettaLibraryQuantity) {
		this.ettaLibraryQuantity = ettaLibraryQuantity;
	}
	public Double getEttaLibraryVolume() {
		return ettaLibraryVolume;
	}
	public void setEttaLibraryVolume(Double ettaLibraryVolume) {
		this.ettaLibraryVolume = ettaLibraryVolume;
	}
	public Double getEttaLibraryGw() {
		return ettaLibraryGw;
	}
	public void setEttaLibraryGw(Double ettaLibraryGw) {
		this.ettaLibraryGw = ettaLibraryGw;
	}
	public Double getEttaLibraryNw() {
		return ettaLibraryNw;
	}
	public void setEttaLibraryNw(Double ettaLibraryNw) {
		this.ettaLibraryNw = ettaLibraryNw;
	}
	public Integer getEttaBookingEbcuId() {
		return ettaBookingEbcuId;
	}
	public void setEttaBookingEbcuId(Integer ettaBookingEbcuId) {
		this.ettaBookingEbcuId = ettaBookingEbcuId;
	}
	public String getEttaBookingEbcuNameCn() {
		return ettaBookingEbcuNameCn;
	}
	public void setEttaBookingEbcuNameCn(String ettaBookingEbcuNameCn) {
		this.ettaBookingEbcuNameCn = ettaBookingEbcuNameCn;
	}
	public String getEttaBookingNo() {
		return ettaBookingNo;
	}
	public void setEttaBookingNo(String ettaBookingNo) {
		this.ettaBookingNo = ettaBookingNo;
	}
	public String getEttaCustomNo() {
		return ettaCustomNo;
	}
	public void setEttaCustomNo(String ettaCustomNo) {
		this.ettaCustomNo = ettaCustomNo;
	}
	public String getEttaVessel() {
		return ettaVessel;
	}
	public void setEttaVessel(String ettaVessel) {
		this.ettaVessel = ettaVessel;
	}
	public String getEttaVoyage() {
		return ettaVoyage;
	}
	public void setEttaVoyage(String ettaVoyage) {
		this.ettaVoyage = ettaVoyage;
	}
	public Date getEttaDepartureDate() {
		return ettaDepartureDate;
	}
	public void setEttaDepartureDate(Date ettaDepartureDate) {
		this.ettaDepartureDate = ettaDepartureDate;
	}
	public Date getEttaPlanDepartureDate() {
		return ettaPlanDepartureDate;
	}
	public void setEttaPlanDepartureDate(Date ettaPlanDepartureDate) {
		this.ettaPlanDepartureDate = ettaPlanDepartureDate;
	}
	public Date getEttaPlanArrivalDate() {
		return ettaPlanArrivalDate;
	}
	public void setEttaPlanArrivalDate(Date ettaPlanArrivalDate) {
		this.ettaPlanArrivalDate = ettaPlanArrivalDate;
	}
	public Date getEttaArrivalDate() {
		return ettaArrivalDate;
	}
	public void setEttaArrivalDate(Date ettaArrivalDate) {
		this.ettaArrivalDate = ettaArrivalDate;
	}
	public Date getEttaPackingTime() {
		return ettaPackingTime;
	}
	public void setEttaPackingTime(Date ettaPackingTime) {
		this.ettaPackingTime = ettaPackingTime;
	}
	public Date getEttaSetPostTime() {
		return ettaSetPostTime;
	}
	public void setEttaSetPostTime(Date ettaSetPostTime) {
		this.ettaSetPostTime = ettaSetPostTime;
	}
	public Date getEttaWeightTime() {
		return ettaWeightTime;
	}
	public void setEttaWeightTime(Date ettaWeightTime) {
		this.ettaWeightTime = ettaWeightTime;
	}
	public Date getEttaCutTime() {
		return ettaCutTime;
	}
	public void setEttaCutTime(Date ettaCutTime) {
		this.ettaCutTime = ettaCutTime;
	}
	public Integer getEttaStartEbptId() {
		return ettaStartEbptId;
	}
	public void setEttaStartEbptId(Integer ettaStartEbptId) {
		this.ettaStartEbptId = ettaStartEbptId;
	}
	public String getEttaStartEbptNameCn() {
		return ettaStartEbptNameCn;
	}
	public void setEttaStartEbptNameCn(String ettaStartEbptNameCn) {
		this.ettaStartEbptNameCn = ettaStartEbptNameCn;
	}
	public Integer getEttaEndEbptId() {
		return ettaEndEbptId;
	}
	public void setEttaEndEbptId(Integer ettaEndEbptId) {
		this.ettaEndEbptId = ettaEndEbptId;
	}
	public String getEttaEndEbptNameCn() {
		return ettaEndEbptNameCn;
	}
	public void setEttaEndEbptNameCn(String ettaEndEbptNameCn) {
		this.ettaEndEbptNameCn = ettaEndEbptNameCn;
	}
	public String getEttaMblNo() {
		return ettaMblNo;
	}
	public void setEttaMblNo(String ettaMblNo) {
		this.ettaMblNo = ettaMblNo;
	}
	public String getEttaHblNo() {
		return ettaHblNo;
	}
	public void setEttaHblNo(String ettaHblNo) {
		this.ettaHblNo = ettaHblNo;
	}
	public Integer getEttaEtcaId() {
		return ettaEtcaId;
	}
	public void setEttaEtcaId(Integer ettaEtcaId) {
		this.ettaEtcaId = ettaEtcaId;
	}
	public String getEttaEtcaNo() {
		return ettaEtcaNo;
	}
	public void setEttaEtcaNo(String ettaEtcaNo) {
		this.ettaEtcaNo = ettaEtcaNo;
	}
	public String getEttaTitleNo() {
		return ettaTitleNo;
	}
	public void setEttaTitleNo(String ettaTitleNo) {
		this.ettaTitleNo = ettaTitleNo;
	}
	public String getEttaCustomType() {
		return ettaCustomType;
	}
	public void setEttaCustomType(String ettaCustomType) {
		this.ettaCustomType = ettaCustomType;
	}
	public String getEttaFileNo() {
		return ettaFileNo;
	}
	public void setEttaFileNo(String ettaFileNo) {
		this.ettaFileNo = ettaFileNo;
	}
	public String getEttaFileType() {
		return ettaFileType;
	}
	public void setEttaFileType(String ettaFileType) {
		this.ettaFileType = ettaFileType;
	}
	public Date getEttaReleaseTime() {
		return ettaReleaseTime;
	}
	public void setEttaReleaseTime(Date ettaReleaseTime) {
		this.ettaReleaseTime = ettaReleaseTime;
	}
	public Date getEttaSendTime() {
		return ettaSendTime;
	}
	public void setEttaSendTime(Date ettaSendTime) {
		this.ettaSendTime = ettaSendTime;
	}
	public Date getEttaBackTime() {
		return ettaBackTime;
	}
	public void setEttaBackTime(Date ettaBackTime) {
		this.ettaBackTime = ettaBackTime;
	}
	public String getEttaCustomPlace() {
		return ettaCustomPlace;
	}
	public void setEttaCustomPlace(String ettaCustomPlace) {
		this.ettaCustomPlace = ettaCustomPlace;
	}
	public Integer getEttaPortEbcuId() {
		return ettaPortEbcuId;
	}
	public void setEttaPortEbcuId(Integer ettaPortEbcuId) {
		this.ettaPortEbcuId = ettaPortEbcuId;
	}
	public String getEttaPortEbcuNameCn() {
		return ettaPortEbcuNameCn;
	}
	public void setEttaPortEbcuNameCn(String ettaPortEbcuNameCn) {
		this.ettaPortEbcuNameCn = ettaPortEbcuNameCn;
	}
	public String getEttaPortAddress() {
		return ettaPortAddress;
	}
	public void setEttaPortAddress(String ettaPortAddress) {
		this.ettaPortAddress = ettaPortAddress;
	}
	public String getEttaPackingAddress() {
		return ettaPackingAddress;
	}
	public void setEttaPackingAddress(String ettaPackingAddress) {
		this.ettaPackingAddress = ettaPackingAddress;
	}
	public Date getEttaTallyDate() {
		return ettaTallyDate;
	}
	public void setEttaTallyDate(Date ettaTallyDate) {
		this.ettaTallyDate = ettaTallyDate;
	}
	public Date getEttaCutPostDate() {
		return ettaCutPostDate;
	}
	public void setEttaCutPostDate(Date ettaCutPostDate) {
		this.ettaCutPostDate = ettaCutPostDate;
	}
	public Date getEttaSuitcaseTime() {
		return ettaSuitcaseTime;
	}
	public void setEttaSuitcaseTime(Date ettaSuitcaseTime) {
		this.ettaSuitcaseTime = ettaSuitcaseTime;
	}
	public String getEttaSuitcaseAddress() {
		return ettaSuitcaseAddress;
	}
	public void setEttaSuitcaseAddress(String ettaSuitcaseAddress) {
		this.ettaSuitcaseAddress = ettaSuitcaseAddress;
	}
	public Date getEttaInPostDate() {
		return ettaInPostDate;
	}
	public void setEttaInPostDate(Date ettaInPostDate) {
		this.ettaInPostDate = ettaInPostDate;
	}
	public Date getEttaUpShippingDate() {
		return ettaUpShippingDate;
	}
	public void setEttaUpShippingDate(Date ettaUpShippingDate) {
		this.ettaUpShippingDate = ettaUpShippingDate;
	}
	public Date getEttaReqArrival() {
		return ettaReqArrival;
	}
	public void setEttaReqArrival(Date ettaReqArrival) {
		this.ettaReqArrival = ettaReqArrival;
	}
	public Date getEttaActualArrival() {
		return ettaActualArrival;
	}
	public void setEttaActualArrival(Date ettaActualArrival) {
		this.ettaActualArrival = ettaActualArrival;
	}
	public String getEttaContact() {
		return ettaContact;
	}
	public void setEttaContact(String ettaContact) {
		this.ettaContact = ettaContact;
	}
	public String getEttaSentCarInfo() {
		return ettaSentCarInfo;
	}
	public void setEttaSentCarInfo(String ettaSentCarInfo) {
		this.ettaSentCarInfo = ettaSentCarInfo;
	}
	public Date getEttaLeaveTime() {
		return ettaLeaveTime;
	}
	public void setEttaLeaveTime(Date ettaLeaveTime) {
		this.ettaLeaveTime = ettaLeaveTime;
	}
	public String getEttaDepartureRemark() {
		return ettaDepartureRemark;
	}
	public void setEttaDepartureRemark(String ettaDepartureRemark) {
		this.ettaDepartureRemark = ettaDepartureRemark;
	}
	public String getEttaPackaging() {
		return ettaPackaging;
	}
	public void setEttaPackaging(String ettaPackaging) {
		this.ettaPackaging = ettaPackaging;
	}
	public Date getEttaPreentryDate() {
		return ettaPreentryDate;
	}
	public void setEttaPreentryDate(Date ettaPreentryDate) {
		this.ettaPreentryDate = ettaPreentryDate;
	}
	public Date getEttaPortTime() {
		return ettaPortTime;
	}
	public void setEttaPortTime(Date ettaPortTime) {
		this.ettaPortTime = ettaPortTime;
	}
	public Date getEttaCheckDate() {
		return ettaCheckDate;
	}
	public void setEttaCheckDate(Date ettaCheckDate) {
		this.ettaCheckDate = ettaCheckDate;
	}
	public String getEttaIsSewageTank() {
		return ettaIsSewageTank;
	}
	public void setEttaIsSewageTank(String ettaIsSewageTank) {
		this.ettaIsSewageTank = ettaIsSewageTank;
	}
	public String getEttaPerformDesc() {
		return ettaPerformDesc;
	}
	public void setEttaPerformDesc(String ettaPerformDesc) {
		this.ettaPerformDesc = ettaPerformDesc;
	}
	public String getEttaModifier() {
		return ettaModifier;
	}
	public void setEttaModifier(String ettaModifier) {
		this.ettaModifier = ettaModifier;
	}
	public Date getEttaModifyTime() {
		return ettaModifyTime;
	}
	public void setEttaModifyTime(Date ettaModifyTime) {
		this.ettaModifyTime = ettaModifyTime;
	}
	public String getEttaCreator() {
		return ettaCreator;
	}
	public void setEttaCreator(String ettaCreator) {
		this.ettaCreator = ettaCreator;
	}
	public Date getEttaCreateTime() {
		return ettaCreateTime;
	}
	public void setEttaCreateTime(Date ettaCreateTime) {
		this.ettaCreateTime = ettaCreateTime;
	}
	public String getEttaPackageRemark() {
		return ettaPackageRemark;
	}
	public void setEttaPackageRemark(String ettaPackageRemark) {
		this.ettaPackageRemark = ettaPackageRemark;
	}
	public Date getEttaInspecteDate() {
		return ettaInspecteDate;
	}
	public void setEttaInspecteDate(Date ettaInspecteDate) {
		this.ettaInspecteDate = ettaInspecteDate;
	}
	public String getEttaCheckDesc() {
		return ettaCheckDesc;
	}
	public void setEttaCheckDesc(String ettaCheckDesc) {
		this.ettaCheckDesc = ettaCheckDesc;
	}
	public String getEttaInOut() {
		return ettaInOut;
	}
	public void setEttaInOut(String ettaInOut) {
		this.ettaInOut = ettaInOut;
	}
	public String getEttaReturnTankAddress() {
		return ettaReturnTankAddress;
	}
	public void setEttaReturnTankAddress(String ettaReturnTankAddress) {
		this.ettaReturnTankAddress = ettaReturnTankAddress;
	}
	public Date getEttaBackTankTime() {
		return ettaBackTankTime;
	}
	public void setEttaBackTankTime(Date ettaBackTankTime) {
		this.ettaBackTankTime = ettaBackTankTime;
	}
	public Date getEttaPlanDeliveryDate() {
		return ettaPlanDeliveryDate;
	}
	public void setEttaPlanDeliveryDate(Date ettaPlanDeliveryDate) {
		this.ettaPlanDeliveryDate = ettaPlanDeliveryDate;
	}
	public String getEttaIsDropTank() {
		return ettaIsDropTank;
	}
	public void setEttaIsDropTank(String ettaIsDropTank) {
		this.ettaIsDropTank = ettaIsDropTank;
	}
	public Date getEttaCollectDate() {
		return ettaCollectDate;
	}
	public void setEttaCollectDate(Date ettaCollectDate) {
		this.ettaCollectDate = ettaCollectDate;
	}
	public Date getEttaCustomStartDate() {
		return ettaCustomStartDate;
	}
	public void setEttaCustomStartDate(Date ettaCustomStartDate) {
		this.ettaCustomStartDate = ettaCustomStartDate;
	}
	public Date getEttaChangeDate() {
		return ettaChangeDate;
	}
	public void setEttaChangeDate(Date ettaChangeDate) {
		this.ettaChangeDate = ettaChangeDate;
	}
	public Date getEttaObtainDate() {
		return ettaObtainDate;
	}
	public void setEttaObtainDate(Date ettaObtainDate) {
		this.ettaObtainDate = ettaObtainDate;
	}
	public Date getEttaInParkTime() {
		return ettaInParkTime;
	}
	public void setEttaInParkTime(Date ettaInParkTime) {
		this.ettaInParkTime = ettaInParkTime;
	}
	public Date getEttaOutParkTime() {
		return ettaOutParkTime;
	}
	public void setEttaOutParkTime(Date ettaOutParkTime) {
		this.ettaOutParkTime = ettaOutParkTime;
	}
	public String getEttaIsPortPlan() {
		return ettaIsPortPlan;
	}
	public void setEttaIsPortPlan(String ettaIsPortPlan) {
		this.ettaIsPortPlan = ettaIsPortPlan;
	}
	public Date getEttaCustomEndDate() {
		return ettaCustomEndDate;
	}
	public void setEttaCustomEndDate(Date ettaCustomEndDate) {
		this.ettaCustomEndDate = ettaCustomEndDate;
	}
	public Date getEttaInWarehouseDate() {
		return ettaInWarehouseDate;
	}
	public void setEttaInWarehouseDate(Date ettaInWarehouseDate) {
		this.ettaInWarehouseDate = ettaInWarehouseDate;
	}
	public Date getEttaFinishedDate() {
		return ettaFinishedDate;
	}
	public void setEttaFinishedDate(Date ettaFinishedDate) {
		this.ettaFinishedDate = ettaFinishedDate;
	}
	public Date getEttaPayTaxDate() {
		return ettaPayTaxDate;
	}
	public void setEttaPayTaxDate(Date ettaPayTaxDate) {
		this.ettaPayTaxDate = ettaPayTaxDate;
	}
	public String getEttaTrain() {
		return ettaTrain;
	}
	public void setEttaTrain(String ettaTrain) {
		this.ettaTrain = ettaTrain;
	}
	public Date getEttaStopStationTime() {
		return ettaStopStationTime;
	}
	public void setEttaStopStationTime(Date ettaStopStationTime) {
		this.ettaStopStationTime = ettaStopStationTime;
	}
	public Date getEttaStationTime() {
		return ettaStationTime;
	}
	public void setEttaStationTime(Date ettaStationTime) {
		this.ettaStationTime = ettaStationTime;
	}
	public Date getEttaRailwayTime() {
		return ettaRailwayTime;
	}
	public void setEttaRailwayTime(Date ettaRailwayTime) {
		this.ettaRailwayTime = ettaRailwayTime;
	}
	public Date getEttaReturnDate() {
		return ettaReturnDate;
	}
	public void setEttaReturnDate(Date ettaReturnDate) {
		this.ettaReturnDate = ettaReturnDate;
	}
	public Integer getEttaTeamEbcuId() {
		return ettaTeamEbcuId;
	}
	public void setEttaTeamEbcuId(Integer ettaTeamEbcuId) {
		this.ettaTeamEbcuId = ettaTeamEbcuId;
	}
	public String getEttaTeamEbcuNameCn() {
		return ettaTeamEbcuNameCn;
	}
	public void setEttaTeamEbcuNameCn(String ettaTeamEbcuNameCn) {
		this.ettaTeamEbcuNameCn = ettaTeamEbcuNameCn;
	}
	public Integer getEttaTerminalEbcuId() {
		return ettaTerminalEbcuId;
	}
	public void setEttaTerminalEbcuId(Integer ettaTerminalEbcuId) {
		this.ettaTerminalEbcuId = ettaTerminalEbcuId;
	}
	public String getEttaTerminalEbcuNameCn() {
		return ettaTerminalEbcuNameCn;
	}
	public void setEttaTerminalEbcuNameCn(String ettaTerminalEbcuNameCn) {
		this.ettaTerminalEbcuNameCn = ettaTerminalEbcuNameCn;
	}
	public String getEttaSuitcase() {
		return ettaSuitcase;
	}
	public void setEttaSuitcase(String ettaSuitcase) {
		this.ettaSuitcase = ettaSuitcase;
	}
	public String getEttaCrates() {
		return ettaCrates;
	}
	public void setEttaCrates(String ettaCrates) {
		this.ettaCrates = ettaCrates;
	}
	public Integer getEttaMainEttpId() {
		return ettaMainEttpId;
	}
	public void setEttaMainEttpId(Integer ettaMainEttpId) {
		this.ettaMainEttpId = ettaMainEttpId;
	}
	public String getEttaTrailerEtveCard() {
		return ettaTrailerEtveCard;
	}
	public void setEttaTrailerEtveCard(String ettaTrailerEtveCard) {
		this.ettaTrailerEtveCard = ettaTrailerEtveCard;
	}
	public Integer getEttaTrailerEtveId() {
		return ettaTrailerEtveId;
	}
	public void setEttaTrailerEtveId(Integer ettaTrailerEtveId) {
		this.ettaTrailerEtveId = ettaTrailerEtveId;
	}
	public String getEttaTractorEtveCard() {
		return ettaTractorEtveCard;
	}
	public void setEttaTractorEtveCard(String ettaTractorEtveCard) {
		this.ettaTractorEtveCard = ettaTractorEtveCard;
	}
	public Integer getEttaTractorEtveId() {
		return ettaTractorEtveId;
	}
	public void setEttaTractorEtveId(Integer ettaTractorEtveId) {
		this.ettaTractorEtveId = ettaTractorEtveId;
	}
	public String getEttaMainEttpName() {
		return ettaMainEttpName;
	}
	public void setEttaMainEttpName(String ettaMainEttpName) {
		this.ettaMainEttpName = ettaMainEttpName;
	}
	public Integer getEttaCopilorEttpId() {
		return ettaCopilorEttpId;
	}
	public void setEttaCopilorEttpId(Integer ettaCopilorEttpId) {
		this.ettaCopilorEttpId = ettaCopilorEttpId;
	}
	public String getEttaCopilorEttpName() {
		return ettaCopilorEttpName;
	}
	public void setEttaCopilorEttpName(String ettaCopilorEttpName) {
		this.ettaCopilorEttpName = ettaCopilorEttpName;
	}
	public Integer getEttaLandEtcaId() {
		return ettaLandEtcaId;
	}
	public void setEttaLandEtcaId(Integer ettaLandEtcaId) {
		this.ettaLandEtcaId = ettaLandEtcaId;
	}
	public String getEttaLandEtcaNo() {
		return ettaLandEtcaNo;
	}
	public void setEttaLandEtcaNo(String ettaLandEtcaNo) {
		this.ettaLandEtcaNo = ettaLandEtcaNo;
	}
	public String getEttaLandTitleNo() {
		return ettaLandTitleNo;
	}
	public void setEttaLandTitleNo(String ettaLandTitleNo) {
		this.ettaLandTitleNo = ettaLandTitleNo;
	}
	public String getEttaEttpTel() {
		return ettaEttpTel;
	}
	public void setEttaEttpTel(String ettaEttpTel) {
		this.ettaEttpTel = ettaEttpTel;
	}
	public Integer getEttaCarrierEbcuId() {
		return ettaCarrierEbcuId;
	}
	public void setEttaCarrierEbcuId(Integer ettaCarrierEbcuId) {
		this.ettaCarrierEbcuId = ettaCarrierEbcuId;
	}
	public String getEttaCarrierEbcuNameCn() {
		return ettaCarrierEbcuNameCn;
	}
	public void setEttaCarrierEbcuNameCn(String ettaCarrierEbcuNameCn) {
		this.ettaCarrierEbcuNameCn = ettaCarrierEbcuNameCn;
	}
	public Integer getEttaEblnId() {
		return ettaEblnId;
	}
	public void setEttaEblnId(Integer ettaEblnId) {
		this.ettaEblnId = ettaEblnId;
	}
	public String getEttaEblnLineName() {
		return ettaEblnLineName;
	}
	public void setEttaEblnLineName(String ettaEblnLineName) {
		this.ettaEblnLineName = ettaEblnLineName;
	}
	public String getEttaIsWithin() {
		return ettaIsWithin;
	}
	public void setEttaIsWithin(String ettaIsWithin) {
		this.ettaIsWithin = ettaIsWithin;
	}
	public Double getEttaRateMileage() {
		return ettaRateMileage;
	}
	public void setEttaRateMileage(Double ettaRateMileage) {
		this.ettaRateMileage = ettaRateMileage;
	}
	public Double getEttaSubnum1() {
		return ettaSubnum1;
	}
	public void setEttaSubnum1(Double ettaSubnum1) {
		this.ettaSubnum1 = ettaSubnum1;
	}
	public String getEttaSubstr1() {
		return ettaSubstr1;
	}
	public void setEttaSubstr1(String ettaSubstr1) {
		this.ettaSubstr1 = ettaSubstr1;
	}
	public String getEttaSubstr2() {
		return ettaSubstr2;
	}
	public void setEttaSubstr2(String ettaSubstr2) {
		this.ettaSubstr2 = ettaSubstr2;
	}
	public String getEttaSubstr3() {
		return ettaSubstr3;
	}
	public void setEttaSubstr3(String ettaSubstr3) {
		this.ettaSubstr3 = ettaSubstr3;
	}
	public String getEttaSubstr4() {
		return ettaSubstr4;
	}
	public void setEttaSubstr4(String ettaSubstr4) {
		this.ettaSubstr4 = ettaSubstr4;
	}
	public String getEttaSubstr5() {
		return ettaSubstr5;
	}
	public void setEttaSubstr5(String ettaSubstr5) {
		this.ettaSubstr5 = ettaSubstr5;
	}
	public String getEttaSubstr6() {
		return ettaSubstr6;
	}
	public void setEttaSubstr6(String ettaSubstr6) {
		this.ettaSubstr6 = ettaSubstr6;
	}
	public String getEttaSubstr8() {
		return ettaSubstr8;
	}
	public void setEttaSubstr8(String ettaSubstr8) {
		this.ettaSubstr8 = ettaSubstr8;
	}
	public String getEttaSubstr7() {
		return ettaSubstr7;
	}
	public void setEttaSubstr7(String ettaSubstr7) {
		this.ettaSubstr7 = ettaSubstr7;
	}
	public Date getEttaSubdate1() {
		return ettaSubdate1;
	}
	public void setEttaSubdate1(Date ettaSubdate1) {
		this.ettaSubdate1 = ettaSubdate1;
	}
	public Date getEttaSubdate2() {
		return ettaSubdate2;
	}
	public void setEttaSubdate2(Date ettaSubdate2) {
		this.ettaSubdate2 = ettaSubdate2;
	}
	public Date getEttaSubdate5() {
		return ettaSubdate5;
	}
	public void setEttaSubdate5(Date ettaSubdate5) {
		this.ettaSubdate5 = ettaSubdate5;
	}
	public Date getEttaSubdate4() {
		return ettaSubdate4;
	}
	public void setEttaSubdate4(Date ettaSubdate4) {
		this.ettaSubdate4 = ettaSubdate4;
	}
	public Date getEttaSubdate3() {
		return ettaSubdate3;
	}
	public void setEttaSubdate3(Date ettaSubdate3) {
		this.ettaSubdate3 = ettaSubdate3;
	}
	public Double getEttaSubnum3() {
		return ettaSubnum3;
	}
	public void setEttaSubnum3(Double ettaSubnum3) {
		this.ettaSubnum3 = ettaSubnum3;
	}
	public Double getEttaSubnum2() {
		return ettaSubnum2;
	}
	public void setEttaSubnum2(Double ettaSubnum2) {
		this.ettaSubnum2 = ettaSubnum2;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public Integer getRecVer() {
		return recVer;
	}
	public void setRecVer(Integer recVer) {
		this.recVer = recVer;
	}
	public Integer getEttaTrailerEbcuId() {
		return ettaTrailerEbcuId;
	}
	public void setEttaTrailerEbcuId(Integer ettaTrailerEbcuId) {
		this.ettaTrailerEbcuId = ettaTrailerEbcuId;
	}
	public String getEttaTrailerNameCn() {
		return ettaTrailerNameCn;
	}
	public void setEttaTrailerNameCn(String ettaTrailerNameCn) {
		this.ettaTrailerNameCn = ettaTrailerNameCn;
	}
	public Integer getEttaSuitcaseEbrgId() {
		return ettaSuitcaseEbrgId;
	}
	public void setEttaSuitcaseEbrgId(Integer ettaSuitcaseEbrgId) {
		this.ettaSuitcaseEbrgId = ettaSuitcaseEbrgId;
	}
	public Integer getEttaCratesEbrgId() {
		return ettaCratesEbrgId;
	}
	public void setEttaCratesEbrgId(Integer ettaCratesEbrgId) {
		this.ettaCratesEbrgId = ettaCratesEbrgId;
	}
	public String getEttaQuantityUnit() {
		return ettaQuantityUnit;
	}
	public void setEttaQuantityUnit(String ettaQuantityUnit) {
		this.ettaQuantityUnit = ettaQuantityUnit;
	}
	public String getEttaNumberUnit() {
		return ettaNumberUnit;
	}
	public void setEttaNumberUnit(String ettaNumberUnit) {
		this.ettaNumberUnit = ettaNumberUnit;
	}
	public String getEttaVoider() {
		return ettaVoider;
	}
	public void setEttaVoider(String ettaVoider) {
		this.ettaVoider = ettaVoider;
	}
	public Date getEttaVoiderTime() {
		return ettaVoiderTime;
	}
	public void setEttaVoiderTime(Date ettaVoiderTime) {
		this.ettaVoiderTime = ettaVoiderTime;
	}
	public String getEttaVoidDesc() {
		return ettaVoidDesc;
	}
	public void setEttaVoidDesc(String ettaVoidDesc) {
		this.ettaVoidDesc = ettaVoidDesc;
	}
	public Date getEttaDeliveryTime() {
		return ettaDeliveryTime;
	}
	public void setEttaDeliveryTime(Date ettaDeliveryTime) {
		this.ettaDeliveryTime = ettaDeliveryTime;
	}
	public Date getEttaArrivalTime() {
		return ettaArrivalTime;
	}
	public void setEttaArrivalTime(Date ettaArrivalTime) {
		this.ettaArrivalTime = ettaArrivalTime;
	}
	public String getEttaLoadSeq() {
		return ettaLoadSeq;
	}
	public void setEttaLoadSeq(String ettaLoadSeq) {
		this.ettaLoadSeq = ettaLoadSeq;
	}
	public String getEttaUnLoadSeq() {
		return ettaUnLoadSeq;
	}
	public void setEttaUnLoadSeq(String ettaUnLoadSeq) {
		this.ettaUnLoadSeq = ettaUnLoadSeq;
	}
	public String getEttaCertificationNameList() {
		return ettaCertificationNameList;
	}
	public void setEttaCertificationNameList(String ettaCertificationNameList) {
		this.ettaCertificationNameList = ettaCertificationNameList;
	}
	public Double getEttaNetWeight() {
		return ettaNetWeight;
	}
	public void setEttaNetWeight(Double ettaNetWeight) {
		this.ettaNetWeight = ettaNetWeight;
	}
	public Integer getEttaGroupNum() {
		return ettaGroupNum;
	}
	public void setEttaGroupNum(Integer ettaGroupNum) {
		this.ettaGroupNum = ettaGroupNum;
	}
	public String getEttaTractorReq() {
		return ettaTractorReq;
	}
	public void setEttaTractorReq(String ettaTractorReq) {
		this.ettaTractorReq = ettaTractorReq;
	}
	public String getEttaTrailerReq() {
		return ettaTrailerReq;
	}
	public void setEttaTrailerReq(String ettaTrailerReq) {
		this.ettaTrailerReq = ettaTrailerReq;
	}
	public String getEttaTransportReq() {
		return ettaTransportReq;
	}
	public void setEttaTransportReq(String ettaTransportReq) {
		this.ettaTransportReq = ettaTransportReq;
	}
	public String getEttaFkSysId() {
		return ettaFkSysId;
	}
	public void setEttaFkSysId(String ettaFkSysId) {
		this.ettaFkSysId = ettaFkSysId;
	}
	public String getEttaSourceSysFalg() {
		return ettaSourceSysFalg;
	}
	public void setEttaSourceSysFalg(String ettaSourceSysFalg) {
		this.ettaSourceSysFalg = ettaSourceSysFalg;
	}
	public Integer getEttaScheduleId() {
		return ettaScheduleId;
	}
	public void setEttaScheduleId(Integer ettaScheduleId) {
		this.ettaScheduleId = ettaScheduleId;
	}
	public String getEttaScheduleName() {
		return ettaScheduleName;
	}
	public void setEttaScheduleName(String ettaScheduleName) {
		this.ettaScheduleName = ettaScheduleName;
	}
	public Integer getEtorEbpjId() {
		return etorEbpjId;
	}
	public void setEtorEbpjId(Integer etorEbpjId) {
		this.etorEbpjId = etorEbpjId;
	}
	public String getEtorEbpjName() {
		return etorEbpjName;
	}
	public void setEtorEbpjName(String etorEbpjName) {
		this.etorEbpjName = etorEbpjName;
	}
	public Integer getEtorConsigneeEbspId() {
		return etorConsigneeEbspId;
	}
	public void setEtorConsigneeEbspId(Integer etorConsigneeEbspId) {
		this.etorConsigneeEbspId = etorConsigneeEbspId;
	}
	public String getEtorConsigneeEbspNameCn() {
		return etorConsigneeEbspNameCn;
	}
	public void setEtorConsigneeEbspNameCn(String etorConsigneeEbspNameCn) {
		this.etorConsigneeEbspNameCn = etorConsigneeEbspNameCn;
	}
	public Integer getEtorOperateEsstId() {
		return etorOperateEsstId;
	}
	public void setEtorOperateEsstId(Integer etorOperateEsstId) {
		this.etorOperateEsstId = etorOperateEsstId;
	}
	public String getEtorOrderFudeji() {
		return etorOrderFudeji;
	}
	public void setEtorOrderFudeji(String etorOrderFudeji) {
		this.etorOrderFudeji = etorOrderFudeji;
	}
	public String getStartZip() {
		return startZip;
	}
	public void setStartZip(String startZip) {
		this.startZip = startZip;
	}
	public String getEndZip() {
		return endZip;
	}
	public void setEndZip(String endZip) {
		this.endZip = endZip;
	}
	public String getEbrgFlow() {
		return ebrgFlow;
	}
	public void setEbrgFlow(String ebrgFlow) {
		this.ebrgFlow = ebrgFlow;
	}
	public Integer getEbrgEbplProvinceId() {
		return ebrgEbplProvinceId;
	}
	public void setEbrgEbplProvinceId(Integer ebrgEbplProvinceId) {
		this.ebrgEbplProvinceId = ebrgEbplProvinceId;
	}
	public Integer getEbrgEbplCityId() {
		return ebrgEbplCityId;
	}
	public void setEbrgEbplCityId(Integer ebrgEbplCityId) {
		this.ebrgEbplCityId = ebrgEbplCityId;
	}
//	public String getEtspTractorEtveCard() {
//		return etspTractorEtveCard;
//	}
//	public void setEtspTractorEtveCard(String etspTractorEtveCard) {
//		this.etspTractorEtveCard = etspTractorEtveCard;
//	}
//	public String getEtspTrailerEtveCard() {
//		return etspTrailerEtveCard;
//	}
//	public void setEtspTrailerEtveCard(String etspTrailerEtveCard) {
//		this.etspTrailerEtveCard = etspTrailerEtveCard;
//	}
//	public String getEtspMainEttpName() {
//		return etspMainEttpName;
//	}
//	public void setEtspMainEttpName(String etspMainEttpName) {
//		this.etspMainEttpName = etspMainEttpName;
//	}
//	public String getEtspCopilorEttpName() {
//		return etspCopilorEttpName;
//	}
//	public void setEtspCopilorEttpName(String etspCopilorEttpName) {
//		this.etspCopilorEttpName = etspCopilorEttpName;
//	}
//	public String getEtspEtcaNo() {
//		return etspEtcaNo;
//	}
//	public void setEtspEtcaNo(String etspEtcaNo) {
//		this.etspEtcaNo = etspEtcaNo;
//	}
//	public String getEtspEtcaNo2() {
//		return etspEtcaNo2;
//	}
//	public void setEtspEtcaNo2(String etspEtcaNo2) {
//		this.etspEtcaNo2 = etspEtcaNo2;
//	}
	public String getEtomEbmaIsTemperature() {
		return etomEbmaIsTemperature;
	}
	public void setEtomEbmaIsTemperature(String etomEbmaIsTemperature) {
		this.etomEbmaIsTemperature = etomEbmaIsTemperature;
	}
	public String getEtomType() {
		return etomType;
	}
	public void setEtomType(String etomType) {
		this.etomType = etomType;
	}
	public String getEtomEbmaNameCn() {
		return etomEbmaNameCn;
	}
	public void setEtomEbmaNameCn(String etomEbmaNameCn) {
		this.etomEbmaNameCn = etomEbmaNameCn;
	}

	

}
