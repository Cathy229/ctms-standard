package com.sinotrans.oms.businessrequest.model;

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
 * Model class for EoOutmportJoabBox
 */
@Entity
@Table(name = "EO_OUTMPORT_JOAB_BOX")
public class EoOutmportJoabBoxModel extends BaseModel implements OperationLog {

	//eoobId
	private Long eoobId;
	//eoobEofoId
	private Long eoobEofoId;
	//eoobEoocId
	private Long eoobEoocId;
	//eoobContainerNo
	private String eoobContainerNo;
	//eoobEirNo
	private String eoobEirNo;
	//eoobIsGrantEir
	private Long eoobIsGrantEir;
	//eoobGrantEirDate
	private Date eoobGrantEirDate;
	//eoobIsBackEir
	private Long eoobIsBackEir;
	//eoobBackEirDate
	private Date eoobBackEirDate;
	//eoobCCheck
	private String eoobCCheck;
	//eoobCIsBucklerBox
	private String eoobCIsBucklerBox;
	//eoobCBucklerBoxDate
	private Date eoobCBucklerBoxDate;
	//eoobCIsRelease
	private Long eoobCIsRelease;
	//eoobCReleaseDate
	private Date eoobCReleaseDate;
	//eoobQCheck
	private String eoobQCheck;
	//eoobQIsBucklerBox
	private String eoobQIsBucklerBox;
	//eoobQBucklerBoxDate
	private Date eoobQBucklerBoxDate;
	//eoobQIsRelease
	private Long eoobQIsRelease;
	//eoobQReleaseDate
	private Date eoobQReleaseDate;
	//eoobSubstr1
	private String eoobSubstr1;
	//eoobSubstr2
	private String eoobSubstr2;
	//eoobSubstr3
	private String eoobSubstr3;
	//eoobSubstr4
	private String eoobSubstr4;
	//eoobSubstr5
	private String eoobSubstr5;
	//eoobSubstr6
	private String eoobSubstr6;
	//eoobSubstr7
	private String eoobSubstr7;
	//eoobSubstr8
	private String eoobSubstr8;
	//eoobSubdate1
	private Date eoobSubdate1;
	//eoobSubdate2
	private Date eoobSubdate2;
	//eoobSubdate3
	private Date eoobSubdate3;
	//eoobSubdate4
	private Date eoobSubdate4;
	//eoobSubnum1
	private Long eoobSubnum1;
	//eoobSubnum2
	private Long eoobSubnum2;
	//eoobSubnum3
	private Long eoobSubnum3;
	//eoobSubnum4
	private Long eoobSubnum4;
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
	 * Get eoobId
	 */
	@Column(name = "EOOB_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoobId() {
		return eoobId;
	}

	/**
	 * Set eoobId
	 */
	public void setEoobId(Long eoobId) {
		this.eoobId = eoobId;
		addValidField("eoobId");
	}

	/**
	 * Get eoobEofoId
	 */
	@Column(name = "EOOB_EOFO_ID")
	public Long getEoobEofoId() {
		return eoobEofoId;
	}

	/**
	 * Set eoobEofoId
	 */
	public void setEoobEofoId(Long eoobEofoId) {
		this.eoobEofoId = eoobEofoId;
		addValidField("eoobEofoId");
	}

	/**
	 * Get eoobEoocId
	 */
	@Column(name = "EOOB_EOOC_ID")
	public Long getEoobEoocId() {
		return eoobEoocId;
	}

	/**
	 * Set eoobEoocId
	 */
	public void setEoobEoocId(Long eoobEoocId) {
		this.eoobEoocId = eoobEoocId;
		addValidField("eoobEoocId");
	}

	/**
	 * Get eoobContainerNo
	 */
	@Column(name = "EOOB_CONTAINER_NO")
	public String getEoobContainerNo() {
		return eoobContainerNo;
	}

	/**
	 * Set eoobContainerNo
	 */
	public void setEoobContainerNo(String eoobContainerNo) {
		this.eoobContainerNo = eoobContainerNo;
		addValidField("eoobContainerNo");
	}

	/**
	 * Get eoobEirNo
	 */
	@Column(name = "EOOB_EIR_NO")
	public String getEoobEirNo() {
		return eoobEirNo;
	}

	/**
	 * Set eoobEirNo
	 */
	public void setEoobEirNo(String eoobEirNo) {
		this.eoobEirNo = eoobEirNo;
		addValidField("eoobEirNo");
	}

	/**
	 * Get eoobIsGrantEir
	 */
	@Column(name = "EOOB_IS_GRANT_EIR")
	public Long getEoobIsGrantEir() {
		return eoobIsGrantEir;
	}

	/**
	 * Set eoobIsGrantEir
	 */
	public void setEoobIsGrantEir(Long eoobIsGrantEir) {
		this.eoobIsGrantEir = eoobIsGrantEir;
		addValidField("eoobIsGrantEir");
	}

	/**
	 * Get eoobGrantEirDate
	 */
	@Column(name = "EOOB_GRANT_EIR_DATE")
	public Date getEoobGrantEirDate() {
		return eoobGrantEirDate;
	}

	/**
	 * Set eoobGrantEirDate
	 */
	public void setEoobGrantEirDate(Date eoobGrantEirDate) {
		this.eoobGrantEirDate = eoobGrantEirDate;
		addValidField("eoobGrantEirDate");
	}

	/**
	 * Get eoobIsBackEir
	 */
	@Column(name = "EOOB_IS_BACK_EIR")
	public Long getEoobIsBackEir() {
		return eoobIsBackEir;
	}

	/**
	 * Set eoobIsBackEir
	 */
	public void setEoobIsBackEir(Long eoobIsBackEir) {
		this.eoobIsBackEir = eoobIsBackEir;
		addValidField("eoobIsBackEir");
	}

	/**
	 * Get eoobBackEirDate
	 */
	@Column(name = "EOOB_BACK_EIR_DATE")
	public Date getEoobBackEirDate() {
		return eoobBackEirDate;
	}

	/**
	 * Set eoobBackEirDate
	 */
	public void setEoobBackEirDate(Date eoobBackEirDate) {
		this.eoobBackEirDate = eoobBackEirDate;
		addValidField("eoobBackEirDate");
	}

	/**
	 * Get eoobCCheck
	 */
	@Column(name = "EOOB_C_CHECK")
	public String getEoobCCheck() {
		return eoobCCheck;
	}

	/**
	 * Set eoobCCheck
	 */
	public void setEoobCCheck(String eoobCCheck) {
		this.eoobCCheck = eoobCCheck;
		addValidField("eoobCCheck");
	}

	/**
	 * Get eoobCIsBucklerBox
	 */
	@Column(name = "EOOB_C_IS_BUCKLER_BOX")
	public String getEoobCIsBucklerBox() {
		return eoobCIsBucklerBox;
	}

	/**
	 * Set eoobCIsBucklerBox
	 */
	public void setEoobCIsBucklerBox(String eoobCIsBucklerBox) {
		this.eoobCIsBucklerBox = eoobCIsBucklerBox;
		addValidField("eoobCIsBucklerBox");
	}

	/**
	 * Get eoobCBucklerBoxDate
	 */
	@Column(name = "EOOB_C_BUCKLER_BOX_DATE")
	public Date getEoobCBucklerBoxDate() {
		return eoobCBucklerBoxDate;
	}

	/**
	 * Set eoobCBucklerBoxDate
	 */
	public void setEoobCBucklerBoxDate(Date eoobCBucklerBoxDate) {
		this.eoobCBucklerBoxDate = eoobCBucklerBoxDate;
		addValidField("eoobCBucklerBoxDate");
	}

	/**
	 * Get eoobCIsRelease
	 */
	@Column(name = "EOOB_C_IS_RELEASE")
	public Long getEoobCIsRelease() {
		return eoobCIsRelease;
	}

	/**
	 * Set eoobCIsRelease
	 */
	public void setEoobCIsRelease(Long eoobCIsRelease) {
		this.eoobCIsRelease = eoobCIsRelease;
		addValidField("eoobCIsRelease");
	}

	/**
	 * Get eoobCReleaseDate
	 */
	@Column(name = "EOOB_C_RELEASE_DATE")
	public Date getEoobCReleaseDate() {
		return eoobCReleaseDate;
	}

	/**
	 * Set eoobCReleaseDate
	 */
	public void setEoobCReleaseDate(Date eoobCReleaseDate) {
		this.eoobCReleaseDate = eoobCReleaseDate;
		addValidField("eoobCReleaseDate");
	}

	/**
	 * Get eoobQCheck
	 */
	@Column(name = "EOOB_Q_CHECK")
	public String getEoobQCheck() {
		return eoobQCheck;
	}

	/**
	 * Set eoobQCheck
	 */
	public void setEoobQCheck(String eoobQCheck) {
		this.eoobQCheck = eoobQCheck;
		addValidField("eoobQCheck");
	}

	/**
	 * Get eoobQIsBucklerBox
	 */
	@Column(name = "EOOB_Q_IS_BUCKLER_BOX")
	public String getEoobQIsBucklerBox() {
		return eoobQIsBucklerBox;
	}

	/**
	 * Set eoobQIsBucklerBox
	 */
	public void setEoobQIsBucklerBox(String eoobQIsBucklerBox) {
		this.eoobQIsBucklerBox = eoobQIsBucklerBox;
		addValidField("eoobQIsBucklerBox");
	}

	/**
	 * Get eoobQBucklerBoxDate
	 */
	@Column(name = "EOOB_Q_BUCKLER_BOX_DATE")
	public Date getEoobQBucklerBoxDate() {
		return eoobQBucklerBoxDate;
	}

	/**
	 * Set eoobQBucklerBoxDate
	 */
	public void setEoobQBucklerBoxDate(Date eoobQBucklerBoxDate) {
		this.eoobQBucklerBoxDate = eoobQBucklerBoxDate;
		addValidField("eoobQBucklerBoxDate");
	}

	/**
	 * Get eoobQIsRelease
	 */
	@Column(name = "EOOB_Q_IS_RELEASE")
	public Long getEoobQIsRelease() {
		return eoobQIsRelease;
	}

	/**
	 * Set eoobQIsRelease
	 */
	public void setEoobQIsRelease(Long eoobQIsRelease) {
		this.eoobQIsRelease = eoobQIsRelease;
		addValidField("eoobQIsRelease");
	}

	/**
	 * Get eoobQReleaseDate
	 */
	@Column(name = "EOOB_Q_RELEASE_DATE")
	public Date getEoobQReleaseDate() {
		return eoobQReleaseDate;
	}

	/**
	 * Set eoobQReleaseDate
	 */
	public void setEoobQReleaseDate(Date eoobQReleaseDate) {
		this.eoobQReleaseDate = eoobQReleaseDate;
		addValidField("eoobQReleaseDate");
	}

	/**
	 * Get eoobSubstr1
	 */
	@Column(name = "EOOB_SUBSTR1")
	public String getEoobSubstr1() {
		return eoobSubstr1;
	}

	/**
	 * Set eoobSubstr1
	 */
	public void setEoobSubstr1(String eoobSubstr1) {
		this.eoobSubstr1 = eoobSubstr1;
		addValidField("eoobSubstr1");
	}

	/**
	 * Get eoobSubstr2
	 */
	@Column(name = "EOOB_SUBSTR2")
	public String getEoobSubstr2() {
		return eoobSubstr2;
	}

	/**
	 * Set eoobSubstr2
	 */
	public void setEoobSubstr2(String eoobSubstr2) {
		this.eoobSubstr2 = eoobSubstr2;
		addValidField("eoobSubstr2");
	}

	/**
	 * Get eoobSubstr3
	 */
	@Column(name = "EOOB_SUBSTR3")
	public String getEoobSubstr3() {
		return eoobSubstr3;
	}

	/**
	 * Set eoobSubstr3
	 */
	public void setEoobSubstr3(String eoobSubstr3) {
		this.eoobSubstr3 = eoobSubstr3;
		addValidField("eoobSubstr3");
	}

	/**
	 * Get eoobSubstr4
	 */
	@Column(name = "EOOB_SUBSTR4")
	public String getEoobSubstr4() {
		return eoobSubstr4;
	}

	/**
	 * Set eoobSubstr4
	 */
	public void setEoobSubstr4(String eoobSubstr4) {
		this.eoobSubstr4 = eoobSubstr4;
		addValidField("eoobSubstr4");
	}

	/**
	 * Get eoobSubstr5
	 */
	@Column(name = "EOOB_SUBSTR5")
	public String getEoobSubstr5() {
		return eoobSubstr5;
	}

	/**
	 * Set eoobSubstr5
	 */
	public void setEoobSubstr5(String eoobSubstr5) {
		this.eoobSubstr5 = eoobSubstr5;
		addValidField("eoobSubstr5");
	}

	/**
	 * Get eoobSubstr6
	 */
	@Column(name = "EOOB_SUBSTR6")
	public String getEoobSubstr6() {
		return eoobSubstr6;
	}

	/**
	 * Set eoobSubstr6
	 */
	public void setEoobSubstr6(String eoobSubstr6) {
		this.eoobSubstr6 = eoobSubstr6;
		addValidField("eoobSubstr6");
	}

	/**
	 * Get eoobSubstr7
	 */
	@Column(name = "EOOB_SUBSTR7")
	public String getEoobSubstr7() {
		return eoobSubstr7;
	}

	/**
	 * Set eoobSubstr7
	 */
	public void setEoobSubstr7(String eoobSubstr7) {
		this.eoobSubstr7 = eoobSubstr7;
		addValidField("eoobSubstr7");
	}

	/**
	 * Get eoobSubstr8
	 */
	@Column(name = "EOOB_SUBSTR8")
	public String getEoobSubstr8() {
		return eoobSubstr8;
	}

	/**
	 * Set eoobSubstr8
	 */
	public void setEoobSubstr8(String eoobSubstr8) {
		this.eoobSubstr8 = eoobSubstr8;
		addValidField("eoobSubstr8");
	}

	/**
	 * Get eoobSubdate1
	 */
	@Column(name = "EOOB_SUBDATE1")
	public Date getEoobSubdate1() {
		return eoobSubdate1;
	}

	/**
	 * Set eoobSubdate1
	 */
	public void setEoobSubdate1(Date eoobSubdate1) {
		this.eoobSubdate1 = eoobSubdate1;
		addValidField("eoobSubdate1");
	}

	/**
	 * Get eoobSubdate2
	 */
	@Column(name = "EOOB_SUBDATE2")
	public Date getEoobSubdate2() {
		return eoobSubdate2;
	}

	/**
	 * Set eoobSubdate2
	 */
	public void setEoobSubdate2(Date eoobSubdate2) {
		this.eoobSubdate2 = eoobSubdate2;
		addValidField("eoobSubdate2");
	}

	/**
	 * Get eoobSubdate3
	 */
	@Column(name = "EOOB_SUBDATE3")
	public Date getEoobSubdate3() {
		return eoobSubdate3;
	}

	/**
	 * Set eoobSubdate3
	 */
	public void setEoobSubdate3(Date eoobSubdate3) {
		this.eoobSubdate3 = eoobSubdate3;
		addValidField("eoobSubdate3");
	}

	/**
	 * Get eoobSubdate4
	 */
	@Column(name = "EOOB_SUBDATE4")
	public Date getEoobSubdate4() {
		return eoobSubdate4;
	}

	/**
	 * Set eoobSubdate4
	 */
	public void setEoobSubdate4(Date eoobSubdate4) {
		this.eoobSubdate4 = eoobSubdate4;
		addValidField("eoobSubdate4");
	}

	/**
	 * Get eoobSubnum1
	 */
	@Column(name = "EOOB_SUBNUM1")
	public Long getEoobSubnum1() {
		return eoobSubnum1;
	}

	/**
	 * Set eoobSubnum1
	 */
	public void setEoobSubnum1(Long eoobSubnum1) {
		this.eoobSubnum1 = eoobSubnum1;
		addValidField("eoobSubnum1");
	}

	/**
	 * Get eoobSubnum2
	 */
	@Column(name = "EOOB_SUBNUM2")
	public Long getEoobSubnum2() {
		return eoobSubnum2;
	}

	/**
	 * Set eoobSubnum2
	 */
	public void setEoobSubnum2(Long eoobSubnum2) {
		this.eoobSubnum2 = eoobSubnum2;
		addValidField("eoobSubnum2");
	}

	/**
	 * Get eoobSubnum3
	 */
	@Column(name = "EOOB_SUBNUM3")
	public Long getEoobSubnum3() {
		return eoobSubnum3;
	}

	/**
	 * Set eoobSubnum3
	 */
	public void setEoobSubnum3(Long eoobSubnum3) {
		this.eoobSubnum3 = eoobSubnum3;
		addValidField("eoobSubnum3");
	}

	/**
	 * Get eoobSubnum4
	 */
	@Column(name = "EOOB_SUBNUM4")
	public Long getEoobSubnum4() {
		return eoobSubnum4;
	}

	/**
	 * Set eoobSubnum4
	 */
	public void setEoobSubnum4(Long eoobSubnum4) {
		this.eoobSubnum4 = eoobSubnum4;
		addValidField("eoobSubnum4");
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
