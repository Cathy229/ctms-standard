package com.sinotrans.oms.fees.model;

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
 * Model class for EiEoimAuditBack
 */
@Entity
@Table(name = "EI_EOIM_AUDIT_BACK")
public class EiEoimAuditBackModel extends BaseModel implements OperationLog {

	//eiabId
	private Long eiabId;
	//eiabEscoId
	private Long eiabEscoId;
	//eiabEscoCompanyNo
	private String eiabEscoCompanyNo;
	//eiabEbbuCode
	private String eiabEbbuCode;
	//eiabEoimSourceId
	private String eiabEoimSourceId;
	//eiabEoimStatus
	private Long eiabEoimStatus;
	//eiabInfo
	private String eiabInfo;
	//eiabSubstr1
	private String eiabSubstr1;
	//eiabSubstr2
	private String eiabSubstr2;
	//eiabSubstr3
	private String eiabSubstr3;
	//eiabSubstr4
	private String eiabSubstr4;
	//eiabSubstr5
	private String eiabSubstr5;
	//eiabSubstr6
	private String eiabSubstr6;
	//eiabSubstr7
	private String eiabSubstr7;
	//eiabSubstr8
	private String eiabSubstr8;
	//eiabSubdate1
	private Date eiabSubdate1;
	//eiabSubdate2
	private Date eiabSubdate2;
	//eiabSubdate3
	private Date eiabSubdate3;
	//eiabSubdate4
	private Date eiabSubdate4;
	//eiabSubnum1
	private Long eiabSubnum1;
	//eiabSubnum2
	private Long eiabSubnum2;
	//eiabSubnum3
	private Long eiabSubnum3;
	//eiabSubnum4
	private Long eiabSubnum4;
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
	//hdFilename
	private String hdFilename;
	//hdBatchnumber
	private String hdBatchnumber;
	//hdSymbol
	private String hdSymbol;
	//hdBeginprocessingtime
	private Date hdBeginprocessingtime;
	//hdLastmodifiedtime
	private Date hdLastmodifiedtime;
	//hdInformation
	private String hdInformation;

	/**
	 * Get eiabId
	 */
	@Column(name = "EIAB_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEiabId() {
		return eiabId;
	}

	/**
	 * Set eiabId
	 */
	public void setEiabId(Long eiabId) {
		this.eiabId = eiabId;
		addValidField("eiabId");
	}

	/**
	 * Get eiabEscoId
	 */
	@Column(name = "EIAB_ESCO_ID")
	public Long getEiabEscoId() {
		return eiabEscoId;
	}

	/**
	 * Set eiabEscoId
	 */
	public void setEiabEscoId(Long eiabEscoId) {
		this.eiabEscoId = eiabEscoId;
		addValidField("eiabEscoId");
	}

	/**
	 * Get eiabEscoCompanyNo
	 */
	@Column(name = "EIAB_ESCO_COMPANY_NO")
	public String getEiabEscoCompanyNo() {
		return eiabEscoCompanyNo;
	}

	/**
	 * Set eiabEscoCompanyNo
	 */
	public void setEiabEscoCompanyNo(String eiabEscoCompanyNo) {
		this.eiabEscoCompanyNo = eiabEscoCompanyNo;
		addValidField("eiabEscoCompanyNo");
	}

	/**
	 * Get eiabEbbuCode
	 */
	@Column(name = "EIAB_EBBU_CODE")
	public String getEiabEbbuCode() {
		return eiabEbbuCode;
	}

	/**
	 * Set eiabEbbuCode
	 */
	public void setEiabEbbuCode(String eiabEbbuCode) {
		this.eiabEbbuCode = eiabEbbuCode;
		addValidField("eiabEbbuCode");
	}

	/**
	 * Get eiabEoimSourceId
	 */
	@Column(name = "EIAB_EOIM_SOURCE_ID")
	public String getEiabEoimSourceId() {
		return eiabEoimSourceId;
	}

	/**
	 * Set eiabEoimSourceId
	 */
	public void setEiabEoimSourceId(String eiabEoimSourceId) {
		this.eiabEoimSourceId = eiabEoimSourceId;
		addValidField("eiabEoimSourceId");
	}

	/**
	 * Get eiabEoimStatus
	 */
	@Column(name = "EIAB_EOIM_STATUS")
	public Long getEiabEoimStatus() {
		return eiabEoimStatus;
	}

	/**
	 * Set eiabEoimStatus
	 */
	public void setEiabEoimStatus(Long eiabEoimStatus) {
		this.eiabEoimStatus = eiabEoimStatus;
		addValidField("eiabEoimStatus");
	}

	/**
	 * Get eiabInfo
	 */
	@Column(name = "EIAB_INFO")
	public String getEiabInfo() {
		return eiabInfo;
	}

	/**
	 * Set eiabInfo
	 */
	public void setEiabInfo(String eiabInfo) {
		this.eiabInfo = eiabInfo;
		addValidField("eiabInfo");
	}

	/**
	 * Get eiabSubstr1
	 */
	@Column(name = "EIAB_SUBSTR1")
	public String getEiabSubstr1() {
		return eiabSubstr1;
	}

	/**
	 * Set eiabSubstr1
	 */
	public void setEiabSubstr1(String eiabSubstr1) {
		this.eiabSubstr1 = eiabSubstr1;
		addValidField("eiabSubstr1");
	}

	/**
	 * Get eiabSubstr2
	 */
	@Column(name = "EIAB_SUBSTR2")
	public String getEiabSubstr2() {
		return eiabSubstr2;
	}

	/**
	 * Set eiabSubstr2
	 */
	public void setEiabSubstr2(String eiabSubstr2) {
		this.eiabSubstr2 = eiabSubstr2;
		addValidField("eiabSubstr2");
	}

	/**
	 * Get eiabSubstr3
	 */
	@Column(name = "EIAB_SUBSTR3")
	public String getEiabSubstr3() {
		return eiabSubstr3;
	}

	/**
	 * Set eiabSubstr3
	 */
	public void setEiabSubstr3(String eiabSubstr3) {
		this.eiabSubstr3 = eiabSubstr3;
		addValidField("eiabSubstr3");
	}

	/**
	 * Get eiabSubstr4
	 */
	@Column(name = "EIAB_SUBSTR4")
	public String getEiabSubstr4() {
		return eiabSubstr4;
	}

	/**
	 * Set eiabSubstr4
	 */
	public void setEiabSubstr4(String eiabSubstr4) {
		this.eiabSubstr4 = eiabSubstr4;
		addValidField("eiabSubstr4");
	}

	/**
	 * Get eiabSubstr5
	 */
	@Column(name = "EIAB_SUBSTR5")
	public String getEiabSubstr5() {
		return eiabSubstr5;
	}

	/**
	 * Set eiabSubstr5
	 */
	public void setEiabSubstr5(String eiabSubstr5) {
		this.eiabSubstr5 = eiabSubstr5;
		addValidField("eiabSubstr5");
	}

	/**
	 * Get eiabSubstr6
	 */
	@Column(name = "EIAB_SUBSTR6")
	public String getEiabSubstr6() {
		return eiabSubstr6;
	}

	/**
	 * Set eiabSubstr6
	 */
	public void setEiabSubstr6(String eiabSubstr6) {
		this.eiabSubstr6 = eiabSubstr6;
		addValidField("eiabSubstr6");
	}

	/**
	 * Get eiabSubstr7
	 */
	@Column(name = "EIAB_SUBSTR7")
	public String getEiabSubstr7() {
		return eiabSubstr7;
	}

	/**
	 * Set eiabSubstr7
	 */
	public void setEiabSubstr7(String eiabSubstr7) {
		this.eiabSubstr7 = eiabSubstr7;
		addValidField("eiabSubstr7");
	}

	/**
	 * Get eiabSubstr8
	 */
	@Column(name = "EIAB_SUBSTR8")
	public String getEiabSubstr8() {
		return eiabSubstr8;
	}

	/**
	 * Set eiabSubstr8
	 */
	public void setEiabSubstr8(String eiabSubstr8) {
		this.eiabSubstr8 = eiabSubstr8;
		addValidField("eiabSubstr8");
	}

	/**
	 * Get eiabSubdate1
	 */
	@Column(name = "EIAB_SUBDATE1")
	public Date getEiabSubdate1() {
		return eiabSubdate1;
	}

	/**
	 * Set eiabSubdate1
	 */
	public void setEiabSubdate1(Date eiabSubdate1) {
		this.eiabSubdate1 = eiabSubdate1;
		addValidField("eiabSubdate1");
	}

	/**
	 * Get eiabSubdate2
	 */
	@Column(name = "EIAB_SUBDATE2")
	public Date getEiabSubdate2() {
		return eiabSubdate2;
	}

	/**
	 * Set eiabSubdate2
	 */
	public void setEiabSubdate2(Date eiabSubdate2) {
		this.eiabSubdate2 = eiabSubdate2;
		addValidField("eiabSubdate2");
	}

	/**
	 * Get eiabSubdate3
	 */
	@Column(name = "EIAB_SUBDATE3")
	public Date getEiabSubdate3() {
		return eiabSubdate3;
	}

	/**
	 * Set eiabSubdate3
	 */
	public void setEiabSubdate3(Date eiabSubdate3) {
		this.eiabSubdate3 = eiabSubdate3;
		addValidField("eiabSubdate3");
	}

	/**
	 * Get eiabSubdate4
	 */
	@Column(name = "EIAB_SUBDATE4")
	public Date getEiabSubdate4() {
		return eiabSubdate4;
	}

	/**
	 * Set eiabSubdate4
	 */
	public void setEiabSubdate4(Date eiabSubdate4) {
		this.eiabSubdate4 = eiabSubdate4;
		addValidField("eiabSubdate4");
	}

	/**
	 * Get eiabSubnum1
	 */
	@Column(name = "EIAB_SUBNUM1")
	public Long getEiabSubnum1() {
		return eiabSubnum1;
	}

	/**
	 * Set eiabSubnum1
	 */
	public void setEiabSubnum1(Long eiabSubnum1) {
		this.eiabSubnum1 = eiabSubnum1;
		addValidField("eiabSubnum1");
	}

	/**
	 * Get eiabSubnum2
	 */
	@Column(name = "EIAB_SUBNUM2")
	public Long getEiabSubnum2() {
		return eiabSubnum2;
	}

	/**
	 * Set eiabSubnum2
	 */
	public void setEiabSubnum2(Long eiabSubnum2) {
		this.eiabSubnum2 = eiabSubnum2;
		addValidField("eiabSubnum2");
	}

	/**
	 * Get eiabSubnum3
	 */
	@Column(name = "EIAB_SUBNUM3")
	public Long getEiabSubnum3() {
		return eiabSubnum3;
	}

	/**
	 * Set eiabSubnum3
	 */
	public void setEiabSubnum3(Long eiabSubnum3) {
		this.eiabSubnum3 = eiabSubnum3;
		addValidField("eiabSubnum3");
	}

	/**
	 * Get eiabSubnum4
	 */
	@Column(name = "EIAB_SUBNUM4")
	public Long getEiabSubnum4() {
		return eiabSubnum4;
	}

	/**
	 * Set eiabSubnum4
	 */
	public void setEiabSubnum4(Long eiabSubnum4) {
		this.eiabSubnum4 = eiabSubnum4;
		addValidField("eiabSubnum4");
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
	 * Get hdFilename
	 */
	@Column(name = "HD_FILENAME")
	public String getHdFilename() {
		return hdFilename;
	}

	/**
	 * Set hdFilename
	 */
	public void setHdFilename(String hdFilename) {
		this.hdFilename = hdFilename;
		addValidField("hdFilename");
	}

	/**
	 * Get hdBatchnumber
	 */
	@Column(name = "HD_BATCHNUMBER")
	public String getHdBatchnumber() {
		return hdBatchnumber;
	}

	/**
	 * Set hdBatchnumber
	 */
	public void setHdBatchnumber(String hdBatchnumber) {
		this.hdBatchnumber = hdBatchnumber;
		addValidField("hdBatchnumber");
	}

	/**
	 * Get hdSymbol
	 */
	@Column(name = "HD_SYMBOL")
	public String getHdSymbol() {
		return hdSymbol;
	}

	/**
	 * Set hdSymbol
	 */
	public void setHdSymbol(String hdSymbol) {
		this.hdSymbol = hdSymbol;
		addValidField("hdSymbol");
	}

	/**
	 * Get hdBeginprocessingtime
	 */
	@Column(name = "HD_BEGINPROCESSINGTIME")
	public Date getHdBeginprocessingtime() {
		return hdBeginprocessingtime;
	}

	/**
	 * Set hdBeginprocessingtime
	 */
	public void setHdBeginprocessingtime(Date hdBeginprocessingtime) {
		this.hdBeginprocessingtime = hdBeginprocessingtime;
		addValidField("hdBeginprocessingtime");
	}

	/**
	 * Get hdLastmodifiedtime
	 */
	@Column(name = "HD_LASTMODIFIEDTIME")
	public Date getHdLastmodifiedtime() {
		return hdLastmodifiedtime;
	}

	/**
	 * Set hdLastmodifiedtime
	 */
	public void setHdLastmodifiedtime(Date hdLastmodifiedtime) {
		this.hdLastmodifiedtime = hdLastmodifiedtime;
		addValidField("hdLastmodifiedtime");
	}

	/**
	 * Get hdInformation
	 */
	@Column(name = "HD_INFORMATION")
	public String getHdInformation() {
		return hdInformation;
	}

	/**
	 * Set hdInformation
	 */
	public void setHdInformation(String hdInformation) {
		this.hdInformation = hdInformation;
		addValidField("hdInformation");
	}

}
