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
 * Model class for ElContractConfig
 */
@Entity
@Table(name = "EL_CONTRACT_CONFIG")
public class ElContractConfigModel extends BaseModel implements OperationLog {

	//elccId
	private Long elccId;
	//elccElctId
	private Long elccElctId;
	//elccType
	private String elccType;
	//elccPaymentMode
	private String elccPaymentMode;
	//elccLoadPortId
	private Long elccLoadPortId;
	//elccLoadPortCode
	private String elccLoadPortCode;
	//elccLoadPortName
	private String elccLoadPortName;
	//elccDischargePortId
	private Long elccDischargePortId;
	//elccDischargePortName
	private String elccDischargePortName;
	//elccDischargePortCode
	private String elccDischargePortCode;
	//elccCarrierId
	private Long elccCarrierId;
	//elccCarrierCode
	private String elccCarrierCode;
	//elccCarrierName
	private String elccCarrierName;
	//elccBookingAgentId
	private Long elccBookingAgentId;
	//elccBookingAgentCode
	private String elccBookingAgentCode;
	//elccBookingAgentName
	private String elccBookingAgentName;
	//elccServicesType
	private String elccServicesType;
	//elccTruckType
	private String elccTruckType;
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
	//elccSubstr1
	private String elccSubstr1;
	//elccSubstr2
	private String elccSubstr2;
	//elccSubdate1
	private Date elccSubdate1;
	//elccSubdate2
	private Date elccSubdate2;
	//elccSubnum1
	private Long elccSubnum1;
	//elccSubnum2
	private Long elccSubnum2;
	//elccEscoId
	private Long elccEscoId;
	//elccEbpjId
	private Long elccEbpjId;

	/**
	 * Get elccId
	 */
	@Column(name = "ELCC_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getElccId() {
		return elccId;
	}

	/**
	 * Set elccId
	 */
	public void setElccId(Long elccId) {
		this.elccId = elccId;
		addValidField("elccId");
	}

	/**
	 * Get elccElctId
	 */
	@Column(name = "ELCC_ELCT_ID")
	public Long getElccElctId() {
		return elccElctId;
	}

	/**
	 * Set elccElctId
	 */
	public void setElccElctId(Long elccElctId) {
		this.elccElctId = elccElctId;
		addValidField("elccElctId");
	}

	/**
	 * Get elccType
	 */
	@Column(name = "ELCC_TYPE")
	public String getElccType() {
		return elccType;
	}

	/**
	 * Set elccType
	 */
	public void setElccType(String elccType) {
		this.elccType = elccType;
		addValidField("elccType");
	}

	/**
	 * Get elccPaymentMode
	 */
	@Column(name = "ELCC_PAYMENT_MODE")
	public String getElccPaymentMode() {
		return elccPaymentMode;
	}

	/**
	 * Set elccPaymentMode
	 */
	public void setElccPaymentMode(String elccPaymentMode) {
		this.elccPaymentMode = elccPaymentMode;
		addValidField("elccPaymentMode");
	}

	/**
	 * Get elccLoadPortId
	 */
	@Column(name = "ELCC_LOAD_PORT_ID")
	public Long getElccLoadPortId() {
		return elccLoadPortId;
	}

	/**
	 * Set elccLoadPortId
	 */
	public void setElccLoadPortId(Long elccLoadPortId) {
		this.elccLoadPortId = elccLoadPortId;
		addValidField("elccLoadPortId");
	}

	/**
	 * Get elccLoadPortCode
	 */
	@Column(name = "ELCC_LOAD_PORT_CODE")
	public String getElccLoadPortCode() {
		return elccLoadPortCode;
	}

	/**
	 * Set elccLoadPortCode
	 */
	public void setElccLoadPortCode(String elccLoadPortCode) {
		this.elccLoadPortCode = elccLoadPortCode;
		addValidField("elccLoadPortCode");
	}

	/**
	 * Get elccLoadPortName
	 */
	@Column(name = "ELCC_LOAD_PORT_NAME")
	public String getElccLoadPortName() {
		return elccLoadPortName;
	}

	/**
	 * Set elccLoadPortName
	 */
	public void setElccLoadPortName(String elccLoadPortName) {
		this.elccLoadPortName = elccLoadPortName;
		addValidField("elccLoadPortName");
	}

	/**
	 * Get elccDischargePortId
	 */
	@Column(name = "ELCC_DISCHARGE_PORT_ID")
	public Long getElccDischargePortId() {
		return elccDischargePortId;
	}

	/**
	 * Set elccDischargePortId
	 */
	public void setElccDischargePortId(Long elccDischargePortId) {
		this.elccDischargePortId = elccDischargePortId;
		addValidField("elccDischargePortId");
	}

	/**
	 * Get elccDischargePortName
	 */
	@Column(name = "ELCC_DISCHARGE_PORT_NAME")
	public String getElccDischargePortName() {
		return elccDischargePortName;
	}

	/**
	 * Set elccDischargePortName
	 */
	public void setElccDischargePortName(String elccDischargePortName) {
		this.elccDischargePortName = elccDischargePortName;
		addValidField("elccDischargePortName");
	}

	/**
	 * Get elccDischargePortCode
	 */
	@Column(name = "ELCC_DISCHARGE_PORT_CODE")
	public String getElccDischargePortCode() {
		return elccDischargePortCode;
	}

	/**
	 * Set elccDischargePortCode
	 */
	public void setElccDischargePortCode(String elccDischargePortCode) {
		this.elccDischargePortCode = elccDischargePortCode;
		addValidField("elccDischargePortCode");
	}

	/**
	 * Get elccCarrierId
	 */
	@Column(name = "ELCC_CARRIER_ID")
	public Long getElccCarrierId() {
		return elccCarrierId;
	}

	/**
	 * Set elccCarrierId
	 */
	public void setElccCarrierId(Long elccCarrierId) {
		this.elccCarrierId = elccCarrierId;
		addValidField("elccCarrierId");
	}

	/**
	 * Get elccCarrierCode
	 */
	@Column(name = "ELCC_CARRIER_CODE")
	public String getElccCarrierCode() {
		return elccCarrierCode;
	}

	/**
	 * Set elccCarrierCode
	 */
	public void setElccCarrierCode(String elccCarrierCode) {
		this.elccCarrierCode = elccCarrierCode;
		addValidField("elccCarrierCode");
	}

	/**
	 * Get elccCarrierName
	 */
	@Column(name = "ELCC_CARRIER_NAME")
	public String getElccCarrierName() {
		return elccCarrierName;
	}

	/**
	 * Set elccCarrierName
	 */
	public void setElccCarrierName(String elccCarrierName) {
		this.elccCarrierName = elccCarrierName;
		addValidField("elccCarrierName");
	}

	/**
	 * Get elccBookingAgentId
	 */
	@Column(name = "ELCC_BOOKING_AGENT_ID")
	public Long getElccBookingAgentId() {
		return elccBookingAgentId;
	}

	/**
	 * Set elccBookingAgentId
	 */
	public void setElccBookingAgentId(Long elccBookingAgentId) {
		this.elccBookingAgentId = elccBookingAgentId;
		addValidField("elccBookingAgentId");
	}

	/**
	 * Get elccBookingAgentCode
	 */
	@Column(name = "ELCC_BOOKING_AGENT_CODE")
	public String getElccBookingAgentCode() {
		return elccBookingAgentCode;
	}

	/**
	 * Set elccBookingAgentCode
	 */
	public void setElccBookingAgentCode(String elccBookingAgentCode) {
		this.elccBookingAgentCode = elccBookingAgentCode;
		addValidField("elccBookingAgentCode");
	}

	/**
	 * Get elccBookingAgentName
	 */
	@Column(name = "ELCC_BOOKING_AGENT_NAME")
	public String getElccBookingAgentName() {
		return elccBookingAgentName;
	}

	/**
	 * Set elccBookingAgentName
	 */
	public void setElccBookingAgentName(String elccBookingAgentName) {
		this.elccBookingAgentName = elccBookingAgentName;
		addValidField("elccBookingAgentName");
	}

	/**
	 * Get elccServicesType
	 */
	@Column(name = "ELCC_SERVICES_TYPE")
	public String getElccServicesType() {
		return elccServicesType;
	}

	/**
	 * Set elccServicesType
	 */
	public void setElccServicesType(String elccServicesType) {
		this.elccServicesType = elccServicesType;
		addValidField("elccServicesType");
	}

	/**
	 * Get elccTruckType
	 */
	@Column(name = "ELCC_TRUCK_TYPE")
	public String getElccTruckType() {
		return elccTruckType;
	}

	/**
	 * Set elccTruckType
	 */
	public void setElccTruckType(String elccTruckType) {
		this.elccTruckType = elccTruckType;
		addValidField("elccTruckType");
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
	 * Get elccSubstr1
	 */
	@Column(name = "ELCC_SUBSTR1")
	public String getElccSubstr1() {
		return elccSubstr1;
	}

	/**
	 * Set elccSubstr1
	 */
	public void setElccSubstr1(String elccSubstr1) {
		this.elccSubstr1 = elccSubstr1;
		addValidField("elccSubstr1");
	}

	/**
	 * Get elccSubstr2
	 */
	@Column(name = "ELCC_SUBSTR2")
	public String getElccSubstr2() {
		return elccSubstr2;
	}

	/**
	 * Set elccSubstr2
	 */
	public void setElccSubstr2(String elccSubstr2) {
		this.elccSubstr2 = elccSubstr2;
		addValidField("elccSubstr2");
	}

	/**
	 * Get elccSubdate1
	 */
	@Column(name = "ELCC_SUBDATE1")
	public Date getElccSubdate1() {
		return elccSubdate1;
	}

	/**
	 * Set elccSubdate1
	 */
	public void setElccSubdate1(Date elccSubdate1) {
		this.elccSubdate1 = elccSubdate1;
		addValidField("elccSubdate1");
	}

	/**
	 * Get elccSubdate2
	 */
	@Column(name = "ELCC_SUBDATE2")
	public Date getElccSubdate2() {
		return elccSubdate2;
	}

	/**
	 * Set elccSubdate2
	 */
	public void setElccSubdate2(Date elccSubdate2) {
		this.elccSubdate2 = elccSubdate2;
		addValidField("elccSubdate2");
	}

	/**
	 * Get elccSubnum1
	 */
	@Column(name = "ELCC_SUBNUM1")
	public Long getElccSubnum1() {
		return elccSubnum1;
	}

	/**
	 * Set elccSubnum1
	 */
	public void setElccSubnum1(Long elccSubnum1) {
		this.elccSubnum1 = elccSubnum1;
		addValidField("elccSubnum1");
	}

	/**
	 * Get elccSubnum2
	 */
	@Column(name = "ELCC_SUBNUM2")
	public Long getElccSubnum2() {
		return elccSubnum2;
	}

	/**
	 * Set elccSubnum2
	 */
	public void setElccSubnum2(Long elccSubnum2) {
		this.elccSubnum2 = elccSubnum2;
		addValidField("elccSubnum2");
	}

	/**
	 * Get elccEscoId
	 */
	@Column(name = "ELCC_ESCO_ID")
	public Long getElccEscoId() {
		return elccEscoId;
	}

	/**
	 * Set elccEscoId
	 */
	public void setElccEscoId(Long elccEscoId) {
		this.elccEscoId = elccEscoId;
		addValidField("elccEscoId");
	}

	/**
	 * Get elccEbpjId
	 */
	@Column(name = "ELCC_EBPJ_ID")
	public Long getElccEbpjId() {
		return elccEbpjId;
	}

	/**
	 * Set elccEbpjId
	 */
	public void setElccEbpjId(Long elccEbpjId) {
		this.elccEbpjId = elccEbpjId;
		addValidField("elccEbpjId");
	}

}
