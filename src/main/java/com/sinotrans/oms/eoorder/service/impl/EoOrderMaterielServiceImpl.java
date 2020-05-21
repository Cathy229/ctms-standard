package com.sinotrans.oms.eoorder.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.businessrequest.model.EoOutmportJoabMaterielModel;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.eoorder.manager.EoConsignmentManager;
import com.sinotrans.oms.eoorder.manager.EoConsignmentMaterielManager;
import com.sinotrans.oms.eoorder.manager.EoEoob2EomjManager;
import com.sinotrans.oms.eoorder.manager.EoOrderManager;
import com.sinotrans.oms.eoorder.manager.EoOrderMaterielManager;
import com.sinotrans.oms.eoorder.manager.EoOutmportJoabMaterielManager;
import com.sinotrans.oms.eoorder.model.EoConsignmentModel;
import com.sinotrans.oms.eoorder.model.EoEoob2EomjModel;
import com.sinotrans.oms.eoorder.model.EoOrderMaterielModel;
import com.sinotrans.oms.eoorder.model.EoOrderModel;
import com.sinotrans.oms.eoorder.service.EoOrderMaterielService;
import com.sinotrans.oms.eoorder.service.EoOrderService;
@Service
public class EoOrderMaterielServiceImpl implements EoOrderMaterielService{

	@Autowired
	private EoOrderMaterielManager eoOrderMaterielManager;
	@Autowired
	private EoOrderManager eoOrderManager;
	@Autowired
	private EoConsignmentManager eoConsignmentManager;
	@Autowired
	private EoOutmportJoabMaterielManager eoOutmportJoabMaterielManager;
	@Autowired
	private EoOrderService eoOrderService;
	@Autowired
	private EoEoob2EomjManager eoEoob2EomjManager;
	
	@Override
	public ResponseData deleteOrderMaterial(Long eoomId) {
		ResponseData response = new ResponseData();
		if (null != eoomId) {
			this.eoOrderMaterielManager.deleteByPk(eoomId);
			response.setCode(Constants.YES);
			response.setMsg("删除成功");
		} else {
			response.setCode(Constants.NO);
			response.setMsg("未查询到物料信息，请重试");
		}
		return response;
	}
	
	@Override
	public ResponseData batchDeleteOrderMaterial(Collection<Long> eoomIds) {
		ResponseData response = new ResponseData();
		if (EmptyUtils.isNotEmpty(eoomIds)) {
			ArrayList<Long> ids = new ArrayList<>(eoomIds);
			EoOrderMaterielModel eoomModel = this.eoOrderMaterielManager.get(ids.get(0));
			if (eoomModel.getEoomEoorId() != null) {
				EoOrderModel eoorModel = this.eoOrderManager.get(eoomModel.getEoomEoorId());
				EoConsignmentModel eocsModel = this.eoConsignmentManager.get(eoorModel.getEoorEocsId());
				if (eocsModel!=null) {
					if (eocsModel != null && Constants.YES.equals(eocsModel.getEocsIsIssuedEnd())) {
						response.setCode(Constants.NO);
						response.setMsg("委托物料已下达完成,无法操作!");
						return response;
					}
				}
			}
			
			this.deleteEoOutmportJoabMateriel(eoomIds);
			
			this.eoOrderMaterielManager.deleteByPks(eoomIds);
			response.setCode(Constants.YES);
			response.setMsg("删除成功");
		} else {
			response.setCode(Constants.NO);
			response.setMsg("物料信息ID为空，不允许删除，请重试");
		}
		return response;
	}

	/**
	 * @deprecated:删除相关业务物料信息和箱货关系
	 * @author Colley.Bai  
	 * @date 2019年1月3日
	 * @param eoomIds
	 */
	public void deleteEoOutmportJoabMateriel(Collection<Long> eoomIds){
		if (EmptyUtils.isNotEmpty(eoomIds)) {
			for (Long eoomId : eoomIds) {
				List<FilterCondition> eoomIdFilterCondition = new ArrayList<>();
				eoomIdFilterCondition.add(new FilterCondition("eomjEoomId", eoomId,"="));
				List<EoOutmportJoabMaterielModel> eoOutmportJoabMaterielModelList = eoOutmportJoabMaterielManager.findByCondition(eoomIdFilterCondition);
				if (EmptyUtils.isNotEmpty(eoOutmportJoabMaterielModelList)) {
					List<Long> eoejIds = new ArrayList<>();
					for (EoOutmportJoabMaterielModel eoOutmportJoabMaterielModel : eoOutmportJoabMaterielModelList) {
						List<FilterCondition> eomjIdFilterCondition = new ArrayList<>();
						eomjIdFilterCondition.add(new FilterCondition("eoejEomjId", eoOutmportJoabMaterielModel.getEomjId(),"="));
						List<EoEoob2EomjModel> eoEoob2EomjModelList = eoEoob2EomjManager.findByCondition(eomjIdFilterCondition);
						for (EoEoob2EomjModel eoEoob2EomjModel :  eoEoob2EomjModelList) {
							eoejIds.add(eoEoob2EomjModel.getEoejId());
						}
					}
					eoOrderService.batchDeleteEoEoob2Eomj(eoejIds);
				}
			}
		}
	}

	@Override
	public ResponseData getOrderMaterialById(Long eoomId) {
		ResponseData<EoOrderMaterielModel> response = new ResponseData<>();
		EoOrderMaterielModel eoomModel = this.eoOrderMaterielManager.get(eoomId);
		response.setData(eoomModel);
		response.setCode(Constants.YES);
		response.setMsg("查询成功");
		return response;
	}


	@Override
	public ResponseData queryOrderMaterialByModel(QueryInfo queryInfo) {
		queryInfo.setQueryType("com.sinotrans.oms.eoorder.mapper.EoOrderListQuery");
		this.eoOrderMaterielManager.queryOrderMaterialByModel(queryInfo);
		return this.eoOrderMaterielManager.queryOrderMaterialByModel(queryInfo);
		
//		ResponseData<List<EoOrderMaterielModel>> response = new ResponseData<>();
//		List<FilterCondition> conditions = new ArrayList<>();
//		Set<String> set = condition.keySet();
//		for (String key : set) {
//			conditions.add(new FilterCondition(key,condition.get(key),"="));
//		}
//		List<EoOrderMaterielModel> eoomList = this.eoOrderMaterielManager.findByCondition(conditions);
//		response.setData(eoomList);
//		response.setCode(Constants.YES);
//		response.setMsg("查询成功");
//		return response;
	}

}
