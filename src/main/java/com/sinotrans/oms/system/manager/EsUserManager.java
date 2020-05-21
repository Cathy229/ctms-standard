package com.sinotrans.oms.system.manager;

import java.util.Collection;
import java.util.List;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.security.authentication.AcegiUserDetails;
import com.sinotrans.framework.service.mybatis.base.MybatisManager;
import com.sinotrans.oms.common.base.Response;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.system.model.EsUserModel;

public interface EsUserManager extends MybatisManager {
	
	EsUserModel get(Long id);

	List<EsUserModel> findByCondition(List<FilterCondition> conditions);

	EsUserModel save(EsUserModel model);

	List<EsUserModel> saveAll(List<EsUserModel> models);

	void delete(EsUserModel model);

	void batchDelete(List<FilterCondition> conditions);

	void deleteByPk(Long id);

	void deleteByPks(Collection<Long> ids);
	/**
	 * 根据用户信息精确定位用户无法登录的提示信息
	 * harley 20180731
	 * @param userModel 用户信息
	 */
	public Response checkUserFail(AcegiUserDetails userDetails);
	/**
	 * harley 20180730构造登录信息
	 */
	public UserDetails generateUserInfo(AcegiUserDetails userDetails);
}
