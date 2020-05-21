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
import com.sinotrans.oms.contract.manager.ElContractGreatClausesManager;
import com.sinotrans.oms.contract.model.ElContractGreatClausesModel;

/**
 * <p>Description: 合同重要条款Manager </p>
 * @author Colley.Bai
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 20190319              Colley.Bai       	                    创建
 * </pre>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class ElContractGreatClausesManagerImpl extends MybatisManagerImpl implements ElContractGreatClausesManager {

	@Autowired
	private CommonQueryManager commonQueryManager;
	
	@Override
	public ElContractGreatClausesModel get(Long id) {
		return this.myBatisDao.get(ElContractGreatClausesModel.class, id);
	}

	@Override
	public List<ElContractGreatClausesModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(ElContractGreatClausesModel.class, null, null, conditions);
	}

	@Override
	public ElContractGreatClausesModel save(ElContractGreatClausesModel model) {
		return this.myBatisDao.save(model);
	}

	@Override
	public List<ElContractGreatClausesModel> saveAll(List<ElContractGreatClausesModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(ElContractGreatClausesModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(ElContractGreatClausesModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(ElContractGreatClausesModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(ElContractGreatClausesModel.class, ids);
	}

}
