package com.sinotrans.oms.businessrequest.dto;

import com.sinotrans.framework.orm.model.BaseModel;

/**
 * 
 * <p>Description: 委托报关请求查询结果
 *    
 * </p>
 *
 * @author shoven
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本     修改人   	修改日期   	修改内容
 * 2018年8月9日     shoven       	               创建
 * 
 * 
 * </pre>
 */
public class EoDeclarationDeputeListQueryItem extends BaseModel {

	/**
     * 订单编号
     */
	private String eoorOrderNo;
	/**
     * 外运号
     */
	private String eoorSinoNo;
	/**
	 * 报关行
	 */
	private String eoddCustomsBroker;
	/**
	 * 报关联系人
	 */
	private String eoddCustomsBrokerContact;
	/**
	 * 报关Id
	 */
	private String eoddId;
	
	public String getEoddId() {
		return eoddId;
	}
	public void setEoddId(String eoddId) {
		this.eoddId = eoddId;
	}
	/**
	 * 报关联系人
	 */
	private String eoddDeclareCustom;
	/**
	 * 出口日期
	 */
	private String eoddIeDate;
	/**
	 * 申报日期
	 */
	private String eoddFilingDate;
	/**
	 * 出境关别
	 */
	private String eoddPortCode;
	/**
	 * 离境口岸
	 */
	private String eoddDepartureProt;
	/**
	 * 查验时间
	 */
	private String eoddInspectionDate;
	/**
	 * 放行时间
	 */
	private String eoddReleaseDate;
	/**
	 * 报关请求状态
	 */
	private String eoddStatus;
	
	public String getEoddCustomsBroker() {
		return eoddCustomsBroker;
	}
	public void setEoddCustomsBroker(String eoddCustomsBroker) {
		this.eoddCustomsBroker = eoddCustomsBroker;
	}
	public String getEoddCustomsBrokerContact() {
		return eoddCustomsBrokerContact;
	}
	public void setEoddCustomsBrokerContact(String eoddCustomsBrokerContact) {
		this.eoddCustomsBrokerContact = eoddCustomsBrokerContact;
	}
	public String getEoddDeclareCustom() {
		return eoddDeclareCustom;
	}
	public void setEoddDeclareCustom(String eoddDeclareCustom) {
		this.eoddDeclareCustom = eoddDeclareCustom;
	}
	public String getEoddIeDate() {
		return eoddIeDate;
	}
	public void setEoddIeDate(String eoddIeDate) {
		this.eoddIeDate = eoddIeDate;
	}
	public String getEoddFilingDate() {
		return eoddFilingDate;
	}
	public void setEoddFilingDate(String eoddFilingDate) {
		this.eoddFilingDate = eoddFilingDate;
	}
	public String getEoddPortCode() {
		return eoddPortCode;
	}
	public void setEoddPortCode(String eoddPortCode) {
		this.eoddPortCode = eoddPortCode;
	}
	public String getEoddDepartureProt() {
		return eoddDepartureProt;
	}
	public void setEoddDepartureProt(String eoddDepartureProt) {
		this.eoddDepartureProt = eoddDepartureProt;
	}
	public String getEoddInspectionDate() {
		return eoddInspectionDate;
	}
	public void setEoddInspectionDate(String eoddInspectionDate) {
		this.eoddInspectionDate = eoddInspectionDate;
	}
	public String getEoddReleaseDate() {
		return eoddReleaseDate;
	}
	public void setEoddReleaseDate(String eoddReleaseDate) {
		this.eoddReleaseDate = eoddReleaseDate;
	}
	public String getEoddStatus() {
		return eoddStatus;
	}
	public void setEoddStatus(String eoddStatus) {
		this.eoddStatus = eoddStatus;
	}
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
}
