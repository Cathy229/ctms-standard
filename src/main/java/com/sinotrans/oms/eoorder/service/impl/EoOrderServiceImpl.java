package com.sinotrans.oms.eoorder.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.xml.resolver.apps.resolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.core.aop.BaseAspect;
import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryField;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.controller.EoFreightImportController;
import com.sinotrans.oms.businessrequest.dto.EoRequestSeaborneDto;
import com.sinotrans.oms.businessrequest.manager.DpInTrackManager;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoddManager;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoetManager;
import com.sinotrans.oms.businessrequest.manager.EoFreightImportManager;
import com.sinotrans.oms.businessrequest.manager.EoFreightOmportManager;
import com.sinotrans.oms.businessrequest.manager.EoImportJoabBoxManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestAirborneManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestBookingManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestDeclarationDeputeManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestSeaborneManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestTrailerManager;
import com.sinotrans.oms.businessrequest.model.DpInTrackModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoddModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoFreightImportModel;
import com.sinotrans.oms.businessrequest.model.EoFreightOmportModel;
import com.sinotrans.oms.businessrequest.model.EoImportJoabBoxModel;
import com.sinotrans.oms.businessrequest.model.EoOutmportJoabBoxModel;
import com.sinotrans.oms.businessrequest.model.EoOutmportJoabMaterielModel;
import com.sinotrans.oms.businessrequest.model.EoRequestAirborneModel;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.businessrequest.model.EoRequestDeclarationDeputeModel;
import com.sinotrans.oms.businessrequest.model.EoRequestSeaborneModel;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.businessrequest.service.EoRequestTrailerService;
import com.sinotrans.oms.businessrule.manager.EsControlParamManager;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.Response;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.manager.ProcedureManager;
import com.sinotrans.oms.common.util.BASE64;
import com.sinotrans.oms.common.util.BeanUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.common.util.NumberUtil;
import com.sinotrans.oms.common.util.NumberUtils;
import com.sinotrans.oms.contract.manager.ElProtocolCostConManager;
import com.sinotrans.oms.contract.manager.ElProtocolCostFeelManager;
import com.sinotrans.oms.contract.manager.ElProtocolCostManager;
import com.sinotrans.oms.contract.manager.ElProtocolManager;
import com.sinotrans.oms.contract.model.ElProtocolCostConModel;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;
import com.sinotrans.oms.contract.model.ElProtocolCostModel;
import com.sinotrans.oms.contract.model.ElProtocolModel;
import com.sinotrans.oms.customerproject.manager.EbCustomerManager;
import com.sinotrans.oms.customerproject.manager.EbProjectPlanManager;
import com.sinotrans.oms.customerproject.model.EbCustomerModel;
import com.sinotrans.oms.customerproject.model.EbProjectPlanModel;
import com.sinotrans.oms.eoorder.dto.EoFreightOmportStatusQueryItem;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.eoorder.dto.EoOrderFreightDto;
import com.sinotrans.oms.eoorder.dto.EoOrderIssuedStatusDto;
import com.sinotrans.oms.eoorder.dto.EoOrderModelDto;
import com.sinotrans.oms.eoorder.dto.EocmAndAcceptDto;
import com.sinotrans.oms.eoorder.dto.SystemBulletinDto;
import com.sinotrans.oms.eoorder.manager.EoConsignmentManager;
import com.sinotrans.oms.eoorder.manager.EoConsignmentMaterielManager;
import com.sinotrans.oms.eoorder.manager.EoEoib2EoimManager;
import com.sinotrans.oms.eoorder.manager.EoEoob2EomjManager;
import com.sinotrans.oms.eoorder.manager.EoImportJoabMaterielManager;
import com.sinotrans.oms.eoorder.manager.EoOrderContainerManager;
import com.sinotrans.oms.eoorder.manager.EoOrderExpandAgencyManager;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.manager.EoOrderMaterielManager;
import com.sinotrans.oms.eoorder.manager.EoOrderPrecontainerManager;
import com.sinotrans.oms.eoorder.manager.EoOutmportJoabBoxManager;
import com.sinotrans.oms.eoorder.manager.EoOutmportJoabMaterielManager;
import com.sinotrans.oms.eoorder.manager.EsReportTemplateManager;
import com.sinotrans.oms.eoorder.model.EoConsignmentMaterielModel;
import com.sinotrans.oms.eoorder.model.EoConsignmentModel;
import com.sinotrans.oms.eoorder.model.EoEoib2EoimModel;
import com.sinotrans.oms.eoorder.model.EoEoob2EomjModel;
import com.sinotrans.oms.eoorder.model.EoImportJoabMaterielModel;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.eoorder.model.EoOrderMaterielModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.eoorder.model.EoOrderPrecontainerModel;
import com.sinotrans.oms.eoorder.model.EsReportTemplateModel;
import com.sinotrans.oms.eoorder.service.EoConsignmentService;
import com.sinotrans.oms.eoorder.service.EoOrderService;
import com.sinotrans.oms.fees.manager.EbExchangeRateManager;
import com.sinotrans.oms.fees.manager.EfBmsImManager;
import com.sinotrans.oms.fees.manager.EfBusinessFeesManager;
import com.sinotrans.oms.fees.model.EbExchangeRateModel;
import com.sinotrans.oms.fees.model.EfBmsImModel;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;
import com.sinotrans.oms.fees.service.EfbfBusinessFeesService;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.system.manager.EsCompanyManager;
import com.sinotrans.oms.system.manager.EsUserManager;
import com.sinotrans.oms.system.model.EsCompanyModel;
import com.sinotrans.oms.system.model.EsUserModel;

import oracle.net.aso.r;
@Service
public class EoOrderServiceImpl extends BaseAspect implements EoOrderService{
	
	@Autowired
	private EoOrderManager eoOrderManager;
	@Autowired
	private EoOrderExpandAgencyManager eoOrderExpandAgencyManager;
	@Autowired
	private EoRequestBookingManager eoRequestBookingManager;
	@Autowired
	private EoRequestTrailerManager eoRequestTrailerManager;
	@Autowired
	private EoRequestDeclarationDeputeManager eoRequestDeclarationDeputeManager;
	@Autowired
	private EfBusinessFeesManager efBusinessFeesManager;//费用
	@Autowired
	private ProcedureManager procedureManager;//调用存储过程执行
	@Autowired
	private EoRequestAirborneManager eoRequestAirborneManager;//空运任务
	@Autowired
	private EoRequestSeaborneManager eoRequestSeaborneManager;//海运任务
	@Autowired
	private EbProjectPlanManager ebProjectPlanManager;//项目执行计划
	@Autowired
	private EoEooc2EoetManager eoEooc2EoetManager;
	@Autowired
	private EbCustomerManager ebCustomerManager;//客户供应商表
	@Autowired
	private EoOrderMaterielManager eoOrderMaterielManager;//订单物料
	@Autowired
	private EoOrderPrecontainerManager eoOrderPrecontainerManager;
	@Autowired
	private EfBmsImManager efBmsImManager;//单票操作表
	@Autowired
	private EsControlParamManager esControlParamManager;
	@Autowired
	private EoConsignmentMaterielManager eoConsignmentMaterielManager;
	@Autowired
	private EoConsignmentManager eoConsignmentManager;
	@Autowired
	private EoConsignmentService eoConsignmentService;
	@Autowired
	private CommonQueryManager commonQueryManager;
	@Autowired
	private EoEoob2EomjManager eoEoob2EomjManager;//箱和物料关系
	@Autowired
	private EoOutmportJoabMaterielManager eoOutmportJoabMaterielManager;//物料
	@Autowired
	private EoOutmportJoabBoxManager eoOutmportJoabBoxManager;//箱
	@Autowired
	private EoOrderContainerManager eoOrderContainerManager;//实装箱
	@Autowired
	private EoEooc2EoddManager eoEooc2EoddManager;
	@Autowired
	private ElProtocolManager elProtocolManager;//协议
	@Autowired
	private ElProtocolCostManager elProtocolCostManager;//协议明细
	@Autowired
	private ElProtocolCostConManager elProtocolCostConManager;//协议分类
	@Autowired
	private ElProtocolCostFeelManager elProtocolCostFeelManager;//计算方式
	@Autowired
	private EfbfBusinessFeesService efbfBusinessFeesService;//费用
	@Autowired
	private EsCompanyManager esCompanyManager;//获取平台
	@Autowired 
	private EbExchangeRateManager ebExchangeRateManager;//汇率表手工维护
	@Autowired
	private DpInTrackManager dpInTrackManager;
	@Autowired
	private EsUserManager esUserManager;
	@Autowired
	private EoFreightOmportManager eoFreightOmportManager;
	@Autowired
	private EoImportJoabBoxManager eoImportJoabBoxManager;
	@Autowired
	private EoFreightImportManager eoFreightImportManager;
	@Autowired
	private EoImportJoabMaterielManager eoImportJoabMaterielManager;
	@Autowired
	private EoEoib2EoimManager eoEoib2EoimManager;
	@Autowired
	private EoRequestTrailerService eoRequestTrailerService;
	
	@Override
	public void saveEoOrderExpandAgencyModel(EoOrderExpandAgencyModel formModel) {
		// TODO Auto-generated method stub
		EoOrderModel eoOrdermodel = new EoOrderModel();
		this.eoOrderManager.saveOrder(eoOrdermodel);
	}


	/**
	 * 订单保存的方法，通过解析Dto中的数据进行保存
	 * @author Shoven 2018年8月4日23:01:39
	 * @param eoOrderDto
	 * @return ResponseData<EoOrderDto>
	 */
	@Override
	public ResponseData<EoOrderDto> saveOrder(EoOrderDto eoOrderDto) {
		ResponseData<EoOrderDto> saveOrderDto = this.eoOrderManager.saveOrderDto(eoOrderDto);
		return saveOrderDto;
	}


	/**
	 * 订单批量保存的方法，通过解析Dto中的数据进行保存
	 * @author Shoven 2018年8月4日23:01:39
	 * @param eoOrderDtos
	 * @return ResponseData
	 */
	@Override
	public ResponseData<Map<Boolean, List<EoOrderDto>>> batchSaveOrder(List<EoOrderDto> eoOrderDtos) {
		
		return this.eoOrderManager.batchSaveOrder(eoOrderDtos);
	}


	/**
	 * 通过订单ID删除该订单
	 * add by shoven 2018年8月5日11:32:58
	 * @param eoorId
	 * @return
	 */
	@Override
	public ResponseData deleteOrder(Long eoorId) {
		ResponseData eoOrderDtoData = new ResponseData();
		String errm = "";//收集订单删除的校验信息
		if (null != eoorId) {
			List<Long> eoorIdsList = new ArrayList<>();
			eoorIdsList.add(eoorId);
			Collection<Long> eoorIds = eoorIdsList;
			errm = this.checkOrderByDelete(eoorIds);
			if (EmptyUtils.isNotEmpty(errm)) {
				eoOrderDtoData.setCode(Constants.NO);
				eoOrderDtoData.setMsg("删除失败！" + errm);
				return eoOrderDtoData;
			}
			eoOrderDtoData.setCode(Constants.YES);
			eoOrderDtoData.setMsg("删除成功");
		} else {
			eoOrderDtoData.setCode(Constants.NO);
			eoOrderDtoData.setMsg("订单ID为空，不允许删除，请重试");
		}
		return eoOrderDtoData;
	}


	/**
	 * 通过订单ID数组删除该订单
	 * add by shoven 2018年8月5日11:32:58
	 * @param eoorIds
	 * @return
	 */
	@Override
	public ResponseData batchDeleteOrder(Collection<Long> eoorIds) {
		ResponseData eoOrderDtoData = new ResponseData();
		String errm = "";//收集订单删除的校验信息
		if (EmptyUtils.isNotEmpty(eoorIds)) {
			errm = this.checkOrderByDelete(eoorIds);
			if (EmptyUtils.isNotEmpty(errm)) {
				eoOrderDtoData.setCode(Constants.NO);
				eoOrderDtoData.setMsg("删除失败！" + errm);
				return eoOrderDtoData;
			}
//			this.eoOrderManager.deleteByPks(eoorIds);
//			eoOrderDtoData.setCode(Constants.YES);
//			eoOrderDtoData.setMsg("删除成功");
		} else {
			eoOrderDtoData.setCode(Constants.NO);
			eoOrderDtoData.setMsg("订单主键id不能为空，请重试");
		}
		return eoOrderDtoData;
	}


	/**
	 * 通过eoorId获取该条订单下的信息
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	@Override
	public ResponseData<EoOrderDto> getOrderById(Long eoorId) {
		ResponseData<EoOrderDto> eoResponseData = new ResponseData<EoOrderDto>();
		EoOrderDto eoOrderDto = this.eoOrderManager.getOrderById(eoorId);
		eoResponseData.setData(eoOrderDto);
		eoResponseData.setCode("Y");
		eoResponseData.setMsg("查询成功");
		return eoResponseData;
	}


	/**
	 * 通过eoorId获取该条订单下的信息
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	@Override
	public ResponseData<SystemBulletinDto> querySystemBulletinByCondition(Map<String, String> conditionMap) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 通过固定的查询条件来获取订单的查询结果
	 * @param conditionMap
	 * add by shoven 2018年8月8日14:33:21
	 * @return
	 */
	public ResponseData<QueryData> queryOrderByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		QueryData eoDeclarationDeputeList = eoOrderManager.queryOrderByCondition(queryInfo);
		responseData.setData(eoDeclarationDeputeList);
		return responseData;
	}
	/**
	 * 通过固定的查询条件来获取订单的查询结果
	 * @param conditionMap
	 * add by shoven 2018年8月8日14:33:21
	 * @return
	 */
	public ResponseData<QueryData> queryOrderFeeByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		QueryData eoDeclarationDeputeList = eoOrderManager.queryOrderFeeByCondition(queryInfo);
		responseData.setData(eoDeclarationDeputeList);
		return responseData;
	}


	@Override
	public ResponseData<EoOrderDto> acceptOrder(Long eoorId) {
		ResponseData<EoOrderDto> response = new ResponseData<EoOrderDto>();
		if (null != eoorId) {
			EoOrderModel eoOrderModel = this.eoOrderManager.get(eoorId);
			if (null == eoOrderModel.getEoorLoEbppId()) {
				response.setCode(Constants.NO);
				response.setMsg("订单未配置执行计划，不能进行受理!");
				return (ResponseData<EoOrderDto>) response;
			}
			if (!Constants.ORDER_ADD.equals(eoOrderModel.getEoorStatus())) {
				response.setCode(Constants.NO);
				response.setMsg("订单非新增状态，不能执行!");
				return (ResponseData<EoOrderDto>) response;
			}
			response = this.setOrderStatusAndPlanStauts(eoorId);
			if (Constants.NO.equals(response.getCode())) {
				return response;
			}
			if (Constants.YES.equals(response.getCode())) {//订单成功执行
				this.saveDpInTrack(eoorId);
				response.setMsg("执行成功");
				return response;
			} else {
				return response;
			}
		} else {
			response.setCode(Constants.NO);
			response.setMsg("订单主键为空，请重新执行");
			return (ResponseData<EoOrderDto>) response;
		}
	}
	
	/**
	 * 根据订单ID更改订单状态和订单执行状态
	 * @author Shoven.Jiang  
	 * @date 2018年8月28日
	 * @param eoorId
	 * @return
	 */
	private ResponseData<EoOrderDto> setOrderStatusAndPlanStauts(Long eoorId) {
		String errm = "";//收集错误信息
		ResponseData<EoOrderDto> response = new ResponseData<EoOrderDto>();
		//ResponseData responseData = new ResponseData();
		Long eoorIdValue = null;//用来校验该订单是否被委托过
		FilterCondition filterCondition = new FilterCondition();
		filterCondition.setFieldName("eoorId");
		filterCondition.setFieldValue(eoorId);
		filterCondition.setOperator("=");
		List<FilterCondition> eoorIdsCondition = new ArrayList<FilterCondition>();
		eoorIdsCondition.add(filterCondition);
		List<EoOrderModel> eoOrderModels = this.eoOrderManager.findByCondition(eoorIdsCondition);
		if (EmptyUtils.isNotEmpty(eoOrderModels)) {
			List<EoOrderModel> afterEoOrderModels = new ArrayList<>();
			//更改订单状态，受理成功
			EoOrderModel eoOrderModel = eoOrderModels.get(0);
			eoOrderModel.setEoorStatus(Constants.ORDER_STATUS_ACCEPT);
			eoOrderModel.setEoorLoPlanStatus(Constants.SYS_TASK_STATUS_DO);
			eoOrderModel = this.eoOrderManager.save(eoOrderModel);
			afterEoOrderModels.add(eoOrderModel);
			ResponseData responseData = this.buildBrByOrderId(afterEoOrderModels); // 调用存储过程生成BR信息
			errm = responseData.getMsg();
			if (EmptyUtils.isNotEmpty(errm) && !"操作成功".equals(errm)) {
				response.setCode(Constants.NO);
				response.setMsg(errm);
				return response;
			}
			//Long[] saveIds = (Long[]) responseData.getData();
			errm = this.createMsAndEvents(afterEoOrderModels);//执行生产里程碑和事件的存储过程
			//生成任务之后，更新存储过程没有更新的字段
			this.synchronizationEoRequestTaskByEoorId(eoOrderModel);
			if (EmptyUtils.isNotEmpty(errm)) {
				response.setCode(Constants.NO);
				response.setMsg(errm);
				return response;
			}
 		}
		response = this.procedureManager.buildToStatePool(eoorIdValue);
		if (Constants.NO.equals(response.getCode())) {
			return response;
		}
		response.setCode(Constants.YES);
		return response;
	}

	@Override
	public Response beforsetIssued(Long[] requestIds, String type) {
		Response response = new Response();
		if (null != requestIds) {
            for (Long requestId : requestIds) {
                Long eoorId = null;
                String str = null;
                Long eoetLoEbppId = null;
                if ("空运出".equals(type) || "空运进".equals(type)) {
                    List<FilterCondition> conditions = new ArrayList<FilterCondition>();
                    conditions.add(new FilterCondition("eoaiId",requestId,"="));
                    List<EoRequestAirborneModel> eoRequestAirborneModelList = this.eoRequestAirborneManager.findByCondition(conditions);
                    if (EmptyUtils.isNotEmpty(eoRequestAirborneModelList)) {
                    	eoorId = eoRequestAirborneModelList.get(0).getEoaiEoorId();
                    	str = eoRequestAirborneModelList.get(0).getEoaiNo();
                    }
                }
                if ("海运".equals(type)) {
                    List<FilterCondition> conditions = new ArrayList<FilterCondition>();
                    conditions.add(new FilterCondition("eoseId",requestId,"="));
                    List<EoRequestSeaborneModel> eoRequestSeaborneModelList = this.eoRequestSeaborneManager.findByCondition(conditions);
                    if (EmptyUtils.isNotEmpty(eoRequestSeaborneModelList)) {
                    	eoorId = eoRequestSeaborneModelList.get(0).getEoseEoorId();
                    	str = eoRequestSeaborneModelList.get(0).getEoseNo();
                    }
                }
                if ("拖车".equals(type)) {
                    List<FilterCondition> conditions = new ArrayList<FilterCondition>();
                    conditions.add(new FilterCondition("eoetId",requestId,"="));
                    List<EoRequestTrailerModel> eoRequestTrailerModelList = this.eoRequestTrailerManager.findByCondition(conditions);
                    if (EmptyUtils.isNotEmpty(eoRequestTrailerModelList)) {
                    	eoorId = eoRequestTrailerModelList.get(0).getEoetEoorId();
                    	str = eoRequestTrailerModelList.get(0).getEoetNo();
                    	eoetLoEbppId = eoRequestTrailerModelList.get(0).getEoetLoEbppId();
                    }
                }
                if ("委托报".equals(type)) {
                    List<FilterCondition> conditions = new ArrayList<FilterCondition>();
                    conditions.add(new FilterCondition("eoddId",requestId,"="));
                    List<EoRequestDeclarationDeputeModel> eoRequestDeclarationDeputeModelList = this.eoRequestDeclarationDeputeManager.findByCondition(conditions);
                    if (EmptyUtils.isNotEmpty(eoRequestDeclarationDeputeModelList)) {
                    	eoorId = eoRequestDeclarationDeputeModelList.get(0).getEoddEoorId();
                    	str = eoRequestDeclarationDeputeModelList.get(0).getEoddNo();
                    }
                }
                // 新增订舱
                if ("订舱".equals(type)) {
                    List<FilterCondition> conditions = new ArrayList<FilterCondition>();
                    conditions.add(new FilterCondition("eorbId",requestId,"="));
                    List<EoRequestBookingModel> eoRequestBookingModelList = this.eoRequestBookingManager.findByCondition(conditions);
                    if (EmptyUtils.isNotEmpty(eoRequestBookingModelList)) {
                    	eoorId = eoRequestBookingModelList.get(0).getEorbEoorId();
                    	str = eoRequestBookingModelList.get(0).getEorbNo();
                    }
                }
                List<FilterCondition> conditions = new ArrayList<FilterCondition>();
                conditions.add(new FilterCondition("eoorSource","5","="));
                conditions.add(new FilterCondition("eoorParentsOrderId",eoorId,"="));
                conditions.add(new FilterCondition("eoorInnerOrderId",requestId,"="));
                List<EoOrderModel> eoRequestBookingModelList = this.eoOrderManager.findByCondition(conditions);
                if (eoRequestBookingModelList.size() > 0) {
                    response.setCode(Constants.NO);
                    response.setMsg("请求编号为：" + str + "的记录已经委托过，无法下达");
                    return response;
                }
                if (eoetLoEbppId != null) {
                    EbProjectPlanModel ebProjectPlanModel = ebProjectPlanManager.get(eoetLoEbppId);
                    if (ebProjectPlanModel != null && Constants.SYS_STATUS_ENABLE.equals(ebProjectPlanModel.getEbppStatus())
                            && Constants.PROJECT_PLAN_TRAIN_SCHEDULING_NAME.equals(ebProjectPlanModel.getEbppPlanName())) {
                        // 校验是否存在集装箱
                        List<FilterCondition> condition = new ArrayList<FilterCondition>();
                        condition.add(new FilterCondition("eoorSource","5","="));
                        List<EoEooc2EoetModel> eoEooc2EoetModels = this.eoEooc2EoetManager.findByCondition(condition);
                        for (EoEooc2EoetModel eoet : eoEooc2EoetModels) {
                            if (EmptyUtils.isEmpty(eoet.getEootContainerNo())) {
                                response.setCode(Constants.NO);
                                response.setMsg("请求编号为：" + str + "的记录下集装箱信息的箱号为空，无法下达");
                                return response;
                            }
                        }
                    }
                }
            }
        }
		return response;
	}


	@Override
	public ResponseData executeOrder(Long eoorId) {
		
		ResponseData responseData = new ResponseData();
		
		if (eoorId == null) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单id不存在,重新操作");
			return responseData;
		}
		
		EoOrderModel eoOrderModel = this.eoOrderManager.get(eoorId);
		
		if (eoOrderModel == null) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单信息不存在");
			return responseData;
		}
		
		if (null == eoOrderModel.getEoorLoEbppId()) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单未配置执行计划，不能进行受理!");
			return  responseData;
		}
		if (!Constants.ORDER_ADD.equals(eoOrderModel.getEoorStatus())) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单非新增状态，不能执行!");
			return  responseData;
		}
		
		String excuteString = "pkg_test.SP_SUB_02LO_FREIGHT_COMMON";
        Map<String, Object> errMap = procedureManager.invokeEoOrderFreightSave(eoOrderModel, excuteString);
        Object errmObj = errMap.get(Constants.ERRM);
        if (errmObj != null) {
        	responseData.setCode(Constants.NO);
			responseData.setMsg(errmObj.toString());
			return responseData;
        }
      
        Map<String, Object> errResult = procedureManager.storedProcedure(eoOrderModel , "PKG_11_TO_STATEPOOL.SP_SAVE_DPOS_STATEPOOL");
          Object errObj = errResult.get(Constants.ERRM);
          if (errObj != null) {
        	responseData.setCode(Constants.NO);
  			responseData.setMsg(errmObj.toString());
  			return responseData;
          }
        this.getEorb(eoOrderModel);
        //修改订单状态及订单执行状态并保存
        eoOrderModel.setEoorStatus(Constants.ORDER_STATUS_ACCEPT);
        eoOrderModel.setEoorLoPlanStatus(Constants.TASK_STATUS_DONE);
        EoOrderModel afterSaveEoorModel = this.eoOrderManager.save(eoOrderModel);
        responseData.setData(afterSaveEoorModel);
        responseData.setMsg("执行成功");
        return responseData;
	}
	
	/*
     * 获取eorb的数据：配载人，电话，传真，email
     */
    public void getEorb(EoOrderModel eoOrderModel) {
    	Long eoorId = EmptyUtils.isEmpty(eoOrderModel.getEoorSubstr1())?null:Long.valueOf(eoOrderModel.getEoorSubstr1());
    	if(eoorId==null){
    		return;
    	}
    	List<FilterCondition> conditions = new ArrayList<FilterCondition>();
        conditions.add(new FilterCondition("eorbEoorId",eoorId,"="));
    	EoRequestBookingModel eorbModel = new EoRequestBookingModel();
    	List<EoRequestBookingModel> eoRequestBookingModels = eoRequestBookingManager.findByCondition(conditions );
         if (EmptyUtils.isNotEmpty(eoRequestBookingModels)) {
        	 eorbModel = eoRequestBookingModels.get(0);
        	 String eorbBookingAgentCode = eorbModel.getEorbBookingAgentCode();
        	 eoRequestBookingManager.getEsUserByEbcuNo(eorbBookingAgentCode, eoorId,"popType");
         }
    }
    
    /**
     * 得到货代请求
     */
    public ResponseData getOrderFreightById(Long eoeaId) {
    	
        //log.error("执行getOrderFreightById()方法开始...");
       // Long timeLong = System.currentTimeMillis();
    	ResponseData responseData = new ResponseData();
        if(null==eoeaId){
        	responseData.setCode(Constants.NO);
			responseData.setMsg("eoeaId 为空，不无法查询");
			return responseData;
        }
        UserDetails user = SessionContext.getUser();
        EoOrderFreightDto entity = new EoOrderFreightDto();
        EoOrderExpandAgencyModel eoeaModel = this.eoOrderExpandAgencyManager.get(eoeaId);
        // 海运
        EoRequestSeaborneDto eoseEntity = new EoRequestSeaborneDto();
        EoRequestSeaborneModel eoseModel = new EoRequestSeaborneModel();
        if (eoeaModel != null) {
        	List<FilterCondition> conditions = new ArrayList<FilterCondition>();
        	conditions.add(new FilterCondition("eoseEoorId",eoeaModel.getEoeaEoorId(),"="));
        	List<EoRequestSeaborneModel> eoseList = this.eoRequestSeaborneManager.findByCondition(conditions);
            if (eoseList != null && eoseList.size() > 0) {
                eoseModel = eoseList.get(0);
            }
            BeanUtils.copyProperties(eoseEntity, eoseModel);
            Long eoorId = eoeaModel.getEoeaEoorId();
            Map<String, Object> condition = new HashMap<String, Object>();
    		condition.put("eoorId", eoorId);//so号
    		List<EoFreightOmportStatusQueryItem> baseInfoItems = this.eoOrderManager.queryByCondition(condition);
            if (EmptyUtils.isNotEmpty(baseInfoItems)) {
                EoFreightOmportStatusQueryItem eoofItem = baseInfoItems.get(0);
                EoOrderModel eoorModel = new EoOrderModel();// 订单model
                // modify by marvin 2016-8-16
                // EoOrderExpandAgencyModel eoeaModel = new EoOrderExpandAgencyModel();//拓展表model
                BeanUtils.copyProperties(eoorModel, eoofItem);
                // BeanUtils.copyProperties(eoeaModel, eoofItem);

                // EbProjectPlanModel ebpp = this.dao.get(EbProjectPlanModel.class, eoorModel.getEoorLoEbppId());
                // eoeaModel.setRecVer(eoofItem.getEoeaRecVer());//修改版本号
                entity.setEoOrderModel(eoorModel);
                entity.setEoeaModel(eoeaModel);
                entity.setEoRequestSeaborneModel(eoseModel);
                entity.setEoddstatus(eoofItem.getEoddstatus());
                entity.setEoetstatus(eoofItem.getEoetstatus());
                entity.setEorbStatues(eoeaModel.getEoeaIsBooking());
                entity.setIscheck(eoofItem.getIscheck());
                // entity.setEomeCount(eoofItem.getEomeCount());
                entity.setEoomCount(eoofItem.getEoomCount());
                entity.setEoraId(eoofItem.getEoraId());
                // entity.setEbppPlanName(ebpp.getEbppPlanName());
                // entity.setEbppBbdType(ebpp.getEbppBbdType());
                // 增加显示客户代码对应名称的逻辑
                entity = this.getBmsCustomNameCn(entity, user);

            }
            // 海运物料
            // EoEoom2EoseModel eome=new EoEoom2EoseModel();
            // eome.setEomeEoseId(eoseId);
            // List<EoEoom2EoseModel> eomeList=this.eoEoom2EoseManager.findByExample(eome);
            // if(eomeList!=null&&eomeList.size()>0){
            // entity.setEomeModel(eomeList.get(0));
            // }
            
            List<FilterCondition> _conditions = new ArrayList<FilterCondition>();
        	_conditions.add(new FilterCondition("eoomEoorId",eoeaModel.getEoeaEoorId(),"="));
        	List<EoOrderMaterielModel> eoomList = this.eoOrderMaterielManager.findByCondition(_conditions);
            if (eoomList != null && eoomList.size() > 0) {
                entity.setEoomModel(eoomList.get(0));
            }
            entity.setEoRequestSeaborneModel(eoseModel);
            // 订单
            EoOrderModel eoorModel = this.eoOrderManager.get(eoorId);
            // 订单预配
            List<FilterCondition> conditions_eosr = new ArrayList<FilterCondition>();
            conditions_eosr.add(new FilterCondition("eosrEoorId",eoorId,"="));
            List<EoOrderPrecontainerModel> eosrList = this.eoOrderPrecontainerManager.findByCondition(conditions_eosr);
            
            List<FilterCondition> conditions_efbm = new ArrayList<FilterCondition>();
            conditions_efbm.add(new FilterCondition("efbmImId",eoorId,"="));
            // 查询单票操作表
            List<EfBmsImModel> efbmList = this.efBmsImManager.findByCondition(conditions_efbm);
            EfBmsImModel efbm = new EfBmsImModel();
            entity.setEfbmModel(efbm);
            if (EmptyUtils.isNotEmpty(efbmList)) {
                entity.setEfbmModel(efbmList.get(0));
            }

            entity.setEosrList(eosrList);
            entity.setEoOrderModel(eoorModel);

            responseData.setCode(Constants.YES);
			responseData.setData(entity);
        } else {
        	responseData.setCode(Constants.NO);
        }
        //log.error("执行getOrderFreightById()方法结束...，耗时 " + (System.currentTimeMillis() - timeLong) + " ms");
        return responseData;
    }
    
    /**
     * 为附属信息客户代码界面显示客户名称
     * 
     * @param entity
     * @return
     */
    private EoOrderFreightDto getBmsCustomNameCn(EoOrderFreightDto entity, UserDetails user) {

        if (entity == null) {
            return entity;
        }
        List<FilterCondition> conditions = new ArrayList<FilterCondition>();
    	conditions.add(new FilterCondition("ebcuEscoId",Long.valueOf(user.getOrgId()),"="));
        if (entity.getEoOrderModel() != null) {
        	conditions.add(new FilterCondition("ebcuCustomerNo",entity.getEoOrderModel().getEoorBmsAEbcuCustomerNo(),"="));
        }
        List<EbCustomerModel> customerModelList = this.ebCustomerManager.findByCondition(conditions);
        if (customerModelList != null && customerModelList.size() > 0) {
            entity.setEoorBmsAEbcuCustomerName(customerModelList.get(0).getEbcuNameCn());
        }
        return entity;
    }
    
    /**
     * 订单执行，调用存储过程，生成（BR）业务请求信息
     * @author Shoven.Jiang  
     * @date 2018年10月13日
     * @param eoOrderModels
     * @return
     */
    @Override
    public ResponseData buildBrByOrderId(List<EoOrderModel> eoOrderModels) {
    	ResponseData responseData = new ResponseData();
    	Long[] saveIds = new Long[eoOrderModels.size()];
    	String errm = "";//收集执行过程的错误信息
    	for (int j = 0; j < eoOrderModels.size(); j++) {
    		EoOrderModel eoOrderModel = eoOrderModels.get(0);
    		Long eoorLoEbppId = eoOrderModel.getEoorLoEbppId();
    		if (null == eoorLoEbppId) {
    			responseData.setCode(Constants.NO);
    			responseData.setMsg("系统订单号：" + eoOrderModel.getEoorOrderNo() + " 所对应的项目执行计划为空，请维护！");
    			return responseData;
    		}
    		EbProjectPlanModel ebProjectPlanModel = this.ebProjectPlanManager.get(eoorLoEbppId);
    		if (null == ebProjectPlanModel) {
    			responseData.setCode(Constants.NO);
    			responseData.setMsg("系统订单号：" + eoOrderModel.getEoorOrderNo() + " 所对应的项目执行计划为空，请维护！");
    			return responseData;
    		}
    		String ebppStatus = ebProjectPlanModel.getEbppStatus();
    		if (!Constants.SYS_STATUS_ENABLE.equals(ebppStatus)) {
    			responseData.setCode(Constants.NO);
    			responseData.setMsg("系统订单号：" + eoOrderModel.getEoorOrderNo() + " 所对应的项目执行计划不是可用状态，请查看！");
    			return responseData;
    		}
    		//调用项目执行计划生成BR信息
    		errm += this.procedureManager.acceptOrder(ebProjectPlanModel, eoOrderModel);
    		saveIds[j] = eoOrderModel.getEoorId();
    	}
    	if (EmptyUtils.isNotEmpty(errm)) {
    		responseData.setCode(Constants.NO);
    		responseData.setMsg(errm);
    		return responseData;
    	}
    	responseData.setCode(Constants.YES);
    	responseData.setData(saveIds);
    	return responseData;
    }
    
    /**
     * 执行生产里程碑和事件的存储过程
     * @author Shoven.Jiang  
     * @date 2018年10月13日
     * @param afterEoOrderModels
     */
    private String createMsAndEvents(List<EoOrderModel> afterEoOrderModels) {
    	ResponseData responseData = new ResponseData();
    	String errm = "";
    	for (int i = 0; i < afterEoOrderModels.size(); i++) {
            EoOrderModel eoOrderModel = afterEoOrderModels.get(i);
            Long loEbppId = eoOrderModel.getEoorLoEbppId();
            EbProjectPlanModel ebProjectPlanModel = ebProjectPlanManager.get(loEbppId);
            if (null != ebProjectPlanModel) {
                try {
                	responseData = this.procedureManager.execEvents(ebProjectPlanModel, new Date(), eoOrderModel.getEoorId());
                    if (Constants.NO.equals(responseData.getCode())) {
                    	errm += errm;
                    }
                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    	return errm;
	}


	@Override
	public ResponseData<List<EoOrderContainerModel>> saveOrderContainer(
			List<EoOrderContainerModel> eoOrderContainerList) {
		ResponseData<List<EoOrderContainerModel>> responseData = new ResponseData<>();
		//订单集装箱的保存由原来调用订单保存的大方法修改为只保存集装箱信息
		if (EmptyUtils.isNotEmpty(eoOrderContainerList)) {
			List<EoOrderContainerModel> eoOrderContainerModels = this.eoOrderContainerManager.saveAll(eoOrderContainerList);
			responseData.setCode(Constants.YES);
			responseData.setMsg("保存成功");
			responseData.setData(eoOrderContainerModels);
			return responseData;
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("未查询到需要保存的数据，请检查！");
			responseData.setData(eoOrderContainerList);
			return responseData;
		}
//		EoOrderDto eoOrderDto = new EoOrderDto();
//		eoOrderDto.setEoOrderContainerModelList(eoOrderContainerList);
//		ResponseData<EoOrderDto> saveOrderDto = this.eoOrderManager.saveOrderDto(eoOrderDto);
//		responseData.setCode(saveOrderDto.getCode());
//		responseData.setMsg(saveOrderDto.getMsg());
//		responseData.setData(saveOrderDto.getData().getEoOrderContainerModelList());
//		return responseData;
	}


	@Override
	public ResponseData<List<EoOrderMaterielModel>> saveOrderMateriel(List<EoOrderMaterielModel> eoOrderMaterielList) {
		ResponseData<List<EoOrderMaterielModel>> responseData = new ResponseData<>();
		List<EoConsignmentMaterielModel> eocms = new ArrayList<>();
		for (EoOrderMaterielModel eoomModel : eoOrderMaterielList) {
			EoOrderMaterielModel eoom = null;;
			if (eoomModel.getEoomId() != null) {
				eoom = this.eoOrderMaterielManager.get(eoomModel.getEoomId());
			}
			if (eoom != null) {
				//判断物料对应订单是否为委托订单
				Long eoorId = eoomModel.getEoomEoorId();
				if (eoorId != null) {
					EoOrderModel eoor = this.eoOrderManager.get(eoorId);
					Long eocsId = eoor.getEoorEocsId();
					if (eocsId != null) {
						//1.委托物料下达完成,不可编辑直接返回
						EoConsignmentModel eocsModel = this.eoConsignmentManager.get(eocsId);
						/*if (eocsModel != null && Constants.YES.equals(eocsModel.getEocsIsIssuedEnd())) {
							responseData.setCode(Constants.NO);
							responseData.setMsg("委托物料已下达完成,无法操作!");
							return responseData;
						}*/
						//当订单物料是增加,先判断增加量是否小于等于委托量
						Double quantity = eoomModel.getEoomQuantity() - eoom.getEoomQuantity();
						Double grossWeight = eoomModel.getEoomGrossWeight() - eoom.getEoomGrossWeight();
						Double netWeight = eoomModel.getEoomNetWeight() - eoom.getEoomNetWeight();
						Double volume = eoomModel.getEoomVolume() - eoom.getEoomVolume();
						
						//判断变化量同时增加或减少或相等
						if (quantity == 0D && grossWeight == 0D && netWeight == 0D && volume == 0D) {
							/*responseData.setCode(Constants.NO);
							responseData.setMsg("保存成功!");
							return responseData;*/
						}else if (quantity > 0D && grossWeight > 0D && netWeight > 0D && volume > 0D) {
							List<Double> eocsTotals = this.eoConsignmentService.getEocsTotalInfo(eocsId, eoomModel.getEoomMaterialNo());
							List<Double> eoorTotals = this.eoConsignmentService.getEoorTotalInfo(eocsId, eoomModel.getEoomMaterialNo());
							
							Double quantity_r = NumberUtil.doubleSub(eocsTotals.get(0), eoorTotals.get(0));
							Double grossWeight_r = NumberUtil.doubleSub(eocsTotals.get(1), eoorTotals.get(1));
							Double netWeight_r = NumberUtil.doubleSub(eocsTotals.get(2), eoorTotals.get(2));
							Double volume_r = NumberUtil.doubleSub(eocsTotals.get(3), eoorTotals.get(3));
							
							if (NumberUtil.doubleSub(quantity_r, quantity) == 0D 
									&& NumberUtil.doubleSub(grossWeight_r, grossWeight) == 0D
									&& NumberUtil.doubleSub(netWeight_r, netWeight) == 0D
									&& NumberUtil.doubleSub(volume_r, volume) == 0D) {
								eocsModel.setEocsIsIssuedEnd(Constants.YES);
								this.eoConsignmentManager.save(eocsModel);
							}else if (NumberUtil.doubleSub(quantity_r, quantity) < 0D
									&& NumberUtil.doubleSub(grossWeight_r, grossWeight) < 0D
									&& NumberUtil.doubleSub(netWeight_r, netWeight) < 0D
									&& NumberUtil.doubleSub(volume_r, volume) < 0D) {
								responseData.setCode(Constants.NO);
								responseData.setMsg("订单物料对应委托物料剩余量不够下达,无法操作!");
								return responseData;
							}
						}else if ((quantity < 0D && grossWeight < 0D && netWeight < 0D && volume < 0D) && eocsModel != null && Constants.YES.equals(eocsModel.getEocsIsIssuedEnd())){
							responseData.setCode(Constants.NO);
							responseData.setMsg("订单物料修改有误!");
							return responseData;
						}else if (quantity < 0D && grossWeight < 0D && netWeight < 0D && volume < 0D){
							
						}else{
							responseData.setCode(Constants.NO);
							responseData.setMsg("订单物料修改有误!");
							return responseData;
						}
						
						/*List<FilterCondition> conditions = new ArrayList<>();
						conditions.add(new FilterCondition("eocmEocsId",eocsId,"="));
						List<EoConsignmentMaterielModel> eocmList = this.eoConsignmentMaterielManager.findByCondition(conditions );
						if (quantity > 0D && grossWeight > 0D && netWeight > 0D && volume > 0D) {
							//校验数据
							for (EoConsignmentMaterielModel eocmModel : eocmList) {
								if (eocmModel.getEocmMaterialNo().equals(eoomModel.getEoomMaterialNo())) {
									if (eocmModel.getEocmQuantity() < quantity || eocmModel.getEocmGrossWeight() < grossWeight 
											|| eocmModel.getEocmNetWeight() < netWeight || eocmModel.getEocmVolume() < volume) {
										String msg = eocmModel.getEocmQuantity() < quantity ? "增加件数大于委托物料件数,":"";
										msg += eocmModel.getEocmGrossWeight() < grossWeight ? "增加毛重大于委托物料毛重,":"";
										msg += eocmModel.getEocmNetWeight() < netWeight ? "增加净重大于委托物料净重,":"";
										msg += eocmModel.getEocmVolume() < volume ? "增加体积大于委托物料体积,":"";
										msg = msg.substring(0, msg.length()-1);
										
										responseData.setCode(Constants.NO);
										responseData.setMsg("订单物料信息保存失败:物料名称:"+eoom.getEoomEbmaNameEn()+"("+msg+")");
										return responseData;
									}
								}
							}
						}
						for (EoConsignmentMaterielModel eocmModel : eocmList) {
							if (eocmModel.getEocmMaterialNo().equals(eoomModel.getEoomMaterialNo())) {
								eocmModel.setEocmQuantity(eocmModel.getEocmQuantity()- quantity);
								eocmModel.setEocmGrossWeight(eocmModel.getEocmGrossWeight()- grossWeight);
								eocmModel.setEocmNetWeight(eocmModel.getEocmNetWeight()- netWeight);
								eocmModel.setEocmVolume(eocmModel.getEocmVolume()- volume);
								eocms.add(eocmModel);
							}
						}*/
					}
				}
			}
		}
		List<EoOrderMaterielModel> eoomList = this.eoOrderMaterielManager.saveAll(eoOrderMaterielList);
		if (eocms.size() > 0) {
			this.eoConsignmentMaterielManager.saveAll(eocms);
		}
		responseData.setCode(Constants.YES);
		responseData.setMsg("订单物料信息保存成功");
		responseData.setData(eoomList);
		return responseData;
	}


	@Override
	public ResponseData<List<EoOrderPrecontainerModel>> saveOrderPrecontainer(
			List<EoOrderPrecontainerModel> eoOrderContainerList) {
		EoOrderDto eoOrderDto = new EoOrderDto();
		eoOrderDto.setEoOrderPrecontainerModelList(eoOrderContainerList);
		//订单执行完成之后，修改订单预配箱信息同步修改拖车任务
//		ResponseData<List<EoOrderPrecontainerModel>> checkResponseData = this.updateEoetTaskByEosrModel(eoOrderContainerList);
//		if (Constants.NO.equals(checkResponseData.getCode())) {
//			return checkResponseData;
//		}
		ResponseData<EoOrderDto> saveOrderDto = this.eoOrderPrecontainerManager.saveOrderPrecontainer(eoOrderDto);//this.eoOrderManager.saveOrderDto(eoOrderDto);
		
		if (EmptyUtils.isNotEmpty(saveOrderDto.getData().getEoOrderPrecontainerModelList())) {
			EoOrderModel eoOrderModel = eoOrderManager.get(saveOrderDto.getData().getEoOrderPrecontainerModelList().get(0).getEosrEoorId());
			if (Constants.SYS_STATUS_ADD.equals(eoOrderModel.getEoorStatus())) {
				this.deleteEoOrderContainerAndMateriel(saveOrderDto.getData().getEoOrderPrecontainerModelList());
				this.saveEoOrderContainer(saveOrderDto.getData().getEoOrderPrecontainerModelList());
			}
		}
		
		
		ResponseData<List<EoOrderPrecontainerModel>> responseData = new ResponseData<>();
		responseData.setCode(saveOrderDto.getCode());
		responseData.setMsg(saveOrderDto.getMsg());
//		if (Constants.YES_CHINESE.equals(checkResponseData.getCode())) {
//			EoOrderModel eoOrderModel = this.eoOrderManager.get(eoOrderContainerList.get(0).getEosrEoorId());
//			List<EoOrderModel> afterEoOrderModels = new ArrayList<>();
//			afterEoOrderModels.add(eoOrderModel);
//			responseData = this.buildBrByOrderId(afterEoOrderModels); // 调用存储过程生成BR信息
//	        if (Constants.NO.equals(responseData)) {
//	        	responseData.setCode(Constants.NO);
//	    		responseData.setData(saveOrderDto.getData().getEoOrderPrecontainerModelList());
//				responseData.setMsg(responseData.getMsg());
//				return responseData;
//	        }
//		}
		responseData.setData(saveOrderDto.getData().getEoOrderPrecontainerModelList());
		return responseData;
	}
	
	/**
	 * @deprecated:预配箱同步集装箱信息
	 * @author Colley.Bai  
	 * @date 2019年1月2日
	 * @param eoOrderPrecontainerModelList
	 * @return
	 */
	@Override
	public List<EoOrderContainerModel> saveEoOrderContainer(List<EoOrderPrecontainerModel>  eoOrderPrecontainerModelList){
		List<EoOrderContainerModel> eoOrderContainerModelList = new ArrayList<>();
		if (EmptyUtils.isNotEmpty(eoOrderPrecontainerModelList)) {
			//1、取出当前预配箱
			for (EoOrderPrecontainerModel eoOrderPrecontainerModel : eoOrderPrecontainerModelList) {
				//2、取出当前预配箱数量
				for (int i = 0 ; i  < eoOrderPrecontainerModel.getEosrCtnNumber() ; i++) {
					EoOrderContainerModel eoOrderContainerModel = new EoOrderContainerModel();
					eoOrderContainerModel.setEoocContainerType(eoOrderPrecontainerModel.getEosrCntCustomizedSize());
					eoOrderContainerModel.setEoocContainerSize(eoOrderPrecontainerModel.getEosrCntCustomized());
					eoOrderContainerModel.setEoocIsSoc(eoOrderPrecontainerModel.getEosrIsSoc());
					eoOrderContainerModel.setEoocEoorId(eoOrderPrecontainerModel.getEosrEoorId());
					EoOrderContainerModel afterEoOrderContainerModel = eoOrderContainerManager.save(eoOrderContainerModel);
					eoOrderContainerModelList.add(afterEoOrderContainerModel);
					if (null != afterEoOrderContainerModel) {
						List<FilterCondition> eoOutmportJoabBoxCondition = new ArrayList<>();
						eoOutmportJoabBoxCondition.add(new FilterCondition("eoobEoocId",afterEoOrderContainerModel.getEoocId(),"="));
						List<EoOutmportJoabBoxModel> afterEoOutmportJoabBoxModelList = eoOutmportJoabBoxManager.findByCondition(eoOutmportJoabBoxCondition);
						if (EmptyUtils.isEmpty(afterEoOutmportJoabBoxModelList)) {//判断是否对应生成了业务集装箱
							//add by Colley.Bai 用于添加出口业务箱操作表
							Long eoocEoorId = afterEoOrderContainerModel.getEoocEoorId();
							List<FilterCondition> eoocEoorFilterCondition = new ArrayList<>();
							eoocEoorFilterCondition.add(new FilterCondition("eofoEoorId",eoocEoorId,"="));
							List<EoFreightOmportModel> eoFreightOmportModelList =  eoFreightOmportManager.findByCondition(eoocEoorFilterCondition);//查询业务表
							List<EoOutmportJoabBoxModel> eoOutmportJoabBoxModelList = new ArrayList<>();
							EoOutmportJoabBoxModel eoOutmportJoabBoxModel = new EoOutmportJoabBoxModel();
							//储存数据
							eoOutmportJoabBoxModel.setEoobEofoId(eoFreightOmportModelList.get(0).getEofoId());
							eoOutmportJoabBoxModel.setEoobEoocId(afterEoOrderContainerModel.getEoocId());
							eoOutmportJoabBoxModelList.add(eoOutmportJoabBoxModel);
							List<EoOutmportJoabBoxModel> requestEoOutmportJoabBoxModels = eoOutmportJoabBoxManager.saveAll(eoOutmportJoabBoxModelList);
							if (EmptyUtils.isEmpty(requestEoOutmportJoabBoxModels)) {
								log.error("业务箱生成失败" + requestEoOutmportJoabBoxModels);
							}
						}
					}
				}
			}
		}
		return eoOrderContainerModelList;	
	}

	/**
	 * @deprecated:删除集装箱下所有的信息（业务箱+业务箱和物料关系+业务物料+集装箱）
	 * @author Colley.Bai  
	 * @date 2019年1月2日
	 * @param eoOrderPrecontainerModelList
	 */
	@Override
	public void deleteEoOrderContainerAndMateriel(List<EoOrderPrecontainerModel>  eoOrderPrecontainerModelList){
		
		if (EmptyUtils.isNotEmpty(eoOrderPrecontainerModelList)) {
			for (EoOrderPrecontainerModel eoOrderPrecontainerModel : eoOrderPrecontainerModelList) {
				List<FilterCondition> eoorIdFilterCondition = new ArrayList<>();
				eoorIdFilterCondition.add(new FilterCondition("eoocEoorId",eoOrderPrecontainerModel.getEosrEoorId(),"="));
				//1、查询所有集装箱信息
				List<EoOrderContainerModel> eoOrderContainerModelList = eoOrderContainerManager.findByCondition(eoorIdFilterCondition);
				if (EmptyUtils.isNotEmpty(eoOrderContainerModelList)) {
					for (EoOrderContainerModel eoOrderContainerModel : eoOrderContainerModelList) {
						List<FilterCondition> eoOutmportJoabBoxCondition = new ArrayList<>();
						eoOutmportJoabBoxCondition.add(new FilterCondition("eoobEoocId",eoOrderContainerModel.getEoocId(),"="));
						//2、获取业务箱信息
						List<EoOutmportJoabBoxModel> eoOutmportJoabBoxModelList = eoOutmportJoabBoxManager.findByCondition(eoOutmportJoabBoxCondition);
						if (EmptyUtils.isNotEmpty(eoOutmportJoabBoxModelList)) {
							for (EoOutmportJoabBoxModel eoOutmportJoabBoxModel : eoOutmportJoabBoxModelList) {
								List<FilterCondition> eoEoob2EomjFilterCondition = new ArrayList<>();
								eoEoob2EomjFilterCondition.add(new FilterCondition("eoejEoobId",eoOutmportJoabBoxModel.getEoobId(),"="));
								List<EoEoob2EomjModel> eoEoob2EomjModelList = eoEoob2EomjManager.findByCondition(eoEoob2EomjFilterCondition);
								if (EmptyUtils.isNotEmpty(eoEoob2EomjModelList)) {
									for (EoEoob2EomjModel eoEoob2EomjModel : eoEoob2EomjModelList) {
										eoEoob2EomjManager.delete(eoEoob2EomjModel);
										eoOutmportJoabMaterielManager.deleteByPk(eoEoob2EomjModel.getEoejEomjId());
									}
								}
								eoOutmportJoabBoxManager.delete(eoOutmportJoabBoxModel);
							}
						}
						eoOrderContainerManager.delete(eoOrderContainerModel);
					}
				}
			}
		}
	}
	
	
	@Override
	public ResponseData<EoOrderDto> saveOrderBaseInfo(EoOrderDto eoOrderDto) {
		ResponseData<EoOrderDto> saveOrderDto = this.eoOrderManager.saveOrderDto(eoOrderDto);
		return saveOrderDto;
	}

	/**
	 * 将订单中的信息同步到相应的任务中，订单执行时存储过程没有同步的字段，需要在这里修改一下
	 * @author Shoven.Jiang  
	 * @date 2018年10月14日
	 * @param eoOrderModel
	 */
	private void synchronizationEoRequestTaskByEoorId(EoOrderModel eoOrderModel) {
		Long eoorId = eoOrderModel.getEoorId();
		//将发货人收货人等信息同步到订舱请求中
		List<FilterCondition> eorbCondition = new ArrayList<>();
		eorbCondition.add(new FilterCondition("eorbEoorId", eoorId, "="));
		List<EoRequestBookingModel> eoRequestBookingModels = this.eoRequestBookingManager.findByCondition(eorbCondition);
		if (EmptyUtils.isNotEmpty(eoRequestBookingModels)) {
			EoRequestBookingModel eoRequestBookingModel = eoRequestBookingModels.get(0);
			eoRequestBookingModel.setEorbShipper(eoOrderModel.getEoorShipperEbspNameCn());
			eoRequestBookingModel.setEorbShipperId(eoOrderModel.getEoorShipperEbspId());
			eoRequestBookingModel.setEorbShipperCode(eoOrderModel.getEoorShipperEbspCode());
			eoRequestBookingModel.setEorbConsignee(eoOrderModel.getEoorConsigneeEbspNameCn());
			eoRequestBookingModel.setEorbConsigneeCode(eoOrderModel.getEoorConsigneeEbspCode());
			eoRequestBookingModel.setEorbConsigneeId(eoOrderModel.getEoorConsigneeEbspId());
			this.eoRequestBookingManager.save(eoRequestBookingModel);
		}
	}


	@Override
	public ResponseData orderTracking(Long eoorId) {
		ResponseData responseData = new ResponseData<>();
		String eoSinoNo = "";//外运号
		String OrderTrackIFrameURL = "";//URL路径
		
		if (null == eoorId) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单主键为空，请重新操作");
			return responseData;
		}
		EoOrderModel eoOrderModel = this.eoOrderManager.get(eoorId);
		if (null == eoOrderModel) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("未查询到该订单，请重新操作");
			return responseData;
		}
		eoSinoNo = eoOrderModel.getEoorSinoNo();//外运号
		//获取参数
		String URLParameter = "type=" + eoorId + "&" + "no=" + eoSinoNo;
		//获取URL路径
		OrderTrackIFrameURL = this.esControlParamManager.getIsCompanyValue(Constants.ORDER_STATUS_ADDRESS_INT);
		byte[] encodeBase64 = BASE64.encode(URLParameter);
		String URLParameterString = new String(encodeBase64);//base 64加密之后的
		String URL = OrderTrackIFrameURL + URLParameterString;
		responseData.setCode(Constants.YES);
		responseData.setData(URL);
		return responseData;
	}
	
	@Override
	public ResponseData batchAcceptOrder(Long[] eoorIds) {
		ResponseData responseData = new ResponseData<>();
		String errm = "";//收集批量执行错误信息
		String eoorOrderNo = "";//系统订单号
		String eoorStatus = "";//订单状态
		Long eoorLoEbppId = null;//项目执行计划id
		if (EmptyUtils.isEmpty(eoorIds)) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单主键为空，请重新操作！");
			return responseData;
		}
		List<FilterCondition> eoorCondition = new ArrayList<>();
		eoorCondition.add(new FilterCondition("eoorId", eoorIds, "in"));
		List<EoOrderModel> eoOrderModels = this.eoOrderManager.findByCondition(eoorCondition);
		if (EmptyUtils.isNotEmpty(eoOrderModels)) {
			for (int i = 0; i < eoOrderModels.size(); i++) {
				eoorOrderNo = eoOrderModels.get(i).getEoorOrderNo();
				eoorStatus = eoOrderModels.get(i).getEoorStatus();
				eoorLoEbppId = eoOrderModels.get(i).getEoorLoEbppId();
				if (null == eoorLoEbppId) {
					errm += "系统订单号：" + eoorOrderNo + " 未配置项目执行计划，请维护\n";
				}
				if (EmptyUtils.isNotEmpty(eoorStatus) && !Constants.ORDER_ADD.equals(eoorStatus)) {
					errm += "系统订单号：" + eoorOrderNo + " 所属订单的订单状态不是新增状态不可执行\n";
				}
			}
		}
		if (EmptyUtils.isNotEmpty(errm)) {
			responseData.setCode(Constants.NO);
			responseData.setMsg(errm);
			return responseData;
		}
		for (int i = 0; i < eoorIds.length; i++) {
			responseData = this.setOrderStatusAndPlanStauts(eoorIds[i]);
			if (Constants.NO.equals(responseData.getCode())) {
				errm = responseData.getMsg() + "\n";
			}
		}
		if (EmptyUtils.isNotEmpty(errm)) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("批量执行中的错误信息：" + errm);
			return responseData;
		} else {
			responseData.setCode(Constants.YES);
			responseData.setMsg("执行成功");
			return responseData;
		}
	}

	@Override
	public ResponseData<EoOrderDto> getEoorAndEoeaByEoorId(Long eoorId) {
		ResponseData<EoOrderDto> responseData = new ResponseData<>();
		EoOrderDto eoOrderDto = new EoOrderDto();
		EoOrderModel eoOrderModel = new EoOrderModel();
		EoOrderExpandAgencyModel eoOrderExpandAgencyModel = new EoOrderExpandAgencyModel();
		if (null == eoorId) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单信息查询结果为空，请重新查询");
			return responseData;
		} else {
			eoOrderModel = this.eoOrderManager.get(eoorId);
			if (null != eoOrderModel) {
				List<FilterCondition> eoeaCondition = new ArrayList<>();
				eoeaCondition.add(new FilterCondition("eoeaEoorId", eoorId, "="));
				List<EoOrderExpandAgencyModel> eoOrderExpandAgencyModels = this.eoOrderExpandAgencyManager.findByCondition(eoeaCondition);
				if (EmptyUtils.isNotEmpty(eoOrderExpandAgencyModels)) {
					eoOrderExpandAgencyModel = eoOrderExpandAgencyModels.get(0);
				}
			}
		}
		eoOrderDto.setEoOrderModel(eoOrderModel);
		eoOrderDto.setEoOrderExpandAgencyModel(eoOrderExpandAgencyModel);
		responseData.setCode(Constants.YES);
		responseData.setMsg("查询成功");
		responseData.setData(eoOrderDto);
		return responseData;
	}

	@Override
	public ResponseData<EoOrderDto> copyEoorAndEoeaByEoorId(Long eoorId) {
		ResponseData<EoOrderDto> responseData = new ResponseData<>();
		EoOrderDto eoOrderDto = new EoOrderDto();
		EoOrderModel eoOrderModel = new EoOrderModel();
		EoOrderExpandAgencyModel eoOrderExpandAgencyModel = new EoOrderExpandAgencyModel();
		if (null == eoorId) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单信息查询结果为空，请重新查询");
			return responseData;
		} else {
			responseData = this.getEoorAndEoeaByEoorId(eoorId);
			if (Constants.NO.equals(responseData.getCode())) {
				return responseData;
			}
			responseData = this.initializationEoorAndEoeaModel(responseData);
			responseData = this.initializationOrderMsg(eoorId, responseData);
		}
		return responseData;
	}
	
	/**
	 * 订单基本信息复制时，对订单基本信息进行重新组装
	 * @author Shoven.Jiang  
	 * @date 2018年10月17日
	 * @param responseData
	 * @return
	 */
	public ResponseData<EoOrderDto> initializationEoorAndEoeaModel(ResponseData<EoOrderDto> responseData) {
		EoOrderDto eoOrderDto = new EoOrderDto();
		EoOrderModel eoOrderModel = new EoOrderModel();
		EoOrderExpandAgencyModel eoOrderExpandAgencyModel = new EoOrderExpandAgencyModel();
		//对订单model以及订单代理拓展表model进行更新
		eoOrderModel = responseData.getData().getEoOrderModel();
		eoOrderExpandAgencyModel = responseData.getData().getEoOrderExpandAgencyModel();
		if (null != eoOrderModel) {
			eoOrderModel.setCreateTime(null);
			eoOrderModel.setCreator(null);
			eoOrderModel.setEoorIsSettlementUpload("N");
			eoOrderModel.setEoorId(null);
			eoOrderModel.setEoorBilling(0L);
			eoOrderModel.setEoorId(null);
			eoOrderModel.setRecVer(null);
			eoOrderModel.setModifyTime(null);
			eoOrderModel.setModifier(null);
			eoOrderModel.setEoorEbpeId(null);
			eoOrderModel.setEoorEbccName(null);
			eoOrderModel.setEoorOrderNo(null);
			eoOrderModel.setEoorSinoNo(null);
			eoOrderModel.setEoorSubnum4(null);
			eoOrderModel.setEoorRemark(null);
			eoOrderModel.setEoorSoNo(null);
			eoOrderModel.setEoorDoNo(null);
			eoOrderModel.setEoorOrderDate(null);
			eoOrderModel.setEoorStatus("ADD");
		}
		if (null != eoOrderExpandAgencyModel) {
//			eoOrderExpandAgencyModel.setEoeaIsBooking(0L);
//			eoOrderExpandAgencyModel.setEoeaIsTrailer(null);
//			eoOrderExpandAgencyModel.setEoeaIsCustoms(null);
//			eoOrderExpandAgencyModel.setEoeaIsCheck(null);
//			eoOrderExpandAgencyModel.setEoeaIsInspection(null);
//			eoOrderExpandAgencyModel.setEoeaIsInsurance(null);
			eoOrderExpandAgencyModel.setEoeaId(null);
			eoOrderExpandAgencyModel.setEoeaEoorId(null);
			eoOrderExpandAgencyModel.setCreateTime(null);
			eoOrderExpandAgencyModel.setCreator(null);
			eoOrderExpandAgencyModel.setModifier(null);
			eoOrderExpandAgencyModel.setModifyTime(null);
			eoOrderExpandAgencyModel.setRecVer(null);
			eoOrderExpandAgencyModel.setEoeaVoyage(null);
			eoOrderExpandAgencyModel.setEoeaBulkBillNo(null);//清空提单号
			eoOrderExpandAgencyModel.setEoeaVesselName(null);
		}
		eoOrderDto.setEoOrderModel(eoOrderModel);
		eoOrderDto.setEoOrderExpandAgencyModel(eoOrderExpandAgencyModel);
		responseData.setData(eoOrderDto);
		return responseData;
	}


	@Override
	public ResponseData updateOrderStatus(Long[] eoorIds, String eoorStatus) {
		ResponseData responseData = new ResponseData();
		String errm = "";//校验当前订单下的费用信息
		List<EoOrderModel> eoOrderModels = new ArrayList<>();
//		String errm = "";//收集错误信息
//		for (Long eoorId : eoorIds) {
//			EoOrderModel eoorModel = this.eoOrderManager.get(eoorId);
//			eoOrderModels.add(eoorModel);
//		}
//		for (EoOrderModel eoOrderModel : eoOrderModels) {
//			String orderStatus = eoOrderModel.getEoorStatus();
//			if (EmptyUtils.isNotEmpty(orderStatus) && Constants.ORDER_STATUS_ADD.equals(eoorStatus) && Constants.ORDER_STATUS_ADD.equals(orderStatus)) {
//				
//			}
//		}
		for (Long eoorId : eoorIds) {
			List<EoConsignmentMaterielModel> eocms = new ArrayList<>();
			EoOrderModel eoorModel = this.eoOrderManager.get(eoorId);
			if (eoorModel == null) {
				responseData.setCode(Constants.NO);
				responseData.setMsg("订单不存在!");
				return responseData;
			}
			/*String msg = updateEoomInfoToEocs(eoorStatus, responseData, eoorId, eocms, eoorModel);
			if (!"".equals(msg)) {
				responseData.setCode(Constants.NO);
				responseData.setMsg(msg);
				return responseData;
			}*/
			//订单作废增加费用状态判断
			if (Constants.ORDER_VOID.equals(eoorStatus) ) {
				if (EmptyUtils.isEmpty(checkEfbfStatusByEoorId(eoorModel))) {
					eoorModel.setEoorStatus(eoorStatus);
					this.eoOrderManager.save(eoorModel);
				} else {
					errm = errm + this.checkEfbfStatusByEoorId(eoorModel);
					responseData.setCode(Constants.NO);
					responseData.setMsg("系统订单号为： " + errm + "订单中存在上传成功,接收成功,审核通过的费用，不允许作废操作!");
					return responseData;
				}
			} else if(Constants.ORDER_STATUS_ADD.equals(eoorStatus)){
				eoorModel.setEoorStatus(eoorStatus);
				this.eoOrderManager.save(eoorModel);
			}
		}
		responseData.setCode(Constants.YES);
		responseData.setMsg("批量修改状态成功!");
		return responseData;
	}

	/**
	 * 
	 * @description订单作废时如果是委托过来的就跟新委托信息暂时去掉
	 * @author Simon.Guo  
	 * @date 2018年11月15日下午2:21:00
	 * @param eoorStatus
	 * @param responseData
	 * @param eoorId
	 * @param eocms
	 * @param eoorModel
	 * @return
	 */
	private String updateEoomInfoToEocs(String eoorStatus, ResponseData responseData, Long eoorId,
			List<EoConsignmentMaterielModel> eocms, EoOrderModel eoorModel) {
		String msg = "";
		if (eoorModel.getEoorEocsId() != null) {
			List<FilterCondition> conditions = new ArrayList<>();
			conditions.add(new FilterCondition("eoomEoorId",eoorId,"="));
			List<EoOrderMaterielModel> eoomList = this.eoOrderMaterielManager.findByCondition(conditions );
			
			
			if (Constants.ORDER_STATUS_ADD.equals(eoorStatus) && Constants.ORDER_VOID.equals(eoorModel.getEoorStatus())) {//取消作废
				if (eoomList.size() > 0) {
					List<FilterCondition> conditions_eocs = new ArrayList<>();
					conditions_eocs.add(new FilterCondition("eocmEocsId",eoorModel.getEoorEocsId(),"="));
					List<EoConsignmentMaterielModel> eocmList = this.eoConsignmentMaterielManager.findByCondition(conditions_eocs );
					for (EoOrderMaterielModel eoom : eoomList) {
						int i = 0;
						for (EoConsignmentMaterielModel eocmModel : eocmList) {
							if (eoom.getEoomMaterialNo().equals(eocmModel.getEocmMaterialNo())) {
								if (i > 0) {
									continue;//保证物料重复情况下只进行一次比较
								}
								if (eocmModel.getEocmQuantity() < eoom.getEoomQuantity() || eocmModel.getEocmGrossWeight() < eoom.getEoomGrossWeight() 
										|| eocmModel.getEocmNetWeight() < eoom.getEoomNetWeight() || eocmModel.getEocmVolume() < eoom.getEoomVolume()) {
									msg += eocmModel.getEocmQuantity() < eoom.getEoomQuantity() ? "增加件数大于委托物料件数,":"";
									msg += eocmModel.getEocmGrossWeight() < eoom.getEoomGrossWeight() ? "增加毛重大于委托物料毛重,":"";
									msg += eocmModel.getEocmNetWeight() < eoom.getEoomNetWeight() ? "增加净重大于委托物料净重,":"";
									msg += eocmModel.getEocmVolume() < eoom.getEoomVolume() ? "增加体积大于委托物料体积,":"";
									msg = msg.substring(0, msg.length()-1);
									msg +="订单作废失败:物料名称:"+eoom.getEoomEbmaNameEn()+"("+msg+")";
								}
								i++;
							}
						}
					}
					for (EoOrderMaterielModel eoom : eoomList) {
						for (EoConsignmentMaterielModel eocmModel : eocmList) {
							if (eoom.getEoomMaterialNo().equals(eocmModel.getEocmMaterialNo())) {
								eocmModel.setEocmQuantity(eocmModel.getEocmQuantity() - eoom.getEoomQuantity());
								eocmModel.setEocmGrossWeight(eocmModel.getEocmGrossWeight() - eoom.getEoomGrossWeight());
								eocmModel.setEocmNetWeight(eocmModel.getEocmNetWeight() - eoom.getEoomNetWeight());
								eocmModel.setEocmVolume(eocmModel.getEocmVolume() - eoom.getEoomVolume());
								eocms.add(eocmModel);
							}
						}
					}
				}
			}else if (Constants.ORDER_VOID.equals(eoorStatus) && Constants.ORDER_STATUS_ADD.equals(eoorModel.getEoorStatus())){//作废
				if (eoomList.size() > 0) {
					List<FilterCondition> conditions_eocs = new ArrayList<>();
					conditions_eocs.add(new FilterCondition("eocmEocsId",eoorModel.getEoorEocsId(),"="));
					List<EoConsignmentMaterielModel> eocmList = this.eoConsignmentMaterielManager.findByCondition(conditions_eocs );
					for (EoOrderMaterielModel eoom : eoomList) {
						for (EoConsignmentMaterielModel eocmModel : eocmList) {
							if (eoom.getEoomMaterialNo().equals(eocmModel.getEocmMaterialNo())) {
								eocmModel.setEocmQuantity(eocmModel.getEocmQuantity() + eoom.getEoomQuantity());
								eocmModel.setEocmGrossWeight(eocmModel.getEocmGrossWeight() + eoom.getEoomGrossWeight());
								eocmModel.setEocmNetWeight(eocmModel.getEocmNetWeight() + eoom.getEoomNetWeight());
								eocmModel.setEocmVolume(eocmModel.getEocmVolume() + eoom.getEoomVolume());
								eocms.add(eocmModel);
							}
						}
					}
				}
				
			}
		}
		return msg;
	}


	@Override
	public ResponseData<List<EoOrderMaterielModel>> batchSaveOrderMaterial(
			List<EoOrderMaterielModel> eoOrderMaterielModels) {
		ResponseData<List<EoOrderMaterielModel>> responseData = new ResponseData<>();
		if (EmptyUtils.isNotEmpty(eoOrderMaterielModels)) {
			List<EoOrderMaterielModel> afterEoOrderMaterielModels = this.eoOrderMaterielManager.saveAll(eoOrderMaterielModels);
			responseData.setCode(Constants.YES);
			responseData.setData(afterEoOrderMaterielModels);
			responseData.setMsg("保存成功");
			return responseData;
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("暂无需要保存的数据，请重新操作！");
			return responseData;
		}
	}
	@Override
	public ResponseData<EoOrderModel> getEoorByEoorId(Long eoorId) {
		ResponseData<EoOrderModel> responseData = new ResponseData<>();
		EoOrderModel eoorModel = this.eoOrderManager.get(eoorId);
		responseData.setData(eoorModel);
		responseData.setCode(Constants.YES);
		responseData.setMsg("查询成功!");
		return responseData;
	}


	@Override
	public ResponseData<EoOrderDto> getOrderAndMaterialAndPrecontainerAndFeesByEoorId(Long eoorId) {
		ResponseData<EoOrderDto> responseData = this.getOrderById(eoorId);
		EoOrderDto feeList = this.efBusinessFeesManager.getOrderFeeByEoorId(eoorId);
		EoOrderDto orderDto = responseData.getData();
		orderDto.setEfBusinessFeesModelList(feeList.getEfBusinessFeesModelList());
		responseData.setData(orderDto);
		responseData.setCode(Constants.YES);
		responseData.setMsg("查询成功!");
		return responseData;
	}

	@Override
	public ResponseData saveEoomTotalInfo2Eoor(Long eoorId) {
		ResponseData responseData = new ResponseData();
		if (eoorId != null) {
			try {
				List<FilterCondition> conditions = new ArrayList<>();
				conditions.add(new FilterCondition("eoomEoorId",eoorId,"="));
				List<EoOrderMaterielModel> eoomList = this.eoOrderMaterielManager.findByCondition(conditions );
				Double eoomQuantityTotal = 0D;
				Double eoomGrossWeightTotal = 0D;
				Double eoomNetWeightTotal = 0D;
				Double eoomVolumeTotal = 0D;
				if (eoomList.size() != 0) {
					for (EoOrderMaterielModel eoomModel : eoomList) {
						eoomQuantityTotal = NumberUtil.doubleAdd(eoomQuantityTotal, eoomModel.getEoomQuantity()==null?0D:eoomModel.getEoomQuantity());
						eoomGrossWeightTotal = NumberUtil.doubleAdd(eoomGrossWeightTotal, eoomModel.getEoomGrossWeight()==null?0D:eoomModel.getEoomGrossWeight());
						eoomNetWeightTotal = NumberUtil.doubleAdd(eoomNetWeightTotal, eoomModel.getEoomNetWeight()==null?0D:eoomModel.getEoomNetWeight());
						eoomVolumeTotal = NumberUtil.doubleAdd(eoomVolumeTotal, eoomModel.getEoomVolume()==null?0D:eoomModel.getEoomVolume());
					}
				}
				EoOrderModel eoorModel = this.eoOrderManager.get(eoorId);
				eoorModel.setEoorQuantity(eoomQuantityTotal);
				eoorModel.setEoorWeight(eoomGrossWeightTotal);
				eoorModel.setEoorNetWeight(eoomNetWeightTotal);
				eoorModel.setEoorVolume(eoomVolumeTotal);
				EoOrderModel afterEoorModel = this.eoOrderManager.save(eoorModel);
				
				Map<String, Object> map = new HashMap<>();
				map.put("eoomQuantityTotal", NumberUtil.getRoundDoubleToSting(eoomQuantityTotal, 0, true));
				map.put("eoomGrossWeightTotal",NumberUtil.getRoundDoubleToSting(eoomGrossWeightTotal, 3, true) );
				map.put("eoomNetWeightTotal",NumberUtil.getRoundDoubleToSting(eoomNetWeightTotal, 3, true) );
				map.put("eoomVolumeTotal",NumberUtil.getRoundDoubleToSting(eoomVolumeTotal, 3, true) );
				responseData.setCode(Constants.YES);
				responseData.setMsg("订单物料总信息保存订单表成功");
				responseData.setData(map);
			} catch (Exception e) {
				e.printStackTrace();
				responseData.setCode(Constants.NO);
				responseData.setMsg("订单物料合计出错,错误:"+e.getMessage());
				return responseData;
			}
		}else{
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单id为空");
			return responseData;
		}
		return responseData;
	}


	@Override
	public List<EoOrderModel> findByCondition(List<FilterCondition> conditions) {
		List<EoOrderModel> eoomList = this.eoOrderManager.findByCondition(conditions);
		return eoomList;
	}


	@Override
	public ResponseData getEoorIssuedStatus(Long eoorId) {
		ResponseData responseData = new ResponseData();
		Map<String, Object>  condition = new HashMap<>();
		Map<String, Object>  resultMap = new HashMap<>();
		try {
			condition.put("eoorId", eoorId);
			EoOrderIssuedStatusDto statusDto = this.eoOrderManager.getEoorIssuedStatus(condition);
			if (statusDto.getEoorId() == null) {
				responseData.setCode(Constants.NO);
				responseData.setMsg("未查到该订单的信息,请重试");
				return responseData;
			}
			if (statusDto.getEoorStatus() == null || "EXCEPTION".equals(statusDto.getEoorStatus()) || "VOID".equals(statusDto.getEoorStatus())) {
				responseData.setCode(Constants.NO);
				responseData.setMsg("该订单存在异常或已作废,请重试");
				return responseData;
			}
			resultMap.put("eoorIssued", "0");
			resultMap.put("eorbIssued", "0");
			resultMap.put("eorbBack", "0");
			resultMap.put("eoetIssued", "0");
			resultMap.put("eoetBack", "0");
			resultMap.put("eoddIssued", "0");
			resultMap.put("eoddBack", "0");
			resultMap.put("efbfCharging", "0");
			resultMap.put("efbfBalance", "0");
			resultMap.put("efbfAuditing", "0");
			
			
			if (statusDto.getEoorStatus() != null && ("ACCEPT".equals(statusDto.getEoorStatus()) || "COMPLETE".equals(statusDto.getEoorStatus()))) {
				//1 订单信息
				resultMap.put("eoorIssued", "1");
				DpInTrackModel dpit_eoor = getOperatorAndTime(eoorId, Constants.DPIT_TYPE_IMPLEMENT);
				if (dpit_eoor != null) {
					resultMap.put("eoorIssuedOperator", getOName(Long.valueOf(dpit_eoor.getDpitOperator())));
					resultMap.put("eoorIssuedTime", dpit_eoor.getDpitOperatorTime());
				}
				//2.订舱信息
				//if (eorbs != null) {
				//2.1 订舱下达完成
				if ("issued".equals(statusDto.getEoorEorbStatus())) {
					resultMap.put("eorbIssued", "1");
					DpInTrackModel dpit = getOperatorAndTime(eoorId, Constants.DPIT_TYPE_BOOKING_ISSUSED);
					//获取操作人
					if (dpit!=null) {
						resultMap.put("eorbIssuedOperator", getOName(Long.valueOf(dpit.getDpitOperator())));
						resultMap.put("eorbIssuedTime", dpit.getDpitOperatorTime());
					}
				}else if ("completed".equals(statusDto.getEoorEorbStatus())) {
					resultMap.put("eorbIssued", "1");
					resultMap.put("eorbBack", "1");
					//获取操作人
					DpInTrackModel dpit = getOperatorAndTime(eoorId, Constants.DPIT_TYPE_BOOKING_ISSUSED);
					if (dpit!=null) {
						resultMap.put("eorbIssuedOperator", getOName(Long.valueOf(dpit.getDpitOperator())));
						resultMap.put("eorbIssuedTime", dpit.getDpitOperatorTime());
					}
					DpInTrackModel dpit_ = getOperatorAndTime(eoorId, Constants.DPIT_TYPE_BOOKING_COMPLETE);
					if (dpit_!=null) {
						resultMap.put("eorbBackOperator", getOName(Long.valueOf(dpit_.getDpitOperator())));
						resultMap.put("eorbBackTime", dpit_.getDpitOperatorTime());
					}
				}
				//3.报关信息
				if (statusDto.getEoorEoddUnissued()==null &&( statusDto.getEoorEoddIssued()!=null || statusDto.getEoorEoddSuccess()!=null)){//拖车不存在
					if ("issued".equals(statusDto.getEoorEoddIssued())) {
						resultMap.put("eoddIssued", "1");
						DpInTrackModel dpit = getOperatorAndTime(eoorId, Constants.DPIT_TYPE_DECLARATION_ISSUSED);
						//获取操作人
						if (dpit!=null) {
							resultMap.put("eoddIssuedOperator", getOName(Long.valueOf(dpit.getDpitOperator())));
							resultMap.put("eoddIssuedTime", dpit.getDpitOperatorTime());
						}
					}else if ("completed".equals(statusDto.getEoorEoddSuccess())) {
						resultMap.put("eoddIssued", "1");
						resultMap.put("eoddBack", "1");
						//获取操作人
						DpInTrackModel dpit = getOperatorAndTime(eoorId, Constants.DPIT_TYPE_DECLARATION_ISSUSED);
						if (dpit!=null) {
							resultMap.put("eoddIssuedOperator", getOName(Long.valueOf(dpit.getDpitOperator())));
							resultMap.put("eoddIssuedTime", dpit.getDpitOperatorTime());
						}
						DpInTrackModel dpit_ = getOperatorAndTime(eoorId, Constants.DPIT_TYPE_DECLARATION_COMPLETE);
						if (dpit_!=null) {
							resultMap.put("eoddBackOperator", getOName(Long.valueOf(dpit_.getDpitOperator())));
							resultMap.put("eoddBackTime", dpit_.getDpitOperatorTime());
						}
					}
					
				}
				//4.拖车信息
				if (statusDto.getEoorEoetUnissued()==null &&( statusDto.getEoorEoetIssued()!=null || statusDto.getEoorEoetSuccess()!=null)){//拖车不存在
					if ("issued".equals(statusDto.getEoorEoetIssued())) {
						resultMap.put("eoetIssued", "1");
						DpInTrackModel dpit = getOperatorAndTime(eoorId, Constants.DPIT_TYPE_TRAILER_ISSUSED);
						//获取操作人
						if (dpit!=null) {
							resultMap.put("eoetIssuedOperator", getOName(Long.valueOf(dpit.getDpitOperator())));
							resultMap.put("eoetIssuedTime", dpit.getDpitOperatorTime());
						}
					}else if ("completed".equals(statusDto.getEoorEoetSuccess())) {
						resultMap.put("eoetIssued", "1");
						resultMap.put("eoetBack", "1");
						//获取操作人
						DpInTrackModel dpit = getOperatorAndTime(eoorId, Constants.DPIT_TYPE_TRAILER_ISSUSED);
						if (dpit!=null) {
							resultMap.put("eoetIssuedOperator", getOName(Long.valueOf(dpit.getDpitOperator())));
							resultMap.put("eoetIssuedTime", dpit.getDpitOperatorTime());
						}
						DpInTrackModel dpit_ = getOperatorAndTime(eoorId, Constants.DPIT_TYPE_TRAILER_COMPLETE);
						if (dpit_!=null) {
							resultMap.put("eoetBackOperator", getOName(Long.valueOf(dpit_.getDpitOperator())));
							resultMap.put("eoetBackTime", dpit_.getDpitOperatorTime());
						}
					}
					
				}
				//5.费用
				if (statusDto.getEoorFeeStatus()!=null){//费用不存在
					if ("2".equals(statusDto.getEoorFeeStatus())){
						resultMap.put("efbfCharging", "1");
						DpInTrackModel dpit = getOperatorAndTime(eoorId, Constants.DPIT_TYPE_EFBF_ADD);
						//获取操作人
						if (dpit!=null) {
							resultMap.put("efbfChargingOperator", getOName(Long.valueOf(dpit.getDpitOperator())));
							resultMap.put("efbfChargingTime", dpit.getDpitOperatorTime());
						}
					}else if ("3".equals(statusDto.getEoorFeeStatus())){
						resultMap.put("efbfCharging", "1");
						DpInTrackModel dpit = getOperatorAndTime(eoorId, Constants.DPIT_TYPE_EFBF_ADD);
						//获取操作人
						if (dpit!=null) {
							resultMap.put("efbfChargingOperator", getOName(Long.valueOf(dpit.getDpitOperator())));
							resultMap.put("efbfChargingTime", dpit.getDpitOperatorTime());
						}
						resultMap.put("efbfBalance", "1");
						DpInTrackModel dpit_ = getOperatorAndTime(eoorId, Constants.DPIT_TYPE_EFBF_SETTLEMENT);
						//获取操作人
						if (dpit_!=null) {
							resultMap.put("efbfBalanceOperator", getOName(Long.valueOf(dpit_.getDpitOperator())));
							resultMap.put("efbfBalanceTime", dpit_.getDpitOperatorTime());
						}
						
						
					}else if ("4".equals(statusDto.getEoorFeeStatus())){
						resultMap.put("efbfCharging", "1");
						DpInTrackModel dpit = getOperatorAndTime(eoorId, Constants.DPIT_TYPE_EFBF_ADD);
						//获取操作人
						if (dpit!=null) {
							resultMap.put("efbfChargingOperator", getOName(Long.valueOf(dpit.getDpitOperator())));
							resultMap.put("efbfChargingTime", dpit.getDpitOperatorTime());
						}
						resultMap.put("efbfBalance", "1");
						DpInTrackModel dpit_ = getOperatorAndTime(eoorId, Constants.DPIT_TYPE_EFBF_SETTLEMENT);
						//获取操作人
						if (dpit_!=null) {
							resultMap.put("efbfBalanceOperator", getOName(Long.valueOf(dpit_.getDpitOperator())));
							resultMap.put("efbfBalanceTime", dpit_.getDpitOperatorTime());
						}
						resultMap.put("efbfAuditing", "1");
						DpInTrackModel dpit__ = getOperatorAndTime(eoorId, Constants.DPIT_TYPE_EFBF_EXAMINE);
						//获取操作人
						if (dpit__!=null) {
							resultMap.put("efbfAuditingOperator", getOName(Long.valueOf(dpit__.getDpitOperator())));
							resultMap.put("efbfAuditingTime", dpit__.getDpitOperatorTime());
						}
					}
				}
				
					
					
				
			}
			/*if (statusDto.getEoorEorbStatus()!=null){//订舱不存在
				if ("issued".equals(statusDto.getEoorEorbStatus())) {
					//获取操作人
					
					resultMap.put("eorbIssued", "1");
				}else if ("success".equals(statusDto.getEoorEorbStatus())) {
					resultMap.put("eorbIssued", "1");
					resultMap.put("eorbBack", "1");
				}
			}*/
			/*if (statusDto.getEoorEoddStatus()!=null){//报关不存在
				if ("issued".equals(statusDto.getEoorEoddStatus())) {
					resultMap.put("eoddIssued", "1");
				}else if ("success".equals(statusDto.getEoorEoddStatus())) {
					resultMap.put("eoddIssued", "1");
					resultMap.put("eoddBack", "1");
				}
			}*/
			
			/*if (statusDto.getEoorEoetUnissued()==null && statusDto.getEoorEoetIssued()==null && statusDto.getEoorEoetSuccess()==null){//拖车不存在
			}else{
				if (statusDto.getEoorEoetUnissued() == null) {
					if (statusDto.getEoorEoetIssued() != null) {
						resultMap.put("eoetIssued", "1");
					}else{
						if (statusDto.getEoorEoetSuccess() != null) {
							resultMap.put("eoetIssued", "1");
							resultMap.put("eoetBack", "1");
						}
					}
				}
				
			}
			if (statusDto.getEoorFeeStatus()!=null){//费用不存在
				if ("2".equals(statusDto.getEoorFeeStatus())){
					resultMap.put("efbfCharging", "1");
				}else if ("3".equals(statusDto.getEoorFeeStatus())){
					resultMap.put("efbfCharging", "1");
					resultMap.put("efbfBalance", "1");
				}else if ("4".equals(statusDto.getEoorFeeStatus())){
					resultMap.put("efbfCharging", "1");
					resultMap.put("efbfBalance", "1");
					resultMap.put("efbfAuditing", "1");
				}
			}	*/
			
		} catch (Exception e) {
			e.printStackTrace();
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单执行状态错误:"+e.getMessage());
			return responseData;
		}
		responseData.setData(resultMap);
		responseData.setCode(Constants.YES);
		responseData.setMsg("订单执行状态查询成功");
		return responseData;
	}
	public DpInTrackModel getOperatorAndTime(Long eoorId,Long type){
		List<FilterCondition> filterCondition = new ArrayList<>();
		filterCondition.add(new FilterCondition("dpitOrderId",eoorId,"="));
		if (type != null) {
			filterCondition.add(new FilterCondition("dpitType",type,"="));
		}
		//1、用户信息
		UserDetails user = SessionContext.getUser();
		//2、查询是否有内部状态生成 ES18122701041
		List<DpInTrackModel> dpInTrackModelList = dpInTrackManager.findByCondition(filterCondition,"modifyTime asc");
		if (EmptyUtils.isNotEmpty(dpInTrackModelList)) {
			return dpInTrackModelList.get(0);
		} else {
			return null;
		}
		
	}
	
	public String getOName(Long id){
		UserDetails user = SessionContext.getUser();
		if (Long.valueOf(user.getUserId()) == id) {
			return user.getUsername();
		}else{
			return esUserManager.get(id).getEsusUserNameCn();
		}
	}
	
	@SuppressWarnings("unchecked")
	@Override
	public ResponseData getReportAddressService(Map<String,Object> esrtCodeMap) {
		String esrtCode = (String) esrtCodeMap.get("esrtCode");
		ResponseData responseData = new ResponseData();
		if (EmptyUtils.isEmpty(esrtCode)) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("报表类型为空，请重新查询！");
			return responseData;
		}
		UserDetails user = SessionContext.getUser();
		List<QueryField> queryFieldList = new ArrayList<>();
		QueryInfo queryInfo = new QueryInfo();
		if (null != user) {
			//增加公司id的入参
			if (EmptyUtils.isNotEmpty(user.getOrgId())) {
				QueryField escoQueryField = new QueryField();
				escoQueryField.setFieldName("esrtEscoId");
				Long [] escoIds = new Long [2];
				escoIds[0] = Long.valueOf(user.getOrgId());
				escoIds[1] = 100L;
				escoQueryField.setFieldValue(escoIds);
				escoQueryField.setOperator("in");
				queryFieldList.add(escoQueryField);
			}
			//增加报表类型
			if (EmptyUtils.isNotEmpty(esrtCode)) {
				QueryField esrtQueryField = new QueryField();
				esrtQueryField.setFieldName("esrtCode");
				esrtQueryField.setFieldValue(esrtCode);
				esrtQueryField.setOperator("=");
				queryFieldList.add(esrtQueryField);
			}
		}
		queryInfo.setQueryType("EsReportTemplateModel");
		queryInfo.setQueryFields(queryFieldList);
		QueryData queryData = commonQueryManager.query(queryInfo);
		responseData.setCode(Constants.YES);
		responseData.setData(queryData);
		return responseData;
	}


	@Override
	public ResponseData<List<EoEoob2EomjModel>> saveConsignmentAndMaterial(
			List<EoEoob2EomjModel> eoEoob2EomjModelList) {
		ResponseData<List<EoEoob2EomjModel>> eoEoob2EomjModelResponseData = new ResponseData<>();
		if (EmptyUtils.isNotEmpty(eoEoob2EomjModelList)) {
			//获取实装箱id及实装箱信息
			List<FilterCondition> eoOrderContainerCondition = new ArrayList<>();
			eoOrderContainerCondition.add(new FilterCondition("eoocId",eoEoob2EomjModelList.get(0).getEoejEoobId(),"="));
			List<EoOrderContainerModel> eoOrderContainerList = eoOrderContainerManager.findByCondition(eoOrderContainerCondition);
			EoOrderContainerModel eoOrderContainerModel = new EoOrderContainerModel();

			Long eoocQuantity = 0L;
			Double eoocWeight= 0.0;
			Double eoocVolume= 0.0;
			
			if (EmptyUtils.isNotEmpty(eoOrderContainerList)) {
				eoocQuantity = eoOrderContainerList.get(0).getEoocQuantity()==null?0L:eoOrderContainerList.get(0).getEoocQuantity();//件数
				eoocWeight = eoOrderContainerList.get(0).getEoocWeight()==null?0.0:eoOrderContainerList.get(0).getEoocWeight();//重量
				eoocVolume = eoOrderContainerList.get(0).getEoocVolume()==null?0.0:eoOrderContainerList.get(0).getEoocVolume();//体积
				eoOrderContainerModel.setEoocId(eoOrderContainerList.get(0).getEoocId());
				eoOrderContainerModel.setRecVer(eoOrderContainerList.get(0).getRecVer());
				eoOrderContainerModel.setEoocEoorId(eoOrderContainerList.get(0).getEoocEoorId());
			}
			//计算已有件数和体积和重量
			for (EoEoob2EomjModel eoEoob2EomjModel: eoEoob2EomjModelList) {
				eoocQuantity += eoEoob2EomjModel.getEoejQuantity()==null?0L:eoEoob2EomjModel.getEoejQuantity().longValue();
				eoocWeight += eoEoob2EomjModel.getEoejGrossWeight()==null?0.0:eoEoob2EomjModel.getEoejGrossWeight();
				eoocVolume += eoEoob2EomjModel.getEoejMeasurement()==null?0.0:eoEoob2EomjModel.getEoejMeasurement();
			}
			eoOrderContainerModel.setEoocQuantity(eoocQuantity);
			eoOrderContainerModel.setEoocWeight(eoocWeight);
			eoOrderContainerModel.setEoocVolume(eoocVolume);
			//1.实装箱修改
			EoOrderContainerModel eoOrderContainer = eoOrderContainerManager.save(eoOrderContainerModel);
			//2.获取箱信息
			List<FilterCondition> eoOutmportJoabBoxCondition = new ArrayList<>();
			eoOutmportJoabBoxCondition.add(new FilterCondition("eoobEoocId",eoOrderContainer.getEoocId(),"="));
			List<EoOutmportJoabBoxModel> eoOutmportJoabBoxModelList = eoOutmportJoabBoxManager.findByCondition(eoOutmportJoabBoxCondition);
			//3.物料保存
			EoOutmportJoabMaterielModel eoOutmportJoabMaterielModel = new EoOutmportJoabMaterielModel();

			List<EoEoob2EomjModel> eoEoob2EomjsModelList = new ArrayList<>();//关系list
			
			for (EoEoob2EomjModel eoEoob2EomjModel:eoEoob2EomjModelList) {
				
				List<FilterCondition> eoOutmportJoabMaterielCondition = new ArrayList<>();
				eoOutmportJoabMaterielCondition.add(new FilterCondition("eomjEoomId",eoEoob2EomjModel.getEoejEomjId(),"="));
				//获取业务物料信息，是为了判断是否已经有了业务箱信息，如果没有则进行添加业务物料操作，因为业务物料和订单物料是1对1的关系
				List<EoOutmportJoabMaterielModel>  eoOutmportJoabMaterielList= eoOutmportJoabMaterielManager.findByCondition(eoOutmportJoabMaterielCondition);//获取业务物料信息，是为了判断是否已经有了业务箱信息
				
				if (EmptyUtils.isNotEmpty(eoOutmportJoabMaterielList)) {
					//这步操作是更新数据，在更新数据的时候返回对象里有业务物料主键，在报关箱和物料关系时候用着，这步操作必须有，否者回保存不了业务箱和物料关系
					for (EoOutmportJoabMaterielModel afterEoOutmportJoabMaterielModel:eoOutmportJoabMaterielList) {
						eoOutmportJoabMaterielModel = eoOutmportJoabMaterielManager.save(afterEoOutmportJoabMaterielModel);
					}
				} else {
					EoOutmportJoabMaterielModel afterEoOutmportJoabMaterielModel = new EoOutmportJoabMaterielModel();
					//这个对象是为了多个物料保存的时候不保存同意物料信息
					afterEoOutmportJoabMaterielModel.setEomjEoomId(eoEoob2EomjModel.getEoejEomjId());//物料外键
					afterEoOutmportJoabMaterielModel.setEomjEofoId(eoOutmportJoabBoxModelList.get(0).getEoobEofoId());//业务
					eoOutmportJoabMaterielModel = eoOutmportJoabMaterielManager.save(afterEoOutmportJoabMaterielModel);
				}
				
				eoEoob2EomjModel.setEoejEomjId(eoOutmportJoabMaterielModel.getEomjId());//请求表物料
				eoEoob2EomjModel.setEoejEoobId(eoOutmportJoabBoxModelList.get(0).getEoobId());//请求表箱
				eoEoob2EomjModel.setEoejQuantity(eoEoob2EomjModel.getEoejQuantity());//件数
				eoEoob2EomjModel.setEoejGrossWeight(eoEoob2EomjModel.getEoejGrossWeight());//重量
				eoEoob2EomjModel.setEoejMeasurement(eoEoob2EomjModel.getEoejMeasurement());//体积
				eoEoob2EomjsModelList.add(eoEoob2EomjModel);
			}
			//保存物料
			//4.关系表保存
			List<EoEoob2EomjModel> eoEoob2EomjModels = eoEoob2EomjManager.saveAll(eoEoob2EomjsModelList);
			if (EmptyUtils.isEmpty(eoEoob2EomjModels)){
				eoEoob2EomjModelResponseData.setCode(Constants.NO);
				eoEoob2EomjModelResponseData.setMsg("物料保存失败，请重试");
				return eoEoob2EomjModelResponseData;
			} else {
				eoEoob2EomjModelResponseData.setCode(Constants.YES);
				eoEoob2EomjModelResponseData.setData(eoEoob2EomjModels);
				return eoEoob2EomjModelResponseData;
			}
		} else {
			eoEoob2EomjModelResponseData.setCode(Constants.NO);
			eoEoob2EomjModelResponseData.setMsg("物料保存失败，请重试");
			return eoEoob2EomjModelResponseData;
		}
	}

	@Override
	public ResponseData<List<EoOrderContainerModel>> batchDeleteOrderContainerAndEoejByEooc(List<Long> eoocIds) {
		ResponseData<List<EoOrderContainerModel>> responseData = new ResponseData<>();
		if (EmptyUtils.isNotEmpty(eoocIds)) {
			for (Long eoocId:eoocIds) {
				List<FilterCondition> eoocIdFilterCondition = new ArrayList<>();
				eoocIdFilterCondition.add(new FilterCondition("eoobEoocId",eoocId,"="));//业务箱和实装箱为一对一关系
				List<EoOutmportJoabBoxModel> eoOutmportJoabBoxModelList = eoOutmportJoabBoxManager.findByCondition(eoocIdFilterCondition);//获取业务箱
				if (EmptyUtils.isNotEmpty(eoOutmportJoabBoxModelList)) {
					List<FilterCondition> eoOutmportJoabBoxFilterCondition = new ArrayList<>();
					eoOutmportJoabBoxFilterCondition.add(new FilterCondition("eoejEoobId",eoOutmportJoabBoxModelList.get(0).getEoobId(),"="));
					List<EoEoob2EomjModel> eoEoob2EomjModelList = eoEoob2EomjManager.findByCondition(eoOutmportJoabBoxFilterCondition);//获取业务关系表和业务关系箱有关系的数据
					if (EmptyUtils.isNotEmpty(eoEoob2EomjModelList)) {
						for (EoEoob2EomjModel eoEoob2EomjModel:eoEoob2EomjModelList) {
							eoEoob2EomjManager.delete(eoEoob2EomjModel);
						}
					}
					eoOutmportJoabBoxManager.deleteByPk(eoOutmportJoabBoxModelList.get(0).getEoobId());
				}
				List<FilterCondition> eocdIdFilterCondition = new ArrayList<>();
				eocdIdFilterCondition.add(new FilterCondition("eocdEoocId",eoocId,"="));//业务箱和报关实装箱为一对一关系
				List<EoEooc2EoddModel> eoEooc2EoddModelList = eoEooc2EoddManager.findByCondition(eocdIdFilterCondition);//获取报关业务箱
				if (EmptyUtils.isNotEmpty(eoEooc2EoddModelList)) {//报关集装箱信息删除
					for (EoEooc2EoddModel eoEooc2EoddModel:eoEooc2EoddModelList) {
						eoEooc2EoddManager.delete(eoEooc2EoddModel);
					}
				}
				List<FilterCondition> eootIdFilterCondition = new ArrayList<>();
				eootIdFilterCondition.add(new FilterCondition("eootEoocId",eoocId,"="));//业务箱和拖车集装箱为一对一关系
				List<EoEooc2EoetModel> eoEooc2EoetModelList = eoEooc2EoetManager.findByCondition(eootIdFilterCondition);
				if (EmptyUtils.isNotEmpty(eoEooc2EoetModelList)) {
					for (EoEooc2EoetModel eoEooc2EoetModel : eoEooc2EoetModelList) {
						eoEooc2EoetManager.delete(eoEooc2EoetModel);
					}
				}
				eoOrderContainerManager.deleteByPk(eoocId);
			}
			responseData.setData(null);
			responseData.setCode(Constants.YES);
			return responseData;
		} else {
			responseData.setMsg("ID不能空");
			responseData.setCode(Constants.NO);
		}
		return responseData;
	}


	@Override
	public ResponseData<QueryData> getEoOrderMaterielAndEomjByEoocId(Long eoocId) {
		ResponseData<QueryData> responseData=new ResponseData<QueryData>();
		QueryData eoOrderMaterielAndEomjList = eoOrderManager.getEoOrderMaterielAndEomjByEoocId(eoocId);
		if (EmptyUtils.isEmpty(eoOrderMaterielAndEomjList.getDataList())) {
			responseData.setCode(Constants.NO);
		}
		responseData.setData(eoOrderMaterielAndEomjList);
		return responseData;
	}


	@Override
	public ResponseData<List<EoEoob2EomjModel>> batchDeleteEoEoob2Eomj(List<Long> eoejIds) {
		ResponseData<List<EoEoob2EomjModel>> responseData = new ResponseData<List<EoEoob2EomjModel>>();
		
		for (Long eoejId:eoejIds) {
			EoEoob2EomjModel eoEoob2EomjModel = eoEoob2EomjManager.get(eoejId);//获取业务关系数据
			Long eoejEoobId = eoEoob2EomjModel.getEoejEoobId();
			EoOutmportJoabBoxModel eoOutmportJoabBoxModle = eoOutmportJoabBoxManager.get(eoejEoobId);//获取业务箱信息
			Long eoobEoocId = eoOutmportJoabBoxModle.getEoobEoocId();
			EoOrderContainerModel 	eoOrderContainerModel = eoOrderContainerManager.get(eoobEoocId);//获取集装箱信息
			//1.集装箱信息件数、毛重、体积获取
			Long  eoocQuantity = eoOrderContainerModel.getEoocQuantity() == null ? 0L: eoOrderContainerModel.getEoocQuantity();
			Double eoocWeight = eoOrderContainerModel.getEoocWeight() == null ? 0.00 : eoOrderContainerModel.getEoocWeight();
			Double eoocVolume = eoOrderContainerModel.getEoocVolume() == null ? 0.00 : eoOrderContainerModel.getEoocVolume();
			//2.业务关系表件数、毛重、体积
			Integer eoejQuantit = eoEoob2EomjModel.getEoejQuantity() == null ? 0 : eoEoob2EomjModel.getEoejQuantity();
			Double eoejGrossWeight = eoEoob2EomjModel.getEoejGrossWeight() == null ? 0.0 : eoEoob2EomjModel.getEoejGrossWeight();
			Double eoejMeasurement = eoEoob2EomjModel.getEoejMeasurement() == null ? 0.0 : eoEoob2EomjModel.getEoejMeasurement();
			//3.计算出需要删除的业务箱数据
			eoOrderContainerModel.setEoocQuantity(eoocQuantity-eoejQuantit.longValue());
			eoOrderContainerModel.setEoocWeight(NumberUtils.getFormatOfLength(eoocWeight-eoejGrossWeight,3));
			eoOrderContainerModel.setEoocVolume(NumberUtils.getFormatOfLength(eoocVolume-eoejMeasurement,3));
			//4.更新集装箱信息
			EoOrderContainerModel afterEoOrderContainerModel = eoOrderContainerManager.save(eoOrderContainerModel);
		}
		if (EmptyUtils.isNotEmpty(eoejIds)) {
			for (Long eoejId : eoejIds) {
//				List<FilterCondition> filterConditions = new ArrayList<>();
//				filterConditions.add(new FilterCondition("eoejEomjId",eoejId,"="));
//				List<EoEoob2EomjModel> eoEoob2EomjModelList = eoEoob2EomjManager.findByCondition(filterConditions);
				eoEoob2EomjManager.deleteByPk(eoejId);
//				if (EmptyUtils.isNotEmpty(eoEoob2EomjModelList)) {
//					for (EoEoob2EomjModel eoEoob2EomjModel : eoEoob2EomjModelList) {
//						eoOutmportJoabMaterielManager.deleteByPk(eoEoob2EomjModel.getEoejEomjId());
//					}
//				}
			}
			responseData.setCode(Constants.YES);
			responseData.setMsg("删除成功");
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("ID为空，不允许删除，请重试");
		}
		return responseData;
	}
	
	/**
	 * 订单执行完成之后，修改订单预配箱信息同步修改拖车任务
	 * @author Shoven.Jiang  
	 * @date 2018年11月12日
	 * @param eoOrderPrecontainerModels
	 * @return
	 */
	@Override
	public ResponseData<List<EoOrderPrecontainerModel>> updateEoetTaskByEosrModel(List<EoOrderPrecontainerModel> eoOrderPrecontainerModels) {
		ResponseData<List<EoOrderPrecontainerModel>> responseData = new ResponseData<List<EoOrderPrecontainerModel>>();
		Long eoorId = null;
		if (EmptyUtils.isNotEmpty(eoOrderPrecontainerModels)) {
			eoorId = eoOrderPrecontainerModels.get(0).getEosrEoorId();
			if (null != eoorId) {
				//1、判断该订单是否已经执行过且生成了拖车任务
				EoRequestTrailerModel eoRequestTrailerModel = new EoRequestTrailerModel();
				List<FilterCondition> eoetCondition = new ArrayList<>();
				eoetCondition.add(new FilterCondition("eoetEoorId", eoorId, "="));
				List<EoRequestTrailerModel> eoRequestTrailerModels = this.eoRequestTrailerManager.findByCondition(eoetCondition);
				//2、如果存在拖车任务，则校验预配箱信息，确认是够可以修改预配箱信息
				if (EmptyUtils.isNotEmpty(eoRequestTrailerModels)) {
					responseData = this.checkEosrByUpdate(eoorId, eoOrderPrecontainerModels);
					return responseData;
				} else {
					responseData.setCode(Constants.YES);
					return responseData;
				}
			}
		}
		
		return responseData;
	}
	
	/**
	 * 预配箱数据更新之前先校验是否 符合更新规则
	 * @author Shoven.Jiang  
	 * @date 2018年11月12日
	 * @param eoorId
	 * @param eoOrderPrecontainerModels
	 * @return
	 */
	private ResponseData<List<EoOrderPrecontainerModel>> checkEosrByUpdate(Long eoorId, List<EoOrderPrecontainerModel> eoOrderPrecontainerModels) {
		ResponseData<List<EoOrderPrecontainerModel>> responseData = new ResponseData<List<EoOrderPrecontainerModel>>();
		responseData = this.eoOrderPrecontainerManager.checkEosrListBeforeUpdateEosr(eoorId, eoOrderPrecontainerModels);
		//如果校验信息没有通过，则重新查新该订单下预配箱数据进行回填前端
		if (Constants.NO.equals(responseData.getCode())) {
			List<FilterCondition> eosrCondition = new ArrayList<>();
			eosrCondition.add(new FilterCondition("eosrEoorId", eoorId, "="));
			List<EoOrderPrecontainerModel> afterEoOrderPrecontainerModel = this.eoOrderPrecontainerManager.findByCondition(eosrCondition);
			responseData.setData(afterEoOrderPrecontainerModel);
		}
		return responseData;
	}

	/**
	 * 订单删除前的校验
	 * @author Shoven.Jiang  
	 * @date 2018年11月19日
	 * @param eoorIds
	 * @return
	 */
	private String checkOrderByDelete(Collection<Long> eoorIds) {
		String errm = "";//收集校验信息
		List<Long> eoorIdsList = new ArrayList<>();
		//lambda表达式处理
		eoorIds.forEach(eoorId -> {eoorIdsList.add(eoorId);});
		if (EmptyUtils.isNotEmpty(eoorIdsList)) {
			for (Long  eoorId : eoorIdsList) {
				EoOrderModel eoOrderModel = new EoOrderModel();
				eoOrderModel = this.eoOrderManager.get(eoorId);
				String eoorStatus = "";
				String eoorOrderNo = "";
				if (null != eoOrderModel) {
					//校验订单状态是否符合删除条件
					eoorStatus = eoOrderModel.getEoorStatus();
					if (EmptyUtils.isNotEmpty(eoorStatus) && !(Constants.ORDER_STATUS_ADD.equals(eoorStatus) || Constants.ORDER_VOID.equals(eoorStatus))) {
						eoorOrderNo = eoOrderModel.getEoorOrderNo();
						errm = errm + "系统订单号：" + eoorOrderNo + "删除失败，只有新增状态以及作废状态的订单才允许删除";
					}
					//校验订单下是否存在已经上传成功，接收成功，审核成功,上传中的费用，如果存在则不允许删除
					List<FilterCondition> efbfCondition = new ArrayList<>();
					efbfCondition.add(new FilterCondition("efbfEoorId", eoorId, "="));
					List<EfBusinessFeesModel> efBusinessFeesModels = this.efBusinessFeesManager.findByCondition(efbfCondition);
					if (EmptyUtils.isNotEmpty(efBusinessFeesModels)) {
						for (EfBusinessFeesModel efBusinessFeesModel : efBusinessFeesModels) {
							Long efbfStatus = efBusinessFeesModel.getEfbfStatus();
							if (null != efbfStatus && (Constants.EFBF_STATUS_2.equals(efbfStatus) || Constants.EFBF_STATUS_3.equals(efbfStatus) || Constants.EFBF_STATUS_4.equals(efbfStatus)) || Constants.EFBF_STATUS_9.equals(efbfStatus)) {
								errm = errm + "系统订单号为" + eoOrderModel.getEoorOrderNo() + ":可能存在接收成功、上传成功、审核成功、正在上传的费用，不允许删除\n";
							}
						}
					}
					//如果校验信息为空则可以删除订单,不为空将错误信息返回
					if (EmptyUtils.isEmpty(errm)) {
						eoOrderModel.setEoorStatus(Constants.ORDER_DELETE);
						this.eoOrderManager.save(eoOrderModel);
					}
				}
			}
		}
		return errm;
	}
	
	@Override
	public ResponseData<List<EfBusinessFeesModel>> saveAutomaticChargingByEoorId(Long[] eoorIds) {
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<List<EfBusinessFeesModel>>();
		if (eoorIds.length > 0) {
			for (Long eoorId : eoorIds) {
				if (null != eoorId) {
					//1.查询订单
					EoOrderModel eoOrderModel = eoOrderManager.get(eoorId);
					List<FilterCondition> eoOrderExpandAgencyFilterCondition = new ArrayList<>();
					eoOrderExpandAgencyFilterCondition.add(new FilterCondition("eoeaEoorId",eoorId,"="));
					//2.获取订单代理扩展表
					List<EoOrderExpandAgencyModel> eoOrderExpandAgencyModelList = eoOrderExpandAgencyManager.findByCondition(eoOrderExpandAgencyFilterCondition);
					if (null != eoOrderModel && EmptyUtils.isNotEmpty(eoOrderExpandAgencyModelList)) {//验证是否有订单和是否有订单代理扩展表
						List<FilterCondition> eoOrderFilterCondition = new ArrayList<>();
						eoOrderFilterCondition.add(new FilterCondition("elplEscoId",eoOrderModel.getEoorEscoId(),"="));
						eoOrderFilterCondition.add(new FilterCondition("elplEbpjId",eoOrderModel.getEoorEbpjId(),"="));
						eoOrderFilterCondition.add(new FilterCondition("elplCustomerEbcuId",eoOrderModel.getEoorConsignorEbcuId(),"="));
						//3.根据公司和订单委托方筛选协议
						List<ElProtocolModel> elProtocolModelList = elProtocolManager.findByCondition(eoOrderFilterCondition);
						if (EmptyUtils.isNotEmpty(elProtocolModelList)) {//验证这个订单是否有匹配的协议
							responseData = this.getEoOrderAndElProtocol(eoOrderModel,elProtocolModelList,eoOrderExpandAgencyModelList);
						} else {
							responseData.setCode(Constants.NO);
							responseData.setMsg("计费失败，未匹配到协议");
						}
					} else {
						responseData.setCode(Constants.NO);
						responseData.setMsg("订单信息为空");
					}
				} 
			}
		}else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单id为空");
		}
		return responseData;
	}
	
	/**
	 * @deprecated:订单委托方匹配协议客商名称
	 * @author Colley.Bai  
	 * @date 2018年11月27日
	 * @param eoOrderModel
	 * @param elProtocolModelList
	 * @return
	 */
	public ResponseData<List<EfBusinessFeesModel>> getEoOrderAndElProtocol(EoOrderModel eoOrderModel,List<ElProtocolModel> elProtocolModelList,List<EoOrderExpandAgencyModel> eoOrderExpandAgencyModelList){
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		for (ElProtocolModel elProtocolModel:elProtocolModelList) {//遍历协议
			//判断协议类型是否是委托协议 1.委托协议 2.订舱协议 3.报关协议 4.拖车协议
			if (Constants.ELPL_TYPE_ORDER.equals(elProtocolModel.getElplType())) {
					//新增状态和启用状态
					if (Constants.SYS_STATUS_ADD.equals(elProtocolModel.getElplStatus()) || Constants.SYS_STATUS_ENABLE.equals(elProtocolModel.getElplStatus())) {
						SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
						Date elplEffectiveDateTo = null;
						Date newDate = null;
						try {
							//失效日期
							elplEffectiveDateTo = sdf.parse(sdf.format(elProtocolModel.getElplEffectiveDateTo())); 
							//当前时间
							newDate = sdf.parse(sdf.format(new Date()));
							//比较该协议是否失效
							if (newDate.getTime() <= elplEffectiveDateTo.getTime()) {
								Map<String, Object> condition = new HashMap<>();
								condition.put("epccElplId",elProtocolModel.getElplId());
								//从订单代理扩展表匹配协议条件分类装货港
								condition.put("epccLoadPortId",eoOrderExpandAgencyModelList.get(0).getEoeaLoadPortId());
								//从订单代理扩展表匹配协议条件分类卸货港
								condition.put("epccDischargePortId",eoOrderExpandAgencyModelList.get(0).getEoeaDischargePortId());
								//从订单代理扩展表匹配协议条件分类船公司
								condition.put("epccShipId",eoOrderExpandAgencyModelList.get(0).getEoeaCarrierId());
								//从订单代理扩展表匹配协议条件分类订舱代理
//								condition.put("epccShipAgentId",eoOrderExpandAgencyModelList.get(0).getEoeaBookingAgentId());
								//从订单代理扩展表匹配协议条件分类运输条款
								condition.put("epccFreightClauseCode",eoOrderExpandAgencyModelList.get(0).getEoeaFreightClauseCode());
								//从订单代理扩展表匹配协议条件分类装运方式
//								condition.put("epccLmId",eoOrderExpandAgencyModelList.get(0).getEoeaLmId());
								//从订单代理扩展表匹配协议条件分类销售人员
								condition.put("epccBmsEbsmCode",eoOrderModel.getEoorBmsEbsmCode());
								//从订单代理扩展表匹配协议条件分类报关
								condition.put("epccIsDeclaration",eoOrderExpandAgencyModelList.get(0).getEoeaIsCustoms());
								//从订单代理扩展表匹配协议条件分类订舱
								condition.put("epccIsBooking",eoOrderExpandAgencyModelList.get(0).getEoeaIsBooking());
								//从订单代理扩展表匹配协议条件分类拖车
								condition.put("epccIsTrailer",eoOrderExpandAgencyModelList.get(0).getEoeaIsTrailer());
								
								//1.获取匹配协议条件分类
								List<ElProtocolCostConModel> elProtocolCostConModelList = elProtocolCostConManager.queryByCondition(condition);
								if (EmptyUtils.isNotEmpty(elProtocolCostConModelList)) {
									//遍历协议分类1.如果从协议明细在找协议分类会很慢，因为协议明细会很多
									for (ElProtocolCostConModel elProtocolCostConModel:elProtocolCostConModelList) {
										List<FilterCondition> elProtocolCostConFilterCondition = new ArrayList<>();
										elProtocolCostConFilterCondition.add(new FilterCondition("epctId",elProtocolCostConModel.getEpccEpctId(),"="));
										//1.2 协议状态 （启用）
										elProtocolCostConFilterCondition.add(new FilterCondition("epctStatus","Y","="));
										//2.获取到协议明细信息，所谓的条件费用信息
										List<ElProtocolCostModel> elProtocolCostModelList = elProtocolCostManager.findByCondition(elProtocolCostConFilterCondition);
										if (EmptyUtils.isNotEmpty(elProtocolCostModelList)) {
											responseData = this.getElelProtocolCostFeelByEpccId(elProtocolCostModelList, elProtocolCostConModel,eoOrderModel);
										} else {
											responseData.setCode(Constants.NO);
											responseData.setMsg("计费失败，未匹配到协议明细");
										}
									}
								} else {
									responseData.setCode(Constants.NO);
									responseData.setMsg("计费失败，未匹配到协议条件分类");
								}
							} else {
								responseData.setCode(Constants.NO);
								responseData.setMsg("计费失败，协议已经到期了");
							}
						} catch (ParseException e) {
							e.printStackTrace();
							log.error("时间转换异常" + elProtocolModel.getElplEffectiveDateTo());
						}
				} else {
					responseData.setCode(Constants.NO);
					responseData.setMsg("计费失败，未匹配到可用协议");
				}
			} else {
				responseData.setCode(Constants.NO);
				responseData.setMsg("计费失败，未匹配到委托协议");
			}
		}
		return responseData;
	}
	
	/**
	 * @deprecated:根据协议条件分类查询计算方式并且计算
	 * @author Colley.Bai  
	 * @date 2018年11月28日
	 */
	public ResponseData<List<EfBusinessFeesModel>>  getElelProtocolCostFeelByEpccId(List<ElProtocolCostModel> elProtocolCostModelList,ElProtocolCostConModel elProtocolCostConModel,EoOrderModel eoOrderModel){
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		List<EfBusinessFeesModel> efBusinessFeesModels = new ArrayList<>();
		if (null != elProtocolCostConModel) {
			
			List<FilterCondition> eoOrderFilterCondition = new ArrayList<>();
			eoOrderFilterCondition.add(new FilterCondition("eosrEoorId",eoOrderModel.getEoorId(),"="));
			//1.获取订单预配箱信息
			List<EoOrderPrecontainerModel> eoOrderPrecontainerModelList = eoOrderPrecontainerManager.findByCondition(eoOrderFilterCondition);
			
			List<FilterCondition> elProtocolCostConFilterCondition = new ArrayList<>();
			elProtocolCostConFilterCondition.add(new FilterCondition("epcfEpccId",elProtocolCostConModel.getEpccId(),"="));
			//2.2 条件分类 （启用）
			elProtocolCostConFilterCondition.add(new FilterCondition("epcfStatus","Y","="));
			//2.获取属于这个条件分类的计算方式
			List<ElProtocolCostFeelModel> elProtocolCostFeelModelList = elProtocolCostFeelManager.findByCondition(elProtocolCostConFilterCondition);
			//匹配到的协议明细
			for (ElProtocolCostModel elProtocolCostModel : elProtocolCostModelList) {
				if (EmptyUtils.isNotEmpty(elProtocolCostFeelModelList)) {
					for (ElProtocolCostFeelModel elProtocolCostFeelModel:elProtocolCostFeelModelList) {
						Long number = 0L;
						//3.如果是箱的时候，计算根据箱型
						if (Constants.EPCF_FORMULA_BOX.equals(elProtocolCostFeelModel.getEpcfFormula())) {
							if (EmptyUtils.isNotEmpty(eoOrderPrecontainerModelList)) {
								for (EoOrderPrecontainerModel eoOrderPrecontainerModel:eoOrderPrecontainerModelList) {
									//3.1根据尺寸和箱型匹配计算方式
									if (EmptyUtils.isEqual(eoOrderPrecontainerModel.getEosrCntCustomized() ,elProtocolCostFeelModel.getEpcfContainerSize()) && EmptyUtils.isEqual(eoOrderPrecontainerModel.getEosrCntCustomizedSize(), elProtocolCostFeelModel.getEpcfContainerType())) {
 										//3.2获取订单预配箱数量
										number += eoOrderPrecontainerModel.getEosrCtnNumber() == null ? 0L : eoOrderPrecontainerModel.getEosrCtnNumber();
									}
								}
								if (number > 0L) {
									efBusinessFeesModels = this.getEfBusinessFeesModelByEpctId(elProtocolCostModel,eoOrderModel,number,elProtocolCostFeelModel.getEpcfPrice());
									try {
										responseData = efbfBusinessFeesService.batchSaveBusinessFees(efBusinessFeesModels);
									} catch (Exception e) {
										log.error("自动生成费用异常，" + responseData);
									}
								}
							}
						}
						//4.如果是单的时候，计算是根据1*单价
						else if (Constants.EPCF_FORMULA_SINEGLE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
							number += 1L;
							efBusinessFeesModels = this.getEfBusinessFeesModelByEpctId(elProtocolCostModel,eoOrderModel,number,elProtocolCostFeelModel.getEpcfPrice());
							try {
								responseData = efbfBusinessFeesService.batchSaveBusinessFees(efBusinessFeesModels);
							} catch (Exception e) {
								log.error("自动生成费用异常，" + responseData);
							}
						}
						
						//5.如果是路线的时候，计算是根据1*单价
						else if (Constants.EPCF_FORMULA_ROULE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
							number += 1L;
							efBusinessFeesModels = this.getEfBusinessFeesModelByEpctId(elProtocolCostModel,eoOrderModel,number,elProtocolCostFeelModel.getEpcfPrice());
							try {
								responseData = efbfBusinessFeesService.batchSaveBusinessFees(efBusinessFeesModels);
							} catch (Exception e) {
								log.error("自动生成费用异常，" + responseData);
							}
						} 
						//6.一口价计算，根据1*单价
						else if (Constants.EPCF_FORMULA_PRICE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
							number += 1L;
							efBusinessFeesModels = this.getEfBusinessFeesModelByEpctId(elProtocolCostModel,eoOrderModel,number,elProtocolCostFeelModel.getEpcfPrice());
							try {
								responseData = efbfBusinessFeesService.batchSaveBusinessFees(efBusinessFeesModels);
							} catch (Exception e) {
								log.error("自动生成费用异常，" + responseData);
							}
						}
					}
				}
			}
		}
		return responseData;
	}
	
	/**
	 * @deprecated://1、计费金额=单价*数量  2、含税价=计费金额=单价*数量  3、不含税价=含税价 / (1+税率)
	 * @author Colley.Bai  
	 * @date 2018年11月28日
	 * @return
	 */
	public List<EfBusinessFeesModel> getEfBusinessFeesModelByEpctId(ElProtocolCostModel elProtocolCostModel,EoOrderModel eoOrderModel,Long number,Double price){
		List<EfBusinessFeesModel> efBusinessFeesModelList = new ArrayList<>();
		EfBusinessFeesModel efBusinessFeesModel = new EfBusinessFeesModel();
		
		//获取当前用户
		UserDetails user = SessionContext.getUser();
		//获取平台
		EsCompanyModel esCompanyModel=esCompanyManager.get(Long.valueOf(user.getOrgId()));
			
		List<FilterCondition> conditions = new ArrayList<>();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		conditions.add(new FilterCondition("eberFromCurrency",elProtocolCostModel.getEpctCurrencyType(),"="));//协议明细币种（源币种代码）
		conditions.add(new FilterCondition("eberToCurrency",esCompanyModel.getEscoCurrency(),"="));//平台币种（目标币种代码）
		conditions.add(new FilterCondition("eberEscoId",user.getOrgId(),"="));
		try {
			conditions.add(new FilterCondition("eberConversionDate",formatter.parse(this.getStringDateShort()),"="));//汇率日期
		} catch (ParseException e) {
			e.printStackTrace();
			log.error("汇率日期转换异常");
		}
		List<EbExchangeRateModel> ebExchangeRateModelList = ebExchangeRateManager.findByCondition(conditions);
		//如果是人民币的时候,汇率是自动变成为1
		if (elProtocolCostModel.getEpctCurrencyType().equals(Constants.CURRENCY_CNY)) {
			EbExchangeRateModel ebExchangeRateModel = new EbExchangeRateModel();
			ebExchangeRateModel.setEberConversionRate(1.00);
			ebExchangeRateModelList.add(ebExchangeRateModel);
		}
		if (EmptyUtils.isNotEmpty(ebExchangeRateModelList)) {
			efBusinessFeesModel.setEfbfSettlementEbcuId(elProtocolCostModel.getEpctSettlementEbcuId());//结算对象id
			efBusinessFeesModel.setEfbfSettlementEbcuName(elProtocolCostModel.getEpctSettlementEbcuName());//结算对象名称
			efBusinessFeesModel.setEfbfSettlementEbcuCdh(elProtocolCostModel.getEpctSettlementEbcuCdh());//结算对象财务代码
			efBusinessFeesModel.setEfbfEbfhId(elProtocolCostModel.getEpctEbfhId());//费目id
			efBusinessFeesModel.setEfbfCurrency(elProtocolCostModel.getEpctCurrencyType());//币种
			efBusinessFeesModel.setEfbfType(elProtocolCostModel.getEpctEfbfType());//收/付
			String epctIsDutyfree = elProtocolCostModel.getEpctIsDutyfree() == null ? "0" :elProtocolCostModel.getEpctIsDutyfree();
			efBusinessFeesModel.setEbfhIsDutyfree(Long.valueOf(epctIsDutyfree));//是否含税
			efBusinessFeesModel.setEfbfTaxRate(elProtocolCostModel.getEpctTaxRate());//税率
			Double amount = price;//单价
			if (number == 0L){
				amount = amount * number;
			} 
			efBusinessFeesModel.setEfbfPrice(amount);//单价
			efBusinessFeesModel.setEfbfEoorId(eoOrderModel.getEoorId());//订单主键
			efBusinessFeesModel.setEfbfEscoId(eoOrderModel.getEoorEscoId());//公司主键
			efBusinessFeesModel.setEfbfQuantity(number);//数量
			efBusinessFeesModel.setEfbfExchangeRate(ebExchangeRateModelList.get(0).getEberConversionRate());//汇率
			//计算结算金额和含税价保留两位小数
			BigDecimal bigDecimal = new BigDecimal(amount * number);  
			Double  total = bigDecimal.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue(); 
			efBusinessFeesModel.setEfbfAmount(total);//结算金额
			efBusinessFeesModel.setEfbfTaxAmount(total);//含税价
			//免税
			if (elProtocolCostModel.getEpctIsDutyfree().equals(Constants.IS_DUTYFREE_STRING)) {
				efBusinessFeesModel.setEfbfTaxRate(0.00);
				efBusinessFeesModel.setEfbfTaxFee(amount * number);//不含税价
			}
			//非免税
			if (elProtocolCostModel.getEpctIsDutyfree().equals(Constants.NOT_DUTYFREE_STRING)) {
				Double afterAmount  = (amount * number) / (1 + elProtocolCostModel.getEpctTaxRate());
				BigDecimal afterBigDecimal = new BigDecimal(afterAmount);  
				Double  afterTotal = afterBigDecimal.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
				efBusinessFeesModel.setEfbfTaxFee(afterTotal);//不含税价
			}
			efBusinessFeesModelList.add(efBusinessFeesModel);
		}
		return efBusinessFeesModelList;
	}
	/**
	 * 根据（公司id，项目id，运单号so_no和do_no）查询订单
	 * add by jeffery.Zhang 2018年12月3日
	 * @param conditionMap
	 * @return
	 */
	public ResponseData<QueryData> queryOrderBySpecifyCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> eoResponseData = new ResponseData<QueryData>();
		String eoorEscoId = null;
		String eoorEbpjId = null;
		String eoorSoNo = null;
		String eoorDoNo = null;
		if (EmptyUtils.isNotEmpty(queryInfo.getQueryFields())) {
			for (int i = 0; i < queryInfo.getQueryFields().size(); i++) {
				queryInfo.getQueryFields().get(i).getFieldName();
				queryInfo.getQueryFields().get(i).getFieldValue();
				if ("CDT_eoorEscoId".equals(queryInfo.getQueryFields().get(i).getFieldName())) {
					eoorEscoId = queryInfo.getQueryFields().get(i).getFieldValue().toString();
				}
				if ("CDT_eoorEbpjId".equals(queryInfo.getQueryFields().get(i).getFieldName())) {
					eoorEbpjId = queryInfo.getQueryFields().get(i).getFieldValue().toString();
				}
				if ("CDT_eoorSoNo".equals(queryInfo.getQueryFields().get(i).getFieldName())) {
					eoorSoNo = queryInfo.getQueryFields().get(i).getFieldValue().toString();
				}
				if ("CDT_eoorDoNo".equals(queryInfo.getQueryFields().get(i).getFieldName())) {
					eoorDoNo = queryInfo.getQueryFields().get(i).getFieldValue().toString();
				}
			}
		}else{
			eoResponseData.setCode("N");
			eoResponseData.setMsg("查询失败，查询条件不匹配");
			return eoResponseData;
		}
		if(EmptyUtils.isEmpty(eoorEscoId)){
			eoResponseData.setCode("N");
			eoResponseData.setMsg("查询失败，公司ID不能为空");
			return eoResponseData;
		}
		if(EmptyUtils.isEmpty(eoorEbpjId)){
			eoResponseData.setCode("N");
			eoResponseData.setMsg("查询失败，项目ID不能为空");
			return eoResponseData;
		}
		if(EmptyUtils.isEmpty(eoorSoNo)&&EmptyUtils.isEmpty(eoorDoNo)){
			eoResponseData.setCode("N");
			eoResponseData.setMsg("查询失败，SO_NO和DO_NO至少一个不能为空");
			return eoResponseData;
		}
		QueryData eoOrderList = eoOrderManager.queryOrderByCondition(queryInfo);
		if(EmptyUtils.isNotEmpty(eoOrderList.toString())){
			eoResponseData.setData(eoOrderList);
			eoResponseData.setCode("Y");
			eoResponseData.setMsg("查询成功");
		}else{
			eoResponseData.setCode("N");
			eoResponseData.setMsg("查询失败，查询结果为空");
		}
		return eoResponseData;
	}
	
	/**
	 * @deprecated:获取现在时间
	 * @author Colley.Bai  
	 * @date 2018年12月11日
	 * @return 返回短时间字符串格式yyyy-MM-dd
	 */
	public String getStringDateShort() {
	   Date currentTime = new Date();
	   SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	   String dateString = formatter.format(currentTime);
	   return dateString;
	}


	@Override
	public ResponseData<Map<String, Object>> getBmsEbsmCode() {
		ResponseData<Map<String, Object>> responseData = new ResponseData<>();
		Map<String, Object> bmsEbsmCode = this.eoOrderManager.getBmsEbsmCode();
		responseData.setCode(Constants.YES);
		responseData.setData(bmsEbsmCode);
		responseData.setMsg("获取成功");
		return responseData;
	}
	
	/**
	 * 订单作废时校验该订单下费用是否符合作废要求
	 * @author Shoven.Jiang  
	 * @date 2018年12月20日
	 * @param efbfEoorId
	 * @return
	 */
	public String checkEfbfStatusByEoorId(EoOrderModel eoorModel) {
		Long efbfEoorId = eoorModel.getEoorId();
		String errm = "";//订单作废事收集错误信息
		List<FilterCondition> efbfCondition = new ArrayList<>();
		efbfCondition.add(new FilterCondition("efbfEoorId", efbfEoorId, "="));
		List<EfBusinessFeesModel> efBusinessFeesModels = this.efBusinessFeesManager.findByCondition(efbfCondition);
		if (EmptyUtils.isNotEmpty(efBusinessFeesModels)) {
			for (EfBusinessFeesModel efBusinessFeesModel : efBusinessFeesModels) {
				Long efbfStatus = efBusinessFeesModel.getEfbfStatus();
    			if (efbfStatus != null && efbfStatus >= 2) {
    				errm = eoorModel.getEoorOrderNo();
    				break;
    			}
			}
		}
		return errm;
	}


	@Override
	public ResponseData<EoOrderDto> saveOrderMaterielAndContainer(EoOrderDto eoOrderDto) {
		ResponseData<EoOrderDto> responseData = new ResponseData<>();
		List<EoOrderContainerModel> afterEoOrderContainerModelList = new ArrayList<>();
		//入参集装箱
		List<EoOrderContainerModel> eoOrderContainerModelList = eoOrderDto.getEoOrderContainerModelList();
		//入参物料
		List<EoOrderMaterielModel> eoOrderMaterielModelList = eoOrderDto.getEoOrderMaterielModelList();
		if (EmptyUtils.isNotEmpty(eoOrderMaterielModelList) && EmptyUtils.isNotEmpty(eoOrderContainerModelList)) {
			int count = 0;
			for (int i = 0 ; i < eoOrderContainerModelList.size() - 1 ; i++) {
				for (int j = 1 ; j < eoOrderContainerModelList.size() ; j++) {
					if (EmptyUtils.isNotEqual(eoOrderContainerModelList.get(i).getEoocContainerSize(),eoOrderContainerModelList.get(j).getEoocContainerSize()) && i != j) {
						count += 1;
					} 
				}
			}
			afterEoOrderContainerModelList = this.updateOrderContainer(eoOrderContainerModelList);
			this.updateOrderMateriel(eoOrderMaterielModelList);
			if (count > 0) {
				afterEoOrderContainerModelList = this.unIdenticalBoxSizEoOrderMateriel(afterEoOrderContainerModelList, eoOrderMaterielModelList);
			} else {
				afterEoOrderContainerModelList = this.identicalBoxSizEoOrderMateriel(afterEoOrderContainerModelList, eoOrderMaterielModelList);
			}
		}
		eoOrderDto.setEoOrderContainerModelList(afterEoOrderContainerModelList);
		
		if (EmptyUtils.isNotEmpty(afterEoOrderContainerModelList)) {
			responseData.setCode(Constants.YES);
			responseData.setData(eoOrderDto);
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("分配失败");
		}
		return responseData;
	}
	
	/**
	 * @deprecated:更新物料（业务关系表）第二次均分物料做准备
	 * @author Colley.Bai  
	 * @date 2018年12月25日
	 * @param eoOrderMaterielModelList
	 * @return
	 */
	public List<EoOrderMaterielModel> updateOrderMateriel(List<EoOrderMaterielModel> eoOrderMaterielModelList){
		List<EoOrderMaterielModel> afterEoOrderMaterielModelList = new ArrayList<>();
		for (EoOrderMaterielModel eoOrderMaterielModel : eoOrderMaterielModelList) {
			List<FilterCondition> eoOutmportJoabMaterielCondition = new ArrayList<>();
			eoOutmportJoabMaterielCondition.add(new FilterCondition("eomjEoomId",eoOrderMaterielModel.getEoomId(),"="));
			//获取业务物料信息，是为了判断是否已经有了业务箱信息，如果没有则进行添加业务物料操作，因为业务物料和订单物料是1对1的关系
			List<EoOutmportJoabMaterielModel>  eoOutmportJoabMaterielList= eoOutmportJoabMaterielManager.findByCondition(eoOutmportJoabMaterielCondition);
			//获取业务物料信息，是为了判断是否已经有了业务箱信息
			if (EmptyUtils.isNotEmpty(eoOutmportJoabMaterielList)) {
				for (EoOutmportJoabMaterielModel eoOutmportJoabMaterielModel : eoOutmportJoabMaterielList) {
					List<FilterCondition> eoOutmportJoabMaterieFilterCondition = new ArrayList<>();
					eoOutmportJoabMaterieFilterCondition.add(new FilterCondition("eoejEomjId",eoOutmportJoabMaterielModel.getEomjId() ,"="));
					List<EoEoob2EomjModel> eoEoob2EomjModelList = eoEoob2EomjManager.findByCondition(eoOutmportJoabMaterieFilterCondition);
					if (EmptyUtils.isNotEmpty(eoEoob2EomjModelList)) {
						for (EoEoob2EomjModel eoEoob2EomjModel : eoEoob2EomjModelList) {
							eoEoob2EomjManager.delete(eoEoob2EomjModel);
						}
					}
					eoOutmportJoabMaterielManager.delete(eoOutmportJoabMaterielModel);
				}
			}
		}
		return afterEoOrderMaterielModelList;
	}
	
	/**
	 * @deprecated:均分物料之前先清空集装箱毛件体
	 * @author Colley.Bai  
	 * @date 2018年12月25日
	 * @param eoOrderContainerModelList
	 * @return
	 */
	public List<EoOrderContainerModel> updateOrderContainer(List<EoOrderContainerModel> eoOrderContainerModelList){
		List<EoOrderContainerModel> afterEoOrderContainerModelList = new ArrayList<>();
		for (EoOrderContainerModel eoOrderContainerModel :  eoOrderContainerModelList) {
			eoOrderContainerModel.setEoocQuantity(0L);
			eoOrderContainerModel.setEoocWeight(0.00);
			eoOrderContainerModel.setEoocVolume(0.00);
			eoOrderContainerModel = eoOrderContainerManager.save(eoOrderContainerModel);
			afterEoOrderContainerModelList.add(eoOrderContainerModel);
		}
		return afterEoOrderContainerModelList;
	}
	
	/**
	 * @deprecated:相同箱型
	 * @author Colley.Bai  
	 * @date 2018年12月22日
	 * @param eoOrderContainerModelList
	 * @param eoOrderMaterielModelList
	 */
	public List<EoOrderContainerModel> identicalBoxSizEoOrderMateriel(List<EoOrderContainerModel> eoOrderContainerModelList , List<EoOrderMaterielModel> eoOrderMaterielModelList){
		List<EoOrderContainerModel> afterEoOrderContainerModelList = new ArrayList<>();
		//计算箱子的数量
		int count = 0;
		for (int i = 0 ; i < eoOrderContainerModelList.size() ; i++ ) {
			count ++;
		}
		//集装箱装箱数量总和（多）
		Double 	eoomQuantityTotal = 0.00;
		Double 	eoomGrossWeightTotal = 0.00;
		Double 	eoomVolumeTotal = 0.00;
		for (int i = 0 ; i <  eoOrderContainerModelList.size() ; i++ ) {
			
			//集装箱装箱数量总和（单）
			Double 	afterEoomQuantityTo = 0.00;
			Double 	afterEoomGrossWeightTo = 0.00;
			Double 	afterEoomVolumeTo = 0.00;
			//单个物料总件数
			Double 	afterEoomQuantityTotal = 0.00;
			Double 	afterEoomGrossWeightTotal = 0.00;
			Double 	afterEoomVolumeTotal = 0.00;
			for (int j = 0 ; j < eoOrderMaterielModelList.size() ; j++) {
					//件数
					Double eoomQuantity = eoOrderMaterielModelList.get(j).getEoomQuantity() == null ? 0.00 : eoOrderMaterielModelList.get(j).getEoomQuantity();
					//毛重
					Double eoomGrossWeight = eoOrderMaterielModelList.get(j).getEoomGrossWeight()  == null ? 0.00 : eoOrderMaterielModelList.get(j).getEoomGrossWeight();
					//体积
					Double eoomVolume = eoOrderMaterielModelList.get(j).getEoomVolume()  == null ? 0.00 : eoOrderMaterielModelList.get(j).getEoomVolume();
				
					//把件数、毛重、体积总和体积
					afterEoomQuantityTotal += eoomQuantity;
					afterEoomGrossWeightTotal += eoomGrossWeight;
					afterEoomVolumeTotal += eoomVolume;
					
					eoomQuantity = eoomQuantity / count;
					eoomGrossWeight = eoomGrossWeight / count;
					eoomVolume = eoomVolume / count;
					
					BigDecimal eoomQuantityBigDecimal = new BigDecimal(eoomQuantity);  
					BigDecimal eoomGrossWeightBigDecimal = new BigDecimal(eoomGrossWeight);  
					BigDecimal eoomVolumeBigDecimal = new BigDecimal(eoomVolume);  
					
					//判断是否是最后一个箱子
					if ( i != eoOrderContainerModelList.size() - 1) { 
						Double afterEoomQuantity = eoomQuantityBigDecimal.setScale(0,BigDecimal.ROUND_HALF_UP).doubleValue();
						eoOrderContainerModelList.get(i).setEoocQuantity(afterEoomQuantity.longValue());
						eoomQuantityTotal += afterEoomQuantity.longValue();
						afterEoomQuantityTo += afterEoomQuantity.longValue();
						
						Double afterEoomGrossWeight = eoomGrossWeightBigDecimal.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
						eoOrderContainerModelList.get(i).setEoocWeight(afterEoomGrossWeight);
						eoomGrossWeightTotal += afterEoomGrossWeight;
						afterEoomGrossWeightTo += afterEoomGrossWeight;
						
						Double afterEoomVolume = eoomVolumeBigDecimal.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
						eoOrderContainerModelList.get(i).setEoocVolume(afterEoomVolume);
						eoomVolumeTotal += afterEoomVolume;
						afterEoomVolumeTo += afterEoomVolume;
						
					} else {
						//业务关系表装箱总数
						Double 	quantityTotal = 0.00;
						Double 	grossWeightTotal = 0.00;
						Double 	volumeTotal = 0.00;
						List<FilterCondition> eoOutmportJoabMaterielCondition = new ArrayList<>();
						eoOutmportJoabMaterielCondition.add(new FilterCondition("eomjEoomId",eoOrderMaterielModelList.get(j).getEoomId(),"="));
						//获取业务物料信息，是为了判断是否已经有了业务箱信息，如果没有则进行添加业务物料操作，因为业务物料和订单物料是1对1的关系
						List<EoOutmportJoabMaterielModel>  eoOutmportJoabMaterielList= eoOutmportJoabMaterielManager.findByCondition(eoOutmportJoabMaterielCondition);//获取业务物料信息，是为了判断是否已经有了业务箱信息
						if (EmptyUtils.isNotEmpty(eoOutmportJoabMaterielList)) {
							for (EoOutmportJoabMaterielModel eoOutmportJoabMaterielModel : eoOutmportJoabMaterielList) {
								List<FilterCondition> filterCondition = new ArrayList<>();
								filterCondition.add(new FilterCondition("eoejEomjId",eoOutmportJoabMaterielModel.getEomjId(),"="));
								List<EoEoob2EomjModel> eoEoob2EomjModelList = eoEoob2EomjManager.findByCondition(filterCondition);
								//判断该物料已经装箱的数量
								if (EmptyUtils.isNotEmpty(eoEoob2EomjModelList)) {
									for (EoEoob2EomjModel afterEoEoob2EomjModel : eoEoob2EomjModelList) {
										quantityTotal += afterEoEoob2EomjModel.getEoejQuantity();
										grossWeightTotal += afterEoEoob2EomjModel.getEoejGrossWeight();
										volumeTotal += afterEoEoob2EomjModel.getEoejMeasurement();
									}
								}
							}
						}
						//剩余物料 = 总数  -  已装箱物料 
						Double afterQuantityTotal = eoOrderMaterielModelList.get(j).getEoomQuantity() - quantityTotal;
						eoOrderContainerModelList.get(i).setEoocQuantity(afterQuantityTotal.longValue());
						eoOrderContainerModelList.get(i).setEoocWeight(eoOrderMaterielModelList.get(j).getEoomGrossWeight() - grossWeightTotal);
						eoOrderContainerModelList.get(i).setEoocVolume(eoOrderMaterielModelList.get(j).getEoomVolume() - volumeTotal);
					}
					
					//保存物料信息
					EoEoob2EomjModel eoEoob2EomjModel = this.saveEoEoob2Eomj(eoOrderContainerModelList.get(i), eoOrderMaterielModelList.get(j));
					if (null != eoEoob2EomjModel) {
						log.error("业务物料和业务物料和箱关系保存失败" + eoEoob2EomjModel);
					}
			}
			//判断是否是最后一个箱子
			if ( i != eoOrderContainerModelList.size() - 1) {
				BigDecimal afterBigEoomQuantityTotal = new BigDecimal(afterEoomQuantityTo);  
				Double aftertBigTotal = afterBigEoomQuantityTotal.setScale(0,BigDecimal.ROUND_HALF_UP).doubleValue();
				eoOrderContainerModelList.get(i).setEoocQuantity(aftertBigTotal.longValue());
				
				BigDecimal afterBigEoomGrossWeightTotal = new BigDecimal(afterEoomGrossWeightTo);  
				Double afterBigGrossWeightTotal = afterBigEoomGrossWeightTotal.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
				eoOrderContainerModelList.get(i).setEoocWeight(afterBigGrossWeightTotal);
				
				BigDecimal afterBigEoomVolumeTotal = new BigDecimal(afterEoomVolumeTo);  
				Double afterVolumeTotal = afterBigEoomVolumeTotal.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
				eoOrderContainerModelList.get(i).setEoocVolume(afterVolumeTotal);
				
				EoOrderContainerModel afterEoOrderContainerModel = eoOrderContainerManager.save(eoOrderContainerModelList.get(i));
				afterEoOrderContainerModelList.add(afterEoOrderContainerModel);
			} 
			//把剩余物料装到最后一个箱子中
			else {
				Double total = afterEoomQuantityTotal - eoomQuantityTotal;
				BigDecimal aftertBigTotal = new BigDecimal(total);  
				 
				Double aftertTotal = aftertBigTotal.setScale(0,BigDecimal.ROUND_HALF_UP).doubleValue();
				eoOrderContainerModelList.get(eoOrderContainerModelList.size() - 1).setEoocQuantity(aftertTotal.longValue());
				
				BigDecimal afterBigGrossWeightTo = new BigDecimal(afterEoomGrossWeightTotal - eoomGrossWeightTotal); 
				Double afterGrossWeightTo = afterBigGrossWeightTo.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
				eoOrderContainerModelList.get(eoOrderContainerModelList.size() - 1).setEoocWeight(afterGrossWeightTo);
				
				BigDecimal afterBigEoomVolumeTo = new BigDecimal(afterEoomVolumeTotal - eoomVolumeTotal);  
				Double afterVolumeTo = afterBigEoomVolumeTo.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
				eoOrderContainerModelList.get(eoOrderContainerModelList.size() - 1).setEoocVolume(afterVolumeTo);
				
				EoOrderContainerModel afterEoOrderContainerModel = eoOrderContainerManager.save(eoOrderContainerModelList.get(eoOrderContainerModelList.size() - 1));
				afterEoOrderContainerModelList.add(afterEoOrderContainerModel);
			}
		}
		return afterEoOrderContainerModelList;
	}
	
	/**
	 * @deprecated:计算不同箱型的时候均分物料（注：最后一个箱子装前几个装剩下的物料）
	 * @author Colley.Bai  
	 * @date 2018年12月24日
	 * @param eoOrderContainerModelList
	 * @param eoOrderMaterielModelList
	 * @return
	 */
	public List<EoOrderContainerModel> unIdenticalBoxSizEoOrderMateriel(List<EoOrderContainerModel> eoOrderContainerModelList , List<EoOrderMaterielModel> eoOrderMaterielModelList){
		List<EoOrderContainerModel> afterEoOrderContainerModelList = new ArrayList<>();
		//计算箱子的数量
		int twentyCount = 0;//20
		int fortyCount = 0;//40
		int fortyFiveCount = 0;//45
		for (EoOrderContainerModel eoOrderContainerModel : eoOrderContainerModelList) {
			if (Constants.BOX_SIZE_TWENTY.equals(eoOrderContainerModel.getEoocContainerSize())) {
				twentyCount ++;
			}
			if (Constants.BOX_SIZE_FORTY.equals(eoOrderContainerModel.getEoocContainerSize())) {
				fortyCount ++;
			}
			if (Constants.BOX_SIZE_FORTY_FIVE.equals(eoOrderContainerModel.getEoocContainerSize())) {
				fortyFiveCount ++;
			}
		}
		//总集装箱装箱数量总和
		Double 	eoomQuantityTotal = 0.00;
		Double 	eoomGrossWeightTotal = 0.00;
		Double 	eoomVolumeTotal = 0.00;
		for (int i = 0; i < eoOrderContainerModelList.size() ; i++) {
			//单个集装箱装箱数量总和
			Double 	afterEoomQuantityTotal = 0.00;
			Double 	afterEoomGrossWeightTotal = 0.00;
			Double 	afterEoomVolumeTotal = 0.00;
			//总数
			Double afterEoomQuantityTo = 0.00;
			Double afterEoomGrossWeightTo = 0.00;
			Double afterEoomVolumeTo = 0.00;
			for (int j = 0; j < eoOrderMaterielModelList.size() ; j++ ) {
				//件数
				Double eoomQuantity = eoOrderMaterielModelList.get(j).getEoomQuantity() == null ? 0.00 : eoOrderMaterielModelList.get(j).getEoomQuantity();
				//毛重
				Double eoomGrossWeight = eoOrderMaterielModelList.get(j).getEoomGrossWeight()  == null ? 0.00 : eoOrderMaterielModelList.get(j).getEoomGrossWeight();
				//体积
				Double eoomVolume = eoOrderMaterielModelList.get(j).getEoomVolume()  == null ? 0.00 : eoOrderMaterielModelList.get(j).getEoomVolume();
				//把件数、毛重、体积总和体积
				afterEoomQuantityTo += eoomQuantity;
				afterEoomGrossWeightTo += eoomGrossWeight;
				afterEoomVolumeTo += eoomVolume;
				//以20寸箱子为基础来计算
				eoomQuantity = eoomQuantity / (twentyCount + fortyCount * 2 + fortyFiveCount * 2);
				eoomGrossWeight = eoomGrossWeight / (twentyCount + fortyCount * 2 + fortyFiveCount* 2);
				eoomVolume = eoomVolume / (twentyCount + fortyCount * 2 + fortyFiveCount* 2);
				
				BigDecimal eoomQuantityBigDecimal = new BigDecimal(eoomQuantity);  
				BigDecimal eoomGrossWeightBigDecimal = new BigDecimal(eoomGrossWeight);  
				BigDecimal eoomVolumeBigDecimal = new BigDecimal(eoomVolume);  
				//判断是否是最后一个箱子
				if ( i != eoOrderContainerModelList.size() - 1) { 
					Double afterEoomQuantity = eoomQuantityBigDecimal.setScale(0,BigDecimal.ROUND_HALF_UP).doubleValue();
					if (Constants.BOX_SIZE_TWENTY.equals(eoOrderContainerModelList.get(i).getEoocContainerSize())) {
						eoOrderContainerModelList.get(i).setEoocQuantity(afterEoomQuantity.longValue());
						eoomQuantityTotal += afterEoomQuantity.longValue();
						afterEoomQuantityTotal += afterEoomQuantity.longValue();
					} else {
						eoOrderContainerModelList.get(i).setEoocQuantity(afterEoomQuantity.longValue() * 2);
						eoomQuantityTotal += afterEoomQuantity.longValue() * 2;
						afterEoomQuantityTotal += afterEoomQuantity.longValue() * 2;
					}
					Double afterEoomGrossWeight = eoomGrossWeightBigDecimal.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
					if (Constants.BOX_SIZE_TWENTY.equals(eoOrderContainerModelList.get(i).getEoocContainerSize())) {
						eoOrderContainerModelList.get(i).setEoocWeight(afterEoomGrossWeight);
						eoomGrossWeightTotal += afterEoomGrossWeight;
						afterEoomGrossWeightTotal += afterEoomGrossWeight;
					} else {
						eoOrderContainerModelList.get(i).setEoocWeight(afterEoomGrossWeight * 2);
						eoomGrossWeightTotal += afterEoomGrossWeight * 2;
						afterEoomGrossWeightTotal += afterEoomGrossWeight * 2;
					}
					Double afterEoomVolume = eoomVolumeBigDecimal.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
					if (Constants.BOX_SIZE_TWENTY.equals(eoOrderContainerModelList.get(i).getEoocContainerSize())) {
						eoOrderContainerModelList.get(i).setEoocVolume(afterEoomVolume);
						eoomVolumeTotal += afterEoomVolume;
						afterEoomVolumeTotal += afterEoomVolume;
					} else {
						eoOrderContainerModelList.get(i).setEoocVolume(afterEoomVolume * 2);
						eoomVolumeTotal += afterEoomVolume * 2;
						afterEoomVolumeTotal += afterEoomVolume * 2;
					}
				} 
				//判断如果是最后一个箱子的，把剩余物料全部装到最后一个箱子中
				else {
					//业务关系表装箱总数
					Double 	quantityTotal = 0.00;
					Double 	grossWeightTotal = 0.00;
					Double 	volumeTotal = 0.00;
					List<FilterCondition> eoOutmportJoabMaterielCondition = new ArrayList<>();
					eoOutmportJoabMaterielCondition.add(new FilterCondition("eomjEoomId",eoOrderMaterielModelList.get(j).getEoomId(),"="));
					//获取业务物料信息，是为了判断是否已经有了业务箱信息，如果没有则进行添加业务物料操作，因为业务物料和订单物料是1对1的关系
					List<EoOutmportJoabMaterielModel>  eoOutmportJoabMaterielList= eoOutmportJoabMaterielManager.findByCondition(eoOutmportJoabMaterielCondition);//获取业务物料信息，是为了判断是否已经有了业务箱信息
					if (EmptyUtils.isNotEmpty(eoOutmportJoabMaterielList)) {
						for (EoOutmportJoabMaterielModel eoOutmportJoabMaterielModel : eoOutmportJoabMaterielList) {
							List<FilterCondition> filterCondition = new ArrayList<>();
							filterCondition.add(new FilterCondition("eoejEomjId",eoOutmportJoabMaterielModel.getEomjId(),"="));
							List<EoEoob2EomjModel> eoEoob2EomjModelList = eoEoob2EomjManager.findByCondition(filterCondition);
							//判断该物料已经装箱的数量
							if (EmptyUtils.isNotEmpty(eoEoob2EomjModelList)) {
								for (EoEoob2EomjModel afterEoEoob2EomjModel : eoEoob2EomjModelList) {
									quantityTotal += afterEoEoob2EomjModel.getEoejQuantity();
									grossWeightTotal += afterEoEoob2EomjModel.getEoejGrossWeight();
									volumeTotal += afterEoEoob2EomjModel.getEoejMeasurement();
								}
							}
						}
					}
					//剩余物料 = 总数  -  已装箱物料 
					Double afterQuantityTotal = eoOrderMaterielModelList.get(j).getEoomQuantity() - quantityTotal;
					eoOrderContainerModelList.get(i).setEoocQuantity(afterQuantityTotal.longValue());
					eoOrderContainerModelList.get(i).setEoocWeight(eoOrderMaterielModelList.get(j).getEoomGrossWeight() - grossWeightTotal);
					eoOrderContainerModelList.get(i).setEoocVolume(eoOrderMaterielModelList.get(j).getEoomVolume() - volumeTotal);
				}
				
				EoEoob2EomjModel eoEoob2EomjModel = this.saveEoEoob2Eomj(eoOrderContainerModelList.get(i),eoOrderMaterielModelList.get(j));
				if (null != eoEoob2EomjModel) {
					log.error("业务物料和业务物料和箱关系保存失败" + eoEoob2EomjModel);
				}
			}
			//判断是否是最后一个箱子
			if ( i != eoOrderContainerModelList.size() - 1) {
				BigDecimal afterBigEoomQuantityTotal = new BigDecimal(afterEoomQuantityTotal);  
				Double aftertBigTotal = afterBigEoomQuantityTotal.setScale(0,BigDecimal.ROUND_HALF_UP).doubleValue();
				eoOrderContainerModelList.get(i).setEoocQuantity(aftertBigTotal.longValue());
				
				BigDecimal afterBigEoomGrossWeightTotal = new BigDecimal(afterEoomGrossWeightTotal);  
				Double afterBigGrossWeightTotal = afterBigEoomGrossWeightTotal.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
				eoOrderContainerModelList.get(i).setEoocWeight(afterBigGrossWeightTotal);
				
				BigDecimal afterBigEoomVolumeTotal = new BigDecimal(afterEoomVolumeTotal);  
				Double afterVolumeTotal = afterBigEoomVolumeTotal.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
				eoOrderContainerModelList.get(i).setEoocVolume(afterVolumeTotal);
				
				EoOrderContainerModel afterEoOrderContainerModel = eoOrderContainerManager.save(eoOrderContainerModelList.get(i));
				afterEoOrderContainerModelList.add(afterEoOrderContainerModel);
			} 
			//把剩余物料装到最后一个箱子中
			else {
				Double total = afterEoomQuantityTo - eoomQuantityTotal;
				BigDecimal aftertBigTotal = new BigDecimal(total);  
				 
				Double aftertTotal = aftertBigTotal.setScale(0,BigDecimal.ROUND_HALF_UP).doubleValue();
				eoOrderContainerModelList.get(eoOrderContainerModelList.size() - 1).setEoocQuantity(aftertTotal.longValue());
				
				BigDecimal afterBigGrossWeightTo = new BigDecimal(afterEoomGrossWeightTo - eoomGrossWeightTotal); 
				Double afterGrossWeightTo = afterBigGrossWeightTo.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
				eoOrderContainerModelList.get(eoOrderContainerModelList.size() - 1).setEoocWeight(afterGrossWeightTo);
				
				BigDecimal afterBigEoomVolumeTo = new BigDecimal(afterEoomVolumeTo - eoomVolumeTotal);  
				Double afterVolumeTo = afterBigEoomVolumeTo.setScale(3,BigDecimal.ROUND_HALF_UP).doubleValue();
				eoOrderContainerModelList.get(eoOrderContainerModelList.size() - 1).setEoocVolume(afterVolumeTo);
				
				EoOrderContainerModel afterEoOrderContainerModel = eoOrderContainerManager.save(eoOrderContainerModelList.get(eoOrderContainerModelList.size() - 1));
				afterEoOrderContainerModelList.add(afterEoOrderContainerModel);
			}
		}
		return afterEoOrderContainerModelList;
	}
	
	
	/**
	 * @deprecated:生成业务物料和业务物料和业务箱关系数据
	 * @author Colley.Bai  
	 * @date 2018年12月22日
	 * @param eoOrderContainerModel
	 * @param eoOrderMaterielModel
	 * @return
	 */
	public EoEoob2EomjModel saveEoEoob2Eomj(EoOrderContainerModel eoOrderContainerModel,EoOrderMaterielModel eoOrderMaterielModel){
		EoEoob2EomjModel eoEoob2EomjModel = new EoEoob2EomjModel();
		//1.获取箱信息
		List<FilterCondition> eoOutmportJoabBoxCondition = new ArrayList<>();
		eoOutmportJoabBoxCondition.add(new FilterCondition("eoobEoocId",eoOrderContainerModel.getEoocId(),"="));
		List<EoOutmportJoabBoxModel> eoOutmportJoabBoxModelList = eoOutmportJoabBoxManager.findByCondition(eoOutmportJoabBoxCondition);
		//2.物料保存
		EoOutmportJoabMaterielModel eoOutmportJoabMaterielModel = new EoOutmportJoabMaterielModel();
			
		List<FilterCondition> eoOutmportJoabMaterielCondition = new ArrayList<>();
		eoOutmportJoabMaterielCondition.add(new FilterCondition("eomjEoomId",eoOrderMaterielModel.getEoomId(),"="));
		//获取业务物料信息，是为了判断是否已经有了业务箱信息，如果没有则进行添加业务物料操作，因为业务物料和订单物料是1对1的关系
		List<EoOutmportJoabMaterielModel>  eoOutmportJoabMaterielList= eoOutmportJoabMaterielManager.findByCondition(eoOutmportJoabMaterielCondition);//获取业务物料信息，是为了判断是否已经有了业务箱信息
		
		if (EmptyUtils.isNotEmpty(eoOutmportJoabMaterielList)) {
			//这步操作是更新数据，在更新数据的时候返回对象里有业务物料主键，在报关箱和物料关系时候用着，这步操作必须有，否者回保存不了业务箱和物料关系
			for (EoOutmportJoabMaterielModel afterEoOutmportJoabMaterielModel:eoOutmportJoabMaterielList) {
				eoOutmportJoabMaterielModel = eoOutmportJoabMaterielManager.save(afterEoOutmportJoabMaterielModel);
			}
		} else {
			EoOutmportJoabMaterielModel afterEoOutmportJoabMaterielModel = new EoOutmportJoabMaterielModel();
			//这个对象是为了多个物料保存的时候不保存同意物料信息
			afterEoOutmportJoabMaterielModel.setEomjEoomId(eoOrderMaterielModel.getEoomId());//物料外键
			afterEoOutmportJoabMaterielModel.setEomjEofoId(eoOutmportJoabBoxModelList.get(0).getEoobEofoId());//业务
			eoOutmportJoabMaterielModel = eoOutmportJoabMaterielManager.save(afterEoOutmportJoabMaterielModel);
		}
		
		
		eoEoob2EomjModel.setEoejEomjId(eoOutmportJoabMaterielModel.getEomjId());//请求表物料
		eoEoob2EomjModel.setEoejEoobId(eoOutmportJoabBoxModelList.get(0).getEoobId());//请求表箱
		eoEoob2EomjModel.setEoejQuantity(eoOrderContainerModel.getEoocQuantity().intValue());//件数
		eoEoob2EomjModel.setEoejGrossWeight(eoOrderContainerModel.getEoocWeight());//重量
		eoEoob2EomjModel.setEoejMeasurement(eoOrderContainerModel.getEoocVolume());//体积
		
		eoEoob2EomjModel = eoEoob2EomjManager.save(eoEoob2EomjModel);
		
		return eoEoob2EomjModel;
	}
	/**
	 * @deprecated:内部状态跟踪（订单执行）
	 * @author Colley.Bai  
	 * @date 2018年12月27日
	 * @param eoorId
	 */
	public void saveDpInTrack(Long eoorId){
		List<FilterCondition> filterCondition = new ArrayList<>();
		filterCondition.add(new FilterCondition("dpitBridId",eoorId,"="));
		filterCondition.add(new FilterCondition("dpitOrderId",eoorId,"="));
		filterCondition.add(new FilterCondition("dpitType",Constants.DPIT_TYPE_IMPLEMENT,"="));
		//1、用户信息
		UserDetails user = SessionContext.getUser();
		//2、查询是否有内部状态生成
		List<DpInTrackModel> dpInTrackModelList = dpInTrackManager.findByCondition(filterCondition);
		if (EmptyUtils.isNotEmpty(dpInTrackModelList)) {
			for (DpInTrackModel dpInTrackModel : dpInTrackModelList) {
				//业务操作时间
				dpInTrackModel.setDpitOperatorTime(new Date());
				//业务操作人
				dpInTrackModel.setDpitOperator(user.getUserId());
				dpInTrackManager.save(dpInTrackModel);
			}
		} else {
			DpInTrackModel dpInTrackModel = new DpInTrackModel();
			//业务请求主键
			dpInTrackModel.setDpitBridId(eoorId);
			//订单ID
			dpInTrackModel.setDpitOrderId(eoorId);
			//内部状态
			dpInTrackModel.setDpitType(Constants.DPIT_TYPE_IMPLEMENT);
			//业务操作时间
			dpInTrackModel.setDpitOperatorTime(new Date());
			//业务操作人
			dpInTrackModel.setDpitOperator(user.getUserId());
			dpInTrackManager.save(dpInTrackModel);
		}
		
	}

	@Override
	public ResponseData<EoOrderDto> copyEoorAndEoeaAndEosrAndEoomByEoorId(Long eoorId) {
		// 订单物料复制
		return null;
	}
	
	/**
	 * 订单保存的方法，通过解析Dto中的数据进行保存
	 * @author Shoven 2018年8月4日23:01:39
	 * @param eoOrderDto
	 * @return ResponseData<EoOrderDto>
	 */
	@Override
	public ResponseData<EoOrderDto> saveOrderByTypeI(EoOrderDto eoOrderDto) {
		ResponseData<EoOrderDto> saveOrderDto = this.eoOrderManager.saveOrderByTypeI(eoOrderDto);
		return saveOrderDto;
	}


	@Override
	public ResponseData<EoOrderDto> saveOrderImportMateriel(EoOrderDto eoOrderDto) {
		ResponseData<EoOrderDto> responseData = new ResponseData<EoOrderDto>();
		EoOrderDto afterEoOrderDto = new EoOrderDto();
		List<EoOrderMaterielModel> afterEoOrderMaterielModelList = new ArrayList<>();
		List<EoOrderContainerModel> afterEoOrderContainerModelList = new ArrayList<>();
		List<EoOrderMaterielModel> eoOrderMaterielModelList = eoOrderDto.getEoOrderMaterielModelList();
		List<EoOrderContainerModel> eoOrderContainerModelList = eoOrderDto.getEoOrderContainerModelList();
		if (EmptyUtils.isNotEmpty(eoOrderContainerModelList)) {
			if (EmptyUtils.isNotEmpty(eoOrderMaterielModelList)) {
				for (EoOrderMaterielModel eoOrderMaterielModel : eoOrderMaterielModelList) {
					//新物料
					Double afterEoomQuantity = eoOrderMaterielModel.getEoomQuantity() == null ? 0.00 : eoOrderMaterielModel.getEoomQuantity();
					Double afterEoomGrossWeight = eoOrderMaterielModel.getEoomGrossWeight() == null ? 0.00 : eoOrderMaterielModel.getEoomGrossWeight();
					Double afterEoomVolume = eoOrderMaterielModel.getEoomVolume() == null ? 0.00 : eoOrderMaterielModel.getEoomVolume();
					Double afterEoomNetWeight = eoOrderMaterielModel.getEoomNetWeight() == null ? 0.00 : eoOrderMaterielModel.getEoomNetWeight();
					
					for (EoOrderContainerModel eoOrderContainerModel : eoOrderContainerModelList) {
						//1.查找对应的集装箱信息
						EoOrderContainerModel afterEoOrderContainerModel = eoOrderContainerManager.get(eoOrderContainerModel.getEoocId());
						//2.集装箱以有毛、件、体
						Long eoocQuantity = afterEoOrderContainerModel.getEoocQuantity() == null ? 0 : afterEoOrderContainerModel.getEoocQuantity();
						Double eoocVolume = afterEoOrderContainerModel.getEoocVolume() == null ? 0.00 : afterEoOrderContainerModel.getEoocVolume();
						Double eoocWeight = afterEoOrderContainerModel.getEoocWeight() == null ? 0.00 : afterEoOrderContainerModel.getEoocWeight();
						//3.判断是新增物料还是更新物料，
						//3.1如果是更新物料进行根据业务箱和业务物料获取业务箱和物料明细毛件体
						//3.2剩余物料=集装箱原始物料-装箱物料
						if (null != eoOrderMaterielModel.getEoomId()) {
							//4.获取业务物料
							List<FilterCondition> eoimFilterCondition = new ArrayList<>();
							eoimFilterCondition.add(new FilterCondition("eoimEoomId", eoOrderMaterielModel.getEoomId() ,"="));
							List<EoImportJoabMaterielModel> eoImportJoabMaterielModelList = eoImportJoabMaterielManager.findByCondition(eoimFilterCondition);
							if (EmptyUtils.isNotEmpty(eoImportJoabMaterielModelList)) {
								for (EoImportJoabMaterielModel eoImportJoabMaterielModel : eoImportJoabMaterielModelList) {
									//5.获取业务箱和物料明细
									List<FilterCondition> eoeiFilterCondition = new ArrayList<>();
									eoeiFilterCondition.add(new FilterCondition("eoeiEoimId", eoImportJoabMaterielModel.getEoimId() ,"="));
									//6.获取进口业务箱（精准定位）
									List<FilterCondition> eoibFilterCondition = new ArrayList<>();
									eoibFilterCondition.add(new FilterCondition("eoibEoocId", eoOrderContainerModel.getEoocId(), "="));
									List<EoImportJoabBoxModel> eoImportJoabBoxModelList = eoImportJoabBoxManager.findByCondition(eoibFilterCondition);
									if (EmptyUtils.isNotEmpty(eoImportJoabBoxModelList)) {
										for (EoImportJoabBoxModel eoImportJoabBoxModel : eoImportJoabBoxModelList) {
											eoeiFilterCondition.add(new FilterCondition("eoeiEoibId", eoImportJoabBoxModel.getEoibId() ,"="));
											List<EoEoib2EoimModel> eoEoib2EoimModelList = eoEoib2EoimManager.findByCondition(eoeiFilterCondition);
											for (EoEoib2EoimModel eoEoib2EoimModel : eoEoib2EoimModelList) {
												eoocQuantity -= eoEoib2EoimModel.getEoeiQuantity() == null ? 0 : eoEoib2EoimModel.getEoeiQuantity();
												eoocVolume -= eoEoib2EoimModel.getEoeiMeasurement() == null ? 0.00 : eoEoib2EoimModel.getEoeiMeasurement();
												eoocWeight  -= eoEoib2EoimModel.getEoeiGrossWeight() == null ? 0.00 : eoEoib2EoimModel.getEoeiGrossWeight();
											}
										}
									}
								}
							}
						}
						//总物料 = 装箱物料（装箱物料（更新物料）=集装箱原始物料-装箱物料） + 新物料 
						afterEoOrderContainerModel.setEoocQuantity(eoocQuantity + afterEoomQuantity.longValue());
						afterEoOrderContainerModel.setEoocVolume(NumberUtils.getFormatOfLength(eoocVolume + afterEoomVolume,3));
						afterEoOrderContainerModel.setEoocWeight(NumberUtils.getFormatOfLength(eoocWeight + afterEoomGrossWeight,3));
						EoOrderContainerModel endEoOrderContainerModel = eoOrderContainerManager.save(afterEoOrderContainerModel);
						afterEoOrderContainerModelList.add(endEoOrderContainerModel);
					}
					
					List<FilterCondition> eoomFilterCondition = new ArrayList<>();
					eoomFilterCondition.add(new FilterCondition("eoomMaterialNo",eoOrderMaterielModel.getEoomMaterialNo(),"="));
					eoomFilterCondition.add(new FilterCondition("eoomEoorId",eoOrderMaterielModel.getEoomEoorId(),"="));
					//1.查找对应的物料代码对的物料
					List<EoOrderMaterielModel> endEoOrderMaterielModelList = eoOrderMaterielManager.findByCondition(eoomFilterCondition);
					if (EmptyUtils.isNotEmpty(endEoOrderMaterielModelList)) {
						for (EoOrderMaterielModel afterEoOrderMaterielModel : endEoOrderMaterielModelList) {
							//以有物料
							Double eoomQuantity = afterEoOrderMaterielModel.getEoomQuantity() == null ? 0.00 : afterEoOrderMaterielModel.getEoomQuantity();
							Double eoomGrossWeight = afterEoOrderMaterielModel.getEoomGrossWeight() == null ? 0.00 : afterEoOrderMaterielModel.getEoomGrossWeight();
							Double eoomVolume = afterEoOrderMaterielModel.getEoomVolume() == null ? 0.00 : afterEoOrderMaterielModel.getEoomVolume();
							
							if (null != eoOrderMaterielModel.getEoomId()) {
								List<FilterCondition> eoimFilterCondition = new ArrayList<>();
								eoimFilterCondition.add(new FilterCondition("eoimEoomId", eoOrderMaterielModel.getEoomId() ,"="));
								List<EoImportJoabMaterielModel> eoImportJoabMaterielModelList = eoImportJoabMaterielManager.findByCondition(eoimFilterCondition);
								if (EmptyUtils.isNotEmpty(eoImportJoabMaterielModelList)) {
									for (EoImportJoabMaterielModel eoImportJoabMaterielModel : eoImportJoabMaterielModelList) {
										List<FilterCondition> eoeiFilterCondition = new ArrayList<>();
										eoeiFilterCondition.add(new FilterCondition("eoeiEoimId", eoImportJoabMaterielModel.getEoimId() ,"="));
										//定位进口业务箱
										List<FilterCondition> eoibFilterCondition = new ArrayList<>();
										for (EoOrderContainerModel eoOrderContainerModel : eoOrderContainerModelList) {
											eoibFilterCondition.add(new FilterCondition("eoibEoocId", eoOrderContainerModel.getEoocId(), "="));
											List<EoImportJoabBoxModel> eoImportJoabBoxModelList = eoImportJoabBoxManager.findByCondition(eoibFilterCondition);
											if (EmptyUtils.isNotEmpty(eoImportJoabBoxModelList)) {
												for (EoImportJoabBoxModel eoImportJoabBoxModel : eoImportJoabBoxModelList) {
													eoeiFilterCondition.add(new FilterCondition("eoeiEoibId", eoImportJoabBoxModel.getEoibId() ,"="));
													List<EoEoib2EoimModel> eoEoib2EoimModelList = eoEoib2EoimManager.findByCondition(eoeiFilterCondition);
													for (EoEoib2EoimModel eoEoib2EoimModel : eoEoib2EoimModelList) {
														eoomQuantity -= eoEoib2EoimModel.getEoeiQuantity() == null ? 0 : eoEoib2EoimModel.getEoeiQuantity();
														eoomVolume -= eoEoib2EoimModel.getEoeiMeasurement() == null ? 0.00 : eoEoib2EoimModel.getEoeiMeasurement();
														eoomGrossWeight  -= eoEoib2EoimModel.getEoeiGrossWeight() == null ? 0.00 : eoEoib2EoimModel.getEoeiGrossWeight();
													}
												}
											}
										}
										
										
									}
								}
							}
							
							afterEoOrderMaterielModel.setEoomQuantity(NumberUtils.getFormatOfLength(eoomQuantity + afterEoomQuantity,0));
							afterEoOrderMaterielModel.setEoomGrossWeight(NumberUtils.getFormatOfLength(eoomGrossWeight + afterEoomGrossWeight,3));
							afterEoOrderMaterielModel.setEoomVolume(NumberUtils.getFormatOfLength(eoomVolume + afterEoomVolume,3));
							afterEoOrderMaterielModel.setEoomNetWeight(NumberUtils.getFormatOfLength(afterEoomNetWeight,3));
							EoOrderMaterielModel eoOrderMaterielModelTo = eoOrderMaterielManager.save(afterEoOrderMaterielModel);
							afterEoOrderMaterielModelList.add(eoOrderMaterielModelTo);
						}
					} else {
						afterEoOrderMaterielModelList = eoOrderMaterielManager.saveAll(eoOrderMaterielModelList);
					}
					if (EmptyUtils.isNotEmpty(afterEoOrderMaterielModelList)) {
						
						EoImportJoabMaterielModel eoImportJoabMaterielModel = new EoImportJoabMaterielModel();
						
						List<FilterCondition> eoorFilterCondition = new ArrayList<>();
						eoorFilterCondition.add(new FilterCondition( "eofiEoorId", eoOrderMaterielModel.getEoomEoorId(), "="));
						eoorFilterCondition.add(new FilterCondition( "eofiType" , Constants.EOFI_TYPE , "="));
						//业务请求
						List<EoFreightImportModel> eoFreightImportModelList = eoFreightImportManager.findByCondition(eoorFilterCondition);
						if (EmptyUtils.isNotEmpty(eoFreightImportModelList)) {
							for (EoOrderMaterielModel afterEoOrderMaterielModel : afterEoOrderMaterielModelList) {
								
								List<FilterCondition> eoimFilterCondition = new ArrayList<>();
								eoimFilterCondition.add(new FilterCondition("eoimEoomId", afterEoOrderMaterielModel.getEoomId() ,"="));
								eoimFilterCondition.add(new FilterCondition("eoimEofiId", eoFreightImportModelList.get(0).getEofiId() ,"="));
								//1.取出业务物料信息
								List<EoImportJoabMaterielModel> eoImportJoabMaterielModelList = eoImportJoabMaterielManager.findByCondition(eoimFilterCondition);
								//判断业务物料是否已经存在 如果已经存在，则这条物料信息
								if (EmptyUtils.isNotEmpty(eoImportJoabMaterielModelList)) {
									for (EoImportJoabMaterielModel afterEoImportJoabMaterielModel : eoImportJoabMaterielModelList) {
										eoImportJoabMaterielModel.setEoimId(afterEoImportJoabMaterielModel.getEoimId());
										eoImportJoabMaterielModel.setRecVer(afterEoImportJoabMaterielModel.getRecVer());
									}
								}
								eoImportJoabMaterielModel.setEoimEofiId(eoFreightImportModelList.get(0).getEofiId());
								eoImportJoabMaterielModel.setEoimEoomId(afterEoOrderMaterielModel.getEoomId());
								eoImportJoabMaterielModel = eoImportJoabMaterielManager.save(eoImportJoabMaterielModel);
								
								if (EmptyUtils.isNotEmpty(eoOrderContainerModelList)) {
									for (EoOrderContainerModel  eoOrderContainerModel : eoOrderContainerModelList) {
										
										List<FilterCondition> eoibFilterCondition = new ArrayList<>();
										eoibFilterCondition.add(new FilterCondition("eoibEoocId", eoOrderContainerModel.getEoocId() ,"="));
										eoibFilterCondition.add(new FilterCondition("eoibEofiId", eoFreightImportModelList.get(0).getEofiId() ,"="));
										//取出业务箱数据
										List<EoImportJoabBoxModel> eoImportJoabBoxModelList = eoImportJoabBoxManager.findByCondition(eoibFilterCondition);
										
										EoEoib2EoimModel eoEoib2EoimModel = new EoEoib2EoimModel();
										if (EmptyUtils.isNotEmpty(eoImportJoabBoxModelList)) {
											for (EoImportJoabBoxModel eoImportJoabBoxModel : eoImportJoabBoxModelList) {
												if (null != eoOrderMaterielModel.getEoomId()) {
													List<FilterCondition> eoeiFilterCondition = new ArrayList<>();
													eoeiFilterCondition.add(new FilterCondition("eoeiEoimId", eoImportJoabMaterielModel.getEoimId(),"="));
													eoeiFilterCondition.add(new FilterCondition("eoeiEoibId", eoImportJoabBoxModel.getEoibId(),"="));
													List<EoEoib2EoimModel> eoEoib2EoimModelList = eoEoib2EoimManager.findByCondition(eoeiFilterCondition);
													if (EmptyUtils.isNotEmpty(eoEoib2EoimModelList)) {
														for (EoEoib2EoimModel afterEoEoib2EoimModel : eoEoib2EoimModelList) {
															eoEoib2EoimModel.setEoeiId(afterEoEoib2EoimModel.getEoeiId());
															eoEoib2EoimModel.setRecVer(afterEoEoib2EoimModel.getRecVer());
														}
													}
												}
												eoEoib2EoimModel.setEoeiEoibId(eoImportJoabBoxModel.getEoibId());
												eoEoib2EoimModel.setEoeiEoimId(eoImportJoabMaterielModel.getEoimId());
												eoEoib2EoimModel.setEoeiQuantity(afterEoomQuantity.longValue());
												eoEoib2EoimModel.setEoeiContainerNo(eoOrderContainerModel.getEoocContainerNo());
												eoEoib2EoimModel.setEoeiGrossWeight(NumberUtils.getFormatOfLength(afterEoomGrossWeight,3));
												eoEoib2EoimModel.setEoeiMeasurement(NumberUtils.getFormatOfLength(afterEoomVolume,3));
												eoEoib2EoimModel.setEoeiNetWeight(NumberUtils.getFormatOfLength(afterEoomNetWeight,3));
												eoEoib2EoimModel = eoEoib2EoimManager.save(eoEoib2EoimModel);
												if (null != eoEoib2EoimModel) {
													log.error("箱和物料保存失败");
												}
											}
										} else {
											//add by Colley.Bai 增加保存业务箱逻辑
											EoImportJoabBoxModel eoImportJoabBoxModel = new EoImportJoabBoxModel();
											eoImportJoabBoxModel.setEoibEoocId(eoOrderContainerModel.getEoocId());
											eoImportJoabBoxModel.setEoibEofiId(eoFreightImportModelList.get(0).getEofiId());
											eoImportJoabBoxModel = eoImportJoabBoxManager.save(eoImportJoabBoxModel);
											if (null != eoImportJoabBoxModel) {
												eoEoib2EoimModel.setEoeiEoibId(eoImportJoabBoxModel.getEoibId());
												eoEoib2EoimModel.setEoeiEoimId(eoImportJoabMaterielModel.getEoimId());
												eoEoib2EoimModel.setEoeiQuantity(afterEoomQuantity.longValue());
												eoEoib2EoimModel.setEoeiContainerNo(eoOrderContainerModel.getEoocContainerNo());
												eoEoib2EoimModel.setEoeiGrossWeight(NumberUtils.getFormatOfLength(afterEoomGrossWeight,3));
												eoEoib2EoimModel.setEoeiMeasurement(NumberUtils.getFormatOfLength(afterEoomVolume,3));
												eoEoib2EoimModel.setEoeiNetWeight(NumberUtils.getFormatOfLength(afterEoomNetWeight,3));
												eoEoib2EoimModel = eoEoib2EoimManager.save(eoEoib2EoimModel);
												if (null != eoEoib2EoimModel) {
													log.error("箱和物料保存失败");
												}
											}
										}
	 								}
								}
								
								if (null == eoImportJoabMaterielModel) {
									log.error("保存业务物料失败");
								}
							}
						}
					}
					afterEoOrderDto.setEoOrderMaterielModelList(afterEoOrderMaterielModelList);
					
					afterEoOrderDto.setEoOrderContainerModelList(afterEoOrderContainerModelList);
				}
			}
			responseData.setMsg("保存成功");
			responseData.setCode(Constants.YES);
			responseData.setData(afterEoOrderDto);
		} else {
			responseData.setMsg("保存失败");
			responseData.setCode(Constants.NO);
		}
		return responseData;
	}


	@Override
	public ResponseData<List<EoOrderContainerModel>> batchSaveImportOrderContainer(
			List<EoOrderContainerModel> eoOrderContainerModelList) {
		ResponseData<List<EoOrderContainerModel>> responseData = new ResponseData<>();
		if (EmptyUtils.isNotEmpty(eoOrderContainerModelList)) {
			
			String msg  = "";
			for (EoOrderContainerModel eoOrderContainerModels : eoOrderContainerModelList) {
				if (EmptyUtils.isNotEmpty(eoOrderContainerModels.getEoocContainerNo())) {
					msg = this.eoRequestTrailerService.getKeyString(eoOrderContainerModels.getEoocContainerNo());
				}
			}
			if (EmptyUtils.isNotEmpty(msg)){
				responseData.setCode(Constants.NO);
				responseData.setMsg(msg);
				return responseData;
			}
			
			eoOrderContainerModelList = eoOrderContainerManager.saveAll(eoOrderContainerModelList);
			for (EoOrderContainerModel eoOrderContainerModel : eoOrderContainerModelList) {
				
				EoImportJoabBoxModel eoImportJoabBoxModel = new EoImportJoabBoxModel();
				
				List<FilterCondition> eoorFilterCondition = new ArrayList<>();
				eoorFilterCondition.add(new FilterCondition( "eofiEoorId", eoOrderContainerModel.getEoocEoorId(), "="));
				eoorFilterCondition.add(new FilterCondition( "eofiType" , Constants.EOFI_TYPE , "="));
				List<EoFreightImportModel> eoFreightImportModelList = eoFreightImportManager.findByCondition(eoorFilterCondition);
				if (EmptyUtils.isNotEmpty(eoFreightImportModelList)) {
					List<FilterCondition> eoibFilterCondition = new ArrayList<>();
					eoibFilterCondition.add(new FilterCondition("eoibEoocId", eoOrderContainerModel.getEoocId() ,"="));
					eoibFilterCondition.add(new FilterCondition("eoibEofiId", eoFreightImportModelList.get(0).getEofiId() ,"="));
					List<EoImportJoabBoxModel> eoImportJoabBoxModelList = eoImportJoabBoxManager.findByCondition(eoibFilterCondition);
					//判断集装箱是否已经生成业务箱
					if (EmptyUtils.isNotEmpty(eoImportJoabBoxModelList)) {
						for (EoImportJoabBoxModel afterEoImportJoabBoxModel : eoImportJoabBoxModelList) {
							eoImportJoabBoxModel.setEoibId(afterEoImportJoabBoxModel.getEoibId());
							eoImportJoabBoxModel.setRecVer(afterEoImportJoabBoxModel.getRecVer());
						}
					}
					//集装箱主键
					eoImportJoabBoxModel.setEoibEoocId(eoOrderContainerModel.getEoocId());
					//业务箱主键
					eoImportJoabBoxModel.setEoibEofiId(eoFreightImportModelList.get(0).getEofiId());
					//集装箱箱号
					eoImportJoabBoxModel.setEoibContainerNo(eoOrderContainerModel.getEoocEtcaNo());
					eoImportJoabBoxModel = eoImportJoabBoxManager.save(eoImportJoabBoxModel);
					if (null == eoImportJoabBoxModel) {
						log.error("保存业务箱失败");
					}
					responseData.setCode(Constants.YES);
					responseData.setMsg("保存成功");
					responseData.setData(eoOrderContainerModelList);
				} else {
					responseData.setCode(Constants.NO);
					responseData.setMsg("保存失败");
				}
			}
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("保存失败");
		}
		return responseData;
	}


	@Override
	public ResponseData<QueryData> getEoImportOrderMaterielAndEoeiByEoocId(Long eoocId) {
		ResponseData<QueryData> responseData=new ResponseData<QueryData>();
		QueryData eoOrderMaterielAndEomjList = eoOrderManager.getEoImportOrderMaterielAndEoeiByEoocId(eoocId);
		if (EmptyUtils.isEmpty(eoOrderMaterielAndEomjList.getDataList())) {
			responseData.setCode(Constants.NO);
		}
		responseData.setData(eoOrderMaterielAndEomjList);
		return responseData;
	}

	
	@Override
	public ResponseData<List<EoOrderContainerModel>> batchDeleteImportOrderContainerAndEoeiByEooc(List<Long> eoocIds) {
		ResponseData<List<EoOrderContainerModel>> responseData = new ResponseData<>();
		if (EmptyUtils.isNotEmpty(eoocIds)) {
			for (Long eoocId:eoocIds) {
				EoOrderContainerModel eoOrderContainerModel = eoOrderContainerManager.get(eoocId);
				//1.集装箱以有毛、件、体
				Long eoocQuantity = eoOrderContainerModel.getEoocQuantity() == null ? 0 : eoOrderContainerModel.getEoocQuantity();
				Double eoocVolume = eoOrderContainerModel.getEoocVolume() == null ? 0.00 : eoOrderContainerModel.getEoocVolume();
				Double eoocWeight = eoOrderContainerModel.getEoocWeight() == null ? 0.00 : eoOrderContainerModel.getEoocWeight();
				//业务箱和实装箱为一对一关系
				List<FilterCondition> eoocIdFilterCondition = new ArrayList<>();
				eoocIdFilterCondition.add(new FilterCondition("eoibEoocId",eoocId,"="));
				//获取业务箱
				List<EoImportJoabBoxModel> eoImportJoabBoxModelList = eoImportJoabBoxManager.findByCondition(eoocIdFilterCondition);
				if (EmptyUtils.isNotEmpty(eoImportJoabBoxModelList)) {
					List<FilterCondition> eoImportJoabBoxFilterCondition = new ArrayList<>();
					eoImportJoabBoxFilterCondition.add(new FilterCondition("eoeiEoibId",eoImportJoabBoxModelList.get(0).getEoibId(),"="));
					//获取业务关系表和业务关系箱有关系的数据
					List<EoEoib2EoimModel> eoEoib2EoimModelList = eoEoib2EoimManager.findByCondition(eoImportJoabBoxFilterCondition);
					if (EmptyUtils.isNotEmpty(eoEoib2EoimModelList)) {
						for (EoEoib2EoimModel eoEoib2EoimModel:eoEoib2EoimModelList) {
							List<FilterCondition> eoImportJoabMaterielFilterCondition = new ArrayList<>();
							eoImportJoabMaterielFilterCondition.add(new FilterCondition("eoimId",eoEoib2EoimModel.getEoeiEoimId(),"="));
							//获取业务物料信息
							List<EoImportJoabMaterielModel> eoImportJoabMaterielModelList = eoImportJoabMaterielManager.findByCondition(eoImportJoabMaterielFilterCondition);
							eoEoib2EoimManager.delete(eoEoib2EoimModel);
							if (EmptyUtils.isNotEmpty(eoImportJoabMaterielModelList)) {
								for (EoImportJoabMaterielModel eoImportJoabMaterielModel : eoImportJoabMaterielModelList) {
									EoOrderMaterielModel eoOrderMaterielModel = eoOrderMaterielManager.get(eoImportJoabMaterielModel.getEoimEoomId());
									//以有物料（总）
									Double eoomQuantity = eoOrderMaterielModel.getEoomQuantity() == null ? 0.00 : eoOrderMaterielModel.getEoomQuantity();
									Double eoomGrossWeight = eoOrderMaterielModel.getEoomGrossWeight() == null ? 0.00 : eoOrderMaterielModel.getEoomGrossWeight();
									Double eoomVolume = eoOrderMaterielModel.getEoomVolume() == null ? 0.00 : eoOrderMaterielModel.getEoomVolume();
									//箱货关系毛件体
									Long eoeiQuantity = eoEoib2EoimModel.getEoeiQuantity() == null ? 0 : eoEoib2EoimModel.getEoeiQuantity();
									Double eoeiGrossWeight = eoEoib2EoimModel.getEoeiGrossWeight() == null ? 0.00 : eoEoib2EoimModel.getEoeiGrossWeight();
									Double eoeiMeasurement = eoEoib2EoimModel.getEoeiMeasurement() == null ? 0.00 : eoEoib2EoimModel.getEoeiMeasurement();
									//剩余物料毛件体 = 总 - 箱货关系毛件体
									Double quantity = eoomQuantity - eoeiQuantity.doubleValue();
									Double grossWeight = eoomGrossWeight - eoeiGrossWeight;
									Double volume = eoomVolume - eoeiMeasurement;
									
									if (quantity > 0) {
										eoOrderMaterielModel.setEoomQuantity(quantity);
										eoOrderMaterielModel.setEoomGrossWeight(NumberUtils.getFormatOfLength(grossWeight, 3));
										eoOrderMaterielModel.setEoomVolume(NumberUtils.getFormatOfLength(volume, 3));
										eoOrderMaterielModel = eoOrderMaterielManager.save(eoOrderMaterielModel);
										log.error("订单物料更新错误");
									} else {
										eoImportJoabMaterielManager.delete(eoImportJoabMaterielModel);
										eoOrderMaterielManager.delete(eoOrderMaterielModel);
									}
								}
							}
						}
					}
					eoImportJoabBoxManager.deleteByPk(eoImportJoabBoxModelList.get(0).getEoibId());
				}
				List<FilterCondition> eocdIdFilterCondition = new ArrayList<>();
				eocdIdFilterCondition.add(new FilterCondition("eocdEoocId",eoocId,"="));//业务箱和报关实装箱为一对一关系
				List<EoEooc2EoddModel> eoEooc2EoddModelList = eoEooc2EoddManager.findByCondition(eocdIdFilterCondition);//获取报关业务箱
				if (EmptyUtils.isNotEmpty(eoEooc2EoddModelList)) {//报关集装箱信息删除
					for (EoEooc2EoddModel eoEooc2EoddModel:eoEooc2EoddModelList) {
						eoEooc2EoddManager.delete(eoEooc2EoddModel);
					}
				}
				List<FilterCondition> eootIdFilterCondition = new ArrayList<>();
				eootIdFilterCondition.add(new FilterCondition("eootEoocId",eoocId,"="));//业务箱和拖车集装箱为一对一关系
				List<EoEooc2EoetModel> eoEooc2EoetModelList = eoEooc2EoetManager.findByCondition(eootIdFilterCondition);
				if (EmptyUtils.isNotEmpty(eoEooc2EoetModelList)) {
					for (EoEooc2EoetModel eoEooc2EoetModel : eoEooc2EoetModelList) {
						eoEooc2EoetManager.delete(eoEooc2EoetModel);
					}
				}
				eoOrderContainerManager.deleteByPk(eoocId);
			}
			responseData.setCode(Constants.YES);
		} else {
			responseData.setMsg("ID不能空");
			responseData.setCode(Constants.NO);
		}
		return responseData;
	}


	@Override
	public ResponseData<List<EoEoib2EoimModel>> batchDeleteImportOrderEoEoib2Eoim(List<Long> eoeiIds) {
		ResponseData<List<EoEoib2EoimModel>> responseData = new ResponseData<>();
		List<EoOrderContainerModel> eoOrderContainerModelList = new ArrayList<>();
		for (Long eoeiId:eoeiIds) {
			EoEoib2EoimModel eoEoib2EoimModel = eoEoib2EoimManager.get(eoeiId);//获取业务关系数据
			Long eoeiEoibId = eoEoib2EoimModel.getEoeiEoibId();
			EoImportJoabBoxModel eoImportJoabBoxModle = eoImportJoabBoxManager.get(eoeiEoibId);//获取业务箱信息
			Long eoibEoocId = eoImportJoabBoxModle.getEoibEoocId();
			EoOrderContainerModel 	eoOrderContainerModel = eoOrderContainerManager.get(eoibEoocId);//获取集装箱信息
			//1.集装箱信息件数、毛重、体积获取
			Long  eoocQuantity = eoOrderContainerModel.getEoocQuantity() == null ? 0L: eoOrderContainerModel.getEoocQuantity();
			Double eoocWeight = eoOrderContainerModel.getEoocWeight() == null ? 0.00 : eoOrderContainerModel.getEoocWeight();
			Double eoocVolume = eoOrderContainerModel.getEoocVolume() == null ? 0.00 : eoOrderContainerModel.getEoocVolume();
			//2.业务关系表件数、毛重、体积
			Long eoeiQuantit = eoEoib2EoimModel.getEoeiQuantity() == null ? 0 : eoEoib2EoimModel.getEoeiQuantity();
			Double eoeiGrossWeight = eoEoib2EoimModel.getEoeiGrossWeight() == null ? 0.0 : eoEoib2EoimModel.getEoeiGrossWeight();
			Double eoeiMeasurement = eoEoib2EoimModel.getEoeiMeasurement() == null ? 0.0 : eoEoib2EoimModel.getEoeiMeasurement();
			//3.计算出需要删除的业务箱数据
			eoOrderContainerModel.setEoocQuantity(eoocQuantity-eoeiQuantit);
			eoOrderContainerModel.setEoocWeight(NumberUtils.getFormatOfLength(eoocWeight-eoeiGrossWeight,3));
			eoOrderContainerModel.setEoocVolume(NumberUtils.getFormatOfLength(eoocVolume-eoeiMeasurement,3));
			//4.更新集装箱信息
			EoOrderContainerModel afterEoOrderContainerModel = eoOrderContainerManager.save(eoOrderContainerModel);
			eoOrderContainerModelList.add(afterEoOrderContainerModel);
		}
		if (EmptyUtils.isNotEmpty(eoeiIds)) {
			for (Long eoeiId : eoeiIds) {
				List<FilterCondition> filterConditions = new ArrayList<>();
				filterConditions.add(new FilterCondition("eoeiId",eoeiId,"="));
				List<EoEoib2EoimModel> eoEoib2EoimModelList = eoEoib2EoimManager.findByCondition(filterConditions);
				//删除业务关系表
				eoEoib2EoimManager.deleteByPk(eoeiId);
				if (EmptyUtils.isNotEmpty(eoEoib2EoimModelList)) {
					for (EoEoib2EoimModel eoEoib2EoimModel : eoEoib2EoimModelList) {
						List<FilterCondition> eoimFilterConditions = new ArrayList<>();
						eoimFilterConditions.add(new FilterCondition("eoimId",eoEoib2EoimModel.getEoeiEoimId(),"="));
						List<EoImportJoabMaterielModel> eoImportJoabMaterielModelList = eoImportJoabMaterielManager.findByCondition(eoimFilterConditions);
						if (EmptyUtils.isNotEmpty(eoImportJoabMaterielModelList)) {
							for (EoImportJoabMaterielModel eoImportJoabMaterielModel : eoImportJoabMaterielModelList) {
								List<FilterCondition> eoomFilterConditions = new ArrayList<>();
								eoomFilterConditions.add(new FilterCondition("eoomId",eoImportJoabMaterielModel.getEoimEoomId(),"="));
								List<EoOrderMaterielModel> eoOrderMaterielModelList = eoOrderMaterielManager.findByCondition(eoomFilterConditions);
								if (EmptyUtils.isNotEmpty(eoOrderMaterielModelList)) {
									for (EoOrderMaterielModel eoOrderMaterielModel : eoOrderMaterielModelList) {
										
										Double eoomQuantity = eoOrderMaterielModel.getEoomQuantity() == null ? 0.00: eoOrderMaterielModel.getEoomQuantity();
										Double eoomGrossWeight = eoOrderMaterielModel.getEoomGrossWeight() == null ? 0.00 : eoOrderMaterielModel.getEoomGrossWeight();
										Double eoomVolume = eoOrderMaterielModel.getEoomVolume() == null ? 0.00 : eoOrderMaterielModel.getEoomVolume();
										
										Long  eoeiQuantity = eoEoib2EoimModel.getEoeiQuantity() == null ? 0L: eoEoib2EoimModel.getEoeiQuantity();
										Double eoeiWeight = eoEoib2EoimModel.getEoeiGrossWeight() == null ? 0.00 : eoEoib2EoimModel.getEoeiGrossWeight();
										Double eoeiVolume = eoEoib2EoimModel.getEoeiMeasurement() == null ? 0.00 : eoEoib2EoimModel.getEoeiMeasurement();
										
										eoomQuantity -= eoeiQuantity;
										eoomGrossWeight -= eoeiWeight;
										eoomVolume -= eoeiVolume;
										
										if (eoomQuantity > 0) {
											eoOrderMaterielModel.setEoomQuantity(eoomQuantity);
											eoOrderMaterielModel.setEoomGrossWeight(NumberUtils.getFormatOfLength(eoomGrossWeight, 3));
											eoOrderMaterielModel.setEoomVolume(NumberUtils.getFormatOfLength(eoomVolume, 3));
											eoOrderMaterielModel = eoOrderMaterielManager.save(eoOrderMaterielModel);
											log.error("订单物料更新错误");
										} else {
											//删除业务箱
											eoImportJoabMaterielManager.delete(eoImportJoabMaterielModel);
											//删除订单物料
											eoOrderMaterielManager.delete(eoOrderMaterielModel);
										}
									}
								}
							}
						}
					}
				}
			}
			responseData.setCode(Constants.YES);
			responseData.setMsg("删除成功");
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("ID为空，不允许删除，请重试");
		}
		return responseData;
	}


	@Override
	public ResponseData<EoOrderMaterielModel> getEoOrderMaterielByEomiId(Long eoeiId) {
		ResponseData<EoOrderMaterielModel> responseData = new ResponseData<>();
		if (null != eoeiId) {
			//1.获取进口业务关系信息
			EoEoib2EoimModel eoEoib2EoimModel = this.eoEoib2EoimManager.get(eoeiId);
			if (null != eoEoib2EoimModel) {
				//2.获取进口物料业务信息
				EoImportJoabMaterielModel eoImportJoabMaterielModel = eoImportJoabMaterielManager.get(eoEoib2EoimModel.getEoeiEoimId());
				if (null != eoImportJoabMaterielModel) {
					EoOrderMaterielModel eoOrderMaterielModel = eoOrderMaterielManager.get(eoImportJoabMaterielModel.getEoimEoomId());
					if (null != eoOrderMaterielModel) {
						responseData.setCode(Constants.YES);
						responseData.setData(eoOrderMaterielModel);
					}
				}
			}
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("查询失败");
		}
		return responseData;
	}
	
	/**
	 * 订单复制时根据订单id查询出订单下相关信息，反馈到前端
	 * @author Shoven.Jiang  
	 * @date 2019年3月29日
	 * @param eoorId
	 * @param responseData
	 * @return
	 */
	public ResponseData<EoOrderDto> initializationOrderMsg(Long eoorId, ResponseData<EoOrderDto> responseData) {
		EoOrderDto eoOrderDto = responseData.getData();
		//1、订单箱明细表
		List<FilterCondition> eoocCondition = new ArrayList<>();
		eoocCondition.add(new FilterCondition("eoocEoorId", eoorId, "="));
		List<EoOrderContainerModel> eoOrderContainerModels = this.eoOrderContainerManager.findByCondition(eoocCondition);
		//2、订单箱需求表查询
		List<FilterCondition> eosrCondition = new ArrayList<>();
		eosrCondition.add(new FilterCondition("eosrEoorId", eoorId, "="));
		List<EoOrderPrecontainerModel> eoOrderPrecontainerModels = this.eoOrderPrecontainerManager.findByCondition(eosrCondition);
		//3、订单物料查询
		List<FilterCondition> eoomCondition = new ArrayList<>();
		eoomCondition.add(new FilterCondition("eoomEoorId", eoorId, "="));
		List<EoOrderMaterielModel> eoOrderMaterielModels = this.eoOrderMaterielManager.findByCondition(eoomCondition);
		if (EmptyUtils.isNotEmpty(eoOrderContainerModels)) {
			for (EoOrderContainerModel eoOrderContainerModel : eoOrderContainerModels) {
				eoOrderContainerModel.setCreateTime(null);
				eoOrderContainerModel.setCreator(null);
				eoOrderContainerModel.setEoocEoorId(null);
				eoOrderContainerModel.setModifier(null);
				eoOrderContainerModel.setModifyTime(null);
				eoOrderContainerModel.setEoocId(null);
			}
			eoOrderDto.setEoOrderContainerModelList(eoOrderContainerModels);
		}
		if (EmptyUtils.isNotEmpty(eoOrderPrecontainerModels)) {
			for (EoOrderPrecontainerModel eoOrderPrecontainerModel : eoOrderPrecontainerModels) {
				eoOrderPrecontainerModel.setCreateTime(null);
				eoOrderPrecontainerModel.setCreator(null);
				eoOrderPrecontainerModel.setModifier(null);
				eoOrderPrecontainerModel.setModifyTime(null);
				eoOrderPrecontainerModel.setEosrEoorId(null);
				eoOrderPrecontainerModel.setEosrId(null);
			}
			eoOrderDto.setEoOrderPrecontainerModelList(eoOrderPrecontainerModels);
		}
		if (EmptyUtils.isNotEmpty(eoOrderMaterielModels)) {
			for (EoOrderMaterielModel eoOrderMaterielModel : eoOrderMaterielModels) {
				eoOrderMaterielModel.setCreateTime(null);
				eoOrderMaterielModel.setCreator(null);
				eoOrderMaterielModel.setModifier(null);
				eoOrderMaterielModel.setModifyTime(null);
				eoOrderMaterielModel.setEoomId(null);
				eoOrderMaterielModel.setEoomEoorId(null);
			}
			eoOrderDto.setEoOrderMaterielModelList(eoOrderMaterielModels);
		}
		responseData.setData(eoOrderDto);
		return responseData;
	}


	@Override
	public ResponseData<EoOrderDto> copyEoorAndEoeaEoomEoocByEoorId(Long eoorId) {
		ResponseData<EoOrderDto> responseData = new ResponseData<>();
		EoOrderDto afterSaveEoOrderDto = new EoOrderDto();
		
		//获取用户信息
		UserDetails user = SessionContext.getUser();
		
		if (null == eoorId) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单信息查询结果为空，请重新查询");
			return responseData;
		} else {
			responseData = this.getEoorAndEoeaByEoorId(eoorId);
			if (Constants.NO.equals(responseData.getCode())) {
				return responseData;
			}
			/*************************-----订单基本信息保存开始-----****************************/
			ResponseData<EoOrderDto> eoOrderAndEoea =  this.initializationEoorAndEoeaModel(responseData);
			responseData = this.eoOrderManager.createEoorAndEoeaModel(eoOrderAndEoea.getData(), user, afterSaveEoOrderDto);
			/*************************-----订单基本信息保存结束-----****************************/
			//如果订单基本信息保存成功，则继续保存订单相关信息
			//获取订单id用来保存订单相关信息
			Long afterEoorId = responseData.getData().getEoOrderModel().getEoorId();
			//1.新订单id
			if (null != afterEoorId) {
				//2.旧订单id
				if (null != eoorId) {
					EoOrderModelDto eoOrderModelDto = this.initializationOrderContainerMsg(eoorId, afterEoorId);
					EoOrderModelDto afterEoOrderModelDto = this.initializationOrderMaterielMsg(eoorId, afterEoorId, eoOrderModelDto.getEoEoib2EoimModels());
					if (EmptyUtils.isNotEmpty(eoOrderModelDto.getEoOrderContainerModels())) {
						afterSaveEoOrderDto.setEoOrderContainerModelList(eoOrderModelDto.getEoOrderContainerModels());
						responseData.setData(afterSaveEoOrderDto);
					}
					if (EmptyUtils.isNotEmpty(afterEoOrderModelDto.getEoOrderMaterielModels())) {
						afterSaveEoOrderDto.setEoOrderMaterielModelList(afterEoOrderModelDto.getEoOrderMaterielModels());
						responseData.setData(afterSaveEoOrderDto);
					}
					EoFreightImportModel eoFreightImportModel = this.saveEoFreightImportModel(eoorId, afterEoorId, responseData);
					afterSaveEoOrderDto.setEoFreightimportModel(eoFreightImportModel);
					responseData.setData(afterSaveEoOrderDto);
				}
			}
		}
		return responseData;
	}
	
	/**
	 * @deprecated:更新站内跟踪信息
	 * @author Colley.Bai  
	 * @date 2019年4月9日
	 * @param eoorId
	 * @param afterEoorId
	 * @param responseData
	 * @return
	 */
	public EoFreightImportModel saveEoFreightImportModel(Long eoorId, Long afterEoorId,ResponseData<EoOrderDto> responseData){
		EoFreightImportModel afterEoFreightImportModel = new EoFreightImportModel();
		if (null != eoorId) {
			List<FilterCondition> eofiConditions = new ArrayList<>();
			eofiConditions.add(new FilterCondition("eofiEoorId",eoorId,"="));
			eofiConditions.add(new FilterCondition("eofiType", Constants.EO_FREIGHT_TYPE, "="));
			List<EoFreightImportModel> eoFreightImportModelList = this.eoFreightImportManager.findByCondition(eofiConditions);
			if (EmptyUtils.isNotEmpty(eoFreightImportModelList)) {
				EoFreightImportModel eoFreightImportModel = eoFreightImportModelList.get(0);
				eoFreightImportModelList.get(0).setEofiEscoId(responseData.getData().getEoOrderModel().getEoorEscoId());
				eoFreightImportModelList.get(0).setEofiEoorId(afterEoorId);
				eoFreightImportModelList.get(0).setEofiEbpjId(responseData.getData().getEoOrderModel().getEoorEbpjId());
				eoFreightImportModelList.get(0).setEofiLoEbppId(responseData.getData().getEoOrderModel().getEoorLoEbppId());
				eoFreightImportModelList.get(0).setEofiEscoId(responseData.getData().getEoOrderModel().getEoorEscoId());
				eoFreightImportModelList.get(0).setEofiSoNo(responseData.getData().getEoOrderModel().getEoorSoNo());
				eoFreightImportModelList.get(0).setEofiDoNo(responseData.getData().getEoOrderModel().getEoorDoNo());
				eoFreightImportModelList.get(0).setEofiBulkBillNo(responseData.getData().getEoOrderExpandAgencyModel().getEoeaBulkBillNo());
				eoFreightImportModelList.get(0).setEofiHblNo(responseData.getData().getEoOrderExpandAgencyModel().getEoeaHblNo());
				eoFreightImportModelList.get(0).setEofiType(Constants.EO_FREIGHT_TYPE);
				eoFreightImportModelList.get(0).setCreateTime(null);
				eoFreightImportModelList.get(0).setCreator(null);
				eoFreightImportModelList.get(0).setEofiId(null);
				eoFreightImportModelList.get(0).setModifier(null);
				eoFreightImportModelList.get(0).setModifyTime(null);
				eoFreightImportModelList.get(0).setRecVer(null);
				afterEoFreightImportModel = eoFreightImportManager.save(eoFreightImportModel);
			}
		}
		return afterEoFreightImportModel;
	}
	
	/**
	 * @deprecated:保存订单物料信息+进口业务物料信息+进口业务箱和物料关系
	 * @author Colley.Bai  
	 * @date 2019年4月9日
	 * @param eoorId
	 * @param afterEoorId
	 * @param eoEoib2EoimModels
	 * @return
	 */
	public EoOrderModelDto initializationOrderMaterielMsg(Long eoorId, Long afterEoorId,List<EoEoib2EoimModel> eoEoib2EoimModels){
		EoOrderModelDto afterEoOrderModelDto = new EoOrderModelDto();
		List<EoOrderMaterielModel> afterEoOrderMaterielModels = new ArrayList<>();
		//1、订单物料查询
		List<FilterCondition> eoomCondition = new ArrayList<>();
		eoomCondition.add(new FilterCondition("eoomEoorId", eoorId, "="));
		List<EoOrderMaterielModel> eoOrderMaterielModels = this.eoOrderMaterielManager.findByCondition(eoomCondition);
		if (EmptyUtils.isNotEmpty(eoOrderMaterielModels)) {
			for (EoOrderMaterielModel eoOrderMaterielModel : eoOrderMaterielModels) {
				
				//2.进口业务物料表请求表
				List<FilterCondition> eoimCondition = new ArrayList<>();
				eoimCondition.add(new FilterCondition("eoimEoomId", eoOrderMaterielModel.getEoomId(), "="));
				List<EoImportJoabMaterielModel> eoImportJoabMaterielModels = this.eoImportJoabMaterielManager.findByCondition(eoimCondition);
				
				//3.更新物料和业务物料信息
				EoOrderModelDto eoOrderModelDto = this.saveEoImportJoabMaterielModel(eoOrderMaterielModel, afterEoorId);
				
				if (EmptyUtils.isNotEmpty(eoImportJoabMaterielModels) && null != eoOrderModelDto.getEoImportJoabMaterielModel()) {
					for (EoImportJoabMaterielModel eoImportJoabMaterielModel : eoImportJoabMaterielModels) {
						for (EoEoib2EoimModel eoEoib2EoimModel : eoEoib2EoimModels) {
							if (EmptyUtils.isEqual(eoImportJoabMaterielModel.getEoimId(), eoEoib2EoimModel.getEoeiEoimId())) {
								eoEoib2EoimModel.setEoeiEoimId(eoOrderModelDto.getEoImportJoabMaterielModel().getEoimId());
								eoEoib2EoimModel.setEoeiId(null);
								EoEoib2EoimModel afterEoEoib2EoimModel = eoEoib2EoimManager.save(eoEoib2EoimModel);
								if (null == afterEoEoib2EoimModel) {
									log.error("箱货关系保存失败");
								}
							}
						}
					}
					afterEoOrderMaterielModels.add(eoOrderModelDto.getEoOrderMaterielModel());
					afterEoOrderModelDto.setEoOrderMaterielModels(afterEoOrderMaterielModels);
					afterEoOrderModelDto.setEoOrderMaterielModel(eoOrderModelDto.getEoOrderMaterielModel());
				}
			}
		}
		return afterEoOrderModelDto;
	}
	
	/**
	 * @deprecated:保存集装箱信息+进口业务箱
	 * @author Colley.Bai  
	 * @date 2019年4月9日
	 * @param eoOrderContainerModel
	 * @param afterEoorId
	 * @return
	 */
	public EoOrderModelDto saveEoImportJoabMaterielModel(EoOrderMaterielModel eoOrderMaterielModel, Long afterEoorId){
		EoOrderModelDto eoOrderModelDto = new EoOrderModelDto();
		if (null != eoOrderMaterielModel && null != afterEoorId) {
			eoOrderMaterielModel.setCreateTime(null);
			eoOrderMaterielModel.setCreator(null);
			eoOrderMaterielModel.setEoomEoorId(afterEoorId);
			eoOrderMaterielModel.setModifier(null);
			eoOrderMaterielModel.setModifyTime(null);
			eoOrderMaterielModel.setEoomId(null);
			EoOrderMaterielModel aftereoOrderMaterielModel = this.eoOrderMaterielManager.save(eoOrderMaterielModel);
			eoOrderModelDto.setEoOrderMaterielModel(aftereoOrderMaterielModel);
			if (null != aftereoOrderMaterielModel) {
				List<FilterCondition> eofiCondition = new ArrayList<>();
				eofiCondition.add(new FilterCondition("eofiEoorId", afterEoorId, "="));
				eofiCondition.add(new FilterCondition("eofiType", "EOOR", "="));
				List<EoFreightImportModel> eoFreightImportModels = this.eoFreightImportManager.findByCondition(eofiCondition);
				if (EmptyUtils.isNotEmpty(eoFreightImportModels)) {
					EoImportJoabMaterielModel eoImportJoabMaterielModel = new EoImportJoabMaterielModel();
					eoImportJoabMaterielModel.setEoimEoomId(aftereoOrderMaterielModel.getEoomId());
					eoImportJoabMaterielModel.setEoimEofiId(eoFreightImportModels.get(0).getEofiId());
					eoImportJoabMaterielModel = this.eoImportJoabMaterielManager.save(eoImportJoabMaterielModel);
					eoOrderModelDto.setEoImportJoabMaterielModel(eoImportJoabMaterielModel);
				}
			}
		}
		return eoOrderModelDto;
	}
	
	/**
	 * @deprecated:保存集装箱信息+进口业务箱信息
	 * @author Colley.Bai  
	 * @date 2019年4月9日
	 * @param eoorId
	 * @param afterEoorId
	 * @return
	 */
	public EoOrderModelDto initializationOrderContainerMsg(Long eoorId, Long afterEoorId){
		EoOrderModelDto afterEoOrderModelDto = new EoOrderModelDto();
		List<EoEoib2EoimModel> afterEoEoib2EoimModels = new ArrayList<>();
		if (null != eoorId) {
			//1、订单箱明细表
			List<FilterCondition> eoocCondition = new ArrayList<>();
			eoocCondition.add(new FilterCondition("eoocEoorId", eoorId, "="));
			List<EoOrderContainerModel> eoOrderContainerModels = this.eoOrderContainerManager.findByCondition(eoocCondition);
			List<EoOrderContainerModel> afterEoOrderContainerModels = new ArrayList<>();
			if (EmptyUtils.isNotEmpty(eoOrderContainerModels)) {
				for (EoOrderContainerModel eoOrderContainerModel : eoOrderContainerModels) {
					//2.进口业务箱表请求表
					List<FilterCondition> eoibCondition = new ArrayList<>();
					eoibCondition.add(new FilterCondition("eoibEoocId", eoOrderContainerModel.getEoocId(), "="));
					List<EoImportJoabBoxModel> eoImportJoabBoxModels = this.eoImportJoabBoxManager.findByCondition(eoibCondition);
					//3.更新集装箱和业务箱信息
					EoOrderModelDto eoOrderModelDto = this.saveEoImportJoabBoxModel(eoOrderContainerModel,afterEoorId);

					if (EmptyUtils.isNotEmpty(eoImportJoabBoxModels) && null != eoOrderModelDto.getEoImportJoabBoxModel()) {
						for (EoImportJoabBoxModel eoImportJoabBoxModel : eoImportJoabBoxModels) {
							//3.进口业务箱和物料关系表
							List<FilterCondition> eoeiEoibCondition = new ArrayList<>();
							eoeiEoibCondition.add(new FilterCondition("eoeiEoibId", eoImportJoabBoxModel.getEoibId(), "="));
							List<EoEoib2EoimModel> eoEoib2EoimModels = this.eoEoib2EoimManager.findByCondition(eoeiEoibCondition);
							if (EmptyUtils.isNotEmpty(eoEoib2EoimModels)) {
								for (EoEoib2EoimModel eoEoib2EoimModel : eoEoib2EoimModels) {
									eoEoib2EoimModel.setCreateTime(null);
									eoEoib2EoimModel.setCreator(null);
									eoEoib2EoimModel.setEoeiEoibId(eoOrderModelDto.getEoImportJoabBoxModel().getEoibId());
									eoEoib2EoimModel.setModifier(null);
									eoEoib2EoimModel.setModifyTime(null);
									eoEoib2EoimModel.setRecVer(null);
									afterEoEoib2EoimModels.add(eoEoib2EoimModel);
								}
							}
						}
						afterEoOrderContainerModels.add(eoOrderModelDto.getEoOrderContainerModel());
						afterEoOrderModelDto.setEoOrderContainerModels(afterEoOrderContainerModels);
						afterEoOrderModelDto.setEoOrderContainerModel(eoOrderModelDto.getEoOrderContainerModel());
					}
					
					afterEoOrderModelDto.setEoEoib2EoimModels(afterEoEoib2EoimModels);
				}
			}
		}
		return afterEoOrderModelDto;
	}
	
	/**
	 * @deprecated:保存集装箱信息+进口业务箱
	 * @author Colley.Bai  
	 * @date 2019年4月9日
	 * @param eoOrderContainerModel
	 * @param afterEoorId
	 * @return
	 */
	public EoOrderModelDto saveEoImportJoabBoxModel(EoOrderContainerModel eoOrderContainerModel, Long afterEoorId){
		EoOrderModelDto eoOrderModelDto = new EoOrderModelDto();
		if (null != eoOrderContainerModel && null != afterEoorId) {
			eoOrderContainerModel.setCreateTime(null);
			eoOrderContainerModel.setCreator(null);
			eoOrderContainerModel.setEoocEoorId(afterEoorId);
			eoOrderContainerModel.setModifier(null);
			eoOrderContainerModel.setModifyTime(null);
			eoOrderContainerModel.setEoocId(null);
			EoOrderContainerModel afterEoOrderContainerModel = this.eoOrderContainerManager.save(eoOrderContainerModel);
			eoOrderModelDto.setEoOrderContainerModel(afterEoOrderContainerModel);
			if (null != afterEoOrderContainerModel) {
				List<FilterCondition> eofiCondition = new ArrayList<>();
				eofiCondition.add(new FilterCondition("eofiEoorId", afterEoorId, "="));
				eofiCondition.add(new FilterCondition("eofiType", "EOOR", "="));
				List<EoFreightImportModel> eoFreightImportModels = this.eoFreightImportManager.findByCondition(eofiCondition);
				if (EmptyUtils.isNotEmpty(eoFreightImportModels)) {
					EoImportJoabBoxModel eoImportJoabBoxModel = new EoImportJoabBoxModel();
					eoImportJoabBoxModel.setEoibEoocId(afterEoOrderContainerModel.getEoocId());
					eoImportJoabBoxModel.setEoibEofiId(eoFreightImportModels.get(0).getEofiId());
					eoImportJoabBoxModel = this.eoImportJoabBoxManager.save(eoImportJoabBoxModel);
					eoOrderModelDto.setEoImportJoabBoxModel(eoImportJoabBoxModel);
				}
			}
		}
		return eoOrderModelDto;
	}


	@Override
	public ResponseData<QueryData> queryOrderAllFeeByCondition(QueryInfo queryInfo) {
		return this.eoOrderManager.queryOrderAllFeeByCondition(queryInfo);
	}
}
