package com.sinotrans.oms.eoorder.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.Response;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.dto.RequestBodyDto;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.eoorder.dto.EocmAndAcceptDto;
import com.sinotrans.oms.eoorder.dto.SystemBulletinDto;
import com.sinotrans.oms.eoorder.model.EoEoib2EoimModel;
import com.sinotrans.oms.eoorder.model.EoEoob2EomjModel;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.eoorder.model.EoOrderMaterielModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.eoorder.model.EoOrderPrecontainerModel;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;

public interface EoOrderService {
	
	//保存订单信息
	void saveEoOrderExpandAgencyModel(EoOrderExpandAgencyModel formModel);
	
	/**
	 * 订单保存的方法，通过解析Dto中的数据进行保存
	 * @author Shoven 2018年8月4日23:01:39
	 * @param eoOrderDtoStr
	 * @return ResponseData<EoOrderDto>
	 */
	ResponseData<EoOrderDto> saveOrder(EoOrderDto eoOrderDto);
	
	/**
	 * 订单批量保存的方法，通过解析Dtos中的数据进行保存
	 * @author Shoven 2018年8月4日23:01:39
	 * @param eoOrderDtos
	 * @return ResponseData 
	 */
	ResponseData batchSaveOrder(List<EoOrderDto> eoOrderDtos);
	
	/**
	 * 通过订单ID删除该订单
	 * add by shoven 2018年8月5日11:32:58
	 * @param eoorId
	 * @return
	 */
	ResponseData deleteOrder(Long eoorId);
	
	/**
	 * 通过订单ID数组删除该订单
	 * add by shoven 2018年8月5日11:32:58
	 * @param eoorIds
	 * @return
	 */
	ResponseData batchDeleteOrder(Collection<Long> eoorIds);
	
	/**
	 * 通过eoorId获取该条订单下的信息
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	ResponseData<EoOrderDto> getOrderById(Long eoorId);
	
	/**
	 * 通过公司和项目ID组装oms首页需要展示的数据
	 * add by shoven
	 * @param conditionMap
	 * @return
	 */
	ResponseData<SystemBulletinDto> querySystemBulletinByCondition(Map<String, String> conditionMap);
	
	/**
	 * 通过固定的查询条件来获取订单的查询结果
	 * add by shoven 2018年8月8日14:33:11
	 * @param conditionMap
	 * @return
	 */
	ResponseData<QueryData> queryOrderByCondition(QueryInfo queryInfo);
	/**
	 * 通过固定的查询条件来获取订单的查询结果
	 * add by shoven 2018年8月8日14:33:11
	 * @param conditionMap
	 * @return
	 */
	ResponseData<QueryData> queryOrderFeeByCondition(QueryInfo queryInfo);
	
	/**
	 * 订单执行生成相应的任务
	 * @author Shoven.Jiang  
	 * @date 2018年8月28日
	 * @param eoorId
	 * @return
	 */
	ResponseData<EoOrderDto> acceptOrder(Long eoorId);
	
	/**
	 * 下达前的委托校验
	 * @author Shoven.Jiang  
	 * @date 2018年8月29日
	 * @param requestIds
	 * @param type
	 * @return
	 */
	Response beforsetIssued(Long[] requestIds, String type);
	
	/**
	 * 
	 * @DATE 2018年9月4日 下午5:50:10
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:订单执行
	 * @param eooId
	 * @return
	 */
	ResponseData executeOrder(Long eoorId);
	/**
	 * add by simon 2018年8月8日13:24:34
	 * 保存订单-箱信息1
	 * @param EoOrderContainerList
	 * @return
	 */
	ResponseData<List<EoOrderContainerModel>> saveOrderContainer(List<EoOrderContainerModel> eoOrderContainerList);
	/**
	 * add by simon 2018年8月8日13:24:34
	 * 保存订单-物料信息2
	 * @param params 
	 * @return
	 */
	ResponseData<List<EoOrderMaterielModel>> saveOrderMateriel(List<EoOrderMaterielModel> eoOrderMaterielList);
	/**
	 * @author simon 2018年8月8日13:24:34
	 * 保存订单-预配箱信息3
	 * @param EoOrderContainerList
	 * @return
	 */
	ResponseData<List<EoOrderPrecontainerModel>> saveOrderPrecontainer(List<EoOrderPrecontainerModel> eoOrderContainerList);
	/**
	 * 订单保存标准服务
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	ResponseData<EoOrderDto> saveOrderBaseInfo(EoOrderDto eoOrderDto);
	
	/**
	 * 订单状态跟踪-根据订单id获取URL
	 * @author Shoven.Jiang  
	 * @date 2018年10月14日
	 * @param eoorId
	 * @return
	 */
	ResponseData orderTracking(Long eoorId);
	
	/**
	 * 订单的批量执行，根据订单id数组
	 * @author Shoven.Jiang  
	 * @date 2018年10月17日
	 * @param eoorId
	 * @return
	 */
	ResponseData batchAcceptOrder(Long [] eoorIds);
	
	/**
	 * 根据订单id查询出订单表和订单代理拓展表数据
	 * @author Shoven.Jiang  
	 * @date 2018年10月17日
	 * @param eoorId
	 * @return
	 */
	ResponseData<EoOrderDto> getEoorAndEoeaByEoorId(Long eoorId);
	
	/**
	 * 订单基本信息复制：只做订单表以及订单代理拓展表数据的复制
	 * @author Shoven.Jiang  
	 * @date 2018年10月17日
	 * @param eoorId
	 * @return
	 */
	ResponseData<EoOrderDto> copyEoorAndEoeaByEoorId(Long eoorId);
	/**
	 * @description 订单状态更新(作废  恢复)
	 * @author Simon.Guo  
	 * @date 2018年10月17日下午5:12:22
	 * @param eoorId
	 * @return
	 */
	ResponseData updateOrderStatus(Long[] eoorIds, String eoorStatus);
	
	/**
	 * 订单物料批量保存
	 * @author Shoven.Jiang  
	 * @date 2018年10月19日
	 * @param eoOrderMaterielModels
	 * @return
	 */
	ResponseData<List<EoOrderMaterielModel>> batchSaveOrderMaterial(List<EoOrderMaterielModel> eoOrderMaterielModels);
	/**
	 * 
	 * @description 查询订单信息
	 * @author Simon.Guo  
	 * @date 2018年10月22日下午2:41:38
	 * @param eoorId
	 * @return
	 */
	ResponseData<EoOrderModel> getEoorByEoorId(Long eoorId);
	/**
	 * 
	 * @description 查询订单信息
	 * @author Simon.Guo  
	 * @date 2018年10月22日下午3:38:57
	 * @param eoorId
	 * @return
	 */
	ResponseData<EoOrderDto> getOrderAndMaterialAndPrecontainerAndFeesByEoorId(Long eoorId);
	/**
	 * @description 保存订单物料信息到订单表
	 * @author Simon.Guo  
	 * @date 2018年10月25日下午7:58:22
	 * @param eoConsignmentModelDto
	 * @param accessToken
	 * @return
	 */
	ResponseData saveEoomTotalInfo2Eoor(Long eoorId);

	List<EoOrderModel> findByCondition(List<FilterCondition> conditions);
	/**
	 * 
	 * @description 获取订单执行状态
	 * @author Simon.Guo  
	 * @date 2018年10月30日上午9:48:14
	 * @param eoorId
	 * @return
	 */
	ResponseData getEoorIssuedStatus(Long eoorId);
	
	/**
	 * 报表打印查询报表
	 * @author Shoven.Jiang  
	 * @date 2018年10月31日
	 * @param esrtCode
	 * @param accessToken
	 * @return
	 */
	ResponseData getReportAddressService(Map<String,Object> esrtCodeMap);

	/**
	 * @deprecated:箱和货物关系保存
	 * @author Colley.Bai  
	 * @date 2018年11月1日
	 * @param eoEoob2EomjModelList
	 * @return
	 */
	ResponseData<List<EoEoob2EomjModel>> saveConsignmentAndMaterial(List<EoEoob2EomjModel> eoEoob2EomjModelList);

	/**
	 * @deprecated:根据实装箱Id删除实装信息、业务箱和业务关系表信息
	 * @author Colley.Bai  
	 * @date 2018年11月3日
	 * @param eoocIds
	 * @return
	 */
	ResponseData<List<EoOrderContainerModel>> batchDeleteOrderContainerAndEoejByEooc(List<Long> eoocIds);

	/**
	 * @deprecated:根据集装箱id查询装箱物料信息
	 * @author Colley.Bai  
	 * @date 2018年11月3日
	 * @param eoocId
	 * @return
	 */
	ResponseData<QueryData> getEoOrderMaterielAndEomjByEoocId(Long eoocId);

	/**
	 * @deprecated:根据集装箱id查询装箱物料信息
	 * @author Colley.Bai  
	 * @date 2018年11月3日
	 * @param eoejIds
	 * @return
	 */
	ResponseData<List<EoEoob2EomjModel>> batchDeleteEoEoob2Eomj(List<Long> eoejIds);

	/**
	 * 订单执行完成之后，修改订单预配箱信息同步修改拖车任务
	 * @author Shoven.Jiang  
	 * @date 2018年11月12日
	 * @param eoOrderPrecontainerModels
	 * @return
	 */
	ResponseData<List<EoOrderPrecontainerModel>> updateEoetTaskByEosrModel(
			List<EoOrderPrecontainerModel> eoOrderPrecontainerModels);

	/**
     * 订单执行，调用存储过程，生成（BR）业务请求信息
     * @author Shoven.Jiang  
     * @date 2018年10月13日
     * @param eoOrderModels
     * @return
     */
	ResponseData buildBrByOrderId(List<EoOrderModel> eoOrderModels);

	/**
	 * @deprecated:订单根据委托方匹配协议自动计费
	 * @author Colley.Bai  
	 * @date 2018年11月28日
	 * @param eoorId
	 * @return
	 */
	ResponseData<List<EfBusinessFeesModel>> saveAutomaticChargingByEoorId(Long[] eoorIds);

	/**
	 * 订单复制清空订单表以及订单代理拓展表信息
	 * @author Shoven.Jiang  
	 * @date 2018年12月1日
	 * @param responseData
	 * @return
	 */
	ResponseData<EoOrderDto> initializationEoorAndEoeaModel(ResponseData<EoOrderDto> responseData);
	/**
	 * 根据（公司id，项目id，运单号）查询订单
	 * add by jeffery.Zhang 2018年12月3日
	 * @param conditionMap
	 * @return
	 */
	ResponseData<QueryData> queryOrderBySpecifyCondition(QueryInfo queryInfo);
	
	ResponseData<Map<String, Object>> getBmsEbsmCode();

	/**
	 * @deprecated:根据箱型均分物料
	 * @author Colley.Bai  
	 * @date 2018年12月22日
	 * @param eoOrderDto
	 * @return
	 */
	ResponseData<EoOrderDto> saveOrderMaterielAndContainer(EoOrderDto eoOrderDto);
	/**
	 * 订单基本信息复制：订单表,订单代理拓展表,订单预配箱,订单物料数据的复制
	 * @author simon 
	 * @date 2018年12月27日10:26:13
	 * @param eoorId
	 * @return
	 */
	ResponseData<EoOrderDto> copyEoorAndEoeaAndEosrAndEoomByEoorId(Long eoorId);
	
	/**
	 * @deprecated:删除集装箱下所有的信息（业务箱+业务箱和物料关系+业务物料+集装箱）
	 * @author Colley.Bai  
	 * @date 2019年1月2日
	 * @param eoOrderPrecontainerModelList
	 */
	void deleteEoOrderContainerAndMateriel(List<EoOrderPrecontainerModel>  eoOrderPrecontainerModelList);

	/**
	 * @deprecated:预配箱同步集装箱信息
	 * @author Colley.Bai  
	 * @date 2019年1月2日
	 * @param eoOrderPrecontainerModelList
	 * @return
	 */
	List<EoOrderContainerModel> saveEoOrderContainer(List<EoOrderPrecontainerModel>  eoOrderPrecontainerModelList);

	/**
	 * 订单保存的方法，通过解析Dto中的数据进行保存
	 * @author Shoven 2018年8月4日23:01:39
	 * @param eoOrderDto
	 * @return ResponseData<EoOrderDto>
	 */
	ResponseData<EoOrderDto> saveOrderByTypeI(EoOrderDto eoOrderDto);

	/**
	 * @deprecated:保存进口物料信息（同步到集装箱毛、件、体）
	 * @author Colley.Bai  
	 * @date 2019年2月27日
	 * @param eoOrderDto
	 * @return
	 */
	ResponseData<EoOrderDto> saveOrderImportMateriel(EoOrderDto eoOrderDto);

	/**
	 * @deprecated:批量保存集装箱信息
	 * @author Colley.Bai  
	 * @date 2019年2月28日
	 * @param eoOrderContainerModelList
	 * @return
	 */
	ResponseData<List<EoOrderContainerModel>> batchSaveImportOrderContainer(
			List<EoOrderContainerModel> eoOrderContainerModelList);

	/**
	 * @deprecated:根据集装箱id查询装箱物料信息(进口)
	 * @author Colley.Bai  
	 * @date 2019年2月28日
	 * @param eoocId
	 * @return
	 */
	ResponseData<QueryData> getEoImportOrderMaterielAndEoeiByEoocId(Long eoocId);

	/**
	 * @deprecated:根据实装箱Id删除实装信息、业务箱和业务关系表信息（进口）
	 * @author Colley.Bai  
	 * @date 2019年2月28日
	 * @param eoocIds
	 * @return
	 */
	ResponseData<List<EoOrderContainerModel>> batchDeleteImportOrderContainerAndEoeiByEooc(List<Long> eoocIds);

	/**
	 * @deprecated:根据id删除装箱物料信息（进口）
	 * @author Colley.Bai  
	 * @date 2019年3月1日
	 * @param eoeiIds
	 * @return
	 */
	ResponseData<List<EoEoib2EoimModel>> batchDeleteImportOrderEoEoib2Eoim(List<Long> eoeiIds);

	/**
	 * @deprecated:通过进口业务表装箱明细获取装箱物料信息
	 * @author Colley.Bai  
	 * @date 2019年3月25日
	 * @param eoeiId
	 * @return
	 */
	ResponseData<EoOrderMaterielModel> getEoOrderMaterielByEomiId(Long eoeiId);

	/**
	 * @deprecated:订单复制（进口）
	 * @author Colley.Bai  
	 * @date 2019年4月9日
	 * @param eoorId
	 * @return
	 */
	ResponseData<EoOrderDto> copyEoorAndEoeaEoomEoocByEoorId(Long eoorId);

	/**
	 * @deprecated:查询全部费用
	 * @author Colley.Bai  
	 * @date 2019年4月11日
	 * @param queryInfo
	 * @return
	 */
	ResponseData<QueryData> queryOrderAllFeeByCondition(QueryInfo queryInfo);
}
