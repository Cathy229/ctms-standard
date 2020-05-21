package com.sinotrans.oms.eoorder.dto;

/**
 * SystemBulletinDto 用于填充看板界面的值
 * @author shoven
 * 2018年8月6日13:39:35
 */
public class SystemBulletinDto {

	//订单待确认
	private Long unConfimOrder;
	//订单待确认超期
	private Long unConfimOrderOverdue;
	//订舱待订舱
	private Long unBooking;
	//订舱待订舱超期
	private Long unBookingOrderOverdue;
	//订舱待订舱反馈
	private Long unBookingFeesBack;
	//订舱待发舱单
	private Long unBookingShippingBill;
	//订舱待集港
	private Long unBookingCollectPort;
	//订舱待离港
	private Long unBookingDeparturePort;
	//报关待下达
	private Long unDeclarationDeputeIssued;
	//报关待确认
	private Long unDeclarationDeputeConfim;
	//报关待申报
	private Long unDeclarationDeputedeclare;
	//报关待查验
	private Long unDeclarationDeputeInspection;
	//报关待放行
	private Long unDeclarationDeputeRelease;
	//拖车待派车
	private Long unTrailerIssued;
	//拖车待计划
	private Long unTrailerPlan;
	//拖车待确认
	private Long unTrailerConfim;
	//拖车待出场
	private Long unTrailerComeOut;
	//拖车待返场
	private Long unTrailerReturn;
	//拖车待集港
	private Long unTrailerCollectPort;
	//单证待制单
	private Long unDocumentsMakingBill;
	//单证待交单
	private Long unDocumentsDocuments;
	//单证待确认
	private Long unDocumentsConfim;
	//费用代计费
	private Long unChargingFees;
	//费用待提交
	private Long unUpLoadBmsFees;
	
	
	public Long getUnConfimOrder() {
		return unConfimOrder;
	}
	public void setUnConfimOrder(Long unConfimOrder) {
		this.unConfimOrder = unConfimOrder;
	}
	public Long getUnConfimOrderOverdue() {
		return unConfimOrderOverdue;
	}
	public void setUnConfimOrderOverdue(Long unConfimOrderOverdue) {
		this.unConfimOrderOverdue = unConfimOrderOverdue;
	}
	public Long getUnBooking() {
		return unBooking;
	}
	public void setUnBooking(Long unBooking) {
		this.unBooking = unBooking;
	}
	public Long getUnBookingOrderOverdue() {
		return unBookingOrderOverdue;
	}
	public void setUnBookingOrderOverdue(Long unBookingOrderOverdue) {
		this.unBookingOrderOverdue = unBookingOrderOverdue;
	}
	public Long getUnBookingFeesBack() {
		return unBookingFeesBack;
	}
	public void setUnBookingFeesBack(Long unBookingFeesBack) {
		this.unBookingFeesBack = unBookingFeesBack;
	}
	public Long getUnBookingShippingBill() {
		return unBookingShippingBill;
	}
	public void setUnBookingShippingBill(Long unBookingShippingBill) {
		this.unBookingShippingBill = unBookingShippingBill;
	}
	public Long getUnBookingCollectPort() {
		return unBookingCollectPort;
	}
	public void setUnBookingCollectPort(Long unBookingCollectPort) {
		this.unBookingCollectPort = unBookingCollectPort;
	}
	public Long getUnBookingDeparturePort() {
		return unBookingDeparturePort;
	}
	public void setUnBookingDeparturePort(Long unBookingDeparturePort) {
		this.unBookingDeparturePort = unBookingDeparturePort;
	}
	public Long getUnDeclarationDeputeIssued() {
		return unDeclarationDeputeIssued;
	}
	public void setUnDeclarationDeputeIssued(Long unDeclarationDeputeIssued) {
		this.unDeclarationDeputeIssued = unDeclarationDeputeIssued;
	}
	public Long getUnDeclarationDeputeConfim() {
		return unDeclarationDeputeConfim;
	}
	public void setUnDeclarationDeputeConfim(Long unDeclarationDeputeConfim) {
		this.unDeclarationDeputeConfim = unDeclarationDeputeConfim;
	}
	public Long getUnDeclarationDeputedeclare() {
		return unDeclarationDeputedeclare;
	}
	public void setUnDeclarationDeputedeclare(Long unDeclarationDeputedeclare) {
		this.unDeclarationDeputedeclare = unDeclarationDeputedeclare;
	}
	public Long getUnDeclarationDeputeInspection() {
		return unDeclarationDeputeInspection;
	}
	public void setUnDeclarationDeputeInspection(Long unDeclarationDeputeInspection) {
		this.unDeclarationDeputeInspection = unDeclarationDeputeInspection;
	}
	public Long getUnDeclarationDeputeRelease() {
		return unDeclarationDeputeRelease;
	}
	public void setUnDeclarationDeputeRelease(Long unDeclarationDeputeRelease) {
		this.unDeclarationDeputeRelease = unDeclarationDeputeRelease;
	}
	public Long getUnTrailerIssued() {
		return unTrailerIssued;
	}
	public void setUnTrailerIssued(Long unTrailerIssued) {
		this.unTrailerIssued = unTrailerIssued;
	}
	public Long getUnTrailerPlan() {
		return unTrailerPlan;
	}
	public void setUnTrailerPlan(Long unTrailerPlan) {
		this.unTrailerPlan = unTrailerPlan;
	}
	public Long getUnTrailerConfim() {
		return unTrailerConfim;
	}
	public void setUnTrailerConfim(Long unTrailerConfim) {
		this.unTrailerConfim = unTrailerConfim;
	}
	public Long getUnTrailerComeOut() {
		return unTrailerComeOut;
	}
	public void setUnTrailerComeOut(Long unTrailerComeOut) {
		this.unTrailerComeOut = unTrailerComeOut;
	}
	public Long getUnTrailerReturn() {
		return unTrailerReturn;
	}
	public void setUnTrailerReturn(Long unTrailerReturn) {
		this.unTrailerReturn = unTrailerReturn;
	}
	public Long getUnTrailerCollectPort() {
		return unTrailerCollectPort;
	}
	public void setUnTrailerCollectPort(Long unTrailerCollectPort) {
		this.unTrailerCollectPort = unTrailerCollectPort;
	}
	public Long getUnDocumentsMakingBill() {
		return unDocumentsMakingBill;
	}
	public void setUnDocumentsMakingBill(Long unDocumentsMakingBill) {
		this.unDocumentsMakingBill = unDocumentsMakingBill;
	}
	public Long getUnDocumentsDocuments() {
		return unDocumentsDocuments;
	}
	public void setUnDocumentsDocuments(Long unDocumentsDocuments) {
		this.unDocumentsDocuments = unDocumentsDocuments;
	}
	public Long getUnDocumentsConfim() {
		return unDocumentsConfim;
	}
	public void setUnDocumentsConfim(Long unDocumentsConfim) {
		this.unDocumentsConfim = unDocumentsConfim;
	}
	public Long getUnChargingFees() {
		return unChargingFees;
	}
	public void setUnChargingFees(Long unChargingFees) {
		this.unChargingFees = unChargingFees;
	}
	public Long getUnUpLoadBmsFees() {
		return unUpLoadBmsFees;
	}
	public void setUnUpLoadBmsFees(Long unUpLoadBmsFees) {
		this.unUpLoadBmsFees = unUpLoadBmsFees;
	}
}
