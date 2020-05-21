package com.sinotrans.oms.fees.controller;

import java.util.Collection;
import java.util.List;
import java.util.Map;

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
import com.sinotrans.oms.eoorder.dto.EoOrderDto;
import com.sinotrans.oms.fees.dto.EfBmsImModelDto;
import com.sinotrans.oms.fees.dto.EfBusinessFeesForCalcuteDto;
import com.sinotrans.oms.fees.model.EbFeeHeadModel;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;
import com.sinotrans.oms.fees.service.EfbfBusinessFeesService;
import com.sinotrans.oms.fees.service.efBusinessFeesSettlementService;

/**
 * 
* @ClassName: EfbfBusinessFeesController
* @Description: 费用信息表
* @author Simon
* @date 2018年8月8日下午10:17:14
*
 */
@RestController
@RequestMapping(value = "/efbfBusinessFeesController")
public class EfbfBusinessFeesController {
	@Autowired
	private EfbfBusinessFeesService efbfBusinessFeesService;
	@Autowired
	private efBusinessFeesSettlementService EfBusinessFeesSettlementService;//费用上传通用实现类
	
	/**	
	 * url:efbfBusinessFeesController/saveEfbfBusinessFees
	 * @date 2018年8月8日 下午10:20:02  
	 * @author simon 
	 * Description:应付及应收信息费用信息
	 * @param json
	 * @return
	 */
	@RequestMapping(value = "/batchSaveBusinessFees", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EfBusinessFeesModel>> batchSaveBusinessFees(@RequestBody List<EfBusinessFeesModel> EfBusinessFeesModelList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<List<EfBusinessFeesModel>> responseData = this.efbfBusinessFeesService.batchSaveBusinessFees(EfBusinessFeesModelList);
		return responseData;
	}
	/**
	 * 
	 * @DATE 2018年8月28日 下午6:47:27
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:订单费用批量删除(应收应付代收代付)
	 * @param efbfIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/batchDeteleBusinessFees", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData batchDeteleBusinessFees(@RequestBody Collection<Long> efbfIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = new ResponseData();
		responseData = this.efbfBusinessFeesService.batchDeteleBusinessFees(efbfIds);
		return responseData;
	}
	/**
	 * @deprecated:订单费用删除
	 * @author Colley.Bai  
	 * @date 2018年10月22日 下午3:23:23
	 * @param efbfId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/deleteBusinessFees", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EfBusinessFeesModel>>  deleteBusinessFees(@RequestBody Long efbfId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<List<EfBusinessFeesModel>>();
		responseData = this.efbfBusinessFeesService.deleteBusinessFees(efbfId);
		return responseData;
	}
	/**
	 * @date 2018年8月22日 下午5:11:08  
	 * @author simon 
	 * @description:--校验订单费用是否开票
	 * @param eoorId
	 * @param eoorIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/checkFeesInvoice",method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData checkFeesInvoice(@RequestParam(value="eoorId")Long eoorId, @RequestBody List<Long> eoorIds,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData responseData = this.efbfBusinessFeesService.checkFeesInvoice(eoorId,eoorIds);
		return responseData;
		
	}
	/**
	 * 
	 * @date 2018年8月22日 下午5:11:08  
	 * @author simon 
	 * @description:--费用变更
	 * @param efBusinessFeesModelList
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/changeEfbfBusinessFees",method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EfBusinessFeesModel>> changeEfbfBusinessFees(@RequestBody List<EfBusinessFeesModel> efBusinessFeesModelList,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<List<EfBusinessFeesModel>> responseData = this.efbfBusinessFeesService.changeEfbfBusinessFees(efBusinessFeesModelList);
		return responseData;
	}
	/**
	 * 
	 * @date 2018年8月22日 下午5:11:08  
	 * @author simon 
	 * @description:--查询费目列表
	 * @param ebfhId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/getFeeHeadById",method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<EbFeeHeadModel> getFeeHeadById(@RequestParam Long ebfhId,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<EbFeeHeadModel> responseData = this.efbfBusinessFeesService.getFeeHeadById(ebfhId);
		return responseData;
	}
	
	/**
	 * 
	 * @date 2018年9月15日14:09:20  
	 * @author simon 
	 * @description:--通过固定的查询条件来获取费用的查询结果
	 * @param queryInfo
	 * @return
	 */
	@RequestMapping(value = "/queryOrderByCondition", method = {RequestMethod.GET, RequestMethod.POST }, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryOrderByCondition(@RequestBody QueryInfo queryInfo,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		responseData = this.efbfBusinessFeesService.queryOrderByCondition(queryInfo);
		return responseData;
	}
	
	/**
	 * 费用批量取消确认
	 * @author Shoven.Jiang  
	 * @date 2018年9月29日
	 * @param efbfIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/batchCancelConfirmBusinessFees", method = {RequestMethod.GET, RequestMethod.POST }, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EfBusinessFeesModel>> batchCancelConfirmBusinessFees(@RequestBody Collection<Long> efbfIds ,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		responseData = this.efbfBusinessFeesService.batchCancelConfirmBusinessFees(efbfIds);
		return responseData;
	}
	
	/**
	 * 费用批量确认
	 * @author Shoven.Jiang  
	 * @date 2018年9月29日
	 * @param efbfIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/batchConfirmBusinessFees", method = {RequestMethod.GET, RequestMethod.POST }, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EfBusinessFeesModel>> batchConfirmBusinessFees(@RequestBody Collection<Long> efbfIds ,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		responseData = this.efbfBusinessFeesService.batchConfirmBusinessFees(efbfIds);
		return responseData;
	}
	

	/**
	 * 根据订单id以及费用类型来查询该订单下的费用
	 * @author Shoven.Jiang  
	 * @date 2018年10月9日
	 * @param eoorId  订单id
	 * @param type :R  应收   P：应付   RP：代收代付   N：忽略费用类型的，查询出该订单下所有的费用
	 * @return
	 */
	@RequestMapping(value = "/getBusinessFeesByEoorId", method = {RequestMethod.POST, RequestMethod.GET}, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EfBusinessFeesModel>> getBusinessFeesByEoorId(@RequestParam(value = "eoorId") Long eoorId, @RequestParam(value = "efbfType") String efbfType, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		responseData = this.efbfBusinessFeesService.getBusinessFeesByEoorId(eoorId, efbfType);
		return responseData;
	}
	
	/**
	 * 根据费用主键集合以及费用类型提交结算单
	 * @author Shoven.Jiang  
	 * @date 2018年10月9日
	 * @param efbfIds  订单费用主键ids
	 * @param efbfType :R  应收   P：应付   RP：代收代付
	 * @return
	 */
	@RequestMapping(value = "/submitSettlementSheet", method = {RequestMethod.POST, RequestMethod.GET}, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EfBusinessFeesModel>> submitSettlementSheet(@RequestBody Collection<Long> efbfIds, @RequestParam(value = "efbfType") String efbfType, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		responseData = this.efbfBusinessFeesService.submitSettlementSheet(efbfIds, efbfType);
		return responseData;
	}
	/**
	 * 
	 * @description 获取费用中的收支配比情况（人民币  美元  ）
	 * @author Simon.Guo  
	 * @date 2018年10月10日下午3:47:39
	 * @param eoorId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/getSettlementFeesSumInfo", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	ResponseData<EfBusinessFeesForCalcuteDto> getSettlementFeesSumInfo(@RequestParam(value = "eoorId")Long eoorId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return this.efbfBusinessFeesService.getSettlementFeesSumInfo(eoorId);
	}
	
	/**
	 * 通过eoorId获取该条订单下的信息
	 * add by shoven 2018年8月5日10:55:39
	 * @param eoOrderDto
	 * @return
	 */
	@RequestMapping(value = "/getOrderFeeByEoorId", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> getOrderFeeByEoorId (@RequestParam(value = "eoorId") Long eoorId) {
		//调用service层处理业务逻辑
		@SuppressWarnings("unchecked")
		ResponseData<EoOrderDto> responseData = this.efbfBusinessFeesService.getOrderFeeByEoorId(eoorId);
		return responseData;
	}

	/**
	 * 费用上传bms---现结上传
	 * @author Shoven.Jiang  
	 * @date 2018年10月11日
	 * @param efbfIds  费用ids
	 * @param eoorId   订单id
	 * @return
	 */
	@RequestMapping(value = "/uploadCashSettlement", method = {RequestMethod.POST, RequestMethod.GET}, produces = Constants.PRODUCES_CODE)
	ResponseData uploadCashSettlement(@RequestBody Long [] efbfIds, @RequestParam(value = "eoorId")Long eoorId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = new ResponseData();
		responseData = this.efbfBusinessFeesService.uploadCashSettlement(efbfIds, eoorId);
		return responseData;
	}
	/**
	 * 费用取消确认
	 * add by Colley.Bai 2018年10月22日 下午03:36:24
	 * @param efbfIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/cancelConfirmBusinessFees", method = RequestMethod.POST , produces = Constants.PRODUCES_CODE)
	public ResponseData<EfBusinessFeesModel> cancelConfirmBusinessFees(@RequestBody Long efbfIds ){
		ResponseData<EfBusinessFeesModel> responseData = new ResponseData<>();
		responseData = this.efbfBusinessFeesService.cancelConfirmBusinessFees(efbfIds);
		return responseData;
	}
	/**
	 * 费用确认
	 * add by Colley.Bai 2018年10月22日 下午03:48:24
	 * @param efbfIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/confirmBusinessFees", method =  RequestMethod.POST , produces = Constants.PRODUCES_CODE)
	public ResponseData<EfBusinessFeesModel> confirmBusinessFees(@RequestBody Long efbfIds ,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		ResponseData<EfBusinessFeesModel> responseData = new ResponseData<>();
		responseData = this.efbfBusinessFeesService.confirmBusinessFees(efbfIds);
		return responseData;
	}
	
	/**
	 * 费用全部结算上传
	 * @author Shoven.Jiang  
	 * @date 2018年10月24日
	 * @param eoorIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/upLoadAllToBms", method =  RequestMethod.POST , produces = Constants.PRODUCES_CODE)
	public ResponseData upLoadAllToBms(@RequestBody Long[] eoorIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = new ResponseData<>();
		responseData = this.efbfBusinessFeesService.upLoadAllToBms(eoorIds);
		return responseData;
	}
	
//	14	按照业务类型获取统计值（结算上传前渲染界面）	getStatisticalValueByBusinessType(Long eoorId, String businessType)
	//TODO 修改名称
	/**
	 * 统计值界面数据收集
	 * @author Shoven.Jiang  
	 * @date 2018年9月11日
	 * @param eoorId
	 * @param businessType
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/getStatisticalValueByBusinessType", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<EfBmsImModelDto> getStatisticalValueByBusinessType(@RequestParam(value="eoorId") Long eoorId, @RequestParam(value="businessType") String businessType, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<EfBmsImModelDto> responseData = new ResponseData<EfBmsImModelDto>();
		EfBmsImModelDto efBmsImModelDto = this.EfBusinessFeesSettlementService.generateEntity(eoorId, businessType);
		responseData.setData(efBmsImModelDto);
		responseData.setCode(Constants.YES);
		responseData.setMsg("统计值已成功收集");
		return responseData;
	}
//	15	结算上传(统计值界面点击确认)	upLoadToBms(EfBmsImModelDto efBmsImModelDto)
	/**
	 * 统计值界面点击确认收集统计值信息上传到bms
	 * @author Shoven.Jiang  
	 * @date 2018年9月13日
	 * @param params
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/upLoadToBms",method =RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData upLoadToBms(@RequestBody EfBmsImModelDto efBmsImModelDto, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData response = new ResponseData();
		response = this.EfBusinessFeesSettlementService.upLoadToBms(efBmsImModelDto);
		return response;
	}
	
	/**
	 * 
	 * @DATE 2018年8月28日 下午6:47:27
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:订单费用批量删除(应收应付代收代付)
	 * @param efbfIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/copyEfbfListRep", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData copyEfbfListRep(@RequestBody Collection<Long> efbfIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData responseData = new ResponseData();
		responseData = this.efbfBusinessFeesService.copyEfbfListRep(efbfIds);
		return responseData;
	}
	
	/**
	 * 
	 * @date 2018年9月15日14:09:20  
	 * @author simon 
	 * @description:--通过固定的查询条件来获取费用的查询结果
	 * @param queryInfo
	 * @return
	 */
	@RequestMapping(value = "/queryBusinessFeesByCondition", method = {RequestMethod.GET, RequestMethod.POST }, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryBusinessFeesByCondition(@RequestBody QueryInfo queryInfo,@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		responseData = this.efbfBusinessFeesService.queryOrderByCondition(queryInfo);
		return responseData;
	}
	
	/**
	 * 子公司费用提交给总公司，总部代开票
	 * @author Shoven.Jiang  
	 * @date 2018年12月1日
	 * @param eoorId
	 * @return
	 */
	@RequestMapping(value = "/substituteTicketFeesByHeadquarters", method = {RequestMethod.GET, RequestMethod.POST }, produces = Constants.PRODUCES_CODE)
	public ResponseData substituteTicketFeesByHeadquarters(@RequestBody List<Long> eoorIds) {
		
		return this.efbfBusinessFeesService.substituteTicketFeesByHeadquarters(eoorIds);
	}
	
	/**
	 * @deprecated:复制订单费用
	 * @author Colley.Bai  
	 * @date 2019年4月11日
	 * @param eoOrderDto
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/copyEoOrderEfbfFeeByEoorId", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoOrderDto> copyEoOrderEfbfFeeByEoorId(@RequestBody EoOrderDto eoOrderDto,  @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return  this.efbfBusinessFeesService.copyEoOrderEfbfFeeByEoorId(eoOrderDto);
	}
	
	/**
	 * @deprecated:根据项目自动计费
	 * @author Colley.Bai  
	 * @date 2019年4月30日
	 * @param eoorIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value = "/saveAutomaticChargingFeesByEoorIds", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EfBusinessFeesModel>> saveAutomaticChargingFeesByEoorIds(@RequestBody Long[] eoorIds,
			@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME)  String accessToken){
		return  this.efbfBusinessFeesService.saveAutomaticChargingFeesByEoorIds(eoorIds);
	}
	
}
