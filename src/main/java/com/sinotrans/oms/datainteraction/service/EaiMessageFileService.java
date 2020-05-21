package com.sinotrans.oms.datainteraction.service;

import java.util.Date;

public interface EaiMessageFileService {
	
	/**
	 * 
	 * @author Colley.Bai  
	 * @date 2018年11月15日
	 * @param eaifType 报文类型：0 = 无法生成报文（产生于WS1\WS2中）1 = 无法找到EAI（产生于WS1\WS2中）2 = EAI报文转换异常（产生于EAI中）3 = EAI目标端接口调用异常（产生于EAI中）
	 * @param eaifETime 异常反馈时间
	 * @param eaifSysCode TMS系统物理端定义代码
	 * @param eaifEbbuId 建陆运BR时由对应作业步骤的EB_PLAN_TASK.EBTK_EBBU_ID拷入；TMS系统标识ID 陆运业务请求发送的对方业务系统BU定义ID
	 * @param eaifSendMethod 异常报文发送调用某类业务方法名是OMS端正常下达的方法名
	 * @param eaifSender 异常报文发送方
	 * @param eaifReceiver 异常报文接收方
	 * @param eaifMessageType 异常报文数据类型
	 * @param eaifFileName 异常报文文件名
	 * @param FileStr
	 * @param isZip 异常报文是否压缩
	 * @param isBase64 异常报文是否Base64格式化
	 * @param encoding 异常报文
	 * @param subStr1
	 * @param subStr2
	 * @param subStr3
	 */
	void saveInInfo(String eaifType, Date eaifETime,
			String eaifSysCode,Long eaifEbbuId,String eaifSendMethod,String eaifSender,
			String eaifReceiver,String eaifMessageType, String eaifFileName, 
			String FileStr, String isZip,
			String isBase64, String encoding, String subStr1, String subStr2,
			String subStr3);
}
