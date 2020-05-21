package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoEorb2EosrManager;
import com.sinotrans.oms.businessrequest.model.EoEorb2EosrModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoEorb2EosrManagerImpl extends MybatisManagerImpl implements EoEorb2EosrManager{

	@Override
	public EoEorb2EosrModel get(Long id) {
		
		return this.myBatisDao.get(EoEorb2EosrModel.class, id);
	}

	@Override
	public List<EoEorb2EosrModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoEorb2EosrModel.class, null, null, conditions);
	}

	@Override
	public EoEorb2EosrModel save(EoEorb2EosrModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoEorb2EosrModel> saveAll(List<EoEorb2EosrModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoEorb2EosrModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoEorb2EosrModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoEorb2EosrModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoEorb2EosrModel.class, ids);
	}
}
