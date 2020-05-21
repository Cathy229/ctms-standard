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
 * Model class for EsRole
 */
@Entity
@Table(name = "ES_ROLE")
public class EsRoleModel extends BaseModel implements OperationLog {

	//esroId
	private Long esroId;
	//esroEscoId
	private Long esroEscoId;
	//esroRoleCode
	private String esroRoleCode;
	//esroRoleName
	private String esroRoleName;
	//esroDesc
	private String esroDesc;
	//esroStatus
	private String esroStatus;
	//esroSubstr1
	private String esroSubstr1;
	//esroSubstr2
	private String esroSubstr2;
	//esroSubstr3
	private String esroSubstr3;
	//esroSubstr4
	private String esroSubstr4;
	//esroSubstr5
	private String esroSubstr5;
	//esroSubstr6
	private String esroSubstr6;
	//esroSubstr7
	private String esroSubstr7;
	//esroSubstr8
	private String esroSubstr8;
	//esroSubdate1
	private Date esroSubdate1;
	//esroSubdate2
	private Date esroSubdate2;
	//esroSubdate3
	private Date esroSubdate3;
	//esroSubdate4
	private Date esroSubdate4;
	//esroSubnum1
	private Long esroSubnum1;
	//esroSubnum2
	private Long esroSubnum2;
	//esroSubnum3
	private Long esroSubnum3;
	//esroSubnum4
	private Long esroSubnum4;
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
	 * Get esroId
	 */
	@Column(name = "ESRO_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEsroId() {
		return esroId;
	}

	/**
	 * Set esroId
	 */
	public void setEsroId(Long esroId) {
		this.esroId = esroId;
		addValidField("esroId");
	}

	/**
	 * Get esroEscoId
	 */
	@Column(name = "ESRO_ESCO_ID")
	public Long getEsroEscoId() {
		return esroEscoId;
	}

	/**
	 * Set esroEscoId
	 */
	public void setEsroEscoId(Long esroEscoId) {
		this.esroEscoId = esroEscoId;
		addValidField("esroEscoId");
	}

	/**
	 * Get esroRoleCode
	 */
	@Column(name = "ESRO_ROLE_CODE")
	public String getEsroRoleCode() {
		return esroRoleCode;
	}

	/**
	 * Set esroRoleCode
	 */
	public void setEsroRoleCode(String esroRoleCode) {
		this.esroRoleCode = esroRoleCode;
		addValidField("esroRoleCode");
	}

	/**
	 * Get esroRoleName
	 */
	@Column(name = "ESRO_ROLE_NAME")
	public String getEsroRoleName() {
		return esroRoleName;
	}

	/**
	 * Set esroRoleName
	 */
	public void setEsroRoleName(String esroRoleName) {
		this.esroRoleName = esroRoleName;
		addValidField("esroRoleName");
	}

	/**
	 * Get esroDesc
	 */
	@Column(name = "ESRO_DESC")
	public String getEsroDesc() {
		return esroDesc;
	}

	/**
	 * Set esroDesc
	 */
	public void setEsroDesc(String esroDesc) {
		this.esroDesc = esroDesc;
		addValidField("esroDesc");
	}

	/**
	 * Get esroStatus
	 */
	@Column(name = "ESRO_STATUS")
	public String getEsroStatus() {
		return esroStatus;
	}

	/**
	 * Set esroStatus
	 */
	public void setEsroStatus(String esroStatus) {
		this.esroStatus = esroStatus;
		addValidField("esroStatus");
	}

	/**
	 * Get esroSubstr1
	 */
	@Column(name = "ESRO_SUBSTR1")
	public String getEsroSubstr1() {
		return esroSubstr1;
	}

	/**
	 * Set esroSubstr1
	 */
	public void setEsroSubstr1(String esroSubstr1) {
		this.esroSubstr1 = esroSubstr1;
		addValidField("esroSubstr1");
	}

	/**
	 * Get esroSubstr2
	 */
	@Column(name = "ESRO_SUBSTR2")
	public String getEsroSubstr2() {
		return esroSubstr2;
	}

	/**
	 * Set esroSubstr2
	 */
	public void setEsroSubstr2(String esroSubstr2) {
		this.esroSubstr2 = esroSubstr2;
		addValidField("esroSubstr2");
	}

	/**
	 * Get esroSubstr3
	 */
	@Column(name = "ESRO_SUBSTR3")
	public String getEsroSubstr3() {
		return esroSubstr3;
	}

	/**
	 * Set esroSubstr3
	 */
	public void setEsroSubstr3(String esroSubstr3) {
		this.esroSubstr3 = esroSubstr3;
		addValidField("esroSubstr3");
	}

	/**
	 * Get esroSubstr4
	 */
	@Column(name = "ESRO_SUBSTR4")
	public String getEsroSubstr4() {
		return esroSubstr4;
	}

	/**
	 * Set esroSubstr4
	 */
	public void setEsroSubstr4(String esroSubstr4) {
		this.esroSubstr4 = esroSubstr4;
		addValidField("esroSubstr4");
	}

	/**
	 * Get esroSubstr5
	 */
	@Column(name = "ESRO_SUBSTR5")
	public String getEsroSubstr5() {
		return esroSubstr5;
	}

	/**
	 * Set esroSubstr5
	 */
	public void setEsroSubstr5(String esroSubstr5) {
		this.esroSubstr5 = esroSubstr5;
		addValidField("esroSubstr5");
	}

	/**
	 * Get esroSubstr6
	 */
	@Column(name = "ESRO_SUBSTR6")
	public String getEsroSubstr6() {
		return esroSubstr6;
	}

	/**
	 * Set esroSubstr6
	 */
	public void setEsroSubstr6(String esroSubstr6) {
		this.esroSubstr6 = esroSubstr6;
		addValidField("esroSubstr6");
	}

	/**
	 * Get esroSubstr7
	 */
	@Column(name = "ESRO_SUBSTR7")
	public String getEsroSubstr7() {
		return esroSubstr7;
	}

	/**
	 * Set esroSubstr7
	 */
	public void setEsroSubstr7(String esroSubstr7) {
		this.esroSubstr7 = esroSubstr7;
		addValidField("esroSubstr7");
	}

	/**
	 * Get esroSubstr8
	 */
	@Column(name = "ESRO_SUBSTR8")
	public String getEsroSubstr8() {
		return esroSubstr8;
	}

	/**
	 * Set esroSubstr8
	 */
	public void setEsroSubstr8(String esroSubstr8) {
		this.esroSubstr8 = esroSubstr8;
		addValidField("esroSubstr8");
	}

	/**
	 * Get esroSubdate1
	 */
	@Column(name = "ESRO_SUBDATE1")
	public Date getEsroSubdate1() {
		return esroSubdate1;
	}

	/**
	 * Set esroSubdate1
	 */
	public void setEsroSubdate1(Date esroSubdate1) {
		this.esroSubdate1 = esroSubdate1;
		addValidField("esroSubdate1");
	}

	/**
	 * Get esroSubdate2
	 */
	@Column(name = "ESRO_SUBDATE2")
	public Date getEsroSubdate2() {
		return esroSubdate2;
	}

	/**
	 * Set esroSubdate2
	 */
	public void setEsroSubdate2(Date esroSubdate2) {
		this.esroSubdate2 = esroSubdate2;
		addValidField("esroSubdate2");
	}

	/**
	 * Get esroSubdate3
	 */
	@Column(name = "ESRO_SUBDATE3")
	public Date getEsroSubdate3() {
		return esroSubdate3;
	}

	/**
	 * Set esroSubdate3
	 */
	public void setEsroSubdate3(Date esroSubdate3) {
		this.esroSubdate3 = esroSubdate3;
		addValidField("esroSubdate3");
	}

	/**
	 * Get esroSubdate4
	 */
	@Column(name = "ESRO_SUBDATE4")
	public Date getEsroSubdate4() {
		return esroSubdate4;
	}

	/**
	 * Set esroSubdate4
	 */
	public void setEsroSubdate4(Date esroSubdate4) {
		this.esroSubdate4 = esroSubdate4;
		addValidField("esroSubdate4");
	}

	/**
	 * Get esroSubnum1
	 */
	@Column(name = "ESRO_SUBNUM1")
	public Long getEsroSubnum1() {
		return esroSubnum1;
	}

	/**
	 * Set esroSubnum1
	 */
	public void setEsroSubnum1(Long esroSubnum1) {
		this.esroSubnum1 = esroSubnum1;
		addValidField("esroSubnum1");
	}

	/**
	 * Get esroSubnum2
	 */
	@Column(name = "ESRO_SUBNUM2")
	public Long getEsroSubnum2() {
		return esroSubnum2;
	}

	/**
	 * Set esroSubnum2
	 */
	public void setEsroSubnum2(Long esroSubnum2) {
		this.esroSubnum2 = esroSubnum2;
		addValidField("esroSubnum2");
	}

	/**
	 * Get esroSubnum3
	 */
	@Column(name = "ESRO_SUBNUM3")
	public Long getEsroSubnum3() {
		return esroSubnum3;
	}

	/**
	 * Set esroSubnum3
	 */
	public void setEsroSubnum3(Long esroSubnum3) {
		this.esroSubnum3 = esroSubnum3;
		addValidField("esroSubnum3");
	}

	/**
	 * Get esroSubnum4
	 */
	@Column(name = "ESRO_SUBNUM4")
	public Long getEsroSubnum4() {
		return esroSubnum4;
	}

	/**
	 * Set esroSubnum4
	 */
	public void setEsroSubnum4(Long esroSubnum4) {
		this.esroSubnum4 = esroSubnum4;
		addValidField("esroSubnum4");
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
