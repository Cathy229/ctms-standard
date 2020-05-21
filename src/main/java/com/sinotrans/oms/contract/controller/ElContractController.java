package com.sinotrans.oms.contract.controller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.contract.dto.ElContractConfigModelDto;
import com.sinotrans.oms.contract.dto.ElContractDto;
import com.sinotrans.oms.contract.dto.ElContractModelDto;
import com.sinotrans.oms.contract.model.ElContractConfigModel;
import com.sinotrans.oms.contract.model.ElContractGreatClausesModel;
import com.sinotrans.oms.contract.model.ElContractModel;
import com.sinotrans.oms.contract.service.ElContractConfigService;
import com.sinotrans.oms.contract.service.ElContractGreatClausesService;
import com.sinotrans.oms.contract.service.ElContractService;

/**
 * <p>Description: 合同标准化服务的接口 </p>
 * @author Colley.Bai
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 20181120              Colley.Bai       	                    创建
 * </pre>
 */
@RestController
@RequestMapping(value="/elContractController")
public class ElContractController {
	
	@Autowired
	private ElContractService elContractService; 
	@Autowired
	private ElContractConfigService elContractConfigService; 
	@Autowired
	private ElContractGreatClausesService elContractGreatClausesService;
	/**
	 * @deprecated:通过固定的查询条件来获取合同信息的查询结果
	 * @author Colley.Bai  
	 * @date 2018年11月20日
	 * @param queryInfo
	 * @return
	 */
	@RequestMapping(value = "/queryContractByCondition",  method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryContractByCondition(@RequestBody QueryInfo queryInfo){
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		responseData = this.elContractService.queryContractByCondition(queryInfo);
		return responseData;
	}
	/**
	 * @deprecated:合同+接单设置（按照合同主键）
	 * @author Colley.Bai  
	 * @date 2018年11月20日
	 * @param elctId
	 * @return
	 */
	@RequestMapping(value = "/getContractAndContractConfigById",  method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<ElContractDto> getContractAndContractConfigById(@RequestParam(value="elctId") Long elctId){
		return this.elContractService.getContractAndContractConfigById(elctId);
	}
	
	/**
	 * @deprecated:合同基本信息保存
	 * @author Colley.Bai  
	 * @date 2018年11月20日
	 * @param elContractModelDto
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/saveContract",  method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<ElContractModel> saveContract(@RequestBody ElContractModelDto elContractModelDto, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return this.elContractService.saveContract(elContractModelDto);
	}
	
	/**
	 * @deprecated:接单设置基本信息保存
	 * @author Colley.Bai  
	 * @date 2018年11月20日
	 * @param elContractConfigModelDto
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/saveContractConfig",  method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<ElContractConfigModel>> saveContractConfig(@RequestBody List<ElContractConfigModel> elContractConfigModelList,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return elContractConfigService.saveContractConfig(elContractConfigModelList);
	}
	
	/**
	 * @deprecated:批量删除接单设置
	 * @author Colley.Bai  
	 * @date 2018年11月20日
	 * @param eoejIds
	 * @return
	 */
	@RequestMapping(value = "/batchDeleteContractConfig",  method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<ElContractConfigModel>> batchDeleteContractConfig(@RequestBody List<Long> elccIds,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return elContractConfigService.batchDeleteContractConfig(elccIds);
	}
	
	/**
	 * @deprecated:批量保存合同
	 * @author Colley.Bai  
	 * @date 2018年11月26日
	 * @param elContractModelList
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/batchSaveElctContract",  method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<ElContractModel>> batchSaveElctContract(@RequestBody List<ElContractModel> elContractModelList,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return elContractService.batchSaveElctContract(elContractModelList);
	}
	
	/**
	 * @deprecated:批量保存重要条款
	 * @author Colley.Bai  
	 * @date 2019年3月19日
	 * @param elContractGreatClausesModelList
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/batchSaveContractGreatClauses",  method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<ElContractGreatClausesModel>> batchSaveContractGreatClauses(@RequestBody List<ElContractGreatClausesModel> elContractGreatClausesModelList,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return this.elContractGreatClausesService.batchSaveContractGreatClauses(elContractGreatClausesModelList);
	}
	
	/**
	 * @deprecated:批量删除重要条款
	 * @author Colley.Bai  
	 * @date 2019年3月19日
	 * @param ecgcIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/batchDeleteContractGreatClauses",  method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<ElContractGreatClausesModel>> batchDeleteContractGreatClauses(@RequestBody List<Long> ecgcIds,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return this.elContractGreatClausesService.batchDeleteContractGreatClauses(ecgcIds);
	}
}
