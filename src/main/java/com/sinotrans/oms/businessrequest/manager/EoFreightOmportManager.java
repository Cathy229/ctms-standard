package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoFreightOmportModel;

/**  
* Title: EoFreightOmportManager  
* Description:  
* @author Shoven.Jiang  
* @date 2018年10月30日  
* @version 1.0  
*/
public interface EoFreightOmportManager  extends MybatisManager {

	EoFreightOmportModel get(Long id);

	List<EoFreightOmportModel> findByCondition(List<FilterCondition> conditions);

	EoFreightOmportModel save(EoFreightOmportModel model);

	List<EoFreightOmportModel> saveAll(List<EoFreightOmportModel> models);

	void delete(EoFreightOmportModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
