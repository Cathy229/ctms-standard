package com.sinotrans.oms.businessrequest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinotrans.oms.businessrequest.service.DposService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;

/**  
* Title: SubscribeDposController  
* Description:  状态池相关服务
* @author Shoven.Jiang  
* @date 2018年12月11日  
* @version 1.0  
*/
@RestController
@RequestMapping(value="/dposServiceController")
public class DposServiceController {

	@Autowired
	private DposService dposService;
	/**
	 * 根据类型订阅状态池服务
	 * @author Shoven.Jiang  
	 * @date 2018年12月11日
	 * @param Url 需要订阅的地址
	 * @param charset  编码格式
	 * @param postStr  传输的json内容
	 * @param keyId  服务对应的keyid
	 * @param businessCode 业务系统代码
	 * @return responseData  成功：返回结果报文 ; 失败：返回失败码以及错误信息
	 * @throws Exception 
	 */
	@RequestMapping(value = "/subscribeDposByType", method = {RequestMethod.GET, RequestMethod.POST}, produces = Constants.PRODUCES_CODE)
	public ResponseData<Object> subscribeDposByType(@RequestParam(value = "Url") String Url, @RequestParam(value = "charset") String charset, @RequestParam(value = "postStr") String postStr, @RequestParam(value = "keyId") String keyId, @RequestParam(value = "businessCode") String businessCode) throws Exception {
		return dposService.subscribeDposByType(Url, charset, postStr, keyId, businessCode);
	}
	
	/**
	 * 业务请求下发状态池服务
	 * @author Shoven.Jiang  
	 * @date 2018年12月13日
	 * @param brids  业务请求下发状态池主键集合
	 * @param type   业务请求类型，如果为空就走订单，否则走其他的业务请求  
	 * 				订舱：17   出口拖车：8   委托报关：9  ...
	 * @param excuteCode  存储过程名称
	 * @param ebtkId 业务请求中包含的项目执行计划作业步骤id，订单的可为空
	 * @return
	 */
	@RequestMapping(value = "/issuedStautsPoolService", method = {RequestMethod.GET, RequestMethod.POST}, produces = Constants.PRODUCES_CODE)
	public ResponseData issuedStautsPoolService(@RequestParam(value = "brids") Long [] brids, @RequestParam(value = "type") String type, @RequestParam(value = "ebtkId") Long ebtkId) {
		return dposService.issuedStautsPoolService(brids, type, ebtkId);
	}
}
