/**
 * <p>Description: 
 *    
 * </p>
 *
 * @author James
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本     修改人   	修改日期   	修改内容
 * 2018年8月9日   创建人    20091201 	创建
 * 
 * 
 * </pre>
 */
package com.sinotrans.oms.common.manager.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.orm.support.StoredProcedure;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoRequestBookingManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestDeclarationDeputeManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestTrailerManager;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.businessrequest.model.EoRequestDeclarationDeputeModel;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.businessrule.manager.EsControlParamManager;
import com.sinotrans.oms.businessrule.model.EbBusinessUnitModel;
import com.sinotrans.oms.businessrule.model.EsControlParamModel;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.manager.EbProcedureManager;
import com.sinotrans.oms.common.manager.ProcedureManager;
import com.sinotrans.oms.common.model.EbProcedureModel;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.customerproject.dto.GetBmsOrderEventsQueryDto;
import com.sinotrans.oms.customerproject.dto.ProjectParamsQueryDto;
import com.sinotrans.oms.customerproject.manager.EbPlanEventManager;
import com.sinotrans.oms.customerproject.manager.EbPlanTaskManager;
import com.sinotrans.oms.customerproject.manager.EbProjectPlanManager;
import com.sinotrans.oms.customerproject.model.EbPlanEventModel;
import com.sinotrans.oms.customerproject.model.EbPlanMilestoneModel;
import com.sinotrans.oms.customerproject.model.EbPlanTaskModel;
import com.sinotrans.oms.customerproject.model.EbProjectPlanModel;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.security.util.SessionContext;

/**
 * <p>Description: 调用存储过程工具类
 *    
 * </p>
 *
 * @author James
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本     修改人   	修改日期   	修改内容
 * 2018年8月9日     James       	               创建
 * 
 * 
 * </pre>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class ProcedureManagerImpl extends MybatisManagerImpl implements ProcedureManager {

	/**
	 * 出口拖车接口
	 * 20130122
	 */
	@Autowired
	private EoRequestTrailerManager eoRequestTrailerManager;
	/**
	 * 报关接口
	 */
	@Autowired
	private EoRequestDeclarationDeputeManager eoRequestDeclarationDeputeManager;
	
	/**
	 * 作业步骤
	 */
	@Autowired
	private EbPlanTaskManager ebPlanTaskManager;
	@Autowired//依靠作业类别的作业任务定义作业“事件”
	private EbPlanEventManager ebPlanEventManager;
	
	//TODO
	
	@Autowired
	private EoRequestBookingManager eoRequestBookingManager;
	@Autowired
	private EbProcedureManager ebProcedureManager;//执行逻辑定义
	@Autowired
	private EsControlParamManager esControlParamManager;
	@Autowired
	private EbProjectPlanManager ebProjectPlanManager;
	/**
	 * 单例
	 */
	private static ProcedureManagerImpl bp;
	
	/**
	 * 执行计划<Long执行计划ID,EbProjectPlanModel项目执行计划>
	 */
	private static Map<Long, EbProjectPlanModel> plans;
	
	/**
	 * 作业步骤<Long执行计划ID,EbProjectPlanModel作业步骤>
	 */
	private static Map<Long, List<EbPlanTaskModel>> tasks;

	/**
	 * 业务执行逻辑代码<Long业务单元ID,EbProjectPlanModel业务单元信息>
	 */
	private static Map<Long, EbBusinessUnitModel> ebbus;
	
	/**
	 * 项目参数<Long项目ID,String参数值>
	 */
	private static Map<Long,String> params;
	
	/**
	 * 项目参数<Long项目ID,String参数值>
	 */
	private static Map<Long,EbPlanMilestoneModel> ebms;
	
	/**
	 * 执行阶段——委托导入
	 */
	public static final String CC = "CC";
	/**
	 * 执行阶段——订单执行
	 */
	public static final String LO = "LO";
	/**
	 * 执行阶段——请求下达
	 */
	public static final String BR = "BR";
	
	/**
	 * 陆运请求类型
	 */
	public static final String IS_TMS_REQ = "3";
	
	/**
	 * 入/出库请求下达调用的EDI接口的URL 
	 */
	private String ediUrl;
	
	/**
	 * 创建里程碑存储过程
	 */
	private static final String SP_GENERATION_MILESTONE = "pkg_order_milestone.sp_Generation_milestone";
	
	/**
	 * 创建里程碑存储过程入参
	 */
	private static final String ARG_ORDER_ID = "arg_order_id";
	
	@Override
	public String requestIssued(Long brId, Long ebtkId) {
		if(null!=brId && null!=ebtkId){
			 EbPlanTaskModel ebPlanTaskModel=ebPlanTaskManager.get(ebtkId);
			 if(null!=ebPlanTaskModel){
				 String brType=ebPlanTaskModel.getEbtkType();
					//通过请求主键和请求类型获取请求数据
					  if(Constants.TASK_TYPE_EXPORT_TRAILER.equals(brType) || Constants.TASK_TYPE_IMPORT_TRAILER.equals(brType)){//进出口拖车
						  EoRequestTrailerModel eoRequestTrailerModel=  eoRequestTrailerManager.get(brId);
						  if(null!=eoRequestTrailerModel && null!=eoRequestTrailerModel.getEoetEbtkId()){
								String planName=ebPlanTaskModel.getEbtkBrEbpdCode();
								Map<String,Object> map=callStoreProcedureBR(planName,brId);
								String errm=(String)map.get(Constants.ERRM);
								return errm;
						  }
					}else if(Constants.TASK_TYPE_DELEGATE_DECLARATION.equals(brType)){//委托报关
						EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel=  eoRequestDeclarationDeputeManager.get(brId);
						  if(null!=eoRequestDeclarationDeputeModel && null!=eoRequestDeclarationDeputeModel.getEoddEbtkId()){
								String planName=ebPlanTaskModel.getEbtkBrEbpdCode();
								Map<String,Object> map=callStoreProcedureBR1(planName,brId);
								String errm=(String)map.get(Constants.ERRM);
								return errm;
						  }	
					}else if(Constants.TASK_TYPE_BOOKING.equals(brType)){//订舱
						  EoRequestBookingModel eoRequestBookingModel = this.eoRequestBookingManager.get(brId);
						if (null != eoRequestBookingModel && null != eoRequestBookingModel.getEorbEbtkId()) {
								
							  	String planName = ebPlanTaskModel.getEbtkBrEbpdCode();
								Map<String,Object> map = callStoreProcedureBR1(planName,brId);
								String errm = (String)map.get(Constants.ERRM);
								return errm;
						  }
					}
			 }
		}
		return null;
	}
	/**
	 * BR下达时调用存储过程
	 * @param planName 存储过程名
	 * @param brid 请求ID
	 */
	private Map<String,Object> callStoreProcedureBR1(String planName,Long brid){
		StoredProcedure sp = (StoredProcedure) this.myBatisDao.storedProcedure(planName);
		sp.addInOutParameter(Constants.BRID, brid.toString());//入参赋值
		sp.addParameter(Constants.USER_ID, SessionContext.getUser().getUserId());
		sp.addOutStringParameter(Constants.EDDID);//出参，接口表ID
		sp.addOutStringParameter(Constants.ERRM);//出参，提示信息
		Map<String,Object> result=sp.execute();// 调用存储过程
		return result;
	}
	
	/**
	 * BR下达时调用存储过程
	 * @param planName 存储过程名
	 * @param brid 请求ID
	 */
	private Map<String,Object> callStoreProcedureBR(String planName,Long brid){
		StoredProcedure sp = (StoredProcedure) this.myBatisDao.storedProcedure(planName);
		sp.addInOutParameter(Constants.BRID, brid.toString());//入参赋值
		sp.addOutStringParameter(Constants.EDDID);//出参，接口表ID
		sp.addOutStringParameter(Constants.ERRM);//出参，提示信息
		Map<String,Object> result=sp.execute();// 调用存储过程
		return result;
	}
	
	@Override
	public Map<String, Object> invokeEoOrderFreightSave(EoOrderModel eoOrderModel , String excuteString) {
		StoredProcedure sp = (StoredProcedure) this.myBatisDao.storedProcedure(excuteString);
		sp.addParameter(Constants.LOID, eoOrderModel.getEoorSubstr1());// 订单id
		if(eoOrderModel.getEoorSubstr2()!=null){//请求id
			sp.addParameter("brid",eoOrderModel.getEoorSubstr2());// 海运请求id
		}
		if(eoOrderModel.getEoorSubstr3()!=null){
			sp.addParameter("editType", eoOrderModel.getEoorSubstr3());// 编辑类型 ADD新增 EDIT编辑
		}
		if(eoOrderModel.getEoorSubstr4()!=null){
			sp.addParameter("judgeType", eoOrderModel.getEoorSubstr4());//是否有拖车和报关请求 , 00都没有 , 11都有
		}
		if(eoOrderModel.getEoorSubstr5()!=null){
			sp.addParameter("params", eoOrderModel.getEoorSubstr5());//拖车和报关参数 , 以及需要删除的预配箱id
		}
		sp.addOutStringParameter(Constants.ERRM);
		Map<String, Object> map = new HashMap<String, Object>();
		try {
			 map = sp.execute();// 调用存储过程
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
			map.put("errm", e.getMessage());
			
		}
		return map;
	}
	@Override
	public Map<String, Object> storedProcedure(EoOrderModel eoOrderModel, String excuteString) {
		StoredProcedure sp = (StoredProcedure) this.myBatisDao.storedProcedure(excuteString);
		sp.addParameter("brid",eoOrderModel.getEoorSubstr1());
        sp.addOutStringParameter(Constants.ERRM);
        Map<String, Object> errResult = sp.execute();
		return errResult;
	}
	@Override
	public String invokeAfterSaveOrderEvent(Long ebppId, Long eoorId) {
		String errm = "";
		
		List<FilterCondition> conditions = new ArrayList<>();
		conditions.add(new FilterCondition("ebevEbppId",ebppId,"="));
		List<EbPlanEventModel> events = this.ebPlanEventManager.findByCondition(conditions );
		Set<String> ebpdCodes = new HashSet<String>();//去掉重复
		for(EbPlanEventModel event : events){
			String ebpdCode = event.getEbevEvtEbpdCode();
			if(!ebpdCodes.contains(ebpdCode) && ebpdCode != null && event.getEbevEbtkId()==null){
				// 调用事件触发执行逻辑中定义的存储过程
				errm += callEventStoreProcedure(ebpdCode,null,eoorId);
				ebpdCodes.add(ebpdCode);
			}
			if("null".equals(errm.toString().trim()))errm="";
		}
		return errm;
	}
	/**
	 * 
	 * @DATE 2018年9月5日 下午4:46:51
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:调用事件存储过程
	 * @param planName
	 * @param type
	 * @param brid
	 * @return
	 */
	@Override
	public String callEventStoreProcedure(String planName,String type,Long brid) {
		String errm = "";
		Map<String,Object> result = new HashMap<String, Object>();//存储过程返回值
		// 调用存储过程
		StoredProcedure sp = (StoredProcedure) this.myBatisDao.storedProcedure(planName);
		// 如果是执行订单到BR 的存储过程，则带入参数
		sp.addParameter(Constants.BRID, brid);
		//add by daniel 20140422 添加一个类型参数
		sp.addParameter(Constants.EVET_TYPE, type);
		sp.addOutStringParameter(Constants.ERRM);
		try {
			result = (Map<String,Object>)sp.execute();
			errm = (String)result.get(Constants.ERRM);
		} catch (Exception e) {
			e.printStackTrace();
			errm = planName + "存储过程执行有误";
		}
		log.info("==========执行的存储过程:"+planName +" =====返回结果："+errm);
		return errm;
	}
	
	@Override
	public String acmpTimeExec(EbProjectPlanModel ebProjectPlanModel, Long eoorId) {
		String errmsg = "";//用来收集错误信息
		if (null != ebProjectPlanModel) {
			Long ebppCtEBpdId = ebProjectPlanModel.getEbppCtEbpdId();// 委托导入业务执行逻辑ID
			EbProcedureModel ebProcedureModel = ebProcedureManager.get(ebppCtEBpdId);// 得到项目业务执行逻辑对象
			if(null!=ebProcedureModel){
				if (null != eoorId) {
					StoredProcedure sp = (StoredProcedure) this.myBatisDao.storedProcedure(ebProcedureModel.getEbpdCode());
					sp.addParameter(Constants.LOID, eoorId.toString());// 入参赋值
					sp.addOutStringParameter(Constants.ERRM);
					Map<String, Object> resultMsg = sp.execute();// 调用存储过程
					if (EmptyUtils.isNotEmpty(resultMsg)) {
						errmsg = (String) resultMsg.get(Constants.ERRM);
						if (EmptyUtils.isNotEmpty(errmsg)) {// 调用成功
							return errmsg;
						}
					}
				}
			}else{
				errmsg = "业务完成时间逻辑配置错误，请检查";
				return errmsg;
			}
		}
		return errmsg;
	}
	
	@Override
	public ResponseData ebppBbdEbpdCodeExecNew(EbProjectPlanModel ebProjectPlanModel, Long efbmId, String flag) {
		ResponseData responseData = new ResponseData();
		if (null != ebProjectPlanModel) {
			Long ebppBbdEBpdId = ebProjectPlanModel.getEbppBbdEbpdId();// 业务票据数据_业务执行逻辑
			EbProcedureModel ebProcedureModel = this.ebProcedureManager.get(ebppBbdEBpdId);// 得到项目业务执行逻辑对象
			if (null != ebProcedureModel) {
				if (null != efbmId) {
					StoredProcedure sp = (StoredProcedure) this.myBatisDao.storedProcedure(ebProcedureModel.getEbpdCode());
					sp.addParameter("efbmid", efbmId.toString());// 入参赋值
					sp.addOutStringParameter("eiimid");// 订单接口主数据ID
					sp.addOutStringParameter(Constants.ERRM);	// 错误提示信息
					Map<String, Object> resultMsg = new HashMap<String, Object>();
					resultMsg = sp.execute();// 调用存储过程
					if (EmptyUtils.isNotEmpty(resultMsg)) {
						Long eiimId = Long.parseLong(resultMsg.get("eiimid").toString());
						String errmsg  = (String)resultMsg.get(Constants.ERRM);
						if (-1 != eiimId && null == errmsg) {// 调用成功
							responseData.setCode(Constants.YES);;
							responseData.setData(eiimId);
							return responseData;
						} else {
							responseData.setCode(Constants.NO);
							responseData.setMsg(errmsg);
							return responseData;
						}
					}
				}
			} else {
				responseData.setCode(Constants.NO);
				responseData.setMsg("业务票据取值配置错误，请检查");
				return responseData;
			}
		}
		responseData.setCode(Constants.YES);
		return responseData;
	}
	
	@Override
	public String acceptOrder(EbProjectPlanModel ebProjectPlanModel, EoOrderModel eoOrderModel) {
		String errm="";//执行反馈 error message
		if (null != ebProjectPlanModel) {
			Long ebppLoEBpdId = ebProjectPlanModel.getEbppLoEbpdId();//订单执行业务执行逻辑ID
			EbProcedureModel ebProcedureModel = ebProcedureManager.get(ebppLoEBpdId);//得到项目业务执行逻辑对象
//			String bp = this.getProjectBpByPlanId(ebProjectPlanModel, eoOrderModel);//通过项目执行计划ID获取项目对应的控制参数BP的值
			String bp = "Y";
			Long eoorId = eoOrderModel.getEoorId();
			if (null != eoorId) {
				StoredProcedure sp = (StoredProcedure) this.myBatisDao.storedProcedure(ebProcedureModel.getEbpdCode());
				sp.addParameter(Constants.LOID, eoorId.toString());//入参赋值
				sp.addOutStringParameter(Constants.ERRM);
				Map<String,Object> resultMsg=sp.execute();// 调用存储过程
				if(EmptyUtils.isNotEmpty(resultMsg)) {
					String errmsg = (String)resultMsg.get(Constants.ERRM);
					if(null == errmsg){//调用成功
						if(Constants.YES.equals(bp)) {//项目控制参数为全程执行
							// 根据项目执行计划ID，获取作业步骤信息
							List<EbPlanTaskModel> tasks = getPlanTaskByPlanId(ebProjectPlanModel.getEbppId());
							try {
								errm = taskIssued(tasks,eoorId,ebProjectPlanModel);//处理作业步骤中的请求下达
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					}
				}
				
			}
		}
		return errm;
	}
	
	/**
	 * 根据项目执行计划的ID 查询作业步骤信息
	 * @author Shoven.Jiang  
	 * @date 2018年10月13日
	 * @param planId 项目执行计划id
	 * @return
	 */
	private List<EbPlanTaskModel> getPlanTaskByPlanId(Long planId){
		List<EbPlanTaskModel> ebPlanTaskModels = new ArrayList<>();
		if (null != tasks) {
			ebPlanTaskModels = tasks.get(planId);
		}
		if(null == ebPlanTaskModels){
			List<FilterCondition> ebpkCondition = new ArrayList<>();
			ebpkCondition.add(new FilterCondition("ebtkEbppId", planId, "="));
			ebPlanTaskModels = this.ebPlanTaskManager.findByCondition(ebpkCondition);
			
			if(null != ebPlanTaskModels){
				tasks.put(planId, ebPlanTaskModels);
			}
		}
		return ebPlanTaskModels;
	}
	
	/**
	 * 处理作业步骤中请求下达为自动的请求
	 * @param tasks 作业步骤集合
	 * @param errm 提示信息
	 * @return
	 * @throws Exception 
	 */
	private String taskIssued(List<EbPlanTaskModel> tasks,Long eoorId,EbProjectPlanModel ebProjectPlanModel) throws Exception{
		String errm="";//执行反馈 error message
		if(EmptyUtils.isNotEmpty(tasks)){
			for (EbPlanTaskModel ebPlanTaskModel : tasks) {
				//作业步骤为自动
				if(Constants.AUTO.equals(ebPlanTaskModel.getEbtkBrAutomatic())){
					String type=ebPlanTaskModel.getEbtkType();//作业步骤任务类型
					Long ebtkId=ebPlanTaskModel.getEbtkId();//作业步骤ID
					if(Constants.TASK_TYPE_EXPORT_TRAILER.equals(type) || Constants.TASK_TYPE_IMPORT_TRAILER.equals(type)){//进出口拖车
						List<FilterCondition> eoetCondition = new ArrayList<>();
						eoetCondition.add(new FilterCondition("eoetEoorId", eoorId, "="));
						eoetCondition.add(new FilterCondition("eoetEbtkId", ebtkId, "="));
						List<EoRequestTrailerModel> requestExporttrailerModelList = this.eoRequestTrailerManager.findByCondition(eoetCondition);
						if(EmptyUtils.isNotEmpty(requestExporttrailerModelList)){
							EoRequestTrailerModel requestExporttrailerModel=requestExporttrailerModelList.get(0);
							errm+=requestIssued(ebProjectPlanModel,ebPlanTaskModel,requestExporttrailerModel);
						}
					}else if(Constants.TASK_TYPE_DELEGATE_DECLARATION.equals(type)){//委托报关
						
						List<FilterCondition> eoddCondition = new ArrayList<>();
						eoddCondition.add(new FilterCondition("eoddEoorId", eoorId, "="));
						eoddCondition.add(new FilterCondition("eoddEbtkId", ebtkId, "="));
						List<EoRequestDeclarationDeputeModel> delegateDeclarationModelList = this.eoRequestDeclarationDeputeManager.findByCondition(eoddCondition);
						if(EmptyUtils.isNotEmpty(delegateDeclarationModelList)){
							EoRequestDeclarationDeputeModel delegateDeclarationModel=delegateDeclarationModelList.get(0);
							errm+=requestIssued(ebProjectPlanModel,ebPlanTaskModel,delegateDeclarationModel);
						}
					}
				}
			}
		}
		return errm;
	}
	
	/**
	 * 请求下达，用于处理调用存储过程
	 * @author Shoven.Jiang  
	 * @date 2018年10月13日
	 * @param ebProjectPlanModel  项目执行计划id
	 * @param ebPlanTaskModel 作业步骤id
	 * @param brObject 请对象
	 * @return
	 * @throws Exception
	 */
	public String requestIssued(EbProjectPlanModel ebProjectPlanModel,EbPlanTaskModel ebPlanTaskModel,Object brObject) throws Exception {
		String errm = "";//执行反馈 error message
		if(null != ebProjectPlanModel && null != ebPlanTaskModel) {
			Long ebtkBrEbpdId = ebPlanTaskModel.getEbtkBrEbpdId();//作业步骤业务执行逻辑ID
			EbProcedureModel ebProcedureModel = ebProcedureManager.get(ebtkBrEbpdId);//得到项目业务执行逻辑对象
			String bp = getProjectBpByPlanId(ebProjectPlanModel.getEbppId());//通过项目执行计划ID获取项目对应的控制参数BP的值
			String planName = ebProcedureModel.getEbpdCode();//存储过程名称
			String isAuto = ebPlanTaskModel.getEbtkBrAutomatic();//作业步骤是否自动
			if(EmptyUtils.isNotEmpty(planName)) {
				String type = ebPlanTaskModel.getEbtkType();//作业步骤任务类型
				if(Constants.TASK_TYPE_EXPORT_TRAILER.equals(type) || Constants.TASK_TYPE_IMPORT_TRAILER.equals(type)) {//进出口拖车
					EoRequestTrailerModel eoRequestExporttrailerModel = (EoRequestTrailerModel)brObject;
					Long eoetId = eoRequestExporttrailerModel.getEoetId();
					Map<String,Object> map = callStoreProcedureBR(planName,eoetId);
					String webserviceName = Constants.REQUEST_EXPORTTRAILER_WEBSERVICE_NAME;
					//业务单元唤醒
//					errm = businessUnitWake(map,ebPlanTaskModel,webserviceName,bp,isAuto);
					
				} else if (Constants.TASK_TYPE_DELEGATE_DECLARATION.equals(type)) {//委托报关
					EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel = (EoRequestDeclarationDeputeModel)brObject;
					Long eoddId = eoRequestDeclarationDeputeModel.getEoddId();
					String usid = eoRequestDeclarationDeputeModel.getEoddEbbuDist1();
					Map<String,Object> map = callStoreProcedureBR(planName,eoddId,usid);
					String webserviceName = Constants.REQUEST_DECLARATION_DEPUTE_WEBSERVICE_NAME;
					//业务单元唤醒
//					errm = businessUnitWake(map,ebPlanTaskModel,webserviceName,bp,isAuto);
				} else if (Constants.TASK_TYPE_BOOKING.equals(type)) {//进口订舱 add by wesley 20151120
					EoRequestBookingModel eorbModel = (EoRequestBookingModel)brObject;
					Map<String,Object> map = new HashMap<String, Object>();
					Long eorbId = eorbModel.getEorbId();
					String ieFlag = eorbModel.getEorbIeFlag();
					String usid = eorbModel.getEorbEbbuDist3();
					map = callStoreProcedureBR(planName,eorbId,usid);
					String webserviceName = null;
					//业务单元唤醒
//					errm = businessUnitWake(map,ebPlanTaskModel,webserviceName,bp,isAuto);
				}
			}
		}
		return errm;
	}
	
	/**
	 * 根据项目执行计划ID，查找项目对应的BP控制参数的值
	 * @param planId
	 * @return
	 */
	private String getProjectBpByPlanId(Long planId){
		// 根据项目执行计划ID，获取项目执行计划信息
		EbProjectPlanModel plan = getProjectPlanById(planId);
		Long projectId=null;
		if(null != plan){
			projectId = plan.getEbppEbpjId();
		}
		// 根据项目ID，获取项目参数Code为“BP”的项目参数信息
		String projectParam = getControlParamByPjId(projectId);
		if(EmptyUtils.isEmpty(projectParam)){
			projectParam = Constants.NO;
		}
		return projectParam;
	}
	
	/**
	 * 根据项目执行计划的ID 查询项目执行计划
	 * @param planId
	 */
	private EbProjectPlanModel getProjectPlanById(Long planId){
		EbProjectPlanModel plan = new EbProjectPlanModel();
		if (null != plans) {
			plan = plans.get(planId);
		}
		if(null == plan){
			plan = this.ebProjectPlanManager.get(planId);
			if(null != plan){
				plans.put(planId, plan);
			}
		}
		return plan;
	}
	
	/**
	 * 根据项目ID，查询系统控制参数信息
	 * @param projectId
	 * @return
	 */
	private String getControlParamByPjId(Long projectId){
		String paramValue = "";
		if (null != params) {
			paramValue = params.get(projectId);
		}
		if(EmptyUtils.isEmpty(paramValue)){
			Map<String, Object> condition = new HashMap<>();
			condition.put("projectId", projectId);
			condition.put("BP", "BP");
			List<ProjectParamsQueryDto> paramItems = this.getProjectParamsQueryDtoByCondition(condition);
			// 如果该项目有设置该参数值
			if(EmptyUtils.isNotEmpty(paramItems)){
				paramValue = paramItems.get(0).getEscpValue();
				params.put(projectId, paramValue); // 项目参数
			}else{
			// 如果该项目没有设置该参数值，则取系统默认的参数值
				// 先去Map中取，如果没有，则重新查询
				paramValue = params.get(Long.valueOf("-1"));
				if(EmptyUtils.isEmpty(paramValue)){
					// 重新去“系统控制参数表”中查询
					List<FilterCondition> escpCondition = new ArrayList<>();
					escpCondition.add(new FilterCondition("escpCode", "BP", "="));// 项目参数Code为“BP”
					escpCondition.add(new FilterCondition("escpParentId", Long.valueOf("-1"), "="));// 总公司维护时为“-1”
					escpCondition.add(new FilterCondition("escpRange", Constants.SYS_SCOPE_PROJECT, "="));//作用范围为项目的
					List<EsControlParamModel> esControlParamModels = this.esControlParamManager.findByCondition(escpCondition);
					if(EmptyUtils.isNotEmpty(esControlParamModels)){
						paramValue = esControlParamModels.get(0).getEscpValue();
						params.put(Long.valueOf("-1"), paramValue); // 总公司的参数即默认参数
					}
				}
			}
		}
		return paramValue;
	}
	
	/**
	 * BR下达时调用存储过程
	 * @author Shoven.Jiang  
	 * @date 2018年10月13日
	 * @param planName 存储过程名
	 * @param brid 请求ID
	 * @param usid 登录用户ID
	 * @return result
	 */
	private Map<String,Object> callStoreProcedureBR(String planName,Long brid,String usid) {
		StoredProcedure sp = (StoredProcedure) this.myBatisDao.storedProcedure(planName);
		sp.addParameter(Constants.BRID, brid.toString());//入参赋值USER_ID
		sp.addParameter(Constants.USER_ID, usid);
		sp.addOutIntParameter(Constants.EDDID);//出参，接口表ID
		sp.addOutStringParameter(Constants.ERRM);//出参，提示信息
		Map<String,Object> result=sp.execute();// 调用存储过程
		return result;
	}
	
	/**
	 * 获取项目参数
	 * @author Shoven.Jiang  
	 * @date 2018年10月13日
	 * @param condition
	 * @return
	 */
	private List<ProjectParamsQueryDto> getProjectParamsQueryDtoByCondition(Map<String, Object> condition) {
		List<Map<String, Object>> queryList = this.myBatisDao.queryByCondition("ProjectParamsQuery", condition, null, null, null);
		List<ProjectParamsQueryDto> paramsQueryDtos = new ArrayList<>();
		for (@SuppressWarnings("rawtypes") Map map : queryList) {
			paramsQueryDtos.add((ProjectParamsQueryDto) BlukInsertUtils.parseMapToObject(map, new ProjectParamsQueryDto()));
		}
		return paramsQueryDtos;
	}
	
	/**
	 * 获取项目执行计划中的事件定义
	 * @author Shoven.Jiang  
	 * @date 2018年10月13日
	 * @param condition
	 * @return
	 */
	private List<GetBmsOrderEventsQueryDto> getGetBmsOrderEventsQueryDtoByCondition(Map<String, Object> condition) {
		List<Map<String, Object>> queryList = this.myBatisDao.queryByCondition("GetBmsOrderEventsQuery", condition, null, null, null);
		List<GetBmsOrderEventsQueryDto> getBmsOrderEventsQueryDtos = new ArrayList<>();
		for (@SuppressWarnings("rawtypes") Map map : queryList) {
			getBmsOrderEventsQueryDtos.add((GetBmsOrderEventsQueryDto) BlukInsertUtils.parseMapToObject(map, new GetBmsOrderEventsQueryDto()));
		}
		return getBmsOrderEventsQueryDtos;
	}
	
	@Override
	public ResponseData execEvents(EbProjectPlanModel ebProjectPlanModel,Date date,Long eoorId) {
		ResponseData responseData = new ResponseData();
		if (null != ebProjectPlanModel) {
			Map<String, Object> conditions = new HashMap<>();
			Long ebppId = ebProjectPlanModel.getEbppId();// 委托导入业务执行逻辑ID
			conditions.put("ebppId", ebppId);
			List<GetBmsOrderEventsQueryDto> itemsList = this.getGetBmsOrderEventsQueryDtoByCondition(conditions);
			if(EmptyUtils.isNotEmpty(itemsList)){
				for (GetBmsOrderEventsQueryDto getBmsOrderEventsQueryDto : itemsList) {
					EbProcedureModel  ebProcedureModel=this.ebProcedureManager.get(getBmsOrderEventsQueryDto.getEbevEvtEbpdId());
					StoredProcedure sp = (StoredProcedure) this.myBatisDao.storedProcedure(ebProcedureModel.getEbpdCode());
					sp.addParameter(Constants.LOID, eoorId.toString());// 入参赋值
					sp.addParameter(Constants.ACCEPT_DATE, date);
					sp.addOutStringParameter(Constants.ERRM);
					Map<String, Object> resultMsg = sp.execute();// 调用存储过程
					if (EmptyUtils.isNotEmpty(resultMsg)) {
						String errmsg = (String) resultMsg.get(Constants.ERRM);
						if (null == errmsg) {// 调用成功
							responseData.setCode(Constants.YES);
						} else {
							responseData.setCode(Constants.NO);
							responseData.setMsg(errmsg);
						}
					}
				}
			}
		}
		return responseData;
	}
	
	@Override
	public String invokeAfterSaveBrEvent(Long ebtkid, String type, Long brid) {
		String errm = "";
		String errorMsg ="";
		//获取 作业事件定义
		if(ebtkid != null){
			List<FilterCondition> ebevCondition = new ArrayList<>();
			ebevCondition.add(new FilterCondition("ebevEbtkId", ebtkid, "="));
			List<EbPlanEventModel> events = this.ebPlanEventManager.findByCondition(ebevCondition);
			Set<String> ebpdCodes = new HashSet<String>();//去掉重复
			for(EbPlanEventModel event : events){
				String ebpdCode = event.getEbevEvtEbpdCode();
				if(!ebpdCodes.contains(ebpdCode) && ebpdCode != null){
					// 调用事件触发执行逻辑中定义的存储过程
					errm = callEventStoreProcedure(ebpdCode,type,brid);
					if(errm!=null&&!"".equals(errm)){
						errorMsg=errorMsg+errm;
					}
					ebpdCodes.add(ebpdCode);
				}
			}
		}
		return errorMsg;
	}
	
	@Override
	public ResponseData buildToStatePool(Long eoorId) {
		ResponseData<EoOrderDto> responseData = new ResponseData<>();
		if (null != eoorId) {
			StoredProcedure sp = (StoredProcedure) this.myBatisDao.storedProcedure(Constants.PROCEDURE_STATE_POOL);
			sp.addParameter(Constants.LOID, eoorId);// 入参赋值
			sp.addOutStringParameter(Constants.ERRM);
			Map<String, Object> resultMsg = sp.execute();// 调用存储过程
			if (EmptyUtils.isNotEmpty(resultMsg)) {
				String errmsg = (String) resultMsg.get(Constants.ERRM);
				if (null == errmsg) {// 调用成功
					responseData.setCode(Constants.YES);
				} else {
					responseData.setCode(Constants.NO);
					responseData.setMsg("订单下发状态池异常：" + errmsg);
				}
			}
		}
		return responseData;
	}
	
	@Override
	public String invokeEoOrderFreightSave(EoOrderExpandAgencyModel eoOrderExpandAgencyModel, String excuteString) {
		String errmsg = "";//调用订单保存同步基本信息
		if (null != eoOrderExpandAgencyModel) {
			Long eoorId = eoOrderExpandAgencyModel.getEoeaEoorId();
			Long eoeaId = eoOrderExpandAgencyModel.getEoeaId();
			StoredProcedure sp = (StoredProcedure) this.myBatisDao.storedProcedure(excuteString);
			sp.addParameter(Constants.LOID, eoorId);// 订单id
			sp.addParameter("brid", eoeaId);// 订单代理拓展表Id
			sp.addOutStringParameter(Constants.ERRM);
			Map<String, Object> resultMsg = sp.execute();// 调用存储过程
			if (EmptyUtils.isNotEmpty(resultMsg)) {
				errmsg = (String) resultMsg.get(Constants.ERRM);
				return errmsg;
			}
		}
		return errmsg;
	}
	
	@Override
	public String eoorderToDposByExecuteCode(String brid, String excuteCode) {
		String errmsg = "";//订单状态池下发错误信息
		if (EmptyUtils.isNotEmpty(brid) && EmptyUtils.isNotEmpty(excuteCode)) {
			StoredProcedure sp = (StoredProcedure) this.myBatisDao.storedProcedure(excuteCode);
			sp.addParameter("brid", brid);// 订单 Id
			sp.addOutStringParameter(Constants.ERRM);
			Map<String, Object> resultMsg = sp.execute();// 调用存储过程
			if (EmptyUtils.isNotEmpty(resultMsg)) {
				errmsg = (String) resultMsg.get(Constants.ERRM);
				return errmsg;
			}
		}
		return errmsg;
	}
	
}
