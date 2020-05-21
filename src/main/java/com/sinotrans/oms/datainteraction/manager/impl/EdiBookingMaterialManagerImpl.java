package com.sinotrans.oms.datainteraction.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.datainteraction.manager.EdiBookingMaterialManager;
import com.sinotrans.oms.datainteraction.model.EdiBookingMaterialModel;

/**  
* <p>Title: EdiBookingMaterialManagerImpl</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月6日  
* @version 1.0  
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EdiBookingMaterialManagerImpl extends MybatisManagerImpl implements EdiBookingMaterialManager{

	@Override
	public EdiBookingMaterialModel get(Long id) {
		
		return this.myBatisDao.get(EdiBookingMaterialModel.class, id);
	}

	@Override
	public List<EdiBookingMaterialModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EdiBookingMaterialModel.class, null, null, conditions);
	}

	

	@Override
	public List<EdiBookingMaterialModel> saveAll(List<EdiBookingMaterialModel> models) {
	
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EdiBookingMaterialModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EdiBookingMaterialModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EdiBookingMaterialModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EdiBookingMaterialModel.class, ids);
	}
}
