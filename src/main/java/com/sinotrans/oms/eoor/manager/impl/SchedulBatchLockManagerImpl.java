package com.sinotrans.oms.eoor.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.oms.eoor.manager.SchedulBatchLockManager;
import com.sinotrans.oms.eoor.model.SchedulBatchLockModel;



@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class SchedulBatchLockManagerImpl  extends MybatisManagerImpl implements SchedulBatchLockManager{
     @Autowired
	private CommonQueryManager commonQueryManager;

	@Override
	public SchedulBatchLockModel get(Integer id) {
		return this.myBatisDao.get(SchedulBatchLockModel.class, id);
	}

	@Override
	public List<SchedulBatchLockModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(SchedulBatchLockModel.class, null, null, conditions);
	}

	@Override
	public SchedulBatchLockModel save(SchedulBatchLockModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<SchedulBatchLockModel> saveAll(List<SchedulBatchLockModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(SchedulBatchLockModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(SchedulBatchLockModel.class, conditions);
	}

	@Override
	public void deleteByPk(Integer id) {
		this.myBatisDao.deleteByPk(SchedulBatchLockModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Integer> ids) {
		 this.myBatisDao.deleteByPks(SchedulBatchLockModel.class, ids);
	}

	@Override
	public SchedulBatchLockModel saveOrder(SchedulBatchLockModel SchedulBatchLockModel) {
		return this.myBatisDao.save(SchedulBatchLockModel);
	}


	
	
}