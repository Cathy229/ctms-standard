package com.sinotrans.oms.fees.model;

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
 * Model class for EiInformationMain
 */
@Entity
@Table(name = "EI_INFORMATION_MAIN")
public class EiInformationMainModel extends BaseModel implements OperationLog {

	//eiimId
	private Long eiimId;
	//eiimStatus
	private Long eiimStatus;
	//eiimEbbtCode
	private String eiimEbbtCode;
	//eiimSource
	private String eiimSource;
	//eiimEscoCompanyNo
	private String eiimEscoCompanyNo;
	//eiimEbbuCode
	private String eiimEbbuCode;
	//eiimEbotCode
	private String eiimEbotCode;
	//eiimEsdeDepartmentCode
	private String eiimEsdeDepartmentCode;
	//eiimEbsmCode
	private String eiimEbsmCode;
	//eiimProjectCode
	private String eiimProjectCode;
	//eiimSourceId
	private String eiimSourceId;
	//eiimNumber
	private String eiimNumber;
	//eiimBusinessClass
	private String eiimBusinessClass;
	//eiimAcmpTime
	private Date eiimAcmpTime;
	//eiimAEbcuCustomerNo
	private String eiimAEbcuCustomerNo;
	//eiimSEbcuCustomerNo
	private String eiimSEbcuCustomerNo;
	//eiimIsOnlyFee
	private Long eiimIsOnlyFee;
	//eiimAttribute001
	private String eiimAttribute001;
	//eiimAttribute002
	private String eiimAttribute002;
	//eiimAttribute003
	private String eiimAttribute003;
	//eiimAttribute004
	private String eiimAttribute004;
	//eiimAttribute005
	private String eiimAttribute005;
	//eiimAttribute006
	private String eiimAttribute006;
	//eiimAttribute007
	private String eiimAttribute007;
	//eiimAttribute008
	private String eiimAttribute008;
	//eiimAttribute009
	private String eiimAttribute009;
	//eiimAttribute010
	private String eiimAttribute010;
	//eiimAttribute011
	private String eiimAttribute011;
	//eiimAttribute012
	private String eiimAttribute012;
	//eiimAttribute013
	private String eiimAttribute013;
	//eiimAttribute014
	private String eiimAttribute014;
	//eiimAttribute015
	private String eiimAttribute015;
	//eiimAttribute016
	private String eiimAttribute016;
	//eiimAttribute017
	private String eiimAttribute017;
	//eiimAttribute018
	private String eiimAttribute018;
	//eiimAttribute019
	private String eiimAttribute019;
	//eiimAttribute020
	private String eiimAttribute020;
	//eiimAttribute021
	private String eiimAttribute021;
	//eiimAttribute022
	private String eiimAttribute022;
	//eiimAttribute023
	private String eiimAttribute023;
	//eiimAttribute024
	private String eiimAttribute024;
	//eiimAttribute025
	private String eiimAttribute025;
	//eiimAttribute026
	private String eiimAttribute026;
	//eiimAttribute027
	private String eiimAttribute027;
	//eiimAttribute028
	private String eiimAttribute028;
	//eiimAttribute029
	private String eiimAttribute029;
	//eiimAttribute030
	private String eiimAttribute030;
	//eiimAttribute031
	private String eiimAttribute031;
	//eiimAttribute032
	private String eiimAttribute032;
	//eiimAttribute033
	private String eiimAttribute033;
	//eiimAttribute034
	private String eiimAttribute034;
	//eiimAttribute035
	private String eiimAttribute035;
	//eiimAttribute036
	private String eiimAttribute036;
	//eiimAttribute037
	private String eiimAttribute037;
	//eiimAttribute038
	private String eiimAttribute038;
	//eiimAttribute039
	private String eiimAttribute039;
	//eiimAttribute040
	private String eiimAttribute040;
	//eiimAttribute041
	private String eiimAttribute041;
	//eiimAttribute042
	private String eiimAttribute042;
	//eiimAttribute043
	private String eiimAttribute043;
	//eiimAttribute044
	private String eiimAttribute044;
	//eiimAttribute045
	private String eiimAttribute045;
	//eiimAttribute046
	private String eiimAttribute046;
	//eiimAttribute047
	private String eiimAttribute047;
	//eiimAttribute048
	private String eiimAttribute048;
	//eiimAttribute049
	private String eiimAttribute049;
	//eiimAttribute050
	private String eiimAttribute050;
	//eiimAttribute051
	private String eiimAttribute051;
	//eiimAttribute052
	private String eiimAttribute052;
	//eiimAttribute053
	private String eiimAttribute053;
	//eiimAttribute054
	private String eiimAttribute054;
	//eiimAttribute055
	private String eiimAttribute055;
	//eiimAttribute056
	private String eiimAttribute056;
	//eiimAttribute057
	private String eiimAttribute057;
	//eiimAttribute058
	private String eiimAttribute058;
	//eiimAttribute059
	private String eiimAttribute059;
	//eiimAttribute060
	private String eiimAttribute060;
	//eiimAttribute061
	private String eiimAttribute061;
	//eiimAttribute062
	private String eiimAttribute062;
	//eiimAttribute063
	private String eiimAttribute063;
	//eiimAttribute064
	private String eiimAttribute064;
	//eiimAttribute065
	private String eiimAttribute065;
	//eiimAttribute066
	private String eiimAttribute066;
	//eiimAttribute067
	private String eiimAttribute067;
	//eiimAttribute068
	private String eiimAttribute068;
	//eiimAttribute069
	private String eiimAttribute069;
	//eiimAttribute070
	private String eiimAttribute070;
	//eiimAttribute071
	private String eiimAttribute071;
	//eiimAttribute072
	private String eiimAttribute072;
	//eiimAttribute073
	private String eiimAttribute073;
	//eiimAttribute074
	private String eiimAttribute074;
	//eiimAttribute075
	private String eiimAttribute075;
	//eiimAttribute076
	private String eiimAttribute076;
	//eiimAttribute077
	private String eiimAttribute077;
	//eiimAttribute078
	private String eiimAttribute078;
	//eiimAttribute079
	private String eiimAttribute079;
	//eiimAttribute080
	private String eiimAttribute080;
	//eiimAttribute081
	private String eiimAttribute081;
	//eiimAttribute082
	private String eiimAttribute082;
	//eiimAttribute083
	private String eiimAttribute083;
	//eiimAttribute084
	private String eiimAttribute084;
	//eiimAttribute085
	private String eiimAttribute085;
	//eiimAttribute086
	private String eiimAttribute086;
	//eiimAttribute087
	private String eiimAttribute087;
	//eiimAttribute088
	private String eiimAttribute088;
	//eiimAttribute089
	private String eiimAttribute089;
	//eiimAttribute090
	private String eiimAttribute090;
	//eiimAttribute091
	private String eiimAttribute091;
	//eiimAttribute092
	private String eiimAttribute092;
	//eiimAttribute093
	private String eiimAttribute093;
	//eiimAttribute094
	private String eiimAttribute094;
	//eiimAttribute095
	private String eiimAttribute095;
	//eiimAttribute096
	private String eiimAttribute096;
	//eiimAttribute097
	private String eiimAttribute097;
	//eiimAttribute098
	private String eiimAttribute098;
	//eiimAttribute099
	private String eiimAttribute099;
	//eiimAttribute100
	private String eiimAttribute100;
	//hdFilename
	private String hdFilename;
	//hdBatchnumber
	private String hdBatchnumber;
	//hdSymbol
	private String hdSymbol;
	//hdBeginprocessingtime
	private Date hdBeginprocessingtime;
	//hdLastmodifiedtime
	private Date hdLastmodifiedtime;
	//hdInformation
	private String hdInformation;
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
	//eiimPStatus
	private String eiimPStatus;
	//eiimRStatus
	private String eiimRStatus;
	//eiimREsusUserNameCn
	private String eiimREsusUserNameCn;
	//eiimRTime
	private String eiimRTime;
	//eiimPEsusUserNameCn
	private String eiimPEsusUserNameCn;
	//eiimPTime
	private String eiimPTime;
	//eiimDpNumber
	private String eiimDpNumber;

	/**
	 * Get eiimId
	 */
	@Column(name = "EIIM_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEiimId() {
		return eiimId;
	}

	/**
	 * Set eiimId
	 */
	public void setEiimId(Long eiimId) {
		this.eiimId = eiimId;
		addValidField("eiimId");
	}

	/**
	 * Get eiimStatus
	 */
	@Column(name = "EIIM_STATUS")
	public Long getEiimStatus() {
		return eiimStatus;
	}

	/**
	 * Set eiimStatus
	 */
	public void setEiimStatus(Long eiimStatus) {
		this.eiimStatus = eiimStatus;
		addValidField("eiimStatus");
	}

	/**
	 * Get eiimEbbtCode
	 */
	@Column(name = "EIIM_EBBT_CODE")
	public String getEiimEbbtCode() {
		return eiimEbbtCode;
	}

	/**
	 * Set eiimEbbtCode
	 */
	public void setEiimEbbtCode(String eiimEbbtCode) {
		this.eiimEbbtCode = eiimEbbtCode;
		addValidField("eiimEbbtCode");
	}

	/**
	 * Get eiimSource
	 */
	@Column(name = "EIIM_SOURCE")
	public String getEiimSource() {
		return eiimSource;
	}

	/**
	 * Set eiimSource
	 */
	public void setEiimSource(String eiimSource) {
		this.eiimSource = eiimSource;
		addValidField("eiimSource");
	}

	/**
	 * Get eiimEscoCompanyNo
	 */
	@Column(name = "EIIM_ESCO_COMPANY_NO")
	public String getEiimEscoCompanyNo() {
		return eiimEscoCompanyNo;
	}

	/**
	 * Set eiimEscoCompanyNo
	 */
	public void setEiimEscoCompanyNo(String eiimEscoCompanyNo) {
		this.eiimEscoCompanyNo = eiimEscoCompanyNo;
		addValidField("eiimEscoCompanyNo");
	}

	/**
	 * Get eiimEbbuCode
	 */
	@Column(name = "EIIM_EBBU_CODE")
	public String getEiimEbbuCode() {
		return eiimEbbuCode;
	}

	/**
	 * Set eiimEbbuCode
	 */
	public void setEiimEbbuCode(String eiimEbbuCode) {
		this.eiimEbbuCode = eiimEbbuCode;
		addValidField("eiimEbbuCode");
	}

	/**
	 * Get eiimEbotCode
	 */
	@Column(name = "EIIM_EBOT_CODE")
	public String getEiimEbotCode() {
		return eiimEbotCode;
	}

	/**
	 * Set eiimEbotCode
	 */
	public void setEiimEbotCode(String eiimEbotCode) {
		this.eiimEbotCode = eiimEbotCode;
		addValidField("eiimEbotCode");
	}

	/**
	 * Get eiimEsdeDepartmentCode
	 */
	@Column(name = "EIIM_ESDE_DEPARTMENT_CODE")
	public String getEiimEsdeDepartmentCode() {
		return eiimEsdeDepartmentCode;
	}

	/**
	 * Set eiimEsdeDepartmentCode
	 */
	public void setEiimEsdeDepartmentCode(String eiimEsdeDepartmentCode) {
		this.eiimEsdeDepartmentCode = eiimEsdeDepartmentCode;
		addValidField("eiimEsdeDepartmentCode");
	}

	/**
	 * Get eiimEbsmCode
	 */
	@Column(name = "EIIM_EBSM_CODE")
	public String getEiimEbsmCode() {
		return eiimEbsmCode;
	}

	/**
	 * Set eiimEbsmCode
	 */
	public void setEiimEbsmCode(String eiimEbsmCode) {
		this.eiimEbsmCode = eiimEbsmCode;
		addValidField("eiimEbsmCode");
	}

	/**
	 * Get eiimProjectCode
	 */
	@Column(name = "EIIM_PROJECT_CODE")
	public String getEiimProjectCode() {
		return eiimProjectCode;
	}

	/**
	 * Set eiimProjectCode
	 */
	public void setEiimProjectCode(String eiimProjectCode) {
		this.eiimProjectCode = eiimProjectCode;
		addValidField("eiimProjectCode");
	}

	/**
	 * Get eiimSourceId
	 */
	@Column(name = "EIIM_SOURCE_ID")
	public String getEiimSourceId() {
		return eiimSourceId;
	}

	/**
	 * Set eiimSourceId
	 */
	public void setEiimSourceId(String eiimSourceId) {
		this.eiimSourceId = eiimSourceId;
		addValidField("eiimSourceId");
	}

	/**
	 * Get eiimNumber
	 */
	@Column(name = "EIIM_NUMBER")
	public String getEiimNumber() {
		return eiimNumber;
	}

	/**
	 * Set eiimNumber
	 */
	public void setEiimNumber(String eiimNumber) {
		this.eiimNumber = eiimNumber;
		addValidField("eiimNumber");
	}

	/**
	 * Get eiimBusinessClass
	 */
	@Column(name = "EIIM_BUSINESS_CLASS")
	public String getEiimBusinessClass() {
		return eiimBusinessClass;
	}

	/**
	 * Set eiimBusinessClass
	 */
	public void setEiimBusinessClass(String eiimBusinessClass) {
		this.eiimBusinessClass = eiimBusinessClass;
		addValidField("eiimBusinessClass");
	}

	/**
	 * Get eiimAcmpTime
	 */
	@Column(name = "EIIM_ACMP_TIME")
	public Date getEiimAcmpTime() {
		return eiimAcmpTime;
	}

	/**
	 * Set eiimAcmpTime
	 */
	public void setEiimAcmpTime(Date eiimAcmpTime) {
		this.eiimAcmpTime = eiimAcmpTime;
		addValidField("eiimAcmpTime");
	}

	/**
	 * Get eiimAEbcuCustomerNo
	 */
	@Column(name = "EIIM_A_EBCU_CUSTOMER_NO")
	public String getEiimAEbcuCustomerNo() {
		return eiimAEbcuCustomerNo;
	}

	/**
	 * Set eiimAEbcuCustomerNo
	 */
	public void setEiimAEbcuCustomerNo(String eiimAEbcuCustomerNo) {
		this.eiimAEbcuCustomerNo = eiimAEbcuCustomerNo;
		addValidField("eiimAEbcuCustomerNo");
	}

	/**
	 * Get eiimSEbcuCustomerNo
	 */
	@Column(name = "EIIM_S_EBCU_CUSTOMER_NO")
	public String getEiimSEbcuCustomerNo() {
		return eiimSEbcuCustomerNo;
	}

	/**
	 * Set eiimSEbcuCustomerNo
	 */
	public void setEiimSEbcuCustomerNo(String eiimSEbcuCustomerNo) {
		this.eiimSEbcuCustomerNo = eiimSEbcuCustomerNo;
		addValidField("eiimSEbcuCustomerNo");
	}

	/**
	 * Get eiimIsOnlyFee
	 */
	@Column(name = "EIIM_IS_ONLY_FEE")
	public Long getEiimIsOnlyFee() {
		return eiimIsOnlyFee;
	}

	/**
	 * Set eiimIsOnlyFee
	 */
	public void setEiimIsOnlyFee(Long eiimIsOnlyFee) {
		this.eiimIsOnlyFee = eiimIsOnlyFee;
		addValidField("eiimIsOnlyFee");
	}

	/**
	 * Get eiimAttribute001
	 */
	@Column(name = "EIIM_ATTRIBUTE_001")
	public String getEiimAttribute001() {
		return eiimAttribute001;
	}

	/**
	 * Set eiimAttribute001
	 */
	public void setEiimAttribute001(String eiimAttribute001) {
		this.eiimAttribute001 = eiimAttribute001;
		addValidField("eiimAttribute001");
	}

	/**
	 * Get eiimAttribute002
	 */
	@Column(name = "EIIM_ATTRIBUTE_002")
	public String getEiimAttribute002() {
		return eiimAttribute002;
	}

	/**
	 * Set eiimAttribute002
	 */
	public void setEiimAttribute002(String eiimAttribute002) {
		this.eiimAttribute002 = eiimAttribute002;
		addValidField("eiimAttribute002");
	}

	/**
	 * Get eiimAttribute003
	 */
	@Column(name = "EIIM_ATTRIBUTE_003")
	public String getEiimAttribute003() {
		return eiimAttribute003;
	}

	/**
	 * Set eiimAttribute003
	 */
	public void setEiimAttribute003(String eiimAttribute003) {
		this.eiimAttribute003 = eiimAttribute003;
		addValidField("eiimAttribute003");
	}

	/**
	 * Get eiimAttribute004
	 */
	@Column(name = "EIIM_ATTRIBUTE_004")
	public String getEiimAttribute004() {
		return eiimAttribute004;
	}

	/**
	 * Set eiimAttribute004
	 */
	public void setEiimAttribute004(String eiimAttribute004) {
		this.eiimAttribute004 = eiimAttribute004;
		addValidField("eiimAttribute004");
	}

	/**
	 * Get eiimAttribute005
	 */
	@Column(name = "EIIM_ATTRIBUTE_005")
	public String getEiimAttribute005() {
		return eiimAttribute005;
	}

	/**
	 * Set eiimAttribute005
	 */
	public void setEiimAttribute005(String eiimAttribute005) {
		this.eiimAttribute005 = eiimAttribute005;
		addValidField("eiimAttribute005");
	}

	/**
	 * Get eiimAttribute006
	 */
	@Column(name = "EIIM_ATTRIBUTE_006")
	public String getEiimAttribute006() {
		return eiimAttribute006;
	}

	/**
	 * Set eiimAttribute006
	 */
	public void setEiimAttribute006(String eiimAttribute006) {
		this.eiimAttribute006 = eiimAttribute006;
		addValidField("eiimAttribute006");
	}

	/**
	 * Get eiimAttribute007
	 */
	@Column(name = "EIIM_ATTRIBUTE_007")
	public String getEiimAttribute007() {
		return eiimAttribute007;
	}

	/**
	 * Set eiimAttribute007
	 */
	public void setEiimAttribute007(String eiimAttribute007) {
		this.eiimAttribute007 = eiimAttribute007;
		addValidField("eiimAttribute007");
	}

	/**
	 * Get eiimAttribute008
	 */
	@Column(name = "EIIM_ATTRIBUTE_008")
	public String getEiimAttribute008() {
		return eiimAttribute008;
	}

	/**
	 * Set eiimAttribute008
	 */
	public void setEiimAttribute008(String eiimAttribute008) {
		this.eiimAttribute008 = eiimAttribute008;
		addValidField("eiimAttribute008");
	}

	/**
	 * Get eiimAttribute009
	 */
	@Column(name = "EIIM_ATTRIBUTE_009")
	public String getEiimAttribute009() {
		return eiimAttribute009;
	}

	/**
	 * Set eiimAttribute009
	 */
	public void setEiimAttribute009(String eiimAttribute009) {
		this.eiimAttribute009 = eiimAttribute009;
		addValidField("eiimAttribute009");
	}

	/**
	 * Get eiimAttribute010
	 */
	@Column(name = "EIIM_ATTRIBUTE_010")
	public String getEiimAttribute010() {
		return eiimAttribute010;
	}

	/**
	 * Set eiimAttribute010
	 */
	public void setEiimAttribute010(String eiimAttribute010) {
		this.eiimAttribute010 = eiimAttribute010;
		addValidField("eiimAttribute010");
	}

	/**
	 * Get eiimAttribute011
	 */
	@Column(name = "EIIM_ATTRIBUTE_011")
	public String getEiimAttribute011() {
		return eiimAttribute011;
	}

	/**
	 * Set eiimAttribute011
	 */
	public void setEiimAttribute011(String eiimAttribute011) {
		this.eiimAttribute011 = eiimAttribute011;
		addValidField("eiimAttribute011");
	}

	/**
	 * Get eiimAttribute012
	 */
	@Column(name = "EIIM_ATTRIBUTE_012")
	public String getEiimAttribute012() {
		return eiimAttribute012;
	}

	/**
	 * Set eiimAttribute012
	 */
	public void setEiimAttribute012(String eiimAttribute012) {
		this.eiimAttribute012 = eiimAttribute012;
		addValidField("eiimAttribute012");
	}

	/**
	 * Get eiimAttribute013
	 */
	@Column(name = "EIIM_ATTRIBUTE_013")
	public String getEiimAttribute013() {
		return eiimAttribute013;
	}

	/**
	 * Set eiimAttribute013
	 */
	public void setEiimAttribute013(String eiimAttribute013) {
		this.eiimAttribute013 = eiimAttribute013;
		addValidField("eiimAttribute013");
	}

	/**
	 * Get eiimAttribute014
	 */
	@Column(name = "EIIM_ATTRIBUTE_014")
	public String getEiimAttribute014() {
		return eiimAttribute014;
	}

	/**
	 * Set eiimAttribute014
	 */
	public void setEiimAttribute014(String eiimAttribute014) {
		this.eiimAttribute014 = eiimAttribute014;
		addValidField("eiimAttribute014");
	}

	/**
	 * Get eiimAttribute015
	 */
	@Column(name = "EIIM_ATTRIBUTE_015")
	public String getEiimAttribute015() {
		return eiimAttribute015;
	}

	/**
	 * Set eiimAttribute015
	 */
	public void setEiimAttribute015(String eiimAttribute015) {
		this.eiimAttribute015 = eiimAttribute015;
		addValidField("eiimAttribute015");
	}

	/**
	 * Get eiimAttribute016
	 */
	@Column(name = "EIIM_ATTRIBUTE_016")
	public String getEiimAttribute016() {
		return eiimAttribute016;
	}

	/**
	 * Set eiimAttribute016
	 */
	public void setEiimAttribute016(String eiimAttribute016) {
		this.eiimAttribute016 = eiimAttribute016;
		addValidField("eiimAttribute016");
	}

	/**
	 * Get eiimAttribute017
	 */
	@Column(name = "EIIM_ATTRIBUTE_017")
	public String getEiimAttribute017() {
		return eiimAttribute017;
	}

	/**
	 * Set eiimAttribute017
	 */
	public void setEiimAttribute017(String eiimAttribute017) {
		this.eiimAttribute017 = eiimAttribute017;
		addValidField("eiimAttribute017");
	}

	/**
	 * Get eiimAttribute018
	 */
	@Column(name = "EIIM_ATTRIBUTE_018")
	public String getEiimAttribute018() {
		return eiimAttribute018;
	}

	/**
	 * Set eiimAttribute018
	 */
	public void setEiimAttribute018(String eiimAttribute018) {
		this.eiimAttribute018 = eiimAttribute018;
		addValidField("eiimAttribute018");
	}

	/**
	 * Get eiimAttribute019
	 */
	@Column(name = "EIIM_ATTRIBUTE_019")
	public String getEiimAttribute019() {
		return eiimAttribute019;
	}

	/**
	 * Set eiimAttribute019
	 */
	public void setEiimAttribute019(String eiimAttribute019) {
		this.eiimAttribute019 = eiimAttribute019;
		addValidField("eiimAttribute019");
	}

	/**
	 * Get eiimAttribute020
	 */
	@Column(name = "EIIM_ATTRIBUTE_020")
	public String getEiimAttribute020() {
		return eiimAttribute020;
	}

	/**
	 * Set eiimAttribute020
	 */
	public void setEiimAttribute020(String eiimAttribute020) {
		this.eiimAttribute020 = eiimAttribute020;
		addValidField("eiimAttribute020");
	}

	/**
	 * Get eiimAttribute021
	 */
	@Column(name = "EIIM_ATTRIBUTE_021")
	public String getEiimAttribute021() {
		return eiimAttribute021;
	}

	/**
	 * Set eiimAttribute021
	 */
	public void setEiimAttribute021(String eiimAttribute021) {
		this.eiimAttribute021 = eiimAttribute021;
		addValidField("eiimAttribute021");
	}

	/**
	 * Get eiimAttribute022
	 */
	@Column(name = "EIIM_ATTRIBUTE_022")
	public String getEiimAttribute022() {
		return eiimAttribute022;
	}

	/**
	 * Set eiimAttribute022
	 */
	public void setEiimAttribute022(String eiimAttribute022) {
		this.eiimAttribute022 = eiimAttribute022;
		addValidField("eiimAttribute022");
	}

	/**
	 * Get eiimAttribute023
	 */
	@Column(name = "EIIM_ATTRIBUTE_023")
	public String getEiimAttribute023() {
		return eiimAttribute023;
	}

	/**
	 * Set eiimAttribute023
	 */
	public void setEiimAttribute023(String eiimAttribute023) {
		this.eiimAttribute023 = eiimAttribute023;
		addValidField("eiimAttribute023");
	}

	/**
	 * Get eiimAttribute024
	 */
	@Column(name = "EIIM_ATTRIBUTE_024")
	public String getEiimAttribute024() {
		return eiimAttribute024;
	}

	/**
	 * Set eiimAttribute024
	 */
	public void setEiimAttribute024(String eiimAttribute024) {
		this.eiimAttribute024 = eiimAttribute024;
		addValidField("eiimAttribute024");
	}

	/**
	 * Get eiimAttribute025
	 */
	@Column(name = "EIIM_ATTRIBUTE_025")
	public String getEiimAttribute025() {
		return eiimAttribute025;
	}

	/**
	 * Set eiimAttribute025
	 */
	public void setEiimAttribute025(String eiimAttribute025) {
		this.eiimAttribute025 = eiimAttribute025;
		addValidField("eiimAttribute025");
	}

	/**
	 * Get eiimAttribute026
	 */
	@Column(name = "EIIM_ATTRIBUTE_026")
	public String getEiimAttribute026() {
		return eiimAttribute026;
	}

	/**
	 * Set eiimAttribute026
	 */
	public void setEiimAttribute026(String eiimAttribute026) {
		this.eiimAttribute026 = eiimAttribute026;
		addValidField("eiimAttribute026");
	}

	/**
	 * Get eiimAttribute027
	 */
	@Column(name = "EIIM_ATTRIBUTE_027")
	public String getEiimAttribute027() {
		return eiimAttribute027;
	}

	/**
	 * Set eiimAttribute027
	 */
	public void setEiimAttribute027(String eiimAttribute027) {
		this.eiimAttribute027 = eiimAttribute027;
		addValidField("eiimAttribute027");
	}

	/**
	 * Get eiimAttribute028
	 */
	@Column(name = "EIIM_ATTRIBUTE_028")
	public String getEiimAttribute028() {
		return eiimAttribute028;
	}

	/**
	 * Set eiimAttribute028
	 */
	public void setEiimAttribute028(String eiimAttribute028) {
		this.eiimAttribute028 = eiimAttribute028;
		addValidField("eiimAttribute028");
	}

	/**
	 * Get eiimAttribute029
	 */
	@Column(name = "EIIM_ATTRIBUTE_029")
	public String getEiimAttribute029() {
		return eiimAttribute029;
	}

	/**
	 * Set eiimAttribute029
	 */
	public void setEiimAttribute029(String eiimAttribute029) {
		this.eiimAttribute029 = eiimAttribute029;
		addValidField("eiimAttribute029");
	}

	/**
	 * Get eiimAttribute030
	 */
	@Column(name = "EIIM_ATTRIBUTE_030")
	public String getEiimAttribute030() {
		return eiimAttribute030;
	}

	/**
	 * Set eiimAttribute030
	 */
	public void setEiimAttribute030(String eiimAttribute030) {
		this.eiimAttribute030 = eiimAttribute030;
		addValidField("eiimAttribute030");
	}

	/**
	 * Get eiimAttribute031
	 */
	@Column(name = "EIIM_ATTRIBUTE_031")
	public String getEiimAttribute031() {
		return eiimAttribute031;
	}

	/**
	 * Set eiimAttribute031
	 */
	public void setEiimAttribute031(String eiimAttribute031) {
		this.eiimAttribute031 = eiimAttribute031;
		addValidField("eiimAttribute031");
	}

	/**
	 * Get eiimAttribute032
	 */
	@Column(name = "EIIM_ATTRIBUTE_032")
	public String getEiimAttribute032() {
		return eiimAttribute032;
	}

	/**
	 * Set eiimAttribute032
	 */
	public void setEiimAttribute032(String eiimAttribute032) {
		this.eiimAttribute032 = eiimAttribute032;
		addValidField("eiimAttribute032");
	}

	/**
	 * Get eiimAttribute033
	 */
	@Column(name = "EIIM_ATTRIBUTE_033")
	public String getEiimAttribute033() {
		return eiimAttribute033;
	}

	/**
	 * Set eiimAttribute033
	 */
	public void setEiimAttribute033(String eiimAttribute033) {
		this.eiimAttribute033 = eiimAttribute033;
		addValidField("eiimAttribute033");
	}

	/**
	 * Get eiimAttribute034
	 */
	@Column(name = "EIIM_ATTRIBUTE_034")
	public String getEiimAttribute034() {
		return eiimAttribute034;
	}

	/**
	 * Set eiimAttribute034
	 */
	public void setEiimAttribute034(String eiimAttribute034) {
		this.eiimAttribute034 = eiimAttribute034;
		addValidField("eiimAttribute034");
	}

	/**
	 * Get eiimAttribute035
	 */
	@Column(name = "EIIM_ATTRIBUTE_035")
	public String getEiimAttribute035() {
		return eiimAttribute035;
	}

	/**
	 * Set eiimAttribute035
	 */
	public void setEiimAttribute035(String eiimAttribute035) {
		this.eiimAttribute035 = eiimAttribute035;
		addValidField("eiimAttribute035");
	}

	/**
	 * Get eiimAttribute036
	 */
	@Column(name = "EIIM_ATTRIBUTE_036")
	public String getEiimAttribute036() {
		return eiimAttribute036;
	}

	/**
	 * Set eiimAttribute036
	 */
	public void setEiimAttribute036(String eiimAttribute036) {
		this.eiimAttribute036 = eiimAttribute036;
		addValidField("eiimAttribute036");
	}

	/**
	 * Get eiimAttribute037
	 */
	@Column(name = "EIIM_ATTRIBUTE_037")
	public String getEiimAttribute037() {
		return eiimAttribute037;
	}

	/**
	 * Set eiimAttribute037
	 */
	public void setEiimAttribute037(String eiimAttribute037) {
		this.eiimAttribute037 = eiimAttribute037;
		addValidField("eiimAttribute037");
	}

	/**
	 * Get eiimAttribute038
	 */
	@Column(name = "EIIM_ATTRIBUTE_038")
	public String getEiimAttribute038() {
		return eiimAttribute038;
	}

	/**
	 * Set eiimAttribute038
	 */
	public void setEiimAttribute038(String eiimAttribute038) {
		this.eiimAttribute038 = eiimAttribute038;
		addValidField("eiimAttribute038");
	}

	/**
	 * Get eiimAttribute039
	 */
	@Column(name = "EIIM_ATTRIBUTE_039")
	public String getEiimAttribute039() {
		return eiimAttribute039;
	}

	/**
	 * Set eiimAttribute039
	 */
	public void setEiimAttribute039(String eiimAttribute039) {
		this.eiimAttribute039 = eiimAttribute039;
		addValidField("eiimAttribute039");
	}

	/**
	 * Get eiimAttribute040
	 */
	@Column(name = "EIIM_ATTRIBUTE_040")
	public String getEiimAttribute040() {
		return eiimAttribute040;
	}

	/**
	 * Set eiimAttribute040
	 */
	public void setEiimAttribute040(String eiimAttribute040) {
		this.eiimAttribute040 = eiimAttribute040;
		addValidField("eiimAttribute040");
	}

	/**
	 * Get eiimAttribute041
	 */
	@Column(name = "EIIM_ATTRIBUTE_041")
	public String getEiimAttribute041() {
		return eiimAttribute041;
	}

	/**
	 * Set eiimAttribute041
	 */
	public void setEiimAttribute041(String eiimAttribute041) {
		this.eiimAttribute041 = eiimAttribute041;
		addValidField("eiimAttribute041");
	}

	/**
	 * Get eiimAttribute042
	 */
	@Column(name = "EIIM_ATTRIBUTE_042")
	public String getEiimAttribute042() {
		return eiimAttribute042;
	}

	/**
	 * Set eiimAttribute042
	 */
	public void setEiimAttribute042(String eiimAttribute042) {
		this.eiimAttribute042 = eiimAttribute042;
		addValidField("eiimAttribute042");
	}

	/**
	 * Get eiimAttribute043
	 */
	@Column(name = "EIIM_ATTRIBUTE_043")
	public String getEiimAttribute043() {
		return eiimAttribute043;
	}

	/**
	 * Set eiimAttribute043
	 */
	public void setEiimAttribute043(String eiimAttribute043) {
		this.eiimAttribute043 = eiimAttribute043;
		addValidField("eiimAttribute043");
	}

	/**
	 * Get eiimAttribute044
	 */
	@Column(name = "EIIM_ATTRIBUTE_044")
	public String getEiimAttribute044() {
		return eiimAttribute044;
	}

	/**
	 * Set eiimAttribute044
	 */
	public void setEiimAttribute044(String eiimAttribute044) {
		this.eiimAttribute044 = eiimAttribute044;
		addValidField("eiimAttribute044");
	}

	/**
	 * Get eiimAttribute045
	 */
	@Column(name = "EIIM_ATTRIBUTE_045")
	public String getEiimAttribute045() {
		return eiimAttribute045;
	}

	/**
	 * Set eiimAttribute045
	 */
	public void setEiimAttribute045(String eiimAttribute045) {
		this.eiimAttribute045 = eiimAttribute045;
		addValidField("eiimAttribute045");
	}

	/**
	 * Get eiimAttribute046
	 */
	@Column(name = "EIIM_ATTRIBUTE_046")
	public String getEiimAttribute046() {
		return eiimAttribute046;
	}

	/**
	 * Set eiimAttribute046
	 */
	public void setEiimAttribute046(String eiimAttribute046) {
		this.eiimAttribute046 = eiimAttribute046;
		addValidField("eiimAttribute046");
	}

	/**
	 * Get eiimAttribute047
	 */
	@Column(name = "EIIM_ATTRIBUTE_047")
	public String getEiimAttribute047() {
		return eiimAttribute047;
	}

	/**
	 * Set eiimAttribute047
	 */
	public void setEiimAttribute047(String eiimAttribute047) {
		this.eiimAttribute047 = eiimAttribute047;
		addValidField("eiimAttribute047");
	}

	/**
	 * Get eiimAttribute048
	 */
	@Column(name = "EIIM_ATTRIBUTE_048")
	public String getEiimAttribute048() {
		return eiimAttribute048;
	}

	/**
	 * Set eiimAttribute048
	 */
	public void setEiimAttribute048(String eiimAttribute048) {
		this.eiimAttribute048 = eiimAttribute048;
		addValidField("eiimAttribute048");
	}

	/**
	 * Get eiimAttribute049
	 */
	@Column(name = "EIIM_ATTRIBUTE_049")
	public String getEiimAttribute049() {
		return eiimAttribute049;
	}

	/**
	 * Set eiimAttribute049
	 */
	public void setEiimAttribute049(String eiimAttribute049) {
		this.eiimAttribute049 = eiimAttribute049;
		addValidField("eiimAttribute049");
	}

	/**
	 * Get eiimAttribute050
	 */
	@Column(name = "EIIM_ATTRIBUTE_050")
	public String getEiimAttribute050() {
		return eiimAttribute050;
	}

	/**
	 * Set eiimAttribute050
	 */
	public void setEiimAttribute050(String eiimAttribute050) {
		this.eiimAttribute050 = eiimAttribute050;
		addValidField("eiimAttribute050");
	}

	/**
	 * Get eiimAttribute051
	 */
	@Column(name = "EIIM_ATTRIBUTE_051")
	public String getEiimAttribute051() {
		return eiimAttribute051;
	}

	/**
	 * Set eiimAttribute051
	 */
	public void setEiimAttribute051(String eiimAttribute051) {
		this.eiimAttribute051 = eiimAttribute051;
		addValidField("eiimAttribute051");
	}

	/**
	 * Get eiimAttribute052
	 */
	@Column(name = "EIIM_ATTRIBUTE_052")
	public String getEiimAttribute052() {
		return eiimAttribute052;
	}

	/**
	 * Set eiimAttribute052
	 */
	public void setEiimAttribute052(String eiimAttribute052) {
		this.eiimAttribute052 = eiimAttribute052;
		addValidField("eiimAttribute052");
	}

	/**
	 * Get eiimAttribute053
	 */
	@Column(name = "EIIM_ATTRIBUTE_053")
	public String getEiimAttribute053() {
		return eiimAttribute053;
	}

	/**
	 * Set eiimAttribute053
	 */
	public void setEiimAttribute053(String eiimAttribute053) {
		this.eiimAttribute053 = eiimAttribute053;
		addValidField("eiimAttribute053");
	}

	/**
	 * Get eiimAttribute054
	 */
	@Column(name = "EIIM_ATTRIBUTE_054")
	public String getEiimAttribute054() {
		return eiimAttribute054;
	}

	/**
	 * Set eiimAttribute054
	 */
	public void setEiimAttribute054(String eiimAttribute054) {
		this.eiimAttribute054 = eiimAttribute054;
		addValidField("eiimAttribute054");
	}

	/**
	 * Get eiimAttribute055
	 */
	@Column(name = "EIIM_ATTRIBUTE_055")
	public String getEiimAttribute055() {
		return eiimAttribute055;
	}

	/**
	 * Set eiimAttribute055
	 */
	public void setEiimAttribute055(String eiimAttribute055) {
		this.eiimAttribute055 = eiimAttribute055;
		addValidField("eiimAttribute055");
	}

	/**
	 * Get eiimAttribute056
	 */
	@Column(name = "EIIM_ATTRIBUTE_056")
	public String getEiimAttribute056() {
		return eiimAttribute056;
	}

	/**
	 * Set eiimAttribute056
	 */
	public void setEiimAttribute056(String eiimAttribute056) {
		this.eiimAttribute056 = eiimAttribute056;
		addValidField("eiimAttribute056");
	}

	/**
	 * Get eiimAttribute057
	 */
	@Column(name = "EIIM_ATTRIBUTE_057")
	public String getEiimAttribute057() {
		return eiimAttribute057;
	}

	/**
	 * Set eiimAttribute057
	 */
	public void setEiimAttribute057(String eiimAttribute057) {
		this.eiimAttribute057 = eiimAttribute057;
		addValidField("eiimAttribute057");
	}

	/**
	 * Get eiimAttribute058
	 */
	@Column(name = "EIIM_ATTRIBUTE_058")
	public String getEiimAttribute058() {
		return eiimAttribute058;
	}

	/**
	 * Set eiimAttribute058
	 */
	public void setEiimAttribute058(String eiimAttribute058) {
		this.eiimAttribute058 = eiimAttribute058;
		addValidField("eiimAttribute058");
	}

	/**
	 * Get eiimAttribute059
	 */
	@Column(name = "EIIM_ATTRIBUTE_059")
	public String getEiimAttribute059() {
		return eiimAttribute059;
	}

	/**
	 * Set eiimAttribute059
	 */
	public void setEiimAttribute059(String eiimAttribute059) {
		this.eiimAttribute059 = eiimAttribute059;
		addValidField("eiimAttribute059");
	}

	/**
	 * Get eiimAttribute060
	 */
	@Column(name = "EIIM_ATTRIBUTE_060")
	public String getEiimAttribute060() {
		return eiimAttribute060;
	}

	/**
	 * Set eiimAttribute060
	 */
	public void setEiimAttribute060(String eiimAttribute060) {
		this.eiimAttribute060 = eiimAttribute060;
		addValidField("eiimAttribute060");
	}

	/**
	 * Get eiimAttribute061
	 */
	@Column(name = "EIIM_ATTRIBUTE_061")
	public String getEiimAttribute061() {
		return eiimAttribute061;
	}

	/**
	 * Set eiimAttribute061
	 */
	public void setEiimAttribute061(String eiimAttribute061) {
		this.eiimAttribute061 = eiimAttribute061;
		addValidField("eiimAttribute061");
	}

	/**
	 * Get eiimAttribute062
	 */
	@Column(name = "EIIM_ATTRIBUTE_062")
	public String getEiimAttribute062() {
		return eiimAttribute062;
	}

	/**
	 * Set eiimAttribute062
	 */
	public void setEiimAttribute062(String eiimAttribute062) {
		this.eiimAttribute062 = eiimAttribute062;
		addValidField("eiimAttribute062");
	}

	/**
	 * Get eiimAttribute063
	 */
	@Column(name = "EIIM_ATTRIBUTE_063")
	public String getEiimAttribute063() {
		return eiimAttribute063;
	}

	/**
	 * Set eiimAttribute063
	 */
	public void setEiimAttribute063(String eiimAttribute063) {
		this.eiimAttribute063 = eiimAttribute063;
		addValidField("eiimAttribute063");
	}

	/**
	 * Get eiimAttribute064
	 */
	@Column(name = "EIIM_ATTRIBUTE_064")
	public String getEiimAttribute064() {
		return eiimAttribute064;
	}

	/**
	 * Set eiimAttribute064
	 */
	public void setEiimAttribute064(String eiimAttribute064) {
		this.eiimAttribute064 = eiimAttribute064;
		addValidField("eiimAttribute064");
	}

	/**
	 * Get eiimAttribute065
	 */
	@Column(name = "EIIM_ATTRIBUTE_065")
	public String getEiimAttribute065() {
		return eiimAttribute065;
	}

	/**
	 * Set eiimAttribute065
	 */
	public void setEiimAttribute065(String eiimAttribute065) {
		this.eiimAttribute065 = eiimAttribute065;
		addValidField("eiimAttribute065");
	}

	/**
	 * Get eiimAttribute066
	 */
	@Column(name = "EIIM_ATTRIBUTE_066")
	public String getEiimAttribute066() {
		return eiimAttribute066;
	}

	/**
	 * Set eiimAttribute066
	 */
	public void setEiimAttribute066(String eiimAttribute066) {
		this.eiimAttribute066 = eiimAttribute066;
		addValidField("eiimAttribute066");
	}

	/**
	 * Get eiimAttribute067
	 */
	@Column(name = "EIIM_ATTRIBUTE_067")
	public String getEiimAttribute067() {
		return eiimAttribute067;
	}

	/**
	 * Set eiimAttribute067
	 */
	public void setEiimAttribute067(String eiimAttribute067) {
		this.eiimAttribute067 = eiimAttribute067;
		addValidField("eiimAttribute067");
	}

	/**
	 * Get eiimAttribute068
	 */
	@Column(name = "EIIM_ATTRIBUTE_068")
	public String getEiimAttribute068() {
		return eiimAttribute068;
	}

	/**
	 * Set eiimAttribute068
	 */
	public void setEiimAttribute068(String eiimAttribute068) {
		this.eiimAttribute068 = eiimAttribute068;
		addValidField("eiimAttribute068");
	}

	/**
	 * Get eiimAttribute069
	 */
	@Column(name = "EIIM_ATTRIBUTE_069")
	public String getEiimAttribute069() {
		return eiimAttribute069;
	}

	/**
	 * Set eiimAttribute069
	 */
	public void setEiimAttribute069(String eiimAttribute069) {
		this.eiimAttribute069 = eiimAttribute069;
		addValidField("eiimAttribute069");
	}

	/**
	 * Get eiimAttribute070
	 */
	@Column(name = "EIIM_ATTRIBUTE_070")
	public String getEiimAttribute070() {
		return eiimAttribute070;
	}

	/**
	 * Set eiimAttribute070
	 */
	public void setEiimAttribute070(String eiimAttribute070) {
		this.eiimAttribute070 = eiimAttribute070;
		addValidField("eiimAttribute070");
	}

	/**
	 * Get eiimAttribute071
	 */
	@Column(name = "EIIM_ATTRIBUTE_071")
	public String getEiimAttribute071() {
		return eiimAttribute071;
	}

	/**
	 * Set eiimAttribute071
	 */
	public void setEiimAttribute071(String eiimAttribute071) {
		this.eiimAttribute071 = eiimAttribute071;
		addValidField("eiimAttribute071");
	}

	/**
	 * Get eiimAttribute072
	 */
	@Column(name = "EIIM_ATTRIBUTE_072")
	public String getEiimAttribute072() {
		return eiimAttribute072;
	}

	/**
	 * Set eiimAttribute072
	 */
	public void setEiimAttribute072(String eiimAttribute072) {
		this.eiimAttribute072 = eiimAttribute072;
		addValidField("eiimAttribute072");
	}

	/**
	 * Get eiimAttribute073
	 */
	@Column(name = "EIIM_ATTRIBUTE_073")
	public String getEiimAttribute073() {
		return eiimAttribute073;
	}

	/**
	 * Set eiimAttribute073
	 */
	public void setEiimAttribute073(String eiimAttribute073) {
		this.eiimAttribute073 = eiimAttribute073;
		addValidField("eiimAttribute073");
	}

	/**
	 * Get eiimAttribute074
	 */
	@Column(name = "EIIM_ATTRIBUTE_074")
	public String getEiimAttribute074() {
		return eiimAttribute074;
	}

	/**
	 * Set eiimAttribute074
	 */
	public void setEiimAttribute074(String eiimAttribute074) {
		this.eiimAttribute074 = eiimAttribute074;
		addValidField("eiimAttribute074");
	}

	/**
	 * Get eiimAttribute075
	 */
	@Column(name = "EIIM_ATTRIBUTE_075")
	public String getEiimAttribute075() {
		return eiimAttribute075;
	}

	/**
	 * Set eiimAttribute075
	 */
	public void setEiimAttribute075(String eiimAttribute075) {
		this.eiimAttribute075 = eiimAttribute075;
		addValidField("eiimAttribute075");
	}

	/**
	 * Get eiimAttribute076
	 */
	@Column(name = "EIIM_ATTRIBUTE_076")
	public String getEiimAttribute076() {
		return eiimAttribute076;
	}

	/**
	 * Set eiimAttribute076
	 */
	public void setEiimAttribute076(String eiimAttribute076) {
		this.eiimAttribute076 = eiimAttribute076;
		addValidField("eiimAttribute076");
	}

	/**
	 * Get eiimAttribute077
	 */
	@Column(name = "EIIM_ATTRIBUTE_077")
	public String getEiimAttribute077() {
		return eiimAttribute077;
	}

	/**
	 * Set eiimAttribute077
	 */
	public void setEiimAttribute077(String eiimAttribute077) {
		this.eiimAttribute077 = eiimAttribute077;
		addValidField("eiimAttribute077");
	}

	/**
	 * Get eiimAttribute078
	 */
	@Column(name = "EIIM_ATTRIBUTE_078")
	public String getEiimAttribute078() {
		return eiimAttribute078;
	}

	/**
	 * Set eiimAttribute078
	 */
	public void setEiimAttribute078(String eiimAttribute078) {
		this.eiimAttribute078 = eiimAttribute078;
		addValidField("eiimAttribute078");
	}

	/**
	 * Get eiimAttribute079
	 */
	@Column(name = "EIIM_ATTRIBUTE_079")
	public String getEiimAttribute079() {
		return eiimAttribute079;
	}

	/**
	 * Set eiimAttribute079
	 */
	public void setEiimAttribute079(String eiimAttribute079) {
		this.eiimAttribute079 = eiimAttribute079;
		addValidField("eiimAttribute079");
	}

	/**
	 * Get eiimAttribute080
	 */
	@Column(name = "EIIM_ATTRIBUTE_080")
	public String getEiimAttribute080() {
		return eiimAttribute080;
	}

	/**
	 * Set eiimAttribute080
	 */
	public void setEiimAttribute080(String eiimAttribute080) {
		this.eiimAttribute080 = eiimAttribute080;
		addValidField("eiimAttribute080");
	}

	/**
	 * Get eiimAttribute081
	 */
	@Column(name = "EIIM_ATTRIBUTE_081")
	public String getEiimAttribute081() {
		return eiimAttribute081;
	}

	/**
	 * Set eiimAttribute081
	 */
	public void setEiimAttribute081(String eiimAttribute081) {
		this.eiimAttribute081 = eiimAttribute081;
		addValidField("eiimAttribute081");
	}

	/**
	 * Get eiimAttribute082
	 */
	@Column(name = "EIIM_ATTRIBUTE_082")
	public String getEiimAttribute082() {
		return eiimAttribute082;
	}

	/**
	 * Set eiimAttribute082
	 */
	public void setEiimAttribute082(String eiimAttribute082) {
		this.eiimAttribute082 = eiimAttribute082;
		addValidField("eiimAttribute082");
	}

	/**
	 * Get eiimAttribute083
	 */
	@Column(name = "EIIM_ATTRIBUTE_083")
	public String getEiimAttribute083() {
		return eiimAttribute083;
	}

	/**
	 * Set eiimAttribute083
	 */
	public void setEiimAttribute083(String eiimAttribute083) {
		this.eiimAttribute083 = eiimAttribute083;
		addValidField("eiimAttribute083");
	}

	/**
	 * Get eiimAttribute084
	 */
	@Column(name = "EIIM_ATTRIBUTE_084")
	public String getEiimAttribute084() {
		return eiimAttribute084;
	}

	/**
	 * Set eiimAttribute084
	 */
	public void setEiimAttribute084(String eiimAttribute084) {
		this.eiimAttribute084 = eiimAttribute084;
		addValidField("eiimAttribute084");
	}

	/**
	 * Get eiimAttribute085
	 */
	@Column(name = "EIIM_ATTRIBUTE_085")
	public String getEiimAttribute085() {
		return eiimAttribute085;
	}

	/**
	 * Set eiimAttribute085
	 */
	public void setEiimAttribute085(String eiimAttribute085) {
		this.eiimAttribute085 = eiimAttribute085;
		addValidField("eiimAttribute085");
	}

	/**
	 * Get eiimAttribute086
	 */
	@Column(name = "EIIM_ATTRIBUTE_086")
	public String getEiimAttribute086() {
		return eiimAttribute086;
	}

	/**
	 * Set eiimAttribute086
	 */
	public void setEiimAttribute086(String eiimAttribute086) {
		this.eiimAttribute086 = eiimAttribute086;
		addValidField("eiimAttribute086");
	}

	/**
	 * Get eiimAttribute087
	 */
	@Column(name = "EIIM_ATTRIBUTE_087")
	public String getEiimAttribute087() {
		return eiimAttribute087;
	}

	/**
	 * Set eiimAttribute087
	 */
	public void setEiimAttribute087(String eiimAttribute087) {
		this.eiimAttribute087 = eiimAttribute087;
		addValidField("eiimAttribute087");
	}

	/**
	 * Get eiimAttribute088
	 */
	@Column(name = "EIIM_ATTRIBUTE_088")
	public String getEiimAttribute088() {
		return eiimAttribute088;
	}

	/**
	 * Set eiimAttribute088
	 */
	public void setEiimAttribute088(String eiimAttribute088) {
		this.eiimAttribute088 = eiimAttribute088;
		addValidField("eiimAttribute088");
	}

	/**
	 * Get eiimAttribute089
	 */
	@Column(name = "EIIM_ATTRIBUTE_089")
	public String getEiimAttribute089() {
		return eiimAttribute089;
	}

	/**
	 * Set eiimAttribute089
	 */
	public void setEiimAttribute089(String eiimAttribute089) {
		this.eiimAttribute089 = eiimAttribute089;
		addValidField("eiimAttribute089");
	}

	/**
	 * Get eiimAttribute090
	 */
	@Column(name = "EIIM_ATTRIBUTE_090")
	public String getEiimAttribute090() {
		return eiimAttribute090;
	}

	/**
	 * Set eiimAttribute090
	 */
	public void setEiimAttribute090(String eiimAttribute090) {
		this.eiimAttribute090 = eiimAttribute090;
		addValidField("eiimAttribute090");
	}

	/**
	 * Get eiimAttribute091
	 */
	@Column(name = "EIIM_ATTRIBUTE_091")
	public String getEiimAttribute091() {
		return eiimAttribute091;
	}

	/**
	 * Set eiimAttribute091
	 */
	public void setEiimAttribute091(String eiimAttribute091) {
		this.eiimAttribute091 = eiimAttribute091;
		addValidField("eiimAttribute091");
	}

	/**
	 * Get eiimAttribute092
	 */
	@Column(name = "EIIM_ATTRIBUTE_092")
	public String getEiimAttribute092() {
		return eiimAttribute092;
	}

	/**
	 * Set eiimAttribute092
	 */
	public void setEiimAttribute092(String eiimAttribute092) {
		this.eiimAttribute092 = eiimAttribute092;
		addValidField("eiimAttribute092");
	}

	/**
	 * Get eiimAttribute093
	 */
	@Column(name = "EIIM_ATTRIBUTE_093")
	public String getEiimAttribute093() {
		return eiimAttribute093;
	}

	/**
	 * Set eiimAttribute093
	 */
	public void setEiimAttribute093(String eiimAttribute093) {
		this.eiimAttribute093 = eiimAttribute093;
		addValidField("eiimAttribute093");
	}

	/**
	 * Get eiimAttribute094
	 */
	@Column(name = "EIIM_ATTRIBUTE_094")
	public String getEiimAttribute094() {
		return eiimAttribute094;
	}

	/**
	 * Set eiimAttribute094
	 */
	public void setEiimAttribute094(String eiimAttribute094) {
		this.eiimAttribute094 = eiimAttribute094;
		addValidField("eiimAttribute094");
	}

	/**
	 * Get eiimAttribute095
	 */
	@Column(name = "EIIM_ATTRIBUTE_095")
	public String getEiimAttribute095() {
		return eiimAttribute095;
	}

	/**
	 * Set eiimAttribute095
	 */
	public void setEiimAttribute095(String eiimAttribute095) {
		this.eiimAttribute095 = eiimAttribute095;
		addValidField("eiimAttribute095");
	}

	/**
	 * Get eiimAttribute096
	 */
	@Column(name = "EIIM_ATTRIBUTE_096")
	public String getEiimAttribute096() {
		return eiimAttribute096;
	}

	/**
	 * Set eiimAttribute096
	 */
	public void setEiimAttribute096(String eiimAttribute096) {
		this.eiimAttribute096 = eiimAttribute096;
		addValidField("eiimAttribute096");
	}

	/**
	 * Get eiimAttribute097
	 */
	@Column(name = "EIIM_ATTRIBUTE_097")
	public String getEiimAttribute097() {
		return eiimAttribute097;
	}

	/**
	 * Set eiimAttribute097
	 */
	public void setEiimAttribute097(String eiimAttribute097) {
		this.eiimAttribute097 = eiimAttribute097;
		addValidField("eiimAttribute097");
	}

	/**
	 * Get eiimAttribute098
	 */
	@Column(name = "EIIM_ATTRIBUTE_098")
	public String getEiimAttribute098() {
		return eiimAttribute098;
	}

	/**
	 * Set eiimAttribute098
	 */
	public void setEiimAttribute098(String eiimAttribute098) {
		this.eiimAttribute098 = eiimAttribute098;
		addValidField("eiimAttribute098");
	}

	/**
	 * Get eiimAttribute099
	 */
	@Column(name = "EIIM_ATTRIBUTE_099")
	public String getEiimAttribute099() {
		return eiimAttribute099;
	}

	/**
	 * Set eiimAttribute099
	 */
	public void setEiimAttribute099(String eiimAttribute099) {
		this.eiimAttribute099 = eiimAttribute099;
		addValidField("eiimAttribute099");
	}

	/**
	 * Get eiimAttribute100
	 */
	@Column(name = "EIIM_ATTRIBUTE_100")
	public String getEiimAttribute100() {
		return eiimAttribute100;
	}

	/**
	 * Set eiimAttribute100
	 */
	public void setEiimAttribute100(String eiimAttribute100) {
		this.eiimAttribute100 = eiimAttribute100;
		addValidField("eiimAttribute100");
	}

	/**
	 * Get hdFilename
	 */
	@Column(name = "HD_FILENAME")
	public String getHdFilename() {
		return hdFilename;
	}

	/**
	 * Set hdFilename
	 */
	public void setHdFilename(String hdFilename) {
		this.hdFilename = hdFilename;
		addValidField("hdFilename");
	}

	/**
	 * Get hdBatchnumber
	 */
	@Column(name = "HD_BATCHNUMBER")
	public String getHdBatchnumber() {
		return hdBatchnumber;
	}

	/**
	 * Set hdBatchnumber
	 */
	public void setHdBatchnumber(String hdBatchnumber) {
		this.hdBatchnumber = hdBatchnumber;
		addValidField("hdBatchnumber");
	}

	/**
	 * Get hdSymbol
	 */
	@Column(name = "HD_SYMBOL")
	public String getHdSymbol() {
		return hdSymbol;
	}

	/**
	 * Set hdSymbol
	 */
	public void setHdSymbol(String hdSymbol) {
		this.hdSymbol = hdSymbol;
		addValidField("hdSymbol");
	}

	/**
	 * Get hdBeginprocessingtime
	 */
	@Column(name = "HD_BEGINPROCESSINGTIME")
	public Date getHdBeginprocessingtime() {
		return hdBeginprocessingtime;
	}

	/**
	 * Set hdBeginprocessingtime
	 */
	public void setHdBeginprocessingtime(Date hdBeginprocessingtime) {
		this.hdBeginprocessingtime = hdBeginprocessingtime;
		addValidField("hdBeginprocessingtime");
	}

	/**
	 * Get hdLastmodifiedtime
	 */
	@Column(name = "HD_LASTMODIFIEDTIME")
	public Date getHdLastmodifiedtime() {
		return hdLastmodifiedtime;
	}

	/**
	 * Set hdLastmodifiedtime
	 */
	public void setHdLastmodifiedtime(Date hdLastmodifiedtime) {
		this.hdLastmodifiedtime = hdLastmodifiedtime;
		addValidField("hdLastmodifiedtime");
	}

	/**
	 * Get hdInformation
	 */
	@Column(name = "HD_INFORMATION")
	public String getHdInformation() {
		return hdInformation;
	}

	/**
	 * Set hdInformation
	 */
	public void setHdInformation(String hdInformation) {
		this.hdInformation = hdInformation;
		addValidField("hdInformation");
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

	/**
	 * Get eiimPStatus
	 */
	@Column(name = "EIIM_P_STATUS")
	public String getEiimPStatus() {
		return eiimPStatus;
	}

	/**
	 * Set eiimPStatus
	 */
	public void setEiimPStatus(String eiimPStatus) {
		this.eiimPStatus = eiimPStatus;
		addValidField("eiimPStatus");
	}

	/**
	 * Get eiimRStatus
	 */
	@Column(name = "EIIM_R_STATUS")
	public String getEiimRStatus() {
		return eiimRStatus;
	}

	/**
	 * Set eiimRStatus
	 */
	public void setEiimRStatus(String eiimRStatus) {
		this.eiimRStatus = eiimRStatus;
		addValidField("eiimRStatus");
	}

	/**
	 * Get eiimREsusUserNameCn
	 */
	@Column(name = "EIIM_R_ESUS_USER_NAME_CN")
	public String getEiimREsusUserNameCn() {
		return eiimREsusUserNameCn;
	}

	/**
	 * Set eiimREsusUserNameCn
	 */
	public void setEiimREsusUserNameCn(String eiimREsusUserNameCn) {
		this.eiimREsusUserNameCn = eiimREsusUserNameCn;
		addValidField("eiimREsusUserNameCn");
	}

	/**
	 * Get eiimRTime
	 */
	@Column(name = "EIIM_R_TIME")
	public String getEiimRTime() {
		return eiimRTime;
	}

	/**
	 * Set eiimRTime
	 */
	public void setEiimRTime(String eiimRTime) {
		this.eiimRTime = eiimRTime;
		addValidField("eiimRTime");
	}

	/**
	 * Get eiimPEsusUserNameCn
	 */
	@Column(name = "EIIM_P_ESUS_USER_NAME_CN")
	public String getEiimPEsusUserNameCn() {
		return eiimPEsusUserNameCn;
	}

	/**
	 * Set eiimPEsusUserNameCn
	 */
	public void setEiimPEsusUserNameCn(String eiimPEsusUserNameCn) {
		this.eiimPEsusUserNameCn = eiimPEsusUserNameCn;
		addValidField("eiimPEsusUserNameCn");
	}

	/**
	 * Get eiimPTime
	 */
	@Column(name = "EIIM_P_TIME")
	public String getEiimPTime() {
		return eiimPTime;
	}

	/**
	 * Set eiimPTime
	 */
	public void setEiimPTime(String eiimPTime) {
		this.eiimPTime = eiimPTime;
		addValidField("eiimPTime");
	}

	/**
	 * Get eiimDpNumber
	 */
	@Column(name = "EIIM_DP_NUMBER")
	public String getEiimDpNumber() {
		return eiimDpNumber;
	}

	/**
	 * Set eiimDpNumber
	 */
	public void setEiimDpNumber(String eiimDpNumber) {
		this.eiimDpNumber = eiimDpNumber;
		addValidField("eiimDpNumber");
	}

}
