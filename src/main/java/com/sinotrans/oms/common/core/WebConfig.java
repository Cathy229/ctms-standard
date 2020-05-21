package com.sinotrans.oms.common.core;

import java.text.DateFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.sinotrans.oms.common.core.support.CustomDateFormat;

/**
 * @author Harley 20180813 服务端统一的对MVC配置
 * Fegin调用时，不会触发此配置
 */
@Configuration
public class WebConfig {
	
	@Autowired
	private Jackson2ObjectMapperBuilder jackson2ObjectMapperBuilder;

	/**
	 * 统一处理与web、server交互的时间格式
	 * @return MappingJackson2HttpMessageConverter
	 */
	@Bean
	public MappingJackson2HttpMessageConverter MappingJsonpHttpMessageConverter() {
		ObjectMapper mapper = jackson2ObjectMapperBuilder.build();
		/*
		 * ObjectMapper为了保障线程安全性，里面的配置类都是一个不可变的对象
		 * 所以这里的setDateFormat的内部原理其实是创建了一个新的配置类
		 */
		DateFormat dateFormat = mapper.getDateFormat();
		mapper.setDateFormat(new CustomDateFormat(dateFormat));
		MappingJackson2HttpMessageConverter mappingJsonpHttpMessageConverter = new MappingJackson2HttpMessageConverter(
				mapper);
		return mappingJsonpHttpMessageConverter;
	}
}
