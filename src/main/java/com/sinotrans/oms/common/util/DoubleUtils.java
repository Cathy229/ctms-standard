package com.sinotrans.oms.common.util;

import java.math.BigDecimal;

public class DoubleUtils {
	/**  
     * 对Double数据进行取精度.  
     * @param value  double数据.  
     * @param scale  精度位数(保留的小数位数).  
     * @param roundingMode  精度取值方式.  
     * @return 精度计算后的数据.  
     */  
    public static Double round(Double value, int scale, 
             int roundingMode) {
    	Double result=0.0D;
    	if(null!=value){
    		BigDecimal bd = new BigDecimal(value);   
    		bd = bd.setScale(scale, roundingMode);   
    		result= bd.doubleValue();
    	}
        return result;   
    }   


     /** 
     * Double 相加 
     * @param d1 
     * @param d2 
     * @return 
     */ 
    public static Double sum(Double d1,Double d2){
    	Double value=0.0D;
    	if(null!=d1 && null!=d2){
    		BigDecimal bd1 = new BigDecimal(d1.toString()); 
    		BigDecimal bd2 = new BigDecimal(d2.toString()); 
        	value=bd1.add(bd2).doubleValue();
    	}
    	return value;
    } 


    /** 
     * Double 相减 
     * @param d1 
     * @param d2 
     * @return 
     */ 
    public static Double sub(Double d1,Double d2){
    	Double value=0.0D;
    	if(null!=d1 && null!=d2){
    		BigDecimal bd1 = new BigDecimal(d1.toString()); 
    		BigDecimal bd2 = new BigDecimal(d2.toString()); 
	        value=bd1.subtract(bd2).doubleValue();
    	}
    	return value;
    } 

    /** 
     * Double 乘法 
     * @param d1 
     * @param d2 
     * @return 
     */ 
    public static Double mul(Double d1,Double d2){
    	Double value=0.0D;
    	if(null!=d1 && null!=d2){
    		BigDecimal bd1 = new BigDecimal(d1.toString()); 
    		BigDecimal bd2 = new BigDecimal(d2.toString()); 
    		value=bd1.multiply(bd2).doubleValue();
    	}
    	return value;
    } 


    /** 
     * Double 除法 
     * @param d1 
     * @param d2 
     * @param scale 四舍五入 小数点位数 
     * @return 
     */ 
    public static Double div(Double d1,Double d2,int scale){ 
        //  当然在此之前，要判断分母是否为0
    	Double value=0.0D;
    	if(null!=d1 && null!=d2){
	        if(0!=d2){
	    		BigDecimal bd1 = new BigDecimal(d1.toString()); 
	    		BigDecimal bd2 = new BigDecimal(d2.toString()); 
	        	value=bd1.divide(bd2,scale,BigDecimal.ROUND_HALF_UP).doubleValue();
	        	return value;
	        }else{
	        	System.out.println("除数不能为零");
	        	return null;
	        }
    	}
    	return value;
    } 


}
