package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoRequestSeaborneModel;

/**
* @author 作者 E-mail:
* @version 创建时间：2018年8月29日 上午11:16:53
* 类说明
*/
public interface EoRequestSeaborneManager extends MybatisManager{

	EoRequestSeaborneModel get(Long id);

	List<EoRequestSeaborneModel> findByCondition(List<FilterCondition> conditions);

	EoRequestSeaborneModel save(EoRequestSeaborneModel model);

	List<EoRequestSeaborneModel> saveAll(List<EoRequestSeaborneModel> models);

	void delete(EoRequestSeaborneModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
