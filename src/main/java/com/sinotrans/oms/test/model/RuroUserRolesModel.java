package com.sinotrans.oms.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sinotrans.framework.orm.model.BaseModel;


/**
 * Model class for RuroUserRoles
 */
@Entity
@Table(name = "ruro_user_roles")
public class RuroUserRolesModel extends BaseModel {

	//ruroId
	private Integer ruroId;
	//ruroBsurId
	private Integer ruroBsurId;
	//ruroBsroId
	private Integer ruroBsroId;

	/**
	 * Get ruroId
	 */
	@Column(name = "ruro_id")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getRuroId() {
		return ruroId;
	}

	/**
	 * Set ruroId
	 */
	public void setRuroId(Integer ruroId) {
		this.ruroId = ruroId;
		addValidField("ruroId");
	}

	/**
	 * Get ruroBsurId
	 */
	@Column(name = "ruro_bsur_id")
	public Integer getRuroBsurId() {
		return ruroBsurId;
	}

	/**
	 * Set ruroBsurId
	 */
	public void setRuroBsurId(Integer ruroBsurId) {
		this.ruroBsurId = ruroBsurId;
		addValidField("ruroBsurId");
	}

	/**
	 * Get ruroBsroId
	 */
	@Column(name = "ruro_bsro_id")
	public Integer getRuroBsroId() {
		return ruroBsroId;
	}

	/**
	 * Set ruroBsroId
	 */
	public void setRuroBsroId(Integer ruroBsroId) {
		this.ruroBsroId = ruroBsroId;
		addValidField("ruroBsroId");
	}

}
