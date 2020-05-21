package com.sinotrans.oms.basicdata.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.basicdata.model.EbBillNoRuleModel;

public interface EbBillNoRuleManager extends MybatisManager{

	EbBillNoRuleModel get(Long id);

	List<EbBillNoRuleModel> findByCondition(List<FilterCondition> conditions);

	EbBillNoRuleModel save(EbBillNoRuleModel model);

	List<EbBillNoRuleModel> saveAll(List<EbBillNoRuleModel> models);

	void delete(EbBillNoRuleModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
