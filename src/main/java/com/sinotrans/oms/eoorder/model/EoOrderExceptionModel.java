package com.sinotrans.oms.eoorder.model;

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
 * Model class for EoOrderException
 */
@Entity
@Table(name = "EO_ORDER_EXCEPTION")
public class EoOrderExceptionModel extends BaseModel implements OperationLog {

	//eooeId
	private Long eooeId;
	//eooeEscoId
	private Long eooeEscoId;
	//eooeEbpjId
	private Long eooeEbpjId;
	//eooeEooaId
	private Long eooeEooaId;
	//eooeEoorId
	private Long eooeEoorId;
	//eooeType
	private String eooeType;
	//eooeDesc
	private String eooeDesc;
	//eooeResult
	private String eooeResult;
	//eooeIsInitiate
	private String eooeIsInitiate;
	//eooeRegist
	private String eooeRegist;
	//eooeRegistDate
	private Date eooeRegistDate;
	//eooeSubstr1
	private String eooeSubstr1;
	//eooeSubstr2
	private String eooeSubstr2;
	//eooeSubstr3
	private String eooeSubstr3;
	//eooeSubstr4
	private String eooeSubstr4;
	//eooeSubstr5
	private String eooeSubstr5;
	//eooeSubstr6
	private String eooeSubstr6;
	//eooeSubstr7
	private String eooeSubstr7;
	//eooeSubstr8
	private String eooeSubstr8;
	//eooeSubdate1
	private Date eooeSubdate1;
	//eooeSubdate2
	private Date eooeSubdate2;
	//eooeSubdate3
	private Date eooeSubdate3;
	//eooeSubdate4
	private Date eooeSubdate4;
	//eooeSubnum1
	private Long eooeSubnum1;
	//eooeSubnum2
	private Long eooeSubnum2;
	//eooeSubnum3
	private Long eooeSubnum3;
	//eooeSubnum4
	private Long eooeSubnum4;
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
	 * Get eooeId
	 */
	@Column(name = "EOOE_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEooeId() {
		return eooeId;
	}

	/**
	 * Set eooeId
	 */
	public void setEooeId(Long eooeId) {
		this.eooeId = eooeId;
		addValidField("eooeId");
	}

	/**
	 * Get eooeEscoId
	 */
	@Column(name = "EOOE_ESCO_ID")
	public Long getEooeEscoId() {
		return eooeEscoId;
	}

	/**
	 * Set eooeEscoId
	 */
	public void setEooeEscoId(Long eooeEscoId) {
		this.eooeEscoId = eooeEscoId;
		addValidField("eooeEscoId");
	}

	/**
	 * Get eooeEbpjId
	 */
	@Column(name = "EOOE_EBPJ_ID")
	public Long getEooeEbpjId() {
		return eooeEbpjId;
	}

	/**
	 * Set eooeEbpjId
	 */
	public void setEooeEbpjId(Long eooeEbpjId) {
		this.eooeEbpjId = eooeEbpjId;
		addValidField("eooeEbpjId");
	}

	/**
	 * Get eooeEooaId
	 */
	@Column(name = "EOOE_EOOA_ID")
	public Long getEooeEooaId() {
		return eooeEooaId;
	}

	/**
	 * Set eooeEooaId
	 */
	public void setEooeEooaId(Long eooeEooaId) {
		this.eooeEooaId = eooeEooaId;
		addValidField("eooeEooaId");
	}

	/**
	 * Get eooeEoorId
	 */
	@Column(name = "EOOE_EOOR_ID")
	public Long getEooeEoorId() {
		return eooeEoorId;
	}

	/**
	 * Set eooeEoorId
	 */
	public void setEooeEoorId(Long eooeEoorId) {
		this.eooeEoorId = eooeEoorId;
		addValidField("eooeEoorId");
	}

	/**
	 * Get eooeType
	 */
	@Column(name = "EOOE_TYPE")
	public String getEooeType() {
		return eooeType;
	}

	/**
	 * Set eooeType
	 */
	public void setEooeType(String eooeType) {
		this.eooeType = eooeType;
		addValidField("eooeType");
	}

	/**
	 * Get eooeDesc
	 */
	@Column(name = "EOOE_DESC")
	public String getEooeDesc() {
		return eooeDesc;
	}

	/**
	 * Set eooeDesc
	 */
	public void setEooeDesc(String eooeDesc) {
		this.eooeDesc = eooeDesc;
		addValidField("eooeDesc");
	}

	/**
	 * Get eooeResult
	 */
	@Column(name = "EOOE_RESULT")
	public String getEooeResult() {
		return eooeResult;
	}

	/**
	 * Set eooeResult
	 */
	public void setEooeResult(String eooeResult) {
		this.eooeResult = eooeResult;
		addValidField("eooeResult");
	}

	/**
	 * Get eooeIsInitiate
	 */
	@Column(name = "EOOE_IS_INITIATE")
	public String getEooeIsInitiate() {
		return eooeIsInitiate;
	}

	/**
	 * Set eooeIsInitiate
	 */
	public void setEooeIsInitiate(String eooeIsInitiate) {
		this.eooeIsInitiate = eooeIsInitiate;
		addValidField("eooeIsInitiate");
	}

	/**
	 * Get eooeRegist
	 */
	@Column(name = "EOOE_REGIST")
	public String getEooeRegist() {
		return eooeRegist;
	}

	/**
	 * Set eooeRegist
	 */
	public void setEooeRegist(String eooeRegist) {
		this.eooeRegist = eooeRegist;
		addValidField("eooeRegist");
	}

	/**
	 * Get eooeRegistDate
	 */
	@Column(name = "EOOE_REGIST_DATE")
	public Date getEooeRegistDate() {
		return eooeRegistDate;
	}

	/**
	 * Set eooeRegistDate
	 */
	public void setEooeRegistDate(Date eooeRegistDate) {
		this.eooeRegistDate = eooeRegistDate;
		addValidField("eooeRegistDate");
	}

	/**
	 * Get eooeSubstr1
	 */
	@Column(name = "EOOE_SUBSTR1")
	public String getEooeSubstr1() {
		return eooeSubstr1;
	}

	/**
	 * Set eooeSubstr1
	 */
	public void setEooeSubstr1(String eooeSubstr1) {
		this.eooeSubstr1 = eooeSubstr1;
		addValidField("eooeSubstr1");
	}

	/**
	 * Get eooeSubstr2
	 */
	@Column(name = "EOOE_SUBSTR2")
	public String getEooeSubstr2() {
		return eooeSubstr2;
	}

	/**
	 * Set eooeSubstr2
	 */
	public void setEooeSubstr2(String eooeSubstr2) {
		this.eooeSubstr2 = eooeSubstr2;
		addValidField("eooeSubstr2");
	}

	/**
	 * Get eooeSubstr3
	 */
	@Column(name = "EOOE_SUBSTR3")
	public String getEooeSubstr3() {
		return eooeSubstr3;
	}

	/**
	 * Set eooeSubstr3
	 */
	public void setEooeSubstr3(String eooeSubstr3) {
		this.eooeSubstr3 = eooeSubstr3;
		addValidField("eooeSubstr3");
	}

	/**
	 * Get eooeSubstr4
	 */
	@Column(name = "EOOE_SUBSTR4")
	public String getEooeSubstr4() {
		return eooeSubstr4;
	}

	/**
	 * Set eooeSubstr4
	 */
	public void setEooeSubstr4(String eooeSubstr4) {
		this.eooeSubstr4 = eooeSubstr4;
		addValidField("eooeSubstr4");
	}

	/**
	 * Get eooeSubstr5
	 */
	@Column(name = "EOOE_SUBSTR5")
	public String getEooeSubstr5() {
		return eooeSubstr5;
	}

	/**
	 * Set eooeSubstr5
	 */
	public void setEooeSubstr5(String eooeSubstr5) {
		this.eooeSubstr5 = eooeSubstr5;
		addValidField("eooeSubstr5");
	}

	/**
	 * Get eooeSubstr6
	 */
	@Column(name = "EOOE_SUBSTR6")
	public String getEooeSubstr6() {
		return eooeSubstr6;
	}

	/**
	 * Set eooeSubstr6
	 */
	public void setEooeSubstr6(String eooeSubstr6) {
		this.eooeSubstr6 = eooeSubstr6;
		addValidField("eooeSubstr6");
	}

	/**
	 * Get eooeSubstr7
	 */
	@Column(name = "EOOE_SUBSTR7")
	public String getEooeSubstr7() {
		return eooeSubstr7;
	}

	/**
	 * Set eooeSubstr7
	 */
	public void setEooeSubstr7(String eooeSubstr7) {
		this.eooeSubstr7 = eooeSubstr7;
		addValidField("eooeSubstr7");
	}

	/**
	 * Get eooeSubstr8
	 */
	@Column(name = "EOOE_SUBSTR8")
	public String getEooeSubstr8() {
		return eooeSubstr8;
	}

	/**
	 * Set eooeSubstr8
	 */
	public void setEooeSubstr8(String eooeSubstr8) {
		this.eooeSubstr8 = eooeSubstr8;
		addValidField("eooeSubstr8");
	}

	/**
	 * Get eooeSubdate1
	 */
	@Column(name = "EOOE_SUBDATE1")
	public Date getEooeSubdate1() {
		return eooeSubdate1;
	}

	/**
	 * Set eooeSubdate1
	 */
	public void setEooeSubdate1(Date eooeSubdate1) {
		this.eooeSubdate1 = eooeSubdate1;
		addValidField("eooeSubdate1");
	}

	/**
	 * Get eooeSubdate2
	 */
	@Column(name = "EOOE_SUBDATE2")
	public Date getEooeSubdate2() {
		return eooeSubdate2;
	}

	/**
	 * Set eooeSubdate2
	 */
	public void setEooeSubdate2(Date eooeSubdate2) {
		this.eooeSubdate2 = eooeSubdate2;
		addValidField("eooeSubdate2");
	}

	/**
	 * Get eooeSubdate3
	 */
	@Column(name = "EOOE_SUBDATE3")
	public Date getEooeSubdate3() {
		return eooeSubdate3;
	}

	/**
	 * Set eooeSubdate3
	 */
	public void setEooeSubdate3(Date eooeSubdate3) {
		this.eooeSubdate3 = eooeSubdate3;
		addValidField("eooeSubdate3");
	}

	/**
	 * Get eooeSubdate4
	 */
	@Column(name = "EOOE_SUBDATE4")
	public Date getEooeSubdate4() {
		return eooeSubdate4;
	}

	/**
	 * Set eooeSubdate4
	 */
	public void setEooeSubdate4(Date eooeSubdate4) {
		this.eooeSubdate4 = eooeSubdate4;
		addValidField("eooeSubdate4");
	}

	/**
	 * Get eooeSubnum1
	 */
	@Column(name = "EOOE_SUBNUM1")
	public Long getEooeSubnum1() {
		return eooeSubnum1;
	}

	/**
	 * Set eooeSubnum1
	 */
	public void setEooeSubnum1(Long eooeSubnum1) {
		this.eooeSubnum1 = eooeSubnum1;
		addValidField("eooeSubnum1");
	}

	/**
	 * Get eooeSubnum2
	 */
	@Column(name = "EOOE_SUBNUM2")
	public Long getEooeSubnum2() {
		return eooeSubnum2;
	}

	/**
	 * Set eooeSubnum2
	 */
	public void setEooeSubnum2(Long eooeSubnum2) {
		this.eooeSubnum2 = eooeSubnum2;
		addValidField("eooeSubnum2");
	}

	/**
	 * Get eooeSubnum3
	 */
	@Column(name = "EOOE_SUBNUM3")
	public Long getEooeSubnum3() {
		return eooeSubnum3;
	}

	/**
	 * Set eooeSubnum3
	 */
	public void setEooeSubnum3(Long eooeSubnum3) {
		this.eooeSubnum3 = eooeSubnum3;
		addValidField("eooeSubnum3");
	}

	/**
	 * Get eooeSubnum4
	 */
	@Column(name = "EOOE_SUBNUM4")
	public Long getEooeSubnum4() {
		return eooeSubnum4;
	}

	/**
	 * Set eooeSubnum4
	 */
	public void setEooeSubnum4(Long eooeSubnum4) {
		this.eooeSubnum4 = eooeSubnum4;
		addValidField("eooeSubnum4");
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
