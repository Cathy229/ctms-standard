package com.sinotrans.oms.test.test;

import com.sinotrans.oms.common.nogenerator.NOGeneratorUtil;

/**  
* <p>Title: FlowNumberTest</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月9日  
* @version 1.0  
*/
public class FlowNumberTest {
	public static void main(String[] args) {
		
		String eoorOrderNo = NOGeneratorUtil.currentValue("SO_NO");
		System.out.println(eoorOrderNo);
	}

}
