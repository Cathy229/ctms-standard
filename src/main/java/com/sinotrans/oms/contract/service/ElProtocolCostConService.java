package com.sinotrans.oms.contract.service;

import java.util.List;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.contract.model.ElProtocolCostConModel;

public interface ElProtocolCostConService {

	/**
	 * @deprecated:批量保存协议条件分类
	 * @author Colley.Bai  
	 * @date 2018年11月21日
	 * @param elProtocolCostConModelList
	 * @return
	 */
	public ResponseData<List<ElProtocolCostConModel>> batchSaveProtocolCostCon(
			List<ElProtocolCostConModel> elProtocolCostConModelList);

	/**
	 * @deprecated:批量删除协议条件分类
	 * @author Colley.Bai  
	 * @date 2018年11月22日
	 * @param epccIds
	 * @return
	 */
	public ResponseData<List<ElProtocolCostConModel>> batchDelteProtocolCostCon(List<Long> epccIds);

	/**
	 * @deprecated:根据协议明细获取协议条件分类
	 * @author Colley.Bai  
	 * @date 2018年11月22日
	 * @param epctId
	 * @return
	 */
	public ResponseData<List<ElProtocolCostConModel>> getElProtocolCostConByEpctId(Long epctId);

	/**
	 * @deprecated:船公司配置
	 * @author Colley.Bai  
	 * @date 2019年5月6日
	 * @param queryInfo
	 * @return
	 */
	public ResponseData<QueryData> queryProtocolCostConByCondition(QueryInfo queryInfo);
}
