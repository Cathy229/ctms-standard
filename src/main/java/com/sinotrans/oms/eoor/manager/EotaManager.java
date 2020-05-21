package com.sinotrans.oms.eoor.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.eoor.model.EoTaskModel;

public interface EotaManager extends MybatisManager{
	
	EoTaskModel get(Integer id);

	List<EoTaskModel> findByCondition(List<FilterCondition> conditions);

	EoTaskModel save(EoTaskModel model);

	List<EoTaskModel> saveAll(List<EoTaskModel> models);

	void delete(EoTaskModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Integer id);

	void deleteByPks(Collection<Integer> ids);

	EoTaskModel saveOrder(EoTaskModel eoTaskModel) ;

	QueryData queryEoLandOrderTrackQuery(QueryInfo queryInfo);
	/**
	 * @deprecated:批量查询 IN条件 重新构造系统订单号参数信息
	 * @author Jaye.Zheng  
	 * @date 2019年10月22日
	 * @param queryInfo
	 * @return
	 */
	QueryInfo getEotaSoNo(QueryInfo queryInfo);
		
}
