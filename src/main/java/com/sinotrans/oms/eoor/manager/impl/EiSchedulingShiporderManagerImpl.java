package com.sinotrans.oms.eoor.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.oms.eoor.manager.EiSchedulingShiporderManager;
import com.sinotrans.oms.eoor.model.EiSchedulingShiporderModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EiSchedulingShiporderManagerImpl extends MybatisManagerImpl implements EiSchedulingShiporderManager {

	@Autowired
	private CommonQueryManager commonQueryManager;
	@Override
	public EiSchedulingShiporderModel saveOrder(EiSchedulingShiporderModel eoOrdrModel) {
		
		return this.myBatisDao.save(eoOrdrModel);
	}


	@Override
	public EiSchedulingShiporderModel get(Integer id) {
		
		return this.myBatisDao.get(EiSchedulingShiporderModel.class, id);
	}

	@Override
	public List<EiSchedulingShiporderModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EiSchedulingShiporderModel.class, null, null, conditions);
	}

	@Override
	public EiSchedulingShiporderModel save(EiSchedulingShiporderModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EiSchedulingShiporderModel> saveAll(List<EiSchedulingShiporderModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EiSchedulingShiporderModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EiSchedulingShiporderModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Integer id) {
		this.myBatisDao.deleteByPk(EiSchedulingShiporderModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Integer> ids) {
		 this.myBatisDao.deleteByPks(EiSchedulingShiporderModel.class, ids);
	}

}
