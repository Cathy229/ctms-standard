package com.sinotrans.oms.common.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.common.manager.EbProcedureManager;
import com.sinotrans.oms.common.model.EbProcedureModel;

/**  
* <p>Title: EbProcedureManagerImpl</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月14日  
* @version 1.0  
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EbProcedureManagerImpl extends MybatisManagerImpl implements EbProcedureManager{

	@Override
	public EbProcedureModel get(Long id) {
		
		return this.myBatisDao.get(EbProcedureModel.class, id);
	}

	@Override
	public List<EbProcedureModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EbProcedureModel.class, null, null, conditions);
	}

	@Override
	public EbProcedureModel save(EbProcedureModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EbProcedureModel> saveAll(List<EbProcedureModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EbProcedureModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EbProcedureModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EbProcedureModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EbProcedureModel.class, ids);
	}
}
