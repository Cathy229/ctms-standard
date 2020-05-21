package com.sinotrans.oms.businessrule.manager.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.businessrule.dto.EsControlParamQueryItem;
import com.sinotrans.oms.businessrule.manager.EsControlParamManager;
import com.sinotrans.oms.businessrule.model.EsControlParamModel;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.system.dto.GetCompanyEscpByCodeQueryItem;
import com.sinotrans.oms.system.manager.EsCompanyManager;
import com.sinotrans.oms.system.model.EsCompanyModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EsControlParamManagerImpl extends MybatisManagerImpl implements EsControlParamManager{

	@Autowired
	private EsCompanyManager esCompanyManager;//公司
	@Autowired
	private EsControlParamManager esControlParamManager;
	@Override
	public EsControlParamModel get(Long id) {
		
		return this.myBatisDao.get(EsControlParamModel.class, id);
	}

	@Override
	public List<EsControlParamModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EsControlParamModel.class, null, null, conditions);
	}

	@Override
	public EsControlParamModel save(EsControlParamModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EsControlParamModel> saveAll(List<EsControlParamModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EsControlParamModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EsControlParamModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EsControlParamModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EsControlParamModel.class, ids);
	}
	

	/**
	 * 查询公司的参数值
	 * @return
	 */
	@Override
	public String getIsCompanyValue(String Code){
		//首先取公司自己的参数值，如果取不到就取系统默认的参数值
		String value = this.getCompanyEscpValueByCode(Code);
		if(value == null || value.equals("")){
			return this.getDefaultEscpValueByCode(Code);
		}
		return value ;
	}
	
	/**
	 * 通过参数代码查询当前公司的公司级别系统控制参数值
	 * @param escpCode
	 * @return
	 */
	public String getCompanyEscpValueByCode(String escpCode){
		
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("escpCode", escpCode);
		UserDetails user = SessionContext.getUser();
		//增加空判断 , 防止报错 add by ricky 20150729
		if(user != null && null!=user.getOrgId()){
			condition.put("esssEscoId", Long.valueOf(SessionContext.getUser().getOrgId()));
		}
		
		List<Map<String, Object>> list = this.myBatisDao.queryByCondition("com.sinotrans.oms.system.mapper.GetCompanyEscpByCodeQuery", condition, null, null, null);
		List<GetCompanyEscpByCodeQueryItem> companyEscpByCodeQueryList = new ArrayList<>();
		if (EmptyUtils.isEmpty(list)) {
			return null;
		}
		for (@SuppressWarnings("rawtypes") Map map : list) {
			companyEscpByCodeQueryList.add((GetCompanyEscpByCodeQueryItem) BlukInsertUtils.parseMapToObject(map, new GetCompanyEscpByCodeQueryItem()));
		}
		return companyEscpByCodeQueryList.get(0).getEscpValue();
	}
	/**
	 * 通过参数代码查询默认系统控制参数值
	 * @param escpCode
	 * @return
	 */
	public String getDefaultEscpValueByCode(String escpCode){
		
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("escpCode", escpCode);
		
		List<Map<String, Object>> list = this.myBatisDao.queryByCondition("com.sinotrans.oms.businessrequest.mapper.EsControlParamQuery", condition, null, null, null);
		List<EsControlParamQueryItem> controlParamQueryList = new ArrayList<>();
		if (EmptyUtils.isEmpty(list)) {
			return null;
		}
		for (@SuppressWarnings("rawtypes") Map map : list) {
			controlParamQueryList.add((EsControlParamQueryItem) BlukInsertUtils.parseMapToObject(map, new EsControlParamQueryItem()));
		}
		return controlParamQueryList.get(0).getEscpValue();
		
	}

	@Override
	public String getIsCompanyValue(String Code, String escoCompanyNo) {
		//首先取公司自己的参数值，如果取不到就取系统默认的参数值
		String value = this.getCompanyEscpValueByCode(Code,escoCompanyNo);
		if(value == null || value.equals("")){
			return this.getDefaultEscpValueByCode(Code);
		}
		return value;
	}
	
	/**
	 * 通过参数代码查询当前公司的公司级别系统控制参数值
	 * @author Shoven.Jiang  
	 * @date 2018年9月14日
	 * @param escpCode
	 * @param escoCompanyNo
	 * @return
	 */
	private String getCompanyEscpValueByCode(String escpCode, String escoCompanyNo){
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("escpCode", escpCode);
		EsCompanyModel esCompanyModel = new EsCompanyModel();
		if (EmptyUtils.isNotEmpty(escoCompanyNo)) {
			List<FilterCondition> escoCondition = new ArrayList<>();
			escoCondition.add(new FilterCondition("escoCompanyNo", escoCompanyNo, "="));
			List<EsCompanyModel> esCompanyModels = this.esCompanyManager.findByCondition(escoCondition);
			if (EmptyUtils.isNotEmpty(esCompanyModels)) {
				esCompanyModel = esCompanyModels.get(0);
				condition.put("esssEscoId", esCompanyModel.getEscoId());
			}
		}
		List<Map<String, Object>> list = this.myBatisDao.queryByCondition("com.sinotrans.oms.system.mapper.GetCompanyEscpByCodeQuery", condition, null, null, null);
		List<GetCompanyEscpByCodeQueryItem> companyEscpByCodeQueryList = new ArrayList<>();
		if (EmptyUtils.isEmpty(list)) {
			return null;
		}
		for (@SuppressWarnings("rawtypes") Map map : list) {
			companyEscpByCodeQueryList.add((GetCompanyEscpByCodeQueryItem) BlukInsertUtils.parseMapToObject(map, new GetCompanyEscpByCodeQueryItem()));
		}
		return companyEscpByCodeQueryList.get(0).getEscpValue();
	}
	
	/**
	 * 查询系统级别的控制参数
	 * @author Shoven.Jiang  
	 * @date 2018年9月15日
	 * @param params
	 * @return
	 */
	public Map<String, Object> getControlParamValues(String... params) {
		Map<String, Object> map=new HashMap<String, Object>();
		List<FilterCondition> escpConditons = new ArrayList<>();
		escpConditons.add(new FilterCondition("escpRange", Constants.SYS_SCOPE_SYSTEM, "="));
		escpConditons.add(new FilterCondition("escpCode", params, "in"));
		List<EsControlParamModel> controlParams = this.esControlParamManager.findByCondition(escpConditons);
		//将查询出得结果映射到map中
		if (EmptyUtils.isNotEmpty(controlParams) && controlParams.size() >0) {
			for (int i = 0; i < params.length; i++) {
				String code=params[i];
				for (EsControlParamModel esControlParamModel : controlParams) {
					if (code.equals(esControlParamModel
							.getEscpCode())) {
						map.put(code, esControlParamModel.getEscpValue());
					}
				}
			}
		}
		return map;
	}
	

}
