package com.sinotrans.oms.businessrequest.dto;

import java.io.Serializable;
import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;


/**
 * 
 * <p>Description: 拖车数据传输类，用于前后台之间数据传递
 *    
 * </p>
 *
 * @author James
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本     修改人   	修改日期   	修改内容
 * 2018年8月8日     James       	               创建
 * 
 * 
 * </pre>
 */
public class EoTrailerDto implements Serializable{
	/**
	 * 拖车请求数据
	 */
	private EoRequestTrailerModel eoRequestTrailerModel;
	/**
	 * 拖车物料数据
	 */
	private List<EoEoom2EoetModel> eoEoom2EoetModelList;
	/**
	 * 拖车集装箱数据
	 */
	private List<EoEooc2EoetModel> eoEooc2EoetModelList;
	/**
	 * 订单数据
	 */
	private EoOrderModel eoOrderModel;
	/**
	 * 订单实装箱数据
	 */
	private List<EoOrderContainerModel> eoOrderContainerModelList;
	
	public EoRequestTrailerModel getEoRequestTrailerModel() {
		return eoRequestTrailerModel;
	}
	public void setEoRequestTrailerModel(EoRequestTrailerModel eoRequestTrailerModel) {
		this.eoRequestTrailerModel = eoRequestTrailerModel;
	}
	public List<EoEoom2EoetModel> getEoEoom2EoetModelList() {
		return eoEoom2EoetModelList;
	}
	public void setEoEoom2EoetModelList(List<EoEoom2EoetModel> eoEoom2EoetModelList) {
		this.eoEoom2EoetModelList = eoEoom2EoetModelList;
	}
	public List<EoEooc2EoetModel> getEoEooc2EoetModelList() {
		return eoEooc2EoetModelList;
	}
	public void setEoEooc2EoetModelList(List<EoEooc2EoetModel> eoEooc2EoetModelList) {
		this.eoEooc2EoetModelList = eoEooc2EoetModelList;
	}
	public EoOrderModel getEoOrderModel() {
		return eoOrderModel;
	}
	public void setEoOrderModel(EoOrderModel eoOrderModel) {
		this.eoOrderModel = eoOrderModel;
	}
	public List<EoOrderContainerModel> getEoOrderContainerModelList() {
		return eoOrderContainerModelList;
	}
	public void setEoOrderContainerModelList(List<EoOrderContainerModel> eoOrderContainerModelList) {
		this.eoOrderContainerModelList = eoOrderContainerModelList;
	}
	

}
