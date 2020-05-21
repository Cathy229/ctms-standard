package com.sinotrans.oms.test.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.sinotrans.framework.orm.support.PagingInfo;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.test.model.BswhWarehouseModel;
import com.sinotrans.oms.test.service.TestManager;

@Service
public class TestManagerImpl extends MybatisManagerImpl implements TestManager {

	@Override
	public BswhWarehouseModel get() {
		return this.myBatisDao.get(BswhWarehouseModel.class, 1);
	}

	@Override
	public List<Map<String, Object>> query() {
		Map<String, Object> sqlCond = new HashMap<String, Object>();
		sqlCond.put("bswhId", 1);
		PagingInfo pagingInfo = new PagingInfo(2, 1);
		return this.myBatisDao.queryByCondition("WarehouseQuery", sqlCond, null, pagingInfo, null);
	}

	public void testTransation() {

	}

	public String testFacade(String param) {
		return "abc" + param;
	}

}
