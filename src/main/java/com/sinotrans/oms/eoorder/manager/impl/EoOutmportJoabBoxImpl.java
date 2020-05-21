package com.sinotrans.oms.eoorder.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.model.EoOutmportJoabBoxModel;
import com.sinotrans.oms.eoorder.manager.EoOutmportJoabBoxManager;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoOutmportJoabBoxImpl extends MybatisManagerImpl implements EoOutmportJoabBoxManager{

	@Override
	public EoOutmportJoabBoxModel get(Long id) {
		return this.myBatisDao.get(EoOutmportJoabBoxModel.class, id);
	}

	@Override
	public List<EoOutmportJoabBoxModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoOutmportJoabBoxModel.class, null, null, conditions);
	}

	@Override
	public EoOutmportJoabBoxModel save(EoOutmportJoabBoxModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoOutmportJoabBoxModel> saveAll(List<EoOutmportJoabBoxModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoOutmportJoabBoxModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoOutmportJoabBoxModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoOutmportJoabBoxModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoOutmportJoabBoxModel.class, ids);
	}

}
