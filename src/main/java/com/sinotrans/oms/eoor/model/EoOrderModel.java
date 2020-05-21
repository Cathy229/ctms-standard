package com.sinotrans.oms.eoor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.sinotrans.framework.orm.model.BaseModel;
import com.sinotrans.framework.orm.model.OperationLog;

/**
 * Model class for EoOrder
 */
@Entity
@Table(name = "EO_ORDER")
@JsonInclude(JsonInclude.Include.NON_NULL)//20180906 harley jackson转换时忽略空属性不在set。请根据更新逻辑酌情使用
public class EoOrderModel extends BaseModel implements OperationLog {

	//订单主键
	private Integer eoorId;
	//所属分公司
	private Integer eoorEscoId;
	//系统订单号
	private String eoorOrderNo;
	//SO_NO:Shipping
	private String eoorSoNo;
	//DO_NO:Delivery
	private String eoorDoNo;
	//订单笔次
	private String eoorOrderFudeji;
	//客户合同号
	private String eoorContractNo;
	//订单类型:关联基础数据订单类型表
	private Integer eoorEbotId;
	//紧急程度
	private String eoorLevel;
	//订单条码
	private String eoorOrderBarcode;
	//委托方ID
	private Integer eoorConsignorEbcuId;
	//委托方名称
	private String eoorConsignorEbcuNameCn;
	//客户ID
	private Integer eoorCustomEbcuId;
	//客户名称
	private String eoorCustomEbcuNameCn;
	//项目ID
	private Integer eoorEbpjId;
	//项目名称
	private String eoorEbpjName;
	//BU
	private Integer eoorEbbuId;
	//BU名称
	private String eoorEbbuBuName;
	//下单人
	private Integer eoorEbpeId;
	//下单人名称
	private String eoorEbccName;
	//下单时间
	private Date eoorOrderDate;
	//起运地
	private Integer eoorStartEbrgId;
	//起运地名称
	private String eoorStartEbrgNameCn;
	//目的地
	private Integer eoorEndEbrgId;
	//目的地名称
	private String eoorEndEbrgNameCn;
	//双程订单号
	private String eoorDoubleOrder;
	//揽货部门ID
	private Integer eoorEsdeId;
	//揽货部门名称
	private String eoorEsdeName;
	//销售基地
	private Integer eoorSaleEsstId;
	//销售基地名称
	private String eoorSaleEsstName;
	//操作基地
	private Integer eoorOperateEsstId;
	//操作基地名称
	private String eoorOperateEsstName;
	//特殊订单
	private String eoorSpecialOrder;
	//运输类型
	private String eoorTranType;
	//导出日期
	private Date eoorOutDate;
	//订单状态
	private String eoorStatus;
	//订单毛重
	private Double eoorWeight;
	//订单体积
	private Double eoorVolume;
	//订单件数
	private Integer eoorQuantity;
	//要求提货时间
	private Date eoorReqDeliveryDate;
	//要求到达时间
	private Date eoorReqArrivalDate;
	//提货时段
	private String eoorDeliveryPeriod;
	//收货时段
	private String eoorArrivalPeriod;
	//提货公司ID
	private Integer eoorShipperEbspId;
	//提货公司
	private String eoorShipperEbspNameCn;
	//提货公司邮编
	private String eoorShipperEbsaPost;
	//联系人
	private String eoorShipperEbsaContact;
	//发货人联系电话
	private String eoorShipperEbsaTel;
	//提货地址ID
	private Integer eoorShipperEbsaId;
	//提货地址
	private String eoorShipperEbsaAddress;
	//提货区域ID
	private Integer eoorShipperEbrgId;
	//提货区域
	private String eoorShipperEbrgNameCn;
	//提货城市ID
	private Integer eoorShipperEbplId;
	//提货城市
	private String eoorShipperEbplNameCn;
	//收货公司ID
	private Integer eoorConsigneeEbspId;
	//收货人名称
	private String eoorConsigneeEbspNameCn;
	//收货邮编
	private String eoorConsigneeEbsaPost;
	//收货人联系人
	private String eoorConsigneeEbsaContact;
	//收货人联系电话
	private String eoorConsigneeEbsaTel;
	//收货人地址ID
	private Integer eoorConsigneeEbsaId;
	//收货人地址
	private String eoorConsigneeEbsaAddress;
	//收货区域ID
	private Integer eoorConsigneeEbrgId;
	//收货区域
	private String eoorConsigneeEbrgNameCn;
	//收货城市ID
	private Integer eoorConsigneeEbplId;
	//收货城市
	private String eoorConsigneeEbplNameCn;
	//运输特殊要求
	private String eoorTransReq;
	//收货人接货要求
	private String eoorConsigneeReq;
	//单证特殊要求
	private String eoorDocReq;
	//备注
	private String eoorRemark;
	//作废原因
	private String eoorVoidDesc;
	//作废人
	private String eoorVoider;
	//作废时间
	private Date eoorVoiderTime;
	//预留字段
	private Double eoorSubnum2;
	//预留字段
	private Double eoorSubnum3;
	//预留字段
	private Date eoorSubdate3;
	//预留字段
	private Date eoorSubdate4;
	//预留字段
	private Date eoorSubdate5;
	//预留字段
	private Date eoorSubdate2;
	//预留字段
	private Date eoorSubdate1;
	//预留字段
	private String eoorSubstr7;
	//预留字段
	private String eoorSubstr8;
	//预留字段
	private String eoorSubstr6;
	//预留字段
	private String eoorSubstr5;
	//预留字段
	private String eoorSubstr4;
	//预留字段
	private String eoorSubstr3;
	//预留字段
	private String eoorSubstr2;
	//预留字段
	private String eoorSubstr1;
	//预留字段
	private Double eoorSubnum1;
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
	private String eoorQuantityUnit;
	//订单分类
	private String eoorType;
	//订单净重
	private Double eoorNetWeight;
	//订单内部委托ID
	private Integer eoorInnerOrderId;
	//调度人ID
	private Integer eoorScheduleId;
	//调度人姓名
	private String eoorScheduleName;
	//关联订单ID
	private Integer eoorRalationId;
	
	//关联SO NO
	private String eoorRalationSoNo;
	//所属板块
	private String eoorTheirPlate;
	//总收入
	private Double eoorTotalIncome;
	
	//数据来源
	private String eoorDataSource;
	
	//报文名称
	private String eoorMessageName;
	
	//源单票号
	private String eoorOriSingleNo;
	
	//报文委托创建人
	private String eoorCreatorName;
	
	//报文创建人邮箱
	private String eoorCreatorEmail;
	
	//报文创建人手机
	private String eoorCreatorTel;
	
	//费用计算状态,0没有计算，1，只有应收费用，2 只有应付费，3 有应收和应付费用 4，没有应收应付
	private String eoorCostStatus;
	//费用计算结果
	private String eoorFeeResult;//
	
	//是否更改收货地
	private String eoorIsChangeDelivery;
	
	private String eoorSymbol;//EOOR_SYMBOL HD_数据处理标志
	private Date  eoorBeginprocessingtime;// EOOR_BEGINPROCESSINGTIME  HD_数据处理开始时间
	private Date eoorLastmodifiedtime;// EOOR_LASTMODIFIEDTIME HD_数据处理时间
	private String eoorInformation;//	EOOR_INFORMATION HD_数据处理信息
	
	private String eoorInnerOrderNo;//内部委托编号(请求编号)
	
	//调度导出次数
    private Integer eoorExportCount;
    //调度最后导出时间 
    private String eoorLastExportTime;
    //调度导出操作人
    private String eoorExportOperator;
    
  //订单统计组代码（订单财务代码）
	private String eoorFCode;
	//订单BMS票据代码
	private String eoorBmsEbbtCode;
	//订单BMS板块代码
	private String eoorBmsEbotCode;
	//订单BMS部门代码
	private String eoorBmsEsdeDepartmentCode;
	//订单BMS销售人员代码
	private String eoorBmsEbsmCode;
	//订单BMS业务类型代码
	private String eoorBmsBusinessClass;
	//订单BMS客户代码
	private String eoorBmsAEbcuCustomerNo;
	//订单BMS供应商代码
	private String eoorBmsSEbcuCustomerNo;
	//订单BMS货物类型
	private Long eoorBmsCargoType;
	//订单BMS贸易方式
	private String eoorCommerceType;
	//订单BMS监管方式
	private Long eoorBmsMonitorType;
	//订单BMS计量方式
	private Long eoorBmsCountType;
	//提货类型
	private String eoorShipperSendType;
	//收货类型
	private String eoorConsigneeReceiveType;
	// 内委或班线订单ID
	private Integer eoorEntrustEoorId; 
	
	//"客户支付状态
	private String eoorChargeoff;
	//"付款方式全局数据字典
	private String eoorPaymentMode;
	//"签收单返还方式公司级数据字典
	private Integer eoorReceiptReturntype;
	//增值服务保价申明
	private String eoorInsuredValue;

	//订单BMS业务完成时间
	private Date eoorBmsAcmpTime;
	
	//电商订单主键 eoorEcmsEoorId
	private Integer eoorEcmsEoorId;
	
	//销售区域 eoorDistrict
	private String eoorDistrict;
	//操作区域 eoorDistrictOpt
	private String eoorDistrictOpt;
	//托运单条码
	private String eoorConsignBarcode;
	
	//订单费用生成标识（可扩展）,自有成本标识为1，其他类型的标识可向下扩展,按“，”进行分割
	private String eoorCreatefeeFlag;
	
	/*ADD BY TOM 21040704*/
	private Date eoorFrozenfessTimeLimit;
	
    //"付费方标识(“S”代表发货人付费，“R”代表收货人付费
    private  String eoorPayerType;
    
    ////add by Nix 是否导出回执(Y 已导出 N 未导出)
    private  String eoorIsOutReceipt;
    
    //是否接受订单
    private String eoorIsReceive;
    
    //拒绝理由	
    
    private String eoorReason;
    
    //是否结算审核
    private String eoorAuditMark;
    
    private String eoorSinoNo;
    
	@Column(name="EOOR_SINO_NO")
    public String getEoorSinoNo() {
		return eoorSinoNo;
	}

	public void setEoorSinoNo(String eoorSinoNo) {
		this.eoorSinoNo = eoorSinoNo;
		 addValidField("eoorSinoNo");
	}

	@Column(name="EOOR_AUDIT_MARK")
	public String getEoorAuditMark() {
		return eoorAuditMark;
	}

	public void setEoorAuditMark(String eoorAuditMark) {
		this.eoorAuditMark = eoorAuditMark;
		 addValidField("eoorAuditMark");
	}

	/**
    * Get "付费方标识(“S”代表发货人付费，“R”代表收货人付费
    * @return
    */
    @Column(name = "EOOR_PAYER_TYPE")
    public String getEoorPayerType(){
       return eoorPayerType;
    }

    /**
    * Set "付费方标识(“S”代表发货人付费，“R”代表收货人付费
    */
    public void setEoorPayerType(String eoorPayerType){
       this.eoorPayerType = eoorPayerType;
       addValidField("eoorPayerType");
    }


	
	
	@Column(name="EOOR_FROZENFESS_TIMELIMIT")
	public Date getEoorFrozenfessTimeLimit() {
		return eoorFrozenfessTimeLimit;
	}

	public void setEoorFrozenfessTimeLimit(Date eoorFrozenfessTimeLimit) {
		this.eoorFrozenfessTimeLimit = eoorFrozenfessTimeLimit;
		this.addValidField("eoorFrozenfessTimeLimit");
	}
	
	@Column(name="EOOR_CREATEFEE_FLAG")
	public String getEoorCreatefeeFlag() {
		return eoorCreatefeeFlag;
	}

	public void setEoorCreatefeeFlag(String eoorCreatefeeFlag) {
		this.eoorCreatefeeFlag = eoorCreatefeeFlag;
		this.addValidField("eoorCreatefeeFlag");
	}

	@Column(name="EOOR_CONSIGN_BARCODE")
	public String getEoorConsignBarcode() {
		return eoorConsignBarcode;
	}

	public void setEoorConsignBarcode(String eoorConsignBarcode) {
		this.eoorConsignBarcode = eoorConsignBarcode;
		this.addValidField("eoorConsignBarcode");
	}

	@Column(name="EOOR_BMS_ACMP_TIME")
	public Date getEoorBmsAcmpTime() {
		return eoorBmsAcmpTime;
	}

	public void setEoorBmsAcmpTime(Date eoorBmsAcmpTime) {
		this.eoorBmsAcmpTime = eoorBmsAcmpTime;
		this.addValidField("eoorBmsAcmpTime");
	}
   
	@Column(name = "EOOR_ENTRUST_EOOR_ID")
	public Integer getEoorEntrustEoorId() {
		return eoorEntrustEoorId;
	}

	public void setEoorEntrustEoorId(Integer eoorEntrustEoorId) {
		this.eoorEntrustEoorId = eoorEntrustEoorId;
		addValidField("eoorEntrustEoorId");
	}

	@Column(name = "EOOR_LAST_EXPORT_TIME")
    public String getEoorLastExportTime() {
		return eoorLastExportTime;
	}

	public void setEoorLastExportTime(String eoorLastExportTime) {
		this.eoorLastExportTime = eoorLastExportTime;
		addValidField("eoorLastExportTime");
	}

	@Column(name = "EOOR_EXPORT_COUNT")
	public Integer getEoorExportCount() {
		return eoorExportCount;
	}

	public void setEoorExportCount(Integer eoorExportCount) {
		this.eoorExportCount = eoorExportCount;
		addValidField("eoorExportCount");
	}

	@Column(name = "EOOR_EXPORT_OPERATOR")
	public String getEoorExportOperator() {
		return eoorExportOperator;
	}

	public void setEoorExportOperator(String eoorExportOperator) {
		this.eoorExportOperator = eoorExportOperator;
		addValidField("eoorExportOperator");
	}

	@Column(name = "EOOR_INNER_ORDER_NO")
	public String getEoorInnerOrderNo() {
		return eoorInnerOrderNo;
	}

	public void setEoorInnerOrderNo(String eoorInnerOrderNo) {
		this.eoorInnerOrderNo = eoorInnerOrderNo;
		addValidField("eoorInnerOrderNo");
	}

	@Column(name = "EOOR_SYMBOL")
	public String getEoorSymbol() {
		return eoorSymbol;
	}

	public void setEoorSymbol(String eoorSymbol) {
		this.eoorSymbol = eoorSymbol;
		addValidField("eoorSymbol");
	}

	@Column(name = "EOOR_BEGINPROCESSINGTIME")
	public Date getEoorBeginprocessingtime() {
		return eoorBeginprocessingtime;
	}

	public void setEoorBeginprocessingtime(Date eoorBeginprocessingtime) {
		this.eoorBeginprocessingtime = eoorBeginprocessingtime;
		addValidField("eoorBeginprocessingtime");
	}

	@Column(name = "EOOR_LASTMODIFIEDTIME")
	public Date getEoorLastmodifiedtime() {
		return eoorLastmodifiedtime;
	}

	public void setEoorLastmodifiedtime(Date eoorLastmodifiedtime) {
		this.eoorLastmodifiedtime = eoorLastmodifiedtime;
		addValidField("eoorLastmodifiedtime");
	}

	@Column(name = "EOOR_INFORMATION")
	public String getEoorInformation() {
		return eoorInformation;
	}

	public void setEoorInformation(String eoorInformation) {
		this.eoorInformation = eoorInformation;
		addValidField("eoorInformation");
	}

	/**
	 * Get 订单主键
	 */
	@Column(name = "EOOR_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getEoorId() {
		return eoorId;
	}

	/**
	 * Set 订单主键
	 */
	public void setEoorId(Integer eoorId) {
		this.eoorId = eoorId;
		addValidField("eoorId");
	}
	/**
	 * 费用计算结果
	 * @return
	 */
	@Column(name = "EOOR_FEE_RESULT")
	public String getEoorFeeResult() {
		return eoorFeeResult;
	}

	public void setEoorFeeResult(String eoorFeeResult) {
		this.eoorFeeResult = eoorFeeResult;
		addValidField("eoorFeeResult");
	}

	/**
	 * Get 所属分公司
	 */
	@Column(name = "EOOR_ESCO_ID")
	public Integer getEoorEscoId() {
		return eoorEscoId;
	}

	/**
	 * Set 所属分公司
	 */
	public void setEoorEscoId(Integer eoorEscoId) {
		this.eoorEscoId = eoorEscoId;
		addValidField("eoorEscoId");
	}

	/**
	 * Get 系统订单号
	 */
	@Column(name = "EOOR_ORDER_NO")
	public String getEoorOrderNo() {
		return eoorOrderNo;
	}

	/**
	 * Set 系统订单号
	 */
	public void setEoorOrderNo(String eoorOrderNo) {
		this.eoorOrderNo = eoorOrderNo;
		addValidField("eoorOrderNo");
	}

	/**
	 * Get SO_NO:Shipping
	 * Order
	 */
	@Column(name = "EOOR_SO_NO")
	public String getEoorSoNo() {
		return eoorSoNo;
	}

	/**
	 * Set SO_NO:Shipping
	 * Order
	 */
	public void setEoorSoNo(String eoorSoNo) {
		this.eoorSoNo = eoorSoNo;
		addValidField("eoorSoNo");
	}

	/**
	 * Get DO_NO:Delivery
	 * Order
	 */
	@Column(name = "EOOR_DO_NO")
	public String getEoorDoNo() {
		return eoorDoNo;
	}

	/**
	 * Set DO_NO:Delivery
	 * Order
	 */
	public void setEoorDoNo(String eoorDoNo) {
		this.eoorDoNo = eoorDoNo;
		addValidField("eoorDoNo");
	}

	/**
	 * Get 订单笔次
	 */
	@Column(name = "EOOR_ORDER_FUDEJI")
	public String getEoorOrderFudeji() {
		return eoorOrderFudeji;
	}

	/**
	 * Set 订单笔次
	 */
	public void setEoorOrderFudeji(String eoorOrderFudeji) {
		this.eoorOrderFudeji = eoorOrderFudeji;
		addValidField("eoorOrderFudeji");
	}

	/**
	 * Get 客户合同号
	 */
	@Column(name = "EOOR_CONTRACT_NO")
	public String getEoorContractNo() {
		return eoorContractNo;
	}

	/**
	 * Set 客户合同号
	 */
	public void setEoorContractNo(String eoorContractNo) {
		this.eoorContractNo = eoorContractNo;
		addValidField("eoorContractNo");
	}

	/**
	 * Get 订单类型:关联基础数据订单类型表
	 */
	@Column(name = "EOOR_EBOT_ID")
	public Integer getEoorEbotId() {
		return eoorEbotId;
	}

	/**
	 * Set 订单类型:关联基础数据订单类型表
	 */
	public void setEoorEbotId(Integer eoorEbotId) {
		this.eoorEbotId = eoorEbotId;
		addValidField("eoorEbotId");
	}

	/**
	 * Get 紧急程度
	 */
	@Column(name = "EOOR_LEVEL")
	public String getEoorLevel() {
		return eoorLevel;
	}

	/**
	 * Set 紧急程度
	 */
	public void setEoorLevel(String eoorLevel) {
		this.eoorLevel = eoorLevel;
		addValidField("eoorLevel");
	}

	/**
	 * Get 订单条码
	 */
	@Column(name = "EOOR_ORDER_BARCODE")
	public String getEoorOrderBarcode() {
		return eoorOrderBarcode;
	}

	/**
	 * Set 订单条码
	 */
	public void setEoorOrderBarcode(String eoorOrderBarcode) {
		this.eoorOrderBarcode = eoorOrderBarcode;
		addValidField("eoorOrderBarcode");
	}

	/**
	 * Get 委托方ID
	 */
	@Column(name = "EOOR_CONSIGNOR_EBCU_ID")
	public Integer getEoorConsignorEbcuId() {
		return eoorConsignorEbcuId;
	}

	/**
	 * Set 委托方ID
	 */
	public void setEoorConsignorEbcuId(Integer eoorConsignorEbcuId) {
		this.eoorConsignorEbcuId = eoorConsignorEbcuId;
		addValidField("eoorConsignorEbcuId");
	}

	/**
	 * Get 委托方名称
	 */
	@Column(name = "EOOR_CONSIGNOR_EBCU_NAME_CN")
	public String getEoorConsignorEbcuNameCn() {
		return eoorConsignorEbcuNameCn;
	}

	/**
	 * Set 委托方名称
	 */
	public void setEoorConsignorEbcuNameCn(String eoorConsignorEbcuNameCn) {
		this.eoorConsignorEbcuNameCn = eoorConsignorEbcuNameCn;
		addValidField("eoorConsignorEbcuNameCn");
	}

	/**
	 * Get 客户ID
	 */
	@Column(name = "EOOR_CUSTOM_EBCU_ID")
	public Integer getEoorCustomEbcuId() {
		return eoorCustomEbcuId;
	}

	/**
	 * Set 客户ID
	 */
	public void setEoorCustomEbcuId(Integer eoorCustomEbcuId) {
		this.eoorCustomEbcuId = eoorCustomEbcuId;
		addValidField("eoorCustomEbcuId");
	}

	/**
	 * Get 客户名称
	 */
	@Column(name = "EOOR_CUSTOM_EBCU_NAME_CN")
	public String getEoorCustomEbcuNameCn() {
		return eoorCustomEbcuNameCn;
	}

	/**
	 * Set 客户名称
	 */
	public void setEoorCustomEbcuNameCn(String eoorCustomEbcuNameCn) {
		this.eoorCustomEbcuNameCn = eoorCustomEbcuNameCn;
		addValidField("eoorCustomEbcuNameCn");
	}

	/**
	 * Get 项目ID
	 */
	@Column(name = "EOOR_EBPJ_ID")
	public Integer getEoorEbpjId() {
		return eoorEbpjId;
	}

	/**
	 * Set 项目ID
	 */
	public void setEoorEbpjId(Integer eoorEbpjId) {
		this.eoorEbpjId = eoorEbpjId;
		addValidField("eoorEbpjId");
	}

	/**
	 * Get 项目名称
	 */
	@Column(name = "EOOR_EBPJ_NAME")
	public String getEoorEbpjName() {
		return eoorEbpjName;
	}

	/**
	 * Set 项目名称
	 */
	public void setEoorEbpjName(String eoorEbpjName) {
		this.eoorEbpjName = eoorEbpjName;
		addValidField("eoorEbpjName");
	}

	/**
	 * Get BU
	 */
	@Column(name = "EOOR_EBBU_ID")
	public Integer getEoorEbbuId() {
		return eoorEbbuId;
	}

	/**
	 * Set BU
	 */
	public void setEoorEbbuId(Integer eoorEbbuId) {
		this.eoorEbbuId = eoorEbbuId;
		addValidField("eoorEbbuId");
	}

	/**
	 * Get BU名称
	 */
	@Column(name = "EOOR_EBBU_BU_NAME")
	public String getEoorEbbuBuName() {
		return eoorEbbuBuName;
	}

	/**
	 * Set BU名称
	 */
	public void setEoorEbbuBuName(String eoorEbbuBuName) {
		this.eoorEbbuBuName = eoorEbbuBuName;
		addValidField("eoorEbbuBuName");
	}

	/**
	 * Get 下单人
	 */
	@Column(name = "EOOR_EBPE_ID")
	public Integer getEoorEbpeId() {
		return eoorEbpeId;
	}

	/**
	 * Set 下单人
	 */
	public void setEoorEbpeId(Integer eoorEbpeId) {
		this.eoorEbpeId = eoorEbpeId;
		addValidField("eoorEbpeId");
	}

	/**
	 * Get 下单人名称
	 */
	@Column(name = "EOOR_EBCC_NAME")
	public String getEoorEbccName() {
		return eoorEbccName;
	}

	/**
	 * Set 下单人名称
	 */
	public void setEoorEbccName(String eoorEbccName) {
		this.eoorEbccName = eoorEbccName;
		addValidField("eoorEbccName");
	}

	/**
	 * Get 下单时间
	 */
	@Column(name = "EOOR_ORDER_DATE")
	public Date getEoorOrderDate() {
		return eoorOrderDate;
	}

	/**
	 * Set 下单时间
	 */
	public void setEoorOrderDate(Date eoorOrderDate) {
		this.eoorOrderDate = eoorOrderDate;
		addValidField("eoorOrderDate");
	}

	/**
	 * Get 起运地
	 */
	@Column(name = "EOOR_START_EBRG_ID")
	public Integer getEoorStartEbrgId() {
		return eoorStartEbrgId;
	}

	/**
	 * Set 起运地
	 */
	public void setEoorStartEbrgId(Integer eoorStartEbrgId) {
		this.eoorStartEbrgId = eoorStartEbrgId;
		addValidField("eoorStartEbrgId");
	}

	/**
	 * Get 起运地名称
	 */
	@Column(name = "EOOR_START_EBRG_NAME_CN")
	public String getEoorStartEbrgNameCn() {
		return eoorStartEbrgNameCn;
	}

	/**
	 * Set 起运地名称
	 */
	public void setEoorStartEbrgNameCn(String eoorStartEbrgNameCn) {
		this.eoorStartEbrgNameCn = eoorStartEbrgNameCn;
		addValidField("eoorStartEbrgNameCn");
	}

	/**
	 * Get 目的地
	 */
	@Column(name = "EOOR_END_EBRG_ID")
	public Integer getEoorEndEbrgId() {
		return eoorEndEbrgId;
	}

	/**
	 * Set 目的地
	 */
	public void setEoorEndEbrgId(Integer eoorEndEbrgId) {
		this.eoorEndEbrgId = eoorEndEbrgId;
		addValidField("eoorEndEbrgId");
	}

	/**
	 * Get 目的地名称
	 */
	@Column(name = "EOOR_END_EBRG_NAME_CN")
	public String getEoorEndEbrgNameCn() {
		return eoorEndEbrgNameCn;
	}

	/**
	 * Set 目的地名称
	 */
	public void setEoorEndEbrgNameCn(String eoorEndEbrgNameCn) {
		this.eoorEndEbrgNameCn = eoorEndEbrgNameCn;
		addValidField("eoorEndEbrgNameCn");
	}

	/**
	 * Get 双程订单号
	 */
	@Column(name = "EOOR_DOUBLE_ORDER")
	public String getEoorDoubleOrder() {
		return eoorDoubleOrder;
	}

	/**
	 * Set 双程订单号
	 */
	public void setEoorDoubleOrder(String eoorDoubleOrder) {
		this.eoorDoubleOrder = eoorDoubleOrder;
		addValidField("eoorDoubleOrder");
	}

	/**
	 * Get 揽货部门ID
	 */
	@Column(name = "EOOR_ESDE_ID")
	public Integer getEoorEsdeId() {
		return eoorEsdeId;
	}

	/**
	 * Set 揽货部门ID
	 */
	public void setEoorEsdeId(Integer eoorEsdeId) {
		this.eoorEsdeId = eoorEsdeId;
		addValidField("eoorEsdeId");
	}

	/**
	 * Get 揽货部门名称
	 */
	@Column(name = "EOOR_ESDE_NAME")
	public String getEoorEsdeName() {
		return eoorEsdeName;
	}

	/**
	 * Set 揽货部门名称
	 */
	public void setEoorEsdeName(String eoorEsdeName) {
		this.eoorEsdeName = eoorEsdeName;
		addValidField("eoorEsdeName");
	}

	/**
	 * Get 销售基地
	 */
	@Column(name = "EOOR_SALE_ESST_ID")
	public Integer getEoorSaleEsstId() {
		return eoorSaleEsstId;
	}

	/**
	 * Set 销售基地
	 */
	public void setEoorSaleEsstId(Integer eoorSaleEsstId) {
		this.eoorSaleEsstId = eoorSaleEsstId;
		addValidField("eoorSaleEsstId");
	}

	/**
	 * Get 销售基地名称
	 */
	@Column(name = "EOOR_SALE_ESST_NAME")
	public String getEoorSaleEsstName() {
		return eoorSaleEsstName;
	}

	/**
	 * Set 销售基地名称
	 */
	public void setEoorSaleEsstName(String eoorSaleEsstName) {
		this.eoorSaleEsstName = eoorSaleEsstName;
		addValidField("eoorSaleEsstName");
	}

	/**
	 * Get 操作基地
	 */
	@Column(name = "EOOR_OPERATE_ESST_ID")
	public Integer getEoorOperateEsstId() {
		return eoorOperateEsstId;
	}

	/**
	 * Set 操作基地
	 */
	public void setEoorOperateEsstId(Integer eoorOperateEsstId) {
		this.eoorOperateEsstId = eoorOperateEsstId;
		addValidField("eoorOperateEsstId");
	}

	/**
	 * Get 操作基地名称
	 */
	@Column(name = "EOOR_OPERATE_ESST_NAME")
	public String getEoorOperateEsstName() {
		return eoorOperateEsstName;
	}

	/**
	 * Set 操作基地名称
	 */
	public void setEoorOperateEsstName(String eoorOperateEsstName) {
		this.eoorOperateEsstName = eoorOperateEsstName;
		addValidField("eoorOperateEsstName");
	}

	/**
	 * Get 特殊订单
	 */
	@Column(name = "EOOR_SPECIAL_ORDER")
	public String getEoorSpecialOrder() {
		return eoorSpecialOrder;
	}

	/**
	 * Set 特殊订单
	 */
	public void setEoorSpecialOrder(String eoorSpecialOrder) {
		this.eoorSpecialOrder = eoorSpecialOrder;
		addValidField("eoorSpecialOrder");
	}

	/**
	 * Get 运输类型
	 */
	@Column(name = "EOOR_TRAN_TYPE")
	public String getEoorTranType() {
		return eoorTranType;
	}

	/**
	 * Set 运输类型
	 */
	public void setEoorTranType(String eoorTranType) {
		this.eoorTranType = eoorTranType;
		addValidField("eoorTranType");
	}

	/**
	 * Get 导出日期
	 */
	@Column(name = "EOOR_OUT_DATE")
	public Date getEoorOutDate() {
		return eoorOutDate;
	}

	/**
	 * Set 导出日期
	 */
	public void setEoorOutDate(Date eoorOutDate) {
		this.eoorOutDate = eoorOutDate;
		addValidField("eoorOutDate");
	}

	/**
	 * Get 订单状态
	 */
	@Column(name = "EOOR_STATUS")
	public String getEoorStatus() {
		return eoorStatus;
	}

	/**
	 * Set 订单状态
	 */
	public void setEoorStatus(String eoorStatus) {
		this.eoorStatus = eoorStatus;
		addValidField("eoorStatus");
	}

	/**
	 * Get 订单毛重
	 */
	@Column(name = "EOOR_WEIGHT")
	public Double getEoorWeight() {
		return eoorWeight;
	}

	/**
	 * Set 订单毛重
	 */
	public void setEoorWeight(Double eoorWeight) {
		this.eoorWeight = eoorWeight;
		addValidField("eoorWeight");
	}

	/**
	 * Get 订单体积
	 */
	@Column(name = "EOOR_VOLUME")
	public Double getEoorVolume() {
		return eoorVolume;
	}

	/**
	 * Set 订单体积
	 */
	public void setEoorVolume(Double eoorVolume) {
		this.eoorVolume = eoorVolume;
		addValidField("eoorVolume");
	}

	/**
	 * Get 订单件数
	 */
	@Column(name = "EOOR_QUANTITY")
	public Integer getEoorQuantity() {
		return eoorQuantity;
	}

	/**
	 * Set 订单件数
	 */
	public void setEoorQuantity(Integer eoorQuantity) {
		this.eoorQuantity = eoorQuantity;
		addValidField("eoorQuantity");
	}

	/**
	 * Get 要求提货时间
	 */
	@Column(name = "EOOR_REQ_DELIVERY_DATE")
	public Date getEoorReqDeliveryDate() {
		return eoorReqDeliveryDate;
	}

	/**
	 * Set 要求提货时间
	 */
	public void setEoorReqDeliveryDate(Date eoorReqDeliveryDate) {
		this.eoorReqDeliveryDate = eoorReqDeliveryDate;
		addValidField("eoorReqDeliveryDate");
	}

	/**
	 * Get 要求到达时间
	 */
	@Column(name = "EOOR_REQ_ARRIVAL_DATE")
	public Date getEoorReqArrivalDate() {
		return eoorReqArrivalDate;
	}

	/**
	 * Set 要求到达时间
	 */
	public void setEoorReqArrivalDate(Date eoorReqArrivalDate) {
		this.eoorReqArrivalDate = eoorReqArrivalDate;
		addValidField("eoorReqArrivalDate");
	}

	/**
	 * Get 提货时段
	 */
	@Column(name = "EOOR_DELIVERY_PERIOD")
	public String getEoorDeliveryPeriod() {
		return eoorDeliveryPeriod;
	}

	/**
	 * Set 提货时段
	 */
	public void setEoorDeliveryPeriod(String eoorDeliveryPeriod) {
		this.eoorDeliveryPeriod = eoorDeliveryPeriod;
		addValidField("eoorDeliveryPeriod");
	}

	/**
	 * Get 收货时段
	 */
	@Column(name = "EOOR_ARRIVAL_PERIOD")
	public String getEoorArrivalPeriod() {
		return eoorArrivalPeriod;
	}

	/**
	 * Set 收货时段
	 */
	public void setEoorArrivalPeriod(String eoorArrivalPeriod) {
		this.eoorArrivalPeriod = eoorArrivalPeriod;
		addValidField("eoorArrivalPeriod");
	}

	/**
	 * Get 提货公司ID
	 */
	@Column(name = "EOOR_SHIPPER_EBSP_ID")
	public Integer getEoorShipperEbspId() {
		return eoorShipperEbspId;
	}

	/**
	 * Set 提货公司ID
	 */
	public void setEoorShipperEbspId(Integer eoorShipperEbspId) {
		this.eoorShipperEbspId = eoorShipperEbspId;
		addValidField("eoorShipperEbspId");
	}

	/**
	 * Get 提货公司
	 */
	@Column(name = "EOOR_SHIPPER_EBSP_NAME_CN")
	public String getEoorShipperEbspNameCn() {
		return eoorShipperEbspNameCn;
	}

	/**
	 * Set 提货公司
	 */
	public void setEoorShipperEbspNameCn(String eoorShipperEbspNameCn) {
		this.eoorShipperEbspNameCn = eoorShipperEbspNameCn;
		addValidField("eoorShipperEbspNameCn");
	}

	/**
	 * Get 提货公司邮编
	 */
	@Column(name = "EOOR_SHIPPER_EBSA_POST")
	public String getEoorShipperEbsaPost() {
		return eoorShipperEbsaPost;
	}

	/**
	 * Set 提货公司邮编
	 */
	public void setEoorShipperEbsaPost(String eoorShipperEbsaPost) {
		this.eoorShipperEbsaPost = eoorShipperEbsaPost;
		addValidField("eoorShipperEbsaPost");
	}

	/**
	 * Get 联系人
	 */
	@Column(name = "EOOR_SHIPPER_EBSA_CONTACT")
	public String getEoorShipperEbsaContact() {
		return eoorShipperEbsaContact;
	}

	/**
	 * Set 联系人
	 */
	public void setEoorShipperEbsaContact(String eoorShipperEbsaContact) {
		this.eoorShipperEbsaContact = eoorShipperEbsaContact;
		addValidField("eoorShipperEbsaContact");
	}

	/**
	 * Get 发货人联系电话
	 */
	@Column(name = "EOOR_SHIPPER_EBSA_TEL")
	public String getEoorShipperEbsaTel() {
		return eoorShipperEbsaTel;
	}

	/**
	 * Set 发货人联系电话
	 */
	public void setEoorShipperEbsaTel(String eoorShipperEbsaTel) {
		this.eoorShipperEbsaTel = eoorShipperEbsaTel;
		addValidField("eoorShipperEbsaTel");
	}

	/**
	 * Get 提货地址ID
	 */
	@Column(name = "EOOR_SHIPPER_EBSA_ID")
	public Integer getEoorShipperEbsaId() {
		return eoorShipperEbsaId;
	}

	/**
	 * Set 提货地址ID
	 */
	public void setEoorShipperEbsaId(Integer eoorShipperEbsaId) {
		this.eoorShipperEbsaId = eoorShipperEbsaId;
		addValidField("eoorShipperEbsaId");
	}

	/**
	 * Get 提货地址
	 */
	@Column(name = "EOOR_SHIPPER_EBSA_ADDRESS")
	public String getEoorShipperEbsaAddress() {
		return eoorShipperEbsaAddress;
	}

	/**
	 * Set 提货地址
	 */
	public void setEoorShipperEbsaAddress(String eoorShipperEbsaAddress) {
		this.eoorShipperEbsaAddress = eoorShipperEbsaAddress;
		addValidField("eoorShipperEbsaAddress");
	}

	/**
	 * Get 提货区域ID
	 */
	@Column(name = "EOOR_SHIPPER_EBRG_ID")
	public Integer getEoorShipperEbrgId() {
		return eoorShipperEbrgId;
	}

	/**
	 * Set 提货区域ID
	 */
	public void setEoorShipperEbrgId(Integer eoorShipperEbrgId) {
		this.eoorShipperEbrgId = eoorShipperEbrgId;
		addValidField("eoorShipperEbrgId");
	}

	/**
	 * Get 提货区域
	 */
	@Column(name = "EOOR_SHIPPER_EBRG_NAME_CN")
	public String getEoorShipperEbrgNameCn() {
		return eoorShipperEbrgNameCn;
	}

	/**
	 * Set 提货区域
	 */
	public void setEoorShipperEbrgNameCn(String eoorShipperEbrgNameCn) {
		this.eoorShipperEbrgNameCn = eoorShipperEbrgNameCn;
		addValidField("eoorShipperEbrgNameCn");
	}

	/**
	 * Get 提货城市ID
	 */
	@Column(name = "EOOR_SHIPPER_EBPL_ID")
	public Integer getEoorShipperEbplId() {
		return eoorShipperEbplId;
	}

	/**
	 * Set 提货城市ID
	 */
	public void setEoorShipperEbplId(Integer eoorShipperEbplId) {
		this.eoorShipperEbplId = eoorShipperEbplId;
		addValidField("eoorShipperEbplId");
	}

	/**
	 * Get 提货城市
	 */
	@Column(name = "EOOR_SHIPPER_EBPL_NAME_CN")
	public String getEoorShipperEbplNameCn() {
		return eoorShipperEbplNameCn;
	}

	/**
	 * Set 提货城市
	 */
	public void setEoorShipperEbplNameCn(String eoorShipperEbplNameCn) {
		this.eoorShipperEbplNameCn = eoorShipperEbplNameCn;
		addValidField("eoorShipperEbplNameCn");
	}

	/**
	 * Get 收货公司ID
	 */
	@Column(name = "EOOR_CONSIGNEE_EBSP_ID")
	public Integer getEoorConsigneeEbspId() {
		return eoorConsigneeEbspId;
	}

	/**
	 * Set 收货公司ID
	 */
	public void setEoorConsigneeEbspId(Integer eoorConsigneeEbspId) {
		this.eoorConsigneeEbspId = eoorConsigneeEbspId;
		addValidField("eoorConsigneeEbspId");
	}

	/**
	 * Get 收货人名称
	 */
	@Column(name = "EOOR_CONSIGNEE_EBSP_NAME_CN")
	public String getEoorConsigneeEbspNameCn() {
		return eoorConsigneeEbspNameCn;
	}

	/**
	 * Set 收货人名称
	 */
	public void setEoorConsigneeEbspNameCn(String eoorConsigneeEbspNameCn) {
		this.eoorConsigneeEbspNameCn = eoorConsigneeEbspNameCn;
		addValidField("eoorConsigneeEbspNameCn");
	}

	/**
	 * Get 收货邮编
	 */
	@Column(name = "EOOR_CONSIGNEE_EBSA_POST")
	public String getEoorConsigneeEbsaPost() {
		return eoorConsigneeEbsaPost;
	}

	/**
	 * Set 收货邮编
	 */
	public void setEoorConsigneeEbsaPost(String eoorConsigneeEbsaPost) {
		this.eoorConsigneeEbsaPost = eoorConsigneeEbsaPost;
		addValidField("eoorConsigneeEbsaPost");
	}

	/**
	 * Get 收货人联系人
	 */
	@Column(name = "EOOR_CONSIGNEE_EBSA_CONTACT")
	public String getEoorConsigneeEbsaContact() {
		return eoorConsigneeEbsaContact;
	}

	/**
	 * Set 收货人联系人
	 */
	public void setEoorConsigneeEbsaContact(String eoorConsigneeEbsaContact) {
		this.eoorConsigneeEbsaContact = eoorConsigneeEbsaContact;
		addValidField("eoorConsigneeEbsaContact");
	}

	/**
	 * Get 收货人联系电话
	 */
	@Column(name = "EOOR_CONSIGNEE_EBSA_TEL")
	public String getEoorConsigneeEbsaTel() {
		return eoorConsigneeEbsaTel;
	}

	/**
	 * Set 收货人联系电话
	 */
	public void setEoorConsigneeEbsaTel(String eoorConsigneeEbsaTel) {
		this.eoorConsigneeEbsaTel = eoorConsigneeEbsaTel;
		addValidField("eoorConsigneeEbsaTel");
	}

	/**
	 * Get 收货人地址ID
	 */
	@Column(name = "EOOR_CONSIGNEE_EBSA_ID")
	public Integer getEoorConsigneeEbsaId() {
		return eoorConsigneeEbsaId;
	}

	/**
	 * Set 收货人地址ID
	 */
	public void setEoorConsigneeEbsaId(Integer eoorConsigneeEbsaId) {
		this.eoorConsigneeEbsaId = eoorConsigneeEbsaId;
		addValidField("eoorConsigneeEbsaId");
	}

	/**
	 * Get 收货人地址
	 */
	@Column(name = "EOOR_CONSIGNEE_EBSA_ADDRESS")
	public String getEoorConsigneeEbsaAddress() {
		return eoorConsigneeEbsaAddress;
	}

	/**
	 * Set 收货人地址
	 */
	public void setEoorConsigneeEbsaAddress(String eoorConsigneeEbsaAddress) {
		this.eoorConsigneeEbsaAddress = eoorConsigneeEbsaAddress;
		addValidField("eoorConsigneeEbsaAddress");
	}

	/**
	 * Get 收货区域ID
	 */
	@Column(name = "EOOR_CONSIGNEE_EBRG_ID")
	public Integer getEoorConsigneeEbrgId() {
		return eoorConsigneeEbrgId;
	}

	/**
	 * Set 收货区域ID
	 */
	public void setEoorConsigneeEbrgId(Integer eoorConsigneeEbrgId) {
		this.eoorConsigneeEbrgId = eoorConsigneeEbrgId;
		addValidField("eoorConsigneeEbrgId");
	}

	/**
	 * Get 收货区域
	 */
	@Column(name = "EOOR_CONSIGNEE_EBRG_NAME_CN")
	public String getEoorConsigneeEbrgNameCn() {
		return eoorConsigneeEbrgNameCn;
	}

	/**
	 * Set 收货区域
	 */
	public void setEoorConsigneeEbrgNameCn(String eoorConsigneeEbrgNameCn) {
		this.eoorConsigneeEbrgNameCn = eoorConsigneeEbrgNameCn;
		addValidField("eoorConsigneeEbrgNameCn");
	}

	/**
	 * Get 收货城市ID
	 */
	@Column(name = "EOOR_CONSIGNEE_EBPL_ID")
	public Integer getEoorConsigneeEbplId() {
		return eoorConsigneeEbplId;
	}

	/**
	 * Set 收货城市ID
	 */
	public void setEoorConsigneeEbplId(Integer eoorConsigneeEbplId) {
		this.eoorConsigneeEbplId = eoorConsigneeEbplId;
		addValidField("eoorConsigneeEbplId");
	}

	/**
	 * Get 收货城市
	 */
	@Column(name = "EOOR_CONSIGNEE_EBPL_NAME_CN")
	public String getEoorConsigneeEbplNameCn() {
		return eoorConsigneeEbplNameCn;
	}

	/**
	 * Set 收货城市
	 */
	public void setEoorConsigneeEbplNameCn(String eoorConsigneeEbplNameCn) {
		this.eoorConsigneeEbplNameCn = eoorConsigneeEbplNameCn;
		addValidField("eoorConsigneeEbplNameCn");
	}

	/**
	 * Get 运输特殊要求
	 */
	@Column(name = "EOOR_TRANS_REQ")
	public String getEoorTransReq() {
		return eoorTransReq;
	}

	/**
	 * Set 运输特殊要求
	 */
	public void setEoorTransReq(String eoorTransReq) {
		this.eoorTransReq = eoorTransReq;
		addValidField("eoorTransReq");
	}

	/**
	 * Get 收货人接货要求
	 */
	@Column(name = "EOOR_CONSIGNEE_REQ")
	public String getEoorConsigneeReq() {
		return eoorConsigneeReq;
	}

	/**
	 * Set 收货人接货要求
	 */
	public void setEoorConsigneeReq(String eoorConsigneeReq) {
		this.eoorConsigneeReq = eoorConsigneeReq;
		addValidField("eoorConsigneeReq");
	}

	/**
	 * Get 单证特殊要求
	 */
	@Column(name = "EOOR_DOC_REQ")
	public String getEoorDocReq() {
		return eoorDocReq;
	}

	/**
	 * Set 单证特殊要求
	 */
	public void setEoorDocReq(String eoorDocReq) {
		this.eoorDocReq = eoorDocReq;
		addValidField("eoorDocReq");
	}

	/**
	 * Get 备注
	 */
	@Column(name = "EOOR_REMARK")
	public String getEoorRemark() {
		return eoorRemark;
	}

	/**
	 * Set 备注
	 */
	public void setEoorRemark(String eoorRemark) {
		this.eoorRemark = eoorRemark;
		addValidField("eoorRemark");
	}

	/**
	 * Get 作废原因
	 */
	@Column(name = "EOOR_VOID_DESC")
	public String getEoorVoidDesc() {
		return eoorVoidDesc;
	}

	/**
	 * Set 作废原因
	 */
	public void setEoorVoidDesc(String eoorVoidDesc) {
		this.eoorVoidDesc = eoorVoidDesc;
		addValidField("eoorVoidDesc");
	}

	/**
	 * Get 作废人
	 */
	@Column(name = "EOOR_VOIDER")
	public String getEoorVoider() {
		return eoorVoider;
	}

	/**
	 * Set 作废人
	 */
	public void setEoorVoider(String eoorVoider) {
		this.eoorVoider = eoorVoider;
		addValidField("eoorVoider");
	}

	/**
	 * Get 作废时间
	 */
	@Column(name = "EOOR_VOIDER_TIME")
	public Date getEoorVoiderTime() {
		return eoorVoiderTime;
	}

	/**
	 * Set 作废时间
	 */
	public void setEoorVoiderTime(Date eoorVoiderTime) {
		this.eoorVoiderTime = eoorVoiderTime;
		addValidField("eoorVoiderTime");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOR_SUBNUM2")
	public Double getEoorSubnum2() {
		return eoorSubnum2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoorSubnum2(Double eoorSubnum2) {
		this.eoorSubnum2 = eoorSubnum2;
		addValidField("eoorSubnum2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOR_SUBNUM3")
	public Double getEoorSubnum3() {
		return eoorSubnum3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoorSubnum3(Double eoorSubnum3) {
		this.eoorSubnum3 = eoorSubnum3;
		addValidField("eoorSubnum3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOR_SUBDATE3")
	public Date getEoorSubdate3() {
		return eoorSubdate3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoorSubdate3(Date eoorSubdate3) {
		this.eoorSubdate3 = eoorSubdate3;
		addValidField("eoorSubdate3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOR_SUBDATE4")
	public Date getEoorSubdate4() {
		return eoorSubdate4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoorSubdate4(Date eoorSubdate4) {
		this.eoorSubdate4 = eoorSubdate4;
		addValidField("eoorSubdate4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOR_SUBDATE5")
	public Date getEoorSubdate5() {
		return eoorSubdate5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoorSubdate5(Date eoorSubdate5) {
		this.eoorSubdate5 = eoorSubdate5;
		addValidField("eoorSubdate5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOR_SUBDATE2")
	public Date getEoorSubdate2() {
		return eoorSubdate2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoorSubdate2(Date eoorSubdate2) {
		this.eoorSubdate2 = eoorSubdate2;
		addValidField("eoorSubdate2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOR_SUBDATE1")
	public Date getEoorSubdate1() {
		return eoorSubdate1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoorSubdate1(Date eoorSubdate1) {
		this.eoorSubdate1 = eoorSubdate1;
		addValidField("eoorSubdate1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOR_SUBSTR7")
	public String getEoorSubstr7() {
		return eoorSubstr7;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoorSubstr7(String eoorSubstr7) {
		this.eoorSubstr7 = eoorSubstr7;
		addValidField("eoorSubstr7");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOR_SUBSTR8")
	public String getEoorSubstr8() {
		return eoorSubstr8;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoorSubstr8(String eoorSubstr8) {
		this.eoorSubstr8 = eoorSubstr8;
		addValidField("eoorSubstr8");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOR_SUBSTR6")
	public String getEoorSubstr6() {
		return eoorSubstr6;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoorSubstr6(String eoorSubstr6) {
		this.eoorSubstr6 = eoorSubstr6;
		addValidField("eoorSubstr6");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOR_SUBSTR5")
	public String getEoorSubstr5() {
		return eoorSubstr5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoorSubstr5(String eoorSubstr5) {
		this.eoorSubstr5 = eoorSubstr5;
		addValidField("eoorSubstr5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOR_SUBSTR4")
	public String getEoorSubstr4() {
		return eoorSubstr4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoorSubstr4(String eoorSubstr4) {
		this.eoorSubstr4 = eoorSubstr4;
		addValidField("eoorSubstr4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOR_SUBSTR3")
	public String getEoorSubstr3() {
		return eoorSubstr3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoorSubstr3(String eoorSubstr3) {
		this.eoorSubstr3 = eoorSubstr3;
		addValidField("eoorSubstr3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOR_SUBSTR2")
	public String getEoorSubstr2() {
		return eoorSubstr2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoorSubstr2(String eoorSubstr2) {
		this.eoorSubstr2 = eoorSubstr2;
		addValidField("eoorSubstr2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOR_SUBSTR1")
	public String getEoorSubstr1() {
		return eoorSubstr1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoorSubstr1(String eoorSubstr1) {
		this.eoorSubstr1 = eoorSubstr1;
		addValidField("eoorSubstr1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOR_SUBNUM1")
	public Double getEoorSubnum1() {
		return eoorSubnum1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoorSubnum1(Double eoorSubnum1) {
		this.eoorSubnum1 = eoorSubnum1;
		addValidField("eoorSubnum1");
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
	@Column(name = "EOOR_QUANTITY_UNIT")
	public String getEoorQuantityUnit() {
		return eoorQuantityUnit;
	}

	/**
	 * Set 订单件数单位
	 */
	public void setEoorQuantityUnit(String eoorQuantityUnit) {
		this.eoorQuantityUnit = eoorQuantityUnit;
		addValidField("eoorQuantityUnit");
	}
	/**
	 * Get 订单分类
	 */
	@Column(name = "EOOR_TYPE")
	public String getEoorType() {
		return eoorType;
	}
	/**
	 * Set 订单分类
	 */
	public void setEoorType(String eoorType) {
		this.eoorType = eoorType;
		addValidField("eoorType");
	}
	
	/**
	 * Get 订单净重
	 */
	@Column(name = "EOOR_NET_WEIGHT")
	public Double getEoorNetWeight() {
		return eoorNetWeight;
	}

	/**
	 * Set 订单净重
	 */
	public void setEoorNetWeight(Double eoorNetWeight) {
		this.eoorNetWeight = eoorNetWeight;
		addValidField("eoorNetWeight");
	}
	
	/**
	 * Get 内部委托ID
	 */
	@Column(name = "EOOR_INNER_ORDER_ID")
	public Integer getEoorInnerOrderId() {
		return eoorInnerOrderId;
	}
	
	/**
	 * Set 内部委托ID
	 */
	public void setEoorInnerOrderId(Integer eoorInnerOrderId) {
		this.eoorInnerOrderId = eoorInnerOrderId;
		addValidField("eoorInnerOrderId");
	}
	/**
	 * Get 调度人ID
	 */
	@Column(name = "EOOR_SCHEDULE_ID")
	public Integer getEoorScheduleId() {
		return eoorScheduleId;
	}
	/**
	 * Set 调度人ID
	 */
	public void setEoorScheduleId(Integer eoorScheduleId) {
		this.eoorScheduleId = eoorScheduleId;
		addValidField("eoorScheduleId");
	}
	/**
	 * Get 调度人姓名
	 */
	@Column(name = "EOOR_SCHEDULE_NAME")
	public String getEoorScheduleName() {
		return eoorScheduleName;
	}
	/**
	 * Set 调度人姓名
	 */
	public void setEoorScheduleName(String eoorScheduleName) {
		this.eoorScheduleName = eoorScheduleName;
		addValidField("eoorScheduleName");
	}
	@Column(name = "EOOR_RALATION_ID")
	public Integer getEoorRalationId() {
		return eoorRalationId;
	}

	public void setEoorRalationId(Integer eoorRalationId) {
		this.eoorRalationId = eoorRalationId;
		addValidField("eoorRalationId");
	}
	
	@Column(name = "EOOR_RALATION_SO_NO")
	public String getEoorRalationSoNo() {
		return eoorRalationSoNo;
	}

	public void setEoorRalationSoNo(String eoorRalationSoNo) {
		this.eoorRalationSoNo = eoorRalationSoNo;
		addValidField("eoorRalationSoNo");
	}
	@Column(name = "EOOR_THEIR_PLATE")
	public String getEoorTheirPlate() {
		return eoorTheirPlate;
	}

	public void setEoorTheirPlate(String eoorTheirPlate) {
		this.eoorTheirPlate = eoorTheirPlate;
		addValidField("eoorTheirPlate");
	}
	@Column(name = "EOOR_TOTAL_INCOME")
	public Double getEoorTotalIncome() {
		return eoorTotalIncome;
	}

	public void setEoorTotalIncome(Double eoorTotalIncome) {
		this.eoorTotalIncome = eoorTotalIncome;
		addValidField("eoorTotalIncome");
	}
	@Column(name = "EOOR_DATA_SOURCE")
	public String getEoorDataSource() {
		return eoorDataSource;
	}

	public void setEoorDataSource(String eoorDataSource) {
		this.eoorDataSource = eoorDataSource;
		addValidField("eoorDataSource");
	}
	@Column(name = "EOOR_MESSAGE_NAME")
	public String getEoorMessageName() {
		return eoorMessageName;
	}

	public void setEoorMessageName(String eoorMessageName) {
		this.eoorMessageName = eoorMessageName;
		addValidField("eoorMessageName");
	}
	@Column(name = "EOOR_ORI_SINGLE_NO")
	public String getEoorOriSingleNo() {
		return eoorOriSingleNo;
	}

	public void setEoorOriSingleNo(String eoorOriSingleNo) {
		this.eoorOriSingleNo = eoorOriSingleNo;
		addValidField("eoorOriSingleNo");
	}

	@Column(name = "EOOR_CREATOR_NAME")
	public String getEoorCreatorName() {
		return eoorCreatorName;
	}

	public void setEoorCreatorName(String eoorCreatorName) {
		this.eoorCreatorName = eoorCreatorName;
		addValidField("eoorCreatorName");
	}

	@Column(name = "EOOR_CREATOR_EMAIL")
	public String getEoorCreatorEmail() {
		return eoorCreatorEmail;
	}

	public void setEoorCreatorEmail(String eoorCreatorEmail) {
		this.eoorCreatorEmail = eoorCreatorEmail;
		addValidField("eoorCreatorEmail");
	}

	@Column(name = "EOOR_CREATOR_TEL")
	public String getEoorCreatorTel() {
		return eoorCreatorTel;
	}

	public void setEoorCreatorTel(String eoorCreatorTel) {
		this.eoorCreatorTel = eoorCreatorTel;
		addValidField("eoorCreatorTel");
	}

	@Column(name = "EOOR_COST_STATUS")
	public String getEoorCostStatus() {
		return eoorCostStatus;
	}

	public void setEoorCostStatus(String eoorCostStatus) {
		this.eoorCostStatus = eoorCostStatus;
		addValidField("eoorCostStatus");
	}
	@Column(name = "EOOR_IS_CHANGE_DELIVERY")
	public String getEoorIsChangeDelivery() {
		return eoorIsChangeDelivery;
	}

	public void setEoorIsChangeDelivery(String eoorIsChangeDelivery) {
		this.eoorIsChangeDelivery = eoorIsChangeDelivery;
		addValidField("eoorIsChangeDelivery");
	}
	
	/**
	 * Get 订单统计组代码（订单财务代码）
	 */
	@Column(name = "EOOR_F_CODE")
	public String getEoorFCode() {
		return eoorFCode;
	}

	/**
	 * Set 订单统计组代码（订单财务代码）
	 */
	public void setEoorFCode(String eoorFCode) {
		this.eoorFCode = eoorFCode;
		addValidField("eoorFCode");
	}

	/**
	 * Get 订单BMS票据代码
	 */
	@Column(name = "EOOR_BMS_EBBT_CODE")
	public String getEoorBmsEbbtCode() {
		return eoorBmsEbbtCode;
	}

	/**
	 * Set 订单BMS票据代码
	 */
	public void setEoorBmsEbbtCode(String eoorBmsEbbtCode) {
		this.eoorBmsEbbtCode = eoorBmsEbbtCode;
		addValidField("eoorBmsEbbtCode");
	}

	/**
	 * Get 订单BMS板块代码
	 */
	@Column(name = "EOOR_BMS_EBOT_CODE")
	public String getEoorBmsEbotCode() {
		return eoorBmsEbotCode;
	}

	/**
	 * Set 订单BMS板块代码
	 */
	public void setEoorBmsEbotCode(String eoorBmsEbotCode) {
		this.eoorBmsEbotCode = eoorBmsEbotCode;
		addValidField("eoorBmsEbotCode");
	}

	/**
	 * Get 订单BMS部门代码
	 */
	@Column(name = "EOOR_BMS_ESDE_DEPARTMENT_CODE")
	public String getEoorBmsEsdeDepartmentCode() {
		return eoorBmsEsdeDepartmentCode;
	}

	/**
	 * Set 订单BMS部门代码
	 */
	public void setEoorBmsEsdeDepartmentCode(String eoorBmsEsdeDepartmentCode) {
		this.eoorBmsEsdeDepartmentCode = eoorBmsEsdeDepartmentCode;
		addValidField("eoorBmsEsdeDepartmentCode");
	}

	/**
	 * Get 订单BMS销售人员代码
	 */
	@Column(name = "EOOR_BMS_EBSM_CODE")
	public String getEoorBmsEbsmCode() {
		return eoorBmsEbsmCode;
	}

	/**
	 * Set 订单BMS销售人员代码
	 */
	public void setEoorBmsEbsmCode(String eoorBmsEbsmCode) {
		this.eoorBmsEbsmCode = eoorBmsEbsmCode;
		addValidField("eoorBmsEbsmCode");
	}

	/**
	 * Get 订单BMS业务类型代码
	 */
	@Column(name = "EOOR_BMS_BUSINESS_CLASS")
	public String getEoorBmsBusinessClass() {
		return eoorBmsBusinessClass;
	}

	/**
	 * Set 订单BMS业务类型代码
	 */
	public void setEoorBmsBusinessClass(String eoorBmsBusinessClass) {
		this.eoorBmsBusinessClass = eoorBmsBusinessClass;
		addValidField("eoorBmsBusinessClass");
	}

	/**
	 * Get 订单BMS客户代码
	 */
	@Column(name = "EOOR_BMS_A_EBCU_CUSTOMER_NO")
	public String getEoorBmsAEbcuCustomerNo() {
		return eoorBmsAEbcuCustomerNo;
	}

	/**
	 * Set 订单BMS客户代码
	 */
	public void setEoorBmsAEbcuCustomerNo(String eoorBmsAEbcuCustomerNo) {
		this.eoorBmsAEbcuCustomerNo = eoorBmsAEbcuCustomerNo;
		addValidField("eoorBmsAEbcuCustomerNo");
	}

	/**
	 * Get 订单BMS供应商代码
	 */
	@Column(name = "EOOR_BMS_S_EBCU_CUSTOMER_NO")
	public String getEoorBmsSEbcuCustomerNo() {
		return eoorBmsSEbcuCustomerNo;
	}

	/**
	 * Set 订单BMS供应商代码
	 */
	public void setEoorBmsSEbcuCustomerNo(String eoorBmsSEbcuCustomerNo) {
		this.eoorBmsSEbcuCustomerNo = eoorBmsSEbcuCustomerNo;
		addValidField("eoorBmsSEbcuCustomerNo");
	}

	/**
	 * Get 订单BMS货物类型
	 */
	@Column(name = "EOOR_BMS_CARGO_TYPE")
	public Long getEoorBmsCargoType() {
		return eoorBmsCargoType;
	}

	/**
	 * Set 订单BMS货物类型
	 */
	public void setEoorBmsCargoType(Long eoorBmsCargoType) {
		this.eoorBmsCargoType = eoorBmsCargoType;
		addValidField("eoorBmsCargoType");
	}

	/**
	 * Get 订单BMS贸易方式
	 */
	@Column(name = "EOOR_COMMERCE_TYPE")
	public String getEoorCommerceType() {
		return eoorCommerceType;
	}

	/**
	 * Set 订单BMS贸易方式
	 */
	public void setEoorCommerceType(String eoorCommerceType) {
		this.eoorCommerceType = eoorCommerceType;
		addValidField("eoorCommerceType");
	}

	/**
	 * Get 订单BMS监管方式
	 */
	@Column(name = "EOOR_BMS_MONITOR_TYPE")
	public Long getEoorBmsMonitorType() {
		return eoorBmsMonitorType;
	}

	/**
	 * Set 订单BMS监管方式
	 */
	public void setEoorBmsMonitorType(Long eoorBmsMonitorType) {
		this.eoorBmsMonitorType = eoorBmsMonitorType;
		addValidField("eoorBmsMonitorType");
	}

	/**
	 * Get 订单BMS计量方式
	 */
	@Column(name = "EOOR_BMS_COUNT_TYPE")
	public Long getEoorBmsCountType() {
		return eoorBmsCountType;
	}

	/**
	 * Set 订单BMS计量方式
	 */
	public void setEoorBmsCountType(Long eoorBmsCountType) {
		this.eoorBmsCountType = eoorBmsCountType;
		addValidField("eoorBmsCountType");
	}

	/**
	 * @return the eoorShipperSendType
	 */
	@Column(name = "EOOR_SHIPPER_SEND_TYPE")
	public String getEoorShipperSendType() {
		return eoorShipperSendType;
	}

	/**
	 * @param eoorShipperSendType the eoorShipperSendType to set
	 */
	public void setEoorShipperSendType(String eoorShipperSendType) {
		this.eoorShipperSendType = eoorShipperSendType;
		addValidField("eoorShipperSendType");
	}

	/**
	 * @return the eoorConsigneeReceiveType
	 */
	@Column(name = "EOOR_CONSIGNEE_RECEIVE_TYPE")
	public String getEoorConsigneeReceiveType() {
		return eoorConsigneeReceiveType;
	}

	/**
	 * @param eoorConsigneeReceiveType the eoorConsigneeReceiveType to set
	 */
	public void setEoorConsigneeReceiveType(String eoorConsigneeReceiveType) {
		this.eoorConsigneeReceiveType = eoorConsigneeReceiveType;
		addValidField("eoorConsigneeReceiveType");
	}
	
	/**
	 * Get "客户支付状态
	 * 全局数据字典：SYS_PAYMENT_STATE0=未支付1=部分支付2=已支付"
	 */
	@Column(name = "EOOR_CHARGEOFF")
	public String getEoorChargeoff() {
		return eoorChargeoff;
	}

	/**
	 * Set "客户支付状态
	 * 全局数据字典：SYS_PAYMENT_STATE0=未支付1=部分支付2=已支付"
	 */
	public void setEoorChargeoff(String eoorChargeoff) {
		this.eoorChargeoff = eoorChargeoff;
		addValidField("eoorChargeoff");
	}

	/**
	 * Get "付款方式全局数据字典
	 * ：SYS_PAYMENT_MODEC=现金BT=银行转账EP=网上支付"
	 */
	@Column(name = "EOOR_PAYMENT_MODE")
	public String getEoorPaymentMode() {
		return eoorPaymentMode;
	}

	/**
	 * Set "付款方式全局数据字典
	 * ：SYS_PAYMENT_MODEC=现金BT=银行转账EP=网上支付"
	 */
	public void setEoorPaymentMode(String eoorPaymentMode) {
		this.eoorPaymentMode = eoorPaymentMode;
		addValidField("eoorPaymentMode");
	}

	/**
	 * Get "签收单返还方式公司级数据字典
	 * ：ORG_RECEIPT_RETURNTYPE0=无需签单   1=客户签收单原件返回2=客户签收单传真返回3=运单签收联传真返回"
	 */
	@Column(name = "EOOR_RECEIPT_RETURNTYPE")
	public Integer getEoorReceiptReturntype() {
		return eoorReceiptReturntype;
	}

	/**
	 * Set "签收单返还方式公司级数据字典
	 * ：ORG_RECEIPT_RETURNTYPE0=无需签单   1=客户签收单原件返回2=客户签收单传真返回3=运单签收联传真返回"
	 */
	public void setEoorReceiptReturntype(Integer eoorReceiptReturntype) {
		this.eoorReceiptReturntype = eoorReceiptReturntype;
		addValidField("eoorReceiptReturntype");
	}

	/**
	 * Get 增值服务保价申明
	 */
	@Column(name = "EOOR_INSURED_VALUE")
	public String getEoorInsuredValue() {
		return eoorInsuredValue;
	}

	/**
	 * Set 增值服务保价申明
	 */
	public void setEoorInsuredValue(String eoorInsuredValue) {
		this.eoorInsuredValue = eoorInsuredValue;
		addValidField("eoorInsuredValue");
	}

	@Column(name = "EOOR_ECMS_EOOR_ID")
	public Integer getEoorEcmsEoorId() {
		return eoorEcmsEoorId;
	}

	public void setEoorEcmsEoorId(Integer eoorEcmsEoorId) {
		this.eoorEcmsEoorId = eoorEcmsEoorId;
		addValidField("eoorEcmsEoorId");
	}

	@Column(name = "EOOR_DISTRICT")
	public String getEoorDistrict() {
		return eoorDistrict;
	}

	public void setEoorDistrict(String eoorDistrict) {
		this.eoorDistrict = eoorDistrict;
		addValidField("eoorDistrict");
	}

	@Column(name = "EOOR_DISTRICT_OPT")
	public String getEoorDistrictOpt() {
		return eoorDistrictOpt;
	}

	public void setEoorDistrictOpt(String eoorDistrictOpt) {
		this.eoorDistrictOpt = eoorDistrictOpt;
		addValidField("eoorDistrictOpt");
	}

	@Column(name = "EOOR_IS_OUT_RECEIPT")
	public String getEoorIsOutReceipt() {
		return eoorIsOutReceipt;
	}

	public void setEoorIsOutReceipt(String eoorIsOutReceipt) {
		this.eoorIsOutReceipt = eoorIsOutReceipt;
		addValidField("eoorIsOutReceipt");
	}
	
	@Column(name = "EOOR_IS_RECEIVE")
	public String getEoorIsReceive() {
		return eoorIsReceive;
	}

	public void setEoorIsReceive(String eoorIsReceive) {
		this.eoorIsReceive = eoorIsReceive;
		addValidField("eoorIsReceive");
	}
	
	@Column(name = "EOOR_REASON")
	public String getEoorReason() {
		return eoorReason;
	}

	public void setEoorReason(String eoorReason) {
		this.eoorReason = eoorReason;
		addValidField("eoorReason");
	}
}
