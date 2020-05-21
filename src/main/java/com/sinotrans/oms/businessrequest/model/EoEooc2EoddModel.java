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
 * 
 * 
 * <p>Description: 报关集装箱model
 *    
 * </p>
 *
 * @author Richard
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 2018年8月11日下午12:16:07   Richard       	               创建
 * 
 * 
 * </pre>
 */
@Entity
@Table(name = "EO_EOOC_2_EODD")
public class EoEooc2EoddModel extends BaseModel implements OperationLog {

	//eocdId
	private Long eocdId;
	//eocdEoddId
	private Long eocdEoddId;
	//eocdEoocId
	private Long eocdEoocId;
	//eocdBatchNo
	private String eocdBatchNo;
	//eocdCntCustomized
	private String eocdCntCustomized;
	//eocdCntCustomizedSize
	private String eocdCntCustomizedSize;
	//eocdContainerNo
	private String eocdContainerNo;
	//eocdCtnPackageNumber
	private Integer eocdCtnPackageNumber;
	//eocdGrossWeight
	private Double eocdGrossWeight;
	//eocdCargoNetWeight
	private Double eocdCargoNetWeight;
	//eocdRemark
	private String eocdRemark;
	//eocdSubstr1
	private String eocdSubstr1;
	//eocdSubstr2
	private String eocdSubstr2;
	//eocdSubstr3
	private String eocdSubstr3;
	//eocdSubstr4
	private String eocdSubstr4;
	//eocdSubstr5
	private String eocdSubstr5;
	//eocdSubstr6
	private String eocdSubstr6;
	//eocdSubstr7
	private String eocdSubstr7;
	//eocdSubstr8
	private String eocdSubstr8;
	//eocdSubstr9
	private String eocdSubstr9;
	//eocdSubstr10
	private String eocdSubstr10;
	//eocdSubstr11
	private String eocdSubstr11;
	//eocdSubstr12
	private String eocdSubstr12;
	//eocdSubstr13
	private String eocdSubstr13;
	//eocdSubstr14
	private String eocdSubstr14;
	//eocdSubstr15
	private String eocdSubstr15;
	//eocdSubstr16
	private String eocdSubstr16;
	//eocdSubstr17
	private String eocdSubstr17;
	//eocdSubstr18
	private String eocdSubstr18;
	//eocdSubstr19
	private String eocdSubstr19;
	//eocdSubstr20
	private String eocdSubstr20;
	//eocdSubstr21
	private String eocdSubstr21;
	//eocdSubstr22
	private String eocdSubstr22;
	//eocdSubstr23
	private String eocdSubstr23;
	//eocdSubstr24
	private String eocdSubstr24;
	//eocdSubstr25
	private String eocdSubstr25;
	//eocdSubdate1
	private Date eocdSubdate1;
	//eocdSubdate2
	private Date eocdSubdate2;
	//eocdSubdate3
	private Date eocdSubdate3;
	//eocdSubdate4
	private Date eocdSubdate4;
	//eocdSubdate5
	private Date eocdSubdate5;
	//eocdSubdate6
	private Date eocdSubdate6;
	//eocdSubdate7
	private Date eocdSubdate7;
	//eocdSubdate8
	private Date eocdSubdate8;
	//eocdSubdate9
	private Date eocdSubdate9;
	//eocdSubdate10
	private Date eocdSubdate10;
	//eocdSubnum1
	private Long eocdSubnum1;
	//eocdSubnum2
	private Long eocdSubnum2;
	//eocdSubnum3
	private Long eocdSubnum3;
	//eocdSubnum4
	private Long eocdSubnum4;
	//eocdSubnum5
	private Long eocdSubnum5;
	//eocdSubnum6
	private Long eocdSubnum6;
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
	//eocdArrivalDate
	private Date eocdArrivalDate;
	//eocdCntModel
	private String eocdCntModel;

	/**
	 * Get eocdId
	 */
	@Column(name = "EOCD_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEocdId() {
		return eocdId;
	}

	/**
	 * Set eocdId
	 */
	public void setEocdId(Long eocdId) {
		this.eocdId = eocdId;
		addValidField("eocdId");
	}

	/**
	 * Get eocdEoddId
	 */
	@Column(name = "EOCD_EODD_ID")
	public Long getEocdEoddId() {
		return eocdEoddId;
	}

	/**
	 * Set eocdEoddId
	 */
	public void setEocdEoddId(Long eocdEoddId) {
		this.eocdEoddId = eocdEoddId;
		addValidField("eocdEoddId");
	}

	/**
	 * Get eocdEoocId
	 */
	@Column(name = "EOCD_EOOC_ID")
	public Long getEocdEoocId() {
		return eocdEoocId;
	}

	/**
	 * Set eocdEoocId
	 */
	public void setEocdEoocId(Long eocdEoocId) {
		this.eocdEoocId = eocdEoocId;
		addValidField("eocdEoocId");
	}

	/**
	 * Get eocdBatchNo
	 */
	@Column(name = "EOCD_BATCH_NO")
	public String getEocdBatchNo() {
		return eocdBatchNo;
	}

	/**
	 * Set eocdBatchNo
	 */
	public void setEocdBatchNo(String eocdBatchNo) {
		this.eocdBatchNo = eocdBatchNo;
		addValidField("eocdBatchNo");
	}

	/**
	 * Get eocdCntCustomized
	 */
	@Column(name = "EOCD_CNT_CUSTOMIZED")
	public String getEocdCntCustomized() {
		return eocdCntCustomized;
	}

	/**
	 * Set eocdCntCustomized
	 */
	public void setEocdCntCustomized(String eocdCntCustomized) {
		this.eocdCntCustomized = eocdCntCustomized;
		addValidField("eocdCntCustomized");
	}

	/**
	 * Get eocdCntCustomizedSize
	 */
	@Column(name = "EOCD_CNT_CUSTOMIZED_SIZE")
	public String getEocdCntCustomizedSize() {
		return eocdCntCustomizedSize;
	}

	/**
	 * Set eocdCntCustomizedSize
	 */
	public void setEocdCntCustomizedSize(String eocdCntCustomizedSize) {
		this.eocdCntCustomizedSize = eocdCntCustomizedSize;
		addValidField("eocdCntCustomizedSize");
	}

	/**
	 * Get eocdContainerNo
	 */
	@Column(name = "EOCD_CONTAINER_NO")
	public String getEocdContainerNo() {
		return eocdContainerNo;
	}

	/**
	 * Set eocdContainerNo
	 */
	public void setEocdContainerNo(String eocdContainerNo) {
		this.eocdContainerNo = eocdContainerNo;
		addValidField("eocdContainerNo");
	}

	/**
	 * Get eocdCtnPackageNumber
	 */
	@Column(name = "EOCD_CTN_PACKAGE_NUMBER")
	public Integer getEocdCtnPackageNumber() {
		return eocdCtnPackageNumber;
	}

	/**
	 * Set eocdCtnPackageNumber
	 */
	public void setEocdCtnPackageNumber(Integer eocdCtnPackageNumber) {
		this.eocdCtnPackageNumber = eocdCtnPackageNumber;
		addValidField("eocdCtnPackageNumber");
	}

	/**
	 * Get eocdGrossWeight
	 */
	@Column(name = "EOCD_GROSS_WEIGHT")
	public Double getEocdGrossWeight() {
		return eocdGrossWeight;
	}

	/**
	 * Set eocdGrossWeight
	 */
	public void setEocdGrossWeight(Double eocdGrossWeight) {
		this.eocdGrossWeight = eocdGrossWeight;
		addValidField("eocdGrossWeight");
	}

	/**
	 * Get eocdCargoNetWeight
	 */
	@Column(name = "EOCD_CARGO_NET_WEIGHT")
	public Double getEocdCargoNetWeight() {
		return eocdCargoNetWeight;
	}

	/**
	 * Set eocdCargoNetWeight
	 */
	public void setEocdCargoNetWeight(Double eocdCargoNetWeight) {
		this.eocdCargoNetWeight = eocdCargoNetWeight;
		addValidField("eocdCargoNetWeight");
	}

	/**
	 * Get eocdRemark
	 */
	@Column(name = "EOCD_REMARK")
	public String getEocdRemark() {
		return eocdRemark;
	}

	/**
	 * Set eocdRemark
	 */
	public void setEocdRemark(String eocdRemark) {
		this.eocdRemark = eocdRemark;
		addValidField("eocdRemark");
	}

	/**
	 * Get eocdSubstr1
	 */
	@Column(name = "EOCD_SUBSTR1")
	public String getEocdSubstr1() {
		return eocdSubstr1;
	}

	/**
	 * Set eocdSubstr1
	 */
	public void setEocdSubstr1(String eocdSubstr1) {
		this.eocdSubstr1 = eocdSubstr1;
		addValidField("eocdSubstr1");
	}

	/**
	 * Get eocdSubstr2
	 */
	@Column(name = "EOCD_SUBSTR2")
	public String getEocdSubstr2() {
		return eocdSubstr2;
	}

	/**
	 * Set eocdSubstr2
	 */
	public void setEocdSubstr2(String eocdSubstr2) {
		this.eocdSubstr2 = eocdSubstr2;
		addValidField("eocdSubstr2");
	}

	/**
	 * Get eocdSubstr3
	 */
	@Column(name = "EOCD_SUBSTR3")
	public String getEocdSubstr3() {
		return eocdSubstr3;
	}

	/**
	 * Set eocdSubstr3
	 */
	public void setEocdSubstr3(String eocdSubstr3) {
		this.eocdSubstr3 = eocdSubstr3;
		addValidField("eocdSubstr3");
	}

	/**
	 * Get eocdSubstr4
	 */
	@Column(name = "EOCD_SUBSTR4")
	public String getEocdSubstr4() {
		return eocdSubstr4;
	}

	/**
	 * Set eocdSubstr4
	 */
	public void setEocdSubstr4(String eocdSubstr4) {
		this.eocdSubstr4 = eocdSubstr4;
		addValidField("eocdSubstr4");
	}

	/**
	 * Get eocdSubstr5
	 */
	@Column(name = "EOCD_SUBSTR5")
	public String getEocdSubstr5() {
		return eocdSubstr5;
	}

	/**
	 * Set eocdSubstr5
	 */
	public void setEocdSubstr5(String eocdSubstr5) {
		this.eocdSubstr5 = eocdSubstr5;
		addValidField("eocdSubstr5");
	}

	/**
	 * Get eocdSubstr6
	 */
	@Column(name = "EOCD_SUBSTR6")
	public String getEocdSubstr6() {
		return eocdSubstr6;
	}

	/**
	 * Set eocdSubstr6
	 */
	public void setEocdSubstr6(String eocdSubstr6) {
		this.eocdSubstr6 = eocdSubstr6;
		addValidField("eocdSubstr6");
	}

	/**
	 * Get eocdSubstr7
	 */
	@Column(name = "EOCD_SUBSTR7")
	public String getEocdSubstr7() {
		return eocdSubstr7;
	}

	/**
	 * Set eocdSubstr7
	 */
	public void setEocdSubstr7(String eocdSubstr7) {
		this.eocdSubstr7 = eocdSubstr7;
		addValidField("eocdSubstr7");
	}

	/**
	 * Get eocdSubstr8
	 */
	@Column(name = "EOCD_SUBSTR8")
	public String getEocdSubstr8() {
		return eocdSubstr8;
	}

	/**
	 * Set eocdSubstr8
	 */
	public void setEocdSubstr8(String eocdSubstr8) {
		this.eocdSubstr8 = eocdSubstr8;
		addValidField("eocdSubstr8");
	}

	/**
	 * Get eocdSubstr9
	 */
	@Column(name = "EOCD_SUBSTR9")
	public String getEocdSubstr9() {
		return eocdSubstr9;
	}

	/**
	 * Set eocdSubstr9
	 */
	public void setEocdSubstr9(String eocdSubstr9) {
		this.eocdSubstr9 = eocdSubstr9;
		addValidField("eocdSubstr9");
	}

	/**
	 * Get eocdSubstr10
	 */
	@Column(name = "EOCD_SUBSTR10")
	public String getEocdSubstr10() {
		return eocdSubstr10;
	}

	/**
	 * Set eocdSubstr10
	 */
	public void setEocdSubstr10(String eocdSubstr10) {
		this.eocdSubstr10 = eocdSubstr10;
		addValidField("eocdSubstr10");
	}

	/**
	 * Get eocdSubstr11
	 */
	@Column(name = "EOCD_SUBSTR11")
	public String getEocdSubstr11() {
		return eocdSubstr11;
	}

	/**
	 * Set eocdSubstr11
	 */
	public void setEocdSubstr11(String eocdSubstr11) {
		this.eocdSubstr11 = eocdSubstr11;
		addValidField("eocdSubstr11");
	}

	/**
	 * Get eocdSubstr12
	 */
	@Column(name = "EOCD_SUBSTR12")
	public String getEocdSubstr12() {
		return eocdSubstr12;
	}

	/**
	 * Set eocdSubstr12
	 */
	public void setEocdSubstr12(String eocdSubstr12) {
		this.eocdSubstr12 = eocdSubstr12;
		addValidField("eocdSubstr12");
	}

	/**
	 * Get eocdSubstr13
	 */
	@Column(name = "EOCD_SUBSTR13")
	public String getEocdSubstr13() {
		return eocdSubstr13;
	}

	/**
	 * Set eocdSubstr13
	 */
	public void setEocdSubstr13(String eocdSubstr13) {
		this.eocdSubstr13 = eocdSubstr13;
		addValidField("eocdSubstr13");
	}

	/**
	 * Get eocdSubstr14
	 */
	@Column(name = "EOCD_SUBSTR14")
	public String getEocdSubstr14() {
		return eocdSubstr14;
	}

	/**
	 * Set eocdSubstr14
	 */
	public void setEocdSubstr14(String eocdSubstr14) {
		this.eocdSubstr14 = eocdSubstr14;
		addValidField("eocdSubstr14");
	}

	/**
	 * Get eocdSubstr15
	 */
	@Column(name = "EOCD_SUBSTR15")
	public String getEocdSubstr15() {
		return eocdSubstr15;
	}

	/**
	 * Set eocdSubstr15
	 */
	public void setEocdSubstr15(String eocdSubstr15) {
		this.eocdSubstr15 = eocdSubstr15;
		addValidField("eocdSubstr15");
	}

	/**
	 * Get eocdSubstr16
	 */
	@Column(name = "EOCD_SUBSTR16")
	public String getEocdSubstr16() {
		return eocdSubstr16;
	}

	/**
	 * Set eocdSubstr16
	 */
	public void setEocdSubstr16(String eocdSubstr16) {
		this.eocdSubstr16 = eocdSubstr16;
		addValidField("eocdSubstr16");
	}

	/**
	 * Get eocdSubstr17
	 */
	@Column(name = "EOCD_SUBSTR17")
	public String getEocdSubstr17() {
		return eocdSubstr17;
	}

	/**
	 * Set eocdSubstr17
	 */
	public void setEocdSubstr17(String eocdSubstr17) {
		this.eocdSubstr17 = eocdSubstr17;
		addValidField("eocdSubstr17");
	}

	/**
	 * Get eocdSubstr18
	 */
	@Column(name = "EOCD_SUBSTR18")
	public String getEocdSubstr18() {
		return eocdSubstr18;
	}

	/**
	 * Set eocdSubstr18
	 */
	public void setEocdSubstr18(String eocdSubstr18) {
		this.eocdSubstr18 = eocdSubstr18;
		addValidField("eocdSubstr18");
	}

	/**
	 * Get eocdSubstr19
	 */
	@Column(name = "EOCD_SUBSTR19")
	public String getEocdSubstr19() {
		return eocdSubstr19;
	}

	/**
	 * Set eocdSubstr19
	 */
	public void setEocdSubstr19(String eocdSubstr19) {
		this.eocdSubstr19 = eocdSubstr19;
		addValidField("eocdSubstr19");
	}

	/**
	 * Get eocdSubstr20
	 */
	@Column(name = "EOCD_SUBSTR20")
	public String getEocdSubstr20() {
		return eocdSubstr20;
	}

	/**
	 * Set eocdSubstr20
	 */
	public void setEocdSubstr20(String eocdSubstr20) {
		this.eocdSubstr20 = eocdSubstr20;
		addValidField("eocdSubstr20");
	}

	/**
	 * Get eocdSubstr21
	 */
	@Column(name = "EOCD_SUBSTR21")
	public String getEocdSubstr21() {
		return eocdSubstr21;
	}

	/**
	 * Set eocdSubstr21
	 */
	public void setEocdSubstr21(String eocdSubstr21) {
		this.eocdSubstr21 = eocdSubstr21;
		addValidField("eocdSubstr21");
	}

	/**
	 * Get eocdSubstr22
	 */
	@Column(name = "EOCD_SUBSTR22")
	public String getEocdSubstr22() {
		return eocdSubstr22;
	}

	/**
	 * Set eocdSubstr22
	 */
	public void setEocdSubstr22(String eocdSubstr22) {
		this.eocdSubstr22 = eocdSubstr22;
		addValidField("eocdSubstr22");
	}

	/**
	 * Get eocdSubstr23
	 */
	@Column(name = "EOCD_SUBSTR23")
	public String getEocdSubstr23() {
		return eocdSubstr23;
	}

	/**
	 * Set eocdSubstr23
	 */
	public void setEocdSubstr23(String eocdSubstr23) {
		this.eocdSubstr23 = eocdSubstr23;
		addValidField("eocdSubstr23");
	}

	/**
	 * Get eocdSubstr24
	 */
	@Column(name = "EOCD_SUBSTR24")
	public String getEocdSubstr24() {
		return eocdSubstr24;
	}

	/**
	 * Set eocdSubstr24
	 */
	public void setEocdSubstr24(String eocdSubstr24) {
		this.eocdSubstr24 = eocdSubstr24;
		addValidField("eocdSubstr24");
	}

	/**
	 * Get eocdSubstr25
	 */
	@Column(name = "EOCD_SUBSTR25")
	public String getEocdSubstr25() {
		return eocdSubstr25;
	}

	/**
	 * Set eocdSubstr25
	 */
	public void setEocdSubstr25(String eocdSubstr25) {
		this.eocdSubstr25 = eocdSubstr25;
		addValidField("eocdSubstr25");
	}

	/**
	 * Get eocdSubdate1
	 */
	@Column(name = "EOCD_SUBDATE1")
	public Date getEocdSubdate1() {
		return eocdSubdate1;
	}

	/**
	 * Set eocdSubdate1
	 */
	public void setEocdSubdate1(Date eocdSubdate1) {
		this.eocdSubdate1 = eocdSubdate1;
		addValidField("eocdSubdate1");
	}

	/**
	 * Get eocdSubdate2
	 */
	@Column(name = "EOCD_SUBDATE2")
	public Date getEocdSubdate2() {
		return eocdSubdate2;
	}

	/**
	 * Set eocdSubdate2
	 */
	public void setEocdSubdate2(Date eocdSubdate2) {
		this.eocdSubdate2 = eocdSubdate2;
		addValidField("eocdSubdate2");
	}

	/**
	 * Get eocdSubdate3
	 */
	@Column(name = "EOCD_SUBDATE3")
	public Date getEocdSubdate3() {
		return eocdSubdate3;
	}

	/**
	 * Set eocdSubdate3
	 */
	public void setEocdSubdate3(Date eocdSubdate3) {
		this.eocdSubdate3 = eocdSubdate3;
		addValidField("eocdSubdate3");
	}

	/**
	 * Get eocdSubdate4
	 */
	@Column(name = "EOCD_SUBDATE4")
	public Date getEocdSubdate4() {
		return eocdSubdate4;
	}

	/**
	 * Set eocdSubdate4
	 */
	public void setEocdSubdate4(Date eocdSubdate4) {
		this.eocdSubdate4 = eocdSubdate4;
		addValidField("eocdSubdate4");
	}

	/**
	 * Get eocdSubdate5
	 */
	@Column(name = "EOCD_SUBDATE5")
	public Date getEocdSubdate5() {
		return eocdSubdate5;
	}

	/**
	 * Set eocdSubdate5
	 */
	public void setEocdSubdate5(Date eocdSubdate5) {
		this.eocdSubdate5 = eocdSubdate5;
		addValidField("eocdSubdate5");
	}

	/**
	 * Get eocdSubdate6
	 */
	@Column(name = "EOCD_SUBDATE6")
	public Date getEocdSubdate6() {
		return eocdSubdate6;
	}

	/**
	 * Set eocdSubdate6
	 */
	public void setEocdSubdate6(Date eocdSubdate6) {
		this.eocdSubdate6 = eocdSubdate6;
		addValidField("eocdSubdate6");
	}

	/**
	 * Get eocdSubdate7
	 */
	@Column(name = "EOCD_SUBDATE7")
	public Date getEocdSubdate7() {
		return eocdSubdate7;
	}

	/**
	 * Set eocdSubdate7
	 */
	public void setEocdSubdate7(Date eocdSubdate7) {
		this.eocdSubdate7 = eocdSubdate7;
		addValidField("eocdSubdate7");
	}

	/**
	 * Get eocdSubdate8
	 */
	@Column(name = "EOCD_SUBDATE8")
	public Date getEocdSubdate8() {
		return eocdSubdate8;
	}

	/**
	 * Set eocdSubdate8
	 */
	public void setEocdSubdate8(Date eocdSubdate8) {
		this.eocdSubdate8 = eocdSubdate8;
		addValidField("eocdSubdate8");
	}

	/**
	 * Get eocdSubdate9
	 */
	@Column(name = "EOCD_SUBDATE9")
	public Date getEocdSubdate9() {
		return eocdSubdate9;
	}

	/**
	 * Set eocdSubdate9
	 */
	public void setEocdSubdate9(Date eocdSubdate9) {
		this.eocdSubdate9 = eocdSubdate9;
		addValidField("eocdSubdate9");
	}

	/**
	 * Get eocdSubdate10
	 */
	@Column(name = "EOCD_SUBDATE10")
	public Date getEocdSubdate10() {
		return eocdSubdate10;
	}

	/**
	 * Set eocdSubdate10
	 */
	public void setEocdSubdate10(Date eocdSubdate10) {
		this.eocdSubdate10 = eocdSubdate10;
		addValidField("eocdSubdate10");
	}

	/**
	 * Get eocdSubnum1
	 */
	@Column(name = "EOCD_SUBNUM1")
	public Long getEocdSubnum1() {
		return eocdSubnum1;
	}

	/**
	 * Set eocdSubnum1
	 */
	public void setEocdSubnum1(Long eocdSubnum1) {
		this.eocdSubnum1 = eocdSubnum1;
		addValidField("eocdSubnum1");
	}

	/**
	 * Get eocdSubnum2
	 */
	@Column(name = "EOCD_SUBNUM2")
	public Long getEocdSubnum2() {
		return eocdSubnum2;
	}

	/**
	 * Set eocdSubnum2
	 */
	public void setEocdSubnum2(Long eocdSubnum2) {
		this.eocdSubnum2 = eocdSubnum2;
		addValidField("eocdSubnum2");
	}

	/**
	 * Get eocdSubnum3
	 */
	@Column(name = "EOCD_SUBNUM3")
	public Long getEocdSubnum3() {
		return eocdSubnum3;
	}

	/**
	 * Set eocdSubnum3
	 */
	public void setEocdSubnum3(Long eocdSubnum3) {
		this.eocdSubnum3 = eocdSubnum3;
		addValidField("eocdSubnum3");
	}

	/**
	 * Get eocdSubnum4
	 */
	@Column(name = "EOCD_SUBNUM4")
	public Long getEocdSubnum4() {
		return eocdSubnum4;
	}

	/**
	 * Set eocdSubnum4
	 */
	public void setEocdSubnum4(Long eocdSubnum4) {
		this.eocdSubnum4 = eocdSubnum4;
		addValidField("eocdSubnum4");
	}

	/**
	 * Get eocdSubnum5
	 */
	@Column(name = "EOCD_SUBNUM5")
	public Long getEocdSubnum5() {
		return eocdSubnum5;
	}

	/**
	 * Set eocdSubnum5
	 */
	public void setEocdSubnum5(Long eocdSubnum5) {
		this.eocdSubnum5 = eocdSubnum5;
		addValidField("eocdSubnum5");
	}

	/**
	 * Get eocdSubnum6
	 */
	@Column(name = "EOCD_SUBNUM6")
	public Long getEocdSubnum6() {
		return eocdSubnum6;
	}

	/**
	 * Set eocdSubnum6
	 */
	public void setEocdSubnum6(Long eocdSubnum6) {
		this.eocdSubnum6 = eocdSubnum6;
		addValidField("eocdSubnum6");
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
	 * Get eocdArrivalDate
	 */
	@Column(name = "EOCD_ARRIVAL_DATE")
	public Date getEocdArrivalDate() {
		return eocdArrivalDate;
	}

	/**
	 * Set eocdArrivalDate
	 */
	public void setEocdArrivalDate(Date eocdArrivalDate) {
		this.eocdArrivalDate = eocdArrivalDate;
		addValidField("eocdArrivalDate");
	}

	/**
	 * Get eocdCntModel
	 */
	@Column(name = "EOCD_CNT_MODEL")
	public String getEocdCntModel() {
		return eocdCntModel;
	}

	/**
	 * Set eocdCntModel
	 */
	public void setEocdCntModel(String eocdCntModel) {
		this.eocdCntModel = eocdCntModel;
		addValidField("eocdCntModel");
	}

}
