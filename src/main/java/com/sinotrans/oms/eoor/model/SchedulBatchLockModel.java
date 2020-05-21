package com.sinotrans.oms.eoor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import com.sinotrans.framework.orm.model.BaseModel;
import com.sinotrans.framework.orm.model.OperationLog;

/**
 * Model class for SchedulBatchLock
 */
@Entity
@Table(name = "SCHEDUL_BATCH_LOCK")
public class SchedulBatchLockModel extends BaseModel implements OperationLog {

	//scblId
	private Integer scblId;
	//scblEscoId
	private Integer scblEscoId;
	//scblBatchNo
	private String scblBatchNo;
	//scblRequestId
	private String scblRequestId;
	//scblIsLock
	private String scblIsLock;
	//recVer
	private Integer recVer;
	//creator
	private String creator;
	//createTime
	private Date createTime;
	//modifier
	private String modifier;
	//modifyTime
	private Date modifyTime;

	/**
	 * Get scblId
	 */
	@Column(name = "SCBL_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getScblId() {
		return scblId;
	}

	/**
	 * Set scblId
	 */
	public void setScblId(Integer scblId) {
		this.scblId = scblId;
		addValidField("scblId");
	}

	/**
	 * Get scblEscoId
	 */
	@Column(name = "SCBL_ESCO_ID")
	public Integer getScblEscoId() {
		return scblEscoId;
	}

	/**
	 * Set scblEscoId
	 */
	public void setScblEscoId(Integer scblEscoId) {
		this.scblEscoId = scblEscoId;
		addValidField("scblEscoId");
	}

	/**
	 * Get scblBatchNo
	 */
	@Column(name = "SCBL_BATCH_NO")
	public String getScblBatchNo() {
		return scblBatchNo;
	}

	/**
	 * Set scblBatchNo
	 */
	public void setScblBatchNo(String scblBatchNo) {
		this.scblBatchNo = scblBatchNo;
		addValidField("scblBatchNo");
	}

	/**
	 * Get scblRequestId
	 */
	@Column(name = "SCBL_REQUEST_ID")
	public String getScblRequestId() {
		return scblRequestId;
	}

	/**
	 * Set scblRequestId
	 */
	public void setScblRequestId(String scblRequestId) {
		this.scblRequestId = scblRequestId;
		addValidField("scblRequestId");
	}

	/**
	 * Get scblIsLock
	 */
	@Column(name = "SCBL_IS_LOCK")
	public String getScblIsLock() {
		return scblIsLock;
	}

	/**
	 * Set scblIsLock
	 */
	public void setScblIsLock(String scblIsLock) {
		this.scblIsLock = scblIsLock;
		addValidField("scblIsLock");
	}

	/**
	 * Get recVer
	 */
	@Column(name = "REC_VER")
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

	/**
	 * Get creator
	 */
	@Column(name = "CREATOR")
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
	@Column(name = "CREATE_TIME")
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
	@Column(name = "MODIFIER")
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
	@Column(name = "MODIFY_TIME")
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

}
