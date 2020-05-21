package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoRequestChemicalManager;
import com.sinotrans.oms.businessrequest.model.EoRequestChemicalModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoRequestChemicalManagerImpl extends MybatisManagerImpl implements EoRequestChemicalManager {

	@Override
	public EoRequestChemicalModel get(Long id) {
		return this.myBatisDao.get(EoRequestChemicalModel.class, id);
	}

	@Override
	public List<EoRequestChemicalModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoRequestChemicalModel.class, null, null, conditions);
	}

	@Override
	public EoRequestChemicalModel save(EoRequestChemicalModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoRequestChemicalModel> saveAll(List<EoRequestChemicalModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoRequestChemicalModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoRequestChemicalModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoRequestChemicalModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoRequestChemicalModel.class, ids);
	}

}
