package com.sinotrans.oms.system.service;

import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.customerproject.dto.ProjectDto;

public interface EsCompanyService {
	public ResponseData<ProjectDto> getCurrentCompany();
}
