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
 * Model class for EoRequestAbroad
 */
@Entity
@Table(name = "EO_REQUEST_ABROAD")
public class EoRequestAbroadModel extends BaseModel implements OperationLog {

	//eoraId
	private Long eoraId;
	//eoraEscoId
	private Long eoraEscoId;
	//eoraEbpjId
	private Long eoraEbpjId;
	//eoraLoEbppId
	private Long eoraLoEbppId;
	//eoraEbtkId
	private Long eoraEbtkId;
	//eoraIsAutomatic
	private String eoraIsAutomatic;
	//eoraTaskStatus
	private String eoraTaskStatus;
	//eoraTaskFeedback
	private String eoraTaskFeedback;
	//eoraSysCode
	private String eoraSysCode;
	//eoraEbbuId
	private Long eoraEbbuId;
	//eoraEbbuNameCn
	private String eoraEbbuNameCn;
	//eoraEbbuCode
	private String eoraEbbuCode;
	//eoraEbbuDist1
	private String eoraEbbuDist1;
	//eoraEbbuDist2
	private String eoraEbbuDist2;
	//eoraEbbuDist3
	private String eoraEbbuDist3;
	//eoraEbbuDist4
	private String eoraEbbuDist4;
	//eoraEbbuDist5
	private String eoraEbbuDist5;
	//eoraToId
	private String eoraToId;
	//eoraEoorId
	private Long eoraEoorId;
	//eoraNo
	private String eoraNo;
	//eoraType
	private String eoraType;
	//eoraStatus
	private String eoraStatus;
	//eoraOrder
	private Long eoraOrder;
	//eoraSoNo
	private String eoraSoNo;
	//eoraDoNo
	private String eoraDoNo;
	//eoraShipname
	private String eoraShipname;
	//eoraFlightLine
	private String eoraFlightLine;
	//eoraBillNo
	private String eoraBillNo;
	//eoraAta
	private Date eoraAta;
	//eoraBillchangeDate
	private Date eoraBillchangeDate;
	//eoraDeclarationDate
	private Date eoraDeclarationDate;
	//eoraDeclarationNo
	private String eoraDeclarationNo;
	//eoraAgentId
	private Long eoraAgentId;
	//eoraAgentNo
	private String eoraAgentNo;
	//eoraAgentName
	private String eoraAgentName;
	//eoraRemark
	private String eoraRemark;
	//eoraBoxNo
	private String eoraBoxNo;
	//eoraCfsNo
	private String eoraCfsNo;
	//eoraCfsName
	private String eoraCfsName;
	//eoraCfsIndate
	private Date eoraCfsIndate;
	//eoraCfsPickdate
	private Date eoraCfsPickdate;
	//eoraCfsAllocdate
	private Date eoraCfsAllocdate;
	//eoraHouseNo
	private String eoraHouseNo;
	//eoraInDate
	private Date eoraInDate;
	//eoraDispatchDate
	private Date eoraDispatchDate;
	//eoraDispatchor
	private String eoraDispatchor;
	//eoraDispatchPhone
	private String eoraDispatchPhone;
	//eoraSignDate
	private Date eoraSignDate;
	//eoraSignor
	private String eoraSignor;
	//eoraSubstr1
	private String eoraSubstr1;
	//eoraSubstr2
	private String eoraSubstr2;
	//eoraSubstr3
	private String eoraSubstr3;
	//eoraSubstr4
	private String eoraSubstr4;
	//eoraSubstr5
	private String eoraSubstr5;
	//eoraSubstr6
	private String eoraSubstr6;
	//eoraSubstr7
	private String eoraSubstr7;
	//eoraSubstr8
	private String eoraSubstr8;
	//eoraSubstr9
	private String eoraSubstr9;
	//eoraSubstr10
	private String eoraSubstr10;
	//eoraSubstr11
	private String eoraSubstr11;
	//eoraSubstr12
	private String eoraSubstr12;
	//eoraSubstr13
	private String eoraSubstr13;
	//eoraSubstr14
	private String eoraSubstr14;
	//eoraSubstr15
	private String eoraSubstr15;
	//eoraSubstr16
	private String eoraSubstr16;
	//eoraSubstr17
	private String eoraSubstr17;
	//eoraSubstr18
	private String eoraSubstr18;
	//eoraSubstr19
	private String eoraSubstr19;
	//eoraSubstr20
	private String eoraSubstr20;
	//eoraSubstr21
	private String eoraSubstr21;
	//eoraSubstr22
	private String eoraSubstr22;
	//eoraSubstr23
	private String eoraSubstr23;
	//eoraSubstr24
	private String eoraSubstr24;
	//eoraSubstr25
	private String eoraSubstr25;
	//eoraSubdate1
	private Date eoraSubdate1;
	//eoraSubdate2
	private Date eoraSubdate2;
	//eoraSubdate3
	private Date eoraSubdate3;
	//eoraSubdate4
	private Date eoraSubdate4;
	//eoraSubdate5
	private Date eoraSubdate5;
	//eoraSubdate6
	private Date eoraSubdate6;
	//eoraSubnum1
	private Long eoraSubnum1;
	//eoraSubnum2
	private Long eoraSubnum2;
	//eoraSubnum3
	private Long eoraSubnum3;
	//eoraSubnum4
	private Long eoraSubnum4;
	//eoraSubnum5
	private Long eoraSubnum5;
	//eoraSubnum6
	private Long eoraSubnum6;
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
	//eoraHeavyBoxesDate
	private Date eoraHeavyBoxesDate;
	//eoraEmptyContainersDate
	private Date eoraEmptyContainersDate;
	//eoraCargoEbrgId
	private Long eoraCargoEbrgId;
	//eoraCargoEbrgNo
	private String eoraCargoEbrgNo;
	//eoraCargoEbrgName
	private String eoraCargoEbrgName;
	//eoraUnloadingDate
	private Date eoraUnloadingDate;

	/**
	 * Get eoraId
	 */
	@Column(name = "EORA_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getEoraId() {
		return eoraId;
	}

	/**
	 * Set eoraId
	 */
	public void setEoraId(Long eoraId) {
		this.eoraId = eoraId;
		addValidField("eoraId");
	}

	/**
	 * Get eoraEscoId
	 */
	@Column(name = "EORA_ESCO_ID")
	public Long getEoraEscoId() {
		return eoraEscoId;
	}

	/**
	 * Set eoraEscoId
	 */
	public void setEoraEscoId(Long eoraEscoId) {
		this.eoraEscoId = eoraEscoId;
		addValidField("eoraEscoId");
	}

	/**
	 * Get eoraEbpjId
	 */
	@Column(name = "EORA_EBPJ_ID")
	public Long getEoraEbpjId() {
		return eoraEbpjId;
	}

	/**
	 * Set eoraEbpjId
	 */
	public void setEoraEbpjId(Long eoraEbpjId) {
		this.eoraEbpjId = eoraEbpjId;
		addValidField("eoraEbpjId");
	}

	/**
	 * Get eoraLoEbppId
	 */
	@Column(name = "EORA_LO_EBPP_ID")
	public Long getEoraLoEbppId() {
		return eoraLoEbppId;
	}

	/**
	 * Set eoraLoEbppId
	 */
	public void setEoraLoEbppId(Long eoraLoEbppId) {
		this.eoraLoEbppId = eoraLoEbppId;
		addValidField("eoraLoEbppId");
	}

	/**
	 * Get eoraEbtkId
	 */
	@Column(name = "EORA_EBTK_ID")
	public Long getEoraEbtkId() {
		return eoraEbtkId;
	}

	/**
	 * Set eoraEbtkId
	 */
	public void setEoraEbtkId(Long eoraEbtkId) {
		this.eoraEbtkId = eoraEbtkId;
		addValidField("eoraEbtkId");
	}

	/**
	 * Get eoraIsAutomatic
	 */
	@Column(name = "EORA_IS_AUTOMATIC")
	public String getEoraIsAutomatic() {
		return eoraIsAutomatic;
	}

	/**
	 * Set eoraIsAutomatic
	 */
	public void setEoraIsAutomatic(String eoraIsAutomatic) {
		this.eoraIsAutomatic = eoraIsAutomatic;
		addValidField("eoraIsAutomatic");
	}

	/**
	 * Get eoraTaskStatus
	 */
	@Column(name = "EORA_TASK_STATUS")
	public String getEoraTaskStatus() {
		return eoraTaskStatus;
	}

	/**
	 * Set eoraTaskStatus
	 */
	public void setEoraTaskStatus(String eoraTaskStatus) {
		this.eoraTaskStatus = eoraTaskStatus;
		addValidField("eoraTaskStatus");
	}

	/**
	 * Get eoraTaskFeedback
	 */
	@Column(name = "EORA_TASK_FEEDBACK")
	public String getEoraTaskFeedback() {
		return eoraTaskFeedback;
	}

	/**
	 * Set eoraTaskFeedback
	 */
	public void setEoraTaskFeedback(String eoraTaskFeedback) {
		this.eoraTaskFeedback = eoraTaskFeedback;
		addValidField("eoraTaskFeedback");
	}

	/**
	 * Get eoraSysCode
	 */
	@Column(name = "EORA_SYS_CODE")
	public String getEoraSysCode() {
		return eoraSysCode;
	}

	/**
	 * Set eoraSysCode
	 */
	public void setEoraSysCode(String eoraSysCode) {
		this.eoraSysCode = eoraSysCode;
		addValidField("eoraSysCode");
	}

	/**
	 * Get eoraEbbuId
	 */
	@Column(name = "EORA_EBBU_ID")
	public Long getEoraEbbuId() {
		return eoraEbbuId;
	}

	/**
	 * Set eoraEbbuId
	 */
	public void setEoraEbbuId(Long eoraEbbuId) {
		this.eoraEbbuId = eoraEbbuId;
		addValidField("eoraEbbuId");
	}

	/**
	 * Get eoraEbbuNameCn
	 */
	@Column(name = "EORA_EBBU_NAME_CN")
	public String getEoraEbbuNameCn() {
		return eoraEbbuNameCn;
	}

	/**
	 * Set eoraEbbuNameCn
	 */
	public void setEoraEbbuNameCn(String eoraEbbuNameCn) {
		this.eoraEbbuNameCn = eoraEbbuNameCn;
		addValidField("eoraEbbuNameCn");
	}

	/**
	 * Get eoraEbbuCode
	 */
	@Column(name = "EORA_EBBU_CODE")
	public String getEoraEbbuCode() {
		return eoraEbbuCode;
	}

	/**
	 * Set eoraEbbuCode
	 */
	public void setEoraEbbuCode(String eoraEbbuCode) {
		this.eoraEbbuCode = eoraEbbuCode;
		addValidField("eoraEbbuCode");
	}

	/**
	 * Get eoraEbbuDist1
	 */
	@Column(name = "EORA_EBBU_DIST_1")
	public String getEoraEbbuDist1() {
		return eoraEbbuDist1;
	}

	/**
	 * Set eoraEbbuDist1
	 */
	public void setEoraEbbuDist1(String eoraEbbuDist1) {
		this.eoraEbbuDist1 = eoraEbbuDist1;
		addValidField("eoraEbbuDist1");
	}

	/**
	 * Get eoraEbbuDist2
	 */
	@Column(name = "EORA_EBBU_DIST_2")
	public String getEoraEbbuDist2() {
		return eoraEbbuDist2;
	}

	/**
	 * Set eoraEbbuDist2
	 */
	public void setEoraEbbuDist2(String eoraEbbuDist2) {
		this.eoraEbbuDist2 = eoraEbbuDist2;
		addValidField("eoraEbbuDist2");
	}

	/**
	 * Get eoraEbbuDist3
	 */
	@Column(name = "EORA_EBBU_DIST_3")
	public String getEoraEbbuDist3() {
		return eoraEbbuDist3;
	}

	/**
	 * Set eoraEbbuDist3
	 */
	public void setEoraEbbuDist3(String eoraEbbuDist3) {
		this.eoraEbbuDist3 = eoraEbbuDist3;
		addValidField("eoraEbbuDist3");
	}

	/**
	 * Get eoraEbbuDist4
	 */
	@Column(name = "EORA_EBBU_DIST_4")
	public String getEoraEbbuDist4() {
		return eoraEbbuDist4;
	}

	/**
	 * Set eoraEbbuDist4
	 */
	public void setEoraEbbuDist4(String eoraEbbuDist4) {
		this.eoraEbbuDist4 = eoraEbbuDist4;
		addValidField("eoraEbbuDist4");
	}

	/**
	 * Get eoraEbbuDist5
	 */
	@Column(name = "EORA_EBBU_DIST_5")
	public String getEoraEbbuDist5() {
		return eoraEbbuDist5;
	}

	/**
	 * Set eoraEbbuDist5
	 */
	public void setEoraEbbuDist5(String eoraEbbuDist5) {
		this.eoraEbbuDist5 = eoraEbbuDist5;
		addValidField("eoraEbbuDist5");
	}

	/**
	 * Get eoraToId
	 */
	@Column(name = "EORA_TO_ID")
	public String getEoraToId() {
		return eoraToId;
	}

	/**
	 * Set eoraToId
	 */
	public void setEoraToId(String eoraToId) {
		this.eoraToId = eoraToId;
		addValidField("eoraToId");
	}

	/**
	 * Get eoraEoorId
	 */
	@Column(name = "EORA_EOOR_ID")
	public Long getEoraEoorId() {
		return eoraEoorId;
	}

	/**
	 * Set eoraEoorId
	 */
	public void setEoraEoorId(Long eoraEoorId) {
		this.eoraEoorId = eoraEoorId;
		addValidField("eoraEoorId");
	}

	/**
	 * Get eoraNo
	 */
	@Column(name = "EORA_NO")
	public String getEoraNo() {
		return eoraNo;
	}

	/**
	 * Set eoraNo
	 */
	public void setEoraNo(String eoraNo) {
		this.eoraNo = eoraNo;
		addValidField("eoraNo");
	}

	/**
	 * Get eoraType
	 */
	@Column(name = "EORA_TYPE")
	public String getEoraType() {
		return eoraType;
	}

	/**
	 * Set eoraType
	 */
	public void setEoraType(String eoraType) {
		this.eoraType = eoraType;
		addValidField("eoraType");
	}

	/**
	 * Get eoraStatus
	 */
	@Column(name = "EORA_STATUS")
	public String getEoraStatus() {
		return eoraStatus;
	}

	/**
	 * Set eoraStatus
	 */
	public void setEoraStatus(String eoraStatus) {
		this.eoraStatus = eoraStatus;
		addValidField("eoraStatus");
	}

	/**
	 * Get eoraOrder
	 */
	@Column(name = "EORA_ORDER")
	public Long getEoraOrder() {
		return eoraOrder;
	}

	/**
	 * Set eoraOrder
	 */
	public void setEoraOrder(Long eoraOrder) {
		this.eoraOrder = eoraOrder;
		addValidField("eoraOrder");
	}

	/**
	 * Get eoraSoNo
	 */
	@Column(name = "EORA_SO_NO")
	public String getEoraSoNo() {
		return eoraSoNo;
	}

	/**
	 * Set eoraSoNo
	 */
	public void setEoraSoNo(String eoraSoNo) {
		this.eoraSoNo = eoraSoNo;
		addValidField("eoraSoNo");
	}

	/**
	 * Get eoraDoNo
	 */
	@Column(name = "EORA_DO_NO")
	public String getEoraDoNo() {
		return eoraDoNo;
	}

	/**
	 * Set eoraDoNo
	 */
	public void setEoraDoNo(String eoraDoNo) {
		this.eoraDoNo = eoraDoNo;
		addValidField("eoraDoNo");
	}

	/**
	 * Get eoraShipname
	 */
	@Column(name = "EORA_SHIPNAME")
	public String getEoraShipname() {
		return eoraShipname;
	}

	/**
	 * Set eoraShipname
	 */
	public void setEoraShipname(String eoraShipname) {
		this.eoraShipname = eoraShipname;
		addValidField("eoraShipname");
	}

	/**
	 * Get eoraFlightLine
	 */
	@Column(name = "EORA_FLIGHT_LINE")
	public String getEoraFlightLine() {
		return eoraFlightLine;
	}

	/**
	 * Set eoraFlightLine
	 */
	public void setEoraFlightLine(String eoraFlightLine) {
		this.eoraFlightLine = eoraFlightLine;
		addValidField("eoraFlightLine");
	}

	/**
	 * Get eoraBillNo
	 */
	@Column(name = "EORA_BILL_NO")
	public String getEoraBillNo() {
		return eoraBillNo;
	}

	/**
	 * Set eoraBillNo
	 */
	public void setEoraBillNo(String eoraBillNo) {
		this.eoraBillNo = eoraBillNo;
		addValidField("eoraBillNo");
	}

	/**
	 * Get eoraAta
	 */
	@Column(name = "EORA_ATA")
	public Date getEoraAta() {
		return eoraAta;
	}

	/**
	 * Set eoraAta
	 */
	public void setEoraAta(Date eoraAta) {
		this.eoraAta = eoraAta;
		addValidField("eoraAta");
	}

	/**
	 * Get eoraBillchangeDate
	 */
	@Column(name = "EORA_BILLCHANGE_DATE")
	public Date getEoraBillchangeDate() {
		return eoraBillchangeDate;
	}

	/**
	 * Set eoraBillchangeDate
	 */
	public void setEoraBillchangeDate(Date eoraBillchangeDate) {
		this.eoraBillchangeDate = eoraBillchangeDate;
		addValidField("eoraBillchangeDate");
	}

	/**
	 * Get eoraDeclarationDate
	 */
	@Column(name = "EORA_DECLARATION_DATE")
	public Date getEoraDeclarationDate() {
		return eoraDeclarationDate;
	}

	/**
	 * Set eoraDeclarationDate
	 */
	public void setEoraDeclarationDate(Date eoraDeclarationDate) {
		this.eoraDeclarationDate = eoraDeclarationDate;
		addValidField("eoraDeclarationDate");
	}

	/**
	 * Get eoraDeclarationNo
	 */
	@Column(name = "EORA_DECLARATION_NO")
	public String getEoraDeclarationNo() {
		return eoraDeclarationNo;
	}

	/**
	 * Set eoraDeclarationNo
	 */
	public void setEoraDeclarationNo(String eoraDeclarationNo) {
		this.eoraDeclarationNo = eoraDeclarationNo;
		addValidField("eoraDeclarationNo");
	}

	/**
	 * Get eoraAgentId
	 */
	@Column(name = "EORA_AGENT_ID")
	public Long getEoraAgentId() {
		return eoraAgentId;
	}

	/**
	 * Set eoraAgentId
	 */
	public void setEoraAgentId(Long eoraAgentId) {
		this.eoraAgentId = eoraAgentId;
		addValidField("eoraAgentId");
	}

	/**
	 * Get eoraAgentNo
	 */
	@Column(name = "EORA_AGENT_NO")
	public String getEoraAgentNo() {
		return eoraAgentNo;
	}

	/**
	 * Set eoraAgentNo
	 */
	public void setEoraAgentNo(String eoraAgentNo) {
		this.eoraAgentNo = eoraAgentNo;
		addValidField("eoraAgentNo");
	}

	/**
	 * Get eoraAgentName
	 */
	@Column(name = "EORA_AGENT_NAME")
	public String getEoraAgentName() {
		return eoraAgentName;
	}

	/**
	 * Set eoraAgentName
	 */
	public void setEoraAgentName(String eoraAgentName) {
		this.eoraAgentName = eoraAgentName;
		addValidField("eoraAgentName");
	}

	/**
	 * Get eoraRemark
	 */
	@Column(name = "EORA_REMARK")
	public String getEoraRemark() {
		return eoraRemark;
	}

	/**
	 * Set eoraRemark
	 */
	public void setEoraRemark(String eoraRemark) {
		this.eoraRemark = eoraRemark;
		addValidField("eoraRemark");
	}

	/**
	 * Get eoraBoxNo
	 */
	@Column(name = "EORA_BOX_NO")
	public String getEoraBoxNo() {
		return eoraBoxNo;
	}

	/**
	 * Set eoraBoxNo
	 */
	public void setEoraBoxNo(String eoraBoxNo) {
		this.eoraBoxNo = eoraBoxNo;
		addValidField("eoraBoxNo");
	}

	/**
	 * Get eoraCfsNo
	 */
	@Column(name = "EORA_CFS_NO")
	public String getEoraCfsNo() {
		return eoraCfsNo;
	}

	/**
	 * Set eoraCfsNo
	 */
	public void setEoraCfsNo(String eoraCfsNo) {
		this.eoraCfsNo = eoraCfsNo;
		addValidField("eoraCfsNo");
	}

	/**
	 * Get eoraCfsName
	 */
	@Column(name = "EORA_CFS_NAME")
	public String getEoraCfsName() {
		return eoraCfsName;
	}

	/**
	 * Set eoraCfsName
	 */
	public void setEoraCfsName(String eoraCfsName) {
		this.eoraCfsName = eoraCfsName;
		addValidField("eoraCfsName");
	}

	/**
	 * Get eoraCfsIndate
	 */
	@Column(name = "EORA_CFS_INDATE")
	public Date getEoraCfsIndate() {
		return eoraCfsIndate;
	}

	/**
	 * Set eoraCfsIndate
	 */
	public void setEoraCfsIndate(Date eoraCfsIndate) {
		this.eoraCfsIndate = eoraCfsIndate;
		addValidField("eoraCfsIndate");
	}

	/**
	 * Get eoraCfsPickdate
	 */
	@Column(name = "EORA_CFS_PICKDATE")
	public Date getEoraCfsPickdate() {
		return eoraCfsPickdate;
	}

	/**
	 * Set eoraCfsPickdate
	 */
	public void setEoraCfsPickdate(Date eoraCfsPickdate) {
		this.eoraCfsPickdate = eoraCfsPickdate;
		addValidField("eoraCfsPickdate");
	}

	/**
	 * Get eoraCfsAllocdate
	 */
	@Column(name = "EORA_CFS_ALLOCDATE")
	public Date getEoraCfsAllocdate() {
		return eoraCfsAllocdate;
	}

	/**
	 * Set eoraCfsAllocdate
	 */
	public void setEoraCfsAllocdate(Date eoraCfsAllocdate) {
		this.eoraCfsAllocdate = eoraCfsAllocdate;
		addValidField("eoraCfsAllocdate");
	}

	/**
	 * Get eoraHouseNo
	 */
	@Column(name = "EORA_HOUSE_NO")
	public String getEoraHouseNo() {
		return eoraHouseNo;
	}

	/**
	 * Set eoraHouseNo
	 */
	public void setEoraHouseNo(String eoraHouseNo) {
		this.eoraHouseNo = eoraHouseNo;
		addValidField("eoraHouseNo");
	}

	/**
	 * Get eoraInDate
	 */
	@Column(name = "EORA_IN_DATE")
	public Date getEoraInDate() {
		return eoraInDate;
	}

	/**
	 * Set eoraInDate
	 */
	public void setEoraInDate(Date eoraInDate) {
		this.eoraInDate = eoraInDate;
		addValidField("eoraInDate");
	}

	/**
	 * Get eoraDispatchDate
	 */
	@Column(name = "EORA_DISPATCH_DATE")
	public Date getEoraDispatchDate() {
		return eoraDispatchDate;
	}

	/**
	 * Set eoraDispatchDate
	 */
	public void setEoraDispatchDate(Date eoraDispatchDate) {
		this.eoraDispatchDate = eoraDispatchDate;
		addValidField("eoraDispatchDate");
	}

	/**
	 * Get eoraDispatchor
	 */
	@Column(name = "EORA_DISPATCHOR")
	public String getEoraDispatchor() {
		return eoraDispatchor;
	}

	/**
	 * Set eoraDispatchor
	 */
	public void setEoraDispatchor(String eoraDispatchor) {
		this.eoraDispatchor = eoraDispatchor;
		addValidField("eoraDispatchor");
	}

	/**
	 * Get eoraDispatchPhone
	 */
	@Column(name = "EORA_DISPATCH_PHONE")
	public String getEoraDispatchPhone() {
		return eoraDispatchPhone;
	}

	/**
	 * Set eoraDispatchPhone
	 */
	public void setEoraDispatchPhone(String eoraDispatchPhone) {
		this.eoraDispatchPhone = eoraDispatchPhone;
		addValidField("eoraDispatchPhone");
	}

	/**
	 * Get eoraSignDate
	 */
	@Column(name = "EORA_SIGN_DATE")
	public Date getEoraSignDate() {
		return eoraSignDate;
	}

	/**
	 * Set eoraSignDate
	 */
	public void setEoraSignDate(Date eoraSignDate) {
		this.eoraSignDate = eoraSignDate;
		addValidField("eoraSignDate");
	}

	/**
	 * Get eoraSignor
	 */
	@Column(name = "EORA_SIGNOR")
	public String getEoraSignor() {
		return eoraSignor;
	}

	/**
	 * Set eoraSignor
	 */
	public void setEoraSignor(String eoraSignor) {
		this.eoraSignor = eoraSignor;
		addValidField("eoraSignor");
	}

	/**
	 * Get eoraSubstr1
	 */
	@Column(name = "EORA_SUBSTR1")
	public String getEoraSubstr1() {
		return eoraSubstr1;
	}

	/**
	 * Set eoraSubstr1
	 */
	public void setEoraSubstr1(String eoraSubstr1) {
		this.eoraSubstr1 = eoraSubstr1;
		addValidField("eoraSubstr1");
	}

	/**
	 * Get eoraSubstr2
	 */
	@Column(name = "EORA_SUBSTR2")
	public String getEoraSubstr2() {
		return eoraSubstr2;
	}

	/**
	 * Set eoraSubstr2
	 */
	public void setEoraSubstr2(String eoraSubstr2) {
		this.eoraSubstr2 = eoraSubstr2;
		addValidField("eoraSubstr2");
	}

	/**
	 * Get eoraSubstr3
	 */
	@Column(name = "EORA_SUBSTR3")
	public String getEoraSubstr3() {
		return eoraSubstr3;
	}

	/**
	 * Set eoraSubstr3
	 */
	public void setEoraSubstr3(String eoraSubstr3) {
		this.eoraSubstr3 = eoraSubstr3;
		addValidField("eoraSubstr3");
	}

	/**
	 * Get eoraSubstr4
	 */
	@Column(name = "EORA_SUBSTR4")
	public String getEoraSubstr4() {
		return eoraSubstr4;
	}

	/**
	 * Set eoraSubstr4
	 */
	public void setEoraSubstr4(String eoraSubstr4) {
		this.eoraSubstr4 = eoraSubstr4;
		addValidField("eoraSubstr4");
	}

	/**
	 * Get eoraSubstr5
	 */
	@Column(name = "EORA_SUBSTR5")
	public String getEoraSubstr5() {
		return eoraSubstr5;
	}

	/**
	 * Set eoraSubstr5
	 */
	public void setEoraSubstr5(String eoraSubstr5) {
		this.eoraSubstr5 = eoraSubstr5;
		addValidField("eoraSubstr5");
	}

	/**
	 * Get eoraSubstr6
	 */
	@Column(name = "EORA_SUBSTR6")
	public String getEoraSubstr6() {
		return eoraSubstr6;
	}

	/**
	 * Set eoraSubstr6
	 */
	public void setEoraSubstr6(String eoraSubstr6) {
		this.eoraSubstr6 = eoraSubstr6;
		addValidField("eoraSubstr6");
	}

	/**
	 * Get eoraSubstr7
	 */
	@Column(name = "EORA_SUBSTR7")
	public String getEoraSubstr7() {
		return eoraSubstr7;
	}

	/**
	 * Set eoraSubstr7
	 */
	public void setEoraSubstr7(String eoraSubstr7) {
		this.eoraSubstr7 = eoraSubstr7;
		addValidField("eoraSubstr7");
	}

	/**
	 * Get eoraSubstr8
	 */
	@Column(name = "EORA_SUBSTR8")
	public String getEoraSubstr8() {
		return eoraSubstr8;
	}

	/**
	 * Set eoraSubstr8
	 */
	public void setEoraSubstr8(String eoraSubstr8) {
		this.eoraSubstr8 = eoraSubstr8;
		addValidField("eoraSubstr8");
	}

	/**
	 * Get eoraSubstr9
	 */
	@Column(name = "EORA_SUBSTR9")
	public String getEoraSubstr9() {
		return eoraSubstr9;
	}

	/**
	 * Set eoraSubstr9
	 */
	public void setEoraSubstr9(String eoraSubstr9) {
		this.eoraSubstr9 = eoraSubstr9;
		addValidField("eoraSubstr9");
	}

	/**
	 * Get eoraSubstr10
	 */
	@Column(name = "EORA_SUBSTR10")
	public String getEoraSubstr10() {
		return eoraSubstr10;
	}

	/**
	 * Set eoraSubstr10
	 */
	public void setEoraSubstr10(String eoraSubstr10) {
		this.eoraSubstr10 = eoraSubstr10;
		addValidField("eoraSubstr10");
	}

	/**
	 * Get eoraSubstr11
	 */
	@Column(name = "EORA_SUBSTR11")
	public String getEoraSubstr11() {
		return eoraSubstr11;
	}

	/**
	 * Set eoraSubstr11
	 */
	public void setEoraSubstr11(String eoraSubstr11) {
		this.eoraSubstr11 = eoraSubstr11;
		addValidField("eoraSubstr11");
	}

	/**
	 * Get eoraSubstr12
	 */
	@Column(name = "EORA_SUBSTR12")
	public String getEoraSubstr12() {
		return eoraSubstr12;
	}

	/**
	 * Set eoraSubstr12
	 */
	public void setEoraSubstr12(String eoraSubstr12) {
		this.eoraSubstr12 = eoraSubstr12;
		addValidField("eoraSubstr12");
	}

	/**
	 * Get eoraSubstr13
	 */
	@Column(name = "EORA_SUBSTR13")
	public String getEoraSubstr13() {
		return eoraSubstr13;
	}

	/**
	 * Set eoraSubstr13
	 */
	public void setEoraSubstr13(String eoraSubstr13) {
		this.eoraSubstr13 = eoraSubstr13;
		addValidField("eoraSubstr13");
	}

	/**
	 * Get eoraSubstr14
	 */
	@Column(name = "EORA_SUBSTR14")
	public String getEoraSubstr14() {
		return eoraSubstr14;
	}

	/**
	 * Set eoraSubstr14
	 */
	public void setEoraSubstr14(String eoraSubstr14) {
		this.eoraSubstr14 = eoraSubstr14;
		addValidField("eoraSubstr14");
	}

	/**
	 * Get eoraSubstr15
	 */
	@Column(name = "EORA_SUBSTR15")
	public String getEoraSubstr15() {
		return eoraSubstr15;
	}

	/**
	 * Set eoraSubstr15
	 */
	public void setEoraSubstr15(String eoraSubstr15) {
		this.eoraSubstr15 = eoraSubstr15;
		addValidField("eoraSubstr15");
	}

	/**
	 * Get eoraSubstr16
	 */
	@Column(name = "EORA_SUBSTR16")
	public String getEoraSubstr16() {
		return eoraSubstr16;
	}

	/**
	 * Set eoraSubstr16
	 */
	public void setEoraSubstr16(String eoraSubstr16) {
		this.eoraSubstr16 = eoraSubstr16;
		addValidField("eoraSubstr16");
	}

	/**
	 * Get eoraSubstr17
	 */
	@Column(name = "EORA_SUBSTR17")
	public String getEoraSubstr17() {
		return eoraSubstr17;
	}

	/**
	 * Set eoraSubstr17
	 */
	public void setEoraSubstr17(String eoraSubstr17) {
		this.eoraSubstr17 = eoraSubstr17;
		addValidField("eoraSubstr17");
	}

	/**
	 * Get eoraSubstr18
	 */
	@Column(name = "EORA_SUBSTR18")
	public String getEoraSubstr18() {
		return eoraSubstr18;
	}

	/**
	 * Set eoraSubstr18
	 */
	public void setEoraSubstr18(String eoraSubstr18) {
		this.eoraSubstr18 = eoraSubstr18;
		addValidField("eoraSubstr18");
	}

	/**
	 * Get eoraSubstr19
	 */
	@Column(name = "EORA_SUBSTR19")
	public String getEoraSubstr19() {
		return eoraSubstr19;
	}

	/**
	 * Set eoraSubstr19
	 */
	public void setEoraSubstr19(String eoraSubstr19) {
		this.eoraSubstr19 = eoraSubstr19;
		addValidField("eoraSubstr19");
	}

	/**
	 * Get eoraSubstr20
	 */
	@Column(name = "EORA_SUBSTR20")
	public String getEoraSubstr20() {
		return eoraSubstr20;
	}

	/**
	 * Set eoraSubstr20
	 */
	public void setEoraSubstr20(String eoraSubstr20) {
		this.eoraSubstr20 = eoraSubstr20;
		addValidField("eoraSubstr20");
	}

	/**
	 * Get eoraSubstr21
	 */
	@Column(name = "EORA_SUBSTR21")
	public String getEoraSubstr21() {
		return eoraSubstr21;
	}

	/**
	 * Set eoraSubstr21
	 */
	public void setEoraSubstr21(String eoraSubstr21) {
		this.eoraSubstr21 = eoraSubstr21;
		addValidField("eoraSubstr21");
	}

	/**
	 * Get eoraSubstr22
	 */
	@Column(name = "EORA_SUBSTR22")
	public String getEoraSubstr22() {
		return eoraSubstr22;
	}

	/**
	 * Set eoraSubstr22
	 */
	public void setEoraSubstr22(String eoraSubstr22) {
		this.eoraSubstr22 = eoraSubstr22;
		addValidField("eoraSubstr22");
	}

	/**
	 * Get eoraSubstr23
	 */
	@Column(name = "EORA_SUBSTR23")
	public String getEoraSubstr23() {
		return eoraSubstr23;
	}

	/**
	 * Set eoraSubstr23
	 */
	public void setEoraSubstr23(String eoraSubstr23) {
		this.eoraSubstr23 = eoraSubstr23;
		addValidField("eoraSubstr23");
	}

	/**
	 * Get eoraSubstr24
	 */
	@Column(name = "EORA_SUBSTR24")
	public String getEoraSubstr24() {
		return eoraSubstr24;
	}

	/**
	 * Set eoraSubstr24
	 */
	public void setEoraSubstr24(String eoraSubstr24) {
		this.eoraSubstr24 = eoraSubstr24;
		addValidField("eoraSubstr24");
	}

	/**
	 * Get eoraSubstr25
	 */
	@Column(name = "EORA_SUBSTR25")
	public String getEoraSubstr25() {
		return eoraSubstr25;
	}

	/**
	 * Set eoraSubstr25
	 */
	public void setEoraSubstr25(String eoraSubstr25) {
		this.eoraSubstr25 = eoraSubstr25;
		addValidField("eoraSubstr25");
	}

	/**
	 * Get eoraSubdate1
	 */
	@Column(name = "EORA_SUBDATE1")
	public Date getEoraSubdate1() {
		return eoraSubdate1;
	}

	/**
	 * Set eoraSubdate1
	 */
	public void setEoraSubdate1(Date eoraSubdate1) {
		this.eoraSubdate1 = eoraSubdate1;
		addValidField("eoraSubdate1");
	}

	/**
	 * Get eoraSubdate2
	 */
	@Column(name = "EORA_SUBDATE2")
	public Date getEoraSubdate2() {
		return eoraSubdate2;
	}

	/**
	 * Set eoraSubdate2
	 */
	public void setEoraSubdate2(Date eoraSubdate2) {
		this.eoraSubdate2 = eoraSubdate2;
		addValidField("eoraSubdate2");
	}

	/**
	 * Get eoraSubdate3
	 */
	@Column(name = "EORA_SUBDATE3")
	public Date getEoraSubdate3() {
		return eoraSubdate3;
	}

	/**
	 * Set eoraSubdate3
	 */
	public void setEoraSubdate3(Date eoraSubdate3) {
		this.eoraSubdate3 = eoraSubdate3;
		addValidField("eoraSubdate3");
	}

	/**
	 * Get eoraSubdate4
	 */
	@Column(name = "EORA_SUBDATE4")
	public Date getEoraSubdate4() {
		return eoraSubdate4;
	}

	/**
	 * Set eoraSubdate4
	 */
	public void setEoraSubdate4(Date eoraSubdate4) {
		this.eoraSubdate4 = eoraSubdate4;
		addValidField("eoraSubdate4");
	}

	/**
	 * Get eoraSubdate5
	 */
	@Column(name = "EORA_SUBDATE5")
	public Date getEoraSubdate5() {
		return eoraSubdate5;
	}

	/**
	 * Set eoraSubdate5
	 */
	public void setEoraSubdate5(Date eoraSubdate5) {
		this.eoraSubdate5 = eoraSubdate5;
		addValidField("eoraSubdate5");
	}

	/**
	 * Get eoraSubdate6
	 */
	@Column(name = "EORA_SUBDATE6")
	public Date getEoraSubdate6() {
		return eoraSubdate6;
	}

	/**
	 * Set eoraSubdate6
	 */
	public void setEoraSubdate6(Date eoraSubdate6) {
		this.eoraSubdate6 = eoraSubdate6;
		addValidField("eoraSubdate6");
	}

	/**
	 * Get eoraSubnum1
	 */
	@Column(name = "EORA_SUBNUM1")
	public Long getEoraSubnum1() {
		return eoraSubnum1;
	}

	/**
	 * Set eoraSubnum1
	 */
	public void setEoraSubnum1(Long eoraSubnum1) {
		this.eoraSubnum1 = eoraSubnum1;
		addValidField("eoraSubnum1");
	}

	/**
	 * Get eoraSubnum2
	 */
	@Column(name = "EORA_SUBNUM2")
	public Long getEoraSubnum2() {
		return eoraSubnum2;
	}

	/**
	 * Set eoraSubnum2
	 */
	public void setEoraSubnum2(Long eoraSubnum2) {
		this.eoraSubnum2 = eoraSubnum2;
		addValidField("eoraSubnum2");
	}

	/**
	 * Get eoraSubnum3
	 */
	@Column(name = "EORA_SUBNUM3")
	public Long getEoraSubnum3() {
		return eoraSubnum3;
	}

	/**
	 * Set eoraSubnum3
	 */
	public void setEoraSubnum3(Long eoraSubnum3) {
		this.eoraSubnum3 = eoraSubnum3;
		addValidField("eoraSubnum3");
	}

	/**
	 * Get eoraSubnum4
	 */
	@Column(name = "EORA_SUBNUM4")
	public Long getEoraSubnum4() {
		return eoraSubnum4;
	}

	/**
	 * Set eoraSubnum4
	 */
	public void setEoraSubnum4(Long eoraSubnum4) {
		this.eoraSubnum4 = eoraSubnum4;
		addValidField("eoraSubnum4");
	}

	/**
	 * Get eoraSubnum5
	 */
	@Column(name = "EORA_SUBNUM5")
	public Long getEoraSubnum5() {
		return eoraSubnum5;
	}

	/**
	 * Set eoraSubnum5
	 */
	public void setEoraSubnum5(Long eoraSubnum5) {
		this.eoraSubnum5 = eoraSubnum5;
		addValidField("eoraSubnum5");
	}

	/**
	 * Get eoraSubnum6
	 */
	@Column(name = "EORA_SUBNUM6")
	public Long getEoraSubnum6() {
		return eoraSubnum6;
	}

	/**
	 * Set eoraSubnum6
	 */
	public void setEoraSubnum6(Long eoraSubnum6) {
		this.eoraSubnum6 = eoraSubnum6;
		addValidField("eoraSubnum6");
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
	 * Get eoraHeavyBoxesDate
	 */
	@Column(name = "EORA_HEAVY_BOXES_DATE")
	public Date getEoraHeavyBoxesDate() {
		return eoraHeavyBoxesDate;
	}

	/**
	 * Set eoraHeavyBoxesDate
	 */
	public void setEoraHeavyBoxesDate(Date eoraHeavyBoxesDate) {
		this.eoraHeavyBoxesDate = eoraHeavyBoxesDate;
		addValidField("eoraHeavyBoxesDate");
	}

	/**
	 * Get eoraEmptyContainersDate
	 */
	@Column(name = "EORA_EMPTY_CONTAINERS_DATE")
	public Date getEoraEmptyContainersDate() {
		return eoraEmptyContainersDate;
	}

	/**
	 * Set eoraEmptyContainersDate
	 */
	public void setEoraEmptyContainersDate(Date eoraEmptyContainersDate) {
		this.eoraEmptyContainersDate = eoraEmptyContainersDate;
		addValidField("eoraEmptyContainersDate");
	}

	/**
	 * Get eoraCargoEbrgId
	 */
	@Column(name = "EORA_CARGO_EBRG_ID")
	public Long getEoraCargoEbrgId() {
		return eoraCargoEbrgId;
	}

	/**
	 * Set eoraCargoEbrgId
	 */
	public void setEoraCargoEbrgId(Long eoraCargoEbrgId) {
		this.eoraCargoEbrgId = eoraCargoEbrgId;
		addValidField("eoraCargoEbrgId");
	}

	/**
	 * Get eoraCargoEbrgNo
	 */
	@Column(name = "EORA_CARGO_EBRG_NO")
	public String getEoraCargoEbrgNo() {
		return eoraCargoEbrgNo;
	}

	/**
	 * Set eoraCargoEbrgNo
	 */
	public void setEoraCargoEbrgNo(String eoraCargoEbrgNo) {
		this.eoraCargoEbrgNo = eoraCargoEbrgNo;
		addValidField("eoraCargoEbrgNo");
	}

	/**
	 * Get eoraCargoEbrgName
	 */
	@Column(name = "EORA_CARGO_EBRG_NAME")
	public String getEoraCargoEbrgName() {
		return eoraCargoEbrgName;
	}

	/**
	 * Set eoraCargoEbrgName
	 */
	public void setEoraCargoEbrgName(String eoraCargoEbrgName) {
		this.eoraCargoEbrgName = eoraCargoEbrgName;
		addValidField("eoraCargoEbrgName");
	}

	/**
	 * Get eoraUnloadingDate
	 */
	@Column(name = "EORA_UNLOADING_DATE")
	public Date getEoraUnloadingDate() {
		return eoraUnloadingDate;
	}

	/**
	 * Set eoraUnloadingDate
	 */
	public void setEoraUnloadingDate(Date eoraUnloadingDate) {
		this.eoraUnloadingDate = eoraUnloadingDate;
		addValidField("eoraUnloadingDate");
	}

}
