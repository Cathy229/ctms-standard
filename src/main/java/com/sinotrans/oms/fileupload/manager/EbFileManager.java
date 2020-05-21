package com.sinotrans.oms.fileupload.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.fileupload.model.EbFileModel;

public interface EbFileManager extends MybatisManager{

	EbFileModel get(Long id);

	List<EbFileModel> findByCondition(List<FilterCondition> conditions);

	List<EbFileModel> saveAll(List<EbFileModel> models);

	void delete(EbFileModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);

	EbFileModel save(EbFileModel model);
	
	QueryData getFileByCondition(QueryInfo queryInfo);

	QueryData getFileByElct(QueryInfo queryInfo);
}
