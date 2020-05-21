package com.sinotrans.oms.datainteraction.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.datainteraction.model.EaiOutExceptionModel;

/**  
  * <p>Title: EaiOutExceptionManager</p>  
  * <p>Description: 报文异常</p>  
  * @author Colley.Bai 
  * @date 2018年11月15日  
  * @version 1.0  
  */
public interface EaiOutExceptionManager {

	EaiOutExceptionModel get(Long id);

	List<EaiOutExceptionModel> findByCondition(List<FilterCondition> conditions);
	
	EaiOutExceptionModel save(EaiOutExceptionModel model);

	List<EaiOutExceptionModel> saveAll(List<EaiOutExceptionModel> models);

	void delete(EaiOutExceptionModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
