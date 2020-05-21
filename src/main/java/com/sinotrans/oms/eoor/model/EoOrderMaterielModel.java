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
@Table(name = "EO_ORDER_MATERIEL")
public class EoOrderMaterielModel extends BaseModel implements OperationLog {

	//订单物料表主键
	private Integer eoomId;
	//订单表主键
	private Integer eoomEoorId;
	//物料表主键
	private Integer eoomEbmaId;
	//物料代码
	private String eoomMaterialNo;
	//物料名称
	private String eoomEbmaNameCn;
	//规格ID
	private Integer eoomEbtpId;
	//规格
	private String eoomEbtpModel;
	//包装
	private String eoomEbtpPackage;
	//包装类型
	private String eoomEbtpPackageType;
	//物料特性
	private String eoomType;
	//是否温控
	private String eoomEbmaIsTemperature;
	//温度范围
	private String eoomEbmaFeatures;
	//危险品等级
	private String eoomEbmaDgClass;
	//物料状态
	private String eoomStatus;
	//物料数量
	private Integer eoomNumber;
	//计量单位
	private String eoomNumberUnit;
	//物料件数
	private Integer eoomQuantity;
	//数量单位
	private String eoomQuantityUnit;
	//批次
	private String eoomBatch;
	//国家危险品编号
	private String eoomEbmaDgCode;
	//UN
	private String eoomEbmaUnNo;
	//毛重
	private Double eoomGrossWeight;
	//净重
	private Double eoomNetWeight;
	//体积
	private Double eoomVolume;
	//产品单价
	private Double eoomPrice;
	//预留字段
	private String eoomSubstr1;
	//预留字段
	private String eoomSubstr2;
	//预留字段
	private String eoomSubstr3;
	//预留字段
	private String eoomSubstr4;
	//预留字段
	private String eoomSubstr5;
	//预留字段
	private String eoomSubstr6;
	//预留字段
	private String eoomSubstr8;
	//预留字段
	private String eoomSubstr7;
	//预留字段
	private Date eoomSubdate1;
	//预留字段
	private Date eoomSubdate2;
	//预留字段
	private Date eoomSubdate5;
	//预留字段
	private Date eoomSubdate4;
	//预留字段
	private Date eoomSubdate3;
	//预留字段
	private Integer eoomSubnum3;
	//预留字段
	private Double eoomSubnum2;
	//预留字段
	private Integer eoomSubnum1;
	//creator
	private String creator;
	//createTime
	private Date createTime;
	//modifier
	private String modifier;
	//modifyTime
	private Date modifyTime;
	//recVer
	private Integer recVer;
	
	private Long eoomInnerMrId;//增加内部委托物料表主键
	//班线订单物料主键 eoomEcmsEoomId
	private Integer eoomEcmsEoomId;
	//物料行号
	private String eoomLineno;

	

	/**
	 * Get 订单物料表主键
	 */
	@Column(name = "EOOM_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getEoomId() {
		return eoomId;
	}

	/**
	 * Set 订单物料表主键
	 */
	public void setEoomId(Integer eoomId) {
		this.eoomId = eoomId;
		addValidField("eoomId");
	}
	
	@Column(name = "EOOM_INNER_MR_ID")
	public Long getEoomInnerMrId() {
		return eoomInnerMrId;
	}

	public void setEoomInnerMrId(Long eoomInnerMrId) {
		this.eoomInnerMrId = eoomInnerMrId;
		addValidField("eoomInnerMrId");
	}

	/**
	 * Get 订单表主键
	 */
	@Column(name = "EOOM_EOOR_ID")
	public Integer getEoomEoorId() {
		return eoomEoorId;
	}

	/**
	 * Set 订单表主键
	 */
	public void setEoomEoorId(Integer eoomEoorId) {
		this.eoomEoorId = eoomEoorId;
		addValidField("eoomEoorId");
	}

	/**
	 * Get 物料
	 */
	@Column(name = "EOOM_EBMA_ID")
	public Integer getEoomEbmaId() {
		return eoomEbmaId;
	}

	/**
	 * Set 物料
	 */
	public void setEoomEbmaId(Integer eoomEbmaId) {
		this.eoomEbmaId = eoomEbmaId;
		addValidField("eoomEbmaId");
	}

	/**
	 * Get 物料代码
	 */
	@Column(name = "EOOM_MATERIAL_NO")
	public String getEoomMaterialNo() {
		return eoomMaterialNo;
	}

	/**
	 * Set 物料代码
	 */
	public void setEoomMaterialNo(String eoomMaterialNo) {
		this.eoomMaterialNo = eoomMaterialNo;
		addValidField("eoomMaterialNo");
	}

	/**
	 * Get 物料名称
	 */
	@Column(name = "EOOM_EBMA_NAME_CN")
	public String getEoomEbmaNameCn() {
		return eoomEbmaNameCn;
	}

	/**
	 * Set 物料名称
	 */
	public void setEoomEbmaNameCn(String eoomEbmaNameCn) {
		this.eoomEbmaNameCn = eoomEbmaNameCn;
		addValidField("eoomEbmaNameCn");
	}

	/**
	 * Get 规格ID
	 */
	@Column(name = "EOOM_EBTP_ID")
	public Integer getEoomEbtpId() {
		return eoomEbtpId;
	}

	/**
	 * Set 规格ID
	 */
	public void setEoomEbtpId(Integer eoomEbtpId) {
		this.eoomEbtpId = eoomEbtpId;
		addValidField("eoomEbtpId");
	}

	/**
	 * Get 规格
	 */
	@Column(name = "EOOM_EBTP_MODEL")
	public String getEoomEbtpModel() {
		return eoomEbtpModel;
	}

	/**
	 * Set 规格
	 */
	public void setEoomEbtpModel(String eoomEbtpModel) {
		this.eoomEbtpModel = eoomEbtpModel;
		addValidField("eoomEbtpModel");
	}

	/**
	 * Get 包装
	 */
	@Column(name = "EOOM_EBTP_PACKAGE")
	public String getEoomEbtpPackage() {
		return eoomEbtpPackage;
	}

	/**
	 * Set 包装
	 */
	public void setEoomEbtpPackage(String eoomEbtpPackage) {
		this.eoomEbtpPackage = eoomEbtpPackage;
		addValidField("eoomEbtpPackage");
	}

	/**
	 * Get 包装类型
	 */
	@Column(name = "EOOM_EBTP_PACKAGE_TYPE")
	public String getEoomEbtpPackageType() {
		return eoomEbtpPackageType;
	}

	/**
	 * Set 包装类型
	 */
	public void setEoomEbtpPackageType(String eoomEbtpPackageType) {
		this.eoomEbtpPackageType = eoomEbtpPackageType;
		addValidField("eoomEbtpPackageType");
	}

	/**
	 * Get 物料特性
	 */
	@Column(name = "EOOM_TYPE")
	public String getEoomType() {
		return eoomType;
	}

	/**
	 * Set 物料特性
	 */
	public void setEoomType(String eoomType) {
		this.eoomType = eoomType;
		addValidField("eoomType");
	}

	/**
	 * Get 是否温控
	 */
	@Column(name = "EOOM_EBMA_IS_TEMPERATURE")
	public String getEoomEbmaIsTemperature() {
		return eoomEbmaIsTemperature;
	}

	/**
	 * Set 是否温控
	 */
	public void setEoomEbmaIsTemperature(String eoomEbmaIsTemperature) {
		this.eoomEbmaIsTemperature = eoomEbmaIsTemperature;
		addValidField("eoomEbmaIsTemperature");
	}

	/**
	 * Get 温度范围
	 */
	@Column(name = "EOOM_EBMA_FEATURES")
	public String getEoomEbmaFeatures() {
		return eoomEbmaFeatures;
	}

	/**
	 * Set 温度范围
	 */
	public void setEoomEbmaFeatures(String eoomEbmaFeatures) {
		this.eoomEbmaFeatures = eoomEbmaFeatures;
		addValidField("eoomEbmaFeatures");
	}

	/**
	 * Get 危险品等级
	 */
	@Column(name = "EOOM_EBMA_DG_CLASS")
	public String getEoomEbmaDgClass() {
		return eoomEbmaDgClass;
	}

	/**
	 * Set 危险品等级
	 */
	public void setEoomEbmaDgClass(String eoomEbmaDgClass) {
		this.eoomEbmaDgClass = eoomEbmaDgClass;
		addValidField("eoomEbmaDgClass");
	}

	/**
	 * Get 物料状态
	 */
	@Column(name = "EOOM_STATUS")
	public String getEoomStatus() {
		return eoomStatus;
	}

	/**
	 * Set 物料状态
	 */
	public void setEoomStatus(String eoomStatus) {
		this.eoomStatus = eoomStatus;
		addValidField("eoomStatus");
	}

	/**
	 * Get 物料数量
	 */
	@Column(name = "EOOM_NUMBER")
	public Integer getEoomNumber() {
		return eoomNumber;
	}

	/**
	 * Set 物料数量
	 */
	public void setEoomNumber(Integer eoomNumber) {
		this.eoomNumber = eoomNumber;
		addValidField("eoomNumber");
	}

	/**
	 * Get 计量单位
	 */
	@Column(name = "EOOM_NUMBER_UNIT")
	public String getEoomNumberUnit() {
		return eoomNumberUnit;
	}

	/**
	 * Set 计量单位
	 */
	public void setEoomNumberUnit(String eoomNumberUnit) {
		this.eoomNumberUnit = eoomNumberUnit;
		addValidField("eoomNumberUnit");
	}

	/**
	 * Get 物料件数
	 */
	@Column(name = "EOOM_QUANTITY")
	public Integer getEoomQuantity() {
		return eoomQuantity;
	}

	/**
	 * Set 物料件数
	 */
	public void setEoomQuantity(Integer eoomQuantity) {
		this.eoomQuantity = eoomQuantity;
		addValidField("eoomQuantity");
	}

	/**
	 * Get 数量单位
	 */
	@Column(name = "EOOM_QUANTITY_UNIT")
	public String getEoomQuantityUnit() {
		return eoomQuantityUnit;
	}

	/**
	 * Set 数量单位
	 */
	public void setEoomQuantityUnit(String eoomQuantityUnit) {
		this.eoomQuantityUnit = eoomQuantityUnit;
		addValidField("eoomQuantityUnit");
	}

	/**
	 * Get 批次
	 */
	@Column(name = "EOOM_BATCH")
	public String getEoomBatch() {
		return eoomBatch;
	}

	/**
	 * Set 批次
	 */
	public void setEoomBatch(String eoomBatch) {
		this.eoomBatch = eoomBatch;
		addValidField("eoomBatch");
	}

	/**
	 * Get 国家危险品编号
	 */
	@Column(name = "EOOM_EBMA_DG_CODE")
	public String getEoomEbmaDgCode() {
		return eoomEbmaDgCode;
	}

	/**
	 * Set 国家危险品编号
	 */
	public void setEoomEbmaDgCode(String eoomEbmaDgCode) {
		this.eoomEbmaDgCode = eoomEbmaDgCode;
		addValidField("eoomEbmaDgCode");
	}

	/**
	 * Get UN
	 * NO
	 */
	@Column(name = "EOOM_EBMA_UN_NO")
	public String getEoomEbmaUnNo() {
		return eoomEbmaUnNo;
	}

	/**
	 * Set UN
	 * NO
	 */
	public void setEoomEbmaUnNo(String eoomEbmaUnNo) {
		this.eoomEbmaUnNo = eoomEbmaUnNo;
		addValidField("eoomEbmaUnNo");
	}

	/**
	 * Get 毛重
	 */
	@Column(name = "EOOM_GROSS_WEIGHT")
	public Double getEoomGrossWeight() {
		return eoomGrossWeight;
	}

	/**
	 * Set 毛重
	 */
	public void setEoomGrossWeight(Double eoomGrossWeight) {
		this.eoomGrossWeight = eoomGrossWeight;
		addValidField("eoomGrossWeight");
	}

	/**
	 * Get 净重
	 */
	@Column(name = "EOOM_NET_WEIGHT")
	public Double getEoomNetWeight() {
		return eoomNetWeight;
	}

	/**
	 * Set 净重
	 */
	public void setEoomNetWeight(Double eoomNetWeight) {
		this.eoomNetWeight = eoomNetWeight;
		addValidField("eoomNetWeight");
	}

	/**
	 * Get 体积
	 */
	@Column(name = "EOOM_VOLUME")
	public Double getEoomVolume() {
		return eoomVolume;
	}

	/**
	 * Set 体积
	 */
	public void setEoomVolume(Double eoomVolume) {
		this.eoomVolume = eoomVolume;
		addValidField("eoomVolume");
	}

	/**
	 * Get 产品单价
	 */
	@Column(name = "EOOM_PRICE")
	public Double getEoomPrice() {
		return eoomPrice;
	}

	/**
	 * Set 产品单价
	 */
	public void setEoomPrice(Double eoomPrice) {
		this.eoomPrice = eoomPrice;
		addValidField("eoomPrice");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOM_SUBSTR1")
	public String getEoomSubstr1() {
		return eoomSubstr1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoomSubstr1(String eoomSubstr1) {
		this.eoomSubstr1 = eoomSubstr1;
		addValidField("eoomSubstr1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOM_SUBSTR2")
	public String getEoomSubstr2() {
		return eoomSubstr2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoomSubstr2(String eoomSubstr2) {
		this.eoomSubstr2 = eoomSubstr2;
		addValidField("eoomSubstr2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOM_SUBSTR3")
	public String getEoomSubstr3() {
		return eoomSubstr3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoomSubstr3(String eoomSubstr3) {
		this.eoomSubstr3 = eoomSubstr3;
		addValidField("eoomSubstr3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOM_SUBSTR4")
	public String getEoomSubstr4() {
		return eoomSubstr4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoomSubstr4(String eoomSubstr4) {
		this.eoomSubstr4 = eoomSubstr4;
		addValidField("eoomSubstr4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOM_SUBSTR5")
	public String getEoomSubstr5() {
		return eoomSubstr5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoomSubstr5(String eoomSubstr5) {
		this.eoomSubstr5 = eoomSubstr5;
		addValidField("eoomSubstr5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOM_SUBSTR6")
	public String getEoomSubstr6() {
		return eoomSubstr6;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoomSubstr6(String eoomSubstr6) {
		this.eoomSubstr6 = eoomSubstr6;
		addValidField("eoomSubstr6");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOM_SUBSTR8")
	public String getEoomSubstr8() {
		return eoomSubstr8;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoomSubstr8(String eoomSubstr8) {
		this.eoomSubstr8 = eoomSubstr8;
		addValidField("eoomSubstr8");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOM_SUBSTR7")
	public String getEoomSubstr7() {
		return eoomSubstr7;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoomSubstr7(String eoomSubstr7) {
		this.eoomSubstr7 = eoomSubstr7;
		addValidField("eoomSubstr7");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOM_SUBDATE1")
	public Date getEoomSubdate1() {
		return eoomSubdate1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoomSubdate1(Date eoomSubdate1) {
		this.eoomSubdate1 = eoomSubdate1;
		addValidField("eoomSubdate1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOM_SUBDATE2")
	public Date getEoomSubdate2() {
		return eoomSubdate2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoomSubdate2(Date eoomSubdate2) {
		this.eoomSubdate2 = eoomSubdate2;
		addValidField("eoomSubdate2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOM_SUBDATE5")
	public Date getEoomSubdate5() {
		return eoomSubdate5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoomSubdate5(Date eoomSubdate5) {
		this.eoomSubdate5 = eoomSubdate5;
		addValidField("eoomSubdate5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOM_SUBDATE4")
	public Date getEoomSubdate4() {
		return eoomSubdate4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoomSubdate4(Date eoomSubdate4) {
		this.eoomSubdate4 = eoomSubdate4;
		addValidField("eoomSubdate4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOM_SUBDATE3")
	public Date getEoomSubdate3() {
		return eoomSubdate3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoomSubdate3(Date eoomSubdate3) {
		this.eoomSubdate3 = eoomSubdate3;
		addValidField("eoomSubdate3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOM_SUBNUM3")
	public Integer getEoomSubnum3() {
		return eoomSubnum3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoomSubnum3(Integer eoomSubnum3) {
		this.eoomSubnum3 = eoomSubnum3;
		addValidField("eoomSubnum3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOM_SUBNUM2")
	public Double getEoomSubnum2() {
		return eoomSubnum2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoomSubnum2(Double eoomSubnum2) {
		this.eoomSubnum2 = eoomSubnum2;
		addValidField("eoomSubnum2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "EOOM_SUBNUM1")
	public Integer getEoomSubnum1() {
		return eoomSubnum1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEoomSubnum1(Integer eoomSubnum1) {
		this.eoomSubnum1 = eoomSubnum1;
		addValidField("eoomSubnum1");
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
	
	
	@Column(name = "EOOM_ECMS_EOOM_ID")
	public Integer getEoomEcmsEoomId() {
		return eoomEcmsEoomId;
	}

	public void setEoomEcmsEoomId(Integer eoomEcmsEoomId) {
		this.eoomEcmsEoomId = eoomEcmsEoomId;
		addValidField("eoomEcmsEoomId");
	}
	
	/**
	 * Get 物料行号
	 */
	@Column(name = "EOOM_LINENO")
	public String getEoomLineno() {
		return eoomLineno;
	}

	/**
	 * Set 物料行号
	 */
	public void setEoomLineno(String eoomLineno) {
		this.eoomLineno = eoomLineno;
		addValidField("eoomLineno");
	}

}