package com.sinotrans.oms.businessrequest.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoBookingDto;
import com.sinotrans.oms.businessrequest.dto.EoBookingModelDto;
import com.sinotrans.oms.businessrequest.dto.EoRequestTrailerListQueryItem;
import com.sinotrans.oms.businessrequest.dto.EoTrailerDto;
import com.sinotrans.oms.businessrequest.model.EoEoom2EobrModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoEorb2EosrModel;
import com.sinotrans.oms.businessrequest.model.EoRequestBookingModel;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.businessrequest.service.EoEoom2EobrService;
import com.sinotrans.oms.businessrequest.service.EoEoom2EoetService;
import com.sinotrans.oms.businessrequest.service.EoEorb2EosrService;
import com.sinotrans.oms.businessrequest.service.EoRequestTrailerService;
import com.sinotrans.oms.businessrequest.service.EoBookingService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.BeanUtils;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;
/**
 * 
* @ClassName: EoBookingController
* @Description: 订舱标准化服务
* @author Simon
* @date 2018年8月15日上午11:55:05
*
 */
@RestController
@RequestMapping(value="/eoBookingController")
public class EoBookingController {
	
	
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
	public ResponseData<EoRequestBookingModel> saveBooking(@RequestBody EoBookingModelDto eoBookingModelDto, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoBookingService.saveBooking(eoBookingModelDto);
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
	public ResponseData<List<EoEorb2EosrModel>> saveBookingEoet(@RequestBody List<EoEorb2EosrModel> eoEorb2EosrModels, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		System.out.println(eoEorb2EosrModels);
		return eoEorb2EosrService.saveBookingEoet(eoEorb2EosrModels);
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
	public ResponseData<List<EoEoom2EobrModel>> saveBookingMaterial(@RequestBody List<EoEoom2EobrModel> eoEoom2EobrModels, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEoom2EoetService.saveBookingMaterial(eoEoom2EobrModels);
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
	public ResponseData<EoBookingDto> saveBookingAndMaterial(EoBookingDto eoBookingDto, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoBookingService.saveBookingAndMaterial(eoBookingDto);
	}
	/**
	 * 
	 * @date 2018年8月20日 下午2:36:30  
	 * @author simon 
	 * Description:根据订舱主键获取订舱信息
	 * @param eorbId
	 * @return
	 */
	@RequestMapping(value="/getTrailerAndMaterialById",method=RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoBookingDto> getBookingAndMaterialById(@RequestParam(value="eorbId") Long eorbId){
		return eoBookingService.getBookingAndMaterialById(eorbId);
	}
	/**
	 * 
	 * @DATE 2018年8月27日 下午4:44:06
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据id删除订舱物料信息
	 * @param eobmId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/deleteMaterialById",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	ResponseData<EoEoom2EobrModel> deleteMaterialById(Long eobmId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEoom2EoetService.deleteById(eobmId);
	}
	/**
	 * 
	 * @DATE 2018年8月27日 下午4:46:04
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据ids批量删除订舱物料信息
	 * @param eobmIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/deleteMaterialByIds",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	ResponseData<List<EoEoom2EobrModel>> deleteMaterialByIds(@RequestBody List<Long> eobmIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEoom2EoetService.deleteByIds(eobmIds);
	}
	/**
	 * 
	 * @DATE 2018年8月27日 下午4:44:06
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据id删除订舱箱信息
	 * @param eobmId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/deleteById",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	ResponseData<EoEorb2EosrModel> deleteById(Long eobtId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEorb2EosrService.deleteById(eobtId);
	}
	/**
	 * 
	 * @DATE 2018年8月27日 下午4:46:04
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据ids批量删除订舱箱信息
	 * @param eobmIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/deleteByIds",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	ResponseData<List<EoEorb2EosrModel>> deleteByIds(@RequestBody List<Long> eobtIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEorb2EosrService.deleteByIds(eobtIds);
	}
	
	/**
	 * 通过固定的查询条件来获取订舱的查询结果
	 * add by colley 2018年8月28日18:42:23
	 * @param queryInfo
	 * @return
	 */
	@RequestMapping(value = "/queryBookingByCondition",  method = RequestMethod.POST)
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
	public ResponseData issuedBooking(@RequestBody Long [] eorbIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData responseData = this.eoBookingService.issuedBooking(eorbIds);
		return responseData;
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
	public ResponseData ladingIssuedBooking(@RequestBody Long [] eorbIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData responseData = this.eoBookingService.ladingIssuedBooking(eorbIds);
		return responseData;
	}
	
	/**
	 * @deprecated:订舱批量生成费用
	 * @author Colley.Bai  
	 * @date 2018年11月29日
	 * @param eorbIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/saveAutomaticChargingByEorbBooking",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<ElProtocolCostFeelModel>> saveAutomaticChargingByEorbBooking(@RequestBody Long [] eorbIds, 
			@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<List<ElProtocolCostFeelModel>> responseData = this.eoBookingService.saveAutomaticChargingByEorbBooking(eorbIds);
		return responseData;
	}
	
	/**
	 * 业务请求-订舱-状态回退
	 * @author Shoven.Jiang  
	 * @date 2018年12月18日
	 * @param eoorIds  订单ids
	 * @return
	 */
	@RequestMapping(value="/eorbStatusBackByEoorIds",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData eorbStatusBackByEoorIds(@RequestBody Long [] eoorIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		return this.eoBookingService.eorbStatusBackByEoorIds(eoorIds);
	}
	
	/**
	 * @deprecated:导出
	 * @author Colley.Bai  
	 * @date 2018年12月28日
	 * @param eorbIds
	 * @param response
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/exportBooking",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData exportBooking(HttpServletResponse resp , @RequestBody Long[] eorbIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return this.eoBookingService.exportBooking(eorbIds,resp);
	}
}
