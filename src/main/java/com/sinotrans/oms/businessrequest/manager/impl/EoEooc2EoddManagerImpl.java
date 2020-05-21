package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoEoddBillManager;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoddManager;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoetManager;
import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoddModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoEooc2EoddManagerImpl extends MybatisManagerImpl implements EoEooc2EoddManager{

	@Override
	public EoEooc2EoddModel get(Long id) {
		
		return this.myBatisDao.get(EoEooc2EoddModel.class, id);
	}

	@Override
	public List<EoEooc2EoddModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoEooc2EoddModel.class, null, null, conditions);
	}

	@Override
	public EoEooc2EoddModel save(EoEooc2EoddModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoEooc2EoddModel> saveAll(List<EoEooc2EoddModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoEooc2EoddModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoEooc2EoddModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoEooc2EoddModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoEooc2EoddModel.class, ids);
	}
}
