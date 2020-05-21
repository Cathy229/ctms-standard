package com.sinotrans.oms.eoorder.dto;

import java.io.Serializable;
/**
 * 
 * @Date 2018年9月5日 下午6:19:37
 * @Title: OrderPrecontainerQueryItem.java
 * @Author Simon Guo
 * @Description: 拼接查询已下达箱型
 */
public class OrderPrecontainerQueryItem implements Serializable{
	
	private String eootSizeAndStandard;

	public String getEootSizeAndStandard() {
		return eootSizeAndStandard;
	}

	public void setEootSizeAndStandard(String eootSizeAndStandard) {
		this.eootSizeAndStandard = eootSizeAndStandard;
	}
	
	
}
