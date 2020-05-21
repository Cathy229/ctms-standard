package com.sinotrans.oms.test.remoteInterface;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.sinotrans.oms.test.remoteInterface.HelloControllerRemote.DemoFeignFallback;

/**
 * 化工定制服务：相当于调用另一台服务的方法
 * 用来绑定服务端的服务，从而调用
 * 通过@FeignClient注解来指定服务名进而绑定服务，然后再通过SpringMVC中提供的注解来绑定服务提供者提供的接口
 * fallback是服务降级后的接口实现类。
 * @author Harley
 *
 * 命名方式为被调用端的controller接口名字+Remote
 */
@FeignClient(name = "standard-server", fallback = DemoFeignFallback.class)
public interface HelloControllerRemote {

	// OMS标准服务的保存接口 访问路径参数，类型返回值必须和被调用端的HelloController的 saveOrder方法一模一样
	@RequestMapping(value = "order/saveOrder/{param}")
	public String saveOrder(@PathVariable(value = "param") String param);
	
	/**
	 * 断路处理
	 * @author Harley
	 *
	 */
	@Component  
	class DemoFeignFallback implements HelloControllerRemote{  

		@Override
		public String saveOrder(String param) {
			return "挂掉的服务";
		}
	}
}
