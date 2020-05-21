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
 * Model class for EoEoob2Eomj
 */
@Entity
@Table(name = "EO_EOOB_2_EOMJ")
public class EoEoob2EomjModel extends BaseModel implements OperationLog {

	//eoejId
	private Long eoejId;
	//eoejEoobId
	private Long eoejEoobId;
	//eoejEomjId
	private Long eoejEomjId;
	//eoejContainerNo
	private String eoejContainerNo;
	//eoejQuantity
	private Integer eoejQuantity;
	//eoejMeasurement
	private Double eoejMeasurement;
	//eoejNetWeight
	private Double eoejNetWeight;
	//eoejGrossWeight
	private Double eoejGrossWeight;
	//eoejMemo
	private String eoejMemo;
	//eoejRemark
	private String eoejRemark;
	//eoejSubstr1
	private String eoejSubstr1;
	//eoejSubstr2
	private String eoejSubstr2;
	//eoejSubstr3
	private String eoejSubstr3;
	//eoejSubstr4
	private String eoejSubstr4;
	//eoejSubdate1
	private Date eoejSubdate1;
	//eoejSubdate2
	private Date eoejSubdate2;
	//eoejSubnum1
	private Long eoejSubnum1;
	//eoejSubnum2
	private Long eoejSubnum2;
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
	 * Get eoejId
	 */
	@Column(name = "EOEJ_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoejId() {
		return eoejId;
	}

	/**
	 * Set eoejId
	 */
	public void setEoejId(Long eoejId) {
		this.eoejId = eoejId;
		addValidField("eoejId");
	}

	/**
	 * Get eoejEoobId
	 */
	@Column(name = "EOEJ_EOOB_ID")
	public Long getEoejEoobId() {
		return eoejEoobId;
	}

	/**
	 * Set eoejEoobId
	 */
	public void setEoejEoobId(Long eoejEoobId) {
		this.eoejEoobId = eoejEoobId;
		addValidField("eoejEoobId");
	}

	/**
	 * Get eoejEomjId
	 */
	@Column(name = "EOEJ_EOMJ_ID")
	public Long getEoejEomjId() {
		return eoejEomjId;
	}

	/**
	 * Set eoejEomjId
	 */
	public void setEoejEomjId(Long eoejEomjId) {
		this.eoejEomjId = eoejEomjId;
		addValidField("eoejEomjId");
	}

	/**
	 * Get eoejContainerNo
	 */
	@Column(name = "EOEJ_CONTAINER_NO")
	public String getEoejContainerNo() {
		return eoejContainerNo;
	}

	/**
	 * Set eoejContainerNo
	 */
	public void setEoejContainerNo(String eoejContainerNo) {
		this.eoejContainerNo = eoejContainerNo;
		addValidField("eoejContainerNo");
	}

	/**
	 * Get eoejQuantity
	 */
	@Column(name = "EOEJ_QUANTITY")
	public Integer getEoejQuantity() {
		return eoejQuantity;
	}

	/**
	 * Set eoejQuantity
	 */
	public void setEoejQuantity(Integer eoejQuantity) {
		this.eoejQuantity = eoejQuantity;
		addValidField("eoejQuantity");
	}

	/**
	 * Get eoejMeasurement
	 */
	@Column(name = "EOEJ_MEASUREMENT")
	public Double getEoejMeasurement() {
		return eoejMeasurement;
	}

	/**
	 * Set eoejMeasurement
	 */
	public void setEoejMeasurement(Double eoejMeasurement) {
		this.eoejMeasurement = eoejMeasurement;
		addValidField("eoejMeasurement");
	}

	/**
	 * Get eoejNetWeight
	 */
	@Column(name = "EOEJ_NET_WEIGHT")
	public Double getEoejNetWeight() {
		return eoejNetWeight;
	}

	/**
	 * Set eoejNetWeight
	 */
	public void setEoejNetWeight(Double eoejNetWeight) {
		this.eoejNetWeight = eoejNetWeight;
		addValidField("eoejNetWeight");
	}

	/**
	 * Get eoejGrossWeight
	 */
	@Column(name = "EOEJ_GROSS_WEIGHT")
	public Double getEoejGrossWeight() {
		return eoejGrossWeight;
	}

	/**
	 * Set eoejGrossWeight
	 */
	public void setEoejGrossWeight(Double eoejGrossWeight) {
		this.eoejGrossWeight = eoejGrossWeight;
		addValidField("eoejGrossWeight");
	}

	/**
	 * Get eoejMemo
	 */
	@Column(name = "EOEJ_MEMO")
	public String getEoejMemo() {
		return eoejMemo;
	}

	/**
	 * Set eoejMemo
	 */
	public void setEoejMemo(String eoejMemo) {
		this.eoejMemo = eoejMemo;
		addValidField("eoejMemo");
	}

	/**
	 * Get eoejRemark
	 */
	@Column(name = "EOEJ_REMARK")
	public String getEoejRemark() {
		return eoejRemark;
	}

	/**
	 * Set eoejRemark
	 */
	public void setEoejRemark(String eoejRemark) {
		this.eoejRemark = eoejRemark;
		addValidField("eoejRemark");
	}

	/**
	 * Get eoejSubstr1
	 */
	@Column(name = "EOEJ_SUBSTR1")
	public String getEoejSubstr1() {
		return eoejSubstr1;
	}

	/**
	 * Set eoejSubstr1
	 */
	public void setEoejSubstr1(String eoejSubstr1) {
		this.eoejSubstr1 = eoejSubstr1;
		addValidField("eoejSubstr1");
	}

	/**
	 * Get eoejSubstr2
	 */
	@Column(name = "EOEJ_SUBSTR2")
	public String getEoejSubstr2() {
		return eoejSubstr2;
	}

	/**
	 * Set eoejSubstr2
	 */
	public void setEoejSubstr2(String eoejSubstr2) {
		this.eoejSubstr2 = eoejSubstr2;
		addValidField("eoejSubstr2");
	}

	/**
	 * Get eoejSubstr3
	 */
	@Column(name = "EOEJ_SUBSTR3")
	public String getEoejSubstr3() {
		return eoejSubstr3;
	}

	/**
	 * Set eoejSubstr3
	 */
	public void setEoejSubstr3(String eoejSubstr3) {
		this.eoejSubstr3 = eoejSubstr3;
		addValidField("eoejSubstr3");
	}

	/**
	 * Get eoejSubstr4
	 */
	@Column(name = "EOEJ_SUBSTR4")
	public String getEoejSubstr4() {
		return eoejSubstr4;
	}

	/**
	 * Set eoejSubstr4
	 */
	public void setEoejSubstr4(String eoejSubstr4) {
		this.eoejSubstr4 = eoejSubstr4;
		addValidField("eoejSubstr4");
	}

	/**
	 * Get eoejSubdate1
	 */
	@Column(name = "EOEJ_SUBDATE1")
	public Date getEoejSubdate1() {
		return eoejSubdate1;
	}

	/**
	 * Set eoejSubdate1
	 */
	public void setEoejSubdate1(Date eoejSubdate1) {
		this.eoejSubdate1 = eoejSubdate1;
		addValidField("eoejSubdate1");
	}

	/**
	 * Get eoejSubdate2
	 */
	@Column(name = "EOEJ_SUBDATE2")
	public Date getEoejSubdate2() {
		return eoejSubdate2;
	}

	/**
	 * Set eoejSubdate2
	 */
	public void setEoejSubdate2(Date eoejSubdate2) {
		this.eoejSubdate2 = eoejSubdate2;
		addValidField("eoejSubdate2");
	}

	/**
	 * Get eoejSubnum1
	 */
	@Column(name = "EOEJ_SUBNUM1")
	public Long getEoejSubnum1() {
		return eoejSubnum1;
	}

	/**
	 * Set eoejSubnum1
	 */
	public void setEoejSubnum1(Long eoejSubnum1) {
		this.eoejSubnum1 = eoejSubnum1;
		addValidField("eoejSubnum1");
	}

	/**
	 * Get eoejSubnum2
	 */
	@Column(name = "EOEJ_SUBNUM2")
	public Long getEoejSubnum2() {
		return eoejSubnum2;
	}

	/**
	 * Set eoejSubnum2
	 */
	public void setEoejSubnum2(Long eoejSubnum2) {
		this.eoejSubnum2 = eoejSubnum2;
		addValidField("eoejSubnum2");
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
