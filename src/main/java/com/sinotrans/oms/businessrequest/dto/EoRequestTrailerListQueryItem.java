package com.sinotrans.oms.businessrequest.dto;

import java.util.Date;

import com.sinotrans.framework.orm.model.BaseModel;

/**
 * 
 * <p>Description: 拖车请求查询结果
 *    
 * </p>
 *
 * @author James
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本     修改人   	修改日期   	修改内容
 * 2018年8月9日     James       	               创建
 * 
 * 
 * </pre>
 */
public class EoRequestTrailerListQueryItem extends BaseModel {
    /**
     * 订单编号
     */
	private String eoorOrderNo;
	/**
     * 外运号
     */
	private String eoorSinoNo;
	/**
     * 请求编号
     */
	private String eoetNo;
	/**
	 * 请求主键
	 */
	private Long eoetId;
	/**
	 * 箱型
	 */
	private String eootStandard;
	/**
	 * 尺寸
	 */
	private String eootSize;
	/**
	 * 提地址
	 */
	private String eootDeliveryPlaceName;
	/**
	 * 提箱地点
	 */
	private String eootSuitcasePlaceName;
	/**
	 * 提箱时间
	 */
	private Date eootContainerTime;
	
	/**
	 * 提货完成时间
	 */
	private Date eootSetPostTime;
	
	public String getEoorOrderNo() {
		return eoorOrderNo;
	}
	public void setEoorOrderNo(String eoorOrderNo) {
		this.eoorOrderNo = eoorOrderNo;
	}
	public String getEoorSinoNo() {
		return eoorSinoNo;
	}
	public void setEoorSinoNo(String eoorSinoNo) {
		this.eoorSinoNo = eoorSinoNo;
	}
	public String getEoetNo() {
		return eoetNo;
	}
	public void setEoetNo(String eoetNo) {
		this.eoetNo = eoetNo;
	}
	public Long getEoetId() {
		return eoetId;
	}
	public void setEoetId(Long eoetId) {
		this.eoetId = eoetId;
	}
	public String getEootStandard() {
		return eootStandard;
	}
	public void setEootStandard(String eootStandard) {
		this.eootStandard = eootStandard;
	}
	public String getEootSize() {
		return eootSize;
	}
	public void setEootSize(String eootSize) {
		this.eootSize = eootSize;
	}
	public String getEootDeliveryPlaceName() {
		return eootDeliveryPlaceName;
	}
	public void setEootDeliveryPlaceName(String eootDeliveryPlaceName) {
		this.eootDeliveryPlaceName = eootDeliveryPlaceName;
	}
	public String getEootSuitcasePlaceName() {
		return eootSuitcasePlaceName;
	}
	public void setEootSuitcasePlaceName(String eootSuitcasePlaceName) {
		this.eootSuitcasePlaceName = eootSuitcasePlaceName;
	}
	public Date getEootContainerTime() {
		return eootContainerTime;
	}
	public void setEootContainerTime(Date eootContainerTime) {
		this.eootContainerTime = eootContainerTime;
	}
	public Date getEootSetPostTime() {
		return eootSetPostTime;
	}
	public void setEootSetPostTime(Date eootSetPostTime) {
		this.eootSetPostTime = eootSetPostTime;
	}

}
