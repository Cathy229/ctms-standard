package com.sinotrans.oms.contract.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.nogenerator.NOGeneratorUtil;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.contract.dto.ElContractDto;
import com.sinotrans.oms.contract.dto.ElContractModelDto;
import com.sinotrans.oms.contract.manager.ElContractConfigManager;
import com.sinotrans.oms.contract.manager.ElContractGreatClausesManager;
import com.sinotrans.oms.contract.manager.ElContractManager;
import com.sinotrans.oms.contract.model.ElContractConfigModel;
import com.sinotrans.oms.contract.model.ElContractGreatClausesModel;
import com.sinotrans.oms.contract.model.ElContractModel;
import com.sinotrans.oms.contract.service.ElContractConfigService;
import com.sinotrans.oms.contract.service.ElContractService;
import com.sinotrans.oms.fileupload.manager.EbFileManager;
import com.sinotrans.oms.fileupload.model.EbFileModel;

/**
 * <p>Description: 合同设置Manager </p>
 * @author Colley.Bai
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 20181120              Colley.Bai       	                    创建
 * </pre>
 */
@Service
public class ElContractServiceImpl implements ElContractService {

	@Autowired
	private ElContractManager elContractManager;//合同
	@Autowired
	private ElContractConfigManager elContractConfigManager;//接单设置 
	@Autowired
	private ElContractGreatClausesManager elContractGreatClausesManager;//合同条款
	@Autowired
	private EbFileManager ebFileManager;
	
	@Override
	public ResponseData<QueryData> queryContractByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData=new ResponseData<QueryData>();
		QueryData queryData = elContractManager.queryContractByCondition(queryInfo);
		responseData.setData(queryData);
		return responseData;
	}

	@Override
	public ResponseData<ElContractDto> getContractAndContractConfigById(Long elctId) {
		ResponseData<ElContractDto> responseData = new ResponseData<>();
		if (null != elctId) {
			ElContractDto elContractDto = new ElContractDto();
			//1.获取合同信息
			ElContractModel elContractModel = elContractManager.get(elctId);
			//2.获取合同接单设置
			List<FilterCondition> elctConditions=new ArrayList<FilterCondition>();
			elctConditions.add(new FilterCondition("elccElctId",elctId,"="));
			List<ElContractConfigModel> elContractConfigList = elContractConfigManager.findByCondition(elctConditions);
			//3.获取合同重要条款
			List<FilterCondition> ecgcConditions=new ArrayList<FilterCondition>();
			ecgcConditions.add(new FilterCondition("ecgcElctId",elctId,"="));
			List<ElContractGreatClausesModel> elContractGreatClausesModelList = elContractGreatClausesManager.findByCondition(ecgcConditions);
			List<FilterCondition> ebflConditions=new ArrayList<FilterCondition>();
			ebflConditions.add(new FilterCondition("ebflElctId",elctId,"="));
			List<EbFileModel> ebFileModelList = ebFileManager.findByCondition(ebflConditions);
			//3.DTO赋值
			elContractDto.setElContractModel(elContractModel);
			elContractDto.setElContractConfigModelList(elContractConfigList);
			elContractDto.setElContractGreatClausesModelList(elContractGreatClausesModelList);
			elContractDto.setEbFileModelList(ebFileModelList);
			responseData.setData(elContractDto);
			responseData.setMsg(Constants.YES);
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("查询失败");
		}
		return responseData;
	}

	@Override
	public ResponseData<ElContractModel> saveContract(ElContractModelDto elContractModelDto) {
		ResponseData<ElContractModel> responseData = new ResponseData<ElContractModel>();

		ElContractModel elContractModel = new ElContractModel();
		BlukInsertUtils.copyPropertiesNonNull(elContractModel, elContractModelDto);
		
		//合同流水号 生成规则
		if (EmptyUtils.isEmpty(elContractModel.getElctContractNumber())) {
            String elctContractNumber = NOGeneratorUtil.currentValue(Constants.EL_CONTRAT);
            elContractModel.setElctContractNumber(elctContractNumber);
        }
		
		
		ElContractModel aftereElContractModel = elContractManager.save(elContractModel);
		
		responseData.setMsg("保存成功");
		responseData.setCode(Constants.YES);
		responseData.setData(aftereElContractModel);
		
		return responseData;
	}

	@Override
	public ResponseData<List<ElContractModel>> batchSaveElctContract(List<ElContractModel> elContractModelList) {
		ResponseData<List<ElContractModel>> responseData = new ResponseData<>();
		if (EmptyUtils.isNotEmpty(elContractModelList)) {
			List<ElContractModel> afterElContractModelList = new ArrayList<>();
			for (ElContractModel elContractModel:elContractModelList) {
				ElContractModel afterElContractModel = new ElContractModel();
				BlukInsertUtils.copyPropertiesNonNull(afterElContractModel,elContractModel);
				afterElContractModelList.add(afterElContractModel);
			}
			afterElContractModelList = elContractManager.saveAll(afterElContractModelList);
			responseData.setCode(Constants.YES);
			responseData.setData(afterElContractModelList);
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("保存失败");
		}
		return responseData;
	}

}
