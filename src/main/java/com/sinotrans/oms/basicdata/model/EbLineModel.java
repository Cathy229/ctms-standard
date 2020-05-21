package com.sinotrans.oms.basicdata.model;

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
 * Model class for EbLine
 */
@Entity
@Table(name = "EB_LINE")
public class EbLineModel extends BaseModel implements OperationLog {

	//eblnId
	private Long eblnId;
	//eblnEscoId
	private Long eblnEscoId;
	//eblnProjectId
	private Long eblnProjectId;
	//eblnEsstId
	private Long eblnEsstId;
	//eblnEbcuId
	private Long eblnEbcuId;
	//eblnStartEbrgId
	private Long eblnStartEbrgId;
	//eblnStartEbrgCode
	private String eblnStartEbrgCode;
	//eblnStartEbrgName
	private String eblnStartEbrgName;
	//eblnEndEbrgId
	private Long eblnEndEbrgId;
	//eblnEndEbrgCode
	private String eblnEndEbrgCode;
	//eblnEndEbrgName
	private String eblnEndEbrgName;
	//eblnIsDirect
	private String eblnIsDirect;
	//eblnEotaType
	private String eblnEotaType;
	//eblnQuickCode
	private String eblnQuickCode;
	//eblnCarryShipperEbsaId
	private Long eblnCarryShipperEbsaId;
	//eblnCarryShipperEbsaName
	private String eblnCarryShipperEbsaName;
	//eblnShipperEbsaId
	private Long eblnShipperEbsaId;
	//eblnShipperEbsaName
	private String eblnShipperEbsaName;
	//eblnLineName
	private String eblnLineName;
	//eblnLineCode
	private String eblnLineCode;
	//eblnHeavyActualMileage
	private Long eblnHeavyActualMileage;
	//eblnLightActualMileage
	private Long eblnLightActualMileage;
	//eblnOutwardActualMileage
	private Long eblnOutwardActualMileage;
	//eblnBackwardActualMileage
	private Long eblnBackwardActualMileage;
	//eblnRatedMileage
	private Long eblnRatedMileage;
	//eblnHeavyDrivingTime
	private String eblnHeavyDrivingTime;
	//eblnLightDrivingTime
	private String eblnLightDrivingTime;
	//eblnOutwardDrivingTime
	private String eblnOutwardDrivingTime;
	//eblnBackwardDrivingTime
	private String eblnBackwardDrivingTime;
	//eblnFees
	private Long eblnFees;
	//eblnOutwardFees
	private Long eblnOutwardFees;
	//eblnBackwardFees
	private Long eblnBackwardFees;
	//eblnHeavy
	private Long eblnHeavy;
	//eblnEmpty
	private Long eblnEmpty;
	//eblnStatus
	private String eblnStatus;
	//eblnIsVirulent
	private String eblnIsVirulent;
	//eblnLineDesc
	private String eblnLineDesc;
	//eblnSubstr1
	private String eblnSubstr1;
	//eblnSubstr2
	private String eblnSubstr2;
	//eblnSubstr3
	private String eblnSubstr3;
	//eblnSubstr4
	private String eblnSubstr4;
	//eblnSubstr5
	private String eblnSubstr5;
	//eblnSubstr6
	private String eblnSubstr6;
	//eblnSubstr7
	private String eblnSubstr7;
	//eblnSubstr8
	private String eblnSubstr8;
	//eblnSubdate1
	private Date eblnSubdate1;
	//eblnSubdate2
	private Date eblnSubdate2;
	//eblnSubdate3
	private Date eblnSubdate3;
	//eblnSubdate4
	private Date eblnSubdate4;
	//eblnSubnum1
	private Long eblnSubnum1;
	//eblnSubnum2
	private Long eblnSubnum2;
	//eblnSubnum3
	private Long eblnSubnum3;
	//eblnSubnum4
	private Long eblnSubnum4;
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
	 * Get eblnId
	 */
	@Column(name = "EBLN_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEblnId() {
		return eblnId;
	}

	/**
	 * Set eblnId
	 */
	public void setEblnId(Long eblnId) {
		this.eblnId = eblnId;
		addValidField("eblnId");
	}

	/**
	 * Get eblnEscoId
	 */
	@Column(name = "EBLN_ESCO_ID")
	public Long getEblnEscoId() {
		return eblnEscoId;
	}

	/**
	 * Set eblnEscoId
	 */
	public void setEblnEscoId(Long eblnEscoId) {
		this.eblnEscoId = eblnEscoId;
		addValidField("eblnEscoId");
	}

	/**
	 * Get eblnProjectId
	 */
	@Column(name = "EBLN_PROJECT_ID")
	public Long getEblnProjectId() {
		return eblnProjectId;
	}

	/**
	 * Set eblnProjectId
	 */
	public void setEblnProjectId(Long eblnProjectId) {
		this.eblnProjectId = eblnProjectId;
		addValidField("eblnProjectId");
	}

	/**
	 * Get eblnEsstId
	 */
	@Column(name = "EBLN_ESST_ID")
	public Long getEblnEsstId() {
		return eblnEsstId;
	}

	/**
	 * Set eblnEsstId
	 */
	public void setEblnEsstId(Long eblnEsstId) {
		this.eblnEsstId = eblnEsstId;
		addValidField("eblnEsstId");
	}

	/**
	 * Get eblnEbcuId
	 */
	@Column(name = "EBLN_EBCU_ID")
	public Long getEblnEbcuId() {
		return eblnEbcuId;
	}

	/**
	 * Set eblnEbcuId
	 */
	public void setEblnEbcuId(Long eblnEbcuId) {
		this.eblnEbcuId = eblnEbcuId;
		addValidField("eblnEbcuId");
	}

	/**
	 * Get eblnStartEbrgId
	 */
	@Column(name = "EBLN_START_EBRG_ID")
	public Long getEblnStartEbrgId() {
		return eblnStartEbrgId;
	}

	/**
	 * Set eblnStartEbrgId
	 */
	public void setEblnStartEbrgId(Long eblnStartEbrgId) {
		this.eblnStartEbrgId = eblnStartEbrgId;
		addValidField("eblnStartEbrgId");
	}

	/**
	 * Get eblnStartEbrgCode
	 */
	@Column(name = "EBLN_START_EBRG_CODE")
	public String getEblnStartEbrgCode() {
		return eblnStartEbrgCode;
	}

	/**
	 * Set eblnStartEbrgCode
	 */
	public void setEblnStartEbrgCode(String eblnStartEbrgCode) {
		this.eblnStartEbrgCode = eblnStartEbrgCode;
		addValidField("eblnStartEbrgCode");
	}

	/**
	 * Get eblnStartEbrgName
	 */
	@Column(name = "EBLN_START_EBRG_NAME")
	public String getEblnStartEbrgName() {
		return eblnStartEbrgName;
	}

	/**
	 * Set eblnStartEbrgName
	 */
	public void setEblnStartEbrgName(String eblnStartEbrgName) {
		this.eblnStartEbrgName = eblnStartEbrgName;
		addValidField("eblnStartEbrgName");
	}

	/**
	 * Get eblnEndEbrgId
	 */
	@Column(name = "EBLN_END_EBRG_ID")
	public Long getEblnEndEbrgId() {
		return eblnEndEbrgId;
	}

	/**
	 * Set eblnEndEbrgId
	 */
	public void setEblnEndEbrgId(Long eblnEndEbrgId) {
		this.eblnEndEbrgId = eblnEndEbrgId;
		addValidField("eblnEndEbrgId");
	}

	/**
	 * Get eblnEndEbrgCode
	 */
	@Column(name = "EBLN_END_EBRG_CODE")
	public String getEblnEndEbrgCode() {
		return eblnEndEbrgCode;
	}

	/**
	 * Set eblnEndEbrgCode
	 */
	public void setEblnEndEbrgCode(String eblnEndEbrgCode) {
		this.eblnEndEbrgCode = eblnEndEbrgCode;
		addValidField("eblnEndEbrgCode");
	}

	/**
	 * Get eblnEndEbrgName
	 */
	@Column(name = "EBLN_END_EBRG_NAME")
	public String getEblnEndEbrgName() {
		return eblnEndEbrgName;
	}

	/**
	 * Set eblnEndEbrgName
	 */
	public void setEblnEndEbrgName(String eblnEndEbrgName) {
		this.eblnEndEbrgName = eblnEndEbrgName;
		addValidField("eblnEndEbrgName");
	}

	/**
	 * Get eblnIsDirect
	 */
	@Column(name = "EBLN_IS_DIRECT")
	public String getEblnIsDirect() {
		return eblnIsDirect;
	}

	/**
	 * Set eblnIsDirect
	 */
	public void setEblnIsDirect(String eblnIsDirect) {
		this.eblnIsDirect = eblnIsDirect;
		addValidField("eblnIsDirect");
	}

	/**
	 * Get eblnEotaType
	 */
	@Column(name = "EBLN_EOTA_TYPE")
	public String getEblnEotaType() {
		return eblnEotaType;
	}

	/**
	 * Set eblnEotaType
	 */
	public void setEblnEotaType(String eblnEotaType) {
		this.eblnEotaType = eblnEotaType;
		addValidField("eblnEotaType");
	}

	/**
	 * Get eblnQuickCode
	 */
	@Column(name = "EBLN_QUICK_CODE")
	public String getEblnQuickCode() {
		return eblnQuickCode;
	}

	/**
	 * Set eblnQuickCode
	 */
	public void setEblnQuickCode(String eblnQuickCode) {
		this.eblnQuickCode = eblnQuickCode;
		addValidField("eblnQuickCode");
	}

	/**
	 * Get eblnCarryShipperEbsaId
	 */
	@Column(name = "EBLN_CARRY_SHIPPER_EBSA_ID")
	public Long getEblnCarryShipperEbsaId() {
		return eblnCarryShipperEbsaId;
	}

	/**
	 * Set eblnCarryShipperEbsaId
	 */
	public void setEblnCarryShipperEbsaId(Long eblnCarryShipperEbsaId) {
		this.eblnCarryShipperEbsaId = eblnCarryShipperEbsaId;
		addValidField("eblnCarryShipperEbsaId");
	}

	/**
	 * Get eblnCarryShipperEbsaName
	 */
	@Column(name = "EBLN_CARRY_SHIPPER_EBSA_NAME")
	public String getEblnCarryShipperEbsaName() {
		return eblnCarryShipperEbsaName;
	}

	/**
	 * Set eblnCarryShipperEbsaName
	 */
	public void setEblnCarryShipperEbsaName(String eblnCarryShipperEbsaName) {
		this.eblnCarryShipperEbsaName = eblnCarryShipperEbsaName;
		addValidField("eblnCarryShipperEbsaName");
	}

	/**
	 * Get eblnShipperEbsaId
	 */
	@Column(name = "EBLN_SHIPPER_EBSA_ID")
	public Long getEblnShipperEbsaId() {
		return eblnShipperEbsaId;
	}

	/**
	 * Set eblnShipperEbsaId
	 */
	public void setEblnShipperEbsaId(Long eblnShipperEbsaId) {
		this.eblnShipperEbsaId = eblnShipperEbsaId;
		addValidField("eblnShipperEbsaId");
	}

	/**
	 * Get eblnShipperEbsaName
	 */
	@Column(name = "EBLN_SHIPPER_EBSA_NAME")
	public String getEblnShipperEbsaName() {
		return eblnShipperEbsaName;
	}

	/**
	 * Set eblnShipperEbsaName
	 */
	public void setEblnShipperEbsaName(String eblnShipperEbsaName) {
		this.eblnShipperEbsaName = eblnShipperEbsaName;
		addValidField("eblnShipperEbsaName");
	}

	/**
	 * Get eblnLineName
	 */
	@Column(name = "EBLN_LINE_NAME")
	public String getEblnLineName() {
		return eblnLineName;
	}

	/**
	 * Set eblnLineName
	 */
	public void setEblnLineName(String eblnLineName) {
		this.eblnLineName = eblnLineName;
		addValidField("eblnLineName");
	}

	/**
	 * Get eblnLineCode
	 */
	@Column(name = "EBLN_LINE_CODE")
	public String getEblnLineCode() {
		return eblnLineCode;
	}

	/**
	 * Set eblnLineCode
	 */
	public void setEblnLineCode(String eblnLineCode) {
		this.eblnLineCode = eblnLineCode;
		addValidField("eblnLineCode");
	}

	/**
	 * Get eblnHeavyActualMileage
	 */
	@Column(name = "EBLN_HEAVY_ACTUAL_MILEAGE")
	public Long getEblnHeavyActualMileage() {
		return eblnHeavyActualMileage;
	}

	/**
	 * Set eblnHeavyActualMileage
	 */
	public void setEblnHeavyActualMileage(Long eblnHeavyActualMileage) {
		this.eblnHeavyActualMileage = eblnHeavyActualMileage;
		addValidField("eblnHeavyActualMileage");
	}

	/**
	 * Get eblnLightActualMileage
	 */
	@Column(name = "EBLN_LIGHT_ACTUAL_MILEAGE")
	public Long getEblnLightActualMileage() {
		return eblnLightActualMileage;
	}

	/**
	 * Set eblnLightActualMileage
	 */
	public void setEblnLightActualMileage(Long eblnLightActualMileage) {
		this.eblnLightActualMileage = eblnLightActualMileage;
		addValidField("eblnLightActualMileage");
	}

	/**
	 * Get eblnOutwardActualMileage
	 */
	@Column(name = "EBLN_OUTWARD_ACTUAL_MILEAGE")
	public Long getEblnOutwardActualMileage() {
		return eblnOutwardActualMileage;
	}

	/**
	 * Set eblnOutwardActualMileage
	 */
	public void setEblnOutwardActualMileage(Long eblnOutwardActualMileage) {
		this.eblnOutwardActualMileage = eblnOutwardActualMileage;
		addValidField("eblnOutwardActualMileage");
	}

	/**
	 * Get eblnBackwardActualMileage
	 */
	@Column(name = "EBLN_BACKWARD_ACTUAL_MILEAGE")
	public Long getEblnBackwardActualMileage() {
		return eblnBackwardActualMileage;
	}

	/**
	 * Set eblnBackwardActualMileage
	 */
	public void setEblnBackwardActualMileage(Long eblnBackwardActualMileage) {
		this.eblnBackwardActualMileage = eblnBackwardActualMileage;
		addValidField("eblnBackwardActualMileage");
	}

	/**
	 * Get eblnRatedMileage
	 */
	@Column(name = "EBLN_RATED_MILEAGE")
	public Long getEblnRatedMileage() {
		return eblnRatedMileage;
	}

	/**
	 * Set eblnRatedMileage
	 */
	public void setEblnRatedMileage(Long eblnRatedMileage) {
		this.eblnRatedMileage = eblnRatedMileage;
		addValidField("eblnRatedMileage");
	}

	/**
	 * Get eblnHeavyDrivingTime
	 */
	@Column(name = "EBLN_HEAVY_DRIVING_TIME")
	public String getEblnHeavyDrivingTime() {
		return eblnHeavyDrivingTime;
	}

	/**
	 * Set eblnHeavyDrivingTime
	 */
	public void setEblnHeavyDrivingTime(String eblnHeavyDrivingTime) {
		this.eblnHeavyDrivingTime = eblnHeavyDrivingTime;
		addValidField("eblnHeavyDrivingTime");
	}

	/**
	 * Get eblnLightDrivingTime
	 */
	@Column(name = "EBLN_LIGHT_DRIVING_TIME")
	public String getEblnLightDrivingTime() {
		return eblnLightDrivingTime;
	}

	/**
	 * Set eblnLightDrivingTime
	 */
	public void setEblnLightDrivingTime(String eblnLightDrivingTime) {
		this.eblnLightDrivingTime = eblnLightDrivingTime;
		addValidField("eblnLightDrivingTime");
	}

	/**
	 * Get eblnOutwardDrivingTime
	 */
	@Column(name = "EBLN_OUTWARD_DRIVING_TIME")
	public String getEblnOutwardDrivingTime() {
		return eblnOutwardDrivingTime;
	}

	/**
	 * Set eblnOutwardDrivingTime
	 */
	public void setEblnOutwardDrivingTime(String eblnOutwardDrivingTime) {
		this.eblnOutwardDrivingTime = eblnOutwardDrivingTime;
		addValidField("eblnOutwardDrivingTime");
	}

	/**
	 * Get eblnBackwardDrivingTime
	 */
	@Column(name = "EBLN_BACKWARD_DRIVING_TIME")
	public String getEblnBackwardDrivingTime() {
		return eblnBackwardDrivingTime;
	}

	/**
	 * Set eblnBackwardDrivingTime
	 */
	public void setEblnBackwardDrivingTime(String eblnBackwardDrivingTime) {
		this.eblnBackwardDrivingTime = eblnBackwardDrivingTime;
		addValidField("eblnBackwardDrivingTime");
	}

	/**
	 * Get eblnFees
	 */
	@Column(name = "EBLN_FEES")
	public Long getEblnFees() {
		return eblnFees;
	}

	/**
	 * Set eblnFees
	 */
	public void setEblnFees(Long eblnFees) {
		this.eblnFees = eblnFees;
		addValidField("eblnFees");
	}

	/**
	 * Get eblnOutwardFees
	 */
	@Column(name = "EBLN_OUTWARD_FEES")
	public Long getEblnOutwardFees() {
		return eblnOutwardFees;
	}

	/**
	 * Set eblnOutwardFees
	 */
	public void setEblnOutwardFees(Long eblnOutwardFees) {
		this.eblnOutwardFees = eblnOutwardFees;
		addValidField("eblnOutwardFees");
	}

	/**
	 * Get eblnBackwardFees
	 */
	@Column(name = "EBLN_BACKWARD_FEES")
	public Long getEblnBackwardFees() {
		return eblnBackwardFees;
	}

	/**
	 * Set eblnBackwardFees
	 */
	public void setEblnBackwardFees(Long eblnBackwardFees) {
		this.eblnBackwardFees = eblnBackwardFees;
		addValidField("eblnBackwardFees");
	}

	/**
	 * Get eblnHeavy
	 */
	@Column(name = "EBLN_HEAVY")
	public Long getEblnHeavy() {
		return eblnHeavy;
	}

	/**
	 * Set eblnHeavy
	 */
	public void setEblnHeavy(Long eblnHeavy) {
		this.eblnHeavy = eblnHeavy;
		addValidField("eblnHeavy");
	}

	/**
	 * Get eblnEmpty
	 */
	@Column(name = "EBLN_EMPTY")
	public Long getEblnEmpty() {
		return eblnEmpty;
	}

	/**
	 * Set eblnEmpty
	 */
	public void setEblnEmpty(Long eblnEmpty) {
		this.eblnEmpty = eblnEmpty;
		addValidField("eblnEmpty");
	}

	/**
	 * Get eblnStatus
	 */
	@Column(name = "EBLN_STATUS")
	public String getEblnStatus() {
		return eblnStatus;
	}

	/**
	 * Set eblnStatus
	 */
	public void setEblnStatus(String eblnStatus) {
		this.eblnStatus = eblnStatus;
		addValidField("eblnStatus");
	}

	/**
	 * Get eblnIsVirulent
	 */
	@Column(name = "EBLN_IS_VIRULENT")
	public String getEblnIsVirulent() {
		return eblnIsVirulent;
	}

	/**
	 * Set eblnIsVirulent
	 */
	public void setEblnIsVirulent(String eblnIsVirulent) {
		this.eblnIsVirulent = eblnIsVirulent;
		addValidField("eblnIsVirulent");
	}

	/**
	 * Get eblnLineDesc
	 */
	@Column(name = "EBLN_LINE_DESC")
	public String getEblnLineDesc() {
		return eblnLineDesc;
	}

	/**
	 * Set eblnLineDesc
	 */
	public void setEblnLineDesc(String eblnLineDesc) {
		this.eblnLineDesc = eblnLineDesc;
		addValidField("eblnLineDesc");
	}

	/**
	 * Get eblnSubstr1
	 */
	@Column(name = "EBLN_SUBSTR1")
	public String getEblnSubstr1() {
		return eblnSubstr1;
	}

	/**
	 * Set eblnSubstr1
	 */
	public void setEblnSubstr1(String eblnSubstr1) {
		this.eblnSubstr1 = eblnSubstr1;
		addValidField("eblnSubstr1");
	}

	/**
	 * Get eblnSubstr2
	 */
	@Column(name = "EBLN_SUBSTR2")
	public String getEblnSubstr2() {
		return eblnSubstr2;
	}

	/**
	 * Set eblnSubstr2
	 */
	public void setEblnSubstr2(String eblnSubstr2) {
		this.eblnSubstr2 = eblnSubstr2;
		addValidField("eblnSubstr2");
	}

	/**
	 * Get eblnSubstr3
	 */
	@Column(name = "EBLN_SUBSTR3")
	public String getEblnSubstr3() {
		return eblnSubstr3;
	}

	/**
	 * Set eblnSubstr3
	 */
	public void setEblnSubstr3(String eblnSubstr3) {
		this.eblnSubstr3 = eblnSubstr3;
		addValidField("eblnSubstr3");
	}

	/**
	 * Get eblnSubstr4
	 */
	@Column(name = "EBLN_SUBSTR4")
	public String getEblnSubstr4() {
		return eblnSubstr4;
	}

	/**
	 * Set eblnSubstr4
	 */
	public void setEblnSubstr4(String eblnSubstr4) {
		this.eblnSubstr4 = eblnSubstr4;
		addValidField("eblnSubstr4");
	}

	/**
	 * Get eblnSubstr5
	 */
	@Column(name = "EBLN_SUBSTR5")
	public String getEblnSubstr5() {
		return eblnSubstr5;
	}

	/**
	 * Set eblnSubstr5
	 */
	public void setEblnSubstr5(String eblnSubstr5) {
		this.eblnSubstr5 = eblnSubstr5;
		addValidField("eblnSubstr5");
	}

	/**
	 * Get eblnSubstr6
	 */
	@Column(name = "EBLN_SUBSTR6")
	public String getEblnSubstr6() {
		return eblnSubstr6;
	}

	/**
	 * Set eblnSubstr6
	 */
	public void setEblnSubstr6(String eblnSubstr6) {
		this.eblnSubstr6 = eblnSubstr6;
		addValidField("eblnSubstr6");
	}

	/**
	 * Get eblnSubstr7
	 */
	@Column(name = "EBLN_SUBSTR7")
	public String getEblnSubstr7() {
		return eblnSubstr7;
	}

	/**
	 * Set eblnSubstr7
	 */
	public void setEblnSubstr7(String eblnSubstr7) {
		this.eblnSubstr7 = eblnSubstr7;
		addValidField("eblnSubstr7");
	}

	/**
	 * Get eblnSubstr8
	 */
	@Column(name = "EBLN_SUBSTR8")
	public String getEblnSubstr8() {
		return eblnSubstr8;
	}

	/**
	 * Set eblnSubstr8
	 */
	public void setEblnSubstr8(String eblnSubstr8) {
		this.eblnSubstr8 = eblnSubstr8;
		addValidField("eblnSubstr8");
	}

	/**
	 * Get eblnSubdate1
	 */
	@Column(name = "EBLN_SUBDATE1")
	public Date getEblnSubdate1() {
		return eblnSubdate1;
	}

	/**
	 * Set eblnSubdate1
	 */
	public void setEblnSubdate1(Date eblnSubdate1) {
		this.eblnSubdate1 = eblnSubdate1;
		addValidField("eblnSubdate1");
	}

	/**
	 * Get eblnSubdate2
	 */
	@Column(name = "EBLN_SUBDATE2")
	public Date getEblnSubdate2() {
		return eblnSubdate2;
	}

	/**
	 * Set eblnSubdate2
	 */
	public void setEblnSubdate2(Date eblnSubdate2) {
		this.eblnSubdate2 = eblnSubdate2;
		addValidField("eblnSubdate2");
	}

	/**
	 * Get eblnSubdate3
	 */
	@Column(name = "EBLN_SUBDATE3")
	public Date getEblnSubdate3() {
		return eblnSubdate3;
	}

	/**
	 * Set eblnSubdate3
	 */
	public void setEblnSubdate3(Date eblnSubdate3) {
		this.eblnSubdate3 = eblnSubdate3;
		addValidField("eblnSubdate3");
	}

	/**
	 * Get eblnSubdate4
	 */
	@Column(name = "EBLN_SUBDATE4")
	public Date getEblnSubdate4() {
		return eblnSubdate4;
	}

	/**
	 * Set eblnSubdate4
	 */
	public void setEblnSubdate4(Date eblnSubdate4) {
		this.eblnSubdate4 = eblnSubdate4;
		addValidField("eblnSubdate4");
	}

	/**
	 * Get eblnSubnum1
	 */
	@Column(name = "EBLN_SUBNUM1")
	public Long getEblnSubnum1() {
		return eblnSubnum1;
	}

	/**
	 * Set eblnSubnum1
	 */
	public void setEblnSubnum1(Long eblnSubnum1) {
		this.eblnSubnum1 = eblnSubnum1;
		addValidField("eblnSubnum1");
	}

	/**
	 * Get eblnSubnum2
	 */
	@Column(name = "EBLN_SUBNUM2")
	public Long getEblnSubnum2() {
		return eblnSubnum2;
	}

	/**
	 * Set eblnSubnum2
	 */
	public void setEblnSubnum2(Long eblnSubnum2) {
		this.eblnSubnum2 = eblnSubnum2;
		addValidField("eblnSubnum2");
	}

	/**
	 * Get eblnSubnum3
	 */
	@Column(name = "EBLN_SUBNUM3")
	public Long getEblnSubnum3() {
		return eblnSubnum3;
	}

	/**
	 * Set eblnSubnum3
	 */
	public void setEblnSubnum3(Long eblnSubnum3) {
		this.eblnSubnum3 = eblnSubnum3;
		addValidField("eblnSubnum3");
	}

	/**
	 * Get eblnSubnum4
	 */
	@Column(name = "EBLN_SUBNUM4")
	public Long getEblnSubnum4() {
		return eblnSubnum4;
	}

	/**
	 * Set eblnSubnum4
	 */
	public void setEblnSubnum4(Long eblnSubnum4) {
		this.eblnSubnum4 = eblnSubnum4;
		addValidField("eblnSubnum4");
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
