package com.sinotrans.oms.fees.manager;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;

public interface EfBusinessFeesManager extends MybatisManager{

	EfBusinessFeesModel get(Long id);

	List<EfBusinessFeesModel> findByCondition(List<FilterCondition> conditions);

	EfBusinessFeesModel save(EfBusinessFeesModel model);

	List<EfBusinessFeesModel> saveAll(List<EfBusinessFeesModel> models);

	void delete(EfBusinessFeesModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);

	List<Map<String, Object>> queryByCondition(String string, Map<String, Object> condition);

	EoOrderDto getOrderFeeByEoorId(Long eoorId);
}
