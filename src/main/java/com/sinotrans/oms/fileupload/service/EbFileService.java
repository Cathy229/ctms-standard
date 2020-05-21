package com.sinotrans.oms.fileupload.service;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.fileupload.model.EbFileModel;

public interface EbFileService {
	
	ResponseData<EbFileModel> get(Long id);

	List<EbFileModel> findByCondition(List<FilterCondition> conditions);

	List<EbFileModel> saveAll(List<EbFileModel> models);

	ResponseData<EbFileModel> save(EbFileModel model);
	
	void delete(EbFileModel model);
	
	void batchDelete(List<FilterCondition> conditions);
	
	ResponseData<EbFileModel> deleteByPk(Long id);
	
	void deleteByPks(Collection<Long> ids);
	
	ResponseData<QueryData> getFileByCondition(QueryInfo queryInfo);

	ResponseData<QueryData> getFileByElct(QueryInfo queryInfo);

	/**
	 * @deprecated:批量保存附件信息
	 * @author Colley.Bai  
	 * @date 2019年3月19日
	 * @param ebFileModelList
	 * @return
	 */
	ResponseData<List<EbFileModel>> batchSaveFile(List<EbFileModel> ebFileModelList);

	/**
	 * @deprecated:查询附件（订单+报关+订舱+拖车）
	 * @author Colley.Bai  
	 * @date 2019年3月22日
	 * @param ebFileModel
	 * @return
	 */
	ResponseData<List<EbFileModel>> getEbflFile(EbFileModel ebFileModel);
}
