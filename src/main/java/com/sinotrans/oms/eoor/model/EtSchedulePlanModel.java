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
@Table(name = "ET_SCHEDULE_PLAN")
public class EtSchedulePlanModel extends BaseModel implements OperationLog {

	//调度计划主键
	private Integer etspId;
	//调度编号
	private String etspNo;
	//上级调度
	private Integer etspSelfId;
	//调度员
	private String etspDutySchedule;
	//提箱地
	private String etspSuitcase;
	//还箱地
	private String etspCrates;
	//主驾驶ID
	private Integer etspMainEttpId;
	//挂车车牌号
	private String etspTrailerEtveCard;
	//挂车ID
	private Integer etspTrailerEtveId;
	//牵引车车牌号
	private String etspTractorEtveCard;
	//牵引车ID
	private Integer etspTractorEtveId;
	//主驾驶
	private String etspMainEttpName;
	//副驾驶ID
	private Integer etspCopilorEttpId;
	//副驾驶
	private String etspCopilorEttpName;
	//集装箱ID1
	private Integer etspEtcaId1;
	//集装箱号1
	private String etspEtcaNo;
	//封号1
	private String etspTitleNo1;
	//集装箱ID2
	private Integer etspEtcaId2;
	//集装箱号2
	private String etspEtcaNo2;
	//封号2
	private String etspTitleNo2;
	//额定百公里油耗
	private Double etspRateFuel100;
	//额定油耗
	private Double etspRateFuel;
	//实际油耗
	private Double etspActualFuel;
	//额定公里数
	private Double etspRateMileage;
	//实际公里数
	private Double etspActualMileage;
	//里程计算状态
	private String etspMileageStatus;
	//主驾提成
	private Double etspMainCommission;
	//副驾提成
	private Double etspCopilorCommission;
	//押运员提成
	private Double etspGuardCommission;
	//提成合计
	private Double etspTatolCommission;
	//分供方ID
	private Integer etspEbcuId;
	//供方名称
	private String etspEbcuNameCn;
	//甩挂地点
	private String etspHangPlace;
	//状态
	private String etspStatus;
	//路线ID
	private Integer etspEblnId;
	//路线名称
	private String etspEblnName;
	//预计出场时间
	private Date etspPlanOutStopTime;
	//预计回程时间
	private Date etspRoundTripTime;
	//预计回场时间
	private Date etspPlanInStopTime;
	//调度时间
	private Date etspLimitVolume;
	//派车要求
	private String etspSentCarReq;
	//交接文件
	private String etspBackFile;
	//带回文件
	private String etspLoadWeight;
	//附属设备
	private String etspEquipment;
	//预留字段
	private Integer etspSubnum2;
	//预留字段
	private Integer etspSubnum3;
	//预留字段
	private Date etspSubdate3;
	//预留字段
	private Date etspSubdate4;
	//预留字段
	private Date etspSubdate5;
	//预留字段
	private Date etspSubdate2;
	//预留字段
	private Date etspSubdate1;
	//预留字段
	private String etspSubstr7;
	//预留字段
	private String etspSubstr8;
	//预留字段
	private String etspSubstr6;
	//预留字段
	private String etspSubstr5;
	//预留字段
	private String etspSubstr4;
	//预留字段
	private String etspSubstr3;
	//预留字段
	private String etspSubstr2;
	//预留字段
	private String etspSubstr1;
	//预留字段
	private Integer etspSubnum1;
	//recVer
	private Integer recVer;
	//modifyTime
	private Date modifyTime;
	//modifier
	private String modifier;
	//createTime
	private Date createTime;
	//creator
	private String creator;
	//所属公司
	private Long etspEscoId;
	//预计提货时间
	private Date etspPlanDeliveryTime;
	//预计到货时间
	private Date etspPlanArrivalTime;
	//集装箱是否有任务分配1
	private String etspContainerIsTask1;
	//集装箱是否有任务分配2
	private String etspContainerIsTask2;
	//备注
	private String etspDesc;
	//维修费用
	private Double etspRepairFee;
	//外加燃料
	private Double etspFuelPlus;
	//内加燃料
	private Double etspFuelNega;
	//是否签收单
	private String etspIsSingle;
	//燃油费用
	private Double etspFuelFee;
	//报销里程
	private Double etspReimburseMileage;
	//核定里程
	private Double etspApproveMileage;
	//空车里程
	private Double etspEmptyMileage;
	//重车里程
	private Double etspHeavyMileage;
	//总里程
	private Double etspTotalMileage;
	//回场里程
	private Double etspInStopMileage;
	//出场里程
	private Double etspOutStopMileage;
	//实际回程时间
	private Date etspActualReturnTime;
	//实际回场时间
	private Date etspActualInStopTime;
	//实际出场时间
	private Date etspActualOutStopTime;
	//押运员名称
	private String etspGuardsEttpName;
	//押运员ID
	private Integer etspGuardsEttpId;
	//操作基地Id
	private Integer etspOperateEsstId;
	//资质列表
	private String etspCertificationNameList;
	//调度计划类型
	private String etspType;
	
	//调度计划名称
	private String etspName;
	//保存时被覆盖的实际公里数
    private Double etspLastActualMileage;
    private String etspMakedType;
    //总收入
    private Double etspTotalIncome;
    
    //调度导出次数
    private Integer etspExportCount;
    //调度最后导出时间 
    private String etspLastExportTime;
    //调度导出操作人
    private String etspExportOperator;
    //费用计算状态
    private String etspCostStatus;
    //计划数据来源
    private String etspDataSource;//
    //费用计算结果 
    private String etspFeeResult;
    //是否锁定 
    private String etspIsLock;
    //行车单运输类型   1.区域运输行车单；2.干线运输行车单  add by blake 20131213
    private String etspTransType;
    
    //默认出场时间
    private Date etspDefaultOutStopTime;
    //打印次数
    private Integer etspPrintCount;
    
    //是否包车
    private String etspIsRent;
    //班次id
    private Integer etspEbfgId;
    
    //是否回程
    private String etspIsReturnCargo;
    
    //干线发车时间
    private  Date etspLinehaulStartTime;

    //干线抵达时间
    private  Date etspLinehaulArrivedTime;
    
    //add by tom 20141204 手机APP接收状态默认为0-未接收，1为已接收、-1为已拒绝
    private Integer etspAppReceiveStatus;
    
    
    //干线发车时 车辆所在经度
    private  Double etspLongitude;

    //干线发车时 车辆所在纬度
    private  Double etspLatitude;

    //干线运输是否真正开始(Y  代表已取到相对“真实”的发车时间 N或空代表没取到)
    private  String etspClasslineIsStart;
    
    //判断是否导入过OTMS
    private String etspIsImport;
    
    
    @Column(name="ETSP_IS_IMPORT")
    public String getEtspIsImport() {
		return etspIsImport;
	}

	public void setEtspIsImport(String etspIsImport) {
		this.etspIsImport = etspIsImport;
		addValidField("etspIsImport");
	}

	/**
    * Get 干线发车时 车辆所在经度
    * @return
    */
    @Column(name = "ETSP_LONGITUDE")
    public Double getEtspLongitude(){
       return etspLongitude;
    }

    /**
    * Set 干线发车时 车辆所在经度
    */
    public void setEtspLongitude(Double etspLongitude){
       this.etspLongitude = etspLongitude;
       addValidField("etspLongitude");
    }

    /**
    * Get 干线发车时 车辆所在纬度
    * @return
    */
    @Column(name = "ETSP_LATITUDE")
    public Double getEtspLatitude(){
       return etspLatitude;
    }

    /**
    * Set 干线发车时 车辆所在纬度
    */
    public void setEtspLatitude(Double etspLatitude){
       this.etspLatitude = etspLatitude;
       addValidField("etspLatitude");
    }

    /**
    * Get 干线运输是否真正开始(Y  代表已取到相对“真实”的发车时间 N或空代表没取到)
    * @return
    */
    @Column(name = "ETSP_CLASSLINE_IS_START")
    public String getEtspClasslineIsStart(){
       return etspClasslineIsStart;
    }

    /**
    * Set 干线运输是否真正开始(Y  代表已取到相对“真实”的发车时间 N或空代表没取到 E 异常情况)
    */
    public void setEtspClasslineIsStart(String etspClasslineIsStart){
       this.etspClasslineIsStart = etspClasslineIsStart;
       addValidField("etspClasslineIsStart");
    }



    @Column(name = "ETSP_APP_RECEIVE_STATUS")
    public Integer getEtspAppReceiveStatus() {
		return etspAppReceiveStatus;
	}

	public void setEtspAppReceiveStatus(Integer etspAppReceiveStatus) {
		this.etspAppReceiveStatus = etspAppReceiveStatus;
		addValidField("etspAppReceiveStatus");
	}

	/**
    * Get 干线发车时间
    * @return
    */
    @Column(name = "ETSP_LINEHAUL_START_TIME")
    public Date getEtspLinehaulStartTime(){
       return etspLinehaulStartTime;
    }

    /**
    * Set 干线发车时间
    */
    public void setEtspLinehaulStartTime(Date etspLinehaulStartTime){
       this.etspLinehaulStartTime = etspLinehaulStartTime;
       addValidField("etspLinehaulStartTime");
    }

    /**
    * Get 干线抵达时间
    * @return
    */
    @Column(name = "ETSP_LINEHAUL_ARRIVED_TIME")
    public Date getEtspLinehaulArrivedTime(){
       return etspLinehaulArrivedTime;
    }

    /**
    * Set 干线抵达时间
    */
    public void setEtspLinehaulArrivedTime(Date etspLinehaulArrivedTime){
       this.etspLinehaulArrivedTime = etspLinehaulArrivedTime;
       addValidField("etspLinehaulArrivedTime");
    }


    
    @Column(name = "ETSP_EBFG_ID")
    public Integer getEtspEbfgId() {
		return etspEbfgId;
	}

	public void setEtspEbfgId(Integer etspEbfgId) {
		this.etspEbfgId = etspEbfgId;
		addValidField("etspEbfgId");
	}

	@Column(name = "ETSP_PRINT_COUNT")
    public Integer getEtspPrintCount() {
		return etspPrintCount;
	}

	public void setEtspPrintCount(Integer etspPrintCount) {
		this.etspPrintCount = etspPrintCount;
		addValidField("etspPrintCount");
	}

	@Column(name = "ETSP_DEFAULT_OUT_STOP_TIME")
    public Date getEtspDefaultOutStopTime() {
		return etspDefaultOutStopTime;
	}

	public void setEtspDefaultOutStopTime(Date etspDefaultOutStopTime) {
		this.etspDefaultOutStopTime = etspDefaultOutStopTime;
		addValidField("etspDefaultOutStopTime");
	}

	@Column(name = "ETSP_IS_RENT")
	public String getEtspIsRent() {
		return etspIsRent;
	}

	public void setEtspIsRent(String etspIsRent) {
		this.etspIsRent = etspIsRent;
		addValidField("etspIsRent");
	}

	@Column(name = "ETSP_TRANS_TYPE")
	public String getEtspTransType() {
		return etspTransType;
	}

	public void setEtspTransType(String etspTransType) {
		this.etspTransType = etspTransType;
		addValidField("etspTransType");
	}

	@Column(name = "ETSP_FEE_RESULT")
    public String getEtspFeeResult() {
		return etspFeeResult;
	}

	public void setEtspFeeResult(String etspFeeResult) {
		this.etspFeeResult = etspFeeResult;
		addValidField("etspFeeResult");
	}

	@Column(name = "ETSP_DATA_SOURCE")
    public String getEtspDataSource() {
		return etspDataSource;
	}

	public void setEtspDataSource(String etspDataSource) {
		this.etspDataSource = etspDataSource;
		addValidField("etspDataSource");
	}

	@Column(name = "ETSP_LAST_EXPORT_TIME")
    public String getEtspLastExportTime() {
		return etspLastExportTime;
	}

	public void setEtspLastExportTime(String etspLastExportTime) {
		this.etspLastExportTime = etspLastExportTime;
		addValidField("etspLastExportTime");
	}

	@Column(name = "ETSP_EXPORT_COUNT")
	public Integer getEtspExportCount() {
		return etspExportCount;
	}

	public void setEtspExportCount(Integer etspExportCount) {
		this.etspExportCount = etspExportCount;
		addValidField("etspExportCount");
	}

	/**
	 * Get 调度计划主键
	 */
	@Column(name = "ETSP_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getEtspId() {
		return etspId;
	}

	/**
	 * Set 调度计划主键
	 */
	public void setEtspId(Integer etspId) {
		this.etspId = etspId;
		addValidField("etspId");
	}

	/**
	 * Get 调度编号
	 */
	@Column(name = "ETSP_NO")
	public String getEtspNo() {
		return etspNo;
	}

	/**
	 * Set 调度编号
	 */
	public void setEtspNo(String etspNo) {
		this.etspNo = etspNo;
		addValidField("etspNo");
	}

	/**
	 * Get 上级调度
	 */
	@Column(name = "ETSP_SELF_ID")
	public Integer getEtspSelfId() {
		return etspSelfId;
	}

	/**
	 * Set 上级调度
	 */
	public void setEtspSelfId(Integer etspSelfId) {
		this.etspSelfId = etspSelfId;
		addValidField("etspSelfId");
	}

	/**
	 * Get 调度员
	 */
	@Column(name = "ETSP_DUTY_SCHEDULE")
	public String getEtspDutySchedule() {
		return etspDutySchedule;
	}

	/**
	 * Set 调度员
	 */
	public void setEtspDutySchedule(String etspDutySchedule) {
		this.etspDutySchedule = etspDutySchedule;
		addValidField("etspDutySchedule");
	}

	/**
	 * Get 提箱地
	 */
	@Column(name = "ETSP_SUITCASE")
	public String getEtspSuitcase() {
		return etspSuitcase;
	}

	/**
	 * Set 提箱地
	 */
	public void setEtspSuitcase(String etspSuitcase) {
		this.etspSuitcase = etspSuitcase;
		addValidField("etspSuitcase");
	}

	/**
	 * Get 还箱地
	 */
	@Column(name = "ETSP_CRATES")
	public String getEtspCrates() {
		return etspCrates;
	}

	/**
	 * Set 还箱地
	 */
	public void setEtspCrates(String etspCrates) {
		this.etspCrates = etspCrates;
		addValidField("etspCrates");
	}

	/**
	 * Get 主驾驶ID
	 */
	@Column(name = "ETSP_MAIN_ETTP_ID")
	public Integer getEtspMainEttpId() {
		return etspMainEttpId;
	}

	/**
	 * Set 主驾驶ID
	 */
	public void setEtspMainEttpId(Integer etspMainEttpId) {
		this.etspMainEttpId = etspMainEttpId;
		addValidField("etspMainEttpId");
	}

	/**
	 * Get 挂车车牌号
	 */
	@Column(name = "ETSP_TRAILER_ETVE_CARD")
	public String getEtspTrailerEtveCard() {
		return etspTrailerEtveCard;
	}

	/**
	 * Set 挂车车牌号
	 */
	public void setEtspTrailerEtveCard(String etspTrailerEtveCard) {
		this.etspTrailerEtveCard = etspTrailerEtveCard;
		addValidField("etspTrailerEtveCard");
	}

	/**
	 * Get 挂车ID
	 */
	@Column(name = "ETSP_TRAILER_ETVE_ID")
	public Integer getEtspTrailerEtveId() {
		return etspTrailerEtveId;
	}

	/**
	 * Set 挂车ID
	 */
	public void setEtspTrailerEtveId(Integer etspTrailerEtveId) {
		this.etspTrailerEtveId = etspTrailerEtveId;
		addValidField("etspTrailerEtveId");
	}

	/**
	 * Get 牵引车车牌号
	 */
	@Column(name = "ETSP_TRACTOR_ETVE_CARD")
	public String getEtspTractorEtveCard() {
		return etspTractorEtveCard;
	}

	/**
	 * Set 牵引车车牌号
	 */
	public void setEtspTractorEtveCard(String etspTractorEtveCard) {
		this.etspTractorEtveCard = etspTractorEtveCard;
		addValidField("etspTractorEtveCard");
	}

	/**
	 * Get 牵引车ID
	 */
	@Column(name = "ETSP_TRACTOR_ETVE_ID")
	public Integer getEtspTractorEtveId() {
		return etspTractorEtveId;
	}

	/**
	 * Set 牵引车ID
	 */
	public void setEtspTractorEtveId(Integer etspTractorEtveId) {
		this.etspTractorEtveId = etspTractorEtveId;
		addValidField("etspTractorEtveId");
	}

	/**
	 * Get 主驾驶
	 */
	@Column(name = "ETSP_MAIN_ETTP_NAME")
	public String getEtspMainEttpName() {
		return etspMainEttpName;
	}

	/**
	 * Set 主驾驶
	 */
	public void setEtspMainEttpName(String etspMainEttpName) {
		this.etspMainEttpName = etspMainEttpName;
		addValidField("etspMainEttpName");
	}

	/**
	 * Get 副驾驶ID
	 */
	@Column(name = "ETSP_COPILOR_ETTP_ID")
	public Integer getEtspCopilorEttpId() {
		return etspCopilorEttpId;
	}

	/**
	 * Set 副驾驶ID
	 */
	public void setEtspCopilorEttpId(Integer etspCopilorEttpId) {
		this.etspCopilorEttpId = etspCopilorEttpId;
		addValidField("etspCopilorEttpId");
	}

	/**
	 * Get 副驾驶
	 */
	@Column(name = "ETSP_COPILOR_ETTP_NAME")
	public String getEtspCopilorEttpName() {
		return etspCopilorEttpName;
	}

	/**
	 * Set 副驾驶
	 */
	public void setEtspCopilorEttpName(String etspCopilorEttpName) {
		this.etspCopilorEttpName = etspCopilorEttpName;
		addValidField("etspCopilorEttpName");
	}

	/**
	 * Get 集装箱ID1
	 */
	@Column(name = "ETSP_ETCA_ID1")
	public Integer getEtspEtcaId1() {
		return etspEtcaId1;
	}

	/**
	 * Set 集装箱ID1
	 */
	public void setEtspEtcaId1(Integer etspEtcaId1) {
		this.etspEtcaId1 = etspEtcaId1;
		addValidField("etspEtcaId1");
	}

	/**
	 * Get 集装箱号1
	 */
	@Column(name = "ETSP_ETCA_NO")
	public String getEtspEtcaNo() {
		return etspEtcaNo;
	}

	/**
	 * Set 集装箱号1
	 */
	public void setEtspEtcaNo(String etspEtcaNo) {
		this.etspEtcaNo = etspEtcaNo;
		addValidField("etspEtcaNo");
	}

	/**
	 * Get 封号1
	 */
	@Column(name = "ETSP_TITLE_NO1")
	public String getEtspTitleNo1() {
		return etspTitleNo1;
	}

	/**
	 * Set 封号1
	 */
	public void setEtspTitleNo1(String etspTitleNo1) {
		this.etspTitleNo1 = etspTitleNo1;
		addValidField("etspTitleNo1");
	}

	/**
	 * Get 集装箱ID2
	 */
	@Column(name = "ETSP_ETCA_ID2")
	public Integer getEtspEtcaId2() {
		return etspEtcaId2;
	}

	/**
	 * Set 集装箱ID2
	 */
	public void setEtspEtcaId2(Integer etspEtcaId2) {
		this.etspEtcaId2 = etspEtcaId2;
		addValidField("etspEtcaId2");
	}

	/**
	 * Get 集装箱号2
	 */
	@Column(name = "ETSP_ETCA_NO2")
	public String getEtspEtcaNo2() {
		return etspEtcaNo2;
	}

	/**
	 * Set 集装箱号2
	 */
	public void setEtspEtcaNo2(String etspEtcaNo2) {
		this.etspEtcaNo2 = etspEtcaNo2;
		addValidField("etspEtcaNo2");
	}

	/**
	 * Get 封号2
	 */
	@Column(name = "ETSP_TITLE_NO2")
	public String getEtspTitleNo2() {
		return etspTitleNo2;
	}

	/**
	 * Set 封号2
	 */
	public void setEtspTitleNo2(String etspTitleNo2) {
		this.etspTitleNo2 = etspTitleNo2;
		addValidField("etspTitleNo2");
	}

	/**
	 * Get 额定百公里油耗
	 */
	@Column(name = "ETSP_RATE_FUEL_100")
	public Double getEtspRateFuel100() {
		return etspRateFuel100;
	}

	/**
	 * Set 额定百公里油耗
	 */
	public void setEtspRateFuel100(Double etspRateFuel100) {
		this.etspRateFuel100 = etspRateFuel100;
		addValidField("etspRateFuel100");
	}

	/**
	 * Get 额定油耗
	 */
	@Column(name = "ETSP_RATE_FUEL")
	public Double getEtspRateFuel() {
		return etspRateFuel;
	}

	/**
	 * Set 额定油耗
	 */
	public void setEtspRateFuel(Double etspRateFuel) {
		this.etspRateFuel = etspRateFuel;
		addValidField("etspRateFuel");
	}

	/**
	 * Get 实际油耗
	 */
	@Column(name = "ETSP_ACTUAL_FUEL")
	public Double getEtspActualFuel() {
		return etspActualFuel;
	}

	/**
	 * Set 实际油耗
	 */
	public void setEtspActualFuel(Double etspActualFuel) {
		this.etspActualFuel = etspActualFuel;
		addValidField("etspActualFuel");
	}

	/**
	 * Get 额定公里数
	 */
	@Column(name = "ETSP_RATE_MILEAGE")
	public Double getEtspRateMileage() {
		return etspRateMileage;
	}

	/**
	 * Set 额定公里数
	 */
	public void setEtspRateMileage(Double etspRateMileage) {
		this.etspRateMileage = etspRateMileage;
		addValidField("etspRateMileage");
	}

	/**
	 * Get 实际公里数
	 */
	@Column(name = "ETSP_ACTUAL_MILEAGE")
	public Double getEtspActualMileage() {
		return etspActualMileage;
	}

	/**
	 * Set 实际公里数
	 */
	public void setEtspActualMileage(Double etspActualMileage) {
		this.etspActualMileage = etspActualMileage;
		addValidField("etspActualMileage");
	}

	/**
	 * Get 主驾提成
	 */
	@Column(name = "ETSP_MAIN_COMMISSION")
	public Double getEtspMainCommission() {
		return etspMainCommission;
	}

	/**
	 * Set 主驾提成
	 */
	public void setEtspMainCommission(Double etspMainCommission) {
		this.etspMainCommission = etspMainCommission;
		addValidField("etspMainCommission");
	}

	/**
	 * Get 副驾提成
	 */
	@Column(name = "ETSP_COPILOR_COMMISSION")
	public Double getEtspCopilorCommission() {
		return etspCopilorCommission;
	}

	/**
	 * Set 副驾提成
	 */
	public void setEtspCopilorCommission(Double etspCopilorCommission) {
		this.etspCopilorCommission = etspCopilorCommission;
		addValidField("etspCopilorCommission");
	}

	/**
	 * Get 押运员提成
	 */
	@Column(name = "ETSP_GUARD_COMMISSION")
	public Double getEtspGuardCommission() {
		return etspGuardCommission;
	}

	/**
	 * Set 押运员提成
	 */
	public void setEtspGuardCommission(Double etspGuardCommission) {
		this.etspGuardCommission = etspGuardCommission;
		addValidField("etspGuardCommission");
	}

	/**
	 * Get 提成合计
	 */
	@Column(name = "ETSP_TATOL_COMMISSION")
	public Double getEtspTatolCommission() {
		return etspTatolCommission;
	}

	/**
	 * Set 提成合计
	 */
	public void setEtspTatolCommission(Double etspTatolCommission) {
		this.etspTatolCommission = etspTatolCommission;
		addValidField("etspTatolCommission");
	}

	/**
	 * Get 分供方ID
	 */
	@Column(name = "ETSP_EBCU_ID")
	public Integer getEtspEbcuId() {
		return etspEbcuId;
	}

	/**
	 * Set 分供方ID
	 */
	public void setEtspEbcuId(Integer etspEbcuId) {
		this.etspEbcuId = etspEbcuId;
		addValidField("etspEbcuId");
	}

	/**
	 * Get 供方名称
	 */
	@Column(name = "ETSP_EBCU_NAME_CN")
	public String getEtspEbcuNameCn() {
		return etspEbcuNameCn;
	}

	/**
	 * Set 供方名称
	 */
	public void setEtspEbcuNameCn(String etspEbcuNameCn) {
		this.etspEbcuNameCn = etspEbcuNameCn;
		addValidField("etspEbcuNameCn");
	}

	/**
	 * Get 甩挂地点
	 */
	@Column(name = "ETSP_HANG_PLACE")
	public String getEtspHangPlace() {
		return etspHangPlace;
	}

	/**
	 * Set 甩挂地点
	 */
	public void setEtspHangPlace(String etspHangPlace) {
		this.etspHangPlace = etspHangPlace;
		addValidField("etspHangPlace");
	}

	/**
	 * Get 状态
	 */
	@Column(name = "ETSP_STATUS")
	public String getEtspStatus() {
		return etspStatus;
	}

	/**
	 * Set 状态
	 */
	public void setEtspStatus(String etspStatus) {
		this.etspStatus = etspStatus;
		addValidField("etspStatus");
	}

	/**
	 * Get 路线ID
	 */
	@Column(name = "ETSP_EBLN_ID")
	public Integer getEtspEblnId() {
		return etspEblnId;
	}

	/**
	 * Set 路线ID
	 */
	public void setEtspEblnId(Integer etspEblnId) {
		this.etspEblnId = etspEblnId;
		addValidField("etspEblnId");
	}

	/**
	 * Get 路线名称
	 */
	@Column(name = "ETSP_EBLN_NAME")
	public String getEtspEblnName() {
		return etspEblnName;
	}

	/**
	 * Set 路线名称
	 */
	public void setEtspEblnName(String etspEblnName) {
		this.etspEblnName = etspEblnName;
		addValidField("etspEblnName");
	}

	/**
	 * Get 预计出场时间
	 */
	@Column(name = "ETSP_PLAN_OUT_STOP_TIME")
	public Date getEtspPlanOutStopTime() {
		return etspPlanOutStopTime;
	}

	/**
	 * Set 预计出场时间
	 */
	public void setEtspPlanOutStopTime(Date etspPlanOutStopTime) {
		this.etspPlanOutStopTime = etspPlanOutStopTime;
		addValidField("etspPlanOutStopTime");
	}

	/**
	 * Get 预计回程时间
	 */
	@Column(name = "ETSP_ROUND_TRIP_TIME")
	public Date getEtspRoundTripTime() {
		return etspRoundTripTime;
	}

	/**
	 * Set 预计回程时间
	 */
	public void setEtspRoundTripTime(Date etspRoundTripTime) {
		this.etspRoundTripTime = etspRoundTripTime;
		addValidField("etspRoundTripTime");
	}

	/**
	 * Get 预计回场时间
	 */
	@Column(name = "ETSP_PLAN_IN_STOP_TIME")
	public Date getEtspPlanInStopTime() {
		return etspPlanInStopTime;
	}

	/**
	 * Set 预计回场时间
	 */
	public void setEtspPlanInStopTime(Date etspPlanInStopTime) {
		this.etspPlanInStopTime = etspPlanInStopTime;
		addValidField("etspPlanInStopTime");
	}

	/**
	 * Get 调度时间
	 */
	@Column(name = "ETSP_LIMIT_VOLUME")
	public Date getEtspLimitVolume() {
		return etspLimitVolume;
	}

	/**
	 * Set 调度时间
	 */
	public void setEtspLimitVolume(Date etspLimitVolume) {
		this.etspLimitVolume = etspLimitVolume;
		addValidField("etspLimitVolume");
	}

	/**
	 * Get 派车要求
	 */
	@Column(name = "ETSP_SENT_CAR_REQ")
	public String getEtspSentCarReq() {
		return etspSentCarReq;
	}

	/**
	 * Set 派车要求
	 */
	public void setEtspSentCarReq(String etspSentCarReq) {
		this.etspSentCarReq = etspSentCarReq;
		addValidField("etspSentCarReq");
	}

	/**
	 * Get 交接文件
	 */
	@Column(name = "ETSP_BACK_FILE")
	public String getEtspBackFile() {
		return etspBackFile;
	}

	/**
	 * Set 交接文件
	 */
	public void setEtspBackFile(String etspBackFile) {
		this.etspBackFile = etspBackFile;
		addValidField("etspBackFile");
	}

	/**
	 * Get 带回文件
	 */
	@Column(name = "ETSP_LOAD_WEIGHT")
	public String getEtspLoadWeight() {
		return etspLoadWeight;
	}

	/**
	 * Set 带回文件
	 */
	public void setEtspLoadWeight(String etspLoadWeight) {
		this.etspLoadWeight = etspLoadWeight;
		addValidField("etspLoadWeight");
	}

	/**
	 * Get 附属设备
	 */
	@Column(name = "ETSP_EQUIPMENT")
	public String getEtspEquipment() {
		return etspEquipment;
	}

	/**
	 * Set 附属设备
	 */
	public void setEtspEquipment(String etspEquipment) {
		this.etspEquipment = etspEquipment;
		addValidField("etspEquipment");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETSP_SUBNUM2")
	public Integer getEtspSubnum2() {
		return etspSubnum2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtspSubnum2(Integer etspSubnum2) {
		this.etspSubnum2 = etspSubnum2;
		addValidField("etspSubnum2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETSP_SUBNUM3")
	public Integer getEtspSubnum3() {
		return etspSubnum3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtspSubnum3(Integer etspSubnum3) {
		this.etspSubnum3 = etspSubnum3;
		addValidField("etspSubnum3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETSP_SUBDATE3")
	public Date getEtspSubdate3() {
		return etspSubdate3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtspSubdate3(Date etspSubdate3) {
		this.etspSubdate3 = etspSubdate3;
		addValidField("etspSubdate3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETSP_SUBDATE4")
	public Date getEtspSubdate4() {
		return etspSubdate4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtspSubdate4(Date etspSubdate4) {
		this.etspSubdate4 = etspSubdate4;
		addValidField("etspSubdate4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETSP_SUBDATE5")
	public Date getEtspSubdate5() {
		return etspSubdate5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtspSubdate5(Date etspSubdate5) {
		this.etspSubdate5 = etspSubdate5;
		addValidField("etspSubdate5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETSP_SUBDATE2")
	public Date getEtspSubdate2() {
		return etspSubdate2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtspSubdate2(Date etspSubdate2) {
		this.etspSubdate2 = etspSubdate2;
		addValidField("etspSubdate2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETSP_SUBDATE1")
	public Date getEtspSubdate1() {
		return etspSubdate1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtspSubdate1(Date etspSubdate1) {
		this.etspSubdate1 = etspSubdate1;
		addValidField("etspSubdate1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETSP_SUBSTR7")
	public String getEtspSubstr7() {
		return etspSubstr7;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtspSubstr7(String etspSubstr7) {
		this.etspSubstr7 = etspSubstr7;
		addValidField("etspSubstr7");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETSP_SUBSTR8")
	public String getEtspSubstr8() {
		return etspSubstr8;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtspSubstr8(String etspSubstr8) {
		this.etspSubstr8 = etspSubstr8;
		addValidField("etspSubstr8");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETSP_SUBSTR6")
	public String getEtspSubstr6() {
		return etspSubstr6;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtspSubstr6(String etspSubstr6) {
		this.etspSubstr6 = etspSubstr6;
		addValidField("etspSubstr6");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETSP_SUBSTR5")
	public String getEtspSubstr5() {
		return etspSubstr5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtspSubstr5(String etspSubstr5) {
		this.etspSubstr5 = etspSubstr5;
		addValidField("etspSubstr5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETSP_SUBSTR4")
	public String getEtspSubstr4() {
		return etspSubstr4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtspSubstr4(String etspSubstr4) {
		this.etspSubstr4 = etspSubstr4;
		addValidField("etspSubstr4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETSP_SUBSTR3")
	public String getEtspSubstr3() {
		return etspSubstr3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtspSubstr3(String etspSubstr3) {
		this.etspSubstr3 = etspSubstr3;
		addValidField("etspSubstr3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETSP_SUBSTR2")
	public String getEtspSubstr2() {
		return etspSubstr2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtspSubstr2(String etspSubstr2) {
		this.etspSubstr2 = etspSubstr2;
		addValidField("etspSubstr2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETSP_SUBSTR1")
	public String getEtspSubstr1() {
		return etspSubstr1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtspSubstr1(String etspSubstr1) {
		this.etspSubstr1 = etspSubstr1;
		addValidField("etspSubstr1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETSP_SUBNUM1")
	public Integer getEtspSubnum1() {
		return etspSubnum1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtspSubnum1(Integer etspSubnum1) {
		this.etspSubnum1 = etspSubnum1;
		addValidField("etspSubnum1");
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
	 * Get 所属公司
	 */
	@Column(name = "ETSP_ESCO_ID")
	public Long getEtspEscoId() {
		return etspEscoId;
	}

	/**
	 * Set 所属公司
	 */
	public void setEtspEscoId(Long etspEscoId) {
		this.etspEscoId = etspEscoId;
		addValidField("etspEscoId");
	}

	/**
	 * Get 预计提货时间
	 */
	@Column(name = "ETSP_PLAN_DELIVERY_TIME")
	public Date getEtspPlanDeliveryTime() {
		return etspPlanDeliveryTime;
	}

	/**
	 * Set 预计提货时间
	 */
	public void setEtspPlanDeliveryTime(Date etspPlanDeliveryTime) {
		this.etspPlanDeliveryTime = etspPlanDeliveryTime;
		addValidField("etspPlanDeliveryTime");
	}

	/**
	 * Get 预计到货时间
	 */
	@Column(name = "ETSP_PLAN_ARRIVAL_TIME")
	public Date getEtspPlanArrivalTime() {
		return etspPlanArrivalTime;
	}

	/**
	 * Set 预计到货时间
	 */
	public void setEtspPlanArrivalTime(Date etspPlanArrivalTime) {
		this.etspPlanArrivalTime = etspPlanArrivalTime;
		addValidField("etspPlanArrivalTime");
	}

	/**
	 * Get 集装箱是否有任务分配1
	 */
	@Column(name = "ETSP_CONTAINER_IS_TASK1")
	public String getEtspContainerIsTask1() {
		return etspContainerIsTask1;
	}

	/**
	 * Set 集装箱是否有任务分配1
	 */
	public void setEtspContainerIsTask1(String etspContainerIsTask1) {
		this.etspContainerIsTask1 = etspContainerIsTask1;
		addValidField("etspContainerIsTask1");
	}

	/**
	 * Get 集装箱是否有任务分配2
	 */
	@Column(name = "ETSP_CONTAINER_IS_TASK2")
	public String getEtspContainerIsTask2() {
		return etspContainerIsTask2;
	}

	/**
	 * Set 集装箱是否有任务分配2
	 */
	public void setEtspContainerIsTask2(String etspContainerIsTask2) {
		this.etspContainerIsTask2 = etspContainerIsTask2;
		addValidField("etspContainerIsTask2");
	}

	/**
	 * Get 备注
	 */
	@Column(name = "ETSP_DESC")
	public String getEtspDesc() {
		return etspDesc;
	}

	/**
	 * Set 备注
	 */
	public void setEtspDesc(String etspDesc) {
		this.etspDesc = etspDesc;
		addValidField("etspDesc");
	}

	/**
	 * Get 维修费用
	 */
	@Column(name = "ETSP_REPAIR_FEE")
	public Double getEtspRepairFee() {
		return etspRepairFee;
	}

	/**
	 * Set 维修费用
	 */
	public void setEtspRepairFee(Double etspRepairFee) {
		this.etspRepairFee = etspRepairFee;
		addValidField("etspRepairFee");
	}

	/**
	 * Get 外加燃料
	 */
	@Column(name = "ETSP_FUEL_PLUS")
	public Double getEtspFuelPlus() {
		return etspFuelPlus;
	}

	/**
	 * Set 外加燃料
	 */
	public void setEtspFuelPlus(Double etspFuelPlus) {
		this.etspFuelPlus = etspFuelPlus;
		addValidField("etspFuelPlus");
	}

	/**
	 * Get 内加燃料
	 */
	@Column(name = "ETSP_FUEL_NEGA")
	public Double getEtspFuelNega() {
		return etspFuelNega;
	}

	/**
	 * Set 内加燃料
	 */
	public void setEtspFuelNega(Double etspFuelNega) {
		this.etspFuelNega = etspFuelNega;
		addValidField("etspFuelNega");
	}

	/**
	 * Get 是否签收单
	 */
	@Column(name = "ETSP_IS_SINGLE")
	public String getEtspIsSingle() {
		return etspIsSingle;
	}

	/**
	 * Set 是否签收单
	 */
	public void setEtspIsSingle(String etspIsSingle) {
		this.etspIsSingle = etspIsSingle;
		addValidField("etspIsSingle");
	}

	/**
	 * Get 燃油费用
	 */
	@Column(name = "ETSP_FUEL_FEE")
	public Double getEtspFuelFee() {
		return etspFuelFee;
	}

	/**
	 * Set 燃油费用
	 */
	public void setEtspFuelFee(Double etspFuelFee) {
		this.etspFuelFee = etspFuelFee;
		addValidField("etspFuelFee");
	}

	/**
	 * Get 报销里程
	 */
	@Column(name = "ETSP_REIMBURSE_MILEAGE")
	public Double getEtspReimburseMileage() {
		return etspReimburseMileage;
	}

	/**
	 * Set 报销里程
	 */
	public void setEtspReimburseMileage(Double etspReimburseMileage) {
		this.etspReimburseMileage = etspReimburseMileage;
		addValidField("etspReimburseMileage");
	}

	/**
	 * Get 核定里程
	 */
	@Column(name = "ETSP_APPROVE_MILEAGE")
	public Double getEtspApproveMileage() {
		return etspApproveMileage;
	}

	/**
	 * Set 核定里程
	 */
	public void setEtspApproveMileage(Double etspApproveMileage) {
		this.etspApproveMileage = etspApproveMileage;
		addValidField("etspApproveMileage");
	}

	/**
	 * Get 空车里程
	 */
	@Column(name = "ETSP_EMPTY_MILEAGE")
	public Double getEtspEmptyMileage() {
		return etspEmptyMileage;
	}

	/**
	 * Set 空车里程
	 */
	public void setEtspEmptyMileage(Double etspEmptyMileage) {
		this.etspEmptyMileage = etspEmptyMileage;
		addValidField("etspEmptyMileage");
	}

	/**
	 * Get 重车里程
	 */
	@Column(name = "ETSP_HEAVY_MILEAGE")
	public Double getEtspHeavyMileage() {
		return etspHeavyMileage;
	}

	/**
	 * Set 重车里程
	 */
	public void setEtspHeavyMileage(Double etspHeavyMileage) {
		this.etspHeavyMileage = etspHeavyMileage;
		addValidField("etspHeavyMileage");
	}

	/**
	 * Get 总里程
	 */
	@Column(name = "ETSP_TOTAL_MILEAGE")
	public Double getEtspTotalMileage() {
		return etspTotalMileage;
	}

	/**
	 * Set 总里程
	 */
	public void setEtspTotalMileage(Double etspTotalMileage) {
		this.etspTotalMileage = etspTotalMileage;
		addValidField("etspTotalMileage");
	}

	/**
	 * Get 回场里程
	 */
	@Column(name = "ETSP_IN_STOP_MILEAGE")
	public Double getEtspInStopMileage() {
		return etspInStopMileage;
	}

	/**
	 * Set 回场里程
	 */
	public void setEtspInStopMileage(Double etspInStopMileage) {
		this.etspInStopMileage = etspInStopMileage;
		addValidField("etspInStopMileage");
	}

	/**
	 * Get 出场里程
	 */
	@Column(name = "ETSP_OUT_STOP_MILEAGE")
	public Double getEtspOutStopMileage() {
		return etspOutStopMileage;
	}

	/**
	 * Set 出场里程
	 */
	public void setEtspOutStopMileage(Double etspOutStopMileage) {
		this.etspOutStopMileage = etspOutStopMileage;
		addValidField("etspOutStopMileage");
	}

	/**
	 * Get 实际回程时间
	 */
	@Column(name = "ETSP_ACTUAL_RETURN_TIME")
	public Date getEtspActualReturnTime() {
		return etspActualReturnTime;
	}

	/**
	 * Set 实际回程时间
	 */
	public void setEtspActualReturnTime(Date etspActualReturnTime) {
		this.etspActualReturnTime = etspActualReturnTime;
		addValidField("etspActualReturnTime");
	}

	/**
	 * Get 实际回场时间
	 */
	@Column(name = "ETSP_ACTUAL_IN_STOP_TIME")
	public Date getEtspActualInStopTime() {
		return etspActualInStopTime;
	}

	/**
	 * Set 实际回场时间
	 */
	public void setEtspActualInStopTime(Date etspActualInStopTime) {
		this.etspActualInStopTime = etspActualInStopTime;
		addValidField("etspActualInStopTime");
	}

	/**
	 * Get 实际出场时间
	 */
	@Column(name = "ETSP_ACTUAL_OUT_STOP_TIME")
	public Date getEtspActualOutStopTime() {
		return etspActualOutStopTime;
	}

	/**
	 * Set 实际出场时间
	 */
	public void setEtspActualOutStopTime(Date etspActualOutStopTime) {
		this.etspActualOutStopTime = etspActualOutStopTime;
		addValidField("etspActualOutStopTime");
	}

	/**
	 * Get 押运员名称
	 */
	@Column(name = "ETSP_GUARDS_ETTP_NAME")
	public String getEtspGuardsEttpName() {
		return etspGuardsEttpName;
	}

	/**
	 * Set 押运员名称
	 */
	public void setEtspGuardsEttpName(String etspGuardsEttpName) {
		this.etspGuardsEttpName = etspGuardsEttpName;
		addValidField("etspGuardsEttpName");
	}

	/**
	 * Get 押运员ID
	 */
	@Column(name = "ETSP_GUARDS_ETTP_ID")
	public Integer getEtspGuardsEttpId() {
		return etspGuardsEttpId;
	}

	/**
	 * Set 押运员ID
	 */
	public void setEtspGuardsEttpId(Integer etspGuardsEttpId) {
		this.etspGuardsEttpId = etspGuardsEttpId;
		addValidField("etspGuardsEttpId");
	}

	/**
	 * @return the etspOperateEsstId
	 */
	@Column(name = "ETSP_OPERATE_ESST_ID")
	public Integer getEtspOperateEsstId() {
		return etspOperateEsstId;
	}

	/**
	 * @param etspOperateEsstId the etspOperateEsstId to set
	 */
	public void setEtspOperateEsstId(Integer etspOperateEsstId) {
		this.etspOperateEsstId = etspOperateEsstId;
		addValidField("etspOperateEsstId");
	}

	@Column(name = "ETSP_CERTIFICATION_NAME_LIST")
	public String getEtspCertificationNameList() {
		return etspCertificationNameList;
	}

	public void setEtspCertificationNameList(String etspCertificationNameList) {
		this.etspCertificationNameList = etspCertificationNameList;
		addValidField("etspCertificationNameList");
	}

	@Column(name = "ETSP_TYPE")
	public String getEtspType() {
		return etspType;
	}

	public void setEtspType(String etspType) {
		this.etspType = etspType;
		addValidField("etspType");
	}

	/**
	 * @return the etspName
	 */
	@Column(name = "ETSP_NAME")
	public String getEtspName() {
		return etspName;
	}

	/**
	 * @param etspName the etspName to set
	 */
	public void setEtspName(String etspName) {
		this.etspName = etspName;
		addValidField("etspName");
	}

	/**
	 * @return the etspName
	 */
	@Column(name = "ETSP_LAST_ACTUAL_MILEAGE")
	public Double getEtspLastActualMileage() {
		return etspLastActualMileage;
	}

	/**
	 * @param etspName the etspName to set
	 */
	public void setEtspLastActualMileage(Double etspLastActualMileage) {
		this.etspLastActualMileage = etspLastActualMileage;
		addValidField("etspLastActualMileage");
	}
	/**
	 * @return the etspName
	 */
	@Column(name = "ETSP_MAKED_TYPE")
	public String getEtspMakedType() {
		return etspMakedType;
	}

	/**
	 * @param etspName the etspName to set
	 */
	public void setEtspMakedType(String etspMakedType) {
		this.etspMakedType = etspMakedType;
		addValidField("etspMakedType");
	}
	@Column(name = "ETSP_TOTAL_INCOME")
	public Double getEtspTotalIncome() {
		return etspTotalIncome;
	}

	public void setEtspTotalIncome(Double etspTotalIncome) {
		this.etspTotalIncome = etspTotalIncome;
		addValidField("etspTotalIncome");
	}
	@Column(name = "ETSP_EXPORT_OPERATOR")
	public String getEtspExportOperator() {
		return etspExportOperator;
	}

	public void setEtspExportOperator(String etspExportOperator) {
		this.etspExportOperator = etspExportOperator;
		addValidField("etspExportOperator");
	}

	@Column(name = "ETSP_COST_STATUS")
	public String getEtspCostStatus() {
		return etspCostStatus;
	}

	public void setEtspCostStatus(String etspCostStatus) {
		this.etspCostStatus = etspCostStatus;
		addValidField("etspCostStatus");
	}

	@Column(name = "ETSP_MILEAGE_STATUS")
	public String getEtspMileageStatus() {
		return etspMileageStatus;
	}

	public void setEtspMileageStatus(String etspMileageStatus) {
		this.etspMileageStatus = etspMileageStatus;
		addValidField("etspMileageStatus");
	}
	
	@Column(name = "ETSP_IS_LOCK")
    public String getEtspIsLock() {
		return etspIsLock;
	}

	public void setEtspIsLock(String etspIsLock) {
		this.etspIsLock = etspIsLock;
		addValidField("etspIsLock");
	}

	@Column(name = "ETSP_IS_RETURN_CARGO")
	public String getEtspIsReturnCargo() {
		return etspIsReturnCargo;
	}

	public void setEtspIsReturnCargo(String etspIsReturnCargo) {
		this.etspIsReturnCargo = etspIsReturnCargo;
		addValidField("etspIsReturnCargo");
	}
}