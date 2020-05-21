package com.sinotrans.oms.businessrequest.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSONArray;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoTrailerDto;
import com.sinotrans.oms.businessrequest.dto.EoTrailerModelDto;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoRequestTrailerModel;
import com.sinotrans.oms.businessrequest.service.EoEooc2EoetService;
import com.sinotrans.oms.businessrequest.service.EoEoom2EoetService;
import com.sinotrans.oms.businessrequest.service.EoRequestTrailerService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;
/**
 * <p>Description: 拖车请求标准服务
 *    
 * </p>
 *
 * @author James
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本     修改人   	修改日期   	修改内容
 * 1.0         James    2018-08-07	创建
 * 
 * 
 * </pre>
 */

@RestController
@RequestMapping(value="/eoRequestTrailerController")
public class EoRequestTrailerController {
	
	
	@Autowired
	private EoRequestTrailerService eoRequestTrailerService;
	@Autowired
	private EoEoom2EoetService eoEoom2EoetService;//拖车物料
	@Autowired
	private EoEooc2EoetService eoEooc2EoetService;//拖车预配箱
	
	/**
	 * 拖车保存
	 */
	@RequestMapping(value="/saveTrailer",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoRequestTrailerModel> saveTrailer(@RequestParam(value="eoRequestTrailerModel") EoRequestTrailerModel eoRequestTrailerModel, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoRequestTrailerService.saveTrailer(eoRequestTrailerModel);
	}
	/**
	 * 拖车货物保存
	 */
	@RequestMapping(value="/saveTrailerMaterial",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoEoom2EoetModel>> saveTrailerMaterial(@RequestBody List<EoEoom2EoetModel> eoEoom2EoetModelList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEoom2EoetService.saveTrailerMaterial(eoEoom2EoetModelList);
	}
	/**
	 * 拖车请求保存，包含拖车基本信息，拖车货物，拖车集装箱信息
	 * @param eoTrailerDto
	 * @return
	 */
	@RequestMapping(value="/saveTrailerAndMaterial",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoTrailerDto> saveTrailerAndMaterial(@RequestBody Map mapParam, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		EoTrailerDto eoTrailerDto = new EoTrailerDto();
		EoRequestTrailerModel eoRequestTrailerModel = (EoRequestTrailerModel) BlukInsertUtils.parseMapToObject((Map) mapParam.get("eoRequestTrailerModel"), new EoRequestTrailerModel());
		eoTrailerDto.setEoRequestTrailerModel(eoRequestTrailerModel);
		List<EoEooc2EoetModel> eoEooc2EoetModels = JSONArray.parseArray(JSONArray.toJSONString(mapParam.get("eoEooc2EoetModelList")), EoEooc2EoetModel.class);
		eoTrailerDto.setEoEooc2EoetModelList(eoEooc2EoetModels);
		return eoRequestTrailerService.saveTrailerAndMaterial(eoTrailerDto);
	} 
	/**
	 * 拖车请求下达
	 * @param eoetIds
	 * @return
	 */
	@RequestMapping(value="/issuedTrailer",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData issuedTrailer(@RequestBody Long[] eoetIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoRequestTrailerService.issuedTrailer(eoetIds);
	}
	
	/**
	 * 根据拖车主键获取拖车信息
	 * @param eoetIds
	 * @return
	 */
	@RequestMapping(value="/getTrailerAndMaterialById",method=RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoTrailerDto> getTrailerAndMaterialById(@RequestParam(value="eoetId") Long eoetId){
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
	/**
	 * @deprecated:拖车预配箱批量保存
	 * @author Colley.Bai  
	 * @date 2018年10月13日 下午9:24:13
	 * @param eoEooc2EoetModels
	 * @return
	 */
	@RequestMapping(value="/saveTrailerEoot",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoEooc2EoetModel>> saveTrailerEoot(@RequestBody List<EoEooc2EoetModel> eoEooc2EoetModels, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEooc2EoetService.saveTrailerEoot(eoEooc2EoetModels);
	}
	/**
	 * @deprecated: 根据id删除拖车预配箱信息
	 * @author Colley.Bai  
	 * @date 2018年10月13日 上午9:48:23
	 * @param eootId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/deletetTrailerPrecontainer",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoEooc2EoetModel> deletetTrailerPrecontainer(@RequestBody Long eootId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEooc2EoetService.deleteById(eootId);
	}
	/**
	 * @deprecated:根据eootIds批量删除预配箱信息
	 * @author Colley.Bai  
	 * @date 2018年10月13日 上午9:49:45
	 * @param eootIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/batchDeleteTrailerContainer",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	ResponseData<List<EoEooc2EoetModel>> batchDeleteTrailerContainer(@RequestBody List<Long> eootIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEooc2EoetService.deleteByIds(eootIds);
	}
	/**
	 * @deprecated: 根据id删除拖车预配箱信息
	 * @author Colley.Bai  
	 * @date 2018年10月13日 上午9:48:23
	 * @param eootId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/deleteTrailerMaterial",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoEoom2EoetModel> deleteTrailerMaterial(@RequestBody Long eomtId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEoom2EoetService.deleteById(eomtId);
	}
	/**
	 * @deprecated:根据eootIds批量删除预配箱信息
	 * @author Colley.Bai  
	 * @date 2018年10月13日 上午9:49:45
	 * @param eootIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/batchDeleteTrailerMaterial",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	ResponseData<List<EoEoom2EoetModel>> batchDeleteTrailerMaterial(@RequestBody List<Long> eomtIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEoom2EoetService.deleteByIds(eomtIds);
	}
	/**
	 * @deprecated:拖车基本信息批量保存
	 * @author Colley.Bai  
	 * @date 2018年10月24日 下午03:08:23
	 * @param eoRequestTrailerModelList
	 * @return
	 */
	@RequestMapping(value="/batchSaveTrailerAndMaterial",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoRequestTrailerModel>> batchSaveTrailerAndMaterial(@RequestBody List<EoTrailerModelDto> eoRequestTrailerModelList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<List<EoRequestTrailerModel>> responseData = eoRequestTrailerService.batchSaveTrailerAndMaterial(eoRequestTrailerModelList);
		return responseData;
	}
	/**
	 * @deprecated:实装箱信息批量保存
	 * @author Colley.Bai  
	 * @date 2018年10月25日 下午 02:10:02
	 * @param eoEoom2EoseModelList
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/batchSaveOrderAndEooc",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoOrderContainerModel>> batchSaveOrderAndEooc(@RequestBody List<EoOrderContainerModel> eoOrderContainerModelList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoRequestTrailerService.batchSaveTrailerAndEome(eoOrderContainerModelList);
	}
	/**
	 * @deprecated:根据eomeIds批量删除事项箱信息
	 * @author Colley.Bai  
	 * @date 2018年10月25日 下午2:49:45
	 * @param eoocIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/batchDeleteOrderEooc",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	ResponseData<List<EoOrderContainerModel>> batchDeleteOrderEooc(@RequestBody List<Long> eoocIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoRequestTrailerService.deleteByIds(eoocIds);
	}
	/**
	 * @deprecated: 根据eomeId删除实装箱信息
	 * @author Colley.Bai  
	 * @date 2018年10月23日 下午2:48:23
	 * @param eoocId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/deleteOrderEooc",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderContainerModel> deleteOrderEooc(@RequestBody Long eoocId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoRequestTrailerService.deleteById(eoocId);
	}
	
	/**
	 * @deprecated:根据拖车信息自动计费
	 * @author Colley.Bai  
	 * @date 2018年11月29日
	 * @param eoetIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/saveAutomaticChargingByEoetTrailer",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<ElProtocolCostFeelModel>> saveAutomaticChargingByEoetTrailer(@RequestBody Long[] eoetIds,
			@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoRequestTrailerService.saveAutomaticChargingByEoetTrailer(eoetIds);
	}
	
	/**
	 * 业务请求-拖车-状态回退
	 * @author Shoven.Jiang  
	 * @date 2018年12月18日
	 * @param eoorIds  订单ids
	 * @return
	 */
	@RequestMapping(value="/eoetStatusBackByEoetIds",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData eoetStatusBackByEoetIds(@RequestBody Long [] eoetIds) {
		return this.eoRequestTrailerService.eoetStatusBackByEoetIds(eoetIds);
	}
	
	/**
	 * @deprecated:集装箱保存
	 * @author Colley.Bai  
	 * @date 2018年12月24日
	 * @param mapParam
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/saveTrailerAndEooc",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoTrailerDto> saveTrailerAndEooc(@RequestBody Map mapParam,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		EoTrailerDto eoTrailerDto = new EoTrailerDto();
		EoRequestTrailerModel eoRequestTrailerModel = (EoRequestTrailerModel) BlukInsertUtils.parseMapToObject((Map) mapParam.get("eoRequestTrailerModel"), new EoRequestTrailerModel());
		eoTrailerDto.setEoRequestTrailerModel(eoRequestTrailerModel);
		List<EoEooc2EoetModel> eoEooc2EoetModels = JSONArray.parseArray(JSONArray.toJSONString(mapParam.get("eoEooc2EoetModelList")), EoEooc2EoetModel.class);
		eoTrailerDto.setEoEooc2EoetModelList(eoEooc2EoetModels);
		return eoRequestTrailerService.saveTrailerAndEooc(eoTrailerDto);
	}
	
	/**
	 * @deprecated:拖车委托书导出
	 * @author Colley.Bai  
	 * @date 2018年12月29日
	 * @param eoetIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/exportTrailer",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<Map<String, String>> exportTrailer(@RequestBody Long[] eoetIds,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return eoRequestTrailerService.exportTrailer(eoetIds);
	}
	
	/**
	 * @deprecated:根据订单主键查询拖车任务
	 * @author Colley.Bai  
	 * @date 2019年1月8日
	 * @param eoorId
	 * @return
	 */
	@RequestMapping(value="/getTrailerAndMaterialByEoorId",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoRequestTrailerModel>> getTrailerAndMaterialByEoorId(@RequestBody Long eoorId){
		return eoRequestTrailerService.getTrailerAndMaterialByEoorId(eoorId);
	}
}
