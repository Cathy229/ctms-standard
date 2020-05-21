package com.sinotrans.oms.datainteraction.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.datainteraction.model.EdiBookingFeesModel;

/**  
* <p>Title: EdiBookingFeesManager</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月6日  
* @version 1.0  
*/
public interface EdiBookingFeesManager extends MybatisManager{

	EdiBookingFeesModel get(Long id);

	List<EdiBookingFeesModel> findByCondition(List<FilterCondition> conditions);

	List<EdiBookingFeesModel> saveAll(List<EdiBookingFeesModel> models);

	void delete(EdiBookingFeesModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
