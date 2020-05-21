package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoRequestAirborneModel;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年8月29日 上午11:09:48
* 类说明
*/
public interface EoRequestAirborneManager extends MybatisManager{
	
	EoRequestAirborneModel get(Long id);

	List<EoRequestAirborneModel> findByCondition(List<FilterCondition> conditions);

	EoRequestAirborneModel save(EoRequestAirborneModel model);

	List<EoRequestAirborneModel> saveAll(List<EoRequestAirborneModel> models);

	void delete(EoRequestAirborneModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);

}
