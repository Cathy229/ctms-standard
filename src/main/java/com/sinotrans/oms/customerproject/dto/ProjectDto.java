package com.sinotrans.oms.customerproject.dto;

import java.io.Serializable;
import java.util.List;

public class ProjectDto implements Serializable{
	
	/**
	 * 当前选择项目ID
	 */
	private String projectId;
	/**
	 * 当前选择项目名称
	 */
	private String projectName;
	
	/**
	 * 当前选择公司ID
	 */
	private String orgId;
	/**
	 * 当前选择公司名称
	 */
	private String orgName;
	
	private List projectItem;
	
	private List orgItem;
	
	public List getOrgItem() {
		return orgItem;
	}

	public void setOrgItem(List orgItem) {
		this.orgItem = orgItem;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public String getOrgId() {
		return orgId;
	}

	public void setOrgId(String orgId) {
		this.orgId = orgId;
	}

	public String getOrgName() {
		return orgName;
	}

	public void setOrgName(String orgName) {
		this.orgName = orgName;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public List getProjectItem() {
		return projectItem;
	}

	public void setProjectItem(List projectItem) {
		this.projectItem = projectItem;
	}
	
	

}
