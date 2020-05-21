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
 * Model class for EoOrderContainer
 */
@Entity
@Table(name = "EO_ORDER_CONTAINER")
public class EoOrderContainerModel extends BaseModel implements OperationLog {

	//eoocId
	private Long eoocId;
	//eoocEoorId
	private Long eoocEoorId;
	//eoocEtcaNo
	private String eoocEtcaNo;
	//eoocEtwdId
	private Long eoocEtwdId;
	//eoocSubstr1
	private String eoocSubstr1;
	//eoocSubstr2
	private String eoocSubstr2;
	//eoocSubstr3
	private String eoocSubstr3;
	//eoocSubstr4
	private String eoocSubstr4;
	//eoocSubstr5
	private String eoocSubstr5;
	//eoocSubstr6
	private String eoocSubstr6;
	//eoocSubstr7
	private String eoocSubstr7;
	//eoocSubstr8
	private String eoocSubstr8;
	//eoocSubdate1
	private Date eoocSubdate1;
	//eoocSubdate2
	private Date eoocSubdate2;
	//eoocSubdate3
	private Date eoocSubdate3;
	//eoocSubdate4
	private Date eoocSubdate4;
	//eoocSubnum1
	private Long eoocSubnum1;
	//eoocSubnum2
	private Long eoocSubnum2;
	//eoocSubnum3
	private Long eoocSubnum3;
	//eoocSubnum4
	private Long eoocSubnum4;
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
	//eoocContainerNo
	private String eoocContainerNo;
	//eoocContainerType
	private String eoocContainerType;
	//eoocContainerSize
	private String eoocContainerSize;
	//eoocSealNo1
	private String eoocSealNo1;
	//eoocSealNo2
	private String eoocSealNo2;
	//eoocSealNo3
	private String eoocSealNo3;
	//eoocBusinessSealNo
	private String eoocBusinessSealNo;
	//eoocTrailerNo
	private String eoocTrailerNo;
	//eoocIsLcl
	private String eoocIsLcl;
	//eoocIsSoc
	private String eoocIsSoc;
	//eoocArrivalTime
	private Date eoocArrivalTime;
	//eoocReleaseTime
	private Date eoocReleaseTime;
	//eoocStockinTime
	private Date eoocStockinTime;
	//eoocStockoutTime
	private Date eoocStockoutTime;
	//eoocSubstr9
	private String eoocSubstr9;
	//eoocSubstr10
	private String eoocSubstr10;
	//eoocSubstr11
	private String eoocSubstr11;
	//eoocSubstr12
	private String eoocSubstr12;
	//eoocSubstr13
	private String eoocSubstr13;
	//eoocSubstr14
	private String eoocSubstr14;
	//eoocSubstr15
	private String eoocSubstr15;
	//eoocSubstr16
	private String eoocSubstr16;
	//eoocSubstr17
	private String eoocSubstr17;
	//eoocSubstr18
	private String eoocSubstr18;
	//eoocSubstr19
	private String eoocSubstr19;
	//eoocSubstr20
	private String eoocSubstr20;
	//eoocSubstr21
	private String eoocSubstr21;
	//eoocSubstr22
	private String eoocSubstr22;
	//eoocSubstr23
	private String eoocSubstr23;
	//eoocSubstr24
	private String eoocSubstr24;
	//eoocSubstr25
	private String eoocSubstr25;
	//eoocSubdate5
	private Date eoocSubdate5;
	//eoocSubdate6
	private Date eoocSubdate6;
	//eoocSubdate7
	private Date eoocSubdate7;
	//eoocSubdate8
	private Date eoocSubdate8;
	//eoocSubdate9
	private Date eoocSubdate9;
	//eoocSubdate10
	private Date eoocSubdate10;
	//eoocSubnum5
	private Long eoocSubnum5;
	//eoocSubnum6
	private Long eoocSubnum6;
	//eoocEoccId
	private Long eoocEoccId;
	//eoocVgmGrossWeight
	private Double eoocVgmGrossWeight;
	//eoocVgmDate
	private Date eoocVgmDate;
	//eoocVgmMethod
	private String eoocVgmMethod;
	//eoocLocationCode
	private String eoocLocationCode;
	//eoocLocationName
	private String eoocLocationName;
	//eoocVgmCertificateRef
	private String eoocVgmCertificateRef;
	//eoocShipperName
	private String eoocShipperName;
	//eoocShipperAddress
	private String eoocShipperAddress;
	//eoocShipperVgmName
	private String eoocShipperVgmName;
	//eoocShipperVgmEmail
	private String eoocShipperVgmEmail;
	//eoocShipperVgmTelephone
	private String eoocShipperVgmTelephone;
	//eoocShipperVgmPerson
	private String eoocShipperVgmPerson;
	//eoocShipperVgmPersonSig
	private String eoocShipperVgmPersonSig;
	//eoocCompanyName
	private String eoocCompanyName;
	//eoocCompanyAddress
	private String eoocCompanyAddress;
	//eoocCompanyContactName
	private String eoocCompanyContactName;
	//eoocCompanyContactEmail
	private String eoocCompanyContactEmail;
	//eoocCompanyContactTelephone
	private String eoocCompanyContactTelephone;
	//eoocCompanyContactPerson
	private String eoocCompanyContactPerson;
	//eoocCompanyContactSig
	private String eoocCompanyContactSig;
	//eoocCntWeight
	private Double eoocCntWeight;
	//eoocQuantity
	private Long eoocQuantity;
	//eoocWeight
	private Double eoocWeight;
	//eoocVolume
	private Double eoocVolume;
	//
	private String eoocMarks;
	

	public String getEoocMarks() {
		return eoocMarks;
	}

	public void setEoocMarks(String eoocMarks) {
		this.eoocMarks = eoocMarks;
	}

	/**
	 * Get eoocId
	 */
	@Column(name = "EOOC_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoocId() {
		return eoocId;
	}

	/**
	 * Set eoocId
	 */
	public void setEoocId(Long eoocId) {
		this.eoocId = eoocId;
		addValidField("eoocId");
	}

	/**
	 * Get eoocEoorId
	 */
	@Column(name = "EOOC_EOOR_ID")
	public Long getEoocEoorId() {
		return eoocEoorId;
	}

	/**
	 * Set eoocEoorId
	 */
	public void setEoocEoorId(Long eoocEoorId) {
		this.eoocEoorId = eoocEoorId;
		addValidField("eoocEoorId");
	}

	/**
	 * Get eoocEtcaNo
	 */
	@Column(name = "EOOC_ETCA_NO")
	public String getEoocEtcaNo() {
		return eoocEtcaNo;
	}

	/**
	 * Set eoocEtcaNo
	 */
	public void setEoocEtcaNo(String eoocEtcaNo) {
		this.eoocEtcaNo = eoocEtcaNo;
		addValidField("eoocEtcaNo");
	}

	/**
	 * Get eoocEtwdId
	 */
	@Column(name = "EOOC_ETWD_ID")
	public Long getEoocEtwdId() {
		return eoocEtwdId;
	}

	/**
	 * Set eoocEtwdId
	 */
	public void setEoocEtwdId(Long eoocEtwdId) {
		this.eoocEtwdId = eoocEtwdId;
		addValidField("eoocEtwdId");
	}

	/**
	 * Get eoocSubstr1
	 */
	@Column(name = "EOOC_SUBSTR1")
	public String getEoocSubstr1() {
		return eoocSubstr1;
	}

	/**
	 * Set eoocSubstr1
	 */
	public void setEoocSubstr1(String eoocSubstr1) {
		this.eoocSubstr1 = eoocSubstr1;
		addValidField("eoocSubstr1");
	}

	/**
	 * Get eoocSubstr2
	 */
	@Column(name = "EOOC_SUBSTR2")
	public String getEoocSubstr2() {
		return eoocSubstr2;
	}

	/**
	 * Set eoocSubstr2
	 */
	public void setEoocSubstr2(String eoocSubstr2) {
		this.eoocSubstr2 = eoocSubstr2;
		addValidField("eoocSubstr2");
	}

	/**
	 * Get eoocSubstr3
	 */
	@Column(name = "EOOC_SUBSTR3")
	public String getEoocSubstr3() {
		return eoocSubstr3;
	}

	/**
	 * Set eoocSubstr3
	 */
	public void setEoocSubstr3(String eoocSubstr3) {
		this.eoocSubstr3 = eoocSubstr3;
		addValidField("eoocSubstr3");
	}

	/**
	 * Get eoocSubstr4
	 */
	@Column(name = "EOOC_SUBSTR4")
	public String getEoocSubstr4() {
		return eoocSubstr4;
	}

	/**
	 * Set eoocSubstr4
	 */
	public void setEoocSubstr4(String eoocSubstr4) {
		this.eoocSubstr4 = eoocSubstr4;
		addValidField("eoocSubstr4");
	}

	/**
	 * Get eoocSubstr5
	 */
	@Column(name = "EOOC_SUBSTR5")
	public String getEoocSubstr5() {
		return eoocSubstr5;
	}

	/**
	 * Set eoocSubstr5
	 */
	public void setEoocSubstr5(String eoocSubstr5) {
		this.eoocSubstr5 = eoocSubstr5;
		addValidField("eoocSubstr5");
	}

	/**
	 * Get eoocSubstr6
	 */
	@Column(name = "EOOC_SUBSTR6")
	public String getEoocSubstr6() {
		return eoocSubstr6;
	}

	/**
	 * Set eoocSubstr6
	 */
	public void setEoocSubstr6(String eoocSubstr6) {
		this.eoocSubstr6 = eoocSubstr6;
		addValidField("eoocSubstr6");
	}

	/**
	 * Get eoocSubstr7
	 */
	@Column(name = "EOOC_SUBSTR7")
	public String getEoocSubstr7() {
		return eoocSubstr7;
	}

	/**
	 * Set eoocSubstr7
	 */
	public void setEoocSubstr7(String eoocSubstr7) {
		this.eoocSubstr7 = eoocSubstr7;
		addValidField("eoocSubstr7");
	}

	/**
	 * Get eoocSubstr8
	 */
	@Column(name = "EOOC_SUBSTR8")
	public String getEoocSubstr8() {
		return eoocSubstr8;
	}

	/**
	 * Set eoocSubstr8
	 */
	public void setEoocSubstr8(String eoocSubstr8) {
		this.eoocSubstr8 = eoocSubstr8;
		addValidField("eoocSubstr8");
	}

	/**
	 * Get eoocSubdate1
	 */
	@Column(name = "EOOC_SUBDATE1")
	public Date getEoocSubdate1() {
		return eoocSubdate1;
	}

	/**
	 * Set eoocSubdate1
	 */
	public void setEoocSubdate1(Date eoocSubdate1) {
		this.eoocSubdate1 = eoocSubdate1;
		addValidField("eoocSubdate1");
	}

	/**
	 * Get eoocSubdate2
	 */
	@Column(name = "EOOC_SUBDATE2")
	public Date getEoocSubdate2() {
		return eoocSubdate2;
	}

	/**
	 * Set eoocSubdate2
	 */
	public void setEoocSubdate2(Date eoocSubdate2) {
		this.eoocSubdate2 = eoocSubdate2;
		addValidField("eoocSubdate2");
	}

	/**
	 * Get eoocSubdate3
	 */
	@Column(name = "EOOC_SUBDATE3")
	public Date getEoocSubdate3() {
		return eoocSubdate3;
	}

	/**
	 * Set eoocSubdate3
	 */
	public void setEoocSubdate3(Date eoocSubdate3) {
		this.eoocSubdate3 = eoocSubdate3;
		addValidField("eoocSubdate3");
	}

	/**
	 * Get eoocSubdate4
	 */
	@Column(name = "EOOC_SUBDATE4")
	public Date getEoocSubdate4() {
		return eoocSubdate4;
	}

	/**
	 * Set eoocSubdate4
	 */
	public void setEoocSubdate4(Date eoocSubdate4) {
		this.eoocSubdate4 = eoocSubdate4;
		addValidField("eoocSubdate4");
	}

	/**
	 * Get eoocSubnum1
	 */
	@Column(name = "EOOC_SUBNUM1")
	public Long getEoocSubnum1() {
		return eoocSubnum1;
	}

	/**
	 * Set eoocSubnum1
	 */
	public void setEoocSubnum1(Long eoocSubnum1) {
		this.eoocSubnum1 = eoocSubnum1;
		addValidField("eoocSubnum1");
	}

	/**
	 * Get eoocSubnum2
	 */
	@Column(name = "EOOC_SUBNUM2")
	public Long getEoocSubnum2() {
		return eoocSubnum2;
	}

	/**
	 * Set eoocSubnum2
	 */
	public void setEoocSubnum2(Long eoocSubnum2) {
		this.eoocSubnum2 = eoocSubnum2;
		addValidField("eoocSubnum2");
	}

	/**
	 * Get eoocSubnum3
	 */
	@Column(name = "EOOC_SUBNUM3")
	public Long getEoocSubnum3() {
		return eoocSubnum3;
	}

	/**
	 * Set eoocSubnum3
	 */
	public void setEoocSubnum3(Long eoocSubnum3) {
		this.eoocSubnum3 = eoocSubnum3;
		addValidField("eoocSubnum3");
	}

	/**
	 * Get eoocSubnum4
	 */
	@Column(name = "EOOC_SUBNUM4")
	public Long getEoocSubnum4() {
		return eoocSubnum4;
	}

	/**
	 * Set eoocSubnum4
	 */
	public void setEoocSubnum4(Long eoocSubnum4) {
		this.eoocSubnum4 = eoocSubnum4;
		addValidField("eoocSubnum4");
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
	 * Get eoocContainerNo
	 */
	@Column(name = "EOOC_CONTAINER_NO")
	public String getEoocContainerNo() {
		return eoocContainerNo;
	}

	/**
	 * Set eoocContainerNo
	 */
	public void setEoocContainerNo(String eoocContainerNo) {
		this.eoocContainerNo = eoocContainerNo;
		addValidField("eoocContainerNo");
	}

	/**
	 * Get eoocContainerType
	 */
	@Column(name = "EOOC_CONTAINER_TYPE")
	public String getEoocContainerType() {
		return eoocContainerType;
	}

	/**
	 * Set eoocContainerType
	 */
	public void setEoocContainerType(String eoocContainerType) {
		this.eoocContainerType = eoocContainerType;
		addValidField("eoocContainerType");
	}

	/**
	 * Get eoocContainerSize
	 */
	@Column(name = "EOOC_CONTAINER_SIZE")
	public String getEoocContainerSize() {
		return eoocContainerSize;
	}

	/**
	 * Set eoocContainerSize
	 */
	public void setEoocContainerSize(String eoocContainerSize) {
		this.eoocContainerSize = eoocContainerSize;
		addValidField("eoocContainerSize");
	}

	/**
	 * Get eoocSealNo1
	 */
	@Column(name = "EOOC_SEAL_NO_1")
	public String getEoocSealNo1() {
		return eoocSealNo1;
	}

	/**
	 * Set eoocSealNo1
	 */
	public void setEoocSealNo1(String eoocSealNo1) {
		this.eoocSealNo1 = eoocSealNo1;
		addValidField("eoocSealNo1");
	}

	/**
	 * Get eoocSealNo2
	 */
	@Column(name = "EOOC_SEAL_NO_2")
	public String getEoocSealNo2() {
		return eoocSealNo2;
	}

	/**
	 * Set eoocSealNo2
	 */
	public void setEoocSealNo2(String eoocSealNo2) {
		this.eoocSealNo2 = eoocSealNo2;
		addValidField("eoocSealNo2");
	}

	/**
	 * Get eoocSealNo3
	 */
	@Column(name = "EOOC_SEAL_NO_3")
	public String getEoocSealNo3() {
		return eoocSealNo3;
	}

	/**
	 * Set eoocSealNo3
	 */
	public void setEoocSealNo3(String eoocSealNo3) {
		this.eoocSealNo3 = eoocSealNo3;
		addValidField("eoocSealNo3");
	}

	/**
	 * Get eoocBusinessSealNo
	 */
	@Column(name = "EOOC_BUSINESS_SEAL_NO")
	public String getEoocBusinessSealNo() {
		return eoocBusinessSealNo;
	}

	/**
	 * Set eoocBusinessSealNo
	 */
	public void setEoocBusinessSealNo(String eoocBusinessSealNo) {
		this.eoocBusinessSealNo = eoocBusinessSealNo;
		addValidField("eoocBusinessSealNo");
	}

	/**
	 * Get eoocTrailerNo
	 */
	@Column(name = "EOOC_TRAILER_NO")
	public String getEoocTrailerNo() {
		return eoocTrailerNo;
	}

	/**
	 * Set eoocTrailerNo
	 */
	public void setEoocTrailerNo(String eoocTrailerNo) {
		this.eoocTrailerNo = eoocTrailerNo;
		addValidField("eoocTrailerNo");
	}

	/**
	 * Get eoocIsLcl
	 */
	@Column(name = "EOOC_IS_LCL")
	public String getEoocIsLcl() {
		return eoocIsLcl;
	}

	/**
	 * Set eoocIsLcl
	 */
	public void setEoocIsLcl(String eoocIsLcl) {
		this.eoocIsLcl = eoocIsLcl;
		addValidField("eoocIsLcl");
	}

	/**
	 * Get eoocIsSoc
	 */
	@Column(name = "EOOC_IS_SOC")
	public String getEoocIsSoc() {
		return eoocIsSoc;
	}

	/**
	 * Set eoocIsSoc
	 */
	public void setEoocIsSoc(String eoocIsSoc) {
		this.eoocIsSoc = eoocIsSoc;
		addValidField("eoocIsSoc");
	}

	/**
	 * Get eoocArrivalTime
	 */
	@Column(name = "EOOC_ARRIVAL_TIME")
	public Date getEoocArrivalTime() {
		return eoocArrivalTime;
	}

	/**
	 * Set eoocArrivalTime
	 */
	public void setEoocArrivalTime(Date eoocArrivalTime) {
		this.eoocArrivalTime = eoocArrivalTime;
		addValidField("eoocArrivalTime");
	}

	/**
	 * Get eoocReleaseTime
	 */
	@Column(name = "EOOC_RELEASE_TIME")
	public Date getEoocReleaseTime() {
		return eoocReleaseTime;
	}

	/**
	 * Set eoocReleaseTime
	 */
	public void setEoocReleaseTime(Date eoocReleaseTime) {
		this.eoocReleaseTime = eoocReleaseTime;
		addValidField("eoocReleaseTime");
	}

	/**
	 * Get eoocStockinTime
	 */
	@Column(name = "EOOC_STOCKIN_TIME")
	public Date getEoocStockinTime() {
		return eoocStockinTime;
	}

	/**
	 * Set eoocStockinTime
	 */
	public void setEoocStockinTime(Date eoocStockinTime) {
		this.eoocStockinTime = eoocStockinTime;
		addValidField("eoocStockinTime");
	}

	/**
	 * Get eoocStockoutTime
	 */
	@Column(name = "EOOC_STOCKOUT_TIME")
	public Date getEoocStockoutTime() {
		return eoocStockoutTime;
	}

	/**
	 * Set eoocStockoutTime
	 */
	public void setEoocStockoutTime(Date eoocStockoutTime) {
		this.eoocStockoutTime = eoocStockoutTime;
		addValidField("eoocStockoutTime");
	}

	/**
	 * Get eoocSubstr9
	 */
	@Column(name = "EOOC_SUBSTR9")
	public String getEoocSubstr9() {
		return eoocSubstr9;
	}

	/**
	 * Set eoocSubstr9
	 */
	public void setEoocSubstr9(String eoocSubstr9) {
		this.eoocSubstr9 = eoocSubstr9;
		addValidField("eoocSubstr9");
	}

	/**
	 * Get eoocSubstr10
	 */
	@Column(name = "EOOC_SUBSTR10")
	public String getEoocSubstr10() {
		return eoocSubstr10;
	}

	/**
	 * Set eoocSubstr10
	 */
	public void setEoocSubstr10(String eoocSubstr10) {
		this.eoocSubstr10 = eoocSubstr10;
		addValidField("eoocSubstr10");
	}

	/**
	 * Get eoocSubstr11
	 */
	@Column(name = "EOOC_SUBSTR11")
	public String getEoocSubstr11() {
		return eoocSubstr11;
	}

	/**
	 * Set eoocSubstr11
	 */
	public void setEoocSubstr11(String eoocSubstr11) {
		this.eoocSubstr11 = eoocSubstr11;
		addValidField("eoocSubstr11");
	}

	/**
	 * Get eoocSubstr12
	 */
	@Column(name = "EOOC_SUBSTR12")
	public String getEoocSubstr12() {
		return eoocSubstr12;
	}

	/**
	 * Set eoocSubstr12
	 */
	public void setEoocSubstr12(String eoocSubstr12) {
		this.eoocSubstr12 = eoocSubstr12;
		addValidField("eoocSubstr12");
	}

	/**
	 * Get eoocSubstr13
	 */
	@Column(name = "EOOC_SUBSTR13")
	public String getEoocSubstr13() {
		return eoocSubstr13;
	}

	/**
	 * Set eoocSubstr13
	 */
	public void setEoocSubstr13(String eoocSubstr13) {
		this.eoocSubstr13 = eoocSubstr13;
		addValidField("eoocSubstr13");
	}

	/**
	 * Get eoocSubstr14
	 */
	@Column(name = "EOOC_SUBSTR14")
	public String getEoocSubstr14() {
		return eoocSubstr14;
	}

	/**
	 * Set eoocSubstr14
	 */
	public void setEoocSubstr14(String eoocSubstr14) {
		this.eoocSubstr14 = eoocSubstr14;
		addValidField("eoocSubstr14");
	}

	/**
	 * Get eoocSubstr15
	 */
	@Column(name = "EOOC_SUBSTR15")
	public String getEoocSubstr15() {
		return eoocSubstr15;
	}

	/**
	 * Set eoocSubstr15
	 */
	public void setEoocSubstr15(String eoocSubstr15) {
		this.eoocSubstr15 = eoocSubstr15;
		addValidField("eoocSubstr15");
	}

	/**
	 * Get eoocSubstr16
	 */
	@Column(name = "EOOC_SUBSTR16")
	public String getEoocSubstr16() {
		return eoocSubstr16;
	}

	/**
	 * Set eoocSubstr16
	 */
	public void setEoocSubstr16(String eoocSubstr16) {
		this.eoocSubstr16 = eoocSubstr16;
		addValidField("eoocSubstr16");
	}

	/**
	 * Get eoocSubstr17
	 */
	@Column(name = "EOOC_SUBSTR17")
	public String getEoocSubstr17() {
		return eoocSubstr17;
	}

	/**
	 * Set eoocSubstr17
	 */
	public void setEoocSubstr17(String eoocSubstr17) {
		this.eoocSubstr17 = eoocSubstr17;
		addValidField("eoocSubstr17");
	}

	/**
	 * Get eoocSubstr18
	 */
	@Column(name = "EOOC_SUBSTR18")
	public String getEoocSubstr18() {
		return eoocSubstr18;
	}

	/**
	 * Set eoocSubstr18
	 */
	public void setEoocSubstr18(String eoocSubstr18) {
		this.eoocSubstr18 = eoocSubstr18;
		addValidField("eoocSubstr18");
	}

	/**
	 * Get eoocSubstr19
	 */
	@Column(name = "EOOC_SUBSTR19")
	public String getEoocSubstr19() {
		return eoocSubstr19;
	}

	/**
	 * Set eoocSubstr19
	 */
	public void setEoocSubstr19(String eoocSubstr19) {
		this.eoocSubstr19 = eoocSubstr19;
		addValidField("eoocSubstr19");
	}

	/**
	 * Get eoocSubstr20
	 */
	@Column(name = "EOOC_SUBSTR20")
	public String getEoocSubstr20() {
		return eoocSubstr20;
	}

	/**
	 * Set eoocSubstr20
	 */
	public void setEoocSubstr20(String eoocSubstr20) {
		this.eoocSubstr20 = eoocSubstr20;
		addValidField("eoocSubstr20");
	}

	/**
	 * Get eoocSubstr21
	 */
	@Column(name = "EOOC_SUBSTR21")
	public String getEoocSubstr21() {
		return eoocSubstr21;
	}

	/**
	 * Set eoocSubstr21
	 */
	public void setEoocSubstr21(String eoocSubstr21) {
		this.eoocSubstr21 = eoocSubstr21;
		addValidField("eoocSubstr21");
	}

	/**
	 * Get eoocSubstr22
	 */
	@Column(name = "EOOC_SUBSTR22")
	public String getEoocSubstr22() {
		return eoocSubstr22;
	}

	/**
	 * Set eoocSubstr22
	 */
	public void setEoocSubstr22(String eoocSubstr22) {
		this.eoocSubstr22 = eoocSubstr22;
		addValidField("eoocSubstr22");
	}

	/**
	 * Get eoocSubstr23
	 */
	@Column(name = "EOOC_SUBSTR23")
	public String getEoocSubstr23() {
		return eoocSubstr23;
	}

	/**
	 * Set eoocSubstr23
	 */
	public void setEoocSubstr23(String eoocSubstr23) {
		this.eoocSubstr23 = eoocSubstr23;
		addValidField("eoocSubstr23");
	}

	/**
	 * Get eoocSubstr24
	 */
	@Column(name = "EOOC_SUBSTR24")
	public String getEoocSubstr24() {
		return eoocSubstr24;
	}

	/**
	 * Set eoocSubstr24
	 */
	public void setEoocSubstr24(String eoocSubstr24) {
		this.eoocSubstr24 = eoocSubstr24;
		addValidField("eoocSubstr24");
	}

	/**
	 * Get eoocSubstr25
	 */
	@Column(name = "EOOC_SUBSTR25")
	public String getEoocSubstr25() {
		return eoocSubstr25;
	}

	/**
	 * Set eoocSubstr25
	 */
	public void setEoocSubstr25(String eoocSubstr25) {
		this.eoocSubstr25 = eoocSubstr25;
		addValidField("eoocSubstr25");
	}

	/**
	 * Get eoocSubdate5
	 */
	@Column(name = "EOOC_SUBDATE5")
	public Date getEoocSubdate5() {
		return eoocSubdate5;
	}

	/**
	 * Set eoocSubdate5
	 */
	public void setEoocSubdate5(Date eoocSubdate5) {
		this.eoocSubdate5 = eoocSubdate5;
		addValidField("eoocSubdate5");
	}

	/**
	 * Get eoocSubdate6
	 */
	@Column(name = "EOOC_SUBDATE6")
	public Date getEoocSubdate6() {
		return eoocSubdate6;
	}

	/**
	 * Set eoocSubdate6
	 */
	public void setEoocSubdate6(Date eoocSubdate6) {
		this.eoocSubdate6 = eoocSubdate6;
		addValidField("eoocSubdate6");
	}

	/**
	 * Get eoocSubdate7
	 */
	@Column(name = "EOOC_SUBDATE7")
	public Date getEoocSubdate7() {
		return eoocSubdate7;
	}

	/**
	 * Set eoocSubdate7
	 */
	public void setEoocSubdate7(Date eoocSubdate7) {
		this.eoocSubdate7 = eoocSubdate7;
		addValidField("eoocSubdate7");
	}

	/**
	 * Get eoocSubdate8
	 */
	@Column(name = "EOOC_SUBDATE8")
	public Date getEoocSubdate8() {
		return eoocSubdate8;
	}

	/**
	 * Set eoocSubdate8
	 */
	public void setEoocSubdate8(Date eoocSubdate8) {
		this.eoocSubdate8 = eoocSubdate8;
		addValidField("eoocSubdate8");
	}

	/**
	 * Get eoocSubdate9
	 */
	@Column(name = "EOOC_SUBDATE9")
	public Date getEoocSubdate9() {
		return eoocSubdate9;
	}

	/**
	 * Set eoocSubdate9
	 */
	public void setEoocSubdate9(Date eoocSubdate9) {
		this.eoocSubdate9 = eoocSubdate9;
		addValidField("eoocSubdate9");
	}

	/**
	 * Get eoocSubdate10
	 */
	@Column(name = "EOOC_SUBDATE10")
	public Date getEoocSubdate10() {
		return eoocSubdate10;
	}

	/**
	 * Set eoocSubdate10
	 */
	public void setEoocSubdate10(Date eoocSubdate10) {
		this.eoocSubdate10 = eoocSubdate10;
		addValidField("eoocSubdate10");
	}

	/**
	 * Get eoocSubnum5
	 */
	@Column(name = "EOOC_SUBNUM5")
	public Long getEoocSubnum5() {
		return eoocSubnum5;
	}

	/**
	 * Set eoocSubnum5
	 */
	public void setEoocSubnum5(Long eoocSubnum5) {
		this.eoocSubnum5 = eoocSubnum5;
		addValidField("eoocSubnum5");
	}

	/**
	 * Get eoocSubnum6
	 */
	@Column(name = "EOOC_SUBNUM6")
	public Long getEoocSubnum6() {
		return eoocSubnum6;
	}

	/**
	 * Set eoocSubnum6
	 */
	public void setEoocSubnum6(Long eoocSubnum6) {
		this.eoocSubnum6 = eoocSubnum6;
		addValidField("eoocSubnum6");
	}

	/**
	 * Get eoocEoccId
	 */
	@Column(name = "EOOC_EOCC_ID")
	public Long getEoocEoccId() {
		return eoocEoccId;
	}

	/**
	 * Set eoocEoccId
	 */
	public void setEoocEoccId(Long eoocEoccId) {
		this.eoocEoccId = eoocEoccId;
		addValidField("eoocEoccId");
	}

	/**
	 * Get eoocVgmGrossWeight
	 */
	@Column(name = "EOOC_VGM_GROSS_WEIGHT")
	public Double getEoocVgmGrossWeight() {
		return eoocVgmGrossWeight;
	}

	/**
	 * Set eoocVgmGrossWeight
	 */
	public void setEoocVgmGrossWeight(Double eoocVgmGrossWeight) {
		this.eoocVgmGrossWeight = eoocVgmGrossWeight;
		addValidField("eoocVgmGrossWeight");
	}

	/**
	 * Get eoocVgmDate
	 */
	@Column(name = "EOOC_VGM_DATE")
	public Date getEoocVgmDate() {
		return eoocVgmDate;
	}

	/**
	 * Set eoocVgmDate
	 */
	public void setEoocVgmDate(Date eoocVgmDate) {
		this.eoocVgmDate = eoocVgmDate;
		addValidField("eoocVgmDate");
	}

	/**
	 * Get eoocVgmMethod
	 */
	@Column(name = "EOOC_VGM_METHOD")
	public String getEoocVgmMethod() {
		return eoocVgmMethod;
	}

	/**
	 * Set eoocVgmMethod
	 */
	public void setEoocVgmMethod(String eoocVgmMethod) {
		this.eoocVgmMethod = eoocVgmMethod;
		addValidField("eoocVgmMethod");
	}

	/**
	 * Get eoocLocationCode
	 */
	@Column(name = "EOOC_LOCATION_CODE")
	public String getEoocLocationCode() {
		return eoocLocationCode;
	}

	/**
	 * Set eoocLocationCode
	 */
	public void setEoocLocationCode(String eoocLocationCode) {
		this.eoocLocationCode = eoocLocationCode;
		addValidField("eoocLocationCode");
	}

	/**
	 * Get eoocLocationName
	 */
	@Column(name = "EOOC_LOCATION_NAME")
	public String getEoocLocationName() {
		return eoocLocationName;
	}

	/**
	 * Set eoocLocationName
	 */
	public void setEoocLocationName(String eoocLocationName) {
		this.eoocLocationName = eoocLocationName;
		addValidField("eoocLocationName");
	}

	/**
	 * Get eoocVgmCertificateRef
	 */
	@Column(name = "EOOC_VGM_CERTIFICATE_REF")
	public String getEoocVgmCertificateRef() {
		return eoocVgmCertificateRef;
	}

	/**
	 * Set eoocVgmCertificateRef
	 */
	public void setEoocVgmCertificateRef(String eoocVgmCertificateRef) {
		this.eoocVgmCertificateRef = eoocVgmCertificateRef;
		addValidField("eoocVgmCertificateRef");
	}

	/**
	 * Get eoocShipperName
	 */
	@Column(name = "EOOC_SHIPPER_NAME")
	public String getEoocShipperName() {
		return eoocShipperName;
	}

	/**
	 * Set eoocShipperName
	 */
	public void setEoocShipperName(String eoocShipperName) {
		this.eoocShipperName = eoocShipperName;
		addValidField("eoocShipperName");
	}

	/**
	 * Get eoocShipperAddress
	 */
	@Column(name = "EOOC_SHIPPER_ADDRESS")
	public String getEoocShipperAddress() {
		return eoocShipperAddress;
	}

	/**
	 * Set eoocShipperAddress
	 */
	public void setEoocShipperAddress(String eoocShipperAddress) {
		this.eoocShipperAddress = eoocShipperAddress;
		addValidField("eoocShipperAddress");
	}

	/**
	 * Get eoocShipperVgmName
	 */
	@Column(name = "EOOC_SHIPPER_VGM_NAME")
	public String getEoocShipperVgmName() {
		return eoocShipperVgmName;
	}

	/**
	 * Set eoocShipperVgmName
	 */
	public void setEoocShipperVgmName(String eoocShipperVgmName) {
		this.eoocShipperVgmName = eoocShipperVgmName;
		addValidField("eoocShipperVgmName");
	}

	/**
	 * Get eoocShipperVgmEmail
	 */
	@Column(name = "EOOC_SHIPPER_VGM_EMAIL")
	public String getEoocShipperVgmEmail() {
		return eoocShipperVgmEmail;
	}

	/**
	 * Set eoocShipperVgmEmail
	 */
	public void setEoocShipperVgmEmail(String eoocShipperVgmEmail) {
		this.eoocShipperVgmEmail = eoocShipperVgmEmail;
		addValidField("eoocShipperVgmEmail");
	}

	/**
	 * Get eoocShipperVgmTelephone
	 */
	@Column(name = "EOOC_SHIPPER_VGM_TELEPHONE")
	public String getEoocShipperVgmTelephone() {
		return eoocShipperVgmTelephone;
	}

	/**
	 * Set eoocShipperVgmTelephone
	 */
	public void setEoocShipperVgmTelephone(String eoocShipperVgmTelephone) {
		this.eoocShipperVgmTelephone = eoocShipperVgmTelephone;
		addValidField("eoocShipperVgmTelephone");
	}

	/**
	 * Get eoocShipperVgmPerson
	 */
	@Column(name = "EOOC_SHIPPER_VGM_PERSON")
	public String getEoocShipperVgmPerson() {
		return eoocShipperVgmPerson;
	}

	/**
	 * Set eoocShipperVgmPerson
	 */
	public void setEoocShipperVgmPerson(String eoocShipperVgmPerson) {
		this.eoocShipperVgmPerson = eoocShipperVgmPerson;
		addValidField("eoocShipperVgmPerson");
	}

	/**
	 * Get eoocShipperVgmPersonSig
	 */
	@Column(name = "EOOC_SHIPPER_VGM_PERSON_SIG")
	public String getEoocShipperVgmPersonSig() {
		return eoocShipperVgmPersonSig;
	}

	/**
	 * Set eoocShipperVgmPersonSig
	 */
	public void setEoocShipperVgmPersonSig(String eoocShipperVgmPersonSig) {
		this.eoocShipperVgmPersonSig = eoocShipperVgmPersonSig;
		addValidField("eoocShipperVgmPersonSig");
	}

	/**
	 * Get eoocCompanyName
	 */
	@Column(name = "EOOC_COMPANY_NAME")
	public String getEoocCompanyName() {
		return eoocCompanyName;
	}

	/**
	 * Set eoocCompanyName
	 */
	public void setEoocCompanyName(String eoocCompanyName) {
		this.eoocCompanyName = eoocCompanyName;
		addValidField("eoocCompanyName");
	}

	/**
	 * Get eoocCompanyAddress
	 */
	@Column(name = "EOOC_COMPANY_ADDRESS")
	public String getEoocCompanyAddress() {
		return eoocCompanyAddress;
	}

	/**
	 * Set eoocCompanyAddress
	 */
	public void setEoocCompanyAddress(String eoocCompanyAddress) {
		this.eoocCompanyAddress = eoocCompanyAddress;
		addValidField("eoocCompanyAddress");
	}

	/**
	 * Get eoocCompanyContactName
	 */
	@Column(name = "EOOC_COMPANY_CONTACT_NAME")
	public String getEoocCompanyContactName() {
		return eoocCompanyContactName;
	}

	/**
	 * Set eoocCompanyContactName
	 */
	public void setEoocCompanyContactName(String eoocCompanyContactName) {
		this.eoocCompanyContactName = eoocCompanyContactName;
		addValidField("eoocCompanyContactName");
	}

	/**
	 * Get eoocCompanyContactEmail
	 */
	@Column(name = "EOOC_COMPANY_CONTACT_EMAIL")
	public String getEoocCompanyContactEmail() {
		return eoocCompanyContactEmail;
	}

	/**
	 * Set eoocCompanyContactEmail
	 */
	public void setEoocCompanyContactEmail(String eoocCompanyContactEmail) {
		this.eoocCompanyContactEmail = eoocCompanyContactEmail;
		addValidField("eoocCompanyContactEmail");
	}

	/**
	 * Get eoocCompanyContactTelephone
	 */
	@Column(name = "EOOC_COMPANY_CONTACT_TELEPHONE")
	public String getEoocCompanyContactTelephone() {
		return eoocCompanyContactTelephone;
	}

	/**
	 * Set eoocCompanyContactTelephone
	 */
	public void setEoocCompanyContactTelephone(String eoocCompanyContactTelephone) {
		this.eoocCompanyContactTelephone = eoocCompanyContactTelephone;
		addValidField("eoocCompanyContactTelephone");
	}

	/**
	 * Get eoocCompanyContactPerson
	 */
	@Column(name = "EOOC_COMPANY_CONTACT_PERSON")
	public String getEoocCompanyContactPerson() {
		return eoocCompanyContactPerson;
	}

	/**
	 * Set eoocCompanyContactPerson
	 */
	public void setEoocCompanyContactPerson(String eoocCompanyContactPerson) {
		this.eoocCompanyContactPerson = eoocCompanyContactPerson;
		addValidField("eoocCompanyContactPerson");
	}

	/**
	 * Get eoocCompanyContactSig
	 */
	@Column(name = "EOOC_COMPANY_CONTACT_SIG")
	public String getEoocCompanyContactSig() {
		return eoocCompanyContactSig;
	}

	/**
	 * Set eoocCompanyContactSig
	 */
	public void setEoocCompanyContactSig(String eoocCompanyContactSig) {
		this.eoocCompanyContactSig = eoocCompanyContactSig;
		addValidField("eoocCompanyContactSig");
	}

	/**
	 * Get eoocCntWeight
	 */
	@Column(name = "EOOC_CNT_WEIGHT")
	public Double getEoocCntWeight() {
		return eoocCntWeight;
	}

	/**
	 * Set eoocCntWeight
	 */
	public void setEoocCntWeight(Double eoocCntWeight) {
		this.eoocCntWeight = eoocCntWeight;
		addValidField("eoocCntWeight");
	}

	/**
	 * Get eoocQuantity
	 */
	@Column(name = "EOOC_QUANTITY")
	public Long getEoocQuantity() {
		return eoocQuantity;
	}

	/**
	 * Set eoocQuantity
	 */
	public void setEoocQuantity(Long eoocQuantity) {
		this.eoocQuantity = eoocQuantity;
		addValidField("eoocQuantity");
	}

	/**
	 * Get eoocWeight
	 */
	@Column(name = "EOOC_WEIGHT")
	public Double getEoocWeight() {
		return eoocWeight;
	}

	/**
	 * Set eoocWeight
	 */
	public void setEoocWeight(Double eoocWeight) {
		this.eoocWeight = eoocWeight;
		addValidField("eoocWeight");
	}

	/**
	 * Get eoocVolume
	 */
	@Column(name = "EOOC_VOLUME")
	public Double getEoocVolume() {
		return eoocVolume;
	}

	/**
	 * Set eoocVolume
	 */
	public void setEoocVolume(Double eoocVolume) {
		this.eoocVolume = eoocVolume;
		addValidField("eoocVolume");
	}

}
