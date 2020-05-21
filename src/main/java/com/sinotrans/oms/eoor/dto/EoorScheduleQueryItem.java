package com.sinotrans.oms.eoor.dto;

import java.io.Serializable;
import java.util.Date;

public class EoorScheduleQueryItem implements Serializable {
	/**
	 * 
	 */
	private Integer etspId;
	private Integer ettaId;
	private String etspStatus;
	private String ettaIsWithin;
	private String ettaCarrierEbcuNameCn;
	private String ettaStatus;
	private String etspNo;
	private String etspName;
	private String etspSubstr2;
	private String etspEbcuNameCn;
    private Integer EtspTractorEtveId;
    private String etspTractorEtveCard;
    private Integer etspTrailerEtveId;
    private String etspTrailerEtveCard;
    private Integer etspMainEttpId;
    private String etspMainEttpName;
    private Integer etspCopilorEttpId;
    private String etspCopilorEttpName;
    private Integer etspGuardsEttpId;
    private String etspGuardsEttpName;
    private String etspDesc;
	private Integer etorId;
	private String etorEbpjName;
	private String etorSoNo;
	private String etorDoNo;
	private Date createTime;
	private Date etorReqDeliveryDate;
	private Date etorReqArrivalDate;
	private Double etorWeight;
	private String etorStartEbrgNameCn;
	private String etorEndEbrgNameCn;
	private Integer etorCustomEbcuId;
	private String etorCustomEbcuNameCn;
	private String etorLevel;
	private String etorShipperEbsaAddress;
	private String etorConsigneeEbsaAddress;
	private String etorScheduleName;
	private String etorRemark;
	private String ettaIsIntelscheduling;
	private String etomType;
	
	
	public Integer getEtspId() {
		return etspId;
	}
	public void setEtspId(Integer etspId) {
		this.etspId = etspId;
	}
	
	public String getEtspStatus() {
		return etspStatus;
	}
	public void setEtspStatus(String etspStatus) {
		this.etspStatus = etspStatus;
	}
	public String getEttaIsWithin() {
		return ettaIsWithin;
	}
	public void setEttaIsWithin(String ettaIsWithin) {
		this.ettaIsWithin = ettaIsWithin;
	}
	public String getEttaCarrierEbcuNameCn() {
		return ettaCarrierEbcuNameCn;
	}
	public void setEttaCarrierEbcuNameCn(String ettaCarrierEbcuNameCn) {
		this.ettaCarrierEbcuNameCn = ettaCarrierEbcuNameCn;
	}
	public String getEttaStatus() {
		return ettaStatus;
	}
	public void setEttaStatus(String ettaStatus) {
		this.ettaStatus = ettaStatus;
	}
	public Integer getettaId() {
		return ettaId;
	}
	public void setettaId(Integer ettaId) {
		this.ettaId = ettaId;
	}
	public String getEtspNo() {
		return etspNo;
	}
	public void setEtspNo(String etspNo) {
		this.etspNo = etspNo;
	}
	public String getEtspEbcuNameCn() {
		return etspEbcuNameCn;
	}
	public void setEtspEbcuNameCn(String etspEbcuNameCn) {
		this.etspEbcuNameCn = etspEbcuNameCn;
	}
	public Integer getEtspTractorEtveId() {
		return EtspTractorEtveId;
	}
	public void setEtspTractorEtveId(Integer etspTractorEtveId) {
		EtspTractorEtveId = etspTractorEtveId;
	}
	public String getEtspTractorEtveCard() {
		return etspTractorEtveCard;
	}
	public void setEtspTractorEtveCard(String etspTractorEtveCard) {
		this.etspTractorEtveCard = etspTractorEtveCard;
	}
	public Integer getEtspTrailerEtveId() {
		return etspTrailerEtveId;
	}
	public void setEtspTrailerEtveId(Integer etspTrailerEtveId) {
		this.etspTrailerEtveId = etspTrailerEtveId;
	}
	public String getEtspTrailerEtveCard() {
		return etspTrailerEtveCard;
	}
	public void setEtspTrailerEtveCard(String etspTrailerEtveCard) {
		this.etspTrailerEtveCard = etspTrailerEtveCard;
	}
	public Integer getEtspMainEttpId() {
		return etspMainEttpId;
	}
	public void setEtspMainEttpId(Integer etspMainEttpId) {
		this.etspMainEttpId = etspMainEttpId;
	}
	public String getEtspMainEttpName() {
		return etspMainEttpName;
	}
	public void setEtspMainEttpName(String etspMainEttpName) {
		this.etspMainEttpName = etspMainEttpName;
	}
	public Integer getEtspCopilorEttpId() {
		return etspCopilorEttpId;
	}
	public void setEtspCopilorEttpId(Integer etspCopilorEttpId) {
		this.etspCopilorEttpId = etspCopilorEttpId;
	}
	public String getEtspCopilorEttpName() {
		return etspCopilorEttpName;
	}
	public void setEtspCopilorEttpName(String etspCopilorEttpName) {
		this.etspCopilorEttpName = etspCopilorEttpName;
	}
	public Integer getEtspGuardsEttpId() {
		return etspGuardsEttpId;
	}
	public void setEtspGuardsEttpId(Integer etspGuardsEttpId) {
		this.etspGuardsEttpId = etspGuardsEttpId;
	}
	public String getEtspGuardsEttpName() {
		return etspGuardsEttpName;
	}
	public void setEtspGuardsEttpName(String etspGuardsEttpName) {
		this.etspGuardsEttpName = etspGuardsEttpName;
	}
	public String getEtspDesc() {
		return etspDesc;
	}
	public void setEtspDesc(String etspDesc) {
		this.etspDesc = etspDesc;
	}
	public Integer getetorId() {
		return etorId;
	}
	public void setetorId(Integer etorId) {
		this.etorId = etorId;
	}
	public String getetorEbpjName() {
		return etorEbpjName;
	}
	public void setetorEbpjName(String etorEbpjName) {
		this.etorEbpjName = etorEbpjName;
	}
	public String getetorSoNo() {
		return etorSoNo;
	}
	public void setetorSoNo(String etorSoNo) {
		this.etorSoNo = etorSoNo;
	}
	public String getetorDoNo() {
		return etorDoNo;
	}
	public void setetorDoNo(String etorDoNo) {
		this.etorDoNo = etorDoNo;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getetorReqDeliveryDate() {
		return etorReqDeliveryDate;
	}
	public void setetorReqDeliveryDate(Date etorReqDeliveryDate) {
		this.etorReqDeliveryDate = etorReqDeliveryDate;
	}
	public Date getetorReqArrivalDate() {
		return etorReqArrivalDate;
	}
	public void setetorReqArrivalDate(Date etorReqArrivalDate) {
		this.etorReqArrivalDate = etorReqArrivalDate;
	}
	public Double getetorWeight() {
		return etorWeight;
	}
	public void setetorWeight(Double etorWeight) {
		this.etorWeight = etorWeight;
	}
	public String getetorStartEbrgNameCn() {
		return etorStartEbrgNameCn;
	}
	public void setetorStartEbrgNameCn(String etorStartEbrgNameCn) {
		this.etorStartEbrgNameCn = etorStartEbrgNameCn;
	}
	public String getetorEndEbrgNameCn() {
		return etorEndEbrgNameCn;
	}
	public void setetorEndEbrgNameCn(String etorEndEbrgNameCn) {
		this.etorEndEbrgNameCn = etorEndEbrgNameCn;
	}
	public Integer getetorCustomEbcuId() {
		return etorCustomEbcuId;
	}
	public void setetorCustomEbcuId(Integer etorCustomEbcuId) {
		this.etorCustomEbcuId = etorCustomEbcuId;
	}
	public String getetorCustomEbcuNameCn() {
		return etorCustomEbcuNameCn;
	}
	public void setetorCustomEbcuNameCn(String etorCustomEbcuNameCn) {
		this.etorCustomEbcuNameCn = etorCustomEbcuNameCn;
	}
	public String getetorLevel() {
		return etorLevel;
	}
	public void setetorLevel(String etorLevel) {
		this.etorLevel = etorLevel;
	}
	public String getetorShipperEbsaAddress() {
		return etorShipperEbsaAddress;
	}
	public void setetorShipperEbsaAddress(String etorShipperEbsaAddress) {
		this.etorShipperEbsaAddress = etorShipperEbsaAddress;
	}
	public String getetorConsigneeEbsaAddress() {
		return etorConsigneeEbsaAddress;
	}
	public void setetorConsigneeEbsaAddress(String etorConsigneeEbsaAddress) {
		this.etorConsigneeEbsaAddress = etorConsigneeEbsaAddress;
	}
	public String getetorScheduleName() {
		return etorScheduleName;
	}
	public void setetorScheduleName(String etorScheduleName) {
		this.etorScheduleName = etorScheduleName;
	}
	public String getetorRemark() {
		return etorRemark;
	}
	public void setetorRemark(String etorRemark) {
		this.etorRemark = etorRemark;
	}
	public String getEtspName() {
		return etspName;
	}
	public void setEtspName(String etspName) {
		this.etspName = etspName;
	}
	public String getEtspSubstr2() {
		return etspSubstr2;
	}
	public void setEtspSubstr2(String etspSubstr2) {
		this.etspSubstr2 = etspSubstr2;
	}
	public String getetomType() {
		return etomType;
	}
	public void setetomType(String etomType) {
		this.etomType = etomType;
	}
	public String getEttaIsIntelscheduling() {
		return ettaIsIntelscheduling;
	}
	public void setEttaIsIntelscheduling(String ettaIsIntelscheduling) {
		this.ettaIsIntelscheduling = ettaIsIntelscheduling;
	}
	 
}
