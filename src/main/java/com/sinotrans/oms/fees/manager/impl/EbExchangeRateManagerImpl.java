package com.sinotrans.oms.fees.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.fees.manager.EbExchangeRateManager;
import com.sinotrans.oms.fees.model.EbExchangeRateModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EbExchangeRateManagerImpl extends MybatisManagerImpl implements EbExchangeRateManager{

	@Override
	public EbExchangeRateModel get(Long id) {
		
		return this.myBatisDao.get(EbExchangeRateModel.class, id);
	}

	@Override
	public List<EbExchangeRateModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EbExchangeRateModel.class, null, null, conditions);
	}

	@Override
	public EbExchangeRateModel save(EbExchangeRateModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EbExchangeRateModel> saveAll(List<EbExchangeRateModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EbExchangeRateModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EbExchangeRateModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EbExchangeRateModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EbExchangeRateModel.class, ids);
	}
	
}
