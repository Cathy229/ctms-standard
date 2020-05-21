package com.sinotrans.oms.fees.manager.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.eoorder.manager.EoOrderExpandAgencyManager;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.fees.manager.EbFeeHeadManager;
import com.sinotrans.oms.fees.manager.EfBusinessFeesManager;
import com.sinotrans.oms.fees.model.EbFeeHeadModel;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EfBusinessFeesManagerImpl extends MybatisManagerImpl implements EfBusinessFeesManager{
	
	@Autowired
	private EbFeeHeadManager ebFeeHeadManager;
	
	@Autowired
	private EoOrderManager eoOrderManager;
	@Autowired
	private EoOrderExpandAgencyManager eoOrderExpandAgencyManager;
	
	@Override
	public EfBusinessFeesModel get(Long id) {
		
		return this.myBatisDao.get(EfBusinessFeesModel.class, id);
	}

	@Override
	public List<EfBusinessFeesModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EfBusinessFeesModel.class, null, null, conditions);
	}

	@Override
	public EfBusinessFeesModel save(EfBusinessFeesModel model) {
		 return this.myBatisDao.save(model);
	}


	@Override
	public void delete(EfBusinessFeesModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EfBusinessFeesModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EfBusinessFeesModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EfBusinessFeesModel.class, ids);
	}
	
	@Override
	public List<EfBusinessFeesModel> saveAll(List<EfBusinessFeesModel> models) {
		
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public List<Map<String, Object>> queryByCondition(String queryName, Map<String, Object> sqlCond) {
		return this.myBatisDao.queryByCondition(queryName, sqlCond, null, null, null);
	}

	@Override
	public EoOrderDto getOrderFeeByEoorId(Long eoorId) {
		EoOrderDto eoOrderDto = new EoOrderDto();
		//订单基本信息
		EoOrderModel eoOrderModel = eoOrderManager.get(eoorId);
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
		//费用信息efbfEoorId
		FilterCondition efbfFilterCondition = new FilterCondition();
		efbfFilterCondition.setFieldName("efbfEoorId");
		efbfFilterCondition.setFieldValue(eoorId);
		efbfFilterCondition.setOperator("=");
		List<FilterCondition> efbfConditions = new ArrayList<>();
		efbfConditions.add(efbfFilterCondition);
		List<EfBusinessFeesModel> efBusinessFeesModelList = this.findByCondition(efbfConditions);
		setEbfhIsFree(efBusinessFeesModelList);
		eoOrderDto.setEfBusinessFeesModelList(efBusinessFeesModelList);
		return eoOrderDto;
	}

	//添加费目是否免税
	public void setEbfhIsFree(List<EfBusinessFeesModel> efBusinessFeesModelList) {
		for (EfBusinessFeesModel efbfModel : efBusinessFeesModelList) {
			EbFeeHeadModel ebFeeHeadModel = ebFeeHeadManager.get(efbfModel.getEfbfEbfhId());
			if (ebFeeHeadModel != null) {
				efbfModel.setEbfhIsDutyfree(ebFeeHeadModel.getEbfhIsDutyfree());
			}
		}
	}
}
