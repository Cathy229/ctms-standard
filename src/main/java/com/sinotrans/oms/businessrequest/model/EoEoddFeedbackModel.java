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
 * Model class for EoEoddFeedback
 */
@Entity
@Table(name = "EO_EODD_FEEDBACK")
public class EoEoddFeedbackModel extends BaseModel implements OperationLog {

	//eodfId
	private Long eodfId;
	//eodfEoddId
	private Long eodfEoddId;
	//eodfCustomsNo
	private String eodfCustomsNo;
	//eodfDeclarationNo
	private String eodfDeclarationNo;
	//eodfVerificationNo
	private String eodfVerificationNo;
	//eodfManualNo
	private String eodfManualNo;
	//eodfDeclarationNum
	private Long eodfDeclarationNum;
	//eodfBillDeliveryAllDate
	private Date eodfBillDeliveryAllDate;
	//eodfFilingDate
	private Date eodfFilingDate;
	//eodfSingleDeliveryDate
	private Date eodfSingleDeliveryDate;
	//eodfInspectionDate
	private Date eodfInspectionDate;
	//eodfNoticeTaxDate
	private Date eodfNoticeTaxDate;
	//eodfTaxCompletionDate
	private Date eodfTaxCompletionDate;
	//eodfReleaseDate
	private Date eodfReleaseDate;
	//eodfBillSignBackDate
	private Date eodfBillSignBackDate;
	//eodfCustomsStatus
	private String eodfCustomsStatus;
	//eodfRemark
	private String eodfRemark;
	//eodfSubstr1
	private String eodfSubstr1;
	//eodfSubstr2
	private String eodfSubstr2;
	//eodfSubstr3
	private String eodfSubstr3;
	//eodfSubstr4
	private String eodfSubstr4;
	//eodfSubstr5
	private String eodfSubstr5;
	//eodfSubstr6
	private String eodfSubstr6;
	//eodfSubstr7
	private String eodfSubstr7;
	//eodfSubstr8
	private String eodfSubstr8;
	//eodfSubstr9
	private String eodfSubstr9;
	//eodfSubstr10
	private String eodfSubstr10;
	//eodfSubstr11
	private String eodfSubstr11;
	//eodfSubstr12
	private String eodfSubstr12;
	//eodfSubstr13
	private String eodfSubstr13;
	//eodfSubstr14
	private String eodfSubstr14;
	//eodfSubstr15
	private String eodfSubstr15;
	//eodfSubstr16
	private String eodfSubstr16;
	//eodfSubstr17
	private String eodfSubstr17;
	//eodfSubstr18
	private String eodfSubstr18;
	//eodfSubstr19
	private String eodfSubstr19;
	//eodfSubstr20
	private String eodfSubstr20;
	//eodfSubstr21
	private String eodfSubstr21;
	//eodfSubstr22
	private String eodfSubstr22;
	//eodfSubstr23
	private String eodfSubstr23;
	//eodfSubstr24
	private String eodfSubstr24;
	//eodfSubstr25
	private String eodfSubstr25;
	//eodfSubdate1
	private Date eodfSubdate1;
	//eodfSubdate2
	private Date eodfSubdate2;
	//eodfSubdate3
	private Date eodfSubdate3;
	//eodfSubdate4
	private Date eodfSubdate4;
	//eodfSubdate5
	private Date eodfSubdate5;
	//eodfSubdate6
	private Date eodfSubdate6;
	//eodfSubdate7
	private Date eodfSubdate7;
	//eodfSubdate8
	private Date eodfSubdate8;
	//eodfSubdate9
	private Date eodfSubdate9;
	//eodfSubdate10
	private Date eodfSubdate10;
	//eodfSubnum1
	private Long eodfSubnum1;
	//eodfSubnum2
	private Long eodfSubnum2;
	//eodfSubnum3
	private Long eodfSubnum3;
	//eodfSubnum4
	private Long eodfSubnum4;
	//eodfSubnum5
	private Long eodfSubnum5;
	//eodfSubnum6
	private Long eodfSubnum6;
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
	//eodfTradeMode
	private String eodfTradeMode;

	/**
	 * Get eodfId
	 */
	@Column(name = "EODF_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEodfId() {
		return eodfId;
	}

	/**
	 * Set eodfId
	 */
	public void setEodfId(Long eodfId) {
		this.eodfId = eodfId;
		addValidField("eodfId");
	}

	/**
	 * Get eodfEoddId
	 */
	@Column(name = "EODF_EODD_ID")
	public Long getEodfEoddId() {
		return eodfEoddId;
	}

	/**
	 * Set eodfEoddId
	 */
	public void setEodfEoddId(Long eodfEoddId) {
		this.eodfEoddId = eodfEoddId;
		addValidField("eodfEoddId");
	}

	/**
	 * Get eodfCustomsNo
	 */
	@Column(name = "EODF_CUSTOMS_NO")
	public String getEodfCustomsNo() {
		return eodfCustomsNo;
	}

	/**
	 * Set eodfCustomsNo
	 */
	public void setEodfCustomsNo(String eodfCustomsNo) {
		this.eodfCustomsNo = eodfCustomsNo;
		addValidField("eodfCustomsNo");
	}

	/**
	 * Get eodfDeclarationNo
	 */
	@Column(name = "EODF_DECLARATION_NO")
	public String getEodfDeclarationNo() {
		return eodfDeclarationNo;
	}

	/**
	 * Set eodfDeclarationNo
	 */
	public void setEodfDeclarationNo(String eodfDeclarationNo) {
		this.eodfDeclarationNo = eodfDeclarationNo;
		addValidField("eodfDeclarationNo");
	}

	/**
	 * Get eodfVerificationNo
	 */
	@Column(name = "EODF_VERIFICATION_NO")
	public String getEodfVerificationNo() {
		return eodfVerificationNo;
	}

	/**
	 * Set eodfVerificationNo
	 */
	public void setEodfVerificationNo(String eodfVerificationNo) {
		this.eodfVerificationNo = eodfVerificationNo;
		addValidField("eodfVerificationNo");
	}

	/**
	 * Get eodfManualNo
	 */
	@Column(name = "EODF_MANUAL_NO")
	public String getEodfManualNo() {
		return eodfManualNo;
	}

	/**
	 * Set eodfManualNo
	 */
	public void setEodfManualNo(String eodfManualNo) {
		this.eodfManualNo = eodfManualNo;
		addValidField("eodfManualNo");
	}

	/**
	 * Get eodfDeclarationNum
	 */
	@Column(name = "EODF_DECLARATION_NUM")
	public Long getEodfDeclarationNum() {
		return eodfDeclarationNum;
	}

	/**
	 * Set eodfDeclarationNum
	 */
	public void setEodfDeclarationNum(Long eodfDeclarationNum) {
		this.eodfDeclarationNum = eodfDeclarationNum;
		addValidField("eodfDeclarationNum");
	}

	/**
	 * Get eodfBillDeliveryAllDate
	 */
	@Column(name = "EODF_BILL_DELIVERY_ALL_DATE")
	public Date getEodfBillDeliveryAllDate() {
		return eodfBillDeliveryAllDate;
	}

	/**
	 * Set eodfBillDeliveryAllDate
	 */
	public void setEodfBillDeliveryAllDate(Date eodfBillDeliveryAllDate) {
		this.eodfBillDeliveryAllDate = eodfBillDeliveryAllDate;
		addValidField("eodfBillDeliveryAllDate");
	}

	/**
	 * Get eodfFilingDate
	 */
	@Column(name = "EODF_FILING_DATE")
	public Date getEodfFilingDate() {
		return eodfFilingDate;
	}

	/**
	 * Set eodfFilingDate
	 */
	public void setEodfFilingDate(Date eodfFilingDate) {
		this.eodfFilingDate = eodfFilingDate;
		addValidField("eodfFilingDate");
	}

	/**
	 * Get eodfSingleDeliveryDate
	 */
	@Column(name = "EODF_SINGLE_DELIVERY_DATE")
	public Date getEodfSingleDeliveryDate() {
		return eodfSingleDeliveryDate;
	}

	/**
	 * Set eodfSingleDeliveryDate
	 */
	public void setEodfSingleDeliveryDate(Date eodfSingleDeliveryDate) {
		this.eodfSingleDeliveryDate = eodfSingleDeliveryDate;
		addValidField("eodfSingleDeliveryDate");
	}

	/**
	 * Get eodfInspectionDate
	 */
	@Column(name = "EODF_INSPECTION_DATE")
	public Date getEodfInspectionDate() {
		return eodfInspectionDate;
	}

	/**
	 * Set eodfInspectionDate
	 */
	public void setEodfInspectionDate(Date eodfInspectionDate) {
		this.eodfInspectionDate = eodfInspectionDate;
		addValidField("eodfInspectionDate");
	}

	/**
	 * Get eodfNoticeTaxDate
	 */
	@Column(name = "EODF_NOTICE_TAX_DATE")
	public Date getEodfNoticeTaxDate() {
		return eodfNoticeTaxDate;
	}

	/**
	 * Set eodfNoticeTaxDate
	 */
	public void setEodfNoticeTaxDate(Date eodfNoticeTaxDate) {
		this.eodfNoticeTaxDate = eodfNoticeTaxDate;
		addValidField("eodfNoticeTaxDate");
	}

	/**
	 * Get eodfTaxCompletionDate
	 */
	@Column(name = "EODF_TAX_COMPLETION_DATE")
	public Date getEodfTaxCompletionDate() {
		return eodfTaxCompletionDate;
	}

	/**
	 * Set eodfTaxCompletionDate
	 */
	public void setEodfTaxCompletionDate(Date eodfTaxCompletionDate) {
		this.eodfTaxCompletionDate = eodfTaxCompletionDate;
		addValidField("eodfTaxCompletionDate");
	}

	/**
	 * Get eodfReleaseDate
	 */
	@Column(name = "EODF_RELEASE_DATE")
	public Date getEodfReleaseDate() {
		return eodfReleaseDate;
	}

	/**
	 * Set eodfReleaseDate
	 */
	public void setEodfReleaseDate(Date eodfReleaseDate) {
		this.eodfReleaseDate = eodfReleaseDate;
		addValidField("eodfReleaseDate");
	}

	/**
	 * Get eodfBillSignBackDate
	 */
	@Column(name = "EODF_BILL_SIGN_BACK_DATE")
	public Date getEodfBillSignBackDate() {
		return eodfBillSignBackDate;
	}

	/**
	 * Set eodfBillSignBackDate
	 */
	public void setEodfBillSignBackDate(Date eodfBillSignBackDate) {
		this.eodfBillSignBackDate = eodfBillSignBackDate;
		addValidField("eodfBillSignBackDate");
	}

	/**
	 * Get eodfCustomsStatus
	 */
	@Column(name = "EODF_CUSTOMS_STATUS")
	public String getEodfCustomsStatus() {
		return eodfCustomsStatus;
	}

	/**
	 * Set eodfCustomsStatus
	 */
	public void setEodfCustomsStatus(String eodfCustomsStatus) {
		this.eodfCustomsStatus = eodfCustomsStatus;
		addValidField("eodfCustomsStatus");
	}

	/**
	 * Get eodfRemark
	 */
	@Column(name = "EODF_REMARK")
	public String getEodfRemark() {
		return eodfRemark;
	}

	/**
	 * Set eodfRemark
	 */
	public void setEodfRemark(String eodfRemark) {
		this.eodfRemark = eodfRemark;
		addValidField("eodfRemark");
	}

	/**
	 * Get eodfSubstr1
	 */
	@Column(name = "EODF_SUBSTR1")
	public String getEodfSubstr1() {
		return eodfSubstr1;
	}

	/**
	 * Set eodfSubstr1
	 */
	public void setEodfSubstr1(String eodfSubstr1) {
		this.eodfSubstr1 = eodfSubstr1;
		addValidField("eodfSubstr1");
	}

	/**
	 * Get eodfSubstr2
	 */
	@Column(name = "EODF_SUBSTR2")
	public String getEodfSubstr2() {
		return eodfSubstr2;
	}

	/**
	 * Set eodfSubstr2
	 */
	public void setEodfSubstr2(String eodfSubstr2) {
		this.eodfSubstr2 = eodfSubstr2;
		addValidField("eodfSubstr2");
	}

	/**
	 * Get eodfSubstr3
	 */
	@Column(name = "EODF_SUBSTR3")
	public String getEodfSubstr3() {
		return eodfSubstr3;
	}

	/**
	 * Set eodfSubstr3
	 */
	public void setEodfSubstr3(String eodfSubstr3) {
		this.eodfSubstr3 = eodfSubstr3;
		addValidField("eodfSubstr3");
	}

	/**
	 * Get eodfSubstr4
	 */
	@Column(name = "EODF_SUBSTR4")
	public String getEodfSubstr4() {
		return eodfSubstr4;
	}

	/**
	 * Set eodfSubstr4
	 */
	public void setEodfSubstr4(String eodfSubstr4) {
		this.eodfSubstr4 = eodfSubstr4;
		addValidField("eodfSubstr4");
	}

	/**
	 * Get eodfSubstr5
	 */
	@Column(name = "EODF_SUBSTR5")
	public String getEodfSubstr5() {
		return eodfSubstr5;
	}

	/**
	 * Set eodfSubstr5
	 */
	public void setEodfSubstr5(String eodfSubstr5) {
		this.eodfSubstr5 = eodfSubstr5;
		addValidField("eodfSubstr5");
	}

	/**
	 * Get eodfSubstr6
	 */
	@Column(name = "EODF_SUBSTR6")
	public String getEodfSubstr6() {
		return eodfSubstr6;
	}

	/**
	 * Set eodfSubstr6
	 */
	public void setEodfSubstr6(String eodfSubstr6) {
		this.eodfSubstr6 = eodfSubstr6;
		addValidField("eodfSubstr6");
	}

	/**
	 * Get eodfSubstr7
	 */
	@Column(name = "EODF_SUBSTR7")
	public String getEodfSubstr7() {
		return eodfSubstr7;
	}

	/**
	 * Set eodfSubstr7
	 */
	public void setEodfSubstr7(String eodfSubstr7) {
		this.eodfSubstr7 = eodfSubstr7;
		addValidField("eodfSubstr7");
	}

	/**
	 * Get eodfSubstr8
	 */
	@Column(name = "EODF_SUBSTR8")
	public String getEodfSubstr8() {
		return eodfSubstr8;
	}

	/**
	 * Set eodfSubstr8
	 */
	public void setEodfSubstr8(String eodfSubstr8) {
		this.eodfSubstr8 = eodfSubstr8;
		addValidField("eodfSubstr8");
	}

	/**
	 * Get eodfSubstr9
	 */
	@Column(name = "EODF_SUBSTR9")
	public String getEodfSubstr9() {
		return eodfSubstr9;
	}

	/**
	 * Set eodfSubstr9
	 */
	public void setEodfSubstr9(String eodfSubstr9) {
		this.eodfSubstr9 = eodfSubstr9;
		addValidField("eodfSubstr9");
	}

	/**
	 * Get eodfSubstr10
	 */
	@Column(name = "EODF_SUBSTR10")
	public String getEodfSubstr10() {
		return eodfSubstr10;
	}

	/**
	 * Set eodfSubstr10
	 */
	public void setEodfSubstr10(String eodfSubstr10) {
		this.eodfSubstr10 = eodfSubstr10;
		addValidField("eodfSubstr10");
	}

	/**
	 * Get eodfSubstr11
	 */
	@Column(name = "EODF_SUBSTR11")
	public String getEodfSubstr11() {
		return eodfSubstr11;
	}

	/**
	 * Set eodfSubstr11
	 */
	public void setEodfSubstr11(String eodfSubstr11) {
		this.eodfSubstr11 = eodfSubstr11;
		addValidField("eodfSubstr11");
	}

	/**
	 * Get eodfSubstr12
	 */
	@Column(name = "EODF_SUBSTR12")
	public String getEodfSubstr12() {
		return eodfSubstr12;
	}

	/**
	 * Set eodfSubstr12
	 */
	public void setEodfSubstr12(String eodfSubstr12) {
		this.eodfSubstr12 = eodfSubstr12;
		addValidField("eodfSubstr12");
	}

	/**
	 * Get eodfSubstr13
	 */
	@Column(name = "EODF_SUBSTR13")
	public String getEodfSubstr13() {
		return eodfSubstr13;
	}

	/**
	 * Set eodfSubstr13
	 */
	public void setEodfSubstr13(String eodfSubstr13) {
		this.eodfSubstr13 = eodfSubstr13;
		addValidField("eodfSubstr13");
	}

	/**
	 * Get eodfSubstr14
	 */
	@Column(name = "EODF_SUBSTR14")
	public String getEodfSubstr14() {
		return eodfSubstr14;
	}

	/**
	 * Set eodfSubstr14
	 */
	public void setEodfSubstr14(String eodfSubstr14) {
		this.eodfSubstr14 = eodfSubstr14;
		addValidField("eodfSubstr14");
	}

	/**
	 * Get eodfSubstr15
	 */
	@Column(name = "EODF_SUBSTR15")
	public String getEodfSubstr15() {
		return eodfSubstr15;
	}

	/**
	 * Set eodfSubstr15
	 */
	public void setEodfSubstr15(String eodfSubstr15) {
		this.eodfSubstr15 = eodfSubstr15;
		addValidField("eodfSubstr15");
	}

	/**
	 * Get eodfSubstr16
	 */
	@Column(name = "EODF_SUBSTR16")
	public String getEodfSubstr16() {
		return eodfSubstr16;
	}

	/**
	 * Set eodfSubstr16
	 */
	public void setEodfSubstr16(String eodfSubstr16) {
		this.eodfSubstr16 = eodfSubstr16;
		addValidField("eodfSubstr16");
	}

	/**
	 * Get eodfSubstr17
	 */
	@Column(name = "EODF_SUBSTR17")
	public String getEodfSubstr17() {
		return eodfSubstr17;
	}

	/**
	 * Set eodfSubstr17
	 */
	public void setEodfSubstr17(String eodfSubstr17) {
		this.eodfSubstr17 = eodfSubstr17;
		addValidField("eodfSubstr17");
	}

	/**
	 * Get eodfSubstr18
	 */
	@Column(name = "EODF_SUBSTR18")
	public String getEodfSubstr18() {
		return eodfSubstr18;
	}

	/**
	 * Set eodfSubstr18
	 */
	public void setEodfSubstr18(String eodfSubstr18) {
		this.eodfSubstr18 = eodfSubstr18;
		addValidField("eodfSubstr18");
	}

	/**
	 * Get eodfSubstr19
	 */
	@Column(name = "EODF_SUBSTR19")
	public String getEodfSubstr19() {
		return eodfSubstr19;
	}

	/**
	 * Set eodfSubstr19
	 */
	public void setEodfSubstr19(String eodfSubstr19) {
		this.eodfSubstr19 = eodfSubstr19;
		addValidField("eodfSubstr19");
	}

	/**
	 * Get eodfSubstr20
	 */
	@Column(name = "EODF_SUBSTR20")
	public String getEodfSubstr20() {
		return eodfSubstr20;
	}

	/**
	 * Set eodfSubstr20
	 */
	public void setEodfSubstr20(String eodfSubstr20) {
		this.eodfSubstr20 = eodfSubstr20;
		addValidField("eodfSubstr20");
	}

	/**
	 * Get eodfSubstr21
	 */
	@Column(name = "EODF_SUBSTR21")
	public String getEodfSubstr21() {
		return eodfSubstr21;
	}

	/**
	 * Set eodfSubstr21
	 */
	public void setEodfSubstr21(String eodfSubstr21) {
		this.eodfSubstr21 = eodfSubstr21;
		addValidField("eodfSubstr21");
	}

	/**
	 * Get eodfSubstr22
	 */
	@Column(name = "EODF_SUBSTR22")
	public String getEodfSubstr22() {
		return eodfSubstr22;
	}

	/**
	 * Set eodfSubstr22
	 */
	public void setEodfSubstr22(String eodfSubstr22) {
		this.eodfSubstr22 = eodfSubstr22;
		addValidField("eodfSubstr22");
	}

	/**
	 * Get eodfSubstr23
	 */
	@Column(name = "EODF_SUBSTR23")
	public String getEodfSubstr23() {
		return eodfSubstr23;
	}

	/**
	 * Set eodfSubstr23
	 */
	public void setEodfSubstr23(String eodfSubstr23) {
		this.eodfSubstr23 = eodfSubstr23;
		addValidField("eodfSubstr23");
	}

	/**
	 * Get eodfSubstr24
	 */
	@Column(name = "EODF_SUBSTR24")
	public String getEodfSubstr24() {
		return eodfSubstr24;
	}

	/**
	 * Set eodfSubstr24
	 */
	public void setEodfSubstr24(String eodfSubstr24) {
		this.eodfSubstr24 = eodfSubstr24;
		addValidField("eodfSubstr24");
	}

	/**
	 * Get eodfSubstr25
	 */
	@Column(name = "EODF_SUBSTR25")
	public String getEodfSubstr25() {
		return eodfSubstr25;
	}

	/**
	 * Set eodfSubstr25
	 */
	public void setEodfSubstr25(String eodfSubstr25) {
		this.eodfSubstr25 = eodfSubstr25;
		addValidField("eodfSubstr25");
	}

	/**
	 * Get eodfSubdate1
	 */
	@Column(name = "EODF_SUBDATE1")
	public Date getEodfSubdate1() {
		return eodfSubdate1;
	}

	/**
	 * Set eodfSubdate1
	 */
	public void setEodfSubdate1(Date eodfSubdate1) {
		this.eodfSubdate1 = eodfSubdate1;
		addValidField("eodfSubdate1");
	}

	/**
	 * Get eodfSubdate2
	 */
	@Column(name = "EODF_SUBDATE2")
	public Date getEodfSubdate2() {
		return eodfSubdate2;
	}

	/**
	 * Set eodfSubdate2
	 */
	public void setEodfSubdate2(Date eodfSubdate2) {
		this.eodfSubdate2 = eodfSubdate2;
		addValidField("eodfSubdate2");
	}

	/**
	 * Get eodfSubdate3
	 */
	@Column(name = "EODF_SUBDATE3")
	public Date getEodfSubdate3() {
		return eodfSubdate3;
	}

	/**
	 * Set eodfSubdate3
	 */
	public void setEodfSubdate3(Date eodfSubdate3) {
		this.eodfSubdate3 = eodfSubdate3;
		addValidField("eodfSubdate3");
	}

	/**
	 * Get eodfSubdate4
	 */
	@Column(name = "EODF_SUBDATE4")
	public Date getEodfSubdate4() {
		return eodfSubdate4;
	}

	/**
	 * Set eodfSubdate4
	 */
	public void setEodfSubdate4(Date eodfSubdate4) {
		this.eodfSubdate4 = eodfSubdate4;
		addValidField("eodfSubdate4");
	}

	/**
	 * Get eodfSubdate5
	 */
	@Column(name = "EODF_SUBDATE5")
	public Date getEodfSubdate5() {
		return eodfSubdate5;
	}

	/**
	 * Set eodfSubdate5
	 */
	public void setEodfSubdate5(Date eodfSubdate5) {
		this.eodfSubdate5 = eodfSubdate5;
		addValidField("eodfSubdate5");
	}

	/**
	 * Get eodfSubdate6
	 */
	@Column(name = "EODF_SUBDATE6")
	public Date getEodfSubdate6() {
		return eodfSubdate6;
	}

	/**
	 * Set eodfSubdate6
	 */
	public void setEodfSubdate6(Date eodfSubdate6) {
		this.eodfSubdate6 = eodfSubdate6;
		addValidField("eodfSubdate6");
	}

	/**
	 * Get eodfSubdate7
	 */
	@Column(name = "EODF_SUBDATE7")
	public Date getEodfSubdate7() {
		return eodfSubdate7;
	}

	/**
	 * Set eodfSubdate7
	 */
	public void setEodfSubdate7(Date eodfSubdate7) {
		this.eodfSubdate7 = eodfSubdate7;
		addValidField("eodfSubdate7");
	}

	/**
	 * Get eodfSubdate8
	 */
	@Column(name = "EODF_SUBDATE8")
	public Date getEodfSubdate8() {
		return eodfSubdate8;
	}

	/**
	 * Set eodfSubdate8
	 */
	public void setEodfSubdate8(Date eodfSubdate8) {
		this.eodfSubdate8 = eodfSubdate8;
		addValidField("eodfSubdate8");
	}

	/**
	 * Get eodfSubdate9
	 */
	@Column(name = "EODF_SUBDATE9")
	public Date getEodfSubdate9() {
		return eodfSubdate9;
	}

	/**
	 * Set eodfSubdate9
	 */
	public void setEodfSubdate9(Date eodfSubdate9) {
		this.eodfSubdate9 = eodfSubdate9;
		addValidField("eodfSubdate9");
	}

	/**
	 * Get eodfSubdate10
	 */
	@Column(name = "EODF_SUBDATE10")
	public Date getEodfSubdate10() {
		return eodfSubdate10;
	}

	/**
	 * Set eodfSubdate10
	 */
	public void setEodfSubdate10(Date eodfSubdate10) {
		this.eodfSubdate10 = eodfSubdate10;
		addValidField("eodfSubdate10");
	}

	/**
	 * Get eodfSubnum1
	 */
	@Column(name = "EODF_SUBNUM1")
	public Long getEodfSubnum1() {
		return eodfSubnum1;
	}

	/**
	 * Set eodfSubnum1
	 */
	public void setEodfSubnum1(Long eodfSubnum1) {
		this.eodfSubnum1 = eodfSubnum1;
		addValidField("eodfSubnum1");
	}

	/**
	 * Get eodfSubnum2
	 */
	@Column(name = "EODF_SUBNUM2")
	public Long getEodfSubnum2() {
		return eodfSubnum2;
	}

	/**
	 * Set eodfSubnum2
	 */
	public void setEodfSubnum2(Long eodfSubnum2) {
		this.eodfSubnum2 = eodfSubnum2;
		addValidField("eodfSubnum2");
	}

	/**
	 * Get eodfSubnum3
	 */
	@Column(name = "EODF_SUBNUM3")
	public Long getEodfSubnum3() {
		return eodfSubnum3;
	}

	/**
	 * Set eodfSubnum3
	 */
	public void setEodfSubnum3(Long eodfSubnum3) {
		this.eodfSubnum3 = eodfSubnum3;
		addValidField("eodfSubnum3");
	}

	/**
	 * Get eodfSubnum4
	 */
	@Column(name = "EODF_SUBNUM4")
	public Long getEodfSubnum4() {
		return eodfSubnum4;
	}

	/**
	 * Set eodfSubnum4
	 */
	public void setEodfSubnum4(Long eodfSubnum4) {
		this.eodfSubnum4 = eodfSubnum4;
		addValidField("eodfSubnum4");
	}

	/**
	 * Get eodfSubnum5
	 */
	@Column(name = "EODF_SUBNUM5")
	public Long getEodfSubnum5() {
		return eodfSubnum5;
	}

	/**
	 * Set eodfSubnum5
	 */
	public void setEodfSubnum5(Long eodfSubnum5) {
		this.eodfSubnum5 = eodfSubnum5;
		addValidField("eodfSubnum5");
	}

	/**
	 * Get eodfSubnum6
	 */
	@Column(name = "EODF_SUBNUM6")
	public Long getEodfSubnum6() {
		return eodfSubnum6;
	}

	/**
	 * Set eodfSubnum6
	 */
	public void setEodfSubnum6(Long eodfSubnum6) {
		this.eodfSubnum6 = eodfSubnum6;
		addValidField("eodfSubnum6");
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
	 * Get eodfTradeMode
	 */
	@Column(name = "EODF_TRADE_MODE")
	public String getEodfTradeMode() {
		return eodfTradeMode;
	}

	/**
	 * Set eodfTradeMode
	 */
	public void setEodfTradeMode(String eodfTradeMode) {
		this.eodfTradeMode = eodfTradeMode;
		addValidField("eodfTradeMode");
	}

}
