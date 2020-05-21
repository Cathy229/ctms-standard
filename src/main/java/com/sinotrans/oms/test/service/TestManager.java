package com.sinotrans.oms.test.service;

import java.util.List;
import java.util.Map;

import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.framework.service.servicefacade.annotation.ServiceCode;
import com.sinotrans.framework.service.servicefacade.annotation.ServiceParameter;
import com.sinotrans.oms.test.model.BswhWarehouseModel;

public interface TestManager extends MybatisManager {

	BswhWarehouseModel get();

	List<Map<String, Object>> query();

	@ServiceCode(value = "GET_FACADE")
	String testFacade(@ServiceParameter("p1") String param);

}
