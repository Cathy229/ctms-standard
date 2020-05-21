package com.sinotrans.oms.contract.service.impl;


import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.contract.manager.ElProtocolCostFeelManager;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;
import com.sinotrans.oms.contract.service.ElProtocolCostFeelService;

/**
 * <p>Description: 协议费用计算Service </p>
 * @author Colley.Bai
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 20181121              Colley.Bai       	                    创建
 * </pre>
 */
@Service
public class ElProtocolCostFeelServiceImpl implements ElProtocolCostFeelService {

	@Autowired
	private ElProtocolCostFeelManager elProtocolCostFeelManager;

	@Override
	public ResponseData<List<ElProtocolCostFeelModel>> batchSaveProtocolCostFeel(
			List<ElProtocolCostFeelModel> elProtocolCostFeelModelList) {
		ResponseData<List<ElProtocolCostFeelModel>> responseData = new ResponseData<List<ElProtocolCostFeelModel>>();

		List<ElProtocolCostFeelModel> afterElProtocolCostFeelModelList = new ArrayList<>();
		
		if (EmptyUtils.isNotEmpty(elProtocolCostFeelModelList)) {
			for (ElProtocolCostFeelModel elProtocolCostFeelModel:elProtocolCostFeelModelList) {
				ElProtocolCostFeelModel afterElProtocolCostFeelModel = new ElProtocolCostFeelModel();
				BlukInsertUtils.copyPropertiesNonNull(afterElProtocolCostFeelModel, elProtocolCostFeelModel);
				afterElProtocolCostFeelModelList.add(afterElProtocolCostFeelModel);
			}
			
			afterElProtocolCostFeelModelList = elProtocolCostFeelManager.saveAll(afterElProtocolCostFeelModelList);
			
			responseData.setMsg("保存成功");
			responseData.setCode(Constants.YES);
			responseData.setData(afterElProtocolCostFeelModelList);
		} else {
			responseData.setMsg("保存失败");
			responseData.setCode(Constants.NO);
			responseData.setData(afterElProtocolCostFeelModelList);
		}
		return responseData;
	}

	@Override
	public ResponseData<List<ElProtocolCostFeelModel>> batchDeleteProtocolCostFeel(List<Long> epcfIds) {
		ResponseData<List<ElProtocolCostFeelModel>> responseData = new ResponseData<List<ElProtocolCostFeelModel>>();
		if (EmptyUtils.isNotEmpty(epcfIds)) {
			for (Long epcfId:epcfIds) {
				elProtocolCostFeelManager.deleteByPk(epcfId);
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
	public ResponseData<List<ElProtocolCostFeelModel>> getElProtocolCostFeelByEpccId(Long epccId) {
		ResponseData<List<ElProtocolCostFeelModel>> responseData = new ResponseData<List<ElProtocolCostFeelModel>>();
		if (null != epccId) {
			List<FilterCondition> epccFilterCondition = new ArrayList<>();
			epccFilterCondition.add(new FilterCondition("epcfEpccId",epccId,"="));
			List<ElProtocolCostFeelModel> elProtocolCostFeelModelList = elProtocolCostFeelManager.findByCondition(epccFilterCondition);
			responseData.setCode(Constants.YES);
			responseData.setData(elProtocolCostFeelModelList);
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("ID为空，查询失败，请重试");
		}
		return responseData;
	}

	@Override
	public ResponseData<List<ElProtocolCostFeelModel>> getElProtocolCostFeelByEpctId(Long epctId) {
		ResponseData<List<ElProtocolCostFeelModel>> responseData = new ResponseData<List<ElProtocolCostFeelModel>>();
		if (null != epctId) {
			List<FilterCondition> epctFilterCondition = new ArrayList<>();
			epctFilterCondition.add(new FilterCondition("epcfEpccId",epctId,"="));
			List<ElProtocolCostFeelModel> elProtocolCostFeelModelList = elProtocolCostFeelManager.findByCondition(epctFilterCondition);
			responseData.setCode(Constants.YES);
			responseData.setData(elProtocolCostFeelModelList);
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("ID为空，查询失败，请重试");
		}
		return responseData;
	}
	
}
