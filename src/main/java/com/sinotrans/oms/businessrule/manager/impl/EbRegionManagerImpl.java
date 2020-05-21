package com.sinotrans.oms.businessrule.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrule.manager.EbRegionManager;
import com.sinotrans.oms.businessrule.model.EbRegionModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EbRegionManagerImpl extends MybatisManagerImpl implements EbRegionManager{

	@Override
	public EbRegionModel get(Integer id) {
		
		return this.myBatisDao.get(EbRegionModel.class, id);
	}

	@Override
	public List<EbRegionModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EbRegionModel.class, null, null, conditions);
	}

	@Override
	public EbRegionModel save(EbRegionModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EbRegionModel> saveAll(List<EbRegionModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EbRegionModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EbRegionModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Integer id) {
		this.myBatisDao.deleteByPk(EbRegionModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EbRegionModel.class, ids);
	}
	

}
