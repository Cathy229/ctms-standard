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
import com.sinotrans.oms.eoor.manager.EotaManager;
import com.sinotrans.oms.eoor.manager.EtLineNodeManager;
import com.sinotrans.oms.eoor.model.EtLineNodeModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EtLineNodeManagerImpl extends MybatisManagerImpl implements EtLineNodeManager{
    @Autowired
	private CommonQueryManager commonQueryManager;
    @Override
	public EtLineNodeModel saveOrder(EtLineNodeModel etLineNodeModel) {
		
		return this.myBatisDao.save(etLineNodeModel);
	}


	@Override
	public EtLineNodeModel get(Integer id) {
		
		return this.myBatisDao.get(EtLineNodeModel.class, id);
	}

	@Override
	public List<EtLineNodeModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EtLineNodeModel.class, null, null, conditions);
	}

	@Override
	public EtLineNodeModel save(EtLineNodeModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EtLineNodeModel> saveAll(List<EtLineNodeModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EtLineNodeModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EtLineNodeModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Integer id) {
		this.myBatisDao.deleteByPk(EtLineNodeModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Integer> ids) {
		 this.myBatisDao.deleteByPks(EtLineNodeModel.class, ids);
	}

}
