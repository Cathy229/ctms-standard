package com.sinotrans.oms.fees.manager.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.dto.EoRequestTraileContainerNumQueryItem;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.common.util.NumberUtil;
import com.sinotrans.oms.customerproject.manager.EbCustomerManager;
import com.sinotrans.oms.customerproject.model.EbCustomerModel;
import com.sinotrans.oms.eoorder.model.EoConsignmentModel;
import com.sinotrans.oms.fees.dto.ContractLogisticTempleteQueryDto;
import com.sinotrans.oms.fees.dto.SettmentCodeRequestQueryDto;
import com.sinotrans.oms.fees.dto.UpToBmsCheckQueryDto;
import com.sinotrans.oms.fees.manager.EfBusinessFeesManager;
import com.sinotrans.oms.fees.manager.EfBusinessFeesSettlementManager;
import com.sinotrans.oms.fees.manager.EiExpensesManager;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;
import com.sinotrans.oms.fees.model.EiExpensesModel;
import com.sinotrans.oms.system.manager.EsCompanyManager;
import com.sinotrans.oms.system.manager.EsUserManager;
import com.sinotrans.oms.system.model.EsCompanyModel;
import com.sinotrans.oms.system.model.EsUserModel;

/**  
* <p>Title: efBusinessFeesSettlementManagerImpl</p>  
* <p>Description: 费用上传bms通用逻辑</p>  
* @author Shoven.Jiang  
* @date 2018年9月10日  
* @version 1.0  
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EfBusinessFeesSettlementManagerImpl extends MybatisManagerImpl implements EfBusinessFeesSettlementManager{
	@Autowired
	private EfBusinessFeesManager efBusinessFeesManager;
	@Autowired
	private EiExpensesManager eiExpensesManager;
	@Autowired
	private EbCustomerManager ebCustomerManager;
	@Autowired
	private EsUserManager EsUserManager;
	@Autowired
	private EsCompanyManager esCompanyManager;
	@Override
	public String getWaterwayDischargePortTempleteByCondition(Map<String, Object> condition) {
		List<Map<String, Object>> queryList = this.myBatisDao.queryByCondition("WaterwayDischargePortTempleteQuery", condition, null, null, null);
		String countPort = "";
		if (EmptyUtils.isNotEmpty(queryList)) { 
			countPort = queryList.get(0).get("count").toString();
		}
		return countPort;
	}

	@Override
	public String getWaterWayLoadingPort(Map<String, Object> condition) {
		List<Map<String, Object>> queryList = this.myBatisDao.queryByCondition("WaterwayLoadingPortTempleteQuery", condition, null, null, null);
		String countPort = "";
		if (EmptyUtils.isNotEmpty(queryList)) {
			countPort = queryList.get(0).get("count").toString();
		}
		return countPort;
	}

	@Override
	public Map getEfbfNameCnWhetherDuty(Map<String, Object> condition) {
		Long ebfhIsDutyfree = null;
		boolean dutyFlg = false; //免税
		boolean dutyFlgN = false; //非免税
		Map<String, Boolean> whetherDuty = new HashMap<>();
		whetherDuty.put("dutyFlg", dutyFlg);
		whetherDuty.put("dutyFlgN", dutyFlgN);
		List<Map<String, Object>> queryList = this.myBatisDao.queryByCondition("EbFeeIsDutyfreeByOrderIdQuery", condition, null, null, null);
		if (EmptyUtils.isNotEmpty(queryList)) {
			for (int i = 0; i < queryList.size(); i++) {
				if(Constants.IS_DUTYFREE.toString().equals(queryList.get(i)==null?"":queryList.get(i).get("ebfhIsDutyfree").toString())){
					dutyFlg = true;
					whetherDuty.put("dutyFlg", dutyFlg);
				}else if(Constants.NOT_DUTYFREE.toString().equals(queryList.get(i)==null?"":queryList.get(i).get("ebfhIsDutyfree").toString())){
					dutyFlgN = true;
					whetherDuty.put("dutyFlgN", dutyFlgN);
				}
			}
		}
		return whetherDuty;
	}

	@Override
	public List<Long> getEfBusinessSettementFeesQueryList(Map<String, Object> condition) {
		List<Map<String, Object>> queryList = this.myBatisDao.queryByCondition("com.sinotrans.oms.efbusinessfees.mapper.EfBusinessSettementFeesQuery", condition, null, null, null);
		List<Long> efbfIds = new ArrayList<>();
		if (EmptyUtils.isNotEmpty(queryList)) {
			for (int i = 0; i < queryList.size(); i++) {
				efbfIds.add(Long.valueOf(queryList.get(i).get("efbfId").toString()));
			}
		}
		return efbfIds;
	}

	@Override
	public UpToBmsCheckQueryDto getUpToBmsCheckQueryDto(Map<String, Object> condition) {
		List<Map<String, Object>> queryList = this.myBatisDao.queryByCondition("com.sinotrans.oms.efbusinessfees.mapper.UpToBmsCheckQuery", condition, null, null, null);
		UpToBmsCheckQueryDto upToBmsCheckQueryDto = new UpToBmsCheckQueryDto();
		if (EmptyUtils.isNotEmpty(queryList)) {
			for (@SuppressWarnings("rawtypes") Map map : queryList) {
				upToBmsCheckQueryDto = (UpToBmsCheckQueryDto) BlukInsertUtils.parseMapToObject(map, new UpToBmsCheckQueryDto());
			}
		}
		return upToBmsCheckQueryDto;
	}

	@Override
	public void saveCanUpLoadFeesAndEiepFees(List<EfBusinessFeesModel> canUpLoadFees, Long eoorId, String isDutyFree, Long eiimId) {
		//将费用状态修改为上传中状态，防止多次上传引发的数据不准确的情况
		for (int i = 0; i < canUpLoadFees.size(); i++) {
			canUpLoadFees.get(i).setEfbfStatus(Constants.HD_SYMBOL_9);
		}
		if (EmptyUtils.isNotEmpty(canUpLoadFees)) {
			this.efBusinessFeesManager.saveAll(canUpLoadFees);
			EsCompanyModel esCompanyModel = this.esCompanyManager.get(canUpLoadFees.get(0).getEfbfEscoId());
			List<EiExpensesModel> eiExpensesModels = new ArrayList<EiExpensesModel>();
			for (EfBusinessFeesModel efBusinessFeesModel : canUpLoadFees) {
				String ebcuCustomNo = null;
				EbCustomerModel ebCustomerModel = this.ebCustomerManager.get(efBusinessFeesModel.getEfbfSettlementEbcuId());
				if (null != ebCustomerModel) {
					ebcuCustomNo = ebCustomerModel.getEbcuCustomerNo();
				}
				EiExpensesModel eiep = new EiExpensesModel();
				eiep.setEiepEiimId(eiimId);
				eiep.setEiepStatus(0L);
				eiep.setEiepSource(1L);
				eiep.setEiepProperty(efBusinessFeesModel.getEfbfProperty());
				eiep.setEiepEbbuCode("OMS01");
				eiep.setEiepEbcuCustomerNo(ebcuCustomNo);
				eiep.setEiepEiimSourceId(eoorId.toString() + "-" + isDutyFree);
				eiep.setEiepSourceId(efBusinessFeesModel.getEfbfId().toString());
				eiep.setEiepEscoCompanyNo(esCompanyModel.getEscoCompanyNo());
				if (efBusinessFeesModel.getEfbfParentEfbfId() != null) {
					eiep.setEiepAosSourceId(efBusinessFeesModel.getEfbfParentEfbfId().toString());
				}
				
				if ("RR".equals(efBusinessFeesModel.getEfbfType())) {
					eiep.setEiepIsRp(2L);
				} else if ("RP".equals(efBusinessFeesModel.getEfbfType())) {
					eiep.setEiepIsRp(-2L);
				} else if ("R".equals(efBusinessFeesModel.getEfbfType())) {
					eiep.setEiepIsRp(1L);
				} else if ("P".equals(efBusinessFeesModel.getEfbfType())) {
					eiep.setEiepIsRp(-1L);
				} else {
					eiep.setEiepIsRp(null);
				}
				eiep.setEiepEbfhSourceId(efBusinessFeesModel.getEfbfEbfhId().toString());
				eiep.setEiepCurrency(efBusinessFeesModel.getEfbfCurrency());
				eiep.setEiepExchangeRate(efBusinessFeesModel.getEfbfExchangeRate());// 20170702
				// 汇率取费用上的
				eiep.setEiepAmt(efBusinessFeesModel.getEfbfAmount());
				eiep.setEiepSourceAmt(null);
				eiep.setEiepTaxrate(efBusinessFeesModel.getEfbfTaxRate());
				eiep.setEiepFee(efBusinessFeesModel.getEfbfTaxFee());
				if(null!=efBusinessFeesModel.getEfbfTaxAmount() && null!=efBusinessFeesModel.getEfbfTaxFee()){
					double eiepTax=efBusinessFeesModel.getEfbfTaxAmount() - efBusinessFeesModel.getEfbfTaxFee();
					eiep.setEiepTax(NumberUtil.getRoundDouble(eiepTax, 2));
				}
				efBusinessFeesModel.getCreator();
				eiep.setEiepSubstr1(this.EsUserManager.get(Long.parseLong(efBusinessFeesModel.getCreator())).getEsusUserNameCn());
				if (null != efBusinessFeesModel.getEfbfPrice()) {
					eiep.setEiepSubstr2(efBusinessFeesModel.getEfbfPrice().toString());
				}
				eiep.setEiepSubstr3(null);
				if (null != efBusinessFeesModel.getEfbfIsPadscost()) {
					eiep.setEiepSubstr4(efBusinessFeesModel.getEfbfIsPadscost().toString());
				}
				eiep.setEiepSubstr5(null);
				eiep.setEiepSubstr6(efBusinessFeesModel.getEfbfRemark());
				eiep.setEiepSubstr7(null);
				eiep.setEiepSubstr8(null);
				eiep.setEiepSubdate1(efBusinessFeesModel.getCreateTime());
				eiep.setEiepSubdate2(null);
				eiep.setEiepSubdate3(null);
				eiep.setEiepSubdate4(null);
				if (null != efBusinessFeesModel.getEfbfQuantity()) {
					eiep.setEiepSubnum1((long) Math.round(efBusinessFeesModel.getEfbfQuantity()));
				}
				eiep.setEiepSubnum2(null);
				eiep.setEiepSubnum3(null);
				eiep.setEiepSubnum4(null);
				eiep.setHdFilename(null);
				eiep.setHdBatchnumber(null);// 到时候问一下生成规则
				eiep.setHdSymbol("N");
				eiep.setHdBeginprocessingtime(null);
				eiep.setHdLastmodifiedtime(null);
				eiep.setHdInformation(null);
				eiep.setRecVer(0L);
				eiep.setCreator(efBusinessFeesModel.getCreator());
				eiep.setCreateTime(new Date());
				eiep.setModifier(efBusinessFeesModel.getModifier());
				eiep.setModifyTime(new Date());
				Long oppositeEfbfId = null;
				if ("RR".equals(efBusinessFeesModel.getEfbfType())) {
					List<FilterCondition> RPConditions = new ArrayList<>();
					RPConditions.add(new FilterCondition("efbfType", "RP", "="));
					RPConditions.add(new FilterCondition("efbfOppositeEfbfId", efBusinessFeesModel.getEfbfOppositeEfbfId(), "="));
					oppositeEfbfId = this.efBusinessFeesManager.findByCondition(RPConditions).get(0).getEfbfId();
				} else if ("RP".equals(efBusinessFeesModel.getEfbfType())) {
					List<FilterCondition> RPConditions = new ArrayList<>();
					RPConditions.add(new FilterCondition("efbfType", "RR", "="));
					RPConditions.add(new FilterCondition("efbfOppositeEfbfId", efBusinessFeesModel.getEfbfOppositeEfbfId(), "="));
					oppositeEfbfId = this.efBusinessFeesManager.findByCondition(RPConditions).get(0).getEfbfId();
				}
				if (oppositeEfbfId != null) {
					eiep.setEiepOppositeEfbfId(oppositeEfbfId.toString());
				}
				eiep.setEiepSubstr20(efBusinessFeesModel.getEfbfSubstr20());
				eiep.setEiepEsusUserNameCn(efBusinessFeesModel.getEfbfComfirmUser());
				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
				eiep.setEiepTime(sdf.format(efBusinessFeesModel.getEfbfComfirmDate()));
				if (efBusinessFeesModel.getEfbfComfirmUser() == null
						|| "".equals(efBusinessFeesModel.getEfbfComfirmUser())) {
					eiep.setEiepRpStatus(Constants.EIEPRPSTATUS_NO);
				} else {
					eiep.setEiepRpStatus(Constants.EIEPRPSTATUS_OK);
				}
				eiExpensesModels.add(eiep);
			}
			this.eiExpensesManager.saveAll(eiExpensesModels);
		}
		
	}

	@Override
	public String getEfbmAttribute001ByBusinessType(Long eoorId, String eoeaAgencyType) {
		String efbmAttribute001 = "";//流行
		String countPort = "";//查询出的统计数量
		if (Constants.SYS_EXPORTE.equals(eoeaAgencyType)) {
			Map<String, Object> conditionEoeaAgencyTypeE = new HashMap<>();
			conditionEoeaAgencyTypeE.put("eoeaEoorId", eoorId);
			countPort = getWaterwayDischargePortTempleteByCondition(conditionEoeaAgencyTypeE);
			if (EmptyUtils.isNotEmpty(countPort) && Constants.PORT_COUNT_WAY_ONE.equals(countPort)) {
				efbmAttribute001 = Constants.FLOW_EFBM_ATTRIBUTE_001_DOM;
			} else {
				efbmAttribute001 = Constants.FLOW_EFBM_ATTRIBUTE_001_EXP;
			}
			
		} else if (Constants.SYS_IMPORT.equals(eoeaAgencyType)) {
			Map<String, Object> conditionEoeaAgencyTypeI = new HashMap<>();
			conditionEoeaAgencyTypeI.put("eoeaEoorId", eoorId);
			countPort = this.getWaterWayLoadingPort(conditionEoeaAgencyTypeI);
			if (EmptyUtils.isNotEmpty(countPort) && Constants.PORT_COUNT_WAY_ONE.equals(countPort)) {
				efbmAttribute001 = Constants.FLOW_EFBM_ATTRIBUTE_001_DOM;
			} else {
				efbmAttribute001 = Constants.FLOW_EFBM_ATTRIBUTE_001_IMP;
			}
		}
		return efbmAttribute001;
	}

	@Override
	public ResponseData<List<SettmentCodeRequestQueryDto>> submitSettlementSheet(Map<String, Object> conditions, Collection<Long> efbfIds) {
		ResponseData<List<SettmentCodeRequestQueryDto>> responseData = new ResponseData<List<SettmentCodeRequestQueryDto>>();
		//校验提交结算单的费用
		List<Map<String, Object>> checkSettmentCodeRequestQueryList = this.myBatisDao.queryByCondition("com.sinotrans.oms.efbusinessfees.mapper.CheckSettmentCodeRequestQuery", conditions, null, null, null);
		if (EmptyUtils.isNotEmpty(checkSettmentCodeRequestQueryList)) {
			if (checkSettmentCodeRequestQueryList.size() > 1) {
				responseData.setCode(Constants.NO);
				responseData.setMsg("请选择相同结算对象，应收应付，币种，税率的费用!");
				return responseData;
			}
			List<Map<String, Object>> SettmentCodeRequestQueryDtoList = this.myBatisDao.queryByCondition("com.sinotrans.oms.efbusinessfees.mapper.SettmentCodeRequestQuery", conditions, null, null, null);
			List<SettmentCodeRequestQueryDto> settmentCodeRequestQueryDtos = new ArrayList<>();
			for (Map<String, Object> map : SettmentCodeRequestQueryDtoList) {
				settmentCodeRequestQueryDtos.add((SettmentCodeRequestQueryDto) BlukInsertUtils.parseMapToObject(map, new SettmentCodeRequestQueryDto()));
            }
			responseData.setData(settmentCodeRequestQueryDtos);
		}
		return responseData;
	}

}
