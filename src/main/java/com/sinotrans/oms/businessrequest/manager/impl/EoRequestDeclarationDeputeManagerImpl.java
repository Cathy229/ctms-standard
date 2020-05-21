package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoDeclarationDeputeDto;
import com.sinotrans.oms.businessrequest.manager.DpInTrackManager;
import com.sinotrans.oms.businessrequest.manager.EoEoddBillManager;
import com.sinotrans.oms.businessrequest.manager.EoEoddFeedbackManager;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoddManager;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EodmManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestDeclarationDeputeManager;
import com.sinotrans.oms.businessrequest.model.DpInTrackModel;
import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoddModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EodmModel;
import com.sinotrans.oms.businessrequest.model.EoRequestDeclarationDeputeModel;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.manager.ProcedureManager;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.customerproject.manager.EbCustomerContactManager;
import com.sinotrans.oms.customerproject.manager.EbCustomerManager;
import com.sinotrans.oms.customerproject.model.EbCustomerContactModel;
import com.sinotrans.oms.customerproject.model.EbCustomerModel;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;
/**
 * 
 * 
 * <p>Description: 委托报关
 *    
 * </p>
 *
 * @author Richard
 * @version 1.00
 * <pre>
 * 
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 2018年8月8日下午7:10:09   Richard       	               创建
 * 
 * 
 * </pre>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoRequestDeclarationDeputeManagerImpl extends MybatisManagerImpl implements EoRequestDeclarationDeputeManager{
	
	@Autowired
	public EoEoddBillManager eoEoddBillManager;//报关随附单据表
	@Autowired
	public EoEooc2EoddManager eoEooc2EoddManager;//报关集装箱信息表
	@Autowired
	public EoEoom2EodmManager eoEoom2EodmManager;//报关集装箱物料表
	@Autowired
	public EoOrderManager eoOrderManager;//订单信息表
	@Autowired
	private ProcedureManager procedureManager;//存储过程调用服务
	@Autowired
	public EoEoddFeedbackManager EoEoddFeedbackManager;
	@Autowired
	private CommonQueryManager commonQueryManager;
	@Autowired
	private EbCustomerContactManager ebCustomerContactManager;
	@Autowired
	private EbCustomerManager ebCustomerManager;
	@Autowired
	private DpInTrackManager dpInTrackManager;
	@Override
	public EoRequestDeclarationDeputeModel get(Long id) {
		
		return this.myBatisDao.get(EoRequestDeclarationDeputeModel.class, id);
	}

	@Override
	public List<EoRequestDeclarationDeputeModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoRequestDeclarationDeputeModel.class, null, null, conditions);
	}

	@Override
	public EoRequestDeclarationDeputeModel save(EoRequestDeclarationDeputeModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoRequestDeclarationDeputeModel> saveAll(List<EoRequestDeclarationDeputeModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoRequestDeclarationDeputeModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoRequestDeclarationDeputeModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoRequestDeclarationDeputeModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoRequestDeclarationDeputeModel.class, ids);
	}

	/**
	 * 委托报关任务保存
	 */
	@Override
	public ResponseData<EoRequestDeclarationDeputeModel> saveDeclarationDepute(
			EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel) {
		ResponseData<EoRequestDeclarationDeputeModel> responseDate =new ResponseData<EoRequestDeclarationDeputeModel>();
		if(null != eoRequestDeclarationDeputeModel){
			responseDate.setData(save(eoRequestDeclarationDeputeModel));
			return responseDate;
		}
		return null;
	}

	@Override
	public EoDeclarationDeputeDto saveDeclarationDeputeAndMaterial(EoDeclarationDeputeDto eoDeclarationDeputeDto) {
		if (null  != eoDeclarationDeputeDto) {
			EoDeclarationDeputeDto afterEooDeclarationDeputeDto = new EoDeclarationDeputeDto();
			
			EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel = eoDeclarationDeputeDto.getEoRequestDeclarationDeputeModel();
			List<EoEoddBillModel> eoEoddBillModelList = eoDeclarationDeputeDto.getEoEoddBillModelList();
			List<EoEooc2EoddModel> eoEooc2EoddModelList = eoDeclarationDeputeDto.getEoEooc2EoddModelList();
			List<EoEoom2EodmModel> eoEoom2EodmModelList = eoDeclarationDeputeDto.getEoEoom2EodmModelList();
			
			EoRequestDeclarationDeputeModel afterRequestDeclarationDeputeModel = this.save(eoRequestDeclarationDeputeModel);
			afterEooDeclarationDeputeDto.setEoRequestDeclarationDeputeModel(afterRequestDeclarationDeputeModel);
			if (null == afterRequestDeclarationDeputeModel) {
				afterEooDeclarationDeputeDto.setErrm("保存失败，请重试！");
				return afterEooDeclarationDeputeDto;
			}
			
			
			if(EmptyUtils.isNotEmpty(eoEoddBillModelList)){
				for (EoEoddBillModel eoEoddBillModel : eoEoddBillModelList) {
					eoEoddBillModel.setEoebEoddId(afterRequestDeclarationDeputeModel.getEoddId());
				}
				List<EoEoddBillModel> afterEoEoddBillModelList = eoEoddBillManager.saveAll(eoEoddBillModelList);
				afterEooDeclarationDeputeDto.setEoEoddBillModelList(afterEoEoddBillModelList);
			}
			if(EmptyUtils.isNotEmpty(eoEooc2EoddModelList)){
				for (EoEooc2EoddModel eoEooc2EoddModel : eoEooc2EoddModelList) {
					eoEooc2EoddModel.setEocdEoddId(afterRequestDeclarationDeputeModel.getEoddId());
				}
				List<EoEooc2EoddModel> afterEoEooc2EoddModelList = eoEooc2EoddManager.saveAll(eoEooc2EoddModelList);
				afterEooDeclarationDeputeDto.setEoEooc2EoddModelList(afterEoEooc2EoddModelList);
			}
			if(EmptyUtils.isNotEmpty(eoEoom2EodmModelList)){
				for (EoEoom2EodmModel eoEoom2EodmModel : eoEoom2EodmModelList) {
					eoEoom2EodmModel.setEodmEoddId(afterRequestDeclarationDeputeModel.getEoddId());
				}
				List<EoEoom2EodmModel> afterEoEoom2EodmModel = eoEoom2EodmManager.saveAll(eoEoom2EodmModelList);
				afterEooDeclarationDeputeDto.setEoEoom2EodmModelList(afterEoEoom2EodmModel);
			}
			return afterEooDeclarationDeputeDto;
			
		}
		return null;
	}

	/**
	 * 报关下达
	 */
	@Override
	public String issuedDeclarationDepute(Long[] eoddIds) {
		if(null!=eoddIds && eoddIds.length>0){
			String errm= null;
			for (Long eoddId : eoddIds) {
				if(null!=eoddId){
					EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel=this.get(eoddId);
					
					String msg = checkEootCarrierEbcuContractEmail(eoRequestDeclarationDeputeModel);
					
					if (EmptyUtils.isNotEmpty(msg)) {
						return msg;
					}
					
					this.saveDpInTrack(eoRequestDeclarationDeputeModel);
					
					//下达时修改业务请求状态为已下达，执行状态为可执行，用于存储过程中调用
					eoRequestDeclarationDeputeModel.setEoddStatus(Constants.SYS_TMS_STATUS_ISSUED);//已下达
					eoRequestDeclarationDeputeModel.setEoddTaskStatus(Constants.SYS_TMS_TASK_STATUS_DO);//可执行
					this.myBatisDao.update(eoRequestDeclarationDeputeModel);
					//调用下达存储过程
					if(null!=eoRequestDeclarationDeputeModel.getEoddEbtkId()){
						Long ebtkId=eoRequestDeclarationDeputeModel.getEoddEbtkId();
						//String errm=procedureManager.requestIssued(eoddId,ebtkId);
					}
				}
			}
			return errm;
		}
		return null;
	}
	
	@Override
	public QueryData getDeclarationDeputeByCondition(
			QueryInfo queryInfo) {
		queryInfo.setQueryType("EoDeclarationDeputeListQuery");
		return commonQueryManager.query(queryInfo);
	}

	@Override
	public EoDeclarationDeputeDto getDeclarationDeputeAndMaterialById(Long eoddId) {
		if(null!=eoddId){
			EoDeclarationDeputeDto eoDeclarationDeputeDto=new EoDeclarationDeputeDto();
			//1 查询报关主信息
			EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel=this.get(eoddId);
			
			//2 查询报关物料信息
			FilterCondition eodmFilterCondition=new FilterCondition();
			eodmFilterCondition.setFieldName("eodmEoddId");
			eodmFilterCondition.setFieldValue(eoddId);
			eodmFilterCondition.setOperator("=");
			List<FilterCondition> eodmConditions=new ArrayList<FilterCondition>();
			eodmConditions.add(eodmFilterCondition);
			List<EoEoom2EodmModel> eoEoom2EodmModelList=eoEoom2EodmManager.findByCondition(eodmConditions);
			
			//3 查询报关集装箱信息
			FilterCondition eocdFilterCondition=new FilterCondition();
			eocdFilterCondition.setFieldName("eocdEoddId");
			eocdFilterCondition.setFieldValue(eoddId);
			eocdFilterCondition.setOperator("=");
			List<FilterCondition> eocdConditions=new ArrayList<FilterCondition>();
			eocdConditions.add(eocdFilterCondition);
			List<EoEooc2EoddModel> eoEooc2EoddModelList=eoEooc2EoddManager.findByCondition(eocdConditions);
			
			//4 查询报关随附单据信息
			FilterCondition eoebFilterCondition=new FilterCondition();
			eoebFilterCondition.setFieldName("eoebEoddId");
			eoebFilterCondition.setFieldValue(eoddId);
			eoebFilterCondition.setOperator("=");
			List<FilterCondition> eoebConditions=new ArrayList<FilterCondition>();
			eoebConditions.add(eoebFilterCondition);
			List<EoEoddBillModel> eoEoddBillModelList=eoEoddBillManager.findByCondition(eoebConditions);
			
			//5.查询报关所订单
			EoOrderModel eoOrderModel = eoOrderManager.get(eoRequestDeclarationDeputeModel.getEoddEoorId());
			
			
			//6.查询报关任务
			FilterCondition declarationFilterCondition=new FilterCondition();
			declarationFilterCondition.setFieldName("eoddEoorId");
			declarationFilterCondition.setFieldValue(eoRequestDeclarationDeputeModel.getEoddEoorId());
			declarationFilterCondition.setOperator("=");
			List<FilterCondition> declarationConditions=new ArrayList<FilterCondition>();
			declarationConditions.add(declarationFilterCondition);
			List<EoRequestDeclarationDeputeModel> eoRequestDeclarationDeputeModelList=this.findByCondition(declarationConditions);
			
			//5给dto赋值
			eoDeclarationDeputeDto.setEoRequestDeclarationDeputeModel(eoRequestDeclarationDeputeModel);
			eoDeclarationDeputeDto.setEoEooc2EoddModelList(eoEooc2EoddModelList);
			eoDeclarationDeputeDto.setEoEoom2EodmModelList(eoEoom2EodmModelList);
			eoDeclarationDeputeDto.setEoEoddBillModelList(eoEoddBillModelList);
			eoDeclarationDeputeDto.setEoOrderModel(eoOrderModel);
			eoDeclarationDeputeDto.setEoRequestDeclarationDeputeModelList(eoRequestDeclarationDeputeModelList);
			
			return eoDeclarationDeputeDto;
		}
		return null;
	}
	
	public EoRequestDeclarationDeputeModel updateModel(EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel) {
		
		return this.myBatisDao.update(eoRequestDeclarationDeputeModel);
	}
	
	@Override
	public ResponseData<EoRequestDeclarationDeputeModel> getDeclarationDeputeByEoddBlNoAndEoddEoorId(
			EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel) {
		ResponseData<EoRequestDeclarationDeputeModel> responseData = new ResponseData<EoRequestDeclarationDeputeModel>();
		if (null != eoRequestDeclarationDeputeModel) {
			if(Constants.SYS_STOCKIN_STATUS_UNISSUED.equals(eoRequestDeclarationDeputeModel.getEoddStatus()) ){
				if(null == eoRequestDeclarationDeputeModel.getEoddBlNo()|| "".equals(eoRequestDeclarationDeputeModel.getEoddBlNo())){
					responseData.setCode(Constants.NO);
					responseData.setMsg("提运单号不能为空");
					return responseData;
				}
			}
			List<FilterCondition> eoddConditions=new ArrayList<FilterCondition>();
			eoddConditions.add(new FilterCondition("eoddEoorId", eoRequestDeclarationDeputeModel.getEoddEoorId(), "="));
			eoddConditions.add(new FilterCondition("eoddBlNo", eoRequestDeclarationDeputeModel.getEoddBlNo(), "="));
			List<EoRequestDeclarationDeputeModel> eoRequestDeclarationDeputes = this.findByCondition(eoddConditions);
			if (EmptyUtils.isNotEmpty(eoRequestDeclarationDeputes)) {
				for (EoRequestDeclarationDeputeModel eoRequestDeclarationDepute : eoRequestDeclarationDeputes) {
					if (null == eoRequestDeclarationDeputeModel.getEoddId() || "".equals(eoRequestDeclarationDeputeModel.getEoddId())) {//验证是否为新增
						if (EmptyUtils.isNotEmpty(eoRequestDeclarationDeputes)) {
							responseData.setCode(Constants.NO);
							responseData.setMsg("提运单号不能重复");
							return responseData;
						} else {
							responseData.setCode(Constants.YES);
							return responseData;
						}
					} else if (EmptyUtils.isEqual(eoRequestDeclarationDepute.getEoddId(), eoRequestDeclarationDeputeModel.getEoddId())) {
						//判断是否为修改的报关信息，如果是修改信息，查出来的信息和传进来的信息主键一直则提运单号不用校验
						responseData.setCode(Constants.YES);
						return responseData;
					} else {
						responseData.setCode(Constants.NO);
						responseData.setMsg("提运单号不能重复");
						return responseData;
					}
				}
			}
		}
		return responseData;
	}

	@Override
	public EoDeclarationDeputeDto getDeclarationDeputeAndMaterialByEoordId(Long eoorId) {
		if (null!=eoorId) {
			EoDeclarationDeputeDto eoDeclarationDeputeDto=new EoDeclarationDeputeDto();
			
			//1.查询报关订单
			EoOrderModel eoOrderModel = eoOrderManager.get(eoorId);
			
			//2.查询报关主信息
			FilterCondition eoddFilterCondition = new FilterCondition();
			eoddFilterCondition.setFieldName("eoddEoorId");
			eoddFilterCondition.setFieldValue(eoorId);
			eoddFilterCondition.setOperator("=");
			List<FilterCondition> eoddConditions = new ArrayList<FilterCondition>();
			eoddConditions.add(eoddFilterCondition);
			List<EoRequestDeclarationDeputeModel> eoRequestDeclarationDeputeModelList = this.findByCondition(eoddConditions);
			
			if (EmptyUtils.isNotEmpty(eoRequestDeclarationDeputeModelList)) {
				for (int i=0;i<eoRequestDeclarationDeputeModelList.size();i++) {
					if (Constants.SYS_STOCKIN_STATUS_UNISSUED.equals(eoRequestDeclarationDeputeModelList.get(i).getEoddStatus())) {
						
						//2 查询报关物料信息
						FilterCondition eodmFilterCondition = new FilterCondition();
						eodmFilterCondition.setFieldName("eodmEoddId");
						eodmFilterCondition.setFieldValue(eoRequestDeclarationDeputeModelList.get(0).getEoddId());
						eodmFilterCondition.setOperator("=");
						List<FilterCondition> eodmConditions=new ArrayList<FilterCondition>();
						eodmConditions.add(eodmFilterCondition);
						List<EoEoom2EodmModel> eoEoom2EodmModelList=eoEoom2EodmManager.findByCondition(eodmConditions);
						
						//3 查询报关集装箱信息
						FilterCondition eocdFilterCondition=new FilterCondition();
						eocdFilterCondition.setFieldName("eocdEoddId");
						eocdFilterCondition.setFieldValue(eoRequestDeclarationDeputeModelList.get(0).getEoddId());
						eocdFilterCondition.setOperator("=");
						List<FilterCondition> eocdConditions=new ArrayList<FilterCondition>();
						eocdConditions.add(eocdFilterCondition);
						List<EoEooc2EoddModel> eoEooc2EoddModelList=eoEooc2EoddManager.findByCondition(eocdConditions);
						
						//4 查询报关随附单据信息
						FilterCondition eoebFilterCondition=new FilterCondition();
						eoebFilterCondition.setFieldName("eoebEoddId");
						eoebFilterCondition.setFieldValue(eoRequestDeclarationDeputeModelList.get(0).getEoddId());
						eoebFilterCondition.setOperator("=");
						List<FilterCondition> eoebConditions=new ArrayList<FilterCondition>();
						eoebConditions.add(eoebFilterCondition);
						List<EoEoddBillModel> eoEoddBillModelList=eoEoddBillManager.findByCondition(eoebConditions);
						
						//5给dto赋值
						eoDeclarationDeputeDto.setEoRequestDeclarationDeputeModel(eoRequestDeclarationDeputeModelList.get(0));
						eoDeclarationDeputeDto.setEoEooc2EoddModelList(eoEooc2EoddModelList);
						eoDeclarationDeputeDto.setEoEoom2EodmModelList(eoEoom2EodmModelList);
						eoDeclarationDeputeDto.setEoEoddBillModelList(eoEoddBillModelList);
						
						break;
					}
				}
			}
			eoDeclarationDeputeDto.setEoOrderModel(eoOrderModel);
			eoDeclarationDeputeDto.setEoRequestDeclarationDeputeModelList(eoRequestDeclarationDeputeModelList);
			
			return eoDeclarationDeputeDto;
		}
		return null;
	}
	
	/**
	 * @deprecated:根据报关任务获取分供方的邮件地址
	 * @author Colley.Bai  
	 * @date 2018年12月3日
	 * @param eoRequestDeclarationDeputeModel
	 * @return
	 */
	private String checkEootCarrierEbcuContractEmail(EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel) {
		String errm = "";
		Long ebcuId = eoRequestDeclarationDeputeModel.getEoddCustomsBrokerId();
		String ebccIsDefault = "";//是否默认联系人
		String ebccEmail = "";//报关下达需要发送邮件的地址
		if (null == ebcuId) {
			errm += /*"请求编号：" + eoRequestDeclarationDeputeModel.getEoddNo() + */"报关行不存在，请维护！\n";
		} else {
			EbCustomerModel ebCustomerModel = this.ebCustomerManager.get(ebcuId);
			if (null == ebCustomerModel) {
				errm += /*"请求编号：" + eoRequestDeclarationDeputeModel.getEoddNo() + */"报关行在基础数据中不存在，请维护！\n";
			} else {
				String ebcuStatus = ebCustomerModel.getEbcuCustomerStatus();
				if (EmptyUtils.isNotEmpty(ebcuStatus) && !Constants.SYS_STATUS_ENABLE.equals(ebcuStatus)) {
					errm += /*"请求编号：" + eoRequestDeclarationDeputeModel.getEoddNo() + */"报关行已经停用，请查看！\n";
				} else {
					List<FilterCondition> conditions = new ArrayList<>();
					conditions.add(new FilterCondition("ebccEbcuId", ebcuId, "="));
					List<EbCustomerContactModel> ebCustomerContactModels = this.ebCustomerContactManager.findByCondition(conditions);
					if (EmptyUtils.isEmpty(ebCustomerContactModels)) {
						errm += /*"请求编号：" + eoRequestDeclarationDeputeModel.getEoddNo() + */"报关行联系人不存在，请维护！\n";
					} else {
						for (int i = 0; i < ebCustomerContactModels.size(); i++) {
							ebccIsDefault = ebCustomerContactModels.get(i).getEbccIsDefault();
							if (EmptyUtils.isNotEmpty(ebccIsDefault) && Constants.YES.equals(ebccIsDefault)) {
								ebccEmail = ebCustomerContactModels.get(i).getEbccEmail();
								if (EmptyUtils.isEmpty(ebccEmail)) {
									errm += /*"请求编号：" + eoRequestDeclarationDeputeModel.getEoddNo() + */"报关行联系人邮箱不存在，请维护！\n";
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
								errm += /*"请求编号：" + eoRequestDeclarationDeputeModel.getEoddNo() + */"报关行联系人邮箱不存在，请维护！\n";
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
								errm += /*"请求编号：" + eoRequestDeclarationDeputeModel.getEoddNo() + */"报关行联系人邮箱不存在，请维护！\n";
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
	
	@Override
	public void saveDpInTrack(EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel) {
		List<FilterCondition> filterCondition = new ArrayList<>();
		filterCondition.add(new FilterCondition("dpitBridId",eoRequestDeclarationDeputeModel.getEoddId(),"="));
		filterCondition.add(new FilterCondition("dpitOrderId",eoRequestDeclarationDeputeModel.getEoddEoorId(),"="));
		if (EmptyUtils.isNotEmpty(eoRequestDeclarationDeputeModel.getEoddStatus()) && Constants.SYS_STOCKIN_STATUS_COMPLETED.equals(eoRequestDeclarationDeputeModel.getEoddStatus())) {
			filterCondition.add(new FilterCondition("dpitType",Constants.DPIT_TYPE_DECLARATION_COMPLETE,"="));
		} else if (EmptyUtils.isNotEmpty(eoRequestDeclarationDeputeModel.getEoddStatus()) && Constants.SYS_STOCKIN_STATUS_UNISSUED.equals(eoRequestDeclarationDeputeModel.getEoddStatus())) {
			filterCondition.add(new FilterCondition("dpitType",Constants.DPIT_TYPE_DECLARATION_ISSUSED,"="));
		}
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
			dpInTrackModel.setDpitBridId(eoRequestDeclarationDeputeModel.getEoddId());
			//订单ID
			dpInTrackModel.setDpitOrderId(eoRequestDeclarationDeputeModel.getEoddEoorId());
			if (EmptyUtils.isNotEmpty(eoRequestDeclarationDeputeModel.getEoddStatus()) && Constants.SYS_STOCKIN_STATUS_COMPLETED.equals(eoRequestDeclarationDeputeModel.getEoddStatus())) {
				//内部状态
				dpInTrackModel.setDpitType(Constants.DPIT_TYPE_DECLARATION_COMPLETE);
			} else if (EmptyUtils.isNotEmpty(eoRequestDeclarationDeputeModel.getEoddStatus()) && Constants.SYS_STOCKIN_STATUS_UNISSUED.equals(eoRequestDeclarationDeputeModel.getEoddStatus())) {
				//内部状态
				dpInTrackModel.setDpitType(Constants.DPIT_TYPE_DECLARATION_ISSUSED);
			}
			//业务操作时间
			dpInTrackModel.setDpitOperatorTime(new Date());
			//业务操作人
			dpInTrackModel.setDpitOperator(user.getUserId());
			dpInTrackManager.save(dpInTrackModel);
		}
	}	
}
