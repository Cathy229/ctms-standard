package com.sinotrans.oms.contract.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;

public interface ElProtocolCostFeelManager {

	ElProtocolCostFeelModel get(Long id);

	List<ElProtocolCostFeelModel> findByCondition(List<FilterCondition> conditions);

	ElProtocolCostFeelModel save(ElProtocolCostFeelModel model);

	List<ElProtocolCostFeelModel> saveAll(List<ElProtocolCostFeelModel> models);

	void delete(ElProtocolCostFeelModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);

}
