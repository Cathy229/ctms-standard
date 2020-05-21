package com.sinotrans.oms.datainteraction.manager;
import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoEorb2EosrModel;
import com.sinotrans.oms.datainteraction.model.EdiBookingModel;

/**  
* <p>Title: EdiBookingManager</p>  
* <p>Description: </p>  
* @author Shoven.Jiang  
* @date 2018年9月4日  
* @version 1.0  
*/
public interface EdiBookingManager extends MybatisManager{

	EdiBookingModel get(Long id);

	List<EdiBookingModel> findByCondition(List<FilterCondition> conditions);

	List<EdiBookingModel> saveAll(List<EdiBookingModel> models);

	void delete(EdiBookingModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
	
	EdiBookingModel save(EdiBookingModel model);
}
