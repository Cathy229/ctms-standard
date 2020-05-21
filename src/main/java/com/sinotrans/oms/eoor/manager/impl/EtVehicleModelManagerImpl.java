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
import com.sinotrans.oms.eoor.manager.EtVehicleModelManager;
import com.sinotrans.oms.eoor.model.EtVehicleModelModel;
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EtVehicleModelManagerImpl  extends MybatisManagerImpl implements EtVehicleModelManager {

	  @Autowired
		private CommonQueryManager commonQueryManager;

		@Override
		public EtVehicleModelModel get(Integer id) {
			return this.myBatisDao.get(EtVehicleModelModel.class, id);
		}

		@Override
		public List<EtVehicleModelModel> findByCondition(List<FilterCondition> conditions) {
			return this.myBatisDao.findByCondition(EtVehicleModelModel.class, null, null, conditions);
		}

		@Override
		public EtVehicleModelModel save(EtVehicleModelModel model) {
			 return this.myBatisDao.save(model);
		}

		@Override
		public List<EtVehicleModelModel> saveAll(List<EtVehicleModelModel> models) {
			return this.myBatisDao.saveAll(models);
		}

		@Override
		public void delete(EtVehicleModelModel model) {
			this.myBatisDao.delete(model);
		}

		@Override
		public void batchDelete(List<FilterCondition> conditions) {
			 this.myBatisDao.batchDelete(EtVehicleModelModel.class, conditions);
		}

		@Override
		public void deleteByPk(Integer id) {
			this.myBatisDao.deleteByPk(EtVehicleModelModel.class, id);
		}

		@Override
		public void deleteByPks(Collection<Integer> ids) {
			 this.myBatisDao.deleteByPks(EtVehicleModelModel.class, ids);
		}

		@Override
		public EtVehicleModelModel saveOrder(EtVehicleModelModel etVehicleModelModel) {
			return this.myBatisDao.save(etVehicleModelModel);
		}

}
