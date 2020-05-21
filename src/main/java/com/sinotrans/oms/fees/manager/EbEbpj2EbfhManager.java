package com.sinotrans.oms.fees.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.fees.model.EbEbpj2EbfhModel;

public interface EbEbpj2EbfhManager extends MybatisManager{

	EbEbpj2EbfhModel get(Long id);

	List<EbEbpj2EbfhModel> findByCondition(List<FilterCondition> conditions);

	EbEbpj2EbfhModel save(EbEbpj2EbfhModel model);

	List<EbEbpj2EbfhModel> saveAll(List<EbEbpj2EbfhModel> models);

	void delete(EbEbpj2EbfhModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
