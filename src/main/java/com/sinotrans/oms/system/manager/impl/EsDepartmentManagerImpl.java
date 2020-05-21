package com.sinotrans.oms.system.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.system.manager.EsDepartmentManager;
import com.sinotrans.oms.system.model.EsDepartmentModel;

@Service
public class EsDepartmentManagerImpl extends MybatisManagerImpl implements EsDepartmentManager {

	@Override
	public EsDepartmentModel get(Long id) {
		return this.myBatisDao.get(EsDepartmentModel.class, id);
	}

	@Override
	public List<EsDepartmentModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EsDepartmentModel.class, null, null, conditions);
	}

	@Override
	public EsDepartmentModel save(EsDepartmentModel model) {
		return this.myBatisDao.save(model);
	}

	@Override
	public List<EsDepartmentModel> saveAll(List<EsDepartmentModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EsDepartmentModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		this.myBatisDao.batchDelete(EsDepartmentModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EsDepartmentModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		this.myBatisDao.deleteByPks(EsDepartmentModel.class, ids);
	}

}
