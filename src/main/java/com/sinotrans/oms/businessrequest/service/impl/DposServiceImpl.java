package com.sinotrans.oms.businessrequest.service.impl;

import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Map;

import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.util.EntityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.JSONObject;
import com.sinotrans.oms.businessrequest.service.DposService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.manager.ProcedureManager;
import com.sinotrans.oms.common.util.BASE64;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.common.util.SSLClient;

import oracle.jdbc.Const;

/**  
* Title: DposServiceImpl  
* Description:  状态池订阅服务
* @author Shoven.Jiang  
* @date 2018年12月11日  
* @version 1.0  
*/
@Service
public class DposServiceImpl implements DposService{

	@Autowired
	private ProcedureManager procedureManager;
	@SuppressWarnings("resource")
	@Override 
	public ResponseData<Object> subscribeDposByType(String Url, String charset, String postStr, String keyId, String businessCode) throws Exception {
		ResponseData<Object> responseData = new ResponseData<>();
		if (EmptyUtils.isEmpty(Url) || EmptyUtils.isEmpty(charset) || EmptyUtils.isEmpty(postStr) || EmptyUtils.isEmpty(keyId)) {
			responseData.setMsg("订阅状态池参数缺失，请查看！");
            responseData.setCode(Constants.NO);
            return responseData;
		}
		String flag = "";//用来判断反馈的调用结果
		String errMsg = "";//错误信息
		String result = "";//收集反馈结果
		HttpClient httpClient = new SSLClient();
		HttpPost httpPost = new HttpPost(Url);
		httpPost.setHeader("KeyId",keyId);
		httpPost.setHeader("BusinessCode", businessCode);
		httpPost.setHeader("Content-Type", "application/json");
        httpPost.setEntity(new StringEntity(postStr,Charset.forName(charset)));
//		StringEntity postentity =new StringEntity(postStr);
//      postentity.setContentEncoding(Constants.ENCODING);
//      httpPost.setEntity(postentity);
        HttpResponse response = httpClient.execute(httpPost);
        if (null != response) {
        	HttpEntity resEntity = response.getEntity(); 
            flag = response.getHeaders("Flag")[0].getValue();
            if (Constants.CODE_FALSE.equals(flag)) {
                /** 访问服务端失败*/
                errMsg = response.getHeaders("Errmsg")[0].getValue();
                errMsg = URLDecoder.decode(errMsg, Constants.ENCODING);
                responseData.setMsg(errMsg);
                responseData.setCode(Constants.NO);
                return responseData;
            } else if (Constants.CODE_TRUE.equals(flag)){
                errMsg = response.getHeaders("Errmsg")[0].getValue();
                errMsg = URLDecoder.decode(errMsg, Constants.ENCODING);
                if(null != resEntity){
                   /** 服务端返回的结果报文*/
                   result = EntityUtils.toString(resEntity, "UTF-8");
                }
                responseData.setData(result);
                responseData.setMsg("操作成功");
                responseData.setCode(Constants.YES);
                return responseData;
            }
        } else {
        	 responseData.setMsg("操作失败");
             responseData.setCode(Constants.NO);
             return responseData;
        }
        responseData.setMsg("操作失败");
        responseData.setCode(Constants.NO);
        return responseData;
	}

	@Override
	public ResponseData<String> issuedStautsPoolService(Long [] brids, String type, Long ebtkId) {
		ResponseData<String> responseData = new ResponseData<>();
		String errm = "";//状态池下发错误信息
		if (EmptyUtils.isEmpty(type)) {//如果类型为空则执行
			for (int i = 0; i < brids.length; i++) {
				String excuteErrm = this.procedureManager.eoorderToDposByExecuteCode(brids[i].toString(), Constants.PROCEDURE_STATE_POOL);
				if (EmptyUtils.isNotEmpty(excuteErrm)) {
					errm = errm + "订单id：" + brids[i] + "状态池下发失败" + excuteErrm + "\n";
				}
			}
			if (EmptyUtils.isNotEmpty(errm)) {
				responseData.setMsg(errm);
				responseData.setCode(Constants.NO);
			} else {
				responseData.setMsg("下发状态池成功！");
				responseData.setCode(Constants.YES);
			}
			return responseData;
		} else {
			for (int i = 0; i < brids.length; i++) {
				String excuteErrm = this.procedureManager.invokeAfterSaveBrEvent(ebtkId, type, brids[i]);
				if (EmptyUtils.isNotEmpty(excuteErrm)) {
					errm = errm + "任务id：" + brids[i] + "状态池下发失败" + excuteErrm + "\n";
				}
			}
			if (EmptyUtils.isNotEmpty(errm)) {
				responseData.setMsg(errm);
				responseData.setCode(Constants.NO);
			} else {
				responseData.setMsg("下发状态池成功！");
				responseData.setCode(Constants.YES);
			}
			return responseData;
		}
	}

}
