package com.sinotrans.oms.eoorder.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.eoorder.manager.EoOrderExpandAgencyManager;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
/**
 * <p>Title: 订单代理拓展表</p>
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
public class EoOrderExpandAgencyManagerImpl extends MybatisManagerImpl implements EoOrderExpandAgencyManager{

	@Override
	public EoOrderExpandAgencyModel get(Long id) {
		
		return this.myBatisDao.get(EoOrderExpandAgencyModel.class, id);
	}

	@Override
	public List<EoOrderExpandAgencyModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoOrderExpandAgencyModel.class, null, null, conditions);
	}

	@Override
	public EoOrderExpandAgencyModel save(EoOrderExpandAgencyModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoOrderExpandAgencyModel> saveAll(List<EoOrderExpandAgencyModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoOrderExpandAgencyModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoOrderExpandAgencyModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoOrderExpandAgencyModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoOrderExpandAgencyModel.class, ids);
	}
}
