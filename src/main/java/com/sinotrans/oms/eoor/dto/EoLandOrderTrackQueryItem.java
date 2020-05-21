package com.sinotrans.oms.eoor.dto;

import java.io.Serializable;
import java.util.Date;

public class EoLandOrderTrackQueryItem implements Serializable {
	
	/**
     * 收货人
     */
	private String eoorConsigneeEbspNameCn;
   /**
    * 收货联系人
    */
	private String eoorConsigneeEbsaContact;
 	/**
    * 收货联系电话
    */
	private String eoorConsigneeEbsaTel;
   /**
     * 收货人地址
    */
	private String eoorConsigneeEbsaAddress;
	/**
	 * 任务表主键
	 */
	private Integer eotaId;

	/**
	 * 订单ID
	 */
	private Integer eotaEoorId;

	/**
	 * 所属公司
	 */
	private Integer eotaEscoId;

	/**
	 * 调度计划主键
	 */
	private Integer eotaEtspId;

	/**
	 * 任务编号:所有任务
	 */
	private String eotaNo;

	/**
	 * 任务拆分状态0.未拆分，1.拆分
	 */
	private String eotaSplitStatus;

	/**
	 * 任务类型
	 */
	private String eotaType;

	/**
	 * 任务状态:所有任务
	 */
	private String eotaStatus;

	/**
	 * 任务顺序
	 */
	private Double eotaOrder;

	/**
	 * 上级任务
	 */
	private Double eotaSelfId;

	/**
	 * SO NO除了进口拖车，出口拖车任务，其他任务公用
	 */
	private String eotaSoNo;

	/**
	 * DO NO
	 */
	private String eotaDoNo;

	/**
	 * 陆运公司ID:陆运任务
	 */
	private Integer eotaLandEbcuId;

	/**
	 * 陆运公司全称：陆运任务
	 */
	private String eotaLandEbcuNameCn;

	/**
	 * 客户ID：陆运任务
	 */
	private Integer eotaCustomerEbcuId;

	/**
	 * 客户名称：陆运任务
	 */
	private String eotaCustomerEbcuNameCn;

	/**
	 * 紧急程度：陆运任务
	 */
	private String eotaUrgency;

	/**
	 * 要求提货时间：陆运任务
	 */
	private Date eotaDeliveryReqTime;

	/**
	 * 任务安排时间：陆运任务
	 */
	private Date eotaTaskScheduleTime;

	/**
	 * 要求到货时间:陆运任务
	 */
	private Date eotaArrivalReqTime;

	/**
	 * 提柜时间:陆运任务
	 */
	private Date eotaMentionTime;

	/**
	 * 运输特殊要求:陆运任务
	 */
	private String eotaTransSpeReq;

	/**
	 * 收货人收货特殊要求:陆运任务
	 */
	private String eotaReceiveSpeReq;

	/**
	 * 行车路线描述:陆运任务
	 */
	private String eotaLineDesc;

	/**
	 * 箱型:陆运任务,海运任务，铁路任务
	 */
	private String eotaContainerType;

	/**
	 * 箱量:陆运任务，海运任务
	 */
	private String eotaContainerWeight;

	/**
	 * 是否白卡:陆运任务
	 */
	private String eotaIsWhiteCard;

	/**
	 * 是否短驳:陆运任务
	 */
	private String eotaIsShortBarge;

	/**
	 * 是否包车:陆运任务
	 */
	private String eotaIsChartered;

	/**
	 * 是否可拼:陆运任务
	 */
	private String eotaIsToFight;

	/**
	 * 起运地ID:陆运任务
	 */
	private Integer eotaFromEbrgId;

	/**
	 * 起运地名称:陆运任务
	 */
	private String eotaFromEbrgNameCn;

	/**
	 * 目的地ID:陆运任务
	 */
	private Integer eotaToEbrgId;

	/**
	 * 目的地名称:陆运任务
	 */
	private String eotaToEbrgNameCn;

	/**
	 * 毛重:陆运任务，海运任务，铁路任务
	 */
	private Double eotaWeight;
	
	/**
	 * 净重:陆运任务，海运任务，铁路任务
	 */
	private Double eotaNetWeight;

	/**
	 * 件数:陆运任务，海运任务，铁路任务
	 */
	private Double eotaQuantity;

	/**
	 * 体积:陆运任务，海运任务，铁路任务
	 */
	private Double eotaVolume;

	/**
	 * 提货地址:陆运任务
	 */
	private String eotaDeliveryAddress;

	/**
	 * 收货地址:陆运任务
	 */
	private String eotaReceiveAddress;

	/**
	 * 备注:所有任务
	 */
	private String eotaRemark;

	/**
	 * 出/入库单号:出入库任务
	 */
	private String eotaLibraryNo;

	/**
	 * 出/入库时间:出入库任务
	 */
	private Date eotaLibraryTime;

	/**
	 * 出/入仓库/报关行/航空公司/船ID:出入库任务，报关任务，海运任务，空运任务
	 */
	private Integer eotaEbcuId;

	/**
	 * 出/入仓库/报关行/航空公司/船名称:出入库任务，报关任务，海运任务，空运任务
	 */
	private String eotaEbcuNameCn;

	/**
	 * 出/入仓数量:出入库任务
	 */
	private Double eotaLibraryNumber;

	/**
	 * 出/入合计件数:出入库任务
	 */
	private Double eotaLibraryQuantity;

	/**
	 * 出/入合计体积:出入库任务
	 */
	private Double eotaLibraryVolume;

	/**
	 * 出/入合计毛重:出入库任务
	 */
	private Double eotaLibraryGw;

	/**
	 * 出/入合计净重:出入库任务
	 */
	private Double eotaLibraryNw;

	/**
	 * 订舱代理ID:海运任务，铁路任务，海运任务
	 */
	private Integer eotaBookingEbcuId;

	/**
	 * 订舱代理:海运任务，铁路任务，海运任务
	 */
	private String eotaBookingEbcuNameCn;

	/**
	 * 订舱单号:海运任务，空运任务
	 */
	private String eotaBookingNo;

	/**
	 * 关单号:海运任务
	 */
	private String eotaCustomNo;

	/**
	 * 船名:海运任务，出口拖车任务
	 */
	private String eotaVessel;

	/**
	 * 航次:海运任务，出口拖车任务，空运任务
	 */
	private String eotaVoyage;

	/**
	 * 开航日期:海运任务，出口拖车任务，铁路任务，空运任务
	 */
	private Date eotaDepartureDate;

	/**
	 * 预计开航日期:海运任务，铁路任务，空运任务
	 */
	private Date eotaPlanDepartureDate;

	/**
	 * 预计到港日期:海运任务，铁路任务，空运任务
	 */
	private Date eotaPlanArrivalDate;

	/**
	 * 到港日期:海运任务，铁路任务，空运任务
	 */
	private Date eotaArrivalDate;

	/**
	 * 装箱时间:海运任务，进口拖车任务
	 */
	private Date eotaPackingTime;

	/**
	 * 集港时间:海运任务
	 */
	private Date eotaSetPostTime;

	/**
	 * 截重时间:海运任务
	 */
	private Date eotaWeightTime;

	/**
	 * 截关时间:海运任务
	 */
	private Date eotaCutTime;

	/**
	 * 起运港ID:海运任务，空运任务
	 */
	private Integer eotaStartEbptId;

	/**
	 * 起运港名称:海运任务，空运任务
	 */
	private String eotaStartEbptNameCn;

	/**
	 * 目的港ID:海运任务，空运任务
	 */
	private Integer eotaEndEbptId;

	/**
	 * 目的港名称:海运任务，空运任务
	 */
	private String eotaEndEbptNameCn;

	/**
	 * MBL:海运任务
	 */
	private String eotaMblNo;

	/**
	 * HBL:海运任务
	 */
	private String eotaHblNo;

	/**
	 * 箱ID:海运任务
	 */
	private Integer eotaEtcaId;

	/**
	 * 箱号:海运任务，出口拖车任务
	 */
	private String eotaEtcaNo;

	/**
	 * 封号:海运任务，出口拖车任务
	 */
	private String eotaTitleNo;

	/**
	 * 报关类型:报关任务
	 */
	private String eotaCustomType;

	/**
	 * 文件编号:报关任务
	 */
	private String eotaFileNo;

	/**
	 * 文件类型:报关任务
	 */
	private String eotaFileType;

	/**
	 * 放行时间:报关任务，出口拖车任务
	 */
	private Date eotaReleaseTime;

	/**
	 * 送单时间:报关任务
	 */
	private Date eotaSendTime;

	/**
	 * 回单时间:报关任务
	 */
	private Date eotaBackTime;

	/**
	 * 报关地点:报关任务
	 */
	private String eotaCustomPlace;

	/**
	 * 口岸报关行ID:报关任务，进口拖车任务
	 */
	private Integer eotaPortEbcuId;

	/**
	 * 口岸报关行名称:报关任务，进口拖车任务
	 */
	private String eotaPortEbcuNameCn;

	/**
	 * 口岸报关地点:报关任务
	 */
	private String eotaPortAddress;

	/**
	 * 装箱地址：进出口拖车任务
	 */
	private String eotaPackingAddress;

	/**
	 * 理货日期：进出口拖车任务
	 */
	private Date eotaTallyDate;

	/**
	 * 截港日期：出口拖车任务
	 */
	private Date eotaCutPostDate;

	/**
	 * 提箱时间：进出口拖车任务
	 */
	private Date eotaSuitcaseTime;

	/**
	 * 提箱地址：进口拖车任务
	 */
	private String eotaSuitcaseAddress;

	/**
	 * 进港日期：出口拖车任务
	 */
	private Date eotaInPostDate;

	/**
	 * 上船日期：出口拖车任务
	 */
	private Date eotaUpShippingDate;

	/**
	 * 要求到达：进出口拖车任务
	 */
	private Date eotaReqArrival;

	/**
	 * 实际到达：进出口拖车任务
	 */
	private Date eotaActualArrival;

	/**
	 * 联系方式：进出口拖车任务
	 */
	private String eotaContact;

	/**
	 * 派车信息：进出口拖车任务
	 */
	private String eotaSentCarInfo;

	/**
	 * 离场时间：进出口拖车任务
	 */
	private Date eotaLeaveTime;

	/**
	 * 离场备注：进出口拖车任务
	 */
	private String eotaDepartureRemark;

	/**
	 * 包装形式：进出口拖车任务
	 */
	private String eotaPackaging;

	/**
	 * 报关预入日期：出口拖车任务
	 */
	private Date eotaPreentryDate;

	/**
	 * 查验日期:进出口拖车任务
	 */
	private Date eotaPortTime;

	/**
	 * 查验日期：进出口拖车任务
	 */
	private Date eotaCheckDate;

	/**
	 * 是否污箱：进口拖车任务
	 */
	private String eotaIsSewageTank;

	/**
	 * 执行情况:进出口拖车任务
	 */
	private String eotaPerformDesc;

	/**
	 * 修改人员:进出口拖车任务
	 */
	private String eotaModifier;

	/**
	 * 修改日期:进出口拖车任务
	 */
	private Date eotaModifyTime;

	/**
	 * 输入人员:进出口拖车任务
	 */
	private String eotaCreator;

	/**
	 * 输入日期:进出口拖车任务
	 */
	private Date eotaCreateTime;

	/**
	 * 包装备注:进出口拖车任务
	 */
	private String eotaPackageRemark;

	/**
	 * 动卫检查验:进口拖车任务
	 */
	private Date eotaInspecteDate;

	/**
	 * 动卫检查询:进口拖车任务
	 */
	private String eotaCheckDesc;

	/**
	 * 进出口：空运任务
	 */
	private String eotaInOut;

	/**
	 * 还箱地址:进口拖车任务
	 */
	private String eotaReturnTankAddress;

	/**
	 * 还箱时间:进口拖车任务
	 */
	private Date eotaBackTankTime;

	/**
	 * 计划提货日期:进口拖车任务
	 */
	private Date eotaPlanDeliveryDate;

	/**
	 * 是否落箱:进口拖车任务
	 */
	private String eotaIsDropTank;

	/**
	 * 单证收全日期：空运任务
	 */
	private Date eotaCollectDate;

	/**
	 * 报关开始日期：空运任务
	 */
	private Date eotaCustomStartDate;

	/**
	 * 换单日期：空运任务
	 */
	private Date eotaChangeDate;

	/**
	 * 取得换证凭条日期:进口拖车任务
	 */
	private Date eotaObtainDate;

	/**
	 * 进物流园时间:进口拖车任务
	 */
	private Date eotaInParkTime;

	/**
	 * 出物流园时间:进口拖车任务
	 */
	private Date eotaOutParkTime;

	/**
	 * 是否港区计划:进口拖车任务
	 */
	private String eotaIsPortPlan;

	/**
	 * 报关结束日期：空运任务
	 */
	private Date eotaCustomEndDate;

	/**
	 * 货物入库日期：空运任务
	 */
	private Date eotaInWarehouseDate;

	/**
	 * 单税签收日期：空运任务
	 */
	private Date eotaFinishedDate;

	/**
	 * 付税日期：空运任务
	 */
	private Date eotaPayTaxDate;

	/**
	 * 车次：铁路任务
	 */
	private String eotaTrain;

	/**
	 * 截止进站时间：铁路任务
	 */
	private Date eotaStopStationTime;

	/**
	 * 进站时间：铁路任务
	 */
	private Date eotaStationTime;

	/**
	 * 近期铁路检测时间：铁路任务
	 */
	private Date eotaRailwayTime;

	/**
	 * 核销单返还日期
	 */
	private Date eotaReturnDate;

	/**
	 * 车队ID：进出口拖车任务
	 */
	private Integer eotaTeamEbcuId;

	/**
	 * 车队：进出口拖车任务
	 */
	private String eotaTeamEbcuNameCn;

	/**
	 * 码头ID：进出口拖车任务
	 */
	private Integer eotaTerminalEbcuId;

	/**
	 * 码头：进出口拖车任务
	 */
	private String eotaTerminalEbcuNameCn;

	/**
	 * 提箱地：陆运任务
	 */
	private String eotaSuitcase;

	/**
	 * 还箱地：陆运任务
	 */
	private String eotaCrates;

	/**
	 * 主驾驶ID：陆运任务
	 */
	private Integer eotaMainEttpId;

	/**
	 * 挂车车牌号：陆运任务
	 */
	private String eotaTrailerEtveCard;

	/**
	 * 挂车ID：陆运任务
	 */
	private Integer eotaTrailerEtveId;

	/**
	 * 牵引车车牌号：陆运任务
	 */
	private String eotaTractorEtveCard;

	/**
	 * 牵引车ID：陆运任务
	 */
	private Integer eotaTractorEtveId;

	/**
	 * 主驾驶：陆运任务
	 */
	private String eotaMainEttpName;

	/**
	 * 副驾驶ID：陆运任务
	 */
	private Integer eotaCopilorEttpId;

	/**
	 * 副驾驶：陆运任务
	 */
	private String eotaCopilorEttpName;

	/**
	 * 集装箱ID：陆运任务
	 */
	private Integer eotaLandEtcaId;

	/**
	 * 陆运任务集装箱号：陆运任务
	 */
	private String eotaLandEtcaNo;

	/**
	 * 陆运任务封号：陆运任务
	 */
	private String eotaLandTitleNo;

	/**
	 * 司机联系方式：陆运任务
	 */
	private String eotaEttpTel;

	/**
	 * 陆运承运人：陆运任务
	 */
	private String eotaCarrierEbcuId;

	/**
	 * 陆运承运人名称：陆运任务
	 */
	private String eotaCarrierEbcuNameCn;

	/**
	 * 行车路线：陆运任务
	 */
	private String eotaEblnId;

	/**
	 * 行车路线名称：陆运任务
	 */
	private String eotaEblnLineName;

	/**
	 * 是否进入内部车辆调度池:陆运任务
	 */
	private String eotaIsWithin;

	/**
	 * 额定里程
	 */
	private String eotaRateMileage;

	/**
	 * 预留字段
	 */
	private Double eotaSubnum1;

	/**
	 * 预留字段
	 */
	private String eotaSubstr1;

	/**
	 * 预留字段
	 */
	private String eotaSubstr2;

	/**
	 * 预留字段
	 */
	private String eotaSubstr3;

	/**
	 * 预留字段
	 */
	private String eotaSubstr4;

	/**
	 * 预留字段
	 */
	private String eotaSubstr5;

	/**
	 * 预留字段
	 */
	private String eotaSubstr6;

	/**
	 * 预留字段
	 */
	private String eotaSubstr8;

	/**
	 * 预留字段
	 */
	private String eotaSubstr7;

	/**
	 * 预留字段
	 */
	private Date eotaSubdate1;

	/**
	 * 预留字段
	 */
	private Date eotaSubdate2;

	/**
	 * 预留字段
	 */
	private Date eotaSubdate5;

	/**
	 * 预留字段
	 */
	private Date eotaSubdate4;

	/**
	 * 预留字段
	 */
	private Date eotaSubdate3;

	/**
	 * 预留字段
	 */
	private Double eotaSubnum3;

	/**
	 * 预留字段
	 */
	private Double eotaSubnum2;

	/**
	 * 任务跟踪表主键
	 */
	private Integer eottId;

	/**
	 * 任务表主键
	 */
	private Integer eottEotaId;

	/**
	 * 所属平台ID
	 */
	private Integer eottEscoId;

	/**
	 * 订单表主键
	 */
	private Integer eottEoorId;

	/**
	 * 调度计划表主键
	 */
	private Integer eottEtspId;

	/**
	 * 调度配载日期
	 */
	private Date eottLoadTime;

	/**
	 * 预计提货日期
	 */
	private Date eottPlanDeliveryTime;

	/**
	 * 实际提货日期
	 */
	private Date eottDeliveryTime;

	/**
	 * 计划到达收货方日期
	 */
	private Date eottPlanArrivalTime;

	/**
	 * 实际到库时间
	 */
	private Date eottToLibraryTime;

	/**
	 * 实际装完时间
	 */
	private Date eottLoadedTime;

	/**
	 * 实际离库时间
	 */
	private Date eottFromLibraryTime;

	/**
	 * 到达收货方时间
	 */
	private Date eottArrivalTime;

	/**
	 * 开始卸货时间
	 */
	private Date eottPlanDischargeTime;

	/**
	 * 实际间卸完时间
	 */
	private Date eottDischargeTime;

	/**
	 * 是否拿到签收单
	 */
	private String eottIsSign;

	/**
	 * 到达关场时间
	 */
	private Date eottToSekibaTime;

	/**
	 * 离开关场时间
	 */
	private Date eottFromSekibaTime;

	/**
	 * 开始装货时间
	 */
	private Date eottLoadingTime;

	/**
	 * 卸货车是否倾斜
	 */
	private String eottIsTilt;

	/**
	 * 是否库存取样
	 */
	private String eottIsInventory;

	/**
	 * 是否客户取样
	 */
	private String eottIsCustomer;

	/**
	 * 车队是否保留样品
	 */
	private String eottIsKeep;

	/**
	 * 发货磅单
	 */
	private String eottDeliveryNo;

	/**
	 * 提货空车重量
	 */
	private Double eottLoadEmptyWeight;

	/**
	 * 提货重车重量
	 */
	private Double eottLoadHeavyWeight;

	/**
	 * 装货数量
	 */
	private Double eottLoadingQuantity;

	/**
	 * 卸货重车重量
	 */
	private Double eottUnloadHeavyWeight;

	/**
	 * 卸货空车重量
	 */
	private Double eottUnloadEmptyWeight;

	/**
	 * 卸货数量
	 */
	private Double eottUnloadingQuantity;

	/**
	 * 差异
	 */
	private Double eottDifference;

	/**
	 * 收货磅单
	 */
	private String eottReceiveNo;

	/**
	 * 第三方磅单
	 */
	private String eottThirdPound;

	/**
	 * 第三方重车重量
	 */
	private Double eottThirdHeavyWeight;

	/**
	 * 第三方空车重量
	 */
	private Double eottThirdEmptyWeight;

	/**
	 * 第三方重差
	 */
	private Double eottThirdDiff;

	/**
	 * 收到购买凭证时间
	 */
	private Date eottBuyVoucherTime;

	/**
	 * 开始验车时间
	 */
	private Date eottInspecteTime;

	/**
	 * 验车通过时间
	 */
	private Date eottThroughTime;

	/**
	 * 开始申请通行证时间
	 */
	private Date eottApplyPassTime;

	/**
	 * 得到通行证时间
	 */
	private Date eottGetPassTime;

	/**
	 * 批准运输时间
	 */
	private Date eottApproveTarnTime;

	/**
	 * 押板结束时间
	 */
	private Date eottToChargeSheetTime;

	/**
	 * 押板起算时间
	 */
	private Date eottFromChargeSheetTime;

	/**
	 * 押车结束时间
	 */
	private Date eottToGuardTime;

	/**
	 * 押车起算时间
	 */
	private Date eottFromGuardTime;

	/**
	 * 是否调箱
	 */
	private String eottIsTransfer;

	/**
	 * 预留字段
	 */
	private String eottSubstr1;

	/**
	 * 预留字段
	 */
	private String eottSubstr2;

	/**
	 * 预留字段
	 */
	private String eottSubstr3;

	/**
	 * 预留字段
	 */
	private String eottSubstr4;

	/**
	 * 预留字段
	 */
	private String eottSubstr5;

	/**
	 * 预留字段
	 */
	private String eottSubstr6;

	/**
	 * 预留字段
	 */
	private String eottSubstr8;

	/**
	 * 预留字段
	 */
	private String eottSubstr7;

	/**
	 * 预留字段
	 */
	private Date eottSubdate1;

	/**
	 * 预留字段
	 */
	private Date eottSubdate2;

	/**
	 * 预留字段
	 */
	private Date eottSubdate5;

	/**
	 * 预留字段
	 */
	private Date eottSubdate4;

	/**
	 * 预留字段
	 */
	private Date eottSubdate3;

	/**
	 * 预留字段
	 */
	private Double eottSubnum3;

	/**
	 * 预留字段
	 */
	private Double eottSubnum2;

	/**
	 * 预留字段
	 */
	private Double eottSubnum1;

	/**
	 * 
	 */
	private Integer recVer;

	/**
	 * 
	 */
	private Date modifyTime;

	/**
	 * 
	 */
	private String modifier;

	/**
	 * 
	 */
	private Date createTime;

	/**
	 * 
	 */
	private String creator;

	/**
	 * 提货车辆ID
	 */
	private Integer eottDeliveryEtveId;

	/**
	 * 提货车辆牌号
	 */
	private String eottDeliveryEtveCard;

	/**
	 * 送货承运人
	 */
	private String eottReceiveEbcuNameCn;

	/**
	 * 送货承运人ID
	 */
	private Integer eottReceiveEbcuId;

	/**
	 * 送货车辆ID
	 */
	private Integer eottReceiveEtveId;

	/**
	 * 送货车辆牌号
	 */
	private String eottReceiveEtveCard;

	/**
	 * 项目名称
	 */
	private String eoorEbpjName;
	/**
	 * 调度计划ID
	 */
	private Integer etspId;
	
	/**
	 * 调度计划状态
	 */
	private String etspStatus;
	
	/**
	 * 运输单号
	 */
	private String eotaTransportNo;
	//要求提货时间
	private Date eoorReqDeliveryDate;
	//要求到达时间
	private Date eoorReqArrivalDate;
    //任务跟踪的备注
	private String eottRemark;
	/**
	 *配箱ID
	 */
	private Integer eotaEoocId;
	/**
	 * 第三方过磅货重
	 */
	private Double eottThirdPoundWeight;
  
	//提货司磅员
	private String eottLoadPerson;

	//卸货司磅员
	private String eottUnloadPerson;

	//第三方司磅员
	private String eottThirdPerson;

	//提货过磅日期
	private Date eottLoadDate;

	//卸货过磅日期
	private Date eottUnloadDate;

	//第三方过磅日期
	private Date eottThirdDate;

	//提货罐箱温度
	private String eottLoadTemperature;

	//卸货罐箱温度
	private String eottUnloadTemperature;

	//第三方罐箱温度
	private String eottThirdTemperature;

	//签收人
	private String eottReceipient;
	
	//推迟原因
	private String eottDelaySupplychainid;
	private String eottDelayCategory;
	private String eottDelayAccountability;
	private String eottDelayCause;
	private String eottDelayRemark;
	//项目组
	private String ebpjFCode;
	public String getEoorConsigneeEbspNameCn() {
		return eoorConsigneeEbspNameCn;
	}
	public void setEoorConsigneeEbspNameCn(String eoorConsigneeEbspNameCn) {
		this.eoorConsigneeEbspNameCn = eoorConsigneeEbspNameCn;
	}
	public String getEoorConsigneeEbsaContact() {
		return eoorConsigneeEbsaContact;
	}
	public void setEoorConsigneeEbsaContact(String eoorConsigneeEbsaContact) {
		this.eoorConsigneeEbsaContact = eoorConsigneeEbsaContact;
	}
	public String getEoorConsigneeEbsaTel() {
		return eoorConsigneeEbsaTel;
	}
	public void setEoorConsigneeEbsaTel(String eoorConsigneeEbsaTel) {
		this.eoorConsigneeEbsaTel = eoorConsigneeEbsaTel;
	}
	public String getEoorConsigneeEbsaAddress() {
		return eoorConsigneeEbsaAddress;
	}
	public void setEoorConsigneeEbsaAddress(String eoorConsigneeEbsaAddress) {
		this.eoorConsigneeEbsaAddress = eoorConsigneeEbsaAddress;
	}
	public Integer getEotaId() {
		return eotaId;
	}
	public void setEotaId(Integer eotaId) {
		this.eotaId = eotaId;
	}
	public Integer getEotaEoorId() {
		return eotaEoorId;
	}
	public void setEotaEoorId(Integer eotaEoorId) {
		this.eotaEoorId = eotaEoorId;
	}
	public Integer getEotaEscoId() {
		return eotaEscoId;
	}
	public void setEotaEscoId(Integer eotaEscoId) {
		this.eotaEscoId = eotaEscoId;
	}
	public Integer getEotaEtspId() {
		return eotaEtspId;
	}
	public void setEotaEtspId(Integer eotaEtspId) {
		this.eotaEtspId = eotaEtspId;
	}
	public String getEotaNo() {
		return eotaNo;
	}
	public void setEotaNo(String eotaNo) {
		this.eotaNo = eotaNo;
	}
	public String getEotaSplitStatus() {
		return eotaSplitStatus;
	}
	public void setEotaSplitStatus(String eotaSplitStatus) {
		this.eotaSplitStatus = eotaSplitStatus;
	}
	public String getEotaType() {
		return eotaType;
	}
	public void setEotaType(String eotaType) {
		this.eotaType = eotaType;
	}
	public String getEotaStatus() {
		return eotaStatus;
	}
	public void setEotaStatus(String eotaStatus) {
		this.eotaStatus = eotaStatus;
	}
	public Double getEotaOrder() {
		return eotaOrder;
	}
	public void setEotaOrder(Double eotaOrder) {
		this.eotaOrder = eotaOrder;
	}
	public Double getEotaSelfId() {
		return eotaSelfId;
	}
	public void setEotaSelfId(Double eotaSelfId) {
		this.eotaSelfId = eotaSelfId;
	}
	public String getEotaSoNo() {
		return eotaSoNo;
	}
	public void setEotaSoNo(String eotaSoNo) {
		this.eotaSoNo = eotaSoNo;
	}
	public String getEotaDoNo() {
		return eotaDoNo;
	}
	public void setEotaDoNo(String eotaDoNo) {
		this.eotaDoNo = eotaDoNo;
	}
	public Integer getEotaLandEbcuId() {
		return eotaLandEbcuId;
	}
	public void setEotaLandEbcuId(Integer eotaLandEbcuId) {
		this.eotaLandEbcuId = eotaLandEbcuId;
	}
	public String getEotaLandEbcuNameCn() {
		return eotaLandEbcuNameCn;
	}
	public void setEotaLandEbcuNameCn(String eotaLandEbcuNameCn) {
		this.eotaLandEbcuNameCn = eotaLandEbcuNameCn;
	}
	public Integer getEotaCustomerEbcuId() {
		return eotaCustomerEbcuId;
	}
	public void setEotaCustomerEbcuId(Integer eotaCustomerEbcuId) {
		this.eotaCustomerEbcuId = eotaCustomerEbcuId;
	}
	public String getEotaCustomerEbcuNameCn() {
		return eotaCustomerEbcuNameCn;
	}
	public void setEotaCustomerEbcuNameCn(String eotaCustomerEbcuNameCn) {
		this.eotaCustomerEbcuNameCn = eotaCustomerEbcuNameCn;
	}
	public String getEotaUrgency() {
		return eotaUrgency;
	}
	public void setEotaUrgency(String eotaUrgency) {
		this.eotaUrgency = eotaUrgency;
	}
	public Date getEotaDeliveryReqTime() {
		return eotaDeliveryReqTime;
	}
	public void setEotaDeliveryReqTime(Date eotaDeliveryReqTime) {
		this.eotaDeliveryReqTime = eotaDeliveryReqTime;
	}
	public Date getEotaTaskScheduleTime() {
		return eotaTaskScheduleTime;
	}
	public void setEotaTaskScheduleTime(Date eotaTaskScheduleTime) {
		this.eotaTaskScheduleTime = eotaTaskScheduleTime;
	}
	public Date getEotaArrivalReqTime() {
		return eotaArrivalReqTime;
	}
	public void setEotaArrivalReqTime(Date eotaArrivalReqTime) {
		this.eotaArrivalReqTime = eotaArrivalReqTime;
	}
	public Date getEotaMentionTime() {
		return eotaMentionTime;
	}
	public void setEotaMentionTime(Date eotaMentionTime) {
		this.eotaMentionTime = eotaMentionTime;
	}
	public String getEotaTransSpeReq() {
		return eotaTransSpeReq;
	}
	public void setEotaTransSpeReq(String eotaTransSpeReq) {
		this.eotaTransSpeReq = eotaTransSpeReq;
	}
	public String getEotaReceiveSpeReq() {
		return eotaReceiveSpeReq;
	}
	public void setEotaReceiveSpeReq(String eotaReceiveSpeReq) {
		this.eotaReceiveSpeReq = eotaReceiveSpeReq;
	}
	public String getEotaLineDesc() {
		return eotaLineDesc;
	}
	public void setEotaLineDesc(String eotaLineDesc) {
		this.eotaLineDesc = eotaLineDesc;
	}
	public String getEotaContainerType() {
		return eotaContainerType;
	}
	public void setEotaContainerType(String eotaContainerType) {
		this.eotaContainerType = eotaContainerType;
	}
	public String getEotaContainerWeight() {
		return eotaContainerWeight;
	}
	public void setEotaContainerWeight(String eotaContainerWeight) {
		this.eotaContainerWeight = eotaContainerWeight;
	}
	public String getEotaIsWhiteCard() {
		return eotaIsWhiteCard;
	}
	public void setEotaIsWhiteCard(String eotaIsWhiteCard) {
		this.eotaIsWhiteCard = eotaIsWhiteCard;
	}
	public String getEotaIsShortBarge() {
		return eotaIsShortBarge;
	}
	public void setEotaIsShortBarge(String eotaIsShortBarge) {
		this.eotaIsShortBarge = eotaIsShortBarge;
	}
	public String getEotaIsChartered() {
		return eotaIsChartered;
	}
	public void setEotaIsChartered(String eotaIsChartered) {
		this.eotaIsChartered = eotaIsChartered;
	}
	public String getEotaIsToFight() {
		return eotaIsToFight;
	}
	public void setEotaIsToFight(String eotaIsToFight) {
		this.eotaIsToFight = eotaIsToFight;
	}
	public Integer getEotaFromEbrgId() {
		return eotaFromEbrgId;
	}
	public void setEotaFromEbrgId(Integer eotaFromEbrgId) {
		this.eotaFromEbrgId = eotaFromEbrgId;
	}
	public String getEotaFromEbrgNameCn() {
		return eotaFromEbrgNameCn;
	}
	public void setEotaFromEbrgNameCn(String eotaFromEbrgNameCn) {
		this.eotaFromEbrgNameCn = eotaFromEbrgNameCn;
	}
	public Integer getEotaToEbrgId() {
		return eotaToEbrgId;
	}
	public void setEotaToEbrgId(Integer eotaToEbrgId) {
		this.eotaToEbrgId = eotaToEbrgId;
	}
	public String getEotaToEbrgNameCn() {
		return eotaToEbrgNameCn;
	}
	public void setEotaToEbrgNameCn(String eotaToEbrgNameCn) {
		this.eotaToEbrgNameCn = eotaToEbrgNameCn;
	}
	public Double getEotaWeight() {
		return eotaWeight;
	}
	public void setEotaWeight(Double eotaWeight) {
		this.eotaWeight = eotaWeight;
	}
	public Double getEotaNetWeight() {
		return eotaNetWeight;
	}
	public void setEotaNetWeight(Double eotaNetWeight) {
		this.eotaNetWeight = eotaNetWeight;
	}
	public Double getEotaQuantity() {
		return eotaQuantity;
	}
	public void setEotaQuantity(Double eotaQuantity) {
		this.eotaQuantity = eotaQuantity;
	}
	public Double getEotaVolume() {
		return eotaVolume;
	}
	public void setEotaVolume(Double eotaVolume) {
		this.eotaVolume = eotaVolume;
	}
	public String getEotaDeliveryAddress() {
		return eotaDeliveryAddress;
	}
	public void setEotaDeliveryAddress(String eotaDeliveryAddress) {
		this.eotaDeliveryAddress = eotaDeliveryAddress;
	}
	public String getEotaReceiveAddress() {
		return eotaReceiveAddress;
	}
	public void setEotaReceiveAddress(String eotaReceiveAddress) {
		this.eotaReceiveAddress = eotaReceiveAddress;
	}
	public String getEotaRemark() {
		return eotaRemark;
	}
	public void setEotaRemark(String eotaRemark) {
		this.eotaRemark = eotaRemark;
	}
	public String getEotaLibraryNo() {
		return eotaLibraryNo;
	}
	public void setEotaLibraryNo(String eotaLibraryNo) {
		this.eotaLibraryNo = eotaLibraryNo;
	}
	public Date getEotaLibraryTime() {
		return eotaLibraryTime;
	}
	public void setEotaLibraryTime(Date eotaLibraryTime) {
		this.eotaLibraryTime = eotaLibraryTime;
	}
	public Integer getEotaEbcuId() {
		return eotaEbcuId;
	}
	public void setEotaEbcuId(Integer eotaEbcuId) {
		this.eotaEbcuId = eotaEbcuId;
	}
	public String getEotaEbcuNameCn() {
		return eotaEbcuNameCn;
	}
	public void setEotaEbcuNameCn(String eotaEbcuNameCn) {
		this.eotaEbcuNameCn = eotaEbcuNameCn;
	}
	public Double getEotaLibraryNumber() {
		return eotaLibraryNumber;
	}
	public void setEotaLibraryNumber(Double eotaLibraryNumber) {
		this.eotaLibraryNumber = eotaLibraryNumber;
	}
	public Double getEotaLibraryQuantity() {
		return eotaLibraryQuantity;
	}
	public void setEotaLibraryQuantity(Double eotaLibraryQuantity) {
		this.eotaLibraryQuantity = eotaLibraryQuantity;
	}
	public Double getEotaLibraryVolume() {
		return eotaLibraryVolume;
	}
	public void setEotaLibraryVolume(Double eotaLibraryVolume) {
		this.eotaLibraryVolume = eotaLibraryVolume;
	}
	public Double getEotaLibraryGw() {
		return eotaLibraryGw;
	}
	public void setEotaLibraryGw(Double eotaLibraryGw) {
		this.eotaLibraryGw = eotaLibraryGw;
	}
	public Double getEotaLibraryNw() {
		return eotaLibraryNw;
	}
	public void setEotaLibraryNw(Double eotaLibraryNw) {
		this.eotaLibraryNw = eotaLibraryNw;
	}
	public Integer getEotaBookingEbcuId() {
		return eotaBookingEbcuId;
	}
	public void setEotaBookingEbcuId(Integer eotaBookingEbcuId) {
		this.eotaBookingEbcuId = eotaBookingEbcuId;
	}
	public String getEotaBookingEbcuNameCn() {
		return eotaBookingEbcuNameCn;
	}
	public void setEotaBookingEbcuNameCn(String eotaBookingEbcuNameCn) {
		this.eotaBookingEbcuNameCn = eotaBookingEbcuNameCn;
	}
	public String getEotaBookingNo() {
		return eotaBookingNo;
	}
	public void setEotaBookingNo(String eotaBookingNo) {
		this.eotaBookingNo = eotaBookingNo;
	}
	public String getEotaCustomNo() {
		return eotaCustomNo;
	}
	public void setEotaCustomNo(String eotaCustomNo) {
		this.eotaCustomNo = eotaCustomNo;
	}
	public String getEotaVessel() {
		return eotaVessel;
	}
	public void setEotaVessel(String eotaVessel) {
		this.eotaVessel = eotaVessel;
	}
	public String getEotaVoyage() {
		return eotaVoyage;
	}
	public void setEotaVoyage(String eotaVoyage) {
		this.eotaVoyage = eotaVoyage;
	}
	public Date getEotaDepartureDate() {
		return eotaDepartureDate;
	}
	public void setEotaDepartureDate(Date eotaDepartureDate) {
		this.eotaDepartureDate = eotaDepartureDate;
	}
	public Date getEotaPlanDepartureDate() {
		return eotaPlanDepartureDate;
	}
	public void setEotaPlanDepartureDate(Date eotaPlanDepartureDate) {
		this.eotaPlanDepartureDate = eotaPlanDepartureDate;
	}
	public Date getEotaPlanArrivalDate() {
		return eotaPlanArrivalDate;
	}
	public void setEotaPlanArrivalDate(Date eotaPlanArrivalDate) {
		this.eotaPlanArrivalDate = eotaPlanArrivalDate;
	}
	public Date getEotaArrivalDate() {
		return eotaArrivalDate;
	}
	public void setEotaArrivalDate(Date eotaArrivalDate) {
		this.eotaArrivalDate = eotaArrivalDate;
	}
	public Date getEotaPackingTime() {
		return eotaPackingTime;
	}
	public void setEotaPackingTime(Date eotaPackingTime) {
		this.eotaPackingTime = eotaPackingTime;
	}
	public Date getEotaSetPostTime() {
		return eotaSetPostTime;
	}
	public void setEotaSetPostTime(Date eotaSetPostTime) {
		this.eotaSetPostTime = eotaSetPostTime;
	}
	public Date getEotaWeightTime() {
		return eotaWeightTime;
	}
	public void setEotaWeightTime(Date eotaWeightTime) {
		this.eotaWeightTime = eotaWeightTime;
	}
	public Date getEotaCutTime() {
		return eotaCutTime;
	}
	public void setEotaCutTime(Date eotaCutTime) {
		this.eotaCutTime = eotaCutTime;
	}
	public Integer getEotaStartEbptId() {
		return eotaStartEbptId;
	}
	public void setEotaStartEbptId(Integer eotaStartEbptId) {
		this.eotaStartEbptId = eotaStartEbptId;
	}
	public String getEotaStartEbptNameCn() {
		return eotaStartEbptNameCn;
	}
	public void setEotaStartEbptNameCn(String eotaStartEbptNameCn) {
		this.eotaStartEbptNameCn = eotaStartEbptNameCn;
	}
	public Integer getEotaEndEbptId() {
		return eotaEndEbptId;
	}
	public void setEotaEndEbptId(Integer eotaEndEbptId) {
		this.eotaEndEbptId = eotaEndEbptId;
	}
	public String getEotaEndEbptNameCn() {
		return eotaEndEbptNameCn;
	}
	public void setEotaEndEbptNameCn(String eotaEndEbptNameCn) {
		this.eotaEndEbptNameCn = eotaEndEbptNameCn;
	}
	public String getEotaMblNo() {
		return eotaMblNo;
	}
	public void setEotaMblNo(String eotaMblNo) {
		this.eotaMblNo = eotaMblNo;
	}
	public String getEotaHblNo() {
		return eotaHblNo;
	}
	public void setEotaHblNo(String eotaHblNo) {
		this.eotaHblNo = eotaHblNo;
	}
	public Integer getEotaEtcaId() {
		return eotaEtcaId;
	}
	public void setEotaEtcaId(Integer eotaEtcaId) {
		this.eotaEtcaId = eotaEtcaId;
	}
	public String getEotaEtcaNo() {
		return eotaEtcaNo;
	}
	public void setEotaEtcaNo(String eotaEtcaNo) {
		this.eotaEtcaNo = eotaEtcaNo;
	}
	public String getEotaTitleNo() {
		return eotaTitleNo;
	}
	public void setEotaTitleNo(String eotaTitleNo) {
		this.eotaTitleNo = eotaTitleNo;
	}
	public String getEotaCustomType() {
		return eotaCustomType;
	}
	public void setEotaCustomType(String eotaCustomType) {
		this.eotaCustomType = eotaCustomType;
	}
	public String getEotaFileNo() {
		return eotaFileNo;
	}
	public void setEotaFileNo(String eotaFileNo) {
		this.eotaFileNo = eotaFileNo;
	}
	public String getEotaFileType() {
		return eotaFileType;
	}
	public void setEotaFileType(String eotaFileType) {
		this.eotaFileType = eotaFileType;
	}
	public Date getEotaReleaseTime() {
		return eotaReleaseTime;
	}
	public void setEotaReleaseTime(Date eotaReleaseTime) {
		this.eotaReleaseTime = eotaReleaseTime;
	}
	public Date getEotaSendTime() {
		return eotaSendTime;
	}
	public void setEotaSendTime(Date eotaSendTime) {
		this.eotaSendTime = eotaSendTime;
	}
	public Date getEotaBackTime() {
		return eotaBackTime;
	}
	public void setEotaBackTime(Date eotaBackTime) {
		this.eotaBackTime = eotaBackTime;
	}
	public String getEotaCustomPlace() {
		return eotaCustomPlace;
	}
	public void setEotaCustomPlace(String eotaCustomPlace) {
		this.eotaCustomPlace = eotaCustomPlace;
	}
	public Integer getEotaPortEbcuId() {
		return eotaPortEbcuId;
	}
	public void setEotaPortEbcuId(Integer eotaPortEbcuId) {
		this.eotaPortEbcuId = eotaPortEbcuId;
	}
	public String getEotaPortEbcuNameCn() {
		return eotaPortEbcuNameCn;
	}
	public void setEotaPortEbcuNameCn(String eotaPortEbcuNameCn) {
		this.eotaPortEbcuNameCn = eotaPortEbcuNameCn;
	}
	public String getEotaPortAddress() {
		return eotaPortAddress;
	}
	public void setEotaPortAddress(String eotaPortAddress) {
		this.eotaPortAddress = eotaPortAddress;
	}
	public String getEotaPackingAddress() {
		return eotaPackingAddress;
	}
	public void setEotaPackingAddress(String eotaPackingAddress) {
		this.eotaPackingAddress = eotaPackingAddress;
	}
	public Date getEotaTallyDate() {
		return eotaTallyDate;
	}
	public void setEotaTallyDate(Date eotaTallyDate) {
		this.eotaTallyDate = eotaTallyDate;
	}
	public Date getEotaCutPostDate() {
		return eotaCutPostDate;
	}
	public void setEotaCutPostDate(Date eotaCutPostDate) {
		this.eotaCutPostDate = eotaCutPostDate;
	}
	public Date getEotaSuitcaseTime() {
		return eotaSuitcaseTime;
	}
	public void setEotaSuitcaseTime(Date eotaSuitcaseTime) {
		this.eotaSuitcaseTime = eotaSuitcaseTime;
	}
	public String getEotaSuitcaseAddress() {
		return eotaSuitcaseAddress;
	}
	public void setEotaSuitcaseAddress(String eotaSuitcaseAddress) {
		this.eotaSuitcaseAddress = eotaSuitcaseAddress;
	}
	public Date getEotaInPostDate() {
		return eotaInPostDate;
	}
	public void setEotaInPostDate(Date eotaInPostDate) {
		this.eotaInPostDate = eotaInPostDate;
	}
	public Date getEotaUpShippingDate() {
		return eotaUpShippingDate;
	}
	public void setEotaUpShippingDate(Date eotaUpShippingDate) {
		this.eotaUpShippingDate = eotaUpShippingDate;
	}
	public Date getEotaReqArrival() {
		return eotaReqArrival;
	}
	public void setEotaReqArrival(Date eotaReqArrival) {
		this.eotaReqArrival = eotaReqArrival;
	}
	public Date getEotaActualArrival() {
		return eotaActualArrival;
	}
	public void setEotaActualArrival(Date eotaActualArrival) {
		this.eotaActualArrival = eotaActualArrival;
	}
	public String getEotaContact() {
		return eotaContact;
	}
	public void setEotaContact(String eotaContact) {
		this.eotaContact = eotaContact;
	}
	public String getEotaSentCarInfo() {
		return eotaSentCarInfo;
	}
	public void setEotaSentCarInfo(String eotaSentCarInfo) {
		this.eotaSentCarInfo = eotaSentCarInfo;
	}
	public Date getEotaLeaveTime() {
		return eotaLeaveTime;
	}
	public void setEotaLeaveTime(Date eotaLeaveTime) {
		this.eotaLeaveTime = eotaLeaveTime;
	}
	public String getEotaDepartureRemark() {
		return eotaDepartureRemark;
	}
	public void setEotaDepartureRemark(String eotaDepartureRemark) {
		this.eotaDepartureRemark = eotaDepartureRemark;
	}
	public String getEotaPackaging() {
		return eotaPackaging;
	}
	public void setEotaPackaging(String eotaPackaging) {
		this.eotaPackaging = eotaPackaging;
	}
	public Date getEotaPreentryDate() {
		return eotaPreentryDate;
	}
	public void setEotaPreentryDate(Date eotaPreentryDate) {
		this.eotaPreentryDate = eotaPreentryDate;
	}
	public Date getEotaPortTime() {
		return eotaPortTime;
	}
	public void setEotaPortTime(Date eotaPortTime) {
		this.eotaPortTime = eotaPortTime;
	}
	public Date getEotaCheckDate() {
		return eotaCheckDate;
	}
	public void setEotaCheckDate(Date eotaCheckDate) {
		this.eotaCheckDate = eotaCheckDate;
	}
	public String getEotaIsSewageTank() {
		return eotaIsSewageTank;
	}
	public void setEotaIsSewageTank(String eotaIsSewageTank) {
		this.eotaIsSewageTank = eotaIsSewageTank;
	}
	public String getEotaPerformDesc() {
		return eotaPerformDesc;
	}
	public void setEotaPerformDesc(String eotaPerformDesc) {
		this.eotaPerformDesc = eotaPerformDesc;
	}
	public String getEotaModifier() {
		return eotaModifier;
	}
	public void setEotaModifier(String eotaModifier) {
		this.eotaModifier = eotaModifier;
	}
	public Date getEotaModifyTime() {
		return eotaModifyTime;
	}
	public void setEotaModifyTime(Date eotaModifyTime) {
		this.eotaModifyTime = eotaModifyTime;
	}
	public String getEotaCreator() {
		return eotaCreator;
	}
	public void setEotaCreator(String eotaCreator) {
		this.eotaCreator = eotaCreator;
	}
	public Date getEotaCreateTime() {
		return eotaCreateTime;
	}
	public void setEotaCreateTime(Date eotaCreateTime) {
		this.eotaCreateTime = eotaCreateTime;
	}
	public String getEotaPackageRemark() {
		return eotaPackageRemark;
	}
	public void setEotaPackageRemark(String eotaPackageRemark) {
		this.eotaPackageRemark = eotaPackageRemark;
	}
	public Date getEotaInspecteDate() {
		return eotaInspecteDate;
	}
	public void setEotaInspecteDate(Date eotaInspecteDate) {
		this.eotaInspecteDate = eotaInspecteDate;
	}
	public String getEotaCheckDesc() {
		return eotaCheckDesc;
	}
	public void setEotaCheckDesc(String eotaCheckDesc) {
		this.eotaCheckDesc = eotaCheckDesc;
	}
	public String getEotaInOut() {
		return eotaInOut;
	}
	public void setEotaInOut(String eotaInOut) {
		this.eotaInOut = eotaInOut;
	}
	public String getEotaReturnTankAddress() {
		return eotaReturnTankAddress;
	}
	public void setEotaReturnTankAddress(String eotaReturnTankAddress) {
		this.eotaReturnTankAddress = eotaReturnTankAddress;
	}
	public Date getEotaBackTankTime() {
		return eotaBackTankTime;
	}
	public void setEotaBackTankTime(Date eotaBackTankTime) {
		this.eotaBackTankTime = eotaBackTankTime;
	}
	public Date getEotaPlanDeliveryDate() {
		return eotaPlanDeliveryDate;
	}
	public void setEotaPlanDeliveryDate(Date eotaPlanDeliveryDate) {
		this.eotaPlanDeliveryDate = eotaPlanDeliveryDate;
	}
	public String getEotaIsDropTank() {
		return eotaIsDropTank;
	}
	public void setEotaIsDropTank(String eotaIsDropTank) {
		this.eotaIsDropTank = eotaIsDropTank;
	}
	public Date getEotaCollectDate() {
		return eotaCollectDate;
	}
	public void setEotaCollectDate(Date eotaCollectDate) {
		this.eotaCollectDate = eotaCollectDate;
	}
	public Date getEotaCustomStartDate() {
		return eotaCustomStartDate;
	}
	public void setEotaCustomStartDate(Date eotaCustomStartDate) {
		this.eotaCustomStartDate = eotaCustomStartDate;
	}
	public Date getEotaChangeDate() {
		return eotaChangeDate;
	}
	public void setEotaChangeDate(Date eotaChangeDate) {
		this.eotaChangeDate = eotaChangeDate;
	}
	public Date getEotaObtainDate() {
		return eotaObtainDate;
	}
	public void setEotaObtainDate(Date eotaObtainDate) {
		this.eotaObtainDate = eotaObtainDate;
	}
	public Date getEotaInParkTime() {
		return eotaInParkTime;
	}
	public void setEotaInParkTime(Date eotaInParkTime) {
		this.eotaInParkTime = eotaInParkTime;
	}
	public Date getEotaOutParkTime() {
		return eotaOutParkTime;
	}
	public void setEotaOutParkTime(Date eotaOutParkTime) {
		this.eotaOutParkTime = eotaOutParkTime;
	}
	public String getEotaIsPortPlan() {
		return eotaIsPortPlan;
	}
	public void setEotaIsPortPlan(String eotaIsPortPlan) {
		this.eotaIsPortPlan = eotaIsPortPlan;
	}
	public Date getEotaCustomEndDate() {
		return eotaCustomEndDate;
	}
	public void setEotaCustomEndDate(Date eotaCustomEndDate) {
		this.eotaCustomEndDate = eotaCustomEndDate;
	}
	public Date getEotaInWarehouseDate() {
		return eotaInWarehouseDate;
	}
	public void setEotaInWarehouseDate(Date eotaInWarehouseDate) {
		this.eotaInWarehouseDate = eotaInWarehouseDate;
	}
	public Date getEotaFinishedDate() {
		return eotaFinishedDate;
	}
	public void setEotaFinishedDate(Date eotaFinishedDate) {
		this.eotaFinishedDate = eotaFinishedDate;
	}
	public Date getEotaPayTaxDate() {
		return eotaPayTaxDate;
	}
	public void setEotaPayTaxDate(Date eotaPayTaxDate) {
		this.eotaPayTaxDate = eotaPayTaxDate;
	}
	public String getEotaTrain() {
		return eotaTrain;
	}
	public void setEotaTrain(String eotaTrain) {
		this.eotaTrain = eotaTrain;
	}
	public Date getEotaStopStationTime() {
		return eotaStopStationTime;
	}
	public void setEotaStopStationTime(Date eotaStopStationTime) {
		this.eotaStopStationTime = eotaStopStationTime;
	}
	public Date getEotaStationTime() {
		return eotaStationTime;
	}
	public void setEotaStationTime(Date eotaStationTime) {
		this.eotaStationTime = eotaStationTime;
	}
	public Date getEotaRailwayTime() {
		return eotaRailwayTime;
	}
	public void setEotaRailwayTime(Date eotaRailwayTime) {
		this.eotaRailwayTime = eotaRailwayTime;
	}
	public Date getEotaReturnDate() {
		return eotaReturnDate;
	}
	public void setEotaReturnDate(Date eotaReturnDate) {
		this.eotaReturnDate = eotaReturnDate;
	}
	public Integer getEotaTeamEbcuId() {
		return eotaTeamEbcuId;
	}
	public void setEotaTeamEbcuId(Integer eotaTeamEbcuId) {
		this.eotaTeamEbcuId = eotaTeamEbcuId;
	}
	public String getEotaTeamEbcuNameCn() {
		return eotaTeamEbcuNameCn;
	}
	public void setEotaTeamEbcuNameCn(String eotaTeamEbcuNameCn) {
		this.eotaTeamEbcuNameCn = eotaTeamEbcuNameCn;
	}
	public Integer getEotaTerminalEbcuId() {
		return eotaTerminalEbcuId;
	}
	public void setEotaTerminalEbcuId(Integer eotaTerminalEbcuId) {
		this.eotaTerminalEbcuId = eotaTerminalEbcuId;
	}
	public String getEotaTerminalEbcuNameCn() {
		return eotaTerminalEbcuNameCn;
	}
	public void setEotaTerminalEbcuNameCn(String eotaTerminalEbcuNameCn) {
		this.eotaTerminalEbcuNameCn = eotaTerminalEbcuNameCn;
	}
	public String getEotaSuitcase() {
		return eotaSuitcase;
	}
	public void setEotaSuitcase(String eotaSuitcase) {
		this.eotaSuitcase = eotaSuitcase;
	}
	public String getEotaCrates() {
		return eotaCrates;
	}
	public void setEotaCrates(String eotaCrates) {
		this.eotaCrates = eotaCrates;
	}
	public Integer getEotaMainEttpId() {
		return eotaMainEttpId;
	}
	public void setEotaMainEttpId(Integer eotaMainEttpId) {
		this.eotaMainEttpId = eotaMainEttpId;
	}
	public String getEotaTrailerEtveCard() {
		return eotaTrailerEtveCard;
	}
	public void setEotaTrailerEtveCard(String eotaTrailerEtveCard) {
		this.eotaTrailerEtveCard = eotaTrailerEtveCard;
	}
	public Integer getEotaTrailerEtveId() {
		return eotaTrailerEtveId;
	}
	public void setEotaTrailerEtveId(Integer eotaTrailerEtveId) {
		this.eotaTrailerEtveId = eotaTrailerEtveId;
	}
	public String getEotaTractorEtveCard() {
		return eotaTractorEtveCard;
	}
	public void setEotaTractorEtveCard(String eotaTractorEtveCard) {
		this.eotaTractorEtveCard = eotaTractorEtveCard;
	}
	public Integer getEotaTractorEtveId() {
		return eotaTractorEtveId;
	}
	public void setEotaTractorEtveId(Integer eotaTractorEtveId) {
		this.eotaTractorEtveId = eotaTractorEtveId;
	}
	public String getEotaMainEttpName() {
		return eotaMainEttpName;
	}
	public void setEotaMainEttpName(String eotaMainEttpName) {
		this.eotaMainEttpName = eotaMainEttpName;
	}
	public Integer getEotaCopilorEttpId() {
		return eotaCopilorEttpId;
	}
	public void setEotaCopilorEttpId(Integer eotaCopilorEttpId) {
		this.eotaCopilorEttpId = eotaCopilorEttpId;
	}
	public String getEotaCopilorEttpName() {
		return eotaCopilorEttpName;
	}
	public void setEotaCopilorEttpName(String eotaCopilorEttpName) {
		this.eotaCopilorEttpName = eotaCopilorEttpName;
	}
	public Integer getEotaLandEtcaId() {
		return eotaLandEtcaId;
	}
	public void setEotaLandEtcaId(Integer eotaLandEtcaId) {
		this.eotaLandEtcaId = eotaLandEtcaId;
	}
	public String getEotaLandEtcaNo() {
		return eotaLandEtcaNo;
	}
	public void setEotaLandEtcaNo(String eotaLandEtcaNo) {
		this.eotaLandEtcaNo = eotaLandEtcaNo;
	}
	public String getEotaLandTitleNo() {
		return eotaLandTitleNo;
	}
	public void setEotaLandTitleNo(String eotaLandTitleNo) {
		this.eotaLandTitleNo = eotaLandTitleNo;
	}
	public String getEotaEttpTel() {
		return eotaEttpTel;
	}
	public void setEotaEttpTel(String eotaEttpTel) {
		this.eotaEttpTel = eotaEttpTel;
	}
	public String getEotaCarrierEbcuId() {
		return eotaCarrierEbcuId;
	}
	public void setEotaCarrierEbcuId(String eotaCarrierEbcuId) {
		this.eotaCarrierEbcuId = eotaCarrierEbcuId;
	}
	public String getEotaCarrierEbcuNameCn() {
		return eotaCarrierEbcuNameCn;
	}
	public void setEotaCarrierEbcuNameCn(String eotaCarrierEbcuNameCn) {
		this.eotaCarrierEbcuNameCn = eotaCarrierEbcuNameCn;
	}
	public String getEotaEblnId() {
		return eotaEblnId;
	}
	public void setEotaEblnId(String eotaEblnId) {
		this.eotaEblnId = eotaEblnId;
	}
	public String getEotaEblnLineName() {
		return eotaEblnLineName;
	}
	public void setEotaEblnLineName(String eotaEblnLineName) {
		this.eotaEblnLineName = eotaEblnLineName;
	}
	public String getEotaIsWithin() {
		return eotaIsWithin;
	}
	public void setEotaIsWithin(String eotaIsWithin) {
		this.eotaIsWithin = eotaIsWithin;
	}
	public String getEotaRateMileage() {
		return eotaRateMileage;
	}
	public void setEotaRateMileage(String eotaRateMileage) {
		this.eotaRateMileage = eotaRateMileage;
	}
	public Double getEotaSubnum1() {
		return eotaSubnum1;
	}
	public void setEotaSubnum1(Double eotaSubnum1) {
		this.eotaSubnum1 = eotaSubnum1;
	}
	public String getEotaSubstr1() {
		return eotaSubstr1;
	}
	public void setEotaSubstr1(String eotaSubstr1) {
		this.eotaSubstr1 = eotaSubstr1;
	}
	public String getEotaSubstr2() {
		return eotaSubstr2;
	}
	public void setEotaSubstr2(String eotaSubstr2) {
		this.eotaSubstr2 = eotaSubstr2;
	}
	public String getEotaSubstr3() {
		return eotaSubstr3;
	}
	public void setEotaSubstr3(String eotaSubstr3) {
		this.eotaSubstr3 = eotaSubstr3;
	}
	public String getEotaSubstr4() {
		return eotaSubstr4;
	}
	public void setEotaSubstr4(String eotaSubstr4) {
		this.eotaSubstr4 = eotaSubstr4;
	}
	public String getEotaSubstr5() {
		return eotaSubstr5;
	}
	public void setEotaSubstr5(String eotaSubstr5) {
		this.eotaSubstr5 = eotaSubstr5;
	}
	public String getEotaSubstr6() {
		return eotaSubstr6;
	}
	public void setEotaSubstr6(String eotaSubstr6) {
		this.eotaSubstr6 = eotaSubstr6;
	}
	public String getEotaSubstr8() {
		return eotaSubstr8;
	}
	public void setEotaSubstr8(String eotaSubstr8) {
		this.eotaSubstr8 = eotaSubstr8;
	}
	public String getEotaSubstr7() {
		return eotaSubstr7;
	}
	public void setEotaSubstr7(String eotaSubstr7) {
		this.eotaSubstr7 = eotaSubstr7;
	}
	public Date getEotaSubdate1() {
		return eotaSubdate1;
	}
	public void setEotaSubdate1(Date eotaSubdate1) {
		this.eotaSubdate1 = eotaSubdate1;
	}
	public Date getEotaSubdate2() {
		return eotaSubdate2;
	}
	public void setEotaSubdate2(Date eotaSubdate2) {
		this.eotaSubdate2 = eotaSubdate2;
	}
	public Date getEotaSubdate5() {
		return eotaSubdate5;
	}
	public void setEotaSubdate5(Date eotaSubdate5) {
		this.eotaSubdate5 = eotaSubdate5;
	}
	public Date getEotaSubdate4() {
		return eotaSubdate4;
	}
	public void setEotaSubdate4(Date eotaSubdate4) {
		this.eotaSubdate4 = eotaSubdate4;
	}
	public Date getEotaSubdate3() {
		return eotaSubdate3;
	}
	public void setEotaSubdate3(Date eotaSubdate3) {
		this.eotaSubdate3 = eotaSubdate3;
	}
	public Double getEotaSubnum3() {
		return eotaSubnum3;
	}
	public void setEotaSubnum3(Double eotaSubnum3) {
		this.eotaSubnum3 = eotaSubnum3;
	}
	public Double getEotaSubnum2() {
		return eotaSubnum2;
	}
	public void setEotaSubnum2(Double eotaSubnum2) {
		this.eotaSubnum2 = eotaSubnum2;
	}
	public Integer getEottId() {
		return eottId;
	}
	public void setEottId(Integer eottId) {
		this.eottId = eottId;
	}
	public Integer getEottEotaId() {
		return eottEotaId;
	}
	public void setEottEotaId(Integer eottEotaId) {
		this.eottEotaId = eottEotaId;
	}
	public Integer getEottEscoId() {
		return eottEscoId;
	}
	public void setEottEscoId(Integer eottEscoId) {
		this.eottEscoId = eottEscoId;
	}
	public Integer getEottEoorId() {
		return eottEoorId;
	}
	public void setEottEoorId(Integer eottEoorId) {
		this.eottEoorId = eottEoorId;
	}
	public Integer getEottEtspId() {
		return eottEtspId;
	}
	public void setEottEtspId(Integer eottEtspId) {
		this.eottEtspId = eottEtspId;
	}
	public Date getEottLoadTime() {
		return eottLoadTime;
	}
	public void setEottLoadTime(Date eottLoadTime) {
		this.eottLoadTime = eottLoadTime;
	}
	public Date getEottPlanDeliveryTime() {
		return eottPlanDeliveryTime;
	}
	public void setEottPlanDeliveryTime(Date eottPlanDeliveryTime) {
		this.eottPlanDeliveryTime = eottPlanDeliveryTime;
	}
	public Date getEottDeliveryTime() {
		return eottDeliveryTime;
	}
	public void setEottDeliveryTime(Date eottDeliveryTime) {
		this.eottDeliveryTime = eottDeliveryTime;
	}
	public Date getEottPlanArrivalTime() {
		return eottPlanArrivalTime;
	}
	public void setEottPlanArrivalTime(Date eottPlanArrivalTime) {
		this.eottPlanArrivalTime = eottPlanArrivalTime;
	}
	public Date getEottToLibraryTime() {
		return eottToLibraryTime;
	}
	public void setEottToLibraryTime(Date eottToLibraryTime) {
		this.eottToLibraryTime = eottToLibraryTime;
	}
	public Date getEottLoadedTime() {
		return eottLoadedTime;
	}
	public void setEottLoadedTime(Date eottLoadedTime) {
		this.eottLoadedTime = eottLoadedTime;
	}
	public Date getEottFromLibraryTime() {
		return eottFromLibraryTime;
	}
	public void setEottFromLibraryTime(Date eottFromLibraryTime) {
		this.eottFromLibraryTime = eottFromLibraryTime;
	}
	public Date getEottArrivalTime() {
		return eottArrivalTime;
	}
	public void setEottArrivalTime(Date eottArrivalTime) {
		this.eottArrivalTime = eottArrivalTime;
	}
	public Date getEottPlanDischargeTime() {
		return eottPlanDischargeTime;
	}
	public void setEottPlanDischargeTime(Date eottPlanDischargeTime) {
		this.eottPlanDischargeTime = eottPlanDischargeTime;
	}
	public Date getEottDischargeTime() {
		return eottDischargeTime;
	}
	public void setEottDischargeTime(Date eottDischargeTime) {
		this.eottDischargeTime = eottDischargeTime;
	}
	public String getEottIsSign() {
		return eottIsSign;
	}
	public void setEottIsSign(String eottIsSign) {
		this.eottIsSign = eottIsSign;
	}
	public Date getEottToSekibaTime() {
		return eottToSekibaTime;
	}
	public void setEottToSekibaTime(Date eottToSekibaTime) {
		this.eottToSekibaTime = eottToSekibaTime;
	}
	public Date getEottFromSekibaTime() {
		return eottFromSekibaTime;
	}
	public void setEottFromSekibaTime(Date eottFromSekibaTime) {
		this.eottFromSekibaTime = eottFromSekibaTime;
	}
	public Date getEottLoadingTime() {
		return eottLoadingTime;
	}
	public void setEottLoadingTime(Date eottLoadingTime) {
		this.eottLoadingTime = eottLoadingTime;
	}
	public String getEottIsTilt() {
		return eottIsTilt;
	}
	public void setEottIsTilt(String eottIsTilt) {
		this.eottIsTilt = eottIsTilt;
	}
	public String getEottIsInventory() {
		return eottIsInventory;
	}
	public void setEottIsInventory(String eottIsInventory) {
		this.eottIsInventory = eottIsInventory;
	}
	public String getEottIsCustomer() {
		return eottIsCustomer;
	}
	public void setEottIsCustomer(String eottIsCustomer) {
		this.eottIsCustomer = eottIsCustomer;
	}
	public String getEottIsKeep() {
		return eottIsKeep;
	}
	public void setEottIsKeep(String eottIsKeep) {
		this.eottIsKeep = eottIsKeep;
	}
	public String getEottDeliveryNo() {
		return eottDeliveryNo;
	}
	public void setEottDeliveryNo(String eottDeliveryNo) {
		this.eottDeliveryNo = eottDeliveryNo;
	}
	public Double getEottLoadEmptyWeight() {
		return eottLoadEmptyWeight;
	}
	public void setEottLoadEmptyWeight(Double eottLoadEmptyWeight) {
		this.eottLoadEmptyWeight = eottLoadEmptyWeight;
	}
	public Double getEottLoadHeavyWeight() {
		return eottLoadHeavyWeight;
	}
	public void setEottLoadHeavyWeight(Double eottLoadHeavyWeight) {
		this.eottLoadHeavyWeight = eottLoadHeavyWeight;
	}
	public Double getEottLoadingQuantity() {
		return eottLoadingQuantity;
	}
	public void setEottLoadingQuantity(Double eottLoadingQuantity) {
		this.eottLoadingQuantity = eottLoadingQuantity;
	}
	public Double getEottUnloadHeavyWeight() {
		return eottUnloadHeavyWeight;
	}
	public void setEottUnloadHeavyWeight(Double eottUnloadHeavyWeight) {
		this.eottUnloadHeavyWeight = eottUnloadHeavyWeight;
	}
	public Double getEottUnloadEmptyWeight() {
		return eottUnloadEmptyWeight;
	}
	public void setEottUnloadEmptyWeight(Double eottUnloadEmptyWeight) {
		this.eottUnloadEmptyWeight = eottUnloadEmptyWeight;
	}
	public Double getEottUnloadingQuantity() {
		return eottUnloadingQuantity;
	}
	public void setEottUnloadingQuantity(Double eottUnloadingQuantity) {
		this.eottUnloadingQuantity = eottUnloadingQuantity;
	}
	public Double getEottDifference() {
		return eottDifference;
	}
	public void setEottDifference(Double eottDifference) {
		this.eottDifference = eottDifference;
	}
	public String getEottReceiveNo() {
		return eottReceiveNo;
	}
	public void setEottReceiveNo(String eottReceiveNo) {
		this.eottReceiveNo = eottReceiveNo;
	}
	public String getEottThirdPound() {
		return eottThirdPound;
	}
	public void setEottThirdPound(String eottThirdPound) {
		this.eottThirdPound = eottThirdPound;
	}
	public Double getEottThirdHeavyWeight() {
		return eottThirdHeavyWeight;
	}
	public void setEottThirdHeavyWeight(Double eottThirdHeavyWeight) {
		this.eottThirdHeavyWeight = eottThirdHeavyWeight;
	}
	public Double getEottThirdEmptyWeight() {
		return eottThirdEmptyWeight;
	}
	public void setEottThirdEmptyWeight(Double eottThirdEmptyWeight) {
		this.eottThirdEmptyWeight = eottThirdEmptyWeight;
	}
	public Double getEottThirdDiff() {
		return eottThirdDiff;
	}
	public void setEottThirdDiff(Double eottThirdDiff) {
		this.eottThirdDiff = eottThirdDiff;
	}
	public Date getEottBuyVoucherTime() {
		return eottBuyVoucherTime;
	}
	public void setEottBuyVoucherTime(Date eottBuyVoucherTime) {
		this.eottBuyVoucherTime = eottBuyVoucherTime;
	}
	public Date getEottInspecteTime() {
		return eottInspecteTime;
	}
	public void setEottInspecteTime(Date eottInspecteTime) {
		this.eottInspecteTime = eottInspecteTime;
	}
	public Date getEottThroughTime() {
		return eottThroughTime;
	}
	public void setEottThroughTime(Date eottThroughTime) {
		this.eottThroughTime = eottThroughTime;
	}
	public Date getEottApplyPassTime() {
		return eottApplyPassTime;
	}
	public void setEottApplyPassTime(Date eottApplyPassTime) {
		this.eottApplyPassTime = eottApplyPassTime;
	}
	public Date getEottGetPassTime() {
		return eottGetPassTime;
	}
	public void setEottGetPassTime(Date eottGetPassTime) {
		this.eottGetPassTime = eottGetPassTime;
	}
	public Date getEottApproveTarnTime() {
		return eottApproveTarnTime;
	}
	public void setEottApproveTarnTime(Date eottApproveTarnTime) {
		this.eottApproveTarnTime = eottApproveTarnTime;
	}
	public Date getEottToChargeSheetTime() {
		return eottToChargeSheetTime;
	}
	public void setEottToChargeSheetTime(Date eottToChargeSheetTime) {
		this.eottToChargeSheetTime = eottToChargeSheetTime;
	}
	public Date getEottFromChargeSheetTime() {
		return eottFromChargeSheetTime;
	}
	public void setEottFromChargeSheetTime(Date eottFromChargeSheetTime) {
		this.eottFromChargeSheetTime = eottFromChargeSheetTime;
	}
	public Date getEottToGuardTime() {
		return eottToGuardTime;
	}
	public void setEottToGuardTime(Date eottToGuardTime) {
		this.eottToGuardTime = eottToGuardTime;
	}
	public Date getEottFromGuardTime() {
		return eottFromGuardTime;
	}
	public void setEottFromGuardTime(Date eottFromGuardTime) {
		this.eottFromGuardTime = eottFromGuardTime;
	}
	public String getEottIsTransfer() {
		return eottIsTransfer;
	}
	public void setEottIsTransfer(String eottIsTransfer) {
		this.eottIsTransfer = eottIsTransfer;
	}
	public String getEottSubstr1() {
		return eottSubstr1;
	}
	public void setEottSubstr1(String eottSubstr1) {
		this.eottSubstr1 = eottSubstr1;
	}
	public String getEottSubstr2() {
		return eottSubstr2;
	}
	public void setEottSubstr2(String eottSubstr2) {
		this.eottSubstr2 = eottSubstr2;
	}
	public String getEottSubstr3() {
		return eottSubstr3;
	}
	public void setEottSubstr3(String eottSubstr3) {
		this.eottSubstr3 = eottSubstr3;
	}
	public String getEottSubstr4() {
		return eottSubstr4;
	}
	public void setEottSubstr4(String eottSubstr4) {
		this.eottSubstr4 = eottSubstr4;
	}
	public String getEottSubstr5() {
		return eottSubstr5;
	}
	public void setEottSubstr5(String eottSubstr5) {
		this.eottSubstr5 = eottSubstr5;
	}
	public String getEottSubstr6() {
		return eottSubstr6;
	}
	public void setEottSubstr6(String eottSubstr6) {
		this.eottSubstr6 = eottSubstr6;
	}
	public String getEottSubstr8() {
		return eottSubstr8;
	}
	public void setEottSubstr8(String eottSubstr8) {
		this.eottSubstr8 = eottSubstr8;
	}
	public String getEottSubstr7() {
		return eottSubstr7;
	}
	public void setEottSubstr7(String eottSubstr7) {
		this.eottSubstr7 = eottSubstr7;
	}
	public Date getEottSubdate1() {
		return eottSubdate1;
	}
	public void setEottSubdate1(Date eottSubdate1) {
		this.eottSubdate1 = eottSubdate1;
	}
	public Date getEottSubdate2() {
		return eottSubdate2;
	}
	public void setEottSubdate2(Date eottSubdate2) {
		this.eottSubdate2 = eottSubdate2;
	}
	public Date getEottSubdate5() {
		return eottSubdate5;
	}
	public void setEottSubdate5(Date eottSubdate5) {
		this.eottSubdate5 = eottSubdate5;
	}
	public Date getEottSubdate4() {
		return eottSubdate4;
	}
	public void setEottSubdate4(Date eottSubdate4) {
		this.eottSubdate4 = eottSubdate4;
	}
	public Date getEottSubdate3() {
		return eottSubdate3;
	}
	public void setEottSubdate3(Date eottSubdate3) {
		this.eottSubdate3 = eottSubdate3;
	}
	public Double getEottSubnum3() {
		return eottSubnum3;
	}
	public void setEottSubnum3(Double eottSubnum3) {
		this.eottSubnum3 = eottSubnum3;
	}
	public Double getEottSubnum2() {
		return eottSubnum2;
	}
	public void setEottSubnum2(Double eottSubnum2) {
		this.eottSubnum2 = eottSubnum2;
	}
	public Double getEottSubnum1() {
		return eottSubnum1;
	}
	public void setEottSubnum1(Double eottSubnum1) {
		this.eottSubnum1 = eottSubnum1;
	}
	public Integer getRecVer() {
		return recVer;
	}
	public void setRecVer(Integer recVer) {
		this.recVer = recVer;
	}
	public Date getModifyTime() {
		return modifyTime;
	}
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
	}
	public String getModifier() {
		return modifier;
	}
	public void setModifier(String modifier) {
		this.modifier = modifier;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreator() {
		return creator;
	}
	public void setCreator(String creator) {
		this.creator = creator;
	}
	public Integer getEottDeliveryEtveId() {
		return eottDeliveryEtveId;
	}
	public void setEottDeliveryEtveId(Integer eottDeliveryEtveId) {
		this.eottDeliveryEtveId = eottDeliveryEtveId;
	}
	public String getEottDeliveryEtveCard() {
		return eottDeliveryEtveCard;
	}
	public void setEottDeliveryEtveCard(String eottDeliveryEtveCard) {
		this.eottDeliveryEtveCard = eottDeliveryEtveCard;
	}
	public String getEottReceiveEbcuNameCn() {
		return eottReceiveEbcuNameCn;
	}
	public void setEottReceiveEbcuNameCn(String eottReceiveEbcuNameCn) {
		this.eottReceiveEbcuNameCn = eottReceiveEbcuNameCn;
	}
	public Integer getEottReceiveEbcuId() {
		return eottReceiveEbcuId;
	}
	public void setEottReceiveEbcuId(Integer eottReceiveEbcuId) {
		this.eottReceiveEbcuId = eottReceiveEbcuId;
	}
	public Integer getEottReceiveEtveId() {
		return eottReceiveEtveId;
	}
	public void setEottReceiveEtveId(Integer eottReceiveEtveId) {
		this.eottReceiveEtveId = eottReceiveEtveId;
	}
	public String getEottReceiveEtveCard() {
		return eottReceiveEtveCard;
	}
	public void setEottReceiveEtveCard(String eottReceiveEtveCard) {
		this.eottReceiveEtveCard = eottReceiveEtveCard;
	}
	public String getEoorEbpjName() {
		return eoorEbpjName;
	}
	public void setEoorEbpjName(String eoorEbpjName) {
		this.eoorEbpjName = eoorEbpjName;
	}
	public Integer getEtspId() {
		return etspId;
	}
	public void setEtspId(Integer etspId) {
		this.etspId = etspId;
	}
	public String getEtspStatus() {
		return etspStatus;
	}
	public void setEtspStatus(String etspStatus) {
		this.etspStatus = etspStatus;
	}
	public String getEotaTransportNo() {
		return eotaTransportNo;
	}
	public void setEotaTransportNo(String eotaTransportNo) {
		this.eotaTransportNo = eotaTransportNo;
	}
	public Date getEoorReqDeliveryDate() {
		return eoorReqDeliveryDate;
	}
	public void setEoorReqDeliveryDate(Date eoorReqDeliveryDate) {
		this.eoorReqDeliveryDate = eoorReqDeliveryDate;
	}
	public Date getEoorReqArrivalDate() {
		return eoorReqArrivalDate;
	}
	public void setEoorReqArrivalDate(Date eoorReqArrivalDate) {
		this.eoorReqArrivalDate = eoorReqArrivalDate;
	}
	public String getEottRemark() {
		return eottRemark;
	}
	public void setEottRemark(String eottRemark) {
		this.eottRemark = eottRemark;
	}
	public Integer getEotaEoocId() {
		return eotaEoocId;
	}
	public void setEotaEoocId(Integer eotaEoocId) {
		this.eotaEoocId = eotaEoocId;
	}
	public Double getEottThirdPoundWeight() {
		return eottThirdPoundWeight;
	}
	public void setEottThirdPoundWeight(Double eottThirdPoundWeight) {
		this.eottThirdPoundWeight = eottThirdPoundWeight;
	}
	public String getEottLoadPerson() {
		return eottLoadPerson;
	}
	public void setEottLoadPerson(String eottLoadPerson) {
		this.eottLoadPerson = eottLoadPerson;
	}
	public String getEottUnloadPerson() {
		return eottUnloadPerson;
	}
	public void setEottUnloadPerson(String eottUnloadPerson) {
		this.eottUnloadPerson = eottUnloadPerson;
	}
	public String getEottThirdPerson() {
		return eottThirdPerson;
	}
	public void setEottThirdPerson(String eottThirdPerson) {
		this.eottThirdPerson = eottThirdPerson;
	}
	public Date getEottLoadDate() {
		return eottLoadDate;
	}
	public void setEottLoadDate(Date eottLoadDate) {
		this.eottLoadDate = eottLoadDate;
	}
	public Date getEottUnloadDate() {
		return eottUnloadDate;
	}
	public void setEottUnloadDate(Date eottUnloadDate) {
		this.eottUnloadDate = eottUnloadDate;
	}
	public Date getEottThirdDate() {
		return eottThirdDate;
	}
	public void setEottThirdDate(Date eottThirdDate) {
		this.eottThirdDate = eottThirdDate;
	}
	public String getEottLoadTemperature() {
		return eottLoadTemperature;
	}
	public void setEottLoadTemperature(String eottLoadTemperature) {
		this.eottLoadTemperature = eottLoadTemperature;
	}
	public String getEottUnloadTemperature() {
		return eottUnloadTemperature;
	}
	public void setEottUnloadTemperature(String eottUnloadTemperature) {
		this.eottUnloadTemperature = eottUnloadTemperature;
	}
	public String getEottThirdTemperature() {
		return eottThirdTemperature;
	}
	public void setEottThirdTemperature(String eottThirdTemperature) {
		this.eottThirdTemperature = eottThirdTemperature;
	}
	public String getEottReceipient() {
		return eottReceipient;
	}
	public void setEottReceipient(String eottReceipient) {
		this.eottReceipient = eottReceipient;
	}
	public String getEottDelaySupplychainid() {
		return eottDelaySupplychainid;
	}
	public void setEottDelaySupplychainid(String eottDelaySupplychainid) {
		this.eottDelaySupplychainid = eottDelaySupplychainid;
	}
	public String getEottDelayCategory() {
		return eottDelayCategory;
	}
	public void setEottDelayCategory(String eottDelayCategory) {
		this.eottDelayCategory = eottDelayCategory;
	}
	public String getEottDelayAccountability() {
		return eottDelayAccountability;
	}
	public void setEottDelayAccountability(String eottDelayAccountability) {
		this.eottDelayAccountability = eottDelayAccountability;
	}
	public String getEottDelayCause() {
		return eottDelayCause;
	}
	public void setEottDelayCause(String eottDelayCause) {
		this.eottDelayCause = eottDelayCause;
	}
	public String getEottDelayRemark() {
		return eottDelayRemark;
	}
	public void setEottDelayRemark(String eottDelayRemark) {
		this.eottDelayRemark = eottDelayRemark;
	}
	public String getEbpjFCode() {
		return ebpjFCode;
	}
	public void setEbpjFCode(String ebpjFCode) {
		this.ebpjFCode = ebpjFCode;
	}
	
	
}
