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
 * 报关随附单据业务表
 */
@Entity
@Table(name = "EO_EODD_BILL")
public class EoEoddBillModel extends BaseModel implements OperationLog {

	//eoebId
	private Long eoebId;
	//eoebEoddId
	private Long eoebEoddId;
	//eoebBillName
	private String eoebBillName;
	//eoebBillNo
	private String eoebBillNo;
	//eoebBillNum
	private Long eoebBillNum;
	//eoebBillReceipt
	private String eoebBillReceipt;
	//eoebBillReceiptDate
	private Date eoebBillReceiptDate;
	//eoebDeclarationNo
	private String eoebDeclarationNo;
	//eoebBillBack
	private String eoebBillBack;
	//eoebBillBackDate
	private Date eoebBillBackDate;
	//eoebRemark
	private String eoebRemark;
	//eoebSubstr1
	private String eoebSubstr1;
	//eoebSubstr2
	private String eoebSubstr2;
	//eoebSubstr3
	private String eoebSubstr3;
	//eoebSubstr4
	private String eoebSubstr4;
	//eoebSubstr5
	private String eoebSubstr5;
	//eoebSubstr6
	private String eoebSubstr6;
	//eoebSubstr7
	private String eoebSubstr7;
	//eoebSubstr8
	private String eoebSubstr8;
	//eoebSubstr9
	private String eoebSubstr9;
	//eoebSubstr10
	private String eoebSubstr10;
	//eoebSubstr11
	private String eoebSubstr11;
	//eoebSubstr12
	private String eoebSubstr12;
	//eoebSubstr13
	private String eoebSubstr13;
	//eoebSubstr14
	private String eoebSubstr14;
	//eoebSubstr15
	private String eoebSubstr15;
	//eoebSubstr16
	private String eoebSubstr16;
	//eoebSubstr17
	private String eoebSubstr17;
	//eoebSubstr18
	private String eoebSubstr18;
	//eoebSubstr19
	private String eoebSubstr19;
	//eoebSubstr20
	private String eoebSubstr20;
	//eoebSubstr21
	private String eoebSubstr21;
	//eoebSubstr22
	private String eoebSubstr22;
	//eoebSubstr23
	private String eoebSubstr23;
	//eoebSubstr24
	private String eoebSubstr24;
	//eoebSubstr25
	private String eoebSubstr25;
	//eoebSubdate1
	private Date eoebSubdate1;
	//eoebSubdate2
	private Date eoebSubdate2;
	//eoebSubdate3
	private Date eoebSubdate3;
	//eoebSubdate4
	private Date eoebSubdate4;
	//eoebSubdate5
	private Date eoebSubdate5;
	//eoebSubdate6
	private Date eoebSubdate6;
	//eoebSubdate7
	private Date eoebSubdate7;
	//eoebSubdate8
	private Date eoebSubdate8;
	//eoebSubdate9
	private Date eoebSubdate9;
	//eoebSubdate10
	private Date eoebSubdate10;
	//eoebSubnum1
	private Long eoebSubnum1;
	//eoebSubnum2
	private Long eoebSubnum2;
	//eoebSubnum3
	private Long eoebSubnum3;
	//eoebSubnum4
	private Long eoebSubnum4;
	//eoebSubnum5
	private Long eoebSubnum5;
	//eoebSubnum6
	private Long eoebSubnum6;
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
	 * Get eoebId
	 */
	@Column(name = "EOEB_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoebId() {
		return eoebId;
	}

	/**
	 * Set eoebId
	 */
	public void setEoebId(Long eoebId) {
		this.eoebId = eoebId;
		addValidField("eoebId");
	}

	/**
	 * Get eoebEoddId
	 */
	@Column(name = "EOEB_EODD_ID")
	public Long getEoebEoddId() {
		return eoebEoddId;
	}

	/**
	 * Set eoebEoddId
	 */
	public void setEoebEoddId(Long eoebEoddId) {
		this.eoebEoddId = eoebEoddId;
		addValidField("eoebEoddId");
	}

	/**
	 * Get eoebBillName
	 */
	@Column(name = "EOEB_BILL_NAME")
	public String getEoebBillName() {
		return eoebBillName;
	}

	/**
	 * Set eoebBillName
	 */
	public void setEoebBillName(String eoebBillName) {
		this.eoebBillName = eoebBillName;
		addValidField("eoebBillName");
	}

	/**
	 * Get eoebBillNo
	 */
	@Column(name = "EOEB_BILL_NO")
	public String getEoebBillNo() {
		return eoebBillNo;
	}

	/**
	 * Set eoebBillNo
	 */
	public void setEoebBillNo(String eoebBillNo) {
		this.eoebBillNo = eoebBillNo;
		addValidField("eoebBillNo");
	}

	/**
	 * Get eoebBillNum
	 */
	@Column(name = "EOEB_BILL_NUM")
	public Long getEoebBillNum() {
		return eoebBillNum;
	}

	/**
	 * Set eoebBillNum
	 */
	public void setEoebBillNum(Long eoebBillNum) {
		this.eoebBillNum = eoebBillNum;
		addValidField("eoebBillNum");
	}

	/**
	 * Get eoebBillReceipt
	 */
	@Column(name = "EOEB_BILL_RECEIPT")
	public String getEoebBillReceipt() {
		return eoebBillReceipt;
	}

	/**
	 * Set eoebBillReceipt
	 */
	public void setEoebBillReceipt(String eoebBillReceipt) {
		this.eoebBillReceipt = eoebBillReceipt;
		addValidField("eoebBillReceipt");
	}

	/**
	 * Get eoebBillReceiptDate
	 */
	@Column(name = "EOEB_BILL_RECEIPT_DATE")
	public Date getEoebBillReceiptDate() {
		return eoebBillReceiptDate;
	}

	/**
	 * Set eoebBillReceiptDate
	 */
	public void setEoebBillReceiptDate(Date eoebBillReceiptDate) {
		this.eoebBillReceiptDate = eoebBillReceiptDate;
		addValidField("eoebBillReceiptDate");
	}

	/**
	 * Get eoebDeclarationNo
	 */
	@Column(name = "EOEB_DECLARATION_NO")
	public String getEoebDeclarationNo() {
		return eoebDeclarationNo;
	}

	/**
	 * Set eoebDeclarationNo
	 */
	public void setEoebDeclarationNo(String eoebDeclarationNo) {
		this.eoebDeclarationNo = eoebDeclarationNo;
		addValidField("eoebDeclarationNo");
	}

	/**
	 * Get eoebBillBack
	 */
	@Column(name = "EOEB_BILL_BACK")
	public String getEoebBillBack() {
		return eoebBillBack;
	}

	/**
	 * Set eoebBillBack
	 */
	public void setEoebBillBack(String eoebBillBack) {
		this.eoebBillBack = eoebBillBack;
		addValidField("eoebBillBack");
	}

	/**
	 * Get eoebBillBackDate
	 */
	@Column(name = "EOEB_BILL_BACK_DATE")
	public Date getEoebBillBackDate() {
		return eoebBillBackDate;
	}

	/**
	 * Set eoebBillBackDate
	 */
	public void setEoebBillBackDate(Date eoebBillBackDate) {
		this.eoebBillBackDate = eoebBillBackDate;
		addValidField("eoebBillBackDate");
	}

	/**
	 * Get eoebRemark
	 */
	@Column(name = "EOEB_REMARK")
	public String getEoebRemark() {
		return eoebRemark;
	}

	/**
	 * Set eoebRemark
	 */
	public void setEoebRemark(String eoebRemark) {
		this.eoebRemark = eoebRemark;
		addValidField("eoebRemark");
	}

	/**
	 * Get eoebSubstr1
	 */
	@Column(name = "EOEB_SUBSTR1")
	public String getEoebSubstr1() {
		return eoebSubstr1;
	}

	/**
	 * Set eoebSubstr1
	 */
	public void setEoebSubstr1(String eoebSubstr1) {
		this.eoebSubstr1 = eoebSubstr1;
		addValidField("eoebSubstr1");
	}

	/**
	 * Get eoebSubstr2
	 */
	@Column(name = "EOEB_SUBSTR2")
	public String getEoebSubstr2() {
		return eoebSubstr2;
	}

	/**
	 * Set eoebSubstr2
	 */
	public void setEoebSubstr2(String eoebSubstr2) {
		this.eoebSubstr2 = eoebSubstr2;
		addValidField("eoebSubstr2");
	}

	/**
	 * Get eoebSubstr3
	 */
	@Column(name = "EOEB_SUBSTR3")
	public String getEoebSubstr3() {
		return eoebSubstr3;
	}

	/**
	 * Set eoebSubstr3
	 */
	public void setEoebSubstr3(String eoebSubstr3) {
		this.eoebSubstr3 = eoebSubstr3;
		addValidField("eoebSubstr3");
	}

	/**
	 * Get eoebSubstr4
	 */
	@Column(name = "EOEB_SUBSTR4")
	public String getEoebSubstr4() {
		return eoebSubstr4;
	}

	/**
	 * Set eoebSubstr4
	 */
	public void setEoebSubstr4(String eoebSubstr4) {
		this.eoebSubstr4 = eoebSubstr4;
		addValidField("eoebSubstr4");
	}

	/**
	 * Get eoebSubstr5
	 */
	@Column(name = "EOEB_SUBSTR5")
	public String getEoebSubstr5() {
		return eoebSubstr5;
	}

	/**
	 * Set eoebSubstr5
	 */
	public void setEoebSubstr5(String eoebSubstr5) {
		this.eoebSubstr5 = eoebSubstr5;
		addValidField("eoebSubstr5");
	}

	/**
	 * Get eoebSubstr6
	 */
	@Column(name = "EOEB_SUBSTR6")
	public String getEoebSubstr6() {
		return eoebSubstr6;
	}

	/**
	 * Set eoebSubstr6
	 */
	public void setEoebSubstr6(String eoebSubstr6) {
		this.eoebSubstr6 = eoebSubstr6;
		addValidField("eoebSubstr6");
	}

	/**
	 * Get eoebSubstr7
	 */
	@Column(name = "EOEB_SUBSTR7")
	public String getEoebSubstr7() {
		return eoebSubstr7;
	}

	/**
	 * Set eoebSubstr7
	 */
	public void setEoebSubstr7(String eoebSubstr7) {
		this.eoebSubstr7 = eoebSubstr7;
		addValidField("eoebSubstr7");
	}

	/**
	 * Get eoebSubstr8
	 */
	@Column(name = "EOEB_SUBSTR8")
	public String getEoebSubstr8() {
		return eoebSubstr8;
	}

	/**
	 * Set eoebSubstr8
	 */
	public void setEoebSubstr8(String eoebSubstr8) {
		this.eoebSubstr8 = eoebSubstr8;
		addValidField("eoebSubstr8");
	}

	/**
	 * Get eoebSubstr9
	 */
	@Column(name = "EOEB_SUBSTR9")
	public String getEoebSubstr9() {
		return eoebSubstr9;
	}

	/**
	 * Set eoebSubstr9
	 */
	public void setEoebSubstr9(String eoebSubstr9) {
		this.eoebSubstr9 = eoebSubstr9;
		addValidField("eoebSubstr9");
	}

	/**
	 * Get eoebSubstr10
	 */
	@Column(name = "EOEB_SUBSTR10")
	public String getEoebSubstr10() {
		return eoebSubstr10;
	}

	/**
	 * Set eoebSubstr10
	 */
	public void setEoebSubstr10(String eoebSubstr10) {
		this.eoebSubstr10 = eoebSubstr10;
		addValidField("eoebSubstr10");
	}

	/**
	 * Get eoebSubstr11
	 */
	@Column(name = "EOEB_SUBSTR11")
	public String getEoebSubstr11() {
		return eoebSubstr11;
	}

	/**
	 * Set eoebSubstr11
	 */
	public void setEoebSubstr11(String eoebSubstr11) {
		this.eoebSubstr11 = eoebSubstr11;
		addValidField("eoebSubstr11");
	}

	/**
	 * Get eoebSubstr12
	 */
	@Column(name = "EOEB_SUBSTR12")
	public String getEoebSubstr12() {
		return eoebSubstr12;
	}

	/**
	 * Set eoebSubstr12
	 */
	public void setEoebSubstr12(String eoebSubstr12) {
		this.eoebSubstr12 = eoebSubstr12;
		addValidField("eoebSubstr12");
	}

	/**
	 * Get eoebSubstr13
	 */
	@Column(name = "EOEB_SUBSTR13")
	public String getEoebSubstr13() {
		return eoebSubstr13;
	}

	/**
	 * Set eoebSubstr13
	 */
	public void setEoebSubstr13(String eoebSubstr13) {
		this.eoebSubstr13 = eoebSubstr13;
		addValidField("eoebSubstr13");
	}

	/**
	 * Get eoebSubstr14
	 */
	@Column(name = "EOEB_SUBSTR14")
	public String getEoebSubstr14() {
		return eoebSubstr14;
	}

	/**
	 * Set eoebSubstr14
	 */
	public void setEoebSubstr14(String eoebSubstr14) {
		this.eoebSubstr14 = eoebSubstr14;
		addValidField("eoebSubstr14");
	}

	/**
	 * Get eoebSubstr15
	 */
	@Column(name = "EOEB_SUBSTR15")
	public String getEoebSubstr15() {
		return eoebSubstr15;
	}

	/**
	 * Set eoebSubstr15
	 */
	public void setEoebSubstr15(String eoebSubstr15) {
		this.eoebSubstr15 = eoebSubstr15;
		addValidField("eoebSubstr15");
	}

	/**
	 * Get eoebSubstr16
	 */
	@Column(name = "EOEB_SUBSTR16")
	public String getEoebSubstr16() {
		return eoebSubstr16;
	}

	/**
	 * Set eoebSubstr16
	 */
	public void setEoebSubstr16(String eoebSubstr16) {
		this.eoebSubstr16 = eoebSubstr16;
		addValidField("eoebSubstr16");
	}

	/**
	 * Get eoebSubstr17
	 */
	@Column(name = "EOEB_SUBSTR17")
	public String getEoebSubstr17() {
		return eoebSubstr17;
	}

	/**
	 * Set eoebSubstr17
	 */
	public void setEoebSubstr17(String eoebSubstr17) {
		this.eoebSubstr17 = eoebSubstr17;
		addValidField("eoebSubstr17");
	}

	/**
	 * Get eoebSubstr18
	 */
	@Column(name = "EOEB_SUBSTR18")
	public String getEoebSubstr18() {
		return eoebSubstr18;
	}

	/**
	 * Set eoebSubstr18
	 */
	public void setEoebSubstr18(String eoebSubstr18) {
		this.eoebSubstr18 = eoebSubstr18;
		addValidField("eoebSubstr18");
	}

	/**
	 * Get eoebSubstr19
	 */
	@Column(name = "EOEB_SUBSTR19")
	public String getEoebSubstr19() {
		return eoebSubstr19;
	}

	/**
	 * Set eoebSubstr19
	 */
	public void setEoebSubstr19(String eoebSubstr19) {
		this.eoebSubstr19 = eoebSubstr19;
		addValidField("eoebSubstr19");
	}

	/**
	 * Get eoebSubstr20
	 */
	@Column(name = "EOEB_SUBSTR20")
	public String getEoebSubstr20() {
		return eoebSubstr20;
	}

	/**
	 * Set eoebSubstr20
	 */
	public void setEoebSubstr20(String eoebSubstr20) {
		this.eoebSubstr20 = eoebSubstr20;
		addValidField("eoebSubstr20");
	}

	/**
	 * Get eoebSubstr21
	 */
	@Column(name = "EOEB_SUBSTR21")
	public String getEoebSubstr21() {
		return eoebSubstr21;
	}

	/**
	 * Set eoebSubstr21
	 */
	public void setEoebSubstr21(String eoebSubstr21) {
		this.eoebSubstr21 = eoebSubstr21;
		addValidField("eoebSubstr21");
	}

	/**
	 * Get eoebSubstr22
	 */
	@Column(name = "EOEB_SUBSTR22")
	public String getEoebSubstr22() {
		return eoebSubstr22;
	}

	/**
	 * Set eoebSubstr22
	 */
	public void setEoebSubstr22(String eoebSubstr22) {
		this.eoebSubstr22 = eoebSubstr22;
		addValidField("eoebSubstr22");
	}

	/**
	 * Get eoebSubstr23
	 */
	@Column(name = "EOEB_SUBSTR23")
	public String getEoebSubstr23() {
		return eoebSubstr23;
	}

	/**
	 * Set eoebSubstr23
	 */
	public void setEoebSubstr23(String eoebSubstr23) {
		this.eoebSubstr23 = eoebSubstr23;
		addValidField("eoebSubstr23");
	}

	/**
	 * Get eoebSubstr24
	 */
	@Column(name = "EOEB_SUBSTR24")
	public String getEoebSubstr24() {
		return eoebSubstr24;
	}

	/**
	 * Set eoebSubstr24
	 */
	public void setEoebSubstr24(String eoebSubstr24) {
		this.eoebSubstr24 = eoebSubstr24;
		addValidField("eoebSubstr24");
	}

	/**
	 * Get eoebSubstr25
	 */
	@Column(name = "EOEB_SUBSTR25")
	public String getEoebSubstr25() {
		return eoebSubstr25;
	}

	/**
	 * Set eoebSubstr25
	 */
	public void setEoebSubstr25(String eoebSubstr25) {
		this.eoebSubstr25 = eoebSubstr25;
		addValidField("eoebSubstr25");
	}

	/**
	 * Get eoebSubdate1
	 */
	@Column(name = "EOEB_SUBDATE1")
	public Date getEoebSubdate1() {
		return eoebSubdate1;
	}

	/**
	 * Set eoebSubdate1
	 */
	public void setEoebSubdate1(Date eoebSubdate1) {
		this.eoebSubdate1 = eoebSubdate1;
		addValidField("eoebSubdate1");
	}

	/**
	 * Get eoebSubdate2
	 */
	@Column(name = "EOEB_SUBDATE2")
	public Date getEoebSubdate2() {
		return eoebSubdate2;
	}

	/**
	 * Set eoebSubdate2
	 */
	public void setEoebSubdate2(Date eoebSubdate2) {
		this.eoebSubdate2 = eoebSubdate2;
		addValidField("eoebSubdate2");
	}

	/**
	 * Get eoebSubdate3
	 */
	@Column(name = "EOEB_SUBDATE3")
	public Date getEoebSubdate3() {
		return eoebSubdate3;
	}

	/**
	 * Set eoebSubdate3
	 */
	public void setEoebSubdate3(Date eoebSubdate3) {
		this.eoebSubdate3 = eoebSubdate3;
		addValidField("eoebSubdate3");
	}

	/**
	 * Get eoebSubdate4
	 */
	@Column(name = "EOEB_SUBDATE4")
	public Date getEoebSubdate4() {
		return eoebSubdate4;
	}

	/**
	 * Set eoebSubdate4
	 */
	public void setEoebSubdate4(Date eoebSubdate4) {
		this.eoebSubdate4 = eoebSubdate4;
		addValidField("eoebSubdate4");
	}

	/**
	 * Get eoebSubdate5
	 */
	@Column(name = "EOEB_SUBDATE5")
	public Date getEoebSubdate5() {
		return eoebSubdate5;
	}

	/**
	 * Set eoebSubdate5
	 */
	public void setEoebSubdate5(Date eoebSubdate5) {
		this.eoebSubdate5 = eoebSubdate5;
		addValidField("eoebSubdate5");
	}

	/**
	 * Get eoebSubdate6
	 */
	@Column(name = "EOEB_SUBDATE6")
	public Date getEoebSubdate6() {
		return eoebSubdate6;
	}

	/**
	 * Set eoebSubdate6
	 */
	public void setEoebSubdate6(Date eoebSubdate6) {
		this.eoebSubdate6 = eoebSubdate6;
		addValidField("eoebSubdate6");
	}

	/**
	 * Get eoebSubdate7
	 */
	@Column(name = "EOEB_SUBDATE7")
	public Date getEoebSubdate7() {
		return eoebSubdate7;
	}

	/**
	 * Set eoebSubdate7
	 */
	public void setEoebSubdate7(Date eoebSubdate7) {
		this.eoebSubdate7 = eoebSubdate7;
		addValidField("eoebSubdate7");
	}

	/**
	 * Get eoebSubdate8
	 */
	@Column(name = "EOEB_SUBDATE8")
	public Date getEoebSubdate8() {
		return eoebSubdate8;
	}

	/**
	 * Set eoebSubdate8
	 */
	public void setEoebSubdate8(Date eoebSubdate8) {
		this.eoebSubdate8 = eoebSubdate8;
		addValidField("eoebSubdate8");
	}

	/**
	 * Get eoebSubdate9
	 */
	@Column(name = "EOEB_SUBDATE9")
	public Date getEoebSubdate9() {
		return eoebSubdate9;
	}

	/**
	 * Set eoebSubdate9
	 */
	public void setEoebSubdate9(Date eoebSubdate9) {
		this.eoebSubdate9 = eoebSubdate9;
		addValidField("eoebSubdate9");
	}

	/**
	 * Get eoebSubdate10
	 */
	@Column(name = "EOEB_SUBDATE10")
	public Date getEoebSubdate10() {
		return eoebSubdate10;
	}

	/**
	 * Set eoebSubdate10
	 */
	public void setEoebSubdate10(Date eoebSubdate10) {
		this.eoebSubdate10 = eoebSubdate10;
		addValidField("eoebSubdate10");
	}

	/**
	 * Get eoebSubnum1
	 */
	@Column(name = "EOEB_SUBNUM1")
	public Long getEoebSubnum1() {
		return eoebSubnum1;
	}

	/**
	 * Set eoebSubnum1
	 */
	public void setEoebSubnum1(Long eoebSubnum1) {
		this.eoebSubnum1 = eoebSubnum1;
		addValidField("eoebSubnum1");
	}

	/**
	 * Get eoebSubnum2
	 */
	@Column(name = "EOEB_SUBNUM2")
	public Long getEoebSubnum2() {
		return eoebSubnum2;
	}

	/**
	 * Set eoebSubnum2
	 */
	public void setEoebSubnum2(Long eoebSubnum2) {
		this.eoebSubnum2 = eoebSubnum2;
		addValidField("eoebSubnum2");
	}

	/**
	 * Get eoebSubnum3
	 */
	@Column(name = "EOEB_SUBNUM3")
	public Long getEoebSubnum3() {
		return eoebSubnum3;
	}

	/**
	 * Set eoebSubnum3
	 */
	public void setEoebSubnum3(Long eoebSubnum3) {
		this.eoebSubnum3 = eoebSubnum3;
		addValidField("eoebSubnum3");
	}

	/**
	 * Get eoebSubnum4
	 */
	@Column(name = "EOEB_SUBNUM4")
	public Long getEoebSubnum4() {
		return eoebSubnum4;
	}

	/**
	 * Set eoebSubnum4
	 */
	public void setEoebSubnum4(Long eoebSubnum4) {
		this.eoebSubnum4 = eoebSubnum4;
		addValidField("eoebSubnum4");
	}

	/**
	 * Get eoebSubnum5
	 */
	@Column(name = "EOEB_SUBNUM5")
	public Long getEoebSubnum5() {
		return eoebSubnum5;
	}

	/**
	 * Set eoebSubnum5
	 */
	public void setEoebSubnum5(Long eoebSubnum5) {
		this.eoebSubnum5 = eoebSubnum5;
		addValidField("eoebSubnum5");
	}

	/**
	 * Get eoebSubnum6
	 */
	@Column(name = "EOEB_SUBNUM6")
	public Long getEoebSubnum6() {
		return eoebSubnum6;
	}

	/**
	 * Set eoebSubnum6
	 */
	public void setEoebSubnum6(Long eoebSubnum6) {
		this.eoebSubnum6 = eoebSubnum6;
		addValidField("eoebSubnum6");
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
