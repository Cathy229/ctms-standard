package com.sinotrans.oms.system.manager;

import java.util.Collection;
import java.util.List;
import java.util.Queue;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.system.model.EsCounterModel;

/**
 * <p>
 * Title: 序列表：动态有规则生成字符串
 * </p>
 * <p>
 * Description:
 * 
 * 主要应用于系统中编号的生成
 * 
 * </p>
 * 
 * @author
 * @version 1.00
 * 
 * <pre>
 * 修改记录:
 * 修改后版本     修改人   	修改日期   	修改内容
 * 20180805.1 Shoven 20180805 	创建
 * 
 * </pre>
 */
public interface EsCounterManager extends MybatisManager{

	EsCounterModel get(Long id);

	List<EsCounterModel> findByCondition(List<FilterCondition> conditions);

	EsCounterModel save(EsCounterModel model);

	List<EsCounterModel> saveAll(List<EsCounterModel> models);

	void delete(EsCounterModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
	
	/**
	 * 生成行车单号 ， 行车单号规则 TCB + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationTCBNo(Integer num);
	public Queue<String> generationTCBNo2(Integer num,Long escoId);

	/**
	 * 生成行车单号 ， 行车单号规则 TCB + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationTCBNo();
	
	public String generationTCBNo2(Long escoId);
	
	/**
	 * 生成系统订单号 ，系统订单号规则 ORD + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationORDrNo();
	
	/**
	 * 生成系统订单号 ，系统订单号规则 ORD + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationORDNo(Integer num);
	/**
	 * 生成陆运任务编号 ，陆运任务编号规则 ODT + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationODTNo();
	/**
	 * 生成陆运任务编号 ，陆运任务编号规则 ODT + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationODTNo(Integer num);
	/**
	 * 生成海运任务编号 ，海运任务编号规则 ONT + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationONTNo();
	/**
	 * 生成海运任务编号 ，海运任务编号规则 ONT + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationONTNo(Integer num);
	/**
	 * 生成入库任务编号 ，入库任务编号规则 INB + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationINBNo();
	/**
	 * 生成入库任务编号 ，入库任务编号规则 INB + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationINBNo(Integer num);
	/**
	 * 生成出库任务编号 ，出库任务编号规则 OTB + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationOTBNo();
	/**
	 * 生成出库任务编号 ，出库任务编号规则 OTB + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationOTBNo(Integer num);
	/**
	 * 生成报关任务编号 ，报关任务编号规则 CUS + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationCUSNo();
	/**
	 * 生成报关任务编号 ，报关任务编号规则 CUS + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationCUSNo(Integer num);
	/**
	 * 生成铁路任务编号 ，铁路任务编号规则 RLW + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationRLWNo();
	/**
	 * 生成铁路任务编号 ，铁路任务编号规则 RLW + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationRLWNo(Integer num);
	/**
	 * 生成空运任务编号 ，空运任务编号规则 AIR + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationAIRNo();
	/**
	 * 生成空运任务编号 ，空运任务编号规则 AIR + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationAIRNo(Integer num);
	/**
	 * 生成进口拖车任务编号 ，进口拖车任务编号规则 IMT + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationIMTNo();
	/**
	 * 生成进口拖车任务编号 ，进口拖车任务编号规则 IMT + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationIMTNo(Integer num);
	/**
	 * 生成出口拖车任务编号 ，出口拖车任务编号规则 INB + 四位年月 + 公司编号 + 流水号
	 * 默认只生成一个序列号
	 * @return
	 */
	public String generationEXTNo();
	/**
	 * 生成出口拖车任务编号 ，出口拖车任务编号规则 INB + 四位年月 + 公司编号 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> generationEXTNo(Integer num);
	/**
	 * 生成外运号 ，系统订单号规则  + 四位年月 + 流水号
	 * 
	 * @param num
	 * @return
	 */
	public Queue<String> getSinotransNo(Integer num);
}
