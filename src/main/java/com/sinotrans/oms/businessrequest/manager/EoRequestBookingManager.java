package com.sinotrans.oms.businessrequest.manager;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.common.base.ResponseData;

public interface EoRequestBookingManager extends MybatisManager{

	EoRequestBookingModel get(Long id);

	List<EoRequestBookingModel> findByCondition(List<FilterCondition> conditions);

	EoRequestBookingModel save(EoRequestBookingModel model);

	List<EoRequestBookingModel> saveAll(List<EoRequestBookingModel> models);

	void delete(EoRequestBookingModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
	/**
	 * 
	 * @DATE 2018年9月4日 下午7:22:42
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:订舱代理配载人信息展示
	 * @param ebcuCustomerNo
	 * @param eoorId
	 * @param type
	 * @return
	 */
	ResponseData getEsUserByEbcuNo(String ebcuCustomerNo, Long eoorId, String type);
	
	/**
	 * 代码解析订舱网反馈邮件，并将船名 航次 提单号存入订舱任务中
	 * @author Shoven.Jiang  
	 * @date 2019年3月27日
	 * @param contentMap 邮件解析的内容
	 * @return
	 */
	ResponseData feedBackToEorb(Map<String, Object> contentMap);
	
	/**
	 * 订舱网反馈订单被拒绝的邮件，需要将原订舱任务切换成待下达状态，并且将拒绝原因邮件提醒用户
	 * @author Shoven.Jiang  
	 * @date 2019年4月2日
	 * @param contentMap
	 * @return
	 */
	ResponseData feedBackToEorbByrefuse(Map<String, Object> contentMap);
}
