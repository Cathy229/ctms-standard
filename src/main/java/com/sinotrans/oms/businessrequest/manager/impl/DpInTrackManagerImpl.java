package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.DpInTrackManager;
import com.sinotrans.oms.businessrequest.model.DpInTrackModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class DpInTrackManagerImpl extends MybatisManagerImpl implements DpInTrackManager{

	@Override
	public DpInTrackModel get(Long id) {
		
		return this.myBatisDao.get(DpInTrackModel.class, id);
	}

	@Override
	public List<DpInTrackModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(DpInTrackModel.class, null, null, conditions);
	}

	@Override
	public DpInTrackModel save(DpInTrackModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<DpInTrackModel> saveAll(List<DpInTrackModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(DpInTrackModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(DpInTrackModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(DpInTrackModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(DpInTrackModel.class, ids);
	}

	@Override
	public List<DpInTrackModel> findByCondition(List<FilterCondition> conditions, String orderBy) {
		return this.myBatisDao.findByCondition(DpInTrackModel.class, orderBy, null, conditions);
	}
}
