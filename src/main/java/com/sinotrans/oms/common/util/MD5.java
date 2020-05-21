package com.sinotrans.oms.common.util;

import java.security.MessageDigest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Description:
 * 
 * @author Jim.li
 * @version Oct 9, 20089:23:00 AM
 */
public class MD5 {
	private static final Log logger = LogFactory.getLog(MD5.class);

	/**
	 * 加密
	 * 
	 * @param s
	 *            需要加密的字符串
	 * @return 加密完后的密码
	 */
	public final static String encode(String s) {
		char hexDigits[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9',
				'a', 'b', 'c', 'd', 'e', 'f' };
		try {
			byte[] strTemp = s.getBytes();
			MessageDigest mdTemp = MessageDigest.getInstance("MD5");
			mdTemp.update(strTemp);
			byte[] md = mdTemp.digest();
			int j = md.length;
			char str[] = new char[j * 2];
			int k = 0;
			for (int i = 0; i < j; i++) {
				byte byte0 = md[i];
				str[k++] = hexDigits[byte0 >>> 4 & 0xf];
				str[k++] = hexDigits[byte0 & 0xf];
			}
			String str1 = new String(str);
			String str2 = new String();
			for (int i = 8; i < 24; i++) {

				str2 = str2 + str1.charAt(i);
			}
			return str2;
		} catch (Exception e) {
			return null;
		}
	}

	/**
	 * 测试
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		logger.debug(MD5.encode("1234"));
	}
}
