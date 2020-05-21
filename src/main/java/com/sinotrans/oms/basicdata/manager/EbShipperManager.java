package com.sinotrans.oms.basicdata.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.basicdata.model.EbShipperModel;

public interface EbShipperManager extends MybatisManager{

	EbShipperModel get(Long id);

	List<EbShipperModel> findByCondition(List<FilterCondition> conditions);

	EbShipperModel save(EbShipperModel model);

	List<EbShipperModel> saveAll(List<EbShipperModel> models);

	void delete(EbShipperModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
