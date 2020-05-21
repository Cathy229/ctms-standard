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
import com.sinotrans.oms.contract.dto.ElProtocolDto;
import com.sinotrans.oms.contract.dto.ElProtocolModelDto;
import com.sinotrans.oms.contract.model.ElProtocolCostConModel;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;
import com.sinotrans.oms.contract.model.ElProtocolCostModel;
import com.sinotrans.oms.contract.model.ElProtocolModel;
import com.sinotrans.oms.contract.service.ElProtocolCostConService;
import com.sinotrans.oms.contract.service.ElProtocolCostFeelService;
import com.sinotrans.oms.contract.service.ElProtocolCostService;
import com.sinotrans.oms.contract.service.ElProtocolService;

/**
 * <p>Description: 协议标准化服务的接口 </p>
 * @author Colley.Bai
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 20181121              Colley.Bai       	                    创建
 * </pre>
 */
@RestController
@RequestMapping(value="/elProtocolController")
public class ElProtocolController {
	
	@Autowired
	private ElProtocolService elProtocolService;//协议
	@Autowired
	private ElProtocolCostService elProtocolCostService;//协议明细
	@Autowired
	private ElProtocolCostConService elProtocolCostConService;//协议条件分类表
	@Autowired
	private ElProtocolCostFeelService elProtocolCostFeelService;//协议费用计算表
	
	/**
	 * @deprecated:通过固定的查询条件来获取协议信息的查询结果
	 * @author Colley.Bai  
	 * @date 2018年11月21日
	 * @param queryInfo
	 * @return
	 */
	@RequestMapping(value="/queryProtocolByCondition",  method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryProtocolByCondition(@RequestBody QueryInfo queryInfo){
		return elProtocolService.queryProtocolByCondition(queryInfo);
	}
	
	/**
	 * @deprecated:协议+协议设置（按照协议主键）
	 * @author Colley.Bai  
	 * @date 2018年11月21日
	 * @param elplId
	 * @return
	 */
	@RequestMapping(value="/getProtocolAndProtocolCostById",  method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<ElProtocolDto> getProtocolAndProtocolCostById(@RequestParam(value="elplId") Long elplId){
		return elProtocolService.getProtocolAndProtocolCostById(elplId);
	}
	
	/**
	 * @deprecated:保存协议基本信息
	 * @author Colley.Bai  
	 * @date 2018年11月21日
	 * @param elProtocolModelDto
	 * @return
	 */
	@RequestMapping(value="/saveProtocol",  method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<ElProtocolModel> saveProtocol(@RequestBody ElProtocolModelDto elProtocolModelDto, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return elProtocolService.saveProtocol(elProtocolModelDto);
	}
	
	
	/**
	 * @deprecated:批量保存协议明细
	 * @author Colley.Bai  
	 * @date 2018年11月21日
	 * @param elProtocolCostModelList
	 * @return
	 */
	@RequestMapping(value="/batchSaveProtocolCost",  method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<ElProtocolCostModel>> batchSaveProtocolCost(@RequestBody List<ElProtocolCostModel> elProtocolCostModelList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return elProtocolCostService.batchSaveProtocolCost(elProtocolCostModelList);
	}
	
	/**
	 * @deprecated:批量删除协议明细
	 * @author Colley.Bai  
	 * @date 2018年11月22日
	 * @param epctIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/batchDeleteProtocolCost",  method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<ElProtocolCostModel>> batchDeleteProtocolCost(@RequestBody List<Long> epctIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return elProtocolCostService.batchDeleteProtocolCost(epctIds);
	}
	
	/**
	 * @deprecated:批量保存协议条件分类
	 * @author Colley.Bai  
	 * @date 2018年11月21日
	 * @param elProtocolCostConModelList
	 * @return
	 */
	@RequestMapping(value="/batchSaveProtocolCostCon",  method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<ElProtocolCostConModel>> batchSaveProtocolCostCon(@RequestBody List<ElProtocolCostConModel> elProtocolCostConModelList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return elProtocolCostConService.batchSaveProtocolCostCon(elProtocolCostConModelList);
	}
	
	/**
	 * @deprecated:批量删除协议条件分类
	 * @author Colley.Bai  
	 * @date 2018年11月22日
	 * @param epccIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/batchDelteProtocolCostCon",  method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<ElProtocolCostConModel>> batchDelteProtocolCostCon(@RequestBody List<Long> epccIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return elProtocolCostConService.batchDelteProtocolCostCon(epccIds);
	}
	
	/**
	 * @deprecated:批量保存协议费用计算表
	 * @author Colley.Bai  
	 * @date 2018年11月21日
	 * @param elProtocolCostFeelModelList
	 * @return
	 */
	@RequestMapping(value="/batchSaveProtocolCostFeel",  method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<ElProtocolCostFeelModel>> batchSaveProtocolCostFeel(@RequestBody List<ElProtocolCostFeelModel> elProtocolCostFeelModelList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return elProtocolCostFeelService.batchSaveProtocolCostFeel(elProtocolCostFeelModelList);
	}
	
	/**
	 * @deprecated:批量删除协议费用计算表
	 * @author Colley.Bai  
	 * @date 2018年11月22日
	 * @param epcfIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/batchDeleteProtocolCostFeel",  method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<ElProtocolCostFeelModel>> batchDeleteProtocolCostFeel(@RequestBody List<Long> epcfIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return elProtocolCostFeelService.batchDeleteProtocolCostFeel(epcfIds);
	}
	
	/**
	 * @deprecated:根据协议明细获取协议条件分类
	 * @author Colley.Bai  
	 * @date 2018年11月22日
	 * @param epctId
	 * @return
	 */
	@RequestMapping(value="/getElProtocolCostConByEpctId",  method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<ElProtocolCostConModel>> getElProtocolCostConByEpctId(@RequestParam("epctId") Long epctId){
		return elProtocolCostConService.getElProtocolCostConByEpctId(epctId);
	}
	/**
	 * @deprecated:根据协议条件分类获取协议费用计算方式
	 * @author Colley.Bai  
	 * @date 2018年11月22日
	 * @param epccId
	 * @return
	 */
	@RequestMapping(value="/getElProtocolCostFeelByEpccId",  method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<ElProtocolCostFeelModel>> getElProtocolCostFeelByEpccId(@RequestParam("epccId") Long epccId){
		return elProtocolCostFeelService.getElProtocolCostFeelByEpccId(epccId);
	}
	/**
	 * @deprecated:根据协议明细获取协议费用计算方式
	 * @author Colley.Bai  
	 * @date 2019年4月30日
	 * @param epctId
	 * @return
	 */
	@RequestMapping(value="/getElProtocolCostFeelByEpctId",  method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<ElProtocolCostFeelModel>> getElProtocolCostFeelByEpctId(@RequestParam("epctId") Long epctId){
		return elProtocolCostFeelService.getElProtocolCostFeelByEpctId(epctId);
	}
	
	/**
	 * @deprecated:船公司配置
	 * @author Colley.Bai  
	 * @date 2019年5月6日
	 * @param queryInfo
	 * @return
	 */
	@RequestMapping(value="/queryProtocolCostConByCondition",  method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryProtocolCostConByCondition(@RequestBody QueryInfo queryInfo){
		return elProtocolCostConService.queryProtocolCostConByCondition(queryInfo);
	}
}
