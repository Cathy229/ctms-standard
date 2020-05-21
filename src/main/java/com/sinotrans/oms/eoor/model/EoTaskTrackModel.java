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
@Table(name = "EO_TASK_TRACK")
public class EoTaskTrackModel extends BaseModel implements OperationLog {

	//任务跟踪表主键
	private Integer eottId;
	//任务表主键
	private Integer eottEotaId;
	//所属平台ID
	private Integer eottEscoId;
	//订单表主键
	private Integer eottEoorId;
	//调度计划表主键
	private Integer eottEtspId;
	//调度配载日期
	private Date eottLoadTime;
	//预计提货日期
	private Date eottPlanDeliveryTime;
	//实际提货日期
	private Date eottDeliveryTime;
	//计划到达收货方日期
	private Date eottPlanArrivalTime;
	//实际到库时间
	private Date eottToLibraryTime;
	//实际装完时间
	private Date eottLoadedTime;
	//实际离库时间
	private Date eottFromLibraryTime;
	//到达收货方时间
	private Date eottArrivalTime;
	//开始卸货时间
	private Date eottPlanDischargeTime;
	//实际间卸完时间
	private Date eottDischargeTime;
	//是否拿到签收单
	private String eottIsSign;
	//到达关场时间
	private Date eottToSekibaTime;
	//离开关场时间
	private Date eottFromSekibaTime;
	//开始装货时间
	private Date eottLoadingTime;
	//卸货车是否倾斜
	private String eottIsTilt;
	//是否库存取样
	private String eottIsInventory;
	//是否客户取样
	private String eottIsCustomer;
	//车队是否保留样品
	private String eottIsKeep;
	//发货磅单
	private String eottDeliveryNo;
	//提货空车重量
	private Double eottLoadEmptyWeight;
	//提货重车重量
	private Double eottLoadHeavyWeight;
	//装货数量
	private Double eottLoadingQuantity;
	//卸货重车重量
	private Double eottUnloadHeavyWeight;
	//卸货空车重量
	private Double eottUnloadEmptyWeight;
	//卸货数量
	private Double eottUnloadingQuantity;
	//差异
	private Double eottDifference;
	//收货磅单
	private String eottReceiveNo;
	//第三方磅单
	private String eottThirdPound;
	//第三方重车重量
	private Double eottThirdHeavyWeight;
	//第三方空车重量
	private Double eottThirdEmptyWeight;
	//第三方重差
	private Double eottThirdDiff;
	//收到购买凭证时间
	private Date eottBuyVoucherTime;
	//开始验车时间
	private Date eottInspecteTime;
	//验车通过时间
	private Date eottThroughTime;
	//开始申请通行证时间
	private Date eottApplyPassTime;
	//得到通行证时间
	private Date eottGetPassTime;
	//批准运输时间
	private Date eottApproveTarnTime;
	//押板结束时间
	private Date eottToChargeSheetTime;
	//押板起算时间
	private Date eottFromChargeSheetTime;
	//押车结束时间
	private Date eottToGuardTime;
	//押车起算时间
	private Date eottFromGuardTime;
	//是否调箱
	private String eottIsTransfer;
	//预留字段
	private String eottSubstr1;
	//预留字段
	private String eottSubstr2;
	//预留字段
	private String eottSubstr3;
	//预留字段
	private String eottSubstr4;
	//预留字段
	private String eottSubstr5;
	//预留字段
	private String eottSubstr6;
	//预留字段
	private String eottSubstr8;
	//预留字段
	private String eottSubstr7;
	//预留字段
	private Date eottSubdate1;
	//预留字段
	private Date eottSubdate2;
	//预留字段
	private Date eottSubdate5;
	//预留字段
	private Date eottSubdate4;
	//预留字段
	private Date eottSubdate3;
	//预留字段
	private Integer eottSubnum3;
	//预留字段
	private Integer eottSubnum2;
	//预留字段
	private Integer eottSubnum1;
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
	//提货车辆ID
	private Integer eottDeliveryEtveId;
	//提货车辆牌号
	private String eottDeliveryEtveCard;
	//送货承运人
	private String eottReceiveEbcuNameCn;
	//送货承运人ID
	private Integer eottReceiveEbcuId;
	//送货车辆ID
	private Integer eottReceiveEtveId;
	//送货车辆牌号
	private String eottReceiveEtveCard;
	//备注
	private String eottRemark;
	//第三方过磅货重
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
	private String eottVaryMark;
	
	
	//提收货实际地址及经纬度
	private String eottActualDeliveryAds;
	private String eottDeliveryLatitude;
	private String eottDeliveryLongitude;
	private String eottActualArrivalAds;
	private String eottArrivalLatitude;
	private String eottArrivalLongitude;
	
	/**
	 * Get 备注
	 */
	@Column(name="EOTT_REMARK")
	public String getEottRemark() {
		return eottRemark;
	}

	/**
	 * Set 备注
	 */
	public void setEottRemark(String eottRemark) {
		this.eottRemark = eottRemark;
		addValidField("eottRemark");
	}

	/**
	 * Get 任务跟踪表主键
	 */
	@Column(name = "EOTT_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getEottId() {
		return eottId;
	}

	/**
	 * Set 任务跟踪表主键
	 */
	public void setEottId(Integer eottId) {
		this.eottId = eottId;
		addValidField("eottId");
	}

	/**
	 * Get 任务表主键
	 */
	@Column(name = "EOTT_EOTA_ID")
	public Integer getEottEotaId() {
		return eottEotaId;
	}

	/**
	 * Set 任务表主键
	 */
	public void setEottEotaId(Integer eottEotaId) {
		this.eottEotaId = eottEotaId;
		addValidField("eottEotaId");
	}

	/**
	 * Get 所属平台ID
	 */
	@Column(name = "EOTT_ESCO_ID")
	public Integer getEottEscoId() {
		return eottEscoId;
	}

	/**
	 * Set 所属平台ID
	 */
	public void setEottEscoId(Integer eottEscoId) {
		this.eottEscoId = eottEscoId;
		addValidField("eottEscoId");
	}

	/**
	 * Get 订单表主键
	 */
	@Column(name = "EOTT_EOOR_ID")
	public Integer getEottEoorId() {
		return eottEoorId;
	}

	/**
	 * Set 订单表主键
	 */
	public void setEottEoorId(Integer eottEoorId) {
		this.eottEoorId = eottEoorId;
		addValidField("eottEoorId");
	}

	/**
	 * Get 调度计划表主键
	 */
	@Column(name = "EOTT_ETSP_ID")
	public Integer getEottEtspId() {
		return eottEtspId;
	}

	/**
	 * Set 调度计划表主键
	 */
	public void setEottEtspId(Integer eottEtspId) {
		this.eottEtspId = eottEtspId;
		addValidField("eottEtspId");
	}

	/**
	 * Get 调度配载日期
	 */
	@Column(name = "EOTT_LOAD_TIME")
	public Date getEottLoadTime() {
		return eottLoadTime;
	}

	/**
	 * Set 调度配载日期
	 */
	public void setEottLoadTime(Date eottLoadTime) {
		this.eottLoadTime = eottLoadTime;
		addValidField("eottLoadTime");
	}

	/**
	 * Get 预计提货日期
	 */
	@Column(name = "EOTT_PLAN_DELIVERY_TIME")
	public Date getEottPlanDeliveryTime() {
		return eottPlanDeliveryTime;
	}

	/**
	 * Set 预计提货日期
	 */
	public void setEottPlanDeliveryTime(Date eottPlanDeliveryTime) {
		this.eottPlanDeliveryTime = eottPlanDeliveryTime;
		addValidField("eottPlanDeliveryTime");
	}

	/**
	 * Get 实际提货日期
	 */
	@Column(name = "EOTT_DELIVERY_TIME")
	public Date getEottDeliveryTime() {
		return eottDeliveryTime;
	}

	/**
	 * Set 实际提货日期
	 */
	public void setEottDeliveryTime(Date eottDeliveryTime) {
		this.eottDeliveryTime = eottDeliveryTime;
		addValidField("eottDeliveryTime");
	}

	/**
	 * Get 计划到达收货方日期
	 */
	@Column(name = "EOTT_PLAN_ARRIVAL_TIME")
	public Date getEottPlanArrivalTime() {
		return eottPlanArrivalTime;
	}

	/**
	 * Set 计划到达收货方日期
	 */
	public void setEottPlanArrivalTime(Date eottPlanArrivalTime) {
		this.eottPlanArrivalTime = eottPlanArrivalTime;
		addValidField("eottPlanArrivalTime");
	}

	/**
	 * Get 实际到库时间
	 */
	@Column(name = "EOTT_TO_LIBRARY_TIME")
	public Date getEottToLibraryTime() {
		return eottToLibraryTime;
	}

	/**
	 * Set 实际到库时间
	 */
	public void setEottToLibraryTime(Date eottToLibraryTime) {
		this.eottToLibraryTime = eottToLibraryTime;
		addValidField("eottToLibraryTime");
	}

	/**
	 * Get 实际装完时间
	 */
	@Column(name = "EOTT_LOADED_TIME")
	public Date getEottLoadedTime() {
		return eottLoadedTime;
	}

	/**
	 * Set 实际装完时间
	 */
	public void setEottLoadedTime(Date eottLoadedTime) {
		this.eottLoadedTime = eottLoadedTime;
		addValidField("eottLoadedTime");
	}

	/**
	 * Get 实际离库时间
	 */
	@Column(name = "EOTT_FROM_LIBRARY_TIME")
	public Date getEottFromLibraryTime() {
		return eottFromLibraryTime;
	}

	/**
	 * Set 实际离库时间
	 */
	public void setEottFromLibraryTime(Date eottFromLibraryTime) {
		this.eottFromLibraryTime = eottFromLibraryTime;
		addValidField("eottFromLibraryTime");
	}

	/**
	 * Get 到达收货方时间
	 */
	@Column(name = "EOTT_ARRIVAL_TIME")
	public Date getEottArrivalTime() {
		return eottArrivalTime;
	}

	/**
	 * Set 到达收货方时间
	 */
	public void setEottArrivalTime(Date eottArrivalTime) {
		this.eottArrivalTime = eottArrivalTime;
		addValidField("eottArrivalTime");
	}

	/**
	 * Get 开始卸货时间
	 */
	@Column(name = "EOTT_PLAN_DISCHARGE_TIME")
	public Date getEottPlanDischargeTime() {
		return eottPlanDischargeTime;
	}

	/**
	 * Set 开始卸货时间
	 */
	public void setEottPlanDischargeTime(Date eottPlanDischargeTime) {
		this.eottPlanDischargeTime = eottPlanDischargeTime;
		addValidField("eottPlanDischargeTime");
	}

	/**
	 * Get 实际间卸完时间
	 */
	@Column(name = "EOTT_DISCHARGE_TIME")
	public Date getEottDischargeTime() {
		return eottDischargeTime;
	}

	/**
	 * Set 实际间卸完时间
	 */
	public void setEottDischargeTime(Date eottDischargeTime) {
		this.eottDischargeTime = eottDischargeTime;
		addValidField("eottDischargeTime");
	}

	/**
	 * Get 是否拿到签收单
	 */
	@Column(name = "EOTT_IS_SIGN")
	public String getEottIsSign() {
		return eottIsSign;
	}

	/**
	 * Set 是否拿到签收单
	 */
	public void setEottIsSign(String eottIsSign) {
		this.eottIsSign = eottIsSign;
		addValidField("eottIsSign");
	}

	/**
	 * Get 到达关场时间
	 */
	@Column(name = "EOTT_TO_SEKIBA_TIME")
	public Date getEottToSekibaTime() {
		return eottToSekibaTime;
	}

	/**
	 * Set 到达关场时间
	 */
	public void setEottToSekibaTime(Date eottToSekibaTime) {
		this.eottToSekibaTime = eottToSekibaTime;
		addValidField("eottToSekibaTime");
	}

	/**
	 * Get 离开关场时间
	 */
	@Column(name = "EOTT_FROM_SEKIBA_TIME")
	public Date getEottFromSekibaTime() {
		return eottFromSekibaTime;
	}

	/**
	 * Set 离开关场时间
	 */
	public void setEottFromSekibaTime(Date eottFromSekibaTime) {
		this.eottFromSekibaTime = eottFromSekibaTime;
		addValidField("eottFromSekibaTime");
	}

	/**
	 * Get 开始装货时间
	 */
	@Column(name = "EOTT_LOADING_TIME")
	public Date getEottLoadingTime() {
		return eottLoadingTime;
	}

	/**
	 * Set 开始装货时间
	 */
	public void setEottLoadingTime(Date eottLoadingTime) {
		this.eottLoadingTime = eottLoadingTime;
		addValidField("eottLoadingTime");
	}

	/**
	 * Get 卸货车是否倾斜
	 */
	@Column(name = "EOTT_IS_TILT")
	public String getEottIsTilt() {
		return eottIsTilt;
	}

	/**
	 * Set 卸货车是否倾斜
	 */
	public void setEottIsTilt(String eottIsTilt) {
		this.eottIsTilt = eottIsTilt;
		addValidField("eottIsTilt");
	}

	/**
	 * Get 是否库存取样
	 */
	@Column(name = "EOTT_IS_INVENTORY")
	public String getEottIsInventory() {
		return eottIsInventory;
	}

	/**
	 * Set 是否库存取样
	 */
	public void setEottIsInventory(String eottIsInventory) {
		this.eottIsInventory = eottIsInventory;
		addValidField("eottIsInventory");
	}

	/**
	 * Get 是否客户取样
	 */
	@Column(name = "EOTT_IS_CUSTOMER")
	public String getEottIsCustomer() {
		return eottIsCustomer;
	}

	/**
	 * Set 是否客户取样
	 */
	public void setEottIsCustomer(String eottIsCustomer) {
		this.eottIsCustomer = eottIsCustomer;
		addValidField("eottIsCustomer");
	}

	/**
	 * Get 车队是否保留样品
	 */
	@Column(name = "EOTT_IS_KEEP")
	public String getEottIsKeep() {
		return eottIsKeep;
	}

	/**
	 * Set 车队是否保留样品
	 */
	public void setEottIsKeep(String eottIsKeep) {
		this.eottIsKeep = eottIsKeep;
		addValidField("eottIsKeep");
	}

	/**
	 * Get 发货磅单
	 */
	@Column(name = "EOTT_DELIVERY_NO")
	public String getEottDeliveryNo() {
		return eottDeliveryNo;
	}

	/**
	 * Set 发货磅单
	 */
	public void setEottDeliveryNo(String eottDeliveryNo) {
		this.eottDeliveryNo = eottDeliveryNo;
		addValidField("eottDeliveryNo");
	}

	/**
	 * Get 提货空车重量
	 */
	@Column(name = "EOTT_LOAD_EMPTY_WEIGHT")
	public Double getEottLoadEmptyWeight() {
		return eottLoadEmptyWeight;
	}

	/**
	 * Set 提货空车重量
	 */
	public void setEottLoadEmptyWeight(Double eottLoadEmptyWeight) {
		this.eottLoadEmptyWeight = eottLoadEmptyWeight;
		addValidField("eottLoadEmptyWeight");
	}

	/**
	 * Get 提货重车重量
	 */
	@Column(name = "EOTT_LOAD_HEAVY_WEIGHT")
	public Double getEottLoadHeavyWeight() {
		return eottLoadHeavyWeight;
	}

	/**
	 * Set 提货重车重量
	 */
	public void setEottLoadHeavyWeight(Double eottLoadHeavyWeight) {
		this.eottLoadHeavyWeight = eottLoadHeavyWeight;
		addValidField("eottLoadHeavyWeight");
	}

	/**
	 * Get 装货数量
	 */
	@Column(name = "EOTT_LOADING_QUANTITY")
	public Double getEottLoadingQuantity() {
		return eottLoadingQuantity;
	}

	/**
	 * Set 装货数量
	 */
	public void setEottLoadingQuantity(Double eottLoadingQuantity) {
		this.eottLoadingQuantity = eottLoadingQuantity;
		addValidField("eottLoadingQuantity");
	}

	/**
	 * Get 卸货重车重量
	 */
	@Column(name = "EOTT_UNLOAD_HEAVY_WEIGHT")
	public Double getEottUnloadHeavyWeight() {
		return eottUnloadHeavyWeight;
	}

	/**
	 * Set 卸货重车重量
	 */
	public void setEottUnloadHeavyWeight(Double eottUnloadHeavyWeight) {
		this.eottUnloadHeavyWeight = eottUnloadHeavyWeight;
		addValidField("eottUnloadHeavyWeight");
	}

	/**
	 * Get 卸货空车重量
	 */
	@Column(name = "EOTT_UNLOAD_EMPTY_WEIGHT")
	public Double getEottUnloadEmptyWeight() {
		return eottUnloadEmptyWeight;
	}

	/**
	 * Set 卸货空车重量
	 */
	public void setEottUnloadEmptyWeight(Double eottUnloadEmptyWeight) {
		this.eottUnloadEmptyWeight = eottUnloadEmptyWeight;
		addValidField("eottUnloadEmptyWeight");
	}

	/**
	 * Get 卸货数量
	 */
	@Column(name = "EOTT_UNLOADING_QUANTITY")
	public Double getEottUnloadingQuantity() {
		return eottUnloadingQuantity;
	}

	/**
	 * Set 卸货数量
	 */
	public void setEottUnloadingQuantity(Double eottUnloadingQuantity) {
		this.eottUnloadingQuantity = eottUnloadingQuantity;
		addValidField("eottUnloadingQuantity");
	}

	/**
	 * Get 差异
	 */
	@Column(name = "EOTT_DIFFERENCE")
	public Double getEottDifference() {
		return eottDifference;
	}

	/**
	 * Set 差异
	 */
	public void setEottDifference(Double eottDifference) {
		this.eottDifference = eottDifference;
		addValidField("eottDifference");
	}

	/**
	 * Get 收货磅单
	 */
	@Column(name = "EOTT_RECEIVE_NO")
	public String getEottReceiveNo() {
		return eottReceiveNo;
	}

	/**
	 * Set 收货磅单
	 */
	public void setEottReceiveNo(String eottReceiveNo) {
		this.eottReceiveNo = eottReceiveNo;
		addValidField("eottReceiveNo");
	}

	/**
	 * Get 第三方磅单
	 */
	@Column(name = "EOTT_THIRD_POUND")
	public String getEottThirdPound() {
		return eottThirdPound;
	}

	/**
	 * Set 第三方磅单
	 */
	public void setEottThirdPound(String eottThirdPound) {
		this.eottThirdPound = eottThirdPound;
		addValidField("eottThirdPound");
	}

	/**
	 * Get 第三方重车重量
	 */
	@Column(name = "EOTT_THIRD_HEAVY_WEIGHT")
	public Double getEottThirdHeavyWeight() {
		return eottThirdHeavyWeight;
	}

	/**
	 * Set 第三方重车重量
	 */
	public void setEottThirdHeavyWeight(Double eottThirdHeavyWeight) {
		this.eottThirdHeavyWeight = eottThirdHeavyWeight;
		addValidField("eottThirdHeavyWeight");
	}

	/**
	 * Get 第三方空车重量
	 */
	@Column(name = "EOTT_THIRD_EMPTY_WEIGHT")
	public Double getEottThirdEmptyWeight() {
		return eottThirdEmptyWeight;
	}

	/**
	 * Set 第三方空车重量
	 */
	public void setEottThirdEmptyWeight(Double eottThirdEmptyWeight) {
		this.eottThirdEmptyWeight = eottThirdEmptyWeight;
		addValidField("eottThirdEmptyWeight");
	}

	/**
	 * Get 第三方重差
	 */
	@Column(name = "EOTT_THIRD_DIFF")
	public Double getEottThirdDiff() {
		return eottThirdDiff;
	}

	/**
	 * Set 第三方重差
	 */
	public void setEottThirdDiff(Double eottThirdDiff) {
		this.eottThirdDiff = eottThirdDiff;
		addValidField("eottThirdDiff");
	}

	/**
	 * Get 收到购买凭证时间
	 */
	@Column(name = "EOTT_BUY_VOUCHER_TIME")
	public Date getEottBuyVoucherTime() {
		return eottBuyVoucherTime;
	}

	/**
	 * Set 收到购买凭证时间
	 */
	public void setEottBuyVoucherTime(Date eottBuyVoucherTime) {
		this.eottBuyVoucherTime = eottBuyVoucherTime;
		addValidField("eottBuyVoucherTime");
	}

	/**
	 * Get 开始验车时间
	 */
	@Column(name = "EOTT_INSPECTE_TIME")
	public Date getEottInspecteTime() {
		return eottInspecteTime;
	}

	/**
	 * Set 开始验车时间
	 */
	public void setEottInspecteTime(Date eottInspecteTime) {
		this.eottInspecteTime = eottInspecteTime;
		addValidField("eottInspecteTime");
	}

	/**
	 * Get 验车通过时间
	 */
	@Column(name = "EOTT_THROUGH_TIME")
	public Date getEottThroughTime() {
		return eottThroughTime;
	}

	/**
	 * Set 验车通过时间
	 */
	public void setEottThroughTime(Date eottThroughTime) {
		this.eottThroughTime = eottThroughTime;
		addValidField("eottThroughTime");
	}

	/**
	 * Get 开始申请通行证时间
	 */
	@Column(name = "EOTT_APPLY_PASS_TIME")
	public Date getEottApplyPassTime() {
		return eottApplyPassTime;
	}

	/**
	 * Set 开始申请通行证时间
	 */
	public void setEottApplyPassTime(Date eottApplyPassTime) {
		this.eottApplyPassTime = eottApplyPassTime;
		addValidField("eottApplyPassTime");
	}

	/**
	 * Get 得到通行证时间
	 */
	@Column(name = "EOTT_GET_PASS_TIME")
	public Date getEottGetPassTime() {
		return eottGetPassTime;
	}

	/**
	 * Set 得到通行证时间
	 */
	public void setEottGetPassTime(Date eottGetPassTime) {
		this.eottGetPassTime = eottGetPassTime;
		addValidField("eottGetPassTime");
	}

	/**
	 * Get 批准运输时间
	 */
	@Column(name = "EOTT_APPROVE_TARN_TIME")
	public Date getEottApproveTarnTime() {
		return eottApproveTarnTime;
	}

	/**
	 * Set 批准运输时间
	 */
	public void setEottApproveTarnTime(Date eottApproveTarnTime) {
		this.eottApproveTarnTime = eottApproveTarnTime;
		addValidField("eottApproveTarnTime");
	}

	/**
	 * Get 押板结束时间
	 */
	@Column(name = "EOTT_TO_CHARGE_SHEET_TIME")
	public Date getEottToChargeSheetTime() {
		return eottToChargeSheetTime;
	}

	/**
	 * Set 押板结束时间
	 */
	public void setEottToChargeSheetTime(Date eottToChargeSheetTime) {
		this.eottToChargeSheetTime = eottToChargeSheetTime;
		addValidField("eottToChargeSheetTime");
	}

	/**
	 * Get 押板起算时间
	 */
	@Column(name = "EOTT_FROM_CHARGE_SHEET_TIME")
	public Date getEottFromChargeSheetTime() {
		return eottFromChargeSheetTime;
	}

	/**
	 * Set 押板起算时间
	 */
	public void setEottFromChargeSheetTime(Date eottFromChargeSheetTime) {
		this.eottFromChargeSheetTime = eottFromChargeSheetTime;
		addValidField("eottFromChargeSheetTime");
	}

	/**
	 * Get 押车结束时间
	 */
	@Column(name = "EOTT_TO_GUARD_TIME")
	public Date getEottToGuardTime() {
		return eottToGuardTime;
	}

	/**
	 * Set 押车结束时间
	 */
	public void setEottToGuardTime(Date eottToGuardTime) {
		this.eottToGuardTime = eottToGuardTime;
		addValidField("eottToGuardTime");
	}

	/**
	 * Get 押车起算时间
	 */
	@Column(name = "EOTT_FROM_GUARD_TIME")
	public Date getEottFromGuardTime() {
		return eottFromGuardTime;
	}

	/**
	 * Set 押车起算时间
	 */
	public void setEottFromGuardTime(Date eottFromGuardTime) {
		this.eottFromGuardTime = eottFromGuardTime;
		addValidField("eottFromGuardTime");
	}

	/**
	 * Get 是否调箱
	 */
	@Column(name = "EOTT_IS_TRANSFER")
	public String getEottIsTransfer() {
		return eottIsTransfer;
	}

	/**
	 * Set 是否调箱
	 */
	public void setEottIsTransfer(String eottIsTransfer) {
		this.eottIsTransfer = eottIsTransfer;
		addValidField("eottIsTransfer");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOTT_SUBSTR1")
	public String getEottSubstr1() {
		return eottSubstr1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEottSubstr1(String eottSubstr1) {
		this.eottSubstr1 = eottSubstr1;
		addValidField("eottSubstr1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOTT_SUBSTR2")
	public String getEottSubstr2() {
		return eottSubstr2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEottSubstr2(String eottSubstr2) {
		this.eottSubstr2 = eottSubstr2;
		addValidField("eottSubstr2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOTT_SUBSTR3")
	public String getEottSubstr3() {
		return eottSubstr3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEottSubstr3(String eottSubstr3) {
		this.eottSubstr3 = eottSubstr3;
		addValidField("eottSubstr3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOTT_SUBSTR4")
	public String getEottSubstr4() {
		return eottSubstr4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEottSubstr4(String eottSubstr4) {
		this.eottSubstr4 = eottSubstr4;
		addValidField("eottSubstr4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOTT_SUBSTR5")
	public String getEottSubstr5() {
		return eottSubstr5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEottSubstr5(String eottSubstr5) {
		this.eottSubstr5 = eottSubstr5;
		addValidField("eottSubstr5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOTT_SUBSTR6")
	public String getEottSubstr6() {
		return eottSubstr6;
	}

	/**
	 * Set 预留字段
	 */
	public void setEottSubstr6(String eottSubstr6) {
		this.eottSubstr6 = eottSubstr6;
		addValidField("eottSubstr6");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOTT_SUBSTR8")
	public String getEottSubstr8() {
		return eottSubstr8;
	}

	/**
	 * Set 预留字段
	 */
	public void setEottSubstr8(String eottSubstr8) {
		this.eottSubstr8 = eottSubstr8;
		addValidField("eottSubstr8");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOTT_SUBSTR7")
	public String getEottSubstr7() {
		return eottSubstr7;
	}

	/**
	 * Set 预留字段
	 */
	public void setEottSubstr7(String eottSubstr7) {
		this.eottSubstr7 = eottSubstr7;
		addValidField("eottSubstr7");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOTT_SUBDATE1")
	public Date getEottSubdate1() {
		return eottSubdate1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEottSubdate1(Date eottSubdate1) {
		this.eottSubdate1 = eottSubdate1;
		addValidField("eottSubdate1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOTT_SUBDATE2")
	public Date getEottSubdate2() {
		return eottSubdate2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEottSubdate2(Date eottSubdate2) {
		this.eottSubdate2 = eottSubdate2;
		addValidField("eottSubdate2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOTT_SUBDATE5")
	public Date getEottSubdate5() {
		return eottSubdate5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEottSubdate5(Date eottSubdate5) {
		this.eottSubdate5 = eottSubdate5;
		addValidField("eottSubdate5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOTT_SUBDATE4")
	public Date getEottSubdate4() {
		return eottSubdate4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEottSubdate4(Date eottSubdate4) {
		this.eottSubdate4 = eottSubdate4;
		addValidField("eottSubdate4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOTT_SUBDATE3")
	public Date getEottSubdate3() {
		return eottSubdate3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEottSubdate3(Date eottSubdate3) {
		this.eottSubdate3 = eottSubdate3;
		addValidField("eottSubdate3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOTT_SUBNUM3")
	public Integer getEottSubnum3() {
		return eottSubnum3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEottSubnum3(Integer eottSubnum3) {
		this.eottSubnum3 = eottSubnum3;
		addValidField("eottSubnum3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOTT_SUBNUM2")
	public Integer getEottSubnum2() {
		return eottSubnum2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEottSubnum2(Integer eottSubnum2) {
		this.eottSubnum2 = eottSubnum2;
		addValidField("eottSubnum2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOTT_SUBNUM1")
	public Integer getEottSubnum1() {
		return eottSubnum1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEottSubnum1(Integer eottSubnum1) {
		this.eottSubnum1 = eottSubnum1;
		addValidField("eottSubnum1");
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
	 * Get 提货车辆ID
	 */
	@Column(name = "EOTT_DELIVERY_ETVE_ID")
	public Integer getEottDeliveryEtveId() {
		return eottDeliveryEtveId;
	}

	/**
	 * Set 提货车辆ID
	 */
	public void setEottDeliveryEtveId(Integer eottDeliveryEtveId) {
		this.eottDeliveryEtveId = eottDeliveryEtveId;
		addValidField("eottDeliveryEtveId");
	}

	/**
	 * Get 提货车辆牌号
	 */
	@Column(name = "EOTT_DELIVERY_ETVE_CARD")
	public String getEottDeliveryEtveCard() {
		return eottDeliveryEtveCard;
	}

	/**
	 * Set 提货车辆牌号
	 */
	public void setEottDeliveryEtveCard(String eottDeliveryEtveCard) {
		this.eottDeliveryEtveCard = eottDeliveryEtveCard;
		addValidField("eottDeliveryEtveCard");
	}

	/**
	 * Get 送货承运人
	 */
	@Column(name = "EOTT_RECEIVE_EBCU_NAME_CN")
	public String getEottReceiveEbcuNameCn() {
		return eottReceiveEbcuNameCn;
	}

	/**
	 * Set 送货承运人
	 */
	public void setEottReceiveEbcuNameCn(String eottReceiveEbcuNameCn) {
		this.eottReceiveEbcuNameCn = eottReceiveEbcuNameCn;
		addValidField("eottReceiveEbcuNameCn");
	}

	/**
	 * Get 送货承运人ID
	 */
	@Column(name = "EOTT_RECEIVE_EBCU_ID")
	public Integer getEottReceiveEbcuId() {
		return eottReceiveEbcuId;
	}

	/**
	 * Set 送货承运人ID
	 */
	public void setEottReceiveEbcuId(Integer eottReceiveEbcuId) {
		this.eottReceiveEbcuId = eottReceiveEbcuId;
		addValidField("eottReceiveEbcuId");
	}

	/**
	 * Get 送货车辆ID
	 */
	@Column(name = "EOTT_RECEIVE_ETVE_ID")
	public Integer getEottReceiveEtveId() {
		return eottReceiveEtveId;
	}

	/**
	 * Set 送货车辆ID
	 */
	public void setEottReceiveEtveId(Integer eottReceiveEtveId) {
		this.eottReceiveEtveId = eottReceiveEtveId;
		addValidField("eottReceiveEtveId");
	}

	/**
	 * Get 送货车辆牌号
	 */
	@Column(name = "EOTT_RECEIVE_ETVE_CARD")
	public String getEottReceiveEtveCard() {
		return eottReceiveEtveCard;
	}

	/**
	 * Set 送货车辆牌号
	 */
	public void setEottReceiveEtveCard(String eottReceiveEtveCard) {
		this.eottReceiveEtveCard = eottReceiveEtveCard;
		addValidField("eottReceiveEtveCard");
	}

	/**
	 * @return the eottThirdPoundWeight
	 */
	@Column(name = "EOTT_THIRD_POUND_WEIGHT")
	public Double getEottThirdPoundWeight() {
		return eottThirdPoundWeight;
	}

	/**
	 * @param eottThirdPoundWeight the eottThirdPoundWeight to set
	 */
	public void setEottThirdPoundWeight(Double eottThirdPoundWeight) {
		this.eottThirdPoundWeight = eottThirdPoundWeight;
		addValidField("eottThirdPoundWeight");
	}

   
	/**
	 * Get 提货司磅员
	 */
	@Column(name = "EOTT_LOAD_PERSON")
	public String getEottLoadPerson() {
		return eottLoadPerson;
	}

	/**
	 * Set 提货司磅员
	 */
	public void setEottLoadPerson(String eottLoadPerson) {
		this.eottLoadPerson = eottLoadPerson;
		addValidField("eottLoadPerson");
	}
 
	/**
	 * Get 卸货司磅员
	 */
	@Column(name = "EOTT_UNLOAD_PERSON")
	public String getEottUnloadPerson() {
		return eottUnloadPerson;
	}

	/**
	 * Set 卸货司磅员
	 */
	public void setEottUnloadPerson(String eottUnloadPerson) {
		this.eottUnloadPerson = eottUnloadPerson;
		addValidField("eottUnloadPerson");
	}
 
	/**
	 * Get 第三方司磅员
	 */
	@Column(name = "EOTT_THIRD_PERSON")
	public String getEottThirdPerson() {
		return eottThirdPerson;
	}

	/**
	 * Set 第三方司磅员
	 */
	public void setEottThirdPerson(String eottThirdPerson) {
		this.eottThirdPerson = eottThirdPerson;
		addValidField("eottThirdPerson");
	}
 
	/**
	 * Get 提货过磅日期
	 */
	@Column(name = "EOTT_LOAD_DATE")
	public Date getEottLoadDate() {
		return eottLoadDate;
	}

	/**
	 * Set 提货过磅日期
	 */
	public void setEottLoadDate(Date eottLoadDate) {
		this.eottLoadDate = eottLoadDate;
		addValidField("eottLoadDate");
	}
 
	/**
	 * Get 卸货过磅日期
	 */
	@Column(name = "EOTT_UNLOAD_DATE")
	public Date getEottUnloadDate() {
		return eottUnloadDate;
	}

	/**
	 * Set 卸货过磅日期
	 */
	public void setEottUnloadDate(Date eottUnloadDate) {
		this.eottUnloadDate = eottUnloadDate;
		addValidField("eottUnloadDate");
	}
 
	/**
	 * Get 第三方过磅日期
	 */
	@Column(name = "EOTT_THIRD_DATE")
	public Date getEottThirdDate() {
		return eottThirdDate;
	}

	/**
	 * Set 第三方过磅日期
	 */
	public void setEottThirdDate(Date eottThirdDate) {
		this.eottThirdDate = eottThirdDate;
		addValidField("eottThirdDate");
	}
 
	/**
	 * Get 提货罐箱温度
	 */
	@Column(name = "EOTT_LOAD_TEMPERATURE")
	public String getEottLoadTemperature() {
		return eottLoadTemperature;
	}

	/**
	 * Set 提货罐箱温度
	 */
	public void setEottLoadTemperature(String eottLoadTemperature) {
		this.eottLoadTemperature = eottLoadTemperature;
		addValidField("eottLoadTemperature");
	}
 
	/**
	 * Get 卸货罐箱温度
	 */
	@Column(name = "EOTT_UNLOAD_TEMPERATURE")
	public String getEottUnloadTemperature() {
		return eottUnloadTemperature;
	}

	/**
	 * Set 卸货罐箱温度
	 */
	public void setEottUnloadTemperature(String eottUnloadTemperature) {
		this.eottUnloadTemperature = eottUnloadTemperature;
		addValidField("eottUnloadTemperature");
	}
 
	/**
	 * Get 第三方罐箱温度
	 */
	@Column(name = "EOTT_THIRD_TEMPERATURE")
	public String getEottThirdTemperature() {
		return eottThirdTemperature;
	}

	/**
	 * Set 第三方罐箱温度
	 */
	public void setEottThirdTemperature(String eottThirdTemperature) {
		this.eottThirdTemperature = eottThirdTemperature;
		addValidField("eottThirdTemperature");
	}
 
	/**
	 * Get 签收人
	 */
	@Column(name = "EOTT_RECEIPIENT")
	public String getEottReceipient() {
		return eottReceipient;
	}

	/**
	 * Set 签收人
	 */
	public void setEottReceipient(String eottReceipient) {
		this.eottReceipient = eottReceipient;
		addValidField("eottReceipient");
	}
	
	@Column(name = "EOTT_DELAY_SUPPLYCHAINID")
	public String getEottDelaySupplychainid() {
		return eottDelaySupplychainid;
	}
	
	
	/**
	 * 推迟原因5项组成
	 */
	public void setEottDelaySupplychainid(String eottDelaySupplychainid) {
		this.eottDelaySupplychainid = eottDelaySupplychainid;
		addValidField("eottDelaySupplychainid");
	}
	@Column(name = "EOTT_DELAY_CATEGORY")
	public String getEottDelayCategory() {
		return eottDelayCategory;
	}

	public void setEottDelayCategory(String eottDelayCategory) {
		this.eottDelayCategory = eottDelayCategory;
		addValidField("eottDelayCategory");
	}
	@Column(name = "EOTT_DELAY_ACCOUNTABILITY")
	public String getEottDelayAccountability() {
		return eottDelayAccountability;
	}

	public void setEottDelayAccountability(String eottDelayAccountability) {
		this.eottDelayAccountability = eottDelayAccountability;
		addValidField("eottDelayAccountability");
	}
	@Column(name = "EOTT_DELAY_CAUSE")
	public String getEottDelayCause() {
		return eottDelayCause;
	}

	public void setEottDelayCause(String eottDelayCause) {
		this.eottDelayCause = eottDelayCause;
		addValidField("eottDelayCause");
	}
	@Column(name = "EOTT_DELAY_REMARK")
	public String getEottDelayRemark() {
		return eottDelayRemark;
	}

	public void setEottDelayRemark(String eottDelayRemark) {
		this.eottDelayRemark = eottDelayRemark;
		addValidField("eottDelayRemark");
	}
	@Column(name = "EOTT_VARY_MARK")
	public String getEottVaryMark() {
		return eottVaryMark;
	}
	
	public void setEottVaryMark(String eottVaryMark) {
		this.eottVaryMark = eottVaryMark;
		addValidField("eottVaryMark");
	}

	@Column(name = "EOTT_ACTUAL_DELIVERY_ADS")
	public String getEottActualDeliveryAds() {
		return eottActualDeliveryAds;
	}

	public void setEottActualDeliveryAds(String eottActualDeliveryAds) {
		this.eottActualDeliveryAds = eottActualDeliveryAds;
		addValidField("eottActualDeliveryAds");
	}

	@Column(name = "EOTT_DELIVERY_LATITUDE")
	public String getEottDeliveryLatitude() {
		return eottDeliveryLatitude;
	}

	public void setEottDeliveryLatitude(String eottDeliveryLatitude) {
		this.eottDeliveryLatitude = eottDeliveryLatitude;
		addValidField("eottDeliveryLatitude");
	}

	@Column(name = "EOTT_DELIVERY_LONGITUDE")
	public String getEottDeliveryLongitude() {
		return eottDeliveryLongitude;
	}

	public void setEottDeliveryLongitude(String eottDeliveryLongitude) {
		this.eottDeliveryLongitude = eottDeliveryLongitude;
		addValidField("eottDeliveryLongitude");
	}

	@Column(name = "EOTT_ACTUAL_ARRIVAL_ADS")
	public String getEottActualArrivalAds() {
		return eottActualArrivalAds;
	}

	public void setEottActualArrivalAds(String eottActualArrivalAds) {
		this.eottActualArrivalAds = eottActualArrivalAds;
		addValidField("eottActualArrivalAds");
	}

	@Column(name = "EOTT_ARRIVAL_LATITUDE")
	public String getEottArrivalLatitude() {
		return eottArrivalLatitude;
	}

	public void setEottArrivalLatitude(String eottArrivalLatitude) {
		this.eottArrivalLatitude = eottArrivalLatitude;
		addValidField("eottArrivalLatitude");
	}

	@Column(name = "EOTT_ARRIVAL_LONGITUDE")
	public String getEottArrivalLongitude() {
		return eottArrivalLongitude;
	}

	public void setEottArrivalLongitude(String eottArrivalLongitude) {
		this.eottArrivalLongitude = eottArrivalLongitude;
		addValidField("eottArrivalLongitude");
	}
}