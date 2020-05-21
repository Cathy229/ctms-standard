package com.sinotrans.oms.datainteraction.model;

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
 * Model class for EdiBookingSealFeedback
 */
@Entity
@Table(name = "EDI_BOOKING_SEAL_FEEDBACK")
public class EdiBookingSealFeedbackModel extends BaseModel implements OperationLog {

	//edblId
	private Long edblId;
	//edblEdbnId
	private Long edblEdbnId;
	//edblSealKind
	private String edblSealKind;
	//edblSealAgencyCode
	private String edblSealAgencyCode;
	//edblSealAgencyName
	private String edblSealAgencyName;
	//edblSealNo
	private String edblSealNo;
	//edblSubstr1
	private String edblSubstr1;
	//edblSubstr2
	private String edblSubstr2;
	//edblSubstr3
	private String edblSubstr3;
	//edblSubstr4
	private String edblSubstr4;
	//edblSubstr5
	private String edblSubstr5;
	//edblSubstr6
	private String edblSubstr6;
	//edblSubstr7
	private String edblSubstr7;
	//edblSubstr8
	private String edblSubstr8;
	//edblSubdate1
	private Date edblSubdate1;
	//edblSubdate2
	private Date edblSubdate2;
	//edblSubdate3
	private Date edblSubdate3;
	//edblSubdate4
	private Date edblSubdate4;
	//edblSubnum1
	private Long edblSubnum1;
	//edblSubnum2
	private Long edblSubnum2;
	//edblSubnum3
	private Long edblSubnum3;
	//edblSubnum4
	private Long edblSubnum4;
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
	 * Get edblId
	 */
	@Column(name = "EDBL_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEdblId() {
		return edblId;
	}

	/**
	 * Set edblId
	 */
	public void setEdblId(Long edblId) {
		this.edblId = edblId;
		addValidField("edblId");
	}

	/**
	 * Get edblEdbnId
	 */
	@Column(name = "EDBL_EDBN_ID")
	public Long getEdblEdbnId() {
		return edblEdbnId;
	}

	/**
	 * Set edblEdbnId
	 */
	public void setEdblEdbnId(Long edblEdbnId) {
		this.edblEdbnId = edblEdbnId;
		addValidField("edblEdbnId");
	}

	/**
	 * Get edblSealKind
	 */
	@Column(name = "EDBL_SEAL_KIND")
	public String getEdblSealKind() {
		return edblSealKind;
	}

	/**
	 * Set edblSealKind
	 */
	public void setEdblSealKind(String edblSealKind) {
		this.edblSealKind = edblSealKind;
		addValidField("edblSealKind");
	}

	/**
	 * Get edblSealAgencyCode
	 */
	@Column(name = "EDBL_SEAL_AGENCY_CODE")
	public String getEdblSealAgencyCode() {
		return edblSealAgencyCode;
	}

	/**
	 * Set edblSealAgencyCode
	 */
	public void setEdblSealAgencyCode(String edblSealAgencyCode) {
		this.edblSealAgencyCode = edblSealAgencyCode;
		addValidField("edblSealAgencyCode");
	}

	/**
	 * Get edblSealAgencyName
	 */
	@Column(name = "EDBL_SEAL_AGENCY_NAME")
	public String getEdblSealAgencyName() {
		return edblSealAgencyName;
	}

	/**
	 * Set edblSealAgencyName
	 */
	public void setEdblSealAgencyName(String edblSealAgencyName) {
		this.edblSealAgencyName = edblSealAgencyName;
		addValidField("edblSealAgencyName");
	}

	/**
	 * Get edblSealNo
	 */
	@Column(name = "EDBL_SEAL_NO")
	public String getEdblSealNo() {
		return edblSealNo;
	}

	/**
	 * Set edblSealNo
	 */
	public void setEdblSealNo(String edblSealNo) {
		this.edblSealNo = edblSealNo;
		addValidField("edblSealNo");
	}

	/**
	 * Get edblSubstr1
	 */
	@Column(name = "EDBL_SUBSTR1")
	public String getEdblSubstr1() {
		return edblSubstr1;
	}

	/**
	 * Set edblSubstr1
	 */
	public void setEdblSubstr1(String edblSubstr1) {
		this.edblSubstr1 = edblSubstr1;
		addValidField("edblSubstr1");
	}

	/**
	 * Get edblSubstr2
	 */
	@Column(name = "EDBL_SUBSTR2")
	public String getEdblSubstr2() {
		return edblSubstr2;
	}

	/**
	 * Set edblSubstr2
	 */
	public void setEdblSubstr2(String edblSubstr2) {
		this.edblSubstr2 = edblSubstr2;
		addValidField("edblSubstr2");
	}

	/**
	 * Get edblSubstr3
	 */
	@Column(name = "EDBL_SUBSTR3")
	public String getEdblSubstr3() {
		return edblSubstr3;
	}

	/**
	 * Set edblSubstr3
	 */
	public void setEdblSubstr3(String edblSubstr3) {
		this.edblSubstr3 = edblSubstr3;
		addValidField("edblSubstr3");
	}

	/**
	 * Get edblSubstr4
	 */
	@Column(name = "EDBL_SUBSTR4")
	public String getEdblSubstr4() {
		return edblSubstr4;
	}

	/**
	 * Set edblSubstr4
	 */
	public void setEdblSubstr4(String edblSubstr4) {
		this.edblSubstr4 = edblSubstr4;
		addValidField("edblSubstr4");
	}

	/**
	 * Get edblSubstr5
	 */
	@Column(name = "EDBL_SUBSTR5")
	public String getEdblSubstr5() {
		return edblSubstr5;
	}

	/**
	 * Set edblSubstr5
	 */
	public void setEdblSubstr5(String edblSubstr5) {
		this.edblSubstr5 = edblSubstr5;
		addValidField("edblSubstr5");
	}

	/**
	 * Get edblSubstr6
	 */
	@Column(name = "EDBL_SUBSTR6")
	public String getEdblSubstr6() {
		return edblSubstr6;
	}

	/**
	 * Set edblSubstr6
	 */
	public void setEdblSubstr6(String edblSubstr6) {
		this.edblSubstr6 = edblSubstr6;
		addValidField("edblSubstr6");
	}

	/**
	 * Get edblSubstr7
	 */
	@Column(name = "EDBL_SUBSTR7")
	public String getEdblSubstr7() {
		return edblSubstr7;
	}

	/**
	 * Set edblSubstr7
	 */
	public void setEdblSubstr7(String edblSubstr7) {
		this.edblSubstr7 = edblSubstr7;
		addValidField("edblSubstr7");
	}

	/**
	 * Get edblSubstr8
	 */
	@Column(name = "EDBL_SUBSTR8")
	public String getEdblSubstr8() {
		return edblSubstr8;
	}

	/**
	 * Set edblSubstr8
	 */
	public void setEdblSubstr8(String edblSubstr8) {
		this.edblSubstr8 = edblSubstr8;
		addValidField("edblSubstr8");
	}

	/**
	 * Get edblSubdate1
	 */
	@Column(name = "EDBL_SUBDATE1")
	public Date getEdblSubdate1() {
		return edblSubdate1;
	}

	/**
	 * Set edblSubdate1
	 */
	public void setEdblSubdate1(Date edblSubdate1) {
		this.edblSubdate1 = edblSubdate1;
		addValidField("edblSubdate1");
	}

	/**
	 * Get edblSubdate2
	 */
	@Column(name = "EDBL_SUBDATE2")
	public Date getEdblSubdate2() {
		return edblSubdate2;
	}

	/**
	 * Set edblSubdate2
	 */
	public void setEdblSubdate2(Date edblSubdate2) {
		this.edblSubdate2 = edblSubdate2;
		addValidField("edblSubdate2");
	}

	/**
	 * Get edblSubdate3
	 */
	@Column(name = "EDBL_SUBDATE3")
	public Date getEdblSubdate3() {
		return edblSubdate3;
	}

	/**
	 * Set edblSubdate3
	 */
	public void setEdblSubdate3(Date edblSubdate3) {
		this.edblSubdate3 = edblSubdate3;
		addValidField("edblSubdate3");
	}

	/**
	 * Get edblSubdate4
	 */
	@Column(name = "EDBL_SUBDATE4")
	public Date getEdblSubdate4() {
		return edblSubdate4;
	}

	/**
	 * Set edblSubdate4
	 */
	public void setEdblSubdate4(Date edblSubdate4) {
		this.edblSubdate4 = edblSubdate4;
		addValidField("edblSubdate4");
	}

	/**
	 * Get edblSubnum1
	 */
	@Column(name = "EDBL_SUBNUM1")
	public Long getEdblSubnum1() {
		return edblSubnum1;
	}

	/**
	 * Set edblSubnum1
	 */
	public void setEdblSubnum1(Long edblSubnum1) {
		this.edblSubnum1 = edblSubnum1;
		addValidField("edblSubnum1");
	}

	/**
	 * Get edblSubnum2
	 */
	@Column(name = "EDBL_SUBNUM2")
	public Long getEdblSubnum2() {
		return edblSubnum2;
	}

	/**
	 * Set edblSubnum2
	 */
	public void setEdblSubnum2(Long edblSubnum2) {
		this.edblSubnum2 = edblSubnum2;
		addValidField("edblSubnum2");
	}

	/**
	 * Get edblSubnum3
	 */
	@Column(name = "EDBL_SUBNUM3")
	public Long getEdblSubnum3() {
		return edblSubnum3;
	}

	/**
	 * Set edblSubnum3
	 */
	public void setEdblSubnum3(Long edblSubnum3) {
		this.edblSubnum3 = edblSubnum3;
		addValidField("edblSubnum3");
	}

	/**
	 * Get edblSubnum4
	 */
	@Column(name = "EDBL_SUBNUM4")
	public Long getEdblSubnum4() {
		return edblSubnum4;
	}

	/**
	 * Set edblSubnum4
	 */
	public void setEdblSubnum4(Long edblSubnum4) {
		this.edblSubnum4 = edblSubnum4;
		addValidField("edblSubnum4");
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
