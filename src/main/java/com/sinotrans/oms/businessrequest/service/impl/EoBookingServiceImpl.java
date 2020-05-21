package com.sinotrans.oms.businessrequest.service.impl;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.core.aop.BaseAspect;
import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.basicdata.manager.EbCodeMasterManager;
import com.sinotrans.oms.basicdata.model.EbCodeMasterModel;
import com.sinotrans.oms.businessrequest.dto.EoBookingDto;
import com.sinotrans.oms.businessrequest.dto.EoBookingModelDto;
import com.sinotrans.oms.businessrequest.manager.DpInTrackManager;
import com.sinotrans.oms.businessrequest.manager.EoBookingManager;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EobrManager;
import com.sinotrans.oms.businessrequest.manager.EoEorb2EosrManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestDeclarationDeputeManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestTrailerManager;
import com.sinotrans.oms.businessrequest.model.DpInTrackModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EobrModel;
import com.sinotrans.oms.businessrequest.model.EoEorb2EosrModel;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.businessrequest.model.EoRequestDeclarationDeputeModel;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.businessrequest.service.EoBookingService;
import com.sinotrans.oms.businessrequest.service.EoRequestBookingExportService;
import com.sinotrans.oms.businessrequest.service.EoRequestBookingSendEmailService;
import com.sinotrans.oms.businessrule.manager.EsControlParamManager;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.Response;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.manager.ProcedureManager;
import com.sinotrans.oms.common.nogenerator.NOGeneratorUtil;
import com.sinotrans.oms.common.tool.SendMailUtil;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.contract.manager.ElProtocolCostConManager;
import com.sinotrans.oms.contract.manager.ElProtocolCostFeelManager;
import com.sinotrans.oms.contract.manager.ElProtocolCostManager;
import com.sinotrans.oms.contract.manager.ElProtocolManager;
import com.sinotrans.oms.contract.model.ElProtocolCostConModel;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;
import com.sinotrans.oms.contract.model.ElProtocolCostModel;
import com.sinotrans.oms.contract.model.ElProtocolModel;
import com.sinotrans.oms.customerproject.manager.EbCustomerContactManager;
import com.sinotrans.oms.customerproject.manager.EbCustomerManager;
import com.sinotrans.oms.customerproject.model.EbCustomerContactModel;
import com.sinotrans.oms.customerproject.model.EbCustomerModel;
import com.sinotrans.oms.datainteraction.service.EdiBookingService;
import com.sinotrans.oms.eoorder.manager.EoOrderExpandAgencyManager;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.manager.EoOrderPrecontainerManager;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.eoorder.model.EoOrderPrecontainerModel;
import com.sinotrans.oms.eoorder.service.EoOrderService;
import com.sinotrans.oms.fees.manager.EbExchangeRateManager;
import com.sinotrans.oms.fees.model.EbExchangeRateModel;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;
import com.sinotrans.oms.fees.service.EfbfBusinessFeesService;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.system.manager.EsCompanyManager;
import com.sinotrans.oms.system.manager.EsUserManager;
import com.sinotrans.oms.system.model.EsCompanyModel;
import com.sinotrans.oms.system.model.EsUserModel;

import jxl.write.WriteException;
@Service
public class EoBookingServiceImpl extends BaseAspect implements EoBookingService {
	
	@Autowired
	private EoBookingManager eoBookingManager;
	@Autowired
	private EoOrderManager eoOrderManager;//订单Manager
	@Autowired
	private EoOrderService eoOrderService;//订单
	@Autowired
	private EsUserManager esUserManager;//用户
	@Autowired
	private EoOrderPrecontainerManager eoOrderPrecontainerManager;
	@Autowired
	private EbCodeMasterManager ebCodeMasterManager;//控制参数
	@Autowired
	private EoOrderExpandAgencyManager eoOrderExpandAgencyManager;//订单代理拓展表
	@Autowired
	private EdiBookingService ediBookingService;//订舱接口
	@Autowired
	private EoRequestTrailerManager eoRequestTrailerManager;//拖车
	@Autowired
	private EoRequestDeclarationDeputeManager eoRequestDeclarationDeputeManager;//报关
	@Autowired
	private ProcedureManager procedureManager;
	@Autowired
	private  EoRequestBookingSendEmailService eoRequestBookingSendEmailService;//发送邮件
	@Autowired
	private EbCustomerManager ebCustomerManager;
	@Autowired
	private EoEorb2EosrManager eoEorb2EosrManager;
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
	private EbCustomerContactManager ebCustomerContactManager;
	@Autowired
	private EsCompanyManager esCompanyManager;//获取平台
	@Autowired 
	private EbExchangeRateManager ebExchangeRateManager;//汇率表手工维护
	@Autowired
	private DpInTrackManager dpInTrackManager;
	@Autowired
	private EoRequestBookingExportService eoRequestBookingExportService;
	@Autowired
	private EoEoom2EobrManager eoEoom2EobrManager;
	@Autowired
	private EsControlParamManager esControlParamManager;
	
	@Override
	public ResponseData<EoRequestBookingModel> saveBooking(EoBookingModelDto eoBookingModelDto) {
		EoRequestBookingModel eoRequestBookingModel = new EoRequestBookingModel();
		BlukInsertUtils.copyPropertiesNonNull(eoRequestBookingModel, eoBookingModelDto);
		ResponseData<EoRequestBookingModel> responseData = new ResponseData<>();
		String msg = baseEoRequestBooking(eoRequestBookingModel);
		if(EmptyUtils.isNotEmpty(msg)){
			responseData.setCode(Constants.NO);
			responseData.setMsg(msg);
			return responseData;
		}
		//保存报关运输工具
		this.baseEoRequestDeclaration(eoRequestBookingModel);
		//订舱请求编号 生成规则
		if (EmptyUtils.isEmpty(eoRequestBookingModel.getEorbNo())) {
            String eorbNo = NOGeneratorUtil.currentValue(Constants.EORB_NO);
            eoRequestBookingModel.setEorbNo(eorbNo);
        }
        
		//增加签单方式中文名称保存
		String eorbBlIssueModeName = this.getEorbBlIssueModeNameByEbcdType(eoRequestBookingModel.getEorbBlIssueModeCode());
		eoRequestBookingModel.setEorbBlIssueModeName(eorbBlIssueModeName);
		eoRequestBookingModel.setEorbFreightClauseName(eoRequestBookingModel.getEorbFreightClauseCode());
		if (eoRequestBookingModel.getEorbBlCopyNum() == null) {
			eoRequestBookingModel.setEorbBlCopyNum(null);
		}
		EoRequestBookingModel requestBookingModel = this.eoBookingManager.save(eoRequestBookingModel);
		if (null == requestBookingModel) {
			responseData.setMsg("保存失败，请重试！");
    		responseData.setCode(Constants.NO);
    		responseData.setData(eoBookingModelDto);
    		return responseData;
		}
		//待订舱反馈保存时，判断提单号以及任务状态，并且将提单号赋值给该订单下的拖车以及报关任务
		if (Constants.SYS_STOCKIN_STATUS_COMPLETED.equals(requestBookingModel.getEorbStatus()) && EmptyUtils.isNotEmpty(requestBookingModel.getEorbBulkBillNo())) {
			Long eoorId = requestBookingModel.getEorbEoorId();
			String eorbBulkBillNo = requestBookingModel.getEorbBulkBillNo();
			String eorbVoyage = requestBookingModel.getEorbVoyage();
			String eorbVesselName = requestBookingModel.getEorbVesselName();
			this.saveEoddAndEoetModelByEoorId(eoorId, eorbBulkBillNo, eorbVoyage, eorbVesselName);
			//反馈成功  增加内部状态
			this.eoBookingManager.saveDpInTrack(eoRequestBookingModel);
		}
		
		//请求保存后，根据 作业步骤表记录id 获取 作业事件来调用存储过程
		String errm = "";
		try {
			Long ebtkId = requestBookingModel.getEorbEbtkId(); // 作业步骤ID
			Long brid = requestBookingModel.getEorbId();
			errm += this.procedureManager.invokeAfterSaveBrEvent(ebtkId, Constants.TASK_TYPE_BOOKING, brid);
		} catch (Exception e) {
			e.printStackTrace();
            errm = "将订舱数据同步到基本信息页面失败";
		}
        if (EmptyUtils.isNotEmpty(errm)) {
        	responseData.setMsg(errm);
    		responseData.setCode(Constants.NO);
    		responseData.setData(requestBookingModel);
    		return responseData;
        }
		responseData.setMsg("订舱保存成功");
		responseData.setCode(Constants.YES);
		responseData.setData(requestBookingModel);

		return responseData;
	}
	
	/**
	 * @deprecated:订舱保存根据船公司校验必填信息，根据订舱页面船公司code和数据字段中的code进行比较
	 * @author Colley.Bai  
	 * @date 2019年4月29日
	 * @param eoRequestBookingModel
	 * @return
	 */
	public String afterBaseEoRequestBooking (EoRequestBookingModel eoRequestBookingModel) {
		String msg = "";
		if (null != eoRequestBookingModel) {
			UserDetails userDetails = SessionContext.getUser();
			List<FilterCondition> filterCondition = new ArrayList<>();
			//公司
			filterCondition.add(new FilterCondition("epccEscoId",Long.valueOf(userDetails.getOrgId()),"="));
			//项目
			filterCondition.add(new FilterCondition("epccEbpjId",eoRequestBookingModel.getEorbEbpjId(),"="));
			
			filterCondition.add(new FilterCondition("epccShipCode",eoRequestBookingModel.getEorbCarrierCode(),"="));
			//校验项
			List<ElProtocolCostConModel> elProtocolCostConModels = elProtocolCostConManager.findByCondition(filterCondition);
			if (EmptyUtils.isNotEmpty(elProtocolCostConModels)) {
				for (ElProtocolCostConModel elProtocolCostConModel : elProtocolCostConModels) {
					msg = this.baseEoRequestBookingCheck(eoRequestBookingModel, elProtocolCostConModel);
					if (EmptyUtils.isEmpty(msg)) {
						msg = this.baseEoRequestBookingCheckNotNull(eoRequestBookingModel, elProtocolCostConModel);
					}
					if (EmptyUtils.isEmpty(msg)) {
						msg = this.baseEoRequestMaterialCheckNotNull(eoRequestBookingModel, elProtocolCostConModel);
					}
 				}
			}
		}
		return msg;
	}
	
	/**
	 * @deprecated:判断订舱基本信息中收发通明细不能超过五行，每行不能超过35个字符
	 * @author Colley.Bai  
	 * @date 2019年5月7日
	 * @param eoRequestBookingModel
	 * @param elProtocolCostConModel
	 * @return
	 */
	public String baseEoRequestBookingCheckNotNull(EoRequestBookingModel eoRequestBookingModel, ElProtocolCostConModel elProtocolCostConModel){
		String msg = "";
		if (null != eoRequestBookingModel && null != elProtocolCostConModel) {
			if (null != elProtocolCostConModel.getEpccEpctId()) {
				if (elProtocolCostConModel.getEpccEpctId() == 1) {
					if (EmptyUtils.isNotEmpty(eoRequestBookingModel.getEorbShipperDetail())&&EmptyUtils.isNotEmpty(eoRequestBookingModel.getEorbConsigneeDetail())&&EmptyUtils.isNotEmpty(eoRequestBookingModel.getEorbNotifierDetail())) {
						String[] eorbShipperDetails = eoRequestBookingModel.getEorbShipperDetail().split("\n");
						String[] eorbConsigneeDetails = eoRequestBookingModel.getEorbConsigneeDetail().split("\n");
						String[] eorbNotifierDetails = eoRequestBookingModel.getEorbNotifierDetail().split("\n");
						if (eorbShipperDetails.length > 4) {
							msg += "发货人";
						}
						if (eorbConsigneeDetails.length > 4) {
							if (EmptyUtils.isNotEmpty(msg)) {
								msg = msg + "、";
							}
							msg += "收货人";
						}
						if (eorbNotifierDetails.length > 4) {
							if (EmptyUtils.isNotEmpty(msg)) {
								msg = msg + "、";
							}
							msg += "第一通知人";
						}
						if (EmptyUtils.isNotEmpty(msg)) {
							msg = msg + "名称+明细不能超过五行";
						}
						for (int i = 0 ; i < eorbShipperDetails.length ; i ++) {
							if (eorbShipperDetails[i].length() > 35) {
								if (EmptyUtils.isNotEmpty(msg)) {
									msg = msg + "，\n";
								}
								msg += "发货人明细" + "第" + (i+1) + "行";
								break;
							}
						}
						for (int i = 0 ; i < eorbConsigneeDetails.length ; i ++) {
							if (eorbConsigneeDetails[i].length() > 35) {
								if (EmptyUtils.isNotEmpty(msg)) {
									msg = msg + "、";
								}
								String s = "收货人明细" + "第" + (i+1) + "行";
								msg += s;
								break;
							}
						}
						for (int i = 0 ; i < eorbNotifierDetails.length ; i ++) {
							if (eorbNotifierDetails[i].length() > 35) {
								if (EmptyUtils.isNotEmpty(msg)) {
									msg = msg + "、";
								}
								msg += "第一通知人明细" + "第" + (i+1) + "行";
								break;
							}
						}
						if (EmptyUtils.isNotEmpty(msg)) {
							if (msg.indexOf("第") != -1) {
								msg = msg + "不能超过35个字符";
							}
						}
					}
				}
			}
		}
		return msg;
	}
	
	
	/**
	 * @deprecated:订舱保存校验
	 * @author Colley.Bai  
	 * @date 2018年9月26日 下午6:46:34
	 * @param eoRequestBookingModel
	 * @return
	 */
	public String baseEoRequestBooking(EoRequestBookingModel eoRequestBookingModel){
		String msg = "";
		if(null != eoRequestBookingModel.getEorbStatus()){
			if(null == eoRequestBookingModel.getEorbConsignorEbcuName() || "".equals(eoRequestBookingModel.getEorbConsignorEbcuName())){
				msg += "委托方不能为空！";
			}else if(null == eoRequestBookingModel.getEorbBookingAgentName() || "".equals(eoRequestBookingModel.getEorbBookingAgentName())){
				msg += "订舱代理不能为空！" ;
			}else if(null == eoRequestBookingModel.getEorbCarrierName() || "".equals(eoRequestBookingModel.getEorbCarrierName())){
				msg += "船公司不能为空！";
			}
		}
		return msg;
	}
	
	/**
	 * @deprecated:报关更新运输工具名称
	 * @author Colley.Bai  
	 * @date 2018年12月17日
	 * @param eoRequestBookingModel
	 */
	public void baseEoRequestDeclaration(EoRequestBookingModel eoRequestBookingModel){
		List<FilterCondition> filterCondition = new ArrayList<>();
		filterCondition.add(new FilterCondition("eoddEoorId",eoRequestBookingModel.getEorbEoorId(),"="));
 		List<EoRequestDeclarationDeputeModel> eoRequestDeclarationDeputeModelList = eoRequestDeclarationDeputeManager.findByCondition(filterCondition);
 		if (EmptyUtils.isNotEmpty(eoRequestBookingModel.getEorbVesselName()) && EmptyUtils.isNotEmpty(eoRequestBookingModel.getEorbVoyage())) {
	 		if (EmptyUtils.isNotEmpty(eoRequestDeclarationDeputeModelList)) {
	 			for (EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel : eoRequestDeclarationDeputeModelList) {
	 				eoRequestDeclarationDeputeModel.setEoddTransportName(eoRequestBookingModel.getEorbVesselName()+"/"+eoRequestBookingModel.getEorbVoyage());
	 				eoRequestDeclarationDeputeModel = eoRequestDeclarationDeputeManager.save(eoRequestDeclarationDeputeModel);
	 			}
	 		}
 		}
	}
	/**
     * 订舱table页保存时，签单方式的中文名称取值
     * add by shoven 
     * @param ebcdCode
     * @return
     */
    private String getEorbBlIssueModeNameByEbcdType(String ebcdCode) {
    	EbCodeMasterModel ebCodeMasterModel = new EbCodeMasterModel();
    	String ebcdNameCn = "";
    	List<FilterCondition> conditions = new ArrayList<>();
    	conditions.add(new FilterCondition("ebcdDictionaryType","SYS_BL_ISSUE","="));
    	conditions.add(new FilterCondition("ebcdCode",ebcdCode,"="));
    	
		List<EbCodeMasterModel> ebCodeMasterModels = this.ebCodeMasterManager.findByCondition(conditions );
    	if (EmptyUtils.isNotEmpty(ebCodeMasterModels)) {
    		ebcdNameCn = ebCodeMasterModels.get(0).getEbcdNameCn();
    	}
    	return ebcdNameCn;
    }

	@Override
	public ResponseData<EoBookingDto> saveBookingAndMaterial(EoBookingDto eoBookingDto) {
		EoBookingDto afterEoBookingDto = eoBookingManager.saveBookingAndMaterial(eoBookingDto);
		ResponseData<EoBookingDto> responseData = new ResponseData<>();
		responseData.setData(afterEoBookingDto);
		return responseData;
	}

	@Override
	public ResponseData<EoBookingDto> getBookingAndMaterialById(Long eorbId) {
		ResponseData responseData=new ResponseData();
		EoBookingDto eoBookingDto=eoBookingManager.getBookingAndMaterialById(eorbId);
		responseData.setData(eoBookingDto);
		return responseData;
	}

	@Override
	public ResponseData<QueryData> queryBookingByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData=new ResponseData<QueryData>();
		QueryData queryData = eoBookingManager.queryBookingByCondition(queryInfo);
		responseData.setData(queryData);
		return responseData;
	}

	@Override
	public ResponseData issuedBooking(Long [] eorbIds) {
		Response response = new Response();
		ResponseData responseData = new ResponseData<>();
		//下达前的委托校验
		response = this.eoOrderService.beforsetIssued(eorbIds, "订舱");
		if (Constants.NO.equals(response.getCode())) {
			responseData.setCode(response.getCode());
			responseData.setMsg(response.getMsg());
			return responseData;
		}
		for (Long eorbId : eorbIds) {
			
			
			String errm = "";//收集下达时的错误信息
			EoRequestBookingModel eoRequestBookingModel = this.eoBookingManager.get(eorbId);
			
			/**
			 * 根据船公司校验信息
			 */
			String afterMsg = this.afterBaseEoRequestBooking(eoRequestBookingModel);
			if(EmptyUtils.isNotEmpty(afterMsg)){
				responseData.setCode(Constants.NO);
				responseData.setMsg(afterMsg);
				return responseData;
			}
			
			//订舱下达，校验预计开航时间不能小于当前时间
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			
			if (eoRequestBookingModel != null) {
			Date sysDate = null;
			Date eoeaEtd = null;
			try {
				sysDate = sdf.parse(sdf.format(new Date()));
				eoeaEtd = sdf.parse(sdf.format(eoRequestBookingModel.getEorbEtd()));//this.getEoeaEtdByEoorId(eoRequestBookingModel);
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
	        	//校验预计开航时间不能小于当前时间
	        	if (eoeaEtd != null) {
	        		if (/*eoeaEtd.before(sysDate)*/sysDate.getTime() >= eoeaEtd.getTime()) {
		                responseData.setCode(Constants.NO);
						responseData.setMsg("预计开航日期必须大于当前时间！");
						return responseData;
	        		}
	        	}
	        }
			//add by Colley.Bai 20181119 判断订舱的邮箱是否被维护，如果没有被维护，先维护订舱代理邮箱，再去下达 
			errm += checkEootCarrierEbcuContractEmail(eoRequestBookingModel);
			if (EmptyUtils.isNotEmpty(errm)) {
				responseData.setCode(Constants.NO);
				responseData.setMsg(errm);
				return responseData;
			}
			
	        errm = this.eoBookingManager.issuedBooking(eorbId);
	        if (EmptyUtils.isNotEmpty(errm)) {
				responseData.setCode(Constants.NO);
				responseData.setMsg(errm);
				return responseData;
			}
	        try {
				UserDetails user = SessionContext.getUser();
				Long userId = null;
				if (null != user) {
					userId = Long.valueOf(user.getUserId());
				}
				
				this.eoRequestBookingSendEmailService.assembleIssuedBookingEntrust(eorbIds, userId, SessionContext.getUser().getAccessToken());
			 }catch (WriteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.error("订舱下达操作Excel失败" + e.getMessage());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		responseData.setCode(Constants.YES);
		responseData.setMsg("下达成功");
		return responseData;
	}
	
	
	
	/**
     * 订舱下达时获取预计开航时间，预计开航时间不能小于当前时间
     * add  by shoven
     * @param eoRequestBookingModel
     * @return Date
     */
    private Date getEoeaEtdByEoorId(EoRequestBookingModel eoRequestBookingModel) {
    	Long eoorId = eoRequestBookingModel.getEorbEoorId();
    	EoOrderExpandAgencyModel eoOrderExpandAgencyModel = new EoOrderExpandAgencyModel();
    	Date eoeaEtd = null;
    	List<FilterCondition> conditions = new ArrayList<FilterCondition>();
    	conditions.add(new FilterCondition("eoeaEoorId", eoorId, "="));
    	List<EoOrderExpandAgencyModel> eoOrderExpandAgencyModels = this.eoOrderExpandAgencyManager.findByCondition(conditions);
    	if (EmptyUtils.isNotEmpty(eoOrderExpandAgencyModels)) {
    		eoOrderExpandAgencyModel = eoOrderExpandAgencyModels.get(0);
    		eoeaEtd = eoOrderExpandAgencyModel.getEoeaEtd();
    	}
    	return eoeaEtd;
    }
    
    /**
     * 订舱下达邮件内容组装
     * @author Shoven.Jiang  
     * @date 2018年8月29日
     * @param id
     * @return
     */
    private Response IssuedContent(Long eorbId) {
       Response response = new Response();
        String spaceValue = "      ";
        String eosrCtnValues = new String();
        EoRequestBookingModel model = this.eoBookingManager.get(eorbId);
        EoOrderPrecontainerModel eoOrderPrecontainerModel = new EoOrderPrecontainerModel();
        if (model != null) {
        	List<FilterCondition> conditions = new ArrayList<FilterCondition>();
            conditions.add(new FilterCondition("eosrEoorId",model.getEorbEoorId(),"="));
            List<EoOrderPrecontainerModel> eoOrderPrecontainerModels = this.eoOrderPrecontainerManager.findByCondition(conditions);
        	if (EmptyUtils.isNotEmpty(eoOrderPrecontainerModels)) {
        		//eoOrderPrecontainerModel = eoOrderPrecontainerModels.get(0);
        		//获得邮件中的箱型箱量
        		eosrCtnValues = this.getEosrCntByEoOrderPrecontainerModels(eoOrderPrecontainerModels);
        	}
        }
        UserDetails user = SessionContext.getUser();
        EbCodeMasterModel ebCodeMasterModel = new EbCodeMasterModel();
        List<FilterCondition> conditions = new ArrayList<FilterCondition>();
        conditions.add(new FilterCondition("ebcdQuickCode",model.getEorbPaymentMethod(),"="));
        conditions.add(new FilterCondition("ebcdDictionaryType","ORG_PAY_TYPE","="));
        conditions.add(new FilterCondition("ebcdEscoId",Long.parseLong(user.getOrgId()),"="));
        List <EbCodeMasterModel> ebCodeMasterModels = this.ebCodeMasterManager.findByCondition(conditions);
        if(EmptyUtils.isNotEmpty(ebCodeMasterModels)){
        	ebCodeMasterModel = ebCodeMasterModels.get(0);
        }	
        StringBuffer title = new StringBuffer();
        title.append("船公司：");
        title.append(this.notEmptyReturnValue(model.getEorbCarrierName()) + " || ");//船公司显示中文名
        title.append("E T D：");
        String eorbEtdTime = "";
        if (model.getEorbEtd() != null) {
        	String eorbEtd = String.valueOf(model.getEorbEtd());
        	eorbEtdTime = eorbEtd.substring(0, 10);
        } else {
        	eorbEtdTime = "";
        }
        title.append(eorbEtdTime + " || ");//ETD只取年月日
        title.append("交货地：");
        title.append(this.notEmptyReturnValue(model.getEorbDeliveryPlaceName()) + " || ");
        title.append("箱型/箱量：");//箱型 箱量 如果没有值邮件中就空着
        title.append(eosrCtnValues + " || ");
        title.append("订舱");
        StringBuffer content = new StringBuffer();
        content.append(model.getEorbStowageName());
        content.append("，你好！\n");
        content.append(spaceValue + "我司委托贵司一票订舱业务已由OMS下发至贵司系统，请安排订舱，具体信息如下：\n");
        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        content.append(spaceValue + "订舱下达时间：");
        content.append(dateFormat.format(now));
        Long eorbSubnum1 = 0L;
        if (model.getEorbSubnum1() == null) {
        	eorbSubnum1 = 1L;
        } else {
        	eorbSubnum1 = model.getEorbSubnum1() +1;
        }
        content.append("   " + "（" + "订舱第"+ eorbSubnum1 +"次下达" + "）" + "\n");
        content.append(spaceValue + "委托编号：");
        content.append(this.notEmptyReturnValue(model.getEorbNo()) + "\n");
        content.append(spaceValue + "S/O .NO：");
        content.append(this.notEmptyReturnValue(model.getEorbSoNo()) + "\n");
        content.append(spaceValue + "船公司：");
        content.append(this.notEmptyReturnValue(model.getEorbCarrierName()) + "\n");//船公司显示中文名
        content.append(spaceValue + "E T D：");
        content.append(eorbEtdTime + "\n");//ETD只取年月日
        content.append(spaceValue + "装货港：");
        content.append(this.notEmptyReturnValue(model.getEorbLoadPortName()) + "\n");
        content.append(spaceValue + "卸货港：");
        content.append(this.notEmptyReturnValue(model.getEorbDischargePortName()) + "\n");
        content.append(spaceValue + "交货地：");
        content.append(this.notEmptyReturnValue(model.getEorbDeliveryPlaceName()) + "\n");
        content.append(spaceValue + "箱型/箱量：");//箱型 箱量 如果没有值邮件中就空着
        content.append(eosrCtnValues);
        content.append("\n");
        content.append(spaceValue + "付款方式：");
        content.append(this.notEmptyReturnValue(ebCodeMasterModel.getEbcdNameEn()) + "\n");
        content.append(spaceValue + "订舱协议号：");
        content.append(this.notEmptyReturnValue(model.getEorbBookingContractNo()) + "\n");
        content.append(spaceValue + "订舱备注：");
        content.append(this.notEmptyReturnValue(model.getEorbBookingRemark()) + "\n");
        content.append(spaceValue + "所属公司：");
        content.append(this.notEmptyReturnValue(user.getOrgName()) + "\n");
        content.append(spaceValue + "操作员：");
        content.append(this.notEmptyReturnValue(user.getUserNameCn()) + ";    ");
        content.append("电话：");
        Long esusId = null;//当前登录人ID主键
        String esusTel = "";//当前登录人电话
        if (EmptyUtils.isNotEmpty(user.getUserId())) {
        	esusId = Long.valueOf(user.getUserId());
        	user.getUsername();
        	esusTel = this.getEsusTelByEsusId(esusId);
        }
        content.append(esusTel + ";    ");
        String email = model.getEorbContactorEmail();
        if(EmptyUtils.isNotEmpty(email)){
        	content.append("邮箱：");
        	content.append(user.getUserEmail());
        	Long frequencyValue = model.getEorbSubnum1();//订舱下达次数
        	if (frequencyValue == null) {
        		model.setEorbSubnum1(1L);
        		frequencyValue = model.getEorbSubnum1();
        	} else {
        		frequencyValue = frequencyValue + 1;
        		model.setEorbSubnum1(frequencyValue);
        	}
        	this.eoBookingManager.save(model);
        	this.issuedSendEmail(content.toString(), title.toString(), email, frequencyValue);
            //sendEmail(title.toString(), content.toString(), model.getEorbContactorEmail().toString());
        }else{
        	response.setCode(Constants.NO);
        	response.setMsg("收件人为空，请维护收件人信息");
        }
        return response;
    }

    /**
     * 订舱下达和提单下达  发送邮件，得到箱型箱量
     * @author Shoven.Jiang  
     * @date 2018年8月29日
     * @param eoOrderPrecontainerModels
     * @return
     */
    private String getEosrCntByEoOrderPrecontainerModels(List<EoOrderPrecontainerModel> eoOrderPrecontainerModels) {
    	String eosrCntCustomized = "";//尺寸
    	String eosrCntCustomizedSize = "";//箱型
    	int eosrCtnNumber = 0;//箱数
    	StringBuffer eosrCtnValueBuffer = new StringBuffer();
    	String eosrCtnValue = "";
    	String eosrCtnValues = "";
    	for (int i = 0; i < eoOrderPrecontainerModels.size(); i++) {
    		eosrCntCustomized = eoOrderPrecontainerModels.get(i).getEosrCntCustomized();//尺寸
    		eosrCntCustomizedSize = eoOrderPrecontainerModels.get(i).getEosrCntCustomizedSize();//箱型
    		eosrCtnNumber = eoOrderPrecontainerModels.get(i).getEosrCtnNumber();//箱数
    		if (eosrCtnNumber != 0) {
    			eosrCtnValueBuffer.append(eosrCntCustomized);//尺寸
    			eosrCtnValueBuffer.append(eosrCntCustomizedSize);//箱型
    			eosrCtnValueBuffer.append("×");//*
    			eosrCtnValueBuffer.append(eosrCtnNumber);//箱数
    			eosrCtnValueBuffer.append("   ");
    		}
		}
    	if (eosrCtnValueBuffer != null) {
    		eosrCtnValue = eosrCtnValueBuffer.toString();
    	}
    	eosrCtnValues = this.notEmptyReturnValue(eosrCtnValue);
    	return eosrCtnValues;
    }
    
    /**
     * 订舱下达和提单下达，如果字段为空，就空着，不能显示null，
     * 判空并获取返回值
     * @author Shoven.Jiang  
     * @date 2018年8月29日
     * @param inValue
     * @return
     */
    private String notEmptyReturnValue(String inValue) {
    	String outValue = new String();
    	if (EmptyUtils.isNotEmpty(inValue)) {
    		outValue = inValue;
    	} else {
    		outValue = "";
    	}
    	return outValue;
    }
    
    /**
     * 获取用户Tel
     * @author Shoven.Jiang  
     * @date 2018年8月29日
     * @param esusId
     * @return
     */
    private String getEsusTelByEsusId(Long esusId) {
    	String esusTel = "";//当前登录人电话
    	List<FilterCondition> conditions = new ArrayList<FilterCondition>();
    	conditions.add(new FilterCondition("esusId", esusId, "="));
    	List<EsUserModel> esusModels = this.esUserManager.findByCondition(conditions);
    	if (EmptyUtils.isNotEmpty(esusModels)) {
    		esusTel = esusModels.get(0).getEsusTel();
    	}
    	esusTel = this.notEmptyReturnValue(esusTel);
    	return esusTel;
    }
    
    /**
     * 订舱下达邮件发送(带标题)[内容，标题，地址,下达次数]
     * @author Shoven.Jiang  
     * @date 2018年8月29日
     * @param contents
     * @param title
     * @param email
     * @param frequencyValue
     */
    private void issuedSendEmail(String contents, String title, String email, Long frequencyValue) {
    	String titles = title;
    	if (frequencyValue != 1) {
    		titles = titles + "第" + frequencyValue + "次下达";
    	}
    	SendMailUtil sendMailUtil = new SendMailUtil();
    	String address = "lmsupport@sinotrans.com";
		sendMailUtil.setAddress(address, email, titles);
		sendMailUtil.sendEmailNotFile(contents);
    }
    
    /**
	 * 订舱请求下发
	 * @param edboId
	 * add by Ida.Wang 20160222
	 */
    public void sendBookingBrToEAI(String edboId) {
    	try{
//			log.info("调用了订舱正常单发送接口");
//			this.ediBookingService.sendBookingBRToEAI(edboId);
		}catch(Exception e){
			e.printStackTrace();
		}finally{
			
		}
    }
    
    /**
     * 待订舱反馈保存时，判断提单号以及任务状态，并且将提单号赋值给该订单下的拖车以及报关任务
     * @author Shoven.Jiang  
     * @date 2018年9月27日
     * @param eoorId
     */
    @Override
    public void saveEoddAndEoetModelByEoorId(Long eoorId, String eorbBulkBillNo, String eorbVoyage, String eorbVesselName) {
    	if (null != eoorId) {
    		//查询是否包含拖车任务
    		List<FilterCondition> eoetCondition = new ArrayList<>();
    		eoetCondition.add(new FilterCondition("eoetEoorId", eoorId, "="));
    		List<EoRequestTrailerModel> eoRequestTrailerModels = this.eoRequestTrailerManager.findByCondition(eoetCondition);
    		List<FilterCondition> eoddCondition = new ArrayList<>();
    		eoddCondition.add(new FilterCondition("eoddEoorId", eoorId, "="));
    		List<EoRequestDeclarationDeputeModel> eoRequestDeclarationDeputeModels = this.eoRequestDeclarationDeputeManager.findByCondition(eoddCondition);
    		List<FilterCondition> eoeaCondition = new ArrayList<>();
    		eoeaCondition.add(new FilterCondition("eoeaEoorId", eoorId, "="));
    		List<EoOrderExpandAgencyModel> eoOrderExpandAgencyModels = this.eoOrderExpandAgencyManager.findByCondition(eoeaCondition);
    		this.eoBookingManager.saveEoddAndEoetModelByEoorId(eoRequestTrailerModels, eoRequestDeclarationDeputeModels, eoOrderExpandAgencyModels, eorbBulkBillNo, eorbVoyage ,eorbVesselName);
    	}
    }
    
    /**
     * @deprecated:根据订舱任务获取分供商邮件地址
     * @author Colley.Bai  
     * @date 2018年11月19日
     * @param eorbId
     * @return
     */
    public String getEbCustomerContactEmailbyEorbId(Long eorbId){
    	String email = "";
		if (null != eorbId){
			EoRequestBookingModel eoRequestBookingModel = eoBookingManager.get(eorbId);
			if (null != eoRequestBookingModel.getEorbBookingAgentId()) {
				List<EbCustomerContactModel> ebCustomerContactList = ebCustomerManager.getEbCustomerContactByEbcuId(eoRequestBookingModel.getEorbBookingAgentId());
				for (int i=0;i<ebCustomerContactList.size();i++) {
					if (EmptyUtils.isNotEmpty(ebCustomerContactList.get(i).getEbccEmail())) {
						email +=  ebCustomerContactList.get(i).getEbccEmail();
						break;
					}
				}
			}
		}
		return email;
	}

	@Override
	public ResponseData ladingIssuedBooking(Long[] eorbIds) {
		Response response = new Response();
		ResponseData responseData = new ResponseData<>();
		//下达前的委托校验
		response = this.eoOrderService.beforsetIssued(eorbIds, "订舱");
		if (Constants.NO.equals(response.getCode())) {
			responseData.setCode(response.getCode());
			responseData.setMsg(response.getMsg());
			return responseData;
		}
		for (Long eorbId : eorbIds) {
			String errm = "";//收集下达时的错误信息
			EoRequestBookingModel eoRequestBookingModel = this.eoBookingManager.get(eorbId);
			//订舱下达，校验预计开航时间不能小于当前时间
	        errm = this.eoBookingManager.ladingIssuedBooking(eorbId);
	        
	        try {
				UserDetails user = SessionContext.getUser();
				Long userId = null;
				if (null != user) {
					userId = Long.valueOf(user.getUserId());
				}
				
				this.eoRequestBookingSendEmailService.assembleIssuedBookingEntrust(eorbIds, userId, SessionContext.getUser().getAccessToken());
			 }catch (WriteException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				log.error("订舱下达操作Excel失败" + e.getMessage());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		responseData.setCode(Constants.YES);
		responseData.setMsg("下达成功");
		return responseData;
	}

	@Override
	public ResponseData<List<ElProtocolCostFeelModel>> saveAutomaticChargingByEorbBooking(Long[] eorbIds) {
		ResponseData<List<ElProtocolCostFeelModel>> responseData = new ResponseData<List<ElProtocolCostFeelModel>>();
		if (eorbIds.length > 0) {
			for (Long eorbId : eorbIds) {
				//1.获取订舱信息
				EoRequestBookingModel eoRequestBookingModel = this.eoBookingManager.get(eorbId);
				if (null != eoRequestBookingModel) {
					//2.组装匹配协议
					List<FilterCondition> eoRequestBookingFilterCondition = new ArrayList<>();
					//2.1 公司
					eoRequestBookingFilterCondition.add(new FilterCondition("elplEscoId",eoRequestBookingModel.getEorbEscoId(),"="));
					eoRequestBookingFilterCondition.add(new FilterCondition("elplEbpjId",eoRequestBookingModel.getEorbEbpjId(),"="));
					//2.2 订舱代理
					eoRequestBookingFilterCondition.add(new FilterCondition("elplCustomerEbcuId",eoRequestBookingModel.getEorbBookingAgentId(),"="));
					//3.获取订舱匹配的协议（订舱代理匹配协议的客商名称）
					List<ElProtocolModel> elProtocolModelList = elProtocolManager.findByCondition(eoRequestBookingFilterCondition);
					
					if (EmptyUtils.isNotEmpty(elProtocolModelList)) {
						this.getEoBookingAndElProtocol(eoRequestBookingModel,elProtocolModelList);
					}
					
				} else {
					responseData.setCode(Constants.NO);
					responseData.setMsg("订舱信息为空");
				}
			}
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("订舱ID为空");
		}
		return responseData;
	}
	
	/**
	 * @deprecated:根据订舱的订舱代理匹配的协议的客商名称找到的协议
	 * @author Colley.Bai  
	 * @date 2018年11月29日
	 * @param eoRequestBookingModel
	 * @param elProtocolModelList
	 */
	public void getEoBookingAndElProtocol(EoRequestBookingModel eoRequestBookingModel,List<ElProtocolModel> elProtocolModelList){
		
		for (ElProtocolModel elProtocolModel : elProtocolModelList) {
			//更加精确 提高效率
			if (Constants.ELPL_TYPE_BOOKING.equals(elProtocolModel.getElplType())) {
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
							EoOrderModel eoOrderModel = eoOrderManager.get(eoRequestBookingModel.getEorbEoorId());
							List<FilterCondition> eoOrderExpandAgencyFilterCondition = new ArrayList<>();
							eoOrderExpandAgencyFilterCondition.add(new FilterCondition("eoeaEoorId",eoOrderModel.getEoorId(),"="));
							//2.获取订单代理扩展表
							List<EoOrderExpandAgencyModel> eoOrderExpandAgencyModelList = eoOrderExpandAgencyManager.findByCondition(eoOrderExpandAgencyFilterCondition);
							//验证是否有订单和是否有订单代理扩展表
							if (null != eoOrderModel && EmptyUtils.isNotEmpty(eoOrderExpandAgencyModelList)) {
								//1. 组装匹配协议条件分类
								Map<String, Object> condition = new HashMap<>();
								//1.1 协议条件主键，是为找这个协议下的条件分类
								condition.put("epccElplId",elProtocolModel.getElplId());
								//1.2 从订单代理扩展表匹配协议条件分类装货港
								condition.put("epccLoadPortId",eoOrderExpandAgencyModelList.get(0).getEoeaLoadPortId());
								//1.3 从订单代理扩展表匹配协议条件分类卸货港
								condition.put("epccDischargePortId",eoOrderExpandAgencyModelList.get(0).getEoeaDischargePortId());
								//1.4 从订单代理扩展表匹配协议条件分类船公司
								condition.put("epccShipId",eoOrderExpandAgencyModelList.get(0).getEoeaCarrierId());
								//1.5 从订单代理扩展表匹配协议条件分类订舱代理
//								condition.put("epccShipAgentId",eoOrderExpandAgencyModelList.get(0).getEoeaBookingAgentId());
								//1.6 从订单代理扩展表匹配协议条件分类运输条款
								condition.put("epccFreightClauseCode",eoOrderExpandAgencyModelList.get(0).getEoeaFreightClauseCode());
								//1.8 从订单代理扩展表匹配协议条件分类装运方式
//								condition.put("epccLmId",eoOrderExpandAgencyModelList.get(0).getEoeaLmId());
								//1.9 从订单代理扩展表匹配协议条件分类销售人员
								condition.put("epccBmsEbsmCode",eoOrderModel.getEoorBmsEbsmCode());
								//1.91 从订单代理扩展表匹配协议条件分类报关
								condition.put("epccIsDeclaration",eoOrderExpandAgencyModelList.get(0).getEoeaIsCustoms());
								//1.92 从订单代理扩展表匹配协议条件分类订舱
								condition.put("epccIsBooking",eoOrderExpandAgencyModelList.get(0).getEoeaIsBooking());
								//1.93 从订单代理扩展表匹配协议条件分类拖车
								condition.put("epccIsTrailer",eoOrderExpandAgencyModelList.get(0).getEoeaIsTrailer());
								
								//2. 获取订舱匹配的协议条件分类
								List<ElProtocolCostConModel> elProtocolCostConModelList = elProtocolCostConManager.queryByCondition(condition);
								
								if (EmptyUtils.isNotEmpty(elProtocolCostConModelList)) {
									
									for (ElProtocolCostConModel elProtocolCostConModel : elProtocolCostConModelList) {
										//1. 组装查询协议明细
										List<FilterCondition> elProtocolCostConFilterCondition = new ArrayList<>();
										//1.1 协议明细主键
										elProtocolCostConFilterCondition.add(new FilterCondition("epctId",elProtocolCostConModel.getEpccEpctId(),"="));
										//1.2 协议状态 （启用）
										elProtocolCostConFilterCondition.add(new FilterCondition("epctStatus","Y","="));
										//2.获取到协议明细信息，所谓的条件费用信息
										List<ElProtocolCostModel> elProtocolCostModelList = elProtocolCostManager.findByCondition(elProtocolCostConFilterCondition);
										ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
										if (EmptyUtils.isNotEmpty(elProtocolCostModelList)) {
											try {
												responseData = this.getElelProtocolCostFeelByEpccId(elProtocolCostModelList,elProtocolCostConModel,eoRequestBookingModel);
											} catch (Exception e) {
												log.error("自动生成费用异常，" + responseData);
											}
										}
									}
								}
							}
						}
					} catch (ParseException e) {
						e.printStackTrace();
						log.error("时间转换异常" + elProtocolModel.getElplEffectiveDateTo());
					}
				}
			}
		}
	}
	
	/**
	 * @deprecated:根据协议条件分类查询计算方式并且计算
	 * @author Colley.Bai  
	 * @date 2018年11月29日
	 * @param elProtocolCostConModel
	 * @param eoRequestBookingModel
	 * @return
	 */
	public ResponseData<List<EfBusinessFeesModel>> getElelProtocolCostFeelByEpccId(List<ElProtocolCostModel> elProtocolCostModelList,ElProtocolCostConModel elProtocolCostConModel,EoRequestBookingModel eoRequestBookingModel){
		
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		List<EfBusinessFeesModel> efBusinessFeesModels = new ArrayList<>();
		if (null != elProtocolCostConModel) {
			//1.组装查询订舱预配箱数据
			List<FilterCondition> eoRequestBookingFilterCondition = new ArrayList<>();
			//1.1 订舱主键
			eoRequestBookingFilterCondition.add(new FilterCondition("eobtEorbId",eoRequestBookingModel.getEorbId(),"="));
			//2. 查询这个订舱下的所有预配箱信息
			List<EoEorb2EosrModel> eoEorb2EosrModelList = eoEorb2EosrManager.findByCondition(eoRequestBookingFilterCondition);
			//2. 组装查询计算方式数据
			List<FilterCondition> elProtocolCostConFilterCondition = new ArrayList<>();
			//2.1 条件分类主键
			elProtocolCostConFilterCondition.add(new FilterCondition("epcfEpccId",elProtocolCostConModel.getEpccId(),"="));
			//2.2 条件分类 （启用）
			elProtocolCostConFilterCondition.add(new FilterCondition("epcfStatus","Y","="));
			//3.获取属于这个条件分类的计算方式
			List<ElProtocolCostFeelModel> elProtocolCostFeelModelList = elProtocolCostFeelManager.findByCondition(elProtocolCostConFilterCondition);
			
			//匹配到的协议明细
			for (ElProtocolCostModel elProtocolCostModel : elProtocolCostModelList) {
				if (EmptyUtils.isNotEmpty(elProtocolCostFeelModelList)) {
					for (ElProtocolCostFeelModel elProtocolCostFeelModel:elProtocolCostFeelModelList) {
						Long number = 0L;
						//4.如果是箱的时候，计算根据箱型
						if (Constants.EPCF_FORMULA_BOX.equals(elProtocolCostFeelModel.getEpcfFormula())) {
							if (EmptyUtils.isNotEmpty(eoEorb2EosrModelList)) {
								for (EoEorb2EosrModel eoEorb2EosrModel : eoEorb2EosrModelList) {
									//4.1根据尺寸和箱型匹配计算方式
									if (EmptyUtils.isEqual( eoEorb2EosrModel.getEobtCntCustomized() , elProtocolCostFeelModel.getEpcfContainerSize()) && EmptyUtils.isEqual(eoEorb2EosrModel.getEobtCntCustomizedSize() , elProtocolCostFeelModel.getEpcfContainerType())) {
										//4.2获取订单预配箱数量
										number += eoEorb2EosrModel.getEobtCtnNumber() == null ? 0L : eoEorb2EosrModel.getEobtCtnNumber();
									}
								}
								if (number > 0L) {
									efBusinessFeesModels = this.getEfBusinessFeesModelByEpctId(elProtocolCostModel,eoRequestBookingModel,number,elProtocolCostFeelModel.getEpcfPrice());
									try {
										responseData = efbfBusinessFeesService.batchSaveBusinessFees(efBusinessFeesModels);
									} catch (Exception e) {
										log.error("自动生成费用异常，" + responseData);
									}
								}
							}
						}//7.一口价计算，根据1*单价
						else if (Constants.EPCF_FORMULA_PRICE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
							number += 1L;
							efBusinessFeesModels = this.getEfBusinessFeesModelByEpctId(elProtocolCostModel,eoRequestBookingModel,number,elProtocolCostFeelModel.getEpcfPrice());
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
	 * @deprecated:拼接费用数据
	 * @author Colley.Bai  
	 * @date 2018年11月29日
	 * @return
	 */
	public List<EfBusinessFeesModel> getEfBusinessFeesModelByEpctId(ElProtocolCostModel elProtocolCostModel,EoRequestBookingModel eoRequestBookingModel,Long number, Double price){
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
			efBusinessFeesModel.setEfbfEoorId(eoRequestBookingModel.getEorbEoorId());//订单主键
			efBusinessFeesModel.setEfbfEscoId(eoRequestBookingModel.getEorbEscoId());//公司主键
			efBusinessFeesModel.setEfbfQuantity(number);//数量
			efBusinessFeesModel.setEfbfExchangeRate(ebExchangeRateModelList.get(0).getEberConversionRate().doubleValue());//汇率
			//计算结算金额和含税价保留两位小数
			BigDecimal bigDecimal = new BigDecimal(amount * number);  
			Double  total = bigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue(); 
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
	 * @deprecated:根据报关任务获取分供方的邮件地址
	 * @author Colley.Bai  
	 * @date 2018年12月3日
	 * @param eoRequestDeclarationDeputeModel
	 * @return
	 */
	private String checkEootCarrierEbcuContractEmail(EoRequestBookingModel eoRequestBookingModel) {
		String errm = "";
		Long ebcuId = eoRequestBookingModel.getEorbBookingAgentId();
		String ebccIsDefault = "";//是否默认联系人
		String ebccEmail = "";//订舱下达需要发送邮件的地址
		if (null == ebcuId) {
			errm += /*"请求编号：" + eoRequestBookingModel.getEorbNo() + */"订舱代理不存在，请维护！\n";
		} else {
			EbCustomerModel ebCustomerModel = this.ebCustomerManager.get(ebcuId);
			if (null == ebCustomerModel) {
				errm += /*"请求编号：" + eoRequestBookingModel.getEorbNo()+ */"订舱代理在基础数据中不存在，请维护！\n";
			} else {
				String ebcuStatus = ebCustomerModel.getEbcuCustomerStatus();
				if (EmptyUtils.isNotEmpty(ebcuStatus) && !Constants.SYS_STATUS_ENABLE.equals(ebcuStatus)) {
					errm += /*"请求编号：" + eoRequestBookingModel.getEorbNo() + */"订舱代理已经停用，请查看！\n";
				} else {
					List<FilterCondition> conditions = new ArrayList<>();
					conditions.add(new FilterCondition("ebccEbcuId", ebcuId, "="));
					List<EbCustomerContactModel> ebCustomerContactModels = this.ebCustomerContactManager.findByCondition(conditions);
					if (EmptyUtils.isEmpty(ebCustomerContactModels)) {
						errm += /*"请求编号：" + eoRequestBookingModel.getEorbNo() + */"订舱代理联系人不存在，请维护！\n";
					} else {
						for (int i = 0; i < ebCustomerContactModels.size(); i++) {
							ebccIsDefault = ebCustomerContactModels.get(i).getEbccIsDefault();
							if (EmptyUtils.isNotEmpty(ebccIsDefault) && Constants.YES.equals(ebccIsDefault)) {
								ebccEmail = ebCustomerContactModels.get(i).getEbccEmail();
								if (EmptyUtils.isEmpty(ebccEmail)) {
									errm += /*"请求编号：" + eoRequestBookingModel.getEorbNo() + */"订舱代理联系人邮箱不存在，请维护！\n";
								}
							}
						}
						if (EmptyUtils.isNotEmpty(ebccIsDefault) && Constants.NO.equals(ebccIsDefault)) {
							for (int i = 0; i < ebCustomerContactModels.size(); i++) {
								ebccEmail = ebCustomerContactModels.get(i).getEbccEmail();
								if (EmptyUtils.isNotEmpty(ebccEmail)) {
									break;
								}
							}
							if (EmptyUtils.isEmpty(ebccEmail)) {
								errm += /*"请求编号：" + eoRequestBookingModel.getEorbNo() + */"订舱代理联系人邮箱不存在，请维护！\n";
							}
						}
						if (EmptyUtils.isEmpty(ebccIsDefault)) {//如果没有客户则走这个校验
							for (int i = 0; i < ebCustomerContactModels.size(); i++) {
								ebccEmail = ebCustomerContactModels.get(i).getEbccEmail();
								if (EmptyUtils.isNotEmpty(ebccEmail)) {
									break;
								}
							}
							if (EmptyUtils.isEmpty(ebccEmail)) {
								errm += /*"请求编号：" + eoRequestBookingModel.getEorbNo() + */"订舱代理联系人邮箱不存在，请维护！\n";
							}
						}
					}
				}
			}
		}
//		if (EmptyUtils.isEmpty(errm)) {
//			this.issuedSendEmail(ebccEmail);
//		}
		return errm;
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
	public ResponseData eorbStatusBackByEoorIds(Long[] eoorIds) {
		ResponseData responseData = new ResponseData();
		if (null != eoorIds) {
			List<FilterCondition> eorbCondition = new ArrayList<>();
			eorbCondition.add(new FilterCondition("eorbEoorId", eoorIds, "in"));
			List<EoRequestBookingModel> beforeSaveEoRequestBookingModel = new ArrayList<>();
			List<EoRequestBookingModel> eoRequestBookingModels = this.eoBookingManager.findByCondition(eorbCondition);
			if (EmptyUtils.isNotEmpty(eoRequestBookingModels)) {
				//1、订舱已完成 回退到 订舱待反馈，状态 eorbStatus completed
				if (EmptyUtils.isNotEmpty(eoRequestBookingModels.get(0).getEorbStatus()) && Constants.SYS_STOCKIN_STATUS_COMPLETED.equals(eoRequestBookingModels.get(0).getEorbStatus())) {
					for (EoRequestBookingModel eoRequestBookingModel : eoRequestBookingModels) {
						this.updateDpInTrack(eoRequestBookingModel);
						
						eoRequestBookingModel.setEorbStatus(Constants.SYS_STOCKIN_STATUS_ISSUED);//已完成状态
						beforeSaveEoRequestBookingModel.add(eoRequestBookingModel);
					}
					//2、订舱待反馈 回退到 订舱待下达   eorbStatus  unissued
				} else if (Constants.SYS_STOCKIN_STATUS_ISSUED.equals(eoRequestBookingModels.get(0).getEorbStatus())) {
					for (EoRequestBookingModel eoRequestBookingModel : eoRequestBookingModels) {
						this.updateDpInTrack(eoRequestBookingModel);
						
						eoRequestBookingModel.setEorbVesselName(null);//清空船名
						eoRequestBookingModel.setEorbVoyage(null);//清空航次
						eoRequestBookingModel.setEorbBulkBillNo(null);//清空提单号
						eoRequestBookingModel.setEorbSailingDate(null);//清空开航日期
						eoRequestBookingModel.setEorbEsiDeadline(null);//清空截单时间
						eoRequestBookingModel.setEorbSectionalReleaseDate(null);//清空截关时间
						eoRequestBookingModel.setEorbCarrierBookingNo(null);//清空订舱号
						eoRequestBookingModel.setEorbAta(null);//清空到港日期
						eoRequestBookingModel.setEorbReceivedBlDate(null);//收到提单日期
						eoRequestBookingModel.setEorbSubstr25(null);//拒绝原因
						
						eoRequestBookingModel.setEorbStatus(Constants.SYS_STOCKIN_STATUS_UNISSUED);
						eoRequestBookingModel.setEorbTaskStatus("0");
						beforeSaveEoRequestBookingModel.add(eoRequestBookingModel);
					}
				}
				this.eoBookingManager.saveAll(eoRequestBookingModels);//保存订舱数据
			}
			responseData.setCode(Constants.YES);
			responseData.setMsg("操作成功！");
			return responseData;
		}
		responseData.setCode(Constants.NO);
		responseData.setMsg("操作失败！");
		return responseData;
	}
	
	/**
	 * @deprecated:跟踪订舱状态（清空当前登录人和时间）
	 * @author Colley.Bai  
	 * @date 2018年12月26日
	 * @param eoRequestBookingModel
	 */
	public void updateDpInTrack(EoRequestBookingModel eoRequestBookingModel){
		List<FilterCondition> filterCondition = new ArrayList<>();
		filterCondition.add(new FilterCondition("dpitBridId",eoRequestBookingModel.getEorbId(),"="));
		filterCondition.add(new FilterCondition("dpitOrderId",eoRequestBookingModel.getEorbEoorId(),"="));
		if (EmptyUtils.isNotEmpty(eoRequestBookingModel.getEorbStatus()) && Constants.SYS_STOCKIN_STATUS_COMPLETED.equals(eoRequestBookingModel.getEorbStatus())) {
			filterCondition.add(new FilterCondition("dpitType",Constants.DPIT_TYPE_BOOKING_COMPLETE,"="));
		} else if (EmptyUtils.isNotEmpty(eoRequestBookingModel.getEorbStatus()) && Constants.SYS_STOCKIN_STATUS_ISSUED.equals(eoRequestBookingModel.getEorbStatus())) {
			filterCondition.add(new FilterCondition("dpitType",Constants.DPIT_TYPE_BOOKING_ISSUSED,"="));
		}
		//1、用户信息
		UserDetails user = SessionContext.getUser();
		//2、查询是否有内部状态生成
		List<DpInTrackModel> dpInTrackModelList = dpInTrackManager.findByCondition(filterCondition);
		if (EmptyUtils.isNotEmpty(dpInTrackModelList)) {
			for (DpInTrackModel dpInTrackModel : dpInTrackModelList) {
				//业务操作时间
				dpInTrackModel.setDpitOperatorTime(null);
				//业务操作人
				dpInTrackModel.setDpitOperator("");
				dpInTrackManager.save(dpInTrackModel);
			}
		}
	}

	@Override
	public ResponseData exportBooking(Long[] eorbIds,HttpServletResponse resp) {
		ResponseData responseData = new ResponseData();
		Map<String,String> map = new HashMap<>();
		if (eorbIds.length > 0) {
			try {
					UserDetails user = SessionContext.getUser();
					Long userId = null;
					if (null != user) {
						userId = Long.valueOf(user.getUserId());
					}
					map = this.eoRequestBookingExportService.assembleExportBookingEntrust(eorbIds, userId);
			}catch (WriteException e) {
					e.printStackTrace();
					log.error("订舱下达操作Excel失败" + e.getMessage());
			} catch (IOException e) {
					e.printStackTrace();
			}
		}
		if (EmptyUtils.isNotEmpty(map)) {
			responseData.setData(map);
			responseData.setCode(Constants.YES);
		} else {
			responseData.setCode(Constants.YES);
			responseData.setMsg("导出失败");
		}
		return responseData;
	}

	@Override
	public void feedBackToEorb(Map<String, Object> eorbMap) {
		String eorbNo = "";//委托编号
		String eorbBulkBillNo = "";//提单号
		String eorbCarrierName = "";//船公司
		String eorbVesselName = "";//船名
		String eorbVoyage = "";//航次
		String eorbEtd = "";//ETD
		String eorbDischargePortName = "";//卸货港
		String eorbDeliveryPlaceName = "";//交货地
		for (Map.Entry<String, Object> m : eorbMap.entrySet()) {
			String [] eorbArray = (String[]) m.getValue();
			for (int i = 0; i < 20; i++) {
				
			}
        }
	}
	
	/**
	 * @deprecated:根据船公司取出数据字典校验信息，判断是否为空（订舱基本信息）
	 * @author Colley.Bai  
	 * @date 2019年4月29日
	 * @param eoRequestBookingModel
	 * @param ebcdName
	 * @return
	 */
	public String baseEoRequestBookingCheck(EoRequestBookingModel eoRequestBookingModel,ElProtocolCostConModel elProtocolCostConModel){
		String msg = "";
		if (null != eoRequestBookingModel && null != elProtocolCostConModel) {
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccConsignorEbcuName(), "1")) {
				if (EmptyUtils.isEmpty(eoRequestBookingModel.getEorbBookingContractNo())) {
					msg += "订舱协议号" + "、\n";
				}
			}
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccConsignorEbcuCode(), "1")) {
				if (EmptyUtils.isEmpty(eoRequestBookingModel.getEorbTransferPortName())) {
					msg += "中转港" + "、\n";
				}
			}
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccShipperCode(), "1")) {
				if (EmptyUtils.isEmpty(eoRequestBookingModel.getEorbEbrtName())) {
					msg += "航线" + "、\n";
				}
			}
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccShipperName(), "1")) {
				if (EmptyUtils.isEmpty(eoRequestBookingModel.getEorbFinalDestination())) {
					msg += "目的港" + "、\n";
				}
			}
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccShipAgentName(), "1")) {
				if (EmptyUtils.isEmpty(eoRequestBookingModel.getEorbAgreementTyep())) {
					msg +=  "协议类型" + "、\n";
				}
			}
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccShipAgentCode(), "1")) {
				if (EmptyUtils.isEmpty(eoRequestBookingModel.getEorbSecondNotify())) {
					msg += "第二通知人" + "、\n";
				}
			}
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccTruckName(), "1")) {
				if (EmptyUtils.isEmpty(eoRequestBookingModel.getEorbSecondNotifyName())) {
					msg += "第二通知人明细" + "、\n";
				}
			}
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccCustomsName(), "1")) {
				if (EmptyUtils.isEmpty(eoRequestBookingModel.getEorbBookingRemark())) {
					msg += "备注" + "、\n";
				}
			}
		}
		
		msg += this.baseEoRequestMaterial(eoRequestBookingModel, elProtocolCostConModel);
		
		if (EmptyUtils.isNotEmpty(msg)) {
			msg = "船公司为"+ eoRequestBookingModel.getEorbCarrierName()+ ",\n"+ msg + " 不能为空";
		}
		return msg;
	}
	
	/**
	 * @deprecated:根据船公司校验物料是否是危化品
	 * @author Colley.Bai  
	 * @date 2019年4月29日
	 * @param eorbId
	 * @return
	 */
	public String baseEoRequestMaterial(EoRequestBookingModel eoRequestBookingModel,ElProtocolCostConModel elProtocolCostConModel){
		String msg = "";
		if (null != eoRequestBookingModel) {
			if (null != eoRequestBookingModel) {
				List<FilterCondition> eobmfilterCondition = new ArrayList<>();
				eobmfilterCondition.add(new FilterCondition("eobmEorbId", eoRequestBookingModel.getEorbId(),"="));
				List<EoEoom2EobrModel> eoEoom2EobrModels = eoEoom2EobrManager.findByCondition(eobmfilterCondition);
				if (EmptyUtils.isNotEmpty(eoEoom2EobrModels)) {
					for (EoEoom2EobrModel eoEoom2EobrModel : eoEoom2EobrModels) {
						msg = this.baseEoRequestMaterialCheck(eoEoom2EobrModel, elProtocolCostConModel);	
						if (EmptyUtils.isNotEmpty(msg)) {
							msg = "物料信息：\n" + msg ;
						}
					}
				}
				
			}
		}
		return msg;
	}
	
	
	
	/**
	 * @deprecated:判断物料英文名称+货描长度不能大于50个字符
	 * @author Colley.Bai  
	 * @date 2019年5月7日
	 * @param eoEoom2EobrModel
	 * @param elProtocolCostConModel
	 * @return
	 */
	public String baseEoRequestMaterialCheckNotNull(EoRequestBookingModel eoRequestBookingModel,ElProtocolCostConModel elProtocolCostConModel){
		String msg = "";
		if (null != eoRequestBookingModel) {
			if (null != eoRequestBookingModel) {
				List<FilterCondition> eobmfilterCondition = new ArrayList<>();
				eobmfilterCondition.add(new FilterCondition("eobmEorbId", eoRequestBookingModel.getEorbId(),"="));
				List<EoEoom2EobrModel> eoEoom2EobrModels = eoEoom2EobrManager.findByCondition(eobmfilterCondition);
				if (EmptyUtils.isNotEmpty(eoEoom2EobrModels)) {
					for (EoEoom2EobrModel eoEoom2EobrModel : eoEoom2EobrModels) {
						if (null != eoEoom2EobrModel && null != elProtocolCostConModel) {
							if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccSubstr1(), "1")) {
								if (EmptyUtils.isNotEmpty(eoEoom2EobrModel.getEobmEbmaNameEn())) {
									String eobmEbmaNameEnAndDescCn = eoEoom2EobrModel.getEobmEbmaNameEn() + eoEoom2EobrModel.getEobmMaterialDescCn();
									if (eobmEbmaNameEnAndDescCn.length() > 50) {
										msg = "物料信息：英文名+货描长度不能超过50个字符";
										break;
									}
								}
							}
						}
						
					}
				}
				
			}
		}
		
		return msg;
	}
	
	/**
	 * @deprecated:根据船公司取出数据字典校验信息，判断是否为空（物料信息）
	 * @author Colley.Bai  
	 * @date 2019年4月29日
	 * @param eoEoom2EobrModel
	 * @param ebcdName
	 * @return
	 */
	public String baseEoRequestMaterialCheck(EoEoom2EobrModel eoEoom2EobrModel,ElProtocolCostConModel elProtocolCostConModel){
		String msg = "";
		if (null != eoEoom2EobrModel && null != elProtocolCostConModel) {
			if (null != elProtocolCostConModel.getEpccElplId()) {
				if (elProtocolCostConModel.getEpccElplId() == 1) {
					if (EmptyUtils.isEmpty(eoEoom2EobrModel.getEobmHscode())) {
						msg += "HS CODE" + "、\n";
					}
				}
			}
			if (null != elProtocolCostConModel.getEpccDischargePortId()) {
				if (elProtocolCostConModel.getEpccDischargePortId() == 1) {
					if (EmptyUtils.isEmpty(eoEoom2EobrModel.getEobmDangeroseContactName())) {
						msg +="危险品"+ "联系人" + "、\n";
					}
				}
			}
			if (null != elProtocolCostConModel.getEpccTruckId()) {
				if (elProtocolCostConModel.getEpccTruckId() == 1) {
					if (EmptyUtils.isEmpty(eoEoom2EobrModel.getEobmDangeroseContactTel())) {
						msg += "危险品联系人" + "电话" + "、\n";
					}
				}
			}
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccLmId(), "1")) {
				if (EmptyUtils.isEmpty(eoEoom2EobrModel.getEobmTemperatureUnit())) {
					msg += "温度单位" + "、\n";
				}
			}
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccBmsEbsmCode(), "1")) {
				if (null == eoEoom2EobrModel.getEobmEbmaTemperatureSetting()) {
					msg += "设置温度" + "、\n";
				}
			}
			if (null != elProtocolCostConModel.getEpccIsBooking()) {
				if (elProtocolCostConModel.getEpccIsBooking() ==  1) {
					if (null == eoEoom2EobrModel.getEobmEbmaMaxTemperature()) {
						msg += "最高温度" + "、\n";
					}
				}
			}
			if (null != elProtocolCostConModel.getEpccIsTrailer()) {
				if (elProtocolCostConModel.getEpccIsTrailer() == 1) {
					if (null == eoEoom2EobrModel.getEobmEbmaMinTemperature()) {
						msg += "最低温度" + "、\n";
					}
				}
			}
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccServicesType(), "1")) {
				if (EmptyUtils.isEmpty(eoEoom2EobrModel.getEobmEbmaDgClass())) {
					msg += "危险品等级" + "、\n";
				}
			}
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccFreightClauseCode(), "1")) {
				if (EmptyUtils.isEmpty(eoEoom2EobrModel.getEobmMarinePollutantFlag())) {
					msg += "海运污染" + "、\n";
				}
			}
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccDischargePortName(), "1")) {
				if (EmptyUtils.isEmpty(eoEoom2EobrModel.getEobmDangerousLabel())) {
					msg += "危险品标签" + "、\n";
				}
			}
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccLoadPortName(), "1")) {
				if (EmptyUtils.isEmpty(eoEoom2EobrModel.getEobmEbmaUnNo())) {
					msg += "UN/NO" + "、\n";
				}
			}
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccLoadPortCode(), "1")) {
				if (EmptyUtils.isEmpty(eoEoom2EobrModel.getEobmDangerousPage())) {
					msg += "危险品页号" + "、\n";
				}
			}
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccTruckCode(), "1")) {
				if (EmptyUtils.isEmpty(eoEoom2EobrModel.getEobmDangerousEmsNo())) {
					msg += "应急措施号" + "、\n";
				}
			}
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccDischargePortCode(), "1")) {
				if (EmptyUtils.isEmpty(eoEoom2EobrModel.getEobmDangerousEmsNo())) {
					msg += "闪点" + "、\n";
				}
			}
			if (EmptyUtils.isEqual(elProtocolCostConModel.getEpccCustomsCode(), "1")) {
				if (EmptyUtils.isEmpty(eoEoom2EobrModel.getEobmMfagNo())) {
					msg += "急救指南号" + "、\n";
				}
			}
			if (null != elProtocolCostConModel.getEpccIsDeclaration()) {
				if (elProtocolCostConModel.getEpccIsDeclaration() == 1) {
					if (null == eoEoom2EobrModel.getEobmOverLengthFront()) {
						msg += "前超" + "、\n";
					}
				}
			}
			if (null != elProtocolCostConModel.getEpccConsignorEbcuId()) {
				if (elProtocolCostConModel.getEpccConsignorEbcuId() == 1) {
					if (null == eoEoom2EobrModel.getEobmOverLengthBack()) {
						msg += "后超" + "、\n";
					}
				}
			}
			if (null != elProtocolCostConModel.getEpccShipperId()) {
				if (elProtocolCostConModel.getEpccShipperId() == 1) {
					if (null == eoEoom2EobrModel.getEobmOverWidthLeft()) {
						msg += "左超" + "、\n";
					}
				}
			}
			if (null != elProtocolCostConModel.getEpccShipAgentId()) {
				if (elProtocolCostConModel.getEpccShipAgentId() == 1) {
					if (null == eoEoom2EobrModel.getEobmOverWidthRight()) {
						msg += "右超" + "、\n";
					}
				}
			}
			if (null != elProtocolCostConModel.getEpccLoadPortId()) {
				if (elProtocolCostConModel.getEpccLoadPortId()== 1) {
					if (null == eoEoom2EobrModel.getEobmOverHeight()) {
						msg += "超高" + "、\n";
					}
				}
			}
		}
		return msg;
	}
}
