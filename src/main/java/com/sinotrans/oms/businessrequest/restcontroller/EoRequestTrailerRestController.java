package com.sinotrans.oms.businessrequest.restcontroller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoTrailerDto;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.businessrequest.service.EoEoom2EoetService;
import com.sinotrans.oms.businessrequest.service.EoRequestTrailerService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.aop.IgnoreLoginController;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.eoorder.dto.EoOrderDto;

/**  
* Title: EoRequestTrailerRestController  
* Description:  
* @author Shoven.Jiang  
* @date 2018年10月15日  
* @version 1.0  
*/
@RestController
@RequestMapping(value="/rest/eoRequestTrailerRestController")
public class EoRequestTrailerRestController {

	@Autowired
	private EoRequestTrailerService eoRequestTrailerService;
	@Autowired
	private EoEoom2EoetService eoEoom2EoetService;//拖车物料
	
	/**
	 * 拖车保存
	 */
	@RequestMapping(value="/saveTrailer",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoRequestTrailerModel> saveTrailer(@RequestBody EoRequestTrailerModel eoRequestTrailerModel){
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		//调用service层处理业务逻辑
		ResponseData<EoRequestTrailerModel> responseData = eoRequestTrailerService.saveTrailer(eoRequestTrailerModel);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 拖车货物保存
	 */
	@RequestMapping(value="/saveTrailerMaterial",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoEoom2EoetModel>> saveTrailerMaterial(@RequestBody List<EoEoom2EoetModel> eoEoom2EoetModelList){
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		//调用service层处理业务逻辑
		ResponseData<List<EoEoom2EoetModel>> responseData = eoEoom2EoetService.saveTrailerMaterial(eoEoom2EoetModelList);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 拖车请求保存，包含拖车基本信息，拖车货物，拖车集装箱信息
	 * @param eoTrailerDto
	 * @return
	 */
	@RequestMapping(value="/saveTrailerAndMaterial",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoTrailerDto> saveTrailerAndMaterial(@RequestBody Map mapParam){
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		EoTrailerDto eoTrailerDto = new EoTrailerDto();
		EoRequestTrailerModel eoRequestTrailerModel = (EoRequestTrailerModel) BlukInsertUtils.parseMapToObject((Map) mapParam.get("eoRequestTrailerModel"), new EoRequestTrailerModel());
		eoTrailerDto.setEoRequestTrailerModel(eoRequestTrailerModel);
		List<EoEooc2EoetModel> eoEooc2EoetModels = JSONArray.parseArray(JSONArray.toJSONString(mapParam.get("eoEooc2EoetModelList")), EoEooc2EoetModel.class);
		eoTrailerDto.setEoEooc2EoetModelList(eoEooc2EoetModels);
		ResponseData<EoTrailerDto> responseData = new ResponseData<EoTrailerDto>();
		responseData = this.eoRequestTrailerService.saveTrailerAndMaterial(eoTrailerDto);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	} 
	/**
	 * 拖车请求下达
	 * @param eoetIds
	 * @return
	 */
	@RequestMapping(value="/issuedTrailer",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData issuedTrailer(@RequestBody Long[] eoetIds){
		return eoRequestTrailerService.issuedTrailer(eoetIds);
	}
	/**
	 * 根据拖车主键获取拖车信息
	 * @param eoetIds
	 * @return
	 */
	@RequestMapping(value="/getTrailerAndMaterialById",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoTrailerDto> getTrailerAndMaterialById(@RequestBody Long eoetId){
		return eoRequestTrailerService.getTrailerAndMaterialById(eoetId);
	}
	/**
	 * 根据查询条件查询拖车列表信息
	 * @param eoetIds
	 * @return
	 */
	@RequestMapping(value="/queryTrailerByCondition",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryTrailerByCondition(@RequestBody QueryInfo queryInfo){
		return eoRequestTrailerService.queryTrailerByCondition(queryInfo);
	}
}
