package com.sinotrans.oms.datainteraction.manager.impl;
import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.datainteraction.manager.EdiBookingManager;
import com.sinotrans.oms.datainteraction.model.EdiBookingModel;

/**  
* <p>Title: EdiBookingManagerImpl</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月4日  
* @version 1.0  
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EdiBookingManagerImpl extends MybatisManagerImpl implements EdiBookingManager{

	@Override
	public EdiBookingModel get(Long id) {
		
		return this.myBatisDao.get(EdiBookingModel.class, id);
	}

	@Override
	public List<EdiBookingModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EdiBookingModel.class, null, null, conditions);
	}

	@Override
	public EdiBookingModel save(EdiBookingModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EdiBookingModel> saveAll(List<EdiBookingModel> models) {
	
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EdiBookingModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EdiBookingModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EdiBookingModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EdiBookingModel.class, ids);
	}

}

