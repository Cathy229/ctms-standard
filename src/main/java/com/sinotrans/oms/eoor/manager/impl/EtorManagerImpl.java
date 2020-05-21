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
import com.sinotrans.oms.eoor.manager.EtorManager;
import com.sinotrans.oms.eoor.model.EtOrderModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EtorManagerImpl extends MybatisManagerImpl implements EtorManager{
     @Autowired
	private CommonQueryManager commonQueryManager;

	@Override
	public EtOrderModel get(Integer id) {
		return this.myBatisDao.get(EtOrderModel.class, id);
	}

	@Override
	public List<EtOrderModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EtOrderModel.class, null, null, conditions);
	}

	@Override
	public EtOrderModel save(EtOrderModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EtOrderModel> saveAll(List<EtOrderModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EtOrderModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EtOrderModel.class, conditions);
	}

	@Override
	public void deleteByPk(Integer id) {
		this.myBatisDao.deleteByPk(EtOrderModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Integer> ids) {
		 this.myBatisDao.deleteByPks(EtOrderModel.class, ids);
	}

	@Override
	public EtOrderModel saveOrder(EtOrderModel etOrdrModel) {
		return this.myBatisDao.save(etOrdrModel);
	}

	
	
}
