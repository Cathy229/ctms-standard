package com.sinotrans.oms.eoorder.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoFreightOmportModel;
import com.sinotrans.oms.eoorder.model.EoEoob2EomjModel;

/**  
* Title: EoEoob2EomjManager  
* Description:  
* @author Colley.Bai 
* @date 2018年11月1日21:15:12
* @version 1.0  
*/
public interface EoEoob2EomjManager  extends MybatisManager {

	EoEoob2EomjModel get(Long id);

	List<EoEoob2EomjModel> findByCondition(List<FilterCondition> conditions);

	EoEoob2EomjModel save(EoEoob2EomjModel model);

	List<EoEoob2EomjModel> saveAll(List<EoEoob2EomjModel> models);

	void delete(EoEoob2EomjModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
