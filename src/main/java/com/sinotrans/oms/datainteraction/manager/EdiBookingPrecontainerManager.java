package com.sinotrans.oms.datainteraction.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.datainteraction.model.EdiBookingPrecontainerModel;

/**  
* <p>Title: EdiBookingPrecontainerManager</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月6日  
* @version 1.0  
*/
public interface EdiBookingPrecontainerManager extends MybatisManager{

	EdiBookingPrecontainerModel get(Long id);

	List<EdiBookingPrecontainerModel> findByCondition(List<FilterCondition> conditions);

	List<EdiBookingPrecontainerModel> saveAll(List<EdiBookingPrecontainerModel> models);

	void delete(EdiBookingPrecontainerModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
