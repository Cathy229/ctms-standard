package com.sinotrans.oms.system.model;

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
 * Model class for EsCounter
 */
@Entity
@Table(name = "ES_COUNTER")
public class EsCounterModel extends BaseModel implements OperationLog {

	//escuId
	private Long escuId;
	//escuEscoId
	private Long escuEscoId;
	//escuType
	private String escuType;
	//escuDesc
	private String escuDesc;
	//escuCurrentYear
	private Date escuCurrentYear;
	//escuCurrentMonth
	private Date escuCurrentMonth;
	//当前数值：当前最大数值
	private Integer escuLastCounter;
	//变化数值：递增或递减值
	private Integer escuNextCounter;
	//escuSubstr1
	private String escuSubstr1;
	//escuSubstr2
	private String escuSubstr2;
	//escuSubstr3
	private String escuSubstr3;
	//escuSubstr4
	private String escuSubstr4;
	//escuSubstr5
	private String escuSubstr5;
	//escuSubstr8
	private String escuSubstr8;
	//escuSubstr7
	private String escuSubstr7;
	//escuSubstr6
	private String escuSubstr6;
	//escuSubdate1
	private Date escuSubdate1;
	//escuSubdate5
	private Date escuSubdate5;
	//escuSubdate4
	private Date escuSubdate4;
	//escuSubdate2
	private Date escuSubdate2;
	//escuSubdate3
	private Date escuSubdate3;
	//escuSubnum1
	private Long escuSubnum1;
	//escuSubnum2
	private Long escuSubnum2;
	//escuSubnum3
	private Long escuSubnum3;
	//recVer
	private Long recVer;
	//createTime
	private Date createTime;
	//creator
	private String creator;
	//modifyTime
	private Date modifyTime;
	//modifier
	private String modifier;

	/**
	 * Get escuId
	 */
	@Column(name = "ESCU_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEscuId() {
		return escuId;
	}

	/**
	 * Set escuId
	 */
	public void setEscuId(Long escuId) {
		this.escuId = escuId;
		addValidField("escuId");
	}

	/**
	 * Get escuEscoId
	 */
	@Column(name = "ESCU_ESCO_ID")
	public Long getEscuEscoId() {
		return escuEscoId;
	}

	/**
	 * Set escuEscoId
	 */
	public void setEscuEscoId(Long escuEscoId) {
		this.escuEscoId = escuEscoId;
		addValidField("escuEscoId");
	}

	/**
	 * Get escuType
	 */
	@Column(name = "ESCU_TYPE")
	public String getEscuType() {
		return escuType;
	}

	/**
	 * Set escuType
	 */
	public void setEscuType(String escuType) {
		this.escuType = escuType;
		addValidField("escuType");
	}

	/**
	 * Get escuDesc
	 */
	@Column(name = "ESCU_DESC")
	public String getEscuDesc() {
		return escuDesc;
	}

	/**
	 * Set escuDesc
	 */
	public void setEscuDesc(String escuDesc) {
		this.escuDesc = escuDesc;
		addValidField("escuDesc");
	}

	/**
	 * Get escuCurrentYear
	 */
	@Column(name = "ESCU_CURRENT_YEAR")
	public Date getEscuCurrentYear() {
		return escuCurrentYear;
	}

	/**
	 * Set escuCurrentYear
	 */
	public void setEscuCurrentYear(Date escuCurrentYear) {
		this.escuCurrentYear = escuCurrentYear;
		addValidField("escuCurrentYear");
	}

	/**
	 * Get escuCurrentMonth
	 */
	@Column(name = "ESCU_CURRENT_MONTH")
	public Date getEscuCurrentMonth() {
		return escuCurrentMonth;
	}

	/**
	 * Set escuCurrentMonth
	 */
	public void setEscuCurrentMonth(Date escuCurrentMonth) {
		this.escuCurrentMonth = escuCurrentMonth;
		addValidField("escuCurrentMonth");
	}

	/**
	 * Get escuLastCounter
	 */
	@Column(name = "ESCU_LAST_COUNTER")
	public Integer getEscuLastCounter() {
		return escuLastCounter;
	}

	/**
	 * Set escuLastCounter
	 */
	public void setEscuLastCounter(Integer escuLastCounter) {
		this.escuLastCounter = escuLastCounter;
		addValidField("escuLastCounter");
	}

	/**
	 * Get escuNextCounter
	 */
	@Column(name = "ESCU_NEXT_COUNTER")
	public Integer getEscuNextCounter() {
		return escuNextCounter;
	}

	/**
	 * Set escuNextCounter
	 */
	public void setEscuNextCounter(Integer escuNextCounter) {
		this.escuNextCounter = escuNextCounter;
		addValidField("escuNextCounter");
	}

	/**
	 * Get escuSubstr1
	 */
	@Column(name = "ESCU_SUBSTR1")
	public String getEscuSubstr1() {
		return escuSubstr1;
	}

	/**
	 * Set escuSubstr1
	 */
	public void setEscuSubstr1(String escuSubstr1) {
		this.escuSubstr1 = escuSubstr1;
		addValidField("escuSubstr1");
	}

	/**
	 * Get escuSubstr2
	 */
	@Column(name = "ESCU_SUBSTR2")
	public String getEscuSubstr2() {
		return escuSubstr2;
	}

	/**
	 * Set escuSubstr2
	 */
	public void setEscuSubstr2(String escuSubstr2) {
		this.escuSubstr2 = escuSubstr2;
		addValidField("escuSubstr2");
	}

	/**
	 * Get escuSubstr3
	 */
	@Column(name = "ESCU_SUBSTR3")
	public String getEscuSubstr3() {
		return escuSubstr3;
	}

	/**
	 * Set escuSubstr3
	 */
	public void setEscuSubstr3(String escuSubstr3) {
		this.escuSubstr3 = escuSubstr3;
		addValidField("escuSubstr3");
	}

	/**
	 * Get escuSubstr4
	 */
	@Column(name = "ESCU_SUBSTR4")
	public String getEscuSubstr4() {
		return escuSubstr4;
	}

	/**
	 * Set escuSubstr4
	 */
	public void setEscuSubstr4(String escuSubstr4) {
		this.escuSubstr4 = escuSubstr4;
		addValidField("escuSubstr4");
	}

	/**
	 * Get escuSubstr5
	 */
	@Column(name = "ESCU_SUBSTR5")
	public String getEscuSubstr5() {
		return escuSubstr5;
	}

	/**
	 * Set escuSubstr5
	 */
	public void setEscuSubstr5(String escuSubstr5) {
		this.escuSubstr5 = escuSubstr5;
		addValidField("escuSubstr5");
	}

	/**
	 * Get escuSubstr8
	 */
	@Column(name = "ESCU_SUBSTR8")
	public String getEscuSubstr8() {
		return escuSubstr8;
	}

	/**
	 * Set escuSubstr8
	 */
	public void setEscuSubstr8(String escuSubstr8) {
		this.escuSubstr8 = escuSubstr8;
		addValidField("escuSubstr8");
	}

	/**
	 * Get escuSubstr7
	 */
	@Column(name = "ESCU_SUBSTR7")
	public String getEscuSubstr7() {
		return escuSubstr7;
	}

	/**
	 * Set escuSubstr7
	 */
	public void setEscuSubstr7(String escuSubstr7) {
		this.escuSubstr7 = escuSubstr7;
		addValidField("escuSubstr7");
	}

	/**
	 * Get escuSubstr6
	 */
	@Column(name = "ESCU_SUBSTR6")
	public String getEscuSubstr6() {
		return escuSubstr6;
	}

	/**
	 * Set escuSubstr6
	 */
	public void setEscuSubstr6(String escuSubstr6) {
		this.escuSubstr6 = escuSubstr6;
		addValidField("escuSubstr6");
	}

	/**
	 * Get escuSubdate1
	 */
	@Column(name = "ESCU_SUBDATE1")
	public Date getEscuSubdate1() {
		return escuSubdate1;
	}

	/**
	 * Set escuSubdate1
	 */
	public void setEscuSubdate1(Date escuSubdate1) {
		this.escuSubdate1 = escuSubdate1;
		addValidField("escuSubdate1");
	}

	/**
	 * Get escuSubdate5
	 */
	@Column(name = "ESCU_SUBDATE5")
	public Date getEscuSubdate5() {
		return escuSubdate5;
	}

	/**
	 * Set escuSubdate5
	 */
	public void setEscuSubdate5(Date escuSubdate5) {
		this.escuSubdate5 = escuSubdate5;
		addValidField("escuSubdate5");
	}

	/**
	 * Get escuSubdate4
	 */
	@Column(name = "ESCU_SUBDATE4")
	public Date getEscuSubdate4() {
		return escuSubdate4;
	}

	/**
	 * Set escuSubdate4
	 */
	public void setEscuSubdate4(Date escuSubdate4) {
		this.escuSubdate4 = escuSubdate4;
		addValidField("escuSubdate4");
	}

	/**
	 * Get escuSubdate2
	 */
	@Column(name = "ESCU_SUBDATE2")
	public Date getEscuSubdate2() {
		return escuSubdate2;
	}

	/**
	 * Set escuSubdate2
	 */
	public void setEscuSubdate2(Date escuSubdate2) {
		this.escuSubdate2 = escuSubdate2;
		addValidField("escuSubdate2");
	}

	/**
	 * Get escuSubdate3
	 */
	@Column(name = "ESCU_SUBDATE3")
	public Date getEscuSubdate3() {
		return escuSubdate3;
	}

	/**
	 * Set escuSubdate3
	 */
	public void setEscuSubdate3(Date escuSubdate3) {
		this.escuSubdate3 = escuSubdate3;
		addValidField("escuSubdate3");
	}

	/**
	 * Get escuSubnum1
	 */
	@Column(name = "ESCU_SUBNUM1")
	public Long getEscuSubnum1() {
		return escuSubnum1;
	}

	/**
	 * Set escuSubnum1
	 */
	public void setEscuSubnum1(Long escuSubnum1) {
		this.escuSubnum1 = escuSubnum1;
		addValidField("escuSubnum1");
	}

	/**
	 * Get escuSubnum2
	 */
	@Column(name = "ESCU_SUBNUM2")
	public Long getEscuSubnum2() {
		return escuSubnum2;
	}

	/**
	 * Set escuSubnum2
	 */
	public void setEscuSubnum2(Long escuSubnum2) {
		this.escuSubnum2 = escuSubnum2;
		addValidField("escuSubnum2");
	}

	/**
	 * Get escuSubnum3
	 */
	@Column(name = "ESCU_SUBNUM3")
	public Long getEscuSubnum3() {
		return escuSubnum3;
	}

	/**
	 * Set escuSubnum3
	 */
	public void setEscuSubnum3(Long escuSubnum3) {
		this.escuSubnum3 = escuSubnum3;
		addValidField("escuSubnum3");
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

}
