package com.sinotrans.oms.businessrequest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.businessrequest.dto.EoRequestInspectionDto;
import com.sinotrans.oms.businessrequest.manager.EoEorn2EonmManager;
import com.sinotrans.oms.businessrequest.manager.EoInspCertificateManager;
import com.sinotrans.oms.businessrequest.manager.EoRequestInspectionManager;
import com.sinotrans.oms.businessrequest.model.EoEorn2EonmModel;
import com.sinotrans.oms.businessrequest.model.EoInspCertificateModel;
import com.sinotrans.oms.businessrequest.model.EoRequestInspectionModel;
import com.sinotrans.oms.businessrequest.service.EoRequestInspectionService;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.EmptyUtils;

/**  
* Title: EoRequestInspectionServiceImpl  
* Description:  报检service
* @author Colley.Bai  
* @date 2019年02月21日  
* @version 1.0  
*/

@Service
public class EoRequestInspectionServiceImpl implements EoRequestInspectionService {

	@Autowired
	private EoRequestInspectionManager eoRequestInspectionManager;//报检
	
	@Autowired
	private EoInspCertificateManager eoInspCertificateManager;//随附单据
	
	@Autowired
	private EoEorn2EonmManager eoEorn2EonmManager;//货物名称
	
	@Override
	public ResponseData<EoRequestInspectionModel> saveRequestInspection(
			EoRequestInspectionModel eoRequestInspectionModel) {
		ResponseData<EoRequestInspectionModel> responseData = new ResponseData<EoRequestInspectionModel>();
		EoRequestInspectionModel afterEoRequestInspectionModel = eoRequestInspectionManager.save(eoRequestInspectionModel);
		if (null != afterEoRequestInspectionModel) {
			responseData.setMsg("保存成功");
			responseData.setCode(Constants.YES);
			responseData.setData(afterEoRequestInspectionModel);
		} else {
			responseData.setMsg("保存失败");
			responseData.setCode(Constants.NO);
			responseData.setData(afterEoRequestInspectionModel);
		}
		return responseData;
	}

	@Override
	public ResponseData<List<EoRequestInspectionModel>> batchDeleteRequestInspection(List<Long> eornIds) {
		ResponseData<List<EoRequestInspectionModel>> responseData = new ResponseData<List<EoRequestInspectionModel>>();
		if (EmptyUtils.isNotEmpty(eornIds)) {
			for (Long eornId : eornIds) {
				List<FilterCondition> eoncFilterConditions = new ArrayList<>();
				eoncFilterConditions.add(new FilterCondition("eoncEornId", eornId, "="));
				//查询所属单据信息
				List<EoInspCertificateModel> eoInspCertificateModelList = eoInspCertificateManager.findByCondition(eoncFilterConditions);
				if (EmptyUtils.isNotEmpty(eoInspCertificateModelList)) {
					for (EoInspCertificateModel eoInspCertificateModel : eoInspCertificateModelList) {
						//删除所属单据信息
						eoInspCertificateManager.delete(eoInspCertificateModel);
					}
				}
				//查询所属货物信息
				List<FilterCondition> eonmFilterConditions = new ArrayList<>();
				eonmFilterConditions.add(new FilterCondition("eonmEornId", eornId, "="));
				List<EoEorn2EonmModel> eoEorn2EonmModelList = eoEorn2EonmManager.findByCondition(eonmFilterConditions);
				if (EmptyUtils.isNotEmpty(eoEorn2EonmModelList)) {
					for (EoEorn2EonmModel eoEorn2EonmModel : eoEorn2EonmModelList) {
						//删除所属货物信息
						eoEorn2EonmManager.delete(eoEorn2EonmModel);
					}
				}
			}
			//删除报检信息
			eoRequestInspectionManager.deleteByPks(eornIds);
			responseData.setCode(Constants.YES);
			responseData.setMsg("删除成功");
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("ID为空，不允许删除，请重试");
		}
		return responseData;
	}

	@SuppressWarnings("unused")
	@Override
	public ResponseData<EoRequestInspectionDto> saveRequestInspectionAndCertificateAndEonm(
			EoRequestInspectionDto eoRequestInspectionDto) {
		ResponseData<EoRequestInspectionDto> responseData = new ResponseData<>();
		EoRequestInspectionDto afterEoRequestInspectionDto = new EoRequestInspectionDto();
		EoRequestInspectionModel eoRequestInspectionModel = eoRequestInspectionDto.getEoRequestInspectionModel();
		List<EoInspCertificateModel> eoInspCertificateModelList = eoRequestInspectionDto.getEoInspCertificateModelList();
		List<EoInspCertificateModel> afterEoInspCertificateModelList = eoRequestInspectionDto.getAfterEoInspCertificateModelList();
		List<EoEorn2EonmModel> eoEorn2EonmModelList = eoRequestInspectionDto.getEoEorn2EonmModelList();
		if (null != eoRequestInspectionModel) {
			//1.基本信息
			EoRequestInspectionModel afterEoRequestInspectionModel = eoRequestInspectionManager.save(eoRequestInspectionModel);
			//1.1返回值
			afterEoRequestInspectionDto.setEoRequestInspectionModel(afterEoRequestInspectionModel);
			//2.随附单据
			if (EmptyUtils.isNotEmpty(eoInspCertificateModelList)) {
				for (EoInspCertificateModel eoInspCertificateModel : eoInspCertificateModelList) {
					eoInspCertificateModel.setEoncEornId(eoRequestInspectionModel.getEornId());
					eoInspCertificateModel.setEoncDocuCode("1");
				}
				List<EoInspCertificateModel> beforEoInspCertificateModelList = eoInspCertificateManager.saveAll(eoInspCertificateModelList);
				//2.1返回值
				afterEoRequestInspectionDto.setEoInspCertificateModelList(beforEoInspCertificateModelList);
			}
			//3.需要单据名称
			if (EmptyUtils.isNotEmpty(afterEoInspCertificateModelList)) {
				for (EoInspCertificateModel eoInspCertificateModel : afterEoInspCertificateModelList) {
					eoInspCertificateModel.setEoncEornId(eoRequestInspectionModel.getEornId());
					eoInspCertificateModel.setEoncDocuCode("2");
				}
				List<EoInspCertificateModel> endEoInspCertificateModelList = eoInspCertificateManager.saveAll(afterEoInspCertificateModelList);
				//3.1返回值
				afterEoRequestInspectionDto.setAfterEoInspCertificateModelList(endEoInspCertificateModelList);
			}
			//4.货物信息
			if (EmptyUtils.isNotEmpty(eoEorn2EonmModelList)) {
				for (EoEorn2EonmModel eoEorn2EonmModel : eoEorn2EonmModelList) {
					eoEorn2EonmModel.setEonmEornId(eoRequestInspectionModel.getEornId());
				}
				List<EoEorn2EonmModel> afterEoEorn2EonmModelList = eoEorn2EonmManager.saveAll(eoEorn2EonmModelList);
				//4.1返回值
				afterEoRequestInspectionDto.setEoEorn2EonmModelList(afterEoEorn2EonmModelList);
			}
			
			List<FilterCondition> eoorFilterCondition = new ArrayList<>();
			eoorFilterCondition.add(new FilterCondition("eornEoorId", afterEoRequestInspectionModel.getEornEoorId(),"="));
			List<EoRequestInspectionModel> eoRequestInspectionModelList = eoRequestInspectionManager.findByCondition(eoorFilterCondition);
			if (EmptyUtils.isNotEmpty(eoRequestInspectionModelList)) {
				afterEoRequestInspectionDto.setEoRequestInspectionModelList(eoRequestInspectionModelList);
			}
		}
		if (null == afterEoRequestInspectionDto) {
			responseData.setMsg("保存失败");
			responseData.setCode(Constants.NO);
			return responseData;
		}
		responseData.setMsg("保存成功");
		responseData.setCode(Constants.YES);
		responseData.setData(afterEoRequestInspectionDto);
		return responseData;
	}

	@Override
	public ResponseData<EoRequestInspectionDto> getRequestInspectionAndCertificateAndEonmByEoordId(Long eoorId) {
		ResponseData<EoRequestInspectionDto> responseData = new ResponseData<>();
		if (null != eoorId) {
			EoRequestInspectionDto eoRequestInspectionDto = new EoRequestInspectionDto();
			List<FilterCondition> eoorFilterCondition = new ArrayList<>();
			eoorFilterCondition.add(new FilterCondition("eornEoorId", eoorId, "="));
			//1.获取报检信息
			List<EoRequestInspectionModel> eoRequestInspectionModelList = eoRequestInspectionManager.findByCondition(eoorFilterCondition);
			if (EmptyUtils.isNotEmpty(eoRequestInspectionModelList)) {
				for (EoRequestInspectionModel eoRequestInspectionModel : eoRequestInspectionModelList) {
					List<FilterCondition> eornFilterCondition = new ArrayList<>();
					eornFilterCondition.add(new FilterCondition("eoncEornId", eoRequestInspectionModel.getEornId(),"="));
					eornFilterCondition.add(new FilterCondition("eoncDocuCode", "1","="));
					//2.随附单据
					List<EoInspCertificateModel> eoInspCertificateModelList = eoInspCertificateManager.findByCondition(eornFilterCondition);
					
					List<FilterCondition> afterEornFilterCondition = new ArrayList<>();
					afterEornFilterCondition.add(new FilterCondition("eoncEornId", eoRequestInspectionModel.getEornId(),"="));
					afterEornFilterCondition.add(new FilterCondition("eoncDocuCode", "2","="));
					//3.需要单据名称
					List<EoInspCertificateModel> afterEoInspCertificateModelList = eoInspCertificateManager.findByCondition(afterEornFilterCondition);
				
					List<FilterCondition> eonmFilterCondition = new ArrayList<>();
					eonmFilterCondition.add(new FilterCondition("eonmEornId", eoRequestInspectionModel.getEornId(),"="));
					//4.货物信息
					List<EoEorn2EonmModel> eoEorn2EonmModelList = eoEorn2EonmManager.findByCondition(eonmFilterCondition);
				
					eoRequestInspectionDto.setEoInspCertificateModelList(eoInspCertificateModelList);
					eoRequestInspectionDto.setAfterEoInspCertificateModelList(afterEoInspCertificateModelList);
					eoRequestInspectionDto.setEoEorn2EonmModelList(eoEorn2EonmModelList);
				}
				eoRequestInspectionDto.setEoRequestInspectionModelList(eoRequestInspectionModelList);
			}
			responseData.setCode(Constants.YES);
			responseData.setData(eoRequestInspectionDto);
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("查询失败");
		}
		return responseData;
	}

	@Override
	public ResponseData<EoRequestInspectionDto> getRequestInspectionAndCertificateAndEonmById(Long eornId) {
		ResponseData<EoRequestInspectionDto> responseData = new ResponseData<>();
		EoRequestInspectionDto eoRequestInspectionDto = new EoRequestInspectionDto();
		if (null != eornId) {
			//1.获取报检信息
			EoRequestInspectionModel eoRequestInspectionModel = eoRequestInspectionManager.get(eornId);
			List<FilterCondition> eornFilterCondition = new ArrayList<>();
			eornFilterCondition.add(new FilterCondition("eoncEornId", eornId,"="));
			eornFilterCondition.add(new FilterCondition("eoncDocuCode", "1","="));
			//2.随附单据
			List<EoInspCertificateModel> eoInspCertificateModelList = eoInspCertificateManager.findByCondition(eornFilterCondition);
			
			List<FilterCondition> afterEornFilterCondition = new ArrayList<>();
			afterEornFilterCondition.add(new FilterCondition("eoncEornId", eornId,"="));
			afterEornFilterCondition.add(new FilterCondition("eoncDocuCode", "2","="));
			//3.需要单据名称
			List<EoInspCertificateModel> afterEoInspCertificateModelList = eoInspCertificateManager.findByCondition(afterEornFilterCondition);
		
			List<FilterCondition> eonmFilterCondition = new ArrayList<>();
			eonmFilterCondition.add(new FilterCondition("eonmEornId", eornId,"="));
			//4.货物信息
			List<EoEorn2EonmModel> eoEorn2EonmModelList = eoEorn2EonmManager.findByCondition(eonmFilterCondition);
			
			eoRequestInspectionDto.setEoRequestInspectionModel(eoRequestInspectionModel);
			eoRequestInspectionDto.setEoInspCertificateModelList(eoInspCertificateModelList);
			eoRequestInspectionDto.setAfterEoInspCertificateModelList(afterEoInspCertificateModelList);
			eoRequestInspectionDto.setEoEorn2EonmModelList(eoEorn2EonmModelList);
			
			responseData.setCode(Constants.YES);
			responseData.setData(eoRequestInspectionDto);
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("查询失败");
		}
		return responseData;
	}

}
