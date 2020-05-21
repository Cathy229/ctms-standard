package com.sinotrans.oms.test.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import com.sinotrans.framework.orm.model.BaseModel;
import com.sinotrans.framework.orm.model.OperationLog;

/**
 * Model class for FjWorklog
 */
@Entity
@Table(name = "fj_worklog")
public class FjWorklogModel extends BaseModel implements OperationLog {

	//主键
	private String id;
	//工作类型
	private String worktypeId;
	//工作内容
	private String content;
	//工作日期时间
	private Date workDate;
	//工作人员
	private String userId;
	//优先级
	private String workLevel;
	//creator
	private String creator;
	//createTime
	private Date createTime;
	//modifier
	private String modifier;
	//modifyTime
	private Date modifyTime;
	//recVer
	private Long recVer;
	//attribute1
	private String attribute1;
	//attribute2
	private String attribute2;
	//attribute3
	private String attribute3;
	//attribute4
	private Date attribute4;
	//attribute5
	private Date attribute5;
	//attribute6
	private Date attribute6;
	//attribute7
	private String attribute7;
	//attribute8
	private String attribute8;
	//attribute9
	private String attribute9;
	//attribute10
	private String attribute10;
	//attribute11
	private String attribute11;
	//attribute12
	private String attribute12;
	//attribute13
	private String attribute13;
	//attribute14
	private String attribute14;
	//attribute15
	private String attribute15;
	//attribute16
	private String attribute16;
	//attribute17
	private String attribute17;
	//attribute18
	private String attribute18;
	//attribute19
	private String attribute19;
	//attribute20
	private String attribute20;
	//testNum1
	private Long testNum1;
	//testNum2
	private Long testNum2;

	/**
	 * Get 主键
	 */
	@Column(name = "ID")
	@Id @GeneratedValue(generator = "UUIDGenerator")
	public String getId() {
		return id;
	}

	/**
	 * Set 主键
	 */
	public void setId(String id) {
		this.id = id;
		addValidField("id");
	}

	/**
	 * Get 工作类型
	 */
	@Column(name = "WORKTYPE_ID")
	public String getWorktypeId() {
		return worktypeId;
	}

	/**
	 * Set 工作类型
	 */
	public void setWorktypeId(String worktypeId) {
		this.worktypeId = worktypeId;
		addValidField("worktypeId");
	}

	/**
	 * Get 工作内容
	 */
	@Column(name = "CONTENT")
	public String getContent() {
		return content;
	}

	/**
	 * Set 工作内容
	 */
	public void setContent(String content) {
		this.content = content;
		addValidField("content");
	}

	/**
	 * Get 工作日期时间
	 */
	@Column(name = "WORK_DATE")
	public Date getWorkDate() {
		return workDate;
	}

	/**
	 * Set 工作日期时间
	 */
	public void setWorkDate(Date workDate) {
		this.workDate = workDate;
		addValidField("workDate");
	}

	/**
	 * Get 工作人员
	 */
	@Column(name = "USER_ID")
	public String getUserId() {
		return userId;
	}

	/**
	 * Set 工作人员
	 */
	public void setUserId(String userId) {
		this.userId = userId;
		addValidField("userId");
	}

	/**
	 * Get 优先级
	 */
	@Column(name = "WORK_LEVEL")
	public String getWorkLevel() {
		return workLevel;
	}

	/**
	 * Set 优先级
	 */
	public void setWorkLevel(String workLevel) {
		this.workLevel = workLevel;
		addValidField("workLevel");
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
	 * Get attribute1
	 */
	@Column(name = "ATTRIBUTE1")
	public String getAttribute1() {
		return attribute1;
	}

	/**
	 * Set attribute1
	 */
	public void setAttribute1(String attribute1) {
		this.attribute1 = attribute1;
		addValidField("attribute1");
	}

	/**
	 * Get attribute2
	 */
	@Column(name = "ATTRIBUTE2")
	public String getAttribute2() {
		return attribute2;
	}

	/**
	 * Set attribute2
	 */
	public void setAttribute2(String attribute2) {
		this.attribute2 = attribute2;
		addValidField("attribute2");
	}

	/**
	 * Get attribute3
	 */
	@Column(name = "ATTRIBUTE3")
	public String getAttribute3() {
		return attribute3;
	}

	/**
	 * Set attribute3
	 */
	public void setAttribute3(String attribute3) {
		this.attribute3 = attribute3;
		addValidField("attribute3");
	}

	/**
	 * Get attribute4
	 */
	@Column(name = "ATTRIBUTE4")
	public Date getAttribute4() {
		return attribute4;
	}

	/**
	 * Set attribute4
	 */
	public void setAttribute4(Date attribute4) {
		this.attribute4 = attribute4;
		addValidField("attribute4");
	}

	/**
	 * Get attribute5
	 */
	@Column(name = "ATTRIBUTE5")
	public Date getAttribute5() {
		return attribute5;
	}

	/**
	 * Set attribute5
	 */
	public void setAttribute5(Date attribute5) {
		this.attribute5 = attribute5;
		addValidField("attribute5");
	}

	/**
	 * Get attribute6
	 */
	@Column(name = "ATTRIBUTE6")
	public Date getAttribute6() {
		return attribute6;
	}

	/**
	 * Set attribute6
	 */
	public void setAttribute6(Date attribute6) {
		this.attribute6 = attribute6;
		addValidField("attribute6");
	}

	/**
	 * Get attribute7
	 */
	@Column(name = "ATTRIBUTE7")
	public String getAttribute7() {
		return attribute7;
	}

	/**
	 * Set attribute7
	 */
	public void setAttribute7(String attribute7) {
		this.attribute7 = attribute7;
		addValidField("attribute7");
	}

	/**
	 * Get attribute8
	 */
	@Column(name = "ATTRIBUTE8")
	public String getAttribute8() {
		return attribute8;
	}

	/**
	 * Set attribute8
	 */
	public void setAttribute8(String attribute8) {
		this.attribute8 = attribute8;
		addValidField("attribute8");
	}

	/**
	 * Get attribute9
	 */
	@Column(name = "ATTRIBUTE9")
	public String getAttribute9() {
		return attribute9;
	}

	/**
	 * Set attribute9
	 */
	public void setAttribute9(String attribute9) {
		this.attribute9 = attribute9;
		addValidField("attribute9");
	}

	/**
	 * Get attribute10
	 */
	@Column(name = "ATTRIBUTE10")
	public String getAttribute10() {
		return attribute10;
	}

	/**
	 * Set attribute10
	 */
	public void setAttribute10(String attribute10) {
		this.attribute10 = attribute10;
		addValidField("attribute10");
	}

	/**
	 * Get attribute11
	 */
	@Column(name = "ATTRIBUTE11")
	public String getAttribute11() {
		return attribute11;
	}

	/**
	 * Set attribute11
	 */
	public void setAttribute11(String attribute11) {
		this.attribute11 = attribute11;
		addValidField("attribute11");
	}

	/**
	 * Get attribute12
	 */
	@Column(name = "ATTRIBUTE12")
	public String getAttribute12() {
		return attribute12;
	}

	/**
	 * Set attribute12
	 */
	public void setAttribute12(String attribute12) {
		this.attribute12 = attribute12;
		addValidField("attribute12");
	}

	/**
	 * Get attribute13
	 */
	@Column(name = "ATTRIBUTE13")
	public String getAttribute13() {
		return attribute13;
	}

	/**
	 * Set attribute13
	 */
	public void setAttribute13(String attribute13) {
		this.attribute13 = attribute13;
		addValidField("attribute13");
	}

	/**
	 * Get attribute14
	 */
	@Column(name = "ATTRIBUTE14")
	public String getAttribute14() {
		return attribute14;
	}

	/**
	 * Set attribute14
	 */
	public void setAttribute14(String attribute14) {
		this.attribute14 = attribute14;
		addValidField("attribute14");
	}

	/**
	 * Get attribute15
	 */
	@Column(name = "ATTRIBUTE15")
	public String getAttribute15() {
		return attribute15;
	}

	/**
	 * Set attribute15
	 */
	public void setAttribute15(String attribute15) {
		this.attribute15 = attribute15;
		addValidField("attribute15");
	}

	/**
	 * Get attribute16
	 */
	@Column(name = "ATTRIBUTE16")
	public String getAttribute16() {
		return attribute16;
	}

	/**
	 * Set attribute16
	 */
	public void setAttribute16(String attribute16) {
		this.attribute16 = attribute16;
		addValidField("attribute16");
	}

	/**
	 * Get attribute17
	 */
	@Column(name = "ATTRIBUTE17")
	public String getAttribute17() {
		return attribute17;
	}

	/**
	 * Set attribute17
	 */
	public void setAttribute17(String attribute17) {
		this.attribute17 = attribute17;
		addValidField("attribute17");
	}

	/**
	 * Get attribute18
	 */
	@Column(name = "ATTRIBUTE18")
	public String getAttribute18() {
		return attribute18;
	}

	/**
	 * Set attribute18
	 */
	public void setAttribute18(String attribute18) {
		this.attribute18 = attribute18;
		addValidField("attribute18");
	}

	/**
	 * Get attribute19
	 */
	@Column(name = "ATTRIBUTE19")
	public String getAttribute19() {
		return attribute19;
	}

	/**
	 * Set attribute19
	 */
	public void setAttribute19(String attribute19) {
		this.attribute19 = attribute19;
		addValidField("attribute19");
	}

	/**
	 * Get attribute20
	 */
	@Column(name = "ATTRIBUTE20")
	public String getAttribute20() {
		return attribute20;
	}

	/**
	 * Set attribute20
	 */
	public void setAttribute20(String attribute20) {
		this.attribute20 = attribute20;
		addValidField("attribute20");
	}

	/**
	 * Get testNum1
	 */
	@Column(name = "TEST_NUM1")
	public Long getTestNum1() {
		return testNum1;
	}

	/**
	 * Set testNum1
	 */
	public void setTestNum1(Long testNum1) {
		this.testNum1 = testNum1;
		addValidField("testNum1");
	}

	/**
	 * Get testNum2
	 */
	@Column(name = "TEST_NUM2")
	public Long getTestNum2() {
		return testNum2;
	}

	/**
	 * Set testNum2
	 */
	public void setTestNum2(Long testNum2) {
		this.testNum2 = testNum2;
		addValidField("testNum2");
	}

}
