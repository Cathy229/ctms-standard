package com.sinotrans.oms.common.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.common.model.EbProcedureModel;

/**  
* <p>Title: EbProcedureManager</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月14日  
* @version 1.0  
*/
public interface EbProcedureManager extends MybatisManager {

	EbProcedureModel get(Long id);

	List<EbProcedureModel> findByCondition(List<FilterCondition> conditions);

	EbProcedureModel save(EbProcedureModel model);

	List<EbProcedureModel> saveAll(List<EbProcedureModel> models);

	void delete(EbProcedureModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
