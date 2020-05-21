package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoEoddBillManager;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoetManager;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EodmManager;
import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EodmModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoEoom2EodmManagerImpl extends MybatisManagerImpl implements EoEoom2EodmManager{

	@Override
	public EoEoom2EodmModel get(Long id) {
		
		return this.myBatisDao.get(EoEoom2EodmModel.class, id);
	}

	@Override
	public List<EoEoom2EodmModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoEoom2EodmModel.class, null, null, conditions);
	}

	@Override
	public EoEoom2EodmModel save(EoEoom2EodmModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoEoom2EodmModel> saveAll(List<EoEoom2EodmModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoEoom2EodmModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoEooc2EoetModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoEoom2EodmModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoEoom2EodmModel.class, ids);
	}
}
