package com.sinotrans.oms.eoor.manager.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.eoor.dto.CheckEoorInfoQueryItem;
import com.sinotrans.oms.eoor.dto.EtVehicleByScheduleQueryItem;
import com.sinotrans.oms.eoor.manager.EtVehicleManager;
import com.sinotrans.oms.eoor.model.EtVehicleModel;
import com.sinotrans.oms.eoorder.model.EoConsignmentModel;

	@Service
	@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
	public class EtVehicleManagerImpl extends MybatisManagerImpl implements EtVehicleManager{
	     @Autowired
		private CommonQueryManager commonQueryManager;

		@Override
		public EtVehicleModel get(Integer id) {
			return this.myBatisDao.get(EtVehicleModel.class, id);
		}

		@Override
		public List<EtVehicleModel> findByCondition(List<FilterCondition> conditions) {
			return this.myBatisDao.findByCondition(EtVehicleModel.class, null, null, conditions);
		}

		@Override
		public EtVehicleModel save(EtVehicleModel model) {
			 return this.myBatisDao.save(model);
		}

		@Override
		public List<EtVehicleModel> saveAll(List<EtVehicleModel> models) {
			return this.myBatisDao.saveAll(models);
		}

		@Override
		public void delete(EtVehicleModel model) {
			this.myBatisDao.delete(model);
		}

		@Override
		public void batchDelete(List<FilterCondition> conditions) {
			 this.myBatisDao.batchDelete(EtVehicleModel.class, conditions);
		}

		@Override
		public void deleteByPk(Integer id) {
			this.myBatisDao.deleteByPk(EtVehicleModel.class, id);
		}

		@Override
		public void deleteByPks(Collection<Integer> ids) {
			 this.myBatisDao.deleteByPks(EtVehicleModel.class, ids);
		}

		@Override
		public EtVehicleModel saveOrder(EtVehicleModel EtVehicleModel) {
			return this.myBatisDao.save(EtVehicleModel);
		}

		@Override
		public List<String> getAvailableVehicle(Map<String, Object> conditions) {
			List<Map<String, Object>> list = this.myBatisDao.queryByCondition("EtVehicleByScheduleQuery", conditions, null, null, null);
			Set<String> set = new HashSet<String>();
			if (EmptyUtils.isEmpty(list)) {
				return null;
			}
			for (Map<String, Object> map : list) {
				EtVehicleByScheduleQueryItem item = (EtVehicleByScheduleQueryItem) BlukInsertUtils.parseMapToObject(map, new EtVehicleByScheduleQueryItem());
				set.add(item.getEtspTractorEtveCard());
	        }
			List<String> cards = new ArrayList<String>(set);
			return cards;
		}


		
		
	}