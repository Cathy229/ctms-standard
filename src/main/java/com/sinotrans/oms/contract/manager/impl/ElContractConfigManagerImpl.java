package com.sinotrans.oms.contract.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.contract.manager.ElContractConfigManager;
import com.sinotrans.oms.contract.model.ElContractConfigModel;

/**
 * <p>Description: 合同接单设置Manage </p>
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
public class ElContractConfigManagerImpl extends MybatisManagerImpl implements ElContractConfigManager {

	@Override
	public ElContractConfigModel get(Long id) {
		return this.myBatisDao.get(ElContractConfigModel.class, id);
	}

	@Override
	public List<ElContractConfigModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(ElContractConfigModel.class, null, null, conditions);
	}

	@Override
	public ElContractConfigModel save(ElContractConfigModel model) {
		return this.myBatisDao.save(model);
	}

	@Override
	public List<ElContractConfigModel> saveAll(List<ElContractConfigModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(ElContractConfigModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(ElContractConfigModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(ElContractConfigModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		this.myBatisDao.deleteByPks(ElContractConfigModel.class, ids);
	}

}
