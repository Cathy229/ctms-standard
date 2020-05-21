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
 * Model class for EoRequestStockin
 */
@Entity
@Table(name = "EO_REQUEST_STOCKIN")
public class EoRequestStockinModel extends BaseModel implements OperationLog {

	//eosiId
	private Long eosiId;
	//eosiEbtkId
	private Long eosiEbtkId;
	//eosiIsAutomatic
	private String eosiIsAutomatic;
	//eosiTaskStatus
	private String eosiTaskStatus;
	//eosiEbbuId
	private Long eosiEbbuId;
	//eosiEbbuNameCn
	private String eosiEbbuNameCn;
	//eosiEbbuCode
	private String eosiEbbuCode;
	//eosiEbbuDist1
	private String eosiEbbuDist1;
	//eosiEbbuDist2
	private String eosiEbbuDist2;
	//eosiEbbuDist3
	private String eosiEbbuDist3;
	//eosiEbbuDist4
	private String eosiEbbuDist4;
	//eosiEbbuDist5
	private String eosiEbbuDist5;
	//eosiToId
	private String eosiToId;
	//eosiEoorId
	private Long eosiEoorId;
	//eosiEscoId
	private Long eosiEscoId;
	//eosiNo
	private String eosiNo;
	//eosiType
	private String eosiType;
	//eosiStatus
	private String eosiStatus;
	//eosiOrder
	private Long eosiOrder;
	//eosiSoNo
	private String eosiSoNo;
	//eosiDoNo
	private String eosiDoNo;
	//eosiOwnerEbcuId
	private Long eosiOwnerEbcuId;
	//eosiOwnerEbcuCode
	private String eosiOwnerEbcuCode;
	//eosiOwnerEbcuName
	private String eosiOwnerEbcuName;
	//eosiSupplierEbcuId
	private Long eosiSupplierEbcuId;
	//eosiSupplierEbcuCode
	private String eosiSupplierEbcuCode;
	//eosiSupplierEbcuName
	private String eosiSupplierEbcuName;
	//eosiUrgency
	private String eosiUrgency;
	//eosiRemark
	private String eosiRemark;
	//eosiLibraryNo
	private String eosiLibraryNo;
	//eosiLibraryTime
	private Date eosiLibraryTime;
	//eosiLibraryNumber
	private Long eosiLibraryNumber;
	//eosiLibraryQuantity
	private Long eosiLibraryQuantity;
	//eosiLibraryVolume
	private Long eosiLibraryVolume;
	//eosiLibraryGw
	private Long eosiLibraryGw;
	//eosiLibraryNw
	private Long eosiLibraryNw;
	//eosiStockUpTime
	private Date eosiStockUpTime;
	//eosiSubstr1
	private String eosiSubstr1;
	//eosiSubstr2
	private String eosiSubstr2;
	//eosiSubstr3
	private String eosiSubstr3;
	//eosiSubstr4
	private String eosiSubstr4;
	//eosiSubstr5
	private String eosiSubstr5;
	//eosiSubstr6
	private String eosiSubstr6;
	//eosiSubstr8
	private String eosiSubstr8;
	//eosiSubstr7
	private String eosiSubstr7;
	//eosiSubdate1
	private Date eosiSubdate1;
	//eosiSubdate2
	private Date eosiSubdate2;
	//eosiSubdate3
	private Date eosiSubdate3;
	//eosiSubdate4
	private Date eosiSubdate4;
	//eosiSubnum1
	private Long eosiSubnum1;
	//eosiSubnum2
	private Long eosiSubnum2;
	//eosiSubnum3
	private Long eosiSubnum3;
	//eosiSubnum4
	private Long eosiSubnum4;
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
	//eosiLoEbppId
	private Long eosiLoEbppId;
	//eosiSysCode
	private String eosiSysCode;
	//eosiSubstr9
	private String eosiSubstr9;
	//eosiSubstr10
	private String eosiSubstr10;
	//eosiSubstr11
	private String eosiSubstr11;
	//eosiSubstr12
	private String eosiSubstr12;
	//eosiSubstr13
	private String eosiSubstr13;
	//eosiSubstr14
	private String eosiSubstr14;
	//eosiSubstr15
	private String eosiSubstr15;
	//eosiSubstr16
	private String eosiSubstr16;
	//eosiSubstr17
	private String eosiSubstr17;
	//eosiSubstr18
	private String eosiSubstr18;
	//eosiSubstr19
	private String eosiSubstr19;
	//eosiSubstr20
	private String eosiSubstr20;
	//eosiSubstr21
	private String eosiSubstr21;
	//eosiSubstr22
	private String eosiSubstr22;
	//eosiSubstr23
	private String eosiSubstr23;
	//eosiSubstr24
	private String eosiSubstr24;
	//eosiSubstr25
	private String eosiSubstr25;
	//eosiSubdate5
	private Date eosiSubdate5;
	//eosiSubdate6
	private Date eosiSubdate6;
	//eosiSubdate7
	private Date eosiSubdate7;
	//eosiSubdate8
	private Date eosiSubdate8;
	//eosiSubdate9
	private Date eosiSubdate9;
	//eosiSubdate10
	private Date eosiSubdate10;
	//eosiSubnum5
	private Long eosiSubnum5;
	//eosiSubnum6
	private Long eosiSubnum6;
	//eosiEbpjId
	private Long eosiEbpjId;
	//eosiSupplierEbspId
	private Long eosiSupplierEbspId;
	//eosiSupplierEbspNo
	private String eosiSupplierEbspNo;
	//eosiSupplierEbspNameCn
	private String eosiSupplierEbspNameCn;
	//eosiIsEnterArea
	private String eosiIsEnterArea;
	//eosiEnterAreaOperator
	private String eosiEnterAreaOperator;
	//eosiEnterAreaTime
	private Date eosiEnterAreaTime;
	//eosiIsStockin
	private String eosiIsStockin;
	//eosiStockinOperator
	private String eosiStockinOperator;
	//eosiStockinTime
	private Date eosiStockinTime;
	//eosiOrderDate
	private Date eosiOrderDate;
	//eosiReqDeliveryDate
	private Date eosiReqDeliveryDate;
	//eosiReqArrivalDate
	private Date eosiReqArrivalDate;
	//eosiShipperEbsaPost
	private String eosiShipperEbsaPost;
	//eosiShipperEbsaAddress
	private String eosiShipperEbsaAddress;
	//eosiShipperEbsaContact
	private String eosiShipperEbsaContact;
	//eosiShipperEbsaTel
	private String eosiShipperEbsaTel;
	//eosiShipperEbsaEmail
	private String eosiShipperEbsaEmail;
	//eosiShipperEbsaFax
	private String eosiShipperEbsaFax;
	//eosiShipperEbplNameCn
	private String eosiShipperEbplNameCn;
	//eosiShipperEbrgNameCn
	private String eosiShipperEbrgNameCn;
	//eosiTaskFeedback
	private String eosiTaskFeedback;
	//eosiEscoCode
	private String eosiEscoCode;
	//eosiEscoNameCn
	private String eosiEscoNameCn;
	//eosiEsdeDepartmentCode
	private String eosiEsdeDepartmentCode;
	//eosiEsdeDepartmentName
	private String eosiEsdeDepartmentName;
	//eosiEsusUserNameCn
	private String eosiEsusUserNameCn;
	//eosiRetoType
	private Long eosiRetoType;

	/**
	 * Get eosiId
	 */
	@Column(name = "EOSI_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEosiId() {
		return eosiId;
	}

	/**
	 * Set eosiId
	 */
	public void setEosiId(Long eosiId) {
		this.eosiId = eosiId;
		addValidField("eosiId");
	}

	/**
	 * Get eosiEbtkId
	 */
	@Column(name = "EOSI_EBTK_ID")
	public Long getEosiEbtkId() {
		return eosiEbtkId;
	}

	/**
	 * Set eosiEbtkId
	 */
	public void setEosiEbtkId(Long eosiEbtkId) {
		this.eosiEbtkId = eosiEbtkId;
		addValidField("eosiEbtkId");
	}

	/**
	 * Get eosiIsAutomatic
	 */
	@Column(name = "EOSI_IS_AUTOMATIC")
	public String getEosiIsAutomatic() {
		return eosiIsAutomatic;
	}

	/**
	 * Set eosiIsAutomatic
	 */
	public void setEosiIsAutomatic(String eosiIsAutomatic) {
		this.eosiIsAutomatic = eosiIsAutomatic;
		addValidField("eosiIsAutomatic");
	}

	/**
	 * Get eosiTaskStatus
	 */
	@Column(name = "EOSI_TASK_STATUS")
	public String getEosiTaskStatus() {
		return eosiTaskStatus;
	}

	/**
	 * Set eosiTaskStatus
	 */
	public void setEosiTaskStatus(String eosiTaskStatus) {
		this.eosiTaskStatus = eosiTaskStatus;
		addValidField("eosiTaskStatus");
	}

	/**
	 * Get eosiEbbuId
	 */
	@Column(name = "EOSI_EBBU_ID")
	public Long getEosiEbbuId() {
		return eosiEbbuId;
	}

	/**
	 * Set eosiEbbuId
	 */
	public void setEosiEbbuId(Long eosiEbbuId) {
		this.eosiEbbuId = eosiEbbuId;
		addValidField("eosiEbbuId");
	}

	/**
	 * Get eosiEbbuNameCn
	 */
	@Column(name = "EOSI_EBBU_NAME_CN")
	public String getEosiEbbuNameCn() {
		return eosiEbbuNameCn;
	}

	/**
	 * Set eosiEbbuNameCn
	 */
	public void setEosiEbbuNameCn(String eosiEbbuNameCn) {
		this.eosiEbbuNameCn = eosiEbbuNameCn;
		addValidField("eosiEbbuNameCn");
	}

	/**
	 * Get eosiEbbuCode
	 */
	@Column(name = "EOSI_EBBU_CODE")
	public String getEosiEbbuCode() {
		return eosiEbbuCode;
	}

	/**
	 * Set eosiEbbuCode
	 */
	public void setEosiEbbuCode(String eosiEbbuCode) {
		this.eosiEbbuCode = eosiEbbuCode;
		addValidField("eosiEbbuCode");
	}

	/**
	 * Get eosiEbbuDist1
	 */
	@Column(name = "EOSI_EBBU_DIST_1")
	public String getEosiEbbuDist1() {
		return eosiEbbuDist1;
	}

	/**
	 * Set eosiEbbuDist1
	 */
	public void setEosiEbbuDist1(String eosiEbbuDist1) {
		this.eosiEbbuDist1 = eosiEbbuDist1;
		addValidField("eosiEbbuDist1");
	}

	/**
	 * Get eosiEbbuDist2
	 */
	@Column(name = "EOSI_EBBU_DIST_2")
	public String getEosiEbbuDist2() {
		return eosiEbbuDist2;
	}

	/**
	 * Set eosiEbbuDist2
	 */
	public void setEosiEbbuDist2(String eosiEbbuDist2) {
		this.eosiEbbuDist2 = eosiEbbuDist2;
		addValidField("eosiEbbuDist2");
	}

	/**
	 * Get eosiEbbuDist3
	 */
	@Column(name = "EOSI_EBBU_DIST_3")
	public String getEosiEbbuDist3() {
		return eosiEbbuDist3;
	}

	/**
	 * Set eosiEbbuDist3
	 */
	public void setEosiEbbuDist3(String eosiEbbuDist3) {
		this.eosiEbbuDist3 = eosiEbbuDist3;
		addValidField("eosiEbbuDist3");
	}

	/**
	 * Get eosiEbbuDist4
	 */
	@Column(name = "EOSI_EBBU_DIST_4")
	public String getEosiEbbuDist4() {
		return eosiEbbuDist4;
	}

	/**
	 * Set eosiEbbuDist4
	 */
	public void setEosiEbbuDist4(String eosiEbbuDist4) {
		this.eosiEbbuDist4 = eosiEbbuDist4;
		addValidField("eosiEbbuDist4");
	}

	/**
	 * Get eosiEbbuDist5
	 */
	@Column(name = "EOSI_EBBU_DIST_5")
	public String getEosiEbbuDist5() {
		return eosiEbbuDist5;
	}

	/**
	 * Set eosiEbbuDist5
	 */
	public void setEosiEbbuDist5(String eosiEbbuDist5) {
		this.eosiEbbuDist5 = eosiEbbuDist5;
		addValidField("eosiEbbuDist5");
	}

	/**
	 * Get eosiToId
	 */
	@Column(name = "EOSI_TO_ID")
	public String getEosiToId() {
		return eosiToId;
	}

	/**
	 * Set eosiToId
	 */
	public void setEosiToId(String eosiToId) {
		this.eosiToId = eosiToId;
		addValidField("eosiToId");
	}

	/**
	 * Get eosiEoorId
	 */
	@Column(name = "EOSI_EOOR_ID")
	public Long getEosiEoorId() {
		return eosiEoorId;
	}

	/**
	 * Set eosiEoorId
	 */
	public void setEosiEoorId(Long eosiEoorId) {
		this.eosiEoorId = eosiEoorId;
		addValidField("eosiEoorId");
	}

	/**
	 * Get eosiEscoId
	 */
	@Column(name = "EOSI_ESCO_ID")
	public Long getEosiEscoId() {
		return eosiEscoId;
	}

	/**
	 * Set eosiEscoId
	 */
	public void setEosiEscoId(Long eosiEscoId) {
		this.eosiEscoId = eosiEscoId;
		addValidField("eosiEscoId");
	}

	/**
	 * Get eosiNo
	 */
	@Column(name = "EOSI_NO")
	public String getEosiNo() {
		return eosiNo;
	}

	/**
	 * Set eosiNo
	 */
	public void setEosiNo(String eosiNo) {
		this.eosiNo = eosiNo;
		addValidField("eosiNo");
	}

	/**
	 * Get eosiType
	 */
	@Column(name = "EOSI_TYPE")
	public String getEosiType() {
		return eosiType;
	}

	/**
	 * Set eosiType
	 */
	public void setEosiType(String eosiType) {
		this.eosiType = eosiType;
		addValidField("eosiType");
	}

	/**
	 * Get eosiStatus
	 */
	@Column(name = "EOSI_STATUS")
	public String getEosiStatus() {
		return eosiStatus;
	}

	/**
	 * Set eosiStatus
	 */
	public void setEosiStatus(String eosiStatus) {
		this.eosiStatus = eosiStatus;
		addValidField("eosiStatus");
	}

	/**
	 * Get eosiOrder
	 */
	@Column(name = "EOSI_ORDER")
	public Long getEosiOrder() {
		return eosiOrder;
	}

	/**
	 * Set eosiOrder
	 */
	public void setEosiOrder(Long eosiOrder) {
		this.eosiOrder = eosiOrder;
		addValidField("eosiOrder");
	}

	/**
	 * Get eosiSoNo
	 */
	@Column(name = "EOSI_SO_NO")
	public String getEosiSoNo() {
		return eosiSoNo;
	}

	/**
	 * Set eosiSoNo
	 */
	public void setEosiSoNo(String eosiSoNo) {
		this.eosiSoNo = eosiSoNo;
		addValidField("eosiSoNo");
	}

	/**
	 * Get eosiDoNo
	 */
	@Column(name = "EOSI_DO_NO")
	public String getEosiDoNo() {
		return eosiDoNo;
	}

	/**
	 * Set eosiDoNo
	 */
	public void setEosiDoNo(String eosiDoNo) {
		this.eosiDoNo = eosiDoNo;
		addValidField("eosiDoNo");
	}

	/**
	 * Get eosiOwnerEbcuId
	 */
	@Column(name = "EOSI_OWNER_EBCU_ID")
	public Long getEosiOwnerEbcuId() {
		return eosiOwnerEbcuId;
	}

	/**
	 * Set eosiOwnerEbcuId
	 */
	public void setEosiOwnerEbcuId(Long eosiOwnerEbcuId) {
		this.eosiOwnerEbcuId = eosiOwnerEbcuId;
		addValidField("eosiOwnerEbcuId");
	}

	/**
	 * Get eosiOwnerEbcuCode
	 */
	@Column(name = "EOSI_OWNER_EBCU_CODE")
	public String getEosiOwnerEbcuCode() {
		return eosiOwnerEbcuCode;
	}

	/**
	 * Set eosiOwnerEbcuCode
	 */
	public void setEosiOwnerEbcuCode(String eosiOwnerEbcuCode) {
		this.eosiOwnerEbcuCode = eosiOwnerEbcuCode;
		addValidField("eosiOwnerEbcuCode");
	}

	/**
	 * Get eosiOwnerEbcuName
	 */
	@Column(name = "EOSI_OWNER_EBCU_NAME")
	public String getEosiOwnerEbcuName() {
		return eosiOwnerEbcuName;
	}

	/**
	 * Set eosiOwnerEbcuName
	 */
	public void setEosiOwnerEbcuName(String eosiOwnerEbcuName) {
		this.eosiOwnerEbcuName = eosiOwnerEbcuName;
		addValidField("eosiOwnerEbcuName");
	}

	/**
	 * Get eosiSupplierEbcuId
	 */
	@Column(name = "EOSI_SUPPLIER_EBCU_ID")
	public Long getEosiSupplierEbcuId() {
		return eosiSupplierEbcuId;
	}

	/**
	 * Set eosiSupplierEbcuId
	 */
	public void setEosiSupplierEbcuId(Long eosiSupplierEbcuId) {
		this.eosiSupplierEbcuId = eosiSupplierEbcuId;
		addValidField("eosiSupplierEbcuId");
	}

	/**
	 * Get eosiSupplierEbcuCode
	 */
	@Column(name = "EOSI_SUPPLIER_EBCU_CODE")
	public String getEosiSupplierEbcuCode() {
		return eosiSupplierEbcuCode;
	}

	/**
	 * Set eosiSupplierEbcuCode
	 */
	public void setEosiSupplierEbcuCode(String eosiSupplierEbcuCode) {
		this.eosiSupplierEbcuCode = eosiSupplierEbcuCode;
		addValidField("eosiSupplierEbcuCode");
	}

	/**
	 * Get eosiSupplierEbcuName
	 */
	@Column(name = "EOSI_SUPPLIER_EBCU_NAME")
	public String getEosiSupplierEbcuName() {
		return eosiSupplierEbcuName;
	}

	/**
	 * Set eosiSupplierEbcuName
	 */
	public void setEosiSupplierEbcuName(String eosiSupplierEbcuName) {
		this.eosiSupplierEbcuName = eosiSupplierEbcuName;
		addValidField("eosiSupplierEbcuName");
	}

	/**
	 * Get eosiUrgency
	 */
	@Column(name = "EOSI_URGENCY")
	public String getEosiUrgency() {
		return eosiUrgency;
	}

	/**
	 * Set eosiUrgency
	 */
	public void setEosiUrgency(String eosiUrgency) {
		this.eosiUrgency = eosiUrgency;
		addValidField("eosiUrgency");
	}

	/**
	 * Get eosiRemark
	 */
	@Column(name = "EOSI_REMARK")
	public String getEosiRemark() {
		return eosiRemark;
	}

	/**
	 * Set eosiRemark
	 */
	public void setEosiRemark(String eosiRemark) {
		this.eosiRemark = eosiRemark;
		addValidField("eosiRemark");
	}

	/**
	 * Get eosiLibraryNo
	 */
	@Column(name = "EOSI_LIBRARY_NO")
	public String getEosiLibraryNo() {
		return eosiLibraryNo;
	}

	/**
	 * Set eosiLibraryNo
	 */
	public void setEosiLibraryNo(String eosiLibraryNo) {
		this.eosiLibraryNo = eosiLibraryNo;
		addValidField("eosiLibraryNo");
	}

	/**
	 * Get eosiLibraryTime
	 */
	@Column(name = "EOSI_LIBRARY_TIME")
	public Date getEosiLibraryTime() {
		return eosiLibraryTime;
	}

	/**
	 * Set eosiLibraryTime
	 */
	public void setEosiLibraryTime(Date eosiLibraryTime) {
		this.eosiLibraryTime = eosiLibraryTime;
		addValidField("eosiLibraryTime");
	}

	/**
	 * Get eosiLibraryNumber
	 */
	@Column(name = "EOSI_LIBRARY_NUMBER")
	public Long getEosiLibraryNumber() {
		return eosiLibraryNumber;
	}

	/**
	 * Set eosiLibraryNumber
	 */
	public void setEosiLibraryNumber(Long eosiLibraryNumber) {
		this.eosiLibraryNumber = eosiLibraryNumber;
		addValidField("eosiLibraryNumber");
	}

	/**
	 * Get eosiLibraryQuantity
	 */
	@Column(name = "EOSI_LIBRARY_QUANTITY")
	public Long getEosiLibraryQuantity() {
		return eosiLibraryQuantity;
	}

	/**
	 * Set eosiLibraryQuantity
	 */
	public void setEosiLibraryQuantity(Long eosiLibraryQuantity) {
		this.eosiLibraryQuantity = eosiLibraryQuantity;
		addValidField("eosiLibraryQuantity");
	}

	/**
	 * Get eosiLibraryVolume
	 */
	@Column(name = "EOSI_LIBRARY_VOLUME")
	public Long getEosiLibraryVolume() {
		return eosiLibraryVolume;
	}

	/**
	 * Set eosiLibraryVolume
	 */
	public void setEosiLibraryVolume(Long eosiLibraryVolume) {
		this.eosiLibraryVolume = eosiLibraryVolume;
		addValidField("eosiLibraryVolume");
	}

	/**
	 * Get eosiLibraryGw
	 */
	@Column(name = "EOSI_LIBRARY_GW")
	public Long getEosiLibraryGw() {
		return eosiLibraryGw;
	}

	/**
	 * Set eosiLibraryGw
	 */
	public void setEosiLibraryGw(Long eosiLibraryGw) {
		this.eosiLibraryGw = eosiLibraryGw;
		addValidField("eosiLibraryGw");
	}

	/**
	 * Get eosiLibraryNw
	 */
	@Column(name = "EOSI_LIBRARY_NW")
	public Long getEosiLibraryNw() {
		return eosiLibraryNw;
	}

	/**
	 * Set eosiLibraryNw
	 */
	public void setEosiLibraryNw(Long eosiLibraryNw) {
		this.eosiLibraryNw = eosiLibraryNw;
		addValidField("eosiLibraryNw");
	}

	/**
	 * Get eosiStockUpTime
	 */
	@Column(name = "EOSI_STOCK_UP_TIME")
	public Date getEosiStockUpTime() {
		return eosiStockUpTime;
	}

	/**
	 * Set eosiStockUpTime
	 */
	public void setEosiStockUpTime(Date eosiStockUpTime) {
		this.eosiStockUpTime = eosiStockUpTime;
		addValidField("eosiStockUpTime");
	}

	/**
	 * Get eosiSubstr1
	 */
	@Column(name = "EOSI_SUBSTR1")
	public String getEosiSubstr1() {
		return eosiSubstr1;
	}

	/**
	 * Set eosiSubstr1
	 */
	public void setEosiSubstr1(String eosiSubstr1) {
		this.eosiSubstr1 = eosiSubstr1;
		addValidField("eosiSubstr1");
	}

	/**
	 * Get eosiSubstr2
	 */
	@Column(name = "EOSI_SUBSTR2")
	public String getEosiSubstr2() {
		return eosiSubstr2;
	}

	/**
	 * Set eosiSubstr2
	 */
	public void setEosiSubstr2(String eosiSubstr2) {
		this.eosiSubstr2 = eosiSubstr2;
		addValidField("eosiSubstr2");
	}

	/**
	 * Get eosiSubstr3
	 */
	@Column(name = "EOSI_SUBSTR3")
	public String getEosiSubstr3() {
		return eosiSubstr3;
	}

	/**
	 * Set eosiSubstr3
	 */
	public void setEosiSubstr3(String eosiSubstr3) {
		this.eosiSubstr3 = eosiSubstr3;
		addValidField("eosiSubstr3");
	}

	/**
	 * Get eosiSubstr4
	 */
	@Column(name = "EOSI_SUBSTR4")
	public String getEosiSubstr4() {
		return eosiSubstr4;
	}

	/**
	 * Set eosiSubstr4
	 */
	public void setEosiSubstr4(String eosiSubstr4) {
		this.eosiSubstr4 = eosiSubstr4;
		addValidField("eosiSubstr4");
	}

	/**
	 * Get eosiSubstr5
	 */
	@Column(name = "EOSI_SUBSTR5")
	public String getEosiSubstr5() {
		return eosiSubstr5;
	}

	/**
	 * Set eosiSubstr5
	 */
	public void setEosiSubstr5(String eosiSubstr5) {
		this.eosiSubstr5 = eosiSubstr5;
		addValidField("eosiSubstr5");
	}

	/**
	 * Get eosiSubstr6
	 */
	@Column(name = "EOSI_SUBSTR6")
	public String getEosiSubstr6() {
		return eosiSubstr6;
	}

	/**
	 * Set eosiSubstr6
	 */
	public void setEosiSubstr6(String eosiSubstr6) {
		this.eosiSubstr6 = eosiSubstr6;
		addValidField("eosiSubstr6");
	}

	/**
	 * Get eosiSubstr8
	 */
	@Column(name = "EOSI_SUBSTR8")
	public String getEosiSubstr8() {
		return eosiSubstr8;
	}

	/**
	 * Set eosiSubstr8
	 */
	public void setEosiSubstr8(String eosiSubstr8) {
		this.eosiSubstr8 = eosiSubstr8;
		addValidField("eosiSubstr8");
	}

	/**
	 * Get eosiSubstr7
	 */
	@Column(name = "EOSI_SUBSTR7")
	public String getEosiSubstr7() {
		return eosiSubstr7;
	}

	/**
	 * Set eosiSubstr7
	 */
	public void setEosiSubstr7(String eosiSubstr7) {
		this.eosiSubstr7 = eosiSubstr7;
		addValidField("eosiSubstr7");
	}

	/**
	 * Get eosiSubdate1
	 */
	@Column(name = "EOSI_SUBDATE1")
	public Date getEosiSubdate1() {
		return eosiSubdate1;
	}

	/**
	 * Set eosiSubdate1
	 */
	public void setEosiSubdate1(Date eosiSubdate1) {
		this.eosiSubdate1 = eosiSubdate1;
		addValidField("eosiSubdate1");
	}

	/**
	 * Get eosiSubdate2
	 */
	@Column(name = "EOSI_SUBDATE2")
	public Date getEosiSubdate2() {
		return eosiSubdate2;
	}

	/**
	 * Set eosiSubdate2
	 */
	public void setEosiSubdate2(Date eosiSubdate2) {
		this.eosiSubdate2 = eosiSubdate2;
		addValidField("eosiSubdate2");
	}

	/**
	 * Get eosiSubdate3
	 */
	@Column(name = "EOSI_SUBDATE3")
	public Date getEosiSubdate3() {
		return eosiSubdate3;
	}

	/**
	 * Set eosiSubdate3
	 */
	public void setEosiSubdate3(Date eosiSubdate3) {
		this.eosiSubdate3 = eosiSubdate3;
		addValidField("eosiSubdate3");
	}

	/**
	 * Get eosiSubdate4
	 */
	@Column(name = "EOSI_SUBDATE4")
	public Date getEosiSubdate4() {
		return eosiSubdate4;
	}

	/**
	 * Set eosiSubdate4
	 */
	public void setEosiSubdate4(Date eosiSubdate4) {
		this.eosiSubdate4 = eosiSubdate4;
		addValidField("eosiSubdate4");
	}

	/**
	 * Get eosiSubnum1
	 */
	@Column(name = "EOSI_SUBNUM1")
	public Long getEosiSubnum1() {
		return eosiSubnum1;
	}

	/**
	 * Set eosiSubnum1
	 */
	public void setEosiSubnum1(Long eosiSubnum1) {
		this.eosiSubnum1 = eosiSubnum1;
		addValidField("eosiSubnum1");
	}

	/**
	 * Get eosiSubnum2
	 */
	@Column(name = "EOSI_SUBNUM2")
	public Long getEosiSubnum2() {
		return eosiSubnum2;
	}

	/**
	 * Set eosiSubnum2
	 */
	public void setEosiSubnum2(Long eosiSubnum2) {
		this.eosiSubnum2 = eosiSubnum2;
		addValidField("eosiSubnum2");
	}

	/**
	 * Get eosiSubnum3
	 */
	@Column(name = "EOSI_SUBNUM3")
	public Long getEosiSubnum3() {
		return eosiSubnum3;
	}

	/**
	 * Set eosiSubnum3
	 */
	public void setEosiSubnum3(Long eosiSubnum3) {
		this.eosiSubnum3 = eosiSubnum3;
		addValidField("eosiSubnum3");
	}

	/**
	 * Get eosiSubnum4
	 */
	@Column(name = "EOSI_SUBNUM4")
	public Long getEosiSubnum4() {
		return eosiSubnum4;
	}

	/**
	 * Set eosiSubnum4
	 */
	public void setEosiSubnum4(Long eosiSubnum4) {
		this.eosiSubnum4 = eosiSubnum4;
		addValidField("eosiSubnum4");
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
	 * Get eosiLoEbppId
	 */
	@Column(name = "EOSI_LO_EBPP_ID")
	public Long getEosiLoEbppId() {
		return eosiLoEbppId;
	}

	/**
	 * Set eosiLoEbppId
	 */
	public void setEosiLoEbppId(Long eosiLoEbppId) {
		this.eosiLoEbppId = eosiLoEbppId;
		addValidField("eosiLoEbppId");
	}

	/**
	 * Get eosiSysCode
	 */
	@Column(name = "EOSI_SYS_CODE")
	public String getEosiSysCode() {
		return eosiSysCode;
	}

	/**
	 * Set eosiSysCode
	 */
	public void setEosiSysCode(String eosiSysCode) {
		this.eosiSysCode = eosiSysCode;
		addValidField("eosiSysCode");
	}

	/**
	 * Get eosiSubstr9
	 */
	@Column(name = "EOSI_SUBSTR9")
	public String getEosiSubstr9() {
		return eosiSubstr9;
	}

	/**
	 * Set eosiSubstr9
	 */
	public void setEosiSubstr9(String eosiSubstr9) {
		this.eosiSubstr9 = eosiSubstr9;
		addValidField("eosiSubstr9");
	}

	/**
	 * Get eosiSubstr10
	 */
	@Column(name = "EOSI_SUBSTR10")
	public String getEosiSubstr10() {
		return eosiSubstr10;
	}

	/**
	 * Set eosiSubstr10
	 */
	public void setEosiSubstr10(String eosiSubstr10) {
		this.eosiSubstr10 = eosiSubstr10;
		addValidField("eosiSubstr10");
	}

	/**
	 * Get eosiSubstr11
	 */
	@Column(name = "EOSI_SUBSTR11")
	public String getEosiSubstr11() {
		return eosiSubstr11;
	}

	/**
	 * Set eosiSubstr11
	 */
	public void setEosiSubstr11(String eosiSubstr11) {
		this.eosiSubstr11 = eosiSubstr11;
		addValidField("eosiSubstr11");
	}

	/**
	 * Get eosiSubstr12
	 */
	@Column(name = "EOSI_SUBSTR12")
	public String getEosiSubstr12() {
		return eosiSubstr12;
	}

	/**
	 * Set eosiSubstr12
	 */
	public void setEosiSubstr12(String eosiSubstr12) {
		this.eosiSubstr12 = eosiSubstr12;
		addValidField("eosiSubstr12");
	}

	/**
	 * Get eosiSubstr13
	 */
	@Column(name = "EOSI_SUBSTR13")
	public String getEosiSubstr13() {
		return eosiSubstr13;
	}

	/**
	 * Set eosiSubstr13
	 */
	public void setEosiSubstr13(String eosiSubstr13) {
		this.eosiSubstr13 = eosiSubstr13;
		addValidField("eosiSubstr13");
	}

	/**
	 * Get eosiSubstr14
	 */
	@Column(name = "EOSI_SUBSTR14")
	public String getEosiSubstr14() {
		return eosiSubstr14;
	}

	/**
	 * Set eosiSubstr14
	 */
	public void setEosiSubstr14(String eosiSubstr14) {
		this.eosiSubstr14 = eosiSubstr14;
		addValidField("eosiSubstr14");
	}

	/**
	 * Get eosiSubstr15
	 */
	@Column(name = "EOSI_SUBSTR15")
	public String getEosiSubstr15() {
		return eosiSubstr15;
	}

	/**
	 * Set eosiSubstr15
	 */
	public void setEosiSubstr15(String eosiSubstr15) {
		this.eosiSubstr15 = eosiSubstr15;
		addValidField("eosiSubstr15");
	}

	/**
	 * Get eosiSubstr16
	 */
	@Column(name = "EOSI_SUBSTR16")
	public String getEosiSubstr16() {
		return eosiSubstr16;
	}

	/**
	 * Set eosiSubstr16
	 */
	public void setEosiSubstr16(String eosiSubstr16) {
		this.eosiSubstr16 = eosiSubstr16;
		addValidField("eosiSubstr16");
	}

	/**
	 * Get eosiSubstr17
	 */
	@Column(name = "EOSI_SUBSTR17")
	public String getEosiSubstr17() {
		return eosiSubstr17;
	}

	/**
	 * Set eosiSubstr17
	 */
	public void setEosiSubstr17(String eosiSubstr17) {
		this.eosiSubstr17 = eosiSubstr17;
		addValidField("eosiSubstr17");
	}

	/**
	 * Get eosiSubstr18
	 */
	@Column(name = "EOSI_SUBSTR18")
	public String getEosiSubstr18() {
		return eosiSubstr18;
	}

	/**
	 * Set eosiSubstr18
	 */
	public void setEosiSubstr18(String eosiSubstr18) {
		this.eosiSubstr18 = eosiSubstr18;
		addValidField("eosiSubstr18");
	}

	/**
	 * Get eosiSubstr19
	 */
	@Column(name = "EOSI_SUBSTR19")
	public String getEosiSubstr19() {
		return eosiSubstr19;
	}

	/**
	 * Set eosiSubstr19
	 */
	public void setEosiSubstr19(String eosiSubstr19) {
		this.eosiSubstr19 = eosiSubstr19;
		addValidField("eosiSubstr19");
	}

	/**
	 * Get eosiSubstr20
	 */
	@Column(name = "EOSI_SUBSTR20")
	public String getEosiSubstr20() {
		return eosiSubstr20;
	}

	/**
	 * Set eosiSubstr20
	 */
	public void setEosiSubstr20(String eosiSubstr20) {
		this.eosiSubstr20 = eosiSubstr20;
		addValidField("eosiSubstr20");
	}

	/**
	 * Get eosiSubstr21
	 */
	@Column(name = "EOSI_SUBSTR21")
	public String getEosiSubstr21() {
		return eosiSubstr21;
	}

	/**
	 * Set eosiSubstr21
	 */
	public void setEosiSubstr21(String eosiSubstr21) {
		this.eosiSubstr21 = eosiSubstr21;
		addValidField("eosiSubstr21");
	}

	/**
	 * Get eosiSubstr22
	 */
	@Column(name = "EOSI_SUBSTR22")
	public String getEosiSubstr22() {
		return eosiSubstr22;
	}

	/**
	 * Set eosiSubstr22
	 */
	public void setEosiSubstr22(String eosiSubstr22) {
		this.eosiSubstr22 = eosiSubstr22;
		addValidField("eosiSubstr22");
	}

	/**
	 * Get eosiSubstr23
	 */
	@Column(name = "EOSI_SUBSTR23")
	public String getEosiSubstr23() {
		return eosiSubstr23;
	}

	/**
	 * Set eosiSubstr23
	 */
	public void setEosiSubstr23(String eosiSubstr23) {
		this.eosiSubstr23 = eosiSubstr23;
		addValidField("eosiSubstr23");
	}

	/**
	 * Get eosiSubstr24
	 */
	@Column(name = "EOSI_SUBSTR24")
	public String getEosiSubstr24() {
		return eosiSubstr24;
	}

	/**
	 * Set eosiSubstr24
	 */
	public void setEosiSubstr24(String eosiSubstr24) {
		this.eosiSubstr24 = eosiSubstr24;
		addValidField("eosiSubstr24");
	}

	/**
	 * Get eosiSubstr25
	 */
	@Column(name = "EOSI_SUBSTR25")
	public String getEosiSubstr25() {
		return eosiSubstr25;
	}

	/**
	 * Set eosiSubstr25
	 */
	public void setEosiSubstr25(String eosiSubstr25) {
		this.eosiSubstr25 = eosiSubstr25;
		addValidField("eosiSubstr25");
	}

	/**
	 * Get eosiSubdate5
	 */
	@Column(name = "EOSI_SUBDATE5")
	public Date getEosiSubdate5() {
		return eosiSubdate5;
	}

	/**
	 * Set eosiSubdate5
	 */
	public void setEosiSubdate5(Date eosiSubdate5) {
		this.eosiSubdate5 = eosiSubdate5;
		addValidField("eosiSubdate5");
	}

	/**
	 * Get eosiSubdate6
	 */
	@Column(name = "EOSI_SUBDATE6")
	public Date getEosiSubdate6() {
		return eosiSubdate6;
	}

	/**
	 * Set eosiSubdate6
	 */
	public void setEosiSubdate6(Date eosiSubdate6) {
		this.eosiSubdate6 = eosiSubdate6;
		addValidField("eosiSubdate6");
	}

	/**
	 * Get eosiSubdate7
	 */
	@Column(name = "EOSI_SUBDATE7")
	public Date getEosiSubdate7() {
		return eosiSubdate7;
	}

	/**
	 * Set eosiSubdate7
	 */
	public void setEosiSubdate7(Date eosiSubdate7) {
		this.eosiSubdate7 = eosiSubdate7;
		addValidField("eosiSubdate7");
	}

	/**
	 * Get eosiSubdate8
	 */
	@Column(name = "EOSI_SUBDATE8")
	public Date getEosiSubdate8() {
		return eosiSubdate8;
	}

	/**
	 * Set eosiSubdate8
	 */
	public void setEosiSubdate8(Date eosiSubdate8) {
		this.eosiSubdate8 = eosiSubdate8;
		addValidField("eosiSubdate8");
	}

	/**
	 * Get eosiSubdate9
	 */
	@Column(name = "EOSI_SUBDATE9")
	public Date getEosiSubdate9() {
		return eosiSubdate9;
	}

	/**
	 * Set eosiSubdate9
	 */
	public void setEosiSubdate9(Date eosiSubdate9) {
		this.eosiSubdate9 = eosiSubdate9;
		addValidField("eosiSubdate9");
	}

	/**
	 * Get eosiSubdate10
	 */
	@Column(name = "EOSI_SUBDATE10")
	public Date getEosiSubdate10() {
		return eosiSubdate10;
	}

	/**
	 * Set eosiSubdate10
	 */
	public void setEosiSubdate10(Date eosiSubdate10) {
		this.eosiSubdate10 = eosiSubdate10;
		addValidField("eosiSubdate10");
	}

	/**
	 * Get eosiSubnum5
	 */
	@Column(name = "EOSI_SUBNUM5")
	public Long getEosiSubnum5() {
		return eosiSubnum5;
	}

	/**
	 * Set eosiSubnum5
	 */
	public void setEosiSubnum5(Long eosiSubnum5) {
		this.eosiSubnum5 = eosiSubnum5;
		addValidField("eosiSubnum5");
	}

	/**
	 * Get eosiSubnum6
	 */
	@Column(name = "EOSI_SUBNUM6")
	public Long getEosiSubnum6() {
		return eosiSubnum6;
	}

	/**
	 * Set eosiSubnum6
	 */
	public void setEosiSubnum6(Long eosiSubnum6) {
		this.eosiSubnum6 = eosiSubnum6;
		addValidField("eosiSubnum6");
	}

	/**
	 * Get eosiEbpjId
	 */
	@Column(name = "EOSI_EBPJ_ID")
	public Long getEosiEbpjId() {
		return eosiEbpjId;
	}

	/**
	 * Set eosiEbpjId
	 */
	public void setEosiEbpjId(Long eosiEbpjId) {
		this.eosiEbpjId = eosiEbpjId;
		addValidField("eosiEbpjId");
	}

	/**
	 * Get eosiSupplierEbspId
	 */
	@Column(name = "EOSI_SUPPLIER_EBSP_ID")
	public Long getEosiSupplierEbspId() {
		return eosiSupplierEbspId;
	}

	/**
	 * Set eosiSupplierEbspId
	 */
	public void setEosiSupplierEbspId(Long eosiSupplierEbspId) {
		this.eosiSupplierEbspId = eosiSupplierEbspId;
		addValidField("eosiSupplierEbspId");
	}

	/**
	 * Get eosiSupplierEbspNo
	 */
	@Column(name = "EOSI_SUPPLIER_EBSP_NO")
	public String getEosiSupplierEbspNo() {
		return eosiSupplierEbspNo;
	}

	/**
	 * Set eosiSupplierEbspNo
	 */
	public void setEosiSupplierEbspNo(String eosiSupplierEbspNo) {
		this.eosiSupplierEbspNo = eosiSupplierEbspNo;
		addValidField("eosiSupplierEbspNo");
	}

	/**
	 * Get eosiSupplierEbspNameCn
	 */
	@Column(name = "EOSI_SUPPLIER_EBSP_NAME_CN")
	public String getEosiSupplierEbspNameCn() {
		return eosiSupplierEbspNameCn;
	}

	/**
	 * Set eosiSupplierEbspNameCn
	 */
	public void setEosiSupplierEbspNameCn(String eosiSupplierEbspNameCn) {
		this.eosiSupplierEbspNameCn = eosiSupplierEbspNameCn;
		addValidField("eosiSupplierEbspNameCn");
	}

	/**
	 * Get eosiIsEnterArea
	 */
	@Column(name = "EOSI_IS_ENTER_AREA")
	public String getEosiIsEnterArea() {
		return eosiIsEnterArea;
	}

	/**
	 * Set eosiIsEnterArea
	 */
	public void setEosiIsEnterArea(String eosiIsEnterArea) {
		this.eosiIsEnterArea = eosiIsEnterArea;
		addValidField("eosiIsEnterArea");
	}

	/**
	 * Get eosiEnterAreaOperator
	 */
	@Column(name = "EOSI_ENTER_AREA_OPERATOR")
	public String getEosiEnterAreaOperator() {
		return eosiEnterAreaOperator;
	}

	/**
	 * Set eosiEnterAreaOperator
	 */
	public void setEosiEnterAreaOperator(String eosiEnterAreaOperator) {
		this.eosiEnterAreaOperator = eosiEnterAreaOperator;
		addValidField("eosiEnterAreaOperator");
	}

	/**
	 * Get eosiEnterAreaTime
	 */
	@Column(name = "EOSI_ENTER_AREA_TIME")
	public Date getEosiEnterAreaTime() {
		return eosiEnterAreaTime;
	}

	/**
	 * Set eosiEnterAreaTime
	 */
	public void setEosiEnterAreaTime(Date eosiEnterAreaTime) {
		this.eosiEnterAreaTime = eosiEnterAreaTime;
		addValidField("eosiEnterAreaTime");
	}

	/**
	 * Get eosiIsStockin
	 */
	@Column(name = "EOSI_IS_STOCKIN")
	public String getEosiIsStockin() {
		return eosiIsStockin;
	}

	/**
	 * Set eosiIsStockin
	 */
	public void setEosiIsStockin(String eosiIsStockin) {
		this.eosiIsStockin = eosiIsStockin;
		addValidField("eosiIsStockin");
	}

	/**
	 * Get eosiStockinOperator
	 */
	@Column(name = "EOSI_STOCKIN_OPERATOR")
	public String getEosiStockinOperator() {
		return eosiStockinOperator;
	}

	/**
	 * Set eosiStockinOperator
	 */
	public void setEosiStockinOperator(String eosiStockinOperator) {
		this.eosiStockinOperator = eosiStockinOperator;
		addValidField("eosiStockinOperator");
	}

	/**
	 * Get eosiStockinTime
	 */
	@Column(name = "EOSI_STOCKIN_TIME")
	public Date getEosiStockinTime() {
		return eosiStockinTime;
	}

	/**
	 * Set eosiStockinTime
	 */
	public void setEosiStockinTime(Date eosiStockinTime) {
		this.eosiStockinTime = eosiStockinTime;
		addValidField("eosiStockinTime");
	}

	/**
	 * Get eosiOrderDate
	 */
	@Column(name = "EOSI_ORDER_DATE")
	public Date getEosiOrderDate() {
		return eosiOrderDate;
	}

	/**
	 * Set eosiOrderDate
	 */
	public void setEosiOrderDate(Date eosiOrderDate) {
		this.eosiOrderDate = eosiOrderDate;
		addValidField("eosiOrderDate");
	}

	/**
	 * Get eosiReqDeliveryDate
	 */
	@Column(name = "EOSI_REQ_DELIVERY_DATE")
	public Date getEosiReqDeliveryDate() {
		return eosiReqDeliveryDate;
	}

	/**
	 * Set eosiReqDeliveryDate
	 */
	public void setEosiReqDeliveryDate(Date eosiReqDeliveryDate) {
		this.eosiReqDeliveryDate = eosiReqDeliveryDate;
		addValidField("eosiReqDeliveryDate");
	}

	/**
	 * Get eosiReqArrivalDate
	 */
	@Column(name = "EOSI_REQ_ARRIVAL_DATE")
	public Date getEosiReqArrivalDate() {
		return eosiReqArrivalDate;
	}

	/**
	 * Set eosiReqArrivalDate
	 */
	public void setEosiReqArrivalDate(Date eosiReqArrivalDate) {
		this.eosiReqArrivalDate = eosiReqArrivalDate;
		addValidField("eosiReqArrivalDate");
	}

	/**
	 * Get eosiShipperEbsaPost
	 */
	@Column(name = "EOSI_SHIPPER_EBSA_POST")
	public String getEosiShipperEbsaPost() {
		return eosiShipperEbsaPost;
	}

	/**
	 * Set eosiShipperEbsaPost
	 */
	public void setEosiShipperEbsaPost(String eosiShipperEbsaPost) {
		this.eosiShipperEbsaPost = eosiShipperEbsaPost;
		addValidField("eosiShipperEbsaPost");
	}

	/**
	 * Get eosiShipperEbsaAddress
	 */
	@Column(name = "EOSI_SHIPPER_EBSA_ADDRESS")
	public String getEosiShipperEbsaAddress() {
		return eosiShipperEbsaAddress;
	}

	/**
	 * Set eosiShipperEbsaAddress
	 */
	public void setEosiShipperEbsaAddress(String eosiShipperEbsaAddress) {
		this.eosiShipperEbsaAddress = eosiShipperEbsaAddress;
		addValidField("eosiShipperEbsaAddress");
	}

	/**
	 * Get eosiShipperEbsaContact
	 */
	@Column(name = "EOSI_SHIPPER_EBSA_CONTACT")
	public String getEosiShipperEbsaContact() {
		return eosiShipperEbsaContact;
	}

	/**
	 * Set eosiShipperEbsaContact
	 */
	public void setEosiShipperEbsaContact(String eosiShipperEbsaContact) {
		this.eosiShipperEbsaContact = eosiShipperEbsaContact;
		addValidField("eosiShipperEbsaContact");
	}

	/**
	 * Get eosiShipperEbsaTel
	 */
	@Column(name = "EOSI_SHIPPER_EBSA_TEL")
	public String getEosiShipperEbsaTel() {
		return eosiShipperEbsaTel;
	}

	/**
	 * Set eosiShipperEbsaTel
	 */
	public void setEosiShipperEbsaTel(String eosiShipperEbsaTel) {
		this.eosiShipperEbsaTel = eosiShipperEbsaTel;
		addValidField("eosiShipperEbsaTel");
	}

	/**
	 * Get eosiShipperEbsaEmail
	 */
	@Column(name = "EOSI_SHIPPER_EBSA_EMAIL")
	public String getEosiShipperEbsaEmail() {
		return eosiShipperEbsaEmail;
	}

	/**
	 * Set eosiShipperEbsaEmail
	 */
	public void setEosiShipperEbsaEmail(String eosiShipperEbsaEmail) {
		this.eosiShipperEbsaEmail = eosiShipperEbsaEmail;
		addValidField("eosiShipperEbsaEmail");
	}

	/**
	 * Get eosiShipperEbsaFax
	 */
	@Column(name = "EOSI_SHIPPER_EBSA_FAX")
	public String getEosiShipperEbsaFax() {
		return eosiShipperEbsaFax;
	}

	/**
	 * Set eosiShipperEbsaFax
	 */
	public void setEosiShipperEbsaFax(String eosiShipperEbsaFax) {
		this.eosiShipperEbsaFax = eosiShipperEbsaFax;
		addValidField("eosiShipperEbsaFax");
	}

	/**
	 * Get eosiShipperEbplNameCn
	 */
	@Column(name = "EOSI_SHIPPER_EBPL_NAME_CN")
	public String getEosiShipperEbplNameCn() {
		return eosiShipperEbplNameCn;
	}

	/**
	 * Set eosiShipperEbplNameCn
	 */
	public void setEosiShipperEbplNameCn(String eosiShipperEbplNameCn) {
		this.eosiShipperEbplNameCn = eosiShipperEbplNameCn;
		addValidField("eosiShipperEbplNameCn");
	}

	/**
	 * Get eosiShipperEbrgNameCn
	 */
	@Column(name = "EOSI_SHIPPER_EBRG_NAME_CN")
	public String getEosiShipperEbrgNameCn() {
		return eosiShipperEbrgNameCn;
	}

	/**
	 * Set eosiShipperEbrgNameCn
	 */
	public void setEosiShipperEbrgNameCn(String eosiShipperEbrgNameCn) {
		this.eosiShipperEbrgNameCn = eosiShipperEbrgNameCn;
		addValidField("eosiShipperEbrgNameCn");
	}

	/**
	 * Get eosiTaskFeedback
	 */
	@Column(name = "EOSI_TASK_FEEDBACK")
	public String getEosiTaskFeedback() {
		return eosiTaskFeedback;
	}

	/**
	 * Set eosiTaskFeedback
	 */
	public void setEosiTaskFeedback(String eosiTaskFeedback) {
		this.eosiTaskFeedback = eosiTaskFeedback;
		addValidField("eosiTaskFeedback");
	}

	/**
	 * Get eosiEscoCode
	 */
	@Column(name = "EOSI_ESCO_CODE")
	public String getEosiEscoCode() {
		return eosiEscoCode;
	}

	/**
	 * Set eosiEscoCode
	 */
	public void setEosiEscoCode(String eosiEscoCode) {
		this.eosiEscoCode = eosiEscoCode;
		addValidField("eosiEscoCode");
	}

	/**
	 * Get eosiEscoNameCn
	 */
	@Column(name = "EOSI_ESCO_NAME_CN")
	public String getEosiEscoNameCn() {
		return eosiEscoNameCn;
	}

	/**
	 * Set eosiEscoNameCn
	 */
	public void setEosiEscoNameCn(String eosiEscoNameCn) {
		this.eosiEscoNameCn = eosiEscoNameCn;
		addValidField("eosiEscoNameCn");
	}

	/**
	 * Get eosiEsdeDepartmentCode
	 */
	@Column(name = "EOSI_ESDE_DEPARTMENT_CODE")
	public String getEosiEsdeDepartmentCode() {
		return eosiEsdeDepartmentCode;
	}

	/**
	 * Set eosiEsdeDepartmentCode
	 */
	public void setEosiEsdeDepartmentCode(String eosiEsdeDepartmentCode) {
		this.eosiEsdeDepartmentCode = eosiEsdeDepartmentCode;
		addValidField("eosiEsdeDepartmentCode");
	}

	/**
	 * Get eosiEsdeDepartmentName
	 */
	@Column(name = "EOSI_ESDE_DEPARTMENT_NAME")
	public String getEosiEsdeDepartmentName() {
		return eosiEsdeDepartmentName;
	}

	/**
	 * Set eosiEsdeDepartmentName
	 */
	public void setEosiEsdeDepartmentName(String eosiEsdeDepartmentName) {
		this.eosiEsdeDepartmentName = eosiEsdeDepartmentName;
		addValidField("eosiEsdeDepartmentName");
	}

	/**
	 * Get eosiEsusUserNameCn
	 */
	@Column(name = "EOSI_ESUS_USER_NAME_CN")
	public String getEosiEsusUserNameCn() {
		return eosiEsusUserNameCn;
	}

	/**
	 * Set eosiEsusUserNameCn
	 */
	public void setEosiEsusUserNameCn(String eosiEsusUserNameCn) {
		this.eosiEsusUserNameCn = eosiEsusUserNameCn;
		addValidField("eosiEsusUserNameCn");
	}

	/**
	 * Get eosiRetoType
	 */
	@Column(name = "EOSI_RETO_TYPE")
	public Long getEosiRetoType() {
		return eosiRetoType;
	}

	/**
	 * Set eosiRetoType
	 */
	public void setEosiRetoType(Long eosiRetoType) {
		this.eosiRetoType = eosiRetoType;
		addValidField("eosiRetoType");
	}

}
