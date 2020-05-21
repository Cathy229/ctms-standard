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
 * Model class for EoEoom2Eodm
 */
@Entity
@Table(name = "EO_EOOM_2_EODM")
public class EoEoom2EodmModel extends BaseModel implements OperationLog {

	//eodmId
	private Long eodmId;
	//eodmEoddId
	private Long eodmEoddId;
	//eodmEoomId
	private Long eodmEoomId;
	//eodmBatchNo
	private String eodmBatchNo;
	//eodmEbmaId
	private Long eodmEbmaId;
	//eodmLineno
	private String eodmLineno;
	//eodmMaterialNo
	private String eodmMaterialNo;
	//eodmEbmaNameCn
	private String eodmEbmaNameCn;
	//eodmHscode
	private String eodmHscode;
	//eodmEbtpId
	private Long eodmEbtpId;
	//eodmEbtpModel
	private String eodmEbtpModel;
	//eodmEbtpPackage
	private String eodmEbtpPackage;
	//eodmEbtpPackageType
	private String eodmEbtpPackageType;
	//eodmCountryOfOriginCode
	private String eodmCountryOfOriginCode;
	//eodmCountryOfOriginName
	private String eodmCountryOfOriginName;
	//eodmContainerNo
	private String eodmContainerNo;
	//eodmQuantity
	private Long eodmQuantity;
	//eodmQuantityUnit
	private String eodmQuantityUnit;
	//eodmGrossWeight
	private Long eodmGrossWeight;
	//eodmNetWeight
	private Long eodmNetWeight;
	//eodmVolume
	private Long eodmVolume;
	//eodmDealUnitPrice
	private Double eodmDealUnitPrice;
	//eodmDealTotalPrice
	private Double eodmDealTotalPrice;
	//eodmRemark
	private String eodmRemark;
	//eodmSubstr1
	private String eodmSubstr1;
	//eodmSubstr2
	private String eodmSubstr2;
	//eodmSubstr3
	private String eodmSubstr3;
	//eodmSubstr4
	private String eodmSubstr4;
	//eodmSubstr5
	private String eodmSubstr5;
	//eodmSubstr6
	private String eodmSubstr6;
	//eodmSubstr7
	private String eodmSubstr7;
	//eodmSubstr8
	private String eodmSubstr8;
	//eodmSubstr9
	private String eodmSubstr9;
	//eodmSubstr10
	private String eodmSubstr10;
	//eodmSubstr11
	private String eodmSubstr11;
	//eodmSubstr12
	private String eodmSubstr12;
	//eodmSubstr13
	private String eodmSubstr13;
	//eodmSubstr14
	private String eodmSubstr14;
	//eodmSubstr15
	private String eodmSubstr15;
	//eodmSubstr16
	private String eodmSubstr16;
	//eodmSubstr17
	private String eodmSubstr17;
	//eodmSubstr18
	private String eodmSubstr18;
	//eodmSubstr19
	private String eodmSubstr19;
	//eodmSubstr20
	private String eodmSubstr20;
	//eodmSubstr21
	private String eodmSubstr21;
	//eodmSubstr22
	private String eodmSubstr22;
	//eodmSubstr23
	private String eodmSubstr23;
	//eodmSubstr24
	private String eodmSubstr24;
	//eodmSubstr25
	private String eodmSubstr25;
	//eodmSubdate1
	private Date eodmSubdate1;
	//eodmSubdate2
	private Date eodmSubdate2;
	//eodmSubdate3
	private Date eodmSubdate3;
	//eodmSubdate4
	private Date eodmSubdate4;
	//eodmSubdate5
	private Date eodmSubdate5;
	//eodmSubdate6
	private Date eodmSubdate6;
	//eodmSubdate7
	private Date eodmSubdate7;
	//eodmSubdate8
	private Date eodmSubdate8;
	//eodmSubdate9
	private Date eodmSubdate9;
	//eodmSubdate10
	private Date eodmSubdate10;
	//eodmSubnum1
	private Long eodmSubnum1;
	//eodmSubnum2
	private Long eodmSubnum2;
	//eodmSubnum3
	private Long eodmSubnum3;
	//eodmSubnum4
	private Long eodmSubnum4;
	//eodmSubnum5
	private Long eodmSubnum5;
	//eodmSubnum6
	private Long eodmSubnum6;
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
	//eodmCustomsPackage
	private String eodmCustomsPackage;
	//eodmRecordNumberSeq
	private String eodmRecordNumberSeq;
	//eodmCurrencySystem
	private String eodmCurrencySystem;
	//eodmLevyTaxRelief
	private String eodmLevyTaxRelief;
	//eodmDestinationCountry
	private String eodmDestinationCountry;
	//eodmDestinationCountryName
	private String eodmDestinationCountryName;
	//eodmLegalQuantity
	private Long eodmLegalQuantity;
	//eodmLegalQuantityUnit
	private String eodmLegalQuantityUnit;
	//eodmSecondQuantity
	private Long eodmSecondQuantity;
	//eodmSecondQuantityUnit
	private String eodmSecondQuantityUnit;
	//eodmOriginalPlaceGoods
	private String eodmOriginalPlaceGoods;
	//eodmPurpose
	private String eodmPurpose;
	//eodmInspectionQuarantieCode
	private String eodmInspectionQuarantieCode;
	//eodmInspectionQuarantieName
	private String eodmInspectionQuarantieName;

	/**
	 * Get eodmId
	 */
	@Column(name = "EODM_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEodmId() {
		return eodmId;
	}

	/**
	 * Set eodmId
	 */
	public void setEodmId(Long eodmId) {
		this.eodmId = eodmId;
		addValidField("eodmId");
	}

	/**
	 * Get eodmEoddId
	 */
	@Column(name = "EODM_EODD_ID")
	public Long getEodmEoddId() {
		return eodmEoddId;
	}

	/**
	 * Set eodmEoddId
	 */
	public void setEodmEoddId(Long eodmEoddId) {
		this.eodmEoddId = eodmEoddId;
		addValidField("eodmEoddId");
	}

	/**
	 * Get eodmEoomId
	 */
	@Column(name = "EODM_EOOM_ID")
	public Long getEodmEoomId() {
		return eodmEoomId;
	}

	/**
	 * Set eodmEoomId
	 */
	public void setEodmEoomId(Long eodmEoomId) {
		this.eodmEoomId = eodmEoomId;
		addValidField("eodmEoomId");
	}

	/**
	 * Get eodmBatchNo
	 */
	@Column(name = "EODM_BATCH_NO")
	public String getEodmBatchNo() {
		return eodmBatchNo;
	}

	/**
	 * Set eodmBatchNo
	 */
	public void setEodmBatchNo(String eodmBatchNo) {
		this.eodmBatchNo = eodmBatchNo;
		addValidField("eodmBatchNo");
	}

	/**
	 * Get eodmEbmaId
	 */
	@Column(name = "EODM_EBMA_ID")
	public Long getEodmEbmaId() {
		return eodmEbmaId;
	}

	/**
	 * Set eodmEbmaId
	 */
	public void setEodmEbmaId(Long eodmEbmaId) {
		this.eodmEbmaId = eodmEbmaId;
		addValidField("eodmEbmaId");
	}

	/**
	 * Get eodmLineno
	 */
	@Column(name = "EODM_LINENO")
	public String getEodmLineno() {
		return eodmLineno;
	}

	/**
	 * Set eodmLineno
	 */
	public void setEodmLineno(String eodmLineno) {
		this.eodmLineno = eodmLineno;
		addValidField("eodmLineno");
	}

	/**
	 * Get eodmMaterialNo
	 */
	@Column(name = "EODM_MATERIAL_NO")
	public String getEodmMaterialNo() {
		return eodmMaterialNo;
	}

	/**
	 * Set eodmMaterialNo
	 */
	public void setEodmMaterialNo(String eodmMaterialNo) {
		this.eodmMaterialNo = eodmMaterialNo;
		addValidField("eodmMaterialNo");
	}

	/**
	 * Get eodmEbmaNameCn
	 */
	@Column(name = "EODM_EBMA_NAME_CN")
	public String getEodmEbmaNameCn() {
		return eodmEbmaNameCn;
	}

	/**
	 * Set eodmEbmaNameCn
	 */
	public void setEodmEbmaNameCn(String eodmEbmaNameCn) {
		this.eodmEbmaNameCn = eodmEbmaNameCn;
		addValidField("eodmEbmaNameCn");
	}

	/**
	 * Get eodmHscode
	 */
	@Column(name = "EODM_HSCODE")
	public String getEodmHscode() {
		return eodmHscode;
	}

	/**
	 * Set eodmHscode
	 */
	public void setEodmHscode(String eodmHscode) {
		this.eodmHscode = eodmHscode;
		addValidField("eodmHscode");
	}

	/**
	 * Get eodmEbtpId
	 */
	@Column(name = "EODM_EBTP_ID")
	public Long getEodmEbtpId() {
		return eodmEbtpId;
	}

	/**
	 * Set eodmEbtpId
	 */
	public void setEodmEbtpId(Long eodmEbtpId) {
		this.eodmEbtpId = eodmEbtpId;
		addValidField("eodmEbtpId");
	}

	/**
	 * Get eodmEbtpModel
	 */
	@Column(name = "EODM_EBTP_MODEL")
	public String getEodmEbtpModel() {
		return eodmEbtpModel;
	}

	/**
	 * Set eodmEbtpModel
	 */
	public void setEodmEbtpModel(String eodmEbtpModel) {
		this.eodmEbtpModel = eodmEbtpModel;
		addValidField("eodmEbtpModel");
	}

	/**
	 * Get eodmEbtpPackage
	 */
	@Column(name = "EODM_EBTP_PACKAGE")
	public String getEodmEbtpPackage() {
		return eodmEbtpPackage;
	}

	/**
	 * Set eodmEbtpPackage
	 */
	public void setEodmEbtpPackage(String eodmEbtpPackage) {
		this.eodmEbtpPackage = eodmEbtpPackage;
		addValidField("eodmEbtpPackage");
	}

	/**
	 * Get eodmEbtpPackageType
	 */
	@Column(name = "EODM_EBTP_PACKAGE_TYPE")
	public String getEodmEbtpPackageType() {
		return eodmEbtpPackageType;
	}

	/**
	 * Set eodmEbtpPackageType
	 */
	public void setEodmEbtpPackageType(String eodmEbtpPackageType) {
		this.eodmEbtpPackageType = eodmEbtpPackageType;
		addValidField("eodmEbtpPackageType");
	}

	/**
	 * Get eodmCountryOfOriginCode
	 */
	@Column(name = "EODM_COUNTRY_OF_ORIGIN_CODE")
	public String getEodmCountryOfOriginCode() {
		return eodmCountryOfOriginCode;
	}

	/**
	 * Set eodmCountryOfOriginCode
	 */
	public void setEodmCountryOfOriginCode(String eodmCountryOfOriginCode) {
		this.eodmCountryOfOriginCode = eodmCountryOfOriginCode;
		addValidField("eodmCountryOfOriginCode");
	}

	/**
	 * Get eodmCountryOfOriginName
	 */
	@Column(name = "EODM_COUNTRY_OF_ORIGIN_NAME")
	public String getEodmCountryOfOriginName() {
		return eodmCountryOfOriginName;
	}

	/**
	 * Set eodmCountryOfOriginName
	 */
	public void setEodmCountryOfOriginName(String eodmCountryOfOriginName) {
		this.eodmCountryOfOriginName = eodmCountryOfOriginName;
		addValidField("eodmCountryOfOriginName");
	}

	/**
	 * Get eodmContainerNo
	 */
	@Column(name = "EODM_CONTAINER_NO")
	public String getEodmContainerNo() {
		return eodmContainerNo;
	}

	/**
	 * Set eodmContainerNo
	 */
	public void setEodmContainerNo(String eodmContainerNo) {
		this.eodmContainerNo = eodmContainerNo;
		addValidField("eodmContainerNo");
	}

	/**
	 * Get eodmQuantity
	 */
	@Column(name = "EODM_QUANTITY")
	public Long getEodmQuantity() {
		return eodmQuantity;
	}

	/**
	 * Set eodmQuantity
	 */
	public void setEodmQuantity(Long eodmQuantity) {
		this.eodmQuantity = eodmQuantity;
		addValidField("eodmQuantity");
	}

	/**
	 * Get eodmQuantityUnit
	 */
	@Column(name = "EODM_QUANTITY_UNIT")
	public String getEodmQuantityUnit() {
		return eodmQuantityUnit;
	}

	/**
	 * Set eodmQuantityUnit
	 */
	public void setEodmQuantityUnit(String eodmQuantityUnit) {
		this.eodmQuantityUnit = eodmQuantityUnit;
		addValidField("eodmQuantityUnit");
	}

	/**
	 * Get eodmGrossWeight
	 */
	@Column(name = "EODM_GROSS_WEIGHT")
	public Long getEodmGrossWeight() {
		return eodmGrossWeight;
	}

	/**
	 * Set eodmGrossWeight
	 */
	public void setEodmGrossWeight(Long eodmGrossWeight) {
		this.eodmGrossWeight = eodmGrossWeight;
		addValidField("eodmGrossWeight");
	}

	/**
	 * Get eodmNetWeight
	 */
	@Column(name = "EODM_NET_WEIGHT")
	public Long getEodmNetWeight() {
		return eodmNetWeight;
	}

	/**
	 * Set eodmNetWeight
	 */
	public void setEodmNetWeight(Long eodmNetWeight) {
		this.eodmNetWeight = eodmNetWeight;
		addValidField("eodmNetWeight");
	}

	/**
	 * Get eodmVolume
	 */
	@Column(name = "EODM_VOLUME")
	public Long getEodmVolume() {
		return eodmVolume;
	}

	/**
	 * Set eodmVolume
	 */
	public void setEodmVolume(Long eodmVolume) {
		this.eodmVolume = eodmVolume;
		addValidField("eodmVolume");
	}

	/**
	 * Get eodmDealUnitPrice
	 */
	@Column(name = "EODM_DEAL_UNIT_PRICE")
	public Double getEodmDealUnitPrice() {
		return eodmDealUnitPrice;
	}

	/**
	 * Set eodmDealUnitPrice
	 */
	public void setEodmDealUnitPrice(Double eodmDealUnitPrice) {
		this.eodmDealUnitPrice = eodmDealUnitPrice;
		addValidField("eodmDealUnitPrice");
	}

	/**
	 * Get eodmDealTotalPrice
	 */
	@Column(name = "EODM_DEAL_TOTAL_PRICE")
	public Double getEodmDealTotalPrice() {
		return eodmDealTotalPrice;
	}

	/**
	 * Set eodmDealTotalPrice
	 */
	public void setEodmDealTotalPrice(Double eodmDealTotalPrice) {
		this.eodmDealTotalPrice = eodmDealTotalPrice;
		addValidField("eodmDealTotalPrice");
	}

	/**
	 * Get eodmRemark
	 */
	@Column(name = "EODM_REMARK")
	public String getEodmRemark() {
		return eodmRemark;
	}

	/**
	 * Set eodmRemark
	 */
	public void setEodmRemark(String eodmRemark) {
		this.eodmRemark = eodmRemark;
		addValidField("eodmRemark");
	}

	/**
	 * Get eodmSubstr1
	 */
	@Column(name = "EODM_SUBSTR1")
	public String getEodmSubstr1() {
		return eodmSubstr1;
	}

	/**
	 * Set eodmSubstr1
	 */
	public void setEodmSubstr1(String eodmSubstr1) {
		this.eodmSubstr1 = eodmSubstr1;
		addValidField("eodmSubstr1");
	}

	/**
	 * Get eodmSubstr2
	 */
	@Column(name = "EODM_SUBSTR2")
	public String getEodmSubstr2() {
		return eodmSubstr2;
	}

	/**
	 * Set eodmSubstr2
	 */
	public void setEodmSubstr2(String eodmSubstr2) {
		this.eodmSubstr2 = eodmSubstr2;
		addValidField("eodmSubstr2");
	}

	/**
	 * Get eodmSubstr3
	 */
	@Column(name = "EODM_SUBSTR3")
	public String getEodmSubstr3() {
		return eodmSubstr3;
	}

	/**
	 * Set eodmSubstr3
	 */
	public void setEodmSubstr3(String eodmSubstr3) {
		this.eodmSubstr3 = eodmSubstr3;
		addValidField("eodmSubstr3");
	}

	/**
	 * Get eodmSubstr4
	 */
	@Column(name = "EODM_SUBSTR4")
	public String getEodmSubstr4() {
		return eodmSubstr4;
	}

	/**
	 * Set eodmSubstr4
	 */
	public void setEodmSubstr4(String eodmSubstr4) {
		this.eodmSubstr4 = eodmSubstr4;
		addValidField("eodmSubstr4");
	}

	/**
	 * Get eodmSubstr5
	 */
	@Column(name = "EODM_SUBSTR5")
	public String getEodmSubstr5() {
		return eodmSubstr5;
	}

	/**
	 * Set eodmSubstr5
	 */
	public void setEodmSubstr5(String eodmSubstr5) {
		this.eodmSubstr5 = eodmSubstr5;
		addValidField("eodmSubstr5");
	}

	/**
	 * Get eodmSubstr6
	 */
	@Column(name = "EODM_SUBSTR6")
	public String getEodmSubstr6() {
		return eodmSubstr6;
	}

	/**
	 * Set eodmSubstr6
	 */
	public void setEodmSubstr6(String eodmSubstr6) {
		this.eodmSubstr6 = eodmSubstr6;
		addValidField("eodmSubstr6");
	}

	/**
	 * Get eodmSubstr7
	 */
	@Column(name = "EODM_SUBSTR7")
	public String getEodmSubstr7() {
		return eodmSubstr7;
	}

	/**
	 * Set eodmSubstr7
	 */
	public void setEodmSubstr7(String eodmSubstr7) {
		this.eodmSubstr7 = eodmSubstr7;
		addValidField("eodmSubstr7");
	}

	/**
	 * Get eodmSubstr8
	 */
	@Column(name = "EODM_SUBSTR8")
	public String getEodmSubstr8() {
		return eodmSubstr8;
	}

	/**
	 * Set eodmSubstr8
	 */
	public void setEodmSubstr8(String eodmSubstr8) {
		this.eodmSubstr8 = eodmSubstr8;
		addValidField("eodmSubstr8");
	}

	/**
	 * Get eodmSubstr9
	 */
	@Column(name = "EODM_SUBSTR9")
	public String getEodmSubstr9() {
		return eodmSubstr9;
	}

	/**
	 * Set eodmSubstr9
	 */
	public void setEodmSubstr9(String eodmSubstr9) {
		this.eodmSubstr9 = eodmSubstr9;
		addValidField("eodmSubstr9");
	}

	/**
	 * Get eodmSubstr10
	 */
	@Column(name = "EODM_SUBSTR10")
	public String getEodmSubstr10() {
		return eodmSubstr10;
	}

	/**
	 * Set eodmSubstr10
	 */
	public void setEodmSubstr10(String eodmSubstr10) {
		this.eodmSubstr10 = eodmSubstr10;
		addValidField("eodmSubstr10");
	}

	/**
	 * Get eodmSubstr11
	 */
	@Column(name = "EODM_SUBSTR11")
	public String getEodmSubstr11() {
		return eodmSubstr11;
	}

	/**
	 * Set eodmSubstr11
	 */
	public void setEodmSubstr11(String eodmSubstr11) {
		this.eodmSubstr11 = eodmSubstr11;
		addValidField("eodmSubstr11");
	}

	/**
	 * Get eodmSubstr12
	 */
	@Column(name = "EODM_SUBSTR12")
	public String getEodmSubstr12() {
		return eodmSubstr12;
	}

	/**
	 * Set eodmSubstr12
	 */
	public void setEodmSubstr12(String eodmSubstr12) {
		this.eodmSubstr12 = eodmSubstr12;
		addValidField("eodmSubstr12");
	}

	/**
	 * Get eodmSubstr13
	 */
	@Column(name = "EODM_SUBSTR13")
	public String getEodmSubstr13() {
		return eodmSubstr13;
	}

	/**
	 * Set eodmSubstr13
	 */
	public void setEodmSubstr13(String eodmSubstr13) {
		this.eodmSubstr13 = eodmSubstr13;
		addValidField("eodmSubstr13");
	}

	/**
	 * Get eodmSubstr14
	 */
	@Column(name = "EODM_SUBSTR14")
	public String getEodmSubstr14() {
		return eodmSubstr14;
	}

	/**
	 * Set eodmSubstr14
	 */
	public void setEodmSubstr14(String eodmSubstr14) {
		this.eodmSubstr14 = eodmSubstr14;
		addValidField("eodmSubstr14");
	}

	/**
	 * Get eodmSubstr15
	 */
	@Column(name = "EODM_SUBSTR15")
	public String getEodmSubstr15() {
		return eodmSubstr15;
	}

	/**
	 * Set eodmSubstr15
	 */
	public void setEodmSubstr15(String eodmSubstr15) {
		this.eodmSubstr15 = eodmSubstr15;
		addValidField("eodmSubstr15");
	}

	/**
	 * Get eodmSubstr16
	 */
	@Column(name = "EODM_SUBSTR16")
	public String getEodmSubstr16() {
		return eodmSubstr16;
	}

	/**
	 * Set eodmSubstr16
	 */
	public void setEodmSubstr16(String eodmSubstr16) {
		this.eodmSubstr16 = eodmSubstr16;
		addValidField("eodmSubstr16");
	}

	/**
	 * Get eodmSubstr17
	 */
	@Column(name = "EODM_SUBSTR17")
	public String getEodmSubstr17() {
		return eodmSubstr17;
	}

	/**
	 * Set eodmSubstr17
	 */
	public void setEodmSubstr17(String eodmSubstr17) {
		this.eodmSubstr17 = eodmSubstr17;
		addValidField("eodmSubstr17");
	}

	/**
	 * Get eodmSubstr18
	 */
	@Column(name = "EODM_SUBSTR18")
	public String getEodmSubstr18() {
		return eodmSubstr18;
	}

	/**
	 * Set eodmSubstr18
	 */
	public void setEodmSubstr18(String eodmSubstr18) {
		this.eodmSubstr18 = eodmSubstr18;
		addValidField("eodmSubstr18");
	}

	/**
	 * Get eodmSubstr19
	 */
	@Column(name = "EODM_SUBSTR19")
	public String getEodmSubstr19() {
		return eodmSubstr19;
	}

	/**
	 * Set eodmSubstr19
	 */
	public void setEodmSubstr19(String eodmSubstr19) {
		this.eodmSubstr19 = eodmSubstr19;
		addValidField("eodmSubstr19");
	}

	/**
	 * Get eodmSubstr20
	 */
	@Column(name = "EODM_SUBSTR20")
	public String getEodmSubstr20() {
		return eodmSubstr20;
	}

	/**
	 * Set eodmSubstr20
	 */
	public void setEodmSubstr20(String eodmSubstr20) {
		this.eodmSubstr20 = eodmSubstr20;
		addValidField("eodmSubstr20");
	}

	/**
	 * Get eodmSubstr21
	 */
	@Column(name = "EODM_SUBSTR21")
	public String getEodmSubstr21() {
		return eodmSubstr21;
	}

	/**
	 * Set eodmSubstr21
	 */
	public void setEodmSubstr21(String eodmSubstr21) {
		this.eodmSubstr21 = eodmSubstr21;
		addValidField("eodmSubstr21");
	}

	/**
	 * Get eodmSubstr22
	 */
	@Column(name = "EODM_SUBSTR22")
	public String getEodmSubstr22() {
		return eodmSubstr22;
	}

	/**
	 * Set eodmSubstr22
	 */
	public void setEodmSubstr22(String eodmSubstr22) {
		this.eodmSubstr22 = eodmSubstr22;
		addValidField("eodmSubstr22");
	}

	/**
	 * Get eodmSubstr23
	 */
	@Column(name = "EODM_SUBSTR23")
	public String getEodmSubstr23() {
		return eodmSubstr23;
	}

	/**
	 * Set eodmSubstr23
	 */
	public void setEodmSubstr23(String eodmSubstr23) {
		this.eodmSubstr23 = eodmSubstr23;
		addValidField("eodmSubstr23");
	}

	/**
	 * Get eodmSubstr24
	 */
	@Column(name = "EODM_SUBSTR24")
	public String getEodmSubstr24() {
		return eodmSubstr24;
	}

	/**
	 * Set eodmSubstr24
	 */
	public void setEodmSubstr24(String eodmSubstr24) {
		this.eodmSubstr24 = eodmSubstr24;
		addValidField("eodmSubstr24");
	}

	/**
	 * Get eodmSubstr25
	 */
	@Column(name = "EODM_SUBSTR25")
	public String getEodmSubstr25() {
		return eodmSubstr25;
	}

	/**
	 * Set eodmSubstr25
	 */
	public void setEodmSubstr25(String eodmSubstr25) {
		this.eodmSubstr25 = eodmSubstr25;
		addValidField("eodmSubstr25");
	}

	/**
	 * Get eodmSubdate1
	 */
	@Column(name = "EODM_SUBDATE1")
	public Date getEodmSubdate1() {
		return eodmSubdate1;
	}

	/**
	 * Set eodmSubdate1
	 */
	public void setEodmSubdate1(Date eodmSubdate1) {
		this.eodmSubdate1 = eodmSubdate1;
		addValidField("eodmSubdate1");
	}

	/**
	 * Get eodmSubdate2
	 */
	@Column(name = "EODM_SUBDATE2")
	public Date getEodmSubdate2() {
		return eodmSubdate2;
	}

	/**
	 * Set eodmSubdate2
	 */
	public void setEodmSubdate2(Date eodmSubdate2) {
		this.eodmSubdate2 = eodmSubdate2;
		addValidField("eodmSubdate2");
	}

	/**
	 * Get eodmSubdate3
	 */
	@Column(name = "EODM_SUBDATE3")
	public Date getEodmSubdate3() {
		return eodmSubdate3;
	}

	/**
	 * Set eodmSubdate3
	 */
	public void setEodmSubdate3(Date eodmSubdate3) {
		this.eodmSubdate3 = eodmSubdate3;
		addValidField("eodmSubdate3");
	}

	/**
	 * Get eodmSubdate4
	 */
	@Column(name = "EODM_SUBDATE4")
	public Date getEodmSubdate4() {
		return eodmSubdate4;
	}

	/**
	 * Set eodmSubdate4
	 */
	public void setEodmSubdate4(Date eodmSubdate4) {
		this.eodmSubdate4 = eodmSubdate4;
		addValidField("eodmSubdate4");
	}

	/**
	 * Get eodmSubdate5
	 */
	@Column(name = "EODM_SUBDATE5")
	public Date getEodmSubdate5() {
		return eodmSubdate5;
	}

	/**
	 * Set eodmSubdate5
	 */
	public void setEodmSubdate5(Date eodmSubdate5) {
		this.eodmSubdate5 = eodmSubdate5;
		addValidField("eodmSubdate5");
	}

	/**
	 * Get eodmSubdate6
	 */
	@Column(name = "EODM_SUBDATE6")
	public Date getEodmSubdate6() {
		return eodmSubdate6;
	}

	/**
	 * Set eodmSubdate6
	 */
	public void setEodmSubdate6(Date eodmSubdate6) {
		this.eodmSubdate6 = eodmSubdate6;
		addValidField("eodmSubdate6");
	}

	/**
	 * Get eodmSubdate7
	 */
	@Column(name = "EODM_SUBDATE7")
	public Date getEodmSubdate7() {
		return eodmSubdate7;
	}

	/**
	 * Set eodmSubdate7
	 */
	public void setEodmSubdate7(Date eodmSubdate7) {
		this.eodmSubdate7 = eodmSubdate7;
		addValidField("eodmSubdate7");
	}

	/**
	 * Get eodmSubdate8
	 */
	@Column(name = "EODM_SUBDATE8")
	public Date getEodmSubdate8() {
		return eodmSubdate8;
	}

	/**
	 * Set eodmSubdate8
	 */
	public void setEodmSubdate8(Date eodmSubdate8) {
		this.eodmSubdate8 = eodmSubdate8;
		addValidField("eodmSubdate8");
	}

	/**
	 * Get eodmSubdate9
	 */
	@Column(name = "EODM_SUBDATE9")
	public Date getEodmSubdate9() {
		return eodmSubdate9;
	}

	/**
	 * Set eodmSubdate9
	 */
	public void setEodmSubdate9(Date eodmSubdate9) {
		this.eodmSubdate9 = eodmSubdate9;
		addValidField("eodmSubdate9");
	}

	/**
	 * Get eodmSubdate10
	 */
	@Column(name = "EODM_SUBDATE10")
	public Date getEodmSubdate10() {
		return eodmSubdate10;
	}

	/**
	 * Set eodmSubdate10
	 */
	public void setEodmSubdate10(Date eodmSubdate10) {
		this.eodmSubdate10 = eodmSubdate10;
		addValidField("eodmSubdate10");
	}

	/**
	 * Get eodmSubnum1
	 */
	@Column(name = "EODM_SUBNUM1")
	public Long getEodmSubnum1() {
		return eodmSubnum1;
	}

	/**
	 * Set eodmSubnum1
	 */
	public void setEodmSubnum1(Long eodmSubnum1) {
		this.eodmSubnum1 = eodmSubnum1;
		addValidField("eodmSubnum1");
	}

	/**
	 * Get eodmSubnum2
	 */
	@Column(name = "EODM_SUBNUM2")
	public Long getEodmSubnum2() {
		return eodmSubnum2;
	}

	/**
	 * Set eodmSubnum2
	 */
	public void setEodmSubnum2(Long eodmSubnum2) {
		this.eodmSubnum2 = eodmSubnum2;
		addValidField("eodmSubnum2");
	}

	/**
	 * Get eodmSubnum3
	 */
	@Column(name = "EODM_SUBNUM3")
	public Long getEodmSubnum3() {
		return eodmSubnum3;
	}

	/**
	 * Set eodmSubnum3
	 */
	public void setEodmSubnum3(Long eodmSubnum3) {
		this.eodmSubnum3 = eodmSubnum3;
		addValidField("eodmSubnum3");
	}

	/**
	 * Get eodmSubnum4
	 */
	@Column(name = "EODM_SUBNUM4")
	public Long getEodmSubnum4() {
		return eodmSubnum4;
	}

	/**
	 * Set eodmSubnum4
	 */
	public void setEodmSubnum4(Long eodmSubnum4) {
		this.eodmSubnum4 = eodmSubnum4;
		addValidField("eodmSubnum4");
	}

	/**
	 * Get eodmSubnum5
	 */
	@Column(name = "EODM_SUBNUM5")
	public Long getEodmSubnum5() {
		return eodmSubnum5;
	}

	/**
	 * Set eodmSubnum5
	 */
	public void setEodmSubnum5(Long eodmSubnum5) {
		this.eodmSubnum5 = eodmSubnum5;
		addValidField("eodmSubnum5");
	}

	/**
	 * Get eodmSubnum6
	 */
	@Column(name = "EODM_SUBNUM6")
	public Long getEodmSubnum6() {
		return eodmSubnum6;
	}

	/**
	 * Set eodmSubnum6
	 */
	public void setEodmSubnum6(Long eodmSubnum6) {
		this.eodmSubnum6 = eodmSubnum6;
		addValidField("eodmSubnum6");
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
	 * Get eodmCustomsPackage
	 */
	@Column(name = "EODM_CUSTOMS_PACKAGE")
	public String getEodmCustomsPackage() {
		return eodmCustomsPackage;
	}

	/**
	 * Set eodmCustomsPackage
	 */
	public void setEodmCustomsPackage(String eodmCustomsPackage) {
		this.eodmCustomsPackage = eodmCustomsPackage;
		addValidField("eodmCustomsPackage");
	}

	/**
	 * Get eodmRecordNumberSeq
	 */
	@Column(name = "EODM_RECORD_NUMBER_SEQ")
	public String getEodmRecordNumberSeq() {
		return eodmRecordNumberSeq;
	}

	/**
	 * Set eodmRecordNumberSeq
	 */
	public void setEodmRecordNumberSeq(String eodmRecordNumberSeq) {
		this.eodmRecordNumberSeq = eodmRecordNumberSeq;
		addValidField("eodmRecordNumberSeq");
	}

	/**
	 * Get eodmCurrencySystem
	 */
	@Column(name = "EODM_CURRENCY_SYSTEM")
	public String getEodmCurrencySystem() {
		return eodmCurrencySystem;
	}

	/**
	 * Set eodmCurrencySystem
	 */
	public void setEodmCurrencySystem(String eodmCurrencySystem) {
		this.eodmCurrencySystem = eodmCurrencySystem;
		addValidField("eodmCurrencySystem");
	}

	/**
	 * Get eodmLevyTaxRelief
	 */
	@Column(name = "EODM_LEVY_TAX_RELIEF")
	public String getEodmLevyTaxRelief() {
		return eodmLevyTaxRelief;
	}

	/**
	 * Set eodmLevyTaxRelief
	 */
	public void setEodmLevyTaxRelief(String eodmLevyTaxRelief) {
		this.eodmLevyTaxRelief = eodmLevyTaxRelief;
		addValidField("eodmLevyTaxRelief");
	}

	/**
	 * Get eodmDestinationCountry
	 */
	@Column(name = "EODM_DESTINATION_COUNTRY")
	public String getEodmDestinationCountry() {
		return eodmDestinationCountry;
	}

	/**
	 * Set eodmDestinationCountry
	 */
	public void setEodmDestinationCountry(String eodmDestinationCountry) {
		this.eodmDestinationCountry = eodmDestinationCountry;
		addValidField("eodmDestinationCountry");
	}

	/**
	 * Get eodmDestinationCountryName
	 */
	@Column(name = "EODM_DESTINATION_COUNTRY_NAME")
	public String getEodmDestinationCountryName() {
		return eodmDestinationCountryName;
	}

	/**
	 * Set eodmDestinationCountryName
	 */
	public void setEodmDestinationCountryName(String eodmDestinationCountryName) {
		this.eodmDestinationCountryName = eodmDestinationCountryName;
		addValidField("eodmDestinationCountryName");
	}

	/**
	 * Get eodmLegalQuantity
	 */
	@Column(name = "EODM_LEGAL_QUANTITY")
	public Long getEodmLegalQuantity() {
		return eodmLegalQuantity;
	}

	/**
	 * Set eodmLegalQuantity
	 */
	public void setEodmLegalQuantity(Long eodmLegalQuantity) {
		this.eodmLegalQuantity = eodmLegalQuantity;
		addValidField("eodmLegalQuantity");
	}

	/**
	 * Get eodmLegalQuantityUnit
	 */
	@Column(name = "EODM_LEGAL_QUANTITY_UNIT")
	public String getEodmLegalQuantityUnit() {
		return eodmLegalQuantityUnit;
	}

	/**
	 * Set eodmLegalQuantityUnit
	 */
	public void setEodmLegalQuantityUnit(String eodmLegalQuantityUnit) {
		this.eodmLegalQuantityUnit = eodmLegalQuantityUnit;
		addValidField("eodmLegalQuantityUnit");
	}

	/**
	 * Get eodmSecondQuantity
	 */
	@Column(name = "EODM_SECOND_QUANTITY")
	public Long getEodmSecondQuantity() {
		return eodmSecondQuantity;
	}

	/**
	 * Set eodmSecondQuantity
	 */
	public void setEodmSecondQuantity(Long eodmSecondQuantity) {
		this.eodmSecondQuantity = eodmSecondQuantity;
		addValidField("eodmSecondQuantity");
	}

	/**
	 * Get eodmSecondQuantityUnit
	 */
	@Column(name = "EODM_SECOND_QUANTITY_UNIT")
	public String getEodmSecondQuantityUnit() {
		return eodmSecondQuantityUnit;
	}

	/**
	 * Set eodmSecondQuantityUnit
	 */
	public void setEodmSecondQuantityUnit(String eodmSecondQuantityUnit) {
		this.eodmSecondQuantityUnit = eodmSecondQuantityUnit;
		addValidField("eodmSecondQuantityUnit");
	}

	/**
	 * Get eodmOriginalPlaceGoods
	 */
	@Column(name = "EODM_ORIGINAL_PLACE_GOODS")
	public String getEodmOriginalPlaceGoods() {
		return eodmOriginalPlaceGoods;
	}

	/**
	 * Set eodmOriginalPlaceGoods
	 */
	public void setEodmOriginalPlaceGoods(String eodmOriginalPlaceGoods) {
		this.eodmOriginalPlaceGoods = eodmOriginalPlaceGoods;
		addValidField("eodmOriginalPlaceGoods");
	}

	/**
	 * Get eodmPurpose
	 */
	@Column(name = "EODM_PURPOSE")
	public String getEodmPurpose() {
		return eodmPurpose;
	}

	/**
	 * Set eodmPurpose
	 */
	public void setEodmPurpose(String eodmPurpose) {
		this.eodmPurpose = eodmPurpose;
		addValidField("eodmPurpose");
	}

	/**
	 * Get eodmInspectionQuarantieCode
	 */
	@Column(name = "EODM_INSPECTION_QUARANTIE_CODE")
	public String getEodmInspectionQuarantieCode() {
		return eodmInspectionQuarantieCode;
	}

	/**
	 * Set eodmInspectionQuarantieCode
	 */
	public void setEodmInspectionQuarantieCode(String eodmInspectionQuarantieCode) {
		this.eodmInspectionQuarantieCode = eodmInspectionQuarantieCode;
		addValidField("eodmInspectionQuarantieCode");
	}

	/**
	 * Get eodmInspectionQuarantieName
	 */
	@Column(name = "EODM_INSPECTION_QUARANTIE_NAME")
	public String getEodmInspectionQuarantieName() {
		return eodmInspectionQuarantieName;
	}

	/**
	 * Set eodmInspectionQuarantieName
	 */
	public void setEodmInspectionQuarantieName(String eodmInspectionQuarantieName) {
		this.eodmInspectionQuarantieName = eodmInspectionQuarantieName;
		addValidField("eodmInspectionQuarantieName");
	}

}
