package com.sinotrans.oms.security.util;

import java.util.List;
import java.util.Map;

import com.sinotrans.oms.common.Constants;

/**
 * 用户登录信息存储类
 * @author Harley 20180725
 *
 */
public class UserDetails extends com.sinotrans.framework.security.authentication.AcegiUserDetails{
	
	/**
	 * 用户中文名称
	 */
	private String userNameCn;
	/**
	 * 用户英文名称
	 */
	private String userNameEn;
	/**
	 * 用户所属部门
	 */
	private String userDeptId;
	/**
	 * 用户默认模板
	 */
	private String userTemplateId;
	/**
	 * 用户邮箱
	 */
	private String userEmail;
	
	/**
	 * 所属公司ID
	 */
	private String ownOrgId;
	/**
	 * 当前选择公司ID
	 */
	private String orgId;
	/**
	 * 当前选择公司名称
	 */
	private String orgName;
	/**
	 * 当前选择公司英文名称
	 */
	private String orgNameEn;
	
	/**
	 * 当前用户所属项目
	 */
	private String ownProjectId;
	/**
	 * 当前选择项目ID
	 */
	private String projectId;
	/**
	 * 当前选择项目名称
	 */
	private String projectName;
	/**
	 * 当前选择项目英文名称
	 */
	private String projectNameEn;
	/**
	 * 当前公司编码
	 */
	private String escoCompanyNo;
	/**
	 * 用户默认基地ID
	 */
	private String esusDefaultEsstId;
	/**
	 * 是否公司超级用户，0：不是；1：是（如果是，权限就会超越项目的限制）
	 */
	private String esusIsSuperuser;
	/**
	 * 如果是公司超级管理员，则为空；如果不是，则存放用户ID
	 */
	private String userIdForNotSuper;
	/**
	 * 登录用户的按钮功能权限
	 */
	private List<?> functionButtons;
	/**
	 *数据权限
	 */
	private Map<String,?> dataPermissionMap;
	
	/** 当前语言**/
	private String language;
	
	/**
	 * token令牌
	 */
	private String accessToken;
	
	//20101012 是否超级用户组
	private Boolean isAdminUserGroup;

	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	/**
	 * 是否超级管理员用户
	 */
	public boolean isAdmin(){
		if(this.getUsername().equals(Constants.ADMIN_USER)){
			return true;
		}
		return false;
	}
	/**
	 * 是否顶级公司
	 */
//	public boolean isTopCompany() {
//		if(orgId.equals(Constants.TOP_COMPANY)){
//			return true;
//		}
//		return false;
//	}
	/**
	 * @return the orgId
	 */
	public String getOrgId() {
		return orgId;
	}

	/**
	 * @param orgId the orgId to set
	 */
	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}


	/**
	 * @return the userDeptId
	 */
	public String getUserDeptId() {
		return userDeptId;
	}
	
	/**
	 * @return the userTemplateId
	 */
	public String getUserTemplateId() {
		return userTemplateId;
	}
	
	/**
	 * @return the userEmail
	 */
	public String getUserEmail() {
		return userEmail;
	}

	/**
	 * @return the userNameCn
	 */
	public String getUserNameCn() {
		return userNameCn;
	}
	
	/**
	 * @return the userNameEn
	 */
	public String getUserNameEn() {
		return userNameEn;
	}

	/**
	 * @param userDeptId the userDeptId to set
	 */
	public void setUserDeptId(String userDeptId) {
		this.userDeptId = userDeptId;
	}
	
	/**
	 * @param userTemplateId the userTemplateId to set
	 */
	public void setUserTemplateId(String userTemplateId) {
		this.userTemplateId = userTemplateId;
	}
	
	/**
	 * @param userEmail the userEmail to set
	 */
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	/**
	 * @param userNameCn the userNameCn to set
	 */
	public void setUserNameCn(String userNameCn) {
		this.userNameCn = userNameCn;
	}
	
	/**
	 * @param userNameEn the userNameEn to set
	 */
	public void setUserNameEn(String userNameEn) {
		this.userNameEn = userNameEn;
	}

	/**
	 * @return the functionButtons
	 */
	public List<?> getFunctionButtons() {
		return functionButtons;
	}

	/**
	 * @param functionButtons the functionButtons to set
	 */
	public void setFunctionButtons(List<?> functionButtons) {
		this.functionButtons = functionButtons;
	}
	/**
	 * @return the ownOrgId
	 */
	public String getOwnOrgId() {
		return ownOrgId;
	}
	/**
	 * @param ownOrgId the ownOrgId to set
	 */
	public void setOwnOrgId(String ownOrgId) {
		this.ownOrgId = ownOrgId;
	}
	/**
	 * @return the orgName
	 */
	public String getOrgName() {
		return orgName;
	}
	/**
	 * @return the projectName
	 */
	public String getProjectName() {
		return projectName;
	}
	/**
	 * @return the projectId
	 */
	public String getProjectId() {
		return projectId;
	}
	/**
	 * @param orgName the orgName to set
	 */
	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}
	/**
	 * @param projectName the projectName to set
	 */
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	/**
	 * @param projectId the projectId to set
	 */
	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}
	/**
	 * @return the ownProjectId
	 */
	public String getOwnProjectId() {
		return ownProjectId;
	}
	/**
	 * @param ownProjectId the ownProjectId to set
	 */
	public void setOwnProjectId(String ownProjectId) {
		this.ownProjectId = ownProjectId;
	}
	/**
	 * @return the dataPermissionMap
	 */
	public Map<String,?> getDataPermissionMap() {
		return dataPermissionMap;
	}
	/**
	 * @param dataPermissionMap the dataPermissionMap to set
	 */
	public void setDataPermissionMap(Map<String,?> dataPermissionMap) {
		this.dataPermissionMap = dataPermissionMap;
	}
	/**
	 * @return the escoCompanyNo
	 */
	public String getEscoCompanyNo() {
		return escoCompanyNo;
	}
	/**
	 * @param escoCompanyNo the escoCompanyNo to set
	 */
	public void setEscoCompanyNo(String escoCompanyNo) {
		this.escoCompanyNo = escoCompanyNo;
	}
	public String getEsusDefaultEsstId() {
		return esusDefaultEsstId;
	}
	public void setEsusDefaultEsstId(String esusDefaultEsstId) {
		this.esusDefaultEsstId = esusDefaultEsstId;
	}
	public String getOrgNameEn() {
		return orgNameEn;
	}
	public void setOrgNameEn(String orgNameEn) {
		this.orgNameEn = orgNameEn;
	}
	public String getProjectNameEn() {
		return projectNameEn;
	}
	public void setProjectNameEn(String projectNameEn) {
		this.projectNameEn = projectNameEn;
	}
	public Boolean getIsAdminUserGroup() {
		return isAdminUserGroup;
	}
	public void setIsAdminUserGroup(Boolean isAdminUserGroup) {
		this.isAdminUserGroup = isAdminUserGroup;
	}
	public String getEsusIsSuperuser() {
		return esusIsSuperuser;
	}
	public void setEsusIsSuperuser(String esusIsSuperuser) {
		this.esusIsSuperuser = esusIsSuperuser;
	}
	public String getUserIdForNotSuper() {
		return userIdForNotSuper;
	}
	public void setUserIdForNotSuper(String userIdForNotSuper) {
		this.userIdForNotSuper = userIdForNotSuper;
	}
	@Override
	public String toString() {
		return "UserDetails [userNameCn=" + userNameCn + ", userNameEn=" + userNameEn + ", userDeptId=" + userDeptId
				+ ", userTemplateId=" + userTemplateId + ", userEmail=" + userEmail + ", ownOrgId=" + ownOrgId
				+ ", orgId=" + orgId + ", orgName=" + orgName + ", orgNameEn=" + orgNameEn + ", ownProjectId="
				+ ownProjectId + ", projectId=" + projectId + ", projectName=" + projectName + ", projectNameEn="
				+ projectNameEn + ", escoCompanyNo=" + escoCompanyNo + ", esusDefaultEsstId=" + esusDefaultEsstId
				+ ", esusIsSuperuser=" + esusIsSuperuser + ", userIdForNotSuper=" + userIdForNotSuper
				+ ", functionButtons=" + functionButtons + ", dataPermissionMap=" + dataPermissionMap + ", language="
				+ language + ", isAdminUserGroup=" + isAdminUserGroup + "]";
	}
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
}