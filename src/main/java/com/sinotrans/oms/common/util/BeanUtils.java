/*
 * @(#)BeanUtils.java 2009-11-10
 * 
 * Copyright 2008 sinotrans, Inc. All rights reserved.
 */
package com.sinotrans.oms.common.util;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import org.apache.commons.beanutils.ConversionException;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.Converter;
import org.apache.commons.beanutils.PropertyUtils;

/**
 * <p>
 * Description:封闭Apache BeanUtils的方法。
 * </p>
 * 
 * @version 1.0
 * 
 */
public class BeanUtils {
	/**
	 * 将对象orig的属性的值复制到对象dest中拥有有相同属性名的属性
	 * 
	 * @param dest
	 *            目标对象
	 * @param orig
	 *            源对象
	 * @throws RuntimeException
	 */
	public static void copyProperties(Object dest, Object orig)
			throws RuntimeException {
		try {
			org.apache.commons.beanutils.BeanUtils.copyProperties(dest, orig);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}

	}

	/**
	 * 复制对象
	 * 
	 * @param bean
	 *            目标对象
	 * @return
	 * @throws RuntimeException
	 */
	public static Object cloneBean(Object bean) throws RuntimeException {
		try {
			return org.apache.commons.beanutils.BeanUtils.cloneBean(bean);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}

	}

	/**
	 * 得到对象的属性值
	 * 
	 * @param bean
	 *            目标对象
	 * @param name
	 *            属性名称
	 * @return
	 * @throws RuntimeException
	 */
	public static Object getProperty(Object bean, String name)
			throws RuntimeException {
		try {
			return PropertyUtils.getProperty(bean, name);
//			return org.apache.commons.beanutils.BeanUtils.getProperty(bean,
//					name);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}

	}

	/**
	 * 给对象添加属性值
	 * 
	 * @param bean
	 *            目标对象
	 * @param name
	 *            对象属性名称
	 * @param value
	 *            对象属性值
	 * @throws RuntimeException
	 */
	public static void setProperty(Object bean, String name, Object value)
			throws RuntimeException {
		try {
			// 日期特殊判断,不能用instanceof，子类不作这个判断
			if (value != null && "java.util.Date".equals(value.getClass().getName())) {
				SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				value = dateTimeFormat.format(value);
			}
			org.apache.commons.beanutils.BeanUtils.setProperty(bean, name, value);
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}

	}

	/**
	 * 复制一组对象
	 * 
	 * @param coll
	 *            目标对象
	 * @throws RuntimeException
	 */
	public static Collection copy(Collection coll) throws RuntimeException {
		Collection to = null;
		try {
			to = (Collection) coll.getClass().newInstance();
			Iterator iter = coll.iterator();
			while (iter.hasNext()) {
				Object obj = iter.next();
				Object tmp = BeanUtils.cloneBean(obj);
				to.add(tmp);
			}
		} catch (Exception ex) {
			throw new RuntimeException(ex);
		}

		return to;
	}
	
	
	
	
	
	
	
	
	
	
	
	  /**
	 * 注册转化器
	 * @author yumx
	 * @date 2008-11-20
	 */
    private static boolean registered = false;
    
	public static void register() {
		if(registered == false){
			 ConvertUtils.register(new MySqlTimestampConverter(null), java.sql.Timestamp.class);
			 ConvertUtils.register(new MyIntegerConverter(null), Integer.class);
			 ConvertUtils.register(new MyLongConverter(null), Long.class);
			 ConvertUtils.register(new MyDoubleConverter(null), Double.class);
           //新增Date类型的转化器
		     ConvertUtils.register(new UtilDateConverter(null) , java.util.Date.class);
			 registered = true;
		}

	}
  /**
	 * 注册新的BeanUtils时间类型转化器
	 * @author:yumx  2008-10-15
	 * 
	 */
  static{
	  register();
  }

}



/**
 * <p>
 * Description:解决BeanUtils在copyProperties是，Timestamp为空抛出ConversionException: No value specified异常
 * </p>
 * 
 * @author yumx 2008-10-15
 * @version 1.0
 * 
 */
class MySqlTimestampConverter implements Converter {

	private Object defaultValue = null;
	private boolean useDefault = true;

	public MySqlTimestampConverter() {
		defaultValue = null;
		useDefault = true;
		defaultValue = null;
		useDefault = false;
	}

	public MySqlTimestampConverter(Object defaultValue) {
		this.defaultValue = null;
		useDefault = true;
		this.defaultValue = defaultValue;
		useDefault = true;
	}

	public Object convert(Class type, Object value) {
		try {
			if (value == null)
				if (useDefault)
					return defaultValue;
				else
					throw new ConversionException("No value specified");
			if (value instanceof Timestamp)
				return value;
			return Timestamp.valueOf(value.toString());
		} catch (Exception e) {
			if (useDefault)
				return defaultValue;
			else
				throw new ConversionException(e);
		}

	}

}
/**
 * <p>
 * Description:解决BeanUtils在copyProperties是，Long为空会自动转成0
 * </p>
 * 
 * @author yumx 2008-10-15
 * @version 1.0
 * 
 */
class MyLongConverter implements Converter {

	private Object defaultValue = null;
	private boolean useDefault = true;

	public MyLongConverter() {
		defaultValue = null;
		useDefault = true;
		defaultValue = null;
		useDefault = false;
	}

	public MyLongConverter(Object defaultValue) {
		this.defaultValue = null;
		useDefault = true;
		this.defaultValue = defaultValue;
		useDefault = true;
	}

	public Object convert(Class type, Object value) {
		try {
			/*if (value == null)
				if (useDefault)
					return defaultValue;
				else
					throw new ConversionException("No value specified");
*/			if(value == null)
				return null;
			if(value instanceof Long)
	            return value;
	        if(value instanceof Number)
	            return new Long(((Number)value).longValue());
	        return new Long(value.toString());
		} catch (Exception e) {
			if (useDefault)
				return defaultValue;
			else
				throw new ConversionException(e);
		}

	}

}


/**
 * <p>
 * Description:解决BeanUtils在copyProperties是，Integer为空会自动转成0
 * </p>
 * 
 * @author yumx 2008-10-15
 * @version 1.0
 * 
 */
class MyIntegerConverter  implements Converter {

	private Object defaultValue = null;
	private boolean useDefault = true;

	public MyIntegerConverter() {
		defaultValue = null;
		useDefault = true;
		defaultValue = null;
		useDefault = false;
	}

	public MyIntegerConverter(Object defaultValue) {
		this.defaultValue = null;
		useDefault = true;
		this.defaultValue = defaultValue;
		useDefault = true;
	}

	public Object convert(Class type, Object value) {
		try {
			/*if (value == null)
				if (useDefault)
					return defaultValue;
				else
					throw new ConversionException("No value specified");
*/			if(value == null)
				return null;
			if(value instanceof Integer)
	            return value;
	        if(value instanceof Number)
	            return new Integer(((Number)value).intValue());
	        return new Integer(value.toString());
		} catch (Exception e) {
			if (useDefault)
				return defaultValue;
			else
				throw new ConversionException(e);
		}

	}

}

/**
 * * <p>
 * Description:解决BeanUtils在copyProperties是，Double为空会自动转成0
 * </p>
 * 
 * @author Jack.Zeng
 * @version 1.0
 */
class MyDoubleConverter  implements Converter {

  private Object defaultValue = null;
  private boolean useDefault = true;

  public MyDoubleConverter() {
    defaultValue = null;
    useDefault = true;
    defaultValue = null;
    useDefault = false;
  }

  public MyDoubleConverter(Object defaultValue) {
    this.defaultValue = null;
    useDefault = true;
    this.defaultValue = defaultValue;
    useDefault = true;
  }

  public Object convert(Class type, Object value) {
    try {
      /*if (value == null)
        if (useDefault)
          return defaultValue;
        else
          throw new ConversionException("No value specified");
*/      if(value == null)
        return null;
      if(value instanceof Double)
              return value;
          if(value instanceof Number)
              return new Double(((Number)value).intValue());
          return new Double(value.toString());
    } catch (Exception e) {
      if (useDefault)
        return defaultValue;
      else
        throw new ConversionException(e);
    }

	}
}

/**
 * * <p>
 * Description:解决BeanUtils在setProperties是，Date类型属性无法设置Timestamp类型的值
 * </p>
 * 
 * @author Jack.Zeng
 * @version 1.0
 */
class UtilDateConverter implements Converter {
	public static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
	public static final SimpleDateFormat dateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	public static final SimpleDateFormat timestampFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:Ss.0");
	
	private Object defaultValue = null;
	private boolean useDefault = true;

	public UtilDateConverter() {
		defaultValue = null;
		useDefault = true;
		defaultValue = null;
		useDefault = false;
	}

	public UtilDateConverter(Object defaultValue) {
		this.defaultValue = null;
		useDefault = true;
		this.defaultValue = defaultValue;
		useDefault = true;
	}

	public Object convert(Class type, Object value) {
		try {
			if (value == null)
				if (useDefault)
					return defaultValue;
				else
					throw new ConversionException("No value specified");
			if (value instanceof java.util.Date)
				return value;
			String s = value.toString();
			if (s.matches("\\d+")) {
				return new Date(Long.parseLong(s));
			}
			if (s.matches("[0-9]{1,4}-[0-9]{1,2}-[0-9]{1,2} [0-6][0-9]:[0-6][0-9]:[0-6][0-9]")) {
				return dateTimeFormat.parse(s);
			}if (s.matches("[0-9]{1,4}-[0-9]{1,2}-[0-9]{1,2} [0-6][0-9]:[0-6][0-9]:[0-6][0-9]\\.0")) {
				return timestampFormat.parse(s);
			} else if (s.matches("[0-9]{1,4}-[0-9]{1,2}-[0-9]{1,2}")) {
				return dateFormat.parse(s);
			}

			//如果都不是的话，尝试直接转化
			return new Date(value.toString());
			// return Timestamp.valueOf(value.toString());
		} catch (Exception e) {
			if (useDefault)
				return defaultValue;
			else
				throw new ConversionException(e);
		}

	}

}