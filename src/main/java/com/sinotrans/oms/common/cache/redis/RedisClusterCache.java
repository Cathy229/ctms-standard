package com.sinotrans.oms.common.cache.redis;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.cache.annotation.CachingConfigurerSupport;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.cache.interceptor.KeyGenerator;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.common.util.SerializationUtil;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisCluster;
import redis.clients.jedis.JedisPool;
import redis.clients.util.JedisClusterCRC16;

@Component
@Configuration
@EnableCaching
@ConfigurationProperties(prefix = "redis.pool")//取下面配的路径中前缀的值
@PropertySource("classpath:/properties/redis.properties")// 路径要写对
public class RedisClusterCache /*extends CachingConfigurerSupport*/ {

	protected final Log log = LogFactory.getLog(getClass());
	protected List<String> redisServers;
	protected String redisMasterName;
	protected String redisPassword;
	protected Integer maxRedirections;
	protected Integer soTimeOut;
	protected Integer tiemOut;
	protected Integer maxIdle;
	protected Integer maxTotal;
	protected Long maxWairMillis;
	protected boolean onBorrow;
	protected JedisCluster jedisCluster = null;
	private static final int LOCK_TIME_OUT = 60 * 60;// 默认3600s
	private static final int KEY_TIME_OUT = 60 * 60 * 24;// 默认1天
    private static Map<String, JedisPool> nodeMap;// 集群的各个jedis客户端
    private static TreeMap<Long, String> slotHostMap;// 各个客户端的节点凹槽地址
    // redisCluster 异步处理使用
//    private static ThreadPoolExecutor threadPool = new ThreadPoolExecutor(3, 6,
//			5, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(200),
//			new ThreadPoolExecutor.CallerRunsPolicy());
    
    /**
     * 自定义生成redis-key策略
     * 用于springboot 集成
     */
    /*@Override
    public KeyGenerator keyGenerator() {
        return new KeyGenerator() {
            @Override
            public Object generate(Object o, Method method, Object... objects) {
                StringBuilder sb = new StringBuilder();
                sb.append(o.getClass().getName()).append(".");
                sb.append(method.getName()).append(".");
                for (Object obj : objects) {
                    sb.append(obj.toString());
                }
                log.info("keyGenerator = " + sb.toString());
                return sb.toString();
            }
        };
    }*/
    
    /**
     * 定义springboot集成redis 模板
     * 用于springboot 集成
     */
//	@SuppressWarnings({ "rawtypes", "unchecked" })
//	@Bean(name="redisTemplate")
//    public RedisTemplate<String, String> redisTemplate(RedisConnectionFactory factory) {
//		// 1.定义集群节点
//		RedisClusterConfiguration clusterConfig = new RedisClusterConfiguration();
//		for (int i = 1; i < redisServers.size(); i++) {
//			clusterConfig.clusterNode(redisServers.get(i).split(":")[0], Integer.parseInt(redisServers.get(i).split(":")[1]));
//		}
//		// 2.创建连接工厂
//		JedisConnectionFactory factory2 = new JedisConnectionFactory(clusterConfig);
//		// 3.定义主节点
//		factory2.setHostName(redisServers.get(0).split(":")[0]);
//		factory2.setPort(Integer.parseInt(redisServers.get(0).split(":")[1]));
//		factory2.setTimeout(tiemOut);
//		// 4.手工调用一下初始换方法（自定义创建时很重要，需要手动初始化集群，不然拿不到集群连接）
//		factory2.afterPropertiesSet();
//		// 5.定义redis模板和序列化规则
//        RedisTemplate<String, String> template = new RedisTemplate<>();
//        RedisSerializer<String> redisSerializer = new StringRedisSerializer();
//        Jackson2JsonRedisSerializer jackson2JsonRedisSerializer = new Jackson2JsonRedisSerializer(Object.class);
//        ObjectMapper om = new ObjectMapper();
////        om.setVisibility(PropertyAccessor.ALL, JsonAutoDetect.Visibility.ANY);
//        om.enableDefaultTyping(ObjectMapper.DefaultTyping.NON_FINAL);
//        jackson2JsonRedisSerializer.setObjectMapper(om);
//        template.setConnectionFactory(factory2);
//        //key序列化方式
//        template.setKeySerializer(redisSerializer);
//        //value序列化
//        template.setValueSerializer(jackson2JsonRedisSerializer);
//        //value hashmap序列化
//        template.setHashValueSerializer(jackson2JsonRedisSerializer);
//        return template;
//    }
	/**
     * 定义springboot集成redis 模板
     * 用于springboot 集成
     */
//	@SuppressWarnings("rawtypes")
//	@Bean
//	public CacheManager cacheManager(RedisTemplate redisTemplate) {
//		RedisCacheManager cacheManager = new RedisCacheManager(redisTemplate);
//		cacheManager.setDefaultExpiration(60 * 60);//设置缓存保留时间（seconds）
//		log.info("SpringBoot Init RedisTemplate Success.");
//		return cacheManager;
//	}

	/**
	 * 这个方法是集成spring，不受springboot 的cache管理
	 * 初始化集群 使用bean注入Spring 让 Spring调用这个方法Init
	 */
	@Bean
	public JedisCluster initRedisCluster() {
		Set<HostAndPort> nodes = new HashSet<HostAndPort>();
		for (String ipPort : redisServers) {
			String[] ipPortPair = ipPort.split(":");
			nodes.add(new HostAndPort(ipPortPair[0].trim(), Integer.valueOf(ipPortPair[1].trim())));
		}
		jedisCluster = new JedisCluster(nodes, tiemOut, soTimeOut, maxRedirections, getGenericObjectPoolConfig());
		initSlotHostMap();
		log.info("Spring Init RedisCluster Success.");
		return jedisCluster;
	}
	
	/**
	 * 初始化集群的凹槽map，对于批量操作时需要获取对应redis客户端的凹槽
	 */
	@SuppressWarnings("rawtypes")
	private void initSlotHostMap() {
		nodeMap = jedisCluster.getClusterNodes();
		slotHostMap = new TreeMap<Long, String>();
		for (Iterator ite = nodeMap.entrySet().iterator(); ite.hasNext();) {
			Map.Entry entry = (Map.Entry) ite.next();
			slotHostMap.putAll(getSlotHostMap(entry.getKey().toString()));
		}
	}

	/**
	 * 获取集群的节点
	 * 
	 * @param anyHostAndPortStr
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private TreeMap<Long, String> getSlotHostMap(String anyHostAndPortStr) {
		TreeMap<Long, String> tree = new TreeMap<Long, String>();
		String parts[] = anyHostAndPortStr.split(":");
		HostAndPort anyHostAndPort = new HostAndPort(parts[0], Integer.parseInt(parts[1]));
		try {
			Jedis jedis = new Jedis(anyHostAndPort.getHost(), anyHostAndPort.getPort());
			List<Object> list = jedis.clusterSlots();
			for (Object object : list) {
				List<Object> list1 = (List<Object>) object;
				List<Object> master = (List<Object>) list1.get(2);
				String hostAndPort = new String((byte[]) master.get(0)) + ":" + master.get(1);
				tree.put((Long) list1.get(0), hostAndPort);
				tree.put((Long) list1.get(1), hostAndPort);
			}
			jedis.close();
		} catch (Exception e) {
			throw new RuntimeException("initSlotHostMap 时出错：" + e);
		}
		return tree;
	}
    
    /**
	 * 集群池配置
	 */
	private GenericObjectPoolConfig getGenericObjectPoolConfig() {
		GenericObjectPoolConfig config = new GenericObjectPoolConfig();
		//连接耗尽时是否阻塞, false报异常,ture阻塞直到超时, 默认true
		config.setBlockWhenExhausted(true);
		//设置的逐出策略类名, 默认DefaultEvictionPolicy(当连接超过最大空闲时间,或连接数超过最大空闲连接数)
		config.setEvictionPolicyClassName("org.apache.commons.pool2.impl.DefaultEvictionPolicy");
		//是否启用pool的jmx管理功能, 默认true
		config.setJmxEnabled(true);
		//MBean ObjectName = new ObjectName("org.apache.commons.pool2:type=GenericObjectPool,name=" + "pool" + i); 默 认为"pool"
		//config.setJmxNamePrefix("pool");
		//是否启用后进先出, 默认true
		config.setLifo(true);
		//最大空闲连接数, 默认8个
		config.setMaxIdle(maxIdle);
		//最大连接数, 默认8个
		config.setMaxTotal(maxTotal);
		//获取连接时的最大等待毫秒数(如果设置为阻塞时BlockWhenExhausted),如果超时就抛异常, 小于零:阻塞不确定的时间,  默认-1
		config.setMaxWaitMillis(maxWairMillis);
		//逐出连接的最小空闲时间 默认1800000毫秒(30分钟)
		config.setMinEvictableIdleTimeMillis(1800000);
		//最小空闲连接数, 默认0
		config.setMinIdle(10);
		//每次逐出检查时 逐出的最大数目 如果为负数就是 : 1/abs(n), 默认3
		config.setNumTestsPerEvictionRun(3);
		//对象空闲多久后逐出, 当空闲时间>该值 且 空闲连接>最大空闲数 时直接逐出,不再根据MinEvictableIdleTimeMillis判断  (默认逐出策略)   
		config.setSoftMinEvictableIdleTimeMillis(1800000);
		//在获取连接的时候检查有效性, 默认false
		config.setTestOnBorrow(onBorrow);
		//在空闲时检查有效性, 默认false
		config.setTestWhileIdle(false);
		//逐出扫描的时间间隔(毫秒) 如果为负数,则不运行逐出线程, 默认-1
		config.setTimeBetweenEvictionRunsMillis(-1);
		return config;
	}
	
	/**
	 * 释放给外部获取Redis集群对象，做扩展
	 * 
	 * @return JedisCluster
	 */
	public JedisCluster getJedisCluster() {
		return jedisCluster;
	}

	/**
	 * 查看key是否存在
	 * 
	 * @param key
	 * @return true,false
	 */
	public boolean exist(String key) {
		log.info("exists:" + key);
		return jedisCluster.exists(key);
	}
	
	/**
	 * 存入序列化对象
	 * 
	 * @param key
	 */
	public void set(String key, Object value) throws Exception {
		log.info("set:" + key);
		jedisCluster.set(key.getBytes(), SerializationUtil.serialize(value));
	}

	/**
	 * 存入序列化对象，含过期时间
	 * 
	 * @param key
	 * @param value
	 * @param time==0?60*60*24:time
	 */
	public void set(String key, Object value, int timeOut) throws Exception {
		log.info("setex:" + key);
		if (0 == timeOut) {
			jedisCluster.setex(key.getBytes(), KEY_TIME_OUT, SerializationUtil.serialize(value));
		}
		jedisCluster.setex(key.getBytes(), timeOut, SerializationUtil.serialize(value));
	}
	
	/**
	 * 存入JSON序列化对象，含过期时间
	 * 
	 * @param key
	 * @param value
	 * @param time==0?60*60*24:time
	 */
	public void setJSON(String key, Object value, int timeOut) throws Exception {
		log.info("setex:" + key);
		if (0 == timeOut) {
			jedisCluster.setex(key, KEY_TIME_OUT, JSON.toJSONString(value));
		}
		jedisCluster.setex(key, timeOut, JSON.toJSONString(value));
	}
	
	/**
	 * 批量存入序列化对象
	 * @param map<String, object>
	 */
	public void set(Map<? extends String, ?> kv) throws Exception {
		log.info("batchSet:" + kv);
		batchSet(kv);
	}
	
	/**
	 * 批量存储
	 * 
	 * @param kv
	 * @throws Exception
	 */
	private void batchSet(Map<? extends String, ?> kv) throws Exception {
		Map<Jedis, List<byte[]>> shardedKvs = clusterKeyValues(kv);
		if (EmptyUtils.isEmpty(shardedKvs)) {
			return;
		}
		for (Map.Entry<Jedis, List<byte[]>> entry : shardedKvs.entrySet()) {
			byte[][] keyValueSet = entry.getValue().toArray(new byte[entry.getValue().size()][]);
			entry.getKey().mset(keyValueSet);
		}
	}
	
	/**
	 * 根据key值获取对应的jedis客户端和键值对
	 * 
	 * @param kv 键值
	 * @return 实际redis client和对应的键值
	 */
    @SuppressWarnings("rawtypes")
	private Map<Jedis, List<byte[]>> clusterKeyValues(Map<? extends String, ?> kv) {
    	Map<Jedis, List<byte[]>> clusterKvs = new HashMap<Jedis, List<byte[]>>();
		for (Iterator ite = kv.entrySet().iterator(); ite.hasNext();) {
			Map.Entry entry = (Map.Entry) ite.next();
			byte[] keyData = String.valueOf(entry.getKey()).getBytes();// 必须字符串流才能正常显示
			byte[] valueData = SerializationUtil.serialize(entry.getValue());
			int slot = JedisClusterCRC16.getSlot(String.valueOf(entry.getKey()));// 获取槽号
			// 获取到对应的Jedis对象
			Map.Entry<Long, String> entryJedis = slotHostMap.lowerEntry(Long.valueOf(slot));
			Jedis jedis = nodeMap.get(entryJedis.getValue()).getResource();
			List<byte[]> list = clusterKvs.get(jedis);
			if (list == null) {
				list = new ArrayList<byte[]>();
				clusterKvs.put(jedis, list);
			}
			list.add(keyData);
			list.add(valueData);

		}
        return clusterKvs;
    }

	/**
	 * 通过key取序列化对象值
	 * 
	 * @param key
	 * @return Object
	 */
	@SuppressWarnings("unchecked")
	public <T> T get(String key) throws Exception {
		log.info("get:" + key);
		byte[] objByte = jedisCluster.get(key.getBytes());
		return (T) (objByte == null ? null : SerializationUtil.deserialize(objByte));
	}
	
	/**
	 * 通过key取JSON序列化对象值
	 * 
	 * @param key
	 * @return Object
	 */
	public <T> T getJSON(String key, Class<T> clazz) throws Exception {
		log.info("get:" + key);
		String obj = jedisCluster.get(key);
		return (T) (EmptyUtils.isEmpty(obj) ? null : JSONObject.parseObject(obj, clazz));
	}
	
	/**
	 * 批量获取对象
	 */
	@SuppressWarnings("unchecked")
	public <T> Map<String, T> get(List<String> keys) throws Exception {
		log.info("batchGet:" + keys);
		Map<Jedis, List<byte[]>> clusterKvs = clusterKeyValues(keys);
		Map<String, T> returnMap = new HashMap<String, T>();
		for (Map.Entry<Jedis, List<byte[]>> entry : clusterKvs.entrySet()) {
			byte[][] keyValueSet = entry.getValue().toArray(
					new byte[entry.getValue().size()][]);
			List<byte[]> values = entry.getKey().mget(keyValueSet);
			returnMap.putAll((Map<? extends String, ? extends T>) generateResult(
							entry.getValue(), values));
		}
		return returnMap;
	}

	/**
	 * 根据key值获取对应的jedis客户端和键值对
	 * 
	 * @param key集合
	 * @return 实际redis client和对应的键值
	 */
	private Map<Jedis, List<byte[]>> clusterKeyValues(List<String> keys) {
		Map<Jedis, List<byte[]>> clusterKvs = new HashMap<Jedis, List<byte[]>>();
		for (int i = 0; i < keys.size(); i++) {
			byte[] key = keys.get(i).getBytes();
			int slot = JedisClusterCRC16.getSlot(key); // 获取槽号
			// 获取到对应的Jedis对象
			Map.Entry<Long, String> entryJedis = slotHostMap.lowerEntry(Long.valueOf(slot));
			Jedis jedis = nodeMap.get(entryJedis.getValue()).getResource();
			List<byte[]> list = clusterKvs.get(jedis);
			if (list == null) {
				list = new ArrayList<byte[]>();
				clusterKvs.put(jedis, list);
			}
			list.add(key);
		}
		return clusterKvs;
	}

	/**
	 * 将批量获取的值转换为对象
	 */
	@SuppressWarnings("unchecked")
	private <T> Map<String, T> generateResult(List<byte[]> keys,
			List<byte[]> values) {
		Map<String, T> result = new HashMap<String, T>();
		for (int i = 0; i < keys.size(); i++) {
			result.put(new String(keys.get(i)), (T) SerializationUtil
					.deserialize(values.get(i)));
		}
		return result;
	}
	/**
	 * 使用Jedis的分布式锁，尝试一段时间后，返回结果
	 * 
	 * @param lockKey
	 *            锁key
	 * @param lockValue
	 *            锁value
	 * @param timeout
	 *            获取锁超时时间
	 * @return success?true:false;
	 */
	public boolean setnxLock(String lockKey, String lockValue, long timeout) {
		try {
			log.debug("分布式加锁："+lockKey);
			long nanoTime = System.currentTimeMillis();
			// 在timeout的时间范围内不断轮询锁
			while (System.currentTimeMillis() - nanoTime < timeout) {
				// 锁不存在的话，设置锁并设置锁过期时间，即加锁
				if (jedisCluster.setnx(lockKey, lockValue) == 1) {
					// 设置锁过期时间是为了在没有释放锁的情况下锁过期后消失，不会造成永久阻塞
					jedisCluster.expire(lockKey, 30 * 1000);
					return true;
				}
				log.info("出现锁等待");
				// 短暂休眠，避免可能的活锁
				Thread.sleep(1000);
			}
		} catch (Exception e) {
			throw new RuntimeException("locking error", e);
		}
		return false;
	}

	/**
	 * 使用Jedis的分布式锁，立即返回结果
	 * 
	 * @param lockKey 锁key
	 * @param lockValue  锁value
	 * @return success?true:false;
	 */
	public boolean setnxLock(String lockKey, String lockValue) {
		try {
			// 锁不存在的话，设置锁并设置锁过期时间，即加锁
			if (jedisCluster.setnx(lockKey, lockValue) == 1) {
				// 设置锁过期时间是为了在没有释放锁的情况下锁过期后消失，不会造成永久阻塞
				jedisCluster.expire(lockKey, LOCK_TIME_OUT);
				return true;
			}
		} catch (Exception e) {
			throw new RuntimeException("locking error", e);
		}
		return false;
	}

	/**
	 * 分布式锁批量操作Key，立即返回结果 key的形式必须为 {LOCK}+key
	 * 会被分配到同一个凹槽里所以需要注意数据量
	 * @param key1,value1,key2 ,value2... example： obj.mSetnxLock(new
	 *            String[]{"key2","value1","key2","value2"})
	 * @return success?true:false;
	 */
//	public boolean mSetnxLock(String... keysValues) {
//		try {
//			// 锁不存在的话，设置锁并设置锁过期时间，即加锁
//			if (jedisCluster.msetnx(keysValues) == 1) {
//				// 设置锁过期时间是为了在没有释放锁的情况下锁过期后消失，不会造成永久阻塞
//				RedisThreadUtils redisThread = new RedisThreadUtils();
//				redisThread.setDelKeys(keysValues);
//				threadPool.execute(redisThread);
//				return true;
//			}
//		} catch (Exception e) {
//			throw new RuntimeException("locking error", e);
//		}
//		return false;
//	}
	
	/**
	 * 删除 key
	 * 
	 * @param delKey
	 * @return success?true:false;
	 */
	public boolean delKey(String delKey) {
		log.info("delKey:" + delKey);
		try {
			if (exist(delKey)) {
				jedisCluster.del(delKey);
				return true;
			}
		} catch (Exception e) {
			throw new RuntimeException("delete error", e);
		}
		return false;
	}

	/**
	 * 批量删除 key
	 * 
	 * @param delKey
	 * @return success?true:false;
	 */
	public boolean delKeyBatch(List<String> delKeys) {
		if (EmptyUtils.isEmpty(delKeys)) {
			return false;
		}
		log.info("delKeyBatch:" + delKeys);
		try {
			jedisCluster.del(delKeys.toArray(new String[delKeys.size()]));
			return true;
		} catch (Exception e) {
			throw new RuntimeException("batch delete error", e);
		}
	}
	/**
	 * HSET key field value
     * 将哈希表 key 中的域 field 的值设为 value 。
     * 如果 key 不存在，一个新的哈希表被创建并进行 HSET 操作。
     * 如果域 field 已经存在于哈希表中，旧值将被覆盖。
	 */
	public Long hSet(String key, String mapKey, String value) {
		if (EmptyUtils.isEmpty(key) || EmptyUtils.isEmpty(mapKey)) {
			return -1L;
		}
		log.info("hset:" + key + "/" + mapKey);
		return jedisCluster.hset(key, mapKey, value);
	}
	/**
	 * @param key
	 * @param mapKey
	 * @param value
	 * @param expireTime seconds
	 */
	public Long hSet(String key, String mapKey, String value, int expireTime) {
		if (EmptyUtils.isEmpty(key) || EmptyUtils.isEmpty(mapKey)) {
			return -1L;
		}
		log.info("hset:" + key + "/" + mapKey);
		Long result = jedisCluster.hset(key, mapKey, value);
		if (expireTime > 0) {
			jedisCluster.expire(key, expireTime);
		}
		return result;
	}
	/**
	 * HMSET key field value [field value ...]
     * 同时将多个 field-value (域-值)对设置到哈希表 key 中。
     * 此命令会覆盖哈希表中已存在的域。
     * 如果 key 不存在，一个空哈希表被创建并执行 HMSET 操作。
	 */
	public String hmSet(String key, Map<String, String> map) {
		if (EmptyUtils.isEmpty(key) || null == map) {
			return "";
		}
		log.info("hmset:" + key + "/" + map.toString());
		return jedisCluster.hmset(key, map);
	}
	/**
	 * 
	 * @param key
	 * @param map
	 * @param expireTime seconds
	 */
	public String hmSet(String key, Map<String, String> map, int expireTime) {
		if (EmptyUtils.isEmpty(key) || null == map) {
			return "";
		}
		log.info("hmset:" + key + "/" + map.toString());
		String result = jedisCluster.hmset(key, map);
		if (expireTime > 0) {
			jedisCluster.expire(key, expireTime);
		}
		return result;
	}
	
	/**
	 * HGET key field
     * 返回哈希表 key 中给定域 field 的值。
	 */
	public String hGet(String key, String mapKey) {
		if (EmptyUtils.isEmpty(key) || EmptyUtils.isEmpty(mapKey)) {
			return "";
		}
		log.info("hget:" + key + "/" + mapKey);
		return jedisCluster.hget(key, mapKey);
	}
	
	/**
	 * HMGET key field [field ...]
     * 返回哈希表 key 中，一个或多个给定域的值。
     * 如果给定的域不存在于哈希表，那么返回一个 nil 值。
     * 因为不存在的 key 被当作一个空哈希表来处理，所以对一个不存在的 key 进行 HMGET 操作将返回一个只带有 nil 值的表。
	 */
	public List<String> hmGet(String key, String... mapKey) {
		if (EmptyUtils.isEmpty(key) || EmptyUtils.isEmpty(mapKey)) {
			return null;
		}
		log.info("hmget:" + key + "/" + mapKey);
		return jedisCluster.hmget(key, mapKey);
	}
	
	/**
     * HEXISTS key field
     * 查看哈希表 key 中，给定域 field 是否存在。
     */
    public boolean hExist(String key, String mapKey) {
    	if (EmptyUtils.isEmpty(key) || EmptyUtils.isEmpty(mapKey)) {
			return false;
		}
		log.info("hexists:" + key + "/" + mapKey);
		return jedisCluster.hexists(key, mapKey);
    }
    
    public List<String> getRedisServers() {
		return redisServers;
	}

	public void setNodes(String nodes) {
		if(EmptyUtils.isNotEmpty(nodes)) {
			String[] nodeArray = nodes.split(";");
			this.redisServers = Arrays.asList(nodeArray);
		} else {
			this.redisServers = null;
		}
	}

	public String getRedisMasterName() {
		return redisMasterName;
	}

	public void setRedisMasterName(String redisMasterName) {
		this.redisMasterName = redisMasterName;
	}

	public String getRedisPassword() {
		return redisPassword;
	}

	public void setRedisPassword(String redisPassword) {
		this.redisPassword = redisPassword;
	}

	public Integer getMaxRedirections() {
		return maxRedirections;
	}

	public void setMaxRedirections(Integer maxRedirections) {
		this.maxRedirections = maxRedirections;
	}

	public Integer getSoTimeOut() {
		return soTimeOut;
	}

	public void setSoTimeOut(Integer soTimeOut) {
		this.soTimeOut = soTimeOut;
	}

	public Integer getTiemOut() {
		return tiemOut;
	}

	public void setTiemOut(Integer tiemOut) {
		this.tiemOut = tiemOut;
	}

	public Integer getMaxIdle() {
		return maxIdle;
	}

	public void setMaxIdle(Integer maxIdle) {
		this.maxIdle = maxIdle;
	}

	public Integer getMaxTotal() {
		return maxTotal;
	}

	public void setMaxTotal(Integer maxTotal) {
		this.maxTotal = maxTotal;
	}

	public Long getMaxWairMillis() {
		return maxWairMillis;
	}

	public void setMaxWairMillis(Long maxWairMillis) {
		this.maxWairMillis = maxWairMillis;
	}

	public boolean isOnBorrow() {
		return onBorrow;
	}

	public void setOnBorrow(boolean onBorrow) {
		this.onBorrow = onBorrow;
	}

}