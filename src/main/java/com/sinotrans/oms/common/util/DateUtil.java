package com.sinotrans.oms.common.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;

import com.sinotrans.oms.common.Constants;
/**
 * 日期工具类
 * add by Harley.Liu
 * 20170523
 */
public class DateUtil {

	public static final int[] dayArray = new int[] { 31, 28, 31, 30, 31, 30,
			31, 31, 30, 31, 30, 31 }; // 此数组定义了平年中每个月都有多少天

	public static final SimpleDateFormat sdf = new SimpleDateFormat(); // 定义一个日期格式化类实例

	/**
	 * yyyy-MM-dd HH:mm:ss SSS
	 */
	public static final String MILLI_PATTERN = "yyyy-MM-dd HH:mm:ss SSS";

	/**
	 * yyyy-MM-dd HH:mm:ss,SSS
	 */
	public static final String MILLI_PATTERN_COMMA = "yyyy-MM-dd HH:mm:ss,SSS";

	/**
	 * yyyy-MM-dd HH:mm:ss
	 */
	public static final String SECOND_PATTERN = "yyyy-MM-dd HH:mm:ss";

	/**
	 * yyyy-MM-dd HH:mm
	 */
	public static final String MINUTE_PATTERN = "yyyy-MM-dd HH:mm";

	/**
	 * yyyy-MM-dd
	 */
	public static final String DATE_DAY_PATTERN = "yyyy-MM-dd";

	/**
	 * yyyy-MM
	 */
	public static final String MONTH_PATTERN = "yyyy-MM";

	/**
	 * yyyy-MM-dd_HH-mm-ss
	 */
	public static final String DATE_FILE_PATTERN = "yyyy-MM-dd_HH-mm-ss";

	/**
	 * yyyy-MM-dd_HH-mm-ss_SSS
	 */
	public static final String DATE_FILE_MILLI_PATTERN = "yyyy-MM-dd_HH-mm-ss_SSS";

	/**
	 * MM/dd/yyyy
	 */
	public static final String DATE_FORMAT = "MM/dd/yyyy";

	/**
	 * MM/dd/yyyy HH:mm 标准时间格式
	 */
	public static final String DATE_TIME_FORMAT = "MM/dd/yyyy HH:mm";

	/**
	 * MM/dd/yyyy HH:mm:ss 带时分秒的标准时间格式
	 */
	public static final String DATE_TIME_EXTENDED_FORMAT = "MM/dd/yyyy HH:mm:ss";

	/**
	 * yyMMddHH
	 */
	public static final String DATE_FORMAT_YYMMDDHH= "yyMMddHH";
	
	/**
	 * yy-MM-dd
	 */
	public static final String DATE_FORMAT_YY_MM_DD = "yy-MM-dd";

	/**
	 * yyyy获取年份
	 */
	public static final String DATE_FORMAT_YYYY = "yyyy";

	/**
	 * MM/dd/yyyy HH:mm:ss SSS
	 */
	public static final String DATE_TIME_MILLI_FORMAT = "MM/dd/yyyy HH:mm:ss SSS";

	/**
	 * MM/dd/yyyy HH:mm:ss,SSS
	 */
	public static final String DATE_TIME_MILLI_FORMAT_COMMA = "MM/dd/yyyy HH:mm:ss,SSS";

	/**
	 * yyyyMMdd ORA标准日期格式
	 */
	public static final String ORA_DATE_FORMAT = "yyyyMMdd";

	/**
	 * yyyyMMddHHmm ORA标准时间格式
	 */
	public static final String ORA_DATE_TIME_FORMAT = "yyyyMMddHHmm";

	/**
	 * yyyyMMddHHmmss 带时分秒的ORA标准时间格式
	 */
	public static final String ORA_DATE_TIME_EXTENDED_FORMAT = "yyyyMMddHHmmss";

	/**
	 * yyyyMMddHHmmssSSS
	 */
	public static final String ORA_DATE_TIME_MILLI_FORMAT = "yyyyMMddHHmmssSSS";

	/**
	 * yyyyMMddHHmmss,SSS
	 */
	public static final String ORA_DATE_TIME_MILLI_FORMAT_COMMA = "yyyyMMddHHmmss,SSS";

	/**
	 * 星期几
	 */
	public static final String WEEK_DAY = "E";

	public static int YEAR = Calendar.YEAR;

	public static int MONTH = Calendar.MONTH;

	public static int DAY_OF_MONTH = Calendar.DAY_OF_MONTH;

	public static int HOUR_OF_DAY = Calendar.HOUR_OF_DAY;

	public static int MINUTE = Calendar.MINUTE;

	public static int SECOND = Calendar.SECOND;

	public static int MILLISECOND = Calendar.MILLISECOND;

	/**
	 * 获得一个当前系统时间的Calendar对象的实例
	 */
	public static Calendar getCalendar() {
		return Calendar.getInstance();
	}

	/**
	 * 获得一个当前系统时间的GregorianCalendar对象的实例
	 */
	public static GregorianCalendar getGregorianCalendar() {
		return (GregorianCalendar) Calendar.getInstance();
	}

	/**
	 * 获得一个当前系统时间的Date对象的实例
	 */
	public static Date getDate() {
		return new Date();
	}

	/**
	 * 获得一个指定时间的Calendar对象的实例
	 */
	public static Calendar getCalendar(Date date) {
		Calendar cal = DateUtil.getCalendar();
		cal.setTime(date);
		return cal;
	}

	/**
	 * 获得一个指定时间的GregorianCalendar对象的实例
	 */
	public static GregorianCalendar getGregorianCalendar(Date date) {
		GregorianCalendar gc = DateUtil.getGregorianCalendar();
		gc.setTime(date);
		return gc;
	}

	/**
	 * 获得一个指定时间的Date对象的实例
	 */
	public static Date getDate(Date date) {
		return DateUtil.getGregorianCalendar(date).getTime();
	}

	/**
	 * 获得一个计算指定日期的Date对象的实例 对日期中的某个部分进行加减计算
	 */
	public static Date getCalculateDate(Date date, int addNumber, int addField) {
		if (date != null) {
			GregorianCalendar gc = DateUtil.getGregorianCalendar(date);
			gc.add(addField, addNumber);
			return gc.getTime();
		} else {
			return null;
		}
	}

	public static int getDateField(Date date, int getField) {
		if (date != null) {
			GregorianCalendar gc = DateUtil.getGregorianCalendar(date);
			int field = gc.get(getField);
			if (getField == DateUtil.MONTH) {
				field = field + 1;
			}
			return field;
		} else {
			return -1;
		}
	}

	/**
	 * 传入一个Date对象实例和格式字符串 获得相应格式的日期字符串
	 * 
	 * @param date,pattern
	 * @return String
	 */
	public static String getStringDateFormat(Date date, String pattern) {
		if (date != null) {
			synchronized (sdf) {
				String str = null;
				sdf.applyPattern(pattern);
				str = sdf.format(date);
				return str;
			}
		} else {
			return "";
		}
	}
	
	/**
	 * 时间固定格式化：  yyyy-MM-dd HH:mm:ss
	 * @param date
	 * @return
	 */
	public static String getFormatDate(Date date, String pattern){  
	    if (null!=date){
	    	return new SimpleDateFormat(pattern).format(date);  
	    }
	    return null;
	 }

	/**
	 * 传入一个Date对象实例和格式字符串 获得相应格式的日期对象
	 * 
	 * @param date,pattern
	 * @return date
	 */
	public static Date getDateFormat(Date date, String pattern) {
		return DateUtil.parseDateFormat(DateUtil.getStringDateFormat(date,
				pattern), pattern);
	}

	/**
	 * 传入一个日期字符串和格式字符串 获得相应格式的日期对象实例
	 * 
	 * @param strDate,pattern
	 * @return date
	 */
	public static Date parseDateFormat(String strDate, String pattern) {
		if (strDate != null && !strDate.equals("")) {
			synchronized (sdf) {
				Date date = null;
				sdf.applyPattern(pattern);
				try {
					date = sdf.parse(strDate);
				} catch (Exception e) {
					e.printStackTrace();
				}
				return date;
			}
		} else {
			return null;
		}
	}

	/**
	 * <br>
	 * Description:TODO 传入一个日期字符串和格式字符串 获得相应格式的日期对象实例 出错抛出异常 <br>
	 * 
	 * @param strDate
	 * @param pattern
	 * @return
	 * @throws ParseException
	 */
	public static Date parseDateFormatFromString(String strDate, String pattern)
			throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat(pattern);
		Date date = format.parse(strDate);
		return date;
	}

	/**
	 * 传入一个日期字符串和格式字符串 获得相应格式的日期字符串
	 * 
	 * @param strDate,pattern
	 * @return String
	 */
	public static String parseStringDateFormat(String strDate, String pattern) {
		return DateUtil.getStringDateFormat(DateUtil.parseDateFormat(strDate,
				pattern), pattern);
	}

	/**
	 * 创建一个标准日期格式
	 * 
	 * @param pattern
	 * @return 标准日期格式的克隆
	 */
	public static DateFormat getDateFormat(String pattern) {
		/**
		 * 详细设计: 1.返回 DateFormat
		 */
		SimpleDateFormat theDateFormat = new SimpleDateFormat(pattern);
		return theDateFormat;
	}

	/**
	 * 创建一个标准日期格式的克隆
	 * 
	 * @param pattern
	 * @return 标准日期格式的克隆
	 */
	public static DateFormat getDateFormatClone(String pattern) {
		/**
		 * 详细设计: 1.返回 DateFormat
		 */
		SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);
		SimpleDateFormat theDateFormat = (SimpleDateFormat) dateFormat.clone();
		theDateFormat.setLenient(false);
		return theDateFormat;
	}

	/**
	 * 比较两个日期对象之间的大小 firstDate早于secondDate
	 * 
	 * @param firstDate,secondDate
	 * @return boolean 如果firstDate早于secondDate,返回true
	 */
	public static boolean compareTwoDate(Date firstDate, Date secondDate,
			String pattern){
		if (firstDate != null && secondDate != null) {
			if (pattern == null || pattern.equals("")) {
				pattern = DateUtil.DATE_DAY_PATTERN;
			}
			firstDate = DateUtil.getDateFormat(firstDate, pattern);
			secondDate = DateUtil.getDateFormat(secondDate, pattern);
			if (firstDate.before(secondDate)) {
				return true;
			} else {
				return false;
			}
		} else {
			return false; 
		}
		

	}

	public static boolean compareTwoDate(Date firstDate, Date secondDate){
		return compareTwoDate(firstDate, secondDate, null);
	}

	/**
	 * 计算两个日期对象之间的天数 secondDate-firstDate
	 * 
	 * @param firstDate,secondDate
	 * @return long
	 */
	public static long CalculateBetweenTwoDate(Date firstDate, Date secondDate)
			throws Exception {
		if (firstDate != null && secondDate != null) {
			long days = 0;
			Date first = DateUtil.getDateFormat(firstDate,
					DateUtil.DATE_DAY_PATTERN);
			Date second = DateUtil.getDateFormat(secondDate,
					DateUtil.DATE_DAY_PATTERN);
			days = (second.getTime() - first.getTime()) / (24 * 60 * 60 * 1000); // getTime()方法返回的是豪秒数
			return days;
		} else {
			throw new Exception("the firstDate or the secondDate null");
		}
	}

	/**
	 * 计算两个日期对象之间的分钟数 secondDate-firstDate
	 * 
	 * @param firstDate,secondDate
	 * @return long
	 */
	public static long CalculateBetweenTwoMin(Date firstDate, Date secondDate)
			throws Exception {
		if (firstDate != null && secondDate != null) {
			long min = 0;
			Date first = DateUtil.getDateFormat(firstDate,
					DateUtil.SECOND_PATTERN);
			Date second = DateUtil.getDateFormat(secondDate,
					DateUtil.SECOND_PATTERN);
			min = (second.getTime() - first.getTime()) / (60 * 1000); // getTime()方法返回的是豪秒数
			return min;
		} else {
			throw new Exception("the firstDate or the secondDate null");
		}
	}
	/**
	 * 计算两个日期对象之间的秒数 secondDate-firstDate
	 * 
	 * @param firstDate,secondDate
	 * @return long
	 */
	public static long CalculateBetweenTwoSec(Date firstDate, Date secondDate)
	throws Exception {
		if (firstDate != null && secondDate != null) {
			long sec = 0;
			Date first = DateUtil.getDateFormat(firstDate,
					DateUtil.SECOND_PATTERN);
			Date second = DateUtil.getDateFormat(secondDate,
					DateUtil.SECOND_PATTERN);
			sec = (second.getTime() - first.getTime()) / (1000); // getTime()方法返回的是豪秒数
			return sec;
		} else {
			throw new Exception("the firstDate or the secondDate null");
		}
	}

	/**
	 * 取得指定日期的所处月份的第一天
	 * 
	 * @param date
	 * @return date
	 */
	public static Date getFirstDayOfMonth(Date date) {
		/**
		 * 详细设计:1.设置为1号
		 */
		GregorianCalendar gc = DateUtil.getGregorianCalendar();
		gc.setTime(date);
		gc.set(Calendar.DAY_OF_MONTH, 1);
		return gc.getTime();
	}

	/**
	 * 传入Date对象实例并取得指定日期的下一个月的第一天
	 * 
	 * @param date
	 * @return date
	 */
	public static Date getFirstDayOfNextMonth(Date date) {
		/**
		 * 详细设计:1.调用getNextMonth设置当前时间 2.以1为基础,调用getFirstDayOfMonth
		 */
		GregorianCalendar gc = DateUtil.getGregorianCalendar();
		gc.setTime(date);
		gc.setTime(DateUtil.getNextMonth(gc.getTime()));
		gc.setTime(DateUtil.getFirstDayOfMonth(gc.getTime()));
		return gc.getTime();
	}

	/**
	 * 取得指定日期的所处星期的第一天
	 * 
	 * @param date
	 * @return date
	 */
	public static Date getFirstDayOfWeek(Date date) {
		/**
		 * 详细设计 1.如果date是星期日,则减0天 2.如果date是星期一,则减1天 3.如果date是星期二,则减2天
		 * 4.如果date是星期三,则减3天 5.如果date是星期四,则减4天 6.如果date是星期五,则减5天
		 * 7.如果date是星期六,则减6天
		 */
		GregorianCalendar gc = DateUtil.getGregorianCalendar();
		gc.setTime(date);
		switch (gc.get(Calendar.DAY_OF_WEEK)) {
		case (Calendar.SUNDAY  ):
			gc.add(Calendar.DATE, 0);
			break;
		case (Calendar.MONDAY  ):
			gc.add(Calendar.DATE, -1);
			break;
		case (Calendar.TUESDAY	):
			gc.add(Calendar.DATE, -2);
			break;
		case (Calendar.WEDNESDAY  ):
			gc.add(Calendar.DATE, -3);
			break;
		case (Calendar.THURSDAY	 ):
			gc.add(Calendar.DATE, -4);
			break;
		case (Calendar.FRIDAY  ):
			gc.add(Calendar.DATE, -5);
			break;
		case (Calendar.SATURDAY	 ):
			gc.add(Calendar.DATE, -6);
			break;
		}
		return gc.getTime();
	}

	/**
	 * 取得指定日期的下一个星期的第一天
	 * 
	 * @param date
	 * @return date
	 */
	public static Date getFirstDayOfNextWeek(Date date) {
		/**
		 * 详细设计:1.调用getNextWeek设置当前时间 2.以1为基础,调用getFirstDayOfWeek
		 */
		GregorianCalendar gc = DateUtil.getGregorianCalendar();
		gc.setTime(date);
		gc.setTime(DateUtil.getNextWeek(gc.getTime()));
		gc.setTime(DateUtil.getFirstDayOfWeek(gc.getTime()));
		return gc.getTime();
	}

	/**
	 * 传入实际的月份,得到当前年份指定月份的最后一天
	 * 
	 * @param month
	 * @return int
	 */
	public static int getLastDayOfMonth(int month) {
		if (month < 1 || month > 12) {
			return -1;
		}
		int retn = 0;
		if (month == 2) {
			if (isLeapYear()) {
				retn = 29;
			} else {
				retn = dayArray[month - 1];
			}
		} else {
			retn = dayArray[month - 1];
		}
		return retn;
	}

	/**
	 * 传入实际的月份和年份,得到指定年份指定月份的最后一天
	 * 
	 * @param month
	 * @return int
	 */
	public static int getLastDayOfMonth(int year, int month) {
		if (month < 1 || month > 12) {
			return -1;
		}
		int retn = 0;
		if (month == 2) {
			if (isLeapYear(year)) {
				retn = 29;
			} else {
				retn = dayArray[month - 1];
			}
		} else {
			retn = dayArray[month - 1];
		}
		return retn;
	}

	/**
	 * 取得指定日期的所处星期的最后一天
	 * 
	 * @param date
	 * @return date
	 */
	public static Date getLastDayOfWeek(Date date) {
		/**
		 * 详细设计: 1.如果date是星期日,则加6天 2.如果date是星期一,则加5天 3.如果date是星期二,则加4天
		 * 4.如果date是星期三,则加3天 5.如果date是星期四,则加2天 6.如果date是星期五,则加1天
		 * 7.如果date是星期六,则加0天
		 */
		GregorianCalendar gc = DateUtil.getGregorianCalendar();
		gc.setTime(date);
		switch (gc.get(Calendar.DAY_OF_WEEK)) {
		case (Calendar.SUNDAY  ):
			gc.add(Calendar.DATE, 6);
			break;
		case (Calendar.MONDAY  ):
			gc.add(Calendar.DATE, 5);
			break;
		case (Calendar.TUESDAY	):
			gc.add(Calendar.DATE, 4);
			break;
		case (Calendar.WEDNESDAY  ):
			gc.add(Calendar.DATE, 3);
			break;
		case (Calendar.THURSDAY	 ):
			gc.add(Calendar.DATE, 2);
			break;
		case (Calendar.FRIDAY  ):
			gc.add(Calendar.DATE, 1);
			break;
		case (Calendar.SATURDAY	 ):
			gc.add(Calendar.DATE, 0);
			break;
		}
		return gc.getTime();
	}

	/**
	 * 取得指定日期的所处月份的最后一天
	 * 
	 * @param date
	 * @return date
	 */
	public static Date getLastDayOfMonth(Date date) {
		/**
		 * 详细设计: 1.如果date在1月,则为31日 2.如果date在2月,则为28日 3.如果date在3月,则为31日
		 * 4.如果date在4月,则为30日 5.如果date在5月,则为31日 6.如果date在6月,则为30日
		 * 7.如果date在7月,则为31日 8.如果date在8月,则为31日 9.如果date在9月,则为30日
		 * 10.如果date在10月,则为31日 11.如果date在11月,则为30日 12.如果date在12月,则为31日
		 * 13.如果date在闰年的2月,则为29日
		 */
		GregorianCalendar gc = DateUtil.getGregorianCalendar();
		gc.setTime(date);
		switch (gc.get(Calendar.MONTH)) {
		case 0:
			gc.set(Calendar.DAY_OF_MONTH, 31);
			break;
		case 1:
			gc.set(Calendar.DAY_OF_MONTH, 28);
			break;
		case 2:
			gc.set(Calendar.DAY_OF_MONTH, 31);
			break;
		case 3:
			gc.set(Calendar.DAY_OF_MONTH, 30);
			break;
		case 4:
			gc.set(Calendar.DAY_OF_MONTH, 31);
			break;
		case 5:
			gc.set(Calendar.DAY_OF_MONTH, 30);
			break;
		case 6:
			gc.set(Calendar.DAY_OF_MONTH, 31);
			break;
		case 7:
			gc.set(Calendar.DAY_OF_MONTH, 31);
			break;
		case 8:
			gc.set(Calendar.DAY_OF_MONTH, 30);
			break;
		case 9:
			gc.set(Calendar.DAY_OF_MONTH, 31);
			break;
		case 10:
			gc.set(Calendar.DAY_OF_MONTH, 30);
			break;
		case 11:
			gc.set(Calendar.DAY_OF_MONTH, 31);
			break;
		}
		// 检查闰年
		if ((gc.get(Calendar.MONTH) == Calendar.FEBRUARY)
				&& (isLeapYear(gc.get(Calendar.YEAR)))) {
			gc.set(Calendar.DAY_OF_MONTH, 29);
		}
		return gc.getTime();
	}

	/**
	 * 传入Date对象实例并取得指定日期的下一个月的最后一天
	 * 
	 * @param date
	 * @return date
	 */
	public static Date getLastDayOfNextMonth(Date date) {
		/**
		 * 详细设计:1.调用getNextMonth设置当前时间 2.以1为基础,调用getLastDayOfMonth
		 */
		GregorianCalendar gc = DateUtil.getGregorianCalendar();
		gc.setTime(date);
		gc.setTime(DateUtil.getNextMonth(gc.getTime()));
		gc.setTime(DateUtil.getLastDayOfMonth(gc.getTime()));
		return gc.getTime();
	}

	/**
	 * 传入Date对象实例并取得指定日期的下一个星期的最后一天
	 * 
	 * @param date
	 * @return date
	 */
	public static Date getLastDayOfNextWeek(Date date) {
		/**
		 * 详细设计:1.调用getNextWeek设置当前时间 2.以1为基础,调用getLastDayOfWeek
		 */
		GregorianCalendar gc = DateUtil.getGregorianCalendar();
		gc.setTime(date);
		gc.setTime(DateUtil.getNextWeek(gc.getTime()));
		gc.setTime(DateUtil.getLastDayOfWeek(gc.getTime()));
		return gc.getTime();
	}

	/**
	 * 传入Date对象实例并得到指定日期的前一个工作日
	 * 
	 * @param date
	 * @return Date
	 */
	public static Date getPreviousWeekDay(Date date) {
		/**
		 * 详细设计:1.如果date是星期一,则减3天 2.如果date是星期日,则减2天 3.否则减1天
		 */
		GregorianCalendar gc = DateUtil.getGregorianCalendar();
		gc.setTime(date);
		switch (gc.get(Calendar.DAY_OF_WEEK)) {
		case (Calendar.MONDAY):
			gc.add(Calendar.DATE, -3);
			break;
		case (Calendar.SUNDAY):
			gc.add(Calendar.DATE, -2);
			break;
		default:
			gc.add(Calendar.DATE, -1);
			break;
		}
		return gc.getTime();
	}

	/**
	 * 传入Date对象实例并得到指定日期的下一个工作日
	 * 
	 * @param date
	 * @return Date
	 */
	public static Date getNextWeekDay(Date date) {
		/**
		 * 详细设计:1.如果date是星期五,则加3天 2.如果date是星期六,则加2天 3.否则加1天
		 */
		GregorianCalendar gc = DateUtil.getGregorianCalendar();
		gc.setTime(date);
		switch (gc.get(Calendar.DAY_OF_WEEK)) {
		case (Calendar.FRIDAY):
			gc.add(Calendar.DATE, 3);
			break;
		case (Calendar.SATURDAY):
			gc.add(Calendar.DATE, 2);
			break;
		default:
			gc.add(Calendar.DATE, 1);
			break;
		}
		return gc.getTime();
	}

	/**
	 * 取得指定日期的下一个月
	 * 
	 * @param date
	 * @return date
	 */
	public static Date getNextMonth(Date date) {
		/**
		 * 详细设计:1.指定日期的月份加1
		 */
		GregorianCalendar gc = DateUtil.getGregorianCalendar();
		gc.setTime(date);
		gc.add(Calendar.MONTH, 1);
		return gc.getTime();
	}

	/**
	 * 取得指定日期的下一天
	 * 
	 * @param date
	 * @return date
	 */
	public static Date getNextDay(Date date) {
		/**
		 * 详细设计:1.指定日期加1天
		 */
		GregorianCalendar gc = DateUtil.getGregorianCalendar();
		gc.setTime(date);
		gc.add(Calendar.DATE, 1);
		return gc.getTime();
	}

	/**
	 * 取得指定日期加几天
	 * 
	 * @param date
	 * @return date
	 */
	public static Date getNextDay(Date date, int day) {
		/**
		 * 详细设计:1.指定日期加1天
		 */
		GregorianCalendar gc = DateUtil.getGregorianCalendar();
		gc.setTime(date);
		gc.add(Calendar.DATE, day);
		return gc.getTime();
	}

	/**
	 * 取得指定日期的下一个星期
	 * 
	 * @param date
	 * @return date
	 */
	public static Date getNextWeek(Date date) {
		/**
		 * 详细设计:1.指定日期加7天
		 */
		GregorianCalendar gc = DateUtil.getGregorianCalendar();
		gc.setTime(date);
		gc.add(Calendar.DATE, 7);
		return gc.getTime();
	}

	/**
	 * 判断当前是否为闰年
	 * 
	 * @return boolean
	 */
	public static boolean isLeapYear() {
		Calendar cal = DateUtil.getCalendar();
		int year = cal.get(Calendar.YEAR);
		return isLeapYear(year);
	}

	/**
	 * 判断指定的年份是否为闰年
	 * 
	 * @return boolean
	 */
	public static boolean isLeapYear(int year) {
		/**
		 * 详细设计: 1.被400整除是闰年,否则: 2.不能被4整除则不是闰年 3.能被4整除同时不能被100整除则是闰年
		 * 4.能被4整除同时能被100整除则不是闰年
		 */
		if ((year % 400) == 0)
			return true;
		else if ((year % 4) == 0) {
			if ((year % 100) == 0)
				return false;
			else
				return true;
		} else
			return false;
	}

	/**
	 * 传入Date对象实例并判断是否是闰年
	 * 
	 * @param date
	 * @return boolean
	 */
	public static boolean isLeapYear(Date date) {
		/**
		 * 详细设计: 1.被400整除是闰年,否则: 2.不能被4整除则不是闰年 3.能被4整除同时不能被100整除则是闰年
		 * 4.能被4整除同时能被100整除则不是闰年
		 */
		// int year = date.getYear();
		GregorianCalendar gc = DateUtil.getGregorianCalendar();
		gc.setTime(date);
		int year = gc.get(Calendar.YEAR);
		return isLeapYear(year);
	}
	
	/**
	 * 获取2个日期的小时插
	 * @param startTime
	 * @param endTime
	 * @param format
	 * @return
	 */
	public static long dateDiffHour(String startTime, String endTime, String format){
		SimpleDateFormat sd = new SimpleDateFormat(format);
		long nd = 1000*24*60*60;//一天的毫秒数
		long nh = 1000*60*60;//一小时的毫秒数
		long hour = 0;
		try {
			long diff = sd.parse(endTime).getTime() - sd.parse(startTime).getTime();
			long day = diff/nd;//计算差多少天
			hour = diff%nd/nh;//计算差多少小时
			hour = hour+(day*24);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return hour;
	}
	
	/**
	 * 传入年、月获取其最后一天的日期
	 * @param year
	 * @param month
	 * @return
	 */
	public static Date getLastDateByYearMonth(int year,int month){
		int day = getLastDayOfMonth(year, month);
		String strDate = year+"-"+month+"-"+day;
		return parseDateFormat(strDate, DATE_DAY_PATTERN);
	}
	
	public static Date getFirstDateByYearMonth(int year,int month){
		String strDate = year+"-"+month;
		return getFirstDayOfMonth(DateUtil.parseDateFormat(strDate, MONTH_PATTERN));
	}
	/**
	 * 时间固定格式化：  yyyy-MM-dd HH:mm:ss
	 * @param date
	 * @return
	 */
	public static String formatDate(Date date){
	    if (null!=date){
	    	return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date);  
	    }
	    return null;
	 }
	
	/**
	 * 时间固定格式转换：CCYYMMDDHHMM
	 * @author Shoven.Jiang  
	 * @date 2018年9月7日
	 * @param date
	 * @return
	 */
	public static String formateDateCCYYMMDDHHMM(Date date) {
		if (null != date) {
			return new SimpleDateFormat(ORA_DATE_TIME_FORMAT).format(date);
		}
		return null;
	}
	
	/**
	 * 时间固定格式转换：CCYYMMDD
	 * @author Shoven.Jiang  
	 * @date 2018年9月7日
	 * @param date
	 * @return
	 */
	public static String formateDateCCYYMMDD(Date date) {
		if (null != date) {
			return new SimpleDateFormat(ORA_DATE_FORMAT).format(date);
		}
		return null;
	}
	/**
	 * 将国际化日期(Thu May 28 18:23:17 CST 2017)转换为日期类型
	 * @Title: formatDateByInternational 
	 * @author Harley
	 * @throws ParseException 
	 * @date 2017年5月26日
	 */
	public static String formatDateByInternational(String dateParent) throws ParseException {
		SimpleDateFormat internationalFormat = new SimpleDateFormat("EEE MMM dd HH:mm:ss z yyyy", Locale.ENGLISH);
		SimpleDateFormat StringFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return StringFormat.format(internationalFormat.parse(dateParent));
	}
	
	/**
	 * 重写list的排序方法，对多个时间进行排序
	 * @author Shoven.Jiang  
	 * @date 2018年9月20日
	 * @param dateList
	 * @return
	 */
	public static Date getMastDateByList(List<Date> dateList) {
		Date date = null;
		Collections.sort(dateList, new Comparator<Date>() {
			@Override
			public int compare(Date o1, Date o2) {
				if (DateUtil.compareTwoDate(o1, o2)) {
					return 1;
				} else {
					return 0;
				}
			};
		});
		if (EmptyUtils.isNotEmpty(dateList)) {
			date = dateList.get(0);
		}
		return date;
	}
}
