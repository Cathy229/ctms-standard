package com.sinotrans.oms.datainteraction.service;

/**  
* <p>Title: EaiOutExceptionService</p>  
* <p>Description: </p>  
* @author Colley.Bai  
* @date 2018年11月15日  
* @version 1.0  
*/
public interface EaiOutExceptionService {

	/**
	 * 接收报文异常公共方法 
	 * @param eaioContent 原报文数据
	 * @param eaioDescription 异常内容描述
	 * @param eaioEscoId 公司ID
	 * @param eaioFileName 文件名
	 * @param eaioIsBase64 是否64位压缩
	 * @param eaioItemid 接口表主键 (只有异常类型是（2 = 接口表回写失败）才会有值非空)
	 * @param eaioMessageType 报文类型 
	 * @param eaioReceiver 接收方
	 * @param eaioIsZip 是否压缩
	 * @param eaioSender 发送方
	 * @param eaioType 异常类型0 = 无法生成报文 1 = 无法找到EAI 2 = EAI返回失败
	 * 
	 * @author Colley.Bai
	 * @date 2018年11月15日  
	 */
	void receiverInExcption(byte[] eaioContent, String eaioDescription, String eaioEscoId, String eaioEbpjId,
			String eaioFileName, String eaioIsBase64, Long eaioItemid, String eaioMessageType, String eaioReceiver,
			String eaioIsZip, String eaioSender, String eaioType,String subStr3);
}
