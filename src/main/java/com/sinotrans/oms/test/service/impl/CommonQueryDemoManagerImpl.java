package com.sinotrans.oms.test.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.orm.support.PagingInfo;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryField;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.test.service.CommonQueryDemoManager;

@Service
public class CommonQueryDemoManagerImpl extends MybatisManagerImpl implements CommonQueryDemoManager {

	@Autowired
	private CommonQueryManager commonQueryManager;

	// sql select * from FJ_USER t where 1=1 and t.fjur_username like '%a%'
	public QueryData testQueryModel() {
		QueryInfo queryInfo = new QueryInfo();
		queryInfo.setQueryType("FjUserModel");
		QueryField queryField = new QueryField();
		queryField.setFieldName("fjurUsername");
		queryField.setFieldValue("a");
		queryField.setOperator("likeAnywhere");
		List<QueryField> qfList = new ArrayList<QueryField>();
		qfList.add(queryField);
		queryInfo.setQueryFields(qfList);
//		PagingInfo pagingInfo = new PagingInfo();
//		pagingInfo.setPageSize(3);
//		pagingInfo.setCurrentPage(1);
//		queryInfo.setPagingInfo(pagingInfo);
		QueryData qd = commonQueryManager.query(queryInfo);
		return qd;
	}

	// sql select * from FJ_USER a where 1=1 and a.fjur_status > 0 and
	// a.fjur_fjog_id like '%2%' and a.fjur_username like '%a%'
	public QueryData testModelQuerySqlCond() {
		QueryInfo queryInfo = new QueryInfo();
		queryInfo.setQueryType("TestFjUserQuery");
		QueryField queryField1 = new QueryField();
		QueryField queryField2 = new QueryField();
		QueryField queryField3 = new QueryField();
		queryField1.setFieldName("CDT_fjurStatus");
		queryField1.setFieldValue("0");
		queryField2.setFieldName("CDT_fjurFjogId");
		queryField2.setFieldValue("2");
		queryField3.setFieldName("CDT_fjurUsername");
		queryField3.setFieldValue("a");
		List<QueryField> qfList = new ArrayList<QueryField>();
		qfList.add(queryField1);
		qfList.add(queryField2);
		qfList.add(queryField3);
		queryInfo.setQueryFields(qfList);
		PagingInfo pagingInfo = new PagingInfo();
		pagingInfo.setPageSize(2);
		pagingInfo.setCurrentPage(1);
		queryInfo.setPagingInfo(pagingInfo);
		QueryData qd = commonQueryManager.query(queryInfo);
		return qd;
	}

	// sql select * from FJ_USER a where 1=1 and a.fjur_status > 0 and
	// a.fjur_username like '%a%'
	public QueryData testModelQueryFilterCond() {
		QueryInfo queryInfo = new QueryInfo();
		queryInfo.setQueryType("TestFjUserQuery");
		QueryField queryField1 = new QueryField();
		QueryField queryField2 = new QueryField();
		queryField1.setFieldName("fjurStatus");
		queryField1.setFieldValue("0");
		queryField1.setOperator(">");
		queryField2.setFieldName("fjurUsername");
		queryField2.setFieldValue("a");
		queryField2.setOperator("likeAnywhere");
		List<QueryField> qfList = new ArrayList<QueryField>();
		qfList.add(queryField1);
		qfList.add(queryField2);
		queryInfo.setQueryFields(qfList);
		PagingInfo pagingInfo = new PagingInfo();
		pagingInfo.setPageSize(3);
		pagingInfo.setCurrentPage(1);
		queryInfo.setPagingInfo(pagingInfo);
		return commonQueryManager.query(queryInfo);
	}

	// sql select a.* from FJ_WORKLOG a,FJ_WORKLEVEL b, FJ_WORKTYPE c where 1=1 and
	// a.work_level = b.id and a.worktype_id = c.id and a.work_level = '2'
	public QueryData testTablesQuerySqlCond() {
		QueryInfo queryInfo = new QueryInfo();
		queryInfo.setQueryType("TestTablesQuery");
		QueryField queryField = new QueryField();
		queryField.setFieldName("CDT_workLevel");
		queryField.setFieldValue("2");
		List<QueryField> qfList = new ArrayList<QueryField>();
		qfList.add(queryField);
		queryInfo.setQueryFields(qfList);
		PagingInfo pagingInfo = new PagingInfo();
		pagingInfo.setPageSize(2);
		pagingInfo.setCurrentPage(1);
		queryInfo.setPagingInfo(pagingInfo);
		return commonQueryManager.query(queryInfo);

	}

	// sql select a.* from FJ_WORKLOG a,FJ_WORKLEVEL b, FJ_WORKTYPE c where 1=1 and
	// a.work_level = b.id and a.worktype_id = c.id and a.content like '%test%'
	public QueryData testTablesQueryFilterCond() {
		QueryInfo queryInfo = new QueryInfo();
		queryInfo.setQueryType("TestTablesQuery");
		QueryField queryField = new QueryField();
		queryField.setFieldName("content");
		queryField.setFieldValue("test");
		queryField.setOperator("likeAnywhere");
		List<QueryField> qfList = new ArrayList<QueryField>();
		qfList.add(queryField);
		queryInfo.setQueryFields(qfList);
		PagingInfo pagingInfo = new PagingInfo();
		pagingInfo.setPageSize(2);
		pagingInfo.setCurrentPage(1);
		queryInfo.setPagingInfo(pagingInfo);
		return commonQueryManager.query(queryInfo);
	}

	// sql SELECT * FROM FJ_WORKLEVEL t WHERE t.id in( SELECT a.work_level FROM
	// FJ_WORKLOG a WHERE a.WORK_LEVEL < '4' )
	public QueryData testFieldCodeTypesModel() {
		QueryInfo queryInfo = new QueryInfo();
		queryInfo.setQueryType("FjWorklogModel");
		QueryField queryField = new QueryField();
		queryField.setFieldName("workLevel");
		queryField.setFieldValue("4");
		queryField.setOperator("<");
		List<QueryField> qfList = new ArrayList<QueryField>();
		qfList.add(queryField);
		queryInfo.setQueryFields(qfList);
		PagingInfo pagingInfo = new PagingInfo();
		pagingInfo.setPageSize(3);
		pagingInfo.setCurrentPage(1);
		queryInfo.setPagingInfo(pagingInfo);
		Map<String, String> fieldCodeTypes = new HashMap<String, String>();
		fieldCodeTypes.put("workLevel", "WORKLEVELS");
		queryInfo.setFieldCodeTypes(fieldCodeTypes);
		return commonQueryManager.query(queryInfo);
	}

	// sql SELECT * FROM FJ_WORKLEVEL t WHERE t.id in( SELECT a.work_level FROM
	// FJ_WORKLOG a WHERE a.WORK_LEVEL < '4' )
	public QueryData testFieldCodeTypesForENModel() {
		Locale locale = new Locale("en");
		LocaleContextHolder.setLocale(locale);
		QueryInfo queryInfo = new QueryInfo();
		queryInfo.setQueryType("FjWorklogModel");
		QueryField queryField = new QueryField();
		queryField.setFieldName("workLevel");
		queryField.setFieldValue("4");
		queryField.setOperator("<");
		List<QueryField> qfList = new ArrayList<QueryField>();
		qfList.add(queryField);
		queryInfo.setQueryFields(qfList);
		PagingInfo pagingInfo = new PagingInfo();
		pagingInfo.setPageSize(3);
		pagingInfo.setCurrentPage(1);
		queryInfo.setPagingInfo(pagingInfo);
		Map<String, String> fieldCodeTypes = new HashMap<String, String>();
		fieldCodeTypes.put("workLevel", "WORKLEVELS");
		queryInfo.setFieldCodeTypes(fieldCodeTypes);
		return commonQueryManager.query(queryInfo);
	}

}
