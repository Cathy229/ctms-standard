package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoImportJoabBoxManager;
import com.sinotrans.oms.businessrequest.model.EoImportJoabBoxModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoImportJoabBoxManagerImpl extends MybatisManagerImpl implements EoImportJoabBoxManager {

	@Override
	public EoImportJoabBoxModel get(Long id) {
		return this.myBatisDao.get(EoImportJoabBoxModel.class, id);
	}

	@Override
	public List<EoImportJoabBoxModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoImportJoabBoxModel.class, null, null, conditions);
	}

	@Override
	public EoImportJoabBoxModel save(EoImportJoabBoxModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoImportJoabBoxModel> saveAll(List<EoImportJoabBoxModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoImportJoabBoxModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoImportJoabBoxModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoImportJoabBoxModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoImportJoabBoxModel.class, ids);
	}

}
