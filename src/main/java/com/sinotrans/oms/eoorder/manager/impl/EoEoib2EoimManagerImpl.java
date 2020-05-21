package com.sinotrans.oms.eoorder.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.eoorder.manager.EoEoib2EoimManager;
import com.sinotrans.oms.eoorder.model.EoEoib2EoimModel;

/**  
* Title: EoEoib2EoimManagerImpl  
* Description:  
* @author Colley.Bai  
* @date 2018年11月1日21:14:46  
* @version 1.0  
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoEoib2EoimManagerImpl extends MybatisManagerImpl  implements EoEoib2EoimManager {

	@Override
	public EoEoib2EoimModel get(Long id) {
		return this.myBatisDao.get(EoEoib2EoimModel.class, id);
	}

	@Override
	public List<EoEoib2EoimModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoEoib2EoimModel.class, null, null, conditions);
	}

	@Override
	public EoEoib2EoimModel save(EoEoib2EoimModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoEoib2EoimModel> saveAll(List<EoEoib2EoimModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoEoib2EoimModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoEoib2EoimModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoEoib2EoimModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoEoib2EoimModel.class, ids);
	}

}
