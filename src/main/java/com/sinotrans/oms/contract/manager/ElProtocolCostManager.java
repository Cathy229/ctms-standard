package com.sinotrans.oms.contract.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.contract.model.ElProtocolCostModel;

public interface ElProtocolCostManager {

	ElProtocolCostModel get(Long id);

	List<ElProtocolCostModel> findByCondition(List<FilterCondition> conditions);

	ElProtocolCostModel save(ElProtocolCostModel model);

	List<ElProtocolCostModel> saveAll(List<ElProtocolCostModel> models);

	void delete(ElProtocolCostModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);

}
