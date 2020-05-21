package com.sinotrans.oms.businessrequest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinotrans.oms.businessrequest.dto.EoRequestInspectionDto;
import com.sinotrans.oms.businessrequest.model.EoEorn2EonmModel;
import com.sinotrans.oms.businessrequest.model.EoInspCertificateModel;
import com.sinotrans.oms.businessrequest.model.EoRequestInspectionModel;
import com.sinotrans.oms.businessrequest.service.EoEorn2EonmService;
import com.sinotrans.oms.businessrequest.service.EoInspCertificateService;
import com.sinotrans.oms.businessrequest.service.EoRequestInspectionService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;

/**
 * 
* @ClassName: EoRequestInspectionController
* @Description: 报检标准化服务
* @author Colley.Bai
* @date 2019年2月21日
*
 */
@RestController
@RequestMapping(value="/eoRequestInspectionController")
public class EoRequestInspectionController {

	@Autowired
	private EoRequestInspectionService eoRequestInspectionService;
	
	@Autowired
	private EoInspCertificateService eoInspCertificateService;
	
	@Autowired
	private EoEorn2EonmService eoEorn2EonmService;
	
	/**
	 * @deprecated:报检基本信息+随附单据+需要单据名称+货物信息（保存）
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @return
	 */
	@RequestMapping(value = "/saveRequestInspectionAndCertificateAndEonm", method =  RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoRequestInspectionDto> saveRequestInspectionAndCertificateAndEonm(@RequestBody EoRequestInspectionDto eoRequestInspectionDto, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<EoRequestInspectionDto> responseData = new ResponseData<EoRequestInspectionDto>();
		responseData = eoRequestInspectionService.saveRequestInspectionAndCertificateAndEonm(eoRequestInspectionDto);
		return responseData;
	}
	
	/**
	 * @deprecated:保存报检基本信息
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eoRequestInspectionModel
	 * @return
	 */
	@RequestMapping(value = "/saveRequestInspection", method =  RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoRequestInspectionModel> saveRequestInspection(@RequestBody EoRequestInspectionModel eoRequestInspectionModel, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<EoRequestInspectionModel> responseData = new ResponseData<EoRequestInspectionModel>();
		responseData = eoRequestInspectionService.saveRequestInspection(eoRequestInspectionModel);
		return responseData;

	}
	
	/**
	 * @deprecated:批量删除报检
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eornIds
	 * @return
	 */
	@RequestMapping(value = "/batchDeleteRequestInspection", method =  RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoRequestInspectionModel>> batchDeleteRequestInspection(@RequestBody List<Long> eornIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<List<EoRequestInspectionModel>> responseData = new ResponseData<List<EoRequestInspectionModel>>();
		responseData = eoRequestInspectionService.batchDeleteRequestInspection(eornIds);
		return responseData;
		
	}
	
	/**
	 * @deprecated:保存单据信息
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eoInspCertificateModel
	 * @return
	 */
	@RequestMapping(value = "/saveInspCertificate", method =  RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoInspCertificateModel> saveInspCertificate(@RequestBody EoInspCertificateModel eoInspCertificateModel, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<EoInspCertificateModel> responseData = new ResponseData<>();
		responseData = eoInspCertificateService.saveInspCertificate(eoInspCertificateModel);
		return responseData;
	}
	
	/**
	 * @deprecated:批量保存单据信息
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eoInspCertificateModelList
	 * @return
	 */
	@RequestMapping(value = "/batchSaveInspCertificate", method =  RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoInspCertificateModel>> batchSaveInspCertificate(@RequestBody List<EoInspCertificateModel> eoInspCertificateModelList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<List<EoInspCertificateModel>> responseData = new ResponseData<>();
		responseData = eoInspCertificateService.batchSaveInspCertificate(eoInspCertificateModelList);
		return responseData;
		
	}
	
	/**
	 * @deprecated:批量删除单据信息
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eoncIds
	 * @return
	 */
	@RequestMapping(value = "/batchDeleteInspCertificate", method =  RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoInspCertificateModel>> batchDeleteInspCertificate(@RequestBody List<Long> eoncIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<List<EoInspCertificateModel>> responseData = new ResponseData<>();
		responseData = eoInspCertificateService.batchDeleteInspCertificate(eoncIds);
		return responseData;
	}
	
	/**
	 * @deprecated:保存货物信息
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eoEorn2EonmModel
	 * @return
	 */
	@RequestMapping(value = "/saveEoEorn2Eonm", method =  RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoEorn2EonmModel> saveEoEorn2Eonm(@RequestBody EoEorn2EonmModel eoEorn2EonmModel, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<EoEorn2EonmModel> responseData = new ResponseData<>();
		responseData = eoEorn2EonmService.saveEoEorn2Eonm(eoEorn2EonmModel);
		return responseData;
	}
	
	/**
	 * @deprecated:批量保存货物信息
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eoEorn2EonmModelList
	 * @return
	 */
	@RequestMapping(value = "/batchSaveEoEorn2Eonm", method =  RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoEorn2EonmModel>> batchSaveEoEorn2Eonm(@RequestBody List<EoEorn2EonmModel> eoEorn2EonmModelList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<List<EoEorn2EonmModel>> responseData = new ResponseData<>();
		responseData = eoEorn2EonmService.batchSaveEoEorn2Eonm(eoEorn2EonmModelList);
		return responseData;
	}
	
	/**
	 * @deprecated:批量删除货物信息
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @param eonmIds
	 * @return
	 */
	@RequestMapping(value = "/batchDeleteEoEorn2Eonm", method =  RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoEorn2EonmModel>> batchDeleteEoEorn2Eonm(@RequestBody List<Long> eonmIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<List<EoEorn2EonmModel>> responseData = new ResponseData<>();
		responseData = eoEorn2EonmService.batchDeleteEoEorn2Eonm(eonmIds);
		return responseData;
	}
	
	/**
	 * @deprecated:报检基本信息+随附单据+需要单据名称+货物信息（查询订单维度）
	 * @author Colley.Bai  
	 * @date 2019年2月21日
	 * @return
	 */
	@RequestMapping(value = "/getRequestInspectionAndCertificateAndEonmByEoordId", method =  RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoRequestInspectionDto> getRequestInspectionAndCertificateAndEonmByEoordId(@RequestParam(value="eoorId") Long eoorId){
		ResponseData<EoRequestInspectionDto> responseData = new ResponseData<>();
		responseData = eoRequestInspectionService.getRequestInspectionAndCertificateAndEonmByEoordId(eoorId);
		return responseData;
	}
	
	/**
	 * @deprecated:报检基本信息+随附单据+需要单据名称+货物信息（任务维度）
	 * @author Colley.Bai  
	 * @date 2019年2月22日
	 * @param eornId
	 * @return
	 */
	@RequestMapping(value = "/getRequestInspectionAndCertificateAndEonmById", method =  RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoRequestInspectionDto> getRequestInspectionAndCertificateAndEonmById(@RequestParam(value="eornId") Long eornId){
		ResponseData<EoRequestInspectionDto> responseData = new ResponseData<>();
		responseData = eoRequestInspectionService.getRequestInspectionAndCertificateAndEonmById(eornId);
		return responseData;
	}
	
}
