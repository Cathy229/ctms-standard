package com.sinotrans.oms.eoorder.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
/**
 * <p>Title: 订单代理拓展表</p>
 * <p>Description: 
 *    
 * </p>
 *<pre>
 * 修改记录:
 * 修改后版本            修改人       	 	修改日期   	      修改内容
 * 2018073101  Shoven Jiang 2018073101 	创建
 * 
 * 
 * </pre>
 */
public interface EoOrderExpandAgencyManager extends MybatisManager{

	EoOrderExpandAgencyModel get(Long id);

	List<EoOrderExpandAgencyModel> findByCondition(List<FilterCondition> conditions);

	EoOrderExpandAgencyModel save(EoOrderExpandAgencyModel model);

	List<EoOrderExpandAgencyModel> saveAll(List<EoOrderExpandAgencyModel> models);

	void delete(EoOrderExpandAgencyModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
