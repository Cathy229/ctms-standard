package com.sinotrans.oms.contract.manager.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.common.util.BlukInsertUtils;
import com.sinotrans.oms.common.util.EmptyUtils;
import com.sinotrans.oms.contract.manager.ElProtocolCostConManager;
import com.sinotrans.oms.contract.model.ElProtocolCostConModel;

/**
 * <p>Description: 协议条件分类Manager </p>
 * @author Colley.Bai
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 20181120              Colley.Bai       	                    创建
 * </pre>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class ElProtocolCostConManagerImpl extends MybatisManagerImpl implements ElProtocolCostConManager {

	@Override
	public ElProtocolCostConModel get(Long id) {
		return this.myBatisDao.get(ElProtocolCostConModel.class, id);
	}

	@Override
	public List<ElProtocolCostConModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(ElProtocolCostConModel.class, null, null, conditions);
	}

	@Override
	public ElProtocolCostConModel save(ElProtocolCostConModel model) {
		return this.myBatisDao.save(model);
	}

	@Override
	public List<ElProtocolCostConModel> saveAll(List<ElProtocolCostConModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(ElProtocolCostConModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(ElProtocolCostConModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(ElProtocolCostConModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(ElProtocolCostConModel.class, ids);
	}
	
	@Override
	public List<ElProtocolCostConModel> queryByCondition(Map<String, Object> condition) {
		List<Map<String, Object>> queryList = this.myBatisDao.queryByCondition("ElProtocolCostAndConQuery", condition, null, null, null);
		List<ElProtocolCostConModel> elProtocolCostConModelList = new ArrayList<>();
		if (EmptyUtils.isEmpty(queryList)) {
			return elProtocolCostConModelList;
		}
		for (@SuppressWarnings("rawtypes") Map map : queryList) {
			elProtocolCostConModelList.add((ElProtocolCostConModel) BlukInsertUtils.parseMapToObject(map, new ElProtocolCostConModel()));
		}
		return elProtocolCostConModelList;
	}
}
