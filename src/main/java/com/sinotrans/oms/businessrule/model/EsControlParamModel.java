package com.sinotrans.oms.businessrule.model;

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
 * Model class for EsControlParam
 */
@Entity
@Table(name = "ES_CONTROL_PARAM")
public class EsControlParamModel extends BaseModel implements OperationLog {

	//escpId
	private Long escpId;
	//escpCode
	private String escpCode;
	//escpName
	private String escpName;
	//escpValue
	private String escpValue;
	//escpRange
	private String escpRange;
	//escpParentId
	private Long escpParentId;
	//escpDesc
	private String escpDesc;
	//escpSubstr1
	private String escpSubstr1;
	//escpSubstr2
	private String escpSubstr2;
	//escpSubstr3
	private String escpSubstr3;
	//escpSubstr4
	private String escpSubstr4;
	//escpSubstr5
	private String escpSubstr5;
	//escpSubstr6
	private String escpSubstr6;
	//escpSubstr7
	private String escpSubstr7;
	//escpSubstr8
	private String escpSubstr8;
	//escpSubdate1
	private Date escpSubdate1;
	//escpSubdate2
	private Date escpSubdate2;
	//escpSubdate3
	private Date escpSubdate3;
	//escpSubdate4
	private Date escpSubdate4;
	//escpSubnum1
	private Long escpSubnum1;
	//escpSubnum2
	private Long escpSubnum2;
	//escpSubnum3
	private Long escpSubnum3;
	//escpSubnum4
	private Long escpSubnum4;
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
	 * Get escpId
	 */
	@Column(name = "ESCP_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEscpId() {
		return escpId;
	}

	/**
	 * Set escpId
	 */
	public void setEscpId(Long escpId) {
		this.escpId = escpId;
		addValidField("escpId");
	}

	/**
	 * Get escpCode
	 */
	@Column(name = "ESCP_CODE")
	public String getEscpCode() {
		return escpCode;
	}

	/**
	 * Set escpCode
	 */
	public void setEscpCode(String escpCode) {
		this.escpCode = escpCode;
		addValidField("escpCode");
	}

	/**
	 * Get escpName
	 */
	@Column(name = "ESCP_NAME")
	public String getEscpName() {
		return escpName;
	}

	/**
	 * Set escpName
	 */
	public void setEscpName(String escpName) {
		this.escpName = escpName;
		addValidField("escpName");
	}

	/**
	 * Get escpValue
	 */
	@Column(name = "ESCP_VALUE")
	public String getEscpValue() {
		return escpValue;
	}

	/**
	 * Set escpValue
	 */
	public void setEscpValue(String escpValue) {
		this.escpValue = escpValue;
		addValidField("escpValue");
	}

	/**
	 * Get escpRange
	 */
	@Column(name = "ESCP_RANGE")
	public String getEscpRange() {
		return escpRange;
	}

	/**
	 * Set escpRange
	 */
	public void setEscpRange(String escpRange) {
		this.escpRange = escpRange;
		addValidField("escpRange");
	}

	/**
	 * Get escpParentId
	 */
	@Column(name = "ESCP_PARENT_ID")
	public Long getEscpParentId() {
		return escpParentId;
	}

	/**
	 * Set escpParentId
	 */
	public void setEscpParentId(Long escpParentId) {
		this.escpParentId = escpParentId;
		addValidField("escpParentId");
	}

	/**
	 * Get escpDesc
	 */
	@Column(name = "ESCP_DESC")
	public String getEscpDesc() {
		return escpDesc;
	}

	/**
	 * Set escpDesc
	 */
	public void setEscpDesc(String escpDesc) {
		this.escpDesc = escpDesc;
		addValidField("escpDesc");
	}

	/**
	 * Get escpSubstr1
	 */
	@Column(name = "ESCP_SUBSTR1")
	public String getEscpSubstr1() {
		return escpSubstr1;
	}

	/**
	 * Set escpSubstr1
	 */
	public void setEscpSubstr1(String escpSubstr1) {
		this.escpSubstr1 = escpSubstr1;
		addValidField("escpSubstr1");
	}

	/**
	 * Get escpSubstr2
	 */
	@Column(name = "ESCP_SUBSTR2")
	public String getEscpSubstr2() {
		return escpSubstr2;
	}

	/**
	 * Set escpSubstr2
	 */
	public void setEscpSubstr2(String escpSubstr2) {
		this.escpSubstr2 = escpSubstr2;
		addValidField("escpSubstr2");
	}

	/**
	 * Get escpSubstr3
	 */
	@Column(name = "ESCP_SUBSTR3")
	public String getEscpSubstr3() {
		return escpSubstr3;
	}

	/**
	 * Set escpSubstr3
	 */
	public void setEscpSubstr3(String escpSubstr3) {
		this.escpSubstr3 = escpSubstr3;
		addValidField("escpSubstr3");
	}

	/**
	 * Get escpSubstr4
	 */
	@Column(name = "ESCP_SUBSTR4")
	public String getEscpSubstr4() {
		return escpSubstr4;
	}

	/**
	 * Set escpSubstr4
	 */
	public void setEscpSubstr4(String escpSubstr4) {
		this.escpSubstr4 = escpSubstr4;
		addValidField("escpSubstr4");
	}

	/**
	 * Get escpSubstr5
	 */
	@Column(name = "ESCP_SUBSTR5")
	public String getEscpSubstr5() {
		return escpSubstr5;
	}

	/**
	 * Set escpSubstr5
	 */
	public void setEscpSubstr5(String escpSubstr5) {
		this.escpSubstr5 = escpSubstr5;
		addValidField("escpSubstr5");
	}

	/**
	 * Get escpSubstr6
	 */
	@Column(name = "ESCP_SUBSTR6")
	public String getEscpSubstr6() {
		return escpSubstr6;
	}

	/**
	 * Set escpSubstr6
	 */
	public void setEscpSubstr6(String escpSubstr6) {
		this.escpSubstr6 = escpSubstr6;
		addValidField("escpSubstr6");
	}

	/**
	 * Get escpSubstr7
	 */
	@Column(name = "ESCP_SUBSTR7")
	public String getEscpSubstr7() {
		return escpSubstr7;
	}

	/**
	 * Set escpSubstr7
	 */
	public void setEscpSubstr7(String escpSubstr7) {
		this.escpSubstr7 = escpSubstr7;
		addValidField("escpSubstr7");
	}

	/**
	 * Get escpSubstr8
	 */
	@Column(name = "ESCP_SUBSTR8")
	public String getEscpSubstr8() {
		return escpSubstr8;
	}

	/**
	 * Set escpSubstr8
	 */
	public void setEscpSubstr8(String escpSubstr8) {
		this.escpSubstr8 = escpSubstr8;
		addValidField("escpSubstr8");
	}

	/**
	 * Get escpSubdate1
	 */
	@Column(name = "ESCP_SUBDATE1")
	public Date getEscpSubdate1() {
		return escpSubdate1;
	}

	/**
	 * Set escpSubdate1
	 */
	public void setEscpSubdate1(Date escpSubdate1) {
		this.escpSubdate1 = escpSubdate1;
		addValidField("escpSubdate1");
	}

	/**
	 * Get escpSubdate2
	 */
	@Column(name = "ESCP_SUBDATE2")
	public Date getEscpSubdate2() {
		return escpSubdate2;
	}

	/**
	 * Set escpSubdate2
	 */
	public void setEscpSubdate2(Date escpSubdate2) {
		this.escpSubdate2 = escpSubdate2;
		addValidField("escpSubdate2");
	}

	/**
	 * Get escpSubdate3
	 */
	@Column(name = "ESCP_SUBDATE3")
	public Date getEscpSubdate3() {
		return escpSubdate3;
	}

	/**
	 * Set escpSubdate3
	 */
	public void setEscpSubdate3(Date escpSubdate3) {
		this.escpSubdate3 = escpSubdate3;
		addValidField("escpSubdate3");
	}

	/**
	 * Get escpSubdate4
	 */
	@Column(name = "ESCP_SUBDATE4")
	public Date getEscpSubdate4() {
		return escpSubdate4;
	}

	/**
	 * Set escpSubdate4
	 */
	public void setEscpSubdate4(Date escpSubdate4) {
		this.escpSubdate4 = escpSubdate4;
		addValidField("escpSubdate4");
	}

	/**
	 * Get escpSubnum1
	 */
	@Column(name = "ESCP_SUBNUM1")
	public Long getEscpSubnum1() {
		return escpSubnum1;
	}

	/**
	 * Set escpSubnum1
	 */
	public void setEscpSubnum1(Long escpSubnum1) {
		this.escpSubnum1 = escpSubnum1;
		addValidField("escpSubnum1");
	}

	/**
	 * Get escpSubnum2
	 */
	@Column(name = "ESCP_SUBNUM2")
	public Long getEscpSubnum2() {
		return escpSubnum2;
	}

	/**
	 * Set escpSubnum2
	 */
	public void setEscpSubnum2(Long escpSubnum2) {
		this.escpSubnum2 = escpSubnum2;
		addValidField("escpSubnum2");
	}

	/**
	 * Get escpSubnum3
	 */
	@Column(name = "ESCP_SUBNUM3")
	public Long getEscpSubnum3() {
		return escpSubnum3;
	}

	/**
	 * Set escpSubnum3
	 */
	public void setEscpSubnum3(Long escpSubnum3) {
		this.escpSubnum3 = escpSubnum3;
		addValidField("escpSubnum3");
	}

	/**
	 * Get escpSubnum4
	 */
	@Column(name = "ESCP_SUBNUM4")
	public Long getEscpSubnum4() {
		return escpSubnum4;
	}

	/**
	 * Set escpSubnum4
	 */
	public void setEscpSubnum4(Long escpSubnum4) {
		this.escpSubnum4 = escpSubnum4;
		addValidField("escpSubnum4");
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
