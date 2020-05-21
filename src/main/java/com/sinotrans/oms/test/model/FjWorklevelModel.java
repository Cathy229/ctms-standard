package com.sinotrans.oms.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sinotrans.framework.orm.model.BaseModel;

/**
 * Model class for FjWorklevel
 */
@Entity
@Table(name = "fj_worklevel")
public class FjWorklevelModel extends BaseModel {

	//主键
	private String id;
	//工作优先级
	private String workLevel;
	//英文优先级
	private String enLevelName;
	//是否可用
	private String enable;

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
	 * Get 工作优先级
	 */
	@Column(name = "WORK_LEVEL")
	public String getWorkLevel() {
		return workLevel;
	}

	/**
	 * Set 工作优先级
	 */
	public void setWorkLevel(String workLevel) {
		this.workLevel = workLevel;
		addValidField("workLevel");
	}

	/**
	 * Get 英文优先级
	 */
	@Column(name = "EN_LEVEL_NAME")
	public String getEnLevelName() {
		return enLevelName;
	}

	/**
	 * Set 英文优先级
	 */
	public void setEnLevelName(String enLevelName) {
		this.enLevelName = enLevelName;
		addValidField("enLevelName");
	}

	/**
	 * Get 是否可用
	 */
	@Column(name = "ENABLE")
	public String getEnable() {
		return enable;
	}

	/**
	 * Set 是否可用
	 */
	public void setEnable(String enable) {
		this.enable = enable;
		addValidField("enable");
	}

}
