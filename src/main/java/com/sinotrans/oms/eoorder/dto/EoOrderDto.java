package com.sinotrans.oms.eoorder.dto;

import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoFreightImportModel;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.eoorder.model.EoOrderMaterielModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.eoorder.model.EoOrderPrecontainerModel;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;

public class EoOrderDto {
	private EoOrderModel eoOrderModel;
	private EoOrderExpandAgencyModel eoOrderExpandAgencyModel;
	private List<EoOrderMaterielModel> eoOrderMaterielModelList;
	private List<EfBusinessFeesModel> efBusinessFeesModelList;
	private List<EoOrderPrecontainerModel> eoOrderPrecontainerModelList;//订单箱需求表
	private List<EoOrderContainerModel> eoOrderContainerModelList;//订单预配箱明细表 eooc
	private String errm;//EoOrderDto在批量保存的时候，可以方便记录每一个DTO的错误信息
	private EoFreightImportModel eoFreightimportModel;//站内跟踪
	
	private Long eoorId;//复制订单id
	private Long afterEoorId;//被复制订单id
	
	public EoOrderModel getEoOrderModel() {
		return eoOrderModel;
	}
	public void setEoOrderModel(EoOrderModel eoOrderModel) {
		this.eoOrderModel = eoOrderModel;
	}
	public EoOrderExpandAgencyModel getEoOrderExpandAgencyModel() {
		return eoOrderExpandAgencyModel;
	}
	public void setEoOrderExpandAgencyModel(EoOrderExpandAgencyModel eoOrderExpandAgencyModel) {
		this.eoOrderExpandAgencyModel = eoOrderExpandAgencyModel;
	}
	public List<EoOrderMaterielModel> getEoOrderMaterielModelList() {
		return eoOrderMaterielModelList;
	}
	public void setEoOrderMaterielModelList(List<EoOrderMaterielModel> eoOrderMaterielModelList) {
		this.eoOrderMaterielModelList = eoOrderMaterielModelList;
	}
	public List<EfBusinessFeesModel> getEfBusinessFeesModelList() {
		return efBusinessFeesModelList;
	}
	public void setEfBusinessFeesModelList(List<EfBusinessFeesModel> efBusinessFeesModelList) {
		this.efBusinessFeesModelList = efBusinessFeesModelList;
	}
	public List<EoOrderPrecontainerModel> getEoOrderPrecontainerModelList() {
		return eoOrderPrecontainerModelList;
	}
	public void setEoOrderPrecontainerModelList(List<EoOrderPrecontainerModel> eoOrderPrecontainerModelList) {
		this.eoOrderPrecontainerModelList = eoOrderPrecontainerModelList;
	}
	public List<EoOrderContainerModel> getEoOrderContainerModelList() {
		return eoOrderContainerModelList;
	}
	public void setEoOrderContainerModelList(List<EoOrderContainerModel> eoOrderContainerModelList) {
		this.eoOrderContainerModelList = eoOrderContainerModelList;
	}
	public String getErrm() {
		return errm;
	}
	public void setErrm(String errm) {
		this.errm = errm;
	}
	public EoFreightImportModel getEoFreightimportModel() {
		return eoFreightimportModel;
	}
	public void setEoFreightimportModel(EoFreightImportModel eoFreightimportModel) {
		this.eoFreightimportModel = eoFreightimportModel;
	}
	public Long getEoorId() {
		return eoorId;
	}
	public void setEoorId(Long eoorId) {
		this.eoorId = eoorId;
	}
	public Long getAfterEoorId() {
		return afterEoorId;
	}
	public void setAfterEoorId(Long afterEoorId) {
		this.afterEoorId = afterEoorId;
	}
	
}
