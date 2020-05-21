package com.sinotrans.oms.common;

public class Constants {

	/*
	 * ========================================================================================================
	 * ************************** 系统共用 START *******************************
	 * =======================================================================================================
	 */
	/**
	 * 入/出库请求下达调用的EDI接口的URL
	 */
	public static final String OMSTOWMS_REQUEST_EDI_URL = "http://172.16.0.114:5555/invoke/SinoOMSOUT.SinoOMSOutPublic.Service:srv_oms_main_out";
	/**
	 * 自动
	 */
	public static final String AUTO = "1";
	/**
	 * 不自动
	 */
	public static final String NOT_AUTO = "0";

	/**
	 * 所有All
	 */
	public static final String ALL = "All";

	/**
	 * 时间格式
	 */
	public static final String DATE_FORMAT_TYPE = "yyyy-MM-dd";
	/**
	 * 时间格式 24小时
	 */
	public static final String DATE_FORMAT_TYPE_24H = "yyyy-MM-dd HH:mm:ss";
	/**
	 * 时间正则过滤
	 */
	public static final String DATE_FORMAT_REGX = "^(?:(?!0000)[0-9]{4}([-/.]?)(?:(?:0?[1-9]|1[0-2])([-/.]?)(?:0?[1-9]|1[0-9]|2[0-8])|(?:0?[13-9]|1[0-2])([-/.]?)(?:29|30)|(?:0?[13578]|1[02])([-/.]?)31)|(?:[0-9]{2}(?:0[48]|[2468][048]|[13579][26])|(?:0[48]|[2468][048]|[13579][26])00)([-/.]?)0?2([-/.]?)29)$";

	/**
	 * 执行状态：不可执行
	 */
	public static final String TASK_STATUS_UNDO = "0";
	/**
	 * 执行状态：可执行
	 */
	public static final String TASK_STATUS_DO = "1";
	/**
	 * 执行状态：执行中
	 */
	public static final String TASK_STATUS_DOING = "2";
	/**
	 * 执行状态：已执行
	 */
	public static final String TASK_STATUS_DONE = "3";
	/**
	 * 执行状态：已反馈
	 */
	public static final String TASK_STATUS_FEEDBACK = "4";

	/**
	 * 国际化-中文编码
	 */
	public static final String CHINA_LOCALE = "zh_CN";// 国际化-中文编码
	/**
	 * 国际化-英文编码
	 */
	public static final String ENGLISH_LOCALE = "en_US";// 国际化-中文编码

	/**
	 * 超级管理员的用户名
	 */
	public static final String ADMIN_USER = "admin";

	/**
	 * 管理员组
	 */
	public static final String ADMIN_GROUP = "adminGroup";

	/**
	 * 管理员角色
	 */
	public static final String ADMIN_ROLE = "adminRole";
	/**
	 * 顶级公司orgId
	 */
	public static final String TOP_COMPANY = "100";
	/**
	 * 根结点的ID
	 */
	public static final String TREE_NODE_ROOT_ID = "-1";

	/**
	 * 系统级别
	 */
	public static final int CODEMASTER_SYS_LEVEL_TYPE = 1;
	/**
	 * 公司级别
	 */
	public static final int CODEMASTER_PLA_LEVEL_TYPE = 2;
	/**
	 * 项目级别
	 */
	public static final int CODEMASTER_PRO_LEVEL_TYPE = 3;

	/**
	 * 可用的codemaster值的状态值
	 */
	public static final String CODEMASTER_ENABLE_TYPE_VALUE = "1";
	/**
	 * codemaster中字典类型为消息类型的常量
	 */
	public static final String CODEMASTER_DICTIONARY_TYPE_MESSAGE = "ORG_MESSAGE_TYPE";

	/**
	 * 消息分类：轮询
	 * 
	 * @default
	 */
	public static final String POLLING = "POLLING";
	/**
	 * 消息分类：触发
	 * 
	 * @default
	 */
	public static final String TRIGGER = "TRIGGER";
	/**
	 * 消息类型：手动
	 * 
	 * @default
	 */
	public static final String MANUAL = "MANUAL";
	/**
	 * 默认用户密码
	 */
	public static final String DEFAULT_USER_PASSWORD = "123456";

	/**
	 * 标识：多行
	 */
	public static final String MULTI = "MULTI";
	/**
	 * 标识：超级用户
	 */
	public static final String IS_SUPERUSER = "1";

	/**
	 * 标识：是
	 */
	public static final String YES = "Y";
	/**
	 * 标识：非
	 */
	public static final String NO = "N";
	
	/**
	 * 标识：是（汉字）
	 */
	public static final String YES_CHINESE = "是";
	
	/**
	 * 标识：否（汉字）
	 */
	public static final String NO_CHINESE = "否";
	
	/**
	 * 备注字段默认公司的ID
	 */
	public static final Long REMARK_DEFAULT_ESCOID = -1L;

	/**
	 * 默认在没有外键时，使用该值
	 */
	public static final Integer DEFAULT_NONE_FK = -1;

	/**
	 * 系统状态：新增
	 */
	public static final String SYS_STATUS_ADD = "ADD";

	/**
	 * 系统状态：不可用
	 */
	public static final String SYS_STATUS_DISABLE = "DISABLE";

	/**
	 * 系统状态：可用
	 */
	public static final String SYS_STATUS_ENABLE = "ENABLE";
	/**
	 * WEBSERVICE调用固定值系统参数代码
	 */
	public static final String WEBSERVICES_URL = "WEBSERVICES_URI";

	/** *********************系统管理模块start************************************* */

	/**
	 * 功能类型：菜单 0
	 */
	public static final String SYS_FUNCTION_TYPE_MENU = "0";
	/**
	 * 功能类型：按钮 1
	 */
	public static final String SYS_FUNCTION_TYPE_BUTTON = "1";
	/**
	 * 消息发送状态：未发送
	 * 
	 * @default
	 */
	public static final String SYS_MESSAGE_SEND_STATUS_NO_SEND = "NO_SEND";
	/**
	 * 消息发送状态：已接收
	 * 
	 * @default
	 */
	public static final String SYS_MESSAGE_SEND_STATUS_RECEIVED = "RECEIVED";
	/**
	 * 消息发送状态：准备发送
	 * 
	 * @default
	 */
	public static final String SYS_MESSAGE_SEND_STATUS_READY = "READY";
	/**
	 * 消息发送状态：正在发送
	 * 
	 * @default
	 */
	public static final String SYS_MESSAGE_SEND_STATUS_SENDING = "SENDING";
	/**
	 * 消息发送状态：已发送
	 * 
	 * @default
	 */
	public static final String SYS_MESSAGE_SEND_STATUS_SENDED = "SENDED";
	/**
	 * 消息发送途径：系统
	 * 
	 * @default
	 */
	public static final String SYS_MESSAGE_SEND_WAY_SYSTEM = "S";
	/**
	 * 消息发送途径：邮件
	 * 
	 * @default
	 */
	public static final String SYS_MESSAGE_SEND_WAY_MAIL = "M";
	/**
	 * 消息发送途径：短信
	 * 
	 * @default
	 */
	public static final String SYS_MESSAGE_SEND_WAY_NOTE = "N";
	/**
	 * 消息发送途径：传真
	 * 
	 * @default
	 */
	public static final String SYS_MESSAGE_SEND_WAY_FAX = "F";
	/**
	 * 消息发送状态：已重发
	 * 
	 * @default
	 */
	public static final String SYS_MESSAGE_SEND_STATUS_REPEAT = "REPEAT";
	/**
	 * 消息发送状态：新增
	 * 
	 * @default
	 */
	public static final String SYS_MESSAGE_SEND_STATUS_ADD = "ADD";
	/**
	 * 系统备注字段模块:默认公司ID
	 */
	public static final int PLAT_DEFAULT = -1;
	// 系统功能定义：功能类型0:菜单1:按钮
	public static final String SYS_FUNCTION_RESOURCE_MENU_TYPE = "0";
	public static final String SYS_FUNCTION_RESOURCE_BTN_TYPE = "1";
	// 公司权限授予：1：选择状态、2：未选择状态
	public static final String SYS_FUNCTION_PERMISSION_STATUS_CHOOSED = "1";
	public static final String SYS_FUNCTION_PERMISSION_STATUS_NOTCHOOSED = "2";

	/**
	 * 作用范围：基地
	 */
	public static final String SYS_SCOPE_STATION = "3";
	/**
	 * 作用范围：公司
	 */
	public static final String SYS_SCOPE_COMPANY = "2";
	/**
	 * 作用范围：项目
	 */
	public static final String SYS_SCOPE_PROJECT = "1";
	/**
	 * 作用范围：系统
	 */
	public static final String SYS_SCOPE_SYSTEM = "4";

	/**
	 * 是逻辑删除 1
	 */
	public static final Integer DELETED_YES = 1;
	/**
	 * 不是逻辑删除 0
	 */
	public static final Integer DELETED_NO = 0;

	/** *********************系统管理模块end************************************* */

	/** *********************基础数据管理模块start************************************* */
	/**
	 * 基础数据新增时是否启用code
	 * 
	 * @default
	 */
	public static final String NEW_ADD_ENABLE_CODE = "newAddEnable";
	/**
	 * 配置包装的下拉框缓存key
	 * 
	 * @default
	 */
	public static final String PACKAGE_CFGKEY = "ORG_PACKAGE";
	/**
	 * 客户分供方角色 字典类型
	 */
	public static final String SYS_DICTIONARY_TYPE_CUSTOME_ROLE = "SYS_CUSTOMER_ROLE";

	/** *********************基础数据管理模块end************************************* */

	/** *********************统计分析管理模块start************************************* */
	/**
	 * 数据源的前缀，用于构建自定义报表树
	 */
	public static final String DATASOURCE_PERFIX = "da_";

	/**
	 * 报表配置的前缀，用于构建自定义报表树
	 */
	public static final String REPORT_CONFIG_PERFIX = "rc_";

	/**
	 * 配置表与SQL字段关系类型：1为查询条件
	 */
	public static final String DIY_REPORT_CONFIG_TYPE_QUERY_FIELD = "1";

	/**
	 * 配置表与SQL字段关系类型：2为显示
	 */
	public static final String DIY_REPORT_CONFIG_TYPE_DISPLAY = "2";

	/**
	 * 配置表与SQL字段关系类型：3为排序
	 */
	public static final String DIY_REPORT_CONFIG_TYPE_SORT = "3";

	/**
	 * 数据源类型:SQL
	 */
	public static final String DATA_SOURCE_TYPE_SQL = "SQL";

	/**
	 * 数据源类型:存储过程
	 */
	public static final String DATA_SOURCE_TYPE_PROCEDURES = "PROCEDURES";
	/**
	 * 自定义报表判断数据类型为日期
	 */
	public static final String FIELD_TYPE_DATE = "DATE";
	/**
	 * 自定义报表判断数据类型为数字
	 */
	public static final String FIELD_TYPE_NUMBER = "NUMBER";
	/** *********************统计分析管理模en************************************* */

	/*
	 * ========================================================================================================
	 * ************************** 项目维护 START *******************************
	 * =======================================================================================================
	 */
	/**
	 * 项目发货人信息
	 */
	public static final String PROJECT_SHIP = "Ship";
	/**
	 * 项目KPI信息
	 */
	public static final String PROJECT_KPI = "KPI";
	/**
	 * 项目参数信息
	 */
	public static final String PROJECT_PARAM = "Param";

	/**
	 * 项目货主供货商信息 20111008.1 vicky
	 */
	public static final String PROJECT_OWNER = "Owner";

	/**
	 * 项目特殊要求信息
	 */
	public static final String PROJECT_CERT = "Cert";

	/*
	 * ========================================================================================================
	 * ************************** 执行计划维护 START *******************************
	 * =======================================================================================================
	 */

	/**
	 * 执行计划信息
	 */
	public static final String PLAN_ALL = "All";
	/**
	 * 执行计划——任务计划信息
	 */
	public static final String PLAN_TASK = "Task";
	/**
	 * 执行计划——里程碑信息
	 */
	public static final String PLAN_MILESTONE = "Milestone";
	/**
	 * 执行计划——计划事件信息
	 */
	public static final String PLAN_EVENT = "Event";

	/**
	 * 执行计划——界面效验
	 */
	public static final String PLAN_CHECK = "Check";
	/**
	 * 执行计划——用户
	 */
	public static final String PLAN_USER = "User";
	/*
	 * ========================================================================================================
	 * ************************** 业务请求 START *******************************
	 * =======================================================================================================
	 */
	/**
	 * 入库请求状态:未下达
	 * 
	 * @default
	 */
	public static final String SYS_STOCKIN_STATUS_UNISSUED = "unissued";

	/**
	 * 入库请求状态:已下达
	 * 
	 * @default
	 */
	public static final String SYS_STOCKIN_STATUS_ISSUED = "issued";

	/**
	 * 入库请求状态:已反馈
	 * 
	 * @default
	 */
	public static final String SYS_STOCKIN_STATUS_FEEDBACK = "feedback";

	/**
	 * 入库请求状态:已完成
	 * 
	 * @default
	 */
	public static final String SYS_STOCKIN_STATUS_COMPLETED = "completed";

	/**
	 * 入库请求状态:已终止
	 * 
	 * @default
	 */
	public static final String SYS_STOCKIN_STATUS_FINISHED = "finished";

	/**
	 * 入库请求执行状态:不执行
	 * 
	 * @default
	 */
	public static final String SYS_TASK_STATUS_UNDO = "0";

	/**
	 * 入库请求执行状态:可执行
	 * 
	 * @default
	 */
	public static final String SYS_TASK_STATUS_DO = "1";

	/**
	 * 入库请求执行状态:执行中
	 * 
	 * @default
	 */
	public static final String SYS_TASK_STATUS_DOING = "2";

	/**
	 * 入库请求执行状态:已执行
	 * 
	 * @default
	 */
	public static final String SYS_TASK_STATUS_DONE = "3";

	/**
	 * 入库请求执行状态:已反馈
	 * 
	 * @default
	 */
	public static final String SYS_TASK_STATUS_FFEDBACK = "4";

	/*
	 * ========================================================================================================
	 * ************************** 订单管理 START *******************************
	 * =======================================================================================================
	 */
	/**
	 * 订单SONO
	 */
	public static final String ORDER_SONO = "SO_NO_FW";
	/**
	 * 系统委托号
	 */
	public static final String EOCS_NO = "EOCS_CONSIGNMENT_NO";
	
	/**
	 * 订单物料行号规则名称
	 */
	public static final String ORDER_MATERIAL_LNO_NAME = "EoOrderMaterial";
	/**
	 * 订单编号规则名称
	 */
	public static final String ORDER_NO_NAME = "EoOrder_FW";
	/**
	 * 订单编号规则名称--进口
	 */
	public static final String ORDER_NO_NAME_FW_IS = "EoOrder_FW_IS";
	/**
	 * 货代出口订单编号规则名称
	 */
	public static final String ORDER_NO_NAME_ES = "EoOrderEs";
	/**
	 * 货代进口订单编号规则名称
	 */
	public static final String ORDER_NO_NAME_IS = "EoOrderIs";
	/**
	 * 生成外运号规则名称
	 */
	public static final String SINOTRANS_ID = "SinotransId";
	/**
	 * 货代进出口应收预约开票号规则名称
	 */
	public static final String BOOKING_INVOICE_NUM_R = "BookingInvoiceNumR";
	/**
	 * 订单数据来源：紧急建单
	 */
	public static final String ORDER_SOURCE_URGENT = "0";
	/**
	 * 订单数据来源：网上服务委托
	 */
	public static final String ORDER_SOURCE_NETSERVICES = "1";
	/**
	 * 订单数据来源：系统建单
	 */
	public static final String ORDER_SOURCE_SYSTEM = "2";
	/**
	 * 订单数据来源：订单导入
	 */
	public static final String ORDER_SOURCE_IMPORT = "3";
	/**
	 * 订单数据来源：货代建单
	 */
	public static final String ORDER_SOURCE_FREIGHT = "7";

	/**
	 * 订单数据来源：订单货代建单 , 货代出口订单按照pdm标准由9改为7
	 */
	public static final String ORDER_SOURCE_ORDER_FREIGHT = "7";

	/**
	 * 订单状态：受理
	 */
	public static final String ORDER_STATUS_ACCEPT = "ACCEPT";
	/**
	 * 订单状态：拒绝
	 */
	public static final String ORDER_STATUS_REJECT = "REJECT";

	/**
	 * 订单状态：新增
	 */
	public static final String ORDER_STATUS_ADD = "ADD";

	/**
	 * 订单管理————恢复
	 */
	public static final String ORDER_RESUME = "RESUME";
	/**
	 * 订单管理————解除挂起
	 */
	public static final String ORDER_CC_HANG = "CC_HANG";
	/**
	 * 订单管理————订单作废
	 */
	public static final String ORDER_VOID = "VOID";

	/**
	 * 订单管理————逻辑删除
	 */
	public static final String ORDER_DELETE = "DELETE";
	/**
	 * 订单管理————异常
	 */
	public static final String ORDER_EXCEPTION = "EXCEPTION";
	/**
	 * 订单管理————挂起
	 */
	public static final String ORDER_HANG = "HANG";

	/**
	 * 订单管理————解除异常
	 */
	public static final String ORDER_CC_EXCEPTION = "CC_EXCEPTION";

	/**
	 * 任务类型：入库
	 * 
	 * @default
	 */
	public static final String SYS_TASK_IN_WAREHOUSE = "TASK_IN_WAREHOUSE";
	/**
	 * 任务类型：出库
	 * 
	 * @default
	 */
	public static final String SYS_TASK_OUT_WAREHOUSE = "TASK_OUT_WAREHOUSE";
	/**
	 * 任务类型:陆运任务
	 * 
	 * @default
	 */
	public static final String SYS_TASK_EORD = "TASK_EORD";
	/**
	 * 任务类型:报关任务
	 * 
	 * @default
	 */
	public static final String SYS_TASK_DECLARATION = "TASK_DECLARATION";
	/**
	 * 任务类型:内贸水运任务
	 * 
	 * @default
	 */
	public static final String SYS_TASK_WATER = "TASK_WATER";
	/**
	 * 任务类型:化工任务
	 * 
	 * @default
	 */
	public static final String SYS_TASK_CHEMICAL = "TASK_CHEMICAL";
	/**
	 * 任务类型:海运出口任务
	 * 
	 * @default
	 */
	public static final String SYS_TASK_ESEABORNE = "TASK_E_SEABORNE";
	/**
	 * 任务类型:海运进口任务
	 * 
	 * @default
	 */
	public static final String SYS_TASK_ISEABORNE = "TASK_I_SEABORNE";
	/**
	 * 任务类型:出口拖车任务
	 * 
	 * @default
	 */
	public static final String SYS_TASK_EXTRBORNE = "TASK_EXTRBORNE";
	/**
	 * 任务类型:进口拖车任务
	 * 
	 * @default
	 */
	public static final String SYS_TASK_IMTRBORNE = "TASK_IMTRBORNE";
	/**
	 * 任务类型:委托报关任务
	 * 
	 * @default
	 */
	public static final String SYS_ENTRUST_CUSTOMER = "TASK_ENTRUST_CUSTOMER";
	/**
	 * 任务类型:空运出口任务
	 * 
	 * @default
	 */
	public static final String SYS_TASK_AIRBORNE = "TASK_AIRBORNE";
	/**
	 * 任务类型:空运进口任务
	 * 
	 * @default
	 */
	public static final String SYS_TASK_AIRIMPORTBORNE = "TASK_AIRIMPORTBORNE";
	/**
	 * 任务类型:铁路运输
	 * 
	 * @default
	 */
	public static final String SYS_TASK_RAILWAY = "TASK_RAILWAY";

	/**
	 * 任务类型:海外跟踪任务
	 * 
	 * @default
	 */
	public static final String SYS_TASK_ABROAD = "TASK_ABROAD";

	/**
	 * 任务类型:化工罐箱
	 * 
	 * @default
	 */
	public static final String SYS_TASK_CONTAINER = "TASK_CONTAINER";
	/**
	 * 委托受理状态
	 */
	public static final String CONSIGNMENT_ACCEPT = "ACCEPT";
	/**
	 * 委托拒绝状态
	 */
	public static final String CONSIGNMENT_DENY = "DENY";

	/**
	 * 里程碑状态
	 */
	public static final String ORDER_MILESTONE_STATUS = "SYS_ORDER_MILESTONE_STATUS";

	/**
	 * 订单维护页面对应的报表模板系统参数的value值
	 */
	public static final String ORDER_REPORT_PRINT = "ORDER_EDIT_PRINT";

	/**
	 * 订单列表上传BMS标识
	 */
	public static final String ORDER = "ORDER";
	/*
	 * ================================================================================================================
	 * ********************************** 订单导入 START
	 * ***********************************
	 * ===============================================================================================================
	 */

	/**
	 * 订单模板类型 -- 物流订单
	 */
	public static final String ORDER_LO_TEMPLATE = "LO";
	/**
	 * 订单模板类型 -- 特殊模版
	 */
	public static final String ORDER_SP_TEMPLATE = "SP";
	/**
	 * 通用模板类型 -- 通用订单
	 */
	public static final String GENERAL_GE_TEMPLATE = "GE";
	/**
	 * 海关编码模板类型
	 */
	public static final String HSCODE_HS_GE_TEMPLATE = "HS_GE";
	/**
	 * 订单主信息Sheet
	 */
	public static final int ORDER_MAIN_SHEET = 0;
	/**
	 * 配置信息Sheet
	 */
	public static final int CONFIG_SHEET = 1;
	/**
	 * 导入结果信息Sheet
	 */
	public static final int RESULT_SHEET = 2;
	/**
	 * 海关编码EXCEL导入配置信息Sheet
	 */
	public static final int HSCODE_CONFIG_SHEET = 2;
	/**
	 * 海关编码EXCEL导入结果信息Sheet
	 */
	public static final int HSCODE_RESULT_SHEET = 3;
	/**
	 * 列名(字段名)行
	 */
	public static final int FIELD_NAME_ROW = 2;
	/**
	 * 数据行
	 */
	public static final int DATA_ROW = 8;
	/**
	 * 项目ID 列
	 */
	public static final String PROJECT_ID_ROW = "EOCS_EBPJ_ID";
	/**
	 * 项目作业计划ID
	 */
	public static final String PLAN_ID_ROW = "EOCS_LO_EBPP_ID";
	/**
	 * 模板表主键
	 */
	public static final String TEMPLATE_ID_ROW = "EOCI_EBIT_ID";

	/**
	 * 订单导入——模板下载
	 */
	public static final String ORDER_IMP_DL_TEMPLATE = "orderImpTemp";
	/**
	 * 通用导入——模板下载
	 */
	public static final String GENERAL_IMP_DL_TEMPLATE = "generalImpTemp";
	/**
	 * 海关编码导入——模板下载
	 */
	public static final String HSCODE_IMP_DL_TEMPLATE = "hscodeImpTemp";
	/**
	 * 订单导入——原文件下载/结果文件下载
	 */
	public static final String ORDER_IMP_DL_SR = "orderImpDlSR";
	/**
	 * 特殊导入——原文件下载/结果文件下载
	 */
	public static final String SPECIAL_IMP_DL_SR = "specialImpDlSR";

	/**
	 * 订单导入——文件上传
	 */
	public static final String ORDER_IMP_UL_FILE = "orderImpUlFile";
	/**
	 * 特殊格式导入——文件上传
	 */
	public static final String SPECIAL_IMP_UL_FILE = "specialImpUlFile";
	/**
	 * 通用模板-文件上传
	 */
	public static final String GENERAL_IMP_UL_FILE = "generalImpUlFile";
	/**
	 * 海关编码模板-文件上传
	 */
	public static final String HSCODE_GENERAL_IMP_UL_FILE = "hscodeImpUlFile";
	/**
	 * EAI报文异常信息文件上传
	 */
	public static final String EAI_IMP_UL_FILE = "EAI_UNLOAD";

	/**
	 * 导入状态——导入成功
	 */
	public static final String ORDER_IMP_SUCCESS = "SUCCESS";
	/**
	 * 导入状态——导入失败
	 */
	public static final String ORDER_IMP_FAILED = "FAILED";
	/**
	 * 导入状态——处理中
	 */
	public static final String ORDER_IMP_DOING = "DOING";
	/**
	 * 导入状态——新建
	 */
	public static final String ORDER_IMP_ADD = "ADD";
	/**
	 * ASN和导入定单号生成编码规则名称
	 */
	public static final String ORDER_ASN_EBBR_NAME = "BillForASN";

	/**
	 * 订单物料备注13-出入库发票号
	 */
	public static final String ORDER_MATERIAL_SUB13 = "M_SUB13";

	/**
	 * 订单物料备注14-托数
	 */
	public static final String ORDER_MATERIAL_SUB14 = "M_SUB14";

	/**
	 * 订单物料备注15-体积
	 */
	public static final String ORDER_MATERIAL_SUB15 = "M_SUB15";

	/**
	 * 订单物料备注2-入库发票号
	 */
	public static final String ORDER_MATERIAL_SUB2 = "M_SUB2";

	/**
	 * 物料数量
	 */
	public static final String ORDER_MATERIAL_QUANTITY = "M_QUANTITY";

	/**
	 * 物料名称
	 */
	public static final String ORDER_MATERIAL_NAME = "MATERIAL_NAME";

	/**
	 * 物料编号
	 */
	public static final String ORDER_MATERIAL_NO = "MATERIAL_NO";

	/**
	 * 订单备注25-ASN或导入定单号（SONO）
	 */
	public static final String ORDER_SUB25 = "SUB25";
	/**
	 * 订单备注24-关(封)号
	 */
	public static final String ORDER_SUB24 = "SUB24";

	/**
	 * 订单备注23-白卡号
	 */
	public static final String ORDER_SUB23 = "SUB23";

	/**
	 * 订单备注22-集装箱号
	 */
	public static final String ORDER_SUB22 = "SUB22";

	/**
	 * 订单备注21-车号
	 */
	public static final String ORDER_SUB21 = "SUB21";

	/**
	 * 订单备注12-箱型
	 */
	public static final String ORDER_SUB12 = "SUB12";

	/**
	 * 订单备注11-作业类别
	 */
	public static final String ORDER_SUB11 = "SUB11";

	/**
	 * 订单备注5-重量
	 */
	public static final String ORDER_SUB5 = "SUB5";

	/**
	 * 订单备注4-报关单号
	 */
	public static final String ORDER_SUB4 = "SUB4";

	/**
	 * 订单备注3-总件数(大件数)
	 */
	public static final String ORDER_SUB3 = "SUB3";

	/**
	 * 订单备注2-提单号
	 */
	public static final String ORDER_SUB2 = "SUB2";

	/**
	 * 订单备注1-业务编号表头
	 */
	public static final String ORDER_SUB1 = "SUB1";

	/**
	 * 订单出货时间
	 */
	public static final String ORDER_DELIVERY_DATE = "DELIVERY_DATE";

	/**
	 * 订单类型
	 */
	public static final String ORDER_TYPE = "TYPE";

	/**
	 * 客户编号
	 */
	public static final String CUSTOM_CODE = "CUSTOM_CODE";

	/**
	 * 供货商编号
	 */
	public static final String SUPPLIER_CODE = "SUPPLIER_CODE";

	/**
	 * 供货商编号
	 */
	public static final String SUPPLIER_NAME = "SUPPLIER_NAME";

	/**
	 * 供货商编号
	 */
	public static final String ORDER_DATE = "ORDER_DATE";

	/**
	 * excel行号
	 */
	public static final String ROW_ID = "ROW_ID";
	/**
	 * 失效状态
	 */
	public static final String ORDER_EAI_INNER_EXCETION_STATUS_0 = "0";
	/**
	 * 已执行状态
	 */
	public static final String ORDER_EAI_INNER_EXCETION_STATUS_3 = "3";
	/**
	 * 未修复
	 */
	public static final String ORDER_EAI_INNER_EXCETION_STATUS_1 = "1";
	/**
	 * 已修复
	 */
	public static final String ORDER_EAI_INNER_EXCETION_STATUS_2 = "2";
	/*
	 * ================================================================================================================
	 * ********************************** 客户&项目 START
	 * ***********************************
	 * ===============================================================================================================
	 */
	public static final String SYS_FILE_TYPE_CUSTOMER = "2";

	/*
	 * ================================================================================================================
	 * ********************************** 业务规则 START
	 * ***********************************
	 * ===============================================================================================================
	 */
	/**
	 * 代码转换——文件上传
	 */
	public static final String CODE_MAP_UL_FILE = "codeMapUlFile";
	/**
	 * 代码匹配类型——代码匹配
	 */
	public static final String CODE_MAP = "0";
	/**
	 * 代码对照优先级——低级
	 */
	public static final String LOWER = "2";

	/*
	 * ================================================================================================================
	 * ********************************** webservice START
	 * ***********************************
	 * ===============================================================================================================
	 */
	/**
	 * 为webservice热发布的服务端URL配置的系统参数code
	 */
	public static final String WEBSERVICE_URL_SYS_CODE = "WEBSERVICE_URL";
	/**
	 * EAI请求地址的系统参数代码
	 */
	public static final String EAI_WEBSERVICE_URL = "EAI_WEBSERVICE_URL";
	/**
	 * EAI请求地址命名空间系统参数代码
	 */
	public static final String EAI_NAME_SPACE = "EAI_NAME_SPACE";
	/**
	 * webservices热发布重定向地址系统参数代码
	 */
	public static final String WEBSERVICES_REDIRECT = "WEBSERVICES_REDIRECT";
	/**
	 * EDI数据处理标识，没进行处理
	 */
	public static final String EDI_FLAG_ZORE = "0";
	/**
	 * EDI数据处理标识，没进行处理
	 */
	public static final String EDI_FLAG_NEGATIVE_ONE = "-1";
	/**
	 * 化工物流请求类型
	 */
	public static final String REQUEST_CHEMICAL_TYPE = "7";
	/**
	 * 化工物流请求类型
	 */
	public static final String REQUEST_ABROAD_TYPE = "11";
	/**
	 * 出口拖车请求类型
	 */
	public static final String REQUEST_EXPORTTRAILER_TYPE = "8";
	/**
	 * 化工物流正常单下发webservices调用
	 */
	public static final String REQUEST_CHEMICAL_WEBSERVICE_NAME = "sendToEAIManager.sendChemicalToEAI";
	/**
	 * 出口拖车正常单下发webservices调用
	 */
	public static final String REQUEST_EXPORTTRAILER_WEBSERVICE_NAME = "sendToEAIManager.sendExporttrailerToEAI";
	/**
	 * 化工罐箱正常单下发webservices调用
	 */
	public static final String REQUEST_CHEMICAL_CONTAINER_WEBSERVICE_NAME = "sendToEAIManager.sendChemContainerToEAI";
	/**
	 * 化工物流BR到EDI中间表的存储入参参数名称eorc_id
	 */
	public static final String REQUEST_CHEMICAL_IN_PARAME_EORC_ID = "eorc_id";
	/**
	 * 出口拖车BR到EDI中间表的存储入参参数名称eoet_id
	 */
	public static final String REQUEST_EXPORTTRAILER_IN_PARAME_EOET_ID = "eoet_id";
	/**
	 * 化工物流BR到EDI中间表的存储出参参数名称edrc_id(出参一律用String类型)
	 */
	public static final String REQUEST_CHEMICAL_OUT_PARAME_EDRC_ID = "edrc_id";
	/**
	 * 化工物料BR到EDI中间表的存储出参参数名称edet_id(出参一律用String类型)
	 */
	public static final String REQUEST_EXPORTTRAILER_OUT_PARAME_EDET_ID = "edet_id";
	/**
	 * 默认的WEBSERVICE调用固定值
	 */
	public static final String WEBSERVICES_URL_INIT = "/OMS_TEST/services";
	/**
	 * 默认的webservices热发布重定向地址
	 */
	public static final String WEBSERVICES_REDIRECT_INIT = "http://localhost:8080/OMS_WS_TEST/services/";
	/**
	 * BMS开票申请服务地址
	 */
	public static final String BMS_CODE_REQUEST_URL = "http://172.16.99.247:7003/BMS_SEPARATION_SERVICE_DEV/generateInvoiceDraftServlet";
	/**
	 * 陆运请求状态-可执行-1
	 */
	public static final String REQUEST_ROAD_STATUS_SUSSCESS = "1";
	/**
	 * 编码格式:UTF-8
	 */
	public static final String ENCODING = "UTF-8";
	/**
	 * 陆运请求状态:未下达
	 * 
	 * @default
	 */
	public static final String SYS_TMS_STATUS_UNISSUED = "unissued";
	/**
	 * 接收方为我方系统-EAIOMS
	 */
	public static final String RECEIVER_EAIOMS = "EAIOMS";
	/**
	 * 调用方式为内部调用-INNER
	 */
	public static final String CALL_TYPE_INNER = "INNER";
	/**
	 * 陆运请求状态:已下达
	 * 
	 * @default
	 */
	public static final String SYS_TMS_STATUS_ISSUED = "issued";

	/**
	 * 陆运请求状态:已反馈
	 * 
	 * @default
	 */
	public static final String SYS_TMS_STATUS_FEEDBACK = "feedback";

	/**
	 * 陆运请求状态:已完成
	 * 
	 * @default
	 */
	public static final String SYS_TMS_STATUS_COMPLETED = "completed";

	/**
	 * 陆运请求状态:已终止
	 * 
	 * @default
	 */
	public static final String SYS_TMS_STATUS_FINISHED = "finished";

	/**
	 * 陆运请求执行状态:不执行
	 * 
	 * @default
	 */
	public static final String SYS_TMS_TASK_STATUS_UNDO = "0";

	/**
	 * 陆运请求执行状态:可执行
	 * 
	 * @default
	 */
	public static final String SYS_TMS_TASK_STATUS_DO = "1";

	/**
	 * 陆运请求执行状态:执行中
	 * 
	 * @default
	 */
	public static final String SYS_TMS_TASK_STATUS_DOING = "2";

	/**
	 * 陆运请求执行状态:已执行
	 * 
	 * @default
	 */
	public static final String SYS_TMS_TASK_STATUS_DONE = "3";

	/**
	 * 陆运请求执行状态:已反馈
	 * 
	 * @default
	 */
	public static final String SYS_TMS_TASK_STATUS_FFEDBACK = "4";
	/**
	 * 报文类型-STATUSBACK：状态反馈
	 */
	public static final String MESSAGE_TYPE_STATUSBACK = "STATUSBACK";
	/**
	 * 报文类型-URGENTSEND：紧急单
	 */
	public static final String MESSAGE_TYPE_URGENTSEND = "URGENTSEND";
	/**
	 * 调用成功
	 */
	public static final String CODE_TRUE = "1";
	
	/**
	 * 调用失败
	 */
	public static final String CODE_FALSE = "0";
	/**
	 * 调用失败-业务主键为空的状况
	 */
	public static final String CODE_FY_TRUE = "3";

	/**
	 * 通用模板导入-数据1
	 */
	public static final String EOCT_SUB1 = "EOCT_SUB1";
	/**
	 * 通用模板导入-数据2
	 */
	public static final String EOCT_SUB2 = "EOCT_SUB2";
	/**
	 * 通用模板导入-数据3
	 */
	public static final String EOCT_SUB3 = "EOCT_SUB3";
	/**
	 * 通用模板导入-数据4
	 */
	public static final String EOCT_SUB4 = "EOCT_SUB4";
	/**
	 * 通用模板导入-数据5
	 */
	public static final String EOCT_SUB5 = "EOCT_SUB5";
	/**
	 * 通用模板导入-数据6
	 */
	public static final String EOCT_SUB6 = "EOCT_SUB6";
	/**
	 * 通用模板导入-数据7
	 */
	public static final String EOCT_SUB7 = "EOCT_SUB7";
	/**
	 * 通用模板导入-数据8
	 */
	public static final String EOCT_SUB8 = "EOCT_SUB8";
	/**
	 * 通用模板导入-数据9
	 */
	public static final String EOCT_SUB9 = "EOCT_SUB9";
	/**
	 * 通用模板导入-数据10
	 */
	public static final String EOCT_SUB10 = "EOCT_SUB10";
	/**
	 * 通用模板导入-数据11
	 */
	public static final String EOCT_SUB11 = "EOCT_SUB11";
	/**
	 * 通用模板导入-数据12
	 */
	public static final String EOCT_SUB12 = "EOCT_SUB12";
	/**
	 * 通用模板导入-数据13
	 */
	public static final String EOCT_SUB13 = "EOCT_SUB13";
	/**
	 * 通用模板导入-数据14
	 */
	public static final String EOCT_SUB14 = "EOCT_SUB14";
	/**
	 * 通用模板导入-数据15
	 */
	public static final String EOCT_SUB15 = "EOCT_SUB15";
	/**
	 * 通用模板导入-数据16
	 */
	public static final String EOCT_SUB16 = "EOCT_SUB16";
	/**
	 * 通用模板导入-数据17
	 */
	public static final String EOCT_SUB17 = "EOCT_SUB17";
	/**
	 * 通用模板导入-数据18
	 */
	public static final String EOCT_SUB18 = "EOCT_SUB18";
	/**
	 * 通用模板导入-数据19
	 */
	public static final String EOCT_SUB19 = "EOCT_SUB19";
	/**
	 * 通用模板导入-数据20
	 */
	public static final String EOCT_SUB20 = "EOCT_SUB20";

	/**
	 * 通用模板导入-数据21
	 */
	public static final String EOCT_SUB21 = "EOCT_SUB21";
	/**
	 * 通用模板导入-数据22
	 */
	public static final String EOCT_SUB22 = "EOCT_SUB22";
	/**
	 * 通用模板导入-数据23
	 */
	public static final String EOCT_SUB23 = "EOCT_SUB23";
	/**
	 * 通用模板导入-数据24
	 */
	public static final String EOCT_SUB24 = "EOCT_SUB24";
	/**
	 * 通用模板导入-数据25
	 */
	public static final String EOCT_SUB25 = "EOCT_SUB25";
	/**
	 * 通用模板导入-数据26
	 */
	public static final String EOCT_SUB26 = "EOCT_SUB26";
	/**
	 * 通用模板导入-数据27
	 */
	public static final String EOCT_SUB27 = "EOCT_SUB27";
	/**
	 * 通用模板导入-数据28
	 */
	public static final String EOCT_SUB28 = "EOCT_SUB28";
	/**
	 * 通用模板导入-数据29
	 */
	public static final String EOCT_SUB29 = "EOCT_SUB29";
	/**
	 * 通用模板导入-数据30
	 */
	public static final String EOCT_SUB30 = "EOCT_SUB30";
	/**
	 * 通用模板导入-数据31
	 */
	public static final String EOCT_SUB31 = "EOCT_SUB31";
	/**
	 * 通用模板导入-数据32
	 */
	public static final String EOCT_SUB32 = "EOCT_SUB32";
	/**
	 * 通用模板导入-数据33
	 */
	public static final String EOCT_SUB33 = "EOCT_SUB33";
	/**
	 * 通用模板导入-数据34
	 */
	public static final String EOCT_SUB34 = "EOCT_SUB34";
	/**
	 * 通用模板导入-数据35
	 */
	public static final String EOCT_SUB35 = "EOCT_SUB35";
	/**
	 * 通用模板导入-数据36
	 */
	public static final String EOCT_SUB36 = "EOCT_SUB36";
	/**
	 * 通用模板导入-数据37
	 */
	public static final String EOCT_SUB37 = "EOCT_SUB37";
	/**
	 * 通用模板导入-数据38
	 */
	public static final String EOCT_SUB38 = "EOCT_SUB38";
	/**
	 * 通用模板导入-数据39
	 */
	public static final String EOCT_SUB39 = "EOCT_SUB39";
	/**
	 * 通用模板导入-数据40
	 */
	public static final String EOCT_SUB40 = "EOCT_SUB40";
	/**
	 * 通用模板导入-数据41
	 */
	public static final String EOCT_SUB41 = "EOCT_SUB41";
	/**
	 * 通用模板导入-数据42
	 */
	public static final String EOCT_SUB42 = "EOCT_SUB42";
	/**
	 * 通用模板导入-数据43
	 */
	public static final String EOCT_SUB43 = "EOCT_SUB43";
	/**
	 * 通用模板导入-数据44
	 */
	public static final String EOCT_SUB44 = "EOCT_SUB44";
	/**
	 * 通用模板导入-数据45
	 */
	public static final String EOCT_SUB45 = "EOCT_SUB45";
	/**
	 * 通用模板导入-数据46
	 */
	public static final String EOCT_SUB46 = "EOCT_SUB46";
	/**
	 * 通用模板导入-数据47
	 */
	public static final String EOCT_SUB47 = "EOCT_SUB47";
	/**
	 * 通用模板导入-数据48
	 */
	public static final String EOCT_SUB48 = "EOCT_SUB48";
	/**
	 * 通用模板导入-数据49
	 */
	public static final String EOCT_SUB49 = "EOCT_SUB49";
	/**
	 * 通用模板导入-数据50
	 */
	public static final String EOCT_SUB50 = "EOCT_SUB50";
	/**
	 * 通用模板导入-数据51
	 */
	public static final String EOCT_SUB51 = "EOCT_SUB51";
	/**
	 * 通用模板导入-数据52
	 */
	public static final String EOCT_SUB52 = "EOCT_SUB52";
	/**
	 * 通用模板导入-数据53
	 */
	public static final String EOCT_SUB53 = "EOCT_SUB53";
	/**
	 * 通用模板导入-数据54
	 */
	public static final String EOCT_SUB54 = "EOCT_SUB54";
	/**
	 * 通用模板导入-数据55
	 */
	public static final String EOCT_SUB55 = "EOCT_SUB55";
	/**
	 * 通用模板导入-数据56
	 */
	public static final String EOCT_SUB56 = "EOCT_SUB56";
	/**
	 * 通用模板导入-数据57
	 */
	public static final String EOCT_SUB57 = "EOCT_SUB57";
	/**
	 * 通用模板导入-数据58
	 */
	public static final String EOCT_SUB58 = "EOCT_SUB58";
	/**
	 * 通用模板导入-数据59
	 */
	public static final String EOCT_SUB59 = "EOCT_SUB59";
	/**
	 * 通用模板导入-数据60
	 */
	public static final String EOCT_SUB60 = "EOCT_SUB60";
	/**
	 * 通用模板导入-状态
	 */
	public static final String EOCT_STATUS1 = "9";
	/**
	 * 执行类别为存储过程：1
	 */
	public static final String EBPD_TYPE_PRODUCE = "1";
	/**
	 * 内部调用的标识：@
	 */
	public static final String SERVICES_TYPE_FLAG = "@";
	/**
	 * 作业步骤的任务类型：海运
	 */
	public static final String SYS_TASK_TYPE_SEABORNE = "5";
	/**
	 * 下达时调用海运存储过程 br到接口表时的入参名称：海运请求ID
	 */
	public static final String SEABORNE_EOSE_ID = "eose_id";
	/**
	 * 下达时调用海运存储过程 br到接口表时的出参名称：接口ID
	 */
	public static final String SEABORNE_EDSE_ID = "edse_id";
	/**
	 * 海运正常单下发webservices调用
	 */
	public static final String REQUEST_SEABORNE_WEBSERVICE_NAME = "sendToEAIManager.sendSeaborneToEAI";
	/**
	 * 陆运正常单下发webservices调用
	 */
	public static final String REQUEST_ROAD_WEBSERVICE_NAME = "sendToEAIManager.sendRoadBRToEAI";
	/**
	 * 委托报关正常单下发webservices调用
	 */
	public static final String REQUEST_DECLARATION_DEPUTE_WEBSERVICE_NAME = "sendToEAIManager.sendDeclarationDeputeBRToEAI";
	// 空运状态反馈 未操作
	public static final String AIR_BACK_NO_ACTION = "NO_ACTION";
	// 空运状态反馈 已订舱
	public static final String AIR_BACK_HAS_BOOKING = "HAS_BOOKING";
	// 空运状态反馈 已启航
	public static final String AIR_BACK_HAS_SAIL = "HAS_SAIL";
	// 空运状态反馈 已完成
	public static final String AIR_BACK_COMPLETED = "COMPLETED";

	// 海运状态反馈 未操作
	public static final String SEA_BACK_NO_ACTION = "NO_ACTION";
	// 海运状态反馈 已订舱
	public static final String SEA_BACK_HAS_BOOKING = "HAS_BOOKING";
	// 海运状态反馈 已开船
	public static final String SEA_BACK_HAS_SAIL = "HAS_SAIL";
	// 海运状态反馈 已抵港
	public static final String SEA_BACK_HAS_ADMITTED = "HAS_ADMITTED";
	// 海运状态反馈 已完成
	public static final String SEA_BACK_COMPLETED = "COMPLETED";

	/**
	 * 化工反馈状态：新创建，出口拖车反馈状态和化工反馈状态一样
	 * 
	 * @default
	 */
	public static final String CHEM_BACK_STATUS_ADD = "ADD";
	/**
	 * 化工反馈状态：提交
	 * 
	 * @default
	 */
	public static final String CHEM_BACK_STATUS_SUBMIT = "SUBMIT";
	/**
	 * 化工反馈状态：执行中
	 * 
	 * @default
	 */
	public static final String CHEM_BACK_STATUS_DOING = "DOING";
	/**
	 * 化工反馈状态：异常
	 * 
	 * @default
	 */
	public static final String CHEM_BACK_STATUS_EXCEPTION = "EXCEPTION";
	/**
	 * 化工反馈状态：完成
	 * 
	 * @default
	 */
	public static final String CHEM_BACK_STATUS_COMPLETE = "COMPLETE";
	/**
	 * 化工反馈状态：作废
	 * 
	 * @default
	 */
	public static final String CHEM_BACK_STATUS_VOID = "VOID";
	/**
	 * 化工反馈状态：挂起
	 * 
	 * @default
	 */
	public static final String CHEM_BACK_STATUS_HANG = "HANG";
	/**
	 * 化工反馈状态：取消
	 * 
	 * @default
	 */
	public static final String CHEM_BACK_STATUS_CANCEL = "CANCEL";

	/**
	 * 委托报关反馈状态：未报关
	 * 
	 * @default
	 */
	public static final String DECL_BACK_NO_ACTION = "NO_ACTION";

	/**
	 * 委托报关反馈状态：已收单
	 * 
	 * @default
	 */
	public static final String DECL_BACK_HAS_RECEIVED = "HAS_RECEIVED";
	/**
	 * 委托报关反馈状态：已报关
	 * 
	 * @default
	 */
	public static final String DECL_BACK_HAS_CUSTOMS = "HAS_CUSTOMS";
	/**
	 * 委托报关反馈状态：已回单
	 * 
	 * @default
	 */
	public static final String DECL_BACK_HAS_BACK = "HAS_BACK";
	/**
	 * 委托报关反馈状态：已寄单
	 * 
	 * @default
	 */
	public static final String DECL_BACK_HAS_SEND = "HAS_SEND";
	/**
	 * 委托报关反馈状态：已返还
	 * 
	 * @default
	 */
	public static final String DECL_BACK_HAS_RETURN = "HAS_RETURN";
	/**
	 * 委托报关反馈状态：已完成
	 * 
	 * @default
	 */
	public static final String DECL_BACK_COMPLETED = "COMPLETED";
	/**
	 * 委托报关-通关状态：已放行
	 * 
	 * @default
	 */
	public static final String DECL_STATUS_HAS_DISCHARGED = "HAS_DISCHARGED";
	/**
	 * 委托报关-通关状态：已付税
	 * 
	 * @default
	 */
	public static final String DECL_STATUS_HAS_TAX = "HAS_TAX";
	/**
	 * 委托报关-通关状态：已递单
	 * 
	 * @default
	 */
	public static final String DECL_STATUS_HAS_DESPATCH = "HAS_DESPATCH";
	/**
	 * 委托报关-通关状态：已查验
	 * 
	 * @default
	 */
	public static final String DECL_STATUS_HAS_EXAMINED = "HAS_EXAMINED";
	/**
	 * 委托报关-通关状态：已申报
	 * 
	 * @default
	 */
	public static final String DECL_STATUS_HAS_DECLARED = "HAS_DECLARED";

	/**
	 * Webservices接收服务器名称-化工物流系统代码-EAICTMS
	 */
	public static final String SERVER_NAME_CTMS = "EAICTMS";
	/**
	 * Webservices接收服务器名称-陆运系统代码-EAITMS
	 */
	public static final String SERVER_NAME_TMS = "EAITMS";
	/**
	 * Webservices接收服务器名称-HY3
	 */
	public static final String SERVER_NAME_HY3 = "HY3";
	/**
	 * Webservices接收服务器名称-OMS
	 */
	public static final String SERVER_NAME_OMS = "EAIOMS";
	/**
	 * Web接收服务器名称-STP
	 */
	public static final String RECEIVER_CODE_STP = "STP";
	/**
	 * add by Dillen 20170303 INTTRA状态订阅接口 报文类型
	 */
	public static final String INTTRA_MessageType_FOR_JSON = "StatusQuery";
	/***************************************************************************
	 * WMS系统服务器名称
	 */
	public static final String SERVER_NAME_EAIWMS = "EAIWMS";

	/**
	 * 报文类型 海运正常单
	 */
	public static final String MESSAGE_TYPE_OFFE01 = "OFFE01";
	/**
	 * 报文类型 海运状态接收
	 */
	public static final String MESSAGE_TYPE_OFFE02 = "OFFE02";
	/**
	 * 报文类型 海运紧急接收
	 */
	public static final String MESSAGE_TYPE_OFFE03 = "OFFE03";

	/**
	 * 化工物流正常单下发报文类型
	 */
	public static final String MESSAGE_TYPE_CMRT01 = "CMRT01";
	/**
	 * 化工物流状态反馈报文类型
	 */
	public static final String MESSAGE_TYPE_CMRT02 = "CMRT02";
	/**
	 * 化工物流紧急单报文类型
	 */
	public static final String MESSAGE_TYPE_CMRT03 = "CMRT03";
	/**
	 * 出口拖车正常单下发报文类型
	 */
	public static final String MESSAGE_TYPE_EXCT01 = "EXCT01";
	/**
	 * 出口拖车状态反馈报文类型
	 */
	public static final String MESSAGE_TYPE_EXCT02 = "EXCT02";
	/**
	 * 出口拖车紧急单反馈报文类型
	 */
	public static final String MESSAGE_TYPE_EXCT03 = "EXCT03";
	/**
	 * 化工罐箱正常单下发报文类型
	 */
	public static final String MESSAGE_TYPE_TCBU01 = "TCBU01";
	/**
	 * 化工罐箱状态反馈报文类型
	 */
	public static final String MESSAGE_TYPE_TCBU02 = "TCBU02";
	/**
	 * 化工罐箱紧急单反馈报文类型
	 */
	public static final String MESSAGE_TYPE_TCBU03 = "TCBU03";

	/**
	 * 入库正常单 add by ricky 20150513
	 */
	public static final String MESSAGE_TYPE_WHIN01 = "WHIN01";
	/**
	 * 入库状态反馈 add by ricky 20150525
	 */
	public static final String MESSAGE_TYPE_WHIN02 = "WHIN02";
	/**
	 * 入库紧急单反馈 add by ricky 20150525
	 */
	public static final String MESSAGE_TYPE_WHIN03 = "WHIN03";

	/**
	 * 出库正常单 add by ricky 20150513
	 */
	public static final String MESSAGE_TYPE_WHOUT01 = "WHOUT01";
	/**
	 * 出库状态反馈 add by ricky 20150525
	 */
	public static final String MESSAGE_TYPE_WHOUT02 = "WHOUT02";
	/**
	 * 出库紧急单反馈 add by ricky 20150525
	 */
	public static final String MESSAGE_TYPE_WHOUT03 = "WHOUT03";
	/**
	 * 陆运正常单下发报文类型
	 */
	public static final String MESSAGE_TYPE_TKRT01 = "TKRT01";
	/**
	 * 陆运状态反馈报文类型
	 */
	public static final String MESSAGE_TYPE_TKRT02 = "TKRT02";
	/**
	 * 陆运紧急单报文类型
	 */
	public static final String MESSAGE_TYPE_TKRT03 = "TKRT03";
	/**
	 * 委托报关正常单 下发报文类型
	 */
	public static final String MESSAGE_TYPE_DECLD = "DECLD";
	/**
	 * 委托报关 反馈运抵报文类型
	 */
	public static final String MESSAGE_TYPE_DEADS = "DEADS";
	/**
	 * 委托报关 反馈报关单报文类型
	 */
	public static final String MESSAGE_TYPE_DECEN = "DECEN";

	/**
	 * 山东Webservices接收服务器名称-EAIBGSDZB
	 */
	public static final String SERVER_NAME_EAIBGSDZB = "EAIBGSDZB";
	/**
	 * 山东Webservices接收服务器名称-EAIBGSDLF
	 */
	public static final String SERVER_NAME_EAIBGSDLF = "EAIBGSDLF";
	/**
	 * 山东Webservices接收服务器名称-EAIBGSDJN
	 */
	public static final String SERVER_NAME_EAIBGSDJN = "EAIBGSDJN";
	/**
	 * 山东Webservices接收服务器名称-EAIBGSDDY
	 */
	public static final String SERVER_NAME_EAIBGSDDY = "EAIBGSDDY";
	/**
	 * 山东Webservices接收服务器名称-EAIBGSDWH
	 */
	public static final String SERVER_NAME_EAIBGSDWH = "EAIBGSDWH";
	/**
	 * 山东Webservices接收服务器名称-EAIBGSDYT
	 */
	public static final String SERVER_NAME_EAIBGSDYT = "EAIBGSDYT";

	/**
	 * 请求类型代码定义 海运出口货代：SE(Sea Export) 20121220 ADD
	 */
	public static final String TASK_REQUEST_TYPE_SE = "SE";

	/**
	 * 海运进口货代：SI(Sea import)
	 */
	public static final String TASK_REQUEST_TYPE_SI = "SI";

	/**
	 * 出口拖车：ET(Export Trailer)
	 */
	public static final String TASK_REQUEST_TYPE_ET = "ET";

	/**
	 * 进口拖车：IT(Import Trailer)
	 */
	public static final String TASK_REQUEST_TYPE_IT = "IT";

	/**
	 * 空运出口货代：AE(Air Export)
	 */
	public static final String TASK_REQUEST_TYPE_AE = "AE";

	/**
	 * 铁路运输：RR
	 */
	public static final String TASK_REQUEST_TYPE_RR = "RR";

	/**
	 * 空运进口货代：AI(Air Import)
	 */
	public static final String TASK_REQUEST_TYPE_AI = "AI";

	/**
	 * 委托报关: DD (Delegate Declaration)
	 */
	public static final String TASK_REQUEST_TYPE_DD = "DD";

	/**
	 * 直接报关：CD(Customs Declaration)
	 */
	public static final String TASK_REQUEST_TYPE_CD = "CD";

	/**
	 * 化工运输：CT(Chemical Transportation)
	 */
	public static final String TASK_REQUEST_TYPE_CT = "CT";

	/**
	 * 陆运运输：LT(Land Transport)
	 */
	public static final String TASK_REQUEST_TYPE_LT = "LT";

	/**
	 * 入库: IS (In Stock)
	 */
	public static final String TASK_REQUEST_TYPE_IS = "IS";

	/**
	 * 出库: OS (Out Stock)
	 */
	public static final String TASK_REQUEST_TYPE_OS = "OS";

	/**
	 * 海外跟踪: AB (ABROAD)
	 */
	public static final String TASK_REQUEST_TYPE_AB = "AB";

	/**
	 * 内贸航运 DS(Domestic Shipping)
	 */
	public static final String TASK_REQUEST_TYPE_DS = "DS";
	/**
	 * 化工罐箱 CC(CHEM CONTAINER)
	 */
	public static final String TASK_REQUEST_TYPE_CC = "CC";

	/**
	 * 委托提交存储过程入参名称：ccid 委托ID 20130122
	 */
	public static final String CCID = "ccid";
	/**
	 * 订单执行存储过程入参名称：loid 订单ID 20130122
	 */
	public static final String LOID = "loid";
	/**
	 * 订单业务票据取值的存储过程入参名称：batchnumber 批次号 20140422
	 */
	public static final String BATCHNUMBER = "batchnumber";
	/**
	 * 订单业务票据取值的存储过程入参名称：flag 订单列表标识 20140422
	 */
	public static final String FLAG = "flag";
	/**
	 * 订单业务票据取值的存储过程入参名称：isDutyFee 订单列表标识 20161228
	 */
	public static final String DUTYFREE = "dutyFreeFlag";
	/**
	 * 订单业务票据取值的存储过程出参名称：eiim_id 订单接口主数据ID 20140422
	 */
	public static final String EIIM_ID = "eiim_id";
	/**
	 * 订单业务票据取值的存储过程出参名称：eiim_ids_str 订单接口主数据ID 20140422
	 */
	public static final String EIIM_IDS_STR = "eiim_ids_str";
	/**
	 * 订单业务票据取值的存储过程入参名称：brtype 任务类型 20150804
	 */
	public static final String BRTYPE = "brtype";

	/**
	 * 订单执行存储过程入参名称：loid 订单ID 20130122
	 */
	public static final String ACCEPT_DATE = "acceptDate";
	/**
	 * 请求下达存储过程入参名称：brid 请求ID 20130122
	 */
	public static final String BRID = "brid";
	public static final String EVET_TYPE = "evetType";

	/**
	 * 委托提交，订单执行，请求下达存储过程出参名称：errm 提示信息 20130122
	 */
	public static final String ERRM = "errm";
	/**
	 * 基础数据下发 执行存储过程入参 mdid
	 */
	public static final String MDID = "mdid";
	/**
	 * 基础数据下发 执行存储过程入参 ids
	 */
	public static final String IDS = "ids";
	/**
	 * 通用模板导入 执行存储过程入参 tfid
	 */
	public static final String TFID = "tfid";
	/**
	 * 请求下达存储过程出参名称：ediid 接口表ID 20130122
	 */
	public static final String EDDID = "ediid";
	/**
	 * 作业步骤中的任务类型：出库 1
	 */
	public static final String TASK_TYPE_OUT = "1";
	/**
	 * 作业步骤中的任务类型：入库 2
	 */
	public static final String TASK_TYPE_IN = "2";
	/**
	 * 作业步骤中的任务类型：陆运 3
	 */
	public static final String TASK_TYPE_TMS = "3";
	/**
	 * 作业步骤中的任务类型：报关 4
	 */
	public static final String TASK_TYPE_CMS = "4";
	/**
	 * 作业步骤中的任务类型：海运 5
	 */
	public static final String TASK_TYPE_SEA_BORNE = "5";
	/**
	 * 作业步骤中的任务类型：海运进口 10
	 */
	public static final String TASK_TYPE_IN_SEA_BORNE = "10";
	/**
	 * 作业步骤中的任务类型：空运 6
	 */
	public static final String TASK_TYPE_AIR_BORNE = "6";
	/**
	 * 作业步骤中的任务类型：空运 6
	 */
	public static final String TASK_TYPE_IMPORTAIRBORNE = "14";
	/**
	 * 作业步骤中的任务类型：内贸水运 12
	 */
	public static final String TASK_TYPE_WATERBORNE = "12";
	/**
	 * 作业步骤中的任务类型：铁路运输 13
	 */
	public static final String TASK_TYPE_RAILWAY = "13";
	/**
	 * 作业步骤中的任务类型：化工运输 7
	 */
	public static final String TASK_TYPE_CTMS = "7";
	/**
	 * 作业步骤中的任务类型：出口拖车 8
	 */
	public static final String TASK_TYPE_EXPORT_TRAILER = "8";
	/**
	 * 作业步骤中的任务类型：委托报关 9
	 */
	public static final String TASK_TYPE_DELEGATE_DECLARATION = "9";
	/**
	 * 作业步骤中的任务类型：进口拖车 15
	 */
	public static final String TASK_TYPE_IMPORT_TRAILER = "15";
	/**
	 * 作业步骤中的任务类型：化工罐箱 16
	 */
	public static final String TASK_TYPE_CHEM_CONTAINER = "16";

	// 订舱
	public static final String TASK_TYPE_BOOKING = "17";
	// 报检
	public static final String TASK_TYPE_INSPECTION = "18";
	// 保险
	public static final String TASK_TYPE_INSURANCE = "19";
	// 货代进口
	public static final String TASK_TYPE_FREIGHT_IMPORT = "20";
	// 货代出口
	public static final String TASK_TYPE_FREIGHT_OMPORT = "21";

	/**
	 * 业务执行逻辑定义，执行类型:存储过程
	 */
	public static final String SYS_PROCEDURE_TYPE_PROCEDURE = "1";
	/**
	 * 业务执行逻辑定义，执行类型:OMSService
	 */
	public static final String SYS_PROCEDURE_TYPE_OMSSERVICE = "2";
	/**
	 * 业务执行逻辑定义，执行类型:EDIService
	 */
	public static final String SYS_PROCEDURE_TYPE_EDISERVICE = "3";
	/**
	 * 业务执行逻辑定义，执行类型:WebService
	 */
	public static final String SYS_PROCEDURE_TYPE_WEBSERVICE = "4";

	/**
	 * 进口 I
	 */
	public static final String SYS_IMPORT = "I";

	/**
	 * 出口 E
	 */
	public static final String SYS_EXPORTE = "E";
	
	/**
	 * 内贸 L
	 */
	public static final String SYS_DOMESTIC = "L";
	
	/**
	 * 铁路运输途径点序号规则名称
	 */
	public static final String RAILWAY_NO_NAME = "railwayNo";

	/** ****************订单不符合项 常量 start********************** */
	/**
	 * 不符合项类型
	 */
	public static final String ORG_ANOMALY_TYPE = "ORG_ANOMALY_TYPE";
	/**
	 * 不符合项内容
	 */
	public static final String ORG_ANOMALY_CONTENT = "ORG_ANOMALY_CONTENT";
	/**
	 * 符合项类型 1
	 */
	public static final String ORDER_ANOMAL_CLASS_1 = "1";
	/**
	 * 符合项内容 2
	 */
	public static final String ORDER_ANOMAL_CLASS_2 = "2";
	/**
	 * 订单不符合项状态 ：新增
	 */
	public static final String HAS_ADD = "ADD";
	/**
	 * 订单不符合项状态 ：已调查
	 */
	public static final String HAS_INVESTIGAT = "HAS_INVESTIGAT";
	/**
	 * 订单不符合项状态 ：已通知
	 */
	public static final String HAS_NOTICE = "HAS_NOTICE";
	/**
	 * 订单不符合项状态 ：已执行
	 */
	public static final String HAS_EXECUTED = "HAS_EXECUTED";
	/**
	 * 订单不符合项状态 ：已完成
	 */
	public static final String HAS_COMPLETED = "HAS_COMPLETED";
	/**
	 * 订单不符合项状态 ：已反馈
	 */
	public static final String HAS_FEEDBACK = "HAS_FEEDBACK";
	/**
	 * 订单不符合项状态 :已审核
	 */
	public static final String HAS_AUDITED = "HAS_AUDITED";
	/**
	 * 责任关系类别 0=主要责任人
	 */
	public static final String SYS_RESPONSIBILITY_CLASS_0 = "0";
	/**
	 * 责任关系类别 1=次要责任人
	 */
	public static final String SYS_RESPONSIBILITY_CLASS_1 = "1";
	/**
	 * 责任关系类别 2=相关责任人
	 */
	public static final String SYS_RESPONSIBILITY_CLASS_2 = "2";
	/**
	 * 措施状态 ADD=新增
	 */
	public static final String MEASURE_STATUS_ADD = "ADD";
	/**
	 * 措施状态 EXECUTED=已执行
	 */
	public static final String MEASURE_STATUS_EXECUTED = "EXECUTED";
	/**
	 * 措施状态 CHECK=已检查、
	 */
	public static final String MEASURE_STATUS_CHECK = "CHECK";
	/**
	 * 措施状态 EXAMINED=已审查
	 */
	public static final String MEASURE_STATUS_EXAMINED = "EXAMINED";
	/**
	 * 客户反馈状态 ：新增
	 */
	public static final String FEEDBACK_ADD = "ADD";
	/**
	 * 客户反馈状态 ： 通过
	 */
	public static final String FEEDBACK_PASS = "PASS";
	/**
	 * 客户反馈状态 ： 不通过
	 */
	public static final String FEEDBACK_UNPASS = "UNPASS";
	/**
	 * 订单不符合项——文件上传
	 */
	public static final String ORDER_ANOMALY_FILE = "anomaly";
	/**
	 * 订单不符合项编号规则名称
	 */
	public static final String ORDER_ANOMALY_NO = "orderAnomaly";
	
	/**
	 * 报关任务Excel上传
	 */
	public static final String DECLARE_EXCEL_UPLOAD_TYPE = "declareExcel";

	/** ****************订单不符合项 常量 end ********************** */

	/** **************** 费用相关 start*********************** */
	/**
	 * 数据处理标记 0:未处理
	 */
	public static final Long HD_SYMBOL_0 = 0l;
	/**
	 * 数据处理标记 1:已上传
	 */
	public static final Long HD_SYMBOL_1 = 1l;
	/**
	 * 数据处理标记 9:上传中
	 */
	public static final Long HD_SYMBOL_9 = 9l;
	/**
	 * 数据处理标记 2:上传成功
	 */
	public static final Long HD_SYMBOL_2 = 2l;
	/**
	 * 数据处理标记 -1:上传失败
	 */
	public static final Long HD_SYMBOL_F = -1l;
	/**
	 * 数据处理标记 -3:加载失败
	 */
	public static final Long HD_SYMBOL_3_F = -3l;
	/**
	 * 数据处理标记 3：加载成功
	 */
	public static final Long HD_SYMBOL_3 = 3l;

	/**
	 * 应付费用
	 */
	public static final String FEE_TYPE_P = "P";
	/**
	 * 应收费用
	 */
	public static final String FEE_TYPE_R = "R";
	/**
	 * 代收费用
	 */
	public static final String FEE_TYPE_REP_R = "RR";
	/**
	 * 代付费用
	 */
	public static final String FEE_TYPE_REP_P = "RP";
	/**
	 * 忽略费用类型
	 */
	public static final String FEE_TYPE_N = "N";
	/**
	 * 费用标记 1 应收 -1 应付 0 代收代付
	 */
	public static final Long FEE_TYPE_IS_R = 1L;
	public static final Long FEE_TYPE_IS_P = -1L;
	public static final Long FEE_TYPE_IS_RP = 0L;

	/**
	 * 汽运发送方
	 */
	public static final String SERVER_NAME_TCSDZB = "EAITCSDZB";

	/***************************************************************************
	 * 免税
	 */
	public static final Long IS_DUTYFREE = 1L;
	/**
	 * 非免税
	 */
	public static final Long NOT_DUTYFREE = 0L;
	 /**
	  *  免税
	 */
	public static final String IS_DUTYFREE_STRING="1";
	/**
	 * 非免税
	 */
	public static final String NOT_DUTYFREE_STRING="0";
	
	/**
	 * 费用保存时更新状态，取控制参数
	 */
	public static final String AUTO_CONFIRM = "AUTO_CONFIRM";

	/** ****************** 费用相关 end********************* */

	/**
	 * 上传文件类型：1 订单文件上传及查询
	 */
	public static final String SYS_FILE_TYPE_ORDER = "0";

	public static final String EBPJ_ID = "ebpjId";

	/**
	 * 项目分供方信息
	 */
	public static final String PROJECT_SUBS = "Subs";

	// 物料组代码 add by daniel
	public static final String EB_MATERIAL_GROUP_CODE = "EBMG_CODE";
	// 发货人代码 add by daniel
	public static final String EB_SHIPPER_CODE = "SHIPPER_NO";
	// 收货人代码 add by daniel
	public static final String EB_CONSIGNEE_CODE = "CONSIGNEE_NO";
	// 货主供应方代码 add by daniel
	public static final String EB_OWNER_SUP_CODE = "OWNER_SUP_CODE";
	// 货主供应方代码 add by daniel
	public static final String EB_SUB_SUP_CODE = "SUB_SUP_CODE";
	// 用户组代码 add by daniel
	public static final String ES_USER_GROUP_CODE = "USER_GROUP_CODE";
	// 角色代码 add by daniel
	public static final String ES_ROLE_CODE = "ROLE_CODE";
	// 区域代码 add by daniel
	public static final String ES_REGION_NO = "REGION_NO";
	// 港口代码 add by daniel
	public static final String EB_PORT_CODE = "PORT_CODE";
	// 行车路线代码 add by daniel
	public static final String EB_LINE_CODE = "LINE_CODE";
	// 资质代码 add by daniel
	public static final String EB_CERTIFICATION_CODE = "CERTIFICATION_CODE";
	// 数据源代码 add by daniel
	public static final String EB_DATASOURCE_CODE = "DATASOURCE_CODE";
	// 系统消息代码 add by daniel
	public static final String SYS_MSG_CODE = "SYS_MSG_CODE";
	// 平台消息代码 add by daniel
	public static final String ORG_MSG_CODE = "ORG_MSG_CODE";
	// 验车单号 add by daniel
	public static final String EB_VEHICLE_CODE = "VEHICLE_CODE";
	// 方案代码 add by daniel
	public static final String EB_DATAPROGRAM_CODE = "DATAPROGRAM_CODE";

	// 方案代码 add by daniel
	public static final String FEE_SOURCE_AUTO = "AUTO";
	// 方案代码 add by daniel
	public static final String FEE_SOURCE_HAND = "HAND";
	// BMSL项目名称 add by daniel
	public static final String BMSL_PROJECT_NAME = "拜耳中国";
	// 业务完成过期时间
	public static final String ACMP_PASS_DATE = "ACMP_PASS_DATE";
	// 费用已确认
	public static final Long EFBF_STATUS_1 = 1L;
	// 费用新增
	public static final Long EFBF_STATUS_0 = 0L;
	// 费用上传成功
	public static final Long EFBF_STATUS_2 = 2L;
	// 费用接受成功
	public static final Long EFBF_STATUS_3 = 3L;
	// 审核成功
	public static final Long EFBF_STATUS_4 = 4L;
	// 上传中
	public static final Long EFBF_STATUS_9 = 9L;
	// 上传失败
	public static final Long EFBF_STATUS_E2 = -2L;
	// 接受失败
	public static final Long EFBF_STATUS_E3 = -3L;
	// 审核失败
	public static final Long EFBF_STATUS_E4 = -4L;

	// bmsl订单类型 inbound
	public static final String ORDER_TYPE_Inbound = "Inbound";
	// bmsl订单类型 Outbound
	public static final String ORDER_TYPE_Outbound = "Outbound";
	// bmsl订单类型 Uturn
	public static final String ORDER_TYPE_Uturn = "U-Turn";
	// bmsl订单类型 BLP
	public static final String ORDER_TYPE_BLP = "BLP";
	// bmsl订单类型 REINVOICE
	public static final String ORDER_TYPE_REINVOICE = "REINVOICE";
	// bmsl订单类型 EOCIS
	public static final String ORDER_TYPE_EOCIS = "EOCIS";

	public static final String BMS_KPI = "BMSKPI";
	// bmsl 导出模版inbound
	public static final String BMS_EXPORT_INBOUND = "/excel/Inbound.xls";
	// bmsl 导出模版Outbound
	public static final String BMS_EXPORT_OUTBOUND = "/excel/Outbound.xls";
	// bmsl 导出模版U-Turn
	public static final String BMS_EXPORT_UTURN = "/excel/U-Turn.xls";
	// bmsl 导出模版BLP
	public static final String BMS_EXPORT_BLP = "/excel/BLP.xls";
	// bmsl 导出模版3rd
	public static final String BMS_EXPORT_3RD = "/excel/3rd.xls";
	// bmsl 导出模版EOCIS
	public static final String BMS_EXPORT_EOCIS = "/excel/EOCIS.xls";

	/**
	 * 上传文件类型：9 excel 订单列表导入excel 20131218
	 */
	public static final String SYS_FILE_TYPE_ORDER_LIST_EXCEL = "9";
	/**
	 * 上传文件类型：90 excel 订单列表导入excel 20131218
	 */
	public static final String SYS_FILE_TYPE_ORDER_LIST_TXT = "90";
	/**
	 * 上传文件类型 货代进口预备箱
	 */
	public static final String ORDER_FILE_TYPE_CONTAINER = "container";
	/**
	 * 上传类型：报关货物
	 */
	public static final String ORDER_FILE_TYPE_CAGRO = "CAGRO";
	/**
	 * 中海壳牌项目的代码 CSPC
	 */
	public static final String EBPJ_CODE_CSPC = "CSPC";
	/**
	 * 瑞池公司的代码 260
	 */
	public static final String ESCO_CODE_REACH = "260";
	/**
	 * 中海壳牌项目的订单类型 多式联运 D
	 */
	public static final String ORDER_TYPE_CSPC_D = "D";

	/**
	 * 中海壳牌项目 大亚湾基地
	 */
	public static final String CSPC_BASE_STATION = "大亚湾基地";
	/**
	 * 中海壳牌项目 揽货部门
	 */
	public static final String CSPC_BASE_ESDE_CODE = "11321601";
	/**
	 * 中海壳牌项目 中海壳牌石油化工有限公司
	 */
	public static final String CSPC_NAME = "中海壳牌石油化工有限公司";

	/**
	 * 收发货人类型：1 提货地
	 */
	public static final String SYS_SHIPPER_TYPE = "1";

	/**
	 * 收发货人类型：2 收货人
	 * 
	 */
	public static final String SYS_CONSIGNEE_TYPE = "2";

	/**
	 * 订单来源
	 * 
	 */
	public static final String ORDER_SOURCE_EXCEL = "EXCEL";

	/**
	 * ECMS物理代码
	 * 
	 */
	public static final String ECMS_SYS_CODE = "ECMS";
	/**
	 * 订单费用计算存储过程入参名称：userId 用户ID 20140319 James
	 */
	public static final String USER_ID = "userid";

	/**
	 * 时间格式-yyyyMMddHHmmssSSS 20121203 处理文件名重名问题，时间精确到毫秒增加SSS
	 */
	public static final String DATA_FORMAT = "yyyyMMddHHmmssSSS";

	/**
	 * HD_数据处理标志 固定为“N”
	 */
	/**
	 * 客户代码编码规则
	 */
	public static final String EB_CUSTOMER_NO = "EBCUSTOMERNO";
	public static final String BMS_HD_SYMBOL = "N";

	public static final String BU_CODE_OOCL = "OOCL";

	public static final String OOCL_TDITIS = "TDITIS";
	public static final String OOCL_TDITIC = "TDITIC";
	public static final String OOCL_TDITPP = "TDITPP";
	public static final String OOCL_TDITPA = "TDITPA";
	public static final String OOCL_TDIAPT = "TDIAPT";
	public static final String OOCL_TDITPN = "TDITPN";
	public static final String OOCL_BKRQST = "BKRQST";
	public static final String OOCL_BKCONF = "BKCONF";
	public static final String OOCL_BLASWB = "BLASWB";
	public static final String OOCL_VSLVOY = "VSLVOY";
	public static final String OOCL_ESTVDP = "ESTVDP";
	public static final String OOCL_ESTVAR = "ESTVAR";
	public static final String OOCL_LOADPl = "LOADPl";
	public static final String OOCL_LSPBZN = "LSPBZN";
	public static final String OOCL_INCTRM = "INCTRM";
	public static final String OOCL_INCTML = "INCTML";
	public static final String OOCL_GW = "GW";
	public static final String OOCL_VOLUME = "VOLUME";
	public static final String OOCL_SUBCTR = "SUBCTR";
	public static final String OOCL_TSPTYP = "TSPTYP";
	public static final String OOCL_TSPQTY = "TSPQTY";
	public static final String OOCL_TRUKID = "TRUKID";
	public static final String OOCL_DRVRID = "DRVRID";
	public static final String OOCL_ATTDID = "ATTDID";
	public static final String OOCL_TRAIID = "TRAIID";
	public static final String OOCL_ESTLOD = "ESTLOD";
	public static final String OOCL_ESTGAR = "ESTGAR";
	public static final String OOCL_GDLOAD = "GDLOAD";
	public static final String OOCL_VSLDPT = "VSLDPT";
	public static final String OOCL_VSLAVD = "VSLAVD";
	public static final String OOCL_GDARVD = "GDARVD";
	public static final String OOCL_DELAYR = "DELAYR";
	public static final String OOCL_POL = "POL";
	public static final String OOCL_POD = "POD";
	public static final String OOCL_DESTPT = "DESTPT";
	public static final String OOCL_CARRIER = "CARRIER";
	public static final String OOCL_HOUSNO = "HOUSNO";
	public static final String OOCL_CMPTDR = "CMPTDR";
	public static final String OOCL_INVOIN = "INVOIN";
	public static final String OOCL_CSTBKR = "CSTBKR";
	public static final String OOCL_HDBKNO = "HDBKNO";
	public static final String OOCL_CNPDTN = "CNPDTN";
	public static final String OOCL_HSCODE = "HSCODE";
	public static final String OOCL_DGDCLC = "DGDCLC";
	public static final String OOCL_DECLAS = "DECLAS";
	public static final String OOCL_DECLAF = "DECLAF";
	public static final String OOCL_CSTSTN = "CSTSTN";
	public static final String OOCL_GDAVDE = "GDAVDE";
	public static final String OOCL_BLRCVD = "BLRCVD";
	public static final String OOCL_CAPEFM = "CAPEFM";
	public static final String OOCL_CAPFMC = "CAPFMC";
	public static final String OOCL_CSRTRN = "CSRTRN";
	public static final String OOCL_DVTCD = "DVTCD";

	/**
	 * add by Nero createtime 2014-11-11 状态池接口报文接收方代码
	 */
	public static final String RECEIVER_CODE = "BJ_STATUSPOOL";
	/**
	 * add by Nero createtime 2014-11-11 状态池接口报文记录类型标识
	 */
	public static final Long RECORD_ID = 50L;
	/**
	 * add by Nero createtime 2014-11-11 状态池接口报文类型
	 */
	public static final String DP_OUT_MessageType = "STATUS";
	/**
	 * add by Nero createtime 2014-11-11 状态池接口HD数据处理中
	 */
	public static final String HdSymbol_MID = "1";
	/**
	 * add by Nero createtime 2014-11-11 状态池接口HD数据处理失败
	 */
	public static final String HdSymbol_Fail = "E";

	public static final String SYS_CDH_SYSTEM_CODE = "SINOOMS";
	// N = 未处理
	public static final String SYS_EI_N = "N";
	// Y = 已处理
	public static final String SYS_EI_Y = "Y";
	// YO = 完成-（已处理）Y由edi写入 BMS读取为Y的后，改为YO，
	public static final String SYS_EI_YO = "YO";
	// 1 = EDI处理中
	public static final String SYS_EI_L = "1";
	// E = 处理失败
	public static final String SYS_EI_E = "E";
	// EO = 完成-（处理失败）e由edi写入 BMS读取为e的后，改为EO，
	public static final String SYS_EI_EO = "EO";

	/** 客户供应商chd上传状态 */
	// 0 = 未上传
	public static final Long SYS_EBCU_CHD_NOT = 0l;
	// 1 = 已上传
	public static final Long SYS_EBCU_CHD_YES = 1l;
	// 2 = 上传成功（CDH接收请求)
	public static final Long SYS_EBCU_CHD_SUCCESS = 2l;
	// 2 = 上传成功（CDH接收请求)
	public static final String SYS_EBCU_CHD_SUCCESS_STRING = "2";
	// 3 = 授予代码（CDH反馈代码）
	public static final Long SYS_EBCU_CHD_RES = 3l;
	// -1 = 上传失败
	public static final Long SYS_EBCU_CHD_FAIL = -1l;
	// 4 = 申请成功
	public static final Long SYS_EBCU_CHD_APPLICATION_SUCCESS = 4L;
	
	// 4 = 申请成功
	public static final String SYS_EBCU_CHD_APPLICATION_SUCCESS_STRING = "4";
	// -2 = 申请失败
	public static final Long SYS_EBCU_CHD_APPLICATION_FAIL = -2L;

	// CDH回复成功标识
	public static final String SYS_CDH_SUCCESS = "S01";

	/**
	 * 客户供应商交易实体身份
	 */
	// 客户
	public static final String SYS_EBCU_REQUEST_CO = "CO";
	// 供应商
	public static final String SYS_EBCU_REQUEST_VO = "VO";
	// 客户供应商
	public static final String SYS_EBCU_REQUEST_CV = "CV";

	public static final String DSXM_URL = "DSXM_URL";
	public static final String STATUS_SUC = "1";
	public static final String STATUS_FAI = "2";
	// 基本信息变更
	public static final String CHANGE_TYPE_BASIC = "0";
	// 管理账号信息变更
	public static final String CHANGE_TYPE_ID = "1";

	// 用户已激活 add by ricky 20150413
	public static final String USER_ENABLE_YES = "Y";

	// 海关查验 add by ricky 20150912
	public static final String EOIB_C_CHECK = "c";

	// 商检查验 add by ricky 20150912
	public static final String EOIB_Q_CHECK = "q";
	// 换单 add by wesley 20150916
	public static final String EOIB_A_SINGLE = "a";
	// 押箱
	public static final String EOIB_B_CONTAINER = "b";
	// 缴费
	public static final String EOIB_D_PAYMENT = "d";

	// 服务要求存在 add by ricky 20151112
	public static final String EOEA_IS_YES = "1";
	// 服务要求不存在 add by ricky 20151112
	public static final String EOEA_IS_NO = "0";

	/**
	 * 报关请求编号规则名称
	 */
	public static final String EODD_NO = "ENTRUSTCUSTOM";
	/**
	 * 报关请求编号规则名称
	 */
	public static final String EODD_NO_REQUEST = "EODDENTRUSTCUSTOM";

	/**
	 * 报检请求编号规则名称
	 */
	public static final String EORN_NO = "BRINSPECTION";
	/**
	 * 费用预约号编号规则名称
	 */
	public static final String FEE_BOOKING_NO = "FEESBOOKINGNO";

	/**
	 * 保险请求编号规则名称
	 */
	public static final String EORI_NO = "BRINSURANCE";
	/**
	 * 订舱请求表备注一下达类型-提单下达
	 */
	public static final String EORB_LADING_ISSUED = "LADING_ISSUED";
	/**
	 * 订舱请求表备注一下达类型-订舱下达
	 */
	public static final String EORB_ISSUED_SUBSTR1 = "EORB_ISSUED";
	/**
	 * 订舱请求表备注一下达类型-下达
	 */
	public static final String EORB_ISSUED = "ISSUED";
	/**
	 * 下达类型（2为提单下达，1为订舱下达）
	 */
	public static final String EDI_EODB_TWO = "2";
	/**
	 * 下达类型（2为提单下达，1为订舱下达）
	 */
	public static final String EDI_EODB_ONE = "1";
	/**
	 * 水运货代
	 */
	public static final String BUSINESS_TYPE_WATERWAY_FREIGHT = "01";
	/**
	 * 航空货代
	 */
	public static final String BUSINESS_TYPE_AIR_FREIGHT = "02";
	/**
	 * 铁路货代
	 */
	public static final String BUSINESS_TYPE_RAILWAY_FREIGHT = "03";
	/**
	 * 公路运输
	 */
	public static final String BUSINESS_TYPE_ROAD = "04";
	/**
	 * 报关
	 */
	public static final String BUSINESS_TYPE_DECLARATION = "05";
	/**
	 * 多式联运
	 */
	public static final String BUSINESS_TYPE_MULTIMODAL_TRANSPORTATION = "06";
	/**
	 * 船务代理
	 */
	public static final String BUSINESS_TYPE_SHIPPING_AGENCY = "07";
	/**
	 * 船代单证
	 */
	public static final String BUSINESS_TYPE_SHIPPING_DOCUMENTS = "08";
	/**
	 * 船代箱管
	 */
	public static final String BUSINESS_TYPE_SHIPPING_CONTAINER = "09";
	/**
	 * 仓储
	 */
	public static final String BUSINESS_TYPE_STOCK = "10";
	/**
	 * 备用模板11-15
	 */
	public static final String BUSINESS_TYPE_TEMPLATE_11 = "11";
	public static final String BUSINESS_TYPE_TEMPLATE_12 = "12";
	public static final String BUSINESS_TYPE_TEMPLATE_13 = "13";
	/**
	 * 合同物流
	 */
	public static final String BUSINESS_TYPE_TEMPLATE_CONTRACT = "14";
	public static final String BUSINESS_TYPE_TEMPLATE_15 = "15";
	/**
	 * 结算模板
	 */
	public static final String BUSINESS_TYPE_SETTLEMENT = "99";

	/**
	 * 订单来源
	 */
	public static final String FREIGHT_IMPORT_ZXD = "9";
	// 费用（应收/应付）审核状态 0 未审核 2 已审核
	public static final String EIEPRPSTATUS_OK = "2";
	// 费用（应收/应付）审核状态 0 未审核 2 已审核
	public static final String EIEPRPSTATUS_NO = "0";
	
	// 费用状态  9：上传中
	public static final Long EFBF_STATUS_UPLOADING = 9l;

	/**
	 * 开票状态
	 */
	public static final String INVOICE_STATUS_OK = "已开票";
	public static final String INVOICE_STATUS_PART = "部分开票";
	public static final String INVOICE_STATUS_NO = "未开票";

	/**
	 * 核销状态
	 */
	public static final String CHARGEOFF_STATUS_OK = "已核销";
	public static final String CHARGEOFF_STATUS_PART = "部分核销";
	public static final String CHARGEOFF_STATUS_NO = "未核销";

	/**
	 * 是否非免税
	 */
	/**
	 * 免税
	 */
	public static final String IS_DUTYFREE_STR = "(免)";
	/**
	 * 非免税
	 */
	public static final String NOT_DUTYFREE_STR = "(非)";
	/**
	 * 项目执行计划 铁路班列箱维度ID 5061750 PRD
	 */
	public static final String PROJECT_PLAN_TRAIN_SCHEDULING_NAME = "铁路班列箱维度";

	/**
     *2017-09-07 albert
	 * 币种
	 */
	public static final String CURRENCY_CNY = "CNY";
	
	/**
	 * 报关请求url
	 */
	public static final String DECLARE_CUSTOMS_URL = "http://172.30.17.84:7003/testweb/service/SelectCodeQuery-";
	
	/**
	 * 委托受理拒绝code
	 */
	public static final String EO_ORDER_REFUSE = "EO_ORDER_REFUSE";
	
	public static final String ORIG_SYSTEM_PLMS="PLMS";
	
	/**
	 * 现结上传增加流向的判断
	 */
	public static final String PORT_COUNT_WAY_ONE = "1";
	
	/**
	 * 流向的类型-内贸
	 */
	public static final String FLOW_EFBM_ATTRIBUTE_001_DOM = "DOM";
	public static final String FLOW_EFBM_ATTRIBUTE_001_L = "L";
	
	/**
	 * 流向的类型-进口
	 */
	public static final String FLOW_EFBM_ATTRIBUTE_001_IMP = "IMP";
	public static final String FLOW_EFBM_ATTRIBUTE_001_I = "I";
	
	/**
	 * 流向的类型-出口
	 */
	public static final String FLOW_EFBM_ATTRIBUTE_001_EXP = "EXP";
	public static final String FLOW_EFBM_ATTRIBUTE_001_E = "E";
	
	/**
	 * 国家名称-中国
	 */
	public static final String COUNTRY_NAME_CHINA = "中国";
	
	/**
	 * 地点类别
	 */
	public static final String EBPL_TYPE_PLACE_COUNTRY= "PLACE_COUNTRY";

	/**
	 * 订单类型-水路货代
	 */
	public static final String BUSINESS_TYPE_ONE = "01";
	
	/**
	 * 订单类型-航空货代
	 */
	public static final String BUSINESS_TYPE_TWO = "02";

	/**
	 * 订单类型-铁路货代
	 */
	public static final String BUSINESS_TYPE_THREE = "03";
	
	/**
	 * 订单类型-公路货代
	 */
	public static final String BUSINESS_TYPE_FOUR = "04";
	
	/**
	 * 订单类型-报关货代
	 */
	public static final String BUSINESS_TYPE_FIVE = "05";
	
	/**
	 * BMS业务类型 - 01（水路货代）
	 */
	public static final String BMS_EBBT_CODE_01 = "01";
	
	/**
	 * BMS业务类型 - 02（航空货代）
	 */
	public static final String BMS_EBBT_CODE_02 = "02";
	
	/**
	 * BMS业务类型 - 03（铁路货代）
	 */
	public static final String BMS_EBBT_CODE_03 = "03";
	
	/**
	 * BMS业务类型 - 04（公路运输）
	 */
	public static final String BMS_EBBT_CODE_04 = "04";
	
	/**
	 * BMS业务类型 - 05（报关）
	 */
	public static final String BMS_EBBT_CODE_05 = "05";
	
	/**
	 * BMS业务类型 - 14（合同物流）
	 */
	public static final String BMS_EBBT_CODE_14 = "14";
	
	/**
	 * 项目执行计划-作业步骤-任务类型- 出库
	 */
	public static final String EBTK_TYPE_01 = "1";
	
	/**
	 * 项目执行计划-作业步骤-任务类型- 入库
	 */
	public static final String EBTK_TYPE_02 = "2";
	
	/**
	 * 项目执行计划-作业步骤-任务类型- 公路运输
	 */
	public static final String EBTK_TYPE_03 = "3";
	
	/**
	 * 项目执行计划-作业步骤-任务类型- 海运出口
	 */
	public static final String EBTK_TYPE_05 = "5";
	
	/**
	 * 项目执行计划-作业步骤-任务类型-空运出口
	 */
	public static final String EBTK_TYPE_06 = "6";
	
	/**
	 * 项目执行计划-作业步骤-任务类型- 委托报关
	 */
	public static final String EBTK_TYPE_9 = "9";
	
	/**
	 * 项目执行计划-作业步骤-任务类型- 海运进口
	 */
	public static final String EBTK_TYPE_10 = "10";
	
	/**
	 * 项目执行计划-作业步骤-任务类型- 内贸水运
	 */
	public static final String EBTK_TYPE_12 = "12";
	
	/**
	 * 项目执行计划-作业步骤-任务类型- 铁路运输
	 */
	public static final String EBTK_TYPE_13 = "13";
	
	/**
	 * 项目执行计划-作业步骤-任务类型- 空运进口
	 */
	public static final String EBTK_TYPE_14 = "14";

	/**
	 * 项目执行计划-作业步骤-任务类型- 订舱
	 */
	public static final String EBTK_TYPE_17 = "17";
	
	/**
	 * OMS - 订单来源 - 货代 - 7
	 */
	public static final String EOOR_SOURCE_7 = "7";
	/**
	 * OMS - 订单来源 - 海运 - 11
	 */
	public static final String EOOR_SOURCE_11 = "11";
	
	public static final Long IS_BOOKING_SELECT = 1L;
	
	/**
	 * 上传文件类型：EO_ORDER_FEES_LIST_EXCEL excel 订单费用列表导入excel 20180614  shoven
	 */
	public static final String EO_ORDER_FEES_LIST_EXCEL = "EO_ORDER_FEES_LIST_EXCEL";

	/**
	 * 上传公告文件
	 */
	public static final String SYS_FILE_TYPE_ESBH="eshbfile";
	/**
	 * 公告附件下载
	 */
	public static final String ESBH_DOWNLOAD="ESBH_DOWNLOAD";
	
	/**************************************************************单票操作表结算审核状态**************************/
	/**
	 * 结算审核状态-审核成功【2】
	 */
	public static final Long EFBM_BMS_STATUS_TWO = 2l;
	public static final String CHINA_CODE_CN="CN";
	public static final String EFBM_BMS_STATUS_TWO_STR = "2";
	
	public static final String CHECKBOX_YES_1="1";
	public static final String CHECKBOX_NO_0="0";
	
	/*********************************** 常用状态或标识 **********************************/
 	/**
	 * queryField类型
	 */
	public static final String QUERY_FIELD_TYPE_ARRAY = "Array";
	/**
	 * 费用状态：新增 0
	 */
	public static final String EFBF_STATUS_ADD_0="0";
	/**
	 * 全局token的key accessToken
	 */
	public static final String ACCESSTOKEN_PARAMETER_NAME = "accessToken";
	/**
	 * 服务之间交互-字符集
	 */
	public static final String PRODUCES_CODE = "application/json;charset=utf-8";
	
	/**
 	 * 订单管理————新增
 	 */ 
 	public static final String ORDER_ADD = "ADD";
 	
 	/**
 	 * 化工物流-订单执行存储过程
 	 */
 	public static final String EO_ORDER_ACCEPT_PKG = "pkg_test.SP_SUB_02LO_FREIGHT_COMMON";
 	
 	/**
	 * 订舱 发送方
	 */
	public static final String BOOKING_SENDER = "SJFF";//"EAIOMS";
	
	/**
	 * 编码方式-GBK
	 */
	public static final String ENCODING_GBK = "GBK";
	
	/*************************订舱数据下达 Start*******************************/
	/**
	 * 订舱报文分隔符 ":"
	 * add by Ida.Wang 20160222
	 */
	public static final String WS_BOOKING_FLAG = ":";
	/**
	 * 订舱报文结束符 "'"
	 */
	public static final String WS_BOOKING_ENDFLAG = "'";
	/**
	 * 订舱提单下发报文类型
	 */
	public static final String MESSAGE_TYPE_MBL01 = "MBL01";
	
	/**
	 * 仓储服务，入库操作
	 */
	public static final String SYS_STORAGE_SERVICE_IN_0100="0100";
	/**
	 * 仓储服务，出库操作
	 */
	public static final String SYS_STORAGE_SERVICE_OUT_0200="0200";
	
	/**
	 * 运输服务，短途配送
	 */
	public static final String SYS_TRANS_SERVICE_0100="0100";
	
	/**
	 * *******************************************费用对接bms系统地址 start************************************
	 */
	
	/**
	 * 提交应收结算单
	 */
	public static final String URL_BMS_BILLING_RECEIVABLE = "URL_BMS_BILLING_RECEIVABLE";
	
	/**
	 * 提交应付结算单
	 */
	public static final String URL_BMS_BILLING_PAY = "URL_BMS_BILLING_PAY";
	
	/**
	 * 提交代收结算单
	 */
	public static final String URL_BMS_BILLING_COLLECTION = "URL_BMS_BILLING_COLLECTION";
	
	/**
	 * *******************************************费用对接bms系统地址 end************************************
	 */
	
	/**
	 * 订单状态跟踪控制参数代码
	 */
	public static final String ORDER_STATUS_ADDRESS_INT = "ORDER_STATUS_ADDRESS_INT";
	/**
	 * SO+DO+订单笔次+项目ID不能重复
	 */
	public static final String OMS_ORDER_SODO_CANNOT_REPEAT = "SO DO 订单笔次 项目ID不能重复";
	
	/**
	 * 订单执行的存储过程名称
	 */
	public static final String PROCEDURE_STATE_POOL = "PKG_11_TO_STATEPOOL.SP_SAVE_DPOS_STATEPOOL";
	
	/**
	 * 订舱请求编号规则名称 add by Colley.Bai 20181105
	 */
	public static final String EORB_NO = "BRBOOKING";
	
	/**
	 * 合同流水号 add by Colley.Bai 20181120
	 */
	public static final String EL_CONTRAT = "ELCONTRACT";
	
	/**
	 * 协议号
	 */
	public static final String ELPL_NO = "ELPLNO";
	
	/**
	 * 订舱下达调用的EDI接口的URL
	 */
	public static final String EOBOOKING_REQUEST_EDI_URL = "EOBOOKING_REQUEST_EDI_URL";
	
	/**
	 * 是否华东订舱网
	 */
	public static final String SEND_TO_EDI_BOOKING_EBCU_CODE = "SEND_TO_EDI_BOOKING_EBCU_CODE";
	
	/**
	 * 协议类型：委托协议
	 */
	public static final String ELPL_TYPE_ORDER = "1";
	
	/**
	 * 协议类型：订舱协议
	 */
	public static final String ELPL_TYPE_BOOKING = "2";
	
	/**
	 * 协议类型：报关协议
	 */
	public static final String ELPL_TYPE_DECLARATION = "3";
	
	/**
	 * 协议类型：拖车协议
	 */
	public static final String ELPL_TYPE_TRAILER = "4";
	
	/**
	 * 计算标准：箱
	 */
	public static final String EPCF_FORMULA_BOX = "1";
	
	/**
	 * 计算标准：单
	 */
	public static final String EPCF_FORMULA_SINEGLE = "2";
	
	/**
	 * 计算标准：路线
	 */
	public static final String EPCF_FORMULA_ROULE = "3";
	
	/**
	 * 计算标准：一口价
	 */
	public static final String EPCF_FORMULA_PRICE = "4";
	
	/**
	 * 总部代开票  按照数据类型进行区分 [公司id，]
	 */
	public static final String HEADQUARTERS_INFORMATION = "HEADQUARTERS_INFORMATION";
	
	/**
	 * 总部代开票 - 项目执行计划代码
	 */
	public static final String EB_PROJECT_PLAN_CODE_ZBDKP = "ZBDKP";
	
	/**
	 * 物料特性 - 普货
	 */
	public static final String MATERIAL_ORDINARY_CARGO = "MATERIAL_ORDINARY_CARGO";
	/**
	 * 物料特性 - 一般化工品
	 */
	public static final String MATERIAL_GENERAL_CARGO = "MATERIAL_GENERAL_CARGO";
	/**
	 * 文件服务器访问路径对应控制参数名称
	 */
	public static final String FILE_SERVICE_URL_ZIP = "FILE_SERVICE_URL_ZIP";
	
	/**
	 * 箱尺寸 20寸
	 */
	public static final String BOX_SIZE_TWENTY = "20";
	
	/**
	 * 箱尺寸 40寸
	 */
	public static final String BOX_SIZE_FORTY = "40";
	
	/**
	 * 箱尺寸 45寸
	 */
	public static final String BOX_SIZE_FORTY_FIVE = "45";
	
	/**
	 * 内部状态 订单执行 1
	 */
	public static final Long DPIT_TYPE_IMPLEMENT = 1L;
	
	/**
	 * 内部状态 订舱下达 3
	 */
	public static final Long DPIT_TYPE_BOOKING_ISSUSED = 3L;
	
	/**
	 * 内部状态 订舱完成 4
	 */
	public static final Long DPIT_TYPE_BOOKING_COMPLETE = 4L;
	
	/**
	 * 内部状态 拖车下达 6
	 */
	public static final Long DPIT_TYPE_TRAILER_ISSUSED = 6L;
	
	/**
	 * 内部状态 拖车完成 7
	 */
	public static final Long DPIT_TYPE_TRAILER_COMPLETE = 7L;
	
	/**
	 * 内部状态 报关新建 8
	 */
	public static final Long DPIT_TYPE_DECLARATION_UNISSUSED = 8L;

	/**
	 * 内部状态 报关下达 9
	 */
	public static final Long DPIT_TYPE_DECLARATION_ISSUSED = 9L;
	
	/**
	 * 内部状态 报关完成 10
	 */
	public static final Long DPIT_TYPE_DECLARATION_COMPLETE = 10L;
	/**
	 * 内部状态 费用新建未上传 11
	 */
	public static final Long DPIT_TYPE_EFBF_ADD = 11L;
	
	/**
	 * 内部状态 费用现结上传 12
	 */
	public static final Long DPIT_TYPE_EFBF_SETTLEMENT = 12L;
	
	/**
	 * 内部状态 报关审核完成 13
	 */
	public static final Long DPIT_TYPE_EFBF_EXAMINE = 13L;
	
	/**
	 * 订单预配箱保存
	 */
	public static final String EOSR_ADD = "ADD";
	
	/**
	 * 订单预配箱保存
	 */
	public static final String EOSR_DELETE = "DELETE";
	
	/**
	 *   邮件接收服务器使用协议类型-pop3
	 */
	public static final String MAIL_PROTOCOL_POP3 = "pop3";
	
	/**
	 *   邮件接收服务器使用协议类型-IMAP
	 */
	public static final String MAIL_PROTOCOL_IMAP = "imap";
	
	/**
	 *   邮件接收服务器 - pop3.163.com
	 */
	public static final String MAIL_HOST_POP3 = "pop3.163.com";
	
	/**
	 *   邮件接收服务器 - pop.qiye.163.com(锐特使用)
	 */
	public static final String MAIL_HOST_POP = "pop.qiye.163.com";
	/**
	 * 查验箱
	 */
	public static final String EOFI_C_CHECK = "c";
	/**
	 * 商检箱
	 */
	public static final String EOFI_Q_CHECK = "q";
	/**
	 * EO_FREIGHT_IMPORT表业务标识
	 */
	public static final String EOFI_TYPE = "EOOR";
	
	/**
	 * EO_FREIGHT_IMPORT表业务标识（查验）
	 */
	public static final String EOFI_IS_CHECK = "EOOR";
	/**
	 * EO_FREIGHT_IMPORT表业务标识（查验\eofi_is_check）（缴费\EOFI_IS_PAYMENT）（押箱\EOFI_IS_CONTAINER_DETENTIO）（换单\EOFI_IS_SINGLE）
	 */
	public static final Long EOFI_IS_TYPE = 1L;
	
	/**
	 * 访问post服务失败
	 */
	public static final String HTTP_RESPONSE_STATUS_CODE_404 = "404";
	
	/**
	 * 访问post服务成功
	 */
	public static final String HTTP_RESPONSE_STATUS_CODE_200 = "200";
	
	/**
	 * 版本号
	 */
	public static final Long REC_VER = 0L;
	
	/**
	 * 系统邮件发送地址-数据字典
	 */
	public static final String SYS_MAIL_RECEIVER = "SYS_MAIL_RECEIVER";
	
	/**
	 * 站内跟踪
	 */
	public static final String EO_FREIGHT_TYPE = "TRACK";
	
	/**
	 * 船公司配置
	 */
	public static final String ORG_CRRRIER = "ORG_CRRRIER";
}
