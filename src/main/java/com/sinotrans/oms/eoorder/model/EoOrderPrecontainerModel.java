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
 * Model class for EoOrderPrecontainer
 */
@Entity
@Table(name = "EO_ORDER_PRECONTAINER")
public class EoOrderPrecontainerModel extends BaseModel implements OperationLog {

	//eosrId
	private Long eosrId;
	//eosrEoorId
	private Long eosrEoorId;
	//eosrBatchNo
	private String eosrBatchNo;
	//eosrCtnNumber
	private Integer eosrCtnNumber;
	//eosrCntCustomized
	private String eosrCntCustomized;
	//eosrCntCustomizedSize
	private String eosrCntCustomizedSize;
	//eosrFclLcl
	private String eosrFclLcl;
	//eosrIsSoc
	private String eosrIsSoc;
	//eosrMasterLclNo
	private String eosrMasterLclNo;
	//eosrStuffingMode
	private String eosrStuffingMode;
	//eosrVanningDepotCode
	private String eosrVanningDepotCode;
	//eosrVanningDepotDescription
	private String eosrVanningDepotDescription;
	//eosrCtnDepotCode
	private String eosrCtnDepotCode;
	//eosrCtnDepotName
	private String eosrCtnDepotName;
	//eosrIsNormalFreeze
	private String eosrIsNormalFreeze;
	//eosrRemark
	private String eosrRemark;
	//eosrCntSupplierType
	private Integer eosrCntSupplierType;
	//eosrSubstr1
	private String eosrSubstr1;
	//eosrSubstr2
	private String eosrSubstr2;
	//eosrSubstr3
	private String eosrSubstr3;
	//eosrSubstr4
	private String eosrSubstr4;
	//eosrSubstr5
	private String eosrSubstr5;
	//eosrSubstr6
	private String eosrSubstr6;
	//eosrSubstr7
	private String eosrSubstr7;
	//eosrSubstr8
	private String eosrSubstr8;
	//eosrSubstr9
	private String eosrSubstr9;
	//eosrSubstr10
	private String eosrSubstr10;
	//eosrSubstr11
	private String eosrSubstr11;
	//eosrSubstr12
	private String eosrSubstr12;
	//eosrSubstr13
	private String eosrSubstr13;
	//eosrSubstr14
	private String eosrSubstr14;
	//eosrSubstr15
	private String eosrSubstr15;
	//eosrSubstr16
	private String eosrSubstr16;
	//eosrSubstr17
	private String eosrSubstr17;
	//eosrSubstr18
	private String eosrSubstr18;
	//eosrSubstr19
	private String eosrSubstr19;
	//eosrSubstr20
	private String eosrSubstr20;
	//eosrSubstr21
	private String eosrSubstr21;
	//eosrSubstr22
	private String eosrSubstr22;
	//eosrSubstr23
	private String eosrSubstr23;
	//eosrSubstr24
	private String eosrSubstr24;
	//eosrSubstr25
	private String eosrSubstr25;
	//eosrSubdate1
	private Date eosrSubdate1;
	//eosrSubdate2
	private Date eosrSubdate2;
	//eosrSubdate3
	private Date eosrSubdate3;
	//eosrSubdate4
	private Date eosrSubdate4;
	//eosrSubdate5
	private Date eosrSubdate5;
	//eosrSubdate6
	private Date eosrSubdate6;
	//eosrSubdate7
	private Date eosrSubdate7;
	//eosrSubdate8
	private Date eosrSubdate8;
	//eosrSubdate9
	private Date eosrSubdate9;
	//eosrSubdate10
	private Date eosrSubdate10;
	//eosrSubnum1
	private Long eosrSubnum1;
	//eosrSubnum2
	private Long eosrSubnum2;
	//eosrSubnum3
	private Long eosrSubnum3;
	//eosrSubnum4
	private Long eosrSubnum4;
	//eosrSubnum5
	private Long eosrSubnum5;
	//eosrSubnum6
	private Long eosrSubnum6;
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
	 * Get eosrId
	 */
	@Column(name = "EOSR_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEosrId() {
		return eosrId;
	}

	/**
	 * Set eosrId
	 */
	public void setEosrId(Long eosrId) {
		this.eosrId = eosrId;
		addValidField("eosrId");
	}

	/**
	 * Get eosrEoorId
	 */
	@Column(name = "EOSR_EOOR_ID")
	public Long getEosrEoorId() {
		return eosrEoorId;
	}

	/**
	 * Set eosrEoorId
	 */
	public void setEosrEoorId(Long eosrEoorId) {
		this.eosrEoorId = eosrEoorId;
		addValidField("eosrEoorId");
	}

	/**
	 * Get eosrBatchNo
	 */
	@Column(name = "EOSR_BATCH_NO")
	public String getEosrBatchNo() {
		return eosrBatchNo;
	}

	/**
	 * Set eosrBatchNo
	 */
	public void setEosrBatchNo(String eosrBatchNo) {
		this.eosrBatchNo = eosrBatchNo;
		addValidField("eosrBatchNo");
	}

	/**
	 * Get eosrCtnNumber
	 */
	@Column(name = "EOSR_CTN_NUMBER")
	public Integer getEosrCtnNumber() {
		return eosrCtnNumber;
	}

	/**
	 * Set eosrCtnNumber
	 */
	public void setEosrCtnNumber(Integer eosrCtnNumber) {
		this.eosrCtnNumber = eosrCtnNumber;
		addValidField("eosrCtnNumber");
	}

	/**
	 * Get eosrCntCustomized
	 */
	@Column(name = "EOSR_CNT_CUSTOMIZED")
	public String getEosrCntCustomized() {
		return eosrCntCustomized;
	}

	/**
	 * Set eosrCntCustomized
	 */
	public void setEosrCntCustomized(String eosrCntCustomized) {
		this.eosrCntCustomized = eosrCntCustomized;
		addValidField("eosrCntCustomized");
	}

	/**
	 * Get eosrCntCustomizedSize
	 */
	@Column(name = "EOSR_CNT_CUSTOMIZED_SIZE")
	public String getEosrCntCustomizedSize() {
		return eosrCntCustomizedSize;
	}

	/**
	 * Set eosrCntCustomizedSize
	 */
	public void setEosrCntCustomizedSize(String eosrCntCustomizedSize) {
		this.eosrCntCustomizedSize = eosrCntCustomizedSize;
		addValidField("eosrCntCustomizedSize");
	}

	/**
	 * Get eosrFclLcl
	 */
	@Column(name = "EOSR_FCL_LCL")
	public String getEosrFclLcl() {
		return eosrFclLcl;
	}

	/**
	 * Set eosrFclLcl
	 */
	public void setEosrFclLcl(String eosrFclLcl) {
		this.eosrFclLcl = eosrFclLcl;
		addValidField("eosrFclLcl");
	}

	/**
	 * Get eosrIsSoc
	 */
	@Column(name = "EOSR_IS_SOC")
	public String getEosrIsSoc() {
		return eosrIsSoc;
	}

	/**
	 * Set eosrIsSoc
	 */
	public void setEosrIsSoc(String eosrIsSoc) {
		this.eosrIsSoc = eosrIsSoc;
		addValidField("eosrIsSoc");
	}

	/**
	 * Get eosrMasterLclNo
	 */
	@Column(name = "EOSR_MASTER_LCL_NO")
	public String getEosrMasterLclNo() {
		return eosrMasterLclNo;
	}

	/**
	 * Set eosrMasterLclNo
	 */
	public void setEosrMasterLclNo(String eosrMasterLclNo) {
		this.eosrMasterLclNo = eosrMasterLclNo;
		addValidField("eosrMasterLclNo");
	}

	/**
	 * Get eosrStuffingMode
	 */
	@Column(name = "EOSR_STUFFING_MODE")
	public String getEosrStuffingMode() {
		return eosrStuffingMode;
	}

	/**
	 * Set eosrStuffingMode
	 */
	public void setEosrStuffingMode(String eosrStuffingMode) {
		this.eosrStuffingMode = eosrStuffingMode;
		addValidField("eosrStuffingMode");
	}

	/**
	 * Get eosrVanningDepotCode
	 */
	@Column(name = "EOSR_VANNING_DEPOT_CODE")
	public String getEosrVanningDepotCode() {
		return eosrVanningDepotCode;
	}

	/**
	 * Set eosrVanningDepotCode
	 */
	public void setEosrVanningDepotCode(String eosrVanningDepotCode) {
		this.eosrVanningDepotCode = eosrVanningDepotCode;
		addValidField("eosrVanningDepotCode");
	}

	/**
	 * Get eosrVanningDepotDescription
	 */
	@Column(name = "EOSR_VANNING_DEPOT_DESCRIPTION")
	public String getEosrVanningDepotDescription() {
		return eosrVanningDepotDescription;
	}

	/**
	 * Set eosrVanningDepotDescription
	 */
	public void setEosrVanningDepotDescription(String eosrVanningDepotDescription) {
		this.eosrVanningDepotDescription = eosrVanningDepotDescription;
		addValidField("eosrVanningDepotDescription");
	}

	/**
	 * Get eosrCtnDepotCode
	 */
	@Column(name = "EOSR_CTN_DEPOT_CODE")
	public String getEosrCtnDepotCode() {
		return eosrCtnDepotCode;
	}

	/**
	 * Set eosrCtnDepotCode
	 */
	public void setEosrCtnDepotCode(String eosrCtnDepotCode) {
		this.eosrCtnDepotCode = eosrCtnDepotCode;
		addValidField("eosrCtnDepotCode");
	}

	/**
	 * Get eosrCtnDepotName
	 */
	@Column(name = "EOSR_CTN_DEPOT_NAME")
	public String getEosrCtnDepotName() {
		return eosrCtnDepotName;
	}

	/**
	 * Set eosrCtnDepotName
	 */
	public void setEosrCtnDepotName(String eosrCtnDepotName) {
		this.eosrCtnDepotName = eosrCtnDepotName;
		addValidField("eosrCtnDepotName");
	}

	/**
	 * Get eosrIsNormalFreeze
	 */
	@Column(name = "EOSR_IS_NORMAL_FREEZE")
	public String getEosrIsNormalFreeze() {
		return eosrIsNormalFreeze;
	}

	/**
	 * Set eosrIsNormalFreeze
	 */
	public void setEosrIsNormalFreeze(String eosrIsNormalFreeze) {
		this.eosrIsNormalFreeze = eosrIsNormalFreeze;
		addValidField("eosrIsNormalFreeze");
	}

	/**
	 * Get eosrRemark
	 */
	@Column(name = "EOSR_REMARK")
	public String getEosrRemark() {
		return eosrRemark;
	}

	/**
	 * Set eosrRemark
	 */
	public void setEosrRemark(String eosrRemark) {
		this.eosrRemark = eosrRemark;
		addValidField("eosrRemark");
	}

	/**
	 * Get eosrCntSupplierType
	 */
	@Column(name = "EOSR_CNT_SUPPLIER_TYPE")
	public Integer getEosrCntSupplierType() {
		return eosrCntSupplierType;
	}

	/**
	 * Set eosrCntSupplierType
	 */
	public void setEosrCntSupplierType(Integer eosrCntSupplierType) {
		this.eosrCntSupplierType = eosrCntSupplierType;
		addValidField("eosrCntSupplierType");
	}

	/**
	 * Get eosrSubstr1
	 */
	@Column(name = "EOSR_SUBSTR1")
	public String getEosrSubstr1() {
		return eosrSubstr1;
	}

	/**
	 * Set eosrSubstr1
	 */
	public void setEosrSubstr1(String eosrSubstr1) {
		this.eosrSubstr1 = eosrSubstr1;
		addValidField("eosrSubstr1");
	}

	/**
	 * Get eosrSubstr2
	 */
	@Column(name = "EOSR_SUBSTR2")
	public String getEosrSubstr2() {
		return eosrSubstr2;
	}

	/**
	 * Set eosrSubstr2
	 */
	public void setEosrSubstr2(String eosrSubstr2) {
		this.eosrSubstr2 = eosrSubstr2;
		addValidField("eosrSubstr2");
	}

	/**
	 * Get eosrSubstr3
	 */
	@Column(name = "EOSR_SUBSTR3")
	public String getEosrSubstr3() {
		return eosrSubstr3;
	}

	/**
	 * Set eosrSubstr3
	 */
	public void setEosrSubstr3(String eosrSubstr3) {
		this.eosrSubstr3 = eosrSubstr3;
		addValidField("eosrSubstr3");
	}

	/**
	 * Get eosrSubstr4
	 */
	@Column(name = "EOSR_SUBSTR4")
	public String getEosrSubstr4() {
		return eosrSubstr4;
	}

	/**
	 * Set eosrSubstr4
	 */
	public void setEosrSubstr4(String eosrSubstr4) {
		this.eosrSubstr4 = eosrSubstr4;
		addValidField("eosrSubstr4");
	}

	/**
	 * Get eosrSubstr5
	 */
	@Column(name = "EOSR_SUBSTR5")
	public String getEosrSubstr5() {
		return eosrSubstr5;
	}

	/**
	 * Set eosrSubstr5
	 */
	public void setEosrSubstr5(String eosrSubstr5) {
		this.eosrSubstr5 = eosrSubstr5;
		addValidField("eosrSubstr5");
	}

	/**
	 * Get eosrSubstr6
	 */
	@Column(name = "EOSR_SUBSTR6")
	public String getEosrSubstr6() {
		return eosrSubstr6;
	}

	/**
	 * Set eosrSubstr6
	 */
	public void setEosrSubstr6(String eosrSubstr6) {
		this.eosrSubstr6 = eosrSubstr6;
		addValidField("eosrSubstr6");
	}

	/**
	 * Get eosrSubstr7
	 */
	@Column(name = "EOSR_SUBSTR7")
	public String getEosrSubstr7() {
		return eosrSubstr7;
	}

	/**
	 * Set eosrSubstr7
	 */
	public void setEosrSubstr7(String eosrSubstr7) {
		this.eosrSubstr7 = eosrSubstr7;
		addValidField("eosrSubstr7");
	}

	/**
	 * Get eosrSubstr8
	 */
	@Column(name = "EOSR_SUBSTR8")
	public String getEosrSubstr8() {
		return eosrSubstr8;
	}

	/**
	 * Set eosrSubstr8
	 */
	public void setEosrSubstr8(String eosrSubstr8) {
		this.eosrSubstr8 = eosrSubstr8;
		addValidField("eosrSubstr8");
	}

	/**
	 * Get eosrSubstr9
	 */
	@Column(name = "EOSR_SUBSTR9")
	public String getEosrSubstr9() {
		return eosrSubstr9;
	}

	/**
	 * Set eosrSubstr9
	 */
	public void setEosrSubstr9(String eosrSubstr9) {
		this.eosrSubstr9 = eosrSubstr9;
		addValidField("eosrSubstr9");
	}

	/**
	 * Get eosrSubstr10
	 */
	@Column(name = "EOSR_SUBSTR10")
	public String getEosrSubstr10() {
		return eosrSubstr10;
	}

	/**
	 * Set eosrSubstr10
	 */
	public void setEosrSubstr10(String eosrSubstr10) {
		this.eosrSubstr10 = eosrSubstr10;
		addValidField("eosrSubstr10");
	}

	/**
	 * Get eosrSubstr11
	 */
	@Column(name = "EOSR_SUBSTR11")
	public String getEosrSubstr11() {
		return eosrSubstr11;
	}

	/**
	 * Set eosrSubstr11
	 */
	public void setEosrSubstr11(String eosrSubstr11) {
		this.eosrSubstr11 = eosrSubstr11;
		addValidField("eosrSubstr11");
	}

	/**
	 * Get eosrSubstr12
	 */
	@Column(name = "EOSR_SUBSTR12")
	public String getEosrSubstr12() {
		return eosrSubstr12;
	}

	/**
	 * Set eosrSubstr12
	 */
	public void setEosrSubstr12(String eosrSubstr12) {
		this.eosrSubstr12 = eosrSubstr12;
		addValidField("eosrSubstr12");
	}

	/**
	 * Get eosrSubstr13
	 */
	@Column(name = "EOSR_SUBSTR13")
	public String getEosrSubstr13() {
		return eosrSubstr13;
	}

	/**
	 * Set eosrSubstr13
	 */
	public void setEosrSubstr13(String eosrSubstr13) {
		this.eosrSubstr13 = eosrSubstr13;
		addValidField("eosrSubstr13");
	}

	/**
	 * Get eosrSubstr14
	 */
	@Column(name = "EOSR_SUBSTR14")
	public String getEosrSubstr14() {
		return eosrSubstr14;
	}

	/**
	 * Set eosrSubstr14
	 */
	public void setEosrSubstr14(String eosrSubstr14) {
		this.eosrSubstr14 = eosrSubstr14;
		addValidField("eosrSubstr14");
	}

	/**
	 * Get eosrSubstr15
	 */
	@Column(name = "EOSR_SUBSTR15")
	public String getEosrSubstr15() {
		return eosrSubstr15;
	}

	/**
	 * Set eosrSubstr15
	 */
	public void setEosrSubstr15(String eosrSubstr15) {
		this.eosrSubstr15 = eosrSubstr15;
		addValidField("eosrSubstr15");
	}

	/**
	 * Get eosrSubstr16
	 */
	@Column(name = "EOSR_SUBSTR16")
	public String getEosrSubstr16() {
		return eosrSubstr16;
	}

	/**
	 * Set eosrSubstr16
	 */
	public void setEosrSubstr16(String eosrSubstr16) {
		this.eosrSubstr16 = eosrSubstr16;
		addValidField("eosrSubstr16");
	}

	/**
	 * Get eosrSubstr17
	 */
	@Column(name = "EOSR_SUBSTR17")
	public String getEosrSubstr17() {
		return eosrSubstr17;
	}

	/**
	 * Set eosrSubstr17
	 */
	public void setEosrSubstr17(String eosrSubstr17) {
		this.eosrSubstr17 = eosrSubstr17;
		addValidField("eosrSubstr17");
	}

	/**
	 * Get eosrSubstr18
	 */
	@Column(name = "EOSR_SUBSTR18")
	public String getEosrSubstr18() {
		return eosrSubstr18;
	}

	/**
	 * Set eosrSubstr18
	 */
	public void setEosrSubstr18(String eosrSubstr18) {
		this.eosrSubstr18 = eosrSubstr18;
		addValidField("eosrSubstr18");
	}

	/**
	 * Get eosrSubstr19
	 */
	@Column(name = "EOSR_SUBSTR19")
	public String getEosrSubstr19() {
		return eosrSubstr19;
	}

	/**
	 * Set eosrSubstr19
	 */
	public void setEosrSubstr19(String eosrSubstr19) {
		this.eosrSubstr19 = eosrSubstr19;
		addValidField("eosrSubstr19");
	}

	/**
	 * Get eosrSubstr20
	 */
	@Column(name = "EOSR_SUBSTR20")
	public String getEosrSubstr20() {
		return eosrSubstr20;
	}

	/**
	 * Set eosrSubstr20
	 */
	public void setEosrSubstr20(String eosrSubstr20) {
		this.eosrSubstr20 = eosrSubstr20;
		addValidField("eosrSubstr20");
	}

	/**
	 * Get eosrSubstr21
	 */
	@Column(name = "EOSR_SUBSTR21")
	public String getEosrSubstr21() {
		return eosrSubstr21;
	}

	/**
	 * Set eosrSubstr21
	 */
	public void setEosrSubstr21(String eosrSubstr21) {
		this.eosrSubstr21 = eosrSubstr21;
		addValidField("eosrSubstr21");
	}

	/**
	 * Get eosrSubstr22
	 */
	@Column(name = "EOSR_SUBSTR22")
	public String getEosrSubstr22() {
		return eosrSubstr22;
	}

	/**
	 * Set eosrSubstr22
	 */
	public void setEosrSubstr22(String eosrSubstr22) {
		this.eosrSubstr22 = eosrSubstr22;
		addValidField("eosrSubstr22");
	}

	/**
	 * Get eosrSubstr23
	 */
	@Column(name = "EOSR_SUBSTR23")
	public String getEosrSubstr23() {
		return eosrSubstr23;
	}

	/**
	 * Set eosrSubstr23
	 */
	public void setEosrSubstr23(String eosrSubstr23) {
		this.eosrSubstr23 = eosrSubstr23;
		addValidField("eosrSubstr23");
	}

	/**
	 * Get eosrSubstr24
	 */
	@Column(name = "EOSR_SUBSTR24")
	public String getEosrSubstr24() {
		return eosrSubstr24;
	}

	/**
	 * Set eosrSubstr24
	 */
	public void setEosrSubstr24(String eosrSubstr24) {
		this.eosrSubstr24 = eosrSubstr24;
		addValidField("eosrSubstr24");
	}

	/**
	 * Get eosrSubstr25
	 */
	@Column(name = "EOSR_SUBSTR25")
	public String getEosrSubstr25() {
		return eosrSubstr25;
	}

	/**
	 * Set eosrSubstr25
	 */
	public void setEosrSubstr25(String eosrSubstr25) {
		this.eosrSubstr25 = eosrSubstr25;
		addValidField("eosrSubstr25");
	}

	/**
	 * Get eosrSubdate1
	 */
	@Column(name = "EOSR_SUBDATE1")
	public Date getEosrSubdate1() {
		return eosrSubdate1;
	}

	/**
	 * Set eosrSubdate1
	 */
	public void setEosrSubdate1(Date eosrSubdate1) {
		this.eosrSubdate1 = eosrSubdate1;
		addValidField("eosrSubdate1");
	}

	/**
	 * Get eosrSubdate2
	 */
	@Column(name = "EOSR_SUBDATE2")
	public Date getEosrSubdate2() {
		return eosrSubdate2;
	}

	/**
	 * Set eosrSubdate2
	 */
	public void setEosrSubdate2(Date eosrSubdate2) {
		this.eosrSubdate2 = eosrSubdate2;
		addValidField("eosrSubdate2");
	}

	/**
	 * Get eosrSubdate3
	 */
	@Column(name = "EOSR_SUBDATE3")
	public Date getEosrSubdate3() {
		return eosrSubdate3;
	}

	/**
	 * Set eosrSubdate3
	 */
	public void setEosrSubdate3(Date eosrSubdate3) {
		this.eosrSubdate3 = eosrSubdate3;
		addValidField("eosrSubdate3");
	}

	/**
	 * Get eosrSubdate4
	 */
	@Column(name = "EOSR_SUBDATE4")
	public Date getEosrSubdate4() {
		return eosrSubdate4;
	}

	/**
	 * Set eosrSubdate4
	 */
	public void setEosrSubdate4(Date eosrSubdate4) {
		this.eosrSubdate4 = eosrSubdate4;
		addValidField("eosrSubdate4");
	}

	/**
	 * Get eosrSubdate5
	 */
	@Column(name = "EOSR_SUBDATE5")
	public Date getEosrSubdate5() {
		return eosrSubdate5;
	}

	/**
	 * Set eosrSubdate5
	 */
	public void setEosrSubdate5(Date eosrSubdate5) {
		this.eosrSubdate5 = eosrSubdate5;
		addValidField("eosrSubdate5");
	}

	/**
	 * Get eosrSubdate6
	 */
	@Column(name = "EOSR_SUBDATE6")
	public Date getEosrSubdate6() {
		return eosrSubdate6;
	}

	/**
	 * Set eosrSubdate6
	 */
	public void setEosrSubdate6(Date eosrSubdate6) {
		this.eosrSubdate6 = eosrSubdate6;
		addValidField("eosrSubdate6");
	}

	/**
	 * Get eosrSubdate7
	 */
	@Column(name = "EOSR_SUBDATE7")
	public Date getEosrSubdate7() {
		return eosrSubdate7;
	}

	/**
	 * Set eosrSubdate7
	 */
	public void setEosrSubdate7(Date eosrSubdate7) {
		this.eosrSubdate7 = eosrSubdate7;
		addValidField("eosrSubdate7");
	}

	/**
	 * Get eosrSubdate8
	 */
	@Column(name = "EOSR_SUBDATE8")
	public Date getEosrSubdate8() {
		return eosrSubdate8;
	}

	/**
	 * Set eosrSubdate8
	 */
	public void setEosrSubdate8(Date eosrSubdate8) {
		this.eosrSubdate8 = eosrSubdate8;
		addValidField("eosrSubdate8");
	}

	/**
	 * Get eosrSubdate9
	 */
	@Column(name = "EOSR_SUBDATE9")
	public Date getEosrSubdate9() {
		return eosrSubdate9;
	}

	/**
	 * Set eosrSubdate9
	 */
	public void setEosrSubdate9(Date eosrSubdate9) {
		this.eosrSubdate9 = eosrSubdate9;
		addValidField("eosrSubdate9");
	}

	/**
	 * Get eosrSubdate10
	 */
	@Column(name = "EOSR_SUBDATE10")
	public Date getEosrSubdate10() {
		return eosrSubdate10;
	}

	/**
	 * Set eosrSubdate10
	 */
	public void setEosrSubdate10(Date eosrSubdate10) {
		this.eosrSubdate10 = eosrSubdate10;
		addValidField("eosrSubdate10");
	}

	/**
	 * Get eosrSubnum1
	 */
	@Column(name = "EOSR_SUBNUM1")
	public Long getEosrSubnum1() {
		return eosrSubnum1;
	}

	/**
	 * Set eosrSubnum1
	 */
	public void setEosrSubnum1(Long eosrSubnum1) {
		this.eosrSubnum1 = eosrSubnum1;
		addValidField("eosrSubnum1");
	}

	/**
	 * Get eosrSubnum2
	 */
	@Column(name = "EOSR_SUBNUM2")
	public Long getEosrSubnum2() {
		return eosrSubnum2;
	}

	/**
	 * Set eosrSubnum2
	 */
	public void setEosrSubnum2(Long eosrSubnum2) {
		this.eosrSubnum2 = eosrSubnum2;
		addValidField("eosrSubnum2");
	}

	/**
	 * Get eosrSubnum3
	 */
	@Column(name = "EOSR_SUBNUM3")
	public Long getEosrSubnum3() {
		return eosrSubnum3;
	}

	/**
	 * Set eosrSubnum3
	 */
	public void setEosrSubnum3(Long eosrSubnum3) {
		this.eosrSubnum3 = eosrSubnum3;
		addValidField("eosrSubnum3");
	}

	/**
	 * Get eosrSubnum4
	 */
	@Column(name = "EOSR_SUBNUM4")
	public Long getEosrSubnum4() {
		return eosrSubnum4;
	}

	/**
	 * Set eosrSubnum4
	 */
	public void setEosrSubnum4(Long eosrSubnum4) {
		this.eosrSubnum4 = eosrSubnum4;
		addValidField("eosrSubnum4");
	}

	/**
	 * Get eosrSubnum5
	 */
	@Column(name = "EOSR_SUBNUM5")
	public Long getEosrSubnum5() {
		return eosrSubnum5;
	}

	/**
	 * Set eosrSubnum5
	 */
	public void setEosrSubnum5(Long eosrSubnum5) {
		this.eosrSubnum5 = eosrSubnum5;
		addValidField("eosrSubnum5");
	}

	/**
	 * Get eosrSubnum6
	 */
	@Column(name = "EOSR_SUBNUM6")
	public Long getEosrSubnum6() {
		return eosrSubnum6;
	}

	/**
	 * Set eosrSubnum6
	 */
	public void setEosrSubnum6(Long eosrSubnum6) {
		this.eosrSubnum6 = eosrSubnum6;
		addValidField("eosrSubnum6");
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
