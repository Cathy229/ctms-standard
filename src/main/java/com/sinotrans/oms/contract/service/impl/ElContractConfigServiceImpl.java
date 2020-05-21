package com.sinotrans.oms.contract.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.contract.dto.ElContractConfigModelDto;
import com.sinotrans.oms.contract.manager.ElContractConfigManager;
import com.sinotrans.oms.contract.model.ElContractConfigModel;
import com.sinotrans.oms.contract.model.ElContractModel;
import com.sinotrans.oms.contract.service.ElContractConfigService;
import com.sinotrans.oms.eoorder.model.EoEoob2EomjModel;

/**
 * <p>Description: 合同接单设置Manage </p>
 * @author Colley.Bai
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 20181120              Colley.Bai       	                    创建
 * </pre>
 */
@Service
public class ElContractConfigServiceImpl implements ElContractConfigService {

	@Autowired
	private ElContractConfigManager elContractConfigManager;
	
	@Override
	public ResponseData<List<ElContractConfigModel>> saveContractConfig(List<ElContractConfigModel> elContractConfigModelList) {
		ResponseData<List<ElContractConfigModel>> responseData = new ResponseData<List<ElContractConfigModel>>();

		List<ElContractConfigModel> afterElContractConfigModelList = new ArrayList<>();
		
		if (EmptyUtils.isNotEmpty(elContractConfigModelList)) {
			for (ElContractConfigModel elContractConfigModel:elContractConfigModelList) {
				ElContractConfigModel afterElContractConfigModel = new ElContractConfigModel();
				BlukInsertUtils.copyPropertiesNonNull(afterElContractConfigModel, elContractConfigModel);
				afterElContractConfigModelList.add(afterElContractConfigModel);
			}
			
			afterElContractConfigModelList = elContractConfigManager.saveAll(afterElContractConfigModelList);
			
			responseData.setMsg("保存成功");
			responseData.setCode(Constants.YES);
			responseData.setData(afterElContractConfigModelList);
		} else {
			responseData.setMsg("保存失败");
			responseData.setCode(Constants.NO);
			responseData.setData(afterElContractConfigModelList);
		}
		return responseData;
		
		
	}

	@Override
	public ResponseData<List<ElContractConfigModel>> batchDeleteContractConfig(List<Long> elccIds) {
		ResponseData<List<ElContractConfigModel>> responseData = new ResponseData<List<ElContractConfigModel>>();
		
		if (EmptyUtils.isNotEmpty(elccIds)) {
			elContractConfigManager.deleteByPks(elccIds);
			responseData.setCode(Constants.YES);
			responseData.setMsg("删除成功");
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("ID为空，不允许删除，请重试");
		}
		
		return responseData;
	}

}
