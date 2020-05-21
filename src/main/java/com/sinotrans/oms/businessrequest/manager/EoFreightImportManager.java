package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.model.EoFreightImportModel;

public interface EoFreightImportManager {

	EoFreightImportModel get(Long id);

	List<EoFreightImportModel> findByCondition(List<FilterCondition> conditions);

	EoFreightImportModel save(EoFreightImportModel model);

	List<EoFreightImportModel> saveAll(List<EoFreightImportModel> models);

	void delete(EoFreightImportModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);

	/**
	 * @deprecated:查询查验列表
	 * @author Colley.Bai  
	 * @date 2019年2月28日
	 * @param queryInfo
	 * @return
	 */
	QueryData queryFreightImportByCondition(QueryInfo queryInfo);

	/**
	 * @deprecated:站内跟踪列表
	 * @author Colley.Bai  
	 * @date 2019年3月7日
	 * @param queryInfo
	 * @return
	 */
	QueryData queryFreightImportTrackByCondition(QueryInfo queryInfo);
}
