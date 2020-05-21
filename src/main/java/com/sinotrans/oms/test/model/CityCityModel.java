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
 * Model class for CityCity
 */
@Entity
@Table(name = "city_city")
public class CityCityModel extends BaseModel implements OperationLog {

	//cityId
	private Integer cityId;
	//cityName
	private String cityName;
	//cityEnName
	private String cityEnName;
	//cityProvId
	private Integer cityProvId;
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
	 * Get cityId
	 */
	@Column(name = "city_id")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getCityId() {
		return cityId;
	}

	/**
	 * Set cityId
	 */
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
		addValidField("cityId");
	}

	/**
	 * Get cityName
	 */
	@Column(name = "city_name")
	public String getCityName() {
		return cityName;
	}

	/**
	 * Set cityName
	 */
	public void setCityName(String cityName) {
		this.cityName = cityName;
		addValidField("cityName");
	}

	/**
	 * Get cityEnName
	 */
	@Column(name = "city_en_name")
	public String getCityEnName() {
		return cityEnName;
	}

	/**
	 * Set cityEnName
	 */
	public void setCityEnName(String cityEnName) {
		this.cityEnName = cityEnName;
		addValidField("cityEnName");
	}

	/**
	 * Get cityProvId
	 */
	@Column(name = "city_prov_id")
	public Integer getCityProvId() {
		return cityProvId;
	}

	/**
	 * Set cityProvId
	 */
	public void setCityProvId(Integer cityProvId) {
		this.cityProvId = cityProvId;
		addValidField("cityProvId");
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
