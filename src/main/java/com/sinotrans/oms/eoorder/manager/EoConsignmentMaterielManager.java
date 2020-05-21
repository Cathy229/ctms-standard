package com.sinotrans.oms.eoorder.manager;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.eoorder.model.EoConsignmentMaterielModel;
import com.sinotrans.oms.eoorder.model.EoConsignmentMaterielModel;

/**
 * <p>Title: 订单委托表</p>
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
public interface EoConsignmentMaterielManager extends MybatisManager{

	EoConsignmentMaterielModel get(Long id);

	List<EoConsignmentMaterielModel> findByCondition(List<FilterCondition> conditions);

	EoConsignmentMaterielModel save(EoConsignmentMaterielModel model);

	List<EoConsignmentMaterielModel> saveAll(List<EoConsignmentMaterielModel> models);

	void delete(EoConsignmentMaterielModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
	
	/**
	 * 根据OMS系统传入的参数进行查询
	 * @param conditions
	 * @return
	 * @author Shoven.Jiang
	 * 2017年12月4日12:24:14
	 */
	public List<EoConsignmentMaterielModel> findEoConsignmentListByCondition(Map<String, Object> conditions);
	
	/**
	 * 根据委托表ID进行查询，订单物料相关信息查询
	 * @param condition
	 * @return
	 * @author Shoven.Jiang
	 * 2017年12月4日12:24:14
	 */
	public List<EoConsignmentMaterielModel> findEoConsignmentMaterielListByCondition(Map<String, Object> condition);
}
