package com.sinotrans.oms.eoor.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.eoor.model.EtLineNodeModel;

public interface EtLineNodeManager extends MybatisManager{
	
	EtLineNodeModel get(Integer id);

	List<EtLineNodeModel> findByCondition(List<FilterCondition> conditions);

	EtLineNodeModel save(EtLineNodeModel model);

	List<EtLineNodeModel> saveAll(List<EtLineNodeModel> models);

	void delete(EtLineNodeModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Integer id);

	void deleteByPks(Collection<Integer> ids);

	EtLineNodeModel saveOrder(EtLineNodeModel etLineNodeModel) ;
}
