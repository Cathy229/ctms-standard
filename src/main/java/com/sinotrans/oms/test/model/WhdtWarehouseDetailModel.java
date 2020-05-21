package com.sinotrans.oms.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sinotrans.framework.orm.model.BaseModel;

/**
 * Model class for WhdtWarehouseDetail
 */
@Entity
@Table(name = "whdt_warehouse_detail")
public class WhdtWarehouseDetailModel extends BaseModel {

	//whdtId
	private Integer whdtId;
	//whdtBswhId
	private Integer whdtBswhId;
	//whdtBswpId
	private Integer whdtBswpId;
	//whdtCapacity
	private Double whdtCapacity;

	/**
	 * Get whdtId
	 */
	@Column(name = "whdt_id")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getWhdtId() {
		return whdtId;
	}

	/**
	 * Set whdtId
	 */
	public void setWhdtId(Integer whdtId) {
		this.whdtId = whdtId;
		addValidField("whdtId");
	}

	/**
	 * Get whdtBswhId
	 */
	@Column(name = "whdt_bswh_id")
	public Integer getWhdtBswhId() {
		return whdtBswhId;
	}

	/**
	 * Set whdtBswhId
	 */
	public void setWhdtBswhId(Integer whdtBswhId) {
		this.whdtBswhId = whdtBswhId;
		addValidField("whdtBswhId");
	}

	/**
	 * Get whdtBswpId
	 */
	@Column(name = "whdt_bswp_id")
	public Integer getWhdtBswpId() {
		return whdtBswpId;
	}

	/**
	 * Set whdtBswpId
	 */
	public void setWhdtBswpId(Integer whdtBswpId) {
		this.whdtBswpId = whdtBswpId;
		addValidField("whdtBswpId");
	}

	/**
	 * Get whdtCapacity
	 */
	@Column(name = "whdt_capacity")
	public Double getWhdtCapacity() {
		return whdtCapacity;
	}

	/**
	 * Set whdtCapacity
	 */
	public void setWhdtCapacity(Double whdtCapacity) {
		this.whdtCapacity = whdtCapacity;
		addValidField("whdtCapacity");
	}

}
