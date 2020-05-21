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
 * Model class for ProvProvince
 */
@Entity
@Table(name = "prov_province")
public class ProvProvinceModel extends BaseModel implements OperationLog {

	//provId
	private Integer provId;
	//provName
	private String provName;
	//provEnName
	private String provEnName;
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
	 * Get provId
	 */
	@Column(name = "prov_id")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getProvId() {
		return provId;
	}

	/**
	 * Set provId
	 */
	public void setProvId(Integer provId) {
		this.provId = provId;
		addValidField("provId");
	}

	/**
	 * Get provName
	 */
	@Column(name = "prov_name")
	public String getProvName() {
		return provName;
	}

	/**
	 * Set provName
	 */
	public void setProvName(String provName) {
		this.provName = provName;
		addValidField("provName");
	}

	/**
	 * Get provEnName
	 */
	@Column(name = "prov_en_name")
	public String getProvEnName() {
		return provEnName;
	}

	/**
	 * Set provEnName
	 */
	public void setProvEnName(String provEnName) {
		this.provEnName = provEnName;
		addValidField("provEnName");
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
