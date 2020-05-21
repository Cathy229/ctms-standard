package com.sinotrans.oms.basicdata.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.basicdata.manager.EbShipperManager;
import com.sinotrans.oms.basicdata.model.EbShipperModel;

@Service
public class EbShipperManagerImpl extends MybatisManagerImpl implements EbShipperManager {

	@Override
	public EbShipperModel get(Long id) {
		return this.myBatisDao.get(EbShipperModel.class, id);
	}

	@Override
	public List<EbShipperModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EbShipperModel.class, null, null, conditions);
	}

	@Override
	public EbShipperModel save(EbShipperModel model) {
		return this.myBatisDao.save(model);
	}

	@Override
	public List<EbShipperModel> saveAll(List<EbShipperModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EbShipperModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		this.myBatisDao.batchDelete(EbShipperModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EbShipperModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		this.myBatisDao.deleteByPks(EbShipperModel.class, ids);
	}

}
