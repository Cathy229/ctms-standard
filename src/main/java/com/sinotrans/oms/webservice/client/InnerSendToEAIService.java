package com.sinotrans.oms.webservice.client;

import java.net.MalformedURLException;

import javax.jws.WebMethod;

import com.sinotrans.oms.common.base.ResponseData;

/**  
* <p>Title: InnerSendToEAIService</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月15日  
* @version 1.0  
*/
public interface InnerSendToEAIService {

	/**
	 * 
	 * Description : 根据报文异常主键，查询该异常的修复文件，并发送报文
	 * @param id 报文异常主键
	 * @author abdul.wu
	 * CreateTime 20120312
	 */
	public ResponseData srv_resendToEAI(Long id);
	/**
	 * 
	 * 方法说明: 陆运BR信息的查询、组装、发送
	 * 执行逻辑: 
	 * @param edroId 页面下达时，传输固定ID，定时器时，传NULL或是“”
	 */
	public void sendRoadBRToEAI(String edroId);
	/**
	 * 
	 * Description : 内部处理的异常修复下发接口
	 * @param sender 发送方系统名称
	 * @param receiver 接收方系统名称
	 * @param messageType 数据类型：STATUSBACK-状态反馈；
                                  URGENTSEND-紧急任务下发
	 * @param FileNM 报文文件名
	 * @param FileStr 报文内容
	 * @param isZip 是否压缩：Y-是；N-否
	 * @param isBase64 是否Base64格式化：Y-是；N-否
	 * @param encoding 报文字符集
	 * @param subStr1 备注1
	 * @param subStr2 备注2
	 * @param subStr3 备注3
	 * @param callType 调用方式，内部调用为"OMS_INNER"
	 * @return
	 * @author abdul.wu
	 * CreateTime 20120305
	 */
	public ResponseData srv_innerToReceiver(String sender, String receiver,
			String messageType, String FileNM, String FileStr, String isZip,
			String isBase64, String encoding,String subStr1, String subStr2, String subStr3,String callType);
	/**
	 * 
	 * Description : 发送化工物流BR正常单接口
	 * @param edrcId 页面下达时，传输固定ID，定时器时，传NULL或是“”
	 * @author abdul.wu
	 * CreateTime 20121119
	 */
	public void sendSchemicalBRToEAI(String edrcId);
	/**
	 * 
	 * Description : 发送化工罐箱BR正常单接口
	 * @param edrcId 页面下达时，传输固定ID，定时器时，传NULL或是“”
	 * @author daniel.chen
	 * CreateTime 20130703
	 */
	public void sendSchemicalContainerBRToEAI(String edcrId);
	/**
	 * 发送海运BR到正常单接口
	 * @param edseId
	 */
	public void sendSeaborneBRToEAI(String edseId);
	/**
	 * 
	 * Description : 发送出口拖车BR正常单接口
	 * @param edetId 页面下达时，传输固定ID，定时器时，传NULL或是“”
	 * @author abdul.wu
	 * CreateTime 20121126
	 */
	public void sendExporttrailerBRToEAI(String edetId);
	/**
	 * 
	 * Description : EAI异常处理时调用的接口
	 * @param sender
	 * @param receiver
	 * @param messageType
	 * @param FileNM
	 * @param FileStr
	 * @param isZip
	 * @param isBase64
	 * @param encoding
	 * @param subStr1
	 * @param subStr2
	 * @param subStr3
	 * @param ediId 接口表主键
	 * @return
	 * @author abdul.wu
	 * CreateTime 20121128
	 */
	public ResponseData srv_innerToReceiverOrEAI(String sender, String receiver,
			String messageType, String FileNM, String FileStr, String isZip,
			String isBase64, String encoding,String subStr1, String subStr2, String subStr3,String ediId);
	
	/**
	 * 海运状态反馈及紧急单定时接收，从接口表扫描数据，报文内容为空
	 * @param sender 发送方 HY3
	 * @param receiver 接收方 EAIOMS
	 * @param messageType 报文类型 OFFE03
	 *  @param FileStr 报文内容 为null
	 * @throws MalformedURLException
	 */
	public void seaborneReceiver(String sender, String receiver,
			String messageType,String FileStr);
	
	/**
	 * 化工状态反馈定时接收，从接口表扫描数据，报文内容为空
	 * @param sender 发送方 EAICTMS
	 * @param receiver 接收方 EAIOMS
	 * @param messageType 报文类型 CMRT02
	 *  @param FileStr 报文内容 为null
	 * @throws MalformedURLException
	 */
	public void chemicalStatusbackReceiver(String sender, String receiver,
			String messageType,String FileStr);
	
	/**
	 * 化工紧急单定时接收，从接口表扫描数据，报文内容为空
	 * @param sender 发送方 EAICTMS
	 * @param receiver 接收方 EAIOMS
	 * @param messageType 报文类型 CMRT03
	 *  @param FileStr 报文内容 为null
	 * @throws MalformedURLException
	 */
	public void chemicalUrgentsendReceiver(String sender, String receiver,
			String messageType,String FileStr);
	
	/**
	 * 化工罐箱紧急单定时接收，从接口表扫描数据，报文内容为空
	 * @param sender 发送方 EAICTMS
	 * @param receiver 接收方 EAIOMS
	 * @param messageType 报文类型 TCBU03
	 *  @param FileStr 报文内容 为null
	 * @throws MalformedURLException
	 */
	public void containerUrgentsendReceiver(String sender, String receiver,
			String messageType,String FileStr);
	
	/**
	 * 化工罐箱状态反馈定时接收，从接口表扫描数据，报文内容为空
	 * @param sender 发送方 EAICTMS
	 * @param receiver 接收方 EAIOMS
	 * @param messageType 报文类型 TCBU02
	 *  @param FileStr 报文内容 为null
	 * @throws MalformedURLException
	 */
	public void containerStatusbackReceiver(String sender, String receiver,
			String messageType,String FileStr);
	
	/**
	 * 出口拖车状态反馈定时接收，从接口表扫描数据，报文内容为空
	 * @param sender 发送方 EAICTMS
	 * @param receiver 接收方 EAIOMS
	 * @param messageType 报文类型 EXCT02
	 *  @param FileStr 报文内容 为null
	 * @throws MalformedURLException
	 */
	public void exporttrailerStatusbackReceiver(String sender, String receiver,
			String messageType,String FileStr);
	
	/**
	 * 出口拖车紧急单定时接收，从接口表扫描数据，报文内容为空
	 * @param sender 发送方 EAICTMS
	 * @param receiver 接收方 EAIOMS
	 * @param messageType 报文类型 EXCT03
	 *  @param FileStr 报文内容 为null
	 * @throws MalformedURLException
	 */
	public void exporttrailerUrgentsendReceiver(String sender, String receiver,
			String messageType,String FileStr);
	
	/**
	 * 费用上传BMS，调用WS接口
	 * @param eoorIds
	 * @param efbfIds
	 */
	public void sendFeesBMSToEAI(Long[] eoorIds,Long[] efbfIds,Long userId);
	
	/**
	 * 费用上传BMS，调用WS接口
	 * @param eiimId
	 * @param userId
	 */
	public void newSendFeesBMSToEAI(Long eiimId,Long userId);
	/**
	 * 璐圭敤涓婁紶BMS锛岃皟鐢╓S鎺ュ彛
	 * @param eiimId
	 * @param userId
	 */
	@WebMethod
	public void settlementSendFeesBMSToEAI(Long eiimId,Long userId);
	/**
	 * 费用名称上传BMS，调用WS接口
	 * @param ebfhIds
	 * @param userId
	 */
	public void sendFeeHeadBMSToEAI(Long [] ebfhIds,Long userId);
	
	/**
	 * 货主&供应商、物流分供方 上传BMS
	 * @param ebcuIds
	 * @param userId
	 */
	public void sendCustomerBMSToEAI(Long[] ebcuIds,Long userId);
	
	/**
	 * 
	* @Title: sendMileStoneAndEventInfoToEcms 
	* @Description: TODO
	* @param @param eomsIds
	* @param @param eoevIds
	* @return void
	* @throws 
	* @authority daniel
	* createTime: 2014-1-9
	 */
	public void sendMileStoneAndEventInfoToEcms(Long[] eomsIds,Long[] eoevIds);
	
	/**
	 * 陆运状态反馈定时接收，从接口表扫描数据，报文内容为空
	 * @param sender 发送方 EAITMS
	 * @param receiver 接收方 EAIOMS
	 * @param messageType 报文类型 TKRT02
	 *  @param FileStr 报文内容 为null
	 * @throws MalformedURLException
	 * add by edward 20140814
	 */
	public void roadStatusbackReceiver(String sender, String receiver,
			String messageType,String FileStr);
	
	/**
	 * 陆运紧急单定时接收，从接口表扫描数据，报文内容为空
	 * @param sender 发送方 EAITMS
	 * @param receiver 接收方 EAIOMS
	 * @param messageType 报文类型 TKRT03
	 *  @param FileStr 报文内容 为null
	 * @throws MalformedURLException
     * add by edward 20140814
	 */
	public void roadUrgentsendReceiver(String sender, String receiver,
			String messageType,String FileStr);

	
	/**
	 * 
	 * 方法说明: 委托报关
	 * 执行逻辑: 
	 * @param edroId 页面下达时，传输固定ID，定时器时，传NULL或是“”
	 */
	public void sendDeclarationDeputeBRToEAI(String edddId);


	/**
	 * 委托报关运抵单定时接收，从接口表扫描数据，报文内容为空
	 * @param sender 发送方 EAITMS
	 * @param receiver 接收方 EAIOMS
	 * @param messageType 报文类型 TKRT03
	 *  @param FileStr 报文内容 为null
	 * @throws MalformedURLException
     * add by edward 20140814
	 */
	public void declarationDeputeAdssendReceiver(String sender, String receiver,
			String messageType,String FileStr);
	/**
	 * 委托报关报关单定时接收，从接口表扫描数据，报文内容为空
	 * @param sender 发送方 EAITMS
	 * @param receiver 接收方 EAIOMS
	 * @param messageType 报文类型 TKRT03
	 *  @param FileStr 报文内容 为null
	 * @throws MalformedURLException
     * add by edward 20140814
	 */
	public void declarationDeputeEntrysendReceiver(String sender, String receiver,
			String messageType,String FileStr);

	/**
	 * 状态池下发
	 * @param id
	 */
	public void sendDpOutStatusToEAI(Long id);
	
	/**
	 *  INTTRA状态订阅接口接收
	 */			
	public void sendDpInttraRequestToEAI(Long id);
	
	/***
	 * 入库请求下发
	 * add by ricky 20150512
	 */
	public void sendStockinBrToEAI(String edsiId);
	
	/***
	 * 出库请求下发
	 * add by ricky 20150512
	 */
	public void sendStockoutBrToEAI(String edsoId);
	
	/**
	 * 订舱请求下发
	 * @param edboId
	 * add by Ida.Wang 20160222
	 */
	public void sendBookingBrToEAI(String edboId);
}
