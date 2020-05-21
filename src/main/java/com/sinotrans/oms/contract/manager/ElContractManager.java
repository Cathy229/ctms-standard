package com.sinotrans.oms.contract.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.contract.model.ElContractModel;

public interface ElContractManager {

	ElContractModel get(Long id);

	List<ElContractModel> findByCondition(List<FilterCondition> conditions);

	ElContractModel save(ElContractModel model);

	List<ElContractModel> saveAll(List<ElContractModel> models);

	void delete(ElContractModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);

	/**
	 * @deprecated:通过固定的查询条件来获取合同信息的查询结果
	 * @author Colley.Bai  
	 * @date 2018年11月20日
	 * @param queryInfo
	 * @return
	 */
	QueryData queryContractByCondition(QueryInfo queryInfo);

}
