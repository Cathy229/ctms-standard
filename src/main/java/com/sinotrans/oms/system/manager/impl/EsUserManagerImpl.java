package com.sinotrans.oms.system.manager.impl;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.security.authentication.AcegiUserDetails;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.base.Response;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.customerproject.manager.EbProjectManager;
import com.sinotrans.oms.customerproject.model.EbProjectModel;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.system.dto.EsLoginSessionInfoQueryItem;
import com.sinotrans.oms.system.dto.EsProjectNameByUserIdQueryItem;
import com.sinotrans.oms.system.manager.EsUserManager;
import com.sinotrans.oms.system.model.EsUserModel;

@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EsUserManagerImpl extends MybatisManagerImpl implements EsUserManager {

	@Autowired
	private EbProjectManager ebProjectManager;
	
	@Override
	public EsUserModel get(Long id) {
		return this.myBatisDao.get(EsUserModel.class, id);
	}

	@Override
	public List<EsUserModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EsUserModel.class, null, null, conditions);
	}

	@Override
	public EsUserModel save(EsUserModel model) {
		return this.myBatisDao.save(model);
	}

	@Override
	public List<EsUserModel> saveAll(List<EsUserModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EsUserModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		this.myBatisDao.batchDelete(EsUserModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EsUserModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		this.myBatisDao.deleteByPks(EsUserModel.class, ids);
	}
	
	/**
	 * 根据用户信息精确定位用户无法登录的提示信息
	 * 
	 * @param userModel 用户信息
	 */
	public Response checkUserFail(AcegiUserDetails userDetails) {
		Response message = new Response();
		//如果用户只属于公司中的一个用户组且该公司状态为新增或停用，则提示“XXX用户所属公司未启用，不能登录！”
		Map<String, Object> conditions = new HashMap<String, Object>();
		conditions.put("esusId", Long.valueOf(userDetails.getUserId()));
		List<Map<String,Object>> results = this.myBatisDao.queryByCondition("com.sinotrans.oms.system.mapper.EsCompanyStatusEnableByUserIdQuery", conditions, null, null, null);
		if (EmptyUtils.isEmpty(results)) {
			message.setCode(userDetails.getUsername() + "用户所属公司未启用，不能登录!");
			message.setCode(Constants.NO);
			return message;
		}
		return message;
	}
	
	/*
	 * harley 20180730构造登录信息
	 */
	public UserDetails generateUserInfo(AcegiUserDetails userDetails) {
		// 通过用户ID取出用户所属公司名称，用户关联项目名称，项目ID
		Map<String, Object> conditions = new HashMap<String, Object>();
		conditions.put("esusId", Long.valueOf(userDetails.getUserId()));
		List<Map<String,Object>> results = this.myBatisDao.queryByCondition("com.sinotrans.oms.system.mapper.EsLoginSessionInfoQuery", conditions, null, null, null);
		// 将登录信息返回
		if (EmptyUtils.isNotEmpty(results)) {
			EsLoginSessionInfoQueryItem sessioonItem = (EsLoginSessionInfoQueryItem) BlukInsertUtils.parseMapToObject(results.get(0), new EsLoginSessionInfoQueryItem());
			UserDetails userDetail = setLoinUsertoSession(sessioonItem);
			//设置后台国际化信息
			userDetail.setLanguage(Constants.CHINA_LOCALE);
			return userDetail;
		}
		return null;
	}
	
	/**
	 * 将登录信息存到 session中
	 * 
	 * @param userModel
	 */
	private UserDetails setLoinUsertoSession(EsLoginSessionInfoQueryItem item) {
		// 构造一个userdetails
		UserDetails userDetail = new UserDetails();
		// 用户ID
		userDetail.setUserId(item.getEsusId() + "");
		// 用户名
		userDetail.setUsername(item.getEsusLoginName());
		// 用户中文名
		userDetail.setUserNameCn(item.getEsusUserNameCn());
		// 用户英文名
		userDetail.setUserNameEn(item.getEsusUserNameEn());
		// 用户所属部门
		userDetail.setUserDeptId(item.getEsusEsdeId() + "");
		// 用户默认模板
		userDetail.setUserTemplateId(item.getEsusTemplateId());
		// 用户邮箱
		userDetail.setUserEmail(item.getEsusEmail());
		// 当前公司ID
		userDetail.setOrgId(item.getEsusEscoId() + "");
		// 用户所属公司ID
		userDetail.setOwnOrgId(item.getEsusEscoId() + "");
		// 当前公司名称
		userDetail.setOrgName(item.getEscoCompanyNameCn());
		// 20101008当前公司英文名称
		userDetail.setOrgNameEn(item.getEscoCompanyNameEn());
		// 当前公司编码
		userDetail.setEscoCompanyNo(item.getEscoCompanyNo());
		// 用户默认基地ID
		userDetail.setEsusDefaultEsstId(item.getEsusDefaultEsstId() + "");
		//是否公司超级用户，0：不是；1：是（如果是，权限就会超越项目的限制）
//		userDetail.setEsusIsSuperuser(item.getEsusIsSuperuser());		
//		//如果是公司超级管理员，则为空；如果不是，则存放用户ID
//		if(!Constants.IS_SUPERUSER.equals(item.getEsusIsSuperuser())){
//			userDetail.setUserIdForNotSuper(String.valueOf(item.getEsusId()));
//		}
		// 通过用户ID查询默认项目信息并给session中赋值
		userDetail = this.queryProjectInfo(userDetail, item.getEsusId());
		userDetail=this.queryIsAdminUserGroup(userDetail, item.getEsusId());
		// 查询按钮权限
//		userDetail = this.getLoginButtons(userDetail, item);
		// 查询数据权限
//		Map dataPermissionMap = this.getLoginDataPermission(item);
		// 数据权限
//		userDetail.setDataPermissionMap(dataPermissionMap);
		return userDetail;
	}

	/**
	 * 通过用户ID查询项目信息
	 * 
	 * @param userId
	 * @return
	 */
	private UserDetails queryProjectInfo(UserDetails userDetail, Long userId) {
		Map<String, Object> conditions = new HashMap<String, Object>();
		conditions.put("esusId", Long.valueOf(userDetail.getUserId()));
		conditions.put("ebpjEscoId", Long.valueOf(userDetail.getOrgId()));
		List<Map<String, Object>> items = this.myBatisDao.queryByCondition(
				"com.sinotrans.oms.system.mapper.EsProjectNameByUserIdQuery", conditions, null, null, null);
		if (EmptyUtils.isNotEmpty(items)) {
			boolean flag = true;
			for (int i = 0; i < items.size(); i++) {
				EsProjectNameByUserIdQueryItem item = (EsProjectNameByUserIdQueryItem) BlukInsertUtils
						.parseMapToObject(items.get(i), new EsProjectNameByUserIdQueryItem());
				if (item.getEsusDefaultProjectId() != null) {
					// 登录用户所属项目ID
					userDetail.setOwnProjectId(item.getEsusDefaultProjectId() + "");
					// 项目ID
					userDetail.setProjectId(item.getEsusDefaultProjectId() + "");
					EbProjectModel projectModel = ebProjectManager.get(item.getEsusDefaultProjectId());
					// 项目名称
					userDetail.setProjectName(projectModel.getEbpjProjectName());
					// 项目英文名称
					userDetail.setProjectNameEn(projectModel.getEbpjProjectName());
					flag = false;
				}
			}
			if (flag) {
				EsProjectNameByUserIdQueryItem item = (EsProjectNameByUserIdQueryItem) BlukInsertUtils
						.parseMapToObject(items.get(0), new EsProjectNameByUserIdQueryItem());
				// 登录用户所属项目ID
				userDetail.setOwnProjectId(item.getEbpjId() + "");
				// 项目ID
				userDetail.setProjectId(item.getEbpjId() + "");
				// 项目名称
				userDetail.setProjectName(item.getEbpjProjectName());
				// 项目英文名称
				userDetail.setProjectNameEn(item.getEbpjProjectName());
			}
		} else {
			userDetail.setProjectId(null);// 项目ID
			userDetail.setProjectName(null);// 项目名称
		}
		return userDetail;
	}
	/**
	 * 通过用户ID查询出用户下是否有超级用户组
	 * @param userDetail session信息
	 * @param userId 用户ID
	 * @return
	 */
	private UserDetails queryIsAdminUserGroup(UserDetails userDetail, Long userId) {
		Map<String, Object> conditions = new HashMap<String, Object>();
		conditions.put("esusId", Long.valueOf(userDetail.getUserId()));
		List<Map<String, Object>> adminUserGroupItems = this.myBatisDao
				.queryByCondition("com.sinotrans.oms.system.mapper.EsExistsAdminUserGroupQuery", conditions, null, null, null);
		if (EmptyUtils.isNotEmpty(adminUserGroupItems)) {
			userDetail.setIsAdminUserGroup(true);
		} else {
			userDetail.setIsAdminUserGroup(false);
		}
		return userDetail;
	}

}
