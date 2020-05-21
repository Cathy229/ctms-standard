package com.sinotrans.oms.contract.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.contract.manager.ElContractManager;
import com.sinotrans.oms.contract.model.ElContractModel;

/**
 * <p>Description: 合同设置Manager </p>
 * @author Colley.Bai
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 20181120              Colley.Bai       	                    创建
 * </pre>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class ElContractManagerImpl extends MybatisManagerImpl implements ElContractManager {

	@Autowired
	private CommonQueryManager commonQueryManager;
	
	@Override
	public ElContractModel get(Long id) {
		return this.myBatisDao.get(ElContractModel.class, id);
	}

	@Override
	public List<ElContractModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(ElContractModel.class, null, null, conditions);
	}

	@Override
	public ElContractModel save(ElContractModel model) {
		return this.myBatisDao.save(model);
	}

	@Override
	public List<ElContractModel> saveAll(List<ElContractModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(ElContractModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(ElContractModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(ElContractModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(ElContractModel.class, ids);
	}

	@Override
	public QueryData queryContractByCondition(QueryInfo queryInfo) {
		queryInfo.setQueryType("ElContractListQuery");
		return commonQueryManager.query(queryInfo);
	}

}
