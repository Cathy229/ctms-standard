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
public class MD55 {
	   private final static String[] hexDigits = {"0","1","2","3","4","5","6","7","8","9","A","B","C","D","E","F"}; 
	   
	    /**把inputString加密*/ 
	    public static String md5(String inputStr){ 
	        return encodeByMD5(inputStr); 
	    } 
	    
	    
	    public static void main(String[] args) {
	    	String md5 = md5("62d4adfc-ec46-4d46-9326-9f27eb5f117667845359-b5da-441d-8d1e-80e927df61e5210918070998s");
	    	System.out.println(md5);
	    }
	    /** 
	    * 验证输入的密码是否正确 
	    * @param password 真正的密码（加密后的真密码） 
	    * @param inputString 输入的字符串 
	    * @return 验证结果，boolean类型 
	    */ 
	    public static boolean authenticatePassword(String password,String inputString){ 
	        if(password.equals(encodeByMD5(inputString))){ 
	            return true; 
	        }else{ 
	            return false; 
	        } 
	    } 
	 
	    /**对字符串进行MD5编码*/ 
	    private static String encodeByMD5(String originString){ 
	        if (originString!=null) { 
	            try { 
	                //创建具有指定算法名称的信息摘要 
	                MessageDigest md5 = MessageDigest.getInstance("MD5"); 
	                //使用指定的字节数组对摘要进行最后更新，然后完成摘要计算 
	                byte[] results = md5.digest(originString.getBytes()); 
	                //将得到的字节数组变成字符串返回  
	                String result = byteArrayToHexString(results); 
	                return result; 
	            } catch (Exception e) { 
	                e.printStackTrace(); 
	            } 
	        } 
	        return null; 
	    } 
	 
	    /** 
	    * 轮换字节数组为十六进制字符串 
	    * @param b 字节数组 
	    * @return 十六进制字符串 
	    */ 
	    private static String byteArrayToHexString(byte[] b){ 
	        StringBuffer resultSb = new StringBuffer(); 
	        for(int i=0;i<b.length;i++){ 
	            resultSb.append(byteToHexString(b[i])); 
	        } 
	        return resultSb.toString(); 
	    } 
	 
	    //将一个字节转化成十六进制形式的字符串 
	    private static String byteToHexString(byte b){ 
	        int n = b; 
	        if(n<0) 
	        n=256+n; 
	        int d1 = n/16; 
	        int d2 = n%16; 
	        return hexDigits[d1] + hexDigits[d2]; 
	    } 
}
