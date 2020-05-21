package com.sinotrans.oms.eoor.manager.impl;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.framework.service.mybatis.common.CommonQueryManager;
import com.sinotrans.framework.service.support.QueryData;
import com.sinotrans.framework.service.support.QueryInfo;
import com.sinotrans.oms.common.Constants;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.eoor.dto.EoorNoScheduleQueryItem;
import com.sinotrans.oms.eoor.manager.EoorManager;
import com.sinotrans.oms.eoor.model.EoOrderModel;
import com.sinotrans.oms.eoor.model.EoTaskModel;
import com.sinotrans.oms.eoor.service.EoorService;
import com.sinotrans.oms.eoorder.dto.EoFreightOmportStatusQueryItem;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.system.dto.EsLoginSessionInfoQueryItem;
import com.sinotrans.oms.system.dto.GetCompanyEscpByCodeQueryItem;

/**
 * <p>Title: 订单表</p>
 * <p>Description: 
 *    
 * </p>
 *<pre>
 * 修改记录:
 * 修改后版本            修改人       	 	修改日期   	      修改内容
 * 2018073101  Shoven Jiang 2018073101 	创建
 * 
 * 
 * </pre>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class EoorManagerImpl  extends MybatisManagerImpl implements EoorManager{
	
	
	@Autowired
	private CommonQueryManager commonQueryManager;
	@Override
	public EoOrderModel saveOrder(EoOrderModel eoOrdrModel) {
		
		return this.myBatisDao.save(eoOrdrModel);
	}


	@Override
	public EoOrderModel get(Integer id) {
		
		return this.myBatisDao.get(EoOrderModel.class, id);
	}

	@Override
	public List<EoOrderModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoOrderModel.class, null, null, conditions);
	}

	@Override
	public EoOrderModel save(EoOrderModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoOrderModel> saveAll(List<EoOrderModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoOrderModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoOrderModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Integer id) {
		this.myBatisDao.deleteByPk(EoOrderModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Integer> ids) {
		 this.myBatisDao.deleteByPks(EoOrderModel.class, ids);
	}

    //取消科学计数法 by Richard 2018年8月15日17:09:07
    private String CancelScientificCounting(){
    	double d =(long)(Math.random()*90000000 +10000000);
    	Double data = d;
    	if (data.toString().indexOf("E")> -1){
    		Double num = Double.parseDouble(data.toString());
    		String result = new BigDecimal(num.toString()).toString();
    		return result;
    	}
    	return data.toString();
    }
    

	/**
	 * 通过固定的查询条件来获取订单的查询结果
	 * @param conditionMap
	 * add by shoven 2018年8月8日14:33:21
	 * @return
	 */
	@Override
	public QueryData queryOrderByCondition(QueryInfo queryInfo) {
	  /*List<Map<String, Object>> eoOrderListMap = this.myBatisDao.queryByCondition("EoOrderListQuery", conditionMap, null, null, null);
		List<EoOrderListItem> eoOrderListItems = new ArrayList<EoOrderListItem>();
		ResponseData<List<EoOrderListItem>> responseData = new ResponseData<List<EoOrderListItem>>();
		if (EmptyUtils.isEmpty(eoOrderListMap)) {
			return (ResponseData<List<EoOrderListItem>>) eoOrderListItems;
		}
		for (@SuppressWarnings("rawtypes") Map map : eoOrderListMap) {
			eoOrderListItems.add((EoOrderListItem) BlukInsertUtils.parseMapToObject(map, new EoOrderListItem()));
		}*/
		queryInfo.setQueryType("com.sinotrans.oms.eoorder.mapper.EoOrderListNewQuery");
		return commonQueryManager.query(queryInfo);
	}
	@Override
	public QueryData queryOrderFeeByCondition(QueryInfo queryInfo) {
//		List<Map<String,Object>> results = this.myBatisDao.queryByCondition("com.sinotrans.oms.eoor.mapper.EsLoginSessionInfoQuery", null, null, null, null);
//		// 将登录信息返回
//		if (EmptyUtils.isNotEmpty(results)) {
//			EsLoginSessionInfoQueryItem sessioonItem = (EsLoginSessionInfoQueryItem) BlukInsertUtils.parseMapToObject(results.get(0), new EsLoginSessionInfoQueryItem());
//			UserDetails userDetail = setLoinUsertoSession(sessioonItem);
//		}
		queryInfo.setQueryType("com.sinotrans.oms.eoor.mapper.EtV4TaskPlanListQuery");
		return commonQueryManager.query(queryInfo);
//		List<Map<String, Object>> list = this.myBatisDao.queryByCondition("com.sinotrans.oms.eoor.mapper.EoorNoScheduleQuery", null, null, null, null);
//		List<EoorNoScheduleQueryitem> eoorNoScheduleQueryitems = new ArrayList<>();
//		if (EmptyUtils.isEmpty(list)) {
//            return eoorNoScheduleQueryitems;
//        } 
//		for (Map<String, Object> map : list) {
//			eoorNoScheduleQueryitems.add((EoorNoScheduleQueryitem) BlukInsertUtils.parseMapToObject(map, new EoorNoScheduleQueryitem()));
//        }
//		return eoorNoScheduleQueryitems;
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
//		userDetail.setUserTemplateId(item.getEsusTemplateId());
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
//		userDetail.setEsusDefaultEsstId(item.getEsusDefaultEsstId() + "");
		//是否公司超级用户，0：不是；1：是（如果是，权限就会超越项目的限制）
//		userDetail.setEsusIsSuperuser(item.getEsusIsSuperuser());		
		//如果是公司超级管理员，则为空；如果不是，则存放用户ID
//		if(!Constants.IS_SUPERUSER.equals(item.getEsusIsSuperuser())){
//			userDetail.setUserIdForNotSuper(String.valueOf(item.getEsusId()));
//		}
		// 通过用户ID查询默认项目信息并给session中赋值
//		userDetail = this.queryProjectInfo(userDetail, item.getEsusId());
//		userDetail=this.queryIsAdminUserGroup(userDetail, item.getEsusId());
		// 查询按钮权限
//		userDetail = this.getLoginButtons(userDetail, item);
		// 查询数据权限
//		Map dataPermissionMap = this.getLoginDataPermission(item);
		// 数据权限
//		userDetail.setDataPermissionMap(dataPermissionMap);
		return userDetail;
	}


	@Override
	public QueryData querySchedulOrdeCondition(QueryInfo queryInfo) {
		queryInfo.setQueryType("com.sinotrans.oms.eoor.mapper.EoorScheduleQuery");
		return commonQueryManager.query(queryInfo);
	}


	@Override
	public QueryData queryEotaInfoCondition(QueryInfo queryInfo) {
		queryInfo.setQueryType("com.sinotrans.oms.eoor.mapper.EotaInfoQuery");
		return commonQueryManager.query(queryInfo);
	}


	@Override
	public EoTaskModel getEotaModel(Integer eotaId) {
		Map<String, Object> condition = new HashMap<String, Object>();
		condition.put("eotaId", eotaId);
		List<Map<String, Object>> list = this.myBatisDao.queryByCondition("com.sinotrans.oms.system.mapper.GetCompanyEscpByCodeQuery", condition, null, null, null);
		List<GetCompanyEscpByCodeQueryItem> companyEscpByCodeQueryList = new ArrayList<>();
		if (EmptyUtils.isEmpty(list)) {
			return null;
		}
		for (@SuppressWarnings("rawtypes") Map map : list) {
			companyEscpByCodeQueryList.add((GetCompanyEscpByCodeQueryItem) BlukInsertUtils.parseMapToObject(map, new GetCompanyEscpByCodeQueryItem()));
		}
//		return companyEscpByCodeQueryList.get(0).getEscpValue();
		return null;
	}

	
	
	

}
