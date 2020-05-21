package com.sinotrans.oms.businessrequest.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoBookingDto;
import com.sinotrans.oms.businessrequest.dto.EoBookingModelDto;
import com.sinotrans.oms.businessrequest.model.EoEoom2EobrModel;
import com.sinotrans.oms.businessrequest.model.EoEorb2EosrModel;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.businessrequest.service.EoBookingService;
import com.sinotrans.oms.businessrequest.service.EoEoom2EobrService;
import com.sinotrans.oms.businessrequest.service.EoEorb2EosrService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.aop.IgnoreLoginController;
import com.sinotrans.oms.common.base.ResponseData;

/**  
* Title: EoBookingRestController  
* Description:  订舱相关供外部调用接口
* @author Shoven.Jiang  
* @date 2018年10月15日  
* @version 1.0  
*/
@RestController
@RequestMapping(value="/rest/eoBookingRestController")
public class EoBookingRestController {

	@Autowired
	private EoBookingService eoBookingService;
	@Autowired
	private EoEorb2EosrService eoEorb2EosrService;//箱
	@Autowired
	private EoEoom2EobrService eoEoom2EoetService;//物料
	
	/**
	 * 
	 * @date 2018年8月15日 下午12:03:21  
	 * @author simon 
	 * Description:订舱基本信息保存
	 * @param eoRequestBookingModel
	 * @return
	 */
	@RequestMapping(value="/saveBooking",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoRequestBookingModel> saveBooking(@RequestBody EoBookingModelDto eoBookingModelDto){
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData responseData = eoBookingService.saveBooking(eoBookingModelDto);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 
	 * @date 2018年8月15日 下午12:05:13  
	 * @author simon 
	 * Description:订舱箱信息保存
	 * @param eoRequestBookingModel
	 * @return
	 */
	@RequestMapping(value="/saveBookingEoet",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoEorb2EosrModel>> saveBookingEoet(@RequestBody List<EoEorb2EosrModel> eoEorb2EosrModels){
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData responseData = eoEorb2EosrService.saveBookingEoet(eoEorb2EosrModels);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 
	 * @date 2018年8月15日 下午12:05:53  
	 * @author simon 
	 * Description:订舱物料信息保存
	 * @param eoRequestBookingModel
	 * @return
	 */
	@RequestMapping(value="/saveBookingMaterial",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoEoom2EobrModel>> saveBookingMaterial(@RequestBody List<EoEoom2EobrModel> eoEoom2EobrModels){
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData responseData = eoEoom2EoetService.saveBookingMaterial(eoEoom2EobrModels);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 
	 * @date 2018年8月15日 下午12:06:10  
	 * @author simon 
	 * Description:订舱基本+物料+箱信息保存=DTO
	 * @param eoRequestBookingModel
	 * @return
	 */
	@RequestMapping(value="/saveBookingAndMaterial",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoBookingDto> saveBookingAndMaterial(@RequestBody EoBookingDto eoBookingDto){
		return eoBookingService.saveBookingAndMaterial(eoBookingDto);
	}
	/**
	 * 通过固定的查询条件来获取订舱的查询结果
	 * add by colley 2018年8月28日18:42:23
	 * @param queryInfo
	 * @return
	 */
	@RequestMapping(value = "/queryBookingByCondition",  method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryBookingByCondition(@RequestBody QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		responseData = this.eoBookingService.queryBookingByCondition(queryInfo);
		return responseData;
	}
	/**
	 * 订舱下达直接对接海运订舱网不通过海运系统转接
	 * @author Shoven.Jiang  
	 * @date 2018年8月29日
	 * @param eorbId
	 * @return
	 */
	@RequestMapping(value="/issuedBooking",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData issuedBooking(@RequestBody Long [] eorbIds){
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData ss = this.eoBookingService.issuedBooking(eorbIds);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return ss;
	}
	/**
	 * 
	 * @date 2018年8月20日 下午2:36:30  
	 * @author simon 
	 * Description:根据订舱主键获取订舱信息
	 * @param eorbId
	 * @return
	 */
	@RequestMapping(value="/getBookingAndMaterialById",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoBookingDto> getBookingAndMaterialById(@RequestBody Long eorbId){
		return eoBookingService.getBookingAndMaterialById(eorbId);
	}
	/**
	 * 订舱任务提单下达
	 * @author Shoven.Jiang  
	 * @date 2018年11月21日
	 * @param eorbIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/ladingIssuedBooking",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData ladingIssuedBooking(@RequestBody Long [] eorbIds){
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData responseData = this.eoBookingService.ladingIssuedBooking(eorbIds);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
}
