package com.sinotrans.oms.basicdata.restcontroller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.basicdata.model.EbShipperModel;
import com.sinotrans.oms.basicdata.service.BasicDataService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.aop.IgnoreLoginController;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.customerproject.model.EbCustomerModel;
import com.sinotrans.oms.customerproject.model.EbProjectModel;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.system.model.EsCompanyModel;




/**
 * Title: basicDataRestController  
 * Description: 基础数据相关供外部调用的接口 
 * @author Jeffery.Zhang   
 * @date 2018年12月3日  
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/rest/basicDataRestController")
public class BasicDataRestController {
	

	@Autowired
	private BasicDataService basicDataService;//订单service



	/**
	 * 根据公司名称/代码/id等条件查公司信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param conditionMap
	 * @return
	 */
	@RequestMapping(value = "/queryCompanyByCondition", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryCompanyByCondition(@RequestBody QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = this.basicDataService.queryCompanyByCondition(queryInfo);
		return responseData;
	}
	/**
	 * 根据项目名称/代码/id等条件查项目信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param conditionMap
	 * @return
	 */
	@RequestMapping(value = "/queryProjectByCondition", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryProjectByCondition(@RequestBody QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = this.basicDataService.queryProjectByCondition(queryInfo);
		return responseData;
	}
	
	/**
	 * 根据客户or供应商名称/代码/id等条件查客户or供应商信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param conditionMap
	 * @return
	 */
	@RequestMapping(value = "/queryCustomerByCondition", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryCustomerByCondition(@RequestBody QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = this.basicDataService.queryCustomerByCondition(queryInfo);
		return responseData;
	}
	/**
	 * 根据收or发货方名称/代码/id等条件查收or发货方信息
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param conditionMap
	 * @return
	 */
	@RequestMapping(value = "/queryShipperByCondition", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryShipperByCondition(@RequestBody QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = this.basicDataService.queryShipperByCondition(queryInfo);
		return responseData;
	}
	/**
	 * 公司保存标准服务
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param EsCompanyModel
	 * @return
	 */
	@RequestMapping(value = "/saveCompany", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EsCompanyModel> saveCompany (@RequestBody EsCompanyModel esCompanyModel) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		//调用service层处理业务逻辑
		ResponseData<EsCompanyModel> responseData = this.basicDataService.saveCompany(esCompanyModel);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 项目保存标准服务
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param EbProjectModel
	 * @return
	 */
	@RequestMapping(value = "/saveProject", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EbProjectModel> saveProject (@RequestBody EbProjectModel ebProjectModel) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		//调用service层处理业务逻辑
		ResponseData<EbProjectModel> responseData = this.basicDataService.saveProject(ebProjectModel);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 客户/供应商保存标准服务
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param EbCustomerModel
	 * @return
	 */
	@RequestMapping(value = "/saveCustomer", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EbCustomerModel> saveCustomer (@RequestBody EbCustomerModel ebCustomerModel) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		//调用service层处理业务逻辑
		ResponseData<EbCustomerModel> responseData = this.basicDataService.saveCustomer(ebCustomerModel);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 收发货方保存标准服务
	 * add by Jeffery.Zhang 2018年12月3日
	 * @param EbShipperModel
	 * @return
	 */
	@RequestMapping(value = "/saveShipper", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EbShipperModel> saveShipper (@RequestBody EbShipperModel ebShipperModel) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		//调用service层处理业务逻辑
		ResponseData<EbShipperModel> responseData = this.basicDataService.saveShipper(ebShipperModel);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
}
