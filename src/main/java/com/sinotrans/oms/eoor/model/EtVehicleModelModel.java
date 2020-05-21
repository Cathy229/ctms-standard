package com.sinotrans.oms.eoor.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;

import com.sinotrans.framework.orm.model.BaseModel;
import com.sinotrans.framework.orm.model.OperationLog;

/**
 * Model class for EtVehicleModel
 */
@Entity
@Table(name = "ET_VEHICLE_MODEL")
public class EtVehicleModelModel extends BaseModel implements OperationLog {

	//etvmId
	private Integer etvmId;
	//etvmCode
	private String etvmCode;
	//etvmDescription
	private String etvmDescription;
	//etvmType
	private String etvmType;
	//etvmRestrictiongRoup
	private String etvmRestrictiongRoup;
	//etvmIn
	private String etvmIn;
	//etvmOut
	private String etvmOut;
	//etvmExclusion
	private String etvmExclusion;
	//etvmMaxloadweight
	private Double etvmMaxloadweight;
	//etvmMaxloadvolume
	private Double etvmMaxloadvolume;
	//etvmMaxstops
	private Integer etvmMaxstops;
	//etvmFixedcost
	private String etvmFixedcost;
	//etvmDistancecost
	private String etvmDistancecost;
	//recVer
	private Integer recVer;
	//creator
	private String creator;
	//createTime
	private Date createTime;
	//modifier
	private String modifier;
	//modifyTime
	private Date modifyTime;

	/**
	 * Get etvmId
	 */
	@Column(name = "ETVM_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getEtvmId() {
		return etvmId;
	}

	/**
	 * Set etvmId
	 */
	public void setEtvmId(Integer etvmId) {
		this.etvmId = etvmId;
		addValidField("etvmId");
	}

	/**
	 * Get etvmCode
	 */
	@Column(name = "ETVM_CODE")
	public String getEtvmCode() {
		return etvmCode;
	}

	/**
	 * Set etvmCode
	 */
	public void setEtvmCode(String etvmCode) {
		this.etvmCode = etvmCode;
		addValidField("etvmCode");
	}

	/**
	 * Get etvmDescription
	 */
	@Column(name = "ETVM_DESCRIPTION")
	public String getEtvmDescription() {
		return etvmDescription;
	}

	/**
	 * Set etvmDescription
	 */
	public void setEtvmDescription(String etvmDescription) {
		this.etvmDescription = etvmDescription;
		addValidField("etvmDescription");
	}

	/**
	 * Get etvmType
	 */
	@Column(name = "ETVM_TYPE")
	public String getEtvmType() {
		return etvmType;
	}

	/**
	 * Set etvmType
	 */
	public void setEtvmType(String etvmType) {
		this.etvmType = etvmType;
		addValidField("etvmType");
	}

	/**
	 * Get etvmRestrictiongRoup
	 */
	@Column(name = "ETVM_RESTRICTIONG_ROUP")
	public String getEtvmRestrictiongRoup() {
		return etvmRestrictiongRoup;
	}

	/**
	 * Set etvmRestrictiongRoup
	 */
	public void setEtvmRestrictiongRoup(String etvmRestrictiongRoup) {
		this.etvmRestrictiongRoup = etvmRestrictiongRoup;
		addValidField("etvmRestrictiongRoup");
	}

	/**
	 * Get etvmIn
	 */
	@Column(name = "ETVM_IN")
	public String getEtvmIn() {
		return etvmIn;
	}

	/**
	 * Set etvmIn
	 */
	public void setEtvmIn(String etvmIn) {
		this.etvmIn = etvmIn;
		addValidField("etvmIn");
	}

	/**
	 * Get etvmOut
	 */
	@Column(name = "ETVM_OUT")
	public String getEtvmOut() {
		return etvmOut;
	}

	/**
	 * Set etvmOut
	 */
	public void setEtvmOut(String etvmOut) {
		this.etvmOut = etvmOut;
		addValidField("etvmOut");
	}

	/**
	 * Get etvmExclusion
	 */
	@Column(name = "ETVM_EXCLUSION")
	public String getEtvmExclusion() {
		return etvmExclusion;
	}

	/**
	 * Set etvmExclusion
	 */
	public void setEtvmExclusion(String etvmExclusion) {
		this.etvmExclusion = etvmExclusion;
		addValidField("etvmExclusion");
	}

	/**
	 * Get etvmMaxloadweight
	 */
	@Column(name = "ETVM_MAXLOADWEIGHT")
	public Double getEtvmMaxloadweight() {
		return etvmMaxloadweight;
	}

	/**
	 * Set etvmMaxloadweight
	 */
	public void setEtvmMaxloadweight(Double etvmMaxloadweight) {
		this.etvmMaxloadweight = etvmMaxloadweight;
		addValidField("etvmMaxloadweight");
	}

	/**
	 * Get etvmMaxloadvolume
	 */
	@Column(name = "ETVM_MAXLOADVOLUME")
	public Double getEtvmMaxloadvolume() {
		return etvmMaxloadvolume;
	}

	/**
	 * Set etvmMaxloadvolume
	 */
	public void setEtvmMaxloadvolume(Double etvmMaxloadvolume) {
		this.etvmMaxloadvolume = etvmMaxloadvolume;
		addValidField("etvmMaxloadvolume");
	}

	/**
	 * Get etvmMaxstops
	 */
	@Column(name = "ETVM_MAXSTOPS")
	public Integer getEtvmMaxstops() {
		return etvmMaxstops;
	}

	/**
	 * Set etvmMaxstops
	 */
	public void setEtvmMaxstops(Integer etvmMaxstops) {
		this.etvmMaxstops = etvmMaxstops;
		addValidField("etvmMaxstops");
	}

	/**
	 * Get etvmFixedcost
	 */
	@Column(name = "ETVM_FIXEDCOST")
	public String getEtvmFixedcost() {
		return etvmFixedcost;
	}

	/**
	 * Set etvmFixedcost
	 */
	public void setEtvmFixedcost(String etvmFixedcost) {
		this.etvmFixedcost = etvmFixedcost;
		addValidField("etvmFixedcost");
	}

	/**
	 * Get etvmDistancecost
	 */
	@Column(name = "ETVM_DISTANCECOST")
	public String getEtvmDistancecost() {
		return etvmDistancecost;
	}

	/**
	 * Set etvmDistancecost
	 */
	public void setEtvmDistancecost(String etvmDistancecost) {
		this.etvmDistancecost = etvmDistancecost;
		addValidField("etvmDistancecost");
	}

	/**
	 * Get recVer
	 */
	@Column(name = "REC_VER")
	@Version
	public Integer getRecVer() {
		return recVer;
	}

	/**
	 * Set recVer
	 */
	public void setRecVer(Integer recVer) {
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
