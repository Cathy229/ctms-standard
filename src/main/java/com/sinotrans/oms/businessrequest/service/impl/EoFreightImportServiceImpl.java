package com.sinotrans.oms.businessrequest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.dto.EoFreightImportModelDto;
import com.sinotrans.oms.businessrequest.manager.EoFreightImportManager;
import com.sinotrans.oms.businessrequest.manager.EoImportJoabBoxManager;
import com.sinotrans.oms.businessrequest.model.EoFreightImportModel;
import com.sinotrans.oms.businessrequest.model.EoImportJoabBoxModel;
import com.sinotrans.oms.businessrequest.service.EoFreightImportService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.eoorder.manager.EoOrderContainerManager;
import com.sinotrans.oms.eoorder.manager.EoOrderMaterielManager;
import com.sinotrans.oms.eoorder.model.EoOrderMaterielModel;

/**  
* Title: EoFreightImportServiceImpl  
* Description:  查验service
* @author Colley.Bai  
* @date 2019年02月26日  
* @version 1.0  
*/
@Service
public class EoFreightImportServiceImpl implements EoFreightImportService {

	@Autowired
	private EoFreightImportManager eoFreightImportManager;
	@Autowired
	private EoImportJoabBoxManager eoImportJoabBoxManager;
	@Autowired
	private EoOrderContainerManager eoOrderContainerManager;
	@Autowired
	private EoOrderMaterielManager eoOrderMaterielManager;
	
	@Override
	public ResponseData<EoFreightImportModelDto> saveEoFreightImportModel(EoFreightImportModelDto eoFreightImportModelDto) {
		ResponseData<EoFreightImportModelDto> responseData = new ResponseData<>();
		EoFreightImportModelDto afterEoFreightImportModelDto = new EoFreightImportModelDto();
		
		EoFreightImportModel eoFreightImportModel = eoFreightImportModelDto.getEoFreightImportModel();
		List<EoImportJoabBoxModel> cEoImportJoabBoxModelList = eoFreightImportModelDto.getcEoImportJoabBoxModelList();
		List<EoImportJoabBoxModel> qEoImportJoabBoxModelList = eoFreightImportModelDto.getqEoImportJoabBoxModelList();
		
		EoFreightImportModel afterEoFreightImportModel = eoFreightImportManager.save(eoFreightImportModel);
		
		if (null != afterEoFreightImportModel) {
			if (EmptyUtils.isNotEmpty(cEoImportJoabBoxModelList)) {
				List<EoImportJoabBoxModel> afterCEoImportJoabBoxModelList = eoImportJoabBoxManager.saveAll(cEoImportJoabBoxModelList);
				if (EmptyUtils.isNotEmpty(afterCEoImportJoabBoxModelList)) {
					afterEoFreightImportModelDto.setcEoImportJoabBoxModelList(afterCEoImportJoabBoxModelList);
				}
			}
			if (EmptyUtils.isNotEmpty(qEoImportJoabBoxModelList)) {
				List<EoImportJoabBoxModel> afterQEoImportJoabBoxModelList = eoImportJoabBoxManager.saveAll(qEoImportJoabBoxModelList);
				if (EmptyUtils.isNotEmpty(afterQEoImportJoabBoxModelList)) {
					afterEoFreightImportModelDto.setqEoImportJoabBoxModelList(afterQEoImportJoabBoxModelList);
				}
			}
			
			afterEoFreightImportModelDto.setEoFreightImportModel(afterEoFreightImportModel);
			
			responseData.setMsg("保存成功");
			responseData.setCode(Constants.YES);
			responseData.setData(afterEoFreightImportModelDto);
		} else {
			responseData.setMsg("保存失败");
			responseData.setCode(Constants.NO);
			responseData.setData(afterEoFreightImportModelDto);
		}
		return responseData;
	}

	@Override
	public ResponseData<EoFreightImportModelDto> getEoFreightImportByEoordId(Long eoorId) {
		ResponseData<EoFreightImportModelDto> responseData = new ResponseData<>();
		EoFreightImportModelDto eoFreightImportModelDto = new EoFreightImportModelDto();
		if (null != eoorId) {
			List<FilterCondition> eoorFilterCondition = new ArrayList<>();
			eoorFilterCondition.add(new FilterCondition("eofiEoorId",eoorId,"="));
			eoorFilterCondition.add(new FilterCondition("eofiIsCheck",Constants.EOFI_IS_TYPE,"="));
			List<EoFreightImportModel> eoFreightImportModelList = eoFreightImportManager.findByCondition(eoorFilterCondition);
			if (EmptyUtils.isNotEmpty(eoFreightImportModelList)) {
				eoFreightImportModelDto.setEoFreightImportModel(eoFreightImportModelList.get(0));
				for (EoFreightImportModel  eoFreightImportModel : eoFreightImportModelList) {
					List<FilterCondition> cEofiFilterCondition = new ArrayList<>();
					cEofiFilterCondition.add(new FilterCondition("eoibEofiId",eoFreightImportModel.getEofiId(),"="));
					cEofiFilterCondition.add(new FilterCondition("eoibCCheck",Constants.EOFI_C_CHECK,"="));
					List<EoImportJoabBoxModel> cEoImportJoabBoxModelList = eoImportJoabBoxManager.findByCondition(cEofiFilterCondition);
					if (EmptyUtils.isNotEmpty(cEoImportJoabBoxModelList)) {
						eoFreightImportModelDto.setcEoImportJoabBoxModelList(cEoImportJoabBoxModelList);
					}
					List<FilterCondition> qEofiFilterCondition = new ArrayList<>();
					qEofiFilterCondition.add(new FilterCondition("eoibEofiId",eoFreightImportModel.getEofiId(),"="));
					qEofiFilterCondition.add(new FilterCondition("eoibQCheck",Constants.EOFI_Q_CHECK,"="));
					List<EoImportJoabBoxModel> qEoImportJoabBoxModelList = eoImportJoabBoxManager.findByCondition(qEofiFilterCondition);
					if (EmptyUtils.isNotEmpty(qEoImportJoabBoxModelList)) {
						eoFreightImportModelDto.setqEoImportJoabBoxModelList(qEoImportJoabBoxModelList);
					}
				}
			}
			//换单
			List<FilterCondition> singleFilterCondition = new ArrayList<>();
			singleFilterCondition.add(new FilterCondition("eofiEoorId",eoorId,"="));
			singleFilterCondition.add(new FilterCondition("eofiIsSingle",Constants.EOFI_IS_TYPE,"="));
			List<EoFreightImportModel> singleEoFreightImportModelList = eoFreightImportManager.findByCondition(singleFilterCondition);
			if (EmptyUtils.isNotEmpty(singleEoFreightImportModelList)) {
				eoFreightImportModelDto.setSingleEoFreightImportModel(singleEoFreightImportModelList.get(0));
			}
			//缴费
			List<FilterCondition> paymentFilterCondition = new ArrayList<>();
			paymentFilterCondition.add(new FilterCondition("eofiEoorId",eoorId,"="));
			paymentFilterCondition.add(new FilterCondition("eofiIsPayment",Constants.EOFI_IS_TYPE,"="));
			List<EoFreightImportModel> paymentEoFreightImportModelList = eoFreightImportManager.findByCondition(paymentFilterCondition);
			if (EmptyUtils.isNotEmpty(paymentEoFreightImportModelList)) {
				eoFreightImportModelDto.setPaymentEoFreightImportModel(paymentEoFreightImportModelList.get(0));
			}
			//押箱
			List<FilterCondition> containerDetentioFilterCondition = new ArrayList<>();
			containerDetentioFilterCondition.add(new FilterCondition("eofiEoorId",eoorId,"="));
			containerDetentioFilterCondition.add(new FilterCondition("eofiIsContainerDetentio",Constants.EOFI_IS_TYPE,"="));
			List<EoFreightImportModel> containerDetentioEoFreightImportModelList = eoFreightImportManager.findByCondition(containerDetentioFilterCondition);
			if (EmptyUtils.isNotEmpty(containerDetentioEoFreightImportModelList)) {
				eoFreightImportModelDto.setContainerDetentioEoFreightImportModel(containerDetentioEoFreightImportModelList.get(0));
				List<FilterCondition> eoImportFilterCondition = new ArrayList<>();
				eoImportFilterCondition.add(new FilterCondition("eoibEofiId",containerDetentioEoFreightImportModelList.get(0).getEofiId(),"="));
				List<EoImportJoabBoxModel> eoImportJoabBoxModelList = eoImportJoabBoxManager.findByCondition(eoImportFilterCondition);
				if (EmptyUtils.isNotEmpty(eoImportJoabBoxModelList)) {
					eoFreightImportModelDto.setEoImportJoabBoxModelList(eoImportJoabBoxModelList);
				}
			}
			List<FilterCondition> eoomFilterCondition = new ArrayList<>();
			eoomFilterCondition.add(new FilterCondition("eoomEoorId",eoorId,"="));
			List<EoOrderMaterielModel> eoOrderMaterielModelList = eoOrderMaterielManager.findByCondition(eoomFilterCondition);
			if (EmptyUtils.isNotEmpty(eoOrderMaterielModelList)) {
				eoFreightImportModelDto.setEoOrderMaterielModelList(eoOrderMaterielModelList);
			}
			responseData.setCode(Constants.YES);
			responseData.setData(eoFreightImportModelDto);
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("查询失败");
		}
		return responseData;
	}

	@Override
	public ResponseData<QueryData> queryImportJoabBoxByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData=new ResponseData<QueryData>();
		QueryData queryData = eoOrderContainerManager.queryBookingByCondition(queryInfo);
		responseData.setData(queryData);
		return responseData;
	}

	@Override
	public ResponseData<QueryData> queryFreightImportByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData=new ResponseData<QueryData>();
		QueryData queryData = eoFreightImportManager.queryFreightImportByCondition(queryInfo);
		responseData.setData(queryData);
		return responseData;
	}

	@Override
	public ResponseData<EoFreightImportModelDto> saveEoFreightImportSingleAndPaymentAndContainer(
			EoFreightImportModelDto eoFreightImportModelDto) {
		ResponseData<EoFreightImportModelDto> responseData = new ResponseData<>();
		EoFreightImportModel singleEoFreightImportModel = eoFreightImportModelDto.getSingleEoFreightImportModel();
		EoFreightImportModel paymentEoFreightImportModel = eoFreightImportModelDto.getPaymentEoFreightImportModel();
		EoFreightImportModel containerDetentioEoFreightImportModel = eoFreightImportModelDto.getContainerDetentioEoFreightImportModel();
		List<EoImportJoabBoxModel> eoImportJoabBoxModelList = eoFreightImportModelDto.getEoImportJoabBoxModelList();
		EoFreightImportModelDto aftereEoFreightImportModelDto = new EoFreightImportModelDto();
		if (null != singleEoFreightImportModel) {
			singleEoFreightImportModel = eoFreightImportManager.save(singleEoFreightImportModel);
			aftereEoFreightImportModelDto.setSingleEoFreightImportModel(singleEoFreightImportModel);
		} 
		if (null != paymentEoFreightImportModel) {
			paymentEoFreightImportModel = eoFreightImportManager.save(paymentEoFreightImportModel);
			aftereEoFreightImportModelDto.setPaymentEoFreightImportModel(paymentEoFreightImportModel);
		} 
		if (EmptyUtils.isNotEmpty(eoImportJoabBoxModelList)) {
			List<EoImportJoabBoxModel> afterEoImportJoabBoxModelList = eoImportJoabBoxManager.saveAll(eoImportJoabBoxModelList);
			aftereEoFreightImportModelDto.setEoImportJoabBoxModelList(afterEoImportJoabBoxModelList);
		}
		if (null != containerDetentioEoFreightImportModel) {
			containerDetentioEoFreightImportModel = eoFreightImportManager.save(containerDetentioEoFreightImportModel);
			aftereEoFreightImportModelDto.setContainerDetentioEoFreightImportModel(containerDetentioEoFreightImportModel);
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("保存失败");
			return responseData;
		}
		responseData.setData(aftereEoFreightImportModelDto);
		responseData.setCode(Constants.YES);
		responseData.setMsg("保存成功");
		return responseData;
	}

	@Override
	public ResponseData<QueryData> queryFreightImportTrackByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData=new ResponseData<QueryData>();
		QueryData queryData = eoFreightImportManager.queryFreightImportTrackByCondition(queryInfo);
		responseData.setData(queryData);
		return responseData;
	}

}
