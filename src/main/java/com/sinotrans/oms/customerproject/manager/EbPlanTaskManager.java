package com.sinotrans.oms.customerproject.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.customerproject.model.EbPlanTaskModel;

/**
 * <p>Title: 项目执行计划作业步骤表</p>
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
public interface EbPlanTaskManager extends MybatisManager {

	EbPlanTaskModel get(Long id);

	List<EbPlanTaskModel> findByCondition(List<FilterCondition> conditions);

	EbPlanTaskModel save(EbPlanTaskModel model);

	List<EbPlanTaskModel> saveAll(List<EbPlanTaskModel> models);

	void delete(EbPlanTaskModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
