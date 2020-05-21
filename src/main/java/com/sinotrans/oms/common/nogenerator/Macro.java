package com.sinotrans.oms.common.nogenerator;
/**
 * <p>
 * Description:
 * </p>
 * 
 * @author shoven 2018年9月9日15:59:03
 * @version 1.0
 * 
 */
public interface Macro {
	
	/**
	 * 宏的主键，必须唯一
	 * 可以使用正则表达式，如DATE(\w)
	 * @return
	 */
	String name();
	
	/**
	 * 正则表达式
	 * @return
	 */
	String regex();
	
	/**
	 * 格式化宏，
	 * @param pattern
	 * @param parameter 宏中的函数
	 * @return
	 */
	String format(String pattern,String parameter,RuleContext context);

}

