package com.sinotrans.oms.fees.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.fees.manager.EfBmsImManager;
import com.sinotrans.oms.fees.model.EfBmsImModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EfBmsImManagerImpl extends MybatisManagerImpl implements EfBmsImManager {

	@Override
	public EfBmsImModel get(Long id) {
		
		return this.myBatisDao.get(EfBmsImModel.class, id);
	}

	@Override
	public List<EfBmsImModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EfBmsImModel.class, null, null, conditions);
	}

	@Override
	public EfBmsImModel save(EfBmsImModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EfBmsImModel> saveAll(List<EfBmsImModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EfBmsImModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EfBmsImModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EfBmsImModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EfBmsImModel.class, ids);
	}
}
