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
 * Model class for EbFeeHead
 */
@Entity
@Table(name = "EB_FEE_HEAD")
public class EbFeeHeadModel extends BaseModel implements OperationLog {

	//ebfhId
	private Long ebfhId;
	//ebfhEscoId
	private Long ebfhEscoId;
	//ebfhQuickCode
	private String ebfhQuickCode;
	//ebfhCode
	private String ebfhCode;
	//ebfhNameCn
	private String ebfhNameCn;
	//ebfhNameEn
	private String ebfhNameEn;
	//ebfhIsRp
	private Long ebfhIsRp;
	//ebfhTaxRate
	private Long ebfhTaxRate;
	//ebfhStatus
	private Long ebfhStatus;
	//ebfhHdFilename
	private String ebfhHdFilename;
	//ebfhHdBatchnumber
	private String ebfhHdBatchnumber;
	//ebfhHdSymbol
	private Long ebfhHdSymbol;
	//ebfhHdBeginprocessingtime
	private Date ebfhHdBeginprocessingtime;
	//ebfhHdLastmodifiedtime
	private Date ebfhHdLastmodifiedtime;
	//ebfhHdInformation
	private String ebfhHdInformation;
	//ebfhUploadUserId
	private Long ebfhUploadUserId;
	//ebfhUploadUser
	private String ebfhUploadUser;
	//ebfhUploadTime
	private Date ebfhUploadTime;
	//ebfhSubstr1
	private String ebfhSubstr1;
	//ebfhSubstr2
	private String ebfhSubstr2;
	//ebfhSubstr3
	private String ebfhSubstr3;
	//ebfhSubstr4
	private String ebfhSubstr4;
	//ebfhSubstr5
	private String ebfhSubstr5;
	//ebfhSubstr6
	private String ebfhSubstr6;
	//ebfhSubstr7
	private String ebfhSubstr7;
	//ebfhSubstr8
	private String ebfhSubstr8;
	//ebfhSubdate1
	private Date ebfhSubdate1;
	//ebfhSubdate2
	private Date ebfhSubdate2;
	//ebfhSubdate3
	private Date ebfhSubdate3;
	//ebfhSubdate4
	private Date ebfhSubdate4;
	//ebfhSubnum1
	private Long ebfhSubnum1;
	//ebfhSubnum2
	private Long ebfhSubnum2;
	//ebfhSubnum3
	private Long ebfhSubnum3;
	//ebfhSubnum4
	private Long ebfhSubnum4;
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
	//ebfhEbhtCount
	private Long ebfhEbhtCount;
	//ebfhEbdhCount
	private Long ebfhEbdhCount;
	//ebfhEbphCount
	private Long ebfhEbphCount;
	//ebfhIsDutyfree
	private Long ebfhIsDutyfree;
	//ebfhEbcyCurrency
	private String ebfhEbcyCurrency;

	/**
	 * Get ebfhId
	 */
	@Column(name = "EBFH_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEbfhId() {
		return ebfhId;
	}

	/**
	 * Set ebfhId
	 */
	public void setEbfhId(Long ebfhId) {
		this.ebfhId = ebfhId;
		addValidField("ebfhId");
	}

	/**
	 * Get ebfhEscoId
	 */
	@Column(name = "EBFH_ESCO_ID")
	public Long getEbfhEscoId() {
		return ebfhEscoId;
	}

	/**
	 * Set ebfhEscoId
	 */
	public void setEbfhEscoId(Long ebfhEscoId) {
		this.ebfhEscoId = ebfhEscoId;
		addValidField("ebfhEscoId");
	}

	/**
	 * Get ebfhQuickCode
	 */
	@Column(name = "EBFH_QUICK_CODE")
	public String getEbfhQuickCode() {
		return ebfhQuickCode;
	}

	/**
	 * Set ebfhQuickCode
	 */
	public void setEbfhQuickCode(String ebfhQuickCode) {
		this.ebfhQuickCode = ebfhQuickCode;
		addValidField("ebfhQuickCode");
	}

	/**
	 * Get ebfhCode
	 */
	@Column(name = "EBFH_CODE")
	public String getEbfhCode() {
		return ebfhCode;
	}

	/**
	 * Set ebfhCode
	 */
	public void setEbfhCode(String ebfhCode) {
		this.ebfhCode = ebfhCode;
		addValidField("ebfhCode");
	}

	/**
	 * Get ebfhNameCn
	 */
	@Column(name = "EBFH_NAME_CN")
	public String getEbfhNameCn() {
		return ebfhNameCn;
	}

	/**
	 * Set ebfhNameCn
	 */
	public void setEbfhNameCn(String ebfhNameCn) {
		this.ebfhNameCn = ebfhNameCn;
		addValidField("ebfhNameCn");
	}

	/**
	 * Get ebfhNameEn
	 */
	@Column(name = "EBFH_NAME_EN")
	public String getEbfhNameEn() {
		return ebfhNameEn;
	}

	/**
	 * Set ebfhNameEn
	 */
	public void setEbfhNameEn(String ebfhNameEn) {
		this.ebfhNameEn = ebfhNameEn;
		addValidField("ebfhNameEn");
	}

	/**
	 * Get ebfhIsRp
	 */
	@Column(name = "EBFH_IS_RP")
	public Long getEbfhIsRp() {
		return ebfhIsRp;
	}

	/**
	 * Set ebfhIsRp
	 */
	public void setEbfhIsRp(Long ebfhIsRp) {
		this.ebfhIsRp = ebfhIsRp;
		addValidField("ebfhIsRp");
	}

	/**
	 * Get ebfhTaxRate
	 */
	@Column(name = "EBFH_TAX_RATE")
	public Long getEbfhTaxRate() {
		return ebfhTaxRate;
	}

	/**
	 * Set ebfhTaxRate
	 */
	public void setEbfhTaxRate(Long ebfhTaxRate) {
		this.ebfhTaxRate = ebfhTaxRate;
		addValidField("ebfhTaxRate");
	}

	/**
	 * Get ebfhStatus
	 */
	@Column(name = "EBFH_STATUS")
	public Long getEbfhStatus() {
		return ebfhStatus;
	}

	/**
	 * Set ebfhStatus
	 */
	public void setEbfhStatus(Long ebfhStatus) {
		this.ebfhStatus = ebfhStatus;
		addValidField("ebfhStatus");
	}

	/**
	 * Get ebfhHdFilename
	 */
	@Column(name = "EBFH_HD_FILENAME")
	public String getEbfhHdFilename() {
		return ebfhHdFilename;
	}

	/**
	 * Set ebfhHdFilename
	 */
	public void setEbfhHdFilename(String ebfhHdFilename) {
		this.ebfhHdFilename = ebfhHdFilename;
		addValidField("ebfhHdFilename");
	}

	/**
	 * Get ebfhHdBatchnumber
	 */
	@Column(name = "EBFH_HD_BATCHNUMBER")
	public String getEbfhHdBatchnumber() {
		return ebfhHdBatchnumber;
	}

	/**
	 * Set ebfhHdBatchnumber
	 */
	public void setEbfhHdBatchnumber(String ebfhHdBatchnumber) {
		this.ebfhHdBatchnumber = ebfhHdBatchnumber;
		addValidField("ebfhHdBatchnumber");
	}

	/**
	 * Get ebfhHdSymbol
	 */
	@Column(name = "EBFH_HD_SYMBOL")
	public Long getEbfhHdSymbol() {
		return ebfhHdSymbol;
	}

	/**
	 * Set ebfhHdSymbol
	 */
	public void setEbfhHdSymbol(Long ebfhHdSymbol) {
		this.ebfhHdSymbol = ebfhHdSymbol;
		addValidField("ebfhHdSymbol");
	}

	/**
	 * Get ebfhHdBeginprocessingtime
	 */
	@Column(name = "EBFH_HD_BEGINPROCESSINGTIME")
	public Date getEbfhHdBeginprocessingtime() {
		return ebfhHdBeginprocessingtime;
	}

	/**
	 * Set ebfhHdBeginprocessingtime
	 */
	public void setEbfhHdBeginprocessingtime(Date ebfhHdBeginprocessingtime) {
		this.ebfhHdBeginprocessingtime = ebfhHdBeginprocessingtime;
		addValidField("ebfhHdBeginprocessingtime");
	}

	/**
	 * Get ebfhHdLastmodifiedtime
	 */
	@Column(name = "EBFH_HD_LASTMODIFIEDTIME")
	public Date getEbfhHdLastmodifiedtime() {
		return ebfhHdLastmodifiedtime;
	}

	/**
	 * Set ebfhHdLastmodifiedtime
	 */
	public void setEbfhHdLastmodifiedtime(Date ebfhHdLastmodifiedtime) {
		this.ebfhHdLastmodifiedtime = ebfhHdLastmodifiedtime;
		addValidField("ebfhHdLastmodifiedtime");
	}

	/**
	 * Get ebfhHdInformation
	 */
	@Column(name = "EBFH_HD_INFORMATION")
	public String getEbfhHdInformation() {
		return ebfhHdInformation;
	}

	/**
	 * Set ebfhHdInformation
	 */
	public void setEbfhHdInformation(String ebfhHdInformation) {
		this.ebfhHdInformation = ebfhHdInformation;
		addValidField("ebfhHdInformation");
	}

	/**
	 * Get ebfhUploadUserId
	 */
	@Column(name = "EBFH_UPLOAD_USER_ID")
	public Long getEbfhUploadUserId() {
		return ebfhUploadUserId;
	}

	/**
	 * Set ebfhUploadUserId
	 */
	public void setEbfhUploadUserId(Long ebfhUploadUserId) {
		this.ebfhUploadUserId = ebfhUploadUserId;
		addValidField("ebfhUploadUserId");
	}

	/**
	 * Get ebfhUploadUser
	 */
	@Column(name = "EBFH_UPLOAD_USER")
	public String getEbfhUploadUser() {
		return ebfhUploadUser;
	}

	/**
	 * Set ebfhUploadUser
	 */
	public void setEbfhUploadUser(String ebfhUploadUser) {
		this.ebfhUploadUser = ebfhUploadUser;
		addValidField("ebfhUploadUser");
	}

	/**
	 * Get ebfhUploadTime
	 */
	@Column(name = "EBFH_UPLOAD_TIME")
	public Date getEbfhUploadTime() {
		return ebfhUploadTime;
	}

	/**
	 * Set ebfhUploadTime
	 */
	public void setEbfhUploadTime(Date ebfhUploadTime) {
		this.ebfhUploadTime = ebfhUploadTime;
		addValidField("ebfhUploadTime");
	}

	/**
	 * Get ebfhSubstr1
	 */
	@Column(name = "EBFH_SUBSTR1")
	public String getEbfhSubstr1() {
		return ebfhSubstr1;
	}

	/**
	 * Set ebfhSubstr1
	 */
	public void setEbfhSubstr1(String ebfhSubstr1) {
		this.ebfhSubstr1 = ebfhSubstr1;
		addValidField("ebfhSubstr1");
	}

	/**
	 * Get ebfhSubstr2
	 */
	@Column(name = "EBFH_SUBSTR2")
	public String getEbfhSubstr2() {
		return ebfhSubstr2;
	}

	/**
	 * Set ebfhSubstr2
	 */
	public void setEbfhSubstr2(String ebfhSubstr2) {
		this.ebfhSubstr2 = ebfhSubstr2;
		addValidField("ebfhSubstr2");
	}

	/**
	 * Get ebfhSubstr3
	 */
	@Column(name = "EBFH_SUBSTR3")
	public String getEbfhSubstr3() {
		return ebfhSubstr3;
	}

	/**
	 * Set ebfhSubstr3
	 */
	public void setEbfhSubstr3(String ebfhSubstr3) {
		this.ebfhSubstr3 = ebfhSubstr3;
		addValidField("ebfhSubstr3");
	}

	/**
	 * Get ebfhSubstr4
	 */
	@Column(name = "EBFH_SUBSTR4")
	public String getEbfhSubstr4() {
		return ebfhSubstr4;
	}

	/**
	 * Set ebfhSubstr4
	 */
	public void setEbfhSubstr4(String ebfhSubstr4) {
		this.ebfhSubstr4 = ebfhSubstr4;
		addValidField("ebfhSubstr4");
	}

	/**
	 * Get ebfhSubstr5
	 */
	@Column(name = "EBFH_SUBSTR5")
	public String getEbfhSubstr5() {
		return ebfhSubstr5;
	}

	/**
	 * Set ebfhSubstr5
	 */
	public void setEbfhSubstr5(String ebfhSubstr5) {
		this.ebfhSubstr5 = ebfhSubstr5;
		addValidField("ebfhSubstr5");
	}

	/**
	 * Get ebfhSubstr6
	 */
	@Column(name = "EBFH_SUBSTR6")
	public String getEbfhSubstr6() {
		return ebfhSubstr6;
	}

	/**
	 * Set ebfhSubstr6
	 */
	public void setEbfhSubstr6(String ebfhSubstr6) {
		this.ebfhSubstr6 = ebfhSubstr6;
		addValidField("ebfhSubstr6");
	}

	/**
	 * Get ebfhSubstr7
	 */
	@Column(name = "EBFH_SUBSTR7")
	public String getEbfhSubstr7() {
		return ebfhSubstr7;
	}

	/**
	 * Set ebfhSubstr7
	 */
	public void setEbfhSubstr7(String ebfhSubstr7) {
		this.ebfhSubstr7 = ebfhSubstr7;
		addValidField("ebfhSubstr7");
	}

	/**
	 * Get ebfhSubstr8
	 */
	@Column(name = "EBFH_SUBSTR8")
	public String getEbfhSubstr8() {
		return ebfhSubstr8;
	}

	/**
	 * Set ebfhSubstr8
	 */
	public void setEbfhSubstr8(String ebfhSubstr8) {
		this.ebfhSubstr8 = ebfhSubstr8;
		addValidField("ebfhSubstr8");
	}

	/**
	 * Get ebfhSubdate1
	 */
	@Column(name = "EBFH_SUBDATE1")
	public Date getEbfhSubdate1() {
		return ebfhSubdate1;
	}

	/**
	 * Set ebfhSubdate1
	 */
	public void setEbfhSubdate1(Date ebfhSubdate1) {
		this.ebfhSubdate1 = ebfhSubdate1;
		addValidField("ebfhSubdate1");
	}

	/**
	 * Get ebfhSubdate2
	 */
	@Column(name = "EBFH_SUBDATE2")
	public Date getEbfhSubdate2() {
		return ebfhSubdate2;
	}

	/**
	 * Set ebfhSubdate2
	 */
	public void setEbfhSubdate2(Date ebfhSubdate2) {
		this.ebfhSubdate2 = ebfhSubdate2;
		addValidField("ebfhSubdate2");
	}

	/**
	 * Get ebfhSubdate3
	 */
	@Column(name = "EBFH_SUBDATE3")
	public Date getEbfhSubdate3() {
		return ebfhSubdate3;
	}

	/**
	 * Set ebfhSubdate3
	 */
	public void setEbfhSubdate3(Date ebfhSubdate3) {
		this.ebfhSubdate3 = ebfhSubdate3;
		addValidField("ebfhSubdate3");
	}

	/**
	 * Get ebfhSubdate4
	 */
	@Column(name = "EBFH_SUBDATE4")
	public Date getEbfhSubdate4() {
		return ebfhSubdate4;
	}

	/**
	 * Set ebfhSubdate4
	 */
	public void setEbfhSubdate4(Date ebfhSubdate4) {
		this.ebfhSubdate4 = ebfhSubdate4;
		addValidField("ebfhSubdate4");
	}

	/**
	 * Get ebfhSubnum1
	 */
	@Column(name = "EBFH_SUBNUM1")
	public Long getEbfhSubnum1() {
		return ebfhSubnum1;
	}

	/**
	 * Set ebfhSubnum1
	 */
	public void setEbfhSubnum1(Long ebfhSubnum1) {
		this.ebfhSubnum1 = ebfhSubnum1;
		addValidField("ebfhSubnum1");
	}

	/**
	 * Get ebfhSubnum2
	 */
	@Column(name = "EBFH_SUBNUM2")
	public Long getEbfhSubnum2() {
		return ebfhSubnum2;
	}

	/**
	 * Set ebfhSubnum2
	 */
	public void setEbfhSubnum2(Long ebfhSubnum2) {
		this.ebfhSubnum2 = ebfhSubnum2;
		addValidField("ebfhSubnum2");
	}

	/**
	 * Get ebfhSubnum3
	 */
	@Column(name = "EBFH_SUBNUM3")
	public Long getEbfhSubnum3() {
		return ebfhSubnum3;
	}

	/**
	 * Set ebfhSubnum3
	 */
	public void setEbfhSubnum3(Long ebfhSubnum3) {
		this.ebfhSubnum3 = ebfhSubnum3;
		addValidField("ebfhSubnum3");
	}

	/**
	 * Get ebfhSubnum4
	 */
	@Column(name = "EBFH_SUBNUM4")
	public Long getEbfhSubnum4() {
		return ebfhSubnum4;
	}

	/**
	 * Set ebfhSubnum4
	 */
	public void setEbfhSubnum4(Long ebfhSubnum4) {
		this.ebfhSubnum4 = ebfhSubnum4;
		addValidField("ebfhSubnum4");
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
	 * Get ebfhEbhtCount
	 */
	@Column(name = "EBFH_EBHT_COUNT")
	public Long getEbfhEbhtCount() {
		return ebfhEbhtCount;
	}

	/**
	 * Set ebfhEbhtCount
	 */
	public void setEbfhEbhtCount(Long ebfhEbhtCount) {
		this.ebfhEbhtCount = ebfhEbhtCount;
		addValidField("ebfhEbhtCount");
	}

	/**
	 * Get ebfhEbdhCount
	 */
	@Column(name = "EBFH_EBDH_COUNT")
	public Long getEbfhEbdhCount() {
		return ebfhEbdhCount;
	}

	/**
	 * Set ebfhEbdhCount
	 */
	public void setEbfhEbdhCount(Long ebfhEbdhCount) {
		this.ebfhEbdhCount = ebfhEbdhCount;
		addValidField("ebfhEbdhCount");
	}

	/**
	 * Get ebfhEbphCount
	 */
	@Column(name = "EBFH_EBPH_COUNT")
	public Long getEbfhEbphCount() {
		return ebfhEbphCount;
	}

	/**
	 * Set ebfhEbphCount
	 */
	public void setEbfhEbphCount(Long ebfhEbphCount) {
		this.ebfhEbphCount = ebfhEbphCount;
		addValidField("ebfhEbphCount");
	}

	/**
	 * Get ebfhIsDutyfree
	 */
	@Column(name = "EBFH_IS_DUTYFREE")
	public Long getEbfhIsDutyfree() {
		return ebfhIsDutyfree;
	}

	/**
	 * Set ebfhIsDutyfree
	 */
	public void setEbfhIsDutyfree(Long ebfhIsDutyfree) {
		this.ebfhIsDutyfree = ebfhIsDutyfree;
		addValidField("ebfhIsDutyfree");
	}

	/**
	 * Get ebfhEbcyCurrency
	 */
	@Column(name = "EBFH_EBCY_CURRENCY")
	public String getEbfhEbcyCurrency() {
		return ebfhEbcyCurrency;
	}

	/**
	 * Set ebfhEbcyCurrency
	 */
	public void setEbfhEbcyCurrency(String ebfhEbcyCurrency) {
		this.ebfhEbcyCurrency = ebfhEbcyCurrency;
		addValidField("ebfhEbcyCurrency");
	}

}
