package com.sinotrans.oms.fees.service;

import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.fees.dto.EfBmsImModelDto;

/**  
* <p>Title: EfBusinessFeesContractLogisticSettlementManager</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月11日  
* @version 1.0  
*/
public interface EfBusinessFeesContractLogisticSettlementService {

	/**
	 * 合同物流统计值取值
	 * @author Shoven.Jiang  
	 * @date 2018年9月11日
	 * @param eoorId
	 * @return
	 */
	EfBmsImModelDto getContractLogisticTemplete(Long eoorId, String businessType);
	
	/**
	 * 统计值界面点击确认收集统计值信息上传到bms
	 * @author Shoven.Jiang  
	 * @date 2018年9月13日
	 * @param efBmsImModelDto
	 * @param eoorId
	 * @param businessType
	 * @return
	 */
	ResponseData upLoadBmsByContractLogisticTemplete(EfBmsImModelDto efBmsImModelDto, Long eoorId, String businessType);
	
	/**
	 * 费用上传bms---现结上传
	 * @author Shoven.Jiang  
	 * @date 2018年10月11日
	 * @param efbfIds  费用IDS
	 * @param eoorId   订单id
	 * @return
	 */
	ResponseData upLoadBmsSettmentByContractLogisticTemplete(Long [] efbfIds, Long eoorId, String businessType);

	/**
	 * 根据订单id查询统计值信息，并校验是否符合上传要求
	 * @author Shoven.Jiang  
	 * @date 2018年10月25日
	 * @param eoorIds 订单id数组
	 * @return
	 */
	ResponseData checkEfbmBmsModelByType14(Long [] eoorIds);
}
