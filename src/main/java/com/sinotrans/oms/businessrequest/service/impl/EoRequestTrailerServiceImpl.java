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
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alibaba.fastjson.parser.deserializer.ContextObjectDeserializer;
import com.sinotrans.framework.core.aop.BaseAspect;
import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.basicdata.manager.EbLineManager;
import com.sinotrans.oms.basicdata.model.EbLineModel;
import com.sinotrans.oms.businessrequest.dto.EoTrailerDto;
import com.sinotrans.oms.businessrequest.dto.EoTrailerModelDto;
import com.sinotrans.oms.businessrequest.manager.DpInTrackManager;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoddManager;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoetManager;
import com.sinotrans.oms.businessrequest.manager.EoFreightOmportManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestTrailerManager;
import com.sinotrans.oms.businessrequest.model.DpInTrackModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoddModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoEorb2EosrModel;
import com.sinotrans.oms.businessrequest.model.EoFreightOmportModel;
import com.sinotrans.oms.businessrequest.model.EoOutmportJoabBoxModel;
import com.sinotrans.oms.businessrequest.model.EoOutmportJoabMaterielModel;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.businessrequest.service.EoRequestBookingExportService;
import com.sinotrans.oms.businessrequest.service.EoRequestDeclarationDeputeService;
import com.sinotrans.oms.businessrequest.service.EoRequestSendEmailService;
import com.sinotrans.oms.businessrequest.service.EoRequestSendTrailerExportService;
import com.sinotrans.oms.businessrequest.service.EoRequestTrailerService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.tool.SendMailUtil;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.ChangeChar;
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
import com.sinotrans.oms.customerproject.manager.EbCustomerContactManager;
import com.sinotrans.oms.customerproject.manager.EbCustomerManager;
import com.sinotrans.oms.customerproject.model.EbCustomerContactModel;
import com.sinotrans.oms.customerproject.model.EbCustomerModel;
import com.sinotrans.oms.eoorder.manager.EoEoob2EomjManager;
import com.sinotrans.oms.eoorder.manager.EoOrderContainerManager;
import com.sinotrans.oms.eoorder.manager.EoOrderExpandAgencyManager;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.manager.EoOrderMaterielManager;
import com.sinotrans.oms.eoorder.manager.EoOrderPrecontainerManager;
import com.sinotrans.oms.eoorder.manager.EoOutmportJoabBoxManager;
import com.sinotrans.oms.eoorder.manager.EoOutmportJoabMaterielManager;
import com.sinotrans.oms.eoorder.model.EoEoob2EomjModel;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.eoorder.model.EoOrderMaterielModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.eoorder.model.EoOrderPrecontainerModel;
import com.sinotrans.oms.fees.manager.EbExchangeRateManager;
import com.sinotrans.oms.fees.model.EbExchangeRateModel;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;
import com.sinotrans.oms.fees.service.EfbfBusinessFeesService;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.system.manager.EsCompanyManager;
import com.sinotrans.oms.system.model.EsCompanyModel;

import jxl.write.WriteException;
import oracle.net.aso.f;

@Service
public class EoRequestTrailerServiceImpl extends BaseAspect implements EoRequestTrailerService {
	
	
	@Autowired
	private EoRequestTrailerManager eoRequestTrailerManager;//拖车
	@Autowired
	private EbCustomerManager ebCustomerManager;//客户供应商
	@Autowired
	private EbCustomerContactManager ebCustomerContactManager;//客户商联系人
	@Autowired
	private EoOrderContainerManager eoOrderContainerManager;//实装箱
	@Autowired
	private EoRequestSendEmailService eoRequestSendEmailService;//发送邮件
	@Autowired
	private EoFreightOmportManager eoFreightOmportManager;//业务请求
	@Autowired
	private EoOutmportJoabBoxManager eoOutmportJoabBoxManager;//出口业务箱操作表
	@Autowired
	private EoOrderManager eoOrderManager;//订单
	@Autowired
	private EoOrderExpandAgencyManager eoOrderExpandAgencyManager;//订单
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
	private EoOrderPrecontainerManager eoOrderPrecontainerManager;
	@Autowired
	private EbLineManager ebLineManager;//路线
	@Autowired
	private EsCompanyManager esCompanyManager;//获取平台
	@Autowired 
	private EbExchangeRateManager ebExchangeRateManager;//汇率表手工维护
	@Autowired
	private EoEooc2EoddManager eoEooc2EoddManager;
	@Autowired
	private EoEooc2EoetManager eoEooc2EoetManager;
	@Autowired
	private DpInTrackManager dpInTrackManager;
	@Autowired
	private EoRequestSendTrailerExportService eoRequestSendTrailerExportService;
	@Autowired
	private EoEoob2EomjManager eoEoob2EomjManager;
	@Autowired
	private EoOrderMaterielManager eoOrderMaterielManager;
	@Autowired
	private EoOutmportJoabMaterielManager eoOutmportJoabMaterielManager;
	
	@Override
	public ResponseData<EoRequestTrailerModel> saveTrailer(EoRequestTrailerModel eoRequestTrailerModel) {
		ResponseData<EoRequestTrailerModel> responseData=new ResponseData<EoRequestTrailerModel>();
		EoRequestTrailerModel requestTrailerModel=eoRequestTrailerManager.save(eoRequestTrailerModel);
		if (null == requestTrailerModel) {
			responseData.setData(eoRequestTrailerModel);
			responseData.setMsg("保存失败，请重试！");
			return responseData;
		}
		responseData.setData(requestTrailerModel);
		return responseData;
	}

	
	@Override
	public ResponseData<EoTrailerDto> saveTrailerAndMaterial(EoTrailerDto eoTrailerDto) {
		ResponseData<EoTrailerDto> responseData = new ResponseData<>();
		String msg = this.getEoetSoNoAndDoNoByEooId(eoTrailerDto);
		if (EmptyUtils.isNotEmpty(msg)) {
			responseData.setCode(Constants.NO);
			responseData.setMsg(msg);
			return responseData;
		}
		
		responseData = eoRequestTrailerManager.saveTrailerAndMaterial(eoTrailerDto);
		return responseData;
	}

	/**
	 * @deprecated:验证SO NO和DO NO和笔次不能重复
	 * @author Colley.Bai  
	 * @date 2018年12月10日
	 * @param eoTrailerDto
	 * @return
	 */
	public String getEoetSoNoAndDoNoByEooId(EoTrailerDto eoTrailerDto){
		String msg = "";
		EoRequestTrailerModel eoRequestTrailerModel = eoTrailerDto.getEoRequestTrailerModel();//原对象
		List<FilterCondition> eoRequestTrailerFilter = new ArrayList<>();
		eoRequestTrailerFilter.add(new FilterCondition("eoetEscoId",eoRequestTrailerModel.getEoetEscoId(),"="));
		eoRequestTrailerFilter.add(new FilterCondition("eoetEbpjId",eoRequestTrailerModel.getEoetEbpjId(),"="));
		eoRequestTrailerFilter.add(new FilterCondition("eoetSoNo",eoRequestTrailerModel.getEoetSoNo(),"="));
		if (EmptyUtils.isNotEmpty(eoRequestTrailerModel.getEoetDoNo())) {
			eoRequestTrailerFilter.add(new FilterCondition("eoetDoNo",eoRequestTrailerModel.getEoetDoNo(),"="));
		}
		if (EmptyUtils.isNotEmpty(eoRequestTrailerModel.getEoetOrderFudeji())) {
			eoRequestTrailerFilter.add(new FilterCondition("eoetOrderFudeji",eoRequestTrailerModel.getEoetOrderFudeji(),"="));
		}
		List<EoRequestTrailerModel> eoRequestTrailerModelList = eoRequestTrailerManager.findByCondition(eoRequestTrailerFilter);//订单所属任务
		if (null != eoRequestTrailerModel) {
			if (EmptyUtils.isNotEmpty(eoRequestTrailerModelList)) {
				for (EoRequestTrailerModel afterEoRequestTrailerModel : eoRequestTrailerModelList) {
					if (EmptyUtils.isNotEqual(afterEoRequestTrailerModel.getEoetId(), eoRequestTrailerModel.getEoetId())) {
						msg = "SO NO和DO NO和笔次不能重复";
					}
				}
			}
		}
		return msg;
		
	}
	
	@Override
	public ResponseData issuedTrailer(Long[] eoetIds) {
		ResponseData responseData = new ResponseData();
		//校验是否可下达
		String errorMessage = this.checkBeforeIssuedTrailer(eoetIds);
		if (EmptyUtils.isEmpty(errorMessage)){
			String result = eoRequestTrailerManager.issuedTrailer(eoetIds);
			if (null == result) {
				//拖车下达成功后给用户发送邮件  add by shoven 2018年10月26日15:23:50
				try {
					UserDetails user = SessionContext.getUser();
					Long userId = null;
					if (null != user) {
						userId = Long.valueOf(user.getUserId());
					}
					this.eoRequestSendEmailService.assembleIssuedTrailerEntrust(eoetIds, userId);
				} catch (WriteException e) {
					e.printStackTrace();
					log.error("拖车下达操作Excel失败" + e.getMessage());
				} catch (IOException e) {
					e.printStackTrace();
				}
				responseData.setCode(Constants.YES);
				responseData.setMsg("下达成功");
				return responseData;
			} else {
				responseData.setCode(Constants.NO);
				responseData.setMsg(result);
				return responseData;
			}
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg(errorMessage);
			return responseData;
		}
	}

	
	@Override
	public ResponseData<EoTrailerDto> getTrailerAndMaterialById(Long eoetId) {
		ResponseData<EoTrailerDto> responseData=new ResponseData<EoTrailerDto>();
		EoTrailerDto eoTrailerDto=eoRequestTrailerManager.getTrailerAndMaterialById(eoetId);
		responseData.setData(eoTrailerDto);
		return responseData;
	}


	
	@Override
	public ResponseData<QueryData> queryTrailerByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData=new ResponseData<QueryData>();
		QueryData queryData = eoRequestTrailerManager.queryTrailerByCondition(queryInfo);
		responseData.setData(queryData);
		return responseData;
	}
	
	/**
	 * 校验是否可下达的数据
	 * 1. 根据拖车ID 查询拖车信息，判断是否为未下达状态
	 * 2. 拼接错误信息返回
	 * @param eoetIds
	 * @return
	 */
	private String checkBeforeIssuedTrailer(Long[] eoetIds) {
		String errorMessagge = null;
		StringBuffer errorEoetNos = new StringBuffer();
		String errm = "";//校验拖车公司是否存在以及是否存在联系人
		if (null != eoetIds && eoetIds.length>0) {
			for (Long eoetId : eoetIds) {
				if (null!=eoetId) {
					EoRequestTrailerModel eoRequestTrailerModel = eoRequestTrailerManager.get(eoetId);
					if (null != eoRequestTrailerModel) {
						if (!Constants.SYS_TMS_STATUS_UNISSUED.equals(eoRequestTrailerModel.getEoetStatus())) {
							errorEoetNos.append(eoRequestTrailerModel.getEoetNo());
							errorEoetNos.append("\n");
						}
					}
					errm += this.checkEootCarrierEbcuContractEmail(eoRequestTrailerModel);
				}
			}
			if (null != errorEoetNos && errorEoetNos.length()>0) {
				errorMessagge = "已下达，请勿再次下达";
			}
		}
		return errorMessagge;
	}
	
	/**
	 * 校验拖车公司下是否有联系人以及邮箱
	 * @author Shoven.Jiang  
	 * @date 2018年10月14日
	 * @param eoRequestTrailerModel
	 * @return
	 */
	private String  checkEootCarrierEbcuContractEmail(EoRequestTrailerModel eoRequestTrailerModel) {
		String errm = "";
		Long ebcuId = eoRequestTrailerModel.getEoetTrailerCompanyId();
		String ebccIsDefault = "";//是否默认联系人
		String ebccEmail = "";//拖车下达需要发送邮件的地址
		EbCustomerContactModel ebCustomerContactModel = new EbCustomerContactModel();
		if (null == ebcuId) {
			errm += "拖车公司不存在，请维护！\n";
		} else {
			EbCustomerModel ebCustomerModel = this.ebCustomerManager.get(ebcuId);
			if (null == ebCustomerModel) {
				errm += "拖车公司在基础数据中不存在，请维护！\n";
			} else {
				String ebcuStatus = ebCustomerModel.getEbcuCustomerStatus();
				if (EmptyUtils.isNotEmpty(ebcuStatus) && !Constants.SYS_STATUS_ENABLE.equals(ebcuStatus)) {
					errm += "拖车公司已经停用，请查看！\n";
				} else {
					List<FilterCondition> conditions = new ArrayList<>();
					conditions.add(new FilterCondition("ebccEbcuId", ebcuId, "="));
					List<EbCustomerContactModel> ebCustomerContactModels = this.ebCustomerContactManager.findByCondition(conditions);
					if (EmptyUtils.isEmpty(ebCustomerContactModels)) {
						errm += "拖车公司联系人不存在，请维护！\n";
					} else {
						for (int i = 0; i < ebCustomerContactModels.size(); i++) {
							ebccIsDefault = ebCustomerContactModels.get(i).getEbccIsDefault();
							if (EmptyUtils.isNotEmpty(ebccIsDefault) && Constants.YES.equals(ebccIsDefault)) {
								ebccEmail = ebCustomerContactModels.get(i).getEbccEmail();
								if (EmptyUtils.isEmpty(ebccEmail)) {
									errm += "拖车公司联系人邮箱不存在，请维护！\n";
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
								errm += "拖车公司联系人邮箱不存在，请维护！\n";
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
								errm += "拖车公司联系人邮箱不存在，请维护！\n";
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
	 * 拖车下达邮件发送
	 * @author Shoven.Jiang  
	 * @date 2018年10月14日
	 */
	private void  issuedSendEmail(String email) {
		String titles = "拖车下达";
		String contents = "拖车下达内容";
		SendMailUtil sendMailUtil = new SendMailUtil();
    	String address = "lmsupport@sinotrans.com";
		sendMailUtil.setAddress(address, email, titles);
		sendMailUtil.sendEmailNotFile(contents);
	}


	@Override
	public ResponseData<List<EoRequestTrailerModel>> batchSaveTrailerAndMaterial(
			List<EoTrailerModelDto> eoRequestTrailerModelList) {
		List<EoRequestTrailerModel> list = new ArrayList<>();
		for (EoTrailerModelDto eoTrailerModelDto: eoRequestTrailerModelList) {
			EoRequestTrailerModel eoRequestTrailerModel = new EoRequestTrailerModel();
			BlukInsertUtils.copyAfterPropertiesNonNull(eoRequestTrailerModel, eoTrailerModelDto);
			if (EmptyUtils.isNotEmpty(eoRequestTrailerModel.getEoetStatus()) && Constants.SYS_TMS_STATUS_COMPLETED.equals(eoRequestTrailerModel.getEoetStatus())) {
				this.eoRequestTrailerManager.saveDpInTrack(eoRequestTrailerModel);
			}
			list.add(eoRequestTrailerModel);
		}
		List<EoRequestTrailerModel> requestTrailerModels = eoRequestTrailerManager.saveAll(list);
		ResponseData<List<EoRequestTrailerModel>> responseData=new ResponseData<List<EoRequestTrailerModel>>();
		responseData.setCode(Constants.YES);
		responseData.setData(requestTrailerModels);
		return responseData;
	}


	@Override
	public ResponseData<List<EoOrderContainerModel>> batchSaveTrailerAndEome(List<EoOrderContainerModel> eoOrderContainerModelList) {
	
		ResponseData<List<EoOrderContainerModel>> responseData=new ResponseData<List<EoOrderContainerModel>>();

		String msg  = "";
		for (EoOrderContainerModel eoOrderContainerModels : eoOrderContainerModelList) {
			if (EmptyUtils.isNotEmpty(eoOrderContainerModels.getEoocContainerNo())) {
				msg = this.getKeyString(eoOrderContainerModels.getEoocContainerNo());
			}
		}
		if (EmptyUtils.isNotEmpty(msg)){
			responseData.setCode(Constants.NO);
			responseData.setMsg(msg);
			return responseData;
		}
		
		List<EoOrderContainerModel> eoEoom2EoseModels = new ArrayList<>();
		for (EoOrderContainerModel eoOrderContainerModel: eoOrderContainerModelList) {
			EoOrderContainerModel eoOrderContainer = new EoOrderContainerModel();
			BlukInsertUtils.copyPropertiesNonNull(eoOrderContainer, eoOrderContainerModel);//去除非空，是为了防止在更新的时候有数据的被更新掉
			eoEoom2EoseModels.add(eoOrderContainer);
		}
		List<EoOrderContainerModel> requestEoEoom2EoseModels = eoOrderContainerManager.saveAll(eoEoom2EoseModels);
		
		this.updateEoEooc2EoddEoocId(requestEoEoom2EoseModels);
		
		if (EmptyUtils.isNotEmpty(requestEoEoom2EoseModels)) {
			
			for (EoOrderContainerModel eoOrderContainerModel:requestEoEoom2EoseModels){
				List<FilterCondition> eoOutmportJoabBoxCondition = new ArrayList<>();
				eoOutmportJoabBoxCondition.add(new FilterCondition("eoobEoocId",eoOrderContainerModel.getEoocId(),"="));
				List<EoOutmportJoabBoxModel> afterEoOutmportJoabBoxModelList = eoOutmportJoabBoxManager.findByCondition(eoOutmportJoabBoxCondition);
				if (EmptyUtils.isEmpty(afterEoOutmportJoabBoxModelList)) {//判断是否对应生成了业务集装箱
					//add by Colley.Bai 用于添加出口业务箱操作表
					Long eoocEoorId = eoOrderContainerModel.getEoocEoorId();
					List<FilterCondition> eoocEoorFilterCondition = new ArrayList<>();
					eoocEoorFilterCondition.add(new FilterCondition("eofoEoorId",eoocEoorId,"="));
					List<EoFreightOmportModel> eoFreightOmportModelList =  eoFreightOmportManager.findByCondition(eoocEoorFilterCondition);//查询业务表
					
					List<EoOutmportJoabBoxModel> eoOutmportJoabBoxModelList = new ArrayList<>();
					
					EoOutmportJoabBoxModel eoOutmportJoabBoxModel = new EoOutmportJoabBoxModel();
					
					//储存数据
					eoOutmportJoabBoxModel.setEoobEofoId(eoFreightOmportModelList.get(0).getEofoId());
					eoOutmportJoabBoxModel.setEoobEoocId(eoOrderContainerModel.getEoocId());
					eoOutmportJoabBoxModelList.add(eoOutmportJoabBoxModel);
					
					List<EoOutmportJoabBoxModel> requestEoOutmportJoabBoxModels = eoOutmportJoabBoxManager.saveAll(eoOutmportJoabBoxModelList);
					
					if (EmptyUtils.isEmpty(requestEoOutmportJoabBoxModels)) {
						responseData.setCode(Constants.NO);
						responseData.setMsg("出口业务箱操作表保存失败！");
						return responseData;
					}
				}
			}
			
			this.updateEoOrderContainer(requestEoEoom2EoseModels);
		}
		
		responseData.setCode(Constants.YES);
		responseData.setData(requestEoEoom2EoseModels);
		return responseData;
	}
	
	/**
	 * @deprecated:拖车集装箱同步报关集装箱
	 * @author Colley.Bai  
	 * @date 2018年12月19日
	 * @param eoOrderContainerModelList
	 */
	public void updateEoEooc2EoddEoocId(List<EoOrderContainerModel> eoOrderContainerModelList) {
		if (EmptyUtils.isNotEmpty(eoOrderContainerModelList)) {
			for (EoOrderContainerModel eoOrderContainerModel : eoOrderContainerModelList) {
				List<FilterCondition> filterConditions = new ArrayList<>();
				filterConditions.add(new FilterCondition("eocdEoocId",eoOrderContainerModel.getEoocId(),"="));
				List<EoEooc2EoddModel> eoEooc2EoddModelList = eoEooc2EoddManager.findByCondition(filterConditions);
				for (EoEooc2EoddModel eoEooc2EoddModel : eoEooc2EoddModelList) {
					eoEooc2EoddModel.setEocdCntCustomizedSize(eoOrderContainerModel.getEoocContainerType());//箱型
					eoEooc2EoddModel.setEocdContainerNo(eoOrderContainerModel.getEoocContainerNo()); //集装箱号
					if (EmptyUtils.isEqual(eoOrderContainerModel.getEoocIsLcl(), Constants.YES)){
						eoEooc2EoddModel.setEocdSubstr1("1"); //标识
					} else {
						eoEooc2EoddModel.setEocdSubstr1("0"); //标识
					}
					eoEooc2EoddModel.setEocdGrossWeight(eoOrderContainerModel.getEoocCntWeight());
					
					eoEooc2EoddManager.save(eoEooc2EoddModel);
				}
			}
		}
	}
	
	/**
	 * 校验集装箱号
	 * @author Colley.Bai  
	 * @date 2018年10月8日 下午5:58:23
	 * @param containerNoStr
	 * @return
	 */
	@Override
	public String getKeyString(String containerNoStr) {
		String msg = "";
		/*if (EmptyUtils.isNotEmpty(containerNoStr)) {*/
			Integer[] num = new Integer[11];
		    for (int i=0;i<11;i++) {
		    	num[i]=new Integer(0);
		    }
			if (containerNoStr.length() != 11) {
				msg +="请重新输入11位的集装箱号！";
				return msg;
			} else {
				String a = "^[a-zA-Z]{4}[0-9]{7}";
				Pattern p =Pattern .compile(a);
				Matcher  m = p.matcher(containerNoStr);
				if (m.matches()) {
					//序列号
					String char1=containerNoStr.substring(0,1);
					String char2=containerNoStr.substring(1,2);
					String char3=containerNoStr.substring(2,3);
					String char4=containerNoStr.substring(3,4);
					String char5=containerNoStr.substring(4,5);
					String char6=containerNoStr.substring(5,6);
					String char7=containerNoStr.substring(6,7);
					String char8=containerNoStr.substring(7,8);
					String char9=containerNoStr.substring(8,9);
					String char10=containerNoStr.substring(9,10);
					String char11=containerNoStr.substring(10,11);
					//箱号前面4个字母
					num[0]= ChangeChar.changeChar(char1);
			        num[1]= ChangeChar.changeChar(char2);
			        num[2]= ChangeChar.changeChar(char3);
			        num[3]= ChangeChar.changeChar(char4);
			        //箱号中间7个数字
			        num[4]= ChangeChar.changeChar(char5);
			        num[5]= ChangeChar.changeChar(char6);
			        num[6]= ChangeChar.changeChar(char7);
			        num[7]= ChangeChar.changeChar(char8);
			        num[8]= ChangeChar.changeChar(char9);
			        num[9]= ChangeChar.changeChar(char10);
			        //校验数字
			        num[10]= ChangeChar.changeChar(char11);
			        Integer sum=num[0]+num[1]*2+num[2]*4+num[3]*8+num[4]*16+num[5]*32+num[6]*64+num[7]*128+num[8]*256+num[9]*512;
			        int intSum = sum.intValue();
			        Integer result=intSum%11;
			        if(result == 10){
			        	result = result%10;
			        }
			        if (!result.equals(num[10])) {
			        	//msg += "集装箱号校验错误！正确的校验码为:" + result;
						return msg;
			        } else {
						return msg;
			        }
				} else{ 
					msg +="集装箱号格式不正确，前四位应为字母，后七位为数字，请重新输入！";
					return msg;
				}
			}
		/*} else {
			msg +="集装箱号不能为空！";
			return msg;
		}*/
	}

	@Override
	public ResponseData<List<EoOrderContainerModel>> deleteByIds(List<Long> eoocIds) {
		if (eoocIds != null && eoocIds.size() > 0) {
			eoOrderContainerManager.deleteByPks(eoocIds);
			ResponseData<List<EoOrderContainerModel>> responseData = new ResponseData<>();
			responseData.setData(null);
			return responseData;
		}
		return null;
	}


	@Override
	public ResponseData<EoOrderContainerModel> deleteById(Long eoocId) {
		if (eoocId != null) {
			eoOrderContainerManager.deleteByPk(eoocId);
			ResponseData<EoOrderContainerModel> responseData = new ResponseData<>();
			responseData.setData(null);
			return responseData;
		}
		return null;
	}

	@Override
	public ResponseData<List<ElProtocolCostFeelModel>> saveAutomaticChargingByEoetTrailer(Long[] eoetIds) {
		ResponseData<List<ElProtocolCostFeelModel>> responseData = new ResponseData<>();
		if (eoetIds.length > 0) {
			for (Long eoetId : eoetIds) {
				//1.获取拖车信息
				EoRequestTrailerModel eoRequestTrailerModel = eoRequestTrailerManager.get(eoetId);
				if (null != eoRequestTrailerModel) {
					//2.组装匹配协议
					List<FilterCondition> eoRequestTrailerFilterCondition = new ArrayList<>();
					//2.1 公司
					eoRequestTrailerFilterCondition.add(new FilterCondition("elplEscoId",eoRequestTrailerModel.getEoetEscoId(),"="));
					eoRequestTrailerFilterCondition.add(new FilterCondition("elplEbpjId",eoRequestTrailerModel.getEoetEbpjId(),"="));
					//2.2 拖车公司
					eoRequestTrailerFilterCondition.add(new FilterCondition("elplCustomerEbcuId",eoRequestTrailerModel.getEoetTrailerCompanyId(),"="));
					//3.获取拖车匹配的协议（拖车公司匹配协议的客商名称）
					List<ElProtocolModel> elProtocolModelList = elProtocolManager.findByCondition(eoRequestTrailerFilterCondition);
					
					if (EmptyUtils.isNotEmpty(elProtocolModelList)) {
						this.getEoTrailerAndElProtocol(eoRequestTrailerModel,elProtocolModelList);
					}
				} else {
					responseData.setCode(Constants.NO);
					responseData.setMsg("拖车信息为空");
				}
			}
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("拖车ID为空");
		}
		return responseData;
	}

	/**
	 * @deprecated:根据拖车的拖车公司匹配的协议的客商名称找到的协议
	 * @author Colley.Bai  
	 * @date 2018年11月29日
	 * @param eoRequestTrailerModel
	 * @param elProtocolModelList
	 */
	public void getEoTrailerAndElProtocol(EoRequestTrailerModel eoRequestTrailerModel,List<ElProtocolModel> elProtocolModelList){
		for (ElProtocolModel elProtocolModel : elProtocolModelList) {
			//更加精确 提高效率
			if (Constants.ELPL_TYPE_TRAILER.equals(elProtocolModel.getElplType())) {
				
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
							EoOrderModel eoOrderModel = eoOrderManager.get(eoRequestTrailerModel.getEoetEoorId());
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
										
										Double epcfPrice = this.getElelProtocolCostFeelByEpccId(elProtocolCostConModel,eoRequestTrailerModel);
										
										//1. 组装查询协议明细
										List<FilterCondition> elProtocolCostConFilterCondition = new ArrayList<>();
										//1.1 协议明细主键
										elProtocolCostConFilterCondition.add(new FilterCondition("epctId",elProtocolCostConModel.getEpccEpctId(),"="));
										//1.2 协议状态 （启用）
										elProtocolCostConFilterCondition.add(new FilterCondition("epctStatus","Y","="));
										//2.获取到协议明细信息，所谓的条件费用信息
										List<ElProtocolCostModel> elProtocolCostModelList = elProtocolCostManager.findByCondition(elProtocolCostConFilterCondition);
										
										if (EmptyUtils.isNotEmpty(elProtocolCostModelList)) {
											List<EfBusinessFeesModel> efBusinessFeesModelList = this.getEfBusinessFeesModelByEpctId(elProtocolCostModelList, epcfPrice, eoRequestTrailerModel ,elProtocolCostConModel);
											
											if (EmptyUtils.isNotEmpty(efBusinessFeesModelList)){
												ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
												try {
													responseData = efbfBusinessFeesService.batchSaveBusinessFees(efBusinessFeesModelList);
												} catch (Exception e) {
													log.error("拖车自动生成费用异常，" + responseData);
												}
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
	 * @param eoRequestTrailerModel
	 * @return
	 */
	public Double getElelProtocolCostFeelByEpccId(ElProtocolCostConModel elProtocolCostConModel,EoRequestTrailerModel eoRequestTrailerModel){
		Double epcfPrice = 0.00;
		if (null != elProtocolCostConModel) {
			//1. 组装查询计算方式数据
			List<FilterCondition> elProtocolCostConFilterCondition = new ArrayList<>();
			//1.1 条件分类主键
			elProtocolCostConFilterCondition.add(new FilterCondition("epcfEpccId",elProtocolCostConModel.getEpccId(),"="));
			//2.2 条件分类 （启用）
			elProtocolCostConFilterCondition.add(new FilterCondition("epcfStatus","Y","="));
			//2.获取属于这个条件分类的计算方式
			List<ElProtocolCostFeelModel> elProtocolCostFeelModelList = elProtocolCostFeelManager.findByCondition(elProtocolCostConFilterCondition);
			
			List<FilterCondition> eoOrderFilterCondition = new ArrayList<>();
			eoOrderFilterCondition.add(new FilterCondition("eosrEoorId",eoRequestTrailerModel.getEoetEoorId(),"="));
			//3.获取订单预配箱信息
			List<EoOrderPrecontainerModel> eoOrderPrecontainerModelList = eoOrderPrecontainerManager.findByCondition(eoOrderFilterCondition);
			
			if (EmptyUtils.isNotEmpty(elProtocolCostFeelModelList)) {
				for (ElProtocolCostFeelModel elProtocolCostFeelModel:elProtocolCostFeelModelList) {

					//4.如果是箱的时候，计算根据箱型
//					if (Constants.EPCF_FORMULA_BOX.equals(elProtocolCostFeelModel.getEpcfFormula())) {
//						if (EmptyUtils.isNotEmpty(eoOrderPrecontainerModelList)) {
//							for (EoOrderPrecontainerModel eoOrderPrecontainerModel:eoOrderPrecontainerModelList) {
//								
//								//4.1根据尺寸和箱型匹配计算方式
//								if (EmptyUtils.isEqual(elProtocolCostFeelModel.getEpcfContainerSize(), eoOrderPrecontainerModel.getEosrCntCustomized()) && EmptyUtils.isEqual(elProtocolCostFeelModel.getEpcfContainerType(), eoOrderPrecontainerModel.getEosrCntCustomizedSize())) {
//									
//									//4.2获取订单预配箱数量
//									Integer eosrCtnNumber = eoOrderPrecontainerModel.getEosrCtnNumber() == null ? 1 : eoOrderPrecontainerModel.getEosrCtnNumber();
//									Double epcfPriceBox = elProtocolCostFeelModel.getEpcfPrice() == null ? 0.00 : elProtocolCostFeelModel.getEpcfPrice();
//									epcfPrice += epcfPriceBox * eosrCtnNumber;
//								}
//							}
//						}
//					}
					//5.如果是单的时候，计算是根据1*单价
//					else if (Constants.EPCF_FORMULA_SINEGLE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
//						epcfPrice += elProtocolCostFeelModel.getEpcfPrice();
//					}
					
					//6.如果是路线的时候，计算是根据1*单价
					if (Constants.EPCF_FORMULA_ROULE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
						List<FilterCondition> eoRequestTrailerFilterCondition = new ArrayList<>();
						if (null != eoRequestTrailerModel.getEoetDeliveryPlaceId()) { 
							eoRequestTrailerFilterCondition.add(new FilterCondition("eblnStartEbrgId",eoRequestTrailerModel.getEoetDeliveryPlaceId(),"="));
						}
						if (null != eoRequestTrailerModel.getEoetCollectPortId()) {
							eoRequestTrailerFilterCondition.add(new FilterCondition("eblnEndEbrgId",eoRequestTrailerModel.getEoetCollectPortId(),"="));
						}
						List<EbLineModel> ebLineModelList = ebLineManager.findByCondition(eoRequestTrailerFilterCondition);
						if (EmptyUtils.isNotEmpty(ebLineModelList)) {
							for (EbLineModel ebLineModel : ebLineModelList) {
								epcfPrice += ebLineModel.getEblnFees();
							}
						}
					} 
					//7.一口价计算，根据1*单价
					else if (Constants.EPCF_FORMULA_PRICE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
						epcfPrice += elProtocolCostFeelModel.getEpcfPrice();
					}
				}
			}
			
		}
		return epcfPrice;
	}
	
	
	/**
	 * @deprecated:拼接费用数据
	 * @author Colley.Bai  
	 * @date 2018年11月29日
	 * @return
	 */
	public List<EfBusinessFeesModel> getEfBusinessFeesModelByEpctId(List<ElProtocolCostModel> elProtocolCostModelList,Double epcfPrice,EoRequestTrailerModel eoRequestTrailerModel,ElProtocolCostConModel elProtocolCostConModel){
		List<EfBusinessFeesModel> efBusinessFeesModelList = new ArrayList<>();
		EfBusinessFeesModel efBusinessFeesModel = new EfBusinessFeesModel();
		
		List<FilterCondition> eoOrderFilterCondition = new ArrayList<>();
		eoOrderFilterCondition.add(new FilterCondition("eosrEoorId",eoRequestTrailerModel.getEoetEoorId(),"="));
		//1.获取订单预配箱信息
		List<EoOrderPrecontainerModel> eoOrderPrecontainerModelList = eoOrderPrecontainerManager.findByCondition(eoOrderFilterCondition);
		
		List<FilterCondition> elProtocolCostConFilterCondition = new ArrayList<>();
		elProtocolCostConFilterCondition.add(new FilterCondition("epcfEpccId",elProtocolCostConModel.getEpccId(),"="));
		elProtocolCostConFilterCondition.add(new FilterCondition("epcfStatus","Y","="));
		//2.获取属于这个条件分类的计算方式
		List<ElProtocolCostFeelModel> elProtocolCostFeelModelList = elProtocolCostFeelManager.findByCondition(elProtocolCostConFilterCondition);
		
		Long number = 0L;
		
		if (EmptyUtils.isNotEmpty(elProtocolCostFeelModelList)) {
			for (ElProtocolCostFeelModel elProtocolCostFeelModel:elProtocolCostFeelModelList) {
				
				//3.如果是箱的时候，计算根据箱型
//				if (Constants.EPCF_FORMULA_BOX.equals(elProtocolCostFeelModel.getEpcfFormula())) {
//					if (EmptyUtils.isNotEmpty(eoOrderPrecontainerModelList)) {
//						for (EoOrderPrecontainerModel eoOrderPrecontainerModel :eoOrderPrecontainerModelList) {
//							number += eoOrderPrecontainerModel.getEosrCtnNumber() == null ? 0L : eoOrderPrecontainerModel.getEosrCtnNumber();
//						}
//					}
//				}
				//4.如果是单的时候，计算是根据1*单价
//				else if (Constants.EPCF_FORMULA_SINEGLE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
//					number += 1L;
//				}
				//5.如果是路线的时候，计算是根据1*单价
				if (Constants.EPCF_FORMULA_ROULE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
					List<FilterCondition> eoRequestTrailerFilterCondition = new ArrayList<>();
					if (null != eoRequestTrailerModel.getEoetDeliveryPlaceId()) { 
						eoRequestTrailerFilterCondition.add(new FilterCondition("eblnStartEbrgId",eoRequestTrailerModel.getEoetDeliveryPlaceId(),"="));
					}
					if (null != eoRequestTrailerModel.getEoetCollectPortId()) {
						eoRequestTrailerFilterCondition.add(new FilterCondition("eblnEndEbrgId",eoRequestTrailerModel.getEoetCollectPortId(),"="));
					}
					List<EbLineModel> ebLineModelList = ebLineManager.findByCondition(eoRequestTrailerFilterCondition);
					if (EmptyUtils.isNotEmpty(ebLineModelList)) {
						number += 1L;
					}
				} 
				//6.一口价计算，根据1*单价
				else if (Constants.EPCF_FORMULA_PRICE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
					number += 1L;
				}
			}
		}
		
		//获取当前用户
		UserDetails user = SessionContext.getUser();
		//获取平台
		EsCompanyModel esCompanyModel=esCompanyManager.get(Long.valueOf(user.getOrgId()));
		
		for (ElProtocolCostModel elProtocolCostModel:elProtocolCostModelList) {
			
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
				Double amount = 0.00;//单价
				if (number == 0L){
					amount = epcfPrice * number;
				} else {
					amount = epcfPrice/number;
				}
				efBusinessFeesModel.setEfbfPrice(amount);//单价
//				efBusinessFeesModel.setEfbfAmount(epcfPrice * number);
				efBusinessFeesModel.setEfbfEoorId(eoRequestTrailerModel.getEoetEoorId());//订单主键
				efBusinessFeesModel.setEfbfEscoId(eoRequestTrailerModel.getEoetEscoId());//公司主键
				efBusinessFeesModel.setEfbfQuantity(number);//数量
				efBusinessFeesModel.setEfbfExchangeRate(ebExchangeRateModelList.get(0).getEberConversionRate().doubleValue());//汇率
				//计算结算金额和含税价保留两位小数
				BigDecimal bigDecimal = new BigDecimal(epcfPrice);  
				Double  total = bigDecimal.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue(); 
				efBusinessFeesModel.setEfbfAmount(total);//结算金额
				efBusinessFeesModel.setEfbfTaxAmount(total);//含税价
				//免税
				if (elProtocolCostModel.getEpctIsDutyfree().equals(Constants.IS_DUTYFREE_STRING)) {
					efBusinessFeesModel.setEfbfTaxRate(0.00);
					efBusinessFeesModel.setEfbfTaxFee(epcfPrice);//不含税价
				}
				//非免税
				if (elProtocolCostModel.getEpctIsDutyfree().equals(Constants.NOT_DUTYFREE_STRING)) {
					Double afterAmount  = (epcfPrice) / (1 + elProtocolCostModel.getEpctTaxRate());
					BigDecimal afterBigDecimal = new BigDecimal(afterAmount);  
					Double  afterTotal = afterBigDecimal.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
					efBusinessFeesModel.setEfbfTaxFee(afterTotal);//不含税价
				}
				efBusinessFeesModelList.add(efBusinessFeesModel);
			}
		}
		return efBusinessFeesModelList;
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
	public ResponseData eoetStatusBackByEoetIds(Long[] eoetIds) {
		ResponseData responseData = new ResponseData();
		if (null != eoetIds) {
			try {
				List<FilterCondition> eootCondition = new ArrayList<>();
				eootCondition.add(new FilterCondition("eootEoetId", eoetIds, "in"));
				List<EoEooc2EoetModel> eoEooc2EoetModels = this.eoEooc2EoetManager.findByCondition(eootCondition);
				List<EoEooc2EoetModel> beforeEoEooc2EoetModels = new ArrayList<>();
				
				List<FilterCondition> eoetCondition = new ArrayList<>();
				eoetCondition.add(new FilterCondition("eoetId", eoetIds, "in"));
				List<EoRequestTrailerModel> beforeEoRequestTrailerModels = new ArrayList<>();
				List<EoRequestTrailerModel> eoRequestTrailerModels = this.eoRequestTrailerManager.findByCondition(eoetCondition);
				if (EmptyUtils.isNotEmpty(eoRequestTrailerModels)) {
					if (EmptyUtils.isNotEmpty(eoRequestTrailerModels) && Constants.SYS_STOCKIN_STATUS_COMPLETED.equals(eoRequestTrailerModels.get(0).getEoetStatus())) {
						//1、拖车已完成 回退到 拖车待反馈 
						for (EoRequestTrailerModel eoRequestTrailerModel : eoRequestTrailerModels) {
							this.updateDpInTrack(eoRequestTrailerModel);
							eoRequestTrailerModel.setEoetStatus(Constants.SYS_STOCKIN_STATUS_ISSUED);
							eoRequestTrailerModel.setEoetTaskStatus("1");
							beforeEoRequestTrailerModels.add(eoRequestTrailerModel);
						}
						List<EoRequestTrailerModel> saveAll = this.eoRequestTrailerManager.saveAll(beforeEoRequestTrailerModels);
						responseData.setCode(Constants.YES);
						responseData.setMsg("操作成功");
						responseData.setData(saveAll);
						return responseData;
					}
				} 
				if (EmptyUtils.isNotEmpty(eoRequestTrailerModels) && Constants.SYS_STOCKIN_STATUS_ISSUED.equals(eoRequestTrailerModels.get(0).getEoetStatus())) {
					//2、拖车待反馈  回退到  拖车待下达
					for (EoRequestTrailerModel eoRequestTrailerModel : eoRequestTrailerModels) {
						this.updateDpInTrack(eoRequestTrailerModel);
						
						eoRequestTrailerModel.setEoetTaskConfirmUser(null);//确认人
						eoRequestTrailerModel.setEoetTaskConfirmDate(null);//确认时间
						eoRequestTrailerModel.setEoetTaskRefuseDate(null);//回退时间
						eoRequestTrailerModel.setEoetCauseDelay(null);//延迟原因
						
						if (null != eoRequestTrailerModel) {
							List<FilterCondition> filterCondition = new ArrayList<>();
							filterCondition.add(new FilterCondition("eootEoetId",eoRequestTrailerModel.getEoetId(),"="));
							List<EoEooc2EoetModel> eoEooc2EoetModelList = eoEooc2EoetManager.findByCondition(filterCondition);
							if (EmptyUtils.isNotEmpty(eoEooc2EoetModelList)) {
								eoEooc2EoetModelList.get(0).setEootTractorEtveCard(null);//车牌号
								eoEooc2EoetModelList.get(0).setEootOutSationDate(null);//空箱出场时间
								eoEooc2EoetModelList.get(0).setEootPlanFactoryDate(null);//预计到厂时间
								eoEooc2EoetModelList.get(0).setEootActualToFactoryDate(null);//实际到厂时间
								eoEooc2EoetModelList.get(0).setEootReqArrivalDate(null);//提货完成时间
								eoEooc2EoetModelList.get(0).setEootHeavyBoxApproachDate(null);//重箱进场时间
								eoEooc2EoetModelList.get(0).setEootContainerNo(null);//集装箱号
								eoEooc2EoetModelList.get(0).setEootSealsNo(null);//铅封号
								eoEooc2EoetModelList.get(0).setEootSealsNo2(null);//铅封号2
								eoEooc2EoetModelList.get(0).setEootSealsNo3(null);//铅封号3
								eoEooc2EoetModelList.get(0).setEootVgmGrossWeight(null);//VGM重量
								eoEooc2EoetModelList.get(0).setEootCntWeight(null);//箱皮重
								
								//进口
								eoEooc2EoetModelList.get(0).setEootMainEttpName(null);//主驾驶
								eoEooc2EoetModelList.get(0).setEootEbsaTel(null);//联系电话
								eoEooc2EoetModelList.get(0).setEootOutSationDate(null);//重箱出场时间
								eoEooc2EoetModelList.get(0).setEootReqArrivalDate(null);//卸货完成时间
								eoEooc2EoetModelList.get(0).setEootHeavyBoxApproachDate(null);//空箱进场时间
								
								
								
								eoEooc2EoetManager.save(eoEooc2EoetModelList.get(0));
							}
						}
						
						eoRequestTrailerModel.setEoetStatus(Constants.SYS_STOCKIN_STATUS_UNISSUED);
						eoRequestTrailerModel.setEoetTaskStatus("0");
						beforeEoRequestTrailerModels.add(eoRequestTrailerModel);
					}
					List<EoRequestTrailerModel> saveAll = this.eoRequestTrailerManager.saveAll(beforeEoRequestTrailerModels);
					responseData.setCode(Constants.YES);
					responseData.setMsg("操作成功");
					responseData.setData(saveAll);
					return responseData;
				
				}
			} catch (Exception e) {
				responseData.setCode(Constants.NO);
				responseData.setMsg("操作失败");
				e.printStackTrace();
				return responseData;
			}
		}
		responseData.setCode(Constants.NO);
		responseData.setMsg("操作失败");
		return responseData;
	}


	@Override
	public ResponseData<EoTrailerDto> saveTrailerAndEooc(EoTrailerDto eoTrailerDto) {
		ResponseData<EoTrailerDto> responseData = new ResponseData<>();
		EoRequestTrailerModel eoRequestTrailerModel = eoTrailerDto.getEoRequestTrailerModel();
		if (EmptyUtils.isNotEmpty(eoRequestTrailerModel.getEoetStatus()) && Constants.SYS_TMS_STATUS_COMPLETED.equals(eoRequestTrailerModel.getEoetStatus())) {
			this.eoRequestTrailerManager.saveDpInTrack(eoRequestTrailerModel);
		}
		responseData = eoRequestTrailerManager.saveTrailerAndMaterial(eoTrailerDto);
		return responseData;
	}
	
	/**
	 * @deprecated:跟踪拖车状态（清空当前登录人和时间）
	 * @author Colley.Bai  
	 * @date 2018年12月26日
	 * @param eoRequestBookingModel
	 */
	public void updateDpInTrack(EoRequestTrailerModel eoRequestTrailerModel){
		List<FilterCondition> filterCondition = new ArrayList<>();
		filterCondition.add(new FilterCondition("dpitBridId",eoRequestTrailerModel.getEoetId(),"="));
		filterCondition.add(new FilterCondition("dpitOrderId",eoRequestTrailerModel.getEoetEoorId(),"="));
		if (EmptyUtils.isNotEmpty(eoRequestTrailerModel.getEoetStatus()) && Constants.SYS_STOCKIN_STATUS_COMPLETED.equals(eoRequestTrailerModel.getEoetStatus())) {
			filterCondition.add(new FilterCondition("dpitType",Constants.DPIT_TYPE_TRAILER_COMPLETE,"="));
		} else if (EmptyUtils.isNotEmpty(eoRequestTrailerModel.getEoetStatus()) && Constants.SYS_STOCKIN_STATUS_ISSUED.equals(eoRequestTrailerModel.getEoetStatus())) {
			filterCondition.add(new FilterCondition("dpitType",Constants.DPIT_TYPE_TRAILER_ISSUSED,"="));
		}
		//1.、查询是否有内部状态生成
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
	public ResponseData<Map<String, String>> exportTrailer(Long[] eoetIds) {
		ResponseData<Map<String, String>> responseData = new ResponseData<Map<String, String>>();
		Map<String,String> map = new HashMap<>();
		if (eoetIds.length > 0) {
			try {
					UserDetails user = SessionContext.getUser();
					Long userId = null;
					if (null != user) {
						userId = Long.valueOf(user.getUserId());
					}
					map = this.eoRequestSendTrailerExportService.assembleExportTrailerEntrust(eoetIds, userId);
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
			responseData.setCode(Constants.NO);
			responseData.setMsg("导出失败");
		}
		return responseData;
	}
	
	/**
	 * @deprecated:更新箱货关系
	 * @author Colley.Bai  
	 * @date 2019年1月7日
	 * @param requestEoEoom2EoseModels
	 */
	public void updateEoOrderContainer(List<EoOrderContainerModel> requestEoEoom2EoseModels){
		if (EmptyUtils.isNotEmpty(requestEoEoom2EoseModels)) {
			for (EoOrderContainerModel eoOrderContainerModel : requestEoEoom2EoseModels) {
				List<FilterCondition> eoocFilterCondition = new ArrayList<>();
				eoocFilterCondition.add(new FilterCondition("eoomEoorId",eoOrderContainerModel.getEoocEoorId(),"=")); 
				List<EoOrderMaterielModel> eoOrderMaterielModelList = eoOrderMaterielManager.findByCondition(eoocFilterCondition);
				if (eoOrderMaterielModelList.size() == 1) {
					
					List<FilterCondition> eoOutmportJoabCondition = new ArrayList<>();
					eoOutmportJoabCondition.add(new FilterCondition("eomjEoomId",eoOrderMaterielModelList.get(0).getEoomId(),"="));
					List<EoOutmportJoabMaterielModel> eoOutmportJoabMaterielModelList = eoOutmportJoabMaterielManager.findByCondition(eoOutmportJoabCondition);
					if (EmptyUtils.isEmpty(eoOutmportJoabMaterielModelList)) {
						//add by Colley.Bai 用于添加出口业务箱操作表
						Long eoocEoorId = eoOrderContainerModel.getEoocEoorId();
						List<FilterCondition> eoocEoorFilterCondition = new ArrayList<>();
						eoocEoorFilterCondition.add(new FilterCondition("eofoEoorId",eoocEoorId,"="));
						List<EoFreightOmportModel> eoFreightOmportModelList =  eoFreightOmportManager.findByCondition(eoocEoorFilterCondition);//查询业务表
						EoOutmportJoabMaterielModel eoOutmportJoabMaterielModel = new EoOutmportJoabMaterielModel();
						eoOutmportJoabMaterielModel.setEomjEofoId(eoFreightOmportModelList.get(0).getEofoId());
						eoOutmportJoabMaterielModel.setEomjEoomId(eoOrderMaterielModelList.get(0).getEoomId());
						eoOutmportJoabMaterielModel = eoOutmportJoabMaterielManager.save(eoOutmportJoabMaterielModel);
						eoOutmportJoabMaterielModelList.add(eoOutmportJoabMaterielModel);
					}
					
					List<FilterCondition> eoOutmportJoabBoxCondition = new ArrayList<>();
					eoOutmportJoabBoxCondition.add(new FilterCondition("eoobEoocId",eoOrderContainerModel.getEoocId(),"="));
					List<EoOutmportJoabBoxModel> afterEoOutmportJoabBoxModelList = eoOutmportJoabBoxManager.findByCondition(eoOutmportJoabBoxCondition);
					
					if (EmptyUtils.isNotEmpty(afterEoOutmportJoabBoxModelList) && EmptyUtils.isNotEmpty(eoOutmportJoabMaterielModelList)) {
						for (EoOutmportJoabBoxModel eoOutmportJoabBoxModel : afterEoOutmportJoabBoxModelList) {
							List<FilterCondition> eoOutmportJoabBoxFilterCondition = new ArrayList<>();
							eoOutmportJoabBoxFilterCondition.add(new FilterCondition("eoejEoobId",eoOutmportJoabBoxModel.getEoobId(),"="));
							List<EoEoob2EomjModel> eoEoob2EomjModelList = eoEoob2EomjManager.findByCondition(eoOutmportJoabBoxFilterCondition);
							if (EmptyUtils.isNotEmpty(eoEoob2EomjModelList)) {
								for (EoEoob2EomjModel eoEoob2EomjModel : eoEoob2EomjModelList) {
									Long eoocQuantity = eoOrderContainerModel.getEoocQuantity() == null ? 1 : eoOrderContainerModel.getEoocQuantity();
									eoEoob2EomjModel.setEoejQuantity(eoocQuantity.intValue());
									eoEoob2EomjModel.setEoejGrossWeight(NumberUtils.getFormatOfLength((eoOrderContainerModel.getEoocWeight() == null ? 0.00 : eoOrderContainerModel.getEoocWeight()) ,3));
									eoEoob2EomjModel.setEoejMeasurement(NumberUtils.getFormatOfLength((eoOrderContainerModel.getEoocVolume() == null ? 0.00 : eoOrderContainerModel.getEoocVolume()),3));
									eoEoob2EomjModel.setEoejEomjId(eoOutmportJoabMaterielModelList.get(0).getEomjId());
									eoEoob2EomjModel.setEoejEoobId(eoOutmportJoabBoxModel.getEoobId());
									eoEoob2EomjManager.save(eoEoob2EomjModel);
								}
							} else {
								EoEoob2EomjModel eoEoob2EomjModel = new EoEoob2EomjModel();
								Long eoocQuantity = eoOrderContainerModel.getEoocQuantity() == null ? 1 : eoOrderContainerModel.getEoocQuantity();
								eoEoob2EomjModel.setEoejQuantity(eoocQuantity.intValue());
								if (null != eoOrderContainerModel.getEoocWeight() ) {
									eoEoob2EomjModel.setEoejGrossWeight(NumberUtils.getFormatOfLength(eoOrderContainerModel.getEoocWeight() ,3));
								}
								if (null != eoOrderContainerModel.getEoocVolume()) {
									eoEoob2EomjModel.setEoejMeasurement(NumberUtils.getFormatOfLength(eoOrderContainerModel.getEoocVolume() ,3));
								}
								eoEoob2EomjModel.setEoejEomjId(eoOutmportJoabMaterielModelList.get(0).getEomjId());
								eoEoob2EomjModel.setEoejEoobId(eoOutmportJoabBoxModel.getEoobId());
								eoEoob2EomjManager.save(eoEoob2EomjModel);
							}
						}
					}
				}
			}
		}
	}


	@Override
	public ResponseData<List<EoRequestTrailerModel>> getTrailerAndMaterialByEoorId(Long eoorId) {
		ResponseData<List<EoRequestTrailerModel>> responseData = new ResponseData<>();
		if (null != eoorId) {
			List<FilterCondition> filterCondition = new ArrayList<>();
			filterCondition.add(new FilterCondition("eoetEoorId",eoorId,"="));
			List<EoRequestTrailerModel> eoRequestTrailerModelList = eoRequestTrailerManager.findByCondition(filterCondition);
			
			if (EmptyUtils.isNotEmpty(eoRequestTrailerModelList)) {
				responseData.setCode(Constants.YES);
				responseData.setData(eoRequestTrailerModelList);
			} else {
				responseData.setCode(Constants.NO);
				responseData.setMsg("查询失败，订单无拖车任务");
			}
			
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("查询失败");
		}
		return responseData;
	}
}
