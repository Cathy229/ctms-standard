package com.sinotrans.oms.fileupload.manager.impl;

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
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;
import com.sinotrans.oms.fileupload.manager.EbFileManager;
import com.sinotrans.oms.fileupload.model.EbFileModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EbFileManagerImpl extends MybatisManagerImpl implements EbFileManager{

	@Autowired
	private CommonQueryManager commonQueryManager;
	
	@Override
	public EbFileModel get(Long id) {
		return this.myBatisDao.get(EbFileModel.class, id);
	}

	@Override
	public List<EbFileModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EbFileModel.class, null, null, conditions);
	}

	@Override
	public List<EbFileModel> saveAll(List<EbFileModel> models) {
	
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EbFileModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EbFileModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EbFileModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EbFileModel.class, ids);
	}

	@Override
	public EbFileModel save(EbFileModel model) {
		// TODO Auto-generated method stub
		return this.myBatisDao.save(model);
	}

	@Override
	public QueryData getFileByCondition(QueryInfo queryInfo) {
		queryInfo.setQueryType("EbFileListQuery");
		return commonQueryManager.query(queryInfo);
	}
	
	@Override
	public QueryData getFileByElct(QueryInfo queryInfo) {
		queryInfo.setQueryType("EbFileByElctListQuery");
		return commonQueryManager.query(queryInfo);
	}

}
