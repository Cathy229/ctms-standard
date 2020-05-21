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
 * Model class for EoEoib2Eoim
 */
@Entity
@Table(name = "EO_EOIB_2_EOIM")
public class EoEoib2EoimModel extends BaseModel implements OperationLog {

	//eoeiId
	private Long eoeiId;
	//eoeiEoibId
	private Long eoeiEoibId;
	//eoeiEoimId
	private Long eoeiEoimId;
	//eoeiContainerNo
	private String eoeiContainerNo;
	//eoeiQuantity
	private Long eoeiQuantity;
	//eoeiMeasurement
	private Double eoeiMeasurement;
	//eoeiNetWeight
	private Double eoeiNetWeight;
	//eoeiGrossWeight
	private Double eoeiGrossWeight;
	//eoeiMemo
	private String eoeiMemo;
	//eoeiRemark
	private String eoeiRemark;
	//eoeiSubstr1
	private String eoeiSubstr1;
	//eoeiSubstr2
	private String eoeiSubstr2;
	//eoeiSubstr3
	private String eoeiSubstr3;
	//eoeiSubstr4
	private String eoeiSubstr4;
	//eoeiSubdate1
	private Date eoeiSubdate1;
	//eoeiSubdate2
	private Date eoeiSubdate2;
	//eoeiSubnum1
	private Long eoeiSubnum1;
	//eoeiSubnum2
	private Long eoeiSubnum2;
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
	 * Get eoeiId
	 */
	@Column(name = "EOEI_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoeiId() {
		return eoeiId;
	}

	/**
	 * Set eoeiId
	 */
	public void setEoeiId(Long eoeiId) {
		this.eoeiId = eoeiId;
		addValidField("eoeiId");
	}

	/**
	 * Get eoeiEoibId
	 */
	@Column(name = "EOEI_EOIB_ID")
	public Long getEoeiEoibId() {
		return eoeiEoibId;
	}

	/**
	 * Set eoeiEoibId
	 */
	public void setEoeiEoibId(Long eoeiEoibId) {
		this.eoeiEoibId = eoeiEoibId;
		addValidField("eoeiEoibId");
	}

	/**
	 * Get eoeiEoimId
	 */
	@Column(name = "EOEI_EOIM_ID")
	public Long getEoeiEoimId() {
		return eoeiEoimId;
	}

	/**
	 * Set eoeiEoimId
	 */
	public void setEoeiEoimId(Long eoeiEoimId) {
		this.eoeiEoimId = eoeiEoimId;
		addValidField("eoeiEoimId");
	}

	/**
	 * Get eoeiContainerNo
	 */
	@Column(name = "EOEI_CONTAINER_NO")
	public String getEoeiContainerNo() {
		return eoeiContainerNo;
	}

	/**
	 * Set eoeiContainerNo
	 */
	public void setEoeiContainerNo(String eoeiContainerNo) {
		this.eoeiContainerNo = eoeiContainerNo;
		addValidField("eoeiContainerNo");
	}

	/**
	 * Get eoeiQuantity
	 */
	@Column(name = "EOEI_QUANTITY")
	public Long getEoeiQuantity() {
		return eoeiQuantity;
	}

	/**
	 * Set eoeiQuantity
	 */
	public void setEoeiQuantity(Long eoeiQuantity) {
		this.eoeiQuantity = eoeiQuantity;
		addValidField("eoeiQuantity");
	}

	/**
	 * Get eoeiMeasurement
	 */
	@Column(name = "EOEI_MEASUREMENT")
	public Double getEoeiMeasurement() {
		return eoeiMeasurement;
	}

	/**
	 * Set eoeiMeasurement
	 */
	public void setEoeiMeasurement(Double eoeiMeasurement) {
		this.eoeiMeasurement = eoeiMeasurement;
		addValidField("eoeiMeasurement");
	}

	/**
	 * Get eoeiNetWeight
	 */
	@Column(name = "EOEI_NET_WEIGHT")
	public Double getEoeiNetWeight() {
		return eoeiNetWeight;
	}

	/**
	 * Set eoeiNetWeight
	 */
	public void setEoeiNetWeight(Double eoeiNetWeight) {
		this.eoeiNetWeight = eoeiNetWeight;
		addValidField("eoeiNetWeight");
	}

	/**
	 * Get eoeiGrossWeight
	 */
	@Column(name = "EOEI_GROSS_WEIGHT")
	public Double getEoeiGrossWeight() {
		return eoeiGrossWeight;
	}

	/**
	 * Set eoeiGrossWeight
	 */
	public void setEoeiGrossWeight(Double eoeiGrossWeight) {
		this.eoeiGrossWeight = eoeiGrossWeight;
		addValidField("eoeiGrossWeight");
	}

	/**
	 * Get eoeiMemo
	 */
	@Column(name = "EOEI_MEMO")
	public String getEoeiMemo() {
		return eoeiMemo;
	}

	/**
	 * Set eoeiMemo
	 */
	public void setEoeiMemo(String eoeiMemo) {
		this.eoeiMemo = eoeiMemo;
		addValidField("eoeiMemo");
	}

	/**
	 * Get eoeiRemark
	 */
	@Column(name = "EOEI_REMARK")
	public String getEoeiRemark() {
		return eoeiRemark;
	}

	/**
	 * Set eoeiRemark
	 */
	public void setEoeiRemark(String eoeiRemark) {
		this.eoeiRemark = eoeiRemark;
		addValidField("eoeiRemark");
	}

	/**
	 * Get eoeiSubstr1
	 */
	@Column(name = "EOEI_SUBSTR1")
	public String getEoeiSubstr1() {
		return eoeiSubstr1;
	}

	/**
	 * Set eoeiSubstr1
	 */
	public void setEoeiSubstr1(String eoeiSubstr1) {
		this.eoeiSubstr1 = eoeiSubstr1;
		addValidField("eoeiSubstr1");
	}

	/**
	 * Get eoeiSubstr2
	 */
	@Column(name = "EOEI_SUBSTR2")
	public String getEoeiSubstr2() {
		return eoeiSubstr2;
	}

	/**
	 * Set eoeiSubstr2
	 */
	public void setEoeiSubstr2(String eoeiSubstr2) {
		this.eoeiSubstr2 = eoeiSubstr2;
		addValidField("eoeiSubstr2");
	}

	/**
	 * Get eoeiSubstr3
	 */
	@Column(name = "EOEI_SUBSTR3")
	public String getEoeiSubstr3() {
		return eoeiSubstr3;
	}

	/**
	 * Set eoeiSubstr3
	 */
	public void setEoeiSubstr3(String eoeiSubstr3) {
		this.eoeiSubstr3 = eoeiSubstr3;
		addValidField("eoeiSubstr3");
	}

	/**
	 * Get eoeiSubstr4
	 */
	@Column(name = "EOEI_SUBSTR4")
	public String getEoeiSubstr4() {
		return eoeiSubstr4;
	}

	/**
	 * Set eoeiSubstr4
	 */
	public void setEoeiSubstr4(String eoeiSubstr4) {
		this.eoeiSubstr4 = eoeiSubstr4;
		addValidField("eoeiSubstr4");
	}

	/**
	 * Get eoeiSubdate1
	 */
	@Column(name = "EOEI_SUBDATE1")
	public Date getEoeiSubdate1() {
		return eoeiSubdate1;
	}

	/**
	 * Set eoeiSubdate1
	 */
	public void setEoeiSubdate1(Date eoeiSubdate1) {
		this.eoeiSubdate1 = eoeiSubdate1;
		addValidField("eoeiSubdate1");
	}

	/**
	 * Get eoeiSubdate2
	 */
	@Column(name = "EOEI_SUBDATE2")
	public Date getEoeiSubdate2() {
		return eoeiSubdate2;
	}

	/**
	 * Set eoeiSubdate2
	 */
	public void setEoeiSubdate2(Date eoeiSubdate2) {
		this.eoeiSubdate2 = eoeiSubdate2;
		addValidField("eoeiSubdate2");
	}

	/**
	 * Get eoeiSubnum1
	 */
	@Column(name = "EOEI_SUBNUM1")
	public Long getEoeiSubnum1() {
		return eoeiSubnum1;
	}

	/**
	 * Set eoeiSubnum1
	 */
	public void setEoeiSubnum1(Long eoeiSubnum1) {
		this.eoeiSubnum1 = eoeiSubnum1;
		addValidField("eoeiSubnum1");
	}

	/**
	 * Get eoeiSubnum2
	 */
	@Column(name = "EOEI_SUBNUM2")
	public Long getEoeiSubnum2() {
		return eoeiSubnum2;
	}

	/**
	 * Set eoeiSubnum2
	 */
	public void setEoeiSubnum2(Long eoeiSubnum2) {
		this.eoeiSubnum2 = eoeiSubnum2;
		addValidField("eoeiSubnum2");
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
