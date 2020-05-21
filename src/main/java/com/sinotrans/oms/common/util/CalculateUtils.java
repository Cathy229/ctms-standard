package com.sinotrans.oms.common.util;

import java.text.DecimalFormat;

public class CalculateUtils {

	/**
	 * 四舍五入并保留两位小数点
	 * @param dValue
	 * @return
	 */
	public static Double getRound2(Double dValue){
		if(null!=dValue){
			DecimalFormat df = new DecimalFormat("#.00");
			dValue = Double.parseDouble(df.format(dValue));
		}
		return dValue;
	}
}
