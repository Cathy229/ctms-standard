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
 * Model class for EfBmsIm
 */
@Entity
@Table(name = "EF_BMS_IM")
public class EfBmsImModel extends BaseModel implements OperationLog {

	//efbmId
	private Long efbmId;
	//efbmEscoId
	private Long efbmEscoId;
	//efbmEscoCompanyNo
	private String efbmEscoCompanyNo;
	//efbmIsDutyfree
	private Long efbmIsDutyfree;
	//efbmImType
	private String efbmImType;
	//efbmImId
	private Long efbmImId;
	//efbmBmsSourceId
	private String efbmBmsSourceId;
	//efbmREsusUserNameCn
	private String efbmREsusUserNameCn;
	//efbmRTime
	private Date efbmRTime;
	//efbmPEsusUserNameCn
	private String efbmPEsusUserNameCn;
	//efbmPTime
	private Date efbmPTime;
	//efbmFEsusUserNameCn
	private String efbmFEsusUserNameCn;
	//efbmFTime
	private Date efbmFTime;
	//efbmBmsStatus
	private Long efbmBmsStatus;
	//efbmBmsEsusUserNameCn
	private Long efbmBmsEsusUserNameCn;
	//efbmBmsTime
	private Date efbmBmsTime;
	//efbmInfo
	private String efbmInfo;
	//efbmSubstr1
	private String efbmSubstr1;
	//efbmSubstr2
	private String efbmSubstr2;
	//efbmSubdate1
	private Date efbmSubdate1;
	//efbmSubdate2
	private Date efbmSubdate2;
	//efbmSubnum1
	private Long efbmSubnum1;
	//eiabSubnum2
	private Long eiabSubnum2;
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
	//efbmEbotCode
	private String efbmEbotCode;
	//efbmEbbuCode
	private String efbmEbbuCode;
	//efbmEiimEscoCompanyNo
	private String efbmEiimEscoCompanyNo;
	//efbmSource
	private String efbmSource;
	//efbmEbbtCode
	private String efbmEbbtCode;
	//efbmStatus
	private Long efbmStatus;
	//efbmEsdeDepartmentCode
	private String efbmEsdeDepartmentCode;
	//efbmEbsmCode
	private String efbmEbsmCode;
	//efbmProjectCode
	private String efbmProjectCode;
	//efbmSourceId
	private String efbmSourceId;
	//efbmNumber
	private String efbmNumber;
	//efbmBusinessClass
	private String efbmBusinessClass;
	//efbmAcmpTime
	private Date efbmAcmpTime;
	//efbmAEbcuCustomerNo
	private String efbmAEbcuCustomerNo;
	//efbmSEbcuCustomerNo
	private String efbmSEbcuCustomerNo;
	//efbmIsOnlyFee
	private Long efbmIsOnlyFee;
	//efbmAttribute001
	private String efbmAttribute001;
	//efbmAttribute002
	private String efbmAttribute002;
	//efbmAttribute003
	private String efbmAttribute003;
	//efbmAttribute004
	private String efbmAttribute004;
	//efbmAttribute005
	private String efbmAttribute005;
	//efbmAttribute006
	private String efbmAttribute006;
	//efbmAttribute007
	private String efbmAttribute007;
	//efbmAttribute008
	private String efbmAttribute008;
	//efbmAttribute009
	private String efbmAttribute009;
	//efbmAttribute010
	private String efbmAttribute010;
	//efbmAttribute011
	private String efbmAttribute011;
	//efbmAttribute012
	private String efbmAttribute012;
	//efbmAttribute013
	private String efbmAttribute013;
	//efbmAttribute014
	private String efbmAttribute014;
	//efbmAttribute015
	private String efbmAttribute015;
	//efbmAttribute016
	private String efbmAttribute016;
	//efbmAttribute017
	private String efbmAttribute017;
	//efbmAttribute018
	private String efbmAttribute018;
	//efbmAttribute019
	private String efbmAttribute019;
	//efbmAttribute020
	private String efbmAttribute020;
	//efbmAttribute021
	private String efbmAttribute021;
	//efbmAttribute022
	private String efbmAttribute022;
	//efbmAttribute023
	private String efbmAttribute023;
	//efbmAttribute024
	private String efbmAttribute024;
	//efbmAttribute025
	private String efbmAttribute025;
	//efbmAttribute026
	private String efbmAttribute026;
	//efbmAttribute027
	private String efbmAttribute027;
	//efbmAttribute028
	private String efbmAttribute028;
	//efbmAttribute029
	private String efbmAttribute029;
	//efbmAttribute030
	private String efbmAttribute030;
	//efbmAttribute031
	private String efbmAttribute031;
	//efbmAttribute032
	private String efbmAttribute032;
	//efbmAttribute033
	private String efbmAttribute033;
	//efbmAttribute034
	private String efbmAttribute034;
	//efbmAttribute035
	private String efbmAttribute035;
	//efbmAttribute036
	private String efbmAttribute036;
	//efbmAttribute037
	private String efbmAttribute037;
	//efbmAttribute038
	private String efbmAttribute038;
	//efbmAttribute039
	private String efbmAttribute039;
	//efbmAttribute040
	private String efbmAttribute040;
	//efbmAttribute041
	private String efbmAttribute041;
	//efbmAttribute042
	private String efbmAttribute042;
	//efbmAttribute043
	private String efbmAttribute043;
	//efbmAttribute044
	private String efbmAttribute044;
	//efbmAttribute045
	private String efbmAttribute045;
	//efbmAttribute046
	private String efbmAttribute046;
	//efbmAttribute047
	private String efbmAttribute047;
	//efbmAttribute048
	private String efbmAttribute048;
	//efbmAttribute049
	private String efbmAttribute049;
	//efbmAttribute050
	private String efbmAttribute050;
	//efbmAttribute051
	private String efbmAttribute051;
	//efbmAttribute052
	private String efbmAttribute052;
	//efbmAttribute053
	private String efbmAttribute053;
	//efbmAttribute054
	private String efbmAttribute054;
	//efbmAttribute055
	private String efbmAttribute055;
	//efbmAttribute056
	private String efbmAttribute056;
	//efbmAttribute057
	private String efbmAttribute057;
	//efbmAttribute058
	private String efbmAttribute058;
	//efbmAttribute059
	private String efbmAttribute059;
	//efbmAttribute060
	private String efbmAttribute060;
	//efbmAttribute061
	private String efbmAttribute061;
	//efbmAttribute062
	private String efbmAttribute062;
	//efbmAttribute063
	private String efbmAttribute063;
	//efbmAttribute064
	private String efbmAttribute064;
	//efbmAttribute065
	private String efbmAttribute065;
	//efbmAttribute066
	private String efbmAttribute066;
	//efbmAttribute067
	private String efbmAttribute067;
	//efbmAttribute068
	private String efbmAttribute068;
	//efbmAttribute069
	private String efbmAttribute069;
	//efbmAttribute070
	private String efbmAttribute070;
	//efbmAttribute071
	private String efbmAttribute071;
	//efbmAttribute072
	private String efbmAttribute072;
	//efbmAttribute073
	private String efbmAttribute073;
	//efbmAttribute074
	private String efbmAttribute074;
	//efbmAttribute075
	private String efbmAttribute075;
	//efbmAttribute076
	private String efbmAttribute076;
	//efbmAttribute077
	private String efbmAttribute077;
	//efbmAttribute078
	private String efbmAttribute078;
	//efbmAttribute079
	private String efbmAttribute079;
	//efbmAttribute080
	private String efbmAttribute080;
	//efbmAttribute081
	private String efbmAttribute081;
	//efbmAttribute082
	private String efbmAttribute082;
	//efbmAttribute083
	private String efbmAttribute083;
	//efbmAttribute084
	private String efbmAttribute084;
	//efbmAttribute085
	private String efbmAttribute085;
	//efbmAttribute086
	private String efbmAttribute086;
	//efbmAttribute087
	private String efbmAttribute087;
	//efbmAttribute088
	private String efbmAttribute088;
	//efbmAttribute089
	private String efbmAttribute089;
	//efbmAttribute090
	private String efbmAttribute090;
	//efbmAttribute091
	private String efbmAttribute091;
	//efbmAttribute092
	private String efbmAttribute092;
	//efbmAttribute093
	private String efbmAttribute093;
	//efbmAttribute094
	private String efbmAttribute094;
	//efbmAttribute095
	private String efbmAttribute095;
	//efbmAttribute096
	private String efbmAttribute096;
	//efbmAttribute097
	private String efbmAttribute097;
	//efbmAttribute098
	private String efbmAttribute098;
	//efbmAttribute099
	private String efbmAttribute099;
	//efbmAttribute100
	private String efbmAttribute100;
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
	//efbmDpNumber
	private String efbmDpNumber;
	//efbmSubCarrierId
	private Long efbmSubCarrierId;
	//efbmSubCarrierCode
	private String efbmSubCarrierCode;
	//efbmSubCarrierName
	private String efbmSubCarrierName;
	//efbmMainCarrierId
	private Long efbmMainCarrierId;
	//efbmMainCarrierCode
	private String efbmMainCarrierCode;
	//efbmMainCarrierName
	private String efbmMainCarrierName;
	//efbmLoadPortId
	private Long efbmLoadPortId;
	//efbmLoadPortCode
	private String efbmLoadPortCode;
	//efbmLoadPortName
	private String efbmLoadPortName;
	//efbmDischargePortId
	private Long efbmDischargePortId;
	//efbmDischargePortCode
	private String efbmDischargePortCode;
	//efbmDischargePortName
	private String efbmDischargePortName;
	//efbmAgentId
	private Long efbmAgentId;
	//efbmAgentCode
	private String efbmAgentCode;
	//efbmAgentName
	private String efbmAgentName;
	//efbmBookingAgentId
	private Long efbmBookingAgentId;
	//efbmBookingAgentCode
	private String efbmBookingAgentCode;
	//efbmBookingAgentName
	private String efbmBookingAgentName;
	//efbmSailingDate
	private Date efbmSailingDate;
	//efbmEtd
	private Date efbmEtd;
	//efbmIsTransport
	private String efbmIsTransport;
	//efbmIsStorage
	private String efbmIsStorage;
	//efbmIsAgent
	private String efbmIsAgent;
	//efbmIsAdd
	private String efbmIsAdd;
	//efbmOutInStoreTime
	private Date efbmOutInStoreTime;
	//efbmDeliveryTime
	private Date efbmDeliveryTime;
	//efbmShipperCountryId
	private Long efbmShipperCountryId;
	//efbmShipperCountryCode
	private String efbmShipperCountryCode;
	//efbmShipperCountryName
	private String efbmShipperCountryName;
	//efbmConsigneeCountryId
	private Long efbmConsigneeCountryId;
	//efbmConsigneeCountryCode
	private String efbmConsigneeCountryCode;
	//efbmConsigneeCountryName
	private String efbmConsigneeCountryName;
	//efbmShipperCityId
	private Long efbmShipperCityId;
	//efbmShipperCityQuickCode
	private String efbmShipperCityQuickCode;
	//efbmShipperCityName
	private String efbmShipperCityName;
	//efbmConsigneeCityId
	private Long efbmConsigneeCityId;
	//efbmConsigneeCityQuickCode
	private String efbmConsigneeCityQuickCode;
	//efbmConsigneeCityName
	private String efbmConsigneeCityName;

	/**
	 * Get efbmId
	 */
	@Column(name = "EFBM_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEfbmId() {
		return efbmId;
	}

	/**
	 * Set efbmId
	 */
	public void setEfbmId(Long efbmId) {
		this.efbmId = efbmId;
		addValidField("efbmId");
	}

	/**
	 * Get efbmEscoId
	 */
	@Column(name = "EFBM_ESCO_ID")
	public Long getEfbmEscoId() {
		return efbmEscoId;
	}

	/**
	 * Set efbmEscoId
	 */
	public void setEfbmEscoId(Long efbmEscoId) {
		this.efbmEscoId = efbmEscoId;
		addValidField("efbmEscoId");
	}

	/**
	 * Get efbmEscoCompanyNo
	 */
	@Column(name = "EFBM_ESCO_COMPANY_NO")
	public String getEfbmEscoCompanyNo() {
		return efbmEscoCompanyNo;
	}

	/**
	 * Set efbmEscoCompanyNo
	 */
	public void setEfbmEscoCompanyNo(String efbmEscoCompanyNo) {
		this.efbmEscoCompanyNo = efbmEscoCompanyNo;
		addValidField("efbmEscoCompanyNo");
	}

	/**
	 * Get efbmIsDutyfree
	 */
	@Column(name = "EFBM_IS_DUTYFREE")
	public Long getEfbmIsDutyfree() {
		return efbmIsDutyfree;
	}

	/**
	 * Set efbmIsDutyfree
	 */
	public void setEfbmIsDutyfree(Long efbmIsDutyfree) {
		this.efbmIsDutyfree = efbmIsDutyfree;
		addValidField("efbmIsDutyfree");
	}

	/**
	 * Get efbmImType
	 */
	@Column(name = "EFBM_IM_TYPE")
	public String getEfbmImType() {
		return efbmImType;
	}

	/**
	 * Set efbmImType
	 */
	public void setEfbmImType(String efbmImType) {
		this.efbmImType = efbmImType;
		addValidField("efbmImType");
	}

	/**
	 * Get efbmImId
	 */
	@Column(name = "EFBM_IM_ID")
	public Long getEfbmImId() {
		return efbmImId;
	}

	/**
	 * Set efbmImId
	 */
	public void setEfbmImId(Long efbmImId) {
		this.efbmImId = efbmImId;
		addValidField("efbmImId");
	}

	/**
	 * Get efbmBmsSourceId
	 */
	@Column(name = "EFBM_BMS_SOURCE_ID")
	public String getEfbmBmsSourceId() {
		return efbmBmsSourceId;
	}

	/**
	 * Set efbmBmsSourceId
	 */
	public void setEfbmBmsSourceId(String efbmBmsSourceId) {
		this.efbmBmsSourceId = efbmBmsSourceId;
		addValidField("efbmBmsSourceId");
	}

	/**
	 * Get efbmREsusUserNameCn
	 */
	@Column(name = "EFBM_R_ESUS_USER_NAME_CN")
	public String getEfbmREsusUserNameCn() {
		return efbmREsusUserNameCn;
	}

	/**
	 * Set efbmREsusUserNameCn
	 */
	public void setEfbmREsusUserNameCn(String efbmREsusUserNameCn) {
		this.efbmREsusUserNameCn = efbmREsusUserNameCn;
		addValidField("efbmREsusUserNameCn");
	}

	/**
	 * Get efbmRTime
	 */
	@Column(name = "EFBM_R_TIME")
	public Date getEfbmRTime() {
		return efbmRTime;
	}

	/**
	 * Set efbmRTime
	 */
	public void setEfbmRTime(Date efbmRTime) {
		this.efbmRTime = efbmRTime;
		addValidField("efbmRTime");
	}

	/**
	 * Get efbmPEsusUserNameCn
	 */
	@Column(name = "EFBM_P_ESUS_USER_NAME_CN")
	public String getEfbmPEsusUserNameCn() {
		return efbmPEsusUserNameCn;
	}

	/**
	 * Set efbmPEsusUserNameCn
	 */
	public void setEfbmPEsusUserNameCn(String efbmPEsusUserNameCn) {
		this.efbmPEsusUserNameCn = efbmPEsusUserNameCn;
		addValidField("efbmPEsusUserNameCn");
	}

	/**
	 * Get efbmPTime
	 */
	@Column(name = "EFBM_P_TIME")
	public Date getEfbmPTime() {
		return efbmPTime;
	}

	/**
	 * Set efbmPTime
	 */
	public void setEfbmPTime(Date efbmPTime) {
		this.efbmPTime = efbmPTime;
		addValidField("efbmPTime");
	}

	/**
	 * Get efbmFEsusUserNameCn
	 */
	@Column(name = "EFBM_F_ESUS_USER_NAME_CN")
	public String getEfbmFEsusUserNameCn() {
		return efbmFEsusUserNameCn;
	}

	/**
	 * Set efbmFEsusUserNameCn
	 */
	public void setEfbmFEsusUserNameCn(String efbmFEsusUserNameCn) {
		this.efbmFEsusUserNameCn = efbmFEsusUserNameCn;
		addValidField("efbmFEsusUserNameCn");
	}

	/**
	 * Get efbmFTime
	 */
	@Column(name = "EFBM_F_TIME")
	public Date getEfbmFTime() {
		return efbmFTime;
	}

	/**
	 * Set efbmFTime
	 */
	public void setEfbmFTime(Date efbmFTime) {
		this.efbmFTime = efbmFTime;
		addValidField("efbmFTime");
	}

	/**
	 * Get efbmBmsStatus
	 */
	@Column(name = "EFBM_BMS_STATUS")
	public Long getEfbmBmsStatus() {
		return efbmBmsStatus;
	}

	/**
	 * Set efbmBmsStatus
	 */
	public void setEfbmBmsStatus(Long efbmBmsStatus) {
		this.efbmBmsStatus = efbmBmsStatus;
		addValidField("efbmBmsStatus");
	}

	/**
	 * Get efbmBmsEsusUserNameCn
	 */
	@Column(name = "EFBM_BMS_ESUS_USER_NAME_CN")
	public Long getEfbmBmsEsusUserNameCn() {
		return efbmBmsEsusUserNameCn;
	}

	/**
	 * Set efbmBmsEsusUserNameCn
	 */
	public void setEfbmBmsEsusUserNameCn(Long efbmBmsEsusUserNameCn) {
		this.efbmBmsEsusUserNameCn = efbmBmsEsusUserNameCn;
		addValidField("efbmBmsEsusUserNameCn");
	}

	/**
	 * Get efbmBmsTime
	 */
	@Column(name = "EFBM_BMS_TIME")
	public Date getEfbmBmsTime() {
		return efbmBmsTime;
	}

	/**
	 * Set efbmBmsTime
	 */
	public void setEfbmBmsTime(Date efbmBmsTime) {
		this.efbmBmsTime = efbmBmsTime;
		addValidField("efbmBmsTime");
	}

	/**
	 * Get efbmInfo
	 */
	@Column(name = "EFBM_INFO")
	public String getEfbmInfo() {
		return efbmInfo;
	}

	/**
	 * Set efbmInfo
	 */
	public void setEfbmInfo(String efbmInfo) {
		this.efbmInfo = efbmInfo;
		addValidField("efbmInfo");
	}

	/**
	 * Get efbmSubstr1
	 */
	@Column(name = "EFBM_SUBSTR1")
	public String getEfbmSubstr1() {
		return efbmSubstr1;
	}

	/**
	 * Set efbmSubstr1
	 */
	public void setEfbmSubstr1(String efbmSubstr1) {
		this.efbmSubstr1 = efbmSubstr1;
		addValidField("efbmSubstr1");
	}

	/**
	 * Get efbmSubstr2
	 */
	@Column(name = "EFBM_SUBSTR2")
	public String getEfbmSubstr2() {
		return efbmSubstr2;
	}

	/**
	 * Set efbmSubstr2
	 */
	public void setEfbmSubstr2(String efbmSubstr2) {
		this.efbmSubstr2 = efbmSubstr2;
		addValidField("efbmSubstr2");
	}

	/**
	 * Get efbmSubdate1
	 */
	@Column(name = "EFBM_SUBDATE1")
	public Date getEfbmSubdate1() {
		return efbmSubdate1;
	}

	/**
	 * Set efbmSubdate1
	 */
	public void setEfbmSubdate1(Date efbmSubdate1) {
		this.efbmSubdate1 = efbmSubdate1;
		addValidField("efbmSubdate1");
	}

	/**
	 * Get efbmSubdate2
	 */
	@Column(name = "EFBM_SUBDATE2")
	public Date getEfbmSubdate2() {
		return efbmSubdate2;
	}

	/**
	 * Set efbmSubdate2
	 */
	public void setEfbmSubdate2(Date efbmSubdate2) {
		this.efbmSubdate2 = efbmSubdate2;
		addValidField("efbmSubdate2");
	}

	/**
	 * Get efbmSubnum1
	 */
	@Column(name = "EFBM_SUBNUM1")
	public Long getEfbmSubnum1() {
		return efbmSubnum1;
	}

	/**
	 * Set efbmSubnum1
	 */
	public void setEfbmSubnum1(Long efbmSubnum1) {
		this.efbmSubnum1 = efbmSubnum1;
		addValidField("efbmSubnum1");
	}

	/**
	 * Get eiabSubnum2
	 */
	@Column(name = "EIAB_SUBNUM2")
	public Long getEiabSubnum2() {
		return eiabSubnum2;
	}

	/**
	 * Set eiabSubnum2
	 */
	public void setEiabSubnum2(Long eiabSubnum2) {
		this.eiabSubnum2 = eiabSubnum2;
		addValidField("eiabSubnum2");
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
	 * Get efbmEbotCode
	 */
	@Column(name = "EFBM_EBOT_CODE")
	public String getEfbmEbotCode() {
		return efbmEbotCode;
	}

	/**
	 * Set efbmEbotCode
	 */
	public void setEfbmEbotCode(String efbmEbotCode) {
		this.efbmEbotCode = efbmEbotCode;
		addValidField("efbmEbotCode");
	}

	/**
	 * Get efbmEbbuCode
	 */
	@Column(name = "EFBM_EBBU_CODE")
	public String getEfbmEbbuCode() {
		return efbmEbbuCode;
	}

	/**
	 * Set efbmEbbuCode
	 */
	public void setEfbmEbbuCode(String efbmEbbuCode) {
		this.efbmEbbuCode = efbmEbbuCode;
		addValidField("efbmEbbuCode");
	}

	/**
	 * Get efbmEiimEscoCompanyNo
	 */
	@Column(name = "EFBM_EIIM_ESCO_COMPANY_NO")
	public String getEfbmEiimEscoCompanyNo() {
		return efbmEiimEscoCompanyNo;
	}

	/**
	 * Set efbmEiimEscoCompanyNo
	 */
	public void setEfbmEiimEscoCompanyNo(String efbmEiimEscoCompanyNo) {
		this.efbmEiimEscoCompanyNo = efbmEiimEscoCompanyNo;
		addValidField("efbmEiimEscoCompanyNo");
	}

	/**
	 * Get efbmSource
	 */
	@Column(name = "EFBM_SOURCE")
	public String getEfbmSource() {
		return efbmSource;
	}

	/**
	 * Set efbmSource
	 */
	public void setEfbmSource(String efbmSource) {
		this.efbmSource = efbmSource;
		addValidField("efbmSource");
	}

	/**
	 * Get efbmEbbtCode
	 */
	@Column(name = "EFBM_EBBT_CODE")
	public String getEfbmEbbtCode() {
		return efbmEbbtCode;
	}

	/**
	 * Set efbmEbbtCode
	 */
	public void setEfbmEbbtCode(String efbmEbbtCode) {
		this.efbmEbbtCode = efbmEbbtCode;
		addValidField("efbmEbbtCode");
	}

	/**
	 * Get efbmStatus
	 */
	@Column(name = "EFBM_STATUS")
	public Long getEfbmStatus() {
		return efbmStatus;
	}

	/**
	 * Set efbmStatus
	 */
	public void setEfbmStatus(Long efbmStatus) {
		this.efbmStatus = efbmStatus;
		addValidField("efbmStatus");
	}

	/**
	 * Get efbmEsdeDepartmentCode
	 */
	@Column(name = "EFBM_ESDE_DEPARTMENT_CODE")
	public String getEfbmEsdeDepartmentCode() {
		return efbmEsdeDepartmentCode;
	}

	/**
	 * Set efbmEsdeDepartmentCode
	 */
	public void setEfbmEsdeDepartmentCode(String efbmEsdeDepartmentCode) {
		this.efbmEsdeDepartmentCode = efbmEsdeDepartmentCode;
		addValidField("efbmEsdeDepartmentCode");
	}

	/**
	 * Get efbmEbsmCode
	 */
	@Column(name = "EFBM_EBSM_CODE")
	public String getEfbmEbsmCode() {
		return efbmEbsmCode;
	}

	/**
	 * Set efbmEbsmCode
	 */
	public void setEfbmEbsmCode(String efbmEbsmCode) {
		this.efbmEbsmCode = efbmEbsmCode;
		addValidField("efbmEbsmCode");
	}

	/**
	 * Get efbmProjectCode
	 */
	@Column(name = "EFBM_PROJECT_CODE")
	public String getEfbmProjectCode() {
		return efbmProjectCode;
	}

	/**
	 * Set efbmProjectCode
	 */
	public void setEfbmProjectCode(String efbmProjectCode) {
		this.efbmProjectCode = efbmProjectCode;
		addValidField("efbmProjectCode");
	}

	/**
	 * Get efbmSourceId
	 */
	@Column(name = "EFBM_SOURCE_ID")
	public String getEfbmSourceId() {
		return efbmSourceId;
	}

	/**
	 * Set efbmSourceId
	 */
	public void setEfbmSourceId(String efbmSourceId) {
		this.efbmSourceId = efbmSourceId;
		addValidField("efbmSourceId");
	}

	/**
	 * Get efbmNumber
	 */
	@Column(name = "EFBM_NUMBER")
	public String getEfbmNumber() {
		return efbmNumber;
	}

	/**
	 * Set efbmNumber
	 */
	public void setEfbmNumber(String efbmNumber) {
		this.efbmNumber = efbmNumber;
		addValidField("efbmNumber");
	}

	/**
	 * Get efbmBusinessClass
	 */
	@Column(name = "EFBM_BUSINESS_CLASS")
	public String getEfbmBusinessClass() {
		return efbmBusinessClass;
	}

	/**
	 * Set efbmBusinessClass
	 */
	public void setEfbmBusinessClass(String efbmBusinessClass) {
		this.efbmBusinessClass = efbmBusinessClass;
		addValidField("efbmBusinessClass");
	}

	/**
	 * Get efbmAcmpTime
	 */
	@Column(name = "EFBM_ACMP_TIME")
	public Date getEfbmAcmpTime() {
		return efbmAcmpTime;
	}

	/**
	 * Set efbmAcmpTime
	 */
	public void setEfbmAcmpTime(Date efbmAcmpTime) {
		this.efbmAcmpTime = efbmAcmpTime;
		addValidField("efbmAcmpTime");
	}

	/**
	 * Get efbmAEbcuCustomerNo
	 */
	@Column(name = "EFBM_A_EBCU_CUSTOMER_NO")
	public String getEfbmAEbcuCustomerNo() {
		return efbmAEbcuCustomerNo;
	}

	/**
	 * Set efbmAEbcuCustomerNo
	 */
	public void setEfbmAEbcuCustomerNo(String efbmAEbcuCustomerNo) {
		this.efbmAEbcuCustomerNo = efbmAEbcuCustomerNo;
		addValidField("efbmAEbcuCustomerNo");
	}

	/**
	 * Get efbmSEbcuCustomerNo
	 */
	@Column(name = "EFBM_S_EBCU_CUSTOMER_NO")
	public String getEfbmSEbcuCustomerNo() {
		return efbmSEbcuCustomerNo;
	}

	/**
	 * Set efbmSEbcuCustomerNo
	 */
	public void setEfbmSEbcuCustomerNo(String efbmSEbcuCustomerNo) {
		this.efbmSEbcuCustomerNo = efbmSEbcuCustomerNo;
		addValidField("efbmSEbcuCustomerNo");
	}

	/**
	 * Get efbmIsOnlyFee
	 */
	@Column(name = "EFBM_IS_ONLY_FEE")
	public Long getEfbmIsOnlyFee() {
		return efbmIsOnlyFee;
	}

	/**
	 * Set efbmIsOnlyFee
	 */
	public void setEfbmIsOnlyFee(Long efbmIsOnlyFee) {
		this.efbmIsOnlyFee = efbmIsOnlyFee;
		addValidField("efbmIsOnlyFee");
	}

	/**
	 * Get efbmAttribute001
	 */
	@Column(name = "EFBM_ATTRIBUTE_001")
	public String getEfbmAttribute001() {
		return efbmAttribute001;
	}

	/**
	 * Set efbmAttribute001
	 */
	public void setEfbmAttribute001(String efbmAttribute001) {
		this.efbmAttribute001 = efbmAttribute001;
		addValidField("efbmAttribute001");
	}

	/**
	 * Get efbmAttribute002
	 */
	@Column(name = "EFBM_ATTRIBUTE_002")
	public String getEfbmAttribute002() {
		return efbmAttribute002;
	}

	/**
	 * Set efbmAttribute002
	 */
	public void setEfbmAttribute002(String efbmAttribute002) {
		this.efbmAttribute002 = efbmAttribute002;
		addValidField("efbmAttribute002");
	}

	/**
	 * Get efbmAttribute003
	 */
	@Column(name = "EFBM_ATTRIBUTE_003")
	public String getEfbmAttribute003() {
		return efbmAttribute003;
	}

	/**
	 * Set efbmAttribute003
	 */
	public void setEfbmAttribute003(String efbmAttribute003) {
		this.efbmAttribute003 = efbmAttribute003;
		addValidField("efbmAttribute003");
	}

	/**
	 * Get efbmAttribute004
	 */
	@Column(name = "EFBM_ATTRIBUTE_004")
	public String getEfbmAttribute004() {
		return efbmAttribute004;
	}

	/**
	 * Set efbmAttribute004
	 */
	public void setEfbmAttribute004(String efbmAttribute004) {
		this.efbmAttribute004 = efbmAttribute004;
		addValidField("efbmAttribute004");
	}

	/**
	 * Get efbmAttribute005
	 */
	@Column(name = "EFBM_ATTRIBUTE_005")
	public String getEfbmAttribute005() {
		return efbmAttribute005;
	}

	/**
	 * Set efbmAttribute005
	 */
	public void setEfbmAttribute005(String efbmAttribute005) {
		this.efbmAttribute005 = efbmAttribute005;
		addValidField("efbmAttribute005");
	}

	/**
	 * Get efbmAttribute006
	 */
	@Column(name = "EFBM_ATTRIBUTE_006")
	public String getEfbmAttribute006() {
		return efbmAttribute006;
	}

	/**
	 * Set efbmAttribute006
	 */
	public void setEfbmAttribute006(String efbmAttribute006) {
		this.efbmAttribute006 = efbmAttribute006;
		addValidField("efbmAttribute006");
	}

	/**
	 * Get efbmAttribute007
	 */
	@Column(name = "EFBM_ATTRIBUTE_007")
	public String getEfbmAttribute007() {
		return efbmAttribute007;
	}

	/**
	 * Set efbmAttribute007
	 */
	public void setEfbmAttribute007(String efbmAttribute007) {
		this.efbmAttribute007 = efbmAttribute007;
		addValidField("efbmAttribute007");
	}

	/**
	 * Get efbmAttribute008
	 */
	@Column(name = "EFBM_ATTRIBUTE_008")
	public String getEfbmAttribute008() {
		return efbmAttribute008;
	}

	/**
	 * Set efbmAttribute008
	 */
	public void setEfbmAttribute008(String efbmAttribute008) {
		this.efbmAttribute008 = efbmAttribute008;
		addValidField("efbmAttribute008");
	}

	/**
	 * Get efbmAttribute009
	 */
	@Column(name = "EFBM_ATTRIBUTE_009")
	public String getEfbmAttribute009() {
		return efbmAttribute009;
	}

	/**
	 * Set efbmAttribute009
	 */
	public void setEfbmAttribute009(String efbmAttribute009) {
		this.efbmAttribute009 = efbmAttribute009;
		addValidField("efbmAttribute009");
	}

	/**
	 * Get efbmAttribute010
	 */
	@Column(name = "EFBM_ATTRIBUTE_010")
	public String getEfbmAttribute010() {
		return efbmAttribute010;
	}

	/**
	 * Set efbmAttribute010
	 */
	public void setEfbmAttribute010(String efbmAttribute010) {
		this.efbmAttribute010 = efbmAttribute010;
		addValidField("efbmAttribute010");
	}

	/**
	 * Get efbmAttribute011
	 */
	@Column(name = "EFBM_ATTRIBUTE_011")
	public String getEfbmAttribute011() {
		return efbmAttribute011;
	}

	/**
	 * Set efbmAttribute011
	 */
	public void setEfbmAttribute011(String efbmAttribute011) {
		this.efbmAttribute011 = efbmAttribute011;
		addValidField("efbmAttribute011");
	}

	/**
	 * Get efbmAttribute012
	 */
	@Column(name = "EFBM_ATTRIBUTE_012")
	public String getEfbmAttribute012() {
		return efbmAttribute012;
	}

	/**
	 * Set efbmAttribute012
	 */
	public void setEfbmAttribute012(String efbmAttribute012) {
		this.efbmAttribute012 = efbmAttribute012;
		addValidField("efbmAttribute012");
	}

	/**
	 * Get efbmAttribute013
	 */
	@Column(name = "EFBM_ATTRIBUTE_013")
	public String getEfbmAttribute013() {
		return efbmAttribute013;
	}

	/**
	 * Set efbmAttribute013
	 */
	public void setEfbmAttribute013(String efbmAttribute013) {
		this.efbmAttribute013 = efbmAttribute013;
		addValidField("efbmAttribute013");
	}

	/**
	 * Get efbmAttribute014
	 */
	@Column(name = "EFBM_ATTRIBUTE_014")
	public String getEfbmAttribute014() {
		return efbmAttribute014;
	}

	/**
	 * Set efbmAttribute014
	 */
	public void setEfbmAttribute014(String efbmAttribute014) {
		this.efbmAttribute014 = efbmAttribute014;
		addValidField("efbmAttribute014");
	}

	/**
	 * Get efbmAttribute015
	 */
	@Column(name = "EFBM_ATTRIBUTE_015")
	public String getEfbmAttribute015() {
		return efbmAttribute015;
	}

	/**
	 * Set efbmAttribute015
	 */
	public void setEfbmAttribute015(String efbmAttribute015) {
		this.efbmAttribute015 = efbmAttribute015;
		addValidField("efbmAttribute015");
	}

	/**
	 * Get efbmAttribute016
	 */
	@Column(name = "EFBM_ATTRIBUTE_016")
	public String getEfbmAttribute016() {
		return efbmAttribute016;
	}

	/**
	 * Set efbmAttribute016
	 */
	public void setEfbmAttribute016(String efbmAttribute016) {
		this.efbmAttribute016 = efbmAttribute016;
		addValidField("efbmAttribute016");
	}

	/**
	 * Get efbmAttribute017
	 */
	@Column(name = "EFBM_ATTRIBUTE_017")
	public String getEfbmAttribute017() {
		return efbmAttribute017;
	}

	/**
	 * Set efbmAttribute017
	 */
	public void setEfbmAttribute017(String efbmAttribute017) {
		this.efbmAttribute017 = efbmAttribute017;
		addValidField("efbmAttribute017");
	}

	/**
	 * Get efbmAttribute018
	 */
	@Column(name = "EFBM_ATTRIBUTE_018")
	public String getEfbmAttribute018() {
		return efbmAttribute018;
	}

	/**
	 * Set efbmAttribute018
	 */
	public void setEfbmAttribute018(String efbmAttribute018) {
		this.efbmAttribute018 = efbmAttribute018;
		addValidField("efbmAttribute018");
	}

	/**
	 * Get efbmAttribute019
	 */
	@Column(name = "EFBM_ATTRIBUTE_019")
	public String getEfbmAttribute019() {
		return efbmAttribute019;
	}

	/**
	 * Set efbmAttribute019
	 */
	public void setEfbmAttribute019(String efbmAttribute019) {
		this.efbmAttribute019 = efbmAttribute019;
		addValidField("efbmAttribute019");
	}

	/**
	 * Get efbmAttribute020
	 */
	@Column(name = "EFBM_ATTRIBUTE_020")
	public String getEfbmAttribute020() {
		return efbmAttribute020;
	}

	/**
	 * Set efbmAttribute020
	 */
	public void setEfbmAttribute020(String efbmAttribute020) {
		this.efbmAttribute020 = efbmAttribute020;
		addValidField("efbmAttribute020");
	}

	/**
	 * Get efbmAttribute021
	 */
	@Column(name = "EFBM_ATTRIBUTE_021")
	public String getEfbmAttribute021() {
		return efbmAttribute021;
	}

	/**
	 * Set efbmAttribute021
	 */
	public void setEfbmAttribute021(String efbmAttribute021) {
		this.efbmAttribute021 = efbmAttribute021;
		addValidField("efbmAttribute021");
	}

	/**
	 * Get efbmAttribute022
	 */
	@Column(name = "EFBM_ATTRIBUTE_022")
	public String getEfbmAttribute022() {
		return efbmAttribute022;
	}

	/**
	 * Set efbmAttribute022
	 */
	public void setEfbmAttribute022(String efbmAttribute022) {
		this.efbmAttribute022 = efbmAttribute022;
		addValidField("efbmAttribute022");
	}

	/**
	 * Get efbmAttribute023
	 */
	@Column(name = "EFBM_ATTRIBUTE_023")
	public String getEfbmAttribute023() {
		return efbmAttribute023;
	}

	/**
	 * Set efbmAttribute023
	 */
	public void setEfbmAttribute023(String efbmAttribute023) {
		this.efbmAttribute023 = efbmAttribute023;
		addValidField("efbmAttribute023");
	}

	/**
	 * Get efbmAttribute024
	 */
	@Column(name = "EFBM_ATTRIBUTE_024")
	public String getEfbmAttribute024() {
		return efbmAttribute024;
	}

	/**
	 * Set efbmAttribute024
	 */
	public void setEfbmAttribute024(String efbmAttribute024) {
		this.efbmAttribute024 = efbmAttribute024;
		addValidField("efbmAttribute024");
	}

	/**
	 * Get efbmAttribute025
	 */
	@Column(name = "EFBM_ATTRIBUTE_025")
	public String getEfbmAttribute025() {
		return efbmAttribute025;
	}

	/**
	 * Set efbmAttribute025
	 */
	public void setEfbmAttribute025(String efbmAttribute025) {
		this.efbmAttribute025 = efbmAttribute025;
		addValidField("efbmAttribute025");
	}

	/**
	 * Get efbmAttribute026
	 */
	@Column(name = "EFBM_ATTRIBUTE_026")
	public String getEfbmAttribute026() {
		return efbmAttribute026;
	}

	/**
	 * Set efbmAttribute026
	 */
	public void setEfbmAttribute026(String efbmAttribute026) {
		this.efbmAttribute026 = efbmAttribute026;
		addValidField("efbmAttribute026");
	}

	/**
	 * Get efbmAttribute027
	 */
	@Column(name = "EFBM_ATTRIBUTE_027")
	public String getEfbmAttribute027() {
		return efbmAttribute027;
	}

	/**
	 * Set efbmAttribute027
	 */
	public void setEfbmAttribute027(String efbmAttribute027) {
		this.efbmAttribute027 = efbmAttribute027;
		addValidField("efbmAttribute027");
	}

	/**
	 * Get efbmAttribute028
	 */
	@Column(name = "EFBM_ATTRIBUTE_028")
	public String getEfbmAttribute028() {
		return efbmAttribute028;
	}

	/**
	 * Set efbmAttribute028
	 */
	public void setEfbmAttribute028(String efbmAttribute028) {
		this.efbmAttribute028 = efbmAttribute028;
		addValidField("efbmAttribute028");
	}

	/**
	 * Get efbmAttribute029
	 */
	@Column(name = "EFBM_ATTRIBUTE_029")
	public String getEfbmAttribute029() {
		return efbmAttribute029;
	}

	/**
	 * Set efbmAttribute029
	 */
	public void setEfbmAttribute029(String efbmAttribute029) {
		this.efbmAttribute029 = efbmAttribute029;
		addValidField("efbmAttribute029");
	}

	/**
	 * Get efbmAttribute030
	 */
	@Column(name = "EFBM_ATTRIBUTE_030")
	public String getEfbmAttribute030() {
		return efbmAttribute030;
	}

	/**
	 * Set efbmAttribute030
	 */
	public void setEfbmAttribute030(String efbmAttribute030) {
		this.efbmAttribute030 = efbmAttribute030;
		addValidField("efbmAttribute030");
	}

	/**
	 * Get efbmAttribute031
	 */
	@Column(name = "EFBM_ATTRIBUTE_031")
	public String getEfbmAttribute031() {
		return efbmAttribute031;
	}

	/**
	 * Set efbmAttribute031
	 */
	public void setEfbmAttribute031(String efbmAttribute031) {
		this.efbmAttribute031 = efbmAttribute031;
		addValidField("efbmAttribute031");
	}

	/**
	 * Get efbmAttribute032
	 */
	@Column(name = "EFBM_ATTRIBUTE_032")
	public String getEfbmAttribute032() {
		return efbmAttribute032;
	}

	/**
	 * Set efbmAttribute032
	 */
	public void setEfbmAttribute032(String efbmAttribute032) {
		this.efbmAttribute032 = efbmAttribute032;
		addValidField("efbmAttribute032");
	}

	/**
	 * Get efbmAttribute033
	 */
	@Column(name = "EFBM_ATTRIBUTE_033")
	public String getEfbmAttribute033() {
		return efbmAttribute033;
	}

	/**
	 * Set efbmAttribute033
	 */
	public void setEfbmAttribute033(String efbmAttribute033) {
		this.efbmAttribute033 = efbmAttribute033;
		addValidField("efbmAttribute033");
	}

	/**
	 * Get efbmAttribute034
	 */
	@Column(name = "EFBM_ATTRIBUTE_034")
	public String getEfbmAttribute034() {
		return efbmAttribute034;
	}

	/**
	 * Set efbmAttribute034
	 */
	public void setEfbmAttribute034(String efbmAttribute034) {
		this.efbmAttribute034 = efbmAttribute034;
		addValidField("efbmAttribute034");
	}

	/**
	 * Get efbmAttribute035
	 */
	@Column(name = "EFBM_ATTRIBUTE_035")
	public String getEfbmAttribute035() {
		return efbmAttribute035;
	}

	/**
	 * Set efbmAttribute035
	 */
	public void setEfbmAttribute035(String efbmAttribute035) {
		this.efbmAttribute035 = efbmAttribute035;
		addValidField("efbmAttribute035");
	}

	/**
	 * Get efbmAttribute036
	 */
	@Column(name = "EFBM_ATTRIBUTE_036")
	public String getEfbmAttribute036() {
		return efbmAttribute036;
	}

	/**
	 * Set efbmAttribute036
	 */
	public void setEfbmAttribute036(String efbmAttribute036) {
		this.efbmAttribute036 = efbmAttribute036;
		addValidField("efbmAttribute036");
	}

	/**
	 * Get efbmAttribute037
	 */
	@Column(name = "EFBM_ATTRIBUTE_037")
	public String getEfbmAttribute037() {
		return efbmAttribute037;
	}

	/**
	 * Set efbmAttribute037
	 */
	public void setEfbmAttribute037(String efbmAttribute037) {
		this.efbmAttribute037 = efbmAttribute037;
		addValidField("efbmAttribute037");
	}

	/**
	 * Get efbmAttribute038
	 */
	@Column(name = "EFBM_ATTRIBUTE_038")
	public String getEfbmAttribute038() {
		return efbmAttribute038;
	}

	/**
	 * Set efbmAttribute038
	 */
	public void setEfbmAttribute038(String efbmAttribute038) {
		this.efbmAttribute038 = efbmAttribute038;
		addValidField("efbmAttribute038");
	}

	/**
	 * Get efbmAttribute039
	 */
	@Column(name = "EFBM_ATTRIBUTE_039")
	public String getEfbmAttribute039() {
		return efbmAttribute039;
	}

	/**
	 * Set efbmAttribute039
	 */
	public void setEfbmAttribute039(String efbmAttribute039) {
		this.efbmAttribute039 = efbmAttribute039;
		addValidField("efbmAttribute039");
	}

	/**
	 * Get efbmAttribute040
	 */
	@Column(name = "EFBM_ATTRIBUTE_040")
	public String getEfbmAttribute040() {
		return efbmAttribute040;
	}

	/**
	 * Set efbmAttribute040
	 */
	public void setEfbmAttribute040(String efbmAttribute040) {
		this.efbmAttribute040 = efbmAttribute040;
		addValidField("efbmAttribute040");
	}

	/**
	 * Get efbmAttribute041
	 */
	@Column(name = "EFBM_ATTRIBUTE_041")
	public String getEfbmAttribute041() {
		return efbmAttribute041;
	}

	/**
	 * Set efbmAttribute041
	 */
	public void setEfbmAttribute041(String efbmAttribute041) {
		this.efbmAttribute041 = efbmAttribute041;
		addValidField("efbmAttribute041");
	}

	/**
	 * Get efbmAttribute042
	 */
	@Column(name = "EFBM_ATTRIBUTE_042")
	public String getEfbmAttribute042() {
		return efbmAttribute042;
	}

	/**
	 * Set efbmAttribute042
	 */
	public void setEfbmAttribute042(String efbmAttribute042) {
		this.efbmAttribute042 = efbmAttribute042;
		addValidField("efbmAttribute042");
	}

	/**
	 * Get efbmAttribute043
	 */
	@Column(name = "EFBM_ATTRIBUTE_043")
	public String getEfbmAttribute043() {
		return efbmAttribute043;
	}

	/**
	 * Set efbmAttribute043
	 */
	public void setEfbmAttribute043(String efbmAttribute043) {
		this.efbmAttribute043 = efbmAttribute043;
		addValidField("efbmAttribute043");
	}

	/**
	 * Get efbmAttribute044
	 */
	@Column(name = "EFBM_ATTRIBUTE_044")
	public String getEfbmAttribute044() {
		return efbmAttribute044;
	}

	/**
	 * Set efbmAttribute044
	 */
	public void setEfbmAttribute044(String efbmAttribute044) {
		this.efbmAttribute044 = efbmAttribute044;
		addValidField("efbmAttribute044");
	}

	/**
	 * Get efbmAttribute045
	 */
	@Column(name = "EFBM_ATTRIBUTE_045")
	public String getEfbmAttribute045() {
		return efbmAttribute045;
	}

	/**
	 * Set efbmAttribute045
	 */
	public void setEfbmAttribute045(String efbmAttribute045) {
		this.efbmAttribute045 = efbmAttribute045;
		addValidField("efbmAttribute045");
	}

	/**
	 * Get efbmAttribute046
	 */
	@Column(name = "EFBM_ATTRIBUTE_046")
	public String getEfbmAttribute046() {
		return efbmAttribute046;
	}

	/**
	 * Set efbmAttribute046
	 */
	public void setEfbmAttribute046(String efbmAttribute046) {
		this.efbmAttribute046 = efbmAttribute046;
		addValidField("efbmAttribute046");
	}

	/**
	 * Get efbmAttribute047
	 */
	@Column(name = "EFBM_ATTRIBUTE_047")
	public String getEfbmAttribute047() {
		return efbmAttribute047;
	}

	/**
	 * Set efbmAttribute047
	 */
	public void setEfbmAttribute047(String efbmAttribute047) {
		this.efbmAttribute047 = efbmAttribute047;
		addValidField("efbmAttribute047");
	}

	/**
	 * Get efbmAttribute048
	 */
	@Column(name = "EFBM_ATTRIBUTE_048")
	public String getEfbmAttribute048() {
		return efbmAttribute048;
	}

	/**
	 * Set efbmAttribute048
	 */
	public void setEfbmAttribute048(String efbmAttribute048) {
		this.efbmAttribute048 = efbmAttribute048;
		addValidField("efbmAttribute048");
	}

	/**
	 * Get efbmAttribute049
	 */
	@Column(name = "EFBM_ATTRIBUTE_049")
	public String getEfbmAttribute049() {
		return efbmAttribute049;
	}

	/**
	 * Set efbmAttribute049
	 */
	public void setEfbmAttribute049(String efbmAttribute049) {
		this.efbmAttribute049 = efbmAttribute049;
		addValidField("efbmAttribute049");
	}

	/**
	 * Get efbmAttribute050
	 */
	@Column(name = "EFBM_ATTRIBUTE_050")
	public String getEfbmAttribute050() {
		return efbmAttribute050;
	}

	/**
	 * Set efbmAttribute050
	 */
	public void setEfbmAttribute050(String efbmAttribute050) {
		this.efbmAttribute050 = efbmAttribute050;
		addValidField("efbmAttribute050");
	}

	/**
	 * Get efbmAttribute051
	 */
	@Column(name = "EFBM_ATTRIBUTE_051")
	public String getEfbmAttribute051() {
		return efbmAttribute051;
	}

	/**
	 * Set efbmAttribute051
	 */
	public void setEfbmAttribute051(String efbmAttribute051) {
		this.efbmAttribute051 = efbmAttribute051;
		addValidField("efbmAttribute051");
	}

	/**
	 * Get efbmAttribute052
	 */
	@Column(name = "EFBM_ATTRIBUTE_052")
	public String getEfbmAttribute052() {
		return efbmAttribute052;
	}

	/**
	 * Set efbmAttribute052
	 */
	public void setEfbmAttribute052(String efbmAttribute052) {
		this.efbmAttribute052 = efbmAttribute052;
		addValidField("efbmAttribute052");
	}

	/**
	 * Get efbmAttribute053
	 */
	@Column(name = "EFBM_ATTRIBUTE_053")
	public String getEfbmAttribute053() {
		return efbmAttribute053;
	}

	/**
	 * Set efbmAttribute053
	 */
	public void setEfbmAttribute053(String efbmAttribute053) {
		this.efbmAttribute053 = efbmAttribute053;
		addValidField("efbmAttribute053");
	}

	/**
	 * Get efbmAttribute054
	 */
	@Column(name = "EFBM_ATTRIBUTE_054")
	public String getEfbmAttribute054() {
		return efbmAttribute054;
	}

	/**
	 * Set efbmAttribute054
	 */
	public void setEfbmAttribute054(String efbmAttribute054) {
		this.efbmAttribute054 = efbmAttribute054;
		addValidField("efbmAttribute054");
	}

	/**
	 * Get efbmAttribute055
	 */
	@Column(name = "EFBM_ATTRIBUTE_055")
	public String getEfbmAttribute055() {
		return efbmAttribute055;
	}

	/**
	 * Set efbmAttribute055
	 */
	public void setEfbmAttribute055(String efbmAttribute055) {
		this.efbmAttribute055 = efbmAttribute055;
		addValidField("efbmAttribute055");
	}

	/**
	 * Get efbmAttribute056
	 */
	@Column(name = "EFBM_ATTRIBUTE_056")
	public String getEfbmAttribute056() {
		return efbmAttribute056;
	}

	/**
	 * Set efbmAttribute056
	 */
	public void setEfbmAttribute056(String efbmAttribute056) {
		this.efbmAttribute056 = efbmAttribute056;
		addValidField("efbmAttribute056");
	}

	/**
	 * Get efbmAttribute057
	 */
	@Column(name = "EFBM_ATTRIBUTE_057")
	public String getEfbmAttribute057() {
		return efbmAttribute057;
	}

	/**
	 * Set efbmAttribute057
	 */
	public void setEfbmAttribute057(String efbmAttribute057) {
		this.efbmAttribute057 = efbmAttribute057;
		addValidField("efbmAttribute057");
	}

	/**
	 * Get efbmAttribute058
	 */
	@Column(name = "EFBM_ATTRIBUTE_058")
	public String getEfbmAttribute058() {
		return efbmAttribute058;
	}

	/**
	 * Set efbmAttribute058
	 */
	public void setEfbmAttribute058(String efbmAttribute058) {
		this.efbmAttribute058 = efbmAttribute058;
		addValidField("efbmAttribute058");
	}

	/**
	 * Get efbmAttribute059
	 */
	@Column(name = "EFBM_ATTRIBUTE_059")
	public String getEfbmAttribute059() {
		return efbmAttribute059;
	}

	/**
	 * Set efbmAttribute059
	 */
	public void setEfbmAttribute059(String efbmAttribute059) {
		this.efbmAttribute059 = efbmAttribute059;
		addValidField("efbmAttribute059");
	}

	/**
	 * Get efbmAttribute060
	 */
	@Column(name = "EFBM_ATTRIBUTE_060")
	public String getEfbmAttribute060() {
		return efbmAttribute060;
	}

	/**
	 * Set efbmAttribute060
	 */
	public void setEfbmAttribute060(String efbmAttribute060) {
		this.efbmAttribute060 = efbmAttribute060;
		addValidField("efbmAttribute060");
	}

	/**
	 * Get efbmAttribute061
	 */
	@Column(name = "EFBM_ATTRIBUTE_061")
	public String getEfbmAttribute061() {
		return efbmAttribute061;
	}

	/**
	 * Set efbmAttribute061
	 */
	public void setEfbmAttribute061(String efbmAttribute061) {
		this.efbmAttribute061 = efbmAttribute061;
		addValidField("efbmAttribute061");
	}

	/**
	 * Get efbmAttribute062
	 */
	@Column(name = "EFBM_ATTRIBUTE_062")
	public String getEfbmAttribute062() {
		return efbmAttribute062;
	}

	/**
	 * Set efbmAttribute062
	 */
	public void setEfbmAttribute062(String efbmAttribute062) {
		this.efbmAttribute062 = efbmAttribute062;
		addValidField("efbmAttribute062");
	}

	/**
	 * Get efbmAttribute063
	 */
	@Column(name = "EFBM_ATTRIBUTE_063")
	public String getEfbmAttribute063() {
		return efbmAttribute063;
	}

	/**
	 * Set efbmAttribute063
	 */
	public void setEfbmAttribute063(String efbmAttribute063) {
		this.efbmAttribute063 = efbmAttribute063;
		addValidField("efbmAttribute063");
	}

	/**
	 * Get efbmAttribute064
	 */
	@Column(name = "EFBM_ATTRIBUTE_064")
	public String getEfbmAttribute064() {
		return efbmAttribute064;
	}

	/**
	 * Set efbmAttribute064
	 */
	public void setEfbmAttribute064(String efbmAttribute064) {
		this.efbmAttribute064 = efbmAttribute064;
		addValidField("efbmAttribute064");
	}

	/**
	 * Get efbmAttribute065
	 */
	@Column(name = "EFBM_ATTRIBUTE_065")
	public String getEfbmAttribute065() {
		return efbmAttribute065;
	}

	/**
	 * Set efbmAttribute065
	 */
	public void setEfbmAttribute065(String efbmAttribute065) {
		this.efbmAttribute065 = efbmAttribute065;
		addValidField("efbmAttribute065");
	}

	/**
	 * Get efbmAttribute066
	 */
	@Column(name = "EFBM_ATTRIBUTE_066")
	public String getEfbmAttribute066() {
		return efbmAttribute066;
	}

	/**
	 * Set efbmAttribute066
	 */
	public void setEfbmAttribute066(String efbmAttribute066) {
		this.efbmAttribute066 = efbmAttribute066;
		addValidField("efbmAttribute066");
	}

	/**
	 * Get efbmAttribute067
	 */
	@Column(name = "EFBM_ATTRIBUTE_067")
	public String getEfbmAttribute067() {
		return efbmAttribute067;
	}

	/**
	 * Set efbmAttribute067
	 */
	public void setEfbmAttribute067(String efbmAttribute067) {
		this.efbmAttribute067 = efbmAttribute067;
		addValidField("efbmAttribute067");
	}

	/**
	 * Get efbmAttribute068
	 */
	@Column(name = "EFBM_ATTRIBUTE_068")
	public String getEfbmAttribute068() {
		return efbmAttribute068;
	}

	/**
	 * Set efbmAttribute068
	 */
	public void setEfbmAttribute068(String efbmAttribute068) {
		this.efbmAttribute068 = efbmAttribute068;
		addValidField("efbmAttribute068");
	}

	/**
	 * Get efbmAttribute069
	 */
	@Column(name = "EFBM_ATTRIBUTE_069")
	public String getEfbmAttribute069() {
		return efbmAttribute069;
	}

	/**
	 * Set efbmAttribute069
	 */
	public void setEfbmAttribute069(String efbmAttribute069) {
		this.efbmAttribute069 = efbmAttribute069;
		addValidField("efbmAttribute069");
	}

	/**
	 * Get efbmAttribute070
	 */
	@Column(name = "EFBM_ATTRIBUTE_070")
	public String getEfbmAttribute070() {
		return efbmAttribute070;
	}

	/**
	 * Set efbmAttribute070
	 */
	public void setEfbmAttribute070(String efbmAttribute070) {
		this.efbmAttribute070 = efbmAttribute070;
		addValidField("efbmAttribute070");
	}

	/**
	 * Get efbmAttribute071
	 */
	@Column(name = "EFBM_ATTRIBUTE_071")
	public String getEfbmAttribute071() {
		return efbmAttribute071;
	}

	/**
	 * Set efbmAttribute071
	 */
	public void setEfbmAttribute071(String efbmAttribute071) {
		this.efbmAttribute071 = efbmAttribute071;
		addValidField("efbmAttribute071");
	}

	/**
	 * Get efbmAttribute072
	 */
	@Column(name = "EFBM_ATTRIBUTE_072")
	public String getEfbmAttribute072() {
		return efbmAttribute072;
	}

	/**
	 * Set efbmAttribute072
	 */
	public void setEfbmAttribute072(String efbmAttribute072) {
		this.efbmAttribute072 = efbmAttribute072;
		addValidField("efbmAttribute072");
	}

	/**
	 * Get efbmAttribute073
	 */
	@Column(name = "EFBM_ATTRIBUTE_073")
	public String getEfbmAttribute073() {
		return efbmAttribute073;
	}

	/**
	 * Set efbmAttribute073
	 */
	public void setEfbmAttribute073(String efbmAttribute073) {
		this.efbmAttribute073 = efbmAttribute073;
		addValidField("efbmAttribute073");
	}

	/**
	 * Get efbmAttribute074
	 */
	@Column(name = "EFBM_ATTRIBUTE_074")
	public String getEfbmAttribute074() {
		return efbmAttribute074;
	}

	/**
	 * Set efbmAttribute074
	 */
	public void setEfbmAttribute074(String efbmAttribute074) {
		this.efbmAttribute074 = efbmAttribute074;
		addValidField("efbmAttribute074");
	}

	/**
	 * Get efbmAttribute075
	 */
	@Column(name = "EFBM_ATTRIBUTE_075")
	public String getEfbmAttribute075() {
		return efbmAttribute075;
	}

	/**
	 * Set efbmAttribute075
	 */
	public void setEfbmAttribute075(String efbmAttribute075) {
		this.efbmAttribute075 = efbmAttribute075;
		addValidField("efbmAttribute075");
	}

	/**
	 * Get efbmAttribute076
	 */
	@Column(name = "EFBM_ATTRIBUTE_076")
	public String getEfbmAttribute076() {
		return efbmAttribute076;
	}

	/**
	 * Set efbmAttribute076
	 */
	public void setEfbmAttribute076(String efbmAttribute076) {
		this.efbmAttribute076 = efbmAttribute076;
		addValidField("efbmAttribute076");
	}

	/**
	 * Get efbmAttribute077
	 */
	@Column(name = "EFBM_ATTRIBUTE_077")
	public String getEfbmAttribute077() {
		return efbmAttribute077;
	}

	/**
	 * Set efbmAttribute077
	 */
	public void setEfbmAttribute077(String efbmAttribute077) {
		this.efbmAttribute077 = efbmAttribute077;
		addValidField("efbmAttribute077");
	}

	/**
	 * Get efbmAttribute078
	 */
	@Column(name = "EFBM_ATTRIBUTE_078")
	public String getEfbmAttribute078() {
		return efbmAttribute078;
	}

	/**
	 * Set efbmAttribute078
	 */
	public void setEfbmAttribute078(String efbmAttribute078) {
		this.efbmAttribute078 = efbmAttribute078;
		addValidField("efbmAttribute078");
	}

	/**
	 * Get efbmAttribute079
	 */
	@Column(name = "EFBM_ATTRIBUTE_079")
	public String getEfbmAttribute079() {
		return efbmAttribute079;
	}

	/**
	 * Set efbmAttribute079
	 */
	public void setEfbmAttribute079(String efbmAttribute079) {
		this.efbmAttribute079 = efbmAttribute079;
		addValidField("efbmAttribute079");
	}

	/**
	 * Get efbmAttribute080
	 */
	@Column(name = "EFBM_ATTRIBUTE_080")
	public String getEfbmAttribute080() {
		return efbmAttribute080;
	}

	/**
	 * Set efbmAttribute080
	 */
	public void setEfbmAttribute080(String efbmAttribute080) {
		this.efbmAttribute080 = efbmAttribute080;
		addValidField("efbmAttribute080");
	}

	/**
	 * Get efbmAttribute081
	 */
	@Column(name = "EFBM_ATTRIBUTE_081")
	public String getEfbmAttribute081() {
		return efbmAttribute081;
	}

	/**
	 * Set efbmAttribute081
	 */
	public void setEfbmAttribute081(String efbmAttribute081) {
		this.efbmAttribute081 = efbmAttribute081;
		addValidField("efbmAttribute081");
	}

	/**
	 * Get efbmAttribute082
	 */
	@Column(name = "EFBM_ATTRIBUTE_082")
	public String getEfbmAttribute082() {
		return efbmAttribute082;
	}

	/**
	 * Set efbmAttribute082
	 */
	public void setEfbmAttribute082(String efbmAttribute082) {
		this.efbmAttribute082 = efbmAttribute082;
		addValidField("efbmAttribute082");
	}

	/**
	 * Get efbmAttribute083
	 */
	@Column(name = "EFBM_ATTRIBUTE_083")
	public String getEfbmAttribute083() {
		return efbmAttribute083;
	}

	/**
	 * Set efbmAttribute083
	 */
	public void setEfbmAttribute083(String efbmAttribute083) {
		this.efbmAttribute083 = efbmAttribute083;
		addValidField("efbmAttribute083");
	}

	/**
	 * Get efbmAttribute084
	 */
	@Column(name = "EFBM_ATTRIBUTE_084")
	public String getEfbmAttribute084() {
		return efbmAttribute084;
	}

	/**
	 * Set efbmAttribute084
	 */
	public void setEfbmAttribute084(String efbmAttribute084) {
		this.efbmAttribute084 = efbmAttribute084;
		addValidField("efbmAttribute084");
	}

	/**
	 * Get efbmAttribute085
	 */
	@Column(name = "EFBM_ATTRIBUTE_085")
	public String getEfbmAttribute085() {
		return efbmAttribute085;
	}

	/**
	 * Set efbmAttribute085
	 */
	public void setEfbmAttribute085(String efbmAttribute085) {
		this.efbmAttribute085 = efbmAttribute085;
		addValidField("efbmAttribute085");
	}

	/**
	 * Get efbmAttribute086
	 */
	@Column(name = "EFBM_ATTRIBUTE_086")
	public String getEfbmAttribute086() {
		return efbmAttribute086;
	}

	/**
	 * Set efbmAttribute086
	 */
	public void setEfbmAttribute086(String efbmAttribute086) {
		this.efbmAttribute086 = efbmAttribute086;
		addValidField("efbmAttribute086");
	}

	/**
	 * Get efbmAttribute087
	 */
	@Column(name = "EFBM_ATTRIBUTE_087")
	public String getEfbmAttribute087() {
		return efbmAttribute087;
	}

	/**
	 * Set efbmAttribute087
	 */
	public void setEfbmAttribute087(String efbmAttribute087) {
		this.efbmAttribute087 = efbmAttribute087;
		addValidField("efbmAttribute087");
	}

	/**
	 * Get efbmAttribute088
	 */
	@Column(name = "EFBM_ATTRIBUTE_088")
	public String getEfbmAttribute088() {
		return efbmAttribute088;
	}

	/**
	 * Set efbmAttribute088
	 */
	public void setEfbmAttribute088(String efbmAttribute088) {
		this.efbmAttribute088 = efbmAttribute088;
		addValidField("efbmAttribute088");
	}

	/**
	 * Get efbmAttribute089
	 */
	@Column(name = "EFBM_ATTRIBUTE_089")
	public String getEfbmAttribute089() {
		return efbmAttribute089;
	}

	/**
	 * Set efbmAttribute089
	 */
	public void setEfbmAttribute089(String efbmAttribute089) {
		this.efbmAttribute089 = efbmAttribute089;
		addValidField("efbmAttribute089");
	}

	/**
	 * Get efbmAttribute090
	 */
	@Column(name = "EFBM_ATTRIBUTE_090")
	public String getEfbmAttribute090() {
		return efbmAttribute090;
	}

	/**
	 * Set efbmAttribute090
	 */
	public void setEfbmAttribute090(String efbmAttribute090) {
		this.efbmAttribute090 = efbmAttribute090;
		addValidField("efbmAttribute090");
	}

	/**
	 * Get efbmAttribute091
	 */
	@Column(name = "EFBM_ATTRIBUTE_091")
	public String getEfbmAttribute091() {
		return efbmAttribute091;
	}

	/**
	 * Set efbmAttribute091
	 */
	public void setEfbmAttribute091(String efbmAttribute091) {
		this.efbmAttribute091 = efbmAttribute091;
		addValidField("efbmAttribute091");
	}

	/**
	 * Get efbmAttribute092
	 */
	@Column(name = "EFBM_ATTRIBUTE_092")
	public String getEfbmAttribute092() {
		return efbmAttribute092;
	}

	/**
	 * Set efbmAttribute092
	 */
	public void setEfbmAttribute092(String efbmAttribute092) {
		this.efbmAttribute092 = efbmAttribute092;
		addValidField("efbmAttribute092");
	}

	/**
	 * Get efbmAttribute093
	 */
	@Column(name = "EFBM_ATTRIBUTE_093")
	public String getEfbmAttribute093() {
		return efbmAttribute093;
	}

	/**
	 * Set efbmAttribute093
	 */
	public void setEfbmAttribute093(String efbmAttribute093) {
		this.efbmAttribute093 = efbmAttribute093;
		addValidField("efbmAttribute093");
	}

	/**
	 * Get efbmAttribute094
	 */
	@Column(name = "EFBM_ATTRIBUTE_094")
	public String getEfbmAttribute094() {
		return efbmAttribute094;
	}

	/**
	 * Set efbmAttribute094
	 */
	public void setEfbmAttribute094(String efbmAttribute094) {
		this.efbmAttribute094 = efbmAttribute094;
		addValidField("efbmAttribute094");
	}

	/**
	 * Get efbmAttribute095
	 */
	@Column(name = "EFBM_ATTRIBUTE_095")
	public String getEfbmAttribute095() {
		return efbmAttribute095;
	}

	/**
	 * Set efbmAttribute095
	 */
	public void setEfbmAttribute095(String efbmAttribute095) {
		this.efbmAttribute095 = efbmAttribute095;
		addValidField("efbmAttribute095");
	}

	/**
	 * Get efbmAttribute096
	 */
	@Column(name = "EFBM_ATTRIBUTE_096")
	public String getEfbmAttribute096() {
		return efbmAttribute096;
	}

	/**
	 * Set efbmAttribute096
	 */
	public void setEfbmAttribute096(String efbmAttribute096) {
		this.efbmAttribute096 = efbmAttribute096;
		addValidField("efbmAttribute096");
	}

	/**
	 * Get efbmAttribute097
	 */
	@Column(name = "EFBM_ATTRIBUTE_097")
	public String getEfbmAttribute097() {
		return efbmAttribute097;
	}

	/**
	 * Set efbmAttribute097
	 */
	public void setEfbmAttribute097(String efbmAttribute097) {
		this.efbmAttribute097 = efbmAttribute097;
		addValidField("efbmAttribute097");
	}

	/**
	 * Get efbmAttribute098
	 */
	@Column(name = "EFBM_ATTRIBUTE_098")
	public String getEfbmAttribute098() {
		return efbmAttribute098;
	}

	/**
	 * Set efbmAttribute098
	 */
	public void setEfbmAttribute098(String efbmAttribute098) {
		this.efbmAttribute098 = efbmAttribute098;
		addValidField("efbmAttribute098");
	}

	/**
	 * Get efbmAttribute099
	 */
	@Column(name = "EFBM_ATTRIBUTE_099")
	public String getEfbmAttribute099() {
		return efbmAttribute099;
	}

	/**
	 * Set efbmAttribute099
	 */
	public void setEfbmAttribute099(String efbmAttribute099) {
		this.efbmAttribute099 = efbmAttribute099;
		addValidField("efbmAttribute099");
	}

	/**
	 * Get efbmAttribute100
	 */
	@Column(name = "EFBM_ATTRIBUTE_100")
	public String getEfbmAttribute100() {
		return efbmAttribute100;
	}

	/**
	 * Set efbmAttribute100
	 */
	public void setEfbmAttribute100(String efbmAttribute100) {
		this.efbmAttribute100 = efbmAttribute100;
		addValidField("efbmAttribute100");
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
	 * Get efbmDpNumber
	 */
	@Column(name = "EFBM_DP_NUMBER")
	public String getEfbmDpNumber() {
		return efbmDpNumber;
	}

	/**
	 * Set efbmDpNumber
	 */
	public void setEfbmDpNumber(String efbmDpNumber) {
		this.efbmDpNumber = efbmDpNumber;
		addValidField("efbmDpNumber");
	}

	/**
	 * Get efbmSubCarrierId
	 */
	@Column(name = "EFBM_SUB_CARRIER_ID")
	public Long getEfbmSubCarrierId() {
		return efbmSubCarrierId;
	}

	/**
	 * Set efbmSubCarrierId
	 */
	public void setEfbmSubCarrierId(Long efbmSubCarrierId) {
		this.efbmSubCarrierId = efbmSubCarrierId;
		addValidField("efbmSubCarrierId");
	}

	/**
	 * Get efbmSubCarrierCode
	 */
	@Column(name = "EFBM_SUB_CARRIER_CODE")
	public String getEfbmSubCarrierCode() {
		return efbmSubCarrierCode;
	}

	/**
	 * Set efbmSubCarrierCode
	 */
	public void setEfbmSubCarrierCode(String efbmSubCarrierCode) {
		this.efbmSubCarrierCode = efbmSubCarrierCode;
		addValidField("efbmSubCarrierCode");
	}

	/**
	 * Get efbmSubCarrierName
	 */
	@Column(name = "EFBM_SUB_CARRIER_NAME")
	public String getEfbmSubCarrierName() {
		return efbmSubCarrierName;
	}

	/**
	 * Set efbmSubCarrierName
	 */
	public void setEfbmSubCarrierName(String efbmSubCarrierName) {
		this.efbmSubCarrierName = efbmSubCarrierName;
		addValidField("efbmSubCarrierName");
	}

	/**
	 * Get efbmMainCarrierId
	 */
	@Column(name = "EFBM_MAIN_CARRIER_ID")
	public Long getEfbmMainCarrierId() {
		return efbmMainCarrierId;
	}

	/**
	 * Set efbmMainCarrierId
	 */
	public void setEfbmMainCarrierId(Long efbmMainCarrierId) {
		this.efbmMainCarrierId = efbmMainCarrierId;
		addValidField("efbmMainCarrierId");
	}

	/**
	 * Get efbmMainCarrierCode
	 */
	@Column(name = "EFBM_MAIN_CARRIER_CODE")
	public String getEfbmMainCarrierCode() {
		return efbmMainCarrierCode;
	}

	/**
	 * Set efbmMainCarrierCode
	 */
	public void setEfbmMainCarrierCode(String efbmMainCarrierCode) {
		this.efbmMainCarrierCode = efbmMainCarrierCode;
		addValidField("efbmMainCarrierCode");
	}

	/**
	 * Get efbmMainCarrierName
	 */
	@Column(name = "EFBM_MAIN_CARRIER_NAME")
	public String getEfbmMainCarrierName() {
		return efbmMainCarrierName;
	}

	/**
	 * Set efbmMainCarrierName
	 */
	public void setEfbmMainCarrierName(String efbmMainCarrierName) {
		this.efbmMainCarrierName = efbmMainCarrierName;
		addValidField("efbmMainCarrierName");
	}

	/**
	 * Get efbmLoadPortId
	 */
	@Column(name = "EFBM_LOAD_PORT_ID")
	public Long getEfbmLoadPortId() {
		return efbmLoadPortId;
	}

	/**
	 * Set efbmLoadPortId
	 */
	public void setEfbmLoadPortId(Long efbmLoadPortId) {
		this.efbmLoadPortId = efbmLoadPortId;
		addValidField("efbmLoadPortId");
	}

	/**
	 * Get efbmLoadPortCode
	 */
	@Column(name = "EFBM_LOAD_PORT_CODE")
	public String getEfbmLoadPortCode() {
		return efbmLoadPortCode;
	}

	/**
	 * Set efbmLoadPortCode
	 */
	public void setEfbmLoadPortCode(String efbmLoadPortCode) {
		this.efbmLoadPortCode = efbmLoadPortCode;
		addValidField("efbmLoadPortCode");
	}

	/**
	 * Get efbmLoadPortName
	 */
	@Column(name = "EFBM_LOAD_PORT_NAME")
	public String getEfbmLoadPortName() {
		return efbmLoadPortName;
	}

	/**
	 * Set efbmLoadPortName
	 */
	public void setEfbmLoadPortName(String efbmLoadPortName) {
		this.efbmLoadPortName = efbmLoadPortName;
		addValidField("efbmLoadPortName");
	}

	/**
	 * Get efbmDischargePortId
	 */
	@Column(name = "EFBM_DISCHARGE_PORT_ID")
	public Long getEfbmDischargePortId() {
		return efbmDischargePortId;
	}

	/**
	 * Set efbmDischargePortId
	 */
	public void setEfbmDischargePortId(Long efbmDischargePortId) {
		this.efbmDischargePortId = efbmDischargePortId;
		addValidField("efbmDischargePortId");
	}

	/**
	 * Get efbmDischargePortCode
	 */
	@Column(name = "EFBM_DISCHARGE_PORT_CODE")
	public String getEfbmDischargePortCode() {
		return efbmDischargePortCode;
	}

	/**
	 * Set efbmDischargePortCode
	 */
	public void setEfbmDischargePortCode(String efbmDischargePortCode) {
		this.efbmDischargePortCode = efbmDischargePortCode;
		addValidField("efbmDischargePortCode");
	}

	/**
	 * Get efbmDischargePortName
	 */
	@Column(name = "EFBM_DISCHARGE_PORT_NAME")
	public String getEfbmDischargePortName() {
		return efbmDischargePortName;
	}

	/**
	 * Set efbmDischargePortName
	 */
	public void setEfbmDischargePortName(String efbmDischargePortName) {
		this.efbmDischargePortName = efbmDischargePortName;
		addValidField("efbmDischargePortName");
	}

	/**
	 * Get efbmAgentId
	 */
	@Column(name = "EFBM_AGENT_ID")
	public Long getEfbmAgentId() {
		return efbmAgentId;
	}

	/**
	 * Set efbmAgentId
	 */
	public void setEfbmAgentId(Long efbmAgentId) {
		this.efbmAgentId = efbmAgentId;
		addValidField("efbmAgentId");
	}

	/**
	 * Get efbmAgentCode
	 */
	@Column(name = "EFBM_AGENT_CODE")
	public String getEfbmAgentCode() {
		return efbmAgentCode;
	}

	/**
	 * Set efbmAgentCode
	 */
	public void setEfbmAgentCode(String efbmAgentCode) {
		this.efbmAgentCode = efbmAgentCode;
		addValidField("efbmAgentCode");
	}

	/**
	 * Get efbmAgentName
	 */
	@Column(name = "EFBM_AGENT_NAME")
	public String getEfbmAgentName() {
		return efbmAgentName;
	}

	/**
	 * Set efbmAgentName
	 */
	public void setEfbmAgentName(String efbmAgentName) {
		this.efbmAgentName = efbmAgentName;
		addValidField("efbmAgentName");
	}

	/**
	 * Get efbmBookingAgentId
	 */
	@Column(name = "EFBM_BOOKING_AGENT_ID")
	public Long getEfbmBookingAgentId() {
		return efbmBookingAgentId;
	}

	/**
	 * Set efbmBookingAgentId
	 */
	public void setEfbmBookingAgentId(Long efbmBookingAgentId) {
		this.efbmBookingAgentId = efbmBookingAgentId;
		addValidField("efbmBookingAgentId");
	}

	/**
	 * Get efbmBookingAgentCode
	 */
	@Column(name = "EFBM_BOOKING_AGENT_CODE")
	public String getEfbmBookingAgentCode() {
		return efbmBookingAgentCode;
	}

	/**
	 * Set efbmBookingAgentCode
	 */
	public void setEfbmBookingAgentCode(String efbmBookingAgentCode) {
		this.efbmBookingAgentCode = efbmBookingAgentCode;
		addValidField("efbmBookingAgentCode");
	}

	/**
	 * Get efbmBookingAgentName
	 */
	@Column(name = "EFBM_BOOKING_AGENT_NAME")
	public String getEfbmBookingAgentName() {
		return efbmBookingAgentName;
	}

	/**
	 * Set efbmBookingAgentName
	 */
	public void setEfbmBookingAgentName(String efbmBookingAgentName) {
		this.efbmBookingAgentName = efbmBookingAgentName;
		addValidField("efbmBookingAgentName");
	}

	/**
	 * Get efbmSailingDate
	 */
	@Column(name = "EFBM_SAILING_DATE")
	public Date getEfbmSailingDate() {
		return efbmSailingDate;
	}

	/**
	 * Set efbmSailingDate
	 */
	public void setEfbmSailingDate(Date efbmSailingDate) {
		this.efbmSailingDate = efbmSailingDate;
		addValidField("efbmSailingDate");
	}

	/**
	 * Get efbmEtd
	 */
	@Column(name = "EFBM_ETD")
	public Date getEfbmEtd() {
		return efbmEtd;
	}

	/**
	 * Set efbmEtd
	 */
	public void setEfbmEtd(Date efbmEtd) {
		this.efbmEtd = efbmEtd;
		addValidField("efbmEtd");
	}

	/**
	 * Get efbmIsTransport
	 */
	@Column(name = "EFBM_IS_TRANSPORT")
	public String getEfbmIsTransport() {
		return efbmIsTransport;
	}

	/**
	 * Set efbmIsTransport
	 */
	public void setEfbmIsTransport(String efbmIsTransport) {
		this.efbmIsTransport = efbmIsTransport;
		addValidField("efbmIsTransport");
	}

	/**
	 * Get efbmIsStorage
	 */
	@Column(name = "EFBM_IS_STORAGE")
	public String getEfbmIsStorage() {
		return efbmIsStorage;
	}

	/**
	 * Set efbmIsStorage
	 */
	public void setEfbmIsStorage(String efbmIsStorage) {
		this.efbmIsStorage = efbmIsStorage;
		addValidField("efbmIsStorage");
	}

	/**
	 * Get efbmIsAgent
	 */
	@Column(name = "EFBM_IS_AGENT")
	public String getEfbmIsAgent() {
		return efbmIsAgent;
	}

	/**
	 * Set efbmIsAgent
	 */
	public void setEfbmIsAgent(String efbmIsAgent) {
		this.efbmIsAgent = efbmIsAgent;
		addValidField("efbmIsAgent");
	}

	/**
	 * Get efbmIsAdd
	 */
	@Column(name = "EFBM_IS_ADD")
	public String getEfbmIsAdd() {
		return efbmIsAdd;
	}

	/**
	 * Set efbmIsAdd
	 */
	public void setEfbmIsAdd(String efbmIsAdd) {
		this.efbmIsAdd = efbmIsAdd;
		addValidField("efbmIsAdd");
	}

	/**
	 * Get efbmOutInStoreTime
	 */
	@Column(name = "EFBM_OUT_IN_STORE_TIME")
	public Date getEfbmOutInStoreTime() {
		return efbmOutInStoreTime;
	}

	/**
	 * Set efbmOutInStoreTime
	 */
	public void setEfbmOutInStoreTime(Date efbmOutInStoreTime) {
		this.efbmOutInStoreTime = efbmOutInStoreTime;
		addValidField("efbmOutInStoreTime");
	}

	/**
	 * Get efbmDeliveryTime
	 */
	@Column(name = "EFBM_DELIVERY_TIME")
	public Date getEfbmDeliveryTime() {
		return efbmDeliveryTime;
	}

	/**
	 * Set efbmDeliveryTime
	 */
	public void setEfbmDeliveryTime(Date efbmDeliveryTime) {
		this.efbmDeliveryTime = efbmDeliveryTime;
		addValidField("efbmDeliveryTime");
	}

	/**
	 * Get efbmShipperCountryId
	 */
	@Column(name = "EFBM_SHIPPER_COUNTRY_ID")
	public Long getEfbmShipperCountryId() {
		return efbmShipperCountryId;
	}

	/**
	 * Set efbmShipperCountryId
	 */
	public void setEfbmShipperCountryId(Long efbmShipperCountryId) {
		this.efbmShipperCountryId = efbmShipperCountryId;
		addValidField("efbmShipperCountryId");
	}

	/**
	 * Get efbmShipperCountryCode
	 */
	@Column(name = "EFBM_SHIPPER_COUNTRY_CODE")
	public String getEfbmShipperCountryCode() {
		return efbmShipperCountryCode;
	}

	/**
	 * Set efbmShipperCountryCode
	 */
	public void setEfbmShipperCountryCode(String efbmShipperCountryCode) {
		this.efbmShipperCountryCode = efbmShipperCountryCode;
		addValidField("efbmShipperCountryCode");
	}

	/**
	 * Get efbmShipperCountryName
	 */
	@Column(name = "EFBM_SHIPPER_COUNTRY_NAME")
	public String getEfbmShipperCountryName() {
		return efbmShipperCountryName;
	}

	/**
	 * Set efbmShipperCountryName
	 */
	public void setEfbmShipperCountryName(String efbmShipperCountryName) {
		this.efbmShipperCountryName = efbmShipperCountryName;
		addValidField("efbmShipperCountryName");
	}

	/**
	 * Get efbmConsigneeCountryId
	 */
	@Column(name = "EFBM_CONSIGNEE_COUNTRY_ID")
	public Long getEfbmConsigneeCountryId() {
		return efbmConsigneeCountryId;
	}

	/**
	 * Set efbmConsigneeCountryId
	 */
	public void setEfbmConsigneeCountryId(Long efbmConsigneeCountryId) {
		this.efbmConsigneeCountryId = efbmConsigneeCountryId;
		addValidField("efbmConsigneeCountryId");
	}

	/**
	 * Get efbmConsigneeCountryCode
	 */
	@Column(name = "EFBM_CONSIGNEE_COUNTRY_CODE")
	public String getEfbmConsigneeCountryCode() {
		return efbmConsigneeCountryCode;
	}

	/**
	 * Set efbmConsigneeCountryCode
	 */
	public void setEfbmConsigneeCountryCode(String efbmConsigneeCountryCode) {
		this.efbmConsigneeCountryCode = efbmConsigneeCountryCode;
		addValidField("efbmConsigneeCountryCode");
	}

	/**
	 * Get efbmConsigneeCountryName
	 */
	@Column(name = "EFBM_CONSIGNEE_COUNTRY_NAME")
	public String getEfbmConsigneeCountryName() {
		return efbmConsigneeCountryName;
	}

	/**
	 * Set efbmConsigneeCountryName
	 */
	public void setEfbmConsigneeCountryName(String efbmConsigneeCountryName) {
		this.efbmConsigneeCountryName = efbmConsigneeCountryName;
		addValidField("efbmConsigneeCountryName");
	}

	/**
	 * Get efbmShipperCityId
	 */
	@Column(name = "EFBM_SHIPPER_CITY_ID")
	public Long getEfbmShipperCityId() {
		return efbmShipperCityId;
	}

	/**
	 * Set efbmShipperCityId
	 */
	public void setEfbmShipperCityId(Long efbmShipperCityId) {
		this.efbmShipperCityId = efbmShipperCityId;
		addValidField("efbmShipperCityId");
	}

	/**
	 * Get efbmShipperCityQuickCode
	 */
	@Column(name = "EFBM_SHIPPER_CITY_QUICK_CODE")
	public String getEfbmShipperCityQuickCode() {
		return efbmShipperCityQuickCode;
	}

	/**
	 * Set efbmShipperCityQuickCode
	 */
	public void setEfbmShipperCityQuickCode(String efbmShipperCityQuickCode) {
		this.efbmShipperCityQuickCode = efbmShipperCityQuickCode;
		addValidField("efbmShipperCityQuickCode");
	}

	/**
	 * Get efbmShipperCityName
	 */
	@Column(name = "EFBM_SHIPPER_CITY_NAME")
	public String getEfbmShipperCityName() {
		return efbmShipperCityName;
	}

	/**
	 * Set efbmShipperCityName
	 */
	public void setEfbmShipperCityName(String efbmShipperCityName) {
		this.efbmShipperCityName = efbmShipperCityName;
		addValidField("efbmShipperCityName");
	}

	/**
	 * Get efbmConsigneeCityId
	 */
	@Column(name = "EFBM_CONSIGNEE_CITY_ID")
	public Long getEfbmConsigneeCityId() {
		return efbmConsigneeCityId;
	}

	/**
	 * Set efbmConsigneeCityId
	 */
	public void setEfbmConsigneeCityId(Long efbmConsigneeCityId) {
		this.efbmConsigneeCityId = efbmConsigneeCityId;
		addValidField("efbmConsigneeCityId");
	}

	/**
	 * Get efbmConsigneeCityQuickCode
	 */
	@Column(name = "EFBM_CONSIGNEE_CITY_QUICK_CODE")
	public String getEfbmConsigneeCityQuickCode() {
		return efbmConsigneeCityQuickCode;
	}

	/**
	 * Set efbmConsigneeCityQuickCode
	 */
	public void setEfbmConsigneeCityQuickCode(String efbmConsigneeCityQuickCode) {
		this.efbmConsigneeCityQuickCode = efbmConsigneeCityQuickCode;
		addValidField("efbmConsigneeCityQuickCode");
	}

	/**
	 * Get efbmConsigneeCityName
	 */
	@Column(name = "EFBM_CONSIGNEE_CITY_NAME")
	public String getEfbmConsigneeCityName() {
		return efbmConsigneeCityName;
	}

	/**
	 * Set efbmConsigneeCityName
	 */
	public void setEfbmConsigneeCityName(String efbmConsigneeCityName) {
		this.efbmConsigneeCityName = efbmConsigneeCityName;
		addValidField("efbmConsigneeCityName");
	}

}
