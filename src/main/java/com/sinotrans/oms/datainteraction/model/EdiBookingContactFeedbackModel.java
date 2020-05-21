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
 * Model class for EdiBookingContactFeedback
 */
@Entity
@Table(name = "EDI_BOOKING_CONTACT_FEEDBACK")
public class EdiBookingContactFeedbackModel extends BaseModel implements OperationLog {

	//edbaId
	private Long edbaId;
	//edbaEdbbId
	private Long edbaEdbbId;
	//edbaFunctionCode
	private String edbaFunctionCode;
	//edbaDepartementEmployee
	private String edbaDepartementEmployee;
	//edbaCommunicationCode
	private String edbaCommunicationCode;
	//edbaCommunicationNumber
	private String edbaCommunicationNumber;
	//edbaSubstr1
	private String edbaSubstr1;
	//edbaSubstr2
	private String edbaSubstr2;
	//edbaSubstr3
	private String edbaSubstr3;
	//edbaSubstr4
	private String edbaSubstr4;
	//edbaSubstr5
	private String edbaSubstr5;
	//edbaSubstr6
	private String edbaSubstr6;
	//edbaSubstr7
	private String edbaSubstr7;
	//edbaSubstr8
	private String edbaSubstr8;
	//edbaSubdate1
	private Date edbaSubdate1;
	//edbaSubdate2
	private Date edbaSubdate2;
	//edbaSubdate3
	private Date edbaSubdate3;
	//edbaSubdate4
	private Date edbaSubdate4;
	//edbaSubnum1
	private Long edbaSubnum1;
	//edbaSubnum2
	private Long edbaSubnum2;
	//edbaSubnum3
	private Long edbaSubnum3;
	//edbaSubnum4
	private Long edbaSubnum4;
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
	 * Get edbaId
	 */
	@Column(name = "EDBA_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEdbaId() {
		return edbaId;
	}

	/**
	 * Set edbaId
	 */
	public void setEdbaId(Long edbaId) {
		this.edbaId = edbaId;
		addValidField("edbaId");
	}

	/**
	 * Get edbaEdbbId
	 */
	@Column(name = "EDBA_EDBB_ID")
	public Long getEdbaEdbbId() {
		return edbaEdbbId;
	}

	/**
	 * Set edbaEdbbId
	 */
	public void setEdbaEdbbId(Long edbaEdbbId) {
		this.edbaEdbbId = edbaEdbbId;
		addValidField("edbaEdbbId");
	}

	/**
	 * Get edbaFunctionCode
	 */
	@Column(name = "EDBA_FUNCTION_CODE")
	public String getEdbaFunctionCode() {
		return edbaFunctionCode;
	}

	/**
	 * Set edbaFunctionCode
	 */
	public void setEdbaFunctionCode(String edbaFunctionCode) {
		this.edbaFunctionCode = edbaFunctionCode;
		addValidField("edbaFunctionCode");
	}

	/**
	 * Get edbaDepartementEmployee
	 */
	@Column(name = "EDBA_DEPARTEMENT_EMPLOYEE")
	public String getEdbaDepartementEmployee() {
		return edbaDepartementEmployee;
	}

	/**
	 * Set edbaDepartementEmployee
	 */
	public void setEdbaDepartementEmployee(String edbaDepartementEmployee) {
		this.edbaDepartementEmployee = edbaDepartementEmployee;
		addValidField("edbaDepartementEmployee");
	}

	/**
	 * Get edbaCommunicationCode
	 */
	@Column(name = "EDBA_COMMUNICATION_CODE")
	public String getEdbaCommunicationCode() {
		return edbaCommunicationCode;
	}

	/**
	 * Set edbaCommunicationCode
	 */
	public void setEdbaCommunicationCode(String edbaCommunicationCode) {
		this.edbaCommunicationCode = edbaCommunicationCode;
		addValidField("edbaCommunicationCode");
	}

	/**
	 * Get edbaCommunicationNumber
	 */
	@Column(name = "EDBA_COMMUNICATION_NUMBER")
	public String getEdbaCommunicationNumber() {
		return edbaCommunicationNumber;
	}

	/**
	 * Set edbaCommunicationNumber
	 */
	public void setEdbaCommunicationNumber(String edbaCommunicationNumber) {
		this.edbaCommunicationNumber = edbaCommunicationNumber;
		addValidField("edbaCommunicationNumber");
	}

	/**
	 * Get edbaSubstr1
	 */
	@Column(name = "EDBA_SUBSTR1")
	public String getEdbaSubstr1() {
		return edbaSubstr1;
	}

	/**
	 * Set edbaSubstr1
	 */
	public void setEdbaSubstr1(String edbaSubstr1) {
		this.edbaSubstr1 = edbaSubstr1;
		addValidField("edbaSubstr1");
	}

	/**
	 * Get edbaSubstr2
	 */
	@Column(name = "EDBA_SUBSTR2")
	public String getEdbaSubstr2() {
		return edbaSubstr2;
	}

	/**
	 * Set edbaSubstr2
	 */
	public void setEdbaSubstr2(String edbaSubstr2) {
		this.edbaSubstr2 = edbaSubstr2;
		addValidField("edbaSubstr2");
	}

	/**
	 * Get edbaSubstr3
	 */
	@Column(name = "EDBA_SUBSTR3")
	public String getEdbaSubstr3() {
		return edbaSubstr3;
	}

	/**
	 * Set edbaSubstr3
	 */
	public void setEdbaSubstr3(String edbaSubstr3) {
		this.edbaSubstr3 = edbaSubstr3;
		addValidField("edbaSubstr3");
	}

	/**
	 * Get edbaSubstr4
	 */
	@Column(name = "EDBA_SUBSTR4")
	public String getEdbaSubstr4() {
		return edbaSubstr4;
	}

	/**
	 * Set edbaSubstr4
	 */
	public void setEdbaSubstr4(String edbaSubstr4) {
		this.edbaSubstr4 = edbaSubstr4;
		addValidField("edbaSubstr4");
	}

	/**
	 * Get edbaSubstr5
	 */
	@Column(name = "EDBA_SUBSTR5")
	public String getEdbaSubstr5() {
		return edbaSubstr5;
	}

	/**
	 * Set edbaSubstr5
	 */
	public void setEdbaSubstr5(String edbaSubstr5) {
		this.edbaSubstr5 = edbaSubstr5;
		addValidField("edbaSubstr5");
	}

	/**
	 * Get edbaSubstr6
	 */
	@Column(name = "EDBA_SUBSTR6")
	public String getEdbaSubstr6() {
		return edbaSubstr6;
	}

	/**
	 * Set edbaSubstr6
	 */
	public void setEdbaSubstr6(String edbaSubstr6) {
		this.edbaSubstr6 = edbaSubstr6;
		addValidField("edbaSubstr6");
	}

	/**
	 * Get edbaSubstr7
	 */
	@Column(name = "EDBA_SUBSTR7")
	public String getEdbaSubstr7() {
		return edbaSubstr7;
	}

	/**
	 * Set edbaSubstr7
	 */
	public void setEdbaSubstr7(String edbaSubstr7) {
		this.edbaSubstr7 = edbaSubstr7;
		addValidField("edbaSubstr7");
	}

	/**
	 * Get edbaSubstr8
	 */
	@Column(name = "EDBA_SUBSTR8")
	public String getEdbaSubstr8() {
		return edbaSubstr8;
	}

	/**
	 * Set edbaSubstr8
	 */
	public void setEdbaSubstr8(String edbaSubstr8) {
		this.edbaSubstr8 = edbaSubstr8;
		addValidField("edbaSubstr8");
	}

	/**
	 * Get edbaSubdate1
	 */
	@Column(name = "EDBA_SUBDATE1")
	public Date getEdbaSubdate1() {
		return edbaSubdate1;
	}

	/**
	 * Set edbaSubdate1
	 */
	public void setEdbaSubdate1(Date edbaSubdate1) {
		this.edbaSubdate1 = edbaSubdate1;
		addValidField("edbaSubdate1");
	}

	/**
	 * Get edbaSubdate2
	 */
	@Column(name = "EDBA_SUBDATE2")
	public Date getEdbaSubdate2() {
		return edbaSubdate2;
	}

	/**
	 * Set edbaSubdate2
	 */
	public void setEdbaSubdate2(Date edbaSubdate2) {
		this.edbaSubdate2 = edbaSubdate2;
		addValidField("edbaSubdate2");
	}

	/**
	 * Get edbaSubdate3
	 */
	@Column(name = "EDBA_SUBDATE3")
	public Date getEdbaSubdate3() {
		return edbaSubdate3;
	}

	/**
	 * Set edbaSubdate3
	 */
	public void setEdbaSubdate3(Date edbaSubdate3) {
		this.edbaSubdate3 = edbaSubdate3;
		addValidField("edbaSubdate3");
	}

	/**
	 * Get edbaSubdate4
	 */
	@Column(name = "EDBA_SUBDATE4")
	public Date getEdbaSubdate4() {
		return edbaSubdate4;
	}

	/**
	 * Set edbaSubdate4
	 */
	public void setEdbaSubdate4(Date edbaSubdate4) {
		this.edbaSubdate4 = edbaSubdate4;
		addValidField("edbaSubdate4");
	}

	/**
	 * Get edbaSubnum1
	 */
	@Column(name = "EDBA_SUBNUM1")
	public Long getEdbaSubnum1() {
		return edbaSubnum1;
	}

	/**
	 * Set edbaSubnum1
	 */
	public void setEdbaSubnum1(Long edbaSubnum1) {
		this.edbaSubnum1 = edbaSubnum1;
		addValidField("edbaSubnum1");
	}

	/**
	 * Get edbaSubnum2
	 */
	@Column(name = "EDBA_SUBNUM2")
	public Long getEdbaSubnum2() {
		return edbaSubnum2;
	}

	/**
	 * Set edbaSubnum2
	 */
	public void setEdbaSubnum2(Long edbaSubnum2) {
		this.edbaSubnum2 = edbaSubnum2;
		addValidField("edbaSubnum2");
	}

	/**
	 * Get edbaSubnum3
	 */
	@Column(name = "EDBA_SUBNUM3")
	public Long getEdbaSubnum3() {
		return edbaSubnum3;
	}

	/**
	 * Set edbaSubnum3
	 */
	public void setEdbaSubnum3(Long edbaSubnum3) {
		this.edbaSubnum3 = edbaSubnum3;
		addValidField("edbaSubnum3");
	}

	/**
	 * Get edbaSubnum4
	 */
	@Column(name = "EDBA_SUBNUM4")
	public Long getEdbaSubnum4() {
		return edbaSubnum4;
	}

	/**
	 * Set edbaSubnum4
	 */
	public void setEdbaSubnum4(Long edbaSubnum4) {
		this.edbaSubnum4 = edbaSubnum4;
		addValidField("edbaSubnum4");
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
