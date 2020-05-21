package com.sinotrans.oms.eoor.controller;



import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoTrailerModelDto;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.eoor.dto.EoLandOrderTrackQueryItem;
import com.sinotrans.oms.eoor.dto.EoorScheduleQueryItem;
import com.sinotrans.oms.eoor.dto.EtSchedduleModelDto;
import com.sinotrans.oms.eoor.model.EtSchedulePlanModel;
import com.sinotrans.oms.eoor.model.EtTaskModel;
import com.sinotrans.oms.eoor.service.EoorService;


/**
 * controller层只作为和前台交互的接口，不处理业务逻辑，不与数据库交互
 * 2018年7月21日23:27:49
 * @author shoven
 *
 */
/**  

* <p>Title: EoOrderController</p>  

* <p>Description: </p>  

* @author shenlan  

* @date 2018年8月28日  

*/  
@RestController
@RequestMapping(value = "/eoorController")
public class EoorController {
	
	@Autowired
	private EoorService eoorService;//订单service
	
	
	/**
	 * 通过固定的查询条件来获取订单的查询结果
	 * add by shoven 2018年8月8日14:33:11
	 * @param conditionMap
	 * @return
	 */
	@RequestMapping(value = "/queryOrderFeeByCondition", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryOrderFeeByCondition(@RequestBody QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = this.eoorService.queryOrderFeeByCondition(queryInfo);
		return responseData;
	}
	@RequestMapping(value = "/querySchedulOrdeCondition", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> querySchedulOrdeCondition(@RequestBody QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = this.eoorService.querySchedulOrdeCondition(queryInfo);
		return responseData;
	}
	
	@RequestMapping(value = "/queryStationAndVehicleTracksCondition", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryStationAndVehicleTracksCondition(@RequestBody QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = this.eoorService.queryStationAndVehicleTracksCondition(queryInfo);
		return responseData;
	}
	
	@RequestMapping(value = "/queryEotaInfoCondition", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryEotaInfoCondition(@RequestBody QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = this.eoorService.queryEotaInfoCondition(queryInfo);
		return responseData;
	}
	
	@RequestMapping(value="/saveSchedulePlan",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EtSchedulePlanModel>> saveSchedulePlan(@RequestBody List<EtSchedduleModelDto> etSchedduleModelDtoList){
		ResponseData<List<EtSchedulePlanModel>> responseData = this.eoorService.saveSchedulePlan(etSchedduleModelDtoList);
		return responseData;
	}
	
	
	
	@RequestMapping(value = "/queryCancelScheduling", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData queryCancelScheduling (@RequestBody Integer[] etspIds) {
		//调用service层处理业务逻辑
		ResponseData responseData = this.eoorService.queryCancelScheduling(etspIds);
		return responseData;
	}
	
	@RequestMapping(value = "/querySchedulingConfirmation", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData querySchedulingConfirmation (@RequestBody Integer[] etspIds) {
		//调用service层处理业务逻辑
		ResponseData responseData = this.eoorService.querySchedulingConfirmation(etspIds);
		return responseData;
	}
	
	@RequestMapping(value="/queryPrintDrivingConfirmation",method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData queryPrintDrivingConfirmation(@RequestBody Integer[] etspIds) {
		//调用service层处理业务逻辑
		ResponseData responseData = this.eoorService.queryPrintDrivingConfirmation(etspIds);
		return responseData;
	}
	
	@RequestMapping(value = "/queryCancelConfirm", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData queryCancelConfirm (@RequestBody Integer[] etspIds) {
		//调用service层处理业务逻辑
		ResponseData responseData = this.eoorService.queryCancelConfirm(etspIds);
		return responseData;
	}
	
	@RequestMapping(value = "/queryIntelligentScheduling", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData queryIntelligentScheduling (@RequestBody Integer[] ettaIds) {
		//调用service层处理业务逻辑
		ResponseData responseData = this.eoorService.queryIntelligentScheduling(ettaIds);
		return responseData;
	}
	
	@RequestMapping(value="/queryStationJWDCondition",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData queryStationJWDCondition(@RequestBody Integer[] etspIds) {
		//调用service层处理业务逻辑
		ResponseData responseData = this.eoorService.queryStationJWDCondition(etspIds);
		return responseData;
	}
	
	@RequestMapping(value="/querySaveScheduling",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EtSchedulePlanModel>> querySaveScheduling(@RequestBody List<EoorScheduleQueryItem> eoorScheduleQueryItemList){
		ResponseData<List<EtSchedulePlanModel>> responseData = this.eoorService.querySaveScheduling(eoorScheduleQueryItemList);
		return responseData;
	}
	
	@RequestMapping(value="/saveEttaCarrier",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EtTaskModel>> saveEttaCarrier(@RequestBody List<EtTaskModel> etTaskModels){
		ResponseData<List<EtTaskModel>> responseData = this.eoorService.saveEttaCarrier(etTaskModels);
		return responseData;
	}
	
	
	@RequestMapping(value = "/queryEoLandOrderTrackQuery", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryEoLandOrderTrackQuery(@RequestBody QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = this.eoorService.queryEoLandOrderTrackQuery(queryInfo);
		return responseData;
	}
	
	@RequestMapping(value="/querySavePlanDate",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoLandOrderTrackQueryItem>> querySavePlanDate(@RequestBody List<EoLandOrderTrackQueryItem> eoLandOrderTrackQueryItems){
		ResponseData<List<EoLandOrderTrackQueryItem>> responseData = this.eoorService.querySavePlanDate(eoLandOrderTrackQueryItems);
		return responseData;
	}
	
}
