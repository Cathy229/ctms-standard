package com.sinotrans.oms.common.util;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NumberUtils {

    /**
     * 实例化对象,以下两种方法效果一样,因为DecimalFormat继承自NumberFormat
     */
    public static final DecimalFormat df = (DecimalFormat) DecimalFormat.getInstance(Locale.US);

    /**
     * 判断是否为字符串是否为数字
     */
    public static boolean isNumeric(String input) {
        boolean result = true;
        if (input.split(".").length > 2) {
            result = false;
        } else {
            char[] charArr = input.toCharArray();
            for (int i = 0; i < charArr.length; i++) {
                if (!".".equals(String.valueOf(charArr[i])) && !Character.isDigit(charArr[i])) {
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
    public static String getFormatOfLength(Long input, int length) {
        int discrepancy = length - input.toString().length();
        String result = "";
        if (discrepancy == 0 || discrepancy < 0) {
            result = input.toString();
        } else {
            for (int i = 0; i < discrepancy; i++) {
                result += "0";
            }
            result += input;
        }

        return result;
    }
    /**
     * 传入一个Double及位数,生成固定位数的数字,位数不足在前面补0
     * 
     * @param input
     * @param length
     * @return
     */
    public static Double getFormatOfLength(Double input, int length) {
    	Double value = new BigDecimal(input).setScale(length,BigDecimal.ROUND_HALF_UP).doubleValue();
    	return value;
    }

    /**
     * 去除多余的零
     * 
     * @param dou
     * @return
     */
    public static String getRemoveZero(Double dou) {
        if (dou == null) {
            return null;
        } else if (dou == 0) {
            return "0";
        }
        String ret = null;
        ret = dou.toString();
        String string[] = ret.split("\\.");
        if (string.length < 2) {
            return String.valueOf(dou.intValue());
        }
        // 取出整数部分
        char firstChar[] = string[0].toString().toCharArray();
        // 取出小数部分
        // char secondChar[] = string[1].toString().toCharArray();
        boolean isTrimLeft = false;
        if (!(firstChar.length == 1 && firstChar[0] == '0')) {
            isTrimLeft = true;
        }
        if (isTrimLeft) {
            ret = StringUtil.trimLeft(ret, "0");
        }
        ret = StringUtil.trimRight(ret, "0");
        char charArr[] = ret.toCharArray();
        if (charArr.length > 0 && charArr[charArr.length - 1] == '.') {
            return ret.substring(0, ret.length() - 1);
        }
        return ret;
    }

    /**
     * 将对象转换为Long
     */
    public static Long parseLong(Object obj) {
        Long l = null;
        if ("".equals(obj)) {
            return l;
        }
        try {
            if (obj != null) {
                l = Long.parseLong(NumberUtils.getNumberFormat(parseDouble(obj), 0, false, 0));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return l;
        }
        return l;
    }

    /**
     * 将对象转换为Long
     */
    public static Integer parseInteger(Object obj) {
        Integer l = null;
        if ("".equals(obj)) {
            return l;
        }
        try {
            if (obj != null) {
                l = Integer.parseInt(String.valueOf(obj));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return l;
        }
        return l;
    }

    /**
     * 将对象转换为Double
     */
    public static Double parseDouble(Object obj) {
        Double d = null;
        try {
            if (obj != null) {
                d = Double.parseDouble(obj.toString());
            } else {
                d = new Double(0);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return d;
        }
        return d;
    }

    /**
     * 将对象转换为BigDecimal类型
     */
    public static BigDecimal parseBigDecimal(Object obj) {
        try {
            if (obj != null) {
                BigDecimal d = new BigDecimal(parseDouble(obj));
                d.divide(new BigDecimal(1), 4, BigDecimal.ROUND_HALF_UP);
                return d;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Double对象相加
     */
    public static Double doublePlus(Double str, Double txt) {
        if (str == null) {
            if (txt != null) {
                str = txt;
            }
        } else {
            if (txt != null) {
                str = str + txt;
            }
        }
        return str;
    }

    /**
     * Double对象相加
     */
    public static BigDecimal bigDecimalPlus(BigDecimal str, Double txt) {
        if (str == null) {
            if (txt != null) {
                str = new BigDecimal(txt);
            }
        } else {
            if (txt != null) {
                str = new BigDecimal(str.doubleValue() + txt);
            }
        }
        return str;
    }

    /**
     * Long对象相加
     */
    public static Long longPlus(Long str, Long txt) {
        if (str == null) {
            if (txt != null) {
                str = txt;
            }
        } else {
            if (txt != null) {
                str = str + txt;
            }
        }
        return str;
    }

    /**
     * Double对象相减
     */
    public static Double doubleMinus(Double str, Double txt) {
        if (str == null) {
            if (txt != null) {
                return 0 - txt;
            } else {
                return 0d;
            }
        } else {
            if (txt != null) {
                return str - txt;
            } else {
                return str;
            }
        }
    }

    /**
     * Long对象相减
     */
    public static Long longMinus(Long str, Long txt) {
        if (str == null) {
            if (txt != null) {
                return 0 - txt;
            } else {
                return 0l;
            }
        } else {
            if (txt != null) {
                return str - txt;
            } else {
                return str;
            }
        }
    }

    /**
     * 从BigDecimal对象中获取double值
     */
    public static Double getDoubleValue(BigDecimal d) {
        if (d != null) {
            return d.doubleValue();
        } else {
            return null;
        }
    }

    /**
     * 判断对象是否是数字类型
     */
    public static boolean isNumberObject(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj.getClass() == Integer.class) {
            return true;
        }
        if (obj.getClass() == Short.class) {
            return true;
        }
        if (obj.getClass() == Long.class) {
            return true;
        }
        if (obj.getClass() == Double.class) {
            return true;
        }
        if (obj.getClass() == BigDecimal.class) {
            return true;
        }
        return false;
    }

    /**
     * 返回一个格式化的数字字符串 需要的参数:要格式化的数字(num),小数位的长度(length),是否分组(isGroup)如:123,456,789.123, 分组大小(groupSize)如:1,2345,6789.123
     */
    public static String getNumberFormat(double num, int length, boolean isGroup, int groupSize) {
        return NumberUtils.numberFormat(num, length, isGroup, groupSize);
    }

    /**
     * 返回一个格式化的数字字符串 需要的参数:要格式化的数字(num),小数位的长度(length),是否分组(isGroup)如:123,456,789.123, 分组大小(groupSize)如:1,2345,6789.123
     */
    public static String getNumberFormat(long num, int length, boolean isGroup, int groupSize) {
        return NumberUtils.numberFormat(num, length, isGroup, groupSize);
    }

    /**
     * 数字格式化的具体操作
     */
    public static String numberFormat(double num, int length, boolean isGroup, int groupSize) {
        String strNum = "";
        // NumberUtil.df.setMaximumFractionDigits(length);
        NumberUtils.df.applyPattern(NumberUtils.createFractionPattern(length));
        if (isGroup) {
            NumberUtils.df.setGroupingUsed(true);
            NumberUtils.df.setGroupingSize(groupSize);
        } else {
            NumberUtils.df.setGroupingUsed(false);
        }
        strNum = NumberUtils.df.format(num);
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
    public static String getPercentNumberFormat(double num, int length) {
        return NumberUtils.percentFormat(num, length);
    }

    /**
     * 返回规定小数位的带百分比的数字字符串 百分比的无分组
     */
    public static String getPercentNumberFormat(long num, int length) {
        return NumberUtils.percentFormat(num, length);
    }

    /**
     * 数字格式化成百分比的具体操作
     */
    public static String percentFormat(double num, int length) {
        String percentNum = "";
        NumberUtils.df.applyPattern(NumberUtils.createPercentPattern(length));
        percentNum = NumberUtils.df.format(num);
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
     * 返回一个格式化的指定国家的货币字符串 需要的参数:要格式化的数字(num),小数位的长度(length),是否分组(isGroup)如:123,456,789.123,
     * 分组大小(groupSize)如:1,2345,6789.123,指定国家(locale),货币钱是否显示国际货币符号(isSymbol)
     */
    public static String getCurrencyFormat(double num, int length, boolean isGroup, int groupSize, Locale locale, boolean isSymbol) {
        return NumberUtils.currencyFormat(num, length, isGroup, groupSize, locale, isSymbol);
    }

    /**
     * 返回一个格式化的指定国家的货币字符串 需要的参数:要格式化的数字(num),小数位的长度(length),是否分组(isGroup)如:123,456,789.123,
     * 分组大小(groupSize)如:1,2345,6789.123,指定国家(locale),货币钱是否显示国际货币符号(isSymbol)
     */
    public static String getCurrencyFormat(long num, int length, boolean isGroup, int groupSize, Locale locale, boolean isSymbol) {
        return NumberUtils.currencyFormat(num, length, isGroup, groupSize, locale, isSymbol);
    }

    /**
     * 货币格式化的具体操作
     */
    public static String currencyFormat(double num, int length, boolean isGroup, int groupSize, Locale locale, boolean isSymbol) {
        DecimalFormat cf = (DecimalFormat) DecimalFormat.getCurrencyInstance(locale);
        String strCurrency = "";
        if (isSymbol) {
            strCurrency += cf.getCurrency().getSymbol();
        }
        cf.applyPattern(NumberUtils.createFractionPattern(length));
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
     * <br>
     * Description:TODO 四舍五入 保留x位
     * 
     * @param unroundedValue 数值
     * @param length 小数位长度
     * @return
     */
    public static Double getRoundDouble(double unroundedValue, int length) {
        java.math.BigDecimal f1 = new java.math.BigDecimal(unroundedValue);// 小数点后保留2位，4舍5入
        f1 = f1.setScale(length, java.math.BigDecimal.ROUND_HALF_UP);
        return NumberUtils.getDoubleValue(f1);
    }

    /**
     * <br>
     * Description:科学计数法转换成普通计数法 四舍五入 保留x位
     * 
     * @param unroundedValue 数值
     * @param length 小数位长度
     * @return
     */
    public static String getRoundDoubleToSting(double unroundedValue, int length) {
        java.math.BigDecimal f1 = new java.math.BigDecimal(unroundedValue);// 小数点后保留2位，4舍5入
        f1 = f1.setScale(length, java.math.BigDecimal.ROUND_HALF_UP);
        return f1.toString();
    }

    /**
     * <br>
     * Description:如果Double对象为空，则转换为0d
     * 
     * @param unroundedValue 数值
     * @param length 小数位长度
     * @return
     */
    public static Double convertNullDouble(Double d) {
        if (d == null) {
            d = 0d;
        }
        return d;
    }

    /**
     * 判断是否为字符串是否为数字
     */
    public static boolean isNumeric2(String str) {
        if (EmptyUtils.isEmpty(str)) {
            return false;
        }
        Pattern pattern = Pattern.compile("[0-9]*");
        Matcher isNum = pattern.matcher(str);
        if (!isNum.matches()) {
            return false;
        }
        return true;
    }

    /**
     * 判断字符串是否包含数字
     * 
     * @param str
     * @return boolean
     */
    public static boolean isIncloudNumber(String str) {
        if (EmptyUtils.isEmpty(str)) {
            return false;
        }
        char[] array = str.toCharArray();
        for (int i = 0; i < array.length; i++) {
            if (NumberUtils.isNumeric2(String.valueOf(array[i]))) {
                return true;
            }
        }
        return false;
    }
}
