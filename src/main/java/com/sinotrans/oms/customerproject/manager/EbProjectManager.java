package com.sinotrans.oms.customerproject.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.customerproject.model.EbProjectModel;

/**
 * <p>Title: 项目表</p>
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
public interface EbProjectManager extends MybatisManager {

	EbProjectModel get(Long id);

	List<EbProjectModel> findByCondition(List<FilterCondition> conditions);

	EbProjectModel save(EbProjectModel model);

	List<EbProjectModel> saveAll(List<EbProjectModel> models);

	void delete(EbProjectModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
	
	public List getCurrentProject();
}
