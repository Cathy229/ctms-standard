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
@Table(name = "ET_ORDER")
public class EtOrderModel extends BaseModel implements OperationLog {

	//订单主键
	private Integer etorId;
	//所属分公司
	private Integer etorEscoId;
	//系统订单号
	private String etorOrderNo;
	//SO_NO:Shipping
	private String etorSoNo;
	//DO_NO:Delivery
	private String etorDoNo;
	//订单笔次
	private String etorOrderFudeji;
	//客户合同号
	private String etorContractNo;
	//订单类型:关联基础数据订单类型表
	private Integer etorEbotId;
	//紧急程度
	private String etorLevel;
	//订单条码
	private String etorOrderBarcode;
	//委托方ID
	private Integer etorConsignorEbcuId;
	//委托方名称
	private String etorConsignorEbcuNameCn;
	//客户ID
	private Integer etorCustomEbcuId;
	//客户名称
	private String etorCustomEbcuNameCn;
	//项目ID
	private Integer etorEbpjId;
	//项目名称
	private String etorEbpjName;
	//BU
	private Integer etorEbbuId;
	//BU名称
	private String etorEbbuBuName;
	//下单人
	private Integer etorEbpeId;
	//下单人名称
	private String etorEbccName;
	//下单时间
	private Date etorOrderDate;
	//起运地
	private Integer etorStartEbrgId;
	//起运地名称
	private String etorStartEbrgNameCn;
	//目的地
	private Integer etorEndEbrgId;
	//目的地名称
	private String etorEndEbrgNameCn;
	//双程订单号
	private String etorDoubleOrder;
	//揽货部门ID
	private Integer etorEsdeId;
	//揽货部门名称
	private String etorEsdeName;
	//销售基地
	private Integer etorSaleEsstId;
	//销售基地名称
	private String etorSaleEsstName;
	//操作基地
	private Integer etorOperateEsstId;
	//操作基地名称
	private String etorOperateEsstName;
	//特殊订单
	private String etorSpecialOrder;
	//运输类型
	private String etorTranType;
	//导出日期
	private Date etorOutDate;
	//订单状态
	private String etorStatus;
	//订单重量
	private Double etorWeight;
	//订单体积
	private Double etorVolume;
	//订单件数
	private Integer etorQuantity;
	//要求提货时间
	private Date etorReqDeliveryDate;
	//要求到达时间
	private Date etorReqArrivalDate;
	//提货时段
	private String etorDeliveryPeriod;
	//收货时段
	private String etorArrivalPeriod;
	//提货公司ID
	private Integer etorShipperEbspId;
	//提货公司
	private String etorShipperEbspNameCn;
	//提货公司邮编
	private String etorShipperEbsaPost;
	//提货人联系人
	private String etorShipperEbsaContact;
	//提货人联系电话
	private String etorShipperEbsaTel;
	//提货地址ID
	private Integer etorShipperEbsaId;
	//提货地址
	private String etorShipperEbsaAddress;
	//提货区域ID
	private Integer etorShipperEbrgId;
	//提货区域
	private String etorShipperEbrgNameCn;
	//提货城市ID
	private Integer etorShipperEbplId;
	//提货城市
	private String etorShipperEbplNameCn;
	//收货公司ID
	private Integer etorConsigneeEbspId;
	//收货人名称
	private String etorConsigneeEbspNameCn;
	//收货邮编
	private String etorConsigneeEbsaPost;
	//收货人联系人
	private String etorConsigneeEbsaContact;
	//收货人联系电话
	private String etorConsigneeEbsaTel;
	//收货人地址ID
	private Integer etorConsigneeEbsaId;
	//收货人地址
	private String etorConsigneeEbsaAddress;
	//收货区域ID
	private Integer etorConsigneeEbrgId;
	//收货区域
	private String etorConsigneeEbrgNameCn;
	//收货城市ID
	private Integer etorConsigneeEbplId;
	//收货城市
	private String etorConsigneeEbplNameCn;
	//运输特殊要求
	private String etorTransReq;
	//收货人接货要求
	private String etorConsigneeReq;
	//单证特殊要求
	private String etorDocReq;
	//备注
	private String etorRemark;
	//作废原因
	private String etorVoidDesc;
	//作废人
	private String etorVoider;
	//作废时间
	private Date etorVoiderTime;
	//预留字段
	private Double etorSubnum2;
	//预留字段
	private Double etorSubnum3;
	//预留字段
	private Date etorSubdate3;
	//预留字段
	private Date etorSubdate4;
	//预留字段
	private Date etorSubdate5;
	//预留字段
	private Date etorSubdate2;
	//预留字段
	private Date etorSubdate1;
	//预留字段
	private String etorSubstr7;
	//预留字段
	private String etorSubstr8;
	//预留字段
	private String etorSubstr6;
	//预留字段
	private String etorSubstr5;
	//预留字段
	private String etorSubstr4;
	//预留字段
	private String etorSubstr3;
	//预留字段
	private String etorSubstr2;
	//预留字段
	private String etorSubstr1;
	//预留字段
	private Double etorSubnum1;
	//创建人
	private String creator;
	//创建时间
	private Date createTime;
	//修改人
	private String modifier;
	//修改时间
	private Date modifyTime;
	//时间戳
	private Integer recVer;
	//订单件数单位
	private String etorQuantityUnit;
	//订单分类0订单1非项目运输订单
	private String etorType;
	//内部委托ID
	private Integer etorInnerOrderId;
	//用于建立TMS和OMS或其他第三方系统的订单数据的关系
	private String etorFkSysId;
	//用于标记数据的来源系统
	private String etorSourceSysFalg;
	//订单净重
	private Double etorNetWeight;

	//调度人ID
	private Integer etorScheduleId;
	//调度人姓名
	private String etorScheduleName;
	//关联订单ID
	private Integer etorRalationId;
	
	//关联SO NO
	private String etorRalationSoNo;
	
	//所属板块
	private String etorTheirPlate;
	//总收入
	private Double etorTotalIncome;
	
	//数据来源
	private String etorDataSource;
	
	//报文名称
	private String etorMessageName;
	
	//源单票号
	private String etorOriSingleNo;
	
	//报文委托创建人
	private String etorCreatorName;
	
	//报文创建人邮箱
	private String etorCreatorEmail;
	
	//报文创建人手机
	private String etorCreatorTel;
	
	//费用计算状态
	private String etorCostStatus;
	//费用计算结果
	private String etorFeeResult;//
	
	//是否更改收货地
	private String etorIsChangeDelivery;

	private String etorSymbol;//ETOR_SYMBOL HD_数据处理标志
	private Date  etorBeginprocessingtime;// ETOR_BEGINPROCESSINGTIME  HD_数据处理开始时间
	private Date etorLastmodifiedtime;// ETOR_LASTMODIFIEDTIME HD_数据处理时间
	private String etorInformation;//	ETOR_INFORMATION HD_数据处理信息
	
	//调度导出次数
    private Integer etorExportCount;
    //调度最后导出时间 
    private String etorLastExportTime;
    //调度导出操作人
    private String etorExportOperator;
    
  //订单统计组代码（订单财务代码）
	private String etorFCode;
	//订单BMS票据代码
	private String etorBmsEbbtCode;
	//订单BMS板块代码
	private String etorBmsEbotCode;
	//订单BMS部门代码
	private String etorBmsEsdeDepartmentCode;
	//订单BMS销售人员代码
	private String etorBmsEbsmCode;
	//订单BMS业务类型代码
	private String etorBmsBusinessClass;
	//订单BMS客户代码
	private String etorBmsAEbcuCustomerNo;
	//订单BMS供应商代码
	private String etorBmsSEbcuCustomerNo;
	//订单BMS货物类型
	private Long etorBmsCargoType;
	//订单BMS贸易方式
	private String etorCommerceType;
	//订单BMS监管方式
	private Long etorBmsMonitorType;
	//订单BMS计量方式
	private Long etorBmsCountType;
	//提货类型
	private String etorShipperSendType;
	//收货类型
	private String etorConsigneeReceiveType;
    //内委或班线订单ID
	private Integer etorEntrustEtorId;
	
	//"客户支付状态
	private String etorChargeoff;
	//"付款方式全局数据字典
	private String etorPaymentMode;
	//"签收单返还方式公司级数据字典
	private Integer etorReceiptReturntype;
	//增值服务保价申明
	private String etorInsuredValue;
	//电商订单主键 etorEcmsEoorId
	private Integer etorEcmsEoorId;
	
	//销售区域 etorDistrict
	private String etorDistrict;
	//操作区域 etorDistrictOpt
	private String etorDistrictOpt;
	//托运单条码
	private String etorConsignBarcode;
	
	//订单费用生成标识（可扩展）,自有成本标识为1，其他类型的标识可向下扩展,按“，”进行分割
	private String etorCreatefeeFlag;
	
	/*ADD BY TOM 21040704*/
	private Date etorFrozenfessTimeLimit;
	
    //"付费方标识(“S”代表发货人付费，“R”代表收货人付费
    private  String etorPayerType;

    /**
    * Get "付费方标识(“S”代表发货人付费，“R”代表收货人付费
    * @return
    */
    @Column(name = "ETOR_PAYER_TYPE")
    public String getEtorPayerType(){
       return etorPayerType;
    }

    /**
    * Set "付费方标识(“S”代表发货人付费，“R”代表收货人付费
    */
    public void setEtorPayerType(String etorPayerType){
       this.etorPayerType = etorPayerType;
       addValidField("etorPayerType");
    }


	
	@Column(name="ETOR_FROZENFESS_TIMELIMIT")
	public Date getEtorFrozenfessTimeLimit() {
		return etorFrozenfessTimeLimit;
	}

	public void setEtorFrozenfessTimeLimit(Date etorFrozenfessTimeLimit) {
		this.etorFrozenfessTimeLimit = etorFrozenfessTimeLimit;
		this.addValidField("etorFrozenfessTimeLimit");
	}
	
	@Column(name="ETOR_CREATEFEE_FLAG")
	public String getEtorCreatefeeFlag() {
		return etorCreatefeeFlag;
	}

	public void setEtorCreatefeeFlag(String etorCreatefeeFlag) {
		this.etorCreatefeeFlag = etorCreatefeeFlag;
		this.addValidField("etorCreatefeeFlag");
	}
	
	@Column(name="ETOR_CONSIGN_BARCODE")
	public String getEtorConsignBarcode() {
		return etorConsignBarcode;
	}

	public void setEtorConsignBarcode(String etorConsignBarcode) {
		this.etorConsignBarcode = etorConsignBarcode;
		this.addValidField("etorConsignBarcode");
	}
	
	@Column(name = "ETOR_ECMS_EOOR_ID")
	public Integer getEtorEcmsEoorId() {
		return etorEcmsEoorId;
	}

	public void setEtorEcmsEoorId(Integer etorEcmsEoorId) {
		this.etorEcmsEoorId = etorEcmsEoorId;
		addValidField("etorEcmsEoorId");
	}

	@Column(name = "ETOR_ENTRUST_ETOR_ID")
	public Integer getEtorEntrustEtorId() {
		return etorEntrustEtorId;
	}

	public void setEtorEntrustEtorId(Integer etorEntrustEtorId) {
		this.etorEntrustEtorId = etorEntrustEtorId;
		addValidField("etorEntrustEtorId");
	}

	@Column(name = "ETOR_LAST_EXPORT_TIME")
    public String getEtorLastExportTime() {
		return etorLastExportTime;
	}

	public void setEtorLastExportTime(String etorLastExportTime) {
		this.etorLastExportTime = etorLastExportTime;
		addValidField("etorLastExportTime");
	}

	@Column(name = "ETOR_EXPORT_COUNT")
	public Integer getEtorExportCount() {
		return etorExportCount;
	}

	public void setEtorExportCount(Integer etorExportCount) {
		this.etorExportCount = etorExportCount;
		addValidField("etorExportCount");
	}

	@Column(name = "ETOR_EXPORT_OPERATOR")
	public String getEtorExportOperator() {
		return etorExportOperator;
	}

	public void setEtorExportOperator(String etorExportOperator) {
		this.etorExportOperator = etorExportOperator;
		addValidField("etorExportOperator");
	}

	@Column(name = "ETOR_SYMBOL")
	public String getEtorSymbol() {
		return etorSymbol;
	}

	public void setEtorSymbol(String etorSymbol) {
		this.etorSymbol = etorSymbol;
		addValidField("etorSymbol");
	}

	@Column(name = "ETOR_BEGINPROCESSINGTIME")
	public Date getEtorBeginprocessingtime() {
		return etorBeginprocessingtime;
	}

	public void setEtorBeginprocessingtime(Date etorBeginprocessingtime) {
		this.etorBeginprocessingtime = etorBeginprocessingtime;
		addValidField("etorBeginprocessingtime");
	}

	@Column(name = "ETOR_LASTMODIFIEDTIME")
	public Date getEtorLastmodifiedtime() {
		return etorLastmodifiedtime;
	}

	public void setEtorLastmodifiedtime(Date etorLastmodifiedtime) {
		this.etorLastmodifiedtime = etorLastmodifiedtime;
		addValidField("etorLastmodifiedtime");
	}

	@Column(name = "ETOR_INFORMATION")
	public String getEtorInformation() {
		return etorInformation;
	}

	public void setEtorInformation(String etorInformation) {
		this.etorInformation = etorInformation;
		addValidField("etorInformation");
	}
	/**
	 * Get 订单主键
	 */
	@Column(name = "ETOR_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getEtorId() {
		return etorId;
	}

	/**
	 * Set 订单主键
	 */
	public void setEtorId(Integer etorId) {
		this.etorId = etorId;
		addValidField("etorId");
	}

	/**
	 * Get 所属分公司
	 */
	@Column(name = "ETOR_ESCO_ID")
	public Integer getEtorEscoId() {
		return etorEscoId;
	}

	/**
	 * Set 所属分公司
	 */
	public void setEtorEscoId(Integer etorEscoId) {
		this.etorEscoId = etorEscoId;
		addValidField("etorEscoId");
	}

	@Column(name = "ETOR_FEE_RESULT")
	public String getEtorFeeResult() {
		return etorFeeResult;
	}

	public void setEtorFeeResult(String etorFeeResult) {
		this.etorFeeResult = etorFeeResult;
		addValidField("etorFeeResult");
	}
	
	/**
	 * Get 系统订单号
	 */
	@Column(name = "ETOR_ORDER_NO")
	public String getEtorOrderNo() {
		return etorOrderNo;
	}

	/**
	 * Set 系统订单号
	 */
	public void setEtorOrderNo(String etorOrderNo) {
		this.etorOrderNo = etorOrderNo;
		addValidField("etorOrderNo");
	}

	/**
	 * Get SO_NO:Shipping
	 * Order
	 */
	@Column(name = "ETOR_SO_NO")
	public String getEtorSoNo() {
		return etorSoNo;
	}

	/**
	 * Set SO_NO:Shipping
	 * Order
	 */
	public void setEtorSoNo(String etorSoNo) {
		this.etorSoNo = etorSoNo;
		addValidField("etorSoNo");
	}

	/**
	 * Get DO_NO:Delivery
	 * Order
	 */
	@Column(name = "ETOR_DO_NO")
	public String getEtorDoNo() {
		return etorDoNo;
	}

	/**
	 * Set DO_NO:Delivery
	 * Order
	 */
	public void setEtorDoNo(String etorDoNo) {
		this.etorDoNo = etorDoNo;
		addValidField("etorDoNo");
	}

	/**
	 * Get 订单笔次
	 */
	@Column(name = "ETOR_ORDER_FUDEJI")
	public String getEtorOrderFudeji() {
		return etorOrderFudeji;
	}

	/**
	 * Set 订单笔次
	 */
	public void setEtorOrderFudeji(String etorOrderFudeji) {
		this.etorOrderFudeji = etorOrderFudeji;
		addValidField("etorOrderFudeji");
	}

	/**
	 * Get 客户合同号
	 */
	@Column(name = "ETOR_CONTRACT_NO")
	public String getEtorContractNo() {
		return etorContractNo;
	}

	/**
	 * Set 客户合同号
	 */
	public void setEtorContractNo(String etorContractNo) {
		this.etorContractNo = etorContractNo;
		addValidField("etorContractNo");
	}

	/**
	 * Get 订单类型:关联基础数据订单类型表
	 */
	@Column(name = "ETOR_EBOT_ID")
	public Integer getEtorEbotId() {
		return etorEbotId;
	}

	/**
	 * Set 订单类型:关联基础数据订单类型表
	 */
	public void setEtorEbotId(Integer etorEbotId) {
		this.etorEbotId = etorEbotId;
		addValidField("etorEbotId");
	}

	/**
	 * Get 紧急程度
	 */
	@Column(name = "ETOR_LEVEL")
	public String getEtorLevel() {
		return etorLevel;
	}

	/**
	 * Set 紧急程度
	 */
	public void setEtorLevel(String etorLevel) {
		this.etorLevel = etorLevel;
		addValidField("etorLevel");
	}

	/**
	 * Get 订单条码
	 */
	@Column(name = "ETOR_ORDER_BARCODE")
	public String getEtorOrderBarcode() {
		return etorOrderBarcode;
	}

	/**
	 * Set 订单条码
	 */
	public void setEtorOrderBarcode(String etorOrderBarcode) {
		this.etorOrderBarcode = etorOrderBarcode;
		addValidField("etorOrderBarcode");
	}

	/**
	 * Get 委托方ID
	 */
	@Column(name = "ETOR_CONSIGNOR_EBCU_ID")
	public Integer getEtorConsignorEbcuId() {
		return etorConsignorEbcuId;
	}

	/**
	 * Set 委托方ID
	 */
	public void setEtorConsignorEbcuId(Integer etorConsignorEbcuId) {
		this.etorConsignorEbcuId = etorConsignorEbcuId;
		addValidField("etorConsignorEbcuId");
	}

	/**
	 * Get 委托方名称
	 */
	@Column(name = "ETOR_CONSIGNOR_EBCU_NAME_CN")
	public String getEtorConsignorEbcuNameCn() {
		return etorConsignorEbcuNameCn;
	}

	/**
	 * Set 委托方名称
	 */
	public void setEtorConsignorEbcuNameCn(String etorConsignorEbcuNameCn) {
		this.etorConsignorEbcuNameCn = etorConsignorEbcuNameCn;
		addValidField("etorConsignorEbcuNameCn");
	}

	/**
	 * Get 客户ID
	 */
	@Column(name = "ETOR_CUSTOM_EBCU_ID")
	public Integer getEtorCustomEbcuId() {
		return etorCustomEbcuId;
	}

	/**
	 * Set 客户ID
	 */
	public void setEtorCustomEbcuId(Integer etorCustomEbcuId) {
		this.etorCustomEbcuId = etorCustomEbcuId;
		addValidField("etorCustomEbcuId");
	}

	/**
	 * Get 客户名称
	 */
	@Column(name = "ETOR_CUSTOM_EBCU_NAME_CN")
	public String getEtorCustomEbcuNameCn() {
		return etorCustomEbcuNameCn;
	}

	/**
	 * Set 客户名称
	 */
	public void setEtorCustomEbcuNameCn(String etorCustomEbcuNameCn) {
		this.etorCustomEbcuNameCn = etorCustomEbcuNameCn;
		addValidField("etorCustomEbcuNameCn");
	}

	/**
	 * Get 项目ID
	 */
	@Column(name = "ETOR_EBPJ_ID")
	public Integer getEtorEbpjId() {
		return etorEbpjId;
	}

	/**
	 * Set 项目ID
	 */
	public void setEtorEbpjId(Integer etorEbpjId) {
		this.etorEbpjId = etorEbpjId;
		addValidField("etorEbpjId");
	}

	/**
	 * Get 项目名称
	 */
	@Column(name = "ETOR_EBPJ_NAME")
	public String getEtorEbpjName() {
		return etorEbpjName;
	}

	/**
	 * Set 项目名称
	 */
	public void setEtorEbpjName(String etorEbpjName) {
		this.etorEbpjName = etorEbpjName;
		addValidField("etorEbpjName");
	}

	/**
	 * Get BU
	 */
	@Column(name = "ETOR_EBBU_ID")
	public Integer getEtorEbbuId() {
		return etorEbbuId;
	}

	/**
	 * Set BU
	 */
	public void setEtorEbbuId(Integer etorEbbuId) {
		this.etorEbbuId = etorEbbuId;
		addValidField("etorEbbuId");
	}

	/**
	 * Get BU名称
	 */
	@Column(name = "ETOR_EBBU_BU_NAME")
	public String getEtorEbbuBuName() {
		return etorEbbuBuName;
	}

	/**
	 * Set BU名称
	 */
	public void setEtorEbbuBuName(String etorEbbuBuName) {
		this.etorEbbuBuName = etorEbbuBuName;
		addValidField("etorEbbuBuName");
	}

	/**
	 * Get 下单人
	 */
	@Column(name = "ETOR_EBPE_ID")
	public Integer getEtorEbpeId() {
		return etorEbpeId;
	}

	/**
	 * Set 下单人
	 */
	public void setEtorEbpeId(Integer etorEbpeId) {
		this.etorEbpeId = etorEbpeId;
		addValidField("etorEbpeId");
	}

	/**
	 * Get 下单人名称
	 */
	@Column(name = "ETOR_EBCC_NAME")
	public String getEtorEbccName() {
		return etorEbccName;
	}

	/**
	 * Set 下单人名称
	 */
	public void setEtorEbccName(String etorEbccName) {
		this.etorEbccName = etorEbccName;
		addValidField("etorEbccName");
	}

	/**
	 * Get 下单时间
	 */
	@Column(name = "ETOR_ORDER_DATE")
	public Date getEtorOrderDate() {
		return etorOrderDate;
	}

	/**
	 * Set 下单时间
	 */
	public void setEtorOrderDate(Date etorOrderDate) {
		this.etorOrderDate = etorOrderDate;
		addValidField("etorOrderDate");
	}

	/**
	 * Get 起运地
	 */
	@Column(name = "ETOR_START_EBRG_ID")
	public Integer getEtorStartEbrgId() {
		return etorStartEbrgId;
	}

	/**
	 * Set 起运地
	 */
	public void setEtorStartEbrgId(Integer etorStartEbrgId) {
		this.etorStartEbrgId = etorStartEbrgId;
		addValidField("etorStartEbrgId");
	}

	/**
	 * Get 起运地名称
	 */
	@Column(name = "ETOR_START_EBRG_NAME_CN")
	public String getEtorStartEbrgNameCn() {
		return etorStartEbrgNameCn;
	}

	/**
	 * Set 起运地名称
	 */
	public void setEtorStartEbrgNameCn(String etorStartEbrgNameCn) {
		this.etorStartEbrgNameCn = etorStartEbrgNameCn;
		addValidField("etorStartEbrgNameCn");
	}

	/**
	 * Get 目的地
	 */
	@Column(name = "ETOR_END_EBRG_ID")
	public Integer getEtorEndEbrgId() {
		return etorEndEbrgId;
	}

	/**
	 * Set 目的地
	 */
	public void setEtorEndEbrgId(Integer etorEndEbrgId) {
		this.etorEndEbrgId = etorEndEbrgId;
		addValidField("etorEndEbrgId");
	}

	/**
	 * Get 目的地名称
	 */
	@Column(name = "ETOR_END_EBRG_NAME_CN")
	public String getEtorEndEbrgNameCn() {
		return etorEndEbrgNameCn;
	}

	/**
	 * Set 目的地名称
	 */
	public void setEtorEndEbrgNameCn(String etorEndEbrgNameCn) {
		this.etorEndEbrgNameCn = etorEndEbrgNameCn;
		addValidField("etorEndEbrgNameCn");
	}

	/**
	 * Get 双程订单号
	 */
	@Column(name = "ETOR_DOUBLE_ORDER")
	public String getEtorDoubleOrder() {
		return etorDoubleOrder;
	}

	/**
	 * Set 双程订单号
	 */
	public void setEtorDoubleOrder(String etorDoubleOrder) {
		this.etorDoubleOrder = etorDoubleOrder;
		addValidField("etorDoubleOrder");
	}

	/**
	 * Get 揽货部门ID
	 */
	@Column(name = "ETOR_ESDE_ID")
	public Integer getEtorEsdeId() {
		return etorEsdeId;
	}

	/**
	 * Set 揽货部门ID
	 */
	public void setEtorEsdeId(Integer etorEsdeId) {
		this.etorEsdeId = etorEsdeId;
		addValidField("etorEsdeId");
	}

	/**
	 * Get 揽货部门名称
	 */
	@Column(name = "ETOR_ESDE_NAME")
	public String getEtorEsdeName() {
		return etorEsdeName;
	}

	/**
	 * Set 揽货部门名称
	 */
	public void setEtorEsdeName(String etorEsdeName) {
		this.etorEsdeName = etorEsdeName;
		addValidField("etorEsdeName");
	}

	/**
	 * Get 销售基地
	 */
	@Column(name = "ETOR_SALE_ESST_ID")
	public Integer getEtorSaleEsstId() {
		return etorSaleEsstId;
	}

	/**
	 * Set 销售基地
	 */
	public void setEtorSaleEsstId(Integer etorSaleEsstId) {
		this.etorSaleEsstId = etorSaleEsstId;
		addValidField("etorSaleEsstId");
	}

	/**
	 * Get 销售基地名称
	 */
	@Column(name = "ETOR_SALE_ESST_NAME")
	public String getEtorSaleEsstName() {
		return etorSaleEsstName;
	}

	/**
	 * Set 销售基地名称
	 */
	public void setEtorSaleEsstName(String etorSaleEsstName) {
		this.etorSaleEsstName = etorSaleEsstName;
		addValidField("etorSaleEsstName");
	}

	/**
	 * Get 操作基地
	 */
	@Column(name = "ETOR_OPERATE_ESST_ID")
	public Integer getEtorOperateEsstId() {
		return etorOperateEsstId;
	}

	/**
	 * Set 操作基地
	 */
	public void setEtorOperateEsstId(Integer etorOperateEsstId) {
		this.etorOperateEsstId = etorOperateEsstId;
		addValidField("etorOperateEsstId");
	}

	/**
	 * Get 操作基地名称
	 */
	@Column(name = "ETOR_OPERATE_ESST_NAME")
	public String getEtorOperateEsstName() {
		return etorOperateEsstName;
	}

	/**
	 * Set 操作基地名称
	 */
	public void setEtorOperateEsstName(String etorOperateEsstName) {
		this.etorOperateEsstName = etorOperateEsstName;
		addValidField("etorOperateEsstName");
	}

	/**
	 * Get 特殊订单
	 */
	@Column(name = "ETOR_SPECIAL_ORDER")
	public String getEtorSpecialOrder() {
		return etorSpecialOrder;
	}

	/**
	 * Set 特殊订单
	 */
	public void setEtorSpecialOrder(String etorSpecialOrder) {
		this.etorSpecialOrder = etorSpecialOrder;
		addValidField("etorSpecialOrder");
	}

	/**
	 * Get 运输类型
	 */
	@Column(name = "ETOR_TRAN_TYPE")
	public String getEtorTranType() {
		return etorTranType;
	}

	/**
	 * Set 运输类型
	 */
	public void setEtorTranType(String etorTranType) {
		this.etorTranType = etorTranType;
		addValidField("etorTranType");
	}

	/**
	 * Get 导出日期
	 */
	@Column(name = "ETOR_OUT_DATE")
	public Date getEtorOutDate() {
		return etorOutDate;
	}

	/**
	 * Set 导出日期
	 */
	public void setEtorOutDate(Date etorOutDate) {
		this.etorOutDate = etorOutDate;
		addValidField("etorOutDate");
	}

	/**
	 * Get 订单状态
	 */
	@Column(name = "ETOR_STATUS")
	public String getEtorStatus() {
		return etorStatus;
	}

	/**
	 * Set 订单状态
	 */
	public void setEtorStatus(String etorStatus) {
		this.etorStatus = etorStatus;
		addValidField("etorStatus");
	}

	/**
	 * Get 订单重量
	 */
	@Column(name = "ETOR_WEIGHT")
	public Double getEtorWeight() {
		return etorWeight;
	}

	/**
	 * Set 订单重量
	 */
	public void setEtorWeight(Double etorWeight) {
		this.etorWeight = etorWeight;
		addValidField("etorWeight");
	}

	/**
	 * Get 订单体积
	 */
	@Column(name = "ETOR_VOLUME")
	public Double getEtorVolume() {
		return etorVolume;
	}

	/**
	 * Set 订单体积
	 */
	public void setEtorVolume(Double etorVolume) {
		this.etorVolume = etorVolume;
		addValidField("etorVolume");
	}

	/**
	 * Get 订单件数
	 */
	@Column(name = "ETOR_QUANTITY")
	public Integer getEtorQuantity() {
		return etorQuantity;
	}

	/**
	 * Set 订单件数
	 */
	public void setEtorQuantity(Integer etorQuantity) {
		this.etorQuantity = etorQuantity;
		addValidField("etorQuantity");
	}

	/**
	 * Get 要求提货时间
	 */
	@Column(name = "ETOR_REQ_DELIVERY_DATE")
	public Date getEtorReqDeliveryDate() {
		return etorReqDeliveryDate;
	}

	/**
	 * Set 要求提货时间
	 */
	public void setEtorReqDeliveryDate(Date etorReqDeliveryDate) {
		this.etorReqDeliveryDate = etorReqDeliveryDate;
		addValidField("etorReqDeliveryDate");
	}

	/**
	 * Get 要求到达时间
	 */
	@Column(name = "ETOR_REQ_ARRIVAL_DATE")
	public Date getEtorReqArrivalDate() {
		return etorReqArrivalDate;
	}

	/**
	 * Set 要求到达时间
	 */
	public void setEtorReqArrivalDate(Date etorReqArrivalDate) {
		this.etorReqArrivalDate = etorReqArrivalDate;
		addValidField("etorReqArrivalDate");
	}

	/**
	 * Get 提货时段
	 */
	@Column(name = "ETOR_DELIVERY_PERIOD")
	public String getEtorDeliveryPeriod() {
		return etorDeliveryPeriod;
	}

	/**
	 * Set 提货时段
	 */
	public void setEtorDeliveryPeriod(String etorDeliveryPeriod) {
		this.etorDeliveryPeriod = etorDeliveryPeriod;
		addValidField("etorDeliveryPeriod");
	}

	/**
	 * Get 收货时段
	 */
	@Column(name = "ETOR_ARRIVAL_PERIOD")
	public String getEtorArrivalPeriod() {
		return etorArrivalPeriod;
	}

	/**
	 * Set 收货时段
	 */
	public void setEtorArrivalPeriod(String etorArrivalPeriod) {
		this.etorArrivalPeriod = etorArrivalPeriod;
		addValidField("etorArrivalPeriod");
	}

	/**
	 * Get 提货公司ID
	 */
	@Column(name = "ETOR_SHIPPER_EBSP_ID")
	public Integer getEtorShipperEbspId() {
		return etorShipperEbspId;
	}

	/**
	 * Set 提货公司ID
	 */
	public void setEtorShipperEbspId(Integer etorShipperEbspId) {
		this.etorShipperEbspId = etorShipperEbspId;
		addValidField("etorShipperEbspId");
	}

	/**
	 * Get 提货公司
	 */
	@Column(name = "ETOR_SHIPPER_EBSP_NAME_CN")
	public String getEtorShipperEbspNameCn() {
		return etorShipperEbspNameCn;
	}

	/**
	 * Set 提货公司
	 */
	public void setEtorShipperEbspNameCn(String etorShipperEbspNameCn) {
		this.etorShipperEbspNameCn = etorShipperEbspNameCn;
		addValidField("etorShipperEbspNameCn");
	}

	/**
	 * Get 提货公司邮编
	 */
	@Column(name = "ETOR_SHIPPER_EBSA_POST")
	public String getEtorShipperEbsaPost() {
		return etorShipperEbsaPost;
	}

	/**
	 * Set 提货公司邮编
	 */
	public void setEtorShipperEbsaPost(String etorShipperEbsaPost) {
		this.etorShipperEbsaPost = etorShipperEbsaPost;
		addValidField("etorShipperEbsaPost");
	}

	/**
	 * Get 提货人联系人
	 */
	@Column(name = "ETOR_SHIPPER_EBSA_CONTACT")
	public String getEtorShipperEbsaContact() {
		return etorShipperEbsaContact;
	}

	/**
	 * Set 提货人联系人
	 */
	public void setEtorShipperEbsaContact(String etorShipperEbsaContact) {
		this.etorShipperEbsaContact = etorShipperEbsaContact;
		addValidField("etorShipperEbsaContact");
	}

	/**
	 * Get 提货人联系电话
	 */
	@Column(name = "ETOR_SHIPPER_EBSA_TEL")
	public String getEtorShipperEbsaTel() {
		return etorShipperEbsaTel;
	}

	/**
	 * Set 提货人联系电话
	 */
	public void setEtorShipperEbsaTel(String etorShipperEbsaTel) {
		this.etorShipperEbsaTel = etorShipperEbsaTel;
		addValidField("etorShipperEbsaTel");
	}

	/**
	 * Get 提货地址ID
	 */
	@Column(name = "ETOR_SHIPPER_EBSA_ID")
	public Integer getEtorShipperEbsaId() {
		return etorShipperEbsaId;
	}

	/**
	 * Set 提货地址ID
	 */
	public void setEtorShipperEbsaId(Integer etorShipperEbsaId) {
		this.etorShipperEbsaId = etorShipperEbsaId;
		addValidField("etorShipperEbsaId");
	}

	/**
	 * Get 提货地址
	 */
	@Column(name = "ETOR_SHIPPER_EBSA_ADDRESS")
	public String getEtorShipperEbsaAddress() {
		return etorShipperEbsaAddress;
	}

	/**
	 * Set 提货地址
	 */
	public void setEtorShipperEbsaAddress(String etorShipperEbsaAddress) {
		this.etorShipperEbsaAddress = etorShipperEbsaAddress;
		addValidField("etorShipperEbsaAddress");
	}

	/**
	 * Get 提货区域ID
	 */
	@Column(name = "ETOR_SHIPPER_EBRG_ID")
	public Integer getEtorShipperEbrgId() {
		return etorShipperEbrgId;
	}

	/**
	 * Set 提货区域ID
	 */
	public void setEtorShipperEbrgId(Integer etorShipperEbrgId) {
		this.etorShipperEbrgId = etorShipperEbrgId;
		addValidField("etorShipperEbrgId");
	}

	/**
	 * Get 提货区域
	 */
	@Column(name = "ETOR_SHIPPER_EBRG_NAME_CN")
	public String getEtorShipperEbrgNameCn() {
		return etorShipperEbrgNameCn;
	}

	/**
	 * Set 提货区域
	 */
	public void setEtorShipperEbrgNameCn(String etorShipperEbrgNameCn) {
		this.etorShipperEbrgNameCn = etorShipperEbrgNameCn;
		addValidField("etorShipperEbrgNameCn");
	}

	/**
	 * Get 提货城市ID
	 */
	@Column(name = "ETOR_SHIPPER_EBPL_ID")
	public Integer getEtorShipperEbplId() {
		return etorShipperEbplId;
	}

	/**
	 * Set 提货城市ID
	 */
	public void setEtorShipperEbplId(Integer etorShipperEbplId) {
		this.etorShipperEbplId = etorShipperEbplId;
		addValidField("etorShipperEbplId");
	}

	/**
	 * Get 提货城市
	 */
	@Column(name = "ETOR_SHIPPER_EBPL_NAME_CN")
	public String getEtorShipperEbplNameCn() {
		return etorShipperEbplNameCn;
	}

	/**
	 * Set 提货城市
	 */
	public void setEtorShipperEbplNameCn(String etorShipperEbplNameCn) {
		this.etorShipperEbplNameCn = etorShipperEbplNameCn;
		addValidField("etorShipperEbplNameCn");
	}

	/**
	 * Get 收货公司ID
	 */
	@Column(name = "ETOR_CONSIGNEE_EBSP_ID")
	public Integer getEtorConsigneeEbspId() {
		return etorConsigneeEbspId;
	}

	/**
	 * Set 收货公司ID
	 */
	public void setEtorConsigneeEbspId(Integer etorConsigneeEbspId) {
		this.etorConsigneeEbspId = etorConsigneeEbspId;
		addValidField("etorConsigneeEbspId");
	}

	/**
	 * Get 收货人名称
	 */
	@Column(name = "ETOR_CONSIGNEE_EBSP_NAME_CN")
	public String getEtorConsigneeEbspNameCn() {
		return etorConsigneeEbspNameCn;
	}

	/**
	 * Set 收货人名称
	 */
	public void setEtorConsigneeEbspNameCn(String etorConsigneeEbspNameCn) {
		this.etorConsigneeEbspNameCn = etorConsigneeEbspNameCn;
		addValidField("etorConsigneeEbspNameCn");
	}

	/**
	 * Get 收货邮编
	 */
	@Column(name = "ETOR_CONSIGNEE_EBSA_POST")
	public String getEtorConsigneeEbsaPost() {
		return etorConsigneeEbsaPost;
	}

	/**
	 * Set 收货邮编
	 */
	public void setEtorConsigneeEbsaPost(String etorConsigneeEbsaPost) {
		this.etorConsigneeEbsaPost = etorConsigneeEbsaPost;
		addValidField("etorConsigneeEbsaPost");
	}

	/**
	 * Get 收货人联系人
	 */
	@Column(name = "ETOR_CONSIGNEE_EBSA_CONTACT")
	public String getEtorConsigneeEbsaContact() {
		return etorConsigneeEbsaContact;
	}

	/**
	 * Set 收货人联系人
	 */
	public void setEtorConsigneeEbsaContact(String etorConsigneeEbsaContact) {
		this.etorConsigneeEbsaContact = etorConsigneeEbsaContact;
		addValidField("etorConsigneeEbsaContact");
	}

	/**
	 * Get 收货人联系电话
	 */
	@Column(name = "ETOR_CONSIGNEE_EBSA_TEL")
	public String getEtorConsigneeEbsaTel() {
		return etorConsigneeEbsaTel;
	}

	/**
	 * Set 收货人联系电话
	 */
	public void setEtorConsigneeEbsaTel(String etorConsigneeEbsaTel) {
		this.etorConsigneeEbsaTel = etorConsigneeEbsaTel;
		addValidField("etorConsigneeEbsaTel");
	}

	/**
	 * Get 收货人地址ID
	 */
	@Column(name = "ETOR_CONSIGNEE_EBSA_ID")
	public Integer getEtorConsigneeEbsaId() {
		return etorConsigneeEbsaId;
	}

	/**
	 * Set 收货人地址ID
	 */
	public void setEtorConsigneeEbsaId(Integer etorConsigneeEbsaId) {
		this.etorConsigneeEbsaId = etorConsigneeEbsaId;
		addValidField("etorConsigneeEbsaId");
	}

	/**
	 * Get 收货人地址
	 */
	@Column(name = "ETOR_CONSIGNEE_EBSA_ADDRESS")
	public String getEtorConsigneeEbsaAddress() {
		return etorConsigneeEbsaAddress;
	}

	/**
	 * Set 收货人地址
	 */
	public void setEtorConsigneeEbsaAddress(String etorConsigneeEbsaAddress) {
		this.etorConsigneeEbsaAddress = etorConsigneeEbsaAddress;
		addValidField("etorConsigneeEbsaAddress");
	}

	/**
	 * Get 收货区域ID
	 */
	@Column(name = "ETOR_CONSIGNEE_EBRG_ID")
	public Integer getEtorConsigneeEbrgId() {
		return etorConsigneeEbrgId;
	}

	/**
	 * Set 收货区域ID
	 */
	public void setEtorConsigneeEbrgId(Integer etorConsigneeEbrgId) {
		this.etorConsigneeEbrgId = etorConsigneeEbrgId;
		addValidField("etorConsigneeEbrgId");
	}

	/**
	 * Get 收货区域
	 */
	@Column(name = "ETOR_CONSIGNEE_EBRG_NAME_CN")
	public String getEtorConsigneeEbrgNameCn() {
		return etorConsigneeEbrgNameCn;
	}

	/**
	 * Set 收货区域
	 */
	public void setEtorConsigneeEbrgNameCn(String etorConsigneeEbrgNameCn) {
		this.etorConsigneeEbrgNameCn = etorConsigneeEbrgNameCn;
		addValidField("etorConsigneeEbrgNameCn");
	}

	/**
	 * Get 收货城市ID
	 */
	@Column(name = "ETOR_CONSIGNEE_EBPL_ID")
	public Integer getEtorConsigneeEbplId() {
		return etorConsigneeEbplId;
	}

	/**
	 * Set 收货城市ID
	 */
	public void setEtorConsigneeEbplId(Integer etorConsigneeEbplId) {
		this.etorConsigneeEbplId = etorConsigneeEbplId;
		addValidField("etorConsigneeEbplId");
	}

	/**
	 * Get 收货城市
	 */
	@Column(name = "ETOR_CONSIGNEE_EBPL_NAME_CN")
	public String getEtorConsigneeEbplNameCn() {
		return etorConsigneeEbplNameCn;
	}

	/**
	 * Set 收货城市
	 */
	public void setEtorConsigneeEbplNameCn(String etorConsigneeEbplNameCn) {
		this.etorConsigneeEbplNameCn = etorConsigneeEbplNameCn;
		addValidField("etorConsigneeEbplNameCn");
	}

	/**
	 * Get 运输特殊要求
	 */
	@Column(name = "ETOR_TRANS_REQ")
	public String getEtorTransReq() {
		return etorTransReq;
	}

	/**
	 * Set 运输特殊要求
	 */
	public void setEtorTransReq(String etorTransReq) {
		this.etorTransReq = etorTransReq;
		addValidField("etorTransReq");
	}

	/**
	 * Get 收货人接货要求
	 */
	@Column(name = "ETOR_CONSIGNEE_REQ")
	public String getEtorConsigneeReq() {
		return etorConsigneeReq;
	}

	/**
	 * Set 收货人接货要求
	 */
	public void setEtorConsigneeReq(String etorConsigneeReq) {
		this.etorConsigneeReq = etorConsigneeReq;
		addValidField("etorConsigneeReq");
	}

	/**
	 * Get 单证特殊要求
	 */
	@Column(name = "ETOR_DOC_REQ")
	public String getEtorDocReq() {
		return etorDocReq;
	}

	/**
	 * Set 单证特殊要求
	 */
	public void setEtorDocReq(String etorDocReq) {
		this.etorDocReq = etorDocReq;
		addValidField("etorDocReq");
	}

	/**
	 * Get 备注
	 */
	@Column(name = "ETOR_REMARK")
	public String getEtorRemark() {
		return etorRemark;
	}

	/**
	 * Set 备注
	 */
	public void setEtorRemark(String etorRemark) {
		this.etorRemark = etorRemark;
		addValidField("etorRemark");
	}

	/**
	 * Get 作废原因
	 */
	@Column(name = "ETOR_VOID_DESC")
	public String getEtorVoidDesc() {
		return etorVoidDesc;
	}

	/**
	 * Set 作废原因
	 */
	public void setEtorVoidDesc(String etorVoidDesc) {
		this.etorVoidDesc = etorVoidDesc;
		addValidField("etorVoidDesc");
	}

	/**
	 * Get 作废人
	 */
	@Column(name = "ETOR_VOIDER")
	public String getEtorVoider() {
		return etorVoider;
	}

	/**
	 * Set 作废人
	 */
	public void setEtorVoider(String etorVoider) {
		this.etorVoider = etorVoider;
		addValidField("etorVoider");
	}

	/**
	 * Get 作废时间
	 */
	@Column(name = "ETOR_VOIDER_TIME")
	public Date getEtorVoiderTime() {
		return etorVoiderTime;
	}

	/**
	 * Set 作废时间
	 */
	public void setEtorVoiderTime(Date etorVoiderTime) {
		this.etorVoiderTime = etorVoiderTime;
		addValidField("etorVoiderTime");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETOR_SUBNUM2")
	public Double getEtorSubnum2() {
		return etorSubnum2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtorSubnum2(Double etorSubnum2) {
		this.etorSubnum2 = etorSubnum2;
		addValidField("etorSubnum2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETOR_SUBNUM3")
	public Double getEtorSubnum3() {
		return etorSubnum3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtorSubnum3(Double etorSubnum3) {
		this.etorSubnum3 = etorSubnum3;
		addValidField("etorSubnum3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETOR_SUBDATE3")
	public Date getEtorSubdate3() {
		return etorSubdate3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtorSubdate3(Date etorSubdate3) {
		this.etorSubdate3 = etorSubdate3;
		addValidField("etorSubdate3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETOR_SUBDATE4")
	public Date getEtorSubdate4() {
		return etorSubdate4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtorSubdate4(Date etorSubdate4) {
		this.etorSubdate4 = etorSubdate4;
		addValidField("etorSubdate4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETOR_SUBDATE5")
	public Date getEtorSubdate5() {
		return etorSubdate5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtorSubdate5(Date etorSubdate5) {
		this.etorSubdate5 = etorSubdate5;
		addValidField("etorSubdate5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETOR_SUBDATE2")
	public Date getEtorSubdate2() {
		return etorSubdate2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtorSubdate2(Date etorSubdate2) {
		this.etorSubdate2 = etorSubdate2;
		addValidField("etorSubdate2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETOR_SUBDATE1")
	public Date getEtorSubdate1() {
		return etorSubdate1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtorSubdate1(Date etorSubdate1) {
		this.etorSubdate1 = etorSubdate1;
		addValidField("etorSubdate1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETOR_SUBSTR7")
	public String getEtorSubstr7() {
		return etorSubstr7;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtorSubstr7(String etorSubstr7) {
		this.etorSubstr7 = etorSubstr7;
		addValidField("etorSubstr7");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETOR_SUBSTR8")
	public String getEtorSubstr8() {
		return etorSubstr8;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtorSubstr8(String etorSubstr8) {
		this.etorSubstr8 = etorSubstr8;
		addValidField("etorSubstr8");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETOR_SUBSTR6")
	public String getEtorSubstr6() {
		return etorSubstr6;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtorSubstr6(String etorSubstr6) {
		this.etorSubstr6 = etorSubstr6;
		addValidField("etorSubstr6");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETOR_SUBSTR5")
	public String getEtorSubstr5() {
		return etorSubstr5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtorSubstr5(String etorSubstr5) {
		this.etorSubstr5 = etorSubstr5;
		addValidField("etorSubstr5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETOR_SUBSTR4")
	public String getEtorSubstr4() {
		return etorSubstr4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtorSubstr4(String etorSubstr4) {
		this.etorSubstr4 = etorSubstr4;
		addValidField("etorSubstr4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETOR_SUBSTR3")
	public String getEtorSubstr3() {
		return etorSubstr3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtorSubstr3(String etorSubstr3) {
		this.etorSubstr3 = etorSubstr3;
		addValidField("etorSubstr3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETOR_SUBSTR2")
	public String getEtorSubstr2() {
		return etorSubstr2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtorSubstr2(String etorSubstr2) {
		this.etorSubstr2 = etorSubstr2;
		addValidField("etorSubstr2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETOR_SUBSTR1")
	public String getEtorSubstr1() {
		return etorSubstr1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtorSubstr1(String etorSubstr1) {
		this.etorSubstr1 = etorSubstr1;
		addValidField("etorSubstr1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETOR_SUBNUM1")
	public Double getEtorSubnum1() {
		return etorSubnum1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtorSubnum1(Double etorSubnum1) {
		this.etorSubnum1 = etorSubnum1;
		addValidField("etorSubnum1");
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
	 * Get 订单件数单位
	 */
	@Column(name = "ETOR_QUANTITY_UNIT")
	public String getEtorQuantityUnit() {
		return etorQuantityUnit;
	}

	/**
	 * Set 订单件数单位
	 */
	public void setEtorQuantityUnit(String etorQuantityUnit) {
		this.etorQuantityUnit = etorQuantityUnit;
		addValidField("etorQuantityUnit");
	}

	/**
	 * Get 订单分类0订单1非项目运输订单
	 */
	@Column(name = "ETOR_TYPE")
	public String getEtorType() {
		return etorType;
	}

	/**
	 * Set 订单分类0订单1非项目运输订单
	 */
	public void setEtorType(String etorType) {
		this.etorType = etorType;
		addValidField("etorType");
	}

	/**
	 * Get 内部委托ID
	 */
	@Column(name = "ETOR_INNER_ORDER_ID")
	public Integer getEtorInnerOrderId() {
		return etorInnerOrderId;
	}

	/**
	 * Set 内部委托ID
	 */
	public void setEtorInnerOrderId(Integer etorInnerOrderId) {
		this.etorInnerOrderId = etorInnerOrderId;
		addValidField("etorInnerOrderId");
	}

	/**
	 * Get 用于建立TMS和OMS或其他第三方系统的订单数据的关系
	 */
	@Column(name = "ETOR_FK_SYS_ID")
	public String getEtorFkSysId() {
		return etorFkSysId;
	}

	/**
	 * Set 用于建立TMS和OMS或其他第三方系统的订单数据的关系
	 */
	public void setEtorFkSysId(String etorFkSysId) {
		this.etorFkSysId = etorFkSysId;
		addValidField("etorFkSysId");
	}

	/**
	 * Get 用于标记数据的来源系统
	 */
	@Column(name = "ETOR_SOURCE_SYS_FALG")
	public String getEtorSourceSysFalg() {
		return etorSourceSysFalg;
	}

	/**
	 * Set 用于标记数据的来源系统
	 */
	public void setEtorSourceSysFalg(String etorSourceSysFalg) {
		this.etorSourceSysFalg = etorSourceSysFalg;
		addValidField("etorSourceSysFalg");
	}
	
	/**
	 * Get 订单净重
	 */
	@Column(name = "ETOR_NET_WEIGHT")
	public Double getEtorNetWeight() {
		return etorNetWeight;
	}

	/**
	 * Set 订单净重
	 */
	public void setEtorNetWeight(Double etorNetWeight) {
		this.etorNetWeight = etorNetWeight;
		addValidField("etorNetWeight");
	}
	/**
	 * Get 调度人ID
	 */
	@Column(name = "ETOR_SCHEDULE_ID")
	public Integer getEtorScheduleId() {
		return etorScheduleId;
	}
	/**
	 * Set 调度人ID
	 */
	public void setEtorScheduleId(Integer etorScheduleId) {
		this.etorScheduleId = etorScheduleId;
		addValidField("etorScheduleId");
	}
	/**
	 * Get 调度人姓名
	 */
	@Column(name = "ETOR_SCHEDULE_NAME")
	public String getEtorScheduleName() {
		return etorScheduleName;
	}
	/**
	 * Set 调度人姓名
	 */
	public void setEtorScheduleName(String etorScheduleName) {
		this.etorScheduleName = etorScheduleName;
		addValidField("etorScheduleName");
	}
	@Column(name = "ETOR_RALATION_ID")
	public Integer getEtorRalationId() {
		return etorRalationId;
	}

	public void setEtorRalationId(Integer etorRalationId) {
		this.etorRalationId = etorRalationId;
		addValidField("etorRalationId");
	}
	@Column(name = "ETOR_RALATION_SO_NO")
	public String getEtorRalationSoNo() {
		return etorRalationSoNo;
	}

	public void setEtorRalationSoNo(String etorRalationSoNo) {
		this.etorRalationSoNo = etorRalationSoNo;
		addValidField("etorRalationSoNo");
	}
	@Column(name = "ETOR_THEIR_PLATE")
	public String getEtorTheirPlate() {
		return etorTheirPlate;
	}

	public void setEtorTheirPlate(String etorTheirPlate) {
		this.etorTheirPlate = etorTheirPlate;
		addValidField("etorTheirPlate");
	}
	@Column(name = "ETOR_TOTAL_INCOME")
	public Double getEtorTotalIncome() {
		return etorTotalIncome;
	}

	public void setEtorTotalIncome(Double etorTotalIncome) {
		this.etorTotalIncome = etorTotalIncome;
		addValidField("etorTotalIncome");
	}
	@Column(name = "ETOR_DATA_SOURCE")
	public String getEtorDataSource() {
		return etorDataSource;
	}

	public void setEtorDataSource(String etorDataSource) {
		this.etorDataSource = etorDataSource;
		addValidField("etorDataSource");
	}
	@Column(name = "ETOR_MESSAGE_NAME")
	public String getEtorMessageName() {
		return etorMessageName;
	}

	public void setEtorMessageName(String etorMessageName) {
		this.etorMessageName = etorMessageName;
		addValidField("etorMessageName");
	}
	@Column(name = "ETOR_ORI_SINGLE_NO")
	public String getEtorOriSingleNo() {
		return etorOriSingleNo;
	}

	public void setEtorOriSingleNo(String etorOriSingleNo) {
		this.etorOriSingleNo = etorOriSingleNo;
		addValidField("etorOriSingleNo");
	}

	@Column(name = "ETOR_CREATOR_NAME")
	public String getEtorCreatorName() {
		return etorCreatorName;
	}

	public void setEtorCreatorName(String etorCreatorName) {
		this.etorCreatorName = etorCreatorName;
		addValidField("etorCreatorName");
	}

	@Column(name = "ETOR_CREATOR_EMAIL")
	public String getEtorCreatorEmail() {
		return etorCreatorEmail;
	}

	public void setEtorCreatorEmail(String etorCreatorEmail) {
		this.etorCreatorEmail = etorCreatorEmail;
		addValidField("etorCreatorEmail");
	}

	@Column(name = "ETOR_CREATOR_TEL")
	public String getEtorCreatorTel() {
		return etorCreatorTel;
	}

	public void setEtorCreatorTel(String etorCreatorTel) {
		this.etorCreatorTel = etorCreatorTel;
		addValidField("etorCreatorTel");
	}
	
	@Column(name = "ETOR_COST_STATUS")
	public String getEtorCostStatus() {
		return etorCostStatus;
	}

	public void setEtorCostStatus(String etorCostStatus) {
		this.etorCostStatus = etorCostStatus;
		addValidField("etorCostStatus");
	}
	@Column(name = "ETOR_IS_CHANGE_DELIVERY")
	public String getEtorIsChangeDelivery() {
		return etorIsChangeDelivery;
	}

	public void setEtorIsChangeDelivery(String etorIsChangeDelivery) {
		this.etorIsChangeDelivery = etorIsChangeDelivery;
		addValidField("etorIsChangeDelivery");
	}
	
	/**
	 * Get 订单统计组代码（订单财务代码）
	 */
	@Column(name = "ETOR_F_CODE")
	public String getEtorFCode() {
		return etorFCode;
	}

	/**
	 * Set 订单统计组代码（订单财务代码）
	 */
	public void setEtorFCode(String etorFCode) {
		this.etorFCode = etorFCode;
		addValidField("etorFCode");
	}

	/**
	 * Get 订单BMS票据代码
	 */
	@Column(name = "ETOR_BMS_EBBT_CODE")
	public String getEtorBmsEbbtCode() {
		return etorBmsEbbtCode;
	}

	/**
	 * Set 订单BMS票据代码
	 */
	public void setEtorBmsEbbtCode(String etorBmsEbbtCode) {
		this.etorBmsEbbtCode = etorBmsEbbtCode;
		addValidField("etorBmsEbbtCode");
	}

	/**
	 * Get 订单BMS板块代码
	 */
	@Column(name = "ETOR_BMS_EBOT_CODE")
	public String getEtorBmsEbotCode() {
		return etorBmsEbotCode;
	}

	/**
	 * Set 订单BMS板块代码
	 */
	public void setEtorBmsEbotCode(String etorBmsEbotCode) {
		this.etorBmsEbotCode = etorBmsEbotCode;
		addValidField("etorBmsEbotCode");
	}

	/**
	 * Get 订单BMS部门代码
	 */
	@Column(name = "ETOR_BMS_ESDE_DEPARTMENT_CODE")
	public String getEtorBmsEsdeDepartmentCode() {
		return etorBmsEsdeDepartmentCode;
	}

	/**
	 * Set 订单BMS部门代码
	 */
	public void setEtorBmsEsdeDepartmentCode(String etorBmsEsdeDepartmentCode) {
		this.etorBmsEsdeDepartmentCode = etorBmsEsdeDepartmentCode;
		addValidField("etorBmsEsdeDepartmentCode");
	}

	/**
	 * Get 订单BMS销售人员代码
	 */
	@Column(name = "ETOR_BMS_EBSM_CODE")
	public String getEtorBmsEbsmCode() {
		return etorBmsEbsmCode;
	}

	/**
	 * Set 订单BMS销售人员代码
	 */
	public void setEtorBmsEbsmCode(String etorBmsEbsmCode) {
		this.etorBmsEbsmCode = etorBmsEbsmCode;
		addValidField("etorBmsEbsmCode");
	}

	/**
	 * Get 订单BMS业务类型代码
	 */
	@Column(name = "ETOR_BMS_BUSINESS_CLASS")
	public String getEtorBmsBusinessClass() {
		return etorBmsBusinessClass;
	}

	/**
	 * Set 订单BMS业务类型代码
	 */
	public void setEtorBmsBusinessClass(String etorBmsBusinessClass) {
		this.etorBmsBusinessClass = etorBmsBusinessClass;
		addValidField("etorBmsBusinessClass");
	}

	/**
	 * Get 订单BMS客户代码
	 */
	@Column(name = "ETOR_BMS_A_EBCU_CUSTOMER_NO")
	public String getEtorBmsAEbcuCustomerNo() {
		return etorBmsAEbcuCustomerNo;
	}

	/**
	 * Set 订单BMS客户代码
	 */
	public void setEtorBmsAEbcuCustomerNo(String etorBmsAEbcuCustomerNo) {
		this.etorBmsAEbcuCustomerNo = etorBmsAEbcuCustomerNo;
		addValidField("etorBmsAEbcuCustomerNo");
	}

	/**
	 * Get 订单BMS供应商代码
	 */
	@Column(name = "ETOR_BMS_S_EBCU_CUSTOMER_NO")
	public String getEtorBmsSEbcuCustomerNo() {
		return etorBmsSEbcuCustomerNo;
	}

	/**
	 * Set 订单BMS供应商代码
	 */
	public void setEtorBmsSEbcuCustomerNo(String etorBmsSEbcuCustomerNo) {
		this.etorBmsSEbcuCustomerNo = etorBmsSEbcuCustomerNo;
		addValidField("etorBmsSEbcuCustomerNo");
	}

	/**
	 * Get 订单BMS货物类型
	 */
	@Column(name = "ETOR_BMS_CARGO_TYPE")
	public Long getEtorBmsCargoType() {
		return etorBmsCargoType;
	}

	/**
	 * Set 订单BMS货物类型
	 */
	public void setEtorBmsCargoType(Long etorBmsCargoType) {
		this.etorBmsCargoType = etorBmsCargoType;
		addValidField("etorBmsCargoType");
	}

	/**
	 * Get 订单BMS贸易方式
	 */
	@Column(name = "ETOR_COMMERCE_TYPE")
	public String getEtorCommerceType() {
		return etorCommerceType;
	}

	/**
	 * Set 订单BMS贸易方式
	 */
	public void setEtorCommerceType(String etorCommerceType) {
		this.etorCommerceType = etorCommerceType;
		addValidField("etorCommerceType");
	}

	/**
	 * Get 订单BMS监管方式
	 */
	@Column(name = "ETOR_BMS_MONITOR_TYPE")
	public Long getEtorBmsMonitorType() {
		return etorBmsMonitorType;
	}

	/**
	 * Set 订单BMS监管方式
	 */
	public void setEtorBmsMonitorType(Long etorBmsMonitorType) {
		this.etorBmsMonitorType = etorBmsMonitorType;
		addValidField("etorBmsMonitorType");
	}

	/**
	 * Get 订单BMS计量方式
	 */
	@Column(name = "ETOR_BMS_COUNT_TYPE")
	public Long getEtorBmsCountType() {
		return etorBmsCountType;
	}

	/**
	 * Set 订单BMS计量方式
	 */
	public void setEtorBmsCountType(Long etorBmsCountType) {
		this.etorBmsCountType = etorBmsCountType;
		addValidField("etorBmsCountType");
	}

	/**
	 * @return the etorShipperSendType
	 */
	@Column(name = "ETOR_SHIPPER_SEND_TYPE")
	public String getEtorShipperSendType() {
		return etorShipperSendType;
	}

	/**
	 * @param etorShipperSendType the etorShipperSendType to set
	 */
	public void setEtorShipperSendType(String etorShipperSendType) {
		this.etorShipperSendType = etorShipperSendType;
		addValidField("etorShipperSendType");
	}

	/**
	 * @return the etorConsigneeReceiveType
	 */
	@Column(name = "ETOR_CONSIGNEE_RECEIVE_TYPE")
	public String getEtorConsigneeReceiveType() {
		return etorConsigneeReceiveType;
	}

	/**
	 * @param etorConsigneeReceiveType the etorConsigneeReceiveType to set
	 */
	public void setEtorConsigneeReceiveType(String etorConsigneeReceiveType) {
		this.etorConsigneeReceiveType = etorConsigneeReceiveType;
		addValidField("etorConsigneeReceiveType");
	}
	
	/**
	 * Get "客户支付状态
	 * 全局数据字典：SYS_PAYMENT_STATE0=未支付1=部分支付2=已支付"
	 */
	@Column(name = "ETOR_CHARGEOFF")
	public String getEtorChargeoff() {
		return etorChargeoff;
	}

	/**
	 * Set "客户支付状态
	 * 全局数据字典：SYS_PAYMENT_STATE0=未支付1=部分支付2=已支付"
	 */
	public void setEtorChargeoff(String etorChargeoff) {
		this.etorChargeoff = etorChargeoff;
		addValidField("etorChargeoff");
	}

	/**
	 * Get "付款方式全局数据字典
	 * ：SYS_PAYMENT_MODEC=现金BT=银行转账EP=网上支付"
	 */
	@Column(name = "ETOR_PAYMENT_MODE")
	public String getEtorPaymentMode() {
		return etorPaymentMode;
	}

	/**
	 * Set "付款方式全局数据字典
	 * ：SYS_PAYMENT_MODEC=现金BT=银行转账EP=网上支付"
	 */
	public void setEtorPaymentMode(String etorPaymentMode) {
		this.etorPaymentMode = etorPaymentMode;
		addValidField("etorPaymentMode");
	}

	/**
	 * Get "签收单返还方式公司级数据字典
	 * ：ORG_RECEIPT_RETURNTYPE0=无需签单   1=客户签收单原件返回2=客户签收单传真返回3=运单签收联传真返回"
	 */
	@Column(name = "ETOR_RECEIPT_RETURNTYPE")
	public Integer getEtorReceiptReturntype() {
		return etorReceiptReturntype;
	}

	/**
	 * Set "签收单返还方式公司级数据字典
	 * ：ORG_RECEIPT_RETURNTYPE0=无需签单   1=客户签收单原件返回2=客户签收单传真返回3=运单签收联传真返回"
	 */
	public void setEtorReceiptReturntype(Integer etorReceiptReturntype) {
		this.etorReceiptReturntype = etorReceiptReturntype;
		addValidField("etorReceiptReturntype");
	}

	/**
	 * Get 增值服务保价申明
	 */
	@Column(name = "ETOR_INSURED_VALUE")
	public String getEtorInsuredValue() {
		return etorInsuredValue;
	}

	/**
	 * Set 增值服务保价申明
	 */
	public void setEtorInsuredValue(String etorInsuredValue) {
		this.etorInsuredValue = etorInsuredValue;
		addValidField("etorInsuredValue");
	}
	@Column(name = "ETOR_DISTRICT")
	public String getEtorDistrict() {
		return etorDistrict;
	}

	
	public void setEtorDistrict(String etorDistrict) {
		this.etorDistrict = etorDistrict;
		addValidField("etorDistrict");
	}
	
	@Column(name = "ETOR_DISTRICT_OPT")
	public String getEtorDistrictOpt() {
		return etorDistrictOpt;
	}

	public void setEtorDistrictOpt(String etorDistrictOpt) {
		this.etorDistrictOpt = etorDistrictOpt;
		addValidField("etorDistrictOpt");
	}

}