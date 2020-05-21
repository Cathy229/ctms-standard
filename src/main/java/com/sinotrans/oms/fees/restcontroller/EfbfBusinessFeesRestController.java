package com.sinotrans.oms.fees.restcontroller;

import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.aop.IgnoreLoginController;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.dto.RequestBodyDto;
import com.sinotrans.oms.fees.dto.EfBmsImModelDto;
import com.sinotrans.oms.fees.model.EfBusinessFeesModel;
import com.sinotrans.oms.fees.service.EfbfBusinessFeesService;
import com.sinotrans.oms.fees.service.efBusinessFeesSettlementService;

/**  
* Description:  费用相关供外部调用接口
* @author Shoven.Jiang  
* @date 2018年10月15日  
* @version 1.0  
*/
@RestController
@RequestMapping(value = "/rest/efbfBusinessFeesRestController")
public class EfbfBusinessFeesRestController {

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
	public ResponseData<List<EfBusinessFeesModel>> batchSaveBusinessFees(@RequestBody List<EfBusinessFeesModel> EfBusinessFeesModelList) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData<List<EfBusinessFeesModel>> responseData = this.efbfBusinessFeesService.batchSaveBusinessFees(EfBusinessFeesModelList);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
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
	public ResponseData<List<EfBusinessFeesModel>>  deleteBusinessFees(@RequestBody Long efbfId){
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<List<EfBusinessFeesModel>>();
		responseData = this.efbfBusinessFeesService.deleteBusinessFees(efbfId);
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
	public ResponseData batchDeteleBusinessFees(@RequestBody Collection<Long> efbfIds) {
		ResponseData responseData = new ResponseData();
		responseData = this.efbfBusinessFeesService.batchDeteleBusinessFees(efbfIds);
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
	@RequestMapping(value = "/getBusinessFeesByEoorId", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EfBusinessFeesModel>> getBusinessFeesByEoorId(@RequestBody RequestBodyDto requestBodyDto) {
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
				responseData = this.efbfBusinessFeesService.getBusinessFeesByEoorId(requestBodyDto.getEoorId(), requestBodyDto.getEfbfType());
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
	public ResponseData<EfBusinessFeesModel> confirmBusinessFees(@RequestBody Long efbfIds ){
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData<EfBusinessFeesModel> responseData = new ResponseData<>();
		responseData = this.efbfBusinessFeesService.confirmBusinessFees(efbfIds);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
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
	@RequestMapping(value = "/batchConfirmBusinessFees", method =  RequestMethod.POST , produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EfBusinessFeesModel>> batchConfirmBusinessFees(@RequestBody Collection<Long> efbfIds ) {
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		responseData = this.efbfBusinessFeesService.batchConfirmBusinessFees(efbfIds);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
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
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData<EfBusinessFeesModel> responseData = new ResponseData<>();
		responseData = this.efbfBusinessFeesService.cancelConfirmBusinessFees(efbfIds);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
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
	@RequestMapping(value = "/batchCancelConfirmBusinessFees", method =  RequestMethod.POST , produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EfBusinessFeesModel>> batchCancelConfirmBusinessFees(@RequestBody Collection<Long> efbfIds ) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		responseData = this.efbfBusinessFeesService.batchCancelConfirmBusinessFees(efbfIds);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
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
	@RequestMapping(value = "/submitSettlementSheet", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EfBusinessFeesModel>> submitSettlementSheet(@RequestBody RequestBodyDto requestBodyDto) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData<List<EfBusinessFeesModel>> responseData = new ResponseData<>();
		responseData = this.efbfBusinessFeesService.submitSettlementSheet(requestBodyDto.getEfbfId(), requestBodyDto.getEfbfType());
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
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
	@RequestMapping(value = "/uploadCashSettlement", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	ResponseData uploadCashSettlement(@RequestBody RequestBodyDto requestBodyDto) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData responseData = new ResponseData();
		responseData = this.efbfBusinessFeesService.uploadCashSettlement(requestBodyDto.getEfbfIds(), requestBodyDto.getEoorId());
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
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
	@RequestMapping(value = "/getStatisticalValueByBusinessType", method = RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EfBmsImModelDto> getStatisticalValueByBusinessType(@RequestBody Long eoorId, @RequestBody String businessType) {
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
	public ResponseData upLoadToBms(@RequestBody EfBmsImModelDto efBmsImModelDto) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData response = new ResponseData();
		response = this.EfBusinessFeesSettlementService.upLoadToBms(efBmsImModelDto);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return response;
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
	public ResponseData upLoadAllToBms(@RequestBody Long[] eoorIds) {
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		ResponseData responseData = new ResponseData<>();
		responseData = this.efbfBusinessFeesService.upLoadAllToBms(eoorIds);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
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
	@RequestMapping(value = "/queryBusinessFeesByCondition", method =  RequestMethod.POST , produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryBusinessFeesByCondition(@RequestBody QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<QueryData>();
		responseData = this.efbfBusinessFeesService.queryOrderByCondition(queryInfo);
		return responseData;
	}
}
