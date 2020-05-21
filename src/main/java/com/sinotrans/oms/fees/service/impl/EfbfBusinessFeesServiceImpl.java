package com.sinotrans.oms.fees.service.impl;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.manager.DpInTrackManager;
import com.sinotrans.oms.businessrequest.manager.EoEorb2EosrManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestBookingManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestDeclarationDeputeManager;
import com.sinotrans.oms.businessrequest.model.DpInTrackModel;
import com.sinotrans.oms.businessrequest.model.EoEorb2EosrModel;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.businessrequest.model.EoRequestDeclarationDeputeModel;
import com.sinotrans.oms.businessrule.dto.EsControlParamQueryItem;
import com.sinotrans.oms.businessrule.manager.EsControlParamManager;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.nogenerator.NOGeneratorUtil;
import com.sinotrans.oms.common.util.BeanUtils;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.CalculateUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.common.util.NumberUtil;
import com.sinotrans.oms.common.util.NumberUtils;
import com.sinotrans.oms.contract.manager.ElProtocolCostFeelManager;
import com.sinotrans.oms.contract.manager.ElProtocolCostManager;
import com.sinotrans.oms.contract.manager.ElProtocolManager;
import com.sinotrans.oms.contract.model.ElProtocolCostConModel;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;
import com.sinotrans.oms.contract.model.ElProtocolCostModel;
import com.sinotrans.oms.contract.model.ElProtocolModel;
import com.sinotrans.oms.customerproject.manager.EbCustomerManager;
import com.sinotrans.oms.customerproject.manager.EbProjectManager;
import com.sinotrans.oms.customerproject.manager.EbProjectPlanManager;
import com.sinotrans.oms.customerproject.model.EbCustomerModel;
import com.sinotrans.oms.customerproject.model.EbProjectModel;
import com.sinotrans.oms.customerproject.model.EbProjectPlanModel;
import com.sinotrans.oms.eoorder.dto.EoFreightOmportStatusQueryItem;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.eoorder.manager.EoOrderContainerManager;
import com.sinotrans.oms.eoorder.manager.EoOrderExpandAgencyManager;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.eoorder.model.EoOrderPrecontainerModel;
import com.sinotrans.oms.eoorder.service.impl.EoOrderServiceImpl;
import com.sinotrans.oms.fees.dto.EfBmsImModelDto;
import com.sinotrans.oms.fees.dto.EfBusinessFeesForCalcuteDto;
import com.sinotrans.oms.fees.dto.SettmentCodeRequestQueryDto;
import com.sinotrans.oms.fees.manager.EbExchangeRateManager;
import com.sinotrans.oms.fees.manager.EbFeeHeadManager;
import com.sinotrans.oms.fees.manager.EfBusinessFeesManager;
import com.sinotrans.oms.fees.manager.EfBusinessFeesSettlementManager;
import com.sinotrans.oms.fees.manager.EiEoimAuditBackManager;
import com.sinotrans.oms.fees.model.EbExchangeRateModel;
import com.sinotrans.oms.fees.model.EbFeeHeadModel;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;
import com.sinotrans.oms.fees.model.EiEoimAuditBackModel;
import com.sinotrans.oms.fees.service.EfBusinessFeesContractLogisticSettlementService;
import com.sinotrans.oms.fees.service.EfbfBusinessFeesService;
import com.sinotrans.oms.fees.service.UpLoadAllToBmsThreadService;
import com.sinotrans.oms.fees.service.efBusinessFeesSettlementService;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.system.manager.EsCompanyManager;
import com.sinotrans.oms.system.manager.EsCounterManager;
import com.sinotrans.oms.system.model.EsCompanyModel;

import oracle.net.aso.r;

/**
 * 
* @ClassName: EfbfBusinessFeesServiceImpl
* @Description: 费用信息service
* @author Simon
* @date 2018年8月8日下午10:46:10
*
 */
@Service
public class EfbfBusinessFeesServiceImpl implements EfbfBusinessFeesService{
	
	
	@Autowired
	private EfBusinessFeesManager efBusinessFeesManager;
	@Autowired
	private EbFeeHeadManager ebFeeHeadManager;
	@Autowired
	private EsControlParamManager esControlParamManager;
	@Autowired
	private EoOrderManager eoOrderManager;
	@Autowired
	private EsCompanyManager esCompanyManager;
	@Autowired
	private EiEoimAuditBackManager eiEoimAuditBackManager;
	@Autowired
	private EbCustomerManager ebCustomerManager;
	@Autowired
	private CommonQueryManager commonQueryManager;
	@Autowired
	private EfBusinessFeesSettlementManager efBusinessFeesSettlementManager;
	@Autowired
	private efBusinessFeesSettlementService efBusinessFeesSettlementService;
	@Autowired
	private EoOrderExpandAgencyManager eoOrderExpandAgencyManager;
	@Autowired
	private EfBusinessFeesContractLogisticSettlementService efBusinessFeesContractLogisticSettlementService;
	@Autowired
	private UpLoadAllToBmsThreadService UpLoadAllToBmsThreadService;
	@Autowired
	private EoOrderServiceImpl EoOrderServiceImpl;
	@Autowired
	private EbProjectManager ebProjectManager;
	@Autowired
	private EsCounterManager esCounterManager;
	@Autowired
	private EbProjectPlanManager ebProjectPlanManager;
	@Autowired
	private DpInTrackManager dpInTrackManager;
	@Autowired
	private ElProtocolManager elProtocolManager; 
	@Autowired
	private ElProtocolCostManager elProtocolCostManager;
	@Autowired
	private ElProtocolCostFeelManager elProtocolCostFeelManager;
	@Autowired
	private EoRequestBookingManager eoRequestBookingManager;
	@Autowired
	private EoEorb2EosrManager eoEorb2EosrManager;
	@Autowired
	private EbExchangeRateManager ebExchangeRateManager;
	@Autowired
	private EoOrderContainerManager eoOrderContainerManager;
	@Autowired
	private EoRequestDeclarationDeputeManager eoRequestDeclarationDeputeManager;
	
	@Override
	public ResponseData<List<EfBusinessFeesModel>> batchSaveBusinessFees(List<EfBusinessFeesModel> efbfModelList) {
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		if (efbfModelList == null || efbfModelList.size() == 0) {
			responseData.setMsg("无费用数据");
			responseData.setCode(Constants.NO);
			return responseData;
		}
		//根据系统配置的控制参数，判断费用状态保存时是新增状态还是确认状态
		String autoConfirm = esControlParamManager.getIsCompanyValue(Constants.AUTO_CONFIRM);
		if (efbfModelList.get(0).getEfbfType().equals(Constants.FEE_TYPE_REP_P) || efbfModelList.get(0).getEfbfType().equals(Constants.FEE_TYPE_REP_R)) {
			List<EfBusinessFeesModel> models = new ArrayList<EfBusinessFeesModel>();
			if (efbfModelList.size() != 2) {//保证每次保存代收代付费用有且仅有一对
				responseData.setMsg("批量保存代收代付有且仅有一对费用被保存");
				responseData.setCode(Constants.NO);
				return responseData;
			}
			//1.获取深度克隆代收代付费用
			EfBusinessFeesModel modelRec = new EfBusinessFeesModel();
			EfBusinessFeesModel modelPay = new EfBusinessFeesModel();
			if (Constants.FEE_TYPE_REP_R.equals(efbfModelList.get(0).getEfbfType())) {//第一条
				BeanUtils.copyProperties(modelRec, efbfModelList.get(0));
				BeanUtils.copyProperties(modelPay, efbfModelList.get(1));
			}else{
				BeanUtils.copyProperties(modelPay, efbfModelList.get(0));
				BeanUtils.copyProperties(modelRec, efbfModelList.get(1));
			}
			if (modelRec.getEfbfPrice() == null) {
				responseData.setCode(Constants.NO);
				responseData.setMsg("价格不能为空,请维护");
				return responseData;
			}
			
			if (modelRec.getEfbfQuantity() == null) {
				responseData.setCode(Constants.NO);
				responseData.setMsg("数量不能为空,请维护");
				return responseData;
			}
			//2.设置金额相关的数字自动保存两位
			modelRec.setEfbfAmount(NumberUtils.getFormatOfLength(modelRec.getEfbfAmount()==null?0D:modelRec.getEfbfAmount(), 2));
			modelRec.setEfbfPrice(NumberUtils.getFormatOfLength(modelRec.getEfbfPrice()==null?0D:modelRec.getEfbfPrice(), 2));
			modelRec.setEfbfTaxAmount(NumberUtils.getFormatOfLength(modelRec.getEfbfTaxAmount()==null?0D:modelRec.getEfbfTaxAmount(), 2));
			modelRec.setEfbfTaxFee(NumberUtils.getFormatOfLength(modelRec.getEfbfTaxFee()==null?0D:modelRec.getEfbfTaxFee(), 2));
			modelRec.setEfbfInvoiceAmt(NumberUtils.getFormatOfLength(modelRec.getEfbfInvoiceAmt()==null?0D:modelRec.getEfbfAmount(), 2));
			modelRec.setEfbfBChargeoffAmt(NumberUtils.getFormatOfLength(modelRec.getEfbfBChargeoffAmt()==null?0D:modelRec.getEfbfAmount(), 2));
			
			modelPay.setEfbfAmount(NumberUtils.getFormatOfLength(modelPay.getEfbfAmount()==null?0D:modelRec.getEfbfAmount(), 2));
			modelPay.setEfbfPrice(NumberUtils.getFormatOfLength(modelPay.getEfbfPrice()==null?0D:modelRec.getEfbfPrice(), 2));
			modelPay.setEfbfTaxAmount(NumberUtils.getFormatOfLength(modelPay.getEfbfTaxAmount()==null?0D:modelRec.getEfbfTaxAmount(), 2));
			modelPay.setEfbfTaxFee(NumberUtils.getFormatOfLength(modelPay.getEfbfTaxFee()==null?0D:modelRec.getEfbfTaxFee(), 2));
			modelPay.setEfbfInvoiceAmt(NumberUtils.getFormatOfLength(modelPay.getEfbfInvoiceAmt()==null?0D:modelRec.getEfbfInvoiceAmt(), 2));
			modelPay.setEfbfBChargeoffAmt(NumberUtils.getFormatOfLength(modelPay.getEfbfBChargeoffAmt()==null?0D:modelRec.getEfbfBChargeoffAmt(), 2));
			
			//3.校验结算对象信息
			Map<String, Object> checkMap = new HashMap<>();
			if (modelRec.getEfbfSettlementEbcuName() != null && Constants.FEE_TYPE_REP_R.equals(modelRec.getEfbfType())) {
				//校验费用行中的结算对象是否可用
				checkMap = this.checkEbCustomerStatus(modelRec.getEfbfSettlementEbcuId());
				if (Constants.SYS_EI_Y.equals(checkMap.get("flag"))) {
					responseData.setMsg(String.valueOf(checkMap.get("msg")));
					responseData.setCode(Constants.NO);
					return responseData;
				}
				EbCustomerModel ebCustomerModel = (EbCustomerModel) checkMap.get("ebCustomerModel");
			}
			if (modelPay.getEfbfSettlementEbcuName() != null && Constants.FEE_TYPE_REP_P.equals(modelPay.getEfbfType())) {
				//校验费用行中的结算对象是否可用
				checkMap = this.checkEbCustomerStatus(modelPay.getEfbfSettlementEbcuId());
				if (Constants.SYS_EI_Y.equals(checkMap.get("flag"))) {
					responseData.setMsg(String.valueOf(checkMap.get("msg")));
					responseData.setCode(Constants.NO);
					return responseData;
				}
				EbCustomerModel ebCustomerModelPay = (EbCustomerModel) checkMap.get("ebCustomerModel");
			}
			//4.费用保存
			if (modelPay.getEfbfId() != null) {// 1、编辑的保存
				EfBusinessFeesModel modelRecCopy = this.efBusinessFeesManager.get(modelRec.getEfbfId());
				EfBusinessFeesModel modelPayCopy = this.efBusinessFeesManager.get(modelPay.getEfbfId());
				BlukInsertUtils.copyPropertiesNonNull(modelRecCopy, modelRec);
				BlukInsertUtils.copyPropertiesNonNull(modelPayCopy, modelPay);
				models.add(modelRecCopy);
				models.add(modelPayCopy);
				models = this.efBusinessFeesManager.saveAll(models);
				setEbfhIsFree(models);
				responseData.setData(models);
			} else {// 2、新增的保存(包括复制)
				List<EfBusinessFeesModel> feeModels = new ArrayList<EfBusinessFeesModel>();
				// ①代收费用
				modelRec = this.setFeeDefautInfo(modelRec,autoConfirm);
				modelRec.setEfbfType(Constants.FEE_TYPE_REP_R);
				feeModels.add(modelRec);
				// ②代付费用
				//BeanUtils.copyProperties(modelPay, entity);
				this.setFeeDefautInfo(modelPay,autoConfirm);
				modelPay.setEfbfType(Constants.FEE_TYPE_REP_P);
				feeModels.add(modelPay);
				// ③第一次保存
				feeModels = this.efBusinessFeesManager.saveAll(feeModels);
				for (EfBusinessFeesModel f : feeModels) {
					saveDpInTrack(f, Constants.DPIT_TYPE_EFBF_ADD);
				}
				// ④赋值 对应匹配费用主键EFBF_OPPOSITE_EFBF_ID 存代收主键 RR
				Long oppositeId = null;
				for (EfBusinessFeesModel fee : feeModels) {
					if (Constants.FEE_TYPE_REP_R.equals(fee.getEfbfType())) {// 获取代收费用主键值
						oppositeId = fee.getEfbfId();
						break;
					}
				}
				for (EfBusinessFeesModel fee : feeModels) {
					fee.setEfbfOppositeEfbfId(oppositeId);// EFBF_OPPOSITE_EFBF_ID
				}
				// ⑤第二次保存
				feeModels = this.efBusinessFeesManager.saveAll(feeModels);
				// ⑥设置是否免税返回前段
				this.setEbfhIsFree(feeModels);
				responseData.setData(feeModels);
			}
			
			responseData.setCode(Constants.YES);
			responseData.setMsg("保存成功");
			return responseData;
			
		} else {
			//应收/应付保存
			responseData = this.assembleEfbfListByTypeIsRAndP(efbfModelList, autoConfirm);
			return responseData;
		}
	}
	
	/**
	 * 添加费目是否免税
	 * @author Shoven.Jiang  
	 * @date 2018年10月16日
	 * @param efBusinessFeesModelList
	 */
	public void setEbfhIsFree(List<EfBusinessFeesModel> efBusinessFeesModelList) {
		for (EfBusinessFeesModel efbfModel : efBusinessFeesModelList) {
			EbFeeHeadModel ebFeeHeadModel = ebFeeHeadManager.get(efbfModel.getEfbfEbfhId());
			if (ebFeeHeadModel != null) {
				efbfModel.setEbfhIsDutyfree(ebFeeHeadModel.getEbfhIsDutyfree());
			}
		}
	}
	
	/**
	 * 重新组装代收代付费用，并对费用做初始化操作
	 * @author Shoven.Jiang  
	 * @date 2018年9月29日
	 * @return
	 */
	private Map<String, List<EfBusinessFeesModel>> assembleEfbfListByEfbfTypeIsRRAndRp () {
		List<EfBusinessFeesModel> efbfTypeIsRRList = new ArrayList<>();
		List<EfBusinessFeesModel> efbfTypeIsRPList = new ArrayList<>();
		String efbfTypeIsRR = "efbfTypeIsRR";//代收
		String efbfTypeIsRP = "efbfTypeIsRP";//代付
		Map<String, List<EfBusinessFeesModel>> efbfMap = new HashMap<>();
		return efbfMap;
	}
	
	/**
	 * 重新组装应收应付的费用
	 * @author Shoven.Jiang  
	 * @date 2018年9月29日
	 * @param efBusinessFeesModels
	 * @param AUTO_CONFIRM
	 * @return
	 */
	private ResponseData<List<EfBusinessFeesModel>> assembleEfbfListByTypeIsRAndP (List<EfBusinessFeesModel> efBusinessFeesModels, String autoConfirm) {
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		List<EfBusinessFeesModel> afterAssembleEfBusinessFeesModels = new ArrayList<>();
		for (EfBusinessFeesModel efBusinessFeesModel : efBusinessFeesModels) {
			Long efbfStatus = efBusinessFeesModel.getEfbfStatus();
			//跳过接收成功/上传成功/审核成功/上传中/确认费用,不作处理
			if (null != efBusinessFeesModel.getEfbfId() && null != efbfStatus && (Constants.EFBF_STATUS_1.equals(efbfStatus) || Constants.EFBF_STATUS_2.equals(efbfStatus) || Constants.EFBF_STATUS_3.equals(efbfStatus) || Constants.EFBF_STATUS_4.equals(efbfStatus) || Constants.EFBF_STATUS_9.equals(efbfStatus))) {
				afterAssembleEfBusinessFeesModels.add(efBusinessFeesModel);
				continue;
			}
			//费用状态为ADD(1),并且是新增费用
			if (Constants.EFBF_STATUS_0.equals(efbfStatus) && efBusinessFeesModel.getEfbfId() != null) {
				//校验费用单价/金额
				if (efBusinessFeesModel.getEfbfPrice() == null) {
					responseData.setCode(Constants.NO);
					responseData.setMsg("价格不能为空,请维护");
					return responseData;
				}
				
				if (efBusinessFeesModel.getEfbfQuantity() == null) {
					responseData.setCode(Constants.NO);
					responseData.setMsg("数量不能为空,请维护");
					return responseData;
				}
			}
			efBusinessFeesModel.setEfbfAmount(NumberUtils.getFormatOfLength(efBusinessFeesModel.getEfbfAmount()==null?0d:efBusinessFeesModel.getEfbfAmount(), 2));
			efBusinessFeesModel.setEfbfPrice(NumberUtils.getFormatOfLength(efBusinessFeesModel.getEfbfPrice()==null?0d:efBusinessFeesModel.getEfbfPrice(), 2));
			efBusinessFeesModel.setEfbfTaxAmount(NumberUtils.getFormatOfLength(efBusinessFeesModel.getEfbfTaxAmount()==null?0d:efBusinessFeesModel.getEfbfTaxAmount(), 2));
			efBusinessFeesModel.setEfbfTaxFee(NumberUtils.getFormatOfLength(efBusinessFeesModel.getEfbfTaxFee()==null?0d:efBusinessFeesModel.getEfbfTaxFee(), 2));
			efBusinessFeesModel.setEfbfInvoiceAmt(NumberUtils.getFormatOfLength(efBusinessFeesModel.getEfbfInvoiceAmt()==null?0d:efBusinessFeesModel.getEfbfInvoiceAmt(), 2));
			efBusinessFeesModel.setEfbfBChargeoffAmt(NumberUtils.getFormatOfLength(efBusinessFeesModel.getEfbfBChargeoffAmt()==null?0d:efBusinessFeesModel.getEfbfBChargeoffAmt(), 2));
			
			Map<String, Object> checkMap = new HashMap<>();//校验结算对象信息
			EbCustomerModel ebCustomerModel = new EbCustomerModel();
			if (null != efBusinessFeesModel.getEfbfSettlementEbcuId()) {
				//校验费用行中的结算对象是否可用
				checkMap = this.checkEbCustomerStatus(efBusinessFeesModel.getEfbfSettlementEbcuId());
				if (Constants.SYS_EI_Y.equals(checkMap.get("flag"))) {
					responseData.setMsg(String.valueOf(checkMap.get("msg")));
					responseData.setCode(Constants.NO);
					return responseData;
				}
				ebCustomerModel = (EbCustomerModel) checkMap.get("ebCustomerModel");
			}
			efBusinessFeesModel.setEfbfSettlementEbcuName(ebCustomerModel.getEbcuNameCn());
			//费用界面保存时，订单费用，任务费用保存 1.判断，如果是订单维度，把订单主键存在EFBF_SOURCE_ID 2.如果是任务维度，把任务类型-任务主键存在EFBF_SOURCE_ID 订单维度时存订单主键，任务维度时，存任务类型-任务主键 add by
			if (efBusinessFeesModel.getEfbfEoorId() != null && null != efBusinessFeesModel.getEfbfEbfhId()) {
				EbFeeHeadModel ebfh = ebFeeHeadManager.get(efBusinessFeesModel.getEfbfEbfhId());
				efBusinessFeesModel.setEfbfSourceId(efBusinessFeesModel.getEfbfEoorId().toString() + "-0");
				if (ebfh.getEbfhIsDutyfree() != null) {
					if (ebfh.getEbfhIsDutyfree() == 1) {
						efBusinessFeesModel.setEfbfSourceId(efBusinessFeesModel.getEfbfEoorId().toString() + "-1");
					}
				}
			}
			UserDetails user = SessionContext.getUser();
			if (efBusinessFeesModel.getEfbfId() == null) {//新增费用初始化费用参数
				efBusinessFeesModel = this.assembleEfbusinessfeesModel(efBusinessFeesModel, autoConfirm, user);
				EfBusinessFeesModel feesModel = this.efBusinessFeesManager.save(efBusinessFeesModel);
				saveDpInTrack(feesModel, Constants.DPIT_TYPE_EFBF_ADD);
				afterAssembleEfBusinessFeesModels.add(feesModel);
			} else {
				if (Constants.YES.equals(autoConfirm)) {//根据控制参数控制
					efBusinessFeesModel.setEfbfStatus(1L); // 费用状态:确认
					efBusinessFeesModel.setEfbfComfirmUserId(Long.parseLong(user.getUserId()));// 确认人id
					efBusinessFeesModel.setEfbfComfirmUser(user.getUserNameCn());// 确认人
					efBusinessFeesModel.setEfbfComfirmDate(new Date());
				}else{
					efBusinessFeesModel.setEfbfStatus(0L); // 费用状态:确认
					efBusinessFeesModel.setEfbfComfirmUserId(null);// 确认人id
					efBusinessFeesModel.setEfbfComfirmUser(null);// 确认人
					efBusinessFeesModel.setEfbfComfirmDate(null);
				}
				EfBusinessFeesModel feesModel = this.efBusinessFeesManager.save(efBusinessFeesModel);
				afterAssembleEfBusinessFeesModels.add(feesModel);
			}
			
		}
		this.setEbfhIsFree(afterAssembleEfBusinessFeesModels);
		responseData.setData(afterAssembleEfBusinessFeesModels);
		responseData.setMsg("费用保存成功");
		responseData.setCode(Constants.YES);
		return responseData;
	}
	/**
	 * 通过业务费用表中的结算对象ID去客户表中查询名称
	 * @param id
	 * @return ebcuNameCn
	 */
	private String getEfbfEbcuNameByEbcuId(Long id) {
		String ebcuNameCn = "";
		
		EbCustomerModel ebCustomer = this.ebCustomerManager.get(id);
		if (ebCustomer!=null) {
			ebcuNameCn = ebCustomer.getEbcuNameCn();
			return ebcuNameCn;
		}
		return ebcuNameCn;
	}
	/**
     * 赋值费用值
     * 
     * @param fee
     * @param entity
     */
    private void setRepFeeInfo(EfBusinessFeesModel fee, EfBusinessFeesModel entity) {
        fee.setEfbfEbfhId(entity.getEfbfEbfhId());// 费用名称id
        fee.setEfbfStatus(entity.getEfbfStatus());// 费用状态
        fee.setEfbfProperty(entity.getEfbfProperty());// 费用性质
        fee.setEfbfClearUnit(entity.getEfbfClearUnit());// 结算单位
        fee.setEfbfCurrency(entity.getEfbfCurrency());// 币种
        fee.setEfbfIsPadscost(entity.getEfbfIsPadscost());// 是否代垫费用
        fee.setEfbfOldAmount(entity.getEfbfOldAmount());// 计费金额
        fee.setEfbfAmount(entity.getEfbfAmount());// 结算金额
        fee.setEfbfPrice(entity.getEfbfPrice());// 单价
        fee.setEfbfQuantity(entity.getEfbfQuantity());// 数量
        fee.setEfbfTaxRate(entity.getEfbfTaxRate());// 税率
        fee.setEfbfTaxAmount(entity.getEfbfTaxAmount());// 含税价
        fee.setEfbfTaxFee(entity.getEfbfTaxFee());// 不含税价
        fee.setEfbfExchangeRate(entity.getEfbfExchangeRate());// 汇率
        fee.setEfbfBrTab(entity.getEfbfBrTab());// 任务请求简称
        fee.setEfbfCalculateType(entity.getEfbfCalculateType());// 计算任务类型
        fee.setEfbfRemark(entity.getEfbfRemark());// 备注
        fee.setEfbfSubstr1(entity.getEfbfSubstr1());// 备注1
        fee.setEfbfSubstr2(entity.getEfbfSubstr2());
        fee.setEfbfSubstr3(entity.getEfbfSubstr3());
        fee.setEfbfSubstr4(entity.getEfbfSubstr4());
        fee.setEfbfSubstr5(entity.getEfbfSubstr5());
        fee.setEfbfSubstr6(entity.getEfbfSubstr6());
        fee.setEfbfSubstr7(entity.getEfbfSubstr7());
        fee.setEfbfSubstr8(entity.getEfbfSubstr8());
        fee.setEfbfSubdate1(entity.getEfbfSubdate1());
        fee.setEfbfSubdate2(entity.getEfbfSubdate2());
        fee.setEfbfSubdate3(entity.getEfbfSubdate3());
        fee.setEfbfSubdate4(entity.getEfbfSubdate4());
        fee.setEfbfSubnum1(entity.getEfbfSubnum1() != null ? entity.getEfbfSubnum1().longValue() : null);
        fee.setEfbfSubnum2(entity.getEfbfSubnum2() != null ? entity.getEfbfSubnum2().longValue() : null);
        fee.setEfbfSubnum3(entity.getEfbfSubnum3() != null ? entity.getEfbfSubnum3().longValue() : null);
        fee.setEfbfSubnum4(entity.getEfbfSubnum4() != null ? entity.getEfbfSubnum4().longValue() : null);
        //add by luffy  费用变更时,需重置 
        fee.setEfbfSubstr20(null);	//开票预约号
        fee.setEfbfInvoiceAmt(null);   //开票金额
        fee.setEfbfInvoiceStatus(null);  //开票状态
        fee.setEfbfSubstr4(null);	//开票日期
        fee.setEfbfSubstr10(null);	//发票号
        fee.setEfbfBChargeoff(null);  //业务核销状态
        fee.setEfbfBChargeoffAmt(null);  //业务核销金额
        fee.setEfbfFChargeoff(null);  //财务核销状态
        fee.setEfbfFChargeoffAmt(null);  //财务核销金额
    }

    /**
     * 赋值默认值
     * 
     * @param model
     */
    private EfBusinessFeesModel setFeeDefautInfo(EfBusinessFeesModel model,String autoConfirm) {
        UserDetails user = SessionContext.getUser();
        model = this.initEfbfModel(model, user, autoConfirm);
		//按费目是否免税来保存费用的SOURCE_ID
		EbFeeHeadModel ebfh = ebFeeHeadManager.get(model.getEfbfEbfhId());
		model.setEfbfSourceId(model.getEfbfEoorId().toString() + "-0");
		if (ebfh.getEbfhIsDutyfree() != null) {
			if (ebfh.getEbfhIsDutyfree() == 1) {
				model.setEfbfSourceId(model.getEfbfEoorId().toString() + "-1");
			}
		}
		//变更状态为未变更
		model.setEfbfSubstr12(Constants.NO);
        return model;
    }
    
	
	@Override
	public ResponseData<List<EfBusinessFeesModel>> deleteBusinessFees(Long efbfId) {
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<List<EfBusinessFeesModel>>();
		if(null != efbfId){
			Collection<Long> efbfIds = new ArrayList<>();
			efbfIds.add(efbfId);
			String errorMessage = checkBeforeDelete(efbfIds);
			if(null == errorMessage){
				efBusinessFeesManager.deleteByPk(efbfId);
			}else{
				responseData.setCode(Constants.NO);
				responseData.setMsg(errorMessage);
			}
		}
		return responseData;
	}

	
	@Override
	public ResponseData batchDeteleBusinessFees(Collection<Long> efbfIds) {
		ResponseData responseData = new ResponseData();
		if(null != efbfIds){
			String errorMessage = checkBeforeDelete(efbfIds);
			if(EmptyUtils.isEmpty(errorMessage)){
				efBusinessFeesManager.deleteByPks(efbfIds);
			}else{
				responseData.setCode(Constants.NO);
				responseData.setMsg(errorMessage);
			}
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("请选择需要删除的费用");
		}
		return responseData;
	}

	
	@Override
	public ResponseData getBusinessFeesById(Long eoorId) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ResponseData<List<EfBusinessFeesModel>> queryBusinessFeesByCondition(Map<String, Object> condition) {
		List<Map<String, Object>> list = this.efBusinessFeesManager.queryByCondition("com.sinotrans.oms.eoorder.mapper.EoOrderListQuery", condition);
		List<EfBusinessFeesModel> efBusinessFeesModels = new ArrayList<>();
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		if (EmptyUtils.isEmpty(list)) {
			responseData.setData(efBusinessFeesModels);
			responseData.setCode(Constants.NO);
            return responseData;
        } 
		for (Map<String, Object> map : list) {
			responseData.setCode(Constants.YES);
			efBusinessFeesModels.add((EfBusinessFeesModel) BlukInsertUtils.parseMapToObject(map, new EoFreightOmportStatusQueryItem()));
		}
		responseData.setData(efBusinessFeesModels);
		return responseData;
	}

	
	@Override
	public ResponseData<EfBusinessFeesModel> confirmBusinessFees(Long efbfId) {
		ResponseData<EfBusinessFeesModel> responseData = new ResponseData<>();
		EfBusinessFeesModel efBusinessFeesModel = new EfBusinessFeesModel();
		efBusinessFeesModel = this.efBusinessFeesManager.get(efbfId);
		Long efbfStatus = efBusinessFeesModel.getEfbfStatus();//费用状态
		if (null == efbfStatus) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("费用状态不可为空，请维护");
			responseData.setData(efBusinessFeesModel);
			return responseData;
		}
		if (!(Constants.EFBF_STATUS_0 == efbfStatus || Constants.EFBF_STATUS_E3 == efbfStatus)) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("请选择费用状态为新增的费用行");
			responseData.setData(efBusinessFeesModel);
			return responseData;
		}
		UserDetails user = SessionContext.getUser();
		if (null != efBusinessFeesModel) {
			efBusinessFeesModel.setEfbfStatus(1L);
			if (null != user) {
				efBusinessFeesModel.setEfbfComfirmUserId(Long.parseLong(user.getUserId()));
				efBusinessFeesModel.setEfbfComfirmUser(user.getUserNameCn());
				efBusinessFeesModel.setEfbfComfirmDate(new Date());
			}
			efBusinessFeesModel = this.efBusinessFeesManager.save(efBusinessFeesModel);
		}
		responseData.setCode(Constants.YES);
		responseData.setData(efBusinessFeesModel);
		responseData.setMsg("操作成功");
		return responseData;
	}

	
	@Override
	public ResponseData batchConfirmBusinessFees(Long[] efbfIds) {
		// TODO Auto-generated method stub
		return null;
	}

	
	@Override
	public ResponseData<EfBusinessFeesModel> cancelConfirmBusinessFees(Long efbfId) {
		ResponseData<EfBusinessFeesModel> responseData = new ResponseData<>();
		EfBusinessFeesModel efBusinessFeesModel = new EfBusinessFeesModel();
		efBusinessFeesModel = this.efBusinessFeesManager.get(efbfId);
		if (null != efBusinessFeesModel) {
			Long efbfStatus = efBusinessFeesModel.getEfbfStatus();
			if (Constants.EFBF_STATUS_1 != efbfStatus) {
				responseData.setCode(Constants.NO);
				responseData.setMsg("请选择费用状态为确认的费用行");
				responseData.setData(efBusinessFeesModel);
				return responseData;
			}
			efBusinessFeesModel.setEfbfStatus(0L);
			efBusinessFeesModel = this.efBusinessFeesManager.save(efBusinessFeesModel);
		}
		responseData.setCode(Constants.YES);
		responseData.setData(efBusinessFeesModel);
		responseData.setMsg("操作成功");
		return responseData;
	}

	
	@Override
	public ResponseData batchCancelConfirmBusinessFees(Long[] efbfIds) {
		// TODO Auto-generated method stub
		return null;
	}
	
	@Override
	public ResponseData uploadCashSettlement(Long[] efbfIds) {
		// TODO Auto-generated method stub
		return null;
	}
	
	/**
	 * 删除前校验,只有新增状态才能删除
	 * @param efbfIds
	 * @return
	 */
	private String checkBeforeDelete(Collection<Long> efbfIds){
		String errorMessage=null;
		StringBuffer sb=new StringBuffer();
		if(null!=efbfIds){
			for (Long efbfId : efbfIds) {
				EfBusinessFeesModel efBusinessFeesModel = efBusinessFeesManager.get(efbfId);
				if(null != efBusinessFeesModel && null != efBusinessFeesModel.getEfbfStatus() && !(Constants.EFBF_STATUS_ADD_0.equals(efBusinessFeesModel.getEfbfStatus().toString()) || Constants.EFBF_STATUS_E3.equals(efBusinessFeesModel.getEfbfStatus()) || Constants.EFBF_STATUS_E2.equals(efBusinessFeesModel.getEfbfStatus()))){
					EbFeeHeadModel ebFeeHeadModel = ebFeeHeadManager.get(efBusinessFeesModel.getEfbfEbfhId());
					if (null != ebFeeHeadModel) {
						sb.append(ebFeeHeadModel.getEbfhNameCn());
						sb.append("\n");
					}
				}
			}
			if(sb.length()>0){
				errorMessage="费用名称为：\n"+sb.toString()+"的费用状态不是新增、接收失败、上传失败状态，不允许删除费用";
			}
		}
		
		return errorMessage;
	}
	
	public ResponseData checkFeesInvoice(Long eoorId, List<Long> eoorIds) {
		ResponseData responseData = new ResponseData();
        Date nowTime = new Date();
        String invoiceBack = esControlParamManager.getIsCompanyValue("BMSBACK_FROZENFESS");// 单票回传后费用冻结 默认-1
        String statusBack = esControlParamManager.getIsCompanyValue("BMSSTATUS_FROZENFESS");// 单票审核状态费用冻结 默认999
        // 订单费用单条的情况
        if (null != eoorId) {
            EoOrderModel orderModel = eoOrderManager.get(eoorId);
            // 改进费用新增时弹出窗比较慢的问题
            // 把原来的一条SQL查询公司代码和单票审核状态改为分别查询
            EsCompanyModel esCompanyModel = esCompanyManager.get(orderModel.getEoorEscoId());// 获取公司代码
            List<FilterCondition> conditions = new ArrayList<>();
            conditions.add(new FilterCondition("eiabEoimSourceId",String.valueOf(orderModel.getEoorId()),"="));// 订单ID
            conditions.add(new FilterCondition("eiabEscoCompanyNo",esCompanyModel.getEscoCompanyNo(),"="));// 公司编号
            conditions.add(new FilterCondition("eiabEbbuCode","OMS01","="));// 业务系统代码
			// 查询单票审核状态
            EiEoimAuditBackModel eiEoimAuditBackModel;
            List<EiEoimAuditBackModel> eoimModel = eiEoimAuditBackManager.findByCondition(conditions );
            if (null == eoimModel || eoimModel.size() == 0) {
                eiEoimAuditBackModel = new EiEoimAuditBackModel();
            } else {
                eiEoimAuditBackModel = eoimModel.get(0);
            }
            if (null != orderModel) {
                esCompanyModel = this.esCompanyManager.get(orderModel.getEoorEscoId());
                if (null != esCompanyModel) {
                    if ("INVOICE_BACK".equals(invoiceBack)) {
                    	//orderModel.getEoorFrozenfessTimelimit();//				 getEoorFrozenfessTimelimit
                        if ("INVOICE_BACK".equals(invoiceBack) && null != orderModel.getEoorFrozenfessTimelimit()
                                && nowTime.before(orderModel.getEoorFrozenfessTimelimit())) {
                            responseData.setCode(Constants.YES);
                            return responseData;
                        }
                        if (("INVOICE_BACK".equals(invoiceBack) && null == orderModel.getEoorFrozenfessTimelimit())
                                || (nowTime.after(orderModel.getEoorFrozenfessTimelimit()))) {
                        	Map<String, Object> condition = new HashMap<String, Object>();
                    		condition.put("eiibEscoCompanyNo", esCompanyModel.getEscoCompanyNo());
                    		condition.put("eiibEoimSourceId", orderModel.getEoorId());
                    		List<Map<String, Object>> list = efBusinessFeesManager.queryByCondition("com.sinotrans.oms.eoorder.mapper.EoOrderInvoiceBackQuery", condition);
                    		if (EmptyUtils.isEmpty(list)) {
                    			responseData.setCode(Constants.NO);
                    			responseData.setMsg("校验失败");
                    			return responseData;
                    		}
                        }
                    } else if ("INVOICE_BACK_R".equals(invoiceBack)) {
                        if ("INVOICE_BACK_R".equals(invoiceBack) && null != orderModel.getEoorFrozenfessTimelimit() && nowTime.before(orderModel.getEoorFrozenfessTimelimit())) {
                        	responseData.setCode(Constants.YES);
                            return responseData;
                        }
                        if (("INVOICE_BACK_R".equals(invoiceBack) && null == orderModel.getEoorFrozenfessTimelimit()) || (nowTime.after(orderModel.getEoorFrozenfessTimelimit()))) {
                        	Map<String, Object> condition = new HashMap<String, Object>();
                    		condition.put("eiibEscoCompanyNo", esCompanyModel.getEscoCompanyNo());
                    		condition.put("eiibEoimSourceId", orderModel.getEoorId());
                    		condition.put("efbfType", Constants.FEE_TYPE_R);
                    		List<Map<String, Object>> list = efBusinessFeesManager.queryByCondition("com.sinotrans.oms.eoorder.mapper.EoOrderInvoiceBackQuery", condition);
                    		List<EsControlParamQueryItem> eoOrderInvoiceBackQueryList = new ArrayList<>();
                    		/*if (EmptyUtils.isEmpty(list)) {
                    			responseData.setCode(Constants.NO);
                    			responseData.setMsg("校验失败");
                    			return responseData;
                    		}*/
                        }
                    } else if ("INVOICE_BACK_P".equals(invoiceBack)) {
                        if ("INVOICE_BACK_P".equals(invoiceBack) && null != orderModel.getEoorFrozenfessTimelimit()
                                && nowTime.before(orderModel.getEoorFrozenfessTimelimit())) {
                            responseData.setCode(Constants.YES);
                            return responseData;
                        }
                        if (("INVOICE_BACK_P".equals(invoiceBack) && null == orderModel.getEoorFrozenfessTimelimit())
                                || (nowTime.after(orderModel.getEoorFrozenfessTimelimit()))) {
                        	Map<String, Object> condition = new HashMap<String, Object>();
                    		condition.put("eiibEscoCompanyNo", esCompanyModel.getEscoCompanyNo());
                    		condition.put("eiibEoimSourceId", orderModel.getEoorId());
                    		condition.put("efbfType", Constants.FEE_TYPE_R);
                    		List<Map<String, Object>> list = efBusinessFeesManager.queryByCondition("com.sinotrans.oms.eoorder.mapper.EoOrderInvoiceBackQuery", condition);
                    		
                    		List<EsControlParamQueryItem> eoOrderInvoiceBackQueryList = new ArrayList<>();
                    		if (EmptyUtils.isEmpty(list)) {
                    			responseData.setCode(Constants.NO);
                    			responseData.setMsg("校验失败");
                    			return responseData;
                    		}
                        }
                    }

                    if ("0".equals(statusBack)) {
                        if (null != eiEoimAuditBackModel.getEiabEoimStatus()) {
                            if (eiEoimAuditBackModel.getEiabEoimStatus() == 0) {
                                if (null != orderModel.getEoorFrozenfessTimelimit()
                                        && nowTime.before(orderModel.getEoorFrozenfessTimelimit())) {
                                    responseData.setCode(Constants.YES);
                                    return responseData;
                                } else {
                                    responseData.setCode(Constants.NO);
                                    responseData.setMsg("系统订单号为" + orderModel.getEoorOrderNo() + "的单票审核状态为新增，不能操作！");
                                    return responseData;
                                }
                            }
                        }
                    } else if ("1".equals(statusBack)) {
                        if (null != eiEoimAuditBackModel.getEiabEoimStatus()) {
                            if (eiEoimAuditBackModel.getEiabEoimStatus() == 1) {
                                if (null != orderModel.getEoorFrozenfessTimelimit()
                                        && nowTime.before(orderModel.getEoorFrozenfessTimelimit())) {
                                    responseData.setCode(Constants.YES);
                                    return responseData;
                                } else {
                                    responseData.setCode(Constants.NO);
                                    responseData.setMsg("系统订单号为" + orderModel.getEoorOrderNo() + "的单票审核状态为部分确认，不能操作！");
                                    return responseData;
                                }
                            }
                        }
                    } else if ("2".equals(statusBack)) {
                        if (null != eiEoimAuditBackModel.getEiabEoimStatus()) {
                            if (eiEoimAuditBackModel.getEiabEoimStatus() == 2) {
                                if (null != orderModel.getEoorFrozenfessTimelimit()
                                        && nowTime.before(orderModel.getEoorFrozenfessTimelimit())) {
                                    responseData.setCode(Constants.YES);
                                    return responseData;
                                } else {
                                    responseData.setCode(Constants.NO);
                                    responseData.setMsg("系统订单号为" + orderModel.getEoorOrderNo() + "的单票审核状态为已确认，不能操作！");
                                    return responseData;
                                }
                            }
                        }
                    } else if ("3".equals(statusBack)) {
                        if (null != eiEoimAuditBackModel.getEiabEoimStatus()) {
                            if (eiEoimAuditBackModel.getEiabEoimStatus() == 3) {
                                if (null != orderModel.getEoorFrozenfessTimelimit()
                                        && nowTime.before(orderModel.getEoorFrozenfessTimelimit())) {
                                    responseData.setCode(Constants.YES);
                                    return responseData;
                                } else {
                                    responseData.setCode(Constants.NO);
                                    responseData.setMsg("系统订单号为" + orderModel.getEoorOrderNo() + "的单票审核状态为关闭，不能操作！");
                                    return responseData;
                                }
                            }
                        }
                    }
                }
            }
        }
        // 费用清单页面多条的情况
        if (null != eoorIds && eoorIds.size() > 0) {
            for (Long orderId : eoorIds) {
            	
                EoOrderModel orderModel = this.eoOrderManager.get(orderId);
                EsCompanyModel esCompanyModel = new EsCompanyModel();
                esCompanyModel = esCompanyManager.get(orderModel.getEoorEscoId());
                List<FilterCondition> conditions = new ArrayList<>();
                conditions.add(new FilterCondition("eiabEoimSourceId",orderModel.getEoorId(),"="));// 订单ID
                conditions.add(new FilterCondition("eiabEscoCompanyNo",esCompanyModel.getEscoCompanyNo(),"="));// 公司编号
                conditions.add(new FilterCondition("eiabEbbuCode","OMS01","="));// 业务系统代码
    			// 查询单票审核状态
                EiEoimAuditBackModel eiEoimAuditBackModel;
                List<EiEoimAuditBackModel> eoimModel = eiEoimAuditBackManager.findByCondition(conditions );
                if (null == eoimModel || eoimModel.size() == 0) {
                    eiEoimAuditBackModel = new EiEoimAuditBackModel();
                } else {
                    eiEoimAuditBackModel = eoimModel.get(0);
                }
                if (null != orderModel) {
                    esCompanyModel = this.esCompanyManager.get(orderModel.getEoorEscoId());
                    if (null != esCompanyModel) {
                        if ("INVOICE_BACK".equals(invoiceBack)) {
                            if ("INVOICE_BACK".equals(invoiceBack) && null != orderModel.getEoorFrozenfessTimelimit()
                                    && nowTime.before(orderModel.getEoorFrozenfessTimelimit())) {
                                responseData.setCode(Constants.YES);
                                return responseData;
                            }
                            if (("INVOICE_BACK".equals(invoiceBack) && null == orderModel.getEoorFrozenfessTimelimit())
                                    || (nowTime.after(orderModel.getEoorFrozenfessTimelimit()))) {
                            	Map<String, Object> condition = new HashMap<String, Object>();
                        		condition.put("eiibEscoCompanyNo", esCompanyModel.getEscoCompanyNo());
                        		condition.put("eiibEoimSourceId", orderModel.getEoorId());
                        		List<Map<String, Object>> list = efBusinessFeesManager.queryByCondition("com.sinotrans.oms.eoorder.mapper.EoOrderInvoiceBackQuery", condition);
                        		
                        		List<EsControlParamQueryItem> eoOrderInvoiceBackQueryList = new ArrayList<>();
                        		if (EmptyUtils.isEmpty(list)) {
                        			responseData.setCode(Constants.NO);
                        			responseData.setMsg("系统订单号为" + orderModel.getEoorOrderNo() + "的费用存在开票记录，不能操作！");
                        			return responseData;
                        		}
                            	
                            }
                        } else if ("INVOICE_BACK_R".equals(invoiceBack)) {
                            if ("INVOICE_BACK_R".equals(invoiceBack) && null != orderModel.getEoorFrozenfessTimelimit()
                                    && nowTime.before(orderModel.getEoorFrozenfessTimelimit())) {
                                responseData.setCode(Constants.YES);
                                return responseData;
                            }
                            if (("INVOICE_BACK_R".equals(invoiceBack) && null == orderModel.getEoorFrozenfessTimelimit())
                                    || (nowTime.after(orderModel.getEoorFrozenfessTimelimit()))) {
                            	Map<String, Object> condition = new HashMap<String, Object>();
                        		condition.put("eiibEscoCompanyNo", esCompanyModel.getEscoCompanyNo());
                        		condition.put("eiibEoimSourceId", orderModel.getEoorId());
                        		condition.put("efbfType", Constants.FEE_TYPE_R);
                        		List<Map<String, Object>> list = efBusinessFeesManager.queryByCondition("com.sinotrans.oms.eoorder.mapper.EoOrderInvoiceBackQuery", condition);
                        		
                        		List<EsControlParamQueryItem> eoOrderInvoiceBackQueryList = new ArrayList<>();
                        		if (EmptyUtils.isEmpty(list)) {
                        			responseData.setCode(Constants.NO);
                        			responseData.setMsg("系统订单号为" + orderModel.getEoorOrderNo() + "的费用存在应收开票记录，不能操作！");
                        			return responseData;
                        		}
                            }
                        } else if ("INVOICE_BACK_P".equals(invoiceBack)) {
                            if ("INVOICE_BACK_P".equals(invoiceBack) && null != orderModel.getEoorFrozenfessTimelimit()
                                    && nowTime.before(orderModel.getEoorFrozenfessTimelimit())) {
                                responseData.setCode(Constants.YES);
                                return responseData;
                            }
                            if (("INVOICE_BACK_P".equals(invoiceBack) && null == orderModel.getEoorFrozenfessTimelimit())
                                    || (nowTime.after(orderModel.getEoorFrozenfessTimelimit()))) {
                            	Map<String, Object> condition = new HashMap<String, Object>();
                        		condition.put("eiibEscoCompanyNo", esCompanyModel.getEscoCompanyNo());
                        		condition.put("eiibEoimSourceId", orderModel.getEoorId());
                        		condition.put("efbfType", Constants.FEE_TYPE_R);
                        		List<Map<String, Object>> list = efBusinessFeesManager.queryByCondition("com.sinotrans.oms.eoorder.mapper.EoOrderInvoiceBackQuery", condition);
                        		
                        		List<EsControlParamQueryItem> eoOrderInvoiceBackQueryList = new ArrayList<>();
                        		if (EmptyUtils.isEmpty(list)) {
                        			responseData.setCode(Constants.NO);
                        			responseData.setMsg("系统订单号为" + orderModel.getEoorOrderNo() + "的费用存在应付开票记录，不能操作！");
                        			return responseData;
                        		}
                            }
                        }

                        if ("0".equals(statusBack)) {
                            if (null != eiEoimAuditBackModel.getEiabEoimStatus()) {
                                if (eiEoimAuditBackModel.getEiabEoimStatus() == 0) {
                                    if (null != orderModel.getEoorFrozenfessTimelimit()
                                            && nowTime.before(orderModel.getEoorFrozenfessTimelimit())) {
                                        responseData.setCode(Constants.YES);
                                        return responseData;
                                    } else {
                                        responseData.setCode(Constants.NO);
                                        responseData.setMsg("系统订单号为" + orderModel.getEoorOrderNo() + "的单票审核状态为新增，不能操作！");
                                        return responseData;
                                    }
                                }
                            }
                        } else if ("1".equals(statusBack)) {
                            if (null != eiEoimAuditBackModel.getEiabEoimStatus()) {
                                if (eiEoimAuditBackModel.getEiabEoimStatus() == 1) {
                                    if (null != orderModel.getEoorFrozenfessTimelimit()
                                            && nowTime.before(orderModel.getEoorFrozenfessTimelimit())) {
                                        responseData.setCode(Constants.YES);
                                        return responseData;
                                    } else {
                                        responseData.setCode(Constants.NO);
                                        responseData.setMsg("系统订单号为" + orderModel.getEoorOrderNo() + "的单票审核状态为部分确认，不能操作！");
                                        return responseData;
                                    }
                                }
                            }
                        } else if ("2".equals(statusBack)) {
                            if (null != eiEoimAuditBackModel.getEiabEoimStatus()) {
                                if (eiEoimAuditBackModel.getEiabEoimStatus() == 2) {
                                    if (null != orderModel.getEoorFrozenfessTimelimit()
                                            && nowTime.before(orderModel.getEoorFrozenfessTimelimit())) {
                                        responseData.setCode(Constants.YES);
                                        return responseData;
                                    } else {
                                        responseData.setCode(Constants.NO);
                                        responseData.setMsg("系统订单号为" + orderModel.getEoorOrderNo() + "的单票审核状态为已确认，不能操作！");
                                        return responseData;
                                    }
                                }
                            }
                        } else if ("3".equals(statusBack)) {
                            if (null != eiEoimAuditBackModel.getEiabEoimStatus()) {
                                if (eiEoimAuditBackModel.getEiabEoimStatus() == 3) {
                                    if (null != orderModel.getEoorFrozenfessTimelimit()
                                            && nowTime.before(orderModel.getEoorFrozenfessTimelimit())) {
                                        responseData.setCode(Constants.YES);
                                        return responseData;
                                    } else {
                                        responseData.setCode(Constants.NO);
                                        responseData.setMsg("系统订单号为" + orderModel.getEoorOrderNo() + "的单票审核状态为关闭，不能操作！");
                                        return responseData;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        responseData.setCode(Constants.YES);
        return responseData;
	}

	@Override
	public ResponseData<List<EfBusinessFeesModel>> changeEfbfBusinessFees(
			List<EfBusinessFeesModel> efBusinessFeesModelList) {
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		
		return this.batchChangeBusinessFees(efBusinessFeesModelList);
		/*EfBusinessFeesModel entity = efBusinessFeesModelList.get(0);
		Long oldEfbfId =  entity.getEfbfId();
		entity.setEfbfId(null);
		
		EfBusinessFeesModel oldEntity = this.efBusinessFeesManager.get(oldEfbfId);
		Double evbfAmountOld = oldEntity.getEfbfAmount();
		
		Long ebfhId = oldEntity.getEfbfEbfhId();
		
		EbFeeHeadModel ebFeeHeadModel = this.ebFeeHeadManager.get(ebfhId);
		if(null!=ebFeeHeadModel.getEbfhIsDutyfree()){
			if(ebFeeHeadModel.getEbfhIsDutyfree()==1){
				if (entity.getEfbfTaxRate() != 0) {
					responseData.setMsg("免税的税率必为0");
					responseData.setCode(Constants.NO);
					return responseData;
				} 
			}
		}
		
		
		List<EfBusinessFeesModel> efbfList = new ArrayList<>();
        // 增加对结算对象的可用性校验 add by ricky 20141208
        if (entity.getEfbfSettlementEbcuId() != null) {
            EbCustomerModel ebCustomerModel = ebCustomerManager.get(entity.getEfbfSettlementEbcuId());
            if (ebCustomerModel.getEbcuCustomerStatus().equals(Constants.SYS_STATUS_DISABLE)) {
            	responseData.setCode(Constants.NO);
            	responseData.setMsg("结算对象不可用!");
                return responseData;
            }
        }
        UserDetails user = SessionContext.getUser();
        if (null != entity) {
            // Double amount = entity.getEvbfAmount() - evbfAmountOld; //费差
            entity.setEfbfAmount(oldEntity.getEfbfAmount());
            entity.setEfbfOldAmount(evbfAmountOld);// 计费金额
            // add by tom 20140211 添加含税价和不含税价的赋值 start
            if (null != entity.getEfbfTaxAmount()) {
                entity.setEfbfTaxAmount(entity.getEfbfTaxAmount());
            }
            if (null != entity.getEfbfTaxFee()) {
                entity.setEfbfTaxFee(entity.getEfbfTaxFee());
            }
            // add by tom 20140211 添加含税价和不含税价的赋值 end
            entity.setEfbfEscoId(Long.parseLong(user.getOrgId()));
            entity.setEfbfParentEfbfId(null);
            // 设置费用来源
            entity.setEfbfFeeSources(Constants.FEE_SOURCE_HAND);
            entity.setEfbfProperty(0l);// 费用性质0=原始费用1=增补费用
            entity.setEfbfStatus(1l); // 费用状态:确认
            entity.setEfbfId(null);
            entity.setEfbfComfirmUserId(Long.parseLong(user.getUserId()));// 确认人id
            entity.setEfbfComfirmUser(user.getUserNameCn());// 确认人
            entity.setEfbfComfirmDate(new Date());
            entity.setCreator(user.getUserId());
            entity.setCreateTime(new Date());
            entity.setModifier(user.getUserId());
            entity.setModifyTime(new Date());
            entity.setRecVer(null);
            entity.setEfbfHdSymbol(Constants.HD_SYMBOL_0);// 上传状态
            entity.setEfbfUploadUserId(null);// 上传人ID
            entity.setEfbfUploadUser(null);// 上传人
            entity.setEfbfUploadTime(null);// 上时间
            entity.setEfbfHdBatchnumber(null);// 上传批次
            entity.setEfbfHdFilename(null);// 上传文件名
            entity.setEfbfHdBeginprocessingtime(null);// 开始时间
            entity.setEfbfHdLastmodifiedtime(null);// 结束时间
            //add by luffy 2017.12.28 费用变更时,需重置 
            entity.setEfbfSubstr20(null);	//开票预约号
            entity.setEfbfInvoiceAmt(null);   //开票金额
            entity.setEfbfInvoiceStatus(null);  //开票状态
            entity.setEfbfSubstr4(null);	//开票日期
            entity.setEfbfSubstr10(null);	//发票号
            entity.setEfbfBChargeoff(null);  //业务核销状态
            entity.setEfbfBChargeoffAmt(null);  //业务核销金额
            entity.setEfbfFChargeoff(null);  //财务核销状态
            entity.setEfbfFChargeoffAmt(null);  //财务核销金额
            
            
            
            // 生成一条负的费用
            EfBusinessFeesModel model = new EfBusinessFeesModel();
            BeanUtils.copyProperties(model, oldEntity);
            model.setEfbfParentEfbfId(oldEntity.getEfbfParentEfbfId());
            model.setEfbfEoorId(oldEntity.getEfbfEoorId());
            model.setEfbfAmount(-evbfAmountOld);
            if (null != oldEntity.getEfbfQuantity() && null != oldEntity.getEfbfPrice()) {
                model.setEfbfPrice(-(evbfAmountOld / oldEntity.getEfbfQuantity()));
                model.setEfbfOldAmount(-evbfAmountOld);
            }
            model.setEfbfTaxAmount(-evbfAmountOld);
            model.setEfbfTaxFee(CalculateUtils.getRound2(-evbfAmountOld * 1.0 / (1 + oldEntity.getEfbfTaxRate())));
            model.setEfbfEscoId(Long.parseLong(user.getOrgId()));
            // 设置费用来源
            model.setEfbfFeeSources(Constants.FEE_SOURCE_HAND);
            model.setEfbfProperty(1l);// 费用性质0=原始费用1=增补费用
            model.setEfbfStatus(1l); // 费用状态:确认
            model.setEfbfId(null);
            model.setEfbfComfirmUserId(Long.parseLong(user.getUserId()));// 确认人id
            model.setEfbfComfirmUser(user.getUserNameCn());// 确认人
            model.setEfbfComfirmDate(new Date());
            model.setCreator(user.getUserId());
            model.setCreateTime(new Date());
            model.setModifier(user.getUserId());
            model.setModifyTime(new Date());
            model.setRecVer(null);
            model.setEfbfHdSymbol(Constants.HD_SYMBOL_0);// 上传状态
            model.setEfbfUploadUserId(null);// 上传人ID
            model.setEfbfUploadUser(null);// 上传人
            model.setEfbfUploadTime(null);// 上时间
            model.setEfbfHdBatchnumber(null);// 上传批次
            model.setEfbfHdFilename(null);// 上传文件名
            model.setEfbfHdBeginprocessingtime(null);// 开始时间
            model.setEfbfHdLastmodifiedtime(null);// 结束时间
            //add by luffy 2017.12.28 费用变更时,需重置  
            model.setEfbfSubstr20(null);	//开票预约号
            model.setEfbfInvoiceAmt(null);   //开票金额
            model.setEfbfInvoiceStatus(null);  //开票状态
            model.setEfbfSubstr4(null);	//开票日期
            model.setEfbfSubstr10(null);	//发票号
            model.setEfbfBChargeoff(null);  //业务核销状态
            model.setEfbfBChargeoffAmt(null);  //业务核销金额
            model.setEfbfFChargeoff(null);  //财务核销状态
            model.setEfbfFChargeoffAmt(null);  //财务核销金额
            // 根据费目是否免税生成SOURCE_ID
            EbFeeHeadModel ebfh = ebFeeHeadManager.get(model.getEfbfEbfhId());
            model.setEfbfSourceId(model.getEfbfEoorId().toString() + "-0");
            if (ebfh.getEbfhIsDutyfree() != null) {
                if (ebfh.getEbfhIsDutyfree() == 1) {
                    model.setEfbfSourceId(model.getEfbfEoorId().toString() + "-1");
                }
            }
            model.setEfbfSubstr11("N");//费用变更时是否提交结算单状态值为N
            if (model.getEfbfAmount() != 0) {
            	efbfList.add(this.efBusinessFeesManager.save(model));
            }
        }
        
         * 费用界面保存时，订单费用，任务费用保存 1.判断，如果是订单维度，把订单主键存在EFBF_SOURCE_ID 2.如果是任务维度，把任务类型-任务主键存在EFBF_SOURCE_ID 订单维度时存订单主键，任务维度时，存任务类型-任务主键 add by
         * Nix 20150918
         
        // 根据费目是否免税生成SOURCE_ID
        EbFeeHeadModel ebfh = ebFeeHeadManager.get(entity.getEfbfEbfhId());
        entity.setEfbfSourceId(entity.getEfbfEoorId().toString() + "-0");
        if (ebfh.getEbfhIsDutyfree() != null) {
            if (ebfh.getEbfhIsDutyfree() == 1) {
                entity.setEfbfSourceId(entity.getEfbfEoorId().toString() + "-1");
            }
        }
        entity = this.efBusinessFeesManager.save(entity);
        efbfList.add(entity);
        
        responseData.setData(efbfList);
        responseData.setCode(Constants.YES);
        responseData.setMsg("费用变更保存成功");
        return responseData;*/
	}
	@Override
	public ResponseData<EbFeeHeadModel> getFeeHeadById(Long ebfhId){
		ResponseData<EbFeeHeadModel> responseData = new ResponseData<>();
		EbFeeHeadModel efbfModel = ebFeeHeadManager.get(ebfhId);
		responseData.setCode(Constants.YES);
		responseData.setMsg("查询成功");
		responseData.setData(efbfModel);
		return responseData;
	}
	
	@Override
	public ResponseData<QueryData> queryOrderByCondition(QueryInfo queryInfo) {
		queryInfo.setQueryType("com.sinotrans.oms.eoorder.mapper.EoOrderListQuery");
		ResponseData<QueryData> responseData = new ResponseData<>();
		responseData.setData(commonQueryManager.query(queryInfo));
		responseData.setCode(Constants.YES);
		responseData.setMsg("查询成功");
		return responseData;
	}
	
	/**
	 * 对订单费用进行重新组装
	 * @author Shoven.Jiang  
	 * @date 2018年9月29日
	 * @param efBusinessFeesModel
	 * @return
	 */
	private EfBusinessFeesModel assembleEfbusinessfeesModel (EfBusinessFeesModel efBusinessFeesModel, String autoConfirm, UserDetails user) {
		efBusinessFeesModel = this.initEfbfModel(efBusinessFeesModel, user, autoConfirm);
		return efBusinessFeesModel;
	}
	
	/**
	 * 校验费用行中的结算对象是否可用
	 * @author Shoven.Jiang  
	 * @date 2018年9月29日
	 * @param ebcuId
	 * @return
	 */
	private Map<String, Object> checkEbCustomerStatus (Long ebcuId) {
		Map<String, Object> checkMap = new HashMap<>();
		String msg = null;//用来收集客户供应商的校验信息
		if (null != ebcuId) {
			EbCustomerModel ebCustomerModel = this.ebCustomerManager.get(ebcuId);
			String ebcuStatus = ebCustomerModel.getEbcuCustomerStatus();//客户供应商状态
			if (EmptyUtils.isEmpty(ebcuStatus)) {
				msg = "结算对象状态为空，请维护！";
			} else if (Constants.SYS_STATUS_DISABLE.equals(ebcuStatus)) {
				msg = "结算对象不可用，请重新选择！";
			}
			if (EmptyUtils.isNotEmpty(msg)) {
				checkMap.put("flag", "Y");
				checkMap.put("msg", msg);
			} else {
				checkMap.put("flag", "N");
			}
			checkMap.put("ebCustomerModel", ebCustomerModel);
		}
		return checkMap;
	}

	@Override
	public ResponseData<List<EfBusinessFeesModel>> batchCancelConfirmBusinessFees(Collection<Long> efbfIds) {
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		
		String efbfType = "";
		for (Long efbfId : efbfIds) {
			EfBusinessFeesModel fee = efBusinessFeesManager.get(efbfId);
			if (fee != null) {
				efbfType = fee.getEfbfType();
				break;
			}
		}
		List<EfBusinessFeesModel> afterEfBusinessFeesModels = new ArrayList<>();
		List<EfBusinessFeesModel> efBusinessFeesModels = new ArrayList<>();
		List<Long> afterEfbfIds = new ArrayList<>();
		if (!"".equals(efbfType) && ("R".equals(efbfType)|| "P".equals(efbfType))) {
			List<FilterCondition> efbfCondition = new ArrayList<>();
			efbfCondition.add(new FilterCondition("efbfId", efbfIds, "in"));
			efBusinessFeesModels = this.efBusinessFeesManager.findByCondition(efbfCondition);
			for (int i = 0; i < efBusinessFeesModels.size(); i++) {
				afterEfbfIds.add(efBusinessFeesModels.get(i).getEfbfId());
			}
		}else if (!"".equals(efbfType) && ("RR".equals(efbfType)|| "RP".equals(efbfType))) {
			Set<Long> efbfOppositeEfbfIds = new HashSet<>();
			Set<Long> eoorIds = new HashSet<>();
			for (Long efbfId : efbfIds) {
				EfBusinessFeesModel efbf = efBusinessFeesManager.get(efbfId);
				efbfOppositeEfbfIds.add(efbf.getEfbfOppositeEfbfId());
				eoorIds.add(efbf.getEfbfEoorId());
			}
			//如果存在代收代付的费用需要对代收代付的费用做进一步处理
			List<EfBusinessFeesModel> efBusinessFeesModelsRep = new ArrayList<>();
			List<FilterCondition> efbfRepCondition = new ArrayList<>();
			efbfRepCondition.add(new FilterCondition("efbfOppositeEfbfId", efbfOppositeEfbfIds, "in"));
			efbfRepCondition.add(new FilterCondition("efbfEoorId", eoorIds, "in"));
			efBusinessFeesModelsRep = this.efBusinessFeesManager.findByCondition(efbfRepCondition);
			for (EfBusinessFeesModel efBusinessFeesModel : efBusinessFeesModelsRep) {
				if (!afterEfbfIds.contains(efBusinessFeesModel.getEfbfId())) {
					efBusinessFeesModels.add(efBusinessFeesModel);
				}
			}
		}
		setEbfhIsFree(efBusinessFeesModels);
		if (EmptyUtils.isNotEmpty(efBusinessFeesModels)) {
			for (EfBusinessFeesModel efBusinessFeesModel : efBusinessFeesModels) {
				Long efbfStatus = efBusinessFeesModel.getEfbfStatus();
				if (Constants.EFBF_STATUS_1 != efbfStatus) {
					responseData.setCode(Constants.NO);
					responseData.setMsg("请选择费用状态为确认的费用行");
					responseData.setData(efBusinessFeesModels);
					return responseData;
				}
				efBusinessFeesModel.setEfbfStatus(0L);
				afterEfBusinessFeesModels.add(efBusinessFeesModel);
			}
			afterEfBusinessFeesModels = this.efBusinessFeesManager.saveAll(afterEfBusinessFeesModels);
		}
		setEbfhIsFree(afterEfBusinessFeesModels);
		responseData.setCode(Constants.YES);
		responseData.setData(afterEfBusinessFeesModels);
		responseData.setMsg("操作成功");
		return responseData;
	}

	@Override
	public ResponseData<List<EfBusinessFeesModel>> batchConfirmBusinessFees(Collection<Long> efbfIds) {
		String efbfType = "";
		for (Long efbfId : efbfIds) {
			EfBusinessFeesModel fee = efBusinessFeesManager.get(efbfId);
			if (fee != null) {
				efbfType = fee.getEfbfType();
				break;
			}
		}
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		String errm = "";//收集费用确认错误信息
		List<EfBusinessFeesModel> efBusinessFeesModels = new ArrayList<>();
		List<EfBusinessFeesModel> afterEfBusinessFeesModels = new ArrayList<>();
		List<Long> afterEfbfIds = new ArrayList<>();
		if (!"".equals(efbfType) && ("R".equals(efbfType)|| "P".equals(efbfType))) {
			List<FilterCondition> efbfCondition = new ArrayList<>();
			efbfCondition.add(new FilterCondition("efbfId", efbfIds, "in"));
			efBusinessFeesModels = this.efBusinessFeesManager.findByCondition(efbfCondition);
			for (int i = 0; i < efBusinessFeesModels.size(); i++) {
				afterEfbfIds.add(efBusinessFeesModels.get(i).getEfbfId());
			}
		}else if (!"".equals(efbfType) && ("RR".equals(efbfType)|| "RP".equals(efbfType))) {
			Set<Long> efbfOppositeEfbfIds = new HashSet<>();
			Set<Long> eoorIds = new HashSet<>();
			for (Long efbfId : efbfIds) {
				EfBusinessFeesModel efbf = efBusinessFeesManager.get(efbfId);
				efbfOppositeEfbfIds.add(efbf.getEfbfOppositeEfbfId());
				eoorIds.add(efbf.getEfbfEoorId());
			}
			//如果存在代收代付的费用需要对代收代付的费用做进一步处理
			List<EfBusinessFeesModel> efBusinessFeesModelsRep = new ArrayList<>();
			List<FilterCondition> efbfRepCondition = new ArrayList<>();
			efbfRepCondition.add(new FilterCondition("efbfOppositeEfbfId", efbfOppositeEfbfIds, "in"));
			efbfRepCondition.add(new FilterCondition("efbfEoorId", eoorIds, "in"));
			efBusinessFeesModelsRep = this.efBusinessFeesManager.findByCondition(efbfRepCondition);
			for (EfBusinessFeesModel efBusinessFeesModel : efBusinessFeesModelsRep) {
				if (!afterEfbfIds.contains(efBusinessFeesModel.getEfbfId())) {
					efBusinessFeesModels.add(efBusinessFeesModel);
				}
			}
		}
		
		this.setEbfhIsFree(efBusinessFeesModels);
		for (int i = 0; i < efBusinessFeesModels.size(); i++) {
			Long efbfStatus = efBusinessFeesModels.get(i).getEfbfStatus();//费用状态
			if (null == efbfStatus) {
				responseData.setCode(Constants.NO);
				responseData.setMsg("费用状态不可为空，请维护");
				responseData.setData(efBusinessFeesModels);
				return responseData;
			}
			//费用状态为确认，上传成功，上传中，接收成功，审核成功的费用不允许进行费用确认
			if ((Constants.EFBF_STATUS_1 == efbfStatus || Constants.EFBF_STATUS_2 == efbfStatus || Constants.EFBF_STATUS_3 == efbfStatus || Constants.EFBF_STATUS_4 == efbfStatus)) {
				responseData.setCode(Constants.NO);
				responseData.setMsg("请选择费用状态为新增、接收失败、审核失败、上传失败的费用行");
				responseData.setData(efBusinessFeesModels);
				return responseData;
			}
		}
		UserDetails user = SessionContext.getUser();
		if (EmptyUtils.isNotEmpty(efBusinessFeesModels)) {
			for (EfBusinessFeesModel efBusinessFeesModel : efBusinessFeesModels) {
				efBusinessFeesModel.setEfbfStatus(1L);
				if (null != user) {
					efBusinessFeesModel.setEfbfComfirmUserId(Long.parseLong(user.getUserId()));
					efBusinessFeesModel.setEfbfComfirmUser(user.getUserNameCn());
					efBusinessFeesModel.setEfbfComfirmDate(new Date());
				}
				afterEfBusinessFeesModels.add(efBusinessFeesModel);
			}
			afterEfBusinessFeesModels = this.efBusinessFeesManager.saveAll(afterEfBusinessFeesModels);
		}
		this.setEbfhIsFree(afterEfBusinessFeesModels);
		responseData.setCode(Constants.YES);
		responseData.setData(afterEfBusinessFeesModels);
		responseData.setMsg("操作成功");
		return responseData;
	}
	@Override
	public ResponseData<List<EfBusinessFeesModel>> getBusinessFeesByEoorId(Long eoorId, String efbfType) {
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<List<EfBusinessFeesModel>>();
		List<EfBusinessFeesModel> efBusinessFeesModels = new ArrayList<>();
		//判断订单id是不是空的
		if (null == eoorId) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单主键为空，请重新查询");
			return responseData;
		}
		//判断所需要查询的费用类型    efbfType ：R  应收  P：应付   RP：代收代付   N：忽略费用类型的，查询出该订单下所有的费用
		if (EmptyUtils.isEmpty(efbfType)) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("请输入您需要查询的费用类型");
			return responseData;
		}
		//查询应收费用
		if (Constants.FEE_TYPE_R.equals(efbfType)) {
			List<FilterCondition> efbfConditionR = new ArrayList<>();
			efbfConditionR.add(new FilterCondition("efbfType", Constants.FEE_TYPE_R, "="));
			efbfConditionR.add(new FilterCondition("efbfEoorId", eoorId, "="));
			efBusinessFeesModels = this.efBusinessFeesManager.findByCondition(efbfConditionR);
		}
		
		//查询应付费用
		if (Constants.FEE_TYPE_P.equals(efbfType)) {
			List<FilterCondition> efbfConditionP = new ArrayList<>();
			efbfConditionP.add(new FilterCondition("efbfType", Constants.FEE_TYPE_P, "="));
			efbfConditionP.add(new FilterCondition("efbfEoorId", eoorId, "="));
			efBusinessFeesModels = this.efBusinessFeesManager.findByCondition(efbfConditionP);
		}
		
		//查询代收代付费用
		if (Constants.FEE_TYPE_REP_P.equals(efbfType) || Constants.FEE_TYPE_REP_R.equals(efbfType)) {
			Collection<String> efbfTypes = new ArrayList<>();
			efbfTypes.add(Constants.FEE_TYPE_REP_P);
			efbfTypes.add(Constants.FEE_TYPE_REP_R);
			List<FilterCondition> efbfConditionRP = new ArrayList<>();
			efbfConditionRP.add(new FilterCondition("efbfType", efbfTypes, "in"));
			efbfConditionRP.add(new FilterCondition("efbfEoorId", eoorId, "="));
			efBusinessFeesModels = this.efBusinessFeesManager.findByCondition(efbfConditionRP);
		}
		
		//查询该订单下所有费用
		if (Constants.FEE_TYPE_N.equals(efbfType)) {
			List<FilterCondition> efbfCondition = new ArrayList<>();
			efbfCondition.add(new FilterCondition("efbfEoorId", eoorId, "="));
			efBusinessFeesModels = this.efBusinessFeesManager.findByCondition(efbfCondition);
		}
		setEbfhIsFree(efBusinessFeesModels);
		responseData.setCode(Constants.YES);
		responseData.setData(efBusinessFeesModels);
		return responseData;
	}

	@Override
	public ResponseData submitSettlementSheet(Collection<Long> efbfIds, String efbfType) {
		ResponseData responseData = new ResponseData<>();
		List<SettmentCodeRequestQueryDto> settmentCodeRequestQueryDtos = new ArrayList<>();
		ResponseData<List<SettmentCodeRequestQueryDto>> responseDataDto = new ResponseData<>();
		Map<String, Object> conditions = new HashMap<>();
		Long [] efbfIdsArray = efbfIds.toArray(new Long [efbfIds.size()]);
		conditions.put("efbfIds", efbfIdsArray);
		//提交结算单校验所选费用行是否是相同结算对象，费用类型，币种，税率是否一致    并且组装费用信息
		responseDataDto = this.efBusinessFeesSettlementManager.submitSettlementSheet(conditions, efbfIds);
		if (Constants.NO.equals(responseDataDto.getCode())) {
			return responseDataDto;
		}
		settmentCodeRequestQueryDtos = responseDataDto.getData();
		responseData = this.efBusinessFeesSettlementService.assembleEfbfInformation(efbfIds, settmentCodeRequestQueryDtos);
		return responseData;
	}

	@Override
	public ResponseData<EfBusinessFeesForCalcuteDto> getSettlementFeesSumInfo(Long eoorId) {
		ResponseData<EfBusinessFeesForCalcuteDto> responseData = new  ResponseData<>();
        Double payAcountFee = 0d;// 应付（不含税折本位币）
        Double recAcountFee = 0d;// 应收（不含税折本位币）
        Double payAcount = 0d;// 应收
        Double recAcount = 0d;// 应收
        Double profitAcountFee = 0d;// 利润（不含税折本位币）
        Double profitAcount = 0d;// 利润（不含税折本位币）
        EfBusinessFeesForCalcuteDto sumEntity = new EfBusinessFeesForCalcuteDto();
        
        List<FilterCondition> conditions = new ArrayList<>();
        conditions.add(new FilterCondition("efbfEoorId",eoorId,"="));
		List<EfBusinessFeesModel> listFeesSum = this.efBusinessFeesManager.findByCondition(conditions );
       
        if (EmptyUtils.isNotEmpty(listFeesSum)) {
            for (EfBusinessFeesModel item : listFeesSum) {
                decimalFor(item);// 小数点保留后两位
                // 根据金额判断是否开票和是否核销 add by krik
                if (Constants.FEE_TYPE_P.equals(item.getEfbfType())) {// 应付费用
                    // 含税应付
                    payAcount +=
                            (item.getEfbfAmount() != null ? item.getEfbfAmount() : 0d)
                                    /(1+ (item.getEfbfTaxRate() != null ? item.getEfbfTaxRate() : 0d))*(item.getEfbfExchangeRate()!= null ? item.getEfbfExchangeRate(): 1d);
                    
                    // 应付 = 结算金额*汇率 + 结算金额*汇率 ....
                    payAcountFee +=
                            (item.getEfbfAmount() != null ? item.getEfbfAmount() : 0d)*(item.getEfbfExchangeRate()!= null ? item.getEfbfExchangeRate(): 1d);

                } else if (Constants.FEE_TYPE_R.equals(item.getEfbfType())) {// 应收费用
                	recAcount +=
                            (item.getEfbfAmount() != null ? item.getEfbfAmount() : 0d)
                                    / (1+ (item.getEfbfTaxRate() != null ? item.getEfbfTaxRate() : 0d))*(item.getEfbfExchangeRate()!= null ? item.getEfbfExchangeRate(): 1d);
                    // 应收 = 结算金额*汇率 + 结算金额*汇率 ....
                	recAcountFee +=
                            (item.getEfbfAmount() != null ? item.getEfbfAmount() : 0d)*(item.getEfbfExchangeRate()!= null ? item.getEfbfExchangeRate(): 1d);
                }

            }
            profitAcountFee = recAcountFee - payAcountFee;// 利润（不含税折本位币） = 应收（不含税折本位币） - 应付（不含税折本位币）
            profitAcount = recAcount - payAcount;// 利润 = 应收 - 应付
        
        }
        
        /*sumEntity.setPayAcountFee(CalculateUtils.getRound2(payAcountFee).toString());
        sumEntity.setRecAcountFee(CalculateUtils.getRound2(recAcountFee).toString());
        sumEntity.setPayAcount(CalculateUtils.getRound2(payAcount).toString());
        sumEntity.setRecAcount(CalculateUtils.getRound2(recAcount).toString());
        sumEntity.setProfitFee(CalculateUtils.getRound2(profitAcountFee).toString());
        sumEntity.setProfit(CalculateUtils.getRound2(profitAcount).toString());*/
        sumEntity.setPayAcountFee(getCurrency(payAcountFee));
        sumEntity.setRecAcountFee(getCurrency(recAcountFee));
        sumEntity.setPayAcount(getCurrency(payAcount));
        sumEntity.setRecAcount(getCurrency(recAcount));
        sumEntity.setProfitFee(getCurrency(profitAcountFee));
        sumEntity.setProfit(getCurrency(profitAcount));
        responseData.setData(sumEntity);
        responseData.setCode(Constants.YES);
        responseData.setMsg("获取收支配比成功");
        return responseData;
	}
	private String getCurrency(Double num){
		Locale locale = Locale.CHINA;
		return NumberUtils.getCurrencyFormat(num, 2, false, 0, locale , false);
	}
	
	
	// 货代出口进口数据保留小数点后两位
    public EfBusinessFeesModel decimalFor(EfBusinessFeesModel item) {
        DecimalFormat decimal = new DecimalFormat("#.##");
        if (item.getEfbfAmount() != null) {
            item.setEfbfAmount(Double.parseDouble(decimal.format(item.getEfbfAmount())));
        }
        if (item.getEfbfTaxAmount() != null) {
            item.setEfbfTaxAmount(Double.parseDouble(decimal.format(item.getEfbfTaxAmount())));
        }
        if (item.getEfbfPrice() != null) {
            item.setEfbfPrice(Double.parseDouble(decimal.format(item.getEfbfPrice())));
        }
        if (item.getEfbfTaxFee() != null) {
            item.setEfbfTaxFee(Double.parseDouble(decimal.format(item.getEfbfTaxFee())));
        }
        return item;
    }

	@Override
	public ResponseData uploadCashSettlement(Long[] efbfIds, Long eoorId) {
		
		return this.efBusinessFeesSettlementService.uploadCashSettlement(efbfIds, eoorId);
	}
    /**
	 * 通过eoorId获取该条订单下的信息
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	@Override
	public ResponseData<EoOrderDto> getOrderFeeByEoorId(Long eoorId) {
		ResponseData<EoOrderDto> eoResponseData = new ResponseData<EoOrderDto>();
		EoOrderDto eoOrderDto = this.efBusinessFeesManager.getOrderFeeByEoorId(eoorId);
		eoResponseData.setData(eoOrderDto);
		eoResponseData.setCode("Y");
		eoResponseData.setMsg("查询成功");
		return eoResponseData;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public ResponseData upLoadAllToBms(Long[] eoorIds) {
		String errm = "";
		ResponseData responseData = new ResponseData<>();
		List<FilterCondition> eoorConditions = new ArrayList<>();
		eoorConditions.add(new FilterCondition("eoorId", eoorIds, "in"));
		String msg = "";//收集全部结算上传中的错误信息
		List<EoOrderModel> eoOrderModels = this.eoOrderManager.findByCondition(eoorConditions);
		if (EmptyUtils.isNotEmpty(eoOrderModels)) {
			errm = this.upFeesToBmsBeforeCheck(eoOrderModels);
			if (EmptyUtils.isNotEmpty(errm)) {
				responseData.setCode(Constants.NO);
				responseData.setMsg(errm);
				return responseData;
			}
		}
		String eoorOrderNo = "";//系统订单号
		String eoorBmsEsdeDepartmentCode = "";//bms部门代码
		String eoorBmsEbsmCode = "";//销售人员代码
		if (EmptyUtils.isNotEmpty(eoOrderModels)) {
			//1.校验订单表中的销售人员和部门代码不能为空
			for (EoOrderModel eoOrderModel : eoOrderModels) {
				eoorOrderNo = eoOrderModel.getEoorOrderNo();
				eoorBmsEsdeDepartmentCode = eoOrderModel.getEoorBmsEsdeDepartmentCode();
				eoorBmsEbsmCode = eoOrderModel.getEoorBmsEbsmCode();
				if (EmptyUtils.isEmpty(eoorBmsEbsmCode)) {
					msg = msg + "系统订单号为：" + eoorOrderNo + " BMS销售人员代码为空，不允许上传BMS，请维护!\n";
				}
				if (EmptyUtils.isEmpty(eoorBmsEsdeDepartmentCode)) {
					msg = msg + "系统订单号为：" + eoorOrderNo + " BMS部门代码为空，不允许上传BMS，请维护!\n";
				}
			}
			if (EmptyUtils.isNotEmpty(msg)) {
				responseData.setCode(Constants.NO);
				responseData.setMsg(msg);
				return responseData;
			}
			//2.校验订单代理拓展表中的装货港或卸货港不能为空
			responseData = this.checkEoeaBeforeUpLoadToBms(eoorIds);
			StringBuffer msgBuffer = new StringBuffer();
			if (Constants.NO.equals(responseData.getCode())) {
				Map<String, List<Long>> msgMap = new HashMap<>();
				msgMap = (Map<String, List<Long>>) responseData.getData();
				List<Long> eoeaEoorIds = msgMap.get("eoorId");
				for (int i = 0; i < eoeaEoorIds.size(); i++) {
					for (EoOrderModel eoOrderModel : eoOrderModels) { 
						if (eoeaEoorIds.get(i).equals(eoOrderModel.getEoorId())) {
							msgBuffer.append("系统订单号为：" + eoOrderModel.getEoorOrderNo() + "装货港或卸货港不能为空，请维护！\n");
						}
					}
				}
			}
			if (EmptyUtils.isNotEmpty(msgBuffer.toString())) {
				responseData.setCode(Constants.NO);
				responseData.setMsg(msgBuffer.toString());
				return responseData;
			}
			//3.校验统计值信息是否符合要求
			//3.1.校验合同物流统计值是否符合上传要求
			responseData = this.efBusinessFeesContractLogisticSettlementService.checkEfbmBmsModelByType14(eoorIds);
			if (Constants.NO.equals(responseData.getCode())) {
				responseData.setCode(Constants.NO);
				responseData.setMsg(responseData.getMsg());
				return responseData;
			} else {
				//将订单的结算上传状态修改为已结算上传
				this.updateEoOrderModelByEoorIds(eoOrderModels);
				List<EfBmsImModelDto> efBmsImModelDtos = (List<EfBmsImModelDto>) responseData.getData();
				//为防止一条费用上传多次，在全部结算上传的时候将费用状态修改为上传中
				this.updateEfbfStatusByEoorId(efBmsImModelDtos);
				//开启异步线程上传费用到bms
				this.UpLoadAllToBmsThreadService.upLoadAllToBms(efBmsImModelDtos);
			}
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("订单查询失败，请重新操作");
			return responseData;
		}
		return responseData;
	}
	
	/**
	 * 订单全部结算上传时校验装货港或者卸货港不能为空
	 * @author Shoven.Jiang  
	 * @date 2018年10月24日
	 * @param eoorIds
	 * @return
	 */
	@SuppressWarnings({ "unused", "rawtypes", "unchecked" })
	private ResponseData checkEoeaBeforeUpLoadToBms(Long [] eoorIds) {
		ResponseData responseData = new ResponseData<>();
		List<FilterCondition> eoeaConditions = new ArrayList<>();
		eoeaConditions.add(new FilterCondition("eoeaEoorId", eoorIds, "in"));
		String msg = "";
		List<Long> eoeaEoorId = new ArrayList<>();//订单id集合
		Map<String, List<Long>> checkMap = new HashMap<>();
		List<EoOrderExpandAgencyModel> eoOrderExpandAgencyModels = this.eoOrderExpandAgencyManager.findByCondition(eoeaConditions);
		String eoeaAgencyType = "";//货物流向
		Long eoeaDischargePortId = null;//卸货港id
		Long eoeaLoadPortId = null;//装货港id
		if (EmptyUtils.isNotEmpty(eoOrderExpandAgencyModels)) {
			for (EoOrderExpandAgencyModel eoOrderExpandAgencyModel : eoOrderExpandAgencyModels) {
				eoeaAgencyType = eoOrderExpandAgencyModel.getEoeaAgencyType();
				//如果是出口订单
				if (EmptyUtils.isNotEmpty(eoeaAgencyType) && Constants.SYS_EXPORTE.equals(eoeaAgencyType)) {
					eoeaDischargePortId = eoOrderExpandAgencyModel.getEoeaDischargePortId();
					if (null == eoeaDischargePortId) {
						eoeaEoorId.add(eoOrderExpandAgencyModel.getEoeaEoorId());
					}
				}
				//如果是进口订单
				if (EmptyUtils.isNotEmpty(eoeaAgencyType) && Constants.SYS_IMPORT.equals(eoeaAgencyType)) {
					eoeaLoadPortId = eoOrderExpandAgencyModel.getEoeaLoadPortId();
					if (null == eoeaLoadPortId) {
						eoeaEoorId.add(eoOrderExpandAgencyModel.getEoeaEoorId());
					}
				}
			}
			checkMap.put("eoorId", eoeaEoorId);
		}
		if (null != checkMap) {
			responseData.setCode(Constants.NO);
			responseData.setData(checkMap);
			return responseData;
		} else {
			responseData.setCode(Constants.YES);
			responseData.setData(checkMap);
			return responseData;
		}
	}
	
	/**
	 * 费用全部结算上传时将费用状态修改为上传中，防止多次上传费用的现象出现
	 * @author Shoven.Jiang  
	 * @date 2018年10月25日
	 * @param efBmsImModelDtos
	 */
	public void updateEfbfStatusByEoorId(List<EfBmsImModelDto> efBmsImModelDtos) {
    	List<EfBusinessFeesModel> saveEfBusinessFeesModels = new ArrayList<EfBusinessFeesModel>();
    	for (int i = 0; i < efBmsImModelDtos.size(); i++) {
			Long eoorId = efBmsImModelDtos.get(i).getEoorId();
			if (null != eoorId) {
				List<FilterCondition> efbfCondition = new ArrayList<>();
				efbfCondition.add(new FilterCondition("efbfEoorId", eoorId, "="));
				EfBusinessFeesModel efBusinessFeesModel = new EfBusinessFeesModel();
				List<EfBusinessFeesModel> efBusinessFeesModels = this.efBusinessFeesManager.findByCondition(efbfCondition);
				if (EmptyUtils.isNotEmpty(efBusinessFeesModels)) {
					for (int j = 0; j < efBusinessFeesModels.size(); j++) {
						efBusinessFeesModel = efBusinessFeesModels.get(j);
						Long efbfStatus = efBusinessFeesModel.getEfbfStatus();
						//将费用状态为确认【1】,接收失败【-3】,结算审核不通过【-4】的费用状态修改为上传中
						if (null != efbfStatus && (efbfStatus == 1 || efbfStatus == -3 || efbfStatus == -4)) {
							efBusinessFeesModel.setEfbfStatus(Constants.EFBF_STATUS_UPLOADING);
							saveEfBusinessFeesModels.add(efBusinessFeesModel);
						}
					}
				}
			}
		}
    	this.efBusinessFeesManager.saveAll(saveEfBusinessFeesModels);
    }
	
	/**
	 * 费用批量结算上传，批量修改订单的结算上传状态
	 * @author Shoven.Jiang  
	 * @date 2018年10月25日
	 * @param eoOrderModels
	 */
	private void updateEoOrderModelByEoorIds(List<EoOrderModel> eoOrderModels) {
		for (int i = 0; i < eoOrderModels.size(); i++) {
			eoOrderModels.get(i).setEoorIsSettlementUpload("Y");
		}
		this.eoOrderManager.saveAll(eoOrderModels);
	}

	@Override
	public ResponseData<List<EfBusinessFeesModel>> batchChangeBusinessFees(
			List<EfBusinessFeesModel> efBusinessFeesModelList) {
		
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		
		List<EfBusinessFeesModel> feeList = new ArrayList<>();//代收代付负费用
		List<EfBusinessFeesModel> feeNewList = new ArrayList<>();//代收代付新增费用
		List<EfBusinessFeesModel> feeOrgList = new ArrayList<>();
		List<EfBusinessFeesModel> afterFeeList = null;
		
		ResponseData<List<EfBusinessFeesModel>> responseFeeData = null;
		if (efBusinessFeesModelList != null && efBusinessFeesModelList.size() > 0) {
			//"P".equals(efBusinessFeesModelList.get(0).getEfbfType())
			//"R".equals(efBusinessFeesModelList.get(0).getEfbfType())
			if ( "P".equals(efBusinessFeesModelList.get(0).getEfbfType()) || "R".equals(efBusinessFeesModelList.get(0).getEfbfType())) {
				for (EfBusinessFeesModel efbfModel : efBusinessFeesModelList) {
					//应收应付
					Long efbfId = efbfModel.getEfbfId();
					if (efbfModel.getEfbfId() != null) {
						//产生一条负费用
						EfBusinessFeesModel fee = efBusinessFeesManager.get(efbfModel.getEfbfId());
						EfBusinessFeesModel feeModel = new EfBusinessFeesModel();
						if (Constants.YES.equals(fee.getEfbfSubstr12())) {
							responseData.setCode(Constants.NO);
							responseData.setMsg("此费用已变更过,不能多次变更!");
							return responseData;
						}
						BeanUtils.copyProperties(feeModel, fee);
						//TODO 负费用
						feeModel.setEfbfAmount(NumberUtils.doubleMinus(0D, feeModel.getEfbfAmount()));
						feeModel.setEfbfPrice(NumberUtils.doubleMinus(0D, feeModel.getEfbfPrice()));
						feeModel.setEfbfTaxAmount(NumberUtils.doubleMinus(0D, feeModel.getEfbfTaxAmount()));
						feeModel.setEfbfTaxFee(NumberUtils.doubleMinus(0D, feeModel.getEfbfTaxFee()));
						feeModel.setEfbfId(null);
						feeModel.setEfbfInvoiceAmt(0D);
						feeModel.setEfbfInvoiceStatus("0");
						feeModel.setEfbfBChargeoffAmt(0D);
						feeModel.setEfbfBChargeoff("0");
						feeModel.setEfbfProperty(1L);//费用性质  0 表示原始费用  1 表示增补费用
						feeModel.setEfbfSubstr11(Constants.NO);
						feeList.add(feeModel);
						//原费用
						fee.setEfbfSubstr12(Constants.YES);
						feeOrgList.add(fee);
						//新的费用
						efbfModel.setEfbfId(null);
						efbfModel.setEfbfInvoiceAmt(0D);
						efbfModel.setEfbfInvoiceStatus("0");
						efbfModel.setEfbfBChargeoffAmt(0D);
						efbfModel.setEfbfBChargeoff("0");
						efbfModel.setEfbfSubstr11(Constants.NO);
						if (efbfModel.getEfbfSettlementEbcuId() == null) {
							efbfModel.setEfbfSettlementEbcuId(fee.getEfbfSettlementEbcuId());
							efbfModel.setEfbfSettlementEbcuCdh(fee.getEfbfSettlementEbcuCdh());
							efbfModel.setEfbfSettlementEbcuName(fee.getEfbfSettlementEbcuName());
						}
						efbfModel.setEfbfEscoId(Long.valueOf(SessionContext.getUser().getOrgId()));
						feeList.add(efbfModel);
					}else{
						responseData.setCode(Constants.NO);
						responseData.setMsg("费用变更失败,稍后重试");
						return responseData;
					}
				}
				responseFeeData = this.batchSaveBusinessFees(feeList);
				if (responseFeeData.getCode().equals(Constants.NO)) {
					responseData.setCode(Constants.NO);
					responseData.setMsg(responseFeeData.getMsg());
					return responseData;
				}
				afterFeeList = this.efBusinessFeesManager.saveAll(feeOrgList);
				if (afterFeeList==null && afterFeeList.size()==0) {
					responseData.setCode(Constants.NO);
					responseData.setMsg("费用变更失败,稍后重试");
					return responseData;
				}
				responseData.setData(afterFeeList);
			}
			if (Constants.FEE_TYPE_REP_R.equals(efBusinessFeesModelList.get(0).getEfbfType()) || Constants.FEE_TYPE_REP_P.equals(efBusinessFeesModelList.get(0).getEfbfType())) {
				Long efbfId = efBusinessFeesModelList.get(0).getEfbfId();
				List<FilterCondition> conditions = new ArrayList<>();
				conditions.add(new FilterCondition("efbfOppositeEfbfId",efbfId,"="));
				List<EfBusinessFeesModel> feesModels = this.efBusinessFeesManager.findByCondition(conditions );
				//负费用
				for (EfBusinessFeesModel feeModel : feesModels) {
					if (Constants.YES.equals(feeModel.getEfbfSubstr12())) {
						responseData.setCode(Constants.NO);
						responseData.setMsg("此费用已变更过,不能多次变更!");
						return responseData;
					}
					EfBusinessFeesModel fee = new EfBusinessFeesModel();
					BeanUtils.copyProperties(fee, feeModel);
					fee.setEfbfAmount(NumberUtils.doubleMinus(0D, feeModel.getEfbfAmount()));
					fee.setEfbfPrice(NumberUtils.doubleMinus(0D, feeModel.getEfbfPrice()));
					fee.setEfbfTaxAmount(NumberUtils.doubleMinus(0D, feeModel.getEfbfTaxAmount()));
					fee.setEfbfTaxFee(NumberUtils.doubleMinus(0D, feeModel.getEfbfTaxFee()));
					fee.setEfbfId(null);
					fee.setEfbfInvoiceAmt(0D);
					fee.setEfbfInvoiceStatus("0");
					fee.setEfbfBChargeoffAmt(0D);
					fee.setEfbfBChargeoff("0");
					feeModel.setEfbfProperty(1L);//费用性质  0 表示原始费用  1 表示增补费用
					feeModel.setEfbfSubstr11(Constants.NO);
					feeList.add(fee);
					//费用变更修改费用备注12为Y
					feeModel.setEfbfSubstr12(Constants.YES);
					feeOrgList.add(feeModel);
					
				}
				responseFeeData = this.batchSaveBusinessFees(feeList);
				if (responseFeeData.getCode().equals(Constants.NO)) {
					responseData.setCode(Constants.NO);
					responseData.setMsg(responseFeeData.getMsg());
					return responseData;
				}
				//变更费用
				for (EfBusinessFeesModel fee : efBusinessFeesModelList) {
					fee.setEfbfId(null);
					fee.setEfbfInvoiceAmt(0D);
					fee.setEfbfInvoiceStatus("0");
					fee.setEfbfBChargeoffAmt(0D);
					fee.setEfbfBChargeoff("0");
					feeNewList.add(fee);
				}
				responseFeeData = this.batchSaveBusinessFees(feeNewList);
				if (responseFeeData.getCode().equals(Constants.NO)) {
					responseData.setCode(Constants.NO);
					responseData.setMsg(responseFeeData.getMsg());
					return responseData;
				}
				afterFeeList = this.efBusinessFeesManager.saveAll(feeOrgList);
				if (afterFeeList==null && afterFeeList.size()==0) {
					responseData.setCode(Constants.NO);
					responseData.setMsg("费用变更失败,稍后重试");
					return responseData;
				}
				responseData.setData(afterFeeList);
			}
		}
		responseData.setCode(Constants.YES);
		responseData.setMsg("费用变更成功");
		return responseData;
	}

	@Override
	public ResponseData copyEfbfListRep(Collection<Long> efbfIds) {
		ResponseData responseData = new ResponseData<>();
		try {
			Set<Long> efbfOppositeEfbfIds = new HashSet<>();
			Set<Long> efbfEoorIds = new HashSet<>();
			if (efbfIds.size() > 0) {
				for (Long efbfId : efbfIds) {
					EfBusinessFeesModel fee = this.efBusinessFeesManager.get(efbfId);
					efbfOppositeEfbfIds.add(fee.getEfbfOppositeEfbfId());
					efbfEoorIds.add(fee.getEfbfEoorId());
				}
			}
			List<EfBusinessFeesModel> efBusinessFeesModelsRep = new ArrayList<>();
			if (efbfOppositeEfbfIds.size()>0) {
				List<FilterCondition> efbfRepCondition = new ArrayList<>();
				efbfRepCondition.add(new FilterCondition("efbfOppositeEfbfId", efbfOppositeEfbfIds, "in"));
				efbfRepCondition.add(new FilterCondition("efbfEoorId", efbfEoorIds, "in"));
				efBusinessFeesModelsRep = this.efBusinessFeesManager.findByCondition(efbfRepCondition);
			}
			responseData.setMsg("复制成功");
			responseData.setCode(Constants.YES);
			responseData.setData(efBusinessFeesModelsRep);
		} catch (Exception e) {
			responseData.setMsg("复制失败");
			responseData.setCode(Constants.NO);
			e.printStackTrace();
		}
		return responseData;
	}
	/**
	 * @description 费用初始化参数设置
	 * @author Simon.Guo  
	 * @date 2018年11月25日上午9:31:04
	 * @param efbfModel
	 * @param user
	 * @return
	 */
	private EfBusinessFeesModel initEfbfModel(EfBusinessFeesModel efbfModel, UserDetails user,String autoConfirm) {
        //TODO Message msg = MessageFactory.getMessage();
        if (null != efbfModel && null != user) {
            efbfModel.setEfbfId(null);
            efbfModel.setEfbfFeeSources(Constants.FEE_SOURCE_HAND);
            efbfModel.setEfbfHdInformation(null);
            if (Constants.YES.equals(autoConfirm)) {//根据控制参数控制
            	efbfModel.setEfbfStatus(1L); // 费用状态:确认
            	efbfModel.setEfbfComfirmUserId(Long.parseLong(user.getUserId()));// 确认人id
            	efbfModel.setEfbfComfirmUser(user.getUserNameCn());// 确认人
            	efbfModel.setEfbfComfirmDate(new Date());
			}else{
				efbfModel.setEfbfStatus(0L); // 费用状态:确认
				efbfModel.setEfbfComfirmUserId(null);// 确认人id
				efbfModel.setEfbfComfirmUser(null);// 确认人
				efbfModel.setEfbfComfirmDate(null);
			}
            if (efbfModel.getEfbfProperty() == null) {
            	efbfModel.setEfbfProperty(0L);//费用性质  0 表示原始费用  1 表示增补费用
			}
            efbfModel.setRecVer(null);
            efbfModel.setEfbfHdSymbol(Constants.HD_SYMBOL_0);// 上传状态
            efbfModel.setEfbfUploadUserId(null);// 上传人ID
            efbfModel.setEfbfUploadUser(null);// 上传人
            efbfModel.setEfbfUploadTime(null);// 上时间
            efbfModel.setEfbfHdBatchnumber(null);// 上传批次
            efbfModel.setEfbfHdFilename(null);// 上传文件名
            efbfModel.setEfbfHdBeginprocessingtime(null);// 开始时间
            efbfModel.setEfbfHdLastmodifiedtime(null);// 结束时间
            efbfModel.setEfbfSubstr20(null); //开票预约号
            efbfModel.setEfbfInvoiceAmt(0D);   //开票金额
            efbfModel.setEfbfInvoiceStatus("0");  //开票状态
            efbfModel.setEfbfSubstr4(null); //开票日期
            efbfModel.setEfbfSubstr10(null); //发票号
            efbfModel.setEfbfBChargeoff("0");  //业务核销状态
            efbfModel.setEfbfBChargeoffAmt(0D);  //业务核销金额
            efbfModel.setEfbfFChargeoff("0");  //财务核销状态
            efbfModel.setEfbfFChargeoffAmt(0D);  //财务核销金额
            efbfModel.setCreateTime(null);
        	efbfModel.setModifier(null);
        	efbfModel.setCreator(null);
        	efbfModel.setEfbfSubstr11(Constants.NO);//是够提交结算单 N为否  Y为是
        	efbfModel.setEfbfSettlementInformation(null);//提交结算单反馈（结算单以及备注信息）
        	efbfModel.setEfbfSubstr12(Constants.NO);//是否费用变更  N为否  Y为是
        	efbfModel.setEfbfSubstr13(Constants.NO);//是否存在总部代开票记录  N为否  Y为是
        	if (null == efbfModel.getEfbfEscoId()) {
        		String escoId = SessionContext.getUser().getOrgId();
        		if (EmptyUtils.isNotEmpty(escoId)) {
        			efbfModel.setEfbfEscoId(Long.valueOf(escoId));
        		}
        	}
        }
        return efbfModel;
	}

	@Override
	public ResponseData substituteTicketFeesByHeadquarters(List<Long> eoorIds) {
		ResponseData responseData = new ResponseData<>();
		String headquartersEsco = esControlParamManager.getIsCompanyValue(Constants.HEADQUARTERS_INFORMATION);
		String [] headquartersEscos = headquartersEsco.split(",");//总公司信息，维护控制参数时根据","隔开，第一个是总公司Id
		String errm = "";//收集错误信息中的校验信息
		if (EmptyUtils.isNotEmpty(eoorIds) && EmptyUtils.isNotEmpty(headquartersEscos)) {
			//1、根据订单id查询该订单下应收费用，并校验在总公司下是否存在
			for (int i = 0; i < eoorIds.size(); i++) {
				EoOrderModel eoOrderModel = this.eoOrderManager.get(eoorIds.get(i));
				//校验费用名称是否符合要求
				errm = errm + this.checkEfbfBusinessFeesMsgByEoorId(eoorIds.get(i), headquartersEscos, eoOrderModel);
				//校验项目是否符合要求
				errm = errm + this.checkEbProjectByEoorId(eoOrderModel, headquartersEscos);
				//结算对象校验
				errm = errm + this.checkEfbfSettlementEbcuByEoorId(eoOrderModel, headquartersEscos);
			}
			if (EmptyUtils.isNotEmpty(errm)) {
				responseData.setCode(Constants.NO);
				responseData.setMsg("总部代开票操作失败，失败原因：\n" + errm);
				return responseData;
			}
			List<FilterCondition> eoorConditions = new ArrayList<>();
//			Long [] eoorIdsArray = (Long[]) eoorIds.toArray();
			eoorConditions.add(new FilterCondition("eoorId", eoorIds, "in"));
			List<EoOrderModel> eoOrderModels = this.eoOrderManager.findByCondition(eoorConditions);
			if (EmptyUtils.isNotEmpty(eoOrderModels)) {
				//在总公司下创建一条订单信息，用来存放生成的费用信息
				for (EoOrderModel eoOrderModel : eoOrderModels) {
					//如果该订单已经存在过代开票记录  用DK+当前订单的系统订单号去总公司下SO号查询
					String eoorSoNo = "DK" + eoOrderModel.getEoorOrderNo();
					Long escoId = Long.valueOf(headquartersEscos[0]);
					List<FilterCondition> checkEoorCondition = new ArrayList<>();
					checkEoorCondition.add(new FilterCondition("eoorEscoId", escoId, "="));
					checkEoorCondition.add(new FilterCondition("eoorSoNo", eoorSoNo, "="));
					List<EoOrderModel> checkEoOrderModels = this.eoOrderManager.findByCondition(checkEoorCondition);
					if (EmptyUtils.isNotEmpty(checkEoOrderModels)) {
						//开始初始化该订单下应收费用
				        this.assembleEfBusinessFeesByOldEoorId(eoOrderModel, checkEoOrderModels.get(0));
					} else {
						Long eoorId = eoOrderModel.getEoorId();
						EoOrderModel beforeSaveEoOrderModel = new EoOrderModel();
						EoOrderExpandAgencyModel beforeSaveEoeaModel = new EoOrderExpandAgencyModel();
						List<FilterCondition> eoeaConditions = new ArrayList<>();
						eoeaConditions.add(new FilterCondition("eoeaEoorId", eoorId, "="));
						List<EoOrderExpandAgencyModel> eoOrderExpandAgencyModels = this.eoOrderExpandAgencyManager.findByCondition(eoeaConditions);
						BeanUtils.copyProperties(beforeSaveEoOrderModel, eoOrderModel);//将原有的订单信息copy到新的对象中
						if (EmptyUtils.isNotEmpty(eoOrderExpandAgencyModels)) {
							BeanUtils.copyProperties(beforeSaveEoeaModel, eoOrderExpandAgencyModels.get(0));//将原有的订单代理拓展表信息copy到新的对象中
						}
						this.assembleOrderByEoorEoeaModel(eoorId, beforeSaveEoOrderModel, beforeSaveEoeaModel, headquartersEscos);
					}
				}
			}
		}
		responseData.setCode(Constants.YES);
		responseData.setMsg("操作成功！");
		return responseData;
	}
	
	/**
	 * 总部代开票，重新组装订单信息以及订单代理拓展表信息
	 * @author Shoven.Jiang  
	 * @date 2018年12月1日
	 * @param eoorId  子公司订单id
	 * @param eoOrderModel  子公司订单
	 * @param eoOrderExpandAgencyModel  子公司订单代理拓展表
	 */
	private void assembleOrderByEoorEoeaModel(Long eoorId, EoOrderModel eoOrderModel, EoOrderExpandAgencyModel eoOrderExpandAgencyModel, String [] headquartersEscos) {
		ResponseData<EoOrderDto> beforeResponse = new ResponseData<>();
		EoOrderModel oldEoOrderModel = new EoOrderModel();//子公司原订单信息
		BeanUtils.copyProperties(oldEoOrderModel, eoOrderModel);//将原有的订单代理拓展表信息copy到新的对象中
		String escoId = headquartersEscos[0];//总公司的公司id，控制参数获取的值
		String eoorOrderNoOld = eoOrderModel.getEoorOrderNo();//子公司订单中的系统订单号
		//1、初始化订单表对象、订单代理拓展表对象数据
		EoOrderDto eoOrderDto = new EoOrderDto();
		eoOrderDto.setEoOrderModel(eoOrderModel);
		eoOrderDto.setEoOrderExpandAgencyModel(eoOrderExpandAgencyModel);
		beforeResponse.setData(eoOrderDto);
		ResponseData<EoOrderDto> afterResponse = this.EoOrderServiceImpl.initializationEoorAndEoeaModel(beforeResponse);
		EoOrderModel beforeSaveEoOrderModel = afterResponse.getData().getEoOrderModel();
		EoOrderExpandAgencyModel beforeSaveEoOrderExpandAgencyModel = afterResponse.getData().getEoOrderExpandAgencyModel();
		//2、查询总公司下项目
		EbProjectModel ebProjectModel = this.getEbProjectModel(eoOrderModel.getEoorEbpjId(), escoId);
		//4、查询总公司下面的代开票项目执行计划
		EbProjectPlanModel ebProjectPlanModel = this.getEbProjectPlanModel(Constants.EB_PROJECT_PLAN_CODE_ZBDKP, escoId);
		//3、订单以及订单代理拓展表数据重组
		//3.1系统订单号重新生成
		String eoorOrderNo = NOGeneratorUtil.currentValue(Constants.ORDER_NO_NAME);
    	//3.1.1防止系统订单号重复，取自动生成的系统订单号去查该公司下的订单，如果能查到则重新获取系统订单号
        while (!this.eoOrderManager.checkEoOrderByEoOrderNo(eoorOrderNo, escoId)) {
        	eoorOrderNo = NOGeneratorUtil.currentValue(Constants.ORDER_NO_NAME);
		}
        beforeSaveEoOrderModel.setEoorOrderNo(eoorOrderNo);
		//3.2外运号重新生成
        String eoorSinoNo = "";
   	 	Object[] obj = esCounterManager.getSinotransNo(1).toArray();
        if(EmptyUtils.isNotEmpty(obj)){
	       	 eoorSinoNo = obj[0].toString();
	       	 //3.2.1为了保证外运号在系统内唯一，订单新增保存之前先校验外运号是否在系统中存在，如果存在则重新取值
	       	 while (!this.eoOrderManager.chackEoOrderByEoSino(eoorSinoNo)) {
	       		 obj = esCounterManager.getSinotransNo(1).toArray();
	       		 if (EmptyUtils.isNotEmpty(obj)) {
	       			 eoorSinoNo = obj[0].toString();
	       		 }
	       	 }
	       	beforeSaveEoOrderModel.setEoorSinoNo(eoorSinoNo);
        }
		//3.3so号为DK+原订单系统订单号
        beforeSaveEoOrderModel.setEoorSoNo("DK" + eoorOrderNoOld);
		//3.4创建人、修改人默认为150
        beforeSaveEoOrderModel.setCreator("150");
        beforeSaveEoOrderModel.setModifier("150");
		//3.5公司为总公司id
        beforeSaveEoOrderModel.setEoorEscoId(Long.valueOf(escoId));
		//3.6项目为子公司通过项目code查询到的总公司项目
        if (null != ebProjectModel) {
        	beforeSaveEoOrderModel.setEoorEbpjId(ebProjectModel.getEbpjId());
        	beforeSaveEoOrderModel.setEoorEbpjName(ebProjectModel.getEbpjProjectName());
        }
		//3.7项目执行计划为总部代开票
        if (null != ebProjectPlanModel) {
        	beforeSaveEoOrderModel.setEoorLoEbppId(ebProjectPlanModel.getEbppId());
        	beforeSaveEoOrderModel.setEoorLoEbppName(ebProjectPlanModel.getEbppPlanName());
        }
		//3.8订单中项目执行计划执行状态为3
        beforeSaveEoOrderModel.setEoorLoPlanStatus(Constants.TASK_STATUS_DONE);
		//3.9订单状态为ACCEPT
        beforeSaveEoOrderModel.setEoorStatus(Constants.ORDER_STATUS_ACCEPT);
        EoOrderModel afterSaveEoOrderModel = this.eoOrderManager.save(beforeSaveEoOrderModel);
        //5、初始化订单代理拓展表
        beforeSaveEoOrderExpandAgencyModel.setEoeaEoorId(afterSaveEoOrderModel.getEoorId());
        beforeSaveEoOrderExpandAgencyModel.setEoeaEbpjId(afterSaveEoOrderModel.getEoorEbpjId());
        beforeSaveEoOrderExpandAgencyModel.setCreator("150");
        beforeSaveEoOrderExpandAgencyModel.setModifier("150");
        this.eoOrderExpandAgencyManager.save(beforeSaveEoOrderExpandAgencyModel);
        //6、订单基本信息初始化完成------>   开始初始化该订单下应收费用
        this.assembleEfBusinessFeesByOldEoorId(oldEoOrderModel, afterSaveEoOrderModel);
	}
	
	/**
	 * 通过订单Id查询总公司下是否存在费目名称相同的费目
	 * @author Shoven.Jiang  
	 * @date 2018年12月1日
	 * @param eoorId
	 * @param headquartersEscos  总部信息
	 * @return
	 */
	private String checkEfbfBusinessFeesMsgByEoorId(Long eoorId, String [] headquartersEscos, EoOrderModel eoOrderModel) {
		String errm = "";
		String escoId = headquartersEscos[0];//总公司的公司id，控制参数获取的值
		List<FilterCondition> efbfCondition = new ArrayList<>();
		efbfCondition.add(new FilterCondition("efbfEoorId", eoorId, "="));
		efbfCondition.add(new FilterCondition("efbfType", Constants.FEE_TYPE_R, "="));
		List<EfBusinessFeesModel> efBusinessFeesModels = this.efBusinessFeesManager.findByCondition(efbfCondition);
		if (EmptyUtils.isNotEmpty(efBusinessFeesModels)) {
			for (EfBusinessFeesModel efBusinessFeesModel : efBusinessFeesModels) {
				Long efbfEbfhId = efBusinessFeesModel.getEfbfEbfhId();
				//1、先校验自身订单下的费用是否有问题
				if (null == efbfEbfhId) {
					errm = errm + "应收费用信息中费用名称为空，请维护！\n";
				} else {
					//2、查询该订单下的费用名称在该公司下是否存在
					EbFeeHeadModel ebFeeHeadModel = this.ebFeeHeadManager.get(efbfEbfhId);
					if (null == ebFeeHeadModel) {
						errm = errm + "费目主键" + efbfEbfhId + "对应的费用名称在当前公司不存在，请联系管理员!\n";
					} else {
						//3、如果订单下费用符合要求则判断该费用名称在总公司下是否存在，用费用名称对应的id进行查询[通过应收，费目代码，是否免税，总公司公司id查询]
						Long ebfhIdRp = Constants.FEE_TYPE_IS_R;//费用类型
						Long ebfhIsDutyFree = ebFeeHeadModel.getEbfhIsDutyfree();//是否免税
						List<FilterCondition> ebfhCondition = new ArrayList<>();
						ebfhCondition.add(new FilterCondition("ebfhEscoId", Long.valueOf(escoId), "="));
//						ebfhCondition.add(new FilterCondition("ebfhIdRp", ebfhIdRp, "="));
						ebfhCondition.add(new FilterCondition("ebfhCode", ebFeeHeadModel.getEbfhCode(), "="));
						ebfhCondition.add(new FilterCondition("ebfhIsDutyfree", ebfhIsDutyFree, "="));
						List<EbFeeHeadModel> ebFeeHeadModels = this.ebFeeHeadManager.findByCondition(ebfhCondition);
						if (EmptyUtils.isEmpty(ebFeeHeadModels)) {
							errm = errm + "费用名称代码为：" + ebFeeHeadModel.getEbfhCode() + "所对应的费目信息在总公司不存在，请维护\n";
						}
					}
				}
			}
		}
		if (EmptyUtils.isNotEmpty(errm)) {
			errm = "系统订单号为：" + eoOrderModel.getEoorOrderNo() + "\n" + errm;
		}
		return errm;
	}
	
	/**
	 * 校验根据子公司项目代码是否能查到总公司项目
	 * @author Shoven.Jiang  
	 * @date 2018年12月1日
	 * @param eoOrderModel
	 * @return
	 */
	private String checkEbProjectByEoorId(EoOrderModel eoOrderModel, String [] headquartersEscos) {
		String errm = "";//收集错误信息
		String escoId = headquartersEscos[0];//总公司的公司id，控制参数获取的值
		Long ebpjId = eoOrderModel.getEoorEbpjId();
		if (null == ebpjId) {
			errm = "系统订单号为：" + eoOrderModel.getEoorOrderNo() + "所属项目为空，请维护！\n";
		} else {
			EbProjectModel ebProjectModel = this.ebProjectManager.get(ebpjId);
			if (null == ebProjectModel) {
				errm = "系统订单号为：" + eoOrderModel.getEoorOrderNo() + "所属项目在本公司不存在，请维护！\n";
			} else {
				List<FilterCondition> ebpjCondition = new ArrayList<>();
				ebpjCondition.add(new FilterCondition("ebpjProjectCode", ebProjectModel.getEbpjProjectCode(), "="));
				ebpjCondition.add(new FilterCondition("ebpjEscoId", Long.valueOf(escoId), "="));
				List<EbProjectModel> ebProjectModels = this.ebProjectManager.findByCondition(ebpjCondition);
				if (EmptyUtils.isEmpty(ebProjectModels)) {
					errm = "系统订单号为：" + eoOrderModel.getEoorOrderNo() + "所属项目在总公司不存在，请维护！\n";
				}
			}
		}
		return errm;
	}
	
	/**
	 * 通过项目代码以及公司id查询项目数据
	 * @author Shoven.Jiang  
	 * @date 2018年12月1日
	 * @param ebProjectCode
	 * @param escoId
	 * @return
	 */
	private EbProjectModel getEbProjectModel(Long ebpjId, String escoId) {
		EbProjectModel beforeEbProjectModel = this.ebProjectManager.get(ebpjId);
		if (null != beforeEbProjectModel) {
			String ebpjProjectCode = beforeEbProjectModel.getEbpjProjectCode();
			EbProjectModel ebProjectModel = new EbProjectModel();
			List<FilterCondition> ebpjCondition = new ArrayList<>();
			ebpjCondition.add(new FilterCondition("ebpjEscoId", Long.valueOf(escoId), "="));
			ebpjCondition.add(new FilterCondition("ebpjProjectCode", ebpjProjectCode, "="));
			ebpjCondition.add(new FilterCondition("ebpjProjectStatus", Constants.SYS_STATUS_ENABLE, "="));
			List<EbProjectModel> ebProjectModels = this.ebProjectManager.findByCondition(ebpjCondition);
			if (EmptyUtils.isNotEmpty(ebProjectModels)) {
				ebProjectModel = ebProjectModels.get(0);
			}
			return ebProjectModel;
		}
		return null;
	}
	
	/**
	 * 总部代开票获取总部代开票项目执行计划数据
	 * @author Shoven.Jiang  
	 * @date 2018年12月1日
	 * @param ebppCode
	 * @param ebppEscoId
	 * @return
	 */
	private EbProjectPlanModel getEbProjectPlanModel(String ebppCode, String ebppEscoId) {
		EbProjectPlanModel ebProjectPlanModel = new EbProjectPlanModel();
		List<FilterCondition> ebppCondition = new ArrayList<>();
		ebppCondition.add(new FilterCondition("ebppQuickCode", ebppCode, "="));
		ebppCondition.add(new FilterCondition("ebppEscoId", Long.valueOf(ebppEscoId), "="));
		List<EbProjectPlanModel> ebProjectPlanModels = this.ebProjectPlanManager.findByCondition(ebppCondition);
		if (EmptyUtils.isNotEmpty(ebProjectPlanModels)) {
			ebProjectPlanModel = ebProjectPlanModels.get(0);
		}
		return ebProjectPlanModel;
	}
	
	/**
	 * 总部代开票--->初始化费用信息
	 * @author Shoven.Jiang  
	 * @date 2018年12月1日
	 * @param OldEoOrderModel  子公司订单
	 * @param newEoOrderModel  总公司订单
	 */
	private void assembleEfBusinessFeesByOldEoorId(EoOrderModel OldEoOrderModel, EoOrderModel newEoOrderModel) {
		Long eoorIdOld = OldEoOrderModel.getEoorId();
		Long eoorIdNew = newEoOrderModel.getEoorId();
		Long [] efbfStatus = new Long [2];
		efbfStatus[0] = 3L;
		efbfStatus[1] = 4L;
		List<FilterCondition> efbfCondition = new ArrayList<>();
		efbfCondition.add(new FilterCondition("efbfEoorId", eoorIdOld, "="));
		efbfCondition.add(new FilterCondition("efbfType", Constants.FEE_TYPE_R, "="));
		efbfCondition.add(new FilterCondition("efbfStatus", efbfStatus, "in"));
		efbfCondition.add(new FilterCondition("efbfSubstr13", Constants.NO, "="));
		List<EfBusinessFeesModel> efBusinessFeesModels = this.efBusinessFeesManager.findByCondition(efbfCondition);
		List<EfBusinessFeesModel> newEfBusinessFeesModels = new ArrayList<>();
		//生成总公司下应收费用   :应收费用结算对象是客户
		for (EfBusinessFeesModel efBusinessFeesModel : efBusinessFeesModels) {
			efBusinessFeesModel.setEfbfSubstr13(Constants.YES);
			this.efBusinessFeesManager.save(efBusinessFeesModel);
			EfBusinessFeesModel beforeSaveNewEfBusinessFeesModel = this.initEfbfModel(efBusinessFeesModel, SessionContext.getUser(), Constants.YES);
			beforeSaveNewEfBusinessFeesModel.setEfbfId(null);//费用id
			beforeSaveNewEfBusinessFeesModel.setEfbfEscoId(newEoOrderModel.getEoorEscoId());//公司id
			beforeSaveNewEfBusinessFeesModel.setEfbfEoorId(eoorIdNew);//订单Id
			if (EmptyUtils.isNotEmpty(beforeSaveNewEfBusinessFeesModel.getEfbfSourceId())) {
				beforeSaveNewEfBusinessFeesModel.setEfbfSourceId(eoorIdNew + efBusinessFeesModel.getEfbfSourceId().substring(efBusinessFeesModel.getEfbfSourceId().length()-2, efBusinessFeesModel.getEfbfSourceId().length()));//费用单票主键
			}
			//费目id
			EbFeeHeadModel ebFeeHeadModel = this.getEbFeeHeadModel(efBusinessFeesModel.getEfbfEbfhId(), newEoOrderModel.getEoorEscoId(), Constants.FEE_TYPE_IS_R);
			if (null != ebFeeHeadModel) {
				beforeSaveNewEfBusinessFeesModel.setEfbfEbfhId(ebFeeHeadModel.getEbfhId());
			}
			//应收结算对象
			EbCustomerModel ebCustomerModel = this.getEbCustomerModel(efBusinessFeesModel.getEfbfSettlementEbcuName(), newEoOrderModel.getEoorEscoId(), Constants.FEE_TYPE_IS_R, newEoOrderModel);
			if (null != ebCustomerModel) {
				beforeSaveNewEfBusinessFeesModel.setEfbfSettlementEbcuCdh(ebCustomerModel.getEbcuCdhCode());
				beforeSaveNewEfBusinessFeesModel.setEfbfSettlementEbcuId(ebCustomerModel.getEbcuId());
				beforeSaveNewEfBusinessFeesModel.setEfbfSettlementEbcuName(ebCustomerModel.getEbcuNameCn());
			}
			this.efBusinessFeesManager.save(beforeSaveNewEfBusinessFeesModel);
		}
		
		//生成总公司下应付费用：  结算对象是子公司，根据子公司结算对象名称查询
		for (EfBusinessFeesModel efBusinessFeesModel : efBusinessFeesModels) {
			EfBusinessFeesModel beforeSaveNewEfBusinessFeesModelEfbfTypeP = this.initEfbfModel(efBusinessFeesModel, SessionContext.getUser(), Constants.YES);
			beforeSaveNewEfBusinessFeesModelEfbfTypeP.setEfbfId(null);//费用id
			beforeSaveNewEfBusinessFeesModelEfbfTypeP.setEfbfEscoId(newEoOrderModel.getEoorEscoId());//公司id
			beforeSaveNewEfBusinessFeesModelEfbfTypeP.setEfbfEoorId(eoorIdNew);//订单Id
			beforeSaveNewEfBusinessFeesModelEfbfTypeP.setEfbfType(Constants.FEE_TYPE_P);//费用类型
			if (EmptyUtils.isNotEmpty(beforeSaveNewEfBusinessFeesModelEfbfTypeP.getEfbfSourceId())) {
				beforeSaveNewEfBusinessFeesModelEfbfTypeP.setEfbfSourceId(eoorIdNew + efBusinessFeesModel.getEfbfSourceId().substring(efBusinessFeesModel.getEfbfSourceId().length()-2, efBusinessFeesModel.getEfbfSourceId().length()));//费用单票主键
			}
			//费目id
			EbFeeHeadModel ebFeeHeadModel = this.getEbFeeHeadModel(efBusinessFeesModel.getEfbfEbfhId(), newEoOrderModel.getEoorEscoId(), Constants.FEE_TYPE_IS_P);
			if (null != ebFeeHeadModel) {
				beforeSaveNewEfBusinessFeesModelEfbfTypeP.setEfbfEbfhId(ebFeeHeadModel.getEbfhId());
			}
			//应付结算对象
			EbCustomerModel ebCustomerModel = this.getEbCustomerModel(efBusinessFeesModel.getEfbfSettlementEbcuName(), Long.valueOf(SessionContext.getUser().getOrgId()), Constants.FEE_TYPE_IS_P , newEoOrderModel);
			if (null != ebCustomerModel) {
				beforeSaveNewEfBusinessFeesModelEfbfTypeP.setEfbfSettlementEbcuCdh(ebCustomerModel.getEbcuCdhCode());
				beforeSaveNewEfBusinessFeesModelEfbfTypeP.setEfbfSettlementEbcuId(ebCustomerModel.getEbcuId());
				beforeSaveNewEfBusinessFeesModelEfbfTypeP.setEfbfSettlementEbcuName(ebCustomerModel.getEbcuNameCn());
			}
			this.efBusinessFeesManager.save(beforeSaveNewEfBusinessFeesModelEfbfTypeP);
		}
	}
	
	/**
	 * 通过子公司费用的代码，查询总公司下费目信息的数据
	 * @author Shoven.Jiang  
	 * @date 2018年12月1日
	 * @param efbfEbfhId
	 * @param escoIdNew
	 * @return
	 */
	private EbFeeHeadModel getEbFeeHeadModel(Long efbfEbfhId, Long escoIdNew, Long ebfhIdRp) {
		EbFeeHeadModel newEbFeeHeadModel = new EbFeeHeadModel();
		EbFeeHeadModel oldEbFeeHeadModel = this.ebFeeHeadManager.get(efbfEbfhId);//子公司订单下费目信息
		if (null != oldEbFeeHeadModel) {
			List<FilterCondition> ebfhCondition = new ArrayList<>();
			ebfhCondition.add(new FilterCondition("ebfhCode", oldEbFeeHeadModel.getEbfhCode(), "="));
			ebfhCondition.add(new FilterCondition("ebfhEscoId", escoIdNew, "="));
//			ebfhCondition.add(new FilterCondition("ebfhIdRp", ebfhIdRp, "="));
			ebfhCondition.add(new FilterCondition("ebfhIsDutyfree", oldEbFeeHeadModel.getEbfhIsDutyfree(), "="));
			List<EbFeeHeadModel> ebFeeHeadModels = this.ebFeeHeadManager.findByCondition(ebfhCondition);
			if (EmptyUtils.isNotEmpty(ebFeeHeadModels)) {
				newEbFeeHeadModel = ebFeeHeadModels.get(0);
			}
		}
		return newEbFeeHeadModel;
	}
	
	/**
	 * 通过结算对象中文名称查询该公司下的客户供应商来充当总公司的结算对象
	 * @author Shoven.Jiang  
	 * @date 2018年12月1日
	 * @param ebcuNameCn
	 * @param escoId
	 * @return
	 */
	private EbCustomerModel getEbCustomerModel(String ebcuNameCn, Long escoId, Long efbfType, EoOrderModel eoOrderModel) {
		EbCustomerModel ebCustomerModel = new EbCustomerModel();
		if (null != efbfType && Constants.FEE_TYPE_IS_R.equals(efbfType)) {
			//总公司应收结算对象取值
			List<FilterCondition> ebcuCondition = new ArrayList<>();
			ebcuCondition.add(new FilterCondition("ebcuNameCn", ebcuNameCn, "="));
			ebcuCondition.add(new FilterCondition("ebcuEscoId", escoId, "="));
			List<EbCustomerModel> ebCustomerModels = this.ebCustomerManager.findByCondition(ebcuCondition);
			if (EmptyUtils.isNotEmpty(ebCustomerModels)) {
				for (EbCustomerModel checkEbCustomerModel : ebCustomerModels) {
					if (Constants.YES.equals(checkEbCustomerModel.getEbcuIsOwner()) || Constants.YES.equals(checkEbCustomerModel.getEbcuIsSupplier())) {
						ebCustomerModel = checkEbCustomerModel;
						break;
					}
				}
			}
		} else if (null != efbfType && Constants.FEE_TYPE_IS_P.equals(efbfType)) {
			//总公司应付结算对象取值
			EsCompanyModel esCompanyModel = this.esCompanyManager.get(escoId);//首先查找子公司的公司名称
			if (null != esCompanyModel) {
				List<FilterCondition> ebcuCondition = new ArrayList<>();
				ebcuCondition.add(new FilterCondition("ebcuNameCn", esCompanyModel.getEscoCompanyNameCn(), "="));
				ebcuCondition.add(new FilterCondition("ebcuEscoId", eoOrderModel.getEoorEscoId(), "="));
				List<EbCustomerModel> ebCustomerModels = this.ebCustomerManager.findByCondition(ebcuCondition);
				if (EmptyUtils.isNotEmpty(ebCustomerModels)) {
					for (EbCustomerModel checkEbCustomerModel : ebCustomerModels) {
						if (Constants.YES.equals(checkEbCustomerModel.getEbcuIsSubcontractor())) {
							ebCustomerModel = checkEbCustomerModel;
							break;
						}
					}
				}
			}
		}
		return ebCustomerModel;
	}
	
	/**
	 * 总部代开票---总公司的结算对象的校验
	 * @author Shoven.Jiang  
	 * @date 2018年12月3日
	 * @param eoOrderModel
	 * @param headquartersEscos
	 * @return
	 */
	private String checkEfbfSettlementEbcuByEoorId(EoOrderModel eoOrderModel, String [] headquartersEscos) {
		String errm = "";//收集结算对象的校验信息
		UserDetails user = SessionContext.getUser();
		String escoId = headquartersEscos[0];//总公司的公司id，控制参数获取的值
		//2、总公司应付结算对象校验---以子公司中文名称名称的结算对象-->供应商
		Long [] efbfStatus = new Long [2];
		efbfStatus[0] = Constants.EFBF_STATUS_3;
		efbfStatus[1] = Constants.EFBF_STATUS_4;
		Long eoorId = eoOrderModel.getEoorId();
		List<FilterCondition> efbfCondition = new ArrayList<>();
		efbfCondition.add(new FilterCondition("efbfEoorId", eoorId, "="));
		efbfCondition.add(new FilterCondition("efbfStatus", efbfStatus, "in"));//费用状态为接收成功，审核成功的费用
		efbfCondition.add(new FilterCondition("efbfType", Constants.FEE_TYPE_R, "="));
		List<EfBusinessFeesModel> efBusinessFeesModels = this.efBusinessFeesManager.findByCondition(efbfCondition);
		if (EmptyUtils.isNotEmpty(efBusinessFeesModels)) {
			for (EfBusinessFeesModel efBusinessFeesModel : efBusinessFeesModels) {
				//1、总公司应收结算对象校验---子公司中的应收结算对象-->客户
				String efbfSettlementEbcuName = efBusinessFeesModel.getEfbfSettlementEbcuName();
				List<FilterCondition> ebcuCondition = new ArrayList<>();
				ebcuCondition.add(new FilterCondition("ebcuNameCn", efbfSettlementEbcuName, "="));
				ebcuCondition.add(new FilterCondition("ebcuEscoId", Long.valueOf(escoId), "="));
				List<EbCustomerModel> ebCustomerModels = this.ebCustomerManager.findByCondition(ebcuCondition);
				if (EmptyUtils.isNotEmpty(ebCustomerModels)) {
					for (EbCustomerModel ebCustomerModel : ebCustomerModels) {
						if (!(Constants.YES.equals(ebCustomerModel.getEbcuIsOwner()) || Constants.YES.equals(ebCustomerModel.getEbcuIsSupplier()))) {
							errm = errm + "子公司应收结算对象：" + efbfSettlementEbcuName + "在总公司下不存在，请维护！";
						}
					}
				} else {
					errm = errm + "子公司应收结算对象：" + efbfSettlementEbcuName + "在总公司下不存在，请维护！";
				}
			}
			if (null != user) {
				String escoNameCn = user.getOrgName();
				List<FilterCondition> ebcuCondition = new ArrayList<>();
				ebcuCondition.add(new FilterCondition("ebcuNameCn", escoNameCn, "="));
				ebcuCondition.add(new FilterCondition("ebcuEscoId", Long.valueOf(escoId), "="));
				List<EbCustomerModel> ebCustomerModels = this.ebCustomerManager.findByCondition(ebcuCondition);
				if (EmptyUtils.isNotEmpty(ebCustomerModels)) {
					for (EbCustomerModel ebCustomerModel : ebCustomerModels) {
						if ((Constants.YES.equals(ebCustomerModel.getEbcuIsSubcontractor()))) {
							break;
						} else {
							errm = errm + "子公司应付结算对象：" + escoNameCn + "在总公司下不存在，请维护！";
						}
					}
				} else {
					errm = errm + "子公司应付结算对象：" + escoNameCn + "在总公司下不存在，请维护！";
				}
			}
		}
		if (EmptyUtils.isNotEmpty(errm)) {
			errm = "系统订单号：" + eoOrderModel.getEoorOrderNo() + errm;
		}
		return errm;
	}
	
	/**
	 * @deprecated:跟踪费用状态
	 * @author Colley.Bai  
	 * @date 2018年12月26日
	 * @param eoRequestBookingModel
	 */
	public void saveDpInTrack(EfBusinessFeesModel efBusinessFeesModel,Long type){
		List<FilterCondition> filterCondition = new ArrayList<>();
		filterCondition.add(new FilterCondition("dpitBridId",efBusinessFeesModel.getEfbfId(),"="));
		filterCondition.add(new FilterCondition("dpitOrderId",efBusinessFeesModel.getEfbfEoorId(),"="));
		filterCondition.add(new FilterCondition("dpitType",type,"="));
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
			dpInTrackModel.setDpitBridId(efBusinessFeesModel.getEfbfId());
			//订单ID
			dpInTrackModel.setDpitOrderId(efBusinessFeesModel.getEfbfEoorId());
			dpInTrackModel.setDpitType(type);
			//业务操作时间
			dpInTrackModel.setDpitOperatorTime(new Date());
			//业务操作人
			dpInTrackModel.setDpitOperator(user.getUserId());
			dpInTrackManager.save(dpInTrackModel);
		}
		
	}
	
	/**
	 * 订单结算上传校验是否符合上传逻辑
	 * @author Shoven.Jiang  
	 * @date 2019年3月4日
	 * @param eoOrderModels
	 * @return
	 */
	public String upFeesToBmsBeforeCheck(List<EoOrderModel> eoOrderModels) {
		String errm = "";
		for (EoOrderModel eoOrderModel : eoOrderModels) {
			if (EmptyUtils.isNotEmpty(eoOrderModel.getEoorStatus()) && Constants.SYS_STATUS_ADD.equals(eoOrderModel.getEoorStatus())) {
				errm = errm + eoOrderModel.getEoorOrderNo() + ";\n";
			}
		}
		if (EmptyUtils.isNotEmpty(errm)) {
			errm = "系统订单号为：\n" + errm + "订单状态为新增状态，不允许上传BMS！";
		}
		return errm;
	}

	@Override
	public ResponseData<EoOrderDto> copyEoOrderEfbfFeeByEoorId(EoOrderDto eoOrderDto) {
		ResponseData<EoOrderDto> responseData = new ResponseData<>();
		ResponseData<List<EfBusinessFeesModel>> responseEfbfData = new ResponseData<>();
		List<EfBusinessFeesModel> afterEfBusinessFeesModels = new ArrayList<>();
		EoOrderDto afterEoOrderDto = new EoOrderDto();
		//1.复制的
		Long eoorId = eoOrderDto.getEoorId();
		//2.被复制的
		Long afterEoorId = eoOrderDto.getAfterEoorId();
		if (null != eoorId) {
			List<EfBusinessFeesModel> efBusinessFeesModels = this.initEfBusinessFeesModel(afterEoorId);
			if (EmptyUtils.isNotEmpty(efBusinessFeesModels)) {
				for (EfBusinessFeesModel efBusinessFeesModel : efBusinessFeesModels) {
					efBusinessFeesModel.setEfbfEoorId(eoorId);
				}
//				responseEfbfData = this.efBusinessFeesManager.saveAll(efBusinessFeesModels);
				afterEfBusinessFeesModels = this.efBusinessFeesManager.saveAll(efBusinessFeesModels);
				if (EmptyUtils.isNotEmpty(afterEfBusinessFeesModels)) {
					for (EfBusinessFeesModel f : afterEfBusinessFeesModels) {
						saveDpInTrack(f, Constants.DPIT_TYPE_EFBF_ADD);
					}
					afterEoOrderDto.setEfBusinessFeesModelList(afterEfBusinessFeesModels);
					responseData.setCode(Constants.YES);
					responseData.setData(afterEoOrderDto);
					responseData.setMsg("复制成功");
				}
			} else {
				responseData.setCode(Constants.NO);
				responseData.setMsg("复制失败");
			}
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("复制失败");
		}
		return responseData;
	}
	
	/**
	 * @deprecated:初始化费用
	 * @author Colley.Bai  
	 * @date 2019年4月11日
	 * @param afterEoorId
	 * @return
	 */
	public List<EfBusinessFeesModel> initEfBusinessFeesModel(Long afterEoorId){
		List<EfBusinessFeesModel> afterEfBusinessFeesModels = new ArrayList<>();
		if (null != afterEoorId) {
			UserDetails user = SessionContext.getUser();
			//1.获取这个订单下所有订单
			List<FilterCondition> filterCondition = new ArrayList<>();
			filterCondition.add(new FilterCondition("efbfEoorId", afterEoorId, "="));
			List<EfBusinessFeesModel> efBusinessFeesModels = efBusinessFeesManager.findByCondition(filterCondition);
			if (EmptyUtils.isNotEmpty(efBusinessFeesModels)) {
				for (EfBusinessFeesModel efBusinessFeesModel : efBusinessFeesModels) {
					efBusinessFeesModel = this.initEfbfModel(efBusinessFeesModel, user, Constants.YES);
					afterEfBusinessFeesModels.add(efBusinessFeesModel);
				}
			}
		}
		return afterEfBusinessFeesModels;
	}


	
	@Override
	public ResponseData<List<EfBusinessFeesModel>> saveAutomaticChargingFeesByEoorIds(Long[] eoorIds) {
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		if (EmptyUtils.isNotEmpty(eoorIds)) {
			for (Long eoorId : eoorIds) {
				List<FilterCondition> eoorFilterCondition = new ArrayList<>();
				eoorFilterCondition.add(new FilterCondition("eoorId", eoorId, "="));
				//1.获取订单信息
				List<EoOrderModel> eoOrderModels = eoOrderManager.findByCondition(eoorFilterCondition);
				if (EmptyUtils.isNotEmpty(eoOrderModels)) {
					for (EoOrderModel eoOrderModel : eoOrderModels) {
						List<FilterCondition> elplFilterCondition = new ArrayList<>();
						elplFilterCondition.add(new FilterCondition("elplEscoId" ,eoOrderModel.getEoorEscoId(), "="));
						elplFilterCondition.add(new FilterCondition("elplEbpjId" ,eoOrderModel.getEoorEbpjId(), "="));
						//1.获取这个项目和公司匹配的协议
						List<ElProtocolModel> elProtocolModels = elProtocolManager.findByCondition(elplFilterCondition);
						if (EmptyUtils.isNotEmpty(elProtocolModels)) {
							responseData = this.getEoOrderAndElProtocol(eoOrderModel, elProtocolModels);
						} else {
							responseData.setCode(Constants.NO);
							responseData.setMsg("没有获取到匹配的协议");
						}
					}
				}
			}
 		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("计费失败，订单id为空");
		}
		return responseData;
	}
	/**
	 * @deprecated:
	 * @author Colley.Bai  
	 * @date 2019年4月30日
	 * @param eoOrderModel
	 * @param elProtocolModelList
	 * @param eoOrderExpandAgencyModelList
	 * @return
	 */
	public ResponseData<List<EfBusinessFeesModel>> getEoOrderAndElProtocol(EoOrderModel eoOrderModel,List<ElProtocolModel> elProtocolModels){
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		if (null != eoOrderModel && EmptyUtils.isNotEmpty(elProtocolModels)) {
			for (ElProtocolModel elProtocolModel : elProtocolModels) {
				//判断协议是否新增状态和可用状态
				if (Constants.SYS_STATUS_ADD.equals(elProtocolModel.getElplStatus()) || Constants.SYS_STATUS_ENABLE.equals(elProtocolModel.getElplStatus())) {
					SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
					Date elplEffectiveDateTo = null;
					Date newDate = null;
					//失效日期
					try {
						elplEffectiveDateTo = sdf.parse(sdf.format(elProtocolModel.getElplEffectiveDateTo()));
						//当前时间
						newDate = sdf.parse(sdf.format(new Date()));
						//比较该协议是否失效
						if (newDate.getTime() <= elplEffectiveDateTo.getTime()) {
							List<FilterCondition> epctFilterCondition = new ArrayList<>();
							epctFilterCondition.add(new FilterCondition("epctElplId", elProtocolModel.getElplId(), "="));
							//协议明细状态
							epctFilterCondition.add(new FilterCondition("epctStatus", "Y", "="));
							List<ElProtocolCostModel> elProtocolCostModels = elProtocolCostManager.findByCondition(epctFilterCondition);
							if (EmptyUtils.isNotEmpty(elProtocolCostModels)) {
								responseData = this.getElelProtocolCostFeelByEpccId(elProtocolCostModels, eoOrderModel);
								return responseData;
							}
						} else {
							responseData.setCode(Constants.NO);
							responseData.setMsg("匹配到的协议已到期");
							return responseData;
						}
					} catch (ParseException e) {
						e.printStackTrace();
					} 
				}
			}
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("没有获取到匹配的协议");
			return responseData;
		}
		return responseData;
	}

	
	/**
	 * @deprecated:根据协议明细查询计算方式并且计算
	 * @author Colley.Bai  
	 * @date 2018年11月28日
	 */
	public ResponseData<List<EfBusinessFeesModel>>  getElelProtocolCostFeelByEpccId(List<ElProtocolCostModel> elProtocolCostModelList,EoOrderModel eoOrderModel){
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		List<EfBusinessFeesModel> efBusinessFeesModels = new ArrayList<>();
		for (ElProtocolCostModel elProtocolCostModel : elProtocolCostModelList) {
			List<FilterCondition> ecptFilterCondition = new ArrayList<>();
			ecptFilterCondition.add(new FilterCondition("epcfEpccId", elProtocolCostModel.getEpctId(),"="));
			//1.获取明细对应计算方式
			List<ElProtocolCostFeelModel> elProtocolCostFeelModels = elProtocolCostFeelManager.findByCondition(ecptFilterCondition);
			List<FilterCondition> eorbFilterCondition = new ArrayList<>();
			eorbFilterCondition.add(new FilterCondition("eorbEoorId", eoOrderModel.getEoorId(), "="));
			//2.获取订舱信息
			List<EoRequestBookingModel> eoRequestBookingModels = eoRequestBookingManager.findByCondition(eorbFilterCondition);
			Long number = 0L;
			Long afterNumber = 0L;
			Double epcfPrice = 0.00;
			Double afterEpcfPrice = 0.00;
			if (EmptyUtils.isNotEmpty(eoRequestBookingModels)) {
				EoRequestBookingModel eoRequestBookingModel = eoRequestBookingModels.get(0);
				List<FilterCondition> eosrFilterCondition = new ArrayList<>();
				eosrFilterCondition.add(new FilterCondition("eobtEorbId", eoRequestBookingModel.getEorbId(), "="));
				//3.获取订舱预配箱信息
				List<EoEorb2EosrModel> eoEorb2EosrModels = eoEorb2EosrManager.findByCondition(eosrFilterCondition);
				
				if (EmptyUtils.isNotEmpty(elProtocolCostFeelModels)) {
					for (ElProtocolCostFeelModel elProtocolCostFeelModel:elProtocolCostFeelModels) {
						if (EmptyUtils.isNotEmpty(eoEorb2EosrModels)) {
							//3.如果是箱的时候，计算根据箱型
							if (Constants.EPCF_FORMULA_BOX.equals(elProtocolCostFeelModel.getEpcfFormula())) {
								if (EmptyUtils.isNotEmpty(eoEorb2EosrModels)) {
									for (EoEorb2EosrModel eoEorb2EosrModel : eoEorb2EosrModels) {
										//3.1根据尺寸和箱型匹配计算方式
										if (EmptyUtils.isEqual(eoEorb2EosrModel.getEobtCntCustomized(),elProtocolCostFeelModel.getEpcfContainerSize()) && EmptyUtils.isEqual(eoEorb2EosrModel.getEobtCntCustomizedSize(), elProtocolCostFeelModel.getEpcfContainerType())) {
											//3.2获取订单预配箱数量
											number += eoEorb2EosrModel.getEobtCtnNumber() == null ? 0L : eoEorb2EosrModel.getEobtCtnNumber();
											afterNumber = eoEorb2EosrModel.getEobtCtnNumber() == null ? 0L : eoEorb2EosrModel.getEobtCtnNumber();
											epcfPrice += elProtocolCostFeelModel.getEpcfPrice() * afterNumber;
											afterEpcfPrice += elProtocolCostFeelModel.getEpcfPrice();
										}
									}
								}
							}
						}
					}
				}
				
			}
			//报关
			List<FilterCondition> eoddFilterCondition = new ArrayList<>();
			eoddFilterCondition.add(new FilterCondition("eoddEoorId", eoOrderModel.getEoorId(), "="));
			List<EoRequestDeclarationDeputeModel> eoRequestDeclarationDeputeModels = eoRequestDeclarationDeputeManager.findByCondition(eoddFilterCondition);
			if (EmptyUtils.isNotEmpty(elProtocolCostFeelModels)) {
				for (ElProtocolCostFeelModel elProtocolCostFeelModel:elProtocolCostFeelModels) {
//					Long number = 0L;
					if (EmptyUtils.isNotEmpty(eoRequestDeclarationDeputeModels)) {
						//3.如果是单的时候，计算根据单*1
						if (Constants.EPCF_FORMULA_SINEGLE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
							number = Long.valueOf(eoRequestDeclarationDeputeModels.size());
							epcfPrice = elProtocolCostFeelModel.getEpcfPrice() * number;
							afterEpcfPrice = elProtocolCostFeelModel.getEpcfPrice() ;
						}
					}
				}
			}
			//一口价
			if (EmptyUtils.isNotEmpty(elProtocolCostFeelModels)) {
				for (ElProtocolCostFeelModel elProtocolCostFeelModel:elProtocolCostFeelModels) {
//					Long number = 0L;
					//3.如果是一口价的时候，计算根据一口价*1
					if (Constants.EPCF_FORMULA_PRICE.equals(elProtocolCostFeelModel.getEpcfFormula())) {
						number = 1L;
						epcfPrice = elProtocolCostFeelModel.getEpcfPrice();
					}
				}
			}
			efBusinessFeesModels = this.getEfBusinessFeesModelByEpctId(elProtocolCostModel,eoOrderModel,number,epcfPrice,afterEpcfPrice);
			try {
				responseData = this.batchSaveBusinessFees(efBusinessFeesModels);
			} catch (Exception e) {
//						log.error("自动生成费用异常，" + responseData);
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
	public List<EfBusinessFeesModel> getEfBusinessFeesModelByEpctId(ElProtocolCostModel elProtocolCostModel,EoOrderModel eoOrderModel,Long number,Double price,Double afterEpcfPrice){
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
//			log.error("汇率日期转换异常");
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
			if (number == 0L){
				afterEpcfPrice = afterEpcfPrice * number;
			} 
			efBusinessFeesModel.setEfbfPrice(afterEpcfPrice);//单价
			efBusinessFeesModel.setEfbfEoorId(eoOrderModel.getEoorId());//订单主键
			efBusinessFeesModel.setEfbfEscoId(eoOrderModel.getEoorEscoId());//公司主键
			efBusinessFeesModel.setEfbfQuantity(number);//数量
			efBusinessFeesModel.setEfbfExchangeRate(ebExchangeRateModelList.get(0).getEberConversionRate());//汇率
			//计算结算金额和含税价保留两位小数
			BigDecimal bigDecimal = new BigDecimal(amount);  
			Double  total = bigDecimal.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue(); 
			efBusinessFeesModel.setEfbfAmount(total);//结算金额
			efBusinessFeesModel.setEfbfTaxAmount(total);//含税价
			//免税
			if (elProtocolCostModel.getEpctIsDutyfree().equals(Constants.IS_DUTYFREE_STRING)) {
				efBusinessFeesModel.setEfbfTaxRate(0.00);
				efBusinessFeesModel.setEfbfTaxFee(amount);//不含税价
			}
			//非免税
			if (elProtocolCostModel.getEpctIsDutyfree().equals(Constants.NOT_DUTYFREE_STRING)) {
				Double afterAmount  = (amount) / (1 + elProtocolCostModel.getEpctTaxRate());
				BigDecimal afterBigDecimal = new BigDecimal(afterAmount);  
				Double  afterTotal = afterBigDecimal.setScale(2,   BigDecimal.ROUND_HALF_UP).doubleValue();
				efBusinessFeesModel.setEfbfTaxFee(afterTotal);//不含税价
			}
			efBusinessFeesModelList.add(efBusinessFeesModel);
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
}
