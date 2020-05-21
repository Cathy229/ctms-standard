package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoEoom2EoocModel;

/**  
* Title: EoEoom2EoocManager  
* Description:  
* @author Shoven.Jiang  
* @date 2018年11月13日  
* @version 1.0  
*/
public interface EoEoom2EoocManager  extends MybatisManager {

	EoEoom2EoocModel get(Long id);

	List<EoEoom2EoocModel> findByCondition(List<FilterCondition> conditions);

	EoEoom2EoocModel save(EoEoom2EoocModel model);

	List<EoEoom2EoocModel> saveAll(List<EoEoom2EoocModel> models);

	void delete(EoEoom2EoocModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
