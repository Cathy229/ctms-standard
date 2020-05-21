package com.sinotrans.oms.datainteraction.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.datainteraction.model.EdiBookingMaterialModel;

/**  
* <p>Title: EdiBookingMaterialManager</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月6日  
* @version 1.0  
*/
public interface EdiBookingMaterialManager extends MybatisManager{

	EdiBookingMaterialModel get(Long id);

	List<EdiBookingMaterialModel> findByCondition(List<FilterCondition> conditions);

	List<EdiBookingMaterialModel> saveAll(List<EdiBookingMaterialModel> models);

	void delete(EdiBookingMaterialModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
