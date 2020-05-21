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
 * Model class for EoEoes3Eome
 */
@Entity
@Table(name = "EO_EOES_3_EOME")
public class EoEoes3EomeModel extends BaseModel implements OperationLog {

	//eoeeId
	private Long eoeeId;
	//eoeeEoesId
	private Long eoeeEoesId;
	//eoeeEomeId
	private Long eoeeEomeId;
	//eoeeBatchNo
	private String eoeeBatchNo;
	//eoeeContainerNo
	private String eoeeContainerNo;
	//eoeeQuantity
	private Integer eoeeQuantity;
	//eoeeMeasurement
	private Double eoeeMeasurement;
	//eoeeNetWeight
	private Double eoeeNetWeight;
	//eoeeGrossWeight
	private Double eoeeGrossWeight;
	//eoeeMemo
	private String eoeeMemo;
	//eoeeRemark
	private String eoeeRemark;
	//eoeeSubstr1
	private String eoeeSubstr1;
	//eoeeSubstr2
	private String eoeeSubstr2;
	//eoeeSubstr3
	private String eoeeSubstr3;
	//eoeeSubstr4
	private String eoeeSubstr4;
	//eoeeSubdate1
	private Date eoeeSubdate1;
	//eoeeSubdate2
	private Date eoeeSubdate2;
	//eoeeSubnum1
	private Long eoeeSubnum1;
	//eoeeSubnum2
	private Long eoeeSubnum2;
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
	 * Get eoeeId
	 */
	@Column(name = "EOEE_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoeeId() {
		return eoeeId;
	}

	/**
	 * Set eoeeId
	 */
	public void setEoeeId(Long eoeeId) {
		this.eoeeId = eoeeId;
		addValidField("eoeeId");
	}

	/**
	 * Get eoeeEoesId
	 */
	@Column(name = "EOEE_EOES_ID")
	public Long getEoeeEoesId() {
		return eoeeEoesId;
	}

	/**
	 * Set eoeeEoesId
	 */
	public void setEoeeEoesId(Long eoeeEoesId) {
		this.eoeeEoesId = eoeeEoesId;
		addValidField("eoeeEoesId");
	}

	/**
	 * Get eoeeEomeId
	 */
	@Column(name = "EOEE_EOME_ID")
	public Long getEoeeEomeId() {
		return eoeeEomeId;
	}

	/**
	 * Set eoeeEomeId
	 */
	public void setEoeeEomeId(Long eoeeEomeId) {
		this.eoeeEomeId = eoeeEomeId;
		addValidField("eoeeEomeId");
	}

	/**
	 * Get eoeeBatchNo
	 */
	@Column(name = "EOEE_BATCH_NO")
	public String getEoeeBatchNo() {
		return eoeeBatchNo;
	}

	/**
	 * Set eoeeBatchNo
	 */
	public void setEoeeBatchNo(String eoeeBatchNo) {
		this.eoeeBatchNo = eoeeBatchNo;
		addValidField("eoeeBatchNo");
	}

	/**
	 * Get eoeeContainerNo
	 */
	@Column(name = "EOEE_CONTAINER_NO")
	public String getEoeeContainerNo() {
		return eoeeContainerNo;
	}

	/**
	 * Set eoeeContainerNo
	 */
	public void setEoeeContainerNo(String eoeeContainerNo) {
		this.eoeeContainerNo = eoeeContainerNo;
		addValidField("eoeeContainerNo");
	}

	/**
	 * Get eoeeQuantity
	 */
	@Column(name = "EOEE_QUANTITY")
	public Integer getEoeeQuantity() {
		return eoeeQuantity;
	}

	/**
	 * Set eoeeQuantity
	 */
	public void setEoeeQuantity(Integer eoeeQuantity) {
		this.eoeeQuantity = eoeeQuantity;
		addValidField("eoeeQuantity");
	}

	/**
	 * Get eoeeMeasurement
	 */
	@Column(name = "EOEE_MEASUREMENT")
	public Double getEoeeMeasurement() {
		return eoeeMeasurement;
	}

	/**
	 * Set eoeeMeasurement
	 */
	public void setEoeeMeasurement(Double eoeeMeasurement) {
		this.eoeeMeasurement = eoeeMeasurement;
		addValidField("eoeeMeasurement");
	}

	/**
	 * Get eoeeNetWeight
	 */
	@Column(name = "EOEE_NET_WEIGHT")
	public Double getEoeeNetWeight() {
		return eoeeNetWeight;
	}

	/**
	 * Set eoeeNetWeight
	 */
	public void setEoeeNetWeight(Double eoeeNetWeight) {
		this.eoeeNetWeight = eoeeNetWeight;
		addValidField("eoeeNetWeight");
	}

	/**
	 * Get eoeeGrossWeight
	 */
	@Column(name = "EOEE_GROSS_WEIGHT")
	public Double getEoeeGrossWeight() {
		return eoeeGrossWeight;
	}

	/**
	 * Set eoeeGrossWeight
	 */
	public void setEoeeGrossWeight(Double eoeeGrossWeight) {
		this.eoeeGrossWeight = eoeeGrossWeight;
		addValidField("eoeeGrossWeight");
	}

	/**
	 * Get eoeeMemo
	 */
	@Column(name = "EOEE_MEMO")
	public String getEoeeMemo() {
		return eoeeMemo;
	}

	/**
	 * Set eoeeMemo
	 */
	public void setEoeeMemo(String eoeeMemo) {
		this.eoeeMemo = eoeeMemo;
		addValidField("eoeeMemo");
	}

	/**
	 * Get eoeeRemark
	 */
	@Column(name = "EOEE_REMARK")
	public String getEoeeRemark() {
		return eoeeRemark;
	}

	/**
	 * Set eoeeRemark
	 */
	public void setEoeeRemark(String eoeeRemark) {
		this.eoeeRemark = eoeeRemark;
		addValidField("eoeeRemark");
	}

	/**
	 * Get eoeeSubstr1
	 */
	@Column(name = "EOEE_SUBSTR1")
	public String getEoeeSubstr1() {
		return eoeeSubstr1;
	}

	/**
	 * Set eoeeSubstr1
	 */
	public void setEoeeSubstr1(String eoeeSubstr1) {
		this.eoeeSubstr1 = eoeeSubstr1;
		addValidField("eoeeSubstr1");
	}

	/**
	 * Get eoeeSubstr2
	 */
	@Column(name = "EOEE_SUBSTR2")
	public String getEoeeSubstr2() {
		return eoeeSubstr2;
	}

	/**
	 * Set eoeeSubstr2
	 */
	public void setEoeeSubstr2(String eoeeSubstr2) {
		this.eoeeSubstr2 = eoeeSubstr2;
		addValidField("eoeeSubstr2");
	}

	/**
	 * Get eoeeSubstr3
	 */
	@Column(name = "EOEE_SUBSTR3")
	public String getEoeeSubstr3() {
		return eoeeSubstr3;
	}

	/**
	 * Set eoeeSubstr3
	 */
	public void setEoeeSubstr3(String eoeeSubstr3) {
		this.eoeeSubstr3 = eoeeSubstr3;
		addValidField("eoeeSubstr3");
	}

	/**
	 * Get eoeeSubstr4
	 */
	@Column(name = "EOEE_SUBSTR4")
	public String getEoeeSubstr4() {
		return eoeeSubstr4;
	}

	/**
	 * Set eoeeSubstr4
	 */
	public void setEoeeSubstr4(String eoeeSubstr4) {
		this.eoeeSubstr4 = eoeeSubstr4;
		addValidField("eoeeSubstr4");
	}

	/**
	 * Get eoeeSubdate1
	 */
	@Column(name = "EOEE_SUBDATE1")
	public Date getEoeeSubdate1() {
		return eoeeSubdate1;
	}

	/**
	 * Set eoeeSubdate1
	 */
	public void setEoeeSubdate1(Date eoeeSubdate1) {
		this.eoeeSubdate1 = eoeeSubdate1;
		addValidField("eoeeSubdate1");
	}

	/**
	 * Get eoeeSubdate2
	 */
	@Column(name = "EOEE_SUBDATE2")
	public Date getEoeeSubdate2() {
		return eoeeSubdate2;
	}

	/**
	 * Set eoeeSubdate2
	 */
	public void setEoeeSubdate2(Date eoeeSubdate2) {
		this.eoeeSubdate2 = eoeeSubdate2;
		addValidField("eoeeSubdate2");
	}

	/**
	 * Get eoeeSubnum1
	 */
	@Column(name = "EOEE_SUBNUM1")
	public Long getEoeeSubnum1() {
		return eoeeSubnum1;
	}

	/**
	 * Set eoeeSubnum1
	 */
	public void setEoeeSubnum1(Long eoeeSubnum1) {
		this.eoeeSubnum1 = eoeeSubnum1;
		addValidField("eoeeSubnum1");
	}

	/**
	 * Get eoeeSubnum2
	 */
	@Column(name = "EOEE_SUBNUM2")
	public Long getEoeeSubnum2() {
		return eoeeSubnum2;
	}

	/**
	 * Set eoeeSubnum2
	 */
	public void setEoeeSubnum2(Long eoeeSubnum2) {
		this.eoeeSubnum2 = eoeeSubnum2;
		addValidField("eoeeSubnum2");
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
