package com.sinotrans.oms.businessrequest.dto;

import java.util.Collection;

import javax.persistence.Transient;

import com.sinotrans.oms.businessrequest.model.EoRequestSeaborneModel;
/**
 * <p>Description: 海运请求维护entity</p>
 * @author 
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本    	    修改人   			修改日期   		修改内容
 * 2012.11.3	   huangjunming  	2012.11.3		create
 *  </pre>
 */
public class EoRequestSeaborneDto extends EoRequestSeaborneModel {

	
	/**
	* 请求物料信息
	*/
	@Transient
	private Collection eoEoom2EoseList;
	
	/**
	* 请求集装箱预配信息 
	*/
	@Transient
	private Collection eoEose2EosrList;
	/**
	* 请求集装箱信息
	*/
	@Transient
	private Collection eoEose2EoocList;
	/**
	 * 订单号
	 */
	@Transient
	private String eoorOrderNo;
	/**
	 * 订单笔次
	 */
	@Transient
	private String eoorOrderFudeji;
	
	@Transient
	private Long eoorEsdeId;

	public Long getEoorEsdeId() {
		return eoorEsdeId;
	}

	public void setEoorEsdeId(Long eoorEsdeId) {
		this.eoorEsdeId = eoorEsdeId;
	}
	
	public Collection getEoEoom2EoseList() {
		return eoEoom2EoseList;
	}
	public void setEoEoom2EoseList(Collection eoEoom2EoseList) {
		this.eoEoom2EoseList = eoEoom2EoseList;
	}
	public Collection getEoEose2EosrList() {
		return eoEose2EosrList;
	}
	public void setEoEose2EosrList(Collection eoEose2EosrList) {
		this.eoEose2EosrList = eoEose2EosrList;
	}
	public Collection getEoEose2EoocList() {
		return eoEose2EoocList;
	}
	public void setEoEose2EoocList(Collection eoEose2EoocList) {
		this.eoEose2EoocList = eoEose2EoocList;
	}
	public String getEoorOrderNo() {
		return eoorOrderNo;
	}
	public void setEoorOrderNo(String eoorOrderNo) {
		this.eoorOrderNo = eoorOrderNo;
	}
	public String getEoorOrderFudeji() {
		return eoorOrderFudeji;
	}
	public void setEoorOrderFudeji(String eoorOrderFudeji) {
		this.eoorOrderFudeji = eoorOrderFudeji;
	}

	
}
