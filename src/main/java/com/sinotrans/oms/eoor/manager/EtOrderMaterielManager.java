package com.sinotrans.oms.eoor.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.eoor.model.EtOrderMaterielModel;

public interface EtOrderMaterielManager extends MybatisManager{

	
	
	EtOrderMaterielModel get(Integer integer);

	List<EtOrderMaterielModel> findByCondition(List<FilterCondition> conditions);

	EtOrderMaterielModel save(EtOrderMaterielModel model);

	List<EtOrderMaterielModel> saveAll(List<EtOrderMaterielModel> models);

	void delete(EtOrderMaterielModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Integer id);

	void deleteByPks(Collection<Integer> ids);

	EtOrderMaterielModel saveOrder(EtOrderMaterielModel etOrdrModel) ;

}
