package com.sinotrans.oms.businessrequest.dto;

import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoEoom2EobrModel;
import com.sinotrans.oms.businessrequest.model.EoEorb2EosrModel;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;

public class EoBookingDto {

	private EoRequestBookingModel eoRequestBookingModel;
	private List<EoEoom2EobrModel> eoEoom2EobrModels;
	private List<EoEorb2EosrModel> eoEorb2EosrModels;//EOBT：订舱箱需求表
	private EoOrderModel eoOrderModel;//订单信息
	public EoRequestBookingModel getEoRequestBookingModel() {
		return eoRequestBookingModel;
	}
	public void setEoRequestBookingModel(EoRequestBookingModel eoRequestBookingModel) {
		this.eoRequestBookingModel = eoRequestBookingModel;
	}
	public List<EoEoom2EobrModel> getEoEoom2EobrModels() {
		return eoEoom2EobrModels;
	}
	public void setEoEoom2EobrModels(List<EoEoom2EobrModel> eoEoom2EobrModels) {
		this.eoEoom2EobrModels = eoEoom2EobrModels;
	}
	public List<EoEorb2EosrModel> getEoEorb2EosrModels() {
		return eoEorb2EosrModels;
	}
	public void setEoEorb2EosrModels(List<EoEorb2EosrModel> eoEorb2EosrModels) {
		this.eoEorb2EosrModels = eoEorb2EosrModels;
	}
	public EoOrderModel getEoOrderModel() {
		return eoOrderModel;
	}
	public void setEoOrderModel(EoOrderModel eoOrderModel) {
		this.eoOrderModel = eoOrderModel;
	}
	
	
	
}
