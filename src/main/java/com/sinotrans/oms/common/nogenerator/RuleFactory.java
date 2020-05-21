package com.sinotrans.oms.common.nogenerator;
/**  
* <p>Title: RuleFactory</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月9日  
* @version 1.0  
*/
public interface RuleFactory {
	
	
	Rule getRule(String ruleName);
	
	Rule saveCurrentValue(String ruleName,Long value);

}
