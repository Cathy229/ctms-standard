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
 * Model class for EoRequestStockout
 */
@Entity
@Table(name = "EO_REQUEST_STOCKOUT")
public class EoRequestStockoutModel extends BaseModel implements OperationLog {

	//eosoId
	private Long eosoId;
	//eosoEbtkId
	private Long eosoEbtkId;
	//eosoIsAutomatic
	private String eosoIsAutomatic;
	//eosoTaskStatus
	private String eosoTaskStatus;
	//eosoEoorId
	private Long eosoEoorId;
	//eosoEscoId
	private Long eosoEscoId;
	//eosoNo
	private String eosoNo;
	//eosoType
	private String eosoType;
	//eosoStatus
	private String eosoStatus;
	//eosoOrder
	private Long eosoOrder;
	//eosoSoNo
	private String eosoSoNo;
	//eosoDoNo
	private String eosoDoNo;
	//eosoOwnerEbcuId
	private Long eosoOwnerEbcuId;
	//eosoOwnerEbcuCode
	private String eosoOwnerEbcuCode;
	//eosoOwnerEbcuName
	private String eosoOwnerEbcuName;
	//eosoSupplierEbcuId
	private Long eosoSupplierEbcuId;
	//eosoSupplierEbcuCode
	private String eosoSupplierEbcuCode;
	//eosoSupplierEbcuName
	private String eosoSupplierEbcuName;
	//eosoUrgency
	private String eosoUrgency;
	//eosoRemark
	private String eosoRemark;
	//eosoLibraryNo
	private String eosoLibraryNo;
	//eosoLibraryTime
	private Date eosoLibraryTime;
	//eosoLibraryNumber
	private Long eosoLibraryNumber;
	//eosoLibraryQuantity
	private Long eosoLibraryQuantity;
	//eosoLibraryVolume
	private Long eosoLibraryVolume;
	//eosoLibraryGw
	private Long eosoLibraryGw;
	//eosoLibraryNw
	private Long eosoLibraryNw;
	//eosoStockUpTime
	private Date eosoStockUpTime;
	//eosoSubstr1
	private String eosoSubstr1;
	//eosoSubstr2
	private String eosoSubstr2;
	//eosoSubstr3
	private String eosoSubstr3;
	//eosoSubstr4
	private String eosoSubstr4;
	//eosoSubstr5
	private String eosoSubstr5;
	//eosoSubstr6
	private String eosoSubstr6;
	//eosoSubstr8
	private String eosoSubstr8;
	//eosoSubstr7
	private String eosoSubstr7;
	//eosoSubdate1
	private Date eosoSubdate1;
	//eosoSubdate2
	private Date eosoSubdate2;
	//eosoSubdate3
	private Date eosoSubdate3;
	//eosoSubdate4
	private Date eosoSubdate4;
	//eosoSubnum1
	private Long eosoSubnum1;
	//eosoSubnum2
	private Long eosoSubnum2;
	//eosoSubnum3
	private Long eosoSubnum3;
	//eosoSubnum4
	private Long eosoSubnum4;
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
	//eosoEbbuId
	private Long eosoEbbuId;
	//eosoEbbuNameCn
	private String eosoEbbuNameCn;
	//eosoEbbuCode
	private String eosoEbbuCode;
	//eosoEbbuDist1
	private String eosoEbbuDist1;
	//eosoEbbuDist2
	private String eosoEbbuDist2;
	//eosoEbbuDist3
	private String eosoEbbuDist3;
	//eosoEbbuDist4
	private String eosoEbbuDist4;
	//eosoEbbuDist5
	private String eosoEbbuDist5;
	//eosoToId
	private String eosoToId;
	//eosoLoEbppId
	private Long eosoLoEbppId;
	//eosoSysCode
	private String eosoSysCode;
	//eosoSubstr9
	private String eosoSubstr9;
	//eosoSubstr10
	private String eosoSubstr10;
	//eosoSubstr11
	private String eosoSubstr11;
	//eosoSubstr12
	private String eosoSubstr12;
	//eosoSubstr13
	private String eosoSubstr13;
	//eosoSubstr14
	private String eosoSubstr14;
	//eosoSubstr15
	private String eosoSubstr15;
	//eosoSubstr16
	private String eosoSubstr16;
	//eosoSubstr17
	private String eosoSubstr17;
	//eosoSubstr18
	private String eosoSubstr18;
	//eosoSubstr19
	private String eosoSubstr19;
	//eosoSubstr20
	private String eosoSubstr20;
	//eosoSubstr21
	private String eosoSubstr21;
	//eosoSubstr22
	private String eosoSubstr22;
	//eosoSubstr23
	private String eosoSubstr23;
	//eosoSubstr24
	private String eosoSubstr24;
	//eosoSubstr25
	private String eosoSubstr25;
	//eosoSubdate5
	private Date eosoSubdate5;
	//eosoSubdate6
	private Date eosoSubdate6;
	//eosoSubdate7
	private Date eosoSubdate7;
	//eosoSubdate8
	private Date eosoSubdate8;
	//eosoSubdate9
	private Date eosoSubdate9;
	//eosoSubdate10
	private Date eosoSubdate10;
	//eosoSubnum5
	private Long eosoSubnum5;
	//eosoSubnum6
	private Long eosoSubnum6;
	//eosoEbpjId
	private Long eosoEbpjId;
	//eosoConsigneeEbspId
	private Long eosoConsigneeEbspId;
	//eosoConsigneeEbspNo
	private String eosoConsigneeEbspNo;
	//eosoConsigneeEbspNameCn
	private String eosoConsigneeEbspNameCn;
	//eosoIsAssigned
	private String eosoIsAssigned;
	//eosoAssigneOperator
	private String eosoAssigneOperator;
	//eosoAssigneTime
	private Date eosoAssigneTime;
	//eosoIsPicked
	private String eosoIsPicked;
	//eosoPickOperator
	private String eosoPickOperator;
	//eosoPickTime
	private Date eosoPickTime;
	//eosoIsStockout
	private String eosoIsStockout;
	//eosoStockoutOperator
	private String eosoStockoutOperator;
	//eosoStockoutTime
	private Date eosoStockoutTime;
	//eosoOrderDate
	private Date eosoOrderDate;
	//eosoReqDeliveryDate
	private Date eosoReqDeliveryDate;
	//eosoReqArrivalDate
	private Date eosoReqArrivalDate;
	//eosoConsigneeEbsaAddress
	private String eosoConsigneeEbsaAddress;
	//eosoConsigneeEbsaPost
	private String eosoConsigneeEbsaPost;
	//eosoConsigneeEbsaContact
	private String eosoConsigneeEbsaContact;
	//eosoConsigneeEbsaTel
	private String eosoConsigneeEbsaTel;
	//eosoConsigneeEbsaEmail
	private String eosoConsigneeEbsaEmail;
	//eosoConsigneeEbsaFax
	private String eosoConsigneeEbsaFax;
	//eosoConsigneeEbplNameCn
	private String eosoConsigneeEbplNameCn;
	//eosoConsigneeEbrgNameCn
	private String eosoConsigneeEbrgNameCn;
	//eosoTaskFeedback
	private String eosoTaskFeedback;
	//eosoEscoCode
	private String eosoEscoCode;
	//eosoEscoNameCn
	private String eosoEscoNameCn;
	//eosoEsdeDepartmentCode
	private String eosoEsdeDepartmentCode;
	//eosoEsdeDepartmentName
	private String eosoEsdeDepartmentName;
	//eosoEsusUserNameCn
	private String eosoEsusUserNameCn;
	//eosoRetoType
	private Long eosoRetoType;

	/**
	 * Get eosoId
	 */
	@Column(name = "EOSO_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEosoId() {
		return eosoId;
	}

	/**
	 * Set eosoId
	 */
	public void setEosoId(Long eosoId) {
		this.eosoId = eosoId;
		addValidField("eosoId");
	}

	/**
	 * Get eosoEbtkId
	 */
	@Column(name = "EOSO_EBTK_ID")
	public Long getEosoEbtkId() {
		return eosoEbtkId;
	}

	/**
	 * Set eosoEbtkId
	 */
	public void setEosoEbtkId(Long eosoEbtkId) {
		this.eosoEbtkId = eosoEbtkId;
		addValidField("eosoEbtkId");
	}

	/**
	 * Get eosoIsAutomatic
	 */
	@Column(name = "EOSO_IS_AUTOMATIC")
	public String getEosoIsAutomatic() {
		return eosoIsAutomatic;
	}

	/**
	 * Set eosoIsAutomatic
	 */
	public void setEosoIsAutomatic(String eosoIsAutomatic) {
		this.eosoIsAutomatic = eosoIsAutomatic;
		addValidField("eosoIsAutomatic");
	}

	/**
	 * Get eosoTaskStatus
	 */
	@Column(name = "EOSO_TASK_STATUS")
	public String getEosoTaskStatus() {
		return eosoTaskStatus;
	}

	/**
	 * Set eosoTaskStatus
	 */
	public void setEosoTaskStatus(String eosoTaskStatus) {
		this.eosoTaskStatus = eosoTaskStatus;
		addValidField("eosoTaskStatus");
	}

	/**
	 * Get eosoEoorId
	 */
	@Column(name = "EOSO_EOOR_ID")
	public Long getEosoEoorId() {
		return eosoEoorId;
	}

	/**
	 * Set eosoEoorId
	 */
	public void setEosoEoorId(Long eosoEoorId) {
		this.eosoEoorId = eosoEoorId;
		addValidField("eosoEoorId");
	}

	/**
	 * Get eosoEscoId
	 */
	@Column(name = "EOSO_ESCO_ID")
	public Long getEosoEscoId() {
		return eosoEscoId;
	}

	/**
	 * Set eosoEscoId
	 */
	public void setEosoEscoId(Long eosoEscoId) {
		this.eosoEscoId = eosoEscoId;
		addValidField("eosoEscoId");
	}

	/**
	 * Get eosoNo
	 */
	@Column(name = "EOSO_NO")
	public String getEosoNo() {
		return eosoNo;
	}

	/**
	 * Set eosoNo
	 */
	public void setEosoNo(String eosoNo) {
		this.eosoNo = eosoNo;
		addValidField("eosoNo");
	}

	/**
	 * Get eosoType
	 */
	@Column(name = "EOSO_TYPE")
	public String getEosoType() {
		return eosoType;
	}

	/**
	 * Set eosoType
	 */
	public void setEosoType(String eosoType) {
		this.eosoType = eosoType;
		addValidField("eosoType");
	}

	/**
	 * Get eosoStatus
	 */
	@Column(name = "EOSO_STATUS")
	public String getEosoStatus() {
		return eosoStatus;
	}

	/**
	 * Set eosoStatus
	 */
	public void setEosoStatus(String eosoStatus) {
		this.eosoStatus = eosoStatus;
		addValidField("eosoStatus");
	}

	/**
	 * Get eosoOrder
	 */
	@Column(name = "EOSO_ORDER")
	public Long getEosoOrder() {
		return eosoOrder;
	}

	/**
	 * Set eosoOrder
	 */
	public void setEosoOrder(Long eosoOrder) {
		this.eosoOrder = eosoOrder;
		addValidField("eosoOrder");
	}

	/**
	 * Get eosoSoNo
	 */
	@Column(name = "EOSO_SO_NO")
	public String getEosoSoNo() {
		return eosoSoNo;
	}

	/**
	 * Set eosoSoNo
	 */
	public void setEosoSoNo(String eosoSoNo) {
		this.eosoSoNo = eosoSoNo;
		addValidField("eosoSoNo");
	}

	/**
	 * Get eosoDoNo
	 */
	@Column(name = "EOSO_DO_NO")
	public String getEosoDoNo() {
		return eosoDoNo;
	}

	/**
	 * Set eosoDoNo
	 */
	public void setEosoDoNo(String eosoDoNo) {
		this.eosoDoNo = eosoDoNo;
		addValidField("eosoDoNo");
	}

	/**
	 * Get eosoOwnerEbcuId
	 */
	@Column(name = "EOSO_OWNER_EBCU_ID")
	public Long getEosoOwnerEbcuId() {
		return eosoOwnerEbcuId;
	}

	/**
	 * Set eosoOwnerEbcuId
	 */
	public void setEosoOwnerEbcuId(Long eosoOwnerEbcuId) {
		this.eosoOwnerEbcuId = eosoOwnerEbcuId;
		addValidField("eosoOwnerEbcuId");
	}

	/**
	 * Get eosoOwnerEbcuCode
	 */
	@Column(name = "EOSO_OWNER_EBCU_CODE")
	public String getEosoOwnerEbcuCode() {
		return eosoOwnerEbcuCode;
	}

	/**
	 * Set eosoOwnerEbcuCode
	 */
	public void setEosoOwnerEbcuCode(String eosoOwnerEbcuCode) {
		this.eosoOwnerEbcuCode = eosoOwnerEbcuCode;
		addValidField("eosoOwnerEbcuCode");
	}

	/**
	 * Get eosoOwnerEbcuName
	 */
	@Column(name = "EOSO_OWNER_EBCU_NAME")
	public String getEosoOwnerEbcuName() {
		return eosoOwnerEbcuName;
	}

	/**
	 * Set eosoOwnerEbcuName
	 */
	public void setEosoOwnerEbcuName(String eosoOwnerEbcuName) {
		this.eosoOwnerEbcuName = eosoOwnerEbcuName;
		addValidField("eosoOwnerEbcuName");
	}

	/**
	 * Get eosoSupplierEbcuId
	 */
	@Column(name = "EOSO_SUPPLIER_EBCU_ID")
	public Long getEosoSupplierEbcuId() {
		return eosoSupplierEbcuId;
	}

	/**
	 * Set eosoSupplierEbcuId
	 */
	public void setEosoSupplierEbcuId(Long eosoSupplierEbcuId) {
		this.eosoSupplierEbcuId = eosoSupplierEbcuId;
		addValidField("eosoSupplierEbcuId");
	}

	/**
	 * Get eosoSupplierEbcuCode
	 */
	@Column(name = "EOSO_SUPPLIER_EBCU_CODE")
	public String getEosoSupplierEbcuCode() {
		return eosoSupplierEbcuCode;
	}

	/**
	 * Set eosoSupplierEbcuCode
	 */
	public void setEosoSupplierEbcuCode(String eosoSupplierEbcuCode) {
		this.eosoSupplierEbcuCode = eosoSupplierEbcuCode;
		addValidField("eosoSupplierEbcuCode");
	}

	/**
	 * Get eosoSupplierEbcuName
	 */
	@Column(name = "EOSO_SUPPLIER_EBCU_NAME")
	public String getEosoSupplierEbcuName() {
		return eosoSupplierEbcuName;
	}

	/**
	 * Set eosoSupplierEbcuName
	 */
	public void setEosoSupplierEbcuName(String eosoSupplierEbcuName) {
		this.eosoSupplierEbcuName = eosoSupplierEbcuName;
		addValidField("eosoSupplierEbcuName");
	}

	/**
	 * Get eosoUrgency
	 */
	@Column(name = "EOSO_URGENCY")
	public String getEosoUrgency() {
		return eosoUrgency;
	}

	/**
	 * Set eosoUrgency
	 */
	public void setEosoUrgency(String eosoUrgency) {
		this.eosoUrgency = eosoUrgency;
		addValidField("eosoUrgency");
	}

	/**
	 * Get eosoRemark
	 */
	@Column(name = "EOSO_REMARK")
	public String getEosoRemark() {
		return eosoRemark;
	}

	/**
	 * Set eosoRemark
	 */
	public void setEosoRemark(String eosoRemark) {
		this.eosoRemark = eosoRemark;
		addValidField("eosoRemark");
	}

	/**
	 * Get eosoLibraryNo
	 */
	@Column(name = "EOSO_LIBRARY_NO")
	public String getEosoLibraryNo() {
		return eosoLibraryNo;
	}

	/**
	 * Set eosoLibraryNo
	 */
	public void setEosoLibraryNo(String eosoLibraryNo) {
		this.eosoLibraryNo = eosoLibraryNo;
		addValidField("eosoLibraryNo");
	}

	/**
	 * Get eosoLibraryTime
	 */
	@Column(name = "EOSO_LIBRARY_TIME")
	public Date getEosoLibraryTime() {
		return eosoLibraryTime;
	}

	/**
	 * Set eosoLibraryTime
	 */
	public void setEosoLibraryTime(Date eosoLibraryTime) {
		this.eosoLibraryTime = eosoLibraryTime;
		addValidField("eosoLibraryTime");
	}

	/**
	 * Get eosoLibraryNumber
	 */
	@Column(name = "EOSO_LIBRARY_NUMBER")
	public Long getEosoLibraryNumber() {
		return eosoLibraryNumber;
	}

	/**
	 * Set eosoLibraryNumber
	 */
	public void setEosoLibraryNumber(Long eosoLibraryNumber) {
		this.eosoLibraryNumber = eosoLibraryNumber;
		addValidField("eosoLibraryNumber");
	}

	/**
	 * Get eosoLibraryQuantity
	 */
	@Column(name = "EOSO_LIBRARY_QUANTITY")
	public Long getEosoLibraryQuantity() {
		return eosoLibraryQuantity;
	}

	/**
	 * Set eosoLibraryQuantity
	 */
	public void setEosoLibraryQuantity(Long eosoLibraryQuantity) {
		this.eosoLibraryQuantity = eosoLibraryQuantity;
		addValidField("eosoLibraryQuantity");
	}

	/**
	 * Get eosoLibraryVolume
	 */
	@Column(name = "EOSO_LIBRARY_VOLUME")
	public Long getEosoLibraryVolume() {
		return eosoLibraryVolume;
	}

	/**
	 * Set eosoLibraryVolume
	 */
	public void setEosoLibraryVolume(Long eosoLibraryVolume) {
		this.eosoLibraryVolume = eosoLibraryVolume;
		addValidField("eosoLibraryVolume");
	}

	/**
	 * Get eosoLibraryGw
	 */
	@Column(name = "EOSO_LIBRARY_GW")
	public Long getEosoLibraryGw() {
		return eosoLibraryGw;
	}

	/**
	 * Set eosoLibraryGw
	 */
	public void setEosoLibraryGw(Long eosoLibraryGw) {
		this.eosoLibraryGw = eosoLibraryGw;
		addValidField("eosoLibraryGw");
	}

	/**
	 * Get eosoLibraryNw
	 */
	@Column(name = "EOSO_LIBRARY_NW")
	public Long getEosoLibraryNw() {
		return eosoLibraryNw;
	}

	/**
	 * Set eosoLibraryNw
	 */
	public void setEosoLibraryNw(Long eosoLibraryNw) {
		this.eosoLibraryNw = eosoLibraryNw;
		addValidField("eosoLibraryNw");
	}

	/**
	 * Get eosoStockUpTime
	 */
	@Column(name = "EOSO_STOCK_UP_TIME")
	public Date getEosoStockUpTime() {
		return eosoStockUpTime;
	}

	/**
	 * Set eosoStockUpTime
	 */
	public void setEosoStockUpTime(Date eosoStockUpTime) {
		this.eosoStockUpTime = eosoStockUpTime;
		addValidField("eosoStockUpTime");
	}

	/**
	 * Get eosoSubstr1
	 */
	@Column(name = "EOSO_SUBSTR1")
	public String getEosoSubstr1() {
		return eosoSubstr1;
	}

	/**
	 * Set eosoSubstr1
	 */
	public void setEosoSubstr1(String eosoSubstr1) {
		this.eosoSubstr1 = eosoSubstr1;
		addValidField("eosoSubstr1");
	}

	/**
	 * Get eosoSubstr2
	 */
	@Column(name = "EOSO_SUBSTR2")
	public String getEosoSubstr2() {
		return eosoSubstr2;
	}

	/**
	 * Set eosoSubstr2
	 */
	public void setEosoSubstr2(String eosoSubstr2) {
		this.eosoSubstr2 = eosoSubstr2;
		addValidField("eosoSubstr2");
	}

	/**
	 * Get eosoSubstr3
	 */
	@Column(name = "EOSO_SUBSTR3")
	public String getEosoSubstr3() {
		return eosoSubstr3;
	}

	/**
	 * Set eosoSubstr3
	 */
	public void setEosoSubstr3(String eosoSubstr3) {
		this.eosoSubstr3 = eosoSubstr3;
		addValidField("eosoSubstr3");
	}

	/**
	 * Get eosoSubstr4
	 */
	@Column(name = "EOSO_SUBSTR4")
	public String getEosoSubstr4() {
		return eosoSubstr4;
	}

	/**
	 * Set eosoSubstr4
	 */
	public void setEosoSubstr4(String eosoSubstr4) {
		this.eosoSubstr4 = eosoSubstr4;
		addValidField("eosoSubstr4");
	}

	/**
	 * Get eosoSubstr5
	 */
	@Column(name = "EOSO_SUBSTR5")
	public String getEosoSubstr5() {
		return eosoSubstr5;
	}

	/**
	 * Set eosoSubstr5
	 */
	public void setEosoSubstr5(String eosoSubstr5) {
		this.eosoSubstr5 = eosoSubstr5;
		addValidField("eosoSubstr5");
	}

	/**
	 * Get eosoSubstr6
	 */
	@Column(name = "EOSO_SUBSTR6")
	public String getEosoSubstr6() {
		return eosoSubstr6;
	}

	/**
	 * Set eosoSubstr6
	 */
	public void setEosoSubstr6(String eosoSubstr6) {
		this.eosoSubstr6 = eosoSubstr6;
		addValidField("eosoSubstr6");
	}

	/**
	 * Get eosoSubstr8
	 */
	@Column(name = "EOSO_SUBSTR8")
	public String getEosoSubstr8() {
		return eosoSubstr8;
	}

	/**
	 * Set eosoSubstr8
	 */
	public void setEosoSubstr8(String eosoSubstr8) {
		this.eosoSubstr8 = eosoSubstr8;
		addValidField("eosoSubstr8");
	}

	/**
	 * Get eosoSubstr7
	 */
	@Column(name = "EOSO_SUBSTR7")
	public String getEosoSubstr7() {
		return eosoSubstr7;
	}

	/**
	 * Set eosoSubstr7
	 */
	public void setEosoSubstr7(String eosoSubstr7) {
		this.eosoSubstr7 = eosoSubstr7;
		addValidField("eosoSubstr7");
	}

	/**
	 * Get eosoSubdate1
	 */
	@Column(name = "EOSO_SUBDATE1")
	public Date getEosoSubdate1() {
		return eosoSubdate1;
	}

	/**
	 * Set eosoSubdate1
	 */
	public void setEosoSubdate1(Date eosoSubdate1) {
		this.eosoSubdate1 = eosoSubdate1;
		addValidField("eosoSubdate1");
	}

	/**
	 * Get eosoSubdate2
	 */
	@Column(name = "EOSO_SUBDATE2")
	public Date getEosoSubdate2() {
		return eosoSubdate2;
	}

	/**
	 * Set eosoSubdate2
	 */
	public void setEosoSubdate2(Date eosoSubdate2) {
		this.eosoSubdate2 = eosoSubdate2;
		addValidField("eosoSubdate2");
	}

	/**
	 * Get eosoSubdate3
	 */
	@Column(name = "EOSO_SUBDATE3")
	public Date getEosoSubdate3() {
		return eosoSubdate3;
	}

	/**
	 * Set eosoSubdate3
	 */
	public void setEosoSubdate3(Date eosoSubdate3) {
		this.eosoSubdate3 = eosoSubdate3;
		addValidField("eosoSubdate3");
	}

	/**
	 * Get eosoSubdate4
	 */
	@Column(name = "EOSO_SUBDATE4")
	public Date getEosoSubdate4() {
		return eosoSubdate4;
	}

	/**
	 * Set eosoSubdate4
	 */
	public void setEosoSubdate4(Date eosoSubdate4) {
		this.eosoSubdate4 = eosoSubdate4;
		addValidField("eosoSubdate4");
	}

	/**
	 * Get eosoSubnum1
	 */
	@Column(name = "EOSO_SUBNUM1")
	public Long getEosoSubnum1() {
		return eosoSubnum1;
	}

	/**
	 * Set eosoSubnum1
	 */
	public void setEosoSubnum1(Long eosoSubnum1) {
		this.eosoSubnum1 = eosoSubnum1;
		addValidField("eosoSubnum1");
	}

	/**
	 * Get eosoSubnum2
	 */
	@Column(name = "EOSO_SUBNUM2")
	public Long getEosoSubnum2() {
		return eosoSubnum2;
	}

	/**
	 * Set eosoSubnum2
	 */
	public void setEosoSubnum2(Long eosoSubnum2) {
		this.eosoSubnum2 = eosoSubnum2;
		addValidField("eosoSubnum2");
	}

	/**
	 * Get eosoSubnum3
	 */
	@Column(name = "EOSO_SUBNUM3")
	public Long getEosoSubnum3() {
		return eosoSubnum3;
	}

	/**
	 * Set eosoSubnum3
	 */
	public void setEosoSubnum3(Long eosoSubnum3) {
		this.eosoSubnum3 = eosoSubnum3;
		addValidField("eosoSubnum3");
	}

	/**
	 * Get eosoSubnum4
	 */
	@Column(name = "EOSO_SUBNUM4")
	public Long getEosoSubnum4() {
		return eosoSubnum4;
	}

	/**
	 * Set eosoSubnum4
	 */
	public void setEosoSubnum4(Long eosoSubnum4) {
		this.eosoSubnum4 = eosoSubnum4;
		addValidField("eosoSubnum4");
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
	 * Get eosoEbbuId
	 */
	@Column(name = "EOSO_EBBU_ID")
	public Long getEosoEbbuId() {
		return eosoEbbuId;
	}

	/**
	 * Set eosoEbbuId
	 */
	public void setEosoEbbuId(Long eosoEbbuId) {
		this.eosoEbbuId = eosoEbbuId;
		addValidField("eosoEbbuId");
	}

	/**
	 * Get eosoEbbuNameCn
	 */
	@Column(name = "EOSO_EBBU_NAME_CN")
	public String getEosoEbbuNameCn() {
		return eosoEbbuNameCn;
	}

	/**
	 * Set eosoEbbuNameCn
	 */
	public void setEosoEbbuNameCn(String eosoEbbuNameCn) {
		this.eosoEbbuNameCn = eosoEbbuNameCn;
		addValidField("eosoEbbuNameCn");
	}

	/**
	 * Get eosoEbbuCode
	 */
	@Column(name = "EOSO_EBBU_CODE")
	public String getEosoEbbuCode() {
		return eosoEbbuCode;
	}

	/**
	 * Set eosoEbbuCode
	 */
	public void setEosoEbbuCode(String eosoEbbuCode) {
		this.eosoEbbuCode = eosoEbbuCode;
		addValidField("eosoEbbuCode");
	}

	/**
	 * Get eosoEbbuDist1
	 */
	@Column(name = "EOSO_EBBU_DIST_1")
	public String getEosoEbbuDist1() {
		return eosoEbbuDist1;
	}

	/**
	 * Set eosoEbbuDist1
	 */
	public void setEosoEbbuDist1(String eosoEbbuDist1) {
		this.eosoEbbuDist1 = eosoEbbuDist1;
		addValidField("eosoEbbuDist1");
	}

	/**
	 * Get eosoEbbuDist2
	 */
	@Column(name = "EOSO_EBBU_DIST_2")
	public String getEosoEbbuDist2() {
		return eosoEbbuDist2;
	}

	/**
	 * Set eosoEbbuDist2
	 */
	public void setEosoEbbuDist2(String eosoEbbuDist2) {
		this.eosoEbbuDist2 = eosoEbbuDist2;
		addValidField("eosoEbbuDist2");
	}

	/**
	 * Get eosoEbbuDist3
	 */
	@Column(name = "EOSO_EBBU_DIST_3")
	public String getEosoEbbuDist3() {
		return eosoEbbuDist3;
	}

	/**
	 * Set eosoEbbuDist3
	 */
	public void setEosoEbbuDist3(String eosoEbbuDist3) {
		this.eosoEbbuDist3 = eosoEbbuDist3;
		addValidField("eosoEbbuDist3");
	}

	/**
	 * Get eosoEbbuDist4
	 */
	@Column(name = "EOSO_EBBU_DIST_4")
	public String getEosoEbbuDist4() {
		return eosoEbbuDist4;
	}

	/**
	 * Set eosoEbbuDist4
	 */
	public void setEosoEbbuDist4(String eosoEbbuDist4) {
		this.eosoEbbuDist4 = eosoEbbuDist4;
		addValidField("eosoEbbuDist4");
	}

	/**
	 * Get eosoEbbuDist5
	 */
	@Column(name = "EOSO_EBBU_DIST_5")
	public String getEosoEbbuDist5() {
		return eosoEbbuDist5;
	}

	/**
	 * Set eosoEbbuDist5
	 */
	public void setEosoEbbuDist5(String eosoEbbuDist5) {
		this.eosoEbbuDist5 = eosoEbbuDist5;
		addValidField("eosoEbbuDist5");
	}

	/**
	 * Get eosoToId
	 */
	@Column(name = "EOSO_TO_ID")
	public String getEosoToId() {
		return eosoToId;
	}

	/**
	 * Set eosoToId
	 */
	public void setEosoToId(String eosoToId) {
		this.eosoToId = eosoToId;
		addValidField("eosoToId");
	}

	/**
	 * Get eosoLoEbppId
	 */
	@Column(name = "EOSO_LO_EBPP_ID")
	public Long getEosoLoEbppId() {
		return eosoLoEbppId;
	}

	/**
	 * Set eosoLoEbppId
	 */
	public void setEosoLoEbppId(Long eosoLoEbppId) {
		this.eosoLoEbppId = eosoLoEbppId;
		addValidField("eosoLoEbppId");
	}

	/**
	 * Get eosoSysCode
	 */
	@Column(name = "EOSO_SYS_CODE")
	public String getEosoSysCode() {
		return eosoSysCode;
	}

	/**
	 * Set eosoSysCode
	 */
	public void setEosoSysCode(String eosoSysCode) {
		this.eosoSysCode = eosoSysCode;
		addValidField("eosoSysCode");
	}

	/**
	 * Get eosoSubstr9
	 */
	@Column(name = "EOSO_SUBSTR9")
	public String getEosoSubstr9() {
		return eosoSubstr9;
	}

	/**
	 * Set eosoSubstr9
	 */
	public void setEosoSubstr9(String eosoSubstr9) {
		this.eosoSubstr9 = eosoSubstr9;
		addValidField("eosoSubstr9");
	}

	/**
	 * Get eosoSubstr10
	 */
	@Column(name = "EOSO_SUBSTR10")
	public String getEosoSubstr10() {
		return eosoSubstr10;
	}

	/**
	 * Set eosoSubstr10
	 */
	public void setEosoSubstr10(String eosoSubstr10) {
		this.eosoSubstr10 = eosoSubstr10;
		addValidField("eosoSubstr10");
	}

	/**
	 * Get eosoSubstr11
	 */
	@Column(name = "EOSO_SUBSTR11")
	public String getEosoSubstr11() {
		return eosoSubstr11;
	}

	/**
	 * Set eosoSubstr11
	 */
	public void setEosoSubstr11(String eosoSubstr11) {
		this.eosoSubstr11 = eosoSubstr11;
		addValidField("eosoSubstr11");
	}

	/**
	 * Get eosoSubstr12
	 */
	@Column(name = "EOSO_SUBSTR12")
	public String getEosoSubstr12() {
		return eosoSubstr12;
	}

	/**
	 * Set eosoSubstr12
	 */
	public void setEosoSubstr12(String eosoSubstr12) {
		this.eosoSubstr12 = eosoSubstr12;
		addValidField("eosoSubstr12");
	}

	/**
	 * Get eosoSubstr13
	 */
	@Column(name = "EOSO_SUBSTR13")
	public String getEosoSubstr13() {
		return eosoSubstr13;
	}

	/**
	 * Set eosoSubstr13
	 */
	public void setEosoSubstr13(String eosoSubstr13) {
		this.eosoSubstr13 = eosoSubstr13;
		addValidField("eosoSubstr13");
	}

	/**
	 * Get eosoSubstr14
	 */
	@Column(name = "EOSO_SUBSTR14")
	public String getEosoSubstr14() {
		return eosoSubstr14;
	}

	/**
	 * Set eosoSubstr14
	 */
	public void setEosoSubstr14(String eosoSubstr14) {
		this.eosoSubstr14 = eosoSubstr14;
		addValidField("eosoSubstr14");
	}

	/**
	 * Get eosoSubstr15
	 */
	@Column(name = "EOSO_SUBSTR15")
	public String getEosoSubstr15() {
		return eosoSubstr15;
	}

	/**
	 * Set eosoSubstr15
	 */
	public void setEosoSubstr15(String eosoSubstr15) {
		this.eosoSubstr15 = eosoSubstr15;
		addValidField("eosoSubstr15");
	}

	/**
	 * Get eosoSubstr16
	 */
	@Column(name = "EOSO_SUBSTR16")
	public String getEosoSubstr16() {
		return eosoSubstr16;
	}

	/**
	 * Set eosoSubstr16
	 */
	public void setEosoSubstr16(String eosoSubstr16) {
		this.eosoSubstr16 = eosoSubstr16;
		addValidField("eosoSubstr16");
	}

	/**
	 * Get eosoSubstr17
	 */
	@Column(name = "EOSO_SUBSTR17")
	public String getEosoSubstr17() {
		return eosoSubstr17;
	}

	/**
	 * Set eosoSubstr17
	 */
	public void setEosoSubstr17(String eosoSubstr17) {
		this.eosoSubstr17 = eosoSubstr17;
		addValidField("eosoSubstr17");
	}

	/**
	 * Get eosoSubstr18
	 */
	@Column(name = "EOSO_SUBSTR18")
	public String getEosoSubstr18() {
		return eosoSubstr18;
	}

	/**
	 * Set eosoSubstr18
	 */
	public void setEosoSubstr18(String eosoSubstr18) {
		this.eosoSubstr18 = eosoSubstr18;
		addValidField("eosoSubstr18");
	}

	/**
	 * Get eosoSubstr19
	 */
	@Column(name = "EOSO_SUBSTR19")
	public String getEosoSubstr19() {
		return eosoSubstr19;
	}

	/**
	 * Set eosoSubstr19
	 */
	public void setEosoSubstr19(String eosoSubstr19) {
		this.eosoSubstr19 = eosoSubstr19;
		addValidField("eosoSubstr19");
	}

	/**
	 * Get eosoSubstr20
	 */
	@Column(name = "EOSO_SUBSTR20")
	public String getEosoSubstr20() {
		return eosoSubstr20;
	}

	/**
	 * Set eosoSubstr20
	 */
	public void setEosoSubstr20(String eosoSubstr20) {
		this.eosoSubstr20 = eosoSubstr20;
		addValidField("eosoSubstr20");
	}

	/**
	 * Get eosoSubstr21
	 */
	@Column(name = "EOSO_SUBSTR21")
	public String getEosoSubstr21() {
		return eosoSubstr21;
	}

	/**
	 * Set eosoSubstr21
	 */
	public void setEosoSubstr21(String eosoSubstr21) {
		this.eosoSubstr21 = eosoSubstr21;
		addValidField("eosoSubstr21");
	}

	/**
	 * Get eosoSubstr22
	 */
	@Column(name = "EOSO_SUBSTR22")
	public String getEosoSubstr22() {
		return eosoSubstr22;
	}

	/**
	 * Set eosoSubstr22
	 */
	public void setEosoSubstr22(String eosoSubstr22) {
		this.eosoSubstr22 = eosoSubstr22;
		addValidField("eosoSubstr22");
	}

	/**
	 * Get eosoSubstr23
	 */
	@Column(name = "EOSO_SUBSTR23")
	public String getEosoSubstr23() {
		return eosoSubstr23;
	}

	/**
	 * Set eosoSubstr23
	 */
	public void setEosoSubstr23(String eosoSubstr23) {
		this.eosoSubstr23 = eosoSubstr23;
		addValidField("eosoSubstr23");
	}

	/**
	 * Get eosoSubstr24
	 */
	@Column(name = "EOSO_SUBSTR24")
	public String getEosoSubstr24() {
		return eosoSubstr24;
	}

	/**
	 * Set eosoSubstr24
	 */
	public void setEosoSubstr24(String eosoSubstr24) {
		this.eosoSubstr24 = eosoSubstr24;
		addValidField("eosoSubstr24");
	}

	/**
	 * Get eosoSubstr25
	 */
	@Column(name = "EOSO_SUBSTR25")
	public String getEosoSubstr25() {
		return eosoSubstr25;
	}

	/**
	 * Set eosoSubstr25
	 */
	public void setEosoSubstr25(String eosoSubstr25) {
		this.eosoSubstr25 = eosoSubstr25;
		addValidField("eosoSubstr25");
	}

	/**
	 * Get eosoSubdate5
	 */
	@Column(name = "EOSO_SUBDATE5")
	public Date getEosoSubdate5() {
		return eosoSubdate5;
	}

	/**
	 * Set eosoSubdate5
	 */
	public void setEosoSubdate5(Date eosoSubdate5) {
		this.eosoSubdate5 = eosoSubdate5;
		addValidField("eosoSubdate5");
	}

	/**
	 * Get eosoSubdate6
	 */
	@Column(name = "EOSO_SUBDATE6")
	public Date getEosoSubdate6() {
		return eosoSubdate6;
	}

	/**
	 * Set eosoSubdate6
	 */
	public void setEosoSubdate6(Date eosoSubdate6) {
		this.eosoSubdate6 = eosoSubdate6;
		addValidField("eosoSubdate6");
	}

	/**
	 * Get eosoSubdate7
	 */
	@Column(name = "EOSO_SUBDATE7")
	public Date getEosoSubdate7() {
		return eosoSubdate7;
	}

	/**
	 * Set eosoSubdate7
	 */
	public void setEosoSubdate7(Date eosoSubdate7) {
		this.eosoSubdate7 = eosoSubdate7;
		addValidField("eosoSubdate7");
	}

	/**
	 * Get eosoSubdate8
	 */
	@Column(name = "EOSO_SUBDATE8")
	public Date getEosoSubdate8() {
		return eosoSubdate8;
	}

	/**
	 * Set eosoSubdate8
	 */
	public void setEosoSubdate8(Date eosoSubdate8) {
		this.eosoSubdate8 = eosoSubdate8;
		addValidField("eosoSubdate8");
	}

	/**
	 * Get eosoSubdate9
	 */
	@Column(name = "EOSO_SUBDATE9")
	public Date getEosoSubdate9() {
		return eosoSubdate9;
	}

	/**
	 * Set eosoSubdate9
	 */
	public void setEosoSubdate9(Date eosoSubdate9) {
		this.eosoSubdate9 = eosoSubdate9;
		addValidField("eosoSubdate9");
	}

	/**
	 * Get eosoSubdate10
	 */
	@Column(name = "EOSO_SUBDATE10")
	public Date getEosoSubdate10() {
		return eosoSubdate10;
	}

	/**
	 * Set eosoSubdate10
	 */
	public void setEosoSubdate10(Date eosoSubdate10) {
		this.eosoSubdate10 = eosoSubdate10;
		addValidField("eosoSubdate10");
	}

	/**
	 * Get eosoSubnum5
	 */
	@Column(name = "EOSO_SUBNUM5")
	public Long getEosoSubnum5() {
		return eosoSubnum5;
	}

	/**
	 * Set eosoSubnum5
	 */
	public void setEosoSubnum5(Long eosoSubnum5) {
		this.eosoSubnum5 = eosoSubnum5;
		addValidField("eosoSubnum5");
	}

	/**
	 * Get eosoSubnum6
	 */
	@Column(name = "EOSO_SUBNUM6")
	public Long getEosoSubnum6() {
		return eosoSubnum6;
	}

	/**
	 * Set eosoSubnum6
	 */
	public void setEosoSubnum6(Long eosoSubnum6) {
		this.eosoSubnum6 = eosoSubnum6;
		addValidField("eosoSubnum6");
	}

	/**
	 * Get eosoEbpjId
	 */
	@Column(name = "EOSO_EBPJ_ID")
	public Long getEosoEbpjId() {
		return eosoEbpjId;
	}

	/**
	 * Set eosoEbpjId
	 */
	public void setEosoEbpjId(Long eosoEbpjId) {
		this.eosoEbpjId = eosoEbpjId;
		addValidField("eosoEbpjId");
	}

	/**
	 * Get eosoConsigneeEbspId
	 */
	@Column(name = "EOSO_CONSIGNEE_EBSP_ID")
	public Long getEosoConsigneeEbspId() {
		return eosoConsigneeEbspId;
	}

	/**
	 * Set eosoConsigneeEbspId
	 */
	public void setEosoConsigneeEbspId(Long eosoConsigneeEbspId) {
		this.eosoConsigneeEbspId = eosoConsigneeEbspId;
		addValidField("eosoConsigneeEbspId");
	}

	/**
	 * Get eosoConsigneeEbspNo
	 */
	@Column(name = "EOSO_CONSIGNEE_EBSP_NO")
	public String getEosoConsigneeEbspNo() {
		return eosoConsigneeEbspNo;
	}

	/**
	 * Set eosoConsigneeEbspNo
	 */
	public void setEosoConsigneeEbspNo(String eosoConsigneeEbspNo) {
		this.eosoConsigneeEbspNo = eosoConsigneeEbspNo;
		addValidField("eosoConsigneeEbspNo");
	}

	/**
	 * Get eosoConsigneeEbspNameCn
	 */
	@Column(name = "EOSO_CONSIGNEE_EBSP_NAME_CN")
	public String getEosoConsigneeEbspNameCn() {
		return eosoConsigneeEbspNameCn;
	}

	/**
	 * Set eosoConsigneeEbspNameCn
	 */
	public void setEosoConsigneeEbspNameCn(String eosoConsigneeEbspNameCn) {
		this.eosoConsigneeEbspNameCn = eosoConsigneeEbspNameCn;
		addValidField("eosoConsigneeEbspNameCn");
	}

	/**
	 * Get eosoIsAssigned
	 */
	@Column(name = "EOSO_IS_ASSIGNED")
	public String getEosoIsAssigned() {
		return eosoIsAssigned;
	}

	/**
	 * Set eosoIsAssigned
	 */
	public void setEosoIsAssigned(String eosoIsAssigned) {
		this.eosoIsAssigned = eosoIsAssigned;
		addValidField("eosoIsAssigned");
	}

	/**
	 * Get eosoAssigneOperator
	 */
	@Column(name = "EOSO_ASSIGNE_OPERATOR")
	public String getEosoAssigneOperator() {
		return eosoAssigneOperator;
	}

	/**
	 * Set eosoAssigneOperator
	 */
	public void setEosoAssigneOperator(String eosoAssigneOperator) {
		this.eosoAssigneOperator = eosoAssigneOperator;
		addValidField("eosoAssigneOperator");
	}

	/**
	 * Get eosoAssigneTime
	 */
	@Column(name = "EOSO_ASSIGNE_TIME")
	public Date getEosoAssigneTime() {
		return eosoAssigneTime;
	}

	/**
	 * Set eosoAssigneTime
	 */
	public void setEosoAssigneTime(Date eosoAssigneTime) {
		this.eosoAssigneTime = eosoAssigneTime;
		addValidField("eosoAssigneTime");
	}

	/**
	 * Get eosoIsPicked
	 */
	@Column(name = "EOSO_IS_PICKED")
	public String getEosoIsPicked() {
		return eosoIsPicked;
	}

	/**
	 * Set eosoIsPicked
	 */
	public void setEosoIsPicked(String eosoIsPicked) {
		this.eosoIsPicked = eosoIsPicked;
		addValidField("eosoIsPicked");
	}

	/**
	 * Get eosoPickOperator
	 */
	@Column(name = "EOSO_PICK_OPERATOR")
	public String getEosoPickOperator() {
		return eosoPickOperator;
	}

	/**
	 * Set eosoPickOperator
	 */
	public void setEosoPickOperator(String eosoPickOperator) {
		this.eosoPickOperator = eosoPickOperator;
		addValidField("eosoPickOperator");
	}

	/**
	 * Get eosoPickTime
	 */
	@Column(name = "EOSO_PICK_TIME")
	public Date getEosoPickTime() {
		return eosoPickTime;
	}

	/**
	 * Set eosoPickTime
	 */
	public void setEosoPickTime(Date eosoPickTime) {
		this.eosoPickTime = eosoPickTime;
		addValidField("eosoPickTime");
	}

	/**
	 * Get eosoIsStockout
	 */
	@Column(name = "EOSO_IS_STOCKOUT")
	public String getEosoIsStockout() {
		return eosoIsStockout;
	}

	/**
	 * Set eosoIsStockout
	 */
	public void setEosoIsStockout(String eosoIsStockout) {
		this.eosoIsStockout = eosoIsStockout;
		addValidField("eosoIsStockout");
	}

	/**
	 * Get eosoStockoutOperator
	 */
	@Column(name = "EOSO_STOCKOUT_OPERATOR")
	public String getEosoStockoutOperator() {
		return eosoStockoutOperator;
	}

	/**
	 * Set eosoStockoutOperator
	 */
	public void setEosoStockoutOperator(String eosoStockoutOperator) {
		this.eosoStockoutOperator = eosoStockoutOperator;
		addValidField("eosoStockoutOperator");
	}

	/**
	 * Get eosoStockoutTime
	 */
	@Column(name = "EOSO_STOCKOUT_TIME")
	public Date getEosoStockoutTime() {
		return eosoStockoutTime;
	}

	/**
	 * Set eosoStockoutTime
	 */
	public void setEosoStockoutTime(Date eosoStockoutTime) {
		this.eosoStockoutTime = eosoStockoutTime;
		addValidField("eosoStockoutTime");
	}

	/**
	 * Get eosoOrderDate
	 */
	@Column(name = "EOSO_ORDER_DATE")
	public Date getEosoOrderDate() {
		return eosoOrderDate;
	}

	/**
	 * Set eosoOrderDate
	 */
	public void setEosoOrderDate(Date eosoOrderDate) {
		this.eosoOrderDate = eosoOrderDate;
		addValidField("eosoOrderDate");
	}

	/**
	 * Get eosoReqDeliveryDate
	 */
	@Column(name = "EOSO_REQ_DELIVERY_DATE")
	public Date getEosoReqDeliveryDate() {
		return eosoReqDeliveryDate;
	}

	/**
	 * Set eosoReqDeliveryDate
	 */
	public void setEosoReqDeliveryDate(Date eosoReqDeliveryDate) {
		this.eosoReqDeliveryDate = eosoReqDeliveryDate;
		addValidField("eosoReqDeliveryDate");
	}

	/**
	 * Get eosoReqArrivalDate
	 */
	@Column(name = "EOSO_REQ_ARRIVAL_DATE")
	public Date getEosoReqArrivalDate() {
		return eosoReqArrivalDate;
	}

	/**
	 * Set eosoReqArrivalDate
	 */
	public void setEosoReqArrivalDate(Date eosoReqArrivalDate) {
		this.eosoReqArrivalDate = eosoReqArrivalDate;
		addValidField("eosoReqArrivalDate");
	}

	/**
	 * Get eosoConsigneeEbsaAddress
	 */
	@Column(name = "EOSO_CONSIGNEE_EBSA_ADDRESS")
	public String getEosoConsigneeEbsaAddress() {
		return eosoConsigneeEbsaAddress;
	}

	/**
	 * Set eosoConsigneeEbsaAddress
	 */
	public void setEosoConsigneeEbsaAddress(String eosoConsigneeEbsaAddress) {
		this.eosoConsigneeEbsaAddress = eosoConsigneeEbsaAddress;
		addValidField("eosoConsigneeEbsaAddress");
	}

	/**
	 * Get eosoConsigneeEbsaPost
	 */
	@Column(name = "EOSO_CONSIGNEE_EBSA_POST")
	public String getEosoConsigneeEbsaPost() {
		return eosoConsigneeEbsaPost;
	}

	/**
	 * Set eosoConsigneeEbsaPost
	 */
	public void setEosoConsigneeEbsaPost(String eosoConsigneeEbsaPost) {
		this.eosoConsigneeEbsaPost = eosoConsigneeEbsaPost;
		addValidField("eosoConsigneeEbsaPost");
	}

	/**
	 * Get eosoConsigneeEbsaContact
	 */
	@Column(name = "EOSO_CONSIGNEE_EBSA_CONTACT")
	public String getEosoConsigneeEbsaContact() {
		return eosoConsigneeEbsaContact;
	}

	/**
	 * Set eosoConsigneeEbsaContact
	 */
	public void setEosoConsigneeEbsaContact(String eosoConsigneeEbsaContact) {
		this.eosoConsigneeEbsaContact = eosoConsigneeEbsaContact;
		addValidField("eosoConsigneeEbsaContact");
	}

	/**
	 * Get eosoConsigneeEbsaTel
	 */
	@Column(name = "EOSO_CONSIGNEE_EBSA_TEL")
	public String getEosoConsigneeEbsaTel() {
		return eosoConsigneeEbsaTel;
	}

	/**
	 * Set eosoConsigneeEbsaTel
	 */
	public void setEosoConsigneeEbsaTel(String eosoConsigneeEbsaTel) {
		this.eosoConsigneeEbsaTel = eosoConsigneeEbsaTel;
		addValidField("eosoConsigneeEbsaTel");
	}

	/**
	 * Get eosoConsigneeEbsaEmail
	 */
	@Column(name = "EOSO_CONSIGNEE_EBSA_EMAIL")
	public String getEosoConsigneeEbsaEmail() {
		return eosoConsigneeEbsaEmail;
	}

	/**
	 * Set eosoConsigneeEbsaEmail
	 */
	public void setEosoConsigneeEbsaEmail(String eosoConsigneeEbsaEmail) {
		this.eosoConsigneeEbsaEmail = eosoConsigneeEbsaEmail;
		addValidField("eosoConsigneeEbsaEmail");
	}

	/**
	 * Get eosoConsigneeEbsaFax
	 */
	@Column(name = "EOSO_CONSIGNEE_EBSA_FAX")
	public String getEosoConsigneeEbsaFax() {
		return eosoConsigneeEbsaFax;
	}

	/**
	 * Set eosoConsigneeEbsaFax
	 */
	public void setEosoConsigneeEbsaFax(String eosoConsigneeEbsaFax) {
		this.eosoConsigneeEbsaFax = eosoConsigneeEbsaFax;
		addValidField("eosoConsigneeEbsaFax");
	}

	/**
	 * Get eosoConsigneeEbplNameCn
	 */
	@Column(name = "EOSO_CONSIGNEE_EBPL_NAME_CN")
	public String getEosoConsigneeEbplNameCn() {
		return eosoConsigneeEbplNameCn;
	}

	/**
	 * Set eosoConsigneeEbplNameCn
	 */
	public void setEosoConsigneeEbplNameCn(String eosoConsigneeEbplNameCn) {
		this.eosoConsigneeEbplNameCn = eosoConsigneeEbplNameCn;
		addValidField("eosoConsigneeEbplNameCn");
	}

	/**
	 * Get eosoConsigneeEbrgNameCn
	 */
	@Column(name = "EOSO_CONSIGNEE_EBRG_NAME_CN")
	public String getEosoConsigneeEbrgNameCn() {
		return eosoConsigneeEbrgNameCn;
	}

	/**
	 * Set eosoConsigneeEbrgNameCn
	 */
	public void setEosoConsigneeEbrgNameCn(String eosoConsigneeEbrgNameCn) {
		this.eosoConsigneeEbrgNameCn = eosoConsigneeEbrgNameCn;
		addValidField("eosoConsigneeEbrgNameCn");
	}

	/**
	 * Get eosoTaskFeedback
	 */
	@Column(name = "EOSO_TASK_FEEDBACK")
	public String getEosoTaskFeedback() {
		return eosoTaskFeedback;
	}

	/**
	 * Set eosoTaskFeedback
	 */
	public void setEosoTaskFeedback(String eosoTaskFeedback) {
		this.eosoTaskFeedback = eosoTaskFeedback;
		addValidField("eosoTaskFeedback");
	}

	/**
	 * Get eosoEscoCode
	 */
	@Column(name = "EOSO_ESCO_CODE")
	public String getEosoEscoCode() {
		return eosoEscoCode;
	}

	/**
	 * Set eosoEscoCode
	 */
	public void setEosoEscoCode(String eosoEscoCode) {
		this.eosoEscoCode = eosoEscoCode;
		addValidField("eosoEscoCode");
	}

	/**
	 * Get eosoEscoNameCn
	 */
	@Column(name = "EOSO_ESCO_NAME_CN")
	public String getEosoEscoNameCn() {
		return eosoEscoNameCn;
	}

	/**
	 * Set eosoEscoNameCn
	 */
	public void setEosoEscoNameCn(String eosoEscoNameCn) {
		this.eosoEscoNameCn = eosoEscoNameCn;
		addValidField("eosoEscoNameCn");
	}

	/**
	 * Get eosoEsdeDepartmentCode
	 */
	@Column(name = "EOSO_ESDE_DEPARTMENT_CODE")
	public String getEosoEsdeDepartmentCode() {
		return eosoEsdeDepartmentCode;
	}

	/**
	 * Set eosoEsdeDepartmentCode
	 */
	public void setEosoEsdeDepartmentCode(String eosoEsdeDepartmentCode) {
		this.eosoEsdeDepartmentCode = eosoEsdeDepartmentCode;
		addValidField("eosoEsdeDepartmentCode");
	}

	/**
	 * Get eosoEsdeDepartmentName
	 */
	@Column(name = "EOSO_ESDE_DEPARTMENT_NAME")
	public String getEosoEsdeDepartmentName() {
		return eosoEsdeDepartmentName;
	}

	/**
	 * Set eosoEsdeDepartmentName
	 */
	public void setEosoEsdeDepartmentName(String eosoEsdeDepartmentName) {
		this.eosoEsdeDepartmentName = eosoEsdeDepartmentName;
		addValidField("eosoEsdeDepartmentName");
	}

	/**
	 * Get eosoEsusUserNameCn
	 */
	@Column(name = "EOSO_ESUS_USER_NAME_CN")
	public String getEosoEsusUserNameCn() {
		return eosoEsusUserNameCn;
	}

	/**
	 * Set eosoEsusUserNameCn
	 */
	public void setEosoEsusUserNameCn(String eosoEsusUserNameCn) {
		this.eosoEsusUserNameCn = eosoEsusUserNameCn;
		addValidField("eosoEsusUserNameCn");
	}

	/**
	 * Get eosoRetoType
	 */
	@Column(name = "EOSO_RETO_TYPE")
	public Long getEosoRetoType() {
		return eosoRetoType;
	}

	/**
	 * Set eosoRetoType
	 */
	public void setEosoRetoType(Long eosoRetoType) {
		this.eosoRetoType = eosoRetoType;
		addValidField("eosoRetoType");
	}

}
