package com.sinotrans.oms.eoorder.model;

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
 * Model class for EoImportJoabMateriel
 */
@Entity
@Table(name = "EO_IMPORT_JOAB_MATERIEL")
public class EoImportJoabMaterielModel extends BaseModel implements OperationLog {

	//eoimId
	private Long eoimId;
	//eoimEoomId
	private Long eoimEoomId;
	//eoimEofiId
	private Long eoimEofiId;
	//eoimIsGrantEir
	private Long eoimIsGrantEir;
	//eoimGrantEirDate
	private Date eoimGrantEirDate;
	//eoimIsBackEir
	private Long eoimIsBackEir;
	//eoimBackEirDate
	private Date eoimBackEirDate;
	//eoimCCheck
	private String eoimCCheck;
	//eoimCIsDetentionCargo
	private Long eoimCIsDetentionCargo;
	//eoimCDetentionCargoDate
	private Date eoimCDetentionCargoDate;
	//eoimCIsRelease
	private Long eoimCIsRelease;
	//eoimCReleaseDate
	private Date eoimCReleaseDate;
	//eoimQCheck
	private String eoimQCheck;
	//eoimQIsDetentionCargo
	private Long eoimQIsDetentionCargo;
	//eoimQDetentionCargoDate
	private Date eoimQDetentionCargoDate;
	//eoimQIsRelease
	private Long eoimQIsRelease;
	//eoimQReleaseDate
	private Date eoimQReleaseDate;
	//eoimSubstr1
	private String eoimSubstr1;
	//eoimSubstr2
	private String eoimSubstr2;
	//eoimSubstr3
	private String eoimSubstr3;
	//eoimSubstr4
	private String eoimSubstr4;
	//eoimSubstr5
	private String eoimSubstr5;
	//eoimSubstr6
	private String eoimSubstr6;
	//eoimSubstr7
	private String eoimSubstr7;
	//eoimSubstr8
	private String eoimSubstr8;
	//eoimSubdate1
	private Date eoimSubdate1;
	//eoimSubdate2
	private Date eoimSubdate2;
	//eoimSubdate3
	private Date eoimSubdate3;
	//eoimSubdate4
	private Date eoimSubdate4;
	//eoimSubnum1
	private Long eoimSubnum1;
	//eoimSubnum2
	private Long eoimSubnum2;
	//eoimSubnum3
	private Long eoimSubnum3;
	//eoimSubnum4
	private Long eoimSubnum4;
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
	 * Get eoimId
	 */
	@Column(name = "EOIM_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoimId() {
		return eoimId;
	}

	/**
	 * Set eoimId
	 */
	public void setEoimId(Long eoimId) {
		this.eoimId = eoimId;
		addValidField("eoimId");
	}

	/**
	 * Get eoimEoomId
	 */
	@Column(name = "EOIM_EOOM_ID")
	public Long getEoimEoomId() {
		return eoimEoomId;
	}

	/**
	 * Set eoimEoomId
	 */
	public void setEoimEoomId(Long eoimEoomId) {
		this.eoimEoomId = eoimEoomId;
		addValidField("eoimEoomId");
	}

	/**
	 * Get eoimEofiId
	 */
	@Column(name = "EOIM_EOFI_ID")
	public Long getEoimEofiId() {
		return eoimEofiId;
	}

	/**
	 * Set eoimEofiId
	 */
	public void setEoimEofiId(Long eoimEofiId) {
		this.eoimEofiId = eoimEofiId;
		addValidField("eoimEofiId");
	}

	/**
	 * Get eoimIsGrantEir
	 */
	@Column(name = "EOIM_IS_GRANT_EIR")
	public Long getEoimIsGrantEir() {
		return eoimIsGrantEir;
	}

	/**
	 * Set eoimIsGrantEir
	 */
	public void setEoimIsGrantEir(Long eoimIsGrantEir) {
		this.eoimIsGrantEir = eoimIsGrantEir;
		addValidField("eoimIsGrantEir");
	}

	/**
	 * Get eoimGrantEirDate
	 */
	@Column(name = "EOIM_GRANT_EIR_DATE")
	public Date getEoimGrantEirDate() {
		return eoimGrantEirDate;
	}

	/**
	 * Set eoimGrantEirDate
	 */
	public void setEoimGrantEirDate(Date eoimGrantEirDate) {
		this.eoimGrantEirDate = eoimGrantEirDate;
		addValidField("eoimGrantEirDate");
	}

	/**
	 * Get eoimIsBackEir
	 */
	@Column(name = "EOIM_IS_BACK_EIR")
	public Long getEoimIsBackEir() {
		return eoimIsBackEir;
	}

	/**
	 * Set eoimIsBackEir
	 */
	public void setEoimIsBackEir(Long eoimIsBackEir) {
		this.eoimIsBackEir = eoimIsBackEir;
		addValidField("eoimIsBackEir");
	}

	/**
	 * Get eoimBackEirDate
	 */
	@Column(name = "EOIM_BACK_EIR_DATE")
	public Date getEoimBackEirDate() {
		return eoimBackEirDate;
	}

	/**
	 * Set eoimBackEirDate
	 */
	public void setEoimBackEirDate(Date eoimBackEirDate) {
		this.eoimBackEirDate = eoimBackEirDate;
		addValidField("eoimBackEirDate");
	}

	/**
	 * Get eoimCCheck
	 */
	@Column(name = "EOIM_C_CHECK")
	public String getEoimCCheck() {
		return eoimCCheck;
	}

	/**
	 * Set eoimCCheck
	 */
	public void setEoimCCheck(String eoimCCheck) {
		this.eoimCCheck = eoimCCheck;
		addValidField("eoimCCheck");
	}

	/**
	 * Get eoimCIsDetentionCargo
	 */
	@Column(name = "EOIM_C_IS_DETENTION_CARGO")
	public Long getEoimCIsDetentionCargo() {
		return eoimCIsDetentionCargo;
	}

	/**
	 * Set eoimCIsDetentionCargo
	 */
	public void setEoimCIsDetentionCargo(Long eoimCIsDetentionCargo) {
		this.eoimCIsDetentionCargo = eoimCIsDetentionCargo;
		addValidField("eoimCIsDetentionCargo");
	}

	/**
	 * Get eoimCDetentionCargoDate
	 */
	@Column(name = "EOIM_C_DETENTION_CARGO_DATE")
	public Date getEoimCDetentionCargoDate() {
		return eoimCDetentionCargoDate;
	}

	/**
	 * Set eoimCDetentionCargoDate
	 */
	public void setEoimCDetentionCargoDate(Date eoimCDetentionCargoDate) {
		this.eoimCDetentionCargoDate = eoimCDetentionCargoDate;
		addValidField("eoimCDetentionCargoDate");
	}

	/**
	 * Get eoimCIsRelease
	 */
	@Column(name = "EOIM_C_IS_RELEASE")
	public Long getEoimCIsRelease() {
		return eoimCIsRelease;
	}

	/**
	 * Set eoimCIsRelease
	 */
	public void setEoimCIsRelease(Long eoimCIsRelease) {
		this.eoimCIsRelease = eoimCIsRelease;
		addValidField("eoimCIsRelease");
	}

	/**
	 * Get eoimCReleaseDate
	 */
	@Column(name = "EOIM_C_RELEASE_DATE")
	public Date getEoimCReleaseDate() {
		return eoimCReleaseDate;
	}

	/**
	 * Set eoimCReleaseDate
	 */
	public void setEoimCReleaseDate(Date eoimCReleaseDate) {
		this.eoimCReleaseDate = eoimCReleaseDate;
		addValidField("eoimCReleaseDate");
	}

	/**
	 * Get eoimQCheck
	 */
	@Column(name = "EOIM_Q_CHECK")
	public String getEoimQCheck() {
		return eoimQCheck;
	}

	/**
	 * Set eoimQCheck
	 */
	public void setEoimQCheck(String eoimQCheck) {
		this.eoimQCheck = eoimQCheck;
		addValidField("eoimQCheck");
	}

	/**
	 * Get eoimQIsDetentionCargo
	 */
	@Column(name = "EOIM_Q_IS_DETENTION_CARGO")
	public Long getEoimQIsDetentionCargo() {
		return eoimQIsDetentionCargo;
	}

	/**
	 * Set eoimQIsDetentionCargo
	 */
	public void setEoimQIsDetentionCargo(Long eoimQIsDetentionCargo) {
		this.eoimQIsDetentionCargo = eoimQIsDetentionCargo;
		addValidField("eoimQIsDetentionCargo");
	}

	/**
	 * Get eoimQDetentionCargoDate
	 */
	@Column(name = "EOIM_Q_DETENTION_CARGO_DATE")
	public Date getEoimQDetentionCargoDate() {
		return eoimQDetentionCargoDate;
	}

	/**
	 * Set eoimQDetentionCargoDate
	 */
	public void setEoimQDetentionCargoDate(Date eoimQDetentionCargoDate) {
		this.eoimQDetentionCargoDate = eoimQDetentionCargoDate;
		addValidField("eoimQDetentionCargoDate");
	}

	/**
	 * Get eoimQIsRelease
	 */
	@Column(name = "EOIM_Q_IS_RELEASE")
	public Long getEoimQIsRelease() {
		return eoimQIsRelease;
	}

	/**
	 * Set eoimQIsRelease
	 */
	public void setEoimQIsRelease(Long eoimQIsRelease) {
		this.eoimQIsRelease = eoimQIsRelease;
		addValidField("eoimQIsRelease");
	}

	/**
	 * Get eoimQReleaseDate
	 */
	@Column(name = "EOIM_Q_RELEASE_DATE")
	public Date getEoimQReleaseDate() {
		return eoimQReleaseDate;
	}

	/**
	 * Set eoimQReleaseDate
	 */
	public void setEoimQReleaseDate(Date eoimQReleaseDate) {
		this.eoimQReleaseDate = eoimQReleaseDate;
		addValidField("eoimQReleaseDate");
	}

	/**
	 * Get eoimSubstr1
	 */
	@Column(name = "EOIM_SUBSTR1")
	public String getEoimSubstr1() {
		return eoimSubstr1;
	}

	/**
	 * Set eoimSubstr1
	 */
	public void setEoimSubstr1(String eoimSubstr1) {
		this.eoimSubstr1 = eoimSubstr1;
		addValidField("eoimSubstr1");
	}

	/**
	 * Get eoimSubstr2
	 */
	@Column(name = "EOIM_SUBSTR2")
	public String getEoimSubstr2() {
		return eoimSubstr2;
	}

	/**
	 * Set eoimSubstr2
	 */
	public void setEoimSubstr2(String eoimSubstr2) {
		this.eoimSubstr2 = eoimSubstr2;
		addValidField("eoimSubstr2");
	}

	/**
	 * Get eoimSubstr3
	 */
	@Column(name = "EOIM_SUBSTR3")
	public String getEoimSubstr3() {
		return eoimSubstr3;
	}

	/**
	 * Set eoimSubstr3
	 */
	public void setEoimSubstr3(String eoimSubstr3) {
		this.eoimSubstr3 = eoimSubstr3;
		addValidField("eoimSubstr3");
	}

	/**
	 * Get eoimSubstr4
	 */
	@Column(name = "EOIM_SUBSTR4")
	public String getEoimSubstr4() {
		return eoimSubstr4;
	}

	/**
	 * Set eoimSubstr4
	 */
	public void setEoimSubstr4(String eoimSubstr4) {
		this.eoimSubstr4 = eoimSubstr4;
		addValidField("eoimSubstr4");
	}

	/**
	 * Get eoimSubstr5
	 */
	@Column(name = "EOIM_SUBSTR5")
	public String getEoimSubstr5() {
		return eoimSubstr5;
	}

	/**
	 * Set eoimSubstr5
	 */
	public void setEoimSubstr5(String eoimSubstr5) {
		this.eoimSubstr5 = eoimSubstr5;
		addValidField("eoimSubstr5");
	}

	/**
	 * Get eoimSubstr6
	 */
	@Column(name = "EOIM_SUBSTR6")
	public String getEoimSubstr6() {
		return eoimSubstr6;
	}

	/**
	 * Set eoimSubstr6
	 */
	public void setEoimSubstr6(String eoimSubstr6) {
		this.eoimSubstr6 = eoimSubstr6;
		addValidField("eoimSubstr6");
	}

	/**
	 * Get eoimSubstr7
	 */
	@Column(name = "EOIM_SUBSTR7")
	public String getEoimSubstr7() {
		return eoimSubstr7;
	}

	/**
	 * Set eoimSubstr7
	 */
	public void setEoimSubstr7(String eoimSubstr7) {
		this.eoimSubstr7 = eoimSubstr7;
		addValidField("eoimSubstr7");
	}

	/**
	 * Get eoimSubstr8
	 */
	@Column(name = "EOIM_SUBSTR8")
	public String getEoimSubstr8() {
		return eoimSubstr8;
	}

	/**
	 * Set eoimSubstr8
	 */
	public void setEoimSubstr8(String eoimSubstr8) {
		this.eoimSubstr8 = eoimSubstr8;
		addValidField("eoimSubstr8");
	}

	/**
	 * Get eoimSubdate1
	 */
	@Column(name = "EOIM_SUBDATE1")
	public Date getEoimSubdate1() {
		return eoimSubdate1;
	}

	/**
	 * Set eoimSubdate1
	 */
	public void setEoimSubdate1(Date eoimSubdate1) {
		this.eoimSubdate1 = eoimSubdate1;
		addValidField("eoimSubdate1");
	}

	/**
	 * Get eoimSubdate2
	 */
	@Column(name = "EOIM_SUBDATE2")
	public Date getEoimSubdate2() {
		return eoimSubdate2;
	}

	/**
	 * Set eoimSubdate2
	 */
	public void setEoimSubdate2(Date eoimSubdate2) {
		this.eoimSubdate2 = eoimSubdate2;
		addValidField("eoimSubdate2");
	}

	/**
	 * Get eoimSubdate3
	 */
	@Column(name = "EOIM_SUBDATE3")
	public Date getEoimSubdate3() {
		return eoimSubdate3;
	}

	/**
	 * Set eoimSubdate3
	 */
	public void setEoimSubdate3(Date eoimSubdate3) {
		this.eoimSubdate3 = eoimSubdate3;
		addValidField("eoimSubdate3");
	}

	/**
	 * Get eoimSubdate4
	 */
	@Column(name = "EOIM_SUBDATE4")
	public Date getEoimSubdate4() {
		return eoimSubdate4;
	}

	/**
	 * Set eoimSubdate4
	 */
	public void setEoimSubdate4(Date eoimSubdate4) {
		this.eoimSubdate4 = eoimSubdate4;
		addValidField("eoimSubdate4");
	}

	/**
	 * Get eoimSubnum1
	 */
	@Column(name = "EOIM_SUBNUM1")
	public Long getEoimSubnum1() {
		return eoimSubnum1;
	}

	/**
	 * Set eoimSubnum1
	 */
	public void setEoimSubnum1(Long eoimSubnum1) {
		this.eoimSubnum1 = eoimSubnum1;
		addValidField("eoimSubnum1");
	}

	/**
	 * Get eoimSubnum2
	 */
	@Column(name = "EOIM_SUBNUM2")
	public Long getEoimSubnum2() {
		return eoimSubnum2;
	}

	/**
	 * Set eoimSubnum2
	 */
	public void setEoimSubnum2(Long eoimSubnum2) {
		this.eoimSubnum2 = eoimSubnum2;
		addValidField("eoimSubnum2");
	}

	/**
	 * Get eoimSubnum3
	 */
	@Column(name = "EOIM_SUBNUM3")
	public Long getEoimSubnum3() {
		return eoimSubnum3;
	}

	/**
	 * Set eoimSubnum3
	 */
	public void setEoimSubnum3(Long eoimSubnum3) {
		this.eoimSubnum3 = eoimSubnum3;
		addValidField("eoimSubnum3");
	}

	/**
	 * Get eoimSubnum4
	 */
	@Column(name = "EOIM_SUBNUM4")
	public Long getEoimSubnum4() {
		return eoimSubnum4;
	}

	/**
	 * Set eoimSubnum4
	 */
	public void setEoimSubnum4(Long eoimSubnum4) {
		this.eoimSubnum4 = eoimSubnum4;
		addValidField("eoimSubnum4");
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
