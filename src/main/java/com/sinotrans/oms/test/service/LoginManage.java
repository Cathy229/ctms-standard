package com.sinotrans.oms.test.service;

import com.sinotrans.framework.service.mybatis.base.MybatisManager;

public interface LoginManage  extends MybatisManager{

	/**
	 * 登录的校验
	 * @param userName
	 * @param passWord
	 * @return
	 */
	public String checkUser(String userName, String passWord);
}