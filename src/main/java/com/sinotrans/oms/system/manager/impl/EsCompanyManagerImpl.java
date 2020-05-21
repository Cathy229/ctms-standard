package com.sinotrans.oms.system.manager.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.system.manager.EsCompanyManager;
import com.sinotrans.oms.system.model.EsCompanyModel;

@Service
public class EsCompanyManagerImpl extends MybatisManagerImpl implements EsCompanyManager {

	@Override
	public EsCompanyModel get(Long id) {
		return this.myBatisDao.get(EsCompanyModel.class, id);
	}

	@Override
	public List<EsCompanyModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EsCompanyModel.class, null, null, conditions);
	}

	@Override
	public EsCompanyModel save(EsCompanyModel model) {
		return this.myBatisDao.save(model);
	}

	@Override
	public List<EsCompanyModel> saveAll(List<EsCompanyModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EsCompanyModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		this.myBatisDao.batchDelete(EsCompanyModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EsCompanyModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		this.myBatisDao.deleteByPks(EsCompanyModel.class, ids);
	}

	@Override
	public List<Map<String, Object>> querySQL1(Map<String, Object> conditions) {
		return this.myBatisDao.queryByCondition("com.sinotrans.oms.customerproject.mapper.GetSuperUserQuery", conditions, null, null, null);
	}

	@Override
	public List<EsCompanyModel> querySQL2(Map<String, Object> conditions) {
		List<Map<String, Object>> queryList = this.myBatisDao.queryByCondition("com.sinotrans.oms.customerproject.mapper.CompanyByPathQuery", conditions, null, null, null);
		List<EsCompanyModel> escoList = new ArrayList<>();
		if (EmptyUtils.isEmpty(queryList)) {
            return escoList;
        } 
		for (Map<String, Object> map : queryList) {
			escoList.add((EsCompanyModel) BlukInsertUtils.parseMapToObject(map, new EsCompanyModel()));
        }
		return escoList;
	}

}
