package com.sinotrans.oms.system.model;

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
 * Model class for EsUserGroup
 */
@Entity
@Table(name = "ES_USER_GROUP")
public class EsUserGroupModel extends BaseModel implements OperationLog {

	//esugId
	private Long esugId;
	//esugEscoId
	private Long esugEscoId;
	//esugUserGroupCode
	private String esugUserGroupCode;
	//esugUserGroupName
	private String esugUserGroupName;
	//esugIsAdminUserGroup
	private String esugIsAdminUserGroup;
	//esugDesc
	private String esugDesc;
	//esugStatus
	private String esugStatus;
	//esugSubstr1
	private String esugSubstr1;
	//esugSubstr2
	private String esugSubstr2;
	//esugSubstr3
	private String esugSubstr3;
	//esugSubstr4
	private String esugSubstr4;
	//esugSubstr5
	private String esugSubstr5;
	//esugSubstr6
	private String esugSubstr6;
	//esugSubstr7
	private String esugSubstr7;
	//esugSubstr8
	private String esugSubstr8;
	//esugSubdate1
	private Date esugSubdate1;
	//esugSubdate2
	private Date esugSubdate2;
	//esugSubdate3
	private Date esugSubdate3;
	//esugSubdate4
	private Date esugSubdate4;
	//esugSubnum1
	private Long esugSubnum1;
	//esugSubnum2
	private Long esugSubnum2;
	//esugSubnum3
	private Long esugSubnum3;
	//esugSubnum4
	private Long esugSubnum4;
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

	/**
	 * Get esugId
	 */
	@Column(name = "ESUG_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEsugId() {
		return esugId;
	}

	/**
	 * Set esugId
	 */
	public void setEsugId(Long esugId) {
		this.esugId = esugId;
		addValidField("esugId");
	}

	/**
	 * Get esugEscoId
	 */
	@Column(name = "ESUG_ESCO_ID")
	public Long getEsugEscoId() {
		return esugEscoId;
	}

	/**
	 * Set esugEscoId
	 */
	public void setEsugEscoId(Long esugEscoId) {
		this.esugEscoId = esugEscoId;
		addValidField("esugEscoId");
	}

	/**
	 * Get esugUserGroupCode
	 */
	@Column(name = "ESUG_USER_GROUP_CODE")
	public String getEsugUserGroupCode() {
		return esugUserGroupCode;
	}

	/**
	 * Set esugUserGroupCode
	 */
	public void setEsugUserGroupCode(String esugUserGroupCode) {
		this.esugUserGroupCode = esugUserGroupCode;
		addValidField("esugUserGroupCode");
	}

	/**
	 * Get esugUserGroupName
	 */
	@Column(name = "ESUG_USER_GROUP_NAME")
	public String getEsugUserGroupName() {
		return esugUserGroupName;
	}

	/**
	 * Set esugUserGroupName
	 */
	public void setEsugUserGroupName(String esugUserGroupName) {
		this.esugUserGroupName = esugUserGroupName;
		addValidField("esugUserGroupName");
	}

	/**
	 * Get esugIsAdminUserGroup
	 */
	@Column(name = "ESUG_IS_ADMIN_USER_GROUP")
	public String getEsugIsAdminUserGroup() {
		return esugIsAdminUserGroup;
	}

	/**
	 * Set esugIsAdminUserGroup
	 */
	public void setEsugIsAdminUserGroup(String esugIsAdminUserGroup) {
		this.esugIsAdminUserGroup = esugIsAdminUserGroup;
		addValidField("esugIsAdminUserGroup");
	}

	/**
	 * Get esugDesc
	 */
	@Column(name = "ESUG_DESC")
	public String getEsugDesc() {
		return esugDesc;
	}

	/**
	 * Set esugDesc
	 */
	public void setEsugDesc(String esugDesc) {
		this.esugDesc = esugDesc;
		addValidField("esugDesc");
	}

	/**
	 * Get esugStatus
	 */
	@Column(name = "ESUG_STATUS")
	public String getEsugStatus() {
		return esugStatus;
	}

	/**
	 * Set esugStatus
	 */
	public void setEsugStatus(String esugStatus) {
		this.esugStatus = esugStatus;
		addValidField("esugStatus");
	}

	/**
	 * Get esugSubstr1
	 */
	@Column(name = "ESUG_SUBSTR1")
	public String getEsugSubstr1() {
		return esugSubstr1;
	}

	/**
	 * Set esugSubstr1
	 */
	public void setEsugSubstr1(String esugSubstr1) {
		this.esugSubstr1 = esugSubstr1;
		addValidField("esugSubstr1");
	}

	/**
	 * Get esugSubstr2
	 */
	@Column(name = "ESUG_SUBSTR2")
	public String getEsugSubstr2() {
		return esugSubstr2;
	}

	/**
	 * Set esugSubstr2
	 */
	public void setEsugSubstr2(String esugSubstr2) {
		this.esugSubstr2 = esugSubstr2;
		addValidField("esugSubstr2");
	}

	/**
	 * Get esugSubstr3
	 */
	@Column(name = "ESUG_SUBSTR3")
	public String getEsugSubstr3() {
		return esugSubstr3;
	}

	/**
	 * Set esugSubstr3
	 */
	public void setEsugSubstr3(String esugSubstr3) {
		this.esugSubstr3 = esugSubstr3;
		addValidField("esugSubstr3");
	}

	/**
	 * Get esugSubstr4
	 */
	@Column(name = "ESUG_SUBSTR4")
	public String getEsugSubstr4() {
		return esugSubstr4;
	}

	/**
	 * Set esugSubstr4
	 */
	public void setEsugSubstr4(String esugSubstr4) {
		this.esugSubstr4 = esugSubstr4;
		addValidField("esugSubstr4");
	}

	/**
	 * Get esugSubstr5
	 */
	@Column(name = "ESUG_SUBSTR5")
	public String getEsugSubstr5() {
		return esugSubstr5;
	}

	/**
	 * Set esugSubstr5
	 */
	public void setEsugSubstr5(String esugSubstr5) {
		this.esugSubstr5 = esugSubstr5;
		addValidField("esugSubstr5");
	}

	/**
	 * Get esugSubstr6
	 */
	@Column(name = "ESUG_SUBSTR6")
	public String getEsugSubstr6() {
		return esugSubstr6;
	}

	/**
	 * Set esugSubstr6
	 */
	public void setEsugSubstr6(String esugSubstr6) {
		this.esugSubstr6 = esugSubstr6;
		addValidField("esugSubstr6");
	}

	/**
	 * Get esugSubstr7
	 */
	@Column(name = "ESUG_SUBSTR7")
	public String getEsugSubstr7() {
		return esugSubstr7;
	}

	/**
	 * Set esugSubstr7
	 */
	public void setEsugSubstr7(String esugSubstr7) {
		this.esugSubstr7 = esugSubstr7;
		addValidField("esugSubstr7");
	}

	/**
	 * Get esugSubstr8
	 */
	@Column(name = "ESUG_SUBSTR8")
	public String getEsugSubstr8() {
		return esugSubstr8;
	}

	/**
	 * Set esugSubstr8
	 */
	public void setEsugSubstr8(String esugSubstr8) {
		this.esugSubstr8 = esugSubstr8;
		addValidField("esugSubstr8");
	}

	/**
	 * Get esugSubdate1
	 */
	@Column(name = "ESUG_SUBDATE1")
	public Date getEsugSubdate1() {
		return esugSubdate1;
	}

	/**
	 * Set esugSubdate1
	 */
	public void setEsugSubdate1(Date esugSubdate1) {
		this.esugSubdate1 = esugSubdate1;
		addValidField("esugSubdate1");
	}

	/**
	 * Get esugSubdate2
	 */
	@Column(name = "ESUG_SUBDATE2")
	public Date getEsugSubdate2() {
		return esugSubdate2;
	}

	/**
	 * Set esugSubdate2
	 */
	public void setEsugSubdate2(Date esugSubdate2) {
		this.esugSubdate2 = esugSubdate2;
		addValidField("esugSubdate2");
	}

	/**
	 * Get esugSubdate3
	 */
	@Column(name = "ESUG_SUBDATE3")
	public Date getEsugSubdate3() {
		return esugSubdate3;
	}

	/**
	 * Set esugSubdate3
	 */
	public void setEsugSubdate3(Date esugSubdate3) {
		this.esugSubdate3 = esugSubdate3;
		addValidField("esugSubdate3");
	}

	/**
	 * Get esugSubdate4
	 */
	@Column(name = "ESUG_SUBDATE4")
	public Date getEsugSubdate4() {
		return esugSubdate4;
	}

	/**
	 * Set esugSubdate4
	 */
	public void setEsugSubdate4(Date esugSubdate4) {
		this.esugSubdate4 = esugSubdate4;
		addValidField("esugSubdate4");
	}

	/**
	 * Get esugSubnum1
	 */
	@Column(name = "ESUG_SUBNUM1")
	public Long getEsugSubnum1() {
		return esugSubnum1;
	}

	/**
	 * Set esugSubnum1
	 */
	public void setEsugSubnum1(Long esugSubnum1) {
		this.esugSubnum1 = esugSubnum1;
		addValidField("esugSubnum1");
	}

	/**
	 * Get esugSubnum2
	 */
	@Column(name = "ESUG_SUBNUM2")
	public Long getEsugSubnum2() {
		return esugSubnum2;
	}

	/**
	 * Set esugSubnum2
	 */
	public void setEsugSubnum2(Long esugSubnum2) {
		this.esugSubnum2 = esugSubnum2;
		addValidField("esugSubnum2");
	}

	/**
	 * Get esugSubnum3
	 */
	@Column(name = "ESUG_SUBNUM3")
	public Long getEsugSubnum3() {
		return esugSubnum3;
	}

	/**
	 * Set esugSubnum3
	 */
	public void setEsugSubnum3(Long esugSubnum3) {
		this.esugSubnum3 = esugSubnum3;
		addValidField("esugSubnum3");
	}

	/**
	 * Get esugSubnum4
	 */
	@Column(name = "ESUG_SUBNUM4")
	public Long getEsugSubnum4() {
		return esugSubnum4;
	}

	/**
	 * Set esugSubnum4
	 */
	public void setEsugSubnum4(Long esugSubnum4) {
		this.esugSubnum4 = esugSubnum4;
		addValidField("esugSubnum4");
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

}
