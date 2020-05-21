package com.sinotrans.oms.common.service.impl;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.sinotrans.framework.core.aop.BaseAspect;
import com.sinotrans.oms.businessrule.manager.EsControlParamManager;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.service.EdiByHttpPostService;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.datainteraction.service.EaiMessageFileService;
import com.sinotrans.oms.datainteraction.service.EaiOutExceptionService;

@Service
public class EdiByHttpPostServiceImpl  extends BaseAspect implements EdiByHttpPostService {

	@Autowired
	private EsControlParamManager esControlParamManager;
	@Autowired
	private EaiOutExceptionService eaiOutExceptionService;
	@Autowired
	private EaiMessageFileService eaiMessageFileService;
	
	
	
	@Override
	@SuppressWarnings("rawtypes")
	public Map sendEDIByHttpPost(String sender, String receiver, String messageType, String fileNM, String txtString,String esusEscoId,Long eorbId)
			throws Exception {
		HttpClient client = new HttpClient();
		String serviceUrl = "";
		Map<String, Object> map = this.esControlParamManager.getControlParamValues(Constants.EOBOOKING_REQUEST_EDI_URL);
		if (null != map) {
            if (null != map.get(Constants.EOBOOKING_REQUEST_EDI_URL)) {
                serviceUrl = map.get(Constants.EOBOOKING_REQUEST_EDI_URL).toString();
            }
        }
		if (EmptyUtils.isNotEmpty(serviceUrl)) {
			PostMethod postMethod = new PostMethod(serviceUrl);
			postMethod.setRequestHeader("Content-Type","application/x-www-form-urlencoded;charset=gbk");
			String fileStr = txtString;
			NameValuePair[] param = { new NameValuePair("sender","EAIOMS"),
					new NameValuePair("receiver","WFS"),
					new NameValuePair("messageType","BK"),
					new NameValuePair("fileNM",fileNM),
					new NameValuePair("fileStr",fileStr),
					new NameValuePair("isZip",Constants.NO),
					new NameValuePair("isStream",Constants.NO),
					new NameValuePair("isBase64",Constants.NO),
					new NameValuePair("encoding",Constants.ENCODING),
					new NameValuePair("subStr1",""),
					new NameValuePair("subStr2",""),
					new NameValuePair("subStr3","")
			} ;
			postMethod.setRequestBody(param);
			client.executeMethod(postMethod);
			log.info("订舱下达调用的EDI最新的接口" + "http:(" + postMethod.getStatusCode() + ") " + postMethod.getURI() + "fileName:" + fileNM);
			String resultJson = postMethod.getResponseBodyAsString();
			Gson gson = new Gson();
			Map responseMap = gson.fromJson(resultJson, Map.class);
			
			Map MEAPHEAD = (Map) responseMap.get("MEAPHEAD");
			//获取EDI返回的flag信息
			String flag = (String) MEAPHEAD.get("FLAG");
			if (Constants.EDI_FLAG_ZORE.equals(flag)) {
				String excptionMessage = (String) MEAPHEAD.get("ERRMSG");//异常信息
				eaiOutExceptionService.receiverInExcption(fileStr.getBytes(), excptionMessage, esusEscoId, "", fileNM, Constants.NO, null, "BK", "WFS", Constants.NO, "EAIOMS", flag, eorbId.toString());
			} else {
				eaiMessageFileService.saveInInfo(flag, new Date(), "", null, "", "EAIOMS", "WFS", flag, fileNM, fileStr, Constants.NO, Constants.NO, Constants.ENCODING, "", "", eorbId.toString());
			}
			return responseMap;
		} else {
			Map<Object, Object> resultMap = new HashMap<Object, Object>();
			resultMap.put("OPERATING_MARK", 0);
			resultMap.put("RESULTS", "未获取调用地址，请联系管理员!");
			return resultMap;
		}
	}
	
}
