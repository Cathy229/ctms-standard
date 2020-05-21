package com.sinotrans.oms.contract.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryField;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.contract.manager.ElProtocolCostConManager;
import com.sinotrans.oms.contract.manager.ElProtocolCostFeelManager;
import com.sinotrans.oms.contract.model.ElProtocolCostConModel;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;
import com.sinotrans.oms.contract.service.ElProtocolCostConService;

import oracle.net.aso.r;

/**
 * <p>Description: 协议条件分类Service </p>
 * @author Colley.Bai
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 20181120              Colley.Bai       	                    创建
 * </pre>
 */
@Service
public class ElProtocolCostConServiceImpl  implements ElProtocolCostConService {

	@Autowired
	private ElProtocolCostConManager elProtocolCostConManager;//协议条件分类
	@Autowired
	private ElProtocolCostFeelManager elProtocolCostFeelManager;//协议费用计算
	@Autowired
	private CommonQueryManager commonQueryManager;

	@Override
	public ResponseData<List<ElProtocolCostConModel>> batchSaveProtocolCostCon(
			List<ElProtocolCostConModel> elProtocolCostConModelList) {
		ResponseData<List<ElProtocolCostConModel>> responseData = new ResponseData<List<ElProtocolCostConModel>>();

		List<ElProtocolCostConModel> afterElProtocolCostConModelList = new ArrayList<>();
		
		if (EmptyUtils.isNotEmpty(elProtocolCostConModelList)) {
			for (ElProtocolCostConModel elProtocolCostConModel:elProtocolCostConModelList) {
				ElProtocolCostConModel afterElProtocolCostConModel = new ElProtocolCostConModel();
				BlukInsertUtils.copyPropertiesNonNull(afterElProtocolCostConModel, elProtocolCostConModel);
				afterElProtocolCostConModelList.add(afterElProtocolCostConModel);
			}
//			String msg = getelProtocolCostConModelByEpctId(afterElProtocolCostConModelList);
//			if (msg != "") {
//				responseData.setMsg(msg);
//				responseData.setCode(Constants.NO);
//				return responseData;
//			}
			
			afterElProtocolCostConModelList = elProtocolCostConManager.saveAll(afterElProtocolCostConModelList);
			
			responseData.setMsg("保存成功");
			responseData.setCode(Constants.YES);
			responseData.setData(afterElProtocolCostConModelList);
		} else {
			responseData.setMsg("保存失败");
			responseData.setCode(Constants.NO);
			responseData.setData(afterElProtocolCostConModelList);
		}
		return responseData;
	}

	@Override
	public ResponseData<List<ElProtocolCostConModel>> batchDelteProtocolCostCon(List<Long> epccIds) {
		ResponseData<List<ElProtocolCostConModel>> responseData = new ResponseData<List<ElProtocolCostConModel>>();
		if (EmptyUtils.isNotEmpty(epccIds)) {
			for (Long epccId:epccIds) {
				//1.获取协议费用计算
				List<FilterCondition> epccIdFilterCondition = new ArrayList<>();
				epccIdFilterCondition.add(new FilterCondition("epcfEpccId",epccId,"="));
				List<ElProtocolCostFeelModel> elProtocolCostFeelModelList = elProtocolCostFeelManager.findByCondition(epccIdFilterCondition);
				if (EmptyUtils.isNotEmpty(elProtocolCostFeelModelList)) {
					//2.如果有协议费用计算，先删除协议费用计算
					for (ElProtocolCostFeelModel elProtocolCostFeelModel:elProtocolCostFeelModelList) {
						elProtocolCostFeelManager.delete(elProtocolCostFeelModel);
					}
				}
				//3.删除协议分类
				elProtocolCostConManager.deleteByPk(epccId);
			}
			responseData.setCode(Constants.YES);
			responseData.setMsg("删除成功");
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("ID为空，不允许删除，请重试");
		}
		return responseData;
	}

	@Override
	public ResponseData<List<ElProtocolCostConModel>> getElProtocolCostConByEpctId(Long epctId) {
		ResponseData<List<ElProtocolCostConModel>> responseData = new ResponseData<List<ElProtocolCostConModel>>();
		if (null != epctId) {
			List<FilterCondition> epctFileterCondition = new ArrayList<>();
			epctFileterCondition.add(new FilterCondition("epccEpctId",epctId,"="));
			List<ElProtocolCostConModel> elProtocolCostConModelList = elProtocolCostConManager.findByCondition(epctFileterCondition);
			responseData.setCode(Constants.YES);
			responseData.setData(elProtocolCostConModelList);
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("ID为空，查询失败，请重试");
		}
		return responseData;
	}
	
	public String getelProtocolCostConModelByEpctId (List<ElProtocolCostConModel> elProtocolCostConModelList) {
		String msg = "";
		if (EmptyUtils.isNotEmpty(elProtocolCostConModelList)) {
			for (ElProtocolCostConModel elProtocolCostConModel : elProtocolCostConModelList) {
				List<FilterCondition> epctFileterCondition = new ArrayList<>();
				
				if (null == elProtocolCostConModel.getEpccId()) {
					epctFileterCondition.add(new FilterCondition("epccEpctId",elProtocolCostConModel.getEpccEpctId(),"="));
					epctFileterCondition.add(new FilterCondition("epccLoadPortId",elProtocolCostConModel.getEpccLoadPortId(),"="));
					epctFileterCondition.add(new FilterCondition("epccDischargePortId",elProtocolCostConModel.getEpccDischargePortId(),"="));
					epctFileterCondition.add(new FilterCondition("epccShipId",elProtocolCostConModel.getEpccShipId(),"="));
					epctFileterCondition.add(new FilterCondition("epccFreightClauseCode",elProtocolCostConModel.getEpccFreightClauseCode(),"="));
					epctFileterCondition.add(new FilterCondition("epccLmId",elProtocolCostConModel.getEpccLmId(),"="));
					epctFileterCondition.add(new FilterCondition("epccBmsEbsmCode",elProtocolCostConModel.getEpccBmsEbsmCode(),"="));
					epctFileterCondition.add(new FilterCondition("epccIsDeclaration",elProtocolCostConModel.getEpccIsDeclaration(),"="));
					epctFileterCondition.add(new FilterCondition("epccIsBooking",elProtocolCostConModel.getEpccIsBooking(),"="));
					epctFileterCondition.add(new FilterCondition("epccIsTrailer",elProtocolCostConModel.getEpccIsTrailer(),"="));
					
					List<ElProtocolCostConModel> afterelProtocolCostConModelList = elProtocolCostConManager.findByCondition(epctFileterCondition);
					if (EmptyUtils.isNotEmpty(afterelProtocolCostConModelList)) {
						msg += "此明细下，条件分类信息不能重复";
					}
				}
			}
		}
		return msg;
	}

	@Override
	public ResponseData<QueryData> queryProtocolCostConByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData = new ResponseData<>();
		queryInfo.setQueryType("ElProtocolCostAndConQuery");
		QueryData queryData = commonQueryManager.query(queryInfo);
		responseData.setData(queryData);
		return responseData;
	}

}
