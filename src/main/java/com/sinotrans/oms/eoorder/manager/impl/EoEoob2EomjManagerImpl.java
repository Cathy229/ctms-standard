package com.sinotrans.oms.eoorder.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrequest.manager.EoFreightOmportManager;
import com.sinotrans.oms.eoorder.manager.EoEoob2EomjManager;
import com.sinotrans.oms.eoorder.model.EoEoob2EomjModel;

/**  
* Title: EoEoob2EomjManagerImpl  
* Description:  
* @author Colley.Bai  
* @date 2018年11月1日21:14:46  
* @version 1.0  
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoEoob2EomjManagerImpl extends MybatisManagerImpl implements EoEoob2EomjManager {

	@Override
	public EoEoob2EomjModel get(Long id) {
		
		return this.myBatisDao.get(EoEoob2EomjModel.class, id);
	}

	@Override
	public List<EoEoob2EomjModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoEoob2EomjModel.class, null, null, conditions);
	}

	@Override
	public EoEoob2EomjModel save(EoEoob2EomjModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoEoob2EomjModel> saveAll(List<EoEoob2EomjModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoEoob2EomjModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoEoob2EomjModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoEoob2EomjModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoEoob2EomjModel.class, ids);
	}
}
