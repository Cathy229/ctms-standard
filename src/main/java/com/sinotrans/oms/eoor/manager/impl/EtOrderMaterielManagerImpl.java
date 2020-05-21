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
import com.sinotrans.oms.eoor.manager.EtOrderMaterielManager;
import com.sinotrans.oms.eoor.manager.EtorManager;
import com.sinotrans.oms.eoor.model.EtOrderMaterielModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	
public class EtOrderMaterielManagerImpl extends MybatisManagerImpl implements EtOrderMaterielManager{
	     @Autowired
		private CommonQueryManager commonQueryManager;

		@Override
		public EtOrderMaterielModel get(Integer id) {
			return this.myBatisDao.get(EtOrderMaterielModel.class, id);
		}

		@Override
		public List<EtOrderMaterielModel> findByCondition(List<FilterCondition> conditions) {
			return this.myBatisDao.findByCondition(EtOrderMaterielModel.class, null, null, conditions);
		}

		@Override
		public EtOrderMaterielModel save(EtOrderMaterielModel model) {
			 return this.myBatisDao.save(model);
		}

		@Override
		public List<EtOrderMaterielModel> saveAll(List<EtOrderMaterielModel> models) {
			return this.myBatisDao.saveAll(models);
		}

		@Override
		public void delete(EtOrderMaterielModel model) {
			this.myBatisDao.delete(model);
		}

		@Override
		public void batchDelete(List<FilterCondition> conditions) {
			 this.myBatisDao.batchDelete(EtOrderMaterielModel.class, conditions);
		}

		@Override
		public void deleteByPk(Integer id) {
			this.myBatisDao.deleteByPk(EtOrderMaterielModel.class, id);
		}

		@Override
		public void deleteByPks(Collection<Integer> ids) {
			 this.myBatisDao.deleteByPks(EtOrderMaterielModel.class, ids);
		}

		@Override
		public EtOrderMaterielModel saveOrder(EtOrderMaterielModel etOrdrModel) {
			return this.myBatisDao.save(etOrdrModel);
		}

		
		
	}
