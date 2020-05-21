package com.sinotrans.oms.contract.model;

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
 * Model class for ElProtocolCostCon
 */
@Entity
@Table(name = "EL_PROTOCOL_COST_CON")
public class ElProtocolCostConModel extends BaseModel implements OperationLog {

	//epccId
	private Long epccId;
	//epccEpctId
	private Long epccEpctId;
	//epccConsignorEbcuName
	private String epccConsignorEbcuName;
	//epccConsignorEbcuId
	private Long epccConsignorEbcuId;
	//epccShipperName
	private String epccShipperName;
	//epccShipperId
	private Long epccShipperId;
	//epccShipName
	private String epccShipName;
	//epccShipId
	private Long epccShipId;
	//epccShipAgentName
	private String epccShipAgentName;
	//epccShipAgentId
	private Long epccShipAgentId;
	//epccLoadPortId
	private Long epccLoadPortId;
	//epccDischargePortId
	private Long epccDischargePortId;
	//epccTruckName
	private String epccTruckName;
	//epccTruckId
	private Long epccTruckId;
	//epccCustomsName
	private String epccCustomsName;
	//epccCustomsId
	private Long epccCustomsId;
	//epccServicesType
	private String epccServicesType;
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
	//epccSubstr1
	private String epccSubstr1;
	//epccSubstr2
	private String epccSubstr2;
	//epccSubdate1
	private Date epccSubdate1;
	//epccSubdate2
	private Date epccSubdate2;
	//epccSubnum1
	private Long epccSubnum1;
	//epccSubnum2
	private Long epccSubnum2;
	//epccEscoId
	private Long epccEscoId;
	//epccConsignorEbcuCode
	private String epccConsignorEbcuCode;
	//epccShipperCode
	private String epccShipperCode;
	//epccShipCode
	private String epccShipCode;
	//epccShipAgentCode
	private String epccShipAgentCode;
	//epccLoadPortCode
	private String epccLoadPortCode;
	//epccLoadPortName
	private String epccLoadPortName;
	//epccDischargePortName
	private String epccDischargePortName;
	//epccDischargePortCode
	private String epccDischargePortCode;
	//epccEbpjId
	private Long epccEbpjId;
	//epccStatus
	private String epccStatus;
	//epccElplId
	private Long epccElplId;
	//epccFreightClauseCode
	private String epccFreightClauseCode;
	//epccLmId
	private String epccLmId;
 	//epccBmsEbsmCode
	private String epccBmsEbsmCode;
	//epccIsTrailer
	private Long epccIsTrailer;
	//epccIsBooking
	private Long epccIsBooking;
	//epccIsDeclaration
	private Long epccIsDeclaration;
	//epccTruckCode
	private String epccTruckCode;
	//epccCustomsCode
	private String epccCustomsCode;

	/**
	 * Get epccId
	 */
	@Column(name = "EPCC_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEpccId() {
		return epccId;
	}

	/**
	 * Set epccId
	 */
	public void setEpccId(Long epccId) {
		this.epccId = epccId;
		addValidField("epccId");
	}

	/**
	 * Get epccEpctId
	 */
	@Column(name = "EPCC_EPCT_ID")
	public Long getEpccEpctId() {
		return epccEpctId;
	}

	/**
	 * Set epccEpctId
	 */
	public void setEpccEpctId(Long epccEpctId) {
		this.epccEpctId = epccEpctId;
		addValidField("epccEpctId");
	}

	/**
	 * Get epccConsignorEbcuName
	 */
	@Column(name = "EPCC_CONSIGNOR_EBCU_NAME")
	public String getEpccConsignorEbcuName() {
		return epccConsignorEbcuName;
	}

	/**
	 * Set epccConsignorEbcuName
	 */
	public void setEpccConsignorEbcuName(String epccConsignorEbcuName) {
		this.epccConsignorEbcuName = epccConsignorEbcuName;
		addValidField("epccConsignorEbcuName");
	}

	/**
	 * Get epccConsignorEbcuId
	 */
	@Column(name = "EPCC_CONSIGNOR_EBCU_ID")
	public Long getEpccConsignorEbcuId() {
		return epccConsignorEbcuId;
	}

	/**
	 * Set epccConsignorEbcuId
	 */
	public void setEpccConsignorEbcuId(Long epccConsignorEbcuId) {
		this.epccConsignorEbcuId = epccConsignorEbcuId;
		addValidField("epccConsignorEbcuId");
	}

	/**
	 * Get epccShipperName
	 */
	@Column(name = "EPCC_SHIPPER_NAME")
	public String getEpccShipperName() {
		return epccShipperName;
	}

	/**
	 * Set epccShipperName
	 */
	public void setEpccShipperName(String epccShipperName) {
		this.epccShipperName = epccShipperName;
		addValidField("epccShipperName");
	}

	/**
	 * Get epccShipperId
	 */
	@Column(name = "EPCC_SHIPPER_ID")
	public Long getEpccShipperId() {
		return epccShipperId;
	}

	/**
	 * Set epccShipperId
	 */
	public void setEpccShipperId(Long epccShipperId) {
		this.epccShipperId = epccShipperId;
		addValidField("epccShipperId");
	}

	/**
	 * Get epccShipName
	 */
	@Column(name = "EPCC_SHIP_NAME")
	public String getEpccShipName() {
		return epccShipName;
	}

	/**
	 * Set epccShipName
	 */
	public void setEpccShipName(String epccShipName) {
		this.epccShipName = epccShipName;
		addValidField("epccShipName");
	}

	/**
	 * Get epccShipId
	 */
	@Column(name = "EPCC_SHIP_ID")
	public Long getEpccShipId() {
		return epccShipId;
	}

	/**
	 * Set epccShipId
	 */
	public void setEpccShipId(Long epccShipId) {
		this.epccShipId = epccShipId;
		addValidField("epccShipId");
	}

	/**
	 * Get epccShipAgentName
	 */
	@Column(name = "EPCC_SHIP_AGENT_NAME")
	public String getEpccShipAgentName() {
		return epccShipAgentName;
	}

	/**
	 * Set epccShipAgentName
	 */
	public void setEpccShipAgentName(String epccShipAgentName) {
		this.epccShipAgentName = epccShipAgentName;
		addValidField("epccShipAgentName");
	}

	/**
	 * Get epccShipAgentId
	 */
	@Column(name = "EPCC_SHIP_AGENT_ID")
	public Long getEpccShipAgentId() {
		return epccShipAgentId;
	}

	/**
	 * Set epccShipAgentId
	 */
	public void setEpccShipAgentId(Long epccShipAgentId) {
		this.epccShipAgentId = epccShipAgentId;
		addValidField("epccShipAgentId");
	}

	/**
	 * Get epccLoadPortId
	 */
	@Column(name = "EPCC_LOAD_PORT_ID")
	public Long getEpccLoadPortId() {
		return epccLoadPortId;
	}

	/**
	 * Set epccLoadPortId
	 */
	public void setEpccLoadPortId(Long epccLoadPortId) {
		this.epccLoadPortId = epccLoadPortId;
		addValidField("epccLoadPortId");
	}

	/**
	 * Get epccDischargePortId
	 */
	@Column(name = "EPCC_DISCHARGE_PORT_ID")
	public Long getEpccDischargePortId() {
		return epccDischargePortId;
	}

	/**
	 * Set epccDischargePortId
	 */
	public void setEpccDischargePortId(Long epccDischargePortId) {
		this.epccDischargePortId = epccDischargePortId;
		addValidField("epccDischargePortId");
	}

	/**
	 * Get epccTruckName
	 */
	@Column(name = "EPCC_TRUCK_NAME")
	public String getEpccTruckName() {
		return epccTruckName;
	}

	/**
	 * Set epccTruckName
	 */
	public void setEpccTruckName(String epccTruckName) {
		this.epccTruckName = epccTruckName;
		addValidField("epccTruckName");
	}

	/**
	 * Get epccTruckId
	 */
	@Column(name = "EPCC_TRUCK_ID")
	public Long getEpccTruckId() {
		return epccTruckId;
	}

	/**
	 * Set epccTruckId
	 */
	public void setEpccTruckId(Long epccTruckId) {
		this.epccTruckId = epccTruckId;
		addValidField("epccTruckId");
	}

	/**
	 * Get epccCustomsName
	 */
	@Column(name = "EPCC_CUSTOMS_NAME")
	public String getEpccCustomsName() {
		return epccCustomsName;
	}

	/**
	 * Set epccCustomsName
	 */
	public void setEpccCustomsName(String epccCustomsName) {
		this.epccCustomsName = epccCustomsName;
		addValidField("epccCustomsName");
	}

	/**
	 * Get epccCustomsId
	 */
	@Column(name = "EPCC_CUSTOMS_ID")
	public Long getEpccCustomsId() {
		return epccCustomsId;
	}

	/**
	 * Set epccCustomsId
	 */
	public void setEpccCustomsId(Long epccCustomsId) {
		this.epccCustomsId = epccCustomsId;
		addValidField("epccCustomsId");
	}

	/**
	 * Get epccServicesType
	 */
	@Column(name = "EPCC_SERVICES_TYPE")
	public String getEpccServicesType() {
		return epccServicesType;
	}

	/**
	 * Set epccServicesType
	 */
	public void setEpccServicesType(String epccServicesType) {
		this.epccServicesType = epccServicesType;
		addValidField("epccServicesType");
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
	 * Get epccSubstr1
	 */
	@Column(name = "EPCC_SUBSTR1")
	public String getEpccSubstr1() {
		return epccSubstr1;
	}

	/**
	 * Set epccSubstr1
	 */
	public void setEpccSubstr1(String epccSubstr1) {
		this.epccSubstr1 = epccSubstr1;
		addValidField("epccSubstr1");
	}

	/**
	 * Get epccSubstr2
	 */
	@Column(name = "EPCC_SUBSTR2")
	public String getEpccSubstr2() {
		return epccSubstr2;
	}

	/**
	 * Set epccSubstr2
	 */
	public void setEpccSubstr2(String epccSubstr2) {
		this.epccSubstr2 = epccSubstr2;
		addValidField("epccSubstr2");
	}

	/**
	 * Get epccSubdate1
	 */
	@Column(name = "EPCC_SUBDATE1")
	public Date getEpccSubdate1() {
		return epccSubdate1;
	}

	/**
	 * Set epccSubdate1
	 */
	public void setEpccSubdate1(Date epccSubdate1) {
		this.epccSubdate1 = epccSubdate1;
		addValidField("epccSubdate1");
	}

	/**
	 * Get epccSubdate2
	 */
	@Column(name = "EPCC_SUBDATE2")
	public Date getEpccSubdate2() {
		return epccSubdate2;
	}

	/**
	 * Set epccSubdate2
	 */
	public void setEpccSubdate2(Date epccSubdate2) {
		this.epccSubdate2 = epccSubdate2;
		addValidField("epccSubdate2");
	}

	/**
	 * Get epccSubnum1
	 */
	@Column(name = "EPCC_SUBNUM1")
	public Long getEpccSubnum1() {
		return epccSubnum1;
	}

	/**
	 * Set epccSubnum1
	 */
	public void setEpccSubnum1(Long epccSubnum1) {
		this.epccSubnum1 = epccSubnum1;
		addValidField("epccSubnum1");
	}

	/**
	 * Get epccSubnum2
	 */
	@Column(name = "EPCC_SUBNUM2")
	public Long getEpccSubnum2() {
		return epccSubnum2;
	}

	/**
	 * Set epccSubnum2
	 */
	public void setEpccSubnum2(Long epccSubnum2) {
		this.epccSubnum2 = epccSubnum2;
		addValidField("epccSubnum2");
	}

	/**
	 * Get epccEscoId
	 */
	@Column(name = "EPCC_ESCO_ID")
	public Long getEpccEscoId() {
		return epccEscoId;
	}

	/**
	 * Set epccEscoId
	 */
	public void setEpccEscoId(Long epccEscoId) {
		this.epccEscoId = epccEscoId;
		addValidField("epccEscoId");
	}

	/**
	 * Get epccConsignorEbcuCode
	 */
	@Column(name = "EPCC_CONSIGNOR_EBCU_CODE")
	public String getEpccConsignorEbcuCode() {
		return epccConsignorEbcuCode;
	}

	/**
	 * Set epccConsignorEbcuCode
	 */
	public void setEpccConsignorEbcuCode(String epccConsignorEbcuCode) {
		this.epccConsignorEbcuCode = epccConsignorEbcuCode;
		addValidField("epccConsignorEbcuCode");
	}

	/**
	 * Get epccShipperCode
	 */
	@Column(name = "EPCC_SHIPPER_CODE")
	public String getEpccShipperCode() {
		return epccShipperCode;
	}

	/**
	 * Set epccShipperCode
	 */
	public void setEpccShipperCode(String epccShipperCode) {
		this.epccShipperCode = epccShipperCode;
		addValidField("epccShipperCode");
	}

	/**
	 * Get epccShipCode
	 */
	@Column(name = "EPCC_SHIP_CODE")
	public String getEpccShipCode() {
		return epccShipCode;
	}

	/**
	 * Set epccShipCode
	 */
	public void setEpccShipCode(String epccShipCode) {
		this.epccShipCode = epccShipCode;
		addValidField("epccShipCode");
	}

	/**
	 * Get epccShipAgentCode
	 */
	@Column(name = "EPCC_SHIP_AGENT_CODE")
	public String getEpccShipAgentCode() {
		return epccShipAgentCode;
	}

	/**
	 * Set epccShipAgentCode
	 */
	public void setEpccShipAgentCode(String epccShipAgentCode) {
		this.epccShipAgentCode = epccShipAgentCode;
		addValidField("epccShipAgentCode");
	}

	/**
	 * Get epccLoadPortCode
	 */
	@Column(name = "EPCC_LOAD_PORT_CODE")
	public String getEpccLoadPortCode() {
		return epccLoadPortCode;
	}

	/**
	 * Set epccLoadPortCode
	 */
	public void setEpccLoadPortCode(String epccLoadPortCode) {
		this.epccLoadPortCode = epccLoadPortCode;
		addValidField("epccLoadPortCode");
	}

	/**
	 * Get epccLoadPortName
	 */
	@Column(name = "EPCC_LOAD_PORT_NAME")
	public String getEpccLoadPortName() {
		return epccLoadPortName;
	}

	/**
	 * Set epccLoadPortName
	 */
	public void setEpccLoadPortName(String epccLoadPortName) {
		this.epccLoadPortName = epccLoadPortName;
		addValidField("epccLoadPortName");
	}

	/**
	 * Get epccDischargePortName
	 */
	@Column(name = "EPCC_DISCHARGE_PORT_NAME")
	public String getEpccDischargePortName() {
		return epccDischargePortName;
	}

	/**
	 * Set epccDischargePortName
	 */
	public void setEpccDischargePortName(String epccDischargePortName) {
		this.epccDischargePortName = epccDischargePortName;
		addValidField("epccDischargePortName");
	}

	/**
	 * Get epccDischargePortCode
	 */
	@Column(name = "EPCC_DISCHARGE_PORT_CODE")
	public String getEpccDischargePortCode() {
		return epccDischargePortCode;
	}

	/**
	 * Set epccDischargePortCode
	 */
	public void setEpccDischargePortCode(String epccDischargePortCode) {
		this.epccDischargePortCode = epccDischargePortCode;
		addValidField("epccDischargePortCode");
	}

	/**
	 * Get epccEbpjId
	 */
	@Column(name = "EPCC_EBPJ_ID")
	public Long getEpccEbpjId() {
		return epccEbpjId;
	}

	/**
	 * Set epccEbpjId
	 */
	public void setEpccEbpjId(Long epccEbpjId) {
		this.epccEbpjId = epccEbpjId;
		addValidField("epccEbpjId");
	}

	/**
	 * Get epccStatus
	 */
	@Column(name = "EPCC_STATUS")
	public String getEpccStatus() {
		return epccStatus;
	}
	
	/**
	 * Set epccStatus
	 */
	public void setEpccStatus(String epccStatus) {
		this.epccStatus = epccStatus;
		addValidField("epccStatus");
	}
	
	/**
	 * Get epccElplId
	 */
	@Column(name = "EPCC_ELPL_ID")
	public Long getEpccElplId() {
		return epccElplId;
	}

	/**
	 * Set epccElplId
	 */
	public void setEpccElplId(Long epccElplId) {
		this.epccElplId = epccElplId;
		addValidField("epccElplId");
	}
	
	/**
	 * Get epccFreightClauseCode
	 */
	@Column(name = "EPCC_FREIGHT_CLAUSE_CODE")
	public String getEpccFreightClauseCode() {
		return epccFreightClauseCode;
	}

	/**
	 * Set epccFreightClauseCode
	 */
	public void setEpccFreightClauseCode(String epccFreightClauseCode) {
		this.epccFreightClauseCode = epccFreightClauseCode;
		addValidField("epccFreightClauseCode");
	}

	/**
	 * Get epccLmId
	 */
	@Column(name = "EPCC_LM_ID")
	public String getEpccLmId() {
		return epccLmId;
	}

	/**
	 * Set epccLmId
	 */
	public void setEpccLmId(String epccLmId) {
		this.epccLmId = epccLmId;
		addValidField("epccLmId");
	}

	/**
	 * Get epccBmsEbsmCode
	 */
	@Column(name = "EPCC_BMS_EBSM_CODE")
	public String getEpccBmsEbsmCode() {
		return epccBmsEbsmCode;
	}

	/**
	 * Set epccBmsEbsmCode
	 */
	public void setEpccBmsEbsmCode(String epccBmsEbsmCode) {
		this.epccBmsEbsmCode = epccBmsEbsmCode;
		addValidField("epccBmsEbsmCode");
	}

	/**
	 * Get epccIsTrailer
	 */
	@Column(name = "EPCC_IS_TRAILER")
	public Long getEpccIsTrailer() {
		return epccIsTrailer;
	}

	/**
	 * Set epccIsTrailer
	 */
	public void setEpccIsTrailer(Long epccIsTrailer) {
		this.epccIsTrailer = epccIsTrailer;
		addValidField("epccIsTrailer");
	}

	/**
	 * Get epccIsBooking
	 */
	@Column(name = "EPCC_IS_BOOKING")
	public Long getEpccIsBooking() {
		return epccIsBooking;
	}

	/**
	 * Set epccIsBooking
	 */
	public void setEpccIsBooking(Long epccIsBooking) {
		this.epccIsBooking = epccIsBooking;
		addValidField("epccIsBooking");
	}

	/**
	 * Get epccIsDeclaration
	 */
	@Column(name = "EPCC_IS_DECLARATION")
	public Long getEpccIsDeclaration() {
		return epccIsDeclaration;
	}

	/**
	 * Set epccIsDeclaration
	 */
	public void setEpccIsDeclaration(Long epccIsDeclaration) {
		this.epccIsDeclaration = epccIsDeclaration;
		addValidField("epccIsDeclaration");
	}
	
	/**
	 * Get epccTruckCode
	 */
	@Column(name = "EPCC_TRUCK_CODE")
	public String getEpccTruckCode() {
		return epccTruckCode;
	}
	
	/**
	 * Set epccTruckCode
	 */
	public void setEpccTruckCode(String epccTruckCode) {
		this.epccTruckCode = epccTruckCode;
		addValidField("epccTruckCode");
	}
	
	/**
	 * Get epccCustomsCode
	 */
	@Column(name = "EPCC_CUSTOMS_CODE")
	public String getEpccCustomsCode() {
		return epccCustomsCode;
	}
	
	/**
	 * Set epccCustomsCode
	 */
	public void setEpccCustomsCode(String epccCustomsCode) {
		this.epccCustomsCode = epccCustomsCode;
		addValidField("epccCustomsCode");
	}
	
}
