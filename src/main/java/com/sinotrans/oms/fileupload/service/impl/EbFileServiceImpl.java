package com.sinotrans.oms.fileupload.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.fileupload.manager.EbFileManager;
import com.sinotrans.oms.fileupload.model.EbFileModel;
import com.sinotrans.oms.fileupload.service.EbFileService;
@Service
public class EbFileServiceImpl implements EbFileService {
	
	@Autowired
	private EbFileManager ebFileManager;
	
	@Override
	public ResponseData<EbFileModel> get(Long id) {
		ResponseData<EbFileModel> responseData = new ResponseData<>();
		EbFileModel ebFileModel = ebFileManager.get(id);
		responseData.setData(ebFileModel);
		responseData.setCode(Constants.YES);
		responseData.setMsg("查询文件成功");
		return responseData;
	}

	@Override
	public List<EbFileModel> findByCondition(List<FilterCondition> conditions) {
		// TODO Auto-generated method stub
		return ebFileManager.findByCondition(conditions);
	}

	@Override
	public List<EbFileModel> saveAll(List<EbFileModel> models) {
		// TODO Auto-generated method stub
		return ebFileManager.saveAll(models);
	}

	@Override
	public void delete(EbFileModel model) {
		ebFileManager.delete(model);

	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		// TODO Auto-generated method stub
		ebFileManager.batchDelete(conditions);
	}

	@Override
	public ResponseData<EbFileModel> deleteByPk(Long id) {
		ResponseData<EbFileModel> responseData = new ResponseData<>();
		ebFileManager.deleteByPk(id);
		responseData.setCode(Constants.YES);
		responseData.setMsg("删除文件成功");
		return responseData;
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		ebFileManager.deleteByPks(ids);
	}

	@Override
	public ResponseData<EbFileModel> save(EbFileModel model) {
		EbFileModel ebFileModel = ebFileManager.save(model);
		ResponseData<EbFileModel> responseData = new ResponseData<>();
		responseData.setData(ebFileModel);
		return responseData;
	}

	@Override
	public ResponseData<QueryData> getFileByCondition(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData=new ResponseData<QueryData>();
		QueryData queryData = ebFileManager.getFileByCondition(queryInfo);
		responseData.setData(queryData);
		return responseData;
	}
	@Override
	public ResponseData<QueryData> getFileByElct(QueryInfo queryInfo) {
		ResponseData<QueryData> responseData=new ResponseData<QueryData>();
		QueryData queryData = ebFileManager.getFileByElct(queryInfo);
		responseData.setData(queryData);
		return responseData;
	}

	@Override
	public ResponseData<List<EbFileModel>> batchSaveFile(List<EbFileModel> ebFileModelList) {
		ResponseData<List<EbFileModel>> responseData = new ResponseData<>();
		List<EbFileModel> afterEbFileModelList = new ArrayList<>();
		if (EmptyUtils.isNotEmpty(ebFileModelList)) {
			afterEbFileModelList = ebFileManager.saveAll(ebFileModelList);
			if (EmptyUtils.isNotEmpty(afterEbFileModelList)) {
				responseData.setData(afterEbFileModelList);
				responseData.setCode(Constants.YES);
				responseData.setMsg("保存成功");
			} else {
				responseData.setCode(Constants.NO);
				responseData.setMsg("保存失败");
			}
		} else {
			responseData.setCode(Constants.NO);
			responseData.setMsg("保存失败");
		}
		return responseData;
	}

	@Override
	public ResponseData<List<EbFileModel>> getEbflFile(EbFileModel ebFileModel) {
		ResponseData<List<EbFileModel>> responseData = new ResponseData<>();
		if (null != ebFileModel) {
			List<FilterCondition> eoorFilterCondition = new ArrayList<>();
			eoorFilterCondition.add(new FilterCondition("ebflEoorId", ebFileModel.getEbflEoorId(),"="));
			if (null != ebFileModel.getEbflSubstr3()) {
				eoorFilterCondition.add(new FilterCondition("ebflSubstr3", ebFileModel.getEbflSubstr3(),"="));
			}
			if (null != ebFileModel.getEbflSubstr4()) {
				eoorFilterCondition.add(new FilterCondition("ebflSubstr4", ebFileModel.getEbflSubstr4(),"="));
			}
			if (null != ebFileModel.getEbflSubstr5()) {
				eoorFilterCondition.add(new FilterCondition("ebflSubstr5", ebFileModel.getEbflSubstr5(),"="));
			}
			List<EbFileModel> ebFileModelList = ebFileManager.findByCondition(eoorFilterCondition);
			if (EmptyUtils.isNotEmpty(ebFileModelList)) {
				responseData.setCode(Constants.YES);
				responseData.setData(ebFileModelList);
			}
		} else {
			responseData.setCode(Constants.NO);
		}
		return responseData;
	}

}
