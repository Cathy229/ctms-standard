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
import com.sinotrans.oms.businessrequest.dto.EoTrailerDto;
import com.sinotrans.oms.businessrequest.manager.DpInTrackManager;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoetManager;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EoetManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestTrailerManager;
import com.sinotrans.oms.businessrequest.model.DpInTrackModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.businessrule.manager.EsControlParamManager;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.manager.ProcedureManager;
import com.sinotrans.oms.common.tool.SendMailUtil;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.customerproject.manager.EbCustomerContactManager;
import com.sinotrans.oms.customerproject.manager.EbCustomerManager;
import com.sinotrans.oms.customerproject.model.EbCustomerContactModel;
import com.sinotrans.oms.customerproject.model.EbCustomerModel;
import com.sinotrans.oms.eoorder.manager.EoOrderContainerManager;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoRequestTrailerManagerImpl extends MybatisManagerImpl implements EoRequestTrailerManager{
	
	@Autowired
	private EoEoom2EoetManager eoEoom2EoetManager;//拖车货物
	
	@Autowired
	private EoEooc2EoetManager eoEooc2EoetManager;//拖车集装箱
	
	@Autowired
	private ProcedureManager procedureManager;//存储过程调用服务
	
	@Autowired
	private EoOrderManager eoOrderManager;//订单
	
	@Autowired
	private CommonQueryManager commonQueryManager;
	@Autowired
	private EbCustomerManager ebCustomerManager;
	@Autowired
	private EbCustomerContactManager ebCustomerContactManager;
	@Autowired
	private EoOrderContainerManager eoOrderContainerManager; 
	@Autowired
	private DpInTrackManager dpInTrackManager;
	@Autowired
	private EsControlParamManager esControlParamManager;
	@Override
	public EoRequestTrailerModel get(Long id) {
		
		return this.myBatisDao.get(EoRequestTrailerModel.class, id);
	}

	@Override
	public List<EoRequestTrailerModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoRequestTrailerModel.class, null, null, conditions);
	}

	@Override
	public EoRequestTrailerModel save(EoRequestTrailerModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoRequestTrailerModel> saveAll(List<EoRequestTrailerModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoRequestTrailerModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoRequestTrailerModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoRequestTrailerModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoRequestTrailerModel.class, ids);
	}

	
	@Override
	public ResponseData<EoTrailerDto> saveTrailerAndMaterial(EoTrailerDto eoTrailerDto) {
		ResponseData<EoTrailerDto> responseData = new ResponseData<>();
		if (null!=eoTrailerDto) {
			EoTrailerDto afterEoTrailerDto=new EoTrailerDto();
			EoRequestTrailerModel eoRequestTrailerModel=eoTrailerDto.getEoRequestTrailerModel();
			List<EoEoom2EoetModel> eoEoom2EoetModelList=eoTrailerDto.getEoEoom2EoetModelList();
			List<EoEooc2EoetModel> eoEooc2EoetModelList =eoTrailerDto.getEoEooc2EoetModelList();
			//拖车保存
			EoRequestTrailerModel afterEoRequestTrailerModel=this.save(eoRequestTrailerModel);
			/**
			 * add by Colley.Bai 2019年03月15日 增加拖车信息要求送达时间到订单的要求送达时间同步 
			 */
			this.updateEoOrderModel(afterEoRequestTrailerModel);
			if (null != afterEoRequestTrailerModel) {
				afterEoTrailerDto.setEoRequestTrailerModel(afterEoRequestTrailerModel);
				//拖车货物保存
				if(EmptyUtils.isNotEmpty(eoEoom2EoetModelList)){
					for (EoEoom2EoetModel eoEoom2EoetModel : eoEoom2EoetModelList) {
						eoEoom2EoetModel.setEomtEoetId(afterEoRequestTrailerModel.getEoetId());
					}
					List<EoEoom2EoetModel> afterEoEoom2EoetModelList=eoEoom2EoetManager.saveAll(eoEoom2EoetModelList);
					afterEoTrailerDto.setEoEoom2EoetModelList(afterEoEoom2EoetModelList);
				}
				//拖车集装箱保存
				if(EmptyUtils.isNotEmpty(eoEooc2EoetModelList)){
					for (EoEooc2EoetModel eoEooc2EoetModel : eoEooc2EoetModelList) {
						eoEooc2EoetModel.setEootEoetId(afterEoRequestTrailerModel.getEoetId());
					}
					List<EoEooc2EoetModel> afterEoEooc2EoetModelList=eoEooc2EoetManager.saveAll(eoEooc2EoetModelList);
					afterEoTrailerDto.setEoEooc2EoetModelList(afterEoEooc2EoetModelList);
				}
				this.procedureManager.invokeAfterSaveBrEvent(eoRequestTrailerModel.getEoetEbtkId(), Constants.TASK_TYPE_EXPORT_TRAILER, eoRequestTrailerModel.getEoetId());
				responseData.setData(afterEoTrailerDto);
				return responseData;
			} else {
				responseData.setCode(Constants.NO);
				responseData.setMsg("拖车信息保存失败，请重试！");
				responseData.setData(eoTrailerDto);
				return responseData;
			}
		}
		return responseData;
	}

	/**
	 * @deprecated:跟新订单信息（要求提货时间，要求送达时间）
	 * @author Colley.Bai  
	 * @date 2019年3月15日
	 * @param eoRequestTrailerModel
	 */
	public void updateEoOrderModel(EoRequestTrailerModel eoRequestTrailerModel){
		if (null != eoRequestTrailerModel) {
			List<FilterCondition> filterCondition = new ArrayList<>();
			filterCondition.add(new FilterCondition("eoorId", eoRequestTrailerModel.getEoetEoorId(),"="));
			List<EoOrderModel> eoOrderModelList = eoOrderManager.findByCondition(filterCondition);
			if (EmptyUtils.isNotEmpty(eoOrderModelList)) {
				for (EoOrderModel eoOrderModel : eoOrderModelList) {
					if (null != eoRequestTrailerModel.getEoetReqArrivalDate()) {
						eoOrderModel.setEoorReqArrivalDate(eoRequestTrailerModel.getEoetReqArrivalDate());
					}
					if (null != eoRequestTrailerModel.getEoetReqDeliveryDate()) {
						eoOrderModel.setEoorReqDeliveryDate(eoRequestTrailerModel.getEoetReqDeliveryDate());
					}
					eoOrderManager.save(eoOrderModel);
				}
			}
		}
	}
	
	@Override
	public String issuedTrailer(Long[] eoetIds) {
		if (null != eoetIds && eoetIds.length > 0){
			String errm = null;
			String generateEdiTrailerIs = this.esControlParamManager.getIsCompanyValue("GENERATE_EDI_TRAILER_IS");
			for (Long eoetId : eoetIds) {
				if(null!=eoetId){
					EoRequestTrailerModel eoRequestTrailerModel = this.myBatisDao.get(EoRequestTrailerModel.class,eoetId);
					
					String msg = this.getEootCarrierEbcuContractEmail(eoRequestTrailerModel);
					
					if (EmptyUtils.isNotEmpty(msg)) {
						return msg;
					}
					this.saveDpInTrack(eoRequestTrailerModel);
					
					//下达时修改业务请求状态为已下达，执行状态为可执行，用于存储过程中调用
					eoRequestTrailerModel.setEoetStatus(Constants.SYS_TMS_STATUS_ISSUED);//已下达
					eoRequestTrailerModel.setEoetTaskStatus(Constants.SYS_TMS_TASK_STATUS_DO);//可执行
					this.myBatisDao.update(eoRequestTrailerModel);
					String eoetTrailerCompanyName = eoRequestTrailerModel.getEoetTrailerCompanyNo();
					
					//调用下达存储过程
					if(null != eoRequestTrailerModel.getEoetEbtkId() && EmptyUtils.isNotEmpty(generateEdiTrailerIs) && EmptyUtils.isNotEmpty(eoetTrailerCompanyName) && eoetTrailerCompanyName.equals(generateEdiTrailerIs)){
						Long ebtkId=eoRequestTrailerModel.getEoetEbtkId();
						errm = procedureManager.requestIssued(eoetId,ebtkId);
					}
				}
			}
			return errm;
		}
		return null;
	}

	
	@Override
	public EoTrailerDto getTrailerAndMaterialById(Long eoetId) {
		if(null!=eoetId){
			EoTrailerDto eoTrailerDto=new EoTrailerDto();
			//1 查询拖车主信息
			EoRequestTrailerModel eoRequestTrailerModel=this.get(eoetId);
			
			//2 查询拖车物料信息
			FilterCondition eomtFilterCondition=new FilterCondition();
			eomtFilterCondition.setFieldName("eomtEoetId");
			eomtFilterCondition.setFieldValue(eoetId);
			eomtFilterCondition.setOperator("=");
			List<FilterCondition> eomtConditions=new ArrayList<FilterCondition>();
			eomtConditions.add(eomtFilterCondition);
			List<EoEoom2EoetModel> eoEoom2EoetModelList=eoEoom2EoetManager.findByCondition(eomtConditions);
			
			//3 查询拖车集装箱信息
			FilterCondition eoocFilterCondition=new FilterCondition();
			eoocFilterCondition.setFieldName("eootEoetId");
			eoocFilterCondition.setFieldValue(eoetId);
			eoocFilterCondition.setOperator("=");
			List<FilterCondition> eoocConditions=new ArrayList<FilterCondition>();
			eoocConditions.add(eoocFilterCondition);
			List<EoEooc2EoetModel> eoEooc2EoetModelList=eoEooc2EoetManager.findByCondition(eoocConditions);
			
			//4.查询订单信息
			EoOrderModel eoOrderModel =  eoOrderManager.get(eoRequestTrailerModel.getEoetEoorId());
			
			FilterCondition eoContainerFilterCondition=new FilterCondition();
			eoContainerFilterCondition.setFieldName("eoocEoorId");
			eoContainerFilterCondition.setFieldValue(eoRequestTrailerModel.getEoetEoorId());
			eoContainerFilterCondition.setOperator("=");
			List<FilterCondition> eoContainerConditions=new ArrayList<FilterCondition>();
			eoContainerConditions.add(eoContainerFilterCondition);
			//5.查询实装箱信息
			List<EoOrderContainerModel> eoOrderContainerModelList =  eoOrderContainerManager.findByCondition(eoContainerConditions);
			
			//4 给dto赋值
			eoTrailerDto.setEoRequestTrailerModel(eoRequestTrailerModel);
			eoTrailerDto.setEoEoom2EoetModelList(eoEoom2EoetModelList);
			eoTrailerDto.setEoEooc2EoetModelList(eoEooc2EoetModelList);
			eoTrailerDto.setEoOrderModel(eoOrderModel);
			eoTrailerDto.setEoOrderContainerModelList(eoOrderContainerModelList);
			
			return eoTrailerDto;
		}
		return null;
	}

	
	@Override
	public QueryData queryTrailerByCondition(QueryInfo queryInfo) {
		queryInfo.setQueryType("EoRequestTrailerListQuery");
		return commonQueryManager.query(queryInfo);
	}
	
	/**
	 * 校验拖车公司下是否有联系人以及邮箱
	 * @author Shoven.Jiang  
	 * @date 2018年10月14日
	 * @param eoRequestTrailerModel
	 * @return
	 */
	private String  getEootCarrierEbcuContractEmail(EoRequestTrailerModel eoRequestTrailerModel) {
		String errm = "";
		Long ebcuId = eoRequestTrailerModel.getEoetTrailerCompanyId();
		String ebccIsDefault = "";//是否默认联系人
		String ebccEmail = "";//拖车下达需要发送邮件的地址
		EbCustomerContactModel ebCustomerContactModel = new EbCustomerContactModel();
		if (null == ebcuId) {
			errm += /*"请求编号：" + eoRequestTrailerModel.getEoetNo() + */"拖车公司不存在，请维护！\n";
		} else {
			EbCustomerModel ebCustomerModel = this.ebCustomerManager.get(ebcuId);
			if (null == ebCustomerModel) {
				errm += /*"请求编号：" + eoRequestTrailerModel.getEoetNo() + */"拖车公司在基础数据中不存在，请维护！\n";
			} else {
				String ebcuStatus = ebCustomerModel.getEbcuCustomerStatus();
				if (EmptyUtils.isNotEmpty(ebcuStatus) && !Constants.SYS_STATUS_ENABLE.equals(ebcuStatus)) {
					errm += /*"请求编号：" + eoRequestTrailerModel.getEoetNo() + */"拖车公司已经停用，请查看！\n";
				} else {
					List<FilterCondition> conditions = new ArrayList<>();
					conditions.add(new FilterCondition("ebccEbcuId", ebcuId, "="));
					List<EbCustomerContactModel> ebCustomerContactModels = this.ebCustomerContactManager.findByCondition(conditions);
					if (EmptyUtils.isEmpty(ebCustomerContactModels)) {
						errm += /*"请求编号：" + eoRequestTrailerModel.getEoetNo() + */"拖车公司联系人不存在，请维护！\n";
					} else {
						for (int i = 0; i < ebCustomerContactModels.size(); i++) {
							ebccIsDefault = ebCustomerContactModels.get(i).getEbccIsDefault();
							if (EmptyUtils.isNotEmpty(ebccIsDefault) && Constants.YES.equals(ebccIsDefault)) {
								ebccEmail = ebCustomerContactModels.get(i).getEbccEmail();
								if (EmptyUtils.isEmpty(ebccEmail)) {
									errm += /*"请求编号：" + eoRequestTrailerModel.getEoetNo() + */"拖车公司联系人邮箱不存在，请维护！\n";
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
								errm += /*"请求编号：" + eoRequestTrailerModel.getEoetNo() + */"拖车公司联系人邮箱不存在，请维护！\n";
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
	public void saveDpInTrack(EoRequestTrailerModel eoRequestTrailerModel) {
		List<FilterCondition> filterCondition = new ArrayList<>();
		filterCondition.add(new FilterCondition("dpitBridId",eoRequestTrailerModel.getEoetId(),"="));
		filterCondition.add(new FilterCondition("dpitOrderId",eoRequestTrailerModel.getEoetEoorId(),"="));
		if (EmptyUtils.isNotEmpty(eoRequestTrailerModel.getEoetStatus()) && Constants.SYS_STOCKIN_STATUS_COMPLETED.equals(eoRequestTrailerModel.getEoetStatus())) {
			filterCondition.add(new FilterCondition("dpitType",Constants.DPIT_TYPE_TRAILER_COMPLETE,"="));
		} else if (EmptyUtils.isNotEmpty(eoRequestTrailerModel.getEoetStatus()) && Constants.SYS_STOCKIN_STATUS_UNISSUED.equals(eoRequestTrailerModel.getEoetStatus())) {
			filterCondition.add(new FilterCondition("dpitType",Constants.DPIT_TYPE_TRAILER_ISSUSED,"="));
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
			dpInTrackModel.setDpitBridId(eoRequestTrailerModel.getEoetId());
			//订单ID
			dpInTrackModel.setDpitOrderId(eoRequestTrailerModel.getEoetEoorId());
			if (EmptyUtils.isNotEmpty(eoRequestTrailerModel.getEoetStatus()) && Constants.SYS_STOCKIN_STATUS_COMPLETED.equals(eoRequestTrailerModel.getEoetStatus())) {
				//内部状态
				dpInTrackModel.setDpitType(Constants.DPIT_TYPE_TRAILER_COMPLETE);
			} else if (EmptyUtils.isNotEmpty(eoRequestTrailerModel.getEoetStatus()) && Constants.SYS_STOCKIN_STATUS_UNISSUED.equals(eoRequestTrailerModel.getEoetStatus())) {
				//内部状态
				dpInTrackModel.setDpitType(Constants.DPIT_TYPE_TRAILER_ISSUSED);
			}
			//业务操作时间
			dpInTrackModel.setDpitOperatorTime(new Date());
			//业务操作人
			dpInTrackModel.setDpitOperator(user.getUserId());
			dpInTrackManager.save(dpInTrackModel);
		}
	}	
	
}
