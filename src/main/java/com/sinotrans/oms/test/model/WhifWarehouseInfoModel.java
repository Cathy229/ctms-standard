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
 * Model class for WhifWarehouseInfo
 */
@Entity
@Table(name = "whif_warehouse_info")
public class WhifWarehouseInfoModel extends BaseModel implements OperationLog {

	//whifId
	private Integer whifId;
	//whifBswhId
	private Integer whifBswhId;
	//whifNum
	private Double whifNum;
	//whifUpdateTime
	private Date whifUpdateTime;
	//whifStatus
	private Integer whifStatus;
	//whifAddress
	private String whifAddress;
	//whifMemo
	private String whifMemo;
	//creator
	private String creator;
	//createTime
	private Date createTime;
	//modifier
	private String modifier;
	//modifyTime
	private Date modifyTime;
	//recVer
	private Integer recVer;

	/**
	 * Get whifId
	 */
	@Column(name = "whif_id")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getWhifId() {
		return whifId;
	}

	/**
	 * Set whifId
	 */
	public void setWhifId(Integer whifId) {
		this.whifId = whifId;
		addValidField("whifId");
	}

	/**
	 * Get whifBswhId
	 */
	@Column(name = "whif_bswh_id")
	public Integer getWhifBswhId() {
		return whifBswhId;
	}

	/**
	 * Set whifBswhId
	 */
	public void setWhifBswhId(Integer whifBswhId) {
		this.whifBswhId = whifBswhId;
		addValidField("whifBswhId");
	}

	/**
	 * Get whifNum
	 */
	@Column(name = "whif_num")
	public Double getWhifNum() {
		return whifNum;
	}

	/**
	 * Set whifNum
	 */
	public void setWhifNum(Double whifNum) {
		this.whifNum = whifNum;
		addValidField("whifNum");
	}

	/**
	 * Get whifUpdateTime
	 */
	@Column(name = "whif_update_time")
	public Date getWhifUpdateTime() {
		return whifUpdateTime;
	}

	/**
	 * Set whifUpdateTime
	 */
	public void setWhifUpdateTime(Date whifUpdateTime) {
		this.whifUpdateTime = whifUpdateTime;
		addValidField("whifUpdateTime");
	}

	/**
	 * Get whifStatus
	 */
	@Column(name = "whif_status")
	public Integer getWhifStatus() {
		return whifStatus;
	}

	/**
	 * Set whifStatus
	 */
	public void setWhifStatus(Integer whifStatus) {
		this.whifStatus = whifStatus;
		addValidField("whifStatus");
	}

	/**
	 * Get whifAddress
	 */
	@Column(name = "whif_address")
	public String getWhifAddress() {
		return whifAddress;
	}

	/**
	 * Set whifAddress
	 */
	public void setWhifAddress(String whifAddress) {
		this.whifAddress = whifAddress;
		addValidField("whifAddress");
	}

	/**
	 * Get whifMemo
	 */
	@Column(name = "whif_memo")
	public String getWhifMemo() {
		return whifMemo;
	}

	/**
	 * Set whifMemo
	 */
	public void setWhifMemo(String whifMemo) {
		this.whifMemo = whifMemo;
		addValidField("whifMemo");
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
