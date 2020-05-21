package com.sinotrans.oms.fees.model;

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
 * Model class for EfBusinessFees
 */
@Entity
@Table(name = "EF_BUSINESS_FEES")
public class EfBusinessFeesModel extends BaseModel implements OperationLog {

	//efbfId
	private Long efbfId;
	//efbfEscoId
	private Long efbfEscoId;
	//efbfEsdeId
	private Long efbfEsdeId;
	//efbfEsstId
	private Long efbfEsstId;
	//efbfClearEscoId
	private Long efbfClearEscoId;
	//efbfClearEsdeId
	private Long efbfClearEsdeId;
	//efbfClearEsstId
	private Long efbfClearEsstId;
	//efbfSettlementEbcuId
	private Long efbfSettlementEbcuId;
	//efbfSettlementEbcuCdh
	private String efbfSettlementEbcuCdh;
	//efbfSettlementEbcuName
	private String efbfSettlementEbcuName;
	//efbfClearEbcuPId
	private Long efbfClearEbcuPId;
	//efbfEbcuPCdh
	private String efbfEbcuPCdh;
	//efbfClearEbcuPName
	private String efbfClearEbcuPName;
	//efbfClearEbcuRId
	private Long efbfClearEbcuRId;
	//efbfEbcuRCdh
	private String efbfEbcuRCdh;
	//efbfClearEbcuRName
	private String efbfClearEbcuRName;
	//efbfStatus
	private Long efbfStatus;
	//efbfIsEnable
	private Long efbfIsEnable;
	//efbfEoorId
	private Long efbfEoorId;
	//efbfBrId
	private Long efbfBrId;
	//efbfBrTab
	private String efbfBrTab;
	//efbfClass
	private String efbfClass;
	//efbfParentEfbfId
	private Long efbfParentEfbfId;
	//efbfEbfhId
	private Long efbfEbfhId;
	//efbfClearUnit
	private String efbfClearUnit;
	//efbfCurrency
	private String efbfCurrency;
	//efbfType
	private String efbfType;
	//efbfIsPadscost
	private Long efbfIsPadscost;
	//efbfOldAmount
	private Double efbfOldAmount;
	//efbfAmount
	private Double efbfAmount;
	//efbfComfirmDate
	private Date efbfComfirmDate;
	//efbfComfirmUser
	private String efbfComfirmUser;
	//efbfPrice
	private Double efbfPrice;
	//efbfQuantity
	private Long efbfQuantity;
	//efbfProperty
	private Long efbfProperty;
	//efbfFeeSources
	private String efbfFeeSources;
	//efbfFeeEfppId
	private Long efbfFeeEfppId;
	//efbfCalculateType
	private String efbfCalculateType;
	//efbfTaxRate
	private Double efbfTaxRate;
	//efbfTaxAmount
	private Double efbfTaxAmount;
	//efbfTaxFee
	private Double efbfTaxFee;
	//efbfExchangeRate
	private Double efbfExchangeRate;
	//efbfRemark
	private String efbfRemark;
	//efbfInvoiceStatus
	private String efbfInvoiceStatus;
	//efbfInvoiceAmt
	private Double efbfInvoiceAmt;
	//efbfBChargeoff
	private String efbfBChargeoff;
	//efbfBChargeoffAmt
	private Double efbfBChargeoffAmt;
	//efbfFChargeoff
	private String efbfFChargeoff;
	//efbfFChargeoffAmt
	private Double efbfFChargeoffAmt;
	//efbfHdBatchnumber
	private String efbfHdBatchnumber;
	//efbfHdFilename
	private String efbfHdFilename;
	//efbfHdSymbol
	private Long efbfHdSymbol;
	//efbfHdBeginprocessingtime
	private Date efbfHdBeginprocessingtime;
	//efbfHdLastmodifiedtime
	private Date efbfHdLastmodifiedtime;
	//efbfHdInformation
	private String efbfHdInformation;
	//efbfUploadUserId
	private Long efbfUploadUserId;
	//efbfUploadUser
	private String efbfUploadUser;
	//efbfUploadTime
	private Date efbfUploadTime;
	//efbfSubstr1
	private String efbfSubstr1;
	//efbfSubstr2
	private String efbfSubstr2;
	//efbfSubstr3
	private String efbfSubstr3;
	//efbfSubstr4
	private String efbfSubstr4;
	//efbfSubstr5
	private String efbfSubstr5;
	//efbfSubstr6
	private String efbfSubstr6;
	//efbfSubstr7
	private String efbfSubstr7;
	//efbfSubstr8
	private String efbfSubstr8;
	//efbfSubdate1
	private Date efbfSubdate1;
	//efbfSubdate2
	private Date efbfSubdate2;
	//efbfSubdate3
	private Date efbfSubdate3;
	//efbfSubdate4
	private Date efbfSubdate4;
	//efbfSubnum1
	private Long efbfSubnum1;
	//efbfSubnum2
	private Long efbfSubnum2;
	//efbfSubnum3
	private Long efbfSubnum3;
	//efbfSubnum4
	private Long efbfSubnum4;
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
	//efbfComfirmUserId
	private Long efbfComfirmUserId;
	//efbfOppositeEfbfId
	private Long efbfOppositeEfbfId;
	//efbfSubstr9
	private String efbfSubstr9;
	//efbfSubstr10
	private String efbfSubstr10;
	//efbfSubstr11
	private String efbfSubstr11;
	//efbfSubstr12
	private String efbfSubstr12;
	//efbfSubstr13
	private String efbfSubstr13;
	//efbfSubstr14
	private String efbfSubstr14;
	//efbfSubstr15
	private String efbfSubstr15;
	//efbfSubstr16
	private String efbfSubstr16;
	//efbfSubstr17
	private String efbfSubstr17;
	//efbfSubstr18
	private String efbfSubstr18;
	//efbfSubstr19
	private String efbfSubstr19;
	//efbfSubstr20
	private String efbfSubstr20;
	//efbfSourceId
	private String efbfSourceId;
	//eiepRpStatus
//	private String eiepRpStatus;
//	//eiepEsusUserNameCn
//	private String eiepEsusUserNameCn;
//	//eiepTime
//	private String eiepTime;
	//efbfSettlementInformation
	private String efbfSettlementInformation;
	//efbfBmsUploadTime
	private Date efbfBmsUploadTime;
	
	private Long ebfhIsDutyfree;
	
	
	public Long getEbfhIsDutyfree() {
		return ebfhIsDutyfree;
	}

	public void setEbfhIsDutyfree(Long ebfhIsDutyfree) {
		this.ebfhIsDutyfree = ebfhIsDutyfree;
	}

	/**
	 * Get efbfId
	 */
	@Column(name = "EFBF_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEfbfId() {
		return efbfId;
	}

	/**
	 * Set efbfId
	 */
	public void setEfbfId(Long efbfId) {
		this.efbfId = efbfId;
		addValidField("efbfId");
	}

	/**
	 * Get efbfEscoId
	 */
	@Column(name = "EFBF_ESCO_ID")
	public Long getEfbfEscoId() {
		return efbfEscoId;
	}

	/**
	 * Set efbfEscoId
	 */
	public void setEfbfEscoId(Long efbfEscoId) {
		this.efbfEscoId = efbfEscoId;
		addValidField("efbfEscoId");
	}

	/**
	 * Get efbfEsdeId
	 */
	@Column(name = "EFBF_ESDE_ID")
	public Long getEfbfEsdeId() {
		return efbfEsdeId;
	}

	/**
	 * Set efbfEsdeId
	 */
	public void setEfbfEsdeId(Long efbfEsdeId) {
		this.efbfEsdeId = efbfEsdeId;
		addValidField("efbfEsdeId");
	}

	/**
	 * Get efbfEsstId
	 */
	@Column(name = "EFBF_ESST_ID")
	public Long getEfbfEsstId() {
		return efbfEsstId;
	}

	/**
	 * Set efbfEsstId
	 */
	public void setEfbfEsstId(Long efbfEsstId) {
		this.efbfEsstId = efbfEsstId;
		addValidField("efbfEsstId");
	}

	/**
	 * Get efbfClearEscoId
	 */
	@Column(name = "EFBF_CLEAR_ESCO_ID")
	public Long getEfbfClearEscoId() {
		return efbfClearEscoId;
	}

	/**
	 * Set efbfClearEscoId
	 */
	public void setEfbfClearEscoId(Long efbfClearEscoId) {
		this.efbfClearEscoId = efbfClearEscoId;
		addValidField("efbfClearEscoId");
	}

	/**
	 * Get efbfClearEsdeId
	 */
	@Column(name = "EFBF_CLEAR_ESDE_ID")
	public Long getEfbfClearEsdeId() {
		return efbfClearEsdeId;
	}

	/**
	 * Set efbfClearEsdeId
	 */
	public void setEfbfClearEsdeId(Long efbfClearEsdeId) {
		this.efbfClearEsdeId = efbfClearEsdeId;
		addValidField("efbfClearEsdeId");
	}

	/**
	 * Get efbfClearEsstId
	 */
	@Column(name = "EFBF_CLEAR_ESST_ID")
	public Long getEfbfClearEsstId() {
		return efbfClearEsstId;
	}

	/**
	 * Set efbfClearEsstId
	 */
	public void setEfbfClearEsstId(Long efbfClearEsstId) {
		this.efbfClearEsstId = efbfClearEsstId;
		addValidField("efbfClearEsstId");
	}

	/**
	 * Get efbfSettlementEbcuId
	 */
	@Column(name = "EFBF_SETTLEMENT_EBCU_ID")
	public Long getEfbfSettlementEbcuId() {
		return efbfSettlementEbcuId;
	}

	/**
	 * Set efbfSettlementEbcuId
	 */
	public void setEfbfSettlementEbcuId(Long efbfSettlementEbcuId) {
		this.efbfSettlementEbcuId = efbfSettlementEbcuId;
		addValidField("efbfSettlementEbcuId");
	}

	/**
	 * Get efbfSettlementEbcuCdh
	 */
	@Column(name = "EFBF_SETTLEMENT_EBCU_CDH")
	public String getEfbfSettlementEbcuCdh() {
		return efbfSettlementEbcuCdh;
	}

	/**
	 * Set efbfSettlementEbcuCdh
	 */
	public void setEfbfSettlementEbcuCdh(String efbfSettlementEbcuCdh) {
		this.efbfSettlementEbcuCdh = efbfSettlementEbcuCdh;
		addValidField("efbfSettlementEbcuCdh");
	}

	/**
	 * Get efbfSettlementEbcuName
	 */
	@Column(name = "EFBF_SETTLEMENT_EBCU_NAME")
	public String getEfbfSettlementEbcuName() {
		return efbfSettlementEbcuName;
	}

	/**
	 * Set efbfSettlementEbcuName
	 */
	public void setEfbfSettlementEbcuName(String efbfSettlementEbcuName) {
		this.efbfSettlementEbcuName = efbfSettlementEbcuName;
		addValidField("efbfSettlementEbcuName");
	}

	/**
	 * Get efbfClearEbcuPId
	 */
	@Column(name = "EFBF_CLEAR_EBCU_P_ID")
	public Long getEfbfClearEbcuPId() {
		return efbfClearEbcuPId;
	}

	/**
	 * Set efbfClearEbcuPId
	 */
	public void setEfbfClearEbcuPId(Long efbfClearEbcuPId) {
		this.efbfClearEbcuPId = efbfClearEbcuPId;
		addValidField("efbfClearEbcuPId");
	}

	/**
	 * Get efbfEbcuPCdh
	 */
	@Column(name = "EFBF_EBCU_P_CDH")
	public String getEfbfEbcuPCdh() {
		return efbfEbcuPCdh;
	}

	/**
	 * Set efbfEbcuPCdh
	 */
	public void setEfbfEbcuPCdh(String efbfEbcuPCdh) {
		this.efbfEbcuPCdh = efbfEbcuPCdh;
		addValidField("efbfEbcuPCdh");
	}

	/**
	 * Get efbfClearEbcuPName
	 */
	@Column(name = "EFBF_CLEAR_EBCU_P_NAME")
	public String getEfbfClearEbcuPName() {
		return efbfClearEbcuPName;
	}

	/**
	 * Set efbfClearEbcuPName
	 */
	public void setEfbfClearEbcuPName(String efbfClearEbcuPName) {
		this.efbfClearEbcuPName = efbfClearEbcuPName;
		addValidField("efbfClearEbcuPName");
	}

	/**
	 * Get efbfClearEbcuRId
	 */
	@Column(name = "EFBF_CLEAR_EBCU_R_ID")
	public Long getEfbfClearEbcuRId() {
		return efbfClearEbcuRId;
	}

	/**
	 * Set efbfClearEbcuRId
	 */
	public void setEfbfClearEbcuRId(Long efbfClearEbcuRId) {
		this.efbfClearEbcuRId = efbfClearEbcuRId;
		addValidField("efbfClearEbcuRId");
	}

	/**
	 * Get efbfEbcuRCdh
	 */
	@Column(name = "EFBF_EBCU_R_CDH")
	public String getEfbfEbcuRCdh() {
		return efbfEbcuRCdh;
	}

	/**
	 * Set efbfEbcuRCdh
	 */
	public void setEfbfEbcuRCdh(String efbfEbcuRCdh) {
		this.efbfEbcuRCdh = efbfEbcuRCdh;
		addValidField("efbfEbcuRCdh");
	}

	/**
	 * Get efbfClearEbcuRName
	 */
	@Column(name = "EFBF_CLEAR_EBCU_R_NAME")
	public String getEfbfClearEbcuRName() {
		return efbfClearEbcuRName;
	}

	/**
	 * Set efbfClearEbcuRName
	 */
	public void setEfbfClearEbcuRName(String efbfClearEbcuRName) {
		this.efbfClearEbcuRName = efbfClearEbcuRName;
		addValidField("efbfClearEbcuRName");
	}

	/**
	 * Get efbfStatus
	 */
	@Column(name = "EFBF_STATUS")
	public Long getEfbfStatus() {
		return efbfStatus;
	}

	/**
	 * Set efbfStatus
	 */
	public void setEfbfStatus(Long efbfStatus) {
		this.efbfStatus = efbfStatus;
		addValidField("efbfStatus");
	}

	/**
	 * Get efbfIsEnable
	 */
	@Column(name = "EFBF_IS_ENABLE")
	public Long getEfbfIsEnable() {
		return efbfIsEnable;
	}

	/**
	 * Set efbfIsEnable
	 */
	public void setEfbfIsEnable(Long efbfIsEnable) {
		this.efbfIsEnable = efbfIsEnable;
		addValidField("efbfIsEnable");
	}

	/**
	 * Get efbfEoorId
	 */
	@Column(name = "EFBF_EOOR_ID")
	public Long getEfbfEoorId() {
		return efbfEoorId;
	}

	/**
	 * Set efbfEoorId
	 */
	public void setEfbfEoorId(Long efbfEoorId) {
		this.efbfEoorId = efbfEoorId;
		addValidField("efbfEoorId");
	}

	/**
	 * Get efbfBrId
	 */
	@Column(name = "EFBF_BR_ID")
	public Long getEfbfBrId() {
		return efbfBrId;
	}

	/**
	 * Set efbfBrId
	 */
	public void setEfbfBrId(Long efbfBrId) {
		this.efbfBrId = efbfBrId;
		addValidField("efbfBrId");
	}

	/**
	 * Get efbfBrTab
	 */
	@Column(name = "EFBF_BR_TAB")
	public String getEfbfBrTab() {
		return efbfBrTab;
	}

	/**
	 * Set efbfBrTab
	 */
	public void setEfbfBrTab(String efbfBrTab) {
		this.efbfBrTab = efbfBrTab;
		addValidField("efbfBrTab");
	}

	/**
	 * Get efbfClass
	 */
	@Column(name = "EFBF_CLASS")
	public String getEfbfClass() {
		return efbfClass;
	}

	/**
	 * Set efbfClass
	 */
	public void setEfbfClass(String efbfClass) {
		this.efbfClass = efbfClass;
		addValidField("efbfClass");
	}

	/**
	 * Get efbfParentEfbfId
	 */
	@Column(name = "EFBF_PARENT_EFBF_ID")
	public Long getEfbfParentEfbfId() {
		return efbfParentEfbfId;
	}

	/**
	 * Set efbfParentEfbfId
	 */
	public void setEfbfParentEfbfId(Long efbfParentEfbfId) {
		this.efbfParentEfbfId = efbfParentEfbfId;
		addValidField("efbfParentEfbfId");
	}

	/**
	 * Get efbfEbfhId
	 */
	@Column(name = "EFBF_EBFH_ID")
	public Long getEfbfEbfhId() {
		return efbfEbfhId;
	}

	/**
	 * Set efbfEbfhId
	 */
	public void setEfbfEbfhId(Long efbfEbfhId) {
		this.efbfEbfhId = efbfEbfhId;
		addValidField("efbfEbfhId");
	}

	/**
	 * Get efbfClearUnit
	 */
	@Column(name = "EFBF_CLEAR_UNIT")
	public String getEfbfClearUnit() {
		return efbfClearUnit;
	}

	/**
	 * Set efbfClearUnit
	 */
	public void setEfbfClearUnit(String efbfClearUnit) {
		this.efbfClearUnit = efbfClearUnit;
		addValidField("efbfClearUnit");
	}

	/**
	 * Get efbfCurrency
	 */
	@Column(name = "EFBF_CURRENCY")
	public String getEfbfCurrency() {
		return efbfCurrency;
	}

	/**
	 * Set efbfCurrency
	 */
	public void setEfbfCurrency(String efbfCurrency) {
		this.efbfCurrency = efbfCurrency;
		addValidField("efbfCurrency");
	}

	/**
	 * Get efbfType
	 */
	@Column(name = "EFBF_TYPE")
	public String getEfbfType() {
		return efbfType;
	}

	/**
	 * Set efbfType
	 */
	public void setEfbfType(String efbfType) {
		this.efbfType = efbfType;
		addValidField("efbfType");
	}

	/**
	 * Get efbfIsPadscost
	 */
	@Column(name = "EFBF_IS_PADSCOST")
	public Long getEfbfIsPadscost() {
		return efbfIsPadscost;
	}

	/**
	 * Set efbfIsPadscost
	 */
	public void setEfbfIsPadscost(Long efbfIsPadscost) {
		this.efbfIsPadscost = efbfIsPadscost;
		addValidField("efbfIsPadscost");
	}

	/**
	 * Get efbfOldAmount
	 */
	@Column(name = "EFBF_OLD_AMOUNT")
	public Double getEfbfOldAmount() {
		return efbfOldAmount;
	}

	/**
	 * Set efbfOldAmount
	 */
	public void setEfbfOldAmount(Double efbfOldAmount) {
		this.efbfOldAmount = efbfOldAmount;
		addValidField("efbfOldAmount");
	}

	/**
	 * Get efbfAmount
	 */
	@Column(name = "EFBF_AMOUNT")
	public Double getEfbfAmount() {
		return efbfAmount;
	}

	/**
	 * Set efbfAmount
	 */
	public void setEfbfAmount(Double efbfAmount) {
		this.efbfAmount = efbfAmount;
		addValidField("efbfAmount");
	}

	/**
	 * Get efbfComfirmDate
	 */
	@Column(name = "EFBF_COMFIRM_DATE")
	public Date getEfbfComfirmDate() {
		return efbfComfirmDate;
	}

	/**
	 * Set efbfComfirmDate
	 */
	public void setEfbfComfirmDate(Date efbfComfirmDate) {
		this.efbfComfirmDate = efbfComfirmDate;
		addValidField("efbfComfirmDate");
	}

	/**
	 * Get efbfComfirmUser
	 */
	@Column(name = "EFBF_COMFIRM_USER")
	public String getEfbfComfirmUser() {
		return efbfComfirmUser;
	}

	/**
	 * Set efbfComfirmUser
	 */
	public void setEfbfComfirmUser(String efbfComfirmUser) {
		this.efbfComfirmUser = efbfComfirmUser;
		addValidField("efbfComfirmUser");
	}

	/**
	 * Get efbfPrice
	 */
	@Column(name = "EFBF_PRICE")
	public Double getEfbfPrice() {
		return efbfPrice;
	}

	/**
	 * Set efbfPrice
	 */
	public void setEfbfPrice(Double efbfPrice) {
		this.efbfPrice = efbfPrice;
		addValidField("efbfPrice");
	}

	/**
	 * Get efbfQuantity
	 */
	@Column(name = "EFBF_QUANTITY")
	public Long getEfbfQuantity() {
		return efbfQuantity;
	}

	/**
	 * Set efbfQuantity
	 */
	public void setEfbfQuantity(Long efbfQuantity) {
		this.efbfQuantity = efbfQuantity;
		addValidField("efbfQuantity");
	}

	/**
	 * Get efbfProperty
	 */
	@Column(name = "EFBF_PROPERTY")
	public Long getEfbfProperty() {
		return efbfProperty;
	}

	/**
	 * Set efbfProperty
	 */
	public void setEfbfProperty(Long efbfProperty) {
		this.efbfProperty = efbfProperty;
		addValidField("efbfProperty");
	}

	/**
	 * Get efbfFeeSources
	 */
	@Column(name = "EFBF_FEE_SOURCES")
	public String getEfbfFeeSources() {
		return efbfFeeSources;
	}

	/**
	 * Set efbfFeeSources
	 */
	public void setEfbfFeeSources(String efbfFeeSources) {
		this.efbfFeeSources = efbfFeeSources;
		addValidField("efbfFeeSources");
	}

	/**
	 * Get efbfFeeEfppId
	 */
	@Column(name = "EFBF_FEE_EFPP_ID")
	public Long getEfbfFeeEfppId() {
		return efbfFeeEfppId;
	}

	/**
	 * Set efbfFeeEfppId
	 */
	public void setEfbfFeeEfppId(Long efbfFeeEfppId) {
		this.efbfFeeEfppId = efbfFeeEfppId;
		addValidField("efbfFeeEfppId");
	}

	/**
	 * Get efbfCalculateType
	 */
	@Column(name = "EFBF_CALCULATE_TYPE")
	public String getEfbfCalculateType() {
		return efbfCalculateType;
	}

	/**
	 * Set efbfCalculateType
	 */
	public void setEfbfCalculateType(String efbfCalculateType) {
		this.efbfCalculateType = efbfCalculateType;
		addValidField("efbfCalculateType");
	}

	/**
	 * Get efbfTaxRate
	 */
	@Column(name = "EFBF_TAX_RATE")
	public Double getEfbfTaxRate() {
		return efbfTaxRate;
	}

	/**
	 * Set efbfTaxRate
	 */
	public void setEfbfTaxRate(Double efbfTaxRate) {
		this.efbfTaxRate = efbfTaxRate;
		addValidField("efbfTaxRate");
	}

	/**
	 * Get efbfTaxAmount
	 */
	@Column(name = "EFBF_TAX_AMOUNT")
	public Double getEfbfTaxAmount() {
		return efbfTaxAmount;
	}

	/**
	 * Set efbfTaxAmount
	 */
	public void setEfbfTaxAmount(Double efbfTaxAmount) {
		this.efbfTaxAmount = efbfTaxAmount;
		addValidField("efbfTaxAmount");
	}

	/**
	 * Get efbfTaxFee
	 */
	@Column(name = "EFBF_TAX_FEE")
	public Double getEfbfTaxFee() {
		return efbfTaxFee;
	}

	/**
	 * Set efbfTaxFee
	 */
	public void setEfbfTaxFee(Double efbfTaxFee) {
		this.efbfTaxFee = efbfTaxFee;
		addValidField("efbfTaxFee");
	}

	/**
	 * Get efbfExchangeRate
	 */
	@Column(name = "EFBF_EXCHANGE_RATE")
	public Double getEfbfExchangeRate() {
		return efbfExchangeRate;
	}

	/**
	 * Set efbfExchangeRate
	 */
	public void setEfbfExchangeRate(Double efbfExchangeRate) {
		this.efbfExchangeRate = efbfExchangeRate;
		addValidField("efbfExchangeRate");
	}

	/**
	 * Get efbfRemark
	 */
	@Column(name = "EFBF_REMARK")
	public String getEfbfRemark() {
		return efbfRemark;
	}

	/**
	 * Set efbfRemark
	 */
	public void setEfbfRemark(String efbfRemark) {
		this.efbfRemark = efbfRemark;
		addValidField("efbfRemark");
	}

	/**
	 * Get efbfInvoiceStatus
	 */
	@Column(name = "EFBF_INVOICE_STATUS")
	public String getEfbfInvoiceStatus() {
		return efbfInvoiceStatus;
	}

	/**
	 * Set efbfInvoiceStatus
	 */
	public void setEfbfInvoiceStatus(String efbfInvoiceStatus) {
		this.efbfInvoiceStatus = efbfInvoiceStatus;
		addValidField("efbfInvoiceStatus");
	}

	/**
	 * Get efbfInvoiceAmt
	 */
	@Column(name = "EFBF_INVOICE_AMT")
	public Double getEfbfInvoiceAmt() {
		return efbfInvoiceAmt;
	}

	/**
	 * Set efbfInvoiceAmt
	 */
	public void setEfbfInvoiceAmt(Double efbfInvoiceAmt) {
		this.efbfInvoiceAmt = efbfInvoiceAmt;
		addValidField("efbfInvoiceAmt");
	}

	/**
	 * Get efbfBChargeoff
	 */
	@Column(name = "EFBF_B_CHARGEOFF")
	public String getEfbfBChargeoff() {
		return efbfBChargeoff;
	}

	/**
	 * Set efbfBChargeoff
	 */
	public void setEfbfBChargeoff(String efbfBChargeoff) {
		this.efbfBChargeoff = efbfBChargeoff;
		addValidField("efbfBChargeoff");
	}

	/**
	 * Get efbfBChargeoffAmt
	 */
	@Column(name = "EFBF_B_CHARGEOFF_AMT")
	public Double getEfbfBChargeoffAmt() {
		return efbfBChargeoffAmt;
	}

	/**
	 * Set efbfBChargeoffAmt
	 */
	public void setEfbfBChargeoffAmt(Double efbfBChargeoffAmt) {
		this.efbfBChargeoffAmt = efbfBChargeoffAmt;
		addValidField("efbfBChargeoffAmt");
	}

	/**
	 * Get efbfFChargeoff
	 */
	@Column(name = "EFBF_F_CHARGEOFF")
	public String getEfbfFChargeoff() {
		return efbfFChargeoff;
	}

	/**
	 * Set efbfFChargeoff
	 */
	public void setEfbfFChargeoff(String efbfFChargeoff) {
		this.efbfFChargeoff = efbfFChargeoff;
		addValidField("efbfFChargeoff");
	}

	/**
	 * Get efbfFChargeoffAmt
	 */
	@Column(name = "EFBF_F_CHARGEOFF_AMT")
	public Double getEfbfFChargeoffAmt() {
		return efbfFChargeoffAmt;
	}

	/**
	 * Set efbfFChargeoffAmt
	 */
	public void setEfbfFChargeoffAmt(Double efbfFChargeoffAmt) {
		this.efbfFChargeoffAmt = efbfFChargeoffAmt;
		addValidField("efbfFChargeoffAmt");
	}

	/**
	 * Get efbfHdBatchnumber
	 */
	@Column(name = "EFBF_HD_BATCHNUMBER")
	public String getEfbfHdBatchnumber() {
		return efbfHdBatchnumber;
	}

	/**
	 * Set efbfHdBatchnumber
	 */
	public void setEfbfHdBatchnumber(String efbfHdBatchnumber) {
		this.efbfHdBatchnumber = efbfHdBatchnumber;
		addValidField("efbfHdBatchnumber");
	}

	/**
	 * Get efbfHdFilename
	 */
	@Column(name = "EFBF_HD_FILENAME")
	public String getEfbfHdFilename() {
		return efbfHdFilename;
	}

	/**
	 * Set efbfHdFilename
	 */
	public void setEfbfHdFilename(String efbfHdFilename) {
		this.efbfHdFilename = efbfHdFilename;
		addValidField("efbfHdFilename");
	}

	/**
	 * Get efbfHdSymbol
	 */
	@Column(name = "EFBF_HD_SYMBOL")
	public Long getEfbfHdSymbol() {
		return efbfHdSymbol;
	}

	/**
	 * Set efbfHdSymbol
	 */
	public void setEfbfHdSymbol(Long efbfHdSymbol) {
		this.efbfHdSymbol = efbfHdSymbol;
		addValidField("efbfHdSymbol");
	}

	/**
	 * Get efbfHdBeginprocessingtime
	 */
	@Column(name = "EFBF_HD_BEGINPROCESSINGTIME")
	public Date getEfbfHdBeginprocessingtime() {
		return efbfHdBeginprocessingtime;
	}

	/**
	 * Set efbfHdBeginprocessingtime
	 */
	public void setEfbfHdBeginprocessingtime(Date efbfHdBeginprocessingtime) {
		this.efbfHdBeginprocessingtime = efbfHdBeginprocessingtime;
		addValidField("efbfHdBeginprocessingtime");
	}

	/**
	 * Get efbfHdLastmodifiedtime
	 */
	@Column(name = "EFBF_HD_LASTMODIFIEDTIME")
	public Date getEfbfHdLastmodifiedtime() {
		return efbfHdLastmodifiedtime;
	}

	/**
	 * Set efbfHdLastmodifiedtime
	 */
	public void setEfbfHdLastmodifiedtime(Date efbfHdLastmodifiedtime) {
		this.efbfHdLastmodifiedtime = efbfHdLastmodifiedtime;
		addValidField("efbfHdLastmodifiedtime");
	}

	/**
	 * Get efbfHdInformation
	 */
	@Column(name = "EFBF_HD_INFORMATION")
	public String getEfbfHdInformation() {
		return efbfHdInformation;
	}

	/**
	 * Set efbfHdInformation
	 */
	public void setEfbfHdInformation(String efbfHdInformation) {
		this.efbfHdInformation = efbfHdInformation;
		addValidField("efbfHdInformation");
	}

	/**
	 * Get efbfUploadUserId
	 */
	@Column(name = "EFBF_UPLOAD_USER_ID")
	public Long getEfbfUploadUserId() {
		return efbfUploadUserId;
	}

	/**
	 * Set efbfUploadUserId
	 */
	public void setEfbfUploadUserId(Long efbfUploadUserId) {
		this.efbfUploadUserId = efbfUploadUserId;
		addValidField("efbfUploadUserId");
	}

	/**
	 * Get efbfUploadUser
	 */
	@Column(name = "EFBF_UPLOAD_USER")
	public String getEfbfUploadUser() {
		return efbfUploadUser;
	}

	/**
	 * Set efbfUploadUser
	 */
	public void setEfbfUploadUser(String efbfUploadUser) {
		this.efbfUploadUser = efbfUploadUser;
		addValidField("efbfUploadUser");
	}

	/**
	 * Get efbfUploadTime
	 */
	@Column(name = "EFBF_UPLOAD_TIME")
	public Date getEfbfUploadTime() {
		return efbfUploadTime;
	}

	/**
	 * Set efbfUploadTime
	 */
	public void setEfbfUploadTime(Date efbfUploadTime) {
		this.efbfUploadTime = efbfUploadTime;
		addValidField("efbfUploadTime");
	}

	/**
	 * Get efbfSubstr1
	 */
	@Column(name = "EFBF_SUBSTR1")
	public String getEfbfSubstr1() {
		return efbfSubstr1;
	}

	/**
	 * Set efbfSubstr1
	 */
	public void setEfbfSubstr1(String efbfSubstr1) {
		this.efbfSubstr1 = efbfSubstr1;
		addValidField("efbfSubstr1");
	}

	/**
	 * Get efbfSubstr2
	 */
	@Column(name = "EFBF_SUBSTR2")
	public String getEfbfSubstr2() {
		return efbfSubstr2;
	}

	/**
	 * Set efbfSubstr2
	 */
	public void setEfbfSubstr2(String efbfSubstr2) {
		this.efbfSubstr2 = efbfSubstr2;
		addValidField("efbfSubstr2");
	}

	/**
	 * Get efbfSubstr3
	 */
	@Column(name = "EFBF_SUBSTR3")
	public String getEfbfSubstr3() {
		return efbfSubstr3;
	}

	/**
	 * Set efbfSubstr3
	 */
	public void setEfbfSubstr3(String efbfSubstr3) {
		this.efbfSubstr3 = efbfSubstr3;
		addValidField("efbfSubstr3");
	}

	/**
	 * Get efbfSubstr4
	 */
	@Column(name = "EFBF_SUBSTR4")
	public String getEfbfSubstr4() {
		return efbfSubstr4;
	}

	/**
	 * Set efbfSubstr4
	 */
	public void setEfbfSubstr4(String efbfSubstr4) {
		this.efbfSubstr4 = efbfSubstr4;
		addValidField("efbfSubstr4");
	}

	/**
	 * Get efbfSubstr5
	 */
	@Column(name = "EFBF_SUBSTR5")
	public String getEfbfSubstr5() {
		return efbfSubstr5;
	}

	/**
	 * Set efbfSubstr5
	 */
	public void setEfbfSubstr5(String efbfSubstr5) {
		this.efbfSubstr5 = efbfSubstr5;
		addValidField("efbfSubstr5");
	}

	/**
	 * Get efbfSubstr6
	 */
	@Column(name = "EFBF_SUBSTR6")
	public String getEfbfSubstr6() {
		return efbfSubstr6;
	}

	/**
	 * Set efbfSubstr6
	 */
	public void setEfbfSubstr6(String efbfSubstr6) {
		this.efbfSubstr6 = efbfSubstr6;
		addValidField("efbfSubstr6");
	}

	/**
	 * Get efbfSubstr7
	 */
	@Column(name = "EFBF_SUBSTR7")
	public String getEfbfSubstr7() {
		return efbfSubstr7;
	}

	/**
	 * Set efbfSubstr7
	 */
	public void setEfbfSubstr7(String efbfSubstr7) {
		this.efbfSubstr7 = efbfSubstr7;
		addValidField("efbfSubstr7");
	}

	/**
	 * Get efbfSubstr8
	 */
	@Column(name = "EFBF_SUBSTR8")
	public String getEfbfSubstr8() {
		return efbfSubstr8;
	}

	/**
	 * Set efbfSubstr8
	 */
	public void setEfbfSubstr8(String efbfSubstr8) {
		this.efbfSubstr8 = efbfSubstr8;
		addValidField("efbfSubstr8");
	}

	/**
	 * Get efbfSubdate1
	 */
	@Column(name = "EFBF_SUBDATE1")
	public Date getEfbfSubdate1() {
		return efbfSubdate1;
	}

	/**
	 * Set efbfSubdate1
	 */
	public void setEfbfSubdate1(Date efbfSubdate1) {
		this.efbfSubdate1 = efbfSubdate1;
		addValidField("efbfSubdate1");
	}

	/**
	 * Get efbfSubdate2
	 */
	@Column(name = "EFBF_SUBDATE2")
	public Date getEfbfSubdate2() {
		return efbfSubdate2;
	}

	/**
	 * Set efbfSubdate2
	 */
	public void setEfbfSubdate2(Date efbfSubdate2) {
		this.efbfSubdate2 = efbfSubdate2;
		addValidField("efbfSubdate2");
	}

	/**
	 * Get efbfSubdate3
	 */
	@Column(name = "EFBF_SUBDATE3")
	public Date getEfbfSubdate3() {
		return efbfSubdate3;
	}

	/**
	 * Set efbfSubdate3
	 */
	public void setEfbfSubdate3(Date efbfSubdate3) {
		this.efbfSubdate3 = efbfSubdate3;
		addValidField("efbfSubdate3");
	}

	/**
	 * Get efbfSubdate4
	 */
	@Column(name = "EFBF_SUBDATE4")
	public Date getEfbfSubdate4() {
		return efbfSubdate4;
	}

	/**
	 * Set efbfSubdate4
	 */
	public void setEfbfSubdate4(Date efbfSubdate4) {
		this.efbfSubdate4 = efbfSubdate4;
		addValidField("efbfSubdate4");
	}

	/**
	 * Get efbfSubnum1
	 */
	@Column(name = "EFBF_SUBNUM1")
	public Long getEfbfSubnum1() {
		return efbfSubnum1;
	}

	/**
	 * Set efbfSubnum1
	 */
	public void setEfbfSubnum1(Long efbfSubnum1) {
		this.efbfSubnum1 = efbfSubnum1;
		addValidField("efbfSubnum1");
	}

	/**
	 * Get efbfSubnum2
	 */
	@Column(name = "EFBF_SUBNUM2")
	public Long getEfbfSubnum2() {
		return efbfSubnum2;
	}

	/**
	 * Set efbfSubnum2
	 */
	public void setEfbfSubnum2(Long efbfSubnum2) {
		this.efbfSubnum2 = efbfSubnum2;
		addValidField("efbfSubnum2");
	}

	/**
	 * Get efbfSubnum3
	 */
	@Column(name = "EFBF_SUBNUM3")
	public Long getEfbfSubnum3() {
		return efbfSubnum3;
	}

	/**
	 * Set efbfSubnum3
	 */
	public void setEfbfSubnum3(Long efbfSubnum3) {
		this.efbfSubnum3 = efbfSubnum3;
		addValidField("efbfSubnum3");
	}

	/**
	 * Get efbfSubnum4
	 */
	@Column(name = "EFBF_SUBNUM4")
	public Long getEfbfSubnum4() {
		return efbfSubnum4;
	}

	/**
	 * Set efbfSubnum4
	 */
	public void setEfbfSubnum4(Long efbfSubnum4) {
		this.efbfSubnum4 = efbfSubnum4;
		addValidField("efbfSubnum4");
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
	 * Get efbfComfirmUserId
	 */
	@Column(name = "EFBF_COMFIRM_USER_ID")
	public Long getEfbfComfirmUserId() {
		return efbfComfirmUserId;
	}

	/**
	 * Set efbfComfirmUserId
	 */
	public void setEfbfComfirmUserId(Long efbfComfirmUserId) {
		this.efbfComfirmUserId = efbfComfirmUserId;
		addValidField("efbfComfirmUserId");
	}

	/**
	 * Get efbfOppositeEfbfId
	 */
	@Column(name = "EFBF_OPPOSITE_EFBF_ID")
	public Long getEfbfOppositeEfbfId() {
		return efbfOppositeEfbfId;
	}

	/**
	 * Set efbfOppositeEfbfId
	 */
	public void setEfbfOppositeEfbfId(Long efbfOppositeEfbfId) {
		this.efbfOppositeEfbfId = efbfOppositeEfbfId;
		addValidField("efbfOppositeEfbfId");
	}

	/**
	 * Get efbfSubstr9
	 */
	@Column(name = "EFBF_SUBSTR9")
	public String getEfbfSubstr9() {
		return efbfSubstr9;
	}

	/**
	 * Set efbfSubstr9
	 */
	public void setEfbfSubstr9(String efbfSubstr9) {
		this.efbfSubstr9 = efbfSubstr9;
		addValidField("efbfSubstr9");
	}

	/**
	 * Get efbfSubstr10
	 */
	@Column(name = "EFBF_SUBSTR10")
	public String getEfbfSubstr10() {
		return efbfSubstr10;
	}

	/**
	 * Set efbfSubstr10
	 */
	public void setEfbfSubstr10(String efbfSubstr10) {
		this.efbfSubstr10 = efbfSubstr10;
		addValidField("efbfSubstr10");
	}

	/**
	 * Get efbfSubstr11
	 */
	@Column(name = "EFBF_SUBSTR11")
	public String getEfbfSubstr11() {
		return efbfSubstr11;
	}

	/**
	 * Set efbfSubstr11
	 */
	public void setEfbfSubstr11(String efbfSubstr11) {
		this.efbfSubstr11 = efbfSubstr11;
		addValidField("efbfSubstr11");
	}

	/**
	 * Get efbfSubstr12
	 */
	@Column(name = "EFBF_SUBSTR12")
	public String getEfbfSubstr12() {
		return efbfSubstr12;
	}

	/**
	 * Set efbfSubstr12
	 */
	public void setEfbfSubstr12(String efbfSubstr12) {
		this.efbfSubstr12 = efbfSubstr12;
		addValidField("efbfSubstr12");
	}

	/**
	 * Get efbfSubstr13
	 */
	@Column(name = "EFBF_SUBSTR13")
	public String getEfbfSubstr13() {
		return efbfSubstr13;
	}

	/**
	 * Set efbfSubstr13
	 */
	public void setEfbfSubstr13(String efbfSubstr13) {
		this.efbfSubstr13 = efbfSubstr13;
		addValidField("efbfSubstr13");
	}

	/**
	 * Get efbfSubstr14
	 */
	@Column(name = "EFBF_SUBSTR14")
	public String getEfbfSubstr14() {
		return efbfSubstr14;
	}

	/**
	 * Set efbfSubstr14
	 */
	public void setEfbfSubstr14(String efbfSubstr14) {
		this.efbfSubstr14 = efbfSubstr14;
		addValidField("efbfSubstr14");
	}

	/**
	 * Get efbfSubstr15
	 */
	@Column(name = "EFBF_SUBSTR15")
	public String getEfbfSubstr15() {
		return efbfSubstr15;
	}

	/**
	 * Set efbfSubstr15
	 */
	public void setEfbfSubstr15(String efbfSubstr15) {
		this.efbfSubstr15 = efbfSubstr15;
		addValidField("efbfSubstr15");
	}

	/**
	 * Get efbfSubstr16
	 */
	@Column(name = "EFBF_SUBSTR16")
	public String getEfbfSubstr16() {
		return efbfSubstr16;
	}

	/**
	 * Set efbfSubstr16
	 */
	public void setEfbfSubstr16(String efbfSubstr16) {
		this.efbfSubstr16 = efbfSubstr16;
		addValidField("efbfSubstr16");
	}

	/**
	 * Get efbfSubstr17
	 */
	@Column(name = "EFBF_SUBSTR17")
	public String getEfbfSubstr17() {
		return efbfSubstr17;
	}

	/**
	 * Set efbfSubstr17
	 */
	public void setEfbfSubstr17(String efbfSubstr17) {
		this.efbfSubstr17 = efbfSubstr17;
		addValidField("efbfSubstr17");
	}

	/**
	 * Get efbfSubstr18
	 */
	@Column(name = "EFBF_SUBSTR18")
	public String getEfbfSubstr18() {
		return efbfSubstr18;
	}

	/**
	 * Set efbfSubstr18
	 */
	public void setEfbfSubstr18(String efbfSubstr18) {
		this.efbfSubstr18 = efbfSubstr18;
		addValidField("efbfSubstr18");
	}

	/**
	 * Get efbfSubstr19
	 */
	@Column(name = "EFBF_SUBSTR19")
	public String getEfbfSubstr19() {
		return efbfSubstr19;
	}

	/**
	 * Set efbfSubstr19
	 */
	public void setEfbfSubstr19(String efbfSubstr19) {
		this.efbfSubstr19 = efbfSubstr19;
		addValidField("efbfSubstr19");
	}

	/**
	 * Get efbfSubstr20
	 */
	@Column(name = "EFBF_SUBSTR20")
	public String getEfbfSubstr20() {
		return efbfSubstr20;
	}

	/**
	 * Set efbfSubstr20
	 */
	public void setEfbfSubstr20(String efbfSubstr20) {
		this.efbfSubstr20 = efbfSubstr20;
		addValidField("efbfSubstr20");
	}

	/**
	 * Get efbfSourceId
	 */
	@Column(name = "EFBF_SOURCE_ID")
	public String getEfbfSourceId() {
		return efbfSourceId;
	}

	/**
	 * Set efbfSourceId
	 */
	public void setEfbfSourceId(String efbfSourceId) {
		this.efbfSourceId = efbfSourceId;
		addValidField("efbfSourceId");
	}

	/**
	 * Get efbfSettlementInformation
	 */
	@Column(name = "EFBF_SETTLEMENT_INFORMATION")
	public String getEfbfSettlementInformation() {
		return efbfSettlementInformation;
	}

	/**
	 * Set efbfSettlementInformation
	 */
	public void setEfbfSettlementInformation(String efbfSettlementInformation) {
		this.efbfSettlementInformation = efbfSettlementInformation;
		addValidField("efbfSettlementInformation");
	}

	/**
	 * Get efbfBmsUploadTime
	 */
	@Column(name = "EFBF_BMS_UPLOAD_TIME")
	public Date getEfbfBmsUploadTime() {
		return efbfBmsUploadTime;
	}

	/**
	 * Set efbfBmsUploadTime
	 */
	public void setEfbfBmsUploadTime(Date efbfBmsUploadTime) {
		this.efbfBmsUploadTime = efbfBmsUploadTime;
		addValidField("efbfBmsUploadTime");
	}

}
