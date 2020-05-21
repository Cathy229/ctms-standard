package com.sinotrans.oms.basicdata.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.basicdata.manager.EbBillNoRuleManager;
import com.sinotrans.oms.basicdata.model.EbBillNoRuleModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EbBillNoRuleManagerImpl extends MybatisManagerImpl implements EbBillNoRuleManager{

	@Override
	public EbBillNoRuleModel get(Long id) {
		
		return this.myBatisDao.get(EbBillNoRuleModel.class, id);
	}

	@Override
	public List<EbBillNoRuleModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EbBillNoRuleModel.class, null, null, conditions);
	}

	@Override
	public EbBillNoRuleModel save(EbBillNoRuleModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EbBillNoRuleModel> saveAll(List<EbBillNoRuleModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EbBillNoRuleModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EbBillNoRuleModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EbBillNoRuleModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EbBillNoRuleModel.class, ids);
	}
}
