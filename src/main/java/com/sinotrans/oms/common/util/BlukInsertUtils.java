/*
 * COPYRIGHT. ShenZhen SINOSERVICES Technology Co., Ltd. 2017.
 * ALL RIGHTS RESERVED.
 *
 * No part of this publication may be reproduced, stored in a retrieval system, or transmitted,
 * on any form or by any means, electronic, mechanical, photocopying, recording, 
 * or otherwise, without the prior written permission of ShenZhen GreatVision Network Technology Co., Ltd.
 *
 * Amendment History:
 * 
 * Date                   By              Description
 * -------------------    -----------     -------------------------------------------
 * 2017年5月23日    Harley         Create the class
*/

package com.sinotrans.oms.common.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.Date;
import java.util.Map;

import javax.persistence.Column;

import com.sinotrans.oms.businessrequest.dto.EoBookingModelDto;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.common.tool.ClassInfoCaChe;

/**
 * @FileName BlukInsertUtils.java
 * @Date 2017年5月23日
 * @author Harley.Liu
 * @version 1.0
 * 
 * Map 等类型 转换 Bean 工具类
 */
@SuppressWarnings({"unchecked","rawtypes"})
public class BlukInsertUtils {

	/**
	 * 把源对象中有注解的字段赋值到目标对象中（源对象注解与目标对象需要一致） （请将目标对象加入ClassInfoCaChe缓存中） 例：
	 * 源对象：@Column(name = "EFEI_ESCO_ID") public Long getEiieEscoId()
	 * 目标对象：@Column(name = "EFEI_ESCO_ID") public Long getEFEI_ESCO_ID()
	 * 
	 * @param inClass
	 *            需要转换的对象，源对象
	 * @param methods
	 *            需要转换的class 中的方法集合：再循环外传入，不要在循环中获取，太耗资源
	 * @param returnObject
	 *            需要返回的对象，目标对象
	 */
	public static Object copyFiledsToEntity(Object inEntity, Object returnObject) {
		Class returnEntity = returnObject.getClass();
		Method[] inMethods = getClassMethod(inEntity.getClass());
		Method[] outMethods = getClassMethod(returnEntity);
		String columnName = null;
		String outColumnName = null;
		try {
			for (Method method : inMethods) {
				/**
				 * 传进来的entity字段肯定要比数据库的entity多所以过滤有注解的字段
				 */
				if (method.getAnnotation(Column.class) != null) {
					columnName = method.getAnnotation(Column.class).name();
					for (Method outMet : outMethods) {
						if (outMet.getAnnotation(Column.class) != null) {
							outColumnName = outMet.getAnnotation(Column.class).name();
							// 如果inEntity的注解和returnObject注解相同
							if (outColumnName.equals(columnName)) {
								// 从传进来的对象中get相应值
								Object fieldVal = method.invoke(inEntity, new Object[] {});
								// 拿到返回对象中的set方法，set值
								Method merhod = returnEntity.getDeclaredMethod(replaceMethodName(outMet.getName()),
										ClassInfoCaChe.getTypes(columnName));
								merhod.setAccessible(true);
								merhod.invoke(returnObject, fieldVal);
								break;
							}
						}
					}
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("BlukInsertUtils赋值Entity出错：" + e.getMessage());
		}
		return returnObject;
	}

	private static Method[] getClassMethod(Class objClass){
		Method[] outMethods = ClassInfoCaChe.getMethods(objClass.toString());
		if (EmptyUtils.isEmpty(outMethods)) {
			outMethods = objClass.getDeclaredMethods();
			ClassInfoCaChe.addMethods(objClass.toString(), outMethods);
		}
		return outMethods;
	}
	/**
	 * 将map<fieldName, value>转换为对象
	 * 
	 * @param map
	 *            源map <fieldname , value>
	 * @param obj
	 *            目标对象
	 */
	public static <T> T parseMapToObject(Map map, Object obj) {
		Class clazz = obj.getClass();
		java.lang.reflect.Field[] Fields = ClassInfoCaChe.getFields(clazz.toString());
		Class clazzSuper = clazz.getSuperclass(); // 获取父类
		java.lang.reflect.Field[] superFields = null;
		if(null != clazzSuper){
			//父类不为空获取参数
			superFields = clazzSuper.getDeclaredFields();
		}
		if (EmptyUtils.isEmpty(Fields)) {
			Fields = clazz.getDeclaredFields();
			ClassInfoCaChe.addFields(clazz.toString(), Fields);
		}
		try {
			setParam(Fields, clazz, map, obj);
			if(EmptyUtils.isNotEmpty(superFields)) {
				setParam(superFields, clazzSuper, map, obj);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("BlukInsertUtils转换类型出错：" + e.getMessage());
		}
		return (T) obj;
	}
	
	// 设置参数的值
	private static void setParam(java.lang.reflect.Field[] fields, Class clazz, Map parseMap, Object parseObj) throws NoSuchMethodException,
			SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, ParseException {
		for (java.lang.reflect.Field field : fields) {
			if (parseMap.containsKey(field.getName())) {
				Method merhod = clazz.getDeclaredMethod("set" + StringUtil.captureName(field.getName()), field.getType());
				merhod.setAccessible(true);
				merhod.invoke(parseObj, createParam(field, String.valueOf(parseMap.get(field.getName()))));
			}
		}
	}

	/**
	 * 将value值按类属性的顺序加入对象中
	 * 
	 * @param value
	 *            字段值
	 * @param obj
	 *            目标对象
	 */
	public static Object parseValueToObject(String[] value, Object obj) {
		Class clazz = obj.getClass();
		java.lang.reflect.Field[] Fields = ClassInfoCaChe.getFields(clazz.toString());
		if (EmptyUtils.isEmpty(Fields)) {
			Fields = clazz.getDeclaredFields();
			ClassInfoCaChe.addFields(clazz.toString(), Fields);
		}
		try {
			for (int i = 0; i < value.length; i++) {
				Method merhod = clazz.getDeclaredMethod("set" + StringUtil.captureName(Fields[i].getName()), Fields[i].getType());
				/*
				 * 值为 true 则指示反射的对象在使用时应该取消 Java 语言访问检查。 值为 false 则指示反射的对象应该实施
				 * Java 语言访问检查。 true 提升反射执行效率
				 */
				merhod.setAccessible(true);
				merhod.invoke(obj, createParam(Fields[i], value[i]));
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("BlukInsertUtils转换类型出错：" + e.getMessage());
		}
		return obj;
	}

	/**
	 * 判断参数类型后拼接相应类型字符串
	 * 
	 * @param map
	 *            解析json所得key：数据库字段
	 * @param paramType
	 *            获取的类型对象
	 * @param coName
	 *            字段名 key
	 * @return 字符串
	 * @throws ParseException
	 */
	private static Object createParam(java.lang.reflect.Field field, String value) throws ParseException {
		Object rValue = null;
		if (field.getType().isAssignableFrom(Long.class)) {
			rValue = EmptyUtils.isEmpty(value) ? -1L : Long.parseLong(value);
		} else if (field.getType().isAssignableFrom(Date.class)) {
			rValue = parseDateFormatValue(value);
		} else if (field.getType().isAssignableFrom(Double.class)) {
			rValue = Double.parseDouble(EmptyUtils.isEmpty(value) ? "0" : value);
		} /*else if (field.getType().isAssignableFrom(String.class)) {
			if ("null".equals(value)) {
				rValue = "";
			}else{
				rValue = EmptyUtils.isEmpty(value)? "":value;
			}
		}*/else{
			rValue = value;
		}
		return rValue;
	}

	/**
	 * 转换时间格式
	 * @Title: parseDateFormatValue 
	 * @param value
	 * @throws ParseException 
	 * @author Harley
	 * @date 2017年6月1日
	 */
	public static Date parseDateFormatValue(String value) throws ParseException {
		if (EmptyUtils.isEmpty(value)) {
			return null;
		}
		if (value.indexOf("-") == -1) {
			if(value.indexOf("CST") != -1){
				value = DateUtil.formatDateByInternational(value);
			}
			return DateUtil.parseDateFormatFromString(value, DateUtil.ORA_DATE_TIME_EXTENDED_FORMAT);
		} else {
			if(value.indexOf(":") == -1){
				return DateUtil.parseDateFormatFromString(value, DateUtil.DATE_DAY_PATTERN);
			} else {
				return DateUtil.parseDateFormatFromString(value, DateUtil.SECOND_PATTERN);
			}
		}
	}
	/**
	 * 替换get为set
	 * @Title: replaceMethodName 
	 * @param methodName
	 * @author Harley
	 * @date 2017年6月1日
	 */
	private static String replaceMethodName(String methodName) {
		if (EmptyUtils.isEmpty(methodName)) {
			return "";
		}
		StringBuffer sbf = new StringBuffer(methodName);
		if (sbf.toString().startsWith("get")) {
			sbf.replace(0, 3, "set");
		}
		return sbf.toString();
	}
	
	/**
	 * 将org转换为dest对象，不处理属性值为null属性
	 * 要求目标对象与源对象属性名一致
	 * @param dest 目标对象
	 * @param org 源对象
	 * add harley 20180912
	 */
	public static void copyPropertiesNonNull(Object dest, Object org) {
		Class orgClazz = org.getClass();
		Method[] orgMethods = getMethodArray(orgClazz);
		Class destClazz = dest.getClass();
		Method[] destMethods = getMethodArray(destClazz);
		try {
			// 处理源对象
			setParamNonNull(orgMethods, org, destMethods, dest);
			// 处理源对象的父类
			Class orgSuperClazz = org.getClass().getSuperclass();
			if (orgSuperClazz != null) {
				setParamNonNull(getMethodArray(orgSuperClazz), org, destMethods, dest);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("BlukInsertUtils转换类型出错：" + e.getMessage());
		}
	}
	// 设置参数的值
	private static void setParamNonNull(Method[] orgMethods, Object org, Method[] destMethods, Object dest)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for (int i = 0; i < orgMethods.length; i++) {
			Method orgMethod = orgMethods[i];
			if (orgMethod.getName().startsWith("get")) {
				for (int j = 0; j < destMethods.length; j++) {
					Method destMethod = destMethods[j];
					if (destMethod.getName().startsWith("set") 
							&& destMethod.getName().equals(replaceMethodName(orgMethod.getName()))) {
						orgMethod.setAccessible(true);
						Object orgValue = orgMethod.invoke(org);
						//if (null != orgValue) {
							destMethod.setAccessible(true);
							destMethod.invoke(dest, orgValue);
						/*}else{
							Class<?>[] parameterTypes = destMethod.getParameterTypes();
							if (parameterTypes.length == 1 && parameterTypes[0] == Long.class) {
								destMethod.setAccessible(true);
								destMethod.invoke(dest, orgValue);
							}
						}*/
					}
				}
			}
		}
	}
	
	/**
	 * 将org转换为dest对象，不处理属性值为null属性
	 * 要求目标对象与源对象属性名一致
	 * @param dest 目标对象
	 * @param org 源对象
	 * add harley 20180912
	 */
	public static void copyAfterPropertiesNonNull(Object dest, Object org) {
		Class orgClazz = org.getClass();
		Method[] orgMethods = getMethodArray(orgClazz);
		Class destClazz = dest.getClass();
		Method[] destMethods = getMethodArray(destClazz);
		try {
			// 处理源对象
			setAfterParamNonNull(orgMethods, org, destMethods, dest);
			// 处理源对象的父类
			Class orgSuperClazz = org.getClass().getSuperclass();
			if (orgSuperClazz != null) {
				setAfterParamNonNull(getMethodArray(orgSuperClazz), org, destMethods, dest);
			}
		} catch (Exception e) {
			e.printStackTrace();
			throw new RuntimeException("BlukInsertUtils转换类型出错：" + e.getMessage());
		}
	}
	// 设置参数的值
	private static void setAfterParamNonNull(Method[] orgMethods, Object org, Method[] destMethods, Object dest)
			throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		for (int i = 0; i < orgMethods.length; i++) {
			Method orgMethod = orgMethods[i];
			if (orgMethod.getName().startsWith("get")) {
				for (int j = 0; j < destMethods.length; j++) {
					Method destMethod = destMethods[j];
					if (destMethod.getName().startsWith("set") 
							&& destMethod.getName().equals(replaceMethodName(orgMethod.getName()))) {
						orgMethod.setAccessible(true);
						Object orgValue = orgMethod.invoke(org);
						if (null != orgValue) {
							destMethod.setAccessible(true);
							destMethod.invoke(dest, orgValue);
						}
					}
				}
			}
		}
	}
	
	
	// 获取类中属性
	private static Method[] getMethodArray (Class clazz) {
		Method[] methods = ClassInfoCaChe.getMethods(clazz.toString());
		if (EmptyUtils.isEmpty(methods)) {
			methods = clazz.getDeclaredMethods();
			ClassInfoCaChe.addMethods(clazz.toString(), methods);
		}
		return methods;
	}

	public static void main(String[] args) {
		EoBookingModelDto a = new EoBookingModelDto();
		a.setEorbAgentCode("PPPP");
		a.setEorbId(100L);
		EoRequestBookingModel b = new EoRequestBookingModel();
		copyPropertiesNonNull(b, a);
		System.out.println(b.toString());
	}
}
