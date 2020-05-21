package com.sinotrans.oms.common.nogenerator.macros;
import java.lang.reflect.Method;

import com.sinotrans.oms.common.nogenerator.Macro;
import com.sinotrans.oms.common.nogenerator.RuleContext;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;

/**
 * <p>
 * Description:用户信息宏，
 * </p>
 * <pre>
 * 示例：{USERINFO(orgId)}: 
 * </pre>
 * 
 * @author  shoven 2018年9月9日16:00:34
 * @version 1.0
 * <pre>
 * 修改记录:
 * 修改后版本     修改人   修改内容
 *  shoven 2018年9月9日16:00:34   根据parameter参数获取UserDetails的属性值
 *  </pre>
 */
public class UserInfoMacro implements Macro {

	public String format(String pattern, String parameter, RuleContext context) {
		// TODO Auto-generated method stub
		// 获取登录用户信息
		UserDetails user = SessionContext.getUser();
		String str = null;
		// 如果是公司id
		if(user!=null){
			if("orgID".equalsIgnoreCase(parameter)){
				str = user.getOrgId(); // 从UserDetails中获取
			}else if("depID".equalsIgnoreCase(parameter)){
				str = user.getUserDeptId();  // 从UserDetails中获取
			}else{ // 20101230  vicky
				try { // 根据parameter参数获取UserDetails的属性值
					String first = parameter.substring(0,1);
					String param = parameter.substring(1, parameter.length());
					String methodName = "get"+first.toUpperCase()+param;
					Method method = UserDetails.class.getMethod(methodName);
					Object obj = method.invoke(user);
					str = (obj==null)?null:obj.toString();
				} catch (Exception e) {
					throw new RuntimeException(e);
				} 
			}
		}
		return str;
	}

	public String name() {
		// TODO Auto-generated method stub
		return "USERINFO()";
	}

	public String regex() {
		// TODO Auto-generated method stub
		return "\\{USERINFO\\([^\\{\\}]+\\)\\}";
	}

}

