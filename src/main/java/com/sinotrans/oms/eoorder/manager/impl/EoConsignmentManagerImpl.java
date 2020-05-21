package com.sinotrans.oms.eoorder.manager.impl;

import java.util.ArrayList;
import java.util.Collection;
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
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.eoorder.manager.EoConsignmentManager;
import com.sinotrans.oms.eoorder.model.EoConsignmentMaterielModel;
import com.sinotrans.oms.eoorder.model.EoConsignmentModel;
/**
 * <p>Title: 订单委托表</p>
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
public class EoConsignmentManagerImpl extends MybatisManagerImpl implements EoConsignmentManager{
	
	@Autowired
	private CommonQueryManager commonQueryManager;

	@Override
	public EoConsignmentModel get(Long id) {
		
		return this.myBatisDao.get(EoConsignmentModel.class, id);
	}

	@Override
	public List<EoConsignmentModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(EoConsignmentModel.class, null, null, conditions);
	}

	@Override
	public EoConsignmentModel save(EoConsignmentModel model) {
		 return this.myBatisDao.save(model);
	}

	@Override
	public List<EoConsignmentModel> saveAll(List<EoConsignmentModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(EoConsignmentModel model) {
		this.myBatisDao.delete(model);
		
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(EoConsignmentModel.class, conditions);
		
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(EoConsignmentModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(EoConsignmentModel.class, ids);
	}

	
	/**
	 * @author shoven
	 * @return eoConsignmentAcceptDtosList/查询委托订单头信息
	 * 2017年12月4日12:42:03
	 */
	public List<EoConsignmentModel> findEoConsignmentListByCondition(Map<String, Object> condition) {
		//this.myBatisDao.storedProcedure(arg0)
		List<Map<String, Object>> list = this.myBatisDao.queryByCondition("EoConsignmentAcceptQuery", condition, null, null, null);
		List<EoConsignmentModel> eoConsignmentAcceptDtosList = new ArrayList<EoConsignmentModel>();
		if (EmptyUtils.isEmpty(list)) {
			return eoConsignmentAcceptDtosList;
		}
		for (@SuppressWarnings("rawtypes") Map map : list) {
			eoConsignmentAcceptDtosList.add((EoConsignmentModel) BlukInsertUtils.parseMapToObject(map, new EoConsignmentModel()));
		}
		return eoConsignmentAcceptDtosList;
	}

	/**
	 * @author shoven
	 * @param condition
	 * @return List<EoConsignmentMaterielDto>
	 * 查询物料信息
	 */
	@Override
	public List<EoConsignmentMaterielModel> findEoConsignmentMaterielListByCondition(Map<String, Object> condition) {
		List<Map<String, Object>> list = this.myBatisDao.queryByCondition("eoConsignmentMaterielQuery", condition, null, null, null);
		List<EoConsignmentMaterielModel> eocmList = new ArrayList<EoConsignmentMaterielModel>();
		if (EmptyUtils.isEmpty(list)) {
            return eocmList;
        } 
		for (Map<String, Object> map : list) {
			eocmList.add((EoConsignmentMaterielModel) BlukInsertUtils.parseMapToObject(map, new EoConsignmentMaterielModel()));
        }
        return eocmList;
	}

	@Override
	public QueryData queryConsignmentByCondition(QueryInfo queryInfo) {
		queryInfo.setQueryType("com.sinotrans.oms.eoorder.mapper.EoConsignmentListQuery");
		return commonQueryManager.query(queryInfo);
	}

	

}
