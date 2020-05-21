package com.sinotrans.oms.fees.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.fees.manager.EiCommonLoadBackManager;
import com.sinotrans.oms.fees.model.EiCommonLoadBackModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EiCommonLoadBackManagerImpl extends MybatisManagerImpl implements EiCommonLoadBackManager{

	@Override
	public EiCommonLoadBackModel get(Long id) {
		
		return this.myBatisDao.get(EiCommonLoadBackModel.class, id);
	}

	@Override
	public List<EiCommonLoadBackModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EiCommonLoadBackModel.class, null, null, conditions);
	}

	@Override
	public EiCommonLoadBackModel save(EiCommonLoadBackModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EiCommonLoadBackModel> saveAll(List<EiCommonLoadBackModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EiCommonLoadBackModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EiCommonLoadBackModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EiCommonLoadBackModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EiCommonLoadBackModel.class, ids);
	}
}
