package com.sinotrans.oms.fees.manager;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.fees.dto.ContractLogisticTempleteQueryDto;
import com.sinotrans.oms.fees.dto.SettmentCodeRequestQueryDto;
import com.sinotrans.oms.fees.dto.UpToBmsCheckQueryDto;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;
import com.sinotrans.oms.fees.model.EiExpensesModel;

/**  
* <p>Title: efBusinessFeesSettlementManager</p>  
* <p>Description: 费用上传bms通用逻辑</p>  
* @author Shoven.Jiang  
* @date 2018年9月10日  
* @version 1.0  
*/
public interface EfBusinessFeesSettlementManager extends MybatisManager{

	/**
	 * 出口流向判断（水路）
	 * 现结上传,结算上传增加流向的判断
	 * @author Shoven.Jiang  
	 * @date 2018年9月10日
	 * @param eoeaEoorId
	 * @return
	 */
	String getWaterwayDischargePortTempleteByCondition(Map<String, Object> condition);
	
	/**
	 * 进口判断流向
	 * 现结上传,结算上传增加流向的判断 add by shoven
	 * @author Shoven.Jiang  
	 * @date 2018年9月10日
	 * @param condition
	 * @return
	 */
	String getWaterWayLoadingPort(Map<String, Object> condition);
	
	/**
	 * 查询订单费用是免税类型
	 * @author Shoven.Jiang  
	 * @date 2018年9月14日
	 * @param condition
	 * @return
	 */
	Map getEfbfNameCnWhetherDuty(Map<String, Object> condition);
	
	/**
	 * 查询费用id集合 efbfIds
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param condition
	 * @return
	 */
	List<Long> getEfBusinessSettementFeesQueryList(Map<String, Object> condition);
	
	/**
	 * 费用上传时bms票据代码，版块代码，销售人员代码，bms项目字段取值
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param condition
	 * @return
	 */
	UpToBmsCheckQueryDto getUpToBmsCheckQueryDto(Map<String, Object> condition);
	
	/**
	 * 保存可上传的费用以及保存费用接口表费用
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param canUpLoadFees
	 * @param eiExpensesModels
	 */
	void saveCanUpLoadFeesAndEiepFees(List<EfBusinessFeesModel> canUpLoadFees, Long eoorId, String isDutyFree, Long eiimId);
	
	/**
	 * 通过订单id以及单票的进出口，订单基本信息中的装卸货港进行判断流向
	 * @author Shoven.Jiang  
	 * @date 2018年9月18日
	 * @param eoorId
	 * @param eoeaAgencyType
	 * @return
	 */
	String getEfbmAttribute001ByBusinessType(Long eoorId, String eoeaAgencyType);
	
	/**
	 * 提交结算单校验所选费用行是否是相同结算对象，费用类型，币种，税率是否一致
	 * @author Shoven.Jiang  
	 * @date 2018年10月9日
	 * @param conditions
	 * @return
	 */
	ResponseData<List<SettmentCodeRequestQueryDto>> submitSettlementSheet(Map<String, Object> conditions,
			Collection<Long> efbfIds);
	
}
