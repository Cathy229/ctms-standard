package com.sinotrans.oms.datainteraction.service.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.datainteraction.manager.EaiMessageFileManager;
import com.sinotrans.oms.datainteraction.model.EaiMessageFileModel;
import com.sinotrans.oms.datainteraction.service.EaiMessageFileService;

@Service
public class EaiMessageFileServiceImpl implements EaiMessageFileService {

	@Autowired
	private EaiMessageFileManager eaiMessageFileManager;
	
	@Override
	public void saveInInfo(String eaifType, Date eaifETime, String eaifSysCode, Long eaifEbbuId, String eaifSendMethod,
			String eaifSender, String eaifReceiver, String eaifMessageType, String eaifFileName, String FileStr,
			String isZip, String isBase64, String encoding, String subStr1, String subStr2, String subStr3) {
		
		EaiMessageFileModel eaiMessageFileModel = new EaiMessageFileModel();
		
		eaiMessageFileModel.setEaifType(eaifType);
		eaiMessageFileModel.setEaifETime(eaifETime);
		eaiMessageFileModel.setEaifSysCode(eaifSysCode);
		eaiMessageFileModel.setEaifEbbuId(eaifEbbuId);
		eaiMessageFileModel.setEaifSendMethod(eaifSendMethod);
		eaiMessageFileModel.setEaifSender(eaifSender);
		eaiMessageFileModel.setEaifReceiver(eaifReceiver);
		eaiMessageFileModel.setEaifMessageType(eaifMessageType);
		eaiMessageFileModel.setEaifFileName(eaifFileName);
		eaiMessageFileModel.setEaifIsZip(isZip);
		eaiMessageFileModel.setEaifIsBase64(isBase64);
		eaiMessageFileModel.setEaifEncoding(encoding);
		
		if(EmptyUtils.isNotEmpty(FileStr)){
			eaiMessageFileModel.setEaifContent(FileStr.getBytes());	
		}
		
		eaiMessageFileModel.setEaifSubstr1(subStr1);
		eaiMessageFileModel.setEaifSubstr2(subStr2);
		eaiMessageFileModel.setEaifSubstr3(subStr3);//订舱id
		eaiMessageFileManager.save(eaiMessageFileModel);
	}

}
