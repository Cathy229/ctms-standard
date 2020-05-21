package com.sinotrans.oms.contract.manager;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.contract.model.ElProtocolCostConModel;

public interface ElProtocolCostConManager {

	ElProtocolCostConModel get(Long id);

	List<ElProtocolCostConModel> findByCondition(List<FilterCondition> conditions);

	ElProtocolCostConModel save(ElProtocolCostConModel model);

	List<ElProtocolCostConModel> saveAll(List<ElProtocolCostConModel> models);

	void delete(ElProtocolCostConModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
	
	List<ElProtocolCostConModel> queryByCondition(Map<String, Object> condition);
}
