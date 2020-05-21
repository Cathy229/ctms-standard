package com.sinotrans.oms.eoorder.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.Response;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.manager.EoOrderPrecontainerManager;
import com.sinotrans.oms.eoorder.model.EoOrderMaterielModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.eoorder.model.EoOrderPrecontainerModel;
import com.sinotrans.oms.eoorder.service.EoOrderPrecontainerService;
import com.sinotrans.oms.eoorder.service.EoOrderService;
@Service
public class EoOrderPrecontainerServiceImpl implements EoOrderPrecontainerService{

	@Autowired 
	private EoOrderPrecontainerManager eoOrderPrecontainerManager;
	@Autowired
	private EoOrderService eoOrderService;
	@Autowired
	private EoOrderManager eoOrderManager;
	@Override
	public ResponseData deleteOrderPrecontainer(Long eosrId) {
		ResponseData response = new ResponseData();
		if (null != eosrId) {
			this.eoOrderPrecontainerManager.deleteByPk(eosrId);
			response.setCode(Constants.YES);
			response.setMsg("删除成功");
		} else {
			response.setCode(Constants.NO);
			response.setMsg("订单预配箱主键为空，请重试");
		}
		return response;
	}

	@Override
	public ResponseData batchDeleteOrderPrecontainer(Collection<Long> eosrIds) {
		ResponseData response = new ResponseData();
		if (EmptyUtils.isNotEmpty(eosrIds)) {
			this.eoOrderPrecontainerManager.deleteByPks(eosrIds);
			response.setCode(Constants.YES);
			response.setMsg("删除成功");
		} else {
			response.setCode(Constants.NO);
			response.setMsg("订单预配箱主键集合为空，请重试");
		}
		return response;
	}

	@Override
	public ResponseData getOrderPrecontainerById(Long eosrId) {
		ResponseData<EoOrderPrecontainerModel> response = new ResponseData<>();
		EoOrderPrecontainerModel eosrModel = this.eoOrderPrecontainerManager.get(eosrId);
		response.setData(eosrModel);
		response.setCode(Constants.YES);
		response.setMsg("查询成功");
		return response;
	}

	@Override
	public ResponseData<QueryData> queryOrderPrecontainerByCondition(QueryInfo queryInfo) {
		return this.eoOrderPrecontainerManager.queryOrderPrecontainerByCondition(queryInfo);
//		ResponseData<List<EoOrderPrecontainerModel>> response = new ResponseData<>();
//		List<FilterCondition> conditions = new ArrayList<>();
//		Set<String> set = condition.keySet();
//		for (String key : set) {
//			conditions.add(new FilterCondition(key,condition.get(key),"="));
//		}
//		List<EoOrderPrecontainerModel> eosrList = this.eoOrderPrecontainerManager.findByCondition(conditions);
//		response.setData(eosrList);
//		response.setCode(Constants.YES);
//		response.setMsg("查询成功");
//		return response;
	}
	
	@Override
	public ResponseData batchDeleteOrderPrecontainerRelationEoetTask(Collection<Long> eosrIds) {
		ResponseData response = new ResponseData();
		if (EmptyUtils.isNotEmpty(eosrIds)) {
			//订单执行完成之后，修改订单预配箱信息同步修改拖车任务
			//1、根据需要删除的预配箱信息id获取预配箱集合
			List<FilterCondition> deleteEosrCondition = new ArrayList<>();
			deleteEosrCondition.add(new FilterCondition("eosrId", eosrIds, "in"));
			List<EoOrderPrecontainerModel> deteleEeoOrderPrecontainerModels = new ArrayList<>();//需要删除的预配箱信息
//			List<EoOrderPrecontainerModel> assembleEeoOrderPrecontainerModels = new ArrayList<>();//重新组装的预配箱信息
			deteleEeoOrderPrecontainerModels = this.eoOrderPrecontainerManager.findByCondition(deleteEosrCondition);
//			Map<Long, EoOrderPrecontainerModel> checkEoOrderPrecontainerModelMap = new HashMap<>();//重新组装之后的预配箱信息
			eoOrderService.deleteEoOrderContainerAndMateriel(deteleEeoOrderPrecontainerModels);
			
			//2、获取该订单下所有的预配箱集合
			if (EmptyUtils.isNotEmpty(deteleEeoOrderPrecontainerModels)) {//判断需要删除的预配箱是不是存在，不存在就没有删除的意义
//				Long eoorId = deteleEeoOrderPrecontainerModels.get(0).getEosrEoorId();
//				List<FilterCondition> allEosrCondition = new ArrayList<>();
//				allEosrCondition.add(new FilterCondition("eosrEoorId", eoorId, "="));
//				List<EoOrderPrecontainerModel> allEoOrderPrecontainerModels = new ArrayList<>();
//				allEoOrderPrecontainerModels = this.eoOrderPrecontainerManager.findByCondition(allEosrCondition);
//				for (int i = 0; i < deteleEeoOrderPrecontainerModels.size(); i++) {
//					Long deleteEoseId = deteleEeoOrderPrecontainerModels.get(i).getEosrId();
//					for (int j = 0; j < allEoOrderPrecontainerModels.size(); j++) {
//						Long allEoseId = allEoOrderPrecontainerModels.get(j).getEosrId();
//						if (!deleteEoseId.equals(allEoseId)) {
//							checkEoOrderPrecontainerModelMap.put(allEoseId, allEoOrderPrecontainerModels.get(j));//重组该订单下没有删除的预配箱信息
//						}
//					}
//				}
//				List<String> eosr = new ArrayList<String>();// 该订单下剩余的预配箱信息
//				for (Entry<Long, EoOrderPrecontainerModel> entry : checkEoOrderPrecontainerModelMap.entrySet()) { 
//					assembleEeoOrderPrecontainerModels.add(entry.getValue()); 
//				}
//				for (EoOrderPrecontainerModel eosrModels : assembleEeoOrderPrecontainerModels) {
//	                eosr.add(eosrModels.getEosrCntCustomized() + eosrModels.getEosrCntCustomizedSize());
//	            }
//				response = this.eoOrderPrecontainerManager.deleteEosrBeforeCheck(eosr, eoorId, assembleEeoOrderPrecontainerModels);
//				if (Constants.NO.equals(response.getCode())) {
//					response.setData(allEoOrderPrecontainerModels);
//					return response;
//				}
				this.eoOrderPrecontainerManager.deleteByPks(eosrIds);
//				EoOrderModel eoOrderModel = this.eoOrderManager.get(eoorId);
//				List<EoOrderModel> afterEoOrderModels = new ArrayList<>();
//				afterEoOrderModels.add(eoOrderModel);
//				response = this.eoOrderService.buildBrByOrderId(afterEoOrderModels); // 调用存储过程生成BR信息
//		        if (Constants.NO.equals(response)) {
//		        	response.setCode(Constants.NO);
//		        	response.setMsg(response.getMsg());
//					return response;
//		        }
		        response.setCode(Constants.YES);
	        	response.setMsg("删除成功");
				return response;
			}
		} else {
			response.setCode(Constants.NO);
			response.setMsg("订单预配箱主键集合为空，请重试");
		}
		return response;
	}

}
