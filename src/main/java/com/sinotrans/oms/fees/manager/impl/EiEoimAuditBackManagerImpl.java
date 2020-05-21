package com.sinotrans.oms.fees.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.fees.manager.EiEoimAuditBackManager;
import com.sinotrans.oms.fees.model.EiEoimAuditBackModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EiEoimAuditBackManagerImpl extends MybatisManagerImpl implements EiEoimAuditBackManager{

	@Override
	public EiEoimAuditBackModel get(Long id) {
		
		return this.myBatisDao.get(EiEoimAuditBackModel.class, id);
	}

	@Override
	public List<EiEoimAuditBackModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EiEoimAuditBackModel.class, null, null, conditions);
	}

	@Override
	public EiEoimAuditBackModel save(EiEoimAuditBackModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EiEoimAuditBackModel> saveAll(List<EiEoimAuditBackModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EiEoimAuditBackModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EiEoimAuditBackModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EiEoimAuditBackModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EiEoimAuditBackModel.class, ids);
	}
	
}
