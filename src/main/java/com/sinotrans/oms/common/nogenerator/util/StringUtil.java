package com.sinotrans.oms.common.nogenerator.util;
/**
 * 操作java的字符串
 * @author chenyt
 *
 */
public class StringUtil {
	
	/**
     * 左边补齐 右边补齐
     */
	public static final String EXTEND_TYPE_LEFT = "L";
	public static final String EXTEND_TYPE_RIGHT = "R";
	
	 /**
	   * 对字符串扩充指定的字符以达到指定的长度
	   *
	   * @return java.lang.String
	   * @param sSource:
	   *            源字符传
	   * @param cAddChar:
	   *            需扩充的字符
	   * @param iLength:
	   *            扩充后达到的长度
	   * @param sAddType:
	   *            扩充方向的类别 "L": 添加在源字符串的左边 "R": 添加在源字符串的右边 调用示例:
	   *            extendStrLR("101",'0',10,"R") --> "1010000000"
	   */
	  public static String extendStrLR(String sSource, char cAddChar,
	      int iLength, String sAddType) {
	    if (sSource.length() >= iLength)
	      return sSource;

	    String sAdd = "";
	    for (int i = 0; i < iLength - sSource.length(); i++) {
	      sAdd += cAddChar;
	    }

	    if (sAddType.equalsIgnoreCase("L"))
	      return sAdd + sSource;
	    if (sAddType.equalsIgnoreCase("R"))
	      return sSource + sAdd;

	    return null;
	  }
}

