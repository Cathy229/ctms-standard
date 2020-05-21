package com.sinotrans.oms.common.nogenerator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.sinotrans.oms.common.cache.redis.RedisTemplateUtil;

/**
 * <p>
 * Description:配置类,由此获取factory类
 * </p>
 * 
 * @author shoven 2018年9月9日15:55:34
 * @version 1.0
 * 
 */
@Configuration
public class RuleConfiguration {
	
	/**
	 * 此类为单例
	 */
	private static RuleConfiguration singleton;
	
	/**
	 * 规则工厂，只与属性。获取rule由配置文件获取
	 */
	private RuleFactory ruleFactory = null;
	
	
	/**
	 * 同步对象
	 */
	private Object lockObject = new Object();
	/**
	 * 
	 */
	public RuleConfiguration(){
		if(singleton == null){
			singleton = this;
		}else{
			throw new RuntimeException(getClass().getName()+" must be singleton!");
		}
	}

	@Autowired
	RuleFactory RuleFactoryImpl;// 20180921 harley 初始化工厂，注入的对象为RuleFactoryImpl
	/**
	 * @param ruleFactory the ruleFactory to set
	 * update 20180921 harley 初始化工厂
	 */
	@Bean
	public RuleFactory setRuleFactory() {
		this.ruleFactory = RuleFactoryImpl;
		return ruleFactory;
	}
	
	@Autowired
	private RedisTemplateUtil redisTemplateUtil;
	/**
	 * 
	 * @param rule
	 * @param size
	 * @return
	 */
	public Rule getRule(String rule,long size){
		// 测试用的
		if(ruleFactory == null){
			throw new RuntimeException("the ruleFactory is not initialized.");
		}
		// 使用分布式锁锁住该编码规则，等待30s
		if (redisTemplateUtil.setnxLock(rule, 10 * 1000)){
			synchronized (lockObject) {//同步，避免重号
				Rule r = ruleFactory.getRule(rule);
				// 保存Rule信息
				Rule ruleResult = ruleFactory.saveCurrentValue(r.getName(), r.getCurrentCursor()+size);
				redisTemplateUtil.delKey(rule);
				return ruleResult;
			}
		} else {
			throw new RuntimeException("the rule(" + rule + ") is lock.");
		}
	}
	
	
	public static RuleConfiguration instance(){
		if(singleton == null){
			throw new RuntimeException("RuleConfiguration is not initialized ");
		}
		return singleton;
	}
	
}
