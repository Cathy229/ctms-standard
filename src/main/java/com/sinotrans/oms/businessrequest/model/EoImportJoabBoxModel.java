package com.sinotrans.oms.businessrequest.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Version;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.sinotrans.framework.orm.model.BaseModel;
import com.sinotrans.framework.orm.model.OperationLog;

/**
 * Model class for EoImportJoabBox
 */
@Entity
@Table(name = "EO_IMPORT_JOAB_BOX")
public class EoImportJoabBoxModel extends BaseModel implements OperationLog {

	//eoibId
	private Long eoibId;
	//eoibEofiId
	private Long eoibEofiId;
	//eoibEoocId
	private Long eoibEoocId;
	//eoibContainerNo
	private String eoibContainerNo;
	//eoibEirNo
	private String eoibEirNo;
	//eoibIsGrantEir
	private Long eoibIsGrantEir;
	//eoibGrantEirDate
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date eoibGrantEirDate;
	//eoibIsBackEir
	private Long eoibIsBackEir;
	//eoibBackEirDate
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date eoibBackEirDate;
	//eoibCCheck
	private String eoibCCheck;
	//eoibCIsBucklerBox
	private String eoibCIsBucklerBox;
	//eoibCBucklerBoxDate
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date eoibCBucklerBoxDate;
	//eoibCIsRelease
	private Long eoibCIsRelease;
	//eoibCReleaseDate
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date eoibCReleaseDate;
	//eoibQCheck
	private String eoibQCheck;
	//eoibQIsBucklerBox
	private String eoibQIsBucklerBox;
	//eoibQBucklerBoxDate
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date eoibQBucklerBoxDate;
	//eoibQIsRelease
	private Long eoibQIsRelease;
	//eoibQReleaseDate
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date eoibQReleaseDate;
	//eoibSubstr1
	private String eoibSubstr1;
	//eoibSubstr2
	private String eoibSubstr2;
	//eoibSubstr3
	private String eoibSubstr3;
	//eoibSubstr4
	private String eoibSubstr4;
	//eoibSubstr5
	private String eoibSubstr5;
	//eoibSubstr6
	private String eoibSubstr6;
	//eoibSubstr7
	private String eoibSubstr7;
	//eoibSubstr8
	private String eoibSubstr8;
	//eoibSubdate1
	@JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
	private Date eoibSubdate1;
	//eoibSubdate2
	private Date eoibSubdate2;
	//eoibSubdate3
	private Date eoibSubdate3;
	//eoibSubdate4
	private Date eoibSubdate4;
	//eoibSubnum1
	private Long eoibSubnum1;
	//eoibSubnum2
	private Long eoibSubnum2;
	//eoibSubnum3
	private Long eoibSubnum3;
	//eoibSubnum4
	private Long eoibSubnum4;
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
	 * Get eoibId
	 */
	@Column(name = "EOIB_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoibId() {
		return eoibId;
	}

	/**
	 * Set eoibId
	 */
	public void setEoibId(Long eoibId) {
		this.eoibId = eoibId;
		addValidField("eoibId");
	}

	/**
	 * Get eoibEofiId
	 */
	@Column(name = "EOIB_EOFI_ID")
	public Long getEoibEofiId() {
		return eoibEofiId;
	}

	/**
	 * Set eoibEofiId
	 */
	public void setEoibEofiId(Long eoibEofiId) {
		this.eoibEofiId = eoibEofiId;
		addValidField("eoibEofiId");
	}

	/**
	 * Get eoibEoocId
	 */
	@Column(name = "EOIB_EOOC_ID")
	public Long getEoibEoocId() {
		return eoibEoocId;
	}

	/**
	 * Set eoibEoocId
	 */
	public void setEoibEoocId(Long eoibEoocId) {
		this.eoibEoocId = eoibEoocId;
		addValidField("eoibEoocId");
	}

	/**
	 * Get eoibContainerNo
	 */
	@Column(name = "EOIB_CONTAINER_NO")
	public String getEoibContainerNo() {
		return eoibContainerNo;
	}

	/**
	 * Set eoibContainerNo
	 */
	public void setEoibContainerNo(String eoibContainerNo) {
		this.eoibContainerNo = eoibContainerNo;
		addValidField("eoibContainerNo");
	}

	/**
	 * Get eoibEirNo
	 */
	@Column(name = "EOIB_EIR_NO")
	public String getEoibEirNo() {
		return eoibEirNo;
	}

	/**
	 * Set eoibEirNo
	 */
	public void setEoibEirNo(String eoibEirNo) {
		this.eoibEirNo = eoibEirNo;
		addValidField("eoibEirNo");
	}

	/**
	 * Get eoibIsGrantEir
	 */
	@Column(name = "EOIB_IS_GRANT_EIR")
	public Long getEoibIsGrantEir() {
		return eoibIsGrantEir;
	}

	/**
	 * Set eoibIsGrantEir
	 */
	public void setEoibIsGrantEir(Long eoibIsGrantEir) {
		this.eoibIsGrantEir = eoibIsGrantEir;
		addValidField("eoibIsGrantEir");
	}

	/**
	 * Get eoibGrantEirDate
	 */
	@Column(name = "EOIB_GRANT_EIR_DATE")
	public Date getEoibGrantEirDate() {
		return eoibGrantEirDate;
	}

	/**
	 * Set eoibGrantEirDate
	 */
	public void setEoibGrantEirDate(Date eoibGrantEirDate) {
		this.eoibGrantEirDate = eoibGrantEirDate;
		addValidField("eoibGrantEirDate");
	}

	/**
	 * Get eoibIsBackEir
	 */
	@Column(name = "EOIB_IS_BACK_EIR")
	public Long getEoibIsBackEir() {
		return eoibIsBackEir;
	}

	/**
	 * Set eoibIsBackEir
	 */
	public void setEoibIsBackEir(Long eoibIsBackEir) {
		this.eoibIsBackEir = eoibIsBackEir;
		addValidField("eoibIsBackEir");
	}

	/**
	 * Get eoibBackEirDate
	 */
	@Column(name = "EOIB_BACK_EIR_DATE")
	public Date getEoibBackEirDate() {
		return eoibBackEirDate;
	}

	/**
	 * Set eoibBackEirDate
	 */
	public void setEoibBackEirDate(Date eoibBackEirDate) {
		this.eoibBackEirDate = eoibBackEirDate;
		addValidField("eoibBackEirDate");
	}

	/**
	 * Get eoibCCheck
	 */
	@Column(name = "EOIB_C_CHECK")
	public String getEoibCCheck() {
		return eoibCCheck;
	}

	/**
	 * Set eoibCCheck
	 */
	public void setEoibCCheck(String eoibCCheck) {
		this.eoibCCheck = eoibCCheck;
		addValidField("eoibCCheck");
	}

	/**
	 * Get eoibCIsBucklerBox
	 */
	@Column(name = "EOIB_C_IS_BUCKLER_BOX")
	public String getEoibCIsBucklerBox() {
		return eoibCIsBucklerBox;
	}

	/**
	 * Set eoibCIsBucklerBox
	 */
	public void setEoibCIsBucklerBox(String eoibCIsBucklerBox) {
		this.eoibCIsBucklerBox = eoibCIsBucklerBox;
		addValidField("eoibCIsBucklerBox");
	}

	/**
	 * Get eoibCBucklerBoxDate
	 */
	@Column(name = "EOIB_C_BUCKLER_BOX_DATE")
	public Date getEoibCBucklerBoxDate() {
		return eoibCBucklerBoxDate;
	}

	/**
	 * Set eoibCBucklerBoxDate
	 */
	public void setEoibCBucklerBoxDate(Date eoibCBucklerBoxDate) {
		this.eoibCBucklerBoxDate = eoibCBucklerBoxDate;
		addValidField("eoibCBucklerBoxDate");
	}

	/**
	 * Get eoibCIsRelease
	 */
	@Column(name = "EOIB_C_IS_RELEASE")
	public Long getEoibCIsRelease() {
		return eoibCIsRelease;
	}

	/**
	 * Set eoibCIsRelease
	 */
	public void setEoibCIsRelease(Long eoibCIsRelease) {
		this.eoibCIsRelease = eoibCIsRelease;
		addValidField("eoibCIsRelease");
	}

	/**
	 * Get eoibCReleaseDate
	 */
	@Column(name = "EOIB_C_RELEASE_DATE")
	public Date getEoibCReleaseDate() {
		return eoibCReleaseDate;
	}

	/**
	 * Set eoibCReleaseDate
	 */
	public void setEoibCReleaseDate(Date eoibCReleaseDate) {
		this.eoibCReleaseDate = eoibCReleaseDate;
		addValidField("eoibCReleaseDate");
	}

	/**
	 * Get eoibQCheck
	 */
	@Column(name = "EOIB_Q_CHECK")
	public String getEoibQCheck() {
		return eoibQCheck;
	}

	/**
	 * Set eoibQCheck
	 */
	public void setEoibQCheck(String eoibQCheck) {
		this.eoibQCheck = eoibQCheck;
		addValidField("eoibQCheck");
	}

	/**
	 * Get eoibQIsBucklerBox
	 */
	@Column(name = "EOIB_Q_IS_BUCKLER_BOX")
	public String getEoibQIsBucklerBox() {
		return eoibQIsBucklerBox;
	}

	/**
	 * Set eoibQIsBucklerBox
	 */
	public void setEoibQIsBucklerBox(String eoibQIsBucklerBox) {
		this.eoibQIsBucklerBox = eoibQIsBucklerBox;
		addValidField("eoibQIsBucklerBox");
	}

	/**
	 * Get eoibQBucklerBoxDate
	 */
	@Column(name = "EOIB_Q_BUCKLER_BOX_DATE")
	public Date getEoibQBucklerBoxDate() {
		return eoibQBucklerBoxDate;
	}

	/**
	 * Set eoibQBucklerBoxDate
	 */
	public void setEoibQBucklerBoxDate(Date eoibQBucklerBoxDate) {
		this.eoibQBucklerBoxDate = eoibQBucklerBoxDate;
		addValidField("eoibQBucklerBoxDate");
	}

	/**
	 * Get eoibQIsRelease
	 */
	@Column(name = "EOIB_Q_IS_RELEASE")
	public Long getEoibQIsRelease() {
		return eoibQIsRelease;
	}

	/**
	 * Set eoibQIsRelease
	 */
	public void setEoibQIsRelease(Long eoibQIsRelease) {
		this.eoibQIsRelease = eoibQIsRelease;
		addValidField("eoibQIsRelease");
	}

	/**
	 * Get eoibQReleaseDate
	 */
	@Column(name = "EOIB_Q_RELEASE_DATE")
	public Date getEoibQReleaseDate() {
		return eoibQReleaseDate;
	}

	/**
	 * Set eoibQReleaseDate
	 */
	public void setEoibQReleaseDate(Date eoibQReleaseDate) {
		this.eoibQReleaseDate = eoibQReleaseDate;
		addValidField("eoibQReleaseDate");
	}

	/**
	 * Get eoibSubstr1
	 */
	@Column(name = "EOIB_SUBSTR1")
	public String getEoibSubstr1() {
		return eoibSubstr1;
	}

	/**
	 * Set eoibSubstr1
	 */
	public void setEoibSubstr1(String eoibSubstr1) {
		this.eoibSubstr1 = eoibSubstr1;
		addValidField("eoibSubstr1");
	}

	/**
	 * Get eoibSubstr2
	 */
	@Column(name = "EOIB_SUBSTR2")
	public String getEoibSubstr2() {
		return eoibSubstr2;
	}

	/**
	 * Set eoibSubstr2
	 */
	public void setEoibSubstr2(String eoibSubstr2) {
		this.eoibSubstr2 = eoibSubstr2;
		addValidField("eoibSubstr2");
	}

	/**
	 * Get eoibSubstr3
	 */
	@Column(name = "EOIB_SUBSTR3")
	public String getEoibSubstr3() {
		return eoibSubstr3;
	}

	/**
	 * Set eoibSubstr3
	 */
	public void setEoibSubstr3(String eoibSubstr3) {
		this.eoibSubstr3 = eoibSubstr3;
		addValidField("eoibSubstr3");
	}

	/**
	 * Get eoibSubstr4
	 */
	@Column(name = "EOIB_SUBSTR4")
	public String getEoibSubstr4() {
		return eoibSubstr4;
	}

	/**
	 * Set eoibSubstr4
	 */
	public void setEoibSubstr4(String eoibSubstr4) {
		this.eoibSubstr4 = eoibSubstr4;
		addValidField("eoibSubstr4");
	}

	/**
	 * Get eoibSubstr5
	 */
	@Column(name = "EOIB_SUBSTR5")
	public String getEoibSubstr5() {
		return eoibSubstr5;
	}

	/**
	 * Set eoibSubstr5
	 */
	public void setEoibSubstr5(String eoibSubstr5) {
		this.eoibSubstr5 = eoibSubstr5;
		addValidField("eoibSubstr5");
	}

	/**
	 * Get eoibSubstr6
	 */
	@Column(name = "EOIB_SUBSTR6")
	public String getEoibSubstr6() {
		return eoibSubstr6;
	}

	/**
	 * Set eoibSubstr6
	 */
	public void setEoibSubstr6(String eoibSubstr6) {
		this.eoibSubstr6 = eoibSubstr6;
		addValidField("eoibSubstr6");
	}

	/**
	 * Get eoibSubstr7
	 */
	@Column(name = "EOIB_SUBSTR7")
	public String getEoibSubstr7() {
		return eoibSubstr7;
	}

	/**
	 * Set eoibSubstr7
	 */
	public void setEoibSubstr7(String eoibSubstr7) {
		this.eoibSubstr7 = eoibSubstr7;
		addValidField("eoibSubstr7");
	}

	/**
	 * Get eoibSubstr8
	 */
	@Column(name = "EOIB_SUBSTR8")
	public String getEoibSubstr8() {
		return eoibSubstr8;
	}

	/**
	 * Set eoibSubstr8
	 */
	public void setEoibSubstr8(String eoibSubstr8) {
		this.eoibSubstr8 = eoibSubstr8;
		addValidField("eoibSubstr8");
	}

	/**
	 * Get eoibSubdate1
	 */
	@Column(name = "EOIB_SUBDATE1")
	public Date getEoibSubdate1() {
		return eoibSubdate1;
	}

	/**
	 * Set eoibSubdate1
	 */
	public void setEoibSubdate1(Date eoibSubdate1) {
		this.eoibSubdate1 = eoibSubdate1;
		addValidField("eoibSubdate1");
	}

	/**
	 * Get eoibSubdate2
	 */
	@Column(name = "EOIB_SUBDATE2")
	public Date getEoibSubdate2() {
		return eoibSubdate2;
	}

	/**
	 * Set eoibSubdate2
	 */
	public void setEoibSubdate2(Date eoibSubdate2) {
		this.eoibSubdate2 = eoibSubdate2;
		addValidField("eoibSubdate2");
	}

	/**
	 * Get eoibSubdate3
	 */
	@Column(name = "EOIB_SUBDATE3")
	public Date getEoibSubdate3() {
		return eoibSubdate3;
	}

	/**
	 * Set eoibSubdate3
	 */
	public void setEoibSubdate3(Date eoibSubdate3) {
		this.eoibSubdate3 = eoibSubdate3;
		addValidField("eoibSubdate3");
	}

	/**
	 * Get eoibSubdate4
	 */
	@Column(name = "EOIB_SUBDATE4")
	public Date getEoibSubdate4() {
		return eoibSubdate4;
	}

	/**
	 * Set eoibSubdate4
	 */
	public void setEoibSubdate4(Date eoibSubdate4) {
		this.eoibSubdate4 = eoibSubdate4;
		addValidField("eoibSubdate4");
	}

	/**
	 * Get eoibSubnum1
	 */
	@Column(name = "EOIB_SUBNUM1")
	public Long getEoibSubnum1() {
		return eoibSubnum1;
	}

	/**
	 * Set eoibSubnum1
	 */
	public void setEoibSubnum1(Long eoibSubnum1) {
		this.eoibSubnum1 = eoibSubnum1;
		addValidField("eoibSubnum1");
	}

	/**
	 * Get eoibSubnum2
	 */
	@Column(name = "EOIB_SUBNUM2")
	public Long getEoibSubnum2() {
		return eoibSubnum2;
	}

	/**
	 * Set eoibSubnum2
	 */
	public void setEoibSubnum2(Long eoibSubnum2) {
		this.eoibSubnum2 = eoibSubnum2;
		addValidField("eoibSubnum2");
	}

	/**
	 * Get eoibSubnum3
	 */
	@Column(name = "EOIB_SUBNUM3")
	public Long getEoibSubnum3() {
		return eoibSubnum3;
	}

	/**
	 * Set eoibSubnum3
	 */
	public void setEoibSubnum3(Long eoibSubnum3) {
		this.eoibSubnum3 = eoibSubnum3;
		addValidField("eoibSubnum3");
	}

	/**
	 * Get eoibSubnum4
	 */
	@Column(name = "EOIB_SUBNUM4")
	public Long getEoibSubnum4() {
		return eoibSubnum4;
	}

	/**
	 * Set eoibSubnum4
	 */
	public void setEoibSubnum4(Long eoibSubnum4) {
		this.eoibSubnum4 = eoibSubnum4;
		addValidField("eoibSubnum4");
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
