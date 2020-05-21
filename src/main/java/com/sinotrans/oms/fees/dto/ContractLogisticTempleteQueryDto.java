package com.sinotrans.oms.fees.dto;

import java.io.Serializable;
import java.util.Date;

import com.sinotrans.oms.fees.model.EfBmsImModel;

/**  
* <p>Title: ContractLogisticTempleteNewQueryDto</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月14日  
* @version 1.0  
*/
public class ContractLogisticTempleteQueryDto extends EfBmsImModel implements Serializable{

	private String escoCompanyNo;//公司代码
	private String eoorBmsEbsmCode;//BMS销售人员
	private String eoorBmsEsdeDepartmentCode;//BMS部门代码
	private String eoorFCode;//项目代码
	private String eoorSinoNo;//外运号
	private String eoorOrderNo;//订单编号
	private String eoorBmsAEbcuCustomerNo;//主要客户代码
	private String eoorBmsSEbcuCustomerNo;//主要供应商代码
	private String eoorBmsEbbtCode;//BMS票据代码
	private String eoorBmsEbotCode;//板块代码
	private String eoorBmsBusinessClass;//BMS业务类型代码
	private Date eoorBmsAcmpTime;//业务完成时间
	private Long countEosi;//入库记录数
	private Long countSoso;//出库记录数
	private String eosiWarehouseCode;//入库仓库代码
	private String eosoWarehouseCode;//出库仓库代码
	private String isCompanyCarrier;//是否本公司承运，Y:是，N 否，为空时默认N:否
	private String eoeaFreightService;//货代服务 0100水运，0200空运，0300陆运，0400铁路，0500多式联运，0600专业报关
	private String eoeaBulkBillNo;//提/运单号（MWB）
	private String eoeaHblNo;//提/运单号(HWB)
	private Date eosiLibraryTime;//入库时间
	private Date eosoLibraryTime;//出库时间
	private Date shipmentDate;//发运/到达日优先取订单扩展表发运时间（货代实际离港时间），取不到再取订单扩展代理表预计开航日期 
	private String orderAccpetDate;//订单受理时间
	private Date eortArrivalTime;//陆运任务实际送达时间
	private Date eorcArrivalTime;//化工运输任务实际送达时间
	private Date eoeaDeliveryDate;//订单扩展表的交货日    货物交付时间优化取 陆运任务实际送达时间>化工运输任务实际送达时间>订单扩展表的交货日
	private Long shipperCountryId;//发货区域国家ID
	private String shipperCountryCode;//发货区域国家代码
	private String shipperCountryName;//发货区域国家
	private Long consigneeCountryId;//收货区域国家ID
	private String consigneeCountryCode;//收货区域国家代码
	private String consigneeCountryName;//收货区域国家
	private Long shipperCityId;//始发地城市ID
	private String shipperCityQuickCode;//始发地城市快速录入码
	private String shipperCityName;//始发地城市名称
	private Long consigneeCityId;//抵达地城市ID
	private String consigneeCityQuickCode;//抵达地城市快速录入码
	private String consigneeCityName;//抵达地城市名称
	private Double eoorQuantity;//订单件数
	private Double eoorWeight;//订单毛重吨 
	private Double eoorVolume;//订单体积
	private Double eoorNetWeight;//订单统计重量（吨）
	private Long orderContainerTeu;//订单箱量（TEU）
	
	private Long countEort;//陆运任务记录数
	private Long countEorc;//化工任务记录数
	private Long countEoea;//订单扩展表记录数
	
	public String getEscoCompanyNo() {
		return escoCompanyNo;
	}
	public void setEscoCompanyNo(String escoCompanyNo) {
		this.escoCompanyNo = escoCompanyNo;
	}
	public String getEoorBmsEbsmCode() {
		return eoorBmsEbsmCode;
	}
	public void setEoorBmsEbsmCode(String eoorBmsEbsmCode) {
		this.eoorBmsEbsmCode = eoorBmsEbsmCode;
	}
	public String getEoorBmsEsdeDepartmentCode() {
		return eoorBmsEsdeDepartmentCode;
	}
	public void setEoorBmsEsdeDepartmentCode(String eoorBmsEsdeDepartmentCode) {
		this.eoorBmsEsdeDepartmentCode = eoorBmsEsdeDepartmentCode;
	}
	public String getEoorFCode() {
		return eoorFCode;
	}
	public void setEoorFCode(String eoorFCode) {
		this.eoorFCode = eoorFCode;
	}
	public String getEoorSinoNo() {
		return eoorSinoNo;
	}
	public void setEoorSinoNo(String eoorSinoNo) {
		this.eoorSinoNo = eoorSinoNo;
	}
	public String getEoorOrderNo() {
		return eoorOrderNo;
	}
	public void setEoorOrderNo(String eoorOrderNo) {
		this.eoorOrderNo = eoorOrderNo;
	}
	public String getEoorBmsAEbcuCustomerNo() {
		return eoorBmsAEbcuCustomerNo;
	}
	public void setEoorBmsAEbcuCustomerNo(String eoorBmsAEbcuCustomerNo) {
		this.eoorBmsAEbcuCustomerNo = eoorBmsAEbcuCustomerNo;
	}
	public String getEoorBmsSEbcuCustomerNo() {
		return eoorBmsSEbcuCustomerNo;
	}
	public void setEoorBmsSEbcuCustomerNo(String eoorBmsSEbcuCustomerNo) {
		this.eoorBmsSEbcuCustomerNo = eoorBmsSEbcuCustomerNo;
	}
	public String getEoorBmsEbbtCode() {
		return eoorBmsEbbtCode;
	}
	public void setEoorBmsEbbtCode(String eoorBmsEbbtCode) {
		this.eoorBmsEbbtCode = eoorBmsEbbtCode;
	}
	public String getEoorBmsEbotCode() {
		return eoorBmsEbotCode;
	}
	public void setEoorBmsEbotCode(String eoorBmsEbotCode) {
		this.eoorBmsEbotCode = eoorBmsEbotCode;
	}
	public String getEoorBmsBusinessClass() {
		return eoorBmsBusinessClass;
	}
	public void setEoorBmsBusinessClass(String eoorBmsBusinessClass) {
		this.eoorBmsBusinessClass = eoorBmsBusinessClass;
	}
	public Date getEoorBmsAcmpTime() {
		return eoorBmsAcmpTime;
	}
	public void setEoorBmsAcmpTime(Date eoorBmsAcmpTime) {
		this.eoorBmsAcmpTime = eoorBmsAcmpTime;
	}
	public Long getCountEosi() {
		return countEosi;
	}
	public void setCountEosi(Long countEosi) {
		this.countEosi = countEosi;
	}
	public Long getCountSoso() {
		return countSoso;
	}
	public void setCountSoso(Long countSoso) {
		this.countSoso = countSoso;
	}
	public String getEosiWarehouseCode() {
		return eosiWarehouseCode;
	}
	public void setEosiWarehouseCode(String eosiWarehouseCode) {
		this.eosiWarehouseCode = eosiWarehouseCode;
	}
	public String getEosoWarehouseCode() {
		return eosoWarehouseCode;
	}
	public void setEosoWarehouseCode(String eosoWarehouseCode) {
		this.eosoWarehouseCode = eosoWarehouseCode;
	}
	public String getIsCompanyCarrier() {
		return isCompanyCarrier;
	}
	public void setIsCompanyCarrier(String isCompanyCarrier) {
		this.isCompanyCarrier = isCompanyCarrier;
	}
	public String getEoeaFreightService() {
		return eoeaFreightService;
	}
	public void setEoeaFreightService(String eoeaFreightService) {
		this.eoeaFreightService = eoeaFreightService;
	}
	public String getEoeaBulkBillNo() {
		return eoeaBulkBillNo;
	}
	public void setEoeaBulkBillNo(String eoeaBulkBillNo) {
		this.eoeaBulkBillNo = eoeaBulkBillNo;
	}
	public String getEoeaHblNo() {
		return eoeaHblNo;
	}
	public void setEoeaHblNo(String eoeaHblNo) {
		this.eoeaHblNo = eoeaHblNo;
	}
	public Date getEosiLibraryTime() {
		return eosiLibraryTime;
	}
	public void setEosiLibraryTime(Date eosiLibraryTime) {
		this.eosiLibraryTime = eosiLibraryTime;
	}
	public Date getEosoLibraryTime() {
		return eosoLibraryTime;
	}
	public void setEosoLibraryTime(Date eosoLibraryTime) {
		this.eosoLibraryTime = eosoLibraryTime;
	}
	public Date getShipmentDate() {
		return shipmentDate;
	}
	public void setShipmentDate(Date shipmentDate) {
		this.shipmentDate = shipmentDate;
	}
	public String getOrderAccpetDate() {
		return orderAccpetDate;
	}
	public void setOrderAccpetDate(String orderAccpetDate) {
		this.orderAccpetDate = orderAccpetDate;
	}
	public Date getEortArrivalTime() {
		return eortArrivalTime;
	}
	public void setEortArrivalTime(Date eortArrivalTime) {
		this.eortArrivalTime = eortArrivalTime;
	}
	public Date getEorcArrivalTime() {
		return eorcArrivalTime;
	}
	public void setEorcArrivalTime(Date eorcArrivalTime) {
		this.eorcArrivalTime = eorcArrivalTime;
	}
	public Date getEoeaDeliveryDate() {
		return eoeaDeliveryDate;
	}
	public void setEoeaDeliveryDate(Date eoeaDeliveryDate) {
		this.eoeaDeliveryDate = eoeaDeliveryDate;
	}
	public Long getShipperCountryId() {
		return shipperCountryId;
	}
	public void setShipperCountryId(Long shipperCountryId) {
		this.shipperCountryId = shipperCountryId;
	}
	public String getShipperCountryCode() {
		return shipperCountryCode;
	}
	public void setShipperCountryCode(String shipperCountryCode) {
		this.shipperCountryCode = shipperCountryCode;
	}
	public String getShipperCountryName() {
		return shipperCountryName;
	}
	public void setShipperCountryName(String shipperCountryName) {
		this.shipperCountryName = shipperCountryName;
	}
	public Long getConsigneeCountryId() {
		return consigneeCountryId;
	}
	public void setConsigneeCountryId(Long consigneeCountryId) {
		this.consigneeCountryId = consigneeCountryId;
	}
	public String getConsigneeCountryCode() {
		return consigneeCountryCode;
	}
	public void setConsigneeCountryCode(String consigneeCountryCode) {
		this.consigneeCountryCode = consigneeCountryCode;
	}
	public String getConsigneeCountryName() {
		return consigneeCountryName;
	}
	public void setConsigneeCountryName(String consigneeCountryName) {
		this.consigneeCountryName = consigneeCountryName;
	}
	public Long getShipperCityId() {
		return shipperCityId;
	}
	public void setShipperCityId(Long shipperCityId) {
		this.shipperCityId = shipperCityId;
	}
	public String getShipperCityQuickCode() {
		return shipperCityQuickCode;
	}
	public void setShipperCityQuickCode(String shipperCityQuickCode) {
		this.shipperCityQuickCode = shipperCityQuickCode;
	}
	public String getShipperCityName() {
		return shipperCityName;
	}
	public void setShipperCityName(String shipperCityName) {
		this.shipperCityName = shipperCityName;
	}
	public Long getConsigneeCityId() {
		return consigneeCityId;
	}
	public void setConsigneeCityId(Long consigneeCityId) {
		this.consigneeCityId = consigneeCityId;
	}
	public String getConsigneeCityQuickCode() {
		return consigneeCityQuickCode;
	}
	public void setConsigneeCityQuickCode(String consigneeCityQuickCode) {
		this.consigneeCityQuickCode = consigneeCityQuickCode;
	}
	public String getConsigneeCityName() {
		return consigneeCityName;
	}
	public void setConsigneeCityName(String consigneeCityName) {
		this.consigneeCityName = consigneeCityName;
	}
	public Double getEoorQuantity() {
		return eoorQuantity;
	}
	public void setEoorQuantity(Double eoorQuantity) {
		this.eoorQuantity = eoorQuantity;
	}
	public Double getEoorWeight() {
		return eoorWeight;
	}
	public void setEoorWeight(Double eoorWeight) {
		this.eoorWeight = eoorWeight;
	}
	public Double getEoorVolume() {
		return eoorVolume;
	}
	public void setEoorVolume(Double eoorVolume) {
		this.eoorVolume = eoorVolume;
	}
	public Double getEoorNetWeight() {
		return eoorNetWeight;
	}
	public void setEoorNetWeight(Double eoorNetWeight) {
		this.eoorNetWeight = eoorNetWeight;
	}
	public Long getOrderContainerTeu() {
		return orderContainerTeu;
	}
	public void setOrderContainerTeu(Long orderContainerTeu) {
		this.orderContainerTeu = orderContainerTeu;
	}
	public Long getCountEort() {
		return countEort;
	}
	public void setCountEort(Long countEort) {
		this.countEort = countEort;
	}
	public Long getCountEorc() {
		return countEorc;
	}
	public void setCountEorc(Long countEorc) {
		this.countEorc = countEorc;
	}
	public Long getCountEoea() {
		return countEoea;
	}
	public void setCountEoea(Long countEoea) {
		this.countEoea = countEoea;
	}
}
