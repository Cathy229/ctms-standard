package com.sinotrans.oms.common.nogenerator;
/**
 * <p>
 * Description:获取流水号类
 * </p>
 * 
 * @author shoven 2018年9月9日15:53:11
 * @version 1.0
 * 
 */
public class NumberGenerator {
	
	/**
	 * 编号生成器配置信息
	 */
	private RuleConfiguration ruleConfiguration = RuleConfiguration.instance();
	
	/**
	 * RuleContext
	 */
	private RuleContext context;
	

	public NumberGenerator(RuleContext context){
		this.context = context;
	}
	
	/**
	 * 获取下一个流水号值
	 * @param rule
	 * @return
	 */
	public String nextValue(Rule rule){
		if(rule==null)
			return null;
		// 下一个流水号值
		int nextValue = rule.getCurrentCursor().intValue() + 1;
		rule.setCurrentCursor(Long.valueOf(nextValue));
		
		context.setRule(rule);
		// 根据流水号值，返回编号
		return RuleExpressionParser.parse(context);
	}
	
	/**
	 * 根据size大小，批量获取流水号的值
	 * @param rule
	 * @param size
	 * @return
	 */
	public String[] nextValues(Rule rule,int size){
		if(rule==null)
			return null;
		// 根据size定义一个数字，存放编号
		String[] nextValues = new String[size];
		for(int i = 0;i<size;i++){
			// 获取下一个编号值
			nextValues[i] = nextValue(rule); 
		}
		
		return nextValues;		
	}
	
	/**
	 * 获取当前流水号值
	 * @param rule
	 * @return
	 */
	public String currentValue(String ruleName){
		// 根据ruleName，获取Rule信息
		Rule rule = ruleConfiguration.getRule(ruleName, 1);
		if(rule==null){
			return null;
		}
		context.setRule(rule);
		// 获取当前流水号
		return RuleExpressionParser.parse(context);
	}
}

