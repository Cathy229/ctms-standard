package com.sinotrans.oms.fees.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.gson.Gson;
import com.sinotrans.framework.core.aop.BaseAspect;
import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.businessrule.manager.EsControlParamManager;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.aop.IgnoreLoginController;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.manager.ProcedureManager;
import com.sinotrans.oms.common.util.BeanUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.common.util.NumberUtil;
import com.sinotrans.oms.customerproject.manager.EbProjectPlanManager;
import com.sinotrans.oms.customerproject.model.EbProjectPlanModel;
import com.sinotrans.oms.customerproject.service.EbProjectService;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.fees.dto.EfBmsImModelDto;
import com.sinotrans.oms.fees.dto.SettmentCodeRequestParamDto;
import com.sinotrans.oms.fees.dto.SettmentCodeRequestQueryDto;
import com.sinotrans.oms.fees.dto.UpToBmsCheckQueryDto;
import com.sinotrans.oms.fees.manager.EfBmsImManager;
import com.sinotrans.oms.fees.manager.EfBusinessFeesManager;
import com.sinotrans.oms.fees.manager.EfBusinessFeesSettlementManager;
import com.sinotrans.oms.fees.model.EfBmsImModel;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;
import com.sinotrans.oms.fees.model.EiExpensesModel;
import com.sinotrans.oms.fees.service.EfBusinessFeesContractLogisticSettlementService;
import com.sinotrans.oms.fees.service.efBusinessFeesSettlementService;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.system.manager.EsCompanyManager;
import com.sinotrans.oms.system.manager.EsDepartmentManager;
import com.sinotrans.oms.system.manager.EsUserManager;
import com.sinotrans.oms.system.model.EsCompanyModel;
import com.sinotrans.oms.system.model.EsDepartmentModel;
import com.sinotrans.oms.system.model.EsUserModel;
import com.sinotrans.oms.webservice.service.SendToEAIServices;

/**  
* <p>Title: efBusinessFeesSettlementManagerImpl</p>  
* <p>Description:费用上传bms通用逻辑 </p>  
* @author Shoven.Jiang  
* @date 2018年9月10日  
* @version 1.0  
*/
@Service
public class efBusinessFeesSettlementServiceImpl extends BaseAspect implements efBusinessFeesSettlementService{

	/**
	 * 时间格式
	 */
	private static DateFormat dateFormat = new SimpleDateFormat(Constants.DATA_FORMAT);
	@Autowired
	private EfBusinessFeesSettlementManager efBusinessFeesSettlementManager;//费用上传通用
	@Autowired
	private EfBusinessFeesManager efBusinessFeesManager;//费用
	@Autowired
	private EbProjectService ebProjectService;//项目
	@Autowired
	private EfBusinessFeesContractLogisticSettlementService efBusinessFeesContractLogisticSettlementService;//合同物流费用上传
	@Autowired
	private EoOrderManager eoOrderManager;//订单
	@Autowired
	private EsCompanyManager esCompanyManager;//公司
	@Autowired
	private EsControlParamManager esControlParamManager;//控制参数
	@Autowired
	private EbProjectPlanManager ebProjectPlanManager;//项目执行计划
	@Autowired
	private ProcedureManager procedureManager;
	@Autowired
	private EfBmsImManager efBmsImManager;
	@Autowired
	private SendToEAIServices sendToEAIservices;
	@Autowired
	private EsDepartmentManager esDepartmentManager;
	@Autowired
	private EsUserManager esUserManager;
	@Override
	public String getEfbmAttribute001ByEbPortContry(Long eoorId, String eoeaAgencyType) {
		String efbmAttribute001 = "";//流向
		String countPort = "";
		Map<String, Object> condition = new HashMap<String, Object>();
		if (EmptyUtils.isNotEmpty(eoeaAgencyType) && Constants.SYS_EXPORTE.equals(eoeaAgencyType)) {
			condition.put("eoeaEoorId", eoorId);
			efbmAttribute001 = this.efBusinessFeesSettlementManager.getWaterwayDischargePortTempleteByCondition(condition);
			if (EmptyUtils.isNotEmpty(countPort)) {
				if (Constants.PORT_COUNT_WAY_ONE.equals(countPort)) {
					efbmAttribute001 = "DOM";
				}
			}
		} else if (EmptyUtils.isNotEmpty(eoeaAgencyType) && Constants.SYS_IMPORT.equals(eoeaAgencyType)) {
			efbmAttribute001 = this.efBusinessFeesSettlementManager.getWaterWayLoadingPort(condition);
			if (Constants.PORT_COUNT_WAY_ONE.equals(countPort)) {
				efbmAttribute001 = "DOM";
			}
		}
		return efbmAttribute001;
	}
	
	@Override
	public ResponseData upLoadBms(EfBmsImModel bmsImModel, Long eoorId, String businessType) {
		ResponseData responseData = new ResponseData();
		if (EmptyUtils.isEmpty(businessType)) {
			businessType = this.ebProjectService.getBusinessTypeByEoorId(eoorId);
		}
		return null;
	}

	@Override
	public EfBmsImModelDto generateEntity(Long eoorId, String businessType) {
		EfBmsImModelDto ebfBmsImModelDto = null;
		switch (Integer.parseInt(businessType)) {
		case 14://合同物流
			ebfBmsImModelDto = this.efBusinessFeesContractLogisticSettlementService.getContractLogisticTemplete(eoorId, businessType);
			break;
		default:
			break;
		}
		return ebfBmsImModelDto;
	}
	
	@Override
	public ResponseData upLoadToBms(EfBmsImModelDto efBmsImModelDto) {
		String errm = "";//收集错误的校验信息
		Long eoorId = efBmsImModelDto.getEfbmImId();
		ResponseData responseData = new ResponseData();
		//STEP1:结算上传校验信息
		String businessType = efBmsImModelDto.getEfbmbusinessType();//获取业务类型
		if (EmptyUtils.isEmpty(businessType)) {
			businessType = this.eoOrderManager.get(eoorId).getEoorBusinessType();
		}
		errm = this.upLoadBmsBeforeCheck(efBmsImModelDto, eoorId, businessType);
		if (EmptyUtils.isNotEmpty(errm)) {
			responseData.setCode(Constants.NO);
			responseData.setMsg(errm);
			return responseData;
		}
		//STEP2：订单结算上传，填充费用行结算上传字段的时间
		this.updateEfbfBmsUploadTime(eoorId);
		switch (Integer.parseInt(businessType)) {
		case 14:
			responseData = this.efBusinessFeesContractLogisticSettlementService
					.upLoadBmsByContractLogisticTemplete(efBmsImModelDto, eoorId, businessType);
			break;
		default:
			break;
		}
		return responseData;
	}
	
	/**
	 * 结算上传确认之后校验
	 * @author Shoven.Jiang  
	 * @date 2018年9月13日
	 * @return
	 */
	private String upLoadBmsBeforeCheck(EfBmsImModelDto efBmsImModelDto, Long eoorId, String businessType) {
		String errm = "";//收集错误的校验信息
		if (EmptyUtils.isEmpty(businessType)) {
			errm = "业务类型为空,订单不允许上传bms，请检查!";
		}
		if (null == eoorId) {
			errm = "该订单未保存，请保存之后在操作!";
		}
		return errm;
	}
	
	/**
	 * 费用表添加结算上传时间字段，结算上传时赋值结算时间
	 * @author Shoven.Jiang  
	 * @date 2018年9月13日
	 * @param eoorId
	 */
	private void updateEfbfBmsUploadTime(Long eoorId) {
		EfBusinessFeesModel efBusinessFeesModel = new EfBusinessFeesModel();
		List<FilterCondition> efbfConditions = new ArrayList<>();
		efbfConditions.add(new FilterCondition("EfbfEoorId", eoorId, "="));
		List<EfBusinessFeesModel> efBusinessFeesModels = this.efBusinessFeesManager.findByCondition(efbfConditions);
		if (EmptyUtils.isNotEmpty(efBusinessFeesModels)) {
			for(int i = 0;i< efBusinessFeesModels.size();i++){
				efBusinessFeesModel = efBusinessFeesModels.get(i);
				Long efbfStatus = efBusinessFeesModel.getEfbfStatus();
				if (efbfStatus != null){
					// 费用态为确认或接收失败都更新结算时间
					if (Constants.EFBF_STATUS_1.equals(efbfStatus) || Constants.EFBF_STATUS_E3.equals(efbfStatus)){
						efBusinessFeesModel.setEfbfBmsUploadTime(new Date());
					}
					// 费用状态结接收成功且第一次上传，则赋值结算时间
					if (efBusinessFeesModel.getEfbfBmsUploadTime() == null && Constants.EFBF_STATUS_3.equals(efbfStatus)){
						efBusinessFeesModel.setEfbfBmsUploadTime(new Date());
					}
				}
				this.efBusinessFeesManager.save(efBusinessFeesModel);
			}
		}
	}
	
	/**
	 * 根据业务类型来判断结算上传的分支
	 * @author Shoven.Jiang  
	 * @date 2018年9月13日
	 * @return
	 */
//	private ResponseData upLoadToBmsByBusinessType(EfBmsImModelDto efBmsImModelDto, String businessType) {
//		ResponseData responseData = new ResponseData();
//		switch (Integer.parseInt(businessType)) {
//		case 14://合同物流结算上传
//			responseData = this.efBusinessFeesContractLogisticSettlementService.upLoadBmsByContractLogisticTemplete(efBmsImModelDto, businessType);
//			break;
//		default:
//			break;
//		}
//		return responseData;
//	}

	@Override
	public ResponseData getOrderBmsAcceptTime(EfBmsImModelDto efBmsImModelDto) {
		ResponseData responseData = new ResponseData();
		String msg = "";//收集错误信息
		Long eoorId = efBmsImModelDto.getEfbmImId();
		EoOrderModel eoOrderModel = this.eoOrderManager.get(eoorId);
		eoOrderModel.setEoorBmsAcmpTime(new Date());
		Long efbmEscoId = efBmsImModelDto.getEfbmEscoId();
		this.eoOrderManager.save(eoOrderModel);
		String orderBmsAcmpTime = "";
		String escoCompanyNo = "";
		if (efbmEscoId != null) {
			EsCompanyModel esCompanyModel = new EsCompanyModel();
			esCompanyModel = this.esCompanyManager.get(efbmEscoId);
			if (null != esCompanyModel) {
				escoCompanyNo = esCompanyModel.getEscoCompanyNo();
				if (EmptyUtils.isNotEmpty(escoCompanyNo)) {
					orderBmsAcmpTime = this.esControlParamManager.getIsCompanyValue("ORDER_BMS_ACMP_TIME", escoCompanyNo);
				} else {
					orderBmsAcmpTime = this.esControlParamManager.getIsCompanyValue("ORDER_BMS_ACMP_TIME");
				}
			}
		}
		if (null != eoOrderModel.getEoorLoEbppId()) {
			EbProjectPlanModel ebProjectPlanModel = this.ebProjectPlanManager.get(eoOrderModel.getEoorLoEbppId());
			if (null != ebProjectPlanModel.getEbppCtEbpdId()) {
				if (null == eoOrderModel.getEoorBmsAcmpTime() || Constants.YES.equals(orderBmsAcmpTime)) {
					msg = this.procedureManager.acmpTimeExec(ebProjectPlanModel, eoorId);
					if (EmptyUtils.isNotEmpty(msg)) {
						responseData.setCode(Constants.NO);
						responseData.setMsg(msg);
						return responseData;
					}
				}
			}
		}
		responseData.setCode(Constants.YES);
		return responseData;
	}

	@Override
	public void synchronizeEfbmsImModelType(EfBmsImModel source, Long eoorId, String upLoaded, Long [] efbfIds) {
		//Step1:用订单id查询单票操作表是否存在记录
		EfBmsImModel efBmsImModel = new EfBmsImModel();
		List<FilterCondition> efbmConditions = new ArrayList<>();
		efbmConditions.add(new FilterCondition("efbmImId", eoorId, "="));
		List<EfBmsImModel> efBmsImModels = this.efBmsImManager.findByCondition(efbmConditions);
		if (EmptyUtils.isNotEmpty(efBmsImModels)) {
			efBmsImModel = efBmsImModels.get(0);
		}
		//增加93字段判断赋值
		if (EmptyUtils.isEmpty(source.getEfbmAttribute093())){
			source.setEfbmAttribute093("Y".equals(upLoaded)?"Y":"N");
		}
		//Step2：如果是新增的单票操作表
		if (EmptyUtils.isEmpty(efBmsImModels) && source.getEfbmBmsSourceId().indexOf("-") == -1) {
			//Step2.1  判断生成免税或非免税单票操作表
			boolean dutyFlg = false; //免税
			boolean dutyFlgN = false; //非免税
			Map<String, Object> efbfConditions = new HashMap<>();
			efbfConditions.put("efbfEoorId", eoorId);
			//notes：如果是现结上传，upLoaded值为N，去查询免税和非免税的时候需要拼接上具体的费用id进行查询，因为费用的现结上传是针对于选中的费用行进行上传的
			if (Constants.NO.equals(upLoaded)) {
				efbfConditions.put("efbfIds", efbfIds);
			}
			Map<String, Boolean> whetherDuty = this.efBusinessFeesSettlementManager.getEfbfNameCnWhetherDuty(efbfConditions);
			dutyFlg = whetherDuty.get("dutyFlg");
			dutyFlgN = whetherDuty.get("dutyFlgN");
			//Step2.2 生成免税的单票操作表
			if (dutyFlg) {
				this.insertEfBmsImModelDuty(source, dutyFlg, dutyFlgN, eoorId, upLoaded);
			}
			//Step2.3生成非免税的单票操作表
			if (dutyFlgN) {
				this.insertEfBmsImModelDutyN(source, dutyFlg, dutyFlgN, eoorId, upLoaded);
			}
		} else if (null != efBmsImModel.getEfbmBmsStatus() && Constants.EFBM_BMS_STATUS_TWO_STR.equals(efBmsImModel.getEfbmBmsStatus().toString())) {
			//Step3:如果单票存在结算审核记录
			this.updateEfBmsImModelByEfbmBmsStatusEquals2(efBmsImModel, eoorId, upLoaded, efbfIds);
		} else if (
				"-2".equals(String.valueOf(efBmsImModel.getEfbmBmsStatus()))
				|| "9".equals(String.valueOf(efBmsImModel.getEfbmBmsStatus()))
				|| "-1".equals(String.valueOf(efBmsImModel.getEfbmBmsStatus()))
				|| "1".equals(String.valueOf(efBmsImModel.getEfbmBmsStatus()))
				|| "0".equals(String.valueOf(efBmsImModel.getEfbmBmsStatus()))
				|| null == efBmsImModel.getEfbmBmsStatus()) {
			//Step4:根据中间状态更新单票操作表
			//Step4.1:判断费用的免税类型
			boolean dutyFlg = false; //免税
			boolean dutyFlgN = false; //非免税
			Map<String, Object> efbfConditions = new HashMap<>();
			efbfConditions.put("efbfEoorId", eoorId);
			//notes：如果是现结上传，upLoaded值为N，去查询免税和非免税的时候需要拼接上具体的费用id进行查询，因为费用的现结上传是针对于选中的费用行进行上传的
			if (Constants.NO.equals(upLoaded)) {
				efbfConditions.put("efbfIds", efbfIds);
			}
			Map<String, Boolean> whetherDuty = this.efBusinessFeesSettlementManager.getEfbfNameCnWhetherDuty(efbfConditions);
			dutyFlg = whetherDuty.get("dutyFlg");
			dutyFlgN = whetherDuty.get("dutyFlgN");
			//Step4.2 判断是更新还是新增单票操作表
			this.updateEfBmsImModelByEfbmBmsStatusNotEquals2(source, dutyFlg, dutyFlgN, eoorId, upLoaded);
		}
		//Step5:费用上传bms根据upLoaded更新订单表的是否结算上传状态
		if (Constants.YES.equals(upLoaded)) {
			this.updateEoorIsSettlementUpload(upLoaded, eoorId);
		}
		
	}	
	
	/**
	 * 生成免税的单票操作表
	 * @author Shoven.Jiang  
	 * @date 2018年9月14日
	 */
	private void insertEfBmsImModelDuty(EfBmsImModel source, Boolean dutyFlg, Boolean dutyFlgN, Long eoorId, String upLoaded) {
		EfBmsImModel efBmsImModel = new EfBmsImModel();
		BeanUtils.copyProperties(efBmsImModel, source);
		String efbmAttribute97 = "";//是否统计业务量
		efbmAttribute97 = this.getEfbmAttribute97ByFlag(dutyFlg, dutyFlgN);
		if (EmptyUtils.isNotEmpty(efbmAttribute97)) {
			if (efbmAttribute97.equals("Y")) {
				efBmsImModel.setEfbmAttribute097("Y");
			} else if (efbmAttribute97.equals("dutyFlg")) {
				efBmsImModel.setEfbmAttribute097("Y");
			}
		}
		efBmsImModel.setEfbmBmsSourceId(eoorId + "-" + 1);
		efBmsImModel.setEfbmSourceId(eoorId + "-" + 1);
		efBmsImModel.setHdSymbol("1");
		efBmsImModel.setEfbmSubstr2(upLoaded);
		efBmsImModel.setEfbmAttribute093("Y".equals(upLoaded)?"Y":"N");
		efBmsImModel.setEfbmAttribute098(Constants.IS_DUTYFREE_STRING);
		efBmsImModel.setEfbmSubstr1(null);
		efBmsImModel.setEfbmStatus(1L);// 上状态已上传
		efBmsImModel.setEfbmId(null);
		this.efBmsImManager.save(efBmsImModel);
		BeanUtils.copyProperties(source, efBmsImModel);//将对model的最新操作赋值给传进来的source
	}
	
	/**
	 * 生成非免税的单票操作表
	 * @author Shoven.Jiang  
	 * @date 2018年9月14日
	 * @param source
	 * @param dutyFlg
	 * @param dutyFlgN
	 * @param eoorId
	 * @param upLoaded
	 */
	private void insertEfBmsImModelDutyN(EfBmsImModel source, Boolean dutyFlg, Boolean dutyFlgN, Long eoorId, String upLoaded) {
		EfBmsImModel efBmsImModel = new EfBmsImModel();
		BeanUtils.copyProperties(efBmsImModel, source);
		String efbmAttribute97 = "";//是否统计业务量
		efbmAttribute97 = this.getEfbmAttribute97ByFlag(dutyFlg, dutyFlgN);
		if (EmptyUtils.isNotEmpty(efbmAttribute97)) {
			if (efbmAttribute97.equals("Y")) {
				efBmsImModel.setEfbmAttribute097("N");
			} else if (efbmAttribute97.equals("dutyFlgN")) {
				efBmsImModel.setEfbmAttribute097("Y");
			}
		}
		efBmsImModel.setEfbmBmsSourceId(eoorId + "-" + 0);
		efBmsImModel.setEfbmSourceId(eoorId + "-" + 0);
		efBmsImModel.setHdSymbol("1");
		efBmsImModel.setEfbmSubstr2(upLoaded);
		efBmsImModel.setEfbmAttribute093("Y".equals(upLoaded)?"Y":"N");
		efBmsImModel.setEfbmSubstr1(null);
		efBmsImModel.setEfbmAttribute098(Constants.NOT_DUTYFREE_STRING);
		efBmsImModel.setEfbmStatus(1L);// 上状态已上传
		efBmsImModel.setEfbmId(null);
		this.efBmsImManager.save(efBmsImModel);
		BeanUtils.copyProperties(source, efBmsImModel);//将对model的最新操作赋值给传进来的source
	}
	
	/**
	 * 如果单票存在结算审核记录修改单票操作表
	 * @author Shoven.Jiang  
	 * @date 2018年9月14日
	 * @param source
	 * @param dutyFlg
	 * @param dutyFlgN
	 * @param eoorId
	 * @param upLoaded
	 */
	private void updateEfBmsImModelByEfbmBmsStatusEquals2(EfBmsImModel source, Long eoorId, String upLoaded, Long [] efbfIds) {
		EfBmsImModel efBmsImModel = new EfBmsImModel();
		String sourceId = "";
		if (Constants.IS_DUTYFREE_STRING.equals(source.getEfbmAttribute098())) {
			sourceId = eoorId + "-0";
		} else {// 如果是非免税
			sourceId = eoorId + "-1";
		}
		List<FilterCondition> efbmConditions = new ArrayList<>();
		efbmConditions.add(new FilterCondition("efbmImId", eoorId, "="));
		List<EfBmsImModel> efBmsImModels = this.efBmsImManager.findByCondition(efbmConditions);
		if (EmptyUtils.isNotEmpty(efBmsImModels)) {
			//Step1：如果该订单已经存在两条单票操作表记录
			if (efBmsImModels.size() == 2) {
				for (EfBmsImModel updateEfBmsImModel : efBmsImModels) {
					updateEfBmsImModel.setEfbmAttribute093(upLoaded);
					this.efBmsImManager.save(updateEfBmsImModel);
				}
			} else if (efBmsImModels.size() == 1) {
				//Step2.1  判断生成免税或非免税单票操作表
				boolean dutyFlg = false; //免税
				boolean dutyFlgN = false; //非免税
				Map<String, Object> efbfConditions = new HashMap<>();
				efbfConditions.put("efbfEoorId", eoorId);
				//notes：如果是现结上传，upLoaded值为N，去查询免税和非免税的时候需要拼接上具体的费用id进行查询，因为费用的现结上传是针对于选中的费用行进行上传的
				if (Constants.NO.equals(upLoaded)) {
					efbfConditions.put("efbfIds", efbfIds);
				}
				Map<String, Boolean> whetherDuty = this.efBusinessFeesSettlementManager.getEfbfNameCnWhetherDuty(efbfConditions);
				dutyFlg = whetherDuty.get("dutyFlg");
				dutyFlgN = whetherDuty.get("dutyFlgN");
				sourceId = efBmsImModels.get(0).getEfbmBmsSourceId();
				if (sourceId.indexOf("-1") != -1) {//若指定字符串中没有该字符则系统返回-1   该条件判断单票操作表为免税的,需要生成一条非免税的单票操作表
					if (dutyFlgN) {
						this.insertEfBmsImModelDutyN(source, dutyFlg, dutyFlgN, eoorId, upLoaded);
					}
				}
				if (sourceId.indexOf("-0") != -1) {//若指定字符串中没有该字符串则系统返回-1 该条件判断单票操作表为非免税的，需要在生成一条免税的单票操作表
					if (dutyFlg) {
						this.insertEfBmsImModelDuty(source, dutyFlg, dutyFlgN, eoorId, upLoaded);
					}
				}
				
			}
		}
	}
	
	/**
	 * 根据单票操作表的结算审核状态更新该订单的单票操作表记录
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param source
	 * @param dutyFlg
	 * @param dutyFlgN
	 * @param eoorId
	 * @param upLoaded
	 */
	private void updateEfBmsImModelByEfbmBmsStatusNotEquals2(EfBmsImModel source, Boolean dutyFlg, Boolean dutyFlgN, Long eoorId, String upLoaded) {
		//Step1：判断单票操作表是否存在非免税的操作记录
		List<FilterCondition> efbmConditionDutyN = new ArrayList<>();
		efbmConditionDutyN.add(new FilterCondition("efbmBmsSourceId", eoorId + "-0", "="));
		List<EfBmsImModel> efBmsImModelsDutyN = this.efBmsImManager.findByCondition(efbmConditionDutyN);
		if (EmptyUtils.isNotEmpty(efBmsImModelsDutyN)) {
			dutyFlgN = true;
		}
		//Step2:判断单票操作表是否存在免税的操作记录
		List<FilterCondition> efbmConditionDuty = new ArrayList<>();
		efbmConditionDutyN.add(new FilterCondition("efbmBmsSourceId", eoorId + "-1", "="));
		List<EfBmsImModel> efBmsImModelsDuty = this.efBmsImManager.findByCondition(efbmConditionDutyN);
		if (EmptyUtils.isNotEmpty(efBmsImModelsDuty)) {
			dutyFlg = true;
		}
		String flgAttribute097 = "";//免税
		String flgNAttribute097 = "";//非免税
		if(dutyFlg && dutyFlgN){
			if(EmptyUtils.isNotEmpty(efBmsImModelsDutyN) && Constants.YES.equals(efBmsImModelsDutyN.get(0).getEfbmAttribute097())){
				flgAttribute097 = Constants.NO;
				flgNAttribute097 = Constants.YES;
			}else{
				flgAttribute097 = Constants.YES;
				flgNAttribute097 = Constants.NO;
			}
		}else if(dutyFlg && dutyFlgN == false){
			flgAttribute097 = Constants.YES;
		}else if(dutyFlg==false&&dutyFlgN){
			flgNAttribute097 = Constants.YES;
		}
		//Step3:生成或更新免税单票操作表
		if (dutyFlg) {
			this.saveEfBmsImModelByEfbmBmsStatusNotEquals2DutyFlag(source, dutyFlg, dutyFlgN, eoorId, upLoaded, efBmsImModelsDuty, flgAttribute097);
		}
		//Step4:生成或更新非免税的单票操作表
		if (dutyFlgN) {
			this.saveEfBmsImModelByEfbmBmsStatusNotEquals2DutyFlagN(source, dutyFlg, dutyFlgN, eoorId, upLoaded, efBmsImModelsDutyN, flgNAttribute097);
		}
	}
	
	/**
	 * 根据单票操作表的结算审核状态更新该订单的单票操作表免税记录
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param source
	 * @param dutyFlg
	 * @param dutyFlgN
	 * @param eoorId
	 * @param upLoaded
	 * @param efBmsImModelsDuty
	 * @param flgAttribute097
	 */
	private void saveEfBmsImModelByEfbmBmsStatusNotEquals2DutyFlag(EfBmsImModel source, Boolean dutyFlg, Boolean dutyFlgN, Long eoorId, String upLoaded, List<EfBmsImModel> efBmsImModelsDuty, String flgAttribute097) {
		if (dutyFlgN) {
			EfBmsImModel efBmsImModel = new EfBmsImModel();
			if (EmptyUtils.isNotEmpty(efBmsImModelsDuty)) {
				if (EmptyUtils.isEmpty(upLoaded)) {
					BeanUtils.copyProperties(efBmsImModel, efBmsImModelsDuty.get(0));
				} else {
					BeanUtils.copyProperties(efBmsImModel, source);             ///结算上传时，如果状态为9 -2则根据source传入dest1
					efBmsImModel.setEfbmId(efBmsImModelsDuty.get(0).getEfbmId());
					efBmsImModel.setRecVer(efBmsImModelsDuty.get(0).getRecVer());
				}
			} else {
				BeanUtils.copyProperties(efBmsImModel, source);
				efBmsImModel.setEfbmId(null);
				efBmsImModel.setRecVer(null);
				efBmsImModel.setCreator(null);
				efBmsImModel.setCreateTime(null);
				efBmsImModel.setModifier(null);
				efBmsImModel.setModifyTime(null);
				efBmsImModel.setEfbmIsDutyfree(0L);
			}
			efBmsImModel.setEfbmAttribute097(flgAttribute097);
			efBmsImModel.setEfbmBmsSourceId(eoorId + "-" + 1);
			efBmsImModel.setEfbmSourceId(eoorId + "-" + 1);
			efBmsImModel.setHdSymbol("1");
			efBmsImModel.setEfbmSubstr2(upLoaded);
			efBmsImModel.setEfbmAttribute093("Y".equals(upLoaded)?"Y":"N");
			efBmsImModel.setEfbmAttribute098(Constants.IS_DUTYFREE_STRING);
			efBmsImModel.setEfbmSubstr1(null);
			efBmsImModel.setEfbmStatus(Long.valueOf("9"));// 上状态已上传
//			this.setLastConfirmStatus(efBmsImModel,
//					eoorId, null, null);
			this.efBmsImManager.save(efBmsImModel);
		}
	}
	
	/**
	 * 根据单票操作表的结算审核状态更新该订单的单票操作表非免税记录
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param source
	 * @param dutyFlg
	 * @param dutyFlgN
	 * @param eoorId
	 * @param upLoaded
	 * @param efBmsImModelsDuty
	 * @param flgNAttribute097
	 */
	private void saveEfBmsImModelByEfbmBmsStatusNotEquals2DutyFlagN(EfBmsImModel source, Boolean dutyFlg, Boolean dutyFlgN, Long eoorId, String upLoaded, List<EfBmsImModel> efBmsImModelsDutyN, String flgNAttribute097) {
		if(dutyFlgN){
			EfBmsImModel efBmsImModel = new EfBmsImModel();
			if (EmptyUtils.isNotEmpty(efBmsImModelsDutyN)) {
				if (EmptyUtils.isEmpty(upLoaded)) {
					BeanUtils.copyProperties(efBmsImModel, efBmsImModelsDutyN.get(0));
				} else {
					BeanUtils.copyProperties(efBmsImModel, source);
					efBmsImModel.setEfbmId(efBmsImModelsDutyN.get(0).getEfbmId());
					efBmsImModel.setRecVer(efBmsImModelsDutyN.get(0).getRecVer());
				}
			}else{
				BeanUtils.copyProperties(efBmsImModel, source);
				efBmsImModel.setEfbmId(null);
				efBmsImModel.setRecVer(null);
				efBmsImModel.setCreator(null);
				efBmsImModel.setCreateTime(null);
				efBmsImModel.setModifier(null);
				efBmsImModel.setModifyTime(null);
				efBmsImModel.setEfbmIsDutyfree(1l);
			}
			efBmsImModel.setEfbmAttribute097(flgNAttribute097);
			efBmsImModel.setEfbmBmsSourceId(eoorId + "-" + 0);
			efBmsImModel.setEfbmSourceId(eoorId + "-" + 0);
			efBmsImModel.setHdSymbol("1");
			efBmsImModel.setEfbmSubstr2(upLoaded);
			efBmsImModel.setEfbmAttribute093("Y".equals(upLoaded)?"Y":"N");
			efBmsImModel.setEfbmSubstr1(null);
			efBmsImModel.setEfbmAttribute098(Constants.NOT_DUTYFREE_STRING);
			efBmsImModel.setEfbmBmsStatus(Long.valueOf("9"));
//			this.setLastConfirmStatus(efBmsImModel,
//					eoorId, null, null);
			this.efBmsImManager.save(efBmsImModel);
		}
	}
	
	/**
	 * 根据免税和非免税判断备注字段97值
	 * @author Shoven.Jiang  
	 * @date 2018年9月14日
	 * @param dutyFlg
	 * @param dutyFlgN
	 * @return
	 */
	private String getEfbmAttribute97ByFlag(boolean dutyFlg, boolean dutyFlgN) {
		String efbmAttribute97Flag = "";
		if (dutyFlg && dutyFlgN) {
			efbmAttribute97Flag = "Y";
		}
		if (dutyFlg && !dutyFlgN) {
			efbmAttribute97Flag = "dutyFlg";
		}
		if (!dutyFlg && dutyFlgN) {
			efbmAttribute97Flag = "dutyFlgN";
		}
		return efbmAttribute97Flag;
	}
	
	/**
	 * 给订单表更新是否结算上传状态，用以判断结算上传之后不能现结上传操作
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param upLoaded
	 * @param eoorId
	 */
	private void  updateEoorIsSettlementUpload(String upLoaded, Long eoorId) {
		EoOrderModel eoOrderModel = new EoOrderModel();
		List<FilterCondition> eoorCondition = new ArrayList<>();
		eoorCondition.add(new FilterCondition("eoorId", eoorId, "="));
		List<EoOrderModel> eoOrderModels = this.eoOrderManager.findByCondition(eoorCondition);
		if (EmptyUtils.isNotEmpty(eoOrderModels)) {
			eoOrderModel = eoOrderModels.get(0);
			eoOrderModel.setEoorIsSettlementUpload(upLoaded);
			this.eoOrderManager.save(eoOrderModel);
		}
	}

	@Override
	public ResponseData uploadBmsByOrderDimension(EfBmsImModel efBmsImModel, Long eoorId, Long[] efbfIds,
			boolean isLoadEiep, String businessType) {
		ResponseData responseData = new ResponseData();
		EoOrderModel eoOrderModel = this.eoOrderManager.get(eoorId);
		EbProjectPlanModel ebProjectPlanModel = new EbProjectPlanModel();
		if (null != eoOrderModel.getEoorLoEbppId()) {
			ebProjectPlanModel = this.ebProjectPlanManager.get(eoOrderModel.getEoorLoEbppId());
		}
		//step1:上传免税费用
		Long[] dutyFree = this.getEfBusinessFees(eoorId, efbfIds, true);
		if (null != dutyFree && dutyFree.length != 0) {
			responseData = this.upLoadDutyFree(eoorId, businessType);
			if (Constants.NO.equals(responseData.getCode())) {
				return responseData;
			} else {
				EfBmsImModel efBmsImModelDutyFree = new EfBmsImModel();
				efBmsImModelDutyFree = (EfBmsImModel) responseData.getData();
				//Step1.1 费用上传时bms票据代码，版块代码，销售人员代码，bms项目字段取值
				this.getupToBMSCheckByBelongInfoValue(eoorId, efBmsImModelDutyFree, businessType, ebProjectPlanModel);
				//step1.2 上传BMS的实际操作
				this.feesUploadBMSHandler(ebProjectPlanModel, efBmsImModelDutyFree.getEfbmId(), null, eoorId, isLoadEiep, dutyFree, "1", eoOrderModel);
			}
		}
		//step2:上传非免税的费用
		Long[] dutyNotFree = this.getEfBusinessFees(eoorId, efbfIds, false);
		if (null != dutyNotFree && dutyNotFree.length != 0) {
			responseData = this.upLoadDutyNFree(eoorId, businessType);
			if (Constants.NO.equals(responseData.getCode())) {
				return responseData;
			} else {
				EfBmsImModel efBmsImModelDutyNFree = new EfBmsImModel();
				efBmsImModelDutyNFree = (EfBmsImModel) responseData.getData();
				//Step2.1 费用上传时bms票据代码，版块代码，销售人员代码，bms项目字段取值
				this.getupToBMSCheckByBelongInfoValue(eoorId, efBmsImModelDutyNFree, businessType, ebProjectPlanModel);
				//step2.2 上传BMS的实际操作
				this.feesUploadBMSHandler(ebProjectPlanModel, efBmsImModelDutyNFree.getEfbmId(), null, eoorId, isLoadEiep, dutyNotFree, "0", eoOrderModel);
			}
		}
		return responseData;
	}
	
	/**
	 * 判断上传的费用的免税类型
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param eoorId
	 * @param efbfIds
	 * @param isDutyFree
	 * @return
	 */
	private Long[] getEfBusinessFees(Long eoorId, Long[] efbfIds, boolean isDutyFree) {
		Long dutyFree = isDutyFree ? 1L : 0L;
		Map<String, Object> conditions = new HashMap<>();
		conditions.put("efbfEoorId", eoorId);
		conditions.put("efbfIds", efbfIds);
		if (isDutyFree) {
			conditions.put("ebfhIsDutyfree",dutyFree);
		} else {
			conditions.put("ebfhNotDutyfree",dutyFree);
		}
		List<Long> efbfIdList = this.efBusinessFeesSettlementManager.getEfBusinessSettementFeesQueryList(conditions);
		if (EmptyUtils.isNotEmpty(efbfIdList)) {
			return efbfIdList.toArray(new Long[] {});
		}
		return null;
	}
	
	/**
	 * 上传免税费用
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param eoorId
	 * @param businessType
	 * @return
	 */
	private ResponseData upLoadDutyFree(Long eoorId, String businessType) {
		ResponseData responseData = new ResponseData();
		EoOrderModel eoOrderModel = this.eoOrderManager.get(eoorId);
		EfBmsImModel efBmsImModel = new EfBmsImModel();
		EfBmsImModel afterEfbmsImModel = new EfBmsImModel();
		List<FilterCondition> efbmConditions = new ArrayList<>();
		efbmConditions.add(new FilterCondition("efbmBmsSourceId", eoorId + "-1", "="));
		List<EfBmsImModel> efBmsImModels = this.efBmsImManager.findByCondition(efbmConditions);
		if (EmptyUtils.isNotEmpty(efBmsImModels)) {
			efBmsImModel = efBmsImModels.get(0);
		} else {
			responseData.setMsg("未找到对应的操作表请联系管理员!");
			responseData.setCode(Constants.NO);
			return responseData;
		}
		efBmsImModel.setEfbmAttribute099("OMS_" + eoOrderModel.getEoorId().toString());
		efBmsImModel.setEfbmNumber(eoOrderModel.getEoorOrderNo());
		efBmsImModel.setEfbmDpNumber(eoOrderModel.getEoorOrderNo() + "-"+ "1");
		if (null != efBmsImModel.getEfbmBmsStatus() && efBmsImModel.getEfbmBmsStatus() == -2) {
			efBmsImModel.setEfbmBmsStatus(9L);
		}
		afterEfbmsImModel = this.efBmsImManager.save(efBmsImModel);
		responseData.setData(afterEfbmsImModel);
		return responseData;
	}
	
	/**
	 * 上传非免税的费用
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param eoorId
	 * @param businessType
	 * @return
	 */
	private ResponseData<EfBmsImModel> upLoadDutyNFree(Long eoorId, String businessType) {
		ResponseData responseData = new ResponseData();
		EoOrderModel eoOrderModel = this.eoOrderManager.get(eoorId);
		EfBmsImModel efBmsImModel = new EfBmsImModel();
		EfBmsImModel afterEfbmsImModel = new EfBmsImModel();
		List<FilterCondition> efbmConditions = new ArrayList<>();
		efbmConditions.add(new FilterCondition("efbmBmsSourceId", eoorId + "-0", "="));
		List<EfBmsImModel> efBmsImModels = this.efBmsImManager.findByCondition(efbmConditions);
		if (EmptyUtils.isNotEmpty(efBmsImModels)) {
			efBmsImModel = efBmsImModels.get(0);
		} else {
			responseData.setMsg("未找到对应的操作表请联系管理员!");
			responseData.setCode(Constants.NO);
			return responseData;
		}
		efBmsImModel.setEfbmAttribute099("OMS_" + eoOrderModel.getEoorId().toString());
		efBmsImModel.setEfbmNumber(eoOrderModel.getEoorOrderNo());
		efBmsImModel.setEfbmDpNumber(eoOrderModel.getEoorOrderNo() + "-"+ "0");
		if (null != efBmsImModel.getEfbmBmsStatus() && efBmsImModel.getEfbmBmsStatus() == -2) {
			efBmsImModel.setEfbmBmsStatus(9L);
		}
		afterEfbmsImModel = this.efBmsImManager.save(efBmsImModel);
		responseData.setData(afterEfbmsImModel);
		return responseData;
	}
	
	/**
	 * 费用上传时bms票据代码，版块代码，销售人员代码，bms项目字段取值
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param eoorId
	 * @param efBmsImModel
	 * @param businessType
	 * @param ebProjectPlanModel
	 */
	private void getupToBMSCheckByBelongInfoValue(Long eoorId,EfBmsImModel efBmsImModel, String businessType, EbProjectPlanModel ebProjectPlanModel) {
		//费用上传bms bms票据代码，bms项目，销售人员，先从项目执行计划取值，取不到再去项目上取值
		String ebppEbbtCode = ebProjectPlanModel.getEbppBmsEbbtCode();//BMS票据代码
		//BMS票据代码 先从项目执行计划上取值，取不到在从项目上取值
		if (EmptyUtils.isNotEmpty(ebppEbbtCode)) {
			efBmsImModel.setEfbmEbbtCode(ebppEbbtCode);
		}
		Map<String, Object> upToBmsCheckQueryCondition = new HashMap<>();
		upToBmsCheckQueryCondition.put("eoorId", eoorId);
		UpToBmsCheckQueryDto upToBmsCheckQueryDto = this.efBusinessFeesSettlementManager.getUpToBmsCheckQueryDto(upToBmsCheckQueryCondition);
		// 票据类型代码
		if (efBmsImModel.getEfbmEbbtCode() == null
				|| efBmsImModel.getEfbmEbbtCode() == "") {
			if (EmptyUtils.isNotEmpty(upToBmsCheckQueryDto.getEbpjBmsEbbtCode())) {
				efBmsImModel.setEfbmEbbtCode(upToBmsCheckQueryDto.getEbpjBmsEbbtCode());
			} else if ("01".equals(businessType)) {
				efBmsImModel.setEfbmEbbtCode("01_SLHD");
			} else if ("02".equals(businessType)) {
				efBmsImModel.setEfbmEbbtCode("02_HKHD");
			} else if ("03".equals(businessType)) {
				efBmsImModel.setEfbmEbbtCode("03_TLHD");
			} else if ("05".equals(businessType)) {
				efBmsImModel.setEfbmEbbtCode("05_BG");
			} else if ("04".equals(businessType)) {
				efBmsImModel.setEfbmEbbtCode("04_GLYS");
			} else if ("14".equals(businessType)) {
				efBmsImModel.setEfbmEbbtCode("14_HTWL_01");
			}
		}
		// 项目BMS
		if (efBmsImModel.getEfbmProjectCode() == null || efBmsImModel.getEfbmProjectCode() == "") {
			if (EmptyUtils.isEmpty(upToBmsCheckQueryDto.getEoorFCode())) {
				efBmsImModel.setEfbmProjectCode(upToBmsCheckQueryDto.getEbpjFCode());//20180201 处理北京货代上传项目代码为0问题
			} else {
				efBmsImModel.setEfbmProjectCode(upToBmsCheckQueryDto.getEoorFCode());
			}
		}
		// 项目BMS部门代码
		if (efBmsImModel.getEfbmEsdeDepartmentCode() == null || efBmsImModel.getEfbmEsdeDepartmentCode() == "") {
			if (EmptyUtils.isNotEmpty(upToBmsCheckQueryDto.getEsdeBmsDepartmentCode())) {
				efBmsImModel.setEfbmEsdeDepartmentCode(upToBmsCheckQueryDto.getEsdeBmsDepartmentCode());
			}
		}
		// 项目BMS客户代码
		if (efBmsImModel.getEfbmAEbcuCustomerNo() == null || efBmsImModel.getEfbmAEbcuCustomerNo() == "") {
			if (upToBmsCheckQueryDto.getEbpjBmsAEbcuCustomerNo() == null || upToBmsCheckQueryDto.getEbpjBmsAEbcuCustomerNo() == "") {
				efBmsImModel.setEfbmAEbcuCustomerNo(upToBmsCheckQueryDto.getEoorConsignorEbcuCode());
			} else {
				efBmsImModel.setEfbmAEbcuCustomerNo(upToBmsCheckQueryDto.getEbpjBmsAEbcuCustomerNo());
			}
		}
		// 销售人员
		if (efBmsImModel.getEfbmEbsmCode() == null || efBmsImModel.getEfbmEbsmCode() == "") {
			if (upToBmsCheckQueryDto.getEsusIsSalesman() == "Y") {
				efBmsImModel.setEfbmEbsmCode(upToBmsCheckQueryDto.getEsusBmsEbsmCode());
			} else {
				efBmsImModel.setEfbmEbsmCode(upToBmsCheckQueryDto.getEsdeDefaultBmsEbsmCode());
			}
		}
		this.efBmsImManager.save(efBmsImModel);
	}
	
	/**
	 * 上传BMS的实际操作
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param ebProjectPlanModel  项目执行计划model
	 * @param efbmId   单票操作表id
	 * @param flag
	 * @param eoorId
	 * @param isLoadEiep
	 * @param efbfIds
	 * @param isDutyFree
	 * @return
	 */
	private ResponseData feesUploadBMSHandler(EbProjectPlanModel ebProjectPlanModel, Long efbmId, String flag, Long eoorId, boolean isLoadEiep,	Long[] efbfIds, String isDutyFree, EoOrderModel eoOrderModel) {
		ResponseData responseData = new ResponseData();
		Long userId = null;
		Long eiimId = null;//主信息表id
		UserDetails user = SessionContext.getUser();
		userId = user.getUserId() != null ? Long.parseLong(user.getUserId()) : null;
		responseData = this.procedureManager.ebppBbdEbpdCodeExecNew(ebProjectPlanModel, efbmId, flag);
		if (Constants.YES.equals(responseData.getCode())) {
			eiimId = (Long) responseData.getData();
		} else {
			if (EmptyUtils.isEmpty(responseData.getMsg())) {
				responseData.setMsg("调用存储过程异常");
			}
			return responseData;
		}
		if (-1 != eiimId) { 
			if (isLoadEiep) {
				//订单维度向主信息接口表上挂费用信息（关联费用接口表）
				 responseData = this.hangFeeByOrderDimension(eiimId, eoorId, efbfIds, isDutyFree, eoOrderModel);
				 if (Constants.NO.equals(responseData.getCode())) {
					 return responseData;
				 }
				 try {
		            List<Object> param = new LinkedList<Object>();
		            param.add(eiimId);
		            param.add(userId);
					sendToEAIservices.commonInvokeWebservice(Constants.WEBSERVICES_REDIRECT, "settlementSendFeesBMSToEAI", param.toArray(new Object[param.size()]));
					eoOrderModel.setEoorIsAugment(0L);
					this.eoOrderManager.save(eoOrderModel);
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					responseData.setCode(Constants.NO);
					responseData.setMsg(e.getMessage());
					return responseData;
				}
			}
		}
		responseData.setCode(Constants.YES);
		return responseData;
	}
	
	/**
	 * 订单维度向主信息接口表上挂费用信息（关联费用接口表）
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param eiimId
	 * @param eoorId
	 * @param efbfIds
	 * @param isDutyFree
	 * @param eoOrderModel
	 * @return
	 */
	private ResponseData hangFeeByOrderDimension(Long eiimId, Long eoorId, Long[] efbfIds, String isDutyFree, EoOrderModel eoOrderModel) {
		ResponseData responseData = new ResponseData();
		List<EfBusinessFeesModel> efBusinessFeesModels = new ArrayList<>();
		List<EfBusinessFeesModel> canUpLoadFees = new ArrayList<EfBusinessFeesModel>();
		List<EiExpensesModel> eiepList = new ArrayList<EiExpensesModel>();
		EsCompanyModel esCompanyModel = this.esCompanyManager.get(eoOrderModel.getEoorEscoId());
		if (null == efbfIds || efbfIds.length == 0) {
			List<FilterCondition> efbfCondition = new ArrayList<>();
			efbfCondition.add(new FilterCondition("efbfEoorId", eoorId, "in"));
			efBusinessFeesModels = this.efBusinessFeesManager.findByCondition(efbfCondition);
		} else {
			List<FilterCondition> efbfConditions = new ArrayList<>();
			efbfConditions.add(new FilterCondition("efbfId", efbfIds, "in"));
			efBusinessFeesModels = this.efBusinessFeesManager.findByCondition(efbfConditions);
		}
		if (eoOrderModel.getEoorBmsAcmpTime() == null) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单" + eoorId + "业务时间为空不能上传BMS！");
			return responseData;

		}
		//收集可以上传的符合标准的费用集合
		canUpLoadFees = this.screenCanUpLoadFees(efBusinessFeesModels, eoorId);
		//生成费用接口表
		this.efBusinessFeesSettlementManager.saveCanUpLoadFeesAndEiepFees(canUpLoadFees, eoorId, isDutyFree, eiimId);
		if (EmptyUtils.isEmpty(efBusinessFeesModels)) {
			responseData.setCode(Constants.YES);
			responseData.setMsg("订单" + eoorId + "下未找到任务费用信息！");
			return responseData;
		}
		return responseData;
	}
	
	/**
	 * 收集可以上传的符合标准的费用集合
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param efBusinessFeesModels
	 * @return
	 */
	private List<EfBusinessFeesModel> screenCanUpLoadFees(List<EfBusinessFeesModel> efBusinessFeesModels, Long eoorId) {
		List<EfBusinessFeesModel> canUpLoadFees = new ArrayList<EfBusinessFeesModel>();
		for (EfBusinessFeesModel efBusinessFeesModel : efBusinessFeesModels) {
			if (((Constants.EFBF_STATUS_1.equals(efBusinessFeesModel.getEfbfStatus())
					|| Constants.EFBF_STATUS_E3.equals(efBusinessFeesModel.getEfbfStatus())
					|| Constants.EFBF_STATUS_UPLOADING.equals(efBusinessFeesModel.getEfbfStatus())//增加费用状态为上传中：9 update by shoven
					|| Constants.EFBF_STATUS_E2.equals(efBusinessFeesModel.getEfbfStatus()))
					&& (null == efBusinessFeesModel.getEfbfHdSymbol()
					|| Constants.HD_SYMBOL_0.equals(efBusinessFeesModel.getEfbfHdSymbol()) 
					|| Constants.HD_SYMBOL_9.equals(efBusinessFeesModel.getEfbfHdSymbol())//增加上传中的状态
					|| Constants.HD_SYMBOL_F.equals(efBusinessFeesModel.getEfbfHdSymbol()) 
					|| Constants.HD_SYMBOL_3_F.equals(efBusinessFeesModel.getEfbfHdSymbol())))
					|| Constants.EFBF_STATUS_E4.equals(efBusinessFeesModel.getEfbfStatus())
					|| (Constants.EFBF_STATUS_E3.equals(efBusinessFeesModel.getEfbfStatus()) && Constants.HD_SYMBOL_2
							.equals(efBusinessFeesModel.getEfbfHdSymbol()))) {
				canUpLoadFees.add(efBusinessFeesModel);
			}
		}
		//增加自动补收补付 
		//自动生成批次号
		Date date = new Date();
		String augmnetBatchNumber = dateFormat.format(date);
		String escpValue = Constants.NO;
		if (EmptyUtils.isNotEmpty(canUpLoadFees)) {
			String escoCompanyNo = "";
			Long escoId = canUpLoadFees.get(0).getEfbfEscoId();
			if (null != escoId) {
				EsCompanyModel esCompanyModel = this.esCompanyManager.get(escoId);
				escoCompanyNo = esCompanyModel.getEscoCompanyNo();
				if (EmptyUtils.isNotEmpty(escoCompanyNo)) {
					escpValue = this.esControlParamManager.getIsCompanyValue("REDIRECT_BMS_AUGMENT_AUTO",escoCompanyNo);//查询公司级别的控制参数，是否自动补收补付申请
				}
			}
		}
		Long efbmImId = eoorId;
		Boolean flag = this.getIsAugmnetAuto(efbmImId,escpValue);//是否结算审核过
		// 向表里查数据
		StringBuffer sb = new StringBuffer();
		for (EfBusinessFeesModel upEfbf : canUpLoadFees) {
			if (upEfbf.getEfbfSettlementEbcuId() == null) {
				sb.append(upEfbf.getEfbfId()).append("结算对象为空 ");
			}
			if (flag) {
				//如果已经结算审核通过，则默认自动补收补付 
				upEfbf.setEfbfSubstr19(augmnetBatchNumber);
				upEfbf.setEfbfSubnum2(Long.valueOf(canUpLoadFees.size()));
			}

		}
		
		return canUpLoadFees;
	}
	
	/**
	 * 通过查找单票操作表结算审核状态，如果是已经结算审核通过则返回true
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param efbmImId
	 * @param escpValue
	 * @return
	 */
	public Boolean getIsAugmnetAuto(Long efbmImId, String escpValue) {
		Boolean flag = false;
		if (Constants.YES.equals(escpValue)) {
			List<FilterCondition> conditions = new ArrayList<>();
			conditions.add(new FilterCondition("efbmImId", efbmImId, "="));
			List<EfBmsImModel> efBmsImModels = this.efBmsImManager.findByCondition(conditions);
			if (EmptyUtils.isNotEmpty(efBmsImModels)) {
				for (int i = 0; i < efBmsImModels.size(); i++) {
					Long efbmBmsStatus = efBmsImModels.get(i).getEfbmBmsStatus();
					if (efbmBmsStatus != null && Constants.EFBM_BMS_STATUS_TWO.equals(efbmBmsStatus)) {
						flag = true;
						break;
					}
				}
			}
		}
		return flag;
	}

	@Override
	public ResponseData assembleEfbfInformation(Collection<Long> efbfIds, List<SettmentCodeRequestQueryDto> settmentCodeRequestQueryDtos) {
		ResponseData responseData = new ResponseData<>();
		SettmentCodeRequestQueryDto settmentCodeRequestQueryDto = settmentCodeRequestQueryDtos.get(0);
		//如果入参大于0，则金额就和
		if (EmptyUtils.isNotEmpty(settmentCodeRequestQueryDtos) && settmentCodeRequestQueryDtos.size() > 1) {
			Double totalAmt = 0d;
			for (SettmentCodeRequestQueryDto item : settmentCodeRequestQueryDtos) {
				totalAmt += item.getEfbfSum();
			}
			//处理提交结算单时总金额没有四舍五入的情况
			settmentCodeRequestQueryDto.setEfbfSum(NumberUtil.getRoundDouble(totalAmt, 2));
		}
		String resultStr = "";//收集提交结算单的URL
		
		if (Constants.FEE_TYPE_R.equals(settmentCodeRequestQueryDto.getEfbfType())) {//动态组装应收费用信息
			resultStr = this.assembleEfbfTypeR(efbfIds, settmentCodeRequestQueryDto);
		} else if (Constants.FEE_TYPE_P.equals(settmentCodeRequestQueryDto.getEfbfType())) {//动态组装应付费用信息
			resultStr = this.assembleEfbfTypeP(efbfIds, settmentCodeRequestQueryDto);
		} else if (Constants.FEE_TYPE_REP_R.equals(settmentCodeRequestQueryDto.getEfbfType())) {//动态组装代收费用信息
			resultStr = this.assembleEfbfTypeRR(efbfIds, settmentCodeRequestQueryDto);
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("代收代付无法预约开票!");
			return responseData;
		}
		responseData.setCode(Constants.YES);
		responseData.setData(resultStr);
		return responseData;
	}
	
	/**
	 * 动态组装应收费用数据
	 * @author Shoven.Jiang  
	 * @date 2018年10月9日
	 * @param settmentCodeRequestQueryDto
	 * @return
	 */
	private String assembleEfbfTypeR(Collection<Long> efbfIds, SettmentCodeRequestQueryDto settmentCodeRequestQueryDto) {
		String submitSettlementUrlTypeR = "";//应收费用提交结算单URL
		String submitSettlementUrl = "";
		Map<String, Object> submitSettlementUrlMap = this.esControlParamManager.getControlParamValues(Constants.URL_BMS_BILLING_RECEIVABLE);
		if (null != submitSettlementUrl) {
			submitSettlementUrl = (String) submitSettlementUrlMap.get("URL_BMS_BILLING_RECEIVABLE");
		}
		SettmentCodeRequestParamDto settmentCodeRequestParamDto = new SettmentCodeRequestParamDto();
		settmentCodeRequestParamDto = initParam(efbfIds, settmentCodeRequestQueryDto);
		Gson gson = new Gson();
		String jsonStr = gson.toJson(settmentCodeRequestParamDto);
		try {
			submitSettlementUrlTypeR = submitSettlementUrl + "&" + URLEncoder.encode(jsonStr, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return submitSettlementUrlTypeR;
	}
	
	/**
	 * 动态组装应付费用数据
	 * @author Shoven.Jiang  
	 * @date 2018年10月9日
	 * @param settmentCodeRequestQueryDto
	 * @return
	 */
	private String assembleEfbfTypeP(Collection<Long> efbfIds, SettmentCodeRequestQueryDto settmentCodeRequestQueryDto) {
		String submitSettlementUrlTypeP = "";//应付费用提交结算单URL
		String submitSettlementUrl = this.esControlParamManager.getIsCompanyValue(Constants.URL_BMS_BILLING_PAY);
		SettmentCodeRequestParamDto settmentCodeRequestParamDto = new SettmentCodeRequestParamDto();
		settmentCodeRequestParamDto = initParam(efbfIds, settmentCodeRequestQueryDto);
		Gson gson = new Gson();
		String jsonStr = gson.toJson(settmentCodeRequestParamDto);
		submitSettlementUrlTypeP = submitSettlementUrl + jsonStr;
		try {
			submitSettlementUrlTypeP = submitSettlementUrl + "&" + URLEncoder.encode(jsonStr, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return submitSettlementUrlTypeP;
	}
	
	/**
	 * 动态组装代收费用数据
	 * @author Shoven.Jiang  
	 * @date 2018年10月9日
	 * @param settmentCodeRequestQueryDto
	 * @return
	 */
	private String assembleEfbfTypeRR(Collection<Long> efbfIds, SettmentCodeRequestQueryDto settmentCodeRequestQueryDto) {
		String submitSettlementUrlTypeRR = "";//代收费用提交结算单URL
		String submitSettlementUrl = this.esControlParamManager.getIsCompanyValue(Constants.URL_BMS_BILLING_COLLECTION);
		SettmentCodeRequestParamDto settmentCodeRequestParamDto = new SettmentCodeRequestParamDto();
		settmentCodeRequestParamDto = initParam(efbfIds, settmentCodeRequestQueryDto);
		Gson gson = new Gson();
		String jsonStr = gson.toJson(settmentCodeRequestParamDto);
		try {
			submitSettlementUrlTypeRR = submitSettlementUrl + "&" + URLEncoder.encode(jsonStr, "UTF-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return submitSettlementUrlTypeRR;
	}
	
	/**
	 * 组装费用数据，提交结算单操作中组装数据
	 * @author Shoven.Jiang  
	 * @date 2018年10月10日
	 * @param settmentCodeRequestQueryDto
	 * @return
	 */
	private SettmentCodeRequestParamDto initParam(Collection<Long> efbfIds, SettmentCodeRequestQueryDto settmentCodeRequestQueryDto) {
		SettmentCodeRequestParamDto settmentCodeRequestParamDto = new SettmentCodeRequestParamDto();
		UserDetails user = SessionContext.getUser();
//		String code = NOGeneratorUtil.currentValue(Constants.BOOKING_INVOICE_NUM_R);
		String code = "";
		if (IgnoreLoginController.isIgnore()) {//如果是虚拟登陆
			List<Long> efbfIdsList = (List<Long>) efbfIds;
			if (EmptyUtils.isNotEmpty(efbfIdsList)) {
				EfBusinessFeesModel efBusinessFeesModel = this.efBusinessFeesManager.get(efbfIdsList.get(0));
				if (null != efBusinessFeesModel) {
					Long eoorId = efBusinessFeesModel.getEfbfEoorId();
					if (null != eoorId) {
						EoOrderModel eoOrderModel = this.eoOrderManager.get(eoorId);
						if (null != eoOrderModel) {
							String esusId = eoOrderModel.getCreator();
							Long esdeId = eoOrderModel.getEoorEsdeId();
							Long escoId = eoOrderModel.getEoorEscoId();
							if (null != escoId) {
								EsCompanyModel esCompanyModel = this.esCompanyManager.get(escoId);
								if (null != esCompanyModel) {
									user.setEscoCompanyNo(esCompanyModel.getEscoCompanyNo());
								}
							}
							if (null != esdeId) {
								user.setUserDeptId(esdeId.toString());
							}
							if (EmptyUtils.isNotEmpty(esusId)) {
								EsUserModel esUserModel = this.esUserManager.get(Long.valueOf(esusId));
								user.setUserEmail(esUserModel.getEsusEmail());
								user.setUserNameCn(esUserModel.getEsusUserNameCn());
							}
						}
					}
				}
			}
		}
		settmentCodeRequestParamDto.setEfrvEscoCompanyNo(user.getEscoCompanyNo());
		settmentCodeRequestParamDto.setEfrvIsRp("R".equals(settmentCodeRequestQueryDto.getEfbfType()) ? "1" : "-1");
		if ("RR".equals(settmentCodeRequestQueryDto.getEfbfType())) {
			settmentCodeRequestParamDto.setEfrvIsRp("2");
		}
		if (user.getUserDeptId() != null) {
			EsDepartmentModel esDepartmentModel = this.esDepartmentManager.get(Long.valueOf(user.getUserDeptId()));
			if (null != esDepartmentModel) {
				settmentCodeRequestParamDto.setEfrvDeptCode(esDepartmentModel.getEsdeDepartmentCode());
			}
		}
		settmentCodeRequestParamDto.setEfrvAmt(String.valueOf(settmentCodeRequestQueryDto.getEfbfSum()));
		settmentCodeRequestParamDto.setEfrvApplyUsername(user.getUserNameCn());
		settmentCodeRequestParamDto.setEfrvApplyEmail(user.getUserEmail());
		settmentCodeRequestParamDto.setEfrvApplyTime(Long.valueOf(System.currentTimeMillis()));
		settmentCodeRequestParamDto.setEfrvCurrency(settmentCodeRequestQueryDto.getEfbfCurrency());
		settmentCodeRequestParamDto.setEfrvTaxrate(settmentCodeRequestQueryDto.getEfbfTaxRate().toString());
		settmentCodeRequestParamDto.setEfrvEbcuCode(settmentCodeRequestQueryDto.getEfbfSettlementEbcuCdh());
		settmentCodeRequestParamDto.setEfrvDeptCode(settmentCodeRequestQueryDto.getEoorBmsEsdeDepartmentCode());
		settmentCodeRequestParamDto.setEfrvSalesCode(settmentCodeRequestQueryDto.getEoorBmsEbsmCode());
		StringBuffer efriEfepSourceIds = new StringBuffer();
		for (Long efbfId : efbfIds) {
			efriEfepSourceIds.append(efbfId);
			efriEfepSourceIds.append(",");
		}
		efriEfepSourceIds.deleteCharAt(efriEfepSourceIds.lastIndexOf(","));
		settmentCodeRequestParamDto.setEfrvEfepSourceIds(efriEfepSourceIds.toString());
		settmentCodeRequestParamDto.setEfrvLineCount(efbfIds.size() + "");
		settmentCodeRequestParamDto.setEfrvInvoiceNumber(code);
		return settmentCodeRequestParamDto;
	}

	@Override
	public ResponseData uploadCashSettlement(Long[] efbfIds, Long eoorId) {
		ResponseData responseData = new ResponseData();
		//费用现结上传前校验
		responseData = this.canUpLoadFees(eoorId, efbfIds);
		if (Constants.NO.equals(responseData.getCode())) {
			return responseData;
		}
		String businessType = (String) responseData.getData();
		//费用现结上传逻辑
		switch (businessType) {
		case "14":
			//合同物流现结上传
			responseData = this.efBusinessFeesContractLogisticSettlementService.upLoadBmsSettmentByContractLogisticTemplete(efbfIds, eoorId, businessType);
			break;

		default:
			break;
		}
		return responseData;
	}
	
	/**
	 * 费用现结上传前校验
	 * @author Shoven.Jiang  
	 * @date 2018年10月11日
	 * @param eoorId
	 * @return
	 */
	public ResponseData canUpLoadFees(Long eoorId, Long [] efbfIds) {
		ResponseData responseData = new ResponseData();
		String businessType = "";//业务类型  从订单表中取值
		String errMsg = "";//收集费用现结上传错误信息
		EoOrderModel eoOrderModel = this.eoOrderManager.get(eoorId);
		if (null == eoOrderModel) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("没有查询到相关订单，请确认后查询！");
			return responseData;
		}
		if (EmptyUtils.isNotEmpty(eoOrderModel.getEoorStatus()) && Constants.SYS_STATUS_ADD.equals(eoOrderModel.getEoorStatus())) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单状态为新增状态，不允许上传BMS！");
			return responseData;
		}
		businessType = eoOrderModel.getEoorBusinessType();
		if (EmptyUtils.isEmpty(businessType)) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单业务类型为空，无法确定统计值模板，请维护！");
			return responseData;
		}
		if (EmptyUtils.isNotEmpty(efbfIds)) {
			List<FilterCondition> conditions = new ArrayList<>();
			conditions.add(new FilterCondition("efbfId", efbfIds, "in"));
			List<EfBusinessFeesModel> efBusinessFeesModels = this.efBusinessFeesManager.findByCondition(conditions);
			if (EmptyUtils.isNotEmpty(efBusinessFeesModels)) {
				for (EfBusinessFeesModel efBusinessFeesModel : efBusinessFeesModels) {
					Long efbfStatus = efBusinessFeesModel.getEfbfStatus();
					//校验现结上传的费用中费用状态是否是新增，接收成功，上传成功，审核成功，上传中，如果是则不让其上传
					if (null != efbfStatus && (Constants.EFBF_STATUS_0.equals(efbfStatus) || Constants.EFBF_STATUS_2.equals(efbfStatus) ||Constants.EFBF_STATUS_3.equals(efbfStatus) ||Constants.EFBF_STATUS_4.equals(efbfStatus) ||Constants.EFBF_STATUS_9.equals(efbfStatus))) {
						responseData.setCode(Constants.NO);
						responseData.setMsg("请选择费用状态为确认、接收失败、上传失败的费用！");
						return responseData;
					}
				}
			}
		}
		responseData.setData(businessType);
		return responseData;
	}
}
