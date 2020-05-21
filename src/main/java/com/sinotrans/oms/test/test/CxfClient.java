package com.sinotrans.oms.test.test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedList;
import java.util.List;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.webservice.client.InnerSendToEAIService;


/**  
* <p>Title: CxfClient</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月19日  
* @version 1.0  
*/
public class CxfClient {
    public static void main(String[] args) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
    	cl1();
    }
    /**
     * 方式1.代理类工厂的方式,需要拿到对方的接口
     */
    public static void cl1() {
        try {
            // 接口地址
            String address = "http://10.231.137.127:8088/OMS_WS_TEST/services";
            // 代理工厂
//            JaxWsProxyFactoryBean jaxWsProxyFactoryBean = new JaxWsProxyFactoryBean();
//            // 设置代理地址
//            jaxWsProxyFactoryBean.setAddress(address);
//            // 设置接口类型
//            jaxWsProxyFactoryBean.setServiceClass(InnerSendToEAIService.class);
//            // 创建一个代理接口实现
//            InnerSendToEAIService cs =  jaxWsProxyFactoryBean.create(InnerSendToEAIService.class);
            // 数据准备
            Long eiimId = 5687750L;
            Long userId = 5027001L;
            List<Object> param = new LinkedList<Object>();
            param.add(eiimId);
            param.add(userId);
            commonInvokeWebservice(address, "settlementSendFeesBMSToEAI", param.toArray(new Object[param.size()]));
//            // 调用代理接口的方法调用并返回结果
////            cs.settlementSendFeesBMSToEAI(eiimId, userId);
//           // 反射调用方法调用代理接口的方法调用并返回结果
//            Object[] param = new Object[2];
//        	param[0] = 100L;
//        	param[1] = 200L;
//			Class<?>[] paramTypes = new Class<?>[param.length];
//			for (int i = 0; i < param.length; i++) {
//				paramTypes[i] = param[i].getClass();
//			}
//			Method me = cs.getClass().getMethod("settlementSendFeesBMSToEAI", paramTypes);
//			me.invoke(cs, param);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static ResponseData<Object> commonInvokeWebservice(String urlType, String serviceName, Object... param) {
		ResponseData<Object> msg = new ResponseData<Object>();
		// 从系统参数表中获取配置的webservice地址
		StringBuffer serviceUrl = new StringBuffer(urlType);
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
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return msg;
	}
}
