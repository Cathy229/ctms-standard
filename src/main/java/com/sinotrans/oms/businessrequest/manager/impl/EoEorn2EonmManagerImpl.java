package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoEorn2EonmManager;
import com.sinotrans.oms.businessrequest.model.EoEorn2EonmModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoEorn2EonmManagerImpl extends MybatisManagerImpl implements EoEorn2EonmManager {

	@Override
	public EoEorn2EonmModel get(Long id) {
		
		return this.myBatisDao.get(EoEorn2EonmModel.class, id);
	}

	@Override
	public List<EoEorn2EonmModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoEorn2EonmModel.class, null, null, conditions);
	}

	@Override
	public EoEorn2EonmModel save(EoEorn2EonmModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoEorn2EonmModel> saveAll(List<EoEorn2EonmModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoEorn2EonmModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoEorn2EonmModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoEorn2EonmModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoEorn2EonmModel.class, ids);
	}
}
