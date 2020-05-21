package com.sinotrans.oms.fees.service;

import java.util.Collection;
import java.util.List;

import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.fees.dto.EfBmsImModelDto;
import com.sinotrans.oms.fees.dto.SettmentCodeRequestQueryDto;
import com.sinotrans.oms.fees.model.EfBmsImModel;

/**  
* <p>Title: efBusinessFeesSettlementManager</p>  
* <p>Description:费用上传bms通用逻辑 </p>  
* @author Shoven.Jiang  
* @date 2018年9月10日  
* @version 1.0  
*/
public interface efBusinessFeesSettlementService {

	/**
	 *  根据装货港和卸货港获取流向【适用于货代界面中包含装货港和卸货港】
	 * @author Shoven.Jiang  
	 * @date 2018年9月10日
	 * @return
	 */
	String getEfbmAttribute001ByEbPortContry(Long eoorId, String eoeaAgencyType);
	
	/**
	 * 费用结算上传--根据业务类型来判断该订单属于哪一个模板的统计值
	 * @author Shoven.Jiang  
	 * @date 2018年9月10日
	 * @param bmsImModel
	 * @param eoorId
	 * @param businessType
	 * @return
	 */
	public ResponseData upLoadBms(EfBmsImModel bmsImModel, Long eoorId, String businessType);
	
	/**
	 * 统计值适配通过业务类型找到对应的组织entity的方法
	 * @author Shoven.Jiang  
	 * @date 2018年9月11日
	 * @param eoorId
	 * @param businessType
	 * @return
	 */
	EfBmsImModelDto generateEntity(Long eoorId, String businessType);
	
	/**
	 * 统计值界面点击确认收集统计值信息上传到bms
	 * @author Shoven.Jiang  
	 * @date 2018年9月13日
	 * @param params
	 * @return
	 */
	ResponseData upLoadToBms(EfBmsImModelDto efBmsImModelDto);
	
	/**
	 * 费用结算上传时获取业务完成时间
	 * @author Shoven.Jiang  
	 * @date 2018年9月14日
	 * @param efBmsImModelDto
	 * @return
	 */
	ResponseData getOrderBmsAcceptTime(EfBmsImModelDto efBmsImModelDto);
	
	/**
	 * 统计值模板生成单票操作表，只有免税或非免税的费用的费用只生成一条对应的单票操作表记录，
	 * 如果上传的费用同时有免税和非免税的费用，则同时生成两条单票操作表记录
	 * @author Shoven.Jiang  
	 * @date 2018年9月14日
	 * @param source
	 * @param eoorId
	 * @param uploaded
	 */
	void synchronizeEfbmsImModelType(EfBmsImModel source, Long eoorId, String uploaded, Long [] efbfIds);
	
	/**
	 * 费用上传bms调用接口
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param efBmsImModel
	 * @param eoorId
	 * @param efbfIds
	 * @param isLoadEiep
	 * @param businessType
	 * @return
	 */
	ResponseData uploadBmsByOrderDimension(EfBmsImModel efBmsImModel,Long eoorId, Long[] efbfIds, boolean isLoadEiep, String businessType);
	
	/**
	 * 动态组装提交结算单费用信息
	 * @author Shoven.Jiang  
	 * @date 2018年10月9日
	 * @param settmentCodeRequestQueryDto
	 * @return
	 */
	ResponseData assembleEfbfInformation(Collection<Long> efbfIds, List<SettmentCodeRequestQueryDto> settmentCodeRequestQueryDtos);
	
	/**
	 * 费用上传bms---现结上传
	 * @author Shoven.Jiang  
	 * @date 2018年10月11日
	 * @param efbfIds  费用IDS
	 * @param eoorId   订单id
	 * @return
	 */
	ResponseData uploadCashSettlement(Long [] efbfIds, Long eoorId);
	
}
