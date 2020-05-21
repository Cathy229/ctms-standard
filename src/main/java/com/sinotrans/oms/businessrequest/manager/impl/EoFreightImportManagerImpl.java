package com.sinotrans.oms.businessrequest.manager.impl;

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
import com.sinotrans.oms.businessrequest.manager.EoFreightImportManager;
import com.sinotrans.oms.businessrequest.model.EoFreightImportModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoFreightImportManagerImpl extends MybatisManagerImpl implements EoFreightImportManager {

	@Autowired
	private CommonQueryManager commonQueryManager;//通用查询
	
	@Override
	public EoFreightImportModel get(Long id) {
		return this.myBatisDao.get(EoFreightImportModel.class, id);
	}

	@Override
	public List<EoFreightImportModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoFreightImportModel.class, null, null, conditions);
	}

	@Override
	public EoFreightImportModel save(EoFreightImportModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoFreightImportModel> saveAll(List<EoFreightImportModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoFreightImportModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoFreightImportModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoFreightImportModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoFreightImportModel.class, ids);
	}

	@Override
	public QueryData queryFreightImportByCondition(QueryInfo queryInfo) {
		queryInfo.setQueryType("EoFreightImportListQuery");
		return commonQueryManager.query(queryInfo);
	}

	@Override
	public QueryData queryFreightImportTrackByCondition(QueryInfo queryInfo) {
		queryInfo.setQueryType("EoFreightImportTrackListQuery");
		return commonQueryManager.query(queryInfo);
	}

}
