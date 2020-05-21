package com.sinotrans.oms.common.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;

/**  
* <p>Title: NumberUtil</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月15日  
* @version 1.0  
*/
public class NumberUtil {

	/**
	 * 实例化对象,以下两种方法效果一样,因为DecimalFormat继承自NumberFormat
	 */
	public static final DecimalFormat df = (DecimalFormat) DecimalFormat
			.getInstance(Locale.US);

	/**
	 * 判断是否为字符串是否为数字
	 * 对于负数会判断为false
	 */
	public static boolean isNumeric(String input) {
		boolean result = true;
		if (input.split(".").length > 2) {
			result = false;
		} else {
			char[] charArr = input.toCharArray();
			for (int i = 0; i < charArr.length; i++) {
				if (!".".equals(String.valueOf(charArr[i]))
						&& !Character.isDigit(charArr[i])) {
					result = false;
					break;
				}
			}
		}
		return result;
	}
	/**
	 * 传入一个整数及位数,生成固定位数的数字,位数不足在前面补0
	 * 
	 * @param input
	 * @param length
	 * @return
	 */
	public static String getFormatOfLength(Long input,int length) {
		int discrepancy = length - input.toString().length();
		String result="";
		if(discrepancy==0||discrepancy<0){
			result = input.toString();
		}else{
			for (int i = 0; i < discrepancy; i++) {
				result +="0";
			}
			result+=input;
		}
		
		return result;
	}
	
	
	/**
	 * 将对象转换为Long
	 * */
	public static Long parseLong(Object obj){
		Long l = null;
		if("".equals(obj)){
			return l;
		}
		try{
			if(obj != null){
				l = Long.parseLong(NumberUtil.getNumberFormat(parseDouble(obj), 0, false, 0));
			}
		}catch(Exception e){
			e.printStackTrace();
			return l;
		}
		return l;
	}
	
	/**
	 * 将对象转换为Long
	 * */
	public static Integer parseInteger(Object obj){
		Integer l = null;
		if("".equals(obj)){
			return l;
		}
		try{
			if(obj != null){
				l = Integer.parseInt(String.valueOf(obj));
			}
		}catch(Exception e){
			e.printStackTrace();
			return l;
		}
		return l;
	}
	
	/**
	 * 将对象转换为Double
	 * */
	public static Double parseDouble(Object obj){
		Double d = null;
		try{
			if(obj != null){
				d = Double.parseDouble(obj.toString());
			}else{
				d = new Double(0);
			}
		}catch(Exception e){
			e.printStackTrace();
			return d;
		}
		return d;
	}
	
	/**
	 * 将对象转换为BigDecimal类型
	 * */
	public static BigDecimal parseBigDecimal(Object obj){
		try{
			if(obj != null){
				BigDecimal d = new BigDecimal(parseDouble(obj));
				d.divide(new BigDecimal(1), 4, BigDecimal.ROUND_HALF_UP);
				return d;
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * Double对象相加
	 * */
	public static Double doublePlus(Double str,
			Double txt) {
		if (str == null) {
			if(txt != null){
				str = txt;
			}
		} else {
			if(txt != null){
				str = str+txt;
			}
		}
		return str;
	}
	
	/**
	 * Double对象相加
	 * */
	public static BigDecimal bigDecimalPlus(BigDecimal str,
			Double txt) {
		if (str == null) {
			if(txt != null){
				str = new BigDecimal(txt);
			}
		} else {
			if(txt != null){
				str = new BigDecimal(str.doubleValue()+txt);
			}
		}
		return str;
	}
	
	/**
	 * Long对象相加
	 * */
	public static Long longPlus(Long str,
			Long txt) {
		if (str == null) {
			if(txt != null){
				str = txt;
			}
		} else {
			if(txt != null){
				str = str+txt;
			}
		}
		return str;
	}
	
	/**
	 * Double对象相减
	 * */
	public static Double doubleMinus(Double str,
			Double txt) {
		if (str == null) {
			if(txt != null){
				return 0-txt;
			}else{
				return 0d;
			}
		} else {
			if(txt != null){
				return str-txt;
			}else{
				return str;
			}
		}
	}
	
	/**
	 * Long对象相减
	 * */
	public static Long longMinus(Long str,
			Long txt) {
		if (str == null) {
			if(txt != null){
				return 0-txt;
			}else{
				return 0l;
			}
		} else {
			if(txt != null){
				return str-txt;
			}else{
				return str;
			}
		}
	}
	
	/**
	 * 从BigDecimal对象中获取double值
	 * */
	public static Double getDoubleValue(BigDecimal d){
		if(d != null){
			return d.doubleValue();
		}else{
			return null;
		}
	}
	
	/**
	 * 判断对象是否是数字类型
	 * 对于负数会判断为false
	 * */
	public static boolean isNumberObject(Object obj){
		if(obj == null){
			return false;
		}
		if(obj.getClass() == Integer.class){
			return true;
		}
		if(obj.getClass() == Short.class){
			return true;
		}
		if(obj.getClass() == Long.class){
			return true;
		}
		if(obj.getClass() == Double.class){
			return true;
		}
		if(obj.getClass() == BigDecimal.class){
			return true;
		}
		return false;
	}
	
	/**
	 * 返回一个格式化的数字字符串
	 * 需要的参数:要格式化的数字(num),小数位的长度(length),是否分组(isGroup)如:123,456,789.123,
	 * 分组大小(groupSize)如:1,2345,6789.123
	 */
	public static String getNumberFormat(double num, int length,
			boolean isGroup, int groupSize) {
		return NumberUtil.numberFormat(num, length, isGroup, groupSize);
	}

	/**
	 * 返回一个格式化的数字字符串
	 * 需要的参数:要格式化的数字(num),小数位的长度(length),是否分组(isGroup)如:123,456,789.123,
	 * 分组大小(groupSize)如:1,2345,6789.123
	 */
	public static String getNumberFormat(long num, int length,
			boolean isGroup, int groupSize) {
		return NumberUtil.numberFormat(num, length, isGroup, groupSize);
	}

	/**
	 * 数字格式化的具体操作
	 */
	public static String numberFormat(double num, int length,
			boolean isGroup, int groupSize) {
		String strNum = "";
		// NumberUtil.df.setMaximumFractionDigits(length);
		NumberUtil.df.applyPattern(NumberUtil.createFractionPattern(length));
		if (isGroup) {
			NumberUtil.df.setGroupingUsed(true);
			NumberUtil.df.setGroupingSize(groupSize);
		} else {
			NumberUtil.df.setGroupingUsed(false);
		}
		strNum = NumberUtil.df.format(num);
		return strNum;
	}

	/**
	 * 创建带小数位的规定小数位长度的格式字符串
	 */
	public static String createFractionPattern(int length) {
		String pattern = "0";
		if (length > 0) {
			pattern += ".";
			for (int i = 0; i < length; i++) {
				pattern += "0";
			}
		}
		return pattern;
	}

	/**
	 * 返回规定小数位的带百分比的数字字符串 百分比的无分组
	 */
	public static String getPercentNumberFormat(double num,
			int length) {
		return NumberUtil.percentFormat(num, length);
	}

	/**
	 * 返回规定小数位的带百分比的数字字符串 百分比的无分组
	 */
	public static String getPercentNumberFormat(long num,
			int length) {
		return NumberUtil.percentFormat(num, length);
	}

	/**
	 * 数字格式化成百分比的具体操作
	 */
	public static String percentFormat(double num, int length) {
		String percentNum = "";
		NumberUtil.df.applyPattern(NumberUtil.createPercentPattern(length));
		percentNum = NumberUtil.df.format(num);
		return percentNum;
	}

	/**
	 * 创建带百分比的规定小数位长度的格式字符串
	 */
	public static String createPercentPattern(int length) {
		String pattern = "#";
		if (length > 0) {
			pattern += ".";
			for (int i = 0; i < length; i++) {
				pattern += "#";
			}
		}
		pattern += "%";
		return pattern;
	}

	/**
	 * 返回一个格式化的指定国家的货币字符串
	 * 需要的参数:要格式化的数字(num),小数位的长度(length),是否分组(isGroup)如:123,456,789.123,
	 * 分组大小(groupSize)如:1,2345,6789.123,指定国家(locale),货币钱是否显示国际货币符号(isSymbol)
	 */
	public static String getCurrencyFormat(double num, int length,
			boolean isGroup, int groupSize, Locale locale, boolean isSymbol) {
		return NumberUtil.currencyFormat(num, length, isGroup, groupSize,
				locale, isSymbol);
	}

	/**
	 * 返回一个格式化的指定国家的货币字符串
	 * 需要的参数:要格式化的数字(num),小数位的长度(length),是否分组(isGroup)如:123,456,789.123,
	 * 分组大小(groupSize)如:1,2345,6789.123,指定国家(locale),货币钱是否显示国际货币符号(isSymbol)
	 */
	public static String getCurrencyFormat(long num, int length,
			boolean isGroup, int groupSize, Locale locale, boolean isSymbol) {
		return NumberUtil.currencyFormat(num, length, isGroup, groupSize,
				locale, isSymbol);
	}

	/**
	 * 货币格式化的具体操作
	 */
	public static String currencyFormat(double num, int length,
			boolean isGroup, int groupSize, Locale locale, boolean isSymbol) {
		DecimalFormat cf = (DecimalFormat) DecimalFormat
				.getCurrencyInstance(locale);
		String strCurrency = "";
		if (isSymbol) {
			strCurrency += cf.getCurrency().getSymbol();
		}
		cf.applyPattern(NumberUtil.createFractionPattern(length));
		if (isGroup) {
			cf.setGroupingUsed(true);
			cf.setGroupingSize(groupSize);
		} else {
			cf.setGroupingUsed(false);
		}
		strCurrency += cf.format(num);
		return strCurrency;
	}
	
	/**
	 * <br>Description:TODO 四舍五入 保留x位
	 * @param unroundedValue  数值
	 * @param length  小数位长度
	 * @return
	 */
	public static Double getRoundDouble(double unroundedValue,int length) {   
        java.math.BigDecimal f1 = new java.math.BigDecimal(unroundedValue);//小数点后保留2位，4舍5入
	    f1 = f1.setScale(length,java.math.BigDecimal.ROUND_HALF_UP);
        return NumberUtil.getDoubleValue(f1);   
	}
	/**
	 * <br>Description:科学计数法转换成普通计数法 四舍五入 保留x位
	 * @param unroundedValue  数值
	 * @param length  小数位长度
	 * @return
	 */
	public static String getRoundDoubleToSting(double unroundedValue,int length) {   
		java.math.BigDecimal f1 = new java.math.BigDecimal(unroundedValue);//小数点后保留2位，4舍5入
		f1 = f1.setScale(length,java.math.BigDecimal.ROUND_HALF_UP);
		return f1.toString();   
	}
	/** simon 重载方法,避免整数保留小数后出现小数位0补齐的情况
	 * <br>Description:科学计数法转换成普通计数法 四舍五入 保留x位 
	 * @param unroundedValue  数值
	 * @param length  小数位长度
	 * @param isDel0  是否删除小数位后多余的0,true:是
	 * @return
	 */
	public static String getRoundDoubleToSting(double unroundedValue,int length,boolean isDel0) {   
		java.math.BigDecimal f1 = new java.math.BigDecimal(unroundedValue);//小数点后保留2位，4舍5入
		f1 = f1.setScale(length,java.math.BigDecimal.ROUND_HALF_UP);
		String f2 = f1.toString();
		if (length>0 && isDel0) {
			while ("0".equals(f2.substring(f2.length()-1)) && f2.indexOf(".") != -1) {
				f2 = f2.substring(0, f2.length()-1);//去掉最后的0
				if (".".equals(f2.substring(f2.length()-1))) {
					f2 = f2.substring(0, f2.length()-1);//最后如果是小数点,去掉小数点
				}
			}
		}
		return f2;
	}
	
	/**
	 * <br>Description:如果Double对象为空，则转换为0d
	 * @param unroundedValue  数值
	 * @param length  小数位长度
	 * @return
	 */
	public static Double convertNullDouble(Double d) { 
		if(d==null){
			d=0d;
		}
		return d;
	}
	
    
    /**
	 * double类型相加
	 * @param d1
	 * @param d2
	 * @return
	 * BOOTH
	 */
	public static double doubleAdd(double d1,double d2){  
        BigDecimal b1=new BigDecimal(Double.toString(d1));  
        BigDecimal b2=new BigDecimal(Double.toString(d2));  
        return b1.add(b2).doubleValue();  
          
    }  
	/**
	 * double类型相减
	 * @param d1
	 * @param d2
	 * @return
	 * BOOTH
	 */  
    public static double doubleSub(double d1,double d2){  
        BigDecimal b1=new BigDecimal(Double.toString(d1));  
        BigDecimal b2=new BigDecimal(Double.toString(d2));  
        return b1.subtract(b2).doubleValue();  
          
    }  
    /**
	 * double类型相乘
	 * @param d1
	 * @param d2
	 * @return
	 * BOOTH
	 */    
    public static double doubleMul(double d1,double d2){  
        BigDecimal b1=new BigDecimal(Double.toString(d1));  
        BigDecimal b2=new BigDecimal(Double.toString(d2));  
        return b1.multiply(b2).doubleValue();  
          
    }  
    /**
	 * double类型相除
	 * @param d1
	 * @param d2
	 * @return
	 * BOOTH
	 */  
    public static double doubleDiv(double d1,double d2){  
    	BigDecimal b1=new BigDecimal(Double.toString(d1));  
        BigDecimal b2=new BigDecimal(Double.toString(d2)); 
        return b1.divide(b2).doubleValue();  
          
    }
}
