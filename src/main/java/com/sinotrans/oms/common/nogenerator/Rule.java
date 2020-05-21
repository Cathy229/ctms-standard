package com.sinotrans.oms.common.nogenerator;
/**
 * <p>
 * Description:流水号规则对象
 * </p>
 * 
 * @author shoven 2018年9月9日15:54:12
 * @version 1.0
 * 
 */
public class Rule {
	
	/**
	 * 规则表达式
	 */
	private String ruleExpression;
	
	private int size;

	/**
	 * 规则类型
	 */
	private String name;
	
	/**
	 * 最终编号长度
	 */
	private int maxTextLength;
	
	/**
	 * 当前流水号值
	 */
	private Long currentCursor;
	
	/**
	 * @return the ruleExpression
	 */
	public String getRuleExpression() {
		return ruleExpression;
	}

	/**
	 * @param ruleExpression the ruleExpression to set
	 */
	public void setRuleExpression(String ruleExpression) {
		this.ruleExpression = ruleExpression;
	}

	/**
	 * @return the size
	 */
	public int getSize() {
		return size;
	}

	/**
	 * @param size the size to set
	 */
	public void setSize(int size) {
		this.size = size;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 最终编号长度
	 * @return
	 */
	public int getMaxTextLength() {
		return maxTextLength;
	}

	/**
	 * 最终编号长度
	 * @param maxTextLength
	 */
	public void setMaxTextLength(int maxTextLength) {
		this.maxTextLength = maxTextLength;
	}

	/**
	 * 当前流水号值
	 * @return
	 */
	public Long getCurrentCursor() {
		return currentCursor;
	}

	/**
	 * 当前流水号值
	 * @param currentValue
	 */
	public void setCurrentCursor(Long currentCursor) {
		this.currentCursor = currentCursor;
	}
	
	

}
