package com.sinotrans.oms.fees.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.fees.manager.EiInformationMainManager;
import com.sinotrans.oms.fees.model.EiInformationMainModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EiInformationMainManagerImpl extends MybatisManagerImpl implements EiInformationMainManager{

	@Override
	public EiInformationMainModel get(Long id) {
		
		return this.myBatisDao.get(EiInformationMainModel.class, id);
	}

	@Override
	public List<EiInformationMainModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EiInformationMainModel.class, null, null, conditions);
	}

	@Override
	public EiInformationMainModel save(EiInformationMainModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EiInformationMainModel> saveAll(List<EiInformationMainModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EiInformationMainModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EiInformationMainModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EiInformationMainModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EiInformationMainModel.class, ids);
	}
}
