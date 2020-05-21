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
@Table(name = "ET_TASK")
public class EtTaskModel extends BaseModel implements OperationLog {

	//任务表主键
	private Integer ettaId;
	//订单ID
	private Integer ettaEtorId;
	//所属公司
	private Long ettaEscoId;
	//调度计划主键
	private Integer ettaEtspId;
	//任务编号:所有任务
	private String ettaNo;
	//任务拆分状态0.未拆分
	private String ettaSplitStatus;
	//任务类型
	private String ettaType;
	//任务状态:所有任务
	private String ettaStatus;
	//任务顺序
	private Integer ettaOrder;
	//上级任务
	private Integer ettaSelfId;
	//SO
	private String ettaSoNo;
	//DO
	private String ettaDoNo;
	//陆运公司ID:陆运任务
	private Integer ettaLandEbcuId;
	//陆运公司全称：陆运任务
	private String ettaLandEbcuNameCn;
	//客户ID：陆运任务
	private Integer ettaCustomerEbcuId;
	//客户名称：陆运任务
	private String ettaCustomerEbcuNameCn;
	//紧急程度：陆运任务
	private String ettaUrgency;
	//要求提货时间：陆运任务
	private Date ettaDeliveryReqTime;
	//任务安排时间：陆运任务
	private Date ettaTaskScheduleTime;
	//要求到货时间:陆运任务
	private Date ettaArrivalReqTime;
	//提柜时间:陆运任务
	private Date ettaMentionTime;
	//运输特殊要求:陆运任务
	private String ettaTransSpeReq;
	//收货人收货特殊要求:陆运任务
	private String ettaReceiveSpeReq;
	//行车路线描述:陆运任务
	private String ettaLineDesc;
	//箱型:陆运任务
	private String ettaContainerType;
	//箱量:陆运任务
	private String ettaContainerWeight;
	//是否白卡:陆运任务
	private String ettaIsWhiteCard;
	//是否短驳:陆运任务
	private String ettaIsShortBarge;
	//是否包车:陆运任务
	private String ettaIsChartered;
	//是否可拼:陆运任务
	private String ettaIsToFight;
	//起运地ID:陆运任务
	private Integer ettaFromEbrgId;
	//起运地名称:陆运任务
	private String ettaFromEbrgNameCn;
	//目的地ID:陆运任务
	private Integer ettaToEbrgId;
	//目的地名称:陆运任务
	private String ettaToEbrgNameCn;
	//毛重:陆运任务
	private Double ettaWeight;
	//件数:陆运任务
	private Integer ettaQuantity;
	//体积:陆运任务
	private Double ettaVolume;
	//提货地址:陆运任务
	private String ettaDeliveryAddress;
	//收货地址:陆运任务
	private String ettaReceiveAddress;
	//备注:所有任务
	private String ettaRemark;
	//出/入库单号:出入库任务
	private String ettaLibraryNo;
	//出/入库时间:出入库任务
	private Date ettaLibraryTime;
	//出/入仓库/报关行/航空公司/船ID:出入库任务
	private Integer ettaEbcuId;
	//出/入仓库/报关行/航空公司/船名称:出入库任务
	private String ettaEbcuNameCn;
	//出/入仓数量:出入库任务
	private Integer ettaLibraryNumber;
	//出/入合计件数:出入库任务
	private Integer ettaLibraryQuantity;
	//出/入合计体积:出入库任务
	private Integer ettaLibraryVolume;
	//出/入合计毛重:出入库任务
	private Integer ettaLibraryGw;
	//出/入合计净重:出入库任务
	private Integer ettaLibraryNw;
	//订舱代理ID:海运任务
	private Integer ettaBookingEbcuId;
	//订舱代理:海运任务
	private String ettaBookingEbcuNameCn;
	//订舱单号:海运任务
	private String ettaBookingNo;
	//关单号:海运任务
	private String ettaCustomNo;
	//船名:海运任务
	private String ettaVessel;
	//航次:海运任务
	private String ettaVoyage;
	//开航日期:海运任务
	private Date ettaDepartureDate;
	//预计开航日期:海运任务
	private Date ettaPlanDepartureDate;
	//预计到港日期:海运任务
	private Date ettaPlanArrivalDate;
	//到港日期:海运任务
	private Date ettaArrivalDate;
	//装箱时间:海运任务
	private Date ettaPackingTime;
	//集港时间:海运任务
	private Date ettaSetPostTime;
	//截重时间:海运任务
	private Date ettaWeightTime;
	//截关时间:海运任务
	private Date ettaCutTime;
	//起运港ID:海运任务
	private Integer ettaStartEbptId;
	//起运港名称:海运任务
	private String ettaStartEbptNameCn;
	//目的港ID:海运任务
	private Integer ettaEndEbptId;
	//目的港名称:海运任务
	private String ettaEndEbptNameCn;
	//MBL:海运任务
	private String ettaMblNo;
	//HBL:海运任务
	private String ettaHblNo;
	//箱ID:海运任务
	private Integer ettaEtcaId;
	//箱号:海运任务
	private String ettaEtcaNo;
	//封号:海运任务
	private String ettaTitleNo;
	//报关类型:报关任务
	private String ettaCustomType;
	//文件编号:报关任务
	private String ettaFileNo;
	//文件类型:报关任务
	private String ettaFileType;
	//放行时间:报关任务
	private Date ettaReleaseTime;
	//送单时间:报关任务
	private Date ettaSendTime;
	//回单时间:报关任务
	private Date ettaBackTime;
	//报关地点:报关任务
	private String ettaCustomPlace;
	//口岸报关行ID:报关任务
	private Integer ettaPortEbcuId;
	//口岸报关行名称:报关任务
	private String ettaPortEbcuNameCn;
	//口岸报关地点:报关任务
	private String ettaPortAddress;
	//装箱地址：进出口拖车任务
	private String ettaPackingAddress;
	//理货日期：进出口拖车任务
	private Date ettaTallyDate;
	//截港日期：出口拖车任务
	private Date ettaCutPostDate;
	//提箱时间：进出口拖车任务
	private Date ettaSuitcaseTime;
	//提箱地址：进口拖车任务
	private String ettaSuitcaseAddress;
	//进港日期：出口拖车任务
	private Date ettaInPostDate;
	//上船日期：出口拖车任务
	private Date ettaUpShippingDate;
	//要求到达：进出口拖车任务
	private Date ettaReqArrival;
	//实际到达：进出口拖车任务
	private Date ettaActualArrival;
	//联系方式：进出口拖车任务
	private String ettaContact;
	//派车信息：进出口拖车任务
	private String ettaSentCarInfo;
	//离场时间：进出口拖车任务
	private Date ettaLeaveTime;
	//离场备注：进出口拖车任务
	private String ettaDepartureRemark;
	//包装形式：进出口拖车任务
	private String ettaPackaging;
	//报关预入日期：出口拖车任务
	private Date ettaPreentryDate;
	//查验日期:进出口拖车任务
	private Date ettaPortTime;
	//查验日期：进出口拖车任务
	private Date ettaCheckDate;
	//是否污箱：进口拖车任务
	private String ettaIsSewageTank;
	//执行情况:进出口拖车任务
	private String ettaPerformDesc;
	//修改人员:进出口拖车任务
	private String ettaModifier;
	//修改日期:进出口拖车任务
	private Date ettaModifyTime;
	//输入人员:进出口拖车任务
	private String ettaCreator;
	//输入日期:进出口拖车任务
	private Date ettaCreateTime;
	//包装备注:进出口拖车任务
	private String ettaPackageRemark;
	//动卫检查验:进口拖车任务
	private Date ettaInspecteDate;
	//动卫检查询:进口拖车任务
	private String ettaCheckDesc;
	//进出口：空运任务
	private String ettaInOut;
	//还箱地址:进口拖车任务
	private String ettaReturnTankAddress;
	//还箱时间:进口拖车任务
	private Date ettaBackTankTime;
	//计划提货日期:进口拖车任务
	private Date ettaPlanDeliveryDate;
	//是否落箱:进口拖车任务
	private String ettaIsDropTank;
	//单证收全日期：空运任务
	private Date ettaCollectDate;
	//报关开始日期：空运任务
	private Date ettaCustomStartDate;
	//换单日期：空运任务
	private Date ettaChangeDate;
	//取得换证凭条日期:进口拖车任务
	private Date ettaObtainDate;
	//进物流园时间:进口拖车任务
	private Date ettaInParkTime;
	//出物流园时间:进口拖车任务
	private Date ettaOutParkTime;
	//是否港区计划:进口拖车任务
	private String ettaIsPortPlan;
	//报关结束日期：空运任务
	private Date ettaCustomEndDate;
	//货物入库日期：空运任务
	private Date ettaInWarehouseDate;
	//单税签收日期：空运任务
	private Date ettaFinishedDate;
	//付税日期：空运任务
	private Date ettaPayTaxDate;
	//车次：铁路任务
	private String ettaTrain;
	//截止进站时间：铁路任务
	private Date ettaStopStationTime;
	//进站时间：铁路任务
	private Date ettaStationTime;
	//近期铁路检测时间：铁路任务
	private Date ettaRailwayTime;
	//核销单返还日期
	private Date ettaReturnDate;
	//车队ID：进出口拖车任务
	private Integer ettaTeamEbcuId;
	//车队：进出口拖车任务
	private String ettaTeamEbcuNameCn;
	//码头ID：进出口拖车任务
	private Integer ettaTerminalEbcuId;
	//码头：进出口拖车任务
	private String ettaTerminalEbcuNameCn;
	//提箱地：陆运任务
	private String ettaSuitcase;
	//还箱地：陆运任务
	private String ettaCrates;
	//主驾驶ID：陆运任务
	private Integer ettaMainEttpId;
	//挂车车牌号：陆运任务
	private String ettaTrailerEtveCard;
	//挂车ID：陆运任务
	private Integer ettaTrailerEtveId;
	//牵引车车牌号：陆运任务
	private String ettaTractorEtveCard;
	//牵引车ID：陆运任务
	private Integer ettaTractorEtveId;
	//主驾驶：陆运任务
	private String ettaMainEttpName;
	//副驾驶ID：陆运任务
	private Integer ettaCopilorEttpId;
	//副驾驶：陆运任务
	private String ettaCopilorEttpName;
	//集装箱ID：陆运任务
	private Integer ettaLandEtcaId;
	//陆运任务集装箱号：陆运任务
	private String ettaLandEtcaNo;
	//陆运任务封号：陆运任务
	private String ettaLandTitleNo;
	//司机联系方式：陆运任务
	private String ettaEttpTel;
	//陆运承运人：陆运任务
	private Integer ettaCarrierEbcuId;
	//陆运承运人名称：陆运任务
	private String ettaCarrierEbcuNameCn;
	//行车路线：陆运任务
	private Integer ettaEblnId;
	//行车路线名称：陆运任务
	private String ettaEblnLineName;
	//是否进入内部车辆调度池:陆运任务
	private String ettaIsWithin;
	//额定里程
	private Double ettaRateMileage;
	
	//预留字段
	private Double ettaSubnum1;
	//预留字段
	private String ettaSubstr1;
	//预留字段
	private String ettaSubstr2;
	//预留字段
	private String ettaSubstr3;
	//预留字段
	private String ettaSubstr4;
	//预留字段
	private String ettaSubstr5;
	//预留字段
	private String ettaSubstr6;
	//预留字段
	private String ettaSubstr8;
	//预留字段
	private String ettaSubstr7;
	//预留字段
	private Date ettaSubdate1;
	//预留字段
	private Date ettaSubdate2;
	//预留字段
	private Date ettaSubdate5;
	//预留字段
	private Date ettaSubdate4;
	//预留字段
	private Date ettaSubdate3;
	//预留字段
	private Integer ettaSubnum3;
	//预留字段
	private Integer ettaSubnum2;
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
	//报关行ID
	private Integer ettaTrailerEbcuId;
	//报关行名称
	private String ettaTrailerNameCn;
	//提箱地ID：陆运任务
	private Integer ettaSuitcaseEbrgId;
	//还箱地ID：陆运任务
	private Integer ettaCratesEbrgId;
	//件数单位
	private String ettaQuantityUnit;
	//数量单位
	private String ettaNumberUnit;
	//作废人
	private String ettaVoider;
	//作废时间
	private Date ettaVoiderTime;
	//作废原因
	private String ettaVoidDesc;
	//预计提货时间
	private Date ettaDeliveryTime;
	//预计到货时间
	private Date ettaArrivalTime;
	//装车顺序
	private String ettaLoadSeq;
	//卸车顺序
	private String ettaUnLoadSeq;
	//任务资质名称列表
	private String ettaCertificationNameList;
	//用于建立TMS和OMS或其他第三方系统的任务数据的关系
	private String ettaFkSysId;
	//用于标记数据的来源系统
	private String ettaSourceSysFalg;
	
	//净重:陆运任务
	private Double ettaNetWeight;
	//用于保存分组号
	private Integer ettaGroupNum;

	// 牵引车资质要求
	private String ettaTractorReq;
	 //挂车资质要求
	private String ettaTrailerReq;
	 //运输人员车资质要求
	private String ettaTransportReq;
	//调度人ID：陆运任务
	private Integer ettaScheduleId;
	//调度人姓名：陆运任务
	private String ettaScheduleName;
	//运输单号
	private String ettaTransportNo;
	//配箱ID
	private Integer ettaEoocId;
 
	//最后执行状态
	private String ettaLastStatus;
 
	//返场时间
	private Date ettaReturnTime;
 
	//入库任务:收货时间
	private Date ettaReceiveTime;
 
	//出库任务:备货时间
	private Date ettaStockUpTime;
	
	
	//入场装货开始时间
	private String ettaStartLoadingTime;
	//入场装货完毕时间
	private String ettaFinishedLoadedTime;
	//费用计算状态
	private String ettaCostStatus;
	//费用计算结果 
	private String ettaFeeResult;

	private Integer ettaEtcaIdFirst;//原柜号ID：海运任务
	private String ettaEtcaNoFirst;//原柜号：海运任务
	private Integer ettaTransitEbptId;//转运港ID：海运任务
	private String ettaTransitEbptNameCn;//转运港：海运任务
	private Long ettaInnerMrId;// 增加内部委托集装箱表主键
	private String ettaSymbol;//ETTA_SYMBOL HD_数据处理标志
	private Date ettaBeginprocessingtime;//ETTA_BEGINPROCESSINGTIME HD_数据处理开始时间
	private Date ettaLastmodifiedtime;//ETTA_LASTMODIFIEDTIME  HD_数据处理时间
	private String ettaInformation;//ETTA_INFORMATION HD_数据处理信息
	private String ettaCtnSize;//ETTA_CTN_SIZE 箱尺寸
	private String ettaCtnStandard;//ETTA_CTN_STANDARD 箱规格
	
	private String ettaIsCheck;//是否验车
	
	//是否为调度指令(Y是调度指令
	private String ettaIsScheduleInstruction;
	//双拖键值(双拖时记住另一个任务id)
	private Long ettaDoubleId;
	//调度指令名称
	private String ettaEbsiName;
	
	//最新指令
	private String ettaLastInstruction;
	//空重状态
	private String ettaEmptyStatus;
	//任务描述
	private String ettaClassLineType;
	
	//检疫地点
	private String ettaQuarantineAds;
	//验木包装地点
	private String ettaWoodenPackagingAds;
	//熏蒸地点
	private String ettaFumigationAds;
	//动检地点
	private String ettaAnimalQuarantineAds;
	//提货仓库（收货人ID）  
	private Integer ettaStartEbspId;
	//收货仓库（收货人ID） 
	private Integer ettaEndEbspId;
	//提货仓库（收货人ID）  
	private String ettaBatchNo;
		//收货仓库（收货人ID） 
	private String ettaIsIntelscheduling;
	
	
	//是否导入过OTMS
	private String ettaIsImport;
	//OTMS订单号
	private String ettaOrderOtms;
	//OTMS轨迹地址
	private String ettaUrlOtms;
	
	@Column(name = "ETTA_START_EBSP_ID")
	public Integer getEttaStartEbspId() {
		return ettaStartEbspId;
	}

	public void setEttaStartEbspId(Integer ettaStartEbspId) {
		this.ettaStartEbspId = ettaStartEbspId;
	}

	@Column(name = "ETTA_END_EBSP_ID")
	public Integer getEttaEndEbspId() {
		return ettaEndEbspId;
	}

	public void setEttaEndEbspId(Integer ettaEndEbspId) {
		this.ettaEndEbspId = ettaEndEbspId;
	}

	@Column(name = "ETTA_CLASS_LINE_TYPE")
	public String getEttaClassLineType() {
		return ettaClassLineType;
	}

	public void setEttaClassLineType(String ettaClassLineType) {
		this.ettaClassLineType = ettaClassLineType;
		addValidField("ettaClassLineType");
	}

	@Column(name = "ETTA_IS_CHECK")
	public String getEttaIsCheck() {
		return ettaIsCheck;
	}

	public void setEttaIsCheck(String ettaIsCheck) {
		this.ettaIsCheck = ettaIsCheck;
		addValidField("ettaIsCheck");
	}

	@Column(name = "ETTA_SYMBOL")
	public String getEttaSymbol() {
		return ettaSymbol;
	}

	public void setEttaSymbol(String ettaSymbol) {
		this.ettaSymbol = ettaSymbol;
		addValidField("ettaSymbol");
	}

	@Column(name = "ETTA_BEGINPROCESSINGTIME")
	public Date getEttaBeginprocessingtime() {
		return ettaBeginprocessingtime;
	}

	public void setEttaBeginprocessingtime(Date ettaBeginprocessingtime) {
		this.ettaBeginprocessingtime = ettaBeginprocessingtime;
		addValidField("ettaBeginprocessingtime");
	}

	@Column(name = "ETTA_LASTMODIFIEDTIME")
	public Date getEttaLastmodifiedtime() {
		return ettaLastmodifiedtime;
	}

	public void setEttaLastmodifiedtime(Date ettaLastmodifiedtime) {
		this.ettaLastmodifiedtime = ettaLastmodifiedtime;
		addValidField("ettaLastmodifiedtime");
	}

	@Column(name = "ETTA_INFORMATION")
	public String getEttaInformation() {
		return ettaInformation;
	}

	public void setEttaInformation(String ettaInformation) {
		this.ettaInformation = ettaInformation;
		addValidField("ettaInformation");
	}

	@Column(name = "ETTA_CTN_SIZE")
	public String getEttaCtnSize() {
		return ettaCtnSize;
	}

	public void setEttaCtnSize(String ettaCtnSize) {
		this.ettaCtnSize = ettaCtnSize;
		addValidField("ettaCtnSize");
	}

	@Column(name = "ETTA_CTN_STANDARD")
	public String getEttaCtnStandard() {
		return ettaCtnStandard;
	}

	public void setEttaCtnStandard(String ettaCtnStandard) {
		this.ettaCtnStandard = ettaCtnStandard;
		addValidField("ettaCtnStandard");
	}

	@Column(name = "ETTA_INNER_MR_ID")
	public Long getEttaInnerMrId() {
		return ettaInnerMrId;
	}

	public void setEttaInnerMrId(Long ettaInnerMrId) {
		this.ettaInnerMrId = ettaInnerMrId;
		addValidField("ettaInnerMrId");
	}

	@Column(name = "ETTA_TRANSIT_EBPT_ID")
	public Integer getEttaTransitEbptId() {
		return ettaTransitEbptId;
	}

	public void setEttaTransitEbptId(Integer ettaTransitEbptId) {
		this.ettaTransitEbptId = ettaTransitEbptId;
		addValidField("ettaTransitEbptId");
	}

	@Column(name = "ETTA_TRANSIT_EBPT_NAME_CN")
	public String getEttaTransitEbptNameCn() {
		return ettaTransitEbptNameCn;
	}

	public void setEttaTransitEbptNameCn(String ettaTransitEbptNameCn) {
		this.ettaTransitEbptNameCn = ettaTransitEbptNameCn;
		addValidField("ettaTransitEbptNameCn");
	}
	
	@Column(name = "ETTA_ETCA_ID_FIRST")
	public Integer getEttaEtcaIdFirst() {
		return ettaEtcaIdFirst;
	}

	public void setEttaEtcaIdFirst(Integer ettaEtcaIdFirst) {
		this.ettaEtcaIdFirst = ettaEtcaIdFirst;
		addValidField("ettaEtcaIdFirst");
	}

	@Column(name = "ETTA_ETCA_NO_FIRST")
	public String getEttaEtcaNoFirst() {
		return ettaEtcaNoFirst;
	}

	public void setEttaEtcaNoFirst(String ettaEtcaNoFirst) {
		this.ettaEtcaNoFirst = ettaEtcaNoFirst;
		addValidField("ettaEtcaNoFirst");
	}
	
	@Column(name = "ETTA_FEE_RESULT")
	public String getEttaFeeResult() {
		return ettaFeeResult;
	}

	public void setEttaFeeResult(String ettaFeeResult) {
		this.ettaFeeResult = ettaFeeResult;
		addValidField("ettaFeeResult");
	}

	/**
	 * @return 运输单号
	 */
	@Column(name = "ETTA_TRANSPORT_NO")
	public String getEttaTransportNo() {
		return ettaTransportNo;
	}

	/**
	 * @param 运输单号
	 */
	public void setEttaTransportNo(String ettaTransportNo) {
		this.ettaTransportNo = ettaTransportNo;
		addValidField("ettaTransportNo");
	}

	/**
	 * Get 任务表主键
	 */
	@Column(name = "ETTA_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getEttaId() {
		return ettaId;
	}

	/**
	 * Set 任务表主键
	 */
	public void setEttaId(Integer ettaId) {
		this.ettaId = ettaId;
		addValidField("ettaId");
	}

	/**
	 * Get 订单ID
	 */
	@Column(name = "ETTA_ETOR_ID")
	public Integer getEttaEtorId() {
		return ettaEtorId;
	}

	/**
	 * Set 订单ID
	 */
	public void setEttaEtorId(Integer ettaEtorId) {
		this.ettaEtorId = ettaEtorId;
		addValidField("ettaEtorId");
	}

	/**
	 * Get 所属公司
	 */
	@Column(name = "ETTA_ESCO_ID")
	public Long getEttaEscoId() {
		return ettaEscoId;
	}

	/**
	 * Set 所属公司
	 */
	public void setEttaEscoId(Long ettaEscoId) {
		this.ettaEscoId = ettaEscoId;
		addValidField("ettaEscoId");
	}

	/**
	 * Get 调度计划主键
	 */
	@Column(name = "ETTA_ETSP_ID")
	public Integer getEttaEtspId() {
		return ettaEtspId;
	}

	/**
	 * Set 调度计划主键
	 */
	public void setEttaEtspId(Integer ettaEtspId) {
		this.ettaEtspId = ettaEtspId;
		addValidField("ettaEtspId");
	}

	/**
	 * Get 任务编号:所有任务
	 */
	@Column(name = "ETTA_NO")
	public String getEttaNo() {
		return ettaNo;
	}

	/**
	 * Set 任务编号:所有任务
	 */
	public void setEttaNo(String ettaNo) {
		this.ettaNo = ettaNo;
		addValidField("ettaNo");
	}

	/**
	 * Get 任务拆分状态0.未拆分
	 * 1.拆分
	 */
	@Column(name = "ETTA_SPLIT_STATUS")
	public String getEttaSplitStatus() {
		return ettaSplitStatus;
	}

	/**
	 * Set 任务拆分状态0.未拆分
	 * 1.拆分
	 */
	public void setEttaSplitStatus(String ettaSplitStatus) {
		this.ettaSplitStatus = ettaSplitStatus;
		addValidField("ettaSplitStatus");
	}

	/**
	 * Get 任务类型
	 */
	@Column(name = "ETTA_TYPE")
	public String getEttaType() {
		return ettaType;
	}

	/**
	 * Set 任务类型
	 */
	public void setEttaType(String ettaType) {
		this.ettaType = ettaType;
		addValidField("ettaType");
	}

	/**
	 * Get 任务状态:所有任务
	 */
	@Column(name = "ETTA_STATUS")
	public String getEttaStatus() {
		return ettaStatus;
	}

	/**
	 * Set 任务状态:所有任务
	 */
	public void setEttaStatus(String ettaStatus) {
		this.ettaStatus = ettaStatus;
		addValidField("ettaStatus");
	}

	/**
	 * Get 任务顺序
	 */
	@Column(name = "ETTA_ORDER")
	public Integer getEttaOrder() {
		return ettaOrder;
	}

	/**
	 * Set 任务顺序
	 */
	public void setEttaOrder(Integer ettaOrder) {
		this.ettaOrder = ettaOrder;
		addValidField("ettaOrder");
	}

	/**
	 * Get 上级任务
	 */
	@Column(name = "ETTA_SELF_ID")
	public Integer getEttaSelfId() {
		return ettaSelfId;
	}

	/**
	 * Set 上级任务
	 */
	public void setEttaSelfId(Integer ettaSelfId) {
		this.ettaSelfId = ettaSelfId;
		addValidField("ettaSelfId");
	}

	/**
	 * Get SO
	 * NO除了进口拖车
	 * 出口拖车任务
	 * 其他任务公用
	 */
	@Column(name = "ETTA_SO_NO")
	public String getEttaSoNo() {
		return ettaSoNo;
	}

	/**
	 * Set SO
	 * NO除了进口拖车
	 * 出口拖车任务
	 * 其他任务公用
	 */
	public void setEttaSoNo(String ettaSoNo) {
		this.ettaSoNo = ettaSoNo;
		addValidField("ettaSoNo");
	}

	/**
	 * Get DO
	 * NO
	 */
	@Column(name = "ETTA_DO_NO")
	public String getEttaDoNo() {
		return ettaDoNo;
	}

	/**
	 * Set DO
	 * NO
	 */
	public void setEttaDoNo(String ettaDoNo) {
		this.ettaDoNo = ettaDoNo;
		addValidField("ettaDoNo");
	}

	/**
	 * Get 陆运公司ID:陆运任务
	 */
	@Column(name = "ETTA_LAND_EBCU_ID")
	public Integer getEttaLandEbcuId() {
		return ettaLandEbcuId;
	}

	/**
	 * Set 陆运公司ID:陆运任务
	 */
	public void setEttaLandEbcuId(Integer ettaLandEbcuId) {
		this.ettaLandEbcuId = ettaLandEbcuId;
		addValidField("ettaLandEbcuId");
	}

	/**
	 * Get 陆运公司全称：陆运任务
	 */
	@Column(name = "ETTA_LAND_EBCU_NAME_CN")
	public String getEttaLandEbcuNameCn() {
		return ettaLandEbcuNameCn;
	}

	/**
	 * Set 陆运公司全称：陆运任务
	 */
	public void setEttaLandEbcuNameCn(String ettaLandEbcuNameCn) {
		this.ettaLandEbcuNameCn = ettaLandEbcuNameCn;
		addValidField("ettaLandEbcuNameCn");
	}

	/**
	 * Get 客户ID：陆运任务
	 */
	@Column(name = "ETTA_CUSTOMER_EBCU_ID")
	public Integer getEttaCustomerEbcuId() {
		return ettaCustomerEbcuId;
	}

	/**
	 * Set 客户ID：陆运任务
	 */
	public void setEttaCustomerEbcuId(Integer ettaCustomerEbcuId) {
		this.ettaCustomerEbcuId = ettaCustomerEbcuId;
		addValidField("ettaCustomerEbcuId");
	}

	/**
	 * Get 客户名称：陆运任务
	 */
	@Column(name = "ETTA_CUSTOMER_EBCU_NAME_CN")
	public String getEttaCustomerEbcuNameCn() {
		return ettaCustomerEbcuNameCn;
	}

	/**
	 * Set 客户名称：陆运任务
	 */
	public void setEttaCustomerEbcuNameCn(String ettaCustomerEbcuNameCn) {
		this.ettaCustomerEbcuNameCn = ettaCustomerEbcuNameCn;
		addValidField("ettaCustomerEbcuNameCn");
	}

	/**
	 * Get 紧急程度：陆运任务
	 */
	@Column(name = "ETTA_URGENCY")
	public String getEttaUrgency() {
		return ettaUrgency;
	}

	/**
	 * Set 紧急程度：陆运任务
	 */
	public void setEttaUrgency(String ettaUrgency) {
		this.ettaUrgency = ettaUrgency;
		addValidField("ettaUrgency");
	}

	/**
	 * Get 要求提货时间：陆运任务
	 */
	@Column(name = "ETTA_DELIVERY_REQ_TIME")
	public Date getEttaDeliveryReqTime() {
		return ettaDeliveryReqTime;
	}

	/**
	 * Set 要求提货时间：陆运任务
	 */
	public void setEttaDeliveryReqTime(Date ettaDeliveryReqTime) {
		this.ettaDeliveryReqTime = ettaDeliveryReqTime;
		addValidField("ettaDeliveryReqTime");
	}

	/**
	 * Get 任务安排时间：陆运任务
	 */
	@Column(name = "ETTA_TASK_SCHEDULE_TIME")
	public Date getEttaTaskScheduleTime() {
		return ettaTaskScheduleTime;
	}

	/**
	 * Set 任务安排时间：陆运任务
	 */
	public void setEttaTaskScheduleTime(Date ettaTaskScheduleTime) {
		this.ettaTaskScheduleTime = ettaTaskScheduleTime;
		addValidField("ettaTaskScheduleTime");
	}

	/**
	 * Get 要求到货时间:陆运任务
	 */
	@Column(name = "ETTA_ARRIVAL_REQ_TIME")
	public Date getEttaArrivalReqTime() {
		return ettaArrivalReqTime;
	}

	/**
	 * Set 要求到货时间:陆运任务
	 */
	public void setEttaArrivalReqTime(Date ettaArrivalReqTime) {
		this.ettaArrivalReqTime = ettaArrivalReqTime;
		addValidField("ettaArrivalReqTime");
	}

	/**
	 * Get 提柜时间:陆运任务
	 */
	@Column(name = "ETTA_MENTION_TIME")
	public Date getEttaMentionTime() {
		return ettaMentionTime;
	}

	/**
	 * Set 提柜时间:陆运任务
	 */
	public void setEttaMentionTime(Date ettaMentionTime) {
		this.ettaMentionTime = ettaMentionTime;
		addValidField("ettaMentionTime");
	}

	/**
	 * Get 运输特殊要求:陆运任务
	 */
	@Column(name = "ETTA_TRANS_SPE_REQ")
	public String getEttaTransSpeReq() {
		return ettaTransSpeReq;
	}

	/**
	 * Set 运输特殊要求:陆运任务
	 */
	public void setEttaTransSpeReq(String ettaTransSpeReq) {
		this.ettaTransSpeReq = ettaTransSpeReq;
		addValidField("ettaTransSpeReq");
	}

	/**
	 * Get 收货人收货特殊要求:陆运任务
	 */
	@Column(name = "ETTA_RECEIVE_SPE_REQ")
	public String getEttaReceiveSpeReq() {
		return ettaReceiveSpeReq;
	}

	/**
	 * Set 收货人收货特殊要求:陆运任务
	 */
	public void setEttaReceiveSpeReq(String ettaReceiveSpeReq) {
		this.ettaReceiveSpeReq = ettaReceiveSpeReq;
		addValidField("ettaReceiveSpeReq");
	}

	/**
	 * Get 行车路线描述:陆运任务
	 */
	@Column(name = "ETTA_LINE_DESC")
	public String getEttaLineDesc() {
		return ettaLineDesc;
	}

	/**
	 * Set 行车路线描述:陆运任务
	 */
	public void setEttaLineDesc(String ettaLineDesc) {
		this.ettaLineDesc = ettaLineDesc;
		addValidField("ettaLineDesc");
	}

	/**
	 * Get 箱型:陆运任务
	 * 海运任务
	 * 铁路任务
	 */
	@Column(name = "ETTA_CONTAINER_TYPE")
	public String getEttaContainerType() {
		return ettaContainerType;
	}

	/**
	 * Set 箱型:陆运任务
	 * 海运任务
	 * 铁路任务
	 */
	public void setEttaContainerType(String ettaContainerType) {
		this.ettaContainerType = ettaContainerType;
		addValidField("ettaContainerType");
	}

	/**
	 * Get 箱量:陆运任务
	 * 海运任务
	 */
	@Column(name = "ETTA_CONTAINER_WEIGHT")
	public String getEttaContainerWeight() {
		return ettaContainerWeight;
	}

	/**
	 * Set 箱量:陆运任务
	 * 海运任务
	 */
	public void setEttaContainerWeight(String ettaContainerWeight) {
		this.ettaContainerWeight = ettaContainerWeight;
		addValidField("ettaContainerWeight");
	}

	/**
	 * Get 是否白卡:陆运任务
	 */
	@Column(name = "ETTA_IS_WHITE_CARD")
	public String getEttaIsWhiteCard() {
		return ettaIsWhiteCard;
	}

	/**
	 * Set 是否白卡:陆运任务
	 */
	public void setEttaIsWhiteCard(String ettaIsWhiteCard) {
		this.ettaIsWhiteCard = ettaIsWhiteCard;
		addValidField("ettaIsWhiteCard");
	}

	/**
	 * Get 是否短驳:陆运任务
	 */
	@Column(name = "ETTA_IS_SHORT_BARGE")
	public String getEttaIsShortBarge() {
		return ettaIsShortBarge;
	}

	/**
	 * Set 是否短驳:陆运任务
	 */
	public void setEttaIsShortBarge(String ettaIsShortBarge) {
		this.ettaIsShortBarge = ettaIsShortBarge;
		addValidField("ettaIsShortBarge");
	}

	/**
	 * Get 是否包车:陆运任务
	 */
	@Column(name = "ETTA_IS_CHARTERED")
	public String getEttaIsChartered() {
		return ettaIsChartered;
	}

	/**
	 * Set 是否包车:陆运任务
	 */
	public void setEttaIsChartered(String ettaIsChartered) {
		this.ettaIsChartered = ettaIsChartered;
		addValidField("ettaIsChartered");
	}

	/**
	 * Get 是否可拼:陆运任务
	 */
	@Column(name = "ETTA_IS_TO_FIGHT")
	public String getEttaIsToFight() {
		return ettaIsToFight;
	}

	/**
	 * Set 是否可拼:陆运任务
	 */
	public void setEttaIsToFight(String ettaIsToFight) {
		this.ettaIsToFight = ettaIsToFight;
		addValidField("ettaIsToFight");
	}

	/**
	 * Get 起运地ID:陆运任务
	 */
	@Column(name = "ETTA_FROM_EBRG_ID")
	public Integer getEttaFromEbrgId() {
		return ettaFromEbrgId;
	}

	/**
	 * Set 起运地ID:陆运任务
	 */
	public void setEttaFromEbrgId(Integer ettaFromEbrgId) {
		this.ettaFromEbrgId = ettaFromEbrgId;
		addValidField("ettaFromEbrgId");
	}

	/**
	 * Get 起运地名称:陆运任务
	 */
	@Column(name = "ETTA_FROM_EBRG_NAME_CN")
	public String getEttaFromEbrgNameCn() {
		return ettaFromEbrgNameCn;
	}

	/**
	 * Set 起运地名称:陆运任务
	 */
	public void setEttaFromEbrgNameCn(String ettaFromEbrgNameCn) {
		this.ettaFromEbrgNameCn = ettaFromEbrgNameCn;
		addValidField("ettaFromEbrgNameCn");
	}

	/**
	 * Get 目的地ID:陆运任务
	 */
	@Column(name = "ETTA_TO_EBRG_ID")
	public Integer getEttaToEbrgId() {
		return ettaToEbrgId;
	}

	/**
	 * Set 目的地ID:陆运任务
	 */
	public void setEttaToEbrgId(Integer ettaToEbrgId) {
		this.ettaToEbrgId = ettaToEbrgId;
		addValidField("ettaToEbrgId");
	}

	/**
	 * Get 目的地名称:陆运任务
	 */
	@Column(name = "ETTA_TO_EBRG_NAME_CN")
	public String getEttaToEbrgNameCn() {
		return ettaToEbrgNameCn;
	}

	/**
	 * Set 目的地名称:陆运任务
	 */
	public void setEttaToEbrgNameCn(String ettaToEbrgNameCn) {
		this.ettaToEbrgNameCn = ettaToEbrgNameCn;
		addValidField("ettaToEbrgNameCn");
	}

	/**
	 * Get 重量:陆运任务
	 * 海运任务
	 * 铁路任务
	 */
	@Column(name = "ETTA_WEIGHT")
	public Double getEttaWeight() {
		return ettaWeight;
	}

	/**
	 * Set 重量:陆运任务
	 * 海运任务
	 * 铁路任务
	 */
	public void setEttaWeight(Double ettaWeight) {
		this.ettaWeight = ettaWeight;
		addValidField("ettaWeight");
	}

	/**
	 * Get 件数:陆运任务
	 * 海运任务
	 * 铁路任务
	 */
	@Column(name = "ETTA_QUANTITY")
	public Integer getEttaQuantity() {
		return ettaQuantity;
	}

	/**
	 * Set 件数:陆运任务
	 * 海运任务
	 * 铁路任务
	 */
	public void setEttaQuantity(Integer ettaQuantity) {
		this.ettaQuantity = ettaQuantity;
		addValidField("ettaQuantity");
	}

	/**
	 * Get 体积:陆运任务
	 * 海运任务
	 * 铁路任务
	 */
	@Column(name = "ETTA_VOLUME")
	public Double getEttaVolume() {
		return ettaVolume;
	}

	/**
	 * Set 体积:陆运任务
	 * 海运任务
	 * 铁路任务
	 */
	public void setEttaVolume(Double ettaVolume) {
		this.ettaVolume = ettaVolume;
		addValidField("ettaVolume");
	}

	/**
	 * Get 提货地址:陆运任务
	 */
	@Column(name = "ETTA_DELIVERY_ADDRESS")
	public String getEttaDeliveryAddress() {
		return ettaDeliveryAddress;
	}

	/**
	 * Set 提货地址:陆运任务
	 */
	public void setEttaDeliveryAddress(String ettaDeliveryAddress) {
		this.ettaDeliveryAddress = ettaDeliveryAddress;
		addValidField("ettaDeliveryAddress");
	}

	/**
	 * Get 收货地址:陆运任务
	 */
	@Column(name = "ETTA_RECEIVE_ADDRESS")
	public String getEttaReceiveAddress() {
		return ettaReceiveAddress;
	}

	/**
	 * Set 收货地址:陆运任务
	 */
	public void setEttaReceiveAddress(String ettaReceiveAddress) {
		this.ettaReceiveAddress = ettaReceiveAddress;
		addValidField("ettaReceiveAddress");
	}

	/**
	 * Get 备注:所有任务
	 */
	@Column(name = "ETTA_REMARK")
	public String getEttaRemark() {
		return ettaRemark;
	}

	/**
	 * Set 备注:所有任务
	 */
	public void setEttaRemark(String ettaRemark) {
		this.ettaRemark = ettaRemark;
		addValidField("ettaRemark");
	}

	/**
	 * Get 出/入库单号:出入库任务
	 */
	@Column(name = "ETTA_LIBRARY_NO")
	public String getEttaLibraryNo() {
		return ettaLibraryNo;
	}

	/**
	 * Set 出/入库单号:出入库任务
	 */
	public void setEttaLibraryNo(String ettaLibraryNo) {
		this.ettaLibraryNo = ettaLibraryNo;
		addValidField("ettaLibraryNo");
	}

	/**
	 * Get 出/入库时间:出入库任务
	 */
	@Column(name = "ETTA_LIBRARY_TIME")
	public Date getEttaLibraryTime() {
		return ettaLibraryTime;
	}

	/**
	 * Set 出/入库时间:出入库任务
	 */
	public void setEttaLibraryTime(Date ettaLibraryTime) {
		this.ettaLibraryTime = ettaLibraryTime;
		addValidField("ettaLibraryTime");
	}

	/**
	 * Get 出/入仓库/报关行/航空公司/船ID:出入库任务
	 * 报关任务
	 * 海运任务
	 * 空运任务
	 */
	@Column(name = "ETTA_EBCU_ID")
	public Integer getEttaEbcuId() {
		return ettaEbcuId;
	}

	/**
	 * Set 出/入仓库/报关行/航空公司/船ID:出入库任务
	 * 报关任务
	 * 海运任务
	 * 空运任务
	 */
	public void setEttaEbcuId(Integer ettaEbcuId) {
		this.ettaEbcuId = ettaEbcuId;
		addValidField("ettaEbcuId");
	}

	/**
	 * Get 出/入仓库/报关行/航空公司/船名称:出入库任务
	 * 报关任务
	 * 海运任务
	 * 空运任务
	 */
	@Column(name = "ETTA_EBCU_NAME_CN")
	public String getEttaEbcuNameCn() {
		return ettaEbcuNameCn;
	}

	/**
	 * Set 出/入仓库/报关行/航空公司/船名称:出入库任务
	 * 报关任务
	 * 海运任务
	 * 空运任务
	 */
	public void setEttaEbcuNameCn(String ettaEbcuNameCn) {
		this.ettaEbcuNameCn = ettaEbcuNameCn;
		addValidField("ettaEbcuNameCn");
	}

	/**
	 * Get 出/入仓数量:出入库任务
	 */
	@Column(name = "ETTA_LIBRARY_NUMBER")
	public Integer getEttaLibraryNumber() {
		return ettaLibraryNumber;
	}

	/**
	 * Set 出/入仓数量:出入库任务
	 */
	public void setEttaLibraryNumber(Integer ettaLibraryNumber) {
		this.ettaLibraryNumber = ettaLibraryNumber;
		addValidField("ettaLibraryNumber");
	}

	/**
	 * Get 出/入合计件数:出入库任务
	 */
	@Column(name = "ETTA_LIBRARY_QUANTITY")
	public Integer getEttaLibraryQuantity() {
		return ettaLibraryQuantity;
	}

	/**
	 * Set 出/入合计件数:出入库任务
	 */
	public void setEttaLibraryQuantity(Integer ettaLibraryQuantity) {
		this.ettaLibraryQuantity = ettaLibraryQuantity;
		addValidField("ettaLibraryQuantity");
	}

	/**
	 * Get 出/入合计体积:出入库任务
	 */
	@Column(name = "ETTA_LIBRARY_VOLUME")
	public Integer getEttaLibraryVolume() {
		return ettaLibraryVolume;
	}

	/**
	 * Set 出/入合计体积:出入库任务
	 */
	public void setEttaLibraryVolume(Integer ettaLibraryVolume) {
		this.ettaLibraryVolume = ettaLibraryVolume;
		addValidField("ettaLibraryVolume");
	}

	/**
	 * Get 出/入合计毛重:出入库任务
	 */
	@Column(name = "ETTA_LIBRARY_GW")
	public Integer getEttaLibraryGw() {
		return ettaLibraryGw;
	}

	/**
	 * Set 出/入合计毛重:出入库任务
	 */
	public void setEttaLibraryGw(Integer ettaLibraryGw) {
		this.ettaLibraryGw = ettaLibraryGw;
		addValidField("ettaLibraryGw");
	}

	/**
	 * Get 出/入合计净重:出入库任务
	 */
	@Column(name = "ETTA_LIBRARY_NW")
	public Integer getEttaLibraryNw() {
		return ettaLibraryNw;
	}

	/**
	 * Set 出/入合计净重:出入库任务
	 */
	public void setEttaLibraryNw(Integer ettaLibraryNw) {
		this.ettaLibraryNw = ettaLibraryNw;
		addValidField("ettaLibraryNw");
	}

	/**
	 * Get 订舱代理ID:海运任务
	 * 铁路任务
	 * 海运任务
	 */
	@Column(name = "ETTA_BOOKING_EBCU_ID")
	public Integer getEttaBookingEbcuId() {
		return ettaBookingEbcuId;
	}

	/**
	 * Set 订舱代理ID:海运任务
	 * 铁路任务
	 * 海运任务
	 */
	public void setEttaBookingEbcuId(Integer ettaBookingEbcuId) {
		this.ettaBookingEbcuId = ettaBookingEbcuId;
		addValidField("ettaBookingEbcuId");
	}

	/**
	 * Get 订舱代理:海运任务
	 * 铁路任务
	 * 海运任务
	 */
	@Column(name = "ETTA_BOOKING_EBCU_NAME_CN")
	public String getEttaBookingEbcuNameCn() {
		return ettaBookingEbcuNameCn;
	}

	/**
	 * Set 订舱代理:海运任务
	 * 铁路任务
	 * 海运任务
	 */
	public void setEttaBookingEbcuNameCn(String ettaBookingEbcuNameCn) {
		this.ettaBookingEbcuNameCn = ettaBookingEbcuNameCn;
		addValidField("ettaBookingEbcuNameCn");
	}

	/**
	 * Get 订舱单号:海运任务
	 * 空运任务
	 */
	@Column(name = "ETTA_BOOKING_NO")
	public String getEttaBookingNo() {
		return ettaBookingNo;
	}

	/**
	 * Set 订舱单号:海运任务
	 * 空运任务
	 */
	public void setEttaBookingNo(String ettaBookingNo) {
		this.ettaBookingNo = ettaBookingNo;
		addValidField("ettaBookingNo");
	}

	/**
	 * Get 关单号:海运任务
	 */
	@Column(name = "ETTA_CUSTOM_NO")
	public String getEttaCustomNo() {
		return ettaCustomNo;
	}

	/**
	 * Set 关单号:海运任务
	 */
	public void setEttaCustomNo(String ettaCustomNo) {
		this.ettaCustomNo = ettaCustomNo;
		addValidField("ettaCustomNo");
	}

	/**
	 * Get 船名:海运任务
	 * 出口拖车任务
	 */
	@Column(name = "ETTA_VESSEL")
	public String getEttaVessel() {
		return ettaVessel;
	}

	/**
	 * Set 船名:海运任务
	 * 出口拖车任务
	 */
	public void setEttaVessel(String ettaVessel) {
		this.ettaVessel = ettaVessel;
		addValidField("ettaVessel");
	}

	/**
	 * Get 航次:海运任务
	 * 出口拖车任务
	 * 空运任务
	 */
	@Column(name = "ETTA_VOYAGE")
	public String getEttaVoyage() {
		return ettaVoyage;
	}

	/**
	 * Set 航次:海运任务
	 * 出口拖车任务
	 * 空运任务
	 */
	public void setEttaVoyage(String ettaVoyage) {
		this.ettaVoyage = ettaVoyage;
		addValidField("ettaVoyage");
	}

	/**
	 * Get 开航日期:海运任务
	 * 出口拖车任务
	 * 铁路任务
	 * 空运任务
	 */
	@Column(name = "ETTA_DEPARTURE_DATE")
	public Date getEttaDepartureDate() {
		return ettaDepartureDate;
	}

	/**
	 * Set 开航日期:海运任务
	 * 出口拖车任务
	 * 铁路任务
	 * 空运任务
	 */
	public void setEttaDepartureDate(Date ettaDepartureDate) {
		this.ettaDepartureDate = ettaDepartureDate;
		addValidField("ettaDepartureDate");
	}

	/**
	 * Get 预计开航日期:海运任务
	 * 铁路任务
	 * 空运任务
	 */
	@Column(name = "ETTA_PLAN_DEPARTURE_DATE")
	public Date getEttaPlanDepartureDate() {
		return ettaPlanDepartureDate;
	}

	/**
	 * Set 预计开航日期:海运任务
	 * 铁路任务
	 * 空运任务
	 */
	public void setEttaPlanDepartureDate(Date ettaPlanDepartureDate) {
		this.ettaPlanDepartureDate = ettaPlanDepartureDate;
		addValidField("ettaPlanDepartureDate");
	}

	/**
	 * Get 预计到港日期:海运任务
	 * 铁路任务
	 * 空运任务
	 */
	@Column(name = "ETTA_PLAN_ARRIVAL_DATE")
	public Date getEttaPlanArrivalDate() {
		return ettaPlanArrivalDate;
	}

	/**
	 * Set 预计到港日期:海运任务
	 * 铁路任务
	 * 空运任务
	 */
	public void setEttaPlanArrivalDate(Date ettaPlanArrivalDate) {
		this.ettaPlanArrivalDate = ettaPlanArrivalDate;
		addValidField("ettaPlanArrivalDate");
	}

	/**
	 * Get 到港日期:海运任务
	 * 铁路任务
	 * 空运任务
	 */
	@Column(name = "ETTA_ARRIVAL_DATE")
	public Date getEttaArrivalDate() {
		return ettaArrivalDate;
	}

	/**
	 * Set 到港日期:海运任务
	 * 铁路任务
	 * 空运任务
	 */
	public void setEttaArrivalDate(Date ettaArrivalDate) {
		this.ettaArrivalDate = ettaArrivalDate;
		addValidField("ettaArrivalDate");
	}

	/**
	 * Get 装箱时间:海运任务
	 * 进口拖车任务
	 */
	@Column(name = "ETTA_PACKING_TIME")
	public Date getEttaPackingTime() {
		return ettaPackingTime;
	}

	/**
	 * Set 装箱时间:海运任务
	 * 进口拖车任务
	 */
	public void setEttaPackingTime(Date ettaPackingTime) {
		this.ettaPackingTime = ettaPackingTime;
		addValidField("ettaPackingTime");
	}

	/**
	 * Get 集港时间:海运任务
	 */
	@Column(name = "ETTA_SET_POST_TIME")
	public Date getEttaSetPostTime() {
		return ettaSetPostTime;
	}

	/**
	 * Set 集港时间:海运任务
	 */
	public void setEttaSetPostTime(Date ettaSetPostTime) {
		this.ettaSetPostTime = ettaSetPostTime;
		addValidField("ettaSetPostTime");
	}

	/**
	 * Get 截重时间:海运任务
	 */
	@Column(name = "ETTA_WEIGHT_TIME")
	public Date getEttaWeightTime() {
		return ettaWeightTime;
	}

	/**
	 * Set 截重时间:海运任务
	 */
	public void setEttaWeightTime(Date ettaWeightTime) {
		this.ettaWeightTime = ettaWeightTime;
		addValidField("ettaWeightTime");
	}

	/**
	 * Get 截关时间:海运任务
	 */
	@Column(name = "ETTA_CUT_TIME")
	public Date getEttaCutTime() {
		return ettaCutTime;
	}

	/**
	 * Set 截关时间:海运任务
	 */
	public void setEttaCutTime(Date ettaCutTime) {
		this.ettaCutTime = ettaCutTime;
		addValidField("ettaCutTime");
	}

	/**
	 * Get 起运港ID:海运任务
	 * 空运任务
	 */
	@Column(name = "ETTA_START_EBPT_ID")
	public Integer getEttaStartEbptId() {
		return ettaStartEbptId;
	}

	/**
	 * Set 起运港ID:海运任务
	 * 空运任务
	 */
	public void setEttaStartEbptId(Integer ettaStartEbptId) {
		this.ettaStartEbptId = ettaStartEbptId;
		addValidField("ettaStartEbptId");
	}

	/**
	 * Get 起运港名称:海运任务
	 * 空运任务
	 */
	@Column(name = "ETTA_START_EBPT_NAME_CN")
	public String getEttaStartEbptNameCn() {
		return ettaStartEbptNameCn;
	}

	/**
	 * Set 起运港名称:海运任务
	 * 空运任务
	 */
	public void setEttaStartEbptNameCn(String ettaStartEbptNameCn) {
		this.ettaStartEbptNameCn = ettaStartEbptNameCn;
		addValidField("ettaStartEbptNameCn");
	}

	/**
	 * Get 目的港ID:海运任务
	 * 空运任务
	 */
	@Column(name = "ETTA_END_EBPT_ID")
	public Integer getEttaEndEbptId() {
		return ettaEndEbptId;
	}

	/**
	 * Set 目的港ID:海运任务
	 * 空运任务
	 */
	public void setEttaEndEbptId(Integer ettaEndEbptId) {
		this.ettaEndEbptId = ettaEndEbptId;
		addValidField("ettaEndEbptId");
	}

	/**
	 * Get 目的港名称:海运任务
	 * 空运任务
	 */
	@Column(name = "ETTA_END_EBPT_NAME_CN")
	public String getEttaEndEbptNameCn() {
		return ettaEndEbptNameCn;
	}

	/**
	 * Set 目的港名称:海运任务
	 * 空运任务
	 */
	public void setEttaEndEbptNameCn(String ettaEndEbptNameCn) {
		this.ettaEndEbptNameCn = ettaEndEbptNameCn;
		addValidField("ettaEndEbptNameCn");
	}

	/**
	 * Get MBL:海运任务
	 */
	@Column(name = "ETTA_MBL_NO")
	public String getEttaMblNo() {
		return ettaMblNo;
	}

	/**
	 * Set MBL:海运任务
	 */
	public void setEttaMblNo(String ettaMblNo) {
		this.ettaMblNo = ettaMblNo;
		addValidField("ettaMblNo");
	}

	/**
	 * Get HBL:海运任务
	 */
	@Column(name = "ETTA_HBL_NO")
	public String getEttaHblNo() {
		return ettaHblNo;
	}

	/**
	 * Set HBL:海运任务
	 */
	public void setEttaHblNo(String ettaHblNo) {
		this.ettaHblNo = ettaHblNo;
		addValidField("ettaHblNo");
	}

	/**
	 * Get 箱ID:海运任务
	 */
	@Column(name = "ETTA_ETCA_ID")
	public Integer getEttaEtcaId() {
		return ettaEtcaId;
	}

	/**
	 * Set 箱ID:海运任务
	 */
	public void setEttaEtcaId(Integer ettaEtcaId) {
		this.ettaEtcaId = ettaEtcaId;
		addValidField("ettaEtcaId");
	}

	/**
	 * Get 箱号:海运任务
	 * 出口拖车任务
	 */
	@Column(name = "ETTA_ETCA_NO")
	public String getEttaEtcaNo() {
		return ettaEtcaNo;
	}

	/**
	 * Set 箱号:海运任务
	 * 出口拖车任务
	 */
	public void setEttaEtcaNo(String ettaEtcaNo) {
		this.ettaEtcaNo = ettaEtcaNo;
		addValidField("ettaEtcaNo");
	}

	/**
	 * Get 封号:海运任务
	 * 出口拖车任务
	 */
	@Column(name = "ETTA_TITLE_NO")
	public String getEttaTitleNo() {
		return ettaTitleNo;
	}

	/**
	 * Set 封号:海运任务
	 * 出口拖车任务
	 */
	public void setEttaTitleNo(String ettaTitleNo) {
		this.ettaTitleNo = ettaTitleNo;
		addValidField("ettaTitleNo");
	}

	/**
	 * Get 报关类型:报关任务
	 */
	@Column(name = "ETTA_CUSTOM_TYPE")
	public String getEttaCustomType() {
		return ettaCustomType;
	}

	/**
	 * Set 报关类型:报关任务
	 */
	public void setEttaCustomType(String ettaCustomType) {
		this.ettaCustomType = ettaCustomType;
		addValidField("ettaCustomType");
	}

	/**
	 * Get 文件编号:报关任务
	 */
	@Column(name = "ETTA_FILE_NO")
	public String getEttaFileNo() {
		return ettaFileNo;
	}

	/**
	 * Set 文件编号:报关任务
	 */
	public void setEttaFileNo(String ettaFileNo) {
		this.ettaFileNo = ettaFileNo;
		addValidField("ettaFileNo");
	}

	/**
	 * Get 文件类型:报关任务
	 */
	@Column(name = "ETTA_FILE_TYPE")
	public String getEttaFileType() {
		return ettaFileType;
	}

	/**
	 * Set 文件类型:报关任务
	 */
	public void setEttaFileType(String ettaFileType) {
		this.ettaFileType = ettaFileType;
		addValidField("ettaFileType");
	}

	/**
	 * Get 放行时间:报关任务
	 * 出口拖车任务
	 */
	@Column(name = "ETTA_RELEASE_TIME")
	public Date getEttaReleaseTime() {
		return ettaReleaseTime;
	}

	/**
	 * Set 放行时间:报关任务
	 * 出口拖车任务
	 */
	public void setEttaReleaseTime(Date ettaReleaseTime) {
		this.ettaReleaseTime = ettaReleaseTime;
		addValidField("ettaReleaseTime");
	}

	/**
	 * Get 送单时间:报关任务
	 */
	@Column(name = "ETTA_SEND_TIME")
	public Date getEttaSendTime() {
		return ettaSendTime;
	}

	/**
	 * Set 送单时间:报关任务
	 */
	public void setEttaSendTime(Date ettaSendTime) {
		this.ettaSendTime = ettaSendTime;
		addValidField("ettaSendTime");
	}

	/**
	 * Get 回单时间:报关任务
	 */
	@Column(name = "ETTA_BACK_TIME")
	public Date getEttaBackTime() {
		return ettaBackTime;
	}

	/**
	 * Set 回单时间:报关任务
	 */
	public void setEttaBackTime(Date ettaBackTime) {
		this.ettaBackTime = ettaBackTime;
		addValidField("ettaBackTime");
	}

	/**
	 * Get 报关地点:报关任务
	 */
	@Column(name = "ETTA_CUSTOM_PLACE")
	public String getEttaCustomPlace() {
		return ettaCustomPlace;
	}

	/**
	 * Set 报关地点:报关任务
	 */
	public void setEttaCustomPlace(String ettaCustomPlace) {
		this.ettaCustomPlace = ettaCustomPlace;
		addValidField("ettaCustomPlace");
	}

	/**
	 * Get 口岸报关行ID:报关任务
	 * 进口拖车任务
	 */
	@Column(name = "ETTA_PORT_EBCU_ID")
	public Integer getEttaPortEbcuId() {
		return ettaPortEbcuId;
	}

	/**
	 * Set 口岸报关行ID:报关任务
	 * 进口拖车任务
	 */
	public void setEttaPortEbcuId(Integer ettaPortEbcuId) {
		this.ettaPortEbcuId = ettaPortEbcuId;
		addValidField("ettaPortEbcuId");
	}

	/**
	 * Get 口岸报关行名称:报关任务
	 * 进口拖车任务
	 */
	@Column(name = "ETTA_PORT_EBCU_NAME_CN")
	public String getEttaPortEbcuNameCn() {
		return ettaPortEbcuNameCn;
	}

	/**
	 * Set 口岸报关行名称:报关任务
	 * 进口拖车任务
	 */
	public void setEttaPortEbcuNameCn(String ettaPortEbcuNameCn) {
		this.ettaPortEbcuNameCn = ettaPortEbcuNameCn;
		addValidField("ettaPortEbcuNameCn");
	}

	/**
	 * Get 口岸报关地点:报关任务
	 */
	@Column(name = "ETTA_PORT_ADDRESS")
	public String getEttaPortAddress() {
		return ettaPortAddress;
	}

	/**
	 * Set 口岸报关地点:报关任务
	 */
	public void setEttaPortAddress(String ettaPortAddress) {
		this.ettaPortAddress = ettaPortAddress;
		addValidField("ettaPortAddress");
	}

	/**
	 * Get 装箱地址：进出口拖车任务
	 */
	@Column(name = "ETTA_PACKING_ADDRESS")
	public String getEttaPackingAddress() {
		return ettaPackingAddress;
	}

	/**
	 * Set 装箱地址：进出口拖车任务
	 */
	public void setEttaPackingAddress(String ettaPackingAddress) {
		this.ettaPackingAddress = ettaPackingAddress;
		addValidField("ettaPackingAddress");
	}

	/**
	 * Get 理货日期：进出口拖车任务
	 */
	@Column(name = "ETTA_TALLY_DATE")
	public Date getEttaTallyDate() {
		return ettaTallyDate;
	}

	/**
	 * Set 理货日期：进出口拖车任务
	 */
	public void setEttaTallyDate(Date ettaTallyDate) {
		this.ettaTallyDate = ettaTallyDate;
		addValidField("ettaTallyDate");
	}

	/**
	 * Get 截港日期：出口拖车任务
	 */
	@Column(name = "ETTA_CUT_POST_DATE")
	public Date getEttaCutPostDate() {
		return ettaCutPostDate;
	}

	/**
	 * Set 截港日期：出口拖车任务
	 */
	public void setEttaCutPostDate(Date ettaCutPostDate) {
		this.ettaCutPostDate = ettaCutPostDate;
		addValidField("ettaCutPostDate");
	}

	/**
	 * Get 提箱时间：进出口拖车任务
	 */
	@Column(name = "ETTA_SUITCASE_TIME")
	public Date getEttaSuitcaseTime() {
		return ettaSuitcaseTime;
	}

	/**
	 * Set 提箱时间：进出口拖车任务
	 */
	public void setEttaSuitcaseTime(Date ettaSuitcaseTime) {
		this.ettaSuitcaseTime = ettaSuitcaseTime;
		addValidField("ettaSuitcaseTime");
	}

	/**
	 * Get 提箱地址：进口拖车任务
	 */
	@Column(name = "ETTA_SUITCASE_ADDRESS")
	public String getEttaSuitcaseAddress() {
		return ettaSuitcaseAddress;
	}

	/**
	 * Set 提箱地址：进口拖车任务
	 */
	public void setEttaSuitcaseAddress(String ettaSuitcaseAddress) {
		this.ettaSuitcaseAddress = ettaSuitcaseAddress;
		addValidField("ettaSuitcaseAddress");
	}

	/**
	 * Get 进港日期：出口拖车任务
	 */
	@Column(name = "ETTA_IN_POST_DATE")
	public Date getEttaInPostDate() {
		return ettaInPostDate;
	}

	/**
	 * Set 进港日期：出口拖车任务
	 */
	public void setEttaInPostDate(Date ettaInPostDate) {
		this.ettaInPostDate = ettaInPostDate;
		addValidField("ettaInPostDate");
	}

	/**
	 * Get 上船日期：出口拖车任务
	 */
	@Column(name = "ETTA_UP_SHIPPING_DATE")
	public Date getEttaUpShippingDate() {
		return ettaUpShippingDate;
	}

	/**
	 * Set 上船日期：出口拖车任务
	 */
	public void setEttaUpShippingDate(Date ettaUpShippingDate) {
		this.ettaUpShippingDate = ettaUpShippingDate;
		addValidField("ettaUpShippingDate");
	}

	/**
	 * Get 要求到达：进出口拖车任务
	 */
	@Column(name = "ETTA_REQ_ARRIVAL")
	public Date getEttaReqArrival() {
		return ettaReqArrival;
	}

	/**
	 * Set 要求到达：进出口拖车任务
	 */
	public void setEttaReqArrival(Date ettaReqArrival) {
		this.ettaReqArrival = ettaReqArrival;
		addValidField("ettaReqArrival");
	}

	/**
	 * Get 实际到达：进出口拖车任务
	 */
	@Column(name = "ETTA_ACTUAL_ARRIVAL")
	public Date getEttaActualArrival() {
		return ettaActualArrival;
	}

	/**
	 * Set 实际到达：进出口拖车任务
	 */
	public void setEttaActualArrival(Date ettaActualArrival) {
		this.ettaActualArrival = ettaActualArrival;
		addValidField("ettaActualArrival");
	}

	/**
	 * Get 联系方式：进出口拖车任务
	 */
	@Column(name = "ETTA_CONTACT")
	public String getEttaContact() {
		return ettaContact;
	}

	/**
	 * Set 联系方式：进出口拖车任务
	 */
	public void setEttaContact(String ettaContact) {
		this.ettaContact = ettaContact;
		addValidField("ettaContact");
	}

	/**
	 * Get 派车信息：进出口拖车任务
	 */
	@Column(name = "ETTA_SENT_CAR_INFO")
	public String getEttaSentCarInfo() {
		return ettaSentCarInfo;
	}

	/**
	 * Set 派车信息：进出口拖车任务
	 */
	public void setEttaSentCarInfo(String ettaSentCarInfo) {
		this.ettaSentCarInfo = ettaSentCarInfo;
		addValidField("ettaSentCarInfo");
	}

	/**
	 * Get 离场时间：进出口拖车任务
	 */
	@Column(name = "ETTA_LEAVE_TIME")
	public Date getEttaLeaveTime() {
		return ettaLeaveTime;
	}

	/**
	 * Set 离场时间：进出口拖车任务
	 */
	public void setEttaLeaveTime(Date ettaLeaveTime) {
		this.ettaLeaveTime = ettaLeaveTime;
		addValidField("ettaLeaveTime");
	}

	/**
	 * Get 离场备注：进出口拖车任务
	 */
	@Column(name = "ETTA_DEPARTURE_REMARK")
	public String getEttaDepartureRemark() {
		return ettaDepartureRemark;
	}

	/**
	 * Set 离场备注：进出口拖车任务
	 */
	public void setEttaDepartureRemark(String ettaDepartureRemark) {
		this.ettaDepartureRemark = ettaDepartureRemark;
		addValidField("ettaDepartureRemark");
	}

	/**
	 * Get 包装形式：进出口拖车任务
	 */
	@Column(name = "ETTA_PACKAGING")
	public String getEttaPackaging() {
		return ettaPackaging;
	}

	/**
	 * Set 包装形式：进出口拖车任务
	 */
	public void setEttaPackaging(String ettaPackaging) {
		this.ettaPackaging = ettaPackaging;
		addValidField("ettaPackaging");
	}

	/**
	 * Get 报关预入日期：出口拖车任务
	 */
	@Column(name = "ETTA_PREENTRY_DATE")
	public Date getEttaPreentryDate() {
		return ettaPreentryDate;
	}

	/**
	 * Set 报关预入日期：出口拖车任务
	 */
	public void setEttaPreentryDate(Date ettaPreentryDate) {
		this.ettaPreentryDate = ettaPreentryDate;
		addValidField("ettaPreentryDate");
	}

	/**
	 * Get 查验日期:进出口拖车任务
	 */
	@Column(name = "ETTA_PORT_TIME")
	public Date getEttaPortTime() {
		return ettaPortTime;
	}

	/**
	 * Set 查验日期:进出口拖车任务
	 */
	public void setEttaPortTime(Date ettaPortTime) {
		this.ettaPortTime = ettaPortTime;
		addValidField("ettaPortTime");
	}

	/**
	 * Get 查验日期：进出口拖车任务
	 */
	@Column(name = "ETTA_CHECK_DATE")
	public Date getEttaCheckDate() {
		return ettaCheckDate;
	}

	/**
	 * Set 查验日期：进出口拖车任务
	 */
	public void setEttaCheckDate(Date ettaCheckDate) {
		this.ettaCheckDate = ettaCheckDate;
		addValidField("ettaCheckDate");
	}

	/**
	 * Get 是否污箱：进口拖车任务
	 */
	@Column(name = "ETTA_IS_SEWAGE_TANK")
	public String getEttaIsSewageTank() {
		return ettaIsSewageTank;
	}

	/**
	 * Set 是否污箱：进口拖车任务
	 */
	public void setEttaIsSewageTank(String ettaIsSewageTank) {
		this.ettaIsSewageTank = ettaIsSewageTank;
		addValidField("ettaIsSewageTank");
	}

	/**
	 * Get 执行情况:进出口拖车任务
	 */
	@Column(name = "ETTA_PERFORM_DESC")
	public String getEttaPerformDesc() {
		return ettaPerformDesc;
	}

	/**
	 * Set 执行情况:进出口拖车任务
	 */
	public void setEttaPerformDesc(String ettaPerformDesc) {
		this.ettaPerformDesc = ettaPerformDesc;
		addValidField("ettaPerformDesc");
	}

	/**
	 * Get 修改人员:进出口拖车任务
	 */
	@Column(name = "ETTA_MODIFIER")
	public String getEttaModifier() {
		return ettaModifier;
	}

	/**
	 * Set 修改人员:进出口拖车任务
	 */
	public void setEttaModifier(String ettaModifier) {
		this.ettaModifier = ettaModifier;
		addValidField("ettaModifier");
	}

	/**
	 * Get 修改日期:进出口拖车任务
	 */
	@Column(name = "ETTA_MODIFY_TIME")
	public Date getEttaModifyTime() {
		return ettaModifyTime;
	}

	/**
	 * Set 修改日期:进出口拖车任务
	 */
	public void setEttaModifyTime(Date ettaModifyTime) {
		this.ettaModifyTime = ettaModifyTime;
		addValidField("ettaModifyTime");
	}

	/**
	 * Get 输入人员:进出口拖车任务
	 */
	@Column(name = "ETTA_CREATOR")
	public String getEttaCreator() {
		return ettaCreator;
	}

	/**
	 * Set 输入人员:进出口拖车任务
	 */
	public void setEttaCreator(String ettaCreator) {
		this.ettaCreator = ettaCreator;
		addValidField("ettaCreator");
	}

	/**
	 * Get 输入日期:进出口拖车任务
	 */
	@Column(name = "ETTA_CREATE_TIME")
	public Date getEttaCreateTime() {
		return ettaCreateTime;
	}

	/**
	 * Set 输入日期:进出口拖车任务
	 */
	public void setEttaCreateTime(Date ettaCreateTime) {
		this.ettaCreateTime = ettaCreateTime;
		addValidField("ettaCreateTime");
	}

	/**
	 * Get 包装备注:进出口拖车任务
	 */
	@Column(name = "ETTA_PACKAGE_REMARK")
	public String getEttaPackageRemark() {
		return ettaPackageRemark;
	}

	/**
	 * Set 包装备注:进出口拖车任务
	 */
	public void setEttaPackageRemark(String ettaPackageRemark) {
		this.ettaPackageRemark = ettaPackageRemark;
		addValidField("ettaPackageRemark");
	}

	/**
	 * Get 动卫检查验:进口拖车任务
	 */
	@Column(name = "ETTA_INSPECTE_DATE")
	public Date getEttaInspecteDate() {
		return ettaInspecteDate;
	}

	/**
	 * Set 动卫检查验:进口拖车任务
	 */
	public void setEttaInspecteDate(Date ettaInspecteDate) {
		this.ettaInspecteDate = ettaInspecteDate;
		addValidField("ettaInspecteDate");
	}

	/**
	 * Get 动卫检查询:进口拖车任务
	 */
	@Column(name = "ETTA_CHECK_DESC")
	public String getEttaCheckDesc() {
		return ettaCheckDesc;
	}

	/**
	 * Set 动卫检查询:进口拖车任务
	 */
	public void setEttaCheckDesc(String ettaCheckDesc) {
		this.ettaCheckDesc = ettaCheckDesc;
		addValidField("ettaCheckDesc");
	}

	/**
	 * Get 进出口：空运任务
	 */
	@Column(name = "ETTA_IN_OUT")
	public String getEttaInOut() {
		return ettaInOut;
	}

	/**
	 * Set 进出口：空运任务
	 */
	public void setEttaInOut(String ettaInOut) {
		this.ettaInOut = ettaInOut;
		addValidField("ettaInOut");
	}

	/**
	 * Get 还箱地址:进口拖车任务
	 */
	@Column(name = "ETTA_RETURN_TANK_ADDRESS")
	public String getEttaReturnTankAddress() {
		return ettaReturnTankAddress;
	}

	/**
	 * Set 还箱地址:进口拖车任务
	 */
	public void setEttaReturnTankAddress(String ettaReturnTankAddress) {
		this.ettaReturnTankAddress = ettaReturnTankAddress;
		addValidField("ettaReturnTankAddress");
	}

	/**
	 * Get 还箱时间:进口拖车任务
	 */
	@Column(name = "ETTA_BACK_TANK_TIME")
	public Date getEttaBackTankTime() {
		return ettaBackTankTime;
	}

	/**
	 * Set 还箱时间:进口拖车任务
	 */
	public void setEttaBackTankTime(Date ettaBackTankTime) {
		this.ettaBackTankTime = ettaBackTankTime;
		addValidField("ettaBackTankTime");
	}

	/**
	 * Get 计划提货日期:进口拖车任务
	 */
	@Column(name = "ETTA_PLAN_DELIVERY_DATE")
	public Date getEttaPlanDeliveryDate() {
		return ettaPlanDeliveryDate;
	}

	/**
	 * Set 计划提货日期:进口拖车任务
	 */
	public void setEttaPlanDeliveryDate(Date ettaPlanDeliveryDate) {
		this.ettaPlanDeliveryDate = ettaPlanDeliveryDate;
		addValidField("ettaPlanDeliveryDate");
	}

	/**
	 * Get 是否落箱:进口拖车任务
	 */
	@Column(name = "ETTA_IS_DROP_TANK")
	public String getEttaIsDropTank() {
		return ettaIsDropTank;
	}

	/**
	 * Set 是否落箱:进口拖车任务
	 */
	public void setEttaIsDropTank(String ettaIsDropTank) {
		this.ettaIsDropTank = ettaIsDropTank;
		addValidField("ettaIsDropTank");
	}

	/**
	 * Get 单证收全日期：空运任务
	 */
	@Column(name = "ETTA_COLLECT_DATE")
	public Date getEttaCollectDate() {
		return ettaCollectDate;
	}

	/**
	 * Set 单证收全日期：空运任务
	 */
	public void setEttaCollectDate(Date ettaCollectDate) {
		this.ettaCollectDate = ettaCollectDate;
		addValidField("ettaCollectDate");
	}

	/**
	 * Get 报关开始日期：空运任务
	 */
	@Column(name = "ETTA_CUSTOM_START_DATE")
	public Date getEttaCustomStartDate() {
		return ettaCustomStartDate;
	}

	/**
	 * Set 报关开始日期：空运任务
	 */
	public void setEttaCustomStartDate(Date ettaCustomStartDate) {
		this.ettaCustomStartDate = ettaCustomStartDate;
		addValidField("ettaCustomStartDate");
	}

	/**
	 * Get 换单日期：空运任务
	 */
	@Column(name = "ETTA_CHANGE_DATE")
	public Date getEttaChangeDate() {
		return ettaChangeDate;
	}

	/**
	 * Set 换单日期：空运任务
	 */
	public void setEttaChangeDate(Date ettaChangeDate) {
		this.ettaChangeDate = ettaChangeDate;
		addValidField("ettaChangeDate");
	}

	/**
	 * Get 取得换证凭条日期:进口拖车任务
	 */
	@Column(name = "ETTA_OBTAIN_DATE")
	public Date getEttaObtainDate() {
		return ettaObtainDate;
	}

	/**
	 * Set 取得换证凭条日期:进口拖车任务
	 */
	public void setEttaObtainDate(Date ettaObtainDate) {
		this.ettaObtainDate = ettaObtainDate;
		addValidField("ettaObtainDate");
	}

	/**
	 * Get 进物流园时间:进口拖车任务
	 */
	@Column(name = "ETTA_IN_PARK_TIME")
	public Date getEttaInParkTime() {
		return ettaInParkTime;
	}

	/**
	 * Set 进物流园时间:进口拖车任务
	 */
	public void setEttaInParkTime(Date ettaInParkTime) {
		this.ettaInParkTime = ettaInParkTime;
		addValidField("ettaInParkTime");
	}

	/**
	 * Get 出物流园时间:进口拖车任务
	 */
	@Column(name = "ETTA_OUT_PARK_TIME")
	public Date getEttaOutParkTime() {
		return ettaOutParkTime;
	}

	/**
	 * Set 出物流园时间:进口拖车任务
	 */
	public void setEttaOutParkTime(Date ettaOutParkTime) {
		this.ettaOutParkTime = ettaOutParkTime;
		addValidField("ettaOutParkTime");
	}

	/**
	 * Get 是否港区计划:进口拖车任务
	 */
	@Column(name = "ETTA_IS_PORT_PLAN")
	public String getEttaIsPortPlan() {
		return ettaIsPortPlan;
	}

	/**
	 * Set 是否港区计划:进口拖车任务
	 */
	public void setEttaIsPortPlan(String ettaIsPortPlan) {
		this.ettaIsPortPlan = ettaIsPortPlan;
		addValidField("ettaIsPortPlan");
	}

	/**
	 * Get 报关结束日期：空运任务
	 */
	@Column(name = "ETTA_CUSTOM_END_DATE")
	public Date getEttaCustomEndDate() {
		return ettaCustomEndDate;
	}

	/**
	 * Set 报关结束日期：空运任务
	 */
	public void setEttaCustomEndDate(Date ettaCustomEndDate) {
		this.ettaCustomEndDate = ettaCustomEndDate;
		addValidField("ettaCustomEndDate");
	}

	/**
	 * Get 货物入库日期：空运任务
	 */
	@Column(name = "ETTA_IN_WAREHOUSE_DATE")
	public Date getEttaInWarehouseDate() {
		return ettaInWarehouseDate;
	}

	/**
	 * Set 货物入库日期：空运任务
	 */
	public void setEttaInWarehouseDate(Date ettaInWarehouseDate) {
		this.ettaInWarehouseDate = ettaInWarehouseDate;
		addValidField("ettaInWarehouseDate");
	}

	/**
	 * Get 单税签收日期：空运任务
	 */
	@Column(name = "ETTA_FINISHED_DATE")
	public Date getEttaFinishedDate() {
		return ettaFinishedDate;
	}

	/**
	 * Set 单税签收日期：空运任务
	 */
	public void setEttaFinishedDate(Date ettaFinishedDate) {
		this.ettaFinishedDate = ettaFinishedDate;
		addValidField("ettaFinishedDate");
	}

	/**
	 * Get 付税日期：空运任务
	 */
	@Column(name = "ETTA_PAY_TAX_DATE")
	public Date getEttaPayTaxDate() {
		return ettaPayTaxDate;
	}

	/**
	 * Set 付税日期：空运任务
	 */
	public void setEttaPayTaxDate(Date ettaPayTaxDate) {
		this.ettaPayTaxDate = ettaPayTaxDate;
		addValidField("ettaPayTaxDate");
	}

	/**
	 * Get 车次：铁路任务
	 */
	@Column(name = "ETTA_TRAIN")
	public String getEttaTrain() {
		return ettaTrain;
	}

	/**
	 * Set 车次：铁路任务
	 */
	public void setEttaTrain(String ettaTrain) {
		this.ettaTrain = ettaTrain;
		addValidField("ettaTrain");
	}

	/**
	 * Get 截止进站时间：铁路任务
	 */
	@Column(name = "ETTA_STOP_STATION_TIME")
	public Date getEttaStopStationTime() {
		return ettaStopStationTime;
	}

	/**
	 * Set 截止进站时间：铁路任务
	 */
	public void setEttaStopStationTime(Date ettaStopStationTime) {
		this.ettaStopStationTime = ettaStopStationTime;
		addValidField("ettaStopStationTime");
	}

	/**
	 * Get 进站时间：铁路任务
	 */
	@Column(name = "ETTA_STATION_TIME")
	public Date getEttaStationTime() {
		return ettaStationTime;
	}

	/**
	 * Set 进站时间：铁路任务
	 */
	public void setEttaStationTime(Date ettaStationTime) {
		this.ettaStationTime = ettaStationTime;
		addValidField("ettaStationTime");
	}

	/**
	 * Get 近期铁路检测时间：铁路任务
	 */
	@Column(name = "ETTA_RAILWAY_TIME")
	public Date getEttaRailwayTime() {
		return ettaRailwayTime;
	}

	/**
	 * Set 近期铁路检测时间：铁路任务
	 */
	public void setEttaRailwayTime(Date ettaRailwayTime) {
		this.ettaRailwayTime = ettaRailwayTime;
		addValidField("ettaRailwayTime");
	}

	/**
	 * Get 核销单返还日期
	 */
	@Column(name = "ETTA_RETURN_DATE")
	public Date getEttaReturnDate() {
		return ettaReturnDate;
	}

	/**
	 * Set 核销单返还日期
	 */
	public void setEttaReturnDate(Date ettaReturnDate) {
		this.ettaReturnDate = ettaReturnDate;
		addValidField("ettaReturnDate");
	}

	/**
	 * Get 车队ID：进出口拖车任务
	 */
	@Column(name = "ETTA_TEAM_EBCU_ID")
	public Integer getEttaTeamEbcuId() {
		return ettaTeamEbcuId;
	}

	/**
	 * Set 车队ID：进出口拖车任务
	 */
	public void setEttaTeamEbcuId(Integer ettaTeamEbcuId) {
		this.ettaTeamEbcuId = ettaTeamEbcuId;
		addValidField("ettaTeamEbcuId");
	}

	/**
	 * Get 车队：进出口拖车任务
	 */
	@Column(name = "ETTA_TEAM_EBCU_NAME_CN")
	public String getEttaTeamEbcuNameCn() {
		return ettaTeamEbcuNameCn;
	}

	/**
	 * Set 车队：进出口拖车任务
	 */
	public void setEttaTeamEbcuNameCn(String ettaTeamEbcuNameCn) {
		this.ettaTeamEbcuNameCn = ettaTeamEbcuNameCn;
		addValidField("ettaTeamEbcuNameCn");
	}

	/**
	 * Get 码头ID：进出口拖车任务
	 */
	@Column(name = "ETTA_TERMINAL_EBCU_ID")
	public Integer getEttaTerminalEbcuId() {
		return ettaTerminalEbcuId;
	}

	/**
	 * Set 码头ID：进出口拖车任务
	 */
	public void setEttaTerminalEbcuId(Integer ettaTerminalEbcuId) {
		this.ettaTerminalEbcuId = ettaTerminalEbcuId;
		addValidField("ettaTerminalEbcuId");
	}

	/**
	 * Get 码头：进出口拖车任务
	 */
	@Column(name = "ETTA_TERMINAL_EBCU_NAME_CN")
	public String getEttaTerminalEbcuNameCn() {
		return ettaTerminalEbcuNameCn;
	}

	/**
	 * Set 码头：进出口拖车任务
	 */
	public void setEttaTerminalEbcuNameCn(String ettaTerminalEbcuNameCn) {
		this.ettaTerminalEbcuNameCn = ettaTerminalEbcuNameCn;
		addValidField("ettaTerminalEbcuNameCn");
	}

	/**
	 * Get 提箱地：陆运任务
	 */
	@Column(name = "ETTA_SUITCASE")
	public String getEttaSuitcase() {
		return ettaSuitcase;
	}

	/**
	 * Set 提箱地：陆运任务
	 */
	public void setEttaSuitcase(String ettaSuitcase) {
		this.ettaSuitcase = ettaSuitcase;
		addValidField("ettaSuitcase");
	}

	/**
	 * Get 还箱地：陆运任务
	 */
	@Column(name = "ETTA_CRATES")
	public String getEttaCrates() {
		return ettaCrates;
	}

	/**
	 * Set 还箱地：陆运任务
	 */
	public void setEttaCrates(String ettaCrates) {
		this.ettaCrates = ettaCrates;
		addValidField("ettaCrates");
	}

	/**
	 * Get 主驾驶ID：陆运任务
	 */
	@Column(name = "ETTA_MAIN_ETTP_ID")
	public Integer getEttaMainEttpId() {
		return ettaMainEttpId;
	}

	/**
	 * Set 主驾驶ID：陆运任务
	 */
	public void setEttaMainEttpId(Integer ettaMainEttpId) {
		this.ettaMainEttpId = ettaMainEttpId;
		addValidField("ettaMainEttpId");
	}

	/**
	 * Get 挂车车牌号：陆运任务
	 */
	@Column(name = "ETTA_TRAILER_ETVE_CARD")
	public String getEttaTrailerEtveCard() {
		return ettaTrailerEtveCard;
	}

	/**
	 * Set 挂车车牌号：陆运任务
	 */
	public void setEttaTrailerEtveCard(String ettaTrailerEtveCard) {
		this.ettaTrailerEtveCard = ettaTrailerEtveCard;
		addValidField("ettaTrailerEtveCard");
	}

	/**
	 * Get 挂车ID：陆运任务
	 */
	@Column(name = "ETTA_TRAILER_ETVE_ID")
	public Integer getEttaTrailerEtveId() {
		return ettaTrailerEtveId;
	}

	/**
	 * Set 挂车ID：陆运任务
	 */
	public void setEttaTrailerEtveId(Integer ettaTrailerEtveId) {
		this.ettaTrailerEtveId = ettaTrailerEtveId;
		addValidField("ettaTrailerEtveId");
	}

	/**
	 * Get 牵引车车牌号：陆运任务
	 */
	@Column(name = "ETTA_TRACTOR_ETVE_CARD")
	public String getEttaTractorEtveCard() {
		return ettaTractorEtveCard;
	}

	/**
	 * Set 牵引车车牌号：陆运任务
	 */
	public void setEttaTractorEtveCard(String ettaTractorEtveCard) {
		this.ettaTractorEtveCard = ettaTractorEtveCard;
		addValidField("ettaTractorEtveCard");
	}

	/**
	 * Get 牵引车ID：陆运任务
	 */
	@Column(name = "ETTA_TRACTOR_ETVE_ID")
	public Integer getEttaTractorEtveId() {
		return ettaTractorEtveId;
	}

	/**
	 * Set 牵引车ID：陆运任务
	 */
	public void setEttaTractorEtveId(Integer ettaTractorEtveId) {
		this.ettaTractorEtveId = ettaTractorEtveId;
		addValidField("ettaTractorEtveId");
	}

	/**
	 * Get 主驾驶：陆运任务
	 */
	@Column(name = "ETTA_MAIN_ETTP_NAME")
	public String getEttaMainEttpName() {
		return ettaMainEttpName;
	}

	/**
	 * Set 主驾驶：陆运任务
	 */
	public void setEttaMainEttpName(String ettaMainEttpName) {
		this.ettaMainEttpName = ettaMainEttpName;
		addValidField("ettaMainEttpName");
	}

	/**
	 * Get 副驾驶ID：陆运任务
	 */
	@Column(name = "ETTA_COPILOR_ETTP_ID")
	public Integer getEttaCopilorEttpId() {
		return ettaCopilorEttpId;
	}

	/**
	 * Set 副驾驶ID：陆运任务
	 */
	public void setEttaCopilorEttpId(Integer ettaCopilorEttpId) {
		this.ettaCopilorEttpId = ettaCopilorEttpId;
		addValidField("ettaCopilorEttpId");
	}

	/**
	 * Get 副驾驶：陆运任务
	 */
	@Column(name = "ETTA_COPILOR_ETTP_NAME")
	public String getEttaCopilorEttpName() {
		return ettaCopilorEttpName;
	}

	/**
	 * Set 副驾驶：陆运任务
	 */
	public void setEttaCopilorEttpName(String ettaCopilorEttpName) {
		this.ettaCopilorEttpName = ettaCopilorEttpName;
		addValidField("ettaCopilorEttpName");
	}

	/**
	 * Get 集装箱ID：陆运任务
	 */
	@Column(name = "ETTA_LAND_ETCA_ID")
	public Integer getEttaLandEtcaId() {
		return ettaLandEtcaId;
	}

	/**
	 * Set 集装箱ID：陆运任务
	 */
	public void setEttaLandEtcaId(Integer ettaLandEtcaId) {
		this.ettaLandEtcaId = ettaLandEtcaId;
		addValidField("ettaLandEtcaId");
	}

	/**
	 * Get 陆运任务集装箱号：陆运任务
	 */
	@Column(name = "ETTA_LAND_ETCA_NO")
	public String getEttaLandEtcaNo() {
		return ettaLandEtcaNo;
	}

	/**
	 * Set 陆运任务集装箱号：陆运任务
	 */
	public void setEttaLandEtcaNo(String ettaLandEtcaNo) {
		this.ettaLandEtcaNo = ettaLandEtcaNo;
		addValidField("ettaLandEtcaNo");
	}

	/**
	 * Get 陆运任务封号：陆运任务
	 */
	@Column(name = "ETTA_LAND_TITLE_NO")
	public String getEttaLandTitleNo() {
		return ettaLandTitleNo;
	}

	/**
	 * Set 陆运任务封号：陆运任务
	 */
	public void setEttaLandTitleNo(String ettaLandTitleNo) {
		this.ettaLandTitleNo = ettaLandTitleNo;
		addValidField("ettaLandTitleNo");
	}

	/**
	 * Get 司机联系方式：陆运任务
	 */
	@Column(name = "ETTA_ETTP_TEL")
	public String getEttaEttpTel() {
		return ettaEttpTel;
	}

	/**
	 * Set 司机联系方式：陆运任务
	 */
	public void setEttaEttpTel(String ettaEttpTel) {
		this.ettaEttpTel = ettaEttpTel;
		addValidField("ettaEttpTel");
	}

	/**
	 * Get 陆运承运人：陆运任务
	 */
	@Column(name = "ETTA_CARRIER_EBCU_ID")
	public Integer getEttaCarrierEbcuId() {
		return ettaCarrierEbcuId;
	}

	/**
	 * Set 陆运承运人：陆运任务
	 */
	public void setEttaCarrierEbcuId(Integer ettaCarrierEbcuId) {
		this.ettaCarrierEbcuId = ettaCarrierEbcuId;
		addValidField("ettaCarrierEbcuId");
	}

	/**
	 * Get 陆运承运人名称：陆运任务
	 */
	@Column(name = "ETTA_CARRIER_EBCU_NAME_CN")
	public String getEttaCarrierEbcuNameCn() {
		return ettaCarrierEbcuNameCn;
	}

	/**
	 * Set 陆运承运人名称：陆运任务
	 */
	public void setEttaCarrierEbcuNameCn(String ettaCarrierEbcuNameCn) {
		this.ettaCarrierEbcuNameCn = ettaCarrierEbcuNameCn;
		addValidField("ettaCarrierEbcuNameCn");
	}

	/**
	 * Get 行车路线：陆运任务
	 */
	@Column(name = "ETTA_EBLN_ID")
	public Integer getEttaEblnId() {
		return ettaEblnId;
	}

	/**
	 * Set 行车路线：陆运任务
	 */
	public void setEttaEblnId(Integer ettaEblnId) {
		this.ettaEblnId = ettaEblnId;
		addValidField("ettaEblnId");
	}

	/**
	 * Get 行车路线名称：陆运任务
	 */
	@Column(name = "ETTA_EBLN_LINE_NAME")
	public String getEttaEblnLineName() {
		return ettaEblnLineName;
	}

	/**
	 * Set 行车路线名称：陆运任务
	 */
	public void setEttaEblnLineName(String ettaEblnLineName) {
		this.ettaEblnLineName = ettaEblnLineName;
		addValidField("ettaEblnLineName");
	}

	/**
	 * Get 是否进入内部车辆调度池:陆运任务
	 */
	@Column(name = "ETTA_IS_WITHIN")
	public String getEttaIsWithin() {
		return ettaIsWithin;
	}

	/**
	 * Set 是否进入内部车辆调度池:陆运任务
	 */
	public void setEttaIsWithin(String ettaIsWithin) {
		this.ettaIsWithin = ettaIsWithin;
		addValidField("ettaIsWithin");
	}

	/**
	 * Get 额定里程
	 */
	@Column(name = "ETTA_RATE_MILEAGE")
	public Double getEttaRateMileage() {
		return ettaRateMileage;
	}

	/**
	 * Set 额定里程
	 */
	public void setEttaRateMileage(Double ettaRateMileage) {
		this.ettaRateMileage = ettaRateMileage;
		addValidField("ettaRateMileage");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTA_SUBNUM1")
	public Double getEttaSubnum1() {
		return ettaSubnum1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttaSubnum1(Double ettaSubnum1) {
		this.ettaSubnum1 = ettaSubnum1;
		addValidField("ettaSubnum1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTA_SUBSTR1")
	public String getEttaSubstr1() {
		return ettaSubstr1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttaSubstr1(String ettaSubstr1) {
		this.ettaSubstr1 = ettaSubstr1;
		addValidField("ettaSubstr1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTA_SUBSTR2")
	public String getEttaSubstr2() {
		return ettaSubstr2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttaSubstr2(String ettaSubstr2) {
		this.ettaSubstr2 = ettaSubstr2;
		addValidField("ettaSubstr2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTA_SUBSTR3")
	public String getEttaSubstr3() {
		return ettaSubstr3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttaSubstr3(String ettaSubstr3) {
		this.ettaSubstr3 = ettaSubstr3;
		addValidField("ettaSubstr3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTA_SUBSTR4")
	public String getEttaSubstr4() {
		return ettaSubstr4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttaSubstr4(String ettaSubstr4) {
		this.ettaSubstr4 = ettaSubstr4;
		addValidField("ettaSubstr4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTA_SUBSTR5")
	public String getEttaSubstr5() {
		return ettaSubstr5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttaSubstr5(String ettaSubstr5) {
		this.ettaSubstr5 = ettaSubstr5;
		addValidField("ettaSubstr5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTA_SUBSTR6")
	public String getEttaSubstr6() {
		return ettaSubstr6;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttaSubstr6(String ettaSubstr6) {
		this.ettaSubstr6 = ettaSubstr6;
		addValidField("ettaSubstr6");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTA_SUBSTR8")
	public String getEttaSubstr8() {
		return ettaSubstr8;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttaSubstr8(String ettaSubstr8) {
		this.ettaSubstr8 = ettaSubstr8;
		addValidField("ettaSubstr8");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTA_SUBSTR7")
	public String getEttaSubstr7() {
		return ettaSubstr7;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttaSubstr7(String ettaSubstr7) {
		this.ettaSubstr7 = ettaSubstr7;
		addValidField("ettaSubstr7");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTA_SUBDATE1")
	public Date getEttaSubdate1() {
		return ettaSubdate1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttaSubdate1(Date ettaSubdate1) {
		this.ettaSubdate1 = ettaSubdate1;
		addValidField("ettaSubdate1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTA_SUBDATE2")
	public Date getEttaSubdate2() {
		return ettaSubdate2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttaSubdate2(Date ettaSubdate2) {
		this.ettaSubdate2 = ettaSubdate2;
		addValidField("ettaSubdate2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTA_SUBDATE5")
	public Date getEttaSubdate5() {
		return ettaSubdate5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttaSubdate5(Date ettaSubdate5) {
		this.ettaSubdate5 = ettaSubdate5;
		addValidField("ettaSubdate5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTA_SUBDATE4")
	public Date getEttaSubdate4() {
		return ettaSubdate4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttaSubdate4(Date ettaSubdate4) {
		this.ettaSubdate4 = ettaSubdate4;
		addValidField("ettaSubdate4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTA_SUBDATE3")
	public Date getEttaSubdate3() {
		return ettaSubdate3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttaSubdate3(Date ettaSubdate3) {
		this.ettaSubdate3 = ettaSubdate3;
		addValidField("ettaSubdate3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTA_SUBNUM3")
	public Integer getEttaSubnum3() {
		return ettaSubnum3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttaSubnum3(Integer ettaSubnum3) {
		this.ettaSubnum3 = ettaSubnum3;
		addValidField("ettaSubnum3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTA_SUBNUM2")
	public Integer getEttaSubnum2() {
		return ettaSubnum2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttaSubnum2(Integer ettaSubnum2) {
		this.ettaSubnum2 = ettaSubnum2;
		addValidField("ettaSubnum2");
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
	 * Get 报关行ID
	 * 进出口拖车任务
	 */
	@Column(name = "ETTA_TRAILER_EBCU_ID")
	public Integer getEttaTrailerEbcuId() {
		return ettaTrailerEbcuId;
	}

	/**
	 * Set 报关行ID
	 * 进出口拖车任务
	 */
	public void setEttaTrailerEbcuId(Integer ettaTrailerEbcuId) {
		this.ettaTrailerEbcuId = ettaTrailerEbcuId;
		addValidField("ettaTrailerEbcuId");
	}

	/**
	 * Get 报关行名称
	 * 进出口拖车任务
	 */
	@Column(name = "ETTA_TRAILER_NAME_CN")
	public String getEttaTrailerNameCn() {
		return ettaTrailerNameCn;
	}

	/**
	 * Set 报关行名称
	 * 进出口拖车任务
	 */
	public void setEttaTrailerNameCn(String ettaTrailerNameCn) {
		this.ettaTrailerNameCn = ettaTrailerNameCn;
		addValidField("ettaTrailerNameCn");
	}

	/**
	 * Get 提箱地ID：陆运任务
	 */
	@Column(name = "ETTA_SUITCASE_EBRG_ID")
	public Integer getEttaSuitcaseEbrgId() {
		return ettaSuitcaseEbrgId;
	}

	/**
	 * Set 提箱地ID：陆运任务
	 */
	public void setEttaSuitcaseEbrgId(Integer ettaSuitcaseEbrgId) {
		this.ettaSuitcaseEbrgId = ettaSuitcaseEbrgId;
		addValidField("ettaSuitcaseEbrgId");
	}

	/**
	 * Get 还箱地ID：陆运任务
	 */
	@Column(name = "ETTA_CRATES_EBRG_ID")
	public Integer getEttaCratesEbrgId() {
		return ettaCratesEbrgId;
	}

	/**
	 * Set 还箱地ID：陆运任务
	 */
	public void setEttaCratesEbrgId(Integer ettaCratesEbrgId) {
		this.ettaCratesEbrgId = ettaCratesEbrgId;
		addValidField("ettaCratesEbrgId");
	}

	/**
	 * Get 件数单位
	 */
	@Column(name = "ETTA_QUANTITY_UNIT")
	public String getEttaQuantityUnit() {
		return ettaQuantityUnit;
	}

	/**
	 * Set 件数单位
	 */
	public void setEttaQuantityUnit(String ettaQuantityUnit) {
		this.ettaQuantityUnit = ettaQuantityUnit;
		addValidField("ettaQuantityUnit");
	}

	/**
	 * Get 数量单位
	 */
	@Column(name = "ETTA_NUMBER_UNIT")
	public String getEttaNumberUnit() {
		return ettaNumberUnit;
	}

	/**
	 * Set 数量单位
	 */
	public void setEttaNumberUnit(String ettaNumberUnit) {
		this.ettaNumberUnit = ettaNumberUnit;
		addValidField("ettaNumberUnit");
	}

	/**
	 * Get 作废人
	 */
	@Column(name = "ETTA_VOIDER")
	public String getEttaVoider() {
		return ettaVoider;
	}

	/**
	 * Set 作废人
	 */
	public void setEttaVoider(String ettaVoider) {
		this.ettaVoider = ettaVoider;
		addValidField("ettaVoider");
	}

	/**
	 * Get 作废时间
	 */
	@Column(name = "ETTA_VOIDER_TIME")
	public Date getEttaVoiderTime() {
		return ettaVoiderTime;
	}

	/**
	 * Set 作废时间
	 */
	public void setEttaVoiderTime(Date ettaVoiderTime) {
		this.ettaVoiderTime = ettaVoiderTime;
		addValidField("ettaVoiderTime");
	}

	/**
	 * Get 作废原因
	 */
	@Column(name = "ETTA_VOID_DESC")
	public String getEttaVoidDesc() {
		return ettaVoidDesc;
	}

	/**
	 * Set 作废原因
	 */
	public void setEttaVoidDesc(String ettaVoidDesc) {
		this.ettaVoidDesc = ettaVoidDesc;
		addValidField("ettaVoidDesc");
	}

	/**
	 * Get 预计提货时间
	 */
	@Column(name = "ETTA_DELIVERY_TIME")
	public Date getEttaDeliveryTime() {
		return ettaDeliveryTime;
	}

	/**
	 * Set 预计提货时间
	 */
	public void setEttaDeliveryTime(Date ettaDeliveryTime) {
		this.ettaDeliveryTime = ettaDeliveryTime;
		addValidField("ettaDeliveryTime");
	}

	/**
	 * Get 预计到货时间
	 */
	@Column(name = "ETTA_ARRIVAL_TIME")
	public Date getEttaArrivalTime() {
		return ettaArrivalTime;
	}

	/**
	 * Set 预计到货时间
	 */
	public void setEttaArrivalTime(Date ettaArrivalTime) {
		this.ettaArrivalTime = ettaArrivalTime;
		addValidField("ettaArrivalTime");
	}

	/**
	 * Get 装车顺序
	 */
	@Column(name = "ETTA_LOAD_SEQ")
	public String getEttaLoadSeq() {
		return ettaLoadSeq;
	}

	/**
	 * Set 装车顺序
	 */
	public void setEttaLoadSeq(String ettaLoadSeq) {
		this.ettaLoadSeq = ettaLoadSeq;
		addValidField("ettaLoadSeq");
	}

	/**
	 * Get 卸车顺序
	 */
	@Column(name = "ETTA_UN_LOAD_SEQ")
	public String getEttaUnLoadSeq() {
		return ettaUnLoadSeq;
	}

	/**
	 * Set 卸车顺序
	 */
	public void setEttaUnLoadSeq(String ettaUnLoadSeq) {
		this.ettaUnLoadSeq = ettaUnLoadSeq;
		addValidField("ettaUnLoadSeq");
	}

	/**
	 * Get 任务资质名称列表
	 */
	@Column(name = "ETTA_CERTIFICATION_NAME_LIST")
	public String getEttaCertificationNameList() {
		return ettaCertificationNameList;
	}

	/**
	 * Set 任务资质名称列表
	 */
	public void setEttaCertificationNameList(String ettaCertificationNameList) {
		this.ettaCertificationNameList = ettaCertificationNameList;
		addValidField("ettaCertificationNameList");
	}

	/**
	 * Get 用于建立TMS和OMS或其他第三方系统的任务数据的关系
	 */
	@Column(name = "ETTA_FK_SYS_ID")
	public String getEttaFkSysId() {
		return ettaFkSysId;
	}

	/**
	 * Set 用于建立TMS和OMS或其他第三方系统的任务数据的关系
	 */
	public void setEttaFkSysId(String ettaFkSysId) {
		this.ettaFkSysId = ettaFkSysId;
		addValidField("ettaFkSysId");
	}

	/**
	 * Get 用于标记数据的来源系统
	 */
	@Column(name = "ETTA_SOURCE_SYS_FALG")
	public String getEttaSourceSysFalg() {
		return ettaSourceSysFalg;
	}

	/**
	 * Set 用于标记数据的来源系统
	 */
	public void setEttaSourceSysFalg(String ettaSourceSysFalg) {
		this.ettaSourceSysFalg = ettaSourceSysFalg;
		addValidField("ettaSourceSysFalg");
	}
	
	/**
	 * Get 净重:陆运任务
	 * 海运任务
	 * 铁路任务
	 */
	@Column(name = "ETTA_NET_WEIGHT")
	public Double getEttaNetWeight() {
		return ettaNetWeight;
	}

	/**
	 * Set 净重:陆运任务
	 * 海运任务
	 * 铁路任务
	 */
	public void setEttaNetWeight(Double ettaNetWeight) {
		this.ettaNetWeight = ettaNetWeight;
		addValidField("ettaNetWeight");
	}

	@Column(name = "ETTA_GROUP_NUM")
	public Integer getEttaGroupNum() {
		return ettaGroupNum;
	}

	public void setEttaGroupNum(Integer ettaGroupNum) {
		this.ettaGroupNum = ettaGroupNum;
		addValidField("ettaGroupNum");
	}
	
	/**
	 * @return the eotaTractorReq
	 */
	@Column(name = "ETTA_TRACTOR_REQ")
	public String getEttaTractorReq() {
		return ettaTractorReq;
	}

	/**
	 * @return the eotaTrailerReq
	 */
	@Column(name = "ETTA_TRAILER_REQ")
	public String getEttaTrailerReq() {
		return ettaTrailerReq;
	}

	/**
	 * @return the eotaTransportReq
	 */
	@Column(name = "ETTA_TRANSPORT_REQ")
	public String getEttaTransportReq() {
		return ettaTransportReq;
	}

	/**
	 * @param eotaTractorReq the eotaTractorReq to set
	 */
	public void setEttaTractorReq(String ettaTractorReq) {
		this.ettaTractorReq = ettaTractorReq;
		addValidField("ettaTractorReq");
	}

	/**
	 * @param eotaTrailerReq the eotaTrailerReq to set
	 */
	public void setEttaTrailerReq(String ettaTrailerReq) {
		this.ettaTrailerReq = ettaTrailerReq;
		addValidField("ettaTrailerReq");
	}

	/**
	 * @param eotaTransportReq the eotaTransportReq to set
	 */
	public void setEttaTransportReq(String ettaTransportReq) {
		this.ettaTransportReq = ettaTransportReq;
		addValidField("ettaTransportReq");
	}
	/**
	 * Get 调度人ID:陆运任务
	 */
	@Column(name = "ETTA_SCHEDULE_ID")
	public Integer getEttaScheduleId() {
		return ettaScheduleId;
	}
	/**
	 * @param ettaScheduleId the ettaScheduleId to set
	 */
	public void setEttaScheduleId(Integer ettaScheduleId) {
		this.ettaScheduleId = ettaScheduleId;
		addValidField("ettaScheduleId");
	}
	/**
	 * Get 调度人:陆运任务
	 */
	@Column(name = "ETTA_SCHEDULE_NAME")
	public String getEttaScheduleName() {
		return ettaScheduleName;
	}
	/**
	 * @param ettaScheduleName the ettaScheduleName to set
	 */
	public void setEttaScheduleName(String ettaScheduleName) {
		this.ettaScheduleName = ettaScheduleName;
		addValidField("ettaScheduleName");
	}
	@Column(name = "ETTA_EOOC_ID")
	public Integer getEttaEoocId() {
		return ettaEoocId;
	}

	public void setEttaEoocId(Integer ettaEoocId) {
		this.ettaEoocId = ettaEoocId;
		addValidField("ettaEoocId");
	}
	
  
	/**
	 * Get 最后执行状态
	 */
	@Column(name = "ETTA_LAST_STATUS")
	public String getEttaLastStatus() {
		return ettaLastStatus;
	}

	/**
	 * Set 最后执行状态
	 */
	public void setEttaLastStatus(String ettaLastStatus) {
		this.ettaLastStatus = ettaLastStatus;
		addValidField("ettaLastStatus");
	}

  
	/**
	 * Get 返场时间
	 */
	@Column(name = "ETTA_RETURN_TIME")
	public Date getEttaReturnTime() {
		return ettaReturnTime;
	}

	/**
	 * Set 返场时间
	 */
	public void setEttaReturnTime(Date ettaReturnTime) {
		this.ettaReturnTime = ettaReturnTime;
		addValidField("ettaReturnTime");
	}

  
	/**
	 * Get 入库任务:收货时间
	 */
	@Column(name = "ETTA_RECEIVE_TIME")
	public Date getEttaReceiveTime() {
		return ettaReceiveTime;
	}

	/**
	 * Set 入库任务:收货时间
	 */
	public void setEttaReceiveTime(Date ettaReceiveTime) {
		this.ettaReceiveTime = ettaReceiveTime;
		addValidField("ettaReceiveTime");
	}

  
	/**
	 * Get 出库任务:备货时间
	 */
	@Column(name = "ETTA_STOCK_UP_TIME")
	public Date getEttaStockUpTime() {
		return ettaStockUpTime;
	}

	/**
	 * Set 出库任务:备货时间
	 */
	public void setEttaStockUpTime(Date ettaStockUpTime) {
		this.ettaStockUpTime = ettaStockUpTime;
		addValidField("ettaStockUpTime");
	}
	@Column(name = "ETTA_START_LOADING_TIME")
	public String getEttaStartLoadingTime() {
		return ettaStartLoadingTime;
	}

	public void setEttaStartLoadingTime(String ettaStartLoadingTime) {
		this.ettaStartLoadingTime = ettaStartLoadingTime;
		addValidField("ettaStartLoadingTime");
	}
	@Column(name = "ETTA_FINISHED_LOADED_TIME")
	public String getEttaFinishedLoadedTime() {
		return ettaFinishedLoadedTime;
	}

	public void setEttaFinishedLoadedTime(String ettaFinishedLoadedTime) {
		this.ettaFinishedLoadedTime = ettaFinishedLoadedTime;
		addValidField("ettaFinishedLoadedTime");
	}
	
	@Column(name = "ETTA_COST_STATUS")
	public String getEttaCostStatus() {
		return ettaCostStatus;
	}

	public void setEttaCostStatus(String ettaCostStatus) {
		this.ettaCostStatus = ettaCostStatus;
		addValidField("ettaCostStatus");
	}
	
	/**
	 * Get 是否为调度指令(Y是调度指令
	 * 空 或者N为不是调度指令)
	 */
	@Column(name = "ETTA_IS_SCHEDULE_INSTRUCTION")
	public String getEttaIsScheduleInstruction() {
		return ettaIsScheduleInstruction;
	}

	/**
	 * Set 是否为调度指令(Y是调度指令
	 * 空 或者N为不是调度指令)
	 */
	public void setEttaIsScheduleInstruction(String ettaIsScheduleInstruction) {
		this.ettaIsScheduleInstruction = ettaIsScheduleInstruction;
		addValidField("ettaIsScheduleInstruction");
	}

	/**
	 * Get 双拖键值(双拖时记住另一个任务id)
	 */
	@Column(name = "ETTA_DOUBLE_ID")
	public Long getEttaDoubleId() {
		return ettaDoubleId;
	}

	/**
	 * Set 双拖键值(双拖时记住另一个任务id)
	 */
	public void setEttaDoubleId(Long ettaDoubleId) {
		this.ettaDoubleId = ettaDoubleId;
		addValidField("ettaDoubleId");
	}

	/**
	 * Get 调度指令名称
	 */
	@Column(name = "ETTA_EBSI_NAME")
	public String getEttaEbsiName() {
		return ettaEbsiName;
	}

	/**
	 * Set 调度指令名称
	 */
	public void setEttaEbsiName(String ettaEbsiName) {
		this.ettaEbsiName = ettaEbsiName;
		addValidField("ettaEbsiName");
	}
	
	@Column(name = "ETTA_LAST_INSTRUCTION")
	public String getEttaLastInstruction() {
		return ettaLastInstruction;
	}

	public void setEttaLastInstruction(String ettaLastInstruction) {
		this.ettaLastInstruction = ettaLastInstruction;
		addValidField("ettaLastInstruction");
	}
	@Column(name = "ETTA_EMPTY_STATUS")
	public String getEttaEmptyStatus() {
		return ettaEmptyStatus;
	}

	public void setEttaEmptyStatus(String ettaEmptyStatus) {
		this.ettaEmptyStatus = ettaEmptyStatus;
		addValidField("ettaEmptyStatus");
	}
	
	/**
	 * Get 检疫地点
	 */
	@Column(name = "ETTA_QUARANTINE_ADS")
	public String getEttaQuarantineAds() {
		return ettaQuarantineAds;
	}

	/**
	 * Set 检疫地点
	 */
	public void setEttaQuarantineAds(String ettaQuarantineAds) {
		this.ettaQuarantineAds = ettaQuarantineAds;
		addValidField("ettaQuarantineAds");
	}

	/**
	 * Get 验木包装地点
	 */
	@Column(name = "ETTA_WOODEN_PACKAGING_ADS")
	public String getEttaWoodenPackagingAds() {
		return ettaWoodenPackagingAds;
	}

	/**
	 * Set 验木包装地点
	 */
	public void setEttaWoodenPackagingAds(String ettaWoodenPackagingAds) {
		this.ettaWoodenPackagingAds = ettaWoodenPackagingAds;
		addValidField("ettaWoodenPackagingAds");
	}

	/**
	 * Get 熏蒸地点
	 */
	@Column(name = "ETTA_FUMIGATION_ADS")
	public String getEttaFumigationAds() {
		return ettaFumigationAds;
	}

	/**
	 * Set 熏蒸地点
	 */
	public void setEttaFumigationAds(String ettaFumigationAds) {
		this.ettaFumigationAds = ettaFumigationAds;
		addValidField("ettaFumigationAds");
	}

	/**
	 * Get 动检地点
	 */
	@Column(name = "ETTA_ANIMAL_QUARANTINE_ADS")
	public String getEttaAnimalQuarantineAds() {
		return ettaAnimalQuarantineAds;
	}

	/**
	 * Set 动检地点
	 */
	public void setEttaAnimalQuarantineAds(String ettaAnimalQuarantineAds) {
		this.ettaAnimalQuarantineAds = ettaAnimalQuarantineAds;
		addValidField("ettaAnimalQuarantineAds");
	}
	
	
	@Column(name = "ETTA_IS_IMPORT")
	public String getEttaIsImport() {
		return ettaIsImport;
	}

	public void setEttaIsImport(String ettaIsImport) {
		this.ettaIsImport = ettaIsImport;
		addValidField("ettaIsImport");
	}

	@Column(name = "ETTA_ORDER_OTMS")
	public String getEttaOrderOtms() {
		return ettaOrderOtms;
	}

	public void setEttaOrderOtms(String ettaOrderOtms) {
		this.ettaOrderOtms = ettaOrderOtms;
		addValidField("ettaOrderOtms");
	}

	@Column(name = "ETTA_URL_OTMS")
	public String getEttaUrlOtms() {
		return ettaUrlOtms;
	}

	public void setEttaUrlOtms(String ettaUrlOtms) {
		this.ettaUrlOtms = ettaUrlOtms;
		addValidField("ettaUrlOtms");
	}

	@Column(name = "ETTA_BATCH_NO")
	public String getEttaBatchNo() {
		return ettaBatchNo;
	}

	public void setEttaBatchNo(String ettaBatchNo) {
		this.ettaBatchNo = ettaBatchNo;
		addValidField("ettaBatchNo");
	}

	@Column(name = "ETTA_IS_INTELSCHEDULING")
	public String getEttaIsIntelscheduling() {
		return ettaIsIntelscheduling;
	}

	public void setEttaIsIntelscheduling(String ettaIsIntelscheduling) {
		this.ettaIsIntelscheduling = ettaIsIntelscheduling;
		addValidField("ettaIsIntelscheduling");
	}
	
	
}
