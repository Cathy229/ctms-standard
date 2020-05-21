package com.sinotrans.oms.businessrequest.restcontroller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoDeclarationDeputeDto;
import com.sinotrans.oms.businessrequest.dto.EoRequestDeclarationDeputeModelDto;
import com.sinotrans.oms.businessrequest.dto.EoRequestGoodsDto;
import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoddModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EodmModel;
import com.sinotrans.oms.businessrequest.model.EoRequestDeclarationDeputeModel;
import com.sinotrans.oms.businessrequest.service.EoRequestDeclarationDeputeService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.aop.IgnoreLoginController;
import com.sinotrans.oms.common.base.ResponseData;

/**  
* Title: EoRequestDeclarationDeputeRestController  
* Description:  委托报关相关供外部调用接口
* @author Shoven.Jiang  
* @date 2018年10月15日  
* @version 1.0  
*/
@RestController
@RequestMapping(value="/rest/eoRequestDeclarationDeputeRestController")
public class EoRequestDeclarationDeputeRestController {

	@Autowired
	private EoRequestDeclarationDeputeService eoRequestDeclarationDeputeService;

	
	/**
	 *  委托报关保存
	 */
	@RequestMapping(value="/saveDeclarationDepute",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoRequestDeclarationDeputeModel> saveDeclarationDepute(@RequestBody EoRequestDeclarationDeputeModelDto eoRequestDeclarationDeputeModelDto){
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		//调用service层处理业务逻辑
		ResponseData responseData = eoRequestDeclarationDeputeService.saveDeclarationDepute(eoRequestDeclarationDeputeModelDto);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 报关货物保存
	 */
	@RequestMapping(value="/saveDeclarationDeputeMaterial",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoEoom2EodmModel>> saveDeclarationDeputeMaterial(@RequestBody List<EoEoom2EodmModel> eoEoom2EodmModelList){
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		//调用service层处理业务逻辑
		ResponseData responseData = eoRequestDeclarationDeputeService.saveDeclarationDeputeMaterial(eoEoom2EodmModelList);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 报关集装箱保存
	 */
	@RequestMapping(value="/saveDeclarationDeputeContainer",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoEooc2EoddModel>> saveDeclarationDeputeContainer(@RequestBody List<EoEooc2EoddModel> eoEooc2EoddModelList){
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		//调用service层处理业务逻辑
		ResponseData responseData = eoRequestDeclarationDeputeService.saveDeclarationDeputeContainer(eoEooc2EoddModelList);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 报关随附单据保存
	 */
	@RequestMapping(value="/saveDeclarationDeputeBill",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoEoddBillModel>> saveDeclarationDeputeBill(@RequestBody List<EoEoddBillModel> eoEoddBillModelList){
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		//调用service层处理业务逻辑
		ResponseData responseData = eoRequestDeclarationDeputeService.saveDeclarationDeputeBill(eoEoddBillModelList);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 *  报关任务+报关货物查询+报关集装箱+报关随附单据（按照报关主键）+报关反馈信息
	 */
	@RequestMapping(value="/saveDeclarationDeputeAndMaterial",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoDeclarationDeputeDto> saveDeclarationDeputeAndMaterial(@RequestBody EoDeclarationDeputeDto eoDeclarationDeputeDto){
		IgnoreLoginController.ignoreLogin();// 忽略登陆
		//调用service层处理业务逻辑
		ResponseData responseData = eoRequestDeclarationDeputeService.saveDeclarationDeputeAndMaterial(eoDeclarationDeputeDto);
		IgnoreLoginController.cancelIgnore();// 退出虚拟登录
		return responseData;
	}
	/**
	 * 报关请求下达
	 * @param eoetIds
	 * @return
	 * @author colley
	 */
	@RequestMapping(value="/issuedDeclarationDepute",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData issuedDeclarationDepute(@RequestBody Long[] eoddIds){
		return eoRequestDeclarationDeputeService.issuedDeclarationDepute(eoddIds);	
	}
	/**
	 * 
	 * @date 2018年8月11日 上午11:07:49  
	 * @author Richard 
	 * Description:报关任务+报关货物查询+报关集装箱+报关随附单据（按照报关主键）
	 * @param eoddId
	 * @return
	 */
	@RequestMapping(value="/getDeclarationDeputeAndMaterialById",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoDeclarationDeputeDto> getDeclarationDeputeAndMaterialById(@RequestBody Long eoddId){
		return eoRequestDeclarationDeputeService.getDeclarationDeputeAndMaterialById(eoddId);
	}
	/**
	 * 
	 * @date 2018年8月11日 上午9:26:49  
	 * @author Richard 
	 * Description:报关列表查询（按条件查询）
	 * @param condition
	 * @return
	 */
	@RequestMapping(value="/queryDeclarationDeputeByCondition",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<QueryData> queryDeclarationDeputeByCondition (@RequestBody QueryInfo queryInfo){
		return eoRequestDeclarationDeputeService.queryDeclarationDeputeByCondition(queryInfo);
	}
	/**
	 * @deprecated:根据商品名称或编码请求报关服务和历史申报商品
	 * @author Colley.Bai  
	 * @date 2018年9月18日 下午4:46:56
	 * @param goodsCode
	 * @param goodsName
	 * @param paramType
	 * @return
	 */
	@RequestMapping(value="/getDeclareRequestGoodsInfo",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoRequestGoodsDto>> getDeclareRequestGoodsInfo(@RequestBody Map<String,Object> paramMap){
		return eoRequestDeclarationDeputeService.getDeclareRequestGoodsInfo(paramMap);
	}
}
