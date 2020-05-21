package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoRequestSeaborneManager;
import com.sinotrans.oms.businessrequest.model.EoRequestSeaborneModel;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年8月29日 上午11:18:25
* 类说明
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoRequestSeaborneManagerImpl extends MybatisManagerImpl implements EoRequestSeaborneManager{

	@Override
	public EoRequestSeaborneModel get(Long id) {
		
		return this.myBatisDao.get(EoRequestSeaborneModel.class, id);
	}

	@Override
	public List<EoRequestSeaborneModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoRequestSeaborneModel.class, null, null, conditions);
	}

	@Override
	public EoRequestSeaborneModel save(EoRequestSeaborneModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoRequestSeaborneModel> saveAll(List<EoRequestSeaborneModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoRequestSeaborneModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoRequestSeaborneModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoRequestSeaborneModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoRequestSeaborneModel.class, ids);
	}
}
