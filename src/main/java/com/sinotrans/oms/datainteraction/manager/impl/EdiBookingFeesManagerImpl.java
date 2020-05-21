package com.sinotrans.oms.datainteraction.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.datainteraction.manager.EdiBookingFeesManager;
import com.sinotrans.oms.datainteraction.model.EdiBookingFeesModel;

/**  
* <p>Title: EdiBookingFeesManagerImpl</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月6日  
* @version 1.0  
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EdiBookingFeesManagerImpl extends MybatisManagerImpl implements EdiBookingFeesManager{

	@Override
	public EdiBookingFeesModel get(Long id) {
		
		return this.myBatisDao.get(EdiBookingFeesModel.class, id);
	}

	@Override
	public List<EdiBookingFeesModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EdiBookingFeesModel.class, null, null, conditions);
	}

	

	@Override
	public List<EdiBookingFeesModel> saveAll(List<EdiBookingFeesModel> models) {
	
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EdiBookingFeesModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EdiBookingFeesModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EdiBookingFeesModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EdiBookingFeesModel.class, ids);
	}
}
