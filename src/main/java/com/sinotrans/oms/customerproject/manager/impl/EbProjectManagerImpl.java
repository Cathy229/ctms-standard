package com.sinotrans.oms.customerproject.manager.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.customerproject.dto.EbProjectByCompanyQueryItem;
import com.sinotrans.oms.customerproject.manager.EbProjectManager;
import com.sinotrans.oms.customerproject.model.EbProjectModel;
import com.sinotrans.oms.eoorder.model.EoConsignmentMaterielModel;
import com.sinotrans.oms.security.util.SessionContext;
import com.sinotrans.oms.security.util.UserDetails;
import com.sinotrans.oms.system.dto.EsProjectNameByUserIdQueryItem;

/**
 * <p>Title: 项目表</p>
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
public class EbProjectManagerImpl extends MybatisManagerImpl implements EbProjectManager{

	@Override
	public EbProjectModel get(Long id) {
		
		return this.myBatisDao.get(EbProjectModel.class, id);
	}

	@Override
	public List<EbProjectModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EbProjectModel.class, null, null, conditions);
	}

	@Override
	public EbProjectModel save(EbProjectModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EbProjectModel> saveAll(List<EbProjectModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EbProjectModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EbProjectModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EbProjectModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EbProjectModel.class, ids);
	}
	
	@Override
	public List getCurrentProject() {
		List ebpjList = new ArrayList<>();
		// 获取当前用户
		UserDetails user = SessionContext.getUser();
		//20101015 CHEM-996 如果是超级用户组,则根据公司查询公司下的可用项目
		if(user.getIsAdminUserGroup()){
			Map<String, Object> conditions = new HashMap<String, Object>();
			conditions.put("ebpjEscoId", Long.valueOf(user.getOrgId()));
			
			List<Map<String, Object>> ebProjectByCompanyQueryList = this.myBatisDao.queryByCondition("com.sinotrans.oms.customerproject.mapper.EbProjectByCompanyQuery", conditions, null, null, null);
			if (EmptyUtils.isEmpty(ebProjectByCompanyQueryList)) {
	            return ebpjList;
	        }
			for (Map<String, Object> map : ebProjectByCompanyQueryList) {
				ebpjList.add((EbProjectByCompanyQueryItem) BlukInsertUtils.parseMapToObject(map, new EbProjectByCompanyQueryItem()));
	        }
		}else{
			Long userId = Long.valueOf(user.getUserId());
			Map<String, Object> conditions = new HashMap<String, Object>();
			conditions.put("esusId", userId);
			//userCondition.setEbpjEscoId(Long.valueOf(user.getOrgId()));
			conditions.put("ebpjEscoId", Long.valueOf(user.getOrgId()));
			
			List<Map<String, Object>> esProjectNameByUserIdQueryList = this.myBatisDao.queryByCondition("com.sinotrans.oms.customerproject.mapper.EsProjectNameByUserIdQuery", conditions, null, null, null);
			if (EmptyUtils.isEmpty(esProjectNameByUserIdQueryList)) {
				return ebpjList;
			} 
			for (Map<String, Object> map : esProjectNameByUserIdQueryList) {
				ebpjList.add((EsProjectNameByUserIdQueryItem) BlukInsertUtils.parseMapToObject(map, new EsProjectNameByUserIdQueryItem()));
			}
		}
		return ebpjList;
	}
	
	
}
