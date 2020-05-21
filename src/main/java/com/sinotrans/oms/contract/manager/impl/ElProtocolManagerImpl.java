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
import com.sinotrans.oms.contract.manager.ElProtocolManager;
import com.sinotrans.oms.contract.model.ElProtocolModel;

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
public class ElProtocolManagerImpl extends MybatisManagerImpl implements ElProtocolManager {

	@Autowired
	private CommonQueryManager commonQueryManager;
	
	@Override
	public ElProtocolModel get(Long id) {
		return this.myBatisDao.get(ElProtocolModel.class, id);
	}

	@Override
	public List<ElProtocolModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(ElProtocolModel.class, null, null, conditions);
	}

	@Override
	public ElProtocolModel save(ElProtocolModel model) {
		return this.myBatisDao.save(model);
	}

	@Override
	public List<ElProtocolModel> saveAll(List<ElProtocolModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(ElProtocolModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(ElProtocolModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(ElProtocolModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(ElProtocolModel.class, ids);
	}

	@Override
	public QueryData queryProtocolByCondition(QueryInfo queryInfo) {
		queryInfo.setQueryType("ElProtocolListQuery");
		return commonQueryManager.query(queryInfo);
	}

}
