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
import com.sinotrans.oms.contract.dto.ElProtocolDto;
import com.sinotrans.oms.contract.dto.ElProtocolModelDto;
import com.sinotrans.oms.contract.manager.ElProtocolCostManager;
import com.sinotrans.oms.contract.manager.ElProtocolManager;
import com.sinotrans.oms.contract.model.ElProtocolCostModel;
import com.sinotrans.oms.contract.model.ElProtocolModel;
import com.sinotrans.oms.contract.service.ElProtocolService;

/**
 * <p>Description: 合同设置Service </p>
 * @author Colley.Bai
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 20181120              Colley.Bai       	                    创建
 * </pre>
 */
@Service
public class ElProtocolServiceImpl implements ElProtocolService {

	@Autowired
	private ElProtocolManager elProtocolManager;
	@Autowired
	private ElProtocolCostManager elProtocolCostManager;

	@Override
	public ResponseData<QueryData> queryProtocolByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData=new ResponseData<QueryData>();
		QueryData queryData = elProtocolManager.queryProtocolByCondition(queryInfo);
		responseData.setData(queryData);
		return responseData;
	}

	@Override
	public ResponseData<ElProtocolModel> saveProtocol(ElProtocolModelDto elProtocolModelDto) {
		ResponseData<ElProtocolModel> responseData = new ResponseData<ElProtocolModel>();

		ElProtocolModel elProtocolModel = new ElProtocolModel();
		BlukInsertUtils.copyPropertiesNonNull(elProtocolModel,elProtocolModelDto);
		
		String msg = getProtocolbyElplId(elProtocolModel);
		if (EmptyUtils.isNotEmpty(msg)) {
			
			responseData.setMsg(msg);
			responseData.setCode(Constants.NO);
			return responseData;
		}
		
		//协议协议号 生成规则
		if (EmptyUtils.isEmpty(elProtocolModel.getElplNo())) {
            String elplNo = NOGeneratorUtil.currentValue(Constants.ELPL_NO);
            elProtocolModel.setElplNo(elplNo);
        }
		
		elProtocolModel = elProtocolManager.save(elProtocolModel);
		
		if (null != elProtocolModel) {
			responseData.setMsg("保存成功");
			responseData.setCode(Constants.YES);
			responseData.setData(elProtocolModel);
		} else {
			responseData.setMsg("保存失败");
			responseData.setCode(Constants.NO);
		}
		
		return responseData;
	}

	@Override
	public ResponseData<ElProtocolDto> getProtocolAndProtocolCostById(Long elplId) {
		if (null != elplId) {
			ResponseData<ElProtocolDto> responseData = new ResponseData<ElProtocolDto>();
			
			ElProtocolDto elProtocolDto = new ElProtocolDto();
			//1.协议信息
			ElProtocolModel elProtocolModel = elProtocolManager.get(elplId);
			//2.协议明细
			List<FilterCondition> elplConditions=new ArrayList<FilterCondition>();
			elplConditions.add(new FilterCondition("epctElplId",elplId,"="));
			List<ElProtocolCostModel> elProtocolCostModelList = elProtocolCostManager.findByCondition(elplConditions);
		
			//3.DTO赋值
			elProtocolDto.setElProtocolModel(elProtocolModel);
			elProtocolDto.setElProtocolCostModelList(elProtocolCostModelList);
			
			responseData.setData(elProtocolDto);
			responseData.setMsg(Constants.YES);
			return responseData;
		}
		return null;
	}
	
	/**
	 * @deprecated:验证客商名称是否重复
	 * @author Colley.Bai  
	 * @date 2018年11月27日
	 * @param elProtocolModel
	 * @return
	 */
	public String getProtocolbyElplId(ElProtocolModel elProtocolModel){
		
		String msg = "";
		if (null != elProtocolModel) {
			List<FilterCondition> elProtocolFilterCondition = new ArrayList<>();
			elProtocolFilterCondition.add(new FilterCondition("elplEscoId",elProtocolModel.getElplEscoId(),"="));
			elProtocolFilterCondition.add(new FilterCondition("elplCustomerEbcuCode",elProtocolModel.getElplCustomerEbcuCode(),"="));
			List<ElProtocolModel> elProtocolModelList = elProtocolManager.findByCondition(elProtocolFilterCondition);
			if (EmptyUtils.isNotEmpty(elProtocolModelList)) {
				for (ElProtocolModel afterElProtocolModel:elProtocolModelList) {
					if (null != elProtocolModel.getElplId()) {
						if (EmptyUtils.isNotEqual(afterElProtocolModel.getElplId(), elProtocolModel.getElplId())) {//新增
							msg += "客商名称已在协议名称：["+afterElProtocolModel.getElplName()+"]的协议存在，请重新选择";
						}
					} else {
						msg += "客商名称已在协议名称：["+afterElProtocolModel.getElplName()+"]的协议存在，请重新选择";
					}
				}
			}
		}
		return msg;
	}

}
