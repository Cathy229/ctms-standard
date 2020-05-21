package com.sinotrans.oms.businessrequest.model;

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
 * Model class for EoEoom2Eooc
 */
@Entity
@Table(name = "EO_EOOM_2_EOOC")
public class EoEoom2EoocModel extends BaseModel implements OperationLog {

	//eomcId
	private Long eomcId;
	//eomcEordId
	private Long eomcEordId;
	//eomcEoocId
	private Long eomcEoocId;
	//eomcContainerNo
	private String eomcContainerNo;
	//eomcContainerType
	private String eomcContainerType;
	//eomcWeight
	private Long eomcWeight;
	//eomcSubstr1
	private String eomcSubstr1;
	//eomcSubstr2
	private String eomcSubstr2;
	//eomcSubstr3
	private String eomcSubstr3;
	//eomcSubstr4
	private String eomcSubstr4;
	//eomcSubstr5
	private String eomcSubstr5;
	//eomcSubstr6
	private String eomcSubstr6;
	//eomcSubstr7
	private String eomcSubstr7;
	//eomcSubstr8
	private String eomcSubstr8;
	//eomcSubstr9
	private String eomcSubstr9;
	//eomcSubstr10
	private String eomcSubstr10;
	//eomcSubstr11
	private String eomcSubstr11;
	//eomcSubstr12
	private String eomcSubstr12;
	//eomcSubstr13
	private String eomcSubstr13;
	//eomcSubstr14
	private String eomcSubstr14;
	//eomcSubstr15
	private String eomcSubstr15;
	//eomcSubstr16
	private String eomcSubstr16;
	//eomcSubstr17
	private String eomcSubstr17;
	//eomcSubstr18
	private String eomcSubstr18;
	//eomcSubstr19
	private String eomcSubstr19;
	//eomcSubstr20
	private String eomcSubstr20;
	//eomcSubstr21
	private String eomcSubstr21;
	//eomcSubstr22
	private String eomcSubstr22;
	//eomcSubstr23
	private String eomcSubstr23;
	//eomcSubstr24
	private String eomcSubstr24;
	//eomcSubstr25
	private String eomcSubstr25;
	//eomcSubdate1
	private Date eomcSubdate1;
	//eomcSubdate2
	private Date eomcSubdate2;
	//eomcSubdate3
	private Date eomcSubdate3;
	//eomcSubdate4
	private Date eomcSubdate4;
	//eomcSubdate5
	private Date eomcSubdate5;
	//eomcSubdate6
	private Date eomcSubdate6;
	//eomcSubdate7
	private Date eomcSubdate7;
	//eomcSubdate8
	private Date eomcSubdate8;
	//eomcSubdate9
	private Date eomcSubdate9;
	//eomcSubdate10
	private Date eomcSubdate10;
	//eomcSubnum1
	private Long eomcSubnum1;
	//eomcSubnum2
	private Long eomcSubnum2;
	//eomcSubnum3
	private Long eomcSubnum3;
	//eomcSubnum4
	private Long eomcSubnum4;
	//eomcSubnum5
	private Long eomcSubnum5;
	//eomcSubnum6
	private Long eomcSubnum6;
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
	 * Get eomcId
	 */
	@Column(name = "EOMC_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEomcId() {
		return eomcId;
	}

	/**
	 * Set eomcId
	 */
	public void setEomcId(Long eomcId) {
		this.eomcId = eomcId;
		addValidField("eomcId");
	}

	/**
	 * Get eomcEordId
	 */
	@Column(name = "EOMC_EORD_ID")
	public Long getEomcEordId() {
		return eomcEordId;
	}

	/**
	 * Set eomcEordId
	 */
	public void setEomcEordId(Long eomcEordId) {
		this.eomcEordId = eomcEordId;
		addValidField("eomcEordId");
	}

	/**
	 * Get eomcEoocId
	 */
	@Column(name = "EOMC_EOOC_ID")
	public Long getEomcEoocId() {
		return eomcEoocId;
	}

	/**
	 * Set eomcEoocId
	 */
	public void setEomcEoocId(Long eomcEoocId) {
		this.eomcEoocId = eomcEoocId;
		addValidField("eomcEoocId");
	}

	/**
	 * Get eomcContainerNo
	 */
	@Column(name = "EOMC_CONTAINER_NO")
	public String getEomcContainerNo() {
		return eomcContainerNo;
	}

	/**
	 * Set eomcContainerNo
	 */
	public void setEomcContainerNo(String eomcContainerNo) {
		this.eomcContainerNo = eomcContainerNo;
		addValidField("eomcContainerNo");
	}

	/**
	 * Get eomcContainerType
	 */
	@Column(name = "EOMC_CONTAINER_TYPE")
	public String getEomcContainerType() {
		return eomcContainerType;
	}

	/**
	 * Set eomcContainerType
	 */
	public void setEomcContainerType(String eomcContainerType) {
		this.eomcContainerType = eomcContainerType;
		addValidField("eomcContainerType");
	}

	/**
	 * Get eomcWeight
	 */
	@Column(name = "EOMC_WEIGHT")
	public Long getEomcWeight() {
		return eomcWeight;
	}

	/**
	 * Set eomcWeight
	 */
	public void setEomcWeight(Long eomcWeight) {
		this.eomcWeight = eomcWeight;
		addValidField("eomcWeight");
	}

	/**
	 * Get eomcSubstr1
	 */
	@Column(name = "EOMC_SUBSTR1")
	public String getEomcSubstr1() {
		return eomcSubstr1;
	}

	/**
	 * Set eomcSubstr1
	 */
	public void setEomcSubstr1(String eomcSubstr1) {
		this.eomcSubstr1 = eomcSubstr1;
		addValidField("eomcSubstr1");
	}

	/**
	 * Get eomcSubstr2
	 */
	@Column(name = "EOMC_SUBSTR2")
	public String getEomcSubstr2() {
		return eomcSubstr2;
	}

	/**
	 * Set eomcSubstr2
	 */
	public void setEomcSubstr2(String eomcSubstr2) {
		this.eomcSubstr2 = eomcSubstr2;
		addValidField("eomcSubstr2");
	}

	/**
	 * Get eomcSubstr3
	 */
	@Column(name = "EOMC_SUBSTR3")
	public String getEomcSubstr3() {
		return eomcSubstr3;
	}

	/**
	 * Set eomcSubstr3
	 */
	public void setEomcSubstr3(String eomcSubstr3) {
		this.eomcSubstr3 = eomcSubstr3;
		addValidField("eomcSubstr3");
	}

	/**
	 * Get eomcSubstr4
	 */
	@Column(name = "EOMC_SUBSTR4")
	public String getEomcSubstr4() {
		return eomcSubstr4;
	}

	/**
	 * Set eomcSubstr4
	 */
	public void setEomcSubstr4(String eomcSubstr4) {
		this.eomcSubstr4 = eomcSubstr4;
		addValidField("eomcSubstr4");
	}

	/**
	 * Get eomcSubstr5
	 */
	@Column(name = "EOMC_SUBSTR5")
	public String getEomcSubstr5() {
		return eomcSubstr5;
	}

	/**
	 * Set eomcSubstr5
	 */
	public void setEomcSubstr5(String eomcSubstr5) {
		this.eomcSubstr5 = eomcSubstr5;
		addValidField("eomcSubstr5");
	}

	/**
	 * Get eomcSubstr6
	 */
	@Column(name = "EOMC_SUBSTR6")
	public String getEomcSubstr6() {
		return eomcSubstr6;
	}

	/**
	 * Set eomcSubstr6
	 */
	public void setEomcSubstr6(String eomcSubstr6) {
		this.eomcSubstr6 = eomcSubstr6;
		addValidField("eomcSubstr6");
	}

	/**
	 * Get eomcSubstr7
	 */
	@Column(name = "EOMC_SUBSTR7")
	public String getEomcSubstr7() {
		return eomcSubstr7;
	}

	/**
	 * Set eomcSubstr7
	 */
	public void setEomcSubstr7(String eomcSubstr7) {
		this.eomcSubstr7 = eomcSubstr7;
		addValidField("eomcSubstr7");
	}

	/**
	 * Get eomcSubstr8
	 */
	@Column(name = "EOMC_SUBSTR8")
	public String getEomcSubstr8() {
		return eomcSubstr8;
	}

	/**
	 * Set eomcSubstr8
	 */
	public void setEomcSubstr8(String eomcSubstr8) {
		this.eomcSubstr8 = eomcSubstr8;
		addValidField("eomcSubstr8");
	}

	/**
	 * Get eomcSubstr9
	 */
	@Column(name = "EOMC_SUBSTR9")
	public String getEomcSubstr9() {
		return eomcSubstr9;
	}

	/**
	 * Set eomcSubstr9
	 */
	public void setEomcSubstr9(String eomcSubstr9) {
		this.eomcSubstr9 = eomcSubstr9;
		addValidField("eomcSubstr9");
	}

	/**
	 * Get eomcSubstr10
	 */
	@Column(name = "EOMC_SUBSTR10")
	public String getEomcSubstr10() {
		return eomcSubstr10;
	}

	/**
	 * Set eomcSubstr10
	 */
	public void setEomcSubstr10(String eomcSubstr10) {
		this.eomcSubstr10 = eomcSubstr10;
		addValidField("eomcSubstr10");
	}

	/**
	 * Get eomcSubstr11
	 */
	@Column(name = "EOMC_SUBSTR11")
	public String getEomcSubstr11() {
		return eomcSubstr11;
	}

	/**
	 * Set eomcSubstr11
	 */
	public void setEomcSubstr11(String eomcSubstr11) {
		this.eomcSubstr11 = eomcSubstr11;
		addValidField("eomcSubstr11");
	}

	/**
	 * Get eomcSubstr12
	 */
	@Column(name = "EOMC_SUBSTR12")
	public String getEomcSubstr12() {
		return eomcSubstr12;
	}

	/**
	 * Set eomcSubstr12
	 */
	public void setEomcSubstr12(String eomcSubstr12) {
		this.eomcSubstr12 = eomcSubstr12;
		addValidField("eomcSubstr12");
	}

	/**
	 * Get eomcSubstr13
	 */
	@Column(name = "EOMC_SUBSTR13")
	public String getEomcSubstr13() {
		return eomcSubstr13;
	}

	/**
	 * Set eomcSubstr13
	 */
	public void setEomcSubstr13(String eomcSubstr13) {
		this.eomcSubstr13 = eomcSubstr13;
		addValidField("eomcSubstr13");
	}

	/**
	 * Get eomcSubstr14
	 */
	@Column(name = "EOMC_SUBSTR14")
	public String getEomcSubstr14() {
		return eomcSubstr14;
	}

	/**
	 * Set eomcSubstr14
	 */
	public void setEomcSubstr14(String eomcSubstr14) {
		this.eomcSubstr14 = eomcSubstr14;
		addValidField("eomcSubstr14");
	}

	/**
	 * Get eomcSubstr15
	 */
	@Column(name = "EOMC_SUBSTR15")
	public String getEomcSubstr15() {
		return eomcSubstr15;
	}

	/**
	 * Set eomcSubstr15
	 */
	public void setEomcSubstr15(String eomcSubstr15) {
		this.eomcSubstr15 = eomcSubstr15;
		addValidField("eomcSubstr15");
	}

	/**
	 * Get eomcSubstr16
	 */
	@Column(name = "EOMC_SUBSTR16")
	public String getEomcSubstr16() {
		return eomcSubstr16;
	}

	/**
	 * Set eomcSubstr16
	 */
	public void setEomcSubstr16(String eomcSubstr16) {
		this.eomcSubstr16 = eomcSubstr16;
		addValidField("eomcSubstr16");
	}

	/**
	 * Get eomcSubstr17
	 */
	@Column(name = "EOMC_SUBSTR17")
	public String getEomcSubstr17() {
		return eomcSubstr17;
	}

	/**
	 * Set eomcSubstr17
	 */
	public void setEomcSubstr17(String eomcSubstr17) {
		this.eomcSubstr17 = eomcSubstr17;
		addValidField("eomcSubstr17");
	}

	/**
	 * Get eomcSubstr18
	 */
	@Column(name = "EOMC_SUBSTR18")
	public String getEomcSubstr18() {
		return eomcSubstr18;
	}

	/**
	 * Set eomcSubstr18
	 */
	public void setEomcSubstr18(String eomcSubstr18) {
		this.eomcSubstr18 = eomcSubstr18;
		addValidField("eomcSubstr18");
	}

	/**
	 * Get eomcSubstr19
	 */
	@Column(name = "EOMC_SUBSTR19")
	public String getEomcSubstr19() {
		return eomcSubstr19;
	}

	/**
	 * Set eomcSubstr19
	 */
	public void setEomcSubstr19(String eomcSubstr19) {
		this.eomcSubstr19 = eomcSubstr19;
		addValidField("eomcSubstr19");
	}

	/**
	 * Get eomcSubstr20
	 */
	@Column(name = "EOMC_SUBSTR20")
	public String getEomcSubstr20() {
		return eomcSubstr20;
	}

	/**
	 * Set eomcSubstr20
	 */
	public void setEomcSubstr20(String eomcSubstr20) {
		this.eomcSubstr20 = eomcSubstr20;
		addValidField("eomcSubstr20");
	}

	/**
	 * Get eomcSubstr21
	 */
	@Column(name = "EOMC_SUBSTR21")
	public String getEomcSubstr21() {
		return eomcSubstr21;
	}

	/**
	 * Set eomcSubstr21
	 */
	public void setEomcSubstr21(String eomcSubstr21) {
		this.eomcSubstr21 = eomcSubstr21;
		addValidField("eomcSubstr21");
	}

	/**
	 * Get eomcSubstr22
	 */
	@Column(name = "EOMC_SUBSTR22")
	public String getEomcSubstr22() {
		return eomcSubstr22;
	}

	/**
	 * Set eomcSubstr22
	 */
	public void setEomcSubstr22(String eomcSubstr22) {
		this.eomcSubstr22 = eomcSubstr22;
		addValidField("eomcSubstr22");
	}

	/**
	 * Get eomcSubstr23
	 */
	@Column(name = "EOMC_SUBSTR23")
	public String getEomcSubstr23() {
		return eomcSubstr23;
	}

	/**
	 * Set eomcSubstr23
	 */
	public void setEomcSubstr23(String eomcSubstr23) {
		this.eomcSubstr23 = eomcSubstr23;
		addValidField("eomcSubstr23");
	}

	/**
	 * Get eomcSubstr24
	 */
	@Column(name = "EOMC_SUBSTR24")
	public String getEomcSubstr24() {
		return eomcSubstr24;
	}

	/**
	 * Set eomcSubstr24
	 */
	public void setEomcSubstr24(String eomcSubstr24) {
		this.eomcSubstr24 = eomcSubstr24;
		addValidField("eomcSubstr24");
	}

	/**
	 * Get eomcSubstr25
	 */
	@Column(name = "EOMC_SUBSTR25")
	public String getEomcSubstr25() {
		return eomcSubstr25;
	}

	/**
	 * Set eomcSubstr25
	 */
	public void setEomcSubstr25(String eomcSubstr25) {
		this.eomcSubstr25 = eomcSubstr25;
		addValidField("eomcSubstr25");
	}

	/**
	 * Get eomcSubdate1
	 */
	@Column(name = "EOMC_SUBDATE1")
	public Date getEomcSubdate1() {
		return eomcSubdate1;
	}

	/**
	 * Set eomcSubdate1
	 */
	public void setEomcSubdate1(Date eomcSubdate1) {
		this.eomcSubdate1 = eomcSubdate1;
		addValidField("eomcSubdate1");
	}

	/**
	 * Get eomcSubdate2
	 */
	@Column(name = "EOMC_SUBDATE2")
	public Date getEomcSubdate2() {
		return eomcSubdate2;
	}

	/**
	 * Set eomcSubdate2
	 */
	public void setEomcSubdate2(Date eomcSubdate2) {
		this.eomcSubdate2 = eomcSubdate2;
		addValidField("eomcSubdate2");
	}

	/**
	 * Get eomcSubdate3
	 */
	@Column(name = "EOMC_SUBDATE3")
	public Date getEomcSubdate3() {
		return eomcSubdate3;
	}

	/**
	 * Set eomcSubdate3
	 */
	public void setEomcSubdate3(Date eomcSubdate3) {
		this.eomcSubdate3 = eomcSubdate3;
		addValidField("eomcSubdate3");
	}

	/**
	 * Get eomcSubdate4
	 */
	@Column(name = "EOMC_SUBDATE4")
	public Date getEomcSubdate4() {
		return eomcSubdate4;
	}

	/**
	 * Set eomcSubdate4
	 */
	public void setEomcSubdate4(Date eomcSubdate4) {
		this.eomcSubdate4 = eomcSubdate4;
		addValidField("eomcSubdate4");
	}

	/**
	 * Get eomcSubdate5
	 */
	@Column(name = "EOMC_SUBDATE5")
	public Date getEomcSubdate5() {
		return eomcSubdate5;
	}

	/**
	 * Set eomcSubdate5
	 */
	public void setEomcSubdate5(Date eomcSubdate5) {
		this.eomcSubdate5 = eomcSubdate5;
		addValidField("eomcSubdate5");
	}

	/**
	 * Get eomcSubdate6
	 */
	@Column(name = "EOMC_SUBDATE6")
	public Date getEomcSubdate6() {
		return eomcSubdate6;
	}

	/**
	 * Set eomcSubdate6
	 */
	public void setEomcSubdate6(Date eomcSubdate6) {
		this.eomcSubdate6 = eomcSubdate6;
		addValidField("eomcSubdate6");
	}

	/**
	 * Get eomcSubdate7
	 */
	@Column(name = "EOMC_SUBDATE7")
	public Date getEomcSubdate7() {
		return eomcSubdate7;
	}

	/**
	 * Set eomcSubdate7
	 */
	public void setEomcSubdate7(Date eomcSubdate7) {
		this.eomcSubdate7 = eomcSubdate7;
		addValidField("eomcSubdate7");
	}

	/**
	 * Get eomcSubdate8
	 */
	@Column(name = "EOMC_SUBDATE8")
	public Date getEomcSubdate8() {
		return eomcSubdate8;
	}

	/**
	 * Set eomcSubdate8
	 */
	public void setEomcSubdate8(Date eomcSubdate8) {
		this.eomcSubdate8 = eomcSubdate8;
		addValidField("eomcSubdate8");
	}

	/**
	 * Get eomcSubdate9
	 */
	@Column(name = "EOMC_SUBDATE9")
	public Date getEomcSubdate9() {
		return eomcSubdate9;
	}

	/**
	 * Set eomcSubdate9
	 */
	public void setEomcSubdate9(Date eomcSubdate9) {
		this.eomcSubdate9 = eomcSubdate9;
		addValidField("eomcSubdate9");
	}

	/**
	 * Get eomcSubdate10
	 */
	@Column(name = "EOMC_SUBDATE10")
	public Date getEomcSubdate10() {
		return eomcSubdate10;
	}

	/**
	 * Set eomcSubdate10
	 */
	public void setEomcSubdate10(Date eomcSubdate10) {
		this.eomcSubdate10 = eomcSubdate10;
		addValidField("eomcSubdate10");
	}

	/**
	 * Get eomcSubnum1
	 */
	@Column(name = "EOMC_SUBNUM1")
	public Long getEomcSubnum1() {
		return eomcSubnum1;
	}

	/**
	 * Set eomcSubnum1
	 */
	public void setEomcSubnum1(Long eomcSubnum1) {
		this.eomcSubnum1 = eomcSubnum1;
		addValidField("eomcSubnum1");
	}

	/**
	 * Get eomcSubnum2
	 */
	@Column(name = "EOMC_SUBNUM2")
	public Long getEomcSubnum2() {
		return eomcSubnum2;
	}

	/**
	 * Set eomcSubnum2
	 */
	public void setEomcSubnum2(Long eomcSubnum2) {
		this.eomcSubnum2 = eomcSubnum2;
		addValidField("eomcSubnum2");
	}

	/**
	 * Get eomcSubnum3
	 */
	@Column(name = "EOMC_SUBNUM3")
	public Long getEomcSubnum3() {
		return eomcSubnum3;
	}

	/**
	 * Set eomcSubnum3
	 */
	public void setEomcSubnum3(Long eomcSubnum3) {
		this.eomcSubnum3 = eomcSubnum3;
		addValidField("eomcSubnum3");
	}

	/**
	 * Get eomcSubnum4
	 */
	@Column(name = "EOMC_SUBNUM4")
	public Long getEomcSubnum4() {
		return eomcSubnum4;
	}

	/**
	 * Set eomcSubnum4
	 */
	public void setEomcSubnum4(Long eomcSubnum4) {
		this.eomcSubnum4 = eomcSubnum4;
		addValidField("eomcSubnum4");
	}

	/**
	 * Get eomcSubnum5
	 */
	@Column(name = "EOMC_SUBNUM5")
	public Long getEomcSubnum5() {
		return eomcSubnum5;
	}

	/**
	 * Set eomcSubnum5
	 */
	public void setEomcSubnum5(Long eomcSubnum5) {
		this.eomcSubnum5 = eomcSubnum5;
		addValidField("eomcSubnum5");
	}

	/**
	 * Get eomcSubnum6
	 */
	@Column(name = "EOMC_SUBNUM6")
	public Long getEomcSubnum6() {
		return eomcSubnum6;
	}

	/**
	 * Set eomcSubnum6
	 */
	public void setEomcSubnum6(Long eomcSubnum6) {
		this.eomcSubnum6 = eomcSubnum6;
		addValidField("eomcSubnum6");
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
