package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoEoddBillManager;
import com.sinotrans.oms.businessrequest.manager.EoEoddFeedbackManager;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoetManager;
import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.businessrequest.model.EoEoddFeedbackModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoEoddFeedbackManagerImpl extends MybatisManagerImpl implements EoEoddFeedbackManager{

	@Override
	public EoEoddFeedbackModel get(Long id) {
		
		return this.myBatisDao.get(EoEoddFeedbackModel.class, id);
	}

	@Override
	public List<EoEoddFeedbackModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoEoddFeedbackModel.class, null, null, conditions);
	}

	@Override
	public EoEoddFeedbackModel save(EoEoddFeedbackModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoEoddFeedbackModel> saveAll(List<EoEoddFeedbackModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoEoddFeedbackModel model) {
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
