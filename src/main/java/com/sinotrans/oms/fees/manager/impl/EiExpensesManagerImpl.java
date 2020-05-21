package com.sinotrans.oms.fees.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.fees.manager.EiExpensesManager;
import com.sinotrans.oms.fees.model.EiExpensesModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EiExpensesManagerImpl extends MybatisManagerImpl implements EiExpensesManager{

	@Override
	public EiExpensesModel get(Long id) {
		
		return this.myBatisDao.get(EiExpensesModel.class, id);
	}

	@Override
	public List<EiExpensesModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EiExpensesModel.class, null, null, conditions);
	}

	@Override
	public EiExpensesModel save(EiExpensesModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EiExpensesModel> saveAll(List<EiExpensesModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EiExpensesModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EiExpensesModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EiExpensesModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EiExpensesModel.class, ids);
	}
}
