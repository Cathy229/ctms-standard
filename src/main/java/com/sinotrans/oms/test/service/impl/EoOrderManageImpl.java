package com.sinotrans.oms.test.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryField;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.test.service.EoOrderManage;
@Service
public class EoOrderManageImpl extends MybatisManagerImpl implements EoOrderManage  {

	@Autowired
	private CommonQueryManager commonQueryManager;
	
	@Override
	public QueryData getEoorderList(Long eoorId) {
		QueryInfo queryInfo = new QueryInfo();
		queryInfo.setQueryType("EoOrderModel");//通过model查询
		QueryField queryField = new QueryField();
		queryField.setFieldName("eoorEbpjName");
		queryField.setFieldValue("姜孝伟");
		queryField.setOperator("likeAnywhere");
		List<QueryField> qfList = new ArrayList<QueryField>();
		qfList.add(queryField);
		queryInfo.setQueryFields(qfList);
		QueryData qd = commonQueryManager.query(queryInfo);
		
		return qd;
	}

}
