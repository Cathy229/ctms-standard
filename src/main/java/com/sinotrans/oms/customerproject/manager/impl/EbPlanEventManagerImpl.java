package com.sinotrans.oms.customerproject.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.customerproject.manager.EbPlanEventManager;
import com.sinotrans.oms.customerproject.model.EbPlanEventModel;
/**
 * <p>Title: 项目执行计划作业步骤表</p>
 * <p>Description: 
 *    
 * </p>
 *<pre>
 * 修改记录:
 * 修改后版本            修改人       	 	修改日期   	      修改内容
 * 2018073101  Shoven Jiang 2018073101 	创建
 * 
 * 
 * </pre>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EbPlanEventManagerImpl extends MybatisManagerImpl implements EbPlanEventManager {

	@Override
	public EbPlanEventModel get(Long id) {
		
		return this.myBatisDao.get(EbPlanEventModel.class, id);
	}

	@Override
	public List<EbPlanEventModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EbPlanEventModel.class, null, null, conditions);
	}

	@Override
	public EbPlanEventModel save(EbPlanEventModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EbPlanEventModel> saveAll(List<EbPlanEventModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EbPlanEventModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EbPlanEventModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EbPlanEventModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EbPlanEventModel.class, ids);
	}
}
