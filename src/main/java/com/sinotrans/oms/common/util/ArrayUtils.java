/*
 * @(#)ArrayUtils.java 2009-12-13
 * 
 * Copyright 2008 sinotrans, Inc. All rights reserved.
 */
package com.sinotrans.oms.common.util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * <p>Description: 提供Array、List操作帮助类 </p>
 * @author 
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本    		修改人   			修改日期   		修改内容
 * 2009-12-29.1	   zengweiyu   		2009-12-29			增加getArrayItemsField方法
 * 2010-01-26.1	   李政   			2010-01-26		 	增加convertToSQLString方法
 * </pre>
 */
public class ArrayUtils {

	/**
	 * 把values中的值使用flag连接起来，并输出为String。如果values或flag为空输出值为null
	 * @param values
	 * @param flag
	 * @return
	 */
	public static String join(String[] values, String flag) {
		if (EmptyUtils.isNotEmpty(values) && !EmptyUtils.isEmpty(flag)) {
			StringBuilder result = new StringBuilder();
			result.append(values[0]);
			for(int i = 1 ; i < values.length ; i++){
				result.append(flag).append(values[i]);
			}
			return result.toString();
		} else {
			return null;
		}
	}
	
	
	/**
	 * 把values中的值使用flag连接起来，并输出为String。如果values或flag为空输出值为null
	 * @param values
	 * @param flag
	 * @return
	 */
	public static String join(Collection values, String flag) {
		if (EmptyUtils.isNotEmpty(values) && !EmptyUtils.isEmpty(flag)) {
			StringBuilder result = new StringBuilder();
			int index = 0;
			for (Iterator iterator = values.iterator(); iterator.hasNext();) {
				Object object = (Object) iterator.next();
				if (index++ != values.size() - 1) {
					result.append(object.toString()).append(flag);
				} else {
					result.append(object.toString());
				}
			}
			return result.toString();
		} else {
			return null;
		}
	}
	
	/**
	 * collection生成SQL in 语句可用的字符串
	 * @param values
	 * @return
	 */
	public static String convertToSQLString(Collection values){
		String sql = ArrayUtils.join(values, ",");
		sql = sql == null ? "" : sql;
		return "(" + sql + ") ";
	}
	
	
	/**
	 * 将一个行数组，取出其中一个字段，重新组成一个数组。
	 * @param rows
	 * @param field
	 * @param removeNull
	 * @param returnArray
	 * @return
	 */
	public static List getArrayItemsField(List rows,String field,Boolean removeNull,Boolean returnArray){
		if (rows == null) {
			return (returnArray == true) ? new ArrayList() : null;
		}
		List fields = new ArrayList();
		for (Iterator iterator = rows.iterator(); iterator.hasNext();) {
			Object obj = (Object) iterator.next();
			Object value = BeanUtils.getProperty(obj, field);
			//如果设置去除空值，且该行的这个字段为空，不加入到数组
			if (removeNull == true && value == null) {
				continue;
			}
			fields.add(value);
		}
		return fields;
	}
	
	/**
	 * 将一个行数组，取出其中一个字段，重新组成一个数组。
	 * @param rows
	 * @param field
	 * @param removeRepeat 去掉重复数据
	 * @param removeNull
	 * @param returnArray
	 * @return
	 */
	public static List getArrayItemsField(List rows,String field,Boolean removeRepeat,Boolean removeNull,Boolean returnArray){
		if (rows == null) {
			return (returnArray == true) ? new ArrayList() : null;
		}
		List fields = new ArrayList();
		for (Iterator iterator = rows.iterator(); iterator.hasNext();) {
			Object obj = (Object) iterator.next();
			Object value = BeanUtils.getProperty(obj, field);
			//如果设置去除空值，且该行的这个字段为空，不加入到数组
			if ((removeRepeat == true && fields.contains(value)) || (removeNull == true && value == null)) {
				continue;
			}
			fields.add(value);
		}
		return fields;
	}
}
