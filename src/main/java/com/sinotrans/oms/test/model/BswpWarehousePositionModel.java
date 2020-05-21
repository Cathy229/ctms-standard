package com.sinotrans.oms.test.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sinotrans.framework.orm.model.BaseModel;

/**
 * Model class for BswpWarehousePosition
 */
@Entity
@Table(name = "bswp_warehouse_position")
public class BswpWarehousePositionModel extends BaseModel {

	// bswpId
	private Integer bswpId;
	// bswpBswhId
	private Integer bswpBswhId;
	// bswpName
	private String bswpName;
	// bswpNameEn
	private String bswpNameEn;

	/**
	 * Get bswpId
	 */
	@Column(name = "bswp_id")
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public Integer getBswpId() {
		return bswpId;
	}

	/**
	 * Set bswpId
	 */
	public void setBswpId(Integer bswpId) {
		this.bswpId = bswpId;
		addValidField("bswpId");
	}

	/**
	 * Get bswpBswhId
	 */
	@Column(name = "bswp_bswh_id")
	public Integer getBswpBswhId() {
		return bswpBswhId;
	}

	/**
	 * Set bswpBswhId
	 */
	public void setBswpBswhId(Integer bswpBswhId) {
		this.bswpBswhId = bswpBswhId;
		addValidField("bswpBswhId");
	}

	/**
	 * Get bswpName
	 */
	@Column(name = "bswp_name")
	public String getBswpName() {
		return bswpName;
	}

	/**
	 * Set bswpName
	 */
	public void setBswpName(String bswpName) {
		this.bswpName = bswpName;
		addValidField("bswpName");
	}

	/**
	 * Get bswpNameEn
	 */
	@Column(name = "bswp_name_en")
	public String getBswpNameEn() {
		return bswpNameEn;
	}

	/**
	 * Set bswpNameEn
	 */
	public void setBswpNameEn(String bswpNameEn) {
		this.bswpNameEn = bswpNameEn;
		addValidField("bswpNameEn");
	}

}
