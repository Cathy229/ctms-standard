package com.sinotrans.oms.common.util;
/**
 * <p>
 * Description:string字符串的帮助类
 * </p>
 * 
 * @author tony.zeng 2009-11-30
 * @version 1.0
 * 
 */

public class StringUtils {
	/*
	 * 去除字符串两边的空格
	 * 
	 */
   public static String removeSpace(String descStr){
	   if (EmptyUtils.isNotEmpty(descStr)&& descStr.length()>0) {
		   descStr = descStr.trim();
			if (descStr.length()>0) {
				return descStr;
			}
		}
	   return null;
   }
	
}
