package com.sinotrans.oms.system.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinotrans.framework.web.mvc.BaseController;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.customerproject.dto.ProjectDto;
import com.sinotrans.oms.system.service.EsCompanyService;

/**
 * 客户供应商 公司
 * @author Harley 20180926
 *
 */
@RestController
@RequestMapping(value = "/esCompanyController")
public class EsCompanyController extends BaseController {

	@Autowired
	private EsCompanyService esCompanyService;
	
	/**
	 * @description 取得当前登录人所属公司及其子公司集合
	 * @author Simon.Guo  
	 * @date 2018年12月7日下午2:22:44
	 * @return
	 */
	@RequestMapping(value = "/getCurrentCompany", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<ProjectDto> getCurrentCompany(@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		ResponseData<ProjectDto> responseData = this.esCompanyService.getCurrentCompany();
		return responseData;
	}
	
}
