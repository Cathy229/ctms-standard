/**
 * <p>Description: 
 *    
 * </p>
 *
 * @author James
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本     修改人   	修改日期   	修改内容
 * 2018年8月9日   创建人    20091201 	创建
 * 
 * 
 * </pre>
 */
package com.sinotrans.oms.common.manager;

import java.util.Date;
import java.util.List;
import java.util.Map;

import com.sinotrans.framework.orm.support.StoredProcedure;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.customerproject.model.EbProjectPlanModel;
import com.sinotrans.oms.eoorder.model.EoOrderExpandAgencyModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;

/**
 * <p>Description: 用于调用存储过程的统一服务接口
 *    
 * </p>
 *
 * @author James
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本     修改人   	修改日期   	修改内容
 * 2018年8月9日     James       	               创建
 * 
 * 
 * </pre>
 */
public interface ProcedureManager extends MybatisManager {

	/**
	 * 请求下达调用存储过程
	 * 逻辑说明：
	 * 1. 获取请求数据，
	 * @param brId 请求ID
	 * @param ebtkId 作业步骤ID
	 * @return 
	 */
	public String requestIssued(Long brId, Long ebtkId);
	
	/**
	 * 订单执行时调用存储过程
	 * @author Shoven.Jiang  
	 * @date 2018年8月28日
	 * @param eoOrderModel
	 * @param excuteString
	 * @return
	 */
	public Map<String, Object> invokeEoOrderFreightSave(EoOrderModel eoOrderModel , String excuteString);
	/**
	 * 
	 * @DATE 2018年9月4日 下午7:00:36
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:订单执行时调用存储过程
	 * @param eoOrderModel
	 * @param excuteString
	 * @return
	 */
	public Map<String, Object> storedProcedure(EoOrderModel eoOrderModel, String excuteString);
	/**
	 * 
	 * @DATE 2018年9月5日 下午4:34:53
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:订单作业步骤的执行
	 * @param ebppId
	 * @param eoorId
	 * @return
	 */
	public String invokeAfterSaveOrderEvent(Long ebppId,Long eoorId);
	
	/**
	 * 执行订单业务完成时间的存储过程
	 * @author Shoven.Jiang  
	 * @date 2018年9月14日
	 * @param ebProjectPlanModel
	 * @param eoorId
	 * @return
	 */
	String acmpTimeExec(EbProjectPlanModel ebProjectPlanModel,Long eoorId);
	
	/**
	 * 调用费用上传的存储过程并返回主信息表主键 eiimID
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param ebProjectPlanModel
	 * @param efbmId
	 * @param flag
	 * @return
	 */
	ResponseData ebppBbdEbpdCodeExecNew(EbProjectPlanModel ebProjectPlanModel, Long efbmId, String flag);
	
	/**
	 * 订单执行，调用存储过程，生成BR信息
	 * @author Shoven.Jiang  
	 * @date 2018年10月13日
	 * @param ebProjectPlanModel
	 * @param eoOrderModel
	 * @return
	 */
	String acceptOrder(EbProjectPlanModel ebProjectPlanModel,EoOrderModel eoOrderModel);

	/**
	 * 执行生产里程碑和事件的存储过程
	 * @author Shoven.Jiang  
	 * @date 2018年10月13日
	 * @param ebProjectPlanModel
	 * @param date
	 * @param eoorId
	 * @return
	 */
	ResponseData execEvents(EbProjectPlanModel ebProjectPlanModel, Date date, Long eoorId);
	
	/**
	 * 请求保存后，根据 作业步骤表记录id 获取 作业事件来调用存储过程。
	 * @author Shoven.Jiang  
	 * @date 2018年10月25日
	 * @param ebtkid 作业步骤表记录id
	 * @param type 任务类型
	 * @param brid 业务请求记录id
	 * @return String
	 * @author blake
	 */
	String invokeAfterSaveBrEvent(Long ebtkid, String type, Long brid);
	
	/**
	 * 订单保存时下发状态池数据
	 * @author Shoven.Jiang  
	 * @date 2018年10月30日
	 * @param eoorIds
	 * @return
	 */
	ResponseData buildToStatePool(Long eoorId);
	
	/**
	 * 调用事件存储过程执行个性化操作
	 * @author Shoven.Jiang  
	 * @date 2018年11月18日
	 * @param planName
	 * @param type
	 * @param brid
	 * @return
	 */
	String callEventStoreProcedure(String planName,String type,Long brid);
	
	/**
	 * 海运出口订单订单保存同步信息
	 * @author Shoven.Jiang  
	 * @date 2018年11月18日
	 * @param eoOrderExpandAgencyModel
	 * @param excuteString
	 * @return
	 */
	String invokeEoOrderFreightSave(EoOrderExpandAgencyModel eoOrderExpandAgencyModel, String excuteString);
	
	/**
	 * 订单状态池下发
	 * @author Shoven.Jiang  
	 * @date 2018年12月13日
	 * @param brid
	 * @param excuteCode
	 * @return
	 */
	String eoorderToDposByExecuteCode(String brid, String excuteCode);
}
