package com.sinotrans.oms.customerproject.conroller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.ResponseData;
import com.sinotrans.oms.customerproject.service.EbProjectService;
import com.sinotrans.oms.fees.service.EfbfBusinessFeesService;
import com.sinotrans.oms.system.dto.EsProjectNameByUserIdQueryItem;
/**
 * 
 * @author simon
 *
 */
@RestController
@RequestMapping(value = "/ebProjectController")
public class EbProjectController {
	
	@Autowired
	private EbProjectService ebProjectService;
	/**
	 * add by shoven 2018年7月21日23:24:34
	 * 测试使用，用于获取订单委托信息
	 * @param json
	 * @return
	 */
	@RequestMapping(value = "/getProjectItem", method = RequestMethod.GET, produces = Constants.PRODUCES_CODE)
	public ResponseData<List> getProjectItem(@RequestParam(value = Constants.ACCESSTOKEN_PARAMETER_NAME) String accessToken) {
		
		@SuppressWarnings("rawtypes")
		ResponseData<List> responseData = ebProjectService.getProjectItem();
		responseData.setMsg("查询项目成功");
		responseData.setCode(Constants.YES);
		//responseData.setData(list);
		return responseData;
	}
	
}
