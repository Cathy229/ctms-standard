package com.sinotrans.oms.datainteraction.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.datainteraction.manager.EdiBookingPrecontainerManager;
import com.sinotrans.oms.datainteraction.model.EdiBookingPrecontainerModel;

/**  
* <p>Title: EdiBookingPrecontainerManagerImpl</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月6日  
* @version 1.0  
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EdiBookingPrecontainerManagerImpl extends MybatisManagerImpl implements EdiBookingPrecontainerManager{

	@Override
	public EdiBookingPrecontainerModel get(Long id) {
		
		return this.myBatisDao.get(EdiBookingPrecontainerModel.class, id);
	}

	@Override
	public List<EdiBookingPrecontainerModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EdiBookingPrecontainerModel.class, null, null, conditions);
	}

	

	@Override
	public List<EdiBookingPrecontainerModel> saveAll(List<EdiBookingPrecontainerModel> models) {
	
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EdiBookingPrecontainerModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EdiBookingPrecontainerModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EdiBookingPrecontainerModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EdiBookingPrecontainerModel.class, ids);
	}
}
