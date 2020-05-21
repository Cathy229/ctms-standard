/**
 * <p>Description: 
 *    
 * </p>
 *
 * @author James
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本     修改人   	修改日期   	修改内容
 * 2018年8月8日   创建人    20091201 	创建
 * 
 * 
 * </pre>
 */
package com.sinotrans.oms.businessrequest.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.oms.businessrequest.manager.EoEooc2EoetManager;
import com.sinotrans.oms.businessrequest.manager.EoEoom2EoetManager;
import com.sinotrans.oms.businessrequest.model.EoEooc2EoetModel;
import com.sinotrans.oms.businessrequest.model.EoEoom2EoetModel;
import com.sinotrans.oms.businessrequest.service.EoEoom2EoetService;
import com.sinotrans.oms.businessrule.manager.EsControlParamManager;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.manager.ProcedureManager;
import com.sinotrans.oms.common.util.EmptyUtils;

/**
 * <p>Description: 拖车货物业务逻辑实现类
 *    
 * </p>
 *
 * @author James
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本     修改人   	修改日期   	修改内容
 * 2018年8月8日     James       	               创建
 * 
 * 
 * </pre>
 */

@Service
public class EoEoom2EoetServiceImpl implements EoEoom2EoetService {
	
	@Autowired
	private EoEoom2EoetManager eoEoom2EoetManager;
	@Autowired
	private EoEooc2EoetManager eoEooc2EoetManager;
	@Autowired
	private EsControlParamManager esControlParamManager;
	@Autowired
	private ProcedureManager procedureManager;
	
	@Override
	public ResponseData<List<EoEoom2EoetModel>> saveTrailerMaterial(List<EoEoom2EoetModel> eoEoom2EoetModelList) {
		ResponseData<List<EoEoom2EoetModel>> responseData=new ResponseData<List<EoEoom2EoetModel>>();
		List<EoEoom2EoetModel> eoEoom2EoetModelResultList=eoEoom2EoetManager.saveAll(eoEoom2EoetModelList);
		if (EmptyUtils.isEmpty(eoEoom2EoetModelResultList)) {
			responseData.setData(eoEoom2EoetModelList);
			responseData.setCode(Constants.NO);
			responseData.setMsg("保存失败，请重试！");
			return responseData;
		}
		
		List<EoEooc2EoetModel> eoEooc2EoetModelList = this.updateEoEoot2Eoet(eoEoom2EoetModelResultList);
		if (EmptyUtils.isEmpty(eoEooc2EoetModelList)) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("保存失败，请重试！");
			return responseData;
		}
		//拖车物料信息是否同步
		String synchronizedMateriel = this.esControlParamManager.getIsCompanyValue("SYNCHRONOUS_MATERIAL");
		String errm = "";
		if (EmptyUtils.isNotEmpty(synchronizedMateriel) && Constants.YES.equals(synchronizedMateriel)) {
			errm = this.synchronizedEoomAndEobmByEomt(eoEoom2EoetModelList);
		}
		if (EmptyUtils.isNotEmpty(errm)) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("拖车物料信息同步失败，请重试！");
			return responseData;
		}
		
		responseData.setData(eoEoom2EoetModelResultList);
		responseData.setCode(Constants.YES);
		responseData.setMsg("保存成功");
		return responseData;
	}

	

	@Override
	public ResponseData<EoEoom2EoetModel> deleteById(Long eomtId) {
		if (eomtId != null) {
			eoEoom2EoetManager.deleteByPk(eomtId);
			ResponseData<EoEoom2EoetModel> responseData = new ResponseData<>();
			responseData.setData(null);
			return responseData;
		}
		return null;
	}


	@Override
	public ResponseData<List<EoEoom2EoetModel>> deleteByIds(List<Long> eomtIds) {
		if (eomtIds != null && eomtIds.size() > 0) {
			eoEoom2EoetManager.deleteByPks(eomtIds);
			ResponseData<List<EoEoom2EoetModel>> responseData = new ResponseData<>();
			responseData.setData(null);
			return responseData;
		}
		return null;
	}

	/**
	 * @deprecated:更新集装箱毛件体
	 * @author Colley.Bai  
	 * @date 2018年12月21日
	 * @param eoEoom2EoetModelList
	 */
	public List<EoEooc2EoetModel> updateEoEoot2Eoet(List<EoEoom2EoetModel> eoEoom2EoetModelList){
		List<EoEooc2EoetModel> afterEoEooc2EoetModels = new ArrayList<>(); 
		if (EmptyUtils.isNotEmpty(eoEoom2EoetModelList)) {
			Long eomtQuantity = 0L;//件数
			Double eomtWeight = 0.00;//毛重
			Double eomtVolume = 0.00;//体积
			for (EoEoom2EoetModel eoEoom2EoetModel : eoEoom2EoetModelList) {
				eomtQuantity += eoEoom2EoetModel.getEomtQuantity() == null ? 0L : eoEoom2EoetModel.getEomtQuantity();
				eomtWeight += eoEoom2EoetModel.getEomtWeight() == null ? 0.00 : eoEoom2EoetModel.getEomtWeight();
				eomtVolume += eoEoom2EoetModel.getEomtVolume() == null ? 0.00 : eoEoom2EoetModel.getEomtVolume();
			}
			List<FilterCondition> filterCondition = new ArrayList<>();
			filterCondition.add(new FilterCondition("eootEoetId",eoEoom2EoetModelList.get(0).getEomtEoetId(),"="));
			List<EoEooc2EoetModel> eoEooc2EoetModelList = eoEooc2EoetManager.findByCondition(filterCondition);
			if (EmptyUtils.isNotEmpty(eoEooc2EoetModelList)){
				for (EoEooc2EoetModel eoEooc2EoetModel : eoEooc2EoetModelList) {
					eoEooc2EoetModel.setEootQuantity(eomtQuantity);
					eoEooc2EoetModel.setEootWeight(eomtWeight);
					eoEooc2EoetModel.setEootVolume(eomtVolume);
					afterEoEooc2EoetModels.add(eoEooc2EoetModel);
				}
				afterEoEooc2EoetModels = eoEooc2EoetManager.saveAll(afterEoEooc2EoetModels);
			}
		}
		return afterEoEooc2EoetModels;
	}
	
	/**
	 * 根据拖车的集装箱以及物料去同步订单的物料、箱货关系、订舱的物料信息
	 * @author Shoven.Jiang  
	 * @date 2019年1月9日
	 * @param eoEoom2EoetModelList
	 * @param eoEooc2EoetModels
	 */
	public String synchronizedEoomAndEobmByEomt(List<EoEoom2EoetModel> eoEoom2EoetModelList) {
		String errm = "";
		if (EmptyUtils.isNotEmpty(eoEoom2EoetModelList)) {
			errm = this.procedureManager.callEventStoreProcedure("pkg_04_event.SP_SUB_02LO_SYNCHRO_EOOM", "8", eoEoom2EoetModelList.get(0).getEomtEoetId());
		}
		return errm;
	}
	
}
