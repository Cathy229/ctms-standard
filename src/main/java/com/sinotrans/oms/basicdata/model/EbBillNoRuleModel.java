package com.sinotrans.oms.basicdata.model;

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
 * Model class for EbBillNoRule
 */
@Entity
@Table(name = "EB_BILL_NO_RULE")
public class EbBillNoRuleModel extends BaseModel implements OperationLog {

	//ebbrId
	private Long ebbrId;
	//ebbrEscoId
	private Long ebbrEscoId;
	//ebbrEbpjId
	private Long ebbrEbpjId;
	//ebbrName
	private String ebbrName;
	//ebbrTable
	private String ebbrTable;
	//ebbrDesc
	private String ebbrDesc;
	//ebbrPrefix
	private String ebbrPrefix;
	//ebbrIsDateShow
	private Long ebbrIsDateShow;
	//ebbrDateFormat
	private String ebbrDateFormat;
	//ebbrNoLen
	private String ebbrNoLen;
	//ebbrCurNo
	private String ebbrCurNo;
	//ebbrClearType
	private String ebbrClearType;
	//ebbrLastCreatorDate
	private Date ebbrLastCreatorDate;
	//ebbrSubstr1
	private String ebbrSubstr1;
	//ebbrSubstr2
	private String ebbrSubstr2;
	//ebbrSubstr3
	private String ebbrSubstr3;
	//ebbrSubstr4
	private String ebbrSubstr4;
	//ebbrSubstr5
	private String ebbrSubstr5;
	//ebbrSubstr6
	private String ebbrSubstr6;
	//ebbrSubstr7
	private String ebbrSubstr7;
	//ebbrSubstr8
	private String ebbrSubstr8;
	//ebbrSubdate1
	private Date ebbrSubdate1;
	//ebbrSubdate2
	private Date ebbrSubdate2;
	//ebbrSubdate3
	private Date ebbrSubdate3;
	//ebbrSubdate4
	private Date ebbrSubdate4;
	//ebbrSubdate5
	private Date ebbrSubdate5;
	//ebbrSubnum1
	private Long ebbrSubnum1;
	//ebbrSubnum2
	private Long ebbrSubnum2;
	//ebbrSubnum3
	private Long ebbrSubnum3;
	//ebbrSubnum4
	private Long ebbrSubnum4;
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
	//recStatus
	private Long recStatus;

	/**
	 * Get ebbrId
	 */
	@Column(name = "EBBR_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbbrId() {
		return ebbrId;
	}

	/**
	 * Set ebbrId
	 */
	public void setEbbrId(Long ebbrId) {
		this.ebbrId = ebbrId;
		addValidField("ebbrId");
	}

	/**
	 * Get ebbrEscoId
	 */
	@Column(name = "EBBR_ESCO_ID")
	public Long getEbbrEscoId() {
		return ebbrEscoId;
	}

	/**
	 * Set ebbrEscoId
	 */
	public void setEbbrEscoId(Long ebbrEscoId) {
		this.ebbrEscoId = ebbrEscoId;
		addValidField("ebbrEscoId");
	}

	/**
	 * Get ebbrEbpjId
	 */
	@Column(name = "EBBR_EBPJ_ID")
	public Long getEbbrEbpjId() {
		return ebbrEbpjId;
	}

	/**
	 * Set ebbrEbpjId
	 */
	public void setEbbrEbpjId(Long ebbrEbpjId) {
		this.ebbrEbpjId = ebbrEbpjId;
		addValidField("ebbrEbpjId");
	}

	/**
	 * Get ebbrName
	 */
	@Column(name = "EBBR_NAME")
	public String getEbbrName() {
		return ebbrName;
	}

	/**
	 * Set ebbrName
	 */
	public void setEbbrName(String ebbrName) {
		this.ebbrName = ebbrName;
		addValidField("ebbrName");
	}

	/**
	 * Get ebbrTable
	 */
	@Column(name = "EBBR_TABLE")
	public String getEbbrTable() {
		return ebbrTable;
	}

	/**
	 * Set ebbrTable
	 */
	public void setEbbrTable(String ebbrTable) {
		this.ebbrTable = ebbrTable;
		addValidField("ebbrTable");
	}

	/**
	 * Get ebbrDesc
	 */
	@Column(name = "EBBR_DESC")
	public String getEbbrDesc() {
		return ebbrDesc;
	}

	/**
	 * Set ebbrDesc
	 */
	public void setEbbrDesc(String ebbrDesc) {
		this.ebbrDesc = ebbrDesc;
		addValidField("ebbrDesc");
	}

	/**
	 * Get ebbrPrefix
	 */
	@Column(name = "EBBR_PREFIX")
	public String getEbbrPrefix() {
		return ebbrPrefix;
	}

	/**
	 * Set ebbrPrefix
	 */
	public void setEbbrPrefix(String ebbrPrefix) {
		this.ebbrPrefix = ebbrPrefix;
		addValidField("ebbrPrefix");
	}

	/**
	 * Get ebbrIsDateShow
	 */
	@Column(name = "EBBR_IS_DATE_SHOW")
	public Long getEbbrIsDateShow() {
		return ebbrIsDateShow;
	}

	/**
	 * Set ebbrIsDateShow
	 */
	public void setEbbrIsDateShow(Long ebbrIsDateShow) {
		this.ebbrIsDateShow = ebbrIsDateShow;
		addValidField("ebbrIsDateShow");
	}

	/**
	 * Get ebbrDateFormat
	 */
	@Column(name = "EBBR_DATE_FORMAT")
	public String getEbbrDateFormat() {
		return ebbrDateFormat;
	}

	/**
	 * Set ebbrDateFormat
	 */
	public void setEbbrDateFormat(String ebbrDateFormat) {
		this.ebbrDateFormat = ebbrDateFormat;
		addValidField("ebbrDateFormat");
	}

	/**
	 * Get ebbrNoLen
	 */
	@Column(name = "EBBR_NO_LEN")
	public String getEbbrNoLen() {
		return ebbrNoLen;
	}

	/**
	 * Set ebbrNoLen
	 */
	public void setEbbrNoLen(String ebbrNoLen) {
		this.ebbrNoLen = ebbrNoLen;
		addValidField("ebbrNoLen");
	}

	/**
	 * Get ebbrCurNo
	 */
	@Column(name = "EBBR_CUR_NO")
	public String getEbbrCurNo() {
		return ebbrCurNo;
	}

	/**
	 * Set ebbrCurNo
	 */
	public void setEbbrCurNo(String ebbrCurNo) {
		this.ebbrCurNo = ebbrCurNo;
		addValidField("ebbrCurNo");
	}

	/**
	 * Get ebbrClearType
	 */
	@Column(name = "EBBR_CLEAR_TYPE")
	public String getEbbrClearType() {
		return ebbrClearType;
	}

	/**
	 * Set ebbrClearType
	 */
	public void setEbbrClearType(String ebbrClearType) {
		this.ebbrClearType = ebbrClearType;
		addValidField("ebbrClearType");
	}

	/**
	 * Get ebbrLastCreatorDate
	 */
	@Column(name = "EBBR_LAST_CREATOR_DATE")
	public Date getEbbrLastCreatorDate() {
		return ebbrLastCreatorDate;
	}

	/**
	 * Set ebbrLastCreatorDate
	 */
	public void setEbbrLastCreatorDate(Date ebbrLastCreatorDate) {
		this.ebbrLastCreatorDate = ebbrLastCreatorDate;
		addValidField("ebbrLastCreatorDate");
	}

	/**
	 * Get ebbrSubstr1
	 */
	@Column(name = "EBBR_SUBSTR1")
	public String getEbbrSubstr1() {
		return ebbrSubstr1;
	}

	/**
	 * Set ebbrSubstr1
	 */
	public void setEbbrSubstr1(String ebbrSubstr1) {
		this.ebbrSubstr1 = ebbrSubstr1;
		addValidField("ebbrSubstr1");
	}

	/**
	 * Get ebbrSubstr2
	 */
	@Column(name = "EBBR_SUBSTR2")
	public String getEbbrSubstr2() {
		return ebbrSubstr2;
	}

	/**
	 * Set ebbrSubstr2
	 */
	public void setEbbrSubstr2(String ebbrSubstr2) {
		this.ebbrSubstr2 = ebbrSubstr2;
		addValidField("ebbrSubstr2");
	}

	/**
	 * Get ebbrSubstr3
	 */
	@Column(name = "EBBR_SUBSTR3")
	public String getEbbrSubstr3() {
		return ebbrSubstr3;
	}

	/**
	 * Set ebbrSubstr3
	 */
	public void setEbbrSubstr3(String ebbrSubstr3) {
		this.ebbrSubstr3 = ebbrSubstr3;
		addValidField("ebbrSubstr3");
	}

	/**
	 * Get ebbrSubstr4
	 */
	@Column(name = "EBBR_SUBSTR4")
	public String getEbbrSubstr4() {
		return ebbrSubstr4;
	}

	/**
	 * Set ebbrSubstr4
	 */
	public void setEbbrSubstr4(String ebbrSubstr4) {
		this.ebbrSubstr4 = ebbrSubstr4;
		addValidField("ebbrSubstr4");
	}

	/**
	 * Get ebbrSubstr5
	 */
	@Column(name = "EBBR_SUBSTR5")
	public String getEbbrSubstr5() {
		return ebbrSubstr5;
	}

	/**
	 * Set ebbrSubstr5
	 */
	public void setEbbrSubstr5(String ebbrSubstr5) {
		this.ebbrSubstr5 = ebbrSubstr5;
		addValidField("ebbrSubstr5");
	}

	/**
	 * Get ebbrSubstr6
	 */
	@Column(name = "EBBR_SUBSTR6")
	public String getEbbrSubstr6() {
		return ebbrSubstr6;
	}

	/**
	 * Set ebbrSubstr6
	 */
	public void setEbbrSubstr6(String ebbrSubstr6) {
		this.ebbrSubstr6 = ebbrSubstr6;
		addValidField("ebbrSubstr6");
	}

	/**
	 * Get ebbrSubstr7
	 */
	@Column(name = "EBBR_SUBSTR7")
	public String getEbbrSubstr7() {
		return ebbrSubstr7;
	}

	/**
	 * Set ebbrSubstr7
	 */
	public void setEbbrSubstr7(String ebbrSubstr7) {
		this.ebbrSubstr7 = ebbrSubstr7;
		addValidField("ebbrSubstr7");
	}

	/**
	 * Get ebbrSubstr8
	 */
	@Column(name = "EBBR_SUBSTR8")
	public String getEbbrSubstr8() {
		return ebbrSubstr8;
	}

	/**
	 * Set ebbrSubstr8
	 */
	public void setEbbrSubstr8(String ebbrSubstr8) {
		this.ebbrSubstr8 = ebbrSubstr8;
		addValidField("ebbrSubstr8");
	}

	/**
	 * Get ebbrSubdate1
	 */
	@Column(name = "EBBR_SUBDATE1")
	public Date getEbbrSubdate1() {
		return ebbrSubdate1;
	}

	/**
	 * Set ebbrSubdate1
	 */
	public void setEbbrSubdate1(Date ebbrSubdate1) {
		this.ebbrSubdate1 = ebbrSubdate1;
		addValidField("ebbrSubdate1");
	}

	/**
	 * Get ebbrSubdate2
	 */
	@Column(name = "EBBR_SUBDATE2")
	public Date getEbbrSubdate2() {
		return ebbrSubdate2;
	}

	/**
	 * Set ebbrSubdate2
	 */
	public void setEbbrSubdate2(Date ebbrSubdate2) {
		this.ebbrSubdate2 = ebbrSubdate2;
		addValidField("ebbrSubdate2");
	}

	/**
	 * Get ebbrSubdate3
	 */
	@Column(name = "EBBR_SUBDATE3")
	public Date getEbbrSubdate3() {
		return ebbrSubdate3;
	}

	/**
	 * Set ebbrSubdate3
	 */
	public void setEbbrSubdate3(Date ebbrSubdate3) {
		this.ebbrSubdate3 = ebbrSubdate3;
		addValidField("ebbrSubdate3");
	}

	/**
	 * Get ebbrSubdate4
	 */
	@Column(name = "EBBR_SUBDATE4")
	public Date getEbbrSubdate4() {
		return ebbrSubdate4;
	}

	/**
	 * Set ebbrSubdate4
	 */
	public void setEbbrSubdate4(Date ebbrSubdate4) {
		this.ebbrSubdate4 = ebbrSubdate4;
		addValidField("ebbrSubdate4");
	}

	/**
	 * Get ebbrSubdate5
	 */
	@Column(name = "EBBR_SUBDATE5")
	public Date getEbbrSubdate5() {
		return ebbrSubdate5;
	}

	/**
	 * Set ebbrSubdate5
	 */
	public void setEbbrSubdate5(Date ebbrSubdate5) {
		this.ebbrSubdate5 = ebbrSubdate5;
		addValidField("ebbrSubdate5");
	}

	/**
	 * Get ebbrSubnum1
	 */
	@Column(name = "EBBR_SUBNUM1")
	public Long getEbbrSubnum1() {
		return ebbrSubnum1;
	}

	/**
	 * Set ebbrSubnum1
	 */
	public void setEbbrSubnum1(Long ebbrSubnum1) {
		this.ebbrSubnum1 = ebbrSubnum1;
		addValidField("ebbrSubnum1");
	}

	/**
	 * Get ebbrSubnum2
	 */
	@Column(name = "EBBR_SUBNUM2")
	public Long getEbbrSubnum2() {
		return ebbrSubnum2;
	}

	/**
	 * Set ebbrSubnum2
	 */
	public void setEbbrSubnum2(Long ebbrSubnum2) {
		this.ebbrSubnum2 = ebbrSubnum2;
		addValidField("ebbrSubnum2");
	}

	/**
	 * Get ebbrSubnum3
	 */
	@Column(name = "EBBR_SUBNUM3")
	public Long getEbbrSubnum3() {
		return ebbrSubnum3;
	}

	/**
	 * Set ebbrSubnum3
	 */
	public void setEbbrSubnum3(Long ebbrSubnum3) {
		this.ebbrSubnum3 = ebbrSubnum3;
		addValidField("ebbrSubnum3");
	}

	/**
	 * Get ebbrSubnum4
	 */
	@Column(name = "EBBR_SUBNUM4")
	public Long getEbbrSubnum4() {
		return ebbrSubnum4;
	}

	/**
	 * Set ebbrSubnum4
	 */
	public void setEbbrSubnum4(Long ebbrSubnum4) {
		this.ebbrSubnum4 = ebbrSubnum4;
		addValidField("ebbrSubnum4");
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
	 * Get recStatus
	 */
	@Column(name = "REC_STATUS")
	public Long getRecStatus() {
		return recStatus;
	}

	/**
	 * Set recStatus
	 */
	public void setRecStatus(Long recStatus) {
		this.recStatus = recStatus;
		addValidField("recStatus");
	}

}
