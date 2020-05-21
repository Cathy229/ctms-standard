package com.sinotrans.oms.fees.service;

import java.util.List;

import com.sinotrans.oms.fees.dto.EfBmsImModelDto;

/**  
* Title: UpLoadAllToBmsThreadService  
* Description:  
* @author Shoven.Jiang  
* @date 2018年10月25日  
* @version 1.0  
*/
public interface UpLoadAllToBmsThreadService {

	/**
	 * 全部结算上传开启异步线程处理事务
	 * @author Shoven.Jiang  
	 * @date 2018年10月25日
	 * @param efBmsImModelDto 收集到的统计值信息，包含订单id
	 */
	void upLoadAllToBms(List<EfBmsImModelDto> efBmsImModelDtos);
}
