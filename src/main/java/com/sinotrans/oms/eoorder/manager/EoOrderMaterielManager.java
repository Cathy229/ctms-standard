package com.sinotrans.oms.eoorder.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.eoorder.model.EoOrderMaterielModel;

public interface EoOrderMaterielManager extends MybatisManager{

	EoOrderMaterielModel get(Long id);

	List<EoOrderMaterielModel> findByCondition(List<FilterCondition> conditions);

	EoOrderMaterielModel save(EoOrderMaterielModel model);

	List<EoOrderMaterielModel> saveAll(List<EoOrderMaterielModel> models);

	void delete(EoOrderMaterielModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
	
	/**
	 * 通过固定化条件查询订单物料信息
	 * @author Shoven.Jiang  
	 * @date 2018年11月21日
	 * @param queryInfo
	 * @return
	 */
	ResponseData<QueryData> queryOrderMaterialByModel(QueryInfo queryInfo);	
}
