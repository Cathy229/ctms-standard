package com.sinotrans.oms.contract.manager.impl;

import java.util.Collection;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.sinotrans.framework.mybatis.support.FilterCondition;
import com.sinotrans.framework.service.mybatis.base.impl.MybatisManagerImpl;
import com.sinotrans.oms.contract.manager.ElProtocolCostManager;
import com.sinotrans.oms.contract.model.ElProtocolCostModel;

/**
 * <p>Description: 协议明细表Manager </p>
 * @author Colley.Bai
 * @version 1.00
 * <pre>
 * 修改记录:
 * 修改后版本             修改人   	       修改日期           修改内容
 * 20181121              Colley.Bai       	                    创建
 * </pre>
 */
@Service
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class)
public class ElProtocolCostManagerImpl extends MybatisManagerImpl implements ElProtocolCostManager {

	@Override
	public ElProtocolCostModel get(Long id) {
		return this.myBatisDao.get(ElProtocolCostModel.class, id);
	}

	@Override
	public List<ElProtocolCostModel> findByCondition(List<FilterCondition> conditions) {
		return this.myBatisDao.findByCondition(ElProtocolCostModel.class, null, null, conditions);
	}

	@Override
	public ElProtocolCostModel save(ElProtocolCostModel model) {
		return this.myBatisDao.save(model);
	}

	@Override
	public List<ElProtocolCostModel> saveAll(List<ElProtocolCostModel> models) {
		return this.myBatisDao.saveAll(models);
	}

	@Override
	public void delete(ElProtocolCostModel model) {
		this.myBatisDao.delete(model);
	}

	@Override
	public void batchDelete(List<FilterCondition> conditions) {
		 this.myBatisDao.batchDelete(ElProtocolCostModel.class, conditions);
	}

	@Override
	public void deleteByPk(Long id) {
		this.myBatisDao.deleteByPk(ElProtocolCostModel.class, id);
	}

	@Override
	public void deleteByPks(Collection<Long> ids) {
		 this.myBatisDao.deleteByPks(ElProtocolCostModel.class, ids);
	}
}
