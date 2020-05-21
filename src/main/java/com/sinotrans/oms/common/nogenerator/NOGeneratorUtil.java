package com.sinotrans.oms.common.nogenerator;

/**
 * <p>
 * Description:获取流水号类，静态类。
 * </p>
 * 
 * @author shoven 2018年9月9日15:51:43
 * @version 1.0
 * 
 */
public class NOGeneratorUtil {

	
	private static NumberGenerator numberGenerator;
	
	private static RuleContext context;
	
	/**
	 * 获取下一个流水号值
	 * @param rule
	 * @return
	 */
	public static String nextValue(Rule rule){
		getGenerator(context);
		return numberGenerator.nextValue(rule);
	}
	
	/**
	 * 根据size大小，批量获取流水号的值
	 * @param rule
	 * @param size
	 * @return
	 */
	public static String[] nextValues(Rule rule,int size){
		getGenerator(context);
		return numberGenerator.nextValues(rule, size);		
	}
	
	/**
	 * 获取当前流水号值
	 * @param rule
	 * @return
	 */
	public static String currentValue(String ruleName){
		getGenerator(context);
		return numberGenerator.currentValue(ruleName);
	}
	
	/**
	 * 获得NumberGenerator
	 * @param context
	 */
	public static void getGenerator(RuleContext context){
		if(numberGenerator!=null){
			return;
		}
		if(context==null){
			context = new RuleContext();
		}
		numberGenerator = new NumberGenerator(context);
	}
	
	/**
	 * 获得RuleContext
	 * @return
	 */
	public static RuleContext getDefaultRuleContext(){
		context = new RuleContext(); 
		return context;
	}
}