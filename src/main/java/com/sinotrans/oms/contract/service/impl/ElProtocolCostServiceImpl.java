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
import com.sinotrans.oms.contract.manager.ElProtocolCostConManager;
import com.sinotrans.oms.contract.manager.ElProtocolCostFeelManager;
import com.sinotrans.oms.contract.manager.ElProtocolCostManager;
import com.sinotrans.oms.contract.model.ElProtocolCostConModel;
import com.sinotrans.oms.contract.model.ElProtocolCostFeelModel;
import com.sinotrans.oms.contract.model.ElProtocolCostModel;
import com.sinotrans.oms.contract.service.ElProtocolCostService;

/**
 * <p>Description: 协议明细表Service </p>
 * @author Colley.Bai
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 20181121              Colley.Bai       	                    创建
 * </pre>
 */
@Service
public class ElProtocolCostServiceImpl  implements ElProtocolCostService {

	@Autowired
	private ElProtocolCostManager elProtocolCostManager;//协议明细
	@Autowired
	private ElProtocolCostConManager elProtocolCostConManager;//协议条件明细
	@Autowired
	private ElProtocolCostFeelManager elProtocolCostFeelManager;//协议费用计算
	
	@Override
	public ResponseData<List<ElProtocolCostModel>> batchSaveProtocolCost(List<ElProtocolCostModel> elProtocolCostModelList) {
		ResponseData<List<ElProtocolCostModel>> responseData = new ResponseData<List<ElProtocolCostModel>>();

		List<ElProtocolCostModel> afterElProtocolCostModelList = new ArrayList<>();
		
		if (EmptyUtils.isNotEmpty(elProtocolCostModelList)) {
			for (ElProtocolCostModel elProtocolCostModel:elProtocolCostModelList) {
				ElProtocolCostModel afterElProtocolCostModel = new ElProtocolCostModel();
				BlukInsertUtils.copyPropertiesNonNull(afterElProtocolCostModel, elProtocolCostModel);
				afterElProtocolCostModelList.add(afterElProtocolCostModel);
			}
			
			afterElProtocolCostModelList = elProtocolCostManager.saveAll(afterElProtocolCostModelList);
			
			responseData.setMsg("保存成功");
			responseData.setCode(Constants.YES);
			responseData.setData(afterElProtocolCostModelList);
		} else {
			responseData.setMsg("保存失败");
			responseData.setCode(Constants.NO);
			responseData.setData(afterElProtocolCostModelList);
		}
		return responseData;
		
	}

	@Override
	public ResponseData<List<ElProtocolCostModel>> batchDeleteProtocolCost(List<Long> epctIds) {
		ResponseData<List<ElProtocolCostModel>> responseData = new ResponseData<>();
		if (EmptyUtils.isNotEmpty(epctIds)) {
			for (Long epctId:epctIds) {
				//1.获取协议条件分类
				List<FilterCondition>  epctIdFilterCondition = new ArrayList<>();
				epctIdFilterCondition.add(new FilterCondition("epccEpctId",epctId,"="));
				List<ElProtocolCostConModel> elProtocolCostConModelList = elProtocolCostConManager.findByCondition(epctIdFilterCondition);
				if (EmptyUtils.isNotEmpty(elProtocolCostConModelList)) {
					//2.循环获取协议条件分类id
					for (ElProtocolCostConModel elProtocolCostConModel:elProtocolCostConModelList) {
						//3.获取协议费用计算
						List<FilterCondition>  epccIdFilterCondition = new ArrayList<>();
						epccIdFilterCondition.add(new FilterCondition("epcfEpccId",elProtocolCostConModel.getEpccId(),"="));
						List<ElProtocolCostFeelModel> elProtocolCostFeelModelList = elProtocolCostFeelManager.findByCondition(epccIdFilterCondition);
						if (EmptyUtils.isNotEmpty(elProtocolCostFeelModelList)) {
							for (ElProtocolCostFeelModel elProtocolCostFeelModel:elProtocolCostFeelModelList) {
								//4.删除协议费用计算
								elProtocolCostFeelManager.delete(elProtocolCostFeelModel);
							}
						}
						//5.删除协议条件分类
						elProtocolCostConManager.delete(elProtocolCostConModel);
					}
				}
				//6.删除协议明细
				elProtocolCostManager.deleteByPk(epctId);
			}
			responseData.setCode(Constants.YES);
			responseData.setMsg("删除成功");
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("ID为空，不允许删除，请重试");
		}
		return responseData;
	}

	
}
