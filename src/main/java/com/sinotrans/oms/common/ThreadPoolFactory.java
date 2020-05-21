package com.sinotrans.oms.common;
/**  
* Title: ThreadPoolFactory  
* Description:  
* @author Shoven.Jiang  
* @date 2018年10月19日  
* @version 1.0  
*/
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadPoolExecutor;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.stereotype.Component;
/**
 * 全局线程池
 * 
 * @author Shoven.Jiang
 * @Date 2018年10月19日 
 * 
 * @Component 注入Spring
 * @Configuration 自动配置
 * @ConfigurationProperties(prefix = "thread.pool") 读取配置文件的前缀
 * @PropertySource("classpath:/properties/threadPool.properties") 读取配置文件的路径，配置没必要都冗余到一个文件下所以分开写了
 * @EnableAsync 异步任务使用该线程池
 */
@Component
@Configuration
@ConfigurationProperties(prefix = "thread.pool")//取下面配的路径中前缀的值
@PropertySource("classpath:/properties/threadPool.properties")// 路径要写对
@EnableAsync
public class ThreadPoolFactory {
	
	protected final Log log = LogFactory.getLog(getClass());
	
	private static ThreadPoolTaskExecutor threadPool = null;
	private static int CORE_POOL_SIZE;
	private static int MAX_IMUM_POOL_SIZE;
	private static int KEEP_ALIVE_TIME;
	private final static int BLOCKING_QUEUE = 2000;
	
	public ThreadPoolFactory() {}// 不能写成私有的不然注入Spring无法实例化
	
	/**
	 * 构造线程池
	 * DiscardOldestPolicy设置策略为挤掉最旧的(不太适合咱的数据准确性)
	 * CallerRunsPolicy谁调用的任务谁执行，主线程调用主线程执行，也有解释说主线程重复调用 execute
	 * 
	 * @Bean(name="threadPoolBean") 使用异步任务时使用此name可以使用到实例化的线程池
	 */
	@Bean(name="threadPoolBean")
	public Executor initThreadPoolBean() {
		ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
		executor.setCorePoolSize(CORE_POOL_SIZE);
		executor.setMaxPoolSize(MAX_IMUM_POOL_SIZE);
		executor.setQueueCapacity(BLOCKING_QUEUE);
		executor.setKeepAliveSeconds(KEEP_ALIVE_TIME);
		executor.setThreadNamePrefix("GlobalExecutorPool-");
		executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy());
		executor.initialize();
		return executor;
	}

	/**
	 * 或得线程池对象
	 */
	public static ThreadPoolTaskExecutor getThreadPool() {
		return threadPool;
	}
	
	/**
	 * 执行线程任务 或者直接使用 @Async("threadPoolBean") 使用该线程池
	 */
	public static void executeThread(Runnable command) {
		threadPool.execute(command);
	}

	public void setCorePoolSize(int corePoolSize) {
		CORE_POOL_SIZE = corePoolSize;
	}

	public void setMaxImumPoolSize(int maxImumPoolSize) {
		MAX_IMUM_POOL_SIZE = maxImumPoolSize;
	}

	public void setKeepAliveTime(int keepAliveTime) {
		KEEP_ALIVE_TIME = keepAliveTime;
	}

}
