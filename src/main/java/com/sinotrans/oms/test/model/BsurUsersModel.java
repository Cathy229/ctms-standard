package com.sinotrans.oms.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sinotrans.framework.orm.model.BaseModel;


/**
 * Model class for BsurUsers
 */
@Entity
@Table(name = "bsur_users")
public class BsurUsersModel extends BaseModel {

	//bsurId
	private Integer bsurId;
	//bsurUsername
	private String bsurUsername;
	//bsurPassword
	private String bsurPassword;

	/**
	 * Get bsurId
	 */
	@Column(name = "bsur_id")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getBsurId() {
		return bsurId;
	}

	/**
	 * Set bsurId
	 */
	public void setBsurId(Integer bsurId) {
		this.bsurId = bsurId;
		addValidField("bsurId");
	}

	/**
	 * Get bsurUsername
	 */
	@Column(name = "bsur_username")
	public String getBsurUsername() {
		return bsurUsername;
	}

	/**
	 * Set bsurUsername
	 */
	public void setBsurUsername(String bsurUsername) {
		this.bsurUsername = bsurUsername;
		addValidField("bsurUsername");
	}

	/**
	 * Get bsurPassword
	 */
	@Column(name = "bsur_password")
	public String getBsurPassword() {
		return bsurPassword;
	}

	/**
	 * Set bsurPassword
	 */
	public void setBsurPassword(String bsurPassword) {
		this.bsurPassword = bsurPassword;
		addValidField("bsurPassword");
	}

}
