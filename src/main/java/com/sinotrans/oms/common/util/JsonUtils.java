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
 * 2017年5月23日    shangcy         Create the class
*/

package com.sinotrans.oms.common.util;

import java.lang.reflect.Method;
import java.text.ParseException;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang.StringUtils;
import org.codehaus.jackson.map.ObjectMapper;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.util.CollectionUtils;

import com.sinotrans.oms.common.tool.ClassInfoCaChe;

/**
 * JSON转换工具类
 * 
 * @FileName JsonUtils.java
 * @Date 2017年5月23日
 * @author Harley.Liu
 * @version 1.0
 */
@SuppressWarnings({"rawtypes","unchecked"})
public class JsonUtils {
	private static ObjectMapper objectMapper = new ObjectMapper();

	/**
	 * 将集合转为纯 field：value 的json数组
	 * 
	 * @Title: toJson
	 * @param objs
	 * @author Harley.Liu
	 * @date 2017年5月25日
	 */
	public static <T> JSONArray listToJson(List<T> objs) {
		if (CollectionUtils.isEmpty(objs)) {
			return null;
		}
		Method[] methods = getMethods(objs.get(0));
		if (EmptyUtils.isEmpty(methods)) {
			return null;
		}
		JSONArray results = new JSONArray();
        for (T obj : objs) {
            results.put(objectToJson(obj));
        }

		return results;
	}

	
	public static <T> JSONObject objectToJson(T obj) {
		if (obj == null) {
			return null;
		}
		Method[] methods = getMethods(obj);
		if (EmptyUtils.isEmpty(methods)) {
			return null;
		}

		JSONObject jsonObject = new JSONObject();
		// 如果是集合递归调用
		try {
			for (Method method : methods) {
				if (isGetter(method.getName())) {
					String fieldName = getFieldName(method.getName());
					Object value = method.invoke(obj);
					if (value instanceof java.util.List) {
						jsonObject.put(fieldName, listToJson((List<T>) value));
					} else if (FieldUtils.isPrimitive(value)) {
						jsonObject.put(fieldName, value);
					} else {
						jsonObject.put(fieldName, objectToJson(value));
					}
				}
			}
		} catch (Exception e) {
			throw new RuntimeException("list convert to json failed...", e);
		}

		return jsonObject;
	}
	
	// 获取方法集合
	private static <T> Method[] getMethods(T obj){
		Method[] methods = ClassInfoCaChe.getMethods(obj.getClass().toString());
		if(EmptyUtils.isEmpty(methods)){
			methods = obj.getClass().getDeclaredMethods();
			ClassInfoCaChe.addMethods(obj.getClass().toString(), methods);
		}
		return methods;
	}
	
	// 判断是否为get方法
	private static boolean isGetter(String methodName) {
		return StringUtils.isNotBlank(methodName) && methodName.startsWith("get") && methodName.length() >= 4;
	}

	// 获得参数名
	private static String getFieldName(String methodName) {
		if (methodName.length() >= 4) {
			return methodName.substring(3, 4).toLowerCase() + methodName.substring(4);
		}
		return null;
	}

	/**
	 * 类转json
	 * 
	 * @Title: bean2Json
	 * @param bean
	 */
	public static <T> String bean2Json(T bean) {
		try {
			return objectMapper.writeValueAsString(bean);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * map转json
	 * 
	 * @Title: map2Json
	 * @param map
	 */
	public static String map2Json(Map map) {
		try {
			return objectMapper.writeValueAsString(map);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * list转json
	 * 
	 * @Title: list2Json
	 * @param list
	 */
	public static String list2Json(List list) {
		try {
			return objectMapper.writeValueAsString(list);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "";
	}

	/**
	 * json转类
	 * 
	 * @Title: json2Bean
	 * @param json
	 * @param beanClass
	 */
	public static <T> T json2Bean(String json, Class<T> beanClass) {
		try {
			return objectMapper.readValue(json, beanClass);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * json 转 list
	 * 
	 * @Title: json2List
	 * @param json
	 * @param beanClass
	 */
	public static <T> List<T> json2List(String json, Class<T> beanClass) {
		try {
			return (List<T>) objectMapper.readValue(json, List.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * json转Map
	 * 
	 * @Title: json2Map
	 * @param json
	 */
	public static Map json2Map(String json) {
		try {

			return (Map) objectMapper.readValue(json, Map.class);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * 以下为测试用例
	 */
	// @Test
	public void testBean2Json() throws Exception {
		// Person person = new Person("张三_testBean2Json", "男", "22");
		// System.out.println( bean2Json(person) );
		// => {"name":"张三_testBean2Json","gender":"男","age":"22"}
	}

	// @Test
	public void testMap2Json() throws Exception {
		// Map<String, String> userMap = new LinkedHashMap<String, String>();
		// userMap.put("name", "张三_testMap2Json");
		// userMap.put("gender", "男");
		// userMap.put("age", "22");
		//
		// System.out.println( map2Json(userMap) );
		// => {"name":"张三_testMap2Json","gender":"男","age":"22"}
	}

	// @Test
	public void testList2Json() throws Exception {
		// List<String> list = new ArrayList<String>();
		// list.add("张三_testList2Json");
		// list.add("男");
		// list.add("22");
		// System.out.println( list2Json(list) );
		// // => ["张三_testList2Json","男","22"]
		// List<Person> personList = new ArrayList<Person>();
		// personList.add( new Person("张1", "男1", "11") );
		// personList.add( new Person("张2", "男2", "22") );
		// System.out.println( list2Json(personList) );
		// // =>
		// [{"name":"张1","age":"11","gender":"男1"},{"name":"张2","age":"22","gender":"男2"}]
	}

//	 @Test
//	public void testJson2Bean() throws Exception {
//		 EoInformationMainModel eoim = new EoInformationMainModel();
//		 eoim.setEoimId(100L);
//		 eoim.setEoimEscoCompanyNo("2943");
//		 String json = bean2Json(eoim);
//		 System.out.println(json);
//		 // // => User{ name : "张三_testJson2Bean", gender : "男", age : "22"}
//		 System.out.println( json2Bean(json, EoInformationMainModel.class) );
//	}

	// @Test
	public void testJson2List() throws Exception {
		// EoInformationMainModel eoim = new EoInformationMainModel();
		// eoim.setEoimId(1L);
		// List<EoInformationMainModel> personList = new
		// ArrayList<EoInformationMainModel>();
		// personList.add(eoim);
		// System.out.println(list2Json(personList));
		// System.out.println( json2List( list2Json(personList) ,
		// EoInformationMainModel.class)
		// );
		// => [User{ name : "张三1", gender : "男1", age : "11"}, User{ name :
		// "张三2", gender : "男2", age : "22"}]
	}

	// @Test
	public void testJson2Map() throws Exception {
		// Person person = new Person("张三", "男", "22");
		// String json = bean2Json(person);
		// Map map = json2Map(json);
		// System.out.println( map );
		// // => {name=张三, gender=男, age=22}
	}

	public static void main(String[] args) throws ParseException {
	}
}
