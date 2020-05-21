package com.sinotrans.oms.contract.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.contract.model.ElProtocolModel;

public interface ElProtocolManager {

	ElProtocolModel get(Long id);

	List<ElProtocolModel> findByCondition(List<FilterCondition> conditions);

	ElProtocolModel save(ElProtocolModel model);

	List<ElProtocolModel> saveAll(List<ElProtocolModel> models);

	void delete(ElProtocolModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);

	/**
	 * @deprecated:通过固定的查询条件来获取协议信息的查询结果
	 * @author Colley.Bai  
	 * @date 2018年11月21日
	 * @param queryInfo
	 * @return
	 */
	QueryData queryProtocolByCondition(QueryInfo queryInfo);

}
