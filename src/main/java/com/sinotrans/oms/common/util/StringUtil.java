package com.sinotrans.oms.common.util;

import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.sinotrans.oms.common.Constants;

/**
 * <p>
 * Description: 字符串工具类
 * </p>
 * 
 * @author Harley.Liu
 * @version 1.0
 */
public class StringUtil {

    public static String formatMessage(String pattern, Object[] args) {
        MessageFormat msgFormat = new MessageFormat(pattern);
        return msgFormat.format(args);
    }

    /**
     * @param expression example:http://127.0.0.1:8080/web/test.action?paramName={0}
     * @param args example:[paramValue]
     */
    public static String translateString(String expression, Object[] args) {
        MessageFormat msgFormat = new MessageFormat(expression);
        return msgFormat.format(args);
    }

    /**
     * @param expression example:http://127.0.0.1:8080/web/test.action?paramName=${paramName}
     * @param valueMap example:{paramName=paramValue}
     */
    public static String translateString(String expression, Map<?, ?> valueMap) {
        String result = expression;
        int index = 0;
        StringBuffer field = new StringBuffer("");
        String strField;
        String fieldValue;
        char ch;
        while (true) {
            index = result.indexOf("${");
            if (index == -1) {
                break;
            }
            index = index + 2;
            while (true) {
                ch = result.charAt(index);
                if (!"}".equals(String.valueOf(ch))) {
                    field.append(ch);
                } else {
                    break;
                }
                index = index + 1;
            }
            strField = field.toString();
            if (strField != null && !strField.equals("")) {
                fieldValue = (String) valueMap.get(strField);
                if (fieldValue == null) {
                    fieldValue = "";
                }
                strField = "${" + strField + "}";
                result = result.replace(strField, fieldValue);
            } else {
                strField = "${}";
                result = result.replace(strField, "");
            }
            field.setLength(0);
        }
        return result;
    }

    /**
     * 判断一个字符串否为Null或是空串
     * 
     * @param input 字符串
     * @return
     */
    public static boolean isNullOrEmpty(String input) {
        return (input == null || "".equals(input) || "null".equals(input.trim()));
    }

    /**
     * 判断一个字符串否为Null或是空格串
     * 
     * @param input 字符串
     * @return
     */
    public static boolean isNullOrBlank(String input) {
        return (input == null || "".equals(input.trim()) || "null".equals(input.trim()));
    }

    /**
     * <br>
     * Description:TODO 判断一个字符串否不为Null或是空格串
     * 
     * @param input
     * @return 若该字符串不为null或者不为空格串 则返回 true 否则返回 false
     */
    public static boolean isNotNULlOrBlank(String input) {
        return !(input == null || "".equals(input.trim()) || "null".equals(input.trim()));
    }

    /**
     * 截取字符串长度
     * 
     * @param str 要处理的字符串
     * @param length 要截取的字节长度
     * @return
     */
    @SuppressWarnings("static-access")
    public static String getCharacter(String str, int length) {
        if (!StringUtil.isNullOrBlank(str)) {
            String title = str;
            int reInt = 0;
            String reStr = "";
            char[] tempChar = title.toCharArray();
            for (int kk = 0; (kk < tempChar.length && length > reInt); kk++) {
                String s1 = title.valueOf(tempChar[kk]);
                byte[] b = s1.getBytes();
                reInt += b.length;
                reStr += tempChar[kk];
            }
            if (length == reInt || (length == reInt - 1)) {
                str = reStr + "...";
            } else {
                str = title;
            }
            return str;
        }
        return null;
    }

    /**
     * 根据数据库用逗号分开的ID值（,1000,1001,1002,,,），解析成SQL语句方式的值（1000,1001,1002）
     * 
     * @param str:操作的字符串
     * @param txt:要去掉的字符
     */
    public static String trim(String str, String txt) {
        return trimLeft(trimRight(str, txt), txt);
    }

    /**
     * 剔除字符串左边的字符
     */
    public static String trimLeft(String str, String txt) {
        String result = "";
        if (!isNullOrBlank(str) && !isNullOrBlank(txt)) {
            int index = str.indexOf(txt);
            while (index == 0) {
                str = str.substring(txt.length());
                index = str.indexOf(txt);
            }
        }
        result = str;
        return result;
    }

    /**
     * 剔除字符串右边的字符
     */
    public static String trimRight(String str, String txt) {
        String result = "";
        if (!isNullOrBlank(str) && !isNullOrBlank(txt)) {
            int index = str.lastIndexOf(txt);
            int length = str.length() - txt.length();
            while (index == length) {
                str = str.substring(0, length);
                index = str.lastIndexOf(txt);
                length = str.length() - txt.length();
            }
        }
        result = str;
        return result;
    }

    /**
     * 获取用逗号隔开的String
     * 
     * @param str 要加的String
     * @param txt 要被加在str后面的String
     */
    public static String appendWithCommon(String str, String txt) {
        if (isNullOrBlank(str)) {
            if (!isNullOrBlank(txt)) {
                str = txt;
            }
        } else {
            if (!isNullOrBlank(txt)) {
                str += "," + txt;
            }
        }
        return str;
    }

    /**
     * 获取用逗号隔开的String
     * 
     * @param str 要加的String
     * @param txt 要被加在str后面的String
     */
    public static StringBuffer appendWithCommon(StringBuffer str, String txt) {
        if (str == null) {
            if (!isNullOrBlank(txt)) {
                str = new StringBuffer(txt);
            }
        } else if (isNullOrBlank(str.toString())) {
            str.append(txt);
        } else {
            if (!isNullOrBlank(txt)) {
                str.append("," + txt);
            }
        }
        return str;
    }

    /**
     * 获取用规定字符隔开的String
     * 
     * @param result 要加的String
     * @param item 要被加在result后面的String
     * @prama txt 分隔符
     */
    public static String appendWithDelimiter(String str, String txt, String delimiter) {
        if (isNullOrBlank(str)) {
            if (!isNullOrBlank(txt)) {
                str = txt;
            }
        } else {
            if (!isNullOrBlank(txt)) {
                str += (delimiter + txt);
            }
        }
        return str;
    }

    /**
     * 获取用规定字符隔开的String
     * 
     * @param result 要加的String
     * @param item 要被加在result后面的String
     * @prama txt 分隔符
     */
    public static StringBuffer appendWithDelimiter(StringBuffer str, String txt, String delimiter) {
        if (str == null) {
            if (!isNullOrBlank(txt)) {
                str = new StringBuffer(txt);
            }
        } else if (isNullOrBlank(str.toString())) {
            str.append(txt);
        } else {
            if (!isNullOrBlank(txt)) {
                str.append(delimiter + txt);
            }
        }
        return str;
    }

    /**
     * 从以规定符号隔开的字符串中删除指定字符串
     */
    public static String deleteStringByDelimiter(String str, String txt, String delimiter) {
        String result = "";
        if (!isNullOrBlank(delimiter) && !isNullOrBlank(str) && !isNullOrBlank(txt)) {
            String[] txtArr = txt.split(delimiter);
            String[] strArr = str.split(delimiter);
            for (int j = 0; j < txtArr.length; j++) {
                if (!isNullOrBlank(txtArr[j])) {
                    for (int i = 0; i < strArr.length; i++) {
                        if (!isNullOrBlank(strArr[i])) {
                            if (!strArr[i].equals(txtArr[j])) {
                                result = appendWithDelimiter(result, strArr[i], delimiter);
                            }
                        }
                    }
                }
            }
        }
        return result;
    }

    /**
     * 根据需要返回规定长度String类型的数字,位数不够的,在前面补txt
     */
    public static String getSpecifiedLengthNumber(String num, int length, String txt) {
        String result = "";
        int len = num.length();
        for (int i = 0; i < length - len; i++) {
            result += txt;
        }
        result += num;
        return result;
    }

    /**
     * 根据需要返回规定长度String类型的数字(如果原数字字符串长度大于或等于固定长度则返回原串),位数不够的,在前面补txt
     */
    public static String getFormatStringLengthNumber(String num, int length, String txt) {
        String result = "";
        int len = num.length();
        if (len >= length) {
            return num;
        }
        for (int i = 0; i < length - len; i++) {
            result += txt;
        }
        result += num;
        return result;
    }

    /**
     * 将字符串下划线后的第一个字母转成大写,并删除下划线,模拟hibernate生成实体属性
     */
    public static String propertyConvert(String str) {
        String result = str;
        if (isNullOrEmpty(str)) {
            return result;
        }
        result = result.toLowerCase();
        int index = 0;
        index = result.indexOf("_");
        String ch = "";
        while (true) {
            if (index == -1) {
                break;
            }
            ch = result.substring(index + 1, index + 2);

            result = result.substring(0, index) + ch.toUpperCase() + result.substring(index + 2);

            index = result.indexOf("_");
        }
        return result;
    }

    /**
     * 匹配一个字符串是否存在于另一个字符串中
     */
    public static boolean containsString(String str, String txt, String delimiter) {
        boolean result = false;
        if (isNotNULlOrBlank(str) && isNotNULlOrBlank(txt)) {
            if (isNullOrEmpty(delimiter)) {
                result = str.equals(txt);
            } else {
                String[] arr = str.split(delimiter);
                for (int index = 0; index < arr.length; index++) {
                    result = arr[index].equals(txt);
                    if (result) {
                        break;
                    }
                }
            }
        }
        return result;
    }

    /**
     * <br>
     * Description:TODO 根据指定的分隔符分隔生成Map <br>
     * Date:2010-5-26
     * 
     * @param str
     * @param delimiter
     * @return
     */
    public static Map<String, String> parseStringToMap(String str, String delimiter) {
        Map<String, String> retMap = new HashMap<String, String>();
        if (isNullOrBlank(str)) {
            return retMap;
        }
        if (isNullOrBlank(delimiter)) {
            retMap.put(str, str);
            return retMap;
        }
        String[] arr = str.split(delimiter);
        for (String s : arr) {
            if (!isNullOrBlank(s)) {
                retMap.put(s, s);
            }
        }
        return retMap;
    }

    /**
     * 根据分隔符移除重复的项
     */
    public static String getUniqueString(String words, String delimiter) {
        String str = null;
        if (isNullOrBlank(words)) {
            return str;
        }
        String[] arr = words.split(delimiter);
        for (int i = 0; i < arr.length; i++) {
            if (!containsString(str, arr[i], delimiter)) {
                str = appendWithDelimiter(str, arr[i], delimiter);
            }
        }
        return str;
    }

    /**
     * 传入两个用固定字符连接的字符串,移除掉两个字符串中相同的部分组成一个新的字符串 例：firstStr="1,2,3,4,5";secondStr="2,3,4,5,6";delimiter=",";则return的值为:"1,6";
     * 
     * @return
     */
    public static String removeSameString(String firstStr, String secondStr, String delimiter) {
        String result = "";
        if (isNullOrBlank(firstStr)) {
            return secondStr;
        } else if (isNullOrBlank(secondStr)) {
            return firstStr;
        } else {
            String[] firstArr = firstStr.split(delimiter);
            String[] secondArr = secondStr.split(delimiter);
            boolean flag = true;
            for (int i = 0; i < firstArr.length; i++) {
                flag = true;
                for (int j = 0; j < secondArr.length; j++) {
                    if (firstArr[i].equalsIgnoreCase(secondArr[j])) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    result += firstArr[i] + delimiter;
                }
            }
            for (int i = 0; i < secondArr.length; i++) {
                flag = true;
                for (int j = 0; j < firstArr.length; j++) {
                    if (secondArr[i].equalsIgnoreCase(firstArr[j])) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    result += secondArr[i] + delimiter;
                }
            }
        }
        return result.length() > 0 ? result.substring(0, result.length() - 1) : result;
    }

    /**
     * 删除匹配的字符串
     */
    public static String deleteContainsString(String words, String word, String delimiter) {
        if (isNotNULlOrBlank(words) && isNotNULlOrBlank(word)) {
            if (isNullOrEmpty(delimiter)) {
                if (words.equals(word)) {
                    return "";
                } else {
                    return words;
                }
            } else {
                String[] arr = words.split(delimiter);
                String newWords = "";
                for (int index = 0; index < arr.length; index++) {
                    if (!arr[index].equals(word)) {
                        newWords = appendWithDelimiter(newWords, arr[index], delimiter);
                    }
                }
                return newWords;
            }
        } else {
            return words;
        }
    }

    /**
     * 将对象转换为String
     */
    public static String getStringValue(Object obj) {
        String s = null;
        if (obj != null) {
            s = obj.toString();
        }
        return s;
    }

    /**
     * 
     * 将NULL转换成空串
     */
    public static String convertNulltoEmpty(String str) {
        if (str == null || "null".equals(str)) {
            str = "";
        }
        return str;
    }

    /**
     * 将字符数组用指定连接符号连接成字符串
     */
    public static String convertArrayToStr(String[] arr, char spliter) {

        if (arr == null) {
            return "";
        }

        StringBuffer result = new StringBuffer();

        for (int i = 0; i < arr.length; i++) {
            result.append(arr[i]);
            result.append(spliter);
        }
        result.deleteCharAt(result.length() - 1);

        return result.toString();
    }


    /**
     * 
     * <br>
     * Description:从StringBuffer 中删除最后一个符号
     * 
     * @param src
     * @return
     */
    public static StringBuffer delLastTokenFromSB(StringBuffer src) {
        if (src.length() > 0) {
            src.deleteCharAt(src.length() - 1);
        }
        return src;
    }


    /**
     * 字节码转换成16进制字符串
     * 
     * @param b 需要转换的字节流
     * @return 以“:”分割的字符串
     */
    public static String byte2hex(byte[] b) {
        String hs = "";
        String stmp = "";
        for (int n = 0; n < b.length; n++) {
            stmp = (java.lang.Integer.toHexString(b[n] & 0XFF));
            if (stmp.length() == 1)
                hs = hs + "0" + stmp;
            else
                hs = hs + stmp;
            if (n < b.length - 1)
                hs = hs + ":";
        }
        return hs.toUpperCase();
    }

    /**
     * 16进制字符串转换字节码
     * 
     * @param str 需要转换的字符串，以“:”分割
     * @return 转换后的字节流
     */
    public static byte[] hex2byte(String str) {
        String stmp[] = str.split(":");
        byte[] btmp = new byte[stmp.length];
        for (int n = 0; n < stmp.length; n++) {
            int i = Integer.valueOf(stmp[n], 16);
            btmp[n] = (byte) (i & 0XFF);
        }
        return btmp;
    }

    /**
     * 
     * @param str 表示传入的参数值的格式为:3500,3501,3502
     * @param ext 表示传入的参数值的分隔符为:,
     * @param type 表示传入的参数值类型
     * @return 数组或字符串
     */
    public static Object queryFieldFormatValue(String str, String ext, String Type) {
        if (isNotNULlOrBlank(str)) {
            if (Constants.QUERY_FIELD_TYPE_ARRAY.equals(Type))
                return str.split(ext);
        }
        return str;
    }

    /**
     * 
     * @param str 表示传入的参数值的格式为:3500,3501,3502
     * @return 表示返回的字符串格式为：'3500','3501','3501'
     */
    public static String stringFormat(String str) {
        if (isNotNULlOrBlank(str)) {
            String[] string = str.split(",");
            str = "";
            for (int i = 0; i < string.length - 1; i++) {
                str += ("'" + string[i] + "',");
            }
            str += ("'" + string[string.length - 1] + "'");
        }
        return str;
    }

    public static String dbToJavaFeild(String feild) {
        String[] feilds = feild.split("_");
        String result = "";
        for (int i = 0; i < feilds.length; i++) {
            if (i == 0) {
                result += feilds[i].toLowerCase();
            } else {
                result += (feilds[i].substring(0, 1).toUpperCase() + feilds[i].substring(1).toLowerCase());
            }
        }
        return result;
    }

    public static String javaToDbFeild(String feild) {
        String[] feilds = feild.split("");
        String result = "";
        for (int i = 0; i < feilds.length; i++) {
            if (i == 0) {
                result += feilds[i].toUpperCase();
            } else {
                if (!feilds[i].matches("[0-9]*") && feilds[i].equals(feilds[i].toUpperCase())) {
                    result += "_" + feilds[i].toUpperCase();
                } else {
                    result += feilds[i].toUpperCase();
                }

            }
        }
        return result;
    }

    /**
     * 字符串自增 如 V00001->V00002
     * 
     * @param code 字符串 V00001
     * @param length 自增长度 10
     * @return 返回 [V00001.....V00010]
     */
    public static List<String> stringIdentity(String code, int length) {
        String[] feilds = code.split("");
        List<String> results = new ArrayList<String>();
        String head = "";
        String tail = code;
        int index = -1;
        for (int i = 0; i < feilds.length; i++) {
            if (!feilds[i].matches("[0-9]*")) {
                index = (i + 1);
            }
        }
        if (index != -1) {
            head = code.substring(0, index);
            tail = code.substring(index);
        }
        Integer strToNum = Integer.valueOf(tail);
        for (int i = 0; i < length; i++) {
            results.add(head + String.format("%0" + tail.length() + "d", strToNum + i));
        }

        return results;
    }

    /**
     * 将首字母大写
     * 
     * @param name
     * @return
     */
    public static String captureName(String name) {
        char[] cs = name.toCharArray();
        cs[0] -= 32;
        return String.valueOf(cs);
    }
}
