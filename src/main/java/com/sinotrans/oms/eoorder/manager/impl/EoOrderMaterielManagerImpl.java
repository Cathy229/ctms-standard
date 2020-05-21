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
import com.sinotrans.oms.eoorder.manager.EoOrderMaterielManager;
import com.sinotrans.oms.eoorder.model.EoOrderMaterielModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoOrderMaterielManagerImpl extends MybatisManagerImpl implements EoOrderMaterielManager{

	@Autowired 
	private CommonQueryManager commonQueryManager;
	@Override
	public EoOrderMaterielModel get(Long id) {
		
		return this.myBatisDao.get(EoOrderMaterielModel.class, id);
	}

	@Override
	public List<EoOrderMaterielModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoOrderMaterielModel.class, null, null, conditions);
	}

	@Override
	public EoOrderMaterielModel save(EoOrderMaterielModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoOrderMaterielModel> saveAll(List<EoOrderMaterielModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoOrderMaterielModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoOrderMaterielModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoOrderMaterielModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoOrderMaterielModel.class, ids);
	}

	@Override
	public ResponseData<QueryData> queryOrderMaterialByModel(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<>();
		queryInfo.setQueryType("com.sinotrans.oms.eoorder.mapper.EoOrderMaterialQuery");
		QueryData queryData = commonQueryManager.query(queryInfo);
		responseData.setData(queryData);
		return responseData;
	}
	
}
