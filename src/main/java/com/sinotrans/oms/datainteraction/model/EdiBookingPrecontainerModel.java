package com.sinotrans.oms.datainteraction.model;

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
 * Model class for EdiBookingPrecontainer
 */
@Entity
@Table(name = "EDI_BOOKING_PRECONTAINER")
public class EdiBookingPrecontainerModel extends BaseModel implements OperationLog {

	//edbpId
	private Long edbpId;
	//edbpEdboId
	private Long edbpEdboId;
	//edbpCntCustomized
	private String edbpCntCustomized;
	//edbpCntCustomizedSize
	private String edbpCntCustomizedSize;
	//edbpCtnNumber
	private Integer edbpCtnNumber;
	//edbpFclLcl
	private String edbpFclLcl;
	//edbpMasterLclNo
	private String edbpMasterLclNo;
	//edbpStuffingMode
	private String edbpStuffingMode;
	//edbpVanningDepotCode
	private String edbpVanningDepotCode;
	//edbpVanningDepotDescription
	private String edbpVanningDepotDescription;
	//edbpIsSoc
	private String edbpIsSoc;
	//edbpCntSupplierType
	private Integer edbpCntSupplierType;
	//edbpConsolidatorCode
	private String edbpConsolidatorCode;
	//edbpSubstr1
	private String edbpSubstr1;
	//edbpSubstr2
	private String edbpSubstr2;
	//edbpSubstr3
	private String edbpSubstr3;
	//edbpSubstr4
	private String edbpSubstr4;
	//edbpSubstr5
	private String edbpSubstr5;
	//edbpSubstr6
	private String edbpSubstr6;
	//edbpSubstr7
	private String edbpSubstr7;
	//edbpSubstr8
	private String edbpSubstr8;
	//edbpSubdate1
	private Date edbpSubdate1;
	//edbpSubdate2
	private Date edbpSubdate2;
	//edbpSubdate3
	private Date edbpSubdate3;
	//edbpSubdate4
	private Date edbpSubdate4;
	//edbpSubnum1
	private Long edbpSubnum1;
	//edbpSubnum2
	private Long edbpSubnum2;
	//edbpSubnum3
	private Long edbpSubnum3;
	//edbpSubnum4
	private Long edbpSubnum4;
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
	 * Get edbpId
	 */
	@Column(name = "EDBP_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEdbpId() {
		return edbpId;
	}

	/**
	 * Set edbpId
	 */
	public void setEdbpId(Long edbpId) {
		this.edbpId = edbpId;
		addValidField("edbpId");
	}

	/**
	 * Get edbpEdboId
	 */
	@Column(name = "EDBP_EDBO_ID")
	public Long getEdbpEdboId() {
		return edbpEdboId;
	}

	/**
	 * Set edbpEdboId
	 */
	public void setEdbpEdboId(Long edbpEdboId) {
		this.edbpEdboId = edbpEdboId;
		addValidField("edbpEdboId");
	}

	/**
	 * Get edbpCntCustomized
	 */
	@Column(name = "EDBP_CNT_CUSTOMIZED")
	public String getEdbpCntCustomized() {
		return edbpCntCustomized;
	}

	/**
	 * Set edbpCntCustomized
	 */
	public void setEdbpCntCustomized(String edbpCntCustomized) {
		this.edbpCntCustomized = edbpCntCustomized;
		addValidField("edbpCntCustomized");
	}

	/**
	 * Get edbpCntCustomizedSize
	 */
	@Column(name = "EDBP_CNT_CUSTOMIZED_SIZE")
	public String getEdbpCntCustomizedSize() {
		return edbpCntCustomizedSize;
	}

	/**
	 * Set edbpCntCustomizedSize
	 */
	public void setEdbpCntCustomizedSize(String edbpCntCustomizedSize) {
		this.edbpCntCustomizedSize = edbpCntCustomizedSize;
		addValidField("edbpCntCustomizedSize");
	}

	/**
	 * Get edbpCtnNumber
	 */
	@Column(name = "EDBP_CTN_NUMBER")
	public Integer getEdbpCtnNumber() {
		return edbpCtnNumber;
	}

	/**
	 * Set edbpCtnNumber
	 */
	public void setEdbpCtnNumber(Integer edbpCtnNumber) {
		this.edbpCtnNumber = edbpCtnNumber;
		addValidField("edbpCtnNumber");
	}

	/**
	 * Get edbpFclLcl
	 */
	@Column(name = "EDBP_FCL_LCL")
	public String getEdbpFclLcl() {
		return edbpFclLcl;
	}

	/**
	 * Set edbpFclLcl
	 */
	public void setEdbpFclLcl(String edbpFclLcl) {
		this.edbpFclLcl = edbpFclLcl;
		addValidField("edbpFclLcl");
	}

	/**
	 * Get edbpMasterLclNo
	 */
	@Column(name = "EDBP_MASTER_LCL_NO")
	public String getEdbpMasterLclNo() {
		return edbpMasterLclNo;
	}

	/**
	 * Set edbpMasterLclNo
	 */
	public void setEdbpMasterLclNo(String edbpMasterLclNo) {
		this.edbpMasterLclNo = edbpMasterLclNo;
		addValidField("edbpMasterLclNo");
	}

	/**
	 * Get edbpStuffingMode
	 */
	@Column(name = "EDBP_STUFFING_MODE")
	public String getEdbpStuffingMode() {
		return edbpStuffingMode;
	}

	/**
	 * Set edbpStuffingMode
	 */
	public void setEdbpStuffingMode(String edbpStuffingMode) {
		this.edbpStuffingMode = edbpStuffingMode;
		addValidField("edbpStuffingMode");
	}

	/**
	 * Get edbpVanningDepotCode
	 */
	@Column(name = "EDBP_VANNING_DEPOT_CODE")
	public String getEdbpVanningDepotCode() {
		return edbpVanningDepotCode;
	}

	/**
	 * Set edbpVanningDepotCode
	 */
	public void setEdbpVanningDepotCode(String edbpVanningDepotCode) {
		this.edbpVanningDepotCode = edbpVanningDepotCode;
		addValidField("edbpVanningDepotCode");
	}

	/**
	 * Get edbpVanningDepotDescription
	 */
	@Column(name = "EDBP_VANNING_DEPOT_DESCRIPTION")
	public String getEdbpVanningDepotDescription() {
		return edbpVanningDepotDescription;
	}

	/**
	 * Set edbpVanningDepotDescription
	 */
	public void setEdbpVanningDepotDescription(String edbpVanningDepotDescription) {
		this.edbpVanningDepotDescription = edbpVanningDepotDescription;
		addValidField("edbpVanningDepotDescription");
	}

	/**
	 * Get edbpIsSoc
	 */
	@Column(name = "EDBP_IS_SOC")
	public String getEdbpIsSoc() {
		return edbpIsSoc;
	}

	/**
	 * Set edbpIsSoc
	 */
	public void setEdbpIsSoc(String edbpIsSoc) {
		this.edbpIsSoc = edbpIsSoc;
		addValidField("edbpIsSoc");
	}

	/**
	 * Get edbpCntSupplierType
	 */
	@Column(name = "EDBP_CNT_SUPPLIER_TYPE")
	public Integer getEdbpCntSupplierType() {
		return edbpCntSupplierType;
	}

	/**
	 * Set edbpCntSupplierType
	 */
	public void setEdbpCntSupplierType(Integer edbpCntSupplierType) {
		this.edbpCntSupplierType = edbpCntSupplierType;
		addValidField("edbpCntSupplierType");
	}

	/**
	 * Get edbpConsolidatorCode
	 */
	@Column(name = "EDBP_CONSOLIDATOR_CODE")
	public String getEdbpConsolidatorCode() {
		return edbpConsolidatorCode;
	}

	/**
	 * Set edbpConsolidatorCode
	 */
	public void setEdbpConsolidatorCode(String edbpConsolidatorCode) {
		this.edbpConsolidatorCode = edbpConsolidatorCode;
		addValidField("edbpConsolidatorCode");
	}

	/**
	 * Get edbpSubstr1
	 */
	@Column(name = "EDBP_SUBSTR1")
	public String getEdbpSubstr1() {
		return edbpSubstr1;
	}

	/**
	 * Set edbpSubstr1
	 */
	public void setEdbpSubstr1(String edbpSubstr1) {
		this.edbpSubstr1 = edbpSubstr1;
		addValidField("edbpSubstr1");
	}

	/**
	 * Get edbpSubstr2
	 */
	@Column(name = "EDBP_SUBSTR2")
	public String getEdbpSubstr2() {
		return edbpSubstr2;
	}

	/**
	 * Set edbpSubstr2
	 */
	public void setEdbpSubstr2(String edbpSubstr2) {
		this.edbpSubstr2 = edbpSubstr2;
		addValidField("edbpSubstr2");
	}

	/**
	 * Get edbpSubstr3
	 */
	@Column(name = "EDBP_SUBSTR3")
	public String getEdbpSubstr3() {
		return edbpSubstr3;
	}

	/**
	 * Set edbpSubstr3
	 */
	public void setEdbpSubstr3(String edbpSubstr3) {
		this.edbpSubstr3 = edbpSubstr3;
		addValidField("edbpSubstr3");
	}

	/**
	 * Get edbpSubstr4
	 */
	@Column(name = "EDBP_SUBSTR4")
	public String getEdbpSubstr4() {
		return edbpSubstr4;
	}

	/**
	 * Set edbpSubstr4
	 */
	public void setEdbpSubstr4(String edbpSubstr4) {
		this.edbpSubstr4 = edbpSubstr4;
		addValidField("edbpSubstr4");
	}

	/**
	 * Get edbpSubstr5
	 */
	@Column(name = "EDBP_SUBSTR5")
	public String getEdbpSubstr5() {
		return edbpSubstr5;
	}

	/**
	 * Set edbpSubstr5
	 */
	public void setEdbpSubstr5(String edbpSubstr5) {
		this.edbpSubstr5 = edbpSubstr5;
		addValidField("edbpSubstr5");
	}

	/**
	 * Get edbpSubstr6
	 */
	@Column(name = "EDBP_SUBSTR6")
	public String getEdbpSubstr6() {
		return edbpSubstr6;
	}

	/**
	 * Set edbpSubstr6
	 */
	public void setEdbpSubstr6(String edbpSubstr6) {
		this.edbpSubstr6 = edbpSubstr6;
		addValidField("edbpSubstr6");
	}

	/**
	 * Get edbpSubstr7
	 */
	@Column(name = "EDBP_SUBSTR7")
	public String getEdbpSubstr7() {
		return edbpSubstr7;
	}

	/**
	 * Set edbpSubstr7
	 */
	public void setEdbpSubstr7(String edbpSubstr7) {
		this.edbpSubstr7 = edbpSubstr7;
		addValidField("edbpSubstr7");
	}

	/**
	 * Get edbpSubstr8
	 */
	@Column(name = "EDBP_SUBSTR8")
	public String getEdbpSubstr8() {
		return edbpSubstr8;
	}

	/**
	 * Set edbpSubstr8
	 */
	public void setEdbpSubstr8(String edbpSubstr8) {
		this.edbpSubstr8 = edbpSubstr8;
		addValidField("edbpSubstr8");
	}

	/**
	 * Get edbpSubdate1
	 */
	@Column(name = "EDBP_SUBDATE1")
	public Date getEdbpSubdate1() {
		return edbpSubdate1;
	}

	/**
	 * Set edbpSubdate1
	 */
	public void setEdbpSubdate1(Date edbpSubdate1) {
		this.edbpSubdate1 = edbpSubdate1;
		addValidField("edbpSubdate1");
	}

	/**
	 * Get edbpSubdate2
	 */
	@Column(name = "EDBP_SUBDATE2")
	public Date getEdbpSubdate2() {
		return edbpSubdate2;
	}

	/**
	 * Set edbpSubdate2
	 */
	public void setEdbpSubdate2(Date edbpSubdate2) {
		this.edbpSubdate2 = edbpSubdate2;
		addValidField("edbpSubdate2");
	}

	/**
	 * Get edbpSubdate3
	 */
	@Column(name = "EDBP_SUBDATE3")
	public Date getEdbpSubdate3() {
		return edbpSubdate3;
	}

	/**
	 * Set edbpSubdate3
	 */
	public void setEdbpSubdate3(Date edbpSubdate3) {
		this.edbpSubdate3 = edbpSubdate3;
		addValidField("edbpSubdate3");
	}

	/**
	 * Get edbpSubdate4
	 */
	@Column(name = "EDBP_SUBDATE4")
	public Date getEdbpSubdate4() {
		return edbpSubdate4;
	}

	/**
	 * Set edbpSubdate4
	 */
	public void setEdbpSubdate4(Date edbpSubdate4) {
		this.edbpSubdate4 = edbpSubdate4;
		addValidField("edbpSubdate4");
	}

	/**
	 * Get edbpSubnum1
	 */
	@Column(name = "EDBP_SUBNUM1")
	public Long getEdbpSubnum1() {
		return edbpSubnum1;
	}

	/**
	 * Set edbpSubnum1
	 */
	public void setEdbpSubnum1(Long edbpSubnum1) {
		this.edbpSubnum1 = edbpSubnum1;
		addValidField("edbpSubnum1");
	}

	/**
	 * Get edbpSubnum2
	 */
	@Column(name = "EDBP_SUBNUM2")
	public Long getEdbpSubnum2() {
		return edbpSubnum2;
	}

	/**
	 * Set edbpSubnum2
	 */
	public void setEdbpSubnum2(Long edbpSubnum2) {
		this.edbpSubnum2 = edbpSubnum2;
		addValidField("edbpSubnum2");
	}

	/**
	 * Get edbpSubnum3
	 */
	@Column(name = "EDBP_SUBNUM3")
	public Long getEdbpSubnum3() {
		return edbpSubnum3;
	}

	/**
	 * Set edbpSubnum3
	 */
	public void setEdbpSubnum3(Long edbpSubnum3) {
		this.edbpSubnum3 = edbpSubnum3;
		addValidField("edbpSubnum3");
	}

	/**
	 * Get edbpSubnum4
	 */
	@Column(name = "EDBP_SUBNUM4")
	public Long getEdbpSubnum4() {
		return edbpSubnum4;
	}

	/**
	 * Set edbpSubnum4
	 */
	public void setEdbpSubnum4(Long edbpSubnum4) {
		this.edbpSubnum4 = edbpSubnum4;
		addValidField("edbpSubnum4");
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
