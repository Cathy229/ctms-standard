package com.sinotrans.oms.test.service;


import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.framework.service.support.QueryData;

public interface EoOrderManage extends MybatisManager{

	public QueryData getEoorderList(Long eoorId);
}
