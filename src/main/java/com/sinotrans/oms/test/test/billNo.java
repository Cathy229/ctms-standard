package com.sinotrans.oms.test.test;

import org.springframework.beans.factory.annotation.Autowired;

import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.nogenerator.NOGeneratorUtil;
import com.sinotrans.oms.system.manager.EsCounterManager;

/**  
* <p>Title: billNo</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月20日  
* @version 1.0  
*/
public class billNo {
	@Autowired
	private static  EsCounterManager esCounterManager;
	public static void main(String[] args) {
		get();
	}
	
	public static String get() {
		NOGeneratorUtil NOGeneratorUtil = new NOGeneratorUtil();
		String eoorOrderNo = NOGeneratorUtil.currentValue(Constants.ORDER_NO_NAME);
		System.out.println(eoorOrderNo);
		return eoorOrderNo;
	}

}
