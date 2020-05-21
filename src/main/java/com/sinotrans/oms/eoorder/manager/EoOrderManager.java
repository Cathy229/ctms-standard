package com.sinotrans.oms.eoorder.manager;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.eoorder.dto.EoFreightOmportStatusQueryItem;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.eoorder.dto.EoOrderIssuedStatusDto;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.security.util.UserDetails;
/**
 * <p>Title: 订单表</p>
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
public interface EoOrderManager  extends MybatisManager{
	
	EoOrderModel get(Long id);

	List<EoOrderModel> findByCondition(List<FilterCondition> conditions);

	EoOrderModel save(EoOrderModel model);

	List<EoOrderModel> saveAll(List<EoOrderModel> models);

	void delete(EoOrderModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);

	EoOrderModel saveOrder(EoOrderModel eoOrdrModel) ;
		
	EoOrderExpandAgencyModel saveEoOrderExpandAgencyModel(EoOrderExpandAgencyModel formModel);
	
	/**
	 * 保存订单Dto
	 * add by shoven 2018年8月4日23:26:37
	 * @param eoOrderDto
	 * @return EoOrderDto
	 */
	ResponseData<EoOrderDto> saveOrderDto(EoOrderDto eoOrderDto);
	
	/**
	 * 批量保存订单Dto
	 * add by shoven 2018年8月4日23:26:37
	 * @param eoOrderDtos
	 * @return 
	 */
	ResponseData<Map<Boolean, List<EoOrderDto>>> batchSaveOrder(List<EoOrderDto> eoOrderDtos);
	
	/**
	 * 通过固定的查询条件来获取订单的查询结果
	 * @param conditionMap
	 * add by shoven 2018年8月8日14:33:21
	 * @return
	 */
	QueryData queryOrderByCondition(QueryInfo queryInfo);
	/**
	 * 通过固定的查询条件来获取订单的查询结果
	 * @param conditionMap
	 * add by shoven 2018年8月8日14:33:21
	 * @return
	 */
	QueryData queryOrderFeeByCondition(QueryInfo queryInfo);

	EoOrderDto getOrderById(Long eoorId);
	
	/**
	 * 订单执行生成任务
	 * @author Shoven.Jiang  
	 * @date 2018年8月28日
	 * @param eoorId
	 * @return
	 */
	ResponseData<EoOrderDto> acceptOrder(Long eoorId);
	/**
	 * 
	 * @DATE 2018年9月5日 上午11:39:24
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据查询语句查询
	 * @param condition
	 * @return
	 */
	List<EoFreightOmportStatusQueryItem> queryByCondition(Map<String, Object> condition);

	EoOrderIssuedStatusDto getEoorIssuedStatus(Map<String, Object> condition) throws Exception;

	/**
	 * @deprecated:根据集装箱id查询装箱物料信息
	 * @author Colley.Bai  
	 * @date 2018年11月3日
	 * @param eoocId
	 * @return
	 */
	QueryData getEoOrderMaterielAndEomjByEoocId(Long eoocId);
	
	/**
	 * 校验系统订单号在该公司下是否存在
	 * @author Shoven.Jiang  
	 * @date 2018年12月1日
	 * @param eoorOrderNo
	 * @param escoId
	 * @return
	 */
	Boolean checkEoOrderByEoOrderNo(String eoorOrderNo, String escoId);

	/**
	 * 校验外运号在系统中是否存在
	 * @author Shoven.Jiang  
	 * @date 2018年12月1日
	 * @param eoorSinoNo
	 * @return
	 */
	Boolean chackEoOrderByEoSino(String eoorSinoNo);
	
	Map<String, Object> getBmsEbsmCode();

	/**
	 * 海运货代订单基本信息以及订单相关信息保存
	 * @author Shoven.Jiang  
	 * @date 2019年2月22日
	 * @param eoOrderDto
	 * @return
	 */
	ResponseData<EoOrderDto> saveOrderByTypeI(EoOrderDto eoOrderDto);

	/**
	 * @deprecated:根据集装箱id查询装箱物料信息(进口)
	 * @author Colley.Bai  
	 * @date 2019年2月28日
	 * @param eoocId
	 * @return
	 */
	QueryData getEoImportOrderMaterielAndEoeiByEoocId(Long eoocId);

	ResponseData<EoOrderDto> createEoorAndEoeaModel(EoOrderDto eoOrderDto, UserDetails userDetails, EoOrderDto afterSaveEoOrderDto);

	/**
	 * @deprecated;查询全部费用
	 * @author Colley.Bai  
	 * @date 2019年4月11日
	 * @param queryInfo
	 * @return
	 */
	ResponseData<QueryData> queryOrderAllFeeByCondition(QueryInfo queryInfo); 
}
