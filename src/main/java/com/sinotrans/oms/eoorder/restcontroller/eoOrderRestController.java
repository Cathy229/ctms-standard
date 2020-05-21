package com.sinotrans.oms.eoorder.restcontroller;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.aop.IgnoreLoginController;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.dto.RequestBodyDto;
import com.sinotrans.oms.common.util.JsonUtils;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;
import com.sinotrans.oms.eoorder.model.EoOrderMaterielModel;
import com.sinotrans.oms.eoorder.model.EoOrderPrecontainerModel;
import com.sinotrans.oms.eoorder.service.EoOrderContainerService;
import com.sinotrans.oms.eoorder.service.EoOrderMaterielService;
import com.sinotrans.oms.eoorder.service.EoOrderPrecontainerService;
import com.sinotrans.oms.eoorder.service.EoOrderService;
import com.sinotrans.oms.eoorder.service.impl.EoOrderServiceImpl;
import com.sinotrans.oms.fees.dto.EfBmsImModelDto;
import com.sinotrans.oms.fees.service.efBusinessFeesSettlementService;

/**
 * Title: eoOrderRestController  
 * Description: 订单相关供外部调用的接口 
 * @author shenlan  
 * @date 2018年10月15日  
 * @version 1.0
 */
@RestController
@RequestMapping(value = "/rest/eoOrderRestController")
public class eoOrderRestController {
	

	@Autowired
	private EoOrderService eoOrderService;//订单service
	@Autowired
	private EoOrderMaterielService eoOrderMaterielService;//订单物料service
	@Autowired
	private EoOrderPrecontainerService oOrderPrecontainerService;//订单预配箱
	@Autowired
	private EoOrderContainerService eoOrderContainerService;//订单集装箱
	@Autowired
	private efBusinessFeesSettlementService EfBusinessFeesSettlementService;//费用上传通用实现类

	/**
	 * 订单保存标准服务
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	@RequestMapping(value = "/saveOrder", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> saveOrder (@RequestBody EoOrderDto eoOrderDto) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		//调用service层处理业务逻辑
		ResponseData<EoOrderDto> responseData = this.eoOrderService.saveOrder(eoOrderDto);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 批量订单保存标准服务
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDtoList
	 * @return
	 */
	@RequestMapping(value = "/batchSaveOrder", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<Map<Boolean, List<EoOrderDto>>> batchSaveOrder(@RequestBody List<EoOrderDto> eoOrderDtoList) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		//调用service层处理业务逻辑
		ResponseData<Map<Boolean, List<EoOrderDto>>> responseData = this.eoOrderService.batchSaveOrder(eoOrderDtoList);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 单条订单删除
	 * add by shoven 2018年8月5日11:27:15
	 * @param eooorId
	 * @return
	 */
	@RequestMapping(value = "/deleteOrder", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData deleteOrder(@RequestBody Long eoorId) {
		ResponseData responseData = new ResponseData();
		responseData = this.eoOrderService.deleteOrder(eoorId);
		return responseData;
	}
	/**
	 * 批量删除订单
	 * add by shoven 2018年8月5日11:27:15
	 * @param eoorIds
	 * @return
	 */
	@RequestMapping(value = "/batchDeleteOrder", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData batchDeleteOrder(@RequestBody Collection<Long> eoorIds) {
		ResponseData responseData = new ResponseData();
		responseData = this.eoOrderService.batchDeleteOrder(eoorIds);
		return responseData;
	}
	/**
	 * 通过eoorId获取该条订单下的信息
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	@RequestMapping(value = "/getOrderById", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> getOrderById (@RequestBody Long eoorId) {
		//调用service层处理业务逻辑
		@SuppressWarnings("unchecked")
		ResponseData<EoOrderDto> responseData = this.eoOrderService.getOrderById(eoorId);
		return responseData;
	}
	/**
	 * 通过固定的查询条件来获取订单的查询结果
	 * add by shoven 2018年8月8日14:33:11
	 * @param conditionMap
	 * @return
	 */
	@RequestMapping(value = "/queryOrderByCondition", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryOrderByCondition(@RequestBody QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = this.eoOrderService.queryOrderByCondition(queryInfo);
		return responseData;
	}
	/**
	 * 订单执行，根据项目执行计划执行生成任务
	 * @author Shoven.Jiang  
	 * @date 2018年10月12日
	 * @param eoorId
	 * @return
	 */
	@RequestMapping(value="/acceptOrder",method =RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> acceptOrder(@RequestBody Long eoorId) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆	
		ResponseData<EoOrderDto> responseData = new ResponseData<>();
		responseData = this.eoOrderService.acceptOrder(eoorId);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
		
	}
	/**
	 * 订单基本信息复制：只做订单表以及订单代理拓展表数据的复制
	 * @author Shoven.Jiang  
	 * @date 2018年10月17日
	 * @param eoorId
	 * @return
	 */
	@RequestMapping(value="/copyEoorAndEoeaByEoorId",method =RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> copyEoorAndEoeaByEoorId(@RequestBody Long eoorId) {
		ResponseData<EoOrderDto> responseData = new ResponseData<>();
		responseData = this.eoOrderService.copyEoorAndEoeaByEoorId(eoorId);
		return responseData;
	}
	/**
	 * 根据订单id查询出订单表和订单代理拓展表数据
	 * @author Shoven.Jiang  
	 * @date 2018年10月17日
	 * @param eoorId
	 * @return
	 */
	@RequestMapping(value="/getEoorAndEoeaByEoorId",method =RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> getEoorAndEoeaByEoorId(@RequestBody Long eoorId) {
		ResponseData<EoOrderDto> responseData = new ResponseData<>();
		responseData = this.eoOrderService.getEoorAndEoeaByEoorId(eoorId);
		return responseData;
	}
	/**
	 * 订单的批量执行
	 * @author Shoven.Jiang  
	 * @date 2018年10月17日
	 * @param eoorId
	 * @return
	 */
	@RequestMapping(value="/batchAcceptOrder",method =RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData batchAcceptOrder(@RequestBody Long [] eoorIds) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆	
		ResponseData responseData = new ResponseData<>();
		responseData = this.eoOrderService.batchAcceptOrder(eoorIds);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * @description 订单跟踪
	 * @author Simon.Guo  
	 * @date 2018年10月22日上午11:00:27
	 * @param eoorId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/orderTracking",method =RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData orderTracking(@RequestBody Long eoorId) {
		ResponseData responseData = new ResponseData<>();
		responseData = this.eoOrderService.orderTracking(eoorId);
		return responseData;
	}
	/**
	 * @description 订单状态更新(作废  恢复)
	 * @author Simon.Guo  
	 * @date 2018年10月17日下午5:12:22
	 * @param eoorId
	 * @return
	 */
	@RequestMapping(value = "/updateOrderStatus", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData updateOrderStatus (@RequestBody RequestBodyDto requestBodyDto) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		//调用service层处理业务逻辑
		ResponseData responseData = this.eoOrderService.updateOrderStatus(requestBodyDto.getEoorIds(),requestBodyDto.getEoorStatus());
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 订单物料批量保存
	 * @author Shoven.Jiang  
	 * @date 2018年10月19日
	 * @param eoOrderMaterielModels
	 * @return
	 */
	@RequestMapping(value = "/batchSaveOrderMaterial", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoOrderMaterielModel>> batchSaveOrderMaterial(@RequestBody List<EoOrderMaterielModel> eoOrderMaterielModels) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData<List<EoOrderMaterielModel>> responseData = new ResponseData<>();
		responseData = this.eoOrderService.batchSaveOrderMaterial(eoOrderMaterielModels);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 订单物料删除
	 * add by shoven 2018年8月5日11:27:15
	 * @param eoomId
	 * @return
	 */
	@RequestMapping(value = "/deleteOrderMaterial", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData deleteOrderMaterial(@RequestBody Long eoomId) {
		ResponseData responseData = new ResponseData();
		responseData = this.eoOrderMaterielService.deleteOrderMaterial(eoomId);
		return responseData;
	}
	/**
	 * 批量删除订单物料信息
	 * add by shoven 2018年8月5日11:27:15
	 * @param eoomIds
	 * @return
	 */
	@RequestMapping(value = "/batchDeleteOrderMaterial", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData batchDeleteOrderMaterial(@RequestBody Collection<Long> eoomIds) {
		ResponseData responseData = new ResponseData();
		responseData = this.eoOrderMaterielService.batchDeleteOrderMaterial(eoomIds);
		return responseData;
	}
	/**
	 * 订单物料查询（根据物料主键查询）	
	 * @param eoomId
	 * @return
	 */
	@RequestMapping(value = "/getOrderMaterialById", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData getOrderMaterialById(@RequestBody Long eoomId) {
		ResponseData responseData = new ResponseData();
		responseData = this.eoOrderMaterielService.getOrderMaterialById(eoomId);
		return responseData;
	}
	/**
	 * 订单物料查询（根据标准条件查询）
	 * @author Shoven.Jiang  
	 * @date 2018年11月1日
	 * @param condition
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/queryOrderMaterialByCondition", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryOrderMaterialByCondition(@RequestBody QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = this.eoOrderMaterielService.queryOrderMaterialByModel(queryInfo);
		return responseData;
	}
	/**
	 * 订单预配箱批量保存
	 * @author simon 2018年8月8日13:24:34
	 * 保存订单-预配箱信息3
	 * @param EoOrderContainerList
	 * @return
	 */
	@RequestMapping(value="/batchSaveOrderPrecontainer" , method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoOrderPrecontainerModel>> batchSaveOrderPrecontainer(@RequestBody List<EoOrderPrecontainerModel> EoOrderContainerList) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData<List<EoOrderPrecontainerModel>> saveOrderContainer = this.eoOrderService.saveOrderPrecontainer(EoOrderContainerList);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return saveOrderContainer;
	}
	/**
	 * 订单预配箱删除
	 * add by shoven 2018年8月5日11:27:15
	 * @param eosrId
	 * @return
	 */
	@RequestMapping(value = "/deleteOrderPrecontainer", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData deleteOrderPrecontainer(@RequestBody Long eosrId) {
		ResponseData responseData = new ResponseData();
		responseData = this.oOrderPrecontainerService.deleteOrderPrecontainer(eosrId);
		return responseData;
	}
	/**
	 * 订单预配箱批量删除
	 * add by shoven 2018年8月5日11:27:15
	 * @param eosrIds
	 * @return
	 */
	@RequestMapping(value = "/batchDeleteOrderPrecontainer", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData batchDeleteOrderPrecontainer(@RequestBody Collection<Long> eosrIds) {
		ResponseData responseData = new ResponseData();
		responseData = this.oOrderPrecontainerService.batchDeleteOrderPrecontainer(eosrIds);
		return responseData;
	}
	/**
	 * 订单预配箱查询（根据预配箱主键查询）
	 * @param eosrId
	 * @return
	 */
	@RequestMapping(value = "/getOrderPrecontainerById", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData getOrderPrecontainerById(@RequestBody Long eosrId) {
		ResponseData responseData = new ResponseData();
		responseData = this.oOrderPrecontainerService.getOrderPrecontainerById(eosrId);
		return responseData;
	}
	/**
	 * 订单预配箱查询（根据标准条件查询）
	 * @author Shoven.Jiang  
	 * @date 2018年11月1日
	 * @param condition
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/queryOrderPrecontainerByCondition", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData queryOrderPrecontainerByCondition(@RequestBody QueryInfo queryInfo) {
		ResponseData responseData = new ResponseData();
		responseData = this.oOrderPrecontainerService.queryOrderPrecontainerByCondition(queryInfo);
		return responseData;
	}
	/**
	 * 订单集装箱批量保存
	 * add by simon 2018年8月8日13:24:34
	 * 保存订单-箱信息1
	 * @param EoOrderContainerList
	 * @return
	 */
	@RequestMapping(value="/batchSaveOrderContainer" , method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoOrderContainerModel>> batchSaveOrderContainer(@RequestBody List<EoOrderContainerModel> EoOrderContainerList) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData<List<EoOrderContainerModel>> saveOrderContainer = this.eoOrderService.saveOrderContainer(EoOrderContainerList);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return saveOrderContainer;
	}
	/**
	 * 订单集装箱删除
	 * add by shoven 2018年8月5日11:27:15
	 * @param eoocId
	 * @return
	 */
	@RequestMapping(value = "/deleteOrderContainer", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData deleteOrderContainer(@RequestBody Long eoocId) {
		ResponseData responseData = new ResponseData();
		responseData = this.eoOrderContainerService.deleteOrderContainer(eoocId);
		return responseData;
	}
	/**
	 * 订单集装箱批量删除
	 * add by shoven 2018年8月5日11:27:15
	 * @param eoocIds
	 * @return
	 */
	@RequestMapping(value = "/batchDeleteOrderContainer", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData batchDeleteOrderContainer(@RequestBody Collection<Long> eoocIds) {
		ResponseData responseData = new ResponseData();
		responseData = this.eoOrderContainerService.batchDeleteOrderContainer(eoocIds);
		return responseData;
	}
	/**
	 * 订单集装箱查询（根据集装箱主键查询）
	 * @param eoocId
	 * @return
	 */
	@RequestMapping(value = "/getOrderContainerById", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData getOrderContainerById(@RequestBody Long eoocId) {
		ResponseData responseData = new ResponseData();
		responseData = this.eoOrderContainerService.getOrderContainerById(eoocId);
		return responseData;
	}
	/**
	 * 订单集装箱查询（根据标准条件查询）
	 * @author Shoven.Jiang  
	 * @date 2018年11月1日
	 * @param condition
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/queryOrderContainerByCondition", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData queryOrderContainerByCondition(@RequestBody QueryInfo queryInfo) {
		ResponseData responseData = new ResponseData();
		responseData = this.eoOrderContainerService.queryOrderContainerByCondition(queryInfo);
		return responseData;
	}
	/**
	 * 订单+订单物料保存
	 * 订单保存标准服务
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	@RequestMapping(value = "/saveOrderAndMaterial", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> saveOrderAndMaterial (@RequestBody EoOrderDto eoOrderDto) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		//调用service层处理业务逻辑
		ResponseData<EoOrderDto> responseData = this.eoOrderService.saveOrder(eoOrderDto);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 订单+订单预配箱保存
	 * 订单保存标准服务
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	@RequestMapping(value = "/saveOrderAndPrecontainer", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> saveOrderAndPrecontainer (@RequestBody EoOrderDto eoOrderDto) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		//调用service层处理业务逻辑
		ResponseData<EoOrderDto> responseData = this.eoOrderService.saveOrder(eoOrderDto);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 订单+物料+预配箱保存
	 * 订单保存标准服务
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	@RequestMapping(value = "/saveOrderAndMaterialAndPrecontainer", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> saveOrderAndMaterialAndPrecontainer (@RequestBody EoOrderDto eoOrderDto) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		//调用service层处理业务逻辑
		ResponseData<EoOrderDto> responseData = this.eoOrderService.saveOrder(eoOrderDto);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 订单+物料+预配箱查询（订单主键）
	 * 通过eoorId获取该条订单下的信息
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	@RequestMapping(value = "/getOrderAndMaterialAndPrecontainerByEoorId", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> getOrderAndMaterialAndPrecontainerByEoorId (@RequestBody Long eoorId) {
		//调用service层处理业务逻辑
		@SuppressWarnings("unchecked")
		ResponseData<EoOrderDto> responseData = this.eoOrderService.getOrderById(eoorId);
		return responseData;
	}
	/**
	 * 订单+物料+预配箱+费用查询（订单主键）
	 * 通过eoorId获取该条订单下的信息
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	@RequestMapping(value = "/getOrderAndMaterialAndPrecontainerAndFeesByEoorId", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> getOrderAndMaterialAndPrecontainerAndFeesByEoorId (@RequestBody Long eoorId) {
		//调用service层处理业务逻辑
		@SuppressWarnings("unchecked")
		ResponseData<EoOrderDto> responseData = this.eoOrderService.getOrderAndMaterialAndPrecontainerAndFeesByEoorId(eoorId);
		return responseData;
	}
	/**
	 * 统计值界面数据收集
	 * @author Shoven.Jiang  
	 * @date 2018年9月11日
	 * @param eoorId
	 * @param businessType
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/getEfBmsImModeleEntityByEoorId", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EfBmsImModelDto> getEfBmsImModeleEntityByEoorId(@RequestBody RequestBodyDto requestBodyDto) {
		ResponseData<EfBmsImModelDto> responseData = new ResponseData<EfBmsImModelDto>();
		EfBmsImModelDto efBmsImModelDto = this.EfBusinessFeesSettlementService.generateEntity(requestBodyDto.getEoorId(), requestBodyDto.getBusinessType());
		responseData.setData(efBmsImModelDto);
		responseData.setCode(Constants.YES);
		responseData.setMsg("统计值已成功收集");
		return responseData;
	}
	/**
	 * 报表打印查询报表
	 * @author Shoven.Jiang  
	 * @date 2018年10月31日
	 * @param esrtCode
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/getReportAddressService", method = RequestMethod.POST,produces = Constants.PRODUCES_CODE)
	public ResponseData getReportAddressService(@RequestBody Map<String,Object> esrtCodeMap) {
		ResponseData responseData = new ResponseData<>();
		responseData = this.eoOrderService.getReportAddressService(esrtCodeMap);
		return responseData;
	}
	/**
	 * 根据（公司id，项目id，运单号）查询订单
	 * add by jeffery.Zhang 2018年12月3日
	 * @param conditionMap
	 * @return
	 */
	@RequestMapping(value = "/queryOrderBySpecifyCondition", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryEoorIdByCondition(@RequestBody QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = this.eoOrderService.queryOrderBySpecifyCondition(queryInfo);
		return responseData;
	}
	
	public ResponseData<QueryData> test(LinkedHashMap queryInfo) {
		JsonUtils jsonUtil = new JsonUtils();
		QueryInfo queryInfo2 = jsonUtil.json2Bean(jsonUtil.map2Json(queryInfo), QueryInfo.class);
		EoOrderServiceImpl eoService = new EoOrderServiceImpl();
//		eoService.test();
		ResponseData<QueryData> responseData = this.eoOrderService.queryOrderBySpecifyCondition(queryInfo2);
		return responseData;
	}
}
