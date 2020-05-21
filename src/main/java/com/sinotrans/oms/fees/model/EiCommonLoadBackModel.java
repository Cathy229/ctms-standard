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
 * Model class for EiCommonLoadBack
 */
@Entity
@Table(name = "EI_COMMON_LOAD_BACK")
public class EiCommonLoadBackModel extends BaseModel implements OperationLog {

	//eclbId
	private Long eclbId;
	//eclbSourceId
	private String eclbSourceId;
	//eclbSourceId1
	private String eclbSourceId1;
	//eclbSourceStr1
	private String eclbSourceStr1;
	//eclbSourceStr2
	private String eclbSourceStr2;
	//eclbType
	private String eclbType;
	//eclbEscoCompanyNo
	private String eclbEscoCompanyNo;
	//eclbEbbuCode
	private String eclbEbbuCode;
	//eclbStatus
	private Long eclbStatus;
	//eclbInfo
	private String eclbInfo;
	//eclbRemark
	private String eclbRemark;
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
	//eclbSubstr1
	private String eclbSubstr1;
	//eclbSubstr2
	private String eclbSubstr2;
	//eclbSubstr3
	private String eclbSubstr3;
	//eclbSubstr4
	private String eclbSubstr4;
	//eclbSubstr5
	private String eclbSubstr5;
	//eclbSubstr6
	private String eclbSubstr6;
	//eclbSubstr7
	private String eclbSubstr7;
	//eclbSubstr8
	private String eclbSubstr8;
	//eclbSubstr9
	private String eclbSubstr9;
	//eclbSubstr10
	private String eclbSubstr10;
	//eclbSubstr11
	private String eclbSubstr11;
	//eclbSubstr12
	private String eclbSubstr12;
	//eclbSubstr13
	private String eclbSubstr13;
	//eclbSubstr14
	private String eclbSubstr14;
	//eclbSubstr15
	private String eclbSubstr15;
	//eclbSubstr16
	private String eclbSubstr16;
	//eclbSubstr17
	private String eclbSubstr17;
	//eclbSubstr18
	private String eclbSubstr18;
	//eclbSubstr19
	private String eclbSubstr19;
	//eclbSubstr20
	private String eclbSubstr20;
	//eclbSubdate1
	private Date eclbSubdate1;
	//eclbSubdate2
	private Date eclbSubdate2;
	//eclbSubdate3
	private Date eclbSubdate3;
	//eclbSubdate4
	private Date eclbSubdate4;
	//eclbSubnum1
	private Long eclbSubnum1;
	//eclbSubnum2
	private Long eclbSubnum2;
	//eclbSubnum3
	private Long eclbSubnum3;
	//eclbSubnum4
	private Long eclbSubnum4;
	//eclbOperationNode
	private String eclbOperationNode;
	//eclbBatchNumber
	private String eclbBatchNumber;

	/**
	 * Get eclbId
	 */
	@Column(name = "ECLB_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEclbId() {
		return eclbId;
	}

	/**
	 * Set eclbId
	 */
	public void setEclbId(Long eclbId) {
		this.eclbId = eclbId;
		addValidField("eclbId");
	}

	/**
	 * Get eclbSourceId
	 */
	@Column(name = "ECLB_SOURCE_ID")
	public String getEclbSourceId() {
		return eclbSourceId;
	}

	/**
	 * Set eclbSourceId
	 */
	public void setEclbSourceId(String eclbSourceId) {
		this.eclbSourceId = eclbSourceId;
		addValidField("eclbSourceId");
	}

	/**
	 * Get eclbSourceId1
	 */
	@Column(name = "ECLB_SOURCE_ID1")
	public String getEclbSourceId1() {
		return eclbSourceId1;
	}

	/**
	 * Set eclbSourceId1
	 */
	public void setEclbSourceId1(String eclbSourceId1) {
		this.eclbSourceId1 = eclbSourceId1;
		addValidField("eclbSourceId1");
	}

	/**
	 * Get eclbSourceStr1
	 */
	@Column(name = "ECLB_SOURCE_STR1")
	public String getEclbSourceStr1() {
		return eclbSourceStr1;
	}

	/**
	 * Set eclbSourceStr1
	 */
	public void setEclbSourceStr1(String eclbSourceStr1) {
		this.eclbSourceStr1 = eclbSourceStr1;
		addValidField("eclbSourceStr1");
	}

	/**
	 * Get eclbSourceStr2
	 */
	@Column(name = "ECLB_SOURCE_STR2")
	public String getEclbSourceStr2() {
		return eclbSourceStr2;
	}

	/**
	 * Set eclbSourceStr2
	 */
	public void setEclbSourceStr2(String eclbSourceStr2) {
		this.eclbSourceStr2 = eclbSourceStr2;
		addValidField("eclbSourceStr2");
	}

	/**
	 * Get eclbType
	 */
	@Column(name = "ECLB_TYPE")
	public String getEclbType() {
		return eclbType;
	}

	/**
	 * Set eclbType
	 */
	public void setEclbType(String eclbType) {
		this.eclbType = eclbType;
		addValidField("eclbType");
	}

	/**
	 * Get eclbEscoCompanyNo
	 */
	@Column(name = "ECLB_ESCO_COMPANY_NO")
	public String getEclbEscoCompanyNo() {
		return eclbEscoCompanyNo;
	}

	/**
	 * Set eclbEscoCompanyNo
	 */
	public void setEclbEscoCompanyNo(String eclbEscoCompanyNo) {
		this.eclbEscoCompanyNo = eclbEscoCompanyNo;
		addValidField("eclbEscoCompanyNo");
	}

	/**
	 * Get eclbEbbuCode
	 */
	@Column(name = "ECLB_EBBU_CODE")
	public String getEclbEbbuCode() {
		return eclbEbbuCode;
	}

	/**
	 * Set eclbEbbuCode
	 */
	public void setEclbEbbuCode(String eclbEbbuCode) {
		this.eclbEbbuCode = eclbEbbuCode;
		addValidField("eclbEbbuCode");
	}

	/**
	 * Get eclbStatus
	 */
	@Column(name = "ECLB_STATUS")
	public Long getEclbStatus() {
		return eclbStatus;
	}

	/**
	 * Set eclbStatus
	 */
	public void setEclbStatus(Long eclbStatus) {
		this.eclbStatus = eclbStatus;
		addValidField("eclbStatus");
	}

	/**
	 * Get eclbInfo
	 */
	@Column(name = "ECLB_INFO")
	public String getEclbInfo() {
		return eclbInfo;
	}

	/**
	 * Set eclbInfo
	 */
	public void setEclbInfo(String eclbInfo) {
		this.eclbInfo = eclbInfo;
		addValidField("eclbInfo");
	}

	/**
	 * Get eclbRemark
	 */
	@Column(name = "ECLB_REMARK")
	public String getEclbRemark() {
		return eclbRemark;
	}

	/**
	 * Set eclbRemark
	 */
	public void setEclbRemark(String eclbRemark) {
		this.eclbRemark = eclbRemark;
		addValidField("eclbRemark");
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
	 * Get eclbSubstr1
	 */
	@Column(name = "ECLB_SUBSTR1")
	public String getEclbSubstr1() {
		return eclbSubstr1;
	}

	/**
	 * Set eclbSubstr1
	 */
	public void setEclbSubstr1(String eclbSubstr1) {
		this.eclbSubstr1 = eclbSubstr1;
		addValidField("eclbSubstr1");
	}

	/**
	 * Get eclbSubstr2
	 */
	@Column(name = "ECLB_SUBSTR2")
	public String getEclbSubstr2() {
		return eclbSubstr2;
	}

	/**
	 * Set eclbSubstr2
	 */
	public void setEclbSubstr2(String eclbSubstr2) {
		this.eclbSubstr2 = eclbSubstr2;
		addValidField("eclbSubstr2");
	}

	/**
	 * Get eclbSubstr3
	 */
	@Column(name = "ECLB_SUBSTR3")
	public String getEclbSubstr3() {
		return eclbSubstr3;
	}

	/**
	 * Set eclbSubstr3
	 */
	public void setEclbSubstr3(String eclbSubstr3) {
		this.eclbSubstr3 = eclbSubstr3;
		addValidField("eclbSubstr3");
	}

	/**
	 * Get eclbSubstr4
	 */
	@Column(name = "ECLB_SUBSTR4")
	public String getEclbSubstr4() {
		return eclbSubstr4;
	}

	/**
	 * Set eclbSubstr4
	 */
	public void setEclbSubstr4(String eclbSubstr4) {
		this.eclbSubstr4 = eclbSubstr4;
		addValidField("eclbSubstr4");
	}

	/**
	 * Get eclbSubstr5
	 */
	@Column(name = "ECLB_SUBSTR5")
	public String getEclbSubstr5() {
		return eclbSubstr5;
	}

	/**
	 * Set eclbSubstr5
	 */
	public void setEclbSubstr5(String eclbSubstr5) {
		this.eclbSubstr5 = eclbSubstr5;
		addValidField("eclbSubstr5");
	}

	/**
	 * Get eclbSubstr6
	 */
	@Column(name = "ECLB_SUBSTR6")
	public String getEclbSubstr6() {
		return eclbSubstr6;
	}

	/**
	 * Set eclbSubstr6
	 */
	public void setEclbSubstr6(String eclbSubstr6) {
		this.eclbSubstr6 = eclbSubstr6;
		addValidField("eclbSubstr6");
	}

	/**
	 * Get eclbSubstr7
	 */
	@Column(name = "ECLB_SUBSTR7")
	public String getEclbSubstr7() {
		return eclbSubstr7;
	}

	/**
	 * Set eclbSubstr7
	 */
	public void setEclbSubstr7(String eclbSubstr7) {
		this.eclbSubstr7 = eclbSubstr7;
		addValidField("eclbSubstr7");
	}

	/**
	 * Get eclbSubstr8
	 */
	@Column(name = "ECLB_SUBSTR8")
	public String getEclbSubstr8() {
		return eclbSubstr8;
	}

	/**
	 * Set eclbSubstr8
	 */
	public void setEclbSubstr8(String eclbSubstr8) {
		this.eclbSubstr8 = eclbSubstr8;
		addValidField("eclbSubstr8");
	}

	/**
	 * Get eclbSubstr9
	 */
	@Column(name = "ECLB_SUBSTR9")
	public String getEclbSubstr9() {
		return eclbSubstr9;
	}

	/**
	 * Set eclbSubstr9
	 */
	public void setEclbSubstr9(String eclbSubstr9) {
		this.eclbSubstr9 = eclbSubstr9;
		addValidField("eclbSubstr9");
	}

	/**
	 * Get eclbSubstr10
	 */
	@Column(name = "ECLB_SUBSTR10")
	public String getEclbSubstr10() {
		return eclbSubstr10;
	}

	/**
	 * Set eclbSubstr10
	 */
	public void setEclbSubstr10(String eclbSubstr10) {
		this.eclbSubstr10 = eclbSubstr10;
		addValidField("eclbSubstr10");
	}

	/**
	 * Get eclbSubstr11
	 */
	@Column(name = "ECLB_SUBSTR11")
	public String getEclbSubstr11() {
		return eclbSubstr11;
	}

	/**
	 * Set eclbSubstr11
	 */
	public void setEclbSubstr11(String eclbSubstr11) {
		this.eclbSubstr11 = eclbSubstr11;
		addValidField("eclbSubstr11");
	}

	/**
	 * Get eclbSubstr12
	 */
	@Column(name = "ECLB_SUBSTR12")
	public String getEclbSubstr12() {
		return eclbSubstr12;
	}

	/**
	 * Set eclbSubstr12
	 */
	public void setEclbSubstr12(String eclbSubstr12) {
		this.eclbSubstr12 = eclbSubstr12;
		addValidField("eclbSubstr12");
	}

	/**
	 * Get eclbSubstr13
	 */
	@Column(name = "ECLB_SUBSTR13")
	public String getEclbSubstr13() {
		return eclbSubstr13;
	}

	/**
	 * Set eclbSubstr13
	 */
	public void setEclbSubstr13(String eclbSubstr13) {
		this.eclbSubstr13 = eclbSubstr13;
		addValidField("eclbSubstr13");
	}

	/**
	 * Get eclbSubstr14
	 */
	@Column(name = "ECLB_SUBSTR14")
	public String getEclbSubstr14() {
		return eclbSubstr14;
	}

	/**
	 * Set eclbSubstr14
	 */
	public void setEclbSubstr14(String eclbSubstr14) {
		this.eclbSubstr14 = eclbSubstr14;
		addValidField("eclbSubstr14");
	}

	/**
	 * Get eclbSubstr15
	 */
	@Column(name = "ECLB_SUBSTR15")
	public String getEclbSubstr15() {
		return eclbSubstr15;
	}

	/**
	 * Set eclbSubstr15
	 */
	public void setEclbSubstr15(String eclbSubstr15) {
		this.eclbSubstr15 = eclbSubstr15;
		addValidField("eclbSubstr15");
	}

	/**
	 * Get eclbSubstr16
	 */
	@Column(name = "ECLB_SUBSTR16")
	public String getEclbSubstr16() {
		return eclbSubstr16;
	}

	/**
	 * Set eclbSubstr16
	 */
	public void setEclbSubstr16(String eclbSubstr16) {
		this.eclbSubstr16 = eclbSubstr16;
		addValidField("eclbSubstr16");
	}

	/**
	 * Get eclbSubstr17
	 */
	@Column(name = "ECLB_SUBSTR17")
	public String getEclbSubstr17() {
		return eclbSubstr17;
	}

	/**
	 * Set eclbSubstr17
	 */
	public void setEclbSubstr17(String eclbSubstr17) {
		this.eclbSubstr17 = eclbSubstr17;
		addValidField("eclbSubstr17");
	}

	/**
	 * Get eclbSubstr18
	 */
	@Column(name = "ECLB_SUBSTR18")
	public String getEclbSubstr18() {
		return eclbSubstr18;
	}

	/**
	 * Set eclbSubstr18
	 */
	public void setEclbSubstr18(String eclbSubstr18) {
		this.eclbSubstr18 = eclbSubstr18;
		addValidField("eclbSubstr18");
	}

	/**
	 * Get eclbSubstr19
	 */
	@Column(name = "ECLB_SUBSTR19")
	public String getEclbSubstr19() {
		return eclbSubstr19;
	}

	/**
	 * Set eclbSubstr19
	 */
	public void setEclbSubstr19(String eclbSubstr19) {
		this.eclbSubstr19 = eclbSubstr19;
		addValidField("eclbSubstr19");
	}

	/**
	 * Get eclbSubstr20
	 */
	@Column(name = "ECLB_SUBSTR20")
	public String getEclbSubstr20() {
		return eclbSubstr20;
	}

	/**
	 * Set eclbSubstr20
	 */
	public void setEclbSubstr20(String eclbSubstr20) {
		this.eclbSubstr20 = eclbSubstr20;
		addValidField("eclbSubstr20");
	}

	/**
	 * Get eclbSubdate1
	 */
	@Column(name = "ECLB_SUBDATE1")
	public Date getEclbSubdate1() {
		return eclbSubdate1;
	}

	/**
	 * Set eclbSubdate1
	 */
	public void setEclbSubdate1(Date eclbSubdate1) {
		this.eclbSubdate1 = eclbSubdate1;
		addValidField("eclbSubdate1");
	}

	/**
	 * Get eclbSubdate2
	 */
	@Column(name = "ECLB_SUBDATE2")
	public Date getEclbSubdate2() {
		return eclbSubdate2;
	}

	/**
	 * Set eclbSubdate2
	 */
	public void setEclbSubdate2(Date eclbSubdate2) {
		this.eclbSubdate2 = eclbSubdate2;
		addValidField("eclbSubdate2");
	}

	/**
	 * Get eclbSubdate3
	 */
	@Column(name = "ECLB_SUBDATE3")
	public Date getEclbSubdate3() {
		return eclbSubdate3;
	}

	/**
	 * Set eclbSubdate3
	 */
	public void setEclbSubdate3(Date eclbSubdate3) {
		this.eclbSubdate3 = eclbSubdate3;
		addValidField("eclbSubdate3");
	}

	/**
	 * Get eclbSubdate4
	 */
	@Column(name = "ECLB_SUBDATE4")
	public Date getEclbSubdate4() {
		return eclbSubdate4;
	}

	/**
	 * Set eclbSubdate4
	 */
	public void setEclbSubdate4(Date eclbSubdate4) {
		this.eclbSubdate4 = eclbSubdate4;
		addValidField("eclbSubdate4");
	}

	/**
	 * Get eclbSubnum1
	 */
	@Column(name = "ECLB_SUBNUM1")
	public Long getEclbSubnum1() {
		return eclbSubnum1;
	}

	/**
	 * Set eclbSubnum1
	 */
	public void setEclbSubnum1(Long eclbSubnum1) {
		this.eclbSubnum1 = eclbSubnum1;
		addValidField("eclbSubnum1");
	}

	/**
	 * Get eclbSubnum2
	 */
	@Column(name = "ECLB_SUBNUM2")
	public Long getEclbSubnum2() {
		return eclbSubnum2;
	}

	/**
	 * Set eclbSubnum2
	 */
	public void setEclbSubnum2(Long eclbSubnum2) {
		this.eclbSubnum2 = eclbSubnum2;
		addValidField("eclbSubnum2");
	}

	/**
	 * Get eclbSubnum3
	 */
	@Column(name = "ECLB_SUBNUM3")
	public Long getEclbSubnum3() {
		return eclbSubnum3;
	}

	/**
	 * Set eclbSubnum3
	 */
	public void setEclbSubnum3(Long eclbSubnum3) {
		this.eclbSubnum3 = eclbSubnum3;
		addValidField("eclbSubnum3");
	}

	/**
	 * Get eclbSubnum4
	 */
	@Column(name = "ECLB_SUBNUM4")
	public Long getEclbSubnum4() {
		return eclbSubnum4;
	}

	/**
	 * Set eclbSubnum4
	 */
	public void setEclbSubnum4(Long eclbSubnum4) {
		this.eclbSubnum4 = eclbSubnum4;
		addValidField("eclbSubnum4");
	}

	/**
	 * Get eclbOperationNode
	 */
	@Column(name = "ECLB_OPERATION_NODE")
	public String getEclbOperationNode() {
		return eclbOperationNode;
	}

	/**
	 * Set eclbOperationNode
	 */
	public void setEclbOperationNode(String eclbOperationNode) {
		this.eclbOperationNode = eclbOperationNode;
		addValidField("eclbOperationNode");
	}

	/**
	 * Get eclbBatchNumber
	 */
	@Column(name = "ECLB_BATCH_NUMBER")
	public String getEclbBatchNumber() {
		return eclbBatchNumber;
	}

	/**
	 * Set eclbBatchNumber
	 */
	public void setEclbBatchNumber(String eclbBatchNumber) {
		this.eclbBatchNumber = eclbBatchNumber;
		addValidField("eclbBatchNumber");
	}

}
