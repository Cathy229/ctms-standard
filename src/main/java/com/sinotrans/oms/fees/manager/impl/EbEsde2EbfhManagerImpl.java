package com.sinotrans.oms.fees.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.fees.manager.EbEsde2EbfhManager;
import com.sinotrans.oms.fees.model.EbEsde2EbfhModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EbEsde2EbfhManagerImpl extends MybatisManagerImpl implements EbEsde2EbfhManager{

	@Override
	public EbEsde2EbfhModel get(Long id) {
		
		return this.myBatisDao.get(EbEsde2EbfhModel.class, id);
	}

	@Override
	public List<EbEsde2EbfhModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EbEsde2EbfhModel.class, null, null, conditions);
	}

	@Override
	public EbEsde2EbfhModel save(EbEsde2EbfhModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EbEsde2EbfhModel> saveAll(List<EbEsde2EbfhModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EbEsde2EbfhModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EbEsde2EbfhModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EbEsde2EbfhModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EbEsde2EbfhModel.class, ids);
	}
}
