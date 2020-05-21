package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoEorn2EonmModel;

public interface EoEorn2EonmManager extends MybatisManager{
	
	EoEorn2EonmModel get(Long id);

	List<EoEorn2EonmModel> findByCondition(List<FilterCondition> conditions);

	EoEorn2EonmModel save(EoEorn2EonmModel model);

	List<EoEorn2EonmModel> saveAll(List<EoEorn2EonmModel> models);

	void delete(EoEorn2EonmModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
