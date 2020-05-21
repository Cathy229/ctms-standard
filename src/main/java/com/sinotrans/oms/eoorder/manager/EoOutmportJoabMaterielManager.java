package com.sinotrans.oms.eoorder.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoOutmportJoabMaterielModel;

/**  
* Title: EoEoob2EomjManager  
* Description:  
* @author Colley.Bai 
* @date 2018年11月1日21:15:12
* @version 1.0  
*/
public interface EoOutmportJoabMaterielManager  extends MybatisManager {

	EoOutmportJoabMaterielModel get(Long id);

	List<EoOutmportJoabMaterielModel> findByCondition(List<FilterCondition> conditions);

	EoOutmportJoabMaterielModel save(EoOutmportJoabMaterielModel model);

	List<EoOutmportJoabMaterielModel> saveAll(List<EoOutmportJoabMaterielModel> models);

	void delete(EoOutmportJoabMaterielModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
