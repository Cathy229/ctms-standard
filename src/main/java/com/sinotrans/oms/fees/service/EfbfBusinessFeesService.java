package com.sinotrans.oms.fees.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;
import com.sinotrans.oms.fees.dto.EfBusinessFeesForCalcuteDto;
import com.sinotrans.oms.fees.model.EbFeeHeadModel;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;

public interface EfbfBusinessFeesService {
	/**
	 * 批量保存应付应收费用
	 * @date 2018年8月8日 下午10:31:06  
	 * @author simon 
	 * Description:批量保存应付应收费用
	 * @param efBusinessFeesModelList
	 * @return 
	 */
	ResponseData<List<EfBusinessFeesModel>> batchSaveBusinessFees(List<EfBusinessFeesModel> efBusinessFeesModelList);
	/**
	 * 单行费用删除
	 * @param efbfId
	 * @return
	 */
	ResponseData<List<EfBusinessFeesModel>> deleteBusinessFees(Long efbfId);
	/**
	 * 批量删除费用
	 * @param eoorId
	 * @return
	 */
	ResponseData batchDeteleBusinessFees(Collection<Long> efbfIds);
	/**
	 * 根据订单主键查询订单下的费用
	 * @param eoorId
	 * @return
	 */
	ResponseData getBusinessFeesById(Long eoorId);
	/**
	 * 根据查询条件查询费用信息
	 * @param condition
	 * @return
	 */
	ResponseData<List<EfBusinessFeesModel>> queryBusinessFeesByCondition(Map<String, Object> condition);
	/**
	 * 单行费用确认
	 * @param efbfId
	 * @return
	 */
	ResponseData<EfBusinessFeesModel> confirmBusinessFees(Long efbfId);
	/**
	 * 批量费用确认
	 * @param efbfIds
	 * @return
	 */
	ResponseData batchConfirmBusinessFees(Long[] efbfIds);
	/**
	 * 取消确认
	 * @param efbfId
	 * @return
	 */
	ResponseData<EfBusinessFeesModel> cancelConfirmBusinessFees(Long efbfId);
	/**
	 * 批量取消确认
	 * @param efbfIds
	 * @return
	 */
	ResponseData batchCancelConfirmBusinessFees(Long [] efbfIds);

	/**
	 * 订单费用现结上传
	 * @param efbfIds
	 * @return
	 */
	ResponseData uploadCashSettlement(Long [] efbfIds);
	/**
	 * 
	 * @date 2018年8月22日 下午5:11:08  
	 * @author simon 
	 * @description:--校验订单费用是否开票
	 * @param eoorId
	 * @param eoorIds
	 * @return
	 */
	ResponseData checkFeesInvoice(Long eoorId, List<Long> eoorIds);
	/**
	 * 
	 * @date 2018年8月22日 下午5:11:08  
	 * @author simon 
	 * @description:--费用变更保存
	 * @param efBusinessFeesModelList
	 * @return
	 */
	ResponseData<List<EfBusinessFeesModel>> changeEfbfBusinessFees(List<EfBusinessFeesModel> efBusinessFeesModelList);
	/**
	 * 
	 * @date 2018年8月22日 下午5:11:08  
	 * @author simon 
	 * @description:--根据主键id查询费目信息
	 * @param ebfhId
	 * @return
	 */
	ResponseData<EbFeeHeadModel> getFeeHeadById(Long ebfhId);
	/**
	 * 
	 * @date 2018年9月15日14:09:20  
	 * @author simon 
	 * @description:--通过固定的查询条件来获取费用的查询结果
	 * @param queryInfo
	 * @return
	 */
	ResponseData<QueryData> queryOrderByCondition(QueryInfo queryInfo);
	
	/**
	 * 费用批量取消确认状态
	 * @author Shoven.Jiang  
	 * @date 2018年9月29日
	 * @param efbfIds
	 * @return
	 */
	ResponseData<List<EfBusinessFeesModel>> batchCancelConfirmBusinessFees(Collection<Long> efbfIds);
	
	/**
	 * 费用批量确认
	 * @author Shoven.Jiang  
	 * @date 2018年9月29日
	 * @param efbfIds
	 * @return
	 */
	ResponseData<List<EfBusinessFeesModel>> batchConfirmBusinessFees(Collection<Long> efbfIds);
	
	/**
	 * 根据订单id以及费用类型来查询该订单下的费用
	 * @author Shoven.Jiang  
	 * @date 2018年10月9日
	 * @param eoorId  订单id
	 * @param type :R  应收  P：应付   RP：代收代付   N：忽略费用类型的，查询出该订单下所有的费用
	 * @return
	 */
	ResponseData<List<EfBusinessFeesModel>> getBusinessFeesByEoorId(Long eoorId, String efbfType);
	
	/**
	 * 根据费用主键集合以及费用类型提交结算单
	 * @author Shoven.Jiang  
	 * @date 2018年10月9日
	 * @param efbfIds  订单费用主键ids
	 * @param type :R  应收   P：应付   RP：代收代付
	 * @return
	 */
	ResponseData submitSettlementSheet(Collection<Long> efbfIds, String efbfType);
	/**
	 * @description 获取费用中的收支配比情况（人民币  美元  ）
	 * @author Simon.Guo  
	 * @date 2018年10月10日下午3:30:34
	 * @param eoorId
	 * @return
	 */
	ResponseData<EfBusinessFeesForCalcuteDto> getSettlementFeesSumInfo(Long eoorId);
	/**
	 * 通过eoorId获取该条订单下的信息
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	ResponseData<EoOrderDto> getOrderFeeByEoorId(Long eoorId);
	
	/**
	 * 费用上传bms---现结上传
	 * @author Shoven.Jiang  
	 * @date 2018年10月11日
	 * @param efbfIds  费用IDS
	 * @param eoorId   订单id
	 * @return
	 */
	ResponseData uploadCashSettlement(Long [] efbfIds, Long eoorId);
	
	/**
	 * 费用全部结算上传
	 * @author Shoven.Jiang  
	 * @date 2018年10月24日
	 * @param eoorIds
	 * @return
	 */
	public ResponseData upLoadAllToBms(Long [] eoorIds);
	/**
	 * 
	 * @description 批量费用变更
	 * @author Simon.Guo  
	 * @date 2018年11月4日下午1:20:11
	 * @param efBusinessFeesModelList
	 * @return
	 */
	ResponseData<List<EfBusinessFeesModel>> batchChangeBusinessFees(List<EfBusinessFeesModel> efBusinessFeesModelList);
	
	ResponseData copyEfbfListRep(Collection<Long> efbfIds);
	
	/**
	 * 子公司费用提交给总公司，总部代开票
	 * @author Shoven.Jiang  
	 * @date 2018年12月1日
	 * @param eoorId
	 * @return
	 */
	ResponseData substituteTicketFeesByHeadquarters(List<Long> eoorIds);
	
	/**
	 * @deprecated:复制订单费用
	 * @author Colley.Bai  
	 * @date 2019年4月11日
	 * @param eoOrderDto
	 * @return
	 */
	ResponseData<EoOrderDto> copyEoOrderEfbfFeeByEoorId(EoOrderDto eoOrderDto);
	
	/**
	 * @deprecated:根据项目自动计费
	 * @author Colley.Bai  
	 * @date 2019年4月30日
	 * @param eoorIds
	 * @return
	 */
	ResponseData<List<EfBusinessFeesModel>> saveAutomaticChargingFeesByEoorIds(Long[] eoorIds);
}
