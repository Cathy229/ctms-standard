package com.sinotrans.oms.common.cache.redis;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.cache.RedisCacheManager;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;
/**
 * 
 * Title: RedisTemplateCache  
 * Description:  单IP redis 环境配置，建立连接
 * @author shoven.jiang  
 * @date 2018年12月8日  
 * @version 1.0
 */
//@Configuration
//@EnableCaching
public class RedisTemplateConfig /*extends CachingConfigurerSupport*/{

	protected final Log log = LogFactory.getLog(getClass());
	private RedisTemplate<String, String> redisTemplate;
	
//	@Bean
	public CacheManager cacheManager(RedisTemplate redisTemplate) {
		RedisCacheManager rcm = new RedisCacheManager(redisTemplate);
		// 设置缓存过期时间
		// Map<String, Long> expires = new HashMap<>();
		// expires.put("12h",3600 * 12L);
		// expires.put("1h",3600 * 1L);
		// expires.put("10m",60 * 5L);
		// rcm.setExpires(expires);

		// rcm.setDefaultExpiration(10); //秒
		return rcm;
	}

//	@Bean
	public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory connectionFactory) {
		RedisTemplate<String, String> template = new RedisTemplate<>();
		template.setConnectionFactory(connectionFactory);

		// 使用Jackson2JsonRedisSerializer来序列化和反序列化redis的value值
		Jackson2JsonRedisSerializer<Object> serializer = new Jackson2JsonRedisSerializer<Object>(Object.class);

		ObjectMapper mapper = new ObjectMapper();
		mapper.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
		mapper.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
		serializer.setObjectMapper(mapper);

		template.setValueSerializer(serializer);
		// 使用StringRedisSerializer来序列化和反序列化redis的key值
		template.setKeySerializer(new StringRedisSerializer());
		template.afterPropertiesSet();
		redisTemplate = template;
		return template;
	}
	
	public RedisTemplate<String, String> getRedisTemplate() {
		return redisTemplate;
	}
}
