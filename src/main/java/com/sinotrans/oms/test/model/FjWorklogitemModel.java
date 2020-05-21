package com.sinotrans.oms.test.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import com.sinotrans.framework.orm.model.BaseModel;
import com.sinotrans.framework.orm.model.OperationLog;

/**
 * Model class for FjWorklogitem
 */
@Entity
@Table(name = "fj_worklogitem")
public class FjWorklogitemModel extends BaseModel implements OperationLog {

	//主键
	private String id;
	//worklogId
	private String worklogId;
	//content
	private String content;
	//creator
	private String creator;
	//createTime
	private Date createTime;
	//modifier
	private String modifier;
	//modifyTime
	private Date modifyTime;
	//recVer
	private Long recVer;
	//attribute1
	private String attribute1;
	//attribute2
	private String attribute2;
	//attribute3
	private String attribute3;
	//attribute4
	private Date attribute4;
	//attribute5
	private Date attribute5;
	//attribute6
	private Date attribute6;
	//attribute7
	private Long attribute7;
	//attribute8
	private Long attribute8;

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
	 * Get worklogId
	 */
	@Column(name = "WORKLOG_ID")
	public String getWorklogId() {
		return worklogId;
	}

	/**
	 * Set worklogId
	 */
	public void setWorklogId(String worklogId) {
		this.worklogId = worklogId;
		addValidField("worklogId");
	}

	/**
	 * Get content
	 */
	@Column(name = "CONTENT")
	public String getContent() {
		return content;
	}

	/**
	 * Set content
	 */
	public void setContent(String content) {
		this.content = content;
		addValidField("content");
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

	/**
	 * Get recVer
	 */
	@Column(name = "REC_VER")
	@Version
	public Long getRecVer() {
		return recVer;
	}

	/**
	 * Set recVer
	 */
	public void setRecVer(Long recVer) {
		this.recVer = recVer;
		addValidField("recVer");
	}

	/**
	 * Get attribute1
	 */
	@Column(name = "ATTRIBUTE1")
	public String getAttribute1() {
		return attribute1;
	}

	/**
	 * Set attribute1
	 */
	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
		addValidField("attribute1");
	}

	/**
	 * Get attribute2
	 */
	@Column(name = "ATTRIBUTE2")
	public String getAttribute2() {
		return attribute2;
	}

	/**
	 * Set attribute2
	 */
	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
		addValidField("attribute2");
	}

	/**
	 * Get attribute3
	 */
	@Column(name = "ATTRIBUTE3")
	public String getAttribute3() {
		return attribute3;
	}

	/**
	 * Set attribute3
	 */
	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
		addValidField("attribute3");
	}

	/**
	 * Get attribute4
	 */
	@Column(name = "ATTRIBUTE4")
	public Date getAttribute4() {
		return attribute4;
	}

	/**
	 * Set attribute4
	 */
	public void setAttribute4(Date attribute4) {
		this.attribute4 = attribute4;
		addValidField("attribute4");
	}

	/**
	 * Get attribute5
	 */
	@Column(name = "ATTRIBUTE5")
	public Date getAttribute5() {
		return attribute5;
	}

	/**
	 * Set attribute5
	 */
	public void setAttribute5(Date attribute5) {
		this.attribute5 = attribute5;
		addValidField("attribute5");
	}

	/**
	 * Get attribute6
	 */
	@Column(name = "ATTRIBUTE6")
	public Date getAttribute6() {
		return attribute6;
	}

	/**
	 * Set attribute6
	 */
	public void setAttribute6(Date attribute6) {
		this.attribute6 = attribute6;
		addValidField("attribute6");
	}

	/**
	 * Get attribute7
	 */
	@Column(name = "ATTRIBUTE7")
	public Long getAttribute7() {
		return attribute7;
	}

	/**
	 * Set attribute7
	 */
	public void setAttribute7(Long attribute7) {
		this.attribute7 = attribute7;
		addValidField("attribute7");
	}

	/**
	 * Get attribute8
	 */
	@Column(name = "ATTRIBUTE8")
	public Long getAttribute8() {
		return attribute8;
	}

	/**
	 * Set attribute8
	 */
	public void setAttribute8(Long attribute8) {
		this.attribute8 = attribute8;
		addValidField("attribute8");
	}

}
