package com.sinotrans.oms.common.cache.redis;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
/**  
* Title: RedisAutoConfig  
* Description:  
* @author Shoven.Jiang  
* @date 2018年12月5日  
* @version 1.0  
*/
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
import org.springframework.util.CollectionUtils;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * redis 测试工具类
 * Title: RedisTemplateUtil  
 * Description:  
 * @author shenlan  
 * @date 2018年12月8日  
 * @version 1.0
 */
@Configuration
@EnableCaching
public class RedisTemplateUtil extends CachingConfigurerSupport {

	protected final Log log = LogFactory.getLog(getClass());
	@Autowired

	private RedisTemplate<String, String> redisTemplate;
	private final String LOCKVALUE = "LOCK";
	private boolean locked = false;
	private static final int LOCK_TIME_OUT = 60 * 60;// 默认3600s
	private static final int KEY_TIME_OUT = 60 * 60 * 24;// 默认1天

	@Bean
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

	@Bean
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
		return template;
	}

	/**
	 * 释放给外部获取Redis对象，做扩展
	 * 
	 * @author Shoven.Jiang
	 * @date 2018年12月5日
	 * @return
	 */
	public RedisTemplate getRedisTemplate() {
		return redisTemplate;
	}

	/**
	 * 判断key 是否存在
	 * 
	 * @author Shoven.Jiang
	 * @date 2018年12月5日
	 * @param key
	 * @return
	 */
	public Boolean hasKey(String key) {
		return redisTemplate.hasKey(key);
	}

	/**
	 * 存入key 对象含过期时间
	 * 
	 * @author Shoven.Jiang
	 * @date 2018年12月5日
	 * @param key
	 * @param value
	 * @param effectiveTime
	 *            如果传0，默认为一天
	 * @return
	 */
	public void setJSON(String key, Object value, int effectiveTime) {
		redisTemplate.opsForValue().set(key, JSON.toJSONString(value));
		if (0 == effectiveTime) {
			redisTemplate.expire(key, KEY_TIME_OUT, TimeUnit.SECONDS);
		} else {
			redisTemplate.expire(key, effectiveTime, TimeUnit.SECONDS);
		}
	}

	/**
	 * 存入key 对象含过期时间
	 * 
	 * @author Shoven.Jiang
	 * @date 2018年12月5日
	 * @param key
	 * @param value
	 * @param effectiveTime
	 *            如果传0，默认为一天
	 * @return
	 */
	public void set(String key, Object value, int effectiveTime) {
		redisTemplate.opsForValue().set(key, JSON.toJSONString(value));
		if (0 == effectiveTime) {
			redisTemplate.expire(key, KEY_TIME_OUT, TimeUnit.SECONDS);
		} else {
			redisTemplate.expire(key, effectiveTime, TimeUnit.SECONDS);
		}
	}

	/**
	 * 存入Object 对象
	 * 
	 * @author Shoven.Jiang
	 * @date 2018年12月5日
	 * @param key
	 * @param value
	 * @return
	 */
	public void set(String key, Object value) {
		redisTemplate.opsForValue().set(key, JSON.toJSONString(value));
	}

	/**
	 * 通过key取JSON序列化对象值
	 * 
	 * @author Shoven.Jiang
	 * @date 2018年12月5日
	 * @param key
	 * @param clazz
	 * @return
	 */
	public <T> T getJSON(String key, Class<T> clazz) {
		Object obj = redisTemplate.opsForValue().get(key);
		return (T) (null == obj ? null : JSONObject.parseObject(obj.toString(), clazz));
	}

	/**
	 * 通过key取Object化对象值
	 * 
	 * @author Shoven.Jiang
	 * @date 2018年12月5日
	 * @param key
	 * @return
	 */
	public Object get(String key) {
		return redisTemplate.opsForValue().get(key);
	}

	/**
	 * 根据key删除缓存数据
	 * 
	 * @author Shoven.Jiang
	 * @date 2018年12月7日
	 * @param key
	 */
	@SuppressWarnings("unchecked")
	public void delKey(String... key) {
		if (key != null && key.length > 0) {
			if (key.length == 1) {
				redisTemplate.delete(key[0]);
			} else {
				redisTemplate.delete(CollectionUtils.arrayToList(key));
			}
		}
	}

	/**
	 * 通过key模糊查询
	 * 
	 * @author Shoven.Jiang
	 * @date 2018年12月5日
	 * @param pattern
	 */
	public Set<String> keys(String pattern) {
		return redisTemplate.keys(pattern);
	}

	/**
	 * key重命名
	 * 
	 * @author Shoven.Jiang
	 * @date 2018年12月7日
	 * @param oldkey
	 * @param newkey
	 */
	public void keyRename(String oldkey, String newkey) {
		redisTemplate.boundSetOps(oldkey).rename(newkey);
	}

	/**
	 * 使用Jedis的分布式锁，尝试一段时间后，返回结果
	 * 
	 * @author Shoven.Jiang
	 * @date 2018年12月7日
	 * @param lockKey
	 *            锁key
	 * @param timeout
	 *            获取锁超时时间
	 * @return
	 */
	public boolean setnxLock(String lockKey, long timeout) {
		try {
			log.debug("分布式加锁：" + lockKey);
			long nanoTime = System.currentTimeMillis();
			// 在timeout的时间范围内不断轮询锁
			while (System.currentTimeMillis() - nanoTime < timeout) {
				// 锁不存在的话，设置锁并设置锁过期时间，即加锁
				/*
				 * 该方法会在没有key时，设置key;存在key时返回false；因此可以通过该方法及设置key的有效期，
				 * 判断是否有其它线程持有锁
				 */
				Boolean success = redisTemplate.opsForValue().setIfAbsent(lockKey, LOCKVALUE);
				if (success != null && success) {
					redisTemplate.expire(lockKey, 3, TimeUnit.SECONDS);
					locked = true;
					return locked;
				}
				log.info("出现锁等待");
				// 短暂休眠，避免可能的活锁
				Thread.sleep(1000);
			}
		} catch (InterruptedException e) {
			throw new RuntimeException("locking error", e);
		}
		return false;
	}

	/**
	 * 使用Jedis的分布式锁，立即返回结果
	 * 
	 * @author Shoven.Jiang
	 * @date 2018年12月7日
	 * @param lockKey
	 *            锁
	 * @return true & false
	 */
	public boolean setnxLock(String lockKey) {
		/* 该方法会在没有key时，设置key;存在key时返回false；因此可以通过该方法及设置key的有效期，判断是否有其它线程持有锁 */
		Boolean success = redisTemplate.opsForValue().setIfAbsent(lockKey, LOCKVALUE);
		if (success != null && success) {
			redisTemplate.expire(lockKey, 3, TimeUnit.SECONDS);
			locked = true;
		} else {
			locked = false;
		}
		return locked;
	}

}
