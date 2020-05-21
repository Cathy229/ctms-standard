package com.sinotrans.oms.datainteraction.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.datainteraction.model.EaiMessageFileModel;

/**  
 * <p>Title: EaiMessageFileManager</p>  
 * <p>Description: 报文正常</p>  
 * @author Colley.Bai 
 * @date 2018年11月15日  
 * @version 1.0  
 */
public interface EaiMessageFileManager {

	EaiMessageFileModel get(Long id);

	List<EaiMessageFileModel> findByCondition(List<FilterCondition> conditions);

	List<EaiMessageFileModel> saveAll(List<EaiMessageFileModel> models);
	
	EaiMessageFileModel save(EaiMessageFileModel model);

	void delete(EaiMessageFileModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
	
}
