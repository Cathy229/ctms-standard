package com.sinotrans.oms.common.nogenerator;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 * <p>
 * Description:规则表达式的解析器，负责将规则字符串解析成需要的目标串
 * 
 * </p>
 * 
 * @author shoven 2018年9月9日15:57:41
 * @version 1.0
 * 
 */
public class RuleExpressionParser {
	
	/**
	 * 解析流水号规则
	 * @param context
	 * @return
	 */
	public static String parse(RuleContext context){
		//1,得到rule对象
		Rule rule = context.getRule();
		long currentValue = rule.getCurrentCursor();//从rule得到currentValue
		
		// 解析后得到的编号
		String number = "";
		//
		for (int i = 0; i < rule.getSize(); i++) {
			//2，构造currentValue放到context
			currentValue = currentValue + Integer.valueOf(i);
			context.setCurrentValue(currentValue);
			context.setRule(rule);
			//3，将规则加入宏解析
			number = formatMacros(context);
		}
		return number;
	}
	
	/**
	 * 格式化字符串
	 * @param expression
	 * @return
	 * @date 2010-7-1
	 */
	public static String formatMacros(RuleContext context) {
        String expression = context.getRule().getRuleExpression();
        String param = null;
        String format = null;
        for(Iterator iter = MacroRegister.iterator(); iter.hasNext();) {
            Macro macro = (Macro)iter.next();
            Pattern pattern = Pattern.compile(macro.regex());
            for(Matcher matcher = pattern.matcher(expression); matcher.find(); matcher = pattern.matcher(expression)) {
                String group = matcher.group();
                int start = group.indexOf("(");
                int end = group.indexOf(")");
                if(start >= 0)
                    param = group.substring(start + 1, end);
                else
                    param = null;
                if(group.indexOf("PARAMS") >= 0)
                    context.addParameter(param);
                format = macro.format(group, param, context);
                expression = matcher.replaceFirst(format);
            }

        }

        if(context != null)
            context.clearParameters();
        return expression;
    }
}
