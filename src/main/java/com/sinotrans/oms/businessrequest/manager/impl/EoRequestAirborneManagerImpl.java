package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoRequestAirborneManager;
import com.sinotrans.oms.businessrequest.model.EoRequestAirborneModel;

/**
* @author 作者 E-mail: shoven.Jiang
* @version 创建时间：2018年8月29日 上午11:09:57
* 类说明 空运任务
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoRequestAirborneManagerImpl extends MybatisManagerImpl implements EoRequestAirborneManager{

	@Override
	public EoRequestAirborneModel get(Long id) {
		
		return this.myBatisDao.get(EoRequestAirborneModel.class, id);
	}

	@Override
	public List<EoRequestAirborneModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoRequestAirborneModel.class, null, null, conditions);
	}

	@Override
	public EoRequestAirborneModel save(EoRequestAirborneModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoRequestAirborneModel> saveAll(List<EoRequestAirborneModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoRequestAirborneModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoRequestAirborneModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoRequestAirborneModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoRequestAirborneModel.class, ids);
	}
}
