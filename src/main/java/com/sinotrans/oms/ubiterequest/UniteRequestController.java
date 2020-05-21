package com.sinotrans.oms.ubiterequest;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.methods.PostMethod;
import org.apache.commons.httpclient.methods.RequestEntity;
import org.apache.commons.httpclient.methods.StringRequestEntity;
import org.apache.poi.ss.formula.functions.T;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.JsonParser;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jackson.type.TypeReference;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sinotrans.framework.core.util.ContextUtils;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseBodyData;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.base.UniteRequestBody;
import com.sinotrans.oms.common.util.JsonUtils;
import com.sinotrans.oms.eoorder.restcontroller.eoOrderRestController;

import oracle.jdbc.Const;

/**  
* Title: UniteRequestController  
* Description:  
* @author Shoven.Jiang  
* @date 2019年3月2日  
* @version 1.0  
*/
@RestController
@RequestMapping(value = "/UniteRequestController")
public class UniteRequestController {
	
	@RequestMapping(value = "/test1", method = {RequestMethod.POST, RequestMethod.GET}, produces = Constants.PRODUCES_CODE)
	public ResponseData<T> test1(@RequestBody UniteRequestBody uniteRequestBody) {
		String url = uniteRequestBody.getUrl();
		String [] urlArray = url.split("/");
		ResponseData<T> res = null;
		try {
			Class userc = Class.forName("com.sinotrans.oms.eoorder.restcontroller." + urlArray[2]);
			//4.找到方法上的注解
			List<Object> param = new LinkedList<Object>();
            param.add(uniteRequestBody.getData());
			Class<?>[] paramTypes = new Class<?>[1];
			paramTypes[0] = uniteRequestBody.getData().getClass();
			Method me = userc.getMethod("test", paramTypes);
			res = (ResponseData<T>) me.invoke(ContextUtils.getBean("eoOrderRestController"), uniteRequestBody.getData());
			System.out.println(userc.getName());
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("shoven");
		return res;
	}
	
	/**
	 * OMS标准服务接口统一访问接口
	 * @author Shoven.Jiang  
	 * @date 2019年3月4日
	 * @param uniteRequestBody ：实际访问的接口以及入参
	 * @return ResponseBodyData
	 */
	@RequestMapping(value = "/unifiedRequestEntry", method = {RequestMethod.POST, RequestMethod.GET}, produces = Constants.PRODUCES_CODE)
	public ResponseBodyData unifiedRequestEntry(@RequestBody UniteRequestBody uniteRequestBody) {
		ResponseBodyData responseData = new ResponseBodyData();
		String urls = uniteRequestBody.getUrl();
		String [] urlArray = urls.split("/");
		if (urlArray.length < 4) {
			responseData.setCode(Constants.NO);
			responseData.setData(uniteRequestBody);
			responseData.setMsg("请求路径不正确，请重试！");
			return responseData;
		}
		
		HttpClient client = new HttpClient();
		String url = "http://172.30.254.102:5804/" + urlArray[1] + "/" + urlArray[2] + "/" + urlArray[3] + "";
		PostMethod method = new PostMethod(url);
		method.setRequestHeader("Content-type","application/json;charset=utf-8");
		LinkedHashMap linkedHashMap = (LinkedHashMap) uniteRequestBody.getData();
		JsonUtils jsonUtils = new JsonUtils();
		String jsonmap = jsonUtils.map2Json(linkedHashMap);
		try {
			method.setRequestEntity(new StringRequestEntity(jsonmap,"","UTF-8"));
			client.executeMethod(method);
			if (Constants.HTTP_RESPONSE_STATUS_CODE_404.equals(String.valueOf(method.getStatusCode()))) {
				responseData.setCode(Constants.NO);
				responseData.setMsg("请求路径不正确，请重试！");
				responseData.setData(uniteRequestBody);
				return responseData;
			} else if (Constants.HTTP_RESPONSE_STATUS_CODE_200.equals(String.valueOf(method.getStatusCode()))) {
				ResponseBodyData responseBodyData = jsonUtils.json2Bean(method.getResponseBodyAsString(), ResponseBodyData.class);
				return responseBodyData;
			} else {
				responseData.setCode(Constants.NO);
				responseData.setMsg("接口访问失败，失败信息如下：" + method.getResponseBodyAsString());
				responseData.setData(uniteRequestBody);
				return responseData;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}  
		return null;
	}

}
