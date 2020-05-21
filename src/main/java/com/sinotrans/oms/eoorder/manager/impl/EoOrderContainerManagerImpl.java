package com.sinotrans.oms.eoorder.manager.impl;

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
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.eoorder.manager.EoOrderContainerManager;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoOrderContainerManagerImpl extends MybatisManagerImpl implements EoOrderContainerManager{

	@Autowired
	private CommonQueryManager commonQueryManager;
	@Override
	public EoOrderContainerModel get(Long id) {
		
		return this.myBatisDao.get(EoOrderContainerModel.class, id);
	}

	@Override
	public List<EoOrderContainerModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoOrderContainerModel.class, null, null, conditions);
	}

	@Override
	public EoOrderContainerModel save(EoOrderContainerModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoOrderContainerModel> saveAll(List<EoOrderContainerModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoOrderContainerModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoOrderContainerModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoOrderContainerModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoOrderContainerModel.class, ids);
	}

	@Override
	public ResponseData<QueryData> queryOrderContainerByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<>();
		queryInfo.setQueryType("com.sinotrans.oms.eoorder.mapper.EoOrderContainerQuery");
		QueryData queryData = commonQueryManager.query(queryInfo);
		responseData.setData(queryData);
		return responseData;
	}

	/**
	 * EoOrderRelatedQuery.xml
	 */
	@Override
	public QueryData queryBookingByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<>();
		queryInfo.setQueryType("com.sinotrans.oms.eoorder.mapper.EoOrderImportContainerQuery");
		QueryData queryData = commonQueryManager.query(queryInfo);
		return queryData;
	}
}
