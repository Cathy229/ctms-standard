package com.sinotrans.oms.eoorder.controller;

import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.Response;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;
import com.sinotrans.oms.eoorder.dto.EoConsignmentDto;
import com.sinotrans.oms.eoorder.dto.EoConsignmentModelDto;
import com.sinotrans.oms.eoorder.dto.EoConsignmentQueryDto;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.eoorder.dto.EocmAndAcceptDto;
import com.sinotrans.oms.eoorder.dto.SystemBulletinDto;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.model.EoConsignmentMaterielModel;
import com.sinotrans.oms.eoorder.model.EoConsignmentModel;
import com.sinotrans.oms.eoorder.model.EoEoib2EoimModel;
import com.sinotrans.oms.eoorder.model.EoEoob2EomjModel;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;
import com.sinotrans.oms.eoorder.model.EoOrderMaterielModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.eoorder.model.EoOrderPrecontainerModel;
import com.sinotrans.oms.eoorder.service.EoConsignmentService;
import com.sinotrans.oms.eoorder.service.EoOrderContainerService;
import com.sinotrans.oms.eoorder.service.EoOrderMaterielService;
import com.sinotrans.oms.eoorder.service.EoOrderPrecontainerService;
import com.sinotrans.oms.eoorder.service.EoOrderService;
import com.sinotrans.oms.fees.dto.EfBmsImModelDto;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;
import com.sinotrans.oms.fees.service.EfbfBusinessFeesService;
import com.sinotrans.oms.fees.service.efBusinessFeesSettlementService;


/**
 * controller层只作为和前台交互的接口，不处理业务逻辑，不与数据库交互
 * 2018年7月21日23:27:49
 * @author shoven
 *
 */
/**  

* <p>Title: EoOrderController</p>  

* <p>Description: </p>  

* @author shenlan  

* @date 2018年8月28日  

*/  
@RestController
@RequestMapping(value = "/eoOrderController")
public class EoOrderController {
	
	@Autowired
	private EoConsignmentService eoConsignmentService;//service层只做业务逻辑处理，不与DB交互
	@Autowired
	private EoOrderService eoOrderService;//订单service
	@Autowired
	private EoOrderMaterielService eoOrderMaterielService;//订单物料service
	@Autowired
	private EoOrderPrecontainerService oOrderPrecontainerService;//订单预配箱
	@Autowired
	private EoOrderContainerService eoOrderContainerService;//订单集装箱
	@Autowired
	private EfbfBusinessFeesService efbfBusinessFeesService;//订单费用
	@Autowired
	private efBusinessFeesSettlementService EfBusinessFeesSettlementService;//费用上传通用实现类
	@Autowired
	private EoOrderManager eoOrderManager;
	/**
	 * 订单保存标准服务
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	@RequestMapping(value = "/saveOrder", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> saveOrder (@RequestBody EoOrderDto eoOrderDto, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		//调用service层处理业务逻辑
		ResponseData<EoOrderDto> responseData = this.eoOrderService.saveOrder(eoOrderDto);
		return responseData;
	}
	
	/**
	 * 海运货代订单基本信息以及相关信息保存保存
	 * @author Shoven.Jiang  
	 * @date 2019年2月22日
	 * @param eoOrderDto
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/saveOrderByTypeI", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> saveOrderByTypeI (@RequestBody EoOrderDto eoOrderDto, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		//调用service层处理业务逻辑
		ResponseData<EoOrderDto> responseData = this.eoOrderService.saveOrderByTypeI(eoOrderDto);
		return responseData;
	}
	
	/**
	 * 批量订单保存标准服务
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDtoList
	 * @return
	 */
	@RequestMapping(value = "/batchSaveOrder", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<Map<Boolean, List<EoOrderDto>>> batchSaveOrder(@RequestParam(value = "eoOrderDto") List<EoOrderDto> eoOrderDtoList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		
		return this.eoOrderService.batchSaveOrder(eoOrderDtoList);
	}
	
	/**
	 * 单条订单删除
	 * add by shoven 2018年8月5日11:27:15
	 * @param eooorId
	 * @return
	 */
	@RequestMapping(value = "/deleteOrder", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData deleteOrder(@RequestParam(value = "eoorId") Long eoorId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
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
	@RequestMapping(value = "/batchDeleteOrder", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData batchDeleteOrder(@RequestParam(value = "eoorIds") Collection<Long> eoorIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
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
	@RequestMapping(value = "/getOrderById", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> getOrderById (@RequestParam(value = "eoorId") Long eoorId) {
		//调用service层处理业务逻辑
		@SuppressWarnings("unchecked")
		ResponseData<EoOrderDto> responseData = this.eoOrderService.getOrderById(eoorId);
		return responseData;
	}
	
	/**
	 * add by shoven 2018年7月21日23:24:34
	 * 测试使用，用于获取订单委托信息
	 * @param json
	 * @return
	 */
	@RequestMapping(value = "/eoConsignmentController", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoConsignmentQueryDto> eoConsignmentController(@RequestParam(value="json") String json) {
		//Response response = this.eoOrderServerRequest.getEoconsignmentList(json);
		@SuppressWarnings("unchecked")
		ResponseData<EoConsignmentQueryDto> responseData = (ResponseData<EoConsignmentQueryDto>) this.eoConsignmentService.findEoConsignmentByCondition(json, null);
		return responseData;
	}
	
	/**
	 * add by shoven 2018年7月21日23:24:34
	 * 测试使用，用于获取订单委托信息
	 * @param json
	 * @return
	 */
	@RequestMapping(value = "/eoConsignmentControllerPOST", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoConsignmentQueryDto> eoConsignmentControllerPost(@RequestBody String body) {
		//Response response = this.eoOrderServerRequest.getEoconsignmentList(json);
		@SuppressWarnings("unchecked")
		ResponseData<EoConsignmentQueryDto> responseData = (ResponseData<EoConsignmentQueryDto>) this.eoConsignmentService.findEoConsignmentByCondition(body.toString(), null);
		return responseData;
	}
	
	/**
	 * 保存委托受理表测试
	 * @param json
	 * @return
	 */
	@RequestMapping(value = "/saveEoConsignmentController", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public Response saveEoConsignmentController(@RequestParam String json, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		Response response = new Response();
		this.eoConsignmentService.saveEoConsignmentModel(json);
		response.setCode("Y");
		response.setMsg("保存成功");
		return response;
	}
	
	/**
	 * 订单列表查询
	 * @param json
	 * @return response
	 */
	@RequestMapping(value = "/queryEoOrderListController", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public Response queryEoOrderListController(@RequestParam Map<String, Object> conditionMap) {
		Response response = new Response();
		return response;
	}
	
	/**
	 * 订单执行
	 * @param json
	 * @return
	 */
	@RequestMapping(value = "/acceptEoOrderController", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public Response acceptEoOrderController(@RequestParam String json, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		Response response = new Response();
		
		return response;
	}
	
	/**
	 * 通过化工定制化服务调用的标准服务
	 * add by shoven 
	 * @param json
	 * @return
	 */
	@RequestMapping(value = "/findEoConsignmentByCondition", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoConsignmentQueryDto> findEoConsignmentByCondition (@RequestParam(value = "json") String json, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		@SuppressWarnings("unchecked")
		ResponseData<EoConsignmentQueryDto> responseData = (ResponseData<EoConsignmentQueryDto>) this.eoConsignmentService.findEoConsignmentByCondition(json, accessToken);
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
	 * 通过固定的查询条件来获取订单的查询结果
	 * add by shoven 2018年8月8日14:33:11
	 * @param conditionMap
	 * @return
	 */
	@RequestMapping(value = "/queryOrderFeeByCondition", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryOrderFeeByCondition(@RequestBody QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = this.eoOrderService.queryOrderFeeByCondition(queryInfo);
		return responseData;
	}
	
	/**
	 * 订单物料删除
	 * add by shoven 2018年8月5日11:27:15
	 * @param eoomId
	 * @return
	 */
	@RequestMapping(value = "/deleteOrderMaterial", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData deleteOrderMaterial(@RequestParam(value = "eoomId") Long eoomId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
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
	public ResponseData batchDeleteOrderMaterial(@RequestBody Collection<Long> eoomIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = new ResponseData();
		responseData = this.eoOrderMaterielService.batchDeleteOrderMaterial(eoomIds);
		return responseData;
	}
	
	/**
	 * 订单预配箱删除
	 * add by shoven 2018年8月5日11:27:15
	 * @param eosrId
	 * @return
	 */
	@RequestMapping(value = "/deleteOrderPrecontainer", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData deleteOrderPrecontainer(@RequestParam(value = "eosrId") Long eosrId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
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
	public ResponseData batchDeleteOrderPrecontainer(@RequestBody Collection<Long> eosrIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = new ResponseData();
		responseData = this.oOrderPrecontainerService.batchDeleteOrderPrecontainerRelationEoetTask(eosrIds);
		return responseData;
	}
	
	/**
	 * 订单集装箱删除
	 * add by shoven 2018年8月5日11:27:15
	 * @param eoocId
	 * @return
	 */
	@RequestMapping(value = "/deleteOrderContainer", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData deleteOrderContainer(@RequestParam(value = "eoocId") Long eoocId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
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
	public ResponseData batchDeleteOrderContainer(@RequestBody Collection<Long> eoocIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = new ResponseData();
		responseData = this.eoOrderContainerService.batchDeleteOrderContainer(eoocIds);
		return responseData;
	}
	
	/**
	 * 
	 * @DATE 2018年8月28日 下午6:47:27
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:订单费用批量删除(应收应付代收代付)
	 * @param efbfIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/batchDeleteOrderFee", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData batchDeleteOrderFee(@RequestBody Collection<Long> efbfIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = new ResponseData();
		responseData = this.efbfBusinessFeesService.batchDeteleBusinessFees(efbfIds);
		return responseData;
	}
	
	/**
	 * 
	 * @DATE 2018年9月4日 下午5:37:48
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:订单执行
	 * @param efbfIds
	 * @return
	 */
	@RequestMapping(value = "/executeOrder", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData executeOrder(@RequestParam(value="eoorId") Long eoorId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = this.eoOrderService.executeOrder(eoorId);
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
	@RequestMapping(value = "/getEfBmsImModeleEntityByEoorId", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<EfBmsImModelDto> getEfBmsImModeleEntityByEoorId(@RequestParam(value="eoorId") Long eoorId, @RequestParam(value="businessType") String businessType, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<EfBmsImModelDto> responseData = new ResponseData<EfBmsImModelDto>();
		//订单未执行 不能进行费用上传
		EoOrderModel eoOrderModel = this.eoOrderManager.get(eoorId);
		if (null != eoOrderModel) {
			if (EmptyUtils.isNotEmpty(eoOrderModel.getEoorStatus()) && Constants.SYS_STATUS_ADD.equals(eoOrderModel.getEoorStatus())) {
				responseData.setCode(Constants.NO);
				responseData.setMsg("订单状态为新增状态，不允许上传BMS！");
				return responseData;
			}
		}
		EfBmsImModelDto efBmsImModelDto = this.EfBusinessFeesSettlementService.generateEntity(eoorId, businessType);
		responseData.setData(efBmsImModelDto);
		responseData.setCode(Constants.YES);
		responseData.setMsg("统计值已成功收集");
		return responseData;
	}
	
	/**
	 * 统计值界面点击确认收集统计值信息上传到bms
	 * @author Shoven.Jiang  
	 * @date 2018年9月13日
	 * @param params
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/upLoadToBms",method =RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData upLoadToBms(@RequestBody EfBmsImModelDto efBmsImModelDto, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData response = new ResponseData();
		response = this.EfBusinessFeesSettlementService.upLoadToBms(efBmsImModelDto);
		return response;
	}
	
	/**
	 * 订单执行，根据项目执行计划执行生成任务
	 * @author Shoven.Jiang  
	 * @date 2018年10月12日
	 * @param eoorId
	 * @return
	 */
	@RequestMapping(value="/acceptOrder",method =RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> acceptOrder(@RequestBody Long eoorId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<EoOrderDto> responseData = new ResponseData<>();
		responseData = this.eoOrderService.acceptOrder(eoorId);
		return responseData;
	}
	/**
	 * add by simon 2018年8月8日13:24:34
	 * 保存订单-箱信息1
	 * @param EoOrderContainerList
	 * @return
	 */
	@RequestMapping(value="/saveOrderContainer" , method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoOrderContainerModel>> saveOrderContainer(@RequestBody List<EoOrderContainerModel> EoOrderContainerList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<List<EoOrderContainerModel>> saveOrderContainer = this.eoOrderService.saveOrderContainer(EoOrderContainerList);
		return saveOrderContainer;
	}
	
	/**
	 * add by simon 2018年8月8日13:24:34
	 * 保存订单-物料信息2
	 * @param params 
	 * @return
	 */
	@RequestMapping(value="/saveOrderMateriel", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoOrderMaterielModel>> saveOrderMateriel(@RequestBody List<EoOrderMaterielModel> eoOrderMaterielList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<List<EoOrderMaterielModel>> saveOrderMateriel = this.eoOrderService.saveOrderMateriel(eoOrderMaterielList);
		return saveOrderMateriel;
	}
	
	/**
	 * @author simon 2018年8月8日13:24:34
	 * 保存订单-预配箱信息3
	 * @param EoOrderContainerList
	 * @return
	 */
	@RequestMapping(value="/saveOrderPrecontainer" , method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoOrderPrecontainerModel>> saveOrderPrecontainer(@RequestBody List<EoOrderPrecontainerModel> EoOrderContainerList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<List<EoOrderPrecontainerModel>> saveOrderContainer = this.eoOrderService.saveOrderPrecontainer(EoOrderContainerList);
		return saveOrderContainer;
	}
	/**
	 * 订单保存标准服务
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	@RequestMapping(value = "/saveOrderBaseInfo", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> saveOrderBaseInfo (@RequestBody EoOrderDto eoOrderDto, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		//调用service层处理业务逻辑
		ResponseData<EoOrderDto> responseData = this.eoOrderService.saveOrderBaseInfo(eoOrderDto);
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
	public ResponseData orderTracking(@RequestBody Long eoorId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = new ResponseData<>();
		responseData = this.eoOrderService.orderTracking(eoorId);
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
	public ResponseData batchAcceptOrder(@RequestBody Long [] eoorIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = new ResponseData<>();
		responseData = this.eoOrderService.batchAcceptOrder(eoorIds);
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
	public ResponseData<EoOrderDto> getEoorAndEoeaByEoorId(@RequestBody Long eoorId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<EoOrderDto> responseData = this.eoOrderService.getEoorAndEoeaByEoorId(eoorId);
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
	public ResponseData<EoOrderDto> copyEoorAndEoeaByEoorId(@RequestBody Long eoorId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<EoOrderDto> responseData = new ResponseData<>();
		responseData = this.eoOrderService.copyEoorAndEoeaByEoorId(eoorId);
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
	public ResponseData updateOrderStatus (@RequestBody Long[] eoorIds,@RequestParam(value = "eoorStatus") String eoorStatus, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		//调用service层处理业务逻辑
		ResponseData responseData = this.eoOrderService.updateOrderStatus(eoorIds,eoorStatus);
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
	public ResponseData<List<EoOrderMaterielModel>> batchSaveOrderMaterial(@RequestBody List<EoOrderMaterielModel> eoOrderMaterielModels, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<List<EoOrderMaterielModel>> responseData = new ResponseData<>();
		responseData = this.eoOrderService.batchSaveOrderMaterial(eoOrderMaterielModels);
		return responseData;
	}
	
	/**
	 * @description 根据委托订单id查询委托订单信息:委托订单表+委托订单物料表list
	 * @author Simon.Guo  
	 * @date 2018年10月25日上午11:07:22
	 * @param eocsId
	 * @return
	 */
	@RequestMapping(value = "/getConsignmentById", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoConsignmentDto> getConsignmentById(@RequestBody Long eocsId) {
		ResponseData<EoConsignmentDto> responseData = new ResponseData<>();
		responseData = this.eoConsignmentService.getConsignmentById(eocsId);
		return responseData;
	}
	
	/**
	 * @description 批量删除委托订单物料
	 * @author Simon.Guo  
	 * @date 2018年10月25日上午11:08:35
	 * @param eosrIds
	 * @return
	 */
	@RequestMapping(value = "/batchDeleteConsignmentMaterial", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData batchDeleteConsignmentMaterial(@RequestBody Collection<Long> eosrIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = new ResponseData<>();
		responseData = this.eoConsignmentService.batchDeleteConsignmentMaterial(eosrIds);
		return responseData;
	}
	
	/**
	 * @description 批量保存委托订单物料
	 * @author Simon.Guo  
	 * @date 2018年10月25日上午11:09:14
	 * @param EoConsignmentModelList
	 * @return
	 */
	@RequestMapping(value="/saveConsignmentMateriel" , method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoConsignmentMaterielModel>> saveConsignmentMateriel(@RequestBody List<EoConsignmentMaterielModel> EoConsignmentModelList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<List<EoConsignmentMaterielModel>> responseData = this.eoConsignmentService.saveConsignmentMateriel(EoConsignmentModelList);
		return responseData;
	}
	/**
	 * @description 根据委托订单id委托下达生成订单
	 * @author Simon.Guo  
	 * @date 2018年10月25日上午11:07:22
	 * @param eocsId
	 * @return
	 */
	@RequestMapping(value = "/entrustOrder", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData entrustOrder(@RequestBody Long eocsId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = new ResponseData<>();
		responseData = this.eoConsignmentService.entrustOrder(eocsId);
		return responseData;
	}
	
	/**
	 * @description 保存委托订单
	 * @author Simon.Guo  
	 * @date 2018年10月25日上午11:09:14
	 * @param EoConsignmentModelList
	 * @return
	 */
	@RequestMapping(value="/saveConsignment" , method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoConsignmentModel> saveConsignment(@RequestBody EoConsignmentModelDto eoConsignmentModelDto, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<EoConsignmentModel> responseData = this.eoConsignmentService.saveConsignment(eoConsignmentModelDto);
		return responseData;
	}
	/**
	 * 
	 * @description 保存订单物料信息到订单表
	 * @author Simon.Guo  
	 * @date 2018年10月25日下午7:58:22
	 * @param eoConsignmentModelDto
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/saveEoomTotalInfo2Eoor" , method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData saveEoomTotalInfo2Eoor(@RequestBody Long eoorId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = this.eoOrderService.saveEoomTotalInfo2Eoor(eoorId);
		return responseData;
	}
	/**
	 * 
	 * @description 保存委托物料信息到委托表
	 * @author Simon.Guo  
	 * @date 2018年10月25日下午7:58:22
	 * @param eoConsignmentModelDto
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/saveEocmTotalInfo2Eocs" , method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData saveEocmTotalInfo2Eocs(@RequestBody Long eocsId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = this.eoConsignmentService.saveEocmTotalInfo2Eocs(eocsId);
		return responseData;
	}
	/**
	 * 通过固定的查询条件来获取委托订单的查询结果
	 * add by shoven 2018年8月8日14:33:11
	 * @param conditionMap
	 * @return
	 */
	@RequestMapping(value = "/queryConsignmentByCondition", method = RequestMethod.POST ,produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryConsignmentByCondition(@RequestBody QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		responseData = this.eoConsignmentService.queryConsignmentByCondition(queryInfo);
		return responseData;
	}
	
	/**
	 * @description 获取订单执行状态
	 * @author Simon.Guo  
	 * @date 2018年10月30日上午9:41:24
	 * @param eocsId
	 * @return
	 */
	@RequestMapping(value = "/getEoorIssuedStatus", method = RequestMethod.POST,produces = Constants.PRODUCES_CODE)
	public ResponseData getEoorIssuedStatus(@RequestBody Long eoorId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = new ResponseData<>();
		responseData = this.eoOrderService.getEoorIssuedStatus(eoorId);
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
	public ResponseData getReportAddressService(@RequestBody Map<String,Object> esrtCodeMap, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = new ResponseData<>();
		responseData = this.eoOrderService.getReportAddressService(esrtCodeMap);
		return responseData;
	}
	
	/**
	 * 订单物料查询（根据物料主键查询）
	 * @author Shoven.Jiang  
	 * @date 2018年11月1日
	 * @param eoomId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/getOrderMaterialById", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData getOrderMaterialById(@RequestParam(value = "eoomId") Long eoomId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
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
	public ResponseData<QueryData> queryOrderMaterialByCondition(@RequestBody QueryInfo queryInfo , @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<QueryData> responseData = this.eoOrderMaterielService.queryOrderMaterialByModel(queryInfo);
		return responseData;
	}
	
	/**
	 * @author simon 2018年8月8日13:24:34
	 * 保存订单-预配箱信息3
	 * @param EoOrderContainerList
	 * @return
	 */
	@RequestMapping(value="/batchSaveOrderPrecontainer" , method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoOrderPrecontainerModel>> batchSaveOrderPrecontainer(@RequestBody List<EoOrderPrecontainerModel> EoOrderContainerList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<List<EoOrderPrecontainerModel>> saveOrderContainer = this.eoOrderService.saveOrderPrecontainer(EoOrderContainerList);
		return saveOrderContainer;
	}
	
	/**
	 * 订单预配箱查询（根据预配箱主键查询）
	 * @author Shoven.Jiang  
	 * @date 2018年11月1日
	 * @param eosrId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/getOrderPrecontainerById", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData getOrderPrecontainerById(@RequestParam(value = "eosrId") Long eosrId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
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
	public ResponseData queryOrderPrecontainerByCondition(@RequestBody QueryInfo queryInfo , @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = new ResponseData();
		responseData = this.oOrderPrecontainerService.queryOrderPrecontainerByCondition(queryInfo);
		return responseData;
	}
	
	/**
	 * add by simon 2018年8月8日13:24:34
	 * 保存订单-箱信息1
	 * @param EoOrderContainerList
	 * @return
	 */
	@RequestMapping(value="/batchSaveOrderContainer" , method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoOrderContainerModel>> batchSaveOrderContainer(@RequestBody List<EoOrderContainerModel> EoOrderContainerList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<List<EoOrderContainerModel>> saveOrderContainer = this.eoOrderService.saveOrderContainer(EoOrderContainerList);
		saveOrderContainer.setCode("Y");
		saveOrderContainer.setMsg("保存成功");
		return saveOrderContainer;
	}
	
	/**
	 * 订单集装箱查询（根据集装箱主键查询）
	 * @author Shoven.Jiang  
	 * @date 2018年11月1日
	 * @param eoocId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/getOrderContainerById", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData getOrderContainerById(@RequestParam(value = "eoocId") Long eoocId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
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
	public ResponseData queryOrderContainerByCondition(@RequestBody QueryInfo queryInfo , @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = new ResponseData();
		responseData = this.eoOrderContainerService.queryOrderContainerByCondition(queryInfo);
		return responseData;
	}
	
	/**
	 * 订单保存标准服务
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	@RequestMapping(value = "/saveOrderAndMaterial", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> saveOrderAndMaterial (@RequestBody EoOrderDto eoOrderDto, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		//调用service层处理业务逻辑
		ResponseData<EoOrderDto> responseData = this.eoOrderService.saveOrder(eoOrderDto);
		return responseData;
	}
	
	/**
	 * 订单+订单预配箱保存
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	@RequestMapping(value = "/saveOrderAndPrecontainer", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> saveOrderAndPrecontainer (@RequestBody EoOrderDto eoOrderDto, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		//调用service层处理业务逻辑
		ResponseData<EoOrderDto> responseData = this.eoOrderService.saveOrder(eoOrderDto);
		return responseData;
	}
	
	/**
	 * 订单+物料+预配箱保存
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	@RequestMapping(value = "/saveOrderAndMaterialAndPrecontainer", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> saveOrderAndMaterialAndPrecontainer (@RequestBody EoOrderDto eoOrderDto, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		//调用service层处理业务逻辑
		ResponseData<EoOrderDto> responseData = this.eoOrderService.saveOrder(eoOrderDto);
		return responseData;
	}
	
	/**
	 * 订单+物料+预配箱查询（订单主键）
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	@RequestMapping(value = "/getOrderAndMaterialAndPrecontainerByEoorId", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> getOrderAndMaterialAndPrecontainerByEoorId (@RequestParam(value = "eoorId") Long eoorId) {
		//调用service层处理业务逻辑
		@SuppressWarnings("unchecked")
		ResponseData<EoOrderDto> responseData = this.eoOrderService.getOrderById(eoorId);
		return responseData;
	}
	
	/**
	 * 订单+物料+预配箱+费用查询（订单主键）
	 * @author Shoven.Jiang  
	 * @date 2018年11月1日
	 * @param eoorId
	 * @return
	 */
	@RequestMapping(value = "/getOrderAndMaterialAndPrecontainerAndFeesByEoorId", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> getOrderAndMaterialAndPrecontainerAndFeesByEoorId (@RequestParam(value = "eoorId") Long eoorId) {
		//调用service层处理业务逻辑
		@SuppressWarnings("unchecked")
		ResponseData<EoOrderDto> responseData = this.eoOrderService.getOrderAndMaterialAndPrecontainerAndFeesByEoorId(eoorId);
		return responseData;
	}
	
	/**
	 * @deprecated:箱和货物关系保存
	 * @author Colley.Bai  
	 * @date 2018年11月1日
	 * @param eoEoob2EomjModelList
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/saveConsignmentAndMaterial", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoEoob2EomjModel>> saveConsignmentAndMaterial(@RequestBody List<EoEoob2EomjModel> eoEoob2EomjModelList,
			 @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<List<EoEoob2EomjModel>> responseData = this.eoOrderService.saveConsignmentAndMaterial(eoEoob2EomjModelList);
		return responseData;
	}
	
	/**
	 * @deprecated:根据实装箱Id删除实装信息、业务箱和业务关系表信息
	 * @author Colley.Bai  
	 * @date 2018年11月3日
	 * @param eoocIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/batchDeleteOrderContainerAndEoejByEooc", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoOrderContainerModel>> batchDeleteOrderContainerAndEoejByEooc(@RequestBody List<Long> eoocIds,
			 @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<List<EoOrderContainerModel>> responseData = this.eoOrderService.batchDeleteOrderContainerAndEoejByEooc(eoocIds);
		return responseData;
	}
	
	/**
	 * @deprecated:根据集装箱id查询装箱物料信息
	 * @author Colley.Bai  
	 * @date 2018年11月3日
	 * @param eoocId
	 * @return
	 */
	@RequestMapping(value = "/getEoOrderMaterielAndEomjByEoocId", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> getEoOrderMaterielAndEomjByEoocId(@RequestBody Long eoocId){
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		responseData = this.eoOrderService.getEoOrderMaterielAndEomjByEoocId(eoocId);
		return responseData;
	}
	
	/**
	 * @deprecated:根据id删除装箱物料信息
	 * @author Colley.Bai  
	 * @date 2018年11月3日
	 * @param eoejIds
	 * @return
	 */
	@RequestMapping(value="/batchDeleteEoEoob2Eomj", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoEoob2EomjModel>> batchDeleteEoEoob2Eomj(@RequestBody List<Long> eoejIds,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<List<EoEoob2EomjModel>> responseData = new ResponseData<List<EoEoob2EomjModel>>();
		responseData = this.eoOrderService.batchDeleteEoEoob2Eomj(eoejIds);
		return responseData;
	}
	
	/**
	 * @description 根据委托订单id查询委托物料信息以及每条信息对应的已受理信息
	 * @author Simon.Guo  
	 * @date 2018年10月25日上午11:07:22
	 * @param eocsId
	 * @return
	 */
	@RequestMapping(value = "/getEocmsAndAcceptInfo", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EocmAndAcceptDto>> getEocmsAndAcceptInfo(@RequestBody Long eocsId) {
		ResponseData<List<EocmAndAcceptDto>> responseData = new ResponseData<>();
		responseData = this.eoConsignmentService.getEocmsAndAcceptInfo(eocsId);
		return responseData;
	}
	
	/**
	 * @deprecated:订单根据委托方匹配协议自动计费
	 * @author Colley.Bai  
	 * @date 2018年11月28日
	 * @param eoorId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/saveAutomaticChargingByEoorId", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EfBusinessFeesModel>> saveAutomaticChargingByEoorId(@RequestBody Long[] eoorIds,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		responseData = this.eoOrderService.saveAutomaticChargingByEoorId(eoorIds);
		return responseData;
	}
	/**
	 * @deprecated:获取当前用户下的销售人员默认取值
	 * @author simon  
	 * @date 2018年12月18日
	 * @param eoorId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/getBmsEbsmCode", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<Map<String, Object>> getBmsEbsmCode(@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<Map<String, Object>> responseData = new ResponseData<>();
		responseData = this.eoOrderService.getBmsEbsmCode();
		return responseData;
	}
	
	/**
	 * @deprecated:根据箱型均分物料
	 * @author Colley.Bai  
	 * @date 2018年12月22日
	 * @param eoOrderDto
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/saveOrderMaterielAndContainer", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> saveOrderMaterielAndContainer(@RequestBody EoOrderDto eoOrderDto,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<EoOrderDto> responseData = new ResponseData<>();
		responseData = this.eoOrderService.saveOrderMaterielAndContainer(eoOrderDto);
		return responseData;
	}
	
	/**
	 * @deprecated:删除集装箱下所有的信息（业务箱+业务箱和物料关系+业务物料+集装箱）
	 * @author Colley.Bai  
	 * @date 2019年1月10日
	 * @param eoOrderPrecontainerModelList
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/deleteEoOrderContainerAndMateriel", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoOrderPrecontainerModel>> deleteEoOrderContainerAndMateriel(@RequestBody List<EoOrderPrecontainerModel>  eoOrderPrecontainerModelList,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<List<EoOrderPrecontainerModel>> responseData = new ResponseData<>();
		this.eoOrderService.deleteEoOrderContainerAndMateriel(eoOrderPrecontainerModelList);
		return responseData;
	}
	
	/**
	 * @deprecated:预配箱同步集装箱信息
	 * @author Colley.Bai  
	 * @date 2019年1月10日
	 * @param eoOrderPrecontainerModelList
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/saveEoOrderContainer", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoOrderPrecontainerModel>> saveEoOrderContainer(@RequestBody List<EoOrderPrecontainerModel>  eoOrderPrecontainerModelList,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<List<EoOrderPrecontainerModel>> responseData = new ResponseData<>();
		this.eoOrderService.saveEoOrderContainer(eoOrderPrecontainerModelList);
		return responseData;
	}
	
	/**
	 * @deprecated:保存进口物料信息（同步到集装箱毛、件、体）
	 * @author Colley.Bai  
	 * @date 2019年2月27日
	 * @param eoOrderDto
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/saveOrderImportMateriel", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> saveOrderImportMateriel(@RequestBody EoOrderDto  eoOrderDto,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<EoOrderDto> responseData = new ResponseData<>();
		responseData = this.eoOrderService.saveOrderImportMateriel(eoOrderDto);
		return responseData;
	}
	
	/**
	 * @deprecated:批量保存集装箱信息
	 * @author Colley.Bai  
	 * @date 2019年2月28日
	 * @param eoOrderContainerModelList
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/batchSaveImportOrderContainer",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoOrderContainerModel>> batchSaveImportOrderContainer(@RequestBody List<EoOrderContainerModel> eoOrderContainerModelList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return this.eoOrderService.batchSaveImportOrderContainer(eoOrderContainerModelList);
	}
	
	/**
	 * @deprecated:根据集装箱id查询装箱物料信息(进口)
	 * @author Colley.Bai  
	 * @date 2019年2月28日
	 * @param eoocId
	 * @return
	 */
	@RequestMapping(value = "/getEoImportOrderMaterielAndEoeiByEoocId",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> getEoImportOrderMaterielAndEoeiByEoocId(@RequestBody Long eoocId){
		return this.eoOrderService.getEoImportOrderMaterielAndEoeiByEoocId(eoocId);
	}
	
	/**
	 * @deprecated:根据实装箱Id删除实装信息、业务箱和业务关系表信息（进口）
	 * @author Colley.Bai  
	 * @date 2019年2月28日
	 * @param eoocIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/batchDeleteImportOrderContainerAndEoeiByEooc",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoOrderContainerModel>> batchDeleteImportOrderContainerAndEoeiByEooc(@RequestBody List<Long> eoocIds,
			@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return this.eoOrderService.batchDeleteImportOrderContainerAndEoeiByEooc(eoocIds);
	}
	
	/**
	 * @deprecated:根据id删除装箱物料信息（进口）
	 * @author Colley.Bai  
	 * @date 2019年3月1日
	 * @param eoeiIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/batchDeleteImportOrderEoEoib2Eoim",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoEoib2EoimModel>> batchDeleteImportOrderEoEoib2Eoim(@RequestBody List<Long> eoeiIds,
			@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return this.eoOrderService.batchDeleteImportOrderEoEoib2Eoim(eoeiIds);
	}
	/**
	 * @deprecated:通过进口业务表装箱明细获取装箱物料信息
	 * @author Colley.Bai  
	 * @date 2019年3月25日
	 * @param eoeiId
	 * @return
	 */
	@RequestMapping(value = "/getEoOrderMaterielByEomiId",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderMaterielModel> getEoOrderMaterielByEomiId(@RequestBody Long eoeiId){
		return this.eoOrderService.getEoOrderMaterielByEomiId(eoeiId);
	}
	
	/**
	 * @deprecated:订单复制（进口）
	 * @author Colley.Bai  
	 * @date 2019年4月9日
	 * @param eoorId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/copyEoorAndEoeaEoomEoocByEoorId",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> copyEoorAndEoeaEoomEoocByEoorId(@RequestBody Long eoorId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return this.eoOrderService.copyEoorAndEoeaEoomEoocByEoorId(eoorId);
	}
	
	/**
	 * @deprecated:查询全部费用
	 * @author Colley.Bai  
	 * @date 2019年4月11日
	 * @param queryInfo
	 * @return
	 */
	@RequestMapping(value = "/queryOrderAllFeeByCondition",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryOrderAllFeeByCondition(@RequestBody QueryInfo queryInfo){
		return this.eoOrderService.queryOrderAllFeeByCondition(queryInfo);
	}
}
