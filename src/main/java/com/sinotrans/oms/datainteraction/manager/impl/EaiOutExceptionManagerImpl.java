package com.sinotrans.oms.datainteraction.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.datainteraction.manager.EaiOutExceptionManager;
import com.sinotrans.oms.datainteraction.model.EaiOutExceptionModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingFeesModel;
/**  
* <p>Title: EaiOutExceptionManagerImpl</p>  
* <p>Description: </p>  
* @author Colley.Bai 
* @date 2018年11月15日  
* @version 1.0  
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EaiOutExceptionManagerImpl extends MybatisManagerImpl implements EaiOutExceptionManager {

	@Override
	public EaiOutExceptionModel get(Long id) {
		return this.myBatisDao.get(EaiOutExceptionModel.class, id);
	}

	@Override
	public List<EaiOutExceptionModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EaiOutExceptionModel.class, null, null, conditions);
	}

	@Override
	public List<EaiOutExceptionModel> saveAll(List<EaiOutExceptionModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EaiOutExceptionModel model) {
		this.myBatisDao.delete(model);

	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		this.myBatisDao.batchDelete(EaiOutExceptionModel.class, conditions);

	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EaiOutExceptionModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		this.myBatisDao.deleteByPks(EaiOutExceptionModel.class, ids);

	}

	@Override
	public EaiOutExceptionModel save(EaiOutExceptionModel model) {
		return this.myBatisDao.save(model);
	}

}
