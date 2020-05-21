package com.sinotrans.oms.businessrequest.service;

import java.util.List;
import java.util.Map;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoDeclarationDeputeDto;
import com.sinotrans.oms.businessrequest.dto.EoRequestDeclarationDeputeModelDto;
import com.sinotrans.oms.businessrequest.dto.EoRequestGoodsDto;
import com.sinotrans.oms.businessrequest.model.EoEoddBillModel;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoddModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EodmModel;
import com.sinotrans.oms.businessrequest.model.EoRequestDeclarationDeputeModel;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;

public interface EoRequestDeclarationDeputeService {
	/**
	 * 委托报关任务保存
	 * @param eoRequestDeclarationDeputeModel
	 * @return
	 */
	public ResponseData<EoRequestDeclarationDeputeModel> saveDeclarationDepute (EoRequestDeclarationDeputeModelDto eoRequestDeclarationDeputeModelDto);
	/**
	 * @date 2018年8月10日 下午2:45:12  
	 * @author simon 
	 * Description:报关任务+报关货物+报关集装箱+报关随附单据保存
	 * @param eoDeclarationDeputeDto
	 * @return
	 */
	public ResponseData<EoDeclarationDeputeDto> saveDeclarationDeputeAndMaterial(
			EoDeclarationDeputeDto eoDeclarationDeputeDto);
	/**
	 * 
	 * @date 2018年8月10日 下午4:02:59  
	 * @author simon 
	 * Description:报关货物保存
	 * @param eoEoom2EodmModelList
	 * @return
	 */
	public ResponseData<List<EoEoom2EodmModel>> saveDeclarationDeputeMaterial(
			List<EoEoom2EodmModel> eoEoom2EodmModelList);
	/**
	 * 
	 * @date 2018年8月10日 下午4:07:46  
	 * @author simon 
	 * Description:报关集装箱保存
	 * @param eoEooc2EoddModelList
	 * @return
	 */
	public ResponseData<List<EoEooc2EoddModel>> saveDeclarationDeputeContainer(
			List<EoEooc2EoddModel> eoEooc2EoddModelList);
	/**
	 * 
	 * @date 2018年8月10日 下午4:07:53  
	 * @author simon 
	 * Description:报关随附单据保存
	 * @param eoEoddBillModelList
	 * @return
	 */
	public ResponseData<List<EoEoddBillModel>> saveDeclarationDeputeBill(List<EoEoddBillModel> eoEoddBillModelList);
	
	/**
	 * 
	 * @date 2018年8月10日 下午5:47:06  
	 * @author Richard 
	 * Description:报关下达
	 * @param eoddId
	 * @return
	 */
	public ResponseData issuedDeclarationDepute(Long[] eoddIds);
	
	/**
	 * 
	 * @date 2018年8月11日 上午9:29:39  
	 * @author Richard 
	 * Description:报关列表查询（按条件查询）
	 * @param condition
	 * @return
	 */
	public ResponseData<QueryData> queryDeclarationDeputeByCondition (QueryInfo queryInfo);
	/**
	 * 
	 * @date 2018年8月11日 上午11:10:28  
	 * @author Richard 
	 * Description:报关任务+报关货物查询+报关集装箱+报关随附单据（按照报关主键）
	 * @param eoddId
	 * @return
	 */
	public ResponseData<EoDeclarationDeputeDto> getDeclarationDeputeAndMaterialById(Long eoddId);
	/**
	 * @deprecated:验证订单下委托报关的提运单号唯一
	 * @author Colley.Bai  
	 * @date 2018年9月13日
	 * @param eoRequestDeclarationDeputeModel
	 * @return
	 */
	public ResponseData<EoRequestDeclarationDeputeModel> getDeclarationDeputeByEoddBlNoAndEoddEoorId(
			EoRequestDeclarationDeputeModel eoRequestDeclarationDeputeModel);
	/**
	 * @deprecated:根据商品名称或编码请求报关服务和历史申报商品
	 * @author Colley.Bai  
	 * @date 2018年9月18日 下午4:47:45
	 * @param goodsCode
	 * @param goodsName
	 * @param paramType
	 * @return
	 */
	public ResponseData<List<EoRequestGoodsDto>> getDeclareRequestGoodsInfo(Map<String,Object> paramMap);
	
	/**
	 * @deprecated:报关任务+报关货物查询+报关集装箱+报关随附单据（按照订单主键）
	 * @author Colley.Bai  
	 * @date 2018年11月14日
	 * @param eoorId
	 * @return
	 */
	public ResponseData<EoDeclarationDeputeDto> getDeclarationDeputeAndMaterialByEoordId(Long eoorId);
	
	/**
	 * @deprecated:根据报关任务自动生成费用
	 * @author Colley.Bai  
	 * @date 2018年11月29日
	 * @param eoddIds
	 * @return
	 */
	public ResponseData<List<ElProtocolCostFeelModel>> saveAutomaticChargingByEoddDeclaration(Long[] eoddIds);
	
	/**
	 * 业务请求-报关-状态回退
	 * @author Shoven.Jiang  
	 * @date 2018年12月18日
	 * @param eoddIds  报关ids
	 * @return
	 */
	ResponseData eoddStatusBackByEoorIds(Long [] eoddIds);
}
