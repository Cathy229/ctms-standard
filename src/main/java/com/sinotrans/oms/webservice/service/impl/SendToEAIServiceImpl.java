package com.sinotrans.oms.webservice.service.impl;

import java.lang.reflect.Method;
import java.util.Map;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.businessrule.manager.EsControlParamManager;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.service.impl.BaseServiceImpl;
import com.sinotrans.oms.webservice.client.InnerSendToEAIService;
import com.sinotrans.oms.webservice.service.SendToEAIServices;

/**  
* <p>Title: SendToEAIServiceImpl</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月15日  
* @version 1.0  
*/
@Service
public class SendToEAIServiceImpl extends BaseServiceImpl implements SendToEAIServices{

	@Autowired
	private EsControlParamManager esControlParamManager;
	/**
	 * harley 20180920 调用ws服务的统一方法,固定访问InnerSendToEAIService中的方法
	 * @param urlType 数据库配置的url类型  如： Constants.WEBSERVICES_REDIRECT
	 * @param serviceName 需要调用的方法名 如：settlementSendFeesBMSToEAI
	 * @param param 需要调用方法的参数 如：[eiimId,userId]
	 */
	public ResponseData<Object> commonInvokeWebservice(String urlType, String serviceName, Object... param) {
		ResponseData<Object> msg = new ResponseData<Object>();
		// 从系统参数表中获取配置的webservice地址
		StringBuffer serviceUrl = new StringBuffer();
		Map<String, Object> map = this.esControlParamManager.getControlParamValues(urlType);
		if (null != map) {
			if (null != map.get(urlType)) {
				serviceUrl.append(map.get(urlType).toString());
			}
		}
//		serviceUrl.append("http://10.231.137.127:8081/OMS_WS_TEST/services");
		serviceUrl.append("/InnerSendToEAIService");
		if (!"".equals(serviceUrl.toString())) {// 连接地址不为空及空字符串时才进行接口连接
			try {
				// 代理工厂
				JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
				// 设置代理地址
				jaxWsProxyFactoryBean.setAddress(serviceUrl.toString());
				// 设置接口类型
				jaxWsProxyFactoryBean.setServiceClass(InnerSendToEAIService.class);
				// 创建一个代理接口实现
				InnerSendToEAIService innerSendToEAIService = jaxWsProxyFactoryBean.create(InnerSendToEAIService.class);
				// 调用代理接口的方法调用并返回结果
				Class<?>[] paramTypes = new Class<?>[param.length];
				for (int i = 0; i < param.length; i++) {
					paramTypes[i] = param[i].getClass();
				}
				Method me = innerSendToEAIService.getClass().getMethod(serviceName, paramTypes);
				Object response = me.invoke(innerSendToEAIService, param);
				msg.setData(response);
				log.info("调用ws的response:" + response);
			} catch (Exception e) {
				e.printStackTrace();
				log.error("调用ws失败", e);
			}
		}
		return msg;
	}

}
