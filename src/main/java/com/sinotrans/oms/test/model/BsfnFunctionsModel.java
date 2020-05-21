package com.sinotrans.oms.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sinotrans.framework.orm.model.BaseModel;


/**
 * Model class for BsfnFunctions
 */
@Entity
@Table(name = "bsfn_functions")
public class BsfnFunctionsModel extends BaseModel {

	// bsfnId
	private Integer bsfnId;
	// bsfnName
	private String bsfnName;
	// bsfnUrl
	private String bsfnUrl;

	/**
	 * Get bsfnId
	 */
	@Column(name = "bsfn_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getBsfnId() {
		return bsfnId;
	}

	/**
	 * Set bsfnId
	 */
	public void setBsfnId(Integer bsfnId) {
		this.bsfnId = bsfnId;
		addValidField("bsfnId");
	}

	/**
	 * Get bsfnName
	 */
	@Column(name = "bsfn_name")
	public String getBsfnName() {
		return bsfnName;
	}

	/**
	 * Set bsfnName
	 */
	public void setBsfnName(String bsfnName) {
		this.bsfnName = bsfnName;
		addValidField("bsfnName");
	}

	/**
	 * Get bsfnUrl
	 */
	@Column(name = "bsfn_url")
	public String getBsfnUrl() {
		return bsfnUrl;
	}

	/**
	 * Set bsfnUrl
	 */
	public void setBsfnUrl(String bsfnUrl) {
		this.bsfnUrl = bsfnUrl;
		addValidField("bsfnUrl");
	}

}
