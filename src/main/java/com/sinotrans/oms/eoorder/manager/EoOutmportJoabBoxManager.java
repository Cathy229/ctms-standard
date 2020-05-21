package com.sinotrans.oms.eoorder.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoOutmportJoabBoxModel;

/**
 * <p>Title: 出口业务箱操作表</p>
 * <p>Description: 
 *    
 * </p>
 *<pre>
 * 修改记录:
 * 修改后版本            修改人       	 	修改日期   	      修改内容
 * 20181101  Colley.Bai 				2018110101 	       创建
 * 
 * 
 * </pre>
 */
public interface EoOutmportJoabBoxManager extends MybatisManager{

	EoOutmportJoabBoxModel get(Long id);

	List<EoOutmportJoabBoxModel> findByCondition(List<FilterCondition> conditions);

	EoOutmportJoabBoxModel save(EoOutmportJoabBoxModel model);

	List<EoOutmportJoabBoxModel> saveAll(List<EoOutmportJoabBoxModel> models);

	void delete(EoOutmportJoabBoxModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
}
