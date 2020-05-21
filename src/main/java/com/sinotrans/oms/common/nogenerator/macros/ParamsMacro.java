package com.sinotrans.oms.common.nogenerator.macros;
import com.sinotrans.oms.common.nogenerator.Macro;
import com.sinotrans.oms.common.nogenerator.RuleContext;

/**
 * <p>
 * Description:参数宏，
 * </p>
 * <pre>
 * 示例：{PARAMS(OrderNo)}: 
 * </pre>
 * 
 * @author shoven 2018年9月9日16:00:34
 * @version 1.0
 * 
 */
public class ParamsMacro implements Macro {

	public ParamsMacro()
    {
    }

    public String format(String pattern, String parameter, RuleContext context)
    {
        if(parameter == null)
            return null;
        else
            return context.getParameter(parameter).toString();
    }

    public String name()
    {
        return "PARAMS()";
    }

    public String regex()
    {
        return "\\{PARAMS\\([^\\{\\}]+\\)\\}";
    }
}


/*
	DECOMPILATION REPORT

	Decompiled from: D:\OMS-UAT\OMS_DEV_LOCAL\libs\sns.nogenerator.jar
	Total time: 634 ms
	Jad reported messages/errors:
	Exit status: 0
	Caught exceptions:
*/