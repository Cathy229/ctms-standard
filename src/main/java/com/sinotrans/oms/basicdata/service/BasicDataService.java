package com.sinotrans.oms.basicdata.service;


import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.basicdata.model.EbShipperModel;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.customerproject.model.EbCustomerModel;
import com.sinotrans.oms.customerproject.model.EbProjectModel;
import com.sinotrans.oms.system.model.EsCompanyModel;

public interface BasicDataService {
	/**
	 * 根据公司名称/代码/id等条件查公司信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param conditionMap
	 * @return
	 */
	public ResponseData<QueryData> queryCompanyByCondition(QueryInfo queryInfo);
	/**
	 * 根据项目名称/代码/id等条件查项目信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param conditionMap
	 * @return
	 */
	public ResponseData<QueryData> queryProjectByCondition(QueryInfo queryInfo);
	/**
	 * 根据客户or供应商名称/代码/id等条件查客户or供应商信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param conditionMap
	 * @return
	 */
	public ResponseData<QueryData> queryCustomerByCondition(QueryInfo queryInfo);
	/**
	 * 根据收or发货方名称/代码/id等条件查收or发货方信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param conditionMap
	 * @return
	 */
	public ResponseData<QueryData> queryShipperByCondition(QueryInfo queryInfo);
	/**
	 * 保存或更新公司信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param EsCompanyModel
	 * @return
	 */
	public ResponseData<EsCompanyModel> saveCompany(EsCompanyModel esCompanyModel);
	/**
	 * 保存或更新项目信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param EbProjectModel
	 * @return
	 */
	public ResponseData<EbProjectModel> saveProject(EbProjectModel ebProjectModel);
	/**
	 * 保存或更新客户/供应商信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param EbCustomerModel
	 * @return
	 */
	public ResponseData<EbCustomerModel> saveCustomer(EbCustomerModel ebCustomerModel);
	/**
	 * 保存或更新收发货方信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param EbShipperModel
	 * @return
	 */
	public ResponseData<EbShipperModel> saveShipper(EbShipperModel ebShipperModel);

}
