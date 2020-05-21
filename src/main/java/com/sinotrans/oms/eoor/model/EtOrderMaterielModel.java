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
 * Model class for EtOrderMateriel
 */
@Entity
@Table(name = "ET_ORDER_MATERIEL")
public class EtOrderMaterielModel extends BaseModel implements OperationLog {

	//订单物料表主键
		private Integer etomId;
		//订单表主键
		private Integer etomEtorId;
		//物料
		private Integer etomEbmaId;
		//物料代码
		private String etomMaterialNo;
		//物料名称
		private String etomEbmaNameCn;
		//规格ID
		private Integer etomEbtpId;
		//规格
		private String etomEbtpModel;
		//包装
		private String etomEbtpPackage;
		//包装类型
		private String etomEbtpPackageType;
		//物料特性
		private String etomType;
		//是否温控
		private String etomEbmaIsTemperature;
		//温度范围
		private String etomEbmaFeatures;
		//危险品等级
		private String etomEbmaDgClass;
		//物料状态
		private String etomStatus;
		//物料数量
		private Integer etomNumber;
		//数量单位
		private String etomNumberUnit;
		//物料件数
		private Integer etomQuantity;
		//件数单位
		private String etomQuantityUnit;
		//批次
		private String etomBatch;
		//国家危险品编号
		private String etomEbmaDgCode;
		//UN
		private String etomEbmaUnNo;
		//毛重
		private Double etomGrossWeight;
		//净重
		private Double etomNetWeight;
		//体积
		private Double etomVolume;
		//产品单价
		private Integer etomPrice;
		//预留字段
		private String etomSubstr1;
		//预留字段
		private String etomSubstr2;
		//预留字段
		private String etomSubstr3;
		//预留字段
		private String etomSubstr4;
		//预留字段
		private String etomSubstr5;
		//预留字段
		private String etomSubstr6;
		//预留字段
		private String etomSubstr8;
		//预留字段
		private String etomSubstr7;
		//预留字段
		private Date etomSubdate1;
		//预留字段
		private Date etomSubdate2;
		//预留字段
		private Date etomSubdate5;
		//预留字段
		private Date etomSubdate4;
		//预留字段
		private Date etomSubdate3;
		//预留字段
		private Integer etomSubnum3;
		//预留字段
		private Integer etomSubnum2;
		//预留字段
		private Integer etomSubnum1;
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
		//OMS数据来源ID
		private String etomFkSysId;
		//用于标记数据的来源系统
		private String etomSourceSysFalg;
		private Long etomInnerMrId;// 增加内部委托物料表主键
		//电商订单物料主键
		private Integer etomEcmsEoomId;
		
		//物料行号
		private String etomLineno;
		
		

		@Column(name = "ETOM_INNER_MR_ID")
		public Long getEtomInnerMrId() {
			return etomInnerMrId;
		}

		public void setEtomInnerMrId(Long etomInnerMrId) {
			this.etomInnerMrId = etomInnerMrId;
			addValidField("etomInnerMrId");
		}

		/**
		 * Get 订单物料表主键
		 */
		@Column(name = "ETOM_ID")
		@Id @GeneratedValue(strategy=GenerationType.AUTO)
		public Integer getEtomId() {
			return etomId;
		}

		/**
		 * Set 订单物料表主键
		 */
		public void setEtomId(Integer etomId) {
			this.etomId = etomId;
			addValidField("etomId");
		}

		/**
		 * Get 订单表主键
		 */
		@Column(name = "ETOM_ETOR_ID")
		public Integer getEtomEtorId() {
			return etomEtorId;
		}

		/**
		 * Set 订单表主键
		 */
		public void setEtomEtorId(Integer etomEtorId) {
			this.etomEtorId = etomEtorId;
			addValidField("etomEtorId");
		}

		/**
		 * Get 物料
		 */
		@Column(name = "ETOM_EBMA_ID")
		public Integer getEtomEbmaId() {
			return etomEbmaId;
		}

		/**
		 * Set 物料
		 */
		public void setEtomEbmaId(Integer etomEbmaId) {
			this.etomEbmaId = etomEbmaId;
			addValidField("etomEbmaId");
		}

		/**
		 * Get 物料代码
		 */
		@Column(name = "ETOM_MATERIAL_NO")
		public String getEtomMaterialNo() {
			return etomMaterialNo;
		}

		/**
		 * Set 物料代码
		 */
		public void setEtomMaterialNo(String etomMaterialNo) {
			this.etomMaterialNo = etomMaterialNo;
			addValidField("etomMaterialNo");
		}

		/**
		 * Get 物料名称
		 */
		@Column(name = "ETOM_EBMA_NAME_CN")
		public String getEtomEbmaNameCn() {
			return etomEbmaNameCn;
		}

		/**
		 * Set 物料名称
		 */
		public void setEtomEbmaNameCn(String etomEbmaNameCn) {
			this.etomEbmaNameCn = etomEbmaNameCn;
			addValidField("etomEbmaNameCn");
		}

		/**
		 * Get 规格ID
		 */
		@Column(name = "ETOM_EBTP_ID")
		public Integer getEtomEbtpId() {
			return etomEbtpId;
		}

		/**
		 * Set 规格ID
		 */
		public void setEtomEbtpId(Integer etomEbtpId) {
			this.etomEbtpId = etomEbtpId;
			addValidField("etomEbtpId");
		}

		/**
		 * Get 规格
		 */
		@Column(name = "ETOM_EBTP_MODEL")
		public String getEtomEbtpModel() {
			return etomEbtpModel;
		}

		/**
		 * Set 规格
		 */
		public void setEtomEbtpModel(String etomEbtpModel) {
			this.etomEbtpModel = etomEbtpModel;
			addValidField("etomEbtpModel");
		}

		/**
		 * Get 包装
		 */
		@Column(name = "ETOM_EBTP_PACKAGE")
		public String getEtomEbtpPackage() {
			return etomEbtpPackage;
		}

		/**
		 * Set 包装
		 */
		public void setEtomEbtpPackage(String etomEbtpPackage) {
			this.etomEbtpPackage = etomEbtpPackage;
			addValidField("etomEbtpPackage");
		}

		/**
		 * Get 包装类型
		 */
		@Column(name = "ETOM_EBTP_PACKAGE_TYPE")
		public String getEtomEbtpPackageType() {
			return etomEbtpPackageType;
		}

		/**
		 * Set 包装类型
		 */
		public void setEtomEbtpPackageType(String etomEbtpPackageType) {
			this.etomEbtpPackageType = etomEbtpPackageType;
			addValidField("etomEbtpPackageType");
		}

		/**
		 * Get 物料特性
		 */
		@Column(name = "ETOM_TYPE")
		public String getEtomType() {
			return etomType;
		}

		/**
		 * Set 物料特性
		 */
		public void setEtomType(String etomType) {
			this.etomType = etomType;
			addValidField("etomType");
		}

		/**
		 * Get 是否温控
		 */
		@Column(name = "ETOM_EBMA_IS_TEMPERATURE")
		public String getEtomEbmaIsTemperature() {
			return etomEbmaIsTemperature;
		}

		/**
		 * Set 是否温控
		 */
		public void setEtomEbmaIsTemperature(String etomEbmaIsTemperature) {
			this.etomEbmaIsTemperature = etomEbmaIsTemperature;
			addValidField("etomEbmaIsTemperature");
		}

		/**
		 * Get 温度范围
		 */
		@Column(name = "ETOM_EBMA_FEATURES")
		public String getEtomEbmaFeatures() {
			return etomEbmaFeatures;
		}

		/**
		 * Set 温度范围
		 */
		public void setEtomEbmaFeatures(String etomEbmaFeatures) {
			this.etomEbmaFeatures = etomEbmaFeatures;
			addValidField("etomEbmaFeatures");
		}

		/**
		 * Get 危险品等级
		 */
		@Column(name = "ETOM_EBMA_DG_CLASS")
		public String getEtomEbmaDgClass() {
			return etomEbmaDgClass;
		}

		/**
		 * Set 危险品等级
		 */
		public void setEtomEbmaDgClass(String etomEbmaDgClass) {
			this.etomEbmaDgClass = etomEbmaDgClass;
			addValidField("etomEbmaDgClass");
		}

		/**
		 * Get 物料状态
		 */
		@Column(name = "ETOM_STATUS")
		public String getEtomStatus() {
			return etomStatus;
		}

		/**
		 * Set 物料状态
		 */
		public void setEtomStatus(String etomStatus) {
			this.etomStatus = etomStatus;
			addValidField("etomStatus");
		}

		/**
		 * Get 物料数量
		 */
		@Column(name = "ETOM_NUMBER")
		public Integer getEtomNumber() {
			return etomNumber;
		}

		/**
		 * Set 物料数量
		 */
		public void setEtomNumber(Integer etomNumber) {
			this.etomNumber = etomNumber;
			addValidField("etomNumber");
		}

		/**
		 * Get 数量单位
		 */
		@Column(name = "ETOM_NUMBER_UNIT")
		public String getEtomNumberUnit() {
			return etomNumberUnit;
		}

		/**
		 * Set 数量单位
		 */
		public void setEtomNumberUnit(String etomNumberUnit) {
			this.etomNumberUnit = etomNumberUnit;
			addValidField("etomNumberUnit");
		}

		/**
		 * Get 物料件数
		 */
		@Column(name = "ETOM_QUANTITY")
		public Integer getEtomQuantity() {
			return etomQuantity;
		}

		/**
		 * Set 物料件数
		 */
		public void setEtomQuantity(Integer etomQuantity) {
			this.etomQuantity = etomQuantity;
			addValidField("etomQuantity");
		}

		/**
		 * Get 件数单位
		 */
		@Column(name = "ETOM_QUANTITY_UNIT")
		public String getEtomQuantityUnit() {
			return etomQuantityUnit;
		}

		/**
		 * Set 件数单位
		 */
		public void setEtomQuantityUnit(String etomQuantityUnit) {
			this.etomQuantityUnit = etomQuantityUnit;
			addValidField("etomQuantityUnit");
		}

		/**
		 * Get 批次
		 */
		@Column(name = "ETOM_BATCH")
		public String getEtomBatch() {
			return etomBatch;
		}

		/**
		 * Set 批次
		 */
		public void setEtomBatch(String etomBatch) {
			this.etomBatch = etomBatch;
			addValidField("etomBatch");
		}

		/**
		 * Get 国家危险品编号
		 */
		@Column(name = "ETOM_EBMA_DG_CODE")
		public String getEtomEbmaDgCode() {
			return etomEbmaDgCode;
		}

		/**
		 * Set 国家危险品编号
		 */
		public void setEtomEbmaDgCode(String etomEbmaDgCode) {
			this.etomEbmaDgCode = etomEbmaDgCode;
			addValidField("etomEbmaDgCode");
		}

		/**
		 * Get UN
		 * NO
		 */
		@Column(name = "ETOM_EBMA_UN_NO")
		public String getEtomEbmaUnNo() {
			return etomEbmaUnNo;
		}

		/**
		 * Set UN
		 * NO
		 */
		public void setEtomEbmaUnNo(String etomEbmaUnNo) {
			this.etomEbmaUnNo = etomEbmaUnNo;
			addValidField("etomEbmaUnNo");
		}

		/**
		 * Get 毛重
		 */
		@Column(name = "ETOM_GROSS_WEIGHT")
		public Double getEtomGrossWeight() {
			return etomGrossWeight;
		}

		/**
		 * Set 毛重
		 */
		public void setEtomGrossWeight(Double etomGrossWeight) {
			this.etomGrossWeight = etomGrossWeight;
			addValidField("etomGrossWeight");
		}

		/**
		 * Get 净重
		 */
		@Column(name = "ETOM_NET_WEIGHT")
		public Double getEtomNetWeight() {
			return etomNetWeight;
		}

		/**
		 * Set 净重
		 */
		public void setEtomNetWeight(Double etomNetWeight) {
			this.etomNetWeight = etomNetWeight;
			addValidField("etomNetWeight");
		}

		/**
		 * Get 体积
		 */
		@Column(name = "ETOM_VOLUME")
		public Double getEtomVolume() {
			return etomVolume;
		}

		/**
		 * Set 体积
		 */
		public void setEtomVolume(Double etomVolume) {
			this.etomVolume = etomVolume;
			addValidField("etomVolume");
		}

		/**
		 * Get 产品单价
		 */
		@Column(name = "ETOM_PRICE")
		public Integer getEtomPrice() {
			return etomPrice;
		}

		/**
		 * Set 产品单价
		 */
		public void setEtomPrice(Integer etomPrice) {
			this.etomPrice = etomPrice;
			addValidField("etomPrice");
		}

		/**
		 * Get 预留字段
		 */
		@Column(name = "ETOM_SUBSTR1")
		public String getEtomSubstr1() {
			return etomSubstr1;
		}

		/**
		 * Set 预留字段
		 */
		public void setEtomSubstr1(String etomSubstr1) {
			this.etomSubstr1 = etomSubstr1;
			addValidField("etomSubstr1");
		}

		/**
		 * Get 预留字段
		 */
		@Column(name = "ETOM_SUBSTR2")
		public String getEtomSubstr2() {
			return etomSubstr2;
		}

		/**
		 * Set 预留字段
		 */
		public void setEtomSubstr2(String etomSubstr2) {
			this.etomSubstr2 = etomSubstr2;
			addValidField("etomSubstr2");
		}

		/**
		 * Get 预留字段
		 */
		@Column(name = "ETOM_SUBSTR3")
		public String getEtomSubstr3() {
			return etomSubstr3;
		}

		/**
		 * Set 预留字段
		 */
		public void setEtomSubstr3(String etomSubstr3) {
			this.etomSubstr3 = etomSubstr3;
			addValidField("etomSubstr3");
		}

		/**
		 * Get 预留字段
		 */
		@Column(name = "ETOM_SUBSTR4")
		public String getEtomSubstr4() {
			return etomSubstr4;
		}

		/**
		 * Set 预留字段
		 */
		public void setEtomSubstr4(String etomSubstr4) {
			this.etomSubstr4 = etomSubstr4;
			addValidField("etomSubstr4");
		}

		/**
		 * Get 预留字段
		 */
		@Column(name = "ETOM_SUBSTR5")
		public String getEtomSubstr5() {
			return etomSubstr5;
		}

		/**
		 * Set 预留字段
		 */
		public void setEtomSubstr5(String etomSubstr5) {
			this.etomSubstr5 = etomSubstr5;
			addValidField("etomSubstr5");
		}

		/**
		 * Get 预留字段
		 */
		@Column(name = "ETOM_SUBSTR6")
		public String getEtomSubstr6() {
			return etomSubstr6;
		}

		/**
		 * Set 预留字段
		 */
		public void setEtomSubstr6(String etomSubstr6) {
			this.etomSubstr6 = etomSubstr6;
			addValidField("etomSubstr6");
		}

		/**
		 * Get 预留字段
		 */
		@Column(name = "ETOM_SUBSTR8")
		public String getEtomSubstr8() {
			return etomSubstr8;
		}

		/**
		 * Set 预留字段
		 */
		public void setEtomSubstr8(String etomSubstr8) {
			this.etomSubstr8 = etomSubstr8;
			addValidField("etomSubstr8");
		}

		/**
		 * Get 预留字段
		 */
		@Column(name = "ETOM_SUBSTR7")
		public String getEtomSubstr7() {
			return etomSubstr7;
		}

		/**
		 * Set 预留字段
		 */
		public void setEtomSubstr7(String etomSubstr7) {
			this.etomSubstr7 = etomSubstr7;
			addValidField("etomSubstr7");
		}

		/**
		 * Get 预留字段
		 */
		@Column(name = "ETOM_SUBDATE1")
		public Date getEtomSubdate1() {
			return etomSubdate1;
		}

		/**
		 * Set 预留字段
		 */
		public void setEtomSubdate1(Date etomSubdate1) {
			this.etomSubdate1 = etomSubdate1;
			addValidField("etomSubdate1");
		}

		/**
		 * Get 预留字段
		 */
		@Column(name = "ETOM_SUBDATE2")
		public Date getEtomSubdate2() {
			return etomSubdate2;
		}

		/**
		 * Set 预留字段
		 */
		public void setEtomSubdate2(Date etomSubdate2) {
			this.etomSubdate2 = etomSubdate2;
			addValidField("etomSubdate2");
		}

		/**
		 * Get 预留字段
		 */
		@Column(name = "ETOM_SUBDATE5")
		public Date getEtomSubdate5() {
			return etomSubdate5;
		}

		/**
		 * Set 预留字段
		 */
		public void setEtomSubdate5(Date etomSubdate5) {
			this.etomSubdate5 = etomSubdate5;
			addValidField("etomSubdate5");
		}

		/**
		 * Get 预留字段
		 */
		@Column(name = "ETOM_SUBDATE4")
		public Date getEtomSubdate4() {
			return etomSubdate4;
		}

		/**
		 * Set 预留字段
		 */
		public void setEtomSubdate4(Date etomSubdate4) {
			this.etomSubdate4 = etomSubdate4;
			addValidField("etomSubdate4");
		}

		/**
		 * Get 预留字段
		 */
		@Column(name = "ETOM_SUBDATE3")
		public Date getEtomSubdate3() {
			return etomSubdate3;
		}

		/**
		 * Set 预留字段
		 */
		public void setEtomSubdate3(Date etomSubdate3) {
			this.etomSubdate3 = etomSubdate3;
			addValidField("etomSubdate3");
		}

		/**
		 * Get 预留字段
		 */
		@Column(name = "ETOM_SUBNUM3")
		public Integer getEtomSubnum3() {
			return etomSubnum3;
		}

		/**
		 * Set 预留字段
		 */
		public void setEtomSubnum3(Integer etomSubnum3) {
			this.etomSubnum3 = etomSubnum3;
			addValidField("etomSubnum3");
		}

		/**
		 * Get 预留字段
		 */
		@Column(name = "ETOM_SUBNUM2")
		public Integer getEtomSubnum2() {
			return etomSubnum2;
		}

		/**
		 * Set 预留字段
		 */
		public void setEtomSubnum2(Integer etomSubnum2) {
			this.etomSubnum2 = etomSubnum2;
			addValidField("etomSubnum2");
		}

		/**
		 * Get 预留字段
		 */
		@Column(name = "ETOM_SUBNUM1")
		public Integer getEtomSubnum1() {
			return etomSubnum1;
		}

		/**
		 * Set 预留字段
		 */
		public void setEtomSubnum1(Integer etomSubnum1) {
			this.etomSubnum1 = etomSubnum1;
			addValidField("etomSubnum1");
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

		@Column(name = "ETOM_FK_SYS_ID")
		public String getEtomFkSysId() {
			return etomFkSysId;
		}

		public void setEtomFkSysId(String etomFkSysId) {
			this.etomFkSysId = etomFkSysId;
			addValidField("etomFkSysId");
		}
		
		/**
		 * Get 用于标记数据的来源系统
		 */
		@Column(name = "ETOM_SOURCE_SYS_FALG")
		public String getEtomSourceSysFalg() {
			return etomSourceSysFalg;
		}

		/**
		 * Set 用于标记数据的来源系统
		 */
		public void setEtomSourceSysFalg(String etomSourceSysFalg) {
			this.etomSourceSysFalg = etomSourceSysFalg;
			addValidField("etomSourceSysFalg");
		}

		@Column(name = "ETOM_ECMS_EOOM_ID")
		public Integer getEtomEcmsEoomId() {
			return etomEcmsEoomId;
		}

		public void setEtomEcmsEoomId(Integer etomEcmsEoomId) {
			this.etomEcmsEoomId = etomEcmsEoomId;
			addValidField("etomEcmsEoomId");
		}

		@Column(name = "ETOM_LINENO")
		public String getEtomLineno() {
			return etomLineno;
		}

		public void setEtomLineno(String etomLineno) {
			this.etomLineno = etomLineno;
			addValidField("etomLineno");
		}

}
