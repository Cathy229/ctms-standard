package com.sinotrans.oms.system.dto;

import com.sinotrans.framework.orm.model.BaseModel;

public class EsLoginSessionInfoQueryItem extends BaseModel {

	private Long esusId;
	private Long esusEscoId;
	private Long esusEsdeId;
	private String esusLoginName;
	private String esusLoginPwd;
	private String esusTemplateId;
	private String esusEmail;
	private String esusUserNameCn;
	private String esusUserNameEn;
	private String escoCompanyNameCn;
	//公司英文名称
	private String escoCompanyNameEn;
	private Long esusDefaultEsstId;
	/**
	 * 公司编码
	 */
	private String escoCompanyNo;
	
	public Long getEsusId() {
		return esusId;
	}
	public void setEsusId(Long esusId) {
		this.esusId = esusId;
	}
	public Long getEsusEscoId() {
		return esusEscoId;
	}
	public void setEsusEscoId(Long esusEscoId) {
		this.esusEscoId = esusEscoId;
	}
	public Long getEsusEsdeId() {
		return esusEsdeId;
	}
	public void setEsusEsdeId(Long esusEsdeId) {
		this.esusEsdeId = esusEsdeId;
	}
	public String getEsusLoginName() {
		return esusLoginName;
	}
	public void setEsusLoginName(String esusLoginName) {
		this.esusLoginName = esusLoginName;
	}
	public String getEsusLoginPwd() {
		return esusLoginPwd;
	}
	public void setEsusLoginPwd(String esusLoginPwd) {
		this.esusLoginPwd = esusLoginPwd;
	}
	public String getEsusTemplateId() {
		return esusTemplateId;
	}
	public void setEsusTemplateId(String esusTemplateId) {
		this.esusTemplateId = esusTemplateId;
	}
	public String getEsusEmail() {
		return esusEmail;
	}
	public void setEsusEmail(String esusEmail) {
		this.esusEmail = esusEmail;
	}
	public String getEsusUserNameCn() {
		return esusUserNameCn;
	}
	public void setEsusUserNameCn(String esusUserNameCn) {
		this.esusUserNameCn = esusUserNameCn;
	}
	public String getEsusUserNameEn() {
		return esusUserNameEn;
	}
	public void setEsusUserNameEn(String esusUserNameEn) {
		this.esusUserNameEn = esusUserNameEn;
	}
	public String getEscoCompanyNameCn() {
		return escoCompanyNameCn;
	}
	public void setEscoCompanyNameCn(String escoCompanyNameCn) {
		this.escoCompanyNameCn = escoCompanyNameCn;
	}
	public String getEscoCompanyNameEn() {
		return escoCompanyNameEn;
	}
	public void setEscoCompanyNameEn(String escoCompanyNameEn) {
		this.escoCompanyNameEn = escoCompanyNameEn;
	}
	public Long getEsusDefaultEsstId() {
		return esusDefaultEsstId;
	}
	public void setEsusDefaultEsstId(Long esusDefaultEsstId) {
		this.esusDefaultEsstId = esusDefaultEsstId;
	}
	public String getEscoCompanyNo() {
		return escoCompanyNo;
	}
	public void setEscoCompanyNo(String escoCompanyNo) {
		this.escoCompanyNo = escoCompanyNo;
	}
}
