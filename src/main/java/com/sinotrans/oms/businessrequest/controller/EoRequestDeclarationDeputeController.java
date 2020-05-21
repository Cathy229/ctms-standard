package com.sinotrans.oms.businessrequest.controller;

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
import com.sinotrans.oms.businessrequest.dto.EoDeclarationDeputeDto;
import com.sinotrans.oms.businessrequest.dto.EoRequestDeclarationDeputeModelDto;
import com.sinotrans.oms.businessrequest.dto.EoRequestGoodsDto;
import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoddModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EodmModel;
import com.sinotrans.oms.businessrequest.model.EoRequestDeclarationDeputeModel;
import com.sinotrans.oms.businessrequest.service.EoEoddBillService;
import com.sinotrans.oms.businessrequest.service.EoEooc2EoddService;
import com.sinotrans.oms.businessrequest.service.EoEoom2EodmService;
import com.sinotrans.oms.businessrequest.service.EoRequestDeclarationDeputeService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;
/**
 * 
 * 
 * <p>Description: 委托报关请求服务
 *    
 * </p>
 *
 * @author Richard
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 2018年8月8日下午6:36:26   Richard       	               创建
 * 
 * 
 * </pre>
 */
@RestController
@RequestMapping(value="/eoRequestDeclarationDeputeController")
public class EoRequestDeclarationDeputeController {
	
	
	@Autowired
	private EoRequestDeclarationDeputeService eoRequestDeclarationDeputeService;
	@Autowired
	private EoEoom2EodmService eoEoom2EodmService;
	@Autowired
	private EoEooc2EoddService eoEooc2EoddService;
	@Autowired
	private EoEoddBillService eoEoddBillService;
	
	/**
	 *  委托报关保存
	 */
	@RequestMapping(value="/saveDeclarationDepute",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoRequestDeclarationDeputeModel> saveDeclarationDepute(@RequestBody EoRequestDeclarationDeputeModelDto eoRequestDeclarationDeputeModelDto, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoRequestDeclarationDeputeService.saveDeclarationDepute(eoRequestDeclarationDeputeModelDto);
	}
	/**
	 *  报关任务+报关货物查询+报关集装箱+报关随附单据（按照报关主键）+报关反馈信息
	 */
	@RequestMapping(value="/saveDeclarationDeputeAndMaterial",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoDeclarationDeputeDto> saveDeclarationDeputeAndMaterial(@RequestBody EoDeclarationDeputeDto eoDeclarationDeputeDto, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoRequestDeclarationDeputeService.saveDeclarationDeputeAndMaterial(eoDeclarationDeputeDto);
	}
	/**
	 * 报关货物保存
	 */
	@RequestMapping(value="/saveDeclarationDeputeMaterial",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoEoom2EodmModel>> saveDeclarationDeputeMaterial(@RequestBody List<EoEoom2EodmModel> eoEoom2EodmModelList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoRequestDeclarationDeputeService.saveDeclarationDeputeMaterial(eoEoom2EodmModelList);
	}
	/**
	 * 报关集装箱保存
	 */
	@RequestMapping(value="/saveDeclarationDeputeContainer",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoEooc2EoddModel>> saveDeclarationDeputeContainer(@RequestBody List<EoEooc2EoddModel> eoEooc2EoddModelList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoRequestDeclarationDeputeService.saveDeclarationDeputeContainer(eoEooc2EoddModelList);
	}
	/**
	 * 报关随附单据保存
	 */
	@RequestMapping(value="/saveDeclarationDeputeBill",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<EoEoddBillModel>> saveDeclarationDeputeBill(@RequestBody List<EoEoddBillModel> eoEoddBillModelList, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoRequestDeclarationDeputeService.saveDeclarationDeputeBill(eoEoddBillModelList);
	}
	/**
	 * 报关请求下达
	 * @param eoetIds
	 * @return
	 * @author colley
	 */
	@RequestMapping(value="/issuedDeclarationDepute",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData issuedDeclarationDepute(@RequestBody Long[] eoddIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoRequestDeclarationDeputeService.issuedDeclarationDepute(eoddIds);	
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
	 * 
	 * @date 2018年8月11日 上午11:07:49  
	 * @author Richard 
	 * Description:报关任务+报关货物查询+报关集装箱+报关随附单据（按照报关主键）
	 * @param eoddId
	 * @return
	 */
	@RequestMapping(value="/getDeclarationDeputeAndMaterialById",method=RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoDeclarationDeputeDto> getDeclarationDeputeAndMaterialById(@RequestParam(value="eoddId") Long eoddId){
		return eoRequestDeclarationDeputeService.getDeclarationDeputeAndMaterialById(eoddId);
	}
	/**
	 * 
	 * @DATE 2018年8月27日 下午4:44:06
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据id删除报关物料信息
	 * @param eobmId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/deleteByEodmId",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	ResponseData<EoEoom2EodmModel> deleteByEodmId(Long eodmId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEoom2EodmService.deleteById(eodmId);
	}
	/**
	 * 
	 * @DATE 2018年8月27日 下午4:46:04
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据ids批量删除报关物料信息
	 * @param eobmIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/deleteByEodmIds",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	ResponseData<List<EoEoom2EodmModel>> deleteByEodmIds(@RequestBody List<Long> eodmIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEoom2EodmService.deleteByIds(eodmIds);
	}
	/**
	 * 
	 * @DATE 2018年8月27日 下午5:53:47
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据id删除报关箱信息
	 * @param eocdId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/deleteByEocdId",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	ResponseData<EoEooc2EoddModel> deleteByEocdId(@RequestBody Long eocdId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEooc2EoddService.deleteById(eocdId);
	}
	/**
	 * 
	 * @DATE 2018年8月27日 下午5:54:24
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据ids批量删除报关箱信息
	 * @param eocdIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/deleteByEocdIds",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	ResponseData<List<EoEooc2EoddModel>> deleteByEocdIds(@RequestBody List<Long> eocdIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEooc2EoddService.deleteByIds(eocdIds);
	}
	
	/**
	 * 
	 * @DATE 2018年8月27日 下午6:17:54
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据id删除报关随附单据信息
	 * @param eoebId
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/deleteByEoebId",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	ResponseData<EoEoddBillModel> deleteByEoebId(@RequestBody Long eoebId, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEoddBillService.deleteById(eoebId);
	}
	/**
	 * 
	 * @DATE 2018年8月27日 下午6:18:24
	 * @AUTHOR Simon-Guo 
	 * @DESCRIPTION:根据ids批量删除报关随附单据信息
	 * @param eoebIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/deleteByEoebIds",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	ResponseData<List<EoEoddBillModel>> deleteByEoebIds(@RequestBody List<Long> eoebIds, @RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return eoEoddBillService.deleteByIds(eoebIds);
	}
	/**
	 * @deprecated:验证订单下委托报关的提运单号唯一
	 * @author Colley.Bai  
	 * @date 2018年9月13日
	 * @param eoRequestDeclarationDeputeModel
	 * @return
	 */
	@RequestMapping(value="/getDeclarationDeputeAndMaterialByeoddBlNo",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoRequestDeclarationDeputeModel> getDeclarationDeputeByEoddBlNoAndEoddEoorId(
			@RequestBody EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel){
		return eoRequestDeclarationDeputeService.getDeclarationDeputeByEoddBlNoAndEoddEoorId(eoRequestDeclarationDeputeModel);
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
	/**
	 * @deprecated:报关任务+报关货物查询+报关集装箱+报关随附单据（按照订单主键）
	 * @author Colley.Bai  
	 * @date 2018年11月14日
	 * @param eoorId
	 * @return
	 */
	@RequestMapping(value="/getDeclarationDeputeAndMaterialByEoordId",method=RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<EoDeclarationDeputeDto> getDeclarationDeputeAndMaterialByEoordId(@RequestParam(value="eoorId") Long eoorId){
		return this.eoRequestDeclarationDeputeService.getDeclarationDeputeAndMaterialByEoordId(eoorId);
	}
	
	/**
	 * @deprecated:根据报关任务自动生成费用
	 * @author Colley.Bai  
	 * @date 2018年11月29日
	 * @param eoddIds
	 * @param accessToken
	 * @return
	 */
	@RequestMapping(value="/saveAutomaticChargingByEoddDeclaration",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData<List<ElProtocolCostFeelModel>> saveAutomaticChargingByEoddDeclaration(@RequestBody Long[] eoddIds,
			@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken){
		return this.eoRequestDeclarationDeputeService.saveAutomaticChargingByEoddDeclaration(eoddIds);
	}
	
	/**
	 * 业务请求-报关-状态回退
	 * @author Shoven.Jiang  
	 * @date 2018年12月18日
	 * @param eoddIds  订单ids
	 * @return
	 */
	@RequestMapping(value="/eoddStatusBackByEoorIds",method=RequestMethod.POST, produces = Constants.PRODUCES_CODE)
	public ResponseData eoddStatusBackByEoorIds(@RequestBody Long [] eoddIds,
			@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		return this.eoRequestDeclarationDeputeService.eoddStatusBackByEoorIds(eoddIds);
	}
}
