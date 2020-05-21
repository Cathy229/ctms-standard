package com.sinotrans.oms.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sinotrans.framework.orm.model.BaseModel;

/**
 * Model class for FjWorktype
 */
@Entity
@Table(name = "fj_worktype")
public class FjWorktypeModel extends BaseModel {

	//主键
	private String id;
	//typename
	private String typename;
	//catelog
	private String catelog;

	/**
	 * Get 主键
	 */
	@Column(name = "ID")
	@Id @GeneratedValue(generator = "UUIDGenerator")
	public String getId() {
		return id;
	}

	/**
	 * Set 主键
	 */
	public void setId(String id) {
		this.id = id;
		addValidField("id");
	}

	/**
	 * Get typename
	 */
	@Column(name = "TYPENAME")
	public String getTypename() {
		return typename;
	}

	/**
	 * Set typename
	 */
	public void setTypename(String typename) {
		this.typename = typename;
		addValidField("typename");
	}

	/**
	 * Get catelog
	 */
	@Column(name = "CATELOG")
	public String getCatelog() {
		return catelog;
	}

	/**
	 * Set catelog
	 */
	public void setCatelog(String catelog) {
		this.catelog = catelog;
		addValidField("catelog");
	}

}
