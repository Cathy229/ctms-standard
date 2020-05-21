package com.sinotrans.oms.contract.service;


import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.contract.dto.ElProtocolDto;
import com.sinotrans.oms.contract.dto.ElProtocolModelDto;
import com.sinotrans.oms.contract.model.ElProtocolModel;

public interface ElProtocolService {

	/**
	 * @deprecated:通过固定的查询条件来获取协议信息的查询结果
	 * @author Colley.Bai  
	 * @date 2018年11月21日
	 * @param queryInfo
	 * @return
	 */
	public ResponseData<QueryData> queryProtocolByCondition(QueryInfo queryInfo);

	/**
	 * @deprecated:保存协议基本信息
	 * @author Colley.Bai  
	 * @date 2018年11月21日
	 * @param elProtocolModelDto
	 * @return
	 */
	public ResponseData<ElProtocolModel> saveProtocol(ElProtocolModelDto elProtocolModelDto);

	/**
	 * @deprecated:合同+接单设置（按照合同主键）
	 * @author Colley.Bai  
	 * @date 2018年11月21日
	 * @param elplId
	 * @return
	 */
	public ResponseData<ElProtocolDto> getProtocolAndProtocolCostById(Long elplId);

}
