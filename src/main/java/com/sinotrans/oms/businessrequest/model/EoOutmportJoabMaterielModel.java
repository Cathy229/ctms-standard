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
 * Model class for EoOutmportJoabMateriel
 */
@Entity
@Table(name = "EO_OUTMPORT_JOAB_MATERIEL")
public class EoOutmportJoabMaterielModel extends BaseModel implements OperationLog {

	//eomjId
	private Long eomjId;
	//eomjEoomId
	private Long eomjEoomId;
	//eomjEofoId
	private Long eomjEofoId;
	//eomjCCheck
	private String eomjCCheck;
	//eomjCIsDetentionCargo
	private Long eomjCIsDetentionCargo;
	//eomjCDetentionCargoDate
	private Date eomjCDetentionCargoDate;
	//eomjCIsRelease
	private Long eomjCIsRelease;
	//eomjCReleaseDate
	private Date eomjCReleaseDate;
	//eomjQCheck
	private String eomjQCheck;
	//eomjQIsDetentionCargo
	private Long eomjQIsDetentionCargo;
	//eomjQDetentionCargoDate
	private Date eomjQDetentionCargoDate;
	//eomjQIsRelease
	private Long eomjQIsRelease;
	//eomjQReleaseDate
	private Date eomjQReleaseDate;
	//eomjSubstr1
	private String eomjSubstr1;
	//eomjSubstr2
	private String eomjSubstr2;
	//eomjSubstr3
	private String eomjSubstr3;
	//eomjSubstr4
	private String eomjSubstr4;
	//eomjSubstr5
	private String eomjSubstr5;
	//eomjSubstr6
	private String eomjSubstr6;
	//eomjSubstr7
	private String eomjSubstr7;
	//eomjSubstr8
	private String eomjSubstr8;
	//eomjSubdate1
	private Date eomjSubdate1;
	//eomjSubdate2
	private Date eomjSubdate2;
	//eomjSubdate3
	private Date eomjSubdate3;
	//eomjSubdate4
	private Date eomjSubdate4;
	//eomjSubnum1
	private Long eomjSubnum1;
	//eomjSubnum2
	private Long eomjSubnum2;
	//eomjSubnum3
	private Long eomjSubnum3;
	//eomjSubnum4
	private Long eomjSubnum4;
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
	 * Get eomjId
	 */
	@Column(name = "EOMJ_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEomjId() {
		return eomjId;
	}

	/**
	 * Set eomjId
	 */
	public void setEomjId(Long eomjId) {
		this.eomjId = eomjId;
		addValidField("eomjId");
	}

	/**
	 * Get eomjEoomId
	 */
	@Column(name = "EOMJ_EOOM_ID")
	public Long getEomjEoomId() {
		return eomjEoomId;
	}

	/**
	 * Set eomjEoomId
	 */
	public void setEomjEoomId(Long eomjEoomId) {
		this.eomjEoomId = eomjEoomId;
		addValidField("eomjEoomId");
	}

	/**
	 * Get eomjEofoId
	 */
	@Column(name = "EOMJ_EOFO_ID")
	public Long getEomjEofoId() {
		return eomjEofoId;
	}

	/**
	 * Set eomjEofoId
	 */
	public void setEomjEofoId(Long eomjEofoId) {
		this.eomjEofoId = eomjEofoId;
		addValidField("eomjEofoId");
	}

	/**
	 * Get eomjCCheck
	 */
	@Column(name = "EOMJ_C_CHECK")
	public String getEomjCCheck() {
		return eomjCCheck;
	}

	/**
	 * Set eomjCCheck
	 */
	public void setEomjCCheck(String eomjCCheck) {
		this.eomjCCheck = eomjCCheck;
		addValidField("eomjCCheck");
	}

	/**
	 * Get eomjCIsDetentionCargo
	 */
	@Column(name = "EOMJ_C_IS_DETENTION_CARGO")
	public Long getEomjCIsDetentionCargo() {
		return eomjCIsDetentionCargo;
	}

	/**
	 * Set eomjCIsDetentionCargo
	 */
	public void setEomjCIsDetentionCargo(Long eomjCIsDetentionCargo) {
		this.eomjCIsDetentionCargo = eomjCIsDetentionCargo;
		addValidField("eomjCIsDetentionCargo");
	}

	/**
	 * Get eomjCDetentionCargoDate
	 */
	@Column(name = "EOMJ_C_DETENTION_CARGO_DATE")
	public Date getEomjCDetentionCargoDate() {
		return eomjCDetentionCargoDate;
	}

	/**
	 * Set eomjCDetentionCargoDate
	 */
	public void setEomjCDetentionCargoDate(Date eomjCDetentionCargoDate) {
		this.eomjCDetentionCargoDate = eomjCDetentionCargoDate;
		addValidField("eomjCDetentionCargoDate");
	}

	/**
	 * Get eomjCIsRelease
	 */
	@Column(name = "EOMJ_C_IS_RELEASE")
	public Long getEomjCIsRelease() {
		return eomjCIsRelease;
	}

	/**
	 * Set eomjCIsRelease
	 */
	public void setEomjCIsRelease(Long eomjCIsRelease) {
		this.eomjCIsRelease = eomjCIsRelease;
		addValidField("eomjCIsRelease");
	}

	/**
	 * Get eomjCReleaseDate
	 */
	@Column(name = "EOMJ_C_RELEASE_DATE")
	public Date getEomjCReleaseDate() {
		return eomjCReleaseDate;
	}

	/**
	 * Set eomjCReleaseDate
	 */
	public void setEomjCReleaseDate(Date eomjCReleaseDate) {
		this.eomjCReleaseDate = eomjCReleaseDate;
		addValidField("eomjCReleaseDate");
	}

	/**
	 * Get eomjQCheck
	 */
	@Column(name = "EOMJ_Q_CHECK")
	public String getEomjQCheck() {
		return eomjQCheck;
	}

	/**
	 * Set eomjQCheck
	 */
	public void setEomjQCheck(String eomjQCheck) {
		this.eomjQCheck = eomjQCheck;
		addValidField("eomjQCheck");
	}

	/**
	 * Get eomjQIsDetentionCargo
	 */
	@Column(name = "EOMJ_Q_IS_DETENTION_CARGO")
	public Long getEomjQIsDetentionCargo() {
		return eomjQIsDetentionCargo;
	}

	/**
	 * Set eomjQIsDetentionCargo
	 */
	public void setEomjQIsDetentionCargo(Long eomjQIsDetentionCargo) {
		this.eomjQIsDetentionCargo = eomjQIsDetentionCargo;
		addValidField("eomjQIsDetentionCargo");
	}

	/**
	 * Get eomjQDetentionCargoDate
	 */
	@Column(name = "EOMJ_Q_DETENTION_CARGO_DATE")
	public Date getEomjQDetentionCargoDate() {
		return eomjQDetentionCargoDate;
	}

	/**
	 * Set eomjQDetentionCargoDate
	 */
	public void setEomjQDetentionCargoDate(Date eomjQDetentionCargoDate) {
		this.eomjQDetentionCargoDate = eomjQDetentionCargoDate;
		addValidField("eomjQDetentionCargoDate");
	}

	/**
	 * Get eomjQIsRelease
	 */
	@Column(name = "EOMJ_Q_IS_RELEASE")
	public Long getEomjQIsRelease() {
		return eomjQIsRelease;
	}

	/**
	 * Set eomjQIsRelease
	 */
	public void setEomjQIsRelease(Long eomjQIsRelease) {
		this.eomjQIsRelease = eomjQIsRelease;
		addValidField("eomjQIsRelease");
	}

	/**
	 * Get eomjQReleaseDate
	 */
	@Column(name = "EOMJ_Q_RELEASE_DATE")
	public Date getEomjQReleaseDate() {
		return eomjQReleaseDate;
	}

	/**
	 * Set eomjQReleaseDate
	 */
	public void setEomjQReleaseDate(Date eomjQReleaseDate) {
		this.eomjQReleaseDate = eomjQReleaseDate;
		addValidField("eomjQReleaseDate");
	}

	/**
	 * Get eomjSubstr1
	 */
	@Column(name = "EOMJ_SUBSTR1")
	public String getEomjSubstr1() {
		return eomjSubstr1;
	}

	/**
	 * Set eomjSubstr1
	 */
	public void setEomjSubstr1(String eomjSubstr1) {
		this.eomjSubstr1 = eomjSubstr1;
		addValidField("eomjSubstr1");
	}

	/**
	 * Get eomjSubstr2
	 */
	@Column(name = "EOMJ_SUBSTR2")
	public String getEomjSubstr2() {
		return eomjSubstr2;
	}

	/**
	 * Set eomjSubstr2
	 */
	public void setEomjSubstr2(String eomjSubstr2) {
		this.eomjSubstr2 = eomjSubstr2;
		addValidField("eomjSubstr2");
	}

	/**
	 * Get eomjSubstr3
	 */
	@Column(name = "EOMJ_SUBSTR3")
	public String getEomjSubstr3() {
		return eomjSubstr3;
	}

	/**
	 * Set eomjSubstr3
	 */
	public void setEomjSubstr3(String eomjSubstr3) {
		this.eomjSubstr3 = eomjSubstr3;
		addValidField("eomjSubstr3");
	}

	/**
	 * Get eomjSubstr4
	 */
	@Column(name = "EOMJ_SUBSTR4")
	public String getEomjSubstr4() {
		return eomjSubstr4;
	}

	/**
	 * Set eomjSubstr4
	 */
	public void setEomjSubstr4(String eomjSubstr4) {
		this.eomjSubstr4 = eomjSubstr4;
		addValidField("eomjSubstr4");
	}

	/**
	 * Get eomjSubstr5
	 */
	@Column(name = "EOMJ_SUBSTR5")
	public String getEomjSubstr5() {
		return eomjSubstr5;
	}

	/**
	 * Set eomjSubstr5
	 */
	public void setEomjSubstr5(String eomjSubstr5) {
		this.eomjSubstr5 = eomjSubstr5;
		addValidField("eomjSubstr5");
	}

	/**
	 * Get eomjSubstr6
	 */
	@Column(name = "EOMJ_SUBSTR6")
	public String getEomjSubstr6() {
		return eomjSubstr6;
	}

	/**
	 * Set eomjSubstr6
	 */
	public void setEomjSubstr6(String eomjSubstr6) {
		this.eomjSubstr6 = eomjSubstr6;
		addValidField("eomjSubstr6");
	}

	/**
	 * Get eomjSubstr7
	 */
	@Column(name = "EOMJ_SUBSTR7")
	public String getEomjSubstr7() {
		return eomjSubstr7;
	}

	/**
	 * Set eomjSubstr7
	 */
	public void setEomjSubstr7(String eomjSubstr7) {
		this.eomjSubstr7 = eomjSubstr7;
		addValidField("eomjSubstr7");
	}

	/**
	 * Get eomjSubstr8
	 */
	@Column(name = "EOMJ_SUBSTR8")
	public String getEomjSubstr8() {
		return eomjSubstr8;
	}

	/**
	 * Set eomjSubstr8
	 */
	public void setEomjSubstr8(String eomjSubstr8) {
		this.eomjSubstr8 = eomjSubstr8;
		addValidField("eomjSubstr8");
	}

	/**
	 * Get eomjSubdate1
	 */
	@Column(name = "EOMJ_SUBDATE1")
	public Date getEomjSubdate1() {
		return eomjSubdate1;
	}

	/**
	 * Set eomjSubdate1
	 */
	public void setEomjSubdate1(Date eomjSubdate1) {
		this.eomjSubdate1 = eomjSubdate1;
		addValidField("eomjSubdate1");
	}

	/**
	 * Get eomjSubdate2
	 */
	@Column(name = "EOMJ_SUBDATE2")
	public Date getEomjSubdate2() {
		return eomjSubdate2;
	}

	/**
	 * Set eomjSubdate2
	 */
	public void setEomjSubdate2(Date eomjSubdate2) {
		this.eomjSubdate2 = eomjSubdate2;
		addValidField("eomjSubdate2");
	}

	/**
	 * Get eomjSubdate3
	 */
	@Column(name = "EOMJ_SUBDATE3")
	public Date getEomjSubdate3() {
		return eomjSubdate3;
	}

	/**
	 * Set eomjSubdate3
	 */
	public void setEomjSubdate3(Date eomjSubdate3) {
		this.eomjSubdate3 = eomjSubdate3;
		addValidField("eomjSubdate3");
	}

	/**
	 * Get eomjSubdate4
	 */
	@Column(name = "EOMJ_SUBDATE4")
	public Date getEomjSubdate4() {
		return eomjSubdate4;
	}

	/**
	 * Set eomjSubdate4
	 */
	public void setEomjSubdate4(Date eomjSubdate4) {
		this.eomjSubdate4 = eomjSubdate4;
		addValidField("eomjSubdate4");
	}

	/**
	 * Get eomjSubnum1
	 */
	@Column(name = "EOMJ_SUBNUM1")
	public Long getEomjSubnum1() {
		return eomjSubnum1;
	}

	/**
	 * Set eomjSubnum1
	 */
	public void setEomjSubnum1(Long eomjSubnum1) {
		this.eomjSubnum1 = eomjSubnum1;
		addValidField("eomjSubnum1");
	}

	/**
	 * Get eomjSubnum2
	 */
	@Column(name = "EOMJ_SUBNUM2")
	public Long getEomjSubnum2() {
		return eomjSubnum2;
	}

	/**
	 * Set eomjSubnum2
	 */
	public void setEomjSubnum2(Long eomjSubnum2) {
		this.eomjSubnum2 = eomjSubnum2;
		addValidField("eomjSubnum2");
	}

	/**
	 * Get eomjSubnum3
	 */
	@Column(name = "EOMJ_SUBNUM3")
	public Long getEomjSubnum3() {
		return eomjSubnum3;
	}

	/**
	 * Set eomjSubnum3
	 */
	public void setEomjSubnum3(Long eomjSubnum3) {
		this.eomjSubnum3 = eomjSubnum3;
		addValidField("eomjSubnum3");
	}

	/**
	 * Get eomjSubnum4
	 */
	@Column(name = "EOMJ_SUBNUM4")
	public Long getEomjSubnum4() {
		return eomjSubnum4;
	}

	/**
	 * Set eomjSubnum4
	 */
	public void setEomjSubnum4(Long eomjSubnum4) {
		this.eomjSubnum4 = eomjSubnum4;
		addValidField("eomjSubnum4");
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
