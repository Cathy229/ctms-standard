package com.sinotrans.oms.fees.manager;

import java.util.Map;

import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.fees.dto.ContractLogisticTempleteQueryDto;

/**  
* <p>Title: EfBusinessFeesContractLogisticManager</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月14日  
* @version 1.0  
*/
public interface EfBusinessFeesContractLogisticManager extends MybatisManager{

	/**
	 * 根据订单id查询统计值信息
	 * @author Shoven.Jiang  
	 * @date 2018年9月14日
	 * @param condition
	 * @return
	 */
	ContractLogisticTempleteQueryDto getContractLogisticTempleteByEoorId(Map<String, Object> condition);
}
