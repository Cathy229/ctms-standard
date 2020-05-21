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
 * Model class for EdiBookingCtnFeedback
 */
@Entity
@Table(name = "EDI_BOOKING_CTN_FEEDBACK")
public class EdiBookingCtnFeedbackModel extends BaseModel implements OperationLog {

	//edbnId
	private Long edbnId;
	//edbbId
	private Long edbbId;
	//edbnEdbbId
	private Long edbnEdbbId;
	//edbnContainerNo
	private String edbnContainerNo;
	//edbnCntCustomized
	private String edbnCntCustomized;
	//edbnCntCustomizedSize
	private String edbnCntCustomizedSize;
	//edbnSealNo
	private String edbnSealNo;
	//edbnSealKind
	private String edbnSealKind;
	//edbnSealAgencyCode
	private String edbnSealAgencyCode;
	//edbnSealAgencyName
	private String edbnSealAgencyName;
	//edbnCtnStatus
	private String edbnCtnStatus;
	//edbnCtnPackageNumber
	private Integer edbnCtnPackageNumber;
	//edbnCargoNetWeight
	private Double edbnCargoNetWeight;
	//edbnTareWeight
	private Double edbnTareWeight;
	//edbnCargoMeasurement
	private Double edbnCargoMeasurement;
	//edbnCntSupplierType
	private Integer edbnCntSupplierType;
	//edbnSubstr1
	private String edbnSubstr1;
	//edbnSubstr2
	private String edbnSubstr2;
	//edbnSubstr3
	private String edbnSubstr3;
	//edbnSubstr4
	private String edbnSubstr4;
	//edbnSubstr5
	private String edbnSubstr5;
	//edbnSubstr6
	private String edbnSubstr6;
	//edbnSubstr7
	private String edbnSubstr7;
	//edbnSubstr8
	private String edbnSubstr8;
	//edbnSubdate1
	private Date edbnSubdate1;
	//edbnSubdate2
	private Date edbnSubdate2;
	//edbnSubdate3
	private Date edbnSubdate3;
	//edbnSubdate4
	private Date edbnSubdate4;
	//edbnSubnum1
	private Long edbnSubnum1;
	//edbnSubnum2
	private Long edbnSubnum2;
	//edbnSubnum3
	private Long edbnSubnum3;
	//edbnSubnum4
	private Long edbnSubnum4;
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
	 * Get edbnId
	 */
	@Column(name = "EDBN_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEdbnId() {
		return edbnId;
	}

	/**
	 * Set edbnId
	 */
	public void setEdbnId(Long edbnId) {
		this.edbnId = edbnId;
		addValidField("edbnId");
	}

	/**
	 * Get edbbId
	 */
	@Column(name = "EDBB_ID")
	public Long getEdbbId() {
		return edbbId;
	}

	/**
	 * Set edbbId
	 */
	public void setEdbbId(Long edbbId) {
		this.edbbId = edbbId;
		addValidField("edbbId");
	}

	/**
	 * Get edbnEdbbId
	 */
	@Column(name = "EDBN_EDBB_ID")
	public Long getEdbnEdbbId() {
		return edbnEdbbId;
	}

	/**
	 * Set edbnEdbbId
	 */
	public void setEdbnEdbbId(Long edbnEdbbId) {
		this.edbnEdbbId = edbnEdbbId;
		addValidField("edbnEdbbId");
	}

	/**
	 * Get edbnContainerNo
	 */
	@Column(name = "EDBN_CONTAINER_NO")
	public String getEdbnContainerNo() {
		return edbnContainerNo;
	}

	/**
	 * Set edbnContainerNo
	 */
	public void setEdbnContainerNo(String edbnContainerNo) {
		this.edbnContainerNo = edbnContainerNo;
		addValidField("edbnContainerNo");
	}

	/**
	 * Get edbnCntCustomized
	 */
	@Column(name = "EDBN_CNT_CUSTOMIZED")
	public String getEdbnCntCustomized() {
		return edbnCntCustomized;
	}

	/**
	 * Set edbnCntCustomized
	 */
	public void setEdbnCntCustomized(String edbnCntCustomized) {
		this.edbnCntCustomized = edbnCntCustomized;
		addValidField("edbnCntCustomized");
	}

	/**
	 * Get edbnCntCustomizedSize
	 */
	@Column(name = "EDBN_CNT_CUSTOMIZED_SIZE")
	public String getEdbnCntCustomizedSize() {
		return edbnCntCustomizedSize;
	}

	/**
	 * Set edbnCntCustomizedSize
	 */
	public void setEdbnCntCustomizedSize(String edbnCntCustomizedSize) {
		this.edbnCntCustomizedSize = edbnCntCustomizedSize;
		addValidField("edbnCntCustomizedSize");
	}

	/**
	 * Get edbnSealNo
	 */
	@Column(name = "EDBN_SEAL_NO")
	public String getEdbnSealNo() {
		return edbnSealNo;
	}

	/**
	 * Set edbnSealNo
	 */
	public void setEdbnSealNo(String edbnSealNo) {
		this.edbnSealNo = edbnSealNo;
		addValidField("edbnSealNo");
	}

	/**
	 * Get edbnSealKind
	 */
	@Column(name = "EDBN_SEAL_KIND")
	public String getEdbnSealKind() {
		return edbnSealKind;
	}

	/**
	 * Set edbnSealKind
	 */
	public void setEdbnSealKind(String edbnSealKind) {
		this.edbnSealKind = edbnSealKind;
		addValidField("edbnSealKind");
	}

	/**
	 * Get edbnSealAgencyCode
	 */
	@Column(name = "EDBN_SEAL_AGENCY_CODE")
	public String getEdbnSealAgencyCode() {
		return edbnSealAgencyCode;
	}

	/**
	 * Set edbnSealAgencyCode
	 */
	public void setEdbnSealAgencyCode(String edbnSealAgencyCode) {
		this.edbnSealAgencyCode = edbnSealAgencyCode;
		addValidField("edbnSealAgencyCode");
	}

	/**
	 * Get edbnSealAgencyName
	 */
	@Column(name = "EDBN_SEAL_AGENCY_NAME")
	public String getEdbnSealAgencyName() {
		return edbnSealAgencyName;
	}

	/**
	 * Set edbnSealAgencyName
	 */
	public void setEdbnSealAgencyName(String edbnSealAgencyName) {
		this.edbnSealAgencyName = edbnSealAgencyName;
		addValidField("edbnSealAgencyName");
	}

	/**
	 * Get edbnCtnStatus
	 */
	@Column(name = "EDBN_CTN_STATUS")
	public String getEdbnCtnStatus() {
		return edbnCtnStatus;
	}

	/**
	 * Set edbnCtnStatus
	 */
	public void setEdbnCtnStatus(String edbnCtnStatus) {
		this.edbnCtnStatus = edbnCtnStatus;
		addValidField("edbnCtnStatus");
	}

	/**
	 * Get edbnCtnPackageNumber
	 */
	@Column(name = "EDBN_CTN_PACKAGE_NUMBER")
	public Integer getEdbnCtnPackageNumber() {
		return edbnCtnPackageNumber;
	}

	/**
	 * Set edbnCtnPackageNumber
	 */
	public void setEdbnCtnPackageNumber(Integer edbnCtnPackageNumber) {
		this.edbnCtnPackageNumber = edbnCtnPackageNumber;
		addValidField("edbnCtnPackageNumber");
	}

	/**
	 * Get edbnCargoNetWeight
	 */
	@Column(name = "EDBN_CARGO_NET_WEIGHT")
	public Double getEdbnCargoNetWeight() {
		return edbnCargoNetWeight;
	}

	/**
	 * Set edbnCargoNetWeight
	 */
	public void setEdbnCargoNetWeight(Double edbnCargoNetWeight) {
		this.edbnCargoNetWeight = edbnCargoNetWeight;
		addValidField("edbnCargoNetWeight");
	}

	/**
	 * Get edbnTareWeight
	 */
	@Column(name = "EDBN_TARE_WEIGHT")
	public Double getEdbnTareWeight() {
		return edbnTareWeight;
	}

	/**
	 * Set edbnTareWeight
	 */
	public void setEdbnTareWeight(Double edbnTareWeight) {
		this.edbnTareWeight = edbnTareWeight;
		addValidField("edbnTareWeight");
	}

	/**
	 * Get edbnCargoMeasurement
	 */
	@Column(name = "EDBN_CARGO_MEASUREMENT")
	public Double getEdbnCargoMeasurement() {
		return edbnCargoMeasurement;
	}

	/**
	 * Set edbnCargoMeasurement
	 */
	public void setEdbnCargoMeasurement(Double edbnCargoMeasurement) {
		this.edbnCargoMeasurement = edbnCargoMeasurement;
		addValidField("edbnCargoMeasurement");
	}

	/**
	 * Get edbnCntSupplierType
	 */
	@Column(name = "EDBN_CNT_SUPPLIER_TYPE")
	public Integer getEdbnCntSupplierType() {
		return edbnCntSupplierType;
	}

	/**
	 * Set edbnCntSupplierType
	 */
	public void setEdbnCntSupplierType(Integer edbnCntSupplierType) {
		this.edbnCntSupplierType = edbnCntSupplierType;
		addValidField("edbnCntSupplierType");
	}

	/**
	 * Get edbnSubstr1
	 */
	@Column(name = "EDBN_SUBSTR1")
	public String getEdbnSubstr1() {
		return edbnSubstr1;
	}

	/**
	 * Set edbnSubstr1
	 */
	public void setEdbnSubstr1(String edbnSubstr1) {
		this.edbnSubstr1 = edbnSubstr1;
		addValidField("edbnSubstr1");
	}

	/**
	 * Get edbnSubstr2
	 */
	@Column(name = "EDBN_SUBSTR2")
	public String getEdbnSubstr2() {
		return edbnSubstr2;
	}

	/**
	 * Set edbnSubstr2
	 */
	public void setEdbnSubstr2(String edbnSubstr2) {
		this.edbnSubstr2 = edbnSubstr2;
		addValidField("edbnSubstr2");
	}

	/**
	 * Get edbnSubstr3
	 */
	@Column(name = "EDBN_SUBSTR3")
	public String getEdbnSubstr3() {
		return edbnSubstr3;
	}

	/**
	 * Set edbnSubstr3
	 */
	public void setEdbnSubstr3(String edbnSubstr3) {
		this.edbnSubstr3 = edbnSubstr3;
		addValidField("edbnSubstr3");
	}

	/**
	 * Get edbnSubstr4
	 */
	@Column(name = "EDBN_SUBSTR4")
	public String getEdbnSubstr4() {
		return edbnSubstr4;
	}

	/**
	 * Set edbnSubstr4
	 */
	public void setEdbnSubstr4(String edbnSubstr4) {
		this.edbnSubstr4 = edbnSubstr4;
		addValidField("edbnSubstr4");
	}

	/**
	 * Get edbnSubstr5
	 */
	@Column(name = "EDBN_SUBSTR5")
	public String getEdbnSubstr5() {
		return edbnSubstr5;
	}

	/**
	 * Set edbnSubstr5
	 */
	public void setEdbnSubstr5(String edbnSubstr5) {
		this.edbnSubstr5 = edbnSubstr5;
		addValidField("edbnSubstr5");
	}

	/**
	 * Get edbnSubstr6
	 */
	@Column(name = "EDBN_SUBSTR6")
	public String getEdbnSubstr6() {
		return edbnSubstr6;
	}

	/**
	 * Set edbnSubstr6
	 */
	public void setEdbnSubstr6(String edbnSubstr6) {
		this.edbnSubstr6 = edbnSubstr6;
		addValidField("edbnSubstr6");
	}

	/**
	 * Get edbnSubstr7
	 */
	@Column(name = "EDBN_SUBSTR7")
	public String getEdbnSubstr7() {
		return edbnSubstr7;
	}

	/**
	 * Set edbnSubstr7
	 */
	public void setEdbnSubstr7(String edbnSubstr7) {
		this.edbnSubstr7 = edbnSubstr7;
		addValidField("edbnSubstr7");
	}

	/**
	 * Get edbnSubstr8
	 */
	@Column(name = "EDBN_SUBSTR8")
	public String getEdbnSubstr8() {
		return edbnSubstr8;
	}

	/**
	 * Set edbnSubstr8
	 */
	public void setEdbnSubstr8(String edbnSubstr8) {
		this.edbnSubstr8 = edbnSubstr8;
		addValidField("edbnSubstr8");
	}

	/**
	 * Get edbnSubdate1
	 */
	@Column(name = "EDBN_SUBDATE1")
	public Date getEdbnSubdate1() {
		return edbnSubdate1;
	}

	/**
	 * Set edbnSubdate1
	 */
	public void setEdbnSubdate1(Date edbnSubdate1) {
		this.edbnSubdate1 = edbnSubdate1;
		addValidField("edbnSubdate1");
	}

	/**
	 * Get edbnSubdate2
	 */
	@Column(name = "EDBN_SUBDATE2")
	public Date getEdbnSubdate2() {
		return edbnSubdate2;
	}

	/**
	 * Set edbnSubdate2
	 */
	public void setEdbnSubdate2(Date edbnSubdate2) {
		this.edbnSubdate2 = edbnSubdate2;
		addValidField("edbnSubdate2");
	}

	/**
	 * Get edbnSubdate3
	 */
	@Column(name = "EDBN_SUBDATE3")
	public Date getEdbnSubdate3() {
		return edbnSubdate3;
	}

	/**
	 * Set edbnSubdate3
	 */
	public void setEdbnSubdate3(Date edbnSubdate3) {
		this.edbnSubdate3 = edbnSubdate3;
		addValidField("edbnSubdate3");
	}

	/**
	 * Get edbnSubdate4
	 */
	@Column(name = "EDBN_SUBDATE4")
	public Date getEdbnSubdate4() {
		return edbnSubdate4;
	}

	/**
	 * Set edbnSubdate4
	 */
	public void setEdbnSubdate4(Date edbnSubdate4) {
		this.edbnSubdate4 = edbnSubdate4;
		addValidField("edbnSubdate4");
	}

	/**
	 * Get edbnSubnum1
	 */
	@Column(name = "EDBN_SUBNUM1")
	public Long getEdbnSubnum1() {
		return edbnSubnum1;
	}

	/**
	 * Set edbnSubnum1
	 */
	public void setEdbnSubnum1(Long edbnSubnum1) {
		this.edbnSubnum1 = edbnSubnum1;
		addValidField("edbnSubnum1");
	}

	/**
	 * Get edbnSubnum2
	 */
	@Column(name = "EDBN_SUBNUM2")
	public Long getEdbnSubnum2() {
		return edbnSubnum2;
	}

	/**
	 * Set edbnSubnum2
	 */
	public void setEdbnSubnum2(Long edbnSubnum2) {
		this.edbnSubnum2 = edbnSubnum2;
		addValidField("edbnSubnum2");
	}

	/**
	 * Get edbnSubnum3
	 */
	@Column(name = "EDBN_SUBNUM3")
	public Long getEdbnSubnum3() {
		return edbnSubnum3;
	}

	/**
	 * Set edbnSubnum3
	 */
	public void setEdbnSubnum3(Long edbnSubnum3) {
		this.edbnSubnum3 = edbnSubnum3;
		addValidField("edbnSubnum3");
	}

	/**
	 * Get edbnSubnum4
	 */
	@Column(name = "EDBN_SUBNUM4")
	public Long getEdbnSubnum4() {
		return edbnSubnum4;
	}

	/**
	 * Set edbnSubnum4
	 */
	public void setEdbnSubnum4(Long edbnSubnum4) {
		this.edbnSubnum4 = edbnSubnum4;
		addValidField("edbnSubnum4");
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
