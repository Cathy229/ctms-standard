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
@Table(name = "ES_STATION")
public class EsStationModel extends BaseModel implements OperationLog {

	//基地表主键
	private Integer esstId;
	//公司表主键
	private Integer esstEscoId;
	//esstCity
	private Integer esstCity;
	//基地代码
	private String esstStationCode;
	//基地名称
	private String esstStationName;
	//联系人
	private String esstContactName;
	//联系电话
	private String esstContactPhone;
	//传真
	private String esstFax;
	//地址
	private String esstAddress;
	//邮编
	private String esstPost;
	//财务代码从平台带过来
	private String esstFinanceCode;
	//基地状态
	private String esstStatus;
	//预留字段
	private String esstSubstr1;
	//预留字段
	private String esstSubstr2;
	//预留字段
	private String esstSubstr3;
	//预留字段
	private String esstSubstr4;
	//预留字段
	private String esstSubstr5;
	//预留字段
	private String esstSubstr6;
	//预留字段
	private String esstSubstr8;
	//预留字段
	private String esstSubstr7;
	//预留字段
	private Date esstSubdate1;
	//预留字段
	private Date esstSubdate2;
	//预留字段
	private Date esstSubdate5;
	//预留字段
	private Date esstSubdate4;
	//预留字段
	private Date esstSubdate3;
	//修改时间
	private Date modifyTime;
	//创建人
	private String creator;
	//创建时间
	private Date createTime;
	//时间戳
	private Integer recVer;
	//修改人
	private String modifier;
  
	//基地英文名称
	private String esstStationNameEn;

	/**
	 * Get 基地表主键
	 */
	@Column(name = "ESST_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getEsstId() {
		return esstId;
	}

	/**
	 * Set 基地表主键
	 */
	public void setEsstId(Integer esstId) {
		this.esstId = esstId;
		addValidField("esstId");
	}

	/**
	 * Get 公司表主键
	 */
	@Column(name = "ESST_ESCO_ID")
	public Integer getEsstEscoId() {
		return esstEscoId;
	}

	/**
	 * Set 公司表主键
	 */
	public void setEsstEscoId(Integer esstEscoId) {
		this.esstEscoId = esstEscoId;
		addValidField("esstEscoId");
	}

	/**
	 * Get esstCity
	 */
	@Column(name = "ESST_CITY")
	public Integer getEsstCity() {
		return esstCity;
	}

	/**
	 * Set esstCity
	 */
	public void setEsstCity(Integer esstCity) {
		this.esstCity = esstCity;
		addValidField("esstCity");
	}

	/**
	 * Get 基地代码
	 */
	@Column(name = "ESST_STATION_CODE")
	public String getEsstStationCode() {
		return esstStationCode;
	}

	/**
	 * Set 基地代码
	 */
	public void setEsstStationCode(String esstStationCode) {
		this.esstStationCode = esstStationCode;
		addValidField("esstStationCode");
	}

	/**
	 * Get 基地名称
	 */
	@Column(name = "ESST_STATION_NAME")
	public String getEsstStationName() {
		return esstStationName;
	}

	/**
	 * Set 基地名称
	 */
	public void setEsstStationName(String esstStationName) {
		this.esstStationName = esstStationName;
		addValidField("esstStationName");
	}

	/**
	 * Get 联系人
	 */
	@Column(name = "ESST_CONTACT_NAME")
	public String getEsstContactName() {
		return esstContactName;
	}

	/**
	 * Set 联系人
	 */
	public void setEsstContactName(String esstContactName) {
		this.esstContactName = esstContactName;
		addValidField("esstContactName");
	}

	/**
	 * Get 联系电话
	 */
	@Column(name = "ESST_CONTACT_PHONE")
	public String getEsstContactPhone() {
		return esstContactPhone;
	}

	/**
	 * Set 联系电话
	 */
	public void setEsstContactPhone(String esstContactPhone) {
		this.esstContactPhone = esstContactPhone;
		addValidField("esstContactPhone");
	}

	/**
	 * Get 传真
	 */
	@Column(name = "ESST_FAX")
	public String getEsstFax() {
		return esstFax;
	}

	/**
	 * Set 传真
	 */
	public void setEsstFax(String esstFax) {
		this.esstFax = esstFax;
		addValidField("esstFax");
	}

	/**
	 * Get 地址
	 */
	@Column(name = "ESST_ADDRESS")
	public String getEsstAddress() {
		return esstAddress;
	}

	/**
	 * Set 地址
	 */
	public void setEsstAddress(String esstAddress) {
		this.esstAddress = esstAddress;
		addValidField("esstAddress");
	}

	/**
	 * Get 邮编
	 */
	@Column(name = "ESST_POST")
	public String getEsstPost() {
		return esstPost;
	}

	/**
	 * Set 邮编
	 */
	public void setEsstPost(String esstPost) {
		this.esstPost = esstPost;
		addValidField("esstPost");
	}

	/**
	 * Get 财务代码从平台带过来
	 * 但是可以修改
	 */
	@Column(name = "ESST_FINANCE_CODE")
	public String getEsstFinanceCode() {
		return esstFinanceCode;
	}

	/**
	 * Set 财务代码从平台带过来
	 * 但是可以修改
	 */
	public void setEsstFinanceCode(String esstFinanceCode) {
		this.esstFinanceCode = esstFinanceCode;
		addValidField("esstFinanceCode");
	}

	/**
	 * Get 基地状态
	 */
	@Column(name = "ESST_STATUS")
	public String getEsstStatus() {
		return esstStatus;
	}

	/**
	 * Set 基地状态
	 */
	public void setEsstStatus(String esstStatus) {
		this.esstStatus = esstStatus;
		addValidField("esstStatus");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESST_SUBSTR1")
	public String getEsstSubstr1() {
		return esstSubstr1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsstSubstr1(String esstSubstr1) {
		this.esstSubstr1 = esstSubstr1;
		addValidField("esstSubstr1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESST_SUBSTR2")
	public String getEsstSubstr2() {
		return esstSubstr2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsstSubstr2(String esstSubstr2) {
		this.esstSubstr2 = esstSubstr2;
		addValidField("esstSubstr2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESST_SUBSTR3")
	public String getEsstSubstr3() {
		return esstSubstr3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsstSubstr3(String esstSubstr3) {
		this.esstSubstr3 = esstSubstr3;
		addValidField("esstSubstr3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESST_SUBSTR4")
	public String getEsstSubstr4() {
		return esstSubstr4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsstSubstr4(String esstSubstr4) {
		this.esstSubstr4 = esstSubstr4;
		addValidField("esstSubstr4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESST_SUBSTR5")
	public String getEsstSubstr5() {
		return esstSubstr5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsstSubstr5(String esstSubstr5) {
		this.esstSubstr5 = esstSubstr5;
		addValidField("esstSubstr5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESST_SUBSTR6")
	public String getEsstSubstr6() {
		return esstSubstr6;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsstSubstr6(String esstSubstr6) {
		this.esstSubstr6 = esstSubstr6;
		addValidField("esstSubstr6");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESST_SUBSTR8")
	public String getEsstSubstr8() {
		return esstSubstr8;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsstSubstr8(String esstSubstr8) {
		this.esstSubstr8 = esstSubstr8;
		addValidField("esstSubstr8");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESST_SUBSTR7")
	public String getEsstSubstr7() {
		return esstSubstr7;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsstSubstr7(String esstSubstr7) {
		this.esstSubstr7 = esstSubstr7;
		addValidField("esstSubstr7");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESST_SUBDATE1")
	public Date getEsstSubdate1() {
		return esstSubdate1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsstSubdate1(Date esstSubdate1) {
		this.esstSubdate1 = esstSubdate1;
		addValidField("esstSubdate1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESST_SUBDATE2")
	public Date getEsstSubdate2() {
		return esstSubdate2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsstSubdate2(Date esstSubdate2) {
		this.esstSubdate2 = esstSubdate2;
		addValidField("esstSubdate2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESST_SUBDATE5")
	public Date getEsstSubdate5() {
		return esstSubdate5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsstSubdate5(Date esstSubdate5) {
		this.esstSubdate5 = esstSubdate5;
		addValidField("esstSubdate5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESST_SUBDATE4")
	public Date getEsstSubdate4() {
		return esstSubdate4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsstSubdate4(Date esstSubdate4) {
		this.esstSubdate4 = esstSubdate4;
		addValidField("esstSubdate4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ESST_SUBDATE3")
	public Date getEsstSubdate3() {
		return esstSubdate3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEsstSubdate3(Date esstSubdate3) {
		this.esstSubdate3 = esstSubdate3;
		addValidField("esstSubdate3");
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
	 * Get 基地英文名称
	 */
	@Column(name = "ESST_STATION_NAME_EN")
	public String getEsstStationNameEn() {
		return esstStationNameEn;
	}

	/**
	 * Set 基地英文名称
	 */
	public void setEsstStationNameEn(String esstStationNameEn) {
		this.esstStationNameEn = esstStationNameEn;
		addValidField("esstStationNameEn");
	}

}