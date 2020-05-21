package com.sinotrans.oms.eoor.model;


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
 * <p>Description: 路线model </p>
 * @version 1.00
 * </pre>
 */
@Entity
@Table(name = "ET_LINE_NODE")
public class EtLineNodeModel extends BaseModel implements OperationLog {

	//订单异常表主键
	private Integer etlnId;
	//调度计划主键
	private Integer etlnEtspId;
	//区域表主键
	private Integer etlnEbrgId;
	//预计到达时间
	private Date etlnPlanArrivalTime;
	//预计离开时间
	private Date etlnPlanLeaveTime;
	//空重
	private Integer etlnEmptyWeight;
	//里程数
	private Integer etlnMileage;
	//GPS经度
	private Integer etlnGpsLongitude;
	//GPS纬度
	private Integer etlnGpsLatitude;
	//实际到达时间
	private Date etlnArrivalTime;
	//实际离开时间
	private Date etlnLeaveTime;
	//事件
	private String etlnEvent;
	//预留字段
	private String etlnSubstr1;
	//预留字段
	private String etlnSubstr2;
	//预留字段
	private String etlnSubstr3;
	//预留字段
	private String etlnSubstr4;
	//预留字段
	private String etlnSubstr5;
	//预留字段
	private String etlnSubstr6;
	//预留字段
	private String etlnSubstr8;
	//预留字段
	private String etlnSubstr7;
	//预留字段
	private Date etlnSubdate1;
	//预留字段
	private Date etlnSubdate2;
	//预留字段
	private Date etlnSubdate5;
	//预留字段
	private Date etlnSubdate4;
	//预留字段
	private Date etlnSubdate3;
	//预留字段
	private Integer etlnSubnum3;
	//预留字段
	private Integer etlnSubnum2;
	//预留字段
	private Integer etlnSubnum1;
	//recVer
	private Integer recVer;
	//modifyTime
	private Date modifyTime;
	//modifier
	private String modifier;
	//createTime
	private Date createTime;
	//creator
	private String creator;

	/**
	 * Get 订单异常表主键
	 */
	@Column(name = "ETLN_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Integer getEtlnId() {
		return etlnId;
	}

	/**
	 * Set 订单异常表主键
	 */
	public void setEtlnId(Integer etlnId) {
		this.etlnId = etlnId;
		addValidField("etlnId");
	}

	/**
	 * Get 调度计划主键
	 */
	@Column(name = "ETLN_ETSP_ID")
	public Integer getEtlnEtspId() {
		return etlnEtspId;
	}

	/**
	 * Set 调度计划主键
	 */
	public void setEtlnEtspId(Integer etlnEtspId) {
		this.etlnEtspId = etlnEtspId;
		addValidField("etlnEtspId");
	}

	/**
	 * Get 区域表主键
	 */
	@Column(name = "ETLN_EBRG_ID")
	public Integer getEtlnEbrgId() {
		return etlnEbrgId;
	}

	/**
	 * Set 区域表主键
	 */
	public void setEtlnEbrgId(Integer etlnEbrgId) {
		this.etlnEbrgId = etlnEbrgId;
		addValidField("etlnEbrgId");
	}

	/**
	 * Get 预计到达时间
	 */
	@Column(name = "ETLN_PLAN_ARRIVAL_TIME")
	public Date getEtlnPlanArrivalTime() {
		return etlnPlanArrivalTime;
	}

	/**
	 * Set 预计到达时间
	 */
	public void setEtlnPlanArrivalTime(Date etlnPlanArrivalTime) {
		this.etlnPlanArrivalTime = etlnPlanArrivalTime;
		addValidField("etlnPlanArrivalTime");
	}

	/**
	 * Get 预计离开时间
	 */
	@Column(name = "ETLN_PLAN_LEAVE_TIME")
	public Date getEtlnPlanLeaveTime() {
		return etlnPlanLeaveTime;
	}

	/**
	 * Set 预计离开时间
	 */
	public void setEtlnPlanLeaveTime(Date etlnPlanLeaveTime) {
		this.etlnPlanLeaveTime = etlnPlanLeaveTime;
		addValidField("etlnPlanLeaveTime");
	}

	/**
	 * Get 空重
	 */
	@Column(name = "ETLN_EMPTY_WEIGHT")
	public Integer getEtlnEmptyWeight() {
		return etlnEmptyWeight;
	}

	/**
	 * Set 空重
	 */
	public void setEtlnEmptyWeight(Integer etlnEmptyWeight) {
		this.etlnEmptyWeight = etlnEmptyWeight;
		addValidField("etlnEmptyWeight");
	}

	/**
	 * Get 里程数
	 */
	@Column(name = "ETLN_MILEAGE")
	public Integer getEtlnMileage() {
		return etlnMileage;
	}

	/**
	 * Set 里程数
	 */
	public void setEtlnMileage(Integer etlnMileage) {
		this.etlnMileage = etlnMileage;
		addValidField("etlnMileage");
	}

	/**
	 * Get GPS经度
	 */
	@Column(name = "ETLN_GPS_LONGITUDE")
	public Integer getEtlnGpsLongitude() {
		return etlnGpsLongitude;
	}

	/**
	 * Set GPS经度
	 */
	public void setEtlnGpsLongitude(Integer etlnGpsLongitude) {
		this.etlnGpsLongitude = etlnGpsLongitude;
		addValidField("etlnGpsLongitude");
	}

	/**
	 * Get GPS纬度
	 */
	@Column(name = "ETLN_GPS_LATITUDE")
	public Integer getEtlnGpsLatitude() {
		return etlnGpsLatitude;
	}

	/**
	 * Set GPS纬度
	 */
	public void setEtlnGpsLatitude(Integer etlnGpsLatitude) {
		this.etlnGpsLatitude = etlnGpsLatitude;
		addValidField("etlnGpsLatitude");
	}

	/**
	 * Get 实际到达时间
	 */
	@Column(name = "ETLN_ARRIVAL_TIME")
	public Date getEtlnArrivalTime() {
		return etlnArrivalTime;
	}

	/**
	 * Set 实际到达时间
	 */
	public void setEtlnArrivalTime(Date etlnArrivalTime) {
		this.etlnArrivalTime = etlnArrivalTime;
		addValidField("etlnArrivalTime");
	}

	/**
	 * Get 实际离开时间
	 */
	@Column(name = "ETLN_LEAVE_TIME")
	public Date getEtlnLeaveTime() {
		return etlnLeaveTime;
	}

	/**
	 * Set 实际离开时间
	 */
	public void setEtlnLeaveTime(Date etlnLeaveTime) {
		this.etlnLeaveTime = etlnLeaveTime;
		addValidField("etlnLeaveTime");
	}

	/**
	 * Get 事件
	 */
	@Column(name = "ETLN_EVENT")
	public String getEtlnEvent() {
		return etlnEvent;
	}

	/**
	 * Set 事件
	 */
	public void setEtlnEvent(String etlnEvent) {
		this.etlnEvent = etlnEvent;
		addValidField("etlnEvent");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETLN_SUBSTR1")
	public String getEtlnSubstr1() {
		return etlnSubstr1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtlnSubstr1(String etlnSubstr1) {
		this.etlnSubstr1 = etlnSubstr1;
		addValidField("etlnSubstr1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETLN_SUBSTR2")
	public String getEtlnSubstr2() {
		return etlnSubstr2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtlnSubstr2(String etlnSubstr2) {
		this.etlnSubstr2 = etlnSubstr2;
		addValidField("etlnSubstr2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETLN_SUBSTR3")
	public String getEtlnSubstr3() {
		return etlnSubstr3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtlnSubstr3(String etlnSubstr3) {
		this.etlnSubstr3 = etlnSubstr3;
		addValidField("etlnSubstr3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETLN_SUBSTR4")
	public String getEtlnSubstr4() {
		return etlnSubstr4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtlnSubstr4(String etlnSubstr4) {
		this.etlnSubstr4 = etlnSubstr4;
		addValidField("etlnSubstr4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETLN_SUBSTR5")
	public String getEtlnSubstr5() {
		return etlnSubstr5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtlnSubstr5(String etlnSubstr5) {
		this.etlnSubstr5 = etlnSubstr5;
		addValidField("etlnSubstr5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETLN_SUBSTR6")
	public String getEtlnSubstr6() {
		return etlnSubstr6;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtlnSubstr6(String etlnSubstr6) {
		this.etlnSubstr6 = etlnSubstr6;
		addValidField("etlnSubstr6");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETLN_SUBSTR8")
	public String getEtlnSubstr8() {
		return etlnSubstr8;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtlnSubstr8(String etlnSubstr8) {
		this.etlnSubstr8 = etlnSubstr8;
		addValidField("etlnSubstr8");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETLN_SUBSTR7")
	public String getEtlnSubstr7() {
		return etlnSubstr7;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtlnSubstr7(String etlnSubstr7) {
		this.etlnSubstr7 = etlnSubstr7;
		addValidField("etlnSubstr7");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETLN_SUBDATE1")
	public Date getEtlnSubdate1() {
		return etlnSubdate1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtlnSubdate1(Date etlnSubdate1) {
		this.etlnSubdate1 = etlnSubdate1;
		addValidField("etlnSubdate1");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETLN_SUBDATE2")
	public Date getEtlnSubdate2() {
		return etlnSubdate2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtlnSubdate2(Date etlnSubdate2) {
		this.etlnSubdate2 = etlnSubdate2;
		addValidField("etlnSubdate2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETLN_SUBDATE5")
	public Date getEtlnSubdate5() {
		return etlnSubdate5;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtlnSubdate5(Date etlnSubdate5) {
		this.etlnSubdate5 = etlnSubdate5;
		addValidField("etlnSubdate5");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETLN_SUBDATE4")
	public Date getEtlnSubdate4() {
		return etlnSubdate4;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtlnSubdate4(Date etlnSubdate4) {
		this.etlnSubdate4 = etlnSubdate4;
		addValidField("etlnSubdate4");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETLN_SUBDATE3")
	public Date getEtlnSubdate3() {
		return etlnSubdate3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtlnSubdate3(Date etlnSubdate3) {
		this.etlnSubdate3 = etlnSubdate3;
		addValidField("etlnSubdate3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETLN_SUBNUM3")
	public Integer getEtlnSubnum3() {
		return etlnSubnum3;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtlnSubnum3(Integer etlnSubnum3) {
		this.etlnSubnum3 = etlnSubnum3;
		addValidField("etlnSubnum3");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETLN_SUBNUM2")
	public Integer getEtlnSubnum2() {
		return etlnSubnum2;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtlnSubnum2(Integer etlnSubnum2) {
		this.etlnSubnum2 = etlnSubnum2;
		addValidField("etlnSubnum2");
	}

	/**
	 * Get 预留字段
	 */
	@Column(name = "ETLN_SUBNUM1")
	public Integer getEtlnSubnum1() {
		return etlnSubnum1;
	}

	/**
	 * Set 预留字段
	 */
	public void setEtlnSubnum1(Integer etlnSubnum1) {
		this.etlnSubnum1 = etlnSubnum1;
		addValidField("etlnSubnum1");
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
	public void setRecVer(Integer recVer) {
		this.recVer = recVer;
		addValidField("recVer");
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

}
