package com.sinotrans.oms.eoorder.service;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.base.Response;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.eoorder.dto.EoConsignmentDto;
import com.sinotrans.oms.eoorder.dto.EoConsignmentModelDto;
import com.sinotrans.oms.eoorder.dto.EocmAndAcceptDto;
import com.sinotrans.oms.eoorder.model.EoConsignmentMaterielModel;
import com.sinotrans.oms.eoorder.model.EoConsignmentModel;

/**
 * @author shoven
 * 2018年7月21日23:33:10
 *service层只处理业务逻辑，不和数据库进行交互
 */
public interface EoConsignmentService{

	/**
	 * 通过前台传进来的json数据进行数据查询，然后将查询到的值返回到前台
	 * add by shoven
	 * @param json
	 * @return
	 */
	Response findEoConsignmentByCondition(String json, String token);
	
	/**
	 * add by shoven
	 * 保存委托受理表
	 * @param json
	 */
	void saveEoConsignmentModel(String json);
	
	/**
	 * @description 根据委托订单id查询委托订单信息:委托订单表+委托订单物料表list
	 * @author Simon.Guo  
	 * @date 2018年10月25日上午11:07:22
	 * @param eocsId
	 * @return
	 */
	ResponseData<EoConsignmentDto> getConsignmentById(Long eocsId);
	/**
	 * @description 批量删除委托订单物料
	 * @author Simon.Guo  
	 * @date 2018年10月25日上午11:08:35
	 * @param eosrIds
	 * @return
	 */
	ResponseData batchDeleteConsignmentMaterial(Collection<Long> eosrIds);
	/**
	 * @description 批量保存委托订单物料
	 * @author Simon.Guo  
	 * @date 2018年10月25日上午11:09:14
	 * @param EoConsignmentModelList
	 * @return
	 */
	ResponseData<List<EoConsignmentMaterielModel>> saveConsignmentMateriel(List<EoConsignmentMaterielModel> eoConsignmentModelList);
	/**
	 * @description 根据委托订单id委托下达生成订单
	 * @author Simon.Guo  
	 * @date 2018年10月25日上午11:07:22
	 * @param eocsId
	 * @return
	 */
	ResponseData entrustOrder(Long eocsId);
	/**
	 * @description 保存委托订单
	 * @author Simon.Guo  
	 * @date 2018年10月25日上午11:09:14
	 * @param EoConsignmentModelList
	 * @return
	 */
	ResponseData<EoConsignmentModel> saveConsignment(EoConsignmentModelDto eoConsignmentModelDto);
	/**
	 * @description 保存委托物料信息到委托表
	 * @author Simon.Guo  
	 * @date 2018年10月25日下午7:58:22
	 * @param eoConsignmentModelDto
	 * @param accessToken
	 * @return
	 */
	ResponseData saveEocmTotalInfo2Eocs(Long eocsId);
	/**
	 * 通过固定的查询条件来获取委托订单的查询结果
	 * @description
	 * @author Simon.Guo  
	 * @date 2018年10月26日下午3:46:19
	 * @param queryInfo
	 * @return
	 */
	ResponseData<QueryData> queryConsignmentByCondition(QueryInfo queryInfo);

	/**
	 * @description 根据委托订单id查询委托物料信息以及每条信息对应的已受理信息
	 * @author Simon.Guo  
	 * @date 2018年10月25日上午11:07:22
	 * @param eocsId
	 * @return
	 */
	ResponseData<List<EocmAndAcceptDto>> getEocmsAndAcceptInfo(Long eocsId);
	//获取订单物料总计
	public Map<String, List<Double>> getEoorTotalInfo(Long eocsId);
	//获取委托物料总计
	public Map<String, List<Double>> getEocsTotalInfo(Long eocsId);
	//获取订单单个物料总计
	public List<Double> getEoorTotalInfo(Long eocsId,String eocmMaterialNo);
	//获取委托单个物料总计
	public List<Double> getEocsTotalInfo(Long eocsId,String eocmMaterialNo);
	
}
