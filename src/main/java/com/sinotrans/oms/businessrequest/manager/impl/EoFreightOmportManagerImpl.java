package com.sinotrans.oms.businessrequest.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoFreightOmportManager;
import com.sinotrans.oms.businessrequest.model.EoFreightOmportModel;

/**  
* Title: EoFreightOmportManagerImpl  
* Description:  
* @author Shoven.Jiang  
* @date 2018年10月30日  
* @version 1.0  
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoFreightOmportManagerImpl extends MybatisManagerImpl implements EoFreightOmportManager {

	@Override
	public EoFreightOmportModel get(Long id) {
		
		return this.myBatisDao.get(EoFreightOmportModel.class, id);
	}

	@Override
	public List<EoFreightOmportModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoFreightOmportModel.class, null, null, conditions);
	}

	@Override
	public EoFreightOmportModel save(EoFreightOmportModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoFreightOmportModel> saveAll(List<EoFreightOmportModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoFreightOmportModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoFreightOmportModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoFreightOmportModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoFreightOmportModel.class, ids);
	}
}
