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
 * Model class for EoEorb2Eosr
 */
@Entity
@Table(name = "EO_EORB_2_EOSR")
public class EoEorb2EosrModel extends BaseModel implements OperationLog {

	//eobtId
	private Long eobtId;
	//eobtEorbId
	private Long eobtEorbId;
	//eobtEosrId
	private Long eobtEosrId;
	//eobtBatchNo
	private String eobtBatchNo;
	//eobtCtnNumber
	private Integer eobtCtnNumber;
	//eobtCntCustomized
	private String eobtCntCustomized;
	//eobtCntCustomizedSize
	private String eobtCntCustomizedSize;
	//eobtFclLcl
	private String eobtFclLcl;
	//eobtIsSoc
	private String eobtIsSoc;
	//eobtMasterLclNo
	private String eobtMasterLclNo;
	//eobtStuffingMode
	private String eobtStuffingMode;
	//eobtVanningDepotCode
	private String eobtVanningDepotCode;
	//eobtVanningDepotDescription
	private String eobtVanningDepotDescription;
	//eobtCtnDepotCode
	private String eobtCtnDepotCode;
	//eobtCtnDepotName
	private String eobtCtnDepotName;
	//eobtIsNormalFreeze
	private String eobtIsNormalFreeze;
	//eobtRemark
	private String eobtRemark;
	//eobtCntSupplierType
	private Integer eobtCntSupplierType;
	//eobtSubstr1
	private String eobtSubstr1;
	//eobtSubstr2
	private String eobtSubstr2;
	//eobtSubstr3
	private String eobtSubstr3;
	//eobtSubstr4
	private String eobtSubstr4;
	//eobtSubstr5
	private String eobtSubstr5;
	//eobtSubstr6
	private String eobtSubstr6;
	//eobtSubstr7
	private String eobtSubstr7;
	//eobtSubstr8
	private String eobtSubstr8;
	//eobtSubstr9
	private String eobtSubstr9;
	//eobtSubstr10
	private String eobtSubstr10;
	//eobtSubstr11
	private String eobtSubstr11;
	//eobtSubstr12
	private String eobtSubstr12;
	//eobtSubstr13
	private String eobtSubstr13;
	//eobtSubstr14
	private String eobtSubstr14;
	//eobtSubstr15
	private String eobtSubstr15;
	//eobtSubstr16
	private String eobtSubstr16;
	//eobtSubstr17
	private String eobtSubstr17;
	//eobtSubstr18
	private String eobtSubstr18;
	//eobtSubstr19
	private String eobtSubstr19;
	//eobtSubstr20
	private String eobtSubstr20;
	//eobtSubstr21
	private String eobtSubstr21;
	//eobtSubstr22
	private String eobtSubstr22;
	//eobtSubstr23
	private String eobtSubstr23;
	//eobtSubstr24
	private String eobtSubstr24;
	//eobtSubstr25
	private String eobtSubstr25;
	//eobtSubdate1
	private Date eobtSubdate1;
	//eobtSubdate2
	private Date eobtSubdate2;
	//eobtSubdate3
	private Date eobtSubdate3;
	//eobtSubdate4
	private Date eobtSubdate4;
	//eobtSubdate5
	private Date eobtSubdate5;
	//eobtSubdate6
	private Date eobtSubdate6;
	//eobtSubdate7
	private Date eobtSubdate7;
	//eobtSubdate8
	private Date eobtSubdate8;
	//eobtSubdate9
	private Date eobtSubdate9;
	//eobtSubdate10
	private Date eobtSubdate10;
	//eobtSubnum1
	private Long eobtSubnum1;
	//eobtSubnum2
	private Long eobtSubnum2;
	//eobtSubnum3
	private Long eobtSubnum3;
	//eobtSubnum4
	private Long eobtSubnum4;
	//eobtSubnum5
	private Long eobtSubnum5;
	//eobtSubnum6
	private Long eobtSubnum6;
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
	 * Get eobtId
	 */
	@Column(name = "EOBT_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEobtId() {
		return eobtId;
	}

	/**
	 * Set eobtId
	 */
	public void setEobtId(Long eobtId) {
		this.eobtId = eobtId;
		addValidField("eobtId");
	}

	/**
	 * Get eobtEorbId
	 */
	@Column(name = "EOBT_EORB_ID")
	public Long getEobtEorbId() {
		return eobtEorbId;
	}

	/**
	 * Set eobtEorbId
	 */
	public void setEobtEorbId(Long eobtEorbId) {
		this.eobtEorbId = eobtEorbId;
		addValidField("eobtEorbId");
	}

	/**
	 * Get eobtEosrId
	 */
	@Column(name = "EOBT_EOSR_ID")
	public Long getEobtEosrId() {
		return eobtEosrId;
	}

	/**
	 * Set eobtEosrId
	 */
	public void setEobtEosrId(Long eobtEosrId) {
		this.eobtEosrId = eobtEosrId;
		addValidField("eobtEosrId");
	}

	/**
	 * Get eobtBatchNo
	 */
	@Column(name = "EOBT_BATCH_NO")
	public String getEobtBatchNo() {
		return eobtBatchNo;
	}

	/**
	 * Set eobtBatchNo
	 */
	public void setEobtBatchNo(String eobtBatchNo) {
		this.eobtBatchNo = eobtBatchNo;
		addValidField("eobtBatchNo");
	}

	/**
	 * Get eobtCtnNumber
	 */
	@Column(name = "EOBT_CTN_NUMBER")
	public Integer getEobtCtnNumber() {
		return eobtCtnNumber;
	}

	/**
	 * Set eobtCtnNumber
	 */
	public void setEobtCtnNumber(Integer eobtCtnNumber) {
		this.eobtCtnNumber = eobtCtnNumber;
		addValidField("eobtCtnNumber");
	}

	/**
	 * Get eobtCntCustomized
	 */
	@Column(name = "EOBT_CNT_CUSTOMIZED")
	public String getEobtCntCustomized() {
		return eobtCntCustomized;
	}

	/**
	 * Set eobtCntCustomized
	 */
	public void setEobtCntCustomized(String eobtCntCustomized) {
		this.eobtCntCustomized = eobtCntCustomized;
		addValidField("eobtCntCustomized");
	}

	/**
	 * Get eobtCntCustomizedSize
	 */
	@Column(name = "EOBT_CNT_CUSTOMIZED_SIZE")
	public String getEobtCntCustomizedSize() {
		return eobtCntCustomizedSize;
	}

	/**
	 * Set eobtCntCustomizedSize
	 */
	public void setEobtCntCustomizedSize(String eobtCntCustomizedSize) {
		this.eobtCntCustomizedSize = eobtCntCustomizedSize;
		addValidField("eobtCntCustomizedSize");
	}

	/**
	 * Get eobtFclLcl
	 */
	@Column(name = "EOBT_FCL_LCL")
	public String getEobtFclLcl() {
		return eobtFclLcl;
	}

	/**
	 * Set eobtFclLcl
	 */
	public void setEobtFclLcl(String eobtFclLcl) {
		this.eobtFclLcl = eobtFclLcl;
		addValidField("eobtFclLcl");
	}

	/**
	 * Get eobtIsSoc
	 */
	@Column(name = "EOBT_IS_SOC")
	public String getEobtIsSoc() {
		return eobtIsSoc;
	}

	/**
	 * Set eobtIsSoc
	 */
	public void setEobtIsSoc(String eobtIsSoc) {
		this.eobtIsSoc = eobtIsSoc;
		addValidField("eobtIsSoc");
	}

	/**
	 * Get eobtMasterLclNo
	 */
	@Column(name = "EOBT_MASTER_LCL_NO")
	public String getEobtMasterLclNo() {
		return eobtMasterLclNo;
	}

	/**
	 * Set eobtMasterLclNo
	 */
	public void setEobtMasterLclNo(String eobtMasterLclNo) {
		this.eobtMasterLclNo = eobtMasterLclNo;
		addValidField("eobtMasterLclNo");
	}

	/**
	 * Get eobtStuffingMode
	 */
	@Column(name = "EOBT_STUFFING_MODE")
	public String getEobtStuffingMode() {
		return eobtStuffingMode;
	}

	/**
	 * Set eobtStuffingMode
	 */
	public void setEobtStuffingMode(String eobtStuffingMode) {
		this.eobtStuffingMode = eobtStuffingMode;
		addValidField("eobtStuffingMode");
	}

	/**
	 * Get eobtVanningDepotCode
	 */
	@Column(name = "EOBT_VANNING_DEPOT_CODE")
	public String getEobtVanningDepotCode() {
		return eobtVanningDepotCode;
	}

	/**
	 * Set eobtVanningDepotCode
	 */
	public void setEobtVanningDepotCode(String eobtVanningDepotCode) {
		this.eobtVanningDepotCode = eobtVanningDepotCode;
		addValidField("eobtVanningDepotCode");
	}

	/**
	 * Get eobtVanningDepotDescription
	 */
	@Column(name = "EOBT_VANNING_DEPOT_DESCRIPTION")
	public String getEobtVanningDepotDescription() {
		return eobtVanningDepotDescription;
	}

	/**
	 * Set eobtVanningDepotDescription
	 */
	public void setEobtVanningDepotDescription(String eobtVanningDepotDescription) {
		this.eobtVanningDepotDescription = eobtVanningDepotDescription;
		addValidField("eobtVanningDepotDescription");
	}

	/**
	 * Get eobtCtnDepotCode
	 */
	@Column(name = "EOBT_CTN_DEPOT_CODE")
	public String getEobtCtnDepotCode() {
		return eobtCtnDepotCode;
	}

	/**
	 * Set eobtCtnDepotCode
	 */
	public void setEobtCtnDepotCode(String eobtCtnDepotCode) {
		this.eobtCtnDepotCode = eobtCtnDepotCode;
		addValidField("eobtCtnDepotCode");
	}

	/**
	 * Get eobtCtnDepotName
	 */
	@Column(name = "EOBT_CTN_DEPOT_NAME")
	public String getEobtCtnDepotName() {
		return eobtCtnDepotName;
	}

	/**
	 * Set eobtCtnDepotName
	 */
	public void setEobtCtnDepotName(String eobtCtnDepotName) {
		this.eobtCtnDepotName = eobtCtnDepotName;
		addValidField("eobtCtnDepotName");
	}

	/**
	 * Get eobtIsNormalFreeze
	 */
	@Column(name = "EOBT_IS_NORMAL_FREEZE")
	public String getEobtIsNormalFreeze() {
		return eobtIsNormalFreeze;
	}

	/**
	 * Set eobtIsNormalFreeze
	 */
	public void setEobtIsNormalFreeze(String eobtIsNormalFreeze) {
		this.eobtIsNormalFreeze = eobtIsNormalFreeze;
		addValidField("eobtIsNormalFreeze");
	}

	/**
	 * Get eobtRemark
	 */
	@Column(name = "EOBT_REMARK")
	public String getEobtRemark() {
		return eobtRemark;
	}

	/**
	 * Set eobtRemark
	 */
	public void setEobtRemark(String eobtRemark) {
		this.eobtRemark = eobtRemark;
		addValidField("eobtRemark");
	}

	/**
	 * Get eobtCntSupplierType
	 */
	@Column(name = "EOBT_CNT_SUPPLIER_TYPE")
	public Integer getEobtCntSupplierType() {
		return eobtCntSupplierType;
	}

	/**
	 * Set eobtCntSupplierType
	 */
	public void setEobtCntSupplierType(Integer eobtCntSupplierType) {
		this.eobtCntSupplierType = eobtCntSupplierType;
		addValidField("eobtCntSupplierType");
	}

	/**
	 * Get eobtSubstr1
	 */
	@Column(name = "EOBT_SUBSTR1")
	public String getEobtSubstr1() {
		return eobtSubstr1;
	}

	/**
	 * Set eobtSubstr1
	 */
	public void setEobtSubstr1(String eobtSubstr1) {
		this.eobtSubstr1 = eobtSubstr1;
		addValidField("eobtSubstr1");
	}

	/**
	 * Get eobtSubstr2
	 */
	@Column(name = "EOBT_SUBSTR2")
	public String getEobtSubstr2() {
		return eobtSubstr2;
	}

	/**
	 * Set eobtSubstr2
	 */
	public void setEobtSubstr2(String eobtSubstr2) {
		this.eobtSubstr2 = eobtSubstr2;
		addValidField("eobtSubstr2");
	}

	/**
	 * Get eobtSubstr3
	 */
	@Column(name = "EOBT_SUBSTR3")
	public String getEobtSubstr3() {
		return eobtSubstr3;
	}

	/**
	 * Set eobtSubstr3
	 */
	public void setEobtSubstr3(String eobtSubstr3) {
		this.eobtSubstr3 = eobtSubstr3;
		addValidField("eobtSubstr3");
	}

	/**
	 * Get eobtSubstr4
	 */
	@Column(name = "EOBT_SUBSTR4")
	public String getEobtSubstr4() {
		return eobtSubstr4;
	}

	/**
	 * Set eobtSubstr4
	 */
	public void setEobtSubstr4(String eobtSubstr4) {
		this.eobtSubstr4 = eobtSubstr4;
		addValidField("eobtSubstr4");
	}

	/**
	 * Get eobtSubstr5
	 */
	@Column(name = "EOBT_SUBSTR5")
	public String getEobtSubstr5() {
		return eobtSubstr5;
	}

	/**
	 * Set eobtSubstr5
	 */
	public void setEobtSubstr5(String eobtSubstr5) {
		this.eobtSubstr5 = eobtSubstr5;
		addValidField("eobtSubstr5");
	}

	/**
	 * Get eobtSubstr6
	 */
	@Column(name = "EOBT_SUBSTR6")
	public String getEobtSubstr6() {
		return eobtSubstr6;
	}

	/**
	 * Set eobtSubstr6
	 */
	public void setEobtSubstr6(String eobtSubstr6) {
		this.eobtSubstr6 = eobtSubstr6;
		addValidField("eobtSubstr6");
	}

	/**
	 * Get eobtSubstr7
	 */
	@Column(name = "EOBT_SUBSTR7")
	public String getEobtSubstr7() {
		return eobtSubstr7;
	}

	/**
	 * Set eobtSubstr7
	 */
	public void setEobtSubstr7(String eobtSubstr7) {
		this.eobtSubstr7 = eobtSubstr7;
		addValidField("eobtSubstr7");
	}

	/**
	 * Get eobtSubstr8
	 */
	@Column(name = "EOBT_SUBSTR8")
	public String getEobtSubstr8() {
		return eobtSubstr8;
	}

	/**
	 * Set eobtSubstr8
	 */
	public void setEobtSubstr8(String eobtSubstr8) {
		this.eobtSubstr8 = eobtSubstr8;
		addValidField("eobtSubstr8");
	}

	/**
	 * Get eobtSubstr9
	 */
	@Column(name = "EOBT_SUBSTR9")
	public String getEobtSubstr9() {
		return eobtSubstr9;
	}

	/**
	 * Set eobtSubstr9
	 */
	public void setEobtSubstr9(String eobtSubstr9) {
		this.eobtSubstr9 = eobtSubstr9;
		addValidField("eobtSubstr9");
	}

	/**
	 * Get eobtSubstr10
	 */
	@Column(name = "EOBT_SUBSTR10")
	public String getEobtSubstr10() {
		return eobtSubstr10;
	}

	/**
	 * Set eobtSubstr10
	 */
	public void setEobtSubstr10(String eobtSubstr10) {
		this.eobtSubstr10 = eobtSubstr10;
		addValidField("eobtSubstr10");
	}

	/**
	 * Get eobtSubstr11
	 */
	@Column(name = "EOBT_SUBSTR11")
	public String getEobtSubstr11() {
		return eobtSubstr11;
	}

	/**
	 * Set eobtSubstr11
	 */
	public void setEobtSubstr11(String eobtSubstr11) {
		this.eobtSubstr11 = eobtSubstr11;
		addValidField("eobtSubstr11");
	}

	/**
	 * Get eobtSubstr12
	 */
	@Column(name = "EOBT_SUBSTR12")
	public String getEobtSubstr12() {
		return eobtSubstr12;
	}

	/**
	 * Set eobtSubstr12
	 */
	public void setEobtSubstr12(String eobtSubstr12) {
		this.eobtSubstr12 = eobtSubstr12;
		addValidField("eobtSubstr12");
	}

	/**
	 * Get eobtSubstr13
	 */
	@Column(name = "EOBT_SUBSTR13")
	public String getEobtSubstr13() {
		return eobtSubstr13;
	}

	/**
	 * Set eobtSubstr13
	 */
	public void setEobtSubstr13(String eobtSubstr13) {
		this.eobtSubstr13 = eobtSubstr13;
		addValidField("eobtSubstr13");
	}

	/**
	 * Get eobtSubstr14
	 */
	@Column(name = "EOBT_SUBSTR14")
	public String getEobtSubstr14() {
		return eobtSubstr14;
	}

	/**
	 * Set eobtSubstr14
	 */
	public void setEobtSubstr14(String eobtSubstr14) {
		this.eobtSubstr14 = eobtSubstr14;
		addValidField("eobtSubstr14");
	}

	/**
	 * Get eobtSubstr15
	 */
	@Column(name = "EOBT_SUBSTR15")
	public String getEobtSubstr15() {
		return eobtSubstr15;
	}

	/**
	 * Set eobtSubstr15
	 */
	public void setEobtSubstr15(String eobtSubstr15) {
		this.eobtSubstr15 = eobtSubstr15;
		addValidField("eobtSubstr15");
	}

	/**
	 * Get eobtSubstr16
	 */
	@Column(name = "EOBT_SUBSTR16")
	public String getEobtSubstr16() {
		return eobtSubstr16;
	}

	/**
	 * Set eobtSubstr16
	 */
	public void setEobtSubstr16(String eobtSubstr16) {
		this.eobtSubstr16 = eobtSubstr16;
		addValidField("eobtSubstr16");
	}

	/**
	 * Get eobtSubstr17
	 */
	@Column(name = "EOBT_SUBSTR17")
	public String getEobtSubstr17() {
		return eobtSubstr17;
	}

	/**
	 * Set eobtSubstr17
	 */
	public void setEobtSubstr17(String eobtSubstr17) {
		this.eobtSubstr17 = eobtSubstr17;
		addValidField("eobtSubstr17");
	}

	/**
	 * Get eobtSubstr18
	 */
	@Column(name = "EOBT_SUBSTR18")
	public String getEobtSubstr18() {
		return eobtSubstr18;
	}

	/**
	 * Set eobtSubstr18
	 */
	public void setEobtSubstr18(String eobtSubstr18) {
		this.eobtSubstr18 = eobtSubstr18;
		addValidField("eobtSubstr18");
	}

	/**
	 * Get eobtSubstr19
	 */
	@Column(name = "EOBT_SUBSTR19")
	public String getEobtSubstr19() {
		return eobtSubstr19;
	}

	/**
	 * Set eobtSubstr19
	 */
	public void setEobtSubstr19(String eobtSubstr19) {
		this.eobtSubstr19 = eobtSubstr19;
		addValidField("eobtSubstr19");
	}

	/**
	 * Get eobtSubstr20
	 */
	@Column(name = "EOBT_SUBSTR20")
	public String getEobtSubstr20() {
		return eobtSubstr20;
	}

	/**
	 * Set eobtSubstr20
	 */
	public void setEobtSubstr20(String eobtSubstr20) {
		this.eobtSubstr20 = eobtSubstr20;
		addValidField("eobtSubstr20");
	}

	/**
	 * Get eobtSubstr21
	 */
	@Column(name = "EOBT_SUBSTR21")
	public String getEobtSubstr21() {
		return eobtSubstr21;
	}

	/**
	 * Set eobtSubstr21
	 */
	public void setEobtSubstr21(String eobtSubstr21) {
		this.eobtSubstr21 = eobtSubstr21;
		addValidField("eobtSubstr21");
	}

	/**
	 * Get eobtSubstr22
	 */
	@Column(name = "EOBT_SUBSTR22")
	public String getEobtSubstr22() {
		return eobtSubstr22;
	}

	/**
	 * Set eobtSubstr22
	 */
	public void setEobtSubstr22(String eobtSubstr22) {
		this.eobtSubstr22 = eobtSubstr22;
		addValidField("eobtSubstr22");
	}

	/**
	 * Get eobtSubstr23
	 */
	@Column(name = "EOBT_SUBSTR23")
	public String getEobtSubstr23() {
		return eobtSubstr23;
	}

	/**
	 * Set eobtSubstr23
	 */
	public void setEobtSubstr23(String eobtSubstr23) {
		this.eobtSubstr23 = eobtSubstr23;
		addValidField("eobtSubstr23");
	}

	/**
	 * Get eobtSubstr24
	 */
	@Column(name = "EOBT_SUBSTR24")
	public String getEobtSubstr24() {
		return eobtSubstr24;
	}

	/**
	 * Set eobtSubstr24
	 */
	public void setEobtSubstr24(String eobtSubstr24) {
		this.eobtSubstr24 = eobtSubstr24;
		addValidField("eobtSubstr24");
	}

	/**
	 * Get eobtSubstr25
	 */
	@Column(name = "EOBT_SUBSTR25")
	public String getEobtSubstr25() {
		return eobtSubstr25;
	}

	/**
	 * Set eobtSubstr25
	 */
	public void setEobtSubstr25(String eobtSubstr25) {
		this.eobtSubstr25 = eobtSubstr25;
		addValidField("eobtSubstr25");
	}

	/**
	 * Get eobtSubdate1
	 */
	@Column(name = "EOBT_SUBDATE1")
	public Date getEobtSubdate1() {
		return eobtSubdate1;
	}

	/**
	 * Set eobtSubdate1
	 */
	public void setEobtSubdate1(Date eobtSubdate1) {
		this.eobtSubdate1 = eobtSubdate1;
		addValidField("eobtSubdate1");
	}

	/**
	 * Get eobtSubdate2
	 */
	@Column(name = "EOBT_SUBDATE2")
	public Date getEobtSubdate2() {
		return eobtSubdate2;
	}

	/**
	 * Set eobtSubdate2
	 */
	public void setEobtSubdate2(Date eobtSubdate2) {
		this.eobtSubdate2 = eobtSubdate2;
		addValidField("eobtSubdate2");
	}

	/**
	 * Get eobtSubdate3
	 */
	@Column(name = "EOBT_SUBDATE3")
	public Date getEobtSubdate3() {
		return eobtSubdate3;
	}

	/**
	 * Set eobtSubdate3
	 */
	public void setEobtSubdate3(Date eobtSubdate3) {
		this.eobtSubdate3 = eobtSubdate3;
		addValidField("eobtSubdate3");
	}

	/**
	 * Get eobtSubdate4
	 */
	@Column(name = "EOBT_SUBDATE4")
	public Date getEobtSubdate4() {
		return eobtSubdate4;
	}

	/**
	 * Set eobtSubdate4
	 */
	public void setEobtSubdate4(Date eobtSubdate4) {
		this.eobtSubdate4 = eobtSubdate4;
		addValidField("eobtSubdate4");
	}

	/**
	 * Get eobtSubdate5
	 */
	@Column(name = "EOBT_SUBDATE5")
	public Date getEobtSubdate5() {
		return eobtSubdate5;
	}

	/**
	 * Set eobtSubdate5
	 */
	public void setEobtSubdate5(Date eobtSubdate5) {
		this.eobtSubdate5 = eobtSubdate5;
		addValidField("eobtSubdate5");
	}

	/**
	 * Get eobtSubdate6
	 */
	@Column(name = "EOBT_SUBDATE6")
	public Date getEobtSubdate6() {
		return eobtSubdate6;
	}

	/**
	 * Set eobtSubdate6
	 */
	public void setEobtSubdate6(Date eobtSubdate6) {
		this.eobtSubdate6 = eobtSubdate6;
		addValidField("eobtSubdate6");
	}

	/**
	 * Get eobtSubdate7
	 */
	@Column(name = "EOBT_SUBDATE7")
	public Date getEobtSubdate7() {
		return eobtSubdate7;
	}

	/**
	 * Set eobtSubdate7
	 */
	public void setEobtSubdate7(Date eobtSubdate7) {
		this.eobtSubdate7 = eobtSubdate7;
		addValidField("eobtSubdate7");
	}

	/**
	 * Get eobtSubdate8
	 */
	@Column(name = "EOBT_SUBDATE8")
	public Date getEobtSubdate8() {
		return eobtSubdate8;
	}

	/**
	 * Set eobtSubdate8
	 */
	public void setEobtSubdate8(Date eobtSubdate8) {
		this.eobtSubdate8 = eobtSubdate8;
		addValidField("eobtSubdate8");
	}

	/**
	 * Get eobtSubdate9
	 */
	@Column(name = "EOBT_SUBDATE9")
	public Date getEobtSubdate9() {
		return eobtSubdate9;
	}

	/**
	 * Set eobtSubdate9
	 */
	public void setEobtSubdate9(Date eobtSubdate9) {
		this.eobtSubdate9 = eobtSubdate9;
		addValidField("eobtSubdate9");
	}

	/**
	 * Get eobtSubdate10
	 */
	@Column(name = "EOBT_SUBDATE10")
	public Date getEobtSubdate10() {
		return eobtSubdate10;
	}

	/**
	 * Set eobtSubdate10
	 */
	public void setEobtSubdate10(Date eobtSubdate10) {
		this.eobtSubdate10 = eobtSubdate10;
		addValidField("eobtSubdate10");
	}

	/**
	 * Get eobtSubnum1
	 */
	@Column(name = "EOBT_SUBNUM1")
	public Long getEobtSubnum1() {
		return eobtSubnum1;
	}

	/**
	 * Set eobtSubnum1
	 */
	public void setEobtSubnum1(Long eobtSubnum1) {
		this.eobtSubnum1 = eobtSubnum1;
		addValidField("eobtSubnum1");
	}

	/**
	 * Get eobtSubnum2
	 */
	@Column(name = "EOBT_SUBNUM2")
	public Long getEobtSubnum2() {
		return eobtSubnum2;
	}

	/**
	 * Set eobtSubnum2
	 */
	public void setEobtSubnum2(Long eobtSubnum2) {
		this.eobtSubnum2 = eobtSubnum2;
		addValidField("eobtSubnum2");
	}

	/**
	 * Get eobtSubnum3
	 */
	@Column(name = "EOBT_SUBNUM3")
	public Long getEobtSubnum3() {
		return eobtSubnum3;
	}

	/**
	 * Set eobtSubnum3
	 */
	public void setEobtSubnum3(Long eobtSubnum3) {
		this.eobtSubnum3 = eobtSubnum3;
		addValidField("eobtSubnum3");
	}

	/**
	 * Get eobtSubnum4
	 */
	@Column(name = "EOBT_SUBNUM4")
	public Long getEobtSubnum4() {
		return eobtSubnum4;
	}

	/**
	 * Set eobtSubnum4
	 */
	public void setEobtSubnum4(Long eobtSubnum4) {
		this.eobtSubnum4 = eobtSubnum4;
		addValidField("eobtSubnum4");
	}

	/**
	 * Get eobtSubnum5
	 */
	@Column(name = "EOBT_SUBNUM5")
	public Long getEobtSubnum5() {
		return eobtSubnum5;
	}

	/**
	 * Set eobtSubnum5
	 */
	public void setEobtSubnum5(Long eobtSubnum5) {
		this.eobtSubnum5 = eobtSubnum5;
		addValidField("eobtSubnum5");
	}

	/**
	 * Get eobtSubnum6
	 */
	@Column(name = "EOBT_SUBNUM6")
	public Long getEobtSubnum6() {
		return eobtSubnum6;
	}

	/**
	 * Set eobtSubnum6
	 */
	public void setEobtSubnum6(Long eobtSubnum6) {
		this.eobtSubnum6 = eobtSubnum6;
		addValidField("eobtSubnum6");
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
