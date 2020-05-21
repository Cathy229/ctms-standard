package com.sinotrans.oms.test.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import com.sinotrans.framework.orm.model.BaseModel;
import com.sinotrans.framework.orm.model.OperationLog;


/**
 * Model class for BswhWarehouse
 */
@Entity
@Table(name = "bswh_warehouse")
public class BswhWarehouseModel extends BaseModel implements OperationLog {

	//bswhId
	private Integer bswhId;
	//bswhName
	private String bswhName;
	//bswhEnName
	private String bswhEnName;
	//bswhStatus
	private Integer bswhStatus;
	//bswhCreateTime
	private Date bswhCreateTime;
	//createTime
	private Date createTime;
	//creator
	private String creator;
	//modifyTime
	private Date modifyTime;
	//modifier
	private String modifier;
	//recVer
	private Integer recVer;

	/**
	 * Get bswhId
	 */
	@Column(name = "bswh_id")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getBswhId() {
		return bswhId;
	}

	/**
	 * Set bswhId
	 */
	public void setBswhId(Integer bswhId) {
		this.bswhId = bswhId;
		addValidField("bswhId");
	}

	/**
	 * Get bswhName
	 */
	@Column(name = "bswh_name")
	public String getBswhName() {
		return bswhName;
	}

	/**
	 * Set bswhName
	 */
	public void setBswhName(String bswhName) {
		this.bswhName = bswhName;
		addValidField("bswhName");
	}

	/**
	 * Get bswhEnName
	 */
	@Column(name = "bswh_en_name")
	public String getBswhEnName() {
		return bswhEnName;
	}

	/**
	 * Set bswhEnName
	 */
	public void setBswhEnName(String bswhEnName) {
		this.bswhEnName = bswhEnName;
		addValidField("bswhEnName");
	}

	/**
	 * Get bswhStatus
	 */
	@Column(name = "bswh_status")
	public Integer getBswhStatus() {
		return bswhStatus;
	}

	/**
	 * Set bswhStatus
	 */
	public void setBswhStatus(Integer bswhStatus) {
		this.bswhStatus = bswhStatus;
		addValidField("bswhStatus");
	}

	/**
	 * Get bswhCreateTime
	 */
	@Column(name = "bswh_create_time")
	public Date getBswhCreateTime() {
		return bswhCreateTime;
	}

	/**
	 * Set bswhCreateTime
	 */
	public void setBswhCreateTime(Date bswhCreateTime) {
		this.bswhCreateTime = bswhCreateTime;
		addValidField("bswhCreateTime");
	}

	/**
	 * Get createTime
	 */
	@Column(name = "create_time")
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * Set createTime
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
		addValidField("createTime");
	}

	/**
	 * Get creator
	 */
	@Column(name = "creator")
	public String getCreator() {
		return creator;
	}

	/**
	 * Set creator
	 */
	public void setCreator(String creator) {
		this.creator = creator;
		addValidField("creator");
	}

	/**
	 * Get modifyTime
	 */
	@Column(name = "modify_time")
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * Set modifyTime
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
		addValidField("modifyTime");
	}

	/**
	 * Get modifier
	 */
	@Column(name = "modifier")
	public String getModifier() {
		return modifier;
	}

	/**
	 * Set modifier
	 */
	public void setModifier(String modifier) {
		this.modifier = modifier;
		addValidField("modifier");
	}

	/**
	 * Get recVer
	 */
	@Column(name = "rec_ver")
	@Version
	public Integer getRecVer() {
		return recVer;
	}

	/**
	 * Set recVer
	 */
	public void setRecVer(Integer recVer) {
		this.recVer = recVer;
		addValidField("recVer");
	}

}
