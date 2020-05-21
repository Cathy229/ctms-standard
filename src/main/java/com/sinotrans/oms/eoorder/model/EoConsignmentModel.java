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
 * Model class for EoConsignment
 */
@Entity
@Table(name = "EO_CONSIGNMENT")
public class EoConsignmentModel extends BaseModel implements OperationLog {

	//eocsId
	private Long eocsId;
	//eocsEociId
	private Long eocsEociId;
	//eocsEscoId
	private Long eocsEscoId;
	//eocsEbpjId
	private Long eocsEbpjId;
	//eocsEbpjName
	private String eocsEbpjName;
	//eocsCcEbppId
	private Long eocsCcEbppId;
	//eocsCcIsAutomatic
	private String eocsCcIsAutomatic;
	//eocsCcPlanStatus
	private String eocsCcPlanStatus;
	//eocsParentsOrderId
	private Long eocsParentsOrderId;
	//eocsInnerOrderId
	private Long eocsInnerOrderId;
	//eocsConsignmentNo
	private String eocsConsignmentNo;
	//eocsSoNo
	private String eocsSoNo;
	//eocsDoNo
	private String eocsDoNo;
	//eocsOrderFudeji
	private String eocsOrderFudeji;
	//eocsContractNo
	private String eocsContractNo;
	//eocsLevel
	private String eocsLevel;
	//eocsOrderBarcode
	private String eocsOrderBarcode;
	//eocsConsignorEbcuId
	private Long eocsConsignorEbcuId;
	//eocsConsignorEbcuCode
	private String eocsConsignorEbcuCode;
	//eocsConsignorEbcuName
	private String eocsConsignorEbcuName;
	//eocsCustomEbcuId
	private Long eocsCustomEbcuId;
	//eocsCustomEbcuCode
	private String eocsCustomEbcuCode;
	//eocsCustomEbcuName
	private String eocsCustomEbcuName;
	//eocsSupplierEbcuId
	private Long eocsSupplierEbcuId;
	//eocsSupplierEbcuCode
	private String eocsSupplierEbcuCode;
	//eocsSupplierEbcuName
	private String eocsSupplierEbcuName;
	//eocsEbbuId
	private Long eocsEbbuId;
	//eocsEbbuBuName
	private String eocsEbbuBuName;
	//eocsEbpeId
	private Long eocsEbpeId;
	//eocsEbccName
	private String eocsEbccName;
	//eocsOrderDate
	private Date eocsOrderDate;
	//eocsStartEbrgId
	private Long eocsStartEbrgId;
	//eocsStartEbrgNameCn
	private String eocsStartEbrgNameCn;
	//eocsEndEbrgId
	private Long eocsEndEbrgId;
	//eocsEndEbrgNameCn
	private String eocsEndEbrgNameCn;
	//eocsDoubleOrder
	private String eocsDoubleOrder;
	//eocsEsdeId
	private Long eocsEsdeId;
	//eocsEsdeName
	private String eocsEsdeName;
	//eocsSaleEsstId
	private Long eocsSaleEsstId;
	//eocsSaleEsstName
	private String eocsSaleEsstName;
	//eocsOperateEsstId
	private Long eocsOperateEsstId;
	//eocsOperateEsstName
	private String eocsOperateEsstName;
	//eocsSpecialOrder
	private String eocsSpecialOrder;
	//eocsTranType
	private String eocsTranType;
	//eocsOutDate
	private Date eocsOutDate;
	//eocsStatus
	private String eocsStatus;
	//eocsWeight
	private Double eocsWeight;
	//eocsVolume
	private Double eocsVolume;
	//eocsQuantity
	private Double eocsQuantity;
	//eocsQuantityUnit
	private String eocsQuantityUnit;
	//eocsReqDeliveryDate
	private Date eocsReqDeliveryDate;
	//eocsReqArrivalDate
	private Date eocsReqArrivalDate;
	//eocsDeliveryPeriod
	private String eocsDeliveryPeriod;
	//eocsArrivalPeriod
	private String eocsArrivalPeriod;
	//eocsShipperEbspId
	private Long eocsShipperEbspId;
	//eocsShipperEbspNameCn
	private String eocsShipperEbspNameCn;
	//eocsShipperEbsaPost
	private String eocsShipperEbsaPost;
	//eocsShipperEbsaContact
	private String eocsShipperEbsaContact;
	//eocsShipperEbsaTel
	private String eocsShipperEbsaTel;
	//eocsShipperEbsaId
	private Long eocsShipperEbsaId;
	//eocsShipperEbsaAddress
	private String eocsShipperEbsaAddress;
	//eocsShipperEbrgId
	private Long eocsShipperEbrgId;
	//eocsShipperEbrgNameCn
	private String eocsShipperEbrgNameCn;
	//eocsShipperEbplId
	private Long eocsShipperEbplId;
	//eocsShipperEbplNameCn
	private String eocsShipperEbplNameCn;
	//eocsConsigneeEbspId
	private Long eocsConsigneeEbspId;
	//eocsConsigneeEbspNameCn
	private String eocsConsigneeEbspNameCn;
	//eocsConsigneeEbsaPost
	private String eocsConsigneeEbsaPost;
	//eocsConsigneeEbsaContact
	private String eocsConsigneeEbsaContact;
	//eocsConsigneeEbsaTel
	private String eocsConsigneeEbsaTel;
	//eocsConsigneeEbsaId
	private Long eocsConsigneeEbsaId;
	//eocsConsigneeEbsaAddress
	private String eocsConsigneeEbsaAddress;
	//eocsConsigneeEbrgId
	private Long eocsConsigneeEbrgId;
	//eocsConsigneeEbrgNameCn
	private String eocsConsigneeEbrgNameCn;
	//eocsConsigneeEbplId
	private Long eocsConsigneeEbplId;
	//eocsConsigneeEbplNameCn
	private String eocsConsigneeEbplNameCn;
	//eocsTransReq
	private String eocsTransReq;
	//eocsConsigneeReq
	private String eocsConsigneeReq;
	//eocsDocReq
	private String eocsDocReq;
	//eocsRemark
	private String eocsRemark;
	//eocsVoidDesc
	private String eocsVoidDesc;
	//eocsVoider
	private String eocsVoider;
	//eocsVoiderTime
	private Date eocsVoiderTime;
	//eocsNetWeight
	private Double eocsNetWeight;
	//eocsScheduleId
	private Long eocsScheduleId;
	//eocsScheduleName
	private String eocsScheduleName;
	//eocsRalationId
	private Long eocsRalationId;
	//eocsRalationSoNo
	private String eocsRalationSoNo;
	//eocsTheirPlate
	private String eocsTheirPlate;
	//eocsTotalIncome
	private Long eocsTotalIncome;
	//eocsDataSource
	private String eocsDataSource;
	//eocsMessageName
	private String eocsMessageName;
	//eocsOriSingleNo
	private String eocsOriSingleNo;
	//eocsCreatorName
	private String eocsCreatorName;
	//eocsCreatorEmail
	private String eocsCreatorEmail;
	//eocsCreatorTel
	private String eocsCreatorTel;
	//eocsSubstr1
	private String eocsSubstr1;
	//eocsSubstr2
	private String eocsSubstr2;
	//eocsSubstr3
	private String eocsSubstr3;
	//eocsSubstr4
	private String eocsSubstr4;
	//eocsSubstr5
	private String eocsSubstr5;
	//eocsSubstr6
	private String eocsSubstr6;
	//eocsSubstr7
	private String eocsSubstr7;
	//eocsSubstr8
	private String eocsSubstr8;
	//eocsSubdate1
	private Date eocsSubdate1;
	//eocsSubdate2
	private Date eocsSubdate2;
	//eocsSubdate3
	private Date eocsSubdate3;
	//eocsSubdate4
	private Date eocsSubdate4;
	//eocsSubnum1
	private Long eocsSubnum1;
	//eocsSubnum2
	private Long eocsSubnum2;
	//eocsSubnum3
	private Long eocsSubnum3;
	//eocsSubnum4
	private Long eocsSubnum4;
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
	//eocsSubstr9
	private String eocsSubstr9;
	//eocsSubstr10
	private String eocsSubstr10;
	//eocsSubstr11
	private String eocsSubstr11;
	//eocsSubstr12
	private String eocsSubstr12;
	//eocsSubstr13
	private String eocsSubstr13;
	//eocsSubstr14
	private String eocsSubstr14;
	//eocsSubstr15
	private String eocsSubstr15;
	//eocsSubstr16
	private String eocsSubstr16;
	//eocsSubstr17
	private String eocsSubstr17;
	//eocsSubstr18
	private String eocsSubstr18;
	//eocsSubstr19
	private String eocsSubstr19;
	//eocsSubstr20
	private String eocsSubstr20;
	//eocsSubstr21
	private String eocsSubstr21;
	//eocsSubstr22
	private String eocsSubstr22;
	//eocsSubstr23
	private String eocsSubstr23;
	//eocsSubstr24
	private String eocsSubstr24;
	//eocsSubstr25
	private String eocsSubstr25;
	//eocsSubdate5
	private Date eocsSubdate5;
	//eocsSubdate6
	private Date eocsSubdate6;
	//eocsSubnum5
	private Long eocsSubnum5;
	//eocsSubnum6
	private Long eocsSubnum6;
	//eocsShipperEbspCode
	private String eocsShipperEbspCode;
	//eocsConsigneeEbspCode
	private String eocsConsigneeEbspCode;
	//eocsType
	private String eocsType;
	//eocsGoodsType
	private String eocsGoodsType;
	//eocsWhName
	private String eocsWhName;
	//eocsReleaseTime
	private Date eocsReleaseTime;
	//eocsEbbuCode
	private String eocsEbbuCode;
	//eocsReceiptReturntype
	private Long eocsReceiptReturntype;
	//eocsPaymentMode
	private String eocsPaymentMode;
	//eocsSubstr26
	private String eocsSubstr26;
	//eocsSubstr27
	private String eocsSubstr27;
	//eocsSubstr28
	private String eocsSubstr28;
	//eocsConsigneeCarrierContact
	private String eocsConsigneeCarrierContact;
	//eocsConsigneeEbcuContact
	private String eocsConsigneeEbcuContact;
	//eocsCarrierInformation
	private String eocsCarrierInformation;
	//eocsEbcuContactInformation
	private String eocsEbcuContactInformation;
	//eocsConsigneeContactType
	private String eocsConsigneeContactType;
	//eocsShipperCountry
	private String eocsShipperCountry;
	//eocsConsigneeCountry
	private String eocsConsigneeCountry;
	//eocsSubstr29
	private String eocsSubstr29;
	//eocsSubstr30
	private String eocsSubstr30;
	//eocsConsigneeMailbox
	private String eocsConsigneeMailbox;
	//eocsConsigneeEbcuMailbox
	private String eocsConsigneeEbcuMailbox;
	//eocsIsIssuedEnd
	private String eocsIsIssuedEnd;
	/**
	 * Get eocsId
	 */
	@Column(name = "EOCS_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEocsId() {
		return eocsId;
	}

	/**
	 * Set eocsId
	 */
	public void setEocsId(Long eocsId) {
		this.eocsId = eocsId;
		addValidField("eocsId");
	}

	/**
	 * Get eocsEociId
	 */
	@Column(name = "EOCS_EOCI_ID")
	public Long getEocsEociId() {
		return eocsEociId;
	}

	/**
	 * Set eocsEociId
	 */
	public void setEocsEociId(Long eocsEociId) {
		this.eocsEociId = eocsEociId;
		addValidField("eocsEociId");
	}

	/**
	 * Get eocsEscoId
	 */
	@Column(name = "EOCS_ESCO_ID")
	public Long getEocsEscoId() {
		return eocsEscoId;
	}

	/**
	 * Set eocsEscoId
	 */
	public void setEocsEscoId(Long eocsEscoId) {
		this.eocsEscoId = eocsEscoId;
		addValidField("eocsEscoId");
	}

	/**
	 * Get eocsEbpjId
	 */
	@Column(name = "EOCS_EBPJ_ID")
	public Long getEocsEbpjId() {
		return eocsEbpjId;
	}

	/**
	 * Set eocsEbpjId
	 */
	public void setEocsEbpjId(Long eocsEbpjId) {
		this.eocsEbpjId = eocsEbpjId;
		addValidField("eocsEbpjId");
	}

	/**
	 * Get eocsEbpjName
	 */
	@Column(name = "EOCS_EBPJ_NAME")
	public String getEocsEbpjName() {
		return eocsEbpjName;
	}

	/**
	 * Set eocsEbpjName
	 */
	public void setEocsEbpjName(String eocsEbpjName) {
		this.eocsEbpjName = eocsEbpjName;
		addValidField("eocsEbpjName");
	}

	/**
	 * Get eocsCcEbppId
	 */
	@Column(name = "EOCS_CC_EBPP_ID")
	public Long getEocsCcEbppId() {
		return eocsCcEbppId;
	}

	/**
	 * Set eocsCcEbppId
	 */
	public void setEocsCcEbppId(Long eocsCcEbppId) {
		this.eocsCcEbppId = eocsCcEbppId;
		addValidField("eocsCcEbppId");
	}

	/**
	 * Get eocsCcIsAutomatic
	 */
	@Column(name = "EOCS_CC_IS_AUTOMATIC")
	public String getEocsCcIsAutomatic() {
		return eocsCcIsAutomatic;
	}

	/**
	 * Set eocsCcIsAutomatic
	 */
	public void setEocsCcIsAutomatic(String eocsCcIsAutomatic) {
		this.eocsCcIsAutomatic = eocsCcIsAutomatic;
		addValidField("eocsCcIsAutomatic");
	}

	/**
	 * Get eocsCcPlanStatus
	 */
	@Column(name = "EOCS_CC_PLAN_STATUS")
	public String getEocsCcPlanStatus() {
		return eocsCcPlanStatus;
	}

	/**
	 * Set eocsCcPlanStatus
	 */
	public void setEocsCcPlanStatus(String eocsCcPlanStatus) {
		this.eocsCcPlanStatus = eocsCcPlanStatus;
		addValidField("eocsCcPlanStatus");
	}

	/**
	 * Get eocsParentsOrderId
	 */
	@Column(name = "EOCS_PARENTS_ORDER_ID")
	public Long getEocsParentsOrderId() {
		return eocsParentsOrderId;
	}

	/**
	 * Set eocsParentsOrderId
	 */
	public void setEocsParentsOrderId(Long eocsParentsOrderId) {
		this.eocsParentsOrderId = eocsParentsOrderId;
		addValidField("eocsParentsOrderId");
	}

	/**
	 * Get eocsInnerOrderId
	 */
	@Column(name = "EOCS_INNER_ORDER_ID")
	public Long getEocsInnerOrderId() {
		return eocsInnerOrderId;
	}

	/**
	 * Set eocsInnerOrderId
	 */
	public void setEocsInnerOrderId(Long eocsInnerOrderId) {
		this.eocsInnerOrderId = eocsInnerOrderId;
		addValidField("eocsInnerOrderId");
	}

	/**
	 * Get eocsConsignmentNo
	 */
	@Column(name = "EOCS_CONSIGNMENT_NO")
	public String getEocsConsignmentNo() {
		return eocsConsignmentNo;
	}

	/**
	 * Set eocsConsignmentNo
	 */
	public void setEocsConsignmentNo(String eocsConsignmentNo) {
		this.eocsConsignmentNo = eocsConsignmentNo;
		addValidField("eocsConsignmentNo");
	}

	/**
	 * Get eocsSoNo
	 */
	@Column(name = "EOCS_SO_NO")
	public String getEocsSoNo() {
		return eocsSoNo;
	}

	/**
	 * Set eocsSoNo
	 */
	public void setEocsSoNo(String eocsSoNo) {
		this.eocsSoNo = eocsSoNo;
		addValidField("eocsSoNo");
	}

	/**
	 * Get eocsDoNo
	 */
	@Column(name = "EOCS_DO_NO")
	public String getEocsDoNo() {
		return eocsDoNo;
	}

	/**
	 * Set eocsDoNo
	 */
	public void setEocsDoNo(String eocsDoNo) {
		this.eocsDoNo = eocsDoNo;
		addValidField("eocsDoNo");
	}

	/**
	 * Get eocsOrderFudeji
	 */
	@Column(name = "EOCS_ORDER_FUDEJI")
	public String getEocsOrderFudeji() {
		return eocsOrderFudeji;
	}

	/**
	 * Set eocsOrderFudeji
	 */
	public void setEocsOrderFudeji(String eocsOrderFudeji) {
		this.eocsOrderFudeji = eocsOrderFudeji;
		addValidField("eocsOrderFudeji");
	}

	/**
	 * Get eocsContractNo
	 */
	@Column(name = "EOCS_CONTRACT_NO")
	public String getEocsContractNo() {
		return eocsContractNo;
	}

	/**
	 * Set eocsContractNo
	 */
	public void setEocsContractNo(String eocsContractNo) {
		this.eocsContractNo = eocsContractNo;
		addValidField("eocsContractNo");
	}

	/**
	 * Get eocsLevel
	 */
	@Column(name = "EOCS_LEVEL")
	public String getEocsLevel() {
		return eocsLevel;
	}

	/**
	 * Set eocsLevel
	 */
	public void setEocsLevel(String eocsLevel) {
		this.eocsLevel = eocsLevel;
		addValidField("eocsLevel");
	}

	/**
	 * Get eocsOrderBarcode
	 */
	@Column(name = "EOCS_ORDER_BARCODE")
	public String getEocsOrderBarcode() {
		return eocsOrderBarcode;
	}

	/**
	 * Set eocsOrderBarcode
	 */
	public void setEocsOrderBarcode(String eocsOrderBarcode) {
		this.eocsOrderBarcode = eocsOrderBarcode;
		addValidField("eocsOrderBarcode");
	}

	/**
	 * Get eocsConsignorEbcuId
	 */
	@Column(name = "EOCS_CONSIGNOR_EBCU_ID")
	public Long getEocsConsignorEbcuId() {
		return eocsConsignorEbcuId;
	}

	/**
	 * Set eocsConsignorEbcuId
	 */
	public void setEocsConsignorEbcuId(Long eocsConsignorEbcuId) {
		this.eocsConsignorEbcuId = eocsConsignorEbcuId;
		addValidField("eocsConsignorEbcuId");
	}

	/**
	 * Get eocsConsignorEbcuCode
	 */
	@Column(name = "EOCS_CONSIGNOR_EBCU_CODE")
	public String getEocsConsignorEbcuCode() {
		return eocsConsignorEbcuCode;
	}

	/**
	 * Set eocsConsignorEbcuCode
	 */
	public void setEocsConsignorEbcuCode(String eocsConsignorEbcuCode) {
		this.eocsConsignorEbcuCode = eocsConsignorEbcuCode;
		addValidField("eocsConsignorEbcuCode");
	}

	/**
	 * Get eocsConsignorEbcuName
	 */
	@Column(name = "EOCS_CONSIGNOR_EBCU_NAME")
	public String getEocsConsignorEbcuName() {
		return eocsConsignorEbcuName;
	}

	/**
	 * Set eocsConsignorEbcuName
	 */
	public void setEocsConsignorEbcuName(String eocsConsignorEbcuName) {
		this.eocsConsignorEbcuName = eocsConsignorEbcuName;
		addValidField("eocsConsignorEbcuName");
	}

	/**
	 * Get eocsCustomEbcuId
	 */
	@Column(name = "EOCS_CUSTOM_EBCU_ID")
	public Long getEocsCustomEbcuId() {
		return eocsCustomEbcuId;
	}

	/**
	 * Set eocsCustomEbcuId
	 */
	public void setEocsCustomEbcuId(Long eocsCustomEbcuId) {
		this.eocsCustomEbcuId = eocsCustomEbcuId;
		addValidField("eocsCustomEbcuId");
	}

	/**
	 * Get eocsCustomEbcuCode
	 */
	@Column(name = "EOCS_CUSTOM_EBCU_CODE")
	public String getEocsCustomEbcuCode() {
		return eocsCustomEbcuCode;
	}

	/**
	 * Set eocsCustomEbcuCode
	 */
	public void setEocsCustomEbcuCode(String eocsCustomEbcuCode) {
		this.eocsCustomEbcuCode = eocsCustomEbcuCode;
		addValidField("eocsCustomEbcuCode");
	}

	/**
	 * Get eocsCustomEbcuName
	 */
	@Column(name = "EOCS_CUSTOM_EBCU_NAME")
	public String getEocsCustomEbcuName() {
		return eocsCustomEbcuName;
	}

	/**
	 * Set eocsCustomEbcuName
	 */
	public void setEocsCustomEbcuName(String eocsCustomEbcuName) {
		this.eocsCustomEbcuName = eocsCustomEbcuName;
		addValidField("eocsCustomEbcuName");
	}

	/**
	 * Get eocsSupplierEbcuId
	 */
	@Column(name = "EOCS_SUPPLIER_EBCU_ID")
	public Long getEocsSupplierEbcuId() {
		return eocsSupplierEbcuId;
	}

	/**
	 * Set eocsSupplierEbcuId
	 */
	public void setEocsSupplierEbcuId(Long eocsSupplierEbcuId) {
		this.eocsSupplierEbcuId = eocsSupplierEbcuId;
		addValidField("eocsSupplierEbcuId");
	}

	/**
	 * Get eocsSupplierEbcuCode
	 */
	@Column(name = "EOCS_SUPPLIER_EBCU_CODE")
	public String getEocsSupplierEbcuCode() {
		return eocsSupplierEbcuCode;
	}

	/**
	 * Set eocsSupplierEbcuCode
	 */
	public void setEocsSupplierEbcuCode(String eocsSupplierEbcuCode) {
		this.eocsSupplierEbcuCode = eocsSupplierEbcuCode;
		addValidField("eocsSupplierEbcuCode");
	}

	/**
	 * Get eocsSupplierEbcuName
	 */
	@Column(name = "EOCS_SUPPLIER_EBCU_NAME")
	public String getEocsSupplierEbcuName() {
		return eocsSupplierEbcuName;
	}

	/**
	 * Set eocsSupplierEbcuName
	 */
	public void setEocsSupplierEbcuName(String eocsSupplierEbcuName) {
		this.eocsSupplierEbcuName = eocsSupplierEbcuName;
		addValidField("eocsSupplierEbcuName");
	}

	/**
	 * Get eocsEbbuId
	 */
	@Column(name = "EOCS_EBBU_ID")
	public Long getEocsEbbuId() {
		return eocsEbbuId;
	}

	/**
	 * Set eocsEbbuId
	 */
	public void setEocsEbbuId(Long eocsEbbuId) {
		this.eocsEbbuId = eocsEbbuId;
		addValidField("eocsEbbuId");
	}

	/**
	 * Get eocsEbbuBuName
	 */
	@Column(name = "EOCS_EBBU_BU_NAME")
	public String getEocsEbbuBuName() {
		return eocsEbbuBuName;
	}

	/**
	 * Set eocsEbbuBuName
	 */
	public void setEocsEbbuBuName(String eocsEbbuBuName) {
		this.eocsEbbuBuName = eocsEbbuBuName;
		addValidField("eocsEbbuBuName");
	}

	/**
	 * Get eocsEbpeId
	 */
	@Column(name = "EOCS_EBPE_ID")
	public Long getEocsEbpeId() {
		return eocsEbpeId;
	}

	/**
	 * Set eocsEbpeId
	 */
	public void setEocsEbpeId(Long eocsEbpeId) {
		this.eocsEbpeId = eocsEbpeId;
		addValidField("eocsEbpeId");
	}

	/**
	 * Get eocsEbccName
	 */
	@Column(name = "EOCS_EBCC_NAME")
	public String getEocsEbccName() {
		return eocsEbccName;
	}

	/**
	 * Set eocsEbccName
	 */
	public void setEocsEbccName(String eocsEbccName) {
		this.eocsEbccName = eocsEbccName;
		addValidField("eocsEbccName");
	}

	/**
	 * Get eocsOrderDate
	 */
	@Column(name = "EOCS_ORDER_DATE")
	public Date getEocsOrderDate() {
		return eocsOrderDate;
	}

	/**
	 * Set eocsOrderDate
	 */
	public void setEocsOrderDate(Date eocsOrderDate) {
		this.eocsOrderDate = eocsOrderDate;
		addValidField("eocsOrderDate");
	}

	/**
	 * Get eocsStartEbrgId
	 */
	@Column(name = "EOCS_START_EBRG_ID")
	public Long getEocsStartEbrgId() {
		return eocsStartEbrgId;
	}

	/**
	 * Set eocsStartEbrgId
	 */
	public void setEocsStartEbrgId(Long eocsStartEbrgId) {
		this.eocsStartEbrgId = eocsStartEbrgId;
		addValidField("eocsStartEbrgId");
	}

	/**
	 * Get eocsStartEbrgNameCn
	 */
	@Column(name = "EOCS_START_EBRG_NAME_CN")
	public String getEocsStartEbrgNameCn() {
		return eocsStartEbrgNameCn;
	}

	/**
	 * Set eocsStartEbrgNameCn
	 */
	public void setEocsStartEbrgNameCn(String eocsStartEbrgNameCn) {
		this.eocsStartEbrgNameCn = eocsStartEbrgNameCn;
		addValidField("eocsStartEbrgNameCn");
	}

	/**
	 * Get eocsEndEbrgId
	 */
	@Column(name = "EOCS_END_EBRG_ID")
	public Long getEocsEndEbrgId() {
		return eocsEndEbrgId;
	}

	/**
	 * Set eocsEndEbrgId
	 */
	public void setEocsEndEbrgId(Long eocsEndEbrgId) {
		this.eocsEndEbrgId = eocsEndEbrgId;
		addValidField("eocsEndEbrgId");
	}

	/**
	 * Get eocsEndEbrgNameCn
	 */
	@Column(name = "EOCS_END_EBRG_NAME_CN")
	public String getEocsEndEbrgNameCn() {
		return eocsEndEbrgNameCn;
	}

	/**
	 * Set eocsEndEbrgNameCn
	 */
	public void setEocsEndEbrgNameCn(String eocsEndEbrgNameCn) {
		this.eocsEndEbrgNameCn = eocsEndEbrgNameCn;
		addValidField("eocsEndEbrgNameCn");
	}

	/**
	 * Get eocsDoubleOrder
	 */
	@Column(name = "EOCS_DOUBLE_ORDER")
	public String getEocsDoubleOrder() {
		return eocsDoubleOrder;
	}

	/**
	 * Set eocsDoubleOrder
	 */
	public void setEocsDoubleOrder(String eocsDoubleOrder) {
		this.eocsDoubleOrder = eocsDoubleOrder;
		addValidField("eocsDoubleOrder");
	}

	/**
	 * Get eocsEsdeId
	 */
	@Column(name = "EOCS_ESDE_ID")
	public Long getEocsEsdeId() {
		return eocsEsdeId;
	}

	/**
	 * Set eocsEsdeId
	 */
	public void setEocsEsdeId(Long eocsEsdeId) {
		this.eocsEsdeId = eocsEsdeId;
		addValidField("eocsEsdeId");
	}

	/**
	 * Get eocsEsdeName
	 */
	@Column(name = "EOCS_ESDE_NAME")
	public String getEocsEsdeName() {
		return eocsEsdeName;
	}

	/**
	 * Set eocsEsdeName
	 */
	public void setEocsEsdeName(String eocsEsdeName) {
		this.eocsEsdeName = eocsEsdeName;
		addValidField("eocsEsdeName");
	}

	/**
	 * Get eocsSaleEsstId
	 */
	@Column(name = "EOCS_SALE_ESST_ID")
	public Long getEocsSaleEsstId() {
		return eocsSaleEsstId;
	}

	/**
	 * Set eocsSaleEsstId
	 */
	public void setEocsSaleEsstId(Long eocsSaleEsstId) {
		this.eocsSaleEsstId = eocsSaleEsstId;
		addValidField("eocsSaleEsstId");
	}

	/**
	 * Get eocsSaleEsstName
	 */
	@Column(name = "EOCS_SALE_ESST_NAME")
	public String getEocsSaleEsstName() {
		return eocsSaleEsstName;
	}

	/**
	 * Set eocsSaleEsstName
	 */
	public void setEocsSaleEsstName(String eocsSaleEsstName) {
		this.eocsSaleEsstName = eocsSaleEsstName;
		addValidField("eocsSaleEsstName");
	}

	/**
	 * Get eocsOperateEsstId
	 */
	@Column(name = "EOCS_OPERATE_ESST_ID")
	public Long getEocsOperateEsstId() {
		return eocsOperateEsstId;
	}

	/**
	 * Set eocsOperateEsstId
	 */
	public void setEocsOperateEsstId(Long eocsOperateEsstId) {
		this.eocsOperateEsstId = eocsOperateEsstId;
		addValidField("eocsOperateEsstId");
	}

	/**
	 * Get eocsOperateEsstName
	 */
	@Column(name = "EOCS_OPERATE_ESST_NAME")
	public String getEocsOperateEsstName() {
		return eocsOperateEsstName;
	}

	/**
	 * Set eocsOperateEsstName
	 */
	public void setEocsOperateEsstName(String eocsOperateEsstName) {
		this.eocsOperateEsstName = eocsOperateEsstName;
		addValidField("eocsOperateEsstName");
	}

	/**
	 * Get eocsSpecialOrder
	 */
	@Column(name = "EOCS_SPECIAL_ORDER")
	public String getEocsSpecialOrder() {
		return eocsSpecialOrder;
	}

	/**
	 * Set eocsSpecialOrder
	 */
	public void setEocsSpecialOrder(String eocsSpecialOrder) {
		this.eocsSpecialOrder = eocsSpecialOrder;
		addValidField("eocsSpecialOrder");
	}

	/**
	 * Get eocsTranType
	 */
	@Column(name = "EOCS_TRAN_TYPE")
	public String getEocsTranType() {
		return eocsTranType;
	}

	/**
	 * Set eocsTranType
	 */
	public void setEocsTranType(String eocsTranType) {
		this.eocsTranType = eocsTranType;
		addValidField("eocsTranType");
	}

	/**
	 * Get eocsOutDate
	 */
	@Column(name = "EOCS_OUT_DATE")
	public Date getEocsOutDate() {
		return eocsOutDate;
	}

	/**
	 * Set eocsOutDate
	 */
	public void setEocsOutDate(Date eocsOutDate) {
		this.eocsOutDate = eocsOutDate;
		addValidField("eocsOutDate");
	}

	/**
	 * Get eocsStatus
	 */
	@Column(name = "EOCS_STATUS")
	public String getEocsStatus() {
		return eocsStatus;
	}

	/**
	 * Set eocsStatus
	 */
	public void setEocsStatus(String eocsStatus) {
		this.eocsStatus = eocsStatus;
		addValidField("eocsStatus");
	}

	/**
	 * Get eocsWeight
	 */
	@Column(name = "EOCS_WEIGHT")
	public Double getEocsWeight() {
		return eocsWeight;
	}

	/**
	 * Set eocsWeight
	 */
	public void setEocsWeight(Double eocsWeight) {
		this.eocsWeight = eocsWeight;
		addValidField("eocsWeight");
	}

	/**
	 * Get eocsVolume
	 */
	@Column(name = "EOCS_VOLUME")
	public Double getEocsVolume() {
		return eocsVolume;
	}

	/**
	 * Set eocsVolume
	 */
	public void setEocsVolume(Double eocsVolume) {
		this.eocsVolume = eocsVolume;
		addValidField("eocsVolume");
	}

	/**
	 * Get eocsQuantity
	 */
	@Column(name = "EOCS_QUANTITY")
	public Double getEocsQuantity() {
		return eocsQuantity;
	}

	/**
	 * Set eocsQuantity
	 */
	public void setEocsQuantity(Double eocsQuantity) {
		this.eocsQuantity = eocsQuantity;
		addValidField("eocsQuantity");
	}

	/**
	 * Get eocsQuantityUnit
	 */
	@Column(name = "EOCS_QUANTITY_UNIT")
	public String getEocsQuantityUnit() {
		return eocsQuantityUnit;
	}

	/**
	 * Set eocsQuantityUnit
	 */
	public void setEocsQuantityUnit(String eocsQuantityUnit) {
		this.eocsQuantityUnit = eocsQuantityUnit;
		addValidField("eocsQuantityUnit");
	}

	/**
	 * Get eocsReqDeliveryDate
	 */
	@Column(name = "EOCS_REQ_DELIVERY_DATE")
	public Date getEocsReqDeliveryDate() {
		return eocsReqDeliveryDate;
	}

	/**
	 * Set eocsReqDeliveryDate
	 */
	public void setEocsReqDeliveryDate(Date eocsReqDeliveryDate) {
		this.eocsReqDeliveryDate = eocsReqDeliveryDate;
		addValidField("eocsReqDeliveryDate");
	}

	/**
	 * Get eocsReqArrivalDate
	 */
	@Column(name = "EOCS_REQ_ARRIVAL_DATE")
	public Date getEocsReqArrivalDate() {
		return eocsReqArrivalDate;
	}

	/**
	 * Set eocsReqArrivalDate
	 */
	public void setEocsReqArrivalDate(Date eocsReqArrivalDate) {
		this.eocsReqArrivalDate = eocsReqArrivalDate;
		addValidField("eocsReqArrivalDate");
	}

	/**
	 * Get eocsDeliveryPeriod
	 */
	@Column(name = "EOCS_DELIVERY_PERIOD")
	public String getEocsDeliveryPeriod() {
		return eocsDeliveryPeriod;
	}

	/**
	 * Set eocsDeliveryPeriod
	 */
	public void setEocsDeliveryPeriod(String eocsDeliveryPeriod) {
		this.eocsDeliveryPeriod = eocsDeliveryPeriod;
		addValidField("eocsDeliveryPeriod");
	}

	/**
	 * Get eocsArrivalPeriod
	 */
	@Column(name = "EOCS_ARRIVAL_PERIOD")
	public String getEocsArrivalPeriod() {
		return eocsArrivalPeriod;
	}

	/**
	 * Set eocsArrivalPeriod
	 */
	public void setEocsArrivalPeriod(String eocsArrivalPeriod) {
		this.eocsArrivalPeriod = eocsArrivalPeriod;
		addValidField("eocsArrivalPeriod");
	}

	/**
	 * Get eocsShipperEbspId
	 */
	@Column(name = "EOCS_SHIPPER_EBSP_ID")
	public Long getEocsShipperEbspId() {
		return eocsShipperEbspId;
	}

	/**
	 * Set eocsShipperEbspId
	 */
	public void setEocsShipperEbspId(Long eocsShipperEbspId) {
		this.eocsShipperEbspId = eocsShipperEbspId;
		addValidField("eocsShipperEbspId");
	}

	/**
	 * Get eocsShipperEbspNameCn
	 */
	@Column(name = "EOCS_SHIPPER_EBSP_NAME_CN")
	public String getEocsShipperEbspNameCn() {
		return eocsShipperEbspNameCn;
	}

	/**
	 * Set eocsShipperEbspNameCn
	 */
	public void setEocsShipperEbspNameCn(String eocsShipperEbspNameCn) {
		this.eocsShipperEbspNameCn = eocsShipperEbspNameCn;
		addValidField("eocsShipperEbspNameCn");
	}

	/**
	 * Get eocsShipperEbsaPost
	 */
	@Column(name = "EOCS_SHIPPER_EBSA_POST")
	public String getEocsShipperEbsaPost() {
		return eocsShipperEbsaPost;
	}

	/**
	 * Set eocsShipperEbsaPost
	 */
	public void setEocsShipperEbsaPost(String eocsShipperEbsaPost) {
		this.eocsShipperEbsaPost = eocsShipperEbsaPost;
		addValidField("eocsShipperEbsaPost");
	}

	/**
	 * Get eocsShipperEbsaContact
	 */
	@Column(name = "EOCS_SHIPPER_EBSA_CONTACT")
	public String getEocsShipperEbsaContact() {
		return eocsShipperEbsaContact;
	}

	/**
	 * Set eocsShipperEbsaContact
	 */
	public void setEocsShipperEbsaContact(String eocsShipperEbsaContact) {
		this.eocsShipperEbsaContact = eocsShipperEbsaContact;
		addValidField("eocsShipperEbsaContact");
	}

	/**
	 * Get eocsShipperEbsaTel
	 */
	@Column(name = "EOCS_SHIPPER_EBSA_TEL")
	public String getEocsShipperEbsaTel() {
		return eocsShipperEbsaTel;
	}

	/**
	 * Set eocsShipperEbsaTel
	 */
	public void setEocsShipperEbsaTel(String eocsShipperEbsaTel) {
		this.eocsShipperEbsaTel = eocsShipperEbsaTel;
		addValidField("eocsShipperEbsaTel");
	}

	/**
	 * Get eocsShipperEbsaId
	 */
	@Column(name = "EOCS_SHIPPER_EBSA_ID")
	public Long getEocsShipperEbsaId() {
		return eocsShipperEbsaId;
	}

	/**
	 * Set eocsShipperEbsaId
	 */
	public void setEocsShipperEbsaId(Long eocsShipperEbsaId) {
		this.eocsShipperEbsaId = eocsShipperEbsaId;
		addValidField("eocsShipperEbsaId");
	}

	/**
	 * Get eocsShipperEbsaAddress
	 */
	@Column(name = "EOCS_SHIPPER_EBSA_ADDRESS")
	public String getEocsShipperEbsaAddress() {
		return eocsShipperEbsaAddress;
	}

	/**
	 * Set eocsShipperEbsaAddress
	 */
	public void setEocsShipperEbsaAddress(String eocsShipperEbsaAddress) {
		this.eocsShipperEbsaAddress = eocsShipperEbsaAddress;
		addValidField("eocsShipperEbsaAddress");
	}

	/**
	 * Get eocsShipperEbrgId
	 */
	@Column(name = "EOCS_SHIPPER_EBRG_ID")
	public Long getEocsShipperEbrgId() {
		return eocsShipperEbrgId;
	}

	/**
	 * Set eocsShipperEbrgId
	 */
	public void setEocsShipperEbrgId(Long eocsShipperEbrgId) {
		this.eocsShipperEbrgId = eocsShipperEbrgId;
		addValidField("eocsShipperEbrgId");
	}

	/**
	 * Get eocsShipperEbrgNameCn
	 */
	@Column(name = "EOCS_SHIPPER_EBRG_NAME_CN")
	public String getEocsShipperEbrgNameCn() {
		return eocsShipperEbrgNameCn;
	}

	/**
	 * Set eocsShipperEbrgNameCn
	 */
	public void setEocsShipperEbrgNameCn(String eocsShipperEbrgNameCn) {
		this.eocsShipperEbrgNameCn = eocsShipperEbrgNameCn;
		addValidField("eocsShipperEbrgNameCn");
	}

	/**
	 * Get eocsShipperEbplId
	 */
	@Column(name = "EOCS_SHIPPER_EBPL_ID")
	public Long getEocsShipperEbplId() {
		return eocsShipperEbplId;
	}

	/**
	 * Set eocsShipperEbplId
	 */
	public void setEocsShipperEbplId(Long eocsShipperEbplId) {
		this.eocsShipperEbplId = eocsShipperEbplId;
		addValidField("eocsShipperEbplId");
	}

	/**
	 * Get eocsShipperEbplNameCn
	 */
	@Column(name = "EOCS_SHIPPER_EBPL_NAME_CN")
	public String getEocsShipperEbplNameCn() {
		return eocsShipperEbplNameCn;
	}

	/**
	 * Set eocsShipperEbplNameCn
	 */
	public void setEocsShipperEbplNameCn(String eocsShipperEbplNameCn) {
		this.eocsShipperEbplNameCn = eocsShipperEbplNameCn;
		addValidField("eocsShipperEbplNameCn");
	}

	/**
	 * Get eocsConsigneeEbspId
	 */
	@Column(name = "EOCS_CONSIGNEE_EBSP_ID")
	public Long getEocsConsigneeEbspId() {
		return eocsConsigneeEbspId;
	}

	/**
	 * Set eocsConsigneeEbspId
	 */
	public void setEocsConsigneeEbspId(Long eocsConsigneeEbspId) {
		this.eocsConsigneeEbspId = eocsConsigneeEbspId;
		addValidField("eocsConsigneeEbspId");
	}

	/**
	 * Get eocsConsigneeEbspNameCn
	 */
	@Column(name = "EOCS_CONSIGNEE_EBSP_NAME_CN")
	public String getEocsConsigneeEbspNameCn() {
		return eocsConsigneeEbspNameCn;
	}

	/**
	 * Set eocsConsigneeEbspNameCn
	 */
	public void setEocsConsigneeEbspNameCn(String eocsConsigneeEbspNameCn) {
		this.eocsConsigneeEbspNameCn = eocsConsigneeEbspNameCn;
		addValidField("eocsConsigneeEbspNameCn");
	}

	/**
	 * Get eocsConsigneeEbsaPost
	 */
	@Column(name = "EOCS_CONSIGNEE_EBSA_POST")
	public String getEocsConsigneeEbsaPost() {
		return eocsConsigneeEbsaPost;
	}

	/**
	 * Set eocsConsigneeEbsaPost
	 */
	public void setEocsConsigneeEbsaPost(String eocsConsigneeEbsaPost) {
		this.eocsConsigneeEbsaPost = eocsConsigneeEbsaPost;
		addValidField("eocsConsigneeEbsaPost");
	}

	/**
	 * Get eocsConsigneeEbsaContact
	 */
	@Column(name = "EOCS_CONSIGNEE_EBSA_CONTACT")
	public String getEocsConsigneeEbsaContact() {
		return eocsConsigneeEbsaContact;
	}

	/**
	 * Set eocsConsigneeEbsaContact
	 */
	public void setEocsConsigneeEbsaContact(String eocsConsigneeEbsaContact) {
		this.eocsConsigneeEbsaContact = eocsConsigneeEbsaContact;
		addValidField("eocsConsigneeEbsaContact");
	}

	/**
	 * Get eocsConsigneeEbsaTel
	 */
	@Column(name = "EOCS_CONSIGNEE_EBSA_TEL")
	public String getEocsConsigneeEbsaTel() {
		return eocsConsigneeEbsaTel;
	}

	/**
	 * Set eocsConsigneeEbsaTel
	 */
	public void setEocsConsigneeEbsaTel(String eocsConsigneeEbsaTel) {
		this.eocsConsigneeEbsaTel = eocsConsigneeEbsaTel;
		addValidField("eocsConsigneeEbsaTel");
	}

	/**
	 * Get eocsConsigneeEbsaId
	 */
	@Column(name = "EOCS_CONSIGNEE_EBSA_ID")
	public Long getEocsConsigneeEbsaId() {
		return eocsConsigneeEbsaId;
	}

	/**
	 * Set eocsConsigneeEbsaId
	 */
	public void setEocsConsigneeEbsaId(Long eocsConsigneeEbsaId) {
		this.eocsConsigneeEbsaId = eocsConsigneeEbsaId;
		addValidField("eocsConsigneeEbsaId");
	}

	/**
	 * Get eocsConsigneeEbsaAddress
	 */
	@Column(name = "EOCS_CONSIGNEE_EBSA_ADDRESS")
	public String getEocsConsigneeEbsaAddress() {
		return eocsConsigneeEbsaAddress;
	}

	/**
	 * Set eocsConsigneeEbsaAddress
	 */
	public void setEocsConsigneeEbsaAddress(String eocsConsigneeEbsaAddress) {
		this.eocsConsigneeEbsaAddress = eocsConsigneeEbsaAddress;
		addValidField("eocsConsigneeEbsaAddress");
	}

	/**
	 * Get eocsConsigneeEbrgId
	 */
	@Column(name = "EOCS_CONSIGNEE_EBRG_ID")
	public Long getEocsConsigneeEbrgId() {
		return eocsConsigneeEbrgId;
	}

	/**
	 * Set eocsConsigneeEbrgId
	 */
	public void setEocsConsigneeEbrgId(Long eocsConsigneeEbrgId) {
		this.eocsConsigneeEbrgId = eocsConsigneeEbrgId;
		addValidField("eocsConsigneeEbrgId");
	}

	/**
	 * Get eocsConsigneeEbrgNameCn
	 */
	@Column(name = "EOCS_CONSIGNEE_EBRG_NAME_CN")
	public String getEocsConsigneeEbrgNameCn() {
		return eocsConsigneeEbrgNameCn;
	}

	/**
	 * Set eocsConsigneeEbrgNameCn
	 */
	public void setEocsConsigneeEbrgNameCn(String eocsConsigneeEbrgNameCn) {
		this.eocsConsigneeEbrgNameCn = eocsConsigneeEbrgNameCn;
		addValidField("eocsConsigneeEbrgNameCn");
	}

	/**
	 * Get eocsConsigneeEbplId
	 */
	@Column(name = "EOCS_CONSIGNEE_EBPL_ID")
	public Long getEocsConsigneeEbplId() {
		return eocsConsigneeEbplId;
	}

	/**
	 * Set eocsConsigneeEbplId
	 */
	public void setEocsConsigneeEbplId(Long eocsConsigneeEbplId) {
		this.eocsConsigneeEbplId = eocsConsigneeEbplId;
		addValidField("eocsConsigneeEbplId");
	}

	/**
	 * Get eocsConsigneeEbplNameCn
	 */
	@Column(name = "EOCS_CONSIGNEE_EBPL_NAME_CN")
	public String getEocsConsigneeEbplNameCn() {
		return eocsConsigneeEbplNameCn;
	}

	/**
	 * Set eocsConsigneeEbplNameCn
	 */
	public void setEocsConsigneeEbplNameCn(String eocsConsigneeEbplNameCn) {
		this.eocsConsigneeEbplNameCn = eocsConsigneeEbplNameCn;
		addValidField("eocsConsigneeEbplNameCn");
	}

	/**
	 * Get eocsTransReq
	 */
	@Column(name = "EOCS_TRANS_REQ")
	public String getEocsTransReq() {
		return eocsTransReq;
	}

	/**
	 * Set eocsTransReq
	 */
	public void setEocsTransReq(String eocsTransReq) {
		this.eocsTransReq = eocsTransReq;
		addValidField("eocsTransReq");
	}

	/**
	 * Get eocsConsigneeReq
	 */
	@Column(name = "EOCS_CONSIGNEE_REQ")
	public String getEocsConsigneeReq() {
		return eocsConsigneeReq;
	}

	/**
	 * Set eocsConsigneeReq
	 */
	public void setEocsConsigneeReq(String eocsConsigneeReq) {
		this.eocsConsigneeReq = eocsConsigneeReq;
		addValidField("eocsConsigneeReq");
	}

	/**
	 * Get eocsDocReq
	 */
	@Column(name = "EOCS_DOC_REQ")
	public String getEocsDocReq() {
		return eocsDocReq;
	}

	/**
	 * Set eocsDocReq
	 */
	public void setEocsDocReq(String eocsDocReq) {
		this.eocsDocReq = eocsDocReq;
		addValidField("eocsDocReq");
	}

	/**
	 * Get eocsRemark
	 */
	@Column(name = "EOCS_REMARK")
	public String getEocsRemark() {
		return eocsRemark;
	}

	/**
	 * Set eocsRemark
	 */
	public void setEocsRemark(String eocsRemark) {
		this.eocsRemark = eocsRemark;
		addValidField("eocsRemark");
	}

	/**
	 * Get eocsVoidDesc
	 */
	@Column(name = "EOCS_VOID_DESC")
	public String getEocsVoidDesc() {
		return eocsVoidDesc;
	}

	/**
	 * Set eocsVoidDesc
	 */
	public void setEocsVoidDesc(String eocsVoidDesc) {
		this.eocsVoidDesc = eocsVoidDesc;
		addValidField("eocsVoidDesc");
	}

	/**
	 * Get eocsVoider
	 */
	@Column(name = "EOCS_VOIDER")
	public String getEocsVoider() {
		return eocsVoider;
	}

	/**
	 * Set eocsVoider
	 */
	public void setEocsVoider(String eocsVoider) {
		this.eocsVoider = eocsVoider;
		addValidField("eocsVoider");
	}

	/**
	 * Get eocsVoiderTime
	 */
	@Column(name = "EOCS_VOIDER_TIME")
	public Date getEocsVoiderTime() {
		return eocsVoiderTime;
	}

	/**
	 * Set eocsVoiderTime
	 */
	public void setEocsVoiderTime(Date eocsVoiderTime) {
		this.eocsVoiderTime = eocsVoiderTime;
		addValidField("eocsVoiderTime");
	}

	/**
	 * Get eocsNetWeight
	 */
	@Column(name = "EOCS_NET_WEIGHT")
	public Double getEocsNetWeight() {
		return eocsNetWeight;
	}

	/**
	 * Set eocsNetWeight
	 */
	public void setEocsNetWeight(Double eocsNetWeight) {
		this.eocsNetWeight = eocsNetWeight;
		addValidField("eocsNetWeight");
	}

	/**
	 * Get eocsScheduleId
	 */
	@Column(name = "EOCS_SCHEDULE_ID")
	public Long getEocsScheduleId() {
		return eocsScheduleId;
	}

	/**
	 * Set eocsScheduleId
	 */
	public void setEocsScheduleId(Long eocsScheduleId) {
		this.eocsScheduleId = eocsScheduleId;
		addValidField("eocsScheduleId");
	}

	/**
	 * Get eocsScheduleName
	 */
	@Column(name = "EOCS_SCHEDULE_NAME")
	public String getEocsScheduleName() {
		return eocsScheduleName;
	}

	/**
	 * Set eocsScheduleName
	 */
	public void setEocsScheduleName(String eocsScheduleName) {
		this.eocsScheduleName = eocsScheduleName;
		addValidField("eocsScheduleName");
	}

	/**
	 * Get eocsRalationId
	 */
	@Column(name = "EOCS_RALATION_ID")
	public Long getEocsRalationId() {
		return eocsRalationId;
	}

	/**
	 * Set eocsRalationId
	 */
	public void setEocsRalationId(Long eocsRalationId) {
		this.eocsRalationId = eocsRalationId;
		addValidField("eocsRalationId");
	}

	/**
	 * Get eocsRalationSoNo
	 */
	@Column(name = "EOCS_RALATION_SO_NO")
	public String getEocsRalationSoNo() {
		return eocsRalationSoNo;
	}

	/**
	 * Set eocsRalationSoNo
	 */
	public void setEocsRalationSoNo(String eocsRalationSoNo) {
		this.eocsRalationSoNo = eocsRalationSoNo;
		addValidField("eocsRalationSoNo");
	}

	/**
	 * Get eocsTheirPlate
	 */
	@Column(name = "EOCS_THEIR_PLATE")
	public String getEocsTheirPlate() {
		return eocsTheirPlate;
	}

	/**
	 * Set eocsTheirPlate
	 */
	public void setEocsTheirPlate(String eocsTheirPlate) {
		this.eocsTheirPlate = eocsTheirPlate;
		addValidField("eocsTheirPlate");
	}

	/**
	 * Get eocsTotalIncome
	 */
	@Column(name = "EOCS_TOTAL_INCOME")
	public Long getEocsTotalIncome() {
		return eocsTotalIncome;
	}

	/**
	 * Set eocsTotalIncome
	 */
	public void setEocsTotalIncome(Long eocsTotalIncome) {
		this.eocsTotalIncome = eocsTotalIncome;
		addValidField("eocsTotalIncome");
	}

	/**
	 * Get eocsDataSource
	 */
	@Column(name = "EOCS_DATA_SOURCE")
	public String getEocsDataSource() {
		return eocsDataSource;
	}

	/**
	 * Set eocsDataSource
	 */
	public void setEocsDataSource(String eocsDataSource) {
		this.eocsDataSource = eocsDataSource;
		addValidField("eocsDataSource");
	}

	/**
	 * Get eocsMessageName
	 */
	@Column(name = "EOCS_MESSAGE_NAME")
	public String getEocsMessageName() {
		return eocsMessageName;
	}

	/**
	 * Set eocsMessageName
	 */
	public void setEocsMessageName(String eocsMessageName) {
		this.eocsMessageName = eocsMessageName;
		addValidField("eocsMessageName");
	}

	/**
	 * Get eocsOriSingleNo
	 */
	@Column(name = "EOCS_ORI_SINGLE_NO")
	public String getEocsOriSingleNo() {
		return eocsOriSingleNo;
	}

	/**
	 * Set eocsOriSingleNo
	 */
	public void setEocsOriSingleNo(String eocsOriSingleNo) {
		this.eocsOriSingleNo = eocsOriSingleNo;
		addValidField("eocsOriSingleNo");
	}

	/**
	 * Get eocsCreatorName
	 */
	@Column(name = "EOCS_CREATOR_NAME")
	public String getEocsCreatorName() {
		return eocsCreatorName;
	}

	/**
	 * Set eocsCreatorName
	 */
	public void setEocsCreatorName(String eocsCreatorName) {
		this.eocsCreatorName = eocsCreatorName;
		addValidField("eocsCreatorName");
	}

	/**
	 * Get eocsCreatorEmail
	 */
	@Column(name = "EOCS_CREATOR_EMAIL")
	public String getEocsCreatorEmail() {
		return eocsCreatorEmail;
	}

	/**
	 * Set eocsCreatorEmail
	 */
	public void setEocsCreatorEmail(String eocsCreatorEmail) {
		this.eocsCreatorEmail = eocsCreatorEmail;
		addValidField("eocsCreatorEmail");
	}

	/**
	 * Get eocsCreatorTel
	 */
	@Column(name = "EOCS_CREATOR_TEL")
	public String getEocsCreatorTel() {
		return eocsCreatorTel;
	}

	/**
	 * Set eocsCreatorTel
	 */
	public void setEocsCreatorTel(String eocsCreatorTel) {
		this.eocsCreatorTel = eocsCreatorTel;
		addValidField("eocsCreatorTel");
	}

	/**
	 * Get eocsSubstr1
	 */
	@Column(name = "EOCS_SUBSTR1")
	public String getEocsSubstr1() {
		return eocsSubstr1;
	}

	/**
	 * Set eocsSubstr1
	 */
	public void setEocsSubstr1(String eocsSubstr1) {
		this.eocsSubstr1 = eocsSubstr1;
		addValidField("eocsSubstr1");
	}

	/**
	 * Get eocsSubstr2
	 */
	@Column(name = "EOCS_SUBSTR2")
	public String getEocsSubstr2() {
		return eocsSubstr2;
	}

	/**
	 * Set eocsSubstr2
	 */
	public void setEocsSubstr2(String eocsSubstr2) {
		this.eocsSubstr2 = eocsSubstr2;
		addValidField("eocsSubstr2");
	}

	/**
	 * Get eocsSubstr3
	 */
	@Column(name = "EOCS_SUBSTR3")
	public String getEocsSubstr3() {
		return eocsSubstr3;
	}

	/**
	 * Set eocsSubstr3
	 */
	public void setEocsSubstr3(String eocsSubstr3) {
		this.eocsSubstr3 = eocsSubstr3;
		addValidField("eocsSubstr3");
	}

	/**
	 * Get eocsSubstr4
	 */
	@Column(name = "EOCS_SUBSTR4")
	public String getEocsSubstr4() {
		return eocsSubstr4;
	}

	/**
	 * Set eocsSubstr4
	 */
	public void setEocsSubstr4(String eocsSubstr4) {
		this.eocsSubstr4 = eocsSubstr4;
		addValidField("eocsSubstr4");
	}

	/**
	 * Get eocsSubstr5
	 */
	@Column(name = "EOCS_SUBSTR5")
	public String getEocsSubstr5() {
		return eocsSubstr5;
	}

	/**
	 * Set eocsSubstr5
	 */
	public void setEocsSubstr5(String eocsSubstr5) {
		this.eocsSubstr5 = eocsSubstr5;
		addValidField("eocsSubstr5");
	}

	/**
	 * Get eocsSubstr6
	 */
	@Column(name = "EOCS_SUBSTR6")
	public String getEocsSubstr6() {
		return eocsSubstr6;
	}

	/**
	 * Set eocsSubstr6
	 */
	public void setEocsSubstr6(String eocsSubstr6) {
		this.eocsSubstr6 = eocsSubstr6;
		addValidField("eocsSubstr6");
	}

	/**
	 * Get eocsSubstr7
	 */
	@Column(name = "EOCS_SUBSTR7")
	public String getEocsSubstr7() {
		return eocsSubstr7;
	}

	/**
	 * Set eocsSubstr7
	 */
	public void setEocsSubstr7(String eocsSubstr7) {
		this.eocsSubstr7 = eocsSubstr7;
		addValidField("eocsSubstr7");
	}

	/**
	 * Get eocsSubstr8
	 */
	@Column(name = "EOCS_SUBSTR8")
	public String getEocsSubstr8() {
		return eocsSubstr8;
	}

	/**
	 * Set eocsSubstr8
	 */
	public void setEocsSubstr8(String eocsSubstr8) {
		this.eocsSubstr8 = eocsSubstr8;
		addValidField("eocsSubstr8");
	}

	/**
	 * Get eocsSubdate1
	 */
	@Column(name = "EOCS_SUBDATE1")
	public Date getEocsSubdate1() {
		return eocsSubdate1;
	}

	/**
	 * Set eocsSubdate1
	 */
	public void setEocsSubdate1(Date eocsSubdate1) {
		this.eocsSubdate1 = eocsSubdate1;
		addValidField("eocsSubdate1");
	}

	/**
	 * Get eocsSubdate2
	 */
	@Column(name = "EOCS_SUBDATE2")
	public Date getEocsSubdate2() {
		return eocsSubdate2;
	}

	/**
	 * Set eocsSubdate2
	 */
	public void setEocsSubdate2(Date eocsSubdate2) {
		this.eocsSubdate2 = eocsSubdate2;
		addValidField("eocsSubdate2");
	}

	/**
	 * Get eocsSubdate3
	 */
	@Column(name = "EOCS_SUBDATE3")
	public Date getEocsSubdate3() {
		return eocsSubdate3;
	}

	/**
	 * Set eocsSubdate3
	 */
	public void setEocsSubdate3(Date eocsSubdate3) {
		this.eocsSubdate3 = eocsSubdate3;
		addValidField("eocsSubdate3");
	}

	/**
	 * Get eocsSubdate4
	 */
	@Column(name = "EOCS_SUBDATE4")
	public Date getEocsSubdate4() {
		return eocsSubdate4;
	}

	/**
	 * Set eocsSubdate4
	 */
	public void setEocsSubdate4(Date eocsSubdate4) {
		this.eocsSubdate4 = eocsSubdate4;
		addValidField("eocsSubdate4");
	}

	/**
	 * Get eocsSubnum1
	 */
	@Column(name = "EOCS_SUBNUM1")
	public Long getEocsSubnum1() {
		return eocsSubnum1;
	}

	/**
	 * Set eocsSubnum1
	 */
	public void setEocsSubnum1(Long eocsSubnum1) {
		this.eocsSubnum1 = eocsSubnum1;
		addValidField("eocsSubnum1");
	}

	/**
	 * Get eocsSubnum2
	 */
	@Column(name = "EOCS_SUBNUM2")
	public Long getEocsSubnum2() {
		return eocsSubnum2;
	}

	/**
	 * Set eocsSubnum2
	 */
	public void setEocsSubnum2(Long eocsSubnum2) {
		this.eocsSubnum2 = eocsSubnum2;
		addValidField("eocsSubnum2");
	}

	/**
	 * Get eocsSubnum3
	 */
	@Column(name = "EOCS_SUBNUM3")
	public Long getEocsSubnum3() {
		return eocsSubnum3;
	}

	/**
	 * Set eocsSubnum3
	 */
	public void setEocsSubnum3(Long eocsSubnum3) {
		this.eocsSubnum3 = eocsSubnum3;
		addValidField("eocsSubnum3");
	}

	/**
	 * Get eocsSubnum4
	 */
	@Column(name = "EOCS_SUBNUM4")
	public Long getEocsSubnum4() {
		return eocsSubnum4;
	}

	/**
	 * Set eocsSubnum4
	 */
	public void setEocsSubnum4(Long eocsSubnum4) {
		this.eocsSubnum4 = eocsSubnum4;
		addValidField("eocsSubnum4");
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
	 * Get eocsSubstr9
	 */
	@Column(name = "EOCS_SUBSTR9")
	public String getEocsSubstr9() {
		return eocsSubstr9;
	}

	/**
	 * Set eocsSubstr9
	 */
	public void setEocsSubstr9(String eocsSubstr9) {
		this.eocsSubstr9 = eocsSubstr9;
		addValidField("eocsSubstr9");
	}

	/**
	 * Get eocsSubstr10
	 */
	@Column(name = "EOCS_SUBSTR10")
	public String getEocsSubstr10() {
		return eocsSubstr10;
	}

	/**
	 * Set eocsSubstr10
	 */
	public void setEocsSubstr10(String eocsSubstr10) {
		this.eocsSubstr10 = eocsSubstr10;
		addValidField("eocsSubstr10");
	}

	/**
	 * Get eocsSubstr11
	 */
	@Column(name = "EOCS_SUBSTR11")
	public String getEocsSubstr11() {
		return eocsSubstr11;
	}

	/**
	 * Set eocsSubstr11
	 */
	public void setEocsSubstr11(String eocsSubstr11) {
		this.eocsSubstr11 = eocsSubstr11;
		addValidField("eocsSubstr11");
	}

	/**
	 * Get eocsSubstr12
	 */
	@Column(name = "EOCS_SUBSTR12")
	public String getEocsSubstr12() {
		return eocsSubstr12;
	}

	/**
	 * Set eocsSubstr12
	 */
	public void setEocsSubstr12(String eocsSubstr12) {
		this.eocsSubstr12 = eocsSubstr12;
		addValidField("eocsSubstr12");
	}

	/**
	 * Get eocsSubstr13
	 */
	@Column(name = "EOCS_SUBSTR13")
	public String getEocsSubstr13() {
		return eocsSubstr13;
	}

	/**
	 * Set eocsSubstr13
	 */
	public void setEocsSubstr13(String eocsSubstr13) {
		this.eocsSubstr13 = eocsSubstr13;
		addValidField("eocsSubstr13");
	}

	/**
	 * Get eocsSubstr14
	 */
	@Column(name = "EOCS_SUBSTR14")
	public String getEocsSubstr14() {
		return eocsSubstr14;
	}

	/**
	 * Set eocsSubstr14
	 */
	public void setEocsSubstr14(String eocsSubstr14) {
		this.eocsSubstr14 = eocsSubstr14;
		addValidField("eocsSubstr14");
	}

	/**
	 * Get eocsSubstr15
	 */
	@Column(name = "EOCS_SUBSTR15")
	public String getEocsSubstr15() {
		return eocsSubstr15;
	}

	/**
	 * Set eocsSubstr15
	 */
	public void setEocsSubstr15(String eocsSubstr15) {
		this.eocsSubstr15 = eocsSubstr15;
		addValidField("eocsSubstr15");
	}

	/**
	 * Get eocsSubstr16
	 */
	@Column(name = "EOCS_SUBSTR16")
	public String getEocsSubstr16() {
		return eocsSubstr16;
	}

	/**
	 * Set eocsSubstr16
	 */
	public void setEocsSubstr16(String eocsSubstr16) {
		this.eocsSubstr16 = eocsSubstr16;
		addValidField("eocsSubstr16");
	}

	/**
	 * Get eocsSubstr17
	 */
	@Column(name = "EOCS_SUBSTR17")
	public String getEocsSubstr17() {
		return eocsSubstr17;
	}

	/**
	 * Set eocsSubstr17
	 */
	public void setEocsSubstr17(String eocsSubstr17) {
		this.eocsSubstr17 = eocsSubstr17;
		addValidField("eocsSubstr17");
	}

	/**
	 * Get eocsSubstr18
	 */
	@Column(name = "EOCS_SUBSTR18")
	public String getEocsSubstr18() {
		return eocsSubstr18;
	}

	/**
	 * Set eocsSubstr18
	 */
	public void setEocsSubstr18(String eocsSubstr18) {
		this.eocsSubstr18 = eocsSubstr18;
		addValidField("eocsSubstr18");
	}

	/**
	 * Get eocsSubstr19
	 */
	@Column(name = "EOCS_SUBSTR19")
	public String getEocsSubstr19() {
		return eocsSubstr19;
	}

	/**
	 * Set eocsSubstr19
	 */
	public void setEocsSubstr19(String eocsSubstr19) {
		this.eocsSubstr19 = eocsSubstr19;
		addValidField("eocsSubstr19");
	}

	/**
	 * Get eocsSubstr20
	 */
	@Column(name = "EOCS_SUBSTR20")
	public String getEocsSubstr20() {
		return eocsSubstr20;
	}

	/**
	 * Set eocsSubstr20
	 */
	public void setEocsSubstr20(String eocsSubstr20) {
		this.eocsSubstr20 = eocsSubstr20;
		addValidField("eocsSubstr20");
	}

	/**
	 * Get eocsSubstr21
	 */
	@Column(name = "EOCS_SUBSTR21")
	public String getEocsSubstr21() {
		return eocsSubstr21;
	}

	/**
	 * Set eocsSubstr21
	 */
	public void setEocsSubstr21(String eocsSubstr21) {
		this.eocsSubstr21 = eocsSubstr21;
		addValidField("eocsSubstr21");
	}

	/**
	 * Get eocsSubstr22
	 */
	@Column(name = "EOCS_SUBSTR22")
	public String getEocsSubstr22() {
		return eocsSubstr22;
	}

	/**
	 * Set eocsSubstr22
	 */
	public void setEocsSubstr22(String eocsSubstr22) {
		this.eocsSubstr22 = eocsSubstr22;
		addValidField("eocsSubstr22");
	}

	/**
	 * Get eocsSubstr23
	 */
	@Column(name = "EOCS_SUBSTR23")
	public String getEocsSubstr23() {
		return eocsSubstr23;
	}

	/**
	 * Set eocsSubstr23
	 */
	public void setEocsSubstr23(String eocsSubstr23) {
		this.eocsSubstr23 = eocsSubstr23;
		addValidField("eocsSubstr23");
	}

	/**
	 * Get eocsSubstr24
	 */
	@Column(name = "EOCS_SUBSTR24")
	public String getEocsSubstr24() {
		return eocsSubstr24;
	}

	/**
	 * Set eocsSubstr24
	 */
	public void setEocsSubstr24(String eocsSubstr24) {
		this.eocsSubstr24 = eocsSubstr24;
		addValidField("eocsSubstr24");
	}

	/**
	 * Get eocsSubstr25
	 */
	@Column(name = "EOCS_SUBSTR25")
	public String getEocsSubstr25() {
		return eocsSubstr25;
	}

	/**
	 * Set eocsSubstr25
	 */
	public void setEocsSubstr25(String eocsSubstr25) {
		this.eocsSubstr25 = eocsSubstr25;
		addValidField("eocsSubstr25");
	}

	/**
	 * Get eocsSubdate5
	 */
	@Column(name = "EOCS_SUBDATE5")
	public Date getEocsSubdate5() {
		return eocsSubdate5;
	}

	/**
	 * Set eocsSubdate5
	 */
	public void setEocsSubdate5(Date eocsSubdate5) {
		this.eocsSubdate5 = eocsSubdate5;
		addValidField("eocsSubdate5");
	}

	/**
	 * Get eocsSubdate6
	 */
	@Column(name = "EOCS_SUBDATE6")
	public Date getEocsSubdate6() {
		return eocsSubdate6;
	}

	/**
	 * Set eocsSubdate6
	 */
	public void setEocsSubdate6(Date eocsSubdate6) {
		this.eocsSubdate6 = eocsSubdate6;
		addValidField("eocsSubdate6");
	}

	/**
	 * Get eocsSubnum5
	 */
	@Column(name = "EOCS_SUBNUM5")
	public Long getEocsSubnum5() {
		return eocsSubnum5;
	}

	/**
	 * Set eocsSubnum5
	 */
	public void setEocsSubnum5(Long eocsSubnum5) {
		this.eocsSubnum5 = eocsSubnum5;
		addValidField("eocsSubnum5");
	}

	/**
	 * Get eocsSubnum6
	 */
	@Column(name = "EOCS_SUBNUM6")
	public Long getEocsSubnum6() {
		return eocsSubnum6;
	}

	/**
	 * Set eocsSubnum6
	 */
	public void setEocsSubnum6(Long eocsSubnum6) {
		this.eocsSubnum6 = eocsSubnum6;
		addValidField("eocsSubnum6");
	}

	/**
	 * Get eocsShipperEbspCode
	 */
	@Column(name = "EOCS_SHIPPER_EBSP_CODE")
	public String getEocsShipperEbspCode() {
		return eocsShipperEbspCode;
	}

	/**
	 * Set eocsShipperEbspCode
	 */
	public void setEocsShipperEbspCode(String eocsShipperEbspCode) {
		this.eocsShipperEbspCode = eocsShipperEbspCode;
		addValidField("eocsShipperEbspCode");
	}

	/**
	 * Get eocsConsigneeEbspCode
	 */
	@Column(name = "EOCS_CONSIGNEE_EBSP_CODE")
	public String getEocsConsigneeEbspCode() {
		return eocsConsigneeEbspCode;
	}

	/**
	 * Set eocsConsigneeEbspCode
	 */
	public void setEocsConsigneeEbspCode(String eocsConsigneeEbspCode) {
		this.eocsConsigneeEbspCode = eocsConsigneeEbspCode;
		addValidField("eocsConsigneeEbspCode");
	}

	/**
	 * Get eocsType
	 */
	@Column(name = "EOCS_TYPE")
	public String getEocsType() {
		return eocsType;
	}

	/**
	 * Set eocsType
	 */
	public void setEocsType(String eocsType) {
		this.eocsType = eocsType;
		addValidField("eocsType");
	}

	/**
	 * Get eocsGoodsType
	 */
	@Column(name = "EOCS_GOODS_TYPE")
	public String getEocsGoodsType() {
		return eocsGoodsType;
	}

	/**
	 * Set eocsGoodsType
	 */
	public void setEocsGoodsType(String eocsGoodsType) {
		this.eocsGoodsType = eocsGoodsType;
		addValidField("eocsGoodsType");
	}

	/**
	 * Get eocsWhName
	 */
	@Column(name = "EOCS_WH_NAME")
	public String getEocsWhName() {
		return eocsWhName;
	}

	/**
	 * Set eocsWhName
	 */
	public void setEocsWhName(String eocsWhName) {
		this.eocsWhName = eocsWhName;
		addValidField("eocsWhName");
	}

	/**
	 * Get eocsReleaseTime
	 */
	@Column(name = "EOCS_RELEASE_TIME")
	public Date getEocsReleaseTime() {
		return eocsReleaseTime;
	}

	/**
	 * Set eocsReleaseTime
	 */
	public void setEocsReleaseTime(Date eocsReleaseTime) {
		this.eocsReleaseTime = eocsReleaseTime;
		addValidField("eocsReleaseTime");
	}

	/**
	 * Get eocsEbbuCode
	 */
	@Column(name = "EOCS_EBBU_CODE")
	public String getEocsEbbuCode() {
		return eocsEbbuCode;
	}

	/**
	 * Set eocsEbbuCode
	 */
	public void setEocsEbbuCode(String eocsEbbuCode) {
		this.eocsEbbuCode = eocsEbbuCode;
		addValidField("eocsEbbuCode");
	}

	/**
	 * Get eocsReceiptReturntype
	 */
	@Column(name = "EOCS_RECEIPT_RETURNTYPE")
	public Long getEocsReceiptReturntype() {
		return eocsReceiptReturntype;
	}

	/**
	 * Set eocsReceiptReturntype
	 */
	public void setEocsReceiptReturntype(Long eocsReceiptReturntype) {
		this.eocsReceiptReturntype = eocsReceiptReturntype;
		addValidField("eocsReceiptReturntype");
	}

	/**
	 * Get eocsPaymentMode
	 */
	@Column(name = "EOCS_PAYMENT_MODE")
	public String getEocsPaymentMode() {
		return eocsPaymentMode;
	}

	/**
	 * Set eocsPaymentMode
	 */
	public void setEocsPaymentMode(String eocsPaymentMode) {
		this.eocsPaymentMode = eocsPaymentMode;
		addValidField("eocsPaymentMode");
	}

	/**
	 * Get eocsSubstr26
	 */
	@Column(name = "EOCS_SUBSTR26")
	public String getEocsSubstr26() {
		return eocsSubstr26;
	}

	/**
	 * Set eocsSubstr26
	 */
	public void setEocsSubstr26(String eocsSubstr26) {
		this.eocsSubstr26 = eocsSubstr26;
		addValidField("eocsSubstr26");
	}

	/**
	 * Get eocsSubstr27
	 */
	@Column(name = "EOCS_SUBSTR27")
	public String getEocsSubstr27() {
		return eocsSubstr27;
	}

	/**
	 * Set eocsSubstr27
	 */
	public void setEocsSubstr27(String eocsSubstr27) {
		this.eocsSubstr27 = eocsSubstr27;
		addValidField("eocsSubstr27");
	}

	/**
	 * Get eocsSubstr28
	 */
	@Column(name = "EOCS_SUBSTR28")
	public String getEocsSubstr28() {
		return eocsSubstr28;
	}

	/**
	 * Set eocsSubstr28
	 */
	public void setEocsSubstr28(String eocsSubstr28) {
		this.eocsSubstr28 = eocsSubstr28;
		addValidField("eocsSubstr28");
	}

	/**
	 * Get eocsConsigneeCarrierContact
	 */
	@Column(name = "EOCS_CONSIGNEE_CARRIER_CONTACT")
	public String getEocsConsigneeCarrierContact() {
		return eocsConsigneeCarrierContact;
	}

	/**
	 * Set eocsConsigneeCarrierContact
	 */
	public void setEocsConsigneeCarrierContact(String eocsConsigneeCarrierContact) {
		this.eocsConsigneeCarrierContact = eocsConsigneeCarrierContact;
		addValidField("eocsConsigneeCarrierContact");
	}

	/**
	 * Get eocsConsigneeEbcuContact
	 */
	@Column(name = "EOCS_CONSIGNEE_EBCU_CONTACT")
	public String getEocsConsigneeEbcuContact() {
		return eocsConsigneeEbcuContact;
	}

	/**
	 * Set eocsConsigneeEbcuContact
	 */
	public void setEocsConsigneeEbcuContact(String eocsConsigneeEbcuContact) {
		this.eocsConsigneeEbcuContact = eocsConsigneeEbcuContact;
		addValidField("eocsConsigneeEbcuContact");
	}

	/**
	 * Get eocsCarrierInformation
	 */
	@Column(name = "EOCS_CARRIER_INFORMATION")
	public String getEocsCarrierInformation() {
		return eocsCarrierInformation;
	}

	/**
	 * Set eocsCarrierInformation
	 */
	public void setEocsCarrierInformation(String eocsCarrierInformation) {
		this.eocsCarrierInformation = eocsCarrierInformation;
		addValidField("eocsCarrierInformation");
	}

	/**
	 * Get eocsEbcuContactInformation
	 */
	@Column(name = "EOCS_EBCU_CONTACT_INFORMATION")
	public String getEocsEbcuContactInformation() {
		return eocsEbcuContactInformation;
	}

	/**
	 * Set eocsEbcuContactInformation
	 */
	public void setEocsEbcuContactInformation(String eocsEbcuContactInformation) {
		this.eocsEbcuContactInformation = eocsEbcuContactInformation;
		addValidField("eocsEbcuContactInformation");
	}

	/**
	 * Get eocsConsigneeContactType
	 */
	@Column(name = "EOCS_CONSIGNEE_CONTACT_TYPE")
	public String getEocsConsigneeContactType() {
		return eocsConsigneeContactType;
	}

	/**
	 * Set eocsConsigneeContactType
	 */
	public void setEocsConsigneeContactType(String eocsConsigneeContactType) {
		this.eocsConsigneeContactType = eocsConsigneeContactType;
		addValidField("eocsConsigneeContactType");
	}

	/**
	 * Get eocsShipperCountry
	 */
	@Column(name = "EOCS_SHIPPER_COUNTRY")
	public String getEocsShipperCountry() {
		return eocsShipperCountry;
	}

	/**
	 * Set eocsShipperCountry
	 */
	public void setEocsShipperCountry(String eocsShipperCountry) {
		this.eocsShipperCountry = eocsShipperCountry;
		addValidField("eocsShipperCountry");
	}

	/**
	 * Get eocsConsigneeCountry
	 */
	@Column(name = "EOCS_CONSIGNEE_COUNTRY")
	public String getEocsConsigneeCountry() {
		return eocsConsigneeCountry;
	}

	/**
	 * Set eocsConsigneeCountry
	 */
	public void setEocsConsigneeCountry(String eocsConsigneeCountry) {
		this.eocsConsigneeCountry = eocsConsigneeCountry;
		addValidField("eocsConsigneeCountry");
	}

	/**
	 * Get eocsSubstr29
	 */
	@Column(name = "EOCS_SUBSTR29")
	public String getEocsSubstr29() {
		return eocsSubstr29;
	}

	/**
	 * Set eocsSubstr29
	 */
	public void setEocsSubstr29(String eocsSubstr29) {
		this.eocsSubstr29 = eocsSubstr29;
		addValidField("eocsSubstr29");
	}

	/**
	 * Get eocsSubstr30
	 */
	@Column(name = "EOCS_SUBSTR30")
	public String getEocsSubstr30() {
		return eocsSubstr30;
	}

	/**
	 * Set eocsSubstr30
	 */
	public void setEocsSubstr30(String eocsSubstr30) {
		this.eocsSubstr30 = eocsSubstr30;
		addValidField("eocsSubstr30");
	}

	/**
	 * Get eocsConsigneeMailbox
	 */
	@Column(name = "EOCS_CONSIGNEE_MAILBOX")
	public String getEocsConsigneeMailbox() {
		return eocsConsigneeMailbox;
	}

	/**
	 * Set eocsConsigneeMailbox
	 */
	public void setEocsConsigneeMailbox(String eocsConsigneeMailbox) {
		this.eocsConsigneeMailbox = eocsConsigneeMailbox;
		addValidField("eocsConsigneeMailbox");
	}

	/**
	 * Get eocsConsigneeEbcuMailbox
	 */
	@Column(name = "EOCS_CONSIGNEE_EBCU_MAILBOX")
	public String getEocsConsigneeEbcuMailbox() {
		return eocsConsigneeEbcuMailbox;
	}

	/**
	 * Set eocsConsigneeEbcuMailbox
	 */
	public void setEocsConsigneeEbcuMailbox(String eocsConsigneeEbcuMailbox) {
		this.eocsConsigneeEbcuMailbox = eocsConsigneeEbcuMailbox;
		addValidField("eocsConsigneeEbcuMailbox");
	}
	/**
	 * Get eocsIsIssuedEnd
	 */
	@Column(name = "EOCS_IS_ISSUED_END")
	public String getEocsIsIssuedEnd() {
		return eocsIsIssuedEnd;
	}

	/**
	 * Set eocsIsIssuedEnd
	 */
	public void setEocsIsIssuedEnd(String eocsIsIssuedEnd) {
		this.eocsIsIssuedEnd = eocsIsIssuedEnd;
		addValidField("eocsIsIssuedEnd");
	}

}
