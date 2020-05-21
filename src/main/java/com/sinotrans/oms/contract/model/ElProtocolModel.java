package com.sinotrans.oms.contract.model;

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
 * Model class for ElProtocol
 */
@Entity
@Table(name = "EL_PROTOCOL")
public class ElProtocolModel extends BaseModel implements OperationLog {

	//elplId
	private Long elplId;
	//elplNo
	private String elplNo;
	//elplName
	private String elplName;
	//elplStatus
	private String elplStatus;
	//elplModel
	private String elplModel;
	//elplType
	private String elplType;
	//elplCustomerEbcuId
	private Long elplCustomerEbcuId;
	//elplCustomerEbcuName
	private String elplCustomerEbcuName;
	//elplEffectiveDateFrom
	private Date elplEffectiveDateFrom;
	//elplEffectiveDateTo
	private Date elplEffectiveDateTo;
	//elplRemarks
	private String elplRemarks;
	//recVer
	private Long recVer;
	//creator
	private String creator;
	//createTime
	private Date createTime;
	//modifier
	private String modifier;
	//modifyTime
	private Date modifyTime;
	//elplSubstr1
	private String elplSubstr1;
	//elplSubstr2
	private String elplSubstr2;
	//elplSubdate1
	private Date elplSubdate1;
	//elplSubdate2
	private Date elplSubdate2;
	//elplSubnum1
	private Long elplSubnum1;
	//elplSubnum2
	private Long elplSubnum2;
	//elplEscoId
	private Long elplEscoId;
	//elplCustomerEbcuCode
	private String elplCustomerEbcuCode;
	//elplEbpjId
	private Long elplEbpjId;

	/**
	 * Get elplId
	 */
	@Column(name = "ELPL_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getElplId() {
		return elplId;
	}

	/**
	 * Set elplId
	 */
	public void setElplId(Long elplId) {
		this.elplId = elplId;
		addValidField("elplId");
	}

	/**
	 * Get elplNo
	 */
	@Column(name = "ELPL_NO")
	public String getElplNo() {
		return elplNo;
	}

	/**
	 * Set elplNo
	 */
	public void setElplNo(String elplNo) {
		this.elplNo = elplNo;
		addValidField("elplNo");
	}

	/**
	 * Get elplName
	 */
	@Column(name = "ELPL_NAME")
	public String getElplName() {
		return elplName;
	}

	/**
	 * Set elplName
	 */
	public void setElplName(String elplName) {
		this.elplName = elplName;
		addValidField("elplName");
	}

	/**
	 * Get elplStatus
	 */
	@Column(name = "ELPL_STATUS")
	public String getElplStatus() {
		return elplStatus;
	}

	/**
	 * Set elplStatus
	 */
	public void setElplStatus(String elplStatus) {
		this.elplStatus = elplStatus;
		addValidField("elplStatus");
	}

	/**
	 * Get elplModel
	 */
	@Column(name = "ELPL_MODEL")
	public String getElplModel() {
		return elplModel;
	}

	/**
	 * Set elplModel
	 */
	public void setElplModel(String elplModel) {
		this.elplModel = elplModel;
		addValidField("elplModel");
	}

	/**
	 * Get elplType
	 */
	@Column(name = "ELPL_TYPE")
	public String getElplType() {
		return elplType;
	}

	/**
	 * Set elplType
	 */
	public void setElplType(String elplType) {
		this.elplType = elplType;
		addValidField("elplType");
	}

	/**
	 * Get elplCustomerEbcuId
	 */
	@Column(name = "ELPL_CUSTOMER_EBCU_ID")
	public Long getElplCustomerEbcuId() {
		return elplCustomerEbcuId;
	}

	/**
	 * Set elplCustomerEbcuId
	 */
	public void setElplCustomerEbcuId(Long elplCustomerEbcuId) {
		this.elplCustomerEbcuId = elplCustomerEbcuId;
		addValidField("elplCustomerEbcuId");
	}

	/**
	 * Get elplCustomerEbcuName
	 */
	@Column(name = "ELPL_CUSTOMER_EBCU_NAME")
	public String getElplCustomerEbcuName() {
		return elplCustomerEbcuName;
	}

	/**
	 * Set elplCustomerEbcuName
	 */
	public void setElplCustomerEbcuName(String elplCustomerEbcuName) {
		this.elplCustomerEbcuName = elplCustomerEbcuName;
		addValidField("elplCustomerEbcuName");
	}

	/**
	 * Get elplEffectiveDateFrom
	 */
	@Column(name = "ELPL_EFFECTIVE_DATE_FROM")
	public Date getElplEffectiveDateFrom() {
		return elplEffectiveDateFrom;
	}

	/**
	 * Set elplEffectiveDateFrom
	 */
	public void setElplEffectiveDateFrom(Date elplEffectiveDateFrom) {
		this.elplEffectiveDateFrom = elplEffectiveDateFrom;
		addValidField("elplEffectiveDateFrom");
	}

	/**
	 * Get elplEffectiveDateTo
	 */
	@Column(name = "ELPL_EFFECTIVE_DATE_TO")
	public Date getElplEffectiveDateTo() {
		return elplEffectiveDateTo;
	}

	/**
	 * Set elplEffectiveDateTo
	 */
	public void setElplEffectiveDateTo(Date elplEffectiveDateTo) {
		this.elplEffectiveDateTo = elplEffectiveDateTo;
		addValidField("elplEffectiveDateTo");
	}

	/**
	 * Get elplRemarks
	 */
	@Column(name = "ELPL_REMARKS")
	public String getElplRemarks() {
		return elplRemarks;
	}

	/**
	 * Set elplRemarks
	 */
	public void setElplRemarks(String elplRemarks) {
		this.elplRemarks = elplRemarks;
		addValidField("elplRemarks");
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
	 * Get elplSubstr1
	 */
	@Column(name = "ELPL_SUBSTR1")
	public String getElplSubstr1() {
		return elplSubstr1;
	}

	/**
	 * Set elplSubstr1
	 */
	public void setElplSubstr1(String elplSubstr1) {
		this.elplSubstr1 = elplSubstr1;
		addValidField("elplSubstr1");
	}

	/**
	 * Get elplSubstr2
	 */
	@Column(name = "ELPL_SUBSTR2")
	public String getElplSubstr2() {
		return elplSubstr2;
	}

	/**
	 * Set elplSubstr2
	 */
	public void setElplSubstr2(String elplSubstr2) {
		this.elplSubstr2 = elplSubstr2;
		addValidField("elplSubstr2");
	}

	/**
	 * Get elplSubdate1
	 */
	@Column(name = "ELPL_SUBDATE1")
	public Date getElplSubdate1() {
		return elplSubdate1;
	}

	/**
	 * Set elplSubdate1
	 */
	public void setElplSubdate1(Date elplSubdate1) {
		this.elplSubdate1 = elplSubdate1;
		addValidField("elplSubdate1");
	}

	/**
	 * Get elplSubdate2
	 */
	@Column(name = "ELPL_SUBDATE2")
	public Date getElplSubdate2() {
		return elplSubdate2;
	}

	/**
	 * Set elplSubdate2
	 */
	public void setElplSubdate2(Date elplSubdate2) {
		this.elplSubdate2 = elplSubdate2;
		addValidField("elplSubdate2");
	}

	/**
	 * Get elplSubnum1
	 */
	@Column(name = "ELPL_SUBNUM1")
	public Long getElplSubnum1() {
		return elplSubnum1;
	}

	/**
	 * Set elplSubnum1
	 */
	public void setElplSubnum1(Long elplSubnum1) {
		this.elplSubnum1 = elplSubnum1;
		addValidField("elplSubnum1");
	}

	/**
	 * Get elplSubnum2
	 */
	@Column(name = "ELPL_SUBNUM2")
	public Long getElplSubnum2() {
		return elplSubnum2;
	}

	/**
	 * Set elplSubnum2
	 */
	public void setElplSubnum2(Long elplSubnum2) {
		this.elplSubnum2 = elplSubnum2;
		addValidField("elplSubnum2");
	}

	/**
	 * Get elplEscoId
	 */
	@Column(name = "ELPL_ESCO_ID")
	public Long getElplEscoId() {
		return elplEscoId;
	}

	/**
	 * Set elplEscoId
	 */
	public void setElplEscoId(Long elplEscoId) {
		this.elplEscoId = elplEscoId;
		addValidField("elplEscoId");
	}

	/**
	 * Get elplCustomerEbcuCode
	 */
	@Column(name = "ELPL_CUSTOMER_EBCU_CODE")
	public String getElplCustomerEbcuCode() {
		return elplCustomerEbcuCode;
	}

	/**
	 * Set elplCustomerEbcuCode
	 */
	public void setElplCustomerEbcuCode(String elplCustomerEbcuCode) {
		this.elplCustomerEbcuCode = elplCustomerEbcuCode;
		addValidField("elplCustomerEbcuCode");
	}

	/**
	 * Get elplEbpjId
	 */
	@Column(name = "ELPL_EBPJ_ID")
	public Long getElplEbpjId() {
		return elplEbpjId;
	}

	/**
	 * Set elplEbpjId
	 */
	public void setElplEbpjId(Long elplEbpjId) {
		this.elplEbpjId = elplEbpjId;
		addValidField("elplEbpjId");
	}

}
