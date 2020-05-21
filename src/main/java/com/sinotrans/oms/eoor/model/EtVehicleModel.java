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
@Table(name = "ET_VEHICLE")
public class EtVehicleModel extends BaseModel implements OperationLog {
	//车辆表主键
		private Integer etveId;
		//所属平台
		private Integer etveEscoId;
		//调度基地
		private Integer etveEsstId;
		//承运商
		private Integer etveEbcuId;
		//车牌号
		private String etveCard;
		//车辆品牌
		private String etveVariety;
		//车辆分类:1牵引车
		private String etveClass;
		//车辆类型:数据字典
		private String etveType;
		//是否温控车
		private String etveIsTemperature;
		//车辆资质:数据字典
		private String etveAptitude;
		//车辆型号
		private String etveModel;
		//车架号
		private String etveFrameNumber;
		//车辆状态:数据字典
		private String etveStatus;
		//车身号码
		private String etveBodyNo;
		//发动机号码
		private String etveEngineNo;
		//马力
		private Double etvePower;
		//轴数
		private Integer etveAxilAmount;
		//外框尺寸长
		private Double etveFrameLength;
		//外框尺寸宽
		private Double etveFrameWeight;
		//外框尺寸高
		private Double etveFrameHeight;
		//车厢容积长
		private Double etveLength;
		//车厢容积宽
		private Double etveWeight;
		//车厢容积高
		private Double etveHeight;
		//整备质量(吨)
		private Double etveKerbMass;
		//牵引车牵引总质量(吨)
		private Double etveMass;
		//挂车额定载重量
		private Double etveLimitLoadWeight;
		//营运证号
		private String etveWorkingNo;
		//营运证有效期
		private Date etveWorkingExpirationDate;
		//行驶证号
		private String etveDrivingNo;
		//行驶证有效期
		private Date etveDrivingExpirationDate;
		//购车地点
		private String etveBoughtPlace;
		//购车时间
		private Date etveBoughtTime;
		//购车金额
		private Double etveBoughtAmount;
		//注册地点
		private String etveRegisterPlace;
		//注册登记时间
		private Date etveRegisterTime;
		//标准百公里油耗
		private Double etveStandardFuel;
		//车辆排放标准
		private String etveEmissionStandard;
		//车辆折旧年限
		private Integer etveDepreciationLife;
		//车辆报废年限
		private Integer etveScrapLife;
		//车辆启用时间
		private Date etveUsedTime;
		//车辆报废时间
		private Date etveScrapTime;
		//行车里程
		private Double etveRunMileage;
		//顶灯牌号
		private String etveUpLightNo;
		//顶灯到期日期
		private Date etveUpLightDate;
		//残值率
		private Double etveResidualDate;
		//通行费缴纳时间
		private Date etveTollDate;
		//默认挂车
		private Integer etveEtveIdG;
		//默认挂车车牌号
		private String etveDefaultTrailerCard;
		//默认主驾
		private Integer etveEttpIdM;
		//默认副驾
		private Integer etveEttpIdA;
		//默认集装箱
		private Integer etveDefaultContainer;
		//默认箱号
		private String etveDefaultContainerNo;
		//所有权:数据字典
		private String etveSupplierType;
		//危险品等级:如1.2
		private String etveClasses;
		//时间戳
		private Integer recVer;
		//修改时间
		private Date modifyTime;
		//修改人
		private String modifier;
		//创建时间
		private Date createTime;
		//创建人
		private String creator;
		//车辆拥有的资质名称列表
		private String etveCertificationNameList;
	    //供应商
		private Integer etveSupplierId;
		
		//20100604增加
		//预计可用时间
		private Double etveUsablePlan;

		//备注
		private String etveDesc;

		//默认主驾
		private Integer etveEttpIdCurr;

		// 默认挂车
		private Integer etveEtveIdCurr;

		//默认挂车车牌号
		private String etveEtveIdCurrCard;

		//调度人ID
		private Integer etveAttemperId;
		//调度人名称
		private String etveAttemperName;
		//车辆所属基地
		private Integer etveOwnEsstId;
		
		//车辆所属基地
		private Double etveEmptyFuel;
		
		//牵引车SIM卡号
		private String etveSimNo;
		
		//燃料类型
		private String etveFuelType;
		//车型代码（用于杉数调度）
		private String etveCode;
		//车型地图限行分组（用于杉数调度）
		private String etveRestrictionGroup;
		//最大体积（用于杉数调度）
		private Integer etveMaxLoadvolume;
		//最大载重（用于杉数调度）
		private Integer etveMaxLoadweight;
		//车型ID（用于杉数调度）
		private Integer etveEtvmId;
		
		@Column(name="ETVE_SIM_NO")
		public String getEtveSimNo() {
			return etveSimNo;
		}

		public void setEtveSimNo(String etveSimNo) {
			this.etveSimNo = etveSimNo;
			addValidField("etveSimNo");
		}

		/**
		 * Get 供应商
		 */
		@Column(name="ETVE_SUPPLIER_ID")
		public Integer getEtveSupplierId() {
			return etveSupplierId;
		}

		/**
		 * Set供应商
		 */
		public void setEtveSupplierId(Integer etveSupplierId) {
			this.etveSupplierId = etveSupplierId;
			addValidField("etveSupplierId");
		}

		/**
		 * Get 车辆表主键
		 */
		@Column(name = "ETVE_ID")
		@Id @GeneratedValue(strategy=GenerationType.AUTO)
		public Integer getEtveId() {
			return etveId;
		}

		/**
		 * Set 车辆表主键
		 */
		public void setEtveId(Integer etveId) {
			this.etveId = etveId;
			addValidField("etveId");
		}

		/**
		 * Get 所属供方
		 * 关联公司表
		 */
		@Column(name = "ETVE_ESCO_ID")
		public Integer getEtveEscoId() {
			return etveEscoId;
		}

		/**
		 * Set 所属供方
		 * 关联公司表
		 */
		public void setEtveEscoId(Integer etveEscoId) {
			this.etveEscoId = etveEscoId;
			addValidField("etveEscoId");
		}

		/**
		 * Get 调度基地
		 * 关联基地表
		 */
		@Column(name = "ETVE_ESST_ID")
		public Integer getEtveEsstId() {
			return etveEsstId;
		}

		/**
		 * Set 调度基地
		 * 关联基地表
		 */
		public void setEtveEsstId(Integer etveEsstId) {
			this.etveEsstId = etveEsstId;
			addValidField("etveEsstId");
		}

		/**
		 * Get 承运商
		 * 关联公司表
		 */
		@Column(name = "ETVE_EBCU_ID")
		public Integer getEtveEbcuId() {
			return etveEbcuId;
		}

		/**
		 * Set 承运商
		 * 关联公司表
		 */
		public void setEtveEbcuId(Integer etveEbcuId) {
			this.etveEbcuId = etveEbcuId;
			addValidField("etveEbcuId");
		}

		/**
		 * Get 车牌号
		 */
		@Column(name = "ETVE_CARD")
		public String getEtveCard() {
			return etveCard;
		}

		/**
		 * Set 车牌号
		 */
		public void setEtveCard(String etveCard) {
			this.etveCard = etveCard;
			addValidField("etveCard");
		}

		/**
		 * Get 车辆品牌
		 */
		@Column(name = "ETVE_VARIETY")
		public String getEtveVariety() {
			return etveVariety;
		}

		/**
		 * Set 车辆品牌
		 */
		public void setEtveVariety(String etveVariety) {
			this.etveVariety = etveVariety;
			addValidField("etveVariety");
		}

		/**
		 * Get 车辆分类:1牵引车
		 * 2挂车
		 * 3其他类型车辆
		 */
		@Column(name = "ETVE_CLASS")
		public String getEtveClass() {
			return etveClass;
		}

		/**
		 * Set 车辆分类:1牵引车
		 * 2挂车
		 * 3其他类型车辆
		 */
		public void setEtveClass(String etveClass) {
			this.etveClass = etveClass;
			addValidField("etveClass");
		}

		/**
		 * Get 车辆类型:数据字典
		 * 1重型普通货车
		 * 2轻型普通货车
		 */
		@Column(name = "ETVE_TYPE")
		public String getEtveType() {
			return etveType;
		}

		/**
		 * Set 车辆类型:数据字典
		 * 1重型普通货车
		 * 2轻型普通货车
		 */
		public void setEtveType(String etveType) {
			this.etveType = etveType;
			addValidField("etveType");
		}

		/**
		 * Get 是否温控车
		 */
		@Column(name = "ETVE_IS_TEMPERATURE")
		public String getEtveIsTemperature() {
			return etveIsTemperature;
		}

		/**
		 * Set 是否温控车
		 */
		public void setEtveIsTemperature(String etveIsTemperature) {
			this.etveIsTemperature = etveIsTemperature;
			addValidField("etveIsTemperature");
		}

		/**
		 * Get 车辆资质:数据字典
		 * 1非危险品
		 * 2危险品
		 * 3剧毒品
		 */
		@Column(name = "ETVE_APTITUDE")
		public String getEtveAptitude() {
			return etveAptitude;
		}

		/**
		 * Set 车辆资质:数据字典
		 * 1非危险品
		 * 2危险品
		 * 3剧毒品
		 */
		public void setEtveAptitude(String etveAptitude) {
			this.etveAptitude = etveAptitude;
			addValidField("etveAptitude");
		}

		/**
		 * Get 车辆型号
		 */
		@Column(name = "ETVE_MODEL")
		public String getEtveModel() {
			return etveModel;
		}

		/**
		 * Set 车辆型号
		 */
		public void setEtveModel(String etveModel) {
			this.etveModel = etveModel;
			addValidField("etveModel");
		}

		/**
		 * Get 车架号
		 */
		@Column(name = "ETVE_FRAME_NUMBER")
		public String getEtveFrameNumber() {
			return etveFrameNumber;
		}

		/**
		 * Set 车架号
		 */
		public void setEtveFrameNumber(String etveFrameNumber) {
			this.etveFrameNumber = etveFrameNumber;
			addValidField("etveFrameNumber");
		}

		/**
		 * Get 车辆状态:数据字典
		 */
		@Column(name = "ETVE_STATUS")
		public String getEtveStatus() {
			return etveStatus;
		}

		/**
		 * Set 车辆状态:数据字典
		 */
		public void setEtveStatus(String etveStatus) {
			this.etveStatus = etveStatus;
			addValidField("etveStatus");
		}

		/**
		 * Get 车身号码
		 */
		@Column(name = "ETVE_BODY_NO")
		public String getEtveBodyNo() {
			return etveBodyNo;
		}

		/**
		 * Set 车身号码
		 */
		public void setEtveBodyNo(String etveBodyNo) {
			this.etveBodyNo = etveBodyNo;
			addValidField("etveBodyNo");
		}

		/**
		 * Get 发动机号码
		 */
		@Column(name = "ETVE_ENGINE_NO")
		public String getEtveEngineNo() {
			return etveEngineNo;
		}

		/**
		 * Set 发动机号码
		 */
		public void setEtveEngineNo(String etveEngineNo) {
			this.etveEngineNo = etveEngineNo;
			addValidField("etveEngineNo");
		}

		/**
		 * Get 马力
		 */
		@Column(name = "ETVE_POWER")
		public Double getEtvePower() {
			return etvePower;
		}

		/**
		 * Set 马力
		 */
		public void setEtvePower(Double etvePower) {
			this.etvePower = etvePower;
			addValidField("etvePower");
		}

		/**
		 * Get 轴数
		 */
		@Column(name = "ETVE_AXIL_AMOUNT")
		public Integer getEtveAxilAmount() {
			return etveAxilAmount;
		}

		/**
		 * Set 轴数
		 */
		public void setEtveAxilAmount(Integer etveAxilAmount) {
			this.etveAxilAmount = etveAxilAmount;
			addValidField("etveAxilAmount");
		}

		/**
		 * Get 外框尺寸长
		 */
		@Column(name = "ETVE_FRAME_LENGTH")
		public Double getEtveFrameLength() {
			return etveFrameLength;
		}

		/**
		 * Set 外框尺寸长
		 */
		public void setEtveFrameLength(Double etveFrameLength) {
			this.etveFrameLength = etveFrameLength;
			addValidField("etveFrameLength");
		}

		/**
		 * Get 外框尺寸宽
		 */
		@Column(name = "ETVE_FRAME_WEIGHT")
		public Double getEtveFrameWeight() {
			return etveFrameWeight;
		}

		/**
		 * Set 外框尺寸宽
		 */
		public void setEtveFrameWeight(Double etveFrameWeight) {
			this.etveFrameWeight = etveFrameWeight;
			addValidField("etveFrameWeight");
		}

		/**
		 * Get 外框尺寸高
		 */
		@Column(name = "ETVE_FRAME_HEIGHT")
		public Double getEtveFrameHeight() {
			return etveFrameHeight;
		}

		/**
		 * Set 外框尺寸高
		 */
		public void setEtveFrameHeight(Double etveFrameHeight) {
			this.etveFrameHeight = etveFrameHeight;
			addValidField("etveFrameHeight");
		}

		/**
		 * Get 车厢容积长
		 */
		@Column(name = "ETVE_LENGTH")
		public Double getEtveLength() {
			return etveLength;
		}

		/**
		 * Set 车厢容积长
		 */
		public void setEtveLength(Double etveLength) {
			this.etveLength = etveLength;
			addValidField("etveLength");
		}

		/**
		 *Get 车厢容积宽
		 */
		@Column(name = "ETVE_WEIGHT")
		public Double getEtveWeight(){
			return etveWeight;
		}
		/**
		 *Set 车厢容积宽
		 */
		public void setEtveWeight(Double etveWeight){
			this.etveWeight=etveWeight;
			addValidField("etveWeight");
		}
		/**
		 *Get 车厢容积高
		 */
		@Column(name = "ETVE_HEIGHT")
		public Double getEtveHeight(){
			return etveHeight;
		}
		/**
		 *Set 车厢容积高
		 */
		public void setEtveHeight(Double etveHeight){
			this.etveHeight=etveHeight;
			addValidField("etveHeight");
		}


		/**
		 * Get 整备质量(吨)
		 */
		@Column(name = "ETVE_KERB_MASS")
		public Double getEtveKerbMass() {
			return etveKerbMass;
		}

		/**
		 * Set 整备质量(吨)
		 */
		public void setEtveKerbMass(Double etveKerbMass) {
			this.etveKerbMass = etveKerbMass;
			addValidField("etveKerbMass");
		}

		/**
		 * Get 牵引车牵引总质量(吨)
		 */
		@Column(name = "ETVE_MASS")
		public Double getEtveMass() {
			return etveMass;
		}

		/**
		 * Set 牵引车牵引总质量(吨)
		 */
		public void setEtveMass(Double etveMass) {
			this.etveMass = etveMass;
			addValidField("etveMass");
		}

		/**
		 * Get 挂车额定载重量
		 */
		@Column(name = "ETVE_LIMIT_LOAD_WEIGHT")
		public Double getEtveLimitLoadWeight() {
			return etveLimitLoadWeight;
		}

		/**
		 * Set 挂车额定载重量
		 */
		public void setEtveLimitLoadWeight(Double etveLimitLoadWeight) {
			this.etveLimitLoadWeight = etveLimitLoadWeight;
			addValidField("etveLimitLoadWeight");
		}

		/**
		 * Get 营运证号
		 */
		@Column(name = "ETVE_WORKING_NO")
		public String getEtveWorkingNo() {
			return etveWorkingNo;
		}

		/**
		 * Set 营运证号
		 */
		public void setEtveWorkingNo(String etveWorkingNo) {
			this.etveWorkingNo = etveWorkingNo;
			addValidField("etveWorkingNo");
		}

		/**
		 * Get 营运证有效期
		 */
		@Column(name = "ETVE_WORKING_EXPIRATION_DATE")
		public Date getEtveWorkingExpirationDate() {
			return etveWorkingExpirationDate;
		}

		/**
		 * Set 营运证有效期
		 */
		public void setEtveWorkingExpirationDate(Date etveWorkingExpirationDate) {
			this.etveWorkingExpirationDate = etveWorkingExpirationDate;
			addValidField("etveWorkingExpirationDate");
		}

		/**
		 * Get 行驶证号
		 */
		@Column(name = "ETVE_DRIVING_NO")
		public String getEtveDrivingNo() {
			return etveDrivingNo;
		}

		/**
		 * Set 行驶证号
		 */
		public void setEtveDrivingNo(String etveDrivingNo) {
			this.etveDrivingNo = etveDrivingNo;
			addValidField("etveDrivingNo");
		}

		/**
		 * Get 行驶证有效期
		 */
		@Column(name = "ETVE_DRIVING_EXPIRATION_DATE")
		public Date getEtveDrivingExpirationDate() {
			return etveDrivingExpirationDate;
		}

		/**
		 * Set 行驶证有效期
		 */
		public void setEtveDrivingExpirationDate(Date etveDrivingExpirationDate) {
			this.etveDrivingExpirationDate = etveDrivingExpirationDate;
			addValidField("etveDrivingExpirationDate");
		}

		/**
		 * Get 购车地点
		 */
		@Column(name = "ETVE_BOUGHT_PLACE")
		public String getEtveBoughtPlace() {
			return etveBoughtPlace;
		}

		/**
		 * Set 购车地点
		 */
		public void setEtveBoughtPlace(String etveBoughtPlace) {
			this.etveBoughtPlace = etveBoughtPlace;
			addValidField("etveBoughtPlace");
		}

		/**
		 * Get 购车时间
		 */
		@Column(name = "ETVE_BOUGHT_TIME")
		public Date getEtveBoughtTime() {
			return etveBoughtTime;
		}

		/**
		 * Set 购车时间
		 */
		public void setEtveBoughtTime(Date etveBoughtTime) {
			this.etveBoughtTime = etveBoughtTime;
			addValidField("etveBoughtTime");
		}

		/**
		 * Get 购车金额
		 */
		@Column(name = "ETVE_BOUGHT_AMOUNT")
		public Double getEtveBoughtAmount() {
			return etveBoughtAmount;
		}

		/**
		 * Set 购车金额
		 */
		public void setEtveBoughtAmount(Double etveBoughtAmount) {
			this.etveBoughtAmount = etveBoughtAmount;
			addValidField("etveBoughtAmount");
		}

		/**
		 * Get 注册地点
		 */
		@Column(name = "ETVE_REGISTER_PLACE")
		public String getEtveRegisterPlace() {
			return etveRegisterPlace;
		}

		/**
		 * Set 注册地点
		 */
		public void setEtveRegisterPlace(String etveRegisterPlace) {
			this.etveRegisterPlace = etveRegisterPlace;
			addValidField("etveRegisterPlace");
		}

		/**
		 * Get 注册登记时间
		 */
		@Column(name = "ETVE_REGISTER_TIME")
		public Date getEtveRegisterTime() {
			return etveRegisterTime;
		}

		/**
		 * Set 注册登记时间
		 */
		public void setEtveRegisterTime(Date etveRegisterTime) {
			this.etveRegisterTime = etveRegisterTime;
			addValidField("etveRegisterTime");
		}

		/**
		 * Get 标准百公里油耗
		 */
		@Column(name = "ETVE_STANDARD_FUEL")
		public Double getEtveStandardFuel() {
			return etveStandardFuel;
		}

		/**
		 * Set 标准百公里油耗
		 */
		public void setEtveStandardFuel(Double etveStandardFuel) {
			this.etveStandardFuel = etveStandardFuel;
			addValidField("etveStandardFuel");
		}

		/**
		 * Get 车辆排放标准
		 */
		@Column(name = "ETVE_EMISSION_STANDARD")
		public String getEtveEmissionStandard() {
			return etveEmissionStandard;
		}

		/**
		 * Set 车辆排放标准
		 */
		public void setEtveEmissionStandard(String etveEmissionStandard) {
			this.etveEmissionStandard = etveEmissionStandard;
			addValidField("etveEmissionStandard");
		}

		/**
		 * Get 车辆折旧年限
		 */
		@Column(name = "ETVE_DEPRECIATION_LIFE")
		public Integer getEtveDepreciationLife() {
			return etveDepreciationLife;
		}

		/**
		 * Set 车辆折旧年限
		 */
		public void setEtveDepreciationLife(Integer etveDepreciationLife) {
			this.etveDepreciationLife = etveDepreciationLife;
			addValidField("etveDepreciationLife");
		}

		/**
		 * Get 车辆报废年限
		 */
		@Column(name = "ETVE_SCRAP_LIFE")
		public Integer getEtveScrapLife() {
			return etveScrapLife;
		}

		/**
		 * Set 车辆报废年限
		 */
		public void setEtveScrapLife(Integer etveScrapLife) {
			this.etveScrapLife = etveScrapLife;
			addValidField("etveScrapLife");
		}

		/**
		 * Get 车辆启用时间
		 */
		@Column(name = "ETVE_USED_TIME")
		public Date getEtveUsedTime() {
			return etveUsedTime;
		}

		/**
		 * Set 车辆启用时间
		 */
		public void setEtveUsedTime(Date etveUsedTime) {
			this.etveUsedTime = etveUsedTime;
			addValidField("etveUsedTime");
		}

		/**
		 * Get 车辆报废时间
		 */
		@Column(name = "ETVE_SCRAP_TIME")
		public Date getEtveScrapTime() {
			return etveScrapTime;
		}

		/**
		 * Set 车辆报废时间
		 */
		public void setEtveScrapTime(Date etveScrapTime) {
			this.etveScrapTime = etveScrapTime;
			addValidField("etveScrapTime");
		}

		/**
		 * Get 行车里程
		 */
		@Column(name = "ETVE_RUN_MILEAGE")
		public Double getEtveRunMileage() {
			return etveRunMileage;
		}

		/**
		 * Set 行车里程
		 */
		public void setEtveRunMileage(Double etveRunMileage) {
			this.etveRunMileage = etveRunMileage;
			addValidField("etveRunMileage");
		}

		/**
		 * Get 顶灯牌号
		 */
		@Column(name = "ETVE_UP_LIGHT_NO")
		public String getEtveUpLightNo() {
			return etveUpLightNo;
		}

		/**
		 * Set 顶灯牌号
		 */
		public void setEtveUpLightNo(String etveUpLightNo) {
			this.etveUpLightNo = etveUpLightNo;
			addValidField("etveUpLightNo");
		}

		/**
		 * Get 顶灯到期日期
		 */
		@Column(name = "ETVE_UP_LIGHT_DATE")
		public Date getEtveUpLightDate() {
			return etveUpLightDate;
		}

		/**
		 * Set 顶灯到期日期
		 */
		public void setEtveUpLightDate(Date etveUpLightDate) {
			this.etveUpLightDate = etveUpLightDate;
			addValidField("etveUpLightDate");
		}

		/**
		 * Get 残值率
		 * 最后可卖的结果
		 */
		@Column(name = "ETVE_RESIDUAL_DATE")
		public Double getEtveResidualDate() {
			return etveResidualDate;
		}

		/**
		 * Set 残值率
		 * 最后可卖的结果
		 */
		public void setEtveResidualDate(Double etveResidualDate) {
			this.etveResidualDate = etveResidualDate;
			addValidField("etveResidualDate");
		}

		/**
		 * Get 通行费缴纳时间
		 */
		@Column(name = "ETVE_TOLL_DATE")
		public Date getEtveTollDate() {
			return etveTollDate;
		}

		/**
		 * Set 通行费缴纳时间
		 */
		public void setEtveTollDate(Date etveTollDate) {
			this.etveTollDate = etveTollDate;
			addValidField("etveTollDate");
		}

		/**
		 * Get 默认挂车
		 * 关联车辆表
		 */
		@Column(name = "ETVE_ETVE_ID_G")
		public Integer getEtveEtveIdG() {
			return etveEtveIdG;
		}

		/**
		 * Set 默认挂车
		 * 关联车辆表
		 */
		public void setEtveEtveIdG(Integer etveEtveIdG) {
			this.etveEtveIdG = etveEtveIdG;
			addValidField("etveEtveIdG");
		}

		/**
		 * Get 默认挂车车牌号
		 */
		@Column(name = "ETVE_DEFAULT_TRAILER_CARD")
		public String getEtveDefaultTrailerCard() {
			return etveDefaultTrailerCard;
		}

		/**
		 * Set 默认挂车车牌号
		 */
		public void setEtveDefaultTrailerCard(String etveDefaultTrailerCard) {
			this.etveDefaultTrailerCard = etveDefaultTrailerCard;
			addValidField("etveDefaultTrailerCard");
		}

		/**
		 * Get 默认主驾
		 * 关联运输人员表
		 */
		@Column(name = "ETVE_ETTP_ID_M")
		public Integer getEtveEttpIdM() {
			return etveEttpIdM;
		}

		/**
		 * Set 默认主驾
		 * 关联运输人员表
		 */
		public void setEtveEttpIdM(Integer etveEttpIdM) {
			this.etveEttpIdM = etveEttpIdM;
			addValidField("etveEttpIdM");
		}

		/**
		 * Get 默认副驾
		 * 关联运输人员表
		 */
		@Column(name = "ETVE_ETTP_ID_A")
		public Integer getEtveEttpIdA() {
			return etveEttpIdA;
		}

		/**
		 * Set 默认副驾
		 * 关联运输人员表
		 */
		public void setEtveEttpIdA(Integer etveEttpIdA) {
			this.etveEttpIdA = etveEttpIdA;
			addValidField("etveEttpIdA");
		}

		/**
		 * Get 默认集装箱
		 * 关联集装箱表
		 */
		@Column(name = "ETVE_DEFAULT_CONTAINER")
		public Integer getEtveDefaultContainer() {
			return etveDefaultContainer;
		}

		/**
		 * Set 默认集装箱
		 * 关联集装箱表
		 */
		public void setEtveDefaultContainer(Integer etveDefaultContainer) {
			this.etveDefaultContainer = etveDefaultContainer;
			addValidField("etveDefaultContainer");
		}

		/**
		 * Get 默认箱号
		 */
		@Column(name = "ETVE_DEFAULT_CONTAINER_NO")
		public String getEtveDefaultContainerNo() {
			return etveDefaultContainerNo;
		}

		/**
		 * Set 默认箱号
		 */
		public void setEtveDefaultContainerNo(String etveDefaultContainerNo) {
			this.etveDefaultContainerNo = etveDefaultContainerNo;
			addValidField("etveDefaultContainerNo");
		}

		/**
		 * Get 所有权:数据字典
		 * 1自有
		 * 2租赁
		 * 3供方
		 */
		@Column(name = "ETVE_SUPPLIER_TYPE")
		public String getEtveSupplierType() {
			return etveSupplierType;
		}

		/**
		 * Set 所有权:数据字典
		 * 1自有
		 * 2租赁
		 * 3供方
		 */
		public void setEtveSupplierType(String etveSupplierType) {
			this.etveSupplierType = etveSupplierType;
			addValidField("etveSupplierType");
		}

		/**
		 * Get 危险品等级:如1.2
		 * 1.3
		 */
		@Column(name = "ETVE_CLASSES")
		public String getEtveClasses() {
			return etveClasses;
		}

		/**
		 * Set 危险品等级:如1.2
		 * 1.3
		 */
		public void setEtveClasses(String etveClasses) {
			this.etveClasses = etveClasses;
			addValidField("etveClasses");
		}

		/**
		 * Get 时间戳
		 */
		@Column(name = "REC_VER")
		@Version
		public Integer getRecVer() {
			return recVer;
		}

		/**
		 * Set 时间戳
		 */
		public void setRecVer(Integer recVer) {
			this.recVer = recVer;
			addValidField("recVer");
		}

		/**
		 * Get 修改时间
		 */
		@Column(name = "MODIFY_TIME")
		public Date getModifyTime() {
			return modifyTime;
		}

		/**
		 * Set 修改时间
		 */
		public void setModifyTime(Date modifyTime) {
			this.modifyTime = modifyTime;
			addValidField("modifyTime");
		}

		/**
		 * Get 修改人
		 */
		@Column(name = "MODIFIER")
		public String getModifier() {
			return modifier;
		}

		/**
		 * Set 修改人
		 */
		public void setModifier(String modifier) {
			this.modifier = modifier;
			addValidField("modifier");
		}

		/**
		 * Get 创建时间
		 */
		@Column(name = "CREATE_TIME")
		public Date getCreateTime() {
			return createTime;
		}

		/**
		 * Set 创建时间
		 */
		public void setCreateTime(Date createTime) {
			this.createTime = createTime;
			addValidField("createTime");
		}

		/**
		 * Get 创建人
		 */
		@Column(name = "CREATOR")
		public String getCreator() {
			return creator;
		}

		/**
		 * Set 创建人
		 */
		public void setCreator(String creator) {
			this.creator = creator;
			addValidField("creator");
		}

		@Column(name = "ETVE_CERTIFICATION_NAME_LIST")
		public String getEtveCertificationNameList() {
			return etveCertificationNameList;
		}

		public void setEtveCertificationNameList(String etveCertificationNameList) {
			this.etveCertificationNameList = etveCertificationNameList;
			addValidField("etveCertificationNameList");
		}

		/**
		 * @return the etveUsablePlan
		 */
		@Column(name = "ETVE_USABLE_PLAN")
		public Double getEtveUsablePlan() {
			return etveUsablePlan;
		}

		/**
		 * @return the etveDesc
		 */
		@Column(name = "ETVE_DESC")
		public String getEtveDesc() {
			return etveDesc;
		}

		/**
		 * @return the etveEttpIdCurr
		 */
		@Column(name = "ETVE_ETTP_ID_CURR")
		public Integer getEtveEttpIdCurr() {
			return etveEttpIdCurr;
		}

		/**
		 * @return the etveEtveIdCurr
		 */
		@Column(name = "ETVE_ETVE_ID_CURR")
		public Integer getEtveEtveIdCurr() {
			return etveEtveIdCurr;
		}

		/**
		 * @return the etveEtveIdCurrCard
		 */
		@Column(name = "ETVE_ETVE_ID_CURR_CARD")
		public String getEtveEtveIdCurrCard() {
			return etveEtveIdCurrCard;
		}

		/**
		 * @return the etveAttemperId
		 */
		@Column(name = "ETVE_ATTEMPER_ID")
		public Integer getEtveAttemperId() {
			return etveAttemperId;
		}

		/**
		 * @return the etveAttemperName
		 */
		@Column(name = "ETVE_ATTEMPER_NAME")
		public String getEtveAttemperName() {
			return etveAttemperName;
		}

		/**
		 * @param etveUsablePlan the etveUsablePlan to set
		 */
		public void setEtveUsablePlan(Double etveUsablePlan) {
			this.etveUsablePlan = etveUsablePlan;
			addValidField("etveUsablePlan");
		}

		/**
		 * @param etveDesc the etveDesc to set
		 */
		public void setEtveDesc(String etveDesc) {
			this.etveDesc = etveDesc;
			addValidField("etveDesc");
		}

		/**
		 * @param etveEttpIdCurr the etveEttpIdCurr to set
		 */
		public void setEtveEttpIdCurr(Integer etveEttpIdCurr) {
			this.etveEttpIdCurr = etveEttpIdCurr;
			addValidField("etveEttpIdCurr");
		}

		/**
		 * @param etveEtveIdCurr the etveEtveIdCurr to set
		 */
		public void setEtveEtveIdCurr(Integer etveEtveIdCurr) {
			this.etveEtveIdCurr = etveEtveIdCurr;
			addValidField("etveEtveIdCurr");
		}

		/**
		 * @param etveEtveIdCurrCard the etveEtveIdCurrCard to set
		 */
		public void setEtveEtveIdCurrCard(String etveEtveIdCurrCard) {
			this.etveEtveIdCurrCard = etveEtveIdCurrCard;
			addValidField("etveEtveIdCurrCard");
		}

		/**
		 * @param etveAttemperId the etveAttemperId to set
		 */
		public void setEtveAttemperId(Integer etveAttemperId) {
			this.etveAttemperId = etveAttemperId;
			addValidField("etveAttemperId");
		}

		/**
		 * @param etveAttemperName the etveAttemperName to set
		 */
		public void setEtveAttemperName(String etveAttemperName) {
			this.etveAttemperName = etveAttemperName;
			addValidField("etveAttemperName");
		}
		/**
		 * Get 车辆所属基地
		 */
		@Column(name = "ETVE_OWN_ESST_ID")
		public Integer getEtveOwnEsstId() {
			return etveOwnEsstId;
		}

		/**
		 * Set 车辆所属基地
		 */
		public void setEtveOwnEsstId(Integer etveOwnEsstId) {
			this.etveOwnEsstId = etveOwnEsstId;
			addValidField("etveOwnEsstId");
		}
		@Column(name = "ETVE_EMPTY_FUEL")
		public Double getEtveEmptyFuel() {
			return etveEmptyFuel;
		}

		public void setEtveEmptyFuel(Double etveEmptyFuel) {
			this.etveEmptyFuel = etveEmptyFuel;
			addValidField("etveEmptyFuel");
		}
		
		@Column(name = "ETVE_FUEL_TYPE")
		public String getEtveFuelType() {
			return etveFuelType;
		}

		public void setEtveFuelType(String etveFuelType) {
			this.etveFuelType = etveFuelType;
			addValidField("etveFuelType");
		}
		@Column(name = "ETVE_CODE")
		public String getEtveCode() {
			return etveCode;
		}

		public void setEtveCode(String etveCode) {
			this.etveCode = etveCode;
			addValidField("etveCode");
		}
		@Column(name = "ETVE_RESTRICTION_GROUP")
		public String getEtveRestrictionGroup() {
			return etveRestrictionGroup;
		}

		public void setEtveRestrictionGroup(String etveRestrictionGroup) {
			this.etveRestrictionGroup = etveRestrictionGroup;
			addValidField("etveRestrictionGroup");
		}
		@Column(name = "ETVE_MAX_LOADVOLUME")
		public Integer getEtveMaxLoadvolume() {
			return etveMaxLoadvolume;
		}

		public void setEtveMaxLoadvolume(Integer etveMaxLoadvolume) {
			this.etveMaxLoadvolume = etveMaxLoadvolume;
			addValidField("etveMaxLoadvolume");
		}
		@Column(name = "ETVE_MAX_LOADWEIGHT")
		public Integer getEtveMaxLoadweight() {
			return etveMaxLoadweight;
		}

		public void setEtveMaxLoadweight(Integer etveMaxLoadweight) {
			this.etveMaxLoadweight = etveMaxLoadweight;
			addValidField("etveMaxLoadweight");
		}
		@Column(name = "ETVE_ETVM_ID")
		public Integer getEtveEtvmId() {
			return etveEtvmId;
		}

		public void setEtveEtvmId(Integer etveEtvmId) {
			this.etveEtvmId = etveEtvmId;
			addValidField("etveEtvmId");
		}
		
		
}
