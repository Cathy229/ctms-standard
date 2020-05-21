package com.sinotrans.oms.customerproject.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.customerproject.model.EbProjectKpiModel;

/**
 * <p>Title: 项目执行计划KPI表</p>
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
public interface EbProjectKpiManager extends MybatisManager {

	EbProjectKpiModel get(Long id);

	List<EbProjectKpiModel> findByCondition(List<FilterCondition> conditions);

	EbProjectKpiModel save(EbProjectKpiModel model);

	List<EbProjectKpiModel> saveAll(List<EbProjectKpiModel> models);

	void delete(EbProjectKpiModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
