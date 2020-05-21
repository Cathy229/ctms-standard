package com.sinotrans.oms.eoorder.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EoocManager;
import com.sinotrans.oms.businessrequest.model.EoEoom2EoocModel;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.eoorder.manager.EoOrderContainerManager;
import com.sinotrans.oms.eoorder.model.EoOrderContainerModel;
import com.sinotrans.oms.eoorder.service.EoOrderContainerService;

@Service
public class EoOrderContainerServiceImpl implements EoOrderContainerService{

	@Autowired
	private EoOrderContainerManager eoOrderContainerManager;
	@Autowired
	private EoEoom2EoocManager eoEoom2EoocManager;
	@Override
	public ResponseData deleteOrderContainer(Long eoocId) {
		ResponseData response = new ResponseData();
		if (null != eoocId) {
			//删除订单集装箱之前先删除其强制关联子表
			List<FilterCondition> eomcCondition = new ArrayList<>();
			eomcCondition.add(new FilterCondition("eomcEoocId", eoocId, "="));
			List<EoEoom2EoocModel> eoEoom2EoocModels = this.eoEoom2EoocManager.findByCondition(eomcCondition);
			if (EmptyUtils.isNotEmpty(eoEoom2EoocModels)) {
				List<Long> eomcIds = new ArrayList<>();
				for (EoEoom2EoocModel eoEoom2EoocModel : eoEoom2EoocModels) {
					eomcIds.add(eoEoom2EoocModel.getEomcId());
				}
				this.eoEoom2EoocManager.deleteByPks(eomcIds);
			}
			this.eoOrderContainerManager.deleteByPk(eoocId);
			response.setCode(Constants.YES);
			response.setMsg("删除成功");
		} else {
			response.setCode(Constants.NO);
			response.setMsg("订单集装箱信息主键为空，请重试");
		}
		return  response;
	}

	@Override
	public ResponseData batchDeleteOrderContainer(Collection<Long> eoocIds) {
		ResponseData response = new ResponseData();
		if (EmptyUtils.isNotEmpty(eoocIds)) {
			//删除订单集装箱之前先删除其强制关联子表
			List<FilterCondition> eomcCondition = new ArrayList<>();
			eomcCondition.add(new FilterCondition("eomcEoocId", eoocIds, "in"));
			List<EoEoom2EoocModel> eoEoom2EoocModels = this.eoEoom2EoocManager.findByCondition(eomcCondition);
			if (EmptyUtils.isNotEmpty(eoEoom2EoocModels)) {
				List<Long> eomcIds = new ArrayList<>();
				for (EoEoom2EoocModel eoEoom2EoocModel : eoEoom2EoocModels) {
					eomcIds.add(eoEoom2EoocModel.getEomcId());
				}
				this.eoEoom2EoocManager.deleteByPks(eomcIds);
			}
			this.eoOrderContainerManager.deleteByPks(eoocIds);
			response.setCode(Constants.YES);
			response.setMsg("删除成功");
		} else {
			response.setCode(Constants.NO);
			response.setMsg("订单集装箱信息主键集合为空，请重试");
		}
		return  response;
	}

	@Override
	public ResponseData getOrderContainerById(Long eoocId) {
		ResponseData<EoOrderContainerModel> response = new ResponseData<>();
		EoOrderContainerModel eoocModel = this.eoOrderContainerManager.get(eoocId);
		response.setData(eoocModel);
		response.setCode(Constants.YES);
		response.setMsg("查询成功");
		return response;
	}

	@Override
	public ResponseData<QueryData> queryOrderContainerByCondition(QueryInfo queryInfo) {
		return this.eoOrderContainerManager.queryOrderContainerByCondition(queryInfo);
//		ResponseData<List<EoOrderContainerModel>> response = new ResponseData<>();
//		List<FilterCondition> conditions = new ArrayList<>();
//		Set<String> set = condition.keySet();
//		for (String key : set) {
//			conditions.add(new FilterCondition(key,condition.get(key),"="));
//		}
//		List<EoOrderContainerModel> eoocList = this.eoOrderContainerManager.findByCondition(conditions);
//		response.setData(eoocList);
//		response.setCode(Constants.YES);
//		response.setMsg("查询成功");
//		return response;
	}

}
