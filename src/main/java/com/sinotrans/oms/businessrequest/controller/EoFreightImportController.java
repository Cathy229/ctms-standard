package com.sinotrans.oms.businessrequest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoFreightImportModelDto;
import com.sinotrans.oms.businessrequest.model.EoImportJoabBoxModel;
import com.sinotrans.oms.businessrequest.service.EoFreightImportService;
import com.sinotrans.oms.businessrequest.service.EoImportJoabBoxService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;

/**  
* Title: EoFreightImportController  
* Description:  查验相关供外部调用接口
* @author Colley.Bai  
* @date 2019年02月26日  
* @version 1.0  
*/
@RestController
@RequestMapping(value="/eoFreightImportController")
public class EoFreightImportController {

	@Autowired
	private EoFreightImportService eoFreightImportService;
	
	@Autowired
	private EoImportJoabBoxService eoImportJoabBoxService;
	
	/**
	 * @deprecated:保存查验基本信息
	 * @author Colley.Bai  
	 * @date 2019年2月26日
	 * @param eoFreightImportModel
	 * @return
	 */
	@RequestMapping(value="/saveEoFreightImport",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoFreightImportModelDto> saveEoFreightImport(@RequestBody EoFreightImportModelDto eoFreightImportModelDto){
		ResponseData<EoFreightImportModelDto> responseData = eoFreightImportService.saveEoFreightImportModel(eoFreightImportModelDto);
		return responseData;
	}
	
	/**
	 * @deprecated:根据订单id查询查验信+出口箱信息
	 * @author Colley.Bai  
	 * @date 2019年2月26日
	 * @param eoFreightImportModel
	 * @return
	 */
	@RequestMapping(value="/getEoFreightImportByEoordId",method=RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoFreightImportModelDto> getEoFreightImportByEoordId(@RequestParam(value="eoorId") Long eoorId){
		ResponseData<EoFreightImportModelDto> responseData = eoFreightImportService.getEoFreightImportByEoordId(eoorId);
		return responseData;
	}
	
	/**
	 * @deprecated:进口箱信息（分页）
	 * @author Colley.Bai  
	 * @date 2019年2月26日
	 * @param queryInfo
	 * @return
	 */
	@RequestMapping(value="/queryImportJoabBoxByCondition",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryImportJoabBoxByCondition(@RequestBody QueryInfo queryInfo){
		ResponseData<QueryData> responseData = eoFreightImportService.queryImportJoabBoxByCondition(queryInfo);
		return responseData;
	}
	
	/**
	 * @deprecated:批量保存出口箱信息
	 * @author Colley.Bai  
	 * @date 2019年2月26日
	 * @param queryInfo
	 * @return
	 */
	@RequestMapping(value="/batchSaveEoImportJoabBox",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoImportJoabBoxModel>> batchSaveEoImportJoabBox(@RequestBody List<EoImportJoabBoxModel> eoImportJoabBoxModelLis){
		ResponseData<List<EoImportJoabBoxModel>> responseData = eoImportJoabBoxService.batchSaveEoImportJoabBox(eoImportJoabBoxModelLis);
		return responseData;
	}
	
	/**
	 * @deprecated:批量删除出口箱信息
	 * @author Colley.Bai  
	 * @date 2019年2月26日
	 * @param queryInfo
	 * @return
	 */
	@RequestMapping(value="/batchDeleteEoImportJoabBox",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoImportJoabBoxModel>> batchDeleteEoImportJoabBox(@RequestBody List<Long> eoidIds){
		ResponseData<List<EoImportJoabBoxModel>> responseData = eoImportJoabBoxService.batchDeleteEoImportJoabBox(eoidIds);
		return responseData;
	}
	
	/**
	 * @deprecated:查询查验列表
	 * @author Colley.Bai  
	 * @date 2019年2月28日
	 * @param queryInfo
	 * @return
	 */
	@RequestMapping(value="/queryFreightImportByCondition",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryFreightImportByCondition(@RequestBody QueryInfo queryInfo){
		return eoFreightImportService.queryFreightImportByCondition(queryInfo);
	}
	
	/**
	 * @deprecated:保存换单基本信息+缴费基本信息+押箱基本信息
	 * @author Colley.Bai  
	 * @date 2019年3月2日
	 * @param eoFreightImportModelDto
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/saveEoFreightImportSingleAndPaymentAndContainer",method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoFreightImportModelDto> saveEoFreightImportSingleAndPaymentAndContainer(
			@RequestBody EoFreightImportModelDto eoFreightImportModelDto,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return eoFreightImportService.saveEoFreightImportSingleAndPaymentAndContainer(eoFreightImportModelDto);
	}
	
	/**
	 * @deprecated:站内跟踪列表
	 * @author Colley.Bai  
	 * @date 2019年3月7日
	 * @param queryInfo
	 * @return
	 */
	@RequestMapping(value="/queryFreightImportTrackByCondition",method = RequestMethod.POST)
	public ResponseData<QueryData> queryFreightImportTrackByCondition(@RequestBody QueryInfo queryInfo){
		return eoFreightImportService.queryFreightImportTrackByCondition(queryInfo);
	}
}
