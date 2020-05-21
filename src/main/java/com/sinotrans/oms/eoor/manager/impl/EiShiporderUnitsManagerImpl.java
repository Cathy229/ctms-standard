package com.sinotrans.oms.eoor.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.oms.eoor.manager.EiShiporderUnitsManager;
import com.sinotrans.oms.eoor.model.EiShiporderUnitsModel;

    @Service
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public class EiShiporderUnitsManagerImpl extends MybatisManagerImpl implements EiShiporderUnitsManager{
	     @Autowired
		private CommonQueryManager commonQueryManager;

		@Override
		public EiShiporderUnitsModel get(Integer id) {
			return this.myBatisDao.get(EiShiporderUnitsModel.class, id);
		}

		@Override
		public List<EiShiporderUnitsModel> findByCondition(List<FilterCondition> conditions) {
			return this.myBatisDao.findByCondition(EiShiporderUnitsModel.class, null, null, conditions);
		}

		@Override
		public EiShiporderUnitsModel save(EiShiporderUnitsModel model) {
			 return this.myBatisDao.save(model);
		}

		@Override
		public List<EiShiporderUnitsModel> saveAll(List<EiShiporderUnitsModel> models) {
			return this.myBatisDao.saveAll(models);
		}

		@Override
		public void delete(EiShiporderUnitsModel model) {
			this.myBatisDao.delete(model);
		}

		@Override
		public void batchDelete(List<FilterCondition> conditions) {
			 this.myBatisDao.batchDelete(EiShiporderUnitsModel.class, conditions);
		}

		@Override
		public void deleteByPk(Integer id) {
			this.myBatisDao.deleteByPk(EiShiporderUnitsModel.class, id);
		}

		@Override
		public void deleteByPks(Collection<Integer> ids) {
			 this.myBatisDao.deleteByPks(EiShiporderUnitsModel.class, ids);
		}

		@Override
		public EiShiporderUnitsModel saveOrder(EiShiporderUnitsModel etOrdrModel) {
			return this.myBatisDao.save(etOrdrModel);
		}

		
		
	}