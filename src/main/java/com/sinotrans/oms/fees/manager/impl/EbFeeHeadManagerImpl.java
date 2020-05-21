package com.sinotrans.oms.fees.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.fees.manager.EbFeeHeadManager;
import com.sinotrans.oms.fees.model.EbFeeHeadModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EbFeeHeadManagerImpl extends MybatisManagerImpl implements EbFeeHeadManager{

	@Override
	public EbFeeHeadModel get(Long id) {
		
		return this.myBatisDao.get(EbFeeHeadModel.class, id);
	}

	@Override
	public List<EbFeeHeadModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EbFeeHeadModel.class, null, null, conditions);
	}

	@Override
	public EbFeeHeadModel save(EbFeeHeadModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EbFeeHeadModel> saveAll(List<EbFeeHeadModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EbFeeHeadModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EbFeeHeadModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EbFeeHeadModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EbFeeHeadModel.class, ids);
	}
}
