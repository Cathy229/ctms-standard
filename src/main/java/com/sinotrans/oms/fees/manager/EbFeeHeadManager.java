package com.sinotrans.oms.fees.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.fees.model.EbFeeHeadModel;

public interface EbFeeHeadManager extends MybatisManager{

	EbFeeHeadModel get(Long id);

	List<EbFeeHeadModel> findByCondition(List<FilterCondition> conditions);

	EbFeeHeadModel save(EbFeeHeadModel model);

	List<EbFeeHeadModel> saveAll(List<EbFeeHeadModel> models);

	void delete(EbFeeHeadModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
