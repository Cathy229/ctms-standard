package com.sinotrans.oms.fees.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.fees.model.EbExchangeRateModel;

public interface EbExchangeRateManager extends MybatisManager{

	EbExchangeRateModel get(Long id);

	List<EbExchangeRateModel> findByCondition(List<FilterCondition> conditions);

	EbExchangeRateModel save(EbExchangeRateModel model);

	List<EbExchangeRateModel> saveAll(List<EbExchangeRateModel> models);

	void delete(EbExchangeRateModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
