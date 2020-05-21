package com.sinotrans.oms.eoor.model;

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

@Entity
@Table(name = "EB_EBPJ_2_ESUS")
public class EbEbpj2EsusModel extends BaseModel implements OperationLog {

	//项目用户表主键
	private Integer ebpuId;
	//项目表主键
	private Integer ebpuEbpjId;
	//用户ID
	private Integer ebpuEsusId;
	//预留字段
	private String ebpuSubstr1;
	//预留字段
	private String ebpuSubstr2;
	//预留字段
	private String ebpuSubstr3;
	//预留字段
	private Date ebpuSubdate2;
	//预留字段
	private Date ebpuSubdate1;
	//预留字段
	private Integer ebpuSubnum1;
	//时间戳
	private Integer recVer;
	//创建时间
	private Date createTime;
	//创建人
	private String creator;
	//修改时间
	private Date modifyTime;
	//修改人
	private String modifier;
	//是否调度人
	private String ebpuIsSchedule;
	//是否默认调度人
	private String ebpuIsDefaultSchedule;

	/**
	 * Get 项目用户表主键
	 */
	@Column(name = "EBPU_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getEbpuId() {
		return ebpuId;
	}

	/**
	 * Set 项目用户表主键
	 */
	public void setEbpuId(Integer ebpuId) {
		this.ebpuId = ebpuId;
		addValidField("ebpuId");
	}

	/**
	 * Get 项目表主键
	 */
	@Column(name = "EBPU_EBPJ_ID")
	public Integer getEbpuEbpjId() {
		return ebpuEbpjId;
	}

	/**
	 * Set 项目表主键
	 */
	public void setEbpuEbpjId(Integer ebpuEbpjId) {
		this.ebpuEbpjId = ebpuEbpjId;
		addValidField("ebpuEbpjId");
	}

	/**
	 * Get 用户ID
	 * 关联用户表
	 */
	@Column(name = "EBPU_ESUS_ID")
	public Integer getEbpuEsusId() {
		return ebpuEsusId;
	}

	/**
	 * Set 用户ID
	 * 关联用户表
	 */
	public void setEbpuEsusId(Integer ebpuEsusId) {
		this.ebpuEsusId = ebpuEsusId;
		addValidField("ebpuEsusId");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPU_SUBSTR1")
	public String getEbpuSubstr1() {
		return ebpuSubstr1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpuSubstr1(String ebpuSubstr1) {
		this.ebpuSubstr1 = ebpuSubstr1;
		addValidField("ebpuSubstr1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPU_SUBSTR2")
	public String getEbpuSubstr2() {
		return ebpuSubstr2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpuSubstr2(String ebpuSubstr2) {
		this.ebpuSubstr2 = ebpuSubstr2;
		addValidField("ebpuSubstr2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPU_SUBSTR3")
	public String getEbpuSubstr3() {
		return ebpuSubstr3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpuSubstr3(String ebpuSubstr3) {
		this.ebpuSubstr3 = ebpuSubstr3;
		addValidField("ebpuSubstr3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPU_SUBDATE2")
	public Date getEbpuSubdate2() {
		return ebpuSubdate2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpuSubdate2(Date ebpuSubdate2) {
		this.ebpuSubdate2 = ebpuSubdate2;
		addValidField("ebpuSubdate2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPU_SUBDATE1")
	public Date getEbpuSubdate1() {
		return ebpuSubdate1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpuSubdate1(Date ebpuSubdate1) {
		this.ebpuSubdate1 = ebpuSubdate1;
		addValidField("ebpuSubdate1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPU_SUBNUM1")
	public Integer getEbpuSubnum1() {
		return ebpuSubnum1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbpuSubnum1(Integer ebpuSubnum1) {
		this.ebpuSubnum1 = ebpuSubnum1;
		addValidField("ebpuSubnum1");
	}

	/**
	 * Get 时间戳
	 */
	@Column(name = "REC_VER")
	@Version
	public Integer getRecVer() {
		return recVer;
	}

	/**
	 * Set 时间戳
	 */
	public void setRecVer(Integer recVer) {
		this.recVer = recVer;
		addValidField("recVer");
	}

	/**
	 * Get 创建时间
	 */
	@Column(name = "CREATE_TIME")
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * Set 创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
		addValidField("createTime");
	}

	/**
	 * Get 创建人
	 */
	@Column(name = "CREATOR")
	public String getCreator() {
		return creator;
	}

	/**
	 * Set 创建人
	 */
	public void setCreator(String creator) {
		this.creator = creator;
		addValidField("creator");
	}

	/**
	 * Get 修改时间
	 */
	@Column(name = "MODIFY_TIME")
	public Date getModifyTime() {
		return modifyTime;
	}

	/**
	 * Set 修改时间
	 */
	public void setModifyTime(Date modifyTime) {
		this.modifyTime = modifyTime;
		addValidField("modifyTime");
	}

	/**
	 * Get 修改人
	 */
	@Column(name = "MODIFIER")
	public String getModifier() {
		return modifier;
	}

	/**
	 * Set 修改人
	 */
	public void setModifier(String modifier) {
		this.modifier = modifier;
		addValidField("modifier");
	}
	/**
	 * Get 是否调度人
	 */
	@Column(name = "EBPU_IS_SCHEDULE")
	public String getEbpuIsSchedule() {
		return ebpuIsSchedule;
	}
	/**
	 * Set 是否调度人
	 */
	public void setEbpuIsSchedule(String ebpuIsSchedule) {
		this.ebpuIsSchedule = ebpuIsSchedule;
		addValidField("ebpuIsSchedule");
	}
	/**
	 * Get 是否默认调度人
	 */
	@Column(name = "EBPU_IS_DEFAULT_SCHEDULE")
	public String getEbpuIsDefaultSchedule() {
		return ebpuIsDefaultSchedule;
	}
	/**
	 * Set 是否默认调度人
	 */
	public void setEbpuIsDefaultSchedule(String ebpuIsDefaultSchedule) {
		this.ebpuIsDefaultSchedule = ebpuIsDefaultSchedule;
		addValidField("ebpuIsDefaultSchedule");
	}
}