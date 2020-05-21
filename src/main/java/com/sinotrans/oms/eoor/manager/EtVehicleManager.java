package com.sinotrans.oms.eoor.manager;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.eoor.dto.EtVehicleByScheduleQueryItem;
import com.sinotrans.oms.eoor.model.EtVehicleModel;
import com.sinotrans.oms.eoorder.model.EoConsignmentModel;

public interface EtVehicleManager extends MybatisManager{
		
		EtVehicleModel get(Integer id);

		List<EtVehicleModel> findByCondition(List<FilterCondition> conditions);

		EtVehicleModel save(EtVehicleModel model);

		List<EtVehicleModel> saveAll(List<EtVehicleModel> models);

		void delete(EtVehicleModel model);

		void batchDelete(List<FilterCondition> conditions);

		void deleteByPk(Integer id);

		void deleteByPks(Collection<Integer> ids);

		EtVehicleModel saveOrder(EtVehicleModel EtVehicleModel) ;

		List<String> getAvailableVehicle(Map<String, Object> conditions);
		
	}

