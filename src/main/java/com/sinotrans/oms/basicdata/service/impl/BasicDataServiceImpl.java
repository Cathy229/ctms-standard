package com.sinotrans.oms.basicdata.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.core.aop.BaseAspect;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.basicdata.model.EbShipperModel;
import com.sinotrans.oms.basicdata.manager.EbShipperManager;
import com.sinotrans.oms.basicdata.service.BasicDataService;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.customerproject.manager.EbCustomerManager;
import com.sinotrans.oms.customerproject.manager.EbProjectManager;
import com.sinotrans.oms.customerproject.model.EbCustomerModel;
import com.sinotrans.oms.customerproject.model.EbProjectModel;
import com.sinotrans.oms.system.manager.EsCompanyManager;
import com.sinotrans.oms.system.model.EsCompanyModel;


@Service
public class BasicDataServiceImpl extends BaseAspect implements BasicDataService{
	
	@Autowired	
	private CommonQueryManager commonQueryManager;
	@Autowired	
	private EsCompanyManager esCompanyManager;
	@Autowired	
	private EbProjectManager ebProjectManager;
	@Autowired	
	private EbCustomerManager ebCustomerManager;
	@Autowired	
	private EbShipperManager ebShipperManager;
	
	

	/**
	 * 根据公司名称/代码/id等条件查公司信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param conditionMap
	 * @return
	 */
	public ResponseData<QueryData> queryCompanyByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		if (EmptyUtils.isEmpty(queryInfo.getQueryFields())) {
			responseData.setCode("N");
			responseData.setMsg("查询失败，查询条件不匹配");
			return responseData;
		}
		queryInfo.setQueryType("EsCompanyModel");
		QueryData queryData = commonQueryManager.query(queryInfo);
		if(EmptyUtils.isNotEmpty(queryData.toString())){
			responseData.setData(queryData);
			responseData.setCode("Y");
			responseData.setMsg("查询成功");
		}else{
			responseData.setCode("N");
			responseData.setMsg("查询失败");
		}
		return responseData;
	}
	/**
	 * 根据项目名称/代码/id等条件查项目信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param conditionMap
	 * @return
	 */
	public ResponseData<QueryData> queryProjectByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		if (EmptyUtils.isEmpty(queryInfo.getQueryFields())) {
			responseData.setCode("N");
			responseData.setMsg("查询失败，查询条件不匹配");
			return responseData;
		}
		queryInfo.setQueryType("EbProjectModel");
		QueryData queryData = commonQueryManager.query(queryInfo);
		if(EmptyUtils.isNotEmpty(queryData.toString())){
			responseData.setData(queryData);
			responseData.setCode("Y");
			responseData.setMsg("查询成功");
		}else{
			responseData.setCode("N");
			responseData.setMsg("查询失败");
		}
		return responseData;
	}
	/**
	 * 根据客户or供应商名称/代码/id等条件查客户or供应商信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param conditionMap
	 * @return
	 */
	public ResponseData<QueryData> queryCustomerByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		if (EmptyUtils.isEmpty(queryInfo.getQueryFields())) {
			responseData.setCode("N");
			responseData.setMsg("查询失败，查询条件不匹配");
			return responseData;
		}
		queryInfo.setQueryType("EbCustomerModel");
		QueryData queryData = commonQueryManager.query(queryInfo);
		if(EmptyUtils.isNotEmpty(queryData.toString())){
			responseData.setData(queryData);
			responseData.setCode("Y");
			responseData.setMsg("查询成功");
		}else{
			responseData.setCode("N");
			responseData.setMsg("查询失败");
		}
		return responseData;
	}
	/**
	 * 根据收or发货方名称/代码/id等条件查收or发货方信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param conditionMap
	 * @return
	 */
	public ResponseData<QueryData> queryShipperByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		if (EmptyUtils.isEmpty(queryInfo.getQueryFields())) {
			responseData.setCode("N");
			responseData.setMsg("查询失败，查询条件不匹配");
			return responseData;
		}
		queryInfo.setQueryType("EbShipperModel");
		QueryData queryData = commonQueryManager.query(queryInfo);
		if(EmptyUtils.isNotEmpty(queryData.toString())){
			responseData.setData(queryData);
			responseData.setCode("Y");
			responseData.setMsg("查询成功");
		}else{
			responseData.setCode("N");
			responseData.setMsg("查询失败");
		}
		return responseData;
	}
	/**
	 * 保存或更新公司信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param EsCompanyModel
	 * @return
	 */
	public ResponseData<EsCompanyModel> saveCompany(EsCompanyModel esCompanyModel) {
		ResponseData<EsCompanyModel> responseData = new ResponseData<>();
		EsCompanyModel esCompanyModel1 = this.esCompanyManager.save(esCompanyModel);
		if(null == esCompanyModel1){
			responseData.setData(esCompanyModel);
			responseData.setCode("N");
			responseData.setMsg("保存失败");
		}else{
			responseData.setData(esCompanyModel1);
			responseData.setCode("Y");
			responseData.setMsg("保存成功");
		}
		return responseData;
	}
	/**
	 * 保存或更新项目信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param EbProjectModel
	 * @return
	 */
	public ResponseData<EbProjectModel> saveProject(EbProjectModel ebProjectModel) {
		ResponseData<EbProjectModel> responseData = new ResponseData<>();
		EbProjectModel ebProjectModel1 = this.ebProjectManager.save(ebProjectModel);
		if(null == ebProjectModel1){
			responseData.setData(ebProjectModel);
			responseData.setCode("N");
			responseData.setMsg("保存失败");
		}else{
			responseData.setData(ebProjectModel1);
			responseData.setCode("Y");
			responseData.setMsg("保存成功");
		}
		return responseData;
	}
	/**
	 * 保存或更新客户/供应商信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param EbCustomerModel
	 * @return
	 */
	public ResponseData<EbCustomerModel> saveCustomer(EbCustomerModel ebCustomerModel) {
		ResponseData<EbCustomerModel> responseData = new ResponseData<>();
		EbCustomerModel ebCustomerModel1 = this.ebCustomerManager.save(ebCustomerModel);
		if(null == ebCustomerModel1){
			responseData.setData(ebCustomerModel);
			responseData.setCode("N");
			responseData.setMsg("保存失败");
		}else{
			responseData.setData(ebCustomerModel1);
			responseData.setCode("Y");
			responseData.setMsg("保存成功");
		}
		return responseData;
	}
	/**
	 * 保存或更新收发货方信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param EbShipperModel
	 * @return
	 */
	public ResponseData<EbShipperModel> saveShipper(EbShipperModel ebShipperModel) {
		ResponseData<EbShipperModel> responseData = new ResponseData<>();
		EbShipperModel ebShipperModel1 = this.ebShipperManager.save(ebShipperModel);
		if(null == ebShipperModel1){
			responseData.setData(ebShipperModel);
			responseData.setCode("N");
			responseData.setMsg("保存失败");
		}else{
			responseData.setData(ebShipperModel1);
			responseData.setCode("Y");
			responseData.setMsg("保存成功");
		}
		return responseData;
	}
}
