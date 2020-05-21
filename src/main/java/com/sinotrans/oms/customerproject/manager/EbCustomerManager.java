package com.sinotrans.oms.customerproject.manager;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.customerproject.model.EbCustomerContactModel;
import com.sinotrans.oms.customerproject.model.EbCustomerModel;

/**
 * <p>Title: 项目执行计划作业步骤表</p>
 * <p>Description: 
 *    
 * </p>
 *<pre>
 * 修改记录:
 * 修改后版本            修改人       	 	修改日期   	      修改内容
 * 2018073101  Shoven Jiang 2018073101 	创建
 * 
 * 
 * </pre>
 */
public interface EbCustomerManager extends MybatisManager {

	EbCustomerModel get(Long id);

	List<EbCustomerModel> findByCondition(List<FilterCondition> conditions);

	EbCustomerModel save(EbCustomerModel model);

	List<EbCustomerModel> saveAll(List<EbCustomerModel> models);

	void delete(EbCustomerModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
	
	/**
	 * @deprecated:根据ebcuId查询分供方
	 * @author Colley.Bai  
	 * @date 2018年11月18日
	 * @param id
	 * @return
	 */
	List<EbCustomerContactModel> getEbCustomerContactByEbcuId(Long id);

	
}
