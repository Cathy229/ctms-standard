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
 * Model class for FjUser
 */
@Entity
@Table(name = "fj_user")
public class FjUserModel extends BaseModel implements OperationLog {

	//fjurId
	private Integer fjurId;
	//fjurUsername
	private String fjurUsername;
	//fjurRealname
	private String fjurRealname;
	//fjurPassword
	private String fjurPassword;
	//fjurFjogId
	private Long fjurFjogId;
	//fjurStatus
	private String fjurStatus;
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

	/**
	 * Get fjurId
	 */
	@Column(name = "fjur_id")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getFjurId() {
		return fjurId;
	}

	/**
	 * Set fjurId
	 */
	public void setFjurId(Integer fjurId) {
		this.fjurId = fjurId;
		addValidField("fjurId");
	}

	/**
	 * Get fjurUsername
	 */
	@Column(name = "fjur_username")
	public String getFjurUsername() {
		return fjurUsername;
	}

	/**
	 * Set fjurUsername
	 */
	public void setFjurUsername(String fjurUsername) {
		this.fjurUsername = fjurUsername;
		addValidField("fjurUsername");
	}

	/**
	 * Get fjurRealname
	 */
	@Column(name = "fjur_realname")
	public String getFjurRealname() {
		return fjurRealname;
	}

	/**
	 * Set fjurRealname
	 */
	public void setFjurRealname(String fjurRealname) {
		this.fjurRealname = fjurRealname;
		addValidField("fjurRealname");
	}

	/**
	 * Get fjurPassword
	 */
	@Column(name = "fjur_password")
	public String getFjurPassword() {
		return fjurPassword;
	}

	/**
	 * Set fjurPassword
	 */
	public void setFjurPassword(String fjurPassword) {
		this.fjurPassword = fjurPassword;
		addValidField("fjurPassword");
	}

	/**
	 * Get fjurFjogId
	 */
	@Column(name = "fjur_fjog_id")
	public Long getFjurFjogId() {
		return fjurFjogId;
	}

	/**
	 * Set fjurFjogId
	 */
	public void setFjurFjogId(Long fjurFjogId) {
		this.fjurFjogId = fjurFjogId;
		addValidField("fjurFjogId");
	}

	/**
	 * Get fjurStatus
	 */
	@Column(name = "fjur_status")
	public String getFjurStatus() {
		return fjurStatus;
	}

	/**
	 * Set fjurStatus
	 */
	public void setFjurStatus(String fjurStatus) {
		this.fjurStatus = fjurStatus;
		addValidField("fjurStatus");
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

}
