package com.sinotrans.oms.eoor.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.eoor.model.EtVehicleModelModel;

public interface EtVehicleModelManager  extends MybatisManager{


	EtVehicleModelModel get(Integer id);

	List<EtVehicleModelModel> findByCondition(List<FilterCondition> conditions);

	EtVehicleModelModel save(EtVehicleModelModel model);

	List<EtVehicleModelModel> saveAll(List<EtVehicleModelModel> models);

	void delete(EtVehicleModelModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Integer id);

	void deleteByPks(Collection<Integer> ids);

	EtVehicleModelModel saveOrder(EtVehicleModelModel EtVehicleModelModel) ;
}
