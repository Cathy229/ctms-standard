package com.sinotrans.oms.common.nogenerator.macros;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.sinotrans.oms.common.nogenerator.Macro;
import com.sinotrans.oms.common.nogenerator.RuleContext;


/**
 * <p>
 * Description:日期宏，
 * </p>
 * <pre>
 * 示例：{DATE(yyyyMM)}: 201007
 * </pre>
 * 
 * @author shoven 2018年9月9日16:00:34
 * @version 1.0
 * 
 */
public class DateMacro implements Macro {

	public DateMacro()
    {
    }

    public String format(String pattern, String parameter, RuleContext context)
    {
        SimpleDateFormat dateFormat = new SimpleDateFormat(parameter);
        return dateFormat.format(new Date());
    }

    public String name()
    {
        return "DATE()";
    }

    public String regex()
    {
        return "\\{DATE\\([^\\{\\}]+\\)\\}";
    }
}
