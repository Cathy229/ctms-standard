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
 * Model class for EiSchedulingShiporder
 */
@Entity
@Table(name = "EI_SCHEDULING_SHIPORDER")
public class EiSchedulingShiporderModel extends BaseModel implements OperationLog {

	//eissId
	private Integer eissId;
	//eissEscoId
	private Integer eissEscoId;
	//eissEbpjId
	private Integer eissEbpjId;
	//eissShiporderid
	private String eissShiporderid;
	//eissShiporderclass
	private String eissShiporderclass;
	//eissShipordertype
	private String eissShipordertype;
	//eissShiporderpriority
	private String eissShiporderpriority;
	//eissPickuptimewindow
	private String eissPickuptimewindow;
	//eissDeliverytimewindow
	private String eissDeliverytimewindow;
	//eissPickuplocationid
	private String eissPickuplocationid;
	//eissHdFilename
	private String eissHdFilename;
	//eissHdBatchnumber
	private String eissHdBatchnumber;
	//eissHdSymbol
	private String eissHdSymbol;
	//eissHdBeginprocessingtime
	private Date eissHdBeginprocessingtime;
	//eissHdLastmodifiedtime
	private Date eissHdLastmodifiedtime;
	//eissHdInformation
	private String eissHdInformation;
	//eissSubstr1
	private String eissSubstr1;
	//eissSubstr2
	private String eissSubstr2;
	//eissSubstr3
	private String eissSubstr3;
	//eissSubstr4
	private String eissSubstr4;
	//eissSubstr5
	private String eissSubstr5;
	//eissSubstr6
	private String eissSubstr6;
	//eissSubstr7
	private String eissSubstr7;
	//eissSubstr8
	private String eissSubstr8;
	//eissSubstr9
	private String eissSubstr9;
	//eissSubstr10
	private String eissSubstr10;
	//eissSubstr11
	private String eissSubstr11;
	//eissSubstr12
	private String eissSubstr12;
	//eissSubstr13
	private String eissSubstr13;
	//eissSubstr14
	private String eissSubstr14;
	//eissSubstr15
	private String eissSubstr15;
	//eissSubstr16
	private String eissSubstr16;
	//eissSubstr17
	private String eissSubstr17;
	//eissSubstr18
	private String eissSubstr18;
	//eissSubstr19
	private String eissSubstr19;
	//eissSubstr20
	private String eissSubstr20;
	//recVer
	private Integer recVer;
	//creator
	private String creator;
	//createTime
	private Date createTime;
	//modifier
	private String modifier;
	//modifyTime
	private Date modifyTime;
	//eissLadenlength
	private Double eissLadenlength;
	//eissPickupstoplong
	private String eissPickupstoplong;
	//eissPickupstoplat
	private String eissPickupstoplat;
	//eissDeliverstoplong
	private String eissDeliverstoplong;
	//eissDeliverstoplat
	private String eissDeliverstoplat;
	//eissPickuplocationaddress
	private String eissPickuplocationaddress;
	//eissPickuprestrictzoneld
	private String eissPickuprestrictzoneld;
	//eissPickupbusinesszoneld
	private String eissPickupbusinesszoneld;
	//eissPickupduration
	private Integer eissPickupduration;
	//eissDeliverylocationid
	private String eissDeliverylocationid;
	//eissDeliverylocationaddress
	private String eissDeliverylocationaddress;
	//eissDeliveryrestrictzoneld
	private String eissDeliveryrestrictzoneld;
	//eissDeliverybusinesszoneld
	private String eissDeliverybusinesszoneld;
	//eissDeliveryduration
	private Integer eissDeliveryduration;
	//eissAvailablevehiclemodels
	private String eissAvailablevehiclemodels;

	/**
	 * Get eissId
	 */
	@Column(name = "EISS_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getEissId() {
		return eissId;
	}

	/**
	 * Set eissId
	 */
	public void setEissId(Integer eissId) {
		this.eissId = eissId;
		addValidField("eissId");
	}

	/**
	 * Get eissEscoId
	 */
	@Column(name = "EISS_ESCO_ID")
	public Integer getEissEscoId() {
		return eissEscoId;
	}

	/**
	 * Set eissEscoId
	 */
	public void setEissEscoId(Integer eissEscoId) {
		this.eissEscoId = eissEscoId;
		addValidField("eissEscoId");
	}

	/**
	 * Get eissEbpjId
	 */
	@Column(name = "EISS_EBPJ_ID")
	public Integer getEissEbpjId() {
		return eissEbpjId;
	}

	/**
	 * Set eissEbpjId
	 */
	public void setEissEbpjId(Integer eissEbpjId) {
		this.eissEbpjId = eissEbpjId;
		addValidField("eissEbpjId");
	}

	/**
	 * Get eissShiporderid
	 */
	@Column(name = "EISS_SHIPORDERID")
	public String getEissShiporderid() {
		return eissShiporderid;
	}

	/**
	 * Set eissShiporderid
	 */
	public void setEissShiporderid(String eissShiporderid) {
		this.eissShiporderid = eissShiporderid;
		addValidField("eissShiporderid");
	}

	/**
	 * Get eissShiporderclass
	 */
	@Column(name = "EISS_SHIPORDERCLASS")
	public String getEissShiporderclass() {
		return eissShiporderclass;
	}

	/**
	 * Set eissShiporderclass
	 */
	public void setEissShiporderclass(String eissShiporderclass) {
		this.eissShiporderclass = eissShiporderclass;
		addValidField("eissShiporderclass");
	}

	/**
	 * Get eissShipordertype
	 */
	@Column(name = "EISS_SHIPORDERTYPE")
	public String getEissShipordertype() {
		return eissShipordertype;
	}

	/**
	 * Set eissShipordertype
	 */
	public void setEissShipordertype(String eissShipordertype) {
		this.eissShipordertype = eissShipordertype;
		addValidField("eissShipordertype");
	}

	/**
	 * Get eissShiporderpriority
	 */
	@Column(name = "EISS_SHIPORDERPRIORITY")
	public String getEissShiporderpriority() {
		return eissShiporderpriority;
	}

	/**
	 * Set eissShiporderpriority
	 */
	public void setEissShiporderpriority(String eissShiporderpriority) {
		this.eissShiporderpriority = eissShiporderpriority;
		addValidField("eissShiporderpriority");
	}

	/**
	 * Get eissPickuptimewindow
	 */
	@Column(name = "EISS_PICKUPTIMEWINDOW")
	public String getEissPickuptimewindow() {
		return eissPickuptimewindow;
	}

	/**
	 * Set eissPickuptimewindow
	 */
	public void setEissPickuptimewindow(String eissPickuptimewindow) {
		this.eissPickuptimewindow = eissPickuptimewindow;
		addValidField("eissPickuptimewindow");
	}

	/**
	 * Get eissDeliverytimewindow
	 */
	@Column(name = "EISS_DELIVERYTIMEWINDOW")
	public String getEissDeliverytimewindow() {
		return eissDeliverytimewindow;
	}

	/**
	 * Set eissDeliverytimewindow
	 */
	public void setEissDeliverytimewindow(String eissDeliverytimewindow) {
		this.eissDeliverytimewindow = eissDeliverytimewindow;
		addValidField("eissDeliverytimewindow");
	}

	/**
	 * Get eissPickuplocationid
	 */
	@Column(name = "EISS_PICKUPLOCATIONID")
	public String getEissPickuplocationid() {
		return eissPickuplocationid;
	}

	/**
	 * Set eissPickuplocationid
	 */
	public void setEissPickuplocationid(String eissPickuplocationid) {
		this.eissPickuplocationid = eissPickuplocationid;
		addValidField("eissPickuplocationid");
	}

	/**
	 * Get eissHdFilename
	 */
	@Column(name = "EISS_HD_FILENAME")
	public String getEissHdFilename() {
		return eissHdFilename;
	}

	/**
	 * Set eissHdFilename
	 */
	public void setEissHdFilename(String eissHdFilename) {
		this.eissHdFilename = eissHdFilename;
		addValidField("eissHdFilename");
	}

	/**
	 * Get eissHdBatchnumber
	 */
	@Column(name = "EISS_HD_BATCHNUMBER")
	public String getEissHdBatchnumber() {
		return eissHdBatchnumber;
	}

	/**
	 * Set eissHdBatchnumber
	 */
	public void setEissHdBatchnumber(String eissHdBatchnumber) {
		this.eissHdBatchnumber = eissHdBatchnumber;
		addValidField("eissHdBatchnumber");
	}

	/**
	 * Get eissHdSymbol
	 */
	@Column(name = "EISS_HD_SYMBOL")
	public String getEissHdSymbol() {
		return eissHdSymbol;
	}

	/**
	 * Set eissHdSymbol
	 */
	public void setEissHdSymbol(String eissHdSymbol) {
		this.eissHdSymbol = eissHdSymbol;
		addValidField("eissHdSymbol");
	}

	/**
	 * Get eissHdBeginprocessingtime
	 */
	@Column(name = "EISS_HD_BEGINPROCESSINGTIME")
	public Date getEissHdBeginprocessingtime() {
		return eissHdBeginprocessingtime;
	}

	/**
	 * Set eissHdBeginprocessingtime
	 */
	public void setEissHdBeginprocessingtime(Date eissHdBeginprocessingtime) {
		this.eissHdBeginprocessingtime = eissHdBeginprocessingtime;
		addValidField("eissHdBeginprocessingtime");
	}

	/**
	 * Get eissHdLastmodifiedtime
	 */
	@Column(name = "EISS_HD_LASTMODIFIEDTIME")
	public Date getEissHdLastmodifiedtime() {
		return eissHdLastmodifiedtime;
	}

	/**
	 * Set eissHdLastmodifiedtime
	 */
	public void setEissHdLastmodifiedtime(Date eissHdLastmodifiedtime) {
		this.eissHdLastmodifiedtime = eissHdLastmodifiedtime;
		addValidField("eissHdLastmodifiedtime");
	}

	/**
	 * Get eissHdInformation
	 */
	@Column(name = "EISS_HD_INFORMATION")
	public String getEissHdInformation() {
		return eissHdInformation;
	}

	/**
	 * Set eissHdInformation
	 */
	public void setEissHdInformation(String eissHdInformation) {
		this.eissHdInformation = eissHdInformation;
		addValidField("eissHdInformation");
	}

	/**
	 * Get eissSubstr1
	 */
	@Column(name = "EISS_SUBSTR1")
	public String getEissSubstr1() {
		return eissSubstr1;
	}

	/**
	 * Set eissSubstr1
	 */
	public void setEissSubstr1(String eissSubstr1) {
		this.eissSubstr1 = eissSubstr1;
		addValidField("eissSubstr1");
	}

	/**
	 * Get eissSubstr2
	 */
	@Column(name = "EISS_SUBSTR2")
	public String getEissSubstr2() {
		return eissSubstr2;
	}

	/**
	 * Set eissSubstr2
	 */
	public void setEissSubstr2(String eissSubstr2) {
		this.eissSubstr2 = eissSubstr2;
		addValidField("eissSubstr2");
	}

	/**
	 * Get eissSubstr3
	 */
	@Column(name = "EISS_SUBSTR3")
	public String getEissSubstr3() {
		return eissSubstr3;
	}

	/**
	 * Set eissSubstr3
	 */
	public void setEissSubstr3(String eissSubstr3) {
		this.eissSubstr3 = eissSubstr3;
		addValidField("eissSubstr3");
	}

	/**
	 * Get eissSubstr4
	 */
	@Column(name = "EISS_SUBSTR4")
	public String getEissSubstr4() {
		return eissSubstr4;
	}

	/**
	 * Set eissSubstr4
	 */
	public void setEissSubstr4(String eissSubstr4) {
		this.eissSubstr4 = eissSubstr4;
		addValidField("eissSubstr4");
	}

	/**
	 * Get eissSubstr5
	 */
	@Column(name = "EISS_SUBSTR5")
	public String getEissSubstr5() {
		return eissSubstr5;
	}

	/**
	 * Set eissSubstr5
	 */
	public void setEissSubstr5(String eissSubstr5) {
		this.eissSubstr5 = eissSubstr5;
		addValidField("eissSubstr5");
	}

	/**
	 * Get eissSubstr6
	 */
	@Column(name = "EISS_SUBSTR6")
	public String getEissSubstr6() {
		return eissSubstr6;
	}

	/**
	 * Set eissSubstr6
	 */
	public void setEissSubstr6(String eissSubstr6) {
		this.eissSubstr6 = eissSubstr6;
		addValidField("eissSubstr6");
	}

	/**
	 * Get eissSubstr7
	 */
	@Column(name = "EISS_SUBSTR7")
	public String getEissSubstr7() {
		return eissSubstr7;
	}

	/**
	 * Set eissSubstr7
	 */
	public void setEissSubstr7(String eissSubstr7) {
		this.eissSubstr7 = eissSubstr7;
		addValidField("eissSubstr7");
	}

	/**
	 * Get eissSubstr8
	 */
	@Column(name = "EISS_SUBSTR8")
	public String getEissSubstr8() {
		return eissSubstr8;
	}

	/**
	 * Set eissSubstr8
	 */
	public void setEissSubstr8(String eissSubstr8) {
		this.eissSubstr8 = eissSubstr8;
		addValidField("eissSubstr8");
	}

	/**
	 * Get eissSubstr9
	 */
	@Column(name = "EISS_SUBSTR9")
	public String getEissSubstr9() {
		return eissSubstr9;
	}

	/**
	 * Set eissSubstr9
	 */
	public void setEissSubstr9(String eissSubstr9) {
		this.eissSubstr9 = eissSubstr9;
		addValidField("eissSubstr9");
	}

	/**
	 * Get eissSubstr10
	 */
	@Column(name = "EISS_SUBSTR10")
	public String getEissSubstr10() {
		return eissSubstr10;
	}

	/**
	 * Set eissSubstr10
	 */
	public void setEissSubstr10(String eissSubstr10) {
		this.eissSubstr10 = eissSubstr10;
		addValidField("eissSubstr10");
	}

	/**
	 * Get eissSubstr11
	 */
	@Column(name = "EISS_SUBSTR11")
	public String getEissSubstr11() {
		return eissSubstr11;
	}

	/**
	 * Set eissSubstr11
	 */
	public void setEissSubstr11(String eissSubstr11) {
		this.eissSubstr11 = eissSubstr11;
		addValidField("eissSubstr11");
	}

	/**
	 * Get eissSubstr12
	 */
	@Column(name = "EISS_SUBSTR12")
	public String getEissSubstr12() {
		return eissSubstr12;
	}

	/**
	 * Set eissSubstr12
	 */
	public void setEissSubstr12(String eissSubstr12) {
		this.eissSubstr12 = eissSubstr12;
		addValidField("eissSubstr12");
	}

	/**
	 * Get eissSubstr13
	 */
	@Column(name = "EISS_SUBSTR13")
	public String getEissSubstr13() {
		return eissSubstr13;
	}

	/**
	 * Set eissSubstr13
	 */
	public void setEissSubstr13(String eissSubstr13) {
		this.eissSubstr13 = eissSubstr13;
		addValidField("eissSubstr13");
	}

	/**
	 * Get eissSubstr14
	 */
	@Column(name = "EISS_SUBSTR14")
	public String getEissSubstr14() {
		return eissSubstr14;
	}

	/**
	 * Set eissSubstr14
	 */
	public void setEissSubstr14(String eissSubstr14) {
		this.eissSubstr14 = eissSubstr14;
		addValidField("eissSubstr14");
	}

	/**
	 * Get eissSubstr15
	 */
	@Column(name = "EISS_SUBSTR15")
	public String getEissSubstr15() {
		return eissSubstr15;
	}

	/**
	 * Set eissSubstr15
	 */
	public void setEissSubstr15(String eissSubstr15) {
		this.eissSubstr15 = eissSubstr15;
		addValidField("eissSubstr15");
	}

	/**
	 * Get eissSubstr16
	 */
	@Column(name = "EISS_SUBSTR16")
	public String getEissSubstr16() {
		return eissSubstr16;
	}

	/**
	 * Set eissSubstr16
	 */
	public void setEissSubstr16(String eissSubstr16) {
		this.eissSubstr16 = eissSubstr16;
		addValidField("eissSubstr16");
	}

	/**
	 * Get eissSubstr17
	 */
	@Column(name = "EISS_SUBSTR17")
	public String getEissSubstr17() {
		return eissSubstr17;
	}

	/**
	 * Set eissSubstr17
	 */
	public void setEissSubstr17(String eissSubstr17) {
		this.eissSubstr17 = eissSubstr17;
		addValidField("eissSubstr17");
	}

	/**
	 * Get eissSubstr18
	 */
	@Column(name = "EISS_SUBSTR18")
	public String getEissSubstr18() {
		return eissSubstr18;
	}

	/**
	 * Set eissSubstr18
	 */
	public void setEissSubstr18(String eissSubstr18) {
		this.eissSubstr18 = eissSubstr18;
		addValidField("eissSubstr18");
	}

	/**
	 * Get eissSubstr19
	 */
	@Column(name = "EISS_SUBSTR19")
	public String getEissSubstr19() {
		return eissSubstr19;
	}

	/**
	 * Set eissSubstr19
	 */
	public void setEissSubstr19(String eissSubstr19) {
		this.eissSubstr19 = eissSubstr19;
		addValidField("eissSubstr19");
	}

	/**
	 * Get eissSubstr20
	 */
	@Column(name = "EISS_SUBSTR20")
	public String getEissSubstr20() {
		return eissSubstr20;
	}

	/**
	 * Set eissSubstr20
	 */
	public void setEissSubstr20(String eissSubstr20) {
		this.eissSubstr20 = eissSubstr20;
		addValidField("eissSubstr20");
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
	public void setRecVer(Integer i) {
		this.recVer = i;
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

	/**
	 * Get eissLadenlength
	 */
	@Column(name = "EISS_LADENLENGTH")
	public Double getEissLadenlength() {
		return eissLadenlength;
	}

	/**
	 * Set eissLadenlength
	 */
	public void setEissLadenlength(Double eissLadenlength) {
		this.eissLadenlength = eissLadenlength;
		addValidField("eissLadenlength");
	}

	/**
	 * Get eissPickupstoplong
	 */
	@Column(name = "EISS_PICKUPSTOPLONG")
	public String getEissPickupstoplong() {
		return eissPickupstoplong;
	}

	/**
	 * Set eissPickupstoplong
	 */
	public void setEissPickupstoplong(String eissPickupstoplong) {
		this.eissPickupstoplong = eissPickupstoplong;
		addValidField("eissPickupstoplong");
	}

	/**
	 * Get eissPickupstoplat
	 */
	@Column(name = "EISS_PICKUPSTOPLAT")
	public String getEissPickupstoplat() {
		return eissPickupstoplat;
	}

	/**
	 * Set eissPickupstoplat
	 */
	public void setEissPickupstoplat(String eissPickupstoplat) {
		this.eissPickupstoplat = eissPickupstoplat;
		addValidField("eissPickupstoplat");
	}

	/**
	 * Get eissDeliverstoplong
	 */
	@Column(name = "EISS_DELIVERSTOPLONG")
	public String getEissDeliverstoplong() {
		return eissDeliverstoplong;
	}

	/**
	 * Set eissDeliverstoplong
	 */
	public void setEissDeliverstoplong(String eissDeliverstoplong) {
		this.eissDeliverstoplong = eissDeliverstoplong;
		addValidField("eissDeliverstoplong");
	}

	/**
	 * Get eissDeliverstoplat
	 */
	@Column(name = "EISS_DELIVERSTOPLAT")
	public String getEissDeliverstoplat() {
		return eissDeliverstoplat;
	}

	/**
	 * Set eissDeliverstoplat
	 */
	public void setEissDeliverstoplat(String eissDeliverstoplat) {
		this.eissDeliverstoplat = eissDeliverstoplat;
		addValidField("eissDeliverstoplat");
	}

	/**
	 * Get eissPickuplocationaddress
	 */
	@Column(name = "EISS_PICKUPLOCATIONADDRESS")
	public String getEissPickuplocationaddress() {
		return eissPickuplocationaddress;
	}

	/**
	 * Set eissPickuplocationaddress
	 */
	public void setEissPickuplocationaddress(String eissPickuplocationaddress) {
		this.eissPickuplocationaddress = eissPickuplocationaddress;
		addValidField("eissPickuplocationaddress");
	}

	/**
	 * Get eissPickuprestrictzoneld
	 */
	@Column(name = "EISS_PICKUPRESTRICTZONELD")
	public String getEissPickuprestrictzoneld() {
		return eissPickuprestrictzoneld;
	}

	/**
	 * Set eissPickuprestrictzoneld
	 */
	public void setEissPickuprestrictzoneld(String eissPickuprestrictzoneld) {
		this.eissPickuprestrictzoneld = eissPickuprestrictzoneld;
		addValidField("eissPickuprestrictzoneld");
	}

	/**
	 * Get eissPickupbusinesszoneld
	 */
	@Column(name = "EISS_PICKUPBUSINESSZONELD")
	public String getEissPickupbusinesszoneld() {
		return eissPickupbusinesszoneld;
	}

	/**
	 * Set eissPickupbusinesszoneld
	 */
	public void setEissPickupbusinesszoneld(String eissPickupbusinesszoneld) {
		this.eissPickupbusinesszoneld = eissPickupbusinesszoneld;
		addValidField("eissPickupbusinesszoneld");
	}

	/**
	 * Get eissPickupduration
	 */
	@Column(name = "EISS_PICKUPDURATION")
	public Integer getEissPickupduration() {
		return eissPickupduration;
	}

	/**
	 * Set eissPickupduration
	 */
	public void setEissPickupduration(Integer eissPickupduration) {
		this.eissPickupduration = eissPickupduration;
		addValidField("eissPickupduration");
	}

	/**
	 * Get eissDeliverylocationid
	 */
	@Column(name = "EISS_DELIVERYLOCATIONID")
	public String getEissDeliverylocationid() {
		return eissDeliverylocationid;
	}

	/**
	 * Set eissDeliverylocationid
	 */
	public void setEissDeliverylocationid(String eissDeliverylocationid) {
		this.eissDeliverylocationid = eissDeliverylocationid;
		addValidField("eissDeliverylocationid");
	}

	/**
	 * Get eissDeliverylocationaddress
	 */
	@Column(name = "EISS_DELIVERYLOCATIONADDRESS")
	public String getEissDeliverylocationaddress() {
		return eissDeliverylocationaddress;
	}

	/**
	 * Set eissDeliverylocationaddress
	 */
	public void setEissDeliverylocationaddress(String eissDeliverylocationaddress) {
		this.eissDeliverylocationaddress = eissDeliverylocationaddress;
		addValidField("eissDeliverylocationaddress");
	}

	/**
	 * Get eissDeliveryrestrictzoneld
	 */
	@Column(name = "EISS_DELIVERYRESTRICTZONELD")
	public String getEissDeliveryrestrictzoneld() {
		return eissDeliveryrestrictzoneld;
	}

	/**
	 * Set eissDeliveryrestrictzoneld
	 */
	public void setEissDeliveryrestrictzoneld(String eissDeliveryrestrictzoneld) {
		this.eissDeliveryrestrictzoneld = eissDeliveryrestrictzoneld;
		addValidField("eissDeliveryrestrictzoneld");
	}

	/**
	 * Get eissDeliverybusinesszoneld
	 */
	@Column(name = "EISS_DELIVERYBUSINESSZONELD")
	public String getEissDeliverybusinesszoneld() {
		return eissDeliverybusinesszoneld;
	}

	/**
	 * Set eissDeliverybusinesszoneld
	 */
	public void setEissDeliverybusinesszoneld(String eissDeliverybusinesszoneld) {
		this.eissDeliverybusinesszoneld = eissDeliverybusinesszoneld;
		addValidField("eissDeliverybusinesszoneld");
	}

	/**
	 * Get eissDeliveryduration
	 */
	@Column(name = "EISS_DELIVERYDURATION")
	public Integer getEissDeliveryduration() {
		return eissDeliveryduration;
	}

	/**
	 * Set eissDeliveryduration
	 */
	public void setEissDeliveryduration(Integer eissDeliveryduration) {
		this.eissDeliveryduration = eissDeliveryduration;
		addValidField("eissDeliveryduration");
	}

	/**
	 * Get eissAvailablevehiclemodels
	 */
	@Column(name = "EISS_AVAILABLEVEHICLEMODELS")
	public String getEissAvailablevehiclemodels() {
		return eissAvailablevehiclemodels;
	}

	/**
	 * Set eissAvailablevehiclemodels
	 */
	public void setEissAvailablevehiclemodels(String eissAvailablevehiclemodels) {
		this.eissAvailablevehiclemodels = eissAvailablevehiclemodels;
		addValidField("eissAvailablevehiclemodels");
	}

}
