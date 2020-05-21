package com.sinotrans.oms.system.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.system.model.EsDepartmentModel;

public interface EsDepartmentManager extends MybatisManager{

	EsDepartmentModel get(Long id);

	List<EsDepartmentModel> findByCondition(List<FilterCondition> conditions);

	EsDepartmentModel save(EsDepartmentModel model);

	List<EsDepartmentModel> saveAll(List<EsDepartmentModel> models);

	void delete(EsDepartmentModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
