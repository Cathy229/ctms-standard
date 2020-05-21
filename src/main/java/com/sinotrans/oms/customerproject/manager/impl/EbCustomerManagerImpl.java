package com.sinotrans.oms.customerproject.manager.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.customerproject.manager.EbCustomerContactManager;
import com.sinotrans.oms.customerproject.manager.EbCustomerManager;
import com.sinotrans.oms.customerproject.model.EbCustomerContactModel;
import com.sinotrans.oms.customerproject.model.EbCustomerModel;
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
public class EbCustomerManagerImpl extends MybatisManagerImpl implements EbCustomerManager {

	@Autowired
	private EbCustomerContactManager ebCustomerContactManager;
	
	
	@Override
	public EbCustomerModel get(Long id) {
		
		return this.myBatisDao.get(EbCustomerModel.class, id);
	}

	@Override
	public List<EbCustomerModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EbCustomerModel.class, null, null, conditions);
	}

	@Override
	public EbCustomerModel save(EbCustomerModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EbCustomerModel> saveAll(List<EbCustomerModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EbCustomerModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EbCustomerModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EbCustomerModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EbCustomerModel.class, ids);
	}

	@Override
	public List<EbCustomerContactModel> getEbCustomerContactByEbcuId(Long id) {
		List<FilterCondition> ebcuIdFilterCondition = new ArrayList<>();
		ebcuIdFilterCondition.add(new FilterCondition("ebccEbcuId",id,"="));
		List<EbCustomerContactModel> ebCustomerContactList = ebCustomerContactManager.findByCondition(ebcuIdFilterCondition);
		return ebCustomerContactList;
	}
}
