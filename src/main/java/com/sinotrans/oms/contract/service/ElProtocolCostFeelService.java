package com.sinotrans.oms.contract.service;

import java.util.List;

import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;

public interface ElProtocolCostFeelService {

	/**
	 * @deprecated:协议费用计算表
	 * @author Colley.Bai  
	 * @date 2018年11月21日
	 * @param elProtocolCostFeelModelList
	 * @return
	 */
	public ResponseData<List<ElProtocolCostFeelModel>> batchSaveProtocolCostFeel(
			List<ElProtocolCostFeelModel> elProtocolCostFeelModelList);

	/**
	 * @deprecated:批量删除协议费用计算表
	 * @author Colley.Bai  
	 * @date 2018年11月22日
	 * @param epcfIds
	 * @return
	 */
	public ResponseData<List<ElProtocolCostFeelModel>> batchDeleteProtocolCostFeel(List<Long> epcfIds);

	/**
	 * @deprecated:根据协议条件分类获取协议费用计算方式
	 * @author Colley.Bai  
	 * @date 2018年11月22日
	 * @param epccId
	 * @return
	 */
	public ResponseData<List<ElProtocolCostFeelModel>> getElProtocolCostFeelByEpccId(Long epccId);

	/**
	 * @deprecated:根据协议明细获取协议费用计算方式
	 * @author Colley.Bai  
	 * @date 2019年4月30日
	 * @param epctId
	 * @return
	 */
	public ResponseData<List<ElProtocolCostFeelModel>> getElProtocolCostFeelByEpctId(Long epctId);


}
