package com.sinotrans.oms.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sinotrans.framework.orm.model.BaseModel;

/**
 * Model class for BsroRoles
 */
@Entity
@Table(name = "bsro_roles")
public class BsroRolesModel extends BaseModel {

	//bsroId
	private Integer bsroId;
	//bsroName
	private String bsroName;

	/**
	 * Get bsroId
	 */
	@Column(name = "bsro_id")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getBsroId() {
		return bsroId;
	}

	/**
	 * Set bsroId
	 */
	public void setBsroId(Integer bsroId) {
		this.bsroId = bsroId;
		addValidField("bsroId");
	}

	/**
	 * Get bsroName
	 */
	@Column(name = "bsro_name")
	public String getBsroName() {
		return bsroName;
	}

	/**
	 * Set bsroName
	 */
	public void setBsroName(String bsroName) {
		this.bsroName = bsroName;
		addValidField("bsroName");
	}

}
