package com.sinotrans.oms.customerproject.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.customerproject.manager.EbCustomerContactManager;
import com.sinotrans.oms.customerproject.model.EbCustomerContactModel;

/**
 * Title: 客户表
 * @Date 2018年9月5日 上午9:49:27
 * @Title: EbCustomerManagerImpl.java客户表
 * @Author Simon Guo
 * @Description: TODO
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EbCustomerContactManagerImpl extends MybatisManagerImpl implements EbCustomerContactManager {

	@Override
	public EbCustomerContactModel get(Long id) {
		
		return this.myBatisDao.get(EbCustomerContactModel.class, id);
	}

	@Override
	public List<EbCustomerContactModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EbCustomerContactModel.class, null, null, conditions);
	}

	@Override
	public EbCustomerContactModel save(EbCustomerContactModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EbCustomerContactModel> saveAll(List<EbCustomerContactModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EbCustomerContactModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EbCustomerContactModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EbCustomerContactModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EbCustomerContactModel.class, ids);
	}
}
