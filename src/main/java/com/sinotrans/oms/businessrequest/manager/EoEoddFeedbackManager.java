package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.businessrequest.model.EoEoddFeedbackModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;

public interface EoEoddFeedbackManager extends MybatisManager{
	
	EoEoddFeedbackModel get(Long id);

	List<EoEoddFeedbackModel> findByCondition(List<FilterCondition> conditions);

	EoEoddFeedbackModel save(EoEoddFeedbackModel model);

	List<EoEoddFeedbackModel> saveAll(List<EoEoddFeedbackModel> models);

	void delete(EoEoddFeedbackModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
