package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.jcraft.jsch.Session;
import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoBookingDto;
import com.sinotrans.oms.businessrequest.manager.DpInTrackManager;
import com.sinotrans.oms.businessrequest.manager.EoBookingManager;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EobrManager;
import com.sinotrans.oms.businessrequest.manager.EoEorb2EosrManager;
import com.sinotrans.oms.businessrequest.model.DpInTrackModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EobrModel;
import com.sinotrans.oms.businessrequest.model.EoEorb2EosrModel;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.businessrequest.model.EoRequestDeclarationDeputeModel;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.businessrule.manager.EsControlParamManager;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.manager.ProcedureManager;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoBookingManagerImpl extends MybatisManagerImpl implements EoBookingManager{
	
	@Autowired
	private EoEorb2EosrManager eoEorb2EosrManager;//箱
	@Autowired
	private EoEoom2EobrManager eoEoom2EobrManager;//物料
	@Autowired
	private EoOrderManager eoOrderManager;//订单
	@Autowired
	private CommonQueryManager commonQueryManager;//通用查询
	@Autowired
	private ProcedureManager procedureManager;//存储过程
	@Autowired
	private DpInTrackManager dpInTrackManager;
	@Autowired
	private EsControlParamManager esControlParamManager;
	
	@Override
	public EoRequestBookingModel get(Long id) {
		
		return this.myBatisDao.get(EoRequestBookingModel.class, id);
	}

	@Override
	public List<EoRequestBookingModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoRequestBookingModel.class, null, null, conditions);
	}

	@Override
	public EoRequestBookingModel save(EoRequestBookingModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoRequestBookingModel> saveAll(List<EoRequestBookingModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoRequestBookingModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoRequestBookingModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoRequestBookingModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoRequestBookingModel.class, ids);
	}

	@Override
	public EoBookingDto saveBookingAndMaterial(EoBookingDto eoBookingDto) {
		if (null != eoBookingDto) {
			EoBookingDto afterEoBookingDto = new EoBookingDto();
			EoRequestBookingModel eoRequestBookingModel = eoBookingDto.getEoRequestBookingModel();
			
			
			EoRequestBookingModel afterEoRequestBookingModel = this.save(eoRequestBookingModel);
			afterEoBookingDto.setEoRequestBookingModel(afterEoRequestBookingModel);
			
			List<EoEoom2EobrModel> eoEoom2EobrModels = eoBookingDto.getEoEoom2EobrModels();
			if(EmptyUtils.isNotEmpty(eoEoom2EobrModels)){
				for (EoEoom2EobrModel eoEoom2EobrModel : eoEoom2EobrModels) {
					eoEoom2EobrModel.setEobmEorbId(afterEoRequestBookingModel.getEorbId());
				}
				List<EoEoom2EobrModel> afterEoEoom2EobrModelList = eoEoom2EobrManager.saveAll(eoEoom2EobrModels);
				afterEoBookingDto.setEoEoom2EobrModels(afterEoEoom2EobrModelList);
			}
			List<EoEorb2EosrModel> eoEorb2EosrModels = eoBookingDto.getEoEorb2EosrModels();
			if(EmptyUtils.isNotEmpty(eoEorb2EosrModels)){
				for (EoEorb2EosrModel eoEorb2EosrModel : eoEorb2EosrModels) {
					eoEorb2EosrModel.setEobtEorbId(afterEoRequestBookingModel.getEorbId());
				}
				List<EoEorb2EosrModel> afterEoEorb2EosrModelList = eoEorb2EosrManager.saveAll(eoEorb2EosrModels);
				afterEoBookingDto.setEoEorb2EosrModels(afterEoEorb2EosrModelList);
			}
			return afterEoBookingDto;
			
		}
		return null;
	}

	@Override
	public EoBookingDto getBookingAndMaterialById(Long eorbId) {
		if(eorbId != null){
			EoBookingDto eoBookingDto = new EoBookingDto();
			//1.订舱基本信息
			EoRequestBookingModel eoRequestBookingModel = this.get(eorbId);
			
			//2.物料信息
			FilterCondition eodmFilterCondition=new FilterCondition();
			eodmFilterCondition.setFieldName("eobmEorbId");
			eodmFilterCondition.setFieldValue(eorbId);
			eodmFilterCondition.setOperator("=");
			List<FilterCondition> eodmConditions=new ArrayList<FilterCondition>();
			eodmConditions.add(eodmFilterCondition);
			List<EoEoom2EobrModel> eoEoom2EobrModelList = eoEoom2EobrManager.findByCondition(eodmConditions);
			
			//3.箱信息
			FilterCondition eocdFilterCondition=new FilterCondition();
			eocdFilterCondition.setFieldName("eobtEorbId");
			eocdFilterCondition.setFieldValue(eorbId);
			eocdFilterCondition.setOperator("=");
			List<FilterCondition> eocdConditions=new ArrayList<FilterCondition>();
			eocdConditions.add(eocdFilterCondition);
			List<EoEorb2EosrModel> EoEorb2EosrModelList = eoEorb2EosrManager.findByCondition(eocdConditions);
			
			EoOrderModel eoOrderModel =  eoOrderManager.get(eoRequestBookingModel.getEorbEoorId());
			
			eoBookingDto.setEoRequestBookingModel(eoRequestBookingModel);
			eoBookingDto.setEoEoom2EobrModels(eoEoom2EobrModelList);
			eoBookingDto.setEoEorb2EosrModels(EoEorb2EosrModelList);
			eoBookingDto.setEoOrderModel(eoOrderModel);
			
			return eoBookingDto;
			
		}
		return null;
	}

	@Override
	public QueryData queryBookingByCondition(QueryInfo queryInfo) {
		queryInfo.setQueryType("EoBookingListQuery");
		return commonQueryManager.query(queryInfo);
	}

	@Override
	public String issuedBooking(Long eorbId) {
		String errm = "";
		UserDetails user = SessionContext.getUser();
		EoRequestBookingModel eoRequestBookingModel = this.get(eorbId);
		
		this.saveDpInTrack(eoRequestBookingModel);
		
		// 修改业务请求状态为“已下达”
		eoRequestBookingModel.setEorbStatus(Constants.SYS_TMS_STATUS_ISSUED);
		// 修改执行状态为“可执行”
		eoRequestBookingModel.setEorbTaskStatus(Constants.SYS_TMS_TASK_STATUS_DO);
		eoRequestBookingModel.setEorbSubstr1(Constants.EORB_ISSUED_SUBSTR1);
		eoRequestBookingModel.setEorbSubstr25(null);//订舱拒绝原因清空
		this.myBatisDao.update(eoRequestBookingModel);
		
		//调用下达存储过程
		//增加判断，是否是华东订舱网，如果是则发邮件，并对接EDI，如果不是只发送邮件
		String ebcuCustomerNo = eoRequestBookingModel.getEorbBookingAgentCode();//查询出订舱代理的值
		String sendToEdiBookingEbcuCode = this.esControlParamManager.getIsCompanyValue("SEND_TO_EDI_BOOKING_EBCU_CODE");
		//订舱代理的客户代码与系统中配置的控制参数一致，则认为是华东订舱网
		if (null != eorbId && EmptyUtils.isNotEmpty(ebcuCustomerNo) && EmptyUtils.isNotEmpty(sendToEdiBookingEbcuCode) && sendToEdiBookingEbcuCode.equals(ebcuCustomerNo)) {
			Long ebtkId = eoRequestBookingModel.getEorbEbtkId();
			errm = procedureManager.requestIssued(eorbId,ebtkId);
			if (EmptyUtils.isNotEmpty(errm)) {
				return errm;
			}
		}
		return errm;
	}
	
	/**
	 * @deprecated:跟踪订舱状态（下达）
	 * @author Colley.Bai  
	 * @date 2018年12月26日
	 * @param eoRequestBookingModel
	 */
	@Override
	public void saveDpInTrack(EoRequestBookingModel eoRequestBookingModel){
		List<FilterCondition> filterCondition = new ArrayList<>();
		filterCondition.add(new FilterCondition("dpitBridId",eoRequestBookingModel.getEorbId(),"="));
		filterCondition.add(new FilterCondition("dpitOrderId",eoRequestBookingModel.getEorbEoorId(),"="));
		if (EmptyUtils.isNotEmpty(eoRequestBookingModel.getEorbStatus()) && Constants.SYS_STOCKIN_STATUS_COMPLETED.equals(eoRequestBookingModel.getEorbStatus())) {
			filterCondition.add(new FilterCondition("dpitType",Constants.DPIT_TYPE_BOOKING_COMPLETE,"="));
		} else if (EmptyUtils.isNotEmpty(eoRequestBookingModel.getEorbStatus()) && Constants.SYS_STOCKIN_STATUS_UNISSUED.equals(eoRequestBookingModel.getEorbStatus())) {
			filterCondition.add(new FilterCondition("dpitType",Constants.DPIT_TYPE_BOOKING_ISSUSED,"="));
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
			dpInTrackModel.setDpitBridId(eoRequestBookingModel.getEorbId());
			//订单ID
			dpInTrackModel.setDpitOrderId(eoRequestBookingModel.getEorbEoorId());
			if (EmptyUtils.isNotEmpty(eoRequestBookingModel.getEorbStatus()) && Constants.SYS_STOCKIN_STATUS_COMPLETED.equals(eoRequestBookingModel.getEorbStatus())) {
				//内部状态
				dpInTrackModel.setDpitType(Constants.DPIT_TYPE_BOOKING_COMPLETE);
			} else if (EmptyUtils.isNotEmpty(eoRequestBookingModel.getEorbStatus()) && Constants.SYS_STOCKIN_STATUS_UNISSUED.equals(eoRequestBookingModel.getEorbStatus())) {
				//内部状态
				dpInTrackModel.setDpitType(Constants.DPIT_TYPE_BOOKING_ISSUSED);
			}
			//业务操作时间
			dpInTrackModel.setDpitOperatorTime(new Date());
			//业务操作人
			dpInTrackModel.setDpitOperator(user.getUserId());
			dpInTrackManager.save(dpInTrackModel);
		}
		
	}

	@Override
	public void saveEoddAndEoetModelByEoorId(List<EoRequestTrailerModel> eoRequestTrailerModels,
			List<EoRequestDeclarationDeputeModel> eoRequestDeclarationDeputeModels, List<EoOrderExpandAgencyModel> eoOrderExpandAgencyModels, String eorbBulkBillNo, String eorbVoyage, String eorbVesselName) {
		List<EoRequestTrailerModel> afterAssemblingEoRequestTrailerModels = new ArrayList<>();
		List<EoRequestDeclarationDeputeModel> afterAssemblingEoRequestDeclarationDeputeModels = new ArrayList<>();
		//保存拖车任务
		if (EmptyUtils.isNotEmpty(eoRequestTrailerModels)) {
			for (EoRequestTrailerModel eoRequestTrailerModel : eoRequestTrailerModels) {
				eoRequestTrailerModel.setEoetBlNo(eorbBulkBillNo);
				eoRequestTrailerModel.setEoetVessel(eorbVesselName);
				eoRequestTrailerModel.setEoetVoyage(eorbVoyage);
				afterAssemblingEoRequestTrailerModels.add(eoRequestTrailerModel);
			}
			this.myBatisDao.saveAll(afterAssemblingEoRequestTrailerModels);
		}
		//保存报关任务
		if (EmptyUtils.isNotEmpty(eoRequestDeclarationDeputeModels)) {
			for (EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel : eoRequestDeclarationDeputeModels) {
				eoRequestDeclarationDeputeModel.setEoddBlNo(eorbBulkBillNo);
				eoRequestDeclarationDeputeModel.setEoddVoyage(eorbVoyage);
				eoRequestDeclarationDeputeModel.setEoddVessel(eorbVesselName);
				afterAssemblingEoRequestDeclarationDeputeModels.add(eoRequestDeclarationDeputeModel);
			}
			this.myBatisDao.saveAll(afterAssemblingEoRequestDeclarationDeputeModels);
		}
		//保存订单代理拓展表
		if (EmptyUtils.isNotEmpty(eoOrderExpandAgencyModels)) {
			for (EoOrderExpandAgencyModel eoOrderExpandAgencyModel : eoOrderExpandAgencyModels) {
				eoOrderExpandAgencyModel.setEoeaBulkBillNo(eorbBulkBillNo);
				eoOrderExpandAgencyModel.setEoeaVoyage(eorbVoyage);
				eoOrderExpandAgencyModel.setEoeaVesselName(eorbVesselName);
				this.myBatisDao.save(eoOrderExpandAgencyModel);
			}
		}
	}

	@Override
	public String ladingIssuedBooking(Long eorbId) {
		String errm = "";
		UserDetails user = SessionContext.getUser();
		EoRequestBookingModel eoRequestBookingModel = this.get(eorbId);
		// 修改业务请求状态为“已下达”
		eoRequestBookingModel.setEorbStatus(Constants.SYS_TMS_STATUS_ISSUED);
		// 修改执行状态为“可执行”
		eoRequestBookingModel.setEorbTaskStatus(Constants.SYS_TMS_TASK_STATUS_DO);
		eoRequestBookingModel.setEorbSubstr1(Constants.EORB_LADING_ISSUED);
		this.myBatisDao.update(eoRequestBookingModel);
		//调用下达存储过程
		if (null != eorbId) {
			Long ebtkId = eoRequestBookingModel.getEorbEbtkId();
			errm = procedureManager.requestIssued(eorbId,ebtkId);
			if (EmptyUtils.isNotEmpty(errm)) {
				return errm;
			}
		}
		return errm;
	}
}
