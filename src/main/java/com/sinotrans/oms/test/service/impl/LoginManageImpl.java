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
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.test.model.EsUserModel;
import com.sinotrans.oms.test.service.LoginManage;

@Service
public class LoginManageImpl  extends MybatisManagerImpl implements LoginManage  {

	@Autowired
	private CommonQueryManager commonQueryManager;

	/**
	 * 用来校验登录
	 */
	@Override
	public String checkUser(String userName, String passWord) {
		String msg = "";//用来收集登录的校验信息
		if (EmptyUtils.isEmpty(userName)) {
			msg = "用户名不能为空\n";
		}
		if (EmptyUtils.isEmpty(passWord)) {
			msg = msg + "密码不能为空";
		}
		if (EmptyUtils.isNotEmpty(msg)) {
			return msg;
		}
		List<EsUserModel> esUserModelList = getEsusModelsByLoginName(userName);
		//get();
		return "登录成功----";
	}
	
	/**
	 * 登录的时候根据用户名密码做校验
	 * @param userName
	 * @param passWord
	 * @return
	 */
	public String checkUserByLogin(String userName, String passWord) {
		String msg = "";//用来收集用户名和密码的校验
		List<EsUserModel> esUserModelList = this.getEsusModelsByLoginName(userName);
		if (EmptyUtils.isNotEmpty(esUserModelList)) {
			EsUserModel esUserModel = esUserModelList.get(0);
			}
		return msg;
	}

	
	/**
	 * 通过前台传进来的登录名去数据库查询结果
	 * @param userName
	 * @return
	 */
	public List<EsUserModel> getEsusModelsByLoginName(String userName) {
		//执行对model的查询
		QueryInfo queryInfo = new QueryInfo();
		queryInfo.setQueryType("EsUserModel");
		QueryField queryField = new QueryField();
		queryField.setFieldName("esusLoginName");
		queryField.setFieldValue(userName);
		queryField.setOperator("=");
		List<QueryField> qfList = new ArrayList<QueryField>();
		qfList.add(queryField);
		queryInfo.setQueryFields(qfList);
		QueryData queryData = commonQueryManager.query(queryInfo);
		List<EsUserModel> esUserModelList = (List<EsUserModel>) queryData.getDataList();
		
		
		return esUserModelList;
	}
}

