/*
 * @(#)ClassInfo.java 2009-12-9
 * 
 * Copyright 2008 SinoServices, Inc. All rights reserved.
 */
package com.sinotrans.oms.common.tool;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import javax.persistence.Column;

import com.sinotrans.oms.common.util.EmptyUtils;


/**
 * <p>
 * Description:
 * </p>
 * 
 * @author Harley.Liu 2016-12-15
 * @version 1.0
 * 
 */
@SuppressWarnings("rawtypes")
public class ClassInfoCaChe {
	private static Map<String, String> columns = new HashMap<String, String>();
	private static Map<String, Class> types = new HashMap<String, Class>();
	private static Map<String, Method[]> methods = new ConcurrentHashMap<String, Method[]>();
	private static Map<String, Field[]> fields = new HashMap<String, Field[]>();
	private static boolean LOCK = true;

	private ClassInfoCaChe() {
	}

	public static void initClassCaChe(Class[] listClass) {
		if (LOCK) {
			String columnName = "";
			for (int i = 0; i < listClass.length; i++) {
				Class clazz = listClass[i];
				// 缓存类的所有方法
				Method[] m = clazz.getDeclaredMethods();
				addMethods(clazz.toString(), m);
				// 缓存类的所有属性
				Field[] field = clazz.getDeclaredFields();
				addFields(clazz.toString(), field);
				for (Method method : m) {
					// 如果有注解则加入缓存
					if (method.getAnnotation(Column.class) != null) {
						columnName = method.getAnnotation(Column.class).name();
						// 以注解值为key,value加入列map
						addColumns(columnName, columnName);
						if (EmptyUtils.isNotEmpty(columnName)) {
							// 以注解值为key,type为value加入列map
							addTypes(columnName, method.getReturnType());
						}
					}
				}
			}
			LOCK = false;// 只能初始化一次
		}
	}

	public static void addColumns(String key, String value) {
		if (!columns.containsKey(key)) {
			columns.put(key, value);
		}
	}

	public static String getColumns(Object key) {
		return columns.containsKey(key) ? columns.get(key) : "";
	}

	public static void addTypes(String key, Class value) {
		if (!types.containsKey(key)) {
			types.put(key, value);
		}
	}

	public static Class getTypes(Object key) {
		return types.containsKey(key) ? types.get(key) : Error.class;
	}
	
	public static void addMethods(String clazzToString, Method[] value) {
		if (!methods.containsKey(clazzToString)) {
			methods.put(clazzToString, value);
		}
	}

	public static Method[] getMethods(Object clazzToString) {
		return methods.containsKey(clazzToString) ? methods.get(clazzToString) : null;
	}
	
	public static void addFields(String clazzToString, Field[] value) {
		if (!fields.containsKey(clazzToString)) {
			fields.put(clazzToString, value);
		}
	}

	public static Field[] getFields(Object clazzToString) {
		return fields.containsKey(clazzToString) ? fields.get(clazzToString) : null;
	}

}
