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
@Table(name = "ET_TASK_MATERIEL")
public class EtTaskMaterielModel extends BaseModel implements OperationLog {

	//任务物料表主键
	private Integer ettmId;
	//任务表主键
	private Integer ettmEttaId;
	//订单物料表主键
	private Integer ettmEtomId;
	//重量
	private Double ettmWeight;
	//体积
	private Double ettmVolume;
	//件数
	private Integer ettmQuantity;
	//预留字段
	private String ettmSubstr1;
	//预留字段
	private String ettmSubstr2;
	//预留字段
	private String ettmSubstr3;
	//预留字段
	private String ettmSubstr4;
	//预留字段
	private String ettmSubstr5;
	//预留字段
	private String ettmSubstr6;
	//预留字段
	private String ettmSubstr8;
	//预留字段
	private String ettmSubstr7;
	//预留字段
	private Date ettmSubdate1;
	//预留字段
	private Date ettmSubdate2;
	//预留字段
	private Date ettmSubdate5;
	//预留字段
	private Date ettmSubdate4;
	//预留字段
	private Date ettmSubdate3;
	//预留字段
	private Integer ettmSubnum3;
	//预留字段
	private Integer ettmSubnum2;
	//预留字段
	private Integer ettmSubnum1;
	//recVer
	private Integer recVer;
	//modifyTime
	private Date modifyTime;
	//modifier
	private String modifier;
	//createTime
	private Date createTime;
	//creator
	private String creator;
	//净重
	private Double ettmNetWeight;

	/**
	 * Get 任务物料表主键
	 */
	@Column(name = "ETTM_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getEttmId() {
		return ettmId;
	}

	/**
	 * Set 任务物料表主键
	 */
	public void setEttmId(Integer ettmId) {
		this.ettmId = ettmId;
		addValidField("ettmId");
	}

	/**
	 * Get 任务表主键
	 */
	@Column(name = "ETTM_ETTA_ID")
	public Integer getEttmEttaId() {
		return ettmEttaId;
	}

	/**
	 * Set 任务表主键
	 */
	public void setEttmEttaId(Integer ettmEttaId) {
		this.ettmEttaId = ettmEttaId;
		addValidField("ettmEttaId");
	}

	/**
	 * Get 订单物料表主键
	 */
	@Column(name = "ETTM_ETOM_ID")
	public Integer getEttmEtomId() {
		return ettmEtomId;
	}

	/**
	 * Set 订单物料表主键
	 */
	public void setEttmEtomId(Integer ettmEtomId) {
		this.ettmEtomId = ettmEtomId;
		addValidField("ettmEtomId");
	}

	/**
	 * Get 重量
	 */
	@Column(name = "ETTM_WEIGHT")
	public Double getEttmWeight() {
		return ettmWeight;
	}

	/**
	 * Set 重量
	 */
	public void setEttmWeight(Double ettmWeight) {
		this.ettmWeight = ettmWeight;
		addValidField("ettmWeight");
	}

	/**
	 * Get 体积
	 */
	@Column(name = "ETTM_VOLUME")
	public Double getEttmVolume() {
		return ettmVolume;
	}

	/**
	 * Set 体积
	 */
	public void setEttmVolume(Double ettmVolume) {
		this.ettmVolume = ettmVolume;
		addValidField("ettmVolume");
	}

	/**
	 * Get 件数
	 */
	@Column(name = "ETTM_QUANTITY")
	public Integer getEttmQuantity() {
		return ettmQuantity;
	}

	/**
	 * Set 件数
	 */
	public void setEttmQuantity(Integer ettmQuantity) {
		this.ettmQuantity = ettmQuantity;
		addValidField("ettmQuantity");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTM_SUBSTR1")
	public String getEttmSubstr1() {
		return ettmSubstr1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttmSubstr1(String ettmSubstr1) {
		this.ettmSubstr1 = ettmSubstr1;
		addValidField("ettmSubstr1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTM_SUBSTR2")
	public String getEttmSubstr2() {
		return ettmSubstr2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttmSubstr2(String ettmSubstr2) {
		this.ettmSubstr2 = ettmSubstr2;
		addValidField("ettmSubstr2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTM_SUBSTR3")
	public String getEttmSubstr3() {
		return ettmSubstr3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttmSubstr3(String ettmSubstr3) {
		this.ettmSubstr3 = ettmSubstr3;
		addValidField("ettmSubstr3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTM_SUBSTR4")
	public String getEttmSubstr4() {
		return ettmSubstr4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttmSubstr4(String ettmSubstr4) {
		this.ettmSubstr4 = ettmSubstr4;
		addValidField("ettmSubstr4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTM_SUBSTR5")
	public String getEttmSubstr5() {
		return ettmSubstr5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttmSubstr5(String ettmSubstr5) {
		this.ettmSubstr5 = ettmSubstr5;
		addValidField("ettmSubstr5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTM_SUBSTR6")
	public String getEttmSubstr6() {
		return ettmSubstr6;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttmSubstr6(String ettmSubstr6) {
		this.ettmSubstr6 = ettmSubstr6;
		addValidField("ettmSubstr6");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTM_SUBSTR8")
	public String getEttmSubstr8() {
		return ettmSubstr8;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttmSubstr8(String ettmSubstr8) {
		this.ettmSubstr8 = ettmSubstr8;
		addValidField("ettmSubstr8");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTM_SUBSTR7")
	public String getEttmSubstr7() {
		return ettmSubstr7;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttmSubstr7(String ettmSubstr7) {
		this.ettmSubstr7 = ettmSubstr7;
		addValidField("ettmSubstr7");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTM_SUBDATE1")
	public Date getEttmSubdate1() {
		return ettmSubdate1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttmSubdate1(Date ettmSubdate1) {
		this.ettmSubdate1 = ettmSubdate1;
		addValidField("ettmSubdate1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTM_SUBDATE2")
	public Date getEttmSubdate2() {
		return ettmSubdate2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttmSubdate2(Date ettmSubdate2) {
		this.ettmSubdate2 = ettmSubdate2;
		addValidField("ettmSubdate2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTM_SUBDATE5")
	public Date getEttmSubdate5() {
		return ettmSubdate5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttmSubdate5(Date ettmSubdate5) {
		this.ettmSubdate5 = ettmSubdate5;
		addValidField("ettmSubdate5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTM_SUBDATE4")
	public Date getEttmSubdate4() {
		return ettmSubdate4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttmSubdate4(Date ettmSubdate4) {
		this.ettmSubdate4 = ettmSubdate4;
		addValidField("ettmSubdate4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTM_SUBDATE3")
	public Date getEttmSubdate3() {
		return ettmSubdate3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttmSubdate3(Date ettmSubdate3) {
		this.ettmSubdate3 = ettmSubdate3;
		addValidField("ettmSubdate3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTM_SUBNUM3")
	public Integer getEttmSubnum3() {
		return ettmSubnum3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttmSubnum3(Integer ettmSubnum3) {
		this.ettmSubnum3 = ettmSubnum3;
		addValidField("ettmSubnum3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTM_SUBNUM2")
	public Integer getEttmSubnum2() {
		return ettmSubnum2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttmSubnum2(Integer ettmSubnum2) {
		this.ettmSubnum2 = ettmSubnum2;
		addValidField("ettmSubnum2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETTM_SUBNUM1")
	public Integer getEttmSubnum1() {
		return ettmSubnum1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEttmSubnum1(Integer ettmSubnum1) {
		this.ettmSubnum1 = ettmSubnum1;
		addValidField("ettmSubnum1");
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
	 * Get 净重
	 */
	@Column(name = "ETTM_NET_WEIGHT")
	public Double getEttmNetWeight() {
		return ettmNetWeight;
	}

	/**
	 * Set 净重
	 */
	public void setEttmNetWeight(Double ettmNetWeight) {
		this.ettmNetWeight = ettmNetWeight;
		addValidField("ettmNetWeight");
	}

}