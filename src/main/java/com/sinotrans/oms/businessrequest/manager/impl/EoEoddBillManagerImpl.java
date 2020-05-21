package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoEoddBillManager;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoetManager;
import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoEoddBillManagerImpl extends MybatisManagerImpl implements EoEoddBillManager{

	@Override
	public EoEoddBillModel get(Long id) {
		
		return this.myBatisDao.get(EoEoddBillModel.class, id);
	}

	@Override
	public List<EoEoddBillModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoEoddBillModel.class, null, null, conditions);
	}

	@Override
	public EoEoddBillModel save(EoEoddBillModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoEoddBillModel> saveAll(List<EoEoddBillModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoEoddBillModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoEoddBillModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoEoddBillModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoEoddBillModel.class, ids);
	}
}
