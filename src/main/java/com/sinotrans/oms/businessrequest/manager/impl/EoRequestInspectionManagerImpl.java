package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoRequestInspectionManager;
import com.sinotrans.oms.businessrequest.model.EoRequestInspectionModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoRequestInspectionManagerImpl extends MybatisManagerImpl implements EoRequestInspectionManager {

	@Override
	public EoRequestInspectionModel get(Long id) {
		
		return this.myBatisDao.get(EoRequestInspectionModel.class, id);
	}

	@Override
	public List<EoRequestInspectionModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoRequestInspectionModel.class, null, null, conditions);
	}

	@Override
	public EoRequestInspectionModel save(EoRequestInspectionModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoRequestInspectionModel> saveAll(List<EoRequestInspectionModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoRequestInspectionModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoRequestInspectionModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoRequestInspectionModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoRequestInspectionModel.class, ids);
	}
}
