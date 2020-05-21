/*
 * @(#)EmptyUtils.java 2008-9-25
 * 
 * Copyright 2008 SKII, Inc. All rights reserved.
 */

package com.sinotrans.oms.common.util;


/**
 * <p>
 * Description: 比较帮助类
 * </p>
 * @author mx.yu
 * @version 1.0
 */
public class EqualsUtils {
	
	/**
	 * 比较两个字符串是否相等
	 * @param str1
	 * @param str2
	 * @return
	 */
	public static boolean isEquals(String str1,String str2){
		if(str1==null){
			return (str2 == null);
		}
		return str1.equals(str2);
	}
	
	/**
	 * 比较两个Integer是否相等
	 * @param int1
	 * @param int2
	 * @return
	 */
	public static boolean isEquals(Integer int1,Integer int2){
		if(int1 == null){
			return int2 == null;
		}
		return int1.equals(int2);
	}

}
