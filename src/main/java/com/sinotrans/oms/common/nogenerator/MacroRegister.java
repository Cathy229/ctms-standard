package com.sinotrans.oms.common.nogenerator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import com.sinotrans.oms.common.nogenerator.macros.DateMacro;
import com.sinotrans.oms.common.nogenerator.macros.NumberMacro;
import com.sinotrans.oms.common.nogenerator.macros.ParamsMacro;
import com.sinotrans.oms.common.nogenerator.macros.UserInfoMacro;


/**
 * <p>
 * Description:宏的注册器，为静态类。
 * 所有需要宏都在这里注册
 * </p>
 * 
 * @author simon.yu 2010-7-1
 * @version 1.0
 * 
 */
public class MacroRegister {
	
	private static final Map<String,Macro> macros = new HashMap<String, Macro>();
	
	//初始化注册宏
	static{
		initializeMacros();
	}
	
	/**
	 * 初始化所有宏
	 * @date 2010-7-1
	 */
	private static void initializeMacros(){
		//示例
		register(new DateMacro());
		register(new UserInfoMacro());
		register(new NumberMacro());
		register(new ParamsMacro());
	}
	
	/**
	 * @param macro
	 * @date 2010-7-1
	 */
	/**
	 * @param macro
	 * @date 2010-7-1
	 */
	public static void register(Macro macro){
		//校验是否存在同样的name的宏
		Macro orig = getMacro(macro.name());
		if(orig == null){//如果原来不存在，则注册
			macros.put(macro.name(), macro);
		}else if(orig != macro){//如果存在相同名称，且不是同一个宏实例时，抛出异常
			throw new RuntimeException("do not re-register the macro that is :"+macro.name());
		}
	}
	
	public static void clear(){
		macros.clear();
	}
	
	/**
	 * 通过名称取得宏定义
	 * @param name
	 * @return
	 */
	public static Macro getMacro(String name){
		return macros.get(name);
	}
	
	/**
	 * 得到所有的宏定义
	 * @return
	 */
	public static Iterator iterator(){
		return macros.values().iterator();
	}

}

