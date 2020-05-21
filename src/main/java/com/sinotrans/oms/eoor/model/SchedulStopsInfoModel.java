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
 * Model class for SchedulStopsInfo
 */
@Entity
@Table(name = "SCHEDUL_STOPS_INFO")
public class SchedulStopsInfoModel extends BaseModel implements OperationLog {

	//主键
	private Long scslId;
	//调度ID
	private Long scslEtspId;
	//站点在车次中的次序
	private Long scslSequenceNumber;
	//站点的地址明文
	private String scslLocationAddress;
	//站点的地址明文
	private String scslLongitude;
	//站点的地址明文
	private String scslLatitude;
	//该站点距离前一个停靠点的行驶时间
	private String scslDrivingdurationstop;
	//该站点距离前一个停靠点的行驶距离
	private String scslDistancestop;
	//该站点的计划到达时间
	private Date scslPlannedtimeofarrival;
	//该站点的计划离开时间
	private Date scslPlannedtimeofdeparture;
	//车次在该站点的等待时间
	private String scslWaitingduration;
	//车次在该站点的处理时间
	private String scslHandlingduration;
	//站点Id(杉数)
	private String scslLocationId;
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
	 * Get 主键
	 */
	@Column(name = "SCSL_ID")
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	public Long getScslId() {
		return scslId;
	}

	/**
	 * Set 主键
	 */
	public void setScslId(Long scslId) {
		this.scslId = scslId;
		addValidField("scslId");
	}

	/**
	 * Get 调度ID
	 */
	@Column(name = "SCSL_ETSP_ID")
	public Long getScslEtspId() {
		return scslEtspId;
	}

	/**
	 * Set 调度ID
	 */
	public void setScslEtspId(Long scslEtspId) {
		this.scslEtspId = scslEtspId;
		addValidField("scslEtspId");
	}

	/**
	 * Get 站点在车次中的次序
	 */
	@Column(name = "SCSL_SEQUENCE_NUMBER")
	public Long getScslSequenceNumber() {
		return scslSequenceNumber;
	}

	/**
	 * Set 站点在车次中的次序
	 */
	public void setScslSequenceNumber(Long scslSequenceNumber) {
		this.scslSequenceNumber = scslSequenceNumber;
		addValidField("scslSequenceNumber");
	}

	/**
	 * Get 站点的地址明文
	 */
	@Column(name = "SCSL_LOCATION_ADDRESS")
	public String getScslLocationAddress() {
		return scslLocationAddress;
	}

	/**
	 * Set 站点的地址明文
	 */
	public void setScslLocationAddress(String scslLocationAddress) {
		this.scslLocationAddress = scslLocationAddress;
		addValidField("scslLocationAddress");
	}
	
	/**
	 * Get 站点经度
	 */
	@Column(name = "SCSL_LONGITUDE")
	public String getScslLongitude() {
		return scslLongitude;
	}
	
	public void setScslLongitude(String scslLongitude) {
		this.scslLongitude = scslLongitude;
		addValidField("scslLongitude");
	}
	/**
	 * Get 站点纬度
	 */
	@Column(name = "SCSL_LATITUDE")
	public String getScslLatitude() {
		return scslLatitude;
	}
	
	public void setScslLatitude(String scslLatitude) {
		this.scslLatitude = scslLatitude;
		addValidField("scslLatitude");
	}

	/**
	 * Get 该站点距离前一个停靠点的行驶时间
	 */
	@Column(name = "SCSL_DRIVINGDURATIONSTOP")
	public String getScslDrivingdurationstop() {
		return scslDrivingdurationstop;
	}

	/**
	 * Set 该站点距离前一个停靠点的行驶时间
	 */
	public void setScslDrivingdurationstop(String scslDrivingdurationstop) {
		this.scslDrivingdurationstop = scslDrivingdurationstop;
		addValidField("scslDrivingdurationstop");
	}

	/**
	 * Get 该站点距离前一个停靠点的行驶距离
	 */
	@Column(name = "SCSL_DISTANCESTOP")
	public String getScslDistancestop() {
		return scslDistancestop;
	}

	/**
	 * Set 该站点距离前一个停靠点的行驶距离
	 */
	public void setScslDistancestop(String scslDistancestop) {
		this.scslDistancestop = scslDistancestop;
		addValidField("scslDistancestop");
	}

	/**
	 * Get 该站点的计划到达时间
	 */
	@Column(name = "SCSL_PLANNEDTIMEOFARRIVAL")
	public Date getScslPlannedtimeofarrival() {
		return scslPlannedtimeofarrival;
	}

	/**
	 * Set 该站点的计划到达时间
	 */
	public void setScslPlannedtimeofarrival(Date scslPlannedtimeofarrival) {
		this.scslPlannedtimeofarrival = scslPlannedtimeofarrival;
		addValidField("scslPlannedtimeofarrival");
	}

	/**
	 * Get 该站点的计划离开时间
	 */
	@Column(name = "SCSL_PLANNEDTIMEOFDEPARTURE")
	public Date getScslPlannedtimeofdeparture() {
		return scslPlannedtimeofdeparture;
	}

	/**
	 * Set 该站点的计划离开时间
	 */
	public void setScslPlannedtimeofdeparture(Date scslPlannedtimeofdeparture) {
		this.scslPlannedtimeofdeparture = scslPlannedtimeofdeparture;
		addValidField("scslPlannedtimeofdeparture");
	}

	/**
	 * Get 车次在该站点的等待时间
	 */
	@Column(name = "SCSL_WAITINGDURATION")
	public String getScslWaitingduration() {
		return scslWaitingduration;
	}

	/**
	 * Set 车次在该站点的等待时间
	 */
	public void setScslWaitingduration(String scslWaitingduration) {
		this.scslWaitingduration = scslWaitingduration;
		addValidField("scslWaitingduration");
	}

	/**
	 * Get 车次在该站点的处理时间
	 */
	@Column(name = "SCSL_HANDLINGDURATION")
	public String getScslHandlingduration() {
		return scslHandlingduration;
	}

	/**
	 * Set 车次在该站点的处理时间
	 */
	public void setScslHandlingduration(String scslHandlingduration) {
		this.scslHandlingduration = scslHandlingduration;
		addValidField("scslHandlingduration");
	}

	/**
	 * Get 站点Id(杉数)
	 */
	@Column(name = "SCSL_LOCATION_ID")
	public String getScslLocationId() {
		return scslLocationId;
	}

	/**
	 * Set 站点Id(杉数)
	 */
	public void setScslLocationId(String scslLocationId) {
		this.scslLocationId = scslLocationId;
		addValidField("scslLocationId");
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
