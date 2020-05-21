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
 * Model class for EoEorn2Eonm
 */
@Entity
@Table(name = "EO_EORN_2_EONM")
public class EoEorn2EonmModel extends BaseModel implements OperationLog {

	//eonmId
	private Long eonmId;
	//eonmEornId
	private Long eonmEornId;
	//eonmEoomId
	private Long eonmEoomId;
	//eonmBatchNo
	private String eonmBatchNo;
	//eonmEbmaId
	private Long eonmEbmaId;
	//eonmLineno
	private String eonmLineno;
	//eonmMaterialNo
	private String eonmMaterialNo;
	//eonmEbmaNameCn
	private String eonmEbmaNameCn;
	//eonmHscode
	private String eonmHscode;
	//eonmEbtpId
	private Long eonmEbtpId;
	//eonmEbtpModel
	private String eonmEbtpModel;
	//eonmEbtpPackage
	private String eonmEbtpPackage;
	//eonmEbtpPackageType
	private String eonmEbtpPackageType;
	//eonmCountryOfOriginCode
	private String eonmCountryOfOriginCode;
	//eonmCountryOfOriginName
	private String eonmCountryOfOriginName;
	//eonmContainerNo
	private String eonmContainerNo;
	//eonmQuantity
	private Long eonmQuantity;
	//eonmQuantityUnit
	private String eonmQuantityUnit;
	//eonmGrossWeight
	private Long eonmGrossWeight;
	//eonmNetWeight
	private Long eonmNetWeight;
	//eonmVolume
	private Long eonmVolume;
	//eonmDealUnitPrice
	private Long eonmDealUnitPrice;
	//eonmDealTotalPrice
	private Long eonmDealTotalPrice;
	//eonmRemark
	private String eonmRemark;
	//eonmCustomsPackage
	private String eonmCustomsPackage;
	//eonmRecordNumberSeq
	private String eonmRecordNumberSeq;
	//eonmSubstr1
	private String eonmSubstr1;
	//eonmSubstr2
	private String eonmSubstr2;
	//eonmSubstr3
	private String eonmSubstr3;
	//eonmSubstr4
	private String eonmSubstr4;
	//eonmSubstr5
	private String eonmSubstr5;
	//eonmSubstr6
	private String eonmSubstr6;
	//eonmSubstr7
	private String eonmSubstr7;
	//eonmSubstr8
	private String eonmSubstr8;
	//eonmSubstr9
	private String eonmSubstr9;
	//eonmSubstr10
	private String eonmSubstr10;
	//eonmSubstr11
	private String eonmSubstr11;
	//eonmSubstr12
	private String eonmSubstr12;
	//eonmSubstr13
	private String eonmSubstr13;
	//eonmSubstr14
	private String eonmSubstr14;
	//eonmSubstr15
	private String eonmSubstr15;
	//eonmSubstr16
	private String eonmSubstr16;
	//eonmSubstr17
	private String eonmSubstr17;
	//eonmSubstr18
	private String eonmSubstr18;
	//eonmSubstr19
	private String eonmSubstr19;
	//eonmSubstr20
	private String eonmSubstr20;
	//eonmSubstr21
	private String eonmSubstr21;
	//eonmSubstr22
	private String eonmSubstr22;
	//eonmSubstr23
	private String eonmSubstr23;
	//eonmSubstr24
	private String eonmSubstr24;
	//eonmSubstr25
	private String eonmSubstr25;
	//eonmSubdate1
	private Date eonmSubdate1;
	//eonmSubdate2
	private Date eonmSubdate2;
	//eonmSubdate3
	private Date eonmSubdate3;
	//eonmSubdate4
	private Date eonmSubdate4;
	//eonmSubdate5
	private Date eonmSubdate5;
	//eonmSubdate6
	private Date eonmSubdate6;
	//eonmSubdate7
	private Date eonmSubdate7;
	//eonmSubdate8
	private Date eonmSubdate8;
	//eonmSubdate9
	private Date eonmSubdate9;
	//eonmSubdate10
	private Date eonmSubdate10;
	//eonmSubnum1
	private Long eonmSubnum1;
	//eonmSubnum2
	private Long eonmSubnum2;
	//eonmSubnum3
	private Long eonmSubnum3;
	//eonmSubnum4
	private Long eonmSubnum4;
	//eonmSubnum5
	private Long eonmSubnum5;
	//eonmSubnum6
	private Long eonmSubnum6;
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
	 * Get eonmId
	 */
	@Column(name = "EONM_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEonmId() {
		return eonmId;
	}

	/**
	 * Set eonmId
	 */
	public void setEonmId(Long eonmId) {
		this.eonmId = eonmId;
		addValidField("eonmId");
	}

	/**
	 * Get eonmEornId
	 */
	@Column(name = "EONM_EORN_ID")
	public Long getEonmEornId() {
		return eonmEornId;
	}

	/**
	 * Set eonmEornId
	 */
	public void setEonmEornId(Long eonmEornId) {
		this.eonmEornId = eonmEornId;
		addValidField("eonmEornId");
	}

	/**
	 * Get eonmEoomId
	 */
	@Column(name = "EONM_EOOM_ID")
	public Long getEonmEoomId() {
		return eonmEoomId;
	}

	/**
	 * Set eonmEoomId
	 */
	public void setEonmEoomId(Long eonmEoomId) {
		this.eonmEoomId = eonmEoomId;
		addValidField("eonmEoomId");
	}

	/**
	 * Get eonmBatchNo
	 */
	@Column(name = "EONM_BATCH_NO")
	public String getEonmBatchNo() {
		return eonmBatchNo;
	}

	/**
	 * Set eonmBatchNo
	 */
	public void setEonmBatchNo(String eonmBatchNo) {
		this.eonmBatchNo = eonmBatchNo;
		addValidField("eonmBatchNo");
	}

	/**
	 * Get eonmEbmaId
	 */
	@Column(name = "EONM_EBMA_ID")
	public Long getEonmEbmaId() {
		return eonmEbmaId;
	}

	/**
	 * Set eonmEbmaId
	 */
	public void setEonmEbmaId(Long eonmEbmaId) {
		this.eonmEbmaId = eonmEbmaId;
		addValidField("eonmEbmaId");
	}

	/**
	 * Get eonmLineno
	 */
	@Column(name = "EONM_LINENO")
	public String getEonmLineno() {
		return eonmLineno;
	}

	/**
	 * Set eonmLineno
	 */
	public void setEonmLineno(String eonmLineno) {
		this.eonmLineno = eonmLineno;
		addValidField("eonmLineno");
	}

	/**
	 * Get eonmMaterialNo
	 */
	@Column(name = "EONM_MATERIAL_NO")
	public String getEonmMaterialNo() {
		return eonmMaterialNo;
	}

	/**
	 * Set eonmMaterialNo
	 */
	public void setEonmMaterialNo(String eonmMaterialNo) {
		this.eonmMaterialNo = eonmMaterialNo;
		addValidField("eonmMaterialNo");
	}

	/**
	 * Get eonmEbmaNameCn
	 */
	@Column(name = "EONM_EBMA_NAME_CN")
	public String getEonmEbmaNameCn() {
		return eonmEbmaNameCn;
	}

	/**
	 * Set eonmEbmaNameCn
	 */
	public void setEonmEbmaNameCn(String eonmEbmaNameCn) {
		this.eonmEbmaNameCn = eonmEbmaNameCn;
		addValidField("eonmEbmaNameCn");
	}

	/**
	 * Get eonmHscode
	 */
	@Column(name = "EONM_HSCODE")
	public String getEonmHscode() {
		return eonmHscode;
	}

	/**
	 * Set eonmHscode
	 */
	public void setEonmHscode(String eonmHscode) {
		this.eonmHscode = eonmHscode;
		addValidField("eonmHscode");
	}

	/**
	 * Get eonmEbtpId
	 */
	@Column(name = "EONM_EBTP_ID")
	public Long getEonmEbtpId() {
		return eonmEbtpId;
	}

	/**
	 * Set eonmEbtpId
	 */
	public void setEonmEbtpId(Long eonmEbtpId) {
		this.eonmEbtpId = eonmEbtpId;
		addValidField("eonmEbtpId");
	}

	/**
	 * Get eonmEbtpModel
	 */
	@Column(name = "EONM_EBTP_MODEL")
	public String getEonmEbtpModel() {
		return eonmEbtpModel;
	}

	/**
	 * Set eonmEbtpModel
	 */
	public void setEonmEbtpModel(String eonmEbtpModel) {
		this.eonmEbtpModel = eonmEbtpModel;
		addValidField("eonmEbtpModel");
	}

	/**
	 * Get eonmEbtpPackage
	 */
	@Column(name = "EONM_EBTP_PACKAGE")
	public String getEonmEbtpPackage() {
		return eonmEbtpPackage;
	}

	/**
	 * Set eonmEbtpPackage
	 */
	public void setEonmEbtpPackage(String eonmEbtpPackage) {
		this.eonmEbtpPackage = eonmEbtpPackage;
		addValidField("eonmEbtpPackage");
	}

	/**
	 * Get eonmEbtpPackageType
	 */
	@Column(name = "EONM_EBTP_PACKAGE_TYPE")
	public String getEonmEbtpPackageType() {
		return eonmEbtpPackageType;
	}

	/**
	 * Set eonmEbtpPackageType
	 */
	public void setEonmEbtpPackageType(String eonmEbtpPackageType) {
		this.eonmEbtpPackageType = eonmEbtpPackageType;
		addValidField("eonmEbtpPackageType");
	}

	/**
	 * Get eonmCountryOfOriginCode
	 */
	@Column(name = "EONM_COUNTRY_OF_ORIGIN_CODE")
	public String getEonmCountryOfOriginCode() {
		return eonmCountryOfOriginCode;
	}

	/**
	 * Set eonmCountryOfOriginCode
	 */
	public void setEonmCountryOfOriginCode(String eonmCountryOfOriginCode) {
		this.eonmCountryOfOriginCode = eonmCountryOfOriginCode;
		addValidField("eonmCountryOfOriginCode");
	}

	/**
	 * Get eonmCountryOfOriginName
	 */
	@Column(name = "EONM_COUNTRY_OF_ORIGIN_NAME")
	public String getEonmCountryOfOriginName() {
		return eonmCountryOfOriginName;
	}

	/**
	 * Set eonmCountryOfOriginName
	 */
	public void setEonmCountryOfOriginName(String eonmCountryOfOriginName) {
		this.eonmCountryOfOriginName = eonmCountryOfOriginName;
		addValidField("eonmCountryOfOriginName");
	}

	/**
	 * Get eonmContainerNo
	 */
	@Column(name = "EONM_CONTAINER_NO")
	public String getEonmContainerNo() {
		return eonmContainerNo;
	}

	/**
	 * Set eonmContainerNo
	 */
	public void setEonmContainerNo(String eonmContainerNo) {
		this.eonmContainerNo = eonmContainerNo;
		addValidField("eonmContainerNo");
	}

	/**
	 * Get eonmQuantity
	 */
	@Column(name = "EONM_QUANTITY")
	public Long getEonmQuantity() {
		return eonmQuantity;
	}

	/**
	 * Set eonmQuantity
	 */
	public void setEonmQuantity(Long eonmQuantity) {
		this.eonmQuantity = eonmQuantity;
		addValidField("eonmQuantity");
	}

	/**
	 * Get eonmQuantityUnit
	 */
	@Column(name = "EONM_QUANTITY_UNIT")
	public String getEonmQuantityUnit() {
		return eonmQuantityUnit;
	}

	/**
	 * Set eonmQuantityUnit
	 */
	public void setEonmQuantityUnit(String eonmQuantityUnit) {
		this.eonmQuantityUnit = eonmQuantityUnit;
		addValidField("eonmQuantityUnit");
	}

	/**
	 * Get eonmGrossWeight
	 */
	@Column(name = "EONM_GROSS_WEIGHT")
	public Long getEonmGrossWeight() {
		return eonmGrossWeight;
	}

	/**
	 * Set eonmGrossWeight
	 */
	public void setEonmGrossWeight(Long eonmGrossWeight) {
		this.eonmGrossWeight = eonmGrossWeight;
		addValidField("eonmGrossWeight");
	}

	/**
	 * Get eonmNetWeight
	 */
	@Column(name = "EONM_NET_WEIGHT")
	public Long getEonmNetWeight() {
		return eonmNetWeight;
	}

	/**
	 * Set eonmNetWeight
	 */
	public void setEonmNetWeight(Long eonmNetWeight) {
		this.eonmNetWeight = eonmNetWeight;
		addValidField("eonmNetWeight");
	}

	/**
	 * Get eonmVolume
	 */
	@Column(name = "EONM_VOLUME")
	public Long getEonmVolume() {
		return eonmVolume;
	}

	/**
	 * Set eonmVolume
	 */
	public void setEonmVolume(Long eonmVolume) {
		this.eonmVolume = eonmVolume;
		addValidField("eonmVolume");
	}

	/**
	 * Get eonmDealUnitPrice
	 */
	@Column(name = "EONM_DEAL_UNIT_PRICE")
	public Long getEonmDealUnitPrice() {
		return eonmDealUnitPrice;
	}

	/**
	 * Set eonmDealUnitPrice
	 */
	public void setEonmDealUnitPrice(Long eonmDealUnitPrice) {
		this.eonmDealUnitPrice = eonmDealUnitPrice;
		addValidField("eonmDealUnitPrice");
	}

	/**
	 * Get eonmDealTotalPrice
	 */
	@Column(name = "EONM_DEAL_TOTAL_PRICE")
	public Long getEonmDealTotalPrice() {
		return eonmDealTotalPrice;
	}

	/**
	 * Set eonmDealTotalPrice
	 */
	public void setEonmDealTotalPrice(Long eonmDealTotalPrice) {
		this.eonmDealTotalPrice = eonmDealTotalPrice;
		addValidField("eonmDealTotalPrice");
	}

	/**
	 * Get eonmRemark
	 */
	@Column(name = "EONM_REMARK")
	public String getEonmRemark() {
		return eonmRemark;
	}

	/**
	 * Set eonmRemark
	 */
	public void setEonmRemark(String eonmRemark) {
		this.eonmRemark = eonmRemark;
		addValidField("eonmRemark");
	}

	/**
	 * Get eonmCustomsPackage
	 */
	@Column(name = "EONM_CUSTOMS_PACKAGE")
	public String getEonmCustomsPackage() {
		return eonmCustomsPackage;
	}

	/**
	 * Set eonmCustomsPackage
	 */
	public void setEonmCustomsPackage(String eonmCustomsPackage) {
		this.eonmCustomsPackage = eonmCustomsPackage;
		addValidField("eonmCustomsPackage");
	}

	/**
	 * Get eonmRecordNumberSeq
	 */
	@Column(name = "EONM_RECORD_NUMBER_SEQ")
	public String getEonmRecordNumberSeq() {
		return eonmRecordNumberSeq;
	}

	/**
	 * Set eonmRecordNumberSeq
	 */
	public void setEonmRecordNumberSeq(String eonmRecordNumberSeq) {
		this.eonmRecordNumberSeq = eonmRecordNumberSeq;
		addValidField("eonmRecordNumberSeq");
	}

	/**
	 * Get eonmSubstr1
	 */
	@Column(name = "EONM_SUBSTR1")
	public String getEonmSubstr1() {
		return eonmSubstr1;
	}

	/**
	 * Set eonmSubstr1
	 */
	public void setEonmSubstr1(String eonmSubstr1) {
		this.eonmSubstr1 = eonmSubstr1;
		addValidField("eonmSubstr1");
	}

	/**
	 * Get eonmSubstr2
	 */
	@Column(name = "EONM_SUBSTR2")
	public String getEonmSubstr2() {
		return eonmSubstr2;
	}

	/**
	 * Set eonmSubstr2
	 */
	public void setEonmSubstr2(String eonmSubstr2) {
		this.eonmSubstr2 = eonmSubstr2;
		addValidField("eonmSubstr2");
	}

	/**
	 * Get eonmSubstr3
	 */
	@Column(name = "EONM_SUBSTR3")
	public String getEonmSubstr3() {
		return eonmSubstr3;
	}

	/**
	 * Set eonmSubstr3
	 */
	public void setEonmSubstr3(String eonmSubstr3) {
		this.eonmSubstr3 = eonmSubstr3;
		addValidField("eonmSubstr3");
	}

	/**
	 * Get eonmSubstr4
	 */
	@Column(name = "EONM_SUBSTR4")
	public String getEonmSubstr4() {
		return eonmSubstr4;
	}

	/**
	 * Set eonmSubstr4
	 */
	public void setEonmSubstr4(String eonmSubstr4) {
		this.eonmSubstr4 = eonmSubstr4;
		addValidField("eonmSubstr4");
	}

	/**
	 * Get eonmSubstr5
	 */
	@Column(name = "EONM_SUBSTR5")
	public String getEonmSubstr5() {
		return eonmSubstr5;
	}

	/**
	 * Set eonmSubstr5
	 */
	public void setEonmSubstr5(String eonmSubstr5) {
		this.eonmSubstr5 = eonmSubstr5;
		addValidField("eonmSubstr5");
	}

	/**
	 * Get eonmSubstr6
	 */
	@Column(name = "EONM_SUBSTR6")
	public String getEonmSubstr6() {
		return eonmSubstr6;
	}

	/**
	 * Set eonmSubstr6
	 */
	public void setEonmSubstr6(String eonmSubstr6) {
		this.eonmSubstr6 = eonmSubstr6;
		addValidField("eonmSubstr6");
	}

	/**
	 * Get eonmSubstr7
	 */
	@Column(name = "EONM_SUBSTR7")
	public String getEonmSubstr7() {
		return eonmSubstr7;
	}

	/**
	 * Set eonmSubstr7
	 */
	public void setEonmSubstr7(String eonmSubstr7) {
		this.eonmSubstr7 = eonmSubstr7;
		addValidField("eonmSubstr7");
	}

	/**
	 * Get eonmSubstr8
	 */
	@Column(name = "EONM_SUBSTR8")
	public String getEonmSubstr8() {
		return eonmSubstr8;
	}

	/**
	 * Set eonmSubstr8
	 */
	public void setEonmSubstr8(String eonmSubstr8) {
		this.eonmSubstr8 = eonmSubstr8;
		addValidField("eonmSubstr8");
	}

	/**
	 * Get eonmSubstr9
	 */
	@Column(name = "EONM_SUBSTR9")
	public String getEonmSubstr9() {
		return eonmSubstr9;
	}

	/**
	 * Set eonmSubstr9
	 */
	public void setEonmSubstr9(String eonmSubstr9) {
		this.eonmSubstr9 = eonmSubstr9;
		addValidField("eonmSubstr9");
	}

	/**
	 * Get eonmSubstr10
	 */
	@Column(name = "EONM_SUBSTR10")
	public String getEonmSubstr10() {
		return eonmSubstr10;
	}

	/**
	 * Set eonmSubstr10
	 */
	public void setEonmSubstr10(String eonmSubstr10) {
		this.eonmSubstr10 = eonmSubstr10;
		addValidField("eonmSubstr10");
	}

	/**
	 * Get eonmSubstr11
	 */
	@Column(name = "EONM_SUBSTR11")
	public String getEonmSubstr11() {
		return eonmSubstr11;
	}

	/**
	 * Set eonmSubstr11
	 */
	public void setEonmSubstr11(String eonmSubstr11) {
		this.eonmSubstr11 = eonmSubstr11;
		addValidField("eonmSubstr11");
	}

	/**
	 * Get eonmSubstr12
	 */
	@Column(name = "EONM_SUBSTR12")
	public String getEonmSubstr12() {
		return eonmSubstr12;
	}

	/**
	 * Set eonmSubstr12
	 */
	public void setEonmSubstr12(String eonmSubstr12) {
		this.eonmSubstr12 = eonmSubstr12;
		addValidField("eonmSubstr12");
	}

	/**
	 * Get eonmSubstr13
	 */
	@Column(name = "EONM_SUBSTR13")
	public String getEonmSubstr13() {
		return eonmSubstr13;
	}

	/**
	 * Set eonmSubstr13
	 */
	public void setEonmSubstr13(String eonmSubstr13) {
		this.eonmSubstr13 = eonmSubstr13;
		addValidField("eonmSubstr13");
	}

	/**
	 * Get eonmSubstr14
	 */
	@Column(name = "EONM_SUBSTR14")
	public String getEonmSubstr14() {
		return eonmSubstr14;
	}

	/**
	 * Set eonmSubstr14
	 */
	public void setEonmSubstr14(String eonmSubstr14) {
		this.eonmSubstr14 = eonmSubstr14;
		addValidField("eonmSubstr14");
	}

	/**
	 * Get eonmSubstr15
	 */
	@Column(name = "EONM_SUBSTR15")
	public String getEonmSubstr15() {
		return eonmSubstr15;
	}

	/**
	 * Set eonmSubstr15
	 */
	public void setEonmSubstr15(String eonmSubstr15) {
		this.eonmSubstr15 = eonmSubstr15;
		addValidField("eonmSubstr15");
	}

	/**
	 * Get eonmSubstr16
	 */
	@Column(name = "EONM_SUBSTR16")
	public String getEonmSubstr16() {
		return eonmSubstr16;
	}

	/**
	 * Set eonmSubstr16
	 */
	public void setEonmSubstr16(String eonmSubstr16) {
		this.eonmSubstr16 = eonmSubstr16;
		addValidField("eonmSubstr16");
	}

	/**
	 * Get eonmSubstr17
	 */
	@Column(name = "EONM_SUBSTR17")
	public String getEonmSubstr17() {
		return eonmSubstr17;
	}

	/**
	 * Set eonmSubstr17
	 */
	public void setEonmSubstr17(String eonmSubstr17) {
		this.eonmSubstr17 = eonmSubstr17;
		addValidField("eonmSubstr17");
	}

	/**
	 * Get eonmSubstr18
	 */
	@Column(name = "EONM_SUBSTR18")
	public String getEonmSubstr18() {
		return eonmSubstr18;
	}

	/**
	 * Set eonmSubstr18
	 */
	public void setEonmSubstr18(String eonmSubstr18) {
		this.eonmSubstr18 = eonmSubstr18;
		addValidField("eonmSubstr18");
	}

	/**
	 * Get eonmSubstr19
	 */
	@Column(name = "EONM_SUBSTR19")
	public String getEonmSubstr19() {
		return eonmSubstr19;
	}

	/**
	 * Set eonmSubstr19
	 */
	public void setEonmSubstr19(String eonmSubstr19) {
		this.eonmSubstr19 = eonmSubstr19;
		addValidField("eonmSubstr19");
	}

	/**
	 * Get eonmSubstr20
	 */
	@Column(name = "EONM_SUBSTR20")
	public String getEonmSubstr20() {
		return eonmSubstr20;
	}

	/**
	 * Set eonmSubstr20
	 */
	public void setEonmSubstr20(String eonmSubstr20) {
		this.eonmSubstr20 = eonmSubstr20;
		addValidField("eonmSubstr20");
	}

	/**
	 * Get eonmSubstr21
	 */
	@Column(name = "EONM_SUBSTR21")
	public String getEonmSubstr21() {
		return eonmSubstr21;
	}

	/**
	 * Set eonmSubstr21
	 */
	public void setEonmSubstr21(String eonmSubstr21) {
		this.eonmSubstr21 = eonmSubstr21;
		addValidField("eonmSubstr21");
	}

	/**
	 * Get eonmSubstr22
	 */
	@Column(name = "EONM_SUBSTR22")
	public String getEonmSubstr22() {
		return eonmSubstr22;
	}

	/**
	 * Set eonmSubstr22
	 */
	public void setEonmSubstr22(String eonmSubstr22) {
		this.eonmSubstr22 = eonmSubstr22;
		addValidField("eonmSubstr22");
	}

	/**
	 * Get eonmSubstr23
	 */
	@Column(name = "EONM_SUBSTR23")
	public String getEonmSubstr23() {
		return eonmSubstr23;
	}

	/**
	 * Set eonmSubstr23
	 */
	public void setEonmSubstr23(String eonmSubstr23) {
		this.eonmSubstr23 = eonmSubstr23;
		addValidField("eonmSubstr23");
	}

	/**
	 * Get eonmSubstr24
	 */
	@Column(name = "EONM_SUBSTR24")
	public String getEonmSubstr24() {
		return eonmSubstr24;
	}

	/**
	 * Set eonmSubstr24
	 */
	public void setEonmSubstr24(String eonmSubstr24) {
		this.eonmSubstr24 = eonmSubstr24;
		addValidField("eonmSubstr24");
	}

	/**
	 * Get eonmSubstr25
	 */
	@Column(name = "EONM_SUBSTR25")
	public String getEonmSubstr25() {
		return eonmSubstr25;
	}

	/**
	 * Set eonmSubstr25
	 */
	public void setEonmSubstr25(String eonmSubstr25) {
		this.eonmSubstr25 = eonmSubstr25;
		addValidField("eonmSubstr25");
	}

	/**
	 * Get eonmSubdate1
	 */
	@Column(name = "EONM_SUBDATE1")
	public Date getEonmSubdate1() {
		return eonmSubdate1;
	}

	/**
	 * Set eonmSubdate1
	 */
	public void setEonmSubdate1(Date eonmSubdate1) {
		this.eonmSubdate1 = eonmSubdate1;
		addValidField("eonmSubdate1");
	}

	/**
	 * Get eonmSubdate2
	 */
	@Column(name = "EONM_SUBDATE2")
	public Date getEonmSubdate2() {
		return eonmSubdate2;
	}

	/**
	 * Set eonmSubdate2
	 */
	public void setEonmSubdate2(Date eonmSubdate2) {
		this.eonmSubdate2 = eonmSubdate2;
		addValidField("eonmSubdate2");
	}

	/**
	 * Get eonmSubdate3
	 */
	@Column(name = "EONM_SUBDATE3")
	public Date getEonmSubdate3() {
		return eonmSubdate3;
	}

	/**
	 * Set eonmSubdate3
	 */
	public void setEonmSubdate3(Date eonmSubdate3) {
		this.eonmSubdate3 = eonmSubdate3;
		addValidField("eonmSubdate3");
	}

	/**
	 * Get eonmSubdate4
	 */
	@Column(name = "EONM_SUBDATE4")
	public Date getEonmSubdate4() {
		return eonmSubdate4;
	}

	/**
	 * Set eonmSubdate4
	 */
	public void setEonmSubdate4(Date eonmSubdate4) {
		this.eonmSubdate4 = eonmSubdate4;
		addValidField("eonmSubdate4");
	}

	/**
	 * Get eonmSubdate5
	 */
	@Column(name = "EONM_SUBDATE5")
	public Date getEonmSubdate5() {
		return eonmSubdate5;
	}

	/**
	 * Set eonmSubdate5
	 */
	public void setEonmSubdate5(Date eonmSubdate5) {
		this.eonmSubdate5 = eonmSubdate5;
		addValidField("eonmSubdate5");
	}

	/**
	 * Get eonmSubdate6
	 */
	@Column(name = "EONM_SUBDATE6")
	public Date getEonmSubdate6() {
		return eonmSubdate6;
	}

	/**
	 * Set eonmSubdate6
	 */
	public void setEonmSubdate6(Date eonmSubdate6) {
		this.eonmSubdate6 = eonmSubdate6;
		addValidField("eonmSubdate6");
	}

	/**
	 * Get eonmSubdate7
	 */
	@Column(name = "EONM_SUBDATE7")
	public Date getEonmSubdate7() {
		return eonmSubdate7;
	}

	/**
	 * Set eonmSubdate7
	 */
	public void setEonmSubdate7(Date eonmSubdate7) {
		this.eonmSubdate7 = eonmSubdate7;
		addValidField("eonmSubdate7");
	}

	/**
	 * Get eonmSubdate8
	 */
	@Column(name = "EONM_SUBDATE8")
	public Date getEonmSubdate8() {
		return eonmSubdate8;
	}

	/**
	 * Set eonmSubdate8
	 */
	public void setEonmSubdate8(Date eonmSubdate8) {
		this.eonmSubdate8 = eonmSubdate8;
		addValidField("eonmSubdate8");
	}

	/**
	 * Get eonmSubdate9
	 */
	@Column(name = "EONM_SUBDATE9")
	public Date getEonmSubdate9() {
		return eonmSubdate9;
	}

	/**
	 * Set eonmSubdate9
	 */
	public void setEonmSubdate9(Date eonmSubdate9) {
		this.eonmSubdate9 = eonmSubdate9;
		addValidField("eonmSubdate9");
	}

	/**
	 * Get eonmSubdate10
	 */
	@Column(name = "EONM_SUBDATE10")
	public Date getEonmSubdate10() {
		return eonmSubdate10;
	}

	/**
	 * Set eonmSubdate10
	 */
	public void setEonmSubdate10(Date eonmSubdate10) {
		this.eonmSubdate10 = eonmSubdate10;
		addValidField("eonmSubdate10");
	}

	/**
	 * Get eonmSubnum1
	 */
	@Column(name = "EONM_SUBNUM1")
	public Long getEonmSubnum1() {
		return eonmSubnum1;
	}

	/**
	 * Set eonmSubnum1
	 */
	public void setEonmSubnum1(Long eonmSubnum1) {
		this.eonmSubnum1 = eonmSubnum1;
		addValidField("eonmSubnum1");
	}

	/**
	 * Get eonmSubnum2
	 */
	@Column(name = "EONM_SUBNUM2")
	public Long getEonmSubnum2() {
		return eonmSubnum2;
	}

	/**
	 * Set eonmSubnum2
	 */
	public void setEonmSubnum2(Long eonmSubnum2) {
		this.eonmSubnum2 = eonmSubnum2;
		addValidField("eonmSubnum2");
	}

	/**
	 * Get eonmSubnum3
	 */
	@Column(name = "EONM_SUBNUM3")
	public Long getEonmSubnum3() {
		return eonmSubnum3;
	}

	/**
	 * Set eonmSubnum3
	 */
	public void setEonmSubnum3(Long eonmSubnum3) {
		this.eonmSubnum3 = eonmSubnum3;
		addValidField("eonmSubnum3");
	}

	/**
	 * Get eonmSubnum4
	 */
	@Column(name = "EONM_SUBNUM4")
	public Long getEonmSubnum4() {
		return eonmSubnum4;
	}

	/**
	 * Set eonmSubnum4
	 */
	public void setEonmSubnum4(Long eonmSubnum4) {
		this.eonmSubnum4 = eonmSubnum4;
		addValidField("eonmSubnum4");
	}

	/**
	 * Get eonmSubnum5
	 */
	@Column(name = "EONM_SUBNUM5")
	public Long getEonmSubnum5() {
		return eonmSubnum5;
	}

	/**
	 * Set eonmSubnum5
	 */
	public void setEonmSubnum5(Long eonmSubnum5) {
		this.eonmSubnum5 = eonmSubnum5;
		addValidField("eonmSubnum5");
	}

	/**
	 * Get eonmSubnum6
	 */
	@Column(name = "EONM_SUBNUM6")
	public Long getEonmSubnum6() {
		return eonmSubnum6;
	}

	/**
	 * Set eonmSubnum6
	 */
	public void setEonmSubnum6(Long eonmSubnum6) {
		this.eonmSubnum6 = eonmSubnum6;
		addValidField("eonmSubnum6");
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
