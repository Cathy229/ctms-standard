package com.sinotrans.oms.common.util;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Date;

/**
 * Created by Fingal on 2017-5-26.
 */
public class FieldUtils {
    /**
     * 判断是否为基本类型及对应对象类型
     * @param obj
     * @return
     */
    @SuppressWarnings("rawtypes")
	public static boolean isPrimitive(Object obj) {
        if(obj == null) return false;
        Class clazz = obj.getClass();
        return
            (
                clazz.equals(String.class) ||
                        clazz.equals(Integer.class)||
                        clazz.equals(Byte.class) ||
                        clazz.equals(Long.class) ||
                        clazz.equals(Double.class) ||
                        clazz.equals(Float.class) ||
                        clazz.equals(Character.class) ||
                        clazz.equals(Short.class) ||
                        clazz.equals(BigDecimal.class) ||
                        clazz.equals(BigInteger.class) ||
                        clazz.equals(Boolean.class) ||
                        clazz.equals(Date.class) ||
                        clazz.isPrimitive()
            );
    }
}
