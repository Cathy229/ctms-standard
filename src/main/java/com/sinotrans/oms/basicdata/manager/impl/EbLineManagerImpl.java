package com.sinotrans.oms.basicdata.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.basicdata.manager.EbLineManager;
import com.sinotrans.oms.basicdata.model.EbLineModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EbLineManagerImpl extends MybatisManagerImpl implements EbLineManager{

	@Override
	public EbLineModel get(Long id) {
		
		return this.myBatisDao.get(EbLineModel.class, id);
	}

	@Override
	public List<EbLineModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EbLineModel.class, null, null, conditions);
	}

	@Override
	public EbLineModel save(EbLineModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EbLineModel> saveAll(List<EbLineModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EbLineModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EbLineModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EbLineModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EbLineModel.class, ids);
	}
}
