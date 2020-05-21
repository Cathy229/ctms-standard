package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EoocManager;
import com.sinotrans.oms.businessrequest.model.EoEoom2EoocModel;

/**  
* Title: EoEoom2EoocManagerImpl  
* Description:  
* @author Shoven.Jiang  
* @date 2018年11月13日  
* @version 1.0  
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoEoom2EoocManagerImpl extends MybatisManagerImpl implements EoEoom2EoocManager {

	@Override
	public EoEoom2EoocModel get(Long id) {
		
		return this.myBatisDao.get(EoEoom2EoocModel.class, id);
	}

	@Override
	public List<EoEoom2EoocModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoEoom2EoocModel.class, null, null, conditions);
	}

	@Override
	public EoEoom2EoocModel save(EoEoom2EoocModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoEoom2EoocModel> saveAll(List<EoEoom2EoocModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoEoom2EoocModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoEoom2EoocModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoEoom2EoocModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoEoom2EoocModel.class, ids);
	}
	
}