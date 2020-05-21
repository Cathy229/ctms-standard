package com.sinotrans.oms.fees.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.fees.manager.EbEbpj2EbfhManager;
import com.sinotrans.oms.fees.model.EbEbpj2EbfhModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EbEbpj2EbfhManagerImpl extends MybatisManagerImpl implements EbEbpj2EbfhManager{

	@Override
	public EbEbpj2EbfhModel get(Long id) {
		
		return this.myBatisDao.get(EbEbpj2EbfhModel.class, id);
	}

	@Override
	public List<EbEbpj2EbfhModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EbEbpj2EbfhModel.class, null, null, conditions);
	}

	@Override
	public EbEbpj2EbfhModel save(EbEbpj2EbfhModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EbEbpj2EbfhModel> saveAll(List<EbEbpj2EbfhModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EbEbpj2EbfhModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EbEbpj2EbfhModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EbEbpj2EbfhModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EbEbpj2EbfhModel.class, ids);
	}
	
}
