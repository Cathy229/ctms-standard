package com.sinotrans.oms.common.nogenerator;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * Description:规则上下文，用于传递一些数据
 * </p>
 * 
 * @author shoven 2018年9月9日15:53:11
 * @version 1.0
 * 
 */
public class RuleContext {
	
	/**
	 * 流水号规则对象
	 */
	private Rule rule;
	
	/**
	 * 当前流水号
	 */
	private Long currentValue;
	
	/**
	 * 参数集合
	 */
	private Map<String,Object> parameters = new HashMap<String,Object>();

	/**
	 * 
	 * @return
	 */
	public Long getCurrentValue() {
		return currentValue;
	}

	/**
	 * 
	 * @param currentValue
	 */
	public void setCurrentValue(Long currentValue) {
		this.currentValue = currentValue;
	}

	/**
	 * @return the rule
	 */
	public Rule getRule() {
		return rule;
	}

	/**
	 * @param rule the rule to set
	 */
	public void setRule(Rule rule) {
		this.rule = rule;
	}

	/**
	 * 添加参数
	 * @param param
	 */
	public void addParameter(Object param)
    {
        parameters.put(param.toString(), param);
    }
	
	/**
	 * 清空参数
	 */
	public void clearParameters(){
		parameters.clear();
	}
	
	/**
	 * 获取参数
	 * @param key
	 * @return
	 */
	public Object getParameter(String key){
		return parameters.get(key);
	}
	
}

