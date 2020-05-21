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

/**
 * Model class for 地点表
 */
@Entity
@Table(name = "EB_PLACE")
public class EbPlaceModel extends BaseModel implements OperationLog {

	//区域表主键
	private Integer ebplId;
	//上级地点ID
	private Integer ebplParentId;
	//地点级别
	private String ebplType;
	//代码
	private String ebplCode;
	//快速录入码
	private String ebplQuickCode;
	//中文名称
	private String ebplNameCn;
	//英文名称
	private String ebplNameEn;
	//邮编
	private String ebplPostCode;
	//是否可用
	private String ebplIsAble;
	//预留字段
	private String ebplSubstr1;
	//预留字段
	private String ebplSubstr2;
	//预留字段
	private String ebplSubstr3;
	//预留字段
	private String ebplSubstr4;
	//预留字段
	private String ebplSubstr5;
	//预留字段
	private String ebplSubstr6;
	//预留字段
	private String ebplSubstr8;
	//预留字段
	private String ebplSubstr7;
	//预留字段
	private Date ebplSubdate1;
	//预留字段
	private Date ebplSubdate2;
	//预留字段
	private Date ebplSubdate5;
	//预留字段
	private Date ebplSubdate4;
	//预留字段
	private Date ebplSubdate3;
	//预留字段
	private Integer ebplSubnum1;
	//预留字段
	private Integer ebplSubnum2;
	//预留字段
	private Integer ebplSubnum3;
	//时间戳
	private Integer recVer;
	//创建时间
	private Date createTime;
	//修改时间
	private Date modifyTime;
	//修改人
	private String modifier;
	//创建人
	private String creator;

	/**
	 * Get 区域表主键
	 */
	@Column(name = "EBPL_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getEbplId() {
		return ebplId;
	}

	/**
	 * Set 区域表主键
	 */
	public void setEbplId(Integer ebplId) {
		this.ebplId = ebplId;
		addValidField("ebplId");
	}

	/**
	 * Get 上级地点ID
	 */
	@Column(name = "EBPL_PARENT_ID")
	public Integer getEbplParentId() {
		return ebplParentId;
	}

	/**
	 * Set 上级地点ID
	 */
	public void setEbplParentId(Integer ebplParentId) {
		this.ebplParentId = ebplParentId;
		addValidField("ebplParentId");
	}

	/**
	 * Get 地点级别
	 */
	@Column(name = "EBPL_TYPE")
	public String getEbplType() {
		return ebplType;
	}

	/**
	 * Set 地点级别
	 */
	public void setEbplType(String ebplType) {
		this.ebplType = ebplType;
		addValidField("ebplType");
	}

	/**
	 * Get 代码
	 */
	@Column(name = "EBPL_CODE")
	public String getEbplCode() {
		return ebplCode;
	}

	/**
	 * Set 代码
	 */
	public void setEbplCode(String ebplCode) {
		this.ebplCode = ebplCode;
		addValidField("ebplCode");
	}

	/**
	 * Get 快速录入码
	 */
	@Column(name = "EBPL_QUICK_CODE")
	public String getEbplQuickCode() {
		return ebplQuickCode;
	}

	/**
	 * Set 快速录入码
	 */
	public void setEbplQuickCode(String ebplQuickCode) {
		this.ebplQuickCode = ebplQuickCode;
		addValidField("ebplQuickCode");
	}

	/**
	 * Get 中文名称
	 */
	@Column(name = "EBPL_NAME_CN")
	public String getEbplNameCn() {
		return ebplNameCn;
	}

	/**
	 * Set 中文名称
	 */
	public void setEbplNameCn(String ebplNameCn) {
		this.ebplNameCn = ebplNameCn;
		addValidField("ebplNameCn");
	}

	/**
	 * Get 英文名称
	 */
	@Column(name = "EBPL_NAME_EN")
	public String getEbplNameEn() {
		return ebplNameEn;
	}

	/**
	 * Set 英文名称
	 */
	public void setEbplNameEn(String ebplNameEn) {
		this.ebplNameEn = ebplNameEn;
		addValidField("ebplNameEn");
	}

	/**
	 * Get 邮编
	 */
	@Column(name = "EBPL_POST_CODE")
	public String getEbplPostCode() {
		return ebplPostCode;
	}

	/**
	 * Set 邮编
	 */
	public void setEbplPostCode(String ebplPostCode) {
		this.ebplPostCode = ebplPostCode;
		addValidField("ebplPostCode");
	}

	/**
	 * Get 是否可用
	 */
	@Column(name = "EBPL_IS_ABLE")
	public String getEbplIsAble() {
		return ebplIsAble;
	}

	/**
	 * Set 是否可用
	 */
	public void setEbplIsAble(String ebplIsAble) {
		this.ebplIsAble = ebplIsAble;
		addValidField("ebplIsAble");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPL_SUBSTR1")
	public String getEbplSubstr1() {
		return ebplSubstr1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbplSubstr1(String ebplSubstr1) {
		this.ebplSubstr1 = ebplSubstr1;
		addValidField("ebplSubstr1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPL_SUBSTR2")
	public String getEbplSubstr2() {
		return ebplSubstr2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbplSubstr2(String ebplSubstr2) {
		this.ebplSubstr2 = ebplSubstr2;
		addValidField("ebplSubstr2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPL_SUBSTR3")
	public String getEbplSubstr3() {
		return ebplSubstr3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbplSubstr3(String ebplSubstr3) {
		this.ebplSubstr3 = ebplSubstr3;
		addValidField("ebplSubstr3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPL_SUBSTR4")
	public String getEbplSubstr4() {
		return ebplSubstr4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbplSubstr4(String ebplSubstr4) {
		this.ebplSubstr4 = ebplSubstr4;
		addValidField("ebplSubstr4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPL_SUBSTR5")
	public String getEbplSubstr5() {
		return ebplSubstr5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbplSubstr5(String ebplSubstr5) {
		this.ebplSubstr5 = ebplSubstr5;
		addValidField("ebplSubstr5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPL_SUBSTR6")
	public String getEbplSubstr6() {
		return ebplSubstr6;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbplSubstr6(String ebplSubstr6) {
		this.ebplSubstr6 = ebplSubstr6;
		addValidField("ebplSubstr6");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPL_SUBSTR8")
	public String getEbplSubstr8() {
		return ebplSubstr8;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbplSubstr8(String ebplSubstr8) {
		this.ebplSubstr8 = ebplSubstr8;
		addValidField("ebplSubstr8");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPL_SUBSTR7")
	public String getEbplSubstr7() {
		return ebplSubstr7;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbplSubstr7(String ebplSubstr7) {
		this.ebplSubstr7 = ebplSubstr7;
		addValidField("ebplSubstr7");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPL_SUBDATE1")
	public Date getEbplSubdate1() {
		return ebplSubdate1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbplSubdate1(Date ebplSubdate1) {
		this.ebplSubdate1 = ebplSubdate1;
		addValidField("ebplSubdate1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPL_SUBDATE2")
	public Date getEbplSubdate2() {
		return ebplSubdate2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbplSubdate2(Date ebplSubdate2) {
		this.ebplSubdate2 = ebplSubdate2;
		addValidField("ebplSubdate2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPL_SUBDATE5")
	public Date getEbplSubdate5() {
		return ebplSubdate5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbplSubdate5(Date ebplSubdate5) {
		this.ebplSubdate5 = ebplSubdate5;
		addValidField("ebplSubdate5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPL_SUBDATE4")
	public Date getEbplSubdate4() {
		return ebplSubdate4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbplSubdate4(Date ebplSubdate4) {
		this.ebplSubdate4 = ebplSubdate4;
		addValidField("ebplSubdate4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPL_SUBDATE3")
	public Date getEbplSubdate3() {
		return ebplSubdate3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbplSubdate3(Date ebplSubdate3) {
		this.ebplSubdate3 = ebplSubdate3;
		addValidField("ebplSubdate3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPL_SUBNUM1")
	public Integer getEbplSubnum1() {
		return ebplSubnum1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbplSubnum1(Integer ebplSubnum1) {
		this.ebplSubnum1 = ebplSubnum1;
		addValidField("ebplSubnum1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPL_SUBNUM2")
	public Integer getEbplSubnum2() {
		return ebplSubnum2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbplSubnum2(Integer ebplSubnum2) {
		this.ebplSubnum2 = ebplSubnum2;
		addValidField("ebplSubnum2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EBPL_SUBNUM3")
	public Integer getEbplSubnum3() {
		return ebplSubnum3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEbplSubnum3(Integer ebplSubnum3) {
		this.ebplSubnum3 = ebplSubnum3;
		addValidField("ebplSubnum3");
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

}