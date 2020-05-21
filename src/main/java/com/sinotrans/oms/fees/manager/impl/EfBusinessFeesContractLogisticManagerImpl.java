package com.sinotrans.oms.fees.manager.impl;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.eoorder.model.EoConsignmentModel;
import com.sinotrans.oms.fees.dto.ContractLogisticTempleteQueryDto;
import com.sinotrans.oms.fees.manager.EfBusinessFeesContractLogisticManager;

/**  
* <p>Title: EfBusinessFeesContractLogisticManagerImpl</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月14日  
* @version 1.0  
*/
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EfBusinessFeesContractLogisticManagerImpl extends MybatisManagerImpl implements EfBusinessFeesContractLogisticManager{

	@Override
	public ContractLogisticTempleteQueryDto getContractLogisticTempleteByEoorId(Map<String, Object> condition) {
		List<Map<String, Object>> queryList = this.myBatisDao.queryByCondition("ContractLogisticTempleteQuery", condition, null, null, null);
		ContractLogisticTempleteQueryDto contractLogisticTempleteQueryDto = new ContractLogisticTempleteQueryDto();
		for (@SuppressWarnings("rawtypes") Map map : queryList) {
			contractLogisticTempleteQueryDto =  BlukInsertUtils.parseMapToObject(map, new ContractLogisticTempleteQueryDto());
		}
		return contractLogisticTempleteQueryDto;
	}
}
