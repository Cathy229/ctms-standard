package com.sinotrans.oms.eoor.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.eoor.model.EiShiporderUnitsModel;

public interface EiShiporderUnitsManager extends MybatisManager{

	EiShiporderUnitsModel get(Integer integer);

	List<EiShiporderUnitsModel> findByCondition(List<FilterCondition> conditions);

	EiShiporderUnitsModel save(EiShiporderUnitsModel model);

	List<EiShiporderUnitsModel> saveAll(List<EiShiporderUnitsModel> models);

	void delete(EiShiporderUnitsModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Integer id);

	void deleteByPks(Collection<Integer> ids);

	EiShiporderUnitsModel saveOrder(EiShiporderUnitsModel eoOrdrModel) ;
}
