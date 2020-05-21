package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoetManager;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoEooc2EoetManagerImpl extends MybatisManagerImpl implements EoEooc2EoetManager{

	@Override
	public EoEooc2EoetModel get(Long id) {
		
		return this.myBatisDao.get(EoEooc2EoetModel.class, id);
	}

	@Override
	public List<EoEooc2EoetModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoEooc2EoetModel.class, null, null, conditions);
	}

	@Override
	public EoEooc2EoetModel save(EoEooc2EoetModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoEooc2EoetModel> saveAll(List<EoEooc2EoetModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoEooc2EoetModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoEooc2EoetModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoEooc2EoetModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoEooc2EoetModel.class, ids);
	}
}
