package com.sinotrans.oms.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sinotrans.framework.orm.model.BaseModel;


/**
 * Model class for BsrfRoleFunctions
 */
@Entity
@Table(name = "bsrf_role_functions")
public class BsrfRoleFunctionsModel extends BaseModel {

	//bsrfId
	private Integer bsrfId;
	//bsrfBsroId
	private Integer bsrfBsroId;
	//bsrfBsfnId
	private Integer bsrfBsfnId;

	/**
	 * Get bsrfId
	 */
	@Column(name = "bsrf_id")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getBsrfId() {
		return bsrfId;
	}

	/**
	 * Set bsrfId
	 */
	public void setBsrfId(Integer bsrfId) {
		this.bsrfId = bsrfId;
		addValidField("bsrfId");
	}

	/**
	 * Get bsrfBsroId
	 */
	@Column(name = "bsrf_bsro_id")
	public Integer getBsrfBsroId() {
		return bsrfBsroId;
	}

	/**
	 * Set bsrfBsroId
	 */
	public void setBsrfBsroId(Integer bsrfBsroId) {
		this.bsrfBsroId = bsrfBsroId;
		addValidField("bsrfBsroId");
	}

	/**
	 * Get bsrfBsfnId
	 */
	@Column(name = "bsrf_bsfn_id")
	public Integer getBsrfBsfnId() {
		return bsrfBsfnId;
	}

	/**
	 * Set bsrfBsfnId
	 */
	public void setBsrfBsfnId(Integer bsrfBsfnId) {
		this.bsrfBsfnId = bsrfBsfnId;
		addValidField("bsrfBsfnId");
	}

}
