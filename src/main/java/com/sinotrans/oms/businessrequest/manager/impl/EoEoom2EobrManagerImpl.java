package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EobrManager;
import com.sinotrans.oms.businessrequest.model.EoEoom2EobrModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoEoom2EobrManagerImpl extends MybatisManagerImpl implements EoEoom2EobrManager{

	@Override
	public EoEoom2EobrModel get(Long id) {
		
		return this.myBatisDao.get(EoEoom2EobrModel.class, id);
	}

	@Override
	public List<EoEoom2EobrModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoEoom2EobrModel.class, null, null, conditions);
	}

	@Override
	public EoEoom2EobrModel save(EoEoom2EobrModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoEoom2EobrModel> saveAll(List<EoEoom2EobrModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoEoom2EobrModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoEoom2EobrModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoEoom2EobrModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoEoom2EobrModel.class, ids);
	}
}
