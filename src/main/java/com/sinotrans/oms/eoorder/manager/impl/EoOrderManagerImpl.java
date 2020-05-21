package com.sinotrans.oms.eoorder.manager.impl;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TimeZone;

import org.apache.xml.resolver.apps.resolver;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryField;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoRequestTraileContainerNumQueryItem;
import com.sinotrans.oms.businessrequest.manager.EoFreightImportManager;
import com.sinotrans.oms.businessrequest.manager.EoFreightOmportManager;
import com.sinotrans.oms.businessrequest.manager.EoImportJoabBoxManager;
import com.sinotrans.oms.businessrequest.model.EoFreightImportModel;
import com.sinotrans.oms.businessrequest.model.EoFreightOmportModel;
import com.sinotrans.oms.businessrequest.model.EoImportJoabBoxModel;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.aop.IgnoreLoginController;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.manager.ProcedureManager;
import com.sinotrans.oms.common.nogenerator.NOGeneratorUtil;
import com.sinotrans.oms.common.util.BeanUtils;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.common.util.StringUtils;
import com.sinotrans.oms.customerproject.manager.EbPlanEventManager;
import com.sinotrans.oms.customerproject.manager.EbProjectManager;
import com.sinotrans.oms.customerproject.model.EbPlanEventModel;
import com.sinotrans.oms.customerproject.model.EbProjectModel;
import com.sinotrans.oms.customerproject.service.EbProjectService;
import com.sinotrans.oms.eoorder.dto.EoFreightOmportStatusQueryItem;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.eoorder.dto.EoOrderIssuedStatusDto;
import com.sinotrans.oms.eoorder.dto.EoOrderModelDto;
import com.sinotrans.oms.eoorder.manager.EoEoib2EoimManager;
import com.sinotrans.oms.eoorder.manager.EoOrderContainerManager;
import com.sinotrans.oms.eoorder.manager.EoOrderExpandAgencyManager;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.manager.EoOrderMaterielManager;
import com.sinotrans.oms.eoorder.manager.EoOrderPrecontainerManager;
import com.sinotrans.oms.eoorder.model.EoEoib2EoimModel;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.eoorder.model.EoOrderMaterielModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.eoorder.model.EoOrderPrecontainerModel;
import com.sinotrans.oms.eoorder.service.EoOrderService;
import com.sinotrans.oms.fees.manager.EfBusinessFeesManager;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.system.manager.EsCounterManager;
import com.sinotrans.oms.system.manager.EsDepartmentManager;
import com.sinotrans.oms.system.manager.EsUserManager;
import com.sinotrans.oms.system.model.EsDepartmentModel;
import com.sinotrans.oms.system.model.EsUserModel;
/**
 * <p>Title: 订单表</p>
 * <p>Description: 
 *    
 * </p>
 *<pre>
 * 修改记录:
 * 修改后版本            修改人       	 	修改日期   	      修改内容
 * 2018073101  Shoven Jiang 2018073101 	创建
 * 
 * 
 * </pre>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoOrderManagerImpl  extends MybatisManagerImpl implements EoOrderManager{
	
	@Autowired
	private EoOrderExpandAgencyManager eoOrderExpandAgencyManager;
	@Autowired
	private EoOrderMaterielManager eoOrderMaterielManager;
	@Autowired
	private EoOrderPrecontainerManager eoOrderPrecontainerManager;
	@Autowired
	private EoOrderContainerManager eoOrderContainerManager;
	@Autowired
	private EfBusinessFeesManager efBusinessFeesManager;
	@Autowired
	private EbProjectManager ebProjectManager;
    
    @Autowired//序列表:动态有规则生成字符串
    private EsCounterManager esCounterManager;
    @Autowired//用户service
    private EsUserManager esUserManager;
    @Autowired //部门信息
    private EsDepartmentManager esDepartmentManager;
    @Autowired //存储过程
    private ProcedureManager procedureManager;
    @Autowired
    private EoFreightOmportManager eoFreightOmportManager;
    @Autowired
    private EbPlanEventManager ebPlanEventManager;
    @Autowired
    private EoOrderService eoOrderService;
    
	
	@Autowired
	private EoImportJoabBoxManager eoImportJoabBoxManager;
	@Autowired
	private EoEoib2EoimManager eoEoib2EoimManager;
    
	//TODO
    
    
	@Autowired
	private CommonQueryManager commonQueryManager;
	@Autowired
	private EoFreightImportManager eoFreightimportManager;
	
	@Override
	public EoOrderModel saveOrder(EoOrderModel eoOrdrModel) {
		
		return this.myBatisDao.save(eoOrdrModel);
	}

	@Override
	public EoOrderExpandAgencyModel saveEoOrderExpandAgencyModel(EoOrderExpandAgencyModel formModel) {
		
		return this.myBatisDao.save(formModel);
	}

	@Override
	public EoOrderModel get(Long id) {
		
		return this.myBatisDao.get(EoOrderModel.class, id);
	}

	@Override
	public List<EoOrderModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoOrderModel.class, null, null, conditions);
	}

	@Override
	public EoOrderModel save(EoOrderModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoOrderModel> saveAll(List<EoOrderModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoOrderModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoOrderModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoOrderModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoOrderModel.class, ids);
	}

	/**
	 * 保存订单Dto
	 * add by shoven 2018年8月4日23:26:37
	 * @param eoOrderDto
	 * @return
	 */
	@Override
	public ResponseData<EoOrderDto> saveOrderDto(EoOrderDto eoOrderDto) {
		ResponseData<EoOrderDto> responseData = new ResponseData<EoOrderDto>();
		//获取用户信息
		UserDetails user = SessionContext.getUser();
		
		EoOrderDto afterSaveEoOrderDto = new EoOrderDto();//防止eoOrderDto中数据影响，新创建一个Dto用来作为返回的参数
		//Tep1 构造需要保存的单元数据
		EoOrderModel eoOrderModel = new EoOrderModel();
		EoOrderExpandAgencyModel eoOrderExpandAgencyModel = new EoOrderExpandAgencyModel();
		List<EoOrderMaterielModel> eoOrderMaterielModels = new ArrayList<EoOrderMaterielModel>();
		List<EoOrderPrecontainerModel> eoOrderPrecontainerModels = new ArrayList<EoOrderPrecontainerModel>();
		List<EoOrderContainerModel> eoOrderContainerModels = new ArrayList<EoOrderContainerModel>();
		eoOrderModel = eoOrderDto.getEoOrderModel();
		eoOrderExpandAgencyModel = eoOrderDto.getEoOrderExpandAgencyModel();
		eoOrderMaterielModels = eoOrderDto.getEoOrderMaterielModelList();
		eoOrderPrecontainerModels = eoOrderDto.getEoOrderPrecontainerModelList();
		eoOrderContainerModels = eoOrderDto.getEoOrderContainerModelList();
		//Tep2 对已经构造的数据进行判空处理，为空不执行保存操作，不为空执行保存操作
		/*
		 * --------------------------------------------------------<订单表+订单扩展表保存>
		 */
		Long eoorId = null;
		if (null != eoOrderModel && null != eoOrderExpandAgencyModel) {
			EoOrderModel afterSaveEoOrderModel = new EoOrderModel();
			//afterSaveEoOrderModel = this.save(eoOrderModel);
			
			//1.订单扩展表字段去空格
			eoOrderExpandAgencyModel.setEoeaBulkBillNo(StringUtils.removeSpace(eoOrderExpandAgencyModel.getEoeaBulkBillNo()));
	        eoOrderExpandAgencyModel.setEoeaVesselName(StringUtils.removeSpace(eoOrderExpandAgencyModel.getEoeaVesselName()));
	        eoOrderExpandAgencyModel.setEoeaVoyage(StringUtils.removeSpace(eoOrderExpandAgencyModel.getEoeaVoyage()));
//	        String msg = this.checkEoeaBulkBillNo(eoOrderExpandAgencyModel);
//			if (EmptyUtils.isNotEmpty(msg)) {
//				responseData.setCode(Constants.NO);
//	        	responseData.setMsg(msg);
//	        	responseData.setData(eoOrderDto);//订单保存失败，所以将入参返回出去
//                return responseData;
//			}
	        
	        // -------------保存订单 start---------------
	        //2.订单信息重构
	        EoOrderModel afterCopyModel = new EoOrderModel();
	        BlukInsertUtils.copyPropertiesNonNull(afterCopyModel, eoOrderModel);
	        eoOrderModel = this.buildEoOrderEntity(afterCopyModel, user, eoOrderExpandAgencyModel);
	        if (eoOrderModel == null) { // 如果返回的为空，则表示校验不通过
	        	responseData.setCode(Constants.NO);
	        	responseData.setMsg(Constants.OMS_ORDER_SODO_CANNOT_REPEAT);
                return responseData;
            }
	        if (EmptyUtils.isNotEmpty(eoOrderExpandAgencyModel.getEoeaBulkBillNo())) {
	            responseData = checkEoeaInfo(eoOrderExpandAgencyModel, responseData);
	            if (responseData.getCode() == Constants.NO) {
	                return responseData;
	            }
	        }
	        EoOrderModel orderModel = new EoOrderModel();
			afterSaveEoOrderModel = this.save(eoOrderModel);
			
			if (null != afterSaveEoOrderModel) {
				afterSaveEoOrderDto.setEoOrderModel(afterSaveEoOrderModel);
				eoorId = afterSaveEoOrderModel.getEoorId();
				afterSaveEoOrderModel.setEoorSubstr1(eoorId.toString());
				// -------------保存订单end---------------
				
				Long eoorLoEbppId = eoOrderModel.getEoorLoEbppId();
				// -------------保存拓展表信息 start---------------
				EoOrderExpandAgencyModel afterSaveEoOrderExpandAgencyModel = new EoOrderExpandAgencyModel();
				if (afterSaveEoOrderModel.getEoorId() != null) {
					eoOrderExpandAgencyModel.setEoeaEoorId(afterSaveEoOrderModel.getEoorId());
				}
				//货物流向[代理类型，I :进口，E  出口，L 内贸]
				eoOrderExpandAgencyModel.setEoeaAgencyType(Constants.SYS_EXPORTE);
				
				afterSaveEoOrderExpandAgencyModel = this.eoOrderExpandAgencyManager.save(eoOrderExpandAgencyModel);
				if (null != afterSaveEoOrderExpandAgencyModel) {
					Long eoeaId = afterSaveEoOrderExpandAgencyModel.getEoeaId();
					afterSaveEoOrderModel.setEoorSubstr2(eoeaId.toString());
					afterSaveEoOrderModel = this.save(afterSaveEoOrderModel);
				} else {
					responseData.setMsg("订单基本信息保存失败，请重试");
					responseData.setCode(Constants.NO);
					responseData.setData(afterSaveEoOrderDto);
					return responseData;
				}
				
				String errm = this.procedureManager.invokeAfterSaveOrderEvent(eoorLoEbppId, eoorId);
				afterSaveEoOrderDto.setEoOrderExpandAgencyModel(afterSaveEoOrderExpandAgencyModel);
				//订单基本信息保存完成之后保存出口业务表信息
				saveOrUpdateEoFreightOmport(afterSaveEoOrderModel, afterSaveEoOrderExpandAgencyModel);
				responseData.setMsg("订单基本信息保存成功");
			} else {
				responseData.setMsg("订单基本信息保存失败，请重试");
				responseData.setCode(Constants.NO);
				responseData.setData(afterSaveEoOrderDto);
				return responseData;
			}
	        
		}
		/*
		 * -------------------------------------------------------------<订单预配箱信息保存>
		 */
		if (EmptyUtils.isNotEmpty(eoOrderPrecontainerModels)) {
			List<EoOrderPrecontainerModel> afterSaveEoOrderPrecontainerModels = new ArrayList<EoOrderPrecontainerModel>();
			for (EoOrderPrecontainerModel eoOrderPrecontainerModel : eoOrderPrecontainerModels) {
				eoOrderPrecontainerModel.setEosrEoorId(eoorId);
			}
			afterSaveEoOrderPrecontainerModels = this.eoOrderPrecontainerManager.saveAll(eoOrderPrecontainerModels);
			afterSaveEoOrderDto.setEoOrderPrecontainerModelList(afterSaveEoOrderPrecontainerModels);
			responseData.setMsg("订单预配箱信息保存成功");
		}
		if (EmptyUtils.isNotEmpty(eoOrderMaterielModels)) {
			List<EoOrderMaterielModel> afterSaveeoOrderMaterielModels = new ArrayList<EoOrderMaterielModel>();
			for (EoOrderMaterielModel eoOrderMaterielModel : eoOrderMaterielModels) {
				eoOrderMaterielModel.setEoomEoorId(eoorId);;
			}
			afterSaveeoOrderMaterielModels = this.eoOrderMaterielManager.saveAll(eoOrderMaterielModels); 
			afterSaveEoOrderDto.setEoOrderMaterielModelList(afterSaveeoOrderMaterielModels);
			responseData.setMsg("订单物料信息保存成功");
		}
		if (EmptyUtils.isNotEmpty(eoOrderContainerModels)) {
			List<EoOrderContainerModel> afterSaveEoOrderContainerModels = new ArrayList<EoOrderContainerModel>();
			for (EoOrderContainerModel eoOrderContainerModel : eoOrderContainerModels) {
				eoOrderContainerModel.setEoocEoorId(eoorId);
			}
			afterSaveEoOrderContainerModels = this.eoOrderContainerManager.saveAll(eoOrderContainerModels);
			afterSaveEoOrderDto.setEoOrderContainerModelList(afterSaveEoOrderContainerModels);
			responseData.setMsg("订单箱信息保存成功");
		}
		String synchronizedEoOrderToTask = "";
		String eoOrderLowermeg = "";
		if (null != afterSaveEoOrderDto.getEoOrderModel().getEoorLoEbppId() && EmptyUtils.isNotEmpty(afterSaveEoOrderDto.getEoOrderModel().getEoorStatus()) && Constants.ORDER_STATUS_ACCEPT.equals(afterSaveEoOrderDto.getEoOrderModel().getEoorStatus())) {
			//调用项目执行计划作业步骤，同步基本信息
			synchronizedEoOrderToTask = this.procedureManager.invokeEoOrderFreightSave(afterSaveEoOrderDto.getEoOrderExpandAgencyModel(), "pkg_test.SP_SUB_FREIGHT_HYHD_COMMON");
			//订单状态下发存储过程调用
			eoOrderLowermeg = this.invokeAfterSaveOrderEvent(afterSaveEoOrderDto.getEoOrderModel());
		}
		String errm = "";//收集订单保存之后错误信息
		//Tep3 将保存的值返回
		if (EmptyUtils.isNotEmpty(synchronizedEoOrderToTask)) {
			errm = "订单基本信息同步到任务异常：\n" + synchronizedEoOrderToTask;
		}
		if (EmptyUtils.isNotEmpty(eoOrderLowermeg)) {
			errm = errm + "订单状态下发异常：\n" + eoOrderLowermeg;
		}
		if (EmptyUtils.isNotEmpty(errm)) {
			responseData.setMsg("订单保存成功\n" + errm);
		}
		responseData.setData(afterSaveEoOrderDto);
		if (EmptyUtils.isNotEmpty(errm)) {
			responseData.setCode(Constants.NO);
		} else {
			responseData.setCode(Constants.YES);
		}
		return responseData;
	}
	
	@Autowired
	private EbProjectService ebProjectService;
	
	/**
     * 订单信息重构
     */
    private EoOrderModel buildEoOrderEntity(EoOrderModel eoOrderModel, UserDetails user, EoOrderExpandAgencyModel eoOrderExpandAgencyModel) {
    	
    	
        // BMS信息的控制
        Long userId = Long.valueOf(user.getUserId());
        //公司id
        String escoId = "";
        Long eoorEbpeId = null;//下单人id
        String eoorEbccName = "";//下单人名称
        EsUserModel esUserModel = new EsUserModel();
        if (IgnoreLoginController.isIgnore()) {
        	escoId = null == eoOrderModel.getEoorEscoId() ? user.getOrgId() : eoOrderModel.getEoorEscoId().toString();
            if (null != eoOrderModel.getEoorEbpeId()) {
            	eoorEbpeId = eoOrderModel.getEoorEbpeId();
            } else {
            	eoorEbpeId = null == eoOrderModel.getCreator() ? userId : Long.valueOf(eoOrderModel.getCreator());
            }
            if (null != eoorEbpeId) {
            	esUserModel = this.esUserManager.get(eoorEbpeId);
            	if (null != esUserModel) {
            		eoorEbccName = esUserModel.getEsusUserNameCn();
            	}
            }
        } else {
        	escoId = user.getOrgId();
        	eoorEbccName = user.getUserNameCn();
        	eoorEbpeId = userId;
        }

        // SO NO
        if (EmptyUtils.isEmpty(eoOrderModel.getEoorSoNo())) {
            String eoorSoNo = NOGeneratorUtil.currentValue(Constants.ORDER_SONO);
            eoOrderModel.setEoorSoNo(eoorSoNo);
        }

        // 如果系统订单号为空，则为新增订单，生成系统订单
        if (EmptyUtils.isEmpty(eoOrderModel.getEoorOrderNo())) {
        	String eoorOrderNo = NOGeneratorUtil.currentValue((EmptyUtils.isNotEmpty(eoOrderExpandAgencyModel.getEoeaAgencyType()) && Constants.SYS_IMPORT.equals(eoOrderExpandAgencyModel.getEoeaAgencyType())) ? Constants.ORDER_NO_NAME_FW_IS : Constants.ORDER_NO_NAME);
        	//防止系统订单号重复，取自动生成的系统订单号去查该公司下的订单，如果能查到则重新获取系统订单号
            while (!checkEoOrderByEoOrderNo(eoorOrderNo, escoId)) {
            	eoorOrderNo = NOGeneratorUtil.currentValue((EmptyUtils.isNotEmpty(eoOrderExpandAgencyModel.getEoeaAgencyType()) && Constants.SYS_IMPORT.equals(eoOrderExpandAgencyModel.getEoeaAgencyType())) ? Constants.ORDER_NO_NAME_FW_IS : Constants.ORDER_NO_NAME);
				
			}
            eoOrderModel.setEoorOrderNo(eoorOrderNo);
        }
     
        
        // 如果外运号为空，则为新增订单，生成系统外运号
//        if (EmptyUtils.isEmpty(eoOrderModel.getEoorSinoNo())) {
//             String eoorSinoNo = "";
//        	 Object[] obj = esCounterManager.getSinotransNo(1).toArray();
//             if(EmptyUtils.isNotEmpty(obj)){
//            	 eoorSinoNo = obj[0].toString();
//            	 //为了保证外运号在系统内唯一，订单新增保存之前先校验外运号是否在系统中存在，如果存在则重新取值
//            	 while (!chackEoOrderByEoSino(eoorSinoNo)) {
//            		 obj = esCounterManager.getSinotransNo(1).toArray();
//            		 if (EmptyUtils.isNotEmpty(obj)) {
//            			 eoorSinoNo = obj[0].toString();
//            		 }
//            	 }
//            	 eoOrderModel.setEoorSinoNo(eoorSinoNo);
//             }
//        }
        EoOrderModel eoor = new EoOrderModel();
        if (eoOrderModel.getEoorId() == null) {
        	
            // 公司公司
            eoOrderModel.setEoorEscoId((Long.valueOf(escoId)));
            // 订单状态
            eoOrderModel.setEoorStatus(Constants.ORDER_STATUS_ADD);
            eoOrderModel.setEoorLoPlanStatus(Constants.TASK_STATUS_UNDO);
            // 下单信息
            eoOrderModel.setEoorEbpeId(eoorEbpeId);
            
            eoOrderModel.setEoorEbccName(eoorEbccName);
            
            Date date = new Date();
            eoOrderModel.setEoorOrderDate(date);
            
    		//系统订单隔离
            eoOrderModel.setEoorSource(Constants.EOOR_SOURCE_11);
            BeanUtils.copyProperties(eoor, eoOrderModel);
        }else{//编辑保存
        	EoOrderModel aferEoOrderModel = new EoOrderModel();
        	if (null != eoOrderModel.getEoorId()) {
        		aferEoOrderModel = this.get(eoOrderModel.getEoorId());
        	}
        	//eoor = this.get(eoOrderModel.getEoorId());
        	BlukInsertUtils.copyPropertiesNonNull(eoor,eoOrderModel);
        	//订单执行必须扩展字段345为'',订单执行状态为1
        	eoor.setEoorLoPlanStatus(Constants.TASK_STATUS_UNDO);
        	eoor.setEoorSource(Constants.EOOR_SOURCE_11);
        	eoor.setEoorQuantity(aferEoOrderModel.getEoorQuantity() == null ? 0 : aferEoOrderModel.getEoorQuantity());
        	eoor.setEoorWeight(aferEoOrderModel.getEoorWeight() == null ? 0.00 : aferEoOrderModel.getEoorWeight());
        	eoor.setEoorVolume(aferEoOrderModel.getEoorVolume() == null ? 0.00 : aferEoOrderModel.getEoorVolume());
        	eoor.setEoorNetWeight(aferEoOrderModel.getEoorNetWeight() == null ? 0.00 : aferEoOrderModel.getEoorNetWeight());
        }
        //--封装结算单类型
        String eoorBusinessType = ebProjectService.getBusinessTypeByEbppIdOrEbpjId(eoor.getEoorLoEbppId(), eoor.getEoorEbpjId());
        eoor.setEoorBusinessType(eoorBusinessType);
        
        
        // 20160727 增加对上传的部门和销售人员代码的处理
        // start add by daniel 20130906 添加 BMS信息的控制
        /*
         * 1.部门代码和销售人员代码都为空 .看当前用户是否是销售人员， 1.1如果是：销售人员代码的值为该用户的销售人员代码，然后判断该用户是否有所属部门，若有部门代码的值为该部门的部门财务代码，若无，值为空。
         * 1.2如果不是：则找到当前部门，销售人员代码的值为该部门的默认销售人员代码。部门代码的值为该部门的部门财务代码；
         */
        if (EmptyUtils.isEmpty(eoor.getEoorBmsEsdeDepartmentCode()) && EmptyUtils.isEmpty(eoor.getEoorBmsEbsmCode())) {
            String userId2 = SessionContext.getUser().getUserId();
            if (null != userId2) {
                EsUserModel userModel = this.esUserManager.get(Long.valueOf(userId2));
                if (null != userModel.getEsusEsdeId()) {
                    EsDepartmentModel esDepartmentModel = this.esDepartmentManager.get(userModel.getEsusEsdeId());
                    if (esDepartmentModel != null) {
                    	eoor.setEoorBmsEsdeDepartmentCode(esDepartmentModel.getEsdeBmsDepartmentCode());
                    	eoor.setEoorBmsEbsmCode(esDepartmentModel.getEsdeDefaultBmsEbsmCode());
                    }
                }
                if (Constants.YES.equals(userModel.getEsusIsSalesman())) {
                	eoor.setEoorBmsEbsmCode(userModel.getEsusBmsEbsmCode());
                }
            }
        }
        /*
         * 2.部门代码为空 销售人员代码不为空 找出当前用户的所属部门，设置部门代码
         * 
         */
        if (EmptyUtils.isEmpty(eoor.getEoorBmsEsdeDepartmentCode()) && EmptyUtils.isNotEmpty(eoor.getEoorBmsEbsmCode())) {
            String userId2 = SessionContext.getUser().getUserId();
            if (null != userId2) {
                EsUserModel userModel = this.esUserManager.get(Long.valueOf(userId2));
                if (null != userModel.getEsusEsdeId()) {
                    EsDepartmentModel esDepartmentModel = this.esDepartmentManager.get(userModel.getEsusEsdeId());
                    if (esDepartmentModel != null) {
                    	eoor.setEoorBmsEsdeDepartmentCode(esDepartmentModel.getEsdeBmsDepartmentCode());
                    }
                }
            }
        }
        /*
         * 3.部门代码不为空 销售人员代码为空 找出当前用户，看是否是销售人员，若是则设值。若不是则找出器所属部门的默认销售人员代码设值。
         */
        if (EmptyUtils.isNotEmpty(eoor.getEoorBmsEsdeDepartmentCode()) && EmptyUtils.isEmpty(eoor.getEoorBmsEbsmCode())) {
            String userId2 = SessionContext.getUser().getUserId();
            eoor = getBmsEsdeDepartment(userId, eoor, userId2);
        }
        // end add by daniel 20130906 添加 BMS信息的控制
        /*
         * 4.如果附属信息中的客户代码为空，取项目配置的客户代码  如没配取当前订单委托方。
         */
    	EbProjectModel ebProjectModel = new EbProjectModel();
    	if (eoor.getEoorEbpjId() != null) {
    		ebProjectModel = this.ebProjectManager.get(eoor.getEoorEbpjId());
    	}
        if(EmptyUtils.isEmpty(eoOrderModel.getEoorBmsAEbcuCustomerNo())){
        	if(EmptyUtils.isNotEmpty(ebProjectModel.getEbpjBmsAEbcuCustomerNo())){
        		eoor.setEoorBmsAEbcuCustomerNo(ebProjectModel.getEbpjBmsAEbcuCustomerNo());
        	}else{
        		eoor.setEoorBmsAEbcuCustomerNo(eoor.getEoorConsignorEbcuCode());
        	}
        }
        
      //TODO 订单的SO+DO+订单笔次+项目ID不能重复时，增加过滤作废的订单判断
       /* Map<String, Object> checkCondition = new HashMap<>();
        if (EmptyUtils.isNotEmpty(eoOrderModel.getEoorSoNo())) {
        	checkCondition.put("eoorSoNo", eoOrderModel.getEoorSoNo());
        } else {
        	checkCondition.put("isSoNull", Constants.YES);
        }
        if (EmptyUtils.isNotEmpty(eoOrderModel.getEoorDoNo())) {
        	checkCondition.put("eoorDoNo", eoOrderModel.getEoorDoNo());
        } else {
        	checkCondition.put("isDoNull", Constants.YES);
        }
        if (EmptyUtils.isNotEmpty(eoOrderModel.getEoorOrderFudeji())) {
        	checkCondition.put("eoorOrderFudeji", eoOrderModel.getEoorOrderFudeji());
        } else {
        	checkCondition.put("isFudejiNull", Constants.YES);
        }
        if (null != eoOrderModel.getEoorEbpjId()) {
        	checkCondition.put("eoorEbpjId", eoOrderModel.getEoorEbpjId());
        } else {
        	checkCondition.put("isEbpjNull", Constants.YES);
        }
        checkCondition.put("eoorEscoId", eoOrderModel.getEoorEscoId());
        List<Map<String, Object>> list = this.myBatisDao.queryByCondition("com.sinotrans.oms.eoorder.mapper.CheckOrderUniqueQuery", checkCondition, null, null, null);
		List<EoOrderModel> checkList = new ArrayList<>();
		for (Map<String, Object> map : list) {
			checkList.add((EoOrderModel) BlukInsertUtils.parseMapToObject(map, new EoOrderModel()));
        }
        if (EmptyUtils.isNotEmpty(checkList)) {
            if (checkList.size() != 1) {
                return null;
            } else {
                if (!checkList.get(0).getEoorId().equals(eoOrderModel.getEoorId())) {
                    return null;
                }
            }
        }*/
        return eoor;
    }
    @Override
    public Map<String, Object> getBmsEbsmCode() {
    	Map<String, Object> map = new HashMap<String, Object>();
    	UserDetails user = SessionContext.getUser();
    	if (null != Long.valueOf(user.getUserId())) {
		    EsUserModel userModel = this.esUserManager.get(Long.valueOf(user.getUserId()));
		    if (null != userModel.getEsusEsdeId()) {
		        EsDepartmentModel esDepartmentModel = this.esDepartmentManager.get(userModel.getEsusEsdeId());
		        if (esDepartmentModel != null) {
		        	map.put("eoorBmsEbsmCode", esDepartmentModel.getEsdeDefaultBmsEbsmCode());
		        }
		    }
		    if (Constants.YES.equals(userModel.getEsusIsSalesman())) {
		    	map.put("eoorBmsEbsmCode", userModel.getEsusBmsEbsmCode());
		    }
		}
    	return map;
    }
    
    
	private EoOrderModel getBmsEsdeDepartment(Long userId, EoOrderModel eoor, String userId2) {
		if (null != userId) {
		    EsUserModel userModel = this.esUserManager.get(Long.valueOf(userId2));
		    if (null != userModel.getEsusEsdeId()) {
		        EsDepartmentModel esDepartmentModel = this.esDepartmentManager.get(userModel.getEsusEsdeId());
		        if (esDepartmentModel != null) {
		        	eoor.setEoorBmsEbsmCode(esDepartmentModel.getEsdeDefaultBmsEbsmCode());
		        }
		    }
		    if (Constants.YES.equals(userModel.getEsusIsSalesman())) {
		    	eoor.setEoorBmsEbsmCode(userModel.getEsusBmsEbsmCode());
		    }
		}
		return eoor;
	}
    //取消科学计数法 by Richard 2018年8月15日17:09:07
    private String CancelScientificCounting(){
    	double d =(long)(Math.random()*90000000 +10000000);
    	Double data = d;
    	if (data.toString().indexOf("E")> -1){
    		Double num = Double.parseDouble(data.toString());
    		String result = new BigDecimal(num.toString()).toString();
    		return result;
    	}
    	return data.toString();
    }
    /**
     * 
     * @DATE 2018年9月5日 下午4:15:07
     * @AUTHOR Simon-Guo 
     * @DESCRIPTION:根据公司和提单号校验提单号的唯一性
     * @param model
     * @param msg
     */
    private ResponseData<EoOrderDto> checkEoeaInfo(EoOrderExpandAgencyModel model, ResponseData<EoOrderDto> responseData) {
        model.setEoeaBulkBillNo(model.getEoeaBulkBillNo().trim());// 去除空格
        // 根据公司和提单号校验提单号的唯一性
        List<FilterCondition> conditions = new ArrayList<>();
        conditions.add(new FilterCondition("eoeaBulkBillNo",model.getEoeaBulkBillNo(),"="));
        conditions.add(new FilterCondition("eoeaEscoId",model.getEoeaEscoId(),"="));
        List<EoOrderExpandAgencyModel> eoeaList = eoOrderExpandAgencyManager.findByCondition(conditions );
        if (eoeaList != null && eoeaList.size() > 0) {
            for (EoOrderExpandAgencyModel eoea : eoeaList) {
                EoOrderModel eoOrderModel = this.get(eoea.getEoeaEoorId());
                // 如果订单已作废 , 则忽略提单号的校验 (已经删除的订单忽略提单号的校验  update by shoven)
                if (!eoea.getEoeaId().equals(model.getEoeaId()) && !eoOrderModel.getEoorStatus().equals(Constants.ORDER_VOID)
                        && !Constants.FREIGHT_IMPORT_ZXD.equals(eoOrderModel.getEoorSource()) && !eoOrderModel.getEoorStatus().equals(Constants.ORDER_DELETE)) {
                    responseData.setCode(Constants.NO);
                    responseData.setMsg("当前提单号已经存在，请重新录入");
                }
            }
        }
        return responseData;
    }
	/**
	 * 批量保存订单Dto
	 * add by shoven 2018年8月4日23:26:37
	 * @param eoOrderDtos
	 * @return 
	 */
	@Override
	public ResponseData<Map<Boolean, List<EoOrderDto>>> batchSaveOrder(List<EoOrderDto> eoOrderDtos) {
		ResponseData<Map<Boolean, List<EoOrderDto>>> responseData = new ResponseData<>();
		List<EoOrderDto> saveSuccessEoOrderDto = new ArrayList<>();//保存成功的数据
		List<EoOrderDto> saveFailEoOrderDto = new ArrayList<>();//保存失败的数据
		Map<Boolean, List<EoOrderDto>> resultMap = new HashMap();
		for (int i = 0; i < eoOrderDtos.size(); i++) {
			EoOrderDto afterEoOrderDto = new EoOrderDto();
			ResponseData<EoOrderDto> response = this.saveEoOrderInformation(eoOrderDtos.get(i));
			afterEoOrderDto = response.getData();
			if (Constants.NO.equals(response.getCode())) {
				afterEoOrderDto.setErrm(response.getMsg());//用来处理每条订单DTO保存失败之后的错误信息
				saveFailEoOrderDto.add(afterEoOrderDto);
			} else {
				saveSuccessEoOrderDto.add(response.getData());
			}
//			//Tep1 构造需要保存的单元数据
//			EoOrderModel eoOrderModel = new EoOrderModel();
//			List<EoOrderMaterielModel> eoOrderMaterielModels = new ArrayList<EoOrderMaterielModel>();
//			List<EoOrderPrecontainerModel> eoOrderPrecontainerModels = new ArrayList<EoOrderPrecontainerModel>();
//			List<EoOrderContainerModel> eoOrderContainerModels = new ArrayList<EoOrderContainerModel>();
//			eoOrderModel = eoOrderDtos.get(i).getEoOrderModel();
//			eoOrderMaterielModels = eoOrderDtos.get(i).getEoOrderMaterielModelList();
//			eoOrderPrecontainerModels = eoOrderDtos.get(i).getEoOrderPrecontainerModelList();
//			eoOrderContainerModels = eoOrderDtos.get(i).getEoOrderContainerModelList();
//			//Tep2 对已经构造的数据进行判空处理，为空不执行保存操作，不为空执行保存操作
//			if (null != eoOrderModel) {
//				EoOrderModel afterSaveEoOrderModel = new EoOrderModel();
//				afterSaveEoOrderModel = this.save(eoOrderModel);
//			}
//			if (EmptyUtils.isNotEmpty(eoOrderMaterielModels)) {
//				List<EoOrderMaterielModel> afterSaveeoOrderMaterielModels = new ArrayList<EoOrderMaterielModel>();
//				afterSaveeoOrderMaterielModels = this.eoOrderMaterielManager.saveAll(eoOrderMaterielModels);
//			}
//			if (EmptyUtils.isNotEmpty(eoOrderPrecontainerModels)) {
//				List<EoOrderPrecontainerModel> afterSaveEoOrderPrecontainerModels = new ArrayList<EoOrderPrecontainerModel>();
//				this.eoOrderPrecontainerManager.saveAll(eoOrderPrecontainerModels);
//			}
//			if (EmptyUtils.isNotEmpty(eoOrderContainerModels)) {
//				List<EoOrderContainerModel> afterSaveEoOrderContainerModels = new ArrayList<EoOrderContainerModel>();
//				afterSaveEoOrderContainerModels = this.eoOrderContainerManager.saveAll(eoOrderContainerModels);
//			}
		}
		//对订单保存信息进行分组，保存成功和保存失败
		resultMap.put(true, saveSuccessEoOrderDto);
		resultMap.put(false, saveFailEoOrderDto);
		responseData.setData(resultMap);
		if (EmptyUtils.isEmpty(resultMap.get(false))) {//如果保存失败的list集合是空的
			responseData.setCode(Constants.YES);
			responseData.setMsg("订单信息保存成功。");
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单信息保存失败，请重试");
		}
		return responseData;
	}

	/**
	 * 通过固定的查询条件来获取订单的查询结果
	 * @param conditionMap
	 * add by shoven 2018年8月8日14:33:21
	 * @return
	 */
	@Override
	public QueryData queryOrderByCondition(QueryInfo queryInfo) {
	  /*List<Map<String, Object>> eoOrderListMap = this.myBatisDao.queryByCondition("EoOrderListQuery", conditionMap, null, null, null);
		List<EoOrderListItem> eoOrderListItems = new ArrayList<EoOrderListItem>();
		ResponseData<List<EoOrderListItem>> responseData = new ResponseData<List<EoOrderListItem>>();
		if (EmptyUtils.isEmpty(eoOrderListMap)) {
			return (ResponseData<List<EoOrderListItem>>) eoOrderListItems;
		}
		for (@SuppressWarnings("rawtypes") Map map : eoOrderListMap) {
			eoOrderListItems.add((EoOrderListItem) BlukInsertUtils.parseMapToObject(map, new EoOrderListItem()));
		}*/
		queryInfo.setQueryType("com.sinotrans.oms.eoorder.mapper.EoOrderListNewQuery");
		return commonQueryManager.query(queryInfo);
	}
	@Override
	public QueryData queryOrderFeeByCondition(QueryInfo queryInfo) {
		queryInfo.setQueryType("com.sinotrans.oms.eoorder.mapper.EoOrderListQuery");
		return commonQueryManager.query(queryInfo);
	}

	@Override
	public EoOrderDto getOrderById(Long eoorId) {
		if(eoorId != null){
			EoOrderDto eoOrderDto = new EoOrderDto();
			//订单基本信息
			EoOrderModel eoOrderModel = this.get(eoorId);
			 eoOrderDto.setEoOrderModel(eoOrderModel);
			//订单扩展信息
			FilterCondition eoeaFilterCondition=new FilterCondition();
			eoeaFilterCondition.setFieldName("eoeaEoorId");
			eoeaFilterCondition.setFieldValue(eoorId);
			eoeaFilterCondition.setOperator("=");
			List<FilterCondition> eoeaConditions = new ArrayList<>();
			eoeaConditions.add(eoeaFilterCondition);
			List<EoOrderExpandAgencyModel> EoOrderExpandAgencyModelList = eoOrderExpandAgencyManager.findByCondition(eoeaConditions);
			if(EoOrderExpandAgencyModelList.size()>0){
				eoOrderDto.setEoOrderExpandAgencyModel(EoOrderExpandAgencyModelList.get(0));
			}
			//物料信息eoomEoorId
			FilterCondition eoomFilterCondition = new FilterCondition();
			eoomFilterCondition.setFieldName("eoomEoorId");
			eoomFilterCondition.setFieldValue(eoorId);
			eoomFilterCondition.setOperator("=");
			List<FilterCondition> eoomConditions = new ArrayList<>();
			eoomConditions.add(eoomFilterCondition);
			List<EoOrderMaterielModel> eoOrderMaterielModelList = eoOrderMaterielManager.findByCondition(eoomConditions);
			eoOrderDto.setEoOrderMaterielModelList(eoOrderMaterielModelList);
			//箱信息eoocEoorId
			FilterCondition eoocFilterCondition = new FilterCondition();
			eoocFilterCondition.setFieldName("eoocEoorId");
			eoocFilterCondition.setFieldValue(eoorId);
			eoocFilterCondition.setOperator("=");
			List<FilterCondition> eoocConditions = new ArrayList<>();
			eoocConditions.add(eoocFilterCondition);
			List<EoOrderContainerModel> eoOrderContainerModelList = eoOrderContainerManager.findByCondition(eoocConditions);
			eoOrderDto.setEoOrderContainerModelList(eoOrderContainerModelList);
			//箱需求表eosrEoorId
			FilterCondition eosrFilterCondition = new FilterCondition();
			eosrFilterCondition.setFieldName("eosrEoorId");
			eosrFilterCondition.setFieldValue(eoorId);
			eosrFilterCondition.setOperator("=");
			List<FilterCondition> eosrConditions = new ArrayList<>();
			eosrConditions.add(eosrFilterCondition);
			List<EoOrderPrecontainerModel> eoOrderPrecontainerModelList = eoOrderPrecontainerManager.findByCondition(eosrConditions);
			eoOrderDto.setEoOrderPrecontainerModelList(eoOrderPrecontainerModelList);
			//箱需求表eosrEoorId
			FilterCondition eofiFilterCondition = new FilterCondition();
			eofiFilterCondition.setFieldName("eofiEoorId");
			eofiFilterCondition.setFieldValue(eoorId);
			eofiFilterCondition.setOperator("=");
			List<FilterCondition> eofiConditions = new ArrayList<>();
			eofiConditions.add(eofiFilterCondition);
			eofiConditions.add(new FilterCondition("eofiType", Constants.EO_FREIGHT_TYPE, "="));
			List<EoFreightImportModel> eoFreightImportModelList = this.eoFreightimportManager.findByCondition(eofiConditions);
			if (EmptyUtils.isNotEmpty(eoFreightImportModelList)) {
				eoOrderDto.setEoFreightimportModel(eoFreightImportModelList.get(0));
			}
			return eoOrderDto;
		}
		return null;
	}

	@Override
	public ResponseData<EoOrderDto> acceptOrder(Long eoorId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EoFreightOmportStatusQueryItem> queryByCondition(Map<String, Object> condition) {
		List<Map<String, Object>> list = this.myBatisDao.queryByCondition("com.sinotrans.oms.eoorder.mapper.EoFreightOmportStatusQuery", condition, null, null, null);
		List<EoFreightOmportStatusQueryItem> eoFreightOmportStatusQueryItems = new ArrayList<>();
		if (EmptyUtils.isEmpty(list)) {
            return eoFreightOmportStatusQueryItems;
        } 
		for (Map<String, Object> map : list) {
			eoFreightOmportStatusQueryItems.add((EoFreightOmportStatusQueryItem) BlukInsertUtils.parseMapToObject(map, new EoFreightOmportStatusQueryItem()));
        }
		return eoFreightOmportStatusQueryItems;
	}
	@Override
	public EoOrderIssuedStatusDto getEoorIssuedStatus(Map<String, Object> condition) throws Exception{
		List<Map<String, Object>> list = this.myBatisDao.queryByCondition("com.sinotrans.oms.eoorder.mapper.EoEoorIssuedStatusQuery", condition, null, null, null);
		List<EoOrderIssuedStatusDto> eoOrderIssuedStatusDtoQueryItems = new ArrayList<>();
		if (EmptyUtils.isEmpty(list)) {
			return new EoOrderIssuedStatusDto();
		} 
		for (Map<String, Object> map : list) {
			eoOrderIssuedStatusDtoQueryItems.add((EoOrderIssuedStatusDto) BlukInsertUtils.parseMapToObject(map, new EoOrderIssuedStatusDto()));
		}
		return eoOrderIssuedStatusDtoQueryItems.get(0);
	}
	
	/**
	 * 订单保存的时候同步保存出口业务表信息
	 * @author Shoven.Jiang  
	 * @date 2018年10月30日
	 * @param eoOrderModel
	 * @param eoOrderExpandAgencyModel
	 */
	private void saveOrUpdateEoFreightOmport(EoOrderModel eoOrderModel, EoOrderExpandAgencyModel eoOrderExpandAgencyModel) {
		EoFreightOmportModel eoFreightOmportModel = new EoFreightOmportModel();
		Long eoorId = eoOrderModel.getEoorId();
		if (null != eoorId) {
			List<FilterCondition> eofoCondition = new ArrayList<>();
			eofoCondition.add(new FilterCondition("eofoEoorId", eoorId, "="));
			List<EoFreightOmportModel> eoFreightOmportModels = this.eoFreightOmportManager.findByCondition(eofoCondition);
			if (EmptyUtils.isNotEmpty(eoFreightOmportModels)) {
				eoFreightOmportModel = eoFreightOmportModels.get(0);
			} else {
				eoFreightOmportModel.setEofoEscoId(eoOrderModel.getEoorEscoId());
				eoFreightOmportModel.setEofoEoorId(eoorId);
				eoFreightOmportModel.setEofoEbpjId(eoOrderModel.getEoorEbpjId());
				eoFreightOmportModel.setEofoLoEbppId(eoOrderModel.getEoorLoEbppId());
				eoFreightOmportModel.setEofoEscoId(eoOrderModel.getEoorEscoId());
				eoFreightOmportModel.setEofoSoNo(eoOrderModel.getEoorSoNo());
				eoFreightOmportModel.setEofoDoNo(eoOrderModel.getEoorDoNo());
				eoFreightOmportModel.setEofoBulkBillNo(eoOrderExpandAgencyModel.getEoeaBulkBillNo());
				eoFreightOmportModel.setEofoHblNo(eoOrderExpandAgencyModel.getEoeaHblNo());
			}
			this.eoFreightOmportManager.save(eoFreightOmportModel);
		}
	}

	@Override
	public QueryData getEoOrderMaterielAndEomjByEoocId(Long eoocId) {
		
		List<QueryField> queryFieldList = new ArrayList<>();
		//组装数据
		QueryField queryField = new QueryField();
		queryField.setFieldName("CDT_eoocId");
		queryField.setOperator("=");
		queryField.setFieldValue(eoocId);
		queryFieldList.add(queryField);
		
		QueryInfo queryInfo = new QueryInfo();
		queryInfo.setQueryFields(queryFieldList);
		queryInfo.setQueryType("com.sinotrans.oms.eoorder.mapper.EoOrderMaterielAndEomjListQuery");
		
		return commonQueryManager.query(queryInfo);
	}
	
	/**
	 * 订单作业步骤的执行
	 */
	public String invokeAfterSaveOrderEvent(EoOrderModel eoOrderModel) {
		String errm = "";
		if (null != eoOrderModel) {
			Long ebppId = eoOrderModel.getEoorLoEbppId();
			Long eoorId = eoOrderModel.getEoorId();
			List<FilterCondition> conditions = new ArrayList<>();
			conditions.add(new FilterCondition("ebevEbppId", ebppId, "="));
			List<EbPlanEventModel> events = this.ebPlanEventManager.findByCondition(conditions);
			Set<String> ebpdCodes = new HashSet<String>();//去掉重复
			for(EbPlanEventModel event : events){
				String ebpdCode = event.getEbevEvtEbpdCode();
				if(!ebpdCodes.contains(ebpdCode) && ebpdCode != null && event.getEbevEbtkId()==null){
					// 调用事件触发执行逻辑中定义的存储过程
					errm += this.procedureManager.callEventStoreProcedure(ebpdCode,"",eoorId);
					ebpdCodes.add(ebpdCode);
				}
				if("null".equals(errm.toString().trim()))errm="";
			}
		}
		return errm;
	}
	
	/**
	 * 订单以及订单代理拓展表保存【订单基本信息保存】
	 * @author Shoven.Jiang  
	 * @date 2018年11月19日
	 * @param eoOrderDto
	 * @return
	 */
	private ResponseData<EoOrderDto> saveEoOrderInformation(EoOrderDto eoOrderDto) {
		//获取用户信息
		UserDetails user = SessionContext.getUser();
		ResponseData<EoOrderDto> responseData = new ResponseData<>();
		EoOrderDto afterEoOrderDto = new EoOrderDto();
		EoOrderModel eoOrderModel = eoOrderDto.getEoOrderModel();//获取订单实体对象
		EoOrderExpandAgencyModel eoOrderExpandAgencyModel = eoOrderDto.getEoOrderExpandAgencyModel();//获取订单代理拓展表实体对象
		EoOrderExpandAgencyModel afterSaveEoOrderExpandAgencyModel = new EoOrderExpandAgencyModel();//订单代理拓展表保存之后的实体对象
		EoOrderModel afterSaveEoOrderModel = new EoOrderModel();//用来装载保存之后的返回实体类
		if (null != eoOrderModel) {
			//--------------------保存订单信息eo_order---------------------------
			//1、订单信息重构
			//EoOrderModel afterCopyModel = new EoOrderModel();//接收处理过之后的订单
	        //BlukInsertUtils.copyPropertiesNonNull(afterCopyModel, eoOrderModel);//用来处理订单中某些为null的值
	        eoOrderModel = this.buildEoOrderEntity(eoOrderModel, user, eoOrderExpandAgencyModel);
	        if (null == eoOrderModel) { // 如果返回的为空，则表示校验不通过
	        	responseData.setCode(Constants.NO);
	        	responseData.setMsg(Constants.OMS_ORDER_SODO_CANNOT_REPEAT);
	        	responseData.setData(eoOrderDto);//订单保存失败，所以将入参返回出去
                return responseData;
            }
			afterSaveEoOrderModel = this.save(eoOrderModel);
			if (null != afterSaveEoOrderModel) {
				//2、保存订单代理拓展表信息
				if (null != eoOrderExpandAgencyModel) {
					responseData = this.saveEoOrderExpandAgencyModel(afterSaveEoOrderModel, eoOrderExpandAgencyModel);
					if (Constants.NO.equals(responseData.getCode())) {
						responseData.getData().setEoOrderModel(afterSaveEoOrderModel);//保存订单代理拓展表失败，将保存之后的订单表信息与传入的订单代理拓展表信息反馈回去
						return responseData;
					} else {
						afterSaveEoOrderExpandAgencyModel = responseData.getData().getEoOrderExpandAgencyModel();
						if (null != afterSaveEoOrderExpandAgencyModel) {
							afterSaveEoOrderModel.setEoorSubstr2(afterSaveEoOrderExpandAgencyModel.getEoeaId().toString());
						}
						//3、对订单表信息进一步完善
						afterSaveEoOrderModel.setEoorSubstr1(afterSaveEoOrderModel.getEoorId().toString());
						afterSaveEoOrderModel = this.save(afterSaveEoOrderModel);
					}
				}
			} else {
				responseData.setCode(Constants.NO);
				responseData.setData(eoOrderDto);
				responseData.setMsg("订单信息保存失败，请重试！");
				return responseData;
			}
		} else {
			responseData.setCode(Constants.NO);
			responseData.setData(eoOrderDto);
			responseData.setMsg("订单信息保存失败，请重试！");
			return responseData;
		}
		afterEoOrderDto.setEoOrderExpandAgencyModel(afterSaveEoOrderExpandAgencyModel);
		afterEoOrderDto.setEoOrderModel(afterSaveEoOrderModel);
		//4、订单保存成功之后调用项目执行计划同步任务信息以及做订单状态下发
		String errm = this.updateTaskAndSendStatusToPool(afterEoOrderDto);
		if (EmptyUtils.isNotEmpty(errm)) {//收集订单保存之后的错误信息
			responseData.setMsg("订单信息保存成功\n" + errm);
			responseData.setCode(Constants.NO);
		} else {
			responseData.setMsg("订单信息保存成功");
			responseData.setCode(Constants.YES);
		}
		responseData.setData(afterEoOrderDto);
		return responseData;
	}
	
	/**
	 * 订单保存，保存订单代理拓展表信息
	 * @author Shoven.Jiang  
	 * @date 2018年11月19日
	 * @param eoOrderModel
	 * @param eoOrderExpandAgencyModel
	 * @return
	 */
	private ResponseData<EoOrderDto> saveEoOrderExpandAgencyModel(EoOrderModel eoOrderModel, EoOrderExpandAgencyModel eoOrderExpandAgencyModel) {
		ResponseData<EoOrderDto> responseData = new ResponseData<>();
		EoOrderDto eoOrderDto = new EoOrderDto();
		//EoOrderExpandAgencyModel beforeSaveEoOrderExpandAgencyModel = new EoOrderExpandAgencyModel();//保存之前将数据copy储存
		EoOrderExpandAgencyModel afterSaveEoOrderExpandAgencyModel = new EoOrderExpandAgencyModel();//保存之后的返回值
		//BlukInsertUtils.copyPropertiesNonNull(beforeSaveEoOrderExpandAgencyModel, eoOrderExpandAgencyModel);//用来处理订单中某些为null的值
		Long eoorId = eoOrderModel.getEoorId();
		//1.订单扩展表字段去空格
		eoOrderExpandAgencyModel.setEoeaBulkBillNo(StringUtils.removeSpace(eoOrderExpandAgencyModel.getEoeaBulkBillNo()));
		eoOrderExpandAgencyModel.setEoeaVesselName(StringUtils.removeSpace(eoOrderExpandAgencyModel.getEoeaVesselName()));
		eoOrderExpandAgencyModel.setEoeaVoyage(StringUtils.removeSpace(eoOrderExpandAgencyModel.getEoeaVoyage()));
        //2、MBL号存在时，校验唯一性
        if (EmptyUtils.isNotEmpty(eoOrderExpandAgencyModel.getEoeaBulkBillNo())) {
            responseData = checkEoeaInfo(eoOrderExpandAgencyModel, responseData);
            if (responseData.getCode() == Constants.NO) {
            	eoOrderDto.setEoOrderExpandAgencyModel(eoOrderExpandAgencyModel);
            	responseData.setData(eoOrderDto);//订单保存失败，所以将订单代理拓展表原本信息反馈回去
                return responseData;
            }
        }
        eoOrderExpandAgencyModel.setEoeaEoorId(eoorId);
        //货物流向[代理类型，I :进口，E  出口，L 内贸]
        eoOrderExpandAgencyModel.setEoeaAgencyType(Constants.SYS_EXPORTE);
		afterSaveEoOrderExpandAgencyModel = this.eoOrderExpandAgencyManager.save(eoOrderExpandAgencyModel);
		//保存成功之后将订单代理表信息返回
		responseData.setCode(Constants.YES);
		eoOrderDto.setEoOrderExpandAgencyModel(afterSaveEoOrderExpandAgencyModel);
		responseData.setData(eoOrderDto);
		return responseData;
	}
	
	/**
	 * 调用项目执行计划同步订单任务以及做订单状态下达
	 * @author Shoven.Jiang  
	 * @date 2018年11月19日
	 * @param afterSaveEoOrderDto
	 * @return
	 */
	private String updateTaskAndSendStatusToPool(EoOrderDto afterSaveEoOrderDto) {
		String synchronizedEoOrderToTask = "";
		String eoOrderLowermeg = "";
		if (null != afterSaveEoOrderDto.getEoOrderModel().getEoorLoEbppId() && EmptyUtils.isNotEmpty(afterSaveEoOrderDto.getEoOrderModel().getEoorStatus()) && Constants.ORDER_STATUS_ACCEPT.equals(afterSaveEoOrderDto.getEoOrderModel().getEoorStatus())) {
			//调用项目执行计划作业步骤，同步基本信息
			synchronizedEoOrderToTask = this.procedureManager.invokeEoOrderFreightSave(afterSaveEoOrderDto.getEoOrderExpandAgencyModel(), "pkg_test.SP_SUB_FREIGHT_HYHD_COMMON");
			//订单状态下发存储过程调用
			eoOrderLowermeg = this.invokeAfterSaveOrderEvent(afterSaveEoOrderDto.getEoOrderModel());
		}
		String errm = "";//收集订单保存之后错误信息
		//Tep3 将保存的值返回
		if (EmptyUtils.isNotEmpty(synchronizedEoOrderToTask)) {
			errm = "订单基本信息同步到任务异常：\n" + synchronizedEoOrderToTask;
		}
		if (EmptyUtils.isNotEmpty(eoOrderLowermeg)) {
			errm = errm + "订单状态下发异常：\n" + eoOrderLowermeg;
		}
		return errm;
	}
	
	/**
	 * 新增订单时校验系统订单号是否重复
	 * @author Shoven.Jiang  
	 * @date 2018年11月26日
	 * @param eoorOrderNo
	 * @param escoId
	 * @return
	 */
	@Override
	public Boolean checkEoOrderByEoOrderNo(String eoorOrderNo, String escoId) {
		Boolean flag = false;
		List<FilterCondition> eoorCondition = new ArrayList<>();
		if (EmptyUtils.isNotEmpty(escoId)) {
			eoorCondition.add(new FilterCondition("eoorEscoId", Long.valueOf(escoId), "="));
		}
		eoorCondition.add(new FilterCondition("eoorOrderNo", eoorOrderNo, "="));
		List<EoOrderModel> eoOrderModels = this.findByCondition(eoorCondition);
		if (EmptyUtils.isNotEmpty(eoOrderModels)) {
			return flag;
		}
		return true;
	}
	
	/**
	 * 新增订单时校验外运号是否在系统存在，保证系统外运号在系统内唯一
	 * @author Shoven.Jiang  
	 * @date 2018年11月28日
	 * @param eoorSinoNo
	 * @param escoId
	 * @return
	 */
	@Override
	public Boolean chackEoOrderByEoSino(String eoorSinoNo) {
		Boolean flag = false;
		List<FilterCondition> eoorCondition = new ArrayList<>();
		eoorCondition.add(new FilterCondition("eoorSinoNo", eoorSinoNo, "="));
		List<EoOrderModel> eoOrderModels = this.findByCondition(eoorCondition);
		if (EmptyUtils.isNotEmpty(eoOrderModels)) {
			return flag;
		}
		return true;
	}
	
	/**
	 * 保存订单Dto
	 * add by shoven 2018年8月4日23:26:37
	 * @param eoOrderDto
	 * @return
	 */
	@Override
	public ResponseData<EoOrderDto> saveOrderByTypeI(EoOrderDto eoOrderDto) {
		ResponseData<EoOrderDto> responseData = new ResponseData<EoOrderDto>();
		UserDetails user = SessionContext.getUser();//获取用户信息
		EoOrderDto afterSaveEoOrderDto = new EoOrderDto();//防止eoOrderDto中数据影响，新创建一个Dto用来作为返回的参数
		/***********************
		 * Tep1 构造需要保存的单元数据***************-----订单基本信息保存开始-----****************************
		 * *********************/
		List<EoOrderMaterielModel> eoOrderMaterielModels = new ArrayList<EoOrderMaterielModel>();
		List<EoOrderPrecontainerModel> eoOrderPrecontainerModels = new ArrayList<EoOrderPrecontainerModel>();
		List<EoOrderContainerModel> eoOrderContainerModels = new ArrayList<EoOrderContainerModel>();
		eoOrderMaterielModels = eoOrderDto.getEoOrderMaterielModelList();
		eoOrderPrecontainerModels = eoOrderDto.getEoOrderPrecontainerModelList();
		eoOrderContainerModels = eoOrderDto.getEoOrderContainerModelList();
		EoFreightImportModel eoFreightimportModel = eoOrderDto.getEoFreightimportModel();
		/**************************************************************
		 * Tep2 构造订单基本信息并校验是否符合保存条件，如果符合则保存，如果不符合则返回错误信息**
		 * ************************************************************/
		responseData = this.createEoorAndEoeaModel(eoOrderDto, user, afterSaveEoOrderDto);
		if (Constants.NO.equals(responseData.getCode())) {
			return responseData;
		}
		/*************************-----订单基本信息保存结束-----****************************/
		
		//如果订单基本信息保存成功，则继续保存订单相关信息
		//获取订单id用来保存订单相关信息
		Long eoorId = responseData.getData().getEoOrderModel().getEoorId();
		//保存订单实装箱信息：eoOrderContainerModelList
		if (EmptyUtils.isNotEmpty(eoOrderContainerModels)) {
			for (int i = 0; i < eoOrderContainerModels.size(); i++) {
				eoOrderContainerModels.get(i).setEoocEoorId(eoorId);
			}
			ResponseData<List<EoOrderContainerModel>> eoocResponse = this.eoOrderService.saveOrderContainer(eoOrderContainerModels);
			afterSaveEoOrderDto.setEoOrderContainerModelList(eoocResponse.getData());
			if (Constants.NO.equals(eoocResponse.getCode())) {
				responseData = this.assembleMSGWhenFalse("1", eoOrderDto, eoocResponse.getMsg(), afterSaveEoOrderDto);
				return responseData;
			}
		}
		//保存订单预配箱信息：
		if (EmptyUtils.isNotEmpty(eoOrderPrecontainerModels)) {
			for (int i = 0; i < eoOrderPrecontainerModels.size(); i++) {
				eoOrderPrecontainerModels.get(i).setEosrEoorId(eoorId);
			}
			ResponseData<List<EoOrderPrecontainerModel>> eosrResponse = this.eoOrderService.saveOrderPrecontainer(eoOrderPrecontainerModels);
			afterSaveEoOrderDto.setEoOrderPrecontainerModelList(eosrResponse.getData());
			if (Constants.NO.equals(eosrResponse.getCode())) {
				responseData = this.assembleMSGWhenFalse("2", eoOrderDto, eosrResponse.getMsg(), afterSaveEoOrderDto);
				return responseData;
			}
		}
		//保存订单物料信息：
		if (EmptyUtils.isNotEmpty(eoOrderMaterielModels)) {
			for (int i = 0; i < eoOrderMaterielModels.size(); i++) {
				eoOrderMaterielModels.get(i).setEoomEoorId(eoorId);
			}
			ResponseData<List<EoOrderMaterielModel>> eoomResponse = this.eoOrderService.saveOrderMateriel(eoOrderMaterielModels);
			afterSaveEoOrderDto.setEoOrderMaterielModelList(eoomResponse.getData());
			if (Constants.NO.equals(eoomResponse.getCode())) {
				responseData = this.assembleMSGWhenFalse("3", eoOrderDto, eoomResponse.getMsg(), afterSaveEoOrderDto);
				return responseData;
			}
		}
		if (null != eoFreightimportModel) {
			eoFreightimportModel.setEofiEscoId(responseData.getData().getEoOrderModel().getEoorEscoId());
			eoFreightimportModel.setEofiEoorId(eoorId);
			eoFreightimportModel.setEofiEbpjId(responseData.getData().getEoOrderModel().getEoorEbpjId());
			eoFreightimportModel.setEofiLoEbppId(responseData.getData().getEoOrderModel().getEoorLoEbppId());
			eoFreightimportModel.setEofiEscoId(responseData.getData().getEoOrderModel().getEoorEscoId());
			eoFreightimportModel.setEofiSoNo(responseData.getData().getEoOrderModel().getEoorSoNo());
			eoFreightimportModel.setEofiDoNo(responseData.getData().getEoOrderModel().getEoorDoNo());
			eoFreightimportModel.setEofiBulkBillNo(responseData.getData().getEoOrderExpandAgencyModel().getEoeaBulkBillNo());
			eoFreightimportModel.setEofiHblNo(responseData.getData().getEoOrderExpandAgencyModel().getEoeaHblNo());
			eoFreightimportModel.setEofiType(Constants.EO_FREIGHT_TYPE);
			eoFreightimportModel = eoFreightimportManager.save(eoFreightimportModel);
			afterSaveEoOrderDto.setEoFreightimportModel(eoFreightimportModel);
			responseData.setData(afterSaveEoOrderDto);
		}
		return responseData;
	}
	
	/**
	 * 组装订单以及订单代理拓展表数据
	 * @author Shoven.Jiang  
	 * @date 2019年2月22日
	 * @param eoOrderDto 订单基本信息数据源
	 * @param userDetails 从session中取得用户信息
	 * @param afterSaveEoOrderDto 用来储存保存之后的最新数据
	 * @return
	 */
	@Override
	public ResponseData<EoOrderDto> createEoorAndEoeaModel(EoOrderDto eoOrderDto, UserDetails userDetails, EoOrderDto afterSaveEoOrderDto) {
		ResponseData<EoOrderDto> responseData = new ResponseData<EoOrderDto>();
		EoOrderModel eoOrderModel = new EoOrderModel();
		EoOrderExpandAgencyModel eoOrderExpandAgencyModel = new EoOrderExpandAgencyModel();
		eoOrderModel = eoOrderDto.getEoOrderModel();
		eoOrderExpandAgencyModel = eoOrderDto.getEoOrderExpandAgencyModel();
		Long eoorId = null;
		if (null != eoOrderModel && null != eoOrderExpandAgencyModel) {
			EoOrderModel afterSaveEoOrderModel = new EoOrderModel();//保存之后的订单表对象
			//1.订单扩展表字段去空格
			eoOrderExpandAgencyModel.setEoeaBulkBillNo(StringUtils.removeSpace(eoOrderExpandAgencyModel.getEoeaBulkBillNo()));
	        eoOrderExpandAgencyModel.setEoeaVesselName(StringUtils.removeSpace(eoOrderExpandAgencyModel.getEoeaVesselName()));
	        eoOrderExpandAgencyModel.setEoeaVoyage(StringUtils.removeSpace(eoOrderExpandAgencyModel.getEoeaVoyage()));
	        
	        String msg = this.checkEoeaBulkBillNo(eoOrderExpandAgencyModel);
			if (EmptyUtils.isNotEmpty(msg)) {
				responseData.setCode(Constants.NO);
	        	responseData.setMsg(msg);
	        	responseData.setData(eoOrderDto);//订单保存失败，所以将入参返回出去
                return responseData;
			}
			
	        //2.订单信息重构
	        EoOrderModel afterCopyModel = new EoOrderModel();
	        BlukInsertUtils.copyPropertiesNonNull(afterCopyModel, eoOrderModel);
	        eoOrderModel = this.buildEoOrderEntity(afterCopyModel, userDetails, eoOrderExpandAgencyModel);
	        if (eoOrderModel == null) { // 如果返回的为空，则表示校验不通过
	        	responseData.setCode(Constants.NO);
	        	responseData.setMsg(Constants.OMS_ORDER_SODO_CANNOT_REPEAT);
                return responseData;
            }
	        if (EmptyUtils.isNotEmpty(eoOrderExpandAgencyModel.getEoeaBulkBillNo())) {
	            responseData = checkEoeaInfo(eoOrderExpandAgencyModel, responseData);
	            if (responseData.getCode() == Constants.NO) {
	                return responseData;
	            }
	        }
	        afterSaveEoOrderModel = this.save(eoOrderModel);
	        //执行订单再次组装，并同步基础数据
	        if (null != afterSaveEoOrderModel) {
	        	responseData = this.structureEoorAndEoeaModel(afterSaveEoOrderModel, eoOrderExpandAgencyModel, afterSaveEoOrderDto);
	        	if (Constants.NO.equals(responseData.getCode())) {//如果订单保存过程中出错则将初始数据返回，并返回错误信息
	        		responseData.setData(eoOrderDto);
	        		return responseData;
	        	}
	        } else {
				responseData.setMsg("订单基本信息保存失败，请重试");
				responseData.setCode(Constants.NO);
				responseData.setData(afterSaveEoOrderDto);
				return responseData;
			}
		}
		
		return responseData;
	}
	
	/**
	 * 再次组建订单表以及订单代理拓展表
	 * @author Shoven.Jiang  
	 * @date 2019年2月22日
	 * @param afterSaveEoOrderModel 保存之后的model
	 * @param eoOrderExpandAgencyModel 数据源中的订单代理表数据
	 * @param afterSaveEoOrderDto 用来储存保存之后的数据信息
	 * @return
	 */
	private ResponseData<EoOrderDto> structureEoorAndEoeaModel(EoOrderModel afterSaveEoOrderModel, EoOrderExpandAgencyModel eoOrderExpandAgencyModel, EoOrderDto afterSaveEoOrderDto) {
		ResponseData<EoOrderDto> responseData = new ResponseData<EoOrderDto>();
		EoOrderExpandAgencyModel afterSaveEoOrderExpandAgencyModel = new EoOrderExpandAgencyModel();
		Long eoorId = null;
		String errm = "";
		if (null != afterSaveEoOrderModel) {
			eoorId = afterSaveEoOrderModel.getEoorId();
			afterSaveEoOrderModel.setEoorSubstr1(eoorId.toString());
			Long eoorLoEbppId = afterSaveEoOrderModel.getEoorLoEbppId();
			if (afterSaveEoOrderModel.getEoorId() != null) {
				eoOrderExpandAgencyModel.setEoeaEoorId(afterSaveEoOrderModel.getEoorId());
			}
			//货物流向[代理类型，I :进口，E  出口，L 内贸]
			eoOrderExpandAgencyModel.setEoeaAgencyType( EmptyUtils.isEmpty(eoOrderExpandAgencyModel.getEoeaAgencyType()) ? Constants.SYS_EXPORTE : eoOrderExpandAgencyModel.getEoeaAgencyType());
			afterSaveEoOrderExpandAgencyModel = this.eoOrderExpandAgencyManager.save(eoOrderExpandAgencyModel);
			if (null != afterSaveEoOrderExpandAgencyModel) {
				Long eoeaId = afterSaveEoOrderExpandAgencyModel.getEoeaId();
				afterSaveEoOrderModel.setEoorSubstr2(eoeaId.toString());
				afterSaveEoOrderModel = this.save(afterSaveEoOrderModel);
			} else {
				responseData.setMsg("订单基本信息保存失败，请重试");
				responseData.setCode(Constants.NO);
				responseData.setData(afterSaveEoOrderDto);
				return responseData;
			}
			/*************************************
			 * *** 订单保存之后执行数据同步方法，如果数据同步   **
			 * *** 过程中出错，则返回错误信息，但是订单保存成功**
			 *************************************/
			errm = this.exuteProcedureAndEoFreightOmport(afterSaveEoOrderModel, afterSaveEoOrderExpandAgencyModel);
			if (EmptyUtils.isNotEmpty(errm)) {
				responseData.setMsg("订单基本信息保存成功\n" + errm);
			}
			//订单基本信息保存成功之后将保存之后的数据 存入afterSaveEoOrderDto中
			afterSaveEoOrderDto.setEoOrderModel(afterSaveEoOrderModel);
			afterSaveEoOrderDto.setEoOrderExpandAgencyModel(afterSaveEoOrderExpandAgencyModel);
			responseData.setMsg("订单基本信息保存成功");
			responseData.setCode(Constants.YES);
			responseData.setData(afterSaveEoOrderDto);
			return responseData;
		} else {
			responseData.setMsg("订单基本信息保存失败，请重试");
			responseData.setCode(Constants.NO);
			responseData.setData(afterSaveEoOrderDto);
			return responseData;
		}
	}
	
	/**
	 * 订单基本信息保存完成之后同步数据
	 * @author Shoven.Jiang  
	 * @date 2019年2月22日
	 * @param afterSaveEoOrderModel 保存之后的订单表信息
	 * @param afterSaveEoOrderExpandAgencyModel 保存之后的订单代理拓展表信息
	 * @return  errm  订单基本信息保存之后同步数据时的错误信息
	 */
	private String exuteProcedureAndEoFreightOmport(EoOrderModel afterSaveEoOrderModel, EoOrderExpandAgencyModel afterSaveEoOrderExpandAgencyModel) {
		String errm = "";//用来储存错误信息
		Long eoorLoEbppId = afterSaveEoOrderModel.getEoorLoEbppId();
		Long eoorId = afterSaveEoOrderModel.getEoorId();
		if (null != eoorLoEbppId && null != eoorId) {
			errm = this.procedureManager.invokeAfterSaveOrderEvent(eoorLoEbppId, eoorId);
		}
		//订单基本信息保存完成之后保存出口业务表信息
		/*************************---保存进口/出口订单业务表----********************************/
		if (EmptyUtils.isNotEmpty(afterSaveEoOrderExpandAgencyModel.getEoeaAgencyType()) && Constants.SYS_IMPORT.equals(afterSaveEoOrderExpandAgencyModel.getEoeaAgencyType())) {
			this.saveOrUpdateEoFreightImport(afterSaveEoOrderModel, afterSaveEoOrderExpandAgencyModel);
		} else {
			saveOrUpdateEoFreightOmport(afterSaveEoOrderModel, afterSaveEoOrderExpandAgencyModel);
		}
		return errm;
	}
	
	/**
	 * 订单保存之后保存订单相关信息，如果出错，则调用此方法返回数据
	 * @author Shoven.Jiang  
	 * @date 2019年2月22日
	 * @param type【保存的列表类型】 1:订单实装箱信息 2：预配箱信息 3：订单物料信息
	 * 			因为订单相关信息保存牵扯到界面的回显问题存在，
	 * @author Shoven.Jiang  
	 * @date 2019年2月25日
	 * @param eoOrderDto  保存之前的实体dto
	 * @param errm  列表保存的时候出的错误信息
	 * @param afterSaveEoOrderDto 保存之后的实体DTO
	 * @return
	 */
	private ResponseData<EoOrderDto> assembleMSGWhenFalse(String type, EoOrderDto eoOrderDto, String errm, EoOrderDto afterSaveEoOrderDto) {
		ResponseData<EoOrderDto> responseData = new ResponseData<>();
		if (EmptyUtils.isNotEmpty(type) && "1".equals(type)) {
			afterSaveEoOrderDto.setEoOrderContainerModelList(eoOrderDto.getEoOrderContainerModelList());
			afterSaveEoOrderDto.setEoOrderMaterielModelList(eoOrderDto.getEoOrderMaterielModelList());
			afterSaveEoOrderDto.setEoOrderPrecontainerModelList(eoOrderDto.getEoOrderPrecontainerModelList());
		} else if (EmptyUtils.isNotEmpty(type) && "2".equals(type)) {
			afterSaveEoOrderDto.setEoOrderMaterielModelList(eoOrderDto.getEoOrderMaterielModelList());
			afterSaveEoOrderDto.setEoOrderPrecontainerModelList(eoOrderDto.getEoOrderPrecontainerModelList());
		} else if (EmptyUtils.isNotEmpty(type) && "3".equals(type)) {
			afterSaveEoOrderDto.setEoOrderMaterielModelList(eoOrderDto.getEoOrderMaterielModelList());
		}
		responseData.setCode(Constants.NO);
		responseData.setMsg(errm);
		responseData.setData(afterSaveEoOrderDto);
		return responseData;
	}
	
	/**
	 * 订单保存的时候同步保存出口业务表信息
	 * @author Shoven.Jiang  
	 * @date 2018年10月30日
	 * @param eoOrderModel
	 * @param eoOrderExpandAgencyModel
	 */
	private void saveOrUpdateEoFreightImport(EoOrderModel eoOrderModel, EoOrderExpandAgencyModel eoOrderExpandAgencyModel) {
		EoFreightImportModel eoFreightimportModel = new EoFreightImportModel();
		Long eoorId = eoOrderModel.getEoorId();
		if (null != eoorId) {
			List<FilterCondition> eofiCondition = new ArrayList<>();
			eofiCondition.add(new FilterCondition("eofiEoorId", eoorId, "="));
			eofiCondition.add(new FilterCondition("eofiType", "EOOR", "="));
			List<EoFreightImportModel> eoFreightImportModels = this.eoFreightimportManager.findByCondition(eofiCondition);
			if (EmptyUtils.isNotEmpty(eoFreightImportModels)) {
				eoFreightimportModel = eoFreightImportModels.get(0);
			} else {
				eoFreightimportModel.setEofiEscoId(eoOrderModel.getEoorEscoId());
				eoFreightimportModel.setEofiEoorId(eoorId);
				eoFreightimportModel.setEofiEbpjId(eoOrderModel.getEoorEbpjId());
				eoFreightimportModel.setEofiLoEbppId(eoOrderModel.getEoorLoEbppId());
				eoFreightimportModel.setEofiEscoId(eoOrderModel.getEoorEscoId());
				eoFreightimportModel.setEofiSoNo(eoOrderModel.getEoorSoNo());
				eoFreightimportModel.setEofiDoNo(eoOrderModel.getEoorDoNo());
				eoFreightimportModel.setEofiBulkBillNo(eoOrderExpandAgencyModel.getEoeaBulkBillNo());
				eoFreightimportModel.setEofiHblNo(eoOrderExpandAgencyModel.getEoeaHblNo());
				eoFreightimportModel.setEofiType("EOOR");
			}
			this.eoFreightimportManager.save(eoFreightimportModel);
		}
	}

	@Override
	public QueryData getEoImportOrderMaterielAndEoeiByEoocId(Long eoocId) {
		List<QueryField> queryFieldList = new ArrayList<>();
		//组装数据
		QueryField queryField = new QueryField();
		queryField.setFieldName("CDT_eoocId");
		queryField.setOperator("=");
		queryField.setFieldValue(eoocId);
		queryFieldList.add(queryField);
		
		QueryInfo queryInfo = new QueryInfo();
		queryInfo.setQueryFields(queryFieldList);
		queryInfo.setQueryType("com.sinotrans.oms.eoorder.mapper.EoImportOrderMaterielAndEoeiListQuery");
		
		return commonQueryManager.query(queryInfo);
	}
	
	/**
	 * @deprecated:校验提运单号唯一
	 * @author Colley.Bai  
	 * @date 2019年3月14日
	 * @param eoOrderExpandAgencyModel
	 * @return
	 */
	public String checkEoeaBulkBillNo(EoOrderExpandAgencyModel eoOrderExpandAgencyModel){
		String msg = "";
		if (EmptyUtils.isNotEmpty(eoOrderExpandAgencyModel.getEoeaBulkBillNo())) {
        	List<FilterCondition> eoaeFilterCondition = new ArrayList<>();
        	eoaeFilterCondition.add(new FilterCondition("eoeaBulkBillNo", eoOrderExpandAgencyModel.getEoeaBulkBillNo() , "="));
        	eoaeFilterCondition.add(new FilterCondition("eoeaAgencyType", eoOrderExpandAgencyModel.getEoeaAgencyType() , "="));
        	List<EoOrderExpandAgencyModel> eoOrderExpandAgencyModelList = eoOrderExpandAgencyManager.findByCondition(eoaeFilterCondition);
        	if (EmptyUtils.isNotEmpty(eoOrderExpandAgencyModelList)) {
        		for (EoOrderExpandAgencyModel afterEoOrderExpandAgencyModel : eoOrderExpandAgencyModelList) {
        			if (null == afterEoOrderExpandAgencyModel.getEoeaId() || "".equals(afterEoOrderExpandAgencyModel.getEoeaId())) {//验证是否为新增
						if (EmptyUtils.isNotEmpty(eoOrderExpandAgencyModelList)) {
							msg = "提单号不能重复";
						}
					} else if (EmptyUtils.isEqual(afterEoOrderExpandAgencyModel.getEoeaId(), eoOrderExpandAgencyModel.getEoeaId())) {
						//判断是否为修改的报关信息，如果是修改信息，查出来的信息和传进来的信息主键一直则提运单号不用校验
						msg = "";
					} else {
						msg = "提单号不能重复";
					}
        		}
        	}
        }
		return msg;
	}

	@Override
	public ResponseData<QueryData> queryOrderAllFeeByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<>();
		queryInfo.setQueryType("com.sinotrans.oms.fees.mapper.EoOrderAllFeeQuery");
		QueryData queryData = commonQueryManager.query(queryInfo);
		responseData.setData(queryData);
		return responseData;
	}

}
