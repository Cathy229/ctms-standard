package com.sinotrans.oms.system.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.customerproject.dto.ProjectDto;
import com.sinotrans.oms.customerproject.manager.EbCustomerManager;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.system.manager.EsCompanyManager;
import com.sinotrans.oms.system.model.EsCompanyModel;
import com.sinotrans.oms.system.service.EsCompanyService;
@Service
public class EsCompanyServiceImpl implements EsCompanyService {
	
	@Autowired
	private EsCompanyManager esCompanyManager;

	@Override
	public ResponseData<ProjectDto> getCurrentCompany() {
		ResponseData<ProjectDto> responseData = new ResponseData<>();
		List<EsCompanyModel> resultList = new ArrayList<EsCompanyModel>();
		
		UserDetails user = SessionContext.getUser();
		ProjectDto projectDto = new ProjectDto();
		projectDto.setProjectId(user.getProjectId());
		projectDto.setProjectName(user.getProjectName());
		projectDto.setOrgId(user.getOrgId());
		projectDto.setOrgName(user.getOrgName());
		
		Boolean isSuper=false;
		String companyId = user.getOwnOrgId();
		try {
			if(user.isAdmin()){
				isSuper=true;
			}else{
				Map<String, Object> conditions = new HashMap<>();
				conditions.put("escoId", Long.valueOf(user.getOrgId()));
				conditions.put("userId", Long.valueOf(user.getUserId()));
				conditions.put("userGroupCode", Constants.ADMIN_GROUP);
				List<Map<String, Object>> superList = this.esCompanyManager.querySQL1(conditions);
				if(EmptyUtils.isNotEmpty(superList)/* || superList.size() == 0*/){
					isSuper=true;
				}
			}
			if(isSuper){
				Map<String, Object> conditions = new HashMap<>();
				EsCompanyModel escoModel = this.esCompanyManager.get(Long.valueOf(user.getOrgId()));
				conditions.put("escoPath", escoModel.getEscoPath() + "%");
				resultList = this.esCompanyManager.querySQL2(conditions);
			}else{
				resultList.add(this.esCompanyManager.get(Long.valueOf(companyId)));
			}
		} catch (Exception e) {
			responseData.setCode(Constants.NO);
			responseData.setMsg("查询公司列表失败:"+e.getMessage());
			e.printStackTrace();
		}
		projectDto.setOrgItem(resultList);
		responseData.setCode(Constants.YES);
		responseData.setMsg("公司列表查询成功");
		responseData.setData(projectDto);
		return responseData;
	}
	

}
