package com.sinotrans.oms.eoor.manager;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.eoor.model.EtTaskModel;

public interface EttaManager extends MybatisManager{
		
		EtTaskModel get(Integer id);

		List<EtTaskModel> findByCondition(List<FilterCondition> conditions);

		EtTaskModel save(EtTaskModel model);

		List<EtTaskModel> saveAll(List<EtTaskModel> models);

		void delete(EtTaskModel model);

		void batchDelete(List<FilterCondition> conditions);

		void deleteByPk(Integer id);

		void deleteByPks(Collection<Integer> ids);

		EtTaskModel saveOrder(EtTaskModel EtTaskModel) ;

		String etCityName(Map<String, Object> conditions);

		String checkEoorInfo(Integer[] ettaIds);
			

}
