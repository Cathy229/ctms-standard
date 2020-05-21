package com.sinotrans.oms.security.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.security.access.ResouceDataSource;
import com.sinotrans.framework.security.authentication.AcegiUserDetails;
import com.sinotrans.framework.security.authentication.AcegiUserDetailsService;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.security.service.SecurityManager;
import com.sinotrans.oms.system.model.EsUserModel;
import com.sinotrans.oms.test.model.BsfnFunctionsModel;

@Service
public class SecurityManagerImpl extends MybatisManagerImpl
		implements SecurityManager, AcegiUserDetailsService, ResouceDataSource {

	@Override
	public AcegiUserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		List<FilterCondition> filterCond = new ArrayList<FilterCondition>();
		filterCond.add(new FilterCondition("esusLoginName", username, "="));
		List<EsUserModel> users = this.myBatisDao.findByCondition(EsUserModel.class, null, null, filterCond);
		if (users.size() > 0) {
			EsUserModel user = users.get(0);
			AcegiUserDetails detail = new AcegiUserDetails();
			detail.setUsername(username);
			detail.setPassword(user.getEsusLoginPwd());
			detail.setUserId(String.valueOf(user.getEsusId()));
			detail.setEnabled("Y".equals(user.getEsusIsenable()));
//			List<FilterCondition> userFilterCond = new ArrayList<FilterCondition>();
//			userFilterCond.add(new FilterCondition("ruroBsurId", model.getBsurId(), "="));
			List<GrantedAuthority> grantedAuthority = new ArrayList<GrantedAuthority>();
//			List<RuroUserRolesModel> roles = this.myBatisDao.findByCondition(RuroUserRolesModel.class, null, null,
//					userFilterCond);
//			roles.forEach((RuroUserRolesModel userRole) -> {
//				grantedAuthority.add(new SimpleGrantedAuthority("ROLE_" + userRole.getRuroBsroId()));
				grantedAuthority.add(new SimpleGrantedAuthority("ROLE_111"));
//			});
			detail.setGrantedAuthority(grantedAuthority);
			return detail;
		} else {
			throw new UsernameNotFoundException("该用户不存在");
		}
	}

	@Override
	public List<String> getRolesByResource(String resource) {
		List<String> result = new ArrayList<String>();
		// 关闭权限验证
		boolean openLimit = false;
		if (!openLimit) {
			return result;
		}
		Map<String, Object> sqlCond = new HashMap<String, Object>();
		sqlCond.put("bsfnUrl", resource);
		List<Map<String, Object>> rows = this.myBatisDao.queryByCondition("FunctionsRolesQuery", sqlCond, null, null,
				null);
		for (Map<String, Object> row : rows) {
			result.add("ROLE_" + row.get("bsrfBsroId"));
		}
		// 没有分配功能点，如下逻辑为查询功能点，如果存在说明需要保护
		if (rows.size() == 0) {
			List<FilterCondition> filterCond = new ArrayList<FilterCondition>();
			filterCond.add(new FilterCondition("bsfnUrl", resource, "="));
			if (this.myBatisDao.existsByCondition(BsfnFunctionsModel.class, filterCond)) {
				result.add("ROLE_PROTECTED");
			}
		}
		return result;
	}

}
