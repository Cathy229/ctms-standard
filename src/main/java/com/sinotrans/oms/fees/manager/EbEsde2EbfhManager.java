package com.sinotrans.oms.fees.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.fees.model.EbEsde2EbfhModel;

public interface EbEsde2EbfhManager extends MybatisManager{

	EbEsde2EbfhModel get(Long id);

	List<EbEsde2EbfhModel> findByCondition(List<FilterCondition> conditions);

	EbEsde2EbfhModel save(EbEsde2EbfhModel model);

	List<EbEsde2EbfhModel> saveAll(List<EbEsde2EbfhModel> models);

	void delete(EbEsde2EbfhModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
