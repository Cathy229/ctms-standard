package com.sinotrans.oms.common.core.support;

import java.text.DateFormat;
import java.text.FieldPosition;
import java.text.ParseException;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CustomDateFormat extends DateFormat {
	
	private DateFormat dateFormat;
	private SimpleDateFormat customFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	private SimpleDateFormat customFormatParent = new SimpleDateFormat("yyyy-MM-dd");

	public CustomDateFormat(DateFormat dateFormat) {
		this.dateFormat = dateFormat;
	}

	@Override
	public StringBuffer format(Date date, StringBuffer toAppendTo, FieldPosition fieldPosition) {
		return dateFormat.format(date, toAppendTo, fieldPosition);
	}

	@Override
	public Date parse(String source, ParsePosition pos) {
		Date date = null;
		try {
			if (source.length() > 10) {
				date = customFormat.parse(source, pos);
			} else {
				date = customFormatParent.parse(source, pos);
			}
		} catch (Exception e) {
			date = dateFormat.parse(source, pos);
		}
		return date;
	}

	// MVC主要处理类
	@Override
	public Date parse(String source) throws ParseException {
		Date date = null;
		try {
			// 先按自定义规则处理
			if (source.length() > 10) {
				date = customFormat.parse(source);
			} else {
				date = customFormatParent.parse(source);
			}
		} catch (Exception e) {
			// 按原先的规则
			date = dateFormat.parse(source);
		}
		return date;
	}

	//clone方法在jackson中也有用到
	@Override
	public Object clone() {
		Object format = dateFormat.clone();
		return new CustomDateFormat((DateFormat) format);
	}

}