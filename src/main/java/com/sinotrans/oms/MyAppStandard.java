package com.sinotrans.oms;



import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.scheduling.annotation.EnableScheduling;

import com.sinotrans.boot.core.BaseApplication;

@EnableDiscoveryClient
@EnableFeignClients
@EnableScheduling
public class MyAppStandard extends BaseApplication {
	
	public static void main(String[] args) {
		runapp(args,MyAppStandard.class);
	}
}
