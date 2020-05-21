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
 * Model class for EdiBookingPreFeedback
 */
@Entity
@Table(name = "EDI_BOOKING_PRE_FEEDBACK")
public class EdiBookingPreFeedbackModel extends BaseModel implements OperationLog {

	//edbrId
	private Long edbrId;
	//edbrEdbbId
	private Long edbrEdbbId;
	//edbrCntCustomized
	private String edbrCntCustomized;
	//edbrCntCustomizedSize
	private String edbrCntCustomizedSize;
	//edbrSizeTypeName
	private String edbrSizeTypeName;
	//edbrCtnNumber
	private Integer edbrCtnNumber;
	//edbrFclLcl
	private String edbrFclLcl;
	//edbrMasterLclNo
	private String edbrMasterLclNo;
	//edbrStuffingMode
	private String edbrStuffingMode;
	//edbrVanningDepotCode
	private String edbrVanningDepotCode;
	//edbrVanningDepotDescription
	private String edbrVanningDepotDescription;
	//edbrIsSoc
	private String edbrIsSoc;
	//edbrCntSupplierType
	private Integer edbrCntSupplierType;
	//edbrConsolidatorCode
	private String edbrConsolidatorCode;
	//edbrSubstr1
	private String edbrSubstr1;
	//edbrSubstr2
	private String edbrSubstr2;
	//edbrSubstr3
	private String edbrSubstr3;
	//edbrSubstr4
	private String edbrSubstr4;
	//edbrSubstr5
	private String edbrSubstr5;
	//edbrSubstr6
	private String edbrSubstr6;
	//edbrSubstr7
	private String edbrSubstr7;
	//edbrSubstr8
	private String edbrSubstr8;
	//edbrSubdate1
	private Date edbrSubdate1;
	//edbrSubdate2
	private Date edbrSubdate2;
	//edbrSubdate3
	private Date edbrSubdate3;
	//edbrSubdate4
	private Date edbrSubdate4;
	//edbrSubnum1
	private Long edbrSubnum1;
	//edbrSubnum2
	private Long edbrSubnum2;
	//edbrSubnum3
	private Long edbrSubnum3;
	//edbrSubnum4
	private Long edbrSubnum4;
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
	 * Get edbrId
	 */
	@Column(name = "EDBR_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEdbrId() {
		return edbrId;
	}

	/**
	 * Set edbrId
	 */
	public void setEdbrId(Long edbrId) {
		this.edbrId = edbrId;
		addValidField("edbrId");
	}

	/**
	 * Get edbrEdbbId
	 */
	@Column(name = "EDBR_EDBB_ID")
	public Long getEdbrEdbbId() {
		return edbrEdbbId;
	}

	/**
	 * Set edbrEdbbId
	 */
	public void setEdbrEdbbId(Long edbrEdbbId) {
		this.edbrEdbbId = edbrEdbbId;
		addValidField("edbrEdbbId");
	}

	/**
	 * Get edbrCntCustomized
	 */
	@Column(name = "EDBR_CNT_CUSTOMIZED")
	public String getEdbrCntCustomized() {
		return edbrCntCustomized;
	}

	/**
	 * Set edbrCntCustomized
	 */
	public void setEdbrCntCustomized(String edbrCntCustomized) {
		this.edbrCntCustomized = edbrCntCustomized;
		addValidField("edbrCntCustomized");
	}

	/**
	 * Get edbrCntCustomizedSize
	 */
	@Column(name = "EDBR_CNT_CUSTOMIZED_SIZE")
	public String getEdbrCntCustomizedSize() {
		return edbrCntCustomizedSize;
	}

	/**
	 * Set edbrCntCustomizedSize
	 */
	public void setEdbrCntCustomizedSize(String edbrCntCustomizedSize) {
		this.edbrCntCustomizedSize = edbrCntCustomizedSize;
		addValidField("edbrCntCustomizedSize");
	}

	/**
	 * Get edbrSizeTypeName
	 */
	@Column(name = "EDBR_SIZE_TYPE_NAME")
	public String getEdbrSizeTypeName() {
		return edbrSizeTypeName;
	}

	/**
	 * Set edbrSizeTypeName
	 */
	public void setEdbrSizeTypeName(String edbrSizeTypeName) {
		this.edbrSizeTypeName = edbrSizeTypeName;
		addValidField("edbrSizeTypeName");
	}

	/**
	 * Get edbrCtnNumber
	 */
	@Column(name = "EDBR_CTN_NUMBER")
	public Integer getEdbrCtnNumber() {
		return edbrCtnNumber;
	}

	/**
	 * Set edbrCtnNumber
	 */
	public void setEdbrCtnNumber(Integer edbrCtnNumber) {
		this.edbrCtnNumber = edbrCtnNumber;
		addValidField("edbrCtnNumber");
	}

	/**
	 * Get edbrFclLcl
	 */
	@Column(name = "EDBR_FCL_LCL")
	public String getEdbrFclLcl() {
		return edbrFclLcl;
	}

	/**
	 * Set edbrFclLcl
	 */
	public void setEdbrFclLcl(String edbrFclLcl) {
		this.edbrFclLcl = edbrFclLcl;
		addValidField("edbrFclLcl");
	}

	/**
	 * Get edbrMasterLclNo
	 */
	@Column(name = "EDBR_MASTER_LCL_NO")
	public String getEdbrMasterLclNo() {
		return edbrMasterLclNo;
	}

	/**
	 * Set edbrMasterLclNo
	 */
	public void setEdbrMasterLclNo(String edbrMasterLclNo) {
		this.edbrMasterLclNo = edbrMasterLclNo;
		addValidField("edbrMasterLclNo");
	}

	/**
	 * Get edbrStuffingMode
	 */
	@Column(name = "EDBR_STUFFING_MODE")
	public String getEdbrStuffingMode() {
		return edbrStuffingMode;
	}

	/**
	 * Set edbrStuffingMode
	 */
	public void setEdbrStuffingMode(String edbrStuffingMode) {
		this.edbrStuffingMode = edbrStuffingMode;
		addValidField("edbrStuffingMode");
	}

	/**
	 * Get edbrVanningDepotCode
	 */
	@Column(name = "EDBR_VANNING_DEPOT_CODE")
	public String getEdbrVanningDepotCode() {
		return edbrVanningDepotCode;
	}

	/**
	 * Set edbrVanningDepotCode
	 */
	public void setEdbrVanningDepotCode(String edbrVanningDepotCode) {
		this.edbrVanningDepotCode = edbrVanningDepotCode;
		addValidField("edbrVanningDepotCode");
	}

	/**
	 * Get edbrVanningDepotDescription
	 */
	@Column(name = "EDBR_VANNING_DEPOT_DESCRIPTION")
	public String getEdbrVanningDepotDescription() {
		return edbrVanningDepotDescription;
	}

	/**
	 * Set edbrVanningDepotDescription
	 */
	public void setEdbrVanningDepotDescription(String edbrVanningDepotDescription) {
		this.edbrVanningDepotDescription = edbrVanningDepotDescription;
		addValidField("edbrVanningDepotDescription");
	}

	/**
	 * Get edbrIsSoc
	 */
	@Column(name = "EDBR_IS_SOC")
	public String getEdbrIsSoc() {
		return edbrIsSoc;
	}

	/**
	 * Set edbrIsSoc
	 */
	public void setEdbrIsSoc(String edbrIsSoc) {
		this.edbrIsSoc = edbrIsSoc;
		addValidField("edbrIsSoc");
	}

	/**
	 * Get edbrCntSupplierType
	 */
	@Column(name = "EDBR_CNT_SUPPLIER_TYPE")
	public Integer getEdbrCntSupplierType() {
		return edbrCntSupplierType;
	}

	/**
	 * Set edbrCntSupplierType
	 */
	public void setEdbrCntSupplierType(Integer edbrCntSupplierType) {
		this.edbrCntSupplierType = edbrCntSupplierType;
		addValidField("edbrCntSupplierType");
	}

	/**
	 * Get edbrConsolidatorCode
	 */
	@Column(name = "EDBR_CONSOLIDATOR_CODE")
	public String getEdbrConsolidatorCode() {
		return edbrConsolidatorCode;
	}

	/**
	 * Set edbrConsolidatorCode
	 */
	public void setEdbrConsolidatorCode(String edbrConsolidatorCode) {
		this.edbrConsolidatorCode = edbrConsolidatorCode;
		addValidField("edbrConsolidatorCode");
	}

	/**
	 * Get edbrSubstr1
	 */
	@Column(name = "EDBR_SUBSTR1")
	public String getEdbrSubstr1() {
		return edbrSubstr1;
	}

	/**
	 * Set edbrSubstr1
	 */
	public void setEdbrSubstr1(String edbrSubstr1) {
		this.edbrSubstr1 = edbrSubstr1;
		addValidField("edbrSubstr1");
	}

	/**
	 * Get edbrSubstr2
	 */
	@Column(name = "EDBR_SUBSTR2")
	public String getEdbrSubstr2() {
		return edbrSubstr2;
	}

	/**
	 * Set edbrSubstr2
	 */
	public void setEdbrSubstr2(String edbrSubstr2) {
		this.edbrSubstr2 = edbrSubstr2;
		addValidField("edbrSubstr2");
	}

	/**
	 * Get edbrSubstr3
	 */
	@Column(name = "EDBR_SUBSTR3")
	public String getEdbrSubstr3() {
		return edbrSubstr3;
	}

	/**
	 * Set edbrSubstr3
	 */
	public void setEdbrSubstr3(String edbrSubstr3) {
		this.edbrSubstr3 = edbrSubstr3;
		addValidField("edbrSubstr3");
	}

	/**
	 * Get edbrSubstr4
	 */
	@Column(name = "EDBR_SUBSTR4")
	public String getEdbrSubstr4() {
		return edbrSubstr4;
	}

	/**
	 * Set edbrSubstr4
	 */
	public void setEdbrSubstr4(String edbrSubstr4) {
		this.edbrSubstr4 = edbrSubstr4;
		addValidField("edbrSubstr4");
	}

	/**
	 * Get edbrSubstr5
	 */
	@Column(name = "EDBR_SUBSTR5")
	public String getEdbrSubstr5() {
		return edbrSubstr5;
	}

	/**
	 * Set edbrSubstr5
	 */
	public void setEdbrSubstr5(String edbrSubstr5) {
		this.edbrSubstr5 = edbrSubstr5;
		addValidField("edbrSubstr5");
	}

	/**
	 * Get edbrSubstr6
	 */
	@Column(name = "EDBR_SUBSTR6")
	public String getEdbrSubstr6() {
		return edbrSubstr6;
	}

	/**
	 * Set edbrSubstr6
	 */
	public void setEdbrSubstr6(String edbrSubstr6) {
		this.edbrSubstr6 = edbrSubstr6;
		addValidField("edbrSubstr6");
	}

	/**
	 * Get edbrSubstr7
	 */
	@Column(name = "EDBR_SUBSTR7")
	public String getEdbrSubstr7() {
		return edbrSubstr7;
	}

	/**
	 * Set edbrSubstr7
	 */
	public void setEdbrSubstr7(String edbrSubstr7) {
		this.edbrSubstr7 = edbrSubstr7;
		addValidField("edbrSubstr7");
	}

	/**
	 * Get edbrSubstr8
	 */
	@Column(name = "EDBR_SUBSTR8")
	public String getEdbrSubstr8() {
		return edbrSubstr8;
	}

	/**
	 * Set edbrSubstr8
	 */
	public void setEdbrSubstr8(String edbrSubstr8) {
		this.edbrSubstr8 = edbrSubstr8;
		addValidField("edbrSubstr8");
	}

	/**
	 * Get edbrSubdate1
	 */
	@Column(name = "EDBR_SUBDATE1")
	public Date getEdbrSubdate1() {
		return edbrSubdate1;
	}

	/**
	 * Set edbrSubdate1
	 */
	public void setEdbrSubdate1(Date edbrSubdate1) {
		this.edbrSubdate1 = edbrSubdate1;
		addValidField("edbrSubdate1");
	}

	/**
	 * Get edbrSubdate2
	 */
	@Column(name = "EDBR_SUBDATE2")
	public Date getEdbrSubdate2() {
		return edbrSubdate2;
	}

	/**
	 * Set edbrSubdate2
	 */
	public void setEdbrSubdate2(Date edbrSubdate2) {
		this.edbrSubdate2 = edbrSubdate2;
		addValidField("edbrSubdate2");
	}

	/**
	 * Get edbrSubdate3
	 */
	@Column(name = "EDBR_SUBDATE3")
	public Date getEdbrSubdate3() {
		return edbrSubdate3;
	}

	/**
	 * Set edbrSubdate3
	 */
	public void setEdbrSubdate3(Date edbrSubdate3) {
		this.edbrSubdate3 = edbrSubdate3;
		addValidField("edbrSubdate3");
	}

	/**
	 * Get edbrSubdate4
	 */
	@Column(name = "EDBR_SUBDATE4")
	public Date getEdbrSubdate4() {
		return edbrSubdate4;
	}

	/**
	 * Set edbrSubdate4
	 */
	public void setEdbrSubdate4(Date edbrSubdate4) {
		this.edbrSubdate4 = edbrSubdate4;
		addValidField("edbrSubdate4");
	}

	/**
	 * Get edbrSubnum1
	 */
	@Column(name = "EDBR_SUBNUM1")
	public Long getEdbrSubnum1() {
		return edbrSubnum1;
	}

	/**
	 * Set edbrSubnum1
	 */
	public void setEdbrSubnum1(Long edbrSubnum1) {
		this.edbrSubnum1 = edbrSubnum1;
		addValidField("edbrSubnum1");
	}

	/**
	 * Get edbrSubnum2
	 */
	@Column(name = "EDBR_SUBNUM2")
	public Long getEdbrSubnum2() {
		return edbrSubnum2;
	}

	/**
	 * Set edbrSubnum2
	 */
	public void setEdbrSubnum2(Long edbrSubnum2) {
		this.edbrSubnum2 = edbrSubnum2;
		addValidField("edbrSubnum2");
	}

	/**
	 * Get edbrSubnum3
	 */
	@Column(name = "EDBR_SUBNUM3")
	public Long getEdbrSubnum3() {
		return edbrSubnum3;
	}

	/**
	 * Set edbrSubnum3
	 */
	public void setEdbrSubnum3(Long edbrSubnum3) {
		this.edbrSubnum3 = edbrSubnum3;
		addValidField("edbrSubnum3");
	}

	/**
	 * Get edbrSubnum4
	 */
	@Column(name = "EDBR_SUBNUM4")
	public Long getEdbrSubnum4() {
		return edbrSubnum4;
	}

	/**
	 * Set edbrSubnum4
	 */
	public void setEdbrSubnum4(Long edbrSubnum4) {
		this.edbrSubnum4 = edbrSubnum4;
		addValidField("edbrSubnum4");
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
