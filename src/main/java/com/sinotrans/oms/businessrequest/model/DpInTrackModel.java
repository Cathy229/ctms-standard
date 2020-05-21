package com.sinotrans.oms.businessrequest.model;

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
 * Model class for DpInTrack
 */
@Entity
@Table(name = "DP_IN_TRACK")
public class DpInTrackModel extends BaseModel implements OperationLog {

	//dpitId
	private Long dpitId;
	//dpitOrderId
	private Long dpitOrderId;
	//dpitType
	private Long dpitType;
	//dpitBridId
	private Long dpitBridId;
	//dpitOperatorTime
	private Date dpitOperatorTime;
	//dpitOperator
	private String dpitOperator;
	//recVer
	private Long recVer;
	//creator
	private String creator;
	//createTime
	private Date createTime;
	//modifier
	private String modifier;
	//modifyTime
	private Date modifyTime;

	/**
	 * Get dpitId
	 */
	@Column(name = "DPIT_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getDpitId() {
		return dpitId;
	}

	/**
	 * Set dpitId
	 */
	public void setDpitId(Long dpitId) {
		this.dpitId = dpitId;
		addValidField("dpitId");
	}

	/**
	 * Get dpitOrderId
	 */
	@Column(name = "DPIT_ORDER_ID")
	public Long getDpitOrderId() {
		return dpitOrderId;
	}

	/**
	 * Set dpitOrderId
	 */
	public void setDpitOrderId(Long dpitOrderId) {
		this.dpitOrderId = dpitOrderId;
		addValidField("dpitOrderId");
	}

	/**
	 * Get dpitType
	 */
	@Column(name = "DPIT_TYPE")
	public Long getDpitType() {
		return dpitType;
	}

	/**
	 * Set dpitType
	 */
	public void setDpitType(Long dpitType) {
		this.dpitType = dpitType;
		addValidField("dpitType");
	}

	/**
	 * Get dpitBridId
	 */
	@Column(name = "DPIT_BRID_ID")
	public Long getDpitBridId() {
		return dpitBridId;
	}

	/**
	 * Set dpitBridId
	 */
	public void setDpitBridId(Long dpitBridId) {
		this.dpitBridId = dpitBridId;
		addValidField("dpitBridId");
	}

	/**
	 * Get dpitOperatorTime
	 */
	@Column(name = "DPIT_OPERATOR_TIME")
	public Date getDpitOperatorTime() {
		return dpitOperatorTime;
	}

	/**
	 * Set dpitOperatorTime
	 */
	public void setDpitOperatorTime(Date dpitOperatorTime) {
		this.dpitOperatorTime = dpitOperatorTime;
		addValidField("dpitOperatorTime");
	}

	/**
	 * Get dpitOperator
	 */
	@Column(name = "DPIT_OPERATOR")
	public String getDpitOperator() {
		return dpitOperator;
	}

	/**
	 * Set dpitOperator
	 */
	public void setDpitOperator(String dpitOperator) {
		this.dpitOperator = dpitOperator;
		addValidField("dpitOperator");
	}

	/**
	 * Get recVer
	 */
	@Column(name = "REC_VER")
	@Version
	public Long getRecVer() {
		return recVer;
	}

	/**
	 * Set recVer
	 */
	public void setRecVer(Long recVer) {
		this.recVer = recVer;
		addValidField("recVer");
	}

	/**
	 * Get creator
	 */
	@Column(name = "CREATOR")
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
	 * Get createTime
	 */
	@Column(name = "CREATE_TIME")
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
	 * Get modifier
	 */
	@Column(name = "MODIFIER")
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
	 * Get modifyTime
	 */
	@Column(name = "MODIFY_TIME")
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

}
