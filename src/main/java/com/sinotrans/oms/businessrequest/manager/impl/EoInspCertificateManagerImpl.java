package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoInspCertificateManager;
import com.sinotrans.oms.businessrequest.model.EoInspCertificateModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoInspCertificateManagerImpl extends MybatisManagerImpl implements EoInspCertificateManager {

	@Override
	public EoInspCertificateModel get(Long id) {
		
		return this.myBatisDao.get(EoInspCertificateModel.class, id);
	}

	@Override
	public List<EoInspCertificateModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoInspCertificateModel.class, null, null, conditions);
	}

	@Override
	public EoInspCertificateModel save(EoInspCertificateModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoInspCertificateModel> saveAll(List<EoInspCertificateModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoInspCertificateModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoInspCertificateModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoInspCertificateModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoInspCertificateModel.class, ids);
	}
}
