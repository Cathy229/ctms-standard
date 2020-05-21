package com.sinotrans.oms.common.nogenerator.macros;
import com.sinotrans.oms.common.nogenerator.Macro;
import com.sinotrans.oms.common.nogenerator.RuleContext;
import com.sinotrans.oms.common.nogenerator.util.StringUtil;

/**
 * <p>
 * Description:流水号宏，
 * </p>
 * <pre>
 * 示例：{NO(5)}: 00001
 * </pre>
 * 
 * @author shoven 2018年9月9日16:00:34
 * @version 1.0
 * 
 */

public class NumberMacro implements Macro {

	public NumberMacro()
    {
    }

    public String format(String pattern, String parameter, RuleContext context)
    {
        if(parameter == null || parameter.equals(""))
            return "";
        else
            return StringUtil.extendStrLR(context.getCurrentValue().toString(), '0', Integer.parseInt(parameter), "L");
    }

    public String name()
    {
        return "NO()";
    }

    public String regex()
    {
        return "\\{NO\\([^\\{\\}]+\\)\\}";
    }
}