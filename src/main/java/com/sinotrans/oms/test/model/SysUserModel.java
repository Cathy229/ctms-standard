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
 * Model class for SysUser
 */
@Entity
@Table(name = "sys_user")
public class SysUserModel extends BaseModel implements OperationLog {

	//oid
	private String oid;
	//公司
	private String usrOrgOid;
	//公司类型
	private String usrOrgType;
	//用户名
	private String usrUserName;
	//用户备注
	private String usrRemark;
	//用户密码
	private String usrPassword;
	//用户全称
	private String usrRealName;
	//邮件
	private String usrEmail;
	//电话
	private String usrPhone;
	//手机
	private String usrMobile;
	//登陆次数
	private String usrLoginCounter;
	//最后登陆时间
	private Date usrLastLoginTime;
	//是否删除
	private String usrIsDeleted;
	//是否管理员
	private String usrIsAdmin;
	//usrMsgUsername
	private String usrMsgUsername;
	//传真
	private String usrFax;
	//系统字段_创建人
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
	 * Get oid
	 */
	@Column(name = "OID")
	@Id @GeneratedValue(generator = "UUIDGenerator")
	public String getOid() {
		return oid;
	}

	/**
	 * Set oid
	 */
	public void setOid(String oid) {
		this.oid = oid;
		addValidField("oid");
	}

	/**
	 * Get 公司
	 */
	@Column(name = "USR_ORG_OID")
	public String getUsrOrgOid() {
		return usrOrgOid;
	}

	/**
	 * Set 公司
	 */
	public void setUsrOrgOid(String usrOrgOid) {
		this.usrOrgOid = usrOrgOid;
		addValidField("usrOrgOid");
	}

	/**
	 * Get 公司类型
	 */
	@Column(name = "USR_ORG_TYPE")
	public String getUsrOrgType() {
		return usrOrgType;
	}

	/**
	 * Set 公司类型
	 */
	public void setUsrOrgType(String usrOrgType) {
		this.usrOrgType = usrOrgType;
		addValidField("usrOrgType");
	}

	/**
	 * Get 用户名
	 */
	@Column(name = "USR_USER_NAME")
	public String getUsrUserName() {
		return usrUserName;
	}

	/**
	 * Set 用户名
	 */
	public void setUsrUserName(String usrUserName) {
		this.usrUserName = usrUserName;
		addValidField("usrUserName");
	}

	/**
	 * Get 用户备注
	 */
	@Column(name = "USR_REMARK")
	public String getUsrRemark() {
		return usrRemark;
	}

	/**
	 * Set 用户备注
	 */
	public void setUsrRemark(String usrRemark) {
		this.usrRemark = usrRemark;
		addValidField("usrRemark");
	}

	/**
	 * Get 用户密码
	 */
	@Column(name = "USR_PASSWORD")
	public String getUsrPassword() {
		return usrPassword;
	}

	/**
	 * Set 用户密码
	 */
	public void setUsrPassword(String usrPassword) {
		this.usrPassword = usrPassword;
		addValidField("usrPassword");
	}

	/**
	 * Get 用户全称
	 */
	@Column(name = "USR_REAL_NAME")
	public String getUsrRealName() {
		return usrRealName;
	}

	/**
	 * Set 用户全称
	 */
	public void setUsrRealName(String usrRealName) {
		this.usrRealName = usrRealName;
		addValidField("usrRealName");
	}

	/**
	 * Get 邮件
	 */
	@Column(name = "USR_EMAIL")
	public String getUsrEmail() {
		return usrEmail;
	}

	/**
	 * Set 邮件
	 */
	public void setUsrEmail(String usrEmail) {
		this.usrEmail = usrEmail;
		addValidField("usrEmail");
	}

	/**
	 * Get 电话
	 */
	@Column(name = "USR_PHONE")
	public String getUsrPhone() {
		return usrPhone;
	}

	/**
	 * Set 电话
	 */
	public void setUsrPhone(String usrPhone) {
		this.usrPhone = usrPhone;
		addValidField("usrPhone");
	}

	/**
	 * Get 手机
	 */
	@Column(name = "USR_MOBILE")
	public String getUsrMobile() {
		return usrMobile;
	}

	/**
	 * Set 手机
	 */
	public void setUsrMobile(String usrMobile) {
		this.usrMobile = usrMobile;
		addValidField("usrMobile");
	}

	/**
	 * Get 登陆次数
	 */
	@Column(name = "USR_LOGIN_COUNTER")
	public String getUsrLoginCounter() {
		return usrLoginCounter;
	}

	/**
	 * Set 登陆次数
	 */
	public void setUsrLoginCounter(String usrLoginCounter) {
		this.usrLoginCounter = usrLoginCounter;
		addValidField("usrLoginCounter");
	}

	/**
	 * Get 最后登陆时间
	 */
	@Column(name = "USR_LAST_LOGIN_TIME")
	public Date getUsrLastLoginTime() {
		return usrLastLoginTime;
	}

	/**
	 * Set 最后登陆时间
	 */
	public void setUsrLastLoginTime(Date usrLastLoginTime) {
		this.usrLastLoginTime = usrLastLoginTime;
		addValidField("usrLastLoginTime");
	}

	/**
	 * Get 是否删除
	 * selectCode.yesNo
	 */
	@Column(name = "USR_IS_DELETED")
	public String getUsrIsDeleted() {
		return usrIsDeleted;
	}

	/**
	 * Set 是否删除
	 * selectCode.yesNo
	 */
	public void setUsrIsDeleted(String usrIsDeleted) {
		this.usrIsDeleted = usrIsDeleted;
		addValidField("usrIsDeleted");
	}

	/**
	 * Get 是否管理员
	 * selectCode.yesNo
	 */
	@Column(name = "USR_IS_ADMIN")
	public String getUsrIsAdmin() {
		return usrIsAdmin;
	}

	/**
	 * Set 是否管理员
	 * selectCode.yesNo
	 */
	public void setUsrIsAdmin(String usrIsAdmin) {
		this.usrIsAdmin = usrIsAdmin;
		addValidField("usrIsAdmin");
	}

	/**
	 * Get usrMsgUsername
	 */
	@Column(name = "USR_MSG_USERNAME")
	public String getUsrMsgUsername() {
		return usrMsgUsername;
	}

	/**
	 * Set usrMsgUsername
	 */
	public void setUsrMsgUsername(String usrMsgUsername) {
		this.usrMsgUsername = usrMsgUsername;
		addValidField("usrMsgUsername");
	}

	/**
	 * Get 传真
	 */
	@Column(name = "USR_FAX")
	public String getUsrFax() {
		return usrFax;
	}

	/**
	 * Set 传真
	 */
	public void setUsrFax(String usrFax) {
		this.usrFax = usrFax;
		addValidField("usrFax");
	}

	/**
	 * Get 系统字段_创建人
	 */
	@Column(name = "CREATOR")
	public String getCreator() {
		return creator;
	}

	/**
	 * Set 系统字段_创建人
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

}
