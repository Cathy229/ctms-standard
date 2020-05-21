package com.sinotrans.oms.eoor.model;

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

@Entity
@Table(name = "EO_TASK")
public class EoTaskModel extends BaseModel implements OperationLog {

//任务表主键
private Integer eotaId;
//订单ID
private Integer eotaEoorId;
//所属公司
private Integer eotaEscoId;
//调度计划主键
private Integer eotaEtspId;
//任务编号:所有任务
private String eotaNo;
//任务拆分状态0.未拆分
private String eotaSplitStatus;
//任务类型
private String eotaType;
//任务状态:所有任务
private String eotaStatus;
//任务顺序
private Integer eotaOrder;
//上级任务
private Integer eotaSelfId;
//SO
private String eotaSoNo;
//DO
private String eotaDoNo;
//陆运公司ID:陆运任务
private Integer eotaLandEbcuId;
//陆运公司全称：陆运任务
private String eotaLandEbcuNameCn;
//客户ID：陆运任务
private Integer eotaCustomerEbcuId;
//客户名称：陆运任务
private String eotaCustomerEbcuNameCn;
//紧急程度：陆运任务
private String eotaUrgency;
//要求提货时间：陆运任务
private Date eotaDeliveryReqTime;
//任务安排时间：陆运任务
private Date eotaTaskScheduleTime;
//要求到货时间:陆运任务
private Date eotaArrivalReqTime;
//提柜时间:陆运任务
private Date eotaMentionTime;
//运输特殊要求:陆运任务
private String eotaTransSpeReq;
//收货人收货特殊要求:陆运任务
private String eotaReceiveSpeReq;
//行车路线描述:陆运任务
private String eotaLineDesc;
//箱型:陆运任务
private String eotaContainerType;
//箱量:陆运任务
private String eotaContainerWeight;
//是否白卡:陆运任务
private String eotaIsWhiteCard;
//是否短驳:陆运任务
private String eotaIsShortBarge;
//是否包车:陆运任务
private String eotaIsChartered;
//是否可拼:陆运任务
private String eotaIsToFight;
//起运地ID:陆运任务
private Integer eotaFromEbrgId;
//起运地名称:陆运任务
private String eotaFromEbrgNameCn;
//目的地ID:陆运任务
private Integer eotaToEbrgId;
//目的地名称:陆运任务
private String eotaToEbrgNameCn;
//毛重:陆运任务
private Double eotaWeight;
//件数:陆运任务
private Integer eotaQuantity;
//体积:陆运任务
private Double eotaVolume;
//提货地址:陆运任务
private String eotaDeliveryAddress;
//收货地址:陆运任务
private String eotaReceiveAddress;
//备注:所有任务
private String eotaRemark;
//出/入库单号:出入库任务
private String eotaLibraryNo;
//出/入库时间:出入库任务
private Date eotaLibraryTime;
//出/入仓库/报关行/航空公司/船ID:出入库任务
private Integer eotaEbcuId;
//出/入仓库/报关行/航空公司/船名称:出入库任务
private String eotaEbcuNameCn;
//出/入仓数量:出入库任务
private Integer eotaLibraryNumber;
//出/入合计件数:出入库任务
private Integer eotaLibraryQuantity;
//出/入合计体积:出入库任务
private Integer eotaLibraryVolume;
//出/入合计毛重:出入库任务
private Integer eotaLibraryGw;
//出/入合计净重:出入库任务
private Integer eotaLibraryNw;
//订舱代理ID:海运任务
private Integer eotaBookingEbcuId;
//订舱代理:海运任务
private String eotaBookingEbcuNameCn;
//订舱单号:海运任务
private String eotaBookingNo;
//关单号:海运任务
private String eotaCustomNo;
//船名:海运任务
private String eotaVessel;
//航次:海运任务
private String eotaVoyage;
//开航日期:海运任务
private Date eotaDepartureDate;
//预计开航日期:海运任务
private Date eotaPlanDepartureDate;
//预计到港日期:海运任务
private Date eotaPlanArrivalDate;
//到港日期:海运任务
private Date eotaArrivalDate;
//装箱时间:海运任务
private Date eotaPackingTime;
//集港时间:海运任务
private Date eotaSetPostTime;
//截重时间:海运任务
private Date eotaWeightTime;
//截关时间:海运任务
private Date eotaCutTime;
//起运港ID:海运任务
private Integer eotaStartEbptId;
//起运港名称:海运任务
private String eotaStartEbptNameCn;
//目的港ID:海运任务
private Integer eotaEndEbptId;
//目的港名称:海运任务
private String eotaEndEbptNameCn;
//MBL:海运任务
private String eotaMblNo;
//HBL:海运任务
private String eotaHblNo;
//箱ID:海运任务
private Integer eotaEtcaId;
//箱号:海运任务
private String eotaEtcaNo;
//封号:海运任务
private String eotaTitleNo;
//报关类型:报关任务
private String eotaCustomType;
//文件编号:报关任务
private String eotaFileNo;
//文件类型:报关任务
private String eotaFileType;
//放行时间:报关任务
private Date eotaReleaseTime;
//送单时间:报关任务
private Date eotaSendTime;
//回单时间:报关任务
private Date eotaBackTime;
//报关地点:报关任务
private String eotaCustomPlace;
//口岸报关行ID:报关任务
private Integer eotaPortEbcuId;
//口岸报关行名称:报关任务
private String eotaPortEbcuNameCn;
//口岸报关地点:报关任务
private String eotaPortAddress;
//装箱地址：进出口拖车任务
private String eotaPackingAddress;
//理货日期：进出口拖车任务
private Date eotaTallyDate;
//截港日期：出口拖车任务
private Date eotaCutPostDate;
//提箱时间：进出口拖车任务
private Date eotaSuitcaseTime;
//提箱地址：进口拖车任务
private String eotaSuitcaseAddress;
//进港日期：出口拖车任务
private Date eotaInPostDate;
//上船日期：出口拖车任务
private Date eotaUpShippingDate;
//要求到达：进出口拖车任务
private Date eotaReqArrival;
//实际到达：进出口拖车任务
private Date eotaActualArrival;
//联系方式：进出口拖车任务
private String eotaContact;
//派车信息：进出口拖车任务
private String eotaSentCarInfo;
//离场时间：进出口拖车任务
private Date eotaLeaveTime;
//离场备注：进出口拖车任务
private String eotaDepartureRemark;
//包装形式：进出口拖车任务
private String eotaPackaging;
//报关预入日期：出口拖车任务
private Date eotaPreentryDate;
//查验日期:进出口拖车任务
private Date eotaPortTime;
//查验日期：进出口拖车任务
private Date eotaCheckDate;
//是否污箱：进口拖车任务
private String eotaIsSewageTank;
//执行情况:进出口拖车任务
private String eotaPerformDesc;
//修改人员:进出口拖车任务
private String eotaModifier;
//修改日期:进出口拖车任务
private Date eotaModifyTime;
//输入人员:进出口拖车任务
private String eotaCreator;
//输入日期:进出口拖车任务
private Date eotaCreateTime;
//包装备注:进出口拖车任务
private String eotaPackageRemark;
//动卫检查询:进口拖车任务
private Date eotaInspecteDate;
//动卫检查询:进口拖车任务
private String eotaCheckDesc;
//进出口：空运任务
private String eotaInOut;
//还箱地址:进口拖车任务
private String eotaReturnTankAddress;
//还箱时间:进口拖车任务
private Date eotaBackTankTime;
//计划提货日期:进口拖车任务
private Date eotaPlanDeliveryDate;
//是否落箱:进口拖车任务
private String eotaIsDropTank;
//单证收全日期：空运任务
private Date eotaCollectDate;
//报关开始日期：空运任务
private Date eotaCustomStartDate;
//换单日期：空运任务
private Date eotaChangeDate;
//取得换证凭条日期:进口拖车任务
private Date eotaObtainDate;
//进物流园时间:进口拖车任务
private Date eotaInParkTime;
//出物流园时间:进口拖车任务
private Date eotaOutParkTime;
//是否港区计划:进口拖车任务
private String eotaIsPortPlan;
//报关结束日期：空运任务
private Date eotaCustomEndDate;
//货物入库日期：空运任务
private Date eotaInWarehouseDate;
//单税签收日期：空运任务
private Date eotaFinishedDate;
//付税日期：空运任务
private Date eotaPayTaxDate;
//车次：铁路任务
private String eotaTrain;
//截止进站时间：铁路任务
private Date eotaStopStationTime;
//进站时间：铁路任务
private Date eotaStationTime;
//近期铁路检测时间：铁路任务
private Date eotaRailwayTime;
//核销单返还日期
private Date eotaReturnDate;
//车队ID：进出口拖车任务
private Integer eotaTeamEbcuId;
//车队：进出口拖车任务
private String eotaTeamEbcuNameCn;
//码头ID：进出口拖车任务
private Integer eotaTerminalEbcuId;
//码头：进出口拖车任务
private String eotaTerminalEbcuNameCn;
//提箱地：陆运任务
private String eotaSuitcase;
//还箱地：陆运任务
private String eotaCrates;
//主驾驶ID：陆运任务
private Integer eotaMainEttpId;
//挂车车牌号：陆运任务
private String eotaTrailerEtveCard;
//挂车ID：陆运任务
private Integer eotaTrailerEtveId;
//牵引车车牌号：陆运任务
private String eotaTractorEtveCard;
//牵引车ID：陆运任务
private Integer eotaTractorEtveId;
//主驾驶：陆运任务
private String eotaMainEttpName;
//副驾驶ID：陆运任务
private Integer eotaCopilorEttpId;
//副驾驶：陆运任务
private String eotaCopilorEttpName;
//集装箱ID：陆运任务
private Integer eotaLandEtcaId;
//陆运任务集装箱号：陆运任务
private String eotaLandEtcaNo;
//陆运任务封号：陆运任务
private String eotaLandTitleNo;
//司机联系方式：陆运任务
private String eotaEttpTel;
//陆运承运人：陆运任务
private Integer eotaCarrierEbcuId;
//陆运承运人名称：陆运任务
private String eotaCarrierEbcuNameCn;
//行车路线：陆运任务
private Integer eotaEblnId;
//行车路线名称：陆运任务
private String eotaEblnLineName;
//是否进入内部车辆调度池:陆运任务
private String eotaIsWithin;
//封号1
private Double eotaRateMileage;
//作废人
private String eotaVoider;
//作废时间
private Date eotaVoiderTime;
//作废原因
private String eotaVoidDesc;
//预留字段
private Double eotaSubnum1;
//预留字段
private String eotaSubstr1;
//预留字段
private String eotaSubstr2;
//预留字段
private String eotaSubstr3;
//预留字段
private String eotaSubstr4;
//预留字段
private String eotaSubstr5;
//预留字段
private String eotaSubstr6;
//预留字段
private String eotaSubstr8;
//预留字段
private String eotaSubstr7;
//预留字段
private Date eotaSubdate1;
//预留字段
private Date eotaSubdate2;
//预留字段
private Date eotaSubdate5;
//预留字段
private Date eotaSubdate4;
//预留字段
private Date eotaSubdate3;
//预留字段
private Double eotaSubnum3;
//预留字段
private Double eotaSubnum2;
//creator
private String creator;
//createTime
private Date createTime;
//modifier
private String modifier;
//modifyTime
private Date modifyTime;
//recVer
private Integer recVer;
//预计提货时间
private Date eotaDeliveryTime ;
//预计到货时间
private Date eotaArrivalTime;
//装车顺序
private String eotaLoadSeq;
//卸车顺序
private String eotaUnloadSeq;
//件数单位
private String eotaQuantityUnit;
//数量单位
private String eotaNumberUnit;
//任务所有资质名称列表
private String eotaCertificationNameList;

//净重:陆运任务
private Double eotaNetWeight;
//用于保存分组号
private Integer eotaGroupNum;

 // 牵引车资质要求
private String eotaTractorReq;
 //挂车资质要求
private String eotaTrailerReq;
 //运输人员车资质要求
private String eotaTransportReq;

 //提箱地ID
private Integer eotaSuitcaseEbrgId;
 //还箱地ID
private Integer eotaCratesEbrgId;

//调度人ID：陆运任务
private Integer eotaScheduleId;
//调度人姓名：陆运任务
private String eotaScheduleName;

//运输单号
private String eotaTransportNo;
/**
 *配箱ID
 */
private Integer eotaEoocId;

//最后执行状态'
private String eotaLastStatus;

//返场时间
private Date eotaReturnTime;

//入库任务:收货时间
private Date eotaReceiveTime;

//出库任务:备货时间
private Date eotaStockUpTime;

//入场装货开始时间
private String eotaStartLoadingTime;
//入场装货完毕时间
private String eotaFinishedLoadedTime;

//报关行ID
private Integer eotaTrailerEbcuId;
//报关行名称
private String eotaTrailerNameCn;
//费用计算状态
private String eotaCostStatus;
//费用计算结果 
private String eotaFeeResult;

private Integer eotaEtcaIdFirst;//原柜号ID：海运任务
private String eotaEtcaNoFirst;//原柜号：海运任务

private Integer eotaTransitEbptId;//转运港ID：海运任务
private String eotaTransitEbptNameCn;//转运港：海运任务
private Long eotaInnerMrId;// 增加内部委托集装箱表主键
private String eotaSymbol;//EOTA_SYMBOL HD_数据处理标志
private Date eotaBeginprocessingtime;//EOTA_BEGINPROCESSINGTIME HD_数据处理开始时间
private Date eotaLastmodifiedtime;//EOTA_LASTMODIFIEDTIME  HD_数据处理时间
private String eotaInformation;//EOTA_INFORMATION HD_数据处理信息
private String eotaCtnSize;//EOTA_CTN_SIZE 箱尺寸
private String eotaCtnStandard;//EOTA_CTN_STANDARD 箱规格

private String eotaIsCheck;//是否验车

//是否为调度指令(Y是调度指令
private String eotaIsScheduleInstruction;
//双拖键值(双拖时记住另一个任务id)
private Long eotaDoubleId;
//调度指令名称
private String eotaEbsiName;
//最新指令
private String eotaLastInstruction;
//空重状态
private String eotaEmptyStatus;
//任务描述 
private String eotaClassLineType;

//检疫地点
private String eotaQuarantineAds;
//验木包装地点
private String eotaWoodenPackagingAds;
//熏蒸地点
private String eotaFumigationAds;
//动检地点
private String eotaAnimalQuarantineAds;
//提货仓库（收货人ID）  
private Integer eotaStartEbspId;
//收货仓库（收货人ID） 
private Integer eotaEndEbspId;

//是否导入过OTMS
private String eotaIsImport;
//OTMS订单号
private String eotaOrderOtms;
//OTMS轨迹地址
private String eotaUrlOtms;


//发送邮件次数
private Integer eotaSendMailTimes;

@Column(name="EOTA_SENDMAIL_TIMES")
public Integer getEotaSendMailTimes() {
	return eotaSendMailTimes;
}

public void setEotaSendMailTimes(Integer eotaSendMailTimes) {
	this.eotaSendMailTimes = eotaSendMailTimes;
	addValidField("eotaSendMailTimes");
}

@Column(name="EOTA_IS_IMPORT")
public String getEotaIsImport() {
	return eotaIsImport;
}

public void setEotaIsImport(String eotaIsImport) {
	this.eotaIsImport = eotaIsImport;
	addValidField("eotaIsImport");
}

@Column(name = "EOTA_START_EBSP_ID")
public Integer getEotaStartEbspId() {
	return eotaStartEbspId;
}

public void setEotaStartEbspId(Integer eotaStartEbspId) {
	this.eotaStartEbspId = eotaStartEbspId;
	addValidField("eotaStartEbspId");
}

@Column(name = "EOTA_END_EBSP_ID")
public Integer getEotaEndEbspId() {
	return eotaEndEbspId;
}

public void setEotaEndEbspId(Integer eotaEndEbspId) {
	this.eotaEndEbspId = eotaEndEbspId;
	addValidField("eotaEndEbspId");
}

@Column(name = "EOTA_CLASS_LINE_TYPE")
public String getEotaClassLineType() {
	return eotaClassLineType;
}

public void setEotaClassLineType(String eotaClassLineType) {
	this.eotaClassLineType = eotaClassLineType;
	addValidField("eotaClassLineType");
}

@Column(name = "EOTA_IS_CHECK")
public String getEotaIsCheck() {
	return eotaIsCheck;
}

public void setEotaIsCheck(String eotaIsCheck) {
	this.eotaIsCheck = eotaIsCheck;
	addValidField("eotaIsCheck");
}

@Column(name = "EOTA_SYMBOL")
public String getEotaSymbol() {
	return eotaSymbol;
}

public void setEotaSymbol(String eotaSymbol) {
	this.eotaSymbol = eotaSymbol;
	addValidField("eotaSymbol");
}

@Column(name = "EOTA_BEGINPROCESSINGTIME")
public Date getEotaBeginprocessingtime() {
	return eotaBeginprocessingtime;
}

public void setEotaBeginprocessingtime(Date eotaBeginprocessingtime) {
	this.eotaBeginprocessingtime = eotaBeginprocessingtime;
	addValidField("eotaBeginprocessingtime");
}

@Column(name = "EOTA_LASTMODIFIEDTIME")
public Date getEotaLastmodifiedtime() {
	return eotaLastmodifiedtime;
}

public void setEotaLastmodifiedtime(Date eotaLastmodifiedtime) {
	this.eotaLastmodifiedtime = eotaLastmodifiedtime;
	addValidField("eotaLastmodifiedtime");
}

@Column(name = "EOTA_INFORMATION")
public String getEotaInformation() {
	return eotaInformation;
}

public void setEotaInformation(String eotaInformation) {
	this.eotaInformation = eotaInformation;
	addValidField("eotaInformation");
}

@Column(name = "EOTA_CTN_SIZE")
public String getEotaCtnSize() {
	return eotaCtnSize;
}

public void setEotaCtnSize(String eotaCtnSize) {
	this.eotaCtnSize = eotaCtnSize;
	addValidField("eotaCtnSize");
}

@Column(name = "EOTA_CTN_STANDARD")
public String getEotaCtnStandard() {
	return eotaCtnStandard;
}

public void setEotaCtnStandard(String eotaCtnStandard) {
	this.eotaCtnStandard = eotaCtnStandard;
	addValidField("eotaCtnStandard");
}

@Column(name = "EOTA_INNER_MR_ID")
public Long getEotaInnerMrId() {
	return eotaInnerMrId;
}

public void setEotaInnerMrId(Long eotaInnerMrId) {
	this.eotaInnerMrId = eotaInnerMrId;
	addValidField("eotaInnerMrId");
}

@Column(name = "EOTA_TRANSIT_EBPT_ID")
public Integer getEotaTransitEbptId() {
	return eotaTransitEbptId;
}

public void setEotaTransitEbptId(Integer eotaTransitEbptId) {
	this.eotaTransitEbptId = eotaTransitEbptId;
	addValidField("eotaTransitEbptId");
}

@Column(name = "EOTA_TRANSIT_EBPT_NAME_CN")
public String getEotaTransitEbptNameCn() {
	return eotaTransitEbptNameCn;
}

public void setEotaTransitEbptNameCn(String eotaTransitEbptNameCn) {
	this.eotaTransitEbptNameCn = eotaTransitEbptNameCn;
	addValidField("eotaTransitEbptNameCn");
}

@Column(name = "EOTA_ETCA_ID_FIRST")
public Integer getEotaEtcaIdFirst() {
	return eotaEtcaIdFirst;
}

public void setEotaEtcaIdFirst(Integer eotaEtcaIdFirst) {
	this.eotaEtcaIdFirst = eotaEtcaIdFirst;
	addValidField("eotaEtcaIdFirst");
}

@Column(name = "EOTA_ETCA_NO_FIRST")
public String getEotaEtcaNoFirst() {
	return eotaEtcaNoFirst;
}

public void setEotaEtcaNoFirst(String eotaEtcaNoFirst) {
	this.eotaEtcaNoFirst = eotaEtcaNoFirst;
	addValidField("eotaEtcaNoFirst");
}

@Column(name = "EOTA_FEE_RESULT")
public String getEotaFeeResult() {
	return eotaFeeResult;
}

public void setEotaFeeResult(String eotaFeeResult) {
	this.eotaFeeResult = eotaFeeResult;
	addValidField("eotaFeeResult");
}

@Column(name = "EOTA_TRAILER_EBCU_ID")
public Integer getEotaTrailerEbcuId() {
	return eotaTrailerEbcuId;
}

public void setEotaTrailerEbcuId(Integer eotaTrailerEbcuId) {
	this.eotaTrailerEbcuId = eotaTrailerEbcuId;
	addValidField("eotaTrailerEbcuId");
}
@Column(name = "EOTA_TRAILER_NAME_CN")
public String getEotaTrailerNameCn() {
	return eotaTrailerNameCn;
}

public void setEotaTrailerNameCn(String eotaTrailerNameCn) {
	this.eotaTrailerNameCn = eotaTrailerNameCn;
	addValidField("eotaTrailerNameCn");
}

/**
 * @return 运输单号
 */
@Column(name = "EOTA_TRANSPORT_NO")
public String getEotaTransportNo() {
	return eotaTransportNo;
}

/**
 * @param eotaTransportNo the eotaTransportNo to set
 */
public void setEotaTransportNo(String eotaTransportNo) {
	this.eotaTransportNo = eotaTransportNo;
	addValidField("eotaTransportNo");
}

/**
 * Get 任务表主键
 */
@Column(name = "EOTA_ID")
@Id @GeneratedValue(strategy=GenerationType.AUTO)
public Integer getEotaId() {
	return eotaId;
}

/**
 * Set 任务表主键
 */
public void setEotaId(Integer eotaId) {
	this.eotaId = eotaId;
	addValidField("eotaId");
}

/**
 * Get 订单ID
 */
@Column(name = "EOTA_EOOR_ID")
public Integer getEotaEoorId() {
	return eotaEoorId;
}

/**
 * Set 订单ID
 */
public void setEotaEoorId(Integer eotaEoorId) {
	this.eotaEoorId = eotaEoorId;
	addValidField("eotaEoorId");
}

/**
 * Get 所属公司
 */
@Column(name = "EOTA_ESCO_ID")
public Integer getEotaEscoId() {
	return eotaEscoId;
}

/**
 * Set 所属公司
 */
public void setEotaEscoId(Integer eotaEscoId) {
	this.eotaEscoId = eotaEscoId;
	addValidField("eotaEscoId");
}

/**
 * Get 调度计划主键
 */
@Column(name = "EOTA_ETSP_ID")
public Integer getEotaEtspId() {
	return eotaEtspId;
}

/**
 * Set 调度计划主键
 */
public void setEotaEtspId(Integer eotaEtspId) {
	this.eotaEtspId = eotaEtspId;
	addValidField("eotaEtspId");
}

/**
 * Get 任务编号:所有任务
 */
@Column(name = "EOTA_NO")
public String getEotaNo() {
	return eotaNo;
}

/**
 * Set 任务编号:所有任务
 */
public void setEotaNo(String eotaNo) {
	this.eotaNo = eotaNo;
	addValidField("eotaNo");
}

/**
 * Get 任务拆分状态0.未拆分
 * 1.拆分
 */
@Column(name = "EOTA_SPLIT_STATUS")
public String getEotaSplitStatus() {
	return eotaSplitStatus;
}

/**
 * Set 任务拆分状态0.未拆分
 * 1.拆分
 */
public void setEotaSplitStatus(String eotaSplitStatus) {
	this.eotaSplitStatus = eotaSplitStatus;
	addValidField("eotaSplitStatus");
}

/**
 * Get 任务类型
 */
@Column(name = "EOTA_TYPE")
public String getEotaType() {
	return eotaType;
}

/**
 * Set 任务类型
 */
public void setEotaType(String eotaType) {
	this.eotaType = eotaType;
	addValidField("eotaType");
}

/**
 * Get 任务状态:所有任务
 */
@Column(name = "EOTA_STATUS")
public String getEotaStatus() {
	return eotaStatus;
}

/**
 * Set 任务状态:所有任务
 */
public void setEotaStatus(String eotaStatus) {
	this.eotaStatus = eotaStatus;
	addValidField("eotaStatus");
}

/**
 * Get 任务顺序
 */
@Column(name = "EOTA_ORDER")
public Integer getEotaOrder() {
	return eotaOrder;
}

/**
 * Set 任务顺序
 */
public void setEotaOrder(Integer eotaOrder) {
	this.eotaOrder = eotaOrder;
	addValidField("eotaOrder");
}

/**
 * Get 上级任务
 */
@Column(name = "EOTA_SELF_ID")
public Integer getEotaSelfId() {
	return eotaSelfId;
}

/**
 * Set 上级任务
 */
public void setEotaSelfId(Integer eotaSelfId) {
	this.eotaSelfId = eotaSelfId;
	addValidField("eotaSelfId");
}

/**
 * Get SO
 * NO除了进口拖车
 * 出口拖车任务
 * 其他任务公用
 */
@Column(name = "EOTA_SO_NO")
public String getEotaSoNo() {
	return eotaSoNo;
}

/**
 * Set SO
 * NO除了进口拖车
 * 出口拖车任务
 * 其他任务公用
 */
public void setEotaSoNo(String eotaSoNo) {
	this.eotaSoNo = eotaSoNo;
	addValidField("eotaSoNo");
}

/**
 * Get DO
 * NO
 */
@Column(name = "EOTA_DO_NO")
public String getEotaDoNo() {
	return eotaDoNo;
}

/**
 * Set DO
 * NO
 */
public void setEotaDoNo(String eotaDoNo) {
	this.eotaDoNo = eotaDoNo;
	addValidField("eotaDoNo");
}

/**
 * Get 陆运公司ID:陆运任务
 */
@Column(name = "EOTA_LAND_EBCU_ID")
public Integer getEotaLandEbcuId() {
	return eotaLandEbcuId;
}

/**
 * Set 陆运公司ID:陆运任务
 */
public void setEotaLandEbcuId(Integer eotaLandEbcuId) {
	this.eotaLandEbcuId = eotaLandEbcuId;
	addValidField("eotaLandEbcuId");
}

/**
 * Get 陆运公司全称：陆运任务
 */
@Column(name = "EOTA_LAND_EBCU_NAME_CN")
public String getEotaLandEbcuNameCn() {
	return eotaLandEbcuNameCn;
}

/**
 * Set 陆运公司全称：陆运任务
 */
public void setEotaLandEbcuNameCn(String eotaLandEbcuNameCn) {
	this.eotaLandEbcuNameCn = eotaLandEbcuNameCn;
	addValidField("eotaLandEbcuNameCn");
}

/**
 * Get 客户ID：陆运任务
 */
@Column(name = "EOTA_CUSTOMER_EBCU_ID")
public Integer getEotaCustomerEbcuId() {
	return eotaCustomerEbcuId;
}

/**
 * Set 客户ID：陆运任务
 */
public void setEotaCustomerEbcuId(Integer eotaCustomerEbcuId) {
	this.eotaCustomerEbcuId = eotaCustomerEbcuId;
	addValidField("eotaCustomerEbcuId");
}

/**
 * Get 客户名称：陆运任务
 */
@Column(name = "EOTA_CUSTOMER_EBCU_NAME_CN")
public String getEotaCustomerEbcuNameCn() {
	return eotaCustomerEbcuNameCn;
}

/**
 * Set 客户名称：陆运任务
 */
public void setEotaCustomerEbcuNameCn(String eotaCustomerEbcuNameCn) {
	this.eotaCustomerEbcuNameCn = eotaCustomerEbcuNameCn;
	addValidField("eotaCustomerEbcuNameCn");
}

/**
 * Get 紧急程度：陆运任务
 */
@Column(name = "EOTA_URGENCY")
public String getEotaUrgency() {
	return eotaUrgency;
}

/**
 * Set 紧急程度：陆运任务
 */
public void setEotaUrgency(String eotaUrgency) {
	this.eotaUrgency = eotaUrgency;
	addValidField("eotaUrgency");
}

/**
 * Get 要求提货时间：陆运任务
 */
@Column(name = "EOTA_DELIVERY_REQ_TIME")
public Date getEotaDeliveryReqTime() {
	return eotaDeliveryReqTime;
}

/**
 * Set 要求提货时间：陆运任务
 */
public void setEotaDeliveryReqTime(Date eotaDeliveryReqTime) {
	this.eotaDeliveryReqTime = eotaDeliveryReqTime;
	addValidField("eotaDeliveryReqTime");
}

/**
 * Get 任务安排时间：陆运任务
 */
@Column(name = "EOTA_TASK_SCHEDULE_TIME")
public Date getEotaTaskScheduleTime() {
	return eotaTaskScheduleTime;
}

/**
 * Set 任务安排时间：陆运任务
 */
public void setEotaTaskScheduleTime(Date eotaTaskScheduleTime) {
	this.eotaTaskScheduleTime = eotaTaskScheduleTime;
	addValidField("eotaTaskScheduleTime");
}

/**
 * Get 要求到货时间:陆运任务
 */
@Column(name = "EOTA_ARRIVAL_REQ_TIME")
public Date getEotaArrivalReqTime() {
	return eotaArrivalReqTime;
}

/**
 * Set 要求到货时间:陆运任务
 */
public void setEotaArrivalReqTime(Date eotaArrivalReqTime) {
	this.eotaArrivalReqTime = eotaArrivalReqTime;
	addValidField("eotaArrivalReqTime");
}

/**
 * Get 提柜时间:陆运任务
 */
@Column(name = "EOTA_MENTION_TIME")
public Date getEotaMentionTime() {
	return eotaMentionTime;
}

/**
 * Set 提柜时间:陆运任务
 */
public void setEotaMentionTime(Date eotaMentionTime) {
	this.eotaMentionTime = eotaMentionTime;
	addValidField("eotaMentionTime");
}

/**
 * Get 运输特殊要求:陆运任务
 */
@Column(name = "EOTA_TRANS_SPE_REQ")
public String getEotaTransSpeReq() {
	return eotaTransSpeReq;
}

/**
 * Set 运输特殊要求:陆运任务
 */
public void setEotaTransSpeReq(String eotaTransSpeReq) {
	this.eotaTransSpeReq = eotaTransSpeReq;
	addValidField("eotaTransSpeReq");
}

/**
 * Get 收货人收货特殊要求:陆运任务
 */
@Column(name = "EOTA_RECEIVE_SPE_REQ")
public String getEotaReceiveSpeReq() {
	return eotaReceiveSpeReq;
}

/**
 * Set 收货人收货特殊要求:陆运任务
 */
public void setEotaReceiveSpeReq(String eotaReceiveSpeReq) {
	this.eotaReceiveSpeReq = eotaReceiveSpeReq;
	addValidField("eotaReceiveSpeReq");
}

/**
 * Get 行车路线描述:陆运任务
 */
@Column(name = "EOTA_LINE_DESC")
public String getEotaLineDesc() {
	return eotaLineDesc;
}

/**
 * Set 行车路线描述:陆运任务
 */
public void setEotaLineDesc(String eotaLineDesc) {
	this.eotaLineDesc = eotaLineDesc;
	addValidField("eotaLineDesc");
}

/**
 * Get 箱型:陆运任务
 * 海运任务
 * 铁路任务
 */
@Column(name = "EOTA_CONTAINER_TYPE")
public String getEotaContainerType() {
	return eotaContainerType;
}

/**
 * Set 箱型:陆运任务
 * 海运任务
 * 铁路任务
 */
public void setEotaContainerType(String eotaContainerType) {
	this.eotaContainerType = eotaContainerType;
	addValidField("eotaContainerType");
}

/**
 * Get 箱量:陆运任务
 * 海运任务
 */
@Column(name = "EOTA_CONTAINER_WEIGHT")
public String getEotaContainerWeight() {
	return eotaContainerWeight;
}

/**
 * Set 箱量:陆运任务
 * 海运任务
 */
public void setEotaContainerWeight(String eotaContainerWeight) {
	this.eotaContainerWeight = eotaContainerWeight;
	addValidField("eotaContainerWeight");
}

/**
 * Get 是否白卡:陆运任务
 */
@Column(name = "EOTA_IS_WHITE_CARD")
public String getEotaIsWhiteCard() {
	return eotaIsWhiteCard;
}

/**
 * Set 是否白卡:陆运任务
 */
public void setEotaIsWhiteCard(String eotaIsWhiteCard) {
	this.eotaIsWhiteCard = eotaIsWhiteCard;
	addValidField("eotaIsWhiteCard");
}

/**
 * Get 是否短驳:陆运任务
 */
@Column(name = "EOTA_IS_SHORT_BARGE")
public String getEotaIsShortBarge() {
	return eotaIsShortBarge;
}

/**
 * Set 是否短驳:陆运任务
 */
public void setEotaIsShortBarge(String eotaIsShortBarge) {
	this.eotaIsShortBarge = eotaIsShortBarge;
	addValidField("eotaIsShortBarge");
}

/**
 * Get 是否包车:陆运任务
 */
@Column(name = "EOTA_IS_CHARTERED")
public String getEotaIsChartered() {
	return eotaIsChartered;
}

/**
 * Set 是否包车:陆运任务
 */
public void setEotaIsChartered(String eotaIsChartered) {
	this.eotaIsChartered = eotaIsChartered;
	addValidField("eotaIsChartered");
}

/**
 * Get 是否可拼:陆运任务
 */
@Column(name = "EOTA_IS_TO_FIGHT")
public String getEotaIsToFight() {
	return eotaIsToFight;
}

/**
 * Set 是否可拼:陆运任务
 */
public void setEotaIsToFight(String eotaIsToFight) {
	this.eotaIsToFight = eotaIsToFight;
	addValidField("eotaIsToFight");
}

/**
 * Get 起运地ID:陆运任务
 */
@Column(name = "EOTA_FROM_EBRG_ID")
public Integer getEotaFromEbrgId() {
	return eotaFromEbrgId;
}

/**
 * Set 起运地ID:陆运任务
 */
public void setEotaFromEbrgId(Integer eotaFromEbrgId) {
	this.eotaFromEbrgId = eotaFromEbrgId;
	addValidField("eotaFromEbrgId");
}

/**
 * Get 起运地名称:陆运任务
 */
@Column(name = "EOTA_FROM_EBRG_NAME_CN")
public String getEotaFromEbrgNameCn() {
	return eotaFromEbrgNameCn;
}

/**
 * Set 起运地名称:陆运任务
 */
public void setEotaFromEbrgNameCn(String eotaFromEbrgNameCn) {
	this.eotaFromEbrgNameCn = eotaFromEbrgNameCn;
	addValidField("eotaFromEbrgNameCn");
}

/**
 * Get 目的地ID:陆运任务
 */
@Column(name = "EOTA_TO_EBRG_ID")
public Integer getEotaToEbrgId() {
	return eotaToEbrgId;
}

/**
 * Set 目的地ID:陆运任务
 */
public void setEotaToEbrgId(Integer eotaToEbrgId) {
	this.eotaToEbrgId = eotaToEbrgId;
	addValidField("eotaToEbrgId");
}

/**
 * Get 目的地名称:陆运任务
 */
@Column(name = "EOTA_TO_EBRG_NAME_CN")
public String getEotaToEbrgNameCn() {
	return eotaToEbrgNameCn;
}

/**
 * Set 目的地名称:陆运任务
 */
public void setEotaToEbrgNameCn(String eotaToEbrgNameCn) {
	this.eotaToEbrgNameCn = eotaToEbrgNameCn;
	addValidField("eotaToEbrgNameCn");
}

/**
 * Get 毛重:陆运任务
 * 海运任务
 * 铁路任务
 */
@Column(name = "EOTA_WEIGHT")
public Double getEotaWeight() {
	return eotaWeight;
}

/**
 * Set 毛重:陆运任务
 * 海运任务
 * 铁路任务
 */
public void setEotaWeight(Double eotaWeight) {
	this.eotaWeight = eotaWeight;
	addValidField("eotaWeight");
}

/**
 * Get 件数:陆运任务
 * 海运任务
 * 铁路任务
 */
@Column(name = "EOTA_QUANTITY")
public Integer getEotaQuantity() {
	return eotaQuantity;
}

/**
 * Set 件数:陆运任务
 * 海运任务
 * 铁路任务
 */
public void setEotaQuantity(Integer eotaQuantity) {
	this.eotaQuantity = eotaQuantity;
	addValidField("eotaQuantity");
}

/**
 * Get 体积:陆运任务
 * 海运任务
 * 铁路任务
 */
@Column(name = "EOTA_VOLUME")
public Double getEotaVolume() {
	return eotaVolume;
}

/**
 * Set 体积:陆运任务
 * 海运任务
 * 铁路任务
 */
public void setEotaVolume(Double eotaVolume) {
	this.eotaVolume = eotaVolume;
	addValidField("eotaVolume");
}

/**
 * Get 提货地址:陆运任务
 */
@Column(name = "EOTA_DELIVERY_ADDRESS")
public String getEotaDeliveryAddress() {
	return eotaDeliveryAddress;
}

/**
 * Set 提货地址:陆运任务
 */
public void setEotaDeliveryAddress(String eotaDeliveryAddress) {
	this.eotaDeliveryAddress = eotaDeliveryAddress;
	addValidField("eotaDeliveryAddress");
}

/**
 * Get 收货地址:陆运任务
 */
@Column(name = "EOTA_RECEIVE_ADDRESS")
public String getEotaReceiveAddress() {
	return eotaReceiveAddress;
}

/**
 * Set 收货地址:陆运任务
 */
public void setEotaReceiveAddress(String eotaReceiveAddress) {
	this.eotaReceiveAddress = eotaReceiveAddress;
	addValidField("eotaReceiveAddress");
}

/**
 * Get 备注:所有任务
 */
@Column(name = "EOTA_REMARK")
public String getEotaRemark() {
	return eotaRemark;
}

/**
 * Set 备注:所有任务
 */
public void setEotaRemark(String eotaRemark) {
	this.eotaRemark = eotaRemark;
	addValidField("eotaRemark");
}

/**
 * Get 出/入库单号:出入库任务
 */
@Column(name = "EOTA_LIBRARY_NO")
public String getEotaLibraryNo() {
	return eotaLibraryNo;
}

/**
 * Set 出/入库单号:出入库任务
 */
public void setEotaLibraryNo(String eotaLibraryNo) {
	this.eotaLibraryNo = eotaLibraryNo;
	addValidField("eotaLibraryNo");
}

/**
 * Get 出/入库时间:出入库任务
 */
@Column(name = "EOTA_LIBRARY_TIME")
public Date getEotaLibraryTime() {
	return eotaLibraryTime;
}

/**
 * Set 出/入库时间:出入库任务
 */
public void setEotaLibraryTime(Date eotaLibraryTime) {
	this.eotaLibraryTime = eotaLibraryTime;
	addValidField("eotaLibraryTime");
}

/**
 * Get 出/入仓库/报关行/航空公司/船ID:出入库任务
 * 报关任务
 * 海运任务
 * 空运任务
 */
@Column(name = "EOTA_EBCU_ID")
public Integer getEotaEbcuId() {
	return eotaEbcuId;
}

/**
 * Set 出/入仓库/报关行/航空公司/船ID:出入库任务
 * 报关任务
 * 海运任务
 * 空运任务
 */
public void setEotaEbcuId(Integer eotaEbcuId) {
	this.eotaEbcuId = eotaEbcuId;
	addValidField("eotaEbcuId");
}

/**
 * Get 出/入仓库/报关行/航空公司/船名称:出入库任务
 * 报关任务
 * 海运任务
 * 空运任务
 */
@Column(name = "EOTA_EBCU_NAME_CN")
public String getEotaEbcuNameCn() {
	return eotaEbcuNameCn;
}

/**
 * Set 出/入仓库/报关行/航空公司/船名称:出入库任务
 * 报关任务
 * 海运任务
 * 空运任务
 */
public void setEotaEbcuNameCn(String eotaEbcuNameCn) {
	this.eotaEbcuNameCn = eotaEbcuNameCn;
	addValidField("eotaEbcuNameCn");
}

/**
 * Get 出/入仓数量:出入库任务
 */
@Column(name = "EOTA_LIBRARY_NUMBER")
public Integer getEotaLibraryNumber() {
	return eotaLibraryNumber;
}

/**
 * Set 出/入仓数量:出入库任务
 */
public void setEotaLibraryNumber(Integer eotaLibraryNumber) {
	this.eotaLibraryNumber = eotaLibraryNumber;
	addValidField("eotaLibraryNumber");
}

/**
 * Get 出/入合计件数:出入库任务
 */
@Column(name = "EOTA_LIBRARY_QUANTITY")
public Integer getEotaLibraryQuantity() {
	return eotaLibraryQuantity;
}

/**
 * Set 出/入合计件数:出入库任务
 */
public void setEotaLibraryQuantity(Integer eotaLibraryQuantity) {
	this.eotaLibraryQuantity = eotaLibraryQuantity;
	addValidField("eotaLibraryQuantity");
}

/**
 * Get 出/入合计体积:出入库任务
 */
@Column(name = "EOTA_LIBRARY_VOLUME")
public Integer getEotaLibraryVolume() {
	return eotaLibraryVolume;
}

/**
 * Set 出/入合计体积:出入库任务
 */
public void setEotaLibraryVolume(Integer eotaLibraryVolume) {
	this.eotaLibraryVolume = eotaLibraryVolume;
	addValidField("eotaLibraryVolume");
}

/**
 * Get 出/入合计毛重:出入库任务
 */
@Column(name = "EOTA_LIBRARY_GW")
public Integer getEotaLibraryGw() {
	return eotaLibraryGw;
}

/**
 * Set 出/入合计毛重:出入库任务
 */
public void setEotaLibraryGw(Integer eotaLibraryGw) {
	this.eotaLibraryGw = eotaLibraryGw;
	addValidField("eotaLibraryGw");
}

/**
 * Get 出/入合计净重:出入库任务
 */
@Column(name = "EOTA_LIBRARY_NW")
public Integer getEotaLibraryNw() {
	return eotaLibraryNw;
}

/**
 * Set 出/入合计净重:出入库任务
 */
public void setEotaLibraryNw(Integer eotaLibraryNw) {
	this.eotaLibraryNw = eotaLibraryNw;
	addValidField("eotaLibraryNw");
}

/**
 * Get 订舱代理ID:海运任务
 * 铁路任务
 * 海运任务
 */
@Column(name = "EOTA_BOOKING_EBCU_ID")
public Integer getEotaBookingEbcuId() {
	return eotaBookingEbcuId;
}

/**
 * Set 订舱代理ID:海运任务
 * 铁路任务
 * 海运任务
 */
public void setEotaBookingEbcuId(Integer eotaBookingEbcuId) {
	this.eotaBookingEbcuId = eotaBookingEbcuId;
	addValidField("eotaBookingEbcuId");
}

/**
 * Get 订舱代理:海运任务
 * 铁路任务
 * 海运任务
 */
@Column(name = "EOTA_BOOKING_EBCU_NAME_CN")
public String getEotaBookingEbcuNameCn() {
	return eotaBookingEbcuNameCn;
}

/**
 * Set 订舱代理:海运任务
 * 铁路任务
 * 海运任务
 */
public void setEotaBookingEbcuNameCn(String eotaBookingEbcuNameCn) {
	this.eotaBookingEbcuNameCn = eotaBookingEbcuNameCn;
	addValidField("eotaBookingEbcuNameCn");
}

/**
 * Get 订舱单号:海运任务
 * 空运任务
 */
@Column(name = "EOTA_BOOKING_NO")
public String getEotaBookingNo() {
	return eotaBookingNo;
}

/**
 * Set 订舱单号:海运任务
 * 空运任务
 */
public void setEotaBookingNo(String eotaBookingNo) {
	this.eotaBookingNo = eotaBookingNo;
	addValidField("eotaBookingNo");
}

/**
 * Get 关单号:海运任务
 */
@Column(name = "EOTA_CUSTOM_NO")
public String getEotaCustomNo() {
	return eotaCustomNo;
}

/**
 * Set 关单号:海运任务
 */
public void setEotaCustomNo(String eotaCustomNo) {
	this.eotaCustomNo = eotaCustomNo;
	addValidField("eotaCustomNo");
}

/**
 * Get 船名:海运任务
 * 出口拖车任务
 */
@Column(name = "EOTA_VESSEL")
public String getEotaVessel() {
	return eotaVessel;
}

/**
 * Set 船名:海运任务
 * 出口拖车任务
 */
public void setEotaVessel(String eotaVessel) {
	this.eotaVessel = eotaVessel;
	addValidField("eotaVessel");
}

/**
 * Get 航次:海运任务
 * 出口拖车任务
 * 空运任务
 */
@Column(name = "EOTA_VOYAGE")
public String getEotaVoyage() {
	return eotaVoyage;
}

/**
 * Set 航次:海运任务
 * 出口拖车任务
 * 空运任务
 */
public void setEotaVoyage(String eotaVoyage) {
	this.eotaVoyage = eotaVoyage;
	addValidField("eotaVoyage");
}

/**
 * Get 开航日期:海运任务
 * 出口拖车任务
 * 铁路任务
 * 空运任务
 */
@Column(name = "EOTA_DEPARTURE_DATE")
public Date getEotaDepartureDate() {
	return eotaDepartureDate;
}

/**
 * Set 开航日期:海运任务
 * 出口拖车任务
 * 铁路任务
 * 空运任务
 */
public void setEotaDepartureDate(Date eotaDepartureDate) {
	this.eotaDepartureDate = eotaDepartureDate;
	addValidField("eotaDepartureDate");
}

/**
 * Get 预计开航日期:海运任务
 * 铁路任务
 * 空运任务
 */
@Column(name = "EOTA_PLAN_DEPARTURE_DATE")
public Date getEotaPlanDepartureDate() {
	return eotaPlanDepartureDate;
}

/**
 * Set 预计开航日期:海运任务
 * 铁路任务
 * 空运任务
 */
public void setEotaPlanDepartureDate(Date eotaPlanDepartureDate) {
	this.eotaPlanDepartureDate = eotaPlanDepartureDate;
	addValidField("eotaPlanDepartureDate");
}

/**
 * Get 预计到港日期:海运任务
 * 铁路任务
 * 空运任务
 */
@Column(name = "EOTA_PLAN_ARRIVAL_DATE")
public Date getEotaPlanArrivalDate() {
	return eotaPlanArrivalDate;
}

/**
 * Set 预计到港日期:海运任务
 * 铁路任务
 * 空运任务
 */
public void setEotaPlanArrivalDate(Date eotaPlanArrivalDate) {
	this.eotaPlanArrivalDate = eotaPlanArrivalDate;
	addValidField("eotaPlanArrivalDate");
}

/**
 * Get 到港日期:海运任务
 * 铁路任务
 * 空运任务
 */
@Column(name = "EOTA_ARRIVAL_DATE")
public Date getEotaArrivalDate() {
	return eotaArrivalDate;
}

/**
 * Set 到港日期:海运任务
 * 铁路任务
 * 空运任务
 */
public void setEotaArrivalDate(Date eotaArrivalDate) {
	this.eotaArrivalDate = eotaArrivalDate;
	addValidField("eotaArrivalDate");
}

/**
 * Get 装箱时间:海运任务
 * 进口拖车任务
 */
@Column(name = "EOTA_PACKING_TIME")
public Date getEotaPackingTime() {
	return eotaPackingTime;
}

/**
 * Set 装箱时间:海运任务
 * 进口拖车任务
 */
public void setEotaPackingTime(Date eotaPackingTime) {
	this.eotaPackingTime = eotaPackingTime;
	addValidField("eotaPackingTime");
}

/**
 * Get 集港时间:海运任务
 */
@Column(name = "EOTA_SET_POST_TIME")
public Date getEotaSetPostTime() {
	return eotaSetPostTime;
}

/**
 * Set 集港时间:海运任务
 */
public void setEotaSetPostTime(Date eotaSetPostTime) {
	this.eotaSetPostTime = eotaSetPostTime;
	addValidField("eotaSetPostTime");
}

/**
 * Get 截重时间:海运任务
 */
@Column(name = "EOTA_WEIGHT_TIME")
public Date getEotaWeightTime() {
	return eotaWeightTime;
}

/**
 * Set 截重时间:海运任务
 */
public void setEotaWeightTime(Date eotaWeightTime) {
	this.eotaWeightTime = eotaWeightTime;
	addValidField("eotaWeightTime");
}

/**
 * Get 截关时间:海运任务
 */
@Column(name = "EOTA_CUT_TIME")
public Date getEotaCutTime() {
	return eotaCutTime;
}

/**
 * Set 截关时间:海运任务
 */
public void setEotaCutTime(Date eotaCutTime) {
	this.eotaCutTime = eotaCutTime;
	addValidField("eotaCutTime");
}

/**
 * Get 起运港ID:海运任务
 * 空运任务
 */
@Column(name = "EOTA_START_EBPT_ID")
public Integer getEotaStartEbptId() {
	return eotaStartEbptId;
}

/**
 * Set 起运港ID:海运任务
 * 空运任务
 */
public void setEotaStartEbptId(Integer eotaStartEbptId) {
	this.eotaStartEbptId = eotaStartEbptId;
	addValidField("eotaStartEbptId");
}

/**
 * Get 起运港名称:海运任务
 * 空运任务
 */
@Column(name = "EOTA_START_EBPT_NAME_CN")
public String getEotaStartEbptNameCn() {
	return eotaStartEbptNameCn;
}

/**
 * Set 起运港名称:海运任务
 * 空运任务
 */
public void setEotaStartEbptNameCn(String eotaStartEbptNameCn) {
	this.eotaStartEbptNameCn = eotaStartEbptNameCn;
	addValidField("eotaStartEbptNameCn");
}

/**
 * Get 目的港ID:海运任务
 * 空运任务
 */
@Column(name = "EOTA_END_EBPT_ID")
public Integer getEotaEndEbptId() {
	return eotaEndEbptId;
}

/**
 * Set 目的港ID:海运任务
 * 空运任务
 */
public void setEotaEndEbptId(Integer eotaEndEbptId) {
	this.eotaEndEbptId = eotaEndEbptId;
	addValidField("eotaEndEbptId");
}

/**
 * Get 目的港名称:海运任务
 * 空运任务
 */
@Column(name = "EOTA_END_EBPT_NAME_CN")
public String getEotaEndEbptNameCn() {
	return eotaEndEbptNameCn;
}

/**
 * Set 目的港名称:海运任务
 * 空运任务
 */
public void setEotaEndEbptNameCn(String eotaEndEbptNameCn) {
	this.eotaEndEbptNameCn = eotaEndEbptNameCn;
	addValidField("eotaEndEbptNameCn");
}

/**
 * Get MBL:海运任务
 */
@Column(name = "EOTA_MBL_NO")
public String getEotaMblNo() {
	return eotaMblNo;
}

/**
 * Set MBL:海运任务
 */
public void setEotaMblNo(String eotaMblNo) {
	this.eotaMblNo = eotaMblNo;
	addValidField("eotaMblNo");
}

/**
 * Get HBL:海运任务
 */
@Column(name = "EOTA_HBL_NO")
public String getEotaHblNo() {
	return eotaHblNo;
}

/**
 * Set HBL:海运任务
 */
public void setEotaHblNo(String eotaHblNo) {
	this.eotaHblNo = eotaHblNo;
	addValidField("eotaHblNo");
}

/**
 * Get 箱ID:海运任务
 */
@Column(name = "EOTA_ETCA_ID")
public Integer getEotaEtcaId() {
	return eotaEtcaId;
}

/**
 * Set 箱ID:海运任务
 */
public void setEotaEtcaId(Integer eotaEtcaId) {
	this.eotaEtcaId = eotaEtcaId;
	addValidField("eotaEtcaId");
}

/**
 * Get 箱号:海运任务
 * 出口拖车任务
 */
@Column(name = "EOTA_ETCA_NO")
public String getEotaEtcaNo() {
	return eotaEtcaNo;
}

/**
 * Set 箱号:海运任务
 * 出口拖车任务
 */
public void setEotaEtcaNo(String eotaEtcaNo) {
	this.eotaEtcaNo = eotaEtcaNo;
	addValidField("eotaEtcaNo");
}

/**
 * Get 封号:海运任务
 * 出口拖车任务
 */
@Column(name = "EOTA_TITLE_NO")
public String getEotaTitleNo() {
	return eotaTitleNo;
}

/**
 * Set 封号:海运任务
 * 出口拖车任务
 */
public void setEotaTitleNo(String eotaTitleNo) {
	this.eotaTitleNo = eotaTitleNo;
	addValidField("eotaTitleNo");
}

/**
 * Get 报关类型:报关任务
 */
@Column(name = "EOTA_CUSTOM_TYPE")
public String getEotaCustomType() {
	return eotaCustomType;
}

/**
 * Set 报关类型:报关任务
 */
public void setEotaCustomType(String eotaCustomType) {
	this.eotaCustomType = eotaCustomType;
	addValidField("eotaCustomType");
}

/**
 * Get 文件编号:报关任务
 */
@Column(name = "EOTA_FILE_NO")
public String getEotaFileNo() {
	return eotaFileNo;
}

/**
 * Set 文件编号:报关任务
 */
public void setEotaFileNo(String eotaFileNo) {
	this.eotaFileNo = eotaFileNo;
	addValidField("eotaFileNo");
}

/**
 * Get 文件类型:报关任务
 */
@Column(name = "EOTA_FILE_TYPE")
public String getEotaFileType() {
	return eotaFileType;
}

/**
 * Set 文件类型:报关任务
 */
public void setEotaFileType(String eotaFileType) {
	this.eotaFileType = eotaFileType;
	addValidField("eotaFileType");
}

/**
 * Get 放行时间:报关任务
 * 出口拖车任务
 */
@Column(name = "EOTA_RELEASE_TIME")
public Date getEotaReleaseTime() {
	return eotaReleaseTime;
}

/**
 * Set 放行时间:报关任务
 * 出口拖车任务
 */
public void setEotaReleaseTime(Date eotaReleaseTime) {
	this.eotaReleaseTime = eotaReleaseTime;
	addValidField("eotaReleaseTime");
}

/**
 * Get 送单时间:报关任务
 */
@Column(name = "EOTA_SEND_TIME")
public Date getEotaSendTime() {
	return eotaSendTime;
}

/**
 * Set 送单时间:报关任务
 */
public void setEotaSendTime(Date eotaSendTime) {
	this.eotaSendTime = eotaSendTime;
	addValidField("eotaSendTime");
}

/**
 * Get 回单时间:报关任务
 */
@Column(name = "EOTA_BACK_TIME")
public Date getEotaBackTime() {
	return eotaBackTime;
}

/**
 * Set 回单时间:报关任务
 */
public void setEotaBackTime(Date eotaBackTime) {
	this.eotaBackTime = eotaBackTime;
	addValidField("eotaBackTime");
}

/**
 * Get 报关地点:报关任务
 */
@Column(name = "EOTA_CUSTOM_PLACE")
public String getEotaCustomPlace() {
	return eotaCustomPlace;
}

/**
 * Set 报关地点:报关任务
 */
public void setEotaCustomPlace(String eotaCustomPlace) {
	this.eotaCustomPlace = eotaCustomPlace;
	addValidField("eotaCustomPlace");
}

/**
 * Get 口岸报关行ID:报关任务
 * 进口拖车任务
 */
@Column(name = "EOTA_PORT_EBCU_ID")
public Integer getEotaPortEbcuId() {
	return eotaPortEbcuId;
}

/**
 * Set 口岸报关行ID:报关任务
 * 进口拖车任务
 */
public void setEotaPortEbcuId(Integer eotaPortEbcuId) {
	this.eotaPortEbcuId = eotaPortEbcuId;
	addValidField("eotaPortEbcuId");
}

/**
 * Get 口岸报关行名称:报关任务
 * 进口拖车任务
 */
@Column(name = "EOTA_PORT_EBCU_NAME_CN")
public String getEotaPortEbcuNameCn() {
	return eotaPortEbcuNameCn;
}

/**
 * Set 口岸报关行名称:报关任务
 * 进口拖车任务
 */
public void setEotaPortEbcuNameCn(String eotaPortEbcuNameCn) {
	this.eotaPortEbcuNameCn = eotaPortEbcuNameCn;
	addValidField("eotaPortEbcuNameCn");
}

/**
 * Get 口岸报关地点:报关任务
 */
@Column(name = "EOTA_PORT_ADDRESS")
public String getEotaPortAddress() {
	return eotaPortAddress;
}

/**
 * Set 口岸报关地点:报关任务
 */
public void setEotaPortAddress(String eotaPortAddress) {
	this.eotaPortAddress = eotaPortAddress;
	addValidField("eotaPortAddress");
}

/**
 * Get 装箱地址：进出口拖车任务
 */
@Column(name = "EOTA_PACKING_ADDRESS")
public String getEotaPackingAddress() {
	return eotaPackingAddress;
}

/**
 * Set 装箱地址：进出口拖车任务
 */
public void setEotaPackingAddress(String eotaPackingAddress) {
	this.eotaPackingAddress = eotaPackingAddress;
	addValidField("eotaPackingAddress");
}

/**
 * Get 理货日期：进出口拖车任务
 */
@Column(name = "EOTA_TALLY_DATE")
public Date getEotaTallyDate() {
	return eotaTallyDate;
}

/**
 * Set 理货日期：进出口拖车任务
 */
public void setEotaTallyDate(Date eotaTallyDate) {
	this.eotaTallyDate = eotaTallyDate;
	addValidField("eotaTallyDate");
}

/**
 * Get 截港日期：出口拖车任务
 */
@Column(name = "EOTA_CUT_POST_DATE")
public Date getEotaCutPostDate() {
	return eotaCutPostDate;
}

/**
 * Set 截港日期：出口拖车任务
 */
public void setEotaCutPostDate(Date eotaCutPostDate) {
	this.eotaCutPostDate = eotaCutPostDate;
	addValidField("eotaCutPostDate");
}

/**
 * Get 提箱时间：进出口拖车任务
 */
@Column(name = "EOTA_SUITCASE_TIME")
public Date getEotaSuitcaseTime() {
	return eotaSuitcaseTime;
}

/**
 * Set 提箱时间：进出口拖车任务
 */
public void setEotaSuitcaseTime(Date eotaSuitcaseTime) {
	this.eotaSuitcaseTime = eotaSuitcaseTime;
	addValidField("eotaSuitcaseTime");
}

/**
 * Get 提箱地址：进口拖车任务
 */
@Column(name = "EOTA_SUITCASE_ADDRESS")
public String getEotaSuitcaseAddress() {
	return eotaSuitcaseAddress;
}

/**
 * Set 提箱地址：进口拖车任务
 */
public void setEotaSuitcaseAddress(String eotaSuitcaseAddress) {
	this.eotaSuitcaseAddress = eotaSuitcaseAddress;
	addValidField("eotaSuitcaseAddress");
}

/**
 * Get 进港日期：出口拖车任务
 */
@Column(name = "EOTA_IN_POST_DATE")
public Date getEotaInPostDate() {
	return eotaInPostDate;
}

/**
 * Set 进港日期：出口拖车任务
 */
public void setEotaInPostDate(Date eotaInPostDate) {
	this.eotaInPostDate = eotaInPostDate;
	addValidField("eotaInPostDate");
}

/**
 * Get 上船日期：出口拖车任务
 */
@Column(name = "EOTA_UP_SHIPPING_DATE")
public Date getEotaUpShippingDate() {
	return eotaUpShippingDate;
}

/**
 * Set 上船日期：出口拖车任务
 */
public void setEotaUpShippingDate(Date eotaUpShippingDate) {
	this.eotaUpShippingDate = eotaUpShippingDate;
	addValidField("eotaUpShippingDate");
}

/**
 * Get 要求到达：进出口拖车任务
 */
@Column(name = "EOTA_REQ_ARRIVAL")
public Date getEotaReqArrival() {
	return eotaReqArrival;
}

/**
 * Set 要求到达：进出口拖车任务
 */
public void setEotaReqArrival(Date eotaReqArrival) {
	this.eotaReqArrival = eotaReqArrival;
	addValidField("eotaReqArrival");
}

/**
 * Get 实际到达：进出口拖车任务
 */
@Column(name = "EOTA_ACTUAL_ARRIVAL")
public Date getEotaActualArrival() {
	return eotaActualArrival;
}

/**
 * Set 实际到达：进出口拖车任务
 */
public void setEotaActualArrival(Date eotaActualArrival) {
	this.eotaActualArrival = eotaActualArrival;
	addValidField("eotaActualArrival");
}

/**
 * Get 联系方式：进出口拖车任务
 */
@Column(name = "EOTA_CONTACT")
public String getEotaContact() {
	return eotaContact;
}

/**
 * Set 联系方式：进出口拖车任务
 */
public void setEotaContact(String eotaContact) {
	this.eotaContact = eotaContact;
	addValidField("eotaContact");
}

/**
 * Get 派车信息：进出口拖车任务
 */
@Column(name = "EOTA_SENT_CAR_INFO")
public String getEotaSentCarInfo() {
	return eotaSentCarInfo;
}

/**
 * Set 派车信息：进出口拖车任务
 */
public void setEotaSentCarInfo(String eotaSentCarInfo) {
	this.eotaSentCarInfo = eotaSentCarInfo;
	addValidField("eotaSentCarInfo");
}

/**
 * Get 离场时间：进出口拖车任务
 */
@Column(name = "EOTA_LEAVE_TIME")
public Date getEotaLeaveTime() {
	return eotaLeaveTime;
}

/**
 * Set 离场时间：进出口拖车任务
 */
public void setEotaLeaveTime(Date eotaLeaveTime) {
	this.eotaLeaveTime = eotaLeaveTime;
	addValidField("eotaLeaveTime");
}

/**
 * Get 离场备注：进出口拖车任务
 */
@Column(name = "EOTA_DEPARTURE_REMARK")
public String getEotaDepartureRemark() {
	return eotaDepartureRemark;
}

/**
 * Set 离场备注：进出口拖车任务
 */
public void setEotaDepartureRemark(String eotaDepartureRemark) {
	this.eotaDepartureRemark = eotaDepartureRemark;
	addValidField("eotaDepartureRemark");
}

/**
 * Get 包装形式：进出口拖车任务
 */
@Column(name = "EOTA_PACKAGING")
public String getEotaPackaging() {
	return eotaPackaging;
}

/**
 * Set 包装形式：进出口拖车任务
 */
public void setEotaPackaging(String eotaPackaging) {
	this.eotaPackaging = eotaPackaging;
	addValidField("eotaPackaging");
}

/**
 * Get 报关预入日期：出口拖车任务
 */
@Column(name = "EOTA_PREENTRY_DATE")
public Date getEotaPreentryDate() {
	return eotaPreentryDate;
}

/**
 * Set 报关预入日期：出口拖车任务
 */
public void setEotaPreentryDate(Date eotaPreentryDate) {
	this.eotaPreentryDate = eotaPreentryDate;
	addValidField("eotaPreentryDate");
}

/**
 * Get 查验日期:进出口拖车任务
 */
@Column(name = "EOTA_PORT_TIME")
public Date getEotaPortTime() {
	return eotaPortTime;
}

/**
 * Set 查验日期:进出口拖车任务
 */
public void setEotaPortTime(Date eotaPortTime) {
	this.eotaPortTime = eotaPortTime;
	addValidField("eotaPortTime");
}

/**
 * Get 查验日期：进出口拖车任务
 */
@Column(name = "EOTA_CHECK_DATE")
public Date getEotaCheckDate() {
	return eotaCheckDate;
}

/**
 * Set 查验日期：进出口拖车任务
 */
public void setEotaCheckDate(Date eotaCheckDate) {
	this.eotaCheckDate = eotaCheckDate;
	addValidField("eotaCheckDate");
}

/**
 * Get 是否污箱：进口拖车任务
 */
@Column(name = "EOTA_IS_SEWAGE_TANK")
public String getEotaIsSewageTank() {
	return eotaIsSewageTank;
}

/**
 * Set 是否污箱：进口拖车任务
 */
public void setEotaIsSewageTank(String eotaIsSewageTank) {
	this.eotaIsSewageTank = eotaIsSewageTank;
	addValidField("eotaIsSewageTank");
}

/**
 * Get 执行情况:进出口拖车任务
 */
@Column(name = "EOTA_PERFORM_DESC")
public String getEotaPerformDesc() {
	return eotaPerformDesc;
}

/**
 * Set 执行情况:进出口拖车任务
 */
public void setEotaPerformDesc(String eotaPerformDesc) {
	this.eotaPerformDesc = eotaPerformDesc;
	addValidField("eotaPerformDesc");
}

/**
 * Get 修改人员:进出口拖车任务
 */
@Column(name = "EOTA_MODIFIER")
public String getEotaModifier() {
	return eotaModifier;
}

/**
 * Set 修改人员:进出口拖车任务
 */
public void setEotaModifier(String eotaModifier) {
	this.eotaModifier = eotaModifier;
	addValidField("eotaModifier");
}

/**
 * Get 修改日期:进出口拖车任务
 */
@Column(name = "EOTA_MODIFY_TIME")
public Date getEotaModifyTime() {
	return eotaModifyTime;
}

/**
 * Set 修改日期:进出口拖车任务
 */
public void setEotaModifyTime(Date eotaModifyTime) {
	this.eotaModifyTime = eotaModifyTime;
	addValidField("eotaModifyTime");
}

/**
 * Get 输入人员:进出口拖车任务
 */
@Column(name = "EOTA_CREATOR")
public String getEotaCreator() {
	return eotaCreator;
}

/**
 * Set 输入人员:进出口拖车任务
 */
public void setEotaCreator(String eotaCreator) {
	this.eotaCreator = eotaCreator;
	addValidField("eotaCreator");
}

/**
 * Get 输入日期:进出口拖车任务
 */
@Column(name = "EOTA_CREATE_TIME")
public Date getEotaCreateTime() {
	return eotaCreateTime;
}

/**
 * Set 输入日期:进出口拖车任务
 */
public void setEotaCreateTime(Date eotaCreateTime) {
	this.eotaCreateTime = eotaCreateTime;
	addValidField("eotaCreateTime");
}

/**
 * Get 包装备注:进出口拖车任务
 */
@Column(name = "EOTA_PACKAGE_REMARK")
public String getEotaPackageRemark() {
	return eotaPackageRemark;
}

/**
 * Set 包装备注:进出口拖车任务
 */
public void setEotaPackageRemark(String eotaPackageRemark) {
	this.eotaPackageRemark = eotaPackageRemark;
	addValidField("eotaPackageRemark");
}

/**
 * Get 动卫检查询:进口拖车任务
 */
@Column(name = "EOTA_INSPECTE_DATE")
public Date getEotaInspecteDate() {
	return eotaInspecteDate;
}

/**
 * Set 动卫检查询:进口拖车任务
 */
public void setEotaInspecteDate(Date eotaInspecteDate) {
	this.eotaInspecteDate = eotaInspecteDate;
	addValidField("eotaInspecteDate");
}

/**
 * Get 动卫检查询:进口拖车任务
 */
@Column(name = "EOTA_CHECK_DESC")
public String getEotaCheckDesc() {
	return eotaCheckDesc;
}

/**
 * Set 动卫检查询:进口拖车任务
 */
public void setEotaCheckDesc(String eotaCheckDesc) {
	this.eotaCheckDesc = eotaCheckDesc;
	addValidField("eotaCheckDesc");
}

/**
 * Get 进出口：空运任务
 */
@Column(name = "EOTA_IN_OUT")
public String getEotaInOut() {
	return eotaInOut;
}

/**
 * Set 进出口：空运任务
 */
public void setEotaInOut(String eotaInOut) {
	this.eotaInOut = eotaInOut;
	addValidField("eotaInOut");
}

/**
 * Get 还箱地址:进口拖车任务
 */
@Column(name = "EOTA_RETURN_TANK_ADDRESS")
public String getEotaReturnTankAddress() {
	return eotaReturnTankAddress;
}

/**
 * Set 还箱地址:进口拖车任务
 */
public void setEotaReturnTankAddress(String eotaReturnTankAddress) {
	this.eotaReturnTankAddress = eotaReturnTankAddress;
	addValidField("eotaReturnTankAddress");
}

/**
 * Get 还箱时间:进口拖车任务
 */
@Column(name = "EOTA_BACK_TANK_TIME")
public Date getEotaBackTankTime() {
	return eotaBackTankTime;
}

/**
 * Set 还箱时间:进口拖车任务
 */
public void setEotaBackTankTime(Date eotaBackTankTime) {
	this.eotaBackTankTime = eotaBackTankTime;
	addValidField("eotaBackTankTime");
}

/**
 * Get 计划提货日期:进口拖车任务
 */
@Column(name = "EOTA_PLAN_DELIVERY_DATE")
public Date getEotaPlanDeliveryDate() {
	return eotaPlanDeliveryDate;
}

/**
 * Set 计划提货日期:进口拖车任务
 */
public void setEotaPlanDeliveryDate(Date eotaPlanDeliveryDate) {
	this.eotaPlanDeliveryDate = eotaPlanDeliveryDate;
	addValidField("eotaPlanDeliveryDate");
}

/**
 * Get 是否落箱:进口拖车任务
 */
@Column(name = "EOTA_IS_DROP_TANK")
public String getEotaIsDropTank() {
	return eotaIsDropTank;
}

/**
 * Set 是否落箱:进口拖车任务
 */
public void setEotaIsDropTank(String eotaIsDropTank) {
	this.eotaIsDropTank = eotaIsDropTank;
	addValidField("eotaIsDropTank");
}

/**
 * Get 单证收全日期：空运任务
 */
@Column(name = "EOTA_COLLECT_DATE")
public Date getEotaCollectDate() {
	return eotaCollectDate;
}

/**
 * Set 单证收全日期：空运任务
 */
public void setEotaCollectDate(Date eotaCollectDate) {
	this.eotaCollectDate = eotaCollectDate;
	addValidField("eotaCollectDate");
}

/**
 * Get 报关开始日期：空运任务
 */
@Column(name = "EOTA_CUSTOM_START_DATE")
public Date getEotaCustomStartDate() {
	return eotaCustomStartDate;
}

/**
 * Set 报关开始日期：空运任务
 */
public void setEotaCustomStartDate(Date eotaCustomStartDate) {
	this.eotaCustomStartDate = eotaCustomStartDate;
	addValidField("eotaCustomStartDate");
}

/**
 * Get 换单日期：空运任务
 */
@Column(name = "EOTA_CHANGE_DATE")
public Date getEotaChangeDate() {
	return eotaChangeDate;
}

/**
 * Set 换单日期：空运任务
 */
public void setEotaChangeDate(Date eotaChangeDate) {
	this.eotaChangeDate = eotaChangeDate;
	addValidField("eotaChangeDate");
}

/**
 * Get 取得换证凭条日期:进口拖车任务
 */
@Column(name = "EOTA_OBTAIN_DATE")
public Date getEotaObtainDate() {
	return eotaObtainDate;
}

/**
 * Set 取得换证凭条日期:进口拖车任务
 */
public void setEotaObtainDate(Date eotaObtainDate) {
	this.eotaObtainDate = eotaObtainDate;
	addValidField("eotaObtainDate");
}

/**
 * Get 进物流园时间:进口拖车任务
 */
@Column(name = "EOTA_IN_PARK_TIME")
public Date getEotaInParkTime() {
	return eotaInParkTime;
}

/**
 * Set 进物流园时间:进口拖车任务
 */
public void setEotaInParkTime(Date eotaInParkTime) {
	this.eotaInParkTime = eotaInParkTime;
	addValidField("eotaInParkTime");
}

/**
 * Get 出物流园时间:进口拖车任务
 */
@Column(name = "EOTA_OUT_PARK_TIME")
public Date getEotaOutParkTime() {
	return eotaOutParkTime;
}

/**
 * Set 出物流园时间:进口拖车任务
 */
public void setEotaOutParkTime(Date eotaOutParkTime) {
	this.eotaOutParkTime = eotaOutParkTime;
	addValidField("eotaOutParkTime");
}

/**
 * Get 是否港区计划:进口拖车任务
 */
@Column(name = "EOTA_IS_PORT_PLAN")
public String getEotaIsPortPlan() {
	return eotaIsPortPlan;
}

/**
 * Set 是否港区计划:进口拖车任务
 */
public void setEotaIsPortPlan(String eotaIsPortPlan) {
	this.eotaIsPortPlan = eotaIsPortPlan;
	addValidField("eotaIsPortPlan");
}

/**
 * Get 报关结束日期：空运任务
 */
@Column(name = "EOTA_CUSTOM_END_DATE")
public Date getEotaCustomEndDate() {
	return eotaCustomEndDate;
}

/**
 * Set 报关结束日期：空运任务
 */
public void setEotaCustomEndDate(Date eotaCustomEndDate) {
	this.eotaCustomEndDate = eotaCustomEndDate;
	addValidField("eotaCustomEndDate");
}

/**
 * Get 货物入库日期：空运任务
 */
@Column(name = "EOTA_IN_WAREHOUSE_DATE")
public Date getEotaInWarehouseDate() {
	return eotaInWarehouseDate;
}

/**
 * Set 货物入库日期：空运任务
 */
public void setEotaInWarehouseDate(Date eotaInWarehouseDate) {
	this.eotaInWarehouseDate = eotaInWarehouseDate;
	addValidField("eotaInWarehouseDate");
}

/**
 * Get 单税签收日期：空运任务
 */
@Column(name = "EOTA_FINISHED_DATE")
public Date getEotaFinishedDate() {
	return eotaFinishedDate;
}

/**
 * Set 单税签收日期：空运任务
 */
public void setEotaFinishedDate(Date eotaFinishedDate) {
	this.eotaFinishedDate = eotaFinishedDate;
	addValidField("eotaFinishedDate");
}

/**
 * Get 付税日期：空运任务
 */
@Column(name = "EOTA_PAY_TAX_DATE")
public Date getEotaPayTaxDate() {
	return eotaPayTaxDate;
}

/**
 * Set 付税日期：空运任务
 */
public void setEotaPayTaxDate(Date eotaPayTaxDate) {
	this.eotaPayTaxDate = eotaPayTaxDate;
	addValidField("eotaPayTaxDate");
}

/**
 * Get 车次：铁路任务
 */
@Column(name = "EOTA_TRAIN")
public String getEotaTrain() {
	return eotaTrain;
}

/**
 * Set 车次：铁路任务
 */
public void setEotaTrain(String eotaTrain) {
	this.eotaTrain = eotaTrain;
	addValidField("eotaTrain");
}

/**
 * Get 截止进站时间：铁路任务
 */
@Column(name = "EOTA_STOP_STATION_TIME")
public Date getEotaStopStationTime() {
	return eotaStopStationTime;
}

/**
 * Set 截止进站时间：铁路任务
 */
public void setEotaStopStationTime(Date eotaStopStationTime) {
	this.eotaStopStationTime = eotaStopStationTime;
	addValidField("eotaStopStationTime");
}

/**
 * Get 进站时间：铁路任务
 */
@Column(name = "EOTA_STATION_TIME")
public Date getEotaStationTime() {
	return eotaStationTime;
}

/**
 * Set 进站时间：铁路任务
 */
public void setEotaStationTime(Date eotaStationTime) {
	this.eotaStationTime = eotaStationTime;
	addValidField("eotaStationTime");
}

/**
 * Get 近期铁路检测时间：铁路任务
 */
@Column(name = "EOTA_RAILWAY_TIME")
public Date getEotaRailwayTime() {
	return eotaRailwayTime;
}

/**
 * Set 近期铁路检测时间：铁路任务
 */
public void setEotaRailwayTime(Date eotaRailwayTime) {
	this.eotaRailwayTime = eotaRailwayTime;
	addValidField("eotaRailwayTime");
}

/**
 * Get 核销单返还日期
 */
@Column(name = "EOTA_RETURN_DATE")
public Date getEotaReturnDate() {
	return eotaReturnDate;
}

/**
 * Set 核销单返还日期
 */
public void setEotaReturnDate(Date eotaReturnDate) {
	this.eotaReturnDate = eotaReturnDate;
	addValidField("eotaReturnDate");
}

/**
 * Get 车队ID：进出口拖车任务
 */
@Column(name = "EOTA_TEAM_EBCU_ID")
public Integer getEotaTeamEbcuId() {
	return eotaTeamEbcuId;
}

/**
 * Set 车队ID：进出口拖车任务
 */
public void setEotaTeamEbcuId(Integer eotaTeamEbcuId) {
	this.eotaTeamEbcuId = eotaTeamEbcuId;
	addValidField("eotaTeamEbcuId");
}

/**
 * Get 车队：进出口拖车任务
 */
@Column(name = "EOTA_TEAM_EBCU_NAME_CN")
public String getEotaTeamEbcuNameCn() {
	return eotaTeamEbcuNameCn;
}

/**
 * Set 车队：进出口拖车任务
 */
public void setEotaTeamEbcuNameCn(String eotaTeamEbcuNameCn) {
	this.eotaTeamEbcuNameCn = eotaTeamEbcuNameCn;
	addValidField("eotaTeamEbcuNameCn");
}

/**
 * Get 码头ID：进出口拖车任务
 */
@Column(name = "EOTA_TERMINAL_EBCU_ID")
public Integer getEotaTerminalEbcuId() {
	return eotaTerminalEbcuId;
}

/**
 * Set 码头ID：进出口拖车任务
 */
public void setEotaTerminalEbcuId(Integer eotaTerminalEbcuId) {
	this.eotaTerminalEbcuId = eotaTerminalEbcuId;
	addValidField("eotaTerminalEbcuId");
}

/**
 * Get 码头：进出口拖车任务
 */
@Column(name = "EOTA_TERMINAL_EBCU_NAME_CN")
public String getEotaTerminalEbcuNameCn() {
	return eotaTerminalEbcuNameCn;
}

/**
 * Set 码头：进出口拖车任务
 */
public void setEotaTerminalEbcuNameCn(String eotaTerminalEbcuNameCn) {
	this.eotaTerminalEbcuNameCn = eotaTerminalEbcuNameCn;
	addValidField("eotaTerminalEbcuNameCn");
}

/**
 * Get 提箱地：陆运任务
 */
@Column(name = "EOTA_SUITCASE")
public String getEotaSuitcase() {
	return eotaSuitcase;
}

/**
 * Set 提箱地：陆运任务
 */
public void setEotaSuitcase(String eotaSuitcase) {
	this.eotaSuitcase = eotaSuitcase;
	addValidField("eotaSuitcase");
}

/**
 * Get 还箱地：陆运任务
 */
@Column(name = "EOTA_CRATES")
public String getEotaCrates() {
	return eotaCrates;
}

/**
 * Set 还箱地：陆运任务
 */
public void setEotaCrates(String eotaCrates) {
	this.eotaCrates = eotaCrates;
	addValidField("eotaCrates");
}

/**
 * Get 主驾驶ID：陆运任务
 */
@Column(name = "EOTA_MAIN_ETTP_ID")
public Integer getEotaMainEttpId() {
	return eotaMainEttpId;
}

/**
 * Set 主驾驶ID：陆运任务
 */
public void setEotaMainEttpId(Integer eotaMainEttpId) {
	this.eotaMainEttpId = eotaMainEttpId;
	addValidField("eotaMainEttpId");
}

/**
 * Get 挂车车牌号：陆运任务
 */
@Column(name = "EOTA_TRAILER_ETVE_CARD")
public String getEotaTrailerEtveCard() {
	return eotaTrailerEtveCard;
}

/**
 * Set 挂车车牌号：陆运任务
 */
public void setEotaTrailerEtveCard(String eotaTrailerEtveCard) {
	this.eotaTrailerEtveCard = eotaTrailerEtveCard;
	addValidField("eotaTrailerEtveCard");
}

/**
 * Get 挂车ID：陆运任务
 */
@Column(name = "EOTA_TRAILER_ETVE_ID")
public Integer getEotaTrailerEtveId() {
	return eotaTrailerEtveId;
}

/**
 * Set 挂车ID：陆运任务
 */
public void setEotaTrailerEtveId(Integer eotaTrailerEtveId) {
	this.eotaTrailerEtveId = eotaTrailerEtveId;
	addValidField("eotaTrailerEtveId");
}

/**
 * Get 牵引车车牌号：陆运任务
 */
@Column(name = "EOTA_TRACTOR_ETVE_CARD")
public String getEotaTractorEtveCard() {
	return eotaTractorEtveCard;
}

/**
 * Set 牵引车车牌号：陆运任务
 */
public void setEotaTractorEtveCard(String eotaTractorEtveCard) {
	this.eotaTractorEtveCard = eotaTractorEtveCard;
	addValidField("eotaTractorEtveCard");
}

/**
 * Get 牵引车ID：陆运任务
 */
@Column(name = "EOTA_TRACTOR_ETVE_ID")
public Integer getEotaTractorEtveId() {
	return eotaTractorEtveId;
}

/**
 * Set 牵引车ID：陆运任务
 */
public void setEotaTractorEtveId(Integer eotaTractorEtveId) {
	this.eotaTractorEtveId = eotaTractorEtveId;
	addValidField("eotaTractorEtveId");
}

/**
 * Get 主驾驶：陆运任务
 */
@Column(name = "EOTA_MAIN_ETTP_NAME")
public String getEotaMainEttpName() {
	return eotaMainEttpName;
}

/**
 * Set 主驾驶：陆运任务
 */
public void setEotaMainEttpName(String eotaMainEttpName) {
	this.eotaMainEttpName = eotaMainEttpName;
	addValidField("eotaMainEttpName");
}

/**
 * Get 副驾驶ID：陆运任务
 */
@Column(name = "EOTA_COPILOR_ETTP_ID")
public Integer getEotaCopilorEttpId() {
	return eotaCopilorEttpId;
}

/**
 * Set 副驾驶ID：陆运任务
 */
public void setEotaCopilorEttpId(Integer eotaCopilorEttpId) {
	this.eotaCopilorEttpId = eotaCopilorEttpId;
	addValidField("eotaCopilorEttpId");
}

/**
 * Get 副驾驶：陆运任务
 */
@Column(name = "EOTA_COPILOR_ETTP_NAME")
public String getEotaCopilorEttpName() {
	return eotaCopilorEttpName;
}

/**
 * Set 副驾驶：陆运任务
 */
public void setEotaCopilorEttpName(String eotaCopilorEttpName) {
	this.eotaCopilorEttpName = eotaCopilorEttpName;
	addValidField("eotaCopilorEttpName");
}

/**
 * Get 集装箱ID：陆运任务
 */
@Column(name = "EOTA_LAND_ETCA_ID")
public Integer getEotaLandEtcaId() {
	return eotaLandEtcaId;
}

/**
 * Set 集装箱ID：陆运任务
 */
public void setEotaLandEtcaId(Integer eotaLandEtcaId) {
	this.eotaLandEtcaId = eotaLandEtcaId;
	addValidField("eotaLandEtcaId");
}

/**
 * Get 陆运任务集装箱号：陆运任务
 */
@Column(name = "EOTA_LAND_ETCA_NO")
public String getEotaLandEtcaNo() {
	return eotaLandEtcaNo;
}

/**
 * Set 陆运任务集装箱号：陆运任务
 */
public void setEotaLandEtcaNo(String eotaLandEtcaNo) {
	this.eotaLandEtcaNo = eotaLandEtcaNo;
	addValidField("eotaLandEtcaNo");
}

/**
 * Get 陆运任务封号：陆运任务
 */
@Column(name = "EOTA_LAND_TITLE_NO")
public String getEotaLandTitleNo() {
	return eotaLandTitleNo;
}

/**
 * Set 陆运任务封号：陆运任务
 */
public void setEotaLandTitleNo(String eotaLandTitleNo) {
	this.eotaLandTitleNo = eotaLandTitleNo;
	addValidField("eotaLandTitleNo");
}

/**
 * Get 司机联系方式：陆运任务
 */
@Column(name = "EOTA_ETTP_TEL")
public String getEotaEttpTel() {
	return eotaEttpTel;
}

/**
 * Set 司机联系方式：陆运任务
 */
public void setEotaEttpTel(String eotaEttpTel) {
	this.eotaEttpTel = eotaEttpTel;
	addValidField("eotaEttpTel");
}

/**
 * Get 陆运承运人：陆运任务
 */
@Column(name = "EOTA_CARRIER_EBCU_ID")
public Integer getEotaCarrierEbcuId() {
	return eotaCarrierEbcuId;
}

/**
 * Set 陆运承运人：陆运任务
 */
public void setEotaCarrierEbcuId(Integer eotaCarrierEbcuId) {
	this.eotaCarrierEbcuId = eotaCarrierEbcuId;
	addValidField("eotaCarrierEbcuId");
}

/**
 * Get 陆运承运人名称：陆运任务
 */
@Column(name = "EOTA_CARRIER_EBCU_NAME_CN")
public String getEotaCarrierEbcuNameCn() {
	return eotaCarrierEbcuNameCn;
}

/**
 * Set 陆运承运人名称：陆运任务
 */
public void setEotaCarrierEbcuNameCn(String eotaCarrierEbcuNameCn) {
	this.eotaCarrierEbcuNameCn = eotaCarrierEbcuNameCn;
	addValidField("eotaCarrierEbcuNameCn");
}

/**
 * Get 行车路线：陆运任务
 */
@Column(name = "EOTA_EBLN_ID")
public Integer getEotaEblnId() {
	return eotaEblnId;
}

/**
 * Set 行车路线：陆运任务
 */
public void setEotaEblnId(Integer eotaEblnId) {
	this.eotaEblnId = eotaEblnId;
	addValidField("eotaEblnId");
}

/**
 * Get 行车路线名称：陆运任务
 */
@Column(name = "EOTA_EBLN_LINE_NAME")
public String getEotaEblnLineName() {
	return eotaEblnLineName;
}

/**
 * Set 行车路线名称：陆运任务
 */
public void setEotaEblnLineName(String eotaEblnLineName) {
	this.eotaEblnLineName = eotaEblnLineName;
	addValidField("eotaEblnLineName");
}

/**
 * Get 是否进入内部车辆调度池:陆运任务
 */
@Column(name = "EOTA_IS_WITHIN")
public String getEotaIsWithin() {
	return eotaIsWithin;
}

/**
 * Set 是否进入内部车辆调度池:陆运任务
 */
public void setEotaIsWithin(String eotaIsWithin) {
	this.eotaIsWithin = eotaIsWithin;
	addValidField("eotaIsWithin");
}

/**
 * Get 封号1
 */
@Column(name = "EOTA_RATE_MILEAGE")
public Double getEotaRateMileage() {
	return eotaRateMileage;
}

/**
 * Set 封号1
 */
public void setEotaRateMileage(Double eotaRateMileage) {
	this.eotaRateMileage = eotaRateMileage;
	addValidField("eotaRateMileage");
}
/**
 * Get 预留字段
 */
@Column(name = "EOTA_SUBSTR1")
public String getEotaSubstr1() {
	return eotaSubstr1;
}

/**
 * Set 预留字段
 */
public void setEotaSubstr1(String eotaSubstr1) {
	this.eotaSubstr1 = eotaSubstr1;
	addValidField("eotaSubstr1");
}

/**
 * Get 预留字段
 */
@Column(name = "EOTA_SUBSTR2")
public String getEotaSubstr2() {
	return eotaSubstr2;
}

/**
 * Set 预留字段
 */
public void setEotaSubstr2(String eotaSubstr2) {
	this.eotaSubstr2 = eotaSubstr2;
	addValidField("eotaSubstr2");
}

/**
 * Get 预留字段
 */
@Column(name = "EOTA_SUBSTR3")
public String getEotaSubstr3() {
	return eotaSubstr3;
}

/**
 * Set 预留字段
 */
public void setEotaSubstr3(String eotaSubstr3) {
	this.eotaSubstr3 = eotaSubstr3;
	addValidField("eotaSubstr3");
}

/**
 * Get 预留字段
 */
@Column(name = "EOTA_SUBSTR4")
public String getEotaSubstr4() {
	return eotaSubstr4;
}

/**
 * Set 预留字段
 */
public void setEotaSubstr4(String eotaSubstr4) {
	this.eotaSubstr4 = eotaSubstr4;
	addValidField("eotaSubstr4");
}

/**
 * Get 预留字段
 */
@Column(name = "EOTA_SUBSTR5")
public String getEotaSubstr5() {
	return eotaSubstr5;
}

/**
 * Set 预留字段
 */
public void setEotaSubstr5(String eotaSubstr5) {
	this.eotaSubstr5 = eotaSubstr5;
	addValidField("eotaSubstr5");
}

/**
 * Get 预留字段
 */
@Column(name = "EOTA_SUBSTR6")
public String getEotaSubstr6() {
	return eotaSubstr6;
}

/**
 * Set 预留字段
 */
public void setEotaSubstr6(String eotaSubstr6) {
	this.eotaSubstr6 = eotaSubstr6;
	addValidField("eotaSubstr6");
}

/**
 * Get 预留字段
 */
@Column(name = "EOTA_SUBSTR8")
public String getEotaSubstr8() {
	return eotaSubstr8;
}

/**
 * Set 预留字段
 */
public void setEotaSubstr8(String eotaSubstr8) {
	this.eotaSubstr8 = eotaSubstr8;
	addValidField("eotaSubstr8");
}

/**
 * Get 预留字段
 */
@Column(name = "EOTA_SUBSTR7")
public String getEotaSubstr7() {
	return eotaSubstr7;
}

/**
 * Set 预留字段
 */
public void setEotaSubstr7(String eotaSubstr7) {
	this.eotaSubstr7 = eotaSubstr7;
	addValidField("eotaSubstr7");
}

/**
 * Get 预留字段
 */
@Column(name = "EOTA_SUBDATE1")
public Date getEotaSubdate1() {
	return eotaSubdate1;
}

/**
 * Set 预留字段
 */
public void setEotaSubdate1(Date eotaSubdate1) {
	this.eotaSubdate1 = eotaSubdate1;
	addValidField("eotaSubdate1");
}

/**
 * Get 预留字段
 */
@Column(name = "EOTA_SUBDATE2")
public Date getEotaSubdate2() {
	return eotaSubdate2;
}

/**
 * Set 预留字段
 */
public void setEotaSubdate2(Date eotaSubdate2) {
	this.eotaSubdate2 = eotaSubdate2;
	addValidField("eotaSubdate2");
}

/**
 * Get 预留字段
 */
@Column(name = "EOTA_SUBDATE5")
public Date getEotaSubdate5() {
	return eotaSubdate5;
}

/**
 * Set 预留字段
 */
public void setEotaSubdate5(Date eotaSubdate5) {
	this.eotaSubdate5 = eotaSubdate5;
	addValidField("eotaSubdate5");
}

/**
 * Get 预留字段
 */
@Column(name = "EOTA_SUBDATE4")
public Date getEotaSubdate4() {
	return eotaSubdate4;
}

/**
 * Set 预留字段
 */
public void setEotaSubdate4(Date eotaSubdate4) {
	this.eotaSubdate4 = eotaSubdate4;
	addValidField("eotaSubdate4");
}

/**
 * Get 预留字段
 */
@Column(name = "EOTA_SUBDATE3")
public Date getEotaSubdate3() {
	return eotaSubdate3;
}

/**
 * Set 预留字段
 */
public void setEotaSubdate3(Date eotaSubdate3) {
	this.eotaSubdate3 = eotaSubdate3;
	addValidField("eotaSubdate3");
}

/**
 * Get 预留字段
 */
@Column(name = "EOTA_SUBNUM3")
public Double getEotaSubnum3() {
	return eotaSubnum3;
}

/**
 * Set 预留字段
 */
public void setEotaSubnum3(Double eotaSubnum3) {
	this.eotaSubnum3 = eotaSubnum3;
	addValidField("eotaSubnum3");
}

/**
 * Get 预留字段
 */
@Column(name = "EOTA_SUBNUM2")
public Double getEotaSubnum2() {
	return eotaSubnum2;
}

/**
 * Set 预留字段
 */
public void setEotaSubnum2(Double eotaSubnum2) {
	this.eotaSubnum2 = eotaSubnum2;
	addValidField("eotaSubnum2");
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
 * Get recVer
 */
@Column(name = "REC_VER")
@Version
public Integer getRecVer() {
	return recVer;
}

/**
 * Set recVer
 */
public void setRecVer(Integer recVer) {
	this.recVer = recVer;
	addValidField("recVer");
}
/**
 * Get eotaVoider
 */
@Column(name = "EOTA_VOIDER")
@Version
public String getEotaVoider() {
	return eotaVoider;
}

/**
 * Set eotaVoider
 */
public void setEotaVoider(String eotaVoider) {
	this.eotaVoider = eotaVoider;
	addValidField("eotaVoider");
}
/**
 * Get eotaVoiderTime
 */
@Column(name = "EOTA_VOIDER_TIME")
@Version
public Date getEotaVoiderTime() {
	return eotaVoiderTime;
}

/**
 * Set eotaVoiderTime
 */
public void setEotaVoiderTime(Date eotaVoiderTime) {
	this.eotaVoiderTime = eotaVoiderTime;
	addValidField("eotaVoiderTime");
}
/**
 * Get eotaVoidDesc
 */
@Column(name = "EOTA_VOID_DESC")
@Version
public String getEotaVoidDesc() {
	return eotaVoidDesc;
}

/**
 * Set eotaVoidDesc
 */
public void setEotaVoidDesc(String eotaVoidDesc) {
	this.eotaVoidDesc = eotaVoidDesc;
	addValidField("eotaVoidDesc");
}

/**
 * @return the eotaDeliveryTime
 */
@Column(name = "EOTA_DELIVERY_TIME")
public Date getEotaDeliveryTime() {
	return eotaDeliveryTime;
}

/**
 * @param eotaDeliveryTime the eotaDeliveryTime to set
 */
public void setEotaDeliveryTime(Date eotaDeliveryTime) {
	this.eotaDeliveryTime = eotaDeliveryTime;
	addValidField("eotaDeliveryTime");
}

/**
 * @return the eotaArrivalTime
 */
@Column(name = "EOTA_ARRIVAL_TIME")
public Date getEotaArrivalTime() {
	return eotaArrivalTime;
}

/**
 * @param eotaArrivalTime the eotaArrivalTime to set
 */
public void setEotaArrivalTime(Date eotaArrivalTime) {
	this.eotaArrivalTime = eotaArrivalTime;
	addValidField("eotaArrivalTime");
}

/**
 * @return the eotaLoadSeq
 */
@Column(name = "EOTA_LOAD_SEQ")
public String getEotaLoadSeq() {
	return eotaLoadSeq;
}

/**
 * @param eotaLoadSeq the eotaLoadSeq to set
 */
public void setEotaLoadSeq(String eotaLoadSeq) {
	this.eotaLoadSeq = eotaLoadSeq;
	addValidField("eotaLoadSeq");
}

/**
 * @return the eotaUnloadSeq
 */
@Column(name = "EOTA_UN_LOAD_SEQ")
public String getEotaUnloadSeq() {
	return eotaUnloadSeq;
}

/**
 * @param eotaUnloadSeq the eotaUnloadSeq to set
 */
public void setEotaUnloadSeq(String eotaUnloadSeq) {
	this.eotaUnloadSeq = eotaUnloadSeq;
	addValidField("eotaUnloadSeq");
}
/**
 * @return the eotaNumberUnit
 */
@Column(name = "EOTA_NUMBER_UNIT")
public String getEotaNumberUnit() {
	return eotaNumberUnit;
}
/**
 * @param eotaNumberUnit the eotaNumberUnit to set
 */
public void setEotaNumberUnit(String eotaNumberUnit) {
	this.eotaNumberUnit = eotaNumberUnit;
	addValidField("eotaNumberUnit");
}
/**
 * @return the eotaQuantityUnit
 */
@Column(name = "EOTA_QUANTITY_UNIT")
public String getEotaQuantityUnit() {
	return eotaQuantityUnit;
}
/**
 * @param eotaQuantityUnit the eotaQuantityUnit to set
 */
public void setEotaQuantityUnit(String eotaQuantityUnit) {
	this.eotaQuantityUnit = eotaQuantityUnit;
	addValidField("eotaQuantityUnit");
}

@Column(name = "EOTA_CERTIFICATION_NAME_LIST")
public String getEotaCertificationNameList() {
	return eotaCertificationNameList;
}

public void setEotaCertificationNameList(String eotaCertificationNameList) {
	this.eotaCertificationNameList = eotaCertificationNameList;
	addValidField("eotaCertificationNameList");
}

/**
 * Get 净重:陆运任务
 * 海运任务
 * 铁路任务
 */
@Column(name = "EOTA_NET_WEIGHT")
public Double getEotaNetWeight() {
	return eotaNetWeight;
}

/**
 * Set 净重:陆运任务
 * 海运任务
 * 铁路任务
 */
public void setEotaNetWeight(Double eotaNetWeight) {
	this.eotaNetWeight = eotaNetWeight;
	addValidField("eotaNetWeight");
}

@Column(name = "EOTA_GROUP_NUM")
public Integer getEotaGroupNum() {
	return eotaGroupNum;
}

public void setEotaGroupNum(Integer eotaGroupNum) {
	this.eotaGroupNum = eotaGroupNum;
	addValidField("eotaGroupNum");
}

/**
 * @return the eotaTractorReq
 */
@Column(name = "EOTA_TRACTOR_REQ")
public String getEotaTractorReq() {
	return eotaTractorReq;
}

/**
 * @return the eotaTrailerReq
 */
@Column(name = "EOTA_TRAILER_REQ")
public String getEotaTrailerReq() {
	return eotaTrailerReq;
}

/**
 * @return the eotaTransportReq
 */
@Column(name = "EOTA_TRANSPORT_REQ")
public String getEotaTransportReq() {
	return eotaTransportReq;
}

/**
 * @param eotaTractorReq the eotaTractorReq to set
 */
public void setEotaTractorReq(String eotaTractorReq) {
	this.eotaTractorReq = eotaTractorReq;
	addValidField("eotaTractorReq");
}

/**
 * @param eotaTrailerReq the eotaTrailerReq to set
 */
public void setEotaTrailerReq(String eotaTrailerReq) {
	this.eotaTrailerReq = eotaTrailerReq;
	addValidField("eotaTrailerReq");
}

/**
 * @param eotaTransportReq the eotaTransportReq to set
 */
public void setEotaTransportReq(String eotaTransportReq) {
	this.eotaTransportReq = eotaTransportReq;
	addValidField("eotaTransportReq");
}

/**
 * @return the eotaSuitcaseEbrgId
 */
@Column(name = "EOTA_SUITCASE_EBRG_ID")
public Integer getEotaSuitcaseEbrgId() {
	return eotaSuitcaseEbrgId;
}

/**
 * @return the eotaCratesEbrgId
 */
@Column(name = "EOTA_CRATES_EBRG_ID")
public Integer getEotaCratesEbrgId() {
	return eotaCratesEbrgId;
}

/**
 * @param eotaSuitcaseEbrgId the eotaSuitcaseEbrgId to set
 */
public void setEotaSuitcaseEbrgId(Integer eotaSuitcaseEbrgId) {
	this.eotaSuitcaseEbrgId = eotaSuitcaseEbrgId;
	addValidField("eotaSuitcaseEbrgId");
}

/**
 * @param eotaCratesEbrgId the eotaCratesEbrgId to set
 */
public void setEotaCratesEbrgId(Integer eotaCratesEbrgId) {
	this.eotaCratesEbrgId = eotaCratesEbrgId;
	addValidField("eotaCratesEbrgId");
}
/**
 * @return the eotaScheduleId
 */
@Column(name = "EOTA_SCHEDULE_ID")
public Integer getEotaScheduleId() {
	return eotaScheduleId;
}
/**
 * @param eotaScheduleId the eotaScheduleId to set
 */
public void setEotaScheduleId(Integer eotaScheduleId) {
	this.eotaScheduleId = eotaScheduleId;
	addValidField("eotaScheduleId");
}
/**
 * @return the eotaScheduleName
 */
@Column(name = "EOTA_SCHEDULE_NAME")
public String getEotaScheduleName() {
	return eotaScheduleName;
}
/**
 * @param eotaScheduleName the eotaScheduleName to set
 */
public void setEotaScheduleName(String eotaScheduleName) {
	this.eotaScheduleName = eotaScheduleName;
	addValidField("eotaScheduleName");
}
/**
 *Get 配箱ID
 */
@Column(name = "EOTA_EOOC_ID")
public Integer getEotaEoocId(){
	return eotaEoocId;
}
/**
 *Set 配箱ID
 */
public void setEotaEoocId(Integer eotaEoocId){
	this.eotaEoocId=eotaEoocId;
	addValidField("eotaEoocId");
}

/**
 * Get 最后执行状态'
 */
@Column(name = "EOTA_LAST_STATUS")
public String getEotaLastStatus() {
	return eotaLastStatus;
}

/**
 * Set 最后执行状态'
 */
public void setEotaLastStatus(String eotaLastStatus) {
	this.eotaLastStatus = eotaLastStatus;
	addValidField("eotaLastStatus");
}


/**
 * Get 返场时间
 */
@Column(name = "EOTA_RETURN_TIME")
public Date getEotaReturnTime() {
	return eotaReturnTime;
}

/**
 * Set 返场时间
 */
public void setEotaReturnTime(Date eotaReturnTime) {
	this.eotaReturnTime = eotaReturnTime;
	addValidField("eotaReturnTime");
}


/**
 * Get 入库任务:收货时间
 */
@Column(name = "EOTA_RECEIVE_TIME")
public Date getEotaReceiveTime() {
	return eotaReceiveTime;
}

/**
 * Set 入库任务:收货时间
 */
public void setEotaReceiveTime(Date eotaReceiveTime) {
	this.eotaReceiveTime = eotaReceiveTime;
	addValidField("eotaReceiveTime");
}


/**
 * Get 出库任务:备货时间
 */
@Column(name = "EOTA_STOCK_UP_TIME")
public Date getEotaStockUpTime() {
	return eotaStockUpTime;
}

/**
 * Set 出库任务:备货时间
 */
public void setEotaStockUpTime(Date eotaStockUpTime) {
	this.eotaStockUpTime = eotaStockUpTime;
	addValidField("eotaStockUpTime");
}


/**
 * Get 预留字段
 */
@Column(name = "EOTA_SUBNUM1")
public Double getEotaSubnum1() {
	return eotaSubnum1;
}

/**
 * Set 预留字段
 */
public void setEotaSubnum1(Double eotaSubnum1) {
	this.eotaSubnum1 = eotaSubnum1;
	addValidField("eotaSubnum1");
}

@Column(name = "EOTA_START_LOADING_TIME")
public String getEotaStartLoadingTime() {
	return eotaStartLoadingTime;
	
}

public void setEotaStartLoadingTime(String eotaStartLoadingTime) {
	this.eotaStartLoadingTime = eotaStartLoadingTime;
	addValidField("eotaStartLoadingTime");
}
@Column(name = "EOTA_FINISHED_LOADED_TIME")
public String getEotaFinishedLoadedTime() {
	return eotaFinishedLoadedTime;
}

public void setEotaFinishedLoadedTime(String eotaFinishedLoadedTime) {
	this.eotaFinishedLoadedTime = eotaFinishedLoadedTime;
	addValidField("eotaFinishedLoadedTime");
}

@Column(name = "EOTA_COST_STATUS")
public String getEotaCostStatus() {
	return eotaCostStatus;
}

public void setEotaCostStatus(String eotaCostStatus) {
	this.eotaCostStatus = eotaCostStatus;
	addValidField("eotaCostStatus");
}

/**
 * Get 是否为调度指令(Y是调度指令
 * 空 或者N为不是调度指令)
 */
@Column(name = "EOTA_IS_SCHEDULE_INSTRUCTION")
public String getEotaIsScheduleInstruction() {
	return eotaIsScheduleInstruction;
}

/**
 * Set 是否为调度指令(Y是调度指令
 * 空 或者N为不是调度指令)
 */
public void setEotaIsScheduleInstruction(String eotaIsScheduleInstruction) {
	this.eotaIsScheduleInstruction = eotaIsScheduleInstruction;
	addValidField("eotaIsScheduleInstruction");
}

/**
 * Get 双拖键值(双拖时记住另一个任务id)
 */
@Column(name = "EOTA_DOUBLE_ID")
public Long getEotaDoubleId() {
	return eotaDoubleId;
}

/**
 * Set 双拖键值(双拖时记住另一个任务id)
 */
public void setEotaDoubleId(Long eotaDoubleId) {
	this.eotaDoubleId = eotaDoubleId;
	addValidField("eotaDoubleId");
}

/**
 * Get 调度指令名称
 */
@Column(name = "EOTA_EBSI_NAME")
public String getEotaEbsiName() {
	return eotaEbsiName;
}

/**
 * Set 调度指令名称
 */
public void setEotaEbsiName(String eotaEbsiName) {
	this.eotaEbsiName = eotaEbsiName;
	addValidField("eotaEbsiName");
}

@Column(name = "EOTA_LAST_INSTRUCTION")
public String getEotaLastInstruction() {
	return eotaLastInstruction;
}

public void setEotaLastInstruction(String eotaLastInstruction) {
	this.eotaLastInstruction = eotaLastInstruction;
	addValidField("eotaLastInstruction");
}

@Column(name = "EOTA_EMPTY_STATUS")
public String getEotaEmptyStatus() {
	return eotaEmptyStatus;
}

public void setEotaEmptyStatus(String eotaEmptyStatus) {
	this.eotaEmptyStatus = eotaEmptyStatus;
	addValidField("eotaEmptyStatus");
}

/**
 * Get 检疫地点
 */
@Column(name = "EOTA_QUARANTINE_ADS")
public String getEotaQuarantineAds() {
	return eotaQuarantineAds;
}

/**
 * Set 检疫地点
 */
public void setEotaQuarantineAds(String eotaQuarantineAds) {
	this.eotaQuarantineAds = eotaQuarantineAds;
	addValidField("eotaQuarantineAds");
}

/**
 * Get 验木包装地点
 */
@Column(name = "EOTA_WOODEN_PACKAGING_ADS")
public String getEotaWoodenPackagingAds() {
	return eotaWoodenPackagingAds;
}

/**
 * Set 验木包装地点
 */
public void setEotaWoodenPackagingAds(String eotaWoodenPackagingAds) {
	this.eotaWoodenPackagingAds = eotaWoodenPackagingAds;
	addValidField("eotaWoodenPackagingAds");
}

/**
 * Get 熏蒸地点
 */
@Column(name = "EOTA_FUMIGATION_ADS")
public String getEotaFumigationAds() {
	return eotaFumigationAds;
}

/**
 * Set 熏蒸地点
 */
public void setEotaFumigationAds(String eotaFumigationAds) {
	this.eotaFumigationAds = eotaFumigationAds;
	addValidField("eotaFumigationAds");
}

/**
 * Get 动检地点
 */
@Column(name = "EOTA_ANIMAL_QUARANTINE_ADS")
public String getEotaAnimalQuarantineAds() {
	return eotaAnimalQuarantineAds;
}

/**
 * Set 动检地点
 */
public void setEotaAnimalQuarantineAds(String eotaAnimalQuarantineAds) {
	this.eotaAnimalQuarantineAds = eotaAnimalQuarantineAds;
	addValidField("eotaAnimalQuarantineAds");
}




}