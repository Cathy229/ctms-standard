package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EoetManager;
import com.sinotrans.oms.businessrequest.model.EoEoom2EoetModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoEoom2EoetManagerImpl extends MybatisManagerImpl implements EoEoom2EoetManager{

	@Override
	public EoEoom2EoetModel get(Long id) {
		
		return this.myBatisDao.get(EoEoom2EoetModel.class, id);
	}

	@Override
	public List<EoEoom2EoetModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoEoom2EoetModel.class, null, null, conditions);
	}

	@Override
	public EoEoom2EoetModel save(EoEoom2EoetModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoEoom2EoetModel> saveAll(List<EoEoom2EoetModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoEoom2EoetModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoEoom2EoetModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoEoom2EoetModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoEoom2EoetModel.class, ids);
	}
}
