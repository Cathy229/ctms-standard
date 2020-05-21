package com.sinotrans.oms.eoorder.manager;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.eoorder.model.EoConsignmentMaterielModel;
import com.sinotrans.oms.eoorder.model.EoConsignmentModel;

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
public interface EoConsignmentManager extends MybatisManager{

	EoConsignmentModel get(Long id);

	List<EoConsignmentModel> findByCondition(List<FilterCondition> conditions);

	EoConsignmentModel save(EoConsignmentModel model);

	List<EoConsignmentModel> saveAll(List<EoConsignmentModel> models);

	void delete(EoConsignmentModel model);

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
	public List<EoConsignmentModel> findEoConsignmentListByCondition(Map<String, Object> conditions);
	
	/**
	 * 根据委托表ID进行查询，订单物料相关信息查询
	 * @param condition
	 * @return
	 * @author Shoven.Jiang
	 * 2017年12月4日12:24:14
	 */
	public List<EoConsignmentMaterielModel> findEoConsignmentMaterielListByCondition(Map<String, Object> condition);
	/**
	 * 通过固定的查询条件来获取委托订单的查询结果
	 * @description
	 * @author Simon.Guo  
	 * @date 2018年10月26日下午3:48:03
	 * @param queryInfo
	 * @return
	 */
	QueryData queryConsignmentByCondition(QueryInfo queryInfo);
}
