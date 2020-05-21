package com.sinotrans.oms.test.service;

import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.framework.service.support.QueryData;

public interface CommonQueryDemoManager extends MybatisManager {

	public QueryData testQueryModel();

	public QueryData testModelQuerySqlCond();

	public QueryData testModelQueryFilterCond();

	public QueryData testTablesQuerySqlCond();

	public QueryData testTablesQueryFilterCond();

	public QueryData testFieldCodeTypesModel();

	public QueryData testFieldCodeTypesForENModel();

}
