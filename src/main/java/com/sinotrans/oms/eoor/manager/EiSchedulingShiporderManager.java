package com.sinotrans.oms.eoor.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.eoor.model.EiSchedulingShiporderModel;

public interface EiSchedulingShiporderManager extends MybatisManager{

	EiSchedulingShiporderModel get(Integer integer);

	List<EiSchedulingShiporderModel> findByCondition(List<FilterCondition> conditions);

	EiSchedulingShiporderModel save(EiSchedulingShiporderModel model);

	List<EiSchedulingShiporderModel> saveAll(List<EiSchedulingShiporderModel> models);

	void delete(EiSchedulingShiporderModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Integer id);

	void deleteByPks(Collection<Integer> ids);

	EiSchedulingShiporderModel saveOrder(EiSchedulingShiporderModel models) ;
		

}
