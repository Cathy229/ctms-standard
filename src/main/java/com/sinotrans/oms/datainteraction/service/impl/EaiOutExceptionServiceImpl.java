package com.sinotrans.oms.datainteraction.service.impl;

import java.util.Date;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.datainteraction.manager.EaiOutExceptionManager;
import com.sinotrans.oms.datainteraction.model.EaiOutExceptionModel;
import com.sinotrans.oms.datainteraction.service.EaiOutExceptionService;
import com.sinotrans.oms.security.util.UserDetails;

@Service
public class EaiOutExceptionServiceImpl implements EaiOutExceptionService {

	@Autowired
	private EaiOutExceptionManager eaiOutExceptionManager;
	
	/**
	 * 接收报文异常公共方法 
	 * @param eaioContent 原报文数据
	 * @param eaioDescription 异常内容描述
	 * @param eaioEscoId 公司ID
	 * @param eaioFileName 文件名
	 * @param eaioIsBase64 是否64位压缩
	 * @param eaioItemid 接口表主键
	 * @param eaioMessageType 报文类型 
	 * @param eaioReceiver 接收方
	 * @param eaioIsZip 是否压缩
	 * @param eaioSender 发送方
	 * @param eaioType 异常类型0 = 无法生成报文 1 = 无法找到EAI 2 = EAI返回失败
	 */
	@Override
	public void receiverInExcption(byte[] eaioContent, String eaioDescription, String eaioEscoId, String eaioEbpjId,
			String eaioFileName, String eaioIsBase64, Long eaioItemid, String eaioMessageType, String eaioReceiver,
			String eaioIsZip, String eaioSender, String eaioType,String subStr3) {
		
		EaiOutExceptionModel eaiOutExceptionModel = new EaiOutExceptionModel();
		eaiOutExceptionModel.setEaioContent(eaioContent);//报文内容
		eaiOutExceptionModel.setEaioDescription(eaioDescription);//异常内容描述
		eaiOutExceptionModel.setEaioEscoId(eaioEscoId);//公司表主键
		eaiOutExceptionModel.setEaioEbpjId(eaioEbpjId);//项目表主键
		eaiOutExceptionModel.setEaioETime(new Date());//异常反馈时间
		eaiOutExceptionModel.setEaioFileName(eaioFileName);//异常报文文件名
		eaiOutExceptionModel.setEaioIsResend(Constants.NO);//异常修复报文是否已重发
		eaiOutExceptionModel.setEaioItemid(eaioItemid);//接口表Id
		eaiOutExceptionModel.setEaioMessageType(eaioMessageType);//异常报文数据类型
		eaiOutExceptionModel.setEaioReceiver(eaioReceiver);//异常报文接收方
		eaiOutExceptionModel.setEaioSender(eaioSender);//异常报文发送方
		eaiOutExceptionModel.setEaioType(eaioType);//0 = 无法生成报文 1 = 无法找到EAI 2 = EAI返回失败
		eaiOutExceptionModel.setEaioEncoding(Constants.ENCODING); //20181115 增加异常的编码格式
		eaiOutExceptionModel.setEaioIsBase64(Constants.NO);//赋值为不是64位，20181115
		eaiOutExceptionModel.setEaioIsZip(Constants.NO);//赋值为不是压缩 20181115
		eaiOutExceptionModel.setEaioSubstr3(subStr3);//订舱id
		eaiOutExceptionManager.save(eaiOutExceptionModel);
	}

}
