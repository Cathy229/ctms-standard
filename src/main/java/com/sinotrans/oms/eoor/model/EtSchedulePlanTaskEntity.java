package com.sinotrans.oms.eoor.model;

import java.util.Date;

import javax.persistence.Transient;


/**
 * <p>Description: 未调度Entity </p>
 * @author <a href="lizheng@sinotrans.com">LiZheng</a>
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本     修改人   		修改日期   	修改内容
 * 20091224.1	 李政   		 	20091202	创建
 * 20100727.1    黄军明			chem-894 调度管理模块-调度管理界面，未调度界面的grid中增加提货公司字段
 * 20111118   	CHEM-1135 调度管理中增加物料装货时间显示
 * 20111123   	CHEM-1108 调度管理中增加主驾卡号的字段，取已配主驾对应的工作卡号字段
 * 20111124   	CHEM-1137 调度管理未调度、调度中、已调度列表增加订单的委托方显示
 *CHEM-1144    20111129 调度管理-调度中增加ebspShortName收货人简称字段
 * </pre>
 */
public class EtSchedulePlanTaskEntity extends EtTaskModel {

	//任务所属项目ID
	@Transient
	private Integer etorEbpjId;
	
	//任务所属项目名称
	@Transient
	private String etorEbpjName;
	
	//任务收货公司ID
	@Transient
	private Integer etorConsigneeEbspId;
	
	//收货公司名称
	@Transient
	private String etorConsigneeEbspNameCn;
	
	//起运地邮编
	@Transient
	private String startZip;
	
	//目的地邮编
	@Transient
	private String endZip;
	
	//目的地流向
	@Transient
	private String ebrgFlow;
	
	//是否温控
	@Transient
	private String etomEbmaIsTemperature;
	
	//操作基地
	@Transient
	private Integer etorOperateEsstId;
	
	//订单笔次
	@Transient
	private String etorOrderFudeji;
	
	//分组字段
	@Transient
	private String groupField;
	//物料特性
	@Transient
	private String etomType;
	
	//牵引车车牌号
	@Transient
	private String etspTractorEtveCard;
	//挂车车牌号
	@Transient
	private String etspTrailerEtveCard;
	//主驾
	@Transient
	private String etspMainEttpName;
	//副驾
	@Transient
	private String etspCopilorEttpName;
	//集装箱号
	@Transient
	private String etspEtcaNo;
	
	//单车调度类型
	@Transient
	private String etspType;
	
	//订单提货地址ID  提货公司
	@Transient
	private Integer etorShipperEbsaId;
	
	//订单提货地址名称  提货公司地址
	@Transient
	private String etorShipperEbsaAddress;
	
	//物料名称
	@Transient
	private String etomEbmaNameCn;
	//装货时间
	@Transient
	private Integer ebmaLoadingTime;
	
	//工作卡号
	@Transient
	private String ettpWorkingNo;

	//委托方名称
	@Transient
	private String etorConsignorEbcuNameCn;
	//收货人简称
	@Transient
	private String ebspShortName;
	
	private String ettaInnerId;
	
	//路线名称
	@Transient
	private String eblnLineName;
	//额定里程
	@Transient
	private Double eblnRatedMileage;
	
	//"客户支付状态
	private String etorChargeoff; 
	
	//跟踪表的实际提货时间
	private Date eottDeliveryTime;
	
	private Integer eottId;

	

	public Date getEottDeliveryTime() {
		return eottDeliveryTime;
	}

	public void setEottDeliveryTime(Date eottDeliveryTime) {
		this.eottDeliveryTime = eottDeliveryTime;
	}

	public String getEtorChargeoff() {
		return etorChargeoff;
	}

	public void setEtorChargeoff(String etorChargeoff) {
		this.etorChargeoff = etorChargeoff;
	}

	public String getEttpWorkingNo() {
		return ettpWorkingNo;
	}

	public void setEttpWorkingNo(String ettpWorkingNo) {
		this.ettpWorkingNo = ettpWorkingNo;
	}

	public Integer getEtorShipperEbsaId() {
		return etorShipperEbsaId;
	}

	public void setEtorShipperEbsaId(Integer etorShipperEbsaId) {
		this.etorShipperEbsaId = etorShipperEbsaId;
	}

	public String getEtorShipperEbsaAddress() {
		return etorShipperEbsaAddress;
	}

	public void setEtorShipperEbsaAddress(String etorShipperEbsaAddress) {
		this.etorShipperEbsaAddress = etorShipperEbsaAddress;
	}

	/**
	 * @return the etomType
	 */
	public String getEtomType() {
		return etomType;
	}

	/**
	 * @param etomType the etomType to set
	 */
	public void setEtomType(String etomType) {
		this.etomType = etomType;
	}

	public Integer getEtorEbpjId() {
		return etorEbpjId;
	}

	public void setEtorEbpjId(Integer etorEbpjId) {
		this.etorEbpjId = etorEbpjId;
	}

	public String getEtorEbpjName() {
		return etorEbpjName;
	}

	public void setEtorEbpjName(String etorEbpjName) {
		this.etorEbpjName = etorEbpjName;
	}

	public Integer getEtorConsigneeEbspId() {
		return etorConsigneeEbspId;
	}

	public void setEtorConsigneeEbspId(Integer etorConsigneeEbspId) {
		this.etorConsigneeEbspId = etorConsigneeEbspId;
	}

	public String getEtorConsigneeEbspNameCn() {
		return etorConsigneeEbspNameCn;
	}

	public void setEtorConsigneeEbspNameCn(String etorConsigneeEbspNameCn) {
		this.etorConsigneeEbspNameCn = etorConsigneeEbspNameCn;
	}

	public String getStartZip() {
		return startZip;
	}

	public void setStartZip(String startZip) {
		this.startZip = startZip;
	}

	public String getEndZip() {
		return endZip;
	}

	public void setEndZip(String endZip) {
		this.endZip = endZip;
	}

	public String getEbrgFlow() {
		return ebrgFlow;
	}

	public void setEbrgFlow(String ebrgFlow) {
		this.ebrgFlow = ebrgFlow;
	}

	public String getEtomEbmaIsTemperature() {
		return etomEbmaIsTemperature;
	}

	public void setEtomEbmaIsTemperature(String etomEbmaIsTemperature) {
		this.etomEbmaIsTemperature = etomEbmaIsTemperature;
	}

	public Integer getEtorOperateEsstId() {
		return etorOperateEsstId;
	}

	public void setEtorOperateEsstId(Integer etorOperateEsstId) {
		this.etorOperateEsstId = etorOperateEsstId;
	}

	public String getEtorOrderFudeji() {
		return etorOrderFudeji;
	}

	public void setEtorOrderFudeji(String etorOrderFudeji) {
		this.etorOrderFudeji = etorOrderFudeji;
	}

	public String getGroupField() {
		return groupField;
	}

	public void setGroupField(String groupField) {
		this.groupField = groupField;
	}

	public String getEtspTractorEtveCard() {
		return etspTractorEtveCard;
	}

	public void setEtspTractorEtveCard(String etspTractorEtveCard) {
		this.etspTractorEtveCard = etspTractorEtveCard;
	}

	public String getEtspTrailerEtveCard() {
		return etspTrailerEtveCard;
	}

	public void setEtspTrailerEtveCard(String etspTrailerEtveCard) {
		this.etspTrailerEtveCard = etspTrailerEtveCard;
	}

	public String getEtspMainEttpName() {
		return etspMainEttpName;
	}

	public void setEtspMainEttpName(String etspMainEttpName) {
		this.etspMainEttpName = etspMainEttpName;
	}

	public String getEtspCopilorEttpName() {
		return etspCopilorEttpName;
	}

	public void setEtspCopilorEttpName(String etspCopilorEttpName) {
		this.etspCopilorEttpName = etspCopilorEttpName;
	}

	public String getEtspEtcaNo() {
		return etspEtcaNo;
	}

	public void setEtspEtcaNo(String etspEtcaNo) {
		this.etspEtcaNo = etspEtcaNo;
	}

	public String getEtspType() {
		return etspType;
	}

	public void setEtspType(String etspType) {
		this.etspType = etspType;
	}

	public String getEtomEbmaNameCn() {
		return etomEbmaNameCn;
	}

	public void setEtomEbmaNameCn(String etomEbmaNameCn) {
		this.etomEbmaNameCn = etomEbmaNameCn;
	}

	public Integer getEbmaLoadingTime() {
		return ebmaLoadingTime;
	}

	public void setEbmaLoadingTime(Integer ebmaLoadingTime) {
		this.ebmaLoadingTime = ebmaLoadingTime;
	}

	public String getEtorConsignorEbcuNameCn() { 
		return etorConsignorEbcuNameCn;
	}

	public void setEtorConsignorEbcuNameCn(String etorConsignorEbcuNameCn) {
		this.etorConsignorEbcuNameCn = etorConsignorEbcuNameCn;
	}

	public String getEbspShortName() {
		return ebspShortName;
	}

	public void setEbspShortName(String ebspShortName) {
		this.ebspShortName = ebspShortName;
	}

	public String getEttaInnerId() {
		return ettaInnerId;
	}

	public void setEttaInnerId(String ettaInnerId) {
		this.ettaInnerId = ettaInnerId;
	}

	public String getEblnLineName() {
		return eblnLineName;
	}

	public void setEblnLineName(String eblnLineName) {
		this.eblnLineName = eblnLineName;
	}

	public Double getEblnRatedMileage() {
		return eblnRatedMileage;
	}

	public void setEblnRatedMileage(Double eblnRatedMileage) {
		this.eblnRatedMileage = eblnRatedMileage;
	}

	public Integer getEottId() {
		return eottId;
	}

	public void setEottId(Integer eottId) {
		this.eottId = eottId;
	}
}
