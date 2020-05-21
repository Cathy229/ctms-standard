package com.sinotrans.oms.businessrequest.dto;

import java.util.List;

import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoddModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EodmModel;
import com.sinotrans.oms.businessrequest.model.EoRequestDeclarationDeputeModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;

/**
 * 
 * 
 * <p>Description: 委托报关数据传输类，用于前后台之间数据传递
 *    
 * </p>
 *
 * @author Richard
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 下午6:20:41   Richard       	               创建
 * 
 * 
 * </pre>
 */
public class EoDeclarationDeputeDto {
	/**
	 * 委托报关业务请求表
	 */
	private EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel;
	/**
	 * 委托报关业务请求物料表
	 */
	private List<EoEoom2EodmModel> eoEoom2EodmModelList;
	/**
	 * EODB：报关请求随附单证
	 */
	private List<EoEoddBillModel> eoEoddBillModelList;
	/**
	 * 集装箱信息
	 */
	private List<EoEooc2EoddModel> eoEooc2EoddModelList;
	/**
	 * 订单信息
	 */
	private EoOrderModel eoOrderModel;
	/**
	 * 委托报关业务请求表多
	 */
	private List<EoRequestDeclarationDeputeModel> eoRequestDeclarationDeputeModelList;
	
	private String errm = "";//收集报关保存错误数据
	public EoRequestDeclarationDeputeModel getEoRequestDeclarationDeputeModel() {
		return eoRequestDeclarationDeputeModel;
	}
	public void setEoRequestDeclarationDeputeModel(EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel) {
		this.eoRequestDeclarationDeputeModel = eoRequestDeclarationDeputeModel;
	}
	public List<EoEoom2EodmModel> getEoEoom2EodmModelList() {
		return eoEoom2EodmModelList;
	}
	public void setEoEoom2EodmModelList(List<EoEoom2EodmModel> eoEoom2EodmModelList) {
		this.eoEoom2EodmModelList = eoEoom2EodmModelList;
	}
	public List<EoEoddBillModel> getEoEoddBillModelList() {
		return eoEoddBillModelList;
	}
	public void setEoEoddBillModelList(List<EoEoddBillModel> eoEoddBillModelList) {
		this.eoEoddBillModelList = eoEoddBillModelList;
	}
	public List<EoEooc2EoddModel> getEoEooc2EoddModelList() {
		return eoEooc2EoddModelList;
	}
	public void setEoEooc2EoddModelList(List<EoEooc2EoddModel> eoEooc2EoddModelList) {
		this.eoEooc2EoddModelList = eoEooc2EoddModelList;
	}
	public EoOrderModel getEoOrderModel() {
		return eoOrderModel;
	}
	public void setEoOrderModel(EoOrderModel eoOrderModel) {
		this.eoOrderModel = eoOrderModel;
	}
	public List<EoRequestDeclarationDeputeModel> getEoRequestDeclarationDeputeModelList() {
		return eoRequestDeclarationDeputeModelList;
	}
	public void setEoRequestDeclarationDeputeModelList(
			List<EoRequestDeclarationDeputeModel> eoRequestDeclarationDeputeModelList) {
		this.eoRequestDeclarationDeputeModelList = eoRequestDeclarationDeputeModelList;
	}
	public String getErrm() {
		return errm;
	}
	public void setErrm(String errm) {
		this.errm = errm;
	}
	
}
