package com.sinotrans.oms.common.service;

import java.io.InputStream;
import java.util.Map;

import org.apache.http.HttpResponse;

import com.sinotrans.framework.service.mybatis.base.MybatisManager;

/**
 * 调用EDI服务接口
 * @author Harley add by 20170731
 *
 */
public interface InvokHttpClientService extends MybatisManager{

	/**
	 * 调用EDI服务
	 */
	public void callEDIBackServer(String flag, String batchNumber);
	
	/**
	 * @date 2018年8月23日 下午2:40:56  
	 * @author simon 
	 * Description:GET
	 * @param url
	 * @param flag
	 */
	public HttpResponse executeHttpGet(String url ,Map<String,String> map, String flag);
	/**
	 * @deprecated:请求接收数据
	 * @author Colley.Bai  
	 * @date 2018年9月18日
	 * @param strURL
	 * @param params
	 * @return
	 */
	public String executeHttpPost(String strURL, String params);
	
}
